package com.moon;


public class cV {

private java.util.UUID a;

private java.lang.String b;

private com.moon.cW c;

private static long d;

public cV(java.util.UUID p0, java.lang.String p1, com.moon.cW p2) { super(); __sourceHandlerCall_a15a5474d8172be91aae(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_a15a5474d8172be91aae(com.moon.cV a0, java.util.UUID a1, java.lang.String a2, com.moon.cW a3) throws E;
private static final class __SourceHandler_a15a5474d8172be91aae {

public static void f19(com.moon.cV receiver, java.util.UUID p0, java.lang.String p1, com.moon.cW p2) throws Throwable {
    long local4_life1 = (__fieldRead19_0() ^ 107840653110280L);
    boolean __sourceSpill19_3 = __call19_2();
    __directSuperInit19_4(receiver);
    __fieldWrite19_5(receiver, p0);
    __fieldWrite19_6(receiver, p1);
    boolean local6_life7 = __sourceSpill19_3;
    __fieldWrite19_8(receiver, p2);
    if (local6_life7) {
        __call19_9(new java.lang.String[4]);
    }
    return;
}
private static native long __fieldRead19_0();
private static native boolean __call19_2();
private static native void __directSuperInit19_4(com.moon.cV a0);
private static native void __fieldWrite19_5(com.moon.cV a0, java.util.UUID a1);
private static native void __fieldWrite19_6(com.moon.cV a0, java.lang.String a1);
private static native void __fieldWrite19_8(com.moon.cV a0, com.moon.cW a1);
private static native void __call19_9(java.lang.String[] a0);

}


static {
com.moon.cV.d = (moom._c.a(-596094063330769860L, -3233001988433354920L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(39750316909058L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.UUID a__UUID() {
return this.a;
}


public com.moon.cW a() {
return this.c;
}


public java.lang.String a__String() {
return this.b;
}

}
