package com.daanpanis.reflection.method;

public interface Method3<P1, P2, P3> extends Method {

    Object invoke(P1 param1, P2 param2, P3 param3);

}
