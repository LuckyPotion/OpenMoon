package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ed extends moom.ec {

public static final moom.fw<net.minecraft.block.BlockPlanks$EnumType> S;

private static final long U;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

public ed() {
super();
    (this).a__Void((((this.M).a__fE()).a__fE(moom.ed.S, net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a__fE(moom.ed.R, net.minecraft.block.BlockLog$EnumAxis.Y));
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(-3295002411020100801L)), ((long)(-4097690316018340140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249292411435840L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ed.U ^ 63625996258351L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill828_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill828_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill828_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill828_14 = new byte[8];
    (__sourceSpill828_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill828_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation828_16 = __sourceSpill828_14;
    ((javax.crypto.Cipher)(__sourceSpill828_11)).init(((int)(__sourceSpill828_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill828_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation828_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\000}Îèî\rÇÔ³%clÌl>ËK\003iêV"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill828_25 = local6_life21;
        int __sourceSpill828_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill828_25)).substring(((int)(__sourceSpill828_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill828_30 = local8_life19;
        int __sourceSpill828_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill828_33 = new byte[8];
        (__sourceSpill828_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill828_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill828_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill828_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill828_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill828_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill828_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill828_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill828_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill828_34)).doFinal(((byte[])(__sourceSpill828_33)));
        (__sourceSpill828_30)[__sourceSpill828_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[3]));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockPlanks$EnumType.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite828_40())))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7528_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ed"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17074;
      if (W[var3] == null) {
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
         long var5 = V[var3];
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
         Object[] var9 = (Object[])X.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               X.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ed", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ed.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
int[] spill357_0;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_15;
    int[] life4_16;
    forward_join_53: {
    forward_join_48: {
    forward_join_41: {
    forward_join_34: {
    forward_join_32: {
    forward_join_27: {
    life2_3 = (moom.ed.U ^ 93501621818270L);
    spill357_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_15 = ((net.minecraft.block.state.IBlockState)(((moom.ed)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ed.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(((p0 & 3) + 4)))))));
    life4_16 = spill357_0;
    if (!((life4_16 != null))) {
        break forward_join_32;
    }
    switch ((p0 & __sourceIntrinsic_819466f05fee_invokedynamic357_6(28110, (2857230738773001392L ^ life2_3)))) {
case 0:
{
        break forward_join_27;
    }
case 4:
{
        break forward_join_34;
    }
case 8:
{
        break forward_join_41;
    }
default:
{
        break forward_join_48;
    }
}
    }
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.Y)));
    }
    if (!((life4_16 == null))) {
        break forward_join_53;
    }
    }
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.X)));
    if (!((life4_16 == null))) {
        break forward_join_53;
    }
    }
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.Z)));
    if (!((life4_16 == null))) {
        break forward_join_53;
    }
    }
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.NONE)));
    }
    return life5_15;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forestValue833_53_0;
    int[] spill833_0;
    int spill833_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_17;
    forest_join_53: {
    forest_join_52: {
    forest_join_44: {
    forest_join_34: {
    forest_join_28: {
    life2_3 = (moom.ed.U ^ 98673312409748L);
    spill833_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill833_0;
    life5_17 = (life5_6 | (((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ed.S))))))).a() - 4));
    spill833_1 = (moom.e0.b)[((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ed.R))))))).ordinal()];
    if (!((life4_7 != null))) {
        forestValue833_53_0 = spill833_1;
        break forest_join_53;
    }
    switch (spill833_1) {
case 1:
{
        break forest_join_28;
    }
case 2:
{
        break forest_join_34;
    }
case 3:
{
        break forest_join_44;
    }
default:
{
        break forest_join_52;
    }
}
    }
    life5_17 = (life5_17 | 4);
    if (!((life4_7 == null))) {
        break forest_join_52;
    }
    }
    life5_17 = (life5_17 | __sourceIntrinsic_8db5871551d4_invokedynamic833_11(16543, (4040062572698833642L ^ life2_3)));
    if (!((life4_7 == null))) {
        break forest_join_52;
    }
    }
    life5_17 = (life5_17 | __sourceIntrinsic_8db5871551d4_invokedynamic833_12(8760, (7654211336176103502L ^ life2_3)));
    }
    forestValue833_53_0 = life5_17;
    }
    return forestValue833_53_0;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return (((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ed.S))))))).a() - 4);
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
int forwardValue356_25_0;
    int[] spill356_0;
    int spill356_1;
    long life2_3;
    net.minecraft.block.BlockPlanks$EnumType life5_9;
    int[] life4_10;
    forward_join_31: {
    forward_join_28: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    life2_3 = (moom.ed.U ^ 33922670001563L);
    spill356_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ed.S)))));
    life4_10 = spill356_0;
    spill356_1 = (moom.e0.b)[((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ed.R))))))).ordinal()];
    if (!((life4_10 != null))) {
        forwardValue356_25_0 = spill356_1;
        break forward_join_25;
    }
    switch (spill356_1) {
case 1:
case 2:
case 3:
default:
{
        break forward_join_21;
    }
case 4:
{
        break forward_join_31;
    }
}
    }
    forwardValue356_25_0 = (moom.e0.a)[((net.minecraft.block.BlockPlanks$EnumType)(life5_9)).ordinal()];
    }
    switch (forwardValue356_25_0) {
case 1:
default:
{
        break forward_join_26;
    }
case 2:
{
        break forward_join_28;
    }
}
    }
    return moom.fm.m;
    }
    return ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a__fm();
    }
    return ((net.minecraft.block.BlockPlanks$EnumType)(life5_9)).a__fm();
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
return new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, (((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ed.S))))))).a() - 4));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ed.S, moom.ed.R});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, (((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a() - 4)))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, (((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a() - 4)))));
    return;
}


private static boolean lambda$static$0(net.minecraft.block.BlockPlanks$EnumType p0) {
int forwardValue3455_13_0;
    int forwardValue3455_15_0;
    int spill3455_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.ed.U ^ 33544423480818L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3455_0 = ((net.minecraft.block.BlockPlanks$EnumType)(p0)).a();
    if (!((life3_5 != null))) {
        forwardValue3455_13_0 = spill3455_0;
        break forward_join_13;
    }
    if (!((spill3455_0 >= 4))) {
        break forward_join_14;
    }
    forwardValue3455_13_0 = 1;
    }
    forwardValue3455_15_0 = forwardValue3455_13_0;
    break forward_join_15;
    }
    forwardValue3455_15_0 = 0;
    }
    return ((forwardValue3455_15_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite828_40() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7528_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic833_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic833_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic357_6(int a0, long a1) throws E;
}
