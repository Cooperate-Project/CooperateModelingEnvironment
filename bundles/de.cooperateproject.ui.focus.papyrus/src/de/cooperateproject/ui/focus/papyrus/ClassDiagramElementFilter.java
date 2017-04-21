package de.cooperateproject.ui.focus.papyrus;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.Property;

import de.cooperateproject.modeling.common.types.DiagramTypes;
import de.cooperateproject.ui.focus.filter.IElementFilterWithSubject;

public class ClassDiagramElementFilter implements IElementFilterWithSubject {

    private static final Collection<Class<? extends Element>> SUPPORTED_CLASSES = createSupportedClasses();
    
    @Override
    public boolean isSupported(EObject object) {
        boolean isAcceptableType = SUPPORTED_CLASSES.stream().anyMatch(c -> c.isInstance(object));
        
        if (object instanceof Package) {
            if (EcoreUtil.getRootContainer(object) == object) {
                return false;
            }
        } else if (object instanceof Property) {
            if (((Property) object).getAssociation() != null) {
                return false;
            }
        }
        
        return isAcceptableType;
    }

    private static Collection<Class<? extends Element>> createSupportedClasses() {
        return Arrays.asList(org.eclipse.uml2.uml.Class.class, Interface.class, Package.class, Operation.class,
                Association.class, Comment.class, PackageImport.class, Parameter.class, Generalization.class,
                InterfaceRealization.class, Property.class);
    }

    @Override
    public DiagramTypes getCoveredDiagramType() {
        return DiagramTypes.CLASS;
    }

    
}
