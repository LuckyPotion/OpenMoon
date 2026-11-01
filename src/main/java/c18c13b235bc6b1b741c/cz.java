package com.moon;


public class cz {

private int a;

private int b;

private long c;

private static long d;

public cz() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_2a0e81aca18e05c19b83(com.moon.cz a0, int a1, int a2, long a3) throws E;
private static final class __SourceHandler_2a0e81aca18e05c19b83 {

public static void f28(com.moon.cz receiver, int p0, int p1, long p2) throws Throwable {
    long local5_life1 = (__fieldRead28_0() ^ 43775829546150L);
    int[] __sourceSpill28_3 = __call28_2();
    __directSuperInit28_4(receiver);
    int[] local7_life5 = __sourceSpill28_3;
    __fieldWrite28_6(receiver, p0);
    __fieldWrite28_7(receiver, p1);
    __fieldWrite28_8(receiver, p2);
    if ((__call28_9() != null)) {
        __call28_10(new int[5]);
    }
    return;
}
private static native long __fieldRead28_0();
private static native int[] __call28_2();
private static native void __directSuperInit28_4(com.moon.cz a0);
private static native void __fieldWrite28_6(com.moon.cz a0, int a1);
private static native void __fieldWrite28_7(com.moon.cz a0, int a1);
private static native void __fieldWrite28_8(com.moon.cz a0, long a1);
private static native java.lang.String[] __call28_9();
private static native void __call28_10(int[] a0);

}


public cz(int p0, int p1, long p2) { super(); __sourceHandlerCall_2a0e81aca18e05c19b83(this, p0, p1, p2); }


static {
com.moon.cz.d = (moom._c.a(-6794887873137319480L, 8828072353846850428L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(171375077437798L);
}


public com.moon.cz b(int p0) {
this.b = ((int)(p0));
    return this;
}


public int b() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.a;
}


public long a__Long() {
return this.c;
}


public com.moon.cz a(int p0) {
this.a = ((int)(p0));
    return this;
}


public com.moon.cz a(long p0) {
this.c = ((long)(p0));
    return this;
}

}
