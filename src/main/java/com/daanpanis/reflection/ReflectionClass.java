package com.daanpanis.reflection;

import com.daanpanis.reflection.constructor.*;
import com.daanpanis.reflection.method.*;

import java.util.Collection;

public interface ReflectionClass<T> {

    <P> Constructor1<T, P> constructor(Class<P> param1);

    <P1, P2> Constructor2<T, P1, P2> constructor(Class<P1> param1, Class<P2> param2);

    <P1, P2, P3> Constructor3<T, P1, P2, P3> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3);

    <P1, P2, P3, P4> Constructor4<T, P1, P2, P3, P4> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3, Class<P4> param4);

    <P1, P2, P3, P4, P5> Constructor5<T, P1, P2, P3, P4, P5> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3, Class<P4> param4,
            Class<P5> param5);

    <P1, P2, P3, P4, P5, P6> Constructor6<T, P1, P2, P3, P4, P5, P6> constructor(Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5, Class<P6> param6);

    ConstructorUnknown<T> constructor(Class<?>... parameters);

    Collection<ConstructorUnknown<T>> constructors();

    <P> Method1<P> staticMethod(String methodName, Class<P> param);

    <P1, P2> Method2<P1, P2> staticMethod(String methodName, Class<P1> param1, Class<P2> param2);

    <P1, P2, P3> Method3<P1, P2, P3> staticMethod(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3);

    <P1, P2, P3, P4> Method4<P1, P2, P3, P4> staticMethod(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3, Class<P4> param4);

    <P1, P2, P3, P4, P5> Method5<P1, P2, P3, P4, P5> staticMethod(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5);

    <P1, P2, P3, P4, P5, P6> Method6<P1, P2, P3, P4, P5, P6> staticMethod(String methodName, Class<P1> param1, Class<P2> param2, Class<P3> param3,
            Class<P4> param4, Class<P5> param5, Class<P6> param6);

    MethodUnknown staticMethod(String methodName, Class<?>... parameters);

    Collection<MethodUnknown> staticMethods();

    Class<T> getOriginal();

}
