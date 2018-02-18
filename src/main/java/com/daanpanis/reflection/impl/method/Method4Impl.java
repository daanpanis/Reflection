package com.daanpanis.reflection.impl.method;

import com.daanpanis.reflection.method.Method4;

import java.lang.reflect.Method;

public class Method4Impl<P1, P2, P3, P4> extends MethodImpl implements Method4<P1, P2, P3, P4> {

    public Method4Impl(Object instance, Method method) {
        super(instance, method);
    }

    @Override
    public Object invoke(P1 param1, P2 param2, P3 param3, P4 param4) {
        return super.invoke(new Object[]{param1, param2, param3, param4});
    }
}
