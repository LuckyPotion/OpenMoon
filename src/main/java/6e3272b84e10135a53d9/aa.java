package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class aa extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oY {

private static long serialVersionUID = 0L;

private volatile java.lang.Object a;

private byte b;

private static com.moon.aa c;

private static com.google.protobuf.Parser<com.moon.aa> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private aa(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private aa() {
super();
    this.b = -1;
    this.a = "";
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-6238337555861308519L)), ((long)(6993160489447030201L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(254569305144317L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.aa.e ^ 133650547920282L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill42_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill42_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill42_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill42_14 = new byte[8];
    (__sourceSpill42_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill42_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation42_16 = __sourceSpill42_14;
    ((javax.crypto.Cipher)(__sourceSpill42_11)).init(((int)(__sourceSpill42_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill42_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation42_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ":8Uó¯ð\034\b+x¤Ð&\022À»\"ò\027WfÅ#ø"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill42_25 = local6_life21;
        int __sourceSpill42_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill42_25)).substring(((int)(__sourceSpill42_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill42_30 = local8_life19;
        int __sourceSpill42_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill42_33 = new byte[8];
        (__sourceSpill42_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill42_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill42_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill42_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill42_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill42_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill42_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill42_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill42_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill42_34)).doFinal(((byte[])(__sourceSpill42_33)));
        (__sourceSpill42_30)[__sourceSpill42_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "y·pd\bÝ)\004ÿÜs|öq\036"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill42_38 = local6_life21;
        int __sourceSpill42_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill42_38)).substring(((int)(__sourceSpill42_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill42_43 = local8_life19;
        int __sourceSpill42_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill42_46 = new byte[8];
        (__sourceSpill42_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill42_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill42_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill42_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill42_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill42_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill42_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill42_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill42_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill42_47)).doFinal(((byte[])(__sourceSpill42_46)));
        (__sourceSpill42_43)[__sourceSpill42_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.aa)(new com.moon.aa()));
    d = ((com.google.protobuf.Parser)(new com.moon.y()));
}

private static native <E extends Throwable> com.google.protobuf.ByteString __sourceHandlerCall_c31f6d01e33a71b3c5c8(com.moon.aa a0) throws E;
private static final class __SourceHandler_c31f6d01e33a71b3c5c8 {

public static com.google.protobuf.ByteString f220(com.moon.aa receiver) throws Throwable {
    java.lang.Object forwardValue220_24_0;
    java.lang.String[] spill220_0;
    java.lang.Object spill220_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_20;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead220_0() ^ 62970707911990L);
    spill220_0 = __call220_1();
    life4_7 = __fieldRead220_2(receiver);
    life3_8 = spill220_0;
    spill220_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue220_24_0 = spill220_1;
        break forward_join_24;
    }
    if (!((__instanceOf220_3(spill220_1) != 0))) {
        break forward_join_23;
    }
    life5_20 = __call220_5(__cast220_4(life4_7));
    __fieldWrite220_6(receiver, life5_20);
    return life5_20;
    }
    forwardValue220_24_0 = life4_7;
    }
    return __cast220_7(forwardValue220_24_0);
}
public static void h220_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022000_0(p0);
}
private static native long __fieldRead220_0() throws Throwable;
private static native java.lang.String[] __call220_1() throws Throwable;
private static native java.lang.Object __fieldRead220_2(com.moon.aa a0) throws Throwable;
private static native int __instanceOf220_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast220_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __call220_5(java.lang.String a0) throws Throwable;
private static native void __fieldWrite220_6(com.moon.aa a0, com.google.protobuf.ByteString a1) throws Throwable;
private static native com.google.protobuf.ByteString __cast220_7(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1022000_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_17f3f63ada886f1b3536(com.moon.aa a0) throws E;
private static final class __SourceHandler_17f3f63ada886f1b3536 {

public static java.lang.String f221(com.moon.aa receiver) throws Throwable {
    java.lang.Object forwardValue221_18_0;
    java.lang.String[] spill221_0;
    java.lang.Object spill221_1;
    long life1_3;
    java.lang.Object life4_7;
    java.lang.String[] life3_8;
    com.google.protobuf.ByteString life5_24;
    java.lang.String life6_27;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead221_0() ^ 109219455975143L);
    spill221_0 = __call221_1();
    life4_7 = __fieldRead221_2(receiver);
    life3_8 = spill221_0;
    spill221_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue221_18_0 = spill221_1;
        break forward_join_18;
    }
    if (!((__instanceOf221_3(spill221_1) != 0))) {
        break forward_join_17;
    }
    return __cast221_4(life4_7);
    }
    forwardValue221_18_0 = life4_7;
    }
    life5_24 = __cast221_5(forwardValue221_18_0);
    life6_27 = __call221_6(life5_24);
    __fieldWrite221_7(receiver, life6_27);
    return life6_27;
}
public static void h221_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022100_0(p0);
}
public static void h221_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022101_0(p0);
}
private static native long __fieldRead221_0() throws Throwable;
private static native java.lang.String[] __call221_1() throws Throwable;
private static native java.lang.Object __fieldRead221_2(com.moon.aa a0) throws Throwable;
private static native int __instanceOf221_3(java.lang.Object a0) throws Throwable;
private static native java.lang.String __cast221_4(java.lang.Object a0) throws Throwable;
private static native com.google.protobuf.ByteString __cast221_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call221_6(com.google.protobuf.ByteString a0) throws Throwable;
private static native void __fieldWrite221_7(com.moon.aa a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1022100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022101_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.aC __sourceHandlerCall_0a998e382e3342580945(com.moon.aa a0) throws E;
private static final class __SourceHandler_0a998e382e3342580945 {

public static com.moon.aC f276(com.moon.aa receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead276_0() ^ 76250498544744L);
    return ((receiver == __fieldRead276_1()) ? new com.moon.aC() : __call276_2(new com.moon.aC(), receiver));
}
public static void h276_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1027600_0(p0);
}
private static native long __fieldRead276_0() throws Throwable;
private static native com.moon.aa __fieldRead276_1() throws Throwable;
private static native com.moon.aC __call276_2(com.moon.aC a0, com.moon.aa a1) throws Throwable;
private static native java.lang.Exception __call1027600_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9da4b7b744418fe48f6a(com.moon.aa a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_9da4b7b744418fe48f6a {

public static boolean f222(com.moon.aa receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue222_14_0;
    java.lang.Object forwardValue222_23_0;
    int forwardValue222_40_0;
    int forwardValue222_46_0;
    java.lang.Object spill222_0;
    boolean spill222_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.aa life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead222_0() ^ 125601223360507L);
    life4_5 = __call222_1();
    spill222_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue222_14_0 = spill222_0;
        break forward_join_14;
    }
    if (!((spill222_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory222_2(1);
    }
    forwardValue222_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue222_23_0 = forwardValue222_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf222_3(forwardValue222_14_0) == 0))) {
        break forward_join_22;
    }
    return __call222_4(receiver, p0);
    }
    forwardValue222_23_0 = p0;
    }
    life5_34 = __cast222_5(forwardValue222_23_0);
    spill222_1 = __call222_8(__call222_6(receiver), __call222_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue222_40_0 = __integerCategory222_9(spill222_1);
        break forward_join_40;
    }
    if (!((!spill222_1))) {
        break forward_join_35;
    }
    return __integerCategory222_10(0);
    }
    forwardValue222_40_0 = __integerCategory222_14(__call222_13(__call222_11(receiver), __call222_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue222_46_0 = forwardValue222_40_0;
        break forward_join_46;
    }
    if (!((forwardValue222_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory222_15(0);
    }
    forwardValue222_46_0 = 1;
    }
    return __integerCategory222_16(forwardValue222_46_0);
}
public static void h222_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022200_0(p0);
}
public static void h222_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022201_0(p0);
}
public static void h222_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022202_0(p0);
}
public static void h222_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022203_0(p0);
}
public static void h222_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022204_0(p0);
}
public static void h222_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022205_0(p0);
}
public static void h222_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022206_0(p0);
}
public static void h222_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022207_0(p0);
}
private static native long __fieldRead222_0() throws Throwable;
private static native java.lang.String[] __call222_1() throws Throwable;
private static native boolean __integerCategory222_2(int value) throws Throwable;
private static native int __instanceOf222_3(java.lang.Object a0) throws Throwable;
private static native boolean __call222_4(com.moon.aa a0, java.lang.Object a1) throws Throwable;
private static native com.moon.aa __cast222_5(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call222_6(com.moon.aa a0) throws Throwable;
private static native java.lang.String __call222_7(com.moon.aa a0) throws Throwable;
private static native boolean __call222_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory222_9(boolean value) throws Throwable;
private static native boolean __integerCategory222_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call222_11(com.moon.aa a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call222_12(com.moon.aa a0) throws Throwable;
private static native boolean __call222_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory222_14(boolean value) throws Throwable;
private static native boolean __integerCategory222_15(int value) throws Throwable;
private static native boolean __integerCategory222_16(int value) throws Throwable;
private static native java.lang.Exception __call1022200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022205_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022206_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022207_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_690d7a521f0394dec7de(com.moon.aa a0) throws E;
private static final class __SourceHandler_690d7a521f0394dec7de {

public static int f223(com.moon.aa receiver) throws Throwable {
    int forwardValue223_21_0;
    int forwardValue223_41_0;
    java.lang.String[] spill223_0;
    int spill223_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life4_44;
    forward_join_41: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (__fieldRead223_0() ^ 43664162168461L);
    spill223_0 = __call223_1();
    life4_7 = __fieldRead223_2(receiver);
    life3_8 = spill223_0;
    spill223_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue223_21_0 = spill223_1;
        break forward_join_21;
    }
    if (!((spill223_1 != -1))) {
        break forward_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    forwardValue223_21_0 = __integerCategory223_5(__call223_4(__fieldRead223_3(receiver)));
    }
    if (!((life3_8 == null))) {
        forwardValue223_41_0 = forwardValue223_21_0;
        break forward_join_41;
    }
    if (!((forwardValue223_21_0 == 0))) {
        break forward_join_31;
    }
    life4_7 = (life4_7 + __call223_7(1, __fieldRead223_6(receiver)));
    }
    life4_44 = (life4_7 + __call223_9(__call223_8(receiver)));
    __fieldWrite223_10(receiver, life4_44);
    forwardValue223_41_0 = life4_44;
    }
    return forwardValue223_41_0;
}
public static void h223_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022300_0(p0);
}
public static void h223_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022301_0(p0);
}
public static void h223_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022302_0(p0);
}
private static native long __fieldRead223_0() throws Throwable;
private static native java.lang.String[] __call223_1() throws Throwable;
private static native int __fieldRead223_2(com.moon.aa a0) throws Throwable;
private static native java.lang.Object __fieldRead223_3(com.moon.aa a0) throws Throwable;
private static native boolean __call223_4(java.lang.Object a0) throws Throwable;
private static native int __integerCategory223_5(boolean value) throws Throwable;
private static native java.lang.Object __fieldRead223_6(com.moon.aa a0) throws Throwable;
private static native int __call223_7(int a0, java.lang.Object a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call223_8(com.moon.aa a0) throws Throwable;
private static native int __call223_9(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite223_10(com.moon.aa a0, int a1) throws Throwable;
private static native java.lang.Exception __call1022300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022302_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_36e9e12fc4864420e53a(com.moon.aa a0) throws E;
private static final class __SourceHandler_36e9e12fc4864420e53a {

public static int f224(com.moon.aa receiver) throws Throwable {
    int forwardValue224_19_0;
    int spill224_0;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_45;
    int life4_57;
    int life4_69;
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead224_0() ^ 59048863307270L);
    life3_5 = __call224_1();
    spill224_0 = __fieldRead224_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue224_19_0 = spill224_0;
        break forward_join_19;
    }
    if (!((spill224_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead224_3(receiver);
    }
    forwardValue224_19_0 = __invokedynamic224_4(9193, (7897660041781388837L ^ life1_3));
    }
    life4_24 = forwardValue224_19_0;
    life4_35 = ((__invokedynamic224_5(15319, (7128202642247269914L ^ life1_3)) * life4_24) + __call224_7(__call224_6()));
    life4_45 = ((__invokedynamic224_8(9674, (650812588959932417L ^ life1_3)) * life4_35) + 1);
    life4_57 = ((__invokedynamic224_9(26521, (4878581728968139351L ^ life1_3)) * life4_45) + __call224_11(__call224_10(receiver)));
    life4_69 = ((__invokedynamic224_12(22603, (6447094268555943300L ^ life1_3)) * life4_57) + __call224_14(__call224_13(receiver)));
    __fieldWrite224_15(receiver, life4_69);
    return life4_69;
}
public static void h224_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022400_0(p0);
}
public static void h224_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022401_0(p0);
}
private static native long __fieldRead224_0() throws Throwable;
private static native java.lang.String[] __call224_1() throws Throwable;
private static native int __fieldRead224_2(com.moon.aa a0) throws Throwable;
private static native int __fieldRead224_3(com.moon.aa a0) throws Throwable;
private static native int __invokedynamic224_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic224_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call224_6() throws Throwable;
private static native int __call224_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __invokedynamic224_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic224_9(int a0, long a1) throws Throwable;
private static native java.lang.String __call224_10(com.moon.aa a0) throws Throwable;
private static native int __call224_11(java.lang.String a0) throws Throwable;
private static native int __invokedynamic224_12(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call224_13(com.moon.aa a0) throws Throwable;
private static native int __call224_14(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite224_15(com.moon.aa a0, int a1) throws Throwable;
private static native java.lang.Exception __call1022400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_61eaed8948b87bb35a02(com.moon.aa a0) throws E;
private static final class __SourceHandler_61eaed8948b87bb35a02 {

public static boolean f225(com.moon.aa receiver) throws Throwable {
    int forwardValue225_17_0;
    int forwardValue225_26_0;
    java.lang.String[] spill225_0;
    int spill225_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead225_0() ^ 112552894490793L);
    spill225_0 = __call225_1();
    life4_7 = __fieldRead225_2(receiver);
    life3_8 = spill225_0;
    spill225_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue225_17_0 = spill225_1;
        break forward_join_17;
    }
    if (!((spill225_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory225_3(1);
    }
    forwardValue225_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue225_26_0 = forwardValue225_17_0;
        break forward_join_26;
    }
    if (!((forwardValue225_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory225_4(0);
    }
    __fieldWrite225_5(receiver, 1);
    forwardValue225_26_0 = 1;
    }
    return __integerCategory225_6(forwardValue225_26_0);
}
public static void h225_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022500_0(p0);
}
public static void h225_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022501_0(p0);
}
public static void h225_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022502_0(p0);
}
public static void h225_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1022503_0(p0);
}
private static native long __fieldRead225_0() throws Throwable;
private static native java.lang.String[] __call225_1() throws Throwable;
private static native byte __fieldRead225_2(com.moon.aa a0) throws Throwable;
private static native boolean __integerCategory225_3(int value) throws Throwable;
private static native boolean __integerCategory225_4(int value) throws Throwable;
private static native void __fieldWrite225_5(com.moon.aa a0, int a1) throws Throwable;
private static native boolean __integerCategory225_6(int value) throws Throwable;
private static native java.lang.Exception __call1022500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1022503_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_28da13ac2c436f290960(com.moon.aa a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_28da13ac2c436f290960 {

public static void f226(com.moon.aa receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    com.moon.aa forwardValue226_18_0;
    com.moon.aa spill226_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead226_0() ^ 122682617744492L);
    life4_5 = __call226_1();
    spill226_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue226_18_0 = spill226_0;
        break forward_join_18;
    }
    if (!((!__call226_3(__fieldRead226_2(spill226_0))))) {
        break forward_join_17;
    }
    __call226_5(p0, 1, __fieldRead226_4(receiver));
    }
    forwardValue226_18_0 = receiver;
    }
    __call226_7(__call226_6(forwardValue226_18_0), p0);
    return;
}
public static void h226_0(java.io.IOException p0) throws Throwable {
    throw __call1022600_0(p0);
}
public static void h226_1(java.io.IOException p0) throws Throwable {
    throw __call1022601_0(p0);
}
private static native long __fieldRead226_0() throws Throwable;
private static native java.lang.String[] __call226_1() throws Throwable;
private static native java.lang.Object __fieldRead226_2(com.moon.aa a0) throws Throwable;
private static native boolean __call226_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __fieldRead226_4(com.moon.aa a0) throws Throwable;
private static native void __call226_5(com.google.protobuf.CodedOutputStream a0, int a1, java.lang.Object a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call226_6(com.moon.aa a0) throws Throwable;
private static native void __call226_7(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1022600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1022601_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_9da4b7b744418fe48f6a(this, p0); }


public int hashCode() { return __sourceHandlerCall_36e9e12fc4864420e53a(this); }


public com.moon.aa b__aa() {
return com.moon.aa.c;
}


public static com.moon.aC b() {
return ((com.moon.aa)(com.moon.aa.c)).c();
}


public static com.moon.aa b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.aa)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.aa.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aa b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.aa)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.aa.d)), ((java.io.InputStream)(p0)))));
}


