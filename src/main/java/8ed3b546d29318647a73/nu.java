package com.moon;


public class nu extends com.moon.nt {

private com.moon.m4 d;

private static long f;

public nu(com.moon.m4 p0) { super((java.lang.String)null); __sourceHandlerCall_a4f3d4e50817b9bf21a6(this, p0); }

private static native <E extends Throwable> void __sourceHandlerCall_a4f3d4e50817b9bf21a6(com.moon.nu a0, com.moon.m4 a1) throws E;
private static final class __SourceHandler_a4f3d4e50817b9bf21a6 {

public static void f255(com.moon.nu receiver, com.moon.m4 p0) throws Throwable {
    long local2_life1 = (__fieldRead255_0() ^ 10783593050751L);
    __directSuperInit255_4(receiver, __call255_3(__call255_2(p0)));
    int[] __sourceSpill255_7 = __call255_5();
    __fieldWrite255_6(receiver, p0);
    int[] local4_life8 = __sourceSpill255_7;
    if ((__call255_9() != null)) {
        __call255_10(new int[2]);
    }
    return;
}
private static native long __fieldRead255_0();
private static native com.moon.module.Module __call255_2(com.moon.m4 a0);
private static native java.lang.String __call255_3(com.moon.module.Module a0);
private static native void __directSuperInit255_4(com.moon.nu a0, java.lang.String a1);
private static native int[] __call255_5();
private static native void __fieldWrite255_6(com.moon.nu a0, com.moon.m4 a1);
private static native java.lang.String[] __call255_9();
private static native void __call255_10(int[] a0);

}


static {
com.moon.nu.f = (moom._c.a(-6374564677894313503L, -6357064637197705443L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(22064137089971L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a() {
return (__sourceIntrinsic_booleanComparison((((com.moon.m4)(this.d)).e__Boolean())) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
