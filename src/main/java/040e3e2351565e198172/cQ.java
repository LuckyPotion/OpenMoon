package com.moon;


public class cQ {

private java.lang.String a;

private java.lang.String b;

private static long c;

public cQ() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_786a90be0d34489432cf(com.moon.cQ a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_786a90be0d34489432cf {

public static void f18(com.moon.cQ receiver, java.lang.String p0, java.lang.String p1) throws Throwable {
    long local3_life1 = (__fieldRead18_0() ^ 36621707499119L);
    int __sourceSpill18_3 = __call18_2();
    __directSuperInit18_4(receiver);
    __fieldWrite18_5(receiver, p0);
    int local5_life6 = __sourceSpill18_3;
    __fieldWrite18_7(receiver, p1);
    if ((__call18_8() != null)) {
        local5_life6 += 1;
        __call18_9(local5_life6);
    }
    return;
}
private static native long __fieldRead18_0();
private static native int __call18_2();
private static native void __directSuperInit18_4(com.moon.cQ a0);
private static native void __fieldWrite18_5(com.moon.cQ a0, java.lang.String a1);
private static native void __fieldWrite18_7(com.moon.cQ a0, java.lang.String a1);
private static native java.lang.String[] __call18_8();
private static native void __call18_9(int a0);

}


public cQ(java.lang.String p0, java.lang.String p1) { super(); __sourceHandlerCall_786a90be0d34489432cf(this, p0, p1); }


static {
com.moon.cQ.c = (moom._c.a(-4277006417824872240L, 151721530719656652L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(23195190760632L);
}


public com.moon.cQ b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
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


public com.moon.cQ a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}

}
