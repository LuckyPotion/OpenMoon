package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GU extends moom.GD {

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public GU(long p0, moom.GD p1) {
super(p0);
    ((moom.GD)(this)).b = ((moom.GD)(p1));
    return;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-2672143266351785729L)), ((long)(8131399257274720064L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274701402806075L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.GU.f ^ 122608311519265L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill782_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill782_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill782_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill782_14 = new byte[8];
    (__sourceSpill782_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill782_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation782_16 = __sourceSpill782_14;
    ((javax.crypto.Cipher)(__sourceSpill782_11)).init(((int)(__sourceSpill782_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill782_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation782_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "a[û yexCÇ.f,#9"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill782_25 = local6_life21;
        int __sourceSpill782_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill782_25)).substring(((int)(__sourceSpill782_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill782_30 = local8_life19;
        int __sourceSpill782_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill782_33 = new byte[8];
        (__sourceSpill782_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill782_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill782_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill782_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill782_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill782_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill782_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill782_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill782_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill782_34)).doFinal(((byte[])(__sourceSpill782_33)));
        (__sourceSpill782_30)[__sourceSpill782_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "É)\0306µ¥)Iê\034vE%"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill782_38 = local6_life21;
        int __sourceSpill782_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill782_38)).substring(((int)(__sourceSpill782_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill782_43 = local8_life19;
        int __sourceSpill782_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill782_46 = new byte[8];
        (__sourceSpill782_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill782_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill782_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill782_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill782_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill782_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill782_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill782_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill782_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill782_47)).doFinal(((byte[])(__sourceSpill782_46)));
        (__sourceSpill782_43)[__sourceSpill782_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GU.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3824;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = g[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/GU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4655_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue653_62_0;
    int forestValue653_334_0;
    int forestValue653_465_0;
    int forestValue653_490_0;
    int forestValue653_496_0;
    int forestValue653_502_0;
    int forestValue653_524_0;
    int forestValue653_534_0;
    int[] forestValue653_565_0;
    net.minecraft.entity.Entity[] spill653_0;
    int spill653_1;
    int spill653_2;
    int spill653_3;
    int spill653_4;
    int spill653_5;
    int spill653_6;
    int spill653_7;
    int spill653_8;
    int[] spill653_9;
    long life5_3;
    int life1_7;
    int life2_11;
    int life8_16;
    net.minecraft.entity.Entity[] life7_17;
    int life9_21;
    int life10_27;
    int life11_33;
    int[] life12_41;
    int life13_47;
    int life14_53;
    int[] life15_58;
    int life16_60;
    int life17_67;
    int life18_75;
    int life19_87;
    double life20_94;
    double life22_125;
    double life24_140;
    double life26_175;
    double life28_190;
    double life30_223;
    double life32_240;
    double life34_277;
    double life36_294;
    int life38_310;
    int life39_328;
    int life40_332;
    int life41_347;
    int life42_351;
    double life43_374;
    double life45_394;
    double life47_414;
    double life49_434;
    int[] life16_555;
    int life17_557;
    forest_join_565: {
    forest_join_564: {
    forest_join_534: {
    forest_join_531: {
    life5_3 = (moom.GU.f ^ 80389398836671L);
    life1_7 = (p0 - 2);
    life2_11 = (p1 - 2);
    spill653_0 = moom.GD.b();
    life8_16 = (life1_7 >> 2);
    life7_17 = spill653_0;
    life9_21 = (life2_11 >> 2);
    life10_27 = ((p2 >> 2) + 2);
    life11_33 = ((p3 >> 2) + 2);
    life12_41 = ((moom.GD)(((moom.GU)(this)).b)).a__ArrayInt(((int)(life8_16)), ((int)(life9_21)), ((int)(life10_27)), ((int)(life11_33)));
    life13_47 = ((life10_27 - 1) << 2);
    life14_53 = ((life11_33 - 1) << 2);
    life15_58 = moom.GY.a(((int)((life13_47 * life14_53))));
    life16_60 = 0;
    forest_cycle_61: while (true) {
    forest_join_528: {
    forestValue653_62_0 = life16_60;
    forest_cycle_62: while (true) {
    if (!((forestValue653_62_0 < (life11_33 - 1)))) {
        break forest_join_531;
    }
    life17_67 = 0;
    life18_75 = (life12_41)[(life17_67 + (life16_60 * life10_27))];
    spill653_1 = (life12_41)[(life17_67 + ((life16_60 + 1) * life10_27))];
    if (!((life7_17 != null))) {
        forestValue653_534_0 = spill653_1;
        break forest_join_534;
    }
    life19_87 = spill653_1;
    forest_cycle_88: while (true) {
    forest_join_524: {
    forest_join_521: {
    if (!((life17_67 < (life10_27 - 1)))) {
        break forest_join_528;
    }
    life20_94 = 0x1.ccccccccccccdp1d;
    ((moom.GU)(this)).a(((long)(((((long) life17_67) + ((long) life8_16)) << 2))), ((long)(((((long) life16_60) + ((long) life9_21)) << 2))));
    life22_125 = (((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_6(25057, (2864183793929894759L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d);
    life24_140 = (((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_8(12577, (5518571675425762212L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d);
    ((moom.GU)(this)).a(((long)((((((long) life17_67) + ((long) life8_16)) + 1L) << 2))), ((long)(((((long) life16_60) + ((long) life9_21)) << 2))));
    life26_175 = ((((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_11(12577, (5518571675425762212L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d) + 0x1.0p2d);
    life28_190 = (((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_13(12577, (5518571675425762212L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d);
    ((moom.GU)(this)).a(((long)(((((long) life17_67) + ((long) life8_16)) << 2))), ((long)((((((long) life16_60) + ((long) life9_21)) + 1L) << 2))));
    life30_223 = (((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_16(12577, (5518571675425762212L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d);
    life32_240 = ((((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_18(12577, (5518571675425762212L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d) + 0x1.0p2d);
    ((moom.GU)(this)).a(((long)((((((long) life17_67) + ((long) life8_16)) + 1L) << 2))), ((long)((((((long) life16_60) + ((long) life9_21)) + 1L) << 2))));
    life34_277 = ((((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_21(12577, (5518571675425762212L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d) + 0x1.0p2d);
    life36_294 = ((((((double) ((moom.GU)(this)).a(((int)(__sourceIntrinsic_7c530025ef13_invokedynamic653_23(12577, (5518571675425762212L ^ life5_3)))))) / 0x1.0p10d) - 0x1.0p-1d) * 0x1.ccccccccccccdp1d) + 0x1.0p2d);
    life38_310 = ((life12_41)[((life17_67 + 1) + (life16_60 * life10_27))] & __sourceIntrinsic_7c530025ef13_invokedynamic653_25(6388, (5601414058516857459L ^ life5_3)));
    life39_328 = ((life12_41)[((life17_67 + 1) + ((life16_60 + 1) * life10_27))] & __sourceIntrinsic_7c530025ef13_invokedynamic653_26(30549, (3699598201195212241L ^ life5_3)));
    spill653_2 = 0;
    if (!((life7_17 != null))) {
        forestValue653_62_0 = spill653_2;
        continue forest_cycle_62;
    }
    life40_332 = spill653_2;
    forest_cycle_333: while (true) {
    forest_join_518: {
    forestValue653_334_0 = life40_332;
    forest_cycle_334: while (true) {
    if (!((forestValue653_334_0 < 4))) {
        break forest_join_521;
    }
    life41_347 = ((((life16_60 << 2) + life40_332) * life13_47) + (life17_67 << 2));
    spill653_3 = 0;
    if (!((life7_17 != null))) {
        forestValue653_524_0 = spill653_3;
        break forest_join_524;
    }
    life42_351 = spill653_3;
    forest_cycle_352: while (true) {
    forest_join_515: {
    forest_join_510: {
    forest_join_502: {
    forest_join_496: {
    forest_join_490: {
    forest_join_487: {
    forest_join_465: {
    forest_join_462: {
    if (!((life42_351 < 4))) {
        break forest_join_518;
    }
    life43_374 = (((((double) life40_332) - life24_140) * (((double) life40_332) - life24_140)) + ((((double) life42_351) - life22_125) * (((double) life42_351) - life22_125)));
    life45_394 = (((((double) life40_332) - life28_190) * (((double) life40_332) - life28_190)) + ((((double) life42_351) - life26_175) * (((double) life42_351) - life26_175)));
    life47_414 = (((((double) life40_332) - life32_240) * (((double) life40_332) - life32_240)) + ((((double) life42_351) - life30_223) * (((double) life42_351) - life30_223)));
    life49_434 = (((((double) life40_332) - life36_294) * (((double) life40_332) - life36_294)) + ((((double) life42_351) - life34_277) * (((double) life42_351) - life34_277)));
    spill653_4 = recovery.source.CarrierOps.dcmpg(((double)(life43_374)), ((double)(life45_394)));
    if (!((life7_17 != null))) {
        forestValue653_334_0 = spill653_4;
        continue forest_cycle_334;
    }
    if (!((life7_17 != null))) {
        forestValue653_465_0 = spill653_4;
        break forest_join_465;
    }
    if (!((spill653_4 < 0))) {
        break forest_join_462;
    }
    spill653_5 = recovery.source.CarrierOps.dcmpg(((double)(life43_374)), ((double)(life47_414)));
    if (!((life7_17 != null))) {
        forestValue653_465_0 = spill653_5;
        break forest_join_465;
    }
    if (!((spill653_5 < 0))) {
        break forest_join_462;
    }
    spill653_6 = recovery.source.CarrierOps.dcmpg(((double)(life43_374)), ((double)(life49_434)));
    if (!((life7_17 != null))) {
        forestValue653_465_0 = spill653_6;
        break forest_join_465;
    }
    if (!((spill653_6 < 0))) {
        break forest_join_462;
    }
    (life15_58)[(life41_347++)] = life18_75;
    if (!((life7_17 == null))) {
        break forest_join_515;
    }
    }
    forestValue653_465_0 = recovery.source.CarrierOps.dcmpg(((double)(life45_394)), ((double)(life43_374)));
    }
    if (!((life7_17 != null))) {
        forestValue653_490_0 = forestValue653_465_0;
        break forest_join_490;
    }
    if (!((forestValue653_465_0 < 0))) {
        break forest_join_487;
    }
    spill653_7 = recovery.source.CarrierOps.dcmpg(((double)(life45_394)), ((double)(life47_414)));
    if (!((life7_17 != null))) {
        forestValue653_490_0 = spill653_7;
        break forest_join_490;
    }
    if (!((spill653_7 < 0))) {
        break forest_join_487;
    }
    spill653_8 = recovery.source.CarrierOps.dcmpg(((double)(life45_394)), ((double)(life49_434)));
    if (!((life7_17 != null))) {
        forestValue653_490_0 = spill653_8;
        break forest_join_490;
    }
    if (!((spill653_8 < 0))) {
        break forest_join_487;
    }
    (life15_58)[(life41_347++)] = life38_310;
    if (!((life7_17 == null))) {
        break forest_join_515;
    }
    }
    forestValue653_490_0 = recovery.source.CarrierOps.dcmpg(((double)(life47_414)), ((double)(life43_374)));
    }
    if (!((life7_17 != null))) {
        forestValue653_496_0 = forestValue653_490_0;
        break forest_join_496;
    }
    if (!((forestValue653_490_0 < 0))) {
        break forest_join_510;
    }
    forestValue653_496_0 = recovery.source.CarrierOps.dcmpg(((double)(life47_414)), ((double)(life45_394)));
    }
    if (!((life7_17 != null))) {
        forestValue653_502_0 = forestValue653_496_0;
        break forest_join_502;
    }
    if (!((forestValue653_496_0 < 0))) {
        break forest_join_510;
    }
    forestValue653_502_0 = recovery.source.CarrierOps.dcmpg(((double)(life47_414)), ((double)(life49_434)));
    }
    if (!((forestValue653_502_0 < 0))) {
        break forest_join_510;
    }
    (life15_58)[(life41_347++)] = life19_87;
    if (!((life7_17 == null))) {
        break forest_join_515;
    }
    }
    (life15_58)[(life41_347++)] = life39_328;
    }
    life42_351 += 1;
    if (!((life7_17 == null))) {
        continue forest_cycle_352;
    }
    break forest_cycle_352;
    }
    break forest_cycle_334;
    }
    }
    life40_332 += 1;
    if (!((life7_17 == null))) {
        continue forest_cycle_333;
    }
    break forest_cycle_333;
    }
    }
    life18_75 = life38_310;
    forestValue653_524_0 = life39_328;
    }
    life19_87 = forestValue653_524_0;
    life17_67 += 1;
    if (!((life7_17 == null))) {
        continue forest_cycle_88;
    }
    break forest_cycle_88;
    }
    break forest_cycle_62;
    }
    }
    life16_60 += 1;
    if (!((life7_17 == null))) {
        continue forest_cycle_61;
    }
    break forest_cycle_61;
    }
    }
    forestValue653_534_0 = (p2 * p3);
    }
    life16_555 = moom.GY.a(((int)(forestValue653_534_0)));
    life17_557 = 0;
    forest_cycle_538: while (true) {
    if (!((life17_557 < p3))) {
        break forest_join_564;
    }
    spill653_9 = life15_58;
    if (!((life7_17 != null))) {
        forestValue653_565_0 = spill653_9;
        break forest_join_565;
    }
    java.lang.System.arraycopy(((java.lang.Object)(spill653_9)), ((int)((((life17_557 + (life2_11 & 3)) * life13_47) + (life1_7 & 3)))), ((java.lang.Object)(life16_555)), ((int)((life17_557 * p2))), ((int)(p2)));
    life17_557 += 1;
    if (!((life7_17 == null))) {
        continue forest_cycle_538;
    }
    break forest_cycle_538;
    }
    }
    forestValue653_565_0 = life16_555;
    }
    return forestValue653_565_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic653_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4655_0() throws E;
}
