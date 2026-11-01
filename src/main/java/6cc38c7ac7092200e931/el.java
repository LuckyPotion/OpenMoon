package com.moon;


public class el extends com.moon.event.Event {

private boolean a;

private boolean c;

private com.moon.module.Module d;

private static long e;

public el(boolean p0, boolean p1, com.moon.module.Module p2) { super(); __sourceHandlerCall_7813118b449111784306(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_7813118b449111784306(com.moon.el a0, boolean a1, boolean a2, com.moon.module.Module a3) throws E;
private static final class __SourceHandler_7813118b449111784306 {

public static void f41(com.moon.el receiver, boolean p0, boolean p1, com.moon.module.Module p2) throws Throwable {
    long local4_life1 = (__fieldRead41_0() ^ 93827931369057L);
    java.lang.String[] __sourceSpill41_3 = __call41_2();
    __directSuperInit41_4(receiver);
    java.lang.String[] local6_life5 = __sourceSpill41_3;
    __fieldWrite41_6(receiver, p0);
    __fieldWrite41_7(receiver, p1);
    __fieldWrite41_8(receiver, p2);
    if ((__call41_9() != null)) {
        __call41_10(new java.lang.String[4]);
    }
    return;
}
private static native long __fieldRead41_0();
private static native java.lang.String[] __call41_2();
private static native void __directSuperInit41_4(com.moon.el a0);
private static native void __fieldWrite41_6(com.moon.el a0, boolean a1);
private static native void __fieldWrite41_7(com.moon.el a0, boolean a1);
private static native void __fieldWrite41_8(com.moon.el a0, com.moon.module.Module a1);
private static native java.lang.String[] __call41_9();
private static native void __call41_10(java.lang.String[] a0);

}


static {
com.moon.el.e = (moom._c.a(-5565120398236847351L, 6528719769971995620L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(239826228638786L);
}


public boolean b__sourceReturn_aae029aa0a() {
return ((((this.c) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.module.Module a() {
return this.d;
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}

}
