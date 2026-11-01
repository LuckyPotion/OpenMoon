package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class N2 {

private static final float[] a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public N2() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-7629443648326643544L)), ((long)(8925957116404521732L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216755098716363L)))));
    long local11_life6 = (moom.N2.b ^ 30054319190790L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1035_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1035_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1035_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1035_14 = new byte[8];
    (__sourceSpill1035_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1035_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1035_16 = __sourceSpill1035_14;
    ((javax.crypto.Cipher)(__sourceSpill1035_11)).init(((int)(__sourceSpill1035_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1035_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1035_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[4];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ø©g³|\n\t\fJ^Ì&p,"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1035_25 = local4_life21;
        int __sourceSpill1035_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1035_25)).substring(((int)(__sourceSpill1035_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1035_30 = local6_life19;
        int __sourceSpill1035_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1035_33 = new byte[8];
        (__sourceSpill1035_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1035_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1035_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1035_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1035_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1035_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1035_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1035_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1035_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1035_34)).doFinal(((byte[])(__sourceSpill1035_33)));
        (__sourceSpill1035_30)[__sourceSpill1035_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Å\034LÁsÕâ]8Q2¡´Ä"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1035_38 = local4_life21;
        int __sourceSpill1035_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1035_38)).substring(((int)(__sourceSpill1035_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1035_43 = local6_life19;
        int __sourceSpill1035_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1035_46 = new byte[8];
        (__sourceSpill1035_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1035_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1035_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1035_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1035_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1035_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1035_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1035_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1035_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1035_47)).doFinal(((byte[])(__sourceSpill1035_46)));
        (__sourceSpill1035_43)[__sourceSpill1035_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    c = ((long[])(local6_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[4]));
    a = ((float[])(new float[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1035_52(11236, (3161737428848083321L ^ local11_life6))]));
    int local13_life54 = 0;
    while ((local13_life54 < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1035_55(11604, (3981826574319814600L ^ local11_life6)))) {
        (moom.N2.a)[local13_life54] = ((float) java.lang.Math.asin(((double)(((((double) local13_life54) / 0x1.fffep14d) - 0x1.0p0d)))));
        local13_life54 += 1;
    }
    local13_life54 = -1;
    while ((local13_life54 < 2)) {
        (moom.N2.a)[(((int) ((((double) local13_life54) + 0x1.0p0d) * 0x1.fffep14d)) & __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1035_59(31650, (6440862336238145852L ^ local11_life6)))] = ((float) java.lang.Math.asin(((double)(((double) local13_life54)))));
        local13_life54 += 1;
    }
}


public static int b(int[] p0) {
int lexicalValue976_14_0;
    int lexicalValue976_39_0;
    int spill976_0;
    int spill976_1;
    long life1_3;
    int life3_5;
    int life4_19;
    int[] life5_21;
    int life6_24;
    int life7_26;
    int life8_33;
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_14: {
    lexical_join_13: {
    life1_3 = (moom.N2.b ^ 85095950417079L);
    life3_5 = moom.Ob.c();
    spill976_0 = (p0).length;
    if (!((life3_5 != 0))) {
        lexicalValue976_14_0 = spill976_0;
        break lexical_join_14;
    }
    if (!((spill976_0 == 0))) {
        break lexical_join_13;
    }
    return 0;
    }
    lexicalValue976_14_0 = 0;
    }
    life4_19 = lexicalValue976_14_0;
    life5_21 = p0;
    life6_24 = (life5_21).length;
    life7_26 = 0;
    lexical_cycle_22: while (true) {
    if (!((life7_26 < life6_24))) {
        break lexical_join_38;
    }
    life8_33 = (life5_21)[life7_26];
    spill976_1 = (life4_19 + life8_33);
    if (!((life3_5 != 0))) {
        lexicalValue976_39_0 = spill976_1;
        break lexical_join_39;
    }
    life4_19 = spill976_1;
    life7_26 += 1;
    if (!((life3_5 == 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue976_39_0 = life4_19;
    }
    return lexicalValue976_39_0;
}


public static float b(float p0) {
long local1 = (moom.N2.b ^ 113327981770948L);
    return (0x1.921fb6p0f - (moom.N2.a)[(((int) (((double) (p0 + 0x1.0p0f)) * 0x1.fffep14d)) & __sourceIntrinsic_0fb642a4098e_originalDynamicSite1335_2(14572, (102618634481031601L ^ local1)))]);
}


public static float c(float p0) {
return ((p0 * 0x1.68p7f) / moom.Dr.b);
}


public static float d(float p0) {
return ((p0 / 0x1.68p7f) * moom.Dr.b);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6503_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/N2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static float a(float p0) {
long local1 = (moom.N2.b ^ 31867262900678L);
    return (moom.N2.a)[(((int) (((double) (p0 + 0x1.0p0f)) * 0x1.fffep14d)) & __sourceIntrinsic_ab368a0e25ae_originalDynamicSite1336_2(14572, (102713022457968819L ^ local1)))];
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5EA2;
        if (d[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = c[n4];
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
                throw new RuntimeException("moom/N2", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            N2.d[n4] = n8;
        }
        return d[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.N2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static int a(int p0) {
int forwardValue2764_18_0;
    int forwardValue2764_18_1;
    int forwardValue2764_19_0;
    int spill2764_0;
    int spill2764_1;
    int spill2764_2;
    long life1_3;
    int life4_7;
    int life3_8;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.N2.b ^ 103770274474887L);
    spill2764_0 = moom.Ob.c();
    life4_7 = moom.Dr.b(((int)(p0)));
    life3_8 = spill2764_0;
    spill2764_1 = p0;
    spill2764_2 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue2764_18_0 = spill2764_1;
        forwardValue2764_18_1 = spill2764_2;
        break forward_join_18;
    }
    if (!((spill2764_1 == spill2764_2))) {
        break forward_join_16;
    }
    forwardValue2764_19_0 = life4_7;
    break forward_join_19;
    }
    forwardValue2764_18_0 = life4_7;
    forwardValue2764_18_1 = 2;
    }
    forwardValue2764_19_0 = (forwardValue2764_18_0 / forwardValue2764_18_1);
    }
    return forwardValue2764_19_0;
}


public static boolean a(float p0, float p1, float p2) {
int forwardValue2763_16_0;
    int forwardValue2763_18_0;
    int spill2763_0;
    long life3_3;
    int life5_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.N2.b ^ 41532003277506L);
    life5_5 = moom.Ob.b();
    spill2763_0 = recovery.source.CarrierOps.fcmpg(((float)(java.lang.Math.abs(((float)((p0 - p1)))))), ((float)(p2)));
    if (!((life5_5 == 0))) {
        forwardValue2763_16_0 = spill2763_0;
        break forward_join_16;
    }
    if (!((spill2763_0 <= 0))) {
        break forward_join_17;
    }
    forwardValue2763_16_0 = 1;
    }
    forwardValue2763_18_0 = forwardValue2763_16_0;
    break forward_join_18;
    }
    forwardValue2763_18_0 = 0;
    }
    return ((forwardValue2763_18_0) != 0);
}


public static int a(int[] p0) {
int forwardValue2765_15_0;
    int spill2765_0;
    long life1_3;
    int life3_5;
    int life4_20;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.N2.b ^ 53601801677687L);
    life3_5 = moom.Ob.c();
    spill2765_0 = (p0).length;
    if (!((life3_5 != 0))) {
        forwardValue2765_15_0 = spill2765_0;
        break forward_join_15;
    }
    if (!((spill2765_0 == 0))) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue2765_15_0 = moom.N2.b(((int[])(p0)));
    }
    life4_20 = forwardValue2765_15_0;
    return (life4_20 / (p0).length);
}


public static float a(double p0) {
return ((float) (((double) java.lang.Math.round(((double)((p0 * 0x1.7d784p26d))))) / 0x1.7d784p26d));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1035_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1035_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1035_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0fb642a4098e_originalDynamicSite1335_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6503_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab368a0e25ae_originalDynamicSite1336_2(int a0, long a1) throws E;
}
