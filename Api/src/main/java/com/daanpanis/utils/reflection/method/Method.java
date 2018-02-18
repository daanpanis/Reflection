package com.daanpanis.utils.reflection.method;

import com.daanpanis.utils.reflection.*;

import java.lang.annotation.Annotation;
import java.util.function.Function;

public interface Method extends Annotatable, Parameters, Exceptionable, Modifiers, Returnable {

    Object invoke(Object[] parameters);

    java.lang.reflect.Method getOriginal();

    default String getName() {
        return getOriginal().getName();
    }

    @Override
    default Class<?>[] getParameterTypes() {
        return getOriginal().getParameterTypes();
    }

    @Override
    default boolean hasModifier(Function<Integer, Boolean> function) {
        return function.apply(getOriginal().getModifiers());
    }

    @Override
    default Class<?> getReturnType() {
        return getOriginal().getReturnType();
    }

    @Override
    default Annotation[] getAnnotations() {
        return getOriginal().getDeclaredAnnotations();
    }

    @Override
    default <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
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

}
