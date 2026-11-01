package com.moon;


public class hA {

private java.lang.String a;

private java.lang.String b;

private com.moon.b8 c;

private long d;

private com.moon.module.impl.ClickGUI e;

private float f;

private float g;

private float h;

private float i;

private float j;

private long k;

private boolean l;

private boolean m;

private com.moon.nY n;

private static net.minecraft.entity.Entity[] o;

private static long p;

private static long q;

private static long r;

hA(java.lang.String p0, java.lang.String p1, com.moon.b8 p2, long p3, com.moon.module.impl.ClickGUI p4, float p5, float p6, float p7, float p8, float p9, long p10, boolean p11, boolean p12) { super(); }


private static void __sourceConstructorBody_dfe123260eb0d53f(com.moon.hA receiver, java.lang.String p0, java.lang.String p1, com.moon.b8 p2, long p3, com.moon.module.impl.ClickGUI p4, float p5, float p6, float p7, float p8, float p9, long p10, boolean p11, boolean p12) throws Throwable {

long local16_life1 = (com.moon.hA.p ^ 114699972400789L);

    com.moon.hA.__sourceConstructorInit_dfe123260eb0d53f_0(((com.moon.hA)(receiver)));

    ((com.moon.hA)(receiver)).n = ((com.moon.nY)(new com.moon.nY(com.moon.hA.r, com.moon.cj.LINEAR)));

    net.minecraft.entity.Entity[] __sourceSpill65_8 = com.moon.hA.b__Arrayr3();

    ((com.moon.hA)(receiver)).a = ((java.lang.String)(p0));

    ((com.moon.hA)(receiver)).b = ((java.lang.String)(p1));

    ((com.moon.hA)(receiver)).c = ((com.moon.b8)(p2));

    ((com.moon.hA)(receiver)).d = ((long)(p3));

    net.minecraft.entity.Entity[] local18_life12 = __sourceSpill65_8;

    ((com.moon.hA)(receiver)).e = ((com.moon.module.impl.ClickGUI)(p4));

    ((com.moon.hA)(receiver)).f = ((float)(p5));

    ((com.moon.hA)(receiver)).g = ((float)(p6));

    ((com.moon.hA)(receiver)).h = ((float)(p7));

    ((com.moon.hA)(receiver)).i = ((float)(p8));

    ((com.moon.hA)(receiver)).j = ((float)(p9));

    ((com.moon.hA)(receiver)).k = ((long)(p10));

    ((com.moon.hA)(receiver)).l = ((boolean)(p11));

    ((com.moon.hA)(receiver)).m = ((boolean)(p12));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.hA.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));

    }

    return;

}



