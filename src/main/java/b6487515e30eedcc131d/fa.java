package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fa extends com.moon.e2<com.moon.module.impl.WTap> {

private com.moon.module.impl.KillAura e;

private boolean f;

private int g;

private int h;

private static final long i;

private static final java.lang.String j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public fa() {
super(com.moon.module.impl.WTap.class);
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-7571824555840269389L)), ((long)(-1764279041856152731L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(51958545380387L)))));
    long local11_life6 = (com.moon.fa.i ^ 64990452511201L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill96_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill96_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill96_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill96_13 = new byte[8];
    (__sourceSpill96_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill96_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation96_15 = __sourceSpill96_13;
    ((javax.crypto.Cipher)(__sourceSpill96_10)).init(((int)(__sourceSpill96_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill96_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation96_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill96_19 = ((java.lang.String)("÷Ðï(IÇ|S")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill96_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill96_20)).doFinal(((byte[])(__sourceSpill96_19)));
    j = ((java.lang.String)(((java.lang.String)(com.moon.fa.a(((byte[])(local15_life22))))).intern()));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill96_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill96_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill96_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill96_33 = new byte[8];
    (__sourceSpill96_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill96_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation96_35 = __sourceSpill96_33;
    ((javax.crypto.Cipher)(__sourceSpill96_30)).init(((int)(__sourceSpill96_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill96_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation96_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[2];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "ã ¨t\025\007<ÖHP9Æ×fá"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill96_44 = local4_life40;
        int __sourceSpill96_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill96_44)).substring(((int)(__sourceSpill96_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill96_49 = local6_life38;
        int __sourceSpill96_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill96_52 = new byte[8];
        (__sourceSpill96_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill96_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill96_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill96_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill96_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill96_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill96_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill96_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill96_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill96_53)).doFinal(((byte[])(__sourceSpill96_52)));
        (__sourceSpill96_49)[__sourceSpill96_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    k = ((long[])(local6_life38));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1106_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.fa.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25584;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/fa", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill294_0 = p0;
        life4_9 += 1;
        life5_44 = (spill294_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill294_1 = p0;
        life4_9 += 1;
        life5_76 = (spill294_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill294_2 = p0;
        life4_9 += 1;
        life5_91 = (spill294_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.event.TickEvent p0) {
java.lang.Object forestValue55_28_0;
    int forestValue55_51_0;
    int forestValue55_59_0;
    net.minecraft.entity.EntityLivingBase forestValue55_69_0;
    int forestValue55_83_0;
    int forestValue55_90_0;
    int forestValue55_101_0;
    int forestValue55_118_0;
    int forestValue55_118_1;
    com.moon.fa forestValue55_125_0;
    net.minecraft.client.entity.EntityPlayerSP spill55_0;
    int spill55_1;
    net.minecraft.entity.EntityLivingBase spill55_2;
    int spill55_3;
    int spill55_4;
    com.moon.fa spill55_5;
    long life2_3;
    int life4_5;
    com.moon.bg life5_32;
    int life6_40;
    int life7_48;
    int life8_63;
    net.minecraft.entity.EntityLivingBase life9_66;
    forest_join_176: {
    forest_join_155: {
    forest_join_143: {
    forest_join_125: {
    forest_join_120: {
    forest_join_118: {
    forest_join_112: {
    forest_join_101: {
    forest_join_93: {
    forest_join_90: {
    forest_join_83: {
    forest_join_81: {
    forest_join_69: {
    forest_join_68: {
    forest_join_59: {
    forest_join_52: {
    forest_join_51: {
    forest_join_28: {
    forest_join_23: {
    forest_join_17: {
    life2_3 = (com.moon.fa.i ^ 55373165756282L);
    life4_5 = net.minecraft.item.Item.e();
    if (!((life4_5 == 0))) {
        break forest_join_17;
    }
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forest_join_176;
    }
    ((com.moon.module.impl.WTap)(((com.moon.module.impl.WTap)(((com.moon.fa)(this)).a())))).setSuffix(((java.lang.String)(com.moon.fa.j)));
    }
    spill55_0 = ((net.minecraft.client.Minecraft)(com.moon.fa.a)).K;
    if (!((life4_5 == 0))) {
        forestValue55_28_0 = spill55_0;
        break forest_join_28;
    }
    if (!((spill55_0 == null))) {
        break forest_join_23;
    }
    return;
    }
    forestValue55_28_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.WTap)(((com.moon.module.impl.WTap)(((com.moon.fa)(this)).a())))).a__kY())).getValue();
    }
    life5_32 = ((com.moon.bg)(forestValue55_28_0));
    life6_40 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.WTap)(((com.moon.module.impl.WTap)(((com.moon.fa)(this)).a())))).a())).getValue())))).intValue();
    life7_48 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.WTap)(((com.moon.module.impl.WTap)(((com.moon.fa)(this)).a())))).b__kV())).getValue())))).booleanValue()) ? 1 : 0);
    spill55_1 = life7_48;
    if (!((life4_5 == 0))) {
        forestValue55_51_0 = spill55_1;
        break forest_join_51;
    }
    if (!((spill55_1 != 0))) {
        break forest_join_52;
    }
    forestValue55_51_0 = 0;
    }
    forestValue55_59_0 = forestValue55_51_0;
    break forest_join_59;
    }
    forestValue55_59_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.WTap)(((com.moon.module.impl.WTap)(((com.moon.fa)(this)).a())))).b())).getValue())))).intValue();
    }
    life8_63 = forestValue55_59_0;
    life9_66 = ((com.moon.fa)(this)).a__sourceReturn_d30556f370();
    spill55_2 = life9_66;
    if (!((life4_5 == 0))) {
        forestValue55_69_0 = spill55_2;
        break forest_join_69;
    }
    if (!((spill55_2 == null))) {
        break forest_join_68;
    }
    return;
    }
    forestValue55_69_0 = life9_66;
    }
    spill55_3 = ((net.minecraft.entity.EntityLivingBase)(forestValue55_69_0)).aO;
    if (!((life4_5 == 0))) {
        forestValue55_83_0 = spill55_3;
        break forest_join_83;
    }
    if (!((spill55_3 == __sourceIntrinsic_be06bc302d53_invokedynamic55_36(7793, (4772882815737146055L ^ life2_3))))) {
        break forest_join_81;
    }
    this.f = ((boolean)(true));
    }
    forestValue55_83_0 = ((this.f) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue55_90_0 = forestValue55_83_0;
        break forest_join_90;
    }
    if (!((forestValue55_83_0 != 0))) {
        break forest_join_176;
    }
    forestValue55_90_0 = (com.moon.gn.a)[((com.moon.bg)(life5_32)).ordinal()];
    }
    if (!((life4_5 == 0))) {
        forestValue55_101_0 = forestValue55_90_0;
        break forest_join_101;
    }
    switch (forestValue55_90_0) {
case 1:
{
        break forest_join_93;
    }
case 2:
{
        break forest_join_143;
    }
default:
{
        break forest_join_176;
    }
}
    }
    com.moon.fa __stackOp55_42_0 = this;
    ((com.moon.fa)(__stackOp55_42_0)).g = ((int)((((com.moon.fa)(__stackOp55_42_0)).g + 1)));
    forestValue55_101_0 = ((net.minecraft.entity.EntityLivingBase)(life9_66)).aO;
    }
    spill55_4 = __sourceIntrinsic_be06bc302d53_invokedynamic55_46(7636, (8465836339088107875L ^ life2_3));
    if (!((life4_5 == 0))) {
        forestValue55_118_0 = forestValue55_101_0;
        forestValue55_118_1 = spill55_4;
        break forest_join_118;
    }
    if (!((forestValue55_101_0 == spill55_4))) {
        break forest_join_112;
    }
    this.g = ((int)(0));
    }
    spill55_5 = this;
    if (!((life4_5 == 0))) {
        forestValue55_125_0 = spill55_5;
        break forest_join_125;
    }
    forestValue55_118_0 = ((com.moon.fa)(spill55_5)).g;
    forestValue55_118_1 = this.h;
    }
    if (!((forestValue55_118_0 != forestValue55_118_1))) {
        break forest_join_120;
    }
    return;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fa.a)).K)).cP = ((boolean)(true));
    forestValue55_125_0 = this;
    }
    ((com.moon.fa)(forestValue55_125_0)).h = ((int)(com.moon.nI.a(((int)(java.lang.Math.max(((int)((life6_40 - life8_63))), ((int)(0))))), ((int)(java.lang.Math.min(((int)((life6_40 + life8_63))), ((int)(__sourceIntrinsic_be06bc302d53_invokedynamic55_54(7636, (8465836339088107875L ^ life2_3))))))))));
    if (!((life4_5 != 0))) {
        break forest_join_176;
    }
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(life9_66)).aO != (__sourceIntrinsic_be06bc302d53_invokedynamic55_59(7636, (8465836339088107875L ^ life2_3)) - this.h)))) {
        break forest_join_155;
    }
    return;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fa.a)).K)).cP = ((boolean)(true));
    this.h = ((int)(com.moon.nI.a(((int)(java.lang.Math.max(((int)((life6_40 - life8_63))), ((int)(0))))), ((int)(java.lang.Math.min(((int)((life6_40 + life8_63))), ((int)(__sourceIntrinsic_be06bc302d53_invokedynamic55_65(7636, (8465836339088107875L ^ life2_3))))))))));
    }
    return;
}


