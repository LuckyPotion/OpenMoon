package net.minecraft.util;


public class EnumFacing$Plane extends sourcebuild.EnumConstructor<net.minecraft.util.EnumFacing$Plane> implements com.google.common.base.Predicate<moom.bs>, java.lang.Iterable<moom.bs> {

public static net.minecraft.util.EnumFacing$Plane HORIZONTAL;

public static net.minecraft.util.EnumFacing$Plane VERTICAL;

private static net.minecraft.util.EnumFacing$Plane[] a;

private static long b;

private EnumFacing$Plane(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(1456937422097371241L)), ((long)(-7109320840455333263L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(88188347023988L)))));
    HORIZONTAL = ((net.minecraft.util.EnumFacing$Plane)(new net.minecraft.util.EnumFacing$Plane("HORIZONTAL", 0)));
    VERTICAL = ((net.minecraft.util.EnumFacing$Plane)(new net.minecraft.util.EnumFacing$Plane("VERTICAL", 1)));
    a = ((net.minecraft.util.EnumFacing$Plane[])(net.minecraft.util.EnumFacing$Plane.a__Arraybv()));
}


public static net.minecraft.util.EnumFacing$Plane[] values() {
return ((net.minecraft.util.EnumFacing$Plane[])(((net.minecraft.util.EnumFacing$Plane[])(net.minecraft.util.EnumFacing$Plane.a)).clone()));
}


public static net.minecraft.util.EnumFacing$Plane valueOf(java.lang.String p0) {
return ((net.minecraft.util.EnumFacing$Plane)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.util.EnumFacing$Plane.class)), ((java.lang.String)(p0)))));
}


public java.util.Iterator<moom.bs> iterator() {
return com.google.common.collect.Iterators.forArray(((((net.minecraft.util.EnumFacing$Plane)(this)).a())));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.util.EnumFacing$Plane[] a__Arraybv() {
return new net.minecraft.util.EnumFacing$Plane[] {net.minecraft.util.EnumFacing$Plane.HORIZONTAL, net.minecraft.util.EnumFacing$Plane.VERTICAL};
}


public boolean a(moom.bs p0) {
moom.bs forwardValue5743_11_0;
    int forwardValue5743_18_0;
    moom.bs spill5743_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_11: {
    life2_3 = (net.minecraft.util.EnumFacing$Plane.b ^ 29577973225813L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill5743_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5743_11_0 = spill5743_0;
        break forward_join_11;
    }
    if (!((spill5743_0 != null))) {
        break forward_join_17;
    }
    forwardValue5743_11_0 = p0;
    }
    if (!((((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(forwardValue5743_11_0)).a__bt())).a__bv() == this))) {
        break forward_join_17;
    }
    forwardValue5743_18_0 = 1;
    break forward_join_18;
    }
    forwardValue5743_18_0 = 0;
    }
    return ((forwardValue5743_18_0) != 0);
}


public moom.bs a(java.util.Random p0) {
java.lang.Object[] local2 = ((net.minecraft.util.EnumFacing$Plane)(this)).a();
    return ((moom.bs)((local2)[((java.util.Random)(p0)).nextInt(((int)((local2).length)))]));
}


public moom.bs[] a() {
int forwardValue582_14_0;
    int spill582_0;
    moom.bs[] spill582_1;
    moom.bs[] spill582_2;
    moom.bs[] spill582_3;
    moom.bs[] spill582_4;
    moom.bs[] spill582_5;
    moom.bs[] spill582_6;
    long life1_3;
    int life3_5;
    forward_join_43: {
    forward_join_32: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.util.EnumFacing$Plane.b ^ 94163159439263L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill582_0 = (net.minecraft.util.EnumFacing$1.c)[((net.minecraft.util.EnumFacing$Plane)(this)).ordinal()];
    if (!((life3_5 != 0))) {
        forwardValue582_14_0 = spill582_0;
        break forward_join_14;
    }
    switch (spill582_0) {
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_32;
    }
default:
{
        break forward_join_43;
    }
}
    }
    forwardValue582_14_0 = 4;
    }
    moom.bs[] __stackOp582_5_0 = new moom.bs[forwardValue582_14_0];
    spill582_1 = __stackOp582_5_0;
    (__stackOp582_5_0)[0] = moom.bs.NORTH;
    moom.bs[] __stackOp582_7_0 = spill582_1;
    spill582_2 = __stackOp582_7_0;
    (__stackOp582_7_0)[1] = moom.bs.EAST;
    moom.bs[] __stackOp582_9_0 = spill582_2;
    spill582_3 = __stackOp582_9_0;
    (__stackOp582_9_0)[2] = moom.bs.SOUTH;
    moom.bs[] __stackOp582_11_0 = spill582_3;
    spill582_4 = __stackOp582_11_0;
    (__stackOp582_11_0)[3] = moom.bs.WEST;
    return spill582_4;
    }
    moom.bs[] __stackOp582_13_0 = new moom.bs[2];
    spill582_5 = __stackOp582_13_0;
    (__stackOp582_13_0)[0] = moom.bs.UP;
    moom.bs[] __stackOp582_15_0 = spill582_5;
    spill582_6 = __stackOp582_15_0;
    (__stackOp582_15_0)[1] = moom.bs.DOWN;
    return spill582_6;
    }
    throw new java.lang.Error("Someone's been tampering with the universe!");
}


public boolean apply__sourceBridge_9ea2dcf14c(java.lang.Object p0) {
return ((net.minecraft.util.EnumFacing$Plane)(this)).a(((moom.bs)(((moom.bs)(p0)))));
}

public boolean apply(moom.bs __bridgeParam0) { return ((boolean)(this.apply__sourceBridge_9ea2dcf14c(((java.lang.Object)(__bridgeParam0))))); }
}
