package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class K extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oH {

private static long serialVersionUID = 0L;

private long a;

private volatile java.lang.Object b;

private volatile java.lang.Object c;

private volatile java.lang.Object d;

private byte e;

private static com.moon.K f;

private static com.google.protobuf.Parser<com.moon.K> g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

private K(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.e = -1;
}


private K() {
super();
    this.e = -1;
    this.b = "";
    this.c = "";
    this.d = "";
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-3231884136296835303L)), ((long)(1358850766303568069L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116111491161876L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.K.h ^ 130678573392935L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill8_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill8_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill8_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill8_14 = new byte[8];
    (__sourceSpill8_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill8_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation8_16 = __sourceSpill8_14;
    ((javax.crypto.Cipher)(__sourceSpill8_11)).init(((int)(__sourceSpill8_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill8_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation8_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "­¨év§#2]Qý}ó\032@{ö.ÇB\035fq\034:µÏ²³µ8UèD>k"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill8_25 = local6_life21;
        int __sourceSpill8_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill8_25)).substring(((int)(__sourceSpill8_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill8_30 = local8_life19;
        int __sourceSpill8_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill8_33 = new byte[8];
        (__sourceSpill8_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill8_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill8_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill8_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill8_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill8_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill8_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill8_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill8_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill8_34)).doFinal(((byte[])(__sourceSpill8_33)));
        (__sourceSpill8_30)[__sourceSpill8_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\016Ì6\nÌçeHØ¤\035jf\007}"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill8_38 = local6_life21;
        int __sourceSpill8_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill8_38)).substring(((int)(__sourceSpill8_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill8_43 = local8_life19;
        int __sourceSpill8_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill8_46 = new byte[8];
        (__sourceSpill8_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill8_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill8_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill8_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill8_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill8_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill8_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill8_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill8_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill8_47)).doFinal(((byte[])(__sourceSpill8_46)));
        (__sourceSpill8_43)[__sourceSpill8_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[7]));
    f = ((com.moon.K)(new com.moon.K()));
    g = ((com.google.protobuf.Parser)(new com.moon.i()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_daa163c9345c2d6f7ed0(com.moon.K a0) throws E;
private static final class __SourceHandler_daa163c9345c2d6f7ed0 {

public static com.google.protobuf.ByteString f67(com.moon.K receiver) throws Throwable {
    java.lang.Object forwardValue67_24_0;
    java.lang.String[] spill67_0;
    java.lang.Object spill67_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead67_0() ^ 58018826783934L);
    spill67_0 = __call67_1();
    life4_7 = __fieldRead67_2(receiver);
    life3_8 = spill67_0;
    spill67_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue67_24_0 = spill67_1;
        break forward_join_24;
    }
    if (!((__instanceOf67_3(spill67_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call67_5(__cast67_4(life4_7));
    __fieldWrite67_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue67_24_0 = life4_7;
    }
    return __cast67_7(forwardValue67_24_0);
}
public static void h67_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006700_0(p0);
}
private static native long __fieldRead67_0() throws Throwable;
private static native java.lang.String[] __call67_1() throws Throwable;
private static native java.lang.Object __fieldRead67_2(com.moon.K a0) throws Throwable;
private static native int __instanceOf67_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast67_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call67_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite67_6(com.moon.K a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast67_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1006700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_a561951cc57364c47b41(com.moon.K a0) throws E;
private static final class __SourceHandler_a561951cc57364c47b41 {

public static java.lang.String f68(com.moon.K receiver) throws Throwable {
    java.lang.Object forwardValue68_18_0;
    java.lang.String[] spill68_0;
    java.lang.Object spill68_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead68_0() ^ 44184154132131L);
    spill68_0 = __call68_1();
    life4_7 = __fieldRead68_2(receiver);
    life3_8 = spill68_0;
    spill68_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue68_18_0 = spill68_1;
        break forward_join_18;
    }
    if (!((__instanceOf68_3(spill68_1) != 0))) {
        break forward_join_17;
    }
    return __cast68_4(life4_7);
    }
    forwardValue68_18_0 = life4_7;
    }
    life5_24 = __cast68_5(forwardValue68_18_0);
    life6_27 = __call68_6(life5_24);
    __fieldWrite68_7(receiver, life6_27);
    return life6_27;
}
public static void h68_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006800_0(p0);
}
public static void h68_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006801_0(p0);
}
private static native long __fieldRead68_0() throws Throwable;
private static native java.lang.String[] __call68_1() throws Throwable;
private static native java.lang.Object __fieldRead68_2(com.moon.K a0) throws Throwable;
private static native int __instanceOf68_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast68_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast68_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call68_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite68_7(com.moon.K a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1006800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1006801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_c585195f7931cdfa67cc(com.moon.K a0) throws E;
private static final class __SourceHandler_c585195f7931cdfa67cc {

public static com.google.protobuf.ByteString f69(com.moon.K receiver) throws Throwable {
    java.lang.Object forwardValue69_24_0;
    java.lang.String[] spill69_0;
    java.lang.Object spill69_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead69_0() ^ 28925528717255L);
    spill69_0 = __call69_1();
    life4_7 = __fieldRead69_2(receiver);
    life3_8 = spill69_0;
    spill69_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue69_24_0 = spill69_1;
        break forward_join_24;
    }
    if (!((__instanceOf69_3(spill69_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call69_5(__cast69_4(life4_7));
    __fieldWrite69_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue69_24_0 = life4_7;
    }
    return __cast69_7(forwardValue69_24_0);
}
public static void h69_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1006900_0(p0);
}
private static native long __fieldRead69_0() throws Throwable;
private static native java.lang.String[] __call69_1() throws Throwable;
private static native java.lang.Object __fieldRead69_2(com.moon.K a0) throws Throwable;
private static native int __instanceOf69_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast69_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call69_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite69_6(com.moon.K a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast69_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1006900_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_9be9cbd4c6ea5b04416a(com.moon.K a0) throws E;
private static final class __SourceHandler_9be9cbd4c6ea5b04416a {

public static java.lang.String f70(com.moon.K receiver) throws Throwable {
    java.lang.Object forwardValue70_18_0;
    java.lang.String[] spill70_0;
    java.lang.Object spill70_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead70_0() ^ 133160759913360L);
    spill70_0 = __call70_1();
    life4_7 = __fieldRead70_2(receiver);
    life3_8 = spill70_0;
    spill70_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue70_18_0 = spill70_1;
        break forward_join_18;
    }
    if (!((__instanceOf70_3(spill70_1) != 0))) {
        break forward_join_17;
    }
    return __cast70_4(life4_7);
    }
    forwardValue70_18_0 = life4_7;
    }
    life5_24 = __cast70_5(forwardValue70_18_0);
    life6_27 = __call70_6(life5_24);
    __fieldWrite70_7(receiver, life6_27);
    return life6_27;
}
public static void h70_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007000_0(p0);
}
public static void h70_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007001_0(p0);
}
private static native long __fieldRead70_0() throws Throwable;
private static native java.lang.String[] __call70_1() throws Throwable;
private static native java.lang.Object __fieldRead70_2(com.moon.K a0) throws Throwable;
private static native int __instanceOf70_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast70_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast70_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call70_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite70_7(com.moon.K a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1007000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007001_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_0dc756bf53c9be93cf0d(com.moon.K a0) throws E;
private static final class __SourceHandler_0dc756bf53c9be93cf0d {

public static com.google.protobuf.ByteString f71(com.moon.K receiver) throws Throwable {
    java.lang.Object forwardValue71_24_0;
    java.lang.String[] spill71_0;
    java.lang.Object spill71_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead71_0() ^ 77540462247123L);
    spill71_0 = __call71_1();
    life4_7 = __fieldRead71_2(receiver);
    life3_8 = spill71_0;
    spill71_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue71_24_0 = spill71_1;
        break forward_join_24;
    }
    if (!((__instanceOf71_3(spill71_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call71_5(__cast71_4(life4_7));
    __fieldWrite71_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue71_24_0 = life4_7;
    }
    return __cast71_7(forwardValue71_24_0);
}
public static void h71_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007100_0(p0);
}
private static native long __fieldRead71_0() throws Throwable;
private static native java.lang.String[] __call71_1() throws Throwable;
private static native java.lang.Object __fieldRead71_2(com.moon.K a0) throws Throwable;
private static native int __instanceOf71_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast71_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call71_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite71_6(com.moon.K a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast71_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1007100_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_85ebd1c6344328b66395(com.moon.K a0) throws E;
private static final class __SourceHandler_85ebd1c6344328b66395 {

public static java.lang.String f72(com.moon.K receiver) throws Throwable {
    java.lang.Object forwardValue72_18_0;
    java.lang.String[] spill72_0;
    java.lang.Object spill72_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead72_0() ^ 110328635444003L);
    spill72_0 = __call72_1();
    life4_7 = __fieldRead72_2(receiver);
    life3_8 = spill72_0;
    spill72_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue72_18_0 = spill72_1;
        break forward_join_18;
    }
    if (!((__instanceOf72_3(spill72_1) != 0))) {
        break forward_join_17;
    }
    return __cast72_4(life4_7);
    }
    forwardValue72_18_0 = life4_7;
    }
    life5_24 = __cast72_5(forwardValue72_18_0);
    life6_27 = __call72_6(life5_24);
    __fieldWrite72_7(receiver, life6_27);
    return life6_27;
}
public static void h72_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007200_0(p0);
}
public static void h72_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007201_0(p0);
}
private static native long __fieldRead72_0() throws Throwable;
private static native java.lang.String[] __call72_1() throws Throwable;
private static native java.lang.Object __fieldRead72_2(com.moon.K a0) throws Throwable;
private static native int __instanceOf72_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast72_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast72_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call72_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite72_7(com.moon.K a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1007200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007201_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.am __sourceHandlerCall_a268c668eed951433a19(com.moon.K a0) throws E;
private static final class __SourceHandler_a268c668eed951433a19 {

public static com.moon.am f84(com.moon.K receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead84_0() ^ 16998518072031L);
    return ((receiver == __fieldRead84_1()) ? new com.moon.am() : __call84_2(new com.moon.am(), receiver));
}
public static void h84_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1008400_0(p0);
}
private static native long __fieldRead84_0() throws Throwable;
private static native com.moon.K __fieldRead84_1() throws Throwable;
private static native com.moon.am __call84_2(com.moon.am a0, com.moon.K a1) throws Throwable;
private static native java.lang.Exception __call1008400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1ca993c88ebbd2a2d4f7(com.moon.K a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_1ca993c88ebbd2a2d4f7 {

public static boolean f73(com.moon.K receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue73_14_0;
    java.lang.Object forwardValue73_23_0;
    int forwardValue73_40_0;
    int forwardValue73_50_0;
    int forwardValue73_60_0;
    int forwardValue73_70_0;
    int forwardValue73_76_0;
    java.lang.Object spill73_0;
    int spill73_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.K life5_34;
    forward_join_76: {
    forward_join_75: {
    forward_join_70: {
    forward_join_65: {
    forward_join_60: {
    forward_join_55: {
    forward_join_50: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead73_0() ^ 101606389295404L);
    life4_5 = __call73_1();
    spill73_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue73_14_0 = spill73_0;
        break forward_join_14;
    }
    if (!((spill73_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory73_2(1);
    }
    forwardValue73_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue73_23_0 = forwardValue73_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf73_3(forwardValue73_14_0) == 0))) {
        break forward_join_22;
    }
    return __call73_4(receiver, p0);
    }
    forwardValue73_23_0 = p0;
    }
    life5_34 = __cast73_5(forwardValue73_23_0);
    spill73_1 = __numericCompare73_8(__call73_6(receiver), __call73_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue73_40_0 = spill73_1;
        break forward_join_40;
    }
    if (!((spill73_1 != 0))) {
        break forward_join_35;
    }
    return __integerCategory73_9(0);
    }
    forwardValue73_40_0 = __integerCategory73_13(__call73_12(__call73_10(receiver), __call73_11(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue73_50_0 = forwardValue73_40_0;
        break forward_join_50;
    }
    if (!((forwardValue73_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory73_14(0);
    }
    forwardValue73_50_0 = __integerCategory73_18(__call73_17(__call73_15(receiver), __call73_16(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue73_60_0 = forwardValue73_50_0;
        break forward_join_60;
    }
    if (!((forwardValue73_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory73_19(0);
    }
    forwardValue73_60_0 = __integerCategory73_23(__call73_22(__call73_20(receiver), __call73_21(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue73_70_0 = forwardValue73_60_0;
        break forward_join_70;
    }
    if (!((forwardValue73_60_0 == 0))) {
        break forward_join_65;
    }
    return __integerCategory73_24(0);
    }
    forwardValue73_70_0 = __integerCategory73_28(__call73_27(__call73_25(receiver), __call73_26(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue73_76_0 = forwardValue73_70_0;
        break forward_join_76;
    }
    if (!((forwardValue73_70_0 == 0))) {
        break forward_join_75;
    }
    return __integerCategory73_29(0);
    }
    forwardValue73_76_0 = 1;
    }
    return __integerCategory73_30(forwardValue73_76_0);
}
public static void h73_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007300_0(p0);
}
public static void h73_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007301_0(p0);
}
public static void h73_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007302_0(p0);
}
public static void h73_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007303_0(p0);
}
public static void h73_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007304_0(p0);
}
public static void h73_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007305_0(p0);
}
public static void h73_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007306_0(p0);
}
public static void h73_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007307_0(p0);
}
public static void h73_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007308_0(p0);
}
public static void h73_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007309_0(p0);
}
public static void h73_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007310_0(p0);
}
public static void h73_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007311_0(p0);
}
public static void h73_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007312_0(p0);
}
public static void h73_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007313_0(p0);
}
private static native long __fieldRead73_0() throws Throwable;
private static native java.lang.String[] __call73_1() throws Throwable;
private static native boolean __integerCategory73_2(int value) throws Throwable;
private static native int __instanceOf73_3(java.lang.Object a0) throws Throwable;
private static native boolean __call73_4(com.moon.K a0, java.lang.Object a1) throws Throwable;
private static native com.moon.K __cast73_5(java.lang.Object a0) throws Throwable;
private static native long __call73_6(com.moon.K a0) throws Throwable;
private static native long __call73_7(com.moon.K a0) throws Throwable;
private static native int __numericCompare73_8(long a0, long a1) throws Throwable;
private static native boolean __integerCategory73_9(int value) throws Throwable;
private static native java.lang.String __call73_10(com.moon.K a0) throws Throwable;
private static native java.lang.String __call73_11(com.moon.K a0) throws Throwable;
private static native boolean __call73_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory73_13(boolean value) throws Throwable;
private static native boolean __integerCategory73_14(int value) throws Throwable;
private static native java.lang.String __call73_15(com.moon.K a0) throws Throwable;
private static native java.lang.String __call73_16(com.moon.K a0) throws Throwable;
private static native boolean __call73_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory73_18(boolean value) throws Throwable;
private static native boolean __integerCategory73_19(int value) throws Throwable;
private static native java.lang.String __call73_20(com.moon.K a0) throws Throwable;
private static native java.lang.String __call73_21(com.moon.K a0) throws Throwable;
private static native boolean __call73_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory73_23(boolean value) throws Throwable;
private static native boolean __integerCategory73_24(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call73_25(com.moon.K a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call73_26(com.moon.K a0) throws Throwable;
private static native boolean __call73_27(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory73_28(boolean value) throws Throwable;
private static native boolean __integerCategory73_29(int value) throws Throwable;
private static native boolean __integerCategory73_30(int value) throws Throwable;
private static native java.lang.Exception __call1007300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007305_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007306_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007307_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007308_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007309_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007310_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007311_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007312_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007313_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_b681fb51c7c741eb686f(com.moon.K a0) throws E;
private static final class __SourceHandler_b681fb51c7c741eb686f {

public static int f2(com.moon.K receiver) throws Throwable {
    int forwardValue2_22_0;
    int forwardValue2_35_0;
    int forwardValue2_48_0;
    int forwardValue2_61_0;
    int forwardValue2_81_0;
    java.lang.String[] spill2_0;
    int spill2_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_93;
    forward_join_81: {
    forward_join_71: {
    forward_join_61: {
    forward_join_58: {
    forward_join_48: {
    forward_join_45: {
    forward_join_35: {
    forward_join_32: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (__fieldRead2_0() ^ 93508218744240L);
    spill2_0 = __call2_1();
    life4_7 = __fieldRead2_2(receiver);
    life3_8 = spill2_0;
    spill2_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue2_22_0 = spill2_1;
        break forward_join_22;
    }
    if (!((spill2_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue2_22_0 = __numericCompare2_4(__fieldRead2_3(receiver), 0L);
    }
    if (!((life3_8 == null))) {
        forwardValue2_35_0 = forwardValue2_22_0;
        break forward_join_35;
    }
    if (!((forwardValue2_22_0 != 0))) {
        break forward_join_32;
    }
    life4_7 = (life4_7 + __call2_6(1, __fieldRead2_5(receiver)));
    }
    forwardValue2_35_0 = __integerCategory2_9(__call2_8(__fieldRead2_7(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue2_48_0 = forwardValue2_35_0;
        break forward_join_48;
    }
    if (!((forwardValue2_35_0 == 0))) {
        break forward_join_45;
    }
    life4_7 = (life4_7 + __call2_11(2, __fieldRead2_10(receiver)));
    }
    forwardValue2_48_0 = __integerCategory2_14(__call2_13(__fieldRead2_12(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue2_61_0 = forwardValue2_48_0;
        break forward_join_61;
    }
    if (!((forwardValue2_48_0 == 0))) {
        break forward_join_58;
    }
    life4_7 = (life4_7 + __call2_16(3, __fieldRead2_15(receiver)));
    }
    forwardValue2_61_0 = __integerCategory2_19(__call2_18(__fieldRead2_17(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue2_81_0 = forwardValue2_61_0;
        break forward_join_81;
    }
    if (!((forwardValue2_61_0 == 0))) {
        break forward_join_71;
    }
    life4_7 = (life4_7 + __call2_21(4, __fieldRead2_20(receiver)));
    }
    life4_93 = (life4_7 + __call2_23(__call2_22(receiver)));
    __fieldWrite2_24(receiver, life4_93);
    forwardValue2_81_0 = life4_93;
    }
    return forwardValue2_81_0;
}
public static int h2_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000200_0(p0);
}
public static int h2_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000201_0(p0);
}
public static int h2_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000202_0(p0);
}
public static int h2_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000203_0(p0);
}
public static int h2_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000204_0(p0);
}
public static int h2_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000205_0(p0);
}
private static native long __fieldRead2_0() throws Throwable;
private static native java.lang.String[] __call2_1() throws Throwable;
private static native int __fieldRead2_2(com.moon.K a0) throws Throwable;
private static native long __fieldRead2_3(com.moon.K a0) throws Throwable;
private static native int __numericCompare2_4(long a0, long a1) throws Throwable;
private static native long __fieldRead2_5(com.moon.K a0) throws Throwable;
private static native int __call2_6(int a0, long a1) throws Throwable;
private static native java.lang.Object __fieldRead2_7(com.moon.K a0) throws Throwable;
private static native boolean __call2_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory2_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead2_10(com.moon.K a0) throws Throwable;
private static native int __call2_11(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead2_12(com.moon.K a0) throws Throwable;
private static native boolean __call2_13(java.lang.Object a0) throws Throwable;
private static native int __integerCategory2_14(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead2_15(com.moon.K a0) throws Throwable;
private static native int __call2_16(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead2_17(com.moon.K a0) throws Throwable;
private static native boolean __call2_18(java.lang.Object a0) throws Throwable;
private static native int __integerCategory2_19(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead2_20(com.moon.K a0) throws Throwable;
private static native int __call2_21(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call2_22(com.moon.K a0) throws Throwable;
private static native int __call2_23(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite2_24(com.moon.K a0, int a1) throws Throwable;
private static native java.lang.Exception __call2000200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000205_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_be89de50add1f15b065f(com.moon.K a0) throws E;
private static final class __SourceHandler_be89de50add1f15b065f {

public static int f74(com.moon.K receiver) throws Throwable {
    int forwardValue74_19_0;
    int spill74_0;
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
    int life4_111;
    int life4_123;
    int life4_135;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead74_0() ^ 105598883742980L);
    life3_5 = __call74_1();
    spill74_0 = __fieldRead74_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue74_19_0 = spill74_0;
        break forward_join_19;
    }
    if (!((spill74_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead74_3(receiver);
    }
    forwardValue74_19_0 = __invokedynamic74_4(1395, (1549654967536719891L ^ life1_3));
    }
    life4_24 = forwardValue74_19_0;
    life4_35 = ((__invokedynamic74_5(14573, (2483550495921120655L ^ life1_3)) * life4_24) + __call74_7(__call74_6()));
    life4_45 = ((__invokedynamic74_8(14579, (8564569018303456662L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic74_9(27069, (3937533705973265626L ^ life1_3)) * life4_45) + __call74_11(__call74_10(receiver)));
    life4_67 = ((__invokedynamic74_12(22244, (2094745408346114951L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic74_13(21634, (6042039882501212643L ^ life1_3)) * life4_67) + __call74_15(__call74_14(receiver)));
    life4_89 = ((__invokedynamic74_16(22244, (2094745408346114951L ^ life1_3)) * life4_79) + 3);
    life4_101 = ((__invokedynamic74_17(21634, (6042039882501212643L ^ life1_3)) * life4_89) + __call74_19(__call74_18(receiver)));
    life4_111 = ((__invokedynamic74_20(22244, (2094745408346114951L ^ life1_3)) * life4_101) + 4);
    life4_123 = ((__invokedynamic74_21(21634, (6042039882501212643L ^ life1_3)) * life4_111) + __call74_23(__call74_22(receiver)));
    life4_135 = ((__invokedynamic74_24(31267, (7089455784250959687L ^ life1_3)) * life4_123) + __call74_26(__call74_25(receiver)));
    __fieldWrite74_27(receiver, life4_135);
    return life4_135;
}
public static void h74_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007400_0(p0);
}
public static void h74_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007401_0(p0);
}
private static native long __fieldRead74_0() throws Throwable;
private static native java.lang.String[] __call74_1() throws Throwable;
private static native int __fieldRead74_2(com.moon.K a0) throws Throwable;
private static native int __fieldRead74_3(com.moon.K a0) throws Throwable;
private static native int __invokedynamic74_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic74_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call74_6() throws Throwable;
private static native int __call74_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic74_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic74_9(int a0, long a1) throws Throwable;
private static native long __call74_10(com.moon.K a0) throws Throwable;
private static native int __call74_11(long a0) throws Throwable;
private static native int __invokedynamic74_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic74_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call74_14(com.moon.K a0) throws Throwable;
private static native int __call74_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic74_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic74_17(int a0, long a1) throws Throwable;
private static native java.lang.String __call74_18(com.moon.K a0) throws Throwable;
private static native int __call74_19(java.lang.String a0) throws Throwable;
private static native int __invokedynamic74_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic74_21(int a0, long a1) throws Throwable;
private static native java.lang.String __call74_22(com.moon.K a0) throws Throwable;
private static native int __call74_23(java.lang.String a0) throws Throwable;
private static native int __invokedynamic74_24(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call74_25(com.moon.K a0) throws Throwable;
private static native int __call74_26(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite74_27(com.moon.K a0, int a1) throws Throwable;
private static native java.lang.Exception __call1007400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_911c3603a2bc9d6643d2(com.moon.K a0) throws E;
private static final class __SourceHandler_911c3603a2bc9d6643d2 {

public static boolean f75(com.moon.K receiver) throws Throwable {
    int forwardValue75_17_0;
    int forwardValue75_26_0;
    java.lang.String[] spill75_0;
    int spill75_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead75_0() ^ 52763898526086L);
    spill75_0 = __call75_1();
    life4_7 = __fieldRead75_2(receiver);
    life3_8 = spill75_0;
    spill75_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue75_17_0 = spill75_1;
        break forward_join_17;
    }
    if (!((spill75_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory75_3(1);
    }
    forwardValue75_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue75_26_0 = forwardValue75_17_0;
        break forward_join_26;
    }
    if (!((forwardValue75_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory75_4(0);
    }
    __fieldWrite75_5(receiver, 1);
    forwardValue75_26_0 = 1;
    }
    return __integerCategory75_6(forwardValue75_26_0);
}
public static void h75_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007500_0(p0);
}
public static void h75_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007501_0(p0);
}
public static void h75_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007502_0(p0);
}
public static void h75_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1007503_0(p0);
}
private static native long __fieldRead75_0() throws Throwable;
private static native java.lang.String[] __call75_1() throws Throwable;
private static native byte __fieldRead75_2(com.moon.K a0) throws Throwable;
private static native boolean __integerCategory75_3(int value) throws Throwable;
private static native boolean __integerCategory75_4(int value) throws Throwable;
private static native void __fieldWrite75_5(com.moon.K a0, int a1) throws Throwable;
private static native boolean __integerCategory75_6(int value) throws Throwable;
private static native java.lang.Exception __call1007500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1007503_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aedb43f2696205bbeb28(com.moon.K a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_aedb43f2696205bbeb28 {

public static void f3(com.moon.K receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue3_21_0;
    int forwardValue3_32_0;
    int forwardValue3_45_0;
    com.moon.K forwardValue3_52_0;
    int spill3_0;
    com.moon.K spill3_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_52: {
    forward_join_51: {
    forward_join_45: {
    forward_join_40: {
    forward_join_32: {
    forward_join_29: {
    forward_join_21: {
    forward_join_18: {
    life2_3 = (__fieldRead3_0() ^ 132276102203846L);
    life4_5 = __call3_1();
    spill3_0 = __numericCompare3_3(__fieldRead3_2(receiver), 0L);
    if (!((life4_5 == null))) {
        forwardValue3_21_0 = spill3_0;
        break forward_join_21;
    }
    if (!((spill3_0 != 0))) {
        break forward_join_18;
    }
    __call3_5(p0, 1, __fieldRead3_4(receiver));
    }
    forwardValue3_21_0 = __integerCategory3_8(__call3_7(__fieldRead3_6(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue3_32_0 = forwardValue3_21_0;
        break forward_join_32;
    }
    if (!((forwardValue3_21_0 == 0))) {
        break forward_join_29;
    }
    __call3_10(p0, 2, __fieldRead3_9(receiver));
    }
    forwardValue3_32_0 = __integerCategory3_13(__call3_12(__fieldRead3_11(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue3_45_0 = forwardValue3_32_0;
        break forward_join_45;
    }
    if (!((forwardValue3_32_0 == 0))) {
        break forward_join_40;
    }
    __call3_15(p0, 3, __fieldRead3_14(receiver));
    }
    spill3_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue3_52_0 = spill3_1;
        break forward_join_52;
    }
    forwardValue3_45_0 = __integerCategory3_18(__call3_17(__fieldRead3_16(spill3_1)));
    }
    if (!((forwardValue3_45_0 == 0))) {
        break forward_join_51;
    }
    __call3_20(p0, 4, __fieldRead3_19(receiver));
    }
    forwardValue3_52_0 = receiver;
    }
    __call3_22(__call3_21(forwardValue3_52_0), p0);
    return;
}
public static void h3_0(java.io.IOException p0) throws Throwable {
    throw __call2000300_0(p0);
}
public static void h3_1(java.io.IOException p0) throws Throwable {
    throw __call2000301_0(p0);
}
public static void h3_2(java.io.IOException p0) throws Throwable {
    throw __call2000302_0(p0);
}
public static void h3_3(java.io.IOException p0) throws Throwable {
    throw __call2000303_0(p0);
}
public static void h3_4(java.io.IOException p0) throws Throwable {
    throw __call2000304_0(p0);
}
public static void h3_5(java.io.IOException p0) throws Throwable {
    throw __call2000305_0(p0);
}
public static void h3_6(java.io.IOException p0) throws Throwable {
    throw __call2000306_0(p0);
}
public static void h3_7(java.io.IOException p0) throws Throwable {
    throw __call2000307_0(p0);
}
private static native long __fieldRead3_0() throws Throwable;
private static native java.lang.String[] __call3_1() throws Throwable;
private static native long __fieldRead3_2(com.moon.K a0) throws Throwable;
private static native int __numericCompare3_3(long a0, long a1) throws Throwable;
private static native long __fieldRead3_4(com.moon.K a0) throws Throwable;
private static native void __call3_5(com.google.protobuf.CodedOutputStream a0, int a1, long a2) throws Throwable;
private static native java.lang.Object __fieldRead3_6(com.moon.K a0) throws Throwable;
private static native boolean __call3_7(java.lang.Object a0) throws Throwable;
private static native int __integerCategory3_8(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead3_9(com.moon.K a0) throws Throwable;
private static native void __call3_10(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead3_11(com.moon.K a0) throws Throwable;
private static native boolean __call3_12(java.lang.Object a0) throws Throwable;
private static native int __integerCategory3_13(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead3_14(com.moon.K a0) throws Throwable;
private static native void __call3_15(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead3_16(com.moon.K a0) throws Throwable;
private static native boolean __call3_17(java.lang.Object a0) throws Throwable;
private static native int __integerCategory3_18(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead3_19(com.moon.K a0) throws Throwable;
private static native void __call3_20(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call3_21(com.moon.K a0) throws Throwable;
private static native void __call3_22(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call2000300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000306_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000307_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_1ca993c88ebbd2a2d4f7(this, p0); }


public int hashCode() { return __sourceHandlerCall_be89de50add1f15b065f(this); }


public static com.moon.K b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.K)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.K.g)), ((java.io.InputStream)(p0)))));
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_c585195f7931cdfa67cc(this); }


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.K.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public com.moon.K b__K() {
return com.moon.K.f;
}


public static com.moon.am b__am() {
return ((com.moon.K)(com.moon.K.f)).c__am();
}


public static com.moon.K b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.K)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.K.g)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public java.lang.String b__String() { return __sourceHandlerCall_9be9cbd4c6ea5b04416a(this); }


public java.lang.String c__String() { return __sourceHandlerCall_85ebd1c6344328b66395(this); }


static void c(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.K.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public com.moon.am c__am() { return __sourceHandlerCall_a268c668eed951433a19(this); }


public com.google.protobuf.ByteString c() { return __sourceHandlerCall_0dc756bf53c9be93cf0d(this); }


public static com.moon.K a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.K)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.K.g)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public static com.moon.K a__K() {
return com.moon.K.f;
}


protected com.moon.am a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.am local2 = new com.moon.am(p0);
    return local2;
}


public static com.moon.am a(com.moon.K p0) {
return ((com.moon.am)(((com.moon.K)(com.moon.K.f)).c__am())).a(((com.moon.K)(p0)));
}


public static com.moon.K a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.K)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.K.g)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.am a__am() {
return com.moon.K.b__am();
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20715;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/K", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.K.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral95_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/K"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.K.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.oF.a;
}


public static com.google.protobuf.Parser<com.moon.K> a__Parser() {
return com.moon.K.g;
}


public static com.moon.K a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.K)(((com.google.protobuf.Parser)(com.moon.K.g)).parseFrom(((byte[])(p0)))));
}


public static com.moon.K a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.K)(((com.google.protobuf.Parser)(com.moon.K.g)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_daa163c9345c2d6f7ed0(this); }


public static com.moon.K a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.K)(((com.google.protobuf.Parser)(com.moon.K.g)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.K a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.K)(((com.google.protobuf.Parser)(com.moon.K.g)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static com.moon.K a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.K)(((com.google.protobuf.Parser)(com.moon.K.g)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public java.lang.String a__String() { return __sourceHandlerCall_a561951cc57364c47b41(this); }


public long a() {
return this.a;
}


public static com.moon.K a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.K)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.K.g)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.K a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.K)(((com.google.protobuf.Parser)(com.moon.K.g)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.K a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.K)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.K.g)), ((java.io.InputStream)(p0)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.K();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_aedb43f2696205bbeb28(this, p0); }


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.K)(this)).c__am();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.K)(this)).c__am();
}


public final boolean isInitialized() { return __sourceHandlerCall_911c3603a2bc9d6643d2(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.oF.b)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.K.class)), ((java.lang.Class)(com.moon.am.class)));
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.K)(this)).b__K();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.K)(this)).b__K();
}


public com.google.protobuf.Parser<com.moon.K> getParserForType() {
return com.moon.K.g;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_b681fb51c7c741eb686f(this); }


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.K)(this)).a__am();
}


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.K)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.K)(this)).a__am();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral95_0() throws E;
}
