package com.daanpanis.utils.reflection.impl.method;

import com.daanpanis.utils.reflection.method.Method1;

import java.lang.reflect.Method;

public class Method1Impl<P> extends MethodImpl implements Method1<P> {

    public Method1Impl(Object instance, Method method) {
        super(instance, method);
    }

    @Override
    public Object invoke(P param) {
        return super.invoke(new Object[]{param});
    }
}
