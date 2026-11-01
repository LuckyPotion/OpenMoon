package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class DE extends moom.DD {

private java.lang.String d;

private static int e;

private static long f;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public DE(java.lang.String p0, java.lang.String p1) { this(0, (java.lang.String[])null); }


private static void __sourceConstructorBody_f05cbed17dca2f60(moom.DE receiver, java.lang.String p0, java.lang.String p1) throws Throwable {

long local3_life2 = (moom.DE.f ^ 51312916073691L);

    moom.DE.__sourceConstructorInit_f05cbed17dca2f60_0(((moom.DE)(receiver)), ((int)(0)), ((java.lang.String[])(moom.DE.b(((java.lang.String)(__sourceIntrinsic_f05cbed17dca2f60_originalDynamicSite363_3(p0, ((p1 == null) ? "normal" : p1))))))));

    return;

}



public DE(moom.DD p0, java.lang.String p1) {
this(((java.lang.String)(((moom.DD)(p0)).toString())), ((java.lang.String)(p1)));
    return;
}


public DE(java.lang.String p0) {
this(((int)(0)), ((java.lang.String[])(moom.DE.b(((java.lang.String)(p0))))));
    return;
}


protected DE(int p0, java.lang.String[] p1) { super(0, (java.lang.String[])null); }


private static void __sourceConstructorBody_f857dec50918c605(moom.DE receiver, int p0, java.lang.String[] p1) throws Throwable {

long local3 = (moom.DE.f ^ 34584604775944L);

    moom.DE.__sourceConstructorInit_f857dec50918c605_0(((moom.DE)(receiver)), ((int)(0)), ((java.lang.String[])(new java.lang.String[] {(p1)[0], (p1)[1]})));

    ((moom.DE)(receiver)).d = ((java.lang.String)((org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)((p1)[2]))) ? "normal" : ((java.lang.String)((p1)[2])).toLowerCase())));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(-3434846458144887917L)), ((long)(7110258441374248516L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239458903571594L)))));
    int __sourceSpill511_6 = 0;
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.DE.f ^ 105753758677486L);
    moom.DE.b(((int)(__sourceSpill511_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill511_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill511_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill511_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill511_16 = new byte[8];
    (__sourceSpill511_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill511_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation511_18 = __sourceSpill511_16;
    ((javax.crypto.Cipher)(__sourceSpill511_13)).init(((int)(__sourceSpill511_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill511_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation511_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "°TsÔLä`Z\034Í ìE"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill511_27 = local6_life23;
        int __sourceSpill511_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill511_27)).substring(((int)(__sourceSpill511_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill511_32 = local8_life21;
        int __sourceSpill511_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill511_35 = new byte[8];
        (__sourceSpill511_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill511_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill511_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill511_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill511_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill511_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill511_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill511_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill511_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill511_36)).doFinal(((byte[])(__sourceSpill511_35)));
        (__sourceSpill511_32)[__sourceSpill511_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    k = ((long[])(local8_life21));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_f857dec50918c605_0(moom.DE a0, int a1, java.lang.String[] a2) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_f05cbed17dca2f60_0(moom.DE a0, int a1, java.lang.String[] a2) throws E;

public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue1691_14_0;
    int forwardValue1691_34_0;
    moom.DE spill1691_0;
    int spill1691_1;
    boolean spill1691_2;
    long life2_3;
    int life4_5;
    moom.DE life5_28;
    forward_join_34: {
    forward_join_33: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.DE.f ^ 137928829560618L);
    life4_5 = moom.DE.c();
    spill1691_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue1691_14_0 = spill1691_0;
        break forward_join_14;
    }
    if (!((spill1691_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue1691_14_0 = p0;
    }
    spill1691_1 = ((forwardValue1691_14_0 instanceof moom.DE) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue1691_34_0 = spill1691_1;
        break forward_join_34;
    }
    if (!((spill1691_1 != 0))) {
        break forward_join_33;
    }
    life5_28 = ((moom.DE)(p0));
    spill1691_2 = super.equals(((java.lang.Object)(p0)));
    if (!((life4_5 != 0))) {
        forwardValue1691_34_0 = ((spill1691_2) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill1691_2)) {
        break forward_join_33;
    }
    return ((java.lang.String)(this.d)).equals(((java.lang.Object)(((moom.DE)(life5_28)).d)));
    }
    forwardValue1691_34_0 = 0;
    }
    return ((forwardValue1691_34_0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1104_2(super.toString(), this.d);
}


public int hashCode() {
long local1 = (moom.DE.f ^ 41557391462705L);
    return ((__sourceIntrinsic_1861091996aa_originalDynamicSite1105_1(20590, (212451484868590012L ^ local1)) * super.hashCode()) + ((java.lang.String)(this.d)).hashCode());
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x62AD;
        if (DE.l[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DE.l[n2] = n3;
        }
        return DE.l[n2];
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected static java.lang.String[] b(java.lang.String p0) {
long local1 = (moom.DE.f ^ 42656459167954L);
    java.lang.String[] local3 = new java.lang.String[] {null, p0, null};
    int local4 = ((java.lang.String)(p0)).indexOf(((int)(__sourceIntrinsic_c6b3684c79b1_invokedynamic4163_1(8256, (2188689249869529200L ^ local1)))));
    java.lang.String local5 = p0;
    if ((local4 >= 0)) {
        (local3)[2] = ((java.lang.String)(p0)).substring(((int)((local4 + 1))));
        if ((local4 > 1)) {
        local5 = ((java.lang.String)(p0)).substring(((int)(0)), ((int)(local4)));
    }
    }
    java.lang.System.arraycopy(((java.lang.Object)(moom.DD.a(((java.lang.String)(local5))))), ((int)(0)), ((java.lang.Object)(local3)), ((int)(0)), ((int)(2)));
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.DE.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4164_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/DE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void b(int p0) {
e = ((int)(p0));
    return;
}


public static int b__sourceReturn_8abf5c6871() {
return moom.DE.e;
}


public java.lang.String c__String() {
return this.d;
}


public static int c() {
int local0 = __sourceExactCall_5c5d6a17b3677f();
    if ((local0 == 0)) {
        return 105;
    }
    return 0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f05cbed17dca2f60_originalDynamicSite363_3(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6b3684c79b1_invokedynamic4163_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4164_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1105_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1104_2(java.lang.String a0, java.lang.String a1) throws E;

private static native int __sourceExactCall_5c5d6a17b3677f();
}
