package com.daanpanis.reflection;

public interface Exceptionable {

    Class<?>[] getExceptions();

    default boolean hasException(Class<? extends Throwable> exceptionClass) {
        for (Class<?> cls : getExceptions()) {
            if (cls.equals(exceptionClass))
                return true;
        }
        return false;
    }

}
