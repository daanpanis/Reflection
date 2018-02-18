package com.daanpanis.utils.reflection.constructor;

import com.daanpanis.utils.reflection.ReflectionInstance;

public interface Constructor1<T, P> extends Constructor<T> {

    ReflectionInstance<T> instance(P parameter);

}