public com.moon.aC c() { return __sourceHandlerCall_0a998e382e3342580945(this); }


public static com.moon.aa a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.aa)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.aa.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aC a(com.moon.aa p0) {
return ((com.moon.aC)(((com.moon.aa)(com.moon.aa.c)).c())).a(((com.moon.aa)(p0)));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21709;
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
            throw new RuntimeException("com/moon/aa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static com.moon.aa a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.aa)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.aa.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public com.moon.aC a__aC() {
return com.moon.aa.b();
}


public static com.google.protobuf.Parser<com.moon.aa> a__Parser() {
return com.moon.aa.d;
}


static void a__Void(com.google.protobuf.ByteString p0) throws java.lang.IllegalArgumentException {
com.moon.aa.checkByteStringIsUtf8(((com.google.protobuf.ByteString)(p0)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.aa.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static com.moon.aa a__aa() {
return com.moon.aa.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral337_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/aa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected com.moon.aC a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.aC local2 = new com.moon.aC(p0);
    return local2;
}


public static com.moon.aa a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.aa)(((com.google.protobuf.Parser)(com.moon.aa.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.aa a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.aa)(((com.google.protobuf.Parser)(com.moon.aa.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aa a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.aa)(((com.google.protobuf.Parser)(com.moon.aa.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o3.i;
}


public java.lang.String a__String() { return __sourceHandlerCall_17f3f63ada886f1b3536(this); }


public com.google.protobuf.ByteString a() { return __sourceHandlerCall_c31f6d01e33a71b3c5c8(this); }


public static com.moon.aa a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.aa)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.aa.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aa a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.aa)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.aa.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.aa a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.aa)(((com.google.protobuf.Parser)(com.moon.aa.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.aa a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.aa)(((com.google.protobuf.Parser)(com.moon.aa.d)).parseFrom(((byte[])(p0)))));
}


public static com.moon.aa a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.aa)(((com.google.protobuf.Parser)(com.moon.aa.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.aa();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_28da13ac2c436f290960(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_61eaed8948b87bb35a02(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o3.j)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.aa.class)), ((java.lang.Class)(com.moon.aC.class)));
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.aa)(this)).c();
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.aa)(this)).c();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.aa)(this)).b__aa();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.aa)(this)).b__aa();
}


public com.google.protobuf.Parser<com.moon.aa> getParserForType() {
return com.moon.aa.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_690d7a521f0394dec7de(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.aa)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.aa)(this)).a__aC();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.aa)(this)).a__aC();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral337_0() throws E;
}
