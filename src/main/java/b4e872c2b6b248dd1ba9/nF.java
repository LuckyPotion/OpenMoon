package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nF {

private static final java.nio.FloatBuffer a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public nF() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(1724355875145236052L)), ((long)(-8921503785041866964L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(281277249564480L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.nF.b ^ 99835865208184L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill455_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill455_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill455_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill455_14 = new byte[8];
    (__sourceSpill455_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill455_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation455_16 = __sourceSpill455_14;
    ((javax.crypto.Cipher)(__sourceSpill455_11)).init(((int)(__sourceSpill455_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill455_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation455_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ß\\AÁ§ÉÄ_ý5³j`ïèLwÚç\007km\027ð\032Ü+3D\"}¬lY\017$ûà\034ÊWd=`A"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill455_25 = local6_life21;
        int __sourceSpill455_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill455_25)).substring(((int)(__sourceSpill455_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill455_30 = local8_life19;
        int __sourceSpill455_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill455_33 = new byte[8];
        (__sourceSpill455_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill455_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill455_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill455_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill455_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill455_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill455_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill455_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill455_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill455_34)).doFinal(((byte[])(__sourceSpill455_33)));
        (__sourceSpill455_30)[__sourceSpill455_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "²ª Hÿ!*\007çÐ\016Õ¬í<"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill455_38 = local6_life21;
        int __sourceSpill455_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill455_38)).substring(((int)(__sourceSpill455_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill455_43 = local8_life19;
        int __sourceSpill455_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill455_46 = new byte[8];
        (__sourceSpill455_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill455_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill455_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill455_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill455_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill455_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill455_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill455_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill455_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill455_47)).doFinal(((byte[])(__sourceSpill455_46)));
        (__sourceSpill455_43)[__sourceSpill455_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[8]));
    a = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(4)))));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x241A;
        if (d[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/nF", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nF.d[n2] = n10;
        }
        return d[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2858_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a() {
float forwardValue1027_93_0;
    float forwardValue1027_93_1;
    float forwardValue1027_93_2;
    float forwardValue1027_93_3;
    boolean spill1027_0;
    float spill1027_1;
    float spill1027_2;
    float spill1027_3;
    float spill1027_4;
    long life0_3;
    int life2_8;
    forward_join_94: {
    forward_join_93: {
    life0_3 = (com.moon.nF.b ^ 22723377534182L);
    moom.kZ.u();
    spill1027_0 = com.moon.aO.b__Boolean();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
    life2_8 = ((spill1027_0) ? 1 : 0);
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_6(20181, (4129518923335936352L ^ life0_3)))), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_7(21398, (4911647129443709988L ^ life0_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.t)));
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_10(31612, (3729520478768438474L ^ life0_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.y)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_12(8322, (4055900737573734197L ^ life0_3)))));
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_14(31612, (3729520478768438474L ^ life0_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.C)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_16(1888, (4771529582357504212L ^ life0_3)))));
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_18(31612, (3729520478768438474L ^ life0_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.D)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_20(28430, (2783787222710651070L ^ life0_3)))));
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_22(31612, (3729520478768438474L ^ life0_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.z)), ((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_24(527, (7293327408974521790L ^ life0_3)))));
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_2c8ae721fed4_invokedynamic1027_26(31612, (3729520478768438474L ^ life0_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.A)), ((int)(net.minecraft.client.renderer.OpenGlHelper.x)));
    spill1027_1 = 0x1.0p0f;
    spill1027_2 = 0x1.0p0f;
    spill1027_3 = 0x1.0p0f;
    spill1027_4 = 0x1.0p0f;
    if (!((life2_8 == 0))) {
        forwardValue1027_93_0 = spill1027_1;
        forwardValue1027_93_1 = spill1027_2;
        forwardValue1027_93_2 = spill1027_3;
        forwardValue1027_93_3 = spill1027_4;
        break forward_join_93;
    }
    moom.kZ.c(((float)(spill1027_1)), ((float)(spill1027_2)), ((float)(spill1027_3)), ((float)(spill1027_4)));
    moom.kZ.v();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    if (!(moom.BU.ap())) {
        break forward_join_94;
    }
    forwardValue1027_93_0 = 0x0.0p0f;
    forwardValue1027_93_1 = 0x0.0p0f;
    forwardValue1027_93_2 = 0x0.0p0f;
    forwardValue1027_93_3 = 0x0.0p0f;
    }
    moom.MP.b(((float)(forwardValue1027_93_0)), ((float)(forwardValue1027_93_1)), ((float)(forwardValue1027_93_2)), ((float)(forwardValue1027_93_3)));
    }
    return;
}


