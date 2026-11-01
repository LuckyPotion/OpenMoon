package com.moon;


public class gR implements java.util.function.Supplier {

private final com.moon.module.impl.HUD a;

private static java.lang.String[] b;

private static final long c;

public gR(com.moon.module.impl.HUD p0) {
super();
    this.a = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5608633841343910580L)), ((long)(-3217909264202907363L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48312192828527L)))));
    if ((com.moon.gR.b() != null)) {
        com.moon.gR.b(((java.lang.String[])(new java.lang.String[2])));
    }
}


public java.lang.Object get() {
return this.a();
}


public static java.lang.String[] b() {
return com.moon.gR.b;
}


public static void b(java.lang.String[] p0) {
com.moon.gR.b = ((java.lang.String[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.Boolean a() {
java.lang.Object forwardValue253_19_0;
    int forwardValue253_24_0;
    java.lang.Boolean forwardValue253_30_0;
    java.lang.Boolean spill253_0;
    java.lang.Boolean spill253_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.gR.c ^ 29620700045833L);
    life3_5 = com.moon.gR.b();
    spill253_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.a)).p())).getValue()));
    if (!((life3_5 == null))) {
        forwardValue253_19_0 = spill253_0;
        break forward_join_19;
    }
    if (!(((java.lang.Boolean)(spill253_0)).booleanValue())) {
        break forward_join_23;
    }
    forwardValue253_19_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.a)).f__kY())).getValue();
    }
    if (!((forwardValue253_19_0 == com.moon.bY.INDIVIDUAL))) {
        break forward_join_23;
    }
    forwardValue253_24_0 = 1;
    break forward_join_24;
    }
    forwardValue253_24_0 = 0;
    }
    spill253_1 = java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue253_24_0))));
    if (!((life3_5 != null))) {
        forwardValue253_30_0 = spill253_1;
        break forward_join_30;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    forwardValue253_30_0 = spill253_1;
    }
    return forwardValue253_30_0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
