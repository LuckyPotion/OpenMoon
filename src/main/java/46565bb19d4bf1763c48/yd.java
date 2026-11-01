package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class yd {

private final java.lang.String[][] a;

private final java.lang.Object[][] b;

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public yd() {
super();
    this.a = ((java.lang.String[][])(new java.lang.String[][] {new java.lang.String[] {"X", "X", "#"}}));
    this.b = ((java.lang.Object[][])(new java.lang.Object[][] {new java.lang.Object[] {net.minecraft.init.Blocks.f, net.minecraft.init.Blocks.e, net.minecraft.init.Items.j, net.minecraft.init.Items.i, net.minecraft.init.Items.k}, new java.lang.Object[] {net.minecraft.init.Items.m, net.minecraft.init.Items.q, net.minecraft.init.Items.l, net.minecraft.init.Items.u, net.minecraft.init.Items.B}}));
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(2155021819991267953L)), ((long)(-4847257559881650808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(82579664456637L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.yd.c ^ 127536761565765L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1709_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1709_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1709_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1709_14 = new byte[8];
    (__sourceSpill1709_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1709_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1709_16 = __sourceSpill1709_14;
    ((javax.crypto.Cipher)(__sourceSpill1709_11)).init(((int)(__sourceSpill1709_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1709_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1709_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "]f\003æþ¢Be=7»ËåÃ,\022/6\025j:Ù%D7û5ã¦±ÂÍd®?²\002«Ü)\020oðä¿\r\"}²\tâ}\032Ú|aî[ªÄ':_"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1709_25 = local6_life21;
        int __sourceSpill1709_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1709_25)).substring(((int)(__sourceSpill1709_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1709_30 = local8_life19;
        int __sourceSpill1709_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1709_33 = new byte[8];
        (__sourceSpill1709_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1709_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1709_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1709_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1709_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1709_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1709_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1709_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1709_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1709_34)).doFinal(((byte[])(__sourceSpill1709_33)));
        (__sourceSpill1709_30)[__sourceSpill1709_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "?}}yË\\F>ß¹$Ð}ß"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1709_38 = local6_life21;
        int __sourceSpill1709_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1709_38)).substring(((int)(__sourceSpill1709_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1709_43 = local8_life19;
        int __sourceSpill1709_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1709_46 = new byte[8];
        (__sourceSpill1709_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1709_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1709_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1709_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1709_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1709_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1709_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1709_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1709_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1709_47)).doFinal(((byte[])(__sourceSpill1709_46)));
        (__sourceSpill1709_43)[__sourceSpill1709_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[11]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9811_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.yd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23494;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


public void a(net.minecraft.item.crafting.CraftingManager p0) {
long life2_3;
    int life4_5;
    java.lang.Object life5_19;
    int life6_21;
    net.minecraft.item.Item life7_38;
    life2_3 = (moom.yd.c ^ 41818405868938L);
    life4_5 = 0;
    loop_region_6: while ((life4_5 < ((this.b)[0]).length)) {
        life5_19 = ((this.b)[0])[life4_5];
        life6_21 = 0;
        loop_region_22: while ((life6_21 < ((this.b).length - 1))) {
        life7_38 = ((net.minecraft.item.Item)(((this.b)[(life6_21 + 1)])[life4_5]));
        net.minecraft.item.crafting.CraftingManager spill1428_0 = p0;
        net.minecraft.item.ItemStack spill1428_1 = new net.minecraft.item.ItemStack(life7_38);
        java.lang.Object[] __stackOp1428_6_0 = new java.lang.Object[5];
        java.lang.Object[] spill1428_2 = __stackOp1428_6_0;
        (__stackOp1428_6_0)[0] = (this.a)[life6_21];
        java.lang.Object[] __stackOp1428_8_0 = spill1428_2;
        java.lang.Object[] spill1428_3 = __stackOp1428_8_0;
        (__stackOp1428_8_0)[1] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1428_9(24346, (6882100365847561272L ^ life2_3)))));
        java.lang.Object[] __stackOp1428_11_0 = spill1428_3;
        java.lang.Object[] spill1428_4 = __stackOp1428_11_0;
        (__stackOp1428_11_0)[2] = net.minecraft.init.Items.y;
        java.lang.Object[] __stackOp1428_13_0 = spill1428_4;
        java.lang.Object[] spill1428_5 = __stackOp1428_13_0;
        (__stackOp1428_13_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1428_14(16959, (1245555428596455710L ^ life2_3)))));
        java.lang.Object[] __stackOp1428_16_0 = spill1428_5;
        java.lang.Object[] spill1428_6 = __stackOp1428_16_0;
        (__stackOp1428_16_0)[4] = life5_19;
        ((net.minecraft.item.crafting.CraftingManager)(spill1428_0)).a(((net.minecraft.item.ItemStack)(spill1428_1)), ((java.lang.Object[])(spill1428_6)));
        life6_21 += 1;
    }
        life4_5 += 1;
    }
    net.minecraft.item.crafting.CraftingManager spill1428_7 = p0;
    net.minecraft.item.ItemStack spill1428_8 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.f, 1);
    java.lang.Object[] __stackOp1428_20_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic1428_19(29990, (4292339195750198787L ^ life2_3))];
    java.lang.Object[] spill1428_9 = __stackOp1428_20_0;
    (__stackOp1428_20_0)[0] = " #X";
    java.lang.Object[] __stackOp1428_21_0 = spill1428_9;
    java.lang.Object[] spill1428_10 = __stackOp1428_21_0;
    (__stackOp1428_21_0)[1] = "# X";
    java.lang.Object[] __stackOp1428_22_0 = spill1428_10;
    java.lang.Object[] spill1428_11 = __stackOp1428_22_0;
    (__stackOp1428_22_0)[2] = " #X";
    java.lang.Object[] __stackOp1428_23_0 = spill1428_11;
    java.lang.Object[] spill1428_12 = __stackOp1428_23_0;
    (__stackOp1428_23_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1428_24(24139, (1230983442674287981L ^ life2_3)))));
    java.lang.Object[] __stackOp1428_26_0 = spill1428_12;
    java.lang.Object[] spill1428_13 = __stackOp1428_26_0;
    (__stackOp1428_26_0)[4] = net.minecraft.init.Items.F;
    java.lang.Object[] __stackOp1428_28_0 = spill1428_13;
    java.lang.Object[] spill1428_14 = __stackOp1428_28_0;
    (__stackOp1428_28_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1428_29(26902, (4698538789715751481L ^ life2_3)))));
    java.lang.Object[] __stackOp1428_31_0 = spill1428_14;
    java.lang.Object[] spill1428_15 = __stackOp1428_31_0;
    (__stackOp1428_31_0)[__sourceIntrinsic_396de9353eae_invokedynamic1428_32(9181, (722986026330290419L ^ life2_3))] = net.minecraft.init.Items.y;
    ((net.minecraft.item.crafting.CraftingManager)(spill1428_7)).a(((net.minecraft.item.ItemStack)(spill1428_8)), ((java.lang.Object[])(spill1428_15)));
    net.minecraft.item.crafting.CraftingManager spill1428_16 = p0;
    net.minecraft.item.ItemStack spill1428_17 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.g, 4);
    java.lang.Object[] __stackOp1428_37_0 = new java.lang.Object[__sourceIntrinsic_396de9353eae_invokedynamic1428_36(14305, (6442174517977574593L ^ life2_3))];
    java.lang.Object[] spill1428_18 = __stackOp1428_37_0;
    (__stackOp1428_37_0)[0] = "X";
    java.lang.Object[] __stackOp1428_38_0 = spill1428_18;
    java.lang.Object[] spill1428_19 = __stackOp1428_38_0;
    (__stackOp1428_38_0)[1] = "#";
    java.lang.Object[] __stackOp1428_39_0 = spill1428_19;
    java.lang.Object[] spill1428_20 = __stackOp1428_39_0;
    (__stackOp1428_39_0)[2] = "Y";
    java.lang.Object[] __stackOp1428_40_0 = spill1428_20;
    java.lang.Object[] spill1428_21 = __stackOp1428_40_0;
    (__stackOp1428_40_0)[3] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1428_41(2452, (1039010184247169719L ^ life2_3)))));
    java.lang.Object[] __stackOp1428_43_0 = spill1428_21;
    java.lang.Object[] spill1428_22 = __stackOp1428_43_0;
    (__stackOp1428_43_0)[4] = net.minecraft.init.Items.G;
    java.lang.Object[] __stackOp1428_45_0 = spill1428_22;
    java.lang.Object[] spill1428_23 = __stackOp1428_45_0;
    (__stackOp1428_45_0)[5] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1428_46(24139, (1230983442674287981L ^ life2_3)))));
    java.lang.Object[] __stackOp1428_48_0 = spill1428_23;
    java.lang.Object[] spill1428_24 = __stackOp1428_48_0;
    (__stackOp1428_48_0)[__sourceIntrinsic_396de9353eae_invokedynamic1428_49(10730, (110834998125130445L ^ life2_3))] = net.minecraft.init.Items.ak;
    java.lang.Object[] __stackOp1428_51_0 = spill1428_24;
    java.lang.Object[] spill1428_25 = __stackOp1428_51_0;
    (__stackOp1428_51_0)[__sourceIntrinsic_396de9353eae_invokedynamic1428_52(27681, (2666775807726728972L ^ life2_3))] = java.lang.Character.valueOf(((char)(__sourceIntrinsic_396de9353eae_invokedynamic1428_53(26902, (4698538789715751481L ^ life2_3)))));
    java.lang.Object[] __stackOp1428_55_0 = spill1428_25;
    java.lang.Object[] spill1428_26 = __stackOp1428_55_0;
    (__stackOp1428_55_0)[__sourceIntrinsic_396de9353eae_invokedynamic1428_56(5801, (2398591642882395533L ^ life2_3))] = net.minecraft.init.Items.y;
    ((net.minecraft.item.crafting.CraftingManager)(spill1428_16)).a(((net.minecraft.item.ItemStack)(spill1428_17)), ((java.lang.Object[])(spill1428_26)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9811_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_396de9353eae_invokedynamic1428_56(int a0, long a1) throws E;
}
