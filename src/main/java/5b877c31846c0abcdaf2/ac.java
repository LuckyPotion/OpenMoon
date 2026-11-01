package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class ac extends com.google.protobuf.GeneratedMessageV3 implements com.moon.o0 {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private volatile java.lang.Object b;

private byte c;

private static com.moon.ac d;

private static com.google.protobuf.Parser<com.moon.ac> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private ac(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private ac() {
super();
    this.c = -1;
    this.a = "";
    this.b = "";
}


private static void __sourceInitializeParent() throws Throwable {
f = ((long)(((moom._a)(moom._c.a(((long)(-2577629079489071880L)), ((long)(176305141309512968L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(83730952350380L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ac.f ^ 105078306161244L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill44_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill44_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill44_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill44_14 = new byte[8];
    (__sourceSpill44_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill44_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation44_16 = __sourceSpill44_14;
    ((javax.crypto.Cipher)(__sourceSpill44_11)).init(((int)(__sourceSpill44_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill44_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation44_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\bV\030ºmúüí½üÔûÙï:*P{ÊX2AhõÜ­©¦zË_Î"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill44_25 = local6_life21;
        int __sourceSpill44_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill44_25)).substring(((int)(__sourceSpill44_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill44_30 = local8_life19;
        int __sourceSpill44_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill44_33 = new byte[8];
        (__sourceSpill44_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill44_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill44_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill44_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill44_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill44_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill44_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill44_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill44_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill44_34)).doFinal(((byte[])(__sourceSpill44_33)));
        (__sourceSpill44_30)[__sourceSpill44_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "?Ê!Áò\037\031à\bU\nAO\037"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill44_38 = local6_life21;
        int __sourceSpill44_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill44_38)).substring(((int)(__sourceSpill44_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill44_43 = local8_life19;
        int __sourceSpill44_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill44_46 = new byte[8];
        (__sourceSpill44_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill44_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill44_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill44_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill44_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill44_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill44_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill44_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill44_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill44_47)).doFinal(((byte[])(__sourceSpill44_46)));
        (__sourceSpill44_43)[__sourceSpill44_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.ac)(new com.moon.ac()));
    e = ((com.google.protobuf.Parser)(new com.moon.A()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_1bc01c89acd5996d64a7(com.moon.ac a0) throws E;
private static final class __SourceHandler_1bc01c89acd5996d64a7 {

public static com.google.protobuf.ByteString f234(com.moon.ac receiver) throws Throwable {
    java.lang.Object forwardValue234_24_0;
    java.lang.String[] spill234_0;
    java.lang.Object spill234_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead234_0() ^ 134207684743488L);
    spill234_0 = __call234_1();
    life4_7 = __fieldRead234_2(receiver);
    life3_8 = spill234_0;
    spill234_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue234_24_0 = spill234_1;
        break forward_join_24;
    }
    if (!((__instanceOf234_3(spill234_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call234_5(__cast234_4(life4_7));
    __fieldWrite234_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue234_24_0 = life4_7;
    }
    return __cast234_7(forwardValue234_24_0);
}
public static void h234_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023400_0(p0);
}
private static native long __fieldRead234_0() throws Throwable;
private static native java.lang.String[] __call234_1() throws Throwable;
private static native java.lang.Object __fieldRead234_2(com.moon.ac a0) throws Throwable;
private static native int __instanceOf234_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast234_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call234_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite234_6(com.moon.ac a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast234_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1023400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_0e3bdfcb9290901a5f60(com.moon.ac a0) throws E;
private static final class __SourceHandler_0e3bdfcb9290901a5f60 {

public static java.lang.String f235(com.moon.ac receiver) throws Throwable {
    java.lang.Object forwardValue235_18_0;
    java.lang.String[] spill235_0;
    java.lang.Object spill235_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead235_0() ^ 98872568035411L);
    spill235_0 = __call235_1();
    life4_7 = __fieldRead235_2(receiver);
    life3_8 = spill235_0;
    spill235_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue235_18_0 = spill235_1;
        break forward_join_18;
    }
    if (!((__instanceOf235_3(spill235_1) != 0))) {
        break forward_join_17;
    }
    return __cast235_4(life4_7);
    }
    forwardValue235_18_0 = life4_7;
    }
    life5_24 = __cast235_5(forwardValue235_18_0);
    life6_27 = __call235_6(life5_24);
    __fieldWrite235_7(receiver, life6_27);
    return life6_27;
}
public static void h235_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023500_0(p0);
}
public static void h235_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023501_0(p0);
}
private static native long __fieldRead235_0() throws Throwable;
private static native java.lang.String[] __call235_1() throws Throwable;
private static native java.lang.Object __fieldRead235_2(com.moon.ac a0) throws Throwable;
private static native int __instanceOf235_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast235_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast235_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call235_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite235_7(com.moon.ac a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1023500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023501_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_436c2c119471cc54c944(com.moon.ac a0) throws E;
private static final class __SourceHandler_436c2c119471cc54c944 {

public static com.google.protobuf.ByteString f236(com.moon.ac receiver) throws Throwable {
    java.lang.Object forwardValue236_24_0;
    java.lang.String[] spill236_0;
    java.lang.Object spill236_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead236_0() ^ 94509316334519L);
    spill236_0 = __call236_1();
    life4_7 = __fieldRead236_2(receiver);
    life3_8 = spill236_0;
    spill236_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue236_24_0 = spill236_1;
        break forward_join_24;
    }
    if (!((__instanceOf236_3(spill236_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call236_5(__cast236_4(life4_7));
    __fieldWrite236_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue236_24_0 = life4_7;
    }
    return __cast236_7(forwardValue236_24_0);
}
public static void h236_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023600_0(p0);
}
private static native long __fieldRead236_0() throws Throwable;
private static native java.lang.String[] __call236_1() throws Throwable;
private static native java.lang.Object __fieldRead236_2(com.moon.ac a0) throws Throwable;
private static native int __instanceOf236_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast236_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call236_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite236_6(com.moon.ac a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast236_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1023600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_57afe720080ea2054064(com.moon.ac a0) throws E;
private static final class __SourceHandler_57afe720080ea2054064 {

public static java.lang.String f237(com.moon.ac receiver) throws Throwable {
    java.lang.Object forwardValue237_18_0;
    java.lang.String[] spill237_0;
    java.lang.Object spill237_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead237_0() ^ 99594801735808L);
    spill237_0 = __call237_1();
    life4_7 = __fieldRead237_2(receiver);
    life3_8 = spill237_0;
    spill237_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue237_18_0 = spill237_1;
        break forward_join_18;
    }
    if (!((__instanceOf237_3(spill237_1) != 0))) {
        break forward_join_17;
    }
    return __cast237_4(life4_7);
    }
    forwardValue237_18_0 = life4_7;
    }
    life5_24 = __cast237_5(forwardValue237_18_0);
    life6_27 = __call237_6(life5_24);
    __fieldWrite237_7(receiver, life6_27);
    return life6_27;
}
public static void h237_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023700_0(p0);
}
public static void h237_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023701_0(p0);
}
private static native long __fieldRead237_0() throws Throwable;
private static native java.lang.String[] __call237_1() throws Throwable;
private static native java.lang.Object __fieldRead237_2(com.moon.ac a0) throws Throwable;
private static native int __instanceOf237_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast237_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast237_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call237_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite237_7(com.moon.ac a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1023700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aE __sourceHandlerCall_d72ffc8e5a2b3b7cf768(com.moon.ac a0) throws E;
private static final class __SourceHandler_d72ffc8e5a2b3b7cf768 {

public static com.moon.aE f294(com.moon.ac receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead294_0() ^ 7898798754052L);
    return ((receiver == __fieldRead294_1()) ? new com.moon.aE() : __call294_2(new com.moon.aE(), receiver));
}
public static void h294_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1029400_0(p0);
}
private static native long __fieldRead294_0() throws Throwable;
private static native com.moon.ac __fieldRead294_1() throws Throwable;
private static native com.moon.aE __call294_2(com.moon.aE a0, com.moon.ac a1) throws Throwable;
private static native java.lang.Exception __call1029400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fde7f46017a5d4b8e680(com.moon.ac a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_fde7f46017a5d4b8e680 {

public static boolean f238(com.moon.ac receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue238_14_0;
    java.lang.Object forwardValue238_23_0;
    int forwardValue238_40_0;
    int forwardValue238_50_0;
    int forwardValue238_56_0;
    java.lang.Object spill238_0;
    boolean spill238_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.ac life5_34;
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
    life2_3 = (__fieldRead238_0() ^ 55146760726430L);
    life4_5 = __call238_1();
    spill238_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue238_14_0 = spill238_0;
        break forward_join_14;
    }
    if (!((spill238_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory238_2(1);
    }
    forwardValue238_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue238_23_0 = forwardValue238_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf238_3(forwardValue238_14_0) == 0))) {
        break forward_join_22;
    }
    return __call238_4(receiver, p0);
    }
    forwardValue238_23_0 = p0;
    }
    life5_34 = __cast238_5(forwardValue238_23_0);
    spill238_1 = __call238_8(__call238_6(receiver), __call238_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue238_40_0 = __integerCategory238_9(spill238_1);
        break forward_join_40;
    }
    if (!((!spill238_1))) {
        break forward_join_35;
    }
    return __integerCategory238_10(0);
    }
    forwardValue238_40_0 = __integerCategory238_14(__call238_13(__call238_11(receiver), __call238_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue238_50_0 = forwardValue238_40_0;
        break forward_join_50;
    }
    if (!((forwardValue238_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory238_15(0);
    }
    forwardValue238_50_0 = __integerCategory238_19(__call238_18(__call238_16(receiver), __call238_17(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue238_56_0 = forwardValue238_50_0;
        break forward_join_56;
    }
    if (!((forwardValue238_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory238_20(0);
    }
    forwardValue238_56_0 = 1;
    }
    return __integerCategory238_21(forwardValue238_56_0);
}
public static void h238_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023800_0(p0);
}
public static void h238_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023801_0(p0);
}
public static void h238_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023802_0(p0);
}
public static void h238_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023803_0(p0);
}
public static void h238_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023804_0(p0);
}
public static void h238_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023805_0(p0);
}
public static void h238_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023806_0(p0);
}
public static void h238_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023807_0(p0);
}
public static void h238_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023808_0(p0);
}
public static void h238_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023809_0(p0);
}
private static native long __fieldRead238_0() throws Throwable;
private static native java.lang.String[] __call238_1() throws Throwable;
private static native boolean __integerCategory238_2(int value) throws Throwable;
private static native int __instanceOf238_3(java.lang.Object a0) throws Throwable;
private static native boolean __call238_4(com.moon.ac a0, java.lang.Object a1) throws Throwable;
private static native com.moon.ac __cast238_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call238_6(com.moon.ac a0) throws Throwable;
private static native java.lang.String __call238_7(com.moon.ac a0) throws Throwable;
private static native boolean __call238_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory238_9(boolean value) throws Throwable;
private static native boolean __integerCategory238_10(int value) throws Throwable;
private static native java.lang.String __call238_11(com.moon.ac a0) throws Throwable;
private static native java.lang.String __call238_12(com.moon.ac a0) throws Throwable;
private static native boolean __call238_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory238_14(boolean value) throws Throwable;
private static native boolean __integerCategory238_15(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call238_16(com.moon.ac a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call238_17(com.moon.ac a0) throws Throwable;
private static native boolean __call238_18(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory238_19(boolean value) throws Throwable;
private static native boolean __integerCategory238_20(int value) throws Throwable;
private static native boolean __integerCategory238_21(int value) throws Throwable;
private static native java.lang.Exception __call1023800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023805_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023806_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023807_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023808_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023809_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_e6caf4fc292cf41463d8(com.moon.ac a0) throws E;
private static final class __SourceHandler_e6caf4fc292cf41463d8 {

public static int f239(com.moon.ac receiver) throws Throwable {
    int forwardValue239_21_0;
    int forwardValue239_34_0;
    int forwardValue239_54_0;
    java.lang.String[] spill239_0;
    int spill239_1;
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
    life1_3 = (__fieldRead239_0() ^ 35726699014125L);
    spill239_0 = __call239_1();
    life4_7 = __fieldRead239_2(receiver);
    life3_8 = spill239_0;
    spill239_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue239_21_0 = spill239_1;
        break forward_join_21;
    }
    if (!((spill239_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue239_21_0 = __integerCategory239_5(__call239_4(__fieldRead239_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue239_34_0 = forwardValue239_21_0;
        break forward_join_34;
    }
    if (!((forwardValue239_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call239_7(1, __fieldRead239_6(receiver)));
    }
    forwardValue239_34_0 = __integerCategory239_10(__call239_9(__fieldRead239_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue239_54_0 = forwardValue239_34_0;
        break forward_join_54;
    }
    if (!((forwardValue239_34_0 == 0))) {
        break forward_join_44;
    }
    life4_7 = (life4_7 + __call239_12(2, __fieldRead239_11(receiver)));
    }
    life4_60 = (life4_7 + __call239_14(__call239_13(receiver)));
    __fieldWrite239_15(receiver, life4_60);
    forwardValue239_54_0 = life4_60;
    }
    return forwardValue239_54_0;
}
public static void h239_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023900_0(p0);
}
public static void h239_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023901_0(p0);
}
public static void h239_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023902_0(p0);
}
public static void h239_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023903_0(p0);
}
private static native long __fieldRead239_0() throws Throwable;
private static native java.lang.String[] __call239_1() throws Throwable;
private static native int __fieldRead239_2(com.moon.ac a0) throws Throwable;
private static native java.lang.Object __fieldRead239_3(com.moon.ac a0) throws Throwable;
private static native boolean __call239_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory239_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead239_6(com.moon.ac a0) throws Throwable;
private static native int __call239_7(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead239_8(com.moon.ac a0) throws Throwable;
private static native boolean __call239_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory239_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead239_11(com.moon.ac a0) throws Throwable;
private static native int __call239_12(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call239_13(com.moon.ac a0) throws Throwable;
private static native int __call239_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite239_15(com.moon.ac a0, int a1) throws Throwable;
private static native java.lang.Exception __call1023900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023903_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_d6131db8e34aec5e5bad(com.moon.ac a0) throws E;
private static final class __SourceHandler_d6131db8e34aec5e5bad {

public static int f240(com.moon.ac receiver) throws Throwable {
    int forwardValue240_19_0;
    int spill240_0;
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
    life1_3 = (__fieldRead240_0() ^ 42290144682273L);
    life3_5 = __call240_1();
    spill240_0 = __fieldRead240_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue240_19_0 = spill240_0;
        break forward_join_19;
    }
    if (!((spill240_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead240_3(receiver);
    }
    forwardValue240_19_0 = __invokedynamic240_4(9098, (6081017601491022436L ^ life1_3));
    }
    life4_24 = forwardValue240_19_0;
    life4_35 = ((__invokedynamic240_5(3709, (1933395230137687958L ^ life1_3)) * life4_24) + __call240_7(__call240_6()));
    life4_45 = ((__invokedynamic240_8(32036, (8635113274456042701L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic240_9(32102, (7512918658998037641L ^ life1_3)) * life4_45) + __call240_11(__call240_10(receiver)));
    life4_67 = ((__invokedynamic240_12(17756, (5738732335183877300L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic240_13(20212, (5325546124284419870L ^ life1_3)) * life4_67) + __call240_15(__call240_14(receiver)));
    life4_91 = ((__invokedynamic240_16(25006, (1245887951802527811L ^ life1_3)) * life4_79) + __call240_18(__call240_17(receiver)));
    __fieldWrite240_19(receiver, life4_91);
    return life4_91;
}
public static void h240_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1024000_0(p0);
}
public static void h240_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1024001_0(p0);
}
private static native long __fieldRead240_0() throws Throwable;
private static native java.lang.String[] __call240_1() throws Throwable;
private static native int __fieldRead240_2(com.moon.ac a0) throws Throwable;
private static native int __fieldRead240_3(com.moon.ac a0) throws Throwable;
private static native int __invokedynamic240_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic240_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call240_6() throws Throwable;
private static native int __call240_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic240_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic240_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call240_10(com.moon.ac a0) throws Throwable;
private static native int __call240_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic240_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic240_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call240_14(com.moon.ac a0) throws Throwable;
private static native int __call240_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic240_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call240_17(com.moon.ac a0) throws Throwable;
private static native int __call240_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite240_19(com.moon.ac a0, int a1) throws Throwable;
private static native java.lang.Exception __call1024000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1024001_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_bc3d2f031612ab04194d(com.moon.ac a0) throws E;
private static final class __SourceHandler_bc3d2f031612ab04194d {

public static boolean f241(com.moon.ac receiver) throws Throwable {
    int forwardValue241_17_0;
    int forwardValue241_26_0;
    java.lang.String[] spill241_0;
    int spill241_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead241_0() ^ 60227042645583L);
    spill241_0 = __call241_1();
    life4_7 = __fieldRead241_2(receiver);
    life3_8 = spill241_0;
    spill241_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue241_17_0 = spill241_1;
        break forward_join_17;
    }
    if (!((spill241_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory241_3(1);
    }
    forwardValue241_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue241_26_0 = forwardValue241_17_0;
        break forward_join_26;
    }
    if (!((forwardValue241_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory241_4(0);
    }
    __fieldWrite241_5(receiver, 1);
    forwardValue241_26_0 = 1;
    }
    return __integerCategory241_6(forwardValue241_26_0);
}
public static void h241_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1024100_0(p0);
}
public static void h241_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1024101_0(p0);
}
public static void h241_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1024102_0(p0);
}
public static void h241_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1024103_0(p0);
}
private static native long __fieldRead241_0() throws Throwable;
private static native java.lang.String[] __call241_1() throws Throwable;
private static native byte __fieldRead241_2(com.moon.ac a0) throws Throwable;
private static native boolean __integerCategory241_3(int value) throws Throwable;
private static native boolean __integerCategory241_4(int value) throws Throwable;
private static native void __fieldWrite241_5(com.moon.ac a0, int a1) throws Throwable;
private static native boolean __integerCategory241_6(int value) throws Throwable;
private static native java.lang.Exception __call1024100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1024101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1024102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1024103_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1ea3878d5c308e16fc71(com.moon.ac a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_1ea3878d5c308e16fc71 {

public static void f242(com.moon.ac receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue242_22_0;
    com.moon.ac forwardValue242_29_0;
    boolean spill242_0;
    com.moon.ac spill242_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (__fieldRead242_0() ^ 93804249990723L);
    life4_5 = __call242_1();
    spill242_0 = __call242_3(__fieldRead242_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue242_22_0 = __integerCategory242_4(spill242_0);
        break forward_join_22;
    }
    if (!((!spill242_0))) {
        break forward_join_17;
    }
    __call242_6(p0, 1, __fieldRead242_5(receiver));
    }
    spill242_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue242_29_0 = spill242_1;
        break forward_join_29;
    }
    forwardValue242_22_0 = __integerCategory242_9(__call242_8(__fieldRead242_7(spill242_1)));
    }
    if (!((forwardValue242_22_0 == 0))) {
        break forward_join_28;
    }
    __call242_11(p0, 2, __fieldRead242_10(receiver));
    }
    forwardValue242_29_0 = receiver;
    }
    __call242_13(__call242_12(forwardValue242_29_0), p0);
    return;
}
public static void h242_0(java.io.IOException p0) throws Throwable {
    throw __call1024200_0(p0);
}
public static void h242_1(java.io.IOException p0) throws Throwable {
    throw __call1024201_0(p0);
}
public static void h242_2(java.io.IOException p0) throws Throwable {
    throw __call1024202_0(p0);
}
public static void h242_3(java.io.IOException p0) throws Throwable {
    throw __call1024203_0(p0);
}
private static native long __fieldRead242_0() throws Throwable;
private static native java.lang.String[] __call242_1() throws Throwable;
private static native java.lang.Object __fieldRead242_2(com.moon.ac a0) throws Throwable;
private static native boolean __call242_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory242_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead242_5(com.moon.ac a0) throws Throwable;
private static native void __call242_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead242_7(com.moon.ac a0) throws Throwable;
private static native boolean __call242_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory242_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead242_10(com.moon.ac a0) throws Throwable;
private static native void __call242_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call242_12(com.moon.ac a0) throws Throwable;
private static native void __call242_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1024200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1024201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1024202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1024203_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_fde7f46017a5d4b8e680(this, p0); }


public int hashCode() { return __sourceHandlerCall_d6131db8e34aec5e5bad(this); }


public static com.moon.ac b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ac)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.ac.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.ac b__ac() {
return com.moon.ac.d;
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_436c2c119471cc54c944(this); }


public static com.moon.ac b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.ac)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.ac.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.aE b__aE() {
return ((com.moon.ac)(com.moon.ac.d)).c();
}


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.ac.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public java.lang.String b__String() { return __sourceHandlerCall_57afe720080ea2054064(this); }


public com.moon.aE c() { return __sourceHandlerCall_d72ffc8e5a2b3b7cf768(this); }


public static com.moon.ac a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ac)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ac.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.aE a__aE() {
return com.moon.ac.b__aE();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ac.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.ac a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.ac)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ac.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral357_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ac"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.google.protobuf.Parser<com.moon.ac> a__Parser() {
return com.moon.ac.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12534;
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
            throw new RuntimeException("com/moon/ac", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public static com.moon.ac a__ac() {
return com.moon.ac.d;
}


protected com.moon.aE a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aE local2 = new com.moon.aE(p0);
    return local2;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.ac.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static com.moon.aE a(com.moon.ac p0) {
return ((com.moon.aE)(((com.moon.ac)(com.moon.ac.d)).c())).a(((com.moon.ac)(p0)));
}


public static com.moon.ac a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ac)(((com.google.protobuf.Parser)(com.moon.ac.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.ac a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ac)(((com.google.protobuf.Parser)(com.moon.ac.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ac a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ac)(((com.google.protobuf.Parser)(com.moon.ac.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o1.c;
}


public java.lang.String a__String() { return __sourceHandlerCall_0e3bdfcb9290901a5f60(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_1bc01c89acd5996d64a7(this); }


public static com.moon.ac a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ac)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ac.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ac a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.ac)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ac.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.ac a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ac)(((com.google.protobuf.Parser)(com.moon.ac.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ac a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ac)(((com.google.protobuf.Parser)(com.moon.ac.e)).parseFrom(((byte[])(p0)))));
}


public static com.moon.ac a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ac)(((com.google.protobuf.Parser)(com.moon.ac.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.ac();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_1ea3878d5c308e16fc71(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_bc3d2f031612ab04194d(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o1.d)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.ac.class)), ((java.lang.Class)(com.moon.aE.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.ac)(this)).c();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.ac)(this)).c();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.ac)(this)).b__ac();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.ac)(this)).b__ac();
}


public com.google.protobuf.Parser<com.moon.ac> getParserForType() {
return com.moon.ac.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_e6caf4fc292cf41463d8(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.ac)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.ac)(this)).a__aE();
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.ac)(this)).a__aE();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral357_0() throws E;
}
