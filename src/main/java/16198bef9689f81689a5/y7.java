package moom;

import io.netty.buffer.ByteBuf;


public class y7 implements moom.yK<moom.y3> {

protected double a;

protected double b;

protected double c;

protected float d;

protected float e;

protected boolean f;

protected boolean g;

protected boolean h;

protected boolean i;

private static boolean j;

private static long k;

public y7() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_4c855ea3c07b9c22070d(moom.y7 a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_4c855ea3c07b9c22070d {

public static void f1234(moom.y7 receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    net.minecraft.network.PacketBuffer forwardValue1234_13_0;
    int forwardValue1234_13_1;
    net.minecraft.network.PacketBuffer forwardValue1234_14_0;
    net.minecraft.network.PacketBuffer forwardValue1234_15_0;
    int forwardValue1234_15_1;
    net.minecraft.network.PacketBuffer spill1234_0;
    boolean spill1234_1;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead1234_0() ^ 43876035831770L);
    life4_5 = __integerCategory1234_2(__call1234_1());
    spill1234_0 = p0;
    spill1234_1 = __fieldRead1234_3(receiver);
    if (!((life4_5 == 0))) {
        forwardValue1234_13_0 = spill1234_0;
        forwardValue1234_13_1 = __integerCategory1234_4(spill1234_1);
        break forward_join_13;
    }
    if (!(spill1234_1)) {
        forwardValue1234_14_0 = spill1234_0;
        break forward_join_14;
    }
    forwardValue1234_13_0 = spill1234_0;
    forwardValue1234_13_1 = 1;
    }
    forwardValue1234_15_0 = forwardValue1234_13_0;
    forwardValue1234_15_1 = forwardValue1234_13_1;
    break forward_join_15;
    }
    forwardValue1234_15_0 = forwardValue1234_14_0;
    forwardValue1234_15_1 = 0;
    }
    __call1234_5(forwardValue1234_15_0, forwardValue1234_15_1);
    return;
}
public static void h1234_0(java.io.IOException p0) throws Throwable {
    throw __call1123400_0(p0);
}
private static native long __fieldRead1234_0() throws Throwable;
private static native boolean __call1234_1() throws Throwable;
private static native int __integerCategory1234_2(boolean value) throws Throwable;
private static native boolean __fieldRead1234_3(moom.y7 a0) throws Throwable;
private static native int __integerCategory1234_4(boolean value) throws Throwable;
private static native ByteBuf __call1234_5(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1123400_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_87f69d1ed815d24871b8(moom.y7 a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_87f69d1ed815d24871b8 {

public static void f1233(moom.y7 receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    moom.y7 forwardValue1233_13_0;
    int forwardValue1233_13_1;
    moom.y7 forwardValue1233_14_0;
    moom.y7 forwardValue1233_15_0;
    int forwardValue1233_15_1;
    moom.y7 spill1233_0;
    short spill1233_1;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead1233_0() ^ 89276764582995L);
    life4_5 = __integerCategory1233_2(__call1233_1());
    spill1233_0 = receiver;
    spill1233_1 = __call1233_3(p0);
    if (!((life4_5 == 0))) {
        forwardValue1233_13_0 = spill1233_0;
        forwardValue1233_13_1 = __integerCategory1233_4(spill1233_1);
        break forward_join_13;
    }
    if (!((spill1233_1 != 0))) {
        forwardValue1233_14_0 = spill1233_0;
        break forward_join_14;
    }
    forwardValue1233_13_0 = spill1233_0;
    forwardValue1233_13_1 = 1;
    }
    forwardValue1233_15_0 = forwardValue1233_13_0;
    forwardValue1233_15_1 = forwardValue1233_13_1;
    break forward_join_15;
    }
    forwardValue1233_15_0 = forwardValue1233_14_0;
    forwardValue1233_15_1 = 0;
    }
    __fieldWrite1233_5(forwardValue1233_15_0, forwardValue1233_15_1);
    return;
}
public static void h1233_0(java.io.IOException p0) throws Throwable {
    throw __call1123300_0(p0);
}
private static native long __fieldRead1233_0() throws Throwable;
private static native boolean __call1233_1() throws Throwable;
private static native int __integerCategory1233_2(boolean value) throws Throwable;
private static native short __call1233_3(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __integerCategory1233_4(short value) throws Throwable;
private static native void __fieldWrite1233_5(moom.y7 a0, int a1) throws Throwable;
private static native java.lang.Exception __call1123300_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9344d60a62ac578acf68() throws E;
private static final class __SourceHandler_9344d60a62ac578acf68 {

public static boolean f2099() throws Throwable {
    int life0_1;
    life0_1 = __integerCategory2099_1(__call2099_0());
    if ((life0_1 == 0)) {
        return true;
    }
    return false;
}
public static void h2099_0(moom.Oo p0) throws Throwable {
    throw __call1209900_0(p0);
}
private static native boolean __call2099_0() throws Throwable;
private static native int __integerCategory2099_1(boolean value) throws Throwable;
private static native java.lang.Exception __call1209900_0(moom.Oo a0) throws Throwable;

}


public y7(boolean p0) {
super();
    this.f = p0;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(4997516940195942649L)), ((long)(6733531136926500757L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(210049875325153L)))));
    if ((!moom.y7.i())) {
        moom.y7.c__Void(((boolean)(true)));
    }
}


public static boolean i() {
return ((((moom.y7.j) ? 1 : 0)) != 0);
}


public void b__Void(boolean p0) {
this.i = ((boolean)(p0));
    return;
}


public float b__Float() {
return this.e;
}


public boolean b__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public moom.y7 b(boolean p0) {
this.g = ((boolean)(p0));
    return this;
}


public moom.y7 b(float p0) {
this.e = ((float)(p0));
    return this;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_4c855ea3c07b9c22070d(this, p0); }


public double b() {
return this.b;
}


public moom.y7 b(double p0) {
this.b = ((double)(p0));
    return this;
}


public boolean e__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public double e() {
return this.b;
}


public float c__Float() {
return this.d;
}


public moom.y7 c(double p0) {
this.c = ((double)(p0));
    return this;
}


public static void c__Void(boolean p0) {
j = ((boolean)(p0));
    return;
}


public double c() {
return this.c;
}


public boolean c__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public moom.y7 c(boolean p0) {
this.h = ((boolean)(p0));
    return this;
}


public boolean h() {
return ((((this.i) ? 1 : 0)) != 0);
}


public boolean f__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public double f() {
return this.c;
}


public moom.y7 d(boolean p0) {
this.i = ((boolean)(p0));
    return this;
}


public boolean d__Boolean() {
return ((((this.i) ? 1 : 0)) != 0);
}


public float d__Float() {
return this.e;
}


public double d() {
return this.a;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public float a__Float() {
return this.d;
}


public double a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_87f69d1ed815d24871b8(this, p0); }


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.y7)(this)));
    return;
}


public boolean a__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public moom.y7 a(double p0) {
this.a = ((double)(p0));
    return this;
}


public moom.y7 a(float p0) {
this.d = ((float)(p0));
    return this;
}


public void a__Void(boolean p0) {
this.g = ((boolean)(p0));
    return;
}


public moom.y7 a(boolean p0) {
this.f = ((boolean)(p0));
    return this;
}


public boolean g() {
return ((((this.h) ? 1 : 0)) != 0);
}


public static boolean j() { return __sourceHandlerCall_9344d60a62ac578acf68(); }

}
