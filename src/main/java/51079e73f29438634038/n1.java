package com.moon;


public class n1 {

private java.util.UUID a;

private int b;

private boolean c;

private boolean d;

private long e;

private static boolean f;

private static long g;

public n1(java.util.UUID p0) { super(); __sourceHandlerCall_4bc692221cb6883efcf0(this, p0); }

private static native <E extends Throwable> void __sourceHandlerCall_4bc692221cb6883efcf0(com.moon.n1 a0, java.util.UUID a1) throws E;
private static final class __SourceHandler_4bc692221cb6883efcf0 {

public static void f221(com.moon.n1 receiver, java.util.UUID p0) throws Throwable {
    long local2_life1 = (__fieldRead221_0() ^ 63646617660235L);
    boolean __sourceSpill221_3 = __call221_2();
    __directSuperInit221_4(receiver);
    boolean local4_life5 = __sourceSpill221_3;
    __fieldWrite221_6(receiver, 1);
    __fieldWrite221_7(receiver, 0L);
    __fieldWrite221_8(receiver, p0);
    if ((__call221_9() != null)) {
        __call221_10((local4_life5 ? 0 : 1));
    }
    return;
}
private static native long __fieldRead221_0();
private static native boolean __call221_2();
private static native void __directSuperInit221_4(com.moon.n1 a0);
private static native void __fieldWrite221_6(com.moon.n1 a0, int a1);
private static native void __fieldWrite221_7(com.moon.n1 a0, long a1);
private static native void __fieldWrite221_8(com.moon.n1 a0, java.util.UUID a1);
private static native java.lang.String[] __call221_9();
private static native void __call221_10(int a0);

}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-3134497815413984220L)), ((long)(2513777944457528820L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(144930071290881L)))));
    if ((!com.moon.n1.c())) {
        com.moon.n1.b__Void(((boolean)(true)));
    }
}


public boolean b() {
return ((((this.d) ? 1 : 0)) != 0);
}


public static void b__Void(boolean p0) {
f = ((boolean)(p0));
    return;
}


public com.moon.n1 b(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}


public static boolean c() {
return ((((com.moon.n1.f) ? 1 : 0)) != 0);
}


public static boolean d() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.n1.c());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.n1 a(long p0) {
this.e = ((long)(p0));
    return this;
}


public int a() {
return this.b;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public long a__Long() {
return this.e;
}


public com.moon.n1 a(int p0) {
this.b = ((int)(p0));
    return this;
}


public com.moon.n1 a(boolean p0) {
this.c = ((boolean)(p0));
    return this;
}


public java.util.UUID a__UUID() {
return this.a;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
