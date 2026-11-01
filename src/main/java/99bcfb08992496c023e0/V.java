package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class V extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oT {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private boolean b;

private byte c;

private static com.moon.V d;

private static com.google.protobuf.Parser<com.moon.V> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private V(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private V() {
super();
    this.c = -1;
    this.a = "";
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(5813882492360971361L)), ((long)(-8042116053156940996L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99816968332314L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.V.f ^ 126926662746860L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill19_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill19_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill19_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill19_14 = new byte[8];
    (__sourceSpill19_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill19_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation19_16 = __sourceSpill19_14;
    ((javax.crypto.Cipher)(__sourceSpill19_11)).init(((int)(__sourceSpill19_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill19_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation19_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÆS!êÜÍÂJ4Ó×©\\k\031¼dï2À´Z¬\000)Ìáeiìm\033U>²;"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill19_25 = local6_life21;
        int __sourceSpill19_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill19_25)).substring(((int)(__sourceSpill19_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill19_30 = local8_life19;
        int __sourceSpill19_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill19_33 = new byte[8];
        (__sourceSpill19_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill19_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill19_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill19_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill19_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill19_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill19_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill19_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill19_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill19_34)).doFinal(((byte[])(__sourceSpill19_33)));
        (__sourceSpill19_30)[__sourceSpill19_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "K¾\003©Ï\035=®<¡\r*\016°B"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill19_38 = local6_life21;
        int __sourceSpill19_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill19_38)).substring(((int)(__sourceSpill19_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill19_43 = local8_life19;
        int __sourceSpill19_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill19_46 = new byte[8];
        (__sourceSpill19_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill19_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill19_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill19_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill19_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill19_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill19_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill19_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill19_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill19_47)).doFinal(((byte[])(__sourceSpill19_46)));
        (__sourceSpill19_43)[__sourceSpill19_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.V)(new com.moon.V()));
    e = ((com.google.protobuf.Parser)(new com.moon.t()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_9a9e4db63984e3d46187(com.moon.V a0) throws E;
private static final class __SourceHandler_9a9e4db63984e3d46187 {

public static com.google.protobuf.ByteString f154(com.moon.V receiver) throws Throwable {
    java.lang.Object forwardValue154_24_0;
    java.lang.String[] spill154_0;
    java.lang.Object spill154_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead154_0() ^ 92149023127093L);
    spill154_0 = __call154_1();
    life4_7 = __fieldRead154_2(receiver);
    life3_8 = spill154_0;
    spill154_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue154_24_0 = spill154_1;
        break forward_join_24;
    }
    if (!((__instanceOf154_3(spill154_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call154_5(__cast154_4(life4_7));
    __fieldWrite154_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue154_24_0 = life4_7;
    }
    return __cast154_7(forwardValue154_24_0);
}
public static void h154_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015400_0(p0);
}
private static native long __fieldRead154_0() throws Throwable;
private static native java.lang.String[] __call154_1() throws Throwable;
private static native java.lang.Object __fieldRead154_2(com.moon.V a0) throws Throwable;
private static native int __instanceOf154_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast154_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call154_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite154_6(com.moon.V a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast154_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1015400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_51a41d6bb3eada5e1973(com.moon.V a0) throws E;
private static final class __SourceHandler_51a41d6bb3eada5e1973 {

public static java.lang.String f155(com.moon.V receiver) throws Throwable {
    java.lang.Object forwardValue155_18_0;
    java.lang.String[] spill155_0;
    java.lang.Object spill155_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead155_0() ^ 45135076217958L);
    spill155_0 = __call155_1();
    life4_7 = __fieldRead155_2(receiver);
    life3_8 = spill155_0;
    spill155_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue155_18_0 = spill155_1;
        break forward_join_18;
    }
    if (!((__instanceOf155_3(spill155_1) != 0))) {
        break forward_join_17;
    }
    return __cast155_4(life4_7);
    }
    forwardValue155_18_0 = life4_7;
    }
    life5_24 = __cast155_5(forwardValue155_18_0);
    life6_27 = __call155_6(life5_24);
    __fieldWrite155_7(receiver, life6_27);
    return life6_27;
}
public static void h155_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015500_0(p0);
}
public static void h155_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015501_0(p0);
}
private static native long __fieldRead155_0() throws Throwable;
private static native java.lang.String[] __call155_1() throws Throwable;
private static native java.lang.Object __fieldRead155_2(com.moon.V a0) throws Throwable;
private static native int __instanceOf155_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast155_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast155_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call155_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite155_7(com.moon.V a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1015500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015501_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ax __sourceHandlerCall_caeaa7d10cf30288bf35(com.moon.V a0) throws E;
private static final class __SourceHandler_caeaa7d10cf30288bf35 {

public static com.moon.ax f180(com.moon.V receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead180_0() ^ 75875999858431L);
    return ((receiver == __fieldRead180_1()) ? new com.moon.ax() : __call180_2(new com.moon.ax(), receiver));
}
public static void h180_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1018000_0(p0);
}
private static native long __fieldRead180_0() throws Throwable;
private static native com.moon.V __fieldRead180_1() throws Throwable;
private static native com.moon.ax __call180_2(com.moon.ax a0, com.moon.V a1) throws Throwable;
private static native java.lang.Exception __call1018000_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ef3ed996a83e445b0813(com.moon.V a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_ef3ed996a83e445b0813 {

public static boolean f156(com.moon.V receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue156_14_0;
    java.lang.Object forwardValue156_23_0;
    int forwardValue156_37_0;
    int forwardValue156_49_0;
    int forwardValue156_55_0;
    java.lang.Object spill156_0;
    boolean spill156_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.V life5_34;
    forward_join_55: {
    forward_join_54: {
    forward_join_49: {
    forward_join_44: {
    forward_join_37: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead156_0() ^ 64810964972590L);
    life4_5 = __call156_1();
    spill156_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue156_14_0 = spill156_0;
        break forward_join_14;
    }
    if (!((spill156_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory156_2(1);
    }
    forwardValue156_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue156_23_0 = forwardValue156_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf156_3(forwardValue156_14_0) == 0))) {
        break forward_join_22;
    }
    return __call156_4(receiver, p0);
    }
    forwardValue156_23_0 = p0;
    }
    life5_34 = __cast156_5(forwardValue156_23_0);
    spill156_1 = __call156_8(__call156_6(receiver), __call156_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue156_37_0 = __integerCategory156_9(spill156_1);
        break forward_join_37;
    }
    if (!((!spill156_1))) {
        break forward_join_35;
    }
    return __integerCategory156_10(0);
    }
    forwardValue156_37_0 = __integerCategory156_12(__call156_11(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue156_49_0 = forwardValue156_37_0;
        break forward_join_49;
    }
    if (!((forwardValue156_37_0 != __integerCategoryRepair156_0(__call156_13(life5_34))))) {
        break forward_join_44;
    }
    return __integerCategory156_14(0);
    }
    forwardValue156_49_0 = __integerCategory156_18(__call156_17(__call156_15(receiver), __call156_16(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue156_55_0 = forwardValue156_49_0;
        break forward_join_55;
    }
    if (!((forwardValue156_49_0 == 0))) {
        break forward_join_54;
    }
    return __integerCategory156_19(0);
    }
    forwardValue156_55_0 = 1;
    }
    return __integerCategory156_20(forwardValue156_55_0);
}
public static void h156_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015600_0(p0);
}
public static void h156_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015601_0(p0);
}
public static void h156_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015602_0(p0);
}
public static void h156_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015603_0(p0);
}
public static void h156_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015604_0(p0);
}
public static void h156_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015605_0(p0);
}
public static void h156_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015606_0(p0);
}
public static void h156_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015607_0(p0);
}
public static void h156_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015608_0(p0);
}
public static void h156_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015609_0(p0);
}
private static native long __fieldRead156_0() throws Throwable;
private static native java.lang.String[] __call156_1() throws Throwable;
private static native boolean __integerCategory156_2(int value) throws Throwable;
private static native int __instanceOf156_3(java.lang.Object a0) throws Throwable;
private static native boolean __call156_4(com.moon.V a0, java.lang.Object a1) throws Throwable;
private static native com.moon.V __cast156_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call156_6(com.moon.V a0) throws Throwable;
private static native java.lang.String __call156_7(com.moon.V a0) throws Throwable;
private static native boolean __call156_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory156_9(boolean value) throws Throwable;
private static native boolean __integerCategory156_10(int value) throws Throwable;
private static native boolean __call156_11(com.moon.V a0) throws Throwable;
private static native int __integerCategory156_12(boolean value) throws Throwable;
private static native boolean __call156_13(com.moon.V a0) throws Throwable;
private static native boolean __integerCategory156_14(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call156_15(com.moon.V a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call156_16(com.moon.V a0) throws Throwable;
private static native boolean __call156_17(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory156_18(boolean value) throws Throwable;
private static native boolean __integerCategory156_19(int value) throws Throwable;
private static native boolean __integerCategory156_20(int value) throws Throwable;
private static native java.lang.Exception __call1015600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015603_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015604_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015605_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015606_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015607_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015608_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015609_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __integerCategoryRepair156_0(boolean value) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b53ac2bf1c7f655c2903(com.moon.V a0) throws E;
private static final class __SourceHandler_b53ac2bf1c7f655c2903 {

public static int f157(com.moon.V receiver) throws Throwable {
    int forwardValue157_21_0;
    int forwardValue157_33_0;
    int forwardValue157_53_0;
    java.lang.String[] spill157_0;
    int spill157_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_59;
    forward_join_53: {
    forward_join_43: {
    forward_join_33: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead157_0() ^ 123951579731508L);
    spill157_0 = __call157_1();
    life4_7 = __fieldRead157_2(receiver);
    life3_8 = spill157_0;
    spill157_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue157_21_0 = spill157_1;
        break forward_join_21;
    }
    if (!((spill157_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue157_21_0 = __integerCategory157_5(__call157_4(__fieldRead157_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue157_33_0 = forwardValue157_21_0;
        break forward_join_33;
    }
    if (!((forwardValue157_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call157_7(1, __fieldRead157_6(receiver)));
    }
    forwardValue157_33_0 = __integerCategory157_9(__fieldRead157_8(receiver));
    }
    if (!((life3_8 == null))) {
        forwardValue157_53_0 = forwardValue157_33_0;
        break forward_join_53;
    }
    if (!((forwardValue157_33_0 != 0))) {
        break forward_join_43;
    }
    life4_7 = (life4_7 + __call157_11(2, __fieldRead157_10(receiver)));
    }
    life4_59 = (life4_7 + __call157_13(__call157_12(receiver)));
    __fieldWrite157_14(receiver, life4_59);
    forwardValue157_53_0 = life4_59;
    }
    return forwardValue157_53_0;
}
public static void h157_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015700_0(p0);
}
public static void h157_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015701_0(p0);
}
public static void h157_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015702_0(p0);
}
public static void h157_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015703_0(p0);
}
private static native long __fieldRead157_0() throws Throwable;
private static native java.lang.String[] __call157_1() throws Throwable;
private static native int __fieldRead157_2(com.moon.V a0) throws Throwable;
private static native java.lang.Object __fieldRead157_3(com.moon.V a0) throws Throwable;
private static native boolean __call157_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory157_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead157_6(com.moon.V a0) throws Throwable;
private static native int __call157_7(int a0, java.lang.Object a1) throws Throwable;
private static native boolean __fieldRead157_8(com.moon.V a0) throws Throwable;
private static native int __integerCategory157_9(boolean value) throws Throwable;
private static native boolean __fieldRead157_10(com.moon.V a0) throws Throwable;
private static native int __call157_11(int a0, boolean a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call157_12(com.moon.V a0) throws Throwable;
private static native int __call157_13(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite157_14(com.moon.V a0, int a1) throws Throwable;
private static native java.lang.Exception __call1015700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015703_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_e735c2ef181732eb600a(com.moon.V a0) throws E;
private static final class __SourceHandler_e735c2ef181732eb600a {

public static int f158(com.moon.V receiver) throws Throwable {
    int forwardValue158_19_0;
    int spill158_0;
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
    life1_3 = (__fieldRead158_0() ^ 79600134409434L);
    life3_5 = __call158_1();
    spill158_0 = __fieldRead158_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue158_19_0 = spill158_0;
        break forward_join_19;
    }
    if (!((spill158_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead158_3(receiver);
    }
    forwardValue158_19_0 = __invokedynamic158_4(19179, (2598557373889704206L ^ life1_3));
    }
    life4_24 = forwardValue158_19_0;
    life4_35 = ((__invokedynamic158_5(21239, (5322051834187409686L ^ life1_3)) * life4_24) + __call158_7(__call158_6()));
    life4_45 = ((__invokedynamic158_8(25664, (3952475548718129058L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic158_9(10968, (7811556336357642552L ^ life1_3)) * life4_45) + __call158_11(__call158_10(receiver)));
    life4_67 = ((__invokedynamic158_12(32675, (7000914036559463488L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic158_13(8290, (5730750783163865990L ^ life1_3)) * life4_67) + __call158_15(__call158_14(receiver)));
    life4_91 = ((__invokedynamic158_16(22640, (2488605347112346518L ^ life1_3)) * life4_79) + __call158_18(__call158_17(receiver)));
    __fieldWrite158_19(receiver, life4_91);
    return life4_91;
}
public static void h158_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015800_0(p0);
}
public static void h158_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015801_0(p0);
}
private static native long __fieldRead158_0() throws Throwable;
private static native java.lang.String[] __call158_1() throws Throwable;
private static native int __fieldRead158_2(com.moon.V a0) throws Throwable;
private static native int __fieldRead158_3(com.moon.V a0) throws Throwable;
private static native int __invokedynamic158_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic158_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call158_6() throws Throwable;
private static native int __call158_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic158_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic158_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call158_10(com.moon.V a0) throws Throwable;
private static native int __call158_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic158_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic158_13(int a0, long a1) throws Throwable;
private static native boolean __call158_14(com.moon.V a0) throws Throwable;
private static native int __call158_15(boolean a0) throws Throwable;
private static native int __invokedynamic158_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call158_17(com.moon.V a0) throws Throwable;
private static native int __call158_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite158_19(com.moon.V a0, int a1) throws Throwable;
private static native java.lang.Exception __call1015800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_302412aeaaa9c64f9a38(com.moon.V a0) throws E;
private static final class __SourceHandler_302412aeaaa9c64f9a38 {

public static boolean f159(com.moon.V receiver) throws Throwable {
    int forwardValue159_17_0;
    int forwardValue159_26_0;
    java.lang.String[] spill159_0;
    int spill159_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead159_0() ^ 59247028933720L);
    spill159_0 = __call159_1();
    life4_7 = __fieldRead159_2(receiver);
    life3_8 = spill159_0;
    spill159_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue159_17_0 = spill159_1;
        break forward_join_17;
    }
    if (!((spill159_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory159_3(1);
    }
    forwardValue159_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue159_26_0 = forwardValue159_17_0;
        break forward_join_26;
    }
    if (!((forwardValue159_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory159_4(0);
    }
    __fieldWrite159_5(receiver, 1);
    forwardValue159_26_0 = 1;
    }
    return __integerCategory159_6(forwardValue159_26_0);
}
public static void h159_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015900_0(p0);
}
public static void h159_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015901_0(p0);
}
public static void h159_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015902_0(p0);
}
public static void h159_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015903_0(p0);
}
private static native long __fieldRead159_0() throws Throwable;
private static native java.lang.String[] __call159_1() throws Throwable;
private static native byte __fieldRead159_2(com.moon.V a0) throws Throwable;
private static native boolean __integerCategory159_3(int value) throws Throwable;
private static native boolean __integerCategory159_4(int value) throws Throwable;
private static native void __fieldWrite159_5(com.moon.V a0, int a1) throws Throwable;
private static native boolean __integerCategory159_6(int value) throws Throwable;
private static native java.lang.Exception __call1015900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015903_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f59c10d1aa0f89573adc(com.moon.V a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_f59c10d1aa0f89573adc {

public static void f160(com.moon.V receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue160_21_0;
    com.moon.V forwardValue160_28_0;
    boolean spill160_0;
    com.moon.V spill160_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (__fieldRead160_0() ^ 52328967823662L);
    life4_5 = __call160_1();
    spill160_0 = __call160_3(__fieldRead160_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue160_21_0 = __integerCategory160_4(spill160_0);
        break forward_join_21;
    }
    if (!((!spill160_0))) {
        break forward_join_17;
    }
    __call160_6(p0, 1, __fieldRead160_5(receiver));
    }
    spill160_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue160_28_0 = spill160_1;
        break forward_join_28;
    }
    forwardValue160_21_0 = __integerCategory160_8(__fieldRead160_7(spill160_1));
    }
    if (!((forwardValue160_21_0 != 0))) {
        break forward_join_27;
    }
    __call160_10(p0, 2, __fieldRead160_9(receiver));
    }
    forwardValue160_28_0 = receiver;
    }
    __call160_12(__call160_11(forwardValue160_28_0), p0);
    return;
}
public static void h160_0(java.io.IOException p0) throws Throwable {
    throw __call1016000_0(p0);
}
public static void h160_1(java.io.IOException p0) throws Throwable {
    throw __call1016001_0(p0);
}
public static void h160_2(java.io.IOException p0) throws Throwable {
    throw __call1016002_0(p0);
}
public static void h160_3(java.io.IOException p0) throws Throwable {
    throw __call1016003_0(p0);
}
private static native long __fieldRead160_0() throws Throwable;
private static native java.lang.String[] __call160_1() throws Throwable;
private static native java.lang.Object __fieldRead160_2(com.moon.V a0) throws Throwable;
private static native boolean __call160_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory160_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead160_5(com.moon.V a0) throws Throwable;
private static native void __call160_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native boolean __fieldRead160_7(com.moon.V a0) throws Throwable;
private static native int __integerCategory160_8(boolean value) throws Throwable;
private static native boolean __fieldRead160_9(com.moon.V a0) throws Throwable;
private static native void __call160_10(com.google.protobuf.CodedOutputStream a0, int a1, boolean a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call160_11(com.moon.V a0) throws Throwable;
private static native void __call160_12(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1016000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1016001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1016002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1016003_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_ef3ed996a83e445b0813(this, p0); }


public int hashCode() { return __sourceHandlerCall_e735c2ef181732eb600a(this); }


public com.moon.V b() {
return com.moon.V.d;
}


public static com.moon.V b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.V)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.V.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.V b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.V)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.V.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ax b__ax() {
return ((com.moon.V)(com.moon.V.d)).c();
}


