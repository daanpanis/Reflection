package com.daanpanis.utils.reflection;

import java.lang.annotation.Annotation;

public interface Annotatable {

    Annotation[] getAnnotations();

    <T extends Annotation> T getAnnotation(Class<T> annotationClass);

    default boolean hasAnnotation(Class<? extends Annotation> annotationClass) {
        return getAnnotation(annotationClass) != null;
    }

}
