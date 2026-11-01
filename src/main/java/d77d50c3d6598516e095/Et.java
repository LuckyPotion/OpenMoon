package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Et {

private final net.minecraft.world.WorldServer a;

private final java.util.Random b;

private final moom.Do<moom.DV> c;

private final java.util.List<java.lang.Long> d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

private static final long[] i;

private static final java.lang.Long[] j;

private static final java.util.Map k;

public Et(net.minecraft.world.WorldServer p0) {
super();
    this.c = new moom.Do();
    this.d = com.google.common.collect.Lists.newArrayList();
    this.a = p0;
    this.b = new java.util.Random((p0).a__Long());
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-3007639108556537835L)), ((long)(6842612816433425456L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(207875825276222L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Et.e ^ 36216492058972L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill526_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill526_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill526_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill526_14 = new byte[8];
    (__sourceSpill526_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill526_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation526_16 = __sourceSpill526_14;
    ((javax.crypto.Cipher)(__sourceSpill526_11)).init(((int)(__sourceSpill526_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill526_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation526_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[11];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "Ü¨ÎnÏdµÀSØpü&cMµYU_GùßøËï#K{,\032þ\rËEß¨HÃçÿ_ôÌ\007\003U\000.§ô¶;vÅÓO|Æ\fÑ"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill526_25 = local17_life21;
        int __sourceSpill526_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill526_25)).substring(((int)(__sourceSpill526_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill526_30 = local19_life19;
        int __sourceSpill526_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill526_33 = new byte[8];
        (__sourceSpill526_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill526_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill526_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill526_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill526_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill526_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill526_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill526_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill526_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill526_34)).doFinal(((byte[])(__sourceSpill526_33)));
        (__sourceSpill526_30)[__sourceSpill526_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "6L¤0Ü?®\026QúZNg|÷¾"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill526_38 = local17_life21;
        int __sourceSpill526_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill526_38)).substring(((int)(__sourceSpill526_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill526_43 = local19_life19;
        int __sourceSpill526_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill526_46 = new byte[8];
        (__sourceSpill526_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill526_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill526_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill526_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill526_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill526_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill526_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill526_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill526_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill526_47)).doFinal(((byte[])(__sourceSpill526_46)));
        (__sourceSpill526_43)[__sourceSpill526_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    f = ((long[])(local19_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[11]));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill526_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill526_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill526_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill526_59 = new byte[8];
    (__sourceSpill526_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill526_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation526_61 = __sourceSpill526_59;
    ((javax.crypto.Cipher)(__sourceSpill526_56)).init(((int)(__sourceSpill526_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill526_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation526_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "ic4Ý#·\fY×.íÌU×"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill526_70 = local4_life66;
        int __sourceSpill526_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill526_70)).substring(((int)(__sourceSpill526_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill526_75 = local6_life64;
        int __sourceSpill526_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill526_78 = new byte[8];
        (__sourceSpill526_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill526_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill526_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill526_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill526_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill526_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill526_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill526_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill526_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill526_79)).doFinal(((byte[])(__sourceSpill526_78)));
        (__sourceSpill526_75)[__sourceSpill526_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    i = ((long[])(local6_life64));
    j = ((java.lang.Long[])(new java.lang.Long[2]));
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Et.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4396_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Et"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14939);
    if (((moom.Et.j)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Et.i)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Et.k)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Et.k)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Et", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Et.j)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Et.j)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4398_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Et"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0, float p1) {
moom.Do forestValue2_40_0;
    long forestValue2_40_1;
    double forestValue2_154_0;
    int forestValue2_170_0;
    moom.Et forestValue2_189_0;
    moom.DT forestValue2_195_0;
    int forestValue2_196_0;
    int forestValue2_227_0;
    moom.fH forestValue2_241_0;
    double forestValue2_244_0;
    moom.fH forestValue2_269_0;
    moom.bs forestValue2_341_0;
    moom.bs forestValue2_341_1;
    moom.bs forestValue2_356_0;
    moom.bs forestValue2_356_1;
    int forestValue2_433_0;
    java.lang.String spill2_0;
    moom.Do spill2_1;
    long spill2_2;
    int spill2_3;
    moom.DT spill2_4;
    moom.Et spill2_5;
    double spill2_6;
    double spill2_7;
    int spill2_8;
    moom.fH spill2_9;
    moom.fH spill2_10;
    moom.bs spill2_11;
    moom.bs spill2_12;
    long life3_3;
    int life6_9;
    double life7_12;
    java.lang.String life5_13;
    int life9_17;
    int life10_21;
    int life11_23;
    moom.DT life12_25;
    long life13_29;
    moom.DV life15_46;
    moom.DT life15_65;
    int life16_71;
    int life18_89;
    moom.DT life19_114;
    moom.DT life17_122;
    double life20_162;
    double life15_246;
    double life17_252;
    double life19_258;
    moom.fH life21_264;
    int life22_276;
    double life23_298;
    float life25_375;
    float life26_377;
    float life27_379;
    float life28_381;
    double life29_443;
    double life31_446;
    forest_join_433: {
    forest_join_432: {
    forest_join_367: {
    forest_join_363: {
    forest_join_356: {
    forest_join_350: {
    forest_join_341: {
    forest_join_335: {
    forest_join_313: {
    forest_join_294: {
    forest_join_269: {
    forest_join_268: {
    forest_join_244: {
    forest_join_241: {
    forest_join_240: {
    forest_join_227: {
    forest_join_226: {
    forest_join_196: {
    forest_join_195: {
    forest_join_194: {
    forest_join_189: {
    forest_join_170: {
    forest_join_167: {
    forest_join_56: {
    forest_join_40: {
    life3_3 = (moom.Et.e ^ 46186733269116L);
    life6_9 = __sourceIntrinsic_4df89e99c096_invokedynamic2_1(24596, (2249193680051797834L ^ life3_3));
    spill2_0 = net.minecraft.world.World.c__String();
    life7_12 = -0x1.0p0d;
    life5_13 = spill2_0;
    life9_17 = moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).n)));
    life10_21 = moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).p)));
    life11_23 = 1;
    life12_25 = moom.DT.f;
    life13_29 = moom.Ee.a(((int)(life9_17)), ((int)(life10_21)));
    spill2_1 = this.c;
    spill2_2 = life13_29;
    if (!((life5_13 == null))) {
        forestValue2_40_0 = spill2_1;
        forestValue2_40_1 = spill2_2;
        break forest_join_40;
    }
    if (!(((moom.Do)(spill2_1)).a__Boolean(((long)(spill2_2))))) {
        break forest_join_56;
    }
    forestValue2_40_0 = this.c;
    forestValue2_40_1 = life13_29;
    }
    life15_46 = ((moom.DV)(((moom.Do)(forestValue2_40_0)).a__Object(((long)(forestValue2_40_1)))));
    life7_12 = 0x0.0p0d;
    life12_25 = life15_46;
    ((moom.DV)(life15_46)).p = ((long)(((net.minecraft.world.WorldServer)(this.a)).b__Long()));
    life11_23 = 0;
    if (!((life5_13 != null))) {
        break forest_join_167;
    }
    }
    life15_65 = new moom.DT(p0);
    life16_71 = __sourceIntrinsic_4df89e99c096_invokedynamic2_17(24161, (8766964448491422002L ^ life3_3));
    forest_cycle_67: while (true) {
    forest_join_164: {
    if (!((life16_71 <= __sourceIntrinsic_4df89e99c096_invokedynamic2_18(14018, (3763059711356938650L ^ life3_3))))) {
        break forest_join_167;
    }
    spill2_3 = __sourceIntrinsic_4df89e99c096_invokedynamic2_19(13565, (4786527439519951780L ^ life3_3));
    if (!((life5_13 == null))) {
        forestValue2_170_0 = spill2_3;
        break forest_join_170;
    }
    life18_89 = spill2_3;
    forest_cycle_82: while (true) {
    forest_join_161: {
    if (!((life18_89 <= __sourceIntrinsic_4df89e99c096_invokedynamic2_20(14018, (3763059711356938650L ^ life3_3))))) {
        break forest_join_164;
    }
    spill2_4 = ((moom.DT)(life15_65)).a(((int)(life16_71)), ((int)(((((net.minecraft.world.WorldServer)(this.a)).e() - 1) - ((moom.DT)(life15_65)).b()))), ((int)(life18_89)));
    if (!((life5_13 == null))) {
        forestValue2_195_0 = spill2_4;
        break forest_join_195;
    }
    life19_114 = spill2_4;
    forest_cycle_104: while (true) {
    forest_join_159: {
    forest_join_157: {
    forest_join_154: {
    forest_join_153: {
    forest_join_137: {
    if (!((((moom.DT)(life19_114)).b() >= 0))) {
        break forest_join_161;
    }
    life17_122 = ((moom.DT)(life19_114)).b__DT();
    if (!((life5_13 == null))) {
        break forest_join_159;
    }
    spill2_5 = this;
    if (!((life5_13 == null))) {
        forestValue2_189_0 = spill2_5;
        break forest_join_189;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(((moom.Et)(spill2_5)).a)).a__fE(((moom.DT)(life19_114))))).a__ch() == net.minecraft.init.Blocks.aY))) {
        break forest_join_157;
    }
    forest_cycle_121: while (true) {
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(this.a)).a__fE(((moom.DT)((life17_122 = ((moom.DT)(life19_114)).b__DT())))))).a__ch() == net.minecraft.init.Blocks.aY))) {
        break forest_join_137;
    }
    life19_114 = life17_122;
    if (!((life5_13 == null))) {
        break forest_join_159;
    }
    if (!((life5_13 != null))) {
        continue forest_cycle_121;
    }
    break forest_cycle_121;
    }
    }
    life20_162 = ((moom.DT)(life19_114)).a(((moom.DS)(life15_65)));
    spill2_6 = life7_12;
    if (!((life5_13 == null))) {
        forestValue2_154_0 = spill2_6;
        break forest_join_154;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill2_6)), ((double)(0x0.0p0d))) >= 0))) {
        break forest_join_153;
    }
    spill2_7 = life20_162;
    if (!((life5_13 == null))) {
        forestValue2_154_0 = spill2_7;
        break forest_join_154;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill2_7)), ((double)(life7_12))) < 0))) {
        break forest_join_157;
    }
    }
    forestValue2_154_0 = life20_162;
    }
    life7_12 = forestValue2_154_0;
    life12_25 = life19_114;
    }
    life19_114 = life17_122;
    }
    if (!((life5_13 != null))) {
        continue forest_cycle_104;
    }
    break forest_cycle_104;
    }
    }
    life18_89 += 1;
    if (!((life5_13 != null))) {
        continue forest_cycle_82;
    }
    break forest_cycle_82;
    }
    }
    life16_71 += 1;
    if (!((life5_13 != null))) {
        continue forest_cycle_67;
    }
    break forest_cycle_67;
    }
    }
    forestValue2_170_0 = recovery.source.CarrierOps.dcmpl(((double)(life7_12)), ((double)(0x0.0p0d)));
    }
    if (!((life5_13 == null))) {
        forestValue2_433_0 = forestValue2_170_0;
        break forest_join_433;
    }
    if (!((forestValue2_170_0 >= 0))) {
        break forest_join_432;
    }
    spill2_8 = life11_23;
    if (!((life5_13 == null))) {
        forestValue2_196_0 = spill2_8;
        break forest_join_196;
    }
    if (!((spill2_8 != 0))) {
        break forest_join_194;
    }
    ((moom.Do)(this.c)).a(((long)(life13_29)), ((java.lang.Object)(new moom.DV(life12_25, ((net.minecraft.world.WorldServer)(this.a)).b__Long()))));
    forestValue2_189_0 = this;
    }
    ((java.util.List)(((moom.Et)(forestValue2_189_0)).d)).add(((java.lang.Object)(java.lang.Long.valueOf(((long)(life13_29))))));
    }
    forestValue2_195_0 = life12_25;
    }
    forestValue2_196_0 = ((moom.DT)(forestValue2_195_0)).a();
    }
    life15_246 = (((double) forestValue2_196_0) + 0x1.0p-1d);
    life17_252 = (((double) ((moom.DT)(life12_25)).b()) + 0x1.0p-1d);
    life19_258 = (((double) ((moom.DT)(life12_25)).c()) + 0x1.0p-1d);
    life21_264 = ((moom.cr)(net.minecraft.init.Blocks.aY)).a__sourceReturn_2b3255b4c3(((net.minecraft.world.World)(this.a)), ((moom.DT)(life12_25)));
    if (!((((moom.bs)(((moom.bs)(((moom.fH)(life21_264)).a__bs())).b__bs())).a__bu() == net.minecraft.util.EnumFacing$AxisDirection.NEGATIVE))) {
        break forest_join_226;
    }
    forestValue2_227_0 = 1;
    break forest_join_227;
    }
    forestValue2_227_0 = 0;
    }
    life22_276 = forestValue2_227_0;
    spill2_9 = life21_264;
    if (!((life5_13 == null))) {
        forestValue2_241_0 = spill2_9;
        break forest_join_241;
    }
    if (!((((moom.bs)(((moom.fH)(spill2_9)).a__bs())).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) {
        break forest_join_240;
    }
    forestValue2_244_0 = ((double) ((moom.DT)(((moom.fH)(life21_264)).a__DT())).c());
    break forest_join_244;
    }
    forestValue2_241_0 = life21_264;
    }
    forestValue2_244_0 = ((double) ((moom.DT)(((moom.fH)(forestValue2_241_0)).a__DT())).a());
    }
    life23_298 = forestValue2_244_0;
    spill2_10 = life21_264;
    if (!((life5_13 == null))) {
        forestValue2_269_0 = spill2_10;
        break forest_join_269;
    }
    life17_252 = (((double) (((moom.DT)(((moom.fH)(spill2_10)).a__DT())).b() + 1)) - (((moom.DR)(((net.minecraft.entity.Entity)(p0)).c__DR())).b * ((double) ((moom.fH)(life21_264)).b())));
    if (!((life22_276 != 0))) {
        break forest_join_268;
    }
    life23_298 = (life23_298 + 0x1.0p0d);
    }
    forestValue2_269_0 = life21_264;
    }
    if (!((((moom.bs)(((moom.fH)(forestValue2_269_0)).a__bs())).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) {
        break forest_join_294;
    }
    life19_258 = (life23_298 + (((0x1.0p0d - ((moom.DR)(((net.minecraft.entity.Entity)(p0)).c__DR())).a) * ((double) ((moom.fH)(life21_264)).a())) * ((double) ((net.minecraft.util.EnumFacing$AxisDirection)(((moom.bs)(((moom.bs)(((moom.fH)(life21_264)).a__bs())).b__bs())).a__bu())).a())));
    if (!((life5_13 != null))) {
        break forest_join_313;
    }
    }
    life15_246 = (life23_298 + (((0x1.0p0d - ((moom.DR)(((net.minecraft.entity.Entity)(p0)).c__DR())).a) * ((double) ((moom.fH)(life21_264)).a())) * ((double) ((net.minecraft.util.EnumFacing$AxisDirection)(((moom.bs)(((moom.bs)(((moom.fH)(life21_264)).a__bs())).b__bs())).a__bu())).a())));
    }
    life25_375 = 0x0.0p0f;
    life26_377 = 0x0.0p0f;
    life27_379 = 0x0.0p0f;
    life28_381 = 0x0.0p0f;
    spill2_11 = ((moom.bs)(((moom.fH)(life21_264)).a__bs())).a__bs();
    spill2_12 = ((net.minecraft.entity.Entity)(p0)).a__bs();
    if (!((life5_13 == null))) {
        forestValue2_341_0 = spill2_11;
        forestValue2_341_1 = spill2_12;
        break forest_join_341;
    }
    if (!((spill2_11 == spill2_12))) {
        break forest_join_335;
    }
    life25_375 = 0x1.0p0f;
    life26_377 = 0x1.0p0f;
    if (!((life5_13 != null))) {
        break forest_join_367;
    }
    }
    forestValue2_341_0 = ((moom.bs)(((moom.fH)(life21_264)).a__bs())).a__bs();
    forestValue2_341_1 = ((moom.bs)(((net.minecraft.entity.Entity)(p0)).a__bs())).a__bs();
    }
    if (!((life5_13 == null))) {
        forestValue2_356_0 = forestValue2_341_0;
        forestValue2_356_1 = forestValue2_341_1;
        break forest_join_356;
    }
    if (!((forestValue2_341_0 == forestValue2_341_1))) {
        break forest_join_350;
    }
    life25_375 = -0x1.0p0f;
    life26_377 = -0x1.0p0f;
    if (!((life5_13 != null))) {
        break forest_join_367;
    }
    }
    forestValue2_356_0 = ((moom.bs)(((moom.fH)(life21_264)).a__bs())).a__bs();
    forestValue2_356_1 = ((moom.bs)(((net.minecraft.entity.Entity)(p0)).a__bs())).b__bs();
    }
    if (!((forestValue2_356_0 == forestValue2_356_1))) {
        break forest_join_363;
    }
    life27_379 = 0x1.0p0f;
    life28_381 = -0x1.0p0f;
    if (!((life5_13 != null))) {
        break forest_join_367;
    }
    }
    life27_379 = -0x1.0p0f;
    life28_381 = 0x1.0p0f;
    }
    life29_443 = ((net.minecraft.entity.Entity)(p0)).t;
    life31_446 = ((net.minecraft.entity.Entity)(p0)).v;
    ((net.minecraft.entity.Entity)(p0)).t = ((double)(((life29_443 * ((double) life25_375)) + (life31_446 * ((double) life28_381)))));
    ((net.minecraft.entity.Entity)(p0)).v = ((double)(((life29_443 * ((double) life27_379)) + (life31_446 * ((double) life26_377)))));
    ((net.minecraft.entity.Entity)(p0)).w = ((float)(((p1 - ((float) (((moom.bs)(((moom.bs)(((net.minecraft.entity.Entity)(p0)).a__bs())).a__bs())).b() * __sourceIntrinsic_4df89e99c096_invokedynamic2_104(29080, (2437620501796548290L ^ life3_3))))) + ((float) (((moom.bs)(((moom.fH)(life21_264)).a__bs())).b() * __sourceIntrinsic_4df89e99c096_invokedynamic2_107(11283, (8341448784462426958L ^ life3_3)))))));
    ((net.minecraft.entity.Entity)(p0)).c(((double)(life15_246)), ((double)(life17_252)), ((double)(life19_258)), ((float)(((net.minecraft.entity.Entity)(p0)).w)), ((float)(((net.minecraft.entity.Entity)(p0)).x)));
    return ((1) != 0);
    }
    forestValue2_433_0 = 0;
    }
    return ((forestValue2_433_0) != 0);
}


