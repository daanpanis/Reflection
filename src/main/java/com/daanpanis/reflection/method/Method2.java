package com.daanpanis.reflection.method;

public interface Method2<P1, P2> extends Method {

    Object invoke(P1 param1, P2 param2);

}
