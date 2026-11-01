package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hb extends com.moon.g9 {

private com.google.common.cache.Cache<net.minecraft.entity.EntityLivingBase, java.lang.Double> h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private static long m;

public hb(com.moon.module.impl.ESP p0) { super((com.moon.module.impl.ESP)null); }


private static void __sourceConstructorBody_dd042aa53e2d8da4(com.moon.hb receiver, com.moon.module.impl.ESP p0) throws Throwable {

long local2 = (com.moon.hb.i ^ 27832154223273L);

    com.moon.hb.__sourceConstructorInit_dd042aa53e2d8da4_0(((com.moon.hb)(receiver)), ((com.moon.module.impl.ESP)(p0)));

    ((com.moon.hb)(receiver)).h = ((com.google.common.cache.Cache)(((com.google.common.cache.CacheBuilder)(((com.google.common.cache.CacheBuilder)(com.google.common.cache.CacheBuilder.newBuilder())).expireAfterWrite(((java.time.Duration)(java.time.Duration.ofMinutes(((long)(com.moon.hb.m)))))))).build()));

    return;

}



static {
i = ((long)(((moom._a)(moom._c.a(((long)(9134934142285168797L)), ((long)(946205211696631361L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191144589378605L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.hb.i ^ 34582558861941L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill133_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill133_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill133_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill133_14 = new byte[8];
    (__sourceSpill133_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill133_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation133_16 = __sourceSpill133_14;
    ((javax.crypto.Cipher)(__sourceSpill133_11)).init(((int)(__sourceSpill133_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill133_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation133_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[3];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "| ºxÿ\nç÷_ý \027o\021ö\023\004fÈ¦"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill133_25 = local11_life21;
        int __sourceSpill133_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill133_25)).substring(((int)(__sourceSpill133_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill133_30 = local13_life19;
        int __sourceSpill133_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill133_33 = new byte[8];
        (__sourceSpill133_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill133_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill133_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill133_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill133_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill133_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill133_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill133_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill133_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill133_34)).doFinal(((byte[])(__sourceSpill133_33)));
        (__sourceSpill133_30)[__sourceSpill133_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    j = ((long[])(local13_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[3]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill133_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill133_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill133_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill133_45 = new byte[8];
    (__sourceSpill133_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill133_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation133_47 = __sourceSpill133_45;
    ((javax.crypto.Cipher)(__sourceSpill133_42)).init(((int)(__sourceSpill133_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill133_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation133_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = 1214192524223905107L;
    byte[] __sourceSpill133_51 = new byte[8];
    (__sourceSpill133_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill133_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill133_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill133_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill133_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill133_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill133_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill133_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill133_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill133_52)).doFinal(((byte[])(__sourceSpill133_51)));
    m = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_dd042aa53e2d8da4_0(com.moon.hb a0, com.moon.module.impl.ESP a1) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10657;
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
            throw new RuntimeException("com/moon/hb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1425_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
int forwardValue347_17_0;
    int forwardValue347_21_0;
    int forwardValue347_23_0;
    boolean spill347_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (com.moon.hb.i ^ 135338817436189L);
    life4_5 = moom.mS.a__ArrayString();
    spill347_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.hb)(this)).a__lV())).h__kV())).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue347_17_0 = ((spill347_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill347_0)) {
        break forward_join_22;
    }
    forwardValue347_17_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue347_21_0 = forwardValue347_17_0;
        break forward_join_21;
    }
    if (!((forwardValue347_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue347_21_0 = 1;
    }
    forwardValue347_23_0 = forwardValue347_21_0;
    break forward_join_23;
    }
    forwardValue347_23_0 = 0;
    }
    return ((forwardValue347_23_0) != 0);
}


private int a(net.minecraft.entity.EntityLivingBase p0) {
long local2 = (com.moon.hb.i ^ 90249208573101L);
    return (java.awt.Color.HSBtoRGB(((float)((java.lang.Math.max(((float)(0x0.0p0f)), ((float)((java.lang.Math.min(((float)(((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).a()))) / ((net.minecraft.entity.EntityLivingBase)(p0)).a())))) / 0x1.8p1f))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f))) | __sourceIntrinsic_4ce54f6e4231_originalDynamicSite397_7(17088, (7563781618280603999L ^ local2)));
}


private float a(net.minecraft.entity.EntityLivingBase p0, boolean p1) {
java.lang.Double forwardValue346_27_0;
    double forwardValue346_38_0;
    java.lang.String[] spill346_0;
    java.lang.Double spill346_1;
    long life3_3;
    java.lang.Double life6_9;
    double life7_19;
    java.lang.String[] life5_20;
    double life9_46;
    forward_join_38: {
    forward_join_36: {
    forward_join_28: {
    forward_join_27: {
    life3_3 = (com.moon.hb.i ^ 15736921891195L);
    life6_9 = ((java.lang.Double)(((com.google.common.cache.Cache)(this.h)).getIfPresent(((java.lang.Object)(p0)))));
    spill346_0 = moom.mS.a__ArrayString();
    life7_19 = ((double) java.lang.Math.min(((float)((((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_bc607678b6() / ((net.minecraft.entity.EntityLivingBase)(p0)).a()))), ((float)(0x1.0p0f))));
    life5_20 = spill346_0;
    spill346_1 = life6_9;
    if (!((life5_20 == null))) {
        forwardValue346_27_0 = spill346_1;
        break forward_join_27;
    }
    if (!((spill346_1 == null))) {
        break forward_join_28;
    }
    forwardValue346_27_0 = java.lang.Double.valueOf(((double)(life7_19)));
    }
    life6_9 = forwardValue346_27_0;
    }
    if (!(p1)) {
        break forward_join_36;
    }
    forwardValue346_38_0 = com.moon.nR.a(((double)(life7_19)), ((double)(((java.lang.Double)(life6_9)).doubleValue())), ((double)(0x1.99999ap-4d)));
    break forward_join_38;
    }
    forwardValue346_38_0 = ((java.lang.Double)(life6_9)).doubleValue();
    }
    life9_46 = forwardValue346_38_0;
    ((com.google.common.cache.Cache)(this.h)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Double.valueOf(((double)(life9_46))))));
    return ((float) life9_46);
}


public void a(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue345_39_0;
    com.moon.hW forwardValue345_186_0;
    float forwardValue345_186_1;
    float forwardValue345_186_2;
    float forwardValue345_186_3;
    float forwardValue345_186_4;
    java.lang.Object forwardValue345_186_5;
    com.moon.hW forwardValue345_189_0;
    float forwardValue345_189_1;
    float forwardValue345_189_2;
    float forwardValue345_189_3;
    float forwardValue345_189_4;
    com.moon.hW forwardValue345_190_0;
    float forwardValue345_190_1;
    float forwardValue345_190_2;
    float forwardValue345_190_3;
    float forwardValue345_190_4;
    int forwardValue345_190_5;
    com.moon.hb forwardValue345_195_0;
    int forwardValue345_249_0;
    int forwardValue345_263_0;
    java.lang.String[] spill345_0;
    net.minecraft.entity.Entity spill345_1;
    com.moon.hb spill345_2;
    com.moon.hW spill345_3;
    float spill345_4;
    float spill345_5;
    float spill345_6;
    float spill345_7;
    java.lang.Object spill345_8;
    int spill345_9;
    long life2_3;
    com.moon.jb life5_7;
    org.lwjgl.util.vector.Vector4f life6_10;
    float life7_13;
    float life8_17;
    java.lang.String[] life4_18;
    float life9_21;
    float life10_24;
    float life11_28;
    float life12_32;
    net.minecraft.entity.EntityLivingBase life13_46;
    float life14_48;
    float life15_55;
    float life16_57;
    int life17_61;
    float life18_141;
    float life19_145;
    java.lang.String life20_297;
    forward_join_290: {
    forward_join_263: {
    forward_join_249: {
    forward_join_235: {
    forward_join_195: {
    forward_join_194: {
    forward_join_190: {
    forward_join_189: {
    forward_join_186: {
    forward_join_39: {
    life2_3 = (com.moon.hb.i ^ 109943521048244L);
    life5_7 = ((com.moon.je)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__je())).a();
    life6_10 = ((net.minecraft.entity.Entity)(p0)).a__Vector4f();
    life7_13 = ((org.lwjgl.util.vector.Vector4f)(life6_10)).x;
    spill345_0 = moom.mS.a__ArrayString();
    life8_17 = ((org.lwjgl.util.vector.Vector4f)(life6_10)).y;
    life4_18 = spill345_0;
    life9_21 = ((org.lwjgl.util.vector.Vector4f)(life6_10)).z;
    life10_24 = ((org.lwjgl.util.vector.Vector4f)(life6_10)).w;
    life11_28 = (life9_21 - life7_13);
    life12_32 = (life10_24 - life8_17);
    spill345_1 = p0;
    if (!((life4_18 == null))) {
        forwardValue345_39_0 = spill345_1;
        break forward_join_39;
    }
    if (!((((spill345_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_290;
    }
    forwardValue345_39_0 = p0;
    }
    life13_46 = ((net.minecraft.entity.EntityLivingBase)(forwardValue345_39_0));
    life14_48 = 0x1.0p1f;
    life15_55 = ((life7_13 - this.g) - life14_48);
    life16_57 = life12_32;
    life17_61 = ((com.moon.hb)(this)).a(((net.minecraft.entity.EntityLivingBase)(life13_46)));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life15_55)), ((float)(life8_17)), ((float)(0x1.0p-1f)), ((float)(life16_57)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic345_15(21548, (786179517287886248L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life15_55)), ((float)(life8_17)), ((float)(life14_48)), ((float)(0x1.0p-1f)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic345_19(31227, (992884836978770046L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(((life15_55 + life14_48) - this.g))), ((float)(life8_17)), ((float)(0x1.0p-1f)), ((float)(life16_57)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic345_24(31227, (992884836978770046L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life15_55)), ((float)(((life8_17 + life16_57) - this.g))), ((float)(life14_48)), ((float)(0x1.0p-1f)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic345_29(31227, (992884836978770046L ^ life2_3))))))));
    ((com.moon.hW)(this.c)).a(((com.moon.iX)(com.moon.i2.a(((float)(life15_55)), ((float)(life8_17)), ((float)(life14_48)), ((float)(life16_57)), ((int)(__sourceIntrinsic_785327fee08c_invokedynamic345_33(31227, (992884836978770046L ^ life2_3))))))));
    life18_141 = ((com.moon.hb)(this)).a(((net.minecraft.entity.EntityLivingBase)(life13_46)), ((boolean)(true)));
    life19_145 = (life16_57 * life18_141);
    spill345_2 = this;
    if (!((life4_18 == null))) {
        forwardValue345_195_0 = spill345_2;
        break forward_join_195;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.ESP)(((com.moon.hb)(spill345_2)).a__lV())).a__kY())).getValue() != com.moon.ESP2DHealthColorType.GRADIENT))) {
        break forward_join_194;
    }
    spill345_3 = this.c;
    spill345_4 = (life15_55 + this.g);
    spill345_5 = ((life8_17 + this.g) + (life16_57 - life19_145));
    spill345_6 = (life14_48 - (this.g * 0x1.0p1f));
    spill345_7 = (life19_145 - (this.g * 0x1.0p1f));
    spill345_8 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.ESP)(((com.moon.hb)(this)).a__lV())).a__kY())).getValue();
    if (!((life4_18 == null))) {
        forwardValue345_186_0 = spill345_3;
        forwardValue345_186_1 = spill345_4;
        forwardValue345_186_2 = spill345_5;
        forwardValue345_186_3 = spill345_6;
        forwardValue345_186_4 = spill345_7;
        forwardValue345_186_5 = spill345_8;
        break forward_join_186;
    }
    if (!((spill345_8 == com.moon.ESP2DHealthColorType.STATIC))) {
        forwardValue345_189_0 = spill345_3;
        forwardValue345_189_1 = spill345_4;
        forwardValue345_189_2 = spill345_5;
        forwardValue345_189_3 = spill345_6;
        forwardValue345_189_4 = spill345_7;
        break forward_join_189;
    }
    forwardValue345_186_0 = spill345_3;
    forwardValue345_186_1 = spill345_4;
    forwardValue345_186_2 = spill345_5;
    forwardValue345_186_3 = spill345_6;
    forwardValue345_186_4 = spill345_7;
    forwardValue345_186_5 = ((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.hb)(this)).a__lV())).c__kX())).getValue();
    }
    forwardValue345_190_0 = forwardValue345_186_0;
    forwardValue345_190_1 = forwardValue345_186_1;
    forwardValue345_190_2 = forwardValue345_186_2;
    forwardValue345_190_3 = forwardValue345_186_3;
    forwardValue345_190_4 = forwardValue345_186_4;
    forwardValue345_190_5 = ((java.lang.Integer)(((java.lang.Integer)(forwardValue345_186_5)))).intValue();
    break forward_join_190;
    }
    forwardValue345_190_0 = forwardValue345_189_0;
    forwardValue345_190_1 = forwardValue345_189_1;
    forwardValue345_190_2 = forwardValue345_189_2;
    forwardValue345_190_3 = forwardValue345_189_3;
    forwardValue345_190_4 = forwardValue345_189_4;
    forwardValue345_190_5 = life17_61;
    }
    ((com.moon.hW)(forwardValue345_190_0)).a(((com.moon.iX)(com.moon.i2.a(((float)(forwardValue345_190_1)), ((float)(forwardValue345_190_2)), ((float)(forwardValue345_190_3)), ((float)(forwardValue345_190_4)), ((int)(forwardValue345_190_5))))));
    if (!((life4_18 != null))) {
        break forward_join_235;
    }
    }
    forwardValue345_195_0 = this;
    }
    ((com.moon.hW)(((com.moon.hb)(forwardValue345_195_0)).e)).a(((com.moon.iX)(com.moon.i0.a(((float)((life15_55 + this.g))), ((float)(((life8_17 + this.g) + (life16_57 - life19_145)))), ((float)((life14_48 - (this.g * 0x1.0p1f)))), ((float)((life19_145 - (this.g * 0x1.0p1f)))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.hb)(this)).a__lV())).c__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ESP)(((com.moon.hb)(this)).a__lV())).d__kX())).getValue())))).intValue())), ((boolean)(true))))));
    }
    spill345_9 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.EntityLivingBase)(life13_46)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLivingBase)(life13_46)).a())));
    if (!((life4_18 == null))) {
        forwardValue345_249_0 = spill345_9;
        break forward_join_249;
    }
    if (!((spill345_9 < 0))) {
        break forward_join_290;
    }
    forwardValue345_249_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.hb)(this)).a__lV())).i__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue345_263_0 = forwardValue345_249_0;
        break forward_join_263;
    }
    if (!((forwardValue345_249_0 != 0))) {
        break forward_join_290;
    }
    forwardValue345_263_0 = java.lang.Math.round(((float)((moom.Dr.a(((float)((((net.minecraft.entity.EntityLivingBase)(life13_46)).b__sourceReturn_bc607678b6() / ((net.minecraft.entity.EntityLivingBase)(life13_46)).a()))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))) * 0x1.9p6f))));
    }
    life20_297 = __sourceIntrinsic_785327fee08c_invokedynamic345_87(forwardValue345_263_0);
    ((com.moon.jb)(life5_7)).a(((com.moon.hW)(this.f)), ((java.lang.String)(life20_297)), ((float)(((life15_55 + life14_48) - ((com.moon.jb)(life5_7)).a(((java.lang.String)(life20_297)))))), ((float)((((life8_17 + this.g) + (life16_57 - life19_145)) - ((com.moon.jb)(life5_7)).a()))), ((float)(0x1.0p0f)), ((int)(-1)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1425_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic345_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic345_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic345_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic345_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_785327fee08c_invokedynamic345_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_785327fee08c_invokedynamic345_87(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4ce54f6e4231_originalDynamicSite397_7(int a0, long a1) throws E;
}
