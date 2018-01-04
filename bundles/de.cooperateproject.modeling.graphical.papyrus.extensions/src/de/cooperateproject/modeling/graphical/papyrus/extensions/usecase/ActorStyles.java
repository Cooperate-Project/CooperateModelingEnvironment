package de.cooperateproject.modeling.graphical.papyrus.extensions.usecase;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.NamedStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.StringListValueStyle;
import org.eclipse.gmf.runtime.notation.View;

public class ActorStyles {
    // A style name that is compatible with the conventions for CSS attributes
    private static final String ACTOR_STYLE_NAME = "cssClass"; //$NON-NLS-1$

    static NamedStyle getActorStyle(View view) {
        return view.getNamedStyle(NotationPackage.Literals.STRING_LIST_VALUE_STYLE, ACTOR_STYLE_NAME);
    }

    public static void clearActor(View view) {
        NamedStyle actorStyle = getActorStyle(view);
        if (actorStyle != null) {
            EcoreUtil.remove(actorStyle);
        }
    }

    public static ActorKind getActorKind(View view) {
        ActorKind result = ActorKind.STICKY;

        NamedStyle style = view.getNamedStyle(NotationPackage.Literals.STRING_LIST_VALUE_STYLE, ACTOR_STYLE_NAME);
        if (style != null) {
            result = ActorKind.forStyle(style);
        }

        return result;
    }

    private static NamedStyle setActor(View view, ActorKind kind) {
        StringListValueStyle result = null;

        clearActor(view);

        if (kind != ActorKind.STICKY) {
            result = (StringListValueStyle) view.createStyle(NotationPackage.Literals.STRING_LIST_VALUE_STYLE);
            result.setName(ACTOR_STYLE_NAME);
            result.getStringListValue().add(kind.actorKey());
        }

        return result;
    }

    public static NamedStyle setActorMachine(View view) {
        return setActor(view, ActorKind.MACHINE);
    }

    public static NamedStyle setActorSticky(View view) {
        return setActor(view, ActorKind.STICKY);
    }

}
