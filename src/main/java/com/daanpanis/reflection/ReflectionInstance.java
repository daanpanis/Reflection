package com.daanpanis.reflection;

import com.daanpanis.reflection.method.*;

import java.util.Collection;
import java.util.function.Consumer;

public interface ReflectionInstance<T> {

    ReflectionInstance<T> execute(Consumer<T> action);

    T object();

    <P> Method1<P> method(String methodName, Class<P> param);

    <P1, P2> Method2<P1, P2> method(String methodName, Class<P1> param1, Class<P2> param2);

    <P1, P2, P3> Method3<P1, P2, P3> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3);

    <P1, P2, P3, P4> Method4<P1, P2, P3, P4> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3, Class<P4> param4);

    <P1, P2, P3, P4, P5> Method5<P1, P2, P3, P4, P5> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3, Class<P4> param4,
            Class<P5> param5);

    <P1, P2, P3, P4, P5, P6> Method6<P1, P2, P3, P4, P5, P6> method(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5, Class<P6> param6);

    MethodUnknown method(String methodName, Class<?>... parameters);

    Collection<MethodUnknown> methods();

}