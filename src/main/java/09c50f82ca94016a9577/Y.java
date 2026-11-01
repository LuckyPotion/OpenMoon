package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class Y extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oW {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.Y c;

private static com.google.protobuf.Parser<com.moon.Y> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private Y(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private Y() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2674045949951781272L)), ((long)(2063523189483060768L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37141564399873L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.Y.e ^ 80502941245311L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill22_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill22_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill22_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill22_14 = new byte[8];
    (__sourceSpill22_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill22_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation22_16 = __sourceSpill22_14;
    ((javax.crypto.Cipher)(__sourceSpill22_11)).init(((int)(__sourceSpill22_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill22_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation22_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ä\037lmPlÀçuï<?{/5\rÒ\"~A"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill22_25 = local6_life21;
        int __sourceSpill22_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill22_25)).substring(((int)(__sourceSpill22_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill22_30 = local8_life19;
        int __sourceSpill22_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill22_33 = new byte[8];
        (__sourceSpill22_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill22_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill22_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill22_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill22_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill22_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill22_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill22_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill22_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill22_34)).doFinal(((byte[])(__sourceSpill22_33)));
        (__sourceSpill22_30)[__sourceSpill22_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "uh\021»\000Md\034\024iã÷ã"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill22_38 = local6_life21;
        int __sourceSpill22_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill22_38)).substring(((int)(__sourceSpill22_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill22_43 = local8_life19;
        int __sourceSpill22_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill22_46 = new byte[8];
        (__sourceSpill22_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill22_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill22_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill22_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill22_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill22_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill22_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill22_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill22_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill22_47)).doFinal(((byte[])(__sourceSpill22_46)));
        (__sourceSpill22_43)[__sourceSpill22_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.Y)(new com.moon.Y()));
    d = ((com.google.protobuf.Parser)(new com.moon.w()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_c1dd07d88ae3a3741716(com.moon.Y a0) throws E;
private static final class __SourceHandler_c1dd07d88ae3a3741716 {

public static com.google.protobuf.ByteString f175(com.moon.Y receiver) throws Throwable {
    java.lang.Object forwardValue175_24_0;
    java.lang.String[] spill175_0;
    java.lang.Object spill175_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead175_0() ^ 128664457450682L);
    spill175_0 = __call175_1();
    life4_7 = __fieldRead175_2(receiver);
    life3_8 = spill175_0;
    spill175_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue175_24_0 = spill175_1;
        break forward_join_24;
    }
    if (!((__instanceOf175_3(spill175_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call175_5(__cast175_4(life4_7));
    __fieldWrite175_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue175_24_0 = life4_7;
    }
    return __cast175_7(forwardValue175_24_0);
}
public static void h175_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017500_0(p0);
}
private static native long __fieldRead175_0() throws Throwable;
private static native java.lang.String[] __call175_1() throws Throwable;
private static native java.lang.Object __fieldRead175_2(com.moon.Y a0) throws Throwable;
private static native int __instanceOf175_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast175_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call175_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite175_6(com.moon.Y a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast175_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1017500_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_5566c9041b98d9d630c2(com.moon.Y a0) throws E;
private static final class __SourceHandler_5566c9041b98d9d630c2 {

public static java.lang.String f176(com.moon.Y receiver) throws Throwable {
    java.lang.Object forwardValue176_18_0;
    java.lang.String[] spill176_0;
    java.lang.Object spill176_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead176_0() ^ 54079062360681L);
    spill176_0 = __call176_1();
    life4_7 = __fieldRead176_2(receiver);
    life3_8 = spill176_0;
    spill176_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue176_18_0 = spill176_1;
        break forward_join_18;
    }
    if (!((__instanceOf176_3(spill176_1) != 0))) {
        break forward_join_17;
    }
    return __cast176_4(life4_7);
    }
    forwardValue176_18_0 = life4_7;
    }
    life5_24 = __cast176_5(forwardValue176_18_0);
    life6_27 = __call176_6(life5_24);
    __fieldWrite176_7(receiver, life6_27);
    return life6_27;
}
public static void h176_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017600_0(p0);
}
public static void h176_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017601_0(p0);
}
private static native long __fieldRead176_0() throws Throwable;
private static native java.lang.String[] __call176_1() throws Throwable;
private static native java.lang.Object __fieldRead176_2(com.moon.Y a0) throws Throwable;
private static native int __instanceOf176_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast176_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast176_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call176_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite176_7(com.moon.Y a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1017600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aA __sourceHandlerCall_f7e90496840113b57428(com.moon.Y a0) throws E;
private static final class __SourceHandler_f7e90496840113b57428 {

public static com.moon.aA f204(com.moon.Y receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead204_0() ^ 37098924574537L);
    return ((receiver == __fieldRead204_1()) ? new com.moon.aA() : __call204_2(new com.moon.aA(), receiver));
}
public static void h204_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1020400_0(p0);
}
private static native long __fieldRead204_0() throws Throwable;
private static native com.moon.Y __fieldRead204_1() throws Throwable;
private static native com.moon.aA __call204_2(com.moon.aA a0, com.moon.Y a1) throws Throwable;
private static native java.lang.Exception __call1020400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_51a21aa07edda1eb4559(com.moon.Y a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_51a21aa07edda1eb4559 {

public static boolean f177(com.moon.Y receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue177_14_0;
    java.lang.Object forwardValue177_23_0;
    int forwardValue177_40_0;
    int forwardValue177_46_0;
    java.lang.Object spill177_0;
    boolean spill177_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.Y life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead177_0() ^ 65074211131898L);
    life4_5 = __call177_1();
    spill177_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue177_14_0 = spill177_0;
        break forward_join_14;
    }
    if (!((spill177_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory177_2(1);
    }
    forwardValue177_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue177_23_0 = forwardValue177_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf177_3(forwardValue177_14_0) == 0))) {
        break forward_join_22;
    }
    return __call177_4(receiver, p0);
    }
    forwardValue177_23_0 = p0;
    }
    life5_34 = __cast177_5(forwardValue177_23_0);
    spill177_1 = __call177_8(__call177_6(receiver), __call177_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue177_40_0 = __integerCategory177_9(spill177_1);
        break forward_join_40;
    }
    if (!((!spill177_1))) {
        break forward_join_35;
    }
    return __integerCategory177_10(0);
    }
    forwardValue177_40_0 = __integerCategory177_14(__call177_13(__call177_11(receiver), __call177_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue177_46_0 = forwardValue177_40_0;
        break forward_join_46;
    }
    if (!((forwardValue177_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory177_15(0);
    }
    forwardValue177_46_0 = 1;
    }
    return __integerCategory177_16(forwardValue177_46_0);
}
public static void h177_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017700_0(p0);
}
public static void h177_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017701_0(p0);
}
public static void h177_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017702_0(p0);
}
public static void h177_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017703_0(p0);
}
public static void h177_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017704_0(p0);
}
public static void h177_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017705_0(p0);
}
public static void h177_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017706_0(p0);
}
public static void h177_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017707_0(p0);
}
private static native long __fieldRead177_0() throws Throwable;
private static native java.lang.String[] __call177_1() throws Throwable;
private static native boolean __integerCategory177_2(int value) throws Throwable;
private static native int __instanceOf177_3(java.lang.Object a0) throws Throwable;
private static native boolean __call177_4(com.moon.Y a0, java.lang.Object a1) throws Throwable;
private static native com.moon.Y __cast177_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call177_6(com.moon.Y a0) throws Throwable;
private static native java.lang.String __call177_7(com.moon.Y a0) throws Throwable;
private static native boolean __call177_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory177_9(boolean value) throws Throwable;
private static native boolean __integerCategory177_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call177_11(com.moon.Y a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call177_12(com.moon.Y a0) throws Throwable;
private static native boolean __call177_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory177_14(boolean value) throws Throwable;
private static native boolean __integerCategory177_15(int value) throws Throwable;
private static native boolean __integerCategory177_16(int value) throws Throwable;
private static native java.lang.Exception __call1017700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017703_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017704_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017705_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017706_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017707_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_fe4d1002cff48cde576a(com.moon.Y a0) throws E;
private static final class __SourceHandler_fe4d1002cff48cde576a {

public static int f178(com.moon.Y receiver) throws Throwable {
    int forwardValue178_21_0;
    int forwardValue178_41_0;
    java.lang.String[] spill178_0;
    int spill178_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead178_0() ^ 50207301893040L);
    spill178_0 = __call178_1();
    life4_7 = __fieldRead178_2(receiver);
    life3_8 = spill178_0;
    spill178_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue178_21_0 = spill178_1;
        break forward_join_21;
    }
    if (!((spill178_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue178_21_0 = __integerCategory178_5(__call178_4(__fieldRead178_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue178_41_0 = forwardValue178_21_0;
        break forward_join_41;
    }
    if (!((forwardValue178_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call178_7(1, __fieldRead178_6(receiver)));
    }
    life4_44 = (life4_7 + __call178_9(__call178_8(receiver)));
    __fieldWrite178_10(receiver, life4_44);
    forwardValue178_41_0 = life4_44;
    }
    return forwardValue178_41_0;
}
public static void h178_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017800_0(p0);
}
public static void h178_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017801_0(p0);
}
public static void h178_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017802_0(p0);
}
private static native long __fieldRead178_0() throws Throwable;
private static native java.lang.String[] __call178_1() throws Throwable;
private static native int __fieldRead178_2(com.moon.Y a0) throws Throwable;
private static native java.lang.Object __fieldRead178_3(com.moon.Y a0) throws Throwable;
private static native boolean __call178_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory178_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead178_6(com.moon.Y a0) throws Throwable;
private static native int __call178_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call178_8(com.moon.Y a0) throws Throwable;
private static native int __call178_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite178_10(com.moon.Y a0, int a1) throws Throwable;
private static native java.lang.Exception __call1017800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017802_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_316a7f5fe4c5e89e8326(com.moon.Y a0) throws E;
private static final class __SourceHandler_316a7f5fe4c5e89e8326 {

public static int f179(com.moon.Y receiver) throws Throwable {
    int forwardValue179_19_0;
    int spill179_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead179_0() ^ 101563157036930L);
    life3_5 = __call179_1();
    spill179_0 = __fieldRead179_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue179_19_0 = spill179_0;
        break forward_join_19;
    }
    if (!((spill179_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead179_3(receiver);
    }
    forwardValue179_19_0 = __invokedynamic179_4(5376, (536789651533129684L ^ life1_3));
    }
    life4_24 = forwardValue179_19_0;
    life4_35 = ((__invokedynamic179_5(20861, (8744688890900292526L ^ life1_3)) * life4_24) + __call179_7(__call179_6()));
    life4_45 = ((__invokedynamic179_8(27009, (9207885530755144531L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic179_9(2054, (7381489683043482326L ^ life1_3)) * life4_45) + __call179_11(__call179_10(receiver)));
    life4_69 = ((__invokedynamic179_12(14626, (1814388554853600243L ^ life1_3)) * life4_57) + __call179_14(__call179_13(receiver)));
    __fieldWrite179_15(receiver, life4_69);
    return life4_69;
}
public static void h179_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017900_0(p0);
}
public static void h179_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017901_0(p0);
}
private static native long __fieldRead179_0() throws Throwable;
private static native java.lang.String[] __call179_1() throws Throwable;
private static native int __fieldRead179_2(com.moon.Y a0) throws Throwable;
private static native int __fieldRead179_3(com.moon.Y a0) throws Throwable;
private static native int __invokedynamic179_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic179_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call179_6() throws Throwable;
private static native int __call179_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic179_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic179_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call179_10(com.moon.Y a0) throws Throwable;
private static native int __call179_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic179_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call179_13(com.moon.Y a0) throws Throwable;
private static native int __call179_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite179_15(com.moon.Y a0, int a1) throws Throwable;
private static native java.lang.Exception __call1017900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1017901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9c9d18d09b33df63ed1c(com.moon.Y a0) throws E;
private static final class __SourceHandler_9c9d18d09b33df63ed1c {

public static boolean f180(com.moon.Y receiver) throws Throwable {
    int forwardValue180_17_0;
    int forwardValue180_26_0;
    java.lang.String[] spill180_0;
    int spill180_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead180_0() ^ 36051821886200L);
    spill180_0 = __call180_1();
    life4_7 = __fieldRead180_2(receiver);
    life3_8 = spill180_0;
    spill180_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue180_17_0 = spill180_1;
        break forward_join_17;
    }
    if (!((spill180_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory180_3(1);
    }
    forwardValue180_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue180_26_0 = forwardValue180_17_0;
        break forward_join_26;
    }
    if (!((forwardValue180_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory180_4(0);
    }
    __fieldWrite180_5(receiver, 1);
    forwardValue180_26_0 = 1;
    }
    return __integerCategory180_6(forwardValue180_26_0);
}
public static void h180_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1018000_0(p0);
}
public static void h180_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1018001_0(p0);
}
public static void h180_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1018002_0(p0);
}
public static void h180_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1018003_0(p0);
}
private static native long __fieldRead180_0() throws Throwable;
private static native java.lang.String[] __call180_1() throws Throwable;
private static native byte __fieldRead180_2(com.moon.Y a0) throws Throwable;
private static native boolean __integerCategory180_3(int value) throws Throwable;
private static native boolean __integerCategory180_4(int value) throws Throwable;
private static native void __fieldWrite180_5(com.moon.Y a0, int a1) throws Throwable;
private static native boolean __integerCategory180_6(int value) throws Throwable;
private static native java.lang.Exception __call1018000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1018001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1018002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1018003_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f563795c4514d93cadc4(com.moon.Y a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_f563795c4514d93cadc4 {

public static void f181(com.moon.Y receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.Y forwardValue181_18_0;
    com.moon.Y spill181_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead181_0() ^ 133124905001708L);
    life4_5 = __call181_1();
    spill181_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue181_18_0 = spill181_0;
        break forward_join_18;
    }
    if (!((!__call181_3(__fieldRead181_2(spill181_0))))) {
        break forward_join_17;
    }
    __call181_5(p0, 1, __fieldRead181_4(receiver));
    }
    forwardValue181_18_0 = receiver;
    }
    __call181_7(__call181_6(forwardValue181_18_0), p0);
    return;
}
public static void h181_0(java.io.IOException p0) throws Throwable {
    throw __call1018100_0(p0);
}
public static void h181_1(java.io.IOException p0) throws Throwable {
    throw __call1018101_0(p0);
}
private static native long __fieldRead181_0() throws Throwable;
private static native java.lang.String[] __call181_1() throws Throwable;
private static native java.lang.Object __fieldRead181_2(com.moon.Y a0) throws Throwable;
private static native boolean __call181_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead181_4(com.moon.Y a0) throws Throwable;
private static native void __call181_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call181_6(com.moon.Y a0) throws Throwable;
private static native void __call181_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1018100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1018101_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_51a21aa07edda1eb4559(this, p0); }


