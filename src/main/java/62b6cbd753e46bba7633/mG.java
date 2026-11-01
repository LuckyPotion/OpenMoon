package com.moon;


public class mG extends com.moon.mA {

private com.moon.setting.ModeSetting<?> h;

private com.moon.nX s;

private boolean t;

private java.util.Map<com.moon.l8, com.moon.nX> u;

private static long v;

private static long w;

public mG(com.moon.setting.ModeSetting<?> p0, float p1, float p2, float p3, float p4) { super(); }

private static void __sourceConstructorBody_9c8826bcd9d0ab87(com.moon.mG receiver, com.moon.setting.ModeSetting p0, float p1, float p2, float p3, float p4) throws Throwable {
init_join_59: {
    long local6_life2 = (com.moon.mG.v ^ 91950726322094L);
    com.moon.mG.__sourceConstructorInit_9c8826bcd9d0ab87_0(((com.moon.mG)(receiver)));
    ((com.moon.mG)(receiver)).s = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.mG)(receiver)).u = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.mG)(receiver)).h = ((com.moon.setting.ModeSetting)(p0));
    ((com.moon.mG)(receiver)).e = ((float)(p1));
    ((com.moon.mG)(receiver)).f = ((float)(p2));
    ((com.moon.mG)(receiver)).g = ((float)(p3));
    boolean __sourceSpill129_12 = com.moon.mN.d__Boolean();
    ((com.moon.mG)(receiver)).i = ((float)(p4));
    java.lang.Enum[] local9_life14 = ((com.moon.setting.ModeSetting)(p0)).getValues();
    boolean local8_life15 = __sourceSpill129_12;
    int local10_life16 = (local9_life14).length;
    int local11_life17 = 0;
    init_cycle_41: while (true) {
    if (!((local11_life17 < local10_life16))) {
        break init_join_59;
    }
    java.lang.Enum local12_life18 = (local9_life14)[local11_life17];
    ((java.util.Map)(((com.moon.mG)(receiver)).u)).put(((java.lang.Object)(local12_life18)), ((java.lang.Object)(new com.moon.nX())));
    local11_life17 += 1;
    if (!(local8_life15)) { continue init_cycle_41; }
    break init_cycle_41;
    }
    }
    return;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(2810028502695803271L)), ((long)(1666450723201242501L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(161831498777120L)))));
    long local0_life6 = (com.moon.mG.v ^ 119643589535966L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill241_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill241_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill241_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill241_13 = new byte[8];
    (__sourceSpill241_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill241_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation241_15 = __sourceSpill241_13;
    ((javax.crypto.Cipher)(__sourceSpill241_10)).init(((int)(__sourceSpill241_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill241_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation241_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7119047570824081617L;
    byte[] __sourceSpill241_19 = new byte[8];
    (__sourceSpill241_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill241_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill241_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill241_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill241_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill241_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill241_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill241_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill241_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill241_20)).doFinal(((byte[])(__sourceSpill241_19)));
    w = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_9c8826bcd9d0ab87_0(com.moon.mG a0) throws E;

public boolean b__Boolean() {
return ((0) != 0);
}


private void e__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    java.lang.Object local2 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(local2)), ((java.lang.String)(((com.moon.setting.ModeSetting)(this.h)).getDisplayName())), ((float)(0x1.0147acp3f)), ((float)(((((com.moon.mG)(this)).b() + this.k) + 0x1.4p2f))), ((float)((((com.moon.mG)(this)).a() + 0x1.6p2f))), ((int)(((com.v)(this.p)).v())), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.47ae14p-7f)));
    ((com.moon.hW)(local2)).a(((com.moon.jA)(local1)));
    ((com.moon.hW)(local2)).b();
    return;
}


