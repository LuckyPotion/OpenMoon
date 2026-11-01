package com.moon.event;


public class MoveEvent extends com.moon.event.CancellableEvent {

private com.moon.event.MovePhase phase;

private double x;

private double y;

private double z;

private float h;

private float i;

private boolean j;

private static boolean k;

private static long l;

public MoveEvent(com.moon.event.MovePhase p0, double p1, double p2, double p3, float p4, float p5, boolean p6) { super(); __sourceHandlerCall_01bccd8a9a549d182850(this, p0, p1, p2, p3, p4, p5, p6); }

private static native <E extends Throwable> void __sourceHandlerCall_01bccd8a9a549d182850(com.moon.event.MoveEvent a0, com.moon.event.MovePhase a1, double a2, double a3, double a4, float a5, float a6, boolean a7) throws E;
private static final class __SourceHandler_01bccd8a9a549d182850 {

public static void f44(com.moon.event.MoveEvent receiver, com.moon.event.MovePhase p0, double p1, double p2, double p3, float p4, float p5, boolean p6) throws Throwable {
    long local11_life1 = (__fieldRead44_0() ^ 124744239741549L);
    boolean __sourceSpill44_3 = __call44_2();
    __directSuperInit44_4(receiver);
    boolean local13_life5 = __sourceSpill44_3;
    __fieldWrite44_6(receiver, p0);
    __fieldWrite44_7(receiver, p1);
    __fieldWrite44_8(receiver, p2);
    __fieldWrite44_9(receiver, p3);
    __fieldWrite44_10(receiver, p4);
    __fieldWrite44_11(receiver, p5);
    __fieldWrite44_12(receiver, p6);
    if ((__call44_13() != null)) {
        __call44_14((local13_life5 ? 0 : 1));
    }
    return;
}
private static native long __fieldRead44_0();
private static native boolean __call44_2();
private static native void __directSuperInit44_4(com.moon.event.MoveEvent a0);
private static native void __fieldWrite44_6(com.moon.event.MoveEvent a0, com.moon.event.MovePhase a1);
private static native void __fieldWrite44_7(com.moon.event.MoveEvent a0, double a1);
private static native void __fieldWrite44_8(com.moon.event.MoveEvent a0, double a1);
private static native void __fieldWrite44_9(com.moon.event.MoveEvent a0, double a1);
private static native void __fieldWrite44_10(com.moon.event.MoveEvent a0, float a1);
private static native void __fieldWrite44_11(com.moon.event.MoveEvent a0, float a1);
private static native void __fieldWrite44_12(com.moon.event.MoveEvent a0, boolean a1);
private static native java.lang.String[] __call44_13();
private static native void __call44_14(int a0);

}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-892796484388471351L)), ((long)(1360629024668592316L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(103320692863902L)))));
    if (com.moon.event.MoveEvent.d()) {
        com.moon.event.MoveEvent.b(((boolean)(true)));
    }
}


public boolean b__Boolean() {
return ((((this.j) ? 1 : 0)) != 0);
}


public com.moon.event.MoveEvent setY(double p0) {
this.y = ((double)(p0));
    return this;
}


public static void b(boolean p0) {
k = ((boolean)(p0));
    return;
}


public com.moon.event.MoveEvent b(float p0) {
this.i = ((float)(p0));
    return this;
}


public double getY() {
return this.y;
}


public float b__sourceReturn_bc607678b6() {
return this.i;
}


public com.moon.event.MoveEvent setZ(double p0) {
this.z = ((double)(p0));
    return this;
}


public static boolean c() {
return ((((com.moon.event.MoveEvent.k) ? 1 : 0)) != 0);
}


public double getZ() {
return this.z;
}


public static boolean d() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.event.MoveEvent.c());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public double getX() {
return this.x;
}


public float a__sourceReturn_bc607678b6() {
return this.h;
}


public com.moon.event.MoveEvent setX(double p0) {
this.x = ((double)(p0));
    return this;
}


public com.moon.event.MovePhase getPhase() {
return this.phase;
}


public com.moon.event.MoveEvent a(float p0) {
this.h = ((float)(p0));
    return this;
}


public com.moon.event.MoveEvent a(boolean p0) {
this.j = ((boolean)(p0));
    return this;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
