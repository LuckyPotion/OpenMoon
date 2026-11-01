package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class T extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oR {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private volatile java.lang.Object b;

private byte c;

private static com.moon.T d;

private static com.google.protobuf.Parser<com.moon.T> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private T(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private T() {
super();
    this.c = -1;
    this.a = "";
    this.b = "";
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-7766576648450158796L)), ((long)(5317327543068291945L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(142736126567689L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.T.f ^ 116504728577315L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill17_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill17_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill17_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill17_14 = new byte[8];
    (__sourceSpill17_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill17_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation17_16 = __sourceSpill17_14;
    ((javax.crypto.Cipher)(__sourceSpill17_11)).init(((int)(__sourceSpill17_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill17_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation17_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "n+6e\027{ÌË^·Y{ã0ÿµ¡4þû¦H*?>!iÕ¤CÅ]È\027JpÜ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill17_25 = local6_life21;
        int __sourceSpill17_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill17_25)).substring(((int)(__sourceSpill17_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill17_30 = local8_life19;
        int __sourceSpill17_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill17_33 = new byte[8];
        (__sourceSpill17_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill17_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill17_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill17_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill17_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill17_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill17_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill17_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill17_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill17_34)).doFinal(((byte[])(__sourceSpill17_33)));
        (__sourceSpill17_30)[__sourceSpill17_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÝS¾Î&\tÀÊm\177-T*ù"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill17_38 = local6_life21;
        int __sourceSpill17_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill17_38)).substring(((int)(__sourceSpill17_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill17_43 = local8_life19;
        int __sourceSpill17_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill17_46 = new byte[8];
        (__sourceSpill17_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill17_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill17_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill17_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill17_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill17_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill17_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill17_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill17_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill17_47)).doFinal(((byte[])(__sourceSpill17_46)));
        (__sourceSpill17_43)[__sourceSpill17_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.T)(new com.moon.T()));
    e = ((com.google.protobuf.Parser)(new com.moon.r()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_66ece795ce825d2b83f5(com.moon.T a0) throws E;
private static final class __SourceHandler_66ece795ce825d2b83f5 {

public static com.google.protobuf.ByteString f135(com.moon.T receiver) throws Throwable {
    java.lang.Object forwardValue135_24_0;
    java.lang.String[] spill135_0;
    java.lang.Object spill135_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead135_0() ^ 39133365611392L);
    spill135_0 = __call135_1();
    life4_7 = __fieldRead135_2(receiver);
    life3_8 = spill135_0;
    spill135_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue135_24_0 = spill135_1;
        break forward_join_24;
    }
    if (!((__instanceOf135_3(spill135_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call135_5(__cast135_4(life4_7));
    __fieldWrite135_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue135_24_0 = life4_7;
    }
    return __cast135_7(forwardValue135_24_0);
}
public static void h135_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013500_0(p0);
}
private static native long __fieldRead135_0() throws Throwable;
private static native java.lang.String[] __call135_1() throws Throwable;
private static native java.lang.Object __fieldRead135_2(com.moon.T a0) throws Throwable;
private static native int __instanceOf135_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast135_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call135_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite135_6(com.moon.T a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast135_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1013500_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_3cc4b2e75a4a2cf3d215(com.moon.T a0) throws E;
private static final class __SourceHandler_3cc4b2e75a4a2cf3d215 {

public static java.lang.String f136(com.moon.T receiver) throws Throwable {
    java.lang.Object forwardValue136_18_0;
    java.lang.String[] spill136_0;
    java.lang.Object spill136_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead136_0() ^ 34066626428893L);
    spill136_0 = __call136_1();
    life4_7 = __fieldRead136_2(receiver);
    life3_8 = spill136_0;
    spill136_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue136_18_0 = spill136_1;
        break forward_join_18;
    }
    if (!((__instanceOf136_3(spill136_1) != 0))) {
        break forward_join_17;
    }
    return __cast136_4(life4_7);
    }
    forwardValue136_18_0 = life4_7;
    }
    life5_24 = __cast136_5(forwardValue136_18_0);
    life6_27 = __call136_6(life5_24);
    __fieldWrite136_7(receiver, life6_27);
    return life6_27;
}
public static void h136_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013600_0(p0);
}
public static void h136_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013601_0(p0);
}
private static native long __fieldRead136_0() throws Throwable;
private static native java.lang.String[] __call136_1() throws Throwable;
private static native java.lang.Object __fieldRead136_2(com.moon.T a0) throws Throwable;
private static native int __instanceOf136_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast136_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast136_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call136_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite136_7(com.moon.T a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1013600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_b8cad218e3d287bf5b70(com.moon.T a0) throws E;
private static final class __SourceHandler_b8cad218e3d287bf5b70 {

public static com.google.protobuf.ByteString f137(com.moon.T receiver) throws Throwable {
    java.lang.Object forwardValue137_24_0;
    java.lang.String[] spill137_0;
    java.lang.Object spill137_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead137_0() ^ 94462651432209L);
    spill137_0 = __call137_1();
    life4_7 = __fieldRead137_2(receiver);
    life3_8 = spill137_0;
    spill137_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue137_24_0 = spill137_1;
        break forward_join_24;
    }
    if (!((__instanceOf137_3(spill137_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call137_5(__cast137_4(life4_7));
    __fieldWrite137_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue137_24_0 = life4_7;
    }
    return __cast137_7(forwardValue137_24_0);
}
public static void h137_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013700_0(p0);
}
private static native long __fieldRead137_0() throws Throwable;
private static native java.lang.String[] __call137_1() throws Throwable;
private static native java.lang.Object __fieldRead137_2(com.moon.T a0) throws Throwable;
private static native int __instanceOf137_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast137_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call137_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite137_6(com.moon.T a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast137_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1013700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_fc202f1b8c7e02f37088(com.moon.T a0) throws E;
private static final class __SourceHandler_fc202f1b8c7e02f37088 {

public static java.lang.String f138(com.moon.T receiver) throws Throwable {
    java.lang.Object forwardValue138_18_0;
    java.lang.String[] spill138_0;
    java.lang.Object spill138_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead138_0() ^ 68169774385119L);
    spill138_0 = __call138_1();
    life4_7 = __fieldRead138_2(receiver);
    life3_8 = spill138_0;
    spill138_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue138_18_0 = spill138_1;
        break forward_join_18;
    }
    if (!((__instanceOf138_3(spill138_1) != 0))) {
        break forward_join_17;
    }
    return __cast138_4(life4_7);
    }
    forwardValue138_18_0 = life4_7;
    }
    life5_24 = __cast138_5(forwardValue138_18_0);
    life6_27 = __call138_6(life5_24);
    __fieldWrite138_7(receiver, life6_27);
    return life6_27;
}
public static void h138_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013800_0(p0);
}
public static void h138_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013801_0(p0);
}
private static native long __fieldRead138_0() throws Throwable;
private static native java.lang.String[] __call138_1() throws Throwable;
private static native java.lang.Object __fieldRead138_2(com.moon.T a0) throws Throwable;
private static native int __instanceOf138_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast138_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast138_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call138_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite138_7(com.moon.T a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1013800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.av __sourceHandlerCall_1074043071199cc795a6(com.moon.T a0) throws E;
private static final class __SourceHandler_1074043071199cc795a6 {

public static com.moon.av f161(com.moon.T receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead161_0() ^ 21315858453637L);
    return ((receiver == __fieldRead161_1()) ? new com.moon.av() : __call161_2(new com.moon.av(), receiver));
}
public static void h161_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1016100_0(p0);
}
private static native long __fieldRead161_0() throws Throwable;
private static native com.moon.T __fieldRead161_1() throws Throwable;
private static native com.moon.av __call161_2(com.moon.av a0, com.moon.T a1) throws Throwable;
private static native java.lang.Exception __call1016100_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ca4178701251f1964a4a(com.moon.T a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_ca4178701251f1964a4a {

public static boolean f139(com.moon.T receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue139_14_0;
    java.lang.Object forwardValue139_23_0;
    int forwardValue139_40_0;
    int forwardValue139_50_0;
    int forwardValue139_56_0;
    java.lang.Object spill139_0;
    boolean spill139_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.T life5_34;
    forward_join_56: {
    forward_join_55: {
    forward_join_50: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead139_0() ^ 50827157808374L);
    life4_5 = __call139_1();
    spill139_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue139_14_0 = spill139_0;
        break forward_join_14;
    }
    if (!((spill139_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory139_2(1);
    }
    forwardValue139_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue139_23_0 = forwardValue139_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf139_3(forwardValue139_14_0) == 0))) {
        break forward_join_22;
    }
    return __call139_4(receiver, p0);
    }
    forwardValue139_23_0 = p0;
    }
    life5_34 = __cast139_5(forwardValue139_23_0);
    spill139_1 = __call139_8(__call139_6(receiver), __call139_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue139_40_0 = __integerCategory139_9(spill139_1);
        break forward_join_40;
    }
    if (!((!spill139_1))) {
        break forward_join_35;
    }
    return __integerCategory139_10(0);
    }
    forwardValue139_40_0 = __integerCategory139_14(__call139_13(__call139_11(receiver), __call139_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue139_50_0 = forwardValue139_40_0;
        break forward_join_50;
    }
    if (!((forwardValue139_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory139_15(0);
    }
    forwardValue139_50_0 = __integerCategory139_19(__call139_18(__call139_16(receiver), __call139_17(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue139_56_0 = forwardValue139_50_0;
        break forward_join_56;
    }
    if (!((forwardValue139_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory139_20(0);
    }
    forwardValue139_56_0 = 1;
    }
    return __integerCategory139_21(forwardValue139_56_0);
}
public static void h139_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013900_0(p0);
}
public static void h139_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013901_0(p0);
}
public static void h139_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013902_0(p0);
}
public static void h139_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013903_0(p0);
}
public static void h139_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013904_0(p0);
}
public static void h139_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013905_0(p0);
}
public static void h139_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013906_0(p0);
}
public static void h139_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013907_0(p0);
}
public static void h139_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013908_0(p0);
}
public static void h139_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013909_0(p0);
}
private static native long __fieldRead139_0() throws Throwable;
private static native java.lang.String[] __call139_1() throws Throwable;
private static native boolean __integerCategory139_2(int value) throws Throwable;
private static native int __instanceOf139_3(java.lang.Object a0) throws Throwable;
private static native boolean __call139_4(com.moon.T a0, java.lang.Object a1) throws Throwable;
private static native com.moon.T __cast139_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call139_6(com.moon.T a0) throws Throwable;
private static native java.lang.String __call139_7(com.moon.T a0) throws Throwable;
private static native boolean __call139_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory139_9(boolean value) throws Throwable;
private static native boolean __integerCategory139_10(int value) throws Throwable;
private static native java.lang.String __call139_11(com.moon.T a0) throws Throwable;
private static native java.lang.String __call139_12(com.moon.T a0) throws Throwable;
private static native boolean __call139_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory139_14(boolean value) throws Throwable;
private static native boolean __integerCategory139_15(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call139_16(com.moon.T a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call139_17(com.moon.T a0) throws Throwable;
private static native boolean __call139_18(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory139_19(boolean value) throws Throwable;
private static native boolean __integerCategory139_20(int value) throws Throwable;
private static native boolean __integerCategory139_21(int value) throws Throwable;
private static native java.lang.Exception __call1013900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013906_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013907_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013908_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013909_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_5516ee0e2bff4ca61d9c(com.moon.T a0) throws E;
private static final class __SourceHandler_5516ee0e2bff4ca61d9c {

public static int f140(com.moon.T receiver) throws Throwable {
    int forwardValue140_21_0;
    int forwardValue140_34_0;
    int forwardValue140_54_0;
    java.lang.String[] spill140_0;
    int spill140_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_60;
    forward_join_54: {
    forward_join_44: {
    forward_join_34: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead140_0() ^ 19484807786997L);
    spill140_0 = __call140_1();
    life4_7 = __fieldRead140_2(receiver);
    life3_8 = spill140_0;
    spill140_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue140_21_0 = spill140_1;
        break forward_join_21;
    }
    if (!((spill140_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue140_21_0 = __integerCategory140_5(__call140_4(__fieldRead140_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue140_34_0 = forwardValue140_21_0;
        break forward_join_34;
    }
    if (!((forwardValue140_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call140_7(1, __fieldRead140_6(receiver)));
    }
    forwardValue140_34_0 = __integerCategory140_10(__call140_9(__fieldRead140_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue140_54_0 = forwardValue140_34_0;
        break forward_join_54;
    }
    if (!((forwardValue140_34_0 == 0))) {
        break forward_join_44;
    }
    life4_7 = (life4_7 + __call140_12(2, __fieldRead140_11(receiver)));
    }
    life4_60 = (life4_7 + __call140_14(__call140_13(receiver)));
    __fieldWrite140_15(receiver, life4_60);
    forwardValue140_54_0 = life4_60;
    }
    return forwardValue140_54_0;
}
public static void h140_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014000_0(p0);
}
public static void h140_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014001_0(p0);
}
public static void h140_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014002_0(p0);
}
public static void h140_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014003_0(p0);
}
private static native long __fieldRead140_0() throws Throwable;
private static native java.lang.String[] __call140_1() throws Throwable;
private static native int __fieldRead140_2(com.moon.T a0) throws Throwable;
private static native java.lang.Object __fieldRead140_3(com.moon.T a0) throws Throwable;
private static native boolean __call140_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory140_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead140_6(com.moon.T a0) throws Throwable;
private static native int __call140_7(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead140_8(com.moon.T a0) throws Throwable;
private static native boolean __call140_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory140_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead140_11(com.moon.T a0) throws Throwable;
private static native int __call140_12(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call140_13(com.moon.T a0) throws Throwable;
private static native int __call140_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite140_15(com.moon.T a0, int a1) throws Throwable;
private static native java.lang.Exception __call1014000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014003_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_5ee136c58ce19048e2c9(com.moon.T a0) throws E;
private static final class __SourceHandler_5ee136c58ce19048e2c9 {

public static int f141(com.moon.T receiver) throws Throwable {
    int forwardValue141_19_0;
    int spill141_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_67;
    int life4_79;
    int life4_91;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead141_0() ^ 31263964517071L);
    life3_5 = __call141_1();
    spill141_0 = __fieldRead141_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue141_19_0 = spill141_0;
        break forward_join_19;
    }
    if (!((spill141_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead141_3(receiver);
    }
    forwardValue141_19_0 = __invokedynamic141_4(11528, (113994654034975036L ^ life1_3));
    }
    life4_24 = forwardValue141_19_0;
    life4_35 = ((__invokedynamic141_5(29444, (3175450181727586100L ^ life1_3)) * life4_24) + __call141_7(__call141_6()));
    life4_45 = ((__invokedynamic141_8(13028, (3742085036545197781L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic141_9(7619, (4786863363715787249L ^ life1_3)) * life4_45) + __call141_11(__call141_10(receiver)));
    life4_67 = ((__invokedynamic141_12(24256, (6128138528399043315L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic141_13(28769, (7518993717640332374L ^ life1_3)) * life4_67) + __call141_15(__call141_14(receiver)));
    life4_91 = ((__invokedynamic141_16(82, (7051497735809102948L ^ life1_3)) * life4_79) + __call141_18(__call141_17(receiver)));
    __fieldWrite141_19(receiver, life4_91);
    return life4_91;
}
public static void h141_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014100_0(p0);
}
public static void h141_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014101_0(p0);
}
private static native long __fieldRead141_0() throws Throwable;
private static native java.lang.String[] __call141_1() throws Throwable;
private static native int __fieldRead141_2(com.moon.T a0) throws Throwable;
private static native int __fieldRead141_3(com.moon.T a0) throws Throwable;
private static native int __invokedynamic141_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic141_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call141_6() throws Throwable;
private static native int __call141_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic141_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic141_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call141_10(com.moon.T a0) throws Throwable;
private static native int __call141_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic141_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic141_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call141_14(com.moon.T a0) throws Throwable;
private static native int __call141_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic141_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call141_17(com.moon.T a0) throws Throwable;
private static native int __call141_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite141_19(com.moon.T a0, int a1) throws Throwable;
private static native java.lang.Exception __call1014100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c8de9ca63a517d741549(com.moon.T a0) throws E;
private static final class __SourceHandler_c8de9ca63a517d741549 {

public static boolean f142(com.moon.T receiver) throws Throwable {
    int forwardValue142_17_0;
    int forwardValue142_26_0;
    java.lang.String[] spill142_0;
    int spill142_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead142_0() ^ 57751620271408L);
    spill142_0 = __call142_1();
    life4_7 = __fieldRead142_2(receiver);
    life3_8 = spill142_0;
    spill142_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue142_17_0 = spill142_1;
        break forward_join_17;
    }
    if (!((spill142_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory142_3(1);
    }
    forwardValue142_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue142_26_0 = forwardValue142_17_0;
        break forward_join_26;
    }
    if (!((forwardValue142_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory142_4(0);
    }
    __fieldWrite142_5(receiver, 1);
    forwardValue142_26_0 = 1;
    }
    return __integerCategory142_6(forwardValue142_26_0);
}
public static void h142_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014200_0(p0);
}
public static void h142_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014201_0(p0);
}
public static void h142_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014202_0(p0);
}
public static void h142_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014203_0(p0);
}
private static native long __fieldRead142_0() throws Throwable;
private static native java.lang.String[] __call142_1() throws Throwable;
private static native byte __fieldRead142_2(com.moon.T a0) throws Throwable;
private static native boolean __integerCategory142_3(int value) throws Throwable;
private static native boolean __integerCategory142_4(int value) throws Throwable;
private static native void __fieldWrite142_5(com.moon.T a0, int a1) throws Throwable;
private static native boolean __integerCategory142_6(int value) throws Throwable;
private static native java.lang.Exception __call1014200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014203_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_96984f11ac31e99ca632(com.moon.T a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_96984f11ac31e99ca632 {

public static void f143(com.moon.T receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue143_22_0;
    com.moon.T forwardValue143_29_0;
    boolean spill143_0;
    com.moon.T spill143_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (__fieldRead143_0() ^ 11659434025499L);
    life4_5 = __call143_1();
    spill143_0 = __call143_3(__fieldRead143_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue143_22_0 = __integerCategory143_4(spill143_0);
        break forward_join_22;
    }
    if (!((!spill143_0))) {
        break forward_join_17;
    }
    __call143_6(p0, 1, __fieldRead143_5(receiver));
    }
    spill143_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue143_29_0 = spill143_1;
        break forward_join_29;
    }
    forwardValue143_22_0 = __integerCategory143_9(__call143_8(__fieldRead143_7(spill143_1)));
    }
    if (!((forwardValue143_22_0 == 0))) {
        break forward_join_28;
    }
    __call143_11(p0, 2, __fieldRead143_10(receiver));
    }
    forwardValue143_29_0 = receiver;
    }
    __call143_13(__call143_12(forwardValue143_29_0), p0);
    return;
}
public static void h143_0(java.io.IOException p0) throws Throwable {
    throw __call1014300_0(p0);
}
public static void h143_1(java.io.IOException p0) throws Throwable {
    throw __call1014301_0(p0);
}
public static void h143_2(java.io.IOException p0) throws Throwable {
    throw __call1014302_0(p0);
}
public static void h143_3(java.io.IOException p0) throws Throwable {
    throw __call1014303_0(p0);
}
private static native long __fieldRead143_0() throws Throwable;
private static native java.lang.String[] __call143_1() throws Throwable;
private static native java.lang.Object __fieldRead143_2(com.moon.T a0) throws Throwable;
private static native boolean __call143_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory143_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead143_5(com.moon.T a0) throws Throwable;
private static native void __call143_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead143_7(com.moon.T a0) throws Throwable;
private static native boolean __call143_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory143_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead143_10(com.moon.T a0) throws Throwable;
private static native void __call143_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call143_12(com.moon.T a0) throws Throwable;
private static native void __call143_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1014300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1014301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1014302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1014303_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_ca4178701251f1964a4a(this, p0); }


public int hashCode() { return __sourceHandlerCall_5ee136c58ce19048e2c9(this); }


public static com.moon.T b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.T)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.T.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.T b__T() {
return com.moon.T.d;
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_b8cad218e3d287bf5b70(this); }