private net.minecraft.entity.EntityLivingBase a__sourceReturn_d30556f370() {
com.moon.module.impl.KillAura forwardValue151_20_0;
    net.minecraft.util.MovingObjectPosition forwardValue151_35_0;
    net.minecraft.entity.Entity forwardValue151_43_0;
    net.minecraft.entity.EntityLivingBase forwardValue151_48_0;
    com.moon.module.impl.KillAura spill151_0;
    net.minecraft.entity.EntityLivingBase spill151_1;
    net.minecraft.util.MovingObjectPosition spill151_2;
    net.minecraft.entity.Entity spill151_3;
    long life1_3;
    int life3_5;
    net.minecraft.entity.EntityLivingBase life4_28;
    net.minecraft.util.MovingObjectPosition life5_38;
    net.minecraft.entity.Entity life7_48;
    net.minecraft.entity.EntityLivingBase life6_62;
    forward_join_48: {
    forward_join_47: {
    forward_join_43: {
    forward_join_35: {
    forward_join_20: {
    forward_join_18: {
    life1_3 = (com.moon.fa.i ^ 108599492200699L);
    life3_5 = net.minecraft.item.Item.d();
    spill151_0 = this.e;
    if (!((life3_5 != 0))) {
        forwardValue151_20_0 = spill151_0;
        break forward_join_20;
    }
    if (!((spill151_0 == null))) {
        break forward_join_18;
    }
    this.e = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    forwardValue151_20_0 = this.e;
    }
    life4_28 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(forwardValue151_20_0)).a__gd())).a__sG();
    spill151_1 = life4_28;
    if (!((life3_5 != 0))) {
        forwardValue151_48_0 = spill151_1;
        break forward_join_48;
    }
    if (!((spill151_1 == null))) {
        break forward_join_47;
    }
    life5_38 = ((net.minecraft.client.Minecraft)(com.moon.fa.a)).V;
    spill151_2 = life5_38;
    if (!((life3_5 != 0))) {
        forwardValue151_35_0 = spill151_2;
        break forward_join_35;
    }
    if (!((spill151_2 != null))) {
        break forward_join_47;
    }
    forwardValue151_35_0 = life5_38;
    }
    life7_48 = ((net.minecraft.util.MovingObjectPosition)(forwardValue151_35_0)).e;
    spill151_3 = life7_48;
    if (!((life3_5 != 0))) {
        forwardValue151_43_0 = spill151_3;
        break forward_join_43;
    }
    if (!((((spill151_3 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_47;
    }
    forwardValue151_43_0 = life7_48;
    }
    life6_62 = ((net.minecraft.entity.EntityLivingBase)(forwardValue151_43_0));
    life4_28 = life6_62;
    }
    forwardValue151_48_0 = life4_28;
    }
    return forwardValue151_48_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic55_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic55_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic55_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic55_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic55_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1106_0() throws E;
}
