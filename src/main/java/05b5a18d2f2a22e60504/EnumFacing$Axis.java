package net.minecraft.util;


public class EnumFacing$Axis extends sourcebuild.EnumConstructor<net.minecraft.util.EnumFacing$Axis> implements com.google.common.base.Predicate<moom.bs>, net.minecraft.util.IStringSerializable {

public static net.minecraft.util.EnumFacing$Axis X;

public static net.minecraft.util.EnumFacing$Axis Y;

public static net.minecraft.util.EnumFacing$Axis Z;

private static java.util.Map<java.lang.String, net.minecraft.util.EnumFacing$Axis> a;

private java.lang.String b;

private net.minecraft.util.EnumFacing$Plane c;

private static net.minecraft.util.EnumFacing$Axis[] d;

private static long e;

private EnumFacing$Axis(java.lang.String p0, int p1, java.lang.String p2, net.minecraft.util.EnumFacing$Plane p3) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-1265417662653610308L)), ((long)(2487649383537980356L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(30074537242928L)))));
    X = ((net.minecraft.util.EnumFacing$Axis)(new net.minecraft.util.EnumFacing$Axis("X", 0, "x", net.minecraft.util.EnumFacing$Plane.HORIZONTAL)));
    Y = ((net.minecraft.util.EnumFacing$Axis)(new net.minecraft.util.EnumFacing$Axis("Y", 1, "y", net.minecraft.util.EnumFacing$Plane.VERTICAL)));
    Z = ((net.minecraft.util.EnumFacing$Axis)(new net.minecraft.util.EnumFacing$Axis("Z", 2, "z", net.minecraft.util.EnumFacing$Plane.HORIZONTAL)));
    d = ((net.minecraft.util.EnumFacing$Axis[])(net.minecraft.util.EnumFacing$Axis.a__Arraybt()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    net.minecraft.util.EnumFacing$Axis[] local0_life16 = net.minecraft.util.EnumFacing$Axis.values();
    int local1_life17 = (local0_life16).length;
    int local2_life18 = 0;
    while ((local2_life18 < local1_life17)) {
        net.minecraft.util.EnumFacing$Axis local3_life19 = (local0_life16)[local2_life18];
        ((java.util.Map)(net.minecraft.util.EnumFacing$Axis.a)).put(((java.lang.Object)(((java.lang.String)(((net.minecraft.util.EnumFacing$Axis)(local3_life19)).b())).toLowerCase())), ((java.lang.Object)(local3_life19)));
        local2_life18 += 1;
    }
}


public java.lang.String toString() {
return this.b;
}


public static net.minecraft.util.EnumFacing$Axis[] values() {
return ((net.minecraft.util.EnumFacing$Axis[])(((net.minecraft.util.EnumFacing$Axis[])(net.minecraft.util.EnumFacing$Axis.d)).clone()));
}


public static net.minecraft.util.EnumFacing$Axis valueOf(java.lang.String p0) {
return ((net.minecraft.util.EnumFacing$Axis)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.util.EnumFacing$Axis.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.b;
}


public boolean b__Boolean() {
long local1 = (net.minecraft.util.EnumFacing$Axis.e ^ 14885888238715L);
    return ((((this.c == net.minecraft.util.EnumFacing$Plane.HORIZONTAL) ? 1 : 0)) != 0);
}


public java.lang.String a__String() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.util.EnumFacing$Axis[] a__Arraybt() {
return new net.minecraft.util.EnumFacing$Axis[] {net.minecraft.util.EnumFacing$Axis.X, net.minecraft.util.EnumFacing$Axis.Y, net.minecraft.util.EnumFacing$Axis.Z};
}


public boolean a__Boolean() {
long local1 = (net.minecraft.util.EnumFacing$Axis.e ^ 83774287674064L);
    return ((((this.c == net.minecraft.util.EnumFacing$Plane.VERTICAL) ? 1 : 0)) != 0);
}


public static net.minecraft.util.EnumFacing$Axis a(java.lang.String p0) {
java.lang.Object forwardValue5740_16_0;
    net.minecraft.util.EnumFacing$Axis forwardValue5740_17_0;
    java.lang.String spill5740_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (net.minecraft.util.EnumFacing$Axis.e ^ 98173726840203L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5740_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue5740_16_0 = spill5740_0;
        break forward_join_16;
    }
    if (!((spill5740_0 == null))) {
        break forward_join_12;
    }
    forwardValue5740_17_0 = null;
    break forward_join_17;
    }
    forwardValue5740_16_0 = ((java.util.Map)(net.minecraft.util.EnumFacing$Axis.a)).get(((java.lang.Object)(((java.lang.String)(p0)).toLowerCase())));
    }
    forwardValue5740_17_0 = ((net.minecraft.util.EnumFacing$Axis)(forwardValue5740_16_0));
    }
    return forwardValue5740_17_0;
}


public boolean a(moom.bs p0) {
moom.bs forwardValue5741_11_0;
    int forwardValue5741_17_0;
    moom.bs spill5741_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (net.minecraft.util.EnumFacing$Axis.e ^ 112585896284355L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5741_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5741_11_0 = spill5741_0;
        break forward_join_11;
    }
    if (!((spill5741_0 != null))) {
        break forward_join_16;
    }
    forwardValue5741_11_0 = p0;
    }
    if (!((((moom.bs)(forwardValue5741_11_0)).a__bt() == this))) {
        break forward_join_16;
    }
    forwardValue5741_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5741_17_0 = 0;
    }
    return ((forwardValue5741_17_0) != 0);
}


public net.minecraft.util.EnumFacing$Plane a__bv() {
return this.c;
}


public boolean apply__sourceBridge_9ea2dcf14c(java.lang.Object p0) {
return ((net.minecraft.util.EnumFacing$Axis)(this)).a(((moom.bs)(((moom.bs)(p0)))));
}

public boolean apply(moom.bs __bridgeParam0) { return ((boolean)(this.apply__sourceBridge_9ea2dcf14c(((java.lang.Object)(__bridgeParam0))))); }
}
