package com.moon;


public class mJ extends com.moon.mA {

private com.moon.setting.EnumSetting<?> h;

private com.moon.nX s;

private boolean t;

private java.util.Map<com.moon.l8, com.moon.nX> u;

private static long v;

private static long w;

public mJ(com.moon.setting.EnumSetting<?> p0, float p1, float p2, float p3, float p4) { super(); }

private static void __sourceConstructorBody_c06de2c474f589ed(com.moon.mJ receiver, com.moon.setting.EnumSetting p0, float p1, float p2, float p3, float p4) throws Throwable {
init_join_59: {
    long local6_life2 = (com.moon.mJ.v ^ 112909834109189L);
    com.moon.mJ.__sourceConstructorInit_c06de2c474f589ed_0(((com.moon.mJ)(receiver)));
    ((com.moon.mJ)(receiver)).s = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.mJ)(receiver)).u = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.mJ)(receiver)).h = ((com.moon.setting.EnumSetting)(p0));
    ((com.moon.mJ)(receiver)).e = ((float)(p1));
    ((com.moon.mJ)(receiver)).f = ((float)(p2));
    boolean __sourceSpill130_11 = com.moon.mN.d__Boolean();
    ((com.moon.mJ)(receiver)).g = ((float)(p3));
    ((com.moon.mJ)(receiver)).i = ((float)(p4));
    boolean local8_life13 = __sourceSpill130_11;
    java.lang.Enum[] local9_life15 = ((com.moon.setting.EnumSetting)(p0)).getValues();
    int local10_life16 = (local9_life15).length;
    int local11_life17 = 0;
    init_cycle_41: while (true) {
    if (!((local11_life17 < local10_life16))) {
        break init_join_59;
    }
    java.lang.Enum local12_life18 = (local9_life15)[local11_life17];
    ((java.util.Map)(((com.moon.mJ)(receiver)).u)).put(((java.lang.Object)(local12_life18)), ((java.lang.Object)(new com.moon.nX())));
    local11_life17 += 1;
    if (!(local8_life13)) { continue init_cycle_41; }
    break init_cycle_41;
    }
    }
    return;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(3220339927811457862L)), ((long)(-1154570211105231667L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256150173541320L)))));
    long local0_life6 = (com.moon.mJ.v ^ 61617218628200L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill242_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill242_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill242_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill242_13 = new byte[8];
    (__sourceSpill242_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill242_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation242_15 = __sourceSpill242_13;
    ((javax.crypto.Cipher)(__sourceSpill242_10)).init(((int)(__sourceSpill242_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill242_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation242_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5694098144237981524L;
    byte[] __sourceSpill242_19 = new byte[8];
    (__sourceSpill242_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill242_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill242_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill242_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill242_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill242_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill242_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill242_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill242_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill242_20)).doFinal(((byte[])(__sourceSpill242_19)));
    w = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_c06de2c474f589ed_0(com.moon.mJ a0) throws E;

public boolean b__Boolean() {
return ((0) != 0);
}


private void e__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    java.lang.Object local2 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(local2)), ((java.lang.String)(((com.moon.setting.EnumSetting)(this.h)).getDisplayName())), ((float)(0x1.0147acp3f)), ((float)(((((com.moon.mJ)(this)).b() + this.k) + 0x1.4p2f))), ((float)((((com.moon.mJ)(this)).a() + 0x1.6p2f))), ((int)(((com.v)(this.p)).v())), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.47ae14p-7f)));
    ((com.moon.hW)(local2)).a(((com.moon.jA)(local1)));
    ((com.moon.hW)(local2)).b();
    return;
}


