package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class J extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oG {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private volatile java.lang.Object b;

private int c;

private int d;

private com.moon.K e;

private long f;

private boolean g;

private boolean h;

private boolean i;

private byte j;

private static com.moon.J k;

private static com.google.protobuf.Parser<com.moon.J> l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

private J(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.j = -1;
}


private J() {
super();
    this.j = -1;
    this.a = "";
    this.b = "";
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(7248927009522299164L)), ((long)(4311464490082002540L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(113316421415339L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.J.m ^ 121854788648235L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill7_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill7_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill7_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill7_14 = new byte[8];
    (__sourceSpill7_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill7_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation7_16 = __sourceSpill7_14;
    ((javax.crypto.Cipher)(__sourceSpill7_11)).init(((int)(__sourceSpill7_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill7_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation7_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "8Hµ]Í}\030 õH3öÕ\021}ãë%.ç\f\021ÎÉÎ=nù}uçCq7\005¯Ê÷nÔ5áØÁ­RZKØ4¡N²ýàÞ^T¸ÏuE\\¤A>\rÐM49£\"_FÖhùð?\bÖõ\030{,2d¼'§ò\005\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill7_25 = local6_life21;
        int __sourceSpill7_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill7_25)).substring(((int)(__sourceSpill7_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill7_30 = local8_life19;
        int __sourceSpill7_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill7_33 = new byte[8];
        (__sourceSpill7_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill7_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill7_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill7_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill7_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill7_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill7_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill7_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill7_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill7_34)).doFinal(((byte[])(__sourceSpill7_33)));
        (__sourceSpill7_30)[__sourceSpill7_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\031*­ªÔ$uÿÀ<#á\020\003&"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill7_38 = local6_life21;
        int __sourceSpill7_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill7_38)).substring(((int)(__sourceSpill7_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill7_43 = local8_life19;
        int __sourceSpill7_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill7_46 = new byte[8];
        (__sourceSpill7_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill7_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill7_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill7_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill7_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill7_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill7_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill7_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill7_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill7_47)).doFinal(((byte[])(__sourceSpill7_46)));
        (__sourceSpill7_43)[__sourceSpill7_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[15]));
    k = ((com.moon.J)(new com.moon.J()));
    l = ((com.google.protobuf.Parser)(new com.moon.h()));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_f440f7edd296cbb694a4(com.moon.J a0) throws E;
private static final class __SourceHandler_f440f7edd296cbb694a4 {

public static boolean f66(com.moon.J receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead66_0() ^ 52773813560312L);
    return ((__fieldRead66_1(receiver) != null) ? true : false);
}
public static void h66_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006600_0(p0);
}
private static native long __fieldRead66_0() throws Throwable;
private static native com.moon.K __fieldRead66_1(com.moon.J a0) throws Throwable;
private static native java.lang.Exception __call1006600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_b98d758370d28e2c1d5d(com.moon.J a0) throws E;
private static final class __SourceHandler_b98d758370d28e2c1d5d {

public static com.google.protobuf.ByteString f57(com.moon.J receiver) throws Throwable {
    java.lang.Object forwardValue57_24_0;
    java.lang.String[] spill57_0;
    java.lang.Object spill57_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead57_0() ^ 3998268827930L);
    spill57_0 = __call57_1();
    life4_7 = __fieldRead57_2(receiver);
    life3_8 = spill57_0;
    spill57_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue57_24_0 = spill57_1;
        break forward_join_24;
    }
    if (!((__instanceOf57_3(spill57_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call57_5(__cast57_4(life4_7));
    __fieldWrite57_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue57_24_0 = life4_7;
    }
    return __cast57_7(forwardValue57_24_0);
}
public static void h57_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005700_0(p0);
}
private static native long __fieldRead57_0() throws Throwable;
private static native java.lang.String[] __call57_1() throws Throwable;
private static native java.lang.Object __fieldRead57_2(com.moon.J a0) throws Throwable;
private static native int __instanceOf57_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast57_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call57_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite57_6(com.moon.J a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast57_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1005700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.K __sourceHandlerCall_c2ad95c51a9a53aec27b(com.moon.J a0) throws E;
private static final class __SourceHandler_c2ad95c51a9a53aec27b {

public static com.moon.K f58(com.moon.J receiver) throws Throwable {
    com.moon.J forwardValue58_14_0;
    com.moon.K forwardValue58_15_0;
    com.moon.J spill58_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead58_0() ^ 103318980686530L);
    life3_5 = __call58_1();
    spill58_0 = receiver;
    if (!((life3_5 == null))) {
        forwardValue58_14_0 = spill58_0;
        break forward_join_14;
    }
    if (!((__fieldRead58_2(spill58_0) == null))) {
        break forward_join_13;
    }
    forwardValue58_15_0 = __call58_3();
    break forward_join_15;
    }
    forwardValue58_14_0 = receiver;
    }
    forwardValue58_15_0 = __fieldRead58_4(forwardValue58_14_0);
    }
    return forwardValue58_15_0;
}
public static void h58_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005800_0(p0);
}
public static void h58_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005801_0(p0);
}
private static native long __fieldRead58_0() throws Throwable;
private static native java.lang.String[] __call58_1() throws Throwable;
private static native com.moon.K __fieldRead58_2(com.moon.J a0) throws Throwable;
private static native com.moon.K __call58_3() throws Throwable;
private static native com.moon.K __fieldRead58_4(com.moon.J a0) throws Throwable;
private static native java.lang.Exception __call1005800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1005801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_1a75f321c93e656b588c(com.moon.J a0) throws E;
private static final class __SourceHandler_1a75f321c93e656b588c {

public static java.lang.String f59(com.moon.J receiver) throws Throwable {
    java.lang.Object forwardValue59_18_0;
    java.lang.String[] spill59_0;
    java.lang.Object spill59_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead59_0() ^ 137877784505751L);
    spill59_0 = __call59_1();
    life4_7 = __fieldRead59_2(receiver);
    life3_8 = spill59_0;
    spill59_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue59_18_0 = spill59_1;
        break forward_join_18;
    }
    if (!((__instanceOf59_3(spill59_1) != 0))) {
        break forward_join_17;
    }
    return __cast59_4(life4_7);
    }
    forwardValue59_18_0 = life4_7;
    }
    life5_24 = __cast59_5(forwardValue59_18_0);
    life6_27 = __call59_6(life5_24);
    __fieldWrite59_7(receiver, life6_27);
    return life6_27;
}
public static void h59_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005900_0(p0);
}
public static void h59_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1005901_0(p0);
}
private static native long __fieldRead59_0() throws Throwable;
private static native java.lang.String[] __call59_1() throws Throwable;
private static native java.lang.Object __fieldRead59_2(com.moon.J a0) throws Throwable;
private static native int __instanceOf59_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast59_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast59_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call59_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite59_7(com.moon.J a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1005900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1005901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_945f1dfb1d00dc2b8d25(com.moon.J a0) throws E;
private static final class __SourceHandler_945f1dfb1d00dc2b8d25 {

public static com.google.protobuf.ByteString f60(com.moon.J receiver) throws Throwable {
    java.lang.Object forwardValue60_24_0;
    java.lang.String[] spill60_0;
    java.lang.Object spill60_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead60_0() ^ 8610659777128L);
    spill60_0 = __call60_1();
    life4_7 = __fieldRead60_2(receiver);
    life3_8 = spill60_0;
    spill60_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue60_24_0 = spill60_1;
        break forward_join_24;
    }
    if (!((__instanceOf60_3(spill60_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call60_5(__cast60_4(life4_7));
    __fieldWrite60_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue60_24_0 = life4_7;
    }
    return __cast60_7(forwardValue60_24_0);
}
public static void h60_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006000_0(p0);
}
private static native long __fieldRead60_0() throws Throwable;
private static native java.lang.String[] __call60_1() throws Throwable;
private static native java.lang.Object __fieldRead60_2(com.moon.J a0) throws Throwable;
private static native int __instanceOf60_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast60_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call60_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite60_6(com.moon.J a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast60_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1006000_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_3cc2cf37c02e15ff2456(com.moon.J a0) throws E;
private static final class __SourceHandler_3cc2cf37c02e15ff2456 {

public static java.lang.String f61(com.moon.J receiver) throws Throwable {
    java.lang.Object forwardValue61_18_0;
    java.lang.String[] spill61_0;
    java.lang.Object spill61_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead61_0() ^ 56185815312540L);
    spill61_0 = __call61_1();
    life4_7 = __fieldRead61_2(receiver);
    life3_8 = spill61_0;
    spill61_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue61_18_0 = spill61_1;
        break forward_join_18;
    }
    if (!((__instanceOf61_3(spill61_1) != 0))) {
        break forward_join_17;
    }
    return __cast61_4(life4_7);
    }
    forwardValue61_18_0 = life4_7;
    }
    life5_24 = __cast61_5(forwardValue61_18_0);
    life6_27 = __call61_6(life5_24);
    __fieldWrite61_7(receiver, life6_27);
    return life6_27;
}
public static void h61_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006100_0(p0);
}
public static void h61_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006101_0(p0);
}
private static native long __fieldRead61_0() throws Throwable;
private static native java.lang.String[] __call61_1() throws Throwable;
private static native java.lang.Object __fieldRead61_2(com.moon.J a0) throws Throwable;
private static native int __instanceOf61_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast61_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast61_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call61_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite61_7(com.moon.J a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1006100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.al __sourceHandlerCall_e8f6608f8bde42e9fcb9(com.moon.J a0) throws E;
private static final class __SourceHandler_e8f6608f8bde42e9fcb9 {

public static com.moon.al f72(com.moon.J receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead72_0() ^ 86237688288030L);
    return ((receiver == __fieldRead72_1()) ? new com.moon.al() : __call72_2(new com.moon.al(), receiver));
}
public static void h72_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007200_0(p0);
}
private static native long __fieldRead72_0() throws Throwable;
private static native com.moon.J __fieldRead72_1() throws Throwable;
private static native com.moon.al __call72_2(com.moon.al a0, com.moon.J a1) throws Throwable;
private static native java.lang.Exception __call1007200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_83dcc8c0330a60f9716d(com.moon.J a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_83dcc8c0330a60f9716d {

public static boolean f62(com.moon.J receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue62_14_0;
    java.lang.Object forwardValue62_23_0;
    int forwardValue62_40_0;
    int forwardValue62_47_0;
    int forwardValue62_58_0;
    int forwardValue62_58_1;
    int forwardValue62_69_0;
    int forwardValue62_69_1;
    int forwardValue62_74_0;
    int forwardValue62_92_0;
    int forwardValue62_99_0;
    int forwardValue62_110_0;
    int forwardValue62_110_1;
    int forwardValue62_121_0;
    int forwardValue62_121_1;
    int forwardValue62_129_0;
    int forwardValue62_135_0;
    java.lang.Object spill62_0;
    boolean spill62_1;
    int spill62_2;
    boolean spill62_3;
    boolean spill62_4;
    boolean spill62_5;
    boolean spill62_6;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.J life5_34;
    forward_join_135: {
    forward_join_134: {
    forward_join_129: {
    forward_join_124: {
    forward_join_121: {
    forward_join_115: {
    forward_join_110: {
    forward_join_106: {
    forward_join_99: {
    forward_join_97: {
    forward_join_92: {
    forward_join_87: {
    forward_join_74: {
    forward_join_72: {
    forward_join_69: {
    forward_join_63: {
    forward_join_58: {
    forward_join_54: {
    forward_join_47: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead62_0() ^ 50361668102246L);
    life4_5 = __call62_1();
    spill62_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue62_14_0 = spill62_0;
        break forward_join_14;
    }
    if (!((spill62_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory62_2(1);
    }
    forwardValue62_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue62_23_0 = forwardValue62_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf62_3(forwardValue62_14_0) == 0))) {
        break forward_join_22;
    }
    return __call62_4(receiver, p0);
    }
    forwardValue62_23_0 = p0;
    }
    life5_34 = __cast62_5(forwardValue62_23_0);
    spill62_1 = __call62_8(__call62_6(receiver), __call62_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue62_40_0 = __integerCategory62_9(spill62_1);
        break forward_join_40;
    }
    if (!((!spill62_1))) {
        break forward_join_35;
    }
    return __integerCategory62_10(0);
    }
    forwardValue62_40_0 = __integerCategory62_14(__call62_13(__call62_11(receiver), __call62_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue62_47_0 = forwardValue62_40_0;
        break forward_join_47;
    }
    if (!((forwardValue62_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory62_15(0);
    }
    forwardValue62_47_0 = __call62_16(receiver);
    }
    spill62_2 = __call62_17(life5_34);
    if (!((life4_5 == null))) {
        forwardValue62_58_0 = forwardValue62_47_0;
        forwardValue62_58_1 = spill62_2;
        break forward_join_58;
    }
    if (!((forwardValue62_47_0 != spill62_2))) {
        break forward_join_54;
    }
    return __integerCategory62_18(0);
    }
    forwardValue62_58_0 = __call62_19(receiver);
    forwardValue62_58_1 = __call62_20(life5_34);
    }
    if (!((life4_5 == null))) {
        forwardValue62_69_0 = forwardValue62_58_0;
        forwardValue62_69_1 = forwardValue62_58_1;
        break forward_join_69;
    }
    if (!((forwardValue62_58_0 != forwardValue62_58_1))) {
        break forward_join_63;
    }
    return __integerCategory62_21(0);
    }
    spill62_3 = __call62_22(receiver);
    if (!((life4_5 == null))) {
        forwardValue62_74_0 = __integerCategory62_23(spill62_3);
        break forward_join_74;
    }
    forwardValue62_69_0 = __integerCategory62_25(spill62_3);
    forwardValue62_69_1 = __integerCategory62_26(__call62_24(life5_34));
    }
    if (!((forwardValue62_69_0 != forwardValue62_69_1))) {
        break forward_join_72;
    }
    return __integerCategory62_27(0);
    }
    forwardValue62_74_0 = __integerCategory62_29(__call62_28(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue62_92_0 = forwardValue62_74_0;
        break forward_join_92;
    }
    if (!((forwardValue62_74_0 != 0))) {
        break forward_join_87;
    }
    spill62_4 = __call62_32(__call62_30(receiver), __call62_31(life5_34));
    if (!((life4_5 == null))) {
        forwardValue62_92_0 = __integerCategory62_33(spill62_4);
        break forward_join_92;
    }
    if (!((!spill62_4))) {
        break forward_join_87;
    }
    return __integerCategory62_34(0);
    }
    forwardValue62_92_0 = __numericCompare62_37(__call62_35(receiver), __call62_36(life5_34));
    }
    if (!((life4_5 == null))) {
        forwardValue62_99_0 = forwardValue62_92_0;
        break forward_join_99;
    }
    if (!((forwardValue62_92_0 != 0))) {
        break forward_join_97;
    }
    return __integerCategory62_38(0);
    }
    forwardValue62_99_0 = __integerCategory62_40(__call62_39(receiver));
    }
    spill62_5 = __call62_41(life5_34);
    if (!((life4_5 == null))) {
        forwardValue62_110_0 = forwardValue62_99_0;
        forwardValue62_110_1 = __integerCategory62_42(spill62_5);
        break forward_join_110;
    }
    if (!((forwardValue62_99_0 != __integerCategoryRepair62_0(spill62_5)))) {
        break forward_join_106;
    }
    return __integerCategory62_43(0);
    }
    forwardValue62_110_0 = __integerCategory62_46(__call62_44(receiver));
    forwardValue62_110_1 = __integerCategory62_47(__call62_45(life5_34));
    }
    if (!((life4_5 == null))) {
        forwardValue62_121_0 = forwardValue62_110_0;
        forwardValue62_121_1 = forwardValue62_110_1;
        break forward_join_121;
    }
    if (!((forwardValue62_110_0 != forwardValue62_110_1))) {
        break forward_join_115;
    }
    return __integerCategory62_48(0);
    }
    spill62_6 = __call62_49(receiver);
    if (!((life4_5 == null))) {
        forwardValue62_129_0 = __integerCategory62_50(spill62_6);
        break forward_join_129;
    }
    forwardValue62_121_0 = __integerCategory62_52(spill62_6);
    forwardValue62_121_1 = __integerCategory62_53(__call62_51(life5_34));
    }
    if (!((forwardValue62_121_0 != forwardValue62_121_1))) {
        break forward_join_124;
    }
    return __integerCategory62_54(0);
    }
    forwardValue62_129_0 = __integerCategory62_58(__call62_57(__call62_55(receiver), __call62_56(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue62_135_0 = forwardValue62_129_0;
        break forward_join_135;
    }
    if (!((forwardValue62_129_0 == 0))) {
        break forward_join_134;
    }
    return __integerCategory62_59(0);
    }
    forwardValue62_135_0 = 1;
    }
    return __integerCategory62_60(forwardValue62_135_0);
}
public static void h62_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006200_0(p0);
}
public static void h62_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006201_0(p0);
}
public static void h62_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006202_0(p0);
}
public static void h62_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006203_0(p0);
}
public static void h62_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006204_0(p0);
}
public static void h62_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006205_0(p0);
}
public static void h62_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006206_0(p0);
}
public static void h62_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006207_0(p0);
}
public static void h62_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006208_0(p0);
}
public static void h62_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006209_0(p0);
}
public static void h62_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006210_0(p0);
}
public static void h62_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006211_0(p0);
}
public static void h62_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006212_0(p0);
}
public static void h62_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006213_0(p0);
}
public static void h62_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006214_0(p0);
}
public static void h62_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006215_0(p0);
}
public static void h62_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006216_0(p0);
}
public static void h62_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006217_0(p0);
}
public static void h62_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006218_0(p0);
}
public static void h62_19(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006219_0(p0);
}
public static void h62_20(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006220_0(p0);
}
public static void h62_21(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006221_0(p0);
}
public static void h62_22(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006222_0(p0);
}
public static void h62_23(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006223_0(p0);
}
public static void h62_24(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006224_0(p0);
}
public static void h62_25(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006225_0(p0);
}
public static void h62_26(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006226_0(p0);
}
public static void h62_27(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006227_0(p0);
}
private static native long __fieldRead62_0() throws Throwable;
private static native java.lang.String[] __call62_1() throws Throwable;
private static native boolean __integerCategory62_2(int value) throws Throwable;
private static native int __instanceOf62_3(java.lang.Object a0) throws Throwable;
private static native boolean __call62_4(com.moon.J a0, java.lang.Object a1) throws Throwable;
private static native com.moon.J __cast62_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call62_6(com.moon.J a0) throws Throwable;
private static native java.lang.String __call62_7(com.moon.J a0) throws Throwable;
private static native boolean __call62_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory62_9(boolean value) throws Throwable;
private static native boolean __integerCategory62_10(int value) throws Throwable;
private static native java.lang.String __call62_11(com.moon.J a0) throws Throwable;
private static native java.lang.String __call62_12(com.moon.J a0) throws Throwable;
private static native boolean __call62_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory62_14(boolean value) throws Throwable;
private static native boolean __integerCategory62_15(int value) throws Throwable;
private static native int __call62_16(com.moon.J a0) throws Throwable;
private static native int __call62_17(com.moon.J a0) throws Throwable;
private static native boolean __integerCategory62_18(int value) throws Throwable;
private static native int __call62_19(com.moon.J a0) throws Throwable;
private static native int __call62_20(com.moon.J a0) throws Throwable;
private static native boolean __integerCategory62_21(int value) throws Throwable;
private static native boolean __call62_22(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_23(boolean value) throws Throwable;
private static native boolean __call62_24(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_25(boolean value) throws Throwable;
private static native int __integerCategory62_26(boolean value) throws Throwable;
private static native boolean __integerCategory62_27(int value) throws Throwable;
private static native boolean __call62_28(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_29(boolean value) throws Throwable;
private static native com.moon.K __call62_30(com.moon.J a0) throws Throwable;
private static native com.moon.K __call62_31(com.moon.J a0) throws Throwable;
private static native boolean __call62_32(com.moon.K a0, com.moon.K a1) throws Throwable;
private static native int __integerCategory62_33(boolean value) throws Throwable;
private static native boolean __integerCategory62_34(int value) throws Throwable;
private static native long __call62_35(com.moon.J a0) throws Throwable;
private static native long __call62_36(com.moon.J a0) throws Throwable;
private static native int __numericCompare62_37(long a0, long a1) throws Throwable;
private static native boolean __integerCategory62_38(int value) throws Throwable;
private static native boolean __call62_39(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_40(boolean value) throws Throwable;
private static native boolean __call62_41(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_42(boolean value) throws Throwable;
private static native boolean __integerCategory62_43(int value) throws Throwable;
private static native boolean __call62_44(com.moon.J a0) throws Throwable;
private static native boolean __call62_45(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_46(boolean value) throws Throwable;
private static native int __integerCategory62_47(boolean value) throws Throwable;
private static native boolean __integerCategory62_48(int value) throws Throwable;
private static native boolean __call62_49(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_50(boolean value) throws Throwable;
private static native boolean __call62_51(com.moon.J a0) throws Throwable;
private static native int __integerCategory62_52(boolean value) throws Throwable;
private static native int __integerCategory62_53(boolean value) throws Throwable;
private static native boolean __integerCategory62_54(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call62_55(com.moon.J a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call62_56(com.moon.J a0) throws Throwable;
private static native boolean __call62_57(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory62_58(boolean value) throws Throwable;
private static native boolean __integerCategory62_59(int value) throws Throwable;
private static native boolean __integerCategory62_60(int value) throws Throwable;
private static native java.lang.Exception __call1006200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006207_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006208_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006209_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006210_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006211_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006212_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006213_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006214_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006215_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006216_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006217_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006218_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006219_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006220_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006221_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006222_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006223_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006224_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006225_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006226_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006227_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __integerCategoryRepair62_0(boolean value) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_9e7c1ce967455f5f353e(com.moon.J a0) throws E;
private static final class __SourceHandler_9e7c1ce967455f5f353e {

public static int f63(com.moon.J receiver) throws Throwable {
    int forwardValue63_21_0;
    int forwardValue63_34_0;
    int forwardValue63_46_0;
    int forwardValue63_60_0;
    com.moon.J forwardValue63_69_0;
    com.moon.J forwardValue63_81_0;
    int forwardValue63_100_0;
    int forwardValue63_116_0;
    int forwardValue63_132_0;
    int forwardValue63_156_0;
    java.lang.String[] spill63_0;
    int spill63_1;
    com.moon.J spill63_2;
    int spill63_3;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_183;
    forward_join_156: {
    forward_join_146: {
    forward_join_132: {
    forward_join_130: {
    forward_join_116: {
    forward_join_114: {
    forward_join_100: {
    forward_join_98: {
    forward_join_81: {
    forward_join_80: {
    forward_join_69: {
    forward_join_68: {
    forward_join_60: {
    forward_join_56: {
    forward_join_46: {
    forward_join_44: {
    forward_join_34: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead63_0() ^ 117447374326777L);
    spill63_0 = __call63_1();
    life4_7 = __fieldRead63_2(receiver);
    life3_8 = spill63_0;
    spill63_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue63_21_0 = spill63_1;
        break forward_join_21;
    }
    if (!((spill63_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue63_21_0 = __integerCategory63_5(__call63_4(__fieldRead63_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue63_34_0 = forwardValue63_21_0;
        break forward_join_34;
    }
    if (!((forwardValue63_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call63_7(1, __fieldRead63_6(receiver)));
    }
    forwardValue63_34_0 = __integerCategory63_10(__call63_9(__fieldRead63_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue63_46_0 = forwardValue63_34_0;
        break forward_join_46;
    }
    if (!((forwardValue63_34_0 == 0))) {
        break forward_join_44;
    }
    life4_7 = (life4_7 + __call63_12(2, __fieldRead63_11(receiver)));
    }
    forwardValue63_46_0 = __fieldRead63_13(receiver);
    }
    if (!((life3_8 == null))) {
        forwardValue63_60_0 = forwardValue63_46_0;
        break forward_join_60;
    }
    if (!((forwardValue63_46_0 != 0))) {
        break forward_join_56;
    }
    life4_7 = (life4_7 + __call63_15(3, __fieldRead63_14(receiver)));
    }
    spill63_2 = receiver;
    if (!((life3_8 == null))) {
        forwardValue63_69_0 = spill63_2;
        break forward_join_69;
    }
    forwardValue63_60_0 = __fieldRead63_16(spill63_2);
    }
    if (!((forwardValue63_60_0 != 0))) {
        break forward_join_68;
    }
    life4_7 = (life4_7 + __call63_18(4, __fieldRead63_17(receiver)));
    }
    forwardValue63_69_0 = receiver;
    }
    if (!((life3_8 == null))) {
        forwardValue63_81_0 = forwardValue63_69_0;
        break forward_join_81;
    }
    if (!((__fieldRead63_19(forwardValue63_69_0) != null))) {
        break forward_join_80;
    }
    life4_7 = (life4_7 + __call63_21(5, __call63_20(receiver)));
    }
    forwardValue63_81_0 = receiver;
    }
    spill63_3 = __numericCompare63_23(__fieldRead63_22(forwardValue63_81_0), 0L);
    if (!((life3_8 == null))) {
        forwardValue63_100_0 = spill63_3;
        break forward_join_100;
    }
    if (!((spill63_3 != 0))) {
        break forward_join_98;
    }
    life4_7 = (life4_7 + __call63_26(__invokedynamic63_24(23138, (2303912364668794341L ^ life1_3)), __fieldRead63_25(receiver)));
    }
    forwardValue63_100_0 = __integerCategory63_28(__fieldRead63_27(receiver));
    }
    if (!((life3_8 == null))) {
        forwardValue63_116_0 = forwardValue63_100_0;
        break forward_join_116;
    }
    if (!((forwardValue63_100_0 != 0))) {
        break forward_join_114;
    }
    life4_7 = (life4_7 + __call63_31(__invokedynamic63_29(10656, (2872587953644553765L ^ life1_3)), __fieldRead63_30(receiver)));
    }
    forwardValue63_116_0 = __integerCategory63_33(__fieldRead63_32(receiver));
    }
    if (!((life3_8 == null))) {
        forwardValue63_132_0 = forwardValue63_116_0;
        break forward_join_132;
    }
    if (!((forwardValue63_116_0 != 0))) {
        break forward_join_130;
    }
    life4_7 = (life4_7 + __call63_36(__invokedynamic63_34(23131, (8345322271856244183L ^ life1_3)), __fieldRead63_35(receiver)));
    }
    forwardValue63_132_0 = __integerCategory63_38(__fieldRead63_37(receiver));
    }
    if (!((life3_8 == null))) {
        forwardValue63_156_0 = forwardValue63_132_0;
        break forward_join_156;
    }
    if (!((forwardValue63_132_0 != 0))) {
        break forward_join_146;
    }
    life4_7 = (life4_7 + __call63_41(__invokedynamic63_39(2801, (3292765541435237754L ^ life1_3)), __fieldRead63_40(receiver)));
    }
    life4_183 = (life4_7 + __call63_43(__call63_42(receiver)));
    __fieldWrite63_44(receiver, life4_183);
    forwardValue63_156_0 = life4_183;
    }
    return forwardValue63_156_0;
}
public static void h63_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006300_0(p0);
}
public static void h63_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006301_0(p0);
}
public static void h63_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006302_0(p0);
}
public static void h63_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006303_0(p0);
}
public static void h63_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006304_0(p0);
}
public static void h63_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006305_0(p0);
}
public static void h63_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006306_0(p0);
}
public static void h63_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006307_0(p0);
}
public static void h63_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006308_0(p0);
}
public static void h63_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006309_0(p0);
}
public static void h63_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006310_0(p0);
}
private static native long __fieldRead63_0() throws Throwable;
private static native java.lang.String[] __call63_1() throws Throwable;
private static native int __fieldRead63_2(com.moon.J a0) throws Throwable;
private static native java.lang.Object __fieldRead63_3(com.moon.J a0) throws Throwable;
private static native boolean __call63_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory63_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead63_6(com.moon.J a0) throws Throwable;
private static native int __call63_7(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead63_8(com.moon.J a0) throws Throwable;
private static native boolean __call63_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory63_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead63_11(com.moon.J a0) throws Throwable;
private static native int __call63_12(int a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead63_13(com.moon.J a0) throws Throwable;
private static native int __fieldRead63_14(com.moon.J a0) throws Throwable;
private static native int __call63_15(int a0, int a1) throws Throwable;
private static native int __fieldRead63_16(com.moon.J a0) throws Throwable;
private static native int __fieldRead63_17(com.moon.J a0) throws Throwable;
private static native int __call63_18(int a0, int a1) throws Throwable;
private static native com.moon.K __fieldRead63_19(com.moon.J a0) throws Throwable;
private static native com.moon.K __call63_20(com.moon.J a0) throws Throwable;
private static native int __call63_21(int a0, com.moon.K a1) throws Throwable;
private static native long __fieldRead63_22(com.moon.J a0) throws Throwable;
private static native int __numericCompare63_23(long a0, long a1) throws Throwable;
private static native int __invokedynamic63_24(int a0, long a1) throws Throwable;
private static native long __fieldRead63_25(com.moon.J a0) throws Throwable;
private static native int __call63_26(int a0, long a1) throws Throwable;
private static native boolean __fieldRead63_27(com.moon.J a0) throws Throwable;
private static native int __integerCategory63_28(boolean value) throws Throwable;
private static native int __invokedynamic63_29(int a0, long a1) throws Throwable;
private static native boolean __fieldRead63_30(com.moon.J a0) throws Throwable;
private static native int __call63_31(int a0, boolean a1) throws Throwable;
private static native boolean __fieldRead63_32(com.moon.J a0) throws Throwable;
private static native int __integerCategory63_33(boolean value) throws Throwable;
private static native int __invokedynamic63_34(int a0, long a1) throws Throwable;
private static native boolean __fieldRead63_35(com.moon.J a0) throws Throwable;
private static native int __call63_36(int a0, boolean a1) throws Throwable;
private static native boolean __fieldRead63_37(com.moon.J a0) throws Throwable;
private static native int __integerCategory63_38(boolean value) throws Throwable;
private static native int __invokedynamic63_39(int a0, long a1) throws Throwable;
private static native boolean __fieldRead63_40(com.moon.J a0) throws Throwable;
private static native int __call63_41(int a0, boolean a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call63_42(com.moon.J a0) throws Throwable;
private static native int __call63_43(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite63_44(com.moon.J a0, int a1) throws Throwable;
private static native java.lang.Exception __call1006300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006307_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006308_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006309_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006310_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_2ced91d429089a57f4ce(com.moon.J a0) throws E;
private static final class __SourceHandler_2ced91d429089a57f4ce {

public static int f64(com.moon.J receiver) throws Throwable {
    int forwardValue64_19_0;
    int forwardValue64_264_0;
    int spill64_0;
    boolean spill64_1;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_67;
    int life4_79;
    int life4_89;
    int life4_100;
    int life4_110;
    int life4_121;
    int life4_139;
    int life4_165;
    int life4_177;
    int life4_191;
    int life4_203;
    int life4_217;
    int life4_229;
    int life4_243;
    int life4_255;
    int life4_267;
    forward_join_264: {
    forward_join_144: {
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead64_0() ^ 139134463641514L);
    life3_5 = __call64_1();
    spill64_0 = __fieldRead64_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue64_19_0 = spill64_0;
        break forward_join_19;
    }
    if (!((spill64_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead64_3(receiver);
    }
    forwardValue64_19_0 = __invokedynamic64_4(1899, (1807558642363770041L ^ life1_3));
    }
    life4_24 = forwardValue64_19_0;
    life4_35 = ((__invokedynamic64_5(4539, (3583381750620336750L ^ life1_3)) * life4_24) + __call64_7(__call64_6()));
    life4_45 = ((__invokedynamic64_8(21926, (8592717465505396341L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic64_9(20801, (2932247111908160156L ^ life1_3)) * life4_45) + __call64_11(__call64_10(receiver)));
    life4_67 = ((__invokedynamic64_12(22995, (7011202000078797315L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic64_13(26544, (6465565511287587945L ^ life1_3)) * life4_67) + __call64_15(__call64_14(receiver)));
    life4_89 = ((__invokedynamic64_16(22995, (7011202000078797315L ^ life1_3)) * life4_79) + 3);
    life4_100 = ((__invokedynamic64_17(26544, (6465565511287587945L ^ life1_3)) * life4_89) + __call64_18(receiver));
    life4_110 = ((__invokedynamic64_19(22995, (7011202000078797315L ^ life1_3)) * life4_100) + 4);
    life4_121 = ((__invokedynamic64_20(26544, (6465565511287587945L ^ life1_3)) * life4_110) + __call64_21(receiver));
    spill64_1 = __call64_22(receiver);
    if (!((life3_5 == null))) {
        forwardValue64_264_0 = __integerCategory64_23(spill64_1);
        break forward_join_264;
    }
    if (!(spill64_1)) {
        break forward_join_144;
    }
    life4_139 = ((__invokedynamic64_24(22995, (7011202000078797315L ^ life1_3)) * life4_121) + 5);
    life4_121 = ((__invokedynamic64_25(26544, (6465565511287587945L ^ life1_3)) * life4_139) + __call64_27(__call64_26(receiver)));
    }
    life4_165 = ((__invokedynamic64_28(22995, (7011202000078797315L ^ life1_3)) * life4_121) + __invokedynamic64_29(464, (8775411086221713931L ^ life1_3)));
    life4_177 = ((__invokedynamic64_30(26544, (6465565511287587945L ^ life1_3)) * life4_165) + __call64_32(__call64_31(receiver)));
    life4_191 = ((__invokedynamic64_33(22995, (7011202000078797315L ^ life1_3)) * life4_177) + __invokedynamic64_34(13851, (6489102363402048961L ^ life1_3)));
    life4_203 = ((__invokedynamic64_35(26544, (6465565511287587945L ^ life1_3)) * life4_191) + __call64_37(__call64_36(receiver)));
    life4_217 = ((__invokedynamic64_38(22995, (7011202000078797315L ^ life1_3)) * life4_203) + __invokedynamic64_39(25547, (64098126516305941L ^ life1_3)));
    life4_229 = ((__invokedynamic64_40(26544, (6465565511287587945L ^ life1_3)) * life4_217) + __call64_42(__call64_41(receiver)));
    life4_243 = ((__invokedynamic64_43(22995, (7011202000078797315L ^ life1_3)) * life4_229) + __invokedynamic64_44(4976, (6883544901663797420L ^ life1_3)));
    life4_255 = ((__invokedynamic64_45(26544, (6465565511287587945L ^ life1_3)) * life4_243) + __call64_47(__call64_46(receiver)));
    life4_267 = ((__invokedynamic64_48(14607, (940035165363641054L ^ life1_3)) * life4_255) + __call64_50(__call64_49(receiver)));
    __fieldWrite64_51(receiver, life4_267);
    forwardValue64_264_0 = life4_267;
    }
    return forwardValue64_264_0;
}
public static void h64_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006400_0(p0);
}
public static void h64_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006401_0(p0);
}
public static void h64_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006402_0(p0);
}
private static native long __fieldRead64_0() throws Throwable;
private static native java.lang.String[] __call64_1() throws Throwable;
private static native int __fieldRead64_2(com.moon.J a0) throws Throwable;
private static native int __fieldRead64_3(com.moon.J a0) throws Throwable;
private static native int __invokedynamic64_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call64_6() throws Throwable;
private static native int __call64_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic64_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call64_10(com.moon.J a0) throws Throwable;
private static native int __call64_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic64_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call64_14(com.moon.J a0) throws Throwable;
private static native int __call64_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic64_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_17(int a0, long a1) throws Throwable;
private static native int __call64_18(com.moon.J a0) throws Throwable;
private static native int __invokedynamic64_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_20(int a0, long a1) throws Throwable;
private static native int __call64_21(com.moon.J a0) throws Throwable;
private static native boolean __call64_22(com.moon.J a0) throws Throwable;
private static native int __integerCategory64_23(boolean value) throws Throwable;
private static native int __invokedynamic64_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_25(int a0, long a1) throws Throwable;
private static native com.moon.K __call64_26(com.moon.J a0) throws Throwable;
private static native int __call64_27(com.moon.K a0) throws Throwable;
private static native int __invokedynamic64_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_30(int a0, long a1) throws Throwable;
private static native long __call64_31(com.moon.J a0) throws Throwable;
private static native int __call64_32(long a0) throws Throwable;
private static native int __invokedynamic64_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_35(int a0, long a1) throws Throwable;
private static native boolean __call64_36(com.moon.J a0) throws Throwable;
private static native int __call64_37(boolean a0) throws Throwable;
private static native int __invokedynamic64_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_40(int a0, long a1) throws Throwable;
private static native boolean __call64_41(com.moon.J a0) throws Throwable;
private static native int __call64_42(boolean a0) throws Throwable;
private static native int __invokedynamic64_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic64_45(int a0, long a1) throws Throwable;
private static native boolean __call64_46(com.moon.J a0) throws Throwable;
private static native int __call64_47(boolean a0) throws Throwable;
private static native int __invokedynamic64_48(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call64_49(com.moon.J a0) throws Throwable;
private static native int __call64_50(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite64_51(com.moon.J a0, int a1) throws Throwable;
private static native java.lang.Exception __call1006400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006401_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006402_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3fb06e11f18ae65d6dbc(com.moon.J a0) throws E;
private static final class __SourceHandler_3fb06e11f18ae65d6dbc {

public static boolean f65(com.moon.J receiver) throws Throwable {
    int forwardValue65_17_0;
    int forwardValue65_26_0;
    java.lang.String[] spill65_0;
    int spill65_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead65_0() ^ 77194093672828L);
    spill65_0 = __call65_1();
    life4_7 = __fieldRead65_2(receiver);
    life3_8 = spill65_0;
    spill65_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue65_17_0 = spill65_1;
        break forward_join_17;
    }
    if (!((spill65_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory65_3(1);
    }
    forwardValue65_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue65_26_0 = forwardValue65_17_0;
        break forward_join_26;
    }
    if (!((forwardValue65_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory65_4(0);
    }
    __fieldWrite65_5(receiver, 1);
    forwardValue65_26_0 = 1;
    }
    return __integerCategory65_6(forwardValue65_26_0);
}
public static void h65_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006500_0(p0);
}
public static void h65_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006501_0(p0);
}
public static void h65_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006502_0(p0);
}
public static void h65_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006503_0(p0);
}
private static native long __fieldRead65_0() throws Throwable;
private static native java.lang.String[] __call65_1() throws Throwable;
private static native byte __fieldRead65_2(com.moon.J a0) throws Throwable;
private static native boolean __integerCategory65_3(int value) throws Throwable;
private static native boolean __integerCategory65_4(int value) throws Throwable;
private static native void __fieldWrite65_5(com.moon.J a0, int a1) throws Throwable;
private static native boolean __integerCategory65_6(int value) throws Throwable;
private static native java.lang.Exception __call1006500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006503_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7bc16d4ee053078364e5(com.moon.J a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_7bc16d4ee053078364e5 {

public static void f66(com.moon.J receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue66_20_0;
    int forwardValue66_30_0;
    int forwardValue66_42_0;
    com.moon.J forwardValue66_49_0;
    com.moon.J forwardValue66_59_0;
    int forwardValue66_76_0;
    int forwardValue66_90_0;
    int forwardValue66_106_0;
    com.moon.J forwardValue66_117_0;
    boolean spill66_0;
    com.moon.J spill66_1;
    int spill66_2;
    com.moon.J spill66_3;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_117: {
    forward_join_116: {
    forward_join_106: {
    forward_join_102: {
    forward_join_90: {
    forward_join_88: {
    forward_join_76: {
    forward_join_74: {
    forward_join_59: {
    forward_join_58: {
    forward_join_49: {
    forward_join_48: {
    forward_join_42: {
    forward_join_38: {
    forward_join_30: {
    forward_join_28: {
    forward_join_20: {
    forward_join_17: {
    life2_3 = (__fieldRead66_0() ^ 118530554556466L);
    life4_5 = __call66_1();
    spill66_0 = __call66_3(__fieldRead66_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue66_20_0 = __integerCategory66_4(spill66_0);
        break forward_join_20;
    }
    if (!((!spill66_0))) {
        break forward_join_17;
    }
    __call66_6(p0, 1, __fieldRead66_5(receiver));
    }
    forwardValue66_20_0 = __integerCategory66_9(__call66_8(__fieldRead66_7(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue66_30_0 = forwardValue66_20_0;
        break forward_join_30;
    }
    if (!((forwardValue66_20_0 == 0))) {
        break forward_join_28;
    }
    __call66_11(p0, 2, __fieldRead66_10(receiver));
    }
    forwardValue66_30_0 = __fieldRead66_12(receiver);
    }
    if (!((life4_5 == null))) {
        forwardValue66_42_0 = forwardValue66_30_0;
        break forward_join_42;
    }
    if (!((forwardValue66_30_0 != 0))) {
        break forward_join_38;
    }
    __call66_14(p0, 3, __fieldRead66_13(receiver));
    }
    spill66_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue66_49_0 = spill66_1;
        break forward_join_49;
    }
    forwardValue66_42_0 = __fieldRead66_15(spill66_1);
    }
    if (!((forwardValue66_42_0 != 0))) {
        break forward_join_48;
    }
    __call66_17(p0, 4, __fieldRead66_16(receiver));
    }
    forwardValue66_49_0 = receiver;
    }
    if (!((life4_5 == null))) {
        forwardValue66_59_0 = forwardValue66_49_0;
        break forward_join_59;
    }
    if (!((__fieldRead66_18(forwardValue66_49_0) != null))) {
        break forward_join_58;
    }
    __call66_20(p0, 5, __call66_19(receiver));
    }
    forwardValue66_59_0 = receiver;
    }
    spill66_2 = __numericCompare66_22(__fieldRead66_21(forwardValue66_59_0), 0L);
    if (!((life4_5 == null))) {
        forwardValue66_76_0 = spill66_2;
        break forward_join_76;
    }
    if (!((spill66_2 != 0))) {
        break forward_join_74;
    }
    __call66_25(p0, __invokedynamic66_23(23138, (2303913409712295470L ^ life2_3)), __fieldRead66_24(receiver));
    }
    forwardValue66_76_0 = __integerCategory66_27(__fieldRead66_26(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue66_90_0 = forwardValue66_76_0;
        break forward_join_90;
    }
    if (!((forwardValue66_76_0 != 0))) {
        break forward_join_88;
    }
    __call66_30(p0, __invokedynamic66_28(10656, (2872586942960336366L ^ life2_3)), __fieldRead66_29(receiver));
    }
    forwardValue66_90_0 = __integerCategory66_32(__fieldRead66_31(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue66_106_0 = forwardValue66_90_0;
        break forward_join_106;
    }
    if (!((forwardValue66_90_0 != 0))) {
        break forward_join_102;
    }
    __call66_35(p0, __invokedynamic66_33(23131, (8345323460733046300L ^ life2_3)), __fieldRead66_34(receiver));
    }
    spill66_3 = receiver;
    if (!((life4_5 == null))) {
        forwardValue66_117_0 = spill66_3;
        break forward_join_117;
    }
    forwardValue66_106_0 = __integerCategory66_37(__fieldRead66_36(spill66_3));
    }
    if (!((forwardValue66_106_0 != 0))) {
        break forward_join_116;
    }
    __call66_40(p0, __invokedynamic66_38(2801, (3292766625135812273L ^ life2_3)), __fieldRead66_39(receiver));
    }
    forwardValue66_117_0 = receiver;
    }
    __call66_42(__call66_41(forwardValue66_117_0), p0);
    return;
}
public static void h66_0(java.io.IOException p0) throws Throwable {
    throw __call1006600_0(p0);
}
public static void h66_1(java.io.IOException p0) throws Throwable {
    throw __call1006601_0(p0);
}
public static void h66_2(java.io.IOException p0) throws Throwable {
    throw __call1006602_0(p0);
}
public static void h66_3(java.io.IOException p0) throws Throwable {
    throw __call1006603_0(p0);
}
public static void h66_4(java.io.IOException p0) throws Throwable {
    throw __call1006604_0(p0);
}
public static void h66_5(java.io.IOException p0) throws Throwable {
    throw __call1006605_0(p0);
}
public static void h66_6(java.io.IOException p0) throws Throwable {
    throw __call1006606_0(p0);
}
public static void h66_7(java.io.IOException p0) throws Throwable {
    throw __call1006607_0(p0);
}
public static void h66_8(java.io.IOException p0) throws Throwable {
    throw __call1006608_0(p0);
}
public static void h66_9(java.io.IOException p0) throws Throwable {
    throw __call1006609_0(p0);
}
public static void h66_10(java.io.IOException p0) throws Throwable {
    throw __call1006610_0(p0);
}
public static void h66_11(java.io.IOException p0) throws Throwable {
    throw __call1006611_0(p0);
}
public static void h66_12(java.io.IOException p0) throws Throwable {
    throw __call1006612_0(p0);
}
public static void h66_13(java.io.IOException p0) throws Throwable {
    throw __call1006613_0(p0);
}
public static void h66_14(java.io.IOException p0) throws Throwable {
    throw __call1006614_0(p0);
}
public static void h66_15(java.io.IOException p0) throws Throwable {
    throw __call1006615_0(p0);
}
public static void h66_16(java.io.IOException p0) throws Throwable {
    throw __call1006616_0(p0);
}
public static void h66_17(java.io.IOException p0) throws Throwable {
    throw __call1006617_0(p0);
}
private static native long __fieldRead66_0() throws Throwable;
private static native java.lang.String[] __call66_1() throws Throwable;
private static native java.lang.Object __fieldRead66_2(com.moon.J a0) throws Throwable;
private static native boolean __call66_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory66_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead66_5(com.moon.J a0) throws Throwable;
private static native void __call66_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead66_7(com.moon.J a0) throws Throwable;
private static native boolean __call66_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory66_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead66_10(com.moon.J a0) throws Throwable;
private static native void __call66_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native int __fieldRead66_12(com.moon.J a0) throws Throwable;
private static native int __fieldRead66_13(com.moon.J a0) throws Throwable;
private static native void __call66_14(com.google.protobuf.CodedOutputStream a0, int a1, int a2) throws Throwable;
private static native int __fieldRead66_15(com.moon.J a0) throws Throwable;
private static native int __fieldRead66_16(com.moon.J a0) throws Throwable;
private static native void __call66_17(com.google.protobuf.CodedOutputStream a0, int a1, int a2) throws Throwable;
private static native com.moon.K __fieldRead66_18(com.moon.J a0) throws Throwable;
private static native com.moon.K __call66_19(com.moon.J a0) throws Throwable;
private static native void __call66_20(com.google.protobuf.CodedOutputStream a0, int a1, com.moon.K a2) throws Throwable;
private static native long __fieldRead66_21(com.moon.J a0) throws Throwable;
private static native int __numericCompare66_22(long a0, long a1) throws Throwable;
private static native int __invokedynamic66_23(int a0, long a1) throws Throwable;
private static native long __fieldRead66_24(com.moon.J a0) throws Throwable;
private static native void __call66_25(com.google.protobuf.CodedOutputStream a0, int a1, long a2) throws Throwable;
private static native boolean __fieldRead66_26(com.moon.J a0) throws Throwable;
private static native int __integerCategory66_27(boolean value) throws Throwable;
private static native int __invokedynamic66_28(int a0, long a1) throws Throwable;
private static native boolean __fieldRead66_29(com.moon.J a0) throws Throwable;
private static native void __call66_30(com.google.protobuf.CodedOutputStream a0, int a1, boolean a2) throws Throwable;
private static native boolean __fieldRead66_31(com.moon.J a0) throws Throwable;
private static native int __integerCategory66_32(boolean value) throws Throwable;
private static native int __invokedynamic66_33(int a0, long a1) throws Throwable;
private static native boolean __fieldRead66_34(com.moon.J a0) throws Throwable;
private static native void __call66_35(com.google.protobuf.CodedOutputStream a0, int a1, boolean a2) throws Throwable;
private static native boolean __fieldRead66_36(com.moon.J a0) throws Throwable;
private static native int __integerCategory66_37(boolean value) throws Throwable;
private static native int __invokedynamic66_38(int a0, long a1) throws Throwable;
private static native boolean __fieldRead66_39(com.moon.J a0) throws Throwable;
private static native void __call66_40(com.google.protobuf.CodedOutputStream a0, int a1, boolean a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call66_41(com.moon.J a0) throws Throwable;
private static native void __call66_42(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1006600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006602_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006603_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006604_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006605_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006606_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006607_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006608_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006609_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006610_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006611_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006612_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006613_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006614_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006615_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006616_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1006617_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_83dcc8c0330a60f9716d(this, p0); }


public int hashCode() { return __sourceHandlerCall_2ced91d429089a57f4ce(this); }


public com.google.protobuf.ByteString b__ByteString() { return __sourceHandlerCall_945f1dfb1d00dc2b8d25(this); }


public int b() {
return this.d;
}


public com.moon.J b__J() {
return com.moon.J.k;
}


public static com.moon.al b__al() {
return ((com.moon.J)(com.moon.J.k)).c();
}


public boolean b__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public static com.moon.J b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.J)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.J.l)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.J.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public java.lang.String b__String() { return __sourceHandlerCall_3cc2cf37c02e15ff2456(this); }


public static com.moon.J b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.J)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.J.l)), ((java.io.InputStream)(p0)))));
}


public boolean c__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public com.moon.al c() { return __sourceHandlerCall_e8f6608f8bde42e9fcb9(this); }


public boolean d__Boolean() {
return ((((this.i) ? 1 : 0)) != 0);
}


public static com.moon.J a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.J)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.J.l)), ((java.io.InputStream)(p0)))));
}


public static com.moon.J a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.J)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.J.l)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.J a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.J)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.J.l)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.al a__al() {
return com.moon.J.b__al();
}


