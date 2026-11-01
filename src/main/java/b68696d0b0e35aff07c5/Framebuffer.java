package net.minecraft.client.shader;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Framebuffer {

public int a;

public int b;

public int c;

public int d;

public boolean e;

public int f;

public int g;

public int h;

public float[] i;

public int j;

private static int k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public Framebuffer(int p0, int p1, boolean p2) {
super();
    this.e = ((boolean)(p2));
    this.f = ((int)(-1));
    this.g = ((int)(-1));
    this.h = ((int)(-1));
    this.i = ((float[])(new float[4]));
    (this.i)[0] = 0x1.0p0f;
    (this.i)[1] = 0x1.0p0f;
    (this.i)[2] = 0x1.0p0f;
    (this.i)[3] = 0x0.0p0f;
    ((net.minecraft.client.shader.Framebuffer)(this)).a(((int)(p0)), ((int)(p1)));
    return;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-7454344260345692144L)), ((long)(-8946789580328367256L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(129182979196515L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill1834_7 = 56;
    long local0_life8 = (net.minecraft.client.shader.Framebuffer.l ^ 74629232817266L);
    net.minecraft.client.shader.Framebuffer.c(((int)(__sourceSpill1834_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1834_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1834_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1834_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1834_16 = new byte[8];
    (__sourceSpill1834_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1834_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1834_18 = __sourceSpill1834_16;
    ((javax.crypto.Cipher)(__sourceSpill1834_13)).init(((int)(__sourceSpill1834_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1834_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1834_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[32];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "\bÚæ¸?dXC2`\006O,6o\002â\034â-E=å\ng´õ\013Ï5oOMià×\023áÓ\017÷5E£3¹¦fñÜÔ\007¼ÈÎÓC\\¹eËÿò1£ sXÛç¿0öÉ!Éõâ}7\017Ð\036\003£82\000DÏ\fÓ´`\177Á/¯8\030Ö\030¸B·â £à\034ÄãKX(Yq¸õkú?ØV\024\002¬H\031µÆ3Ë$É¬Ø{ÜÍJÙHk¹\007µ\0061Àp\023[Ù<Tm@¬¤ökF`\r\004ÿ6Y¢m\024v\032e_%ãN\024Ö!\024\017ÝÛ¨\030A¤SQZõ!q\030\1771w/üË_\026ÔÌ:,\t"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1834_27 = local6_life23;
        int __sourceSpill1834_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1834_27)).substring(((int)(__sourceSpill1834_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1834_32 = local8_life21;
        int __sourceSpill1834_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1834_35 = new byte[8];
        (__sourceSpill1834_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1834_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1834_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1834_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1834_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1834_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1834_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1834_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1834_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1834_36)).doFinal(((byte[])(__sourceSpill1834_35)));
        (__sourceSpill1834_32)[__sourceSpill1834_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "&õ4\ffQf2SXUÛ®\020"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1834_40 = local6_life23;
        int __sourceSpill1834_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1834_40)).substring(((int)(__sourceSpill1834_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1834_45 = local8_life21;
        int __sourceSpill1834_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1834_48 = new byte[8];
        (__sourceSpill1834_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1834_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1834_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1834_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1834_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1834_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1834_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1834_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1834_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1834_49)).doFinal(((byte[])(__sourceSpill1834_48)));
        (__sourceSpill1834_45)[__sourceSpill1834_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    m = ((long[])(local8_life21));
    n = ((java.lang.Integer[])(new java.lang.Integer[32]));
}

private static native <E extends Throwable> void __sourceHandlerCall_3af6eec8ed18a378b9c3(net.minecraft.client.shader.Framebuffer a0) throws E;
private static final class __SourceHandler_3af6eec8ed18a378b9c3 {

public static void f2659(net.minecraft.client.shader.Framebuffer receiver) throws Throwable {
    if (__call2659_0()) {
        __call2659_1(receiver);
        __call2659_2(receiver);
        if ((__fieldRead2659_3(receiver) > -1)) {
        __call2659_5(__fieldRead2659_4(receiver));
        __fieldWrite2659_6(receiver, -1);
    }
        if ((__fieldRead2659_7(receiver) > -1)) {
        __call2659_9(__fieldRead2659_8(receiver));
        __fieldWrite2659_10(receiver, -1);
    }
        if ((__fieldRead2659_11(receiver) > -1)) {
        __call2659_13(__fieldRead2659_12(), 0);
        __call2659_15(__fieldRead2659_14(receiver));
        __fieldWrite2659_16(receiver, -1);
    }
    }
    return;
}
public static void h2659_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1265900_0(p0);
}
public static void h2659_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1265901_0(p0);
}
public static void h2659_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1265902_0(p0);
}
public static void h2659_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1265903_0(p0);
}
private static native boolean __call2659_0() throws Throwable;
private static native void __call2659_1(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2659_2(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2659_3(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2659_4(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2659_5(int a0) throws Throwable;
private static native void __fieldWrite2659_6(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __fieldRead2659_7(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2659_8(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2659_9(int a0) throws Throwable;
private static native void __fieldWrite2659_10(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __fieldRead2659_11(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2659_12() throws Throwable;
private static native void __call2659_13(int a0, int a1) throws Throwable;
private static native int __fieldRead2659_14(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2659_15(int a0) throws Throwable;
private static native void __fieldWrite2659_16(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1265900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1265901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1265902_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1265903_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4051ff279bd343c562fe(net.minecraft.client.shader.Framebuffer a0, int a1) throws E;
private static final class __SourceHandler_4051ff279bd343c562fe {

public static void f100205(net.minecraft.client.shader.Framebuffer receiver, int p0) throws Throwable {
    int spill100205_0;
    long life2_3;
    forest_join_40: {
    life2_3 = (__fieldRead100205_0() ^ 103869019707046L);
    if (!(__call100205_1())) {
        break forest_join_40;
    }
    __fieldWrite100205_2(receiver, p0);
    spill100205_0 = 25704;
    __call100205_4(__fieldRead100205_3(receiver));
    __call100205_7(__invokedynamic100205_5(spill100205_0, (2425863574302364712L ^ life2_3)), __invokedynamic100205_6(25833, (7376761658859951287L ^ life2_3)), ((float) p0));
    __call100205_10(__invokedynamic100205_8(6444, (6144837895315122538L ^ life2_3)), __invokedynamic100205_9(31995, (9112766719909760178L ^ life2_3)), ((float) p0));
    __call100205_11(0);
    }
    return;
}
public static void h100205_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call13020500_0(p0);
}
private static native long __fieldRead100205_0() throws Throwable;
private static native boolean __call100205_1() throws Throwable;
private static native void __fieldWrite100205_2(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __fieldRead100205_3(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call100205_4(int a0) throws Throwable;
private static native int __invokedynamic100205_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic100205_6(int a0, long a1) throws Throwable;
private static native void __call100205_7(int a0, int a1, float a2) throws Throwable;
private static native int __invokedynamic100205_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic100205_9(int a0, long a1) throws Throwable;
private static native void __call100205_10(int a0, int a1, float a2) throws Throwable;
private static native void __call100205_11(int a0) throws Throwable;
private static native java.lang.Exception __call13020500_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fdb799c8af2bd927665d(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws E;
private static final class __SourceHandler_fdb799c8af2bd927665d {

public static void f2661(net.minecraft.client.shader.Framebuffer receiver, int p0, int p1) throws Throwable {
    if ((!__call2661_0())) {
        __fieldWrite2661_1(receiver, p0);
        __fieldWrite2661_2(receiver, p1);
    } else {
        __call2661_3();
        if ((__fieldRead2661_4(receiver) >= 0)) {
        __call2661_5(receiver);
    }
        __call2661_6(receiver, p0, p1);
        __call2661_7(receiver);
        __call2661_9(__fieldRead2661_8(), 0);
    }
    return;
}
public static void h2661_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1266100_0(p0);
}
public static void h2661_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1266101_0(p0);
}
private static native boolean __call2661_0() throws Throwable;
private static native void __fieldWrite2661_1(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __fieldWrite2661_2(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __call2661_3() throws Throwable;
private static native int __fieldRead2661_4(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2661_5(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2661_6(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native void __call2661_7(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2661_8() throws Throwable;
private static native void __call2661_9(int a0, int a1) throws Throwable;
private static native java.lang.Exception __call1266100_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1266101_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5e17589bccd99a41af59(net.minecraft.client.shader.Framebuffer a0, int a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_5e17589bccd99a41af59 {

public static void f2662(net.minecraft.client.shader.Framebuffer receiver, int p0, int p1, boolean p2) throws Throwable {
    long life4_3;
    float life6_68;
    float life7_71;
    float life8_79;
    float life9_87;
    net.minecraft.client.renderer.Tessellator life10_89;
    moom.lw life11_92;
    life4_3 = (__fieldRead2662_0() ^ 91302001047392L);
    if (__call2662_1()) {
        __call2662_2(1, 1, 1, 0);
        int spill2662_0 = 28182;
        __call2662_3();
        long spill2662_1 = (612555789441810331L ^ life4_3);
        __call2662_4(0);
        __call2662_6(__invokedynamic2662_5(spill2662_0, spill2662_1));
        int spill2662_2 = 11930;
        __call2662_7();
        long spill2662_3 = (388239067962408720L ^ life4_3);
        __call2662_8(0x0.0p0d, ((double) p0), ((double) p1), 0x0.0p0d, 0x1.f4p9d, 0x1.77p11d);
        __call2662_10(__invokedynamic2662_9(spill2662_2, spill2662_3));
        __call2662_11();
        __call2662_12(0x0.0p0f, 0x0.0p0f, -0x1.f4p10f);
        __call2662_13(0, 0, p0, p1);
        __call2662_14();
        __call2662_15();
        __call2662_16();
        if (p2) {
        __call2662_17();
        __call2662_18();
    }
        __call2662_19(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
        __call2662_20(receiver);
        life6_68 = ((float) p0);
        life7_71 = ((float) p1);
        life8_79 = (((float) __fieldRead2662_21(receiver)) / ((float) __fieldRead2662_22(receiver)));
        life9_87 = (((float) __fieldRead2662_23(receiver)) / ((float) __fieldRead2662_24(receiver)));
        life10_89 = __call2662_25();
        life11_92 = __call2662_26(life10_89);
        __call2662_29(life11_92, __invokedynamic2662_27(30251, (3667356129020684216L ^ life4_3)), __fieldRead2662_28());
        __call2662_37(__call2662_36(__call2662_31(__call2662_30(life11_92, 0x0.0p0d, ((double) life7_71), 0x0.0p0d), 0x0.0p0d, 0x0.0p0d), __invokedynamic2662_32(29437, (2547234120168907620L ^ life4_3)), __invokedynamic2662_33(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_34(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_35(14738, (6810322346691389463L ^ life4_3))));
        __call2662_45(__call2662_44(__call2662_39(__call2662_38(life11_92, ((double) life6_68), ((double) life7_71), 0x0.0p0d), ((double) life8_79), 0x0.0p0d), __invokedynamic2662_40(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_41(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_42(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_43(14738, (6810322346691389463L ^ life4_3))));
        __call2662_53(__call2662_52(__call2662_47(__call2662_46(life11_92, ((double) life6_68), 0x0.0p0d, 0x0.0p0d), ((double) life8_79), ((double) life9_87)), __invokedynamic2662_48(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_49(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_50(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_51(14738, (6810322346691389463L ^ life4_3))));
        __call2662_61(__call2662_60(__call2662_55(__call2662_54(life11_92, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d), 0x0.0p0d, ((double) life9_87)), __invokedynamic2662_56(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_57(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_58(14738, (6810322346691389463L ^ life4_3)), __invokedynamic2662_59(14738, (6810322346691389463L ^ life4_3))));
        __call2662_62(life10_89);
        __call2662_63(1);
        __call2662_64(1, 1, 1, 1);
        __call2662_65(receiver);
    }
    return;
}
public static void h2662_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1266200_0(p0);
}
public static void h2662_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1266201_0(p0);
}
private static native long __fieldRead2662_0() throws Throwable;
private static native boolean __call2662_1() throws Throwable;
private static native void __call2662_2(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2662_3() throws Throwable;
private static native void __call2662_4(int a0) throws Throwable;
private static native int __invokedynamic2662_5(int a0, long a1) throws Throwable;
private static native void __call2662_6(int a0) throws Throwable;
private static native void __call2662_7() throws Throwable;
private static native void __call2662_8(double a0, double a1, double a2, double a3, double a4, double a5) throws Throwable;
private static native int __invokedynamic2662_9(int a0, long a1) throws Throwable;
private static native void __call2662_10(int a0) throws Throwable;
private static native void __call2662_11() throws Throwable;
private static native void __call2662_12(float a0, float a1, float a2) throws Throwable;
private static native void __call2662_13(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2662_14() throws Throwable;
private static native void __call2662_15() throws Throwable;
private static native void __call2662_16() throws Throwable;
private static native void __call2662_17() throws Throwable;
private static native void __call2662_18() throws Throwable;
private static native void __call2662_19(float a0, float a1, float a2, float a3) throws Throwable;
private static native void __call2662_20(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2662_21(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2662_22(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2662_23(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2662_24(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call2662_25() throws Throwable;
private static native moom.lw __call2662_26(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic2662_27(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead2662_28() throws Throwable;
private static native void __call2662_29(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native moom.lw __call2662_30(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2662_31(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2662_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_35(int a0, long a1) throws Throwable;
private static native moom.lw __call2662_36(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2662_37(moom.lw a0) throws Throwable;
private static native moom.lw __call2662_38(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2662_39(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2662_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_43(int a0, long a1) throws Throwable;
private static native moom.lw __call2662_44(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2662_45(moom.lw a0) throws Throwable;
private static native moom.lw __call2662_46(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2662_47(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2662_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_50(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_51(int a0, long a1) throws Throwable;
private static native moom.lw __call2662_52(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2662_53(moom.lw a0) throws Throwable;
private static native moom.lw __call2662_54(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2662_55(moom.lw a0, double a1, double a2) throws Throwable;
private static native int __invokedynamic2662_56(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic2662_59(int a0, long a1) throws Throwable;
private static native moom.lw __call2662_60(moom.lw a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call2662_61(moom.lw a0) throws Throwable;
private static native void __call2662_62(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call2662_63(int a0) throws Throwable;
private static native void __call2662_64(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call2662_65(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native java.lang.Exception __call1266200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1266201_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c5040f5882740c8d99f6(net.minecraft.client.shader.Framebuffer a0, boolean a1) throws E;
private static final class __SourceHandler_c5040f5882740c8d99f6 {

public static void f2663(net.minecraft.client.shader.Framebuffer receiver, boolean p0) throws Throwable {
    if (__call2663_0()) {
        __call2663_3(__fieldRead2663_1(), __fieldRead2663_2(receiver));
        if (p0) {
        __call2663_6(0, 0, __fieldRead2663_4(receiver), __fieldRead2663_5(receiver));
    }
    }
    return;
}
public static void h2663_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1266300_0(p0);
}
public static void h2663_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1266301_0(p0);
}
private static native boolean __call2663_0() throws Throwable;
private static native int __fieldRead2663_1() throws Throwable;
private static native int __fieldRead2663_2(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2663_3(int a0, int a1) throws Throwable;
private static native int __fieldRead2663_4(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead2663_5(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call2663_6(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1266300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1266301_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_621186f10dd3c8deaa84(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws E;
private static final class __SourceHandler_621186f10dd3c8deaa84 {

public static boolean f1461(net.minecraft.client.shader.Framebuffer receiver, int p0, int p1) throws Throwable {
    forward_join_24: {
    forward_join_16: {
    forward_join_8: {
    forward_join_6: {
    if (!((p0 > 1))) { break forward_join_6; }
    if (!((p1 <= 1))) { break forward_join_8; }
    }
    return false;
    }
    if (!((p0 == __fieldRead1461_0(receiver)))) { break forward_join_16; }
    if (!((p1 != __fieldRead1461_1(receiver)))) { break forward_join_24; }
    }
    __call1461_2(receiver);
    __call1461_3(receiver, p0, p1);
    return true;
    }
    return false;
}
public static void h1461_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1146100_0(p0);
}
public static void h1461_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1146101_0(p0);
}
public static void h1461_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1146102_0(p0);
}
public static void h1461_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1146103_0(p0);
}
private static native int __fieldRead1461_0(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead1461_1(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call1461_2(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call1461_3(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1146100_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1146101_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1146102_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1146103_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_54ddf895a1418ec39794(net.minecraft.client.shader.Framebuffer a0, int a1) throws E;
private static final class __SourceHandler_54ddf895a1418ec39794 {

public static void f100204(net.minecraft.client.shader.Framebuffer receiver, int p0) throws Throwable {
    long life2_3;
    forest_join_37: {
    life2_3 = (__fieldRead100204_0() ^ 93335091584398L);
    if (!(__call100204_1())) {
        break forest_join_37;
    }
    __call100204_3(__fieldRead100204_2(receiver));
    __call100204_6(__invokedynamic100204_4(6444, (6144830837069357634L ^ life2_3)), __invokedynamic100204_5(26337, (7129191582647541133L ^ life2_3)), ((float) p0));
    __call100204_9(__invokedynamic100204_7(6444, (6144830837069357634L ^ life2_3)), __invokedynamic100204_8(15144, (6505148888822710356L ^ life2_3)), ((float) p0));
    __call100204_10(0);
    }
    return;
}
public static void h100204_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call13020400_0(p0);
}
private static native long __fieldRead100204_0() throws Throwable;
private static native boolean __call100204_1() throws Throwable;
private static native int __fieldRead100204_2(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call100204_3(int a0) throws Throwable;
private static native int __invokedynamic100204_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic100204_5(int a0, long a1) throws Throwable;
private static native void __call100204_6(int a0, int a1, float a2) throws Throwable;
private static native int __invokedynamic100204_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic100204_8(int a0, long a1) throws Throwable;
private static native void __call100204_9(int a0, int a1, float a2) throws Throwable;
private static native void __call100204_10(int a0) throws Throwable;
private static native java.lang.Exception __call13020400_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d285b7512f0171b4c0e4(net.minecraft.client.shader.Framebuffer a0, int a1, int a2) throws E;
private static final class __SourceHandler_d285b7512f0171b4c0e4 {

public static void f539(net.minecraft.client.shader.Framebuffer receiver, int p0, int p1) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead539_0() ^ 44251486554278L);
    if ((!__call539_1())) {
        __fieldWrite539_2(receiver, p0);
        __fieldWrite539_3(receiver, p1);
    } else {
        __fieldWrite539_4(receiver, p0);
        __fieldWrite539_5(receiver, p1);
        __fieldWrite539_6(receiver, p0);
        __fieldWrite539_7(receiver, p1);
        __fieldWrite539_9(receiver, __call539_8());
        __fieldWrite539_11(receiver, __call539_10());
        if (__fieldRead539_12(receiver)) {
        __fieldWrite539_14(receiver, __call539_13());
        int spill539_0 = 6444;
        __call539_16(__fieldRead539_15(receiver));
        __call539_20(__invokedynamic539_17(spill539_0, (6144792026643380074L ^ life3_3)), __invokedynamic539_18(31606, (6689188528918222129L ^ life3_3)), __invokedynamic539_19(11755, (1595532544154862513L ^ life3_3)));
        __call539_24(__invokedynamic539_21(6444, (6144792026643380074L ^ life3_3)), __invokedynamic539_22(28371, (7520568548797595784L ^ life3_3)), __invokedynamic539_23(21786, (2713416280524487512L ^ life3_3)));
        __call539_27(__invokedynamic539_25(6444, (6144792026643380074L ^ life3_3)), __invokedynamic539_26(1756, (6728475478086232214L ^ life3_3)), 0);
        __call539_31(__invokedynamic539_28(6444, (6144792026643380074L ^ life3_3)), __invokedynamic539_29(27533, (3108093141365736912L ^ life3_3)), __invokedynamic539_30(18512, (4118028097484711445L ^ life3_3)));
        __call539_35(__invokedynamic539_32(6444, (6144792026643380074L ^ life3_3)), __invokedynamic539_33(4462, (7575343018146971447L ^ life3_3)), __invokedynamic539_34(5404, (3031220326978665309L ^ life3_3)));
        __call539_42(__invokedynamic539_36(6444, (6144792026643380074L ^ life3_3)), 0, __invokedynamic539_37(30600, (6093194606950701511L ^ life3_3)), __fieldRead539_38(receiver), __fieldRead539_39(receiver), 0, __invokedynamic539_40(31080, (4818061642834532133L ^ life3_3)), __invokedynamic539_41(2246, (4292971952001328798L ^ life3_3)), null);
    }
        __call539_44(receiver, __invokedynamic539_43(21786, (2713416280524487512L ^ life3_3)));
        int spill539_1 = 6444;
        __call539_46(__fieldRead539_45(receiver));
        __call539_50(__invokedynamic539_47(spill539_1, (6144792026643380074L ^ life3_3)), __invokedynamic539_48(27533, (3108093141365736912L ^ life3_3)), __invokedynamic539_49(5404, (3031220326978665309L ^ life3_3)));
        __call539_54(__invokedynamic539_51(6444, (6144792026643380074L ^ life3_3)), __invokedynamic539_52(4462, (7575343018146971447L ^ life3_3)), __invokedynamic539_53(5404, (3031220326978665309L ^ life3_3)));
        __call539_62(__invokedynamic539_55(6444, (6144792026643380074L ^ life3_3)), 0, __invokedynamic539_56(29546, (5142171303744855352L ^ life3_3)), __fieldRead539_57(receiver), __fieldRead539_58(receiver), 0, __invokedynamic539_59(15131, (4259296309157729621L ^ life3_3)), __invokedynamic539_60(510, (9200457228056342454L ^ life3_3)), __cast539_61(null));
        __call539_65(__fieldRead539_63(), __fieldRead539_64(receiver));
        __call539_70(__fieldRead539_66(), __fieldRead539_67(), __invokedynamic539_68(6444, (6144792026643380074L ^ life3_3)), __fieldRead539_69(receiver), 0);
        if (__fieldRead539_71(receiver)) {
        __call539_76(__invokedynamic539_72(1499, (7405256501271964555L ^ life3_3)), __invokedynamic539_73(32110, (5885197392330052408L ^ life3_3)), __invokedynamic539_74(6444, (6144792026643380074L ^ life3_3)), __fieldRead539_75(receiver), 0);
    }
        __call539_77(receiver);
    }
    return;
}
public static void h539_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call2053900_0(p0);
}
public static void h539_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call2053901_0(p0);
}
public static void h539_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call2053902_0(p0);
}
private static native long __fieldRead539_0() throws Throwable;
private static native boolean __call539_1() throws Throwable;
private static native void __fieldWrite539_2(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __fieldWrite539_3(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __fieldWrite539_4(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __fieldWrite539_5(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __fieldWrite539_6(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native void __fieldWrite539_7(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __call539_8() throws Throwable;
private static native void __fieldWrite539_9(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __call539_10() throws Throwable;
private static native void __fieldWrite539_11(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native boolean __fieldRead539_12(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __call539_13() throws Throwable;
private static native void __fieldWrite539_14(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __fieldRead539_15(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call539_16(int a0) throws Throwable;
private static native int __invokedynamic539_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_19(int a0, long a1) throws Throwable;
private static native void __call539_20(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic539_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_23(int a0, long a1) throws Throwable;
private static native void __call539_24(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic539_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_26(int a0, long a1) throws Throwable;
private static native void __call539_27(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic539_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_30(int a0, long a1) throws Throwable;
private static native void __call539_31(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic539_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_34(int a0, long a1) throws Throwable;
private static native void __call539_35(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic539_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_37(int a0, long a1) throws Throwable;
private static native int __fieldRead539_38(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead539_39(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __invokedynamic539_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_41(int a0, long a1) throws Throwable;
private static native void __call539_42(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.lang.Object a8) throws Throwable;
private static native int __invokedynamic539_43(int a0, long a1) throws Throwable;
private static native void __call539_44(net.minecraft.client.shader.Framebuffer a0, int a1) throws Throwable;
private static native int __fieldRead539_45(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call539_46(int a0) throws Throwable;
private static native int __invokedynamic539_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_49(int a0, long a1) throws Throwable;
private static native void __call539_50(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic539_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_53(int a0, long a1) throws Throwable;
private static native void __call539_54(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic539_55(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_56(int a0, long a1) throws Throwable;
private static native int __fieldRead539_57(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __fieldRead539_58(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __invokedynamic539_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_60(int a0, long a1) throws Throwable;
private static native java.nio.ByteBuffer __cast539_61(java.lang.Object a0) throws Throwable;
private static native void __call539_62(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.ByteBuffer a8) throws Throwable;
private static native int __fieldRead539_63() throws Throwable;
private static native int __fieldRead539_64(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call539_65(int a0, int a1) throws Throwable;
private static native int __fieldRead539_66() throws Throwable;
private static native int __fieldRead539_67() throws Throwable;
private static native int __invokedynamic539_68(int a0, long a1) throws Throwable;
private static native int __fieldRead539_69(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call539_70(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native boolean __fieldRead539_71(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native int __invokedynamic539_72(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic539_74(int a0, long a1) throws Throwable;
private static native int __fieldRead539_75(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native void __call539_76(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call539_77(net.minecraft.client.shader.Framebuffer a0) throws Throwable;
private static native java.lang.Exception __call2053900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call2053901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call2053902_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fb560d77602e86e19ea1(net.minecraft.client.shader.Framebuffer a0) throws E;
private static final class __SourceHandler_fb560d77602e86e19ea1 {

public static void f248(net.minecraft.client.shader.Framebuffer receiver) throws Throwable {
    int life1_2;
    life1_2 = __call248_1(__fieldRead248_0());
    if ((life1_2 != __fieldRead248_2())) {
        if ((life1_2 == __fieldRead248_3())) {
        throw new java.lang.RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
    }
        if ((life1_2 == __fieldRead248_4())) {
        throw new java.lang.RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
    }
        if ((life1_2 == __fieldRead248_5())) {
        throw new java.lang.RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
    }
        if ((life1_2 == __fieldRead248_6())) {
        throw new java.lang.RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
    }
        throw new java.lang.RuntimeException(__invokedynamic248_7(life1_2));
    }
    return;
}
public static void h248_0(java.lang.Exception p0) throws Throwable {
    throw __call2024800_0(p0);
}
public static void h248_1(java.lang.Exception p0) throws Throwable {
    throw __call2024801_0(p0);
}
public static void h248_2(java.lang.Exception p0) throws Throwable {
    throw __call2024802_0(p0);
}
public static void h248_3(java.lang.Exception p0) throws Throwable {
    throw __call2024803_0(p0);
}
public static void h248_4(java.lang.Exception p0) throws Throwable {
    throw __call2024804_0(p0);
}
public static void h248_5(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    return;
}
private static native int __fieldRead248_0() throws Throwable;
private static native int __call248_1(int a0) throws Throwable;
private static native int __fieldRead248_2() throws Throwable;
private static native int __fieldRead248_3() throws Throwable;
private static native int __fieldRead248_4() throws Throwable;
private static native int __fieldRead248_5() throws Throwable;
private static native int __fieldRead248_6() throws Throwable;
private static native java.lang.String __invokedynamic248_7(int a0) throws Throwable;
private static native java.lang.Exception __call2024800_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2024801_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2024802_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2024803_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2024804_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_9f7beba7a1d5693759e0() throws E;
private static final class __SourceHandler_9f7beba7a1d5693759e0 {

public static int f2668() throws Throwable {
    int life0_1;
    life0_1 = __call2668_0();
    if ((life0_1 == 0)) {
        return 26;
    }
    return 0;
}
public static void h2668_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1266800_0(p0);
}
private static native int __call2668_0() throws Throwable;
private static native java.lang.Exception __call1266800_0(java.lang.RuntimeException a0) throws Throwable;

}


public void b(int p0) { __sourceHandlerCall_54ddf895a1418ec39794(this, p0); }


public static int b() {
return net.minecraft.client.shader.Framebuffer.k;
}


public void b__Void() { __sourceHandlerCall_fb560d77602e86e19ea1(this); }


public void b(int p0, int p1) { __sourceHandlerCall_d285b7512f0171b4c0e4(this, p0, p1); }


public void e() {
try {
        if (net.minecraft.client.renderer.OpenGlHelper.c__Boolean()) {
        net.minecraft.client.renderer.OpenGlHelper.d(((int)(net.minecraft.client.renderer.OpenGlHelper.c)), ((int)(0)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.shader.Framebuffer.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


public static int c() { return __sourceHandlerCall_9f7beba7a1d5693759e0(); }


public void c(int p0, int p1) {
((net.minecraft.client.shader.Framebuffer)(this)).a(((int)(p0)), ((int)(p1)), ((boolean)(true)));
    return;
}


public static void c(int p0) {
k = ((int)(p0));
    return;
}


public void c__Void() {
try {
        if (net.minecraft.client.renderer.OpenGlHelper.c__Boolean()) {
        moom.kZ.i(((int)(this.g)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.shader.Framebuffer.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


public void f() {
long local1 = (net.minecraft.client.shader.Framebuffer.l ^ 104659763469136L);
    ((net.minecraft.client.shader.Framebuffer)(this)).a(((boolean)(true)));
    moom.kZ.a(((float)((this.i)[0])), ((float)((this.i)[1])), ((float)((this.i)[2])), ((float)((this.i)[3])));
    int local3 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic10961_7(4469, (8035056189874416852L ^ local1));
    if (this.e) {
        moom.kZ.a(((double)(0x1.0p0d)));
        local3 = (local3 | __sourceIntrinsic_0e8bb1a2e971_invokedynamic10961_10(15072, (3654386650601097034L ^ local1)));
    }
    moom.kZ.k(((int)(local3)));
    ((net.minecraft.client.shader.Framebuffer)(this)).e();
    return;
}


public void d() {
try {
        if (net.minecraft.client.renderer.OpenGlHelper.c__Boolean()) {
        moom.kZ.i(((int)(0)));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw net.minecraft.client.shader.Framebuffer.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(int p0, int p1) { __sourceHandlerCall_fdb799c8af2bd927665d(this, p0, p1); }


public void a() { __sourceHandlerCall_3af6eec8ed18a378b9c3(this); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21766;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/pA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10965_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/pA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.shader.Framebuffer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, boolean p2) { __sourceHandlerCall_5e17589bccd99a41af59(this, p0, p1, p2); }


public void a(float p0, float p1, float p2, float p3) {
(this.i)[0] = p0;
    (this.i)[1] = p1;
    (this.i)[2] = p2;
    (this.i)[3] = p3;
    return;
}


public boolean a__Boolean(int p0, int p1) { return __sourceHandlerCall_621186f10dd3c8deaa84(this, p0, p1); }


public void a(boolean p0) { __sourceHandlerCall_c5040f5882740c8d99f6(this, p0); }


public void a(int p0) { __sourceHandlerCall_4051ff279bd343c562fe(this, p0); }


public void g() {
long local1 = (net.minecraft.client.shader.Framebuffer.l ^ 17994043721090L);
    moom.kZ.a(((float)((this.i)[0])), ((float)((this.i)[1])), ((float)((this.i)[2])), ((float)((this.i)[3])));
    int local3 = __sourceIntrinsic_5176b1a6fbd6_invokedynamic10970_6(16014, (1749075604599021051L ^ local1));
    if (this.e) {
        moom.kZ.a(((double)(0x1.0p0d)));
        local3 = (local3 | __sourceIntrinsic_5176b1a6fbd6_invokedynamic10970_9(24603, (8716066624402211692L ^ local1)));
    }
    moom.kZ.k(((int)(local3)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10965_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic10961_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic10961_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5176b1a6fbd6_invokedynamic10970_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5176b1a6fbd6_invokedynamic10970_9(int a0, long a1) throws E;
}