private void f__sourceReturn_da8c82d5d4() {
int lexicalValue186_108_0;
    com.moon.nX lexicalValue186_120_0;
    com.moon.nX lexicalValue186_121_0;
    float lexicalValue186_121_1;
    int lexicalValue186_187_0;
    int lexicalValue186_323_0;
    boolean spill186_0;
    com.moon.nX spill186_1;
    int spill186_2;
    int spill186_3;
    long life1_3;
    com.moon.jC life4_28;
    com.moon.jm life5_33;
    com.moon.hW life6_38;
    com.moon.hW life7_46;
    com.moon.hW life8_53;
    float life9_55;
    float life10_62;
    int life3_63;
    float life11_72;
    float life12_80;
    float life13_82;
    com.moon.l8[] life14_87;
    int life15_89;
    com.moon.l8 life16_97;
    int life17_113;
    com.moon.nX life18_119;
    com.moon.i3 life19_139;
    com.moon.i3 life20_156;
    lexical_join_389: {
    lexical_join_374: {
    life1_3 = (com.moon.mJ.v ^ 50901910948710L);
    life4_28 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(java.lang.Math.min(((float)((this.o - ((this.m + this.o) - (((com.moon.mJ)(this)).a() + this.i))))), ((float)(this.o))))));
    life5_33 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life6_38 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life7_46 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    life8_53 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life5_33))))).a();
    life9_55 = 0x1.8p0f;
    spill186_0 = com.moon.mN.d__Boolean();
    life10_62 = (this.e + this.k);
    life3_63 = ((spill186_0) ? 1 : 0);
    life11_72 = (((((com.moon.mJ)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life12_80 = (this.g - (this.k * 0x1.0p1f));
    life13_82 = 0x1.5p4f;
    life14_87 = ((com.moon.l8[])(((com.moon.setting.EnumSetting)(this.h)).getValues()));
    life15_89 = 0;
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
    if (!((life15_89 < (life14_87).length))) {
        break lexical_join_374;
    }
    life16_97 = (life14_87)[life15_89];
    if (!((life3_63 == 0))) {
        break lexical_join_389;
    }
    if (!((life16_97 == ((com.moon.setting.EnumSetting)(this.h)).getValue()))) {
        break lexical_join_107;
    }
    lexicalValue186_108_0 = 1;
    break lexical_join_108;
    }
    lexicalValue186_108_0 = 0;
    }
    life17_113 = lexicalValue186_108_0;
    life18_119 = ((com.moon.nX)(((java.util.Map)(this.u)).get(((java.lang.Object)(life16_97)))));
    spill186_1 = life18_119;
    if (!((life17_113 != 0))) {
        lexicalValue186_120_0 = spill186_1;
        break lexical_join_120;
    }
    lexicalValue186_121_0 = spill186_1;
    lexicalValue186_121_1 = 0x1.0p0f;
    break lexical_join_121;
    }
    lexicalValue186_121_0 = lexicalValue186_120_0;
    lexicalValue186_121_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue186_121_0)).a(((float)(lexicalValue186_121_1)), ((double)(0x1.99999ap-2d)));
    life19_139 = com.moon.i3.a(((float)(life10_62)), ((float)(life11_72)), ((float)(life12_80)), ((float)(life13_82)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    life20_156 = com.moon.i3.a(((float)(life10_62)), ((float)(life11_72)), ((float)(life12_80)), ((float)(life13_82)), ((float)(0x1.4p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119)))))))).getRGB())));
    ((com.moon.i3)(life19_139)).e(((boolean)(false)));
    ((com.moon.i3)(life20_156)).e(((boolean)(false)));
    spill186_2 = (life14_87).length;
    if (!((life3_63 == 0))) {
        lexicalValue186_323_0 = spill186_2;
        break lexical_join_323;
    }
    if (!((spill186_2 > 1))) {
        break lexical_join_242;
    }
    spill186_3 = life15_89;
    if (!((life3_63 == 0))) {
        lexicalValue186_187_0 = spill186_3;
        break lexical_join_187;
    }
    if (!((spill186_3 == 0))) {
        break lexical_join_186;
    }
    ((com.moon.i3)(life19_139)).c(((boolean)(false)));
    ((com.moon.i3)(life19_139)).d(((boolean)(false)));
    ((com.moon.i3)(life20_156)).c(((boolean)(false)));
    ((com.moon.i3)(life20_156)).d(((boolean)(false)));
    if (!((life3_63 != 0))) {
        break lexical_join_242;
    }
    }
    lexicalValue186_187_0 = life15_89;
    }
    if (!((lexicalValue186_187_0 < ((life14_87).length - 1)))) {
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
    if (!((life3_63 != 0))) {
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
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life7_46)), ((java.lang.String)(__sourceExactCall_47c712c723f42f(((com.moon.l8)(life16_97))))), ((float)(0x1.0p3f)), ((float)((life10_62 + 0x1.4p2f))), ((float)((((life11_72 + (life13_82 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(this.a)), ((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).v()))).a(((float)((0x1.0p0f - __sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119))))))))).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life7_46)), ((java.lang.String)(__sourceExactCall_47c712c723f42f(((com.moon.l8)(life16_97))))), ((float)(0x1.0p3f)), ((float)((life10_62 + 0x1.4p2f))), ((float)((((life11_72 + (life13_82 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(this.a)), ((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119)))))))).getRGB())), ((boolean)(false)));
    if (!((life3_63 == 0))) {
        break lexical_join_372;
    }
    lexicalValue186_323_0 = life17_113;
    }
    if (!((lexicalValue186_323_0 != 0))) {
        break lexical_join_363;
    }
    ((com.moon.jm)(life5_33)).a(((com.moon.hW)(life8_53)), ((java.lang.String)("")), ((float)(0x1.1p3f)), ((float)((((life10_62 + life12_80) - 0x1.4p2f) - __sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life5_33)), ((java.lang.String)("")), ((float)(0x1.1p3f)))))), ((float)((((life11_72 + (life13_82 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(life5_33)), ((float)(0x1.1p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_119)))))))).getRGB())), ((boolean)(false)));
    }
    life11_72 = (life11_72 + ((life13_82 + life9_55) - 0x1.0p0f));
    life15_89 += 1;
    }
    if (!((life3_63 != 0))) { continue lexical_cycle_90; }
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
float forestValue910001_97_0;
    float forestValue910001_97_1;
    float forestValue910001_106_0;
    float forestValue910001_106_1;
    com.moon.mJ forestValue910001_163_0;
    com.moon.mJ forestValue910001_164_0;
    float forestValue910001_164_1;
    com.moon.nX forestValue910001_172_0;
    com.moon.nX forestValue910001_173_0;
    float forestValue910001_173_1;
    boolean spill910001_0;
    float spill910001_1;
    float spill910001_2;
    com.moon.mJ spill910001_3;
    com.moon.nX spill910001_4;
    long life1_3;
    com.moon.jC life4_14;
    int life3_15;
    float life5_23;
    int life6_25;
    float life7_30;
    java.lang.Enum[] life8_34;
    int life9_37;
    int life10_39;
    java.lang.Enum life11_46;
    java.lang.String life12_49;
    float life13_55;
    float life8_109;
    float life9_112;
    float life10_120;
    int life11_123;
    com.moon.hW life12_128;
    com.moon.i3 life13_138;
    forest_join_173: {
    forest_join_172: {
    forest_join_164: {
    forest_join_163: {
    forest_join_106: {
    forest_join_102: {
    life1_3 = (com.moon.mJ.v ^ 26284088351330L);
    spill910001_0 = com.moon.mN.e__Boolean();
    life4_14 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    life3_15 = ((spill910001_0) ? 1 : 0);
    life5_23 = ((this.e + this.k) + 0x1.4p2f);
    life6_25 = 0;
    life7_30 = ((com.moon.jm)(this.a)).a(((float)(0x1.ecccccp2f)));
    life8_34 = ((com.moon.setting.EnumSetting)(this.h)).getValues();
    life9_37 = (life8_34).length;
    life10_39 = 0;
    forest_cycle_40: while (true) {
    forest_join_97: {
    forest_join_93: {
    if (!((life10_39 < life9_37))) {
        break forest_join_102;
    }
    life11_46 = (life8_34)[life10_39];
    life12_49 = ((com.moon.l8)(life11_46)).a__String();
    life13_55 = ((com.moon.jm)(this.a)).a(((java.lang.String)(life12_49)), ((float)(0x1.ecccccp2f)));
    spill910001_1 = (life5_23 + life13_55);
    spill910001_2 = ((this.e + this.g) - ((this.k * 0x1.0p1f) + 0x1.4p3f));
    if (!((life3_15 != 0))) {
        forestValue910001_106_0 = spill910001_1;
        forestValue910001_106_1 = spill910001_2;
        break forest_join_106;
    }
    if (!((life3_15 != 0))) {
        forestValue910001_97_0 = spill910001_1;
        forestValue910001_97_1 = spill910001_2;
        break forest_join_97;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill910001_1)), ((float)(spill910001_2))) > 0))) {
        break forest_join_93;
    }
    life5_23 = ((this.e + this.k) + 0x1.4p2f);
    life6_25 = ((int) (((float) life6_25) + (life7_30 + 0x1.ap3f)));
    }
    forestValue910001_97_0 = life5_23;
    forestValue910001_97_1 = (life13_55 + 0x1.ep3f);
    }
    life5_23 = (forestValue910001_97_0 + forestValue910001_97_1);
    life10_39 += 1;
    if (!((life3_15 == 0))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    forestValue910001_106_0 = this.e;
    forestValue910001_106_1 = this.k;
    }
    life8_109 = (forestValue910001_106_0 + forestValue910001_106_1);
    life9_112 = ((com.moon.mJ)(this)).a();
    life10_120 = (this.g - (this.k * 0x1.0p1f));
    life11_123 = ((int) com.moon.mJ.w);
    life12_128 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life13_138 = com.moon.i3.a(((float)(life8_109)), ((float)(life9_112)), ((float)(life10_120)), ((float)(0x1.3p4f)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    ((com.moon.i3)(life13_138)).e(((boolean)(false)));
    ((com.moon.hW)(life12_128)).a(((com.moon.iX)(life13_138)));
    ((com.moon.hW)(life12_128)).a(((com.moon.jA)(life4_14)));
    ((com.moon.hW)(life12_128)).b();
    spill910001_3 = this;
    if (!(this.t)) {
        forestValue910001_163_0 = spill910001_3;
        break forest_join_163;
    }
    forestValue910001_164_0 = spill910001_3;
    forestValue910001_164_1 = ((0x1.58p4f * ((float) (((com.moon.setting.EnumSetting)(this.h)).getValues()).length)) + 0x1.4p4f);
    break forest_join_164;
    }
    forestValue910001_164_0 = forestValue910001_163_0;
    forestValue910001_164_1 = 0x1.3p4f;
    }
    ((com.moon.mJ)(forestValue910001_164_0)).j = ((float)(forestValue910001_164_1));
    spill910001_4 = this.d;
    if (!(((com.moon.mJ)(this)).a__Boolean())) {
        forestValue910001_172_0 = spill910001_4;
        break forest_join_172;
    }
    forestValue910001_173_0 = spill910001_4;
    forestValue910001_173_1 = 0x1.0p0f;
    break forest_join_173;
    }
    forestValue910001_173_0 = forestValue910001_172_0;
    forestValue910001_173_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(forestValue910001_173_0)).a(((float)(forestValue910001_173_1)), ((double)(0x1.333334p-2d)));
    ((com.moon.nX)(this.s)).a(((float)((this.j * ((com.moon.nX)(this.d)).b()))), ((double)(0x1.333334p-2d)));
    ((com.moon.mJ)(this)).d(((float)(((com.moon.nX)(this.s)).b())));
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.EnumSetting)(this.h)).isAvailable())) != 0);
}


