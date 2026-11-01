package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GN extends moom.GD {

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public GN(long p0, moom.GD p1) {
super(p0);
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(7602549990486544952L)), ((long)(3226094301291439089L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193186170252906L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.GN.f ^ 18700305777433L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill552_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill552_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill552_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill552_14 = new byte[8];
    (__sourceSpill552_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill552_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation552_16 = __sourceSpill552_14;
    ((javax.crypto.Cipher)(__sourceSpill552_11)).init(((int)(__sourceSpill552_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill552_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation552_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "õ¹m,7Q\\ÊNOEî\035àî\026"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill552_25 = local6_life21;
        int __sourceSpill552_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill552_25)).substring(((int)(__sourceSpill552_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill552_30 = local8_life19;
        int __sourceSpill552_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill552_33 = new byte[8];
        (__sourceSpill552_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill552_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill552_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill552_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill552_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill552_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill552_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill552_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill552_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill552_34)).doFinal(((byte[])(__sourceSpill552_33)));
        (__sourceSpill552_30)[__sourceSpill552_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2428;
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
                throw new RuntimeException("moom/GN", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GN.h[n2] = n3;
        }
        return h[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4644_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue648_30_0;
    int forestValue648_74_0;
    net.minecraft.entity.Entity[] spill648_0;
    int spill648_1;
    long life5_3;
    int[] life8_19;
    int[] life9_24;
    int life10_27;
    net.minecraft.entity.Entity[] life7_28;
    int life11_33;
    int life12_60;
    forest_join_118: {
    life5_3 = (moom.GN.f ^ 46855791625884L);
    life8_19 = ((moom.GD)(((moom.GN)(this)).b)).a__ArrayInt(((int)((p0 - 1))), ((int)((p1 - 1))), ((int)((p2 + 2))), ((int)((p3 + 2))));
    life9_24 = moom.GY.a(((int)((p2 * p3))));
    spill648_0 = moom.GD.b();
    life10_27 = 0;
    life7_28 = spill648_0;
    forest_cycle_29: while (true) {
    forest_join_115: {
    forestValue648_30_0 = life10_27;
    forest_cycle_30: while (true) {
    if (!((forestValue648_30_0 < p3))) {
        break forest_join_118;
    }
    life11_33 = 0;
    forest_cycle_34: while (true) {
    forest_join_112: {
    forest_join_104: {
    forest_join_94: {
    forest_join_74: {
    if (!((life11_33 < p2))) {
        break forest_join_115;
    }
    ((moom.GN)(this)).a(((long)(((long) (life11_33 + p0)))), ((long)(((long) (life10_27 + p1)))));
    life12_60 = (life8_19)[((life11_33 + 1) + ((life10_27 + 1) * (p2 + 2)))];
    spill648_1 = ((moom.GN)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic648_6(15038, (5136371277734267616L ^ life5_3)))));
    if (!((life7_28 != null))) {
        forestValue648_30_0 = spill648_1;
        continue forest_cycle_30;
    }
    if (!((life7_28 != null))) {
        forestValue648_74_0 = spill648_1;
        break forest_join_74;
    }
    if (!((spill648_1 == 0))) {
        break forest_join_104;
    }
    forestValue648_74_0 = life12_60;
    }
    if (!((forestValue648_74_0 == ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).aB))) {
        break forest_join_94;
    }
    (life9_24)[(life11_33 + (life10_27 * p2))] = (((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).aB + __sourceIntrinsic_7c530025ef13_invokedynamic648_12(30282, (726735215168030229L ^ life5_3)));
    if (!((life7_28 == null))) {
        break forest_join_112;
    }
    }
    (life9_24)[(life11_33 + (life10_27 * p2))] = life12_60;
    if (!((life7_28 == null))) {
        break forest_join_112;
    }
    }
    (life9_24)[(life11_33 + (life10_27 * p2))] = life12_60;
    }
    life11_33 += 1;
    if (!((life7_28 == null))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    break forest_cycle_30;
    }
    }
    life10_27 += 1;
    if (!((life7_28 == null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    return life9_24;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic648_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic648_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4644_0() throws E;
}
