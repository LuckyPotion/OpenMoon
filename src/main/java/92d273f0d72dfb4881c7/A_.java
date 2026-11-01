package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class A_ implements java.lang.Comparable<moom.A_> {

public double a;

public double b;

public java.lang.String c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public A_(java.lang.String p0, double p1, double p2) {
super();
    this.c = p0;
    this.a = p1;
    this.b = p2;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-2899570382947044771L)), ((long)(-3958843338470535752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128394901762409L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.A_.d ^ 91297525186909L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill474_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill474_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill474_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill474_14 = new byte[8];
    (__sourceSpill474_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill474_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation474_16 = __sourceSpill474_14;
    ((javax.crypto.Cipher)(__sourceSpill474_11)).init(((int)(__sourceSpill474_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill474_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation474_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ýÝ»©Õ«½þW\022|ùøH"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill474_25 = local6_life21;
        int __sourceSpill474_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill474_25)).substring(((int)(__sourceSpill474_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill474_30 = local8_life19;
        int __sourceSpill474_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill474_33 = new byte[8];
        (__sourceSpill474_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill474_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill474_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill474_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill474_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill474_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill474_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill474_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill474_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill474_34)).doFinal(((byte[])(__sourceSpill474_33)));
        (__sourceSpill474_30)[__sourceSpill474_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((moom.A_)(this)).a(((moom.A_)(((moom.A_)(p0)))));
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2A89;
        if (f[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = e[n4];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/A_", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            A_.f[n4] = n6;
        }
        return f[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.A_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3703_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/A_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(moom.A_ p0) {
int forwardValue1458_23_0;
    moom.A_ forwardValue1458_27_0;
    int forwardValue1458_31_0;
    int spill1458_0;
    moom.A_ spill1458_1;
    long life2_3;
    int[] life4_5;
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    forward_join_23: {
    forward_join_16: {
    life2_3 = (moom.A_.d ^ 134257230898308L);
    life4_5 = moom.A9.b__ArrayInt();
    spill1458_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.A_)(p0)).a)), ((double)(this.a)));
    if (!((life4_5 != null))) {
        forwardValue1458_23_0 = spill1458_0;
        break forward_join_23;
    }
    if (!((spill1458_0 < 0))) {
        break forward_join_16;
    }
    forwardValue1458_31_0 = -1;
    break forward_join_31;
    }
    spill1458_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue1458_27_0 = spill1458_1;
        break forward_join_27;
    }
    forwardValue1458_23_0 = recovery.source.CarrierOps.dcmpl(((double)(((moom.A_)(spill1458_1)).a)), ((double)(this.a)));
    }
    if (!((forwardValue1458_23_0 > 0))) {
        break forward_join_26;
    }
    forwardValue1458_31_0 = 1;
    break forward_join_31;
    }
    forwardValue1458_27_0 = p0;
    }
    forwardValue1458_31_0 = ((java.lang.String)(((moom.A_)(forwardValue1458_27_0)).c)).compareTo(((java.lang.String)(this.c)));
    }
    return forwardValue1458_31_0;
}


public int a() {
long local1 = (moom.A_.d ^ 55972575199427L);
    return ((((java.lang.String)(this.c)).hashCode() & __sourceIntrinsic_8aebf151eadb_originalDynamicSite1053_3(7811, (8482244513477134270L ^ local1))) + __sourceIntrinsic_8aebf151eadb_originalDynamicSite1053_4(3906, (2389544902853596798L ^ local1)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3703_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1053_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1053_4(int a0, long a1) throws E;

public int compareTo(moom.A_ __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }
}
