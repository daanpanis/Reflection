package com.daanpanis.reflection.impl.constructor;

import com.daanpanis.reflection.ReflectionInstance;
import com.daanpanis.reflection.constructor.Constructor5;

import java.lang.reflect.Constructor;

public class Constructor5Impl<T, P1, P2, P3, P4, P5> extends ConstructorImpl<T> implements Constructor5<T, P1, P2, P3, P4, P5> {

    public Constructor5Impl(Constructor<T> original) {
        super(original);
    }

    @Override
    public ReflectionInstance<T> instance(P1 param1, P2 param2, P3 param3, P4 param4, P5 param5) {
        return super.instance(new Object[]{param1, param2, param3, param4, param5});
    }
}
