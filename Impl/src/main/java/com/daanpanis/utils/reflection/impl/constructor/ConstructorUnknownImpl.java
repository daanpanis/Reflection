package com.daanpanis.utils.reflection.impl.constructor;

import com.daanpanis.utils.reflection.constructor.ConstructorUnknown;

import java.lang.reflect.Constructor;

public class ConstructorUnknownImpl<T> extends ConstructorImpl<T> implements ConstructorUnknown<T> {

    public ConstructorUnknownImpl(Constructor<T> original) {
        super(original);
    }
}
