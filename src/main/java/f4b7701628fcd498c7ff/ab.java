package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class ab extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oZ {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.ab c;

private static com.google.protobuf.Parser<com.moon.ab> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private ab(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private ab() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2087911723258531191L)), ((long)(-8655032310362400956L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(176172755946035L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ab.e ^ 6729636314549L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill43_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill43_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill43_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill43_14 = new byte[8];
    (__sourceSpill43_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill43_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation43_16 = __sourceSpill43_14;
    ((javax.crypto.Cipher)(__sourceSpill43_11)).init(((int)(__sourceSpill43_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill43_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation43_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ã\013¾µ×\007\b\026\0368¶2s­{izQL¶L"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill43_25 = local6_life21;
        int __sourceSpill43_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill43_25)).substring(((int)(__sourceSpill43_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill43_30 = local8_life19;
        int __sourceSpill43_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill43_33 = new byte[8];
        (__sourceSpill43_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill43_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill43_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill43_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill43_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill43_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill43_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill43_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill43_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill43_34)).doFinal(((byte[])(__sourceSpill43_33)));
        (__sourceSpill43_30)[__sourceSpill43_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "1¹ÜC:Ã½32þS×b2"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill43_38 = local6_life21;
        int __sourceSpill43_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill43_38)).substring(((int)(__sourceSpill43_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill43_43 = local8_life19;
        int __sourceSpill43_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill43_46 = new byte[8];
        (__sourceSpill43_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill43_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill43_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill43_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill43_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill43_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill43_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill43_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill43_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill43_47)).doFinal(((byte[])(__sourceSpill43_46)));
        (__sourceSpill43_43)[__sourceSpill43_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.ab)(new com.moon.ab()));
    d = ((com.google.protobuf.Parser)(new com.moon.z()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_b5cdb7ae536b5378db47(com.moon.ab a0) throws E;
private static final class __SourceHandler_b5cdb7ae536b5378db47 {

public static com.google.protobuf.ByteString f227(com.moon.ab receiver) throws Throwable {
    java.lang.Object forwardValue227_24_0;
    java.lang.String[] spill227_0;
    java.lang.Object spill227_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead227_0() ^ 92298487678585L);
    spill227_0 = __call227_1();
    life4_7 = __fieldRead227_2(receiver);
    life3_8 = spill227_0;
    spill227_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue227_24_0 = spill227_1;
        break forward_join_24;
    }
    if (!((__instanceOf227_3(spill227_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call227_5(__cast227_4(life4_7));
    __fieldWrite227_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue227_24_0 = life4_7;
    }
    return __cast227_7(forwardValue227_24_0);
}
public static void h227_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022700_0(p0);
}
private static native long __fieldRead227_0() throws Throwable;
private static native java.lang.String[] __call227_1() throws Throwable;
private static native java.lang.Object __fieldRead227_2(com.moon.ab a0) throws Throwable;
private static native int __instanceOf227_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast227_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call227_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite227_6(com.moon.ab a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast227_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1022700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4cd74c8345821777fd19(com.moon.ab a0) throws E;
private static final class __SourceHandler_4cd74c8345821777fd19 {

public static java.lang.String f228(com.moon.ab receiver) throws Throwable {
    java.lang.Object forwardValue228_18_0;
    java.lang.String[] spill228_0;
    java.lang.Object spill228_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead228_0() ^ 11576318630005L);
    spill228_0 = __call228_1();
    life4_7 = __fieldRead228_2(receiver);
    life3_8 = spill228_0;
    spill228_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue228_18_0 = spill228_1;
        break forward_join_18;
    }
    if (!((__instanceOf228_3(spill228_1) != 0))) {
        break forward_join_17;
    }
    return __cast228_4(life4_7);
    }
    forwardValue228_18_0 = life4_7;
    }
    life5_24 = __cast228_5(forwardValue228_18_0);
    life6_27 = __call228_6(life5_24);
    __fieldWrite228_7(receiver, life6_27);
    return life6_27;
}
public static void h228_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022800_0(p0);
}
public static void h228_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022801_0(p0);
}
private static native long __fieldRead228_0() throws Throwable;
private static native java.lang.String[] __call228_1() throws Throwable;
private static native java.lang.Object __fieldRead228_2(com.moon.ab a0) throws Throwable;
private static native int __instanceOf228_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast228_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast228_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call228_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite228_7(com.moon.ab a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1022800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aD __sourceHandlerCall_8291ba53ddf61f09b965(com.moon.ab a0) throws E;
private static final class __SourceHandler_8291ba53ddf61f09b965 {

public static com.moon.aD f284(com.moon.ab receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead284_0() ^ 106367060115019L);
    return ((receiver == __fieldRead284_1()) ? new com.moon.aD() : __call284_2(new com.moon.aD(), receiver));
}
public static void h284_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1028400_0(p0);
}
private static native long __fieldRead284_0() throws Throwable;
private static native com.moon.ab __fieldRead284_1() throws Throwable;
private static native com.moon.aD __call284_2(com.moon.aD a0, com.moon.ab a1) throws Throwable;
private static native java.lang.Exception __call1028400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_21291193924ff8e5c281(com.moon.ab a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_21291193924ff8e5c281 {

public static boolean f229(com.moon.ab receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue229_14_0;
    java.lang.Object forwardValue229_23_0;
    int forwardValue229_40_0;
    int forwardValue229_46_0;
    java.lang.Object spill229_0;
    boolean spill229_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.ab life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead229_0() ^ 48340955301478L);
    life4_5 = __call229_1();
    spill229_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue229_14_0 = spill229_0;
        break forward_join_14;
    }
    if (!((spill229_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory229_2(1);
    }
    forwardValue229_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue229_23_0 = forwardValue229_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf229_3(forwardValue229_14_0) == 0))) {
        break forward_join_22;
    }
    return __call229_4(receiver, p0);
    }
    forwardValue229_23_0 = p0;
    }
    life5_34 = __cast229_5(forwardValue229_23_0);
    spill229_1 = __call229_8(__call229_6(receiver), __call229_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue229_40_0 = __integerCategory229_9(spill229_1);
        break forward_join_40;
    }
    if (!((!spill229_1))) {
        break forward_join_35;
    }
    return __integerCategory229_10(0);
    }
    forwardValue229_40_0 = __integerCategory229_14(__call229_13(__call229_11(receiver), __call229_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue229_46_0 = forwardValue229_40_0;
        break forward_join_46;
    }
    if (!((forwardValue229_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory229_15(0);
    }
    forwardValue229_46_0 = 1;
    }
    return __integerCategory229_16(forwardValue229_46_0);
}
public static void h229_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022900_0(p0);
}
public static void h229_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022901_0(p0);
}
public static void h229_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022902_0(p0);
}
public static void h229_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022903_0(p0);
}
public static void h229_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022904_0(p0);
}
public static void h229_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022905_0(p0);
}
public static void h229_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022906_0(p0);
}
public static void h229_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022907_0(p0);
}
private static native long __fieldRead229_0() throws Throwable;
private static native java.lang.String[] __call229_1() throws Throwable;
private static native boolean __integerCategory229_2(int value) throws Throwable;
private static native int __instanceOf229_3(java.lang.Object a0) throws Throwable;
private static native boolean __call229_4(com.moon.ab a0, java.lang.Object a1) throws Throwable;
private static native com.moon.ab __cast229_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call229_6(com.moon.ab a0) throws Throwable;
private static native java.lang.String __call229_7(com.moon.ab a0) throws Throwable;
private static native boolean __call229_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory229_9(boolean value) throws Throwable;
private static native boolean __integerCategory229_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call229_11(com.moon.ab a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call229_12(com.moon.ab a0) throws Throwable;
private static native boolean __call229_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory229_14(boolean value) throws Throwable;
private static native boolean __integerCategory229_15(int value) throws Throwable;
private static native boolean __integerCategory229_16(int value) throws Throwable;
private static native java.lang.Exception __call1022900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022906_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022907_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_70aa90d2642b126305e5(com.moon.ab a0) throws E;
private static final class __SourceHandler_70aa90d2642b126305e5 {

public static int f230(com.moon.ab receiver) throws Throwable {
    int forwardValue230_21_0;
    int forwardValue230_41_0;
    java.lang.String[] spill230_0;
    int spill230_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead230_0() ^ 57377904005309L);
    spill230_0 = __call230_1();
    life4_7 = __fieldRead230_2(receiver);
    life3_8 = spill230_0;
    spill230_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue230_21_0 = spill230_1;
        break forward_join_21;
    }
    if (!((spill230_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue230_21_0 = __integerCategory230_5(__call230_4(__fieldRead230_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue230_41_0 = forwardValue230_21_0;
        break forward_join_41;
    }
    if (!((forwardValue230_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call230_7(1, __fieldRead230_6(receiver)));
    }
    life4_44 = (life4_7 + __call230_9(__call230_8(receiver)));
    __fieldWrite230_10(receiver, life4_44);
    forwardValue230_41_0 = life4_44;
    }
    return forwardValue230_41_0;
}
public static void h230_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023000_0(p0);
}
public static void h230_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023001_0(p0);
}
public static void h230_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023002_0(p0);
}
private static native long __fieldRead230_0() throws Throwable;
private static native java.lang.String[] __call230_1() throws Throwable;
private static native int __fieldRead230_2(com.moon.ab a0) throws Throwable;
private static native java.lang.Object __fieldRead230_3(com.moon.ab a0) throws Throwable;
private static native boolean __call230_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory230_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead230_6(com.moon.ab a0) throws Throwable;
private static native int __call230_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call230_8(com.moon.ab a0) throws Throwable;
private static native int __call230_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite230_10(com.moon.ab a0, int a1) throws Throwable;
private static native java.lang.Exception __call1023000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023002_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_4d0467d4e49049d83317(com.moon.ab a0) throws E;
private static final class __SourceHandler_4d0467d4e49049d83317 {

public static int f231(com.moon.ab receiver) throws Throwable {
    int forwardValue231_19_0;
    int spill231_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead231_0() ^ 3035955360696L);
    life3_5 = __call231_1();
    spill231_0 = __fieldRead231_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue231_19_0 = spill231_0;
        break forward_join_19;
    }
    if (!((spill231_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead231_3(receiver);
    }
    forwardValue231_19_0 = __invokedynamic231_4(16858, (7866253690132959966L ^ life1_3));
    }
    life4_24 = forwardValue231_19_0;
    life4_35 = ((__invokedynamic231_5(22975, (8432321605714545336L ^ life1_3)) * life4_24) + __call231_7(__call231_6()));
    life4_45 = ((__invokedynamic231_8(15692, (6551557839650811465L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic231_9(19386, (8607431105656920252L ^ life1_3)) * life4_45) + __call231_11(__call231_10(receiver)));
    life4_69 = ((__invokedynamic231_12(8451, (7349003324937368064L ^ life1_3)) * life4_57) + __call231_14(__call231_13(receiver)));
    __fieldWrite231_15(receiver, life4_69);
    return life4_69;
}
public static void h231_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023100_0(p0);
}
public static void h231_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023101_0(p0);
}
private static native long __fieldRead231_0() throws Throwable;
private static native java.lang.String[] __call231_1() throws Throwable;
private static native int __fieldRead231_2(com.moon.ab a0) throws Throwable;
private static native int __fieldRead231_3(com.moon.ab a0) throws Throwable;
private static native int __invokedynamic231_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic231_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call231_6() throws Throwable;
private static native int __call231_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic231_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic231_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call231_10(com.moon.ab a0) throws Throwable;
private static native int __call231_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic231_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call231_13(com.moon.ab a0) throws Throwable;
private static native int __call231_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite231_15(com.moon.ab a0, int a1) throws Throwable;
private static native java.lang.Exception __call1023100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c2dccfc0e34b060d33bd(com.moon.ab a0) throws E;
private static final class __SourceHandler_c2dccfc0e34b060d33bd {

public static boolean f232(com.moon.ab receiver) throws Throwable {
    int forwardValue232_17_0;
    int forwardValue232_26_0;
    java.lang.String[] spill232_0;
    int spill232_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead232_0() ^ 139889372627229L);
    spill232_0 = __call232_1();
    life4_7 = __fieldRead232_2(receiver);
    life3_8 = spill232_0;
    spill232_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue232_17_0 = spill232_1;
        break forward_join_17;
    }
    if (!((spill232_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory232_3(1);
    }
    forwardValue232_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue232_26_0 = forwardValue232_17_0;
        break forward_join_26;
    }
    if (!((forwardValue232_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory232_4(0);
    }
    __fieldWrite232_5(receiver, 1);
    forwardValue232_26_0 = 1;
    }
    return __integerCategory232_6(forwardValue232_26_0);
}
public static void h232_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023200_0(p0);
}
public static void h232_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023201_0(p0);
}
public static void h232_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023202_0(p0);
}
public static void h232_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1023203_0(p0);
}
private static native long __fieldRead232_0() throws Throwable;
private static native java.lang.String[] __call232_1() throws Throwable;
private static native byte __fieldRead232_2(com.moon.ab a0) throws Throwable;
private static native boolean __integerCategory232_3(int value) throws Throwable;
private static native boolean __integerCategory232_4(int value) throws Throwable;
private static native void __fieldWrite232_5(com.moon.ab a0, int a1) throws Throwable;
private static native boolean __integerCategory232_6(int value) throws Throwable;
private static native java.lang.Exception __call1023200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1023203_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e87b2e4f9f752788334d(com.moon.ab a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_e87b2e4f9f752788334d {

public static void f233(com.moon.ab receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.ab forwardValue233_18_0;
    com.moon.ab spill233_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead233_0() ^ 18469660077767L);
    life4_5 = __call233_1();
    spill233_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue233_18_0 = spill233_0;
        break forward_join_18;
    }
    if (!((!__call233_3(__fieldRead233_2(spill233_0))))) {
        break forward_join_17;
    }
    __call233_5(p0, 1, __fieldRead233_4(receiver));
    }
    forwardValue233_18_0 = receiver;
    }
    __call233_7(__call233_6(forwardValue233_18_0), p0);
    return;
}
public static void h233_0(java.io.IOException p0) throws Throwable {
    throw __call1023300_0(p0);
}
public static void h233_1(java.io.IOException p0) throws Throwable {
    throw __call1023301_0(p0);
}
private static native long __fieldRead233_0() throws Throwable;
private static native java.lang.String[] __call233_1() throws Throwable;
private static native java.lang.Object __fieldRead233_2(com.moon.ab a0) throws Throwable;
private static native boolean __call233_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead233_4(com.moon.ab a0) throws Throwable;
private static native void __call233_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call233_6(com.moon.ab a0) throws Throwable;
private static native void __call233_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1023300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1023301_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_21291193924ff8e5c281(this, p0); }


