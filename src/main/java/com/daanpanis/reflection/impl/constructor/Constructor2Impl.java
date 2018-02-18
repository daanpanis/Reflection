package com.daanpanis.reflection.impl.constructor;

import com.daanpanis.reflection.ReflectionInstance;
import com.daanpanis.reflection.constructor.Constructor2;

import java.lang.reflect.Constructor;

public class Constructor2Impl<T, P1, P2> extends ConstructorImpl<T> implements Constructor2<T, P1, P2> {

    public Constructor2Impl(Constructor<T> original) {
        super(original);
    }

    @Override
    public ReflectionInstance<T> instance(P1 param1, P2 param2) {
        return super.instance(new Object[]{param1, param2});
    }
}
