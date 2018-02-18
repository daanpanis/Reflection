package com.daanpanis.reflection.impl.constructor;

import com.daanpanis.reflection.ReflectionInstance;
import com.daanpanis.reflection.constructor.Constructor3;

import java.lang.reflect.Constructor;

public class Constructor3Impl<T, P1, P2, P3> extends ConstructorImpl<T> implements Constructor3<T, P1, P2, P3> {

    public Constructor3Impl(Constructor<T> original) {
        super(original);
    }

    @Override
    public ReflectionInstance<T> instance(P1 param1, P2 param2, P3 param3) {
        return super.instance(new Object[]{param1, param2, param3});
    }
}
