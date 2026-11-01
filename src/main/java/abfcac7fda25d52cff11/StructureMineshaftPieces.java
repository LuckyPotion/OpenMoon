package net.minecraft.world.gen.structure;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class StructureMineshaftPieces {

private static final java.util.List<moom.D5> a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public StructureMineshaftPieces() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(4095696223049466984L)), ((long)(-4864184823508929103L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36101436308282L)))));
    long local11_life6 = (net.minecraft.world.gen.structure.StructureMineshaftPieces.b ^ 112628781187021L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1955_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1955_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1955_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1955_14 = new byte[8];
    (__sourceSpill1955_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1955_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1955_16 = __sourceSpill1955_14;
    ((javax.crypto.Cipher)(__sourceSpill1955_11)).init(((int)(__sourceSpill1955_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1955_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1955_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[16];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\002\033}jUFÅ´É\030\007\\l\033Ñ%s¡¯¢¬\025÷så\177õ^Üdø\0327yÖÀmØ´\\GÓd²¨ÞÁÍwH÷Õ\003\026ßºrÎë\002®þÜ×\032¹@Ã´öùìºlÌ\005ë\006\033Á¤K]Ñ¥\004Þzæó\bÆAÙÒ¸»Êå"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1955_25 = local4_life21;
        int __sourceSpill1955_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1955_25)).substring(((int)(__sourceSpill1955_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1955_30 = local6_life19;
        int __sourceSpill1955_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1955_33 = new byte[8];
        (__sourceSpill1955_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1955_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1955_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1955_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1955_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1955_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1955_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1955_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1955_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1955_34)).doFinal(((byte[])(__sourceSpill1955_33)));
        (__sourceSpill1955_30)[__sourceSpill1955_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "·/}á?kR¨Lnõ¿²­"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1955_38 = local4_life21;
        int __sourceSpill1955_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1955_38)).substring(((int)(__sourceSpill1955_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1955_43 = local6_life19;
        int __sourceSpill1955_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1955_46 = new byte[8];
        (__sourceSpill1955_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1955_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1955_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1955_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1955_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1955_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1955_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1955_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1955_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1955_47)).doFinal(((byte[])(__sourceSpill1955_46)));
        (__sourceSpill1955_43)[__sourceSpill1955_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    c = ((long[])(local6_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[16]));
    moom.D5[] __sourceSpill1955_55 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_52(173, (8689691190384922930L ^ local11_life6))];
    (__sourceSpill1955_55)[0] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_54(31636, (6301187888842271232L ^ local11_life6)));
    (__sourceSpill1955_55)[1] = new moom.D5(net.minecraft.init.Items.k, 0, 1, 3, 5);
    (__sourceSpill1955_55)[2] = new moom.D5(net.minecraft.init.Items.aC, 0, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_58(9360, (83505603450221827L ^ local11_life6)), 5);
    (__sourceSpill1955_55)[3] = new moom.D5(net.minecraft.init.Items.aW, ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b(), 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_62(29318, (3148884148662887195L ^ local11_life6)), 5);
    (__sourceSpill1955_55)[4] = new moom.D5(net.minecraft.init.Items.i, 0, 1, 2, 3);
    (__sourceSpill1955_55)[5] = new moom.D5(net.minecraft.init.Items.h, 0, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_65(12810, (3382549727836316566L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_66(24120, (8451654703178993569L ^ local11_life6)));
    (__sourceSpill1955_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_67(14125, (4466221031073462L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.P, 0, 1, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_69(27996, (6563265936127622340L ^ local11_life6)));
    (__sourceSpill1955_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_70(10456, (4732652099010771273L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b, 0, 1, 1, 1);
    (__sourceSpill1955_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_72(9857, (7007372024448857887L ^ local11_life6))] = new moom.D5(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av))), 0, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_75(9857, (7007372024448857887L ^ local11_life6)), 1);
    (__sourceSpill1955_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_76(29318, (3148884148662887195L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.a7, 0, 2, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_78(24120, (8451654703178993569L ^ local11_life6)));
    (__sourceSpill1955_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_79(24120, (8451654703178993569L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.a6, 0, 2, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_81(24120, (8451654703178993569L ^ local11_life6)));
    (__sourceSpill1955_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_82(1910, (6037517062366172899L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aA, 0, 1, 1, 3);
    (__sourceSpill1955_55)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_84(15467, (8649835929242086909L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bZ, 0, 1, 1, 1);
    a = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill1955_55)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13434;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Ib", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.structure.StructureMineshaftPieces.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12725_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ib"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a() {
moom.G1.b(((java.lang.Class)(net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.class)), ((java.lang.String)("MSCorridor")));
    moom.G1.b(((java.lang.Class)(moom.G_.class)), ((java.lang.String)("MSCrossing")));
    moom.G1.b(((java.lang.Class)(moom.Ha.class)), ((java.lang.String)("MSRoom")));
    moom.G1.b(((java.lang.Class)(moom.Hb.class)), ((java.lang.String)("MSStairs")));
    return;
}


private static moom.G4 a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7) {
int forwardValue5839_28_0;
    int forwardValue5839_28_1;
    int forwardValue5839_42_0;
    int forwardValue5839_42_1;
    moom.G4 forwardValue5839_68_0;
    int spill5839_0;
    int spill5839_1;
    moom.G4 spill5839_2;
    long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    moom.G4 life11_64;
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_42: {
    forward_join_28: {
    forward_join_17: {
    life8_3 = (net.minecraft.world.gen.structure.StructureMineshaftPieces.b ^ 121828169068076L);
    life10_5 = moom.G4.b();
    spill5839_0 = p7;
    spill5839_1 = __sourceIntrinsic_121b0fef7243_invokedynamic5839_2(9857, (7007362533481473790L ^ life8_3));
    if (!((life10_5 != null))) {
        forwardValue5839_28_0 = spill5839_0;
        forwardValue5839_28_1 = spill5839_1;
        break forward_join_28;
    }
    if (!((spill5839_0 > spill5839_1))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue5839_28_0 = java.lang.Math.abs(((int)((p3 - ((moom.G2)(((moom.G4)(p0)).a__G2())).a))));
    forwardValue5839_28_1 = __sourceIntrinsic_121b0fef7243_invokedynamic5839_6(22896, (3043095635633117443L ^ life8_3));
    }
    if (!((life10_5 != null))) {
        forwardValue5839_42_0 = forwardValue5839_28_0;
        forwardValue5839_42_1 = forwardValue5839_28_1;
        break forward_join_42;
    }
    if (!((forwardValue5839_28_0 <= forwardValue5839_28_1))) {
        break forward_join_69;
    }
    forwardValue5839_42_0 = java.lang.Math.abs(((int)((p5 - ((moom.G2)(((moom.G4)(p0)).a__G2())).c))));
    forwardValue5839_42_1 = __sourceIntrinsic_121b0fef7243_invokedynamic5839_10(638, (4381703398933447173L ^ life8_3));
    }
    if (!((forwardValue5839_42_0 <= forwardValue5839_42_1))) {
        break forward_join_69;
    }
    life11_64 = net.minecraft.world.gen.structure.StructureMineshaftPieces.a(((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((moom.bs)(p6)), ((int)((p7 + 1))));
    spill5839_2 = life11_64;
    if (!((life10_5 != null))) {
        forwardValue5839_68_0 = spill5839_2;
        break forward_join_68;
    }
    if (!((spill5839_2 != null))) {
        break forward_join_67;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(life11_64)));
    ((moom.G4)(life11_64)).a(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)));
    }
    forwardValue5839_68_0 = life11_64;
    }
    return forwardValue5839_68_0;
    }
    return null;
}


private static moom.G4 a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
int forwardValue5838_49_0;
    int forwardValue5838_49_1;
    net.minecraft.entity.Entity[] spill5838_0;
    int spill5838_1;
    int spill5838_2;
    long life7_3;
    int life10_12;
    net.minecraft.entity.Entity[] life9_13;
    moom.G2 life11_33;
    moom.G2 life11_65;
    moom.G2 life11_87;
    forward_join_88: {
    forward_join_70: {
    forward_join_68: {
    forward_join_49: {
    forward_join_43: {
    forward_join_41: {
    life7_3 = (net.minecraft.world.gen.structure.StructureMineshaftPieces.b ^ 69016721442422L);
    spill5838_0 = moom.G4.b();
    life10_12 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_bb41e4919d3a_invokedynamic5838_2(16219, (1654076525430577015L ^ life7_3)))));
    life9_13 = spill5838_0;
    spill5838_1 = life10_12;
    spill5838_2 = __sourceIntrinsic_bb41e4919d3a_invokedynamic5838_4(638, (4381615472909167199L ^ life7_3));
    if (!((life9_13 != null))) {
        forwardValue5838_49_0 = spill5838_1;
        forwardValue5838_49_1 = spill5838_2;
        break forward_join_49;
    }
    if (!((spill5838_1 >= spill5838_2))) {
        break forward_join_43;
    }
    life11_33 = moom.G_.a(((java.util.List)(p0)), ((java.util.Random)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((moom.bs)(p5)));
    if (!((life11_33 != null))) {
        break forward_join_41;
    }
    return new moom.G_(p6, p1, life11_33, p5);
    }
    if (!((life9_13 == null))) {
        break forward_join_88;
    }
    }
    forwardValue5838_49_0 = life10_12;
    forwardValue5838_49_1 = __sourceIntrinsic_bb41e4919d3a_invokedynamic5838_6(32328, (3189984213154322019L ^ life7_3));
    }
    if (!((forwardValue5838_49_0 >= forwardValue5838_49_1))) {
        break forward_join_70;
    }
    life11_65 = moom.Hb.a(((java.util.List)(p0)), ((java.util.Random)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((moom.bs)(p5)));
    if (!((life11_65 != null))) {
        break forward_join_68;
    }
    return new moom.Hb(p6, p1, life11_65, p5);
    }
    if (!((life9_13 == null))) {
        break forward_join_88;
    }
    }
    life11_87 = net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.a(((java.util.List)(p0)), ((java.util.Random)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((moom.bs)(p5)));
    if (!((life11_87 != null))) {
        break forward_join_88;
    }
    return new net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor(p6, p1, life11_87, p5);
    }
    return null;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1955_84(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12725_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_121b0fef7243_invokedynamic5839_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_121b0fef7243_invokedynamic5839_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_121b0fef7243_invokedynamic5839_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb41e4919d3a_invokedynamic5838_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb41e4919d3a_invokedynamic5838_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bb41e4919d3a_invokedynamic5838_6(int a0, long a1) throws E;
}
