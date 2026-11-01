package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nR {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public nR() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-90587405727713324L)), ((long)(-8486533772756692831L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274898015725041L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.nR.a ^ 54767672678317L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill459_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill459_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill459_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill459_14 = new byte[8];
    (__sourceSpill459_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill459_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation459_16 = __sourceSpill459_14;
    ((javax.crypto.Cipher)(__sourceSpill459_11)).init(((int)(__sourceSpill459_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill459_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation459_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÇàôtM Y2ªäÅÃ!å¨optý{÷u!]lð \031ãÍDV®\n¡B)Ë"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill459_25 = local6_life21;
        int __sourceSpill459_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill459_25)).substring(((int)(__sourceSpill459_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill459_30 = local8_life19;
        int __sourceSpill459_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill459_33 = new byte[8];
        (__sourceSpill459_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill459_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill459_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill459_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill459_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill459_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill459_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill459_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill459_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill459_34)).doFinal(((byte[])(__sourceSpill459_33)));
        (__sourceSpill459_30)[__sourceSpill459_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "mÇ|00©ê²öhOà\036_ª"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill459_38 = local6_life21;
        int __sourceSpill459_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill459_38)).substring(((int)(__sourceSpill459_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill459_43 = local8_life19;
        int __sourceSpill459_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill459_46 = new byte[8];
        (__sourceSpill459_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill459_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill459_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill459_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill459_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill459_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill459_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill459_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill459_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill459_47)).doFinal(((byte[])(__sourceSpill459_46)));
        (__sourceSpill459_43)[__sourceSpill459_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6615;
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
                throw new RuntimeException("com/moon/nR", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nR.c[n2] = n10;
        }
        return c[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nR.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2943_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(float p0, float p1, float p2, float p3, int p4) {
int forwardValue1071_22_0;
    int forwardValue1071_54_0;
    int spill1071_0;
    int spill1071_1;
    int spill1071_2;
    long life5_3;
    int life7_5;
    forward_join_54: {
    forward_join_32: {
    forward_join_22: {
    forward_join_19: {
    life5_3 = (com.moon.nR.a ^ 88963286754169L);
    life7_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1071_0 = recovery.source.CarrierOps.fcmpg(((float)(p2)), ((float)(0x0.0p0f)));
    if (!((life7_5 == 0))) {
        forwardValue1071_22_0 = spill1071_0;
        break forward_join_22;
    }
    if (!((spill1071_0 < 0))) {
        break forward_join_19;
    }
    p2 = (-p2);
    p0 = (p0 - p2);
    }
    forwardValue1071_22_0 = recovery.source.CarrierOps.fcmpg(((float)(p3)), ((float)(0x0.0p0f)));
    }
    if (!((life7_5 == 0))) {
        forwardValue1071_54_0 = forwardValue1071_22_0;
        break forward_join_54;
    }
    if (!((forwardValue1071_22_0 < 0))) {
        break forward_join_32;
    }
    p3 = (-p3);
    p1 = (p1 - p3);
    }
    moom.kZ.l();
    spill1071_1 = 13148;
    moom.kZ.v();
    moom.kZ.a(((int)(__sourceIntrinsic_f10c0b7b81e4_invokedynamic1071_7(spill1071_1, (9020882289833526321L ^ life5_3)))), ((int)(__sourceIntrinsic_f10c0b7b81e4_invokedynamic1071_8(19125, (1134311696536092126L ^ life5_3)))), ((int)(1)), ((int)(0)));
    spill1071_2 = 27808;
    com.moon.nR.a(((int)(p4)));
    forwardValue1071_54_0 = __sourceIntrinsic_f10c0b7b81e4_invokedynamic1071_11(spill1071_2, (7641099779435437006L ^ life5_3));
    }
    org.lwjgl.opengl.GL11.glBegin(((int)(forwardValue1071_54_0)));
    org.lwjgl.opengl.GL11.glVertex2f(((float)(p0)), ((float)((p1 + p3))));
    org.lwjgl.opengl.GL11.glVertex2f(((float)((p0 + p2))), ((float)((p1 + p3))));
    org.lwjgl.opengl.GL11.glVertex2f(((float)((p0 + p2))), ((float)(p1)));
    org.lwjgl.opengl.GL11.glVertex2f(((float)(p0)), ((float)(p1)));
    org.lwjgl.opengl.GL11.glEnd();
    moom.kZ.u();
    moom.kZ.k();
    moom.kZ.D();
    return;
}


public static void a(float p0, float p1, float p2, float p3, float p4, int p5, boolean p6, float p7) {
float forwardValue1070_22_0;
    float forwardValue1070_22_1;
    float forwardValue1070_23_0;
    float forwardValue1070_23_1;
    float forwardValue1070_23_2;
    float forwardValue1070_34_0;
    float forwardValue1070_34_1;
    float forwardValue1070_35_0;
    float forwardValue1070_35_1;
    float forwardValue1070_35_2;
    float forwardValue1070_45_0;
    float forwardValue1070_45_1;
    float forwardValue1070_45_2;
    float forwardValue1070_46_0;
    float forwardValue1070_46_1;
    float forwardValue1070_46_2;
    float forwardValue1070_46_3;
    float forwardValue1070_68_0;
    float forwardValue1070_68_1;
    float forwardValue1070_68_2;
    float forwardValue1070_68_3;
    float forwardValue1070_69_0;
    float forwardValue1070_69_1;
    float forwardValue1070_69_2;
    float forwardValue1070_70_0;
    float forwardValue1070_70_1;
    float forwardValue1070_70_2;
    float forwardValue1070_70_3;
    float forwardValue1070_92_0;
    float forwardValue1070_92_1;
    float forwardValue1070_92_2;
    float forwardValue1070_92_3;
    float forwardValue1070_93_0;
    float forwardValue1070_93_1;
    float forwardValue1070_93_2;
    float forwardValue1070_93_3;
    float forwardValue1070_93_4;
    float forwardValue1070_108_0;
    float forwardValue1070_108_1;
    float forwardValue1070_108_2;
    float forwardValue1070_108_3;
    float forwardValue1070_109_0;
    float forwardValue1070_109_1;
    float forwardValue1070_109_2;
    float forwardValue1070_109_3;
    float forwardValue1070_109_4;
    boolean spill1070_0;
    float spill1070_1;
    float spill1070_2;
    float spill1070_3;
    float spill1070_4;
    float spill1070_5;
    float spill1070_6;
    float spill1070_7;
    float spill1070_8;
    float spill1070_9;
    float spill1070_10;
    float spill1070_11;
    float spill1070_12;
    float spill1070_13;
    float spill1070_14;
    float spill1070_15;
    float spill1070_16;
    float spill1070_17;
    float spill1070_18;
    float spill1070_19;
    float spill1070_20;
    float spill1070_21;
    float spill1070_22;
    long life8_3;
    float life11_7;
    float life12_12;
    int life10_13;
    float life13_27;
    float life14_41;
    forward_join_133: {
    forward_join_109: {
    forward_join_108: {
    forward_join_93: {
    forward_join_92: {
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_46: {
    forward_join_45: {
    forward_join_35: {
    forward_join_34: {
    forward_join_23: {
    forward_join_22: {
    life8_3 = (com.moon.nR.a ^ 33651932317309L);
    life11_7 = (p2 / 0x1.0p2f);
    spill1070_0 = com.moon.aO.b__Boolean();
    life12_12 = (p3 / 0x1.0p2f);
    life10_13 = ((spill1070_0) ? 1 : 0);
    spill1070_1 = (p0 + p2);
    spill1070_2 = life11_7;
    if (!(p6)) {
        forwardValue1070_22_0 = spill1070_1;
        forwardValue1070_22_1 = spill1070_2;
        break forward_join_22;
    }
    forwardValue1070_23_0 = spill1070_1;
    forwardValue1070_23_1 = spill1070_2;
    forwardValue1070_23_2 = p7;
    break forward_join_23;
    }
    forwardValue1070_23_0 = forwardValue1070_22_0;
    forwardValue1070_23_1 = forwardValue1070_22_1;
    forwardValue1070_23_2 = 0x0.0p0f;
    }
    life13_27 = (forwardValue1070_23_0 - (forwardValue1070_23_1 + forwardValue1070_23_2));
    spill1070_3 = (p1 + p3);
    spill1070_4 = life12_12;
    if (!(p6)) {
        forwardValue1070_34_0 = spill1070_3;
        forwardValue1070_34_1 = spill1070_4;
        break forward_join_34;
    }
    forwardValue1070_35_0 = spill1070_3;
    forwardValue1070_35_1 = spill1070_4;
    forwardValue1070_35_2 = p7;
    break forward_join_35;
    }
    forwardValue1070_35_0 = forwardValue1070_34_0;
    forwardValue1070_35_1 = forwardValue1070_34_1;
    forwardValue1070_35_2 = 0x0.0p0f;
    }
    life14_41 = (forwardValue1070_35_0 - (forwardValue1070_35_1 + forwardValue1070_35_2));
    spill1070_5 = p0;
    spill1070_6 = p1;
    spill1070_7 = life11_7;
    if (!(p6)) {
        forwardValue1070_45_0 = spill1070_5;
        forwardValue1070_45_1 = spill1070_6;
        forwardValue1070_45_2 = spill1070_7;
        break forward_join_45;
    }
    forwardValue1070_46_0 = spill1070_5;
    forwardValue1070_46_1 = spill1070_6;
    forwardValue1070_46_2 = spill1070_7;
    forwardValue1070_46_3 = p7;
    break forward_join_46;
    }
    forwardValue1070_46_0 = forwardValue1070_45_0;
    forwardValue1070_46_1 = forwardValue1070_45_1;
    forwardValue1070_46_2 = forwardValue1070_45_2;
    forwardValue1070_46_3 = 0x0.0p0f;
    }
    com.moon.nR.a(((float)(forwardValue1070_46_0)), ((float)(forwardValue1070_46_1)), ((float)((forwardValue1070_46_2 + forwardValue1070_46_3))), ((float)(p4)), ((int)(p5)));
    spill1070_8 = life13_27;
    spill1070_9 = p1;
    spill1070_10 = life11_7;
    spill1070_11 = p4;
    if (!((life10_13 == 0))) {
        forwardValue1070_68_0 = spill1070_8;
        forwardValue1070_68_1 = spill1070_9;
        forwardValue1070_68_2 = spill1070_10;
        forwardValue1070_68_3 = spill1070_11;
        break forward_join_68;
    }
    com.moon.nR.a(((float)(spill1070_8)), ((float)(spill1070_9)), ((float)(spill1070_10)), ((float)(spill1070_11)), ((int)(p5)));
    spill1070_12 = p0;
    spill1070_13 = ((p1 + p3) - p4);
    spill1070_14 = life11_7;
    if (!(p6)) {
        forwardValue1070_69_0 = spill1070_12;
        forwardValue1070_69_1 = spill1070_13;
        forwardValue1070_69_2 = spill1070_14;
        break forward_join_69;
    }
    forwardValue1070_68_0 = spill1070_12;
    forwardValue1070_68_1 = spill1070_13;
    forwardValue1070_68_2 = spill1070_14;
    forwardValue1070_68_3 = p7;
    }
    forwardValue1070_70_0 = forwardValue1070_68_0;
    forwardValue1070_70_1 = forwardValue1070_68_1;
    forwardValue1070_70_2 = forwardValue1070_68_2;
    forwardValue1070_70_3 = forwardValue1070_68_3;
    break forward_join_70;
    }
    forwardValue1070_70_0 = forwardValue1070_69_0;
    forwardValue1070_70_1 = forwardValue1070_69_1;
    forwardValue1070_70_2 = forwardValue1070_69_2;
    forwardValue1070_70_3 = 0x0.0p0f;
    }
    com.moon.nR.a(((float)(forwardValue1070_70_0)), ((float)(forwardValue1070_70_1)), ((float)((forwardValue1070_70_2 + forwardValue1070_70_3))), ((float)(p4)), ((int)(p5)));
    com.moon.nR.a(((float)(life13_27)), ((float)(((p1 + p3) - p4))), ((float)(life11_7)), ((float)(p4)), ((int)(p5)));
    spill1070_15 = p0;
    spill1070_16 = p1;
    spill1070_17 = p4;
    spill1070_18 = life12_12;
    if (!(p6)) {
        forwardValue1070_92_0 = spill1070_15;
        forwardValue1070_92_1 = spill1070_16;
        forwardValue1070_92_2 = spill1070_17;
        forwardValue1070_92_3 = spill1070_18;
        break forward_join_92;
    }
    forwardValue1070_93_0 = spill1070_15;
    forwardValue1070_93_1 = spill1070_16;
    forwardValue1070_93_2 = spill1070_17;
    forwardValue1070_93_3 = spill1070_18;
    forwardValue1070_93_4 = p7;
    break forward_join_93;
    }
    forwardValue1070_93_0 = forwardValue1070_92_0;
    forwardValue1070_93_1 = forwardValue1070_92_1;
    forwardValue1070_93_2 = forwardValue1070_92_2;
    forwardValue1070_93_3 = forwardValue1070_92_3;
    forwardValue1070_93_4 = 0x0.0p0f;
    }
    com.moon.nR.a(((float)(forwardValue1070_93_0)), ((float)(forwardValue1070_93_1)), ((float)(forwardValue1070_93_2)), ((float)((forwardValue1070_93_3 + forwardValue1070_93_4))), ((int)(p5)));
    spill1070_19 = ((p0 + p2) - p4);
    spill1070_20 = p1;
    spill1070_21 = p4;
    spill1070_22 = life12_12;
    if (!(p6)) {
        forwardValue1070_108_0 = spill1070_19;
        forwardValue1070_108_1 = spill1070_20;
        forwardValue1070_108_2 = spill1070_21;
        forwardValue1070_108_3 = spill1070_22;
        break forward_join_108;
    }
    forwardValue1070_109_0 = spill1070_19;
    forwardValue1070_109_1 = spill1070_20;
    forwardValue1070_109_2 = spill1070_21;
    forwardValue1070_109_3 = spill1070_22;
    forwardValue1070_109_4 = p7;
    break forward_join_109;
    }
    forwardValue1070_109_0 = forwardValue1070_108_0;
    forwardValue1070_109_1 = forwardValue1070_108_1;
    forwardValue1070_109_2 = forwardValue1070_108_2;
    forwardValue1070_109_3 = forwardValue1070_108_3;
    forwardValue1070_109_4 = 0x0.0p0f;
    }
    com.moon.nR.a(((float)(forwardValue1070_109_0)), ((float)(forwardValue1070_109_1)), ((float)(forwardValue1070_109_2)), ((float)((forwardValue1070_109_3 + forwardValue1070_109_4))), ((int)(p5)));
    com.moon.nR.a(((float)(p0)), ((float)(life14_41)), ((float)(p4)), ((float)(life12_12)), ((int)(p5)));
    com.moon.nR.a(((float)(((p0 + p2) - p4))), ((float)(life14_41)), ((float)(p4)), ((float)(life12_12)), ((int)(p5)));
    if (!((life10_13 != 0))) {
        break forward_join_133;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public static void a(int p0) {
long local1_life2 = (com.moon.nR.a ^ 63852823085581L);
    float local3_life8 = (((float) ((p0 >> __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_4(23678, (3911693939845253728L ^ local1_life2))) & __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_6(5959, (4248924286467768671L ^ local1_life2)))) / 1132396544);
    float local4_life14 = (((float) ((p0 >> __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_10(20785, (937970257962649388L ^ local1_life2))) & __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_12(7177, (5065791181626935829L ^ local1_life2)))) / 1132396544);
    float local5_life18 = (((float) (p0 & __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_16(7177, (5065791181626935829L ^ local1_life2)))) / 1132396544);
    float local6_life24 = (((float) ((p0 >> __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_20(28300, (1627370424317671575L ^ local1_life2))) & __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_22(7177, (5065791181626935829L ^ local1_life2)))) / 1132396544);
    org.lwjgl.opengl.GL11.glColor4f(((float)(local3_life8)), ((float)(local4_life14)), ((float)(local5_life18)), ((float)(local6_life24)));
    return;
}


public static double a(double p0, double p1, double p2) {
return (p1 + ((p0 - p1) * p2));
}


private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic1071_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic1071_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic1071_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite190_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2943_0() throws E;
}
