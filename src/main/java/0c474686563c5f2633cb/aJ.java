package com.moon;


class aJ extends com.viaversion.viaversion.protocols.base.BaseVersionProvider {

com.moon.o_ a;

private static long b;

aJ(com.moon.o_ p0) { super(); }


private static void __sourceConstructorBody_e8fab8c96dff4222(com.moon.aJ receiver, com.moon.o_ p0) throws Throwable {

((com.moon.aJ)(receiver)).a = ((com.moon.o_)(p0));

    com.moon.aJ.__sourceConstructorInit_e8fab8c96dff4222_0(((com.moon.aJ)(receiver)));

    return;

}



static {
com.moon.aJ.b = (moom._c.a(1292076181337188308L, -8623211189308191787L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(210262619278294L);
}

private static native <E extends Throwable> void __sourceConstructorInit_e8fab8c96dff4222_0(com.moon.aJ a0) throws E;

private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public int getClosestServerProtocol(com.viaversion.viaversion.api.connection.UserConnection p0) throws java.lang.Exception {
int forwardValue8_17_0;
    boolean spill8_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_17: {
    forward_join_14: {
    life2_3 = (com.moon.aJ.b ^ 95570348707263L);
    life4_5 = com.moon.o_.b();
    spill8_0 = ((com.viaversion.viaversion.api.connection.UserConnection)(p0)).isClientSide();
    if (!((life4_5 == null))) {
        forwardValue8_17_0 = ((spill8_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill8_0)) {
        break forward_join_14;
    }
    return ((com.moon.o4)(com.moon.o4.a__o4())).b();
    }
    forwardValue8_17_0 = super.getClosestServerProtocol(((com.viaversion.viaversion.api.connection.UserConnection)(p0)));
    }
    return forwardValue8_17_0;
}

}