public static com.moon.J a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.J)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.J.l)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.J.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16041;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/J", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.J.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral80_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/J"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.moon.al a(com.moon.J p0) {
return ((com.moon.al)(((com.moon.J)(com.moon.J.k)).c())).a(((com.moon.J)(p0)));
}


protected com.moon.al a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.al local2 = new com.moon.al(p0);
    return local2;
}


public static com.moon.J a__J() {
return com.moon.J.k;
}


public static com.google.protobuf.Parser<com.moon.J> a__Parser() {
return com.moon.J.l;
}


public com.moon.oH a__oH() {
return ((com.moon.J)(this)).a__K();
}


public long a__Long() {
return this.f;
}


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_b98d758370d28e2c1d5d(this); }


public java.lang.String a__String() { return __sourceHandlerCall_1a75f321c93e656b588c(this); }


public com.moon.K a__K() { return __sourceHandlerCall_c2ad95c51a9a53aec27b(this); }


public int a() {
return this.c;
}


public boolean a__Boolean() { return __sourceHandlerCall_f440f7edd296cbb694a4(this); }


public static com.moon.J a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.J)(((com.google.protobuf.Parser)(com.moon.J.l)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.J a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.J)(((com.google.protobuf.Parser)(com.moon.J.l)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.J a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.J)(((com.google.protobuf.Parser)(com.moon.J.l)).parseFrom(((byte[])(p0)))));
}


public static com.moon.J a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.J)(((com.google.protobuf.Parser)(com.moon.J.l)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.c;
}


public static com.moon.J a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.J)(((com.google.protobuf.Parser)(com.moon.J.l)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static com.moon.J a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.J)(((com.google.protobuf.Parser)(com.moon.J.l)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.J();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_7bc16d4ee053078364e5(this, p0); }


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.J)(this)).c();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.J)(this)).c();
}


public final boolean isInitialized() { return __sourceHandlerCall_3fb06e11f18ae65d6dbc(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.d)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.J.class)), ((java.lang.Class)(com.moon.al.class)));
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.J)(this)).b__J();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.J)(this)).b__J();
}


public com.google.protobuf.Parser<com.moon.J> getParserForType() {
return com.moon.J.l;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_9e7c1ce967455f5f353e(this); }


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.J)(this)).a__al();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.J)(this)).a__al();
}


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.J)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral80_0() throws E;
}
