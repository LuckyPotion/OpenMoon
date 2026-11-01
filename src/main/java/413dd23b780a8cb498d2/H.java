package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class H extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oD {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private volatile java.lang.Object b;

private byte c;

private static com.moon.H d;

private static com.google.protobuf.Parser<com.moon.H> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private H(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private H() {
super();
    this.c = -1;
    this.a = "";
    this.b = "";
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(2087655141811007741L)), ((long)(6045491942102760740L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(152673544749291L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.H.f ^ 105792410309749L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill5_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill5_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill5_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill5_14 = new byte[8];
    (__sourceSpill5_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill5_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation5_16 = __sourceSpill5_14;
    ((javax.crypto.Cipher)(__sourceSpill5_11)).init(((int)(__sourceSpill5_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill5_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation5_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "m-s\021~£$\030ÄKKrÐ]ã\035ðdOu­9\r'ó\005L¤4¥T¼%Ê"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill5_25 = local6_life21;
        int __sourceSpill5_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill5_25)).substring(((int)(__sourceSpill5_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill5_30 = local8_life19;
        int __sourceSpill5_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill5_33 = new byte[8];
        (__sourceSpill5_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill5_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill5_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill5_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill5_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill5_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill5_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill5_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill5_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill5_34)).doFinal(((byte[])(__sourceSpill5_33)));
        (__sourceSpill5_30)[__sourceSpill5_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "OqÐùóm\177Aô*?aP"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill5_38 = local6_life21;
        int __sourceSpill5_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill5_38)).substring(((int)(__sourceSpill5_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill5_43 = local8_life19;
        int __sourceSpill5_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill5_46 = new byte[8];
        (__sourceSpill5_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill5_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill5_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill5_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill5_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill5_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill5_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill5_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill5_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill5_47)).doFinal(((byte[])(__sourceSpill5_46)));
        (__sourceSpill5_43)[__sourceSpill5_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.H)(new com.moon.H()));
    e = ((com.google.protobuf.Parser)(new com.moon.f()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_3f05e806e03bab666f3b(com.moon.H a0) throws E;
private static final class __SourceHandler_3f05e806e03bab666f3b {

public static com.google.protobuf.ByteString f43(com.moon.H receiver) throws Throwable {
    java.lang.Object forwardValue43_24_0;
    java.lang.String[] spill43_0;
    java.lang.Object spill43_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead43_0() ^ 86348631423410L);
    spill43_0 = __call43_1();
    life4_7 = __fieldRead43_2(receiver);
    life3_8 = spill43_0;
    spill43_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue43_24_0 = spill43_1;
        break forward_join_24;
    }
    if (!((__instanceOf43_3(spill43_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call43_5(__cast43_4(life4_7));
    __fieldWrite43_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue43_24_0 = life4_7;
    }
    return __cast43_7(forwardValue43_24_0);
}
public static void h43_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004300_0(p0);
}
private static native long __fieldRead43_0() throws Throwable;
private static native java.lang.String[] __call43_1() throws Throwable;
private static native java.lang.Object __fieldRead43_2(com.moon.H a0) throws Throwable;
private static native int __instanceOf43_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast43_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call43_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite43_6(com.moon.H a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast43_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1004300_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c076379e57e4ce81b321(com.moon.H a0) throws E;
private static final class __SourceHandler_c076379e57e4ce81b321 {

public static java.lang.String f44(com.moon.H receiver) throws Throwable {
    java.lang.Object forwardValue44_18_0;
    java.lang.String[] spill44_0;
    java.lang.Object spill44_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead44_0() ^ 38018214777840L);
    spill44_0 = __call44_1();
    life4_7 = __fieldRead44_2(receiver);
    life3_8 = spill44_0;
    spill44_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue44_18_0 = spill44_1;
        break forward_join_18;
    }
    if (!((__instanceOf44_3(spill44_1) != 0))) {
        break forward_join_17;
    }
    return __cast44_4(life4_7);
    }
    forwardValue44_18_0 = life4_7;
    }
    life5_24 = __cast44_5(forwardValue44_18_0);
    life6_27 = __call44_6(life5_24);
    __fieldWrite44_7(receiver, life6_27);
    return life6_27;
}
public static void h44_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004400_0(p0);
}
public static void h44_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004401_0(p0);
}
private static native long __fieldRead44_0() throws Throwable;
private static native java.lang.String[] __call44_1() throws Throwable;
private static native java.lang.Object __fieldRead44_2(com.moon.H a0) throws Throwable;
private static native int __instanceOf44_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast44_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast44_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call44_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite44_7(com.moon.H a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1004400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_0b5a38611aeb11989a0f(com.moon.H a0) throws E;
private static final class __SourceHandler_0b5a38611aeb11989a0f {

public static com.google.protobuf.ByteString f45(com.moon.H receiver) throws Throwable {
    java.lang.Object forwardValue45_24_0;
    java.lang.String[] spill45_0;
    java.lang.Object spill45_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead45_0() ^ 44620996514107L);
    spill45_0 = __call45_1();
    life4_7 = __fieldRead45_2(receiver);
    life3_8 = spill45_0;
    spill45_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue45_24_0 = spill45_1;
        break forward_join_24;
    }
    if (!((__instanceOf45_3(spill45_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call45_5(__cast45_4(life4_7));
    __fieldWrite45_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue45_24_0 = life4_7;
    }
    return __cast45_7(forwardValue45_24_0);
}
public static void h45_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004500_0(p0);
}
private static native long __fieldRead45_0() throws Throwable;
private static native java.lang.String[] __call45_1() throws Throwable;
private static native java.lang.Object __fieldRead45_2(com.moon.H a0) throws Throwable;
private static native int __instanceOf45_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast45_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call45_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite45_6(com.moon.H a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast45_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1004500_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_cc9a5be586a83cf72aa0(com.moon.H a0) throws E;
private static final class __SourceHandler_cc9a5be586a83cf72aa0 {

public static java.lang.String f46(com.moon.H receiver) throws Throwable {
    java.lang.Object forwardValue46_18_0;
    java.lang.String[] spill46_0;
    java.lang.Object spill46_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead46_0() ^ 105139707815764L);
    spill46_0 = __call46_1();
    life4_7 = __fieldRead46_2(receiver);
    life3_8 = spill46_0;
    spill46_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue46_18_0 = spill46_1;
        break forward_join_18;
    }
    if (!((__instanceOf46_3(spill46_1) != 0))) {
        break forward_join_17;
    }
    return __cast46_4(life4_7);
    }
    forwardValue46_18_0 = life4_7;
    }
    life5_24 = __cast46_5(forwardValue46_18_0);
    life6_27 = __call46_6(life5_24);
    __fieldWrite46_7(receiver, life6_27);
    return life6_27;
}
public static void h46_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004600_0(p0);
}
public static void h46_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004601_0(p0);
}
private static native long __fieldRead46_0() throws Throwable;
private static native java.lang.String[] __call46_1() throws Throwable;
private static native java.lang.Object __fieldRead46_2(com.moon.H a0) throws Throwable;
private static native int __instanceOf46_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast46_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast46_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call46_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite46_7(com.moon.H a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1004600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aj __sourceHandlerCall_9af07dbf4e8b81d1cdfc(com.moon.H a0) throws E;
private static final class __SourceHandler_9af07dbf4e8b81d1cdfc {

public static com.moon.aj f54(com.moon.H receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead54_0() ^ 138777050313345L);
    return ((receiver == __fieldRead54_1()) ? new com.moon.aj() : __call54_2(new com.moon.aj(), receiver));
}
public static void h54_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005400_0(p0);
}
private static native long __fieldRead54_0() throws Throwable;
private static native com.moon.H __fieldRead54_1() throws Throwable;
private static native com.moon.aj __call54_2(com.moon.aj a0, com.moon.H a1) throws Throwable;
private static native java.lang.Exception __call1005400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fd3e556eeb784f28b950(com.moon.H a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_fd3e556eeb784f28b950 {

public static boolean f47(com.moon.H receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue47_14_0;
    java.lang.Object forwardValue47_23_0;
    int forwardValue47_40_0;
    int forwardValue47_50_0;
    int forwardValue47_56_0;
    java.lang.Object spill47_0;
    boolean spill47_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.H life5_34;
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
    life2_3 = (__fieldRead47_0() ^ 41427135627566L);
    life4_5 = __call47_1();
    spill47_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue47_14_0 = spill47_0;
        break forward_join_14;
    }
    if (!((spill47_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory47_2(1);
    }
    forwardValue47_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue47_23_0 = forwardValue47_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf47_3(forwardValue47_14_0) == 0))) {
        break forward_join_22;
    }
    return __call47_4(receiver, p0);
    }
    forwardValue47_23_0 = p0;
    }
    life5_34 = __cast47_5(forwardValue47_23_0);
    spill47_1 = __call47_8(__call47_6(receiver), __call47_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue47_40_0 = __integerCategory47_9(spill47_1);
        break forward_join_40;
    }
    if (!((!spill47_1))) {
        break forward_join_35;
    }
    return __integerCategory47_10(0);
    }
    forwardValue47_40_0 = __integerCategory47_14(__call47_13(__call47_11(receiver), __call47_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue47_50_0 = forwardValue47_40_0;
        break forward_join_50;
    }
    if (!((forwardValue47_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory47_15(0);
    }
    forwardValue47_50_0 = __integerCategory47_19(__call47_18(__call47_16(receiver), __call47_17(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue47_56_0 = forwardValue47_50_0;
        break forward_join_56;
    }
    if (!((forwardValue47_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory47_20(0);
    }
    forwardValue47_56_0 = 1;
    }
    return __integerCategory47_21(forwardValue47_56_0);
}
public static void h47_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004700_0(p0);
}
public static void h47_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004701_0(p0);
}
public static void h47_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004702_0(p0);
}
public static void h47_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004703_0(p0);
}
public static void h47_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004704_0(p0);
}
public static void h47_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004705_0(p0);
}
public static void h47_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004706_0(p0);
}
public static void h47_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004707_0(p0);
}
public static void h47_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004708_0(p0);
}
public static void h47_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004709_0(p0);
}
private static native long __fieldRead47_0() throws Throwable;
private static native java.lang.String[] __call47_1() throws Throwable;
private static native boolean __integerCategory47_2(int value) throws Throwable;
private static native int __instanceOf47_3(java.lang.Object a0) throws Throwable;
private static native boolean __call47_4(com.moon.H a0, java.lang.Object a1) throws Throwable;
private static native com.moon.H __cast47_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call47_6(com.moon.H a0) throws Throwable;
private static native java.lang.String __call47_7(com.moon.H a0) throws Throwable;
private static native boolean __call47_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory47_9(boolean value) throws Throwable;
private static native boolean __integerCategory47_10(int value) throws Throwable;
private static native java.lang.String __call47_11(com.moon.H a0) throws Throwable;
private static native java.lang.String __call47_12(com.moon.H a0) throws Throwable;
private static native boolean __call47_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory47_14(boolean value) throws Throwable;
private static native boolean __integerCategory47_15(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call47_16(com.moon.H a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call47_17(com.moon.H a0) throws Throwable;
private static native boolean __call47_18(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory47_19(boolean value) throws Throwable;
private static native boolean __integerCategory47_20(int value) throws Throwable;
private static native boolean __integerCategory47_21(int value) throws Throwable;
private static native java.lang.Exception __call1004700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004703_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004704_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004705_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004706_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004707_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004708_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004709_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_7cd5d80f0a657c405557(com.moon.H a0) throws E;
private static final class __SourceHandler_7cd5d80f0a657c405557 {

public static int f48(com.moon.H receiver) throws Throwable {
    int forwardValue48_21_0;
    int forwardValue48_34_0;
    int forwardValue48_54_0;
    java.lang.String[] spill48_0;
    int spill48_1;
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
    life1_3 = (__fieldRead48_0() ^ 44168208496032L);
    spill48_0 = __call48_1();
    life4_7 = __fieldRead48_2(receiver);
    life3_8 = spill48_0;
    spill48_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue48_21_0 = spill48_1;
        break forward_join_21;
    }
    if (!((spill48_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue48_21_0 = __integerCategory48_5(__call48_4(__fieldRead48_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue48_34_0 = forwardValue48_21_0;
        break forward_join_34;
    }
    if (!((forwardValue48_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call48_7(1, __fieldRead48_6(receiver)));
    }
    forwardValue48_34_0 = __integerCategory48_10(__call48_9(__fieldRead48_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue48_54_0 = forwardValue48_34_0;
        break forward_join_54;
    }
    if (!((forwardValue48_34_0 == 0))) {
        break forward_join_44;
    }
    life4_7 = (life4_7 + __call48_12(2, __fieldRead48_11(receiver)));
    }
    life4_60 = (life4_7 + __call48_14(__call48_13(receiver)));
    __fieldWrite48_15(receiver, life4_60);
    forwardValue48_54_0 = life4_60;
    }
    return forwardValue48_54_0;
}
public static void h48_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004800_0(p0);
}
public static void h48_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004801_0(p0);
}
public static void h48_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004802_0(p0);
}
public static void h48_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004803_0(p0);
}
private static native long __fieldRead48_0() throws Throwable;
private static native java.lang.String[] __call48_1() throws Throwable;
private static native int __fieldRead48_2(com.moon.H a0) throws Throwable;
private static native java.lang.Object __fieldRead48_3(com.moon.H a0) throws Throwable;
private static native boolean __call48_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory48_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead48_6(com.moon.H a0) throws Throwable;
private static native int __call48_7(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead48_8(com.moon.H a0) throws Throwable;
private static native boolean __call48_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory48_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead48_11(com.moon.H a0) throws Throwable;
private static native int __call48_12(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call48_13(com.moon.H a0) throws Throwable;
private static native int __call48_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite48_15(com.moon.H a0, int a1) throws Throwable;
private static native java.lang.Exception __call1004800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004803_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_bd3a64b0c4bb8a95f902(com.moon.H a0) throws E;
private static final class __SourceHandler_bd3a64b0c4bb8a95f902 {

public static int f49(com.moon.H receiver) throws Throwable {
    int forwardValue49_19_0;
    int spill49_0;
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
    life1_3 = (__fieldRead49_0() ^ 68142966239453L);
    life3_5 = __call49_1();
    spill49_0 = __fieldRead49_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue49_19_0 = spill49_0;
        break forward_join_19;
    }
    if (!((spill49_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead49_3(receiver);
    }
    forwardValue49_19_0 = __invokedynamic49_4(14405, (7607242758720904962L ^ life1_3));
    }
    life4_24 = forwardValue49_19_0;
    life4_35 = ((__invokedynamic49_5(2877, (2186108934862040184L ^ life1_3)) * life4_24) + __call49_7(__call49_6()));
    life4_45 = ((__invokedynamic49_8(21574, (1568784382620644102L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic49_9(400, (4602889524682712788L ^ life1_3)) * life4_45) + __call49_11(__call49_10(receiver)));
    life4_67 = ((__invokedynamic49_12(24005, (1003045683645266563L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic49_13(1808, (5911941628166234195L ^ life1_3)) * life4_67) + __call49_15(__call49_14(receiver)));
    life4_91 = ((__invokedynamic49_16(25768, (9183815084281463785L ^ life1_3)) * life4_79) + __call49_18(__call49_17(receiver)));
    __fieldWrite49_19(receiver, life4_91);
    return life4_91;
}
public static void h49_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004900_0(p0);
}
public static void h49_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1004901_0(p0);
}
private static native long __fieldRead49_0() throws Throwable;
private static native java.lang.String[] __call49_1() throws Throwable;
private static native int __fieldRead49_2(com.moon.H a0) throws Throwable;
private static native int __fieldRead49_3(com.moon.H a0) throws Throwable;
private static native int __invokedynamic49_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic49_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call49_6() throws Throwable;
private static native int __call49_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic49_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic49_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call49_10(com.moon.H a0) throws Throwable;
private static native int __call49_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic49_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic49_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call49_14(com.moon.H a0) throws Throwable;
private static native int __call49_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic49_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call49_17(com.moon.H a0) throws Throwable;
private static native int __call49_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite49_19(com.moon.H a0, int a1) throws Throwable;
private static native java.lang.Exception __call1004900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1004901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6aaa42fbeedf313a4a7a(com.moon.H a0) throws E;
private static final class __SourceHandler_6aaa42fbeedf313a4a7a {

public static boolean f50(com.moon.H receiver) throws Throwable {
    int forwardValue50_17_0;
    int forwardValue50_26_0;
    java.lang.String[] spill50_0;
    int spill50_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead50_0() ^ 65276733187815L);
    spill50_0 = __call50_1();
    life4_7 = __fieldRead50_2(receiver);
    life3_8 = spill50_0;
    spill50_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue50_17_0 = spill50_1;
        break forward_join_17;
    }
    if (!((spill50_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory50_3(1);
    }
    forwardValue50_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue50_26_0 = forwardValue50_17_0;
        break forward_join_26;
    }
    if (!((forwardValue50_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory50_4(0);
    }
    __fieldWrite50_5(receiver, 1);
    forwardValue50_26_0 = 1;
    }
    return __integerCategory50_6(forwardValue50_26_0);
}
public static void h50_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005000_0(p0);
}
public static void h50_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005001_0(p0);
}
public static void h50_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005002_0(p0);
}
public static void h50_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005003_0(p0);
}
private static native long __fieldRead50_0() throws Throwable;
private static native java.lang.String[] __call50_1() throws Throwable;
private static native byte __fieldRead50_2(com.moon.H a0) throws Throwable;
private static native boolean __integerCategory50_3(int value) throws Throwable;
private static native boolean __integerCategory50_4(int value) throws Throwable;
private static native void __fieldWrite50_5(com.moon.H a0, int a1) throws Throwable;
private static native boolean __integerCategory50_6(int value) throws Throwable;
private static native java.lang.Exception __call1005000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1005001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1005002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1005003_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f39950a7528885c71cb9(com.moon.H a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_f39950a7528885c71cb9 {

public static void f51(com.moon.H receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue51_22_0;
    com.moon.H forwardValue51_29_0;
    boolean spill51_0;
    com.moon.H spill51_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (__fieldRead51_0() ^ 118286342266575L);
    life4_5 = __call51_1();
    spill51_0 = __call51_3(__fieldRead51_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue51_22_0 = __integerCategory51_4(spill51_0);
        break forward_join_22;
    }
    if (!((!spill51_0))) {
        break forward_join_17;
    }
    __call51_6(p0, 1, __fieldRead51_5(receiver));
    }
    spill51_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue51_29_0 = spill51_1;
        break forward_join_29;
    }
    forwardValue51_22_0 = __integerCategory51_9(__call51_8(__fieldRead51_7(spill51_1)));
    }
    if (!((forwardValue51_22_0 == 0))) {
        break forward_join_28;
    }
    __call51_11(p0, 2, __fieldRead51_10(receiver));
    }
    forwardValue51_29_0 = receiver;
    }
    __call51_13(__call51_12(forwardValue51_29_0), p0);
    return;
}
public static void h51_0(java.io.IOException p0) throws Throwable {
    throw __call1005100_0(p0);
}
public static void h51_1(java.io.IOException p0) throws Throwable {
    throw __call1005101_0(p0);
}
public static void h51_2(java.io.IOException p0) throws Throwable {
    throw __call1005102_0(p0);
}
public static void h51_3(java.io.IOException p0) throws Throwable {
    throw __call1005103_0(p0);
}
private static native long __fieldRead51_0() throws Throwable;
private static native java.lang.String[] __call51_1() throws Throwable;
private static native java.lang.Object __fieldRead51_2(com.moon.H a0) throws Throwable;
private static native boolean __call51_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory51_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead51_5(com.moon.H a0) throws Throwable;
private static native void __call51_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead51_7(com.moon.H a0) throws Throwable;
private static native boolean __call51_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory51_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead51_10(com.moon.H a0) throws Throwable;
private static native void __call51_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call51_12(com.moon.H a0) throws Throwable;
private static native void __call51_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1005100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005103_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_fd3e556eeb784f28b950(this, p0); }


public int hashCode() { return __sourceHandlerCall_bd3a64b0c4bb8a95f902(this); }


public static com.moon.H b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.H)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.H.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.H b__H() {
return com.moon.H.d;
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_0b5a38611aeb11989a0f(this); }


