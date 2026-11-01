package com.moon;


public class og {

private com.moon.oi a;

private com.moon.ok b;

private com.moon.oj c;

private com.moon.oh d;

private static boolean e;

private static long f;

public og(com.moon.od p0) { super(); __sourceHandlerCall_8761ec35751162c55e1a(this, p0); }

private static native <E extends Throwable> void __sourceHandlerCall_8761ec35751162c55e1a(com.moon.og a0, com.moon.od a1) throws E;
private static final class __SourceHandler_8761ec35751162c55e1a {

public static void f275(com.moon.og receiver, com.moon.od p0) throws Throwable {
    long local2_life1 = (__fieldRead275_0() ^ 56132040809760L);
    boolean __sourceSpill275_3 = __call275_2();
    __directSuperInit275_4(receiver);
    __fieldWrite275_5(receiver, new com.moon.oi(p0));
    __fieldWrite275_6(receiver, new com.moon.ok(p0));
    __fieldWrite275_7(receiver, new com.moon.oj(p0));
    boolean local4_life8 = __sourceSpill275_3;
    __fieldWrite275_9(receiver, new com.moon.oh(p0));
    if (local4_life8) {
        __call275_10(new java.lang.String[1]);
    }
    return;
}
private static native long __fieldRead275_0();
private static native boolean __call275_2();
private static native void __directSuperInit275_4(com.moon.og a0);
private static native void __fieldWrite275_5(com.moon.og a0, com.moon.oi a1);
private static native void __fieldWrite275_6(com.moon.og a0, com.moon.ok a1);
private static native void __fieldWrite275_7(com.moon.og a0, com.moon.oj a1);
private static native void __fieldWrite275_9(com.moon.og a0, com.moon.oh a1);
private static native void __call275_10(java.lang.String[] a0);

}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(1821361475276174956L)), ((long)(5607206990888807632L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(20669014816432L)))));
    if (com.moon.og.c()) {
        com.moon.og.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
e = ((boolean)(p0));
    return;
}


public static boolean b() {
return ((((com.moon.og.e) ? 1 : 0)) != 0);
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.og.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public com.moon.oh a() {
return this.d;
}


public com.moon.oi a__oi() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.ok a__ok() {
return this.b;
}


public com.moon.oj a__oj() {
return this.c;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
