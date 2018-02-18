package com.daanpanis.utils.reflection.constructor;

import com.daanpanis.utils.reflection.ReflectionInstance;

public interface Constructor4<T, P1, P2, P3, P4> extends Constructor<T> {

    ReflectionInstance<T> instance(P1 param1, P2 param2, P3 param3, P4 param4);

}
