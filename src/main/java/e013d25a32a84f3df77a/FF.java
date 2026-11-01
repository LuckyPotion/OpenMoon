package moom;


public class FF implements com.google.gson.JsonDeserializer<moom.FE>, com.google.gson.JsonSerializer<moom.FE> {

private static long a;

private static long b;

public FF() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-3212688872619506267L)), ((long)(-1974406431113843436L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(109105652421314L)))));
    long local0_life6 = (moom.FF.a ^ 121633959035579L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill532_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill532_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill532_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill532_13 = new byte[8];
    (__sourceSpill532_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill532_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation532_15 = __sourceSpill532_13;
    ((javax.crypto.Cipher)(__sourceSpill532_10)).init(((int)(__sourceSpill532_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill532_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation532_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7629900402937086834L;
    byte[] __sourceSpill532_19 = new byte[8];
    (__sourceSpill532_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill532_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill532_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill532_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill532_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill532_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill532_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill532_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill532_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill532_20)).doFinal(((byte[])(__sourceSpill532_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> moom.FE __sourceHandlerCall_4549cbd1ea44a1adb6e6(moom.FF a0, com.google.gson.JsonElement a1, java.lang.reflect.Type a2, com.google.gson.JsonDeserializationContext a3) throws E;
private static final class __SourceHandler_4549cbd1ea44a1adb6e6 {

public static moom.FE f112(moom.FF receiver, com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws Throwable {
    moom.FE forwardValue112_266_0;
    moom.FE forwardValue112_584_0;
    java.lang.String[] spill112_0;
    moom.FE spill112_1;
    moom.FE spill112_2;
    moom.FE spill112_3;
    long life4_3;
    com.google.gson.JsonObject life7_7;
    java.lang.String[] life6_8;
    moom.FE life8_12;
    forward_join_584: {
    forward_join_268: {
    forward_join_266: {
    forward_join_265: {
    life4_3 = (__fieldRead112_0() ^ 124900825692549L);
    spill112_0 = __call112_1();
    life7_7 = __call112_2(p0);
    life6_8 = spill112_0;
    life8_12 = new moom.FE();
    __fieldWrite112_5(life8_12, __call112_4(life7_7, "coordinateScale", __fieldRead112_3(life8_12)));
    __fieldWrite112_8(life8_12, __call112_7(life7_7, "heightScale", __fieldRead112_6(life8_12)));
    __fieldWrite112_11(life8_12, __call112_10(life7_7, "lowerLimitScale", __fieldRead112_9(life8_12)));
    __fieldWrite112_14(life8_12, __call112_13(life7_7, "upperLimitScale", __fieldRead112_12(life8_12)));
    __fieldWrite112_17(life8_12, __call112_16(life7_7, "depthNoiseScaleX", __fieldRead112_15(life8_12)));
    __fieldWrite112_20(life8_12, __call112_19(life7_7, "depthNoiseScaleZ", __fieldRead112_18(life8_12)));
    __fieldWrite112_23(life8_12, __call112_22(life7_7, "depthNoiseScaleExponent", __fieldRead112_21(life8_12)));
    __fieldWrite112_26(life8_12, __call112_25(life7_7, "mainNoiseScaleX", __fieldRead112_24(life8_12)));
    __fieldWrite112_29(life8_12, __call112_28(life7_7, "mainNoiseScaleY", __fieldRead112_27(life8_12)));
    __fieldWrite112_32(life8_12, __call112_31(life7_7, "mainNoiseScaleZ", __fieldRead112_30(life8_12)));
    __fieldWrite112_35(life8_12, __call112_34(life7_7, "baseSize", __fieldRead112_33(life8_12)));
    __fieldWrite112_38(life8_12, __call112_37(life7_7, "stretchY", __fieldRead112_36(life8_12)));
    __fieldWrite112_41(life8_12, __call112_40(life7_7, "biomeDepthWeight", __fieldRead112_39(life8_12)));
    __fieldWrite112_44(life8_12, __call112_43(life7_7, "biomeDepthOffset", __fieldRead112_42(life8_12)));
    __fieldWrite112_47(life8_12, __call112_46(life7_7, "biomeScaleWeight", __fieldRead112_45(life8_12)));
    __fieldWrite112_50(life8_12, __call112_49(life7_7, "biomeScaleOffset", __fieldRead112_48(life8_12)));
    __fieldWrite112_53(life8_12, __call112_52(life7_7, "seaLevel", __fieldRead112_51(life8_12)));
    __fieldWrite112_56(life8_12, __call112_55(life7_7, "useCaves", __fieldRead112_54(life8_12)));
    __fieldWrite112_59(life8_12, __call112_58(life7_7, "useDungeons", __fieldRead112_57(life8_12)));
    __fieldWrite112_62(life8_12, __call112_61(life7_7, "dungeonChance", __fieldRead112_60(life8_12)));
    __fieldWrite112_65(life8_12, __call112_64(life7_7, "useStrongholds", __fieldRead112_63(life8_12)));
    __fieldWrite112_68(life8_12, __call112_67(life7_7, "useVillages", __fieldRead112_66(life8_12)));
    __fieldWrite112_71(life8_12, __call112_70(life7_7, "useMineShafts", __fieldRead112_69(life8_12)));
    __fieldWrite112_74(life8_12, __call112_73(life7_7, "useTemples", __fieldRead112_72(life8_12)));
    __fieldWrite112_77(life8_12, __call112_76(life7_7, "useMonuments", __fieldRead112_75(life8_12)));
    __fieldWrite112_80(life8_12, __call112_79(life7_7, "useRavines", __fieldRead112_78(life8_12)));
    __fieldWrite112_83(life8_12, __call112_82(life7_7, "useWaterLakes", __fieldRead112_81(life8_12)));
    __fieldWrite112_86(life8_12, __call112_85(life7_7, "waterLakeChance", __fieldRead112_84(life8_12)));
    __fieldWrite112_89(life8_12, __call112_88(life7_7, "useLavaLakes", __fieldRead112_87(life8_12)));
    __fieldWrite112_92(life8_12, __call112_91(life7_7, "lavaLakeChance", __fieldRead112_90(life8_12)));
    __fieldWrite112_95(life8_12, __call112_94(life7_7, "useLavaOceans", __fieldRead112_93(life8_12)));
    __fieldWrite112_98(life8_12, __call112_97(life7_7, "fixedBiome", __fieldRead112_96(life8_12)));
    spill112_1 = life8_12;
    if (!((life6_8 != null))) {
        forwardValue112_266_0 = spill112_1;
        break forward_join_266;
    }
    if (!((__fieldRead112_99(spill112_1) < ((int) __fieldRead112_100())))) {
        break forward_join_265;
    }
    spill112_2 = life8_12;
    if (!((life6_8 != null))) {
        forwardValue112_266_0 = spill112_2;
        break forward_join_266;
    }
    if (!((__fieldRead112_101(spill112_2) >= -1))) {
        break forward_join_265;
    }
    spill112_3 = life8_12;
    if (!((life6_8 != null))) {
        forwardValue112_584_0 = spill112_3;
        break forward_join_584;
    }
    if (!((__fieldRead112_102(spill112_3) >= __fieldRead112_104(__fieldRead112_103())))) {
        break forward_join_268;
    }
    moom.FE __stackOp112_105_0 = life8_12;
    __fieldWrite112_107(__stackOp112_105_0, (__fieldRead112_106(__stackOp112_105_0) + 2));
    if (!((life6_8 == null))) {
        break forward_join_268;
    }
    }
    forwardValue112_266_0 = life8_12;
    }
    __fieldWrite112_108(forwardValue112_266_0, -1);
    }
    __fieldWrite112_111(life8_12, __call112_110(life7_7, "biomeSize", __fieldRead112_109(life8_12)));
    __fieldWrite112_114(life8_12, __call112_113(life7_7, "riverSize", __fieldRead112_112(life8_12)));
    __fieldWrite112_117(life8_12, __call112_116(life7_7, "dirtSize", __fieldRead112_115(life8_12)));
    __fieldWrite112_120(life8_12, __call112_119(life7_7, "dirtCount", __fieldRead112_118(life8_12)));
    __fieldWrite112_123(life8_12, __call112_122(life7_7, "dirtMinHeight", __fieldRead112_121(life8_12)));
    __fieldWrite112_126(life8_12, __call112_125(life7_7, "dirtMaxHeight", __fieldRead112_124(life8_12)));
    __fieldWrite112_129(life8_12, __call112_128(life7_7, "gravelSize", __fieldRead112_127(life8_12)));
    __fieldWrite112_132(life8_12, __call112_131(life7_7, "gravelCount", __fieldRead112_130(life8_12)));
    __fieldWrite112_135(life8_12, __call112_134(life7_7, "gravelMinHeight", __fieldRead112_133(life8_12)));
    __fieldWrite112_138(life8_12, __call112_137(life7_7, "gravelMaxHeight", __fieldRead112_136(life8_12)));
    __fieldWrite112_141(life8_12, __call112_140(life7_7, "graniteSize", __fieldRead112_139(life8_12)));
    __fieldWrite112_144(life8_12, __call112_143(life7_7, "graniteCount", __fieldRead112_142(life8_12)));
    __fieldWrite112_147(life8_12, __call112_146(life7_7, "graniteMinHeight", __fieldRead112_145(life8_12)));
    __fieldWrite112_150(life8_12, __call112_149(life7_7, "graniteMaxHeight", __fieldRead112_148(life8_12)));
    __fieldWrite112_153(life8_12, __call112_152(life7_7, "dioriteSize", __fieldRead112_151(life8_12)));
    __fieldWrite112_156(life8_12, __call112_155(life7_7, "dioriteCount", __fieldRead112_154(life8_12)));
    __fieldWrite112_159(life8_12, __call112_158(life7_7, "dioriteMinHeight", __fieldRead112_157(life8_12)));
    __fieldWrite112_162(life8_12, __call112_161(life7_7, "dioriteMaxHeight", __fieldRead112_160(life8_12)));
    __fieldWrite112_165(life8_12, __call112_164(life7_7, "andesiteSize", __fieldRead112_163(life8_12)));
    __fieldWrite112_168(life8_12, __call112_167(life7_7, "andesiteCount", __fieldRead112_166(life8_12)));
    __fieldWrite112_171(life8_12, __call112_170(life7_7, "andesiteMinHeight", __fieldRead112_169(life8_12)));
    __fieldWrite112_174(life8_12, __call112_173(life7_7, "andesiteMaxHeight", __fieldRead112_172(life8_12)));
    __fieldWrite112_177(life8_12, __call112_176(life7_7, "coalSize", __fieldRead112_175(life8_12)));
    __fieldWrite112_180(life8_12, __call112_179(life7_7, "coalCount", __fieldRead112_178(life8_12)));
    __fieldWrite112_183(life8_12, __call112_182(life7_7, "coalMinHeight", __fieldRead112_181(life8_12)));
    __fieldWrite112_186(life8_12, __call112_185(life7_7, "coalMaxHeight", __fieldRead112_184(life8_12)));
    __fieldWrite112_189(life8_12, __call112_188(life7_7, "ironSize", __fieldRead112_187(life8_12)));
    __fieldWrite112_192(life8_12, __call112_191(life7_7, "ironCount", __fieldRead112_190(life8_12)));
    __fieldWrite112_195(life8_12, __call112_194(life7_7, "ironMinHeight", __fieldRead112_193(life8_12)));
    __fieldWrite112_198(life8_12, __call112_197(life7_7, "ironMaxHeight", __fieldRead112_196(life8_12)));
    __fieldWrite112_201(life8_12, __call112_200(life7_7, "goldSize", __fieldRead112_199(life8_12)));
    __fieldWrite112_204(life8_12, __call112_203(life7_7, "goldCount", __fieldRead112_202(life8_12)));
    __fieldWrite112_207(life8_12, __call112_206(life7_7, "goldMinHeight", __fieldRead112_205(life8_12)));
    __fieldWrite112_210(life8_12, __call112_209(life7_7, "goldMaxHeight", __fieldRead112_208(life8_12)));
    __fieldWrite112_213(life8_12, __call112_212(life7_7, "redstoneSize", __fieldRead112_211(life8_12)));
    __fieldWrite112_216(life8_12, __call112_215(life7_7, "redstoneCount", __fieldRead112_214(life8_12)));
    __fieldWrite112_219(life8_12, __call112_218(life7_7, "redstoneMinHeight", __fieldRead112_217(life8_12)));
    __fieldWrite112_222(life8_12, __call112_221(life7_7, "redstoneMaxHeight", __fieldRead112_220(life8_12)));
    __fieldWrite112_225(life8_12, __call112_224(life7_7, "diamondSize", __fieldRead112_223(life8_12)));
    __fieldWrite112_228(life8_12, __call112_227(life7_7, "diamondCount", __fieldRead112_226(life8_12)));
    __fieldWrite112_231(life8_12, __call112_230(life7_7, "diamondMinHeight", __fieldRead112_229(life8_12)));
    __fieldWrite112_234(life8_12, __call112_233(life7_7, "diamondMaxHeight", __fieldRead112_232(life8_12)));
    __fieldWrite112_237(life8_12, __call112_236(life7_7, "lapisSize", __fieldRead112_235(life8_12)));
    __fieldWrite112_240(life8_12, __call112_239(life7_7, "lapisCount", __fieldRead112_238(life8_12)));
    __fieldWrite112_243(life8_12, __call112_242(life7_7, "lapisCenterHeight", __fieldRead112_241(life8_12)));
    forwardValue112_584_0 = life8_12;
    }
    __fieldWrite112_246(forwardValue112_584_0, __call112_245(life7_7, "lapisSpread", __fieldRead112_244(life8_12)));
    return life8_12;
}
public static moom.FE h112_0(java.lang.Exception p0) throws Throwable {
    throw __call2011200_0(p0);
}
public static moom.FE h112_1(java.lang.Exception p0) throws Throwable {
    throw __call2011201_0(p0);
}
public static moom.FE h112_2(java.lang.Exception p0) throws Throwable {
    throw __call2011202_0(p0);
}
public static moom.FE h112_3(java.lang.Exception p0) throws Throwable {
    throw __call2011203_0(p0);
}
public static moom.FE h112_4(java.lang.Exception p0) throws Throwable {
    throw __call2011204_0(p0);
}
public static moom.FE h112_5(java.lang.Exception p0) throws Throwable {
    throw __call2011205_0(p0);
}
public static moom.FE h112_6(java.lang.Exception p0) throws Throwable {
    throw __call2011206_0(p0);
}
public static moom.FE h112_7(java.lang.Exception p0, moom.FE p1) throws Throwable {
    java.lang.Exception local2 = p0;
    return p1;
}
private static native long __fieldRead112_0() throws Throwable;
private static native java.lang.String[] __call112_1() throws Throwable;
private static native com.google.gson.JsonObject __call112_2(com.google.gson.JsonElement a0) throws Throwable;
private static native float __fieldRead112_3(moom.FE a0) throws Throwable;
private static native float __call112_4(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_5(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_6(moom.FE a0) throws Throwable;
private static native float __call112_7(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_8(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_9(moom.FE a0) throws Throwable;
private static native float __call112_10(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_11(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_12(moom.FE a0) throws Throwable;
private static native float __call112_13(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_14(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_15(moom.FE a0) throws Throwable;
private static native float __call112_16(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_17(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_18(moom.FE a0) throws Throwable;
private static native float __call112_19(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_20(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_21(moom.FE a0) throws Throwable;
private static native float __call112_22(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_23(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_24(moom.FE a0) throws Throwable;
private static native float __call112_25(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_26(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_27(moom.FE a0) throws Throwable;
private static native float __call112_28(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_29(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_30(moom.FE a0) throws Throwable;
private static native float __call112_31(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_32(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_33(moom.FE a0) throws Throwable;
private static native float __call112_34(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_35(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_36(moom.FE a0) throws Throwable;
private static native float __call112_37(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_38(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_39(moom.FE a0) throws Throwable;
private static native float __call112_40(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_41(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_42(moom.FE a0) throws Throwable;
private static native float __call112_43(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_44(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_45(moom.FE a0) throws Throwable;
private static native float __call112_46(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_47(moom.FE a0, float a1) throws Throwable;
private static native float __fieldRead112_48(moom.FE a0) throws Throwable;
private static native float __call112_49(com.google.gson.JsonObject a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite112_50(moom.FE a0, float a1) throws Throwable;
private static native int __fieldRead112_51(moom.FE a0) throws Throwable;
private static native int __call112_52(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_53(moom.FE a0, int a1) throws Throwable;
private static native boolean __fieldRead112_54(moom.FE a0) throws Throwable;
private static native boolean __call112_55(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_56(moom.FE a0, boolean a1) throws Throwable;
private static native boolean __fieldRead112_57(moom.FE a0) throws Throwable;
private static native boolean __call112_58(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_59(moom.FE a0, boolean a1) throws Throwable;
private static native int __fieldRead112_60(moom.FE a0) throws Throwable;
private static native int __call112_61(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_62(moom.FE a0, int a1) throws Throwable;
private static native boolean __fieldRead112_63(moom.FE a0) throws Throwable;
private static native boolean __call112_64(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_65(moom.FE a0, boolean a1) throws Throwable;
private static native boolean __fieldRead112_66(moom.FE a0) throws Throwable;
private static native boolean __call112_67(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_68(moom.FE a0, boolean a1) throws Throwable;
private static native boolean __fieldRead112_69(moom.FE a0) throws Throwable;
private static native boolean __call112_70(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_71(moom.FE a0, boolean a1) throws Throwable;
private static native boolean __fieldRead112_72(moom.FE a0) throws Throwable;
private static native boolean __call112_73(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_74(moom.FE a0, boolean a1) throws Throwable;
private static native boolean __fieldRead112_75(moom.FE a0) throws Throwable;
private static native boolean __call112_76(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_77(moom.FE a0, boolean a1) throws Throwable;
private static native boolean __fieldRead112_78(moom.FE a0) throws Throwable;
private static native boolean __call112_79(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_80(moom.FE a0, boolean a1) throws Throwable;
private static native boolean __fieldRead112_81(moom.FE a0) throws Throwable;
private static native boolean __call112_82(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_83(moom.FE a0, boolean a1) throws Throwable;
private static native int __fieldRead112_84(moom.FE a0) throws Throwable;
private static native int __call112_85(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_86(moom.FE a0, int a1) throws Throwable;
private static native boolean __fieldRead112_87(moom.FE a0) throws Throwable;
private static native boolean __call112_88(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_89(moom.FE a0, boolean a1) throws Throwable;
private static native int __fieldRead112_90(moom.FE a0) throws Throwable;
private static native int __call112_91(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_92(moom.FE a0, int a1) throws Throwable;
private static native boolean __fieldRead112_93(moom.FE a0) throws Throwable;
private static native boolean __call112_94(com.google.gson.JsonObject a0, java.lang.String a1, boolean a2) throws Throwable;
private static native void __fieldWrite112_95(moom.FE a0, boolean a1) throws Throwable;
private static native int __fieldRead112_96(moom.FE a0) throws Throwable;
private static native int __call112_97(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_98(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_99(moom.FE a0) throws Throwable;
private static native long __fieldRead112_100() throws Throwable;
private static native int __fieldRead112_101(moom.FE a0) throws Throwable;
private static native int __fieldRead112_102(moom.FE a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead112_103() throws Throwable;
private static native int __fieldRead112_104(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __fieldRead112_106(moom.FE a0) throws Throwable;
private static native void __fieldWrite112_107(moom.FE a0, int a1) throws Throwable;
private static native void __fieldWrite112_108(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_109(moom.FE a0) throws Throwable;
private static native int __call112_110(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_111(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_112(moom.FE a0) throws Throwable;
private static native int __call112_113(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_114(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_115(moom.FE a0) throws Throwable;
private static native int __call112_116(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_117(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_118(moom.FE a0) throws Throwable;
private static native int __call112_119(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_120(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_121(moom.FE a0) throws Throwable;
private static native int __call112_122(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_123(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_124(moom.FE a0) throws Throwable;
private static native int __call112_125(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_126(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_127(moom.FE a0) throws Throwable;
private static native int __call112_128(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_129(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_130(moom.FE a0) throws Throwable;
private static native int __call112_131(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_132(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_133(moom.FE a0) throws Throwable;
private static native int __call112_134(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_135(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_136(moom.FE a0) throws Throwable;
private static native int __call112_137(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_138(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_139(moom.FE a0) throws Throwable;
private static native int __call112_140(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_141(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_142(moom.FE a0) throws Throwable;
private static native int __call112_143(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_144(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_145(moom.FE a0) throws Throwable;
private static native int __call112_146(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_147(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_148(moom.FE a0) throws Throwable;
private static native int __call112_149(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_150(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_151(moom.FE a0) throws Throwable;
private static native int __call112_152(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_153(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_154(moom.FE a0) throws Throwable;
private static native int __call112_155(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_156(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_157(moom.FE a0) throws Throwable;
private static native int __call112_158(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_159(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_160(moom.FE a0) throws Throwable;
private static native int __call112_161(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_162(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_163(moom.FE a0) throws Throwable;
private static native int __call112_164(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_165(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_166(moom.FE a0) throws Throwable;
private static native int __call112_167(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_168(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_169(moom.FE a0) throws Throwable;
private static native int __call112_170(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_171(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_172(moom.FE a0) throws Throwable;
private static native int __call112_173(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_174(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_175(moom.FE a0) throws Throwable;
private static native int __call112_176(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_177(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_178(moom.FE a0) throws Throwable;
private static native int __call112_179(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_180(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_181(moom.FE a0) throws Throwable;
private static native int __call112_182(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_183(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_184(moom.FE a0) throws Throwable;
private static native int __call112_185(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_186(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_187(moom.FE a0) throws Throwable;
private static native int __call112_188(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_189(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_190(moom.FE a0) throws Throwable;
private static native int __call112_191(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_192(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_193(moom.FE a0) throws Throwable;
private static native int __call112_194(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_195(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_196(moom.FE a0) throws Throwable;
private static native int __call112_197(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_198(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_199(moom.FE a0) throws Throwable;
private static native int __call112_200(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_201(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_202(moom.FE a0) throws Throwable;
private static native int __call112_203(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_204(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_205(moom.FE a0) throws Throwable;
private static native int __call112_206(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_207(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_208(moom.FE a0) throws Throwable;
private static native int __call112_209(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_210(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_211(moom.FE a0) throws Throwable;
private static native int __call112_212(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_213(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_214(moom.FE a0) throws Throwable;
private static native int __call112_215(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_216(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_217(moom.FE a0) throws Throwable;
private static native int __call112_218(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_219(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_220(moom.FE a0) throws Throwable;
private static native int __call112_221(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_222(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_223(moom.FE a0) throws Throwable;
private static native int __call112_224(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_225(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_226(moom.FE a0) throws Throwable;
private static native int __call112_227(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_228(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_229(moom.FE a0) throws Throwable;
private static native int __call112_230(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_231(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_232(moom.FE a0) throws Throwable;
private static native int __call112_233(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_234(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_235(moom.FE a0) throws Throwable;
private static native int __call112_236(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_237(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_238(moom.FE a0) throws Throwable;
private static native int __call112_239(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_240(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_241(moom.FE a0) throws Throwable;
private static native int __call112_242(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_243(moom.FE a0, int a1) throws Throwable;
private static native int __fieldRead112_244(moom.FE a0) throws Throwable;
private static native int __call112_245(com.google.gson.JsonObject a0, java.lang.String a1, int a2) throws Throwable;
private static native void __fieldWrite112_246(moom.FE a0, int a1) throws Throwable;
private static native java.lang.Exception __call2011200_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011201_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011202_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011203_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011204_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011205_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2011206_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> com.google.gson.JsonElement __sourceHandlerCall_fb14d22b1a95c397b50b(moom.FF a0, moom.FE a1, java.lang.reflect.Type a2, com.google.gson.JsonSerializationContext a3) throws E;
private static final class __SourceHandler_fb14d22b1a95c397b50b {

public static com.google.gson.JsonElement f158(moom.FF receiver, moom.FE p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) throws Throwable {
    long life4_3;
    com.google.gson.JsonObject life7_7;
    java.lang.String[] life6_303;
    life4_3 = (__fieldRead158_0() ^ 75006449468730L);
    life7_7 = new com.google.gson.JsonObject();
    __call158_3(life7_7, "coordinateScale", __call158_2(__fieldRead158_1(p0)));
    __call158_6(life7_7, "heightScale", __call158_5(__fieldRead158_4(p0)));
    __call158_9(life7_7, "lowerLimitScale", __call158_8(__fieldRead158_7(p0)));
    __call158_12(life7_7, "upperLimitScale", __call158_11(__fieldRead158_10(p0)));
    __call158_15(life7_7, "depthNoiseScaleX", __call158_14(__fieldRead158_13(p0)));
    __call158_18(life7_7, "depthNoiseScaleZ", __call158_17(__fieldRead158_16(p0)));
    __call158_21(life7_7, "depthNoiseScaleExponent", __call158_20(__fieldRead158_19(p0)));
    __call158_24(life7_7, "mainNoiseScaleX", __call158_23(__fieldRead158_22(p0)));
    __call158_27(life7_7, "mainNoiseScaleY", __call158_26(__fieldRead158_25(p0)));
    __call158_30(life7_7, "mainNoiseScaleZ", __call158_29(__fieldRead158_28(p0)));
    __call158_33(life7_7, "baseSize", __call158_32(__fieldRead158_31(p0)));
    __call158_36(life7_7, "stretchY", __call158_35(__fieldRead158_34(p0)));
    __call158_39(life7_7, "biomeDepthWeight", __call158_38(__fieldRead158_37(p0)));
    __call158_42(life7_7, "biomeDepthOffset", __call158_41(__fieldRead158_40(p0)));
    __call158_45(life7_7, "biomeScaleWeight", __call158_44(__fieldRead158_43(p0)));
    __call158_48(life7_7, "biomeScaleOffset", __call158_47(__fieldRead158_46(p0)));
    __call158_51(life7_7, "seaLevel", __call158_50(__fieldRead158_49(p0)));
    __call158_54(life7_7, "useCaves", __call158_53(__fieldRead158_52(p0)));
    __call158_57(life7_7, "useDungeons", __call158_56(__fieldRead158_55(p0)));
    __call158_60(life7_7, "dungeonChance", __call158_59(__fieldRead158_58(p0)));
    java.lang.String[] spill158_0 = __call158_61();
    __call158_64(life7_7, "useStrongholds", __call158_63(__fieldRead158_62(p0)));
    __call158_67(life7_7, "useVillages", __call158_66(__fieldRead158_65(p0)));
    __call158_70(life7_7, "useMineShafts", __call158_69(__fieldRead158_68(p0)));
    __call158_73(life7_7, "useTemples", __call158_72(__fieldRead158_71(p0)));
    __call158_76(life7_7, "useMonuments", __call158_75(__fieldRead158_74(p0)));
    __call158_79(life7_7, "useRavines", __call158_78(__fieldRead158_77(p0)));
    __call158_82(life7_7, "useWaterLakes", __call158_81(__fieldRead158_80(p0)));
    __call158_85(life7_7, "waterLakeChance", __call158_84(__fieldRead158_83(p0)));
    __call158_88(life7_7, "useLavaLakes", __call158_87(__fieldRead158_86(p0)));
    __call158_91(life7_7, "lavaLakeChance", __call158_90(__fieldRead158_89(p0)));
    __call158_94(life7_7, "useLavaOceans", __call158_93(__fieldRead158_92(p0)));
    __call158_97(life7_7, "fixedBiome", __call158_96(__fieldRead158_95(p0)));
    __call158_100(life7_7, "biomeSize", __call158_99(__fieldRead158_98(p0)));
    __call158_103(life7_7, "riverSize", __call158_102(__fieldRead158_101(p0)));
    __call158_106(life7_7, "dirtSize", __call158_105(__fieldRead158_104(p0)));
    __call158_109(life7_7, "dirtCount", __call158_108(__fieldRead158_107(p0)));
    __call158_112(life7_7, "dirtMinHeight", __call158_111(__fieldRead158_110(p0)));
    __call158_115(life7_7, "dirtMaxHeight", __call158_114(__fieldRead158_113(p0)));
    __call158_118(life7_7, "gravelSize", __call158_117(__fieldRead158_116(p0)));
    __call158_121(life7_7, "gravelCount", __call158_120(__fieldRead158_119(p0)));
    __call158_124(life7_7, "gravelMinHeight", __call158_123(__fieldRead158_122(p0)));
    __call158_127(life7_7, "gravelMaxHeight", __call158_126(__fieldRead158_125(p0)));
    __call158_130(life7_7, "graniteSize", __call158_129(__fieldRead158_128(p0)));
    __call158_133(life7_7, "graniteCount", __call158_132(__fieldRead158_131(p0)));
    __call158_136(life7_7, "graniteMinHeight", __call158_135(__fieldRead158_134(p0)));
    __call158_139(life7_7, "graniteMaxHeight", __call158_138(__fieldRead158_137(p0)));
    __call158_142(life7_7, "dioriteSize", __call158_141(__fieldRead158_140(p0)));
    __call158_145(life7_7, "dioriteCount", __call158_144(__fieldRead158_143(p0)));
    __call158_148(life7_7, "dioriteMinHeight", __call158_147(__fieldRead158_146(p0)));
    life6_303 = spill158_0;
    __call158_151(life7_7, "dioriteMaxHeight", __call158_150(__fieldRead158_149(p0)));
    __call158_154(life7_7, "andesiteSize", __call158_153(__fieldRead158_152(p0)));
    __call158_157(life7_7, "andesiteCount", __call158_156(__fieldRead158_155(p0)));
    __call158_160(life7_7, "andesiteMinHeight", __call158_159(__fieldRead158_158(p0)));
    __call158_163(life7_7, "andesiteMaxHeight", __call158_162(__fieldRead158_161(p0)));
    __call158_166(life7_7, "coalSize", __call158_165(__fieldRead158_164(p0)));
    __call158_169(life7_7, "coalCount", __call158_168(__fieldRead158_167(p0)));
    __call158_172(life7_7, "coalMinHeight", __call158_171(__fieldRead158_170(p0)));
    __call158_175(life7_7, "coalMaxHeight", __call158_174(__fieldRead158_173(p0)));
    __call158_178(life7_7, "ironSize", __call158_177(__fieldRead158_176(p0)));
    __call158_181(life7_7, "ironCount", __call158_180(__fieldRead158_179(p0)));
    __call158_184(life7_7, "ironMinHeight", __call158_183(__fieldRead158_182(p0)));
    __call158_187(life7_7, "ironMaxHeight", __call158_186(__fieldRead158_185(p0)));
    __call158_190(life7_7, "goldSize", __call158_189(__fieldRead158_188(p0)));
    __call158_193(life7_7, "goldCount", __call158_192(__fieldRead158_191(p0)));
    __call158_196(life7_7, "goldMinHeight", __call158_195(__fieldRead158_194(p0)));
    __call158_199(life7_7, "goldMaxHeight", __call158_198(__fieldRead158_197(p0)));
    __call158_202(life7_7, "redstoneSize", __call158_201(__fieldRead158_200(p0)));
    __call158_205(life7_7, "redstoneCount", __call158_204(__fieldRead158_203(p0)));
    __call158_208(life7_7, "redstoneMinHeight", __call158_207(__fieldRead158_206(p0)));
    __call158_211(life7_7, "redstoneMaxHeight", __call158_210(__fieldRead158_209(p0)));
    __call158_214(life7_7, "diamondSize", __call158_213(__fieldRead158_212(p0)));
    __call158_217(life7_7, "diamondCount", __call158_216(__fieldRead158_215(p0)));
    __call158_220(life7_7, "diamondMinHeight", __call158_219(__fieldRead158_218(p0)));
    __call158_223(life7_7, "diamondMaxHeight", __call158_222(__fieldRead158_221(p0)));
    __call158_226(life7_7, "lapisSize", __call158_225(__fieldRead158_224(p0)));
    __call158_229(life7_7, "lapisCount", __call158_228(__fieldRead158_227(p0)));
    __call158_232(life7_7, "lapisCenterHeight", __call158_231(__fieldRead158_230(p0)));
    __call158_235(life7_7, "lapisSpread", __call158_234(__fieldRead158_233(p0)));
    com.google.gson.JsonObject spill158_1 = life7_7;
    if ((__call158_236() != null)) {
        __call158_237(new java.lang.String[5]);
    }
    return spill158_1;
}
public static com.google.gson.JsonElement h158_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call2015800_0(p0);
}
private static native long __fieldRead158_0() throws Throwable;
private static native float __fieldRead158_1(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_2(float a0) throws Throwable;
private static native void __call158_3(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_4(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_5(float a0) throws Throwable;
private static native void __call158_6(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_7(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_8(float a0) throws Throwable;
private static native void __call158_9(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_10(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_11(float a0) throws Throwable;
private static native void __call158_12(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_13(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_14(float a0) throws Throwable;
private static native void __call158_15(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_16(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_17(float a0) throws Throwable;
private static native void __call158_18(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_19(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_20(float a0) throws Throwable;
private static native void __call158_21(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_22(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_23(float a0) throws Throwable;
private static native void __call158_24(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_25(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_26(float a0) throws Throwable;
private static native void __call158_27(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_28(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_29(float a0) throws Throwable;
private static native void __call158_30(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_31(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_32(float a0) throws Throwable;
private static native void __call158_33(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_34(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_35(float a0) throws Throwable;
private static native void __call158_36(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_37(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_38(float a0) throws Throwable;
private static native void __call158_39(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_40(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_41(float a0) throws Throwable;
private static native void __call158_42(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_43(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_44(float a0) throws Throwable;
private static native void __call158_45(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native float __fieldRead158_46(moom.FE a0) throws Throwable;
private static native java.lang.Float __call158_47(float a0) throws Throwable;
private static native void __call158_48(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native int __fieldRead158_49(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_50(int a0) throws Throwable;
private static native void __call158_51(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native boolean __fieldRead158_52(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_53(boolean a0) throws Throwable;
private static native void __call158_54(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead158_55(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_56(boolean a0) throws Throwable;
private static native void __call158_57(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native int __fieldRead158_58(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_59(int a0) throws Throwable;
private static native void __call158_60(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String[] __call158_61() throws Throwable;
private static native boolean __fieldRead158_62(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_63(boolean a0) throws Throwable;
private static native void __call158_64(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead158_65(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_66(boolean a0) throws Throwable;
private static native void __call158_67(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead158_68(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_69(boolean a0) throws Throwable;
private static native void __call158_70(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead158_71(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_72(boolean a0) throws Throwable;
private static native void __call158_73(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead158_74(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_75(boolean a0) throws Throwable;
private static native void __call158_76(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead158_77(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_78(boolean a0) throws Throwable;
private static native void __call158_79(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native boolean __fieldRead158_80(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_81(boolean a0) throws Throwable;
private static native void __call158_82(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native int __fieldRead158_83(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_84(int a0) throws Throwable;
private static native void __call158_85(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native boolean __fieldRead158_86(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_87(boolean a0) throws Throwable;
private static native void __call158_88(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native int __fieldRead158_89(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_90(int a0) throws Throwable;
private static native void __call158_91(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native boolean __fieldRead158_92(moom.FE a0) throws Throwable;
private static native java.lang.Boolean __call158_93(boolean a0) throws Throwable;
private static native void __call158_94(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native int __fieldRead158_95(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_96(int a0) throws Throwable;
private static native void __call158_97(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_98(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_99(int a0) throws Throwable;
private static native void __call158_100(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_101(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_102(int a0) throws Throwable;
private static native void __call158_103(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_104(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_105(int a0) throws Throwable;
private static native void __call158_106(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_107(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_108(int a0) throws Throwable;
private static native void __call158_109(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_110(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_111(int a0) throws Throwable;
private static native void __call158_112(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_113(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_114(int a0) throws Throwable;
private static native void __call158_115(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_116(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_117(int a0) throws Throwable;
private static native void __call158_118(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_119(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_120(int a0) throws Throwable;
private static native void __call158_121(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_122(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_123(int a0) throws Throwable;
private static native void __call158_124(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_125(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_126(int a0) throws Throwable;
private static native void __call158_127(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_128(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_129(int a0) throws Throwable;
private static native void __call158_130(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_131(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_132(int a0) throws Throwable;
private static native void __call158_133(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_134(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_135(int a0) throws Throwable;
private static native void __call158_136(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_137(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_138(int a0) throws Throwable;
private static native void __call158_139(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_140(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_141(int a0) throws Throwable;
private static native void __call158_142(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_143(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_144(int a0) throws Throwable;
private static native void __call158_145(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_146(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_147(int a0) throws Throwable;
private static native void __call158_148(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_149(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_150(int a0) throws Throwable;
private static native void __call158_151(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_152(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_153(int a0) throws Throwable;
private static native void __call158_154(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_155(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_156(int a0) throws Throwable;
private static native void __call158_157(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_158(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_159(int a0) throws Throwable;
private static native void __call158_160(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_161(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_162(int a0) throws Throwable;
private static native void __call158_163(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_164(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_165(int a0) throws Throwable;
private static native void __call158_166(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_167(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_168(int a0) throws Throwable;
private static native void __call158_169(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_170(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_171(int a0) throws Throwable;
private static native void __call158_172(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_173(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_174(int a0) throws Throwable;
private static native void __call158_175(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_176(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_177(int a0) throws Throwable;
private static native void __call158_178(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_179(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_180(int a0) throws Throwable;
private static native void __call158_181(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_182(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_183(int a0) throws Throwable;
private static native void __call158_184(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_185(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_186(int a0) throws Throwable;
private static native void __call158_187(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_188(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_189(int a0) throws Throwable;
private static native void __call158_190(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_191(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_192(int a0) throws Throwable;
private static native void __call158_193(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_194(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_195(int a0) throws Throwable;
private static native void __call158_196(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_197(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_198(int a0) throws Throwable;
private static native void __call158_199(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_200(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_201(int a0) throws Throwable;
private static native void __call158_202(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_203(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_204(int a0) throws Throwable;
private static native void __call158_205(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_206(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_207(int a0) throws Throwable;
private static native void __call158_208(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_209(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_210(int a0) throws Throwable;
private static native void __call158_211(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_212(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_213(int a0) throws Throwable;
private static native void __call158_214(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_215(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_216(int a0) throws Throwable;
private static native void __call158_217(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_218(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_219(int a0) throws Throwable;
private static native void __call158_220(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_221(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_222(int a0) throws Throwable;
private static native void __call158_223(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_224(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_225(int a0) throws Throwable;
private static native void __call158_226(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_227(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_228(int a0) throws Throwable;
private static native void __call158_229(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_230(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_231(int a0) throws Throwable;
private static native void __call158_232(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __fieldRead158_233(moom.FE a0) throws Throwable;
private static native java.lang.Integer __call158_234(int a0) throws Throwable;
private static native void __call158_235(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String[] __call158_236() throws Throwable;
private static native void __call158_237(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call2015800_0(com.google.gson.JsonParseException a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public moom.FE a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException { return __sourceHandlerCall_4549cbd1ea44a1adb6e6(this, p0, p1, p2); }


public com.google.gson.JsonElement a(moom.FE p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) { return __sourceHandlerCall_fb14d22b1a95c397b50b(this, p0, p1, p2); }


public java.lang.Object deserialize__sourceBridge_592e56158a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((moom.FF)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}

public moom.FE deserialize(com.google.gson.JsonElement __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonDeserializationContext __bridgeParam2) throws com.google.gson.JsonParseException { return ((moom.FE)(this.deserialize__sourceBridge_592e56158a(((com.google.gson.JsonElement)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonDeserializationContext)(__bridgeParam2))))); }
public com.google.gson.JsonElement serialize__sourceBridge_aa40c1536e(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
return ((moom.FF)(this)).a(((moom.FE)(((moom.FE)(p0)))), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonSerializationContext)(p2)));
}

public com.google.gson.JsonElement serialize(moom.FE __bridgeParam0, java.lang.reflect.Type __bridgeParam1, com.google.gson.JsonSerializationContext __bridgeParam2) { return ((com.google.gson.JsonElement)(this.serialize__sourceBridge_aa40c1536e(((java.lang.Object)(__bridgeParam0)), ((java.lang.reflect.Type)(__bridgeParam1)), ((com.google.gson.JsonSerializationContext)(__bridgeParam2))))); }
}
