package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gX {

private long a;

private boolean b;

private com.moon.gY c;

private com.moon.gY d;

private static net.minecraft.entity.Entity[] e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private static long[] m;

private static java.lang.Long[] n;

private static java.util.Map o;

public gX() { super(); }

private static void __sourceConstructorBody_868bc670b0113826(com.moon.gX receiver) throws Throwable {
long local1 = (com.moon.gX.f ^ 12986466304479L);
    com.moon.gX.__sourceConstructorInit_868bc670b0113826_0(((com.moon.gX)(receiver)));
    ((com.moon.gX)(receiver)).a = ((long)(0L));
    ((com.moon.gX)(receiver)).b = ((boolean)(false));
    ((com.moon.gX)(receiver)).c = ((com.moon.gY)(new com.moon.gY(__sourceIntrinsic_868bc670b0113826_originalDynamicSite894_4(17754, (3025002837081495845L ^ local1)))));
    ((com.moon.gX)(receiver)).d = ((com.moon.gY)(new com.moon.gY(__sourceIntrinsic_868bc670b0113826_originalDynamicSite894_6(7404, (4364132602639171730L ^ local1)))));
    return;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-4858520695340736171L)), ((long)(5101473125814193249L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(58327648805149L)))));
    net.minecraft.entity.Entity[] __sourceSpill114_6 = new net.minecraft.entity.Entity[1];
    i = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.gX.b(((net.minecraft.entity.Entity[])(__sourceSpill114_6)));
    long local22_life9 = (com.moon.gX.f ^ 31015974171338L);
    javax.crypto.Cipher local24_life11;
    javax.crypto.Cipher __sourceSpill114_13 = (local24_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill114_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill114_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill114_16 = new byte[8];
    (__sourceSpill114_16)[0] = ((byte) ((int) (local22_life9 >>> 56)));
    int local25_life17 = 1;
    while ((local25_life17 < 8)) {
        (__sourceSpill114_16)[local25_life17] = ((byte) ((int) ((local22_life9 << (local25_life17 * 8)) >>> 56)));
        local25_life17 += 1;
    }
    byte[] __sourcePreallocation114_18 = __sourceSpill114_16;
    ((javax.crypto.Cipher)(__sourceSpill114_13)).init(((int)(__sourceSpill114_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill114_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation114_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life21 = new java.lang.String[3];
    int local29_life22 = 0;
    java.lang.String local28_life23;
    int local30_life25 = ((java.lang.String)((local28_life23 = "óãA(¦ý\006«4BW\0276tt /Æò\037'ð18H®ÀhÒVÇw\r¨Ý\025iÍ[û\013\024('7>~\020ø+çEÚp9ë\034\f\001mKíI;"))).length();
    int local27_life26 = 16;
    int local26_life27 = -1;
    while (true) {
        local26_life27 += 1;
        byte[] __sourceSpill114_30 = ((java.lang.String)(((java.lang.String)(local28_life23)).substring(((int)(local26_life27)), ((int)((local26_life27 + local27_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill114_31 = local24_life11;
        byte[] local32_life33 = ((javax.crypto.Cipher)(__sourceSpill114_31)).doFinal(((byte[])(__sourceSpill114_30)));
        java.lang.String __sourceSpill114_36 = ((java.lang.String)(com.moon.gX.a(((byte[])(local32_life33))))).intern();
        java.lang.String[] __sourceSpill114_37 = local31_life21;
        int __sourceSpill114_38 = local29_life22;
        local29_life22 += 1;
        (__sourceSpill114_37)[__sourceSpill114_38] = __sourceSpill114_36;
        if (!(((local26_life27 = (local26_life27 + local27_life26)) < local30_life25))) { break; }
        local27_life26 = ((java.lang.String)(local28_life23)).charAt(((int)(local26_life27)));
    }
    g = ((java.lang.String[])(local31_life21));
    h = ((java.lang.String[])(new java.lang.String[3]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life44;
    javax.crypto.Cipher __sourceSpill114_46 = (local11_life44 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill114_47 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill114_48 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill114_49 = new byte[8];
    (__sourceSpill114_49)[0] = ((byte) ((int) (local22_life9 >>> 56)));
    int local12_life50 = 1;
    while ((local12_life50 < 8)) {
        (__sourceSpill114_49)[local12_life50] = ((byte) ((int) ((local22_life9 << (local12_life50 * 8)) >>> 56)));
        local12_life50 += 1;
    }
    byte[] __sourcePreallocation114_51 = __sourceSpill114_49;
    ((javax.crypto.Cipher)(__sourceSpill114_46)).init(((int)(__sourceSpill114_47)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill114_48)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation114_51)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life54 = new long[2];
    int local14_life55 = 0;
    java.lang.String local15_life56;
    int local16_life58 = ((java.lang.String)((local15_life56 = "\017\036\004/IÁôdÄ\",ÁpØ"))).length();
    int local13_life59 = 0;
    do {
        java.lang.String __sourceSpill114_60 = local15_life56;
        int __sourceSpill114_61 = local13_life59;
        local13_life59 += 8;
        byte[] local18_life64 = ((java.lang.String)(((java.lang.String)(__sourceSpill114_60)).substring(((int)(__sourceSpill114_61)), ((int)(local13_life59))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill114_65 = local17_life54;
        int __sourceSpill114_66 = local14_life55;
        local14_life55 += 1;
        long local19_life67 = (((((((((((long) (local18_life64)[0]) & 255L) << 56) | ((((long) (local18_life64)[1]) & 255L) << 48)) | ((((long) (local18_life64)[2]) & 255L) << 40)) | ((((long) (local18_life64)[3]) & 255L) << 32)) | ((((long) (local18_life64)[4]) & 255L) << 24)) | ((((long) (local18_life64)[5]) & 255L) << 16)) | ((((long) (local18_life64)[6]) & 255L) << 8)) | (((long) (local18_life64)[7]) & 255L));
        byte[] __sourceSpill114_68 = new byte[8];
        (__sourceSpill114_68)[0] = ((byte) ((int) (local19_life67 >>> 56)));
        (__sourceSpill114_68)[1] = ((byte) ((int) (local19_life67 >>> 48)));
        (__sourceSpill114_68)[2] = ((byte) ((int) (local19_life67 >>> 40)));
        (__sourceSpill114_68)[3] = ((byte) ((int) (local19_life67 >>> 32)));
        (__sourceSpill114_68)[4] = ((byte) ((int) (local19_life67 >>> 24)));
        (__sourceSpill114_68)[5] = ((byte) ((int) (local19_life67 >>> 16)));
        (__sourceSpill114_68)[6] = ((byte) ((int) (local19_life67 >>> 8)));
        (__sourceSpill114_68)[7] = ((byte) ((int) local19_life67));
        javax.crypto.Cipher __sourceSpill114_69 = local11_life44;
        byte[] local21_life71 = ((javax.crypto.Cipher)(__sourceSpill114_69)).doFinal(((byte[])(__sourceSpill114_68)));
        (__sourceSpill114_65)[__sourceSpill114_66] = (((((((((((long) (local21_life71)[0]) & 255L) << 56) | ((((long) (local21_life71)[1]) & 255L) << 48)) | ((((long) (local21_life71)[2]) & 255L) << 40)) | ((((long) (local21_life71)[3]) & 255L) << 32)) | ((((long) (local21_life71)[4]) & 255L) << 24)) | ((((long) (local21_life71)[5]) & 255L) << 16)) | ((((long) (local21_life71)[6]) & 255L) << 8)) | (((long) (local21_life71)[7]) & 255L));
    } while ((!(local13_life59 >= local16_life58)));
    j = ((long[])(local17_life54));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life76;
    javax.crypto.Cipher __sourceSpill114_78 = (local0_life76 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill114_79 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill114_80 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill114_81 = new byte[8];
    (__sourceSpill114_81)[0] = ((byte) ((int) (local22_life9 >>> 56)));
    int local1_life82 = 1;
    while ((local1_life82 < 8)) {
        (__sourceSpill114_81)[local1_life82] = ((byte) ((int) ((local22_life9 << (local1_life82 * 8)) >>> 56)));
        local1_life82 += 1;
    }
    byte[] __sourcePreallocation114_83 = __sourceSpill114_81;
    ((javax.crypto.Cipher)(__sourceSpill114_78)).init(((int)(__sourceSpill114_79)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill114_80)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation114_83)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life86 = new long[4];
    int local3_life87 = 0;
    java.lang.String local4_life88;
    int local5_life90 = ((java.lang.String)((local4_life88 = "l®ÐodWr­û(þJ®<Þ"))).length();
    int local2_life91 = 0;
    do {
        java.lang.String __sourceSpill114_92 = local4_life88;
        int __sourceSpill114_93 = local2_life91;
        local2_life91 += 8;
        byte[] local7_life96 = ((java.lang.String)(((java.lang.String)(__sourceSpill114_92)).substring(((int)(__sourceSpill114_93)), ((int)(local2_life91))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill114_97 = local6_life86;
        int __sourceSpill114_98 = local3_life87;
        local3_life87 += 1;
        long local8_life99 = (((((((((((long) (local7_life96)[0]) & 255L) << 56) | ((((long) (local7_life96)[1]) & 255L) << 48)) | ((((long) (local7_life96)[2]) & 255L) << 40)) | ((((long) (local7_life96)[3]) & 255L) << 32)) | ((((long) (local7_life96)[4]) & 255L) << 24)) | ((((long) (local7_life96)[5]) & 255L) << 16)) | ((((long) (local7_life96)[6]) & 255L) << 8)) | (((long) (local7_life96)[7]) & 255L));
        byte[] __sourceSpill114_100 = new byte[8];
        (__sourceSpill114_100)[0] = ((byte) ((int) (local8_life99 >>> 56)));
        (__sourceSpill114_100)[1] = ((byte) ((int) (local8_life99 >>> 48)));
        (__sourceSpill114_100)[2] = ((byte) ((int) (local8_life99 >>> 40)));
        (__sourceSpill114_100)[3] = ((byte) ((int) (local8_life99 >>> 32)));
        (__sourceSpill114_100)[4] = ((byte) ((int) (local8_life99 >>> 24)));
        (__sourceSpill114_100)[5] = ((byte) ((int) (local8_life99 >>> 16)));
        (__sourceSpill114_100)[6] = ((byte) ((int) (local8_life99 >>> 8)));
        (__sourceSpill114_100)[7] = ((byte) ((int) local8_life99));
        javax.crypto.Cipher __sourceSpill114_101 = local0_life76;
        byte[] local10_life103 = ((javax.crypto.Cipher)(__sourceSpill114_101)).doFinal(((byte[])(__sourceSpill114_100)));
        (__sourceSpill114_97)[__sourceSpill114_98] = (((((((((((long) (local10_life103)[0]) & 255L) << 56) | ((((long) (local10_life103)[1]) & 255L) << 48)) | ((((long) (local10_life103)[2]) & 255L) << 40)) | ((((long) (local10_life103)[3]) & 255L) << 32)) | ((((long) (local10_life103)[4]) & 255L) << 24)) | ((((long) (local10_life103)[5]) & 255L) << 16)) | ((((long) (local10_life103)[6]) & 255L) << 8)) | (((long) (local10_life103)[7]) & 255L));
    } while ((!(local2_life91 >= local5_life90)));
    local5_life90 = ((java.lang.String)((local4_life88 = "!Ófðð\006wóÃJOsæw²¬"))).length();
    local2_life91 = 0;
    do {
        java.lang.String __sourceSpill114_105 = local4_life88;
        int __sourceSpill114_106 = local2_life91;
        local2_life91 += 8;
        byte[] local7_life109 = ((java.lang.String)(((java.lang.String)(__sourceSpill114_105)).substring(((int)(__sourceSpill114_106)), ((int)(local2_life91))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill114_110 = local6_life86;
        int __sourceSpill114_111 = local3_life87;
        local3_life87 += 1;
        long local8_life112 = (((((((((((long) (local7_life109)[0]) & 255L) << 56) | ((((long) (local7_life109)[1]) & 255L) << 48)) | ((((long) (local7_life109)[2]) & 255L) << 40)) | ((((long) (local7_life109)[3]) & 255L) << 32)) | ((((long) (local7_life109)[4]) & 255L) << 24)) | ((((long) (local7_life109)[5]) & 255L) << 16)) | ((((long) (local7_life109)[6]) & 255L) << 8)) | (((long) (local7_life109)[7]) & 255L));
        byte[] __sourceSpill114_113 = new byte[8];
        (__sourceSpill114_113)[0] = ((byte) ((int) (local8_life112 >>> 56)));
        (__sourceSpill114_113)[1] = ((byte) ((int) (local8_life112 >>> 48)));
        (__sourceSpill114_113)[2] = ((byte) ((int) (local8_life112 >>> 40)));
        (__sourceSpill114_113)[3] = ((byte) ((int) (local8_life112 >>> 32)));
        (__sourceSpill114_113)[4] = ((byte) ((int) (local8_life112 >>> 24)));
        (__sourceSpill114_113)[5] = ((byte) ((int) (local8_life112 >>> 16)));
        (__sourceSpill114_113)[6] = ((byte) ((int) (local8_life112 >>> 8)));
        (__sourceSpill114_113)[7] = ((byte) ((int) local8_life112));
        javax.crypto.Cipher __sourceSpill114_114 = local0_life76;
        byte[] local10_life116 = ((javax.crypto.Cipher)(__sourceSpill114_114)).doFinal(((byte[])(__sourceSpill114_113)));
        (__sourceSpill114_110)[__sourceSpill114_111] = (((((((((((long) (local10_life116)[0]) & 255L) << 56) | ((((long) (local10_life116)[1]) & 255L) << 48)) | ((((long) (local10_life116)[2]) & 255L) << 40)) | ((((long) (local10_life116)[3]) & 255L) << 32)) | ((((long) (local10_life116)[4]) & 255L) << 24)) | ((((long) (local10_life116)[5]) & 255L) << 16)) | ((((long) (local10_life116)[6]) & 255L) << 8)) | (((long) (local10_life116)[7]) & 255L));
    } while ((!(local2_life91 >= local5_life90)));
    m = ((long[])(local6_life86));
    n = ((java.lang.Long[])(new java.lang.Long[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_868bc670b0113826_0(com.moon.gX a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_025dc6b8938e114671d0(com.moon.gX a0, int a1) throws E;
private static final class __SourceHandler_025dc6b8938e114671d0 {

public static void f63(com.moon.gX receiver, int p0) throws Throwable {
    int forestValue63_15_0;
    com.moon.gX forestValue63_19_0;
    int spill63_0;
    com.moon.gX spill63_1;
    com.moon.gY spill63_2;
    long spill63_3;
    com.moon.gY spill63_4;
    long spill63_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    long life5_23;
    long life7_40;
    long life5_56;
    long life7_72;
    forest_join_94: {
    forest_join_78: {
    forest_join_50: {
    forest_join_47: {
    forest_join_19: {
    forest_join_18: {
    forest_join_15: {
    forest_join_11: {
    life2_3 = (__fieldRead63_0() ^ 1512110028235L);
    life4_5 = __call63_1();
    spill63_0 = p0;
    if (!((life4_5 != null))) {
        forestValue63_15_0 = spill63_0;
        break forest_join_15;
    }
    if (!((spill63_0 <= 0))) {
        break forest_join_11;
    }
    return;
    }
    spill63_1 = receiver;
    if (!((life4_5 != null))) {
        forestValue63_19_0 = spill63_1;
        break forest_join_19;
    }
    forestValue63_15_0 = __integerCategory63_3(__fieldRead63_2(spill63_1));
    }
    if (!((forestValue63_15_0 == 0))) {
        break forest_join_18;
    }
    __call63_4(receiver);
    }
    forestValue63_19_0 = receiver;
    }
    life5_23 = __call63_5(forestValue63_19_0);
    forest_cycle_21: while (true) {
    if (!((__numericCompare63_9((__fieldRead63_6(receiver) - life5_23), __call63_8(__fieldRead63_7(receiver))) > 0))) {
        break forest_join_47;
    }
    __call63_10(1L);
    spill63_2 = __fieldRead63_11(receiver);
    long __stackOp63_13_0 = __call63_12(receiver);
    spill63_3 = __stackOp63_13_0;
    life7_40 = __stackOp63_13_0;
    __call63_14(spill63_2, (spill63_3 - life5_23));
    life5_23 = life7_40;
    if (!((life4_5 != null))) {
        break forest_join_50;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    }
    __call63_16(__fieldRead63_15(receiver));
    }
    life5_56 = __call63_17(receiver);
    forest_cycle_53: while (true) {
    if (!((__numericCompare63_21((__fieldRead63_18(receiver) - life5_56), __call63_20(__fieldRead63_19(receiver))) > 0))) {
        break forest_join_78;
    }
    __call63_22();
    spill63_4 = __fieldRead63_23(receiver);
    long __stackOp63_25_0 = __call63_24(receiver);
    spill63_5 = __stackOp63_25_0;
    life7_72 = __stackOp63_25_0;
    __call63_26(spill63_4, (spill63_5 - life5_56));
    life5_56 = life7_72;
    if (!((life4_5 != null))) {
        break forest_join_94;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    }
    __fieldWrite63_31(receiver, __call63_30((__fieldRead63_27(receiver) + (__invokedynamic63_28(2884, (6567644778271623096L ^ life2_3)) / ((long) p0))), __call63_29(receiver)));
    }
    return;
}
public static void h63_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call3006300_0(p0);
}
public static void h63_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call3006301_0(p0);
}
public static void h63_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call3006302_0(p0);
}
public static void h63_3(java.lang.InterruptedException p0) throws Throwable {
    throw __call3006303_0(p0);
}
public static void h63_4(java.lang.InterruptedException p0) throws Throwable {
    throw __call3006304_0(p0);
}
public static void h63_5(java.lang.InterruptedException p0, com.moon.gX p1, int p2, long p3) throws Throwable {
    java.lang.InterruptedException life5_2;
    life5_2 = p0;
    __call3006305_0(life5_2);
    __fieldWrite3006305_5(p1, __call3006305_4((__fieldRead3006305_1(p1) + (__invokedynamic3006305_2(2884, (6567644778271623096L ^ p3)) / ((long) p2))), __call3006305_3(p1)));
    return;
}
private static native long __fieldRead63_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call63_1() throws Throwable;
private static native boolean __fieldRead63_2(com.moon.gX a0) throws Throwable;
private static native int __integerCategory63_3(boolean value) throws Throwable;
private static native void __call63_4(com.moon.gX a0) throws Throwable;
private static native long __call63_5(com.moon.gX a0) throws Throwable;
private static native long __fieldRead63_6(com.moon.gX a0) throws Throwable;
private static native com.moon.gY __fieldRead63_7(com.moon.gX a0) throws Throwable;
private static native long __call63_8(com.moon.gY a0) throws Throwable;
private static native int __numericCompare63_9(long a0, long a1) throws Throwable;
private static native void __call63_10(long a0) throws Throwable;
private static native com.moon.gY __fieldRead63_11(com.moon.gX a0) throws Throwable;
private static native long __call63_12(com.moon.gX a0) throws Throwable;
private static native void __call63_14(com.moon.gY a0, long a1) throws Throwable;
private static native com.moon.gY __fieldRead63_15(com.moon.gX a0) throws Throwable;
private static native void __call63_16(com.moon.gY a0) throws Throwable;
private static native long __call63_17(com.moon.gX a0) throws Throwable;
private static native long __fieldRead63_18(com.moon.gX a0) throws Throwable;
private static native com.moon.gY __fieldRead63_19(com.moon.gX a0) throws Throwable;
private static native long __call63_20(com.moon.gY a0) throws Throwable;
private static native int __numericCompare63_21(long a0, long a1) throws Throwable;
private static native void __call63_22() throws Throwable;
private static native com.moon.gY __fieldRead63_23(com.moon.gX a0) throws Throwable;
private static native long __call63_24(com.moon.gX a0) throws Throwable;
private static native void __call63_26(com.moon.gY a0, long a1) throws Throwable;
private static native long __fieldRead63_27(com.moon.gX a0) throws Throwable;
private static native long __invokedynamic63_28(int a0, long a1) throws Throwable;
private static native long __call63_29(com.moon.gX a0) throws Throwable;
private static native long __call63_30(long a0, long a1) throws Throwable;
private static native void __fieldWrite63_31(com.moon.gX a0, long a1) throws Throwable;
private static native java.lang.InterruptedException __call3006300_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.InterruptedException __call3006301_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.InterruptedException __call3006302_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.InterruptedException __call3006303_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.InterruptedException __call3006304_0(java.lang.InterruptedException a0) throws Throwable;
private static native void __call3006305_0(java.lang.InterruptedException a0) throws Throwable;
private static native long __fieldRead3006305_1(com.moon.gX a0) throws Throwable;
private static native long __invokedynamic3006305_2(int a0, long a1) throws Throwable;
private static native long __call3006305_3(com.moon.gX a0) throws Throwable;
private static native long __call3006305_4(long a0, long a1) throws Throwable;
private static native void __fieldWrite3006305_5(com.moon.gX a0, long a1) throws Throwable;

}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27819;
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
            throw new RuntimeException("com/moon/gX", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.gX.e;
}


public static void b(net.minecraft.entity.Entity[] p0) {
e = ((net.minecraft.entity.Entity[])(p0));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gX.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1260_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.gX.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral1261_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2109);
    if (((com.moon.gX.n)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.gX.m)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.gX.o)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.gX.o)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/gX", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.gX.n)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.gX.n)[life3_8])).longValue();
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill409_0 = p0;
        life4_9 += 1;
        life5_44 = (spill409_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill409_1 = p0;
        life4_9 += 1;
        life5_76 = (spill409_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill409_2 = p0;
        life4_9 += 1;
        life5_91 = (spill409_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private long a() {
long local1_life2 = (com.moon.gX.f ^ 54802768822423L);
    return ((java.lang.System.currentTimeMillis() * __sourceIntrinsic_d3e4e16d7952_originalDynamicSite28_5(3219, (5557996622132032817L ^ local1_life2))) / org.lwjgl.Sys.getTimerResolution());
}


private void a__Void() {
long life1_3;
    java.lang.String life3_39;
    java.lang.Thread life4_52;
    life1_3 = (com.moon.gX.f ^ 14496700696549L);
    this.b = ((boolean)(true));
    ((com.moon.gY)(this.c)).a(((long)(__sourceIntrinsic_b82a5b29b709_invokedynamic1111_3(3177, (4625736793827095226L ^ life1_3)))));
    ((com.moon.gY)(this.d)).a(((long)(((long) ((int) (((double) (-(((com.moon.gX)(this)).a() - ((com.moon.gX)(this)).a()))) * 0x1.553f7ced91687p0d))))));
    this.a = ((long)(((com.moon.gX)(this)).a()));
    life3_39 = java.lang.System.getProperty(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1111_11(15178, (5406659834329076663L ^ life1_3)))));
    if (((java.lang.String)(life3_39)).startsWith(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1111_13(12900, (6765761841053014683L ^ life1_3)))))) {
        life4_52 = new java.lang.Thread(__sourceIntrinsic_b82a5b29b709_invokedynamic1111_15());
        ((java.lang.Thread)(life4_52)).setName(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic1111_16(7038, (5124657994529485696L ^ life1_3)))));
        ((java.lang.Thread)(life4_52)).setDaemon(((boolean)(true)));
        ((java.lang.Thread)(life4_52)).start();
    }
    return;
}


public void a(int p0) { __sourceHandlerCall_025dc6b8938e114671d0(this, p0); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7696);
    if (((com.moon.gX.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.gX.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.gX.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/gX", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.gX.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.gX.h)[life5_8] = com.moon.gX.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.gX.h)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.gX.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1267_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.InterruptedException a(java.lang.InterruptedException p0) {
return p0;
}


private static void lambda$initialise$0() {
long local0 = (com.moon.gX.f ^ 104188957643892L);
    try {
        java.lang.Thread.sleep(((long)(__sourceIntrinsic_33b481d9922d_invokedynamic1268_1(7929, (8862288442046411705L ^ local0)))));
    } catch (java.lang.Exception caught2) {
        
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_868bc670b0113826_originalDynamicSite894_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_868bc670b0113826_originalDynamicSite894_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d3e4e16d7952_originalDynamicSite28_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1267_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b82a5b29b709_invokedynamic1111_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1111_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1111_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_b82a5b29b709_invokedynamic1111_15() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic1111_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1260_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral1261_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_33b481d9922d_invokedynamic1268_1(int a0, long a1) throws E;
}
