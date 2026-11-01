package com.moon.security;


public class s extends java.lang.RuntimeException {

private static int[] b;

private static long a;

public s(java.lang.String p0) { super((java.lang.String)null); __sourceHandlerCall_2e2083c10f0d9d8cfc92(this, p0); }

private static native <E extends Throwable> void __sourceHandlerCall_2e2083c10f0d9d8cfc92(com.moon.security.s a0, java.lang.String a1) throws E;
private static final class __SourceHandler_2e2083c10f0d9d8cfc92 {

public static void f482(com.moon.security.s receiver, java.lang.String p0) throws Throwable {
    long local2_life1 = (__fieldRead482_0() ^ 71979123285458L);
    int[] __sourceSpill482_3 = __call482_2();
    __directSuperInit482_4(receiver, p0);
    int[] local4_life5 = __sourceSpill482_3;
    __call482_6(receiver, new java.lang.StackTraceElement[0]);
    if ((__call482_7() != null)) {
        __call482_8(new int[3]);
    }
    return;
}
private static native long __fieldRead482_0();
private static native int[] __call482_2();
private static native void __directSuperInit482_4(com.moon.security.s a0, java.lang.String a1);
private static native void __call482_6(com.moon.security.s a0, java.lang.StackTraceElement[] a1);
private static native java.lang.String[] __call482_7();
private static native void __call482_8(int[] a0);

}

private static native <E extends Throwable> void __sourceHandlerCall_e6393c1a79014020599b(com.moon.security.s a0, java.lang.Throwable a1) throws E;
private static final class __SourceHandler_e6393c1a79014020599b {

public static void f483(com.moon.security.s receiver, java.lang.Throwable p0) throws Throwable {
    long local2_life1 = (__fieldRead483_0() ^ 82128889912407L);
    int[] __sourceSpill483_3 = __call483_2();
    __directSuperInit483_4(receiver, p0);
    int[] local4_life5 = __sourceSpill483_3;
    __call483_6(receiver, new java.lang.StackTraceElement[0]);
    if ((local4_life5 != null)) {
        __call483_7(new java.lang.String[5]);
    }
    return;
}
private static native long __fieldRead483_0();
private static native int[] __call483_2();
private static native void __directSuperInit483_4(com.moon.security.s a0, java.lang.Throwable a1);
private static native void __call483_6(com.moon.security.s a0, java.lang.StackTraceElement[] a1);
private static native void __call483_7(java.lang.String[] a0);

}


public s(java.lang.Throwable p0) { super((java.lang.Throwable)null); __sourceHandlerCall_e6393c1a79014020599b(this, p0); }


static {
a = ((long)(((moom._a)(moom._c.a(((long)(6509549340837137077L)), ((long)(2953414303973987752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(35298353554384L)))));
    if ((com.moon.security.s.b() != null)) {
        com.moon.security.s.b(((int[])(new int[4])));
    }
}


public static int[] b() {
return com.moon.security.s.b;
}


public static void b(int[] p0) {
b = ((int[])(p0));
    return;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}

}
