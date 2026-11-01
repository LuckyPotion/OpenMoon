package net.minecraft.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HttpUtil {

public static com.google.common.util.concurrent.ListeningExecutorService a;

private static java.util.concurrent.atomic.AtomicInteger b;

private static org.apache.logging.log4j.Logger c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

public HttpUtil() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-8279220259808135956L)), ((long)(-3382305173013272624L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(170850929182105L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.util.HttpUtil.d ^ 5791576347017L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1935_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1935_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1935_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1935_14 = new byte[8];
    (__sourceSpill1935_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1935_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1935_16 = __sourceSpill1935_14;
    ((javax.crypto.Cipher)(__sourceSpill1935_11)).init(((int)(__sourceSpill1935_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1935_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1935_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ø\020¦}\013ªH%FBOS3·JÔ²Å"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1935_25 = local6_life21;
        int __sourceSpill1935_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1935_25)).substring(((int)(__sourceSpill1935_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1935_30 = local8_life19;
        int __sourceSpill1935_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1935_33 = new byte[8];
        (__sourceSpill1935_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1935_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1935_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1935_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1935_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1935_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1935_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1935_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1935_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1935_34)).doFinal(((byte[])(__sourceSpill1935_33)));
        (__sourceSpill1935_30)[__sourceSpill1935_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "?Hà(ÏýfùÀ5Y¬Ö\n"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1935_38 = local6_life21;
        int __sourceSpill1935_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1935_38)).substring(((int)(__sourceSpill1935_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1935_43 = local8_life19;
        int __sourceSpill1935_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1935_46 = new byte[8];
        (__sourceSpill1935_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1935_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1935_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1935_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1935_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1935_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1935_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1935_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1935_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1935_47)).doFinal(((byte[])(__sourceSpill1935_46)));
        (__sourceSpill1935_43)[__sourceSpill1935_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[5]));
    a = ((com.google.common.util.concurrent.ListeningExecutorService)(com.google.common.util.concurrent.MoreExecutors.listeningDecorator(((java.util.concurrent.ExecutorService)(java.util.concurrent.Executors.newCachedThreadPool(((java.util.concurrent.ThreadFactory)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setDaemon(((boolean)(true))))).setNameFormat(((java.lang.String)("Downloader %d"))))).build()))))))));
    b = ((java.util.concurrent.atomic.AtomicInteger)(new java.util.concurrent.atomic.AtomicInteger(0)));
    c = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> int __sourceHandlerCall_a15cf9f17398d69b833e() throws E;
private static final class __SourceHandler_a15cf9f17398d69b833e {

public static int f712() throws Throwable {
    java.net.ServerSocket forestValue712_23_0;
    boolean spill712_0;
    java.net.ServerSocket spill712_1;
    long life0_3;
    java.lang.Object life3_5;
    int life4_8;
    int life2_9;
    java.net.ServerSocket life3_14;
    int life4_17;
    forest_join_24: {
    forest_join_23: {
    life0_3 = (__fieldRead712_0() ^ 140355946784811L);
    life3_5 = null;
    spill712_0 = __call712_1();
    life4_8 = -1;
    life2_9 = __integerCategory712_2(spill712_0);
    life3_14 = new java.net.ServerSocket(0);
    life4_17 = __call712_3(life3_14);
    spill712_1 = life3_14;
    if (!((life2_9 == 0))) {
        forestValue712_23_0 = spill712_1;
        break forest_join_23;
    }
    if (!((spill712_1 != null))) {
        break forest_join_24;
    }
    forestValue712_23_0 = life3_14;
    }
    __call712_4(forestValue712_23_0);
    }
    return life4_17;
}
public static int h712_0(java.io.IOException p0) throws Throwable {
    throw __call3071200_0(p0);
}
public static int h712_1(java.io.IOException p0, int p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    return p1;
}
public static int h712_2(java.lang.Throwable p0, int p1, java.net.ServerSocket p2) throws Throwable {
    java.net.ServerSocket forestValue3071202_7_0;
    java.net.ServerSocket spill3071202_0;
    java.lang.Throwable life3_2;
    forest_join_8: {
    forest_join_7: {
    life3_2 = p0;
    spill3071202_0 = p2;
    if (!((p1 == 0))) {
        forestValue3071202_7_0 = spill3071202_0;
        break forest_join_7;
    }
    if (!((spill3071202_0 != null))) {
        break forest_join_8;
    }
    forestValue3071202_7_0 = p2;
    }
    __call3071202_0(forestValue3071202_7_0);
    }
    throw life3_2;
}
public static int h712_3(java.io.IOException p0) throws Throwable {
    throw __call3071203_0(p0);
}
public static int h712_4(java.io.IOException p0, java.lang.Throwable p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    throw p1;
}
private static native long __fieldRead712_0() throws Throwable;
private static native boolean __call712_1() throws Throwable;
private static native int __integerCategory712_2(boolean value) throws Throwable;
private static native int __call712_3(java.net.ServerSocket a0) throws Throwable;
private static native void __call712_4(java.net.ServerSocket a0) throws Throwable;
private static native java.lang.Throwable __call3071200_0(java.io.IOException a0) throws Throwable;
private static native void __call3071202_0(java.net.ServerSocket a0) throws Throwable;
private static native java.lang.Throwable __call3071203_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_dfb368ccdc50464f6a35(java.net.URL a0) throws E;
private static final class __SourceHandler_dfb368ccdc50464f6a35 {

public static java.lang.String f274(java.net.URL p0) throws Throwable {
    boolean spill274_0;
    long life1_3;
    java.net.HttpURLConnection life4_8;
    int life3_9;
    java.io.BufferedReader life5_21;
    java.lang.StringBuilder life6_25;
    java.lang.String life7_29;
    lexical_join_49: {
    lexical_join_47: {
    life1_3 = (__fieldRead274_0() ^ 92193486383697L);
    spill274_0 = __call274_1();
    life4_8 = __cast274_3(__call274_2(p0));
    life3_9 = __integerCategory274_4(spill274_0);
    __call274_5(life4_8, "GET");
    life5_21 = new java.io.BufferedReader(new java.io.InputStreamReader(__call274_6(life4_8)));
    life6_25 = new java.lang.StringBuilder();
    lexical_cycle_26: while (true) {
    if (!(((life7_29 = __call274_7(life5_21)) != null))) {
        break lexical_join_47;
    }
    __call274_8(life6_25, life7_29);
    __call274_10(life6_25, __invokedynamic274_9(24486, (6951428265766655865L ^ life1_3)));
    if (!((life3_9 == 0))) {
        break lexical_join_49;
    }
    if (!((life3_9 != 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    __call274_11(life5_21);
    }
    return __call274_12(life6_25);
}
public static void h274_0(java.io.IOException p0) throws Throwable {
    throw __call1027400_0(p0);
}
private static native long __fieldRead274_0() throws Throwable;
private static native boolean __call274_1() throws Throwable;
private static native java.net.URLConnection __call274_2(java.net.URL a0) throws Throwable;
private static native java.net.HttpURLConnection __cast274_3(java.net.URLConnection a0) throws Throwable;
private static native int __integerCategory274_4(boolean value) throws Throwable;
private static native void __call274_5(java.net.HttpURLConnection a0, java.lang.String a1) throws Throwable;
private static native java.io.InputStream __call274_6(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.String __call274_7(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.StringBuilder __call274_8(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic274_9(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call274_10(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native void __call274_11(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call274_12(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1027400_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b32684998457a343dfaa(java.net.URL a0, java.lang.String a1, boolean a2) throws E;
private static final class __SourceHandler_b32684998457a343dfaa {

public static java.lang.String f1141(java.net.URL p0, java.lang.String p1, boolean p2) throws Throwable {
    moom.Bl forestValue1141_13_0;
    java.net.Proxy forestValue1141_14_0;
    java.net.Proxy forestValue1141_20_0;
    moom.Bl spill1141_0;
    java.net.Proxy spill1141_1;
    long life3_3;
    int life5_5;
    java.net.Proxy life6_15;
    java.net.HttpURLConnection life7_27;
    java.io.DataOutputStream life8_60;
    java.io.BufferedReader life9_76;
    java.lang.StringBuilder life10_80;
    java.lang.String life11_84;
    forest_join_102: {
    forest_join_100: {
    forest_join_21: {
    forest_join_20: {
    forest_join_14: {
    forest_join_13: {
    forest_join_12: {
    life3_3 = (__fieldRead1141_0() ^ 21620494204551L);
    life5_5 = __integerCategory1141_2(__call1141_1());
    spill1141_0 = __call1141_3();
    if (!((life5_5 == 0))) {
        forestValue1141_13_0 = spill1141_0;
        break forest_join_13;
    }
    if (!((spill1141_0 == null))) {
        break forest_join_12;
    }
    forestValue1141_14_0 = null;
    break forest_join_14;
    }
    forestValue1141_13_0 = __call1141_4();
    }
    forestValue1141_14_0 = __call1141_5(forestValue1141_13_0);
    }
    life6_15 = forestValue1141_14_0;
    spill1141_1 = life6_15;
    if (!((life5_5 == 0))) {
        forestValue1141_20_0 = spill1141_1;
        break forest_join_20;
    }
    if (!((spill1141_1 == null))) {
        break forest_join_21;
    }
    forestValue1141_20_0 = __fieldRead1141_6();
    }
    life6_15 = forestValue1141_20_0;
    }
    life7_27 = __cast1141_8(__call1141_7(p0, life6_15));
    __call1141_9(life7_27, "POST");
    __call1141_10(life7_27, "Content-Type", "application/x-www-form-urlencoded");
    __call1141_13(life7_27, "Content-Length", __invokedynamic1141_12((__call1141_11(p1)).length));
    __call1141_14(life7_27, "Content-Language", "en-US");
    __call1141_15(life7_27, 0);
    __call1141_16(life7_27, 1);
    __call1141_17(life7_27, 1);
    life8_60 = new java.io.DataOutputStream(__call1141_18(life7_27));
    __call1141_19(life8_60, p1);
    __call1141_20(life8_60);
    __call1141_21(life8_60);
    life9_76 = new java.io.BufferedReader(new java.io.InputStreamReader(__call1141_22(life7_27)));
    life10_80 = new java.lang.StringBuilder();
    forest_cycle_79: while (true) {
    if (!(((life11_84 = __call1141_23(life9_76)) != null))) {
        break forest_join_100;
    }
    __call1141_24(life10_80, life11_84);
    __call1141_26(life10_80, __invokedynamic1141_25(5082, (3820254937161535442L ^ life3_3)));
    if (!((life5_5 == 0))) {
        break forest_join_102;
    }
    if (!((life5_5 != 0))) {
        continue forest_cycle_79;
    }
    break forest_cycle_79;
    }
    }
    __call1141_27(life9_76);
    }
    return __call1141_28(life10_80);
}
public static java.lang.String h1141_0(java.lang.Exception p0) throws Throwable {
    throw __call3114100_0(p0);
}
public static java.lang.String h1141_1(java.lang.Exception p0) throws Throwable {
    throw __call3114101_0(p0);
}
public static java.lang.String h1141_2(java.lang.Exception p0) throws Throwable {
    throw __call3114102_0(p0);
}
public static java.lang.String h1141_3(java.lang.Exception p0) throws Throwable {
    throw __call3114103_0(p0);
}
public static java.lang.String h1141_4(java.lang.Exception p0, java.net.URL p1, boolean p2, java.net.Proxy p3) throws Throwable {
    java.lang.Exception life3_2;
    forest_join_9: {
    life3_2 = p0;
    if (!((!p2))) {
        break forest_join_9;
    }
    __call3114104_2(__fieldRead3114104_0(), __invokedynamic3114104_1(p1), life3_2);
    }
    return "";
}
public static java.lang.String h1141_5(java.lang.Exception p0) throws Throwable {
    throw __call3114105_0(p0);
}
private static native long __fieldRead1141_0() throws Throwable;
private static native boolean __call1141_1() throws Throwable;
private static native int __integerCategory1141_2(boolean value) throws Throwable;
private static native moom.Bl __call1141_3() throws Throwable;
private static native moom.Bl __call1141_4() throws Throwable;
private static native java.net.Proxy __call1141_5(moom.Bl a0) throws Throwable;
private static native java.net.Proxy __fieldRead1141_6() throws Throwable;
private static native java.net.URLConnection __call1141_7(java.net.URL a0, java.net.Proxy a1) throws Throwable;
private static native java.net.HttpURLConnection __cast1141_8(java.net.URLConnection a0) throws Throwable;
private static native void __call1141_9(java.net.HttpURLConnection a0, java.lang.String a1) throws Throwable;
private static native void __call1141_10(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native byte[] __call1141_11(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic1141_12(int a0) throws Throwable;
private static native void __call1141_13(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call1141_14(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call1141_15(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call1141_16(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call1141_17(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native java.io.OutputStream __call1141_18(java.net.HttpURLConnection a0) throws Throwable;
private static native void __call1141_19(java.io.DataOutputStream a0, java.lang.String a1) throws Throwable;
private static native void __call1141_20(java.io.DataOutputStream a0) throws Throwable;
private static native void __call1141_21(java.io.DataOutputStream a0) throws Throwable;
private static native java.io.InputStream __call1141_22(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.String __call1141_23(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.StringBuilder __call1141_24(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1141_25(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call1141_26(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native void __call1141_27(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call1141_28(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call3114100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3114101_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3114102_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call3114103_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3114104_0() throws Throwable;
private static native java.lang.String __invokedynamic3114104_1(java.net.URL a0) throws Throwable;
private static native void __call3114104_2(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native java.lang.Throwable __call3114105_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_483d4f643164e3ba31f1(java.util.Map a0) throws E;
private static final class __SourceHandler_483d4f643164e3ba31f1 {

public static java.lang.String f1674(java.util.Map p0) throws Throwable {
    java.lang.Object lexicalValue1674_48_0;
    java.lang.StringBuilder lexicalValue1674_68_0;
    boolean spill1674_0;
    java.lang.StringBuilder spill1674_1;
    long life1_3;
    java.lang.StringBuilder life4_8;
    int life3_9;
    java.util.Iterator life5_13;
    java.util.Map.Entry life6_20;
    lexical_join_68: {
    lexical_join_67: {
    life1_3 = (__fieldRead1674_0() ^ 77376059351970L);
    spill1674_0 = __call1674_1();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = __integerCategory1674_2(spill1674_0);
    life5_13 = __call1674_4(__call1674_3(p0));
    lexical_cycle_14: while (true) {
    lexical_join_65: {
    lexical_join_57: {
    lexical_join_48: {
    lexical_join_36: {
    if (!(__call1674_5(life5_13))) {
        break lexical_join_67;
    }
    life6_20 = __cast1674_7(__call1674_6(life5_13));
    spill1674_1 = life4_8;
    if (!((life3_9 != 0))) {
        lexicalValue1674_68_0 = spill1674_1;
        break lexical_join_68;
    }
    if (!((life3_9 != 0))) {
        lexicalValue1674_48_0 = spill1674_1;
        break lexical_join_48;
    }
    if (!((__call1674_8(spill1674_1) > 0))) {
        break lexical_join_36;
    }
    __call1674_10(life4_8, __invokedynamic1674_9(2506, (5473348304742795493L ^ life1_3)));
    }
    __call1674_15(life4_8, __call1674_14(__cast1674_12(__call1674_11(life6_20)), __fieldRead1674_13()));
    if (!((life3_9 != 0))) {
        break lexical_join_57;
    }
    lexicalValue1674_48_0 = __call1674_16(life6_20);
    }
    if (!((lexicalValue1674_48_0 != null))) {
        break lexical_join_65;
    }
    __call1674_18(life4_8, __invokedynamic1674_17(23593, (8998436964508933379L ^ life1_3)));
    }
    __call1674_23(life4_8, __call1674_22(__call1674_20(__call1674_19(life6_20)), __fieldRead1674_21()));
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1674_68_0 = life4_8;
    }
    return __call1674_24(lexicalValue1674_68_0);
}
public static void h1674_0(moom.Oo p0) throws Throwable {
    throw __call1167400_0(p0);
}
public static void h1674_1(moom.Oo p0) throws Throwable {
    throw __call1167401_0(p0);
}
public static void h1674_2(moom.Oo p0) throws Throwable {
    throw __call1167402_0(p0);
}
public static void h1674_3(moom.Oo p0) throws Throwable {
    throw __call1167403_0(p0);
}
public static void h1674_4(moom.Oo p0) throws Throwable {
    throw __call1167404_0(p0);
}
private static native long __fieldRead1674_0() throws Throwable;
private static native boolean __call1674_1() throws Throwable;
private static native int __integerCategory1674_2(boolean value) throws Throwable;
private static native java.util.Set __call1674_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1674_4(java.util.Set a0) throws Throwable;
private static native boolean __call1674_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1674_6(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast1674_7(java.lang.Object a0) throws Throwable;
private static native int __call1674_8(java.lang.StringBuilder a0) throws Throwable;
private static native int __invokedynamic1674_9(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call1674_10(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.Object __call1674_11(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast1674_12(java.lang.Object a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead1674_13() throws Throwable;
private static native java.lang.String __call1674_14(java.lang.String a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.lang.StringBuilder __call1674_15(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call1674_16(java.util.Map.Entry a0) throws Throwable;
private static native int __invokedynamic1674_17(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call1674_18(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.Object __call1674_19(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __call1674_20(java.lang.Object a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead1674_21() throws Throwable;
private static native java.lang.String __call1674_22(java.lang.String a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.lang.StringBuilder __call1674_23(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1674_24(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call1167400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1167404_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4f320d16dbc75efcc47c(net.minecraft.util.IProgressUpdate a0, java.lang.String a1, java.net.Proxy a2, java.util.Map a3, java.io.File a4, int a5) throws E;
private static final class __SourceHandler_4f320d16dbc75efcc47c {

public static void f713(net.minecraft.util.IProgressUpdate p0, java.lang.String p1, java.net.Proxy p2, java.util.Map p3, java.io.File p4, int p5) throws Throwable {
    net.minecraft.util.IProgressUpdate forestValue713_20_0;
    net.minecraft.util.IProgressUpdate forestValue713_72_0;
    java.net.HttpURLConnection forestValue713_86_0;
    net.minecraft.util.IProgressUpdate forestValue713_100_0;
    net.minecraft.util.IProgressUpdate forestValue713_134_0;
    int forestValue713_148_0;
    java.io.File forestValue713_153_0;
    java.io.File forestValue713_158_0;
    net.minecraft.util.IProgressUpdate forestValue713_184_0;
    int forestValue713_193_0;
    net.minecraft.util.IProgressUpdate forestValue713_212_0;
    int forestValue713_232_0;
    net.minecraft.util.IProgressUpdate forestValue713_247_0;
    net.minecraft.util.IProgressUpdate forestValue713_270_0;
    net.minecraft.util.IProgressUpdate forestValue713_274_0;
    boolean spill713_0;
    net.minecraft.util.IProgressUpdate spill713_1;
    java.net.HttpURLConnection spill713_2;
    net.minecraft.util.IProgressUpdate spill713_3;
    net.minecraft.util.IProgressUpdate spill713_4;
    java.lang.String spill713_5;
    java.lang.Object[] spill713_6;
    java.io.File spill713_7;
    int spill713_8;
    net.minecraft.util.IProgressUpdate spill713_9;
    int spill713_10;
    int spill713_11;
    net.minecraft.util.IProgressUpdate spill713_12;
    net.minecraft.util.IProgressUpdate spill713_13;
    int spill713_14;
    int spill713_15;
    net.minecraft.util.IProgressUpdate spill713_16;
    long life6_3;
    java.lang.Object life9_6;
    int life8_7;
    java.lang.Object life10_9;
    java.io.OutputStream life11_11;
    byte[] life12_30;
    java.net.URL life13_35;
    java.net.HttpURLConnection life9_40;
    float life14_42;
    float life15_47;
    java.util.Iterator life16_51;
    java.util.Map.Entry life17_58;
    java.io.InputStream life10_91;
    float life15_95;
    int life16_98;
    long life17_127;
    java.io.DataOutputStream life11_179;
    int life17_210;
    int life17_215;
    forest_join_275: {
    forest_join_274: {
    forest_join_270: {
    forest_join_269: {
    forest_join_268: {
    forest_join_264: {
    forest_join_255: {
    forest_join_248: {
    forest_join_247: {
    forest_join_242: {
    forest_join_193: {
    forest_join_192: {
    forest_join_185: {
    forest_join_184: {
    forest_join_160: {
    forest_join_158: {
    forest_join_153: {
    forest_join_151: {
    forest_join_148: {
    forest_join_140: {
    forest_join_135: {
    forest_join_134: {
    forest_join_114: {
    forest_join_100: {
    forest_join_86: {
    forest_join_85: {
    forest_join_22: {
    forest_join_20: {
    life6_3 = (__fieldRead713_0() ^ 34454233379950L);
    spill713_0 = __call713_1();
    life9_6 = null;
    life8_7 = __integerCategory713_2(spill713_0);
    life10_9 = null;
    life11_11 = null;
    spill713_1 = p0;
    if (!((life8_7 == 0))) {
        forestValue713_20_0 = spill713_1;
        break forest_join_20;
    }
    if (!((spill713_1 != null))) {
        break forest_join_22;
    }
    __call713_3(p0, "Downloading Resource Pack");
    forestValue713_20_0 = p0;
    }
    __call713_4(forestValue713_20_0, "Making Request...");
    }
    life12_30 = new byte[__invokedynamic713_5(2022, (2071087071921639684L ^ life6_3))];
    life13_35 = new java.net.URL(p1);
    life9_40 = __cast713_7(__call713_6(life13_35, p2));
    life14_42 = 0x0.0p0f;
    life15_47 = ((float) __call713_9(__call713_8(p3)));
    life16_51 = __call713_11(__call713_10(p3));
    forest_cycle_50: while (true) {
    forest_join_83: {
    forest_join_72: {
    if (!(__call713_12(life16_51))) {
        break forest_join_85;
    }
    life17_58 = __cast713_14(__call713_13(life16_51));
    spill713_2 = life9_40;
    if (!((life8_7 == 0))) {
        forestValue713_86_0 = spill713_2;
        break forest_join_86;
    }
    __call713_19(spill713_2, __cast713_16(__call713_15(life17_58)), __cast713_18(__call713_17(life17_58)));
    spill713_3 = p0;
    if (!((life8_7 == 0))) {
        forestValue713_72_0 = spill713_3;
        break forest_join_72;
    }
    if (!((spill713_3 != null))) {
        break forest_join_83;
    }
    forestValue713_72_0 = p0;
    }
    __call713_20(forestValue713_72_0, ((int) (((life14_42 = (life14_42 + 0x1.0p0f)) / life15_47) * 0x1.9p6f)));
    }
    if (!((life8_7 != 0))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    forestValue713_86_0 = life9_40;
    }
    life10_91 = __call713_21(forestValue713_86_0);
    life15_95 = ((float) __call713_22(life9_40));
    life16_98 = __call713_23(life9_40);
    spill713_4 = p0;
    if (!((life8_7 == 0))) {
        forestValue713_100_0 = spill713_4;
        break forest_join_100;
    }
    if (!((spill713_4 != null))) {
        break forest_join_114;
    }
    forestValue713_100_0 = p0;
    }
    spill713_5 = "Downloading file (%.2f MB)...";
    java.lang.Object[] __stackOp713_24_0 = new java.lang.Object[1];
    spill713_6 = __stackOp713_24_0;
    (__stackOp713_24_0)[0] = __call713_25(((life15_95 / 0x1.f4p9f) / 0x1.f4p9f));
    __call713_27(forestValue713_100_0, __call713_26(spill713_5, spill713_6));
    }
    spill713_7 = p4;
    if (!((life8_7 == 0))) {
        forestValue713_153_0 = spill713_7;
        break forest_join_153;
    }
    if (!(__call713_28(spill713_7))) {
        break forest_join_151;
    }
    life17_127 = __call713_29(p4);
    spill713_8 = __numericCompare713_30(life17_127, ((long) life16_98));
    if (!((life8_7 == 0))) {
        forestValue713_148_0 = spill713_8;
        break forest_join_148;
    }
    if (!((spill713_8 == 0))) {
        break forest_join_140;
    }
    spill713_9 = p0;
    if (!((life8_7 == 0))) {
        forestValue713_134_0 = spill713_9;
        break forest_join_134;
    }
    if (!((spill713_9 != null))) {
        break forest_join_135;
    }
    forestValue713_134_0 = p0;
    }
    __call713_31(forestValue713_134_0);
    }
    __call713_32(life10_91);
    __call713_33(life11_11);
    return;
    }
    __call713_36(__fieldRead713_34(), __invokedynamic713_35(p4, life16_98, life17_127));
    forestValue713_148_0 = __integerCategory713_38(__call713_37(p4));
    }
    __discardScalar713_39(forestValue713_148_0);
    if (!((life8_7 != 0))) {
        break forest_join_160;
    }
    }
    forestValue713_153_0 = __call713_40(p4);
    }
    if (!((life8_7 == 0))) {
        forestValue713_158_0 = forestValue713_153_0;
        break forest_join_158;
    }
    if (!((forestValue713_153_0 != null))) {
        break forest_join_160;
    }
    forestValue713_158_0 = __call713_41(p4);
    }
    __call713_42(forestValue713_158_0);
    }
    life11_179 = new java.io.DataOutputStream(new java.io.FileOutputStream(p4));
    spill713_10 = p5;
    if (!((life8_7 == 0))) {
        forestValue713_193_0 = spill713_10;
        break forest_join_193;
    }
    if (!((spill713_10 > 0))) {
        break forest_join_192;
    }
    spill713_11 = __numericCompare713_43(life15_95, ((float) p5));
    if (!((life8_7 == 0))) {
        forestValue713_193_0 = spill713_11;
        break forest_join_193;
    }
    if (!((spill713_11 > 0))) {
        break forest_join_192;
    }
    spill713_12 = p0;
    if (!((life8_7 == 0))) {
        forestValue713_184_0 = spill713_12;
        break forest_join_184;
    }
    if (!((spill713_12 != null))) {
        break forest_join_185;
    }
    forestValue713_184_0 = p0;
    }
    __call713_44(forestValue713_184_0);
    }
    throw new java.io.IOException(__invokedynamic713_45(life14_42, p5));
    }
    forestValue713_193_0 = 0;
    }
    life17_210 = forestValue713_193_0;
    forest_cycle_194: while (true) {
    forest_join_234: {
    forest_join_232: {
    forest_join_231: {
    forest_join_219: {
    forest_join_212: {
    if (!(((life17_215 = __call713_46(life10_91, life12_30)) >= 0))) {
        break forest_join_269;
    }
    life14_42 = (life14_42 + ((float) life17_215));
    spill713_13 = p0;
    if (!((life8_7 == 0))) {
        forestValue713_270_0 = spill713_13;
        break forest_join_270;
    }
    if (!((life8_7 == 0))) {
        forestValue713_212_0 = spill713_13;
        break forest_join_212;
    }
    if (!((spill713_13 != null))) {
        break forest_join_219;
    }
    forestValue713_212_0 = p0;
    }
    __call713_47(forestValue713_212_0, ((int) ((life14_42 / life15_95) * 0x1.9p6f)));
    }
    spill713_14 = p5;
    if (!((life8_7 == 0))) {
        forestValue713_232_0 = spill713_14;
        break forest_join_232;
    }
    if (!((spill713_14 > 0))) {
        break forest_join_231;
    }
    spill713_15 = __numericCompare713_48(life14_42, ((float) p5));
    if (!((life8_7 == 0))) {
        forestValue713_232_0 = spill713_15;
        break forest_join_232;
    }
    if (!((spill713_15 > 0))) {
        break forest_join_231;
    }
    break forest_join_242;
    }
    forestValue713_232_0 = __integerCategory713_50(__call713_49());
    }
    if (!((forestValue713_232_0 != 0))) {
        break forest_join_234;
    }
    break forest_join_255;
    }
    __call713_51(life11_179, life12_30, 0, life17_215);
    if (!((life8_7 != 0))) {
        continue forest_cycle_194;
    }
    break forest_cycle_194;
    }
    break forest_join_269;
    }
    spill713_16 = p0;
    if (!((life8_7 == 0))) {
        forestValue713_247_0 = spill713_16;
        break forest_join_247;
    }
    if (!((spill713_16 != null))) {
        break forest_join_248;
    }
    forestValue713_247_0 = p0;
    }
    __call713_52(forestValue713_247_0);
    }
    throw new java.io.IOException(__invokedynamic713_53(life14_42, p5));
    }
    __call713_55(__fieldRead713_54(), "INTERRUPTED");
    if (!((life8_7 == 0))) {
        break forest_join_268;
    }
    if (!((p0 != null))) {
        break forest_join_264;
    }
    __call713_56(p0);
    }
    __call713_57(life10_91);
    __call713_58(life11_179);
    }
    return;
    }
    forestValue713_270_0 = p0;
    }
    if (!((life8_7 == 0))) {
        forestValue713_274_0 = forestValue713_270_0;
        break forest_join_274;
    }
    if (!((forestValue713_270_0 != null))) {
        break forest_join_275;
    }
    forestValue713_274_0 = p0;
    }
    __call713_59(forestValue713_274_0);
    }
    __call713_60(life10_91);
    __call713_61(life11_179);
    return;
}
public static void h713_0(java.lang.Throwable p0) throws Throwable {
    throw __call3071300_0(p0);
}
public static void h713_1(java.lang.Throwable p0) throws Throwable {
    throw __call3071301_0(p0);
}
public static void h713_2(java.lang.Throwable p0) throws Throwable {
    throw __call3071302_0(p0);
}
public static void h713_3(java.lang.Throwable p0) throws Throwable {
    throw __call3071303_0(p0);
}
public static void h713_4(java.lang.Throwable p0) throws Throwable {
    throw __call3071304_0(p0);
}
public static void h713_5(java.lang.Throwable p0) throws Throwable {
    throw __call3071305_0(p0);
}
public static void h713_6(java.lang.Throwable p0) throws Throwable {
    throw __call3071306_0(p0);
}
public static void h713_7(java.lang.Throwable p0) throws Throwable {
    throw __call3071307_0(p0);
}
public static void h713_8(java.lang.Throwable p0) throws Throwable {
    throw __call3071308_0(p0);
}
public static void h713_9(java.lang.Throwable p0) throws Throwable {
    throw __call3071309_0(p0);
}
public static void h713_10(java.lang.Throwable p0) throws Throwable {
    throw __call3071310_0(p0);
}
public static void h713_11(java.lang.Throwable p0) throws Throwable {
    throw __call3071311_0(p0);
}
public static void h713_12(java.lang.Throwable p0) throws Throwable {
    throw __call3071312_0(p0);
}
public static void h713_13(java.lang.Throwable p0) throws Throwable {
    throw __call3071313_0(p0);
}
public static void h713_14(java.lang.Throwable p0) throws Throwable {
    throw __call3071314_0(p0);
}
public static void h713_15(java.lang.Throwable p0) throws Throwable {
    throw __call3071315_0(p0);
}
public static void h713_16(java.lang.Throwable p0) throws Throwable {
    throw __call3071316_0(p0);
}
public static void h713_17(java.lang.Throwable p0) throws Throwable {
    throw __call3071317_0(p0);
}
public static void h713_18(java.lang.Throwable p0) throws Throwable {
    throw __call3071318_0(p0);
}
public static void h713_19(java.lang.Throwable p0) throws Throwable {
    throw __call3071319_0(p0);
}
public static void h713_20(java.lang.Throwable p0) throws Throwable {
    throw __call3071320_0(p0);
}
public static void h713_21(java.lang.Throwable p0) throws Throwable {
    throw __call3071321_0(p0);
}
public static void h713_22(java.lang.Throwable p0) throws Throwable {
    throw __call3071322_0(p0);
}
public static void h713_23(java.lang.Throwable p0) throws Throwable {
    throw __call3071323_0(p0);
}
public static void h713_24(java.lang.Throwable p0) throws Throwable {
    throw __call3071324_0(p0);
}
public static void h713_25(java.lang.Throwable p0) throws Throwable {
    throw __call3071325_0(p0);
}
public static void h713_26(java.lang.Throwable p0) throws Throwable {
    throw __call3071326_0(p0);
}
public static void h713_27(java.lang.Throwable p0) throws Throwable {
    throw __call3071327_0(p0);
}
public static void h713_28(java.lang.Throwable p0, net.minecraft.util.IProgressUpdate p1, int p2, java.net.HttpURLConnection p3, java.io.InputStream p4, java.io.DataOutputStream p5) throws Throwable {
    java.net.HttpURLConnection forestValue3071328_9_0;
    net.minecraft.util.IProgressUpdate forestValue3071328_20_0;
    java.net.HttpURLConnection spill3071328_0;
    net.minecraft.util.IProgressUpdate spill3071328_1;
    java.lang.Throwable life6_2;
    java.io.InputStream life7_12;
    forest_join_21: {
    forest_join_20: {
    forest_join_15: {
    forest_join_9: {
    life6_2 = p0;
    __call3071328_0(life6_2);
    spill3071328_0 = p3;
    if (!((p2 == 0))) {
        forestValue3071328_9_0 = spill3071328_0;
        break forest_join_9;
    }
    if (!((spill3071328_0 != null))) {
        break forest_join_15;
    }
    forestValue3071328_9_0 = p3;
    }
    life7_12 = __call3071328_1(forestValue3071328_9_0);
    __call3071328_4(__fieldRead3071328_2(), __call3071328_3(life7_12));
    }
    spill3071328_1 = p1;
    if (!((p2 == 0))) {
        forestValue3071328_20_0 = spill3071328_1;
        break forest_join_20;
    }
    if (!((spill3071328_1 != null))) {
        break forest_join_21;
    }
    forestValue3071328_20_0 = p1;
    }
    __call3071328_5(forestValue3071328_20_0);
    }
    __call3071328_6(p4);
    __call3071328_7(p5);
    return;
}
public static void h713_29(java.lang.Throwable p0) throws Throwable {
    throw __call3071329_0(p0);
}
public static void h713_30(java.io.IOException p0, net.minecraft.util.IProgressUpdate p1, int p2, java.io.InputStream p3, java.io.DataOutputStream p4) throws Throwable {
    net.minecraft.util.IProgressUpdate forestValue3071330_9_0;
    net.minecraft.util.IProgressUpdate spill3071330_0;
    java.io.IOException life5_2;
    forest_join_10: {
    forest_join_9: {
    life5_2 = p0;
    __call3071330_0(life5_2);
    spill3071330_0 = p1;
    if (!((p2 == 0))) {
        forestValue3071330_9_0 = spill3071330_0;
        break forest_join_9;
    }
    if (!((spill3071330_0 != null))) {
        break forest_join_10;
    }
    forestValue3071330_9_0 = p1;
    }
    __call3071330_1(forestValue3071330_9_0);
    }
    __call3071330_2(p3);
    __call3071330_3(p4);
    return;
}
public static void h713_31(java.lang.Throwable p0) throws Throwable {
    throw __call3071331_0(p0);
}
public static void h713_32(java.lang.Throwable p0, java.io.InputStream p1, java.io.DataOutputStream p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call3071332_0(p1);
    __call3071332_1(p2);
    throw life3_2;
}
private static native long __fieldRead713_0() throws Throwable;
private static native boolean __call713_1() throws Throwable;
private static native int __integerCategory713_2(boolean value) throws Throwable;
private static native void __call713_3(net.minecraft.util.IProgressUpdate a0, java.lang.String a1) throws Throwable;
private static native void __call713_4(net.minecraft.util.IProgressUpdate a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic713_5(int a0, long a1) throws Throwable;
private static native java.net.URLConnection __call713_6(java.net.URL a0, java.net.Proxy a1) throws Throwable;
private static native java.net.HttpURLConnection __cast713_7(java.net.URLConnection a0) throws Throwable;
private static native java.util.Set __call713_8(java.util.Map a0) throws Throwable;
private static native int __call713_9(java.util.Set a0) throws Throwable;
private static native java.util.Set __call713_10(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call713_11(java.util.Set a0) throws Throwable;
private static native boolean __call713_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call713_13(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast713_14(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call713_15(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast713_16(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call713_17(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast713_18(java.lang.Object a0) throws Throwable;
private static native void __call713_19(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call713_20(net.minecraft.util.IProgressUpdate a0, int a1) throws Throwable;
private static native java.io.InputStream __call713_21(java.net.HttpURLConnection a0) throws Throwable;
private static native int __call713_22(java.net.HttpURLConnection a0) throws Throwable;
private static native int __call713_23(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.Float __call713_25(float a0) throws Throwable;
private static native java.lang.String __call713_26(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call713_27(net.minecraft.util.IProgressUpdate a0, java.lang.String a1) throws Throwable;
private static native boolean __call713_28(java.io.File a0) throws Throwable;
private static native long __call713_29(java.io.File a0) throws Throwable;
private static native int __numericCompare713_30(long a0, long a1) throws Throwable;
private static native void __call713_31(net.minecraft.util.IProgressUpdate a0) throws Throwable;
private static native void __call713_32(java.io.InputStream a0) throws Throwable;
private static native void __call713_33(java.io.OutputStream a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead713_34() throws Throwable;
private static native java.lang.String __invokedynamic713_35(java.io.File a0, int a1, long a2) throws Throwable;
private static native void __call713_36(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call713_37(java.io.File a0) throws Throwable;
private static native int __integerCategory713_38(boolean value) throws Throwable;
private static native void __discardScalar713_39(int a0) throws Throwable;
private static native java.io.File __call713_40(java.io.File a0) throws Throwable;
private static native java.io.File __call713_41(java.io.File a0) throws Throwable;
private static native boolean __call713_42(java.io.File a0) throws Throwable;
private static native int __numericCompare713_43(float a0, float a1) throws Throwable;
private static native void __call713_44(net.minecraft.util.IProgressUpdate a0) throws Throwable;
private static native java.lang.String __invokedynamic713_45(float a0, int a1) throws Throwable;
private static native int __call713_46(java.io.InputStream a0, byte[] a1) throws Throwable;
private static native void __call713_47(net.minecraft.util.IProgressUpdate a0, int a1) throws Throwable;
private static native int __numericCompare713_48(float a0, float a1) throws Throwable;
private static native boolean __call713_49() throws Throwable;
private static native int __integerCategory713_50(boolean value) throws Throwable;
private static native void __call713_51(java.io.DataOutputStream a0, byte[] a1, int a2, int a3) throws Throwable;
private static native void __call713_52(net.minecraft.util.IProgressUpdate a0) throws Throwable;
private static native java.lang.String __invokedynamic713_53(float a0, int a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead713_54() throws Throwable;
private static native void __call713_55(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call713_56(net.minecraft.util.IProgressUpdate a0) throws Throwable;
private static native void __call713_57(java.io.InputStream a0) throws Throwable;
private static native void __call713_58(java.io.DataOutputStream a0) throws Throwable;
private static native void __call713_59(net.minecraft.util.IProgressUpdate a0) throws Throwable;
private static native void __call713_60(java.io.InputStream a0) throws Throwable;
private static native void __call713_61(java.io.DataOutputStream a0) throws Throwable;
private static native java.lang.Throwable __call3071300_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071301_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071302_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071303_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071304_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071305_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071306_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071307_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071308_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071309_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071310_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071311_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071312_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071313_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071314_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071315_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071316_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071317_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071318_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071319_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071320_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071321_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071322_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071323_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071324_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071325_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071326_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3071327_0(java.lang.Throwable a0) throws Throwable;
private static native void __call3071328_0(java.lang.Throwable a0) throws Throwable;
private static native java.io.InputStream __call3071328_1(java.net.HttpURLConnection a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3071328_2() throws Throwable;
private static native java.lang.String __call3071328_3(java.io.InputStream a0) throws Throwable;
private static native void __call3071328_4(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3071328_5(net.minecraft.util.IProgressUpdate a0) throws Throwable;
private static native void __call3071328_6(java.io.InputStream a0) throws Throwable;
private static native void __call3071328_7(java.io.DataOutputStream a0) throws Throwable;
private static native java.lang.Throwable __call3071329_0(java.lang.Throwable a0) throws Throwable;
private static native void __call3071330_0(java.io.IOException a0) throws Throwable;
private static native void __call3071330_1(net.minecraft.util.IProgressUpdate a0) throws Throwable;
private static native void __call3071330_2(java.io.InputStream a0) throws Throwable;
private static native void __call3071330_3(java.io.DataOutputStream a0) throws Throwable;
private static native java.lang.Throwable __call3071331_0(java.lang.Throwable a0) throws Throwable;
private static native void __call3071332_0(java.io.InputStream a0) throws Throwable;
private static native void __call3071332_1(java.io.DataOutputStream a0) throws Throwable;

}


public static java.lang.String a(java.net.URL p0) throws java.io.IOException { return __sourceHandlerCall_dfb368ccdc50464f6a35(p0); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22246;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/C4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.util.HttpUtil.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12376_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/C4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(java.net.URL p0, java.util.Map<java.lang.String, java.lang.Object> p1, boolean p2) {
return net.minecraft.util.HttpUtil.a(((java.net.URL)(p0)), ((java.lang.String)(net.minecraft.util.HttpUtil.a(((java.util.Map)(p1))))), ((boolean)(p2)));
}


public static java.lang.String a(java.util.Map<java.lang.String, java.lang.Object> p0) { return __sourceHandlerCall_483d4f643164e3ba31f1(p0); }


public static com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a(java.io.File p0, java.lang.String p1, java.util.Map<java.lang.String, java.lang.String> p2, int p3, net.minecraft.util.IProgressUpdate p4, java.net.Proxy p5) {
com.google.common.util.concurrent.ListenableFuture local6 = ((com.google.common.util.concurrent.ListeningExecutorService)(net.minecraft.util.HttpUtil.a)).submit(((java.lang.Runnable)(__sourceIntrinsic_1ec38799ada6_originalDynamicSite2054_1(p4, p1, p5, p2, p0, p3))));
    return local6;
}


public static int a() throws java.io.IOException { return __sourceHandlerCall_a15cf9f17398d69b833e(); }


private static java.lang.String a(java.net.URL p0, java.lang.String p1, boolean p2) { return __sourceHandlerCall_b32684998457a343dfaa(p0, p1, p2); }


private static void lambda$downloadResourcePack$0(net.minecraft.util.IProgressUpdate p0, java.lang.String p1, java.net.Proxy p2, java.util.Map p3, java.io.File p4, int p5) { __sourceHandlerCall_4f320d16dbc75efcc47c(p0, p1, p2, p3, p4, p5); }


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_1ec38799ada6_originalDynamicSite2054_1(net.minecraft.util.IProgressUpdate a0, java.lang.String a1, java.net.Proxy a2, java.util.Map a3, java.io.File a4, int a5) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12376_0() throws E;
}
