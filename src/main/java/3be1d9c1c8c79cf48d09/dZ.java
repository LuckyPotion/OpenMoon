package com.moon;


public class dZ extends com.moon.event.CancellableEvent {

private int c;

private boolean e;

private static long f;

public dZ(int p0, boolean p1) { super(); __sourceHandlerCall_01eb573160f66df8a2d2(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_01eb573160f66df8a2d2(com.moon.dZ a0, int a1, boolean a2) throws E;
private static final class __SourceHandler_01eb573160f66df8a2d2 {

public static void f31(com.moon.dZ receiver, int p0, boolean p1) throws Throwable {
    long local3_life1 = (__fieldRead31_0() ^ 129168009528243L);
    int[] __sourceSpill31_3 = __call31_2();
    __directSuperInit31_4(receiver);
    int[] local5_life5 = __sourceSpill31_3;
    __fieldWrite31_6(receiver, p0);
    __fieldWrite31_7(receiver, p1);
    if ((local5_life5 == null)) {
        __call31_8(new java.lang.String[1]);
    }
    return;
}
private static native long __fieldRead31_0();
private static native int[] __call31_2();
private static native void __directSuperInit31_4(com.moon.dZ a0);
private static native void __fieldWrite31_6(com.moon.dZ a0, int a1);
private static native void __fieldWrite31_7(com.moon.dZ a0, boolean a1);
private static native void __call31_8(java.lang.String[] a0);

}


static {
com.moon.dZ.f = (moom._c.a(6578373060706686572L, 1025446591263795880L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(189940582720892L);
}


public boolean b__sourceReturn_aae029aa0a() {
return ((((this.e) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.dZ a(boolean p0) {
this.e = ((boolean)(p0));
    return this;
}


public com.moon.dZ a(int p0) {
this.c = ((int)(p0));
    return this;
}


public int a__sourceReturn_8abf5c6871() {
return this.c;
}

}
