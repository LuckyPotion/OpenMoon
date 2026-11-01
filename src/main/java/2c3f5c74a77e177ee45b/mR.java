package com.moon;


public class mR {

private java.lang.String a;

private java.lang.String b;

private java.util.function.Supplier<java.lang.Float> c;

private java.util.function.Supplier<java.lang.Float> d;

private com.moon.mT e;

private com.moon.pj f;

private java.util.List<com.moon.mV> g;

private static long h;

mR(java.lang.String p0, java.lang.String p1, java.util.function.Supplier<java.lang.Float> p2, java.util.function.Supplier<java.lang.Float> p3, com.moon.mT p4, com.moon.pj p5, java.util.List<com.moon.mV> p6) { super(); __sourceHandlerCall_56a99f2767ca2aed51d8(this, p0, p1, p2, p3, p4, p5, p6); }

private static native <E extends Throwable> void __sourceHandlerCall_56a99f2767ca2aed51d8(com.moon.mR a0, java.lang.String a1, java.lang.String a2, java.util.function.Supplier a3, java.util.function.Supplier a4, com.moon.mT a5, com.moon.pj a6, java.util.List a7) throws E;
private static final class __SourceHandler_56a99f2767ca2aed51d8 {

public static void f177(com.moon.mR receiver, java.lang.String p0, java.lang.String p1, java.util.function.Supplier p2, java.util.function.Supplier p3, com.moon.mT p4, com.moon.pj p5, java.util.List p6) throws Throwable {
    long local8_life1 = (__fieldRead177_0() ^ 55282853478160L);
    __directSuperInit177_2(receiver);
    __fieldWrite177_3(receiver, p0);
    int __sourceSpill177_6 = __call177_4();
    __fieldWrite177_5(receiver, p1);
    int local10_life7 = __sourceSpill177_6;
    __fieldWrite177_8(receiver, p2);
    __fieldWrite177_9(receiver, p3);
    __fieldWrite177_10(receiver, p4);
    __fieldWrite177_11(receiver, p5);
    __fieldWrite177_12(receiver, p6);
    if ((__call177_13() != null)) {
        local10_life7 += 1;
        __call177_14(local10_life7);
    }
    return;
}
private static native long __fieldRead177_0();
private static native void __directSuperInit177_2(com.moon.mR a0);
private static native void __fieldWrite177_3(com.moon.mR a0, java.lang.String a1);
private static native int __call177_4();
private static native void __fieldWrite177_5(com.moon.mR a0, java.lang.String a1);
private static native void __fieldWrite177_8(com.moon.mR a0, java.util.function.Supplier a1);
private static native void __fieldWrite177_9(com.moon.mR a0, java.util.function.Supplier a1);
private static native void __fieldWrite177_10(com.moon.mR a0, com.moon.mT a1);
private static native void __fieldWrite177_11(com.moon.mR a0, com.moon.pj a1);
private static native void __fieldWrite177_12(com.moon.mR a0, java.util.List a1);
private static native java.lang.String[] __call177_13();
private static native void __call177_14(int a0);

}


static {
com.moon.mR.h = (moom._c.a(-5566707189614987348L, 39960348547601177L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(49194416519784L);
}


public java.lang.String b() {
return this.b;
}


public java.util.function.Supplier<java.lang.Float> b__Supplier() {
return this.d;
}


public com.moon.pj a__pj() {
return this.f;
}


public java.util.List<com.moon.mV> a__List() {
return this.g;
}


public static com.moon.mS a() {
return new com.moon.mS();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.mT a__mT() {
return this.e;
}


public java.lang.String a__String() {
return this.a;
}


public java.util.function.Supplier<java.lang.Float> a__Supplier() {
return this.c;
}

}
