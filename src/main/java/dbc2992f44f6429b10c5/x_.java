package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class x_ {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public x_() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(228145658823247120L)), ((long)(861272478343010260L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173993027142420L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.x_.a ^ 112850503693891L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1682_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1682_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1682_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1682_14 = new byte[8];
    (__sourceSpill1682_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1682_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1682_16 = __sourceSpill1682_14;
    ((javax.crypto.Cipher)(__sourceSpill1682_11)).init(((int)(__sourceSpill1682_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1682_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1682_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[29];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "o¼îóFõ&1ÂÉJN±\005r ¾ \000^zR£\021ß§Ú\002BqK~¾¸_6¢\0271<2»ëÀ\032¥¡åÙ5C \031IÛ\rä4ïË?±IÐFUE8&+`ìj¿ê·UHþdD\004q>\032QÊgVb\035\007åó*d¤·Æ'âZÝõ¹¤Uo`ÈdßÆÓ]æ0Ô;ÂÆ\006Ñ\035Í\006\013O7ñF^U&úôDòb\t4¼võ½ü\0330ÿ·\t?9Æy9S¾\b¨\006´,ñ\025å³êñ\030áÏ¸¡¥Q°Ë,\001«Ë\n\b\037\0326ð\037}J"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1682_25 = local6_life21;
        int __sourceSpill1682_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1682_25)).substring(((int)(__sourceSpill1682_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1682_30 = local8_life19;
        int __sourceSpill1682_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1682_33 = new byte[8];
        (__sourceSpill1682_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1682_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1682_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1682_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1682_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1682_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1682_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1682_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1682_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1682_34)).doFinal(((byte[])(__sourceSpill1682_33)));
        (__sourceSpill1682_30)[__sourceSpill1682_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\023\bÓë\027ô+ M\037B­~"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1682_38 = local6_life21;
        int __sourceSpill1682_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1682_38)).substring(((int)(__sourceSpill1682_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1682_43 = local8_life19;
        int __sourceSpill1682_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1682_46 = new byte[8];
        (__sourceSpill1682_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1682_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1682_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1682_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1682_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1682_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1682_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1682_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1682_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1682_47)).doFinal(((byte[])(__sourceSpill1682_46)));
        (__sourceSpill1682_43)[__sourceSpill1682_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[29]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9712_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/x_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.x_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 81;
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
            throw new RuntimeException("moom/x_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


public void a(net.minecraft.item.crafting.CraftingManager p0) {
long life2_3;
    life2_3 = (moom.x_.a ^ 20958208344592L);
    net.minecraft.item.crafting.CraftingManager spill455_0 = p0;
    net.minecraft.item.ItemStack spill455_1 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.A);
    java.lang.Object[] __stackOp455_2_0 = new java.lang.Object[3];
    java.lang.Object[] spill455_2 = __stackOp455_2_0;
    (__stackOp455_2_0)[0] = net.minecraft.init.Blocks.P;
    java.lang.Object[] __stackOp455_4_0 = spill455_2;
    java.lang.Object[] spill455_3 = __stackOp455_4_0;
    (__stackOp455_4_0)[1] = net.minecraft.init.Blocks.Q;
    java.lang.Object[] __stackOp455_6_0 = spill455_3;
    java.lang.Object[] spill455_4 = __stackOp455_6_0;
    (__stackOp455_6_0)[2] = net.minecraft.init.Items.z;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_0)).a__Void(((net.minecraft.item.ItemStack)(spill455_1)), ((java.lang.Object[])(spill455_4)));
    net.minecraft.item.crafting.CraftingManager spill455_5 = p0;
    net.minecraft.item.ItemStack spill455_6 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.a2, __sourceIntrinsic_396de9353eae_invokedynamic455_10(22693, (6907621556893479957L ^ life2_3)));
    java.lang.Object[] __stackOp455_11_0 = new java.lang.Object[5];
    java.lang.Object[] spill455_7 = __stackOp455_11_0;
    (__stackOp455_11_0)[0] = "#X#";
    java.lang.Object[] __stackOp455_12_0 = spill455_7;
    java.lang.Object[] spill455_8 = __stackOp455_12_0;
    (__stackOp455_12_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_13(8336, (7245498950907857953L ^ life2_3)))));
    java.lang.Object[] __stackOp455_15_0 = spill455_8;
    java.lang.Object[] spill455_9 = __stackOp455_15_0;
    (__stackOp455_15_0)[2] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, 1, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BROWN)).b());
    java.lang.Object[] __stackOp455_19_0 = spill455_9;
    java.lang.Object[] spill455_10 = __stackOp455_19_0;
    (__stackOp455_19_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_20(31029, (2870900357832430999L ^ life2_3)))));
    java.lang.Object[] __stackOp455_22_0 = spill455_10;
    java.lang.Object[] spill455_11 = __stackOp455_22_0;
    (__stackOp455_22_0)[4] = net.minecraft.init.Items.O;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_5)).a(((net.minecraft.item.ItemStack)(spill455_6)), ((java.lang.Object[])(spill455_11)));
    net.minecraft.item.crafting.CraftingManager spill455_12 = p0;
    net.minecraft.item.ItemStack spill455_13 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bf);
    java.lang.Object[] __stackOp455_27_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic455_26(21874, (4638481402513717721L ^ life2_3))];
    java.lang.Object[] spill455_14 = __stackOp455_27_0;
    (__stackOp455_27_0)[0] = " R ";
    java.lang.Object[] __stackOp455_28_0 = spill455_14;
    java.lang.Object[] spill455_15 = __stackOp455_28_0;
    (__stackOp455_28_0)[1] = "CPM";
    java.lang.Object[] __stackOp455_29_0 = spill455_15;
    java.lang.Object[] spill455_16 = __stackOp455_29_0;
    (__stackOp455_29_0)[2] = " B ";
    java.lang.Object[] __stackOp455_30_0 = spill455_16;
    java.lang.Object[] spill455_17 = __stackOp455_30_0;
    (__stackOp455_30_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_31(11761, (3159518929365172548L ^ life2_3)))));
    java.lang.Object[] __stackOp455_33_0 = spill455_17;
    java.lang.Object[] spill455_18 = __stackOp455_33_0;
    (__stackOp455_33_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.be);
    java.lang.Object[] __stackOp455_35_0 = spill455_18;
    java.lang.Object[] spill455_19 = __stackOp455_35_0;
    (__stackOp455_35_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_36(9228, (304569195502340278L ^ life2_3)))));
    java.lang.Object[] __stackOp455_38_0 = spill455_19;
    java.lang.Object[] spill455_20 = __stackOp455_38_0;
    (__stackOp455_38_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_39(29850, (8316305709659510846L ^ life2_3))] = net.minecraft.init.Items.bG;
    java.lang.Object[] __stackOp455_41_0 = spill455_20;
    java.lang.Object[] spill455_21 = __stackOp455_41_0;
    (__stackOp455_41_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_42(20467, (21497356919595856L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_43(1325, (623538268945754504L ^ life2_3)))));
    java.lang.Object[] __stackOp455_45_0 = spill455_21;
    java.lang.Object[] spill455_22 = __stackOp455_45_0;
    (__stackOp455_45_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_46(8516, (4639547839530241526L ^ life2_3))] = net.minecraft.init.Items.bI;
    java.lang.Object[] __stackOp455_48_0 = spill455_22;
    java.lang.Object[] spill455_23 = __stackOp455_48_0;
    (__stackOp455_48_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_49(23211, (2647536169444931073L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_50(28337, (7057993670551126541L ^ life2_3)))));
    java.lang.Object[] __stackOp455_52_0 = spill455_23;
    java.lang.Object[] spill455_24 = __stackOp455_52_0;
    (__stackOp455_52_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_53(3234, (6823827935745941506L ^ life2_3))] = net.minecraft.init.Blocks.P;
    java.lang.Object[] __stackOp455_55_0 = spill455_24;
    java.lang.Object[] spill455_25 = __stackOp455_55_0;
    (__stackOp455_55_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_56(19591, (5343771092782768188L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_57(13935, (5889716452598913756L ^ life2_3)))));
    java.lang.Object[] __stackOp455_59_0 = spill455_25;
    java.lang.Object[] spill455_26 = __stackOp455_59_0;
    (__stackOp455_59_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_60(10145, (2629474652846689054L ^ life2_3))] = net.minecraft.init.Items.z;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_12)).a(((net.minecraft.item.ItemStack)(spill455_13)), ((java.lang.Object[])(spill455_26)));
    net.minecraft.item.crafting.CraftingManager spill455_27 = p0;
    net.minecraft.item.ItemStack spill455_28 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bf);
    java.lang.Object[] __stackOp455_65_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic455_64(32465, (8339197043742691960L ^ life2_3))];
    java.lang.Object[] spill455_29 = __stackOp455_65_0;
    (__stackOp455_65_0)[0] = " R ";
    java.lang.Object[] __stackOp455_66_0 = spill455_29;
    java.lang.Object[] spill455_30 = __stackOp455_66_0;
    (__stackOp455_66_0)[1] = "CPD";
    java.lang.Object[] __stackOp455_67_0 = spill455_30;
    java.lang.Object[] spill455_31 = __stackOp455_67_0;
    (__stackOp455_67_0)[2] = " B ";
    java.lang.Object[] __stackOp455_68_0 = spill455_31;
    java.lang.Object[] spill455_32 = __stackOp455_68_0;
    (__stackOp455_68_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_69(1185, (8295972398898096159L ^ life2_3)))));
    java.lang.Object[] __stackOp455_71_0 = spill455_32;
    java.lang.Object[] spill455_33 = __stackOp455_71_0;
    (__stackOp455_71_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Items.be);
    java.lang.Object[] __stackOp455_73_0 = spill455_33;
    java.lang.Object[] spill455_34 = __stackOp455_73_0;
    (__stackOp455_73_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_74(11961, (4305699259263386132L ^ life2_3)))));
    java.lang.Object[] __stackOp455_76_0 = spill455_34;
    java.lang.Object[] spill455_35 = __stackOp455_76_0;
    (__stackOp455_76_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_77(8612, (2177543685160340761L ^ life2_3))] = net.minecraft.init.Items.bG;
    java.lang.Object[] __stackOp455_79_0 = spill455_35;
    java.lang.Object[] spill455_36 = __stackOp455_79_0;
    (__stackOp455_79_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_80(16774, (3863028526243507518L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_81(24467, (3485969332156625717L ^ life2_3)))));
    java.lang.Object[] __stackOp455_83_0 = spill455_36;
    java.lang.Object[] spill455_37 = __stackOp455_83_0;
    (__stackOp455_83_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_84(8516, (4639547839530241526L ^ life2_3))] = net.minecraft.init.Items.bI;
    java.lang.Object[] __stackOp455_86_0 = spill455_37;
    java.lang.Object[] spill455_38 = __stackOp455_86_0;
    (__stackOp455_86_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_87(29585, (6556668517809151807L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_88(15832, (4122823060642828665L ^ life2_3)))));
    java.lang.Object[] __stackOp455_90_0 = spill455_38;
    java.lang.Object[] spill455_39 = __stackOp455_90_0;
    (__stackOp455_90_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_91(12703, (8384658608441957687L ^ life2_3))] = net.minecraft.init.Blocks.Q;
    java.lang.Object[] __stackOp455_93_0 = spill455_39;
    java.lang.Object[] spill455_40 = __stackOp455_93_0;
    (__stackOp455_93_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_94(13020, (5075304828700204645L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_95(11122, (6087889268297304030L ^ life2_3)))));
    java.lang.Object[] __stackOp455_97_0 = spill455_40;
    java.lang.Object[] spill455_41 = __stackOp455_97_0;
    (__stackOp455_97_0)[__sourceIntrinsic_396de9353eae_invokedynamic455_98(25176, (4557263711208623863L ^ life2_3))] = net.minecraft.init.Items.z;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_27)).a(((net.minecraft.item.ItemStack)(spill455_28)), ((java.lang.Object[])(spill455_41)));
    net.minecraft.item.crafting.CraftingManager spill455_42 = p0;
    net.minecraft.item.ItemStack spill455_43 = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.a_);
    java.lang.Object[] __stackOp455_102_0 = new java.lang.Object[5];
    java.lang.Object[] spill455_44 = __stackOp455_102_0;
    (__stackOp455_102_0)[0] = "MMM";
    java.lang.Object[] __stackOp455_103_0 = spill455_44;
    java.lang.Object[] spill455_45 = __stackOp455_103_0;
    (__stackOp455_103_0)[1] = "MMM";
    java.lang.Object[] __stackOp455_104_0 = spill455_45;
    java.lang.Object[] spill455_46 = __stackOp455_104_0;
    (__stackOp455_104_0)[2] = "MMM";
    java.lang.Object[] __stackOp455_105_0 = spill455_46;
    java.lang.Object[] spill455_47 = __stackOp455_105_0;
    (__stackOp455_105_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_106(23765, (4681124518402355314L ^ life2_3)))));
    java.lang.Object[] __stackOp455_108_0 = spill455_47;
    java.lang.Object[] spill455_48 = __stackOp455_108_0;
    (__stackOp455_108_0)[4] = net.minecraft.init.Items.a5;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_42)).a(((net.minecraft.item.ItemStack)(spill455_43)), ((java.lang.Object[])(spill455_48)));
    net.minecraft.item.crafting.CraftingManager spill455_49 = p0;
    net.minecraft.item.ItemStack spill455_50 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.a7);
    java.lang.Object[] __stackOp455_112_0 = new java.lang.Object[3];
    java.lang.Object[] spill455_51 = __stackOp455_112_0;
    (__stackOp455_112_0)[0] = "M";
    java.lang.Object[] __stackOp455_113_0 = spill455_51;
    java.lang.Object[] spill455_52 = __stackOp455_113_0;
    (__stackOp455_113_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_114(23765, (4681124518402355314L ^ life2_3)))));
    java.lang.Object[] __stackOp455_116_0 = spill455_52;
    java.lang.Object[] spill455_53 = __stackOp455_116_0;
    (__stackOp455_116_0)[2] = net.minecraft.init.Items.a5;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_49)).a(((net.minecraft.item.ItemStack)(spill455_50)), ((java.lang.Object[])(spill455_53)));
    net.minecraft.item.crafting.CraftingManager spill455_54 = p0;
    net.minecraft.item.ItemStack spill455_55 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.a6, 4);
    java.lang.Object[] __stackOp455_120_0 = new java.lang.Object[3];
    java.lang.Object[] spill455_56 = __stackOp455_120_0;
    (__stackOp455_120_0)[0] = "M";
    java.lang.Object[] __stackOp455_121_0 = spill455_56;
    java.lang.Object[] spill455_57 = __stackOp455_121_0;
    (__stackOp455_121_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic455_122(23765, (4681124518402355314L ^ life2_3)))));
    java.lang.Object[] __stackOp455_124_0 = spill455_57;
    java.lang.Object[] spill455_58 = __stackOp455_124_0;
    (__stackOp455_124_0)[2] = net.minecraft.init.Blocks.aU;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_54)).a(((net.minecraft.item.ItemStack)(spill455_55)), ((java.lang.Object[])(spill455_58)));
    net.minecraft.item.crafting.CraftingManager spill455_59 = p0;
    net.minecraft.item.ItemStack spill455_60 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bP);
    java.lang.Object[] __stackOp455_128_0 = new java.lang.Object[3];
    java.lang.Object[] spill455_61 = __stackOp455_128_0;
    (__stackOp455_128_0)[0] = net.minecraft.init.Blocks.aU;
    java.lang.Object[] __stackOp455_130_0 = spill455_61;
    java.lang.Object[] spill455_62 = __stackOp455_130_0;
    (__stackOp455_130_0)[1] = net.minecraft.init.Items.aY;
    java.lang.Object[] __stackOp455_132_0 = spill455_62;
    java.lang.Object[] spill455_63 = __stackOp455_132_0;
    (__stackOp455_132_0)[2] = net.minecraft.init.Items.aP;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_59)).a__Void(((net.minecraft.item.ItemStack)(spill455_60)), ((java.lang.Object[])(spill455_63)));
    net.minecraft.item.crafting.CraftingManager spill455_64 = p0;
    net.minecraft.item.ItemStack spill455_65 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.br);
    java.lang.Object[] __stackOp455_136_0 = new java.lang.Object[3];
    java.lang.Object[] spill455_66 = __stackOp455_136_0;
    (__stackOp455_136_0)[0] = net.minecraft.init.Items.bq;
    java.lang.Object[] __stackOp455_138_0 = spill455_66;
    java.lang.Object[] spill455_67 = __stackOp455_138_0;
    (__stackOp455_138_0)[1] = net.minecraft.init.Blocks.P;
    java.lang.Object[] __stackOp455_140_0 = spill455_67;
    java.lang.Object[] spill455_68 = __stackOp455_140_0;
    (__stackOp455_140_0)[2] = net.minecraft.init.Items.aY;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_64)).a__Void(((net.minecraft.item.ItemStack)(spill455_65)), ((java.lang.Object[])(spill455_68)));
    net.minecraft.item.crafting.CraftingManager spill455_69 = p0;
    net.minecraft.item.ItemStack spill455_70 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bs, 2);
    java.lang.Object[] __stackOp455_144_0 = new java.lang.Object[1];
    java.lang.Object[] spill455_71 = __stackOp455_144_0;
    (__stackOp455_144_0)[0] = net.minecraft.init.Items.bk;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_69)).a__Void(((net.minecraft.item.ItemStack)(spill455_70)), ((java.lang.Object[])(spill455_71)));
    net.minecraft.item.crafting.CraftingManager spill455_72 = p0;
    net.minecraft.item.ItemStack spill455_73 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bt);
    java.lang.Object[] __stackOp455_148_0 = new java.lang.Object[2];
    java.lang.Object[] spill455_74 = __stackOp455_148_0;
    (__stackOp455_148_0)[0] = net.minecraft.init.Items.bs;
    java.lang.Object[] __stackOp455_150_0 = spill455_74;
    java.lang.Object[] spill455_75 = __stackOp455_150_0;
    (__stackOp455_150_0)[1] = net.minecraft.init.Items.aM;
    ((net.minecraft.item.crafting.CraftingManager)(spill455_72)).a__Void(((net.minecraft.item.ItemStack)(spill455_73)), ((java.lang.Object[])(spill455_75)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9712_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic455_122(int a0, long a1) throws E;
}
