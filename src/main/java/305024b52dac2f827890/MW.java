package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MW {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

public MW() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(1364967597219747365L)), ((long)(-5557885368437480671L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(21841449694691L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.MW.a ^ 34869131858668L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill698_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill698_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill698_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill698_14 = new byte[8];
    (__sourceSpill698_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill698_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation698_16 = __sourceSpill698_14;
    ((javax.crypto.Cipher)(__sourceSpill698_11)).init(((int)(__sourceSpill698_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill698_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation698_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "3\002äûq¯T{Þd\033¥ïë\025\030\020ÃäÚù-²\rz¢ûxrß\001"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill698_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill698_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill698_29)).doFinal(((byte[])(__sourceSpill698_28)));
        java.lang.String __sourceSpill698_34 = ((java.lang.String)(moom.MW.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill698_35 = local20_life19;
        int __sourceSpill698_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill698_35)[__sourceSpill698_36] = __sourceSpill698_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    b = ((java.lang.String[])(local20_life19));
    c = ((java.lang.String[])(new java.lang.String[2]));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill698_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill698_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill698_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill698_47 = new byte[8];
    (__sourceSpill698_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill698_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation698_49 = __sourceSpill698_47;
    ((javax.crypto.Cipher)(__sourceSpill698_44)).init(((int)(__sourceSpill698_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill698_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation698_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[4];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "ÒÒd³ð}·\177Èªá\016ël"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill698_58 = local4_life54;
        int __sourceSpill698_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill698_58)).substring(((int)(__sourceSpill698_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill698_63 = local6_life52;
        int __sourceSpill698_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill698_66 = new byte[8];
        (__sourceSpill698_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill698_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill698_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill698_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill698_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill698_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill698_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill698_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill698_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill698_67)).doFinal(((byte[])(__sourceSpill698_66)));
        (__sourceSpill698_63)[__sourceSpill698_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "ôP\021º¯jØB¶ÖÝ\026U"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill698_71 = local4_life54;
        int __sourceSpill698_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill698_71)).substring(((int)(__sourceSpill698_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill698_76 = local6_life52;
        int __sourceSpill698_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill698_79 = new byte[8];
        (__sourceSpill698_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill698_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill698_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill698_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill698_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill698_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill698_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill698_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill698_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill698_80)).doFinal(((byte[])(__sourceSpill698_79)));
        (__sourceSpill698_76)[__sourceSpill698_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    e = ((long[])(local6_life52));
    f = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_427d6fe22997eafe230e() throws E;
private static final class __SourceHandler_427d6fe22997eafe230e {

public static java.util.List f139() throws Throwable {
    int lexicalValue139_42_0;
    int[] spill139_0;
    boolean spill139_1;
    long life0_3;
    java.util.ArrayList life3_7;
    moom.M7[] life4_9;
    moom.M7[] life5_11;
    int life6_15;
    int[] life2_16;
    int life7_18;
    moom.M7 life8_25;
    java.lang.String life9_28;
    lexical_join_46: {
    life0_3 = (__fieldRead139_0() ^ 122316234844883L);
    life3_7 = new java.util.ArrayList();
    life4_9 = __call139_1();
    life5_11 = life4_9;
    spill139_0 = __call139_2();
    life6_15 = (life5_11).length;
    life2_16 = spill139_0;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_42: {
    if (!((life7_18 < life6_15))) {
        break lexical_join_46;
    }
    life8_25 = (life5_11)[life7_18];
    life9_28 = __call139_3(life8_25);
    if (!((life2_16 == null))) {
        break lexical_join_44;
    }
    if (!((life9_28 != null))) {
        break lexical_join_43;
    }
    spill139_1 = __call139_4(life9_28, "#");
    if (!((life2_16 == null))) {
        lexicalValue139_42_0 = __integerCategory139_5(spill139_1);
        break lexical_join_42;
    }
    if (!(spill139_1)) {
        break lexical_join_43;
    }
    lexicalValue139_42_0 = __integerCategory139_7(__call139_6(life3_7, life8_25));
    }
    __discardScalar139_8(lexicalValue139_42_0);
    }
    life7_18 += 1;
    }
    if (!((life2_16 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return life3_7;
}
public static void h139_0(moom.Oo p0) throws Throwable {
    throw __call1013900_0(p0);
}
public static void h139_1(moom.Oo p0) throws Throwable {
    throw __call1013901_0(p0);
}
public static void h139_2(moom.Oo p0) throws Throwable {
    throw __call1013902_0(p0);
}
public static void h139_3(moom.Oo p0) throws Throwable {
    throw __call1013903_0(p0);
}
private static native long __fieldRead139_0() throws Throwable;
private static native moom.M7[] __call139_1() throws Throwable;
private static native int[] __call139_2() throws Throwable;
private static native java.lang.String __call139_3(moom.M7 a0) throws Throwable;
private static native boolean __call139_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory139_5(boolean value) throws Throwable;
private static native boolean __call139_6(java.util.ArrayList a0, moom.M7 a1) throws Throwable;
private static native int __integerCategory139_7(boolean value) throws Throwable;
private static native void __discardScalar139_8(int a0) throws Throwable;
private static native java.lang.Exception __call1013900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1013901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1013902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1013903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.io.InputStream __sourceHandlerCall_9ec13ce8f4adac6c30b0(java.io.InputStream a0, java.lang.String a1) throws E;
private static final class __SourceHandler_9ec13ce8f4adac6c30b0 {

public static java.io.InputStream f952(java.io.InputStream p0, java.lang.String p1) throws Throwable {
    java.lang.String forwardValue952_54_0;
    int forwardValue952_56_0;
    int[] spill952_0;
    boolean spill952_1;
    java.lang.String spill952_2;
    long life2_3;
    java.lang.String life5_11;
    java.lang.String life6_15;
    int[] life4_16;
    java.lang.String life5_33;
    java.lang.String life7_54;
    java.lang.String life7_75;
    byte[] life7_82;
    forward_join_73: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_52: {
    life2_3 = (__fieldRead952_0() ^ 110181852130894L);
    life5_11 = __call952_2(p0, __invokedynamic952_1(32238, (1466452718840837951L ^ life2_3)));
    spill952_0 = __call952_3();
    life6_15 = __call952_4(life5_11);
    life4_16 = spill952_0;
    spill952_1 = __call952_5(life6_15);
    if (!((life4_16 == null))) {
        forwardValue952_56_0 = __integerCategory952_6(spill952_1);
        break forward_join_56;
    }
    if (!((!spill952_1))) {
        break forward_join_55;
    }
    spill952_2 = __invokedynamic952_7(life6_15, life5_11);
    if (!((life4_16 == null))) {
        forwardValue952_54_0 = spill952_2;
        break forward_join_54;
    }
    life5_33 = spill952_2;
    if (!(__fieldRead952_8())) {
        break forward_join_52;
    }
    life7_54 = __invokedynamic952_13(__call952_11(p1, __invokedynamic952_9(7608, (4082559108167413599L ^ life2_3)), __invokedynamic952_10(2429, (7419270871775198105L ^ life2_3))), __invokedynamic952_12(19951, (5562328951838164799L ^ life2_3)));
    __call952_14(life7_54, life5_33);
    }
    forwardValue952_54_0 = __call952_15(life5_33);
    }
    life5_11 = forwardValue952_54_0;
    }
    forwardValue952_56_0 = __integerCategory952_17(__fieldRead952_16());
    }
    if (!((forwardValue952_56_0 != 0))) {
        break forward_join_73;
    }
    life7_75 = __call952_20(p1, __invokedynamic952_18(7953, (9216451058148257271L ^ life2_3)), __invokedynamic952_19(23085, (3879761874909358280L ^ life2_3)));
    __call952_21(life7_75, life5_11);
    }
    life7_82 = __call952_23(life5_11, __fieldRead952_22());
    return new java.io.ByteArrayInputStream(life7_82);
}
public static void h952_0(java.io.IOException p0) throws Throwable {
    throw __call1095200_0(p0);
}
public static void h952_1(java.io.IOException p0) throws Throwable {
    throw __call1095201_0(p0);
}
private static native long __fieldRead952_0() throws Throwable;
private static native java.lang.String __invokedynamic952_1(int a0, long a1) throws Throwable;
private static native java.lang.String __call952_2(java.io.InputStream a0, java.lang.String a1) throws Throwable;
private static native int[] __call952_3() throws Throwable;
private static native java.lang.String __call952_4(java.lang.String a0) throws Throwable;
private static native boolean __call952_5(java.lang.String a0) throws Throwable;
private static native int __integerCategory952_6(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic952_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead952_8() throws Throwable;
private static native int __invokedynamic952_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic952_10(int a0, long a1) throws Throwable;
private static native java.lang.String __call952_11(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic952_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic952_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call952_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call952_15(java.lang.String a0) throws Throwable;
private static native boolean __fieldRead952_16() throws Throwable;
private static native int __integerCategory952_17(boolean value) throws Throwable;
private static native int __invokedynamic952_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic952_19(int a0, long a1) throws Throwable;
private static native java.lang.String __call952_20(java.lang.String a0, int a1, int a2) throws Throwable;
private static native void __call952_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.nio.charset.Charset __fieldRead952_22() throws Throwable;
private static native byte[] __call952_23(java.lang.String a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.lang.Exception __call1095200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1095201_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_446916d88ad9c3c9bb43(java.lang.String a0) throws E;
private static final class __SourceHandler_446916d88ad9c3c9bb43 {

public static java.lang.String f359(java.lang.String p0) throws Throwable {
    java.lang.String forestValue359_43_0;
    int forestValue359_44_0;
    java.lang.String forestValue359_54_0;
    int[] spill359_0;
    java.lang.String spill359_1;
    boolean spill359_2;
    long life1_3;
    java.io.StringReader life4_9;
    java.io.BufferedReader life5_14;
    moom.MX life6_18;
    int[] life3_19;
    java.lang.StringBuilder life7_23;
    java.lang.String life8_26;
    forest_join_54: {
    life1_3 = (__fieldRead359_0() ^ 54927786908548L);
    spill359_0 = __call359_1();
    life4_9 = new java.io.StringReader(p0);
    life5_14 = new java.io.BufferedReader(life4_9);
    life6_18 = new moom.MX();
    life3_19 = spill359_0;
    life7_23 = new java.lang.StringBuilder();
    forest_cycle_24: while (true) {
    forest_join_53: {
    forest_join_44: {
    forest_join_43: {
    forest_join_36: {
    life8_26 = __call359_2(life5_14);
    if (!((life8_26 == null))) {
        break forest_join_36;
    }
    life8_26 = __call359_3(life7_23);
    spill359_1 = life8_26;
    if (!((life3_19 == null))) {
        forestValue359_43_0 = spill359_1;
        break forest_join_43;
    }
    forestValue359_54_0 = spill359_1;
    break forest_join_54;
    }
    spill359_2 = __call359_4(life6_18, life8_26);
    if (!((life3_19 == null))) {
        forestValue359_44_0 = __integerCategory359_5(spill359_2);
        break forest_join_44;
    }
    if (!(spill359_2)) {
        break forest_join_53;
    }
    forestValue359_43_0 = life8_26;
    }
    forestValue359_44_0 = __integerCategory359_7(__call359_6(forestValue359_43_0));
    }
    if (!((forestValue359_44_0 == 0))) {
        break forest_join_53;
    }
    __call359_8(life7_23, life8_26);
    __call359_9(life7_23, "\n");
    }
    continue forest_cycle_24;
    }
    }
    return forestValue359_54_0;
}
public static java.lang.String h359_0(java.io.IOException p0) throws Throwable {
    throw __call3035900_0(p0);
}
public static java.lang.String h359_1(java.io.IOException p0) throws Throwable {
    throw __call3035901_0(p0);
}
public static java.lang.String h359_2(java.io.IOException p0) throws Throwable {
    throw __call3035902_0(p0);
}
private static native long __fieldRead359_0() throws Throwable;
private static native int[] __call359_1() throws Throwable;
private static native java.lang.String __call359_2(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call359_3(java.lang.StringBuilder a0) throws Throwable;
private static native boolean __call359_4(moom.MX a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory359_5(boolean value) throws Throwable;
private static native boolean __call359_6(java.lang.String a0) throws Throwable;
private static native int __integerCategory359_7(boolean value) throws Throwable;
private static native java.lang.StringBuilder __call359_8(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call359_9(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3035900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3035901_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3035902_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_cabec90e440d1daf5afe(java.lang.String a0) throws E;
private static final class __SourceHandler_cabec90e440d1daf5afe {

public static java.lang.String f793(java.lang.String p0) throws Throwable {
    java.lang.String forestValue793_35_0;
    int forestValue793_36_0;
    int forestValue793_43_0;
    java.lang.StringBuilder forestValue793_47_0;
    java.util.ArrayList forestValue793_59_0;
    java.lang.String forestValue793_91_0;
    int[] spill793_0;
    java.lang.String spill793_1;
    java.lang.StringBuilder spill793_2;
    java.util.ArrayList spill793_3;
    boolean spill793_4;
    long life1_3;
    java.lang.StringBuilder life4_8;
    int[] life3_9;
    java.lang.Object life5_11;
    java.util.ArrayList life6_13;
    java.io.StringReader life7_18;
    java.io.BufferedReader life8_23;
    java.lang.String life9_26;
    java.util.Iterator life10_64;
    moom.M4 life11_71;
    forest_join_91: {
    life1_3 = (__fieldRead793_0() ^ 4383547392066L);
    spill793_0 = __call793_1();
    life4_8 = new java.lang.StringBuilder();
    life3_9 = spill793_0;
    life5_11 = null;
    life6_13 = null;
    life7_18 = new java.io.StringReader(p0);
    life8_23 = new java.io.BufferedReader(life7_18);
    forest_cycle_24: while (true) {
    forest_join_90: {
    forest_join_35: {
    forest_join_34: {
    life9_26 = __call793_2(life8_23);
    if (!((life9_26 == null))) {
        break forest_join_34;
    }
    spill793_1 = __call793_3(life4_8);
    if (!((life3_9 == null))) {
        forestValue793_35_0 = spill793_1;
        break forest_join_35;
    }
    forestValue793_91_0 = spill793_1;
    break forest_join_91;
    }
    forestValue793_35_0 = life9_26;
    }
    forestValue793_36_0 = __integerCategory793_5(__call793_4(forestValue793_35_0));
    forest_cycle_36: while (true) {
    forest_join_59: {
    forest_join_58: {
    forest_join_48: {
    forest_join_47: {
    forest_join_43: {
    if (!((life3_9 == null))) {
        forestValue793_43_0 = forestValue793_36_0;
        break forest_join_43;
    }
    if (!((forestValue793_36_0 != 0))) {
        break forest_join_90;
    }
    spill793_2 = life4_8;
    if (!((life3_9 == null))) {
        forestValue793_47_0 = spill793_2;
        break forest_join_47;
    }
    forestValue793_43_0 = __call793_6(spill793_2);
    }
    if (!((forestValue793_43_0 == 0))) {
        break forest_join_48;
    }
    forestValue793_47_0 = __call793_8(life4_8, __call793_7());
    }
    __discardScalar793_9(forestValue793_47_0);
    }
    spill793_3 = life6_13;
    if (!((life3_9 == null))) {
        forestValue793_59_0 = spill793_3;
        break forest_join_59;
    }
    if (!((spill793_3 == null))) {
        break forest_join_58;
    }
    life6_13 = new java.util.ArrayList(__call793_11(__call793_10()));
    }
    forestValue793_59_0 = life6_13;
    }
    life10_64 = __call793_12(forestValue793_59_0);
    forest_cycle_61: while (true) {
    forest_join_88: {
    forest_join_86: {
    if (!(__call793_13(life10_64))) {
        break forest_join_90;
    }
    life11_71 = __cast793_15(__call793_14(life10_64));
    if (!((life3_9 == null))) {
        break forest_join_86;
    }
    spill793_4 = __call793_17(life9_26, __call793_16(life11_71));
    if (!((life3_9 == null))) {
        forestValue793_36_0 = __integerCategory793_18(spill793_4);
        continue forest_cycle_36;
    }
    if (!(spill793_4)) {
        break forest_join_88;
    }
    __call793_20(life4_8, __call793_19(life11_71));
    __call793_21(life4_8, "\n");
    }
    __call793_22(life10_64);
    }
    if (!((life3_9 != null))) {
        continue forest_cycle_61;
    }
    break forest_cycle_61;
    }
    break forest_cycle_36;
    }
    }
    continue forest_cycle_24;
    }
    }
    return forestValue793_91_0;
}
public static java.lang.String h793_0(java.io.IOException p0) throws Throwable {
    throw __call3079300_0(p0);
}
public static java.lang.String h793_1(java.io.IOException p0) throws Throwable {
    throw __call3079301_0(p0);
}
public static java.lang.String h793_2(java.io.IOException p0) throws Throwable {
    throw __call3079302_0(p0);
}
public static java.lang.String h793_3(java.io.IOException p0) throws Throwable {
    throw __call3079303_0(p0);
}
public static java.lang.String h793_4(java.io.IOException p0) throws Throwable {
    throw __call3079304_0(p0);
}
public static java.lang.String h793_5(java.io.IOException p0) throws Throwable {
    throw __call3079305_0(p0);
}
public static java.lang.String h793_6(java.io.IOException p0) throws Throwable {
    throw __call3079306_0(p0);
}
public static java.lang.String h793_7(java.io.IOException p0) throws Throwable {
    throw __call3079307_0(p0);
}
private static native long __fieldRead793_0() throws Throwable;
private static native int[] __call793_1() throws Throwable;
private static native java.lang.String __call793_2(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call793_3(java.lang.StringBuilder a0) throws Throwable;
private static native boolean __call793_4(java.lang.String a0) throws Throwable;
private static native int __integerCategory793_5(boolean value) throws Throwable;
private static native int __call793_6(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.String __call793_7() throws Throwable;
private static native java.lang.StringBuilder __call793_8(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar793_9(java.lang.StringBuilder a0) throws Throwable;
private static native moom.M4[] __call793_10() throws Throwable;
private static native java.util.List __call793_11(moom.M4[] a0) throws Throwable;
private static native java.util.Iterator __call793_12(java.util.ArrayList a0) throws Throwable;
private static native boolean __call793_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call793_14(java.util.Iterator a0) throws Throwable;
private static native moom.M4 __cast793_15(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call793_16(moom.M4 a0) throws Throwable;
private static native boolean __call793_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory793_18(boolean value) throws Throwable;
private static native java.lang.String __call793_19(moom.M4 a0) throws Throwable;
private static native java.lang.StringBuilder __call793_20(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call793_21(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __call793_22(java.util.Iterator a0) throws Throwable;
private static native java.lang.Exception __call3079300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3079301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3079302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3079303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3079304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3079305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3079306_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3079307_0(java.io.IOException a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.MW.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6338_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2973;
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
            throw new RuntimeException("moom/MW", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.String b(java.lang.String p0) throws java.io.IOException { return __sourceHandlerCall_cabec90e440d1daf5afe(p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6340_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(java.lang.String p0) throws java.io.IOException { return __sourceHandlerCall_446916d88ad9c3c9bb43(p0); }


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
        byte[] spill3179_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3179_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3179_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3179_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3179_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3179_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static java.io.InputStream a(java.io.InputStream p0, java.lang.String p1) throws java.io.IOException { return __sourceHandlerCall_9ec13ce8f4adac6c30b0(p0, p1); }


private static java.util.List<moom.M7> a() { return __sourceHandlerCall_427d6fe22997eafe230e(); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13226);
    if (((moom.MW.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.MW.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.MW.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/MW", life9_51);
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
        life9_116 = ((java.lang.String)((moom.MW.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.MW.c)[life5_8] = moom.MW.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.MW.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.MW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6340_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6338_0() throws E;
}