public com.moon.ax c() { return __sourceHandlerCall_caeaa7d10cf30288bf35(this); }


public static com.moon.V a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.V)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.V.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.ax a__ax() {
return com.moon.V.b__ax();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.V.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.V a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.V)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.V.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral202_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/V"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.ax a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ax local2 = new com.moon.ax(p0);
    return local2;
}


public static com.google.protobuf.Parser<com.moon.V> a__Parser() {
return com.moon.V.e;
}


public static com.moon.V a__V() {
return com.moon.V.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.V.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31814;
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
            throw new RuntimeException("com/moon/V", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public static com.moon.ax a(com.moon.V p0) {
return ((com.moon.ax)(((com.moon.V)(com.moon.V.d)).c())).a(((com.moon.V)(p0)));
}


public static com.moon.V a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.V)(((com.google.protobuf.Parser)(com.moon.V.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.V a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.V)(((com.google.protobuf.Parser)(com.moon.V.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.q;
}


public java.lang.String a__String() { return __sourceHandlerCall_51a41d6bb3eada5e1973(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_9a9e4db63984e3d46187(this); }


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public static com.moon.V a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.V)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.V.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.V a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.V)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.V.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.V a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.V)(((com.google.protobuf.Parser)(com.moon.V.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.V a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.V)(((com.google.protobuf.Parser)(com.moon.V.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.V a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.V)(((com.google.protobuf.Parser)(com.moon.V.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.V a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.V)(((com.google.protobuf.Parser)(com.moon.V.e)).parseFrom(((byte[])(p0)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.V();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_f59c10d1aa0f89573adc(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_302412aeaaa9c64f9a38(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.r)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.V.class)), ((java.lang.Class)(com.moon.ax.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.V)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.V)(this)).c();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.V)(this)).b();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.V)(this)).b();
}


public com.google.protobuf.Parser<com.moon.V> getParserForType() {
return com.moon.V.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_b53ac2bf1c7f655c2903(this); }


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.V)(this)).a__ax();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.V)(this)).a__ax();
}


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.V)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral202_0() throws E;
}
