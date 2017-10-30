package de.cooperate.modeling.graphical.papyrus.extensions.usecase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.notation.NamedStyle;
import org.eclipse.gmf.runtime.notation.StringListValueStyle;

public enum ActorKind {
    /** Stickyman Shape */
    STICKY, //
    /** Machine Shape */
    MACHINE;

    public String actorKey() {
        return (this == STICKY) ? null : name().toLowerCase();
    }

    public static ActorKind forStyle(NamedStyle style) {
        EList possibleKeys = (style instanceof StringListValueStyle)
                ? ((StringListValueStyle) style).getStringListValue()
                : null;

        return (possibleKeys == null) ? STICKY
                : possibleKeys.contains(MACHINE.toString().toLowerCase()) ? MACHINE : STICKY;
    }

    public static ActorKind nullSafe(ActorKind kind) {
        return (kind == null) ? STICKY : kind;
    }
}
