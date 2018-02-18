package com.daanpanis.utils.reflection.impl.constructor;

import com.daanpanis.utils.reflection.ReflectionInstance;
import com.daanpanis.utils.reflection.constructor.Constructor;
import com.daanpanis.utils.reflection.exceptions.ReflectionRuntimeException;
import com.daanpanis.utils.reflection.impl.ReflectionInstanceImpl;

import java.lang.reflect.InvocationTargetException;

public class ConstructorImpl<T> implements Constructor<T> {

    private final java.lang.reflect.Constructor<T> original;

    public ConstructorImpl(java.lang.reflect.Constructor<T> original) {
        this.original = original;
        this.original.setAccessible(true);
    }

    @Override
    public ReflectionInstance<T> instance(Object[] parameters) {
        try {
            return new ReflectionInstanceImpl<>(original.newInstance(parameters));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new ReflectionRuntimeException(e);
        }
    }

    @Override
    public java.lang.reflect.Constructor<T> getOriginal() {
        return original;
    }
}
