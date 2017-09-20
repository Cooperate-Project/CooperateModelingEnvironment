package de.cooperateproject.ui.nature;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.apache.commons.io.input.ReaderInputStream;
import org.apache.commons.io.output.WriterOutputStream;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.common.commit.CDOCommitInfo;
import org.eclipse.emf.cdo.common.lob.CDOClob;
import org.eclipse.emf.cdo.eresource.CDOResourceFolder;
import org.eclipse.emf.cdo.eresource.CDOResourceNode;
import org.eclipse.emf.cdo.eresource.CDOTextResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.ConcurrentAccessException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.EcoreUtil.ProxyCrossReferencer;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.cooperateproject.cdo.util.resources.CDOResourceHandler;
import de.cooperateproject.ui.wizards.reset.ResetRepositoryWizard;

public class ResetToPreviousStateCommand extends AbstractHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResetToPreviousStateCommand.class);
    protected static final String DEFAULT_CHARSET_NAME = "UTF-8";

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        Optional<IProject> project = getSelectedProject();
        if (project.isPresent()) {
            WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    new ResetRepositoryWizard(project.get()));
            dialog.open();
        } else if (getSelectedDiagram().isPresent()) {
            IFile file = getSelectedDiagram().get();
            WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    new ResetRepositoryWizard(file));
            dialog.open();
        }
        return null;
    }

    public static boolean resetProject(CDOSession session, CDOCommitInfo commit, IProject project) {
        // open view/transaction
        CDOView resetView = session.openView(commit.getTimeStamp());
        CDOTransaction trans = session.openTransaction();
        ResourceSet oldRS = resetView.getResourceSet();
        ResourceSet newRS = trans.getResourceSet();
        oldRS.setResourceFactoryRegistry(CDOResourceHandler.createFactoryWrapper(oldRS.getResourceFactoryRegistry()));
        newRS.setResourceFactoryRegistry(CDOResourceHandler.createFactoryWrapper(newRS.getResourceFactoryRegistry()));

        // get project folder and copy contents and delete old folder
        EcoreUtil.delete(trans.getResourceFolder(project.getName()));
        CDOResourceFolder resourceNew = trans.createResourceFolder(project.getName());

        CDOResourceFolder resourceReset = resetView.getResourceFolder(project.getName());
        HashMap<EObject, Copier> newObjects = new HashMap<>();
        for (CDOResourceNode node : resourceReset.getNodes()) {
            // TODO cast to cdo resource
            // TODO getcontents + copier pro root-object
            Copier copier = new Copier();
            newObjects.put(copier.copy(node), copier);
            // TODO verschieben in neue ordnerstruktur
        }

        // move contents to new folder and replace references in trace with new objects
        resourceNew.getNodes().addAll((Collection<? extends CDOResourceNode>) newObjects.keySet());
        XMIResource resource = new XMIResourceImpl();
        for (CDOResourceNode traceFile : resourceNew.getNodes()) {
            if (traceFile.getName().endsWith(".tcdor.txt")) {
                CDOTextResource textRes = (CDOTextResource) traceFile;
                textRes.setEncoding(DEFAULT_CHARSET_NAME);
                try {
                    try (ReaderInputStream ris = new ReaderInputStream(textRes.getContents().getContents(),
                            DEFAULT_CHARSET_NAME)) {
                        resource.load(ris, new HashMap<>());
                        EcoreUtil.resolveAll(resource);
                        Map<EObject, Collection<Setting>> relevantObjects = ProxyCrossReferencer.find(resource);
                        for (Entry<EObject, Collection<Setting>> proxy : relevantObjects.entrySet()) {
                            String filename = EcoreUtil.getURI(proxy.getKey()).toString().substring(0,
                                    EcoreUtil.getURI(proxy.getKey()).toString().indexOf("#"));
                            for (Copier copier : newObjects.values()) {
                                for (EObject key : copier.keySet()) {
                                    if (key.toString().contains(filename)) {
                                        proxy.getValue().forEach(entry -> entry.getEObject()
                                                .eSet(entry.getEStructuralFeature(), copier.get(key)));
                                    }
                                }
                            }
                        }
                    } catch (IOException e) {
                    }
                    StringWriter writer = new StringWriter();
                    try (WriterOutputStream wos = new WriterOutputStream(writer, DEFAULT_CHARSET_NAME)) {
                        resource.save(wos, new HashMap<>());
                        EcoreUtil.resolveAll(resource);
                        try (StringReader reader = new StringReader(writer.getBuffer().toString())) {
                            CDOClob clob = new CDOClob(reader);
                            textRes.setContents(clob);
                        }
                    }
                } catch (IOException e) {
                    LOGGER.error("Could not access " + traceFile.getName() + ".", e);
                }
            }
        }

        // commit changes
        try {
            DateFormat df = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
            trans.setCommitComment("Reset to previous commit (" + df.format(new Date(commit.getTimeStamp())) + ") by "
                    + System.getProperty("user.name") + ".");
            trans.commit();
            project.build(IncrementalProjectBuilder.CLEAN_BUILD, new NullProgressMonitor());
            return true;
        } catch (ConcurrentAccessException e) {
            LOGGER.error("Could not reset repository.", e);
        } catch (CommitException e) {
            LOGGER.error("Could not reset repository.", e);
        } catch (CoreException e) {
            LOGGER.error("Could not refresh workspace. Please refresh manually.", e);
        }
        return false;
    }

    private static Optional<IProject> getSelectedProject() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IProject project = null;
        if (window != null) {
            IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
            if (selection.size() == 1 && selection.toList().get(0) instanceof IProject) {
                project = (IProject) selection.toList().get(0);
            }
        }
        return Optional.ofNullable(project);
    }

    private static Optional<IFile> getSelectedDiagram() {
        IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IFile file = null;
        if (window != null) {
            IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
            if (selection.size() == 1 && selection.toList().get(0) instanceof IFile) {
                file = (IFile) selection.toList().get(0);
            }
        }
        return Optional.ofNullable(file);
    }
}
