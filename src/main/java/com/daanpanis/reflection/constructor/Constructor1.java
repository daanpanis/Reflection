package com.daanpanis.reflection.constructor;

import com.daanpanis.reflection.ReflectionInstance;

public interface Constructor1<T, P> extends Constructor<T> {

    ReflectionInstance<T> instance(P parameter);

}