private void f__sourceReturn_da8c82d5d4() {
int lexicalValue183_108_0;
    com.moon.nX lexicalValue183_120_0;
    com.moon.nX lexicalValue183_121_0;
    float lexicalValue183_121_1;
    int lexicalValue183_187_0;
    int lexicalValue183_323_0;
    boolean spill183_0;
    com.moon.nX spill183_1;
    int spill183_2;
    int spill183_3;
    long life1_3;
    com.moon.jC life4_28;
    com.moon.jm life5_33;
    com.moon.hW life6_38;
    com.moon.hW life7_46;
    com.moon.hW life8_53;
    float life9_55;
    float life10_62;
    float life11_71;
    float life12_79;
    float life13_81;
    com.moon.l8[] life14_86;
    int life15_88;
    int life3_89;
    com.moon.l8 life16_97;
    int life17_113;
    com.moon.nX life18_119;
    com.moon.i3 life19_139;
    com.moon.i3 life20_156;
    lexical_join_389: {
    lexical_join_374: {
    life1_3 = (com.moon.mG.v ^ 109033611699514L);
    life4_28 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(java.lang.Math.min(((float)((this.o - ((this.m + this.o) - (((com.moon.mG)(this)).a() + this.i))))), ((float)(this.o))))));
    life5_33 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life6_38 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life7_46 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    life8_53 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life5_33))))).a();
    life9_55 = 0x1.8p0f;
    spill183_0 = com.moon.mN.d__Boolean();
    life10_62 = (this.e + this.k);
    life11_71 = (((((com.moon.mG)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life12_79 = (this.g - (this.k * 0x1.0p1f));
    life13_81 = 0x1.5p4f;
    life14_86 = ((com.moon.l8[])(((com.moon.setting.ModeSetting)(this.h)).getValues()));
    life15_88 = 0;
    life3_89 = ((spill183_0) ? 1 : 0);
    lexical_cycle_90: while (true) {
    lexical_join_372: {
    lexical_join_363: {
    lexical_join_323: {
    lexical_join_242: {
    lexical_join_226: {
    lexical_join_187: {
    lexical_join_186: {
    lexical_join_121: {
    lexical_join_120: {
    lexical_join_108: {
    lexical_join_107: {
    if (!((life15_88 < (life14_86).length))) {
        break lexical_join_374;
    }
    life16_97 = (life14_86)[life15_88];
    if (!((life3_89 == 0))) {
        break lexical_join_389;
    }
    if (!((life16_97 == ((com.moon.setting.ModeSetting)(this.h)).getValue()))) {
        break lexical_join_107;
    }
    lexicalValue183_108_0 = 1;
    break lexical_join_108;
    }
    lexicalValue183_108_0 = 0;
    }
    life17_113 = lexicalValue183_108_0;
    life18_119 = ((com.moon.nX)(((java.util.Map)(this.u)).get(((java.lang.Object)(life16_97)))));
    spill183_1 = life18_119;
    if (!((life17_113 != 0))) {
        lexicalValue183_120_0 = spill183_1;
        break lexical_join_120;
    }
    lexicalValue183_121_0 = spill183_1;
    lexicalValue183_121_1 = 0x1.0p0f;
    break lexical_join_121;
    }
    lexicalValue183_121_0 = lexicalValue183_120_0;
    lexicalValue183_121_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue183_121_0)).a(((float)(lexicalValue183_121_1)), ((double)(0x1.99999ap-2d)));
    life19_139 = com.moon.i3.a(((float)(life10_62)), ((float)(life11_71)), ((float)(life12_79)), ((float)(life13_81)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    life20_156 = com.moon.i3.a(((float)(life10_62)), ((float)(life11_71)), ((float)(life12_79)), ((float)(life13_81)), ((float)(0x1.4p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119)))))))).getRGB())));
    ((com.moon.i3)(life19_139)).e(((boolean)(false)));
    ((com.moon.i3)(life20_156)).e(((boolean)(false)));
    spill183_2 = (life14_86).length;
    if (!((life3_89 == 0))) {
        lexicalValue183_323_0 = spill183_2;
        break lexical_join_323;
    }
    if (!((spill183_2 > 1))) {
        break lexical_join_242;
    }
    spill183_3 = life15_88;
    if (!((life3_89 == 0))) {
        lexicalValue183_187_0 = spill183_3;
        break lexical_join_187;
    }
    if (!((spill183_3 == 0))) {
        break lexical_join_186;
    }
    ((com.moon.i3)(life19_139)).c(((boolean)(false)));
    ((com.moon.i3)(life19_139)).d(((boolean)(false)));
    ((com.moon.i3)(life20_156)).c(((boolean)(false)));
    ((com.moon.i3)(life20_156)).d(((boolean)(false)));
    if (!((life3_89 != 0))) {
        break lexical_join_242;
    }
    }
    lexicalValue183_187_0 = life15_88;
    }
    if (!((lexicalValue183_187_0 < ((life14_86).length - 1)))) {
        break lexical_join_226;
    }
    ((com.moon.i3)(life19_139)).c(((boolean)(false)));
    ((com.moon.i3)(life19_139)).d(((boolean)(false)));
    ((com.moon.i3)(life19_139)).a(((boolean)(false)));
    ((com.moon.i3)(life19_139)).b(((boolean)(false)));
    ((com.moon.i3)(life20_156)).c(((boolean)(false)));
    ((com.moon.i3)(life20_156)).d(((boolean)(false)));
    ((com.moon.i3)(life20_156)).a(((boolean)(false)));
    ((com.moon.i3)(life20_156)).b(((boolean)(false)));
    if (!((life3_89 != 0))) {
        break lexical_join_242;
    }
    }
    ((com.moon.i3)(life19_139)).b(((boolean)(false)));
    ((com.moon.i3)(life19_139)).a(((boolean)(false)));
    ((com.moon.i3)(life20_156)).b(((boolean)(false)));
    ((com.moon.i3)(life20_156)).a(((boolean)(false)));
    }
    ((com.moon.hW)(life6_38)).a(((com.moon.iX)(life19_139)));
    ((com.moon.hW)(life6_38)).a(((com.moon.iX)(life20_156)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life7_46)), ((java.lang.String)(__sourceExactCall_47c712c723f42f(((com.moon.l8)(life16_97))))), ((float)(0x1.0p3f)), ((float)((life10_62 + 0x1.4p2f))), ((float)((((life11_71 + (life13_81 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(this.a)), ((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).v()))).a(((float)((0x1.0p0f - __sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119))))))))).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life7_46)), ((java.lang.String)(__sourceExactCall_47c712c723f42f(((com.moon.l8)(life16_97))))), ((float)(0x1.0p3f)), ((float)((life10_62 + 0x1.4p2f))), ((float)((((life11_71 + (life13_81 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(this.a)), ((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119)))))))).getRGB())), ((boolean)(false)));
    if (!((life3_89 == 0))) {
        break lexical_join_372;
    }
    lexicalValue183_323_0 = life17_113;
    }
    if (!((lexicalValue183_323_0 != 0))) {
        break lexical_join_363;
    }
    ((com.moon.jm)(life5_33)).a(((com.moon.hW)(life8_53)), ((java.lang.String)("")), ((float)(0x1.1p3f)), ((float)((((life10_62 + life12_79) - 0x1.4p2f) - __sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life5_33)), ((java.lang.String)("")), ((float)(0x1.1p3f)))))), ((float)((((life11_71 + (life13_81 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(life5_33)), ((float)(0x1.1p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119)))))))).getRGB())), ((boolean)(false)));
    }
    life11_71 = (life11_71 + ((life13_81 + life9_55) - 0x1.0p0f));
    life15_88 += 1;
    }
    if (!((life3_89 != 0))) { continue lexical_cycle_90; }
    break lexical_cycle_90;
    }
    }
    ((com.moon.hW)(life6_38)).a(((com.moon.jA)(life4_28)));
    ((com.moon.hW)(life7_46)).a(((com.moon.jA)(life4_28)));
    ((com.moon.hW)(life8_53)).a(((com.moon.jA)(life4_28)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life6_38)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life7_46)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life8_53)));
    }
    return;
}