public int hashCode() { return __sourceHandlerCall_316a7f5fe4c5e89e8326(this); }


public com.moon.Y b() {
return com.moon.Y.c;
}


public static com.moon.aA b__aA() {
return ((com.moon.Y)(com.moon.Y.c)).c();
}


public static com.moon.Y b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Y)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.Y.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Y b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.Y)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.Y.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.aA c() { return __sourceHandlerCall_f7e90496840113b57428(this); }


public static com.moon.Y a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Y)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Y.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aA a(com.moon.Y p0) {
return ((com.moon.aA)(((com.moon.Y)(com.moon.Y.c)).c())).a(((com.moon.Y)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32733;
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
            throw new RuntimeException("com/moon/Y", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.Y a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.Y)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Y.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.aA a__aA() {
return com.moon.Y.b__aA();
}


public static com.google.protobuf.Parser<com.moon.Y> a__Parser() {
return com.moon.Y.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.Y.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.Y.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.Y a__Y() {
return com.moon.Y.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral229_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/Y"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.aA a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aA local2 = new com.moon.aA(p0);
    return local2;
}


public static com.moon.Y a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Y)(((com.google.protobuf.Parser)(com.moon.Y.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.Y a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Y)(((com.google.protobuf.Parser)(com.moon.Y.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Y a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Y)(((com.google.protobuf.Parser)(com.moon.Y.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o3.e;
}


public java.lang.String a__String() { return __sourceHandlerCall_5566c9041b98d9d630c2(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_c1dd07d88ae3a3741716(this); }


public static com.moon.Y a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.Y)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Y.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Y a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.Y)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.Y.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.Y a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Y)(((com.google.protobuf.Parser)(com.moon.Y.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.Y a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Y)(((com.google.protobuf.Parser)(com.moon.Y.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.Y a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.Y)(((com.google.protobuf.Parser)(com.moon.Y.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.Y();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_f563795c4514d93cadc4(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_9c9d18d09b33df63ed1c(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o3.f)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.Y.class)), ((java.lang.Class)(com.moon.aA.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.Y)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.Y)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.Y)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.Y)(this)).b();
}


public com.google.protobuf.Parser<com.moon.Y> getParserForType() {
return com.moon.Y.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_fe4d1002cff48cde576a(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.Y)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.Y)(this)).a__aA();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.Y)(this)).a__aA();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral229_0() throws E;
}
