package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Eb {

private net.minecraft.world.World a;

private boolean b;

private int c;

private int d;

private int e;

private net.minecraft.village.Village f;

private int g;

private int h;

private int i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public Eb(net.minecraft.world.World p0) {
super();
    this.c = -1;
    this.a = p0;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(1735076699288333129L)), ((long)(961550017458850037L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(51498901644675L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Eb.j ^ 115458590923102L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill717_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill717_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill717_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill717_14 = new byte[8];
    (__sourceSpill717_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill717_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation717_16 = __sourceSpill717_14;
    ((javax.crypto.Cipher)(__sourceSpill717_11)).init(((int)(__sourceSpill717_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill717_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation717_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = " #>üRü\f´f\r\"-­fzÕß!ufe\021Õ±<½R\037õlÊcÿVSæ2û²ÎË½unì\024¶ýß\033­wùÛÙé®0\025?Ó"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill717_25 = local6_life21;
        int __sourceSpill717_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill717_25)).substring(((int)(__sourceSpill717_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill717_30 = local8_life19;
        int __sourceSpill717_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill717_33 = new byte[8];
        (__sourceSpill717_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill717_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill717_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill717_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill717_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill717_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill717_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill717_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill717_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill717_34)).doFinal(((byte[])(__sourceSpill717_33)));
        (__sourceSpill717_30)[__sourceSpill717_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "íYØ !Ëy²%\006ºwñoé´"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill717_38 = local6_life21;
        int __sourceSpill717_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill717_38)).substring(((int)(__sourceSpill717_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill717_43 = local8_life19;
        int __sourceSpill717_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill717_46 = new byte[8];
        (__sourceSpill717_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill717_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill717_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill717_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill717_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill717_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill717_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill717_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill717_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill717_47)).doFinal(((byte[])(__sourceSpill717_46)));
        (__sourceSpill717_43)[__sourceSpill717_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceHandlerCall_06057a1b0cb604d7861b(moom.Eb a0) throws E;
private static final class __SourceHandler_06057a1b0cb604d7861b {

public static void f63(moom.Eb receiver) throws Throwable {
    int forwardValue63_19_0;
    int forwardValue63_25_0;
    int forwardValue63_44_0;
    moom.Eb forwardValue63_60_0;
    int forwardValue63_60_1;
    moom.Eb forwardValue63_61_0;
    moom.Eb forwardValue63_62_0;
    int forwardValue63_62_1;
    int forwardValue63_75_0;
    int forwardValue63_78_0;
    int forwardValue63_78_1;
    int forwardValue63_81_0;
    moom.Eb forwardValue63_91_0;
    int forwardValue63_95_0;
    int forwardValue63_117_0;
    moom.Eb forwardValue63_130_0;
    boolean spill63_0;
    int spill63_1;
    moom.Eb spill63_2;
    int spill63_3;
    int spill63_4;
    int spill63_5;
    moom.Eb spill63_6;
    moom.Eb spill63_7;
    long life1_3;
    int life3_5;
    float life4_50;
    forward_join_136: {
    forward_join_130: {
    forward_join_129: {
    forward_join_117: {
    forward_join_106: {
    forward_join_95: {
    forward_join_93: {
    forward_join_91: {
    forward_join_90: {
    forward_join_81: {
    forward_join_78: {
    forward_join_75: {
    forward_join_73: {
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_25: {
    forward_join_19: {
    forward_join_17: {
    life1_3 = (__fieldRead63_0() ^ 44469618416788L);
    life3_5 = __integerCategory63_2(__call63_1());
    spill63_0 = __call63_4(__fieldRead63_3(receiver));
    if (!((life3_5 == 0))) {
        forwardValue63_19_0 = __integerCategory63_5(spill63_0);
        break forward_join_19;
    }
    if (!(spill63_0)) {
        break forward_join_17;
    }
    __fieldWrite63_6(receiver, 0);
    if (!((life3_5 != 0))) {
        break forward_join_136;
    }
    }
    forwardValue63_19_0 = __fieldRead63_7(receiver);
    }
    if (!((life3_5 == 0))) {
        forwardValue63_25_0 = forwardValue63_19_0;
        break forward_join_25;
    }
    if (!((forwardValue63_19_0 != 2))) {
        break forward_join_136;
    }
    forwardValue63_25_0 = __fieldRead63_8(receiver);
    }
    if (!((life3_5 == 0))) {
        forwardValue63_75_0 = forwardValue63_25_0;
        break forward_join_75;
    }
    if (!((forwardValue63_25_0 == 0))) {
        break forward_join_73;
    }
    life4_50 = __call63_10(__fieldRead63_9(receiver), 0x0.0p0f);
    spill63_1 = __numericCompare63_11(((double) life4_50), 0x1.0p-1d);
    if (!((life3_5 == 0))) {
        forwardValue63_44_0 = spill63_1;
        break forward_join_44;
    }
    if (!((spill63_1 >= 0))) {
        break forward_join_45;
    }
    forwardValue63_44_0 = __numericCompare63_12(((double) life4_50), 0x1.0083126e978d5p-1d);
    }
    if (!((forwardValue63_44_0 > 0))) {
        break forward_join_46;
    }
    }
    return;
    }
    spill63_2 = receiver;
    spill63_3 = __call63_16(__fieldRead63_14(__fieldRead63_13(receiver)), __invokedynamic63_15(8587, (5114393948528119770L ^ life1_3)));
    if (!((life3_5 == 0))) {
        forwardValue63_60_0 = spill63_2;
        forwardValue63_60_1 = spill63_3;
        break forward_join_60;
    }
    if (!((spill63_3 == 0))) {
        forwardValue63_61_0 = spill63_2;
        break forward_join_61;
    }
    forwardValue63_60_0 = spill63_2;
    forwardValue63_60_1 = 1;
    }
    forwardValue63_62_0 = forwardValue63_60_0;
    forwardValue63_62_1 = forwardValue63_60_1;
    break forward_join_62;
    }
    forwardValue63_62_0 = forwardValue63_61_0;
    forwardValue63_62_1 = 2;
    }
    __fieldWrite63_17(forwardValue63_62_0, forwardValue63_62_1);
    __fieldWrite63_18(receiver, 0);
    spill63_4 = __fieldRead63_19(receiver);
    spill63_5 = 2;
    if (!((life3_5 == 0))) {
        forwardValue63_78_0 = spill63_4;
        forwardValue63_78_1 = spill63_5;
        break forward_join_78;
    }
    if (!((spill63_4 == spill63_5))) {
        break forward_join_73;
    }
    return;
    }
    forwardValue63_75_0 = __fieldRead63_20(receiver);
    }
    if (!((life3_5 == 0))) {
        forwardValue63_81_0 = forwardValue63_75_0;
        break forward_join_81;
    }
    forwardValue63_78_0 = forwardValue63_75_0;
    forwardValue63_78_1 = -1;
    }
    if (!((forwardValue63_78_0 != forwardValue63_78_1))) {
        break forward_join_136;
    }
    forwardValue63_81_0 = __integerCategory63_22(__fieldRead63_21(receiver));
    }
    if (!((life3_5 == 0))) {
        forwardValue63_95_0 = forwardValue63_81_0;
        break forward_join_95;
    }
    if (!((forwardValue63_81_0 == 0))) {
        break forward_join_93;
    }
    spill63_6 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue63_91_0 = spill63_6;
        break forward_join_91;
    }
    if (!((!__call63_23(spill63_6)))) {
        break forward_join_90;
    }
    return;
    }
    forwardValue63_91_0 = receiver;
    }
    __fieldWrite63_24(forwardValue63_91_0, 1);
    }
    forwardValue63_95_0 = __fieldRead63_25(receiver);
    }
    if (!((life3_5 == 0))) {
        forwardValue63_117_0 = forwardValue63_95_0;
        break forward_join_117;
    }
    if (!((forwardValue63_95_0 > 0))) {
        break forward_join_106;
    }
    moom.Eb __stackOp63_26_0 = receiver;
    __fieldWrite63_28(__stackOp63_26_0, (__fieldRead63_27(__stackOp63_26_0) - 1));
    if (!((life3_5 != 0))) {
        break forward_join_136;
    }
    }
    __fieldWrite63_30(receiver, __invokedynamic63_29(10888, (6212225275504493784L ^ life1_3)));
    spill63_7 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue63_130_0 = spill63_7;
        break forward_join_130;
    }
    forwardValue63_117_0 = __fieldRead63_31(spill63_7);
    }
    if (!((forwardValue63_117_0 > 0))) {
        break forward_join_129;
    }
    __call63_32(receiver);
    moom.Eb __stackOp63_33_0 = receiver;
    __fieldWrite63_35(__stackOp63_33_0, (__fieldRead63_34(__stackOp63_33_0) - 1));
    if (!((life3_5 != 0))) {
        break forward_join_136;
    }
    }
    forwardValue63_130_0 = receiver;
    }
    __fieldWrite63_37(forwardValue63_130_0, __invokedynamic63_36(18446, (6388626756577748564L ^ life1_3)));
    }
    return;
}
public static void h63_0(moom.Oo p0) throws Throwable {
    throw __call1006300_0(p0);
}
public static void h63_1(moom.Oo p0) throws Throwable {
    throw __call1006301_0(p0);
}
public static void h63_2(moom.Oo p0) throws Throwable {
    throw __call1006302_0(p0);
}
public static void h63_3(moom.Oo p0) throws Throwable {
    throw __call1006303_0(p0);
}
public static void h63_4(moom.Oo p0) throws Throwable {
    throw __call1006304_0(p0);
}
public static void h63_5(moom.Oo p0) throws Throwable {
    throw __call1006305_0(p0);
}
public static void h63_6(moom.Oo p0) throws Throwable {
    throw __call1006306_0(p0);
}
public static void h63_7(moom.Oo p0) throws Throwable {
    throw __call1006307_0(p0);
}
public static void h63_8(moom.Oo p0) throws Throwable {
    throw __call1006308_0(p0);
}
public static void h63_9(moom.Oo p0) throws Throwable {
    throw __call1006309_0(p0);
}
public static void h63_10(moom.Oo p0) throws Throwable {
    throw __call1006310_0(p0);
}
public static void h63_11(moom.Oo p0) throws Throwable {
    throw __call1006311_0(p0);
}
public static void h63_12(moom.Oo p0) throws Throwable {
    throw __call1006312_0(p0);
}
public static void h63_13(moom.Oo p0) throws Throwable {
    throw __call1006313_0(p0);
}
public static void h63_14(moom.Oo p0) throws Throwable {
    throw __call1006314_0(p0);
}
public static void h63_15(moom.Oo p0) throws Throwable {
    throw __call1006315_0(p0);
}
public static void h63_16(moom.Oo p0) throws Throwable {
    throw __call1006316_0(p0);
}
public static void h63_17(moom.Oo p0) throws Throwable {
    throw __call1006317_0(p0);
}
public static void h63_18(moom.Oo p0) throws Throwable {
    throw __call1006318_0(p0);
}
public static void h63_19(moom.Oo p0) throws Throwable {
    throw __call1006319_0(p0);
}
public static void h63_20(moom.Oo p0) throws Throwable {
    throw __call1006320_0(p0);
}
public static void h63_21(moom.Oo p0) throws Throwable {
    throw __call1006321_0(p0);
}
private static native long __fieldRead63_0() throws Throwable;
private static native boolean __call63_1() throws Throwable;
private static native int __integerCategory63_2(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead63_3(moom.Eb a0) throws Throwable;
private static native boolean __call63_4(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory63_5(boolean value) throws Throwable;
private static native void __fieldWrite63_6(moom.Eb a0, int a1) throws Throwable;
private static native int __fieldRead63_7(moom.Eb a0) throws Throwable;
private static native int __fieldRead63_8(moom.Eb a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead63_9(moom.Eb a0) throws Throwable;
private static native float __call63_10(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare63_11(double a0, double a1) throws Throwable;
private static native int __numericCompare63_12(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead63_13(moom.Eb a0) throws Throwable;
private static native java.util.Random __fieldRead63_14(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic63_15(int a0, long a1) throws Throwable;
private static native int __call63_16(java.util.Random a0, int a1) throws Throwable;
private static native void __fieldWrite63_17(moom.Eb a0, int a1) throws Throwable;
private static native void __fieldWrite63_18(moom.Eb a0, int a1) throws Throwable;
private static native int __fieldRead63_19(moom.Eb a0) throws Throwable;
private static native int __fieldRead63_20(moom.Eb a0) throws Throwable;
private static native boolean __fieldRead63_21(moom.Eb a0) throws Throwable;
private static native int __integerCategory63_22(boolean value) throws Throwable;
private static native boolean __call63_23(moom.Eb a0) throws Throwable;
private static native void __fieldWrite63_24(moom.Eb a0, int a1) throws Throwable;
private static native int __fieldRead63_25(moom.Eb a0) throws Throwable;
private static native int __fieldRead63_27(moom.Eb a0) throws Throwable;
private static native void __fieldWrite63_28(moom.Eb a0, int a1) throws Throwable;
private static native int __invokedynamic63_29(int a0, long a1) throws Throwable;
private static native void __fieldWrite63_30(moom.Eb a0, int a1) throws Throwable;
private static native int __fieldRead63_31(moom.Eb a0) throws Throwable;
private static native boolean __call63_32(moom.Eb a0) throws Throwable;
private static native int __fieldRead63_34(moom.Eb a0) throws Throwable;
private static native void __fieldWrite63_35(moom.Eb a0, int a1) throws Throwable;
private static native int __invokedynamic63_36(int a0, long a1) throws Throwable;
private static native void __fieldWrite63_37(moom.Eb a0, int a1) throws Throwable;
private static native java.lang.Exception __call1006300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006314_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006315_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006316_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006317_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006318_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006319_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006320_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006321_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DR __sourceHandlerCall_09cc7cab110d57251fd3(moom.Eb a0, moom.DT a1) throws E;
private static final class __SourceHandler_09cc7cab110d57251fd3 {

public static moom.DR f628(moom.Eb receiver, moom.DT p0) throws Throwable {
    boolean spill628_0;
    long life2_3;
    int life5_6;
    int life4_7;
    moom.DT life6_58;
    lexical_join_88: {
    life2_3 = (__fieldRead628_0() ^ 130252194806909L);
    spill628_0 = __call628_1();
    life5_6 = 0;
    life4_7 = __integerCategory628_2(spill628_0);
    lexical_cycle_8: while (true) {
    lexical_join_86: {
    lexical_join_85: {
    if (!((life5_6 < __invokedynamic628_3(31487, (2108798793688757312L ^ life2_3))))) {
        break lexical_join_88;
    }
    life6_58 = __call628_18(p0, (__call628_7(__fieldRead628_5(__fieldRead628_4(receiver)), __invokedynamic628_6(17188, (1405521317814963615L ^ life2_3))) - __invokedynamic628_8(8495, (1945673986651090847L ^ life2_3))), (__call628_12(__fieldRead628_10(__fieldRead628_9(receiver)), __invokedynamic628_11(25081, (5157691174843232068L ^ life2_3))) - 3), (__call628_16(__fieldRead628_14(__fieldRead628_13(receiver)), __invokedynamic628_15(4304, (3524673784940289634L ^ life2_3))) - __invokedynamic628_17(7564, (6789665045336183600L ^ life2_3))));
    if (!((life4_7 == 0))) {
        break lexical_join_86;
    }
    if (!(__call628_20(__fieldRead628_19(receiver), life6_58))) {
        break lexical_join_85;
    }
    if (!(__call628_23(__fieldRead628_21(), __fieldRead628_22(receiver), life6_58))) {
        break lexical_join_85;
    }
    return new moom.DR(((double) __call628_24(life6_58)), ((double) __call628_25(life6_58)), ((double) __call628_26(life6_58)));
    }
    life5_6 += 1;
    }
    if (!((life4_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return null;
}
public static void h628_0(moom.Oo p0) throws Throwable {
    throw __call1062800_0(p0);
}
public static void h628_1(moom.Oo p0) throws Throwable {
    throw __call1062801_0(p0);
}
public static void h628_2(moom.Oo p0) throws Throwable {
    throw __call1062802_0(p0);
}
private static native long __fieldRead628_0() throws Throwable;
private static native boolean __call628_1() throws Throwable;
private static native int __integerCategory628_2(boolean value) throws Throwable;
private static native int __invokedynamic628_3(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead628_4(moom.Eb a0) throws Throwable;
private static native java.util.Random __fieldRead628_5(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic628_6(int a0, long a1) throws Throwable;
private static native int __call628_7(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic628_8(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead628_9(moom.Eb a0) throws Throwable;
private static native java.util.Random __fieldRead628_10(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic628_11(int a0, long a1) throws Throwable;
private static native int __call628_12(java.util.Random a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead628_13(moom.Eb a0) throws Throwable;
private static native java.util.Random __fieldRead628_14(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic628_15(int a0, long a1) throws Throwable;
private static native int __call628_16(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic628_17(int a0, long a1) throws Throwable;
private static native moom.DT __call628_18(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.village.Village __fieldRead628_19(moom.Eb a0) throws Throwable;
private static native boolean __call628_20(net.minecraft.village.Village a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving$SpawnPlacementType __fieldRead628_21() throws Throwable;
private static native net.minecraft.world.World __fieldRead628_22(moom.Eb a0) throws Throwable;
private static native boolean __call628_23(net.minecraft.entity.EntityLiving$SpawnPlacementType a0, net.minecraft.world.World a1, moom.DT a2) throws Throwable;
private static native int __call628_24(moom.DT a0) throws Throwable;
private static native int __call628_25(moom.DT a0) throws Throwable;
private static native int __call628_26(moom.DT a0) throws Throwable;
private static native java.lang.Exception __call1062800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1062801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1062802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ba96aecffe45bf7e27f0(moom.Eb a0) throws E;
private static final class __SourceHandler_ba96aecffe45bf7e27f0 {

public static boolean f100081(moom.Eb receiver) throws Throwable {
    java.util.Iterator forestValue100081_14_0;
    java.lang.Object forestValue100081_19_0;
    net.minecraft.village.Village forestValue100081_44_0;
    int forestValue100081_61_0;
    int forestValue100081_61_1;
    int forestValue100081_74_0;
    int forestValue100081_74_1;
    net.minecraft.village.Village forestValue100081_77_0;
    net.minecraft.village.Village forestValue100081_160_0;
    int forestValue100081_174_0;
    int forestValue100081_211_0;
    boolean spill100081_0;
    net.minecraft.village.Village spill100081_1;
    int spill100081_2;
    int spill100081_3;
    net.minecraft.village.Village spill100081_4;
    java.util.Iterator spill100081_5;
    net.minecraft.village.Village spill100081_6;
    boolean spill100081_7;
    int spill100081_8;
    long life1_3;
    java.util.List life4_7;
    java.util.Iterator life5_11;
    int life3_12;
    net.minecraft.entity.player.EntityPlayer life6_20;
    moom.DT life7_87;
    float life8_92;
    int life9_94;
    int life10_96;
    float life11_112;
    java.util.Iterator life12_152;
    net.minecraft.village.Village life13_159;
    moom.DR life10_217;
    forest_join_212: {
    forest_join_211: {
    forest_join_210: {
    forest_join_208: {
    life1_3 = (__fieldRead100081_0() ^ 75120937091390L);
    life4_7 = __fieldRead100081_2(__fieldRead100081_1(receiver));
    spill100081_0 = __call100081_3();
    life5_11 = __call100081_4(life4_7);
    life3_12 = __integerCategory100081_5(spill100081_0);
    forest_cycle_13: while (true) {
    forest_join_207: {
    forest_join_191: {
    forest_join_186: {
    forestValue100081_14_0 = life5_11;
    forest_cycle_14: while (true) {
    forest_join_17: {
    if (!((!__call100081_6(forestValue100081_14_0)))) {
        break forest_join_17;
    }
    break forest_join_208;
    }
    forestValue100081_19_0 = __call100081_7(life5_11);
    forest_cycle_19: while (true) {
    forest_join_77: {
    forest_join_74: {
    forest_join_61: {
    forest_join_44: {
    forest_join_37: {
    life6_20 = __cast100081_8(forestValue100081_19_0);
    if (!((life3_12 != 0))) {
        break forest_join_37;
    }
    if (!((!__call100081_9(life6_20)))) {
        break forest_join_207;
    }
    __fieldWrite100081_13(receiver, __call100081_12(__call100081_11(__fieldRead100081_10(receiver)), new moom.DT(life6_20), 1));
    }
    spill100081_1 = __fieldRead100081_14(receiver);
    if (!((life3_12 != 0))) {
        forestValue100081_44_0 = spill100081_1;
        break forest_join_44;
    }
    if (!((spill100081_1 != null))) {
        break forest_join_207;
    }
    forestValue100081_44_0 = __fieldRead100081_15(receiver);
    }
    spill100081_2 = __call100081_16(forestValue100081_44_0);
    spill100081_3 = __invokedynamic100081_17(8587, (5114283853634556528L ^ life1_3));
    if (!((life3_12 != 0))) {
        forestValue100081_61_0 = spill100081_2;
        forestValue100081_61_1 = spill100081_3;
        break forest_join_61;
    }
    if (!((spill100081_2 >= spill100081_3))) {
        break forest_join_207;
    }
    forestValue100081_61_0 = __call100081_19(__fieldRead100081_18(receiver));
    forestValue100081_61_1 = __invokedynamic100081_20(4777, (6000496250146513232L ^ life1_3));
    }
    if (!((life3_12 != 0))) {
        forestValue100081_74_0 = forestValue100081_61_0;
        forestValue100081_74_1 = forestValue100081_61_1;
        break forest_join_74;
    }
    if (!((forestValue100081_61_0 >= forestValue100081_61_1))) {
        break forest_join_207;
    }
    spill100081_4 = __fieldRead100081_21(receiver);
    if (!((life3_12 != 0))) {
        forestValue100081_77_0 = spill100081_4;
        break forest_join_77;
    }
    forestValue100081_74_0 = __call100081_22(spill100081_4);
    forestValue100081_74_1 = __invokedynamic100081_23(19768, (6093557944337120965L ^ life1_3));
    }
    if (!((forestValue100081_74_0 >= forestValue100081_74_1))) {
        break forest_join_207;
    }
    forestValue100081_77_0 = __fieldRead100081_24(receiver);
    }
    life7_87 = __call100081_25(forestValue100081_77_0);
    life8_92 = ((float) __call100081_27(__fieldRead100081_26(receiver)));
    life9_94 = 0;
    life10_96 = 0;
    forest_cycle_88: while (true) {
    forest_join_183: {
    forest_join_179: {
    if (!((life10_96 < __invokedynamic100081_28(8587, (5114283853634556528L ^ life1_3))))) {
        break forest_join_186;
    }
    life11_112 = ((__call100081_31(__fieldRead100081_30(__fieldRead100081_29(receiver))) * 0x1.921fb6p1f) * 0x1.0p1f);
    __fieldWrite100081_34(receiver, (__call100081_32(life7_87) + ((int) (((double) (__call100081_33(life11_112) * life8_92)) * 0x1.ccccccccccccdp-1d))));
    __fieldWrite100081_36(receiver, __call100081_35(life7_87));
    __fieldWrite100081_39(receiver, (__call100081_37(life7_87) + ((int) (((double) (__call100081_38(life11_112) * life8_92)) * 0x1.ccccccccccccdp-1d))));
    life9_94 = 0;
    spill100081_5 = __call100081_43(__call100081_42(__call100081_41(__fieldRead100081_40(receiver))));
    if (!((life3_12 != 0))) {
        forestValue100081_14_0 = spill100081_5;
        continue forest_cycle_14;
    }
    life12_152 = spill100081_5;
    forest_cycle_144: while (true) {
    forest_join_177: {
    forest_join_174: {
    forest_join_160: {
    if (!(__call100081_44(life12_152))) {
        break forest_join_179;
    }
    life13_159 = __cast100081_46(__call100081_45(life12_152));
    spill100081_6 = life13_159;
    if (!((life3_12 != 0))) {
        forestValue100081_19_0 = spill100081_6;
        continue forest_cycle_19;
    }
    if (!((life3_12 != 0))) {
        forestValue100081_160_0 = spill100081_6;
        break forest_join_160;
    }
    if (!((spill100081_6 != __fieldRead100081_47(receiver)))) {
        break forest_join_177;
    }
    forestValue100081_160_0 = life13_159;
    }
    spill100081_7 = __call100081_51(forestValue100081_160_0, new moom.DT(__fieldRead100081_48(receiver), __fieldRead100081_49(receiver), __fieldRead100081_50(receiver)));
    if (!((life3_12 != 0))) {
        forestValue100081_174_0 = __integerCategory100081_52(spill100081_7);
        break forest_join_174;
    }
    if (!(spill100081_7)) {
        break forest_join_177;
    }
    forestValue100081_174_0 = 1;
    }
    life9_94 = forestValue100081_174_0;
    if (!((life3_12 == 0))) {
        break forest_join_179;
    }
    }
    if (!((life3_12 == 0))) {
        continue forest_cycle_144;
    }
    break forest_cycle_144;
    }
    }
    if (!((life9_94 == 0))) {
        break forest_join_183;
    }
    if (!((life3_12 == 0))) {
        break forest_join_186;
    }
    }
    life10_96 += 1;
    if (!((life3_12 == 0))) {
        continue forest_cycle_88;
    }
    break forest_cycle_88;
    }
    break forest_cycle_19;
    }
    break forest_cycle_14;
    }
    }
    spill100081_8 = life9_94;
    if (!((life3_12 != 0))) {
        forestValue100081_211_0 = spill100081_8;
        break forest_join_211;
    }
    if (!((spill100081_8 != 0))) {
        break forest_join_191;
    }
    break forest_join_210;
    }
    life10_217 = __call100081_56(receiver, new moom.DT(__fieldRead100081_53(receiver), __fieldRead100081_54(receiver), __fieldRead100081_55(receiver)));
    if (!((life10_217 != null))) {
        break forest_join_207;
    }
    if (!((life3_12 == 0))) {
        break forest_join_212;
    }
    }
    continue forest_cycle_13;
    }
    }
    return __integerCategory100081_57(0);
    }
    forestValue100081_211_0 = 0;
    }
    return __integerCategory100081_58(forestValue100081_211_0);
    }
    __fieldWrite100081_59(receiver, 0);
    __fieldWrite100081_61(receiver, __invokedynamic100081_60(19768, (6093557944337120965L ^ life1_3)));
    return __integerCategory100081_62(1);
}
public static boolean h100081_0(moom.Oo p0) throws Throwable {
    throw __call13008100_0(p0);
}
public static boolean h100081_1(moom.Oo p0) throws Throwable {
    throw __call13008101_0(p0);
}
public static boolean h100081_2(moom.Oo p0) throws Throwable {
    throw __call13008102_0(p0);
}
public static boolean h100081_3(moom.Oo p0) throws Throwable {
    throw __call13008103_0(p0);
}
public static boolean h100081_4(moom.Oo p0) throws Throwable {
    throw __call13008104_0(p0);
}
public static boolean h100081_5(moom.Oo p0) throws Throwable {
    throw __call13008105_0(p0);
}
public static boolean h100081_6(moom.Oo p0) throws Throwable {
    throw __call13008106_0(p0);
}
public static boolean h100081_7(moom.Oo p0) throws Throwable {
    throw __call13008107_0(p0);
}
public static boolean h100081_8(moom.Oo p0) throws Throwable {
    throw __call13008108_0(p0);
}
public static boolean h100081_9(moom.Oo p0) throws Throwable {
    throw __call13008109_0(p0);
}
public static boolean h100081_10(moom.Oo p0) throws Throwable {
    throw __call13008110_0(p0);
}
public static boolean h100081_11(moom.Oo p0) throws Throwable {
    throw __call13008111_0(p0);
}
public static boolean h100081_12(moom.Oo p0) throws Throwable {
    throw __call13008112_0(p0);
}
public static boolean h100081_13(moom.Oo p0) throws Throwable {
    throw __call13008113_0(p0);
}
public static boolean h100081_14(moom.Oo p0) throws Throwable {
    throw __call13008114_0(p0);
}
public static boolean h100081_15(moom.Oo p0) throws Throwable {
    throw __call13008115_0(p0);
}
public static boolean h100081_16(moom.Oo p0) throws Throwable {
    throw __call13008116_0(p0);
}
public static boolean h100081_17(moom.Oo p0) throws Throwable {
    throw __call13008117_0(p0);
}
private static native long __fieldRead100081_0() throws Throwable;
private static native net.minecraft.world.World __fieldRead100081_1(moom.Eb a0) throws Throwable;
private static native java.util.List __fieldRead100081_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call100081_3() throws Throwable;
private static native java.util.Iterator __call100081_4(java.util.List a0) throws Throwable;
private static native int __integerCategory100081_5(boolean value) throws Throwable;
private static native boolean __call100081_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100081_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast100081_8(java.lang.Object a0) throws Throwable;
private static native boolean __call100081_9(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead100081_10(moom.Eb a0) throws Throwable;
private static native moom.EG __call100081_11(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.village.Village __call100081_12(moom.EG a0, moom.DT a1, int a2) throws Throwable;
private static native void __fieldWrite100081_13(moom.Eb a0, net.minecraft.village.Village a1) throws Throwable;
private static native net.minecraft.village.Village __fieldRead100081_14(moom.Eb a0) throws Throwable;
private static native net.minecraft.village.Village __fieldRead100081_15(moom.Eb a0) throws Throwable;
private static native int __call100081_16(net.minecraft.village.Village a0) throws Throwable;
private static native int __invokedynamic100081_17(int a0, long a1) throws Throwable;
private static native net.minecraft.village.Village __fieldRead100081_18(moom.Eb a0) throws Throwable;
private static native int __call100081_19(net.minecraft.village.Village a0) throws Throwable;
private static native int __invokedynamic100081_20(int a0, long a1) throws Throwable;
private static native net.minecraft.village.Village __fieldRead100081_21(moom.Eb a0) throws Throwable;
private static native int __call100081_22(net.minecraft.village.Village a0) throws Throwable;
private static native int __invokedynamic100081_23(int a0, long a1) throws Throwable;
private static native net.minecraft.village.Village __fieldRead100081_24(moom.Eb a0) throws Throwable;
private static native moom.DT __call100081_25(net.minecraft.village.Village a0) throws Throwable;
private static native net.minecraft.village.Village __fieldRead100081_26(moom.Eb a0) throws Throwable;
private static native int __call100081_27(net.minecraft.village.Village a0) throws Throwable;
private static native int __invokedynamic100081_28(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead100081_29(moom.Eb a0) throws Throwable;
private static native java.util.Random __fieldRead100081_30(net.minecraft.world.World a0) throws Throwable;
private static native float __call100081_31(java.util.Random a0) throws Throwable;
private static native int __call100081_32(moom.DT a0) throws Throwable;
private static native float __call100081_33(float a0) throws Throwable;
private static native void __fieldWrite100081_34(moom.Eb a0, int a1) throws Throwable;
private static native int __call100081_35(moom.DT a0) throws Throwable;
private static native void __fieldWrite100081_36(moom.Eb a0, int a1) throws Throwable;
private static native int __call100081_37(moom.DT a0) throws Throwable;
private static native float __call100081_38(float a0) throws Throwable;
private static native void __fieldWrite100081_39(moom.Eb a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead100081_40(moom.Eb a0) throws Throwable;
private static native moom.EG __call100081_41(net.minecraft.world.World a0) throws Throwable;
private static native java.util.List __call100081_42(moom.EG a0) throws Throwable;
private static native java.util.Iterator __call100081_43(java.util.List a0) throws Throwable;
private static native boolean __call100081_44(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100081_45(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.village.Village __cast100081_46(java.lang.Object a0) throws Throwable;
private static native net.minecraft.village.Village __fieldRead100081_47(moom.Eb a0) throws Throwable;
private static native int __fieldRead100081_48(moom.Eb a0) throws Throwable;
private static native int __fieldRead100081_49(moom.Eb a0) throws Throwable;
private static native int __fieldRead100081_50(moom.Eb a0) throws Throwable;
private static native boolean __call100081_51(net.minecraft.village.Village a0, moom.DT a1) throws Throwable;
private static native int __integerCategory100081_52(boolean value) throws Throwable;
private static native int __fieldRead100081_53(moom.Eb a0) throws Throwable;
private static native int __fieldRead100081_54(moom.Eb a0) throws Throwable;
private static native int __fieldRead100081_55(moom.Eb a0) throws Throwable;
private static native moom.DR __call100081_56(moom.Eb a0, moom.DT a1) throws Throwable;
private static native boolean __integerCategory100081_57(int value) throws Throwable;
private static native boolean __integerCategory100081_58(int value) throws Throwable;
private static native void __fieldWrite100081_59(moom.Eb a0, int a1) throws Throwable;
private static native int __invokedynamic100081_60(int a0, long a1) throws Throwable;
private static native void __fieldWrite100081_61(moom.Eb a0, int a1) throws Throwable;
private static native boolean __integerCategory100081_62(int value) throws Throwable;
private static native java.lang.Exception __call13008100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008111_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008112_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008113_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008114_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008115_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008116_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call13008117_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_423d56159d7f6e999890(moom.Eb a0) throws E;
private static final class __SourceHandler_423d56159d7f6e999890 {

public static boolean f240(moom.Eb receiver) throws Throwable {
    long life1_3;
    moom.DR life3_15;
    net.minecraft.entity.monster.EntityZombie life4_27;
    moom.DT life5_71;
    life1_3 = (__fieldRead240_0() ^ 102512574190311L);
    life3_15 = __call240_4(receiver, new moom.DT(__fieldRead240_1(receiver), __fieldRead240_2(receiver), __fieldRead240_3(receiver)));
    if ((life3_15 == null)) {
        return __integerCategory240_5(0);
    }
    life4_27 = new net.minecraft.entity.monster.EntityZombie(__fieldRead240_6(receiver));
    __call240_9(life4_27, __call240_8(__fieldRead240_7(receiver), new moom.DT(life4_27)), null);
    __call240_10(life4_27, 0);
    __call240_17(life4_27, __fieldRead240_11(life3_15), __fieldRead240_12(life3_15), __fieldRead240_13(life3_15), (__call240_16(__fieldRead240_15(__fieldRead240_14(receiver))) * 0x1.68p8f), 0x0.0p0f);
    __call240_19(__fieldRead240_18(receiver), life4_27);
    life5_71 = __call240_21(__fieldRead240_20(receiver));
    __call240_24(life4_27, life5_71, __call240_23(__fieldRead240_22(receiver)));
    return __integerCategory240_25(1);
}
public static boolean h240_0(java.lang.Exception p0) throws Throwable {
    throw __call2024000_0(p0);
}
public static boolean h240_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2024001_0(local1);
    return false;
}
private static native long __fieldRead240_0() throws Throwable;
private static native int __fieldRead240_1(moom.Eb a0) throws Throwable;
private static native int __fieldRead240_2(moom.Eb a0) throws Throwable;
private static native int __fieldRead240_3(moom.Eb a0) throws Throwable;
private static native moom.DR __call240_4(moom.Eb a0, moom.DT a1) throws Throwable;
private static native boolean __integerCategory240_5(int value) throws Throwable;
private static native net.minecraft.world.World __fieldRead240_6(moom.Eb a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead240_7(moom.Eb a0) throws Throwable;
private static native moom.Eh __call240_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call240_9(net.minecraft.entity.monster.EntityZombie a0, moom.Eh a1, java.lang.Object a2) throws Throwable;
private static native void __call240_10(net.minecraft.entity.monster.EntityZombie a0, int a1) throws Throwable;
private static native double __fieldRead240_11(moom.DR a0) throws Throwable;
private static native double __fieldRead240_12(moom.DR a0) throws Throwable;
private static native double __fieldRead240_13(moom.DR a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead240_14(moom.Eb a0) throws Throwable;
private static native java.util.Random __fieldRead240_15(net.minecraft.world.World a0) throws Throwable;
private static native float __call240_16(java.util.Random a0) throws Throwable;
private static native void __call240_17(net.minecraft.entity.monster.EntityZombie a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.world.World __fieldRead240_18(moom.Eb a0) throws Throwable;
private static native boolean __call240_19(net.minecraft.world.World a0, net.minecraft.entity.monster.EntityZombie a1) throws Throwable;
private static native net.minecraft.village.Village __fieldRead240_20(moom.Eb a0) throws Throwable;
private static native moom.DT __call240_21(net.minecraft.village.Village a0) throws Throwable;
private static native net.minecraft.village.Village __fieldRead240_22(moom.Eb a0) throws Throwable;
private static native int __call240_23(net.minecraft.village.Village a0) throws Throwable;
private static native void __call240_24(net.minecraft.entity.monster.EntityZombie a0, moom.DT a1, int a2) throws Throwable;
private static native boolean __integerCategory240_25(int value) throws Throwable;
private static native java.lang.Exception __call2024000_0(java.lang.Exception a0) throws Throwable;
private static native void __call2024001_0(java.lang.Exception a0) throws Throwable;

}


private boolean b() { return __sourceHandlerCall_423d56159d7f6e999890(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28682;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Eb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Eb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4357_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Eb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a() { __sourceHandlerCall_06057a1b0cb604d7861b(this); }


private moom.DR a(moom.DT p0) { return __sourceHandlerCall_09cc7cab110d57251fd3(this, p0); }


private boolean a__Boolean() { return __sourceHandlerCall_ba96aecffe45bf7e27f0(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4357_0() throws E;
}
