package com.moon;


public class cW {

private java.lang.String a;

private java.lang.String b;

private java.lang.String c;

private static boolean d;

private static long e;

public cW(java.lang.String p0, java.lang.String p1, java.lang.String p2) { super(); __sourceHandlerCall_1dcd0467fb8afcdffb26(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_1dcd0467fb8afcdffb26(com.moon.cW a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_1dcd0467fb8afcdffb26 {

public static void f20(com.moon.cW receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2) throws Throwable {
    long local4_life1 = (__fieldRead20_0() ^ 97060286682578L);
    boolean __sourceSpill20_3 = __call20_2();
    __directSuperInit20_4(receiver);
    boolean local6_life5 = __sourceSpill20_3;
    __fieldWrite20_6(receiver, p0);
    __fieldWrite20_7(receiver, p1);
    __fieldWrite20_8(receiver, p2);
    if ((__call20_9() != null)) {
        __call20_10((local6_life5 ? 0 : 1));
    }
    return;
}
private static native long __fieldRead20_0();
private static native boolean __call20_2();
private static native void __directSuperInit20_4(com.moon.cW a0);
private static native void __fieldWrite20_6(com.moon.cW a0, java.lang.String a1);
private static native void __fieldWrite20_7(com.moon.cW a0, java.lang.String a1);
private static native void __fieldWrite20_8(com.moon.cW a0, java.lang.String a1);
private static native java.lang.String[] __call20_9();
private static native void __call20_10(int a0);

}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(3140925307836486648L)), ((long)(4380854392928135828L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97084392177511L)))));
    if (com.moon.cW.c__Boolean()) {
        com.moon.cW.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
d = ((boolean)(p0));
    return;
}


public static boolean b__Boolean() {
return ((((com.moon.cW.d) ? 1 : 0)) != 0);
}


public java.lang.String b() {
return this.b;
}


public com.moon.cW b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.cW.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public com.moon.cW c(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
    return this;
}


public java.lang.String c() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
return this.a;
}


public com.moon.cW a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
