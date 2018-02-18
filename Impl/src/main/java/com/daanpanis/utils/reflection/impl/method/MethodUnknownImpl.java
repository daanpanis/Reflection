package com.daanpanis.utils.reflection.impl.method;

import com.daanpanis.utils.reflection.method.MethodUnknown;

import java.lang.reflect.Method;

public class MethodUnknownImpl extends MethodImpl implements MethodUnknown {

    public MethodUnknownImpl(Object instance, Method method) {
        super(instance, method);
    }

}
