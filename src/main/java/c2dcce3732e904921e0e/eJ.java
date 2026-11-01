package com.moon;


public class eJ extends com.moon.event.Event {

private int a;

private boolean c;

private static int[] d;

private static long e;

public eJ(int p0, boolean p1) { super(); __sourceHandlerCall_24c1bc307edcf648456d(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_24c1bc307edcf648456d(com.moon.eJ a0, int a1, boolean a2) throws E;
private static final class __SourceHandler_24c1bc307edcf648456d {

public static void f36(com.moon.eJ receiver, int p0, boolean p1) throws Throwable {
    long local3_life1 = (__fieldRead36_0() ^ 139574454267507L);
    __directSuperInit36_2(receiver);
    int[] __sourceSpill36_5 = __call36_3();
    __fieldWrite36_4(receiver, p0);
    int[] local5_life6 = __sourceSpill36_5;
    __fieldWrite36_7(receiver, p1);
    if ((__call36_8() != null)) {
        __call36_9(new int[5]);
    }
    return;
}
private static native long __fieldRead36_0();
private static native void __directSuperInit36_2(com.moon.eJ a0);
private static native int[] __call36_3();
private static native void __fieldWrite36_4(com.moon.eJ a0, int a1);
private static native void __fieldWrite36_7(com.moon.eJ a0, boolean a1);
private static native java.lang.String[] __call36_8();
private static native void __call36_9(int[] a0);

}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-7054565096027607683L)), ((long)(-276836202073219804L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(105262979047078L)))));
    if ((com.moon.eJ.a__ArrayInt() == null)) {
        com.moon.eJ.b(((int[])(new int[5])));
    }
}


public static void b(int[] p0) {
d = ((int[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static int[] a__ArrayInt() {
return com.moon.eJ.d;
}


public int a() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}

}
