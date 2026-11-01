package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iB {

private static final moom.ix a;

private static final moom.ix b;

private static final moom.ix c;

private static final moom.ix d;

public static final moom.ix e;

private final moom.iy f;

private final java.util.List<moom.iF> g;

private moom.iz h;

private int i;

private int j;

private static java.lang.String[] k;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public iB(moom.iy p0) {
super();
    this.g = com.google.common.collect.Lists.newArrayList();
    this.h = new moom.iw();
    this.i = -1;
    this.f = p0;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(5408553572181315236L)), ((long)(-1366511078086962576L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(40016888924485L)))));
    java.lang.Object __sourceSpill1285_6 = null;
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.iB.l ^ 12108519161853L);
    moom.iB.b(((java.lang.String[])(__sourceSpill1285_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1285_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1285_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1285_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1285_16 = new byte[8];
    (__sourceSpill1285_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1285_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1285_18 = __sourceSpill1285_16;
    ((javax.crypto.Cipher)(__sourceSpill1285_13)).init(((int)(__sourceSpill1285_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1285_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1285_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "Ý;Þ½º¯\txÏ\fEí×õ"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1285_27 = local6_life23;
        int __sourceSpill1285_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1285_27)).substring(((int)(__sourceSpill1285_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1285_32 = local8_life21;
        int __sourceSpill1285_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1285_35 = new byte[8];
        (__sourceSpill1285_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1285_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1285_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1285_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1285_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1285_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1285_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1285_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1285_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1285_36)).doFinal(((byte[])(__sourceSpill1285_35)));
        (__sourceSpill1285_32)[__sourceSpill1285_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ÿÊ®g7ÍÜð/çÝ\r\0172^ù"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1285_40 = local6_life23;
        int __sourceSpill1285_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1285_40)).substring(((int)(__sourceSpill1285_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1285_45 = local8_life21;
        int __sourceSpill1285_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1285_48 = new byte[8];
        (__sourceSpill1285_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1285_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1285_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1285_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1285_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1285_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1285_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1285_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1285_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1285_49)).doFinal(((byte[])(__sourceSpill1285_48)));
        (__sourceSpill1285_45)[__sourceSpill1285_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    m = ((long[])(local8_life21));
    n = ((java.lang.Integer[])(new java.lang.Integer[4]));
    a = ((moom.ix)(new moom.iD()));
    b = ((moom.ix)(new moom.iE(-1, true)));
    c = ((moom.ix)(new moom.iE(1, true)));
    d = ((moom.ix)(new moom.iE(1, false)));
    e = ((moom.ix)(new moom.iC()));
}


public static void b(java.lang.String[] p0) {
moom.iB.k = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return moom.iB.k;
}


public moom.iF a__iF() {
return new moom.iF(this.h, ((moom.iB)(this)).a__List(), this.i);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7998_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x63FF;
        if (iB.n[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iB", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iB.n[n4] = n6;
        }
        return iB.n[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.iz a__iz() {
return this.h;
}


public moom.ix a__ix() {
return this.a(((int)(this.i)));
}


public java.util.List<moom.ix> a__List() {
long local1 = (moom.iB.l ^ 98887077750569L);
    java.util.ArrayList local3 = com.google.common.collect.Lists.newArrayList();
    int local4 = 0;
    while ((local4 <= __sourceIntrinsic_4b3d0be45f41_invokedynamic7999_2(29061, (8372120644757432529L ^ local1)))) {
        ((java.util.List)(local3)).add(((java.lang.Object)(this.a(((int)(local4))))));
        local4 += 1;
    }
    return local3;
}


public moom.ix a(int p0) {
moom.ix forwardValue3623_67_0;
    long life2_3;
    int life4_14;
    forward_join_67: {
    forward_join_66: {
    forward_join_48: {
    forward_join_39: {
    forward_join_37: {
    forward_join_22: {
    life2_3 = (moom.iB.l ^ 69146522011619L);
    life4_14 = (p0 + (this.j * __sourceIntrinsic_41b36e5fd18a_invokedynamic3623_2(15192, (4628225485906494151L ^ life2_3))));
    if (!((this.j > 0))) {
        break forward_join_22;
    }
    if (!((p0 == 0))) {
        break forward_join_22;
    }
    forwardValue3623_67_0 = moom.iB.b;
    break forward_join_67;
    }
    if (!((p0 == __sourceIntrinsic_41b36e5fd18a_invokedynamic3623_5(14261, (4481919998193094185L ^ life2_3))))) {
        break forward_join_39;
    }
    if (!((life4_14 < ((java.util.List)(((moom.iz)(this.h)).a())).size()))) {
        break forward_join_37;
    }
    forwardValue3623_67_0 = moom.iB.c;
    break forward_join_67;
    }
    forwardValue3623_67_0 = moom.iB.d;
    break forward_join_67;
    }
    if (!((p0 == __sourceIntrinsic_41b36e5fd18a_invokedynamic3623_11(7075, (1262696207741444670L ^ life2_3))))) {
        break forward_join_48;
    }
    forwardValue3623_67_0 = moom.iB.a;
    break forward_join_67;
    }
    if (!((life4_14 >= 0))) {
        break forward_join_66;
    }
    if (!((life4_14 < ((java.util.List)(((moom.iz)(this.h)).a())).size()))) {
        break forward_join_66;
    }
    forwardValue3623_67_0 = ((moom.ix)(com.google.common.base.MoreObjects.firstNonNull(((java.lang.Object)(((moom.ix)(((java.util.List)(((moom.iz)(this.h)).a())).get(((int)(life4_14))))))), ((java.lang.Object)(moom.iB.e)))));
    break forward_join_67;
    }
    forwardValue3623_67_0 = moom.iB.e;
    }
    return forwardValue3623_67_0;
}


public void a(moom.iz p0) {
((java.util.List)(this.g)).add(((java.lang.Object)(((moom.iB)(this)).a__iF())));
    this.h = ((moom.iz)(p0));
    this.i = ((int)(-1));
    this.j = ((int)(0));
    return;
}


public int a() {
return this.i;
}


public void a__Void() {
((moom.iy)(this.f)).a(((moom.iB)(this)));
    return;
}


public void a__Void(int p0) {
moom.ix life2_3;
    forward_join_21: {
    forward_join_18: {
    life2_3 = this.a(((int)(p0)));
    if (!((life2_3 != moom.iB.e))) { break forward_join_21; }
    if (!((this.i == p0))) { break forward_join_18; }
    if (!(((moom.ix)(life2_3)).a__Boolean())) { break forward_join_18; }
    ((moom.ix)(life2_3)).a(((moom.iB)(this)));
    break forward_join_21;
    }
    this.i = ((int)(p0));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7998_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b3d0be45f41_invokedynamic7999_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_41b36e5fd18a_invokedynamic3623_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_41b36e5fd18a_invokedynamic3623_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_41b36e5fd18a_invokedynamic3623_11(int a0, long a1) throws E;
}
