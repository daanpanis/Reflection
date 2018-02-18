package com.daanpanis.utils.reflection.constructor;

import com.daanpanis.utils.reflection.ReflectionInstance;

public interface ConstructorUnknown<T> extends Constructor<T> {

    ReflectionInstance<T> instance(Object... parameters);

}
