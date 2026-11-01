package net.minecraft.stats;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class StatisticsFile extends moom.B2 {

private static org.apache.logging.log4j.Logger b;

private moom.Bl c;

private java.io.File d;

private java.util.Set<moom.BY> e;

private int f;

private boolean g;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public StatisticsFile(moom.Bl p0, java.io.File p1) { super(); }

private static void __sourceConstructorBody_3f61e5fbc22597ac(net.minecraft.stats.StatisticsFile receiver, moom.Bl p0, java.io.File p1) throws Throwable {
long local3 = (net.minecraft.stats.StatisticsFile.i ^ 115916564742920L);
    net.minecraft.stats.StatisticsFile.__sourceConstructorInit_3f61e5fbc22597ac_0(((net.minecraft.stats.StatisticsFile)(receiver)));
    ((net.minecraft.stats.StatisticsFile)(receiver)).e = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    ((net.minecraft.stats.StatisticsFile)(receiver)).f = ((int)(__sourceIntrinsic_3f61e5fbc22597ac_originalDynamicSite3965_4(12834, (2659008438849279817L ^ local3))));
    ((net.minecraft.stats.StatisticsFile)(receiver)).g = ((boolean)(false));
    ((net.minecraft.stats.StatisticsFile)(receiver)).c = ((moom.Bl)(p0));
    ((net.minecraft.stats.StatisticsFile)(receiver)).d = ((java.io.File)(p1));
    return;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-2610281547343272568L)), ((long)(-7157654339350461723L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212652436331070L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.stats.StatisticsFile.i ^ 7954501046947L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1208_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1208_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1208_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1208_14 = new byte[8];
    (__sourceSpill1208_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1208_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1208_16 = __sourceSpill1208_14;
    ((javax.crypto.Cipher)(__sourceSpill1208_11)).init(((int)(__sourceSpill1208_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1208_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1208_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "gr|ùw;%h\037\026Ù}½6\022á"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1208_25 = local6_life21;
        int __sourceSpill1208_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1208_25)).substring(((int)(__sourceSpill1208_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1208_30 = local8_life19;
        int __sourceSpill1208_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1208_33 = new byte[8];
        (__sourceSpill1208_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1208_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1208_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1208_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1208_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1208_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1208_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1208_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1208_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1208_34)).doFinal(((byte[])(__sourceSpill1208_33)));
        (__sourceSpill1208_30)[__sourceSpill1208_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
    b = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceConstructorInit_3f61e5fbc22597ac_0(net.minecraft.stats.StatisticsFile a0) throws E;
private static native <E extends Throwable> java.util.Map __sourceHandlerCall_7e78169c39bd465f5ffd(net.minecraft.stats.StatisticsFile a0, java.lang.String a1) throws E;
private static final class __SourceHandler_7e78169c39bd465f5ffd {

public static java.util.Map f1139(net.minecraft.stats.StatisticsFile receiver, java.lang.String p0) throws Throwable {
    com.google.gson.JsonElement forestValue1139_17_0;
    int forestValue1139_72_0;
    int forestValue1139_110_0;
    java.lang.Object forestValue1139_140_0;
    boolean spill1139_0;
    com.google.gson.JsonElement spill1139_1;
    boolean spill1139_2;
    boolean spill1139_3;
    com.google.gson.JsonElement spill1139_4;
    boolean spill1139_5;
    boolean spill1139_6;
    boolean spill1139_7;
    com.google.gson.JsonObject spill1139_8;
    java.lang.Class spill1139_9;
    long life2_3;
    com.google.gson.JsonElement life5_7;
    int life4_8;
    com.google.gson.JsonObject life6_22;
    java.util.HashMap life7_24;
    java.util.Iterator life8_28;
    java.util.Map.Entry life9_37;
    moom.BY life10_42;
    net.minecraft.util.TupleIntJsonSerializable life11_49;
    com.google.gson.JsonObject life12_97;
    java.lang.reflect.Constructor life13_160;
    net.minecraft.util.IJsonSerializable life14_166;
    forest_join_153: {
    forest_join_17: {
    forest_join_16: {
    life2_3 = (__fieldRead1139_0() ^ 33951353771317L);
    spill1139_0 = __call1139_1();
    life5_7 = __call1139_2(p0);
    life4_8 = __integerCategory1139_3(spill1139_0);
    spill1139_1 = life5_7;
    if (!((life4_8 == 0))) {
        forestValue1139_17_0 = spill1139_1;
        break forest_join_17;
    }
    if (!((!__call1139_4(spill1139_1)))) {
        break forest_join_16;
    }
    return __call1139_5();
    }
    forestValue1139_17_0 = life5_7;
    }
    life6_22 = __call1139_6(forestValue1139_17_0);
    life7_24 = __call1139_7();
    life8_28 = __call1139_9(__call1139_8(life6_22));
    forest_cycle_25: while (true) {
    forest_join_151: {
    forest_join_143: {
    forest_join_140: {
    forest_join_136: {
    forest_join_110: {
    forest_join_105: {
    forest_join_72: {
    forest_join_66: {
    if (!(__call1139_10(life8_28))) {
        break forest_join_153;
    }
    life9_37 = __cast1139_12(__call1139_11(life8_28));
    life10_42 = __call1139_15(__cast1139_14(__call1139_13(life9_37)));
    if (!((life10_42 != null))) {
        break forest_join_143;
    }
    life11_49 = new net.minecraft.util.TupleIntJsonSerializable();
    spill1139_2 = __call1139_18(__cast1139_17(__call1139_16(life9_37)));
    if (!((life4_8 == 0))) {
        forestValue1139_72_0 = __integerCategory1139_19(spill1139_2);
        break forest_join_72;
    }
    if (!(spill1139_2)) {
        break forest_join_66;
    }
    spill1139_3 = __call1139_23(__call1139_22(__cast1139_21(__call1139_20(life9_37))));
    if (!((life4_8 == 0))) {
        forestValue1139_72_0 = __integerCategory1139_24(spill1139_3);
        break forest_join_72;
    }
    if (!(spill1139_3)) {
        break forest_join_66;
    }
    __call1139_28(life11_49, __call1139_27(__cast1139_26(__call1139_25(life9_37))));
    if (!((life4_8 != 0))) {
        break forest_join_136;
    }
    }
    spill1139_4 = __cast1139_30(__call1139_29(life9_37));
    if (!((life4_8 == 0))) {
        forestValue1139_140_0 = spill1139_4;
        break forest_join_140;
    }
    forestValue1139_72_0 = __integerCategory1139_32(__call1139_31(spill1139_4));
    }
    if (!((forestValue1139_72_0 != 0))) {
        break forest_join_136;
    }
    life12_97 = __call1139_35(__cast1139_34(__call1139_33(life9_37)));
    spill1139_5 = __call1139_36(life12_97, "value");
    if (!((life4_8 == 0))) {
        forestValue1139_110_0 = __integerCategory1139_37(spill1139_5);
        break forest_join_110;
    }
    if (!(spill1139_5)) {
        break forest_join_105;
    }
    spill1139_6 = __call1139_39(__call1139_38(life12_97, "value"));
    if (!((life4_8 == 0))) {
        forestValue1139_110_0 = __integerCategory1139_40(spill1139_6);
        break forest_join_110;
    }
    if (!(spill1139_6)) {
        break forest_join_105;
    }
    spill1139_7 = __call1139_43(__call1139_42(__call1139_41(life12_97, "value")));
    if (!((life4_8 == 0))) {
        forestValue1139_110_0 = __integerCategory1139_44(spill1139_7);
        break forest_join_110;
    }
    if (!(spill1139_7)) {
        break forest_join_105;
    }
    __call1139_47(life11_49, __call1139_46(__call1139_45(life12_97, "value")));
    }
    spill1139_8 = life12_97;
    if (!((life4_8 == 0))) {
        forestValue1139_140_0 = spill1139_8;
        break forest_join_140;
    }
    forestValue1139_110_0 = __integerCategory1139_49(__call1139_48(spill1139_8, "progress"));
    }
    if (!((forestValue1139_110_0 != 0))) {
        break forest_join_136;
    }
    spill1139_9 = __call1139_50(life10_42);
    if (!((life4_8 == 0))) {
        forestValue1139_140_0 = spill1139_9;
        break forest_join_140;
    }
    if (!((spill1139_9 != null))) {
        break forest_join_136;
    }
    life13_160 = __call1139_52(__call1139_51(life10_42), new java.lang.Class[0]);
    life14_166 = __cast1139_54(__call1139_53(life13_160, new java.lang.Object[0]));
    __call1139_56(life14_166, __call1139_55(life12_97, "progress"));
    __call1139_57(life11_49, life14_166);
    }
    forestValue1139_140_0 = __call1139_58(life7_24, life10_42, life11_49);
    }
    __discardScalar1139_59(forestValue1139_140_0);
    if (!((life4_8 != 0))) {
        break forest_join_151;
    }
    }
    __call1139_65(__fieldRead1139_60(), __invokedynamic1139_64(__fieldRead1139_61(receiver), __cast1139_63(__call1139_62(life9_37))));
    }
    if (!((life4_8 != 0))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    }
    return life7_24;
}
public static java.util.Map h1139_0(java.lang.Throwable p0) throws Throwable {
    throw __call3113900_0(p0);
}
public static java.util.Map h1139_1(java.lang.Throwable p0) throws Throwable {
    throw __call3113901_0(p0);
}
public static java.util.Map h1139_2(java.lang.Throwable p0) throws Throwable {
    throw __call3113902_0(p0);
}
public static java.util.Map h1139_3(java.lang.Throwable p0) throws Throwable {
    throw __call3113903_0(p0);
}
public static java.util.Map h1139_4(java.lang.Throwable p0) throws Throwable {
    throw __call3113904_0(p0);
}
public static java.util.Map h1139_5(java.lang.Throwable p0) throws Throwable {
    throw __call3113905_0(p0);
}
public static java.util.Map h1139_6(java.lang.Throwable p0) throws Throwable {
    throw __call3113906_0(p0);
}
public static java.util.Map h1139_7(java.lang.Throwable p0) throws Throwable {
    throw __call3113907_0(p0);
}
public static java.util.Map h1139_8(java.lang.Throwable p0) throws Throwable {
    throw __call3113908_0(p0);
}
public static java.util.Map h1139_9(java.lang.Throwable p0) throws Throwable {
    throw __call3113909_0(p0);
}
public static java.util.Map h1139_10(java.lang.Throwable p0) throws Throwable {
    throw __call3113910_0(p0);
}
public static java.util.Map h1139_11(java.lang.Throwable p0) throws Throwable {
    throw __call3113911_0(p0);
}
public static java.util.Map h1139_12(java.lang.Throwable p0) throws Throwable {
    throw __call3113912_0(p0);
}
public static java.util.Map h1139_13(java.lang.Throwable p0) throws Throwable {
    throw __call3113913_0(p0);
}
public static java.util.Map h1139_14(java.lang.Throwable p0) throws Throwable {
    throw __call3113914_0(p0);
}
public static java.util.Map h1139_15(java.lang.Throwable p0) throws Throwable {
    throw __call3113915_0(p0);
}
public static java.util.Map h1139_16(java.lang.Throwable p0) throws Throwable {
    throw __call3113916_0(p0);
}
public static java.util.Map h1139_17(java.lang.Throwable p0, net.minecraft.stats.StatisticsFile p1, int p2, java.util.HashMap p3, java.util.Iterator p4, java.util.Map.Entry p5, moom.BY p6, net.minecraft.util.TupleIntJsonSerializable p7, com.google.gson.JsonObject p8, java.lang.reflect.Constructor p9, net.minecraft.util.IJsonSerializable p10) throws Throwable {
    java.lang.Object forestValue3113917_12_0;
    int forestValue3113917_101_0;
    int forestValue3113917_139_0;
    boolean spill3113917_0;
    boolean spill3113917_1;
    com.google.gson.JsonElement spill3113917_2;
    boolean spill3113917_3;
    boolean spill3113917_4;
    boolean spill3113917_5;
    com.google.gson.JsonObject spill3113917_6;
    java.lang.Class spill3113917_7;
    java.lang.Throwable life9_2;
    com.google.gson.JsonObject life8_127;
    java.lang.reflect.Constructor life9_190;
    net.minecraft.util.IJsonSerializable life10_196;
    forest_join_166: {
    life9_2 = p0;
    __call3113917_3(__fieldRead3113917_0(), __invokedynamic3113917_2(__fieldRead3113917_1(p1)), life9_2);
    forest_cycle_8: while (true) {
    forestValue3113917_12_0 = __call3113917_4(p3, p6, p7);
    forest_cycle_12: while (true) {
    forest_join_139: {
    forest_join_134: {
    forest_join_101: {
    forest_join_95: {
    forest_join_68: {
    forest_join_41: {
    __discardScalar3113917_5(forestValue3113917_12_0);
    if (!((p2 != 0))) {
        break forest_join_41;
    }
    forest_cycle_15: while (true) {
    forest_join_26: {
    __call3113917_11(__fieldRead3113917_6(), __invokedynamic3113917_10(__fieldRead3113917_7(p1), __cast3113917_9(__call3113917_8(p5))));
    if (!((p2 != 0))) {
        break forest_join_26;
    }
    break forest_join_166;
    }
    if (!(__call3113917_12(p4))) {
        break forest_join_166;
    }
    p5 = __cast3113917_14(__call3113917_13(p4));
    p6 = __call3113917_17(__cast3113917_16(__call3113917_15(p5)));
    if (!((p6 != null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    break forest_join_68;
    }
    forest_cycle_41: while (true) {
    forest_join_59: {
    forest_join_44: {
    if (!((p2 != 0))) {
        break forest_join_44;
    }
    break forest_join_166;
    }
    if (!(__call3113917_18(p4))) {
        break forest_join_166;
    }
    p5 = __cast3113917_20(__call3113917_19(p4));
    p6 = __call3113917_23(__cast3113917_22(__call3113917_21(p5)));
    if (!((p6 != null))) {
        break forest_join_59;
    }
    break forest_join_68;
    }
    __call3113917_29(__fieldRead3113917_24(), __invokedynamic3113917_28(__fieldRead3113917_25(p1), __cast3113917_27(__call3113917_26(p5))));
    continue forest_cycle_41;
    }
    }
    p7 = new net.minecraft.util.TupleIntJsonSerializable();
    spill3113917_0 = __call3113917_32(__cast3113917_31(__call3113917_30(p5)));
    if (!((p2 == 0))) {
        forestValue3113917_101_0 = __integerCategory3113917_33(spill3113917_0);
        break forest_join_101;
    }
    if (!(spill3113917_0)) {
        break forest_join_95;
    }
    spill3113917_1 = __call3113917_37(__call3113917_36(__cast3113917_35(__call3113917_34(p5))));
    if (!((p2 == 0))) {
        forestValue3113917_101_0 = __integerCategory3113917_38(spill3113917_1);
        break forest_join_101;
    }
    if (!(spill3113917_1)) {
        break forest_join_95;
    }
    __call3113917_42(p7, __call3113917_41(__cast3113917_40(__call3113917_39(p5))));
    if (!((p2 != 0))) {
        continue forest_cycle_8;
    }
    }
    spill3113917_2 = __cast3113917_44(__call3113917_43(p5));
    if (!((p2 == 0))) {
        forestValue3113917_12_0 = spill3113917_2;
        continue forest_cycle_12;
    }
    forestValue3113917_101_0 = __integerCategory3113917_46(__call3113917_45(spill3113917_2));
    }
    if (!((forestValue3113917_101_0 != 0))) {
        continue forest_cycle_8;
    }
    life8_127 = __call3113917_49(__cast3113917_48(__call3113917_47(p5)));
    spill3113917_3 = __call3113917_50(life8_127, "value");
    if (!((p2 == 0))) {
        forestValue3113917_139_0 = __integerCategory3113917_51(spill3113917_3);
        break forest_join_139;
    }
    if (!(spill3113917_3)) {
        break forest_join_134;
    }
    spill3113917_4 = __call3113917_53(__call3113917_52(life8_127, "value"));
    if (!((p2 == 0))) {
        forestValue3113917_139_0 = __integerCategory3113917_54(spill3113917_4);
        break forest_join_139;
    }
    if (!(spill3113917_4)) {
        break forest_join_134;
    }
    spill3113917_5 = __call3113917_57(__call3113917_56(__call3113917_55(life8_127, "value")));
    if (!((p2 == 0))) {
        forestValue3113917_139_0 = __integerCategory3113917_58(spill3113917_5);
        break forest_join_139;
    }
    if (!(spill3113917_5)) {
        break forest_join_134;
    }
    __call3113917_61(p7, __call3113917_60(__call3113917_59(life8_127, "value")));
    }
    spill3113917_6 = life8_127;
    if (!((p2 == 0))) {
        forestValue3113917_12_0 = spill3113917_6;
        continue forest_cycle_12;
    }
    forestValue3113917_139_0 = __integerCategory3113917_63(__call3113917_62(spill3113917_6, "progress"));
    }
    if (!((forestValue3113917_139_0 != 0))) {
        continue forest_cycle_8;
    }
    spill3113917_7 = __call3113917_64(p6);
    if (!((p2 == 0))) {
        forestValue3113917_12_0 = spill3113917_7;
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    if (!((spill3113917_7 != null))) {
        continue forest_cycle_8;
    }
    life9_190 = __call3113917_66(__call3113917_65(p6), new java.lang.Class[0]);
    life10_196 = __cast3113917_68(__call3113917_67(life9_190, new java.lang.Object[0]));
    __call3113917_70(life10_196, __call3113917_69(life8_127, "progress"));
    __call3113917_71(p7, life10_196);
    continue forest_cycle_8;
    }
    }
    return p3;
}
public static java.util.Map h1139_18(java.lang.Throwable p0) throws Throwable {
    throw __call3113918_0(p0);
}
private static native long __fieldRead1139_0() throws Throwable;
private static native boolean __call1139_1() throws Throwable;
private static native com.google.gson.JsonElement __call1139_2(java.lang.String a0) throws Throwable;
private static native int __integerCategory1139_3(boolean value) throws Throwable;
private static native boolean __call1139_4(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.HashMap __call1139_5() throws Throwable;
private static native com.google.gson.JsonObject __call1139_6(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.HashMap __call1139_7() throws Throwable;
private static native java.util.Set __call1139_8(com.google.gson.JsonObject a0) throws Throwable;
private static native java.util.Iterator __call1139_9(java.util.Set a0) throws Throwable;
private static native boolean __call1139_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1139_11(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast1139_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1139_13(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast1139_14(java.lang.Object a0) throws Throwable;
private static native moom.BY __call1139_15(java.lang.String a0) throws Throwable;
private static native java.lang.Object __call1139_16(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast1139_17(java.lang.Object a0) throws Throwable;
private static native boolean __call1139_18(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory1139_19(boolean value) throws Throwable;
private static native java.lang.Object __call1139_20(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast1139_21(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonPrimitive __call1139_22(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call1139_23(com.google.gson.JsonPrimitive a0) throws Throwable;
private static native int __integerCategory1139_24(boolean value) throws Throwable;
private static native java.lang.Object __call1139_25(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast1139_26(java.lang.Object a0) throws Throwable;
private static native int __call1139_27(com.google.gson.JsonElement a0) throws Throwable;
private static native void __call1139_28(net.minecraft.util.TupleIntJsonSerializable a0, int a1) throws Throwable;
private static native java.lang.Object __call1139_29(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast1139_30(java.lang.Object a0) throws Throwable;
private static native boolean __call1139_31(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory1139_32(boolean value) throws Throwable;
private static native java.lang.Object __call1139_33(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast1139_34(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonObject __call1139_35(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call1139_36(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1139_37(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call1139_38(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call1139_39(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory1139_40(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call1139_41(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonPrimitive __call1139_42(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call1139_43(com.google.gson.JsonPrimitive a0) throws Throwable;
private static native int __integerCategory1139_44(boolean value) throws Throwable;
private static native com.google.gson.JsonPrimitive __call1139_45(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call1139_46(com.google.gson.JsonPrimitive a0) throws Throwable;
private static native void __call1139_47(net.minecraft.util.TupleIntJsonSerializable a0, int a1) throws Throwable;
private static native boolean __call1139_48(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1139_49(boolean value) throws Throwable;
private static native java.lang.Class __call1139_50(moom.BY a0) throws Throwable;
private static native java.lang.Class __call1139_51(moom.BY a0) throws Throwable;
private static native java.lang.reflect.Constructor __call1139_52(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call1139_53(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.util.IJsonSerializable __cast1139_54(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonElement __call1139_55(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native void __call1139_56(net.minecraft.util.IJsonSerializable a0, com.google.gson.JsonElement a1) throws Throwable;
private static native void __call1139_57(net.minecraft.util.TupleIntJsonSerializable a0, net.minecraft.util.IJsonSerializable a1) throws Throwable;
private static native java.lang.Object __call1139_58(java.util.HashMap a0, moom.BY a1, net.minecraft.util.TupleIntJsonSerializable a2) throws Throwable;
private static native void __discardScalar1139_59(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1139_60() throws Throwable;
private static native java.io.File __fieldRead1139_61(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.Object __call1139_62(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast1139_63(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic1139_64(java.io.File a0, java.lang.String a1) throws Throwable;
private static native void __call1139_65(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3113900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113903_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113904_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113905_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113906_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113907_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113908_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113909_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113910_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113911_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113912_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113913_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113914_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113915_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3113916_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3113917_0() throws Throwable;
private static native java.io.File __fieldRead3113917_1(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.String __invokedynamic3113917_2(java.io.File a0) throws Throwable;
private static native void __call3113917_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native java.lang.Object __call3113917_4(java.util.HashMap a0, moom.BY a1, net.minecraft.util.TupleIntJsonSerializable a2) throws Throwable;
private static native void __discardScalar3113917_5(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3113917_6() throws Throwable;
private static native java.io.File __fieldRead3113917_7(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.Object __call3113917_8(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast3113917_9(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic3113917_10(java.io.File a0, java.lang.String a1) throws Throwable;
private static native void __call3113917_11(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call3113917_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3113917_13(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3113917_14(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3113917_15(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast3113917_16(java.lang.Object a0) throws Throwable;
private static native moom.BY __call3113917_17(java.lang.String a0) throws Throwable;
private static native boolean __call3113917_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3113917_19(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3113917_20(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3113917_21(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast3113917_22(java.lang.Object a0) throws Throwable;
private static native moom.BY __call3113917_23(java.lang.String a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3113917_24() throws Throwable;
private static native java.io.File __fieldRead3113917_25(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.Object __call3113917_26(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast3113917_27(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic3113917_28(java.io.File a0, java.lang.String a1) throws Throwable;
private static native void __call3113917_29(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call3113917_30(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast3113917_31(java.lang.Object a0) throws Throwable;
private static native boolean __call3113917_32(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory3113917_33(boolean value) throws Throwable;
private static native java.lang.Object __call3113917_34(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast3113917_35(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonPrimitive __call3113917_36(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call3113917_37(com.google.gson.JsonPrimitive a0) throws Throwable;
private static native int __integerCategory3113917_38(boolean value) throws Throwable;
private static native java.lang.Object __call3113917_39(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast3113917_40(java.lang.Object a0) throws Throwable;
private static native int __call3113917_41(com.google.gson.JsonElement a0) throws Throwable;
private static native void __call3113917_42(net.minecraft.util.TupleIntJsonSerializable a0, int a1) throws Throwable;
private static native java.lang.Object __call3113917_43(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast3113917_44(java.lang.Object a0) throws Throwable;
private static native boolean __call3113917_45(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory3113917_46(boolean value) throws Throwable;
private static native java.lang.Object __call3113917_47(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonElement __cast3113917_48(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonObject __call3113917_49(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call3113917_50(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3113917_51(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call3113917_52(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call3113917_53(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory3113917_54(boolean value) throws Throwable;
private static native com.google.gson.JsonElement __call3113917_55(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonPrimitive __call3113917_56(com.google.gson.JsonElement a0) throws Throwable;
private static native boolean __call3113917_57(com.google.gson.JsonPrimitive a0) throws Throwable;
private static native int __integerCategory3113917_58(boolean value) throws Throwable;
private static native com.google.gson.JsonPrimitive __call3113917_59(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call3113917_60(com.google.gson.JsonPrimitive a0) throws Throwable;
private static native void __call3113917_61(net.minecraft.util.TupleIntJsonSerializable a0, int a1) throws Throwable;
private static native boolean __call3113917_62(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3113917_63(boolean value) throws Throwable;
private static native java.lang.Class __call3113917_64(moom.BY a0) throws Throwable;
private static native java.lang.Class __call3113917_65(moom.BY a0) throws Throwable;
private static native java.lang.reflect.Constructor __call3113917_66(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call3113917_67(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.util.IJsonSerializable __cast3113917_68(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonElement __call3113917_69(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native void __call3113917_70(net.minecraft.util.IJsonSerializable a0, com.google.gson.JsonElement a1) throws Throwable;
private static native void __call3113917_71(net.minecraft.util.TupleIntJsonSerializable a0, net.minecraft.util.IJsonSerializable a1) throws Throwable;
private static native java.lang.Throwable __call3113918_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_174255eb5eacfd961b82(java.util.Map a0) throws E;
private static final class __SourceHandler_174255eb5eacfd961b82 {

public static java.lang.String f1140(java.util.Map p0) throws Throwable {
    boolean spill1140_0;
    long life1_3;
    com.google.gson.JsonObject life4_7;
    java.util.Iterator life5_12;
    int life3_13;
    java.util.Map.Entry life6_22;
    com.google.gson.JsonObject life7_32;
    forest_join_68: {
    life1_3 = (__fieldRead1140_0() ^ 39437408578182L);
    life4_7 = new com.google.gson.JsonObject();
    spill1140_0 = __call1140_1();
    life5_12 = __call1140_3(__call1140_2(p0));
    life3_13 = __integerCategory1140_4(spill1140_0);
    forest_cycle_14: while (true) {
    forest_join_66: {
    forest_join_55: {
    if (!(__call1140_5(life5_12))) {
        break forest_join_68;
    }
    life6_22 = __cast1140_7(__call1140_6(life5_12));
    if (!((__call1140_10(__cast1140_9(__call1140_8(life6_22))) != null))) {
        break forest_join_55;
    }
    life7_32 = new com.google.gson.JsonObject();
    __call1140_15(life7_32, "value", __call1140_14(__call1140_13(__cast1140_12(__call1140_11(life6_22)))));
    __call1140_20(life7_32, "progress", __call1140_19(__call1140_18(__cast1140_17(__call1140_16(life6_22)))));
    __call1140_24(life4_7, __fieldRead1140_23(__cast1140_22(__call1140_21(life6_22))), life7_32);
    if (!((life3_13 != 0))) {
        break forest_join_66;
    }
    }
    __call1140_32(life4_7, __fieldRead1140_27(__cast1140_26(__call1140_25(life6_22))), __call1140_31(__call1140_30(__cast1140_29(__call1140_28(life6_22)))));
    }
    if (!((life3_13 != 0))) {
        continue forest_cycle_14;
    }
    break forest_cycle_14;
    }
    }
    return __call1140_33(life4_7);
}
public static java.lang.String h1140_0(java.lang.Throwable p0, int p1, com.google.gson.JsonObject p2, java.util.Iterator p3, java.util.Map.Entry p4, com.google.gson.JsonObject p5) throws Throwable {
    java.lang.Throwable life6_2;
    forest_join_95: {
    life6_2 = p0;
    __call3114000_5(__fieldRead3114000_0(), __invokedynamic3114000_4(__call3114000_3(__cast3114000_2(__call3114000_1(p4)))), life6_2);
    forest_cycle_10: while (true) {
    forest_join_74: {
    forest_join_46: {
    __call3114000_9(p2, __fieldRead3114000_8(__cast3114000_7(__call3114000_6(p4))), p5);
    if (!((p1 != 0))) {
        break forest_join_46;
    }
    forest_cycle_19: while (true) {
    forest_join_33: {
    __call3114000_17(p2, __fieldRead3114000_12(__cast3114000_11(__call3114000_10(p4))), __call3114000_16(__call3114000_15(__cast3114000_14(__call3114000_13(p4)))));
    if (!((p1 != 0))) {
        break forest_join_33;
    }
    break forest_join_95;
    }
    if (!(__call3114000_18(p3))) {
        break forest_join_95;
    }
    p4 = __cast3114000_20(__call3114000_19(p3));
    if (!((__call3114000_23(__cast3114000_22(__call3114000_21(p4))) != null))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    break forest_join_74;
    }
    forest_cycle_46: while (true) {
    forest_join_62: {
    forest_join_49: {
    if (!((p1 != 0))) {
        break forest_join_49;
    }
    break forest_join_95;
    }
    if (!(__call3114000_24(p3))) {
        break forest_join_95;
    }
    p4 = __cast3114000_26(__call3114000_25(p3));
    if (!((__call3114000_29(__cast3114000_28(__call3114000_27(p4))) != null))) {
        break forest_join_62;
    }
    break forest_join_74;
    }
    __call3114000_37(p2, __fieldRead3114000_32(__cast3114000_31(__call3114000_30(p4))), __call3114000_36(__call3114000_35(__cast3114000_34(__call3114000_33(p4)))));
    continue forest_cycle_46;
    }
    }
    p5 = new com.google.gson.JsonObject();
    __call3114000_42(p5, "value", __call3114000_41(__call3114000_40(__cast3114000_39(__call3114000_38(p4)))));
    __call3114000_47(p5, "progress", __call3114000_46(__call3114000_45(__cast3114000_44(__call3114000_43(p4)))));
    continue forest_cycle_10;
    }
    }
    return __call3114000_48(p2);
}
public static java.lang.String h1140_1(java.lang.Throwable p0) throws Throwable {
    throw __call3114001_0(p0);
}
private static native long __fieldRead1140_0() throws Throwable;
private static native boolean __call1140_1() throws Throwable;
private static native java.util.Set __call1140_2(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1140_3(java.util.Set a0) throws Throwable;
private static native int __integerCategory1140_4(boolean value) throws Throwable;
private static native boolean __call1140_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1140_6(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast1140_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1140_8(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast1140_9(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IJsonSerializable __call1140_10(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native java.lang.Object __call1140_11(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast1140_12(java.lang.Object a0) throws Throwable;
private static native int __call1140_13(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native java.lang.Integer __call1140_14(int a0) throws Throwable;
private static native void __call1140_15(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Object __call1140_16(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast1140_17(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IJsonSerializable __call1140_18(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native com.google.gson.JsonElement __call1140_19(net.minecraft.util.IJsonSerializable a0) throws Throwable;
private static native void __call1140_20(com.google.gson.JsonObject a0, java.lang.String a1, com.google.gson.JsonElement a2) throws Throwable;
private static native java.lang.Object __call1140_21(java.util.Map.Entry a0) throws Throwable;
private static native moom.BY __cast1140_22(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1140_23(moom.BY a0) throws Throwable;
private static native void __call1140_24(com.google.gson.JsonObject a0, java.lang.String a1, com.google.gson.JsonObject a2) throws Throwable;
private static native java.lang.Object __call1140_25(java.util.Map.Entry a0) throws Throwable;
private static native moom.BY __cast1140_26(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead1140_27(moom.BY a0) throws Throwable;
private static native java.lang.Object __call1140_28(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast1140_29(java.lang.Object a0) throws Throwable;
private static native int __call1140_30(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native java.lang.Integer __call1140_31(int a0) throws Throwable;
private static native void __call1140_32(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String __call1140_33(com.google.gson.JsonObject a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3114000_0() throws Throwable;
private static native java.lang.Object __call3114000_1(java.util.Map.Entry a0) throws Throwable;
private static native moom.BY __cast3114000_2(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3114000_3(moom.BY a0) throws Throwable;
private static native java.lang.String __invokedynamic3114000_4(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __call3114000_5(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native java.lang.Object __call3114000_6(java.util.Map.Entry a0) throws Throwable;
private static native moom.BY __cast3114000_7(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead3114000_8(moom.BY a0) throws Throwable;
private static native void __call3114000_9(com.google.gson.JsonObject a0, java.lang.String a1, com.google.gson.JsonObject a2) throws Throwable;
private static native java.lang.Object __call3114000_10(java.util.Map.Entry a0) throws Throwable;
private static native moom.BY __cast3114000_11(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead3114000_12(moom.BY a0) throws Throwable;
private static native java.lang.Object __call3114000_13(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast3114000_14(java.lang.Object a0) throws Throwable;
private static native int __call3114000_15(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native java.lang.Integer __call3114000_16(int a0) throws Throwable;
private static native void __call3114000_17(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native boolean __call3114000_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3114000_19(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3114000_20(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3114000_21(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast3114000_22(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IJsonSerializable __call3114000_23(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native boolean __call3114000_24(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3114000_25(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3114000_26(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3114000_27(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast3114000_28(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IJsonSerializable __call3114000_29(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native java.lang.Object __call3114000_30(java.util.Map.Entry a0) throws Throwable;
private static native moom.BY __cast3114000_31(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead3114000_32(moom.BY a0) throws Throwable;
private static native java.lang.Object __call3114000_33(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast3114000_34(java.lang.Object a0) throws Throwable;
private static native int __call3114000_35(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native java.lang.Integer __call3114000_36(int a0) throws Throwable;
private static native void __call3114000_37(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Object __call3114000_38(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast3114000_39(java.lang.Object a0) throws Throwable;
private static native int __call3114000_40(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native java.lang.Integer __call3114000_41(int a0) throws Throwable;
private static native void __call3114000_42(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Object __call3114000_43(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.util.TupleIntJsonSerializable __cast3114000_44(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IJsonSerializable __call3114000_45(net.minecraft.util.TupleIntJsonSerializable a0) throws Throwable;
private static native com.google.gson.JsonElement __call3114000_46(net.minecraft.util.IJsonSerializable a0) throws Throwable;
private static native void __call3114000_47(com.google.gson.JsonObject a0, java.lang.String a1, com.google.gson.JsonElement a2) throws Throwable;
private static native java.lang.String __call3114000_48(com.google.gson.JsonObject a0) throws Throwable;
private static native java.lang.Throwable __call3114001_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_727687b8648bac1fca54(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayerMP a1) throws E;
private static final class __SourceHandler_727687b8648bac1fca54 {

public static void f1667(net.minecraft.stats.StatisticsFile receiver, net.minecraft.entity.player.EntityPlayerMP p0) throws Throwable {
    net.minecraft.stats.StatisticsFile lexicalValue1667_31_0;
    boolean spill1667_0;
    net.minecraft.stats.StatisticsFile spill1667_1;
    long life2_3;
    int life5_7;
    java.util.HashMap life6_10;
    int life4_11;
    java.util.Iterator life7_42;
    moom.BY life8_49;
    lexical_join_60: {
    lexical_join_53: {
    lexical_join_31: {
    lexical_join_27: {
    life2_3 = (__fieldRead1667_0() ^ 106959525863042L);
    life5_7 = __call1667_2(__fieldRead1667_1(receiver));
    spill1667_0 = __call1667_3();
    life6_10 = __call1667_4();
    life4_11 = __integerCategory1667_5(spill1667_0);
    spill1667_1 = receiver;
    if (!((life4_11 != 0))) {
        lexicalValue1667_31_0 = spill1667_1;
        break lexical_join_31;
    }
    if (!((!__fieldRead1667_6(spill1667_1)))) {
        break lexical_join_27;
    }
    if (!(((life5_7 - __fieldRead1667_7(receiver)) > __invokedynamic1667_8(1523, (8031196113132928275L ^ life2_3))))) {
        break lexical_join_53;
    }
    }
    __fieldWrite1667_9(receiver, life5_7);
    lexicalValue1667_31_0 = receiver;
    }
    life7_42 = __call1667_11(__call1667_10(lexicalValue1667_31_0));
    lexical_cycle_34: while (true) {
    if (!(__call1667_12(life7_42))) {
        break lexical_join_53;
    }
    life8_49 = __cast1667_14(__call1667_13(life7_42));
    __call1667_17(life6_10, life8_49, __call1667_16(__call1667_15(receiver, life8_49)));
    if (!((life4_11 != 0))) {
        break lexical_join_60;
    }
    if (!((life4_11 == 0))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    __call1667_19(__fieldRead1667_18(p0), new moom.Ao(life6_10));
    }
    return;
}
public static void h1667_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166700_0(p0);
}
public static void h1667_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166701_0(p0);
}
public static void h1667_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166702_0(p0);
}
public static void h1667_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166703_0(p0);
}
private static native long __fieldRead1667_0() throws Throwable;
private static native moom.Bl __fieldRead1667_1(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native int __call1667_2(moom.Bl a0) throws Throwable;
private static native boolean __call1667_3() throws Throwable;
private static native java.util.HashMap __call1667_4() throws Throwable;
private static native int __integerCategory1667_5(boolean value) throws Throwable;
private static native boolean __fieldRead1667_6(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native int __fieldRead1667_7(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native int __invokedynamic1667_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite1667_9(net.minecraft.stats.StatisticsFile a0, int a1) throws Throwable;
private static native java.util.Set __call1667_10(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.util.Iterator __call1667_11(java.util.Set a0) throws Throwable;
private static native boolean __call1667_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1667_13(java.util.Iterator a0) throws Throwable;
private static native moom.BY __cast1667_14(java.lang.Object a0) throws Throwable;
private static native int __call1667_15(net.minecraft.stats.StatisticsFile a0, moom.BY a1) throws Throwable;
private static native java.lang.Integer __call1667_16(int a0) throws Throwable;
private static native java.lang.Object __call1667_17(java.util.HashMap a0, moom.BY a1, java.lang.Integer a2) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1667_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1667_19(net.minecraft.network.NetHandlerPlayServer a0, moom.Ao a1) throws Throwable;
private static native java.lang.Throwable __call1166700_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166701_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166702_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166703_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_890c7ecc0852bff9b4b6(net.minecraft.stats.StatisticsFile a0) throws E;
private static final class __SourceHandler_890c7ecc0852bff9b4b6 {

public static void f706(net.minecraft.stats.StatisticsFile receiver) throws Throwable {
    net.minecraft.stats.StatisticsFile forestValue706_16_0;
    net.minecraft.stats.StatisticsFile spill706_0;
    long life1_3;
    int life3_5;
    forest_join_23: {
    forest_join_16: {
    life1_3 = (__fieldRead706_0() ^ 27407123738038L);
    life3_5 = __integerCategory706_2(__call706_1());
    spill706_0 = receiver;
    if (!((life3_5 != 0))) {
        forestValue706_16_0 = spill706_0;
        break forest_join_16;
    }
    if (!(__call706_4(__fieldRead706_3(spill706_0)))) {
        break forest_join_23;
    }
    __call706_6(__fieldRead706_5(receiver));
    forestValue706_16_0 = receiver;
    }
    __call706_11(__fieldRead706_7(forestValue706_16_0), __call706_10(receiver, __call706_9(__fieldRead706_8(receiver))));
    }
    return;
}
public static void h706_0(java.io.IOException p0) throws Throwable {
    throw __call3070600_0(p0);
}
public static void h706_1(java.io.IOException p0, net.minecraft.stats.StatisticsFile p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    __call3070601_3(__fieldRead3070601_0(), __invokedynamic3070601_2(__fieldRead3070601_1(p1)), life2_2);
    return;
}
public static void h706_2(com.google.gson.JsonParseException p0, net.minecraft.stats.StatisticsFile p1) throws Throwable {
    com.google.gson.JsonParseException life2_2;
    life2_2 = p0;
    __call3070602_3(__fieldRead3070602_0(), __invokedynamic3070602_2(__fieldRead3070602_1(p1)), life2_2);
    return;
}
private static native long __fieldRead706_0() throws Throwable;
private static native boolean __call706_1() throws Throwable;
private static native int __integerCategory706_2(boolean value) throws Throwable;
private static native java.io.File __fieldRead706_3(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native boolean __call706_4(java.io.File a0) throws Throwable;
private static native java.util.Map __fieldRead706_5(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native void __call706_6(java.util.Map a0) throws Throwable;
private static native java.util.Map __fieldRead706_7(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.io.File __fieldRead706_8(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.String __call706_9(java.io.File a0) throws Throwable;
private static native java.util.Map __call706_10(net.minecraft.stats.StatisticsFile a0, java.lang.String a1) throws Throwable;
private static native void __call706_11(java.util.Map a0, java.util.Map a1) throws Throwable;
private static native java.lang.Throwable __call3070600_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3070601_0() throws Throwable;
private static native java.io.File __fieldRead3070601_1(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.String __invokedynamic3070601_2(java.io.File a0) throws Throwable;
private static native void __call3070601_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3070602_0() throws Throwable;
private static native java.io.File __fieldRead3070602_1(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.String __invokedynamic3070602_2(java.io.File a0) throws Throwable;
private static native void __call3070602_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, com.google.gson.JsonParseException a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0175aca762d09a9a5233(net.minecraft.stats.StatisticsFile a0) throws E;
private static final class __SourceHandler_0175aca762d09a9a5233 {

public static void f707(net.minecraft.stats.StatisticsFile receiver) throws Throwable {
    __call707_3(__fieldRead707_0(receiver), __call707_2(__fieldRead707_1(receiver)));
    return;
}
public static void h707_0(java.io.IOException p0) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3070700_1(__fieldRead3070700_0(), "Couldn't save stats", life1_2);
    return;
}
private static native java.io.File __fieldRead707_0(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.util.Map __fieldRead707_1(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native java.lang.String __call707_2(java.util.Map a0) throws Throwable;
private static native void __call707_3(java.io.File a0, java.lang.String a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3070700_0() throws Throwable;
private static native void __call3070700_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2f407e4970394dcf1251(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayer a1, moom.BY a2, int a3) throws E;
private static final class __SourceHandler_2f407e4970394dcf1251 {

public static void f1668(net.minecraft.stats.StatisticsFile receiver, net.minecraft.entity.player.EntityPlayer p0, moom.BY p1, int p2) throws Throwable {
    int forwardValue1668_14_0;
    int forwardValue1668_16_0;
    int forwardValue1668_71_0;
    int forwardValue1668_75_0;
    int forwardValue1668_79_0;
    int forwardValue1668_90_0;
    moom.Bl forwardValue1668_93_0;
    boolean spill1668_0;
    boolean spill1668_1;
    int spill1668_2;
    int spill1668_3;
    boolean spill1668_4;
    moom.Bl spill1668_5;
    long life4_3;
    int life6_5;
    int life7_22;
    forward_join_116: {
    forward_join_111: {
    forward_join_93: {
    forward_join_90: {
    forward_join_79: {
    forward_join_75: {
    forward_join_71: {
    forward_join_69: {
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life4_3 = (__fieldRead1668_0() ^ 124391585680880L);
    life6_5 = __integerCategory1668_2(__call1668_1());
    spill1668_0 = __call1668_3(p1);
    if (!((life6_5 != 0))) {
        forwardValue1668_14_0 = __integerCategory1668_4(spill1668_0);
        break forward_join_14;
    }
    if (!(spill1668_0)) {
        break forward_join_15;
    }
    forwardValue1668_14_0 = __call1668_5(receiver, p1);
    }
    forwardValue1668_16_0 = forwardValue1668_14_0;
    break forward_join_16;
    }
    forwardValue1668_16_0 = 0;
    }
    life7_22 = forwardValue1668_16_0;
    __call1668_6(receiver, p0, p1, p2);
    __call1668_8(__fieldRead1668_7(receiver), p1);
    spill1668_1 = __call1668_9(p1);
    if (!((life6_5 != 0))) {
        forwardValue1668_71_0 = __integerCategory1668_10(spill1668_1);
        break forward_join_71;
    }
    if (!(spill1668_1)) {
        break forward_join_69;
    }
    spill1668_2 = life7_22;
    if (!((life6_5 != 0))) {
        forwardValue1668_71_0 = spill1668_2;
        break forward_join_71;
    }
    if (!((spill1668_2 == 0))) {
        break forward_join_69;
    }
    spill1668_3 = p2;
    if (!((life6_5 != 0))) {
        forwardValue1668_71_0 = spill1668_3;
        break forward_join_71;
    }
    if (!((spill1668_3 > 0))) {
        break forward_join_69;
    }
    __fieldWrite1668_11(receiver, 1);
    spill1668_4 = __call1668_13(__fieldRead1668_12(receiver));
    if (!((life6_5 != 0))) {
        forwardValue1668_71_0 = __integerCategory1668_14(spill1668_4);
        break forward_join_71;
    }
    if (!(spill1668_4)) {
        break forward_join_69;
    }
    __call1668_19(__call1668_16(__fieldRead1668_15(receiver)), new moom.CN("chat.type.achievement", new java.lang.Object[] {__call1668_17(p0), __call1668_18(p1)}));
    }
    forwardValue1668_71_0 = __integerCategory1668_21(__call1668_20(p1));
    }
    if (!((life6_5 != 0))) {
        forwardValue1668_75_0 = forwardValue1668_71_0;
        break forward_join_75;
    }
    if (!((forwardValue1668_71_0 != 0))) {
        break forward_join_111;
    }
    forwardValue1668_75_0 = life7_22;
    }
    if (!((life6_5 != 0))) {
        forwardValue1668_79_0 = forwardValue1668_75_0;
        break forward_join_79;
    }
    if (!((forwardValue1668_75_0 > 0))) {
        break forward_join_111;
    }
    forwardValue1668_79_0 = p2;
    }
    if (!((life6_5 != 0))) {
        forwardValue1668_90_0 = forwardValue1668_79_0;
        break forward_join_90;
    }
    if (!((forwardValue1668_79_0 == 0))) {
        break forward_join_111;
    }
    __fieldWrite1668_22(receiver, 1);
    spill1668_5 = __fieldRead1668_23(receiver);
    if (!((life6_5 != 0))) {
        forwardValue1668_93_0 = spill1668_5;
        break forward_join_93;
    }
    forwardValue1668_90_0 = __integerCategory1668_25(__call1668_24(spill1668_5));
    }
    if (!((forwardValue1668_90_0 != 0))) {
        break forward_join_111;
    }
    forwardValue1668_93_0 = __fieldRead1668_26(receiver);
    }
    __call1668_30(__call1668_27(forwardValue1668_93_0), new moom.CN("chat.type.achievement.taken", new java.lang.Object[] {__call1668_28(p0), __call1668_29(p1)}));
    }
    if (!((life6_5 == 0))) {
        break forward_join_116;
    }
    __call1668_31(new java.lang.String[2]);
    }
    return;
}
public static void h1668_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166800_0(p0);
}
public static void h1668_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166801_0(p0);
}
public static void h1668_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166802_0(p0);
}
public static void h1668_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166803_0(p0);
}
public static void h1668_4(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166804_0(p0);
}
public static void h1668_5(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166805_0(p0);
}
public static void h1668_6(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166806_0(p0);
}
public static void h1668_7(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166807_0(p0);
}
public static void h1668_8(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166808_0(p0);
}
public static void h1668_9(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166809_0(p0);
}
public static void h1668_10(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166810_0(p0);
}
public static void h1668_11(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166811_0(p0);
}
public static void h1668_12(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166812_0(p0);
}
public static void h1668_13(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166813_0(p0);
}
public static void h1668_14(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166814_0(p0);
}
public static void h1668_15(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166815_0(p0);
}
public static void h1668_16(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1166816_0(p0);
}
private static native long __fieldRead1668_0() throws Throwable;
private static native boolean __call1668_1() throws Throwable;
private static native int __integerCategory1668_2(boolean value) throws Throwable;
private static native boolean __call1668_3(moom.BY a0) throws Throwable;
private static native int __integerCategory1668_4(boolean value) throws Throwable;
private static native int __call1668_5(net.minecraft.stats.StatisticsFile a0, moom.BY a1) throws Throwable;
private static native void __call1668_6(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayer a1, moom.BY a2, int a3) throws Throwable;
private static native java.util.Set __fieldRead1668_7(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native boolean __call1668_8(java.util.Set a0, moom.BY a1) throws Throwable;
private static native boolean __call1668_9(moom.BY a0) throws Throwable;
private static native int __integerCategory1668_10(boolean value) throws Throwable;
private static native void __fieldWrite1668_11(net.minecraft.stats.StatisticsFile a0, int a1) throws Throwable;
private static native moom.Bl __fieldRead1668_12(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native boolean __call1668_13(moom.Bl a0) throws Throwable;
private static native int __integerCategory1668_14(boolean value) throws Throwable;
private static native moom.Bl __fieldRead1668_15(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1668_16(moom.Bl a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1668_17(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1668_18(moom.BY a0) throws Throwable;
private static native void __call1668_19(net.minecraft.server.management.ServerConfigurationManager a0, moom.CN a1) throws Throwable;
private static native boolean __call1668_20(moom.BY a0) throws Throwable;
private static native int __integerCategory1668_21(boolean value) throws Throwable;
private static native void __fieldWrite1668_22(net.minecraft.stats.StatisticsFile a0, int a1) throws Throwable;
private static native moom.Bl __fieldRead1668_23(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native boolean __call1668_24(moom.Bl a0) throws Throwable;
private static native int __integerCategory1668_25(boolean value) throws Throwable;
private static native moom.Bl __fieldRead1668_26(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1668_27(moom.Bl a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1668_28(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1668_29(moom.BY a0) throws Throwable;
private static native void __call1668_30(net.minecraft.server.management.ServerConfigurationManager a0, moom.CN a1) throws Throwable;
private static native void __call1668_31(java.lang.String[] a0) throws Throwable;
private static native java.lang.Throwable __call1166800_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166801_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166802_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166803_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166804_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166805_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166806_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166807_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166808_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166809_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166810_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166811_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166812_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166813_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166814_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166815_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1166816_0(com.google.gson.JsonParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_50ff191fa863af873096(net.minecraft.stats.StatisticsFile a0, net.minecraft.entity.player.EntityPlayerMP a1) throws E;
private static final class __SourceHandler_50ff191fa863af873096 {

public static void f273(net.minecraft.stats.StatisticsFile receiver, net.minecraft.entity.player.EntityPlayerMP p0) throws Throwable {
    int lexicalValue273_38_0;
    boolean spill273_0;
    boolean spill273_1;
    long life2_3;
    java.util.HashMap life5_6;
    int life4_7;
    java.util.Iterator life6_10;
    moom.BZ life7_17;
    lexical_join_48: {
    lexical_join_41: {
    life2_3 = (__fieldRead273_0() ^ 29434444435762L);
    spill273_0 = __call273_1();
    life5_6 = __call273_2();
    life4_7 = __integerCategory273_3(spill273_0);
    life6_10 = __call273_5(__fieldRead273_4());
    lexical_cycle_11: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!(__call273_6(life6_10))) {
        break lexical_join_41;
    }
    life7_17 = __cast273_8(__call273_7(life6_10));
    if (!((life4_7 == 0))) {
        break lexical_join_48;
    }
    spill273_1 = __call273_9(receiver, life7_17);
    if (!((life4_7 == 0))) {
        lexicalValue273_38_0 = __integerCategory273_10(spill273_1);
        break lexical_join_38;
    }
    if (!(spill273_1)) {
        break lexical_join_39;
    }
    __call273_13(life5_6, life7_17, __call273_12(__call273_11(receiver, life7_17)));
    lexicalValue273_38_0 = __integerCategory273_16(__call273_15(__fieldRead273_14(receiver), life7_17));
    }
    __discardScalar273_17(lexicalValue273_38_0);
    }
    if (!((life4_7 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    __call273_19(__fieldRead273_18(p0), new moom.Ao(life5_6));
    }
    return;
}
public static void h273_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1027300_0(p0);
}
public static void h273_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1027301_0(p0);
}
public static void h273_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call1027302_0(p0);
}
private static native long __fieldRead273_0() throws Throwable;
private static native boolean __call273_1() throws Throwable;
private static native java.util.HashMap __call273_2() throws Throwable;
private static native int __integerCategory273_3(boolean value) throws Throwable;
private static native java.util.List __fieldRead273_4() throws Throwable;
private static native java.util.Iterator __call273_5(java.util.List a0) throws Throwable;
private static native boolean __call273_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call273_7(java.util.Iterator a0) throws Throwable;
private static native moom.BZ __cast273_8(java.lang.Object a0) throws Throwable;
private static native boolean __call273_9(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory273_10(boolean value) throws Throwable;
private static native int __call273_11(net.minecraft.stats.StatisticsFile a0, moom.BZ a1) throws Throwable;
private static native java.lang.Integer __call273_12(int a0) throws Throwable;
private static native java.lang.Object __call273_13(java.util.HashMap a0, moom.BZ a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Set __fieldRead273_14(net.minecraft.stats.StatisticsFile a0) throws Throwable;
private static native boolean __call273_15(java.util.Set a0, moom.BZ a1) throws Throwable;
private static native int __integerCategory273_16(boolean value) throws Throwable;
private static native void __discardScalar273_17(int a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead273_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call273_19(net.minecraft.network.NetHandlerPlayServer a0, moom.Ao a1) throws Throwable;
private static native java.lang.Throwable __call1027300_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1027301_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native java.lang.Throwable __call1027302_0(com.google.gson.JsonParseException a0) throws Throwable;

}


public void b(net.minecraft.entity.player.EntityPlayer p0, moom.BY p1, int p2) { __sourceHandlerCall_2f407e4970394dcf1251(this, p0, p1, p2); }


public void b(net.minecraft.entity.player.EntityPlayerMP p0) { __sourceHandlerCall_50ff191fa863af873096(this, p0); }


public void b() { __sourceHandlerCall_0175aca762d09a9a5233(this); }


public void c() {
((java.util.Set)(this.e)).addAll(((java.util.Collection)(((java.util.Map)(this.a)).keySet())));
    return;
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12222_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/B3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_e54a0a7a5400f4(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28293;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/B3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public void a__Void() { __sourceHandlerCall_890c7ecc0852bff9b4b6(this); }


public java.util.Set<moom.BY> a() {
java.lang.Object local1 = com.google.common.collect.Sets.newHashSet(((java.lang.Iterable)(this.e)));
    ((java.util.Set)(this.e)).clear();
    this.g = ((boolean)(false));
    return ((java.util.Set<moom.BY>)(local1));
}


public java.util.Map<moom.BY, net.minecraft.util.TupleIntJsonSerializable> a(java.lang.String p0) { return __sourceHandlerCall_7e78169c39bd465f5ffd(this, p0); }


public static java.lang.String a(java.util.Map<moom.BY, net.minecraft.util.TupleIntJsonSerializable> p0) { return __sourceHandlerCall_174255eb5eacfd961b82(p0); }


public void a(net.minecraft.entity.player.EntityPlayerMP p0) { __sourceHandlerCall_727687b8648bac1fca54(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_3f61e5fbc22597ac_originalDynamicSite3965_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12222_0() throws E;

private static native int __sourceExactCall_e54a0a7a5400f4(int p0, long p1);
}
