package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jr {

private java.util.Map<java.lang.Character, java.lang.Float> a;

private com.moon.jv b;

private com.moon.jx c;

private float d;

private float e;

private float f;

private float g;

private float h;

private float i;

private float j;

private float k;

private float l;

private float m;

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public jr(com.moon.jv p0, com.moon.js p1, com.moon.jx p2) { super(); }


private static void __sourceConstructorBody_74f41994c5cc6a1a(com.moon.jr receiver, com.moon.jv p0, com.moon.js p1, com.moon.jx p2) throws Throwable {

com.moon.jt __initValue79_47_0;

    long local4_life2;

    boolean local6_life7;

    com.moon.jt local7_life11;

    float local8_life13;

    float local9_life14;

    float local10_life15;

    float local11_life16;

    com.moon.jt local12_life26;

    float local12_life39;

    float local13_life41;

    init_join_94: {

    init_join_91: {

    init_join_85: {

    init_join_47: {

    init_join_46: {

    local4_life2 = (com.moon.jr.n ^ 5711980819634L);

    boolean __sourceSpill79_4 = com.moon.jn.c__Boolean();

    com.moon.jr.__sourceConstructorInit_74f41994c5cc6a1a_0(((com.moon.jr)(receiver)));

    ((com.moon.jr)(receiver)).a = ((java.util.Map)(new java.util.HashMap()));

    local6_life7 = __sourceSpill79_4;

    ((com.moon.jr)(receiver)).j = ((float)(((com.moon.jv)(p0)).a()));

    local7_life11 = ((com.moon.jv)(p0)).b();

    com.moon.jt __sourceSpill79_12 = local7_life11;

    if (!(local6_life7)) {

        __initValue79_47_0 = __sourceSpill79_12;

        break init_join_47;

    }

    if (!((__sourceSpill79_12 == null))) {

        break init_join_46;

    }

    local8_life13 = 0x0.0p0f;

    local9_life14 = 0x0.0p0f;

    local10_life15 = 0x0.0p0f;

    local11_life16 = 0x0.0p0f;

    ((com.moon.jr)(receiver)).h = ((float)(0x0.0p0f));

    ((com.moon.jr)(receiver)).i = ((float)(0x0.0p0f));

    ((com.moon.jr)(receiver)).l = ((float)(0x0.0p0f));

    if (!((!local6_life7))) {

        break init_join_94;

    }

    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));

    }

    __initValue79_47_0 = local7_life11;

    }

    local8_life13 = ((com.moon.jt)(__initValue79_47_0)).a();

    local9_life14 = ((com.moon.jt)(local7_life11)).b();

    local10_life15 = ((com.moon.jt)(local7_life11)).c();

    local11_life16 = ((com.moon.jt)(local7_life11)).d();

    local12_life26 = ((com.moon.jv)(p0)).a__jt();

    if (!(local6_life7)) {

        break init_join_91;

    }

    if (!((local12_life26 != null))) {

        break init_join_85;

    }

    ((com.moon.jr)(receiver)).h = ((float)((((com.moon.jt)(local12_life26)).c() - ((com.moon.jt)(local12_life26)).a())));

    ((com.moon.jr)(receiver)).i = ((float)((((com.moon.jt)(local12_life26)).b() - ((com.moon.jt)(local12_life26)).d())));

    ((com.moon.jr)(receiver)).l = ((float)(((com.moon.jt)(local12_life26)).b()));

    if (!((!local6_life7))) {

        break init_join_94;

    }

    }

    ((com.moon.jr)(receiver)).h = ((float)(0x0.0p0f));

    ((com.moon.jr)(receiver)).i = ((float)(0x0.0p0f));

    }

    ((com.moon.jr)(receiver)).l = ((float)(0x0.0p0f));

    }

    local12_life39 = ((com.moon.js)(p1)).c();

    local13_life41 = ((com.moon.js)(p1)).d();

    ((com.moon.jr)(receiver)).d = ((float)((0x1.0p0f - (local9_life14 / local13_life41))));

    ((com.moon.jr)(receiver)).e = ((float)((local8_life13 / local12_life39)));

    ((com.moon.jr)(receiver)).f = ((float)((0x1.0p0f - (local11_life16 / local13_life41))));

    ((com.moon.jr)(receiver)).g = ((float)((local10_life15 / local12_life39)));

    ((com.moon.jr)(receiver)).b = ((com.moon.jv)(p0));

    ((com.moon.jr)(receiver)).c = ((com.moon.jx)(p2));

    return;

}



