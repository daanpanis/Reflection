package com.daanpanis.utils.reflection.constructor;

import com.daanpanis.utils.reflection.ReflectionInstance;

public interface Constructor2<T, P1, P2> extends Constructor<T> {

    ReflectionInstance<T> instance(P1 param1, P2 param2);

}