public int hashCode() { return __sourceHandlerCall_4d0467d4e49049d83317(this); }


public com.moon.ab b__ab() {
return com.moon.ab.c;
}


public static com.moon.aD b() {
return ((com.moon.ab)(com.moon.ab.c)).c();
}


public static com.moon.ab b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ab)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.ab.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ab b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.ab)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.ab.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.aD c() { return __sourceHandlerCall_8291ba53ddf61f09b965(this); }


public static com.moon.ab a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ab)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ab.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aD a(com.moon.ab p0) {
return ((com.moon.aD)(((com.moon.ab)(com.moon.ab.c)).c())).a(((com.moon.ab)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32244;
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
            throw new RuntimeException("com/moon/ab", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.ab a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.ab)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ab.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.aD a__aD() {
return com.moon.ab.b();
}


public static com.google.protobuf.Parser<com.moon.ab> a__Parser() {
return com.moon.ab.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.ab.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ab.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.ab a__ab() {
return com.moon.ab.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral346_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ab"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.aD a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aD local2 = new com.moon.aD(p0);
    return local2;
}


public static com.moon.ab a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ab)(((com.google.protobuf.Parser)(com.moon.ab.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.ab a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ab)(((com.google.protobuf.Parser)(com.moon.ab.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ab a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ab)(((com.google.protobuf.Parser)(com.moon.ab.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o3.c;
}


public java.lang.String a__String() { return __sourceHandlerCall_4cd74c8345821777fd19(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_b5cdb7ae536b5378db47(this); }


public static com.moon.ab a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.ab)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ab.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ab a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.ab)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.ab.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.ab a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ab)(((com.google.protobuf.Parser)(com.moon.ab.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.ab a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ab)(((com.google.protobuf.Parser)(com.moon.ab.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.ab a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.ab)(((com.google.protobuf.Parser)(com.moon.ab.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.ab();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_e87b2e4f9f752788334d(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_c2dccfc0e34b060d33bd(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o3.d)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.ab.class)), ((java.lang.Class)(com.moon.aD.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.ab)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.ab)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.ab)(this)).b__ab();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.ab)(this)).b__ab();
}


public com.google.protobuf.Parser<com.moon.ab> getParserForType() {
return com.moon.ab.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_70aa90d2642b126305e5(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.ab)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.ab)(this)).a__aD();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.ab)(this)).a__aD();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral346_0() throws E;
}
