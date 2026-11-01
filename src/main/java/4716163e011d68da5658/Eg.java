package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Eg {

private static int[] a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public Eg() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1463428317835037635L)), ((long)(-375314168154568935L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81446634163014L)))));
    long local11_life6 = (moom.Eg.b ^ 91931888668196L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill524_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill524_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill524_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill524_14 = new byte[8];
    (__sourceSpill524_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill524_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation524_16 = __sourceSpill524_14;
    ((javax.crypto.Cipher)(__sourceSpill524_11)).init(((int)(__sourceSpill524_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill524_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation524_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[3];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = " ?£iñf÷\\Né½U5éîØ¸Å·"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill524_25 = local4_life21;
        int __sourceSpill524_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill524_25)).substring(((int)(__sourceSpill524_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill524_30 = local6_life19;
        int __sourceSpill524_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill524_33 = new byte[8];
        (__sourceSpill524_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill524_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill524_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill524_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill524_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill524_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill524_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill524_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill524_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill524_34)).doFinal(((byte[])(__sourceSpill524_33)));
        (__sourceSpill524_30)[__sourceSpill524_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    c = ((long[])(local6_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[3]));
    a = ((int[])(new int[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite524_39(2107, (5025046635981795034L ^ local11_life6))]));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5AC2;
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
                throw new RuntimeException("moom/Eg", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Eg.d[n2] = n4;
        }
        return d[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Eg.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4377_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Eg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static int a(double p0, double p1) {
int forwardValue1835_45_0;
    int forwardValue1835_49_0;
    java.lang.String spill1835_0;
    int spill1835_1;
    long life4_3;
    double life2_8;
    java.lang.String life6_9;
    int life7_16;
    int life8_23;
    int life9_33;
    forward_join_49: {
    forward_join_46: {
    forward_join_45: {
    life4_3 = (moom.Eg.b ^ 120359918916972L);
    spill1835_0 = net.minecraft.world.World.c__String();
    life2_8 = (p1 * p0);
    life6_9 = spill1835_0;
    life7_16 = ((int) ((0x1.0p0d - p0) * 0x1.fep7d));
    life8_23 = ((int) ((0x1.0p0d - life2_8) * 0x1.fep7d));
    life9_33 = ((life8_23 << __sourceIntrinsic_84938d2df8ad_invokedynamic1835_2(14791, (3094349139342148716L ^ life4_3))) | life7_16);
    spill1835_1 = life9_33;
    if (!((life6_9 == null))) {
        forwardValue1835_45_0 = spill1835_1;
        break forward_join_45;
    }
    if (!((spill1835_1 > (moom.Eg.a).length))) {
        break forward_join_46;
    }
    forwardValue1835_45_0 = __sourceIntrinsic_84938d2df8ad_invokedynamic1835_4(20979, (5033725577345674331L ^ life4_3));
    }
    forwardValue1835_49_0 = forwardValue1835_45_0;
    break forward_join_49;
    }
    forwardValue1835_49_0 = (moom.Eg.a)[life9_33];
    }
    return forwardValue1835_49_0;
}


public static void a(int[] p0) {
moom.Eg.a = ((int[])(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite524_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4377_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84938d2df8ad_invokedynamic1835_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84938d2df8ad_invokedynamic1835_4(int a0, long a1) throws E;
}
