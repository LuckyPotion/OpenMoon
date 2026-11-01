package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class F extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oB {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private volatile java.lang.Object b;

private byte c;

private static com.moon.F d;

private static com.google.protobuf.Parser<com.moon.F> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private F(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private F() {
super();
    this.c = -1;
    this.a = "";
    this.b = "";
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-4951888272827337131L)), ((long)(-7551347243518776300L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215407293250851L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.F.f ^ 114944303546283L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill3_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill3_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill3_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill3_14 = new byte[8];
    (__sourceSpill3_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill3_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation3_16 = __sourceSpill3_14;
    ((javax.crypto.Cipher)(__sourceSpill3_11)).init(((int)(__sourceSpill3_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill3_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation3_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "n7¸mÈ|\007iº:]zÞíÓé?À¼à¡G 4FÁgäf¿IPgxa)"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill3_25 = local6_life21;
        int __sourceSpill3_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill3_25)).substring(((int)(__sourceSpill3_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill3_30 = local8_life19;
        int __sourceSpill3_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill3_33 = new byte[8];
        (__sourceSpill3_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill3_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill3_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill3_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill3_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill3_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill3_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill3_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill3_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill3_34)).doFinal(((byte[])(__sourceSpill3_33)));
        (__sourceSpill3_30)[__sourceSpill3_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\000Ô¤høyiô3ËÐ{û¸"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill3_38 = local6_life21;
        int __sourceSpill3_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill3_38)).substring(((int)(__sourceSpill3_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill3_43 = local8_life19;
        int __sourceSpill3_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill3_46 = new byte[8];
        (__sourceSpill3_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill3_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill3_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill3_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill3_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill3_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill3_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill3_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill3_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill3_47)).doFinal(((byte[])(__sourceSpill3_46)));
        (__sourceSpill3_43)[__sourceSpill3_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.F)(new com.moon.F()));
    e = ((com.google.protobuf.Parser)(new com.moon.d()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_b75d4fcd4fd9eb57dca7(com.moon.F a0) throws E;
private static final class __SourceHandler_b75d4fcd4fd9eb57dca7 {

public static com.google.protobuf.ByteString f28(com.moon.F receiver) throws Throwable {
    java.lang.Object forwardValue28_24_0;
    java.lang.String[] spill28_0;
    java.lang.Object spill28_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead28_0() ^ 58450111168065L);
    spill28_0 = __call28_1();
    life4_7 = __fieldRead28_2(receiver);
    life3_8 = spill28_0;
    spill28_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue28_24_0 = spill28_1;
        break forward_join_24;
    }
    if (!((__instanceOf28_3(spill28_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call28_5(__cast28_4(life4_7));
    __fieldWrite28_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue28_24_0 = life4_7;
    }
    return __cast28_7(forwardValue28_24_0);
}
public static void h28_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1002800_0(p0);
}
private static native long __fieldRead28_0() throws Throwable;
private static native java.lang.String[] __call28_1() throws Throwable;
private static native java.lang.Object __fieldRead28_2(com.moon.F a0) throws Throwable;
private static native int __instanceOf28_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast28_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call28_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite28_6(com.moon.F a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast28_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1002800_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_134670046f6907b56a15(com.moon.F a0) throws E;
private static final class __SourceHandler_134670046f6907b56a15 {

public static java.lang.String f29(com.moon.F receiver) throws Throwable {
    java.lang.Object forwardValue29_18_0;
    java.lang.String[] spill29_0;
    java.lang.Object spill29_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead29_0() ^ 53726225580769L);
    spill29_0 = __call29_1();
    life4_7 = __fieldRead29_2(receiver);
    life3_8 = spill29_0;
    spill29_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue29_18_0 = spill29_1;
        break forward_join_18;
    }
    if (!((__instanceOf29_3(spill29_1) != 0))) {
        break forward_join_17;
    }
    return __cast29_4(life4_7);
    }
    forwardValue29_18_0 = life4_7;
    }
    life5_24 = __cast29_5(forwardValue29_18_0);
    life6_27 = __call29_6(life5_24);
    __fieldWrite29_7(receiver, life6_27);
    return life6_27;
}
public static void h29_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1002900_0(p0);
}
public static void h29_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1002901_0(p0);
}
private static native long __fieldRead29_0() throws Throwable;
private static native java.lang.String[] __call29_1() throws Throwable;
private static native java.lang.Object __fieldRead29_2(com.moon.F a0) throws Throwable;
private static native int __instanceOf29_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast29_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast29_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call29_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite29_7(com.moon.F a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1002900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1002901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_afe809e410afb7aec97c(com.moon.F a0) throws E;
private static final class __SourceHandler_afe809e410afb7aec97c {

public static com.google.protobuf.ByteString f30(com.moon.F receiver) throws Throwable {
    java.lang.Object forwardValue30_24_0;
    java.lang.String[] spill30_0;
    java.lang.Object spill30_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead30_0() ^ 31569648212380L);
    spill30_0 = __call30_1();
    life4_7 = __fieldRead30_2(receiver);
    life3_8 = spill30_0;
    spill30_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue30_24_0 = spill30_1;
        break forward_join_24;
    }
    if (!((__instanceOf30_3(spill30_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call30_5(__cast30_4(life4_7));
    __fieldWrite30_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue30_24_0 = life4_7;
    }
    return __cast30_7(forwardValue30_24_0);
}
public static void h30_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003000_0(p0);
}
private static native long __fieldRead30_0() throws Throwable;
private static native java.lang.String[] __call30_1() throws Throwable;
private static native java.lang.Object __fieldRead30_2(com.moon.F a0) throws Throwable;
private static native int __instanceOf30_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast30_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call30_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite30_6(com.moon.F a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast30_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1003000_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_ae01ffb2ce7b020027ee(com.moon.F a0) throws E;
private static final class __SourceHandler_ae01ffb2ce7b020027ee {

public static java.lang.String f31(com.moon.F receiver) throws Throwable {
    java.lang.Object forwardValue31_18_0;
    java.lang.String[] spill31_0;
    java.lang.Object spill31_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead31_0() ^ 22115460796847L);
    spill31_0 = __call31_1();
    life4_7 = __fieldRead31_2(receiver);
    life3_8 = spill31_0;
    spill31_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue31_18_0 = spill31_1;
        break forward_join_18;
    }
    if (!((__instanceOf31_3(spill31_1) != 0))) {
        break forward_join_17;
    }
    return __cast31_4(life4_7);
    }
    forwardValue31_18_0 = life4_7;
    }
    life5_24 = __cast31_5(forwardValue31_18_0);
    life6_27 = __call31_6(life5_24);
    __fieldWrite31_7(receiver, life6_27);
    return life6_27;
}
public static void h31_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003100_0(p0);
}
public static void h31_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003101_0(p0);
}
private static native long __fieldRead31_0() throws Throwable;
private static native java.lang.String[] __call31_1() throws Throwable;
private static native java.lang.Object __fieldRead31_2(com.moon.F a0) throws Throwable;
private static native int __instanceOf31_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast31_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast31_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call31_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite31_7(com.moon.F a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1003100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ah __sourceHandlerCall_c137317cba97ed11eb03(com.moon.F a0) throws E;
private static final class __SourceHandler_c137317cba97ed11eb03 {

public static com.moon.ah f37(com.moon.F receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead37_0() ^ 56573264283524L);
    return ((receiver == __fieldRead37_1()) ? new com.moon.ah() : __call37_2(new com.moon.ah(), receiver));
}
public static void h37_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003700_0(p0);
}
private static native long __fieldRead37_0() throws Throwable;
private static native com.moon.F __fieldRead37_1() throws Throwable;
private static native com.moon.ah __call37_2(com.moon.ah a0, com.moon.F a1) throws Throwable;
private static native java.lang.Exception __call1003700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_16d93a04f871ad4e055d(com.moon.F a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_16d93a04f871ad4e055d {

public static boolean f32(com.moon.F receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue32_14_0;
    java.lang.Object forwardValue32_23_0;
    int forwardValue32_40_0;
    int forwardValue32_50_0;
    int forwardValue32_56_0;
    java.lang.Object spill32_0;
    boolean spill32_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.F life5_34;
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
    life2_3 = (__fieldRead32_0() ^ 27293970976629L);
    life4_5 = __call32_1();
    spill32_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue32_14_0 = spill32_0;
        break forward_join_14;
    }
    if (!((spill32_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory32_2(1);
    }
    forwardValue32_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue32_23_0 = forwardValue32_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf32_3(forwardValue32_14_0) == 0))) {
        break forward_join_22;
    }
    return __call32_4(receiver, p0);
    }
    forwardValue32_23_0 = p0;
    }
    life5_34 = __cast32_5(forwardValue32_23_0);
    spill32_1 = __call32_8(__call32_6(receiver), __call32_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue32_40_0 = __integerCategory32_9(spill32_1);
        break forward_join_40;
    }
    if (!((!spill32_1))) {
        break forward_join_35;
    }
    return __integerCategory32_10(0);
    }
    forwardValue32_40_0 = __integerCategory32_14(__call32_13(__call32_11(receiver), __call32_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue32_50_0 = forwardValue32_40_0;
        break forward_join_50;
    }
    if (!((forwardValue32_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory32_15(0);
    }
    forwardValue32_50_0 = __integerCategory32_19(__call32_18(__call32_16(receiver), __call32_17(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue32_56_0 = forwardValue32_50_0;
        break forward_join_56;
    }
    if (!((forwardValue32_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory32_20(0);
    }
    forwardValue32_56_0 = 1;
    }
    return __integerCategory32_21(forwardValue32_56_0);
}
public static void h32_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003200_0(p0);
}
public static void h32_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003201_0(p0);
}
public static void h32_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003202_0(p0);
}
public static void h32_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003203_0(p0);
}
public static void h32_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003204_0(p0);
}
public static void h32_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003205_0(p0);
}
public static void h32_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003206_0(p0);
}
public static void h32_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003207_0(p0);
}
public static void h32_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003208_0(p0);
}
public static void h32_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003209_0(p0);
}
private static native long __fieldRead32_0() throws Throwable;
private static native java.lang.String[] __call32_1() throws Throwable;
private static native boolean __integerCategory32_2(int value) throws Throwable;
private static native int __instanceOf32_3(java.lang.Object a0) throws Throwable;
private static native boolean __call32_4(com.moon.F a0, java.lang.Object a1) throws Throwable;
private static native com.moon.F __cast32_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call32_6(com.moon.F a0) throws Throwable;
private static native java.lang.String __call32_7(com.moon.F a0) throws Throwable;
private static native boolean __call32_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory32_9(boolean value) throws Throwable;
private static native boolean __integerCategory32_10(int value) throws Throwable;
private static native java.lang.String __call32_11(com.moon.F a0) throws Throwable;
private static native java.lang.String __call32_12(com.moon.F a0) throws Throwable;
private static native boolean __call32_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory32_14(boolean value) throws Throwable;
private static native boolean __integerCategory32_15(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call32_16(com.moon.F a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call32_17(com.moon.F a0) throws Throwable;
private static native boolean __call32_18(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory32_19(boolean value) throws Throwable;
private static native boolean __integerCategory32_20(int value) throws Throwable;
private static native boolean __integerCategory32_21(int value) throws Throwable;
private static native java.lang.Exception __call1003200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003208_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003209_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_046c3dd1657fc89bf117(com.moon.F a0) throws E;
private static final class __SourceHandler_046c3dd1657fc89bf117 {

public static int f33(com.moon.F receiver) throws Throwable {
    int forwardValue33_21_0;
    int forwardValue33_34_0;
    int forwardValue33_54_0;
    java.lang.String[] spill33_0;
    int spill33_1;
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
    life1_3 = (__fieldRead33_0() ^ 59605481067042L);
    spill33_0 = __call33_1();
    life4_7 = __fieldRead33_2(receiver);
    life3_8 = spill33_0;
    spill33_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue33_21_0 = spill33_1;
        break forward_join_21;
    }
    if (!((spill33_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue33_21_0 = __integerCategory33_5(__call33_4(__fieldRead33_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue33_34_0 = forwardValue33_21_0;
        break forward_join_34;
    }
    if (!((forwardValue33_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call33_7(1, __fieldRead33_6(receiver)));
    }
    forwardValue33_34_0 = __integerCategory33_10(__call33_9(__fieldRead33_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue33_54_0 = forwardValue33_34_0;
        break forward_join_54;
    }
    if (!((forwardValue33_34_0 == 0))) {
        break forward_join_44;
    }
    life4_7 = (life4_7 + __call33_12(2, __fieldRead33_11(receiver)));
    }
    life4_60 = (life4_7 + __call33_14(__call33_13(receiver)));
    __fieldWrite33_15(receiver, life4_60);
    forwardValue33_54_0 = life4_60;
    }
    return forwardValue33_54_0;
}
public static void h33_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003300_0(p0);
}
public static void h33_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003301_0(p0);
}
public static void h33_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003302_0(p0);
}
public static void h33_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003303_0(p0);
}
private static native long __fieldRead33_0() throws Throwable;
private static native java.lang.String[] __call33_1() throws Throwable;
private static native int __fieldRead33_2(com.moon.F a0) throws Throwable;
private static native java.lang.Object __fieldRead33_3(com.moon.F a0) throws Throwable;
private static native boolean __call33_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory33_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead33_6(com.moon.F a0) throws Throwable;
private static native int __call33_7(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead33_8(com.moon.F a0) throws Throwable;
private static native boolean __call33_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory33_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead33_11(com.moon.F a0) throws Throwable;
private static native int __call33_12(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call33_13(com.moon.F a0) throws Throwable;
private static native int __call33_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite33_15(com.moon.F a0, int a1) throws Throwable;
private static native java.lang.Exception __call1003300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003303_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_3d513f7bf3a85c980478(com.moon.F a0) throws E;
private static final class __SourceHandler_3d513f7bf3a85c980478 {

public static int f34(com.moon.F receiver) throws Throwable {
    int forwardValue34_19_0;
    int spill34_0;
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
    life1_3 = (__fieldRead34_0() ^ 45933777090583L);
    life3_5 = __call34_1();
    spill34_0 = __fieldRead34_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue34_19_0 = spill34_0;
        break forward_join_19;
    }
    if (!((spill34_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead34_3(receiver);
    }
    forwardValue34_19_0 = __invokedynamic34_4(9820, (1534324958280880239L ^ life1_3));
    }
    life4_24 = forwardValue34_19_0;
    life4_35 = ((__invokedynamic34_5(28311, (3314380757472106656L ^ life1_3)) * life4_24) + __call34_7(__call34_6()));
    life4_45 = ((__invokedynamic34_8(30405, (6644584310392242417L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic34_9(16305, (2906137311285709188L ^ life1_3)) * life4_45) + __call34_11(__call34_10(receiver)));
    life4_67 = ((__invokedynamic34_12(15980, (2825046523589560414L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic34_13(14635, (552168058991873819L ^ life1_3)) * life4_67) + __call34_15(__call34_14(receiver)));
    life4_91 = ((__invokedynamic34_16(24220, (6372212906965887149L ^ life1_3)) * life4_79) + __call34_18(__call34_17(receiver)));
    __fieldWrite34_19(receiver, life4_91);
    return life4_91;
}
public static void h34_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003400_0(p0);
}
public static void h34_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003401_0(p0);
}
private static native long __fieldRead34_0() throws Throwable;
private static native java.lang.String[] __call34_1() throws Throwable;
private static native int __fieldRead34_2(com.moon.F a0) throws Throwable;
private static native int __fieldRead34_3(com.moon.F a0) throws Throwable;
private static native int __invokedynamic34_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call34_6() throws Throwable;
private static native int __call34_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic34_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call34_10(com.moon.F a0) throws Throwable;
private static native int __call34_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic34_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic34_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call34_14(com.moon.F a0) throws Throwable;
private static native int __call34_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic34_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call34_17(com.moon.F a0) throws Throwable;
private static native int __call34_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite34_19(com.moon.F a0, int a1) throws Throwable;
private static native java.lang.Exception __call1003400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7cf2303f9b204f81da00(com.moon.F a0) throws E;
private static final class __SourceHandler_7cf2303f9b204f81da00 {

public static boolean f35(com.moon.F receiver) throws Throwable {
    int forwardValue35_17_0;
    int forwardValue35_26_0;
    java.lang.String[] spill35_0;
    int spill35_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead35_0() ^ 14769018186874L);
    spill35_0 = __call35_1();
    life4_7 = __fieldRead35_2(receiver);
    life3_8 = spill35_0;
    spill35_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue35_17_0 = spill35_1;
        break forward_join_17;
    }
    if (!((spill35_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory35_3(1);
    }
    forwardValue35_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue35_26_0 = forwardValue35_17_0;
        break forward_join_26;
    }
    if (!((forwardValue35_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory35_4(0);
    }
    __fieldWrite35_5(receiver, 1);
    forwardValue35_26_0 = 1;
    }
    return __integerCategory35_6(forwardValue35_26_0);
}
public static void h35_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003500_0(p0);
}
public static void h35_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003501_0(p0);
}
public static void h35_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003502_0(p0);
}
public static void h35_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1003503_0(p0);
}
private static native long __fieldRead35_0() throws Throwable;
private static native java.lang.String[] __call35_1() throws Throwable;
private static native byte __fieldRead35_2(com.moon.F a0) throws Throwable;
private static native boolean __integerCategory35_3(int value) throws Throwable;
private static native boolean __integerCategory35_4(int value) throws Throwable;
private static native void __fieldWrite35_5(com.moon.F a0, int a1) throws Throwable;
private static native boolean __integerCategory35_6(int value) throws Throwable;
private static native java.lang.Exception __call1003500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1003503_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4cec98da501aa21db173(com.moon.F a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_4cec98da501aa21db173 {

public static void f36(com.moon.F receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue36_22_0;
    com.moon.F forwardValue36_29_0;
    boolean spill36_0;
    com.moon.F spill36_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (__fieldRead36_0() ^ 84695833036064L);
    life4_5 = __call36_1();
    spill36_0 = __call36_3(__fieldRead36_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue36_22_0 = __integerCategory36_4(spill36_0);
        break forward_join_22;
    }
    if (!((!spill36_0))) {
        break forward_join_17;
    }
    __call36_6(p0, 1, __fieldRead36_5(receiver));
    }
    spill36_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue36_29_0 = spill36_1;
        break forward_join_29;
    }
    forwardValue36_22_0 = __integerCategory36_9(__call36_8(__fieldRead36_7(spill36_1)));
    }
    if (!((forwardValue36_22_0 == 0))) {
        break forward_join_28;
    }
    __call36_11(p0, 2, __fieldRead36_10(receiver));
    }
    forwardValue36_29_0 = receiver;
    }
    __call36_13(__call36_12(forwardValue36_29_0), p0);
    return;
}
public static void h36_0(java.io.IOException p0) throws Throwable {
    throw __call1003600_0(p0);
}
public static void h36_1(java.io.IOException p0) throws Throwable {
    throw __call1003601_0(p0);
}
public static void h36_2(java.io.IOException p0) throws Throwable {
    throw __call1003602_0(p0);
}
public static void h36_3(java.io.IOException p0) throws Throwable {
    throw __call1003603_0(p0);
}
private static native long __fieldRead36_0() throws Throwable;
private static native java.lang.String[] __call36_1() throws Throwable;
private static native java.lang.Object __fieldRead36_2(com.moon.F a0) throws Throwable;
private static native boolean __call36_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory36_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead36_5(com.moon.F a0) throws Throwable;
private static native void __call36_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead36_7(com.moon.F a0) throws Throwable;
private static native boolean __call36_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory36_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead36_10(com.moon.F a0) throws Throwable;
private static native void __call36_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call36_12(com.moon.F a0) throws Throwable;
private static native void __call36_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1003600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1003601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1003602_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1003603_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_16d93a04f871ad4e055d(this, p0); }


public int hashCode() { return __sourceHandlerCall_3d513f7bf3a85c980478(this); }


public static com.moon.F b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.F)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.F.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.F b__F() {
return com.moon.F.d;
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_afe809e410afb7aec97c(this); }


