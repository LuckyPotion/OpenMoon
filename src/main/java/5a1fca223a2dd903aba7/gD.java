package com.moon;


public class gD {

private final com.moon.n4 a;

private final com.moon.n4 b;

private final com.moon.n4 c;

private static boolean d;

private static final long e;

public gD() {
super();
    this.a = new com.moon.n4(0x0.0p+0f, 0x0.0p+0f);
    this.b = new com.moon.n4(0x0.0p+0f, 0x0.0p+0f);
    this.c = new com.moon.n4(0x0.0p+0f, 0x0.0p+0f);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-7322343302725381015L)), ((long)(4975434746137409637L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116482691511611L)))));
    if ((!com.moon.gD.b__Boolean())) {
        com.moon.gD.b(((boolean)(true)));
    }
}


public void b(float p0, float p1) {
((com.moon.n4)(this.c)).a(((float)(p0)), ((float)(p1)));
    return;
}


public void b(float p0) {
this.b(((float)(p0)), ((float)(((com.moon.n4)(this.c)).b__Float())));
    return;
}


public static void b(boolean p0) {
com.moon.gD.d = ((boolean)(p0));
    return;
}


public static boolean b__Boolean() {
return ((((com.moon.gD.d) ? 1 : 0)) != 0);
}


public com.moon.n4 b() {
return this.b;
}


public com.moon.n4 c() {
return this.c;
}


public static boolean c__Boolean() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.gD.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public void c(float p0, float p1) {
((com.moon.n4)(this.c)).a(((float)(p0)), ((float)(p1)));
    ((com.moon.n4)(this.a)).a(((float)(p0)), ((float)(p1)));
    ((com.moon.n4)(this.b)).a(((float)(p0)), ((float)(p1)));
    return;
}


public com.moon.n4 a() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(float p0) {
this.b(((float)(((com.moon.n4)(this.c)).a__Float())), ((float)(p0)));
    return;
}


public void a(float p0, float p1) {
((com.moon.n4)(this.b)).a(((float)(p0)), ((float)(p1)));
    return;
}


public void a(float p0, boolean p1) {
com.moon.gD forwardValue240_43_0;
    int forwardValue240_51_0;
    boolean spill240_0;
    com.moon.gD spill240_1;
    long life3_3;
    int life5_11;
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_44: {
    forward_join_43: {
    life3_3 = (com.moon.gD.e ^ 32655671000858L);
    spill240_0 = com.moon.gD.b__Boolean();
    ((com.moon.n4)(this.a)).a__n4(((com.moon.n4)(this.b)));
    life5_11 = ((spill240_0) ? 1 : 0);
    ((com.moon.n4)(this.b)).a(((float)(this.a(((float)(((com.moon.n4)(this.b)).a__Float())), ((float)(((com.moon.n4)(this.c)).a__Float())), ((float)(p0))))));
    spill240_1 = this;
    if (!((life5_11 != 0))) {
        forwardValue240_43_0 = spill240_1;
        break forward_join_43;
    }
    ((com.moon.n4)(((com.moon.gD)(spill240_1)).b)).b(((float)(this.a(((float)(((com.moon.n4)(this.b)).b__Float())), ((float)(((com.moon.n4)(this.c)).b__Float())), ((float)(p0))))));
    if (!(p1)) {
        break forward_join_44;
    }
    forwardValue240_43_0 = this;
    }
    ((com.moon.gD)(forwardValue240_43_0)).a__Void();
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_52;
    }
    if (!((life5_11 != 0))) {
        break forward_join_50;
    }
    forwardValue240_51_0 = 0;
    break forward_join_51;
    }
    forwardValue240_51_0 = 1;
    }
    com.moon.gD.b(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue240_51_0))));
    }
    return;
}


private void a__Void() {
java.lang.Object local1 = com.moon.nT.a(((com.moon.n4)(this.a)), ((com.moon.n4)(this.b)));
    ((com.moon.n4)(this.b)).a__n4(((com.moon.n4)(local1)));
    return;
}


private float a(float p0, float p1, float p2) {
int forwardValue239_25_0;
    float forwardValue239_31_0;
    float forwardValue239_31_1;
    boolean spill239_0;
    int spill239_1;
    float spill239_2;
    float spill239_3;
    long life4_3;
    float life7_9;
    int life6_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (com.moon.gD.e ^ 7226060501074L);
    spill239_0 = com.moon.gD.c__Boolean();
    life7_9 = moom.Dr.e(((float)((p1 - p0))));
    life6_10 = ((spill239_0) ? 1 : 0);
    spill239_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(p2)));
    if (!((life6_10 == 0))) {
        forwardValue239_25_0 = spill239_1;
        break forward_join_25;
    }
    if (!((spill239_1 > 0))) {
        break forward_join_19;
    }
    life7_9 = p2;
    }
    spill239_2 = life7_9;
    spill239_3 = (-p2);
    if (!((life6_10 == 0))) {
        forwardValue239_31_0 = spill239_2;
        forwardValue239_31_1 = spill239_3;
        break forward_join_31;
    }
    forwardValue239_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill239_2)), ((float)(spill239_3)));
    }
    if (!((forwardValue239_25_0 < 0))) {
        break forward_join_29;
    }
    life7_9 = (-p2);
    }
    forwardValue239_31_0 = p0;
    forwardValue239_31_1 = life7_9;
    }
    return (forwardValue239_31_0 + forwardValue239_31_1);
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
