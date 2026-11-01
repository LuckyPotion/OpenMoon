package com.moon;


public class jL {

private java.lang.String a;

private java.lang.String b;

private static long c;

public jL(java.lang.String p0, java.lang.String p1) { super(); __sourceHandlerCall_8a47ef479f21e27dfadd(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_8a47ef479f21e27dfadd(com.moon.jL a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_8a47ef479f21e27dfadd {

public static void f105(com.moon.jL receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    long local3_life1 = (__fieldRead105_0() ^ 122858080794330L);
    boolean __sourceSpill105_3 = __call105_2();
    __directSuperInit105_4(receiver);
    boolean local5_life5 = __sourceSpill105_3;
    __fieldWrite105_6(receiver, p0);
    __fieldWrite105_7(receiver, p1);
    if (local5_life5) {
        __call105_8(new java.lang.String[1]);
    }
    return;
}
private static native long __fieldRead105_0();
private static native boolean __call105_2();
private static native void __directSuperInit105_4(com.moon.jL a0);
private static native void __fieldWrite105_6(com.moon.jL a0, java.lang.String a1);
private static native void __fieldWrite105_7(com.moon.jL a0, java.lang.String a1);
private static native void __call105_8(java.lang.String[] a0);

}


public jL() {
super();
}


static {
com.moon.jL.c = (moom._c.a(-4237527947053240435L, 2231948278335371773L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(159804570686314L);
}


public com.moon.jL b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public java.lang.String b() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
return this.a;
}


public com.moon.jL a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}

}
