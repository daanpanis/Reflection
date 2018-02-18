package com.daanpanis.utils.reflection.impl;

import com.daanpanis.utils.reflection.ReflectionClass;
import com.daanpanis.utils.reflection.constructor.*;
import com.daanpanis.utils.reflection.impl.constructor.*;
import com.daanpanis.utils.reflection.impl.method.*;
import com.daanpanis.utils.reflection.method.*;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReflectionClassImpl<T> implements ReflectionClass<T> {

    private final Class<T> original;

    public ReflectionClassImpl(Class<T> original) {
        this.original = original;
    }

    @Override
    public <P> Constructor1<T, P> constructor(Class<P> param1) {
        return new Constructor1Impl<>(classConstructor(param1));
    }

    @Override
    public <P1, P2> Constructor2<T, P1, P2> constructor(Class<P1> param1, Class<P2> param2) {
        return new Constructor2Impl<>(classConstructor(param1, param2));
    }

    @Override
    public <P1, P2, P3> Constructor3<T, P1, P2, P3> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3) {
        return new Constructor3Impl<>(classConstructor(param1, param2, param3));
    }

    @Override
    public <P1, P2, P3, P4> Constructor4<T, P1, P2, P3, P4> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3, Class<P4> param4) {
        return new Constructor4Impl<>(classConstructor(param1, param2, param3, param4));
    }

    @Override
    public <P1, P2, P3, P4, P5> Constructor5<T, P1, P2, P3, P4, P5> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5) {
        return new Constructor5Impl<>(classConstructor(param1, param2, param3, param4, param5));
    }

    @Override
    public <P1, P2, P3, P4, P5, P6> Constructor6<T, P1, P2, P3, P4, P5, P6> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5, Class<P6> param6) {
        return new Constructor6Impl<>(classConstructor(param1, param2, param3, param4, param5, param6));
    }

    @Override
    public ConstructorUnknown<T> constructor(Class<?>... parameters) {
        return new ConstructorUnknownImpl<>(classConstructor(parameters));
    }

    @Override
    @SuppressWarnings("unchecked")
    public Collection<ConstructorUnknown<T>> constructors() {
        return Stream.of(original.getConstructors()).map(constructor -> new ConstructorUnknownImpl<>((java.lang.reflect.Constructor<T>) constructor))
                .collect(Collectors.toList());
    }

    @Override
    public <P> Method1<P> staticMethod(String methodName, Class<P> param) {
        return new Method1Impl<>(null, method(methodName, param));
    }

    @Override
    public <P1, P2> Method2<P1, P2> staticMethod(String methodName, Class<P1> param1, Class<P2> param2) {
        return new Method2Impl<>(null, method(methodName, param1, param2));
    }

    @Override
    public <P1, P2, P3> Method3<P1, P2, P3> staticMethod(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3) {
        return new Method3Impl<>(null, method(methodName, param1, param2, param3));
    }

    @Override
    public <P1, P2, P3, P4> Method4<P1, P2, P3, P4> staticMethod(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4) {
        return new Method4Impl<>(null, method(methodName, param1, param2, param3, param4));
    }

    @Override
    public <P1, P2, P3, P4, P5> Method5<P1, P2, P3, P4, P5> staticMethod(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5) {
        return new Method5Impl<>(null, method(methodName, param1, param2, param3, param4, param5));
    }

    @Override
    public <P1, P2, P3, P4, P5, P6> Method6<P1, P2, P3, P4, P5, P6> staticMethod(String methodName, Class<P1> param1, Class<P2> param2,
            Class<P3> param3, Class<P4> param4, Class<P5> param5, Class<P6> param6) {
        return new Method6Impl<>(null, method(methodName, param1, param2, param3, param4, param5, param6));
    }

    @Override
    public MethodUnknown staticMethod(String methodName, Class<?>... parameters) {
        return new MethodUnknownImpl(null, method(methodName, parameters));
    }

    @Override
    public Collection<MethodUnknown> staticMethods() {
        return Stream.of(original.getDeclaredMethods()).map(method -> new MethodUnknownImpl(null, method)).filter(Method::isStatic)
                .collect(Collectors.toList());
    }

    @Override
    public Class<T> getOriginal() {
        return original;
    }

    private java.lang.reflect.Constructor<T> classConstructor(Class<?>... parameters) {
        try {
            return original.getConstructor(parameters);
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private java.lang.reflect.Method method(String methodName, Class<?>... parameters) {
        try {
            java.lang.reflect.Method method = original.getDeclaredMethod(methodName, parameters);
            if (!Modifier.isStatic(method.getModifiers()))
                throw new IllegalArgumentException("No static method found by that name and parameter types");
            return method;
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
