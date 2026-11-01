package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class C extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oy {

private static long serialVersionUID = 0L;

private int a;

private boolean b;

private volatile java.lang.Object c;

private volatile java.lang.Object d;

private volatile java.lang.Object e;

private byte f;

private static com.moon.C g;

private static com.google.protobuf.Parser<com.moon.C> h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private C(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.f = -1;
}


private C() {
super();
    this.f = -1;
    this.c = "";
    this.d = "";
    this.e = "";
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-9153728176923058868L)), ((long)(-2220568044314481952L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216291340373224L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.C.i ^ 21855231388247L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill0_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill0_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill0_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill0_14 = new byte[8];
    (__sourceSpill0_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill0_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation0_16 = __sourceSpill0_14;
    ((javax.crypto.Cipher)(__sourceSpill0_11)).init(((int)(__sourceSpill0_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill0_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation0_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "0EøÕÔíëý,Lýs\017þoú½µ¬+\\¿òPTæù\177\013÷4\017èÚbuG"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill0_25 = local6_life21;
        int __sourceSpill0_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill0_25)).substring(((int)(__sourceSpill0_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill0_30 = local8_life19;
        int __sourceSpill0_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill0_33 = new byte[8];
        (__sourceSpill0_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill0_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill0_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill0_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill0_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill0_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill0_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill0_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill0_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill0_34)).doFinal(((byte[])(__sourceSpill0_33)));
        (__sourceSpill0_30)[__sourceSpill0_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ècÑùJø¦¹.N;ä¹)[k"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill0_38 = local6_life21;
        int __sourceSpill0_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill0_38)).substring(((int)(__sourceSpill0_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill0_43 = local8_life19;
        int __sourceSpill0_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill0_46 = new byte[8];
        (__sourceSpill0_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill0_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill0_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill0_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill0_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill0_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill0_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill0_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill0_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill0_47)).doFinal(((byte[])(__sourceSpill0_46)));
        (__sourceSpill0_43)[__sourceSpill0_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[7]));
    g = ((com.moon.C)(new com.moon.C()));
    h = ((com.google.protobuf.Parser)(new com.moon.a()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_9dccb540d9a60b2f1b2b(com.moon.C a0) throws E;
private static final class __SourceHandler_9dccb540d9a60b2f1b2b {

public static com.google.protobuf.ByteString f0(com.moon.C receiver) throws Throwable {
    java.lang.Object forwardValue0_24_0;
    java.lang.String[] spill0_0;
    java.lang.Object spill0_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead0_0() ^ 99906049454772L);
    spill0_0 = __call0_1();
    life4_7 = __fieldRead0_2(receiver);
    life3_8 = spill0_0;
    spill0_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue0_24_0 = spill0_1;
        break forward_join_24;
    }
    if (!((__instanceOf0_3(spill0_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call0_5(__cast0_4(life4_7));
    __fieldWrite0_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue0_24_0 = life4_7;
    }
    return __cast0_7(forwardValue0_24_0);
}
public static void h0_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000000_0(p0);
}
private static native long __fieldRead0_0() throws Throwable;
private static native java.lang.String[] __call0_1() throws Throwable;
private static native java.lang.Object __fieldRead0_2(com.moon.C a0) throws Throwable;
private static native int __instanceOf0_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast0_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call0_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite0_6(com.moon.C a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast0_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1000000_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_57c37ea73a5814b6d857(com.moon.C a0) throws E;
private static final class __SourceHandler_57c37ea73a5814b6d857 {

public static java.lang.String f1(com.moon.C receiver) throws Throwable {
    java.lang.Object forwardValue1_18_0;
    java.lang.String[] spill1_0;
    java.lang.Object spill1_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead1_0() ^ 73606295866658L);
    spill1_0 = __call1_1();
    life4_7 = __fieldRead1_2(receiver);
    life3_8 = spill1_0;
    spill1_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue1_18_0 = spill1_1;
        break forward_join_18;
    }
    if (!((__instanceOf1_3(spill1_1) != 0))) {
        break forward_join_17;
    }
    return __cast1_4(life4_7);
    }
    forwardValue1_18_0 = life4_7;
    }
    life5_24 = __cast1_5(forwardValue1_18_0);
    life6_27 = __call1_6(life5_24);
    __fieldWrite1_7(receiver, life6_27);
    return life6_27;
}
public static void h1_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000100_0(p0);
}
public static void h1_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000101_0(p0);
}
private static native long __fieldRead1_0() throws Throwable;
private static native java.lang.String[] __call1_1() throws Throwable;
private static native java.lang.Object __fieldRead1_2(com.moon.C a0) throws Throwable;
private static native int __instanceOf1_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast1_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast1_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite1_7(com.moon.C a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1000100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_802ca1da38062177d159(com.moon.C a0) throws E;
private static final class __SourceHandler_802ca1da38062177d159 {

public static com.google.protobuf.ByteString f2(com.moon.C receiver) throws Throwable {
    java.lang.Object forwardValue2_24_0;
    java.lang.String[] spill2_0;
    java.lang.Object spill2_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead2_0() ^ 138035680404706L);
    spill2_0 = __call2_1();
    life4_7 = __fieldRead2_2(receiver);
    life3_8 = spill2_0;
    spill2_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue2_24_0 = spill2_1;
        break forward_join_24;
    }
    if (!((__instanceOf2_3(spill2_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call2_5(__cast2_4(life4_7));
    __fieldWrite2_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue2_24_0 = life4_7;
    }
    return __cast2_7(forwardValue2_24_0);
}
public static void h2_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000200_0(p0);
}
private static native long __fieldRead2_0() throws Throwable;
private static native java.lang.String[] __call2_1() throws Throwable;
private static native java.lang.Object __fieldRead2_2(com.moon.C a0) throws Throwable;
private static native int __instanceOf2_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast2_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call2_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite2_6(com.moon.C a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast2_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1000200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ebf382a2d95e963d8f01(com.moon.C a0) throws E;
private static final class __SourceHandler_ebf382a2d95e963d8f01 {

public static boolean f3(com.moon.C receiver) throws Throwable {
    int forwardValue3_14_0;
    int forwardValue3_16_0;
    int spill3_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (__fieldRead3_0() ^ 74464201785228L);
    life3_5 = __call3_1();
    spill3_0 = (__fieldRead3_2(receiver) & 1);
    if (!((life3_5 == null))) {
        forwardValue3_14_0 = spill3_0;
        break forward_join_14;
    }
    if (!((spill3_0 != 0))) {
        break forward_join_15;
    }
    forwardValue3_14_0 = 1;
    }
    forwardValue3_16_0 = forwardValue3_14_0;
    break forward_join_16;
    }
    forwardValue3_16_0 = 0;
    }
    return __integerCategory3_3(forwardValue3_16_0);
}
public static void h3_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000300_0(p0);
}
private static native long __fieldRead3_0() throws Throwable;
private static native java.lang.String[] __call3_1() throws Throwable;
private static native int __fieldRead3_2(com.moon.C a0) throws Throwable;
private static native boolean __integerCategory3_3(int value) throws Throwable;
private static native java.lang.Exception __call1000300_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_385f98ec10b9196ec03b(com.moon.C a0) throws E;
private static final class __SourceHandler_385f98ec10b9196ec03b {

public static java.lang.String f4(com.moon.C receiver) throws Throwable {
    java.lang.Object forwardValue4_18_0;
    java.lang.String[] spill4_0;
    java.lang.Object spill4_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead4_0() ^ 10940071975769L);
    spill4_0 = __call4_1();
    life4_7 = __fieldRead4_2(receiver);
    life3_8 = spill4_0;
    spill4_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue4_18_0 = spill4_1;
        break forward_join_18;
    }
    if (!((__instanceOf4_3(spill4_1) != 0))) {
        break forward_join_17;
    }
    return __cast4_4(life4_7);
    }
    forwardValue4_18_0 = life4_7;
    }
    life5_24 = __cast4_5(forwardValue4_18_0);
    life6_27 = __call4_6(life5_24);
    __fieldWrite4_7(receiver, life6_27);
    return life6_27;
}
public static void h4_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000400_0(p0);
}
public static void h4_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000401_0(p0);
}
private static native long __fieldRead4_0() throws Throwable;
private static native java.lang.String[] __call4_1() throws Throwable;
private static native java.lang.Object __fieldRead4_2(com.moon.C a0) throws Throwable;
private static native int __instanceOf4_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast4_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast4_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call4_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite4_7(com.moon.C a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1000400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_4b038c8108e07279d2fe(com.moon.C a0) throws E;
private static final class __SourceHandler_4b038c8108e07279d2fe {

public static com.google.protobuf.ByteString f5(com.moon.C receiver) throws Throwable {
    java.lang.Object forwardValue5_24_0;
    java.lang.String[] spill5_0;
    java.lang.Object spill5_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead5_0() ^ 46638991783107L);
    spill5_0 = __call5_1();
    life4_7 = __fieldRead5_2(receiver);
    life3_8 = spill5_0;
    spill5_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue5_24_0 = spill5_1;
        break forward_join_24;
    }
    if (!((__instanceOf5_3(spill5_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call5_5(__cast5_4(life4_7));
    __fieldWrite5_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue5_24_0 = life4_7;
    }
    return __cast5_7(forwardValue5_24_0);
}
public static void h5_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000500_0(p0);
}
private static native long __fieldRead5_0() throws Throwable;
private static native java.lang.String[] __call5_1() throws Throwable;
private static native java.lang.Object __fieldRead5_2(com.moon.C a0) throws Throwable;
private static native int __instanceOf5_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast5_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call5_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite5_6(com.moon.C a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast5_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1000500_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_790af56579a67ccdcf3f(com.moon.C a0) throws E;
private static final class __SourceHandler_790af56579a67ccdcf3f {

public static java.lang.String f6(com.moon.C receiver) throws Throwable {
    java.lang.Object forwardValue6_18_0;
    java.lang.String[] spill6_0;
    java.lang.Object spill6_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead6_0() ^ 93460503823325L);
    spill6_0 = __call6_1();
    life4_7 = __fieldRead6_2(receiver);
    life3_8 = spill6_0;
    spill6_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue6_18_0 = spill6_1;
        break forward_join_18;
    }
    if (!((__instanceOf6_3(spill6_1) != 0))) {
        break forward_join_17;
    }
    return __cast6_4(life4_7);
    }
    forwardValue6_18_0 = life4_7;
    }
    life5_24 = __cast6_5(forwardValue6_18_0);
    life6_27 = __call6_6(life5_24);
    __fieldWrite6_7(receiver, life6_27);
    return life6_27;
}
public static void h6_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000600_0(p0);
}
public static void h6_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000601_0(p0);
}
private static native long __fieldRead6_0() throws Throwable;
private static native java.lang.String[] __call6_1() throws Throwable;
private static native java.lang.Object __fieldRead6_2(com.moon.C a0) throws Throwable;
private static native int __instanceOf6_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast6_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast6_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call6_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite6_7(com.moon.C a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1000600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000601_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ae __sourceHandlerCall_188ce5219c8755d5962d(com.moon.C a0) throws E;
private static final class __SourceHandler_188ce5219c8755d5962d {

public static com.moon.ae f7(com.moon.C receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead7_0() ^ 60167584163287L);
    return ((receiver == __fieldRead7_1()) ? new com.moon.ae() : __call7_2(new com.moon.ae(), receiver));
}
public static void h7_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000700_0(p0);
}
private static native long __fieldRead7_0() throws Throwable;
private static native com.moon.C __fieldRead7_1() throws Throwable;
private static native com.moon.ae __call7_2(com.moon.ae a0, com.moon.C a1) throws Throwable;
private static native java.lang.Exception __call1000700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5bd3273c8f820b7e2668(com.moon.C a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_5bd3273c8f820b7e2668 {

public static boolean f7(com.moon.C receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue7_14_0;
    java.lang.Object forwardValue7_23_0;
    int forwardValue7_39_0;
    int forwardValue7_49_0;
    int forwardValue7_56_0;
    int forwardValue7_65_0;
    int forwardValue7_83_0;
    int forwardValue7_89_0;
    java.lang.Object spill7_0;
    boolean spill7_1;
    boolean spill7_2;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.C life5_34;
    forward_join_89: {
    forward_join_88: {
    forward_join_83: {
    forward_join_78: {
    forward_join_65: {
    forward_join_63: {
    forward_join_56: {
    forward_join_54: {
    forward_join_49: {
    forward_join_44: {
    forward_join_39: {
    forward_join_34: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead7_0() ^ 91940220677039L);
    life4_5 = __call7_1();
    spill7_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue7_14_0 = spill7_0;
        break forward_join_14;
    }
    if (!((spill7_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory7_2(1);
    }
    forwardValue7_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue7_23_0 = forwardValue7_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf7_3(forwardValue7_14_0) == 0))) {
        break forward_join_22;
    }
    return __call7_4(receiver, p0);
    }
    forwardValue7_23_0 = p0;
    }
    life5_34 = __cast7_5(forwardValue7_23_0);
    spill7_1 = __call7_6(receiver);
    if (!((life4_5 == null))) {
        forwardValue7_39_0 = __integerCategory7_7(spill7_1);
        break forward_join_39;
    }
    if (!((spill7_1 != __call7_8(life5_34)))) {
        break forward_join_34;
    }
    return __integerCategory7_9(0);
    }
    forwardValue7_39_0 = __integerCategory7_13(__call7_12(__call7_10(receiver), __call7_11(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue7_49_0 = forwardValue7_39_0;
        break forward_join_49;
    }
    if (!((forwardValue7_39_0 == 0))) {
        break forward_join_44;
    }
    return __integerCategory7_14(0);
    }
    forwardValue7_49_0 = __integerCategory7_18(__call7_17(__call7_15(receiver), __call7_16(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue7_56_0 = forwardValue7_49_0;
        break forward_join_56;
    }
    if (!((forwardValue7_49_0 == 0))) {
        break forward_join_54;
    }
    return __integerCategory7_19(0);
    }
    forwardValue7_56_0 = __integerCategory7_21(__call7_20(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue7_65_0 = forwardValue7_56_0;
        break forward_join_65;
    }
    if (!((forwardValue7_56_0 != __integerCategoryRepair7_0(__call7_22(life5_34))))) {
        break forward_join_63;
    }
    return __integerCategory7_23(0);
    }
    forwardValue7_65_0 = __integerCategory7_25(__call7_24(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue7_83_0 = forwardValue7_65_0;
        break forward_join_83;
    }
    if (!((forwardValue7_65_0 != 0))) {
        break forward_join_78;
    }
    spill7_2 = __call7_28(__call7_26(receiver), __call7_27(life5_34));
    if (!((life4_5 == null))) {
        forwardValue7_83_0 = __integerCategory7_29(spill7_2);
        break forward_join_83;
    }
    if (!((!spill7_2))) {
        break forward_join_78;
    }
    return __integerCategory7_30(0);
    }
    forwardValue7_83_0 = __integerCategory7_34(__call7_33(__call7_31(receiver), __call7_32(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue7_89_0 = forwardValue7_83_0;
        break forward_join_89;
    }
    if (!((forwardValue7_83_0 == 0))) {
        break forward_join_88;
    }
    return __integerCategory7_35(0);
    }
    forwardValue7_89_0 = 1;
    }
    return __integerCategory7_36(forwardValue7_89_0);
}
public static void h7_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000700_0(p0);
}
public static void h7_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000701_0(p0);
}
public static void h7_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000702_0(p0);
}
public static void h7_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000703_0(p0);
}
public static void h7_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000704_0(p0);
}
public static void h7_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000705_0(p0);
}
public static void h7_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000706_0(p0);
}
public static void h7_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000707_0(p0);
}
public static void h7_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000708_0(p0);
}
public static void h7_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000709_0(p0);
}
public static void h7_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000710_0(p0);
}
public static void h7_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000711_0(p0);
}
public static void h7_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000712_0(p0);
}
public static void h7_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000713_0(p0);
}
public static void h7_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000714_0(p0);
}
public static void h7_15(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000715_0(p0);
}
public static void h7_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000716_0(p0);
}
public static void h7_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000717_0(p0);
}
private static native long __fieldRead7_0() throws Throwable;
private static native java.lang.String[] __call7_1() throws Throwable;
private static native boolean __integerCategory7_2(int value) throws Throwable;
private static native int __instanceOf7_3(java.lang.Object a0) throws Throwable;
private static native boolean __call7_4(com.moon.C a0, java.lang.Object a1) throws Throwable;
private static native com.moon.C __cast7_5(java.lang.Object a0) throws Throwable;
private static native boolean __call7_6(com.moon.C a0) throws Throwable;
private static native int __integerCategory7_7(boolean value) throws Throwable;
private static native boolean __call7_8(com.moon.C a0) throws Throwable;
private static native boolean __integerCategory7_9(int value) throws Throwable;
private static native java.lang.String __call7_10(com.moon.C a0) throws Throwable;
private static native java.lang.String __call7_11(com.moon.C a0) throws Throwable;
private static native boolean __call7_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory7_13(boolean value) throws Throwable;
private static native boolean __integerCategory7_14(int value) throws Throwable;
private static native java.lang.String __call7_15(com.moon.C a0) throws Throwable;
private static native java.lang.String __call7_16(com.moon.C a0) throws Throwable;
private static native boolean __call7_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory7_18(boolean value) throws Throwable;
private static native boolean __integerCategory7_19(int value) throws Throwable;
private static native boolean __call7_20(com.moon.C a0) throws Throwable;
private static native int __integerCategory7_21(boolean value) throws Throwable;
private static native boolean __call7_22(com.moon.C a0) throws Throwable;
private static native boolean __integerCategory7_23(int value) throws Throwable;
private static native boolean __call7_24(com.moon.C a0) throws Throwable;
private static native int __integerCategory7_25(boolean value) throws Throwable;
private static native java.lang.String __call7_26(com.moon.C a0) throws Throwable;
private static native java.lang.String __call7_27(com.moon.C a0) throws Throwable;
private static native boolean __call7_28(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory7_29(boolean value) throws Throwable;
private static native boolean __integerCategory7_30(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call7_31(com.moon.C a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call7_32(com.moon.C a0) throws Throwable;
private static native boolean __call7_33(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory7_34(boolean value) throws Throwable;
private static native boolean __integerCategory7_35(int value) throws Throwable;
private static native boolean __integerCategory7_36(int value) throws Throwable;
private static native java.lang.Exception __call1000700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000702_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000703_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000704_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000705_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000706_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000707_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000708_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000709_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000710_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000711_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000712_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000713_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000714_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000715_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000716_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000717_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __integerCategoryRepair7_0(boolean value) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_1c11d71739aa52c35095(com.moon.C a0) throws E;
private static final class __SourceHandler_1c11d71739aa52c35095 {

public static int f8(com.moon.C receiver) throws Throwable {
    int forwardValue8_20_0;
    int forwardValue8_33_0;
    int forwardValue8_46_0;
    int forwardValue8_60_0;
    int forwardValue8_80_0;
    java.lang.String[] spill8_0;
    int spill8_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_92;
    forward_join_80: {
    forward_join_70: {
    forward_join_60: {
    forward_join_56: {
    forward_join_46: {
    forward_join_43: {
    forward_join_33: {
    forward_join_30: {
    forward_join_20: {
    forward_join_16: {
    life1_3 = (__fieldRead8_0() ^ 33517073096384L);
    spill8_0 = __call8_1();
    life4_7 = __fieldRead8_2(receiver);
    life3_8 = spill8_0;
    spill8_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue8_20_0 = spill8_1;
        break forward_join_20;
    }
    if (!((spill8_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue8_20_0 = __integerCategory8_4(__fieldRead8_3(receiver));
    }
    if (!((life3_8 == null))) {
        forwardValue8_33_0 = forwardValue8_20_0;
        break forward_join_33;
    }
    if (!((forwardValue8_20_0 != 0))) {
        break forward_join_30;
    }
    life4_7 = (life4_7 + __call8_6(1, __fieldRead8_5(receiver)));
    }
    forwardValue8_33_0 = __integerCategory8_9(__call8_8(__fieldRead8_7(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue8_46_0 = forwardValue8_33_0;
        break forward_join_46;
    }
    if (!((forwardValue8_33_0 == 0))) {
        break forward_join_43;
    }
    life4_7 = (life4_7 + __call8_11(2, __fieldRead8_10(receiver)));
    }
    forwardValue8_46_0 = __integerCategory8_14(__call8_13(__fieldRead8_12(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue8_60_0 = forwardValue8_46_0;
        break forward_join_60;
    }
    if (!((forwardValue8_46_0 == 0))) {
        break forward_join_56;
    }
    life4_7 = (life4_7 + __call8_16(3, __fieldRead8_15(receiver)));
    }
    forwardValue8_60_0 = (__fieldRead8_17(receiver) & 1);
    }
    if (!((life3_8 == null))) {
        forwardValue8_80_0 = forwardValue8_60_0;
        break forward_join_80;
    }
    if (!((forwardValue8_60_0 != 0))) {
        break forward_join_70;
    }
    life4_7 = (life4_7 + __call8_19(4, __fieldRead8_18(receiver)));
    }
    life4_92 = (life4_7 + __call8_21(__call8_20(receiver)));
    __fieldWrite8_22(receiver, life4_92);
    forwardValue8_80_0 = life4_92;
    }
    return forwardValue8_80_0;
}
public static void h8_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000800_0(p0);
}
public static void h8_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000801_0(p0);
}
public static void h8_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000802_0(p0);
}
public static void h8_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000803_0(p0);
}
public static void h8_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000804_0(p0);
}
public static void h8_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000805_0(p0);
}
private static native long __fieldRead8_0() throws Throwable;
private static native java.lang.String[] __call8_1() throws Throwable;
private static native int __fieldRead8_2(com.moon.C a0) throws Throwable;
private static native boolean __fieldRead8_3(com.moon.C a0) throws Throwable;
private static native int __integerCategory8_4(boolean value) throws Throwable;
private static native boolean __fieldRead8_5(com.moon.C a0) throws Throwable;
private static native int __call8_6(int a0, boolean a1) throws Throwable;
private static native java.lang.Object __fieldRead8_7(com.moon.C a0) throws Throwable;
private static native boolean __call8_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory8_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead8_10(com.moon.C a0) throws Throwable;
private static native int __call8_11(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead8_12(com.moon.C a0) throws Throwable;
private static native boolean __call8_13(java.lang.Object a0) throws Throwable;
private static native int __integerCategory8_14(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead8_15(com.moon.C a0) throws Throwable;
private static native int __call8_16(int a0, java.lang.Object a1) throws Throwable;
private static native int __fieldRead8_17(com.moon.C a0) throws Throwable;
private static native java.lang.Object __fieldRead8_18(com.moon.C a0) throws Throwable;
private static native int __call8_19(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call8_20(com.moon.C a0) throws Throwable;
private static native int __call8_21(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite8_22(com.moon.C a0, int a1) throws Throwable;
private static native java.lang.Exception __call1000800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000805_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c2ae186b14d547ab120c(com.moon.C a0) throws E;
private static final class __SourceHandler_c2ae186b14d547ab120c {

public static int f9(com.moon.C receiver) throws Throwable {
    int forwardValue9_19_0;
    int forwardValue9_140_0;
    int spill9_0;
    boolean spill9_1;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_67;
    int life4_79;
    int life4_89;
    int life4_101;
    int life4_119;
    int life4_143;
    forward_join_140: {
    forward_join_124: {
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead9_0() ^ 31395322816814L);
    life3_5 = __call9_1();
    spill9_0 = __fieldRead9_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue9_19_0 = spill9_0;
        break forward_join_19;
    }
    if (!((spill9_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead9_3(receiver);
    }
    forwardValue9_19_0 = __invokedynamic9_4(21617, (9018146668756425096L ^ life1_3));
    }
    life4_24 = forwardValue9_19_0;
    life4_35 = ((__invokedynamic9_5(24927, (8073351728600673445L ^ life1_3)) * life4_24) + __call9_7(__call9_6()));
    life4_45 = ((__invokedynamic9_8(11464, (2486652342045974836L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic9_9(21798, (525106015174351069L ^ life1_3)) * life4_45) + __call9_11(__call9_10(receiver)));
    life4_67 = ((__invokedynamic9_12(21666, (8885705122811894106L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic9_13(4684, (8942520473176645553L ^ life1_3)) * life4_67) + __call9_15(__call9_14(receiver)));
    life4_89 = ((__invokedynamic9_16(21666, (8885705122811894106L ^ life1_3)) * life4_79) + 3);
    life4_101 = ((__invokedynamic9_17(4684, (8942520473176645553L ^ life1_3)) * life4_89) + __call9_19(__call9_18(receiver)));
    spill9_1 = __call9_20(receiver);
    if (!((life3_5 == null))) {
        forwardValue9_140_0 = __integerCategory9_21(spill9_1);
        break forward_join_140;
    }
    if (!(spill9_1)) {
        break forward_join_124;
    }
    life4_119 = ((__invokedynamic9_22(21666, (8885705122811894106L ^ life1_3)) * life4_101) + 4);
    life4_101 = ((__invokedynamic9_23(4684, (8942520473176645553L ^ life1_3)) * life4_119) + __call9_25(__call9_24(receiver)));
    }
    life4_143 = ((__invokedynamic9_26(3671, (8792105275195065256L ^ life1_3)) * life4_101) + __call9_28(__call9_27(receiver)));
    __fieldWrite9_29(receiver, life4_143);
    forwardValue9_140_0 = life4_143;
    }
    return forwardValue9_140_0;
}
public static void h9_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000900_0(p0);
}
public static void h9_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000901_0(p0);
}
public static void h9_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1000902_0(p0);
}
private static native long __fieldRead9_0() throws Throwable;
private static native java.lang.String[] __call9_1() throws Throwable;
private static native int __fieldRead9_2(com.moon.C a0) throws Throwable;
private static native int __fieldRead9_3(com.moon.C a0) throws Throwable;
private static native int __invokedynamic9_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic9_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call9_6() throws Throwable;
private static native int __call9_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic9_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic9_9(int a0, long a1) throws Throwable;
private static native boolean __call9_10(com.moon.C a0) throws Throwable;
private static native int __call9_11(boolean a0) throws Throwable;
private static native int __invokedynamic9_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic9_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call9_14(com.moon.C a0) throws Throwable;
private static native int __call9_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic9_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic9_17(int a0, long a1) throws Throwable;
private static native java.lang.String __call9_18(com.moon.C a0) throws Throwable;
private static native int __call9_19(java.lang.String a0) throws Throwable;
private static native boolean __call9_20(com.moon.C a0) throws Throwable;
private static native int __integerCategory9_21(boolean value) throws Throwable;
private static native int __invokedynamic9_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic9_23(int a0, long a1) throws Throwable;
private static native java.lang.String __call9_24(com.moon.C a0) throws Throwable;
private static native int __call9_25(java.lang.String a0) throws Throwable;
private static native int __invokedynamic9_26(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call9_27(com.moon.C a0) throws Throwable;
private static native int __call9_28(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite9_29(com.moon.C a0, int a1) throws Throwable;
private static native java.lang.Exception __call1000900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000901_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1000902_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_66e310696661c2cdf292(com.moon.C a0) throws E;
private static final class __SourceHandler_66e310696661c2cdf292 {

public static boolean f10(com.moon.C receiver) throws Throwable {
    int forwardValue10_17_0;
    int forwardValue10_26_0;
    java.lang.String[] spill10_0;
    int spill10_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead10_0() ^ 122146760984316L);
    spill10_0 = __call10_1();
    life4_7 = __fieldRead10_2(receiver);
    life3_8 = spill10_0;
    spill10_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue10_17_0 = spill10_1;
        break forward_join_17;
    }
    if (!((spill10_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory10_3(1);
    }
    forwardValue10_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue10_26_0 = forwardValue10_17_0;
        break forward_join_26;
    }
    if (!((forwardValue10_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory10_4(0);
    }
    __fieldWrite10_5(receiver, 1);
    forwardValue10_26_0 = 1;
    }
    return __integerCategory10_6(forwardValue10_26_0);
}
public static void h10_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001000_0(p0);
}
public static void h10_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001001_0(p0);
}
public static void h10_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001002_0(p0);
}
public static void h10_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001003_0(p0);
}
private static native long __fieldRead10_0() throws Throwable;
private static native java.lang.String[] __call10_1() throws Throwable;
private static native byte __fieldRead10_2(com.moon.C a0) throws Throwable;
private static native boolean __integerCategory10_3(int value) throws Throwable;
private static native boolean __integerCategory10_4(int value) throws Throwable;
private static native void __fieldWrite10_5(com.moon.C a0, int a1) throws Throwable;
private static native boolean __integerCategory10_6(int value) throws Throwable;
private static native java.lang.Exception __call1001000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001003_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8e55322a443a24d90e16(com.moon.C a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_8e55322a443a24d90e16 {

public static void f11(com.moon.C receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue11_19_0;
    int forwardValue11_30_0;
    int forwardValue11_44_0;
    com.moon.C forwardValue11_51_0;
    boolean spill11_0;
    com.moon.C spill11_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_51: {
    forward_join_50: {
    forward_join_44: {
    forward_join_38: {
    forward_join_30: {
    forward_join_27: {
    forward_join_19: {
    forward_join_16: {
    life2_3 = (__fieldRead11_0() ^ 108999352093036L);
    life4_5 = __call11_1();
    spill11_0 = __fieldRead11_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue11_19_0 = __integerCategory11_3(spill11_0);
        break forward_join_19;
    }
    if (!(spill11_0)) {
        break forward_join_16;
    }
    __call11_5(p0, 1, __fieldRead11_4(receiver));
    }
    forwardValue11_19_0 = __integerCategory11_8(__call11_7(__fieldRead11_6(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue11_30_0 = forwardValue11_19_0;
        break forward_join_30;
    }
    if (!((forwardValue11_19_0 == 0))) {
        break forward_join_27;
    }
    __call11_10(p0, 2, __fieldRead11_9(receiver));
    }
    forwardValue11_30_0 = __integerCategory11_13(__call11_12(__fieldRead11_11(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue11_44_0 = forwardValue11_30_0;
        break forward_join_44;
    }
    if (!((forwardValue11_30_0 == 0))) {
        break forward_join_38;
    }
    __call11_15(p0, 3, __fieldRead11_14(receiver));
    }
    spill11_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue11_51_0 = spill11_1;
        break forward_join_51;
    }
    forwardValue11_44_0 = (__fieldRead11_16(spill11_1) & 1);
    }
    if (!((forwardValue11_44_0 != 0))) {
        break forward_join_50;
    }
    __call11_18(p0, 4, __fieldRead11_17(receiver));
    }
    forwardValue11_51_0 = receiver;
    }
    __call11_20(__call11_19(forwardValue11_51_0), p0);
    return;
}
public static void h11_0(java.io.IOException p0) throws Throwable {
    throw __call1001100_0(p0);
}
public static void h11_1(java.io.IOException p0) throws Throwable {
    throw __call1001101_0(p0);
}
public static void h11_2(java.io.IOException p0) throws Throwable {
    throw __call1001102_0(p0);
}
public static void h11_3(java.io.IOException p0) throws Throwable {
    throw __call1001103_0(p0);
}
public static void h11_4(java.io.IOException p0) throws Throwable {
    throw __call1001104_0(p0);
}
public static void h11_5(java.io.IOException p0) throws Throwable {
    throw __call1001105_0(p0);
}
public static void h11_6(java.io.IOException p0) throws Throwable {
    throw __call1001106_0(p0);
}
public static void h11_7(java.io.IOException p0) throws Throwable {
    throw __call1001107_0(p0);
}
private static native long __fieldRead11_0() throws Throwable;
private static native java.lang.String[] __call11_1() throws Throwable;
private static native boolean __fieldRead11_2(com.moon.C a0) throws Throwable;
private static native int __integerCategory11_3(boolean value) throws Throwable;
private static native boolean __fieldRead11_4(com.moon.C a0) throws Throwable;
private static native void __call11_5(com.google.protobuf.CodedOutputStream a0, int a1, boolean a2) throws Throwable;
private static native java.lang.Object __fieldRead11_6(com.moon.C a0) throws Throwable;
private static native boolean __call11_7(java.lang.Object a0) throws Throwable;
private static native int __integerCategory11_8(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead11_9(com.moon.C a0) throws Throwable;
private static native void __call11_10(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead11_11(com.moon.C a0) throws Throwable;
private static native boolean __call11_12(java.lang.Object a0) throws Throwable;
private static native int __integerCategory11_13(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead11_14(com.moon.C a0) throws Throwable;
private static native void __call11_15(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native int __fieldRead11_16(com.moon.C a0) throws Throwable;
private static native java.lang.Object __fieldRead11_17(com.moon.C a0) throws Throwable;
private static native void __call11_18(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call11_19(com.moon.C a0) throws Throwable;
private static native void __call11_20(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1001100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1001101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1001102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1001103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1001104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1001105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1001106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1001107_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_5bd3273c8f820b7e2668(this, p0); }


public int hashCode() { return __sourceHandlerCall_c2ae186b14d547ab120c(this); }


public static com.moon.C b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.C)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.C.h)), ((java.io.InputStream)(p0)))));
}


public boolean b__Boolean() { return __sourceHandlerCall_ebf382a2d95e963d8f01(this); }


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.C.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public com.moon.C b__C() {
return com.moon.C.g;
}


public static com.moon.ae b__ae() {
return ((com.moon.C)(com.moon.C.g)).c__ae();
}


public static com.moon.C b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.C)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.C.h)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public java.lang.String b__String() { return __sourceHandlerCall_385f98ec10b9196ec03b(this); }


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_802ca1da38062177d159(this); }


public java.lang.String c__String() { return __sourceHandlerCall_790af56579a67ccdcf3f(this); }


static void c(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.C.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public com.moon.ae c__ae() { return __sourceHandlerCall_188ce5219c8755d5962d(this); }


public com.google.protobuf.ByteString c() { return __sourceHandlerCall_4b038c8108e07279d2fe(this); }


public static com.moon.C a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.C)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.C.h)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public static com.moon.C a__C() {
return com.moon.C.g;
}


protected com.moon.ae a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ae local2 = new com.moon.ae(p0);
    return local2;
}


public static com.moon.ae a(com.moon.C p0) {
return ((com.moon.ae)(((com.moon.C)(com.moon.C.g)).c__ae())).a(((com.moon.C)(p0)));
}


public static com.moon.C a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.C)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.C.h)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.ae a__ae() {
return com.moon.C.b__ae();
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4375;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/C", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.C.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/C"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.C.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.ow.c;
}


public static com.google.protobuf.Parser<com.moon.C> a__Parser() {
return com.moon.C.h;
}


public static com.moon.C a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.C)(((com.google.protobuf.Parser)(com.moon.C.h)).parseFrom(((byte[])(p0)))));
}


public static com.moon.C a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.C)(((com.google.protobuf.Parser)(com.moon.C.h)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_9dccb540d9a60b2f1b2b(this); }


public static com.moon.C a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.C)(((com.google.protobuf.Parser)(com.moon.C.h)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.C a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.C)(((com.google.protobuf.Parser)(com.moon.C.h)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static com.moon.C a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.C)(((com.google.protobuf.Parser)(com.moon.C.h)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public java.lang.String a__String() { return __sourceHandlerCall_57c37ea73a5814b6d857(this); }


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public static com.moon.C a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.C)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.C.h)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.C a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.C)(((com.google.protobuf.Parser)(com.moon.C.h)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.C a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.C)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.C.h)), ((java.io.InputStream)(p0)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.C();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_8e55322a443a24d90e16(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_66e310696661c2cdf292(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.ow.d)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.C.class)), ((java.lang.Class)(com.moon.ae.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.C)(this)).c__ae();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.C)(this)).c__ae();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.C)(this)).b__C();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.C)(this)).b__C();
}


public com.google.protobuf.Parser<com.moon.C> getParserForType() {
return com.moon.C.h;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_1c11d71739aa52c35095(this); }


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.C)(this)).a__ae();
}


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.C)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.C)(this)).a__ae();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10_0() throws E;
}
