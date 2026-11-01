package moom;


public class Oa {

private float a;

private float b;

private float c;

private long d;

private static final long e;

public Oa(float p0, float p1) {
this(p0, p1, p1);
}


public Oa(float p0, float p1, float p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = java.lang.System.currentTimeMillis();
}


static {
e = (moom._c.a(-5620743441758403188L, 2618585546636285965L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(264940309451884L);
}


public float b() {
return this.b;
}


public float c() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static float a(float p0, float p1, float p2, float p3) {
float forwardValue2897_16_0;
    float forwardValue2897_16_1;
    float forwardValue2897_77_0;
    float spill2897_0;
    float spill2897_1;
    float spill2897_2;
    float spill2897_3;
    float spill2897_4;
    long life4_3;
    int life6_5;
    float life7_22;
    float life9_60;
    float life10_62;
    float life11_64;
    float life12_66;
    float life13_76;
    float life14_82;
    float life14_87;
    float life8_93;
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_16: {
    forward_join_14: {
    life4_3 = (moom.Oa.e ^ 40623781538503L);
    life6_5 = moom.Ob.b();
    spill2897_0 = p2;
    spill2897_1 = 0x0.0p0f;
    if (!((life6_5 == 0))) {
        forwardValue2897_16_0 = spill2897_0;
        forwardValue2897_16_1 = spill2897_1;
        break forward_join_16;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill2897_0)), ((float)(spill2897_1))) <= 0))) {
        break forward_join_14;
    }
    return p0;
    }
    forwardValue2897_16_0 = p1;
    forwardValue2897_16_1 = p0;
    }
    life7_22 = (forwardValue2897_16_0 - forwardValue2897_16_1);
    spill2897_2 = p3;
    if (!((life6_5 == 0))) {
        forwardValue2897_77_0 = spill2897_2;
        break forward_join_77;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill2897_2)), ((float)(0x0.0p0f))) > 0))) {
        break forward_join_76;
    }
    spill2897_3 = p2;
    if (!((life6_5 == 0))) {
        forwardValue2897_77_0 = spill2897_3;
        break forward_join_77;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill2897_3)), ((float)(p3))) < 0))) {
        break forward_join_76;
    }
    spill2897_4 = java.lang.Math.abs(((float)(life7_22)));
    if (!((life6_5 == 0))) {
        forwardValue2897_77_0 = spill2897_4;
        break forward_join_77;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill2897_4)), ((float)(0x1.0c6f7ap-20f))) > 0))) {
        break forward_join_76;
    }
    life9_60 = (p3 / p2);
    life10_62 = 0x1.270a3ep2f;
    life11_64 = 0x1.0a3d7p-3f;
    life12_66 = 0x1.4p3f;
    life13_76 = (life10_62 - (0x1.0p0f / (life11_64 + (life9_60 / life12_66))));
    life14_82 = ((p2 / p3) * life13_76);
    life14_87 = moom.N8.a(((float)(life14_82)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life8_93 = (p0 + (life7_22 * life14_87));
    if (!((life6_5 != 0))) {
        break forward_join_78;
    }
    }
    forwardValue2897_77_0 = p1;
    }
    life8_93 = forwardValue2897_77_0;
    }
    return life8_93;
}


public float a(float p0) {
float forwardValue2896_29_0;
    float forwardValue2896_32_0;
    int spill2896_0;
    float spill2896_1;
    long life2_3;
    long life5_6;
    int life4_7;
    float life7_10;
    long life8_13;
    float life10_20;
    float life11_38;
    float life12_44;
    forward_join_32: {
    forward_join_30: {
    forward_join_29: {
    life2_3 = (moom.Oa.e ^ 36985765268037L);
    spill2896_0 = moom.Ob.b();
    life5_6 = java.lang.System.currentTimeMillis();
    life4_7 = spill2896_0;
    life7_10 = this.a;
    life8_13 = this.d;
    life10_20 = (((float) (life5_6 - life8_13)) / 0x1.f4p9f);
    spill2896_1 = p0;
    if (!((life4_7 == 0))) {
        forwardValue2896_29_0 = spill2896_1;
        break forward_join_29;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill2896_1)), ((float)(life7_10))) >= 0))) {
        break forward_join_30;
    }
    forwardValue2896_29_0 = this.b;
    }
    forwardValue2896_32_0 = forwardValue2896_29_0;
    break forward_join_32;
    }
    forwardValue2896_32_0 = this.c;
    }
    life11_38 = forwardValue2896_32_0;
    life12_44 = moom.Oa.a(((float)(life7_10)), ((float)(p0)), ((float)(life10_20)), ((float)(life11_38)));
    this.a = ((float)(life12_44));
    this.d = ((long)(life5_6));
    return life12_44;
}


public float a(float p0, float p1, float p2) {
this.b = ((float)(p1));
    this.c = ((float)(p2));
    return this.a(((float)(p0)));
}


public long a__Long() {
return this.d;
}


public float a() {
return this.a;
}

}