public void a(int p0, int p1) {
com.moon.mJ forwardValue708_27_0;
    com.moon.mJ forwardValue708_29_0;
    boolean spill708_0;
    com.moon.mJ spill708_1;
    com.moon.mJ spill708_2;
    long life3_3;
    int life5_9;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life3_3 = (com.moon.mJ.v ^ 129224576940311L);
    spill708_0 = com.moon.mN.e__Boolean();
    ((com.moon.mJ)(this)).c__Void();
    ((com.moon.mJ)(this)).d__sourceReturn_da8c82d5d4();
    life5_9 = ((spill708_0) ? 1 : 0);
    ((com.moon.mJ)(this)).e__sourceReturn_da8c82d5d4();
    spill708_1 = this;
    if (!((life5_9 != 0))) {
        forwardValue708_27_0 = spill708_1;
        break forward_join_27;
    }
    if (!((!((com.moon.mJ)(spill708_1)).t))) {
        break forward_join_26;
    }
    spill708_2 = this;
    if (!((life5_9 != 0))) {
        forwardValue708_29_0 = spill708_2;
        break forward_join_29;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((com.moon.nX)(((com.moon.mJ)(spill708_2)).s)).b()))), ((double)(0x1.319999999999ap4d))) > 0))) {
        break forward_join_28;
    }
    }
    forwardValue708_27_0 = this;
    }
    ((com.moon.mJ)(forwardValue708_27_0)).f__sourceReturn_da8c82d5d4();
    }
    forwardValue708_29_0 = this;
    }
    __sourceIntrinsic_fd0ba049c90e_call708_11(forwardValue708_29_0, p0, p1);
    return;
}


