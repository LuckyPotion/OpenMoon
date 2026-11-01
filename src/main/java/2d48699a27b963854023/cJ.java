package com.moon;


public class cJ {

private java.lang.String a;

private java.lang.String b;

private java.lang.String c;

private static long d;

public cJ(java.lang.String p0, java.lang.String p1, java.lang.String p2) { super(); __sourceHandlerCall_defc7c708f29ca5c2c8b(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_defc7c708f29ca5c2c8b(com.moon.cJ a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_defc7c708f29ca5c2c8b {

public static void f14(com.moon.cJ receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2) throws Throwable {
    long local4_life1 = (__fieldRead14_0() ^ 100314213384780L);
    __directSuperInit14_2(receiver);
    boolean __sourceSpill14_5 = __call14_3();
    __fieldWrite14_4(receiver, p0);
    boolean local6_life6 = __sourceSpill14_5;
    __fieldWrite14_7(receiver, p1);
    __fieldWrite14_8(receiver, p2);
    if ((__call14_9() != null)) {
        __call14_10((local6_life6 ? 0 : 1));
    }
    return;
}
private static native long __fieldRead14_0();
private static native void __directSuperInit14_2(com.moon.cJ a0);
private static native boolean __call14_3();
private static native void __fieldWrite14_4(com.moon.cJ a0, java.lang.String a1);
private static native void __fieldWrite14_7(com.moon.cJ a0, java.lang.String a1);
private static native void __fieldWrite14_8(com.moon.cJ a0, java.lang.String a1);
private static native java.lang.String[] __call14_9();
private static native void __call14_10(int a0);

}


static {
com.moon.cJ.d = (moom._c.a(2365209000499415392L, -6932532838817719855L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(69714588114531L);
}


public com.moon.cJ b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public java.lang.String b() {
return this.b;
}


public com.moon.cJ c(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
    return this;
}


public java.lang.String c() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
return this.a;
}


public com.moon.cJ a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}

}
