package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hF {

private static net.minecraft.client.Minecraft a;

private int b;

private double c;

private com.moon.hH d;

private java.util.BitSet e;

private com.moon.n5[] f;

private com.moon.n5 g;

private int[] h;

private boolean[] i;

private boolean j;

private int[] k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public hF(int p0) { this(0, (com.moon.hH)null, 0.0D); __sourceHandlerCall_d83cdb1952c5d7bbf9ab(this, p0); }


public hF(int p0, com.moon.hH p1, double p2) { super(); }

private static void __sourceConstructorBody_675cf85c30b5effa(com.moon.hF receiver, int p0, com.moon.hH p1, double p2) throws Throwable {
init_join_80: {
    long local5_life2 = (com.moon.hF.l ^ 123702431993074L);
    com.moon.hF.__sourceConstructorInit_675cf85c30b5effa_0(((com.moon.hF)(receiver)));
    ((com.moon.hF)(receiver)).e = ((java.util.BitSet)(new java.util.BitSet()));
    boolean __sourceSpill34_9 = com.moon.hE.b();
    ((com.moon.hF)(receiver)).f = ((com.moon.n5[])(new com.moon.n5[__sourceIntrinsic_675cf85c30b5effa_originalDynamicSite34_7(27966, (9057228160509644027L ^ local5_life2))]));
    ((com.moon.hF)(receiver)).g = ((com.moon.n5)(new com.moon.n5(0x0.0p0d, 0x0.0p0d, 0x0.0p0d)));
    ((com.moon.hF)(receiver)).h = ((int[])(new int[3]));
    boolean local7_life12 = __sourceSpill34_9;
    ((com.moon.hF)(receiver)).i = ((boolean[])(new boolean[__sourceIntrinsic_675cf85c30b5effa_originalDynamicSite34_14(25183, (5884985977935790985L ^ local5_life2))]));
    ((com.moon.hF)(receiver)).j = ((boolean)(false));
    ((com.moon.hF)(receiver)).k = ((int[])(new int[3]));
    ((com.moon.hF)(receiver)).b = ((int)(p0));
    ((com.moon.hF)(receiver)).d = ((com.moon.hH)(p1));
    ((com.moon.hF)(receiver)).c = ((double)(p2));
    int local8_life21 = 0;
    init_cycle_59: while (true) {
    if (!((local8_life21 < (((com.moon.hF)(receiver)).f).length))) {
        break init_join_80;
    }
    (((com.moon.hF)(receiver)).f)[local8_life21] = new com.moon.n5(0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    local8_life21 += 1;
    if (!((!local7_life12))) { continue init_cycle_59; }
    break init_cycle_59;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-1124435148161650172L)), ((long)(2180445006602029521L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(30540591287448L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.hF.l ^ 40299013625958L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill227_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill227_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill227_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill227_14 = new byte[8];
    (__sourceSpill227_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill227_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation227_16 = __sourceSpill227_14;
    ((javax.crypto.Cipher)(__sourceSpill227_11)).init(((int)(__sourceSpill227_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill227_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation227_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[28];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "äÆêC\"gkz1\036gåYIWç³3kÑ5ªc\035AW%.\022<Ô°ñ¹\003èþ¤EÃ$SHWBê\000í\025xyó+J\020\005´wm@MQj¡ª>j¬¹ÊçCg%\037à\037v£a9¶kf¢EºßW¤$Ü¤Ä\027æ'É\007åÜð ?ßãz\007å¹>}¾òò®Å\006_ìºNc^ìIÌ}\006BÄµx°Í|:ûw\026«ôc\036\0315\013©#È\002\004Nù?}Aa0+ÿÝú©5d82\006\026ôÈÌÀ\013Ã~ÄÖ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill227_25 = local6_life21;
        int __sourceSpill227_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill227_25)).substring(((int)(__sourceSpill227_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill227_30 = local8_life19;
        int __sourceSpill227_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill227_33 = new byte[8];
        (__sourceSpill227_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill227_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill227_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill227_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill227_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill227_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill227_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill227_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill227_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill227_34)).doFinal(((byte[])(__sourceSpill227_33)));
        (__sourceSpill227_30)[__sourceSpill227_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "k´}\027¥U¡%QåÆ7õY"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill227_38 = local6_life21;
        int __sourceSpill227_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill227_38)).substring(((int)(__sourceSpill227_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill227_43 = local8_life19;
        int __sourceSpill227_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill227_46 = new byte[8];
        (__sourceSpill227_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill227_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill227_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill227_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill227_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill227_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill227_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill227_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill227_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill227_47)).doFinal(((byte[])(__sourceSpill227_46)));
        (__sourceSpill227_43)[__sourceSpill227_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[28]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceConstructorInit_675cf85c30b5effa_0(com.moon.hF a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_d83cdb1952c5d7bbf9ab(com.moon.hF a0, int a1) throws E;
private static final class __SourceHandler_d83cdb1952c5d7bbf9ab {

public static void f21(com.moon.hF receiver, int p0) throws Throwable {
    boolean spill21_0;
    long life2_3;
    int life4_13;
    life2_3 = (__fieldRead21_0() ^ 670205681336L);
    spill21_0 = __call21_1();
    __directThisInit21_2(receiver, p0, new com.moon.hG(p0), 0x1.999999999999ap-4d);
    life4_13 = __integerCategory21_3(spill21_0);
    if ((__call21_4() != null)) {
        __call21_5(((life4_13 != 0) ? 0 : 1));
    } else {
        
    }
    return;
}
public static void h21_0(moom.Oo p0) throws Throwable {
    throw __call3002100_0(p0);
}
public static void h21_1(moom.Oo p0) throws Throwable {
    throw __call3002101_0(p0);
}
private static native long __fieldRead21_0() throws Throwable;
private static native boolean __call21_1() throws Throwable;
private static native void __directThisInit21_2(com.moon.hF a0, int a1, com.moon.hH a2, double a3) throws Throwable;
private static native int __integerCategory21_3(boolean value) throws Throwable;
private static native java.lang.String[] __call21_4() throws Throwable;
private static native void __call21_5(int a0) throws Throwable;
private static native java.lang.Throwable __call3002100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_47516c413be333d012b8(com.moon.hF a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_47516c413be333d012b8 {

public static int f456(com.moon.hF receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue456_55_0;
    int forwardValue456_71_0;
    boolean spill456_0;
    int spill456_1;
    int spill456_2;
    int spill456_3;
    long life4_3;
    int life1_10;
    int life2_18;
    int life6_19;
    int life3_26;
    forward_join_71: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    life4_3 = (__fieldRead456_0() ^ 9196040422400L);
    life1_10 = (p0 - (__fieldRead456_1(receiver))[0]);
    spill456_0 = __call456_2();
    life2_18 = (p1 - (__fieldRead456_3(receiver))[1]);
    life6_19 = __integerCategory456_4(spill456_0);
    life3_26 = (p2 - (__fieldRead456_5(receiver))[2]);
    spill456_1 = __call456_6(life1_10);
    if (!((life6_19 == 0))) {
        forwardValue456_55_0 = spill456_1;
        break forward_join_55;
    }
    if (!((spill456_1 <= (__fieldRead456_7(receiver) - 2)))) {
        break forward_join_54;
    }
    spill456_2 = __call456_8(life2_18);
    if (!((life6_19 == 0))) {
        forwardValue456_55_0 = spill456_2;
        break forward_join_55;
    }
    if (!((spill456_2 <= (__fieldRead456_9(receiver) - 2)))) {
        break forward_join_54;
    }
    spill456_3 = __call456_10(life3_26);
    if (!((life6_19 == 0))) {
        forwardValue456_71_0 = spill456_3;
        break forward_join_71;
    }
    if (!((spill456_3 > (__fieldRead456_11(receiver) - 2)))) {
        break forward_join_56;
    }
    }
    forwardValue456_55_0 = -1;
    }
    return forwardValue456_55_0;
    }
    forwardValue456_71_0 = __call456_16(__fieldRead456_12(receiver), (life1_10 + __fieldRead456_13(receiver)), (life2_18 + __fieldRead456_14(receiver)), (life3_26 + __fieldRead456_15(receiver)));
    }
    return forwardValue456_71_0;
}
public static void h456_0(moom.Oo p0) throws Throwable {
    throw __call1045600_0(p0);
}
public static void h456_1(moom.Oo p0) throws Throwable {
    throw __call1045601_0(p0);
}
public static void h456_2(moom.Oo p0) throws Throwable {
    throw __call1045602_0(p0);
}
public static void h456_3(moom.Oo p0) throws Throwable {
    throw __call1045603_0(p0);
}
public static void h456_4(moom.Oo p0) throws Throwable {
    throw __call1045604_0(p0);
}
public static void h456_5(moom.Oo p0) throws Throwable {
    throw __call1045605_0(p0);
}
private static native long __fieldRead456_0() throws Throwable;
private static native int[] __fieldRead456_1(com.moon.hF a0) throws Throwable;
private static native boolean __call456_2() throws Throwable;
private static native int[] __fieldRead456_3(com.moon.hF a0) throws Throwable;
private static native int __integerCategory456_4(boolean value) throws Throwable;
private static native int[] __fieldRead456_5(com.moon.hF a0) throws Throwable;
private static native int __call456_6(int a0) throws Throwable;
private static native int __fieldRead456_7(com.moon.hF a0) throws Throwable;
private static native int __call456_8(int a0) throws Throwable;
private static native int __fieldRead456_9(com.moon.hF a0) throws Throwable;
private static native int __call456_10(int a0) throws Throwable;
private static native int __fieldRead456_11(com.moon.hF a0) throws Throwable;
private static native com.moon.hH __fieldRead456_12(com.moon.hF a0) throws Throwable;
private static native int __fieldRead456_13(com.moon.hF a0) throws Throwable;
private static native int __fieldRead456_14(com.moon.hF a0) throws Throwable;
private static native int __fieldRead456_15(com.moon.hF a0) throws Throwable;
private static native int __call456_16(com.moon.hH a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1045600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045605_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ae4ff0cc8ff85ac850e7(com.moon.hF a0, int a1, int a2, int a3, boolean a4) throws E;
private static final class __SourceHandler_ae4ff0cc8ff85ac850e7 {

public static void f457(com.moon.hF receiver, int p0, int p1, int p2, boolean p3) throws Throwable {
    long life5_3;
    int life8_14;
    int life7_15;
    int life9_25;
    int life10_35;
    forward_join_54: {
    forward_join_48: {
    forward_join_46: {
    life5_3 = (__fieldRead457_0() ^ 53099618606946L);
    boolean spill457_0 = __call457_1();
    life8_14 = ((p0 - (__fieldRead457_2(receiver))[0]) + __fieldRead457_3(receiver));
    life7_15 = __integerCategory457_4(spill457_0);
    life9_25 = ((p1 - (__fieldRead457_5(receiver))[1]) + __fieldRead457_6(receiver));
    life10_35 = ((p2 - (__fieldRead457_7(receiver))[2]) + __fieldRead457_8(receiver));
    if (!((life7_15 != 0))) { break forward_join_46; }
    if (!(p3)) { break forward_join_48; }
    __call457_10(__fieldRead457_9(receiver), life8_14, life9_25, life10_35);
    }
    if (!((life7_15 == 0))) { break forward_join_54; }
    }
    __call457_12(__fieldRead457_11(receiver), life8_14, life9_25, life10_35);
    }
    return;
}
public static void h457_0(moom.Oo p0) throws Throwable {
    throw __call1045700_0(p0);
}
public static void h457_1(moom.Oo p0) throws Throwable {
    throw __call1045701_0(p0);
}
public static void h457_2(moom.Oo p0) throws Throwable {
    throw __call1045702_0(p0);
}
private static native long __fieldRead457_0() throws Throwable;
private static native boolean __call457_1() throws Throwable;
private static native int[] __fieldRead457_2(com.moon.hF a0) throws Throwable;
private static native int __fieldRead457_3(com.moon.hF a0) throws Throwable;
private static native int __integerCategory457_4(boolean value) throws Throwable;
private static native int[] __fieldRead457_5(com.moon.hF a0) throws Throwable;
private static native int __fieldRead457_6(com.moon.hF a0) throws Throwable;
private static native int[] __fieldRead457_7(com.moon.hF a0) throws Throwable;
private static native int __fieldRead457_8(com.moon.hF a0) throws Throwable;
private static native com.moon.hH __fieldRead457_9(com.moon.hF a0) throws Throwable;
private static native void __call457_10(com.moon.hH a0, int a1, int a2, int a3) throws Throwable;
private static native com.moon.hH __fieldRead457_11(com.moon.hF a0) throws Throwable;
private static native void __call457_12(com.moon.hH a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1045700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045702_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7967814def57791e6423(com.moon.hF a0, com.moon.n5 a1, int a2, int a3, int a4, double a5, double a6, double a7, int a8, int a9, int a10, int a11, double a12, double a13, double a14) throws E;
private static final class __SourceHandler_7967814def57791e6423 {

public static boolean f458(com.moon.hF receiver, com.moon.n5 p0, int p1, int p2, int p3, double p4, double p5, double p6, int p7, int p8, int p9, int p10, double p11, double p12, double p13) throws Throwable {
    int lexicalValue458_40_0;
    int lexicalValue458_91_0;
    int lexicalValue458_98_0;
    int lexicalValue458_120_0;
    int lexicalValue458_142_0;
    int lexicalValue458_151_0;
    int spill458_0;
    boolean spill458_1;
    int spill458_2;
    int spill458_3;
    long life21_3;
    int life23_5;
    int life24_14;
    int life25_57;
    int life26_61;
    moom.DT life27_75;
    lexical_join_151: {
    lexical_join_150: {
    life21_3 = (__fieldRead458_0() ^ 80793339690120L);
    life23_5 = __integerCategory458_2(__call458_1());
    lexical_cycle_6: while (true) {
    lexical_join_147: {
    lexical_join_142: {
    lexical_join_139: {
    lexical_join_120: {
    lexical_join_117: {
    lexical_join_98: {
    lexical_join_95: {
    lexical_join_92: {
    lexical_join_91: {
    lexical_join_56: {
    lexical_join_40: {
    lexical_join_39: {
    if (!((p7 > 1))) {
        break lexical_join_150;
    }
    life24_14 = __call458_3(receiver, p1, p2, p3);
    spill458_0 = life24_14;
    if (!((life23_5 != 0))) {
        lexicalValue458_151_0 = spill458_0;
        break lexical_join_151;
    }
    if (!((life23_5 != 0))) {
        lexicalValue458_40_0 = spill458_0;
        break lexical_join_40;
    }
    if (!((spill458_0 == 2))) {
        break lexical_join_39;
    }
    (__fieldRead458_4(receiver))[0] = p1;
    (__fieldRead458_5(receiver))[1] = p2;
    (__fieldRead458_6(receiver))[2] = p3;
    return __integerCategory458_7(0);
    }
    lexicalValue458_40_0 = life24_14;
    }
    if (!((life23_5 != 0))) {
        lexicalValue458_98_0 = lexicalValue458_40_0;
        break lexical_join_98;
    }
    if (!((lexicalValue458_40_0 == 0))) {
        break lexical_join_95;
    }
    life25_57 = (p1 >> 4);
    life26_61 = (p3 >> 4);
    if (!((__fieldRead458_9(__fieldRead458_8()) == null))) {
        break lexical_join_56;
    }
    return __integerCategory458_10(0);
    }
    life27_75 = new moom.DT(p1, p2, p3);
    spill458_1 = __call458_15(__call458_14(__call458_13(__fieldRead458_12(__fieldRead458_11()), life27_75)));
    if (!((life23_5 != 0))) {
        lexicalValue458_91_0 = __integerCategory458_16(spill458_1);
        break lexical_join_91;
    }
    if (!(spill458_1)) {
        break lexical_join_92;
    }
    __call458_18(__fieldRead458_17(receiver));
    (__fieldRead458_19(receiver))[0] = p1;
    (__fieldRead458_20(receiver))[1] = p2;
    (__fieldRead458_21(receiver))[2] = p3;
    lexicalValue458_91_0 = 0;
    }
    return __integerCategory458_22(lexicalValue458_91_0);
    }
    __call458_24(__fieldRead458_23(receiver));
    }
    lexicalValue458_98_0 = __numericCompare458_25(p11, p12);
    }
    if (!((life23_5 != 0))) {
        lexicalValue458_120_0 = lexicalValue458_98_0;
        break lexical_join_120;
    }
    if (!((lexicalValue458_98_0 < 0))) {
        break lexical_join_117;
    }
    spill458_2 = __numericCompare458_26(p11, p13);
    if (!((life23_5 != 0))) {
        lexicalValue458_120_0 = spill458_2;
        break lexical_join_120;
    }
    if (!((spill458_2 < 0))) {
        break lexical_join_117;
    }
    p2 = (p2 + p9);
    p11 = (p11 + p5);
    if (!((life23_5 == 0))) {
        break lexical_join_147;
    }
    }
    lexicalValue458_120_0 = __numericCompare458_27(p12, p11);
    }
    if (!((life23_5 != 0))) {
        lexicalValue458_142_0 = lexicalValue458_120_0;
        break lexical_join_142;
    }
    if (!((lexicalValue458_120_0 < 0))) {
        break lexical_join_139;
    }
    spill458_3 = __numericCompare458_28(p12, p13);
    if (!((life23_5 != 0))) {
        lexicalValue458_142_0 = spill458_3;
        break lexical_join_142;
    }
    if (!((spill458_3 < 0))) {
        break lexical_join_139;
    }
    p1 = (p1 + p8);
    p12 = (p12 + p4);
    if (!((life23_5 == 0))) {
        break lexical_join_147;
    }
    }
    lexicalValue458_142_0 = (p3 + p10);
    }
    p3 = lexicalValue458_142_0;
    p13 = (p13 + p6);
    }
    p7 += -1;
    if (!((life23_5 == 0))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexicalValue458_151_0 = 1;
    }
    return __integerCategory458_29(lexicalValue458_151_0);
}
public static void h458_0(moom.Oo p0) throws Throwable {
    throw __call1045800_0(p0);
}
public static void h458_1(moom.Oo p0) throws Throwable {
    throw __call1045801_0(p0);
}
public static void h458_2(moom.Oo p0) throws Throwable {
    throw __call1045802_0(p0);
}
public static void h458_3(moom.Oo p0) throws Throwable {
    throw __call1045803_0(p0);
}
public static void h458_4(moom.Oo p0) throws Throwable {
    throw __call1045804_0(p0);
}
public static void h458_5(moom.Oo p0) throws Throwable {
    throw __call1045805_0(p0);
}
public static void h458_6(moom.Oo p0) throws Throwable {
    throw __call1045806_0(p0);
}
public static void h458_7(moom.Oo p0) throws Throwable {
    throw __call1045807_0(p0);
}
public static void h458_8(moom.Oo p0) throws Throwable {
    throw __call1045808_0(p0);
}
public static void h458_9(moom.Oo p0) throws Throwable {
    throw __call1045809_0(p0);
}
public static void h458_10(moom.Oo p0) throws Throwable {
    throw __call1045810_0(p0);
}
public static void h458_11(moom.Oo p0) throws Throwable {
    throw __call1045811_0(p0);
}
public static void h458_12(moom.Oo p0) throws Throwable {
    throw __call1045812_0(p0);
}
public static void h458_13(moom.Oo p0) throws Throwable {
    throw __call1045813_0(p0);
}
public static void h458_14(moom.Oo p0) throws Throwable {
    throw __call1045814_0(p0);
}
private static native long __fieldRead458_0() throws Throwable;
private static native boolean __call458_1() throws Throwable;
private static native int __integerCategory458_2(boolean value) throws Throwable;
private static native int __call458_3(com.moon.hF a0, int a1, int a2, int a3) throws Throwable;
private static native int[] __fieldRead458_4(com.moon.hF a0) throws Throwable;
private static native int[] __fieldRead458_5(com.moon.hF a0) throws Throwable;
private static native int[] __fieldRead458_6(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory458_7(int value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead458_8() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead458_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __integerCategory458_10(int value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead458_11() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead458_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call458_13(net.minecraft.client.multiplayer.WorldClient a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call458_14(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call458_15(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory458_16(boolean value) throws Throwable;
private static native com.moon.hH __fieldRead458_17(com.moon.hF a0) throws Throwable;
private static native void __call458_18(com.moon.hH a0) throws Throwable;
private static native int[] __fieldRead458_19(com.moon.hF a0) throws Throwable;
private static native int[] __fieldRead458_20(com.moon.hF a0) throws Throwable;
private static native int[] __fieldRead458_21(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory458_22(int value) throws Throwable;
private static native com.moon.hH __fieldRead458_23(com.moon.hF a0) throws Throwable;
private static native void __call458_24(com.moon.hH a0) throws Throwable;
private static native int __numericCompare458_25(double a0, double a1) throws Throwable;
private static native int __numericCompare458_26(double a0, double a1) throws Throwable;
private static native int __numericCompare458_27(double a0, double a1) throws Throwable;
private static native int __numericCompare458_28(double a0, double a1) throws Throwable;
private static native boolean __integerCategory458_29(int value) throws Throwable;
private static native java.lang.Throwable __call1045800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045811_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045812_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045813_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045814_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c4a3521dd0a8a5308177(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, byte a3, byte a4) throws E;
private static final class __SourceHandler_c4a3521dd0a8a5308177 {

public static boolean f33(com.moon.hF receiver, com.moon.n5 p0, com.moon.n5 p1, byte p2, byte p3) throws Throwable {
    boolean[] forwardValue33_57_0;
    int forwardValue33_57_1;
    int forwardValue33_57_2;
    int forwardValue33_62_0;
    int forwardValue33_62_1;
    boolean[] forwardValue33_107_0;
    int forwardValue33_107_1;
    int forwardValue33_107_2;
    int forwardValue33_120_0;
    int forwardValue33_120_1;
    boolean[] forwardValue33_161_0;
    int forwardValue33_161_1;
    int forwardValue33_161_2;
    int forwardValue33_166_0;
    int forwardValue33_166_1;
    boolean[] forwardValue33_215_0;
    int forwardValue33_215_1;
    int forwardValue33_215_2;
    int forwardValue33_228_0;
    int forwardValue33_228_1;
    boolean[] forwardValue33_273_0;
    int forwardValue33_273_1;
    int forwardValue33_273_2;
    int forwardValue33_288_0;
    int forwardValue33_288_1;
    boolean[] forwardValue33_335_0;
    int forwardValue33_335_1;
    int forwardValue33_335_2;
    int forwardValue33_340_0;
    int forwardValue33_357_0;
    int forwardValue33_374_0;
    int forwardValue33_391_0;
    int forwardValue33_408_0;
    int forwardValue33_425_0;
    int forwardValue33_446_0;
    int forwardValue33_467_0;
    int forwardValue33_488_0;
    int forwardValue33_509_0;
    int forwardValue33_530_0;
    int forwardValue33_551_0;
    int forwardValue33_572_0;
    int forwardValue33_593_0;
    int forwardValue33_612_0;
    boolean spill33_0;
    int spill33_1;
    int spill33_2;
    boolean[] spill33_3;
    int spill33_4;
    int spill33_5;
    boolean[] spill33_6;
    int spill33_7;
    int spill33_8;
    boolean[] spill33_9;
    int spill33_10;
    int spill33_11;
    boolean[] spill33_12;
    int spill33_13;
    int spill33_14;
    boolean[] spill33_15;
    int spill33_16;
    int spill33_17;
    int spill33_18;
    boolean[] spill33_19;
    int spill33_20;
    int spill33_21;
    long life5_3;
    int life8_6;
    int life7_7;
    forward_join_612: {
    forward_join_606: {
    forward_join_593: {
    forward_join_585: {
    forward_join_572: {
    forward_join_564: {
    forward_join_551: {
    forward_join_543: {
    forward_join_530: {
    forward_join_522: {
    forward_join_509: {
    forward_join_501: {
    forward_join_488: {
    forward_join_480: {
    forward_join_467: {
    forward_join_459: {
    forward_join_446: {
    forward_join_438: {
    forward_join_425: {
    forward_join_421: {
    forward_join_408: {
    forward_join_404: {
    forward_join_391: {
    forward_join_387: {
    forward_join_374: {
    forward_join_370: {
    forward_join_357: {
    forward_join_353: {
    forward_join_340: {
    forward_join_336: {
    forward_join_335: {
    forward_join_327: {
    forward_join_288: {
    forward_join_274: {
    forward_join_273: {
    forward_join_265: {
    forward_join_228: {
    forward_join_216: {
    forward_join_215: {
    forward_join_207: {
    forward_join_166: {
    forward_join_162: {
    forward_join_161: {
    forward_join_153: {
    forward_join_120: {
    forward_join_108: {
    forward_join_107: {
    forward_join_99: {
    forward_join_62: {
    forward_join_58: {
    forward_join_57: {
    forward_join_49: {
    life5_3 = (__fieldRead33_0() ^ 15615926451451L);
    spill33_0 = __call33_1();
    life8_6 = 0;
    life7_7 = __integerCategory33_2(spill33_0);
    __call33_4(__fieldRead33_3(receiver), 0);
    spill33_1 = (p3 & 1);
    spill33_2 = 1;
    if (!((life7_7 != 0))) {
        forwardValue33_62_0 = spill33_1;
        forwardValue33_62_1 = spill33_2;
        break forward_join_62;
    }
    if (!((spill33_1 == spill33_2))) {
        break forward_join_58;
    }
    spill33_3 = __fieldRead33_5(receiver);
    spill33_4 = 0;
    spill33_5 = 1;
    if (!((life7_7 != 0))) {
        forwardValue33_57_0 = spill33_3;
        forwardValue33_57_1 = spill33_4;
        forwardValue33_57_2 = spill33_5;
        break forward_join_57;
    }
    (spill33_3)[spill33_4] = __integerCategory33_6(spill33_5);
    if (!(((p2 & __invokedynamic33_7(19192, (4772635142669327155L ^ life5_3))) != 0))) {
        break forward_join_49;
    }
    (__fieldRead33_8(receiver))[1] = __integerCategory33_9(1);
    (__fieldRead33_10(receiver))[4] = __integerCategory33_11(1);
    (__fieldRead33_12(receiver))[5] = __integerCategory33_13(1);
    }
    forwardValue33_57_0 = __fieldRead33_14(receiver);
    forwardValue33_57_1 = __invokedynamic33_15(26118, (177769872680253393L ^ life5_3));
    forwardValue33_57_2 = 1;
    }
    (forwardValue33_57_0)[forwardValue33_57_1] = __integerCategory33_16(forwardValue33_57_2);
    }
    forwardValue33_62_0 = (p3 & 4);
    forwardValue33_62_1 = 4;
    }
    if (!((life7_7 != 0))) {
        forwardValue33_120_0 = forwardValue33_62_0;
        forwardValue33_120_1 = forwardValue33_62_1;
        break forward_join_120;
    }
    if (!((forwardValue33_62_0 == forwardValue33_62_1))) {
        break forward_join_108;
    }
    spill33_6 = __fieldRead33_17(receiver);
    spill33_7 = 0;
    spill33_8 = 1;
    if (!((life7_7 != 0))) {
        forwardValue33_107_0 = spill33_6;
        forwardValue33_107_1 = spill33_7;
        forwardValue33_107_2 = spill33_8;
        break forward_join_107;
    }
    (spill33_6)[spill33_7] = __integerCategory33_18(spill33_8);
    if (!(((p2 & __invokedynamic33_19(31368, (3871442095196236610L ^ life5_3))) != 0))) {
        break forward_join_99;
    }
    (__fieldRead33_20(receiver))[3] = __integerCategory33_21(1);
    (__fieldRead33_22(receiver))[4] = __integerCategory33_23(1);
    (__fieldRead33_24(receiver))[__invokedynamic33_25(19196, (4079608988142328627L ^ life5_3))] = __integerCategory33_26(1);
    }
    forwardValue33_107_0 = __fieldRead33_27(receiver);
    forwardValue33_107_1 = __invokedynamic33_28(11974, (5393815044038278918L ^ life5_3));
    forwardValue33_107_2 = 1;
    }
    (forwardValue33_107_0)[forwardValue33_107_1] = __integerCategory33_29(forwardValue33_107_2);
    }
    forwardValue33_120_0 = (p3 & __invokedynamic33_30(5586, (1886906847539659784L ^ life5_3)));
    forwardValue33_120_1 = __invokedynamic33_31(13126, (5278516256229171842L ^ life5_3));
    }
    if (!((life7_7 != 0))) {
        forwardValue33_166_0 = forwardValue33_120_0;
        forwardValue33_166_1 = forwardValue33_120_1;
        break forward_join_166;
    }
    if (!((forwardValue33_120_0 == forwardValue33_120_1))) {
        break forward_join_162;
    }
    spill33_9 = __fieldRead33_32(receiver);
    spill33_10 = 0;
    spill33_11 = 1;
    if (!((life7_7 != 0))) {
        forwardValue33_161_0 = spill33_9;
        forwardValue33_161_1 = spill33_10;
        forwardValue33_161_2 = spill33_11;
        break forward_join_161;
    }
    (spill33_9)[spill33_10] = __integerCategory33_33(spill33_11);
    if (!(((p2 & __invokedynamic33_34(244, (5956638903646425376L ^ life5_3))) != 0))) {
        break forward_join_153;
    }
    (__fieldRead33_35(receiver))[1] = __integerCategory33_36(1);
    (__fieldRead33_37(receiver))[4] = __integerCategory33_38(1);
    (__fieldRead33_39(receiver))[5] = __integerCategory33_40(1);
    }
    forwardValue33_161_0 = __fieldRead33_41(receiver);
    forwardValue33_161_1 = __invokedynamic33_42(18648, (3082384953974511902L ^ life5_3));
    forwardValue33_161_2 = 1;
    }
    (forwardValue33_161_0)[forwardValue33_161_1] = __integerCategory33_43(forwardValue33_161_2);
    }
    forwardValue33_166_0 = (p3 & 2);
    forwardValue33_166_1 = 2;
    }
    if (!((life7_7 != 0))) {
        forwardValue33_228_0 = forwardValue33_166_0;
        forwardValue33_228_1 = forwardValue33_166_1;
        break forward_join_228;
    }
    if (!((forwardValue33_166_0 == forwardValue33_166_1))) {
        break forward_join_216;
    }
    spill33_12 = __fieldRead33_44(receiver);
    spill33_13 = 4;
    spill33_14 = 1;
    if (!((life7_7 != 0))) {
        forwardValue33_215_0 = spill33_12;
        forwardValue33_215_1 = spill33_13;
        forwardValue33_215_2 = spill33_14;
        break forward_join_215;
    }
    (spill33_12)[spill33_13] = __integerCategory33_45(spill33_14);
    if (!(((p2 & __invokedynamic33_46(21875, (6136758731482907825L ^ life5_3))) != 0))) {
        break forward_join_207;
    }
    (__fieldRead33_47(receiver))[5] = __integerCategory33_48(1);
    (__fieldRead33_49(receiver))[__invokedynamic33_50(15811, (6289145939652422677L ^ life5_3))] = __integerCategory33_51(1);
    (__fieldRead33_52(receiver))[__invokedynamic33_53(449, (2891424210442784793L ^ life5_3))] = __integerCategory33_54(1);
    }
    forwardValue33_215_0 = __fieldRead33_55(receiver);
    forwardValue33_215_1 = __invokedynamic33_56(6636, (5727889382030870573L ^ life5_3));
    forwardValue33_215_2 = 1;
    }
    (forwardValue33_215_0)[forwardValue33_215_1] = __integerCategory33_57(forwardValue33_215_2);
    }
    forwardValue33_228_0 = (p3 & __invokedynamic33_58(17765, (3429950285634294946L ^ life5_3)));
    forwardValue33_228_1 = __invokedynamic33_59(17765, (3429950285634294946L ^ life5_3));
    }
    if (!((life7_7 != 0))) {
        forwardValue33_288_0 = forwardValue33_228_0;
        forwardValue33_288_1 = forwardValue33_228_1;
        break forward_join_288;
    }
    if (!((forwardValue33_228_0 == forwardValue33_228_1))) {
        break forward_join_274;
    }
    spill33_15 = __fieldRead33_60(receiver);
    spill33_16 = 1;
    spill33_17 = 1;
    if (!((life7_7 != 0))) {
        forwardValue33_273_0 = spill33_15;
        forwardValue33_273_1 = spill33_16;
        forwardValue33_273_2 = spill33_17;
        break forward_join_273;
    }
    (spill33_15)[spill33_16] = __integerCategory33_61(spill33_17);
    if (!(((p2 & __invokedynamic33_62(18647, (349221026077825298L ^ life5_3))) != 0))) {
        break forward_join_265;
    }
    (__fieldRead33_63(receiver))[2] = __integerCategory33_64(1);
    (__fieldRead33_65(receiver))[5] = __integerCategory33_66(1);
    (__fieldRead33_67(receiver))[__invokedynamic33_68(2159, (3423226437314910626L ^ life5_3))] = __integerCategory33_69(1);
    }
    forwardValue33_273_0 = __fieldRead33_70(receiver);
    forwardValue33_273_1 = __invokedynamic33_71(11301, (2033267803141717502L ^ life5_3));
    forwardValue33_273_2 = 1;
    }
    (forwardValue33_273_0)[forwardValue33_273_1] = __integerCategory33_72(forwardValue33_273_2);
    }
    spill33_18 = (p3 & __invokedynamic33_73(28886, (84865981263274250L ^ life5_3)));
    if (!((life7_7 != 0))) {
        forwardValue33_340_0 = spill33_18;
        break forward_join_340;
    }
    forwardValue33_288_0 = spill33_18;
    forwardValue33_288_1 = __invokedynamic33_74(2229, (4641738932773820780L ^ life5_3));
    }
    if (!((forwardValue33_288_0 == forwardValue33_288_1))) {
        break forward_join_336;
    }
    spill33_19 = __fieldRead33_75(receiver);
    spill33_20 = 2;
    spill33_21 = 1;
    if (!((life7_7 != 0))) {
        forwardValue33_335_0 = spill33_19;
        forwardValue33_335_1 = spill33_20;
        forwardValue33_335_2 = spill33_21;
        break forward_join_335;
    }
    (spill33_19)[spill33_20] = __integerCategory33_76(spill33_21);
    if (!(((p2 & __invokedynamic33_77(25616, (4124123385054295502L ^ life5_3))) != 0))) {
        break forward_join_327;
    }
    (__fieldRead33_78(receiver))[3] = __integerCategory33_79(1);
    (__fieldRead33_80(receiver))[__invokedynamic33_81(2159, (3423226437314910626L ^ life5_3))] = __integerCategory33_82(1);
    (__fieldRead33_83(receiver))[__invokedynamic33_84(449, (2891424210442784793L ^ life5_3))] = __integerCategory33_85(1);
    }
    forwardValue33_335_0 = __fieldRead33_86(receiver);
    forwardValue33_335_1 = __invokedynamic33_87(5287, (867108724603159908L ^ life5_3));
    forwardValue33_335_2 = 1;
    }
    (forwardValue33_335_0)[forwardValue33_335_1] = __integerCategory33_88(forwardValue33_335_2);
    }
    forwardValue33_340_0 = __integerCategory33_90((__fieldRead33_89(receiver))[0]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_357_0 = forwardValue33_340_0;
        break forward_join_357;
    }
    if (!((forwardValue33_340_0 != 0))) {
        break forward_join_353;
    }
    __call33_92((__fieldRead33_91(receiver))[(life8_6++)], p1, 0x1.999999999999ap-5d, 0x1.999999999999ap-5d, 0x1.999999999999ap-5d);
    }
    forwardValue33_357_0 = __integerCategory33_94((__fieldRead33_93(receiver))[1]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_374_0 = forwardValue33_357_0;
        break forward_join_374;
    }
    if (!((forwardValue33_357_0 != 0))) {
        break forward_join_370;
    }
    __call33_96((__fieldRead33_95(receiver))[(life8_6++)], p1, 0x1.999999999999ap-5d, 0x1.e666666666666p-1d, 0x1.999999999999ap-5d);
    }
    forwardValue33_374_0 = __integerCategory33_98((__fieldRead33_97(receiver))[2]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_391_0 = forwardValue33_374_0;
        break forward_join_391;
    }
    if (!((forwardValue33_374_0 != 0))) {
        break forward_join_387;
    }
    __call33_100((__fieldRead33_99(receiver))[(life8_6++)], p1, 0x1.999999999999ap-5d, 0x1.e666666666666p-1d, 0x1.e666666666666p-1d);
    }
    forwardValue33_391_0 = __integerCategory33_102((__fieldRead33_101(receiver))[3]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_408_0 = forwardValue33_391_0;
        break forward_join_408;
    }
    if (!((forwardValue33_391_0 != 0))) {
        break forward_join_404;
    }
    __call33_104((__fieldRead33_103(receiver))[(life8_6++)], p1, 0x1.999999999999ap-5d, 0x1.999999999999ap-5d, 0x1.e666666666666p-1d);
    }
    forwardValue33_408_0 = __integerCategory33_106((__fieldRead33_105(receiver))[4]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_425_0 = forwardValue33_408_0;
        break forward_join_425;
    }
    if (!((forwardValue33_408_0 != 0))) {
        break forward_join_421;
    }
    __call33_108((__fieldRead33_107(receiver))[(life8_6++)], p1, 0x1.e666666666666p-1d, 0x1.999999999999ap-5d, 0x1.999999999999ap-5d);
    }
    forwardValue33_425_0 = __integerCategory33_110((__fieldRead33_109(receiver))[5]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_446_0 = forwardValue33_425_0;
        break forward_join_446;
    }
    if (!((forwardValue33_425_0 != 0))) {
        break forward_join_438;
    }
    __call33_112((__fieldRead33_111(receiver))[(life8_6++)], p1, 0x1.e666666666666p-1d, 0x1.e666666666666p-1d, 0x1.999999999999ap-5d);
    }
    forwardValue33_446_0 = __integerCategory33_115((__fieldRead33_113(receiver))[__invokedynamic33_114(2159, (3423226437314910626L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_467_0 = forwardValue33_446_0;
        break forward_join_467;
    }
    if (!((forwardValue33_446_0 != 0))) {
        break forward_join_459;
    }
    __call33_117((__fieldRead33_116(receiver))[(life8_6++)], p1, 0x1.e666666666666p-1d, 0x1.e666666666666p-1d, 0x1.e666666666666p-1d);
    }
    forwardValue33_467_0 = __integerCategory33_120((__fieldRead33_118(receiver))[__invokedynamic33_119(449, (2891424210442784793L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_488_0 = forwardValue33_467_0;
        break forward_join_488;
    }
    if (!((forwardValue33_467_0 != 0))) {
        break forward_join_480;
    }
    __call33_122((__fieldRead33_121(receiver))[(life8_6++)], p1, 0x1.e666666666666p-1d, 0x1.999999999999ap-5d, 0x1.e666666666666p-1d);
    }
    forwardValue33_488_0 = __integerCategory33_125((__fieldRead33_123(receiver))[__invokedynamic33_124(17765, (3429950285634294946L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_509_0 = forwardValue33_488_0;
        break forward_join_509;
    }
    if (!((forwardValue33_488_0 != 0))) {
        break forward_join_501;
    }
    __call33_127((__fieldRead33_126(receiver))[(life8_6++)], p1, 0x1.999999999999ap-5d, 0x1.0p-1d, 0x1.0p-1d);
    }
    forwardValue33_509_0 = __integerCategory33_130((__fieldRead33_128(receiver))[__invokedynamic33_129(30811, (5233980796412586382L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_530_0 = forwardValue33_509_0;
        break forward_join_530;
    }
    if (!((forwardValue33_509_0 != 0))) {
        break forward_join_522;
    }
    __call33_132((__fieldRead33_131(receiver))[(life8_6++)], p1, 0x1.0p-1d, 0x1.999999999999ap-5d, 0x1.0p-1d);
    }
    forwardValue33_530_0 = __integerCategory33_135((__fieldRead33_133(receiver))[__invokedynamic33_134(1083, (2628060901742417397L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_551_0 = forwardValue33_530_0;
        break forward_join_551;
    }
    if (!((forwardValue33_530_0 != 0))) {
        break forward_join_543;
    }
    __call33_137((__fieldRead33_136(receiver))[(life8_6++)], p1, 0x1.0p-1d, 0x1.0p-1d, 0x1.999999999999ap-5d);
    }
    forwardValue33_551_0 = __integerCategory33_140((__fieldRead33_138(receiver))[__invokedynamic33_139(30021, (8191530856512349336L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_572_0 = forwardValue33_551_0;
        break forward_join_572;
    }
    if (!((forwardValue33_551_0 != 0))) {
        break forward_join_564;
    }
    __call33_142((__fieldRead33_141(receiver))[(life8_6++)], p1, 0x1.e666666666666p-1d, 0x1.0p-1d, 0x1.0p-1d);
    }
    forwardValue33_572_0 = __integerCategory33_145((__fieldRead33_143(receiver))[__invokedynamic33_144(180, (5969942229127565692L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_593_0 = forwardValue33_572_0;
        break forward_join_593;
    }
    if (!((forwardValue33_572_0 != 0))) {
        break forward_join_585;
    }
    __call33_147((__fieldRead33_146(receiver))[(life8_6++)], p1, 0x1.0p-1d, 0x1.e666666666666p-1d, 0x1.0p-1d);
    }
    forwardValue33_593_0 = __integerCategory33_150((__fieldRead33_148(receiver))[__invokedynamic33_149(18005, (6213048013053613980L ^ life5_3))]);
    }
    if (!((life7_7 != 0))) {
        forwardValue33_612_0 = forwardValue33_593_0;
        break forward_join_612;
    }
    if (!((forwardValue33_593_0 != 0))) {
        break forward_join_606;
    }
    __call33_152((__fieldRead33_151(receiver))[(life8_6++)], p1, 0x1.0p-1d, 0x1.0p-1d, 0x1.e666666666666p-1d);
    }
    forwardValue33_612_0 = __integerCategory33_155(__call33_154(receiver, p0, __fieldRead33_153(receiver), life8_6));
    }
    return __integerCategory33_156(forwardValue33_612_0);
}
public static boolean h33_0(moom.Oo p0) throws Throwable {
    throw __call2003300_0(p0);
}
public static boolean h33_1(moom.Oo p0) throws Throwable {
    throw __call2003301_0(p0);
}
public static boolean h33_2(moom.Oo p0) throws Throwable {
    throw __call2003302_0(p0);
}
public static boolean h33_3(moom.Oo p0) throws Throwable {
    throw __call2003303_0(p0);
}
public static boolean h33_4(moom.Oo p0) throws Throwable {
    throw __call2003304_0(p0);
}
public static boolean h33_5(moom.Oo p0) throws Throwable {
    throw __call2003305_0(p0);
}
public static boolean h33_6(moom.Oo p0) throws Throwable {
    throw __call2003306_0(p0);
}
public static boolean h33_7(moom.Oo p0) throws Throwable {
    throw __call2003307_0(p0);
}
public static boolean h33_8(moom.Oo p0) throws Throwable {
    throw __call2003308_0(p0);
}
public static boolean h33_9(moom.Oo p0) throws Throwable {
    throw __call2003309_0(p0);
}
public static boolean h33_10(moom.Oo p0) throws Throwable {
    throw __call2003310_0(p0);
}
public static boolean h33_11(moom.Oo p0) throws Throwable {
    throw __call2003311_0(p0);
}
public static boolean h33_12(moom.Oo p0) throws Throwable {
    throw __call2003312_0(p0);
}
public static boolean h33_13(moom.Oo p0) throws Throwable {
    throw __call2003313_0(p0);
}
public static boolean h33_14(moom.Oo p0) throws Throwable {
    throw __call2003314_0(p0);
}
public static boolean h33_15(moom.Oo p0) throws Throwable {
    throw __call2003315_0(p0);
}
public static boolean h33_16(moom.Oo p0) throws Throwable {
    throw __call2003316_0(p0);
}
public static boolean h33_17(moom.Oo p0) throws Throwable {
    throw __call2003317_0(p0);
}
public static boolean h33_18(moom.Oo p0) throws Throwable {
    throw __call2003318_0(p0);
}
public static boolean h33_19(moom.Oo p0) throws Throwable {
    throw __call2003319_0(p0);
}
public static boolean h33_20(moom.Oo p0) throws Throwable {
    throw __call2003320_0(p0);
}
public static boolean h33_21(moom.Oo p0) throws Throwable {
    throw __call2003321_0(p0);
}
public static boolean h33_22(moom.Oo p0) throws Throwable {
    throw __call2003322_0(p0);
}
public static boolean h33_23(moom.Oo p0) throws Throwable {
    throw __call2003323_0(p0);
}
public static boolean h33_24(moom.Oo p0) throws Throwable {
    throw __call2003324_0(p0);
}
public static boolean h33_25(moom.Oo p0) throws Throwable {
    throw __call2003325_0(p0);
}
public static boolean h33_26(moom.Oo p0) throws Throwable {
    throw __call2003326_0(p0);
}
public static boolean h33_27(moom.Oo p0) throws Throwable {
    throw __call2003327_0(p0);
}
public static boolean h33_28(moom.Oo p0) throws Throwable {
    throw __call2003328_0(p0);
}
public static boolean h33_29(moom.Oo p0) throws Throwable {
    throw __call2003329_0(p0);
}
public static boolean h33_30(moom.Oo p0) throws Throwable {
    throw __call2003330_0(p0);
}
public static boolean h33_31(moom.Oo p0) throws Throwable {
    throw __call2003331_0(p0);
}
public static boolean h33_32(moom.Oo p0) throws Throwable {
    throw __call2003332_0(p0);
}
public static boolean h33_33(moom.Oo p0) throws Throwable {
    throw __call2003333_0(p0);
}
public static boolean h33_34(moom.Oo p0) throws Throwable {
    throw __call2003334_0(p0);
}
public static boolean h33_35(moom.Oo p0) throws Throwable {
    throw __call2003335_0(p0);
}
public static boolean h33_36(moom.Oo p0) throws Throwable {
    throw __call2003336_0(p0);
}
public static boolean h33_37(moom.Oo p0) throws Throwable {
    throw __call2003337_0(p0);
}
public static boolean h33_38(moom.Oo p0) throws Throwable {
    throw __call2003338_0(p0);
}
public static boolean h33_39(moom.Oo p0) throws Throwable {
    throw __call2003339_0(p0);
}
public static boolean h33_40(moom.Oo p0) throws Throwable {
    throw __call2003340_0(p0);
}
public static boolean h33_41(moom.Oo p0) throws Throwable {
    throw __call2003341_0(p0);
}
public static boolean h33_42(moom.Oo p0) throws Throwable {
    throw __call2003342_0(p0);
}
public static boolean h33_43(moom.Oo p0) throws Throwable {
    throw __call2003343_0(p0);
}
public static boolean h33_44(moom.Oo p0) throws Throwable {
    throw __call2003344_0(p0);
}
public static boolean h33_45(moom.Oo p0) throws Throwable {
    throw __call2003345_0(p0);
}
public static boolean h33_46(moom.Oo p0) throws Throwable {
    throw __call2003346_0(p0);
}
public static boolean h33_47(moom.Oo p0) throws Throwable {
    throw __call2003347_0(p0);
}
public static boolean h33_48(moom.Oo p0) throws Throwable {
    throw __call2003348_0(p0);
}
public static boolean h33_49(moom.Oo p0) throws Throwable {
    throw __call2003349_0(p0);
}
public static boolean h33_50(moom.Oo p0) throws Throwable {
    throw __call2003350_0(p0);
}
public static boolean h33_51(moom.Oo p0) throws Throwable {
    throw __call2003351_0(p0);
}
private static native long __fieldRead33_0() throws Throwable;
private static native boolean __call33_1() throws Throwable;
private static native int __integerCategory33_2(boolean value) throws Throwable;
private static native boolean[] __fieldRead33_3(com.moon.hF a0) throws Throwable;
private static native void __call33_4(boolean[] a0, int a1) throws Throwable;
private static native boolean[] __fieldRead33_5(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_6(int value) throws Throwable;
private static native int __invokedynamic33_7(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_8(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_9(int value) throws Throwable;
private static native boolean[] __fieldRead33_10(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_11(int value) throws Throwable;
private static native boolean[] __fieldRead33_12(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_13(int value) throws Throwable;
private static native boolean[] __fieldRead33_14(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_15(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_16(int value) throws Throwable;
private static native boolean[] __fieldRead33_17(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_18(int value) throws Throwable;
private static native int __invokedynamic33_19(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_20(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_21(int value) throws Throwable;
private static native boolean[] __fieldRead33_22(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_23(int value) throws Throwable;
private static native boolean[] __fieldRead33_24(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_25(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_26(int value) throws Throwable;
private static native boolean[] __fieldRead33_27(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_28(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_29(int value) throws Throwable;
private static native int __invokedynamic33_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic33_31(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_32(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_33(int value) throws Throwable;
private static native int __invokedynamic33_34(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_35(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_36(int value) throws Throwable;
private static native boolean[] __fieldRead33_37(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_38(int value) throws Throwable;
private static native boolean[] __fieldRead33_39(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_40(int value) throws Throwable;
private static native boolean[] __fieldRead33_41(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_42(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_43(int value) throws Throwable;
private static native boolean[] __fieldRead33_44(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_45(int value) throws Throwable;
private static native int __invokedynamic33_46(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_47(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_48(int value) throws Throwable;
private static native boolean[] __fieldRead33_49(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_50(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_51(int value) throws Throwable;
private static native boolean[] __fieldRead33_52(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_53(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_54(int value) throws Throwable;
private static native boolean[] __fieldRead33_55(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_56(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_57(int value) throws Throwable;
private static native int __invokedynamic33_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic33_59(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_60(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_61(int value) throws Throwable;
private static native int __invokedynamic33_62(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_63(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_64(int value) throws Throwable;
private static native boolean[] __fieldRead33_65(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_66(int value) throws Throwable;
private static native boolean[] __fieldRead33_67(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_68(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_69(int value) throws Throwable;
private static native boolean[] __fieldRead33_70(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_71(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_72(int value) throws Throwable;
private static native int __invokedynamic33_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic33_74(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_75(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_76(int value) throws Throwable;
private static native int __invokedynamic33_77(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead33_78(com.moon.hF a0) throws Throwable;
private static native boolean __integerCategory33_79(int value) throws Throwable;
private static native boolean[] __fieldRead33_80(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_81(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_82(int value) throws Throwable;
private static native boolean[] __fieldRead33_83(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_84(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_85(int value) throws Throwable;
private static native boolean[] __fieldRead33_86(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_87(int a0, long a1) throws Throwable;
private static native boolean __integerCategory33_88(int value) throws Throwable;
private static native boolean[] __fieldRead33_89(com.moon.hF a0) throws Throwable;
private static native int __integerCategory33_90(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_91(com.moon.hF a0) throws Throwable;
private static native void __call33_92(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_93(com.moon.hF a0) throws Throwable;
private static native int __integerCategory33_94(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_95(com.moon.hF a0) throws Throwable;
private static native void __call33_96(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_97(com.moon.hF a0) throws Throwable;
private static native int __integerCategory33_98(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_99(com.moon.hF a0) throws Throwable;
private static native void __call33_100(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_101(com.moon.hF a0) throws Throwable;
private static native int __integerCategory33_102(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_103(com.moon.hF a0) throws Throwable;
private static native void __call33_104(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_105(com.moon.hF a0) throws Throwable;
private static native int __integerCategory33_106(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_107(com.moon.hF a0) throws Throwable;
private static native void __call33_108(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_109(com.moon.hF a0) throws Throwable;
private static native int __integerCategory33_110(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_111(com.moon.hF a0) throws Throwable;
private static native void __call33_112(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_113(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_114(int a0, long a1) throws Throwable;
private static native int __integerCategory33_115(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_116(com.moon.hF a0) throws Throwable;
private static native void __call33_117(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_118(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_119(int a0, long a1) throws Throwable;
private static native int __integerCategory33_120(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_121(com.moon.hF a0) throws Throwable;
private static native void __call33_122(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_123(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_124(int a0, long a1) throws Throwable;
private static native int __integerCategory33_125(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_126(com.moon.hF a0) throws Throwable;
private static native void __call33_127(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_128(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_129(int a0, long a1) throws Throwable;
private static native int __integerCategory33_130(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_131(com.moon.hF a0) throws Throwable;
private static native void __call33_132(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_133(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_134(int a0, long a1) throws Throwable;
private static native int __integerCategory33_135(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_136(com.moon.hF a0) throws Throwable;
private static native void __call33_137(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_138(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_139(int a0, long a1) throws Throwable;
private static native int __integerCategory33_140(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_141(com.moon.hF a0) throws Throwable;
private static native void __call33_142(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_143(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_144(int a0, long a1) throws Throwable;
private static native int __integerCategory33_145(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_146(com.moon.hF a0) throws Throwable;
private static native void __call33_147(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native boolean[] __fieldRead33_148(com.moon.hF a0) throws Throwable;
private static native int __invokedynamic33_149(int a0, long a1) throws Throwable;
private static native int __integerCategory33_150(boolean value) throws Throwable;
private static native com.moon.n5[] __fieldRead33_151(com.moon.hF a0) throws Throwable;
private static native void __call33_152(com.moon.n5 a0, com.moon.n5 a1, double a2, double a3, double a4) throws Throwable;
private static native com.moon.n5[] __fieldRead33_153(com.moon.hF a0) throws Throwable;
private static native boolean __call33_154(com.moon.hF a0, com.moon.n5 a1, com.moon.n5[] a2, int a3) throws Throwable;
private static native int __integerCategory33_155(boolean value) throws Throwable;
private static native boolean __integerCategory33_156(int value) throws Throwable;
private static native java.lang.Throwable __call2003300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003314_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003315_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003316_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003317_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003318_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003319_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003320_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003321_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003322_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003323_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003324_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003325_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003326_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003327_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003328_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003329_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003330_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003331_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003332_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003333_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003334_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003335_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003336_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003337_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003338_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003339_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003340_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003341_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003342_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003343_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003344_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003345_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003346_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003347_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003348_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003349_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003350_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003351_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_62a9f5df3c76aa44d5ea(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, com.moon.n5 a3) throws E;
private static final class __SourceHandler_62a9f5df3c76aa44d5ea {

public static boolean f71(com.moon.hF receiver, com.moon.n5 p0, com.moon.n5 p1, com.moon.n5 p2) throws Throwable {
    com.moon.b9 forestValue71_105_0;
    com.moon.b9 forestValue71_105_1;
    int forestValue71_116_0;
    int forestValue71_124_0;
    int forestValue71_124_1;
    int forestValue71_147_0;
    int forestValue71_171_0;
    int forestValue71_186_0;
    int forestValue71_186_1;
    int forestValue71_186_2;
    int forestValue71_189_0;
    int forestValue71_190_0;
    int forestValue71_190_1;
    int forestValue71_200_0;
    int forestValue71_200_1;
    int forestValue71_201_0;
    int forestValue71_202_0;
    int forestValue71_202_1;
    int forestValue71_214_0;
    int forestValue71_215_0;
    int forestValue71_215_1;
    int forestValue71_227_0;
    int forestValue71_228_0;
    int forestValue71_228_1;
    int forestValue71_249_0;
    int forestValue71_249_1;
    int forestValue71_250_0;
    int forestValue71_251_0;
    int forestValue71_251_1;
    int forestValue71_265_0;
    int forestValue71_265_1;
    int forestValue71_266_0;
    int forestValue71_267_0;
    int forestValue71_267_1;
    int forestValue71_279_0;
    int forestValue71_280_0;
    int forestValue71_280_1;
    int forestValue71_296_0;
    int forestValue71_297_0;
    int forestValue71_297_1;
    int forestValue71_322_0;
    int forestValue71_322_1;
    int forestValue71_323_0;
    int forestValue71_324_0;
    int forestValue71_324_1;
    int forestValue71_338_0;
    int forestValue71_338_1;
    int forestValue71_339_0;
    int forestValue71_340_0;
    int forestValue71_340_1;
    int forestValue71_356_0;
    int forestValue71_357_0;
    int forestValue71_357_1;
    int forestValue71_373_0;
    int forestValue71_374_0;
    int forestValue71_374_1;
    int forestValue71_388_0;
    int forestValue71_408_0;
    int forestValue71_420_0;
    int forestValue71_420_1;
    int forestValue71_430_0;
    int forestValue71_430_1;
    int forestValue71_431_0;
    int forestValue71_432_0;
    int forestValue71_432_1;
    int forestValue71_444_0;
    int forestValue71_445_0;
    int forestValue71_445_1;
    int forestValue71_457_0;
    int forestValue71_458_0;
    int forestValue71_458_1;
    int forestValue71_479_0;
    int forestValue71_479_1;
    int forestValue71_480_0;
    int forestValue71_481_0;
    int forestValue71_481_1;
    int forestValue71_495_0;
    int forestValue71_495_1;
    int forestValue71_496_0;
    int forestValue71_497_0;
    int forestValue71_497_1;
    int forestValue71_509_0;
    int forestValue71_510_0;
    int forestValue71_510_1;
    int forestValue71_526_0;
    int forestValue71_527_0;
    int forestValue71_527_1;
    int forestValue71_552_0;
    int forestValue71_552_1;
    int forestValue71_553_0;
    int forestValue71_554_0;
    int forestValue71_554_1;
    int forestValue71_568_0;
    int forestValue71_568_1;
    int forestValue71_569_0;
    int forestValue71_570_0;
    int forestValue71_570_1;
    int forestValue71_586_0;
    int forestValue71_587_0;
    int forestValue71_587_1;
    int forestValue71_603_0;
    int forestValue71_604_0;
    int forestValue71_604_1;
    int forestValue71_618_0;
    int forestValue71_638_0;
    int forestValue71_650_0;
    int forestValue71_650_1;
    int forestValue71_650_2;
    int forestValue71_652_0;
    int forestValue71_654_0;
    int forestValue71_660_0;
    int forestValue71_662_0;
    com.moon.b9 spill71_0;
    com.moon.b9 spill71_1;
    int spill71_2;
    int spill71_3;
    int spill71_4;
    int spill71_5;
    int spill71_6;
    int spill71_7;
    int spill71_8;
    int spill71_9;
    int spill71_10;
    int spill71_11;
    int spill71_12;
    int spill71_13;
    int spill71_14;
    int spill71_15;
    int spill71_16;
    int spill71_17;
    int spill71_18;
    int spill71_19;
    int spill71_20;
    int spill71_21;
    int spill71_22;
    int spill71_23;
    int spill71_24;
    int spill71_25;
    boolean spill71_26;
    int spill71_27;
    int spill71_28;
    int spill71_29;
    int spill71_30;
    int spill71_31;
    int spill71_32;
    int spill71_33;
    int spill71_34;
    int spill71_35;
    int spill71_36;
    int spill71_37;
    int spill71_38;
    int spill71_39;
    int spill71_40;
    int spill71_41;
    int spill71_42;
    int spill71_43;
    int spill71_44;
    boolean spill71_45;
    int spill71_46;
    int spill71_47;
    long life4_3;
    int life6_5;
    int life7_12;
    int life8_19;
    int life9_26;
    int life10_33;
    int life11_40;
    int life12_47;
    com.moon.b9 life13_76;
    com.moon.b9 life14_84;
    com.moon.b9 life15_92;
    int life16_122;
    int life17_124;
    int life18_135;
    int life19_146;
    int life20_157;
    int life17_202;
    int life18_209;
    int life19_211;
    int life19_232;
    int life19_249;
    int life18_266;
    int life20_285;
    int life21_292;
    int life22_294;
    int life21_314;
    int life21_335;
    int life22_352;
    int life22_373;
    int life23_375;
    int life24_382;
    int life25_384;
    int life24_408;
    int life24_429;
    int life25_450;
    int life25_471;
    int life19_531;
    int life19_548;
    int life18_565;
    int life20_584;
    int life21_591;
    int life22_593;
    int life21_613;
    int life21_634;
    int life22_651;
    int life22_672;
    int life23_674;
    int life24_681;
    int life25_683;
    int life24_707;
    int life24_728;
    int life25_749;
    int life25_770;
    forest_join_662: {
    forest_join_661: {
    forest_join_660: {
    forest_join_659: {
    forest_join_171: {
    forest_join_165: {
    forest_join_163: {
    forest_join_111: {
    forest_join_108: {
    forest_join_105: {
    life4_3 = (__fieldRead71_0() ^ 47898077088687L);
    life6_5 = __integerCategory71_2(__call71_1());
    life7_12 = __call71_5((__fieldRead71_3(p1) + __fieldRead71_4(receiver)));
    life8_19 = __call71_8((__fieldRead71_6(p1) + __fieldRead71_7(receiver)));
    life9_26 = __call71_11((__fieldRead71_9(p1) + __fieldRead71_10(receiver)));
    life10_33 = __call71_14((__fieldRead71_12(p0) - __fieldRead71_13(receiver)));
    life11_40 = __call71_17((__fieldRead71_15(p0) - __fieldRead71_16(receiver)));
    life12_47 = __call71_20((__fieldRead71_18(p0) - __fieldRead71_19(receiver)));
    (__fieldRead71_21(receiver))[0] = __call71_23(__fieldRead71_22(p2));
    (__fieldRead71_24(receiver))[1] = __call71_26(__fieldRead71_25(p2));
    (__fieldRead71_27(receiver))[2] = __call71_29(__fieldRead71_28(p2));
    life13_76 = __call71_31(life10_33, life7_12, (__fieldRead71_30(receiver))[0]);
    life14_84 = __call71_33(life11_40, life8_19, (__fieldRead71_32(receiver))[1]);
    life15_92 = __call71_35(life12_47, life9_26, (__fieldRead71_34(receiver))[2]);
    if (!((life6_5 == 0))) {
        break forest_join_111;
    }
    if (!((life13_76 == __fieldRead71_36()))) {
        break forest_join_108;
    }
    spill71_0 = life14_84;
    spill71_1 = __fieldRead71_37();
    if (!((life6_5 == 0))) {
        forestValue71_105_0 = spill71_0;
        forestValue71_105_1 = spill71_1;
        break forest_join_105;
    }
    if (!((spill71_0 == spill71_1))) {
        break forest_join_108;
    }
    forestValue71_105_0 = life15_92;
    forestValue71_105_1 = __fieldRead71_38();
    }
    if (!((forestValue71_105_0 == forestValue71_105_1))) {
        break forest_join_108;
    }
    return __integerCategory71_39(1);
    }
    __call71_41(__fieldRead71_40(receiver));
    }
    life16_122 = 0;
    life17_124 = life10_33;
    forest_cycle_115: while (true) {
    forest_join_159: {
    forestValue71_116_0 = life17_124;
    forest_cycle_116: while (true) {
    if (!((forestValue71_116_0 <= life7_12))) {
        break forest_join_165;
    }
    spill71_2 = life11_40;
    if (!((life6_5 == 0))) {
        forestValue71_171_0 = spill71_2;
        break forest_join_171;
    }
    life18_135 = spill71_2;
    forest_cycle_122: while (true) {
    forest_join_156: {
    forestValue71_124_0 = life18_135;
    forestValue71_124_1 = life8_19;
    forest_cycle_124: while (true) {
    if (!((forestValue71_124_0 <= forestValue71_124_1))) {
        break forest_join_159;
    }
    spill71_3 = life12_47;
    if (!((life6_5 == 0))) {
        forestValue71_116_0 = spill71_3;
        continue forest_cycle_116;
    }
    life19_146 = spill71_3;
    forest_cycle_129: while (true) {
    forest_join_152: {
    forest_join_147: {
    forest_join_146: {
    if (!((life19_146 <= life9_26))) {
        break forest_join_156;
    }
    life20_157 = __call71_42(receiver, life17_124, life18_135, life19_146);
    spill71_4 = life20_157;
    if (!((life6_5 == 0))) {
        forestValue71_147_0 = spill71_4;
        break forest_join_147;
    }
    spill71_5 = 1;
    if (!((life6_5 == 0))) {
        forestValue71_124_0 = spill71_4;
        forestValue71_124_1 = spill71_5;
        continue forest_cycle_124;
    }
    if (!((spill71_4 == spill71_5))) {
        break forest_join_146;
    }
    break forest_join_163;
    }
    forestValue71_147_0 = life20_157;
    }
    if (!((forestValue71_147_0 != 0))) {
        break forest_join_152;
    }
    __call71_44(__fieldRead71_43(receiver), life16_122);
    }
    life16_122 += 1;
    life19_146 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_129;
    }
    break forest_cycle_129;
    }
    break forest_cycle_124;
    }
    }
    life18_135 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_122;
    }
    break forest_cycle_122;
    }
    break forest_cycle_116;
    }
    }
    life17_124 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_115;
    }
    break forest_cycle_115;
    }
    break forest_join_165;
    }
    return __integerCategory71_45(1);
    }
    __fieldWrite71_46(receiver, 0);
    life16_122 = 0;
    forestValue71_171_0 = life10_33;
    }
    life17_202 = forestValue71_171_0;
    forest_cycle_172: while (true) {
    forest_join_656: {
    forest_join_420: {
    if (!((life17_202 <= life7_12))) {
        break forest_join_659;
    }
    life18_209 = 0;
    life19_211 = 0;
    spill71_6 = life19_211;
    if (!((life6_5 == 0))) {
        forestValue71_660_0 = spill71_6;
        break forest_join_660;
    }
    spill71_7 = life17_202;
    if (!((life6_5 == 0))) {
        forestValue71_420_0 = spill71_6;
        forestValue71_420_1 = spill71_7;
        break forest_join_420;
    }
    forestValue71_186_0 = spill71_6;
    forestValue71_186_1 = spill71_7;
    forestValue71_186_2 = life10_33;
    forest_cycle_186: while (true) {
    forest_join_228: {
    forest_join_227: {
    forest_join_215: {
    forest_join_214: {
    forest_join_202: {
    forest_join_201: {
    forest_join_200: {
    forest_join_190: {
    forest_join_189: {
    if (!((forestValue71_186_1 == forestValue71_186_2))) {
        forestValue71_189_0 = forestValue71_186_0;
        break forest_join_189;
    }
    forestValue71_190_0 = forestValue71_186_0;
    forestValue71_190_1 = 1;
    break forest_join_190;
    }
    forestValue71_190_0 = forestValue71_189_0;
    forestValue71_190_1 = 0;
    }
    life19_232 = ((byte) (forestValue71_190_0 | forestValue71_190_1));
    spill71_8 = life19_232;
    spill71_9 = life17_202;
    if (!((life6_5 == 0))) {
        forestValue71_200_0 = spill71_8;
        forestValue71_200_1 = spill71_9;
        break forest_join_200;
    }
    if (!((spill71_9 == life7_12))) {
        forestValue71_201_0 = spill71_8;
        break forest_join_201;
    }
    forestValue71_200_0 = spill71_8;
    forestValue71_200_1 = 2;
    }
    forestValue71_202_0 = forestValue71_200_0;
    forestValue71_202_1 = forestValue71_200_1;
    break forest_join_202;
    }
    forestValue71_202_0 = forestValue71_201_0;
    forestValue71_202_1 = 0;
    }
    life19_249 = ((byte) (forestValue71_202_0 | forestValue71_202_1));
    spill71_10 = life18_209;
    if (!((life17_202 == life10_33))) {
        forestValue71_214_0 = spill71_10;
        break forest_join_214;
    }
    if (!((life13_76 == __fieldRead71_47()))) {
        forestValue71_214_0 = spill71_10;
        break forest_join_214;
    }
    forestValue71_215_0 = spill71_10;
    forestValue71_215_1 = 1;
    break forest_join_215;
    }
    forestValue71_215_0 = forestValue71_214_0;
    forestValue71_215_1 = 0;
    }
    life18_266 = ((byte) (forestValue71_215_0 | forestValue71_215_1));
    spill71_11 = life18_266;
    if (!((life17_202 == life7_12))) {
        forestValue71_227_0 = spill71_11;
        break forest_join_227;
    }
    if (!((life13_76 == __fieldRead71_48()))) {
        forestValue71_227_0 = spill71_11;
        break forest_join_227;
    }
    forestValue71_228_0 = spill71_11;
    forestValue71_228_1 = 2;
    break forest_join_228;
    }
    forestValue71_228_0 = forestValue71_227_0;
    forestValue71_228_1 = 0;
    }
    life18_209 = ((byte) (forestValue71_228_0 | forestValue71_228_1));
    life20_285 = life11_40;
    forest_cycle_233: while (true) {
    forest_join_416: {
    forest_join_297: {
    forest_join_296: {
    forest_join_280: {
    forest_join_279: {
    forest_join_267: {
    forest_join_266: {
    forest_join_265: {
    forest_join_251: {
    forest_join_250: {
    forest_join_249: {
    if (!((life20_285 <= life8_19))) {
        break forest_join_656;
    }
    life21_292 = life19_249;
    life22_294 = life18_209;
    spill71_12 = life21_292;
    spill71_13 = life20_285;
    if (!((life6_5 == 0))) {
        forestValue71_249_0 = spill71_12;
        forestValue71_249_1 = spill71_13;
        break forest_join_249;
    }
    spill71_14 = life11_40;
    if (!((life6_5 == 0))) {
        forestValue71_186_0 = spill71_12;
        forestValue71_186_1 = spill71_13;
        forestValue71_186_2 = spill71_14;
        continue forest_cycle_186;
    }
    if (!((spill71_13 == spill71_14))) {
        forestValue71_250_0 = spill71_12;
        break forest_join_250;
    }
    forestValue71_249_0 = spill71_12;
    forestValue71_249_1 = 4;
    }
    forestValue71_251_0 = forestValue71_249_0;
    forestValue71_251_1 = forestValue71_249_1;
    break forest_join_251;
    }
    forestValue71_251_0 = forestValue71_250_0;
    forestValue71_251_1 = 0;
    }
    life21_314 = ((byte) (forestValue71_251_0 | forestValue71_251_1));
    spill71_15 = life21_314;
    spill71_16 = life20_285;
    if (!((life6_5 == 0))) {
        forestValue71_265_0 = spill71_15;
        forestValue71_265_1 = spill71_16;
        break forest_join_265;
    }
    if (!((spill71_16 == life8_19))) {
        forestValue71_266_0 = spill71_15;
        break forest_join_266;
    }
    forestValue71_265_0 = spill71_15;
    forestValue71_265_1 = __invokedynamic71_49(17765, (3429917998580376566L ^ life4_3));
    }
    forestValue71_267_0 = forestValue71_265_0;
    forestValue71_267_1 = forestValue71_265_1;
    break forest_join_267;
    }
    forestValue71_267_0 = forestValue71_266_0;
    forestValue71_267_1 = 0;
    }
    life21_335 = ((byte) (forestValue71_267_0 | forestValue71_267_1));
    spill71_17 = life22_294;
    if (!((life20_285 == life11_40))) {
        forestValue71_279_0 = spill71_17;
        break forest_join_279;
    }
    if (!((life14_84 == __fieldRead71_50()))) {
        forestValue71_279_0 = spill71_17;
        break forest_join_279;
    }
    forestValue71_280_0 = spill71_17;
    forestValue71_280_1 = 4;
    break forest_join_280;
    }
    forestValue71_280_0 = forestValue71_279_0;
    forestValue71_280_1 = 0;
    }
    life22_352 = ((byte) (forestValue71_280_0 | forestValue71_280_1));
    spill71_18 = life22_352;
    if (!((life20_285 == life8_19))) {
        forestValue71_296_0 = spill71_18;
        break forest_join_296;
    }
    if (!((life14_84 == __fieldRead71_51()))) {
        forestValue71_296_0 = spill71_18;
        break forest_join_296;
    }
    forestValue71_297_0 = spill71_18;
    forestValue71_297_1 = __invokedynamic71_52(17765, (3429917998580376566L ^ life4_3));
    break forest_join_297;
    }
    forestValue71_297_0 = forestValue71_296_0;
    forestValue71_297_1 = 0;
    }
    life22_373 = ((byte) (forestValue71_297_0 | forestValue71_297_1));
    life23_375 = life12_47;
    forest_cycle_302: while (true) {
    forest_join_413: {
    forest_join_412: {
    forest_join_408: {
    forest_join_388: {
    forest_join_387: {
    forest_join_374: {
    forest_join_373: {
    forest_join_357: {
    forest_join_356: {
    forest_join_340: {
    forest_join_339: {
    forest_join_338: {
    forest_join_324: {
    forest_join_323: {
    forest_join_322: {
    if (!((life23_375 <= life9_26))) {
        break forest_join_416;
    }
    life24_382 = life21_335;
    life25_384 = life22_373;
    spill71_19 = life24_382;
    spill71_20 = life23_375;
    if (!((life6_5 == 0))) {
        forestValue71_322_0 = spill71_19;
        forestValue71_322_1 = spill71_20;
        break forest_join_322;
    }
    spill71_21 = life12_47;
    if (!((life6_5 == 0))) {
        forestValue71_186_0 = spill71_19;
        forestValue71_186_1 = spill71_20;
        forestValue71_186_2 = spill71_21;
        continue forest_cycle_186;
    }
    if (!((spill71_20 == spill71_21))) {
        forestValue71_323_0 = spill71_19;
        break forest_join_323;
    }
    forestValue71_322_0 = spill71_19;
    forestValue71_322_1 = __invokedynamic71_53(13126, (5278547734281541078L ^ life4_3));
    }
    forestValue71_324_0 = forestValue71_322_0;
    forestValue71_324_1 = forestValue71_322_1;
    break forest_join_324;
    }
    forestValue71_324_0 = forestValue71_323_0;
    forestValue71_324_1 = 0;
    }
    life24_408 = ((byte) (forestValue71_324_0 | forestValue71_324_1));
    spill71_22 = life24_408;
    spill71_23 = life23_375;
    if (!((life6_5 == 0))) {
        forestValue71_338_0 = spill71_22;
        forestValue71_338_1 = spill71_23;
        break forest_join_338;
    }
    if (!((spill71_23 == life9_26))) {
        forestValue71_339_0 = spill71_22;
        break forest_join_339;
    }
    forestValue71_338_0 = spill71_22;
    forestValue71_338_1 = __invokedynamic71_54(2229, (4641770119443574328L ^ life4_3));
    }
    forestValue71_340_0 = forestValue71_338_0;
    forestValue71_340_1 = forestValue71_338_1;
    break forest_join_340;
    }
    forestValue71_340_0 = forestValue71_339_0;
    forestValue71_340_1 = 0;
    }
    life24_429 = ((byte) (forestValue71_340_0 | forestValue71_340_1));
    spill71_24 = life25_384;
    if (!((life23_375 == life12_47))) {
        forestValue71_356_0 = spill71_24;
        break forest_join_356;
    }
    if (!((life15_92 == __fieldRead71_55()))) {
        forestValue71_356_0 = spill71_24;
        break forest_join_356;
    }
    forestValue71_357_0 = spill71_24;
    forestValue71_357_1 = __invokedynamic71_56(13126, (5278547734281541078L ^ life4_3));
    break forest_join_357;
    }
    forestValue71_357_0 = forestValue71_356_0;
    forestValue71_357_1 = 0;
    }
    life25_450 = ((byte) (forestValue71_357_0 | forestValue71_357_1));
    spill71_25 = life25_450;
    if (!((life23_375 == life9_26))) {
        forestValue71_373_0 = spill71_25;
        break forest_join_373;
    }
    if (!((life15_92 == __fieldRead71_57()))) {
        forestValue71_373_0 = spill71_25;
        break forest_join_373;
    }
    forestValue71_374_0 = spill71_25;
    forestValue71_374_1 = __invokedynamic71_58(2229, (4641770119443574328L ^ life4_3));
    break forest_join_374;
    }
    forestValue71_374_0 = forestValue71_373_0;
    forestValue71_374_1 = 0;
    }
    life25_471 = ((byte) (forestValue71_374_0 | forestValue71_374_1));
    spill71_26 = __call71_60(__fieldRead71_59(receiver), life16_122);
    if (!((life6_5 == 0))) {
        forestValue71_388_0 = __integerCategory71_61(spill71_26);
        break forest_join_388;
    }
    if (!(spill71_26)) {
        break forest_join_387;
    }
    life16_122 += 1;
    if (!((life6_5 != 0))) {
        break forest_join_413;
    }
    }
    forestValue71_388_0 = life25_471;
    }
    if (!((life6_5 == 0))) {
        forestValue71_408_0 = forestValue71_388_0;
        break forest_join_408;
    }
    if (!((forestValue71_388_0 != 0))) {
        break forest_join_412;
    }
    __call71_63(__fieldRead71_62(receiver), ((double) life17_202), ((double) life20_285), ((double) life23_375));
    forestValue71_408_0 = __integerCategory71_66(__call71_65(receiver, p2, __fieldRead71_64(receiver), life24_429, life25_471));
    }
    if (!((life6_5 == 0))) {
        forestValue71_662_0 = forestValue71_408_0;
        break forest_join_662;
    }
    if (!((forestValue71_408_0 != 0))) {
        break forest_join_412;
    }
    break forest_join_661;
    }
    life16_122 += 1;
    }
    life23_375 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_302;
    }
    break forest_cycle_302;
    }
    }
    life20_285 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_233;
    }
    break forest_cycle_233;
    }
    break forest_cycle_186;
    }
    break forest_join_656;
    }
    forest_cycle_420: while (true) {
    forest_join_654: {
    forest_join_652: {
    forest_join_650: {
    forest_join_458: {
    forest_join_457: {
    forest_join_445: {
    forest_join_444: {
    forest_join_432: {
    forest_join_431: {
    forest_join_430: {
    life19_531 = ((byte) (forestValue71_420_0 | forestValue71_420_1));
    spill71_27 = life19_531;
    spill71_28 = life17_202;
    if (!((life6_5 == 0))) {
        forestValue71_430_0 = spill71_27;
        forestValue71_430_1 = spill71_28;
        break forest_join_430;
    }
    if (!((spill71_28 == life7_12))) {
        forestValue71_431_0 = spill71_27;
        break forest_join_431;
    }
    forestValue71_430_0 = spill71_27;
    forestValue71_430_1 = 2;
    }
    forestValue71_432_0 = forestValue71_430_0;
    forestValue71_432_1 = forestValue71_430_1;
    break forest_join_432;
    }
    forestValue71_432_0 = forestValue71_431_0;
    forestValue71_432_1 = 0;
    }
    life19_548 = ((byte) (forestValue71_432_0 | forestValue71_432_1));
    spill71_29 = life18_209;
    if (!((life17_202 == life10_33))) {
        forestValue71_444_0 = spill71_29;
        break forest_join_444;
    }
    if (!((life13_76 == __fieldRead71_67()))) {
        forestValue71_444_0 = spill71_29;
        break forest_join_444;
    }
    forestValue71_445_0 = spill71_29;
    forestValue71_445_1 = 1;
    break forest_join_445;
    }
    forestValue71_445_0 = forestValue71_444_0;
    forestValue71_445_1 = 0;
    }
    life18_565 = ((byte) (forestValue71_445_0 | forestValue71_445_1));
    spill71_30 = life18_565;
    if (!((life17_202 == life7_12))) {
        forestValue71_457_0 = spill71_30;
        break forest_join_457;
    }
    if (!((life13_76 == __fieldRead71_68()))) {
        forestValue71_457_0 = spill71_30;
        break forest_join_457;
    }
    forestValue71_458_0 = spill71_30;
    forestValue71_458_1 = 2;
    break forest_join_458;
    }
    forestValue71_458_0 = forestValue71_457_0;
    forestValue71_458_1 = 0;
    }
    life18_209 = ((byte) (forestValue71_458_0 | forestValue71_458_1));
    life20_584 = life11_40;
    forest_cycle_463: while (true) {
    forest_join_646: {
    forest_join_527: {
    forest_join_526: {
    forest_join_510: {
    forest_join_509: {
    forest_join_497: {
    forest_join_496: {
    forest_join_495: {
    forest_join_481: {
    forest_join_480: {
    forest_join_479: {
    if (!((life20_584 <= life8_19))) {
        break forest_join_656;
    }
    life21_591 = life19_548;
    life22_593 = life18_209;
    spill71_31 = life21_591;
    spill71_32 = life20_584;
    if (!((life6_5 == 0))) {
        forestValue71_479_0 = spill71_31;
        forestValue71_479_1 = spill71_32;
        break forest_join_479;
    }
    spill71_33 = life11_40;
    if (!((life6_5 == 0))) {
        forestValue71_650_0 = spill71_31;
        forestValue71_650_1 = spill71_32;
        forestValue71_650_2 = spill71_33;
        break forest_join_650;
    }
    if (!((spill71_32 == spill71_33))) {
        forestValue71_480_0 = spill71_31;
        break forest_join_480;
    }
    forestValue71_479_0 = spill71_31;
    forestValue71_479_1 = 4;
    }
    forestValue71_481_0 = forestValue71_479_0;
    forestValue71_481_1 = forestValue71_479_1;
    break forest_join_481;
    }
    forestValue71_481_0 = forestValue71_480_0;
    forestValue71_481_1 = 0;
    }
    life21_613 = ((byte) (forestValue71_481_0 | forestValue71_481_1));
    spill71_34 = life21_613;
    spill71_35 = life20_584;
    if (!((life6_5 == 0))) {
        forestValue71_495_0 = spill71_34;
        forestValue71_495_1 = spill71_35;
        break forest_join_495;
    }
    if (!((spill71_35 == life8_19))) {
        forestValue71_496_0 = spill71_34;
        break forest_join_496;
    }
    forestValue71_495_0 = spill71_34;
    forestValue71_495_1 = __invokedynamic71_69(17765, (3429917998580376566L ^ life4_3));
    }
    forestValue71_497_0 = forestValue71_495_0;
    forestValue71_497_1 = forestValue71_495_1;
    break forest_join_497;
    }
    forestValue71_497_0 = forestValue71_496_0;
    forestValue71_497_1 = 0;
    }
    life21_634 = ((byte) (forestValue71_497_0 | forestValue71_497_1));
    spill71_36 = life22_593;
    if (!((life20_584 == life11_40))) {
        forestValue71_509_0 = spill71_36;
        break forest_join_509;
    }
    if (!((life14_84 == __fieldRead71_70()))) {
        forestValue71_509_0 = spill71_36;
        break forest_join_509;
    }
    forestValue71_510_0 = spill71_36;
    forestValue71_510_1 = 4;
    break forest_join_510;
    }
    forestValue71_510_0 = forestValue71_509_0;
    forestValue71_510_1 = 0;
    }
    life22_651 = ((byte) (forestValue71_510_0 | forestValue71_510_1));
    spill71_37 = life22_651;
    if (!((life20_584 == life8_19))) {
        forestValue71_526_0 = spill71_37;
        break forest_join_526;
    }
    if (!((life14_84 == __fieldRead71_71()))) {
        forestValue71_526_0 = spill71_37;
        break forest_join_526;
    }
    forestValue71_527_0 = spill71_37;
    forestValue71_527_1 = __invokedynamic71_72(17765, (3429917998580376566L ^ life4_3));
    break forest_join_527;
    }
    forestValue71_527_0 = forestValue71_526_0;
    forestValue71_527_1 = 0;
    }
    life22_672 = ((byte) (forestValue71_527_0 | forestValue71_527_1));
    life23_674 = life12_47;
    forest_cycle_532: while (true) {
    forest_join_643: {
    forest_join_642: {
    forest_join_638: {
    forest_join_618: {
    forest_join_617: {
    forest_join_604: {
    forest_join_603: {
    forest_join_587: {
    forest_join_586: {
    forest_join_570: {
    forest_join_569: {
    forest_join_568: {
    forest_join_554: {
    forest_join_553: {
    forest_join_552: {
    if (!((life23_674 <= life9_26))) {
        break forest_join_646;
    }
    life24_681 = life21_634;
    life25_683 = life22_672;
    spill71_38 = life24_681;
    spill71_39 = life23_674;
    if (!((life6_5 == 0))) {
        forestValue71_552_0 = spill71_38;
        forestValue71_552_1 = spill71_39;
        break forest_join_552;
    }
    spill71_40 = life12_47;
    if (!((life6_5 == 0))) {
        forestValue71_650_0 = spill71_38;
        forestValue71_650_1 = spill71_39;
        forestValue71_650_2 = spill71_40;
        break forest_join_650;
    }
    if (!((spill71_39 == spill71_40))) {
        forestValue71_553_0 = spill71_38;
        break forest_join_553;
    }
    forestValue71_552_0 = spill71_38;
    forestValue71_552_1 = __invokedynamic71_73(13126, (5278547734281541078L ^ life4_3));
    }
    forestValue71_554_0 = forestValue71_552_0;
    forestValue71_554_1 = forestValue71_552_1;
    break forest_join_554;
    }
    forestValue71_554_0 = forestValue71_553_0;
    forestValue71_554_1 = 0;
    }
    life24_707 = ((byte) (forestValue71_554_0 | forestValue71_554_1));
    spill71_41 = life24_707;
    spill71_42 = life23_674;
    if (!((life6_5 == 0))) {
        forestValue71_568_0 = spill71_41;
        forestValue71_568_1 = spill71_42;
        break forest_join_568;
    }
    if (!((spill71_42 == life9_26))) {
        forestValue71_569_0 = spill71_41;
        break forest_join_569;
    }
    forestValue71_568_0 = spill71_41;
    forestValue71_568_1 = __invokedynamic71_74(2229, (4641770119443574328L ^ life4_3));
    }
    forestValue71_570_0 = forestValue71_568_0;
    forestValue71_570_1 = forestValue71_568_1;
    break forest_join_570;
    }
    forestValue71_570_0 = forestValue71_569_0;
    forestValue71_570_1 = 0;
    }
    life24_728 = ((byte) (forestValue71_570_0 | forestValue71_570_1));
    spill71_43 = life25_683;
    if (!((life23_674 == life12_47))) {
        forestValue71_586_0 = spill71_43;
        break forest_join_586;
    }
    if (!((life15_92 == __fieldRead71_75()))) {
        forestValue71_586_0 = spill71_43;
        break forest_join_586;
    }
    forestValue71_587_0 = spill71_43;
    forestValue71_587_1 = __invokedynamic71_76(13126, (5278547734281541078L ^ life4_3));
    break forest_join_587;
    }
    forestValue71_587_0 = forestValue71_586_0;
    forestValue71_587_1 = 0;
    }
    life25_749 = ((byte) (forestValue71_587_0 | forestValue71_587_1));
    spill71_44 = life25_749;
    if (!((life23_674 == life9_26))) {
        forestValue71_603_0 = spill71_44;
        break forest_join_603;
    }
    if (!((life15_92 == __fieldRead71_77()))) {
        forestValue71_603_0 = spill71_44;
        break forest_join_603;
    }
    forestValue71_604_0 = spill71_44;
    forestValue71_604_1 = __invokedynamic71_78(2229, (4641770119443574328L ^ life4_3));
    break forest_join_604;
    }
    forestValue71_604_0 = forestValue71_603_0;
    forestValue71_604_1 = 0;
    }
    life25_770 = ((byte) (forestValue71_604_0 | forestValue71_604_1));
    spill71_45 = __call71_80(__fieldRead71_79(receiver), life16_122);
    if (!((life6_5 == 0))) {
        forestValue71_618_0 = __integerCategory71_81(spill71_45);
        break forest_join_618;
    }
    if (!(spill71_45)) {
        break forest_join_617;
    }
    life16_122 += 1;
    if (!((life6_5 != 0))) {
        break forest_join_643;
    }
    }
    forestValue71_618_0 = life25_770;
    }
    if (!((life6_5 == 0))) {
        forestValue71_638_0 = forestValue71_618_0;
        break forest_join_638;
    }
    if (!((forestValue71_618_0 != 0))) {
        break forest_join_642;
    }
    __call71_83(__fieldRead71_82(receiver), ((double) life17_202), ((double) life20_584), ((double) life23_674));
    forestValue71_638_0 = __integerCategory71_86(__call71_85(receiver, p2, __fieldRead71_84(receiver), life24_728, life25_770));
    }
    if (!((life6_5 == 0))) {
        forestValue71_662_0 = forestValue71_638_0;
        break forest_join_662;
    }
    if (!((forestValue71_638_0 != 0))) {
        break forest_join_642;
    }
    break forest_join_661;
    }
    life16_122 += 1;
    }
    life23_674 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_532;
    }
    break forest_cycle_532;
    }
    }
    life20_584 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_463;
    }
    break forest_cycle_463;
    }
    break forest_join_656;
    }
    if (!((forestValue71_650_1 == forestValue71_650_2))) {
        forestValue71_652_0 = forestValue71_650_0;
        break forest_join_652;
    }
    forestValue71_654_0 = forestValue71_650_0;
    break forest_join_654;
    }
    spill71_46 = 0;
    forestValue71_420_0 = forestValue71_652_0;
    forestValue71_420_1 = spill71_46;
    continue forest_cycle_420;
    }
    spill71_47 = 1;
    forestValue71_420_0 = forestValue71_654_0;
    forestValue71_420_1 = spill71_47;
    continue forest_cycle_420;
    }
    }
    life17_202 += 1;
    if (!((life6_5 != 0))) {
        continue forest_cycle_172;
    }
    break forest_cycle_172;
    }
    }
    forestValue71_660_0 = 0;
    }
    return __integerCategory71_87(forestValue71_660_0);
    }
    forestValue71_662_0 = 1;
    }
    return __integerCategory71_88(forestValue71_662_0);
}
public static boolean h71_0(java.lang.Throwable p0) throws Throwable {
    throw __call3007100_0(p0);
}
public static boolean h71_1(java.lang.Throwable p0) throws Throwable {
    throw __call3007101_0(p0);
}
public static boolean h71_2(java.lang.Throwable p0) throws Throwable {
    throw __call3007102_0(p0);
}
public static boolean h71_3(java.lang.Throwable p0) throws Throwable {
    throw __call3007103_0(p0);
}
public static boolean h71_4(java.lang.Throwable p0) throws Throwable {
    throw __call3007104_0(p0);
}
public static boolean h71_5(java.lang.Throwable p0) throws Throwable {
    throw __call3007105_0(p0);
}
public static boolean h71_6(java.lang.Throwable p0) throws Throwable {
    throw __call3007106_0(p0);
}
public static boolean h71_7(java.lang.Throwable p0) throws Throwable {
    throw __call3007107_0(p0);
}
public static boolean h71_8(java.lang.Throwable p0) throws Throwable {
    throw __call3007108_0(p0);
}
public static boolean h71_9(java.lang.Throwable p0) throws Throwable {
    throw __call3007109_0(p0);
}
public static boolean h71_10(java.lang.Throwable p0) throws Throwable {
    throw __call3007110_0(p0);
}
public static boolean h71_11(java.lang.Throwable p0) throws Throwable {
    throw __call3007111_0(p0);
}
public static boolean h71_12(java.lang.Throwable p0) throws Throwable {
    throw __call3007112_0(p0);
}
public static boolean h71_13(java.lang.Throwable p0) throws Throwable {
    throw __call3007113_0(p0);
}
public static boolean h71_14(java.lang.Throwable p0) throws Throwable {
    throw __call3007114_0(p0);
}
public static boolean h71_15(java.lang.Throwable p0) throws Throwable {
    throw __call3007115_0(p0);
}
public static boolean h71_16(java.lang.Throwable p0) throws Throwable {
    throw __call3007116_0(p0);
}
public static boolean h71_17(java.lang.Throwable p0) throws Throwable {
    throw __call3007117_0(p0);
}
public static boolean h71_18(java.lang.Throwable p0) throws Throwable {
    throw __call3007118_0(p0);
}
public static boolean h71_19(java.lang.Throwable p0) throws Throwable {
    throw __call3007119_0(p0);
}
public static boolean h71_20(java.lang.Throwable p0) throws Throwable {
    throw __call3007120_0(p0);
}
public static boolean h71_21(java.lang.Throwable p0) throws Throwable {
    throw __call3007121_0(p0);
}
public static boolean h71_22(java.lang.Throwable p0) throws Throwable {
    throw __call3007122_0(p0);
}
public static boolean h71_23(java.lang.Throwable p0) throws Throwable {
    throw __call3007123_0(p0);
}
public static boolean h71_24(java.lang.Throwable p0) throws Throwable {
    throw __call3007124_0(p0);
}
public static boolean h71_25(java.lang.Throwable p0) throws Throwable {
    throw __call3007125_0(p0);
}
public static boolean h71_26(java.lang.Throwable p0) throws Throwable {
    throw __call3007126_0(p0);
}
public static boolean h71_27(java.lang.Throwable p0) throws Throwable {
    throw __call3007127_0(p0);
}
public static boolean h71_28(java.lang.Throwable p0) throws Throwable {
    throw __call3007128_0(p0);
}
public static boolean h71_29(java.lang.Throwable p0) throws Throwable {
    throw __call3007129_0(p0);
}
public static boolean h71_30(java.lang.Throwable p0) throws Throwable {
    throw __call3007130_0(p0);
}
public static boolean h71_31(java.lang.Throwable p0) throws Throwable {
    throw __call3007131_0(p0);
}
public static boolean h71_32(java.lang.Throwable p0) throws Throwable {
    throw __call3007132_0(p0);
}
public static boolean h71_33(java.lang.Throwable p0) throws Throwable {
    throw __call3007133_0(p0);
}
public static boolean h71_34(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    __call3007134_0(life1_2);
    return __integerCategory3007134_1(1);
}
private static native long __fieldRead71_0() throws Throwable;
private static native boolean __call71_1() throws Throwable;
private static native int __integerCategory71_2(boolean value) throws Throwable;
private static native double __fieldRead71_3(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead71_4(com.moon.hF a0) throws Throwable;
private static native int __call71_5(double a0) throws Throwable;
private static native double __fieldRead71_6(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead71_7(com.moon.hF a0) throws Throwable;
private static native int __call71_8(double a0) throws Throwable;
private static native double __fieldRead71_9(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead71_10(com.moon.hF a0) throws Throwable;
private static native int __call71_11(double a0) throws Throwable;
private static native double __fieldRead71_12(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead71_13(com.moon.hF a0) throws Throwable;
private static native int __call71_14(double a0) throws Throwable;
private static native double __fieldRead71_15(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead71_16(com.moon.hF a0) throws Throwable;
private static native int __call71_17(double a0) throws Throwable;
private static native double __fieldRead71_18(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead71_19(com.moon.hF a0) throws Throwable;
private static native int __call71_20(double a0) throws Throwable;
private static native int[] __fieldRead71_21(com.moon.hF a0) throws Throwable;
private static native double __fieldRead71_22(com.moon.n5 a0) throws Throwable;
private static native int __call71_23(double a0) throws Throwable;
private static native int[] __fieldRead71_24(com.moon.hF a0) throws Throwable;
private static native double __fieldRead71_25(com.moon.n5 a0) throws Throwable;
private static native int __call71_26(double a0) throws Throwable;
private static native int[] __fieldRead71_27(com.moon.hF a0) throws Throwable;
private static native double __fieldRead71_28(com.moon.n5 a0) throws Throwable;
private static native int __call71_29(double a0) throws Throwable;
private static native int[] __fieldRead71_30(com.moon.hF a0) throws Throwable;
private static native com.moon.b9 __call71_31(int a0, int a1, int a2) throws Throwable;
private static native int[] __fieldRead71_32(com.moon.hF a0) throws Throwable;
private static native com.moon.b9 __call71_33(int a0, int a1, int a2) throws Throwable;
private static native int[] __fieldRead71_34(com.moon.hF a0) throws Throwable;
private static native com.moon.b9 __call71_35(int a0, int a1, int a2) throws Throwable;
private static native com.moon.b9 __fieldRead71_36() throws Throwable;
private static native com.moon.b9 __fieldRead71_37() throws Throwable;
private static native com.moon.b9 __fieldRead71_38() throws Throwable;
private static native boolean __integerCategory71_39(int value) throws Throwable;
private static native java.util.BitSet __fieldRead71_40(com.moon.hF a0) throws Throwable;
private static native void __call71_41(java.util.BitSet a0) throws Throwable;
private static native int __call71_42(com.moon.hF a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.BitSet __fieldRead71_43(com.moon.hF a0) throws Throwable;
private static native void __call71_44(java.util.BitSet a0, int a1) throws Throwable;
private static native boolean __integerCategory71_45(int value) throws Throwable;
private static native void __fieldWrite71_46(com.moon.hF a0, int a1) throws Throwable;
private static native com.moon.b9 __fieldRead71_47() throws Throwable;
private static native com.moon.b9 __fieldRead71_48() throws Throwable;
private static native int __invokedynamic71_49(int a0, long a1) throws Throwable;
private static native com.moon.b9 __fieldRead71_50() throws Throwable;
private static native com.moon.b9 __fieldRead71_51() throws Throwable;
private static native int __invokedynamic71_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic71_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic71_54(int a0, long a1) throws Throwable;
private static native com.moon.b9 __fieldRead71_55() throws Throwable;
private static native int __invokedynamic71_56(int a0, long a1) throws Throwable;
private static native com.moon.b9 __fieldRead71_57() throws Throwable;
private static native int __invokedynamic71_58(int a0, long a1) throws Throwable;
private static native java.util.BitSet __fieldRead71_59(com.moon.hF a0) throws Throwable;
private static native boolean __call71_60(java.util.BitSet a0, int a1) throws Throwable;
private static native int __integerCategory71_61(boolean value) throws Throwable;
private static native com.moon.n5 __fieldRead71_62(com.moon.hF a0) throws Throwable;
private static native com.moon.n5 __call71_63(com.moon.n5 a0, double a1, double a2, double a3) throws Throwable;
private static native com.moon.n5 __fieldRead71_64(com.moon.hF a0) throws Throwable;
private static native boolean __call71_65(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, int a3, int a4) throws Throwable;
private static native int __integerCategory71_66(boolean value) throws Throwable;
private static native com.moon.b9 __fieldRead71_67() throws Throwable;
private static native com.moon.b9 __fieldRead71_68() throws Throwable;
private static native int __invokedynamic71_69(int a0, long a1) throws Throwable;
private static native com.moon.b9 __fieldRead71_70() throws Throwable;
private static native com.moon.b9 __fieldRead71_71() throws Throwable;
private static native int __invokedynamic71_72(int a0, long a1) throws Throwable;
private static native int __invokedynamic71_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic71_74(int a0, long a1) throws Throwable;
private static native com.moon.b9 __fieldRead71_75() throws Throwable;
private static native int __invokedynamic71_76(int a0, long a1) throws Throwable;
private static native com.moon.b9 __fieldRead71_77() throws Throwable;
private static native int __invokedynamic71_78(int a0, long a1) throws Throwable;
private static native java.util.BitSet __fieldRead71_79(com.moon.hF a0) throws Throwable;
private static native boolean __call71_80(java.util.BitSet a0, int a1) throws Throwable;
private static native int __integerCategory71_81(boolean value) throws Throwable;
private static native com.moon.n5 __fieldRead71_82(com.moon.hF a0) throws Throwable;
private static native com.moon.n5 __call71_83(com.moon.n5 a0, double a1, double a2, double a3) throws Throwable;
private static native com.moon.n5 __fieldRead71_84(com.moon.hF a0) throws Throwable;
private static native boolean __call71_85(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, int a3, int a4) throws Throwable;
private static native int __integerCategory71_86(boolean value) throws Throwable;
private static native boolean __integerCategory71_87(int value) throws Throwable;
private static native boolean __integerCategory71_88(int value) throws Throwable;
private static native java.lang.Throwable __call3007100_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007101_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007102_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007103_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007104_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007105_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007106_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007107_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007108_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007109_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007110_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007111_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007112_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007113_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007114_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007115_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007116_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007117_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007118_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007119_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007120_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007121_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007122_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007123_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007124_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007125_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007126_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007127_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007128_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007129_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007130_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007131_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007132_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3007133_0(java.lang.Throwable a0) throws Throwable;
private static native void __call3007134_0(java.lang.Throwable a0) throws Throwable;
private static native boolean __integerCategory3007134_1(int value) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0fe2045a71a499a5f094(com.moon.hF a0, com.moon.n5 a1, boolean a2) throws E;
private static final class __SourceHandler_0fe2045a71a499a5f094 {

public static void f459(com.moon.hF receiver, com.moon.n5 p0, boolean p1) throws Throwable {
    long life3_3;
    int life6_16;
    int life5_17;
    int life7_29;
    int life8_41;
    forward_join_60: {
    forward_join_54: {
    forward_join_52: {
    life3_3 = (__fieldRead459_0() ^ 29844947483269L);
    boolean spill459_0 = __call459_1();
    life6_16 = ((__call459_3(__fieldRead459_2(p0)) - (__fieldRead459_4(receiver))[0]) + __fieldRead459_5(receiver));
    life5_17 = __integerCategory459_6(spill459_0);
    life7_29 = ((__call459_8(__fieldRead459_7(p0)) - (__fieldRead459_9(receiver))[1]) + __fieldRead459_10(receiver));
    life8_41 = ((__call459_12(__fieldRead459_11(p0)) - (__fieldRead459_13(receiver))[2]) + __fieldRead459_14(receiver));
    if (!((life5_17 == 0))) { break forward_join_52; }
    if (!(p1)) { break forward_join_54; }
    __call459_16(__fieldRead459_15(receiver), life6_16, life7_29, life8_41);
    }
    if (!((life5_17 != 0))) { break forward_join_60; }
    }
    __call459_18(__fieldRead459_17(receiver), life6_16, life7_29, life8_41);
    }
    return;
}
public static void h459_0(moom.Oo p0) throws Throwable {
    throw __call1045900_0(p0);
}
public static void h459_1(moom.Oo p0) throws Throwable {
    throw __call1045901_0(p0);
}
public static void h459_2(moom.Oo p0) throws Throwable {
    throw __call1045902_0(p0);
}
private static native long __fieldRead459_0() throws Throwable;
private static native boolean __call459_1() throws Throwable;
private static native double __fieldRead459_2(com.moon.n5 a0) throws Throwable;
private static native int __call459_3(double a0) throws Throwable;
private static native int[] __fieldRead459_4(com.moon.hF a0) throws Throwable;
private static native int __fieldRead459_5(com.moon.hF a0) throws Throwable;
private static native int __integerCategory459_6(boolean value) throws Throwable;
private static native double __fieldRead459_7(com.moon.n5 a0) throws Throwable;
private static native int __call459_8(double a0) throws Throwable;
private static native int[] __fieldRead459_9(com.moon.hF a0) throws Throwable;
private static native int __fieldRead459_10(com.moon.hF a0) throws Throwable;
private static native double __fieldRead459_11(com.moon.n5 a0) throws Throwable;
private static native int __call459_12(double a0) throws Throwable;
private static native int[] __fieldRead459_13(com.moon.hF a0) throws Throwable;
private static native int __fieldRead459_14(com.moon.hF a0) throws Throwable;
private static native com.moon.hH __fieldRead459_15(com.moon.hF a0) throws Throwable;
private static native void __call459_16(com.moon.hH a0, int a1, int a2, int a3) throws Throwable;
private static native com.moon.hH __fieldRead459_17(com.moon.hF a0) throws Throwable;
private static native void __call459_18(com.moon.hH a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1045900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1045902_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8812354f8c6580df7c2d(com.moon.hF a0, com.moon.n5 a1, com.moon.n5[] a2, int a3) throws E;
private static final class __SourceHandler_8812354f8c6580df7c2d {

public static boolean f460(com.moon.hF receiver, com.moon.n5 p0, com.moon.n5[] p1, int p2) throws Throwable {
    int lexicalValue460_67_0;
    int lexicalValue460_110_0;
    int lexicalValue460_138_0;
    int lexicalValue460_174_0;
    int lexicalValue460_202_0;
    int lexicalValue460_238_0;
    int lexicalValue460_266_0;
    int lexicalValue460_313_0;
    int lexicalValue460_327_0;
    boolean spill460_0;
    boolean spill460_1;
    int spill460_2;
    int spill460_3;
    int spill460_4;
    int spill460_5;
    long life4_3;
    int life7_9;
    int life8_14;
    int life6_15;
    int life9_20;
    int life10_22;
    com.moon.n5 life11_29;
    double life12_35;
    double life14_41;
    double life16_47;
    double life18_84;
    double life20_87;
    double life22_90;
    double life24_94;
    double life26_98;
    double life28_102;
    int life30_104;
    int life31_115;
    double life36_117;
    int life32_191;
    double life34_193;
    int life33_267;
    double life38_269;
    int life40_349;
    lexical_join_327: {
    lexical_join_320: {
    life4_3 = (__fieldRead460_0() ^ 61771106105925L);
    spill460_0 = __call460_1();
    life7_9 = (__fieldRead460_2(receiver))[0];
    life8_14 = (__fieldRead460_3(receiver))[1];
    life6_15 = __integerCategory460_4(spill460_0);
    life9_20 = (__fieldRead460_5(receiver))[2];
    life10_22 = 0;
    lexical_cycle_23: while (true) {
    lexical_join_317: {
    lexical_join_314: {
    lexical_join_313: {
    lexical_join_285: {
    lexical_join_266: {
    lexical_join_265: {
    lexical_join_238: {
    lexical_join_233: {
    lexical_join_221: {
    lexical_join_202: {
    lexical_join_201: {
    lexical_join_174: {
    lexical_join_169: {
    lexical_join_157: {
    lexical_join_138: {
    lexical_join_137: {
    lexical_join_110: {
    lexical_join_105: {
    lexical_join_70: {
    lexical_join_67: {
    if (!((life10_22 < p2))) {
        break lexical_join_320;
    }
    life11_29 = (p1)[life10_22];
    life12_35 = (__fieldRead460_6(p0) - __call460_7(life11_29));
    life14_41 = (__fieldRead460_8(p0) - __call460_9(life11_29));
    life16_47 = (__fieldRead460_10(p0) - __call460_11(life11_29));
    spill460_1 = __fieldRead460_12(receiver);
    if (!((life6_15 == 0))) {
        lexicalValue460_327_0 = __integerCategory460_13(spill460_1);
        break lexical_join_327;
    }
    if (!((life6_15 == 0))) {
        lexicalValue460_67_0 = __integerCategory460_14(spill460_1);
        break lexical_join_67;
    }
    if (!(spill460_1)) {
        break lexical_join_70;
    }
    lexicalValue460_67_0 = __integerCategory460_18(__call460_17(receiver, __fieldRead460_15(receiver), p0, __call460_16(new com.moon.n5(life12_35, life14_41, life16_47))));
    }
    if (!((lexicalValue460_67_0 != 0))) {
        break lexical_join_70;
    }
    if (!((life6_15 != 0))) {
        break lexical_join_317;
    }
    }
    life18_84 = __call460_19(life12_35);
    life20_87 = __call460_20(life14_41);
    life22_90 = __call460_21(life16_47);
    life24_94 = (0x1.0p0d / life18_84);
    life26_98 = (0x1.0p0d / life20_87);
    life28_102 = (0x1.0p0d / life22_90);
    life30_104 = 1;
    spill460_2 = __numericCompare460_22(life18_84, 0x0.0p0d);
    if (!((life6_15 == 0))) {
        lexicalValue460_110_0 = spill460_2;
        break lexical_join_110;
    }
    if (!((spill460_2 == 0))) {
        break lexical_join_105;
    }
    life31_115 = 0;
    life36_117 = life24_94;
    if (!((life6_15 != 0))) {
        break lexical_join_157;
    }
    }
    lexicalValue460_110_0 = __numericCompare460_25(__fieldRead460_23(life11_29), __fieldRead460_24(p0));
    }
    if (!((life6_15 == 0))) {
        lexicalValue460_138_0 = lexicalValue460_110_0;
        break lexical_join_138;
    }
    if (!((lexicalValue460_110_0 > 0))) {
        break lexical_join_137;
    }
    life31_115 = 1;
    life30_104 = (life30_104 + (__call460_27(__fieldRead460_26(life11_29)) - life7_9));
    life36_117 = ((double) ((float) ((((double) (life7_9 + 1)) - __fieldRead460_28(p0)) * life24_94)));
    if (!((life6_15 != 0))) {
        break lexical_join_157;
    }
    }
    lexicalValue460_138_0 = -1;
    }
    life31_115 = lexicalValue460_138_0;
    life30_104 = (life30_104 + (life7_9 - __call460_30(__fieldRead460_29(life11_29))));
    life36_117 = ((double) ((float) ((__fieldRead460_31(p0) - ((double) life7_9)) * life24_94)));
    }
    spill460_3 = __numericCompare460_32(life20_87, 0x0.0p0d);
    if (!((life6_15 == 0))) {
        lexicalValue460_174_0 = spill460_3;
        break lexical_join_174;
    }
    if (!((spill460_3 == 0))) {
        break lexical_join_169;
    }
    life32_191 = 0;
    life34_193 = life26_98;
    if (!((life6_15 != 0))) {
        break lexical_join_221;
    }
    }
    lexicalValue460_174_0 = __numericCompare460_35(__fieldRead460_33(life11_29), __fieldRead460_34(p0));
    }
    if (!((life6_15 == 0))) {
        lexicalValue460_202_0 = lexicalValue460_174_0;
        break lexical_join_202;
    }
    if (!((lexicalValue460_174_0 > 0))) {
        break lexical_join_201;
    }
    life32_191 = 1;
    life30_104 = (life30_104 + (__call460_37(__fieldRead460_36(life11_29)) - life8_14));
    life34_193 = ((double) ((float) ((((double) (life8_14 + 1)) - __fieldRead460_38(p0)) * life26_98)));
    if (!((life6_15 != 0))) {
        break lexical_join_221;
    }
    }
    lexicalValue460_202_0 = -1;
    }
    life32_191 = lexicalValue460_202_0;
    life30_104 = (life30_104 + (life8_14 - __call460_40(__fieldRead460_39(life11_29))));
    life34_193 = ((double) ((float) ((__fieldRead460_41(p0) - ((double) life8_14)) * life26_98)));
    }
    spill460_4 = __numericCompare460_42(life22_90, 0x0.0p0d);
    if (!((life6_15 == 0))) {
        lexicalValue460_238_0 = spill460_4;
        break lexical_join_238;
    }
    if (!((spill460_4 == 0))) {
        break lexical_join_233;
    }
    life33_267 = 0;
    life38_269 = life28_102;
    if (!((life6_15 != 0))) {
        break lexical_join_285;
    }
    }
    lexicalValue460_238_0 = __numericCompare460_45(__fieldRead460_43(life11_29), __fieldRead460_44(p0));
    }
    if (!((life6_15 == 0))) {
        lexicalValue460_266_0 = lexicalValue460_238_0;
        break lexical_join_266;
    }
    if (!((lexicalValue460_238_0 > 0))) {
        break lexical_join_265;
    }
    life33_267 = 1;
    life30_104 = (life30_104 + (__call460_47(__fieldRead460_46(life11_29)) - life9_20));
    life38_269 = ((double) ((float) ((((double) (life9_20 + 1)) - __fieldRead460_48(p0)) * life28_102)));
    if (!((life6_15 != 0))) {
        break lexical_join_285;
    }
    }
    lexicalValue460_266_0 = -1;
    }
    life33_267 = lexicalValue460_266_0;
    life30_104 = (life30_104 + (life9_20 - __call460_50(__fieldRead460_49(life11_29))));
    life38_269 = ((double) ((float) ((__fieldRead460_51(p0) - ((double) life9_20)) * life28_102)));
    }
    life40_349 = __integerCategory460_53(__call460_52(receiver, p0, life7_9, life8_14, life9_20, life24_94, life26_98, life28_102, life30_104, life31_115, life32_191, life33_267, life34_193, life36_117, life38_269));
    spill460_5 = life40_349;
    if (!((life6_15 == 0))) {
        lexicalValue460_313_0 = spill460_5;
        break lexical_join_313;
    }
    if (!((spill460_5 != 0))) {
        break lexical_join_314;
    }
    __call460_54(receiver, (p1)[0], 1);
    lexicalValue460_313_0 = 1;
    }
    return __integerCategory460_55(lexicalValue460_313_0);
    }
    __fieldWrite460_56(receiver, 1);
    }
    life10_22 += 1;
    if (!((life6_15 != 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    __call460_57(receiver, (p1)[0], 0);
    lexicalValue460_327_0 = 0;
    }
    return __integerCategory460_58(lexicalValue460_327_0);
}
public static void h460_0(moom.Oo p0) throws Throwable {
    throw __call1046000_0(p0);
}
public static void h460_1(moom.Oo p0) throws Throwable {
    throw __call1046001_0(p0);
}
public static void h460_2(moom.Oo p0) throws Throwable {
    throw __call1046002_0(p0);
}
public static void h460_3(moom.Oo p0) throws Throwable {
    throw __call1046003_0(p0);
}
public static void h460_4(moom.Oo p0) throws Throwable {
    throw __call1046004_0(p0);
}
public static void h460_5(moom.Oo p0) throws Throwable {
    throw __call1046005_0(p0);
}
public static void h460_6(moom.Oo p0) throws Throwable {
    throw __call1046006_0(p0);
}
public static void h460_7(moom.Oo p0) throws Throwable {
    throw __call1046007_0(p0);
}
public static void h460_8(moom.Oo p0) throws Throwable {
    throw __call1046008_0(p0);
}
public static void h460_9(moom.Oo p0) throws Throwable {
    throw __call1046009_0(p0);
}
public static void h460_10(moom.Oo p0) throws Throwable {
    throw __call1046010_0(p0);
}
public static void h460_11(moom.Oo p0) throws Throwable {
    throw __call1046011_0(p0);
}
public static void h460_12(moom.Oo p0) throws Throwable {
    throw __call1046012_0(p0);
}
public static void h460_13(moom.Oo p0) throws Throwable {
    throw __call1046013_0(p0);
}
public static void h460_14(moom.Oo p0) throws Throwable {
    throw __call1046014_0(p0);
}
public static void h460_15(moom.Oo p0) throws Throwable {
    throw __call1046015_0(p0);
}
public static void h460_16(moom.Oo p0) throws Throwable {
    throw __call1046016_0(p0);
}
public static void h460_17(moom.Oo p0) throws Throwable {
    throw __call1046017_0(p0);
}
private static native long __fieldRead460_0() throws Throwable;
private static native boolean __call460_1() throws Throwable;
private static native int[] __fieldRead460_2(com.moon.hF a0) throws Throwable;
private static native int[] __fieldRead460_3(com.moon.hF a0) throws Throwable;
private static native int __integerCategory460_4(boolean value) throws Throwable;
private static native int[] __fieldRead460_5(com.moon.hF a0) throws Throwable;
private static native double __fieldRead460_6(com.moon.n5 a0) throws Throwable;
private static native double __call460_7(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_8(com.moon.n5 a0) throws Throwable;
private static native double __call460_9(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_10(com.moon.n5 a0) throws Throwable;
private static native double __call460_11(com.moon.n5 a0) throws Throwable;
private static native boolean __fieldRead460_12(com.moon.hF a0) throws Throwable;
private static native int __integerCategory460_13(boolean value) throws Throwable;
private static native int __integerCategory460_14(boolean value) throws Throwable;
private static native int[] __fieldRead460_15(com.moon.hF a0) throws Throwable;
private static native com.moon.n5 __call460_16(com.moon.n5 a0) throws Throwable;
private static native boolean __call460_17(com.moon.hF a0, int[] a1, com.moon.n5 a2, com.moon.n5 a3) throws Throwable;
private static native int __integerCategory460_18(boolean value) throws Throwable;
private static native double __call460_19(double a0) throws Throwable;
private static native double __call460_20(double a0) throws Throwable;
private static native double __call460_21(double a0) throws Throwable;
private static native int __numericCompare460_22(double a0, double a1) throws Throwable;
private static native double __fieldRead460_23(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_24(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare460_25(double a0, double a1) throws Throwable;
private static native double __fieldRead460_26(com.moon.n5 a0) throws Throwable;
private static native int __call460_27(double a0) throws Throwable;
private static native double __fieldRead460_28(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_29(com.moon.n5 a0) throws Throwable;
private static native int __call460_30(double a0) throws Throwable;
private static native double __fieldRead460_31(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare460_32(double a0, double a1) throws Throwable;
private static native double __fieldRead460_33(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_34(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare460_35(double a0, double a1) throws Throwable;
private static native double __fieldRead460_36(com.moon.n5 a0) throws Throwable;
private static native int __call460_37(double a0) throws Throwable;
private static native double __fieldRead460_38(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_39(com.moon.n5 a0) throws Throwable;
private static native int __call460_40(double a0) throws Throwable;
private static native double __fieldRead460_41(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare460_42(double a0, double a1) throws Throwable;
private static native double __fieldRead460_43(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_44(com.moon.n5 a0) throws Throwable;
private static native int __numericCompare460_45(double a0, double a1) throws Throwable;
private static native double __fieldRead460_46(com.moon.n5 a0) throws Throwable;
private static native int __call460_47(double a0) throws Throwable;
private static native double __fieldRead460_48(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead460_49(com.moon.n5 a0) throws Throwable;
private static native int __call460_50(double a0) throws Throwable;
private static native double __fieldRead460_51(com.moon.n5 a0) throws Throwable;
private static native boolean __call460_52(com.moon.hF a0, com.moon.n5 a1, int a2, int a3, int a4, double a5, double a6, double a7, int a8, int a9, int a10, int a11, double a12, double a13, double a14) throws Throwable;
private static native int __integerCategory460_53(boolean value) throws Throwable;
private static native void __call460_54(com.moon.hF a0, com.moon.n5 a1, int a2) throws Throwable;
private static native boolean __integerCategory460_55(int value) throws Throwable;
private static native void __fieldWrite460_56(com.moon.hF a0, int a1) throws Throwable;
private static native void __call460_57(com.moon.hF a0, com.moon.n5 a1, int a2) throws Throwable;
private static native boolean __integerCategory460_58(int value) throws Throwable;
private static native java.lang.Throwable __call1046000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1046017_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6982b1ea50546b1b2afe(com.moon.hF a0, int[] a1, com.moon.n5 a2, com.moon.n5 a3) throws E;
private static final class __SourceHandler_6982b1ea50546b1b2afe {

public static boolean f34(com.moon.hF receiver, int[] p0, com.moon.n5 p1, com.moon.n5 p2) throws Throwable {
    int forwardValue34_122_0;
    int forwardValue34_128_0;
    boolean spill34_0;
    int spill34_1;
    long life4_3;
    com.moon.n5 life7_12;
    double life8_23;
    double life10_36;
    double life12_47;
    double life14_60;
    double life16_71;
    double life18_84;
    double life20_96;
    double life22_109;
    int life6_110;
    forward_join_128: {
    forward_join_127: {
    forward_join_122: {
    forward_join_119: {
    life4_3 = (__fieldRead34_0() ^ 37532996909872L);
    life7_12 = __call34_1(new com.moon.n5(0x1.0p0d, 0x1.0p0d, 0x1.0p0d), p2);
    life8_23 = ((((double) (p0)[0]) - __fieldRead34_2(p1)) * __fieldRead34_3(life7_12));
    life10_36 = ((((double) ((p0)[0] + 1)) - __fieldRead34_4(p1)) * __fieldRead34_5(life7_12));
    life12_47 = ((((double) (p0)[1]) - __fieldRead34_6(p1)) * __fieldRead34_7(life7_12));
    life14_60 = ((((double) ((p0)[1] + 1)) - __fieldRead34_8(p1)) * __fieldRead34_9(life7_12));
    life16_71 = ((((double) (p0)[2]) - __fieldRead34_10(p1)) * __fieldRead34_11(life7_12));
    life18_84 = ((((double) ((p0)[2] + 1)) - __fieldRead34_12(p1)) * __fieldRead34_13(life7_12));
    life20_96 = __call34_18(__call34_16(__call34_14(life8_23, life10_36), __call34_15(life12_47, life14_60)), __call34_17(life16_71, life18_84));
    spill34_0 = __call34_19();
    life22_109 = __call34_24(__call34_22(__call34_20(life8_23, life10_36), __call34_21(life12_47, life14_60)), __call34_23(life16_71, life18_84));
    life6_110 = __integerCategory34_25(spill34_0);
    spill34_1 = __numericCompare34_26(life22_109, 0x0.0p0d);
    if (!((life6_110 != 0))) {
        forwardValue34_122_0 = spill34_1;
        break forward_join_122;
    }
    if (!((spill34_1 > 0))) {
        break forward_join_119;
    }
    return __integerCategory34_27(0);
    }
    forwardValue34_122_0 = __numericCompare34_28(life20_96, life22_109);
    }
    if (!((life6_110 != 0))) {
        forwardValue34_128_0 = forwardValue34_122_0;
        break forward_join_128;
    }
    if (!((forwardValue34_122_0 > 0))) {
        break forward_join_127;
    }
    return __integerCategory34_29(0);
    }
    forwardValue34_128_0 = 1;
    }
    return __integerCategory34_30(forwardValue34_128_0);
}
public static boolean h34_0(moom.Oo p0) throws Throwable {
    throw __call2003400_0(p0);
}
public static boolean h34_1(moom.Oo p0) throws Throwable {
    throw __call2003401_0(p0);
}
public static boolean h34_2(moom.Oo p0) throws Throwable {
    throw __call2003402_0(p0);
}
public static boolean h34_3(moom.Oo p0) throws Throwable {
    throw __call2003403_0(p0);
}
private static native long __fieldRead34_0() throws Throwable;
private static native com.moon.n5 __call34_1(com.moon.n5 a0, com.moon.n5 a1) throws Throwable;
private static native double __fieldRead34_2(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_3(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_4(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_5(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_6(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_7(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_8(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_9(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_10(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_11(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_12(com.moon.n5 a0) throws Throwable;
private static native double __fieldRead34_13(com.moon.n5 a0) throws Throwable;
private static native double __call34_14(double a0, double a1) throws Throwable;
private static native double __call34_15(double a0, double a1) throws Throwable;
private static native double __call34_16(double a0, double a1) throws Throwable;
private static native double __call34_17(double a0, double a1) throws Throwable;
private static native double __call34_18(double a0, double a1) throws Throwable;
private static native boolean __call34_19() throws Throwable;
private static native double __call34_20(double a0, double a1) throws Throwable;
private static native double __call34_21(double a0, double a1) throws Throwable;
private static native double __call34_22(double a0, double a1) throws Throwable;
private static native double __call34_23(double a0, double a1) throws Throwable;
private static native double __call34_24(double a0, double a1) throws Throwable;
private static native int __integerCategory34_25(boolean value) throws Throwable;
private static native int __numericCompare34_26(double a0, double a1) throws Throwable;
private static native boolean __integerCategory34_27(int value) throws Throwable;
private static native int __numericCompare34_28(double a0, double a1) throws Throwable;
private static native boolean __integerCategory34_29(int value) throws Throwable;
private static native boolean __integerCategory34_30(int value) throws Throwable;
private static native java.lang.Throwable __call2003400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2003403_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public void a() {
((com.moon.hH)(this.d)).a();
    return;
}


private void a(com.moon.n5 p0, boolean p1) { __sourceHandlerCall_0fe2045a71a499a5f094(this, p0, p1); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19165;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/hF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1364_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean a(com.moon.n5 p0, com.moon.n5[] p1, int p2) { return __sourceHandlerCall_8812354f8c6580df7c2d(this, p0, p1, p2); }


private boolean a(int[] p0, com.moon.n5 p1, com.moon.n5 p2) { return __sourceHandlerCall_6982b1ea50546b1b2afe(this, p0, p1, p2); }


private boolean a(com.moon.n5 p0, com.moon.n5 p1, byte p2, byte p3) { return __sourceHandlerCall_c4a3521dd0a8a5308177(this, p0, p1, p2, p3); }


public boolean a(com.moon.n5 p0, com.moon.n5 p1, com.moon.n5 p2) { return __sourceHandlerCall_62a9f5df3c76aa44d5ea(this, p0, p1, p2); }


private boolean a(com.moon.n5 p0, int p1, int p2, int p3, double p4, double p5, double p6, int p7, int p8, int p9, int p10, double p11, double p12, double p13) { return __sourceHandlerCall_7967814def57791e6423(this, p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13); }


private int a(int p0, int p1, int p2) { return __sourceHandlerCall_47516c413be333d012b8(this, p0, p1, p2); }


private void a(int p0, int p1, int p2, boolean p3) { __sourceHandlerCall_ae4ff0cc8ff85ac850e7(this, p0, p1, p2, p3); }


private static native <E extends Throwable> int __sourceIntrinsic_675cf85c30b5effa_originalDynamicSite34_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_675cf85c30b5effa_originalDynamicSite34_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1364_0() throws E;
}
