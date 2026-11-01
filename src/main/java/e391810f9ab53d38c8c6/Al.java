package moom;

import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Al implements moom.yK<moom.y2> {

private int a;

private byte b;

private moom.DY[] c;

private int d;

private int e;

private int f;

private int g;

private byte[] h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public Al() {
super();
}


public Al(int p0, byte p1, java.util.Collection<moom.DY> p2, byte[] p3, int p4, int p5, int p6, int p7) { super(); __sourceHandlerCall_6b5e7053456c84be18bb(this, p0, p1, p2, p3, p4, p5, p6, p7); }


static {
i = ((long)(((moom._a)(moom._c.a(((long)(2853488383160575769L)), ((long)(-8714447688181938555L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(33242387422487L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Al.i ^ 126792121579590L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill646_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill646_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill646_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill646_14 = new byte[8];
    (__sourceSpill646_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill646_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation646_16 = __sourceSpill646_14;
    ((javax.crypto.Cipher)(__sourceSpill646_11)).init(((int)(__sourceSpill646_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill646_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation646_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\025Û1Í{qàxÑçe²G"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill646_25 = local6_life21;
        int __sourceSpill646_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill646_25)).substring(((int)(__sourceSpill646_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill646_30 = local8_life19;
        int __sourceSpill646_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill646_33 = new byte[8];
        (__sourceSpill646_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill646_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill646_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill646_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill646_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill646_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill646_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill646_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill646_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill646_34)).doFinal(((byte[])(__sourceSpill646_33)));
        (__sourceSpill646_30)[__sourceSpill646_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "»¤Bÿ\022Wx«:%ã\020\b"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill646_38 = local6_life21;
        int __sourceSpill646_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill646_38)).substring(((int)(__sourceSpill646_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill646_43 = local8_life19;
        int __sourceSpill646_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill646_46 = new byte[8];
        (__sourceSpill646_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill646_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill646_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill646_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill646_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill646_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill646_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill646_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill646_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill646_47)).doFinal(((byte[])(__sourceSpill646_46)));
        (__sourceSpill646_43)[__sourceSpill646_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_6b5e7053456c84be18bb(moom.Al a0, int a1, byte a2, java.util.Collection a3, byte[] a4, int a5, int a6, int a7, int a8) throws E;
private static final class __SourceHandler_6b5e7053456c84be18bb {

public static void f377(moom.Al receiver, int p0, byte p1, java.util.Collection p2, byte[] p3, int p4, int p5, int p6, int p7) throws Throwable {
    int[] spill377_0;
    long life9_3;
    int[] life11_20;
    int life12_40;
    int life13_45;
    forest_join_80: {
    life9_3 = (__fieldRead377_0() ^ 18325221242789L);
    spill377_0 = __call377_1();
    __directSuperInit377_2(receiver);
    __fieldWrite377_3(receiver, p0);
    __fieldWrite377_4(receiver, p1);
    __fieldWrite377_7(receiver, __cast377_6(__call377_5(p2, new moom.DY[0])));
    life11_20 = spill377_0;
    __fieldWrite377_8(receiver, p4);
    __fieldWrite377_9(receiver, p5);
    __fieldWrite377_10(receiver, p6);
    __fieldWrite377_11(receiver, p7);
    __fieldWrite377_12(receiver, new byte[(p6 * p7)]);
    life12_40 = 0;
    forest_cycle_41: while (true) {
    forest_join_78: {
    forest_join_77: {
    if (!((life12_40 < p6))) {
        break forest_join_80;
    }
    life13_45 = 0;
    forest_cycle_46: while (true) {
    if (!((life13_45 < p7))) {
        break forest_join_77;
    }
    (__fieldRead377_13(receiver))[(life12_40 + (life13_45 * p6))] = (p3)[((p4 + life12_40) + ((p5 + life13_45) * __invokedynamic377_14(3, (7601535142507518441L ^ life9_3))))];
    life13_45 += 1;
    if (!((life11_20 == null))) {
        break forest_join_78;
    }
    if (!((life11_20 != null))) {
        continue forest_cycle_46;
    }
    break forest_cycle_46;
    }
    }
    life12_40 += 1;
    }
    if (!((life11_20 != null))) {
        continue forest_cycle_41;
    }
    break forest_cycle_41;
    }
    }
    return;
}
public static void h377_0(moom.Oo p0) throws Throwable {
    throw __call3037700_0(p0);
}
private static native long __fieldRead377_0() throws Throwable;
private static native int[] __call377_1() throws Throwable;
private static native void __directSuperInit377_2(moom.Al a0) throws Throwable;
private static native void __fieldWrite377_3(moom.Al a0, int a1) throws Throwable;
private static native void __fieldWrite377_4(moom.Al a0, byte a1) throws Throwable;
private static native java.lang.Object[] __call377_5(java.util.Collection a0, moom.DY[] a1) throws Throwable;
private static native moom.DY[] __cast377_6(java.lang.Object[] a0) throws Throwable;
private static native void __fieldWrite377_7(moom.Al a0, moom.DY[] a1) throws Throwable;
private static native void __fieldWrite377_8(moom.Al a0, int a1) throws Throwable;
private static native void __fieldWrite377_9(moom.Al a0, int a1) throws Throwable;
private static native void __fieldWrite377_10(moom.Al a0, int a1) throws Throwable;
private static native void __fieldWrite377_11(moom.Al a0, int a1) throws Throwable;
private static native void __fieldWrite377_12(moom.Al a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead377_13(moom.Al a0) throws Throwable;
private static native int __invokedynamic377_14(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3037700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3a227c32fc11a580d4cf(moom.Al a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_3a227c32fc11a580d4cf {

public static void f578(moom.Al receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    moom.Al lexicalValue578_86_0;
    int[] spill578_0;
    moom.Al spill578_1;
    long life2_3;
    int life5_19;
    int[] life4_20;
    int life6_29;
    lexical_join_89: {
    lexical_join_86: {
    lexical_join_68: {
    lexical_join_64: {
    life2_3 = (__fieldRead578_0() ^ 79806347925772L);
    __fieldWrite578_2(receiver, __call578_1(p0));
    spill578_0 = __call578_3();
    __fieldWrite578_5(receiver, __call578_4(p0));
    __fieldWrite578_7(receiver, new moom.DY[__call578_6(p0)]);
    life5_19 = 0;
    life4_20 = spill578_0;
    lexical_cycle_21: while (true) {
    if (!((life5_19 < (__fieldRead578_8(receiver)).length))) {
        break lexical_join_64;
    }
    life6_29 = ((short) __call578_9(p0));
    (__fieldRead578_10(receiver))[life5_19] = new moom.DY(((byte) ((life6_29 >> 4) & __invokedynamic578_11(4475, (8093320526128752187L ^ life2_3)))), __call578_12(p0), __call578_13(p0), ((byte) (life6_29 & __invokedynamic578_14(4475, (8093320526128752187L ^ life2_3)))));
    life5_19 += 1;
    if (!((life4_20 == null))) {
        break lexical_join_68;
    }
    if (!((life4_20 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    __fieldWrite578_16(receiver, __call578_15(p0));
    }
    spill578_1 = receiver;
    if (!((life4_20 == null))) {
        lexicalValue578_86_0 = spill578_1;
        break lexical_join_86;
    }
    if (!((__fieldRead578_17(spill578_1) > 0))) {
        break lexical_join_89;
    }
    __fieldWrite578_19(receiver, __call578_18(p0));
    __fieldWrite578_21(receiver, __call578_20(p0));
    __fieldWrite578_23(receiver, __call578_22(p0));
    lexicalValue578_86_0 = receiver;
    }
    __fieldWrite578_25(lexicalValue578_86_0, __call578_24(p0));
    }
    return;
}
public static void h578_0(java.io.IOException p0) throws Throwable {
    throw __call1057800_0(p0);
}
public static void h578_1(java.io.IOException p0) throws Throwable {
    throw __call1057801_0(p0);
}
public static void h578_2(java.io.IOException p0) throws Throwable {
    throw __call1057802_0(p0);
}
private static native long __fieldRead578_0() throws Throwable;
private static native int __call578_1(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_2(moom.Al a0, int a1) throws Throwable;
private static native int[] __call578_3() throws Throwable;
private static native byte __call578_4(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_5(moom.Al a0, byte a1) throws Throwable;
private static native int __call578_6(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_7(moom.Al a0, moom.DY[] a1) throws Throwable;
private static native moom.DY[] __fieldRead578_8(moom.Al a0) throws Throwable;
private static native byte __call578_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native moom.DY[] __fieldRead578_10(moom.Al a0) throws Throwable;
private static native int __invokedynamic578_11(int a0, long a1) throws Throwable;
private static native byte __call578_12(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native byte __call578_13(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __invokedynamic578_14(int a0, long a1) throws Throwable;
private static native short __call578_15(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_16(moom.Al a0, short a1) throws Throwable;
private static native int __fieldRead578_17(moom.Al a0) throws Throwable;
private static native short __call578_18(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_19(moom.Al a0, short a1) throws Throwable;
private static native short __call578_20(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_21(moom.Al a0, short a1) throws Throwable;
private static native short __call578_22(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_23(moom.Al a0, short a1) throws Throwable;
private static native byte[] __call578_24(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite578_25(moom.Al a0, byte[] a1) throws Throwable;
private static native java.lang.Exception __call1057800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057802_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8205370bb86a9dec798a(moom.Al a0, net.minecraft.world.storage.MapData a1) throws E;
private static final class __SourceHandler_8205370bb86a9dec798a {

public static void f579(moom.Al receiver, net.minecraft.world.storage.MapData p0) throws Throwable {
    int[] spill579_0;
    long life2_3;
    int life5_13;
    int[] life4_14;
    moom.DY life6_24;
    int life6_47;
    lexical_join_84: {
    lexical_join_39: {
    lexical_join_37: {
    life2_3 = (__fieldRead579_0() ^ 105627191943997L);
    spill579_0 = __call579_1();
    __fieldWrite579_3(p0, __fieldRead579_2(receiver));
    __call579_5(__fieldRead579_4(p0));
    life5_13 = 0;
    life4_14 = spill579_0;
    lexical_cycle_15: while (true) {
    if (!((life5_13 < (__fieldRead579_6(receiver)).length))) {
        break lexical_join_37;
    }
    life6_24 = (__fieldRead579_7(receiver))[life5_13];
    __call579_10(__fieldRead579_8(p0), __invokedynamic579_9(life5_13), life6_24);
    life5_13 += 1;
    if (!((life4_14 == null))) {
        break lexical_join_39;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    life5_13 = 0;
    }
    lexical_cycle_39: while (true) {
    lexical_join_82: {
    lexical_join_81: {
    if (!((life5_13 < __fieldRead579_11(receiver)))) {
        break lexical_join_84;
    }
    life6_47 = 0;
    lexical_cycle_45: while (true) {
    if (!((life6_47 < __fieldRead579_12(receiver)))) {
        break lexical_join_81;
    }
    (__fieldRead579_13(p0))[((__fieldRead579_14(receiver) + life5_13) + ((__fieldRead579_15(receiver) + life6_47) * __invokedynamic579_16(18571, (4237286928943220216L ^ life2_3))))] = (__fieldRead579_17(receiver))[(life5_13 + (life6_47 * __fieldRead579_18(receiver)))];
    life6_47 += 1;
    if (!((life4_14 == null))) {
        break lexical_join_82;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    life5_13 += 1;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    return;
}
public static void h579_0(moom.Oo p0) throws Throwable {
    throw __call1057900_0(p0);
}
public static void h579_1(moom.Oo p0) throws Throwable {
    throw __call1057901_0(p0);
}
private static native long __fieldRead579_0() throws Throwable;
private static native int[] __call579_1() throws Throwable;
private static native byte __fieldRead579_2(moom.Al a0) throws Throwable;
private static native void __fieldWrite579_3(net.minecraft.world.storage.MapData a0, byte a1) throws Throwable;
private static native java.util.Map __fieldRead579_4(net.minecraft.world.storage.MapData a0) throws Throwable;
private static native void __call579_5(java.util.Map a0) throws Throwable;
private static native moom.DY[] __fieldRead579_6(moom.Al a0) throws Throwable;
private static native moom.DY[] __fieldRead579_7(moom.Al a0) throws Throwable;
private static native java.util.Map __fieldRead579_8(net.minecraft.world.storage.MapData a0) throws Throwable;
private static native java.lang.String __invokedynamic579_9(int a0) throws Throwable;
private static native java.lang.Object __call579_10(java.util.Map a0, java.lang.String a1, moom.DY a2) throws Throwable;
private static native int __fieldRead579_11(moom.Al a0) throws Throwable;
private static native int __fieldRead579_12(moom.Al a0) throws Throwable;
private static native byte[] __fieldRead579_13(net.minecraft.world.storage.MapData a0) throws Throwable;
private static native int __fieldRead579_14(moom.Al a0) throws Throwable;
private static native int __fieldRead579_15(moom.Al a0) throws Throwable;
private static native int __invokedynamic579_16(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead579_17(moom.Al a0) throws Throwable;
private static native int __fieldRead579_18(moom.Al a0) throws Throwable;
private static native java.lang.Exception __call1057900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1057901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e79eec1631b2772e9c33(moom.Al a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_e79eec1631b2772e9c33 {

public static void f580(moom.Al receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int[] spill580_0;
    long life2_3;
    moom.DY[] life5_21;
    int life6_24;
    int life7_26;
    int[] life4_27;
    moom.DY life8_34;
    lexical_join_101: {
    lexical_join_97: {
    lexical_join_77: {
    lexical_join_72: {
    life2_3 = (__fieldRead580_0() ^ 68447540447877L);
    __call580_2(p0, __fieldRead580_1(receiver));
    spill580_0 = __call580_3();
    __call580_5(p0, __fieldRead580_4(receiver));
    __call580_7(p0, (__fieldRead580_6(receiver)).length);
    life5_21 = __fieldRead580_8(receiver);
    life6_24 = (life5_21).length;
    life7_26 = 0;
    life4_27 = spill580_0;
    lexical_cycle_28: while (true) {
    if (!((life7_26 < life6_24))) {
        break lexical_join_72;
    }
    life8_34 = (life5_21)[life7_26];
    __call580_13(p0, (((__call580_9(life8_34) & __invokedynamic580_10(16853, (3059439246956111133L ^ life2_3))) << 4) | (__call580_11(life8_34) & __invokedynamic580_12(4475, (8093310438086374834L ^ life2_3)))));
    __call580_15(p0, __call580_14(life8_34));
    __call580_17(p0, __call580_16(life8_34));
    life7_26 += 1;
    if (!((life4_27 == null))) {
        break lexical_join_77;
    }
    if (!((life4_27 != null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    __call580_19(p0, __fieldRead580_18(receiver));
    }
    if (!((life4_27 == null))) {
        break lexical_join_97;
    }
    if (!((__fieldRead580_20(receiver) > 0))) {
        break lexical_join_101;
    }
    __call580_22(p0, __fieldRead580_21(receiver));
    __call580_24(p0, __fieldRead580_23(receiver));
    __call580_26(p0, __fieldRead580_25(receiver));
    }
    __call580_28(p0, __fieldRead580_27(receiver));
    }
    return;
}
public static void h580_0(java.io.IOException p0) throws Throwable {
    throw __call1058000_0(p0);
}
public static void h580_1(java.io.IOException p0) throws Throwable {
    throw __call1058001_0(p0);
}
public static void h580_2(java.io.IOException p0) throws Throwable {
    throw __call1058002_0(p0);
}
private static native long __fieldRead580_0() throws Throwable;
private static native int __fieldRead580_1(moom.Al a0) throws Throwable;
private static native void __call580_2(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int[] __call580_3() throws Throwable;
private static native byte __fieldRead580_4(moom.Al a0) throws Throwable;
private static native ByteBuf __call580_5(net.minecraft.network.PacketBuffer a0, byte a1) throws Throwable;
private static native moom.DY[] __fieldRead580_6(moom.Al a0) throws Throwable;
private static native void __call580_7(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native moom.DY[] __fieldRead580_8(moom.Al a0) throws Throwable;
private static native byte __call580_9(moom.DY a0) throws Throwable;
private static native int __invokedynamic580_10(int a0, long a1) throws Throwable;
private static native byte __call580_11(moom.DY a0) throws Throwable;
private static native int __invokedynamic580_12(int a0, long a1) throws Throwable;
private static native ByteBuf __call580_13(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native byte __call580_14(moom.DY a0) throws Throwable;
private static native ByteBuf __call580_15(net.minecraft.network.PacketBuffer a0, byte a1) throws Throwable;
private static native byte __call580_16(moom.DY a0) throws Throwable;
private static native ByteBuf __call580_17(net.minecraft.network.PacketBuffer a0, byte a1) throws Throwable;
private static native int __fieldRead580_18(moom.Al a0) throws Throwable;
private static native ByteBuf __call580_19(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead580_20(moom.Al a0) throws Throwable;
private static native int __fieldRead580_21(moom.Al a0) throws Throwable;
private static native ByteBuf __call580_22(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead580_23(moom.Al a0) throws Throwable;
private static native ByteBuf __call580_24(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead580_25(moom.Al a0) throws Throwable;
private static native ByteBuf __call580_26(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native byte[] __fieldRead580_27(moom.Al a0) throws Throwable;
private static native void __call580_28(net.minecraft.network.PacketBuffer a0, byte[] a1) throws Throwable;
private static native java.lang.Exception __call1058000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1058002_0(java.io.IOException a0) throws Throwable;

}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_e79eec1631b2772e9c33(this, p0); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Al.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2345;
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
            throw new RuntimeException("moom/Al", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3716_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Al"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_3a227c32fc11a580d4cf(this, p0); }


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Al)(this)));
    return;
}


public int a() {
return this.a;
}


public void a(net.minecraft.world.storage.MapData p0) { __sourceHandlerCall_8205370bb86a9dec798a(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3716_0() throws E;
}