public void a(net.minecraft.entity.Entity p0, float p1) {
int forestValue247_29_0;
    int forestValue247_35_0;
    int forestValue247_57_0;
    int forestValue247_68_0;
    int forestValue247_108_0;
    int forestValue247_110_0;
    net.minecraft.world.WorldServer forestValue247_124_0;
    moom.DT forestValue247_124_1;
    net.minecraft.world.WorldServer forestValue247_126_0;
    moom.DT forestValue247_126_1;
    net.minecraft.block.state.IBlockState forestValue247_126_2;
    int spill247_0;
    boolean spill247_1;
    int spill247_2;
    long spill247_3;
    int spill247_4;
    int spill247_5;
    net.minecraft.world.WorldServer spill247_6;
    moom.DT spill247_7;
    net.minecraft.entity.Entity spill247_8;
    net.minecraft.entity.Entity spill247_9;
    double spill247_10;
    double spill247_11;
    long life3_3;
    java.lang.String life5_5;
    int life6_40;
    int life7_47;
    int life8_54;
    int life9_56;
    int life10_58;
    int life11_60;
    int life12_71;
    int life13_78;
    int life14_91;
    int life15_95;
    int life16_105;
    int life17_116;
    forest_join_157: {
    forest_join_148: {
    forest_join_137: {
    forest_join_35: {
    forest_join_32: {
    forest_join_29: {
    life3_3 = (moom.Et.e ^ 117265168093937L);
    life5_5 = net.minecraft.world.World.c__String();
    spill247_0 = ((moom.EA)(((net.minecraft.world.WorldServer)(this.a)).v)).b();
    if (!((life5_5 == null))) {
        forestValue247_35_0 = spill247_0;
        break forest_join_35;
    }
    if (!((spill247_0 != 1))) {
        break forest_join_32;
    }
    spill247_1 = ((moom.Et)(this)).a__Boolean(((net.minecraft.entity.Entity)(p0)), ((float)(p1)));
    if (!((life5_5 == null))) {
        forestValue247_29_0 = ((spill247_1) ? 1 : 0);
        break forest_join_29;
    }
    if (!((!spill247_1))) {
        break forest_join_157;
    }
    this.a(((net.minecraft.entity.Entity)(p0)));
    forestValue247_29_0 = ((((moom.Et)(this)).a__Boolean(((net.minecraft.entity.Entity)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue247_29_0);
    if (!((life5_5 != null))) {
        break forest_join_157;
    }
    }
    forestValue247_35_0 = moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).n)));
    }
    life6_40 = forestValue247_35_0;
    spill247_2 = 12109;
    life7_47 = (moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).o))) - 1);
    spill247_3 = (2015594631175705234L ^ life3_3);
    life8_54 = moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).p)));
    life9_56 = 1;
    life10_58 = 0;
    life11_60 = __sourceIntrinsic_5c8fb418f5cf_invokedynamic247_17(spill247_2, spill247_3);
    forest_cycle_56: while (true) {
    forest_join_134: {
    forestValue247_57_0 = life11_60;
    forest_cycle_57: while (true) {
    if (!((forestValue247_57_0 <= 2))) {
        break forest_join_137;
    }
    if (!((life5_5 == null))) {
        break forest_join_148;
    }
    life12_71 = __sourceIntrinsic_5c8fb418f5cf_invokedynamic247_18(12031, (552518380922999598L ^ life3_3));
    forest_cycle_67: while (true) {
    forest_join_131: {
    forestValue247_68_0 = life12_71;
    forest_cycle_68: while (true) {
    if (!((forestValue247_68_0 <= 2))) {
        break forest_join_134;
    }
    spill247_4 = -1;
    if (!((life5_5 == null))) {
        forestValue247_57_0 = spill247_4;
        continue forest_cycle_57;
    }
    life13_78 = spill247_4;
    forest_cycle_74: while (true) {
    forest_join_126: {
    forest_join_124: {
    forest_join_110: {
    forest_join_109: {
    forest_join_108: {
    if (!((life13_78 < 3))) {
        break forest_join_131;
    }
    life14_91 = ((life6_40 + (life12_71 * life9_56)) + (life11_60 * life10_58));
    life15_95 = (life7_47 + life13_78);
    life16_105 = ((life8_54 + (life12_71 * life10_58)) - (life11_60 * life9_56));
    spill247_5 = life13_78;
    if (!((life5_5 == null))) {
        forestValue247_68_0 = spill247_5;
        continue forest_cycle_68;
    }
    if (!((life5_5 == null))) {
        forestValue247_108_0 = spill247_5;
        break forest_join_108;
    }
    if (!((spill247_5 < 0))) {
        break forest_join_109;
    }
    forestValue247_108_0 = 1;
    }
    forestValue247_110_0 = forestValue247_108_0;
    break forest_join_110;
    }
    forestValue247_110_0 = 0;
    }
    life17_116 = forestValue247_110_0;
    spill247_6 = this.a;
    spill247_7 = new moom.DT(life14_91, life15_95, life16_105);
    if (!((life17_116 != 0))) {
        forestValue247_124_0 = spill247_6;
        forestValue247_124_1 = spill247_7;
        break forest_join_124;
    }
    forestValue247_126_0 = spill247_6;
    forestValue247_126_1 = spill247_7;
    forestValue247_126_2 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z)).a__fE();
    break forest_join_126;
    }
    forestValue247_126_0 = forestValue247_124_0;
    forestValue247_126_1 = forestValue247_124_1;
    forestValue247_126_2 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    }
    ((net.minecraft.world.WorldServer)(forestValue247_126_0)).a(((moom.DT)(forestValue247_126_1)), ((net.minecraft.block.state.IBlockState)(forestValue247_126_2)));
    life13_78 += 1;
    if (!((life5_5 != null))) {
        continue forest_cycle_74;
    }
    break forest_cycle_74;
    }
    break forest_cycle_68;
    }
    }
    life12_71 += 1;
    if (!((life5_5 != null))) {
        continue forest_cycle_67;
    }
    break forest_cycle_67;
    }
    break forest_cycle_57;
    }
    }
    life11_60 += 1;
    if (!((life5_5 != null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    }
    ((net.minecraft.entity.Entity)(p0)).c(((double)(((double) life6_40))), ((double)(((double) life7_47))), ((double)(((double) life8_54))), ((float)(((net.minecraft.entity.Entity)(p0)).w)), ((float)(0x0.0p0f)));
    }
    spill247_8 = p0;
    spill247_9 = p0;
    net.minecraft.entity.Entity __stackOp247_27_0 = p0;
    double __stackOp247_27_1 = 0x0.0p0d;
    spill247_10 = __stackOp247_27_1;
    ((net.minecraft.entity.Entity)(__stackOp247_27_0)).v = ((double)(__stackOp247_27_1));
    net.minecraft.entity.Entity __stackOp247_29_0 = spill247_9;
    double __stackOp247_29_1 = spill247_10;
    spill247_11 = __stackOp247_29_1;
    ((net.minecraft.entity.Entity)(__stackOp247_29_0)).u = ((double)(__stackOp247_29_1));
    ((net.minecraft.entity.Entity)(spill247_8)).t = ((double)(spill247_11));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(long p0) {
java.lang.Object lexicalValue599_60_0;
    moom.DV spill599_0;
    moom.DV spill599_1;
    long life3_3;
    java.lang.String life5_5;
    java.util.Iterator life6_19;
    long life7_27;
    java.lang.Long life9_34;
    moom.DV life10_41;
    lexical_join_63: {
    life3_3 = (moom.Et.e ^ 69831383113816L);
    life5_5 = net.minecraft.world.World.c__String();
    if (!((recovery.source.CarrierOps.lcmp(((long)((p0 % __sourceIntrinsic_e753b806269e_invokedynamic599_2(9969, (4653923747329819539L ^ life3_3))))), ((long)(0L))) == 0))) {
        break lexical_join_63;
    }
    life6_19 = ((java.util.List)(this.d)).iterator();
    life7_27 = (p0 - __sourceIntrinsic_e753b806269e_invokedynamic599_6(15560, (8800115683888454059L ^ life3_3)));
    lexical_cycle_28: while (true) {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_53: {
    if (!(((java.util.Iterator)(life6_19)).hasNext())) {
        break lexical_join_63;
    }
    life9_34 = ((java.lang.Long)(((java.util.Iterator)(life6_19)).next()));
    life10_41 = ((moom.DV)(((moom.Do)(this.c)).a__Object(((long)(((java.lang.Long)(life9_34)).longValue())))));
    spill599_0 = life10_41;
    if (!((life5_5 == null))) {
        lexicalValue599_60_0 = spill599_0;
        break lexical_join_60;
    }
    if (!((spill599_0 != null))) {
        break lexical_join_53;
    }
    spill599_1 = life10_41;
    if (!((life5_5 == null))) {
        lexicalValue599_60_0 = spill599_1;
        break lexical_join_60;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((moom.DV)(spill599_1)).p)), ((long)(life7_27))) < 0))) {
        break lexical_join_61;
    }
    }
    ((java.util.Iterator)(life6_19)).remove();
    lexicalValue599_60_0 = ((moom.Do)(this.c)).b(((long)(((java.lang.Long)(life9_34)).longValue())));
    }
    recovery.source.CarrierOps.discard(lexicalValue599_60_0);
    }
    if (!((life5_5 != null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return;
}


public boolean a(net.minecraft.entity.Entity p0) {
int forestValue900068_48_0;
    int forestValue900068_67_0;
    int forestValue900068_70_0;
    int forestValue900068_70_1;
    int forestValue900068_123_0;
    int forestValue900068_146_0;
    int forestValue900068_176_0;
    int forestValue900068_178_0;
    int forestValue900068_185_0;
    int forestValue900068_245_0;
    int forestValue900068_252_0;
    int forestValue900068_265_0;
    int forestValue900068_307_0;
    int forestValue900068_323_0;
    int forestValue900068_331_0;
    int forestValue900068_350_0;
    int forestValue900068_371_0;
    int forestValue900068_406_0;
    int forestValue900068_429_0;
    int forestValue900068_448_0;
    int forestValue900068_500_0;
    int forestValue900068_507_0;
    int forestValue900068_517_0;
    int forestValue900068_559_0;
    int forestValue900068_575_0;
    int forestValue900068_602_0;
    int forestValue900068_625_0;
    int forestValue900068_627_0;
    int forestValue900068_632_0;
    int forestValue900068_676_0;
    int forestValue900068_678_0;
    net.minecraft.world.WorldServer forestValue900068_692_0;
    moom.DT forestValue900068_692_1;
    net.minecraft.world.WorldServer forestValue900068_694_0;
    moom.DT forestValue900068_694_1;
    net.minecraft.block.state.IBlockState forestValue900068_694_2;
    net.minecraft.block.state.IBlockState forestValue900068_712_0;
    moom.fw forestValue900068_712_1;
    net.minecraft.block.state.IBlockState forestValue900068_713_0;
    moom.fw forestValue900068_713_1;
    net.minecraft.util.EnumFacing$Axis forestValue900068_713_2;
    int forestValue900068_718_0;
    int forestValue900068_725_0;
    int forestValue900068_776_0;
    int forestValue900068_778_0;
    net.minecraft.world.WorldServer forestValue900068_792_0;
    moom.DT forestValue900068_792_1;
    net.minecraft.world.WorldServer forestValue900068_793_0;
    moom.DT forestValue900068_793_1;
    net.minecraft.block.state.IBlockState forestValue900068_793_2;
    int forestValue900068_803_0;
    int forestValue900068_862_0;
    java.lang.String spill900068_0;
    int spill900068_1;
    int spill900068_2;
    boolean spill900068_3;
    boolean spill900068_4;
    boolean spill900068_5;
    int spill900068_6;
    int spill900068_7;
    int spill900068_8;
    int spill900068_9;
    int spill900068_10;
    int spill900068_11;
    boolean spill900068_12;
    int spill900068_13;
    int spill900068_14;
    int spill900068_15;
    int spill900068_16;
    boolean spill900068_17;
    boolean spill900068_18;
    boolean spill900068_19;
    int spill900068_20;
    int spill900068_21;
    int spill900068_22;
    int spill900068_23;
    boolean spill900068_24;
    int spill900068_25;
    int spill900068_26;
    int spill900068_27;
    int spill900068_28;
    int spill900068_29;
    net.minecraft.world.WorldServer spill900068_30;
    moom.DT spill900068_31;
    net.minecraft.block.state.IBlockState spill900068_32;
    moom.fw spill900068_33;
    int spill900068_34;
    int spill900068_35;
    int spill900068_36;
    int spill900068_37;
    int spill900068_38;
    int spill900068_39;
    net.minecraft.world.WorldServer spill900068_40;
    moom.DT spill900068_41;
    int spill900068_42;
    long life2_3;
    int life5_10;
    double life6_12;
    java.lang.String life4_13;
    int life8_17;
    int life9_21;
    int life10_25;
    int life11_27;
    int life12_29;
    int life13_31;
    int life14_33;
    int life15_38;
    moom.DU life16_42;
    int life17_46;
    double life18_62;
    int life20_69;
    double life21_86;
    int life23_95;
    int life24_179;
    int life25_190;
    int life26_194;
    int life27_217;
    int life28_228;
    int life29_239;
    int life30_256;
    int life31_260;
    int life32_272;
    double life27_343;
    double life29_355;
    double life18_434;
    int life20_441;
    double life21_457;
    int life23_466;
    int life24_551;
    int life25_562;
    int life26_566;
    int life27_571;
    int life28_582;
    int life29_595;
    int life30_599;
    int life31_607;
    double life27_674;
    double life29_686;
    int life18_740;
    int life19_742;
    int life20_746;
    int life21_750;
    int life12_794;
    int life22_799;
    int life23_807;
    int life24_818;
    int life25_835;
    int life26_839;
    int life27_851;
    int life28_867;
    net.minecraft.block.state.IBlockState life22_910;
    int life23_912;
    int life24_923;
    int life25_934;
    int life26_947;
    int life27_951;
    int life28_959;
    int life29_1002;
    int life24_1032;
    int life25_1042;
    int life26_1055;
    int life27_1059;
    int life28_1067;
    moom.DT life29_1074;
    forest_join_862: {
    forest_join_861: {
    forest_join_713: {
    forest_join_712: {
    forest_join_705: {
    forest_join_625: {
    forest_join_602: {
    forest_join_599: {
    forest_join_575: {
    forest_join_572: {
    forest_join_323: {
    forest_join_320: {
    life2_3 = (moom.Et.e ^ 49635472684993L);
    spill900068_0 = net.minecraft.world.World.c__String();
    life5_10 = __sourceIntrinsic_376c3b2efa03_invokedynamic900068_2(17216, (757697830533962658L ^ life2_3));
    life6_12 = -0x1.0p0d;
    life4_13 = spill900068_0;
    life8_17 = moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).n)));
    life9_21 = moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).o)));
    life10_25 = moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).p)));
    life11_27 = life8_17;
    life12_29 = life9_21;
    life13_31 = life10_25;
    life14_33 = 0;
    life15_38 = ((java.util.Random)(this.b)).nextInt(((int)(4)));
    life16_42 = new moom.DU();
    life17_46 = (life8_17 - life5_10);
    forest_cycle_47: while (true) {
    forest_join_317: {
    forestValue900068_48_0 = life17_46;
    forest_cycle_48: while (true) {
    if (!((forestValue900068_48_0 <= (life8_17 + life5_10)))) {
        break forest_join_320;
    }
    life18_62 = ((((double) life17_46) + 0x1.0p-1d) - ((net.minecraft.entity.Entity)(p0)).n);
    spill900068_1 = (life10_25 - life5_10);
    if (!((life4_13 == null))) {
        forestValue900068_323_0 = spill900068_1;
        break forest_join_323;
    }
    life20_69 = spill900068_1;
    forest_cycle_66: while (true) {
    forest_join_314: {
    forestValue900068_67_0 = life20_69;
    forest_cycle_67: while (true) {
    forestValue900068_70_0 = forestValue900068_67_0;
    forestValue900068_70_1 = (life10_25 + life5_10);
    forest_cycle_70: while (true) {
    if (!((forestValue900068_70_0 <= forestValue900068_70_1))) {
        break forest_join_317;
    }
    life21_86 = ((((double) life20_69) + 0x1.0p-1d) - ((net.minecraft.entity.Entity)(p0)).p);
    spill900068_2 = (((net.minecraft.world.WorldServer)(this.a)).e() - 1);
    if (!((life4_13 == null))) {
        forestValue900068_48_0 = spill900068_2;
        continue forest_cycle_48;
    }
    life23_95 = spill900068_2;
    forest_cycle_87: while (true) {
    forest_join_311: {
    forest_join_146: {
    forest_join_145: {
    forest_join_123: {
    if (!((life23_95 >= 0))) {
        break forest_join_314;
    }
    spill900068_3 = ((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(((moom.DU)(life16_42)).a(((int)(life17_46)), ((int)(life23_95)), ((int)(life20_69))))));
    if (!((life4_13 == null))) {
        forestValue900068_67_0 = ((spill900068_3) ? 1 : 0);
        continue forest_cycle_67;
    }
    if (!((life4_13 == null))) {
        forestValue900068_123_0 = ((spill900068_3) ? 1 : 0);
        break forest_join_123;
    }
    if (!(spill900068_3)) {
        break forest_join_311;
    }
    forest_cycle_102: while (true) {
    if (!((life23_95 > 0))) {
        break forest_join_145;
    }
    spill900068_4 = ((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(((moom.DU)(life16_42)).a(((int)(life17_46)), ((int)((life23_95 - 1))), ((int)(life20_69))))));
    if (!((life4_13 == null))) {
        forestValue900068_146_0 = ((spill900068_4) ? 1 : 0);
        break forest_join_146;
    }
    if (!((life4_13 == null))) {
        forestValue900068_146_0 = ((spill900068_4) ? 1 : 0);
        break forest_join_146;
    }
    if (!(spill900068_4)) {
        break forest_join_145;
    }
    life23_95 += -1;
    if (!((life4_13 != null))) {
        continue forest_cycle_102;
    }
    break forest_cycle_102;
    }
    break forest_join_145;
    }
    forest_cycle_123: while (true) {
    forest_join_143: {
    if (!((forestValue900068_123_0 > 0))) {
        break forest_join_145;
    }
    spill900068_5 = ((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(((moom.DU)(life16_42)).a(((int)(life17_46)), ((int)((life23_95 - 1))), ((int)(life20_69))))));
    if (!((life4_13 == null))) {
        forestValue900068_146_0 = ((spill900068_5) ? 1 : 0);
        break forest_join_146;
    }
    if (!((life4_13 == null))) {
        forestValue900068_146_0 = ((spill900068_5) ? 1 : 0);
        break forest_join_146;
    }
    if (!(spill900068_5)) {
        break forest_join_145;
    }
    life23_95 += -1;
    if (!((life4_13 != null))) {
        break forest_join_143;
    }
    break forest_join_145;
    }
    spill900068_6 = life23_95;
    forestValue900068_123_0 = spill900068_6;
    continue forest_cycle_123;
    }
    }
    forestValue900068_146_0 = life15_38;
    }
    life24_179 = forestValue900068_146_0;
    forest_cycle_147: while (true) {
    forest_join_308: {
    forest_join_307: {
    forest_join_296: {
    forest_join_265: {
    forest_join_264: {
    forest_join_176: {
    forest_join_175: {
    if (!((life24_179 < (life15_38 + 4)))) {
        break forest_join_311;
    }
    life25_190 = (life24_179 % 2);
    life26_194 = (1 - life25_190);
    spill900068_7 = (life24_179 % 4);
    if (!((life4_13 == null))) {
        forestValue900068_176_0 = spill900068_7;
        break forest_join_176;
    }
    spill900068_8 = 2;
    if (!((life4_13 == null))) {
        forestValue900068_70_0 = spill900068_7;
        forestValue900068_70_1 = spill900068_8;
        continue forest_cycle_70;
    }
    if (!((spill900068_7 >= spill900068_8))) {
        break forest_join_175;
    }
    life25_190 = (-life25_190);
    life26_194 = (-life26_194);
    }
    forestValue900068_176_0 = 0;
    }
    life27_217 = forestValue900068_176_0;
    forest_cycle_177: while (true) {
    forest_join_261: {
    forestValue900068_178_0 = life27_217;
    forest_cycle_178: while (true) {
    if (!((forestValue900068_178_0 < 3))) {
        break forest_join_264;
    }
    spill900068_9 = 0;
    if (!((life4_13 == null))) {
        forestValue900068_265_0 = spill900068_9;
        break forest_join_265;
    }
    life28_228 = spill900068_9;
    forest_cycle_184: while (true) {
    forest_join_258: {
    forestValue900068_185_0 = life28_228;
    forest_cycle_185: while (true) {
    if (!((forestValue900068_185_0 < 4))) {
        break forest_join_261;
    }
    spill900068_10 = -1;
    if (!((life4_13 == null))) {
        forestValue900068_178_0 = spill900068_10;
        continue forest_cycle_178;
    }
    life29_239 = spill900068_10;
    forest_cycle_191: while (true) {
    forest_join_255: {
    forest_join_252: {
    forest_join_245: {
    forest_join_244: {
    if (!((life29_239 < 4))) {
        break forest_join_258;
    }
    life30_256 = ((life17_46 + ((life28_228 - 1) * life25_190)) + (life27_217 * life26_194));
    life31_260 = (life23_95 + life29_239);
    life32_272 = ((life20_69 + ((life28_228 - 1) * life26_194)) - (life27_217 * life25_190));
    ((moom.DU)(life16_42)).a(((int)(life30_256)), ((int)(life31_260)), ((int)(life32_272)));
    spill900068_11 = life29_239;
    if (!((life4_13 == null))) {
        forestValue900068_185_0 = spill900068_11;
        continue forest_cycle_185;
    }
    if (!((life4_13 == null))) {
        forestValue900068_245_0 = spill900068_11;
        break forest_join_245;
    }
    if (!((spill900068_11 < 0))) {
        break forest_join_244;
    }
    spill900068_12 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(this.a)).a__fE(((moom.DT)(life16_42))))).a__ch())).a__fn())).b__Boolean();
    if (!((life4_13 == null))) {
        forestValue900068_245_0 = ((spill900068_12) ? 1 : 0);
        break forest_join_245;
    }
    if (!(spill900068_12)) {
        break forest_join_311;
    }
    }
    forestValue900068_245_0 = life29_239;
    }
    if (!((life4_13 == null))) {
        forestValue900068_252_0 = forestValue900068_245_0;
        break forest_join_252;
    }
    if (!((forestValue900068_245_0 >= 0))) {
        break forest_join_255;
    }
    forestValue900068_252_0 = ((((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(life16_42)))) ? 1 : 0);
    }
    if (!((forestValue900068_252_0 == 0))) {
        break forest_join_255;
    }
    if (!((life4_13 != null))) {
        break forest_join_311;
    }
    }
    life29_239 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_191;
    }
    break forest_cycle_191;
    }
    break forest_cycle_185;
    }
    }
    life28_228 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_184;
    }
    break forest_cycle_184;
    }
    break forest_cycle_178;
    }
    }
    life27_217 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_177;
    }
    break forest_cycle_177;
    }
    }
    forestValue900068_265_0 = life23_95;
    }
    life27_343 = ((((double) forestValue900068_265_0) + 0x1.0p-1d) - ((net.minecraft.entity.Entity)(p0)).o);
    life29_355 = (((life18_62 * life18_62) + (life27_343 * life27_343)) + (life21_86 * life21_86));
    spill900068_13 = recovery.source.CarrierOps.dcmpg(((double)(life6_12)), ((double)(0x0.0p0d)));
    if (!((life4_13 == null))) {
        forestValue900068_307_0 = spill900068_13;
        break forest_join_307;
    }
    if (!((spill900068_13 >= 0))) {
        break forest_join_296;
    }
    spill900068_14 = recovery.source.CarrierOps.dcmpg(((double)(life29_355)), ((double)(life6_12)));
    if (!((life4_13 == null))) {
        forestValue900068_307_0 = spill900068_14;
        break forest_join_307;
    }
    if (!((spill900068_14 < 0))) {
        break forest_join_308;
    }
    }
    life6_12 = life29_355;
    life11_27 = life17_46;
    life12_29 = life23_95;
    life13_31 = life20_69;
    forestValue900068_307_0 = (life24_179 % 4);
    }
    life14_33 = forestValue900068_307_0;
    }
    life24_179 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_147;
    }
    break forest_cycle_147;
    }
    }
    life23_95 += -1;
    if (!((life4_13 != null))) {
        continue forest_cycle_87;
    }
    break forest_cycle_87;
    }
    break forest_cycle_70;
    }
    break forest_cycle_67;
    }
    }
    life20_69 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_66;
    }
    break forest_cycle_66;
    }
    break forest_cycle_48;
    }
    }
    life17_46 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    }
    forestValue900068_323_0 = recovery.source.CarrierOps.dcmpg(((double)(life6_12)), ((double)(0x0.0p0d)));
    }
    if (!((life4_13 == null))) {
        forestValue900068_575_0 = forestValue900068_323_0;
        break forest_join_575;
    }
    if (!((forestValue900068_323_0 < 0))) {
        break forest_join_572;
    }
    life17_46 = (life8_17 - life5_10);
    forest_cycle_330: while (true) {
    forest_join_569: {
    forestValue900068_331_0 = life17_46;
    forest_cycle_331: while (true) {
    if (!((forestValue900068_331_0 <= (life8_17 + life5_10)))) {
        break forest_join_572;
    }
    life18_434 = ((((double) life17_46) + 0x1.0p-1d) - ((net.minecraft.entity.Entity)(p0)).n);
    spill900068_15 = (life10_25 - life5_10);
    if (!((life4_13 == null))) {
        forestValue900068_575_0 = spill900068_15;
        break forest_join_575;
    }
    life20_441 = spill900068_15;
    forest_cycle_349: while (true) {
    forest_join_566: {
    forestValue900068_350_0 = life20_441;
    forest_cycle_350: while (true) {
    if (!((forestValue900068_350_0 <= (life10_25 + life5_10)))) {
        break forest_join_569;
    }
    life21_457 = ((((double) life20_441) + 0x1.0p-1d) - ((net.minecraft.entity.Entity)(p0)).p);
    spill900068_16 = (((net.minecraft.world.WorldServer)(this.a)).e() - 1);
    if (!((life4_13 == null))) {
        forestValue900068_331_0 = spill900068_16;
        continue forest_cycle_331;
    }
    life23_466 = spill900068_16;
    forest_cycle_370: while (true) {
    forest_join_563: {
    forestValue900068_371_0 = life23_466;
    forest_cycle_371: while (true) {
    forest_join_429: {
    forest_join_428: {
    forest_join_406: {
    if (!((forestValue900068_371_0 >= 0))) {
        break forest_join_566;
    }
    spill900068_17 = ((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(((moom.DU)(life16_42)).a(((int)(life17_46)), ((int)(life23_466)), ((int)(life20_441))))));
    if (!((life4_13 == null))) {
        forestValue900068_350_0 = ((spill900068_17) ? 1 : 0);
        continue forest_cycle_350;
    }
    if (!((life4_13 == null))) {
        forestValue900068_406_0 = ((spill900068_17) ? 1 : 0);
        break forest_join_406;
    }
    if (!(spill900068_17)) {
        break forest_join_563;
    }
    forest_cycle_385: while (true) {
    if (!((life23_466 > 0))) {
        break forest_join_428;
    }
    spill900068_18 = ((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(((moom.DU)(life16_42)).a(((int)(life17_46)), ((int)((life23_466 - 1))), ((int)(life20_441))))));
    if (!((life4_13 == null))) {
        forestValue900068_429_0 = ((spill900068_18) ? 1 : 0);
        break forest_join_429;
    }
    if (!((life4_13 == null))) {
        forestValue900068_429_0 = ((spill900068_18) ? 1 : 0);
        break forest_join_429;
    }
    if (!(spill900068_18)) {
        break forest_join_428;
    }
    life23_466 += -1;
    if (!((life4_13 != null))) {
        continue forest_cycle_385;
    }
    break forest_cycle_385;
    }
    break forest_join_428;
    }
    forest_cycle_406: while (true) {
    forest_join_426: {
    if (!((forestValue900068_406_0 > 0))) {
        break forest_join_428;
    }
    spill900068_19 = ((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(((moom.DU)(life16_42)).a(((int)(life17_46)), ((int)((life23_466 - 1))), ((int)(life20_441))))));
    if (!((life4_13 == null))) {
        forestValue900068_429_0 = ((spill900068_19) ? 1 : 0);
        break forest_join_429;
    }
    if (!((life4_13 == null))) {
        forestValue900068_429_0 = ((spill900068_19) ? 1 : 0);
        break forest_join_429;
    }
    if (!(spill900068_19)) {
        break forest_join_428;
    }
    life23_466 += -1;
    if (!((life4_13 != null))) {
        break forest_join_426;
    }
    break forest_join_428;
    }
    spill900068_20 = life23_466;
    forestValue900068_406_0 = spill900068_20;
    continue forest_cycle_406;
    }
    }
    forestValue900068_429_0 = life15_38;
    }
    life24_551 = forestValue900068_429_0;
    forest_cycle_430: while (true) {
    forest_join_560: {
    forest_join_559: {
    forest_join_548: {
    forest_join_517: {
    forest_join_516: {
    if (!((life24_551 < (life15_38 + 2)))) {
        break forest_join_563;
    }
    life25_562 = (life24_551 % 2);
    life26_566 = (1 - life25_562);
    spill900068_21 = 0;
    if (!((life4_13 == null))) {
        forestValue900068_371_0 = spill900068_21;
        continue forest_cycle_371;
    }
    life27_571 = spill900068_21;
    forest_cycle_447: while (true) {
    forest_join_513: {
    forestValue900068_448_0 = life27_571;
    forest_cycle_448: while (true) {
    if (!((forestValue900068_448_0 < 4))) {
        break forest_join_516;
    }
    spill900068_22 = -1;
    if (!((life4_13 == null))) {
        forestValue900068_517_0 = spill900068_22;
        break forest_join_517;
    }
    life28_582 = spill900068_22;
    forest_cycle_454: while (true) {
    forest_join_510: {
    forest_join_507: {
    forest_join_500: {
    forest_join_499: {
    if (!((life28_582 < 4))) {
        break forest_join_513;
    }
    life29_595 = (life17_46 + ((life27_571 - 1) * life25_562));
    life30_599 = (life23_466 + life28_582);
    life31_607 = (life20_441 + ((life27_571 - 1) * life26_566));
    ((moom.DU)(life16_42)).a(((int)(life29_595)), ((int)(life30_599)), ((int)(life31_607)));
    spill900068_23 = life28_582;
    if (!((life4_13 == null))) {
        forestValue900068_448_0 = spill900068_23;
        continue forest_cycle_448;
    }
    if (!((life4_13 == null))) {
        forestValue900068_500_0 = spill900068_23;
        break forest_join_500;
    }
    if (!((spill900068_23 < 0))) {
        break forest_join_499;
    }
    spill900068_24 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(this.a)).a__fE(((moom.DT)(life16_42))))).a__ch())).a__fn())).b__Boolean();
    if (!((life4_13 == null))) {
        forestValue900068_500_0 = ((spill900068_24) ? 1 : 0);
        break forest_join_500;
    }
    if (!(spill900068_24)) {
        break forest_join_563;
    }
    }
    forestValue900068_500_0 = life28_582;
    }
    if (!((life4_13 == null))) {
        forestValue900068_507_0 = forestValue900068_500_0;
        break forest_join_507;
    }
    if (!((forestValue900068_500_0 >= 0))) {
        break forest_join_510;
    }
    forestValue900068_507_0 = ((((net.minecraft.world.WorldServer)(this.a)).a__Boolean(((moom.DT)(life16_42)))) ? 1 : 0);
    }
    if (!((forestValue900068_507_0 == 0))) {
        break forest_join_510;
    }
    if (!((life4_13 != null))) {
        break forest_join_563;
    }
    }
    life28_582 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_454;
    }
    break forest_cycle_454;
    }
    break forest_cycle_448;
    }
    }
    life27_571 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_447;
    }
    break forest_cycle_447;
    }
    }
    forestValue900068_517_0 = life23_466;
    }
    life27_674 = ((((double) forestValue900068_517_0) + 0x1.0p-1d) - ((net.minecraft.entity.Entity)(p0)).o);
    life29_686 = (((life18_434 * life18_434) + (life27_674 * life27_674)) + (life21_457 * life21_457));
    spill900068_25 = recovery.source.CarrierOps.dcmpg(((double)(life6_12)), ((double)(0x0.0p0d)));
    if (!((life4_13 == null))) {
        forestValue900068_559_0 = spill900068_25;
        break forest_join_559;
    }
    if (!((spill900068_25 >= 0))) {
        break forest_join_548;
    }
    spill900068_26 = recovery.source.CarrierOps.dcmpg(((double)(life29_686)), ((double)(life6_12)));
    if (!((life4_13 == null))) {
        forestValue900068_559_0 = spill900068_26;
        break forest_join_559;
    }
    if (!((spill900068_26 < 0))) {
        break forest_join_560;
    }
    }
    life6_12 = life29_686;
    life11_27 = life17_46;
    life12_29 = life23_466;
    life13_31 = life20_441;
    forestValue900068_559_0 = (life24_551 % 2);
    }
    life14_33 = forestValue900068_559_0;
    }
    life24_551 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_430;
    }
    break forest_cycle_430;
    }
    break forest_cycle_371;
    }
    }
    life23_466 += -1;
    if (!((life4_13 != null))) {
        continue forest_cycle_370;
    }
    break forest_cycle_370;
    }
    break forest_cycle_350;
    }
    }
    life20_441 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_349;
    }
    break forest_cycle_349;
    }
    break forest_cycle_331;
    }
    }
    life17_46 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_330;
    }
    break forest_cycle_330;
    }
    }
    life17_46 = life11_27;
    forestValue900068_575_0 = life12_29;
    }
    life18_740 = forestValue900068_575_0;
    life19_742 = life13_31;
    life20_746 = (life14_33 % 2);
    life21_750 = (1 - life20_746);
    spill900068_27 = (life14_33 % 4);
    if (!((life4_13 == null))) {
        forestValue900068_602_0 = spill900068_27;
        break forest_join_602;
    }
    if (!((spill900068_27 >= 2))) {
        break forest_join_599;
    }
    life20_746 = (-life20_746);
    life21_750 = (-life21_750);
    }
    forestValue900068_602_0 = recovery.source.CarrierOps.dcmpg(((double)(life6_12)), ((double)(0x0.0p0d)));
    }
    if (!((life4_13 == null))) {
        forestValue900068_625_0 = forestValue900068_602_0;
        break forest_join_625;
    }
    if (!((forestValue900068_602_0 < 0))) {
        break forest_join_705;
    }
    life12_794 = moom.Dr.a(((int)(life12_29)), ((int)(__sourceIntrinsic_376c3b2efa03_invokedynamic900068_77(1136, (1969346144015244438L ^ life2_3)))), ((int)((((net.minecraft.world.WorldServer)(this.a)).e() - __sourceIntrinsic_376c3b2efa03_invokedynamic900068_80(3704, (6500591799416444564L ^ life2_3))))));
    life18_740 = life12_794;
    forestValue900068_625_0 = -1;
    }
    life22_799 = forestValue900068_625_0;
    forest_cycle_626: while (true) {
    forest_join_702: {
    forestValue900068_627_0 = life22_799;
    forest_cycle_627: while (true) {
    if (!((forestValue900068_627_0 <= 1))) {
        break forest_join_705;
    }
    life23_807 = 1;
    forest_cycle_631: while (true) {
    forest_join_699: {
    forestValue900068_632_0 = life23_807;
    forest_cycle_632: while (true) {
    if (!((forestValue900068_632_0 < 3))) {
        break forest_join_702;
    }
    spill900068_28 = -1;
    if (!((life4_13 == null))) {
        forestValue900068_627_0 = spill900068_28;
        continue forest_cycle_627;
    }
    life24_818 = spill900068_28;
    forest_cycle_638: while (true) {
    forest_join_694: {
    forest_join_692: {
    forest_join_678: {
    forest_join_677: {
    forest_join_676: {
    if (!((life24_818 < 3))) {
        break forest_join_699;
    }
    life25_835 = ((life17_46 + ((life23_807 - 1) * life20_746)) + (life22_799 * life21_750));
    life26_839 = (life18_740 + life24_818);
    life27_851 = ((life19_742 + ((life23_807 - 1) * life21_750)) - (life22_799 * life20_746));
    spill900068_29 = life24_818;
    if (!((life4_13 == null))) {
        forestValue900068_632_0 = spill900068_29;
        continue forest_cycle_632;
    }
    if (!((life4_13 == null))) {
        forestValue900068_676_0 = spill900068_29;
        break forest_join_676;
    }
    if (!((spill900068_29 < 0))) {
        break forest_join_677;
    }
    forestValue900068_676_0 = 1;
    }
    forestValue900068_678_0 = forestValue900068_676_0;
    break forest_join_678;
    }
    forestValue900068_678_0 = 0;
    }
    life28_867 = forestValue900068_678_0;
    spill900068_30 = this.a;
    spill900068_31 = new moom.DT(life25_835, life26_839, life27_851);
    if (!((life28_867 != 0))) {
        forestValue900068_692_0 = spill900068_30;
        forestValue900068_692_1 = spill900068_31;
        break forest_join_692;
    }
    forestValue900068_694_0 = spill900068_30;
    forestValue900068_694_1 = spill900068_31;
    forestValue900068_694_2 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z)).a__fE();
    break forest_join_694;
    }
    forestValue900068_694_0 = forestValue900068_692_0;
    forestValue900068_694_1 = forestValue900068_692_1;
    forestValue900068_694_2 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    }
    ((net.minecraft.world.WorldServer)(forestValue900068_694_0)).a(((moom.DT)(forestValue900068_694_1)), ((net.minecraft.block.state.IBlockState)(forestValue900068_694_2)));
    life24_818 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_638;
    }
    break forest_cycle_638;
    }
    break forest_cycle_632;
    }
    }
    life23_807 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_631;
    }
    break forest_cycle_631;
    }
    break forest_cycle_627;
    }
    }
    life22_799 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_626;
    }
    break forest_cycle_626;
    }
    }
    spill900068_32 = ((moom.cr)(net.minecraft.init.Blocks.aY)).a__fE();
    spill900068_33 = moom.cr.R;
    if (!((life20_746 != 0))) {
        forestValue900068_712_0 = spill900068_32;
        forestValue900068_712_1 = spill900068_33;
        break forest_join_712;
    }
    forestValue900068_713_0 = spill900068_32;
    forestValue900068_713_1 = spill900068_33;
    forestValue900068_713_2 = net.minecraft.util.EnumFacing$Axis.X;
    break forest_join_713;
    }
    forestValue900068_713_0 = forestValue900068_712_0;
    forestValue900068_713_1 = forestValue900068_712_1;
    forestValue900068_713_2 = net.minecraft.util.EnumFacing$Axis.Z;
    }
    life22_910 = ((net.minecraft.block.state.IBlockState)(forestValue900068_713_0)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue900068_713_1)), ((java.lang.Comparable)(forestValue900068_713_2)));
    life23_912 = 0;
    forest_cycle_717: while (true) {
    forest_join_858: {
    forestValue900068_718_0 = life23_912;
    forest_cycle_718: while (true) {
    forest_join_803: {
    forest_join_802: {
    if (!((forestValue900068_718_0 < 4))) {
        break forest_join_861;
    }
    spill900068_34 = 0;
    if (!((life4_13 == null))) {
        forestValue900068_862_0 = spill900068_34;
        break forest_join_862;
    }
    life24_923 = spill900068_34;
    forest_cycle_724: while (true) {
    forest_join_799: {
    forestValue900068_725_0 = life24_923;
    forest_cycle_725: while (true) {
    if (!((forestValue900068_725_0 < 4))) {
        break forest_join_802;
    }
    spill900068_35 = -1;
    if (!((life4_13 == null))) {
        forestValue900068_803_0 = spill900068_35;
        break forest_join_803;
    }
    life25_934 = spill900068_35;
    forest_cycle_731: while (true) {
    forest_join_793: {
    forest_join_792: {
    forest_join_778: {
    forest_join_777: {
    forest_join_776: {
    forest_join_775: {
    if (!((life25_934 < 4))) {
        break forest_join_799;
    }
    life26_947 = (life17_46 + ((life24_923 - 1) * life20_746));
    life27_951 = (life18_740 + life25_934);
    life28_959 = (life19_742 + ((life24_923 - 1) * life21_750));
    spill900068_36 = life24_923;
    if (!((life4_13 == null))) {
        forestValue900068_725_0 = spill900068_36;
        continue forest_cycle_725;
    }
    if (!((life4_13 == null))) {
        forestValue900068_776_0 = spill900068_36;
        break forest_join_776;
    }
    if (!((spill900068_36 != 0))) {
        break forest_join_775;
    }
    spill900068_37 = life24_923;
    if (!((life4_13 == null))) {
        forestValue900068_776_0 = spill900068_37;
        break forest_join_776;
    }
    if (!((spill900068_37 != 3))) {
        break forest_join_775;
    }
    spill900068_38 = life25_934;
    if (!((life4_13 == null))) {
        forestValue900068_776_0 = spill900068_38;
        break forest_join_776;
    }
    if (!((spill900068_38 != -1))) {
        break forest_join_775;
    }
    spill900068_39 = life25_934;
    if (!((life4_13 == null))) {
        forestValue900068_776_0 = spill900068_39;
        break forest_join_776;
    }
    if (!((spill900068_39 == 3))) {
        break forest_join_777;
    }
    }
    forestValue900068_776_0 = 1;
    }
    forestValue900068_778_0 = forestValue900068_776_0;
    break forest_join_778;
    }
    forestValue900068_778_0 = 0;
    }
    life29_1002 = forestValue900068_778_0;
    spill900068_40 = this.a;
    spill900068_41 = new moom.DT(life26_947, life27_951, life28_959);
    if (!((life29_1002 != 0))) {
        forestValue900068_792_0 = spill900068_40;
        forestValue900068_792_1 = spill900068_41;
        break forest_join_792;
    }
    forestValue900068_793_0 = spill900068_40;
    forestValue900068_793_1 = spill900068_41;
    forestValue900068_793_2 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.Z)).a__fE();
    break forest_join_793;
    }
    forestValue900068_793_0 = forestValue900068_792_0;
    forestValue900068_793_1 = forestValue900068_792_1;
    forestValue900068_793_2 = life22_910;
    }
    ((net.minecraft.world.WorldServer)(forestValue900068_793_0)).a(((moom.DT)(forestValue900068_793_1)), ((net.minecraft.block.state.IBlockState)(forestValue900068_793_2)), ((int)(2)));
    life25_934 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_731;
    }
    break forest_cycle_731;
    }
    break forest_cycle_725;
    }
    }
    life24_923 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_724;
    }
    break forest_cycle_724;
    }
    }
    forestValue900068_803_0 = 0;
    }
    life24_1032 = forestValue900068_803_0;
    forest_cycle_804: while (true) {
    forest_join_856: {
    forest_join_855: {
    if (!((life24_1032 < 4))) {
        break forest_join_858;
    }
    spill900068_42 = -1;
    if (!((life4_13 == null))) {
        forestValue900068_718_0 = spill900068_42;
        continue forest_cycle_718;
    }
    life25_1042 = spill900068_42;
    forest_cycle_811: while (true) {
    if (!((life25_1042 < 4))) {
        break forest_join_855;
    }
    life26_1055 = (life17_46 + ((life24_1032 - 1) * life20_746));
    life27_1059 = (life18_740 + life25_1042);
    life28_1067 = (life19_742 + ((life24_1032 - 1) * life21_750));
    life29_1074 = new moom.DT(life26_1055, life27_1059, life28_1067);
    ((net.minecraft.world.WorldServer)(this.a)).b(((moom.DT)(life29_1074)), ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(this.a)).a__fE(((moom.DT)(life29_1074))))).a__ch())));
    life25_1042 += 1;
    if (!((life4_13 == null))) {
        break forest_join_856;
    }
    if (!((life4_13 != null))) {
        continue forest_cycle_811;
    }
    break forest_cycle_811;
    }
    }
    life24_1032 += 1;
    }
    if (!((life4_13 != null))) {
        continue forest_cycle_804;
    }
    break forest_cycle_804;
    }
    break forest_cycle_718;
    }
    }
    life23_912 += 1;
    if (!((life4_13 != null))) {
        continue forest_cycle_717;
    }
    break forest_cycle_717;
    }
    }
    forestValue900068_862_0 = 1;
    }
    return ((forestValue900068_862_0) != 0);
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5046;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Et", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Et.g[n2] = n4;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Et.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> long __sourceIntrinsic_e753b806269e_invokedynamic599_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_e753b806269e_invokedynamic599_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4398_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic900068_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic900068_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic900068_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c8fb418f5cf_invokedynamic247_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c8fb418f5cf_invokedynamic247_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4df89e99c096_invokedynamic2_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4df89e99c096_invokedynamic2_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4df89e99c096_invokedynamic2_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4df89e99c096_invokedynamic2_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4df89e99c096_invokedynamic2_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4df89e99c096_invokedynamic2_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4df89e99c096_invokedynamic2_107(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4396_0() throws E;
}
