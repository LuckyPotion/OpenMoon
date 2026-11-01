package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class L extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oJ {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private volatile java.lang.Object b;

private byte c;

private static com.moon.L d;

private static com.google.protobuf.Parser<com.moon.L> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private L(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private L() {
super();
    this.c = -1;
    this.a = "";
    this.b = "";
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(6482873959199659961L)), ((long)(-8952220733609522464L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216184842019386L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.L.f ^ 28288942567079L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill9_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill9_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill9_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill9_14 = new byte[8];
    (__sourceSpill9_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill9_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation9_16 = __sourceSpill9_14;
    ((javax.crypto.Cipher)(__sourceSpill9_11)).init(((int)(__sourceSpill9_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill9_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation9_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "°d1©\004àö\007nrjko\025óÃyD,àÚ(::×6X+çÙl}-´!{í"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill9_25 = local6_life21;
        int __sourceSpill9_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill9_25)).substring(((int)(__sourceSpill9_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill9_30 = local8_life19;
        int __sourceSpill9_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill9_33 = new byte[8];
        (__sourceSpill9_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill9_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill9_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill9_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill9_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill9_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill9_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill9_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill9_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill9_34)).doFinal(((byte[])(__sourceSpill9_33)));
        (__sourceSpill9_30)[__sourceSpill9_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\026¸_<éöù,aUÛ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill9_38 = local6_life21;
        int __sourceSpill9_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill9_38)).substring(((int)(__sourceSpill9_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill9_43 = local8_life19;
        int __sourceSpill9_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill9_46 = new byte[8];
        (__sourceSpill9_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill9_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill9_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill9_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill9_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill9_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill9_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill9_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill9_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill9_47)).doFinal(((byte[])(__sourceSpill9_46)));
        (__sourceSpill9_43)[__sourceSpill9_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.L)(new com.moon.L()));
    e = ((com.google.protobuf.Parser)(new com.moon.j()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_3c61e8f7f969b71e950b(com.moon.L a0) throws E;
private static final class __SourceHandler_3c61e8f7f969b71e950b {

public static com.google.protobuf.ByteString f76(com.moon.L receiver) throws Throwable {
    java.lang.Object forwardValue76_24_0;
    java.lang.String[] spill76_0;
    java.lang.Object spill76_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead76_0() ^ 30436752069403L);
    spill76_0 = __call76_1();
    life4_7 = __fieldRead76_2(receiver);
    life3_8 = spill76_0;
    spill76_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue76_24_0 = spill76_1;
        break forward_join_24;
    }
    if (!((__instanceOf76_3(spill76_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call76_5(__cast76_4(life4_7));
    __fieldWrite76_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue76_24_0 = life4_7;
    }
    return __cast76_7(forwardValue76_24_0);
}
public static void h76_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007600_0(p0);
}
private static native long __fieldRead76_0() throws Throwable;
private static native java.lang.String[] __call76_1() throws Throwable;
private static native java.lang.Object __fieldRead76_2(com.moon.L a0) throws Throwable;
private static native int __instanceOf76_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast76_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call76_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite76_6(com.moon.L a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast76_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1007600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_8d78307ce29747e0378a(com.moon.L a0) throws E;
private static final class __SourceHandler_8d78307ce29747e0378a {

public static java.lang.String f77(com.moon.L receiver) throws Throwable {
    java.lang.Object forwardValue77_18_0;
    java.lang.String[] spill77_0;
    java.lang.Object spill77_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead77_0() ^ 23916887033685L);
    spill77_0 = __call77_1();
    life4_7 = __fieldRead77_2(receiver);
    life3_8 = spill77_0;
    spill77_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue77_18_0 = spill77_1;
        break forward_join_18;
    }
    if (!((__instanceOf77_3(spill77_1) != 0))) {
        break forward_join_17;
    }
    return __cast77_4(life4_7);
    }
    forwardValue77_18_0 = life4_7;
    }
    life5_24 = __cast77_5(forwardValue77_18_0);
    life6_27 = __call77_6(life5_24);
    __fieldWrite77_7(receiver, life6_27);
    return life6_27;
}
public static void h77_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007700_0(p0);
}
public static void h77_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007701_0(p0);
}
private static native long __fieldRead77_0() throws Throwable;
private static native java.lang.String[] __call77_1() throws Throwable;
private static native java.lang.Object __fieldRead77_2(com.moon.L a0) throws Throwable;
private static native int __instanceOf77_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast77_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast77_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call77_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite77_7(com.moon.L a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1007700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_d45bd70eec9bbd2bda64(com.moon.L a0) throws E;
private static final class __SourceHandler_d45bd70eec9bbd2bda64 {

public static com.google.protobuf.ByteString f78(com.moon.L receiver) throws Throwable {
    java.lang.Object forwardValue78_24_0;
    java.lang.String[] spill78_0;
    java.lang.Object spill78_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead78_0() ^ 34121584090464L);
    spill78_0 = __call78_1();
    life4_7 = __fieldRead78_2(receiver);
    life3_8 = spill78_0;
    spill78_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue78_24_0 = spill78_1;
        break forward_join_24;
    }
    if (!((__instanceOf78_3(spill78_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call78_5(__cast78_4(life4_7));
    __fieldWrite78_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue78_24_0 = life4_7;
    }
    return __cast78_7(forwardValue78_24_0);
}
public static void h78_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007800_0(p0);
}
private static native long __fieldRead78_0() throws Throwable;
private static native java.lang.String[] __call78_1() throws Throwable;
private static native java.lang.Object __fieldRead78_2(com.moon.L a0) throws Throwable;
private static native int __instanceOf78_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast78_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call78_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite78_6(com.moon.L a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast78_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1007800_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_dd9c4b142f78576d4f38(com.moon.L a0) throws E;
private static final class __SourceHandler_dd9c4b142f78576d4f38 {

public static java.lang.String f79(com.moon.L receiver) throws Throwable {
    java.lang.Object forwardValue79_18_0;
    java.lang.String[] spill79_0;
    java.lang.Object spill79_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead79_0() ^ 140220631264904L);
    spill79_0 = __call79_1();
    life4_7 = __fieldRead79_2(receiver);
    life3_8 = spill79_0;
    spill79_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue79_18_0 = spill79_1;
        break forward_join_18;
    }
    if (!((__instanceOf79_3(spill79_1) != 0))) {
        break forward_join_17;
    }
    return __cast79_4(life4_7);
    }
    forwardValue79_18_0 = life4_7;
    }
    life5_24 = __cast79_5(forwardValue79_18_0);
    life6_27 = __call79_6(life5_24);
    __fieldWrite79_7(receiver, life6_27);
    return life6_27;
}
public static void h79_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007900_0(p0);
}
public static void h79_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007901_0(p0);
}
private static native long __fieldRead79_0() throws Throwable;
private static native java.lang.String[] __call79_1() throws Throwable;
private static native java.lang.Object __fieldRead79_2(com.moon.L a0) throws Throwable;
private static native int __instanceOf79_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast79_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast79_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call79_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite79_7(com.moon.L a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1007900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.an __sourceHandlerCall_c153087fe5d028a3d40f(com.moon.L a0) throws E;
private static final class __SourceHandler_c153087fe5d028a3d40f {

public static com.moon.an f94(com.moon.L receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead94_0() ^ 37446198658991L);
    return ((receiver == __fieldRead94_1()) ? new com.moon.an() : __call94_2(new com.moon.an(), receiver));
}
public static void h94_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009400_0(p0);
}
private static native long __fieldRead94_0() throws Throwable;
private static native com.moon.L __fieldRead94_1() throws Throwable;
private static native com.moon.an __call94_2(com.moon.an a0, com.moon.L a1) throws Throwable;
private static native java.lang.Exception __call1009400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1a44aaed35ec761e3df9(com.moon.L a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_1a44aaed35ec761e3df9 {

public static boolean f80(com.moon.L receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue80_14_0;
    java.lang.Object forwardValue80_23_0;
    int forwardValue80_40_0;
    int forwardValue80_50_0;
    int forwardValue80_56_0;
    java.lang.Object spill80_0;
    boolean spill80_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.L life5_34;
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
    life2_3 = (__fieldRead80_0() ^ 18453584952948L);
    life4_5 = __call80_1();
    spill80_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue80_14_0 = spill80_0;
        break forward_join_14;
    }
    if (!((spill80_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory80_2(1);
    }
    forwardValue80_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue80_23_0 = forwardValue80_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf80_3(forwardValue80_14_0) == 0))) {
        break forward_join_22;
    }
    return __call80_4(receiver, p0);
    }
    forwardValue80_23_0 = p0;
    }
    life5_34 = __cast80_5(forwardValue80_23_0);
    spill80_1 = __call80_8(__call80_6(receiver), __call80_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue80_40_0 = __integerCategory80_9(spill80_1);
        break forward_join_40;
    }
    if (!((!spill80_1))) {
        break forward_join_35;
    }
    return __integerCategory80_10(0);
    }
    forwardValue80_40_0 = __integerCategory80_14(__call80_13(__call80_11(receiver), __call80_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue80_50_0 = forwardValue80_40_0;
        break forward_join_50;
    }
    if (!((forwardValue80_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory80_15(0);
    }
    forwardValue80_50_0 = __integerCategory80_19(__call80_18(__call80_16(receiver), __call80_17(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue80_56_0 = forwardValue80_50_0;
        break forward_join_56;
    }
    if (!((forwardValue80_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory80_20(0);
    }
    forwardValue80_56_0 = 1;
    }
    return __integerCategory80_21(forwardValue80_56_0);
}
public static void h80_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008000_0(p0);
}
public static void h80_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008001_0(p0);
}
public static void h80_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008002_0(p0);
}
public static void h80_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008003_0(p0);
}
public static void h80_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008004_0(p0);
}
public static void h80_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008005_0(p0);
}
public static void h80_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008006_0(p0);
}
public static void h80_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008007_0(p0);
}
public static void h80_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008008_0(p0);
}
public static void h80_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008009_0(p0);
}
private static native long __fieldRead80_0() throws Throwable;
private static native java.lang.String[] __call80_1() throws Throwable;
private static native boolean __integerCategory80_2(int value) throws Throwable;
private static native int __instanceOf80_3(java.lang.Object a0) throws Throwable;
private static native boolean __call80_4(com.moon.L a0, java.lang.Object a1) throws Throwable;
private static native com.moon.L __cast80_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call80_6(com.moon.L a0) throws Throwable;
private static native java.lang.String __call80_7(com.moon.L a0) throws Throwable;
private static native boolean __call80_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory80_9(boolean value) throws Throwable;
private static native boolean __integerCategory80_10(int value) throws Throwable;
private static native java.lang.String __call80_11(com.moon.L a0) throws Throwable;
private static native java.lang.String __call80_12(com.moon.L a0) throws Throwable;
private static native boolean __call80_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory80_14(boolean value) throws Throwable;
private static native boolean __integerCategory80_15(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call80_16(com.moon.L a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call80_17(com.moon.L a0) throws Throwable;
private static native boolean __call80_18(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory80_19(boolean value) throws Throwable;
private static native boolean __integerCategory80_20(int value) throws Throwable;
private static native boolean __integerCategory80_21(int value) throws Throwable;
private static native java.lang.Exception __call1008000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008005_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008006_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008007_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008008_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008009_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b0e8630abcc91178e531(com.moon.L a0) throws E;
private static final class __SourceHandler_b0e8630abcc91178e531 {

public static int f81(com.moon.L receiver) throws Throwable {
    int forwardValue81_21_0;
    int forwardValue81_34_0;
    int forwardValue81_54_0;
    java.lang.String[] spill81_0;
    int spill81_1;
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
    life1_3 = (__fieldRead81_0() ^ 91358521545189L);
    spill81_0 = __call81_1();
    life4_7 = __fieldRead81_2(receiver);
    life3_8 = spill81_0;
    spill81_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue81_21_0 = spill81_1;
        break forward_join_21;
    }
    if (!((spill81_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue81_21_0 = __integerCategory81_5(__call81_4(__fieldRead81_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue81_34_0 = forwardValue81_21_0;
        break forward_join_34;
    }
    if (!((forwardValue81_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call81_7(1, __fieldRead81_6(receiver)));
    }
    forwardValue81_34_0 = __integerCategory81_10(__call81_9(__fieldRead81_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue81_54_0 = forwardValue81_34_0;
        break forward_join_54;
    }
    if (!((forwardValue81_34_0 == 0))) {
        break forward_join_44;
    }
    life4_7 = (life4_7 + __call81_12(2, __fieldRead81_11(receiver)));
    }
    life4_60 = (life4_7 + __call81_14(__call81_13(receiver)));
    __fieldWrite81_15(receiver, life4_60);
    forwardValue81_54_0 = life4_60;
    }
    return forwardValue81_54_0;
}
public static void h81_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008100_0(p0);
}
public static void h81_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008101_0(p0);
}
public static void h81_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008102_0(p0);
}
public static void h81_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008103_0(p0);
}
private static native long __fieldRead81_0() throws Throwable;
private static native java.lang.String[] __call81_1() throws Throwable;
private static native int __fieldRead81_2(com.moon.L a0) throws Throwable;
private static native java.lang.Object __fieldRead81_3(com.moon.L a0) throws Throwable;
private static native boolean __call81_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory81_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead81_6(com.moon.L a0) throws Throwable;
private static native int __call81_7(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead81_8(com.moon.L a0) throws Throwable;
private static native boolean __call81_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory81_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead81_11(com.moon.L a0) throws Throwable;
private static native int __call81_12(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call81_13(com.moon.L a0) throws Throwable;
private static native int __call81_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite81_15(com.moon.L a0, int a1) throws Throwable;
private static native java.lang.Exception __call1008100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008103_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b0a6dca069a8e350c963(com.moon.L a0) throws E;
private static final class __SourceHandler_b0a6dca069a8e350c963 {

public static int f82(com.moon.L receiver) throws Throwable {
    int forwardValue82_19_0;
    int spill82_0;
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
    life1_3 = (__fieldRead82_0() ^ 86894396233162L);
    life3_5 = __call82_1();
    spill82_0 = __fieldRead82_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue82_19_0 = spill82_0;
        break forward_join_19;
    }
    if (!((spill82_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead82_3(receiver);
    }
    forwardValue82_19_0 = __invokedynamic82_4(9875, (7988449922461824494L ^ life1_3));
    }
    life4_24 = forwardValue82_19_0;
    life4_35 = ((__invokedynamic82_5(24095, (6244820705768082787L ^ life1_3)) * life4_24) + __call82_7(__call82_6()));
    life4_45 = ((__invokedynamic82_8(30112, (375960428479850202L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic82_9(22815, (528994994877598308L ^ life1_3)) * life4_45) + __call82_11(__call82_10(receiver)));
    life4_67 = ((__invokedynamic82_12(12000, (3189288709627477406L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic82_13(25675, (6918454465755133746L ^ life1_3)) * life4_67) + __call82_15(__call82_14(receiver)));
    life4_91 = ((__invokedynamic82_16(17748, (7598155101129872940L ^ life1_3)) * life4_79) + __call82_18(__call82_17(receiver)));
    __fieldWrite82_19(receiver, life4_91);
    return life4_91;
}
public static void h82_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008200_0(p0);
}
public static void h82_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008201_0(p0);
}
private static native long __fieldRead82_0() throws Throwable;
private static native java.lang.String[] __call82_1() throws Throwable;
private static native int __fieldRead82_2(com.moon.L a0) throws Throwable;
private static native int __fieldRead82_3(com.moon.L a0) throws Throwable;
private static native int __invokedynamic82_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic82_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call82_6() throws Throwable;
private static native int __call82_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic82_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic82_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call82_10(com.moon.L a0) throws Throwable;
private static native int __call82_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic82_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic82_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call82_14(com.moon.L a0) throws Throwable;
private static native int __call82_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic82_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call82_17(com.moon.L a0) throws Throwable;
private static native int __call82_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite82_19(com.moon.L a0, int a1) throws Throwable;
private static native java.lang.Exception __call1008200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008201_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ce627770baaee049c007(com.moon.L a0) throws E;
private static final class __SourceHandler_ce627770baaee049c007 {

public static boolean f83(com.moon.L receiver) throws Throwable {
    int forwardValue83_17_0;
    int forwardValue83_26_0;
    java.lang.String[] spill83_0;
    int spill83_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead83_0() ^ 48400395318360L);
    spill83_0 = __call83_1();
    life4_7 = __fieldRead83_2(receiver);
    life3_8 = spill83_0;
    spill83_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue83_17_0 = spill83_1;
        break forward_join_17;
    }
    if (!((spill83_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory83_3(1);
    }
    forwardValue83_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue83_26_0 = forwardValue83_17_0;
        break forward_join_26;
    }
    if (!((forwardValue83_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory83_4(0);
    }
    __fieldWrite83_5(receiver, 1);
    forwardValue83_26_0 = 1;
    }
    return __integerCategory83_6(forwardValue83_26_0);
}
public static void h83_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008300_0(p0);
}
public static void h83_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008301_0(p0);
}
public static void h83_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008302_0(p0);
}
public static void h83_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008303_0(p0);
}
private static native long __fieldRead83_0() throws Throwable;
private static native java.lang.String[] __call83_1() throws Throwable;
private static native byte __fieldRead83_2(com.moon.L a0) throws Throwable;
private static native boolean __integerCategory83_3(int value) throws Throwable;
private static native boolean __integerCategory83_4(int value) throws Throwable;
private static native void __fieldWrite83_5(com.moon.L a0, int a1) throws Throwable;
private static native boolean __integerCategory83_6(int value) throws Throwable;
private static native java.lang.Exception __call1008300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1008303_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_94fda8d6cd0786fff3b5(com.moon.L a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_94fda8d6cd0786fff3b5 {

public static void f84(com.moon.L receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue84_22_0;
    com.moon.L forwardValue84_29_0;
    boolean spill84_0;
    com.moon.L spill84_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (__fieldRead84_0() ^ 31792664389952L);
    life4_5 = __call84_1();
    spill84_0 = __call84_3(__fieldRead84_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue84_22_0 = __integerCategory84_4(spill84_0);
        break forward_join_22;
    }
    if (!((!spill84_0))) {
        break forward_join_17;
    }
    __call84_6(p0, 1, __fieldRead84_5(receiver));
    }
    spill84_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue84_29_0 = spill84_1;
        break forward_join_29;
    }
    forwardValue84_22_0 = __integerCategory84_9(__call84_8(__fieldRead84_7(spill84_1)));
    }
    if (!((forwardValue84_22_0 == 0))) {
        break forward_join_28;
    }
    __call84_11(p0, 2, __fieldRead84_10(receiver));
    }
    forwardValue84_29_0 = receiver;
    }
    __call84_13(__call84_12(forwardValue84_29_0), p0);
    return;
}
public static void h84_0(java.io.IOException p0) throws Throwable {
    throw __call1008400_0(p0);
}
public static void h84_1(java.io.IOException p0) throws Throwable {
    throw __call1008401_0(p0);
}
public static void h84_2(java.io.IOException p0) throws Throwable {
    throw __call1008402_0(p0);
}
public static void h84_3(java.io.IOException p0) throws Throwable {
    throw __call1008403_0(p0);
}
private static native long __fieldRead84_0() throws Throwable;
private static native java.lang.String[] __call84_1() throws Throwable;
private static native java.lang.Object __fieldRead84_2(com.moon.L a0) throws Throwable;
private static native boolean __call84_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory84_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead84_5(com.moon.L a0) throws Throwable;
private static native void __call84_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead84_7(com.moon.L a0) throws Throwable;
private static native boolean __call84_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory84_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead84_10(com.moon.L a0) throws Throwable;
private static native void __call84_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call84_12(com.moon.L a0) throws Throwable;
private static native void __call84_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1008400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1008401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1008402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1008403_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_1a44aaed35ec761e3df9(this, p0); }


public int hashCode() { return __sourceHandlerCall_b0a6dca069a8e350c963(this); }


public static com.moon.L b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.L)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.L.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.L b__L() {
return com.moon.L.d;
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_d45bd70eec9bbd2bda64(this); }


