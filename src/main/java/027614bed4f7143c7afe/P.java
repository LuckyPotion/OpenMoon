package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class P extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oN {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.P c;

private static com.google.protobuf.Parser<com.moon.P> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private P(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private P() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(5045327614218876897L)), ((long)(3052707286012798324L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(22689934501618L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.P.e ^ 110101004297605L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill13_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill13_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill13_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill13_14 = new byte[8];
    (__sourceSpill13_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill13_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation13_16 = __sourceSpill13_14;
    ((javax.crypto.Cipher)(__sourceSpill13_11)).init(((int)(__sourceSpill13_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill13_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation13_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "òD?t^²Ö\025 \026(\035qÝú^\017)5Lðè:"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill13_25 = local6_life21;
        int __sourceSpill13_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill13_25)).substring(((int)(__sourceSpill13_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill13_30 = local8_life19;
        int __sourceSpill13_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill13_33 = new byte[8];
        (__sourceSpill13_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill13_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill13_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill13_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill13_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill13_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill13_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill13_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill13_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill13_34)).doFinal(((byte[])(__sourceSpill13_33)));
        (__sourceSpill13_30)[__sourceSpill13_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "÷fÿû{\"W\fõØ=Ý\fV{"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill13_38 = local6_life21;
        int __sourceSpill13_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill13_38)).substring(((int)(__sourceSpill13_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill13_43 = local8_life19;
        int __sourceSpill13_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill13_46 = new byte[8];
        (__sourceSpill13_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill13_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill13_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill13_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill13_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill13_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill13_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill13_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill13_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill13_47)).doFinal(((byte[])(__sourceSpill13_46)));
        (__sourceSpill13_43)[__sourceSpill13_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.P)(new com.moon.P()));
    d = ((com.google.protobuf.Parser)(new com.moon.n()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_e5ae6050b275e01bac9f(com.moon.P a0) throws E;
private static final class __SourceHandler_e5ae6050b275e01bac9f {

public static com.google.protobuf.ByteString f106(com.moon.P receiver) throws Throwable {
    java.lang.Object forwardValue106_24_0;
    java.lang.String[] spill106_0;
    java.lang.Object spill106_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead106_0() ^ 105502578944800L);
    spill106_0 = __call106_1();
    life4_7 = __fieldRead106_2(receiver);
    life3_8 = spill106_0;
    spill106_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue106_24_0 = spill106_1;
        break forward_join_24;
    }
    if (!((__instanceOf106_3(spill106_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call106_5(__cast106_4(life4_7));
    __fieldWrite106_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue106_24_0 = life4_7;
    }
    return __cast106_7(forwardValue106_24_0);
}
public static void h106_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010600_0(p0);
}
private static native long __fieldRead106_0() throws Throwable;
private static native java.lang.String[] __call106_1() throws Throwable;
private static native java.lang.Object __fieldRead106_2(com.moon.P a0) throws Throwable;
private static native int __instanceOf106_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast106_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call106_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite106_6(com.moon.P a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast106_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1010600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_22476b70226d987487ae(com.moon.P a0) throws E;
private static final class __SourceHandler_22476b70226d987487ae {

public static java.lang.String f107(com.moon.P receiver) throws Throwable {
    java.lang.Object forwardValue107_18_0;
    java.lang.String[] spill107_0;
    java.lang.Object spill107_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead107_0() ^ 57714263813334L);
    spill107_0 = __call107_1();
    life4_7 = __fieldRead107_2(receiver);
    life3_8 = spill107_0;
    spill107_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue107_18_0 = spill107_1;
        break forward_join_18;
    }
    if (!((__instanceOf107_3(spill107_1) != 0))) {
        break forward_join_17;
    }
    return __cast107_4(life4_7);
    }
    forwardValue107_18_0 = life4_7;
    }
    life5_24 = __cast107_5(forwardValue107_18_0);
    life6_27 = __call107_6(life5_24);
    __fieldWrite107_7(receiver, life6_27);
    return life6_27;
}
public static void h107_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010700_0(p0);
}
public static void h107_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010701_0(p0);
}
private static native long __fieldRead107_0() throws Throwable;
private static native java.lang.String[] __call107_1() throws Throwable;
private static native java.lang.Object __fieldRead107_2(com.moon.P a0) throws Throwable;
private static native int __instanceOf107_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast107_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast107_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call107_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite107_7(com.moon.P a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1010700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ar __sourceHandlerCall_087db016f364b8faaf9d(com.moon.P a0) throws E;
private static final class __SourceHandler_087db016f364b8faaf9d {

public static com.moon.ar f126(com.moon.P receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead126_0() ^ 14487682750635L);
    return ((receiver == __fieldRead126_1()) ? new com.moon.ar() : __call126_2(new com.moon.ar(), receiver));
}
public static void h126_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1012600_0(p0);
}
private static native long __fieldRead126_0() throws Throwable;
private static native com.moon.P __fieldRead126_1() throws Throwable;
private static native com.moon.ar __call126_2(com.moon.ar a0, com.moon.P a1) throws Throwable;
private static native java.lang.Exception __call1012600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f0137d4ec2ec51ed4c35(com.moon.P a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_f0137d4ec2ec51ed4c35 {

public static boolean f108(com.moon.P receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue108_14_0;
    java.lang.Object forwardValue108_23_0;
    int forwardValue108_40_0;
    int forwardValue108_46_0;
    java.lang.Object spill108_0;
    boolean spill108_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.P life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead108_0() ^ 123023905730814L);
    life4_5 = __call108_1();
    spill108_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue108_14_0 = spill108_0;
        break forward_join_14;
    }
    if (!((spill108_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory108_2(1);
    }
    forwardValue108_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue108_23_0 = forwardValue108_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf108_3(forwardValue108_14_0) == 0))) {
        break forward_join_22;
    }
    return __call108_4(receiver, p0);
    }
    forwardValue108_23_0 = p0;
    }
    life5_34 = __cast108_5(forwardValue108_23_0);
    spill108_1 = __call108_8(__call108_6(receiver), __call108_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue108_40_0 = __integerCategory108_9(spill108_1);
        break forward_join_40;
    }
    if (!((!spill108_1))) {
        break forward_join_35;
    }
    return __integerCategory108_10(0);
    }
    forwardValue108_40_0 = __integerCategory108_14(__call108_13(__call108_11(receiver), __call108_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue108_46_0 = forwardValue108_40_0;
        break forward_join_46;
    }
    if (!((forwardValue108_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory108_15(0);
    }
    forwardValue108_46_0 = 1;
    }
    return __integerCategory108_16(forwardValue108_46_0);
}
public static void h108_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010800_0(p0);
}
public static void h108_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010801_0(p0);
}
public static void h108_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010802_0(p0);
}
public static void h108_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010803_0(p0);
}
public static void h108_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010804_0(p0);
}
public static void h108_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010805_0(p0);
}
public static void h108_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010806_0(p0);
}
public static void h108_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010807_0(p0);
}
private static native long __fieldRead108_0() throws Throwable;
private static native java.lang.String[] __call108_1() throws Throwable;
private static native boolean __integerCategory108_2(int value) throws Throwable;
private static native int __instanceOf108_3(java.lang.Object a0) throws Throwable;
private static native boolean __call108_4(com.moon.P a0, java.lang.Object a1) throws Throwable;
private static native com.moon.P __cast108_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call108_6(com.moon.P a0) throws Throwable;
private static native java.lang.String __call108_7(com.moon.P a0) throws Throwable;
private static native boolean __call108_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory108_9(boolean value) throws Throwable;
private static native boolean __integerCategory108_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call108_11(com.moon.P a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call108_12(com.moon.P a0) throws Throwable;
private static native boolean __call108_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory108_14(boolean value) throws Throwable;
private static native boolean __integerCategory108_15(int value) throws Throwable;
private static native boolean __integerCategory108_16(int value) throws Throwable;
private static native java.lang.Exception __call1010800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010805_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010806_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010807_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_76982054c4e5b7e04503(com.moon.P a0) throws E;
private static final class __SourceHandler_76982054c4e5b7e04503 {

public static int f109(com.moon.P receiver) throws Throwable {
    int forwardValue109_21_0;
    int forwardValue109_41_0;
    java.lang.String[] spill109_0;
    int spill109_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead109_0() ^ 7761460761089L);
    spill109_0 = __call109_1();
    life4_7 = __fieldRead109_2(receiver);
    life3_8 = spill109_0;
    spill109_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue109_21_0 = spill109_1;
        break forward_join_21;
    }
    if (!((spill109_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue109_21_0 = __integerCategory109_5(__call109_4(__fieldRead109_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue109_41_0 = forwardValue109_21_0;
        break forward_join_41;
    }
    if (!((forwardValue109_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call109_7(1, __fieldRead109_6(receiver)));
    }
    life4_44 = (life4_7 + __call109_9(__call109_8(receiver)));
    __fieldWrite109_10(receiver, life4_44);
    forwardValue109_41_0 = life4_44;
    }
    return forwardValue109_41_0;
}
public static void h109_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010900_0(p0);
}
public static void h109_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010901_0(p0);
}
public static void h109_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010902_0(p0);
}
private static native long __fieldRead109_0() throws Throwable;
private static native java.lang.String[] __call109_1() throws Throwable;
private static native int __fieldRead109_2(com.moon.P a0) throws Throwable;
private static native java.lang.Object __fieldRead109_3(com.moon.P a0) throws Throwable;
private static native boolean __call109_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory109_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead109_6(com.moon.P a0) throws Throwable;
private static native int __call109_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call109_8(com.moon.P a0) throws Throwable;
private static native int __call109_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite109_10(com.moon.P a0, int a1) throws Throwable;
private static native java.lang.Exception __call1010900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010902_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_d1195a259e82520b3b21(com.moon.P a0) throws E;
private static final class __SourceHandler_d1195a259e82520b3b21 {

public static int f110(com.moon.P receiver) throws Throwable {
    int forwardValue110_19_0;
    int spill110_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead110_0() ^ 12719822763880L);
    life3_5 = __call110_1();
    spill110_0 = __fieldRead110_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue110_19_0 = spill110_0;
        break forward_join_19;
    }
    if (!((spill110_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead110_3(receiver);
    }
    forwardValue110_19_0 = __invokedynamic110_4(8072, (4352900379715107643L ^ life1_3));
    }
    life4_24 = forwardValue110_19_0;
    life4_35 = ((__invokedynamic110_5(6030, (1762546656154874681L ^ life1_3)) * life4_24) + __call110_7(__call110_6()));
    life4_45 = ((__invokedynamic110_8(13030, (5277786115164886611L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic110_9(824, (5624376861639665550L ^ life1_3)) * life4_45) + __call110_11(__call110_10(receiver)));
    life4_69 = ((__invokedynamic110_12(17066, (4696022023683974686L ^ life1_3)) * life4_57) + __call110_14(__call110_13(receiver)));
    __fieldWrite110_15(receiver, life4_69);
    return life4_69;
}
public static void h110_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011000_0(p0);
}
public static void h110_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011001_0(p0);
}
private static native long __fieldRead110_0() throws Throwable;
private static native java.lang.String[] __call110_1() throws Throwable;
private static native int __fieldRead110_2(com.moon.P a0) throws Throwable;
private static native int __fieldRead110_3(com.moon.P a0) throws Throwable;
private static native int __invokedynamic110_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic110_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call110_6() throws Throwable;
private static native int __call110_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic110_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic110_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call110_10(com.moon.P a0) throws Throwable;
private static native int __call110_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic110_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call110_13(com.moon.P a0) throws Throwable;
private static native int __call110_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite110_15(com.moon.P a0, int a1) throws Throwable;
private static native java.lang.Exception __call1011000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011001_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c51ea19c5a031b9e4f06(com.moon.P a0) throws E;
private static final class __SourceHandler_c51ea19c5a031b9e4f06 {

public static boolean f111(com.moon.P receiver) throws Throwable {
    int forwardValue111_17_0;
    int forwardValue111_26_0;
    java.lang.String[] spill111_0;
    int spill111_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead111_0() ^ 107795805882173L);
    spill111_0 = __call111_1();
    life4_7 = __fieldRead111_2(receiver);
    life3_8 = spill111_0;
    spill111_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue111_17_0 = spill111_1;
        break forward_join_17;
    }
    if (!((spill111_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory111_3(1);
    }
    forwardValue111_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue111_26_0 = forwardValue111_17_0;
        break forward_join_26;
    }
    if (!((forwardValue111_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory111_4(0);
    }
    __fieldWrite111_5(receiver, 1);
    forwardValue111_26_0 = 1;
    }
    return __integerCategory111_6(forwardValue111_26_0);
}
public static void h111_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011100_0(p0);
}
public static void h111_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011101_0(p0);
}
public static void h111_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011102_0(p0);
}
public static void h111_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011103_0(p0);
}
private static native long __fieldRead111_0() throws Throwable;
private static native java.lang.String[] __call111_1() throws Throwable;
private static native byte __fieldRead111_2(com.moon.P a0) throws Throwable;
private static native boolean __integerCategory111_3(int value) throws Throwable;
private static native boolean __integerCategory111_4(int value) throws Throwable;
private static native void __fieldWrite111_5(com.moon.P a0, int a1) throws Throwable;
private static native boolean __integerCategory111_6(int value) throws Throwable;
private static native java.lang.Exception __call1011100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011103_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_13f08ad77081a5aad707(com.moon.P a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_13f08ad77081a5aad707 {

public static void f112(com.moon.P receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.P forwardValue112_18_0;
    com.moon.P spill112_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead112_0() ^ 77632397092989L);
    life4_5 = __call112_1();
    spill112_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue112_18_0 = spill112_0;
        break forward_join_18;
    }
    if (!((!__call112_3(__fieldRead112_2(spill112_0))))) {
        break forward_join_17;
    }
    __call112_5(p0, 1, __fieldRead112_4(receiver));
    }
    forwardValue112_18_0 = receiver;
    }
    __call112_7(__call112_6(forwardValue112_18_0), p0);
    return;
}
public static void h112_0(java.io.IOException p0) throws Throwable {
    throw __call1011200_0(p0);
}
public static void h112_1(java.io.IOException p0) throws Throwable {
    throw __call1011201_0(p0);
}
private static native long __fieldRead112_0() throws Throwable;
private static native java.lang.String[] __call112_1() throws Throwable;
private static native java.lang.Object __fieldRead112_2(com.moon.P a0) throws Throwable;
private static native boolean __call112_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead112_4(com.moon.P a0) throws Throwable;
private static native void __call112_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call112_6(com.moon.P a0) throws Throwable;
private static native void __call112_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1011200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1011201_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_f0137d4ec2ec51ed4c35(this, p0); }


