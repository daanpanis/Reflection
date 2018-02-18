package com.daanpanis.reflection.constructor;

import com.daanpanis.reflection.ReflectionInstance;

public interface ConstructorUnknown<T> extends Constructor<T> {

    ReflectionInstance<T> instance(Object... parameters);

}
