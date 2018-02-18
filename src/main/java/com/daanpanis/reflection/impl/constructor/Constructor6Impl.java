package com.daanpanis.reflection.impl.constructor;

import com.daanpanis.reflection.ReflectionInstance;
import com.daanpanis.reflection.constructor.Constructor6;

import java.lang.reflect.Constructor;

public class Constructor6Impl<T, P1, P2, P3, P4, P5, P6> extends ConstructorImpl<T> implements Constructor6<T, P1, P2, P3, P4, P5, P6> {

    public Constructor6Impl(Constructor<T> original) {
        super(original);
    }

    @Override
    public ReflectionInstance<T> instance(P1 param1, P2 param2, P3 param3, P4 param4, P5 param5, P6 param6) {
        return super.instance(new Object[]{param1, param2, param3, param4, param5, param6});
    }
}
