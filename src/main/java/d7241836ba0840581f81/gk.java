package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gk extends com.moon.gj {

private net.minecraft.entity.EntityLivingBase c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public gk(com.moon.module.impl.KillAura p0) {
super(p0);
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(4870694715752689192L)), ((long)(-414562815386982775L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106691949266246L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.gk.d ^ 111749912214733L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill120_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill120_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill120_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill120_14 = new byte[8];
    (__sourceSpill120_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill120_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation120_16 = __sourceSpill120_14;
    ((javax.crypto.Cipher)(__sourceSpill120_11)).init(((int)(__sourceSpill120_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill120_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation120_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ùj\f}ÌØf\017ë\000\022Wj"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill120_25 = local6_life21;
        int __sourceSpill120_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill120_25)).substring(((int)(__sourceSpill120_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill120_30 = local8_life19;
        int __sourceSpill120_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill120_33 = new byte[8];
        (__sourceSpill120_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill120_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill120_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill120_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill120_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill120_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill120_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill120_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill120_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill120_34)).doFinal(((byte[])(__sourceSpill120_33)));
        (__sourceSpill120_30)[__sourceSpill120_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19894;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/gk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1296_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.entity.EntityLivingBase a(java.util.List<net.minecraft.entity.EntityLivingBase> p0) {
net.minecraft.entity.EntityLivingBase forwardValue285_19_0;
    int forwardValue285_35_0;
    int forwardValue285_37_0;
    net.minecraft.entity.EntityLivingBase forwardValue285_47_0;
    com.moon.gk forwardValue285_65_0;
    int forwardValue285_69_0;
    int forwardValue285_73_0;
    int[] spill285_0;
    net.minecraft.entity.EntityLivingBase spill285_1;
    boolean spill285_2;
    int spill285_3;
    net.minecraft.entity.EntityLivingBase spill285_4;
    com.moon.gk spill285_5;
    int spill285_6;
    long life2_3;
    java.util.List life5_10;
    int[] life4_11;
    int life6_55;
    forward_join_85: {
    forward_join_73: {
    forward_join_69: {
    forward_join_67: {
    forward_join_65: {
    forward_join_64: {
    forward_join_47: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_19: {
    life2_3 = (com.moon.gk.d ^ 96654728074915L);
    spill285_0 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    life5_10 = ((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(p0)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_e0b16db86ac3_invokedynamic285_3()))))).toList();
    life4_11 = spill285_0;
    spill285_1 = this.c;
    if (!((life4_11 == null))) {
        forwardValue285_19_0 = spill285_1;
        break forward_join_19;
    }
    if (!((spill285_1 != null))) {
        break forward_join_34;
    }
    forwardValue285_19_0 = this.c;
    }
    spill285_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue285_19_0)).F;
    if (!((life4_11 == null))) {
        forwardValue285_35_0 = ((spill285_2) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill285_2))) {
        break forward_join_34;
    }
    spill285_3 = ((net.minecraft.entity.EntityLivingBase)(this.c)).U;
    if (!((life4_11 == null))) {
        forwardValue285_35_0 = spill285_3;
        break forward_join_35;
    }
    if (!((spill285_3 > __sourceIntrinsic_e0b16db86ac3_invokedynamic285_12(6368, (7957745904102262616L ^ life2_3))))) {
        break forward_join_36;
    }
    }
    forwardValue285_35_0 = 1;
    }
    forwardValue285_37_0 = forwardValue285_35_0;
    break forward_join_37;
    }
    forwardValue285_37_0 = 0;
    }
    life6_55 = forwardValue285_37_0;
    spill285_4 = this.c;
    if (!((life4_11 == null))) {
        forwardValue285_47_0 = spill285_4;
        break forward_join_47;
    }
    if (!((spill285_4 != null))) {
        break forward_join_67;
    }
    spill285_5 = this;
    if (!((life4_11 == null))) {
        forwardValue285_65_0 = spill285_5;
        break forward_join_65;
    }
    forwardValue285_47_0 = ((com.moon.gk)(spill285_5)).c;
    }
    if (!((!((net.minecraft.entity.EntityLivingBase)(forwardValue285_47_0)).F))) {
        break forward_join_64;
    }
    spill285_6 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.EntityLivingBase)(this.c)).a__Float(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.gk.a)).K))))), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.KillAura)(((com.moon.gk)(this)).b)).a__kZ())).getValue())))).floatValue())));
    if (!((life4_11 == null))) {
        forwardValue285_69_0 = spill285_6;
        break forward_join_69;
    }
    if (!((spill285_6 > 0))) {
        break forward_join_67;
    }
    }
    forwardValue285_65_0 = this;
    }
    ((com.moon.gk)(forwardValue285_65_0)).c = ((net.minecraft.entity.EntityLivingBase)(null));
    }
    forwardValue285_69_0 = ((((java.util.List)(life5_10)).isEmpty()) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        forwardValue285_73_0 = forwardValue285_69_0;
        break forward_join_73;
    }
    if (!((forwardValue285_69_0 == 0))) {
        break forward_join_85;
    }
    forwardValue285_73_0 = life6_55;
    }
    if (!((forwardValue285_73_0 != 0))) {
        break forward_join_85;
    }
    this.c = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.List)(life5_10)).stream())).min(((java.util.Comparator)(java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction)(__sourceIntrinsic_e0b16db86ac3_invokedynamic285_30(this))))))))).orElse(((java.lang.Object)(null)))))));
    }
    return this.c;
}


