package com.daanpanis.utils.reflection.impl.constructor;

import com.daanpanis.utils.reflection.ReflectionInstance;
import com.daanpanis.utils.reflection.constructor.Constructor1;

import java.lang.reflect.Constructor;

public class Constructor1Impl<T, P> extends ConstructorImpl<T> implements Constructor1<T, P> {

    public Constructor1Impl(Constructor<T> original) {
        super(original);
    }

    @Override
    public ReflectionInstance<T> instance(P parameter) {
        return super.instance(new Object[]{parameter});
    }
}
