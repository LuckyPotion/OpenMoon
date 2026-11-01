package com.moon;


public class cK {

private com.moon.cL a;

private java.lang.String b;

private java.lang.String c;

private static long d;

public cK(com.moon.cL p0, java.lang.String p1, java.lang.String p2) { super(); __sourceHandlerCall_f4a269105eccddbcfb76(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_f4a269105eccddbcfb76(com.moon.cK a0, com.moon.cL a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_f4a269105eccddbcfb76 {

public static void f15(com.moon.cK receiver, com.moon.cL p0, java.lang.String p1, java.lang.String p2) throws Throwable {
    long local4_life1 = (__fieldRead15_0() ^ 60029151141916L);
    boolean __sourceSpill15_3 = __call15_2();
    __directSuperInit15_4(receiver);
    __fieldWrite15_5(receiver, p0);
    __fieldWrite15_6(receiver, p1);
    boolean local6_life7 = __sourceSpill15_3;
    __fieldWrite15_8(receiver, p2);
    if (local6_life7) {
        __call15_9(new java.lang.String[2]);
    }
    return;
}
private static native long __fieldRead15_0();
private static native boolean __call15_2();
private static native void __directSuperInit15_4(com.moon.cK a0);
private static native void __fieldWrite15_5(com.moon.cK a0, com.moon.cL a1);
private static native void __fieldWrite15_6(com.moon.cK a0, java.lang.String a1);
private static native void __fieldWrite15_8(com.moon.cK a0, java.lang.String a1);
private static native void __call15_9(java.lang.String[] a0);

}


static {
com.moon.cK.d = (moom._c.a(1676109265452367921L, -3967110060305328407L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(152472331517369L);
}


public com.moon.cK b(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
    return this;
}


public java.lang.String b() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.cL a() {
return this.a;
}


public java.lang.String a__String() {
return this.b;
}


public com.moon.cK a(com.moon.cL p0) {
this.a = ((com.moon.cL)(p0));
    return this;
}


public com.moon.cK a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}

}
