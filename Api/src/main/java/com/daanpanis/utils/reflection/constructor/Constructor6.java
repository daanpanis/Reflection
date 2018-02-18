package com.daanpanis.utils.reflection.constructor;

import com.daanpanis.utils.reflection.ReflectionInstance;

public interface Constructor6<T, P1, P2, P3, P4, P5, P6> extends Constructor<T> {

    ReflectionInstance<T> instance(P1 param1, P2 param2, P3 param3, P4 param4, P5 param5, P6 param6);

}