public static com.moon.T b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.T)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.T.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.av b__av() {
return ((com.moon.T)(com.moon.T.d)).c();
}


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.T.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public java.lang.String b__String() { return __sourceHandlerCall_fc202f1b8c7e02f37088(this); }


public com.moon.av c() { return __sourceHandlerCall_1074043071199cc795a6(this); }


public static com.moon.T a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.T)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.T.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.av a__av() {
return com.moon.T.b__av();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.T.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.T a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.T)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.T.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral181_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/T"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.google.protobuf.Parser<com.moon.T> a__Parser() {
return com.moon.T.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24449;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/T", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public static com.moon.T a__T() {
return com.moon.T.d;
}


protected com.moon.av a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.av local2 = new com.moon.av(p0);
    return local2;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.T.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static com.moon.av a(com.moon.T p0) {
return ((com.moon.av)(((com.moon.T)(com.moon.T.d)).c())).a(((com.moon.T)(p0)));
}


public static com.moon.T a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.T)(((com.google.protobuf.Parser)(com.moon.T.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.T a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.T)(((com.google.protobuf.Parser)(com.moon.T.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.T a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.T)(((com.google.protobuf.Parser)(com.moon.T.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.i;
}


public java.lang.String a__String() { return __sourceHandlerCall_3cc4b2e75a4a2cf3d215(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_66ece795ce825d2b83f5(this); }


public static com.moon.T a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.T)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.T.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.T a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.T)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.T.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.T a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.T)(((com.google.protobuf.Parser)(com.moon.T.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.T a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.T)(((com.google.protobuf.Parser)(com.moon.T.e)).parseFrom(((byte[])(p0)))));
}


public static com.moon.T a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.T)(((com.google.protobuf.Parser)(com.moon.T.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.T();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_96984f11ac31e99ca632(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_c8de9ca63a517d741549(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.j)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.T.class)), ((java.lang.Class)(com.moon.av.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.T)(this)).c();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.T)(this)).c();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.T)(this)).b__T();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.T)(this)).b__T();
}


public com.google.protobuf.Parser<com.moon.T> getParserForType() {
return com.moon.T.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_5516ee0e2bff4ca61d9c(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.T)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.T)(this)).a__av();
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.T)(this)).a__av();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral181_0() throws E;
}
