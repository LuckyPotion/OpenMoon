package com.moon;


public final class n8 {

private static final float[] a;

private static final float[] b;

private static final net.minecraft.client.Minecraft c;

private static final long d;

private n8() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(6257292140414982761L)), ((long)(-7579673193280480527L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(59454160880367L)))));
    a = ((float[])(new float[] {0x1.0p0f, com.moon.nI.d}));
    b = ((float[])(new float[] {0x1.f5c29p-1f, 0x1.2d0e58p-2f, 0x1.916874p-3f, 0x1.e1b08ep-5f}));
    c = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static float[] a(float p0, float p1, float p2, float p3, float p4) {
int lexicalValue272_87_0;
    boolean spill272_0;
    int spill272_1;
    float[] spill272_2;
    float[] spill272_3;
    long life5_3;
    float life8_6;
    float life9_9;
    float life10_12;
    float life11_14;
    float life12_16;
    float[] life13_18;
    int life14_21;
    int life15_23;
    int life7_24;
    float life16_31;
    float life17_39;
    float life18_49;
    float life19_59;
    float life20_68;
    lexical_join_87: {
    lexical_join_86: {
    life5_3 = (com.moon.n8.d ^ 904959507638L);
    life8_6 = moom.Dr.a(((float)(p0)));
    life9_9 = moom.Dr.b(((float)(p0)));
    spill272_0 = __sourceExactCall_947f444da39f47();
    life10_12 = 0x0.0p0f;
    life11_14 = 0x0.0p0f;
    life12_16 = 0x1.fffffep127f;
    life13_18 = com.moon.n8.a;
    life14_21 = (life13_18).length;
    life15_23 = 0;
    life7_24 = ((spill272_0) ? 1 : 0);
    lexical_cycle_25: while (true) {
    lexical_join_84: {
    lexical_join_83: {
    if (!((life15_23 < life14_21))) {
        break lexical_join_86;
    }
    life16_31 = (life13_18)[life15_23];
    life17_39 = (java.lang.Math.max(((float)(0x1.0p0f)), ((float)((p4 * life16_31)))) / p3);
    life18_49 = (life17_39 * ((p2 * life9_9) - (p1 * life8_6)));
    life19_59 = (life17_39 * ((p1 * life9_9) + (p2 * life8_6)));
    life20_68 = java.lang.Math.abs(((float)((java.lang.Math.max(((float)(java.lang.Math.abs(((float)(life18_49))))), ((float)(java.lang.Math.abs(((float)(life19_59)))))) - p4))));
    if (!((life7_24 != 0))) {
        break lexical_join_84;
    }
    spill272_1 = recovery.source.CarrierOps.fcmpg(((float)(life20_68)), ((float)(life12_16)));
    if (!((life7_24 != 0))) {
        lexicalValue272_87_0 = spill272_1;
        break lexical_join_87;
    }
    if (!((spill272_1 < 0))) {
        break lexical_join_83;
    }
    life12_16 = life20_68;
    life10_12 = life18_49;
    life11_14 = life19_59;
    }
    life15_23 += 1;
    }
    if (!((life7_24 == 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue272_87_0 = 2;
    }
    float[] __stackOp272_12_0 = new float[lexicalValue272_87_0];
    spill272_2 = __stackOp272_12_0;
    (__stackOp272_12_0)[0] = life10_12;
    float[] __stackOp272_13_0 = spill272_2;
    spill272_3 = __stackOp272_13_0;
    (__stackOp272_13_0)[1] = life11_14;
    return spill272_3;
}


public static float[] a(float p0, float p1, float p2, float p3) {
float forwardValue1010_45_0;
    float forwardValue1010_45_1;
    int forwardValue1010_70_0;
    boolean spill1010_0;
    int spill1010_1;
    float spill1010_2;
    float spill1010_3;
    float[] spill1010_4;
    float[] spill1010_5;
    long life4_3;
    float life7_5;
    float life8_8;
    float life9_16;
    int life6_17;
    float life9_29;
    float life9_44;
    float life1_52;
    float life10_55;
    float life11_58;
    forward_join_70: {
    forward_join_69: {
    forward_join_45: {
    forward_join_35: {
    life4_3 = (com.moon.n8.d ^ 114151237466984L);
    life7_5 = 0x0.0p0f;
    spill1010_0 = moom.fw.a__Boolean();
    life8_8 = 0x0.0p0f;
    life9_16 = ((p2 * p2) + (p1 * p1));
    life6_17 = ((spill1010_0) ? 1 : 0);
    spill1010_1 = recovery.source.CarrierOps.fcmpl(((float)(life9_16)), ((float)(0x1.a36e2ep-14f)));
    if (!((life6_17 == 0))) {
        forwardValue1010_70_0 = spill1010_1;
        break forward_join_70;
    }
    if (!((spill1010_1 >= 0))) {
        break forward_join_69;
    }
    life9_29 = moom.Dr.c(((float)(life9_16)));
    spill1010_2 = life9_29;
    spill1010_3 = 0x1.0p0f;
    if (!((life6_17 == 0))) {
        forwardValue1010_45_0 = spill1010_2;
        forwardValue1010_45_1 = spill1010_3;
        break forward_join_45;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill1010_2)), ((float)(spill1010_3))) < 0))) {
        break forward_join_35;
    }
    life9_29 = 0x1.0p0f;
    }
    life9_44 = (p3 / life9_29);
    p2 = (p2 * life9_44);
    forwardValue1010_45_0 = p1;
    forwardValue1010_45_1 = life9_44;
    }
    life1_52 = (forwardValue1010_45_0 * forwardValue1010_45_1);
    life10_55 = moom.Dr.a(((float)(p0)));
    life11_58 = moom.Dr.b(((float)(p0)));
    life7_5 = ((p2 * life11_58) - (life1_52 * life10_55));
    life8_8 = ((life1_52 * life11_58) + (p2 * life10_55));
    }
    forwardValue1010_70_0 = 2;
    }
    float[] __stackOp1010_8_0 = new float[forwardValue1010_70_0];
    spill1010_4 = __stackOp1010_8_0;
    (__stackOp1010_8_0)[0] = life7_5;
    float[] __stackOp1010_9_0 = spill1010_4;
    spill1010_5 = __stackOp1010_9_0;
    (__stackOp1010_9_0)[1] = life8_8;
    return spill1010_5;
}


private static native boolean __sourceExactCall_947f444da39f47();
}