public int hashCode() { return __sourceHandlerCall_d1195a259e82520b3b21(this); }


public com.moon.P b() {
return com.moon.P.c;
}


public static com.moon.ar b__ar() {
return ((com.moon.P)(com.moon.P.c)).c();
}


public static com.moon.P b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.P)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.P.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.P b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.P)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.P.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.ar c() { return __sourceHandlerCall_087db016f364b8faaf9d(this); }


public static com.moon.P a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.P)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.P.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ar a(com.moon.P p0) {
return ((com.moon.ar)(((com.moon.P)(com.moon.P.c)).c())).a(((com.moon.P)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10187;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/P", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.P a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.P)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.P.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.ar a__ar() {
return com.moon.P.b__ar();
}


public static com.google.protobuf.Parser<com.moon.P> a__Parser() {
return com.moon.P.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.P.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.P.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.P a__P() {
return com.moon.P.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral142_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/P"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.ar a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ar local2 = new com.moon.ar(p0);
    return local2;
}


public static com.moon.P a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.P)(((com.google.protobuf.Parser)(com.moon.P.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.P a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.P)(((com.google.protobuf.Parser)(com.moon.P.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.P a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.P)(((com.google.protobuf.Parser)(com.moon.P.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.m;
}


public java.lang.String a__String() { return __sourceHandlerCall_22476b70226d987487ae(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_e5ae6050b275e01bac9f(this); }


public static com.moon.P a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.P)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.P.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.P a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.P)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.P.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.P a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.P)(((com.google.protobuf.Parser)(com.moon.P.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.P a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.P)(((com.google.protobuf.Parser)(com.moon.P.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.P a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.P)(((com.google.protobuf.Parser)(com.moon.P.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.P();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_13f08ad77081a5aad707(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_c51ea19c5a031b9e4f06(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.n)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.P.class)), ((java.lang.Class)(com.moon.ar.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.P)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.P)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.P)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.P)(this)).b();
}


public com.google.protobuf.Parser<com.moon.P> getParserForType() {
return com.moon.P.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_76982054c4e5b7e04503(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.P)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.P)(this)).a__ar();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.P)(this)).a__ar();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral142_0() throws E;
}
