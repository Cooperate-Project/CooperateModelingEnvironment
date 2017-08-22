package de.cooperateproject.ui.diff.cls.labelhandling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.PrimitiveType;

import de.cooperateproject.modeling.textual.cls.cls.AssociationMemberEnd;
import de.cooperateproject.modeling.textual.cls.cls.Attribute;
import de.cooperateproject.modeling.textual.cls.cls.ClassDiagram;
import de.cooperateproject.modeling.textual.cls.cls.Generalization;
import de.cooperateproject.modeling.textual.cls.cls.Implementation;
import de.cooperateproject.modeling.textual.cls.cls.Interface;
import de.cooperateproject.modeling.textual.cls.cls.Method;
import de.cooperateproject.modeling.textual.cls.cls.Parameter;
import de.cooperateproject.modeling.textual.cls.cls.XtextAssociation;
import de.cooperateproject.modeling.textual.cls.cls.util.ClsSwitch;
import de.cooperateproject.modeling.textual.cls.cls.Class;
import de.cooperateproject.modeling.textual.cls.cls.Package;

/**
 * Switch to invoke description method for each cls model class.
 * 
 * @author Jasmin, czogalik
 *
 */
public class ClsLabelSwitch extends ClsSwitch<String> {

    @Override
    public String caseClassDiagram(ClassDiagram object) {
        return object.getTitle();
    }

    @Override
    public String casePackage(Package object) {
        return "package" + " " + object.getName();
    }

    @Override
    public String caseClass(Class object) {
        String isAbstract = "";
        if (object.isAbstract()) {
            isAbstract = "abstract ";
        }

        String visibText = handleNonEObject(object.getVisibility());

        return visibText + isAbstract + "class " + object.getName();
    }

    @Override
    public String caseInterface(Interface object) {
        String alias = "";
        if (object.getAlias() != null) {
            alias = " as " + object.getAlias();
        }

        String visibText = handleNonEObject(object.getVisibility());

        return visibText + "interface" + " " + object.getName() + alias;
    }

    @Override
    public String caseAttribute(Attribute object) {
        String type = "";
        type = ": " + object.getType().getName();

        String visibText = handleNonEObject(object.getVisibility());

        return visibText + object.getName() + type;
    }

    @Override
    public String caseMethod(Method object) {
        String type = ": ";
        if (object.getType() != null) {
            type = type + object.getType().getName();
        } else {
            type = type + "void";
        }
        EList<Parameter> params = object.getParameters();
        String isAbstract = "";
        if (object.isAbstract()) {
            isAbstract = "abstract ";
        }

        String visibText = handleNonEObject(object.getVisibility());

        StringBuilder paramText = new StringBuilder();
        for (Parameter param : params) {
            paramText.append(caseParameter(param));
            if (params.indexOf(param) < params.size() - 1) {
                paramText.append(", ");
            }
        }

        return visibText + isAbstract + object.getName() + "(" + paramText + ")" + type;
    }

    @Override
    public String caseParameter(Parameter object) {
        String type = ": " + object.getType().getName();

        String visibText = handleNonEObject(object.getVisibility());

        return visibText + object.getName() + type;
    }

    @Override
    public String caseGeneralization(Generalization object) {
        String left = object.getLeft().getName();
        String right = object.getRight().getName();
        return left + " isA " + right;
    }

    @Override
    public String caseXtextAssociation(XtextAssociation object) {
        return "asc " + object.getName();
    }

    @Override
    public String caseAssociationMemberEnd(AssociationMemberEnd object) {
        return object.getType().getName();
    }

    @Override
    public String caseImplementation(Implementation object) {
        String left = object.getLeft().getName();
        String right = object.getRight().getName();
        return left + " impl " + right;
    }

    private static String handleNonEObject(Object object) {
        String ret = "";
        if (object instanceof Integer) {
            if ((Integer) object == -1) {
                ret = "*";
            } else {
                ret = ((Integer) object).toString();
            }

        } else if (object instanceof PrimitiveType) {
            ret = ((PrimitiveType) object).getName();
        }

        return ret;
    }
}
