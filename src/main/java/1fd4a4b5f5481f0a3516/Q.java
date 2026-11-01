package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class Q extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oO {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.Q c;

private static com.google.protobuf.Parser<com.moon.Q> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private Q(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private Q() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-605812706104834019L)), ((long)(-686154262885614868L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114672798638179L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.Q.e ^ 45310414226561L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill14_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill14_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill14_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill14_14 = new byte[8];
    (__sourceSpill14_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill14_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation14_16 = __sourceSpill14_14;
    ((javax.crypto.Cipher)(__sourceSpill14_11)).init(((int)(__sourceSpill14_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill14_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation14_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Õ3âÉÎäÙ\023¤\032×Ýr\033\fª\036\020Q\b"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill14_25 = local6_life21;
        int __sourceSpill14_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill14_25)).substring(((int)(__sourceSpill14_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill14_30 = local8_life19;
        int __sourceSpill14_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill14_33 = new byte[8];
        (__sourceSpill14_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill14_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill14_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill14_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill14_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill14_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill14_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill14_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill14_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill14_34)).doFinal(((byte[])(__sourceSpill14_33)));
        (__sourceSpill14_30)[__sourceSpill14_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "<n\0341oÈtø#ÄE\bg¡"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill14_38 = local6_life21;
        int __sourceSpill14_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill14_38)).substring(((int)(__sourceSpill14_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill14_43 = local8_life19;
        int __sourceSpill14_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill14_46 = new byte[8];
        (__sourceSpill14_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill14_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill14_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill14_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill14_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill14_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill14_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill14_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill14_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill14_47)).doFinal(((byte[])(__sourceSpill14_46)));
        (__sourceSpill14_43)[__sourceSpill14_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.Q)(new com.moon.Q()));
    d = ((com.google.protobuf.Parser)(new com.moon.o()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_2f5687bfe35cbd111a6a(com.moon.Q a0) throws E;
private static final class __SourceHandler_2f5687bfe35cbd111a6a {

public static com.google.protobuf.ByteString f113(com.moon.Q receiver) throws Throwable {
    java.lang.Object forwardValue113_24_0;
    java.lang.String[] spill113_0;
    java.lang.Object spill113_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead113_0() ^ 69837325395218L);
    spill113_0 = __call113_1();
    life4_7 = __fieldRead113_2(receiver);
    life3_8 = spill113_0;
    spill113_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue113_24_0 = spill113_1;
        break forward_join_24;
    }
    if (!((__instanceOf113_3(spill113_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call113_5(__cast113_4(life4_7));
    __fieldWrite113_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue113_24_0 = life4_7;
    }
    return __cast113_7(forwardValue113_24_0);
}
public static void h113_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011300_0(p0);
}
private static native long __fieldRead113_0() throws Throwable;
private static native java.lang.String[] __call113_1() throws Throwable;
private static native java.lang.Object __fieldRead113_2(com.moon.Q a0) throws Throwable;
private static native int __instanceOf113_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast113_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call113_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite113_6(com.moon.Q a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast113_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1011300_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_8f9bd038201ea53a0f28(com.moon.Q a0) throws E;
private static final class __SourceHandler_8f9bd038201ea53a0f28 {

public static java.lang.String f114(com.moon.Q receiver) throws Throwable {
    java.lang.Object forwardValue114_18_0;
    java.lang.String[] spill114_0;
    java.lang.Object spill114_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead114_0() ^ 8003650096859L);
    spill114_0 = __call114_1();
    life4_7 = __fieldRead114_2(receiver);
    life3_8 = spill114_0;
    spill114_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue114_18_0 = spill114_1;
        break forward_join_18;
    }
    if (!((__instanceOf114_3(spill114_1) != 0))) {
        break forward_join_17;
    }
    return __cast114_4(life4_7);
    }
    forwardValue114_18_0 = life4_7;
    }
    life5_24 = __cast114_5(forwardValue114_18_0);
    life6_27 = __call114_6(life5_24);
    __fieldWrite114_7(receiver, life6_27);
    return life6_27;
}
public static void h114_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011400_0(p0);
}
public static void h114_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011401_0(p0);
}
private static native long __fieldRead114_0() throws Throwable;
private static native java.lang.String[] __call114_1() throws Throwable;
private static native java.lang.Object __fieldRead114_2(com.moon.Q a0) throws Throwable;
private static native int __instanceOf114_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast114_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast114_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call114_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite114_7(com.moon.Q a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1011400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.as __sourceHandlerCall_3dd3403ce2bd98da22f2(com.moon.Q a0) throws E;
private static final class __SourceHandler_3dd3403ce2bd98da22f2 {

public static com.moon.as f134(com.moon.Q receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead134_0() ^ 70999230226403L);
    return ((receiver == __fieldRead134_1()) ? new com.moon.as() : __call134_2(new com.moon.as(), receiver));
}
public static void h134_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013400_0(p0);
}
private static native long __fieldRead134_0() throws Throwable;
private static native com.moon.Q __fieldRead134_1() throws Throwable;
private static native com.moon.as __call134_2(com.moon.as a0, com.moon.Q a1) throws Throwable;
private static native java.lang.Exception __call1013400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_893348a69d197dbd32d0(com.moon.Q a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_893348a69d197dbd32d0 {

public static boolean f115(com.moon.Q receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue115_14_0;
    java.lang.Object forwardValue115_23_0;
    int forwardValue115_40_0;
    int forwardValue115_46_0;
    java.lang.Object spill115_0;
    boolean spill115_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.Q life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead115_0() ^ 136666211517075L);
    life4_5 = __call115_1();
    spill115_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue115_14_0 = spill115_0;
        break forward_join_14;
    }
    if (!((spill115_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory115_2(1);
    }
    forwardValue115_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue115_23_0 = forwardValue115_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf115_3(forwardValue115_14_0) == 0))) {
        break forward_join_22;
    }
    return __call115_4(receiver, p0);
    }
    forwardValue115_23_0 = p0;
    }
    life5_34 = __cast115_5(forwardValue115_23_0);
    spill115_1 = __call115_8(__call115_6(receiver), __call115_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue115_40_0 = __integerCategory115_9(spill115_1);
        break forward_join_40;
    }
    if (!((!spill115_1))) {
        break forward_join_35;
    }
    return __integerCategory115_10(0);
    }
    forwardValue115_40_0 = __integerCategory115_14(__call115_13(__call115_11(receiver), __call115_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue115_46_0 = forwardValue115_40_0;
        break forward_join_46;
    }
    if (!((forwardValue115_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory115_15(0);
    }
    forwardValue115_46_0 = 1;
    }
    return __integerCategory115_16(forwardValue115_46_0);
}
public static void h115_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011500_0(p0);
}
public static void h115_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011501_0(p0);
}
public static void h115_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011502_0(p0);
}
public static void h115_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011503_0(p0);
}
public static void h115_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011504_0(p0);
}
public static void h115_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011505_0(p0);
}
public static void h115_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011506_0(p0);
}
public static void h115_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011507_0(p0);
}
private static native long __fieldRead115_0() throws Throwable;
private static native java.lang.String[] __call115_1() throws Throwable;
private static native boolean __integerCategory115_2(int value) throws Throwable;
private static native int __instanceOf115_3(java.lang.Object a0) throws Throwable;
private static native boolean __call115_4(com.moon.Q a0, java.lang.Object a1) throws Throwable;
private static native com.moon.Q __cast115_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call115_6(com.moon.Q a0) throws Throwable;
private static native java.lang.String __call115_7(com.moon.Q a0) throws Throwable;
private static native boolean __call115_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory115_9(boolean value) throws Throwable;
private static native boolean __integerCategory115_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call115_11(com.moon.Q a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call115_12(com.moon.Q a0) throws Throwable;
private static native boolean __call115_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory115_14(boolean value) throws Throwable;
private static native boolean __integerCategory115_15(int value) throws Throwable;
private static native boolean __integerCategory115_16(int value) throws Throwable;
private static native java.lang.Exception __call1011500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011503_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011504_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011505_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011506_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011507_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_1789983af53456d1558e(com.moon.Q a0) throws E;
private static final class __SourceHandler_1789983af53456d1558e {

public static int f116(com.moon.Q receiver) throws Throwable {
    int forwardValue116_21_0;
    int forwardValue116_41_0;
    java.lang.String[] spill116_0;
    int spill116_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead116_0() ^ 84781406259581L);
    spill116_0 = __call116_1();
    life4_7 = __fieldRead116_2(receiver);
    life3_8 = spill116_0;
    spill116_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue116_21_0 = spill116_1;
        break forward_join_21;
    }
    if (!((spill116_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue116_21_0 = __integerCategory116_5(__call116_4(__fieldRead116_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue116_41_0 = forwardValue116_21_0;
        break forward_join_41;
    }
    if (!((forwardValue116_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call116_7(1, __fieldRead116_6(receiver)));
    }
    life4_44 = (life4_7 + __call116_9(__call116_8(receiver)));
    __fieldWrite116_10(receiver, life4_44);
    forwardValue116_41_0 = life4_44;
    }
    return forwardValue116_41_0;
}
public static void h116_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011600_0(p0);
}
public static void h116_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011601_0(p0);
}
public static void h116_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011602_0(p0);
}
private static native long __fieldRead116_0() throws Throwable;
private static native java.lang.String[] __call116_1() throws Throwable;
private static native int __fieldRead116_2(com.moon.Q a0) throws Throwable;
private static native java.lang.Object __fieldRead116_3(com.moon.Q a0) throws Throwable;
private static native boolean __call116_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory116_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead116_6(com.moon.Q a0) throws Throwable;
private static native int __call116_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call116_8(com.moon.Q a0) throws Throwable;
private static native int __call116_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite116_10(com.moon.Q a0, int a1) throws Throwable;
private static native java.lang.Exception __call1011600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011602_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_64309e8a4391605dadff(com.moon.Q a0) throws E;
private static final class __SourceHandler_64309e8a4391605dadff {

public static int f117(com.moon.Q receiver) throws Throwable {
    int forwardValue117_19_0;
    int spill117_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead117_0() ^ 33889991048261L);
    life3_5 = __call117_1();
    spill117_0 = __fieldRead117_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue117_19_0 = spill117_0;
        break forward_join_19;
    }
    if (!((spill117_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead117_3(receiver);
    }
    forwardValue117_19_0 = __invokedynamic117_4(24642, (2379101991169042733L ^ life1_3));
    }
    life4_24 = forwardValue117_19_0;
    life4_35 = ((__invokedynamic117_5(21340, (4961192478617934385L ^ life1_3)) * life4_24) + __call117_7(__call117_6()));
    life4_45 = ((__invokedynamic117_8(23371, (1630241657328800288L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic117_9(2640, (8328219060729037630L ^ life1_3)) * life4_45) + __call117_11(__call117_10(receiver)));
    life4_69 = ((__invokedynamic117_12(12919, (2388420436184038171L ^ life1_3)) * life4_57) + __call117_14(__call117_13(receiver)));
    __fieldWrite117_15(receiver, life4_69);
    return life4_69;
}
public static void h117_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011700_0(p0);
}
public static void h117_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011701_0(p0);
}
private static native long __fieldRead117_0() throws Throwable;
private static native java.lang.String[] __call117_1() throws Throwable;
private static native int __fieldRead117_2(com.moon.Q a0) throws Throwable;
private static native int __fieldRead117_3(com.moon.Q a0) throws Throwable;
private static native int __invokedynamic117_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic117_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call117_6() throws Throwable;
private static native int __call117_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic117_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic117_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call117_10(com.moon.Q a0) throws Throwable;
private static native int __call117_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic117_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call117_13(com.moon.Q a0) throws Throwable;
private static native int __call117_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite117_15(com.moon.Q a0, int a1) throws Throwable;
private static native java.lang.Exception __call1011700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a0004b11b97b890708e7(com.moon.Q a0) throws E;
private static final class __SourceHandler_a0004b11b97b890708e7 {

public static boolean f118(com.moon.Q receiver) throws Throwable {
    int forwardValue118_17_0;
    int forwardValue118_26_0;
    java.lang.String[] spill118_0;
    int spill118_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead118_0() ^ 96959301927432L);
    spill118_0 = __call118_1();
    life4_7 = __fieldRead118_2(receiver);
    life3_8 = spill118_0;
    spill118_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue118_17_0 = spill118_1;
        break forward_join_17;
    }
    if (!((spill118_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory118_3(1);
    }
    forwardValue118_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue118_26_0 = forwardValue118_17_0;
        break forward_join_26;
    }
    if (!((forwardValue118_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory118_4(0);
    }
    __fieldWrite118_5(receiver, 1);
    forwardValue118_26_0 = 1;
    }
    return __integerCategory118_6(forwardValue118_26_0);
}
public static void h118_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011800_0(p0);
}
public static void h118_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011801_0(p0);
}
public static void h118_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011802_0(p0);
}
public static void h118_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011803_0(p0);
}
private static native long __fieldRead118_0() throws Throwable;
private static native java.lang.String[] __call118_1() throws Throwable;
private static native byte __fieldRead118_2(com.moon.Q a0) throws Throwable;
private static native boolean __integerCategory118_3(int value) throws Throwable;
private static native boolean __integerCategory118_4(int value) throws Throwable;
private static native void __fieldWrite118_5(com.moon.Q a0, int a1) throws Throwable;
private static native boolean __integerCategory118_6(int value) throws Throwable;
private static native java.lang.Exception __call1011800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1011803_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0aa42321e811d496a1f9(com.moon.Q a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_0aa42321e811d496a1f9 {

public static void f119(com.moon.Q receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.Q forwardValue119_18_0;
    com.moon.Q spill119_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead119_0() ^ 116132822012206L);
    life4_5 = __call119_1();
    spill119_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue119_18_0 = spill119_0;
        break forward_join_18;
    }
    if (!((!__call119_3(__fieldRead119_2(spill119_0))))) {
        break forward_join_17;
    }
    __call119_5(p0, 1, __fieldRead119_4(receiver));
    }
    forwardValue119_18_0 = receiver;
    }
    __call119_7(__call119_6(forwardValue119_18_0), p0);
    return;
}
public static void h119_0(java.io.IOException p0) throws Throwable {
    throw __call1011900_0(p0);
}
public static void h119_1(java.io.IOException p0) throws Throwable {
    throw __call1011901_0(p0);
}
private static native long __fieldRead119_0() throws Throwable;
private static native java.lang.String[] __call119_1() throws Throwable;
private static native java.lang.Object __fieldRead119_2(com.moon.Q a0) throws Throwable;
private static native boolean __call119_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead119_4(com.moon.Q a0) throws Throwable;
private static native void __call119_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call119_6(com.moon.Q a0) throws Throwable;
private static native void __call119_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1011900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1011901_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_893348a69d197dbd32d0(this, p0); }


