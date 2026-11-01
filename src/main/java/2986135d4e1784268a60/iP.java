package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iP {

private static long a;

private static long[] b;

private static java.lang.Integer[] c;

private static java.util.Map d;

private static long e;

public iP() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-7057651165799251091L)), ((long)(4616798202935906596L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99547292084818L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.iP.a ^ 54936984047033L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill877_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill877_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill877_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill877_14 = new byte[8];
    (__sourceSpill877_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill877_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation877_16 = __sourceSpill877_14;
    ((javax.crypto.Cipher)(__sourceSpill877_11)).init(((int)(__sourceSpill877_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill877_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation877_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[3];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "µ!\036ÁèçLÞ¸r©Ëø\003 ±nä12¦ç£î"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill877_25 = local11_life21;
        int __sourceSpill877_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill877_25)).substring(((int)(__sourceSpill877_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill877_30 = local13_life19;
        int __sourceSpill877_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill877_33 = new byte[8];
        (__sourceSpill877_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill877_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill877_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill877_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill877_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill877_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill877_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill877_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill877_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill877_34)).doFinal(((byte[])(__sourceSpill877_33)));
        (__sourceSpill877_30)[__sourceSpill877_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    b = ((long[])(local13_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[3]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill877_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill877_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill877_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill877_45 = new byte[8];
    (__sourceSpill877_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill877_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation877_47 = __sourceSpill877_45;
    ((javax.crypto.Cipher)(__sourceSpill877_42)).init(((int)(__sourceSpill877_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill877_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation877_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = 6800672008853577633L;
    byte[] __sourceSpill877_51 = new byte[8];
    (__sourceSpill877_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill877_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill877_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill877_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill877_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill877_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill877_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill877_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill877_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill877_52)).doFinal(((byte[])(__sourceSpill877_51)));
    e = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_ffa9fa9e5a036bacea8d(java.lang.String a0) throws E;
private static final class __SourceHandler_ffa9fa9e5a036bacea8d {

public static boolean f1067(java.lang.String p0) throws Throwable {
    java.lang.String forwardValue1067_11_0;
    int forwardValue1067_16_0;
    int forwardValue1067_18_0;
    java.lang.String spill1067_0;
    boolean spill1067_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life1_3 = (__fieldRead1067_0() ^ 8228712226355L);
    life3_5 = __call1067_1();
    spill1067_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue1067_11_0 = spill1067_0;
        break forward_join_11;
    }
    if (!((spill1067_0 != null))) {
        break forward_join_17;
    }
    forwardValue1067_11_0 = p0;
    }
    spill1067_1 = __call1067_2(forwardValue1067_11_0);
    if (!((life3_5 != null))) {
        forwardValue1067_16_0 = __integerCategory1067_3(spill1067_1);
        break forward_join_16;
    }
    if (!((!spill1067_1))) {
        break forward_join_17;
    }
    forwardValue1067_16_0 = 1;
    }
    forwardValue1067_18_0 = forwardValue1067_16_0;
    break forward_join_18;
    }
    forwardValue1067_18_0 = 0;
    }
    return __integerCategory1067_4(forwardValue1067_18_0);
}
public static void h1067_0(moom.Oo p0) throws Throwable {
    throw __call1106700_0(p0);
}
public static void h1067_1(moom.Oo p0) throws Throwable {
    throw __call1106701_0(p0);
}
private static native long __fieldRead1067_0() throws Throwable;
private static native java.lang.String[] __call1067_1() throws Throwable;
private static native boolean __call1067_2(java.lang.String a0) throws Throwable;
private static native int __integerCategory1067_3(boolean value) throws Throwable;
private static native boolean __integerCategory1067_4(int value) throws Throwable;
private static native java.lang.Exception __call1106700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1106701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0d1fdfbd650b4e572712(java.lang.String[] a0) throws E;
private static final class __SourceHandler_0d1fdfbd650b4e572712 {

public static void f444(java.lang.String[] p0) throws Throwable {
    java.lang.Object forestValue444_225_0;
    java.lang.String forestValue444_251_0;
    int forestValue444_284_0;
    joptsimple.OptionSet forestValue444_349_0;
    joptsimple.ArgumentAcceptingOptionSpec forestValue444_349_1;
    java.io.File forestValue444_357_0;
    joptsimple.OptionSet forestValue444_366_0;
    joptsimple.ArgumentAcceptingOptionSpec forestValue444_366_1;
    java.io.File forestValue444_374_0;
    java.lang.Object forestValue444_389_0;
    java.lang.String forestValue444_390_0;
    java.lang.Object forestValue444_400_0;
    java.lang.String forestValue444_403_0;
    java.lang.String[] spill444_0;
    java.util.List spill444_1;
    java.lang.String spill444_2;
    boolean spill444_3;
    boolean spill444_4;
    boolean spill444_5;
    joptsimple.OptionSet spill444_6;
    joptsimple.ArgumentAcceptingOptionSpec spill444_7;
    joptsimple.OptionSet spill444_8;
    joptsimple.ArgumentAcceptingOptionSpec spill444_9;
    joptsimple.OptionSet spill444_10;
    joptsimple.OptionSet spill444_11;
    long life1_9;
    joptsimple.OptionParser life4_17;
    joptsimple.ArgumentAcceptingOptionSpec life5_37;
    joptsimple.ArgumentAcceptingOptionSpec life6_53;
    joptsimple.ArgumentAcceptingOptionSpec life7_67;
    joptsimple.ArgumentAcceptingOptionSpec life8_74;
    joptsimple.ArgumentAcceptingOptionSpec life9_81;
    java.lang.String[] life3_82;
    joptsimple.ArgumentAcceptingOptionSpec life10_87;
    joptsimple.ArgumentAcceptingOptionSpec life11_98;
    joptsimple.ArgumentAcceptingOptionSpec life12_103;
    joptsimple.ArgumentAcceptingOptionSpec life13_108;
    joptsimple.ArgumentAcceptingOptionSpec life14_120;
    joptsimple.ArgumentAcceptingOptionSpec life15_125;
    joptsimple.ArgumentAcceptingOptionSpec life16_131;
    joptsimple.ArgumentAcceptingOptionSpec life17_137;
    joptsimple.ArgumentAcceptingOptionSpec life18_153;
    joptsimple.ArgumentAcceptingOptionSpec life19_169;
    joptsimple.ArgumentAcceptingOptionSpec life20_178;
    joptsimple.ArgumentAcceptingOptionSpec life21_187;
    joptsimple.ArgumentAcceptingOptionSpec life22_192;
    joptsimple.ArgumentAcceptingOptionSpec life23_201;
    joptsimple.NonOptionArgumentSpec life24_204;
    joptsimple.OptionSet life25_208;
    java.util.List life26_212;
    java.lang.String life27_228;
    java.net.Proxy life28_230;
    java.lang.String life29_255;
    java.lang.String life30_260;
    int life31_294;
    int life32_300;
    int life33_304;
    int life34_308;
    int life35_312;
    java.lang.String life36_317;
    com.google.gson.Gson life37_327;
    com.mojang.authlib.properties.PropertyMap life38_336;
    com.mojang.authlib.properties.PropertyMap life39_345;
    java.io.File life40_350;
    java.io.File life41_369;
    java.io.File life42_388;
    java.lang.String life43_405;
    java.lang.String life44_420;
    java.lang.String life45_425;
    java.lang.Integer life46_430;
    net.minecraft.util.Session life47_447;
    moom.iJ life48_483;
    forest_join_486: {
    forest_join_403: {
    forest_join_402: {
    forest_join_400: {
    forest_join_390: {
    forest_join_389: {
    forest_join_386: {
    forest_join_374: {
    forest_join_369: {
    forest_join_366: {
    forest_join_357: {
    forest_join_352: {
    forest_join_349: {
    forest_join_284: {
    forest_join_279: {
    forest_join_251: {
    forest_join_247: {
    forest_join_225: {
    forest_join_222: {
    life1_9 = (__call444_3(__call444_2(-415475528873036055L, -6002471977101758384L, __call444_1(__call444_0())), 196594236328347L) ^ 130147591965009L);
    __call444_4("java.net.preferIPv4Stack", "true");
    life4_17 = new joptsimple.OptionParser();
    __call444_5(life4_17);
    spill444_0 = __call444_6();
    __call444_7(life4_17, "demo");
    __call444_8(life4_17, "fullscreen");
    __call444_9(life4_17, "checkGlErrors");
    life5_37 = __call444_11(__call444_10(life4_17, "server"));
    life6_53 = __call444_18(__call444_15(__call444_13(__call444_12(life4_17, "port")), __classLiteral444_14()), __call444_17(__invokedynamic444_16(12270, (800919717872978058L ^ life1_9))), new java.lang.Integer[0]);
    life7_67 = __call444_23(__call444_22(__call444_20(__call444_19(life4_17, "gameDir")), __classLiteral444_21()), new java.io.File("."), new java.io.File[0]);
    life8_74 = __call444_27(__call444_25(__call444_24(life4_17, "assetsDir")), __classLiteral444_26());
    life9_81 = __call444_31(__call444_29(__call444_28(life4_17, "resourcePackDir")), __classLiteral444_30());
    life3_82 = spill444_0;
    life10_87 = __call444_33(__call444_32(life4_17, "proxyHost"));
    life11_98 = __call444_38(__call444_36(__call444_35(__call444_34(life4_17, "proxyPort")), "8080", new java.lang.String[0]), __classLiteral444_37());
    life12_103 = __call444_40(__call444_39(life4_17, "proxyUser"));
    life13_108 = __call444_42(__call444_41(life4_17, "proxyPass"));
    life14_120 = __call444_48(__call444_44(__call444_43(life4_17, "username")), __invokedynamic444_47((__call444_45() % __fieldRead444_46())), new java.lang.String[0]);
    life15_125 = __call444_50(__call444_49(life4_17, "uuid"));
    life16_131 = __call444_53(__call444_52(__call444_51(life4_17, "accessToken")));
    life17_137 = __call444_56(__call444_55(__call444_54(life4_17, "version")));
    life18_153 = __call444_63(__call444_60(__call444_58(__call444_57(life4_17, "width")), __classLiteral444_59()), __call444_62(__invokedynamic444_61(3455, (8936317040362416665L ^ life1_9))), new java.lang.Integer[0]);
    life19_169 = __call444_70(__call444_67(__call444_65(__call444_64(life4_17, "height")), __classLiteral444_66()), __call444_69(__invokedynamic444_68(20776, (5259783975138833999L ^ life1_9))), new java.lang.Integer[0]);
    life20_178 = __call444_73(__call444_72(__call444_71(life4_17, "userProperties")), "{}", new java.lang.String[0]);
    life21_187 = __call444_76(__call444_75(__call444_74(life4_17, "profileProperties")), "{}", new java.lang.String[0]);
    life22_192 = __call444_78(__call444_77(life4_17, "assetIndex"));
    life23_201 = __call444_81(__call444_80(__call444_79(life4_17, "userType")), "legacy", new java.lang.String[0]);
    life24_204 = __call444_82(life4_17);
    life25_208 = __call444_83(life4_17, p0);
    life26_212 = __call444_84(life25_208, life24_204);
    spill444_1 = life26_212;
    if (!((life3_82 != null))) {
        forestValue444_225_0 = spill444_1;
        break forest_join_225;
    }
    if (!((!__call444_85(spill444_1)))) {
        break forest_join_222;
    }
    __call444_88(__fieldRead444_86(), __invokedynamic444_87(life26_212));
    }
    forestValue444_225_0 = __call444_89(life25_208, life10_87);
    }
    life27_228 = __cast444_90(forestValue444_225_0);
    life28_230 = __fieldRead444_91();
    spill444_2 = life27_228;
    if (!((life3_82 != null))) {
        forestValue444_251_0 = spill444_2;
        break forest_join_251;
    }
    if (!((spill444_2 != null))) {
        break forest_join_247;
    }
    life28_230 = new java.net.Proxy(__fieldRead444_92(), new java.net.InetSocketAddress(life27_228, __call444_95(__cast444_94(__call444_93(life25_208, life11_98)))));
    }
    forestValue444_251_0 = __cast444_97(__call444_96(life25_208, life12_103));
    }
    life29_255 = forestValue444_251_0;
    life30_260 = __cast444_99(__call444_98(life25_208, life13_108));
    spill444_3 = __call444_101(life28_230, __fieldRead444_100());
    if (!((life3_82 != null))) {
        forestValue444_284_0 = __integerCategory444_102(spill444_3);
        break forest_join_284;
    }
    if (!((!spill444_3))) {
        break forest_join_279;
    }
    spill444_4 = __call444_103(life29_255);
    if (!((life3_82 != null))) {
        forestValue444_284_0 = __integerCategory444_104(spill444_4);
        break forest_join_284;
    }
    if (!(spill444_4)) {
        break forest_join_279;
    }
    spill444_5 = __call444_105(life30_260);
    if (!((life3_82 != null))) {
        forestValue444_284_0 = __integerCategory444_106(spill444_5);
        break forest_join_284;
    }
    if (!(spill444_5)) {
        break forest_join_279;
    }
    __call444_107(new moom.OB(life29_255, life30_260));
    }
    forestValue444_284_0 = __call444_110(__cast444_109(__call444_108(life25_208, life18_153)));
    }
    life31_294 = forestValue444_284_0;
    life32_300 = __call444_113(__cast444_112(__call444_111(life25_208, life19_169)));
    life33_304 = __integerCategory444_115(__call444_114(life25_208, "fullscreen"));
    life34_308 = __integerCategory444_117(__call444_116(life25_208, "checkGlErrors"));
    life35_312 = __integerCategory444_119(__call444_118(life25_208, "demo"));
    life36_317 = __cast444_121(__call444_120(life25_208, life17_137));
    life37_327 = __call444_124(__call444_123(new com.google.gson.GsonBuilder(), __classLiteral444_122(), new com.mojang.authlib.properties.PropertyMap.Serializer()));
    life38_336 = __cast444_129(__call444_128(life37_327, __cast444_126(__call444_125(life25_208, life20_178)), __classLiteral444_127()));
    life39_345 = __cast444_134(__call444_133(life37_327, __cast444_131(__call444_130(life25_208, life21_187)), __classLiteral444_132()));
    life40_350 = __cast444_136(__call444_135(life25_208, life7_67));
    spill444_6 = life25_208;
    spill444_7 = life8_74;
    if (!((life3_82 != null))) {
        forestValue444_349_0 = spill444_6;
        forestValue444_349_1 = spill444_7;
        break forest_join_349;
    }
    if (!(__call444_137(spill444_6, spill444_7))) {
        break forest_join_352;
    }
    forestValue444_349_0 = life25_208;
    forestValue444_349_1 = life8_74;
    }
    forestValue444_357_0 = __cast444_139(__call444_138(forestValue444_349_0, forestValue444_349_1));
    break forest_join_357;
    }
    forestValue444_357_0 = new java.io.File(life40_350, "assets/");
    }
    life41_369 = forestValue444_357_0;
    spill444_8 = life25_208;
    spill444_9 = life9_81;
    if (!((life3_82 != null))) {
        forestValue444_366_0 = spill444_8;
        forestValue444_366_1 = spill444_9;
        break forest_join_366;
    }
    if (!(__call444_140(spill444_8, spill444_9))) {
        break forest_join_369;
    }
    forestValue444_366_0 = life25_208;
    forestValue444_366_1 = life9_81;
    }
    forestValue444_374_0 = __cast444_142(__call444_141(forestValue444_366_0, forestValue444_366_1));
    break forest_join_374;
    }
    forestValue444_374_0 = new java.io.File(life40_350, "resourcepacks/");
    }
    life42_388 = forestValue444_374_0;
    spill444_10 = life25_208;
    if (!((life3_82 != null))) {
        forestValue444_389_0 = spill444_10;
        break forest_join_389;
    }
    if (!(__call444_143(spill444_10, life15_125))) {
        break forest_join_386;
    }
    forestValue444_390_0 = __cast444_145(__call444_144(life15_125, life25_208));
    break forest_join_390;
    }
    forestValue444_389_0 = __call444_146(life14_120, life25_208);
    }
    forestValue444_390_0 = __cast444_147(forestValue444_389_0);
    }
    life43_405 = forestValue444_390_0;
    spill444_11 = life25_208;
    if (!((life3_82 != null))) {
        forestValue444_400_0 = spill444_11;
        break forest_join_400;
    }
    if (!(__call444_148(spill444_11, life22_192))) {
        break forest_join_402;
    }
    forestValue444_400_0 = __call444_149(life22_192, life25_208);
    }
    forestValue444_403_0 = __cast444_150(forestValue444_400_0);
    break forest_join_403;
    }
    forestValue444_403_0 = null;
    }
    life44_420 = forestValue444_403_0;
    life45_425 = __cast444_152(__call444_151(life25_208, life5_37));
    life46_430 = __cast444_154(__call444_153(life25_208, life6_53));
    life47_447 = new net.minecraft.util.Session(__cast444_156(__call444_155(life14_120, life25_208)), life43_405, __cast444_158(__call444_157(life16_131, life25_208)), __cast444_160(__call444_159(life23_201, life25_208)));
    life48_483 = new moom.iJ(new net.minecraft.client.main.GameConfiguration$UserInformation(life47_447, life38_336, life39_345, life28_230), new net.minecraft.client.main.GameConfiguration$DisplayInformation(life31_294, life32_300, __integerCategory444_161(life33_304), __integerCategory444_162(life34_308)), new net.minecraft.client.main.GameConfiguration$FolderInformation(life40_350, life42_388, life41_369, life44_420), new net.minecraft.client.main.GameConfiguration$GameInformation(__integerCategory444_163(life35_312), life36_317), new net.minecraft.client.main.GameConfiguration$ServerInformation(life45_425, __call444_164(life46_430)));
    __call444_166(__call444_165(), new moom.Oq("Client Shutdown Thread"));
    __call444_168(__call444_167(), "Client thread");
    __call444_169(new com.moon.pb(life48_483));
    if (!((life3_82 == null))) {
        break forest_join_486;
    }
    __call444_170(new java.lang.String[5]);
    }
    return;
}
public static void h444_0(java.lang.Exception p0) throws Throwable {
    throw __call3044400_0(p0);
}
public static void h444_1(java.lang.Exception p0) throws Throwable {
    throw __call3044401_0(p0);
}
public static void h444_2(java.lang.Exception p0) throws Throwable {
    throw __call3044402_0(p0);
}
public static void h444_3(java.lang.Exception p0, java.lang.String[] p1, joptsimple.ArgumentAcceptingOptionSpec p2, joptsimple.ArgumentAcceptingOptionSpec p3, joptsimple.ArgumentAcceptingOptionSpec p4, joptsimple.ArgumentAcceptingOptionSpec p5, joptsimple.ArgumentAcceptingOptionSpec p6, joptsimple.ArgumentAcceptingOptionSpec p7, joptsimple.ArgumentAcceptingOptionSpec p8, joptsimple.ArgumentAcceptingOptionSpec p9, joptsimple.ArgumentAcceptingOptionSpec p10, joptsimple.ArgumentAcceptingOptionSpec p11, joptsimple.ArgumentAcceptingOptionSpec p12, joptsimple.ArgumentAcceptingOptionSpec p13, joptsimple.ArgumentAcceptingOptionSpec p14, joptsimple.ArgumentAcceptingOptionSpec p15, joptsimple.ArgumentAcceptingOptionSpec p16, joptsimple.ArgumentAcceptingOptionSpec p17, joptsimple.ArgumentAcceptingOptionSpec p18, joptsimple.OptionSet p19, java.net.Proxy p20, java.lang.String p21, java.lang.String p22, int p23, int p24, int p25, int p26, int p27, java.lang.String p28, com.google.gson.Gson p29, com.mojang.authlib.properties.PropertyMap p30, com.mojang.authlib.properties.PropertyMap p31, java.io.File p32, java.io.File p33, java.io.File p34, java.lang.String p35, java.lang.String p36, java.lang.String p37, java.lang.Integer p38, net.minecraft.util.Session p39, moom.iJ p40) throws Throwable {
    int forestValue3044403_39_0;
    joptsimple.OptionSet forestValue3044403_104_0;
    joptsimple.ArgumentAcceptingOptionSpec forestValue3044403_104_1;
    java.io.File forestValue3044403_112_0;
    joptsimple.OptionSet forestValue3044403_121_0;
    joptsimple.ArgumentAcceptingOptionSpec forestValue3044403_121_1;
    java.io.File forestValue3044403_129_0;
    java.lang.Object forestValue3044403_144_0;
    java.lang.String forestValue3044403_145_0;
    java.lang.Object forestValue3044403_155_0;
    java.lang.String forestValue3044403_158_0;
    boolean spill3044403_0;
    boolean spill3044403_1;
    boolean spill3044403_2;
    joptsimple.OptionSet spill3044403_3;
    joptsimple.ArgumentAcceptingOptionSpec spill3044403_4;
    joptsimple.OptionSet spill3044403_5;
    joptsimple.ArgumentAcceptingOptionSpec spill3044403_6;
    joptsimple.OptionSet spill3044403_7;
    joptsimple.OptionSet spill3044403_8;
    java.lang.Exception life21_2;
    java.lang.String life21_7;
    java.lang.String life22_12;
    int life23_46;
    int life24_52;
    int life25_56;
    int life26_60;
    int life27_64;
    java.lang.String life28_69;
    com.google.gson.Gson life29_79;
    com.mojang.authlib.properties.PropertyMap life30_88;
    com.mojang.authlib.properties.PropertyMap life31_97;
    java.io.File life32_102;
    java.io.File life33_121;
    java.io.File life34_140;
    java.lang.String life35_157;
    java.lang.String life36_172;
    java.lang.String life37_177;
    java.lang.Integer life38_182;
    net.minecraft.util.Session life39_199;
    moom.iJ life40_235;
    forest_join_241: {
    forest_join_158: {
    forest_join_157: {
    forest_join_155: {
    forest_join_145: {
    forest_join_144: {
    forest_join_141: {
    forest_join_129: {
    forest_join_124: {
    forest_join_121: {
    forest_join_112: {
    forest_join_107: {
    forest_join_104: {
    forest_join_39: {
    forest_join_34: {
    life21_2 = p0;
    life21_7 = __cast3044403_1(__call3044403_0(p19, p7));
    life22_12 = __cast3044403_3(__call3044403_2(p19, p8));
    spill3044403_0 = __call3044403_5(p20, __fieldRead3044403_4());
    if (!((p1 != null))) {
        forestValue3044403_39_0 = __integerCategory3044403_6(spill3044403_0);
        break forest_join_39;
    }
    if (!((!spill3044403_0))) {
        break forest_join_34;
    }
    spill3044403_1 = __call3044403_7(life21_7);
    if (!((p1 != null))) {
        forestValue3044403_39_0 = __integerCategory3044403_8(spill3044403_1);
        break forest_join_39;
    }
    if (!(spill3044403_1)) {
        break forest_join_34;
    }
    spill3044403_2 = __call3044403_9(life22_12);
    if (!((p1 != null))) {
        forestValue3044403_39_0 = __integerCategory3044403_10(spill3044403_2);
        break forest_join_39;
    }
    if (!(spill3044403_2)) {
        break forest_join_34;
    }
    __call3044403_11(new moom.OB(life21_7, life22_12));
    }
    forestValue3044403_39_0 = __call3044403_14(__cast3044403_13(__call3044403_12(p19, p13)));
    }
    life23_46 = forestValue3044403_39_0;
    life24_52 = __call3044403_17(__cast3044403_16(__call3044403_15(p19, p14)));
    life25_56 = __integerCategory3044403_19(__call3044403_18(p19, "fullscreen"));
    life26_60 = __integerCategory3044403_21(__call3044403_20(p19, "checkGlErrors"));
    life27_64 = __integerCategory3044403_23(__call3044403_22(p19, "demo"));
    life28_69 = __cast3044403_25(__call3044403_24(p19, p12));
    life29_79 = __call3044403_28(__call3044403_27(new com.google.gson.GsonBuilder(), __classLiteral3044403_26(), new com.mojang.authlib.properties.PropertyMap.Serializer()));
    life30_88 = __cast3044403_33(__call3044403_32(life29_79, __cast3044403_30(__call3044403_29(p19, p15)), __classLiteral3044403_31()));
    life31_97 = __cast3044403_38(__call3044403_37(life29_79, __cast3044403_35(__call3044403_34(p19, p16)), __classLiteral3044403_36()));
    life32_102 = __cast3044403_40(__call3044403_39(p19, p4));
    spill3044403_3 = p19;
    spill3044403_4 = p5;
    if (!((p1 != null))) {
        forestValue3044403_104_0 = spill3044403_3;
        forestValue3044403_104_1 = spill3044403_4;
        break forest_join_104;
    }
    if (!(__call3044403_41(spill3044403_3, spill3044403_4))) {
        break forest_join_107;
    }
    forestValue3044403_104_0 = p19;
    forestValue3044403_104_1 = p5;
    }
    forestValue3044403_112_0 = __cast3044403_43(__call3044403_42(forestValue3044403_104_0, forestValue3044403_104_1));
    break forest_join_112;
    }
    forestValue3044403_112_0 = new java.io.File(life32_102, "assets/");
    }
    life33_121 = forestValue3044403_112_0;
    spill3044403_5 = p19;
    spill3044403_6 = p6;
    if (!((p1 != null))) {
        forestValue3044403_121_0 = spill3044403_5;
        forestValue3044403_121_1 = spill3044403_6;
        break forest_join_121;
    }
    if (!(__call3044403_44(spill3044403_5, spill3044403_6))) {
        break forest_join_124;
    }
    forestValue3044403_121_0 = p19;
    forestValue3044403_121_1 = p6;
    }
    forestValue3044403_129_0 = __cast3044403_46(__call3044403_45(forestValue3044403_121_0, forestValue3044403_121_1));
    break forest_join_129;
    }
    forestValue3044403_129_0 = new java.io.File(life32_102, "resourcepacks/");
    }
    life34_140 = forestValue3044403_129_0;
    spill3044403_7 = p19;
    if (!((p1 != null))) {
        forestValue3044403_144_0 = spill3044403_7;
        break forest_join_144;
    }
    if (!(__call3044403_47(spill3044403_7, p10))) {
        break forest_join_141;
    }
    forestValue3044403_145_0 = __cast3044403_49(__call3044403_48(p10, p19));
    break forest_join_145;
    }
    forestValue3044403_144_0 = __call3044403_50(p9, p19);
    }
    forestValue3044403_145_0 = __cast3044403_51(forestValue3044403_144_0);
    }
    life35_157 = forestValue3044403_145_0;
    spill3044403_8 = p19;
    if (!((p1 != null))) {
        forestValue3044403_155_0 = spill3044403_8;
        break forest_join_155;
    }
    if (!(__call3044403_52(spill3044403_8, p17))) {
        break forest_join_157;
    }
    forestValue3044403_155_0 = __call3044403_53(p17, p19);
    }
    forestValue3044403_158_0 = __cast3044403_54(forestValue3044403_155_0);
    break forest_join_158;
    }
    forestValue3044403_158_0 = null;
    }
    life36_172 = forestValue3044403_158_0;
    life37_177 = __cast3044403_56(__call3044403_55(p19, p2));
    life38_182 = __cast3044403_58(__call3044403_57(p19, p3));
    life39_199 = new net.minecraft.util.Session(__cast3044403_60(__call3044403_59(p9, p19)), life35_157, __cast3044403_62(__call3044403_61(p11, p19)), __cast3044403_64(__call3044403_63(p18, p19)));
    life40_235 = new moom.iJ(new net.minecraft.client.main.GameConfiguration$UserInformation(life39_199, life30_88, life31_97, p20), new net.minecraft.client.main.GameConfiguration$DisplayInformation(life23_46, life24_52, __integerCategory3044403_65(life25_56), __integerCategory3044403_66(life26_60)), new net.minecraft.client.main.GameConfiguration$FolderInformation(life32_102, life34_140, life33_121, life36_172), new net.minecraft.client.main.GameConfiguration$GameInformation(__integerCategory3044403_67(life27_64), life28_69), new net.minecraft.client.main.GameConfiguration$ServerInformation(life37_177, __call3044403_68(life38_182)));
    __call3044403_70(__call3044403_69(), new moom.Oq("Client Shutdown Thread"));
    __call3044403_72(__call3044403_71(), "Client thread");
    __call3044403_73(new com.moon.pb(life40_235));
    if (!((p1 == null))) {
        break forest_join_241;
    }
    __call3044403_74(new java.lang.String[5]);
    }
    return;
}
public static void h444_4(java.lang.Exception p0) throws Throwable {
    throw __call3044404_0(p0);
}
public static void h444_5(java.lang.Exception p0) throws Throwable {
    throw __call3044405_0(p0);
}
public static void h444_6(java.lang.Exception p0) throws Throwable {
    throw __call3044406_0(p0);
}
public static void h444_7(java.lang.Exception p0) throws Throwable {
    throw __call3044407_0(p0);
}
public static void h444_8(java.lang.Exception p0) throws Throwable {
    throw __call3044408_0(p0);
}
public static void h444_9(java.lang.Exception p0) throws Throwable {
    throw __call3044409_0(p0);
}
public static void h444_10(java.lang.Exception p0) throws Throwable {
    throw __call3044410_0(p0);
}
public static void h444_11(java.lang.Exception p0) throws Throwable {
    throw __call3044411_0(p0);
}
public static void h444_12(java.lang.Exception p0) throws Throwable {
    throw __call3044412_0(p0);
}
public static void h444_13(java.lang.Exception p0) throws Throwable {
    throw __call3044413_0(p0);
}
public static void h444_14(java.lang.Exception p0) throws Throwable {
    throw __call3044414_0(p0);
}
public static void h444_15(java.lang.Exception p0) throws Throwable {
    throw __call3044415_0(p0);
}
public static void h444_16(java.lang.Exception p0) throws Throwable {
    throw __call3044416_0(p0);
}
public static void h444_17(java.lang.Exception p0) throws Throwable {
    throw __call3044417_0(p0);
}
public static void h444_18(java.lang.Exception p0) throws Throwable {
    throw __call3044418_0(p0);
}
private static native java.lang.invoke.MethodHandles.Lookup __call444_0() throws Throwable;
private static native java.lang.Class __call444_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call444_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call444_3(moom._a a0, long a1) throws Throwable;
private static native java.lang.String __call444_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call444_5(joptsimple.OptionParser a0) throws Throwable;
private static native java.lang.String[] __call444_6() throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_7(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_8(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_9(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_10(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_11(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_12(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_13(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native java.lang.Class __classLiteral444_14() throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_15(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Class a1) throws Throwable;
private static native int __invokedynamic444_16(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call444_17(int a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_18(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Integer a1, java.lang.Integer[] a2) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_19(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_20(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native java.lang.Class __classLiteral444_21() throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_22(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Class a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_23(joptsimple.ArgumentAcceptingOptionSpec a0, java.io.File a1, java.io.File[] a2) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_24(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_25(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native java.lang.Class __classLiteral444_26() throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_27(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Class a1) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_28(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_29(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native java.lang.Class __classLiteral444_30() throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_31(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Class a1) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_32(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_33(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_34(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_35(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_36(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.String a1, java.lang.String[] a2) throws Throwable;
private static native java.lang.Class __classLiteral444_37() throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_38(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Class a1) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_39(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_40(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_41(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_42(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_43(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_44(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native long __call444_45() throws Throwable;
private static native long __fieldRead444_46() throws Throwable;
private static native java.lang.String __invokedynamic444_47(long a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_48(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.String a1, java.lang.String[] a2) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_49(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_50(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_51(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_52(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_53(joptsimple.ArgumentAcceptingOptionSpec a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_54(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_55(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_56(joptsimple.ArgumentAcceptingOptionSpec a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_57(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_58(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native java.lang.Class __classLiteral444_59() throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_60(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Class a1) throws Throwable;
private static native int __invokedynamic444_61(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call444_62(int a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_63(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Integer a1, java.lang.Integer[] a2) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_64(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_65(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native java.lang.Class __classLiteral444_66() throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_67(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Class a1) throws Throwable;
private static native int __invokedynamic444_68(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call444_69(int a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_70(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.Integer a1, java.lang.Integer[] a2) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_71(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_72(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_73(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.String a1, java.lang.String[] a2) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_74(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_75(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_76(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.String a1, java.lang.String[] a2) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_77(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_78(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.OptionSpecBuilder __call444_79(joptsimple.OptionParser a0, java.lang.String a1) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_80(joptsimple.OptionSpecBuilder a0) throws Throwable;
private static native joptsimple.ArgumentAcceptingOptionSpec __call444_81(joptsimple.ArgumentAcceptingOptionSpec a0, java.lang.String a1, java.lang.String[] a2) throws Throwable;
private static native joptsimple.NonOptionArgumentSpec __call444_82(joptsimple.OptionParser a0) throws Throwable;
private static native joptsimple.OptionSet __call444_83(joptsimple.OptionParser a0, java.lang.String[] a1) throws Throwable;
private static native java.util.List __call444_84(joptsimple.OptionSet a0, joptsimple.NonOptionArgumentSpec a1) throws Throwable;
private static native boolean __call444_85(java.util.List a0) throws Throwable;
private static native java.io.PrintStream __fieldRead444_86() throws Throwable;
private static native java.lang.String __invokedynamic444_87(java.util.List a0) throws Throwable;
private static native void __call444_88(java.io.PrintStream a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call444_89(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast444_90(java.lang.Object a0) throws Throwable;
private static native java.net.Proxy __fieldRead444_91() throws Throwable;
private static native java.net.Proxy.Type __fieldRead444_92() throws Throwable;
private static native java.lang.Object __call444_93(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Integer __cast444_94(java.lang.Object a0) throws Throwable;
private static native int __call444_95(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __call444_96(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast444_97(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_98(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast444_99(java.lang.Object a0) throws Throwable;
private static native java.net.Proxy __fieldRead444_100() throws Throwable;
private static native boolean __call444_101(java.net.Proxy a0, java.net.Proxy a1) throws Throwable;
private static native int __integerCategory444_102(boolean value) throws Throwable;
private static native boolean __call444_103(java.lang.String a0) throws Throwable;
private static native int __integerCategory444_104(boolean value) throws Throwable;
private static native boolean __call444_105(java.lang.String a0) throws Throwable;
private static native int __integerCategory444_106(boolean value) throws Throwable;
private static native void __call444_107(moom.OB a0) throws Throwable;
private static native java.lang.Object __call444_108(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Integer __cast444_109(java.lang.Object a0) throws Throwable;
private static native int __call444_110(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __call444_111(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Integer __cast444_112(java.lang.Object a0) throws Throwable;
private static native int __call444_113(java.lang.Integer a0) throws Throwable;
private static native boolean __call444_114(joptsimple.OptionSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory444_115(boolean value) throws Throwable;
private static native boolean __call444_116(joptsimple.OptionSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory444_117(boolean value) throws Throwable;
private static native boolean __call444_118(joptsimple.OptionSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory444_119(boolean value) throws Throwable;
private static native java.lang.Object __call444_120(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast444_121(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral444_122() throws Throwable;
private static native com.google.gson.GsonBuilder __call444_123(com.google.gson.GsonBuilder a0, java.lang.Class a1, com.mojang.authlib.properties.PropertyMap.Serializer a2) throws Throwable;
private static native com.google.gson.Gson __call444_124(com.google.gson.GsonBuilder a0) throws Throwable;
private static native java.lang.Object __call444_125(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast444_126(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral444_127() throws Throwable;
private static native java.lang.Object __call444_128(com.google.gson.Gson a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __cast444_129(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_130(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast444_131(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral444_132() throws Throwable;
private static native java.lang.Object __call444_133(com.google.gson.Gson a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __cast444_134(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_135(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.io.File __cast444_136(java.lang.Object a0) throws Throwable;
private static native boolean __call444_137(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call444_138(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.io.File __cast444_139(java.lang.Object a0) throws Throwable;
private static native boolean __call444_140(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call444_141(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.io.File __cast444_142(java.lang.Object a0) throws Throwable;
private static native boolean __call444_143(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call444_144(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast444_145(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_146(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast444_147(java.lang.Object a0) throws Throwable;
private static native boolean __call444_148(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call444_149(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast444_150(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_151(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast444_152(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_153(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Integer __cast444_154(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_155(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast444_156(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_157(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast444_158(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call444_159(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast444_160(java.lang.Object a0) throws Throwable;
private static native boolean __integerCategory444_161(int value) throws Throwable;
private static native boolean __integerCategory444_162(int value) throws Throwable;
private static native boolean __integerCategory444_163(int value) throws Throwable;
private static native int __call444_164(java.lang.Integer a0) throws Throwable;
private static native java.lang.Runtime __call444_165() throws Throwable;
private static native void __call444_166(java.lang.Runtime a0, moom.Oq a1) throws Throwable;
private static native java.lang.Thread __call444_167() throws Throwable;
private static native void __call444_168(java.lang.Thread a0, java.lang.String a1) throws Throwable;
private static native void __call444_169(com.moon.pb a0) throws Throwable;
private static native void __call444_170(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3044400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044401_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044402_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Object __call3044403_0(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast3044403_1(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_2(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast3044403_3(java.lang.Object a0) throws Throwable;
private static native java.net.Proxy __fieldRead3044403_4() throws Throwable;
private static native boolean __call3044403_5(java.net.Proxy a0, java.net.Proxy a1) throws Throwable;
private static native int __integerCategory3044403_6(boolean value) throws Throwable;
private static native boolean __call3044403_7(java.lang.String a0) throws Throwable;
private static native int __integerCategory3044403_8(boolean value) throws Throwable;
private static native boolean __call3044403_9(java.lang.String a0) throws Throwable;
private static native int __integerCategory3044403_10(boolean value) throws Throwable;
private static native void __call3044403_11(moom.OB a0) throws Throwable;
private static native java.lang.Object __call3044403_12(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Integer __cast3044403_13(java.lang.Object a0) throws Throwable;
private static native int __call3044403_14(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __call3044403_15(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Integer __cast3044403_16(java.lang.Object a0) throws Throwable;
private static native int __call3044403_17(java.lang.Integer a0) throws Throwable;
private static native boolean __call3044403_18(joptsimple.OptionSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3044403_19(boolean value) throws Throwable;
private static native boolean __call3044403_20(joptsimple.OptionSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3044403_21(boolean value) throws Throwable;
private static native boolean __call3044403_22(joptsimple.OptionSet a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3044403_23(boolean value) throws Throwable;
private static native java.lang.Object __call3044403_24(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast3044403_25(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral3044403_26() throws Throwable;
private static native com.google.gson.GsonBuilder __call3044403_27(com.google.gson.GsonBuilder a0, java.lang.Class a1, com.mojang.authlib.properties.PropertyMap.Serializer a2) throws Throwable;
private static native com.google.gson.Gson __call3044403_28(com.google.gson.GsonBuilder a0) throws Throwable;
private static native java.lang.Object __call3044403_29(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast3044403_30(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral3044403_31() throws Throwable;
private static native java.lang.Object __call3044403_32(com.google.gson.Gson a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __cast3044403_33(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_34(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast3044403_35(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __classLiteral3044403_36() throws Throwable;
private static native java.lang.Object __call3044403_37(com.google.gson.Gson a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native com.mojang.authlib.properties.PropertyMap __cast3044403_38(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_39(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.io.File __cast3044403_40(java.lang.Object a0) throws Throwable;
private static native boolean __call3044403_41(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call3044403_42(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.io.File __cast3044403_43(java.lang.Object a0) throws Throwable;
private static native boolean __call3044403_44(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call3044403_45(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.io.File __cast3044403_46(java.lang.Object a0) throws Throwable;
private static native boolean __call3044403_47(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call3044403_48(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast3044403_49(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_50(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast3044403_51(java.lang.Object a0) throws Throwable;
private static native boolean __call3044403_52(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Object __call3044403_53(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast3044403_54(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_55(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.String __cast3044403_56(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_57(joptsimple.OptionSet a0, joptsimple.ArgumentAcceptingOptionSpec a1) throws Throwable;
private static native java.lang.Integer __cast3044403_58(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_59(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast3044403_60(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_61(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast3044403_62(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3044403_63(joptsimple.ArgumentAcceptingOptionSpec a0, joptsimple.OptionSet a1) throws Throwable;
private static native java.lang.String __cast3044403_64(java.lang.Object a0) throws Throwable;
private static native boolean __integerCategory3044403_65(int value) throws Throwable;
private static native boolean __integerCategory3044403_66(int value) throws Throwable;
private static native boolean __integerCategory3044403_67(int value) throws Throwable;
private static native int __call3044403_68(java.lang.Integer a0) throws Throwable;
private static native java.lang.Runtime __call3044403_69() throws Throwable;
private static native void __call3044403_70(java.lang.Runtime a0, moom.Oq a1) throws Throwable;
private static native java.lang.Thread __call3044403_71() throws Throwable;
private static native void __call3044403_72(java.lang.Thread a0, java.lang.String a1) throws Throwable;
private static native void __call3044403_73(com.moon.pb a0) throws Throwable;
private static native void __call3044403_74(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3044404_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044405_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044406_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044407_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044408_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044409_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044410_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044411_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044412_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044413_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044414_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044415_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044416_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044417_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3044418_0(java.lang.Exception a0) throws Throwable;

}


public static void main(java.lang.String[] p0) { __sourceHandlerCall_0d1fdfbd650b4e572712(p0); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18511;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/iP", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iP.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8013_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static boolean a(java.lang.String p0) { return __sourceHandlerCall_ffa9fa9e5a036bacea8d(p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8013_0() throws E;
}