public static com.moon.F b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.F)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.F.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.ah b__ah() {
return ((com.moon.F)(com.moon.F.d)).c();
}


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.F.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public java.lang.String b__String() { return __sourceHandlerCall_ae01ffb2ce7b020027ee(this); }


public com.moon.ah c() { return __sourceHandlerCall_c137317cba97ed11eb03(this); }


public static com.moon.F a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.F)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.F.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.ah a__ah() {
return com.moon.F.b__ah();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.F.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.F a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.F)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.F.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral43_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/F"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.google.protobuf.Parser<com.moon.F> a__Parser() {
return com.moon.F.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18013;
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
            throw new RuntimeException("com/moon/F", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public static com.moon.F a__F() {
return com.moon.F.d;
}


protected com.moon.ah a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ah local2 = new com.moon.ah(p0);
    return local2;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.F.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static com.moon.ah a(com.moon.F p0) {
return ((com.moon.ah)(((com.moon.F)(com.moon.F.d)).c())).a(((com.moon.F)(p0)));
}


public static com.moon.F a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.F)(((com.google.protobuf.Parser)(com.moon.F.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.F a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.F)(((com.google.protobuf.Parser)(com.moon.F.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.F a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.F)(((com.google.protobuf.Parser)(com.moon.F.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.w;
}


public java.lang.String a__String() { return __sourceHandlerCall_134670046f6907b56a15(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_b75d4fcd4fd9eb57dca7(this); }


public static com.moon.F a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.F)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.F.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.F a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.F)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.F.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.F a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.F)(((com.google.protobuf.Parser)(com.moon.F.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.F a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.F)(((com.google.protobuf.Parser)(com.moon.F.e)).parseFrom(((byte[])(p0)))));
}


public static com.moon.F a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.F)(((com.google.protobuf.Parser)(com.moon.F.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.F();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_4cec98da501aa21db173(this, p0); }


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.F)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.F)(this)).c();
}


public final boolean isInitialized() { return __sourceHandlerCall_7cf2303f9b204f81da00(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.x)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.F.class)), ((java.lang.Class)(com.moon.ah.class)));
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.F)(this)).b__F();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.F)(this)).b__F();
}


public com.google.protobuf.Parser<com.moon.F> getParserForType() {
return com.moon.F.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_046c3dd1657fc89bf117(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.F)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.F)(this)).a__ah();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.F)(this)).a__ah();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral43_0() throws E;
}
