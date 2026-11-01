package com.moon;


public class ek extends com.moon.event.Event {

private java.lang.String a;

private java.lang.String c;

private boolean d;

private static long e;

public ek(java.lang.String p0, java.lang.String p1, boolean p2) { super(); __sourceHandlerCall_318e22d342d538ab196c(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_318e22d342d538ab196c(com.moon.ek a0, java.lang.String a1, java.lang.String a2, boolean a3) throws E;
private static final class __SourceHandler_318e22d342d538ab196c {

public static void f40(com.moon.ek receiver, java.lang.String p0, java.lang.String p1, boolean p2) throws Throwable {
    long local4_life1 = (__fieldRead40_0() ^ 68282411884929L);
    boolean __sourceSpill40_3 = __call40_2();
    __directSuperInit40_4(receiver);
    boolean local6_life5 = __sourceSpill40_3;
    __fieldWrite40_6(receiver, p0);
    __fieldWrite40_7(receiver, p1);
    __fieldWrite40_8(receiver, p2);
    if (local6_life5) {
        __call40_9(new java.lang.String[2]);
    }
    return;
}
private static native long __fieldRead40_0();
private static native boolean __call40_2();
private static native void __directSuperInit40_4(com.moon.ek a0);
private static native void __fieldWrite40_6(com.moon.ek a0, java.lang.String a1);
private static native void __fieldWrite40_7(com.moon.ek a0, java.lang.String a1);
private static native void __fieldWrite40_8(com.moon.ek a0, boolean a1);
private static native void __call40_9(java.lang.String[] a0);

}


static {
com.moon.ek.e = (moom._c.a(-5414593758048262527L, 7003001195932411629L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(233670070101405L);
}


public java.lang.String b__sourceReturn_0e30dfc966() {
return this.c;
}


public com.moon.ek a(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.ek a(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
    return this;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public java.lang.String a() {
return this.a;
}

}
