package com.daanpanis.reflection;

import java.lang.annotation.Annotation;

public interface Parameters {

    Class<?>[] getParameterTypes();

    Annotation[][] getAllParameterAnnotations();

    default Annotation[] getParameterAnnotations(int paramIndex) {
        Annotation[][] annotations = getAllParameterAnnotations();

        if (paramIndex < 0 || paramIndex >= annotations.length)
            throw new IllegalArgumentException("Illegal index number: " + paramIndex);

        return annotations[paramIndex];
    }

    @SuppressWarnings("unchecked")
    default <T extends Annotation> T getParameterAnnotation(int paramIndex, Class<T> annotationClass) {
        for (Annotation annotation : getParameterAnnotations(paramIndex)) {
            if (annotation.getClass().equals(annotationClass))
                return (T) annotation;
        }
        return null;
    }

    default boolean hasParameterAnnotation(int paramIndex, Class<? extends Annotation> annotationClass) {
        return getParameterAnnotation(paramIndex, annotationClass) != null;
    }

}
