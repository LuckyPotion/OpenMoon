package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class U extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oS {

private static long serialVersionUID = 0L;

private int a;

private volatile java.lang.Object b;

private volatile java.lang.Object c;

private byte d;

private static com.moon.U e;

private static com.google.protobuf.Parser<com.moon.U> f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

private U(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.d = -1;
}


private U() {
super();
    this.d = -1;
    this.a = 0;
    this.b = "";
    this.c = "";
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(6902023976202008780L)), ((long)(7541050796437918604L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(115460807639305L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.U.g ^ 118651993883311L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill18_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill18_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill18_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill18_14 = new byte[8];
    (__sourceSpill18_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill18_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation18_16 = __sourceSpill18_14;
    ((javax.crypto.Cipher)(__sourceSpill18_11)).init(((int)(__sourceSpill18_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill18_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation18_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\024HdEe¥ëÑÃZm?J_À¿ùçUSJ&¦EOD|µ¡[Òp%^ÿ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill18_25 = local6_life21;
        int __sourceSpill18_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill18_25)).substring(((int)(__sourceSpill18_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill18_30 = local8_life19;
        int __sourceSpill18_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill18_33 = new byte[8];
        (__sourceSpill18_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill18_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill18_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill18_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill18_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill18_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill18_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill18_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill18_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill18_34)).doFinal(((byte[])(__sourceSpill18_33)));
        (__sourceSpill18_30)[__sourceSpill18_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "CgíZD¢ÁÂÊ Êÿõö\027"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill18_38 = local6_life21;
        int __sourceSpill18_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill18_38)).substring(((int)(__sourceSpill18_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill18_43 = local8_life19;
        int __sourceSpill18_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill18_46 = new byte[8];
        (__sourceSpill18_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill18_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill18_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill18_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill18_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill18_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill18_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill18_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill18_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill18_47)).doFinal(((byte[])(__sourceSpill18_46)));
        (__sourceSpill18_43)[__sourceSpill18_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[7]));
    e = ((com.moon.U)(new com.moon.U()));
    f = ((com.google.protobuf.Parser)(new com.moon.s()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_fc2ecc4c012cd10b6ce5(com.moon.U a0) throws E;
private static final class __SourceHandler_fc2ecc4c012cd10b6ce5 {

public static com.google.protobuf.ByteString f144(com.moon.U receiver) throws Throwable {
    java.lang.Object forwardValue144_24_0;
    java.lang.String[] spill144_0;
    java.lang.Object spill144_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead144_0() ^ 105306304106714L);
    spill144_0 = __call144_1();
    life4_7 = __fieldRead144_2(receiver);
    life3_8 = spill144_0;
    spill144_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue144_24_0 = spill144_1;
        break forward_join_24;
    }
    if (!((__instanceOf144_3(spill144_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call144_5(__cast144_4(life4_7));
    __fieldWrite144_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue144_24_0 = life4_7;
    }
    return __cast144_7(forwardValue144_24_0);
}
public static void h144_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014400_0(p0);
}
private static native long __fieldRead144_0() throws Throwable;
private static native java.lang.String[] __call144_1() throws Throwable;
private static native java.lang.Object __fieldRead144_2(com.moon.U a0) throws Throwable;
private static native int __instanceOf144_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast144_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call144_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite144_6(com.moon.U a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast144_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1014400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_87a22d003b5afaae224d(com.moon.U a0) throws E;
private static final class __SourceHandler_87a22d003b5afaae224d {

public static java.lang.String f145(com.moon.U receiver) throws Throwable {
    java.lang.Object forwardValue145_18_0;
    java.lang.String[] spill145_0;
    java.lang.Object spill145_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead145_0() ^ 32599453173467L);
    spill145_0 = __call145_1();
    life4_7 = __fieldRead145_2(receiver);
    life3_8 = spill145_0;
    spill145_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue145_18_0 = spill145_1;
        break forward_join_18;
    }
    if (!((__instanceOf145_3(spill145_1) != 0))) {
        break forward_join_17;
    }
    return __cast145_4(life4_7);
    }
    forwardValue145_18_0 = life4_7;
    }
    life5_24 = __cast145_5(forwardValue145_18_0);
    life6_27 = __call145_6(life5_24);
    __fieldWrite145_7(receiver, life6_27);
    return life6_27;
}
public static void h145_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014500_0(p0);
}
public static void h145_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014501_0(p0);
}
private static native long __fieldRead145_0() throws Throwable;
private static native java.lang.String[] __call145_1() throws Throwable;
private static native java.lang.Object __fieldRead145_2(com.moon.U a0) throws Throwable;
private static native int __instanceOf145_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast145_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast145_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call145_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite145_7(com.moon.U a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1014500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014501_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ck __sourceHandlerCall_1a56495f0cdc7fa772fe(com.moon.U a0) throws E;
private static final class __SourceHandler_1a56495f0cdc7fa772fe {

public static com.moon.ck f146(com.moon.U receiver) throws Throwable {
    com.moon.ck forwardValue146_15_0;
    com.moon.ck forwardValue146_17_0;
    java.lang.String[] spill146_0;
    com.moon.ck spill146_1;
    long life1_3;
    com.moon.ck life4_8;
    java.lang.String[] life3_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead146_0() ^ 98554248585663L);
    spill146_0 = __call146_1();
    life4_8 = __call146_3(__fieldRead146_2(receiver));
    life3_9 = spill146_0;
    spill146_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue146_15_0 = spill146_1;
        break forward_join_15;
    }
    if (!((spill146_1 == null))) {
        break forward_join_16;
    }
    forwardValue146_15_0 = __fieldRead146_4();
    }
    forwardValue146_17_0 = forwardValue146_15_0;
    break forward_join_17;
    }
    forwardValue146_17_0 = life4_8;
    }
    return forwardValue146_17_0;
}
public static void h146_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014600_0(p0);
}
private static native long __fieldRead146_0() throws Throwable;
private static native java.lang.String[] __call146_1() throws Throwable;
private static native int __fieldRead146_2(com.moon.U a0) throws Throwable;
private static native com.moon.ck __call146_3(int a0) throws Throwable;
private static native com.moon.ck __fieldRead146_4() throws Throwable;
private static native java.lang.Exception __call1014600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_8e73e058d0871d72a10c(com.moon.U a0) throws E;
private static final class __SourceHandler_8e73e058d0871d72a10c {

public static com.google.protobuf.ByteString f147(com.moon.U receiver) throws Throwable {
    java.lang.Object forwardValue147_24_0;
    java.lang.String[] spill147_0;
    java.lang.Object spill147_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead147_0() ^ 75989494061023L);
    spill147_0 = __call147_1();
    life4_7 = __fieldRead147_2(receiver);
    life3_8 = spill147_0;
    spill147_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue147_24_0 = spill147_1;
        break forward_join_24;
    }
    if (!((__instanceOf147_3(spill147_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call147_5(__cast147_4(life4_7));
    __fieldWrite147_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue147_24_0 = life4_7;
    }
    return __cast147_7(forwardValue147_24_0);
}
public static void h147_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014700_0(p0);
}
private static native long __fieldRead147_0() throws Throwable;
private static native java.lang.String[] __call147_1() throws Throwable;
private static native java.lang.Object __fieldRead147_2(com.moon.U a0) throws Throwable;
private static native int __instanceOf147_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast147_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call147_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite147_6(com.moon.U a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast147_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1014700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_a78308c2007fe02cfd89(com.moon.U a0) throws E;
private static final class __SourceHandler_a78308c2007fe02cfd89 {

public static java.lang.String f148(com.moon.U receiver) throws Throwable {
    java.lang.Object forwardValue148_18_0;
    java.lang.String[] spill148_0;
    java.lang.Object spill148_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead148_0() ^ 31928121992207L);
    spill148_0 = __call148_1();
    life4_7 = __fieldRead148_2(receiver);
    life3_8 = spill148_0;
    spill148_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue148_18_0 = spill148_1;
        break forward_join_18;
    }
    if (!((__instanceOf148_3(spill148_1) != 0))) {
        break forward_join_17;
    }
    return __cast148_4(life4_7);
    }
    forwardValue148_18_0 = life4_7;
    }
    life5_24 = __cast148_5(forwardValue148_18_0);
    life6_27 = __call148_6(life5_24);
    __fieldWrite148_7(receiver, life6_27);
    return life6_27;
}
public static void h148_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014800_0(p0);
}
public static void h148_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014801_0(p0);
}
private static native long __fieldRead148_0() throws Throwable;
private static native java.lang.String[] __call148_1() throws Throwable;
private static native java.lang.Object __fieldRead148_2(com.moon.U a0) throws Throwable;
private static native int __instanceOf148_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast148_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast148_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call148_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite148_7(com.moon.U a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1014800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aw __sourceHandlerCall_ba9d7f6d36a7670a7289(com.moon.U a0) throws E;
private static final class __SourceHandler_ba9d7f6d36a7670a7289 {

public static com.moon.aw f172(com.moon.U receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead172_0() ^ 108481344926271L);
    return ((receiver == __fieldRead172_1()) ? new com.moon.aw() : __call172_2(new com.moon.aw(), receiver));
}
public static void h172_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1017200_0(p0);
}
private static native long __fieldRead172_0() throws Throwable;
private static native com.moon.U __fieldRead172_1() throws Throwable;
private static native com.moon.aw __call172_2(com.moon.aw a0, com.moon.U a1) throws Throwable;
private static native java.lang.Exception __call1017200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b6330f45779a6c860645(com.moon.U a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_b6330f45779a6c860645 {

public static boolean f149(com.moon.U receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue149_14_0;
    java.lang.Object forwardValue149_23_0;
    int forwardValue149_39_0;
    int forwardValue149_49_0;
    int forwardValue149_59_0;
    int forwardValue149_65_0;
    java.lang.Object spill149_0;
    int spill149_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.U life5_34;
    forward_join_65: {
    forward_join_64: {
    forward_join_59: {
    forward_join_54: {
    forward_join_49: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead149_0() ^ 70712831817670L);
    life4_5 = __call149_1();
    spill149_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue149_14_0 = spill149_0;
        break forward_join_14;
    }
    if (!((spill149_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory149_2(1);
    }
    forwardValue149_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue149_23_0 = forwardValue149_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf149_3(forwardValue149_14_0) == 0))) {
        break forward_join_22;
    }
    return __call149_4(receiver, p0);
    }
    forwardValue149_23_0 = p0;
    }
    life5_34 = __cast149_5(forwardValue149_23_0);
    spill149_1 = __fieldRead149_6(receiver);
    if (!((life4_5 == null))) {
        forwardValue149_39_0 = spill149_1;
        break forward_join_39;
    }
    if (!((spill149_1 != __fieldRead149_7(life5_34)))) {
        break forward_join_34;
    }
    return __integerCategory149_8(0);
    }
    forwardValue149_39_0 = __integerCategory149_12(__call149_11(__call149_9(receiver), __call149_10(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue149_49_0 = forwardValue149_39_0;
        break forward_join_49;
    }
    if (!((forwardValue149_39_0 == 0))) {
        break forward_join_44;
    }
    return __integerCategory149_13(0);
    }
    forwardValue149_49_0 = __integerCategory149_17(__call149_16(__call149_14(receiver), __call149_15(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue149_59_0 = forwardValue149_49_0;
        break forward_join_59;
    }
    if (!((forwardValue149_49_0 == 0))) {
        break forward_join_54;
    }
    return __integerCategory149_18(0);
    }
    forwardValue149_59_0 = __integerCategory149_22(__call149_21(__call149_19(receiver), __call149_20(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue149_65_0 = forwardValue149_59_0;
        break forward_join_65;
    }
    if (!((forwardValue149_59_0 == 0))) {
        break forward_join_64;
    }
    return __integerCategory149_23(0);
    }
    forwardValue149_65_0 = 1;
    }
    return __integerCategory149_24(forwardValue149_65_0);
}
public static void h149_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014900_0(p0);
}
public static void h149_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014901_0(p0);
}
public static void h149_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014902_0(p0);
}
public static void h149_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014903_0(p0);
}
public static void h149_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014904_0(p0);
}
public static void h149_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014905_0(p0);
}
public static void h149_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014906_0(p0);
}
public static void h149_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014907_0(p0);
}
public static void h149_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014908_0(p0);
}
public static void h149_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014909_0(p0);
}
public static void h149_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014910_0(p0);
}
public static void h149_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1014911_0(p0);
}
private static native long __fieldRead149_0() throws Throwable;
private static native java.lang.String[] __call149_1() throws Throwable;
private static native boolean __integerCategory149_2(int value) throws Throwable;
private static native int __instanceOf149_3(java.lang.Object a0) throws Throwable;
private static native boolean __call149_4(com.moon.U a0, java.lang.Object a1) throws Throwable;
private static native com.moon.U __cast149_5(java.lang.Object a0) throws Throwable;
private static native int __fieldRead149_6(com.moon.U a0) throws Throwable;
private static native int __fieldRead149_7(com.moon.U a0) throws Throwable;
private static native boolean __integerCategory149_8(int value) throws Throwable;
private static native java.lang.String __call149_9(com.moon.U a0) throws Throwable;
private static native java.lang.String __call149_10(com.moon.U a0) throws Throwable;
private static native boolean __call149_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_12(boolean value) throws Throwable;
private static native boolean __integerCategory149_13(int value) throws Throwable;
private static native java.lang.String __call149_14(com.moon.U a0) throws Throwable;
private static native java.lang.String __call149_15(com.moon.U a0) throws Throwable;
private static native boolean __call149_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory149_17(boolean value) throws Throwable;
private static native boolean __integerCategory149_18(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call149_19(com.moon.U a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call149_20(com.moon.U a0) throws Throwable;
private static native boolean __call149_21(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory149_22(boolean value) throws Throwable;
private static native boolean __integerCategory149_23(int value) throws Throwable;
private static native boolean __integerCategory149_24(int value) throws Throwable;
private static native java.lang.Exception __call1014900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014902_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014903_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014904_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014905_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014906_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014907_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014908_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014909_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014910_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1014911_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c785e8c4e8c061078425(com.moon.U a0) throws E;
private static final class __SourceHandler_c785e8c4e8c061078425 {

public static int f150(com.moon.U receiver) throws Throwable {
    int forwardValue150_24_0;
    int forwardValue150_24_1;
    int forwardValue150_35_0;
    int forwardValue150_48_0;
    int forwardValue150_68_0;
    java.lang.String[] spill150_0;
    int spill150_1;
    int spill150_2;
    int spill150_3;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_77;
    forward_join_68: {
    forward_join_58: {
    forward_join_48: {
    forward_join_45: {
    forward_join_35: {
    forward_join_32: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (__fieldRead150_0() ^ 124790544860604L);
    spill150_0 = __call150_1();
    life4_7 = __fieldRead150_2(receiver);
    life3_8 = spill150_0;
    spill150_1 = life4_7;
    spill150_2 = -1;
    if (!((life3_8 == null))) {
        forwardValue150_24_0 = spill150_1;
        forwardValue150_24_1 = spill150_2;
        break forward_join_24;
    }
    if (!((spill150_1 != spill150_2))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    spill150_3 = __fieldRead150_3(receiver);
    if (!((life3_8 == null))) {
        forwardValue150_35_0 = spill150_3;
        break forward_join_35;
    }
    forwardValue150_24_0 = spill150_3;
    forwardValue150_24_1 = __call150_5(__fieldRead150_4());
    }
    if (!((forwardValue150_24_0 != forwardValue150_24_1))) {
        break forward_join_32;
    }
    life4_7 = (life4_7 + __call150_7(1, __fieldRead150_6(receiver)));
    }
    forwardValue150_35_0 = __integerCategory150_10(__call150_9(__fieldRead150_8(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue150_48_0 = forwardValue150_35_0;
        break forward_join_48;
    }
    if (!((forwardValue150_35_0 == 0))) {
        break forward_join_45;
    }
    life4_7 = (life4_7 + __call150_12(2, __fieldRead150_11(receiver)));
    }
    forwardValue150_48_0 = __integerCategory150_15(__call150_14(__fieldRead150_13(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue150_68_0 = forwardValue150_48_0;
        break forward_join_68;
    }
    if (!((forwardValue150_48_0 == 0))) {
        break forward_join_58;
    }
    life4_7 = (life4_7 + __call150_17(3, __fieldRead150_16(receiver)));
    }
    life4_77 = (life4_7 + __call150_19(__call150_18(receiver)));
    __fieldWrite150_20(receiver, life4_77);
    forwardValue150_68_0 = life4_77;
    }
    return forwardValue150_68_0;
}
public static void h150_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015000_0(p0);
}
public static void h150_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015001_0(p0);
}
public static void h150_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015002_0(p0);
}
public static void h150_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015003_0(p0);
}
public static void h150_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015004_0(p0);
}
private static native long __fieldRead150_0() throws Throwable;
private static native java.lang.String[] __call150_1() throws Throwable;
private static native int __fieldRead150_2(com.moon.U a0) throws Throwable;
private static native int __fieldRead150_3(com.moon.U a0) throws Throwable;
private static native com.moon.ck __fieldRead150_4() throws Throwable;
private static native int __call150_5(com.moon.ck a0) throws Throwable;
private static native int __fieldRead150_6(com.moon.U a0) throws Throwable;
private static native int __call150_7(int a0, int a1) throws Throwable;
private static native java.lang.Object __fieldRead150_8(com.moon.U a0) throws Throwable;
private static native boolean __call150_9(java.lang.Object a0) throws Throwable;
private static native int __integerCategory150_10(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead150_11(com.moon.U a0) throws Throwable;
private static native int __call150_12(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead150_13(com.moon.U a0) throws Throwable;
private static native boolean __call150_14(java.lang.Object a0) throws Throwable;
private static native int __integerCategory150_15(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead150_16(com.moon.U a0) throws Throwable;
private static native int __call150_17(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call150_18(com.moon.U a0) throws Throwable;
private static native int __call150_19(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite150_20(com.moon.U a0, int a1) throws Throwable;
private static native java.lang.Exception __call1015000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015004_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_e433dcc00a3dabdfcb93(com.moon.U a0) throws E;
private static final class __SourceHandler_e433dcc00a3dabdfcb93 {

public static int f151(com.moon.U receiver) throws Throwable {
    int forwardValue151_19_0;
    int spill151_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_56;
    int life4_66;
    int life4_78;
    int life4_88;
    int life4_100;
    int life4_112;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead151_0() ^ 111182839329744L);
    life3_5 = __call151_1();
    spill151_0 = __fieldRead151_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue151_19_0 = spill151_0;
        break forward_join_19;
    }
    if (!((spill151_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead151_3(receiver);
    }
    forwardValue151_19_0 = __invokedynamic151_4(8395, (7738335963619544459L ^ life1_3));
    }
    life4_24 = forwardValue151_19_0;
    life4_35 = ((__invokedynamic151_5(31098, (2584504151523431483L ^ life1_3)) * life4_24) + __call151_7(__call151_6()));
    life4_45 = ((__invokedynamic151_8(16032, (6451854242610631655L ^ life1_3)) * life4_35) + 1);
    life4_56 = ((__invokedynamic151_9(22759, (6959496965988464033L ^ life1_3)) * life4_45) + __fieldRead151_10(receiver));
    life4_66 = ((__invokedynamic151_11(25585, (312210446723092148L ^ life1_3)) * life4_56) + 2);
    life4_78 = ((__invokedynamic151_12(6550, (6053013260979074260L ^ life1_3)) * life4_66) + __call151_14(__call151_13(receiver)));
    life4_88 = ((__invokedynamic151_15(25585, (312210446723092148L ^ life1_3)) * life4_78) + 3);
    life4_100 = ((__invokedynamic151_16(6550, (6053013260979074260L ^ life1_3)) * life4_88) + __call151_18(__call151_17(receiver)));
    life4_112 = ((__invokedynamic151_19(23254, (5320348905514121106L ^ life1_3)) * life4_100) + __call151_21(__call151_20(receiver)));
    __fieldWrite151_22(receiver, life4_112);
    return life4_112;
}
public static void h151_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015100_0(p0);
}
public static void h151_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015101_0(p0);
}
private static native long __fieldRead151_0() throws Throwable;
private static native java.lang.String[] __call151_1() throws Throwable;
private static native int __fieldRead151_2(com.moon.U a0) throws Throwable;
private static native int __fieldRead151_3(com.moon.U a0) throws Throwable;
private static native int __invokedynamic151_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic151_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call151_6() throws Throwable;
private static native int __call151_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic151_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic151_9(int a0, long a1) throws Throwable;
private static native int __fieldRead151_10(com.moon.U a0) throws Throwable;
private static native int __invokedynamic151_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic151_12(int a0, long a1) throws Throwable;
private static native java.lang.String __call151_13(com.moon.U a0) throws Throwable;
private static native int __call151_14(java.lang.String a0) throws Throwable;
private static native int __invokedynamic151_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic151_16(int a0, long a1) throws Throwable;
private static native java.lang.String __call151_17(com.moon.U a0) throws Throwable;
private static native int __call151_18(java.lang.String a0) throws Throwable;
private static native int __invokedynamic151_19(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call151_20(com.moon.U a0) throws Throwable;
private static native int __call151_21(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite151_22(com.moon.U a0, int a1) throws Throwable;
private static native java.lang.Exception __call1015100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b12238b00a60ded0d804(com.moon.U a0) throws E;
private static final class __SourceHandler_b12238b00a60ded0d804 {

public static boolean f152(com.moon.U receiver) throws Throwable {
    int forwardValue152_17_0;
    int forwardValue152_26_0;
    java.lang.String[] spill152_0;
    int spill152_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead152_0() ^ 55207722500641L);
    spill152_0 = __call152_1();
    life4_7 = __fieldRead152_2(receiver);
    life3_8 = spill152_0;
    spill152_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue152_17_0 = spill152_1;
        break forward_join_17;
    }
    if (!((spill152_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory152_3(1);
    }
    forwardValue152_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue152_26_0 = forwardValue152_17_0;
        break forward_join_26;
    }
    if (!((forwardValue152_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory152_4(0);
    }
    __fieldWrite152_5(receiver, 1);
    forwardValue152_26_0 = 1;
    }
    return __integerCategory152_6(forwardValue152_26_0);
}
public static void h152_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015200_0(p0);
}
public static void h152_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015201_0(p0);
}
public static void h152_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015202_0(p0);
}
public static void h152_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1015203_0(p0);
}
private static native long __fieldRead152_0() throws Throwable;
private static native java.lang.String[] __call152_1() throws Throwable;
private static native byte __fieldRead152_2(com.moon.U a0) throws Throwable;
private static native boolean __integerCategory152_3(int value) throws Throwable;
private static native boolean __integerCategory152_4(int value) throws Throwable;
private static native void __fieldWrite152_5(com.moon.U a0, int a1) throws Throwable;
private static native boolean __integerCategory152_6(int value) throws Throwable;
private static native java.lang.Exception __call1015200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1015203_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b9cfd7f64116959faf8c(com.moon.U a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_b9cfd7f64116959faf8c {

public static void f153(com.moon.U receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue153_21_0;
    int forwardValue153_34_0;
    com.moon.U forwardValue153_41_0;
    int spill153_0;
    com.moon.U spill153_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_34: {
    forward_join_29: {
    forward_join_21: {
    forward_join_18: {
    life2_3 = (__fieldRead153_0() ^ 44527066828166L);
    life4_5 = __call153_1();
    spill153_0 = __fieldRead153_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue153_21_0 = spill153_0;
        break forward_join_21;
    }
    if (!((spill153_0 != __call153_4(__fieldRead153_3())))) {
        break forward_join_18;
    }
    __call153_6(p0, 1, __fieldRead153_5(receiver));
    }
    forwardValue153_21_0 = __integerCategory153_9(__call153_8(__fieldRead153_7(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue153_34_0 = forwardValue153_21_0;
        break forward_join_34;
    }
    if (!((forwardValue153_21_0 == 0))) {
        break forward_join_29;
    }
    __call153_11(p0, 2, __fieldRead153_10(receiver));
    }
    spill153_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue153_41_0 = spill153_1;
        break forward_join_41;
    }
    forwardValue153_34_0 = __integerCategory153_14(__call153_13(__fieldRead153_12(spill153_1)));
    }
    if (!((forwardValue153_34_0 == 0))) {
        break forward_join_40;
    }
    __call153_16(p0, 3, __fieldRead153_15(receiver));
    }
    forwardValue153_41_0 = receiver;
    }
    __call153_18(__call153_17(forwardValue153_41_0), p0);
    return;
}
public static void h153_0(java.io.IOException p0) throws Throwable {
    throw __call1015300_0(p0);
}
public static void h153_1(java.io.IOException p0) throws Throwable {
    throw __call1015301_0(p0);
}
public static void h153_2(java.io.IOException p0) throws Throwable {
    throw __call1015302_0(p0);
}
public static void h153_3(java.io.IOException p0) throws Throwable {
    throw __call1015303_0(p0);
}
public static void h153_4(java.io.IOException p0) throws Throwable {
    throw __call1015304_0(p0);
}
public static void h153_5(java.io.IOException p0) throws Throwable {
    throw __call1015305_0(p0);
}
private static native long __fieldRead153_0() throws Throwable;
private static native java.lang.String[] __call153_1() throws Throwable;
private static native int __fieldRead153_2(com.moon.U a0) throws Throwable;
private static native com.moon.ck __fieldRead153_3() throws Throwable;
private static native int __call153_4(com.moon.ck a0) throws Throwable;
private static native int __fieldRead153_5(com.moon.U a0) throws Throwable;
private static native void __call153_6(com.google.protobuf.CodedOutputStream a0, int a1, int a2) throws Throwable;
private static native java.lang.Object __fieldRead153_7(com.moon.U a0) throws Throwable;
private static native boolean __call153_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory153_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead153_10(com.moon.U a0) throws Throwable;
private static native void __call153_11(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead153_12(com.moon.U a0) throws Throwable;
private static native boolean __call153_13(java.lang.Object a0) throws Throwable;
private static native int __integerCategory153_14(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead153_15(com.moon.U a0) throws Throwable;
private static native void __call153_16(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call153_17(com.moon.U a0) throws Throwable;
private static native void __call153_18(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1015300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1015301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1015302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1015303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1015304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1015305_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_b6330f45779a6c860645(this, p0); }


public int hashCode() { return __sourceHandlerCall_e433dcc00a3dabdfcb93(this); }


public static com.moon.U b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.U)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.U.f)), ((java.io.InputStream)(p0)))));
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_8e73e058d0871d72a10c(this); }


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.U.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public com.moon.U b__U() {
return com.moon.U.e;
}


public static com.moon.aw b__aw() {
return ((com.moon.U)(com.moon.U.e)).c();
}


public static com.moon.U b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.U)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.U.f)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public java.lang.String b__String() { return __sourceHandlerCall_a78308c2007fe02cfd89(this); }


public com.moon.aw c() { return __sourceHandlerCall_ba9d7f6d36a7670a7289(this); }


public static com.moon.aw a(com.moon.U p0) {
return ((com.moon.aw)(((com.moon.U)(com.moon.U.e)).c())).a(((com.moon.U)(p0)));
}


protected com.moon.aw a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aw local2 = new com.moon.aw(p0);
    return local2;
}


