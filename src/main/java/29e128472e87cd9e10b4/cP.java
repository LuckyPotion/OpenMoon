package com.moon;


public class cP {

private java.lang.String a;

private java.lang.String b;

private static long c;

public cP(java.lang.String p0, java.lang.String p1) { super(); __sourceHandlerCall_594ef3351074f2393e25(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_594ef3351074f2393e25(com.moon.cP a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_594ef3351074f2393e25 {

public static void f17(com.moon.cP receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    long local3_life1 = (__fieldRead17_0() ^ 133135475532934L);
    __directSuperInit17_2(receiver);
    int __sourceSpill17_5 = __call17_3();
    __fieldWrite17_4(receiver, p0);
    int local5_life6 = __sourceSpill17_5;
    __fieldWrite17_7(receiver, p1);
    if ((local5_life6 == 0)) {
        __call17_8(new java.lang.String[4]);
    }
    return;
}
private static native long __fieldRead17_0();
private static native void __directSuperInit17_2(com.moon.cP a0);
private static native int __call17_3();
private static native void __fieldWrite17_4(com.moon.cP a0, java.lang.String a1);
private static native void __fieldWrite17_7(com.moon.cP a0, java.lang.String a1);
private static native void __call17_8(java.lang.String[] a0);

}


public cP() {
super();
}


static {
com.moon.cP.c = (moom._c.a(6833947955134823004L, 8868753574079228500L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(260312439717802L);
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

}
