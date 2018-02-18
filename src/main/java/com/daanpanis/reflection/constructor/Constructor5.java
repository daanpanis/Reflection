package com.daanpanis.reflection.constructor;

import com.daanpanis.reflection.ReflectionInstance;

public interface Constructor5<T, P1, P2, P3, P4, P5> extends Constructor<T> {

    ReflectionInstance<T> instance(P1 param1, P2 param2, P3 param3, P4 param4, P5 param5);

}
