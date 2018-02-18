package com.daanpanis.utils.reflection.impl.method;

import com.daanpanis.utils.reflection.method.Method2;

import java.lang.reflect.Method;

public class Method2Impl<P1, P2> extends MethodImpl implements Method2<P1, P2> {

    public Method2Impl(Object instance, Method method) {
        super(instance, method);
    }

    @Override
    public Object invoke(P1 param1, P2 param2) {
        return super.invoke(new Object[]{param1, param2});
    }
}