static {
p = ((long)(((moom._a)(moom._c.a(((long)(4881653285546017596L)), ((long)(7459459518460576464L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(243403597774060L)))));
    net.minecraft.entity.Entity[] __sourceSpill128_6 = new net.minecraft.entity.Entity[2];
    long local5_life7 = (com.moon.hA.p ^ 97688289958557L);
    com.moon.hA.b(((net.minecraft.entity.Entity[])(__sourceSpill128_6)));
    javax.crypto.Cipher local7_life10;
    javax.crypto.Cipher __sourceSpill128_12 = (local7_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill128_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill128_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill128_15 = new byte[8];
    (__sourceSpill128_15)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life16 = 1;
    while ((local8_life16 < 8)) {
        (__sourceSpill128_15)[local8_life16] = ((byte) ((int) ((local5_life7 << (local8_life16 * 8)) >>> 56)));
        local8_life16 += 1;
    }
    byte[] __sourcePreallocation128_17 = __sourceSpill128_15;
    ((javax.crypto.Cipher)(__sourceSpill128_12)).init(((int)(__sourceSpill128_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill128_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation128_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local9_life20 = 6275041552359365719L;
    byte[] __sourceSpill128_21 = new byte[8];
    (__sourceSpill128_21)[0] = ((byte) ((int) (local9_life20 >>> 56)));
    (__sourceSpill128_21)[1] = ((byte) ((int) (local9_life20 >>> 48)));
    (__sourceSpill128_21)[2] = ((byte) ((int) (local9_life20 >>> 40)));
    (__sourceSpill128_21)[3] = ((byte) ((int) (local9_life20 >>> 32)));
    (__sourceSpill128_21)[4] = ((byte) ((int) (local9_life20 >>> 24)));
    (__sourceSpill128_21)[5] = ((byte) ((int) (local9_life20 >>> 16)));
    (__sourceSpill128_21)[6] = ((byte) ((int) (local9_life20 >>> 8)));
    (__sourceSpill128_21)[7] = ((byte) ((int) local9_life20));
    javax.crypto.Cipher __sourceSpill128_22 = local7_life10;
    byte[] local11_life24 = ((javax.crypto.Cipher)(__sourceSpill128_22)).doFinal(((byte[])(__sourceSpill128_21)));
    q = ((long)((((((((((((long) (local11_life24)[0]) & 255L) << 56) | ((((long) (local11_life24)[1]) & 255L) << 48)) | ((((long) (local11_life24)[2]) & 255L) << 40)) | ((((long) (local11_life24)[3]) & 255L) << 32)) | ((((long) (local11_life24)[4]) & 255L) << 24)) | ((((long) (local11_life24)[5]) & 255L) << 16)) | ((((long) (local11_life24)[6]) & 255L) << 8)) | (((long) (local11_life24)[7]) & 255L))));
    javax.crypto.Cipher local0_life27;
    javax.crypto.Cipher __sourceSpill128_29 = (local0_life27 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill128_30 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill128_31 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill128_32 = new byte[8];
    (__sourceSpill128_32)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life33 = 1;
    while ((local1_life33 < 8)) {
        (__sourceSpill128_32)[local1_life33] = ((byte) ((int) ((local5_life7 << (local1_life33 * 8)) >>> 56)));
        local1_life33 += 1;
    }
    byte[] __sourcePreallocation128_34 = __sourceSpill128_32;
    ((javax.crypto.Cipher)(__sourceSpill128_29)).init(((int)(__sourceSpill128_30)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill128_31)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation128_34)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life37 = 6876994366002452916L;
    byte[] __sourceSpill128_38 = new byte[8];
    (__sourceSpill128_38)[0] = ((byte) ((int) (local2_life37 >>> 56)));
    (__sourceSpill128_38)[1] = ((byte) ((int) (local2_life37 >>> 48)));
    (__sourceSpill128_38)[2] = ((byte) ((int) (local2_life37 >>> 40)));
    (__sourceSpill128_38)[3] = ((byte) ((int) (local2_life37 >>> 32)));
    (__sourceSpill128_38)[4] = ((byte) ((int) (local2_life37 >>> 24)));
    (__sourceSpill128_38)[5] = ((byte) ((int) (local2_life37 >>> 16)));
    (__sourceSpill128_38)[6] = ((byte) ((int) (local2_life37 >>> 8)));
    (__sourceSpill128_38)[7] = ((byte) ((int) local2_life37));
    javax.crypto.Cipher __sourceSpill128_39 = local0_life27;
    byte[] local4_life41 = ((javax.crypto.Cipher)(__sourceSpill128_39)).doFinal(((byte[])(__sourceSpill128_38)));
    r = ((long)((((((((((((long) (local4_life41)[0]) & 255L) << 56) | ((((long) (local4_life41)[1]) & 255L) << 48)) | ((((long) (local4_life41)[2]) & 255L) << 40)) | ((((long) (local4_life41)[3]) & 255L) << 32)) | ((((long) (local4_life41)[4]) & 255L) << 24)) | ((((long) (local4_life41)[5]) & 255L) << 16)) | ((((long) (local4_life41)[6]) & 255L) << 8)) | (((long) (local4_life41)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_dfe123260eb0d53f_0(com.moon.hA a0) throws E;

public static net.minecraft.entity.Entity[] b__Arrayr3() {
return com.moon.hA.o;
}


public static void b(net.minecraft.entity.Entity[] p0) {
o = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public java.lang.String b__String() {
return this.b;
}


public boolean b__Boolean() {
return ((((this.m) ? 1 : 0)) != 0);
}


public float b() {
return this.f;
}


public long b__Long() {
return this.k;
}


private void b__Void() {
float local1 = (((float) java.lang.Math.round(((float)((this.i - 0x1.8p3f))))) + 0x1.0p-1f);
    float local2 = ((com.moon.jn)(com.moon.hC.a)).a(((java.lang.String)(this.a)), ((float)(0x1.8p3f)));
    float local3 = ((com.moon.jn)(com.moon.hC.a)).a(((java.lang.String)(this.b)), ((float)(0x1.0p3f)));
    this.h = ((float)(((java.lang.Math.max(((float)(local2)), ((float)(local3))) + 0x1.2p4f) + local1)));
    return;
}


public com.moon.hA b(boolean p0) {
this.m = ((boolean)(p0));
    return this;
}


public float e() {
return this.i;
}


private void c__Void() {
float local1 = ((com.moon.jn)(com.moon.hC.a)).a(((float)(0x1.8p3f)));
    float local2 = ((com.moon.jn)(com.moon.hC.a)).a(((float)(0x1.0p3f)));
    this.i = ((float)((((float) java.lang.Math.round(((float)((local1 + local2))))) + 0x1.8p3f)));
    return;
}


public float c() {
return this.g;
}


public float f() {
return this.j;
}


public float d() {
return this.h;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


public com.moon.nY a__nY() {
return this.n;
}


public com.moon.hA a(boolean p0) {
this.l = ((boolean)(p0));
    return this;
}


public java.lang.String a__String() {
return this.a;
}


public static com.moon.hB a__hB() {
return new com.moon.hB();
}


public float a() {
return (this.i * ((com.moon.nY)(this.n)).c());
}


public void a(com.moon.hW p0, com.moon.hW p1, com.moon.hW p2, com.moon.hW p3, float p4) {
com.moon.nY forwardValue307_272_0;
    float forwardValue307_272_1;
    float forwardValue307_272_2;
    int forwardValue307_272_3;
    com.moon.nY forwardValue307_273_0;
    float forwardValue307_273_1;
    float forwardValue307_273_2;
    com.moon.nY forwardValue307_274_0;
    float forwardValue307_274_1;
    float forwardValue307_274_2;
    int forwardValue307_274_3;
    int forwardValue307_283_0;
    net.minecraft.entity.Entity[] spill307_0;
    com.moon.nY spill307_1;
    float spill307_2;
    float spill307_3;
    boolean spill307_4;
    boolean spill307_5;
    long life6_3;
    moom.ir life9_5;
    com.v life10_9;
    float life11_25;
    int life12_68;
    int life13_77;
    int life14_87;
    net.minecraft.entity.Entity[] life8_88;
    float life15_97;
    com.moon.jr life16_124;
    float life17_129;
    float life18_134;
    com.moon.i3 life19_254;
    forward_join_292: {
    forward_join_287: {
    forward_join_283: {
    forward_join_274: {
    forward_join_273: {
    forward_join_272: {
    life6_3 = (com.moon.hA.p ^ 131405403360055L);
    life9_5 = com.moon.nS.a();
    life10_9 = ((com.moon.module.impl.ClickGUI)(this.e)).a__v();
    this.g = ((float)((((((float) ((moom.ir)(life9_5)).b__Int()) - this.i) - 0x1.0p2f) + p4)));
    life11_25 = ((com.moon.nY)(this.n)).c();
    this.f = ((float)((((float) ((moom.ir)(life9_5)).a__Int()) - ((this.j + 0x1.0p1f) * life11_25))));
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.f)), ((float)(this.g)), ((float)(this.h)), ((float)(this.i)), ((float)(0x1.8p2f)), ((int)(__sourceExactCall_cd88b7748cd09e(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((int) com.moon.hA.q)))).a(((float)((0x1.0p-1f * life11_25)))))))))))));
    life12_68 = __sourceExactCall_cd88b7748cd09e(((com.moon.aO)(__sourceExactCall_7f7c977e2e5b89(((com.moon.aO)(new com.moon.aO(((com.v)(life10_9)).a()))), ((float)(life11_25))))));
    life13_77 = __sourceExactCall_cd88b7748cd09e(((com.moon.aO)(__sourceExactCall_7f7c977e2e5b89(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(life10_9)))))), ((float)(life11_25))))));
    spill307_0 = __sourceExactCall_7cbb349d7e81c0();
    life14_87 = __sourceExactCall_cd88b7748cd09e(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.WHITE)).getRGB()))).a(((float)(life11_25))))));
    life8_88 = spill307_0;
    life15_97 = (((float) java.lang.Math.round(((float)((this.i - 0x1.8p3f))))) + 0x1.0p-1f);
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.i3.a(((float)(((this.f + 0x1.8p2f) + 0x1.0p-1f))), ((float)((this.g + 0x1.8p2f))), ((float)(life15_97)), ((float)(life15_97)), ((float)(0x1.8p2f)), ((int)(life12_68))))));
    life16_124 = ((com.moon.jz)(((com.moon.jy)(((com.moon.jn)(com.moon.hC.b)).a__jy())).a__jz())).a(((char)(((java.lang.String)(((com.moon.b8)(this.c)).a())).charAt(((int)(0))))));
    life17_129 = (((com.moon.jr)(life16_124)).g() * 0x1.0p4f);
    life18_134 = (((com.moon.jr)(life16_124)).f() * 0x1.0p4f);
    __sourceExactCall_7ba1e7389be40b(((com.moon.jn)(com.moon.hC.b)), ((com.moon.hW)(p1)), ((java.lang.String)(((com.moon.b8)(this.c)).a())), ((float)(0x1.0p4f)), ((float)(((((this.f + 0x1.0p-1f) + 0x1.8p2f) + (life15_97 / 0x1.0p1f)) - (life17_129 / 0x1.0p1f)))), ((float)((((((this.g + 0x1.8p2f) + 0x1.8p0f) + (life15_97 / 0x1.0p1f)) - 0x1.0p1f) - (life18_134 / 0x1.0p2f)))), ((int)(life13_77)));
    __sourceExactCall_7ba1e7389be40b(((com.moon.jn)(com.moon.hC.a)), ((com.moon.hW)(p2)), ((java.lang.String)(this.a)), ((float)(0x1.8p3f)), ((float)((((this.f + 0x1.8p2f) + life15_97) + 0x1.8p2f))), ((float)(((this.g + 0x1.8p2f) - 0x1.0p-1f))), ((int)(life14_87)));
    __sourceExactCall_7ba1e7389be40b(((com.moon.jn)(com.moon.hC.a)), ((com.moon.hW)(p2)), ((java.lang.String)(this.b)), ((float)(0x1.0p3f)), ((float)((((this.f + 0x1.8p2f) + life15_97) + 0x1.8p2f))), ((float)((((this.g + 0x1.8p2f) - 0x1.0p-1f) + ((com.moon.jn)(com.moon.hC.a)).a(((float)(0x1.8p3f)))))), ((int)(life14_87)));
    ((com.moon.hW)(p3)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.f)), ((float)(this.g)), ((float)(this.h)), ((float)(this.i)), ((float)(0x1.8p2f)), ((int)(__sourceExactCall_cd88b7748cd09e(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))).a(((float)(life11_25))))))))))));
    life19_254 = com.moon.i3.a(((float)(((this.f + 0x1.8p2f) + 0x1.0p-1f))), ((float)((this.g + 0x1.8p2f))), ((float)(life15_97)), ((float)(life15_97)), ((float)(0x0.0p0f)), ((int)(life12_68)));
    ((com.moon.i3)(life19_254)).e(((boolean)(false)));
    ((com.moon.hW)(p3)).a(((com.moon.iX)(life19_254)));
    spill307_1 = this.n;
    spill307_2 = 0x0.0p0f;
    spill307_3 = 0x1.0p0f;
    spill307_4 = this.l;
    if (!((life8_88 != null))) {
        forwardValue307_272_0 = spill307_1;
        forwardValue307_272_1 = spill307_2;
        forwardValue307_272_2 = spill307_3;
        forwardValue307_272_3 = ((spill307_4) ? 1 : 0);
        break forward_join_272;
    }
    if (!((!spill307_4))) {
        forwardValue307_273_0 = spill307_1;
        forwardValue307_273_1 = spill307_2;
        forwardValue307_273_2 = spill307_3;
        break forward_join_273;
    }
    forwardValue307_272_0 = spill307_1;
    forwardValue307_272_1 = spill307_2;
    forwardValue307_272_2 = spill307_3;
    forwardValue307_272_3 = 1;
    }
    forwardValue307_274_0 = forwardValue307_272_0;
    forwardValue307_274_1 = forwardValue307_272_1;
    forwardValue307_274_2 = forwardValue307_272_2;
    forwardValue307_274_3 = forwardValue307_272_3;
    break forward_join_274;
    }
    forwardValue307_274_0 = forwardValue307_273_0;
    forwardValue307_274_1 = forwardValue307_273_1;
    forwardValue307_274_2 = forwardValue307_273_2;
    forwardValue307_274_3 = 0;
    }
    ((com.moon.nY)(forwardValue307_274_0)).a(((float)(forwardValue307_274_1)), ((float)(forwardValue307_274_2)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue307_274_3))));
    spill307_5 = this.l;
    if (!((life8_88 != null))) {
        forwardValue307_283_0 = ((spill307_5) ? 1 : 0);
        break forward_join_283;
    }
    if (!(spill307_5)) {
        break forward_join_287;
    }
    forwardValue307_283_0 = recovery.source.CarrierOps.fcmpl(((float)(life11_25)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue307_283_0 == 0))) {
        break forward_join_287;
    }
    this.m = ((boolean)(true));
    }
    if (!((life8_88 == null))) {
        break forward_join_292;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public void a__Void() {
((com.moon.hA)(this)).c__Void();
    ((com.moon.hA)(this)).b__Void();
    this.j = ((float)((this.h + 0x1.0p1f)));
    this.k = ((long)((java.lang.System.currentTimeMillis() + this.d)));
    this.e = ((com.moon.module.impl.ClickGUI)(((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))))));
    return;
}


public com.moon.module.impl.ClickGUI a__lS() {
return this.e;
}


public long a__Long() {
return this.d;
}


public com.moon.b8 a__b8() {
return this.c;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native int __sourceExactCall_cd88b7748cd09e(com.moon.aO p0);

private static native void __sourceExactCall_7ba1e7389be40b(com.moon.jn p0, com.moon.hW p1, java.lang.String p2, float p3, float p4, float p5, int p6);

private static native com.moon.aO __sourceExactCall_7f7c977e2e5b89(com.moon.aO p0, float p1);
private static native net.minecraft.entity.Entity[] __sourceExactCall_7cbb349d7e81c0();

private static native int __sourceExactCall_66349b953a09b2(com.v p0);
}
