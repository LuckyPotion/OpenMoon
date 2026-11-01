package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g_ extends com.moon.g9 {

private com.google.common.cache.Cache<net.minecraft.entity.EntityLivingBase, java.lang.Double> h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private static long m;

public g_(com.moon.module.impl.ESP p0) { super((com.moon.module.impl.ESP)null); }


private static void __sourceConstructorBody_fb60e87d38b532b6(com.moon.g_ receiver, com.moon.module.impl.ESP p0) throws Throwable {

long local2 = (com.moon.g_.i ^ 133209186274683L);

    com.moon.g_.__sourceConstructorInit_fb60e87d38b532b6_0(((com.moon.g_)(receiver)), ((com.moon.module.impl.ESP)(p0)));

    ((com.moon.g_)(receiver)).h = ((com.google.common.cache.Cache)(((com.google.common.cache.CacheBuilder)(((com.google.common.cache.CacheBuilder)(com.google.common.cache.CacheBuilder.newBuilder())).expireAfterWrite(((java.time.Duration)(java.time.Duration.ofMinutes(((long)(com.moon.g_.m)))))))).build()));

    return;

}



static {
i = ((long)(((moom._a)(moom._c.a(((long)(-7529716771995406976L)), ((long)(3422196957082035725L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175779360801477L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.g_.i ^ 92965323902573L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill117_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill117_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill117_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill117_14 = new byte[8];
    (__sourceSpill117_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill117_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation117_16 = __sourceSpill117_14;
    ((javax.crypto.Cipher)(__sourceSpill117_11)).init(((int)(__sourceSpill117_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill117_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation117_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[2];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "îèiÚ\026aÉÌ\032UÞ¬\001¿"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill117_25 = local11_life21;
        int __sourceSpill117_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill117_25)).substring(((int)(__sourceSpill117_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill117_30 = local13_life19;
        int __sourceSpill117_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill117_33 = new byte[8];
        (__sourceSpill117_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill117_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill117_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill117_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill117_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill117_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill117_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill117_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill117_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill117_34)).doFinal(((byte[])(__sourceSpill117_33)));
        (__sourceSpill117_30)[__sourceSpill117_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    j = ((long[])(local13_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill117_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill117_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill117_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill117_45 = new byte[8];
    (__sourceSpill117_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill117_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation117_47 = __sourceSpill117_45;
    ((javax.crypto.Cipher)(__sourceSpill117_42)).init(((int)(__sourceSpill117_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill117_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation117_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = -7205633003705113781L;
    byte[] __sourceSpill117_51 = new byte[8];
    (__sourceSpill117_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill117_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill117_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill117_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill117_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill117_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill117_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill117_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill117_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill117_52)).doFinal(((byte[])(__sourceSpill117_51)));
    m = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_fb60e87d38b532b6_0(com.moon.g_ a0, com.moon.module.impl.ESP a1) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25920;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/g_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1274_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue267_35_0;
    com.moon.g_ forwardValue267_173_0;
    java.lang.String[] spill267_0;
    net.minecraft.entity.Entity spill267_1;
    com.moon.g_ spill267_2;
    long life2_3;
    org.lwjgl.util.vector.Vector4f life5_7;
    float life6_10;
    float life7_13;
    float life8_16;
    float life9_19;
    java.lang.String[] life4_20;
    float life10_24;
    float life11_28;
    net.minecraft.entity.EntityLivingBase life12_42;
    float life13_44;
    float life14_51;
    float life15_53;
    float life16_133;
    float life17_137;
    forward_join_209: {
    forward_join_173: {
    forward_join_172: {
    forward_join_35: {
    life2_3 = (com.moon.g_.i ^ 23495090562192L);
    spill267_0 = moom.mS.a__ArrayString();
    life5_7 = ((net.minecraft.entity.Entity)(p0)).a__Vector4f();
    life6_10 = ((org.lwjgl.util.vector.Vector4f)(life5_7)).x;
    life7_13 = ((org.lwjgl.util.vector.Vector4f)(life5_7)).y;
    life8_16 = ((org.lwjgl.util.vector.Vector4f)(life5_7)).z;
    life9_19 = ((org.lwjgl.util.vector.Vector4f)(life5_7)).w;
    life4_20 = spill267_0;
    life10_24 = (life8_16 - life6_10);
    life11_28 = (life9_19 - life7_13);
    spill267_1 = p0;
    if (!((life4_20 == null))) {
        forwardValue267_35_0 = spill267_1;
        break forward_join_35;
    }
    if (!((((spill267_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_209;
    }
    forwardValue267_35_0 = p0;
    }
    life12_42 = ((net.minecraft.entity.EntityLivingBase)(forwardValue267_35_0));
    life13_44 = 0x1.0p1f;
    life14_51 = ((life7_13 + life11_28) + this.g);
    life15_53 = life10_24;
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_10)), ((float)(life14_51)), ((float)(life15_53)), ((float)(0x1.0p-1f)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic267_11(22093, (1279819307753546537L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_10)), ((float)(life14_51)), ((float)(0x1.0p-1f)), ((float)(life13_44)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic267_15(8030, (4006239280294914619L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(((life6_10 + life15_53) - this.g))), ((float)(life14_51)), ((float)(0x1.0p-1f)), ((float)(life13_44)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic267_20(8030, (4006239280294914619L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_10)), ((float)(((life14_51 + life13_44) - this.g))), ((float)(life15_53)), ((float)(0x1.0p-1f)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic267_25(8030, (4006239280294914619L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life6_10)), ((float)(life14_51)), ((float)(life15_53)), ((float)(life13_44)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic267_29(8030, (4006239280294914619L ^ life2_3))))))));
    life16_133 = ((com.moon.g_)(this)).a(((net.minecraft.entity.EntityLivingBase)(life12_42)), ((boolean)(true)));
    life17_137 = (life15_53 * life16_133);
    spill267_2 = this;
    if (!((life4_20 == null))) {
        forwardValue267_173_0 = spill267_2;
        break forward_join_173;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.ESP)(((com.moon.g_)(spill267_2)).a__lV())).b__kY())).getValue() != com.moon.ESP2DArmorColorType.GRADIENT))) {
        break forward_join_172;
    }
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)((life6_10 + this.g))), ((float)((life14_51 + this.g))), ((float)((life17_137 - (this.g * 0x1.0p1f)))), ((float)((life13_44 - (this.g * 0x1.0p1f)))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g_)(this)).a__lV())).e__kX())).getValue())))).intValue()))))));
    if (!((life4_20 != null))) {
        break forward_join_209;
    }
    }
    forwardValue267_173_0 = this;
    }
    ((com.moon.hW)(((com.moon.g_)(forwardValue267_173_0)).e)).a(((com.moon.iX)(com.moon.i0.a(((float)((life6_10 + this.g))), ((float)((life14_51 + this.g))), ((float)((life17_137 - (this.g * 0x1.0p1f)))), ((float)((life13_44 - (this.g * 0x1.0p1f)))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g_)(this)).a__lV())).e__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.g_)(this)).a__lV())).f__kX())).getValue())))).intValue())), ((boolean)(false))))));
    }
    return;
}


