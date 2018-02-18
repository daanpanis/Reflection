package com.daanpanis.utils.reflection;

import java.lang.reflect.Modifier;
import java.util.function.Function;

public interface Modifiers {

    boolean hasModifier(Function<Integer, Boolean> function);

    default boolean isStatic() {
        return hasModifier(Modifier::isStatic);
    }

    default boolean isNotStatic() {
        return !isStatic();
    }

    default boolean isPublic() {
        return hasModifier(Modifier::isPublic);
    }

    default boolean isPrivate() {
        return hasModifier(Modifier::isPrivate);
    }

    default boolean isProtected() {
        return hasModifier(Modifier::isProtected);
    }

}