private void d__sourceReturn_da8c82d5d4() {
float forestValue910000_82_0;
    float forestValue910000_82_1;
    float forestValue910000_91_0;
    float forestValue910000_91_1;
    com.moon.mG forestValue910000_148_0;
    com.moon.mG forestValue910000_149_0;
    float forestValue910000_149_1;
    com.moon.nX forestValue910000_157_0;
    com.moon.nX forestValue910000_158_0;
    float forestValue910000_158_1;
    boolean spill910000_0;
    float spill910000_1;
    float spill910000_2;
    com.moon.mG spill910000_3;
    com.moon.nX spill910000_4;
    long life1_3;
    com.moon.jC life4_14;
    float life5_22;
    int life3_23;
    java.lang.Enum[] life6_27;
    int life7_30;
    int life8_32;
    java.lang.Enum life9_39;
    java.lang.String life10_42;
    float life11_48;
    float life6_94;
    float life7_97;
    float life8_105;
    int life9_108;
    com.moon.hW life10_113;
    com.moon.i3 life11_123;
    forest_join_158: {
    forest_join_157: {
    forest_join_149: {
    forest_join_148: {
    forest_join_91: {
    forest_join_87: {
    life1_3 = (com.moon.mG.v ^ 2575155497795L);
    spill910000_0 = com.moon.mN.d__Boolean();
    life4_14 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    life5_22 = ((this.e + this.k) + 0x1.4p2f);
    life3_23 = ((spill910000_0) ? 1 : 0);
    life6_27 = ((com.moon.setting.ModeSetting)(this.h)).getValues();
    life7_30 = (life6_27).length;
    life8_32 = 0;
    forest_cycle_33: while (true) {
    forest_join_82: {
    forest_join_78: {
    if (!((life8_32 < life7_30))) {
        break forest_join_87;
    }
    life9_39 = (life6_27)[life8_32];
    life10_42 = ((com.moon.l8)(life9_39)).a__String();
    life11_48 = ((com.moon.jm)(this.a)).a(((java.lang.String)(life10_42)), ((float)(0x1.ecccccp2f)));
    spill910000_1 = (life5_22 + life11_48);
    spill910000_2 = ((this.e + this.g) - ((this.k * 0x1.0p1f) + 0x1.4p3f));
    if (!((life3_23 == 0))) {
        forestValue910000_91_0 = spill910000_1;
        forestValue910000_91_1 = spill910000_2;
        break forest_join_91;
    }
    if (!((life3_23 == 0))) {
        forestValue910000_82_0 = spill910000_1;
        forestValue910000_82_1 = spill910000_2;
        break forest_join_82;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill910000_1)), ((float)(spill910000_2))) > 0))) {
        break forest_join_78;
    }
    life5_22 = ((this.e + this.k) + 0x1.4p2f);
    }
    forestValue910000_82_0 = life5_22;
    forestValue910000_82_1 = (life11_48 + 0x1.ep3f);
    }
    life5_22 = (forestValue910000_82_0 + forestValue910000_82_1);
    life8_32 += 1;
    if (!((life3_23 != 0))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    }
    forestValue910000_91_0 = this.e;
    forestValue910000_91_1 = this.k;
    }
    life6_94 = (forestValue910000_91_0 + forestValue910000_91_1);
    life7_97 = ((com.moon.mG)(this)).a();
    life8_105 = (this.g - (this.k * 0x1.0p1f));
    life9_108 = ((int) com.moon.mG.w);
    life10_113 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life11_123 = com.moon.i3.a(((float)(life6_94)), ((float)(life7_97)), ((float)(life8_105)), ((float)(0x1.3p4f)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    ((com.moon.i3)(life11_123)).e(((boolean)(false)));
    ((com.moon.hW)(life10_113)).a(((com.moon.iX)(life11_123)));
    ((com.moon.hW)(life10_113)).a(((com.moon.jA)(life4_14)));
    ((com.moon.hW)(life10_113)).b();
    spill910000_3 = this;
    if (!(this.t)) {
        forestValue910000_148_0 = spill910000_3;
        break forest_join_148;
    }
    forestValue910000_149_0 = spill910000_3;
    forestValue910000_149_1 = ((0x1.58p4f * ((float) (((com.moon.setting.ModeSetting)(this.h)).getValues()).length)) + 0x1.4p4f);
    break forest_join_149;
    }
    forestValue910000_149_0 = forestValue910000_148_0;
    forestValue910000_149_1 = 0x1.3p4f;
    }
    ((com.moon.mG)(forestValue910000_149_0)).j = ((float)(forestValue910000_149_1));
    spill910000_4 = this.d;
    if (!(((com.moon.mG)(this)).a__Boolean())) {
        forestValue910000_157_0 = spill910000_4;
        break forest_join_157;
    }
    forestValue910000_158_0 = spill910000_4;
    forestValue910000_158_1 = 0x1.0p0f;
    break forest_join_158;
    }
    forestValue910000_158_0 = forestValue910000_157_0;
    forestValue910000_158_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(forestValue910000_158_0)).a(((float)(forestValue910000_158_1)), ((double)(0x1.333334p-2d)));
    ((com.moon.nX)(this.s)).a(((float)((this.j * ((com.moon.nX)(this.d)).b()))), ((double)(0x1.333334p-2d)));
    ((com.moon.mG)(this)).d(((float)(((com.moon.nX)(this.s)).b())));
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.ModeSetting)(this.h)).isAvailable())) != 0);
}


