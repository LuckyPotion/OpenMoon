package com.moon;


public class mQ {

private com.moon.nY a;

private com.moon.mR b;

private com.v c;

private float d;

private float e;

private float f;

private float g;

private static long h;

private static long i;

private static long j;

public mQ(com.moon.mR p0) { super(); }


private static void __sourceConstructorBody_baab6d77db91854b(com.moon.mQ receiver, com.moon.mR p0) throws Throwable {

long local2 = (com.moon.mQ.h ^ 97968834714038L);

    com.moon.mQ.__sourceConstructorInit_baab6d77db91854b_0(((com.moon.mQ)(receiver)));

    ((com.moon.mQ)(receiver)).a = ((com.moon.nY)(new com.moon.nY(com.moon.mQ.j, com.moon.cj.LINEAR)));

    ((com.moon.mQ)(receiver)).b = ((com.moon.mR)(p0));

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(2619969017370172821L)), ((long)(6126080583538427997L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(222051042295899L)))));
    long local5_life6 = (com.moon.mQ.h ^ 96056037578881L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill246_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill246_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill246_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill246_13 = new byte[8];
    (__sourceSpill246_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill246_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation246_15 = __sourceSpill246_13;
    ((javax.crypto.Cipher)(__sourceSpill246_10)).init(((int)(__sourceSpill246_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill246_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation246_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local9_life18 = 4996331632028588335L;
    byte[] __sourceSpill246_19 = new byte[8];
    (__sourceSpill246_19)[0] = ((byte) ((int) (local9_life18 >>> 56)));
    (__sourceSpill246_19)[1] = ((byte) ((int) (local9_life18 >>> 48)));
    (__sourceSpill246_19)[2] = ((byte) ((int) (local9_life18 >>> 40)));
    (__sourceSpill246_19)[3] = ((byte) ((int) (local9_life18 >>> 32)));
    (__sourceSpill246_19)[4] = ((byte) ((int) (local9_life18 >>> 24)));
    (__sourceSpill246_19)[5] = ((byte) ((int) (local9_life18 >>> 16)));
    (__sourceSpill246_19)[6] = ((byte) ((int) (local9_life18 >>> 8)));
    (__sourceSpill246_19)[7] = ((byte) ((int) local9_life18));
    javax.crypto.Cipher __sourceSpill246_20 = local7_life8;
    byte[] local11_life22 = ((javax.crypto.Cipher)(__sourceSpill246_20)).doFinal(((byte[])(__sourceSpill246_19)));
    i = ((long)((((((((((((long) (local11_life22)[0]) & 255L) << 56) | ((((long) (local11_life22)[1]) & 255L) << 48)) | ((((long) (local11_life22)[2]) & 255L) << 40)) | ((((long) (local11_life22)[3]) & 255L) << 32)) | ((((long) (local11_life22)[4]) & 255L) << 24)) | ((((long) (local11_life22)[5]) & 255L) << 16)) | ((((long) (local11_life22)[6]) & 255L) << 8)) | (((long) (local11_life22)[7]) & 255L))));
    javax.crypto.Cipher local0_life25;
    javax.crypto.Cipher __sourceSpill246_27 = (local0_life25 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill246_28 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill246_29 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill246_30 = new byte[8];
    (__sourceSpill246_30)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life31 = 1;
    while ((local1_life31 < 8)) {
        (__sourceSpill246_30)[local1_life31] = ((byte) ((int) ((local5_life6 << (local1_life31 * 8)) >>> 56)));
        local1_life31 += 1;
    }
    byte[] __sourcePreallocation246_32 = __sourceSpill246_30;
    ((javax.crypto.Cipher)(__sourceSpill246_27)).init(((int)(__sourceSpill246_28)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill246_29)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation246_32)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life35 = 2337798823706016453L;
    byte[] __sourceSpill246_36 = new byte[8];
    (__sourceSpill246_36)[0] = ((byte) ((int) (local2_life35 >>> 56)));
    (__sourceSpill246_36)[1] = ((byte) ((int) (local2_life35 >>> 48)));
    (__sourceSpill246_36)[2] = ((byte) ((int) (local2_life35 >>> 40)));
    (__sourceSpill246_36)[3] = ((byte) ((int) (local2_life35 >>> 32)));
    (__sourceSpill246_36)[4] = ((byte) ((int) (local2_life35 >>> 24)));
    (__sourceSpill246_36)[5] = ((byte) ((int) (local2_life35 >>> 16)));
    (__sourceSpill246_36)[6] = ((byte) ((int) (local2_life35 >>> 8)));
    (__sourceSpill246_36)[7] = ((byte) ((int) local2_life35));
    javax.crypto.Cipher __sourceSpill246_37 = local0_life25;
    byte[] local4_life39 = ((javax.crypto.Cipher)(__sourceSpill246_37)).doFinal(((byte[])(__sourceSpill246_36)));
    j = ((long)((((((((((((long) (local4_life39)[0]) & 255L) << 56) | ((((long) (local4_life39)[1]) & 255L) << 48)) | ((((long) (local4_life39)[2]) & 255L) << 40)) | ((((long) (local4_life39)[3]) & 255L) << 32)) | ((((long) (local4_life39)[4]) & 255L) << 24)) | ((((long) (local4_life39)[5]) & 255L) << 16)) | ((((long) (local4_life39)[6]) & 255L) << 8)) | (((long) (local4_life39)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_baab6d77db91854b_0(com.moon.mQ a0) throws E;

public void b(int p0, int p1, int p2) {
((com.moon.mT)(((com.moon.mR)(this.b)).a__mT())).b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private void b() {
java.lang.Object local1 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    float local2 = java.lang.Math.max(((float)((((com.moon.mT)(((com.moon.mR)(this.b)).a__mT())).c() + 0x1.0p4f))), ((float)(0x1.9p7f)));
    float local3 = ((((((com.moon.mT)(((com.moon.mR)(this.b)).a__mT())).d() + 0x1.2p5f) + 0x1.0p4f) + ((com.moon.jm)(local1)).a(((float)(0x1.cp2f)))) + ((com.moon.jm)(local1)).a(((float)(0x1.8p3f))));
    this.f = ((float)(local2));
    this.g = ((float)(local3));
    this.d = ((float)((((java.lang.Float)(((java.lang.Float)(((java.util.function.Supplier)(((com.moon.mR)(this.b)).a__Supplier())).get())))).floatValue() - (local2 / 0x1.0p1f))));
    this.e = ((float)((((java.lang.Float)(((java.lang.Float)(((java.util.function.Supplier)(((com.moon.mR)(this.b)).b__Supplier())).get())))).floatValue() - (local3 / 0x1.0p1f))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
this.c = ((com.v)(((com.moon.module.impl.ClickGUI)(((com.moon.pj)(((com.moon.mR)(this.b)).a__pj())).a__lS())).a__v()));
    ((com.moon.mT)(((com.moon.mR)(this.b)).a__mT())).a__Void();
    ((java.util.List)(((com.moon.mR)(this.b)).a__List())).forEach(((java.util.function.Consumer)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite137_10())));
    return;
}


public void a(int p0, int p1) {
int spill201_0;
    long life3_3;
    float life6_16;
    int life5_17;
    float life7_21;
    float life8_25;
    float life9_36;
    float life10_47;
    com.moon.jm life11_62;
    com.moon.mT life12_66;
    com.moon.hW life13_71;
    java.lang.String life14_100;
    java.lang.String life15_104;
    float life16_109;
    float life17_114;
    float life18_119;
    float life19_128;
    com.moon.hW life20_135;
    float life21_157;
    java.util.Iterator life22_162;
    com.moon.mV life23_169;
    lexical_join_255: {
    lexical_join_217: {
    life3_3 = (com.moon.mQ.h ^ 103497596097469L);
    ((com.moon.mQ)(this)).b();
    ((com.moon.nY)(this.a)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(true)));
    spill201_0 = com.moon.mT.b__Int();
    life6_16 = ((float) ((moom.ir)(com.moon.nS.a())).a__Int());
    life5_17 = spill201_0;
    life7_21 = ((float) ((moom.ir)(com.moon.nS.a())).b__Int());
    life8_25 = ((com.moon.nY)(this.a)).c();
    life9_36 = (((this.d + 0x1.9p6f) / life6_16) * (0x1.0p0f - life8_25));
    life10_47 = (((this.e + 0x1.f4p6f) / life7_21) * (0x1.0p0f - life8_25));
    com.moon.hU.b(((float)(life9_36)), ((float)(life10_47)), ((float)(0x0.0p0f)));
    com.moon.hU.a(((float)(life8_25)), ((float)(life8_25)), ((float)(0x1.0p0f)));
    com.moon.hU.a(((float)(life8_25)));
    life11_62 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    life12_66 = ((com.moon.mR)(this.b)).a__mT();
    life13_71 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life13_71)).a(((com.moon.iX)(com.moon.i3.a(((float)(-0x1.388p14f)), ((float)(-0x1.388p14f)), ((float)(0x1.388p15f)), ((float)(0x1.388p15f)), ((float)(0x0.0p0f)), ((int)(((int) com.moon.mQ.i)))))));
    ((com.moon.hW)(life13_71)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.d)), ((float)(this.e)), ((float)(this.f)), ((float)(this.g)), ((float)(0x1.8p3f)), ((int)(((com.v)(this.c)).q()))))));
    life14_100 = ((com.moon.mR)(this.b)).a__String();
    life15_104 = ((com.moon.mR)(this.b)).b();
    life16_109 = (this.d + 0x1.0p3f);
    life17_114 = (this.e + 0x1.0p3f);
    life18_119 = (this.d + 0x1.0p3f);
    life19_128 = ((this.e + 0x1.0p3f) + ((com.moon.jm)(life11_62)).a(((float)(0x1.8p3f))));
    life20_135 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life11_62))))).a();
    ((com.moon.jm)(life11_62)).b(((com.moon.hW)(life20_135)), ((java.lang.String)(life14_100)), ((float)(0x1.8p3f)), ((float)(life16_109)), ((float)(life17_114)), ((int)(((com.v)(this.c)).r())));
    ((com.moon.jm)(life11_62)).b(((com.moon.hW)(life20_135)), ((java.lang.String)(life15_104)), ((float)(0x1.cp2f)), ((float)(life18_119)), ((float)(life19_128)), ((int)(((com.v)(this.c)).r())));
    life21_157 = 0x0.0p0f;
    life22_162 = ((java.util.List)(((com.moon.mR)(this.b)).a__List())).iterator();
    lexical_cycle_163: while (true) {
    if (!(((java.util.Iterator)(life22_162)).hasNext())) {
        break lexical_join_217;
    }
    life23_169 = ((com.moon.mV)(((java.util.Iterator)(life22_162)).next()));
    ((com.moon.mV)(life23_169)).a(((float)(((((this.d + 0x1.9p7f) - 0x1.0p3f) - ((com.moon.mV)(life23_169)).h) - life21_157))));
    ((com.moon.mV)(life23_169)).b(((float)((((this.e + this.g) - 0x1.0p3f) - ((com.moon.mV)(life23_169)).i))));
    ((com.moon.mV)(life23_169)).a(((com.moon.hW)(life13_71)), ((com.moon.hW)(life20_135)), ((com.v)(this.c)));
    life21_157 = (life21_157 + (((com.moon.mV)(life23_169)).h + 0x1.0p3f));
    if (!((life5_17 == 0))) {
        break lexical_join_255;
    }
    if (!((life5_17 != 0))) { continue lexical_cycle_163; }
    break lexical_cycle_163;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    ((com.moon.hW)(life13_71)).b();
    ((com.moon.hW)(life20_135)).b();
    ((com.moon.mT)(life12_66)).a(((float)(((this.d + 0x1.9p6f) - (((com.moon.mT)(life12_66)).c / 0x1.0p1f)))));
    ((com.moon.mT)(life12_66)).b(((float)(((life19_128 + ((com.moon.jm)(life11_62)).a(((float)(0x1.cp2f)))) + 0x1.8p3f))));
    ((com.moon.mT)(life12_66)).a(((com.v)(this.c)));
    ((com.moon.mT)(life12_66)).a(((int)(p0)), ((int)(p1)));
    com.moon.hU.a__Void();
    com.moon.hU.d__Void();
    com.moon.hU.b__Void();
    }
    return;
}


public void a(int p0, int p1, int p2) {
com.moon.mV lexicalValue202_30_0;
    int spill202_0;
    com.moon.mV spill202_1;
    long life4_3;
    java.util.Iterator life7_9;
    int life6_10;
    com.moon.mV life8_17;
    lexical_join_43: {
    lexical_join_36: {
    life4_3 = (com.moon.mQ.h ^ 122174199294980L);
    spill202_0 = com.moon.mT.c__Int();
    life7_9 = ((java.util.List)(((com.moon.mR)(this.b)).a__List())).iterator();
    life6_10 = spill202_0;
    lexical_cycle_11: while (true) {
    lexical_join_34: {
    lexical_join_30: {
    if (!(((java.util.Iterator)(life7_9)).hasNext())) {
        break lexical_join_36;
    }
    life8_17 = ((com.moon.mV)(((java.util.Iterator)(life7_9)).next()));
    if (!((life6_10 != 0))) {
        break lexical_join_43;
    }
    spill202_1 = life8_17;
    if (!((life6_10 != 0))) {
        lexicalValue202_30_0 = spill202_1;
        break lexical_join_30;
    }
    if (!(((com.moon.mV)(spill202_1)).a(((float)(((float) p0))), ((float)(((float) p1)))))) {
        break lexical_join_34;
    }
    lexicalValue202_30_0 = life8_17;
    }
    ((java.util.function.Consumer)(((com.moon.mV)(lexicalValue202_30_0)).a__Consumer())).accept(((java.lang.Object)(null)));
    return;
    }
    if (!((life6_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    ((com.moon.mT)(((com.moon.mR)(this.b)).a__mT())).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


public void a(char p0, int p1) {
((com.moon.mT)(((com.moon.mR)(this.b)).a__mT())).a(((char)(p0)), ((int)(p1)));
    return;
}


private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_2c8ae721fed4_originalDynamicSite137_10() throws E;
}
