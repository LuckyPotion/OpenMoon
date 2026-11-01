package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GY {

private static int a;

private static final java.util.List<int[]> b;

private static final java.util.List<int[]> c;

private static final java.util.List<int[]> d;

private static final java.util.List<int[]> e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public GY() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(6427007648559424120L)), ((long)(-7910008312208476935L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(93221574621580L)))));
    long local11_life6 = (moom.GY.f ^ 9801775006236L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill555_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill555_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill555_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill555_14 = new byte[8];
    (__sourceSpill555_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill555_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation555_16 = __sourceSpill555_14;
    ((javax.crypto.Cipher)(__sourceSpill555_11)).init(((int)(__sourceSpill555_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill555_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation555_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "æDY\031yh\001õ?9B\032"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill555_25 = local4_life21;
        int __sourceSpill555_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill555_25)).substring(((int)(__sourceSpill555_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill555_30 = local6_life19;
        int __sourceSpill555_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill555_33 = new byte[8];
        (__sourceSpill555_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill555_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill555_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill555_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill555_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill555_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill555_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill555_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill555_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill555_34)).doFinal(((byte[])(__sourceSpill555_33)));
        (__sourceSpill555_30)[__sourceSpill555_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    g = ((long[])(local6_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite555_39(26518, (866405317071801986L ^ local11_life6))));
    b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    c = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    d = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x317D;
        if (h[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/GY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GY.h[n2] = n3;
        }
        return h[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4660_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static synchronized int[] a(int p0) {
java.lang.Object forwardValue2014_39_0;
    int forwardValue2014_51_0;
    int forwardValue2014_51_1;
    int forwardValue2014_71_0;
    java.lang.Object forwardValue2014_87_0;
    int spill2014_0;
    int spill2014_1;
    java.util.List spill2014_2;
    int spill2014_3;
    java.util.List spill2014_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int[] life4_35;
    int[] life4_49;
    int[] life4_72;
    int[] life4_89;
    int[] life4_103;
    forward_join_87: {
    forward_join_81: {
    forward_join_71: {
    forward_join_67: {
    forward_join_51: {
    forward_join_47: {
    forward_join_39: {
    forward_join_33: {
    life1_3 = (moom.GY.f ^ 122456022483704L);
    life3_5 = moom.GD.b();
    spill2014_0 = p0;
    spill2014_1 = __sourceIntrinsic_11c0cdb8aa5e_invokedynamic2014_2(19992, (1174070550269880297L ^ life1_3));
    if (!((life3_5 != null))) {
        forwardValue2014_51_0 = spill2014_0;
        forwardValue2014_51_1 = spill2014_1;
        break forward_join_51;
    }
    if (!((spill2014_0 <= spill2014_1))) {
        break forward_join_47;
    }
    spill2014_2 = moom.GY.b;
    if (!((life3_5 != null))) {
        forwardValue2014_39_0 = spill2014_2;
        break forward_join_39;
    }
    if (!(((java.util.List)(spill2014_2)).isEmpty())) {
        break forward_join_33;
    }
    life4_35 = new int[__sourceIntrinsic_11c0cdb8aa5e_invokedynamic2014_5(26518, (866503939786985062L ^ life1_3))];
    ((java.util.List)(moom.GY.c)).add(((java.lang.Object)(life4_35)));
    return life4_35;
    }
    forwardValue2014_39_0 = ((java.util.List)(moom.GY.b)).remove(((int)((((java.util.List)(moom.GY.b)).size() - 1))));
    }
    life4_49 = ((int[])(forwardValue2014_39_0));
    ((java.util.List)(moom.GY.c)).add(((java.lang.Object)(life4_49)));
    return life4_49;
    }
    spill2014_3 = p0;
    if (!((life3_5 != null))) {
        forwardValue2014_71_0 = spill2014_3;
        break forward_join_71;
    }
    forwardValue2014_51_0 = spill2014_3;
    forwardValue2014_51_1 = moom.GY.a;
    }
    if (!((forwardValue2014_51_0 > forwardValue2014_51_1))) {
        break forward_join_67;
    }
    moom.GY.a = ((int)(p0));
    ((java.util.List)(moom.GY.d)).clear();
    ((java.util.List)(moom.GY.e)).clear();
    life4_72 = new int[moom.GY.a];
    ((java.util.List)(moom.GY.e)).add(((java.lang.Object)(life4_72)));
    return life4_72;
    }
    spill2014_4 = moom.GY.d;
    if (!((life3_5 != null))) {
        forwardValue2014_87_0 = spill2014_4;
        break forward_join_87;
    }
    forwardValue2014_71_0 = ((((java.util.List)(spill2014_4)).isEmpty()) ? 1 : 0);
    }
    if (!((forwardValue2014_71_0 != 0))) {
        break forward_join_81;
    }
    life4_89 = new int[moom.GY.a];
    ((java.util.List)(moom.GY.e)).add(((java.lang.Object)(life4_89)));
    return life4_89;
    }
    forwardValue2014_87_0 = ((java.util.List)(moom.GY.d)).remove(((int)((((java.util.List)(moom.GY.d)).size() - 1))));
    }
    life4_103 = ((int[])(forwardValue2014_87_0));
    ((java.util.List)(moom.GY.e)).add(((java.lang.Object)(life4_103)));
    return life4_103;
}


public static synchronized java.lang.String a() {
return __sourceIntrinsic_63ef3276e4d3_originalDynamicSite1165_8(((java.util.List)(moom.GY.d)).size(), ((java.util.List)(moom.GY.b)).size(), ((java.util.List)(moom.GY.e)).size(), ((java.util.List)(moom.GY.c)).size());
}


public static synchronized void a__Void() {
int forwardValue2015_20_0;
    int forwardValue2015_37_0;
    boolean spill2015_0;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    forward_join_37: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life0_3 = (moom.GY.f ^ 33650684426841L);
    life2_5 = moom.GD.b();
    spill2015_0 = ((java.util.List)(moom.GY.d)).isEmpty();
    if (!((life2_5 != null))) {
        forwardValue2015_20_0 = ((spill2015_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill2015_0))) {
        break forward_join_18;
    }
    ((java.util.List)(moom.GY.d)).remove(((int)((((java.util.List)(moom.GY.d)).size() - 1))));
    }
    forwardValue2015_20_0 = ((((java.util.List)(moom.GY.b)).isEmpty()) ? 1 : 0);
    }
    if (!((life2_5 != null))) {
        forwardValue2015_37_0 = forwardValue2015_20_0;
        break forward_join_37;
    }
    if (!((forwardValue2015_20_0 == 0))) {
        break forward_join_30;
    }
    ((java.util.List)(moom.GY.b)).remove(((int)((((java.util.List)(moom.GY.b)).size() - 1))));
    }
    ((java.util.List)(moom.GY.d)).addAll(((java.util.Collection)(moom.GY.e)));
    forwardValue2015_37_0 = ((((java.util.List)(moom.GY.b)).addAll(((java.util.Collection)(moom.GY.c)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue2015_37_0);
    ((java.util.List)(moom.GY.e)).clear();
    ((java.util.List)(moom.GY.c)).clear();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite555_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4660_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_11c0cdb8aa5e_invokedynamic2014_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_11c0cdb8aa5e_invokedynamic2014_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_originalDynamicSite1165_8(int a0, int a1, int a2, int a3) throws E;
}