public void a(int p0, int p1) {
com.moon.mG forwardValue698_27_0;
    com.moon.mG forwardValue698_29_0;
    boolean spill698_0;
    com.moon.mG spill698_1;
    com.moon.mG spill698_2;
    long life3_3;
    int life5_11;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life3_3 = (com.moon.mG.v ^ 67070760876285L);
    ((com.moon.mG)(this)).c__Void();
    ((com.moon.mG)(this)).d__sourceReturn_da8c82d5d4();
    spill698_0 = com.moon.mN.d__Boolean();
    ((com.moon.mG)(this)).e__sourceReturn_da8c82d5d4();
    life5_11 = ((spill698_0) ? 1 : 0);
    spill698_1 = this;
    if (!((life5_11 == 0))) {
        forwardValue698_27_0 = spill698_1;
        break forward_join_27;
    }
    if (!((!((com.moon.mG)(spill698_1)).t))) {
        break forward_join_26;
    }
    spill698_2 = this;
    if (!((life5_11 == 0))) {
        forwardValue698_29_0 = spill698_2;
        break forward_join_29;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((com.moon.nX)(((com.moon.mG)(spill698_2)).s)).b()))), ((double)(0x1.319999999999ap4d))) > 0))) {
        break forward_join_28;
    }
    }
    forwardValue698_27_0 = this;
    }
    ((com.moon.mG)(forwardValue698_27_0)).f__sourceReturn_da8c82d5d4();
    }
    forwardValue698_29_0 = this;
    }
    __sourceIntrinsic_fd0ba049c90e_call698_11(forwardValue698_29_0, p0, p1);
    return;
}