public int hashCode() { return __sourceHandlerCall_64309e8a4391605dadff(this); }


public com.moon.Q b() {
return com.moon.Q.c;
}


public static com.moon.as b__as() {
return ((com.moon.Q)(com.moon.Q.c)).c();
}


public static com.moon.Q b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Q)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.Q.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Q b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.Q)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.Q.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.as c() { return __sourceHandlerCall_3dd3403ce2bd98da22f2(this); }


public static com.moon.Q a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Q)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Q.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.as a(com.moon.Q p0) {
return ((com.moon.as)(((com.moon.Q)(com.moon.Q.c)).c())).a(((com.moon.Q)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27157;
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
            throw new RuntimeException("com/moon/Q", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.Q a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.Q)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Q.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.as a__as() {
return com.moon.Q.b__as();
}


public static com.google.protobuf.Parser<com.moon.Q> a__Parser() {
return com.moon.Q.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.Q.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.Q.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.Q a__Q() {
return com.moon.Q.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral151_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/Q"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.as a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.as local2 = new com.moon.as(p0);
    return local2;
}


public static com.moon.Q a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Q)(((com.google.protobuf.Parser)(com.moon.Q.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.Q a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Q)(((com.google.protobuf.Parser)(com.moon.Q.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Q a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Q)(((com.google.protobuf.Parser)(com.moon.Q.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.s;
}


public java.lang.String a__String() { return __sourceHandlerCall_8f9bd038201ea53a0f28(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_2f5687bfe35cbd111a6a(this); }


public static com.moon.Q a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Q)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Q.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Q a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.Q)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Q.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.Q a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Q)(((com.google.protobuf.Parser)(com.moon.Q.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Q a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Q)(((com.google.protobuf.Parser)(com.moon.Q.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.Q a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Q)(((com.google.protobuf.Parser)(com.moon.Q.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.Q();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_0aa42321e811d496a1f9(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_a0004b11b97b890708e7(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.t)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.Q.class)), ((java.lang.Class)(com.moon.as.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.Q)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.Q)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.Q)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.Q)(this)).b();
}


public com.google.protobuf.Parser<com.moon.Q> getParserForType() {
return com.moon.Q.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_1789983af53456d1558e(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.Q)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.Q)(this)).a__as();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.Q)(this)).a__as();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral151_0() throws E;
}
