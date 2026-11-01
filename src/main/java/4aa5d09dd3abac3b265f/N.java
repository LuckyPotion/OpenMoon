package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class N extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oL {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.N c;

private static com.google.protobuf.Parser<com.moon.N> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private N(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private N() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(5982559029788401120L)), ((long)(9069154214948818121L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12367962272375L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.N.e ^ 51900351816627L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill11_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill11_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill11_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill11_14 = new byte[8];
    (__sourceSpill11_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill11_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation11_16 = __sourceSpill11_14;
    ((javax.crypto.Cipher)(__sourceSpill11_11)).init(((int)(__sourceSpill11_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill11_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation11_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "âtªñéÓ\016ºÃâ\026ôO^vW>ZK\034´"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill11_25 = local6_life21;
        int __sourceSpill11_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill11_25)).substring(((int)(__sourceSpill11_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill11_30 = local8_life19;
        int __sourceSpill11_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill11_33 = new byte[8];
        (__sourceSpill11_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill11_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill11_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill11_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill11_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill11_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill11_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill11_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill11_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill11_34)).doFinal(((byte[])(__sourceSpill11_33)));
        (__sourceSpill11_30)[__sourceSpill11_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ú­!x£\006&BïìL¨*\027"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill11_38 = local6_life21;
        int __sourceSpill11_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill11_38)).substring(((int)(__sourceSpill11_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill11_43 = local8_life19;
        int __sourceSpill11_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill11_46 = new byte[8];
        (__sourceSpill11_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill11_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill11_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill11_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill11_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill11_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill11_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill11_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill11_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill11_47)).doFinal(((byte[])(__sourceSpill11_46)));
        (__sourceSpill11_43)[__sourceSpill11_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.N)(new com.moon.N()));
    d = ((com.google.protobuf.Parser)(new com.moon.l()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_75e852c455d640e4ba11(com.moon.N a0) throws E;
private static final class __SourceHandler_75e852c455d640e4ba11 {

public static com.google.protobuf.ByteString f92(com.moon.N receiver) throws Throwable {
    java.lang.Object forwardValue92_24_0;
    java.lang.String[] spill92_0;
    java.lang.Object spill92_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead92_0() ^ 83576086069099L);
    spill92_0 = __call92_1();
    life4_7 = __fieldRead92_2(receiver);
    life3_8 = spill92_0;
    spill92_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue92_24_0 = spill92_1;
        break forward_join_24;
    }
    if (!((__instanceOf92_3(spill92_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call92_5(__cast92_4(life4_7));
    __fieldWrite92_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue92_24_0 = life4_7;
    }
    return __cast92_7(forwardValue92_24_0);
}
public static void h92_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009200_0(p0);
}
private static native long __fieldRead92_0() throws Throwable;
private static native java.lang.String[] __call92_1() throws Throwable;
private static native java.lang.Object __fieldRead92_2(com.moon.N a0) throws Throwable;
private static native int __instanceOf92_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast92_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call92_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite92_6(com.moon.N a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast92_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1009200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_6045a0be4e4be5774526(com.moon.N a0) throws E;
private static final class __SourceHandler_6045a0be4e4be5774526 {

public static java.lang.String f93(com.moon.N receiver) throws Throwable {
    java.lang.Object forwardValue93_18_0;
    java.lang.String[] spill93_0;
    java.lang.Object spill93_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead93_0() ^ 135329924726387L);
    spill93_0 = __call93_1();
    life4_7 = __fieldRead93_2(receiver);
    life3_8 = spill93_0;
    spill93_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue93_18_0 = spill93_1;
        break forward_join_18;
    }
    if (!((__instanceOf93_3(spill93_1) != 0))) {
        break forward_join_17;
    }
    return __cast93_4(life4_7);
    }
    forwardValue93_18_0 = life4_7;
    }
    life5_24 = __cast93_5(forwardValue93_18_0);
    life6_27 = __call93_6(life5_24);
    __fieldWrite93_7(receiver, life6_27);
    return life6_27;
}
public static void h93_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009300_0(p0);
}
public static void h93_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009301_0(p0);
}
private static native long __fieldRead93_0() throws Throwable;
private static native java.lang.String[] __call93_1() throws Throwable;
private static native java.lang.Object __fieldRead93_2(com.moon.N a0) throws Throwable;
private static native int __instanceOf93_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast93_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast93_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call93_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite93_7(com.moon.N a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1009300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009301_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ap __sourceHandlerCall_26d9b07be1de85b95fa4(com.moon.N a0) throws E;
private static final class __SourceHandler_26d9b07be1de85b95fa4 {

public static com.moon.ap f110(com.moon.N receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead110_0() ^ 102385254048327L);
    return ((receiver == __fieldRead110_1()) ? new com.moon.ap() : __call110_2(new com.moon.ap(), receiver));
}
public static void h110_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1011000_0(p0);
}
private static native long __fieldRead110_0() throws Throwable;
private static native com.moon.N __fieldRead110_1() throws Throwable;
private static native com.moon.ap __call110_2(com.moon.ap a0, com.moon.N a1) throws Throwable;
private static native java.lang.Exception __call1011000_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_874136df76c3793a58c5(com.moon.N a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_874136df76c3793a58c5 {

public static boolean f94(com.moon.N receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue94_14_0;
    java.lang.Object forwardValue94_23_0;
    int forwardValue94_40_0;
    int forwardValue94_46_0;
    java.lang.Object spill94_0;
    boolean spill94_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.N life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead94_0() ^ 79943441582027L);
    life4_5 = __call94_1();
    spill94_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue94_14_0 = spill94_0;
        break forward_join_14;
    }
    if (!((spill94_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory94_2(1);
    }
    forwardValue94_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue94_23_0 = forwardValue94_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf94_3(forwardValue94_14_0) == 0))) {
        break forward_join_22;
    }
    return __call94_4(receiver, p0);
    }
    forwardValue94_23_0 = p0;
    }
    life5_34 = __cast94_5(forwardValue94_23_0);
    spill94_1 = __call94_8(__call94_6(receiver), __call94_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue94_40_0 = __integerCategory94_9(spill94_1);
        break forward_join_40;
    }
    if (!((!spill94_1))) {
        break forward_join_35;
    }
    return __integerCategory94_10(0);
    }
    forwardValue94_40_0 = __integerCategory94_14(__call94_13(__call94_11(receiver), __call94_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue94_46_0 = forwardValue94_40_0;
        break forward_join_46;
    }
    if (!((forwardValue94_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory94_15(0);
    }
    forwardValue94_46_0 = 1;
    }
    return __integerCategory94_16(forwardValue94_46_0);
}
public static void h94_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009400_0(p0);
}
public static void h94_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009401_0(p0);
}
public static void h94_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009402_0(p0);
}
public static void h94_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009403_0(p0);
}
public static void h94_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009404_0(p0);
}
public static void h94_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009405_0(p0);
}
public static void h94_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009406_0(p0);
}
public static void h94_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009407_0(p0);
}
private static native long __fieldRead94_0() throws Throwable;
private static native java.lang.String[] __call94_1() throws Throwable;
private static native boolean __integerCategory94_2(int value) throws Throwable;
private static native int __instanceOf94_3(java.lang.Object a0) throws Throwable;
private static native boolean __call94_4(com.moon.N a0, java.lang.Object a1) throws Throwable;
private static native com.moon.N __cast94_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call94_6(com.moon.N a0) throws Throwable;
private static native java.lang.String __call94_7(com.moon.N a0) throws Throwable;
private static native boolean __call94_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory94_9(boolean value) throws Throwable;
private static native boolean __integerCategory94_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call94_11(com.moon.N a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call94_12(com.moon.N a0) throws Throwable;
private static native boolean __call94_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory94_14(boolean value) throws Throwable;
private static native boolean __integerCategory94_15(int value) throws Throwable;
private static native boolean __integerCategory94_16(int value) throws Throwable;
private static native java.lang.Exception __call1009400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009402_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009403_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009404_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009405_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009406_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009407_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_eb6cde3b79f22cb2464c(com.moon.N a0) throws E;
private static final class __SourceHandler_eb6cde3b79f22cb2464c {

public static int f95(com.moon.N receiver) throws Throwable {
    int forwardValue95_21_0;
    int forwardValue95_41_0;
    java.lang.String[] spill95_0;
    int spill95_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead95_0() ^ 139707575071337L);
    spill95_0 = __call95_1();
    life4_7 = __fieldRead95_2(receiver);
    life3_8 = spill95_0;
    spill95_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue95_21_0 = spill95_1;
        break forward_join_21;
    }
    if (!((spill95_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue95_21_0 = __integerCategory95_5(__call95_4(__fieldRead95_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue95_41_0 = forwardValue95_21_0;
        break forward_join_41;
    }
    if (!((forwardValue95_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call95_7(1, __fieldRead95_6(receiver)));
    }
    life4_44 = (life4_7 + __call95_9(__call95_8(receiver)));
    __fieldWrite95_10(receiver, life4_44);
    forwardValue95_41_0 = life4_44;
    }
    return forwardValue95_41_0;
}
public static void h95_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009500_0(p0);
}
public static void h95_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009501_0(p0);
}
public static void h95_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009502_0(p0);
}
private static native long __fieldRead95_0() throws Throwable;
private static native java.lang.String[] __call95_1() throws Throwable;
private static native int __fieldRead95_2(com.moon.N a0) throws Throwable;
private static native java.lang.Object __fieldRead95_3(com.moon.N a0) throws Throwable;
private static native boolean __call95_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory95_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead95_6(com.moon.N a0) throws Throwable;
private static native int __call95_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call95_8(com.moon.N a0) throws Throwable;
private static native int __call95_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite95_10(com.moon.N a0, int a1) throws Throwable;
private static native java.lang.Exception __call1009500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009502_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_eedfc20886e3c754fe69(com.moon.N a0) throws E;
private static final class __SourceHandler_eedfc20886e3c754fe69 {

public static int f96(com.moon.N receiver) throws Throwable {
    int forwardValue96_19_0;
    int spill96_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead96_0() ^ 76088284845660L);
    life3_5 = __call96_1();
    spill96_0 = __fieldRead96_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue96_19_0 = spill96_0;
        break forward_join_19;
    }
    if (!((spill96_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead96_3(receiver);
    }
    forwardValue96_19_0 = __invokedynamic96_4(23044, (1923499365471328097L ^ life1_3));
    }
    life4_24 = forwardValue96_19_0;
    life4_35 = ((__invokedynamic96_5(25067, (3419267724163918988L ^ life1_3)) * life4_24) + __call96_7(__call96_6()));
    life4_45 = ((__invokedynamic96_8(10015, (531665953500064379L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic96_9(27702, (6693017467245535568L ^ life1_3)) * life4_45) + __call96_11(__call96_10(receiver)));
    life4_69 = ((__invokedynamic96_12(28691, (676426498072755570L ^ life1_3)) * life4_57) + __call96_14(__call96_13(receiver)));
    __fieldWrite96_15(receiver, life4_69);
    return life4_69;
}
public static void h96_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009600_0(p0);
}
public static void h96_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009601_0(p0);
}
private static native long __fieldRead96_0() throws Throwable;
private static native java.lang.String[] __call96_1() throws Throwable;
private static native int __fieldRead96_2(com.moon.N a0) throws Throwable;
private static native int __fieldRead96_3(com.moon.N a0) throws Throwable;
private static native int __invokedynamic96_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic96_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call96_6() throws Throwable;
private static native int __call96_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic96_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic96_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call96_10(com.moon.N a0) throws Throwable;
private static native int __call96_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic96_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call96_13(com.moon.N a0) throws Throwable;
private static native int __call96_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite96_15(com.moon.N a0, int a1) throws Throwable;
private static native java.lang.Exception __call1009600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ce3cc436a07ae7fb3ffe(com.moon.N a0) throws E;
private static final class __SourceHandler_ce3cc436a07ae7fb3ffe {

public static boolean f97(com.moon.N receiver) throws Throwable {
    int forwardValue97_17_0;
    int forwardValue97_26_0;
    java.lang.String[] spill97_0;
    int spill97_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead97_0() ^ 114710681647197L);
    spill97_0 = __call97_1();
    life4_7 = __fieldRead97_2(receiver);
    life3_8 = spill97_0;
    spill97_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue97_17_0 = spill97_1;
        break forward_join_17;
    }
    if (!((spill97_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory97_3(1);
    }
    forwardValue97_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue97_26_0 = forwardValue97_17_0;
        break forward_join_26;
    }
    if (!((forwardValue97_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory97_4(0);
    }
    __fieldWrite97_5(receiver, 1);
    forwardValue97_26_0 = 1;
    }
    return __integerCategory97_6(forwardValue97_26_0);
}
public static void h97_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009700_0(p0);
}
public static void h97_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009701_0(p0);
}
public static void h97_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009702_0(p0);
}
public static void h97_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1009703_0(p0);
}
private static native long __fieldRead97_0() throws Throwable;
private static native java.lang.String[] __call97_1() throws Throwable;
private static native byte __fieldRead97_2(com.moon.N a0) throws Throwable;
private static native boolean __integerCategory97_3(int value) throws Throwable;
private static native boolean __integerCategory97_4(int value) throws Throwable;
private static native void __fieldWrite97_5(com.moon.N a0, int a1) throws Throwable;
private static native boolean __integerCategory97_6(int value) throws Throwable;
private static native java.lang.Exception __call1009700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1009703_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d2073a249b4e29865e17(com.moon.N a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_d2073a249b4e29865e17 {

public static void f98(com.moon.N receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.N forwardValue98_18_0;
    com.moon.N spill98_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead98_0() ^ 103191605123849L);
    life4_5 = __call98_1();
    spill98_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue98_18_0 = spill98_0;
        break forward_join_18;
    }
    if (!((!__call98_3(__fieldRead98_2(spill98_0))))) {
        break forward_join_17;
    }
    __call98_5(p0, 1, __fieldRead98_4(receiver));
    }
    forwardValue98_18_0 = receiver;
    }
    __call98_7(__call98_6(forwardValue98_18_0), p0);
    return;
}
public static void h98_0(java.io.IOException p0) throws Throwable {
    throw __call1009800_0(p0);
}
public static void h98_1(java.io.IOException p0) throws Throwable {
    throw __call1009801_0(p0);
}
private static native long __fieldRead98_0() throws Throwable;
private static native java.lang.String[] __call98_1() throws Throwable;
private static native java.lang.Object __fieldRead98_2(com.moon.N a0) throws Throwable;
private static native boolean __call98_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead98_4(com.moon.N a0) throws Throwable;
private static native void __call98_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call98_6(com.moon.N a0) throws Throwable;
private static native void __call98_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1009800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1009801_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_874136df76c3793a58c5(this, p0); }


