package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class x5 {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public x5() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(4073226158297962696L)), ((long)(1866802929943818436L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155036365747658L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.x5.a ^ 3081471722218L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1666_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1666_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1666_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1666_14 = new byte[8];
    (__sourceSpill1666_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1666_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1666_16 = __sourceSpill1666_14;
    ((javax.crypto.Cipher)(__sourceSpill1666_11)).init(((int)(__sourceSpill1666_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1666_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1666_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "O`\021éÝ4Äo ]£NÊQ´"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1666_25 = local6_life21;
        int __sourceSpill1666_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1666_25)).substring(((int)(__sourceSpill1666_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1666_30 = local8_life19;
        int __sourceSpill1666_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1666_33 = new byte[8];
        (__sourceSpill1666_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1666_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1666_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1666_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1666_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1666_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1666_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1666_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1666_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1666_34)).doFinal(((byte[])(__sourceSpill1666_33)));
        (__sourceSpill1666_30)[__sourceSpill1666_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ûå\022Þ\025¾û3*§Ç»Á"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1666_38 = local6_life21;
        int __sourceSpill1666_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1666_38)).substring(((int)(__sourceSpill1666_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1666_43 = local8_life19;
        int __sourceSpill1666_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1666_46 = new byte[8];
        (__sourceSpill1666_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1666_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1666_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1666_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1666_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1666_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1666_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1666_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1666_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1666_47)).doFinal(((byte[])(__sourceSpill1666_46)));
        (__sourceSpill1666_43)[__sourceSpill1666_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9660_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/x5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.x5.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10950;
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
            throw new RuntimeException("moom/x5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


void a(net.minecraft.item.crafting.CraftingManager p0) {
long life2_3;
    net.minecraft.item.EnumDyeColor[] life4_5;
    int life5_8;
    int life6_10;
    net.minecraft.item.EnumDyeColor life7_17;
    life2_3 = (moom.x5.a ^ 98238201771918L);
    life4_5 = net.minecraft.item.EnumDyeColor.values();
    life5_8 = (life4_5).length;
    life6_10 = 0;
    loop_region_11: while ((life6_10 < life5_8)) {
        life7_17 = (life4_5)[life6_10];
        net.minecraft.item.crafting.CraftingManager spill1397_0 = p0;
        net.minecraft.item.ItemStack spill1397_1 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ci, 1, ((net.minecraft.item.EnumDyeColor)(life7_17)).b());
        java.lang.Object[] __stackOp1397_5_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic1397_4(26941, (1970887068290212937L ^ life2_3))];
        java.lang.Object[] spill1397_2 = __stackOp1397_5_0;
        (__stackOp1397_5_0)[0] = "###";
        java.lang.Object[] __stackOp1397_6_0 = spill1397_2;
        java.lang.Object[] spill1397_3 = __stackOp1397_6_0;
        (__stackOp1397_6_0)[1] = "###";
        java.lang.Object[] __stackOp1397_7_0 = spill1397_3;
        java.lang.Object[] spill1397_4 = __stackOp1397_7_0;
        (__stackOp1397_7_0)[2] = " | ";
        java.lang.Object[] __stackOp1397_8_0 = spill1397_4;
        java.lang.Object[] spill1397_5 = __stackOp1397_8_0;
        (__stackOp1397_8_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1397_9(32733, (3611197219975295656L ^ life2_3)))));
        java.lang.Object[] __stackOp1397_11_0 = spill1397_5;
        java.lang.Object[] spill1397_6 = __stackOp1397_11_0;
        (__stackOp1397_11_0)[4] = new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.L, 1, ((net.minecraft.item.EnumDyeColor)(life7_17)).a());
        java.lang.Object[] __stackOp1397_14_0 = spill1397_6;
        java.lang.Object[] spill1397_7 = __stackOp1397_14_0;
        (__stackOp1397_14_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1397_15(12586, (7347006193634360412L ^ life2_3)))));
        java.lang.Object[] __stackOp1397_17_0 = spill1397_7;
        java.lang.Object[] spill1397_8 = __stackOp1397_17_0;
        (__stackOp1397_17_0)[__sourceIntrinsic_396de9353eae_invokedynamic1397_18(27611, (1072301614429300396L ^ life2_3))] = net.minecraft.init.Items.y;
        ((net.minecraft.item.crafting.CraftingManager)(spill1397_0)).a(((net.minecraft.item.ItemStack)(spill1397_1)), ((java.lang.Object[])(spill1397_8)));
        life6_10 += 1;
    }
    ((net.minecraft.item.crafting.CraftingManager)(p0)).a(((net.minecraft.item.crafting.IRecipe)(new moom.x7())));
    ((net.minecraft.item.crafting.CraftingManager)(p0)).a(((net.minecraft.item.crafting.IRecipe)(new moom.x6())));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9660_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1397_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1397_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1397_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1397_18(int a0, long a1) throws E;
}
