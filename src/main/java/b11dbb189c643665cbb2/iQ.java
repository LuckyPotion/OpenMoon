package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class iQ {

public float a;

public boolean b;

public boolean c;

public java.util.List<moom.jD> d;

private java.util.Map<java.lang.String, moom.jF> e;

public int f;

public int g;

private static net.minecraft.entity.Entity[] h;

private static long V;

private static long[] X;

private static java.lang.Integer[] Y;

private static java.util.Map Z;

public iQ() { super(); }


private static void __sourceConstructorBody_9f114512cefc0a8f(moom.iQ receiver) throws Throwable {

long local1 = (moom.iQ.V ^ 6339161771789L);

    moom.iQ.__sourceConstructorInit_9f114512cefc0a8f_0(((moom.iQ)(receiver)));

    ((moom.iQ)(receiver)).c = ((boolean)(true));

    ((moom.iQ)(receiver)).d = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.iQ)(receiver)).e = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((moom.iQ)(receiver)).f = ((int)(__sourceIntrinsic_9f114512cefc0a8f_originalDynamicSite2887_7(20681, (8488888656428241939L ^ local1))));

    ((moom.iQ)(receiver)).g = ((int)(__sourceIntrinsic_9f114512cefc0a8f_originalDynamicSite2887_9(2026, (7967654481531585329L ^ local1))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_9f114512cefc0a8f_0(moom.iQ a0) throws E;

static {
V = ((long)(((moom._a)(moom._c.a(((long)(-6298058368401875475L)), ((long)(-6113124010212480036L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96467186177675L)))));
    net.minecraft.entity.Entity[] __sourceSpill878_6 = new net.minecraft.entity.Entity[4];
    Z = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.iQ.V ^ 89069025362833L);
    moom.iQ.b(((net.minecraft.entity.Entity[])(__sourceSpill878_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill878_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill878_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill878_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill878_16 = new byte[8];
    (__sourceSpill878_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill878_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation878_18 = __sourceSpill878_16;
    ((javax.crypto.Cipher)(__sourceSpill878_13)).init(((int)(__sourceSpill878_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill878_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation878_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "}¼_\003HüEÙÄMÉÏ!ª%"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill878_27 = local6_life23;
        int __sourceSpill878_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill878_27)).substring(((int)(__sourceSpill878_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill878_32 = local8_life21;
        int __sourceSpill878_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill878_35 = new byte[8];
        (__sourceSpill878_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill878_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill878_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill878_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill878_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill878_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill878_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill878_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill878_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill878_36)).doFinal(((byte[])(__sourceSpill878_35)));
        (__sourceSpill878_32)[__sourceSpill878_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    X = ((long[])(local8_life21));
    Y = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public static void b(net.minecraft.entity.Entity[] p0) {
h = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return moom.iQ.h;
}


public void a(moom.iQ p0) {
this.a = ((float)(((moom.iQ)(p0)).a));
    this.b = ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.iQ)(p0)).b) ? 1 : 0))));
    this.c = ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.iQ)(p0)).c) ? 1 : 0))));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iQ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8015_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7638;
        if (Y[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = X[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iQ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iQ.Y[n2] = n4;
        }
        return Y[n2];
}


public moom.jD a(java.util.Random p0) {
return ((moom.jD)(((java.util.List)(this.d)).get(((int)(((java.util.Random)(p0)).nextInt(((int)(((java.util.List)(this.d)).size()))))))));
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
return;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
return;
}


protected void a(java.lang.String p0, int p1, int p2) {
((java.util.Map)(this.e)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.jF(p1, p2))));
    return;
}


public moom.jF a(java.lang.String p0) {
return ((moom.jF)(((java.util.Map)(this.e)).get(((java.lang.Object)(p0)))));
}


public static void a(moom.jD p0, moom.jD p1) {
((moom.jD)(p1)).h = ((float)(((moom.jD)(p0)).h));
    ((moom.jD)(p1)).i = ((float)(((moom.jD)(p0)).i));
    ((moom.jD)(p1)).j = ((float)(((moom.jD)(p0)).j));
    ((moom.jD)(p1)).e = ((float)(((moom.jD)(p0)).e));
    ((moom.jD)(p1)).f = ((float)(((moom.jD)(p0)).f));
    ((moom.jD)(p1)).g = ((float)(((moom.jD)(p0)).g));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_9f114512cefc0a8f_originalDynamicSite2887_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f114512cefc0a8f_originalDynamicSite2887_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8015_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
