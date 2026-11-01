package com.moon;


public class cx {

private java.lang.String a;

private java.util.Map<java.lang.String, com.moon.cz> b;

private static int[] c;

private static long f;

public cx() {
super();
    this.b = new java.util.HashMap();
}

private static native <E extends Throwable> void __sourceHandlerCall_c55fd24195ea02ed9b5c(com.moon.cx a0, java.lang.String a1, java.util.Map a2) throws E;
private static final class __SourceHandler_c55fd24195ea02ed9b5c {

public static void f27(com.moon.cx receiver, java.lang.String p0, java.util.Map p1) throws Throwable {
    long local3_life1 = (__fieldRead27_0() ^ 110932581783879L);
    int[] __sourceSpill27_3 = __call27_2();
    __directSuperInit27_4(receiver);
    __fieldWrite27_5(receiver, new java.util.HashMap());
    int[] local5_life6 = __sourceSpill27_3;
    __fieldWrite27_7(receiver, p0);
    __fieldWrite27_8(receiver, p1);
    if ((local5_life6 != null)) {
        __call27_9(new java.lang.String[3]);
    }
    return;
}
private static native long __fieldRead27_0();
private static native int[] __call27_2();
private static native void __directSuperInit27_4(com.moon.cx a0);
private static native void __fieldWrite27_5(com.moon.cx a0, java.util.HashMap a1);
private static native void __fieldWrite27_7(com.moon.cx a0, java.lang.String a1);
private static native void __fieldWrite27_8(com.moon.cx a0, java.util.Map a1);
private static native void __call27_9(java.lang.String[] a0);

}


public cx(java.lang.String p0, java.util.Map<java.lang.String, com.moon.cz> p1) { super(); __sourceHandlerCall_c55fd24195ea02ed9b5c(this, p0, p1); }


static {
f = ((long)(((moom._a)(moom._c.a(((long)(7514642241851747121L)), ((long)(3235090472199771588L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(223038596961348L)))));
    if ((com.moon.cx.b() != null)) {
        com.moon.cx.b(((int[])(new int[3])));
    }
}


public static void b(int[] p0) {
c = ((int[])(p0));
    return;
}


public static int[] b() {
return com.moon.cx.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.Map<java.lang.String, com.moon.cz> a__Map() {
return this.b;
}


public com.moon.cx a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


public com.moon.cx a(java.util.Map<java.lang.String, com.moon.cz> p0) {
this.b = ((java.util.Map)(p0));
    return this;
}


public java.lang.String a() {
return this.a;
}

}
