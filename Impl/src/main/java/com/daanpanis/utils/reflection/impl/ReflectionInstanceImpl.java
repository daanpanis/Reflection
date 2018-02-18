package com.daanpanis.utils.reflection.impl;

import com.daanpanis.utils.reflection.ReflectionInstance;
import com.daanpanis.utils.reflection.impl.method.*;
import com.daanpanis.utils.reflection.method.*;

import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReflectionInstanceImpl<T> implements ReflectionInstance<T> {

    private final T object;

    public ReflectionInstanceImpl(T object) {
        this.object = object;
    }

    @Override
    public ReflectionInstance<T> execute(Consumer<T> action) {
        action.accept(object);
        return this;
    }

    @Override
    public T object() {
        return object;
    }

    @Override
    public <P> Method1<P> method(String methodName, Class<P> param) {
        return new Method1Impl<>(object, getMethod(methodName, param));
    }

    @Override
    public <P1, P2> Method2<P1, P2> method(String methodName, Class<P1> param1, Class<P2> param2) {
        return new Method2Impl<>(object, getMethod(methodName, param1, param2));
    }

    @Override
    public <P1, P2, P3> Method3<P1, P2, P3> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3) {
        return new Method3Impl<>(object, getMethod(methodName, param1, param2, param3));
    }

    @Override
    public <P1, P2, P3, P4> Method4<P1, P2, P3, P4> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4) {
        return new Method4Impl<>(object, getMethod(methodName, param1, param2, param3, param4));
    }

    @Override
    public <P1, P2, P3, P4, P5> Method5<P1, P2, P3, P4, P5> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5) {
        return new Method5Impl<>(object, getMethod(methodName, param1, param2, param3, param4, param5));
    }

    @Override
    public <P1, P2, P3, P4, P5, P6> Method6<P1, P2, P3, P4, P5, P6> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5, Class<P6> param6) {
        return new Method6Impl<>(object, getMethod(methodName, param1, param2, param3, param4, param5, param6));
    }

    @Override
    public MethodUnknown method(String methodName, Class<?>... parameters) {
        return new MethodUnknownImpl(object, getMethod(methodName, parameters));
    }

    @Override
    public Collection<MethodUnknown> methods() {
        return Stream.of(object.getClass().getDeclaredMethods()).map(method -> new MethodUnknownImpl(object, method)).filter(Method::isNotStatic)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return object.toString();
    }

    private java.lang.reflect.Method getMethod(String methodName, Class<?>... parameters) {
        try {
            java.lang.reflect.Method method = object.getClass().getDeclaredMethod(methodName, parameters);
            if (Modifier.isStatic(method.getModifiers()))
                throw new IllegalArgumentException("No non-static method found by that name and parameter types");
            return method;
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
