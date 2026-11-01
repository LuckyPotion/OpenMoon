package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class S extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oQ {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private volatile java.lang.Object b;

private byte c;

private static com.moon.S d;

private static com.google.protobuf.Parser<com.moon.S> e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private S(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.c = -1;
}


private S() {
super();
    this.c = -1;
    this.a = "";
    this.b = "";
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-6134383470139016167L)), ((long)(-5248150261815696420L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(154686137121256L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.S.f ^ 99691577784056L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill16_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill16_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill16_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill16_14 = new byte[8];
    (__sourceSpill16_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill16_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation16_16 = __sourceSpill16_14;
    ((javax.crypto.Cipher)(__sourceSpill16_11)).init(((int)(__sourceSpill16_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill16_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation16_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "×\025UÀï·Ç\023\017·u5³4\b¢Ü_±¡K-uý_UG\003(q¥ïêÈ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill16_25 = local6_life21;
        int __sourceSpill16_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill16_25)).substring(((int)(__sourceSpill16_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill16_30 = local8_life19;
        int __sourceSpill16_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill16_33 = new byte[8];
        (__sourceSpill16_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill16_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill16_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill16_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill16_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill16_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill16_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill16_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill16_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill16_34)).doFinal(((byte[])(__sourceSpill16_33)));
        (__sourceSpill16_30)[__sourceSpill16_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "S\016µ&-Îú\b6ýå{7"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill16_38 = local6_life21;
        int __sourceSpill16_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill16_38)).substring(((int)(__sourceSpill16_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill16_43 = local8_life19;
        int __sourceSpill16_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill16_46 = new byte[8];
        (__sourceSpill16_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill16_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill16_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill16_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill16_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill16_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill16_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill16_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill16_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill16_47)).doFinal(((byte[])(__sourceSpill16_46)));
        (__sourceSpill16_43)[__sourceSpill16_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    d = ((com.moon.S)(new com.moon.S()));
    e = ((com.google.protobuf.Parser)(new com.moon.q()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_dab731e5c9677ef586bc(com.moon.S a0) throws E;
private static final class __SourceHandler_dab731e5c9677ef586bc {

public static com.google.protobuf.ByteString f126(com.moon.S receiver) throws Throwable {
    java.lang.Object forwardValue126_24_0;
    java.lang.String[] spill126_0;
    java.lang.Object spill126_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead126_0() ^ 70262400359488L);
    spill126_0 = __call126_1();
    life4_7 = __fieldRead126_2(receiver);
    life3_8 = spill126_0;
    spill126_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue126_24_0 = spill126_1;
        break forward_join_24;
    }
    if (!((__instanceOf126_3(spill126_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call126_5(__cast126_4(life4_7));
    __fieldWrite126_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue126_24_0 = life4_7;
    }
    return __cast126_7(forwardValue126_24_0);
}
public static void h126_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1012600_0(p0);
}
private static native long __fieldRead126_0() throws Throwable;
private static native java.lang.String[] __call126_1() throws Throwable;
private static native java.lang.Object __fieldRead126_2(com.moon.S a0) throws Throwable;
private static native int __instanceOf126_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast126_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call126_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite126_6(com.moon.S a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast126_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1012600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c7dd44112b03870a083a(com.moon.S a0) throws E;
private static final class __SourceHandler_c7dd44112b03870a083a {

public static java.lang.String f127(com.moon.S receiver) throws Throwable {
    java.lang.Object forwardValue127_18_0;
    java.lang.String[] spill127_0;
    java.lang.Object spill127_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead127_0() ^ 111690790747609L);
    spill127_0 = __call127_1();
    life4_7 = __fieldRead127_2(receiver);
    life3_8 = spill127_0;
    spill127_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue127_18_0 = spill127_1;
        break forward_join_18;
    }
    if (!((__instanceOf127_3(spill127_1) != 0))) {
        break forward_join_17;
    }
    return __cast127_4(life4_7);
    }
    forwardValue127_18_0 = life4_7;
    }
    life5_24 = __cast127_5(forwardValue127_18_0);
    life6_27 = __call127_6(life5_24);
    __fieldWrite127_7(receiver, life6_27);
    return life6_27;
}
public static void h127_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1012700_0(p0);
}
public static void h127_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1012701_0(p0);
}
private static native long __fieldRead127_0() throws Throwable;
private static native java.lang.String[] __call127_1() throws Throwable;
private static native java.lang.Object __fieldRead127_2(com.moon.S a0) throws Throwable;
private static native int __instanceOf127_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast127_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast127_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call127_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite127_7(com.moon.S a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1012700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1012701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_8721c40a61baced0f334(com.moon.S a0) throws E;
private static final class __SourceHandler_8721c40a61baced0f334 {

public static com.google.protobuf.ByteString f128(com.moon.S receiver) throws Throwable {
    java.lang.Object forwardValue128_24_0;
    java.lang.String[] spill128_0;
    java.lang.Object spill128_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead128_0() ^ 12620497254115L);
    spill128_0 = __call128_1();
    life4_7 = __fieldRead128_2(receiver);
    life3_8 = spill128_0;
    spill128_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue128_24_0 = spill128_1;
        break forward_join_24;
    }
    if (!((__instanceOf128_3(spill128_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call128_5(__cast128_4(life4_7));
    __fieldWrite128_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue128_24_0 = life4_7;
    }
    return __cast128_7(forwardValue128_24_0);
}
public static void h128_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1012800_0(p0);
}
private static native long __fieldRead128_0() throws Throwable;
private static native java.lang.String[] __call128_1() throws Throwable;
private static native java.lang.Object __fieldRead128_2(com.moon.S a0) throws Throwable;
private static native int __instanceOf128_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast128_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call128_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite128_6(com.moon.S a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast128_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1012800_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_6de5b4e878652428437d(com.moon.S a0) throws E;
private static final class __SourceHandler_6de5b4e878652428437d {

public static java.lang.String f129(com.moon.S receiver) throws Throwable {
    java.lang.Object forwardValue129_18_0;
    java.lang.String[] spill129_0;
    java.lang.Object spill129_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead129_0() ^ 3529317149213L);
    spill129_0 = __call129_1();
    life4_7 = __fieldRead129_2(receiver);
    life3_8 = spill129_0;
    spill129_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue129_18_0 = spill129_1;
        break forward_join_18;
    }
    if (!((__instanceOf129_3(spill129_1) != 0))) {
        break forward_join_17;
    }
    return __cast129_4(life4_7);
    }
    forwardValue129_18_0 = life4_7;
    }
    life5_24 = __cast129_5(forwardValue129_18_0);
    life6_27 = __call129_6(life5_24);
    __fieldWrite129_7(receiver, life6_27);
    return life6_27;
}
public static void h129_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1012900_0(p0);
}
public static void h129_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1012901_0(p0);
}
private static native long __fieldRead129_0() throws Throwable;
private static native java.lang.String[] __call129_1() throws Throwable;
private static native java.lang.Object __fieldRead129_2(com.moon.S a0) throws Throwable;
private static native int __instanceOf129_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast129_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast129_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call129_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite129_7(com.moon.S a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1012900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1012901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.au __sourceHandlerCall_0f876a1a755ed6c8bd85(com.moon.S a0) throws E;
private static final class __SourceHandler_0f876a1a755ed6c8bd85 {

public static com.moon.au f151(com.moon.S receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead151_0() ^ 36734771502068L);
    return ((receiver == __fieldRead151_1()) ? new com.moon.au() : __call151_2(new com.moon.au(), receiver));
}
public static void h151_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015100_0(p0);
}
private static native long __fieldRead151_0() throws Throwable;
private static native com.moon.S __fieldRead151_1() throws Throwable;
private static native com.moon.au __call151_2(com.moon.au a0, com.moon.S a1) throws Throwable;
private static native java.lang.Exception __call1015100_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4141fa6b06a129c4896c(com.moon.S a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_4141fa6b06a129c4896c {

public static boolean f130(com.moon.S receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue130_14_0;
    java.lang.Object forwardValue130_23_0;
    int forwardValue130_40_0;
    int forwardValue130_50_0;
    int forwardValue130_56_0;
    java.lang.Object spill130_0;
    boolean spill130_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.S life5_34;
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
    life2_3 = (__fieldRead130_0() ^ 114939894631745L);
    life4_5 = __call130_1();
    spill130_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue130_14_0 = spill130_0;
        break forward_join_14;
    }
    if (!((spill130_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory130_2(1);
    }
    forwardValue130_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue130_23_0 = forwardValue130_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf130_3(forwardValue130_14_0) == 0))) {
        break forward_join_22;
    }
    return __call130_4(receiver, p0);
    }
    forwardValue130_23_0 = p0;
    }
    life5_34 = __cast130_5(forwardValue130_23_0);
    spill130_1 = __call130_8(__call130_6(receiver), __call130_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue130_40_0 = __integerCategory130_9(spill130_1);
        break forward_join_40;
    }
    if (!((!spill130_1))) {
        break forward_join_35;
    }
    return __integerCategory130_10(0);
    }
    forwardValue130_40_0 = __integerCategory130_14(__call130_13(__call130_11(receiver), __call130_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue130_50_0 = forwardValue130_40_0;
        break forward_join_50;
    }
    if (!((forwardValue130_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory130_15(0);
    }
    forwardValue130_50_0 = __integerCategory130_19(__call130_18(__call130_16(receiver), __call130_17(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue130_56_0 = forwardValue130_50_0;
        break forward_join_56;
    }
    if (!((forwardValue130_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory130_20(0);
    }
    forwardValue130_56_0 = 1;
    }
    return __integerCategory130_21(forwardValue130_56_0);
}
public static void h130_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013000_0(p0);
}
public static void h130_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013001_0(p0);
}
public static void h130_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013002_0(p0);
}
public static void h130_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013003_0(p0);
}
public static void h130_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013004_0(p0);
}
public static void h130_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013005_0(p0);
}
public static void h130_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013006_0(p0);
}
public static void h130_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013007_0(p0);
}
public static void h130_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013008_0(p0);
}
public static void h130_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013009_0(p0);
}
private static native long __fieldRead130_0() throws Throwable;
private static native java.lang.String[] __call130_1() throws Throwable;
private static native boolean __integerCategory130_2(int value) throws Throwable;
private static native int __instanceOf130_3(java.lang.Object a0) throws Throwable;
private static native boolean __call130_4(com.moon.S a0, java.lang.Object a1) throws Throwable;
private static native com.moon.S __cast130_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call130_6(com.moon.S a0) throws Throwable;
private static native java.lang.String __call130_7(com.moon.S a0) throws Throwable;
private static native boolean __call130_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory130_9(boolean value) throws Throwable;
private static native boolean __integerCategory130_10(int value) throws Throwable;
private static native java.lang.String __call130_11(com.moon.S a0) throws Throwable;
private static native java.lang.String __call130_12(com.moon.S a0) throws Throwable;
private static native boolean __call130_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory130_14(boolean value) throws Throwable;
private static native boolean __integerCategory130_15(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call130_16(com.moon.S a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call130_17(com.moon.S a0) throws Throwable;
private static native boolean __call130_18(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory130_19(boolean value) throws Throwable;
private static native boolean __integerCategory130_20(int value) throws Throwable;
private static native boolean __integerCategory130_21(int value) throws Throwable;
private static native java.lang.Exception __call1013000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013005_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013006_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013007_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013008_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013009_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_1a711b8728971d7a7304(com.moon.S a0) throws E;
private static final class __SourceHandler_1a711b8728971d7a7304 {

public static int f131(com.moon.S receiver) throws Throwable {
    int forwardValue131_21_0;
    int forwardValue131_34_0;
    int forwardValue131_54_0;
    java.lang.String[] spill131_0;
    int spill131_1;
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
    life1_3 = (__fieldRead131_0() ^ 130734471166300L);
    spill131_0 = __call131_1();
    life4_7 = __fieldRead131_2(receiver);
    life3_8 = spill131_0;
    spill131_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue131_21_0 = spill131_1;
        break forward_join_21;
    }
    if (!((spill131_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue131_21_0 = __integerCategory131_5(__call131_4(__fieldRead131_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue131_34_0 = forwardValue131_21_0;
        break forward_join_34;
    }
    if (!((forwardValue131_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call131_7(1, __fieldRead131_6(receiver)));
    }
    forwardValue131_34_0 = __integerCategory131_10(__call131_9(__fieldRead131_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue131_54_0 = forwardValue131_34_0;
        break forward_join_54;
    }
    if (!((forwardValue131_34_0 == 0))) {
        break forward_join_44;
    }
    life4_7 = (life4_7 + __call131_12(2, __fieldRead131_11(receiver)));
    }
    life4_60 = (life4_7 + __call131_14(__call131_13(receiver)));
    __fieldWrite131_15(receiver, life4_60);
    forwardValue131_54_0 = life4_60;
    }
    return forwardValue131_54_0;
}
public static void h131_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013100_0(p0);
}
public static void h131_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013101_0(p0);
}
public static void h131_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013102_0(p0);
}
public static void h131_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013103_0(p0);
}
private static native long __fieldRead131_0() throws Throwable;
private static native java.lang.String[] __call131_1() throws Throwable;
private static native int __fieldRead131_2(com.moon.S a0) throws Throwable;
private static native java.lang.Object __fieldRead131_3(com.moon.S a0) throws Throwable;
private static native boolean __call131_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory131_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead131_6(com.moon.S a0) throws Throwable;
private static native int __call131_7(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead131_8(com.moon.S a0) throws Throwable;
private static native boolean __call131_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory131_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead131_11(com.moon.S a0) throws Throwable;
private static native int __call131_12(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call131_13(com.moon.S a0) throws Throwable;
private static native int __call131_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite131_15(com.moon.S a0, int a1) throws Throwable;
private static native java.lang.Exception __call1013100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013103_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_0ce8a8fd7ae7d1c6df5f(com.moon.S a0) throws E;
private static final class __SourceHandler_0ce8a8fd7ae7d1c6df5f {

public static int f132(com.moon.S receiver) throws Throwable {
    int forwardValue132_19_0;
    int spill132_0;
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
    life1_3 = (__fieldRead132_0() ^ 32812255843307L);
    life3_5 = __call132_1();
    spill132_0 = __fieldRead132_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue132_19_0 = spill132_0;
        break forward_join_19;
    }
    if (!((spill132_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead132_3(receiver);
    }
    forwardValue132_19_0 = __invokedynamic132_4(24464, (8334982527120971436L ^ life1_3));
    }
    life4_24 = forwardValue132_19_0;
    life4_35 = ((__invokedynamic132_5(15321, (5684699465209410273L ^ life1_3)) * life4_24) + __call132_7(__call132_6()));
    life4_45 = ((__invokedynamic132_8(29206, (2522690535414840107L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic132_9(27649, (8581286297270461752L ^ life1_3)) * life4_45) + __call132_11(__call132_10(receiver)));
    life4_67 = ((__invokedynamic132_12(24336, (3479118197693519403L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic132_13(28875, (706986168465406453L ^ life1_3)) * life4_67) + __call132_15(__call132_14(receiver)));
    life4_91 = ((__invokedynamic132_16(9314, (2503685704280141149L ^ life1_3)) * life4_79) + __call132_18(__call132_17(receiver)));
    __fieldWrite132_19(receiver, life4_91);
    return life4_91;
}
public static void h132_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013200_0(p0);
}
public static void h132_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013201_0(p0);
}
private static native long __fieldRead132_0() throws Throwable;
private static native java.lang.String[] __call132_1() throws Throwable;
private static native int __fieldRead132_2(com.moon.S a0) throws Throwable;
private static native int __fieldRead132_3(com.moon.S a0) throws Throwable;
private static native int __invokedynamic132_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic132_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call132_6() throws Throwable;
private static native int __call132_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic132_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic132_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call132_10(com.moon.S a0) throws Throwable;
private static native int __call132_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic132_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic132_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call132_14(com.moon.S a0) throws Throwable;
private static native int __call132_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic132_16(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call132_17(com.moon.S a0) throws Throwable;
private static native int __call132_18(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite132_19(com.moon.S a0, int a1) throws Throwable;
private static native java.lang.Exception __call1013200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013201_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3e156b7ae45907bf38a2(com.moon.S a0) throws E;
private static final class __SourceHandler_3e156b7ae45907bf38a2 {

public static boolean f133(com.moon.S receiver) throws Throwable {
    int forwardValue133_17_0;
    int forwardValue133_26_0;
    java.lang.String[] spill133_0;
    int spill133_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead133_0() ^ 8196972800936L);
    spill133_0 = __call133_1();
    life4_7 = __fieldRead133_2(receiver);
    life3_8 = spill133_0;
    spill133_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue133_17_0 = spill133_1;
        break forward_join_17;
    }
    if (!((spill133_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory133_3(1);
    }
    forwardValue133_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue133_26_0 = forwardValue133_17_0;
        break forward_join_26;
    }
    if (!((forwardValue133_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory133_4(0);
    }
    __fieldWrite133_5(receiver, 1);
    forwardValue133_26_0 = 1;
    }
    return __integerCategory133_6(forwardValue133_26_0);
}
public static void h133_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013300_0(p0);
}
public static void h133_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013301_0(p0);
}
public static void h133_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013302_0(p0);
}
public static void h133_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1013303_0(p0);
}
private static native long __fieldRead133_0() throws Throwable;
private static native java.lang.String[] __call133_1() throws Throwable;
private static native byte __fieldRead133_2(com.moon.S a0) throws Throwable;
private static native boolean __integerCategory133_3(int value) throws Throwable;
private static native boolean __integerCategory133_4(int value) throws Throwable;
private static native void __fieldWrite133_5(com.moon.S a0, int a1) throws Throwable;
private static native boolean __integerCategory133_6(int value) throws Throwable;
private static native java.lang.Exception __call1013300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1013303_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_96377812b963ce8e16a2(com.moon.S a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_96377812b963ce8e16a2 {

public static void f134(com.moon.S receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue134_22_0;
    com.moon.S forwardValue134_29_0;
    boolean spill134_0;
    com.moon.S spill134_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    life2_3 = (__fieldRead134_0() ^ 98803949477340L);
    life4_5 = __call134_1();
    spill134_0 = __call134_3(__fieldRead134_2(receiver));
    if (!((life4_5 == null))) {
        forwardValue134_22_0 = __integerCategory134_4(spill134_0);
        break forward_join_22;
    }
    if (!((!spill134_0))) {
        break forward_join_17;
    }
    __call134_6(p0, 1, __fieldRead134_5(receiver));
    }
    spill134_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue134_29_0 = spill134_1;
        break forward_join_29;
    }
    forwardValue134_22_0 = __integerCategory134_9(__call134_8(__fieldRead134_7(spill134_1)));
    }
    if (!((forwardValue134_22_0 == 0))) {
        break forward_join_28;
    }
    __call134_11(p0, 2, __fieldRead134_10(receiver));
    }
    forwardValue134_29_0 = receiver;
    }
    __call134_13(__call134_12(forwardValue134_29_0), p0);
    return;
}
public static void h134_0(java.io.IOException p0) throws Throwable {
    throw __call1013400_0(p0);
}
public static void h134_1(java.io.IOException p0) throws Throwable {
    throw __call1013401_0(p0);
}
public static void h134_2(java.io.IOException p0) throws Throwable {
    throw __call1013402_0(p0);
}
public static void h134_3(java.io.IOException p0) throws Throwable {
    throw __call1013403_0(p0);
}
private static native long __fieldRead134_0() throws Throwable;
private static native java.lang.String[] __call134_1() throws Throwable;
private static native java.lang.Object __fieldRead134_2(com.moon.S a0) throws Throwable;
private static native boolean __call134_3(java.lang.Object a0) throws Throwable;
private static native int __integerCategory134_4(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead134_5(com.moon.S a0) throws Throwable;
private static native void __call134_6(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead134_7(com.moon.S a0) throws Throwable;
private static native boolean __call134_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory134_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead134_10(com.moon.S a0) throws Throwable;
private static native void __call134_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call134_12(com.moon.S a0) throws Throwable;
private static native void __call134_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1013400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1013401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1013402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1013403_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_4141fa6b06a129c4896c(this, p0); }


public int hashCode() { return __sourceHandlerCall_0ce8a8fd7ae7d1c6df5f(this); }


public static com.moon.S b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.S)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.S.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.S b__S() {
return com.moon.S.d;
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_8721c40a61baced0f334(this); }


public static com.moon.S b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.S)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.S.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.au b__au() {
return ((com.moon.S)(com.moon.S.d)).c();
}


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.S.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public java.lang.String b__String() { return __sourceHandlerCall_6de5b4e878652428437d(this); }


public com.moon.au c() { return __sourceHandlerCall_0f876a1a755ed6c8bd85(this); }


public static com.moon.S a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.S)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.S.e)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.au a__au() {
return com.moon.S.b__au();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.S.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.S a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.S)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.S.e)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral170_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/S"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.google.protobuf.Parser<com.moon.S> a__Parser() {
return com.moon.S.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27615;
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
            throw new RuntimeException("com/moon/S", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public static com.moon.S a__S() {
return com.moon.S.d;
}


protected com.moon.au a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.au local2 = new com.moon.au(p0);
    return local2;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.S.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static com.moon.au a(com.moon.S p0) {
return ((com.moon.au)(((com.moon.S)(com.moon.S.d)).c())).a(((com.moon.S)(p0)));
}


public static com.moon.S a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.S)(((com.google.protobuf.Parser)(com.moon.S.e)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.S a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.S)(((com.google.protobuf.Parser)(com.moon.S.e)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.S a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.S)(((com.google.protobuf.Parser)(com.moon.S.e)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.g;
}


public java.lang.String a__String() { return __sourceHandlerCall_c7dd44112b03870a083a(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_dab731e5c9677ef586bc(this); }


public static com.moon.S a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.S)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.S.e)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.S a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.S)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.S.e)), ((java.io.InputStream)(p0)))));
}


public static com.moon.S a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.S)(((com.google.protobuf.Parser)(com.moon.S.e)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.S a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.S)(((com.google.protobuf.Parser)(com.moon.S.e)).parseFrom(((byte[])(p0)))));
}


public static com.moon.S a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.S)(((com.google.protobuf.Parser)(com.moon.S.e)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.S();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_96377812b963ce8e16a2(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_3e156b7ae45907bf38a2(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.h)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.S.class)), ((java.lang.Class)(com.moon.au.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.S)(this)).c();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.S)(this)).c();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.S)(this)).b__S();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.S)(this)).b__S();
}


public com.google.protobuf.Parser<com.moon.S> getParserForType() {
return com.moon.S.e;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_1a711b8728971d7a7304(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.S)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.S)(this)).a__au();
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.S)(this)).a__au();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral170_0() throws E;
}
