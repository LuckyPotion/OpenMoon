package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class I extends com.google.protobuf.GeneratedMessageV3 implements com.moon.oE {

private static long serialVersionUID = 0L;

private java.util.List<com.moon.ad> a;

private byte b;

private static com.moon.I c;

private static com.google.protobuf.Parser<com.moon.I> d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private I(com.google.protobuf.GeneratedMessageV3.Builder<?> p0) {
super(p0);
    this.b = -1;
}


private I() {
super();
    this.b = -1;
    this.a = java.util.Collections.emptyList();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(7887545777830101212L)), ((long)(-4124592866201244535L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(163265000047907L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.I.e ^ 715974898072L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill6_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill6_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill6_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill6_14 = new byte[8];
    (__sourceSpill6_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill6_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation6_16 = __sourceSpill6_14;
    ((javax.crypto.Cipher)(__sourceSpill6_11)).init(((int)(__sourceSpill6_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill6_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation6_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "´\026\025äGöL)Éõ\020\027\037\026±*X(5\035ë"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill6_25 = local6_life21;
        int __sourceSpill6_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill6_25)).substring(((int)(__sourceSpill6_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill6_30 = local8_life19;
        int __sourceSpill6_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill6_33 = new byte[8];
        (__sourceSpill6_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill6_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill6_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill6_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill6_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill6_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill6_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill6_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill6_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill6_34)).doFinal(((byte[])(__sourceSpill6_33)));
        (__sourceSpill6_30)[__sourceSpill6_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Á¼¾ê\026äCtewép\017ì"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill6_38 = local6_life21;
        int __sourceSpill6_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill6_38)).substring(((int)(__sourceSpill6_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill6_43 = local8_life19;
        int __sourceSpill6_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill6_46 = new byte[8];
        (__sourceSpill6_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill6_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill6_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill6_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill6_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill6_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill6_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill6_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill6_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill6_47)).doFinal(((byte[])(__sourceSpill6_46)));
        (__sourceSpill6_43)[__sourceSpill6_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
    c = ((com.moon.I)(new com.moon.I()));
    d = ((com.google.protobuf.Parser)(new com.moon.g()));
}

private static native <E extends Throwable> com.moon.ak __sourceHandlerCall_62d4c1bcf45ce1dcf547(com.moon.I a0) throws E;
private static final class __SourceHandler_62d4c1bcf45ce1dcf547 {

public static com.moon.ak f60(com.moon.I receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead60_0() ^ 16855519545208L);
    return ((receiver == __fieldRead60_1()) ? new com.moon.ak() : __call60_2(new com.moon.ak(), receiver));
}
public static void h60_0(moom.Oo p0) throws Throwable {
    throw __call1006000_0(p0);
}
private static native long __fieldRead60_0() throws Throwable;
private static native com.moon.I __fieldRead60_1() throws Throwable;
private static native com.moon.ak __call60_2(com.moon.ak a0, com.moon.I a1) throws Throwable;
private static native java.lang.Exception __call1006000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_28fd2ffc173edff7613a(com.moon.I a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_28fd2ffc173edff7613a {

public static boolean f52(com.moon.I receiver, java.lang.Object p0) throws Throwable {
    java.lang.Object forwardValue52_14_0;
    java.lang.Object forwardValue52_23_0;
    int forwardValue52_40_0;
    int forwardValue52_46_0;
    java.lang.Object spill52_0;
    boolean spill52_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.I life5_34;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_35: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead52_0() ^ 104646574941148L);
    life4_5 = __call52_1();
    spill52_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue52_14_0 = spill52_0;
        break forward_join_14;
    }
    if (!((spill52_0 == receiver))) {
        break forward_join_13;
    }
    return __integerCategory52_2(1);
    }
    forwardValue52_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue52_23_0 = forwardValue52_14_0;
        break forward_join_23;
    }
    if (!((__instanceOf52_3(forwardValue52_14_0) == 0))) {
        break forward_join_22;
    }
    return __call52_4(receiver, p0);
    }
    forwardValue52_23_0 = p0;
    }
    life5_34 = __cast52_5(forwardValue52_23_0);
    spill52_1 = __call52_8(__call52_6(receiver), __call52_7(life5_34));
    if (!((life4_5 == null))) {
        forwardValue52_40_0 = __integerCategory52_9(spill52_1);
        break forward_join_40;
    }
    if (!((!spill52_1))) {
        break forward_join_35;
    }
    return __integerCategory52_10(0);
    }
    forwardValue52_40_0 = __integerCategory52_14(__call52_13(__call52_11(receiver), __call52_12(life5_34)));
    }
    if (!((life4_5 == null))) {
        forwardValue52_46_0 = forwardValue52_40_0;
        break forward_join_46;
    }
    if (!((forwardValue52_40_0 == 0))) {
        break forward_join_45;
    }
    return __integerCategory52_15(0);
    }
    forwardValue52_46_0 = 1;
    }
    return __integerCategory52_16(forwardValue52_46_0);
}
public static void h52_0(moom.Oo p0) throws Throwable {
    throw __call1005200_0(p0);
}
public static void h52_1(moom.Oo p0) throws Throwable {
    throw __call1005201_0(p0);
}
public static void h52_2(moom.Oo p0) throws Throwable {
    throw __call1005202_0(p0);
}
public static void h52_3(moom.Oo p0) throws Throwable {
    throw __call1005203_0(p0);
}
public static void h52_4(moom.Oo p0) throws Throwable {
    throw __call1005204_0(p0);
}
public static void h52_5(moom.Oo p0) throws Throwable {
    throw __call1005205_0(p0);
}
public static void h52_6(moom.Oo p0) throws Throwable {
    throw __call1005206_0(p0);
}
public static void h52_7(moom.Oo p0) throws Throwable {
    throw __call1005207_0(p0);
}
private static native long __fieldRead52_0() throws Throwable;
private static native java.lang.String[] __call52_1() throws Throwable;
private static native boolean __integerCategory52_2(int value) throws Throwable;
private static native int __instanceOf52_3(java.lang.Object a0) throws Throwable;
private static native boolean __call52_4(com.moon.I a0, java.lang.Object a1) throws Throwable;
private static native com.moon.I __cast52_5(java.lang.Object a0) throws Throwable;
private static native java.util.List __call52_6(com.moon.I a0) throws Throwable;
private static native java.util.List __call52_7(com.moon.I a0) throws Throwable;
private static native boolean __call52_8(java.util.List a0, java.util.List a1) throws Throwable;
private static native int __integerCategory52_9(boolean value) throws Throwable;
private static native boolean __integerCategory52_10(int value) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call52_11(com.moon.I a0) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call52_12(com.moon.I a0) throws Throwable;
private static native boolean __call52_13(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.UnknownFieldSet a1) throws Throwable;
private static native int __integerCategory52_14(boolean value) throws Throwable;
private static native boolean __integerCategory52_15(int value) throws Throwable;
private static native boolean __integerCategory52_16(int value) throws Throwable;
private static native java.lang.Exception __call1005200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005207_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_735613d8c19f2c590d33(com.moon.I a0) throws E;
private static final class __SourceHandler_735613d8c19f2c590d33 {

public static int f53(com.moon.I receiver) throws Throwable {
    int lexicalValue53_19_0;
    java.lang.String[] spill53_0;
    int spill53_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    int life5_24;
    lexical_join_49: {
    lexical_join_40: {
    lexical_join_19: {
    lexical_join_16: {
    life1_3 = (__fieldRead53_0() ^ 14536151316623L);
    spill53_0 = __call53_1();
    life4_7 = __fieldRead53_2(receiver);
    life3_8 = spill53_0;
    spill53_1 = life4_7;
    if (!((life3_8 == null))) {
        lexicalValue53_19_0 = spill53_1;
        break lexical_join_19;
    }
    if (!((spill53_1 != -1))) {
        break lexical_join_16;
    }
    return life4_7;
    }
    life4_7 = 0;
    lexicalValue53_19_0 = 0;
    }
    life5_24 = lexicalValue53_19_0;
    lexical_cycle_20: while (true) {
    if (!((life5_24 < __call53_4(__fieldRead53_3(receiver))))) {
        break lexical_join_40;
    }
    life4_7 = (life4_7 + __call53_8(1, __cast53_7(__call53_6(__fieldRead53_5(receiver), life5_24))));
    life5_24 += 1;
    if (!((life3_8 == null))) {
        break lexical_join_49;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    life4_7 = (life4_7 + __call53_10(__call53_9(receiver)));
    __fieldWrite53_11(receiver, life4_7);
    }
    return life4_7;
}
public static void h53_0(moom.Oo p0) throws Throwable {
    throw __call1005300_0(p0);
}
public static void h53_1(moom.Oo p0) throws Throwable {
    throw __call1005301_0(p0);
}
public static void h53_2(moom.Oo p0) throws Throwable {
    throw __call1005302_0(p0);
}
private static native long __fieldRead53_0() throws Throwable;
private static native java.lang.String[] __call53_1() throws Throwable;
private static native int __fieldRead53_2(com.moon.I a0) throws Throwable;
private static native java.util.List __fieldRead53_3(com.moon.I a0) throws Throwable;
private static native int __call53_4(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead53_5(com.moon.I a0) throws Throwable;
private static native java.lang.Object __call53_6(java.util.List a0, int a1) throws Throwable;
private static native com.google.protobuf.MessageLite __cast53_7(java.lang.Object a0) throws Throwable;
private static native int __call53_8(int a0, com.google.protobuf.MessageLite a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call53_9(com.moon.I a0) throws Throwable;
private static native int __call53_10(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite53_11(com.moon.I a0, int a1) throws Throwable;
private static native java.lang.Exception __call1005300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_3600c7a34cb20cad0dca(com.moon.I a0) throws E;
private static final class __SourceHandler_3600c7a34cb20cad0dca {

public static int f54(com.moon.I receiver) throws Throwable {
    int forwardValue54_19_0;
    int forwardValue54_74_0;
    int spill54_0;
    int spill54_1;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_24;
    int life4_35;
    int life4_53;
    int life4_77;
    forward_join_74: {
    forward_join_58: {
    forward_join_19: {
    forward_join_14: {
    life1_3 = (__fieldRead54_0() ^ 33754719118121L);
    life3_5 = __call54_1();
    spill54_0 = __fieldRead54_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue54_19_0 = spill54_0;
        break forward_join_19;
    }
    if (!((spill54_0 != 0))) {
        break forward_join_14;
    }
    return __fieldRead54_3(receiver);
    }
    forwardValue54_19_0 = __invokedynamic54_4(18092, (1589143336540856100L ^ life1_3));
    }
    life4_24 = forwardValue54_19_0;
    life4_35 = ((__invokedynamic54_5(31685, (1346022283511358031L ^ life1_3)) * life4_24) + __call54_7(__call54_6()));
    spill54_1 = __call54_8(receiver);
    if (!((life3_5 == null))) {
        forwardValue54_74_0 = spill54_1;
        break forward_join_74;
    }
    if (!((spill54_1 > 0))) {
        break forward_join_58;
    }
    life4_53 = ((__invokedynamic54_9(15788, (3128141562364666917L ^ life1_3)) * life4_35) + 1);
    life4_35 = ((__invokedynamic54_10(18987, (7258569179583665056L ^ life1_3)) * life4_53) + __call54_12(__call54_11(receiver)));
    }
    life4_77 = ((__invokedynamic54_13(18117, (822383161993420616L ^ life1_3)) * life4_35) + __call54_15(__call54_14(receiver)));
    __fieldWrite54_16(receiver, life4_77);
    forwardValue54_74_0 = life4_77;
    }
    return forwardValue54_74_0;
}
public static void h54_0(moom.Oo p0) throws Throwable {
    throw __call1005400_0(p0);
}
public static void h54_1(moom.Oo p0) throws Throwable {
    throw __call1005401_0(p0);
}
public static void h54_2(moom.Oo p0) throws Throwable {
    throw __call1005402_0(p0);
}
private static native long __fieldRead54_0() throws Throwable;
private static native java.lang.String[] __call54_1() throws Throwable;
private static native int __fieldRead54_2(com.moon.I a0) throws Throwable;
private static native int __fieldRead54_3(com.moon.I a0) throws Throwable;
private static native int __invokedynamic54_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic54_5(int a0, long a1) throws Throwable;
private static native com.google.protobuf.Descriptors.Descriptor __call54_6() throws Throwable;
private static native int __call54_7(com.google.protobuf.Descriptors.Descriptor a0) throws Throwable;
private static native int __call54_8(com.moon.I a0) throws Throwable;
private static native int __invokedynamic54_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic54_10(int a0, long a1) throws Throwable;
private static native java.util.List __call54_11(com.moon.I a0) throws Throwable;
private static native int __call54_12(java.util.List a0) throws Throwable;
private static native int __invokedynamic54_13(int a0, long a1) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call54_14(com.moon.I a0) throws Throwable;
private static native int __call54_15(com.google.protobuf.UnknownFieldSet a0) throws Throwable;
private static native void __fieldWrite54_16(com.moon.I a0, int a1) throws Throwable;
private static native java.lang.Exception __call1005400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_b4f63c12c84c5cee30ee(com.moon.I a0) throws E;
private static final class __SourceHandler_b4f63c12c84c5cee30ee {

public static boolean f55(com.moon.I receiver) throws Throwable {
    int forwardValue55_17_0;
    int forwardValue55_26_0;
    java.lang.String[] spill55_0;
    int spill55_1;
    long life1_3;
    int life4_7;
    java.lang.String[] life3_8;
    forward_join_26: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (__fieldRead55_0() ^ 35898951744372L);
    spill55_0 = __call55_1();
    life4_7 = __fieldRead55_2(receiver);
    life3_8 = spill55_0;
    spill55_1 = life4_7;
    if (!((life3_8 == null))) {
        forwardValue55_17_0 = spill55_1;
        break forward_join_17;
    }
    if (!((spill55_1 == 1))) {
        break forward_join_16;
    }
    return __integerCategory55_3(1);
    }
    forwardValue55_17_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        forwardValue55_26_0 = forwardValue55_17_0;
        break forward_join_26;
    }
    if (!((forwardValue55_17_0 == 0))) {
        break forward_join_22;
    }
    return __integerCategory55_4(0);
    }
    __fieldWrite55_5(receiver, 1);
    forwardValue55_26_0 = 1;
    }
    return __integerCategory55_6(forwardValue55_26_0);
}
public static void h55_0(moom.Oo p0) throws Throwable {
    throw __call1005500_0(p0);
}
public static void h55_1(moom.Oo p0) throws Throwable {
    throw __call1005501_0(p0);
}
public static void h55_2(moom.Oo p0) throws Throwable {
    throw __call1005502_0(p0);
}
public static void h55_3(moom.Oo p0) throws Throwable {
    throw __call1005503_0(p0);
}
private static native long __fieldRead55_0() throws Throwable;
private static native java.lang.String[] __call55_1() throws Throwable;
private static native byte __fieldRead55_2(com.moon.I a0) throws Throwable;
private static native boolean __integerCategory55_3(int value) throws Throwable;
private static native boolean __integerCategory55_4(int value) throws Throwable;
private static native void __fieldWrite55_5(com.moon.I a0, int a1) throws Throwable;
private static native boolean __integerCategory55_6(int value) throws Throwable;
private static native java.lang.Exception __call1005500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fa68e5094ce4e3b4a48e(com.moon.I a0, com.google.protobuf.CodedOutputStream a1) throws E;
private static final class __SourceHandler_fa68e5094ce4e3b4a48e {

public static void f56(com.moon.I receiver, com.google.protobuf.CodedOutputStream p0) throws Throwable {
    java.lang.String[] spill56_0;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    lexical_join_30: {
    lexical_join_26: {
    life2_3 = (__fieldRead56_0() ^ 109346904492263L);
    spill56_0 = __call56_1();
    life5_6 = 0;
    life4_7 = spill56_0;
    lexical_cycle_8: while (true) {
    if (!((life5_6 < __call56_3(__fieldRead56_2(receiver))))) {
        break lexical_join_26;
    }
    __call56_7(p0, 1, __cast56_6(__call56_5(__fieldRead56_4(receiver), life5_6)));
    life5_6 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_30;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    __call56_9(__call56_8(receiver), p0);
    }
    return;
}
public static void h56_0(java.io.IOException p0) throws Throwable {
    throw __call1005600_0(p0);
}
private static native long __fieldRead56_0() throws Throwable;
private static native java.lang.String[] __call56_1() throws Throwable;
private static native java.util.List __fieldRead56_2(com.moon.I a0) throws Throwable;
private static native int __call56_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead56_4(com.moon.I a0) throws Throwable;
private static native java.lang.Object __call56_5(java.util.List a0, int a1) throws Throwable;
private static native com.google.protobuf.MessageLite __cast56_6(java.lang.Object a0) throws Throwable;
private static native void __call56_7(com.google.protobuf.CodedOutputStream a0, int a1, com.google.protobuf.MessageLite a2) throws Throwable;
private static native com.google.protobuf.UnknownFieldSet __call56_8(com.moon.I a0) throws Throwable;
private static native void __call56_9(com.google.protobuf.UnknownFieldSet a0, com.google.protobuf.CodedOutputStream a1) throws Throwable;
private static native java.lang.Exception __call1005600_0(java.io.IOException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_28fd2ffc173edff7613a(this, p0); }


public int hashCode() { return __sourceHandlerCall_3600c7a34cb20cad0dca(this); }


public static com.moon.ak b__ak() {
return ((com.moon.I)(com.moon.I.c)).c();
}


public static com.moon.I b(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.I)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.I.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.I b(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.I)(com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(((com.google.protobuf.Parser)(com.moon.I.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.I b() {
return com.moon.I.c;
}


public java.util.List<? extends com.moon.o2> b__List() {
return this.a;
}


public com.moon.ak c() { return __sourceHandlerCall_62d4c1bcf45ce1dcf547(this); }


public static com.moon.ak a(com.moon.I p0) {
return ((com.moon.ak)(((com.moon.I)(com.moon.I.c)).c())).a(((com.moon.I)(p0)));
}


public static final com.google.protobuf.Descriptors.Descriptor a__DescriptorsInnerDescriptor() {
return com.moon.o1.e;
}


protected com.moon.ak a(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
com.moon.ak local2 = new com.moon.ak(p0);
    return local2;
}


public java.util.List<com.moon.ad> a__List() {
return this.a;
}


public static com.moon.I a(com.google.protobuf.CodedInputStream p0) throws java.io.IOException {
return ((com.moon.I)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.I.d)), ((com.google.protobuf.CodedInputStream)(p0)))));
}


public static com.moon.I a(com.google.protobuf.CodedInputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.I)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.I.d)), ((com.google.protobuf.CodedInputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public com.moon.ak a__ak() {
return com.moon.I.b__ak();
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21502;
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
            throw new RuntimeException("com/moon/I", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.I.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral71_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/I"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


static boolean a__Boolean() {
return ((((com.moon.I.alwaysUseFieldBuilders) ? 1 : 0)) != 0);
}


public static com.google.protobuf.Parser<com.moon.I> a__Parser() {
return com.moon.I.d;
}


public static com.moon.I a__I() {
return com.moon.I.c;
}


public static com.moon.I a(com.google.protobuf.ByteString p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.I)(((com.google.protobuf.Parser)(com.moon.I.d)).parseFrom(((com.google.protobuf.ByteString)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.I a(com.google.protobuf.ByteString p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.I)(((com.google.protobuf.Parser)(com.moon.I.d)).parseFrom(((com.google.protobuf.ByteString)(p0)))));
}


public static com.moon.I a(java.nio.ByteBuffer p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.I)(((com.google.protobuf.Parser)(com.moon.I.d)).parseFrom(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.I a(java.nio.ByteBuffer p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.I)(((com.google.protobuf.Parser)(com.moon.I.d)).parseFrom(((java.nio.ByteBuffer)(p0)))));
}


public int a() {
return ((java.util.List)(this.a)).size();
}


public com.moon.o2 a__o2(int p0) {
return ((com.moon.o2)(((java.util.List)(this.a)).get(((int)(p0)))));
}


public com.moon.ad a__ad(int p0) {
return ((com.moon.ad)(((java.util.List)(this.a)).get(((int)(p0)))));
}


public static com.moon.I a(java.io.InputStream p0, com.google.protobuf.ExtensionRegistryLite p1) throws java.io.IOException {
return ((com.moon.I)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.I.d)), ((java.io.InputStream)(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.I a(java.io.InputStream p0) throws java.io.IOException {
return ((com.moon.I)(com.google.protobuf.GeneratedMessageV3.parseWithIOException(((com.google.protobuf.Parser)(com.moon.I.d)), ((java.io.InputStream)(p0)))));
}


public static com.moon.I a(byte[] p0, com.google.protobuf.ExtensionRegistryLite p1) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.I)(((com.google.protobuf.Parser)(com.moon.I.d)).parseFrom(((byte[])(p0)), ((com.google.protobuf.ExtensionRegistryLite)(p1)))));
}


public static com.moon.I a(byte[] p0) throws com.google.protobuf.InvalidProtocolBufferException {
return ((com.moon.I)(((com.google.protobuf.Parser)(com.moon.I.d)).parseFrom(((byte[])(p0)))));
}


protected java.lang.Object newInstance(com.google.protobuf.GeneratedMessageV3.UnusedPrivateParameter p0) {
return new com.moon.I();
}


public void writeTo(com.google.protobuf.CodedOutputStream p0) throws java.io.IOException { __sourceHandlerCall_fa68e5094ce4e3b4a48e(this, p0); }


public final boolean isInitialized() { return __sourceHandlerCall_b4f63c12c84c5cee30ee(this); }


protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
return ((com.google.protobuf.GeneratedMessageV3.FieldAccessorTable)(com.moon.o1.f)).ensureFieldAccessorsInitialized(((java.lang.Class)(com.moon.I.class)), ((java.lang.Class)(com.moon.ak.class)));
}


public com.google.protobuf.Message.Builder toBuilder() {
return ((com.moon.I)(this)).c();
}


public com.google.protobuf.MessageLite.Builder toBuilder__MessageLiteInnerBuilder() {
return ((com.moon.I)(this)).c();
}


public com.google.protobuf.MessageLite getDefaultInstanceForType__MessageLite() {
return ((com.moon.I)(this)).b();
}


public com.google.protobuf.Message getDefaultInstanceForType() {
return ((com.moon.I)(this)).b();
}


public com.google.protobuf.Parser<com.moon.I> getParserForType() {
return com.moon.I.d;
}


public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
return this.unknownFields;
}


public int getSerializedSize() { return __sourceHandlerCall_735613d8c19f2c590d33(this); }


protected com.google.protobuf.Message.Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent p0) {
return ((com.moon.I)(this)).a(((com.google.protobuf.GeneratedMessageV3.BuilderParent)(p0)));
}


public com.google.protobuf.Message.Builder newBuilderForType() {
return ((com.moon.I)(this)).a__ak();
}


public com.google.protobuf.MessageLite.Builder newBuilderForType__MessageLiteInnerBuilder() {
return ((com.moon.I)(this)).a__ak();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral71_0() throws E;
}
