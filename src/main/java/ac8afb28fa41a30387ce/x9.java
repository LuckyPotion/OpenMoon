package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class x9 {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public x9() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(1087240688777221789L)), ((long)(4894883165171209637L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(26937541093699L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.x9.a ^ 134808791795391L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1669_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1669_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1669_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1669_14 = new byte[8];
    (__sourceSpill1669_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1669_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1669_16 = __sourceSpill1669_14;
    ((javax.crypto.Cipher)(__sourceSpill1669_11)).init(((int)(__sourceSpill1669_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1669_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1669_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "±ÏL|Òøùßåû\017\004·é¼\033\rÜ:EÁb{oÙi\bßg¶ñÌ(é¿R14t´ùHg,UJ­¦F-rô(è~ûò>Ú\005\033*´3TMû\022\teò\b\000]ð­Éò¼"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1669_25 = local6_life21;
        int __sourceSpill1669_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1669_25)).substring(((int)(__sourceSpill1669_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1669_30 = local8_life19;
        int __sourceSpill1669_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1669_33 = new byte[8];
        (__sourceSpill1669_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1669_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1669_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1669_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1669_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1669_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1669_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1669_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1669_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1669_34)).doFinal(((byte[])(__sourceSpill1669_33)));
        (__sourceSpill1669_30)[__sourceSpill1669_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "±æ\023Z>\bK±Ï·ÏÛ)±\t"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1669_38 = local6_life21;
        int __sourceSpill1669_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1669_38)).substring(((int)(__sourceSpill1669_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1669_43 = local8_life19;
        int __sourceSpill1669_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1669_46 = new byte[8];
        (__sourceSpill1669_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1669_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1669_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1669_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1669_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1669_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1669_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1669_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1669_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1669_47)).doFinal(((byte[])(__sourceSpill1669_46)));
        (__sourceSpill1669_43)[__sourceSpill1669_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[14]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9671_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/x9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.x9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29591;
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
            throw new RuntimeException("moom/x9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.item.crafting.CraftingManager p0) {
long life2_3;
    int life4_5;
    int life4_965;
    life2_3 = (moom.x9.a ^ 87650806689120L);
    life4_5 = 0;
    loop_region_6: while ((life4_5 < __sourceIntrinsic_396de9353eae_invokedynamic1405_1(20131, (4921326033874212989L ^ life2_3)))) {
        net.minecraft.item.crafting.CraftingManager spill1405_0 = p0;
        net.minecraft.item.ItemStack spill1405_1 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.L, 1, life4_5);
        java.lang.Object[] __stackOp1405_3_0 = new java.lang.Object[2];
        java.lang.Object[] spill1405_2 = __stackOp1405_3_0;
        (__stackOp1405_3_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, (__sourceIntrinsic_396de9353eae_invokedynamic1405_5(27853, (8060637110262790687L ^ life2_3)) - life4_5));
        java.lang.Object[] __stackOp1405_6_0 = spill1405_2;
        java.lang.Object[] spill1405_3 = __stackOp1405_6_0;
        (__stackOp1405_6_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L))), 1, 0);
        ((net.minecraft.item.crafting.CraftingManager)(spill1405_0)).a__Void(((net.minecraft.item.ItemStack)(spill1405_1)), ((java.lang.Object[])(spill1405_3)));
        net.minecraft.item.crafting.CraftingManager spill1405_4 = p0;
        net.minecraft.item.ItemStack spill1405_5 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.b9, __sourceIntrinsic_396de9353eae_invokedynamic1405_11(12744, (5634520312696973085L ^ life2_3)), (__sourceIntrinsic_396de9353eae_invokedynamic1405_12(23302, (1643376134443912667L ^ life2_3)) - life4_5));
        java.lang.Object[] __stackOp1405_14_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic1405_13(24062, (537748909564316452L ^ life2_3))];
        java.lang.Object[] spill1405_6 = __stackOp1405_14_0;
        (__stackOp1405_14_0)[0] = "###";
        java.lang.Object[] __stackOp1405_15_0 = spill1405_6;
        java.lang.Object[] spill1405_7 = __stackOp1405_15_0;
        (__stackOp1405_15_0)[1] = "#X#";
        java.lang.Object[] __stackOp1405_16_0 = spill1405_7;
        java.lang.Object[] spill1405_8 = __stackOp1405_16_0;
        (__stackOp1405_16_0)[2] = "###";
        java.lang.Object[] __stackOp1405_17_0 = spill1405_8;
        java.lang.Object[] spill1405_9 = __stackOp1405_17_0;
        (__stackOp1405_17_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1405_18(19139, (1747468170503347223L ^ life2_3)))));
        java.lang.Object[] __stackOp1405_20_0 = spill1405_9;
        java.lang.Object[] spill1405_10 = __stackOp1405_20_0;
        (__stackOp1405_20_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cd);
        java.lang.Object[] __stackOp1405_22_0 = spill1405_10;
        java.lang.Object[] spill1405_11 = __stackOp1405_22_0;
        (__stackOp1405_22_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1405_23(4298, (5062712414598661659L ^ life2_3)))));
        java.lang.Object[] __stackOp1405_25_0 = spill1405_11;
        java.lang.Object[] spill1405_12 = __stackOp1405_25_0;
        (__stackOp1405_25_0)[__sourceIntrinsic_396de9353eae_invokedynamic1405_26(26660, (4298972562170674939L ^ life2_3))] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, life4_5);
        ((net.minecraft.item.crafting.CraftingManager)(spill1405_4)).a(((net.minecraft.item.ItemStack)(spill1405_5)), ((java.lang.Object[])(spill1405_12)));
        net.minecraft.item.crafting.CraftingManager spill1405_13 = p0;
        net.minecraft.item.ItemStack spill1405_14 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ck, __sourceIntrinsic_396de9353eae_invokedynamic1405_30(16317, (148854029206169965L ^ life2_3)), (__sourceIntrinsic_396de9353eae_invokedynamic1405_31(23302, (1643376134443912667L ^ life2_3)) - life4_5));
        java.lang.Object[] __stackOp1405_33_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic1405_32(6639, (4200779430700453692L ^ life2_3))];
        java.lang.Object[] spill1405_15 = __stackOp1405_33_0;
        (__stackOp1405_33_0)[0] = "###";
        java.lang.Object[] __stackOp1405_34_0 = spill1405_15;
        java.lang.Object[] spill1405_16 = __stackOp1405_34_0;
        (__stackOp1405_34_0)[1] = "#X#";
        java.lang.Object[] __stackOp1405_35_0 = spill1405_16;
        java.lang.Object[] spill1405_17 = __stackOp1405_35_0;
        (__stackOp1405_35_0)[2] = "###";
        java.lang.Object[] __stackOp1405_36_0 = spill1405_17;
        java.lang.Object[] spill1405_18 = __stackOp1405_36_0;
        (__stackOp1405_36_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1405_37(13342, (4502607240059069127L ^ life2_3)))));
        java.lang.Object[] __stackOp1405_39_0 = spill1405_18;
        java.lang.Object[] spill1405_19 = __stackOp1405_39_0;
        (__stackOp1405_39_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.w);
        java.lang.Object[] __stackOp1405_41_0 = spill1405_19;
        java.lang.Object[] spill1405_20 = __stackOp1405_41_0;
        (__stackOp1405_41_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1405_42(17253, (8914402753558566329L ^ life2_3)))));
        java.lang.Object[] __stackOp1405_44_0 = spill1405_20;
        java.lang.Object[] spill1405_21 = __stackOp1405_44_0;
        (__stackOp1405_44_0)[__sourceIntrinsic_396de9353eae_invokedynamic1405_45(9047, (8683191569128273295L ^ life2_3))] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, life4_5);
        ((net.minecraft.item.crafting.CraftingManager)(spill1405_13)).a(((net.minecraft.item.ItemStack)(spill1405_14)), ((java.lang.Object[])(spill1405_21)));
        net.minecraft.item.crafting.CraftingManager spill1405_22 = p0;
        net.minecraft.item.ItemStack spill1405_23 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cl, __sourceIntrinsic_396de9353eae_invokedynamic1405_49(6990, (1825079853759827349L ^ life2_3)), life4_5);
        java.lang.Object[] __stackOp1405_50_0 = new java.lang.Object[4];
        java.lang.Object[] spill1405_24 = __stackOp1405_50_0;
        (__stackOp1405_50_0)[0] = "###";
        java.lang.Object[] __stackOp1405_51_0 = spill1405_24;
        java.lang.Object[] spill1405_25 = __stackOp1405_51_0;
        (__stackOp1405_51_0)[1] = "###";
        java.lang.Object[] __stackOp1405_52_0 = spill1405_25;
        java.lang.Object[] spill1405_26 = __stackOp1405_52_0;
        (__stackOp1405_52_0)[2] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1405_53(13342, (4502607240059069127L ^ life2_3)))));
        java.lang.Object[] __stackOp1405_55_0 = spill1405_26;
        java.lang.Object[] spill1405_27 = __stackOp1405_55_0;
        (__stackOp1405_55_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.ck, 1, life4_5);
        ((net.minecraft.item.crafting.CraftingManager)(spill1405_22)).a(((net.minecraft.item.ItemStack)(spill1405_23)), ((java.lang.Object[])(spill1405_27)));
        life4_5 += 1;
    }
    net.minecraft.item.crafting.CraftingManager spill1405_28 = p0;
    net.minecraft.item.ItemStack spill1405_29 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).b());
    java.lang.Object[] __stackOp1405_61_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_30 = __stackOp1405_61_0;
    (__stackOp1405_61_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.N, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.DANDELION)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_28)).a__Void(((net.minecraft.item.ItemStack)(spill1405_29)), ((java.lang.Object[])(spill1405_30)));
    net.minecraft.item.crafting.CraftingManager spill1405_31 = p0;
    net.minecraft.item.ItemStack spill1405_32 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_69_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_33 = __stackOp1405_69_0;
    (__stackOp1405_69_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.POPPY)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_31)).a__Void(((net.minecraft.item.ItemStack)(spill1405_32)), ((java.lang.Object[])(spill1405_33)));
    net.minecraft.item.crafting.CraftingManager spill1405_34 = p0;
    net.minecraft.item.ItemStack spill1405_35 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 3, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    java.lang.Object[] __stackOp1405_77_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_36 = __stackOp1405_77_0;
    (__stackOp1405_77_0)[0] = net.minecraft.init.Items.aX;
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_34)).a__Void(((net.minecraft.item.ItemStack)(spill1405_35)), ((java.lang.Object[])(spill1405_36)));
    net.minecraft.item.crafting.CraftingManager spill1405_37 = p0;
    net.minecraft.item.ItemStack spill1405_38 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).b());
    java.lang.Object[] __stackOp1405_83_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_39 = __stackOp1405_83_0;
    (__stackOp1405_83_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_87_0 = spill1405_39;
    java.lang.Object[] spill1405_40 = __stackOp1405_87_0;
    (__stackOp1405_87_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_37)).a__Void(((net.minecraft.item.ItemStack)(spill1405_38)), ((java.lang.Object[])(spill1405_40)));
    net.minecraft.item.crafting.CraftingManager spill1405_41 = p0;
    net.minecraft.item.ItemStack spill1405_42 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).b());
    java.lang.Object[] __stackOp1405_95_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_43 = __stackOp1405_95_0;
    (__stackOp1405_95_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_99_0 = spill1405_43;
    java.lang.Object[] spill1405_44 = __stackOp1405_99_0;
    (__stackOp1405_99_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_41)).a__Void(((net.minecraft.item.ItemStack)(spill1405_42)), ((java.lang.Object[])(spill1405_44)));
    net.minecraft.item.crafting.CraftingManager spill1405_45 = p0;
    net.minecraft.item.ItemStack spill1405_46 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIME)).b());
    java.lang.Object[] __stackOp1405_107_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_47 = __stackOp1405_107_0;
    (__stackOp1405_107_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).b());
    java.lang.Object[] __stackOp1405_111_0 = spill1405_47;
    java.lang.Object[] spill1405_48 = __stackOp1405_111_0;
    (__stackOp1405_111_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_45)).a__Void(((net.minecraft.item.ItemStack)(spill1405_46)), ((java.lang.Object[])(spill1405_48)));
    net.minecraft.item.crafting.CraftingManager spill1405_49 = p0;
    net.minecraft.item.ItemStack spill1405_50 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).b());
    java.lang.Object[] __stackOp1405_119_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_51 = __stackOp1405_119_0;
    (__stackOp1405_119_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).b());
    java.lang.Object[] __stackOp1405_123_0 = spill1405_51;
    java.lang.Object[] spill1405_52 = __stackOp1405_123_0;
    (__stackOp1405_123_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_49)).a__Void(((net.minecraft.item.ItemStack)(spill1405_50)), ((java.lang.Object[])(spill1405_52)));
    net.minecraft.item.crafting.CraftingManager spill1405_53 = p0;
    net.minecraft.item.ItemStack spill1405_54 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).b());
    java.lang.Object[] __stackOp1405_131_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_55 = __stackOp1405_131_0;
    (__stackOp1405_131_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GRAY)).b());
    java.lang.Object[] __stackOp1405_135_0 = spill1405_55;
    java.lang.Object[] spill1405_56 = __stackOp1405_135_0;
    (__stackOp1405_135_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_53)).a__Void(((net.minecraft.item.ItemStack)(spill1405_54)), ((java.lang.Object[])(spill1405_56)));
    net.minecraft.item.crafting.CraftingManager spill1405_57 = p0;
    net.minecraft.item.ItemStack spill1405_58 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 3, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).b());
    java.lang.Object[] __stackOp1405_143_0 = new java.lang.Object[3];
    java.lang.Object[] spill1405_59 = __stackOp1405_143_0;
    (__stackOp1405_143_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).b());
    java.lang.Object[] __stackOp1405_147_0 = spill1405_59;
    java.lang.Object[] spill1405_60 = __stackOp1405_147_0;
    (__stackOp1405_147_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    java.lang.Object[] __stackOp1405_151_0 = spill1405_60;
    java.lang.Object[] spill1405_61 = __stackOp1405_151_0;
    (__stackOp1405_151_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_57)).a__Void(((net.minecraft.item.ItemStack)(spill1405_58)), ((java.lang.Object[])(spill1405_61)));
    net.minecraft.item.crafting.CraftingManager spill1405_62 = p0;
    net.minecraft.item.ItemStack spill1405_63 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).b());
    java.lang.Object[] __stackOp1405_159_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_64 = __stackOp1405_159_0;
    (__stackOp1405_159_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b());
    java.lang.Object[] __stackOp1405_163_0 = spill1405_64;
    java.lang.Object[] spill1405_65 = __stackOp1405_163_0;
    (__stackOp1405_163_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_62)).a__Void(((net.minecraft.item.ItemStack)(spill1405_63)), ((java.lang.Object[])(spill1405_65)));
    net.minecraft.item.crafting.CraftingManager spill1405_66 = p0;
    net.minecraft.item.ItemStack spill1405_67 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.CYAN)).b());
    java.lang.Object[] __stackOp1405_171_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_68 = __stackOp1405_171_0;
    (__stackOp1405_171_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b());
    java.lang.Object[] __stackOp1405_175_0 = spill1405_68;
    java.lang.Object[] spill1405_69 = __stackOp1405_175_0;
    (__stackOp1405_175_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.GREEN)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_66)).a__Void(((net.minecraft.item.ItemStack)(spill1405_67)), ((java.lang.Object[])(spill1405_69)));
    net.minecraft.item.crafting.CraftingManager spill1405_70 = p0;
    net.minecraft.item.ItemStack spill1405_71 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).b());
    java.lang.Object[] __stackOp1405_183_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_72 = __stackOp1405_183_0;
    (__stackOp1405_183_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b());
    java.lang.Object[] __stackOp1405_187_0 = spill1405_72;
    java.lang.Object[] spill1405_73 = __stackOp1405_187_0;
    (__stackOp1405_187_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_70)).a__Void(((net.minecraft.item.ItemStack)(spill1405_71)), ((java.lang.Object[])(spill1405_73)));
    net.minecraft.item.crafting.CraftingManager spill1405_74 = p0;
    net.minecraft.item.ItemStack spill1405_75 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).b());
    java.lang.Object[] __stackOp1405_195_0 = new java.lang.Object[2];
    java.lang.Object[] spill1405_76 = __stackOp1405_195_0;
    (__stackOp1405_195_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PURPLE)).b());
    java.lang.Object[] __stackOp1405_199_0 = spill1405_76;
    java.lang.Object[] spill1405_77 = __stackOp1405_199_0;
    (__stackOp1405_199_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_74)).a__Void(((net.minecraft.item.ItemStack)(spill1405_75)), ((java.lang.Object[])(spill1405_77)));
    net.minecraft.item.crafting.CraftingManager spill1405_78 = p0;
    net.minecraft.item.ItemStack spill1405_79 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 3, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).b());
    java.lang.Object[] __stackOp1405_207_0 = new java.lang.Object[3];
    java.lang.Object[] spill1405_80 = __stackOp1405_207_0;
    (__stackOp1405_207_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b());
    java.lang.Object[] __stackOp1405_211_0 = spill1405_80;
    java.lang.Object[] spill1405_81 = __stackOp1405_211_0;
    (__stackOp1405_211_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_215_0 = spill1405_81;
    java.lang.Object[] spill1405_82 = __stackOp1405_215_0;
    (__stackOp1405_215_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_78)).a__Void(((net.minecraft.item.ItemStack)(spill1405_79)), ((java.lang.Object[])(spill1405_82)));
    net.minecraft.item.crafting.CraftingManager spill1405_83 = p0;
    net.minecraft.item.ItemStack spill1405_84 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 4, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).b());
    java.lang.Object[] __stackOp1405_223_0 = new java.lang.Object[4];
    java.lang.Object[] spill1405_85 = __stackOp1405_223_0;
    (__stackOp1405_223_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b());
    java.lang.Object[] __stackOp1405_227_0 = spill1405_85;
    java.lang.Object[] spill1405_86 = __stackOp1405_227_0;
    (__stackOp1405_227_0)[1] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_231_0 = spill1405_86;
    java.lang.Object[] spill1405_87 = __stackOp1405_231_0;
    (__stackOp1405_231_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_235_0 = spill1405_87;
    java.lang.Object[] spill1405_88 = __stackOp1405_235_0;
    (__stackOp1405_235_0)[3] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.WHITE)).b());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_83)).a__Void(((net.minecraft.item.ItemStack)(spill1405_84)), ((java.lang.Object[])(spill1405_88)));
    net.minecraft.item.crafting.CraftingManager spill1405_89 = p0;
    net.minecraft.item.ItemStack spill1405_90 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.LIGHT_BLUE)).b());
    java.lang.Object[] __stackOp1405_243_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_91 = __stackOp1405_243_0;
    (__stackOp1405_243_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.BLUE_ORCHID)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_89)).a__Void(((net.minecraft.item.ItemStack)(spill1405_90)), ((java.lang.Object[])(spill1405_91)));
    net.minecraft.item.crafting.CraftingManager spill1405_92 = p0;
    net.minecraft.item.ItemStack spill1405_93 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).b());
    java.lang.Object[] __stackOp1405_251_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_94 = __stackOp1405_251_0;
    (__stackOp1405_251_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.ALLIUM)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_92)).a__Void(((net.minecraft.item.ItemStack)(spill1405_93)), ((java.lang.Object[])(spill1405_94)));
    net.minecraft.item.crafting.CraftingManager spill1405_95 = p0;
    net.minecraft.item.ItemStack spill1405_96 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).b());
    java.lang.Object[] __stackOp1405_259_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_97 = __stackOp1405_259_0;
    (__stackOp1405_259_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.HOUSTONIA)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_95)).a__Void(((net.minecraft.item.ItemStack)(spill1405_96)), ((java.lang.Object[])(spill1405_97)));
    net.minecraft.item.crafting.CraftingManager spill1405_98 = p0;
    net.minecraft.item.ItemStack spill1405_99 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_267_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_100 = __stackOp1405_267_0;
    (__stackOp1405_267_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.RED_TULIP)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_98)).a__Void(((net.minecraft.item.ItemStack)(spill1405_99)), ((java.lang.Object[])(spill1405_100)));
    net.minecraft.item.crafting.CraftingManager spill1405_101 = p0;
    net.minecraft.item.ItemStack spill1405_102 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).b());
    java.lang.Object[] __stackOp1405_275_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_103 = __stackOp1405_275_0;
    (__stackOp1405_275_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.ORANGE_TULIP)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_101)).a__Void(((net.minecraft.item.ItemStack)(spill1405_102)), ((java.lang.Object[])(spill1405_103)));
    net.minecraft.item.crafting.CraftingManager spill1405_104 = p0;
    net.minecraft.item.ItemStack spill1405_105 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).b());
    java.lang.Object[] __stackOp1405_283_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_106 = __stackOp1405_283_0;
    (__stackOp1405_283_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.WHITE_TULIP)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_104)).a__Void(((net.minecraft.item.ItemStack)(spill1405_105)), ((java.lang.Object[])(spill1405_106)));
    net.minecraft.item.crafting.CraftingManager spill1405_107 = p0;
    net.minecraft.item.ItemStack spill1405_108 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).b());
    java.lang.Object[] __stackOp1405_291_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_109 = __stackOp1405_291_0;
    (__stackOp1405_291_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.PINK_TULIP)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_107)).a__Void(((net.minecraft.item.ItemStack)(spill1405_108)), ((java.lang.Object[])(spill1405_109)));
    net.minecraft.item.crafting.CraftingManager spill1405_110 = p0;
    net.minecraft.item.ItemStack spill1405_111 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.SILVER)).b());
    java.lang.Object[] __stackOp1405_299_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_112 = __stackOp1405_299_0;
    (__stackOp1405_299_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.O, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.OXEYE_DAISY)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_110)).a__Void(((net.minecraft.item.ItemStack)(spill1405_111)), ((java.lang.Object[])(spill1405_112)));
    net.minecraft.item.crafting.CraftingManager spill1405_113 = p0;
    net.minecraft.item.ItemStack spill1405_114 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.YELLOW)).b());
    java.lang.Object[] __stackOp1405_307_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_115 = __stackOp1405_307_0;
    (__stackOp1405_307_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cj, 1, ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.SUNFLOWER)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_113)).a__Void(((net.minecraft.item.ItemStack)(spill1405_114)), ((java.lang.Object[])(spill1405_115)));
    net.minecraft.item.crafting.CraftingManager spill1405_116 = p0;
    net.minecraft.item.ItemStack spill1405_117 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.MAGENTA)).b());
    java.lang.Object[] __stackOp1405_315_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_118 = __stackOp1405_315_0;
    (__stackOp1405_315_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cj, 1, ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.SYRINGA)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_116)).a__Void(((net.minecraft.item.ItemStack)(spill1405_117)), ((java.lang.Object[])(spill1405_118)));
    net.minecraft.item.crafting.CraftingManager spill1405_119 = p0;
    net.minecraft.item.ItemStack spill1405_120 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).b());
    java.lang.Object[] __stackOp1405_323_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_121 = __stackOp1405_323_0;
    (__stackOp1405_323_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cj, 1, ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.ROSE)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_119)).a__Void(((net.minecraft.item.ItemStack)(spill1405_120)), ((java.lang.Object[])(spill1405_121)));
    net.minecraft.item.crafting.CraftingManager spill1405_122 = p0;
    net.minecraft.item.ItemStack spill1405_123 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 2, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.PINK)).b());
    java.lang.Object[] __stackOp1405_331_0 = new java.lang.Object[1];
    java.lang.Object[] spill1405_124 = __stackOp1405_331_0;
    (__stackOp1405_331_0)[0] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cj, 1, ((net.minecraft.block.BlockDoublePlant$EnumPlantType)(net.minecraft.block.BlockDoublePlant$EnumPlantType.PAEONIA)).a());
    ((net.minecraft.item.crafting.CraftingManager)(spill1405_122)).a__Void(((net.minecraft.item.ItemStack)(spill1405_123)), ((java.lang.Object[])(spill1405_124)));
    life4_965 = 0;
    loop_region_964: while ((life4_965 < __sourceIntrinsic_396de9353eae_invokedynamic1405_336(6990, (1825079853759827349L ^ life2_3)))) {
        net.minecraft.item.crafting.CraftingManager spill1405_125 = p0;
        net.minecraft.item.ItemStack spill1405_126 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.cc, 3, life4_965);
        java.lang.Object[] __stackOp1405_338_0 = new java.lang.Object[3];
        java.lang.Object[] spill1405_127 = __stackOp1405_338_0;
        (__stackOp1405_338_0)[0] = "##";
        java.lang.Object[] __stackOp1405_339_0 = spill1405_127;
        java.lang.Object[] spill1405_128 = __stackOp1405_339_0;
        (__stackOp1405_339_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1405_340(13342, (4502607240059069127L ^ life2_3)))));
        java.lang.Object[] __stackOp1405_342_0 = spill1405_128;
        java.lang.Object[] spill1405_129 = __stackOp1405_342_0;
        (__stackOp1405_342_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.L, 1, life4_965);
        ((net.minecraft.item.crafting.CraftingManager)(spill1405_125)).a(((net.minecraft.item.ItemStack)(spill1405_126)), ((java.lang.Object[])(spill1405_129)));
        life4_965 += 1;
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9671_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_336(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1405_340(int a0, long a1) throws E;
}
