package com.daanpanis.utils.reflection.impl.method;

import com.daanpanis.utils.reflection.exceptions.ReflectionRuntimeException;
import com.daanpanis.utils.reflection.method.Method;

import java.lang.reflect.InvocationTargetException;

public class MethodImpl implements Method {

    private final Object instance;
    private final java.lang.reflect.Method method;

    public MethodImpl(Object instance, java.lang.reflect.Method method) {
        this.instance = instance;
        this.method = method;
        this.method.setAccessible(true);
    }

    @Override
    public Object invoke(Object[] parameters) {
        try {
            return method.invoke(instance, parameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new ReflectionRuntimeException(e);
        }
    }

    @Override
    public java.lang.reflect.Method getOriginal() {
        return method;
    }
}
