package com.moon;


public class oe {

private java.lang.String a;

private java.lang.String b;

private java.util.function.Consumer<java.lang.String> c;

private java.util.function.Consumer<java.lang.Void> d;

private java.util.function.Consumer<java.lang.Runnable> e;

private static long f;

oe(java.lang.String p0, java.lang.String p1, java.util.function.Consumer<java.lang.String> p2, java.util.function.Consumer<java.lang.Void> p3, java.util.function.Consumer<java.lang.Runnable> p4) { super(); __sourceHandlerCall_f3f0faf98607cca25de9(this, p0, p1, p2, p3, p4); }

private static native <E extends Throwable> void __sourceHandlerCall_f3f0faf98607cca25de9(com.moon.oe a0, java.lang.String a1, java.lang.String a2, java.util.function.Consumer a3, java.util.function.Consumer a4, java.util.function.Consumer a5) throws E;
private static final class __SourceHandler_f3f0faf98607cca25de9 {

public static void f274(com.moon.oe receiver, java.lang.String p0, java.lang.String p1, java.util.function.Consumer p2, java.util.function.Consumer p3, java.util.function.Consumer p4) throws Throwable {
    long local6_life1 = (__fieldRead274_0() ^ 92339729057352L);
    __directSuperInit274_2(receiver);
    int[] __sourceSpill274_5 = __call274_3();
    __fieldWrite274_4(receiver, p0);
    int[] local8_life6 = __sourceSpill274_5;
    __fieldWrite274_7(receiver, p1);
    __fieldWrite274_8(receiver, p2);
    __fieldWrite274_9(receiver, p3);
    __fieldWrite274_10(receiver, p4);
    if ((__call274_11() != null)) {
        __call274_12(new int[4]);
    }
    return;
}
private static native long __fieldRead274_0();
private static native void __directSuperInit274_2(com.moon.oe a0);
private static native int[] __call274_3();
private static native void __fieldWrite274_4(com.moon.oe a0, java.lang.String a1);
private static native void __fieldWrite274_7(com.moon.oe a0, java.lang.String a1);
private static native void __fieldWrite274_8(com.moon.oe a0, java.util.function.Consumer a1);
private static native void __fieldWrite274_9(com.moon.oe a0, java.util.function.Consumer a1);
private static native void __fieldWrite274_10(com.moon.oe a0, java.util.function.Consumer a1);
private static native java.lang.String[] __call274_11();
private static native void __call274_12(int[] a0);

}


static {
com.moon.oe.f = (moom._c.a(-5310490348809096140L, 8848324393087055808L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(171155824914966L);
}


public java.util.function.Consumer<java.lang.Void> b__Consumer() {
return this.d;
}


public java.lang.String b() {
return this.b;
}


public java.util.function.Consumer<java.lang.Runnable> c() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.function.Consumer<java.lang.String> a__Consumer() {
return this.c;
}


public java.lang.String a__String() {
return this.a;
}


public static com.moon.of a() {
return new com.moon.of();
}

}
