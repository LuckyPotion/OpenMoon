package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class D extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oz {

private static long serialVersionUID = 0L;

private long a;

private volatile java.lang.Object b;

private volatile java.lang.Object c;

private volatile java.lang.Object d;

private byte e;

private static com.moon.D f;

private static com.google.protobuf.Parser<com.moon.D> g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

private D(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.e = -1;
}


private D() {
super();
    this.e = -1;
    this.b = "";
    this.c = "";
    this.d = "";
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-7705069169754761304L)), ((long)(-5932596558674888527L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(137475494863790L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.D.h ^ 119788054610040L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1_14 = new byte[8];
    (__sourceSpill1_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1_16 = __sourceSpill1_14;
    ((javax.crypto.Cipher)(__sourceSpill1_11)).init(((int)(__sourceSpill1_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\tcW¦Ï\001\t\020­\034=à\004'£!\017ÝGB>Á³[\016\tói1\030²`¡\037\0276"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1_25 = local6_life21;
        int __sourceSpill1_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1_25)).substring(((int)(__sourceSpill1_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1_30 = local8_life19;
        int __sourceSpill1_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1_33 = new byte[8];
        (__sourceSpill1_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1_34)).doFinal(((byte[])(__sourceSpill1_33)));
        (__sourceSpill1_30)[__sourceSpill1_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "G÷©¼\0060\030\016b|!<"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1_38 = local6_life21;
        int __sourceSpill1_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1_38)).substring(((int)(__sourceSpill1_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1_43 = local8_life19;
        int __sourceSpill1_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1_46 = new byte[8];
        (__sourceSpill1_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1_47)).doFinal(((byte[])(__sourceSpill1_46)));
        (__sourceSpill1_43)[__sourceSpill1_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[7]));
    f = ((com.moon.D)(new com.moon.D()));
    g = ((com.google.protobuf.Parser)(new com.moon.b()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_8c6fdf1c57124d5bcca7(com.moon.D a0) throws E;
private static final class __SourceHandler_8c6fdf1c57124d5bcca7 {

public static com.google.protobuf.ByteString f12(com.moon.D receiver) throws Throwable {
    java.lang.Object forwardValue12_24_0;
    java.lang.String[] spill12_0;
    java.lang.Object spill12_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead12_0() ^ 114217460559169L);
    spill12_0 = __call12_1();
    life4_7 = __fieldRead12_2(receiver);
    life3_8 = spill12_0;
    spill12_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue12_24_0 = spill12_1;
        break forward_join_24;
    }
    if (!((__instanceOf12_3(spill12_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call12_5(__cast12_4(life4_7));
    __fieldWrite12_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue12_24_0 = life4_7;
    }
    return __cast12_7(forwardValue12_24_0);
}
public static void h12_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001200_0(p0);
}
private static native long __fieldRead12_0() throws Throwable;
private static native java.lang.String[] __call12_1() throws Throwable;
private static native java.lang.Object __fieldRead12_2(com.moon.D a0) throws Throwable;
private static native int __instanceOf12_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast12_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call12_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite12_6(com.moon.D a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast12_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1001200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_dbedd9ab963cdcf711f9(com.moon.D a0) throws E;
private static final class __SourceHandler_dbedd9ab963cdcf711f9 {

public static java.lang.String f13(com.moon.D receiver) throws Throwable {
    java.lang.Object forwardValue13_18_0;
    java.lang.String[] spill13_0;
    java.lang.Object spill13_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead13_0() ^ 33463995292108L);
    spill13_0 = __call13_1();
    life4_7 = __fieldRead13_2(receiver);
    life3_8 = spill13_0;
    spill13_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue13_18_0 = spill13_1;
        break forward_join_18;
    }
    if (!((__instanceOf13_3(spill13_1) != 0))) {
        break forward_join_17;
    }
    return __cast13_4(life4_7);
    }
    forwardValue13_18_0 = life4_7;
    }
    life5_24 = __cast13_5(forwardValue13_18_0);
    life6_27 = __call13_6(life5_24);
    __fieldWrite13_7(receiver, life6_27);
    return life6_27;
}
public static void h13_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001300_0(p0);
}
public static void h13_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001301_0(p0);
}
private static native long __fieldRead13_0() throws Throwable;
private static native java.lang.String[] __call13_1() throws Throwable;
private static native java.lang.Object __fieldRead13_2(com.moon.D a0) throws Throwable;
private static native int __instanceOf13_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast13_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast13_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call13_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite13_7(com.moon.D a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1001300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001301_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_137f3e44a6340ec37c3e(com.moon.D a0) throws E;
private static final class __SourceHandler_137f3e44a6340ec37c3e {

public static com.google.protobuf.ByteString f14(com.moon.D receiver) throws Throwable {
    java.lang.Object forwardValue14_24_0;
    java.lang.String[] spill14_0;
    java.lang.Object spill14_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead14_0() ^ 95882468656055L);
    spill14_0 = __call14_1();
    life4_7 = __fieldRead14_2(receiver);
    life3_8 = spill14_0;
    spill14_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue14_24_0 = spill14_1;
        break forward_join_24;
    }
    if (!((__instanceOf14_3(spill14_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call14_5(__cast14_4(life4_7));
    __fieldWrite14_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue14_24_0 = life4_7;
    }
    return __cast14_7(forwardValue14_24_0);
}
public static void h14_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001400_0(p0);
}
private static native long __fieldRead14_0() throws Throwable;
private static native java.lang.String[] __call14_1() throws Throwable;
private static native java.lang.Object __fieldRead14_2(com.moon.D a0) throws Throwable;
private static native int __instanceOf14_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast14_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call14_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite14_6(com.moon.D a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast14_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1001400_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c3e69d0a928b4e591564(com.moon.D a0) throws E;
private static final class __SourceHandler_c3e69d0a928b4e591564 {

public static java.lang.String f15(com.moon.D receiver) throws Throwable {
    java.lang.Object forwardValue15_18_0;
    java.lang.String[] spill15_0;
    java.lang.Object spill15_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead15_0() ^ 21072592457107L);
    spill15_0 = __call15_1();
    life4_7 = __fieldRead15_2(receiver);
    life3_8 = spill15_0;
    spill15_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue15_18_0 = spill15_1;
        break forward_join_18;
    }
    if (!((__instanceOf15_3(spill15_1) != 0))) {
        break forward_join_17;
    }
    return __cast15_4(life4_7);
    }
    forwardValue15_18_0 = life4_7;
    }
    life5_24 = __cast15_5(forwardValue15_18_0);
    life6_27 = __call15_6(life5_24);
    __fieldWrite15_7(receiver, life6_27);
    return life6_27;
}
public static void h15_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001500_0(p0);
}
public static void h15_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001501_0(p0);
}
private static native long __fieldRead15_0() throws Throwable;
private static native java.lang.String[] __call15_1() throws Throwable;
private static native java.lang.Object __fieldRead15_2(com.moon.D a0) throws Throwable;
private static native int __instanceOf15_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast15_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast15_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call15_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite15_7(com.moon.D a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1001500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001501_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_7e59e47a0dad1685b477(com.moon.D a0) throws E;
private static final class __SourceHandler_7e59e47a0dad1685b477 {

public static com.google.protobuf.ByteString f16(com.moon.D receiver) throws Throwable {
    java.lang.Object forwardValue16_24_0;
    java.lang.String[] spill16_0;
    java.lang.Object spill16_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead16_0() ^ 71381256474538L);
    spill16_0 = __call16_1();
    life4_7 = __fieldRead16_2(receiver);
    life3_8 = spill16_0;
    spill16_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue16_24_0 = spill16_1;
        break forward_join_24;
    }
    if (!((__instanceOf16_3(spill16_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call16_5(__cast16_4(life4_7));
    __fieldWrite16_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue16_24_0 = life4_7;
    }
    return __cast16_7(forwardValue16_24_0);
}
public static void h16_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001600_0(p0);
}
private static native long __fieldRead16_0() throws Throwable;
private static native java.lang.String[] __call16_1() throws Throwable;
private static native java.lang.Object __fieldRead16_2(com.moon.D a0) throws Throwable;
private static native int __instanceOf16_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast16_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call16_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite16_6(com.moon.D a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast16_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1001600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_735b19ccffa6888f5e7f(com.moon.D a0) throws E;
private static final class __SourceHandler_735b19ccffa6888f5e7f {

public static java.lang.String f17(com.moon.D receiver) throws Throwable {
    java.lang.Object forwardValue17_18_0;
    java.lang.String[] spill17_0;
    java.lang.Object spill17_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead17_0() ^ 17946775990682L);
    spill17_0 = __call17_1();
    life4_7 = __fieldRead17_2(receiver);
    life3_8 = spill17_0;
    spill17_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue17_18_0 = spill17_1;
        break forward_join_18;
    }
    if (!((__instanceOf17_3(spill17_1) != 0))) {
        break forward_join_17;
    }
    return __cast17_4(life4_7);
    }
    forwardValue17_18_0 = life4_7;
    }
    life5_24 = __cast17_5(forwardValue17_18_0);
    life6_27 = __call17_6(life5_24);
    __fieldWrite17_7(receiver, life6_27);
    return life6_27;
}
public static void h17_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001700_0(p0);
}
public static void h17_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001701_0(p0);
}
private static native long __fieldRead17_0() throws Throwable;
private static native java.lang.String[] __call17_1() throws Throwable;
private static native java.lang.Object __fieldRead17_2(com.moon.D a0) throws Throwable;
private static native int __instanceOf17_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast17_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast17_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call17_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite17_7(com.moon.D a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1001700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.af __sourceHandlerCall_dc92e530445689369dc4(com.moon.D a0) throws E;
private static final class __SourceHandler_dc92e530445689369dc4 {

public static com.moon.af f19(com.moon.D receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead19_0() ^ 111362166386968L);
    return ((receiver == __fieldRead19_1()) ? new com.moon.af() : __call19_2(new com.moon.af(), receiver));
}
public static void h19_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001900_0(p0);
}
private static native long __fieldRead19_0() throws Throwable;
private static native com.moon.D __fieldRead19_1() throws Throwable;
private static native com.moon.af __call19_2(com.moon.af a0, com.moon.D a1) throws Throwable;
private static native java.lang.Exception __call1001900_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a56b903d52f9f284d92a(com.moon.D a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_a56b903d52f9f284d92a {

public static boolean f18(com.moon.D receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue18_14_0;
    java.lang.Object forwardValue18_23_0;
    int forwardValue18_40_0;
    int forwardValue18_50_0;
    int forwardValue18_60_0;
    int forwardValue18_70_0;
    int forwardValue18_76_0;
    java.lang.Object spill18_0;
    int spill18_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.D life5_34;
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
    life2_3 = (__fieldRead18_0() ^ 120287565216827L);
    life4_5 = __call18_1();
    spill18_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue18_14_0 = spill18_0;
        break forward_join_14;
    }
    if (!((spill18_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory18_2(1);
    }
    forwardValue18_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue18_23_0 = forwardValue18_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf18_3(forwardValue18_14_0) == 0))) {
        break forward_join_22;
    }
    return __call18_4(receiver, p0);
    }
    forwardValue18_23_0 = p0;
    }
    life5_34 = __cast18_5(forwardValue18_23_0);
    spill18_1 = __numericCompare18_8(__call18_6(receiver), __call18_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue18_40_0 = spill18_1;
        break forward_join_40;
    }
    if (!((spill18_1 != 0))) {
        break forward_join_35;
    }
    return __integerCategory18_9(0);
    }
    forwardValue18_40_0 = __integerCategory18_13(__call18_12(__call18_10(receiver), __call18_11(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue18_50_0 = forwardValue18_40_0;
        break forward_join_50;
    }
    if (!((forwardValue18_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory18_14(0);
    }
    forwardValue18_50_0 = __integerCategory18_18(__call18_17(__call18_15(receiver), __call18_16(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue18_60_0 = forwardValue18_50_0;
        break forward_join_60;
    }
    if (!((forwardValue18_50_0 == 0))) {
        break forward_join_55;
    }
    return __integerCategory18_19(0);
    }
    forwardValue18_60_0 = __integerCategory18_23(__call18_22(__call18_20(receiver), __call18_21(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue18_70_0 = forwardValue18_60_0;
        break forward_join_70;
    }
    if (!((forwardValue18_60_0 == 0))) {
        break forward_join_65;
    }
    return __integerCategory18_24(0);
    }
    forwardValue18_70_0 = __integerCategory18_28(__call18_27(__call18_25(receiver), __call18_26(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue18_76_0 = forwardValue18_70_0;
        break forward_join_76;
    }
    if (!((forwardValue18_70_0 == 0))) {
        break forward_join_75;
    }
    return __integerCategory18_29(0);
    }
    forwardValue18_76_0 = 1;
    }
    return __integerCategory18_30(forwardValue18_76_0);
}
public static void h18_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001800_0(p0);
}
public static void h18_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001801_0(p0);
}
public static void h18_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001802_0(p0);
}
public static void h18_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001803_0(p0);
}
public static void h18_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001804_0(p0);
}
public static void h18_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001805_0(p0);
}
public static void h18_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001806_0(p0);
}
public static void h18_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001807_0(p0);
}
public static void h18_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001808_0(p0);
}
public static void h18_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001809_0(p0);
}
public static void h18_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001810_0(p0);
}
public static void h18_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001811_0(p0);
}
public static void h18_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001812_0(p0);
}
public static void h18_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001813_0(p0);
}
private static native long __fieldRead18_0() throws Throwable;
private static native java.lang.String[] __call18_1() throws Throwable;
private static native boolean __integerCategory18_2(int value) throws Throwable;
private static native int __instanceOf18_3(java.lang.Object a0) throws Throwable;
private static native boolean __call18_4(com.moon.D a0, java.lang.Object a1) throws Throwable;
private static native com.moon.D __cast18_5(java.lang.Object a0) throws Throwable;
private static native long __call18_6(com.moon.D a0) throws Throwable;
private static native long __call18_7(com.moon.D a0) throws Throwable;
private static native int __numericCompare18_8(long a0, long a1) throws Throwable;
private static native boolean __integerCategory18_9(int value) throws Throwable;
private static native java.lang.String __call18_10(com.moon.D a0) throws Throwable;
private static native java.lang.String __call18_11(com.moon.D a0) throws Throwable;
private static native boolean __call18_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory18_13(boolean value) throws Throwable;
private static native boolean __integerCategory18_14(int value) throws Throwable;
private static native java.lang.String __call18_15(com.moon.D a0) throws Throwable;
private static native java.lang.String __call18_16(com.moon.D a0) throws Throwable;
private static native boolean __call18_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory18_18(boolean value) throws Throwable;
private static native boolean __integerCategory18_19(int value) throws Throwable;
private static native java.lang.String __call18_20(com.moon.D a0) throws Throwable;
private static native java.lang.String __call18_21(com.moon.D a0) throws Throwable;
private static native boolean __call18_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory18_23(boolean value) throws Throwable;
private static native boolean __integerCategory18_24(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call18_25(com.moon.D a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call18_26(com.moon.D a0) throws Throwable;
private static native boolean __call18_27(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory18_28(boolean value) throws Throwable;
private static native boolean __integerCategory18_29(int value) throws Throwable;
private static native boolean __integerCategory18_30(int value) throws Throwable;
private static native java.lang.Exception __call1001800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001801_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001802_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001803_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001804_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001805_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001806_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001807_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001808_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001809_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001810_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001811_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001812_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001813_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_aa3708e05f72860919f2(com.moon.D a0) throws E;
private static final class __SourceHandler_aa3708e05f72860919f2 {

public static int f0(com.moon.D receiver) throws Throwable {
    int forwardValue0_22_0;
    int forwardValue0_35_0;
    int forwardValue0_48_0;
    int forwardValue0_61_0;
    int forwardValue0_81_0;
    java.lang.String[] spill0_0;
    int spill0_1;
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
    life1_3 = (__fieldRead0_0() ^ 135622725706969L);
    spill0_0 = __call0_1();
    life4_7 = __fieldRead0_2(receiver);
    life3_8 = spill0_0;
    spill0_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue0_22_0 = spill0_1;
        break forward_join_22;
    }
    if (!((spill0_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue0_22_0 = __numericCompare0_4(__fieldRead0_3(receiver), 0L);
    }
    if (!((life3_8 == null))) {
        forwardValue0_35_0 = forwardValue0_22_0;
        break forward_join_35;
    }
    if (!((forwardValue0_22_0 != 0))) {
        break forward_join_32;
    }
    life4_7 = (life4_7 + __call0_6(1, __fieldRead0_5(receiver)));
    }
    forwardValue0_35_0 = __integerCategory0_9(__call0_8(__fieldRead0_7(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue0_48_0 = forwardValue0_35_0;
        break forward_join_48;
    }
    if (!((forwardValue0_35_0 == 0))) {
        break forward_join_45;
    }
    life4_7 = (life4_7 + __call0_11(2, __fieldRead0_10(receiver)));
    }
    forwardValue0_48_0 = __integerCategory0_14(__call0_13(__fieldRead0_12(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue0_61_0 = forwardValue0_48_0;
        break forward_join_61;
    }
    if (!((forwardValue0_48_0 == 0))) {
        break forward_join_58;
    }
    life4_7 = (life4_7 + __call0_16(3, __fieldRead0_15(receiver)));
    }
    forwardValue0_61_0 = __integerCategory0_19(__call0_18(__fieldRead0_17(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue0_81_0 = forwardValue0_61_0;
        break forward_join_81;
    }
    if (!((forwardValue0_61_0 == 0))) {
        break forward_join_71;
    }
    life4_7 = (life4_7 + __call0_21(4, __fieldRead0_20(receiver)));
    }
    life4_93 = (life4_7 + __call0_23(__call0_22(receiver)));
    __fieldWrite0_24(receiver, life4_93);
    forwardValue0_81_0 = life4_93;
    }
    return forwardValue0_81_0;
}
public static int h0_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000000_0(p0);
}
public static int h0_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000001_0(p0);
}
public static int h0_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000002_0(p0);
}
public static int h0_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000003_0(p0);
}
public static int h0_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000004_0(p0);
}
public static int h0_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2000005_0(p0);
}
private static native long __fieldRead0_0() throws Throwable;
private static native java.lang.String[] __call0_1() throws Throwable;
private static native int __fieldRead0_2(com.moon.D a0) throws Throwable;
private static native long __fieldRead0_3(com.moon.D a0) throws Throwable;
private static native int __numericCompare0_4(long a0, long a1) throws Throwable;
private static native long __fieldRead0_5(com.moon.D a0) throws Throwable;
private static native int __call0_6(int a0, long a1) throws Throwable;
private static native java.lang.Object __fieldRead0_7(com.moon.D a0) throws Throwable;
private static native boolean __call0_8(java.lang.Object a0) throws Throwable;
private static native int __integerCategory0_9(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead0_10(com.moon.D a0) throws Throwable;
private static native int __call0_11(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead0_12(com.moon.D a0) throws Throwable;
private static native boolean __call0_13(java.lang.Object a0) throws Throwable;
private static native int __integerCategory0_14(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead0_15(com.moon.D a0) throws Throwable;
private static native int __call0_16(int a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __fieldRead0_17(com.moon.D a0) throws Throwable;
private static native boolean __call0_18(java.lang.Object a0) throws Throwable;
private static native int __integerCategory0_19(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead0_20(com.moon.D a0) throws Throwable;
private static native int __call0_21(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call0_22(com.moon.D a0) throws Throwable;
private static native int __call0_23(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite0_24(com.moon.D a0, int a1) throws Throwable;
private static native java.lang.Exception __call2000000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000003_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000004_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call2000005_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_8706752a973c346406bd(com.moon.D a0) throws E;
private static final class __SourceHandler_8706752a973c346406bd {

public static int f19(com.moon.D receiver) throws Throwable {
    int forwardValue19_19_0;
    int spill19_0;
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
    life1_3 = (__fieldRead19_0() ^ 726688340796L);
    life3_5 = __call19_1();
    spill19_0 = __fieldRead19_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue19_19_0 = spill19_0;
        break forward_join_19;
    }
    if (!((spill19_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead19_3(receiver);
    }
    forwardValue19_19_0 = __invokedynamic19_4(24019, (6097939405257647039L ^ life1_3));
    }
    life4_24 = forwardValue19_19_0;
    life4_35 = ((__invokedynamic19_5(6874, (5562979055219958962L ^ life1_3)) * life4_24) + __call19_7(__call19_6()));
    life4_45 = ((__invokedynamic19_8(28054, (4038037228654400508L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic19_9(13030, (6541677964238310543L ^ life1_3)) * life4_45) + __call19_11(__call19_10(receiver)));
    life4_67 = ((__invokedynamic19_12(27008, (1699699782332291054L ^ life1_3)) * life4_57) + 2);
    life4_79 = ((__invokedynamic19_13(26519, (7822269948336249336L ^ life1_3)) * life4_67) + __call19_15(__call19_14(receiver)));
    life4_89 = ((__invokedynamic19_16(27008, (1699699782332291054L ^ life1_3)) * life4_79) + 3);
    life4_101 = ((__invokedynamic19_17(26519, (7822269948336249336L ^ life1_3)) * life4_89) + __call19_19(__call19_18(receiver)));
    life4_111 = ((__invokedynamic19_20(27008, (1699699782332291054L ^ life1_3)) * life4_101) + 4);
    life4_123 = ((__invokedynamic19_21(26519, (7822269948336249336L ^ life1_3)) * life4_111) + __call19_23(__call19_22(receiver)));
    life4_135 = ((__invokedynamic19_24(5872, (1566153979069130907L ^ life1_3)) * life4_123) + __call19_26(__call19_25(receiver)));
    __fieldWrite19_27(receiver, life4_135);
    return life4_135;
}
public static void h19_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001900_0(p0);
}
public static void h19_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1001901_0(p0);
}
private static native long __fieldRead19_0() throws Throwable;
private static native java.lang.String[] __call19_1() throws Throwable;
private static native int __fieldRead19_2(com.moon.D a0) throws Throwable;
private static native int __fieldRead19_3(com.moon.D a0) throws Throwable;
private static native int __invokedynamic19_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic19_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call19_6() throws Throwable;
private static native int __call19_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic19_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic19_9(int a0, long a1) throws Throwable;
private static native long __call19_10(com.moon.D a0) throws Throwable;
private static native int __call19_11(long a0) throws Throwable;
private static native int __invokedynamic19_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic19_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call19_14(com.moon.D a0) throws Throwable;
private static native int __call19_15(java.lang.String a0) throws Throwable;
private static native int __invokedynamic19_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic19_17(int a0, long a1) throws Throwable;
private static native java.lang.String __call19_18(com.moon.D a0) throws Throwable;
private static native int __call19_19(java.lang.String a0) throws Throwable;
private static native int __invokedynamic19_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic19_21(int a0, long a1) throws Throwable;
private static native java.lang.String __call19_22(com.moon.D a0) throws Throwable;
private static native int __call19_23(java.lang.String a0) throws Throwable;
private static native int __invokedynamic19_24(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call19_25(com.moon.D a0) throws Throwable;
private static native int __call19_26(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite19_27(com.moon.D a0, int a1) throws Throwable;
private static native java.lang.Exception __call1001900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1001901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c2f467025cef74d947e0(com.moon.D a0) throws E;
private static final class __SourceHandler_c2f467025cef74d947e0 {

public static boolean f20(com.moon.D receiver) throws Throwable {
    int forwardValue20_17_0;
    int forwardValue20_26_0;
    java.lang.String[] spill20_0;
    int spill20_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead20_0() ^ 122866914125989L);
    spill20_0 = __call20_1();
    life4_7 = __fieldRead20_2(receiver);
    life3_8 = spill20_0;
    spill20_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue20_17_0 = spill20_1;
        break forward_join_17;
    }
    if (!((spill20_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory20_3(1);
    }
    forwardValue20_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue20_26_0 = forwardValue20_17_0;
        break forward_join_26;
    }
    if (!((forwardValue20_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory20_4(0);
    }
    __fieldWrite20_5(receiver, 1);
    forwardValue20_26_0 = 1;
    }
    return __integerCategory20_6(forwardValue20_26_0);
}
public static void h20_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1002000_0(p0);
}
public static void h20_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1002001_0(p0);
}
public static void h20_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1002002_0(p0);
}
public static void h20_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1002003_0(p0);
}
private static native long __fieldRead20_0() throws Throwable;
private static native java.lang.String[] __call20_1() throws Throwable;
private static native byte __fieldRead20_2(com.moon.D a0) throws Throwable;
private static native boolean __integerCategory20_3(int value) throws Throwable;
private static native boolean __integerCategory20_4(int value) throws Throwable;
private static native void __fieldWrite20_5(com.moon.D a0, int a1) throws Throwable;
private static native boolean __integerCategory20_6(int value) throws Throwable;
private static native java.lang.Exception __call1002000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1002001_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1002002_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1002003_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d0faefbe6aaae7deab5c(com.moon.D a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_d0faefbe6aaae7deab5c {

public static void f1(com.moon.D receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    int forwardValue1_21_0;
    int forwardValue1_32_0;
    int forwardValue1_45_0;
    com.moon.D forwardValue1_52_0;
    int spill1_0;
    com.moon.D spill1_1;
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
    life2_3 = (__fieldRead1_0() ^ 87442676035405L);
    life4_5 = __call1_1();
    spill1_0 = __numericCompare1_3(__fieldRead1_2(receiver), 0L);
    if (!((life4_5 == null))) {
        forwardValue1_21_0 = spill1_0;
        break forward_join_21;
    }
    if (!((spill1_0 != 0))) {
        break forward_join_18;
    }
    __call1_5(p0, 1, __fieldRead1_4(receiver));
    }
    forwardValue1_21_0 = __integerCategory1_8(__call1_7(__fieldRead1_6(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue1_32_0 = forwardValue1_21_0;
        break forward_join_32;
    }
    if (!((forwardValue1_21_0 == 0))) {
        break forward_join_29;
    }
    __call1_10(p0, 2, __fieldRead1_9(receiver));
    }
    forwardValue1_32_0 = __integerCategory1_13(__call1_12(__fieldRead1_11(receiver)));
    }
    if (!((life4_5 == null))) {
        forwardValue1_45_0 = forwardValue1_32_0;
        break forward_join_45;
    }
    if (!((forwardValue1_32_0 == 0))) {
        break forward_join_40;
    }
    __call1_15(p0, 3, __fieldRead1_14(receiver));
    }
    spill1_1 = receiver;
    if (!((life4_5 == null))) {
        forwardValue1_52_0 = spill1_1;
        break forward_join_52;
    }
    forwardValue1_45_0 = __integerCategory1_18(__call1_17(__fieldRead1_16(spill1_1)));
    }
    if (!((forwardValue1_45_0 == 0))) {
        break forward_join_51;
    }
    __call1_20(p0, 4, __fieldRead1_19(receiver));
    }
    forwardValue1_52_0 = receiver;
    }
    __call1_22(__call1_21(forwardValue1_52_0), p0);
    return;
}
public static void h1_0(java.io.IOException p0) throws Throwable {
    throw __call2000100_0(p0);
}
public static void h1_1(java.io.IOException p0) throws Throwable {
    throw __call2000101_0(p0);
}
public static void h1_2(java.io.IOException p0) throws Throwable {
    throw __call2000102_0(p0);
}
public static void h1_3(java.io.IOException p0) throws Throwable {
    throw __call2000103_0(p0);
}
public static void h1_4(java.io.IOException p0) throws Throwable {
    throw __call2000104_0(p0);
}
public static void h1_5(java.io.IOException p0) throws Throwable {
    throw __call2000105_0(p0);
}
public static void h1_6(java.io.IOException p0) throws Throwable {
    throw __call2000106_0(p0);
}
public static void h1_7(java.io.IOException p0) throws Throwable {
    throw __call2000107_0(p0);
}
private static native long __fieldRead1_0() throws Throwable;
private static native java.lang.String[] __call1_1() throws Throwable;
private static native long __fieldRead1_2(com.moon.D a0) throws Throwable;
private static native int __numericCompare1_3(long a0, long a1) throws Throwable;
private static native long __fieldRead1_4(com.moon.D a0) throws Throwable;
private static native void __call1_5(com.google.protobuf.CodedOutputStream a0, int a1, long a2) throws Throwable;
private static native java.lang.Object __fieldRead1_6(com.moon.D a0) throws Throwable;
private static native boolean __call1_7(java.lang.Object a0) throws Throwable;
private static native int __integerCategory1_8(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead1_9(com.moon.D a0) throws Throwable;
private static native void __call1_10(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead1_11(com.moon.D a0) throws Throwable;
private static native boolean __call1_12(java.lang.Object a0) throws Throwable;
private static native int __integerCategory1_13(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead1_14(com.moon.D a0) throws Throwable;
private static native void __call1_15(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native java.lang.Object __fieldRead1_16(com.moon.D a0) throws Throwable;
private static native boolean __call1_17(java.lang.Object a0) throws Throwable;
private static native int __integerCategory1_18(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead1_19(com.moon.D a0) throws Throwable;
private static native void __call1_20(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call1_21(com.moon.D a0) throws Throwable;
private static native void __call1_22(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call2000100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2000107_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_a56b903d52f9f284d92a(this, p0); }


public int hashCode() { return __sourceHandlerCall_8706752a973c346406bd(this); }


public static com.moon.D b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.D)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.D.g)), ((java.io.InputStream)(p0)))));
}


public com.google.protobuf.ByteString b() { return __sourceHandlerCall_137f3e44a6340ec37c3e(this); }


static void b(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.D.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public com.moon.D b__D() {
return com.moon.D.f;
}


public static com.moon.af b__af() {
return ((com.moon.D)(com.moon.D.f)).c__af();
}


public static com.moon.D b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.D)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.D.g)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public java.lang.String b__String() { return __sourceHandlerCall_c3e69d0a928b4e591564(this); }


public java.lang.String c__String() { return __sourceHandlerCall_735b19ccffa6888f5e7f(this); }


static void c(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.D.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public com.moon.af c__af() { return __sourceHandlerCall_dc92e530445689369dc4(this); }


public com.google.protobuf.ByteString c() { return __sourceHandlerCall_7e59e47a0dad1685b477(this); }


public static com.moon.D a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.D)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.D.g)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public static com.moon.D a__D() {
return com.moon.D.f;
}


protected com.moon.af a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.af local2 = new com.moon.af(p0);
    return local2;
}