private double a(net.minecraft.entity.EntityLivingBase p0) {
double forwardValue286_53_0;
    double forwardValue286_53_1;
    double forwardValue286_56_0;
    int[] spill286_0;
    double spill286_1;
    double spill286_2;
    long life2_3;
    moom.DR life5_26;
    double life6_43;
    int[] life4_44;
    forward_join_56: {
    forward_join_55: {
    forward_join_53: {
    life2_3 = (com.moon.gk.d ^ 94503188817510L);
    spill286_0 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    life5_26 = ((moom.DR)(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(p0)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) (((net.minecraft.entity.EntityLivingBase)(p0)).e__Float() / 0x1.0p1f)))), ((double)(0x0.0p0d))))).c__DR(((moom.DR)(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gk.a)).K)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gk.a)).K)).e__Float()))), ((double)(0x0.0p0d))))));
    life6_43 = (java.lang.Math.abs(((double)((((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gk.a)).K)).w) - (java.lang.Math.toDegrees(((double)(java.lang.Math.atan2(((double)(((moom.DR)(life5_26)).c)), ((double)(((moom.DR)(life5_26)).a)))))) - 0x1.68p6d))))) % 0x1.68p8d);
    life4_44 = spill286_0;
    spill286_1 = life6_43;
    spill286_2 = 0x1.68p7d;
    if (!((life4_44 == null))) {
        forwardValue286_53_0 = spill286_1;
        forwardValue286_53_1 = spill286_2;
        break forward_join_53;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill286_1)), ((double)(spill286_2))) > 0))) {
        break forward_join_55;
    }
    forwardValue286_53_0 = 0x1.68p8d;
    forwardValue286_53_1 = life6_43;
    }
    forwardValue286_56_0 = (forwardValue286_53_0 - forwardValue286_53_1);
    break forward_join_56;
    }
    forwardValue286_56_0 = life6_43;
    }
    return forwardValue286_56_0;
}


public void a() {
this.c = ((net.minecraft.entity.EntityLivingBase)(null));
    return;
}


private static boolean lambda$chooseTarget$0(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue287_17_0;
    int forwardValue287_19_0;
    int spill287_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.gk.d ^ 38849342316072L);
    life3_5 = com.moon.module.SettingOwner.b__ArrayIntStatic();
    spill287_0 = ((net.minecraft.entity.EntityLivingBase)(p0)).U;
    if (!((life3_5 == null))) {
        forwardValue287_17_0 = spill287_0;
        break forward_join_17;
    }
    if (!((spill287_0 <= __sourceIntrinsic_ac07c85e5738_invokedynamic287_3(2320, (1041182868056268322L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue287_17_0 = 1;
    }
    forwardValue287_19_0 = forwardValue287_17_0;
    break forward_join_19;
    }
    forwardValue287_19_0 = 0;
    }
    return ((forwardValue287_19_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1296_0() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e0b16db86ac3_invokedynamic285_3() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0b16db86ac3_invokedynamic285_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.ToDoubleFunction __sourceIntrinsic_e0b16db86ac3_invokedynamic285_30(com.moon.gk a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac07c85e5738_invokedynamic287_3(int a0, long a1) throws E;
}