public static com.moon.L b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.L)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.L.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.an b__an() {
return ((com.moon.L)(com.moon.L.d)).c();
}


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.L.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public java.lang.String b__String() { return __sourceHandlerCall_dd9c4b142f78576d4f38(this); }


public com.moon.an c() { return __sourceHandlerCall_c153087fe5d028a3d40f(this); }


public static com.moon.L a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.L)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.L.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.an a__an() {
return com.moon.L.b__an();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.L.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.L a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.L)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.L.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral106_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/L"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.google.protobuf.Parser<com.moon.L> a__Parser() {
return com.moon.L.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9279;
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
            throw new RuntimeException("com/moon/L", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public static com.moon.L a__L() {
return com.moon.L.d;
}


protected com.moon.an a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.an local2 = new com.moon.an(p0);
    return local2;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.L.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static com.moon.an a(com.moon.L p0) {
return ((com.moon.an)(((com.moon.L)(com.moon.L.d)).c())).a(((com.moon.L)(p0)));
}


public static com.moon.L a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.L)(((com.google.protobuf.Parser)(com.moon.L.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.L a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.L)(((com.google.protobuf.Parser)(com.moon.L.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.L a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.L)(((com.google.protobuf.Parser)(com.moon.L.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o3.g;
}


public java.lang.String a__String() { return __sourceHandlerCall_8d78307ce29747e0378a(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_3c61e8f7f969b71e950b(this); }


public static com.moon.L a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.L)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.L.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.L a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.L)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.L.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.L a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.L)(((com.google.protobuf.Parser)(com.moon.L.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.L a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.L)(((com.google.protobuf.Parser)(com.moon.L.e)).parseFrom(((byte[])(p0)))));
}


public static com.moon.L a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.L)(((com.google.protobuf.Parser)(com.moon.L.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.L();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_94fda8d6cd0786fff3b5(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_ce627770baaee049c007(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o3.h)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.L.class)), ((java.lang.Class)(com.moon.an.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.L)(this)).c();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.L)(this)).c();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.L)(this)).b__L();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.L)(this)).b__L();
}


public com.google.protobuf.Parser<com.moon.L> getParserForType() {
return com.moon.L.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_b0e8630abcc91178e531(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.L)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.L)(this)).a__an();
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.L)(this)).a__an();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral106_0() throws E;
}
