package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nD {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public nD() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(3994656261962728141L)), ((long)(8028359162652588401L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(220810955652841L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.nD.a ^ 75395551121410L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill454_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill454_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill454_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill454_14 = new byte[8];
    (__sourceSpill454_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill454_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation454_16 = __sourceSpill454_14;
    ((javax.crypto.Cipher)(__sourceSpill454_11)).init(((int)(__sourceSpill454_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill454_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation454_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "é\006h¤ç\177ÿÒ\004À§Ö=²\004çrÎ_ÅÃÞ õôFX{\016\036Ûa0w­®,lLk£qÇ¥w"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill454_25 = local6_life21;
        int __sourceSpill454_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill454_25)).substring(((int)(__sourceSpill454_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill454_30 = local8_life19;
        int __sourceSpill454_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill454_33 = new byte[8];
        (__sourceSpill454_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill454_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill454_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill454_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill454_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill454_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill454_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill454_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill454_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill454_34)).doFinal(((byte[])(__sourceSpill454_33)));
        (__sourceSpill454_30)[__sourceSpill454_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "uSòaB7Ø0Á±Â-%ß"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill454_38 = local6_life21;
        int __sourceSpill454_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill454_38)).substring(((int)(__sourceSpill454_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill454_43 = local8_life19;
        int __sourceSpill454_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill454_46 = new byte[8];
        (__sourceSpill454_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill454_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill454_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill454_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill454_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill454_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill454_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill454_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill454_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill454_47)).doFinal(((byte[])(__sourceSpill454_46)));
        (__sourceSpill454_43)[__sourceSpill454_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public static int b(int p0, int p1, double p2) {
long local4 = (com.moon.nD.a ^ 132240414083071L);
    double local6 = (0x1.0p0d - p2);
    int local8 = ((int) ((((double) ((p0 >> __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_1(29921, (1944265864891927478L ^ local4))) & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_2(27585, (4004085698021889171L ^ local4)))) * local6) + (((double) ((p1 >> __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_3(27562, (8747387453483062522L ^ local4))) & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_4(12280, (5945191486456385707L ^ local4)))) * p2)));
    int local9 = ((int) ((((double) ((p0 >> __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_5(6514, (7607170077993592358L ^ local4))) & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_6(12280, (5945191486456385707L ^ local4)))) * local6) + (((double) ((p1 >> __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_7(11702, (3968794884439626467L ^ local4))) & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_8(12280, (5945191486456385707L ^ local4)))) * p2)));
    int local10 = ((int) ((((double) (p0 & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_9(12280, (5945191486456385707L ^ local4)))) * local6) + (((double) (p1 & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_10(12280, (5945191486456385707L ^ local4)))) * p2)));
    int local11 = ((int) ((((double) ((p0 >> __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_11(29395, (8298343543849815426L ^ local4))) & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_12(12280, (5945191486456385707L ^ local4)))) * local6) + (((double) ((p1 >> __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_13(9569, (1685988692605983287L ^ local4))) & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_14(12280, (5945191486456385707L ^ local4)))) * p2)));
    return (((((local11 & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_15(12280, (5945191486456385707L ^ local4))) << __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_16(9569, (1685988692605983287L ^ local4))) | ((local8 & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_17(12280, (5945191486456385707L ^ local4))) << __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_18(27562, (8747387453483062522L ^ local4)))) | ((local9 & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_19(12280, (5945191486456385707L ^ local4))) << __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_20(11702, (3968794884439626467L ^ local4)))) | (local10 & __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_21(12280, (5945191486456385707L ^ local4))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x258A;
        if (c[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/nD", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nD.c[n2] = n10;
        }
        return c[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2848_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int a(int[] p0, double p1) {
int forwardValue1019_24_0;
    int forwardValue1019_36_0;
    double forwardValue1019_52_0;
    double forwardValue1019_52_1;
    boolean spill1019_0;
    int spill1019_1;
    double spill1019_2;
    double spill1019_3;
    long life3_3;
    int life6_7;
    int life5_8;
    double life7_66;
    int life9_69;
    int life10_73;
    int life11_79;
    forward_join_52: {
    forward_join_43: {
    forward_join_36: {
    forward_join_31: {
    forward_join_24: {
    forward_join_21: {
    life3_3 = (com.moon.nD.a ^ 114319178994943L);
    spill1019_0 = com.moon.aO.b__Boolean();
    life6_7 = (p0).length;
    life5_8 = ((spill1019_0) ? 1 : 0);
    spill1019_1 = recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(0x1.0p0d)));
    if (!((life5_8 == 0))) {
        forwardValue1019_24_0 = spill1019_1;
        break forward_join_24;
    }
    if (!((spill1019_1 > 0))) {
        break forward_join_21;
    }
    p1 = (0x1.0p0d - (p1 % 0x1.0p0d));
    }
    forwardValue1019_24_0 = recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(0x1.0p0d)));
    }
    if (!((life5_8 == 0))) {
        forwardValue1019_36_0 = forwardValue1019_24_0;
        break forward_join_36;
    }
    if (!((forwardValue1019_24_0 == 0))) {
        break forward_join_31;
    }
    return (p0)[0];
    }
    spill1019_2 = p1;
    spill1019_3 = 0x0.0p0d;
    if (!((life5_8 == 0))) {
        forwardValue1019_52_0 = spill1019_2;
        forwardValue1019_52_1 = spill1019_3;
        break forward_join_52;
    }
    forwardValue1019_36_0 = recovery.source.CarrierOps.dcmpl(((double)(spill1019_2)), ((double)(spill1019_3)));
    }
    if (!((forwardValue1019_36_0 == 0))) {
        break forward_join_43;
    }
    return (p0)[(life6_7 - 1)];
    }
    forwardValue1019_52_0 = 0x0.0p0d;
    forwardValue1019_52_1 = ((0x1.0p0d - p1) * ((double) (life6_7 - 1)));
    }
    life7_66 = java.lang.Math.max(((double)(forwardValue1019_52_0)), ((double)(forwardValue1019_52_1)));
    life9_69 = ((int) life7_66);
    life10_73 = (p0)[life9_69];
    life11_79 = (p0)[(life9_69 + 1)];
    return com.moon.nD.a(((int)(life10_73)), ((int)(life11_79)), ((double)((life7_66 - ((double) life9_69)))));
}


public static float[] a(int p0) {
long local1 = (com.moon.nD.a ^ 125156652222973L);
    return new float[] {(((float) ((p0 >> __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_1(27562, (8747396866728336120L ^ local1))) & __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_2(12280, (5945202006121307817L ^ local1)))) / 0x1.fep7f), (((float) ((p0 >> __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_3(11702, (3968784504323923169L ^ local1))) & __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_4(12280, (5945202006121307817L ^ local1)))) / 0x1.fep7f), (((float) (p0 & __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_5(12280, (5945202006121307817L ^ local1)))) / 0x1.fep7f), (((float) ((p0 >> __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_6(9569, (1685995913236894773L ^ local1))) & __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_7(12280, (5945202006121307817L ^ local1)))) / 0x1.fep7f)};
}


public static int a(int p0, int p1, double p2) {
int forwardValue1018_22_0;
    int spill1018_0;
    long life4_3;
    int life6_5;
    forward_join_22: {
    forward_join_18: {
    life4_3 = (com.moon.nD.a ^ 85112476764296L);
    life6_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1018_0 = recovery.source.CarrierOps.dcmpl(((double)(p2)), ((double)(0x1.0p0d)));
    if (!((life6_5 == 0))) {
        forwardValue1018_22_0 = spill1018_0;
        break forward_join_22;
    }
    if (!((spill1018_0 > 0))) {
        break forward_join_18;
    }
    p2 = (0x1.0p0d - (p2 % 0x1.0p0d));
    }
    forwardValue1018_22_0 = com.moon.nD.b(((int)(p0)), ((int)(p1)), ((double)(p2)));
    }
    return forwardValue1018_22_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dff47dd0466f_originalDynamicSite567_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2848_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ad7b66b95fb_originalDynamicSite568_7(int a0, long a1) throws E;
}