static {
n = ((long)(((moom._a)(moom._c.a(((long)(-2141257684390718740L)), ((long)(-8171598639600940312L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213493063527989L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jr.n ^ 62632579306639L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill201_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill201_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill201_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill201_14 = new byte[8];
    (__sourceSpill201_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill201_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation201_16 = __sourceSpill201_14;
    ((javax.crypto.Cipher)(__sourceSpill201_11)).init(((int)(__sourceSpill201_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill201_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation201_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\n©â¡×ÝkØ\"ùº:À\031"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill201_25 = local6_life21;
        int __sourceSpill201_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill201_25)).substring(((int)(__sourceSpill201_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill201_30 = local8_life19;
        int __sourceSpill201_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill201_33 = new byte[8];
        (__sourceSpill201_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill201_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill201_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill201_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill201_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill201_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill201_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill201_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill201_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill201_34)).doFinal(((byte[])(__sourceSpill201_33)));
        (__sourceSpill201_30)[__sourceSpill201_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_74f41994c5cc6a1a_0(com.moon.jr a0) throws E;

public float i() {
return this.l;
}


public float b() {
return this.e;
}


public com.moon.jr b(float p0) {
this.k = ((float)(p0));
    return this;
}


public float e() {
return this.h;
}


public float c() {
return this.f;
}


public com.moon.jr c(float p0) {
this.l = ((float)(p0));
    return this;
}


public float h() {
return this.k;
}


public float f() {
return this.i;
}


public com.moon.jr d(float p0) {
this.m = ((float)(p0));
    return this;
}


public float d() {
return this.g;
}


public void a(char p0, float p1) {
((java.util.Map)(this.a)).put(((java.lang.Object)(java.lang.Character.valueOf(((char)(p0))))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(p1))))));
    return;
}


public com.moon.iZ a(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6, com.moon.jk p7) {
float forwardValue610_38_0;
    float forwardValue610_46_0;
    float forwardValue610_86_0;
    float forwardValue610_86_1;
    float forwardValue610_86_2;
    float forwardValue610_86_3;
    float forwardValue610_86_4;
    float forwardValue610_86_5;
    float forwardValue610_86_6;
    float forwardValue610_86_7;
    float forwardValue610_86_8;
    float forwardValue610_86_9;
    float forwardValue610_86_10;
    float forwardValue610_90_0;
    float forwardValue610_90_1;
    float forwardValue610_90_2;
    float forwardValue610_90_3;
    float forwardValue610_90_4;
    float forwardValue610_90_5;
    float forwardValue610_90_6;
    float forwardValue610_90_7;
    float forwardValue610_90_8;
    float forwardValue610_90_9;
    float forwardValue610_90_10;
    int forwardValue610_90_11;
    float forwardValue610_94_0;
    float forwardValue610_94_1;
    float forwardValue610_94_2;
    float forwardValue610_94_3;
    float forwardValue610_94_4;
    float forwardValue610_94_5;
    float forwardValue610_94_6;
    float forwardValue610_94_7;
    float forwardValue610_94_8;
    float forwardValue610_94_9;
    float forwardValue610_94_10;
    float forwardValue610_95_0;
    float forwardValue610_95_1;
    float forwardValue610_95_2;
    float forwardValue610_95_3;
    float forwardValue610_95_4;
    float forwardValue610_95_5;
    float forwardValue610_95_6;
    float forwardValue610_95_7;
    float forwardValue610_95_8;
    float forwardValue610_95_9;
    float forwardValue610_95_10;
    com.moon.jk forwardValue610_95_11;
    float forwardValue610_96_0;
    float forwardValue610_96_1;
    float forwardValue610_96_2;
    float forwardValue610_96_3;
    float forwardValue610_96_4;
    float forwardValue610_96_5;
    float forwardValue610_96_6;
    float forwardValue610_96_7;
    float forwardValue610_96_8;
    float forwardValue610_96_9;
    float forwardValue610_96_10;
    int forwardValue610_96_11;
    float forwardValue610_141_0;
    float forwardValue610_141_1;
    float forwardValue610_141_2;
    float forwardValue610_141_3;
    float forwardValue610_141_4;
    float forwardValue610_141_5;
    float forwardValue610_141_6;
    float forwardValue610_141_7;
    float forwardValue610_141_8;
    float forwardValue610_141_9;
    float forwardValue610_141_10;
    float forwardValue610_145_0;
    float forwardValue610_145_1;
    float forwardValue610_145_2;
    float forwardValue610_145_3;
    float forwardValue610_145_4;
    float forwardValue610_145_5;
    float forwardValue610_145_6;
    float forwardValue610_145_7;
    float forwardValue610_145_8;
    float forwardValue610_145_9;
    float forwardValue610_145_10;
    int forwardValue610_145_11;
    float forwardValue610_149_0;
    float forwardValue610_149_1;
    float forwardValue610_149_2;
    float forwardValue610_149_3;
    float forwardValue610_149_4;
    float forwardValue610_149_5;
    float forwardValue610_149_6;
    float forwardValue610_149_7;
    float forwardValue610_149_8;
    float forwardValue610_149_9;
    float forwardValue610_149_10;
    float forwardValue610_150_0;
    float forwardValue610_150_1;
    float forwardValue610_150_2;
    float forwardValue610_150_3;
    float forwardValue610_150_4;
    float forwardValue610_150_5;
    float forwardValue610_150_6;
    float forwardValue610_150_7;
    float forwardValue610_150_8;
    float forwardValue610_150_9;
    float forwardValue610_150_10;
    com.moon.jk forwardValue610_150_11;
    float forwardValue610_151_0;
    float forwardValue610_151_1;
    float forwardValue610_151_2;
    float forwardValue610_151_3;
    float forwardValue610_151_4;
    float forwardValue610_151_5;
    float forwardValue610_151_6;
    float forwardValue610_151_7;
    float forwardValue610_151_8;
    float forwardValue610_151_9;
    float forwardValue610_151_10;
    int forwardValue610_151_11;
    com.moon.iZ forwardValue610_158_0;
    com.moon.iZ forwardValue610_159_0;
    int forwardValue610_159_1;
    com.moon.iZ forwardValue610_160_0;
    boolean spill610_0;
    float spill610_1;
    float spill610_2;
    float spill610_3;
    float spill610_4;
    float spill610_5;
    float spill610_6;
    float spill610_7;
    float spill610_8;
    float spill610_9;
    float spill610_10;
    float spill610_11;
    boolean spill610_12;
    com.moon.jk spill610_13;
    float spill610_14;
    float spill610_15;
    float spill610_16;
    float spill610_17;
    float spill610_18;
    float spill610_19;
    float spill610_20;
    float spill610_21;
    float spill610_22;
    float spill610_23;
    float spill610_24;
    boolean spill610_25;
    com.moon.jk spill610_26;
    com.moon.iZ spill610_27;
    long life9_3;
    float life12_12;
    float life2_20;
    com.moon.jt life13_25;
    int life11_26;
    float life14_40;
    float life15_50;
    forward_join_160: {
    forward_join_159: {
    forward_join_158: {
    forward_join_151: {
    forward_join_150: {
    forward_join_149: {
    forward_join_145: {
    forward_join_141: {
    forward_join_98: {
    forward_join_96: {
    forward_join_95: {
    forward_join_94: {
    forward_join_90: {
    forward_join_86: {
    forward_join_46: {
    forward_join_45: {
    forward_join_38: {
    forward_join_35: {
    life9_3 = (com.moon.jr.n ^ 122031538073683L);
    life12_12 = (p1 + (((com.moon.jx)(this.c)).a() * this.k));
    life2_20 = (life12_12 - (this.l * this.k));
    spill610_0 = com.moon.jn.c__Boolean();
    life13_25 = ((com.moon.jv)(this.b)).a__jt();
    life11_26 = ((spill610_0) ? 1 : 0);
    if (!(((com.moon.jj)(((com.moon.jk)(p7)).a__jj())).a__Boolean())) {
        break forward_join_35;
    }
    forwardValue610_38_0 = (-0x1.0p0f + p3);
    break forward_join_38;
    }
    forwardValue610_38_0 = (p5 + p4);
    }
    life14_40 = forwardValue610_38_0;
    if (!(((com.moon.jj)(((com.moon.jk)(p7)).a__jj())).b())) {
        break forward_join_45;
    }
    forwardValue610_46_0 = 0x1.0p0f;
    break forward_join_46;
    }
    forwardValue610_46_0 = 0x0.0p0f;
    }
    life15_50 = forwardValue610_46_0;
    if (!((life13_25 == null))) {
        break forward_join_98;
    }
    spill610_1 = p0;
    spill610_2 = life2_20;
    spill610_3 = (p0 + (this.h * this.k));
    spill610_4 = (life2_20 + (this.i * this.k));
    spill610_5 = this.e;
    spill610_6 = this.d;
    spill610_7 = this.g;
    spill610_8 = this.f;
    spill610_9 = p2;
    spill610_10 = life14_40;
    spill610_11 = life15_50;
    spill610_12 = p6;
    if (!((life11_26 != 0))) {
        forwardValue610_90_0 = spill610_1;
        forwardValue610_90_1 = spill610_2;
        forwardValue610_90_2 = spill610_3;
        forwardValue610_90_3 = spill610_4;
        forwardValue610_90_4 = spill610_5;
        forwardValue610_90_5 = spill610_6;
        forwardValue610_90_6 = spill610_7;
        forwardValue610_90_7 = spill610_8;
        forwardValue610_90_8 = spill610_9;
        forwardValue610_90_9 = spill610_10;
        forwardValue610_90_10 = spill610_11;
        forwardValue610_90_11 = ((spill610_12) ? 1 : 0);
        break forward_join_90;
    }
    if (!(spill610_12)) {
        forwardValue610_86_0 = spill610_1;
        forwardValue610_86_1 = spill610_2;
        forwardValue610_86_2 = spill610_3;
        forwardValue610_86_3 = spill610_4;
        forwardValue610_86_4 = spill610_5;
        forwardValue610_86_5 = spill610_6;
        forwardValue610_86_6 = spill610_7;
        forwardValue610_86_7 = spill610_8;
        forwardValue610_86_8 = spill610_9;
        forwardValue610_86_9 = spill610_10;
        forwardValue610_86_10 = spill610_11;
        break forward_join_86;
    }
    forwardValue610_96_0 = spill610_1;
    forwardValue610_96_1 = spill610_2;
    forwardValue610_96_2 = spill610_3;
    forwardValue610_96_3 = spill610_4;
    forwardValue610_96_4 = spill610_5;
    forwardValue610_96_5 = spill610_6;
    forwardValue610_96_6 = spill610_7;
    forwardValue610_96_7 = spill610_8;
    forwardValue610_96_8 = spill610_9;
    forwardValue610_96_9 = spill610_10;
    forwardValue610_96_10 = spill610_11;
    forwardValue610_96_11 = __sourceIntrinsic_d6a3d4cc8b7b_invokedynamic610_23(26293, (6213595727804120266L ^ life9_3));
    break forward_join_96;
    }
    spill610_13 = p7;
    if (!((life11_26 != 0))) {
        forwardValue610_95_0 = forwardValue610_86_0;
        forwardValue610_95_1 = forwardValue610_86_1;
        forwardValue610_95_2 = forwardValue610_86_2;
        forwardValue610_95_3 = forwardValue610_86_3;
        forwardValue610_95_4 = forwardValue610_86_4;
        forwardValue610_95_5 = forwardValue610_86_5;
        forwardValue610_95_6 = forwardValue610_86_6;
        forwardValue610_95_7 = forwardValue610_86_7;
        forwardValue610_95_8 = forwardValue610_86_8;
        forwardValue610_95_9 = forwardValue610_86_9;
        forwardValue610_95_10 = forwardValue610_86_10;
        forwardValue610_95_11 = spill610_13;
        break forward_join_95;
    }
    forwardValue610_90_0 = forwardValue610_86_0;
    forwardValue610_90_1 = forwardValue610_86_1;
    forwardValue610_90_2 = forwardValue610_86_2;
    forwardValue610_90_3 = forwardValue610_86_3;
    forwardValue610_90_4 = forwardValue610_86_4;
    forwardValue610_90_5 = forwardValue610_86_5;
    forwardValue610_90_6 = forwardValue610_86_6;
    forwardValue610_90_7 = forwardValue610_86_7;
    forwardValue610_90_8 = forwardValue610_86_8;
    forwardValue610_90_9 = forwardValue610_86_9;
    forwardValue610_90_10 = forwardValue610_86_10;
    forwardValue610_90_11 = ((((com.moon.jk)(spill610_13)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue610_90_11 != 0))) {
        forwardValue610_94_0 = forwardValue610_90_0;
        forwardValue610_94_1 = forwardValue610_90_1;
        forwardValue610_94_2 = forwardValue610_90_2;
        forwardValue610_94_3 = forwardValue610_90_3;
        forwardValue610_94_4 = forwardValue610_90_4;
        forwardValue610_94_5 = forwardValue610_90_5;
        forwardValue610_94_6 = forwardValue610_90_6;
        forwardValue610_94_7 = forwardValue610_90_7;
        forwardValue610_94_8 = forwardValue610_90_8;
        forwardValue610_94_9 = forwardValue610_90_9;
        forwardValue610_94_10 = forwardValue610_90_10;
        break forward_join_94;
    }
    forwardValue610_96_0 = forwardValue610_90_0;
    forwardValue610_96_1 = forwardValue610_90_1;
    forwardValue610_96_2 = forwardValue610_90_2;
    forwardValue610_96_3 = forwardValue610_90_3;
    forwardValue610_96_4 = forwardValue610_90_4;
    forwardValue610_96_5 = forwardValue610_90_5;
    forwardValue610_96_6 = forwardValue610_90_6;
    forwardValue610_96_7 = forwardValue610_90_7;
    forwardValue610_96_8 = forwardValue610_90_8;
    forwardValue610_96_9 = forwardValue610_90_9;
    forwardValue610_96_10 = forwardValue610_90_10;
    forwardValue610_96_11 = ((com.moon.jk)(p7)).b();
    break forward_join_96;
    }
    forwardValue610_95_0 = forwardValue610_94_0;
    forwardValue610_95_1 = forwardValue610_94_1;
    forwardValue610_95_2 = forwardValue610_94_2;
    forwardValue610_95_3 = forwardValue610_94_3;
    forwardValue610_95_4 = forwardValue610_94_4;
    forwardValue610_95_5 = forwardValue610_94_5;
    forwardValue610_95_6 = forwardValue610_94_6;
    forwardValue610_95_7 = forwardValue610_94_7;
    forwardValue610_95_8 = forwardValue610_94_8;
    forwardValue610_95_9 = forwardValue610_94_9;
    forwardValue610_95_10 = forwardValue610_94_10;
    forwardValue610_95_11 = p7;
    }
    forwardValue610_96_0 = forwardValue610_95_0;
    forwardValue610_96_1 = forwardValue610_95_1;
    forwardValue610_96_2 = forwardValue610_95_2;
    forwardValue610_96_3 = forwardValue610_95_3;
    forwardValue610_96_4 = forwardValue610_95_4;
    forwardValue610_96_5 = forwardValue610_95_5;
    forwardValue610_96_6 = forwardValue610_95_6;
    forwardValue610_96_7 = forwardValue610_95_7;
    forwardValue610_96_8 = forwardValue610_95_8;
    forwardValue610_96_9 = forwardValue610_95_9;
    forwardValue610_96_10 = forwardValue610_95_10;
    forwardValue610_96_11 = ((com.moon.jk)(forwardValue610_95_11)).a();
    }
    return com.moon.iZ.a(((float)(forwardValue610_96_0)), ((float)(forwardValue610_96_1)), ((float)(forwardValue610_96_2)), ((float)(forwardValue610_96_3)), ((float)(forwardValue610_96_4)), ((float)(forwardValue610_96_5)), ((float)(forwardValue610_96_6)), ((float)(forwardValue610_96_7)), ((float)(forwardValue610_96_8)), ((float)(forwardValue610_96_9)), ((float)(forwardValue610_96_10)), ((int)(forwardValue610_96_11)));
    }
    spill610_14 = (p0 + (((com.moon.jt)(life13_25)).a() * this.k));
    spill610_15 = life2_20;
    spill610_16 = (p0 + (((com.moon.jt)(life13_25)).c() * this.k));
    spill610_17 = (life2_20 + (this.i * this.k));
    spill610_18 = this.e;
    spill610_19 = this.d;
    spill610_20 = this.g;
    spill610_21 = this.f;
    spill610_22 = p2;
    spill610_23 = life14_40;
    spill610_24 = life15_50;
    spill610_25 = p6;
    if (!((life11_26 != 0))) {
        forwardValue610_145_0 = spill610_14;
        forwardValue610_145_1 = spill610_15;
        forwardValue610_145_2 = spill610_16;
        forwardValue610_145_3 = spill610_17;
        forwardValue610_145_4 = spill610_18;
        forwardValue610_145_5 = spill610_19;
        forwardValue610_145_6 = spill610_20;
        forwardValue610_145_7 = spill610_21;
        forwardValue610_145_8 = spill610_22;
        forwardValue610_145_9 = spill610_23;
        forwardValue610_145_10 = spill610_24;
        forwardValue610_145_11 = ((spill610_25) ? 1 : 0);
        break forward_join_145;
    }
    if (!(spill610_25)) {
        forwardValue610_141_0 = spill610_14;
        forwardValue610_141_1 = spill610_15;
        forwardValue610_141_2 = spill610_16;
        forwardValue610_141_3 = spill610_17;
        forwardValue610_141_4 = spill610_18;
        forwardValue610_141_5 = spill610_19;
        forwardValue610_141_6 = spill610_20;
        forwardValue610_141_7 = spill610_21;
        forwardValue610_141_8 = spill610_22;
        forwardValue610_141_9 = spill610_23;
        forwardValue610_141_10 = spill610_24;
        break forward_join_141;
    }
    forwardValue610_151_0 = spill610_14;
    forwardValue610_151_1 = spill610_15;
    forwardValue610_151_2 = spill610_16;
    forwardValue610_151_3 = spill610_17;
    forwardValue610_151_4 = spill610_18;
    forwardValue610_151_5 = spill610_19;
    forwardValue610_151_6 = spill610_20;
    forwardValue610_151_7 = spill610_21;
    forwardValue610_151_8 = spill610_22;
    forwardValue610_151_9 = spill610_23;
    forwardValue610_151_10 = spill610_24;
    forwardValue610_151_11 = __sourceIntrinsic_d6a3d4cc8b7b_invokedynamic610_40(6094, (3318073397651819952L ^ life9_3));
    break forward_join_151;
    }
    spill610_26 = p7;
    if (!((life11_26 != 0))) {
        forwardValue610_150_0 = forwardValue610_141_0;
        forwardValue610_150_1 = forwardValue610_141_1;
        forwardValue610_150_2 = forwardValue610_141_2;
        forwardValue610_150_3 = forwardValue610_141_3;
        forwardValue610_150_4 = forwardValue610_141_4;
        forwardValue610_150_5 = forwardValue610_141_5;
        forwardValue610_150_6 = forwardValue610_141_6;
        forwardValue610_150_7 = forwardValue610_141_7;
        forwardValue610_150_8 = forwardValue610_141_8;
        forwardValue610_150_9 = forwardValue610_141_9;
        forwardValue610_150_10 = forwardValue610_141_10;
        forwardValue610_150_11 = spill610_26;
        break forward_join_150;
    }
    forwardValue610_145_0 = forwardValue610_141_0;
    forwardValue610_145_1 = forwardValue610_141_1;
    forwardValue610_145_2 = forwardValue610_141_2;
    forwardValue610_145_3 = forwardValue610_141_3;
    forwardValue610_145_4 = forwardValue610_141_4;
    forwardValue610_145_5 = forwardValue610_141_5;
    forwardValue610_145_6 = forwardValue610_141_6;
    forwardValue610_145_7 = forwardValue610_141_7;
    forwardValue610_145_8 = forwardValue610_141_8;
    forwardValue610_145_9 = forwardValue610_141_9;
    forwardValue610_145_10 = forwardValue610_141_10;
    forwardValue610_145_11 = ((((com.moon.jk)(spill610_26)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue610_145_11 != 0))) {
        forwardValue610_149_0 = forwardValue610_145_0;
        forwardValue610_149_1 = forwardValue610_145_1;
        forwardValue610_149_2 = forwardValue610_145_2;
        forwardValue610_149_3 = forwardValue610_145_3;
        forwardValue610_149_4 = forwardValue610_145_4;
        forwardValue610_149_5 = forwardValue610_145_5;
        forwardValue610_149_6 = forwardValue610_145_6;
        forwardValue610_149_7 = forwardValue610_145_7;
        forwardValue610_149_8 = forwardValue610_145_8;
        forwardValue610_149_9 = forwardValue610_145_9;
        forwardValue610_149_10 = forwardValue610_145_10;
        break forward_join_149;
    }
    forwardValue610_151_0 = forwardValue610_145_0;
    forwardValue610_151_1 = forwardValue610_145_1;
    forwardValue610_151_2 = forwardValue610_145_2;
    forwardValue610_151_3 = forwardValue610_145_3;
    forwardValue610_151_4 = forwardValue610_145_4;
    forwardValue610_151_5 = forwardValue610_145_5;
    forwardValue610_151_6 = forwardValue610_145_6;
    forwardValue610_151_7 = forwardValue610_145_7;
    forwardValue610_151_8 = forwardValue610_145_8;
    forwardValue610_151_9 = forwardValue610_145_9;
    forwardValue610_151_10 = forwardValue610_145_10;
    forwardValue610_151_11 = ((com.moon.jk)(p7)).b();
    break forward_join_151;
    }
    forwardValue610_150_0 = forwardValue610_149_0;
    forwardValue610_150_1 = forwardValue610_149_1;
    forwardValue610_150_2 = forwardValue610_149_2;
    forwardValue610_150_3 = forwardValue610_149_3;
    forwardValue610_150_4 = forwardValue610_149_4;
    forwardValue610_150_5 = forwardValue610_149_5;
    forwardValue610_150_6 = forwardValue610_149_6;
    forwardValue610_150_7 = forwardValue610_149_7;
    forwardValue610_150_8 = forwardValue610_149_8;
    forwardValue610_150_9 = forwardValue610_149_9;
    forwardValue610_150_10 = forwardValue610_149_10;
    forwardValue610_150_11 = p7;
    }
    forwardValue610_151_0 = forwardValue610_150_0;
    forwardValue610_151_1 = forwardValue610_150_1;
    forwardValue610_151_2 = forwardValue610_150_2;
    forwardValue610_151_3 = forwardValue610_150_3;
    forwardValue610_151_4 = forwardValue610_150_4;
    forwardValue610_151_5 = forwardValue610_150_5;
    forwardValue610_151_6 = forwardValue610_150_6;
    forwardValue610_151_7 = forwardValue610_150_7;
    forwardValue610_151_8 = forwardValue610_150_8;
    forwardValue610_151_9 = forwardValue610_150_9;
    forwardValue610_151_10 = forwardValue610_150_10;
    forwardValue610_151_11 = ((com.moon.jk)(forwardValue610_150_11)).a();
    }
    spill610_27 = com.moon.iZ.a(((float)(forwardValue610_151_0)), ((float)(forwardValue610_151_1)), ((float)(forwardValue610_151_2)), ((float)(forwardValue610_151_3)), ((float)(forwardValue610_151_4)), ((float)(forwardValue610_151_5)), ((float)(forwardValue610_151_6)), ((float)(forwardValue610_151_7)), ((float)(forwardValue610_151_8)), ((float)(forwardValue610_151_9)), ((float)(forwardValue610_151_10)), ((int)(forwardValue610_151_11)));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue610_160_0 = spill610_27;
        break forward_join_160;
    }
    if (!((life11_26 != 0))) {
        forwardValue610_158_0 = spill610_27;
        break forward_join_158;
    }
    forwardValue610_159_0 = spill610_27;
    forwardValue610_159_1 = 0;
    break forward_join_159;
    }
    forwardValue610_159_0 = forwardValue610_158_0;
    forwardValue610_159_1 = 1;
    }
    com.moon.jn.b(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue610_159_1))));
    forwardValue610_160_0 = forwardValue610_159_0;
    }
    return forwardValue610_160_0;
}


public com.moon.jr a(float p0) {
this.j = ((float)(p0));
    return this;
}


public float a(char p0) {
return ((java.lang.Float)(((java.lang.Float)(((java.util.Map)(this.a)).getOrDefault(((java.lang.Object)(java.lang.Character.valueOf(((char)(p0))))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(0x0.0p0f)))))))))).floatValue();
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1988_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jr.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6600;
      if (p[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = o[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/jr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.Map<java.lang.Character, java.lang.Float> a__Map() {
return this.a;
}


public com.moon.jv a__jv() {
return this.b;
}


public com.moon.jx a__jx() {
return this.c;
}


public float a() {
return this.d;
}


public com.moon.jr a(com.moon.jx p0) {
this.c = ((com.moon.jx)(p0));
    return this;
}


public com.moon.jr a(com.moon.jv p0) {
this.b = ((com.moon.jv)(p0));
    return this;
}


public float g() {
return this.j;
}


public float j() {
return this.m;
}


private static native <E extends Throwable> int __sourceIntrinsic_d6a3d4cc8b7b_invokedynamic610_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a3d4cc8b7b_invokedynamic610_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1988_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
