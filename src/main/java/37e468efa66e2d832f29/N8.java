package moom;


public class N8 {

private static final long a;

public N8() {
super();
}


static {
a = (moom._c.a(1641418947485496581L, 276759959571797288L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(85675670394663L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static int a(int p0, int p1) {
int forwardValue2772_19_0;
    int spill2772_0;
    int spill2772_1;
    long life2_3;
    int life5_8;
    int life4_9;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.N8.a ^ 76857003593347L);
    spill2772_0 = moom.Ob.c();
    life5_8 = (p0 % p1);
    life4_9 = spill2772_0;
    spill2772_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue2772_19_0 = spill2772_1;
        break forward_join_19;
    }
    if (!((spill2772_1 < 0))) {
        break forward_join_18;
    }
    life5_8 = (life5_8 + p1);
    }
    forwardValue2772_19_0 = life5_8;
    }
    return forwardValue2772_19_0;
}


public static float a(float p0, float p1, float p2) {
float forwardValue2771_16_0;
    float forwardValue2771_16_1;
    float forwardValue2771_17_0;
    float spill2771_0;
    float spill2771_1;
    long life3_3;
    int life5_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (moom.N8.a ^ 68609102016374L);
    life5_5 = moom.Ob.b();
    spill2771_0 = p0;
    spill2771_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue2771_16_0 = spill2771_0;
        forwardValue2771_16_1 = spill2771_1;
        break forward_join_16;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill2771_0)), ((float)(spill2771_1))) < 0))) {
        break forward_join_14;
    }
    forwardValue2771_17_0 = p1;
    break forward_join_17;
    }
    forwardValue2771_16_0 = p0;
    forwardValue2771_16_1 = p2;
    }
    forwardValue2771_17_0 = java.lang.Math.min(((float)(forwardValue2771_16_0)), ((float)(forwardValue2771_16_1)));
    }
    return forwardValue2771_17_0;
}

}
