package com.moon;


public class gQ implements com.moon.kR<java.lang.Integer> {

private com.moon.module.impl.HUD a;

private com.moon.hq b;

private static long c;

public gQ(com.moon.module.impl.HUD p0, com.moon.hq p1) { super(); __sourceHandlerCall_fde703d664bf1fdce9b3(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_fde703d664bf1fdce9b3(com.moon.gQ a0, com.moon.module.impl.HUD a1, com.moon.hq a2) throws E;
private static final class __SourceHandler_fde703d664bf1fdce9b3 {

public static void f55(com.moon.gQ receiver, com.moon.module.impl.HUD p0, com.moon.hq p1) throws Throwable {
    long local3_life1 = (__fieldRead55_0() ^ 117619114963199L);
    java.lang.String[] __sourceSpill55_3 = __call55_2();
    __directSuperInit55_4(receiver);
    java.lang.String[] local5_life5 = __sourceSpill55_3;
    __fieldWrite55_6(receiver, p0);
    __fieldWrite55_7(receiver, p1);
    if ((__call55_8() != null)) {
        __call55_9(new java.lang.String[2]);
    }
    return;
}
private static native long __fieldRead55_0();
private static native java.lang.String[] __call55_2();
private static native void __directSuperInit55_4(com.moon.gQ a0);
private static native void __fieldWrite55_6(com.moon.gQ a0, com.moon.module.impl.HUD a1);
private static native void __fieldWrite55_7(com.moon.gQ a0, com.moon.hq a1);
private static native java.lang.String[] __call55_8();
private static native void __call55_9(java.lang.String[] a0);

}


static {
com.moon.gQ.c = (moom._c.a(-8643830945766810424L, -1786950078129067596L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(209897938200366L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(java.lang.Integer p0, java.lang.Integer p1) {
((com.moon.module.impl.HUD)(this.a)).a__Void(((com.moon.hq)(this.b)));
    return;
}


public void accept__sourceBridge_4243dc0745(java.lang.Object p0, java.lang.Object p1) {
((com.moon.gQ)(this)).a(((java.lang.Integer)(((java.lang.Integer)(p0)))), ((java.lang.Integer)(((java.lang.Integer)(p1)))));
}

public void accept(java.lang.Integer __bridgeParam0, java.lang.Integer __bridgeParam1) { this.accept__sourceBridge_4243dc0745(((java.lang.Object)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))); }
}
