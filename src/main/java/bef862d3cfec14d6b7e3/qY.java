package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class qY {

private static org.apache.logging.log4j.Logger a;

private java.lang.String b;

private java.lang.Throwable c;

private moom.qZ d;

private java.util.List<moom.qZ> e;

private java.io.File f;

private boolean g;

private java.lang.StackTraceElement[] h;

private boolean i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

private static long[] n;

private static java.lang.Long[] o;

private static java.util.Map p;

public qY(java.lang.String p0, java.lang.Throwable p1) {
super();
    this.d = new moom.qZ(this, "System Details");
    this.e = com.google.common.collect.Lists.newArrayList();
    this.g = true;
    this.h = new java.lang.StackTraceElement[0];
    this.i = false;
    this.b = p0;
    this.c = p1;
    (this).a__Void();
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(5895528049759505468L)), ((long)(-1877077118928216272L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(264642578294461L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.qY.j ^ 119967028919994L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill976_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill976_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill976_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill976_14 = new byte[8];
    (__sourceSpill976_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill976_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation976_16 = __sourceSpill976_14;
    ((javax.crypto.Cipher)(__sourceSpill976_11)).init(((int)(__sourceSpill976_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill976_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation976_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[30];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "Ù?\000t»Ð\034È`»ê)ÀÄT5\025ùÚ9nA«¤\020jÍCø]1$^ª¾ð/\003\001Z\017U\021Ûi¥ÄÜIW7mI¡\036]Û&1F'ÇºüÅ~$Kí6Þ\nRQ¶}\017Ï¢À]\036\0363wþ4\020ÐØíQÆ\"¬®m9\001ñ_\036q\013\001f÷4\n\t#\006lÃ\000µÄ\033ØËvæ\026fùøü¡\006´R\0257X6nBÒÀÛ¾\006öRã«¬ü.£óÉû©yÖ1´ä@ãÌÁ|\036 çÙ.¸°`$ÿ\035Îá<[T9Ôð\013UeÚÄ\013}°oÈ¢µcÞmNü\027þ"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill976_25 = local17_life21;
        int __sourceSpill976_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill976_25)).substring(((int)(__sourceSpill976_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill976_30 = local19_life19;
        int __sourceSpill976_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill976_33 = new byte[8];
        (__sourceSpill976_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill976_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill976_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill976_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill976_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill976_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill976_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill976_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill976_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill976_34)).doFinal(((byte[])(__sourceSpill976_33)));
        (__sourceSpill976_30)[__sourceSpill976_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "ißR`^¯­>\0250hÅ\0332"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill976_38 = local17_life21;
        int __sourceSpill976_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill976_38)).substring(((int)(__sourceSpill976_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill976_43 = local19_life19;
        int __sourceSpill976_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill976_46 = new byte[8];
        (__sourceSpill976_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill976_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill976_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill976_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill976_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill976_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill976_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill976_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill976_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill976_47)).doFinal(((byte[])(__sourceSpill976_46)));
        (__sourceSpill976_43)[__sourceSpill976_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    k = ((long[])(local19_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[30]));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill976_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill976_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill976_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill976_59 = new byte[8];
    (__sourceSpill976_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill976_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation976_61 = __sourceSpill976_59;
    ((javax.crypto.Cipher)(__sourceSpill976_56)).init(((int)(__sourceSpill976_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill976_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation976_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "©¸åè\033\016G÷\"]íÌçÍ"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill976_70 = local4_life66;
        int __sourceSpill976_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill976_70)).substring(((int)(__sourceSpill976_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill976_75 = local6_life64;
        int __sourceSpill976_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill976_78 = new byte[8];
        (__sourceSpill976_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill976_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill976_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill976_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill976_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill976_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill976_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill976_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill976_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill976_79)).doFinal(((byte[])(__sourceSpill976_78)));
        (__sourceSpill976_75)[__sourceSpill976_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    n = ((long[])(local6_life64));
    o = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_5bc8d3b578d5b227eb81(moom.qY a0, java.io.File a1) throws E;
private static final class __SourceHandler_5bc8d3b578d5b227eb81 {

public static boolean f494(moom.qY receiver, java.io.File p0) throws Throwable {
    java.io.File forwardValue494_15_0;
    java.io.File forwardValue494_20_0;
    java.io.File spill494_0;
    long life2_3;
    java.lang.String[] life4_5;
    java.io.FileWriter life5_37;
    forward_join_22: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (__fieldRead494_0() ^ 55992768293852L);
    life4_5 = __call494_1();
    spill494_0 = __fieldRead494_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue494_15_0 = spill494_0;
        break forward_join_15;
    }
    if (!((spill494_0 != null))) {
        break forward_join_13;
    }
    return __integerCategory494_3(0);
    }
    forwardValue494_15_0 = __call494_4(p0);
    }
    if (!((life4_5 == null))) {
        forwardValue494_20_0 = forwardValue494_15_0;
        break forward_join_20;
    }
    if (!((forwardValue494_15_0 != null))) {
        break forward_join_22;
    }
    forwardValue494_20_0 = __call494_5(p0);
    }
    __call494_6(forwardValue494_20_0);
    }
    life5_37 = new java.io.FileWriter(p0);
    __call494_8(life5_37, __call494_7(receiver));
    __call494_9(life5_37);
    __fieldWrite494_10(receiver, p0);
    return __integerCategory494_11(1);
}
public static boolean h494_0(java.lang.Throwable p0) throws Throwable {
    throw __call2049400_0(p0);
}
public static boolean h494_1(java.lang.Throwable p0) throws Throwable {
    throw __call2049401_0(p0);
}
public static boolean h494_2(java.lang.Throwable p0) throws Throwable {
    throw __call2049402_0(p0);
}
public static boolean h494_3(java.lang.Throwable p0) throws Throwable {
    throw __call2049403_0(p0);
}
public static boolean h494_4(java.lang.Throwable p0, java.io.File p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2049404_2(__fieldRead2049404_0(), __invokedynamic2049404_1(p1), local2);
    return false;
}
private static native long __fieldRead494_0() throws Throwable;
private static native java.lang.String[] __call494_1() throws Throwable;
private static native java.io.File __fieldRead494_2(moom.qY a0) throws Throwable;
private static native boolean __integerCategory494_3(int value) throws Throwable;
private static native java.io.File __call494_4(java.io.File a0) throws Throwable;
private static native java.io.File __call494_5(java.io.File a0) throws Throwable;
private static native boolean __call494_6(java.io.File a0) throws Throwable;
private static native java.lang.String __call494_7(moom.qY a0) throws Throwable;
private static native void __call494_8(java.io.FileWriter a0, java.lang.String a1) throws Throwable;
private static native void __call494_9(java.io.FileWriter a0) throws Throwable;
private static native void __fieldWrite494_10(moom.qY a0, java.io.File a1) throws Throwable;
private static native boolean __integerCategory494_11(int value) throws Throwable;
private static native java.lang.Throwable __call2049400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2049401_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2049402_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2049403_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2049404_0() throws Throwable;
private static native java.lang.String __invokedynamic2049404_1(java.io.File a0) throws Throwable;
private static native void __call2049404_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;

}

private static native <E extends Throwable> moom.qZ __sourceHandlerCall_b39307458607a60ad218(moom.qY a0, java.lang.String a1, int a2) throws E;
private static final class __SourceHandler_b39307458607a60ad218 {

public static moom.qZ f185(moom.qY receiver, java.lang.String p0, int p1) throws Throwable {
    int forwardValue185_52_0;
    int forwardValue185_52_1;
    java.lang.StackTraceElement[] forwardValue185_69_0;
    int forwardValue185_92_0;
    java.lang.Object forwardValue185_101_0;
    java.lang.StackTraceElement[] forwardValue185_113_0;
    int forwardValue185_120_0;
    int forwardValue185_120_1;
    int forwardValue185_126_0;
    int forwardValue185_126_1;
    int forwardValue185_149_0;
    java.lang.String[] spill185_0;
    boolean spill185_1;
    int spill185_2;
    int spill185_3;
    java.lang.StackTraceElement[] spill185_4;
    int spill185_5;
    java.util.List spill185_6;
    java.lang.StackTraceElement[] spill185_7;
    int spill185_8;
    int spill185_9;
    long life3_3;
    moom.qZ life6_10;
    java.lang.String[] life5_11;
    int life7_23;
    java.lang.StackTraceElement[] life8_27;
    java.lang.StackTraceElement life9_29;
    java.lang.StackTraceElement life10_31;
    int life11_36;
    moom.qZ life12_135;
    forward_join_149: {
    forward_join_145: {
    forward_join_142: {
    forward_join_126: {
    forward_join_120: {
    forward_join_113: {
    forward_join_108: {
    forward_join_101: {
    forward_join_92: {
    forward_join_77: {
    forward_join_69: {
    forward_join_52: {
    forward_join_42: {
    life3_3 = (__fieldRead185_0() ^ 35226365647489L);
    spill185_0 = __call185_1();
    life6_10 = new moom.qZ(receiver, p0);
    life5_11 = spill185_0;
    spill185_1 = __fieldRead185_2(receiver);
    if (!((life5_11 == null))) {
        forwardValue185_149_0 = __integerCategory185_3(spill185_1);
        break forward_join_149;
    }
    if (!(spill185_1)) {
        break forward_join_145;
    }
    life7_23 = __call185_4(life6_10, p1);
    life8_27 = __call185_6(__fieldRead185_5(receiver));
    life9_29 = null;
    life10_31 = null;
    life11_36 = ((life8_27).length - life7_23);
    if (!((life11_36 < 0))) {
        break forward_join_42;
    }
    __call185_9(__fieldRead185_7(), __invokedynamic185_8((life8_27).length, life7_23));
    }
    if (!((life8_27 != null))) {
        break forward_join_77;
    }
    spill185_2 = 0;
    spill185_3 = life11_36;
    if (!((life5_11 == null))) {
        forwardValue185_52_0 = spill185_2;
        forwardValue185_52_1 = spill185_3;
        break forward_join_52;
    }
    if (!((spill185_2 <= spill185_3))) {
        break forward_join_77;
    }
    forwardValue185_52_0 = life11_36;
    forwardValue185_52_1 = (life8_27).length;
    }
    if (!((forwardValue185_52_0 < forwardValue185_52_1))) {
        break forward_join_77;
    }
    life9_29 = (life8_27)[life11_36];
    spill185_4 = life8_27;
    if (!((life5_11 == null))) {
        forwardValue185_69_0 = spill185_4;
        break forward_join_69;
    }
    if (!(((((spill185_4).length + 1) - life7_23) < (life8_27).length))) {
        break forward_join_77;
    }
    forwardValue185_69_0 = life8_27;
    }
    life10_31 = (forwardValue185_69_0)[(((life8_27).length + 1) - life7_23)];
    }
    __fieldWrite185_11(receiver, __call185_10(life6_10, life9_29, life10_31));
    spill185_5 = life7_23;
    if (!((life5_11 == null))) {
        forwardValue185_92_0 = spill185_5;
        break forward_join_92;
    }
    if (!((spill185_5 > 0))) {
        break forward_join_108;
    }
    spill185_6 = __fieldRead185_12(receiver);
    if (!((life5_11 == null))) {
        forwardValue185_101_0 = spill185_6;
        break forward_join_101;
    }
    forwardValue185_92_0 = __integerCategory185_14(__call185_13(spill185_6));
    }
    if (!((forwardValue185_92_0 == 0))) {
        break forward_join_108;
    }
    forwardValue185_101_0 = __call185_18(__fieldRead185_15(receiver), (__call185_17(__fieldRead185_16(receiver)) - 1));
    }
    life12_135 = __cast185_19(forwardValue185_101_0);
    __call185_20(life12_135, life7_23);
    if (!((life5_11 != null))) {
        break forward_join_145;
    }
    }
    spill185_7 = life8_27;
    if (!((life5_11 == null))) {
        forwardValue185_113_0 = spill185_7;
        break forward_join_113;
    }
    if (!((spill185_7 != null))) {
        break forward_join_142;
    }
    forwardValue185_113_0 = life8_27;
    }
    spill185_8 = (forwardValue185_113_0).length;
    spill185_9 = life7_23;
    if (!((life5_11 == null))) {
        forwardValue185_120_0 = spill185_8;
        forwardValue185_120_1 = spill185_9;
        break forward_join_120;
    }
    if (!((spill185_8 >= spill185_9))) {
        break forward_join_142;
    }
    forwardValue185_120_0 = 0;
    forwardValue185_120_1 = life11_36;
    }
    if (!((life5_11 == null))) {
        forwardValue185_126_0 = forwardValue185_120_0;
        forwardValue185_126_1 = forwardValue185_120_1;
        break forward_join_126;
    }
    if (!((forwardValue185_120_0 <= forwardValue185_120_1))) {
        break forward_join_142;
    }
    forwardValue185_126_0 = life11_36;
    forwardValue185_126_1 = (life8_27).length;
    }
    if (!((forwardValue185_126_0 < forwardValue185_126_1))) {
        break forward_join_142;
    }
    __fieldWrite185_21(receiver, new java.lang.StackTraceElement[life11_36]);
    __call185_24(life8_27, 0, __fieldRead185_22(receiver), 0, (__fieldRead185_23(receiver)).length);
    if (!((life5_11 != null))) {
        break forward_join_145;
    }
    }
    __fieldWrite185_25(receiver, 0);
    }
    forwardValue185_149_0 = __integerCategory185_28(__call185_27(__fieldRead185_26(receiver), life6_10));
    }
    __discardScalar185_29(forwardValue185_149_0);
    return life6_10;
}
public static void h185_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018500_0(p0);
}
public static void h185_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018501_0(p0);
}
public static void h185_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018502_0(p0);
}
public static void h185_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018503_0(p0);
}
public static void h185_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018504_0(p0);
}
public static void h185_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018505_0(p0);
}
public static void h185_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018506_0(p0);
}
public static void h185_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018507_0(p0);
}
public static void h185_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018508_0(p0);
}
public static void h185_9(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018509_0(p0);
}
public static void h185_10(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018510_0(p0);
}
public static void h185_11(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018511_0(p0);
}
public static void h185_12(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018512_0(p0);
}
public static void h185_13(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018513_0(p0);
}
public static void h185_14(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018514_0(p0);
}
public static void h185_15(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018515_0(p0);
}
public static void h185_16(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018516_0(p0);
}
public static void h185_17(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018517_0(p0);
}
public static void h185_18(java.lang.NullPointerException p0) throws Throwable {
    throw __call1018518_0(p0);
}
private static native long __fieldRead185_0() throws Throwable;
private static native java.lang.String[] __call185_1() throws Throwable;
private static native boolean __fieldRead185_2(moom.qY a0) throws Throwable;
private static native int __integerCategory185_3(boolean value) throws Throwable;
private static native int __call185_4(moom.qZ a0, int a1) throws Throwable;
private static native java.lang.Throwable __fieldRead185_5(moom.qY a0) throws Throwable;
private static native java.lang.StackTraceElement[] __call185_6(java.lang.Throwable a0) throws Throwable;
private static native java.io.PrintStream __fieldRead185_7() throws Throwable;
private static native java.lang.String __invokedynamic185_8(int a0, int a1) throws Throwable;
private static native void __call185_9(java.io.PrintStream a0, java.lang.String a1) throws Throwable;
private static native boolean __call185_10(moom.qZ a0, java.lang.StackTraceElement a1, java.lang.StackTraceElement a2) throws Throwable;
private static native void __fieldWrite185_11(moom.qY a0, boolean a1) throws Throwable;
private static native java.util.List __fieldRead185_12(moom.qY a0) throws Throwable;
private static native boolean __call185_13(java.util.List a0) throws Throwable;
private static native int __integerCategory185_14(boolean value) throws Throwable;
private static native java.util.List __fieldRead185_15(moom.qY a0) throws Throwable;
private static native java.util.List __fieldRead185_16(moom.qY a0) throws Throwable;
private static native int __call185_17(java.util.List a0) throws Throwable;
private static native java.lang.Object __call185_18(java.util.List a0, int a1) throws Throwable;
private static native moom.qZ __cast185_19(java.lang.Object a0) throws Throwable;
private static native void __call185_20(moom.qZ a0, int a1) throws Throwable;
private static native void __fieldWrite185_21(moom.qY a0, java.lang.StackTraceElement[] a1) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead185_22(moom.qY a0) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead185_23(moom.qY a0) throws Throwable;
private static native void __call185_24(java.lang.StackTraceElement[] a0, int a1, java.lang.StackTraceElement[] a2, int a3, int a4) throws Throwable;
private static native void __fieldWrite185_25(moom.qY a0, int a1) throws Throwable;
private static native java.util.List __fieldRead185_26(moom.qY a0) throws Throwable;
private static native boolean __call185_27(java.util.List a0, moom.qZ a1) throws Throwable;
private static native int __integerCategory185_28(boolean value) throws Throwable;
private static native void __discardScalar185_29(int a0) throws Throwable;
private static native java.lang.Throwable __call1018500_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018501_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018502_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018503_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018504_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018505_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018506_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018507_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018508_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018509_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018510_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018511_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018512_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018513_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018514_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018515_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018516_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018517_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1018518_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4db0b6abb9edf787bde1(moom.qY a0, java.lang.StringBuilder a1) throws E;
private static final class __SourceHandler_4db0b6abb9edf787bde1 {

public static void f1160(moom.qY receiver, java.lang.StringBuilder p0) throws Throwable {
    moom.qY lexicalValue1160_18_0;
    moom.qY lexicalValue1160_36_0;
    java.lang.StackTraceElement[] lexicalValue1160_39_0;
    moom.qY lexicalValue1160_92_0;
    moom.qY spill1160_0;
    java.lang.StackTraceElement[] spill1160_1;
    moom.qY spill1160_2;
    long life2_3;
    java.lang.String[] life4_5;
    java.lang.StackTraceElement[] life5_83;
    int life6_86;
    int life7_88;
    java.lang.StackTraceElement life8_95;
    java.util.Iterator life5_124;
    moom.qZ life6_131;
    lexical_join_117: {
    lexical_join_113: {
    lexical_join_92: {
    lexical_join_91: {
    lexical_join_87: {
    lexical_join_39: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_18: {
    lexical_join_17: {
    life2_3 = (__fieldRead1160_0() ^ 66227498057415L);
    life4_5 = __call1160_1();
    spill1160_0 = receiver;
    if (!((life4_5 == null))) {
        lexicalValue1160_18_0 = spill1160_0;
        break lexical_join_18;
    }
    if (!((__fieldRead1160_2(spill1160_0) != null))) {
        break lexical_join_17;
    }
    spill1160_1 = __fieldRead1160_3(receiver);
    if (!((life4_5 == null))) {
        lexicalValue1160_39_0 = spill1160_1;
        break lexical_join_39;
    }
    if (!(((spill1160_1).length == 0))) {
        break lexical_join_35;
    }
    }
    lexicalValue1160_18_0 = receiver;
    }
    if (!((life4_5 == null))) {
        lexicalValue1160_36_0 = lexicalValue1160_18_0;
        break lexical_join_36;
    }
    if (!((__call1160_5(__fieldRead1160_4(lexicalValue1160_18_0)) > 0))) {
        break lexical_join_35;
    }
    __fieldWrite1160_12(receiver, __cast1160_11(__call1160_10(__call1160_9(__cast1160_8(__call1160_7(__fieldRead1160_6(receiver), 0))), 0, 1)));
    }
    lexicalValue1160_36_0 = receiver;
    }
    if (!((life4_5 == null))) {
        lexicalValue1160_92_0 = lexicalValue1160_36_0;
        break lexical_join_92;
    }
    lexicalValue1160_39_0 = __fieldRead1160_13(lexicalValue1160_36_0);
    }
    if (!((lexicalValue1160_39_0 != null))) {
        break lexical_join_91;
    }
    spill1160_2 = receiver;
    if (!((life4_5 == null))) {
        lexicalValue1160_92_0 = spill1160_2;
        break lexical_join_92;
    }
    if (!(((__fieldRead1160_14(spill1160_2)).length > 0))) {
        break lexical_join_91;
    }
    __call1160_15(p0, "-- Head --\n");
    __call1160_16(p0, "Stacktrace:\n");
    life5_83 = __fieldRead1160_17(receiver);
    life6_86 = (life5_83).length;
    life7_88 = 0;
    lexical_cycle_62: while (true) {
    if (!((life7_88 < life6_86))) {
        break lexical_join_87;
    }
    life8_95 = (life5_83)[life7_88];
    __call1160_21(__call1160_19(__call1160_18(p0, "\t"), "at "), __call1160_20(life8_95));
    __call1160_22(p0, "\n");
    life7_88 += 1;
    if (!((life4_5 == null))) {
        break lexical_join_91;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    }
    __call1160_23(p0, "\n");
    }
    lexicalValue1160_92_0 = receiver;
    }
    life5_124 = __call1160_25(__fieldRead1160_24(lexicalValue1160_92_0));
    lexical_cycle_95: while (true) {
    if (!(__call1160_26(life5_124))) {
        break lexical_join_113;
    }
    life6_131 = __cast1160_28(__call1160_27(life5_124));
    __call1160_29(life6_131, p0);
    __call1160_30(p0, "\n\n");
    if (!((life4_5 == null))) {
        break lexical_join_117;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_95; }
    break lexical_cycle_95;
    }
    }
    __call1160_32(__fieldRead1160_31(receiver), p0);
    }
    return;
}
public static void h1160_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116000_0(p0);
}
public static void h1160_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116001_0(p0);
}
public static void h1160_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116002_0(p0);
}
public static void h1160_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116003_0(p0);
}
public static void h1160_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116004_0(p0);
}
public static void h1160_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116005_0(p0);
}
public static void h1160_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116006_0(p0);
}
public static void h1160_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116007_0(p0);
}
public static void h1160_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116008_0(p0);
}
public static void h1160_9(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116009_0(p0);
}
public static void h1160_10(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116010_0(p0);
}
private static native long __fieldRead1160_0() throws Throwable;
private static native java.lang.String[] __call1160_1() throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1160_2(moom.qY a0) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1160_3(moom.qY a0) throws Throwable;
private static native java.util.List __fieldRead1160_4(moom.qY a0) throws Throwable;
private static native int __call1160_5(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1160_6(moom.qY a0) throws Throwable;
private static native java.lang.Object __call1160_7(java.util.List a0, int a1) throws Throwable;
private static native moom.qZ __cast1160_8(java.lang.Object a0) throws Throwable;
private static native java.lang.StackTraceElement[] __call1160_9(moom.qZ a0) throws Throwable;
private static native java.lang.Object[] __call1160_10(java.lang.StackTraceElement[] a0, int a1, int a2) throws Throwable;
private static native java.lang.StackTraceElement[] __cast1160_11(java.lang.Object[] a0) throws Throwable;
private static native void __fieldWrite1160_12(moom.qY a0, java.lang.StackTraceElement[] a1) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1160_13(moom.qY a0) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1160_14(moom.qY a0) throws Throwable;
private static native java.lang.StringBuilder __call1160_15(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1160_16(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StackTraceElement[] __fieldRead1160_17(moom.qY a0) throws Throwable;
private static native java.lang.StringBuilder __call1160_18(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1160_19(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1160_20(java.lang.StackTraceElement a0) throws Throwable;
private static native java.lang.StringBuilder __call1160_21(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1160_22(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1160_23(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead1160_24(moom.qY a0) throws Throwable;
private static native java.util.Iterator __call1160_25(java.util.List a0) throws Throwable;
private static native boolean __call1160_26(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1160_27(java.util.Iterator a0) throws Throwable;
private static native moom.qZ __cast1160_28(java.lang.Object a0) throws Throwable;
private static native void __call1160_29(moom.qZ a0, java.lang.StringBuilder a1) throws Throwable;
private static native java.lang.StringBuilder __call1160_30(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __fieldRead1160_31(moom.qY a0) throws Throwable;
private static native void __call1160_32(moom.qZ a0, java.lang.StringBuilder a1) throws Throwable;
private static native java.lang.Throwable __call1116000_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116001_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116002_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116003_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116004_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116005_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116006_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116007_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116008_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116009_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116010_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> moom.qY __sourceHandlerCall_7b46981b6d01add3f732(java.lang.Throwable a0, java.lang.String a1) throws E;
private static final class __SourceHandler_7b46981b6d01add3f732 {

public static moom.qY f1161(java.lang.Throwable p0, java.lang.String p1) throws Throwable {
    java.lang.Throwable forwardValue1161_12_0;
    java.lang.Throwable spill1161_0;
    long life2_3;
    java.lang.String[] life4_5;
    moom.qY life5_20;
    forward_join_23: {
    forward_join_17: {
    forward_join_12: {
    life2_3 = (__fieldRead1161_0() ^ 98039035837870L);
    life4_5 = __call1161_1();
    spill1161_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1161_12_0 = spill1161_0;
        break forward_join_12;
    }
    if (!((__instanceOf1161_2(spill1161_0) != 0))) {
        break forward_join_17;
    }
    forwardValue1161_12_0 = p0;
    }
    life5_20 = __call1161_4(__cast1161_3(forwardValue1161_12_0));
    if (!((life4_5 != null))) {
        break forward_join_23;
    }
    }
    life5_20 = new moom.qY(p1, p0);
    }
    return life5_20;
}
public static void h1161_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116100_0(p0);
}
public static void h1161_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116101_0(p0);
}
private static native long __fieldRead1161_0() throws Throwable;
private static native java.lang.String[] __call1161_1() throws Throwable;
private static native int __instanceOf1161_2(java.lang.Throwable a0) throws Throwable;
private static native moom.Oo __cast1161_3(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call1161_4(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1116100_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116101_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_878a4d740270b1c6ac57(moom.qY a0) throws E;
private static final class __SourceHandler_878a4d740270b1c6ac57 {

public static java.lang.String f495(moom.qY receiver) throws Throwable {
    int forestValue495_33_0;
    int forestValue495_48_0;
    java.lang.Throwable forestValue495_56_0;
    java.lang.String forestValue495_62_0;
    java.lang.String forestValue495_88_0;
    java.lang.String[] spill495_0;
    java.lang.String spill495_1;
    int spill495_2;
    java.lang.Throwable spill495_3;
    java.lang.String spill495_4;
    long life1_3;
    java.lang.Object life4_5;
    java.lang.Object life5_7;
    java.lang.Throwable life6_11;
    java.lang.String[] life3_12;
    java.lang.String life7_69;
    java.io.StringWriter life4_73;
    java.io.PrintWriter life5_78;
    java.lang.String life7_84;
    forest_join_88: {
    forest_join_62: {
    forest_join_60: {
    forest_join_56: {
    forest_join_55: {
    forest_join_48: {
    forest_join_44: {
    forest_join_33: {
    forest_join_31: {
    life1_3 = (__fieldRead495_0() ^ 74023741882579L);
    life4_5 = null;
    life5_7 = null;
    spill495_0 = __call495_1();
    life6_11 = __fieldRead495_2(receiver);
    life3_12 = spill495_0;
    spill495_1 = __call495_3(life6_11);
    if (!((life3_12 == null))) {
        forestValue495_62_0 = spill495_1;
        break forest_join_62;
    }
    if (!((spill495_1 == null))) {
        break forest_join_60;
    }
    spill495_2 = __instanceOf495_4(life6_11);
    if (!((life3_12 == null))) {
        forestValue495_33_0 = spill495_2;
        break forest_join_33;
    }
    if (!((spill495_2 != 0))) {
        break forest_join_31;
    }
    life6_11 = new java.lang.NullPointerException(__fieldRead495_5(receiver));
    if (!((life3_12 != null))) {
        break forest_join_55;
    }
    }
    forestValue495_33_0 = __instanceOf495_6(life6_11);
    }
    if (!((life3_12 == null))) {
        forestValue495_48_0 = forestValue495_33_0;
        break forest_join_48;
    }
    if (!((forestValue495_33_0 != 0))) {
        break forest_join_44;
    }
    life6_11 = new java.lang.StackOverflowError(__fieldRead495_7(receiver));
    if (!((life3_12 != null))) {
        break forest_join_55;
    }
    }
    spill495_3 = life6_11;
    if (!((life3_12 == null))) {
        forestValue495_56_0 = spill495_3;
        break forest_join_56;
    }
    forestValue495_48_0 = __instanceOf495_8(spill495_3);
    }
    if (!((forestValue495_48_0 != 0))) {
        break forest_join_55;
    }
    life6_11 = new java.lang.OutOfMemoryError(__fieldRead495_9(receiver));
    }
    forestValue495_56_0 = life6_11;
    }
    __call495_12(forestValue495_56_0, __call495_11(__fieldRead495_10(receiver)));
    }
    forestValue495_62_0 = __call495_13(life6_11);
    }
    life7_69 = forestValue495_62_0;
    life4_73 = new java.io.StringWriter();
    life5_78 = new java.io.PrintWriter(life4_73);
    __call495_14(life6_11, life5_78);
    life7_84 = __call495_15(life4_73);
    __call495_16(life4_73);
    __call495_17(life5_78);
    spill495_4 = life7_84;
    if (!((__call495_18() != null))) {
        forestValue495_88_0 = spill495_4;
        break forest_join_88;
    }
    __call495_19(new java.lang.String[5]);
    forestValue495_88_0 = spill495_4;
    }
    return forestValue495_88_0;
}
public static java.lang.String h495_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049500_0(p0);
}
public static java.lang.String h495_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049501_0(p0);
}
public static java.lang.String h495_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049502_0(p0);
}
public static java.lang.String h495_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049503_0(p0);
}
public static java.lang.String h495_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049504_0(p0);
}
public static java.lang.String h495_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049505_0(p0);
}
public static java.lang.String h495_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049506_0(p0);
}
public static java.lang.String h495_7(java.lang.Throwable p0, java.io.StringWriter p1, java.io.PrintWriter p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call3049507_0(p1);
    __call3049507_1(p2);
    throw life3_2;
}
public static java.lang.String h495_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call3049508_0(p0);
}
private static native long __fieldRead495_0() throws Throwable;
private static native java.lang.String[] __call495_1() throws Throwable;
private static native java.lang.Throwable __fieldRead495_2(moom.qY a0) throws Throwable;
private static native java.lang.String __call495_3(java.lang.Throwable a0) throws Throwable;
private static native int __instanceOf495_4(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __fieldRead495_5(moom.qY a0) throws Throwable;
private static native int __instanceOf495_6(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __fieldRead495_7(moom.qY a0) throws Throwable;
private static native int __instanceOf495_8(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __fieldRead495_9(moom.qY a0) throws Throwable;
private static native java.lang.Throwable __fieldRead495_10(moom.qY a0) throws Throwable;
private static native java.lang.StackTraceElement[] __call495_11(java.lang.Throwable a0) throws Throwable;
private static native void __call495_12(java.lang.Throwable a0, java.lang.StackTraceElement[] a1) throws Throwable;
private static native java.lang.String __call495_13(java.lang.Throwable a0) throws Throwable;
private static native void __call495_14(java.lang.Throwable a0, java.io.PrintWriter a1) throws Throwable;
private static native java.lang.String __call495_15(java.io.StringWriter a0) throws Throwable;
private static native void __call495_16(java.io.StringWriter a0) throws Throwable;
private static native void __call495_17(java.io.PrintWriter a0) throws Throwable;
private static native java.lang.String[] __call495_18() throws Throwable;
private static native void __call495_19(java.lang.String[] a0) throws Throwable;
private static native java.lang.Throwable __call3049500_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call3049501_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call3049502_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call3049503_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call3049504_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call3049505_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call3049506_0(java.lang.NullPointerException a0) throws Throwable;
private static native void __call3049507_0(java.io.StringWriter a0) throws Throwable;
private static native void __call3049507_1(java.io.PrintWriter a0) throws Throwable;
private static native java.lang.Throwable __call3049508_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_677de90e0f717367bcc3(moom.qY a0) throws E;
private static final class __SourceHandler_677de90e0f717367bcc3 {

public static java.lang.String f1162(moom.qY receiver) throws Throwable {
    moom.qY forwardValue1162_15_0;
    java.lang.String forwardValue1162_102_0;
    moom.qY spill1162_0;
    java.lang.String spill1162_1;
    long life1_3;
    java.lang.String[] life3_5;
    java.lang.StringBuilder life4_27;
    forward_join_102: {
    forward_join_18: {
    forward_join_15: {
    life1_3 = (__fieldRead1162_0() ^ 93376390488896L);
    life3_5 = __call1162_1();
    spill1162_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue1162_15_0 = spill1162_0;
        break forward_join_15;
    }
    if (!((!__fieldRead1162_2(spill1162_0)))) {
        break forward_join_18;
    }
    __fieldWrite1162_3(receiver, 1);
    forwardValue1162_15_0 = receiver;
    }
    __call1162_5(forwardValue1162_15_0, __fieldRead1162_4(receiver));
    }
    life4_27 = new java.lang.StringBuilder();
    __call1162_6(life4_27, "---- Minecraft Crash Report ----\n");
    __call1162_7(life4_27, "// ");
    __call1162_9(life4_27, __call1162_8());
    __call1162_10(life4_27, "\n\n");
    __call1162_11(life4_27, "Time: ");
    __call1162_13(life4_27, __call1162_12(new java.text.SimpleDateFormat(), new java.util.Date()));
    __call1162_14(life4_27, "\n");
    __call1162_15(life4_27, "Description: ");
    __call1162_17(life4_27, __fieldRead1162_16(receiver));
    __call1162_18(life4_27, "\n\n");
    __call1162_20(life4_27, __call1162_19(receiver));
    __call1162_21(life4_27, "\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
    __call1162_24(life4_27, __call1162_23("-", __invokedynamic1162_22(1527, (3897138417563940152L ^ life1_3))));
    __call1162_25(life4_27, "\n\n");
    __call1162_26(receiver, life4_27);
    spill1162_1 = __call1162_27(life4_27);
    if (!((life3_5 != null))) {
        forwardValue1162_102_0 = spill1162_1;
        break forward_join_102;
    }
    __call1162_28(new java.lang.String[1]);
    forwardValue1162_102_0 = spill1162_1;
    }
    return forwardValue1162_102_0;
}
public static void h1162_0(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116200_0(p0);
}
public static void h1162_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116201_0(p0);
}
public static void h1162_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call1116202_0(p0);
}
private static native long __fieldRead1162_0() throws Throwable;
private static native java.lang.String[] __call1162_1() throws Throwable;
private static native boolean __fieldRead1162_2(moom.qY a0) throws Throwable;
private static native void __fieldWrite1162_3(moom.qY a0, int a1) throws Throwable;
private static native moom.qZ __fieldRead1162_4(moom.qY a0) throws Throwable;
private static native void __call1162_5(moom.qY a0, moom.qZ a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_6(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_7(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1162_8() throws Throwable;
private static native java.lang.StringBuilder __call1162_9(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_10(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_11(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1162_12(java.text.SimpleDateFormat a0, java.util.Date a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_13(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_14(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_15(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead1162_16(moom.qY a0) throws Throwable;
private static native java.lang.StringBuilder __call1162_17(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_18(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1162_19(moom.qY a0) throws Throwable;
private static native java.lang.StringBuilder __call1162_20(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_21(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1162_22(int a0, long a1) throws Throwable;
private static native java.lang.String __call1162_23(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_24(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1162_25(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __call1162_26(moom.qY a0, java.lang.StringBuilder a1) throws Throwable;
private static native java.lang.String __call1162_27(java.lang.StringBuilder a0) throws Throwable;
private static native void __call1162_28(java.lang.String[] a0) throws Throwable;
private static native java.lang.Throwable __call1116200_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116201_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Throwable __call1116202_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_40dbd753922baf7fbd87() throws E;
private static final class __SourceHandler_40dbd753922baf7fbd87 {

public static java.lang.String f462() throws Throwable {
    long life0_3;
    java.lang.String[] life2_258;
    life0_3 = (__fieldRead462_0() ^ 97250163925825L);
    java.lang.String[] __stackOp462_2_0 = new java.lang.String[__invokedynamic462_1(25679, (7231662587965150357L ^ life0_3))];
    java.lang.String[] spill462_0 = __stackOp462_2_0;
    (__stackOp462_2_0)[0] = "Who set us up the TNT?";
    java.lang.String[] __stackOp462_3_0 = spill462_0;
    java.lang.String[] spill462_1 = __stackOp462_3_0;
    (__stackOp462_3_0)[1] = "Everything's going to plan. No, really, that was supposed to happen.";
    java.lang.String[] __stackOp462_4_0 = spill462_1;
    java.lang.String[] spill462_2 = __stackOp462_4_0;
    (__stackOp462_4_0)[2] = "Uh... Did I do that?";
    java.lang.String[] __stackOp462_5_0 = spill462_2;
    java.lang.String[] spill462_3 = __stackOp462_5_0;
    (__stackOp462_5_0)[3] = "Oops.";
    java.lang.String[] __stackOp462_6_0 = spill462_3;
    java.lang.String[] spill462_4 = __stackOp462_6_0;
    (__stackOp462_6_0)[4] = "Why did you do that?";
    java.lang.String[] __stackOp462_7_0 = spill462_4;
    java.lang.String[] spill462_5 = __stackOp462_7_0;
    (__stackOp462_7_0)[5] = "I feel sad now :(";
    java.lang.String[] __stackOp462_8_0 = spill462_5;
    java.lang.String[] spill462_6 = __stackOp462_8_0;
    (__stackOp462_8_0)[__invokedynamic462_9(14006, (717463867551925859L ^ life0_3))] = "My bad.";
    java.lang.String[] __stackOp462_10_0 = spill462_6;
    java.lang.String[] spill462_7 = __stackOp462_10_0;
    (__stackOp462_10_0)[__invokedynamic462_11(4101, (8612008556428779736L ^ life0_3))] = "I'm sorry, Dave.";
    java.lang.String[] __stackOp462_12_0 = spill462_7;
    java.lang.String[] spill462_8 = __stackOp462_12_0;
    (__stackOp462_12_0)[__invokedynamic462_13(20716, (686693279424716844L ^ life0_3))] = "I let you down. Sorry :(";
    java.lang.String[] __stackOp462_14_0 = spill462_8;
    java.lang.String[] spill462_9 = __stackOp462_14_0;
    (__stackOp462_14_0)[__invokedynamic462_15(9061, (8976293645046830005L ^ life0_3))] = "On the bright side, I bought you a teddy bear!";
    java.lang.String[] __stackOp462_16_0 = spill462_9;
    java.lang.String[] spill462_10 = __stackOp462_16_0;
    (__stackOp462_16_0)[__invokedynamic462_17(18652, (7562789132900710405L ^ life0_3))] = "Daisy, daisy...";
    java.lang.String[] __stackOp462_18_0 = spill462_10;
    java.lang.String[] spill462_11 = __stackOp462_18_0;
    (__stackOp462_18_0)[__invokedynamic462_19(8538, (5147207783316148620L ^ life0_3))] = "Oh - I know what I did wrong!";
    java.lang.String[] __stackOp462_20_0 = spill462_11;
    java.lang.String[] spill462_12 = __stackOp462_20_0;
    (__stackOp462_20_0)[__invokedynamic462_21(8850, (7106018067630477909L ^ life0_3))] = "Hey, that tickles! Hehehe!";
    java.lang.String[] __stackOp462_22_0 = spill462_12;
    java.lang.String[] spill462_13 = __stackOp462_22_0;
    (__stackOp462_22_0)[__invokedynamic462_23(32253, (1715165572348448042L ^ life0_3))] = "I blame Dinnerbone.";
    java.lang.String[] __stackOp462_24_0 = spill462_13;
    java.lang.String[] spill462_14 = __stackOp462_24_0;
    (__stackOp462_24_0)[__invokedynamic462_25(6765, (3612780691179236022L ^ life0_3))] = "You should try our sister game, Minceraft!";
    java.lang.String[] __stackOp462_26_0 = spill462_14;
    java.lang.String[] spill462_15 = __stackOp462_26_0;
    (__stackOp462_26_0)[__invokedynamic462_27(29363, (1466297863091847778L ^ life0_3))] = "Don't be sad. I'll do better next time, I promise!";
    java.lang.String[] __stackOp462_28_0 = spill462_15;
    java.lang.String[] spill462_16 = __stackOp462_28_0;
    (__stackOp462_28_0)[__invokedynamic462_29(25840, (738852846017385526L ^ life0_3))] = "Don't be sad, have a hug! <3";
    java.lang.String[] __stackOp462_30_0 = spill462_16;
    java.lang.String[] spill462_17 = __stackOp462_30_0;
    (__stackOp462_30_0)[__invokedynamic462_31(28176, (1344166505528434397L ^ life0_3))] = "I just don't know what went wrong :(";
    java.lang.String[] __stackOp462_32_0 = spill462_17;
    java.lang.String[] spill462_18 = __stackOp462_32_0;
    (__stackOp462_32_0)[__invokedynamic462_33(26082, (501500972138370344L ^ life0_3))] = "Shall we play a game?";
    java.lang.String[] __stackOp462_34_0 = spill462_18;
    java.lang.String[] spill462_19 = __stackOp462_34_0;
    (__stackOp462_34_0)[__invokedynamic462_35(25524, (3242229655278523240L ^ life0_3))] = "Quite honestly, I wouldn't worry myself about that.";
    java.lang.String[] __stackOp462_36_0 = spill462_19;
    java.lang.String[] spill462_20 = __stackOp462_36_0;
    (__stackOp462_36_0)[__invokedynamic462_37(23258, (1361033424290064926L ^ life0_3))] = "I bet Cylons wouldn't have this problem.";
    java.lang.String[] __stackOp462_38_0 = spill462_20;
    java.lang.String[] spill462_21 = __stackOp462_38_0;
    (__stackOp462_38_0)[__invokedynamic462_39(4279, (2606232247472218213L ^ life0_3))] = "Sorry :(";
    java.lang.String[] __stackOp462_40_0 = spill462_21;
    java.lang.String[] spill462_22 = __stackOp462_40_0;
    (__stackOp462_40_0)[__invokedynamic462_41(4369, (4367994945495687645L ^ life0_3))] = "Surprise! Haha. Well, this is awkward.";
    java.lang.String[] __stackOp462_42_0 = spill462_22;
    java.lang.String[] spill462_23 = __stackOp462_42_0;
    (__stackOp462_42_0)[__invokedynamic462_43(6559, (3397046876885346654L ^ life0_3))] = "Would you like a cupcake?";
    java.lang.String[] __stackOp462_44_0 = spill462_23;
    java.lang.String[] spill462_24 = __stackOp462_44_0;
    (__stackOp462_44_0)[__invokedynamic462_45(24097, (4620870268917755626L ^ life0_3))] = "Hi. I'm Minecraft, and I'm a crashaholic.";
    java.lang.String[] __stackOp462_46_0 = spill462_24;
    java.lang.String[] spill462_25 = __stackOp462_46_0;
    (__stackOp462_46_0)[__invokedynamic462_47(30173, (528283722185835794L ^ life0_3))] = "Ooh. Shiny.";
    java.lang.String[] __stackOp462_48_0 = spill462_25;
    java.lang.String[] spill462_26 = __stackOp462_48_0;
    (__stackOp462_48_0)[__invokedynamic462_49(8859, (4460823079497585219L ^ life0_3))] = "This doesn't make any sense!";
    java.lang.String[] __stackOp462_50_0 = spill462_26;
    java.lang.String[] spill462_27 = __stackOp462_50_0;
    (__stackOp462_50_0)[__invokedynamic462_51(1952, (3125805188527585125L ^ life0_3))] = "Why is it breaking :(";
    java.lang.String[] __stackOp462_52_0 = spill462_27;
    java.lang.String[] spill462_28 = __stackOp462_52_0;
    (__stackOp462_52_0)[__invokedynamic462_53(1976, (6214910560769996667L ^ life0_3))] = "Don't do that.";
    java.lang.String[] __stackOp462_54_0 = spill462_28;
    java.lang.String[] spill462_29 = __stackOp462_54_0;
    (__stackOp462_54_0)[__invokedynamic462_55(28729, (5572148024326881520L ^ life0_3))] = "Ouch. That hurt :(";
    java.lang.String[] __stackOp462_56_0 = spill462_29;
    java.lang.String[] spill462_30 = __stackOp462_56_0;
    (__stackOp462_56_0)[__invokedynamic462_57(6588, (318343730359921007L ^ life0_3))] = "You're mean.";
    java.lang.String[] __stackOp462_58_0 = spill462_30;
    java.lang.String[] spill462_31 = __stackOp462_58_0;
    (__stackOp462_58_0)[__invokedynamic462_59(31472, (5872466805343455794L ^ life0_3))] = "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]";
    java.lang.String[] __stackOp462_60_0 = spill462_31;
    java.lang.String[] spill462_32 = __stackOp462_60_0;
    (__stackOp462_60_0)[__invokedynamic462_61(23398, (6662521187827166130L ^ life0_3))] = "There are four lights!";
    java.lang.String[] __stackOp462_62_0 = spill462_32;
    java.lang.String[] spill462_33 = __stackOp462_62_0;
    (__stackOp462_62_0)[__invokedynamic462_63(3938, (6592295610630733738L ^ life0_3))] = "But it works on my machine.";
    life2_258 = spill462_33;
    return (life2_258)[((int) (__call462_64() % ((long) (life2_258).length)))];
}
public static java.lang.String h462_0(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    return "Witty comment unavailable :(";
}
private static native long __fieldRead462_0() throws Throwable;
private static native int __invokedynamic462_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_61(int a0, long a1) throws Throwable;
private static native int __invokedynamic462_63(int a0, long a1) throws Throwable;
private static native long __call462_64() throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c79a01fd0ae5d23ccd1b() throws E;
private static final class __SourceHandler_c79a01fd0ae5d23ccd1b {

public static java.lang.String f1163() throws Throwable {
    int lexicalValue1163_37_0;
    java.lang.String lexicalValue1163_61_0;
    java.lang.String[] spill1163_0;
    java.lang.String spill1163_1;
    boolean spill1163_2;
    long life0_3;
    java.lang.management.RuntimeMXBean life3_5;
    java.util.List life4_8;
    int life5_11;
    java.lang.String[] life2_12;
    java.lang.StringBuilder life6_16;
    java.util.Iterator life7_19;
    java.lang.String life8_26;
    lexical_join_61: {
    lexical_join_48: {
    life0_3 = (__fieldRead1163_0() ^ 116247419217894L);
    life3_5 = __call1163_1();
    life4_8 = __call1163_2(life3_5);
    spill1163_0 = __call1163_3();
    life5_11 = 0;
    life2_12 = spill1163_0;
    life6_16 = new java.lang.StringBuilder();
    life7_19 = __call1163_4(life4_8);
    lexical_cycle_20: while (true) {
    lexical_join_46: {
    lexical_join_42: {
    lexical_join_37: {
    if (!(__call1163_5(life7_19))) {
        break lexical_join_48;
    }
    life8_26 = __cast1163_7(__call1163_6(life7_19));
    spill1163_1 = life8_26;
    if (!((life2_12 == null))) {
        lexicalValue1163_61_0 = spill1163_1;
        break lexical_join_61;
    }
    spill1163_2 = __call1163_8(spill1163_1, "-X");
    if (!((life2_12 == null))) {
        lexicalValue1163_37_0 = __integerCategory1163_9(spill1163_2);
        break lexical_join_37;
    }
    if (!(spill1163_2)) {
        break lexical_join_46;
    }
    lexicalValue1163_37_0 = (life5_11++);
    }
    if (!((lexicalValue1163_37_0 > 0))) {
        break lexical_join_42;
    }
    __call1163_10(life6_16, " ");
    }
    __call1163_11(life6_16, life8_26);
    }
    if (!((life2_12 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    lexicalValue1163_61_0 = __call1163_13("%d total; %s", new java.lang.Object[] {__call1163_12(life5_11), life6_16});
    }
    return lexicalValue1163_61_0;
}
public static void h1163_0(java.lang.Exception p0) throws Throwable {
    throw __call1116300_0(p0);
}
public static void h1163_1(java.lang.Exception p0) throws Throwable {
    throw __call1116301_0(p0);
}
public static void h1163_2(java.lang.Exception p0) throws Throwable {
    throw __call1116302_0(p0);
}
public static void h1163_3(java.lang.Exception p0) throws Throwable {
    throw __call1116303_0(p0);
}
private static native long __fieldRead1163_0() throws Throwable;
private static native java.lang.management.RuntimeMXBean __call1163_1() throws Throwable;
private static native java.util.List __call1163_2(java.lang.management.RuntimeMXBean a0) throws Throwable;
private static native java.lang.String[] __call1163_3() throws Throwable;
private static native java.util.Iterator __call1163_4(java.util.List a0) throws Throwable;
private static native boolean __call1163_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1163_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1163_7(java.lang.Object a0) throws Throwable;
private static native boolean __call1163_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1163_9(boolean value) throws Throwable;
private static native java.lang.StringBuilder __call1163_10(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call1163_11(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __call1163_12(int a0) throws Throwable;
private static native java.lang.String __call1163_13(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Throwable __call1116300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1116301_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1116302_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call1116303_0(java.lang.Exception a0) throws Throwable;

}


public java.lang.String b() { return __sourceHandlerCall_878a4d740270b1c6ac57(this); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8802_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.qY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20292);
    if (((moom.qY.o)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.qY.n)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.qY.p)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.qY.p)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/qY", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.qY.o)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.qY.o)[life3_8])).longValue();
}


public java.lang.String c() { return __sourceHandlerCall_677de90e0f717367bcc3(this); }


private static java.lang.String d() { return __sourceHandlerCall_40dbd753922baf7fbd87(); }


public java.lang.String a__String() {
return this.b;
}


private void a__Void() {
((moom.qZ)(this.d)).a(((java.lang.String)("Minecraft Version")), ((java.util.concurrent.Callable)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_1())));
    ((moom.qZ)(this.d)).a(((java.lang.String)("Operating System")), ((java.util.concurrent.Callable)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_4())));
    ((moom.qZ)(this.d)).a(((java.lang.String)("Java Version")), ((java.util.concurrent.Callable)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_7())));
    ((moom.qZ)(this.d)).a(((java.lang.String)("Java VM Version")), ((java.util.concurrent.Callable)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_10())));
    ((moom.qZ)(this.d)).a(((java.lang.String)("Memory")), ((java.util.concurrent.Callable)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_13())));
    ((moom.qZ)(this.d)).a(((java.lang.String)("JVM Flags")), ((java.util.concurrent.Callable)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_16())));
    ((moom.qZ)(this.d)).a(((java.lang.String)("IntCache")), ((java.util.concurrent.Callable)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_19())));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8806_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.qY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n7 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5D08;
        if (l[n7] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = k[n7];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/qY", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qY.l[n7] = n8;
        }
        return l[n7];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public java.lang.Throwable a__Throwable() {
return this.c;
}


public moom.qZ a(java.lang.String p0) {
return ((moom.qY)(this)).a(((java.lang.String)(p0)), ((int)(1)));
}


public moom.qZ a__qZ() {
return this.d;
}


public boolean a(java.io.File p0) { return __sourceHandlerCall_5bc8d3b578d5b227eb81(this, p0); }


public java.io.File a() {
return this.f;
}


public void a(java.lang.StringBuilder p0) { __sourceHandlerCall_4db0b6abb9edf787bde1(this, p0); }


public moom.qZ a(java.lang.String p0, int p1) { return __sourceHandlerCall_b39307458607a60ad218(this, p0, p1); }


public static moom.qY a(java.lang.Throwable p0, java.lang.String p1) { return __sourceHandlerCall_7b46981b6d01add3f732(p0, p1); }


private static java.lang.String lambda$populateEnvironment$0() throws java.lang.Exception {
return "1.8.9";
}


private static java.lang.String lambda$populateEnvironment$4() throws java.lang.Exception {
long local0 = (moom.qY.j ^ 41659339557696L);
    java.lang.Runtime local2 = java.lang.Runtime.getRuntime();
    long local3 = ((java.lang.Runtime)(local2)).maxMemory();
    long local5 = ((java.lang.Runtime)(local2)).totalMemory();
    long local7 = ((java.lang.Runtime)(local2)).freeMemory();
    long local9 = ((local3 / __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_5(11088, (7470527625011929565L ^ local0))) / __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_6(7082, (2565074356263457062L ^ local0)));
    long local11 = ((local5 / __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_7(7082, (2565074356263457062L ^ local0))) / __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_8(7082, (2565074356263457062L ^ local0)));
    long local13 = ((local7 / __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_9(7082, (2565074356263457062L ^ local0))) / __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_10(7082, (2565074356263457062L ^ local0)));
    return __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_11(local7, local13, local5, local11, local3, local9);
}


private static java.lang.String lambda$populateEnvironment$3() throws java.lang.Exception {
return __sourceIntrinsic_90c3da186d59_originalDynamicSite1589_3(java.lang.System.getProperty(((java.lang.String)("java.vm.name"))), java.lang.System.getProperty(((java.lang.String)("java.vm.info"))), java.lang.System.getProperty(((java.lang.String)("java.vm.vendor"))));
}


private static java.lang.String lambda$populateEnvironment$5() throws java.lang.Exception { return __sourceHandlerCall_c79a01fd0ae5d23ccd1b(); }


private static java.lang.String lambda$populateEnvironment$2() throws java.lang.Exception {
return __sourceIntrinsic_8ab05d10fe49_originalDynamicSite1590_2(java.lang.System.getProperty(((java.lang.String)("java.version"))), java.lang.System.getProperty(((java.lang.String)("java.vendor"))));
}


private static java.lang.String lambda$populateEnvironment$1() throws java.lang.Exception {
return __sourceIntrinsic_6d012b617887_originalDynamicSite1591_3(java.lang.System.getProperty(((java.lang.String)("os.name"))), java.lang.System.getProperty(((java.lang.String)("os.arch"))), java.lang.System.getProperty(((java.lang.String)("os.version"))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8806_0() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_1() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_4() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_7() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_10() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_13() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_16() throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_b82a5b29b709_originalDynamicSite1587_19() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8802_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6d012b617887_originalDynamicSite1591_3(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ab05d10fe49_originalDynamicSite1590_2(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_90c3da186d59_originalDynamicSite1589_3(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_8(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_07f4658c4ab1_originalDynamicSite1588_11(long a0, long a1, long a2, long a3, long a4, long a5) throws E;
}
