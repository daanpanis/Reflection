package com.daanpanis.utils.reflection.constructor;

import com.daanpanis.utils.reflection.*;

import java.lang.annotation.Annotation;
import java.util.function.Function;

public interface Constructor<T> extends Annotatable, Parameters, Exceptionable, Modifiers {

    ReflectionInstance<T> instance(Object[] parameters);

    java.lang.reflect.Constructor<T> getOriginal();

    @Override
    default Class<?>[] getParameterTypes() {
        return getOriginal().getParameterTypes();
    }

    @Override
    default Annotation[] getAnnotations() {
        return getOriginal().getDeclaredAnnotations();
    }

    @Override
    default <V extends Annotation> V getAnnotation(Class<V> annotationClass) {
        return getOriginal().getDeclaredAnnotation(annotationClass);
    }

    @Override
    default Annotation[][] getAllParameterAnnotations() {
        return getOriginal().getParameterAnnotations();
    }

    @Override
    default Class<?>[] getExceptions() {
        return getOriginal().getExceptionTypes();
    }

    @Override
    default boolean hasModifier(Function<Integer, Boolean> function) {
        return function.apply(getOriginal().getModifiers());
    }
}