public static com.moon.af a(com.moon.D p0) {
return ((com.moon.af)(((com.moon.D)(com.moon.D.f)).c__af())).a(((com.moon.D)(p0)));
}


public static com.moon.D a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.D)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.D.g)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.af a__af() {
return com.moon.D.b__af();
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3186;
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
            throw new RuntimeException("com/moon/D", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.D.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral23_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/D"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.D.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.ox.e;
}


public static com.google.protobuf.Parser<com.moon.D> a__Parser() {
return com.moon.D.g;
}


public static com.moon.D a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.D)(((com.google.protobuf.Parser)(com.moon.D.g)).parseFrom(((byte[])(p0)))));
}


public static com.moon.D a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.D)(((com.google.protobuf.Parser)(com.moon.D.g)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.google.protobuf.ByteString a__ByteString() { return __sourceHandlerCall_8c6fdf1c57124d5bcca7(this); }


public static com.moon.D a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.D)(((com.google.protobuf.Parser)(com.moon.D.g)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.D a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.D)(((com.google.protobuf.Parser)(com.moon.D.g)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static com.moon.D a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.D)(((com.google.protobuf.Parser)(com.moon.D.g)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public java.lang.String a__String() { return __sourceHandlerCall_dbedd9ab963cdcf711f9(this); }


public long a() {
return this.a;
}


public static com.moon.D a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.D)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.D.g)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.D a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.D)(((com.google.protobuf.Parser)(com.moon.D.g)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.D a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.D)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.D.g)), ((java.io.InputStream)(p0)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.D();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_d0faefbe6aaae7deab5c(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_c2f467025cef74d947e0(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.ox.f)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.D.class)), ((java.lang.Class)(com.moon.af.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.D)(this)).c__af();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.D)(this)).c__af();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.D)(this)).b__D();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.D)(this)).b__D();
}


public com.google.protobuf.Parser<com.moon.D> getParserForType() {
return com.moon.D.g;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_aa3708e05f72860919f2(this); }


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.D)(this)).a__af();
}


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.D)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.D)(this)).a__af();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral23_0() throws E;
}