public static void a(java.awt.Color p0) {
int forwardValue1028_106_0;
    boolean spill1028_0;
    boolean spill1028_1;
    long life1_3;
    int life3_64;
    forward_join_106: {
    forward_join_90: {
    life1_3 = (com.moon.nF.b ^ 91000864458055L);
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
    moom.kZ.u();
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_93addfd7de2d_invokedynamic1028_6(31612, (3729452684183489899L ^ life1_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.y)), ((int)(net.minecraft.client.renderer.OpenGlHelper.u)));
    org.lwjgl.opengl.GL11.glTexEnvi(((int)(__sourceIntrinsic_93addfd7de2d_invokedynamic1028_10(31612, (3729452684183489899L ^ life1_3)))), ((int)(net.minecraft.client.renderer.OpenGlHelper.z)), ((int)(net.minecraft.client.renderer.OpenGlHelper.w)));
    spill1028_0 = com.moon.aO.b__Boolean();
    ((java.nio.FloatBuffer)(com.moon.nF.a)).position(((int)(0)));
    ((java.nio.FloatBuffer)(com.moon.nF.a)).put(((float)((((float) ((java.awt.Color)(p0)).getRed()) / 0x1.fep7f))));
    ((java.nio.FloatBuffer)(com.moon.nF.a)).put(((float)((((float) ((java.awt.Color)(p0)).getGreen()) / 0x1.fep7f))));
    ((java.nio.FloatBuffer)(com.moon.nF.a)).put(((float)((((float) ((java.awt.Color)(p0)).getBlue()) / 0x1.fep7f))));
    ((java.nio.FloatBuffer)(com.moon.nF.a)).put(((float)((((float) ((java.awt.Color)(p0)).getAlpha()) / 0x1.fep7f))));
    life3_64 = ((spill1028_0) ? 1 : 0);
    spill1028_1 = moom.BU.ap();
    if (!((life3_64 == 0))) {
        forwardValue1028_106_0 = ((spill1028_1) ? 1 : 0);
        break forward_join_106;
    }
    if (!(spill1028_1)) {
        break forward_join_90;
    }
    moom.MP.b(((float)((((float) ((java.awt.Color)(p0)).getRed()) / 0x1.fep7f))), ((float)((((float) ((java.awt.Color)(p0)).getGreen()) / 0x1.fep7f))), ((float)((((float) ((java.awt.Color)(p0)).getBlue()) / 0x1.fep7f))), ((float)((((float) ((java.awt.Color)(p0)).getAlpha()) / 0x1.fep7f))));
    }
    ((java.nio.FloatBuffer)(com.moon.nF.a)).flip();
    org.lwjgl.opengl.GL11.glTexEnv(((int)(__sourceIntrinsic_93addfd7de2d_invokedynamic1028_39(31612, (3729452684183489899L ^ life1_3)))), ((int)(__sourceIntrinsic_93addfd7de2d_invokedynamic1028_40(22248, (6817888752074383610L ^ life1_3)))), ((java.nio.FloatBuffer)(com.moon.nF.a)));
    forwardValue1028_106_0 = net.minecraft.client.renderer.OpenGlHelper.q;
    }
    moom.kZ.g(((int)(forwardValue1028_106_0)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic1027_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93addfd7de2d_invokedynamic1028_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93addfd7de2d_invokedynamic1028_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93addfd7de2d_invokedynamic1028_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93addfd7de2d_invokedynamic1028_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2858_0() throws E;
}
