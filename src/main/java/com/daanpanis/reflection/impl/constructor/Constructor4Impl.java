package com.daanpanis.reflection.impl.constructor;

import com.daanpanis.reflection.ReflectionInstance;
import com.daanpanis.reflection.constructor.Constructor4;

import java.lang.reflect.Constructor;

public class Constructor4Impl<T, P1, P2, P3, P4> extends ConstructorImpl<T> implements Constructor4<T, P1, P2, P3, P4> {

    public Constructor4Impl(Constructor<T> original) {
        super(original);
    }

    @Override
    public ReflectionInstance<T> instance(P1 param1, P2 param2, P3 param3, P4 param4) {
        return super.instance(new Object[]{param1, param2, param3, param4});
    }
}
