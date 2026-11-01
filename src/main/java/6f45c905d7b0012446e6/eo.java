package com.moon;


public class eo extends com.moon.event.Event {

private float a;

private float c;

private float d;

private static long e;

public eo(float p0, float p1, float p2) { super(); __sourceHandlerCall_0ddb3ea5e73abfa65faa(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_0ddb3ea5e73abfa65faa(com.moon.eo a0, float a1, float a2, float a3) throws E;
private static final class __SourceHandler_0ddb3ea5e73abfa65faa {

public static void f42(com.moon.eo receiver, float p0, float p1, float p2) throws Throwable {
    long local4_life1 = (__fieldRead42_0() ^ 78850930471403L);
    java.lang.String[] __sourceSpill42_3 = __call42_2();
    __directSuperInit42_4(receiver);
    java.lang.String[] local6_life5 = __sourceSpill42_3;
    __fieldWrite42_6(receiver, p0);
    __fieldWrite42_7(receiver, p1);
    __fieldWrite42_8(receiver, p2);
    if ((local6_life5 == null)) {
        __call42_9(new java.lang.String[1]);
    }
    return;
}
private static native long __fieldRead42_0();
private static native java.lang.String[] __call42_2();
private static native void __directSuperInit42_4(com.moon.eo a0);
private static native void __fieldWrite42_6(com.moon.eo a0, float a1);
private static native void __fieldWrite42_7(com.moon.eo a0, float a1);
private static native void __fieldWrite42_8(com.moon.eo a0, float a1);
private static native void __call42_9(java.lang.String[] a0);

}


static {
com.moon.eo.e = (moom._c.a(8068668266053960041L, 5174211394515564677L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(177734208182409L);
}


public com.moon.eo b(float p0) {
this.c = ((float)(p0));
    return this;
}


public float b__sourceReturn_bc607678b6() {
return this.c;
}


public com.moon.eo c(float p0) {
this.d = ((float)(p0));
    return this;
}


public float c() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float a() {
return this.a;
}


public com.moon.eo a(float p0) {
this.a = ((float)(p0));
    return this;
}

}