private float a(net.minecraft.entity.EntityLivingBase p0, boolean p1) {
java.lang.Double forwardValue268_27_0;
    double forwardValue268_38_0;
    java.lang.String[] spill268_0;
    java.lang.Double spill268_1;
    long life3_3;
    java.lang.Double life6_9;
    double life7_19;
    java.lang.String[] life5_20;
    double life9_46;
    forward_join_38: {
    forward_join_36: {
    forward_join_28: {
    forward_join_27: {
    life3_3 = (com.moon.g_.i ^ 69686473138007L);
    life6_9 = ((java.lang.Double)(((com.google.common.cache.Cache)(this.h)).getIfPresent(((java.lang.Object)(p0)))));
    spill268_0 = moom.mS.a__ArrayString();
    life7_19 = ((double) java.lang.Math.min(((float)((((float) ((net.minecraft.entity.EntityLivingBase)(p0)).d__Int()) / 0x1.4p4f))), ((float)(0x1.0p0f))));
    life5_20 = spill268_0;
    spill268_1 = life6_9;
    if (!((life5_20 == null))) {
        forwardValue268_27_0 = spill268_1;
        break forward_join_27;
    }
    if (!((spill268_1 == null))) {
        break forward_join_28;
    }
    forwardValue268_27_0 = java.lang.Double.valueOf(((double)(life7_19)));
    }
    life6_9 = forwardValue268_27_0;
    }
    if (!(p1)) {
        break forward_join_36;
    }
    forwardValue268_38_0 = com.moon.nR.a(((double)(life7_19)), ((double)(((java.lang.Double)(life6_9)).doubleValue())), ((double)(0x1.99999ap-4d)));
    break forward_join_38;
    }
    forwardValue268_38_0 = ((java.lang.Double)(life6_9)).doubleValue();
    }
    life9_46 = forwardValue268_38_0;
    ((com.google.common.cache.Cache)(this.h)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Double.valueOf(((double)(life9_46))))));
    return ((float) life9_46);
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
int forwardValue269_17_0;
    int forwardValue269_21_0;
    int forwardValue269_23_0;
    boolean spill269_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (com.moon.g_.i ^ 15081209440313L);
    life4_5 = moom.mS.a__ArrayString();
    spill269_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.g_)(this)).a__lV())).j__kV())).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue269_17_0 = ((spill269_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill269_0)) {
        break forward_join_22;
    }
    forwardValue269_17_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue269_21_0 = forwardValue269_17_0;
        break forward_join_21;
    }
    if (!((forwardValue269_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue269_21_0 = 1;
    }
    forwardValue269_23_0 = forwardValue269_21_0;
    break forward_join_23;
    }
    forwardValue269_23_0 = 0;
    }
    return ((forwardValue269_23_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1274_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic267_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic267_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic267_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic267_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic267_29(int a0, long a1) throws E;
}