private static java.lang.ClassCastException a(java.lang.ClassCastException p0) {
return p0;
}


public boolean a__Boolean(int p0, int p1, int p2) {
com.moon.mG lexicalValue181_51_0;
    int lexicalValue181_51_1;
    com.moon.mG lexicalValue181_52_0;
    com.moon.mG lexicalValue181_53_0;
    int lexicalValue181_53_1;
    int lexicalValue181_58_0;
    int lexicalValue181_139_0;
    boolean spill181_0;
    boolean spill181_1;
    com.moon.mG spill181_2;
    boolean spill181_3;
    boolean spill181_4;
    long life4_3;
    float life7_9;
    float life8_18;
    float life9_20;
    int life6_21;
    float life10_28;
    float life11_77;
    float life12_83;
    float life13_92;
    float life14_100;
    float life15_102;
    com.moon.l8[] life16_107;
    int life17_109;
    com.moon.l8 life18_117;
    lexical_join_139: {
    lexical_join_134: {
    lexical_join_58: {
    lexical_join_56: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_51: {
    life4_3 = (com.moon.mG.v ^ 29236266503616L);
    life7_9 = (this.e + this.k);
    spill181_0 = com.moon.mN.d__Boolean();
    life8_18 = (this.g - (this.k * 0x1.0p1f));
    life9_20 = 0x1.7p4f;
    life6_21 = ((spill181_0) ? 1 : 0);
    life10_28 = ((((com.moon.mG)(this)).a() + 0x1.8p1f) + 0x1.7p4f);
    spill181_1 = ((com.moon.mG)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life7_9)), ((float)(((life10_28 - 0x1.7p4f) - 0x1.8p2f))), ((float)(life8_18)), ((float)(0x1.7p4f)));
    if (!((life6_21 == 0))) {
        lexicalValue181_58_0 = ((spill181_1) ? 1 : 0);
        break lexical_join_58;
    }
    if (!(spill181_1)) {
        break lexical_join_56;
    }
    spill181_2 = this;
    spill181_3 = this.t;
    if (!((life6_21 == 0))) {
        lexicalValue181_51_0 = spill181_2;
        lexicalValue181_51_1 = ((spill181_3) ? 1 : 0);
        break lexical_join_51;
    }
    if (!((!spill181_3))) {
        lexicalValue181_52_0 = spill181_2;
        break lexical_join_52;
    }
    lexicalValue181_51_0 = spill181_2;
    lexicalValue181_51_1 = 1;
    }
    lexicalValue181_53_0 = lexicalValue181_51_0;
    lexicalValue181_53_1 = lexicalValue181_51_1;
    break lexical_join_53;
    }
    lexicalValue181_53_0 = lexicalValue181_52_0;
    lexicalValue181_53_1 = 0;
    }
    ((com.moon.mG)(lexicalValue181_53_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue181_53_1)));
    if (!((life6_21 != 0))) {
        break lexical_join_134;
    }
    }
    lexicalValue181_58_0 = ((this.t) ? 1 : 0);
    }
    if (!((life6_21 == 0))) {
        lexicalValue181_139_0 = lexicalValue181_58_0;
        break lexical_join_139;
    }
    if (!((lexicalValue181_58_0 != 0))) {
        break lexical_join_134;
    }
    life11_77 = 0x1.8p0f;
    life12_83 = (this.e + this.k);
    life13_92 = (((((com.moon.mG)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life14_100 = (this.g - (this.k * 0x1.0p1f));
    life15_102 = 0x1.5p4f;
    life16_107 = ((com.moon.l8[])(((com.moon.setting.ModeSetting)(this.h)).getValues()));
    life17_109 = 0;
    lexical_cycle_95: while (true) {
    lexical_join_132: {
    lexical_join_123: {
    if (!((life17_109 < (life16_107).length))) {
        break lexical_join_134;
    }
    life18_117 = (life16_107)[life17_109];
    if (!((life6_21 == 0))) {
        break lexical_join_132;
    }
    spill181_4 = ((com.moon.mG)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life12_83)), ((float)(life13_92)), ((float)(life14_100)), ((float)(life15_102)));
    if (!((life6_21 == 0))) {
        lexicalValue181_139_0 = ((spill181_4) ? 1 : 0);
        break lexical_join_139;
    }
    if (!(spill181_4)) {
        break lexical_join_123;
    }
    ((com.moon.setting.ModeSetting)(this.h)).setValue(((java.lang.Object)(((java.lang.Enum)(((com.moon.mG)(this)).a(((java.lang.Object)(life18_117))))))));
    }
    life13_92 = (life13_92 + ((life15_102 + life11_77) - 0x1.0p0f));
    life17_109 += 1;
    }
    if (!((life6_21 != 0))) { continue lexical_cycle_95; }
    break lexical_cycle_95;
    }
    }
    lexicalValue181_139_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((lexicalValue181_139_0) != 0);
}


private <T> T a(java.lang.Object p0) {
try {
        return ((T)(p0));
    } catch (java.lang.ClassCastException caught2) {
        return null;
    }
}


public void a(int p0, int p1, int p2) {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_fd0ba049c90e_call698_11(com.moon.mG a0, int a1, int a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native float __sourceExactCall_bf9871e16b7660(com.moon.nX p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);

private static native java.lang.String __sourceExactCall_47c712c723f42f(com.moon.l8 p0);
private static native float __sourceExactCall_65a34d18088a70(com.moon.jm p0, float p1);
private static native float __sourceExactCall_b8cf447caf8b81(com.moon.jm p0, java.lang.String p1, float p2);
}
