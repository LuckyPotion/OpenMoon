package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class R extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oP {

private static long serialVersionUID = 0L;

private int a;

private byte b;

private static com.moon.R c;

private static com.google.protobuf.Parser<com.moon.R> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private R(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private R() {
super();
    this.b = -1;
    this.a = 0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-7729324525717456883L)), ((long)(-184998702365845948L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121415854702208L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.R.e ^ 121023183221160L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill15_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill15_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill15_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill15_14 = new byte[8];
    (__sourceSpill15_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill15_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation15_16 = __sourceSpill15_14;
    ((javax.crypto.Cipher)(__sourceSpill15_11)).init(((int)(__sourceSpill15_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill15_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation15_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "cù|H¬»Æ\\øE\n³Ï @Ã(WV"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill15_25 = local6_life21;
        int __sourceSpill15_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill15_25)).substring(((int)(__sourceSpill15_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill15_30 = local8_life19;
        int __sourceSpill15_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill15_33 = new byte[8];
        (__sourceSpill15_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill15_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill15_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill15_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill15_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill15_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill15_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill15_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill15_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill15_34)).doFinal(((byte[])(__sourceSpill15_33)));
        (__sourceSpill15_30)[__sourceSpill15_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = " 14\\áN\"@\031×þÅ7¡´"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill15_38 = local6_life21;
        int __sourceSpill15_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill15_38)).substring(((int)(__sourceSpill15_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill15_43 = local8_life19;
        int __sourceSpill15_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill15_46 = new byte[8];
        (__sourceSpill15_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill15_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill15_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill15_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill15_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill15_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill15_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill15_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill15_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill15_47)).doFinal(((byte[])(__sourceSpill15_46)));
        (__sourceSpill15_43)[__sourceSpill15_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.R)(new com.moon.R()));
    d = ((com.google.protobuf.Parser)(new com.moon.p()));
}

private static native <E extends Throwable> com.moon.ck __sourceHandlerCall_7c39fd085dea314d76f9(com.moon.R a0) throws E;
private static final class __SourceHandler_7c39fd085dea314d76f9 {

public static com.moon.ck f120(com.moon.R receiver) throws Throwable {
    com.moon.ck forwardValue120_15_0;
    com.moon.ck forwardValue120_17_0;
    java.lang.String[] spill120_0;
    com.moon.ck spill120_1;
    long life1_3;
    com.moon.ck life4_8;
    java.lang.String[] life3_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead120_0() ^ 10555745708223L);
    spill120_0 = __call120_1();
    life4_8 = __call120_3(__fieldRead120_2(receiver));
    life3_9 = spill120_0;
    spill120_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue120_15_0 = spill120_1;
        break forward_join_15;
    }
    if (!((spill120_1 == null))) {
        break forward_join_16;
    }
    forwardValue120_15_0 = __fieldRead120_4();
    }
    forwardValue120_17_0 = forwardValue120_15_0;
    break forward_join_17;
    }
    forwardValue120_17_0 = life4_8;
    }
    return forwardValue120_17_0;
}
public static void h120_0(moom.Oo p0) throws Throwable {
    throw __call1012000_0(p0);
}
private static native long __fieldRead120_0() throws Throwable;
private static native java.lang.String[] __call120_1() throws Throwable;
private static native int __fieldRead120_2(com.moon.R a0) throws Throwable;
private static native com.moon.ck __call120_3(int a0) throws Throwable;
private static native com.moon.ck __fieldRead120_4() throws Throwable;
private static native java.lang.Exception __call1012000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.at __sourceHandlerCall_4d8d5b75baa6ab811302(com.moon.R a0) throws E;
private static final class __SourceHandler_4d8d5b75baa6ab811302 {

public static com.moon.at f141(com.moon.R receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead141_0() ^ 32457886936526L);
    return ((receiver == __fieldRead141_1()) ? new com.moon.at() : __call141_2(new com.moon.at(), receiver));
}
public static void h141_0(moom.Oo p0) throws Throwable {
    throw __call1014100_0(p0);
}
private static native long __fieldRead141_0() throws Throwable;
private static native com.moon.R __fieldRead141_1() throws Throwable;
private static native com.moon.at __call141_2(com.moon.at a0, com.moon.R a1) throws Throwable;
private static native java.lang.Exception __call1014100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4b7f4ee80c03e376cb7a(com.moon.R a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_4b7f4ee80c03e376cb7a {

public static boolean f121(com.moon.R receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue121_14_0;
    java.lang.Object forwardValue121_23_0;
    int forwardValue121_39_0;
    int forwardValue121_45_0;
    java.lang.Object spill121_0;
    int spill121_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.R life5_34;
    forward_join_45: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead121_0() ^ 139627333162015L);
    life4_5 = __call121_1();
    spill121_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue121_14_0 = spill121_0;
        break forward_join_14;
    }
    if (!((spill121_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory121_2(1);
    }
    forwardValue121_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue121_23_0 = forwardValue121_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf121_3(forwardValue121_14_0) == 0))) {
        break forward_join_22;
    }
    return __call121_4(receiver, p0);
    }
    forwardValue121_23_0 = p0;
    }
    life5_34 = __cast121_5(forwardValue121_23_0);
    spill121_1 = __fieldRead121_6(receiver);
    if (!((life4_5 == null))) {
        forwardValue121_39_0 = spill121_1;
        break forward_join_39;
    }
    if (!((spill121_1 != __fieldRead121_7(life5_34)))) {
        break forward_join_34;
    }
    return __integerCategory121_8(0);
    }
    forwardValue121_39_0 = __integerCategory121_12(__call121_11(__call121_9(receiver), __call121_10(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue121_45_0 = forwardValue121_39_0;
        break forward_join_45;
    }
    if (!((forwardValue121_39_0 == 0))) {
        break forward_join_44;
    }
    return __integerCategory121_13(0);
    }
    forwardValue121_45_0 = 1;
    }
    return __integerCategory121_14(forwardValue121_45_0);
}
public static void h121_0(moom.Oo p0) throws Throwable {
    throw __call1012100_0(p0);
}
public static void h121_1(moom.Oo p0) throws Throwable {
    throw __call1012101_0(p0);
}
public static void h121_2(moom.Oo p0) throws Throwable {
    throw __call1012102_0(p0);
}
public static void h121_3(moom.Oo p0) throws Throwable {
    throw __call1012103_0(p0);
}
public static void h121_4(moom.Oo p0) throws Throwable {
    throw __call1012104_0(p0);
}
public static void h121_5(moom.Oo p0) throws Throwable {
    throw __call1012105_0(p0);
}
public static void h121_6(moom.Oo p0) throws Throwable {
    throw __call1012106_0(p0);
}
public static void h121_7(moom.Oo p0) throws Throwable {
    throw __call1012107_0(p0);
}
private static native long __fieldRead121_0() throws Throwable;
private static native java.lang.String[] __call121_1() throws Throwable;
private static native boolean __integerCategory121_2(int value) throws Throwable;
private static native int __instanceOf121_3(java.lang.Object a0) throws Throwable;
private static native boolean __call121_4(com.moon.R a0, java.lang.Object a1) throws Throwable;
private static native com.moon.R __cast121_5(java.lang.Object a0) throws Throwable;
private static native int __fieldRead121_6(com.moon.R a0) throws Throwable;
private static native int __fieldRead121_7(com.moon.R a0) throws Throwable;
private static native boolean __integerCategory121_8(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call121_9(com.moon.R a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call121_10(com.moon.R a0) throws Throwable;
private static native boolean __call121_11(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory121_12(boolean value) throws Throwable;
private static native boolean __integerCategory121_13(int value) throws Throwable;
private static native boolean __integerCategory121_14(int value) throws Throwable;
private static native java.lang.Exception __call1012100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012107_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_11a32204ef041769320f(com.moon.R a0) throws E;
private static final class __SourceHandler_11a32204ef041769320f {

public static int f122(com.moon.R receiver) throws Throwable {
    int forwardValue122_22_0;
    int forwardValue122_22_1;
    int forwardValue122_36_0;
    int forwardValue122_36_1;
    java.lang.String[] spill122_0;
    int spill122_1;
    int spill122_2;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_45;
    forward_join_36: {
    forward_join_32: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (__fieldRead122_0() ^ 78521343692752L);
    spill122_0 = __call122_1();
    life4_7 = __fieldRead122_2(receiver);
    life3_8 = spill122_0;
    spill122_1 = life4_7;
    spill122_2 = -1;
    if (!((life3_8 == null))) {
        forwardValue122_22_0 = spill122_1;
        forwardValue122_22_1 = spill122_2;
        break forward_join_22;
    }
    if (!((spill122_1 != spill122_2))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue122_22_0 = __fieldRead122_3(receiver);
    forwardValue122_22_1 = __call122_5(__fieldRead122_4());
    }
    if (!((life3_8 == null))) {
        forwardValue122_36_0 = forwardValue122_22_0;
        forwardValue122_36_1 = forwardValue122_22_1;
        break forward_join_36;
    }
    if (!((forwardValue122_22_0 != forwardValue122_22_1))) {
        break forward_join_32;
    }
    life4_7 = (life4_7 + __call122_7(1, __fieldRead122_6(receiver)));
    }
    forwardValue122_36_0 = life4_7;
    forwardValue122_36_1 = __call122_9(__call122_8(receiver));
    }
    life4_45 = (forwardValue122_36_0 + forwardValue122_36_1);
    __fieldWrite122_10(receiver, life4_45);
    return life4_45;
}
public static void h122_0(moom.Oo p0) throws Throwable {
    throw __call1012200_0(p0);
}
public static void h122_1(moom.Oo p0) throws Throwable {
    throw __call1012201_0(p0);
}
public static void h122_2(moom.Oo p0) throws Throwable {
    throw __call1012202_0(p0);
}
private static native long __fieldRead122_0() throws Throwable;
private static native java.lang.String[] __call122_1() throws Throwable;
private static native int __fieldRead122_2(com.moon.R a0) throws Throwable;
private static native int __fieldRead122_3(com.moon.R a0) throws Throwable;
private static native com.moon.ck __fieldRead122_4() throws Throwable;
private static native int __call122_5(com.moon.ck a0) throws Throwable;
private static native int __fieldRead122_6(com.moon.R a0) throws Throwable;
private static native int __call122_7(int a0, int a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call122_8(com.moon.R a0) throws Throwable;
private static native int __call122_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite122_10(com.moon.R a0, int a1) throws Throwable;
private static native java.lang.Exception __call1012200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012202_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_608249c46aada846f7ff(com.moon.R a0) throws E;
private static final class __SourceHandler_608249c46aada846f7ff {

public static int f123(com.moon.R receiver) throws Throwable {
    int forwardValue123_19_0;
    int spill123_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_56;
    int life4_68;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead123_0() ^ 60793406043010L);
    life3_5 = __call123_1();
    spill123_0 = __fieldRead123_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue123_19_0 = spill123_0;
        break forward_join_19;
    }
    if (!((spill123_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead123_3(receiver);
    }
    forwardValue123_19_0 = __invokedynamic123_4(25339, (2491045707703423070L ^ life1_3));
    }
    life4_24 = forwardValue123_19_0;
    life4_35 = ((__invokedynamic123_5(29353, (4019185215783927823L ^ life1_3)) * life4_24) + __call123_7(__call123_6()));
    life4_45 = ((__invokedynamic123_8(29531, (2810413045900149244L ^ life1_3)) * life4_35) + 1);
    life4_56 = ((__invokedynamic123_9(3808, (2605148467071351876L ^ life1_3)) * life4_45) + __fieldRead123_10(receiver));
    life4_68 = ((__invokedynamic123_11(27213, (8047517773794580719L ^ life1_3)) * life4_56) + __call123_13(__call123_12(receiver)));
    __fieldWrite123_14(receiver, life4_68);
    return life4_68;
}
public static void h123_0(moom.Oo p0) throws Throwable {
    throw __call1012300_0(p0);
}
public static void h123_1(moom.Oo p0) throws Throwable {
    throw __call1012301_0(p0);
}
private static native long __fieldRead123_0() throws Throwable;
private static native java.lang.String[] __call123_1() throws Throwable;
private static native int __fieldRead123_2(com.moon.R a0) throws Throwable;
private static native int __fieldRead123_3(com.moon.R a0) throws Throwable;
private static native int __invokedynamic123_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic123_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call123_6() throws Throwable;
private static native int __call123_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic123_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic123_9(int a0, long a1) throws Throwable;
private static native int __fieldRead123_10(com.moon.R a0) throws Throwable;
private static native int __invokedynamic123_11(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call123_12(com.moon.R a0) throws Throwable;
private static native int __call123_13(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite123_14(com.moon.R a0, int a1) throws Throwable;
private static native java.lang.Exception __call1012300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_005efc7f65205dac1554(com.moon.R a0) throws E;
private static final class __SourceHandler_005efc7f65205dac1554 {

public static boolean f124(com.moon.R receiver) throws Throwable {
    int forwardValue124_17_0;
    int forwardValue124_26_0;
    java.lang.String[] spill124_0;
    int spill124_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead124_0() ^ 46861947085488L);
    spill124_0 = __call124_1();
    life4_7 = __fieldRead124_2(receiver);
    life3_8 = spill124_0;
    spill124_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue124_17_0 = spill124_1;
        break forward_join_17;
    }
    if (!((spill124_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory124_3(1);
    }
    forwardValue124_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue124_26_0 = forwardValue124_17_0;
        break forward_join_26;
    }
    if (!((forwardValue124_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory124_4(0);
    }
    __fieldWrite124_5(receiver, 1);
    forwardValue124_26_0 = 1;
    }
    return __integerCategory124_6(forwardValue124_26_0);
}
public static void h124_0(moom.Oo p0) throws Throwable {
    throw __call1012400_0(p0);
}
public static void h124_1(moom.Oo p0) throws Throwable {
    throw __call1012401_0(p0);
}
public static void h124_2(moom.Oo p0) throws Throwable {
    throw __call1012402_0(p0);
}
public static void h124_3(moom.Oo p0) throws Throwable {
    throw __call1012403_0(p0);
}
private static native long __fieldRead124_0() throws Throwable;
private static native java.lang.String[] __call124_1() throws Throwable;
private static native byte __fieldRead124_2(com.moon.R a0) throws Throwable;
private static native boolean __integerCategory124_3(int value) throws Throwable;
private static native boolean __integerCategory124_4(int value) throws Throwable;
private static native void __fieldWrite124_5(com.moon.R a0, int a1) throws Throwable;
private static native boolean __integerCategory124_6(int value) throws Throwable;
private static native java.lang.Exception __call1012400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1012403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f38fec80d00cb461a3ea(com.moon.R a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_f38fec80d00cb461a3ea {

public static void f125(com.moon.R receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.R forwardValue125_19_0;
    com.moon.R spill125_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (__fieldRead125_0() ^ 14700263348509L);
    life4_5 = __call125_1();
    spill125_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue125_19_0 = spill125_0;
        break forward_join_19;
    }
    if (!((__fieldRead125_2(spill125_0) != __call125_4(__fieldRead125_3())))) {
        break forward_join_18;
    }
    __call125_6(p0, 1, __fieldRead125_5(receiver));
    }
    forwardValue125_19_0 = receiver;
    }
    __call125_8(__call125_7(forwardValue125_19_0), p0);
    return;
}
public static void h125_0(java.io.IOException p0) throws Throwable {
    throw __call1012500_0(p0);
}
public static void h125_1(java.io.IOException p0) throws Throwable {
    throw __call1012501_0(p0);
}
private static native long __fieldRead125_0() throws Throwable;
private static native java.lang.String[] __call125_1() throws Throwable;
private static native int __fieldRead125_2(com.moon.R a0) throws Throwable;
private static native com.moon.ck __fieldRead125_3() throws Throwable;
private static native int __call125_4(com.moon.ck a0) throws Throwable;
private static native int __fieldRead125_5(com.moon.R a0) throws Throwable;
private static native void __call125_6(com.google.protobuf.CodedOutputStream a0, int a1, int a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call125_7(com.moon.R a0) throws Throwable;
private static native void __call125_8(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1012500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1012501_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_4b7f4ee80c03e376cb7a(this, p0); }


public int hashCode() { return __sourceHandlerCall_608249c46aada846f7ff(this); }


public static com.moon.at b__at() {
return ((com.moon.R)(com.moon.R.c)).c();
}


public static com.moon.R b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.R)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.R.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.R b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.R)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.R.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.R b() {
return com.moon.R.c;
}


public com.moon.at c() { return __sourceHandlerCall_4d8d5b75baa6ab811302(this); }


public static com.moon.R a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.R)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.R.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.R.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.at a__at() {
return com.moon.R.b__at();
}


public static com.moon.R a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.R)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.R.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral160_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/R"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.at a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.at local2 = new com.moon.at(p0);
    return local2;
}


public static com.google.protobuf.Parser<com.moon.R> a__Parser() {
return com.moon.R.d;
}


public static com.moon.R a__R() {
return com.moon.R.c;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1659;
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
            throw new RuntimeException("com/moon/R", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.at a(com.moon.R p0) {
return ((com.moon.at)(((com.moon.R)(com.moon.R.c)).c())).a(((com.moon.R)(p0)));
}


public static com.moon.R a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.R)(((com.google.protobuf.Parser)(com.moon.R.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.R a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.R)(((com.google.protobuf.Parser)(com.moon.R.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.R a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.R)(((com.google.protobuf.Parser)(com.moon.R.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public com.moon.ck a__ck() { return __sourceHandlerCall_7c39fd085dea314d76f9(this); }


public int a() {
return this.a;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.o;
}


public static com.moon.R a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.R)(((com.google.protobuf.Parser)(com.moon.R.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.R a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.R)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.R.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.R a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.R)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.R.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.R a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.R)(((com.google.protobuf.Parser)(com.moon.R.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.R a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.R)(((com.google.protobuf.Parser)(com.moon.R.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.R();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_f38fec80d00cb461a3ea(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_005efc7f65205dac1554(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.p)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.R.class)), ((java.lang.Class)(com.moon.at.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.R)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.R)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.R)(this)).b();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.R)(this)).b();
}


public com.google.protobuf.Parser<com.moon.R> getParserForType() {
return com.moon.R.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_11a32204ef041769320f(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.R)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.R)(this)).a__at();
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.R)(this)).a__at();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral160_0() throws E;
}
