package com.moon;


public class mL extends com.moon.mA {

private com.moon.setting.MultiSelectSetting<?> h;

private com.moon.nX s;

private boolean t;

private java.util.Map<com.moon.l8, com.moon.nX> u;

private static long v;

private static long w;

public mL(com.moon.setting.MultiSelectSetting<?> p0, float p1, float p2, float p3, float p4) { super(); }

private static void __sourceConstructorBody_dda2f39d281b0f58(com.moon.mL receiver, com.moon.setting.MultiSelectSetting p0, float p1, float p2, float p3, float p4) throws Throwable {
init_join_59: {
    long local6_life2 = (com.moon.mL.v ^ 92110312237024L);
    com.moon.mL.__sourceConstructorInit_dda2f39d281b0f58_0(((com.moon.mL)(receiver)));
    ((com.moon.mL)(receiver)).s = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.mL)(receiver)).u = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.mL)(receiver)).h = ((com.moon.setting.MultiSelectSetting)(p0));
    ((com.moon.mL)(receiver)).e = ((float)(p1));
    ((com.moon.mL)(receiver)).f = ((float)(p2));
    ((com.moon.mL)(receiver)).g = ((float)(p3));
    ((com.moon.mL)(receiver)).i = ((float)(p4));
    boolean __sourceSpill132_13 = com.moon.mN.e__Boolean();
    java.lang.Enum[] local9_life14 = ((com.moon.setting.MultiSelectSetting)(p0)).getValues();
    int local10_life15 = (local9_life14).length;
    boolean local8_life16 = __sourceSpill132_13;
    int local11_life17 = 0;
    init_cycle_41: while (true) {
    if (!((local11_life17 < local10_life15))) {
        break init_join_59;
    }
    java.lang.Enum local12_life18 = (local9_life14)[local11_life17];
    ((java.util.Map)(((com.moon.mL)(receiver)).u)).put(((java.lang.Object)(local12_life18)), ((java.lang.Object)(new com.moon.nX())));
    local11_life17 += 1;
    if (!((!local8_life16))) { continue init_cycle_41; }
    break init_cycle_41;
    }
    }
    return;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(-2404084722906507464L)), ((long)(1892085929716873289L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(172077088932832L)))));
    long local0_life6 = (com.moon.mL.v ^ 33640628381927L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill244_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill244_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill244_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill244_13 = new byte[8];
    (__sourceSpill244_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill244_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation244_15 = __sourceSpill244_13;
    ((javax.crypto.Cipher)(__sourceSpill244_10)).init(((int)(__sourceSpill244_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill244_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation244_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6350360985574636458L;
    byte[] __sourceSpill244_19 = new byte[8];
    (__sourceSpill244_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill244_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill244_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill244_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill244_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill244_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill244_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill244_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill244_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill244_20)).doFinal(((byte[])(__sourceSpill244_19)));
    w = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_dda2f39d281b0f58_0(com.moon.mL a0) throws E;

public boolean b__Boolean() {
return ((0) != 0);
}


private void e__sourceReturn_da8c82d5d4() {
com.moon.jC local1_life5 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    com.moon.hW local2_life12 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    int local3_life21 = ((int) ((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Set)(((java.util.Map)(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this.h)).getValue())))).keySet())).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_85f1dd884e89_originalDynamicSite133_18(this)))))).count());
    java.lang.String local4_life27 = __sourceIntrinsic_85f1dd884e89_originalDynamicSite133_26(local3_life21, ((java.util.Map)(((java.util.Map)(((com.moon.setting.MultiSelectSetting)(this.h)).getValue())))).size());
    float local5_life31 = ((com.moon.jm)(this.a)).a(((java.lang.String)(local4_life27)), ((float)(0x1.0147ac0000000p+3F)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(local2_life12)), ((java.lang.String)(((com.moon.setting.MultiSelectSetting)(this.h)).getDisplayName())), ((float)(0x1.0147ac0000000p+3F)), ((float)(((((com.moon.mL)(this)).b() + this.k) + 0x1.4000000000000p+2F))), ((float)((((com.moon.mL)(this)).a() + 0x1.6000000000000p+2F))), ((int)(((com.v)(this.p)).v())), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.47ae140000000p-7F)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(local2_life12)), ((java.lang.String)(local4_life27)), ((float)(0x1.0147ac0000000p+3F)), ((float)(((((((com.moon.mL)(this)).b() + ((com.moon.mL)(this)).d()) - this.k) - local5_life31) - 0x1.4000000000000p+2F))), ((float)((((com.moon.mL)(this)).a() + 0x1.6000000000000p+2F))), ((int)(((com.v)(this.p)).v())), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.47ae140000000p-7F)));
    ((com.moon.hW)(local2_life12)).a(((com.moon.jA)(local1_life5)));
    ((com.moon.hW)(local2_life12)).b();
    return;
}


