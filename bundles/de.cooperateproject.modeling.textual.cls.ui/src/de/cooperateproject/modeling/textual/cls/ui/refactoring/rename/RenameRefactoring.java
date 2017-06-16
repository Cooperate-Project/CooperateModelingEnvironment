package de.cooperateproject.modeling.textual.cls.ui.refactoring.rename;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.RefactoringStatusContext;
import org.eclipse.ui.IEditorPart;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.StringExpression;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;
import de.cooperateproject.modeling.textual.xtext.runtime.editor.IReloadingEditor;

public class RenameRefactoring extends Refactoring {

    private static class ConditionCheckFailed extends Exception {

        private static final long serialVersionUID = 3577225951304039918L;
        private final RefactoringStatusContext context;

        public ConditionCheckFailed(String message) {
            this(message, null);
        }

        public ConditionCheckFailed(String message, EObject element) {
            super(message);
            if (element != null) {
                context = new RefactoringStatusContext() {
                    @Override
                    public Object getCorrespondingElement() {
                        return element;
                    }
                };
            } else {
                context = null;
            }
        }

        public RefactoringStatusContext getContext() {
            return context;
        }
    }

    private UMLReferencingElement<NamedElement> elementToRename;
    private String newName;
    private IEditorPart editor;

    public void setElementToRename(UMLReferencingElement<NamedElement> elementToRename) {
        this.elementToRename = elementToRename;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void setEditor(IEditorPart editor) {
        this.editor = editor;
    }

    protected UMLReferencingElement<NamedElement> getElementToRename() {
        return elementToRename;
    }

    protected String getNewName() {
        return newName;
    }

    protected IEditorPart getEditor() {
        return editor;
    }

    @Override
    public String getName() {
        return "Rename UML element";
    }

    @Override
    public RefactoringStatus checkInitialConditions(IProgressMonitor pm) throws CoreException {
        try {
            pm.beginTask("Check initial conditions.", 0);
            return new RefactoringStatus();
        } finally {
            pm.done();
        }
    }

    private static Collection<String> determineUnqualifiedNames(NamedElement namedElement) {
        Collection<String> names = new HashSet<>();
        names.add(namedElement.getName());
        Optional.ofNullable(namedElement.getNameExpression()).map(StringExpression::getName).ifPresent(names::add);
        names.remove(null);
        return names;
    }

    @Override
    public RefactoringStatus checkFinalConditions(IProgressMonitor pm) throws CoreException {
        RefactoringStatus status = new RefactoringStatus();

        try {
            pm.beginTask("Check final conditions.", 0);

            if (getEditor().getAdapter(IReloadingEditor.class) == null) {
                throw new ConditionCheckFailed(
                        String.format("The editor has to be of type %s.", IReloadingEditor.class));
            }

            if (getEditor().isDirty()) {
                throw new ConditionCheckFailed("The editor contents have to be saved before applying the refactoring.");
            }

            NamedElement umlElement = getElementToRename().getReferencedElement();
            if (umlElement == null) {
                throw new ConditionCheckFailed("No UML element associated with element to rename.",
                        getElementToRename());
            }

            if (Optional.ofNullable(getNewName()).map(n -> n.equals(umlElement.getName())).orElse(true)) {
                throw new ConditionCheckFailed(String.format("The new name %s is not valid.", getNewName()));
            }

            Package umlParentPackage = umlElement.getNearestPackage();
            if (umlParentPackage == umlElement) {
                umlParentPackage.getNestingPackage();
            }

            if (Optional.ofNullable(umlParentPackage)
                    .map(p -> p.getMembers().stream().map(RenameRefactoring::determineUnqualifiedNames)
                            .flatMap(Collection::stream).anyMatch(getNewName()::equals))
                    .orElse(false)) {
                throw new ConditionCheckFailed(String.format("There is already an element with name %s.", getNewName()),
                        umlParentPackage);
            }

        } catch (ConditionCheckFailed e) {
            status.addFatalError(e.getMessage(), e.getContext());
        } catch (Exception e) {
            String stackTrace;
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try {
                PrintWriter pw = new PrintWriter(baos);
                try {
                    e.printStackTrace(pw);
                    stackTrace = baos.toString();
                } finally {
                    IOUtils.closeQuietly(pw);
                }
            } finally {
                IOUtils.closeQuietly(baos);
            }
            status.addFatalError(
                    String.format("Exception in checking the initial conditions: %s%n%s", e.getMessage(), stackTrace));
        } finally {
            pm.done();
        }

        return status;
    }

    @Override
    public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
        try {
            pm.beginTask("Generate change.", 1);
            return new CompositeChange("Rename Refactoring",
                    new Change[] { new DerivedStateCleanerChange(getEditor().getAdapter(IReloadingEditor.class)),
                            new UMLElementRenameChange(getElementToRename().getReferencedElement(), getNewName()),
                            new EditorReloadingChange(getEditor().getAdapter(IReloadingEditor.class)),
                            new SaveEditorChange(getEditor()) });
        } finally {
            pm.done();
        }
    }

}
