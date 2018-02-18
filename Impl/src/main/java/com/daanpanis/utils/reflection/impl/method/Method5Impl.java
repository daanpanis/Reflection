package com.daanpanis.utils.reflection.impl.method;

import com.daanpanis.utils.reflection.method.Method5;

import java.lang.reflect.Method;

public class Method5Impl<P1, P2, P3, P4, P5> extends MethodImpl implements Method5<P1, P2, P3, P4, P5> {

    public Method5Impl(Object instance, Method method) {
        super(instance, method);
    }

    @Override
    public Object invoke(P1 param1, P2 param2, P3 param3, P4 param4, P5 param5) {
        return super.invoke(new Object[]{param1, param2, param3, param4, param5});
    }
}