private void f__sourceReturn_da8c82d5d4() {
com.moon.nX lexicalValue192_119_0;
    com.moon.nX lexicalValue192_120_0;
    float lexicalValue192_120_1;
    int lexicalValue192_186_0;
    int lexicalValue192_322_0;
    boolean spill192_0;
    com.moon.nX spill192_1;
    int spill192_2;
    int spill192_3;
    long life1_3;
    com.moon.jC life4_28;
    com.moon.jm life5_33;
    com.moon.hW life6_38;
    com.moon.hW life7_46;
    com.moon.hW life8_53;
    float life9_55;
    float life10_61;
    float life11_70;
    float life12_78;
    float life13_81;
    int life3_82;
    com.moon.l8[] life14_87;
    int life15_89;
    com.moon.l8 life16_97;
    int life17_105;
    com.moon.nX life18_111;
    com.moon.i3 life19_136;
    com.moon.i3 life20_153;
    lexical_join_388: {
    lexical_join_373: {
    life1_3 = (com.moon.mL.v ^ 127259452726978L);
    life4_28 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(java.lang.Math.min(((float)((this.o - ((this.m + this.o) - (((com.moon.mL)(this)).a() + this.i))))), ((float)(this.o))))));
    life5_33 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life6_38 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life7_46 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    life8_53 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life5_33))))).a();
    life9_55 = 0x1.8p0f;
    life10_61 = (this.e + this.k);
    life11_70 = (((((com.moon.mL)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life12_78 = (this.g - (this.k * 0x1.0p1f));
    spill192_0 = com.moon.mN.d__Boolean();
    life13_81 = 0x1.5p4f;
    life3_82 = ((spill192_0) ? 1 : 0);
    life14_87 = ((com.moon.l8[])(((com.moon.setting.MultiSelectSetting)(this.h)).getValues()));
    life15_89 = 0;
    lexical_cycle_90: while (true) {
    lexical_join_371: {
    lexical_join_362: {
    lexical_join_322: {
    lexical_join_241: {
    lexical_join_225: {
    lexical_join_186: {
    lexical_join_185: {
    lexical_join_120: {
    lexical_join_119: {
    if (!((life15_89 < (life14_87).length))) {
        break lexical_join_373;
    }
    life16_97 = (life14_87)[life15_89];
    life17_105 = ((((com.moon.setting.MultiSelectSetting)(this.h)).isSelected(((java.lang.Enum)(((java.lang.Enum)(((com.moon.mL)(this)).a(((java.lang.Object)(life16_97))))))))) ? 1 : 0);
    life18_111 = ((com.moon.nX)(((java.util.Map)(this.u)).get(((java.lang.Object)(life16_97)))));
    if (!((life3_82 == 0))) {
        break lexical_join_388;
    }
    spill192_1 = life18_111;
    if (!((life17_105 != 0))) {
        lexicalValue192_119_0 = spill192_1;
        break lexical_join_119;
    }
    lexicalValue192_120_0 = spill192_1;
    lexicalValue192_120_1 = 0x1.0p0f;
    break lexical_join_120;
    }
    lexicalValue192_120_0 = lexicalValue192_119_0;
    lexicalValue192_120_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue192_120_0)).a(((float)(lexicalValue192_120_1)), ((double)(0x1.99999ap-2d)));
    life19_136 = com.moon.i3.a(((float)(life10_61)), ((float)(life11_70)), ((float)(life12_78)), ((float)(life13_81)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    life20_153 = com.moon.i3.a(((float)(life10_61)), ((float)(life11_70)), ((float)(life12_78)), ((float)(life13_81)), ((float)(0x1.4p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_111)))))))).getRGB())));
    ((com.moon.i3)(life19_136)).e(((boolean)(false)));
    ((com.moon.i3)(life20_153)).e(((boolean)(false)));
    spill192_2 = (life14_87).length;
    if (!((life3_82 == 0))) {
        lexicalValue192_322_0 = spill192_2;
        break lexical_join_322;
    }
    if (!((spill192_2 > 1))) {
        break lexical_join_241;
    }
    spill192_3 = life15_89;
    if (!((life3_82 == 0))) {
        lexicalValue192_186_0 = spill192_3;
        break lexical_join_186;
    }
    if (!((spill192_3 == 0))) {
        break lexical_join_185;
    }
    ((com.moon.i3)(life19_136)).c(((boolean)(false)));
    ((com.moon.i3)(life19_136)).d(((boolean)(false)));
    ((com.moon.i3)(life20_153)).c(((boolean)(false)));
    ((com.moon.i3)(life20_153)).d(((boolean)(false)));
    if (!((life3_82 != 0))) {
        break lexical_join_241;
    }
    }
    lexicalValue192_186_0 = life15_89;
    }
    if (!((lexicalValue192_186_0 < ((life14_87).length - 1)))) {
        break lexical_join_225;
    }
    ((com.moon.i3)(life19_136)).c(((boolean)(false)));
    ((com.moon.i3)(life19_136)).d(((boolean)(false)));
    ((com.moon.i3)(life19_136)).a(((boolean)(false)));
    ((com.moon.i3)(life19_136)).b(((boolean)(false)));
    ((com.moon.i3)(life20_153)).c(((boolean)(false)));
    ((com.moon.i3)(life20_153)).d(((boolean)(false)));
    ((com.moon.i3)(life20_153)).a(((boolean)(false)));
    ((com.moon.i3)(life20_153)).b(((boolean)(false)));
    if (!((life3_82 != 0))) {
        break lexical_join_241;
    }
    }
    ((com.moon.i3)(life19_136)).b(((boolean)(false)));
    ((com.moon.i3)(life19_136)).a(((boolean)(false)));
    ((com.moon.i3)(life20_153)).b(((boolean)(false)));
    ((com.moon.i3)(life20_153)).a(((boolean)(false)));
    }
    ((com.moon.hW)(life6_38)).a(((com.moon.iX)(life19_136)));
    ((com.moon.hW)(life6_38)).a(((com.moon.iX)(life20_153)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life7_46)), ((java.lang.String)(__sourceExactCall_47c712c723f42f(((com.moon.l8)(life16_97))))), ((float)(0x1.0p3f)), ((float)((life10_61 + 0x1.4p2f))), ((float)((((life11_70 + (life13_81 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(this.a)), ((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).v()))).a(((float)((0x1.0p0f - __sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_111))))))))).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life7_46)), ((java.lang.String)(__sourceExactCall_47c712c723f42f(((com.moon.l8)(life16_97))))), ((float)(0x1.0p3f)), ((float)((life10_61 + 0x1.4p2f))), ((float)((((life11_70 + (life13_81 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(this.a)), ((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_111)))))))).getRGB())), ((boolean)(false)));
    if (!((life3_82 == 0))) {
        break lexical_join_371;
    }
    lexicalValue192_322_0 = life17_105;
    }
    if (!((lexicalValue192_322_0 != 0))) {
        break lexical_join_362;
    }
    ((com.moon.jm)(life5_33)).a(((com.moon.hW)(life8_53)), ((java.lang.String)("")), ((float)(0x1.1p3f)), ((float)((((life10_61 + life12_78) - 0x1.4p2f) - __sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life5_33)), ((java.lang.String)("")), ((float)(0x1.1p3f)))))), ((float)((((life11_70 + (life13_81 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(life5_33)), ((float)(0x1.1p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life18_111)))))))).getRGB())), ((boolean)(false)));
    }
    life11_70 = (life11_70 + ((life13_81 + life9_55) - 0x1.0p0f));
    life15_89 += 1;
    }
    if (!((life3_82 != 0))) { continue lexical_cycle_90; }
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
float forestValue910002_97_0;
    float forestValue910002_97_1;
    float forestValue910002_106_0;
    float forestValue910002_106_1;
    com.moon.mL forestValue910002_163_0;
    com.moon.mL forestValue910002_164_0;
    float forestValue910002_164_1;
    com.moon.nX forestValue910002_172_0;
    com.moon.nX forestValue910002_173_0;
    float forestValue910002_173_1;
    boolean spill910002_0;
    float spill910002_1;
    float spill910002_2;
    com.moon.mL spill910002_3;
    com.moon.nX spill910002_4;
    long life1_3;
    com.moon.jC life4_13;
    float life5_21;
    int life6_24;
    float life7_29;
    java.lang.Enum[] life8_33;
    int life3_34;
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
    life1_3 = (com.moon.mL.v ^ 22487298856597L);
    life4_13 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    life5_21 = ((this.e + this.k) + 0x1.4p2f);
    spill910002_0 = com.moon.mN.e__Boolean();
    life6_24 = 0;
    life7_29 = ((com.moon.jm)(this.a)).a(((float)(0x1.ecccccp2f)));
    life8_33 = ((com.moon.setting.MultiSelectSetting)(this.h)).getValues();
    life3_34 = ((spill910002_0) ? 1 : 0);
    life9_37 = (life8_33).length;
    life10_39 = 0;
    forest_cycle_40: while (true) {
    forest_join_97: {
    forest_join_93: {
    if (!((life10_39 < life9_37))) {
        break forest_join_102;
    }
    life11_46 = (life8_33)[life10_39];
    life12_49 = ((com.moon.l8)(life11_46)).a__String();
    life13_55 = ((com.moon.jm)(this.a)).a(((java.lang.String)(life12_49)), ((float)(0x1.ecccccp2f)));
    spill910002_1 = (life5_21 + life13_55);
    spill910002_2 = ((this.e + this.g) - ((this.k * 0x1.0p1f) + 0x1.4p3f));
    if (!((life3_34 != 0))) {
        forestValue910002_106_0 = spill910002_1;
        forestValue910002_106_1 = spill910002_2;
        break forest_join_106;
    }
    if (!((life3_34 != 0))) {
        forestValue910002_97_0 = spill910002_1;
        forestValue910002_97_1 = spill910002_2;
        break forest_join_97;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill910002_1)), ((float)(spill910002_2))) > 0))) {
        break forest_join_93;
    }
    life5_21 = ((this.e + this.k) + 0x1.4p2f);
    life6_24 = ((int) (((float) life6_24) + (life7_29 + 0x1.ap3f)));
    }
    forestValue910002_97_0 = life5_21;
    forestValue910002_97_1 = (life13_55 + 0x1.ep3f);
    }
    life5_21 = (forestValue910002_97_0 + forestValue910002_97_1);
    life10_39 += 1;
    if (!((life3_34 == 0))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    forestValue910002_106_0 = this.e;
    forestValue910002_106_1 = this.k;
    }
    life8_109 = (forestValue910002_106_0 + forestValue910002_106_1);
    life9_112 = ((com.moon.mL)(this)).a();
    life10_120 = (this.g - (this.k * 0x1.0p1f));
    life11_123 = ((int) com.moon.mL.w);
    life12_128 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life13_138 = com.moon.i3.a(((float)(life8_109)), ((float)(life9_112)), ((float)(life10_120)), ((float)(0x1.3p4f)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    ((com.moon.i3)(life13_138)).e(((boolean)(false)));
    ((com.moon.hW)(life12_128)).a(((com.moon.iX)(life13_138)));
    ((com.moon.hW)(life12_128)).a(((com.moon.jA)(life4_13)));
    ((com.moon.hW)(life12_128)).b();
    spill910002_3 = this;
    if (!(this.t)) {
        forestValue910002_163_0 = spill910002_3;
        break forest_join_163;
    }
    forestValue910002_164_0 = spill910002_3;
    forestValue910002_164_1 = ((0x1.58p4f * ((float) (((com.moon.setting.MultiSelectSetting)(this.h)).getValues()).length)) + 0x1.4p4f);
    break forest_join_164;
    }
    forestValue910002_164_0 = forestValue910002_163_0;
    forestValue910002_164_1 = 0x1.3p4f;
    }
    ((com.moon.mL)(forestValue910002_164_0)).j = ((float)(forestValue910002_164_1));
    spill910002_4 = this.d;
    if (!(((com.moon.mL)(this)).a__Boolean())) {
        forestValue910002_172_0 = spill910002_4;
        break forest_join_172;
    }
    forestValue910002_173_0 = spill910002_4;
    forestValue910002_173_1 = 0x1.0p0f;
    break forest_join_173;
    }
    forestValue910002_173_0 = forestValue910002_172_0;
    forestValue910002_173_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(forestValue910002_173_0)).a(((float)(forestValue910002_173_1)), ((double)(0x1.333334p-2d)));
    ((com.moon.nX)(this.s)).a(((float)((this.j * ((com.moon.nX)(this.d)).b()))), ((double)(0x1.333334p-2d)));
    ((com.moon.mL)(this)).d(((float)(((com.moon.nX)(this.s)).b())));
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.MultiSelectSetting)(this.h)).isAvailable())) != 0);
}


