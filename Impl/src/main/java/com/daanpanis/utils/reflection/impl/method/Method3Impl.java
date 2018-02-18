package com.daanpanis.utils.reflection.impl.method;

import com.daanpanis.utils.reflection.method.Method3;

import java.lang.reflect.Method;

public class Method3Impl<P1, P2, P3> extends MethodImpl implements Method3<P1, P2, P3> {

    public Method3Impl(Object instance, Method method) {
        super(instance, method);
    }

    @Override
    public Object invoke(P1 param1, P2 param2, P3 param3) {
        return super.invoke(new Object[]{param1, param2, param3});
    }
}
