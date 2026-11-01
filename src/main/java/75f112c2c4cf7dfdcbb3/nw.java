package com.moon;


public class nw {

private com.moon.nt a;

private int b;

private int c;

private static long d;

public nw(com.moon.nt p0, int p1, int p2) { super(); __sourceHandlerCall_dc204efa7ff419318218(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_dc204efa7ff419318218(com.moon.nw a0, com.moon.nt a1, int a2, int a3) throws E;
private static final class __SourceHandler_dc204efa7ff419318218 {

public static void f256(com.moon.nw receiver, com.moon.nt p0, int p1, int p2) throws Throwable {
    long local4_life1 = (__fieldRead256_0() ^ 86713713855472L);
    int[] __sourceSpill256_3 = __call256_2();
    __directSuperInit256_4(receiver);
    __fieldWrite256_5(receiver, p0);
    __fieldWrite256_6(receiver, p1);
    int[] local6_life7 = __sourceSpill256_3;
    __fieldWrite256_8(receiver, p2);
    if ((local6_life7 == null)) {
        __call256_9(new java.lang.String[1]);
    }
    return;
}
private static native long __fieldRead256_0();
private static native int[] __call256_2();
private static native void __directSuperInit256_4(com.moon.nw a0);
private static native void __fieldWrite256_5(com.moon.nw a0, com.moon.nt a1);
private static native void __fieldWrite256_6(com.moon.nw a0, int a1);
private static native void __fieldWrite256_8(com.moon.nw a0, int a1);
private static native void __call256_9(java.lang.String[] a0);

}


static {
com.moon.nw.d = (moom._c.a(657335255227797877L, 3763061126460052349L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(254532823832781L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
((com.moon.nt)(this.a)).a(((int)(this.b)), ((int)(this.c)));
    return;
}

}
