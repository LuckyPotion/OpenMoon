package net.minecraft.client.audio;


public class SoundManager {

private static org.apache.logging.log4j.Marker a;

private static org.apache.logging.log4j.Logger b;

private net.minecraft.client.audio.SoundHandler c;

private net.minecraft.client.settings.GameSettings d;

private moom.OM e;

private boolean f;

private int g;

private java.util.Map<java.lang.String, net.minecraft.client.audio.ISound> h;

private java.util.Map<net.minecraft.client.audio.ISound, java.lang.String> i;

private java.util.Map<net.minecraft.client.audio.ISound, net.minecraft.client.audio.SoundPoolEntry> j;

private com.google.common.collect.Multimap<net.minecraft.client.audio.SoundCategory, java.lang.String> k;

private java.util.List<net.minecraft.client.audio.ITickableSound> l;

private java.util.Map<net.minecraft.client.audio.ISound, java.lang.Integer> m;

private java.util.Map<java.lang.String, java.lang.Integer> n;

private static long o;

private static long p;

public SoundManager(net.minecraft.client.audio.SoundHandler p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.g = ((int)(0));
    this.h = ((java.util.Map)(com.google.common.collect.HashBiMap.create()));
    this.i = ((java.util.Map)(((com.google.common.collect.BiMap)(((com.google.common.collect.BiMap)(this.h)))).inverse()));
    this.j = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    this.k = ((com.google.common.collect.Multimap)(com.google.common.collect.HashMultimap.create()));
    this.l = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    this.m = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    this.n = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    this.c = ((net.minecraft.client.audio.SoundHandler)(p0));
    this.d = ((net.minecraft.client.settings.GameSettings)(p1));
    try {
        paulscode.sound.SoundSystemConfig.addLibrary(((java.lang.Class)(paulscode.sound.libraries.LibraryLWJGLOpenAL.class)));
        paulscode.sound.SoundSystemConfig.setCodec(((java.lang.String)("ogg")), ((java.lang.Class)(paulscode.sound.codecs.CodecJOrbis.class)));
    } catch (paulscode.sound.SoundSystemException caught3) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).error(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Error linking with the LibraryJavaSound plug-in")), ((java.lang.Throwable)(caught3)));
    }
    return;
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(5418981028249000965L)), ((long)(1620650143652301136L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(142880766639826L)))));
    long local0_life6 = (net.minecraft.client.audio.SoundManager.o ^ 52627243176524L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1162_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1162_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1162_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1162_13 = new byte[8];
    (__sourceSpill1162_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1162_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1162_15 = __sourceSpill1162_13;
    ((javax.crypto.Cipher)(__sourceSpill1162_10)).init(((int)(__sourceSpill1162_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1162_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1162_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7913240549698209575L;
    byte[] __sourceSpill1162_19 = new byte[8];
    (__sourceSpill1162_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1162_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1162_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1162_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1162_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1162_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1162_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1162_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1162_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1162_20)).doFinal(((byte[])(__sourceSpill1162_19)));
    p = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Marker)(org.apache.logging.log4j.MarkerManager.getMarker(((java.lang.String)("SOUNDS")))));
    b = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_37e65a2dca87b0d1550c(net.minecraft.client.audio.SoundManager a0) throws E;
private static final class __SourceHandler_37e65a2dca87b0d1550c {

public static void f216(net.minecraft.client.audio.SoundManager receiver) throws Throwable {
    long life1_3;
    java.lang.String life3_5;
    life1_3 = (__fieldRead216_0() ^ 53946096528456L);
    life3_5 = __call216_1();
    if ((life3_5 == null)) {
        if ((!__fieldRead216_2(receiver))) {
        __call216_4(new java.lang.Thread(__invokedynamic216_3(receiver), "Sound Library Loader"));
    }
    }
    return;
}
public static void h216_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call2021600_0(p0);
}
public static void h216_1(java.lang.RuntimeException p0, net.minecraft.client.audio.SoundManager p1) throws Throwable {
    java.lang.RuntimeException local2 = p0;
    __call2021601_2(__fieldRead2021601_0(), __fieldRead2021601_1(), "Error starting SoundSystem. Turning off sounds & music", local2);
    __call2021601_5(__fieldRead2021601_3(p1), __fieldRead2021601_4(), 0x0.0p0f);
    __call2021601_7(__fieldRead2021601_6(p1));
    return;
}
private static native long __fieldRead216_0() throws Throwable;
private static native java.lang.String __call216_1() throws Throwable;
private static native boolean __fieldRead216_2(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic216_3(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native void __call216_4(java.lang.Thread a0) throws Throwable;
private static native java.lang.RuntimeException __call2021600_0(java.lang.RuntimeException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2021601_0() throws Throwable;
private static native org.apache.logging.log4j.Marker __fieldRead2021601_1() throws Throwable;
private static native void __call2021601_2(org.apache.logging.log4j.Logger a0, org.apache.logging.log4j.Marker a1, java.lang.String a2, java.lang.RuntimeException a3) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2021601_3(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __fieldRead2021601_4() throws Throwable;
private static native void __call2021601_5(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.audio.SoundCategory a1, float a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2021601_6(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native void __call2021601_7(net.minecraft.client.settings.GameSettings a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_059e0c88d98dcbe1152b(net.minecraft.client.audio.SoundManager a0) throws E;
private static final class __SourceHandler_059e0c88d98dcbe1152b {

public static void f974(net.minecraft.client.audio.SoundManager receiver) throws Throwable {
    java.lang.Object forestValue974_41_0;
    int forestValue974_120_0;
    int forestValue974_129_0;
    int forestValue974_185_0;
    int forestValue974_195_0;
    int forestValue974_199_0;
    int forestValue974_227_0;
    int forestValue974_236_0;
    int forestValue974_292_0;
    int forestValue974_302_0;
    net.minecraft.client.audio.SoundManager forestValue974_310_0;
    java.lang.Object forestValue974_332_0;
    java.lang.String spill974_0;
    net.minecraft.client.audio.ITickableSound spill974_1;
    boolean spill974_2;
    net.minecraft.client.audio.SoundManager spill974_3;
    boolean spill974_4;
    int spill974_5;
    boolean spill974_6;
    int spill974_7;
    org.apache.logging.log4j.Logger spill974_8;
    org.apache.logging.log4j.Marker spill974_9;
    java.lang.String spill974_10;
    java.lang.Object[] spill974_11;
    int spill974_12;
    net.minecraft.client.audio.SoundManager spill974_13;
    boolean spill974_14;
    int spill974_15;
    boolean spill974_16;
    int spill974_17;
    org.apache.logging.log4j.Logger spill974_18;
    org.apache.logging.log4j.Marker spill974_19;
    java.lang.String spill974_20;
    java.lang.Object[] spill974_21;
    int spill974_22;
    boolean spill974_23;
    net.minecraft.client.audio.SoundManager spill974_24;
    long life1_3;
    java.util.Iterator life4_14;
    java.lang.String life3_15;
    net.minecraft.client.audio.ITickableSound life5_24;
    java.lang.String life6_52;
    java.util.Iterator life4_101;
    java.util.Map.Entry life5_111;
    java.lang.String life6_115;
    net.minecraft.client.audio.ISound life7_119;
    int life8_141;
    int life9_154;
    java.util.Map.Entry life5_244;
    java.lang.String life6_248;
    net.minecraft.client.audio.ISound life7_252;
    int life8_274;
    int life9_287;
    java.util.Iterator life5_381;
    java.util.Map.Entry life6_390;
    net.minecraft.client.audio.ISound life7_407;
    forest_join_353: {
    forest_join_349: {
    forest_join_310: {
    forest_join_309: {
    forest_join_199: {
    forest_join_85: {
    life1_3 = (__fieldRead974_0() ^ 67400033684929L);
    spill974_0 = __call974_1();
    net.minecraft.client.audio.SoundManager __stackOp974_2_0 = receiver;
    __fieldWrite974_4(__stackOp974_2_0, (__fieldRead974_3(__stackOp974_2_0) + 1));
    life4_14 = __call974_6(__fieldRead974_5(receiver));
    life3_15 = spill974_0;
    forest_cycle_16: while (true) {
    forest_join_83: {
    forest_join_41: {
    forest_join_37: {
    if (!(__call974_7(life4_14))) {
        break forest_join_85;
    }
    life5_24 = __cast974_9(__call974_8(life4_14));
    __call974_10(life5_24);
    spill974_1 = life5_24;
    if (!((life3_15 == null))) {
        forestValue974_41_0 = spill974_1;
        break forest_join_41;
    }
    spill974_2 = __call974_11(spill974_1);
    if (!((life3_15 == null))) {
        forestValue974_199_0 = __integerCategory974_12(spill974_2);
        break forest_join_199;
    }
    if (!(spill974_2)) {
        break forest_join_37;
    }
    __call974_13(receiver, life5_24);
    if (!((life3_15 != null))) {
        break forest_join_83;
    }
    }
    forestValue974_41_0 = __call974_15(__fieldRead974_14(receiver), life5_24);
    }
    life6_52 = __cast974_16(forestValue974_41_0);
    __call974_26(__fieldRead974_17(receiver), life6_52, __call974_25(receiver, life5_24, __cast974_20(__call974_19(__fieldRead974_18(receiver), life5_24)), __call974_24(__call974_23(__fieldRead974_21(receiver), __call974_22(life5_24)))));
    __call974_32(__fieldRead974_27(receiver), life6_52, __call974_31(receiver, life5_24, __cast974_30(__call974_29(__fieldRead974_28(receiver), life5_24))));
    __call974_37(__fieldRead974_33(receiver), life6_52, __call974_34(life5_24), __call974_35(life5_24), __call974_36(life5_24));
    }
    if (!((life3_15 != null))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    }
    life4_101 = __call974_40(__call974_39(__fieldRead974_38(receiver)));
    forest_cycle_90: while (true) {
    forest_join_196: {
    forest_join_195: {
    forest_join_185: {
    forest_join_149: {
    forest_join_129: {
    forest_join_120: {
    if (!(__call974_41(life4_101))) {
        break forest_join_309;
    }
    life5_111 = __cast974_43(__call974_42(life4_101));
    life6_115 = __cast974_45(__call974_44(life5_111));
    life7_119 = __cast974_47(__call974_46(life5_111));
    spill974_3 = receiver;
    if (!((life3_15 == null))) {
        forestValue974_310_0 = spill974_3;
        break forest_join_310;
    }
    spill974_4 = __call974_49(__fieldRead974_48(spill974_3), life6_115);
    if (!((life3_15 == null))) {
        forestValue974_120_0 = __integerCategory974_50(spill974_4);
        break forest_join_120;
    }
    if (!((!spill974_4))) {
        break forest_join_196;
    }
    forestValue974_120_0 = __call974_54(__cast974_53(__call974_52(__fieldRead974_51(receiver), life6_115)));
    }
    life8_141 = forestValue974_120_0;
    spill974_5 = life8_141;
    if (!((life3_15 == null))) {
        forestValue974_129_0 = spill974_5;
        break forest_join_129;
    }
    if (!((spill974_5 <= __fieldRead974_55(receiver)))) {
        break forest_join_196;
    }
    forestValue974_129_0 = __call974_56(life7_119);
    }
    life9_154 = forestValue974_129_0;
    spill974_6 = __call974_57(life7_119);
    if (!((life3_15 == null))) {
        forestValue974_185_0 = __integerCategory974_58(spill974_6);
        break forest_join_185;
    }
    if (!(spill974_6)) {
        break forest_join_149;
    }
    spill974_7 = life9_154;
    if (!((life3_15 == null))) {
        forestValue974_185_0 = spill974_7;
        break forest_join_185;
    }
    if (!((spill974_7 > 0))) {
        break forest_join_149;
    }
    __call974_62(__fieldRead974_59(receiver), life7_119, __call974_61((__fieldRead974_60(receiver) + life9_154)));
    }
    __call974_63(life4_101);
    spill974_8 = __fieldRead974_64();
    spill974_9 = __fieldRead974_65();
    spill974_10 = "Removed channel {} because it's not playing anymore";
    java.lang.Object[] __stackOp974_66_0 = new java.lang.Object[1];
    spill974_11 = __stackOp974_66_0;
    (__stackOp974_66_0)[0] = life6_115;
    __call974_67(spill974_8, spill974_9, spill974_10, spill974_11);
    __call974_69(__fieldRead974_68(receiver), life6_115);
    __call974_71(__fieldRead974_70(receiver), life6_115);
    __call974_73(__fieldRead974_72(receiver), life7_119);
    forestValue974_185_0 = __integerCategory974_80(__call974_79(__fieldRead974_74(receiver), __call974_78(__call974_77(__fieldRead974_75(receiver), __call974_76(life7_119))), life6_115));
    }
    __discardScalar974_81(forestValue974_185_0);
    spill974_12 = __instanceOf974_82(life7_119);
    if (!((life3_15 == null))) {
        forestValue974_195_0 = spill974_12;
        break forest_join_195;
    }
    if (!((spill974_12 != 0))) {
        break forest_join_196;
    }
    forestValue974_195_0 = __integerCategory974_85(__call974_84(__fieldRead974_83(receiver), life7_119));
    }
    __discardScalar974_86(forestValue974_195_0);
    }
    if (!((life3_15 != null))) {
        continue forest_cycle_90;
    }
    break forest_cycle_90;
    }
    break forest_join_309;
    }
    forest_cycle_199: while (true) {
    forest_join_306: {
    forest_join_303: {
    forest_join_302: {
    forest_join_292: {
    forest_join_256: {
    forest_join_236: {
    forest_join_227: {
    if (!((forestValue974_199_0 != 0))) {
        break forest_join_309;
    }
    life5_244 = __cast974_88(__call974_87(life4_14));
    life6_248 = __cast974_90(__call974_89(life5_244));
    life7_252 = __cast974_92(__call974_91(life5_244));
    spill974_13 = receiver;
    if (!((life3_15 == null))) {
        forestValue974_310_0 = spill974_13;
        break forest_join_310;
    }
    spill974_14 = __call974_94(__fieldRead974_93(spill974_13), life6_248);
    if (!((life3_15 == null))) {
        forestValue974_227_0 = __integerCategory974_95(spill974_14);
        break forest_join_227;
    }
    if (!((!spill974_14))) {
        break forest_join_303;
    }
    forestValue974_227_0 = __call974_99(__cast974_98(__call974_97(__fieldRead974_96(receiver), life6_248)));
    }
    life8_274 = forestValue974_227_0;
    spill974_15 = life8_274;
    if (!((life3_15 == null))) {
        forestValue974_236_0 = spill974_15;
        break forest_join_236;
    }
    if (!((spill974_15 <= __fieldRead974_100(receiver)))) {
        break forest_join_303;
    }
    forestValue974_236_0 = __call974_101(life7_252);
    }
    life9_287 = forestValue974_236_0;
    spill974_16 = __call974_102(life7_252);
    if (!((life3_15 == null))) {
        forestValue974_292_0 = __integerCategory974_103(spill974_16);
        break forest_join_292;
    }
    if (!(spill974_16)) {
        break forest_join_256;
    }
    spill974_17 = life9_287;
    if (!((life3_15 == null))) {
        forestValue974_292_0 = spill974_17;
        break forest_join_292;
    }
    if (!((spill974_17 > 0))) {
        break forest_join_256;
    }
    __call974_107(__fieldRead974_104(receiver), life7_252, __call974_106((__fieldRead974_105(receiver) + life9_287)));
    }
    __call974_108(life4_14);
    spill974_18 = __fieldRead974_109();
    spill974_19 = __fieldRead974_110();
    spill974_20 = "Removed channel {} because it's not playing anymore";
    java.lang.Object[] __stackOp974_111_0 = new java.lang.Object[1];
    spill974_21 = __stackOp974_111_0;
    (__stackOp974_111_0)[0] = life6_248;
    __call974_112(spill974_18, spill974_19, spill974_20, spill974_21);
    __call974_114(__fieldRead974_113(receiver), life6_248);
    __call974_116(__fieldRead974_115(receiver), life6_248);
    __call974_118(__fieldRead974_117(receiver), life7_252);
    forestValue974_292_0 = __integerCategory974_125(__call974_124(__fieldRead974_119(receiver), __call974_123(__call974_122(__fieldRead974_120(receiver), __call974_121(life7_252))), life6_248));
    }
    __discardScalar974_126(forestValue974_292_0);
    spill974_22 = __instanceOf974_127(life7_252);
    if (!((life3_15 == null))) {
        forestValue974_302_0 = spill974_22;
        break forest_join_302;
    }
    if (!((spill974_22 != 0))) {
        break forest_join_303;
    }
    forestValue974_302_0 = __integerCategory974_130(__call974_129(__fieldRead974_128(receiver), life7_252));
    }
    __discardScalar974_131(forestValue974_302_0);
    }
    if (!((life3_15 != null))) {
        break forest_join_306;
    }
    break forest_join_309;
    }
    spill974_23 = __call974_132(life4_14);
    forestValue974_199_0 = __integerCategory974_133(spill974_23);
    continue forest_cycle_199;
    }
    }
    forestValue974_310_0 = receiver;
    }
    life5_381 = __call974_136(__call974_135(__fieldRead974_134(forestValue974_310_0)));
    forest_cycle_314: while (true) {
    forest_join_347: {
    forest_join_345: {
    forest_join_342: {
    forest_join_332: {
    if (!(__call974_137(life5_381))) {
        break forest_join_349;
    }
    life6_390 = __cast974_139(__call974_138(life5_381));
    spill974_24 = receiver;
    if (!((life3_15 == null))) {
        forestValue974_332_0 = spill974_24;
        break forest_join_332;
    }
    if (!((__fieldRead974_140(spill974_24) >= __call974_143(__cast974_142(__call974_141(life6_390)))))) {
        break forest_join_347;
    }
    forestValue974_332_0 = __call974_144(life6_390);
    }
    life7_407 = __cast974_145(forestValue974_332_0);
    if (!((life3_15 == null))) {
        break forest_join_345;
    }
    if (!((__instanceOf974_146(life7_407) != 0))) {
        break forest_join_342;
    }
    __call974_148(__cast974_147(life7_407));
    }
    __call974_149(receiver, life7_407);
    }
    __call974_150(life5_381);
    }
    if (!((life3_15 != null))) {
        continue forest_cycle_314;
    }
    break forest_cycle_314;
    }
    }
    if (!((__call974_151() != null))) {
        break forest_join_353;
    }
    __call974_152("kOA8yb");
    }
    return;
}
public static void h974_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097400_0(p0);
}
public static void h974_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097401_0(p0);
}
public static void h974_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097402_0(p0);
}
public static void h974_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097403_0(p0);
}
public static void h974_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097404_0(p0);
}
public static void h974_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097405_0(p0);
}
public static void h974_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097406_0(p0);
}
public static void h974_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097407_0(p0);
}
public static void h974_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097408_0(p0);
}
public static void h974_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097409_0(p0);
}
public static void h974_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097410_0(p0);
}
public static void h974_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097411_0(p0);
}
public static void h974_12(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097412_0(p0);
}
public static void h974_13(java.lang.RuntimeException p0, net.minecraft.client.audio.SoundManager p1, java.lang.String p2, java.util.Iterator p3, net.minecraft.client.audio.ISound p4, int p5, int p6) throws Throwable {
    int forestValue3097413_11_0;
    int forestValue3097413_45_0;
    int forestValue3097413_54_0;
    int forestValue3097413_110_0;
    net.minecraft.client.audio.SoundManager forestValue3097413_113_0;
    java.lang.Object forestValue3097413_135_0;
    int spill3097413_0;
    net.minecraft.client.audio.SoundManager spill3097413_1;
    boolean spill3097413_2;
    int spill3097413_3;
    boolean spill3097413_4;
    int spill3097413_5;
    org.apache.logging.log4j.Logger spill3097413_6;
    org.apache.logging.log4j.Marker spill3097413_7;
    java.lang.String spill3097413_8;
    java.lang.Object[] spill3097413_9;
    net.minecraft.client.audio.SoundManager spill3097413_10;
    java.lang.RuntimeException life9_2;
    java.util.Map.Entry life7_29;
    java.lang.String life8_33;
    int life5_59;
    int life6_72;
    java.util.Iterator life7_145;
    java.util.Map.Entry life8_154;
    net.minecraft.client.audio.ISound life4_171;
    forest_join_156: {
    forest_join_152: {
    forest_join_113: {
    forest_join_112: {
    life9_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_110: {
    forest_join_74: {
    forest_join_54: {
    forest_join_12: {
    forest_join_11: {
    spill3097413_0 = __instanceOf3097413_0(p4);
    if (!((p2 == null))) {
        forestValue3097413_11_0 = spill3097413_0;
        break forest_join_11;
    }
    if (!((spill3097413_0 != 0))) {
        break forest_join_12;
    }
    forestValue3097413_11_0 = __integerCategory3097413_3(__call3097413_2(__fieldRead3097413_1(p1), p4));
    }
    __discardScalar3097413_4(forestValue3097413_11_0);
    }
    forest_cycle_12: while (true) {
    forest_join_45: {
    forest_join_15: {
    if (!((p2 != null))) {
        break forest_join_15;
    }
    break forest_join_112;
    }
    if (!(__call3097413_5(p3))) {
        break forest_join_112;
    }
    life7_29 = __cast3097413_7(__call3097413_6(p3));
    life8_33 = __cast3097413_9(__call3097413_8(life7_29));
    p4 = __cast3097413_11(__call3097413_10(life7_29));
    spill3097413_1 = p1;
    if (!((p2 == null))) {
        forestValue3097413_113_0 = spill3097413_1;
        break forest_join_113;
    }
    spill3097413_2 = __call3097413_13(__fieldRead3097413_12(spill3097413_1), life8_33);
    if (!((p2 == null))) {
        forestValue3097413_45_0 = __integerCategory3097413_14(spill3097413_2);
        break forest_join_45;
    }
    if (!((!spill3097413_2))) {
        continue forest_cycle_12;
    }
    forestValue3097413_45_0 = __call3097413_18(__cast3097413_17(__call3097413_16(__fieldRead3097413_15(p1), life8_33)));
    }
    life5_59 = forestValue3097413_45_0;
    spill3097413_3 = life5_59;
    if (!((p2 == null))) {
        forestValue3097413_54_0 = spill3097413_3;
        break forest_join_54;
    }
    if (!((spill3097413_3 <= __fieldRead3097413_19(p1)))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    forestValue3097413_54_0 = __call3097413_20(p4);
    }
    life6_72 = forestValue3097413_54_0;
    spill3097413_4 = __call3097413_21(p4);
    if (!((p2 == null))) {
        forestValue3097413_110_0 = __integerCategory3097413_22(spill3097413_4);
        break forest_join_110;
    }
    if (!(spill3097413_4)) {
        break forest_join_74;
    }
    spill3097413_5 = life6_72;
    if (!((p2 == null))) {
        forestValue3097413_110_0 = spill3097413_5;
        break forest_join_110;
    }
    if (!((spill3097413_5 > 0))) {
        break forest_join_74;
    }
    __call3097413_26(__fieldRead3097413_23(p1), p4, __call3097413_25((__fieldRead3097413_24(p1) + life6_72)));
    }
    __call3097413_27(p3);
    spill3097413_6 = __fieldRead3097413_28();
    spill3097413_7 = __fieldRead3097413_29();
    spill3097413_8 = "Removed channel {} because it's not playing anymore";
    java.lang.Object[] __stackOp3097413_30_0 = new java.lang.Object[1];
    spill3097413_9 = __stackOp3097413_30_0;
    (__stackOp3097413_30_0)[0] = life8_33;
    __call3097413_31(spill3097413_6, spill3097413_7, spill3097413_8, spill3097413_9);
    __call3097413_33(__fieldRead3097413_32(p1), life8_33);
    __call3097413_35(__fieldRead3097413_34(p1), life8_33);
    __call3097413_37(__fieldRead3097413_36(p1), p4);
    forestValue3097413_110_0 = __integerCategory3097413_44(__call3097413_43(__fieldRead3097413_38(p1), __call3097413_42(__call3097413_41(__fieldRead3097413_39(p1), __call3097413_40(p4))), life8_33));
    }
    __discardScalar3097413_45(forestValue3097413_110_0);
    continue forest_cycle_2;
    }
    }
    forestValue3097413_113_0 = p1;
    }
    life7_145 = __call3097413_48(__call3097413_47(__fieldRead3097413_46(forestValue3097413_113_0)));
    forest_cycle_117: while (true) {
    forest_join_150: {
    forest_join_148: {
    forest_join_145: {
    forest_join_135: {
    if (!(__call3097413_49(life7_145))) {
        break forest_join_152;
    }
    life8_154 = __cast3097413_51(__call3097413_50(life7_145));
    spill3097413_10 = p1;
    if (!((p2 == null))) {
        forestValue3097413_135_0 = spill3097413_10;
        break forest_join_135;
    }
    if (!((__fieldRead3097413_52(spill3097413_10) >= __call3097413_55(__cast3097413_54(__call3097413_53(life8_154)))))) {
        break forest_join_150;
    }
    forestValue3097413_135_0 = __call3097413_56(life8_154);
    }
    life4_171 = __cast3097413_57(forestValue3097413_135_0);
    if (!((p2 == null))) {
        break forest_join_148;
    }
    if (!((__instanceOf3097413_58(life4_171) != 0))) {
        break forest_join_145;
    }
    __call3097413_60(__cast3097413_59(life4_171));
    }
    __call3097413_61(p1, life4_171);
    }
    __call3097413_62(life7_145);
    }
    if (!((p2 != null))) {
        continue forest_cycle_117;
    }
    break forest_cycle_117;
    }
    }
    if (!((__call3097413_63() != null))) {
        break forest_join_156;
    }
    __call3097413_64("kOA8yb");
    }
    return;
}
public static void h974_14(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097414_0(p0);
}
public static void h974_15(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097415_0(p0);
}
public static void h974_16(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097416_0(p0);
}
public static void h974_17(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097417_0(p0);
}
public static void h974_18(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097418_0(p0);
}
public static void h974_19(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097419_0(p0);
}
public static void h974_20(java.lang.RuntimeException p0) throws Throwable {
    throw __call3097420_0(p0);
}
private static native long __fieldRead974_0() throws Throwable;
private static native java.lang.String __call974_1() throws Throwable;
private static native int __fieldRead974_3(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native void __fieldWrite974_4(net.minecraft.client.audio.SoundManager a0, int a1) throws Throwable;
private static native java.util.List __fieldRead974_5(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.util.Iterator __call974_6(java.util.List a0) throws Throwable;
private static native boolean __call974_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call974_8(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.client.audio.ITickableSound __cast974_9(java.lang.Object a0) throws Throwable;
private static native void __call974_10(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native boolean __call974_11(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native int __integerCategory974_12(boolean value) throws Throwable;
private static native void __call974_13(net.minecraft.client.audio.SoundManager a0, net.minecraft.client.audio.ITickableSound a1) throws Throwable;
private static native java.util.Map __fieldRead974_14(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_15(java.util.Map a0, net.minecraft.client.audio.ITickableSound a1) throws Throwable;
private static native java.lang.String __cast974_16(java.lang.Object a0) throws Throwable;
private static native moom.OM __fieldRead974_17(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.util.Map __fieldRead974_18(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_19(java.util.Map a0, net.minecraft.client.audio.ITickableSound a1) throws Throwable;
private static native net.minecraft.client.audio.SoundPoolEntry __cast974_20(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead974_21(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native moom.DD __call974_22(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native net.minecraft.client.audio.SoundEventAccessorComposite __call974_23(net.minecraft.client.audio.SoundHandler a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __call974_24(net.minecraft.client.audio.SoundEventAccessorComposite a0) throws Throwable;
private static native float __call974_25(net.minecraft.client.audio.SoundManager a0, net.minecraft.client.audio.ITickableSound a1, net.minecraft.client.audio.SoundPoolEntry a2, net.minecraft.client.audio.SoundCategory a3) throws Throwable;
private static native void __call974_26(moom.OM a0, java.lang.String a1, float a2) throws Throwable;
private static native moom.OM __fieldRead974_27(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.util.Map __fieldRead974_28(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_29(java.util.Map a0, net.minecraft.client.audio.ITickableSound a1) throws Throwable;
private static native net.minecraft.client.audio.SoundPoolEntry __cast974_30(java.lang.Object a0) throws Throwable;
private static native float __call974_31(net.minecraft.client.audio.SoundManager a0, net.minecraft.client.audio.ITickableSound a1, net.minecraft.client.audio.SoundPoolEntry a2) throws Throwable;
private static native void __call974_32(moom.OM a0, java.lang.String a1, float a2) throws Throwable;
private static native moom.OM __fieldRead974_33(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native float __call974_34(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native float __call974_35(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native float __call974_36(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native void __call974_37(moom.OM a0, java.lang.String a1, float a2, float a3, float a4) throws Throwable;
private static native java.util.Map __fieldRead974_38(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.util.Set __call974_39(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call974_40(java.util.Set a0) throws Throwable;
private static native boolean __call974_41(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call974_42(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast974_43(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call974_44(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast974_45(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call974_46(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.audio.ISound __cast974_47(java.lang.Object a0) throws Throwable;
private static native moom.OM __fieldRead974_48(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native boolean __call974_49(moom.OM a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory974_50(boolean value) throws Throwable;
private static native java.util.Map __fieldRead974_51(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_52(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast974_53(java.lang.Object a0) throws Throwable;
private static native int __call974_54(java.lang.Integer a0) throws Throwable;
private static native int __fieldRead974_55(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native int __call974_56(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native boolean __call974_57(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native int __integerCategory974_58(boolean value) throws Throwable;
private static native java.util.Map __fieldRead974_59(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native int __fieldRead974_60(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Integer __call974_61(int a0) throws Throwable;
private static native java.lang.Object __call974_62(java.util.Map a0, net.minecraft.client.audio.ISound a1, java.lang.Integer a2) throws Throwable;
private static native void __call974_63(java.util.Iterator a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead974_64() throws Throwable;
private static native org.apache.logging.log4j.Marker __fieldRead974_65() throws Throwable;
private static native void __call974_67(org.apache.logging.log4j.Logger a0, org.apache.logging.log4j.Marker a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native moom.OM __fieldRead974_68(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native void __call974_69(moom.OM a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead974_70(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_71(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead974_72(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_73(java.util.Map a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native com.google.common.collect.Multimap __fieldRead974_74(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead974_75(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native moom.DD __call974_76(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native net.minecraft.client.audio.SoundEventAccessorComposite __call974_77(net.minecraft.client.audio.SoundHandler a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __call974_78(net.minecraft.client.audio.SoundEventAccessorComposite a0) throws Throwable;
private static native boolean __call974_79(com.google.common.collect.Multimap a0, net.minecraft.client.audio.SoundCategory a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory974_80(boolean value) throws Throwable;
private static native void __discardScalar974_81(int a0) throws Throwable;
private static native int __instanceOf974_82(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native java.util.List __fieldRead974_83(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native boolean __call974_84(java.util.List a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native int __integerCategory974_85(boolean value) throws Throwable;
private static native void __discardScalar974_86(int a0) throws Throwable;
private static native java.lang.Object __call974_87(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast974_88(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call974_89(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast974_90(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call974_91(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.audio.ISound __cast974_92(java.lang.Object a0) throws Throwable;
private static native moom.OM __fieldRead974_93(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native boolean __call974_94(moom.OM a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory974_95(boolean value) throws Throwable;
private static native java.util.Map __fieldRead974_96(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_97(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast974_98(java.lang.Object a0) throws Throwable;
private static native int __call974_99(java.lang.Integer a0) throws Throwable;
private static native int __fieldRead974_100(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native int __call974_101(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native boolean __call974_102(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native int __integerCategory974_103(boolean value) throws Throwable;
private static native java.util.Map __fieldRead974_104(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native int __fieldRead974_105(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Integer __call974_106(int a0) throws Throwable;
private static native java.lang.Object __call974_107(java.util.Map a0, net.minecraft.client.audio.ISound a1, java.lang.Integer a2) throws Throwable;
private static native void __call974_108(java.util.Iterator a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead974_109() throws Throwable;
private static native org.apache.logging.log4j.Marker __fieldRead974_110() throws Throwable;
private static native void __call974_112(org.apache.logging.log4j.Logger a0, org.apache.logging.log4j.Marker a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native moom.OM __fieldRead974_113(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native void __call974_114(moom.OM a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead974_115(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_116(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead974_117(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_118(java.util.Map a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native com.google.common.collect.Multimap __fieldRead974_119(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead974_120(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native moom.DD __call974_121(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native net.minecraft.client.audio.SoundEventAccessorComposite __call974_122(net.minecraft.client.audio.SoundHandler a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __call974_123(net.minecraft.client.audio.SoundEventAccessorComposite a0) throws Throwable;
private static native boolean __call974_124(com.google.common.collect.Multimap a0, net.minecraft.client.audio.SoundCategory a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory974_125(boolean value) throws Throwable;
private static native void __discardScalar974_126(int a0) throws Throwable;
private static native int __instanceOf974_127(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native java.util.List __fieldRead974_128(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native boolean __call974_129(java.util.List a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native int __integerCategory974_130(boolean value) throws Throwable;
private static native void __discardScalar974_131(int a0) throws Throwable;
private static native boolean __call974_132(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory974_133(boolean value) throws Throwable;
private static native java.util.Map __fieldRead974_134(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.util.Set __call974_135(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call974_136(java.util.Set a0) throws Throwable;
private static native boolean __call974_137(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call974_138(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast974_139(java.lang.Object a0) throws Throwable;
private static native int __fieldRead974_140(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call974_141(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.Integer __cast974_142(java.lang.Object a0) throws Throwable;
private static native int __call974_143(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __call974_144(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.audio.ISound __cast974_145(java.lang.Object a0) throws Throwable;
private static native int __instanceOf974_146(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native net.minecraft.client.audio.ITickableSound __cast974_147(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native void __call974_148(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native void __call974_149(net.minecraft.client.audio.SoundManager a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native void __call974_150(java.util.Iterator a0) throws Throwable;
private static native java.lang.String[] __call974_151() throws Throwable;
private static native void __call974_152(java.lang.String a0) throws Throwable;
private static native java.lang.RuntimeException __call3097400_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097401_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097402_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097403_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097404_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097405_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097406_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097407_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097408_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097409_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097410_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097411_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097412_0(java.lang.RuntimeException a0) throws Throwable;
private static native int __instanceOf3097413_0(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native java.util.List __fieldRead3097413_1(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native boolean __call3097413_2(java.util.List a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native int __integerCategory3097413_3(boolean value) throws Throwable;
private static native void __discardScalar3097413_4(int a0) throws Throwable;
private static native boolean __call3097413_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097413_6(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3097413_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3097413_8(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast3097413_9(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call3097413_10(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.audio.ISound __cast3097413_11(java.lang.Object a0) throws Throwable;
private static native moom.OM __fieldRead3097413_12(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native boolean __call3097413_13(moom.OM a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3097413_14(boolean value) throws Throwable;
private static native java.util.Map __fieldRead3097413_15(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call3097413_16(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast3097413_17(java.lang.Object a0) throws Throwable;
private static native int __call3097413_18(java.lang.Integer a0) throws Throwable;
private static native int __fieldRead3097413_19(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native int __call3097413_20(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native boolean __call3097413_21(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native int __integerCategory3097413_22(boolean value) throws Throwable;
private static native java.util.Map __fieldRead3097413_23(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native int __fieldRead3097413_24(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Integer __call3097413_25(int a0) throws Throwable;
private static native java.lang.Object __call3097413_26(java.util.Map a0, net.minecraft.client.audio.ISound a1, java.lang.Integer a2) throws Throwable;
private static native void __call3097413_27(java.util.Iterator a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3097413_28() throws Throwable;
private static native org.apache.logging.log4j.Marker __fieldRead3097413_29() throws Throwable;
private static native void __call3097413_31(org.apache.logging.log4j.Logger a0, org.apache.logging.log4j.Marker a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native moom.OM __fieldRead3097413_32(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native void __call3097413_33(moom.OM a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead3097413_34(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call3097413_35(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead3097413_36(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call3097413_37(java.util.Map a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native com.google.common.collect.Multimap __fieldRead3097413_38(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __fieldRead3097413_39(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native moom.DD __call3097413_40(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native net.minecraft.client.audio.SoundEventAccessorComposite __call3097413_41(net.minecraft.client.audio.SoundHandler a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.audio.SoundCategory __call3097413_42(net.minecraft.client.audio.SoundEventAccessorComposite a0) throws Throwable;
private static native boolean __call3097413_43(com.google.common.collect.Multimap a0, net.minecraft.client.audio.SoundCategory a1, java.lang.String a2) throws Throwable;
private static native int __integerCategory3097413_44(boolean value) throws Throwable;
private static native void __discardScalar3097413_45(int a0) throws Throwable;
private static native java.util.Map __fieldRead3097413_46(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.util.Set __call3097413_47(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call3097413_48(java.util.Set a0) throws Throwable;
private static native boolean __call3097413_49(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3097413_50(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast3097413_51(java.lang.Object a0) throws Throwable;
private static native int __fieldRead3097413_52(net.minecraft.client.audio.SoundManager a0) throws Throwable;
private static native java.lang.Object __call3097413_53(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.Integer __cast3097413_54(java.lang.Object a0) throws Throwable;
private static native int __call3097413_55(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __call3097413_56(java.util.Map.Entry a0) throws Throwable;
private static native net.minecraft.client.audio.ISound __cast3097413_57(java.lang.Object a0) throws Throwable;
private static native int __instanceOf3097413_58(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native net.minecraft.client.audio.ITickableSound __cast3097413_59(net.minecraft.client.audio.ISound a0) throws Throwable;
private static native void __call3097413_60(net.minecraft.client.audio.ITickableSound a0) throws Throwable;
private static native void __call3097413_61(net.minecraft.client.audio.SoundManager a0, net.minecraft.client.audio.ISound a1) throws Throwable;
private static native void __call3097413_62(java.util.Iterator a0) throws Throwable;
private static native java.lang.String[] __call3097413_63() throws Throwable;
private static native void __call3097413_64(java.lang.String a0) throws Throwable;
private static native java.lang.RuntimeException __call3097414_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097415_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097416_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097417_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097418_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097419_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3097420_0(java.lang.RuntimeException a0) throws Throwable;

}


public void b(net.minecraft.client.audio.ISound p0) {
int forwardValue4762_18_0;
    net.minecraft.client.audio.SoundManager forwardValue4762_33_0;
    net.minecraft.client.audio.SoundEventAccessorComposite forwardValue4762_56_0;
    float forwardValue4762_89_0;
    float forwardValue4762_89_1;
    int forwardValue4762_129_0;
    int forwardValue4762_134_0;
    int forwardValue4762_138_0;
    int forwardValue4762_140_0;
    net.minecraft.client.audio.SoundManager forwardValue4762_256_0;
    int forwardValue4762_271_0;
    boolean spill4762_0;
    net.minecraft.client.audio.SoundManager spill4762_1;
    net.minecraft.client.audio.SoundEventAccessorComposite spill4762_2;
    float spill4762_3;
    float spill4762_4;
    int spill4762_5;
    net.minecraft.client.audio.SoundManager spill4762_6;
    int spill4762_7;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.client.audio.SoundEventAccessorComposite life5_52;
    net.minecraft.client.audio.SoundPoolEntry life6_81;
    float life7_108;
    float life8_110;
    net.minecraft.client.audio.SoundCategory life9_129;
    float life10_135;
    double life11_141;
    moom.DD life13_144;
    int life14_194;
    java.lang.String life15_198;
    forward_join_272: {
    forward_join_271: {
    forward_join_261: {
    forward_join_256: {
    forward_join_192: {
    forward_join_172: {
    forward_join_170: {
    forward_join_140: {
    forward_join_139: {
    forward_join_138: {
    forward_join_134: {
    forward_join_129: {
    forward_join_127: {
    forward_join_91: {
    forward_join_89: {
    forward_join_76: {
    forward_join_74: {
    forward_join_56: {
    forward_join_55: {
    forward_join_33: {
    forward_join_32: {
    forward_join_18: {
    life2_3 = (net.minecraft.client.audio.SoundManager.o ^ 124643761433478L);
    life4_5 = net.minecraft.client.audio.SoundHandler.b();
    spill4762_0 = this.f;
    if (!((life4_5 == null))) {
        forwardValue4762_18_0 = ((spill4762_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4762_0)) {
        break forward_join_272;
    }
    spill4762_1 = this;
    if (!((life4_5 == null))) {
        forwardValue4762_33_0 = spill4762_1;
        break forward_join_33;
    }
    forwardValue4762_18_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.OM)(((net.minecraft.client.audio.SoundManager)(spill4762_1)).e)).getMasterVolume())), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue4762_18_0 <= 0))) {
        break forward_join_32;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).debug(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Skipped playing soundEvent: {}, master volume was zero")), ((java.lang.Object[])(new java.lang.Object[] {((net.minecraft.client.audio.ISound)(p0)).a__DD()})));
    if (!((life4_5 != null))) {
        break forward_join_272;
    }
    }
    forwardValue4762_33_0 = this;
    }
    life5_52 = ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.audio.SoundManager)(forwardValue4762_33_0)).c)).a(((moom.DD)(((net.minecraft.client.audio.ISound)(p0)).a__DD())));
    spill4762_2 = life5_52;
    if (!((life4_5 == null))) {
        forwardValue4762_56_0 = spill4762_2;
        break forward_join_56;
    }
    if (!((spill4762_2 == null))) {
        break forward_join_55;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).warn(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Unable to play unknown soundEvent: {}")), ((java.lang.Object[])(new java.lang.Object[] {((net.minecraft.client.audio.ISound)(p0)).a__DD()})));
    if (!((life4_5 != null))) {
        break forward_join_272;
    }
    }
    forwardValue4762_56_0 = life5_52;
    }
    life6_81 = ((net.minecraft.client.audio.SoundEventAccessorComposite)(forwardValue4762_56_0)).a__f9();
    if (!((life4_5 == null))) {
        break forward_join_74;
    }
    if (!((life6_81 == net.minecraft.client.audio.SoundHandler.d))) {
        break forward_join_76;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).warn(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Unable to play empty soundEvent: {}")), ((java.lang.Object[])(new java.lang.Object[] {((net.minecraft.client.audio.SoundEventAccessorComposite)(life5_52)).a__DD()})));
    }
    if (!((life4_5 != null))) {
        break forward_join_272;
    }
    }
    life7_108 = ((net.minecraft.client.audio.ISound)(p0)).a();
    life8_110 = 0x1.0p4f;
    spill4762_3 = life7_108;
    spill4762_4 = 0x1.0p0f;
    if (!((life4_5 == null))) {
        forwardValue4762_89_0 = spill4762_3;
        forwardValue4762_89_1 = spill4762_4;
        break forward_join_89;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill4762_3)), ((float)(spill4762_4))) > 0))) {
        break forward_join_91;
    }
    forwardValue4762_89_0 = life8_110;
    forwardValue4762_89_1 = life7_108;
    }
    life8_110 = (forwardValue4762_89_0 * forwardValue4762_89_1);
    }
    life9_129 = ((net.minecraft.client.audio.SoundEventAccessorComposite)(life5_52)).a__aw();
    life10_135 = ((net.minecraft.client.audio.SoundManager)(this)).a(((net.minecraft.client.audio.ISound)(p0)), ((net.minecraft.client.audio.SoundPoolEntry)(life6_81)), ((net.minecraft.client.audio.SoundCategory)(life9_129)));
    life11_141 = ((double) ((net.minecraft.client.audio.SoundManager)(this)).a(((net.minecraft.client.audio.ISound)(p0)), ((net.minecraft.client.audio.SoundPoolEntry)(life6_81))));
    life13_144 = ((net.minecraft.client.audio.SoundPoolEntry)(life6_81)).a__DD();
    spill4762_5 = recovery.source.CarrierOps.fcmpl(((float)(life10_135)), ((float)(0x0.0p0f)));
    if (!((life4_5 == null))) {
        forwardValue4762_129_0 = spill4762_5;
        break forward_join_129;
    }
    if (!((spill4762_5 == 0))) {
        break forward_join_127;
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).debug(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Skipped playing sound {}, volume was zero.")), ((java.lang.Object[])(new java.lang.Object[] {life13_144})));
    if (!((life4_5 != null))) {
        break forward_join_272;
    }
    }
    forwardValue4762_129_0 = ((((net.minecraft.client.audio.ISound)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4762_134_0 = forwardValue4762_129_0;
        break forward_join_134;
    }
    if (!((forwardValue4762_129_0 != 0))) {
        break forward_join_139;
    }
    forwardValue4762_134_0 = ((net.minecraft.client.audio.ISound)(p0)).a__Int();
    }
    if (!((life4_5 == null))) {
        forwardValue4762_138_0 = forwardValue4762_134_0;
        break forward_join_138;
    }
    if (!((forwardValue4762_134_0 == 0))) {
        break forward_join_139;
    }
    forwardValue4762_138_0 = 1;
    }
    forwardValue4762_140_0 = forwardValue4762_138_0;
    break forward_join_140;
    }
    forwardValue4762_140_0 = 0;
    }
    life14_194 = forwardValue4762_140_0;
    life15_198 = ((java.util.UUID)(moom.Dr.a(((java.util.Random)(io.netty.util.internal.ThreadLocalRandom.current()))))).toString();
    if (!((life4_5 == null))) {
        break forward_join_170;
    }
    if (!(((net.minecraft.client.audio.SoundPoolEntry)(life6_81)).a__Boolean())) {
        break forward_join_172;
    }
    ((moom.OM)(this.e)).newStreamingSource(((boolean)(false)), ((java.lang.String)(life15_198)), ((java.net.URL)(net.minecraft.client.audio.SoundManager.a(((moom.DD)(life13_144))))), ((java.lang.String)(((moom.DD)(life13_144)).toString())), ((boolean)__sourceIntrinsic_integerToBoolean((life14_194))), ((float)(((net.minecraft.client.audio.ISound)(p0)).c())), ((float)(((net.minecraft.client.audio.ISound)(p0)).d())), ((float)(((net.minecraft.client.audio.ISound)(p0)).e())), ((int)(((net.minecraft.client.audio.ISound$AttenuationType)(((net.minecraft.client.audio.ISound)(p0)).a__au())).a())), ((float)(life8_110)));
    }
    if (!((life4_5 != null))) {
        break forward_join_192;
    }
    }
    ((moom.OM)(this.e)).newSource(((boolean)(false)), ((java.lang.String)(life15_198)), ((java.net.URL)(net.minecraft.client.audio.SoundManager.a(((moom.DD)(life13_144))))), ((java.lang.String)(((moom.DD)(life13_144)).toString())), ((boolean)__sourceIntrinsic_integerToBoolean((life14_194))), ((float)(((net.minecraft.client.audio.ISound)(p0)).c())), ((float)(((net.minecraft.client.audio.ISound)(p0)).d())), ((float)(((net.minecraft.client.audio.ISound)(p0)).e())), ((int)(((net.minecraft.client.audio.ISound$AttenuationType)(((net.minecraft.client.audio.ISound)(p0)).a__au())).a())), ((float)(life8_110)));
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).debug(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Playing sound {} for event {} as channel {}")), ((java.lang.Object[])(new java.lang.Object[] {((net.minecraft.client.audio.SoundPoolEntry)(life6_81)).a__DD(), ((net.minecraft.client.audio.SoundEventAccessorComposite)(life5_52)).a__DD(), life15_198})));
    ((moom.OM)(this.e)).setPitch(((java.lang.String)(life15_198)), ((float)(((float) life11_141))));
    ((moom.OM)(this.e)).setVolume(((java.lang.String)(life15_198)), ((float)(life10_135)));
    ((moom.OM)(this.e)).play(((java.lang.String)(life15_198)));
    ((java.util.Map)(this.n)).put(((java.lang.Object)(life15_198)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)((this.g + ((int) net.minecraft.client.audio.SoundManager.p))))))));
    ((java.util.Map)(this.h)).put(((java.lang.Object)(life15_198)), ((java.lang.Object)(p0)));
    spill4762_6 = this;
    if (!((life4_5 == null))) {
        forwardValue4762_256_0 = spill4762_6;
        break forward_join_256;
    }
    ((java.util.Map)(((net.minecraft.client.audio.SoundManager)(spill4762_6)).j)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life6_81)));
    if (!((life9_129 != net.minecraft.client.audio.SoundCategory.MASTER))) {
        break forward_join_261;
    }
    forwardValue4762_256_0 = this;
    }
    ((com.google.common.collect.Multimap)(((net.minecraft.client.audio.SoundManager)(forwardValue4762_256_0)).k)).put(((java.lang.Object)(life9_129)), ((java.lang.Object)(life15_198)));
    }
    spill4762_7 = ((p0 instanceof net.minecraft.client.audio.ITickableSound) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue4762_271_0 = spill4762_7;
        break forward_join_271;
    }
    if (!((spill4762_7 != 0))) {
        break forward_join_272;
    }
    forwardValue4762_271_0 = ((((java.util.List)(this.l)).add(((java.lang.Object)(((net.minecraft.client.audio.ITickableSound)(p0)))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4762_271_0);
    }
    return;
}


private synchronized void b() { __sourceHandlerCall_37e65a2dca87b0d1550c(this); }


public void e() { __sourceHandlerCall_059e0c88d98dcbe1152b(this); }


public void c() {
net.minecraft.client.audio.SoundManager forwardValue4763_17_0;
    net.minecraft.client.audio.SoundManager spill4763_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_19: {
    forward_join_17: {
    life1_3 = (net.minecraft.client.audio.SoundManager.o ^ 136544880414820L);
    life3_5 = net.minecraft.client.audio.SoundHandler.b();
    spill4763_0 = this;
    if (!((life3_5 == null))) {
        forwardValue4763_17_0 = spill4763_0;
        break forward_join_17;
    }
    if (!(((net.minecraft.client.audio.SoundManager)(spill4763_0)).f)) {
        break forward_join_19;
    }
    ((net.minecraft.client.audio.SoundManager)(this)).d();
    ((moom.OM)(this.e)).cleanup();
    forwardValue4763_17_0 = this;
    }
    ((net.minecraft.client.audio.SoundManager)(forwardValue4763_17_0)).f = ((boolean)(false));
    }
    return;
}


public void f() {
java.lang.String spill1476_0;
    long life1_3;
    java.util.Iterator life4_9;
    java.lang.String life3_10;
    java.lang.String life5_17;
    lexical_join_34: {
    life1_3 = (net.minecraft.client.audio.SoundManager.o ^ 92482647175251L);
    spill1476_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_9 = ((java.util.Set)(((java.util.Map)(this.h)).keySet())).iterator();
    life3_10 = spill1476_0;
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life4_9)).hasNext())) {
        break lexical_join_34;
    }
    life5_17 = ((java.lang.String)(((java.util.Iterator)(life4_9)).next()));
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).debug(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Pausing channel {}")), ((java.lang.Object[])(new java.lang.Object[] {life5_17})));
    ((moom.OM)(this.e)).pause(((java.lang.String)(life5_17)));
    if (!((life3_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


public void d() {
net.minecraft.client.audio.SoundManager lexicalValue1475_12_0;
    net.minecraft.client.audio.SoundManager spill1475_0;
    long life1_3;
    java.lang.String life3_5;
    java.util.Iterator life4_21;
    java.lang.String life5_28;
    lexical_join_49: {
    lexical_join_46: {
    lexical_join_31: {
    lexical_join_12: {
    life1_3 = (net.minecraft.client.audio.SoundManager.o ^ 102673566097689L);
    life3_5 = net.minecraft.client.audio.SoundHandler.b();
    spill1475_0 = this;
    if (!((life3_5 == null))) {
        lexicalValue1475_12_0 = spill1475_0;
        break lexical_join_12;
    }
    if (!(((net.minecraft.client.audio.SoundManager)(spill1475_0)).f)) {
        break lexical_join_49;
    }
    lexicalValue1475_12_0 = this;
    }
    life4_21 = ((java.util.Set)(((java.util.Map)(((net.minecraft.client.audio.SoundManager)(lexicalValue1475_12_0)).h)).keySet())).iterator();
    lexical_cycle_16: while (true) {
    if (!(((java.util.Iterator)(life4_21)).hasNext())) {
        break lexical_join_31;
    }
    life5_28 = ((java.lang.String)(((java.util.Iterator)(life4_21)).next()));
    ((moom.OM)(this.e)).stop(((java.lang.String)(life5_28)));
    if (!((life3_5 == null))) {
        break lexical_join_46;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    ((java.util.Map)(this.h)).clear();
    ((java.util.Map)(this.m)).clear();
    ((java.util.List)(this.l)).clear();
    ((com.google.common.collect.Multimap)(this.k)).clear();
    ((java.util.Map)(this.j)).clear();
    }
    ((java.util.Map)(this.n)).clear();
    }
    return;
}


public void a(net.minecraft.client.audio.ISound p0, int p1) {
((java.util.Map)(this.m)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)((this.g + p1)))))));
    return;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


private static java.net.URL a(moom.DD p0) {
java.lang.String life1_18;
    net.minecraft.client.audio.SoundManager$2 life2_23;
    life1_18 = java.lang.String.format(((java.lang.String)("%s:%s:%s")), ((java.lang.Object[])(new java.lang.Object[] {"mcsounddomain", ((moom.DD)(p0)).b(), ((moom.DD)(p0)).a()})));
    life2_23 = new net.minecraft.client.audio.SoundManager$2(p0);
    try {
        return new java.net.URL(null, life1_18, life2_23);
    } catch (java.net.MalformedURLException life3_31) {
        throw new java.lang.Error("TODO: Sanely handle url exception! :D");
    }
}


public void a(net.minecraft.entity.player.EntityPlayer p0, float p1) {
net.minecraft.entity.player.EntityPlayer forwardValue4760_14_0;
    net.minecraft.entity.player.EntityPlayer spill4760_0;
    long life3_3;
    java.lang.String life5_5;
    float life6_29;
    float life7_40;
    double life8_52;
    double life10_68;
    double life12_80;
    float life14_87;
    float life15_94;
    float life16_100;
    float life17_106;
    float life18_114;
    float life19_122;
    float life20_126;
    float life21_130;
    float life22_134;
    float life23_138;
    forward_join_151: {
    forward_join_14: {
    life3_3 = (net.minecraft.client.audio.SoundManager.o ^ 64485684884767L);
    life5_5 = net.minecraft.client.audio.SoundHandler.b();
    if (!(this.f)) {
        break forward_join_151;
    }
    spill4760_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue4760_14_0 = spill4760_0;
        break forward_join_14;
    }
    if (!((spill4760_0 != null))) {
        break forward_join_151;
    }
    forwardValue4760_14_0 = p0;
    }
    life6_29 = (((net.minecraft.entity.player.EntityPlayer)(forwardValue4760_14_0)).z + ((((net.minecraft.entity.player.EntityPlayer)(p0)).x - ((net.minecraft.entity.player.EntityPlayer)(p0)).z) * p1));
    life7_40 = (((net.minecraft.entity.player.EntityPlayer)(p0)).y + ((((net.minecraft.entity.player.EntityPlayer)(p0)).w - ((net.minecraft.entity.player.EntityPlayer)(p0)).y) * p1));
    life8_52 = (((net.minecraft.entity.player.EntityPlayer)(p0)).k + ((((net.minecraft.entity.player.EntityPlayer)(p0)).n - ((net.minecraft.entity.player.EntityPlayer)(p0)).k) * ((double) p1)));
    life10_68 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).l + ((((net.minecraft.entity.player.EntityPlayer)(p0)).o - ((net.minecraft.entity.player.EntityPlayer)(p0)).l) * ((double) p1))) + ((double) ((net.minecraft.entity.player.EntityPlayer)(p0)).e__Float()));
    life12_80 = (((net.minecraft.entity.player.EntityPlayer)(p0)).m + ((((net.minecraft.entity.player.EntityPlayer)(p0)).p - ((net.minecraft.entity.player.EntityPlayer)(p0)).m) * ((double) p1)));
    life14_87 = moom.Dr.b(((float)(((life7_40 + 0x1.68p6f) * 0x1.1df46ap-6f))));
    life15_94 = moom.Dr.a(((float)(((life7_40 + 0x1.68p6f) * 0x1.1df46ap-6f))));
    life16_100 = moom.Dr.b(((float)(((-life6_29) * 0x1.1df46ap-6f))));
    life17_106 = moom.Dr.a(((float)(((-life6_29) * 0x1.1df46ap-6f))));
    life18_114 = moom.Dr.b(((float)((((-life6_29) + 0x1.68p6f) * 0x1.1df46ap-6f))));
    life19_122 = moom.Dr.a(((float)((((-life6_29) + 0x1.68p6f) * 0x1.1df46ap-6f))));
    life20_126 = (life14_87 * life16_100);
    life21_130 = (life15_94 * life16_100);
    life22_134 = (life14_87 * life18_114);
    life23_138 = (life15_94 * life18_114);
    ((moom.OM)(this.e)).setListenerPosition(((float)(((float) life8_52))), ((float)(((float) life10_68))), ((float)(((float) life12_80))));
    ((moom.OM)(this.e)).setListenerOrientation(((float)(life20_126)), ((float)(life17_106)), ((float)(life21_130)), ((float)(life22_134)), ((float)(life19_122)), ((float)(life23_138)));
    }
    return;
}


public void a() {
((net.minecraft.client.audio.SoundManager)(this)).c();
    ((net.minecraft.client.audio.SoundManager)(this)).b();
    return;
}


public void a(net.minecraft.client.audio.ISound p0) {
java.lang.Object forwardValue4757_15_0;
    net.minecraft.client.audio.SoundManager spill4757_0;
    long life2_3;
    java.lang.String life4_5;
    java.lang.String life5_22;
    forward_join_23: {
    forward_join_15: {
    life2_3 = (net.minecraft.client.audio.SoundManager.o ^ 64245694813938L);
    life4_5 = net.minecraft.client.audio.SoundHandler.b();
    spill4757_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4757_15_0 = spill4757_0;
        break forward_join_15;
    }
    if (!(((net.minecraft.client.audio.SoundManager)(spill4757_0)).f)) {
        break forward_join_23;
    }
    forwardValue4757_15_0 = ((java.util.Map)(this.i)).get(((java.lang.Object)(p0)));
    }
    life5_22 = ((java.lang.String)(forwardValue4757_15_0));
    if (!((life5_22 != null))) {
        break forward_join_23;
    }
    ((moom.OM)(this.e)).stop(((java.lang.String)(life5_22)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.client.audio.ISound p0) {
java.lang.Object forwardValue4761_17_0;
    int forwardValue4761_41_0;
    int forwardValue4761_47_0;
    int forwardValue4761_49_0;
    net.minecraft.client.audio.SoundManager spill4761_0;
    boolean spill4761_1;
    boolean spill4761_2;
    long life2_3;
    java.lang.String life4_5;
    java.lang.String life5_23;
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_41: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (net.minecraft.client.audio.SoundManager.o ^ 139377167568821L);
    life4_5 = net.minecraft.client.audio.SoundHandler.b();
    spill4761_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4761_17_0 = spill4761_0;
        break forward_join_17;
    }
    if (!((!((net.minecraft.client.audio.SoundManager)(spill4761_0)).f))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue4761_17_0 = ((java.util.Map)(this.i)).get(((java.lang.Object)(p0)));
    }
    life5_23 = ((java.lang.String)(forwardValue4761_17_0));
    if (!((life5_23 != null))) {
        break forward_join_48;
    }
    spill4761_1 = ((moom.OM)(this.e)).playing(((java.lang.String)(life5_23)));
    if (!((life4_5 == null))) {
        forwardValue4761_47_0 = ((spill4761_1) ? 1 : 0);
        break forward_join_47;
    }
    if (!((!spill4761_1))) {
        break forward_join_46;
    }
    spill4761_2 = ((java.util.Map)(this.n)).containsKey(((java.lang.Object)(life5_23)));
    if (!((life4_5 == null))) {
        forwardValue4761_41_0 = ((spill4761_2) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill4761_2)) {
        break forward_join_48;
    }
    forwardValue4761_41_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(this.n)).get(((java.lang.Object)(life5_23))))))).intValue();
    }
    if (!((life4_5 == null))) {
        forwardValue4761_47_0 = forwardValue4761_41_0;
        break forward_join_47;
    }
    if (!((forwardValue4761_41_0 <= this.g))) {
        break forward_join_48;
    }
    }
    forwardValue4761_47_0 = 1;
    }
    forwardValue4761_49_0 = forwardValue4761_47_0;
    break forward_join_49;
    }
    forwardValue4761_49_0 = 0;
    }
    return ((forwardValue4761_49_0) != 0);
}


public void a(net.minecraft.client.audio.SoundCategory p0, float p1) {
long life3_3;
    java.lang.String life5_5;
    java.util.Iterator life6_29;
    java.lang.String life7_36;
    net.minecraft.client.audio.ISound life8_42;
    float life9_52;
    lexical_join_65: {
    lexical_join_18: {
    life3_3 = (net.minecraft.client.audio.SoundManager.o ^ 36670471345652L);
    life5_5 = net.minecraft.client.audio.SoundHandler.b();
    if (!(this.f)) {
        break lexical_join_65;
    }
    if (!((p0 == net.minecraft.client.audio.SoundCategory.MASTER))) {
        break lexical_join_18;
    }
    ((moom.OM)(this.e)).setMasterVolume(((float)(p1)));
    if (!((life5_5 != null))) {
        break lexical_join_65;
    }
    }
    life6_29 = ((java.util.Collection)(((com.google.common.collect.Multimap)(this.k)).get(((java.lang.Object)(p0))))).iterator();
    lexical_cycle_24: while (true) {
    lexical_join_63: {
    lexical_join_58: {
    lexical_join_56: {
    if (!(((java.util.Iterator)(life6_29)).hasNext())) {
        break lexical_join_65;
    }
    life7_36 = ((java.lang.String)(((java.util.Iterator)(life6_29)).next()));
    life8_42 = ((net.minecraft.client.audio.ISound)(((java.util.Map)(this.h)).get(((java.lang.Object)(life7_36)))));
    life9_52 = ((net.minecraft.client.audio.SoundManager)(this)).a(((net.minecraft.client.audio.ISound)(life8_42)), ((net.minecraft.client.audio.SoundPoolEntry)(((net.minecraft.client.audio.SoundPoolEntry)(((java.util.Map)(this.j)).get(((java.lang.Object)(life8_42))))))), ((net.minecraft.client.audio.SoundCategory)(p0)));
    if (!((life5_5 == null))) {
        break lexical_join_56;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life9_52)), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_58;
    }
    ((net.minecraft.client.audio.SoundManager)(this)).a(((net.minecraft.client.audio.ISound)(life8_42)));
    }
    if (!((life5_5 != null))) {
        break lexical_join_63;
    }
    }
    ((moom.OM)(this.e)).setVolume(((java.lang.String)(life7_36)), ((float)(life9_52)));
    }
    if (!((life5_5 != null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    return;
}


private float a(net.minecraft.client.audio.SoundCategory p0) {
net.minecraft.client.audio.SoundCategory forwardValue4758_11_0;
    float forwardValue4758_19_0;
    net.minecraft.client.audio.SoundCategory spill4758_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_11: {
    life2_3 = (net.minecraft.client.audio.SoundManager.o ^ 115685076931788L);
    life4_5 = net.minecraft.client.audio.SoundHandler.b();
    spill4758_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4758_11_0 = spill4758_0;
        break forward_join_11;
    }
    if (!((spill4758_0 != null))) {
        break forward_join_18;
    }
    forwardValue4758_11_0 = p0;
    }
    if (!((forwardValue4758_11_0 != net.minecraft.client.audio.SoundCategory.MASTER))) {
        break forward_join_18;
    }
    forwardValue4758_19_0 = ((net.minecraft.client.settings.GameSettings)(this.d)).a(((net.minecraft.client.audio.SoundCategory)(p0)));
    break forward_join_19;
    }
    forwardValue4758_19_0 = 0x1.0p0f;
    }
    return forwardValue4758_19_0;
}


private float a(net.minecraft.client.audio.ISound p0, net.minecraft.client.audio.SoundPoolEntry p1, net.minecraft.client.audio.SoundCategory p2) {
return (((float) moom.Dr.a(((double)((((double) ((net.minecraft.client.audio.ISound)(p0)).a()) * ((net.minecraft.client.audio.SoundPoolEntry)(p1)).b()))), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)))) * ((net.minecraft.client.audio.SoundManager)(this)).a(((net.minecraft.client.audio.SoundCategory)(p2))));
}


private float a(net.minecraft.client.audio.ISound p0, net.minecraft.client.audio.SoundPoolEntry p1) {
return ((float) moom.Dr.a(((double)((((double) ((net.minecraft.client.audio.ISound)(p0)).b()) * ((net.minecraft.client.audio.SoundPoolEntry)(p1)).a()))), ((double)(0x1.0p-1d)), ((double)(0x1.0p1d))));
}


public void g() {
java.lang.String spill1477_0;
    long life1_3;
    java.util.Iterator life4_9;
    java.lang.String life3_10;
    java.lang.String life5_17;
    lexical_join_34: {
    life1_3 = (net.minecraft.client.audio.SoundManager.o ^ 132769786668840L);
    spill1477_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_9 = ((java.util.Set)(((java.util.Map)(this.h)).keySet())).iterator();
    life3_10 = spill1477_0;
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life4_9)).hasNext())) {
        break lexical_join_34;
    }
    life5_17 = ((java.lang.String)(((java.util.Iterator)(life4_9)).next()));
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).debug(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Resuming channel {}")), ((java.lang.Object[])(new java.lang.Object[] {life5_17})));
    ((moom.OM)(this.e)).play(((java.lang.String)(life5_17)));
    if (!((life3_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private void lambda$loadSoundSystem$0() {
paulscode.sound.SoundSystemConfig.setLogger(((paulscode.sound.SoundSystemLogger)(new moom.ON(this))));
    this.e = ((moom.OM)(new moom.OM()));
    this.f = ((boolean)(true));
    ((moom.OM)(this.e)).setMasterVolume(((float)(((net.minecraft.client.settings.GameSettings)(this.d)).a(((net.minecraft.client.audio.SoundCategory)(net.minecraft.client.audio.SoundCategory.MASTER))))));
    ((org.apache.logging.log4j.Logger)(net.minecraft.client.audio.SoundManager.b)).info(((org.apache.logging.log4j.Marker)(net.minecraft.client.audio.SoundManager.a)), ((java.lang.String)("Sound engine started")));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
