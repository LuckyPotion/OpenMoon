package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class x8 {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public x8() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-3447437338385607912L)), ((long)(4618938110636392533L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249274421387772L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.x8.a ^ 40487243589947L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1668_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1668_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1668_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1668_14 = new byte[8];
    (__sourceSpill1668_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1668_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1668_16 = __sourceSpill1668_14;
    ((javax.crypto.Cipher)(__sourceSpill1668_11)).init(((int)(__sourceSpill1668_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1668_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1668_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[24];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "U¸U«[¹ÂÓEîÉ±!\177\034qn´Üôj¸üål\000\005-°~ÖÌ*5bjq\007Ú!\024ÒêÂl{Ñ0Éo¡ð½laI( Ú¤«^»\016ÁZô%hSÅù>\005\\Æ=\017E×\016ÁqÌtÍ¿ïXj·H\177ñ²±ç«×þ\f-9t¢Fnr\bæ%!iND\025ëzÃ\035íÞË-\013\032½ÓÌ^\024~?Â<Y\\îO\"Rùð¶§ÎsY[}ÓË;¦è¾"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1668_25 = local6_life21;
        int __sourceSpill1668_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1668_25)).substring(((int)(__sourceSpill1668_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1668_30 = local8_life19;
        int __sourceSpill1668_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1668_33 = new byte[8];
        (__sourceSpill1668_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1668_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1668_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1668_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1668_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1668_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1668_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1668_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1668_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1668_34)).doFinal(((byte[])(__sourceSpill1668_33)));
        (__sourceSpill1668_30)[__sourceSpill1668_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¦À»&[x¡)Qõ\177÷nÉ$"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1668_38 = local6_life21;
        int __sourceSpill1668_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1668_38)).substring(((int)(__sourceSpill1668_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1668_43 = local8_life19;
        int __sourceSpill1668_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1668_46 = new byte[8];
        (__sourceSpill1668_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1668_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1668_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1668_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1668_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1668_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1668_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1668_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1668_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1668_47)).doFinal(((byte[])(__sourceSpill1668_46)));
        (__sourceSpill1668_43)[__sourceSpill1668_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[24]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9670_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/x8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.x8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10823;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/x8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


public void a(net.minecraft.item.crafting.CraftingManager p0) {
long life2_3;
    life2_3 = (moom.x8.a ^ 108751174974292L);
    net.minecraft.item.crafting.CraftingManager spill453_0 = p0;
    net.minecraft.item.ItemStack spill453_1 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ae);
    java.lang.Object[] __stackOp453_2_0 = new java.lang.Object[5];
    java.lang.Object[] spill453_2 = __stackOp453_2_0;
    (__stackOp453_2_0)[0] = "###";
    java.lang.Object[] __stackOp453_3_0 = spill453_2;
    java.lang.Object[] spill453_3 = __stackOp453_3_0;
    (__stackOp453_3_0)[1] = "# #";
    java.lang.Object[] __stackOp453_4_0 = spill453_3;
    java.lang.Object[] spill453_4 = __stackOp453_4_0;
    (__stackOp453_4_0)[2] = "###";
    java.lang.Object[] __stackOp453_5_0 = spill453_4;
    java.lang.Object[] spill453_5 = __stackOp453_5_0;
    (__stackOp453_5_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_6(32668, (2560810595574510033L ^ life2_3)))));
    java.lang.Object[] __stackOp453_8_0 = spill453_5;
    java.lang.Object[] spill453_6 = __stackOp453_8_0;
    (__stackOp453_8_0)[4] = net.minecraft.init.Blocks.f;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_0)).a(((net.minecraft.item.ItemStack)(spill453_1)), ((java.lang.Object[])(spill453_6)));
    net.minecraft.item.crafting.CraftingManager spill453_7 = p0;
    net.minecraft.item.ItemStack spill453_8 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bV);
    java.lang.Object[] __stackOp453_12_0 = new java.lang.Object[5];
    java.lang.Object[] spill453_9 = __stackOp453_12_0;
    (__stackOp453_12_0)[0] = "#-";
    java.lang.Object[] __stackOp453_13_0 = spill453_9;
    java.lang.Object[] spill453_10 = __stackOp453_13_0;
    (__stackOp453_13_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_14(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_16_0 = spill453_10;
    java.lang.Object[] spill453_11 = __stackOp453_16_0;
    (__stackOp453_16_0)[2] = net.minecraft.init.Blocks.ae;
    java.lang.Object[] __stackOp453_18_0 = spill453_11;
    java.lang.Object[] spill453_12 = __stackOp453_18_0;
    (__stackOp453_18_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_19(2284, (6568678292397885092L ^ life2_3)))));
    java.lang.Object[] __stackOp453_21_0 = spill453_12;
    java.lang.Object[] spill453_13 = __stackOp453_21_0;
    (__stackOp453_21_0)[4] = net.minecraft.init.Blocks.bG;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_7)).a(((net.minecraft.item.ItemStack)(spill453_8)), ((java.lang.Object[])(spill453_13)));
    net.minecraft.item.crafting.CraftingManager spill453_14 = p0;
    net.minecraft.item.ItemStack spill453_15 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bF);
    java.lang.Object[] __stackOp453_26_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic453_25(15217, (1696083705451296059L ^ life2_3))];
    java.lang.Object[] spill453_16 = __stackOp453_26_0;
    (__stackOp453_26_0)[0] = "###";
    java.lang.Object[] __stackOp453_27_0 = spill453_16;
    java.lang.Object[] spill453_17 = __stackOp453_27_0;
    (__stackOp453_27_0)[1] = "#E#";
    java.lang.Object[] __stackOp453_28_0 = spill453_17;
    java.lang.Object[] spill453_18 = __stackOp453_28_0;
    (__stackOp453_28_0)[2] = "###";
    java.lang.Object[] __stackOp453_29_0 = spill453_18;
    java.lang.Object[] spill453_19 = __stackOp453_29_0;
    (__stackOp453_29_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_30(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_32_0 = spill453_19;
    java.lang.Object[] spill453_20 = __stackOp453_32_0;
    (__stackOp453_32_0)[4] = net.minecraft.init.Blocks.Z;
    java.lang.Object[] __stackOp453_34_0 = spill453_20;
    java.lang.Object[] spill453_21 = __stackOp453_34_0;
    (__stackOp453_34_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_35(32472, (6766973227978616975L ^ life2_3)))));
    java.lang.Object[] __stackOp453_37_0 = spill453_21;
    java.lang.Object[] spill453_22 = __stackOp453_37_0;
    (__stackOp453_37_0)[__sourceIntrinsic_396de9353eae_invokedynamic453_38(2369, (4518407449739331347L ^ life2_3))] = net.minecraft.init.Items.bw;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_14)).a(((net.minecraft.item.ItemStack)(spill453_15)), ((java.lang.Object[])(spill453_22)));
    net.minecraft.item.crafting.CraftingManager spill453_23 = p0;
    net.minecraft.item.ItemStack spill453_24 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.al);
    java.lang.Object[] __stackOp453_42_0 = new java.lang.Object[5];
    java.lang.Object[] spill453_25 = __stackOp453_42_0;
    (__stackOp453_42_0)[0] = "###";
    java.lang.Object[] __stackOp453_43_0 = spill453_25;
    java.lang.Object[] spill453_26 = __stackOp453_43_0;
    (__stackOp453_43_0)[1] = "# #";
    java.lang.Object[] __stackOp453_44_0 = spill453_26;
    java.lang.Object[] spill453_27 = __stackOp453_44_0;
    (__stackOp453_44_0)[2] = "###";
    java.lang.Object[] __stackOp453_45_0 = spill453_27;
    java.lang.Object[] spill453_28 = __stackOp453_45_0;
    (__stackOp453_45_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_46(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_48_0 = spill453_28;
    java.lang.Object[] spill453_29 = __stackOp453_48_0;
    (__stackOp453_48_0)[4] = net.minecraft.init.Blocks.e;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_23)).a(((net.minecraft.item.ItemStack)(spill453_24)), ((java.lang.Object[])(spill453_29)));
    net.minecraft.item.crafting.CraftingManager spill453_30 = p0;
    net.minecraft.item.ItemStack spill453_31 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ai);
    java.lang.Object[] __stackOp453_52_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_32 = __stackOp453_52_0;
    (__stackOp453_52_0)[0] = "##";
    java.lang.Object[] __stackOp453_53_0 = spill453_32;
    java.lang.Object[] spill453_33 = __stackOp453_53_0;
    (__stackOp453_53_0)[1] = "##";
    java.lang.Object[] __stackOp453_54_0 = spill453_33;
    java.lang.Object[] spill453_34 = __stackOp453_54_0;
    (__stackOp453_54_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_55(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_57_0 = spill453_34;
    java.lang.Object[] spill453_35 = __stackOp453_57_0;
    (__stackOp453_57_0)[3] = net.minecraft.init.Blocks.f;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_30)).a(((net.minecraft.item.ItemStack)(spill453_31)), ((java.lang.Object[])(spill453_35)));
    net.minecraft.item.crafting.CraftingManager spill453_36 = p0;
    net.minecraft.item.ItemStack spill453_37 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.A);
    java.lang.Object[] __stackOp453_61_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_38 = __stackOp453_61_0;
    (__stackOp453_61_0)[0] = "##";
    java.lang.Object[] __stackOp453_62_0 = spill453_38;
    java.lang.Object[] spill453_39 = __stackOp453_62_0;
    (__stackOp453_62_0)[1] = "##";
    java.lang.Object[] __stackOp453_63_0 = spill453_39;
    java.lang.Object[] spill453_40 = __stackOp453_63_0;
    (__stackOp453_63_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_64(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_66_0 = spill453_40;
    java.lang.Object[] spill453_41 = __stackOp453_66_0;
    (__stackOp453_66_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.m, 1, ((moom.ab)(moom.ab.SAND)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_36)).a(((net.minecraft.item.ItemStack)(spill453_37)), ((java.lang.Object[])(spill453_41)));
    net.minecraft.item.crafting.CraftingManager spill453_42 = p0;
    net.minecraft.item.ItemStack spill453_43 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cq);
    java.lang.Object[] __stackOp453_72_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_44 = __stackOp453_72_0;
    (__stackOp453_72_0)[0] = "##";
    java.lang.Object[] __stackOp453_73_0 = spill453_44;
    java.lang.Object[] spill453_45 = __stackOp453_73_0;
    (__stackOp453_73_0)[1] = "##";
    java.lang.Object[] __stackOp453_74_0 = spill453_45;
    java.lang.Object[] spill453_46 = __stackOp453_74_0;
    (__stackOp453_74_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_75(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_77_0 = spill453_46;
    java.lang.Object[] spill453_47 = __stackOp453_77_0;
    (__stackOp453_77_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.m, 1, ((moom.ab)(moom.ab.RED_SAND)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_42)).a(((net.minecraft.item.ItemStack)(spill453_43)), ((java.lang.Object[])(spill453_47)));
    net.minecraft.item.crafting.CraftingManager spill453_48 = p0;
    net.minecraft.item.ItemStack spill453_49 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.A, 4, ((moom.ac)(moom.ac.SMOOTH)).a());
    java.lang.Object[] __stackOp453_85_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_50 = __stackOp453_85_0;
    (__stackOp453_85_0)[0] = "##";
    java.lang.Object[] __stackOp453_86_0 = spill453_50;
    java.lang.Object[] spill453_51 = __stackOp453_86_0;
    (__stackOp453_86_0)[1] = "##";
    java.lang.Object[] __stackOp453_87_0 = spill453_51;
    java.lang.Object[] spill453_52 = __stackOp453_87_0;
    (__stackOp453_87_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_88(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_90_0 = spill453_52;
    java.lang.Object[] spill453_53 = __stackOp453_90_0;
    (__stackOp453_90_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.A, 1, ((moom.ac)(moom.ac.DEFAULT)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_48)).a(((net.minecraft.item.ItemStack)(spill453_49)), ((java.lang.Object[])(spill453_53)));
    net.minecraft.item.crafting.CraftingManager spill453_54 = p0;
    net.minecraft.item.ItemStack spill453_55 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cq, 4, ((moom.Y)(moom.Y.SMOOTH)).a());
    java.lang.Object[] __stackOp453_98_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_56 = __stackOp453_98_0;
    (__stackOp453_98_0)[0] = "##";
    java.lang.Object[] __stackOp453_99_0 = spill453_56;
    java.lang.Object[] spill453_57 = __stackOp453_99_0;
    (__stackOp453_99_0)[1] = "##";
    java.lang.Object[] __stackOp453_100_0 = spill453_57;
    java.lang.Object[] spill453_58 = __stackOp453_100_0;
    (__stackOp453_100_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_101(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_103_0 = spill453_58;
    java.lang.Object[] spill453_59 = __stackOp453_103_0;
    (__stackOp453_103_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cq, 1, ((moom.Y)(moom.Y.DEFAULT)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_54)).a(((net.minecraft.item.ItemStack)(spill453_55)), ((java.lang.Object[])(spill453_59)));
    net.minecraft.item.crafting.CraftingManager spill453_60 = p0;
    net.minecraft.item.ItemStack spill453_61 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.A, 1, ((moom.ac)(moom.ac.CHISELED)).a());
    java.lang.Object[] __stackOp453_111_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_62 = __stackOp453_111_0;
    (__stackOp453_111_0)[0] = "#";
    java.lang.Object[] __stackOp453_112_0 = spill453_62;
    java.lang.Object[] spill453_63 = __stackOp453_112_0;
    (__stackOp453_112_0)[1] = "#";
    java.lang.Object[] __stackOp453_113_0 = spill453_63;
    java.lang.Object[] spill453_64 = __stackOp453_113_0;
    (__stackOp453_113_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_114(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_116_0 = spill453_64;
    java.lang.Object[] spill453_65 = __stackOp453_116_0;
    (__stackOp453_116_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, 1, ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SAND)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_60)).a(((net.minecraft.item.ItemStack)(spill453_61)), ((java.lang.Object[])(spill453_65)));
    net.minecraft.item.crafting.CraftingManager spill453_66 = p0;
    net.minecraft.item.ItemStack spill453_67 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cq, 1, ((moom.Y)(moom.Y.CHISELED)).a());
    java.lang.Object[] __stackOp453_124_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_68 = __stackOp453_124_0;
    (__stackOp453_124_0)[0] = "#";
    java.lang.Object[] __stackOp453_125_0 = spill453_68;
    java.lang.Object[] spill453_69 = __stackOp453_125_0;
    (__stackOp453_125_0)[1] = "#";
    java.lang.Object[] __stackOp453_126_0 = spill453_69;
    java.lang.Object[] spill453_70 = __stackOp453_126_0;
    (__stackOp453_126_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_127(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_129_0 = spill453_70;
    java.lang.Object[] spill453_71 = __stackOp453_129_0;
    (__stackOp453_129_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ct, 1, ((moom.aq)(moom.aq.RED_SANDSTONE)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_66)).a(((net.minecraft.item.ItemStack)(spill453_67)), ((java.lang.Object[])(spill453_71)));
    net.minecraft.item.crafting.CraftingManager spill453_72 = p0;
    net.minecraft.item.ItemStack spill453_73 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b5, 1, ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.CHISELED)).a());
    java.lang.Object[] __stackOp453_137_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_74 = __stackOp453_137_0;
    (__stackOp453_137_0)[0] = "#";
    java.lang.Object[] __stackOp453_138_0 = spill453_74;
    java.lang.Object[] spill453_75 = __stackOp453_138_0;
    (__stackOp453_138_0)[1] = "#";
    java.lang.Object[] __stackOp453_139_0 = spill453_75;
    java.lang.Object[] spill453_76 = __stackOp453_139_0;
    (__stackOp453_139_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_140(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_142_0 = spill453_76;
    java.lang.Object[] spill453_77 = __stackOp453_142_0;
    (__stackOp453_142_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, 1, ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.QUARTZ)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_72)).a(((net.minecraft.item.ItemStack)(spill453_73)), ((java.lang.Object[])(spill453_77)));
    net.minecraft.item.crafting.CraftingManager spill453_78 = p0;
    net.minecraft.item.ItemStack spill453_79 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b5, 2, ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.LINES_Y)).a());
    java.lang.Object[] __stackOp453_150_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_80 = __stackOp453_150_0;
    (__stackOp453_150_0)[0] = "#";
    java.lang.Object[] __stackOp453_151_0 = spill453_80;
    java.lang.Object[] spill453_81 = __stackOp453_151_0;
    (__stackOp453_151_0)[1] = "#";
    java.lang.Object[] __stackOp453_152_0 = spill453_81;
    java.lang.Object[] spill453_82 = __stackOp453_152_0;
    (__stackOp453_152_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_153(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_155_0 = spill453_82;
    java.lang.Object[] spill453_83 = __stackOp453_155_0;
    (__stackOp453_155_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b5, 1, ((net.minecraft.block.BlockQuartz$EnumType)(net.minecraft.block.BlockQuartz$EnumType.DEFAULT)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_78)).a(((net.minecraft.item.ItemStack)(spill453_79)), ((java.lang.Object[])(spill453_83)));
    net.minecraft.item.crafting.CraftingManager spill453_84 = p0;
    net.minecraft.item.ItemStack spill453_85 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 4);
    java.lang.Object[] __stackOp453_161_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_86 = __stackOp453_161_0;
    (__stackOp453_161_0)[0] = "##";
    java.lang.Object[] __stackOp453_162_0 = spill453_86;
    java.lang.Object[] spill453_87 = __stackOp453_162_0;
    (__stackOp453_162_0)[1] = "##";
    java.lang.Object[] __stackOp453_163_0 = spill453_87;
    java.lang.Object[] spill453_88 = __stackOp453_163_0;
    (__stackOp453_163_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_164(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_166_0 = spill453_88;
    java.lang.Object[] spill453_89 = __stackOp453_166_0;
    (__stackOp453_166_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.STONE)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_84)).a(((net.minecraft.item.ItemStack)(spill453_85)), ((java.lang.Object[])(spill453_89)));
    net.minecraft.item.crafting.CraftingManager spill453_90 = p0;
    net.minecraft.item.ItemStack spill453_91 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 1, moom.ey.U);
    java.lang.Object[] __stackOp453_173_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_92 = __stackOp453_173_0;
    (__stackOp453_173_0)[0] = "#";
    java.lang.Object[] __stackOp453_174_0 = spill453_92;
    java.lang.Object[] spill453_93 = __stackOp453_174_0;
    (__stackOp453_174_0)[1] = "#";
    java.lang.Object[] __stackOp453_175_0 = spill453_93;
    java.lang.Object[] spill453_94 = __stackOp453_175_0;
    (__stackOp453_175_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_176(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_178_0 = spill453_94;
    java.lang.Object[] spill453_95 = __stackOp453_178_0;
    (__stackOp453_178_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.U, 1, ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_90)).a(((net.minecraft.item.ItemStack)(spill453_91)), ((java.lang.Object[])(spill453_95)));
    net.minecraft.item.crafting.CraftingManager spill453_96 = p0;
    net.minecraft.item.ItemStack spill453_97 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a5, 1, moom.ey.S);
    java.lang.Object[] __stackOp453_185_0 = new java.lang.Object[2];
    java.lang.Object[] spill453_98 = __stackOp453_185_0;
    (__stackOp453_185_0)[0] = net.minecraft.init.Blocks.a5;
    java.lang.Object[] __stackOp453_187_0 = spill453_98;
    java.lang.Object[] spill453_99 = __stackOp453_187_0;
    (__stackOp453_187_0)[1] = net.minecraft.init.Blocks.bc;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_96)).a__Void(((net.minecraft.item.ItemStack)(spill453_97)), ((java.lang.Object[])(spill453_99)));
    net.minecraft.item.crafting.CraftingManager spill453_100 = p0;
    net.minecraft.item.ItemStack spill453_101 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.Y, 1);
    java.lang.Object[] __stackOp453_191_0 = new java.lang.Object[2];
    java.lang.Object[] spill453_102 = __stackOp453_191_0;
    (__stackOp453_191_0)[0] = net.minecraft.init.Blocks.e;
    java.lang.Object[] __stackOp453_193_0 = spill453_102;
    java.lang.Object[] spill453_103 = __stackOp453_193_0;
    (__stackOp453_193_0)[1] = net.minecraft.init.Blocks.bc;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_100)).a__Void(((net.minecraft.item.ItemStack)(spill453_101)), ((java.lang.Object[])(spill453_103)));
    net.minecraft.item.crafting.CraftingManager spill453_104 = p0;
    net.minecraft.item.ItemStack spill453_105 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a8, __sourceIntrinsic_396de9353eae_invokedynamic453_197(19845, (6266540228390306766L ^ life2_3)));
    java.lang.Object[] __stackOp453_198_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_106 = __stackOp453_198_0;
    (__stackOp453_198_0)[0] = "###";
    java.lang.Object[] __stackOp453_199_0 = spill453_106;
    java.lang.Object[] spill453_107 = __stackOp453_199_0;
    (__stackOp453_199_0)[1] = "###";
    java.lang.Object[] __stackOp453_200_0 = spill453_107;
    java.lang.Object[] spill453_108 = __stackOp453_200_0;
    (__stackOp453_200_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_201(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_203_0 = spill453_108;
    java.lang.Object[] spill453_109 = __stackOp453_203_0;
    (__stackOp453_203_0)[3] = net.minecraft.init.Items.j;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_104)).a(((net.minecraft.item.ItemStack)(spill453_105)), ((java.lang.Object[])(spill453_109)));
    net.minecraft.item.crafting.CraftingManager spill453_110 = p0;
    net.minecraft.item.ItemStack spill453_111 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a9, __sourceIntrinsic_396de9353eae_invokedynamic453_207(20866, (7461060172268068827L ^ life2_3)));
    java.lang.Object[] __stackOp453_208_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_112 = __stackOp453_208_0;
    (__stackOp453_208_0)[0] = "###";
    java.lang.Object[] __stackOp453_209_0 = spill453_112;
    java.lang.Object[] spill453_113 = __stackOp453_209_0;
    (__stackOp453_209_0)[1] = "###";
    java.lang.Object[] __stackOp453_210_0 = spill453_113;
    java.lang.Object[] spill453_114 = __stackOp453_210_0;
    (__stackOp453_210_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_211(15290, (5426712229436995047L ^ life2_3)))));
    java.lang.Object[] __stackOp453_213_0 = spill453_114;
    java.lang.Object[] spill453_115 = __stackOp453_213_0;
    (__stackOp453_213_0)[3] = net.minecraft.init.Blocks.w;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_110)).a(((net.minecraft.item.ItemStack)(spill453_111)), ((java.lang.Object[])(spill453_115)));
    net.minecraft.item.crafting.CraftingManager spill453_116 = p0;
    net.minecraft.item.ItemStack spill453_117 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.by, 1);
    java.lang.Object[] __stackOp453_218_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic453_217(31926, (3553412792391463674L ^ life2_3))];
    java.lang.Object[] spill453_118 = __stackOp453_218_0;
    (__stackOp453_218_0)[0] = " R ";
    java.lang.Object[] __stackOp453_219_0 = spill453_118;
    java.lang.Object[] spill453_119 = __stackOp453_219_0;
    (__stackOp453_219_0)[1] = "RGR";
    java.lang.Object[] __stackOp453_220_0 = spill453_119;
    java.lang.Object[] spill453_120 = __stackOp453_220_0;
    (__stackOp453_220_0)[2] = " R ";
    java.lang.Object[] __stackOp453_221_0 = spill453_120;
    java.lang.Object[] spill453_121 = __stackOp453_221_0;
    (__stackOp453_221_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_222(29465, (457414767487745353L ^ life2_3)))));
    java.lang.Object[] __stackOp453_224_0 = spill453_121;
    java.lang.Object[] spill453_122 = __stackOp453_224_0;
    (__stackOp453_224_0)[4] = net.minecraft.init.Items.aC;
    java.lang.Object[] __stackOp453_226_0 = spill453_122;
    java.lang.Object[] spill453_123 = __stackOp453_226_0;
    (__stackOp453_226_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_227(17699, (7476331077812865898L ^ life2_3)))));
    java.lang.Object[] __stackOp453_229_0 = spill453_123;
    java.lang.Object[] spill453_124 = __stackOp453_229_0;
    (__stackOp453_229_0)[__sourceIntrinsic_396de9353eae_invokedynamic453_230(21082, (3298762691481000971L ^ life2_3))] = net.minecraft.init.Blocks.aX;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_116)).a(((net.minecraft.item.ItemStack)(spill453_117)), ((java.lang.Object[])(spill453_124)));
    net.minecraft.item.crafting.CraftingManager spill453_125 = p0;
    net.minecraft.item.ItemStack spill453_126 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bN, 1);
    java.lang.Object[] __stackOp453_235_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic453_234(25993, (1395953681882672095L ^ life2_3))];
    java.lang.Object[] spill453_127 = __stackOp453_235_0;
    (__stackOp453_235_0)[0] = "GGG";
    java.lang.Object[] __stackOp453_236_0 = spill453_127;
    java.lang.Object[] spill453_128 = __stackOp453_236_0;
    (__stackOp453_236_0)[1] = "GSG";
    java.lang.Object[] __stackOp453_237_0 = spill453_128;
    java.lang.Object[] spill453_129 = __stackOp453_237_0;
    (__stackOp453_237_0)[2] = "OOO";
    java.lang.Object[] __stackOp453_238_0 = spill453_129;
    java.lang.Object[] spill453_130 = __stackOp453_238_0;
    (__stackOp453_238_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_239(4395, (3096327170689507173L ^ life2_3)))));
    java.lang.Object[] __stackOp453_241_0 = spill453_130;
    java.lang.Object[] spill453_131 = __stackOp453_241_0;
    (__stackOp453_241_0)[4] = net.minecraft.init.Blocks.w;
    java.lang.Object[] __stackOp453_243_0 = spill453_131;
    java.lang.Object[] spill453_132 = __stackOp453_243_0;
    (__stackOp453_243_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_244(19167, (4087569555304596619L ^ life2_3)))));
    java.lang.Object[] __stackOp453_246_0 = spill453_132;
    java.lang.Object[] spill453_133 = __stackOp453_246_0;
    (__stackOp453_246_0)[__sourceIntrinsic_396de9353eae_invokedynamic453_247(21082, (3298762691481000971L ^ life2_3))] = net.minecraft.init.Items.bO;
    java.lang.Object[] __stackOp453_249_0 = spill453_133;
    java.lang.Object[] spill453_134 = __stackOp453_249_0;
    (__stackOp453_249_0)[__sourceIntrinsic_396de9353eae_invokedynamic453_250(31926, (3553412792391463674L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_251(17846, (103847415050685413L ^ life2_3)))));
    java.lang.Object[] __stackOp453_253_0 = spill453_134;
    java.lang.Object[] spill453_135 = __stackOp453_253_0;
    (__stackOp453_253_0)[__sourceIntrinsic_396de9353eae_invokedynamic453_254(22605, (4314775908421162520L ^ life2_3))] = net.minecraft.init.Blocks.Z;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_125)).a(((net.minecraft.item.ItemStack)(spill453_126)), ((java.lang.Object[])(spill453_135)));
    net.minecraft.item.crafting.CraftingManager spill453_136 = p0;
    net.minecraft.item.ItemStack spill453_137 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bn, 1);
    java.lang.Object[] __stackOp453_258_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_138 = __stackOp453_258_0;
    (__stackOp453_258_0)[0] = "NN";
    java.lang.Object[] __stackOp453_259_0 = spill453_138;
    java.lang.Object[] spill453_139 = __stackOp453_259_0;
    (__stackOp453_259_0)[1] = "NN";
    java.lang.Object[] __stackOp453_260_0 = spill453_139;
    java.lang.Object[] spill453_140 = __stackOp453_260_0;
    (__stackOp453_260_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_261(32418, (1819726372958466298L ^ life2_3)))));
    java.lang.Object[] __stackOp453_263_0 = spill453_140;
    java.lang.Object[] spill453_141 = __stackOp453_263_0;
    (__stackOp453_263_0)[3] = net.minecraft.init.Items.bU;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_136)).a(((net.minecraft.item.ItemStack)(spill453_137)), ((java.lang.Object[])(spill453_141)));
    net.minecraft.item.crafting.CraftingManager spill453_142 = p0;
    net.minecraft.item.ItemStack spill453_143 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 2, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.DIORITE)).a());
    java.lang.Object[] __stackOp453_270_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic453_269(21082, (3298762691481000971L ^ life2_3))];
    java.lang.Object[] spill453_144 = __stackOp453_270_0;
    (__stackOp453_270_0)[0] = "CQ";
    java.lang.Object[] __stackOp453_271_0 = spill453_144;
    java.lang.Object[] spill453_145 = __stackOp453_271_0;
    (__stackOp453_271_0)[1] = "QC";
    java.lang.Object[] __stackOp453_272_0 = spill453_145;
    java.lang.Object[] spill453_146 = __stackOp453_272_0;
    (__stackOp453_272_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_273(25802, (8300027473826441872L ^ life2_3)))));
    java.lang.Object[] __stackOp453_275_0 = spill453_146;
    java.lang.Object[] spill453_147 = __stackOp453_275_0;
    (__stackOp453_275_0)[3] = net.minecraft.init.Blocks.e;
    java.lang.Object[] __stackOp453_277_0 = spill453_147;
    java.lang.Object[] spill453_148 = __stackOp453_277_0;
    (__stackOp453_277_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_278(22632, (199910725572777523L ^ life2_3)))));
    java.lang.Object[] __stackOp453_280_0 = spill453_148;
    java.lang.Object[] spill453_149 = __stackOp453_280_0;
    (__stackOp453_280_0)[5] = net.minecraft.init.Items.bV;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_142)).a(((net.minecraft.item.ItemStack)(spill453_143)), ((java.lang.Object[])(spill453_149)));
    net.minecraft.item.crafting.CraftingManager spill453_150 = p0;
    net.minecraft.item.ItemStack spill453_151 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.GRANITE)).a());
    java.lang.Object[] __stackOp453_286_0 = new java.lang.Object[2];
    java.lang.Object[] spill453_152 = __stackOp453_286_0;
    (__stackOp453_286_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.DIORITE)).a());
    java.lang.Object[] __stackOp453_290_0 = spill453_152;
    java.lang.Object[] spill453_153 = __stackOp453_290_0;
    (__stackOp453_290_0)[1] = net.minecraft.init.Items.bV;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_150)).a__Void(((net.minecraft.item.ItemStack)(spill453_151)), ((java.lang.Object[])(spill453_153)));
    net.minecraft.item.crafting.CraftingManager spill453_154 = p0;
    net.minecraft.item.ItemStack spill453_155 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 2, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.ANDESITE)).a());
    java.lang.Object[] __stackOp453_296_0 = new java.lang.Object[2];
    java.lang.Object[] spill453_156 = __stackOp453_296_0;
    (__stackOp453_296_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.DIORITE)).a());
    java.lang.Object[] __stackOp453_300_0 = spill453_156;
    java.lang.Object[] spill453_157 = __stackOp453_300_0;
    (__stackOp453_300_0)[1] = net.minecraft.init.Blocks.e;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_154)).a__Void(((net.minecraft.item.ItemStack)(spill453_155)), ((java.lang.Object[])(spill453_157)));
    net.minecraft.item.crafting.CraftingManager spill453_158 = p0;
    net.minecraft.item.ItemStack spill453_159 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.d, 4, ((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.COARSE_DIRT)).a());
    java.lang.Object[] __stackOp453_307_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic453_306(21082, (3298762691481000971L ^ life2_3))];
    java.lang.Object[] spill453_160 = __stackOp453_307_0;
    (__stackOp453_307_0)[0] = "DG";
    java.lang.Object[] __stackOp453_308_0 = spill453_160;
    java.lang.Object[] spill453_161 = __stackOp453_308_0;
    (__stackOp453_308_0)[1] = "GD";
    java.lang.Object[] __stackOp453_309_0 = spill453_161;
    java.lang.Object[] spill453_162 = __stackOp453_309_0;
    (__stackOp453_309_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_310(8326, (6473335402429820633L ^ life2_3)))));
    java.lang.Object[] __stackOp453_312_0 = spill453_162;
    java.lang.Object[] spill453_163 = __stackOp453_312_0;
    (__stackOp453_312_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.d, 1, ((net.minecraft.block.BlockDirt$DirtType)(net.minecraft.block.BlockDirt$DirtType.DIRT)).a());
    java.lang.Object[] __stackOp453_316_0 = spill453_163;
    java.lang.Object[] spill453_164 = __stackOp453_316_0;
    (__stackOp453_316_0)[4] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_317(4395, (3096327170689507173L ^ life2_3)))));
    java.lang.Object[] __stackOp453_319_0 = spill453_164;
    java.lang.Object[] spill453_165 = __stackOp453_319_0;
    (__stackOp453_319_0)[5] = net.minecraft.init.Blocks.n;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_158)).a(((net.minecraft.item.ItemStack)(spill453_159)), ((java.lang.Object[])(spill453_165)));
    net.minecraft.item.crafting.CraftingManager spill453_166 = p0;
    net.minecraft.item.ItemStack spill453_167 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 4, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.DIORITE_SMOOTH)).a());
    java.lang.Object[] __stackOp453_325_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_168 = __stackOp453_325_0;
    (__stackOp453_325_0)[0] = "SS";
    java.lang.Object[] __stackOp453_326_0 = spill453_168;
    java.lang.Object[] spill453_169 = __stackOp453_326_0;
    (__stackOp453_326_0)[1] = "SS";
    java.lang.Object[] __stackOp453_327_0 = spill453_169;
    java.lang.Object[] spill453_170 = __stackOp453_327_0;
    (__stackOp453_327_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_328(12128, (3729918232476885310L ^ life2_3)))));
    java.lang.Object[] __stackOp453_330_0 = spill453_170;
    java.lang.Object[] spill453_171 = __stackOp453_330_0;
    (__stackOp453_330_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.DIORITE)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_166)).a(((net.minecraft.item.ItemStack)(spill453_167)), ((java.lang.Object[])(spill453_171)));
    net.minecraft.item.crafting.CraftingManager spill453_172 = p0;
    net.minecraft.item.ItemStack spill453_173 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 4, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.GRANITE_SMOOTH)).a());
    java.lang.Object[] __stackOp453_338_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_174 = __stackOp453_338_0;
    (__stackOp453_338_0)[0] = "SS";
    java.lang.Object[] __stackOp453_339_0 = spill453_174;
    java.lang.Object[] spill453_175 = __stackOp453_339_0;
    (__stackOp453_339_0)[1] = "SS";
    java.lang.Object[] __stackOp453_340_0 = spill453_175;
    java.lang.Object[] spill453_176 = __stackOp453_340_0;
    (__stackOp453_340_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_341(12128, (3729918232476885310L ^ life2_3)))));
    java.lang.Object[] __stackOp453_343_0 = spill453_176;
    java.lang.Object[] spill453_177 = __stackOp453_343_0;
    (__stackOp453_343_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.GRANITE)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_172)).a(((net.minecraft.item.ItemStack)(spill453_173)), ((java.lang.Object[])(spill453_177)));
    net.minecraft.item.crafting.CraftingManager spill453_178 = p0;
    net.minecraft.item.ItemStack spill453_179 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 4, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.ANDESITE_SMOOTH)).a());
    java.lang.Object[] __stackOp453_351_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_180 = __stackOp453_351_0;
    (__stackOp453_351_0)[0] = "SS";
    java.lang.Object[] __stackOp453_352_0 = spill453_180;
    java.lang.Object[] spill453_181 = __stackOp453_352_0;
    (__stackOp453_352_0)[1] = "SS";
    java.lang.Object[] __stackOp453_353_0 = spill453_181;
    java.lang.Object[] spill453_182 = __stackOp453_353_0;
    (__stackOp453_353_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_354(12128, (3729918232476885310L ^ life2_3)))));
    java.lang.Object[] __stackOp453_356_0 = spill453_182;
    java.lang.Object[] spill453_183 = __stackOp453_356_0;
    (__stackOp453_356_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b, 1, ((net.minecraft.block.BlockStone$EnumType)(net.minecraft.block.BlockStone$EnumType.ANDESITE)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_178)).a(((net.minecraft.item.ItemStack)(spill453_179)), ((java.lang.Object[])(spill453_183)));
    net.minecraft.item.crafting.CraftingManager spill453_184 = p0;
    net.minecraft.item.ItemStack spill453_185 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cm, 1, moom.d0.R);
    java.lang.Object[] __stackOp453_363_0 = new java.lang.Object[4];
    java.lang.Object[] spill453_186 = __stackOp453_363_0;
    (__stackOp453_363_0)[0] = "SS";
    java.lang.Object[] __stackOp453_364_0 = spill453_186;
    java.lang.Object[] spill453_187 = __stackOp453_364_0;
    (__stackOp453_364_0)[1] = "SS";
    java.lang.Object[] __stackOp453_365_0 = spill453_187;
    java.lang.Object[] spill453_188 = __stackOp453_365_0;
    (__stackOp453_365_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_366(12128, (3729918232476885310L ^ life2_3)))));
    java.lang.Object[] __stackOp453_368_0 = spill453_188;
    java.lang.Object[] spill453_189 = __stackOp453_368_0;
    (__stackOp453_368_0)[3] = net.minecraft.init.Items.cg;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_184)).a(((net.minecraft.item.ItemStack)(spill453_185)), ((java.lang.Object[])(spill453_189)));
    net.minecraft.item.crafting.CraftingManager spill453_190 = p0;
    net.minecraft.item.ItemStack spill453_191 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cm, 1, moom.d0.S);
    java.lang.Object[] __stackOp453_373_0 = new java.lang.Object[5];
    java.lang.Object[] spill453_192 = __stackOp453_373_0;
    (__stackOp453_373_0)[0] = "SSS";
    java.lang.Object[] __stackOp453_374_0 = spill453_192;
    java.lang.Object[] spill453_193 = __stackOp453_374_0;
    (__stackOp453_374_0)[1] = "SSS";
    java.lang.Object[] __stackOp453_375_0 = spill453_193;
    java.lang.Object[] spill453_194 = __stackOp453_375_0;
    (__stackOp453_375_0)[2] = "SSS";
    java.lang.Object[] __stackOp453_376_0 = spill453_194;
    java.lang.Object[] spill453_195 = __stackOp453_376_0;
    (__stackOp453_376_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_377(12128, (3729918232476885310L ^ life2_3)))));
    java.lang.Object[] __stackOp453_379_0 = spill453_195;
    java.lang.Object[] spill453_196 = __stackOp453_379_0;
    (__stackOp453_379_0)[4] = net.minecraft.init.Items.cg;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_190)).a(((net.minecraft.item.ItemStack)(spill453_191)), ((java.lang.Object[])(spill453_196)));
    net.minecraft.item.crafting.CraftingManager spill453_197 = p0;
    net.minecraft.item.ItemStack spill453_198 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cm, 1, moom.d0.T);
    java.lang.Object[] __stackOp453_385_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic453_384(31926, (3553412792391463674L ^ life2_3))];
    java.lang.Object[] spill453_199 = __stackOp453_385_0;
    (__stackOp453_385_0)[0] = "SSS";
    java.lang.Object[] __stackOp453_386_0 = spill453_199;
    java.lang.Object[] spill453_200 = __stackOp453_386_0;
    (__stackOp453_386_0)[1] = "SIS";
    java.lang.Object[] __stackOp453_387_0 = spill453_200;
    java.lang.Object[] spill453_201 = __stackOp453_387_0;
    (__stackOp453_387_0)[2] = "SSS";
    java.lang.Object[] __stackOp453_388_0 = spill453_201;
    java.lang.Object[] spill453_202 = __stackOp453_388_0;
    (__stackOp453_388_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_389(12128, (3729918232476885310L ^ life2_3)))));
    java.lang.Object[] __stackOp453_391_0 = spill453_202;
    java.lang.Object[] spill453_203 = __stackOp453_391_0;
    (__stackOp453_391_0)[4] = net.minecraft.init.Items.cg;
    java.lang.Object[] __stackOp453_393_0 = spill453_203;
    java.lang.Object[] spill453_204 = __stackOp453_393_0;
    (__stackOp453_393_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_394(8089, (5359404229445915077L ^ life2_3)))));
    java.lang.Object[] __stackOp453_396_0 = spill453_204;
    java.lang.Object[] spill453_205 = __stackOp453_396_0;
    (__stackOp453_396_0)[__sourceIntrinsic_396de9353eae_invokedynamic453_397(21082, (3298762691481000971L ^ life2_3))] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill453_197)).a(((net.minecraft.item.ItemStack)(spill453_198)), ((java.lang.Object[])(spill453_205)));
    net.minecraft.item.crafting.CraftingManager spill453_206 = p0;
    net.minecraft.item.ItemStack spill453_207 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cn, 1, 0);
    java.lang.Object[] __stackOp453_404_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic453_403(31926, (3553412792391463674L ^ life2_3))];
    java.lang.Object[] spill453_208 = __stackOp453_404_0;
    (__stackOp453_404_0)[0] = "SCS";
    java.lang.Object[] __stackOp453_405_0 = spill453_208;
    java.lang.Object[] spill453_209 = __stackOp453_405_0;
    (__stackOp453_405_0)[1] = "CCC";
    java.lang.Object[] __stackOp453_406_0 = spill453_209;
    java.lang.Object[] spill453_210 = __stackOp453_406_0;
    (__stackOp453_406_0)[2] = "SCS";
    java.lang.Object[] __stackOp453_407_0 = spill453_210;
    java.lang.Object[] spill453_211 = __stackOp453_407_0;
    (__stackOp453_407_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_408(12128, (3729918232476885310L ^ life2_3)))));
    java.lang.Object[] __stackOp453_410_0 = spill453_211;
    java.lang.Object[] spill453_212 = __stackOp453_410_0;
    (__stackOp453_410_0)[4] = net.minecraft.init.Items.cg;
    java.lang.Object[] __stackOp453_412_0 = spill453_212;
    java.lang.Object[] spill453_213 = __stackOp453_412_0;
    (__stackOp453_412_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic453_413(31068, (3114205825805416211L ^ life2_3)))));
    java.lang.Object[] __stackOp453_415_0 = spill453_213;
    java.lang.Object[] spill453_214 = __stackOp453_415_0;
    (__stackOp453_415_0)[__sourceIntrinsic_396de9353eae_invokedynamic453_416(21082, (3298762691481000971L ^ life2_3))] = net.minecraft.init.Items.ch;
    ((net.minecraft.item.crafting.CraftingManager)(spill453_206)).a(((net.minecraft.item.ItemStack)(spill453_207)), ((java.lang.Object[])(spill453_214)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9670_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_201(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_217(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_222(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_234(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_244(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_247(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_250(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_261(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_269(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_273(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_278(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_306(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_310(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_317(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_328(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_341(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_354(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_366(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_377(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_384(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_389(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_394(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_397(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_403(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_408(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_413(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic453_416(int a0, long a1) throws E;
}