public static com.moon.H b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.H)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.H.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.aj b__aj() {
return ((com.moon.H)(com.moon.H.d)).c();
}


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.H.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public java.lang.String b__String() { return __sourceHandlerCall_cc9a5be586a83cf72aa0(this); }


public com.moon.aj c() { return __sourceHandlerCall_9af07dbf4e8b81d1cdfc(this); }


public static com.moon.H a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.H)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.H.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.aj a__aj() {
return com.moon.H.b__aj();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.H.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.H a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.H)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.H.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral62_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/H"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.google.protobuf.Parser<com.moon.H> a__Parser() {
return com.moon.H.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19894;
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
            throw new RuntimeException("com/moon/H", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public static com.moon.H a__H() {
return com.moon.H.d;
}


protected com.moon.aj a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aj local2 = new com.moon.aj(p0);
    return local2;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.H.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static com.moon.aj a(com.moon.H p0) {
return ((com.moon.aj)(((com.moon.H)(com.moon.H.d)).c())).a(((com.moon.H)(p0)));
}


public static com.moon.H a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.H)(((com.google.protobuf.Parser)(com.moon.H.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.H a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.H)(((com.google.protobuf.Parser)(com.moon.H.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.H a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.H)(((com.google.protobuf.Parser)(com.moon.H.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.u;
}


public java.lang.String a__String() { return __sourceHandlerCall_c076379e57e4ce81b321(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_3f05e806e03bab666f3b(this); }


public static com.moon.H a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.H)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.H.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.H a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.H)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.H.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.H a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.H)(((com.google.protobuf.Parser)(com.moon.H.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.H a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.H)(((com.google.protobuf.Parser)(com.moon.H.e)).parseFrom(((byte[])(p0)))));
}


public static com.moon.H a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.H)(((com.google.protobuf.Parser)(com.moon.H.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.H();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_f39950a7528885c71cb9(this, p0); }


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.H)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.H)(this)).c();
}


public final boolean isInitialized() { return __sourceHandlerCall_6aaa42fbeedf313a4a7a(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.v)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.H.class)), ((java.lang.Class)(com.moon.aj.class)));
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.H)(this)).b__H();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.H)(this)).b__H();
}


public com.google.protobuf.Parser<com.moon.H> getParserForType() {
return com.moon.H.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_7cd5d80f0a657c405557(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.H)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.H)(this)).a__aj();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.H)(this)).a__aj();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral62_0() throws E;
}
