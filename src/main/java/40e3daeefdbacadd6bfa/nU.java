package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nU {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public nU() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(4018916263776453829L)), ((long)(-5735363721508309844L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(262792040820283L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.nU.a ^ 70039076565738L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill460_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill460_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill460_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill460_14 = new byte[8];
    (__sourceSpill460_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill460_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation460_16 = __sourceSpill460_14;
    ((javax.crypto.Cipher)(__sourceSpill460_11)).init(((int)(__sourceSpill460_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill460_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation460_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ïF\037.s|9ô;\002\004ík¢ü\036Ø\f\037_óCÈ+dW¦\016ÿz#\004â\030\002kÂ£ÍÈ\t£­óåÙ2\032jr¦\031vfX×eÄ`L¦"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill460_25 = local6_life21;
        int __sourceSpill460_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill460_25)).substring(((int)(__sourceSpill460_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill460_30 = local8_life19;
        int __sourceSpill460_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill460_33 = new byte[8];
        (__sourceSpill460_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill460_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill460_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill460_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill460_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill460_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill460_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill460_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill460_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill460_34)).doFinal(((byte[])(__sourceSpill460_33)));
        (__sourceSpill460_30)[__sourceSpill460_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¼\031cbÐÅÒ\024\027\017\\vì·"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill460_38 = local6_life21;
        int __sourceSpill460_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill460_38)).substring(((int)(__sourceSpill460_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill460_43 = local8_life19;
        int __sourceSpill460_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill460_46 = new byte[8];
        (__sourceSpill460_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill460_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill460_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill460_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill460_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill460_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill460_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill460_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill460_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill460_47)).doFinal(((byte[])(__sourceSpill460_46)));
        (__sourceSpill460_43)[__sourceSpill460_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[11]));
}


public static void b(boolean p0) {
int forwardValue1074_16_0;
    int forwardValue1074_22_0;
    boolean spill1074_0;
    boolean spill1074_1;
    long life1_3;
    int life3_6;
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (com.moon.nU.a ^ 56991534355551L);
    spill1074_0 = com.moon.aO.c();
    moom.kZ.l();
    life3_6 = ((spill1074_0) ? 1 : 0);
    spill1074_1 = p0;
    if (!((life3_6 != 0))) {
        forwardValue1074_16_0 = ((spill1074_1) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill1074_1)) {
        break forward_join_17;
    }
    forwardValue1074_16_0 = __sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_5(10190, (2566438336730456076L ^ life1_3));
    }
    forwardValue1074_22_0 = forwardValue1074_16_0;
    break forward_join_22;
    }
    forwardValue1074_22_0 = __sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_6(32435, (463960222063901052L ^ life1_3));
    }
    org.lwjgl.opengl.GL11.glStencilFunc(((int)(forwardValue1074_22_0)), ((int)(1)), ((int)(1)));
    org.lwjgl.opengl.GL11.glStencilOp(((int)(__sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_8(28489, (6735054978345543813L ^ life1_3)))), ((int)(__sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_9(28489, (6735054978345543813L ^ life1_3)))), ((int)(__sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_10(28489, (6735054978345543813L ^ life1_3)))));
    moom.kZ.a(((boolean)(true)), ((boolean)(true)), ((boolean)(true)), ((boolean)(true)));
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6B53;
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
                throw new RuntimeException("com/moon/nU", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nU.c[n2] = n10;
        }
        return c[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2948_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(boolean p0) {
int forwardValue1073_49_0;
    boolean spill1073_0;
    boolean spill1073_1;
    long life1_3;
    int life3_43;
    forward_join_53: {
    forward_join_49: {
    life1_3 = (com.moon.nU.a ^ 6738264940836L);
    org.lwjgl.opengl.GL11.glClearStencil(((int)(0)));
    spill1073_0 = com.moon.aO.c();
    org.lwjgl.opengl.GL11.glClear(((int)(__sourceIntrinsic_de95174e7612_invokedynamic1073_3(20862, (2004906489418408902L ^ life1_3)))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_de95174e7612_invokedynamic1073_5(26331, (5205220637137425511L ^ life1_3)))));
    org.lwjgl.opengl.GL11.glStencilFunc(((int)(__sourceIntrinsic_de95174e7612_invokedynamic1073_7(6161, (8971342698403146412L ^ life1_3)))), ((int)(1)), ((int)(1)));
    org.lwjgl.opengl.GL11.glStencilOp(((int)(__sourceIntrinsic_de95174e7612_invokedynamic1073_9(28078, (3039016753559068433L ^ life1_3)))), ((int)(__sourceIntrinsic_de95174e7612_invokedynamic1073_10(28489, (6735006953930055166L ^ life1_3)))), ((int)(__sourceIntrinsic_de95174e7612_invokedynamic1073_11(7140, (8644526517820795226L ^ life1_3)))));
    life3_43 = ((spill1073_0) ? 1 : 0);
    spill1073_1 = p0;
    if (!((life3_43 != 0))) {
        forwardValue1073_49_0 = ((spill1073_1) ? 1 : 0);
        break forward_join_49;
    }
    if (!((!spill1073_1))) {
        break forward_join_53;
    }
    forwardValue1073_49_0 = 0;
    }
    moom.kZ.a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1073_49_0))), ((boolean)(false)), ((boolean)(false)), ((boolean)(false)));
    }
    return;
}


public static void a() {
long local0_life2 = (com.moon.nU.a ^ 111253682193904L);
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite191_5(5190, (4161273501747167784L ^ local0_life2)))), ((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite191_7(28372, (4955723849213917371L ^ local0_life2)))));
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite191_10(7472, (4669952764175928146L ^ local0_life2)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite191_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite191_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite191_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2948_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic1073_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic1073_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic1073_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic1073_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic1073_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic1073_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c2a0b2dd952_invokedynamic1074_10(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