public void a(int p0, int p1) {
com.moon.mL forwardValue720_27_0;
    com.moon.mL forwardValue720_29_0;
    boolean spill720_0;
    com.moon.mL spill720_1;
    com.moon.mL spill720_2;
    long life3_3;
    int life5_11;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life3_3 = (com.moon.mL.v ^ 77157742727204L);
    spill720_0 = com.moon.mN.e__Boolean();
    ((com.moon.mL)(this)).c__Void();
    ((com.moon.mL)(this)).d__sourceReturn_da8c82d5d4();
    ((com.moon.mL)(this)).e__sourceReturn_da8c82d5d4();
    life5_11 = ((spill720_0) ? 1 : 0);
    spill720_1 = this;
    if (!((life5_11 != 0))) {
        forwardValue720_27_0 = spill720_1;
        break forward_join_27;
    }
    if (!((!((com.moon.mL)(spill720_1)).t))) {
        break forward_join_26;
    }
    spill720_2 = this;
    if (!((life5_11 != 0))) {
        forwardValue720_29_0 = spill720_2;
        break forward_join_29;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((com.moon.nX)(((com.moon.mL)(spill720_2)).s)).b()))), ((double)(0x1.319999999999ap4d))) > 0))) {
        break forward_join_28;
    }
    }
    forwardValue720_27_0 = this;
    }
    ((com.moon.mL)(forwardValue720_27_0)).f__sourceReturn_da8c82d5d4();
    }
    forwardValue720_29_0 = this;
    }
    __sourceIntrinsic_fd0ba049c90e_call720_11(forwardValue720_29_0, p0, p1);
    return;
}