public static com.moon.U a__U() {
return com.moon.U.e;
}


public int a() {
return this.a;
}


public static com.moon.U a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.U)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.U.f)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public static com.moon.U a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.U)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.U.f)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.aw a__aw() {
return com.moon.U.b__aw();
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16307;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/U", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.U.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral192_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/U"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.U.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.e;
}


public static com.google.protobuf.Parser<com.moon.U> a__Parser() {
return com.moon.U.f;
}


public static com.moon.U a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.U)(((com.google.protobuf.Parser)(com.moon.U.f)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.U a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.U)(((com.google.protobuf.Parser)(com.moon.U.f)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.U a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.U)(((com.google.protobuf.Parser)(com.moon.U.f)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_fc2ecc4c012cd10b6ce5(this); }


public static com.moon.U a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.U)(((com.google.protobuf.Parser)(com.moon.U.f)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public java.lang.String a__String() { return __sourceHandlerCall_87a22d003b5afaae224d(this); }


public com.moon.ck a__ck() { return __sourceHandlerCall_1a56495f0cdc7fa772fe(this); }


public static com.moon.U a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.U)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.U.f)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.U a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.U)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.U.f)), ((java.io.InputStream)(p0)))));
}


public static com.moon.U a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.U)(((com.google.protobuf.Parser)(com.moon.U.f)).parseFrom(((byte[])(p0)))));
}


public static com.moon.U a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.U)(((com.google.protobuf.Parser)(com.moon.U.f)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.U();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_b9cfd7f64116959faf8c(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_b12238b00a60ded0d804(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.f)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.U.class)), ((java.lang.Class)(com.moon.aw.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.U)(this)).c();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.U)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.U)(this)).b__U();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.U)(this)).b__U();
}


public com.google.protobuf.Parser<com.moon.U> getParserForType() {
return com.moon.U.f;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_c785e8c4e8c061078425(this); }


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.U)(this)).a__aw();
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.U)(this)).a__aw();
}


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.U)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral192_0() throws E;
}
