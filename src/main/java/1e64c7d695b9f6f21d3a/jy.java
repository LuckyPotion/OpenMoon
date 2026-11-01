package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jy {

private static org.tinylog.TaggedLogger a;

private static com.google.gson.Gson b;

private com.moon.jz c;

private moom.DD d;

private com.moon.ju e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public jy() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-608272282095797975L)), ((long)(4014678117513086361L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47519291755255L)))));
    long local20_life6 = (com.moon.jy.f ^ 122949450672778L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill202_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill202_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill202_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill202_14 = new byte[8];
    (__sourceSpill202_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill202_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation202_16 = __sourceSpill202_14;
    ((javax.crypto.Cipher)(__sourceSpill202_11)).init(((int)(__sourceSpill202_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill202_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation202_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[8];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = " Ùf¼|Îý5\005Y¥3ruê2\t\"e9ÿ\030^ft*8\n%|&}Võ¦&æÔ\177éê(°gß\002fþÊ¾æNµ¤\020\001ñKá·F 5üýk^ê\nú\023µýBhv\1778ÔIR\034U3Ý?wåJ³9Ã®m4©AQ\006@Æ{5bëºqgú½îTP]\n°&n\000ÕÇ\017\004\016Lø0rz,;Ò ²ÝX\006h'\177×Rï\017:\023»ïbÐ\177å¥­/Aas\002\0228ÿÅ»ÑO\f\nÜ°\005\020øºüßß´?ð\006\006º¾××\020ûúZuR¹ÊÈ1pè`â"))).length();
    int local14_life24 = 48;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill202_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill202_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill202_29)).doFinal(((byte[])(__sourceSpill202_28)));
        java.lang.String __sourceSpill202_34 = ((java.lang.String)(com.moon.jy.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill202_35 = local18_life19;
        int __sourceSpill202_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill202_35)[__sourceSpill202_36] = __sourceSpill202_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = " ~\035¿XÌT§×À\0358\\Ïä)\007\037Ù9)UPTÑiæõÍ;vV\026´ñ\"Q5Çêr\020o\031ùÉl\006ðÕ\026¸/_I«¼ð[ü"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill202_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill202_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill202_42)).doFinal(((byte[])(__sourceSpill202_41)));
        java.lang.String __sourceSpill202_47 = ((java.lang.String)(com.moon.jy.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill202_48 = local18_life19;
        int __sourceSpill202_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill202_48)[__sourceSpill202_49] = __sourceSpill202_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    g = ((java.lang.String[])(local18_life19));
    h = ((java.lang.String[])(new java.lang.String[8]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill202_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill202_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill202_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill202_60 = new byte[8];
    (__sourceSpill202_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill202_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation202_62 = __sourceSpill202_60;
    ((javax.crypto.Cipher)(__sourceSpill202_57)).init(((int)(__sourceSpill202_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill202_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation202_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[4];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\021ðu\0255!\177\016ú\001x§["))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill202_71 = local4_life67;
        int __sourceSpill202_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill202_71)).substring(((int)(__sourceSpill202_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill202_76 = local6_life65;
        int __sourceSpill202_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill202_79 = new byte[8];
        (__sourceSpill202_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill202_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill202_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill202_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill202_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill202_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill202_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill202_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill202_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill202_80)).doFinal(((byte[])(__sourceSpill202_79)));
        (__sourceSpill202_76)[__sourceSpill202_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ØåjÌ\nèZ\023\003Ñ}ÚB"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill202_84 = local4_life67;
        int __sourceSpill202_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill202_84)).substring(((int)(__sourceSpill202_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill202_89 = local6_life65;
        int __sourceSpill202_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill202_92 = new byte[8];
        (__sourceSpill202_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill202_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill202_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill202_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill202_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill202_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill202_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill202_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill202_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill202_93)).doFinal(((byte[])(__sourceSpill202_92)));
        (__sourceSpill202_89)[__sourceSpill202_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    j = ((long[])(local6_life65));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite202_98(25267, (9056435101734589400L ^ local20_life6)))))));
    b = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));
}

private static native <E extends Throwable> void __sourceHandlerCall_be2051ace1d490f1f49c(com.moon.jy a0, java.lang.String a1) throws E;
private static final class __SourceHandler_be2051ace1d490f1f49c {

public static void f102(com.moon.jy receiver, java.lang.String p0) throws Throwable {
    int spill102_0;
    java.lang.Class spill102_1;
    java.lang.String spill102_2;
    java.lang.Object[] spill102_3;
    org.tinylog.TaggedLogger spill102_4;
    int spill102_5;
    org.tinylog.TaggedLogger spill102_6;
    long life2_3;
    java.io.InputStream life5_26;
    int life4_27;
    forest_join_134: {
    forest_join_119: {
    forest_join_101: {
    forest_join_48: {
    life2_3 = (__fieldRead102_0() ^ 35129274752744L);
    spill102_0 = __call102_1();
    spill102_1 = __call102_2(receiver);
    spill102_2 = __invokedynamic102_3(23738, (7160849394069215664L ^ life2_3));
    java.lang.Object[] __stackOp102_4_0 = new java.lang.Object[1];
    spill102_3 = __stackOp102_4_0;
    (__stackOp102_4_0)[0] = __invokedynamic102_6(p0, __invokedynamic102_5(3075, (2349940550843222285L ^ life2_3)));
    life5_26 = __call102_8(spill102_1, __call102_7(spill102_2, spill102_3));
    life4_27 = spill102_0;
    if (!((life4_27 == 0))) {
        break forest_join_101;
    }
    if (!((life5_26 == null))) {
        break forest_join_48;
    }
    spill102_4 = __fieldRead102_9();
    java.lang.String __stackOp102_11_0 = p0;
    java.lang.String __stackOp102_11_1 = __invokedynamic102_10(3014, (3516839603273125578L ^ life2_3));
    __call102_14(spill102_4, __invokedynamic102_13(__stackOp102_11_1, __stackOp102_11_0, __invokedynamic102_12(4111, (1410262320019526914L ^ life2_3))));
    return;
    }
    __fieldWrite102_17(receiver, new moom.DD(__invokedynamic102_16(p0, __invokedynamic102_15(13661, (4323139977728749650L ^ life2_3)))));
    spill102_5 = 10650;
    __call102_21(__call102_19(__call102_18()), __fieldRead102_20(receiver));
    __call102_24(__invokedynamic102_22(spill102_5, (4827782140898369752L ^ life2_3)), __invokedynamic102_23(2266, (5698887907037331867L ^ life2_3)), 0x1.3008p13f);
    __call102_27(__invokedynamic102_25(3713, (1739337747230148545L ^ life2_3)), __invokedynamic102_26(2743, (7243292696062641140L ^ life2_3)), 0x1.3008p13f);
    __call102_28(0);
    __fieldWrite102_33(receiver, __cast102_32(__call102_31(__fieldRead102_29(), new java.io.InputStreamReader(life5_26), __classLiteral102_30())));
    }
    if (!((__fieldRead102_34(receiver) == null))) {
        break forest_join_119;
    }
    spill102_6 = __fieldRead102_35();
    java.lang.String __stackOp102_37_0 = p0;
    java.lang.String __stackOp102_37_1 = __invokedynamic102_36(7131, (6942252856972304083L ^ life2_3));
    __call102_40(spill102_6, __invokedynamic102_39(__stackOp102_37_1, __stackOp102_37_0, __invokedynamic102_38(4111, (1410262320019526914L ^ life2_3))));
    }
    __fieldWrite102_41(receiver, new com.moon.jz(receiver, p0));
    __call102_43(__fieldRead102_42(receiver));
    if (!((__call102_44() != null))) {
        break forest_join_134;
    }
    life4_27 += 1;
    __call102_45(life4_27);
    }
    return;
}
public static void h102_0(java.lang.Exception p0) throws Throwable {
    throw __call3010200_0(p0);
}
public static void h102_1(java.lang.Exception p0) throws Throwable {
    throw __call3010201_0(p0);
}
public static void h102_2(java.lang.Exception p0) throws Throwable {
    throw __call3010202_0(p0);
}
public static void h102_3(java.lang.Exception p0, com.moon.jy p1, java.lang.String p2, long p3, int p4) throws Throwable {
    org.tinylog.TaggedLogger spill3010203_0;
    java.lang.String spill3010203_1;
    java.lang.Object[] spill3010203_2;
    java.lang.Exception life6_2;
    forest_join_38: {
    life6_2 = p0;
    spill3010203_0 = __fieldRead3010203_0();
    java.lang.String __stackOp3010203_2_0 = p2;
    java.lang.String __stackOp3010203_2_1 = __invokedynamic3010203_1(12277, (2799575214747282174L ^ p3));
    spill3010203_1 = __invokedynamic3010203_4(__stackOp3010203_2_1, __stackOp3010203_2_0, __invokedynamic3010203_3(4111, (1410262320019526914L ^ p3)));
    java.lang.Object[] __stackOp3010203_5_0 = new java.lang.Object[1];
    spill3010203_2 = __stackOp3010203_5_0;
    (__stackOp3010203_5_0)[0] = life6_2;
    __call3010203_6(spill3010203_0, spill3010203_1, spill3010203_2);
    __fieldWrite3010203_7(p1, new com.moon.jz(p1, p2));
    __call3010203_9(__fieldRead3010203_8(p1));
    if (!((__call3010203_10() != null))) {
        break forest_join_38;
    }
    p4 += 1;
    __call3010203_11(p4);
    }
    return;
}
public static void h102_4(java.lang.Exception p0) throws Throwable {
    throw __call3010204_0(p0);
}
private static native long __fieldRead102_0() throws Throwable;
private static native int __call102_1() throws Throwable;
private static native java.lang.Class __call102_2(com.moon.jy a0) throws Throwable;
private static native java.lang.String __invokedynamic102_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic102_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic102_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call102_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.io.InputStream __call102_8(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead102_9() throws Throwable;
private static native java.lang.String __invokedynamic102_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic102_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic102_13(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call102_14(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic102_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic102_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite102_17(com.moon.jy a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call102_18() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call102_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead102_20(com.moon.jy a0) throws Throwable;
private static native void __call102_21(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic102_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic102_23(int a0, long a1) throws Throwable;
private static native void __call102_24(int a0, int a1, float a2) throws Throwable;
private static native int __invokedynamic102_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic102_26(int a0, long a1) throws Throwable;
private static native void __call102_27(int a0, int a1, float a2) throws Throwable;
private static native void __call102_28(int a0) throws Throwable;
private static native com.google.gson.Gson __fieldRead102_29() throws Throwable;
private static native java.lang.Class __classLiteral102_30() throws Throwable;
private static native java.lang.Object __call102_31(com.google.gson.Gson a0, java.io.InputStreamReader a1, java.lang.Class a2) throws Throwable;
private static native com.moon.ju __cast102_32(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite102_33(com.moon.jy a0, com.moon.ju a1) throws Throwable;
private static native com.moon.ju __fieldRead102_34(com.moon.jy a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead102_35() throws Throwable;
private static native java.lang.String __invokedynamic102_36(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic102_38(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic102_39(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call102_40(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite102_41(com.moon.jy a0, com.moon.jz a1) throws Throwable;
private static native com.moon.jz __fieldRead102_42(com.moon.jy a0) throws Throwable;
private static native void __call102_43(com.moon.jz a0) throws Throwable;
private static native java.lang.String[] __call102_44() throws Throwable;
private static native void __call102_45(int a0) throws Throwable;
private static native java.lang.Exception __call3010200_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3010201_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3010202_0(java.lang.Exception a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead3010203_0() throws Throwable;
private static native java.lang.String __invokedynamic3010203_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3010203_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3010203_4(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3010203_6(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __fieldWrite3010203_7(com.moon.jy a0, com.moon.jz a1) throws Throwable;
private static native com.moon.jz __fieldRead3010203_8(com.moon.jy a0) throws Throwable;
private static native void __call3010203_9(com.moon.jz a0) throws Throwable;
private static native java.lang.String[] __call3010203_10() throws Throwable;
private static native void __call3010203_11(int a0) throws Throwable;
private static native java.lang.Exception __call3010204_0(java.lang.Exception a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jy.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1990_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11797;
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
            throw new RuntimeException("com/moon/jy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1991_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.jz a__jz() {
return this.c;
}


public void a(java.lang.String p0) { __sourceHandlerCall_be2051ace1d490f1f49c(this, p0); }


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
        byte[] spill831_0 = p0;
        life4_9 += 1;
        life5_44 = (spill831_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill831_1 = p0;
        life4_9 += 1;
        life5_76 = (spill831_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill831_2 = p0;
        life4_9 += 1;
        life5_91 = (spill831_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.ju a() {
return this.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public moom.DD a__DD() {
return this.d;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8797);
    if (((com.moon.jy.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jy.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jy.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jy", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jy.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jy.h)[life5_8] = com.moon.jy.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jy.h)[life5_8];
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite202_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1991_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1990_0() throws E;
}