private static java.lang.ClassCastException a(java.lang.ClassCastException p0) {
return p0;
}


public void a(int p0, int p1, int p2) {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private <T> T a(java.lang.Object p0) {
try {
        return ((T)(p0));
    } catch (java.lang.ClassCastException caught2) {
        return null;
    }
}


public boolean a__Boolean(int p0, int p1, int p2) {
com.moon.mL lexicalValue190_51_0;
    int lexicalValue190_51_1;
    com.moon.mL lexicalValue190_52_0;
    com.moon.mL lexicalValue190_53_0;
    int lexicalValue190_53_1;
    int lexicalValue190_58_0;
    int lexicalValue190_139_0;
    boolean spill190_0;
    boolean spill190_1;
    com.moon.mL spill190_2;
    boolean spill190_3;
    boolean spill190_4;
    long life4_3;
    float life7_9;
    float life8_18;
    int life6_19;
    float life9_21;
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
    life4_3 = (com.moon.mL.v ^ 107458311693593L);
    life7_9 = (this.e + this.k);
    spill190_0 = com.moon.mN.d__Boolean();
    life8_18 = (this.g - (this.k * 0x1.0p1f));
    life6_19 = ((spill190_0) ? 1 : 0);
    life9_21 = 0x1.7p4f;
    life10_28 = ((((com.moon.mL)(this)).a() + 0x1.8p1f) + 0x1.7p4f);
    spill190_1 = ((com.moon.mL)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life7_9)), ((float)(((life10_28 - 0x1.7p4f) - 0x1.8p2f))), ((float)(life8_18)), ((float)(0x1.7p4f)));
    if (!((life6_19 == 0))) {
        lexicalValue190_58_0 = ((spill190_1) ? 1 : 0);
        break lexical_join_58;
    }
    if (!(spill190_1)) {
        break lexical_join_56;
    }
    spill190_2 = this;
    spill190_3 = this.t;
    if (!((life6_19 == 0))) {
        lexicalValue190_51_0 = spill190_2;
        lexicalValue190_51_1 = ((spill190_3) ? 1 : 0);
        break lexical_join_51;
    }
    if (!((!spill190_3))) {
        lexicalValue190_52_0 = spill190_2;
        break lexical_join_52;
    }
    lexicalValue190_51_0 = spill190_2;
    lexicalValue190_51_1 = 1;
    }
    lexicalValue190_53_0 = lexicalValue190_51_0;
    lexicalValue190_53_1 = lexicalValue190_51_1;
    break lexical_join_53;
    }
    lexicalValue190_53_0 = lexicalValue190_52_0;
    lexicalValue190_53_1 = 0;
    }
    ((com.moon.mL)(lexicalValue190_53_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue190_53_1)));
    if (!((life6_19 != 0))) {
        break lexical_join_134;
    }
    }
    lexicalValue190_58_0 = ((this.t) ? 1 : 0);
    }
    if (!((life6_19 == 0))) {
        lexicalValue190_139_0 = lexicalValue190_58_0;
        break lexical_join_139;
    }
    if (!((lexicalValue190_58_0 != 0))) {
        break lexical_join_134;
    }
    life11_77 = 0x1.8p0f;
    life12_83 = (this.e + this.k);
    life13_92 = (((((com.moon.mL)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life14_100 = (this.g - (this.k * 0x1.0p1f));
    life15_102 = 0x1.5p4f;
    life16_107 = ((com.moon.l8[])(((com.moon.setting.MultiSelectSetting)(this.h)).getValues()));
    life17_109 = 0;
    lexical_cycle_95: while (true) {
    lexical_join_132: {
    lexical_join_123: {
    if (!((life17_109 < (life16_107).length))) {
        break lexical_join_134;
    }
    life18_117 = (life16_107)[life17_109];
    if (!((life6_19 == 0))) {
        break lexical_join_132;
    }
    spill190_4 = ((com.moon.mL)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life12_83)), ((float)(life13_92)), ((float)(life14_100)), ((float)(life15_102)));
    if (!((life6_19 == 0))) {
        lexicalValue190_139_0 = ((spill190_4) ? 1 : 0);
        break lexical_join_139;
    }
    if (!(spill190_4)) {
        break lexical_join_123;
    }
    ((com.moon.setting.MultiSelectSetting)(this.h)).toggle(((java.lang.Enum)(((java.lang.Enum)(((com.moon.mL)(this)).a(((java.lang.Object)(life18_117))))))));
    }
    life13_92 = (life13_92 + ((life15_102 + life11_77) - 0x1.0p0f));
    life17_109 += 1;
    }
    if (!((life6_19 != 0))) { continue lexical_cycle_95; }
    break lexical_cycle_95;
    }
    }
    lexicalValue190_139_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((lexicalValue190_139_0) != 0);
}


private boolean lambda$drawTitleAndCurrentMode$0(java.lang.Enum p0) {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.MultiSelectSetting)(this.h)).isSelected(((java.lang.Enum)(((java.lang.Enum)(((com.moon.mL)(this)).a(((java.lang.Object)(p0)))))))))) != 0);
}


private static native <E extends Throwable> void __sourceIntrinsic_fd0ba049c90e_call720_11(com.moon.mL a0, int a1, int a2) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_85f1dd884e89_originalDynamicSite133_18(com.moon.mL a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_85f1dd884e89_originalDynamicSite133_26(int a0, int a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native float __sourceExactCall_bf9871e16b7660(com.moon.nX p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);

private static native java.lang.String __sourceExactCall_47c712c723f42f(com.moon.l8 p0);
private static native float __sourceExactCall_65a34d18088a70(com.moon.jm p0, float p1);
private static native float __sourceExactCall_b8cf447caf8b81(com.moon.jm p0, java.lang.String p1, float p2);
}