public int hashCode() { return __sourceHandlerCall_eedfc20886e3c754fe69(this); }


public com.moon.N b() {
return com.moon.N.c;
}


public static com.moon.ap b__ap() {
return ((com.moon.N)(com.moon.N.c)).c();
}


public static com.moon.N b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.N)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.N.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.N b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.N)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.N.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.ap c() { return __sourceHandlerCall_26d9b07be1de85b95fa4(this); }


public static com.moon.N a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.N)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.N.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ap a(com.moon.N p0) {
return ((com.moon.ap)(((com.moon.N)(com.moon.N.c)).c())).a(((com.moon.N)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5043;
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
            throw new RuntimeException("com/moon/N", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.N a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.N)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.N.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.ap a__ap() {
return com.moon.N.b__ap();
}


public static com.google.protobuf.Parser<com.moon.N> a__Parser() {
return com.moon.N.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.N.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.N.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.N a__N() {
return com.moon.N.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral124_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/N"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.ap a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ap local2 = new com.moon.ap(p0);
    return local2;
}


public static com.moon.N a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.N)(((com.google.protobuf.Parser)(com.moon.N.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.N a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.N)(((com.google.protobuf.Parser)(com.moon.N.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.N a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.N)(((com.google.protobuf.Parser)(com.moon.N.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.ox.a;
}


public java.lang.String a__String() { return __sourceHandlerCall_6045a0be4e4be5774526(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_75e852c455d640e4ba11(this); }


public static com.moon.N a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.N)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.N.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.N a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.N)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.N.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.N a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.N)(((com.google.protobuf.Parser)(com.moon.N.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.N a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.N)(((com.google.protobuf.Parser)(com.moon.N.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.N a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.N)(((com.google.protobuf.Parser)(com.moon.N.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.N();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_d2073a249b4e29865e17(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_ce3cc436a07ae7fb3ffe(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.ox.b)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.N.class)), ((java.lang.Class)(com.moon.ap.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.N)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.N)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.N)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.N)(this)).b();
}


public com.google.protobuf.Parser<com.moon.N> getParserForType() {
return com.moon.N.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_eb6cde3b79f22cb2464c(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.N)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.N)(this)).a__ap();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.N)(this)).a__ap();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral124_0() throws E;
}
