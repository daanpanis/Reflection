package com.daanpanis.reflection;

public interface Returnable {

    Class<?> getReturnType();

    default boolean hasReturnType() {
        return !getReturnType().equals(void.class);
    }

    default boolean returns(Class<?> returnType) {
        return getReturnType().equals(returnType);
    }

}