private static java.lang.ClassCastException a(java.lang.ClassCastException p0) {
return p0;
}


public boolean a__Boolean(int p0, int p1, int p2) {
com.moon.mJ lexicalValue184_51_0;
    int lexicalValue184_51_1;
    com.moon.mJ lexicalValue184_52_0;
    com.moon.mJ lexicalValue184_53_0;
    int lexicalValue184_53_1;
    int lexicalValue184_58_0;
    int lexicalValue184_139_0;
    boolean spill184_0;
    boolean spill184_1;
    com.moon.mJ spill184_2;
    boolean spill184_3;
    boolean spill184_4;
    long life4_3;
    float life7_9;
    float life8_17;
    float life9_19;
    float life10_27;
    int life6_28;
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
    life4_3 = (com.moon.mJ.v ^ 90229891845162L);
    life7_9 = (this.e + this.k);
    life8_17 = (this.g - (this.k * 0x1.0p1f));
    life9_19 = 0x1.7p4f;
    spill184_0 = com.moon.mN.e__Boolean();
    life10_27 = ((((com.moon.mJ)(this)).a() + 0x1.8p1f) + 0x1.7p4f);
    life6_28 = ((spill184_0) ? 1 : 0);
    spill184_1 = ((com.moon.mJ)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life7_9)), ((float)(((life10_27 - 0x1.7p4f) - 0x1.8p2f))), ((float)(life8_17)), ((float)(0x1.7p4f)));
    if (!((life6_28 != 0))) {
        lexicalValue184_58_0 = ((spill184_1) ? 1 : 0);
        break lexical_join_58;
    }
    if (!(spill184_1)) {
        break lexical_join_56;
    }
    spill184_2 = this;
    spill184_3 = this.t;
    if (!((life6_28 != 0))) {
        lexicalValue184_51_0 = spill184_2;
        lexicalValue184_51_1 = ((spill184_3) ? 1 : 0);
        break lexical_join_51;
    }
    if (!((!spill184_3))) {
        lexicalValue184_52_0 = spill184_2;
        break lexical_join_52;
    }
    lexicalValue184_51_0 = spill184_2;
    lexicalValue184_51_1 = 1;
    }
    lexicalValue184_53_0 = lexicalValue184_51_0;
    lexicalValue184_53_1 = lexicalValue184_51_1;
    break lexical_join_53;
    }
    lexicalValue184_53_0 = lexicalValue184_52_0;
    lexicalValue184_53_1 = 0;
    }
    ((com.moon.mJ)(lexicalValue184_53_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue184_53_1)));
    if (!((life6_28 == 0))) {
        break lexical_join_134;
    }
    }
    lexicalValue184_58_0 = ((this.t) ? 1 : 0);
    }
    if (!((life6_28 != 0))) {
        lexicalValue184_139_0 = lexicalValue184_58_0;
        break lexical_join_139;
    }
    if (!((lexicalValue184_58_0 != 0))) {
        break lexical_join_134;
    }
    life11_77 = 0x1.8p0f;
    life12_83 = (this.e + this.k);
    life13_92 = (((((com.moon.mJ)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life14_100 = (this.g - (this.k * 0x1.0p1f));
    life15_102 = 0x1.5p4f;
    life16_107 = ((com.moon.l8[])(((com.moon.setting.EnumSetting)(this.h)).getValues()));
    life17_109 = 0;
    lexical_cycle_95: while (true) {
    lexical_join_132: {
    lexical_join_123: {
    if (!((life17_109 < (life16_107).length))) {
        break lexical_join_134;
    }
    life18_117 = (life16_107)[life17_109];
    if (!((life6_28 != 0))) {
        break lexical_join_132;
    }
    spill184_4 = ((com.moon.mJ)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life12_83)), ((float)(life13_92)), ((float)(life14_100)), ((float)(life15_102)));
    if (!((life6_28 != 0))) {
        lexicalValue184_139_0 = ((spill184_4) ? 1 : 0);
        break lexical_join_139;
    }
    if (!(spill184_4)) {
        break lexical_join_123;
    }
    ((com.moon.setting.EnumSetting)(this.h)).setValue(((java.lang.Object)(((java.lang.Enum)(((com.moon.mJ)(this)).a(((java.lang.Object)(life18_117))))))));
    }
    life13_92 = (life13_92 + ((life15_102 + life11_77) - 0x1.0p0f));
    life17_109 += 1;
    }
    if (!((life6_28 == 0))) { continue lexical_cycle_95; }
    break lexical_cycle_95;
    }
    }
    lexicalValue184_139_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((lexicalValue184_139_0) != 0);
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


private static native <E extends Throwable> void __sourceIntrinsic_fd0ba049c90e_call708_11(com.moon.mJ a0, int a1, int a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native float __sourceExactCall_bf9871e16b7660(com.moon.nX p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);

private static native java.lang.String __sourceExactCall_47c712c723f42f(com.moon.l8 p0);
private static native float __sourceExactCall_65a34d18088a70(com.moon.jm p0, float p1);
private static native float __sourceExactCall_b8cf447caf8b81(com.moon.jm p0, java.lang.String p1, float p2);
}
