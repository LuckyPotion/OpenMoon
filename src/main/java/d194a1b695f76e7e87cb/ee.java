package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ee extends moom.ec {

public static final moom.fw<net.minecraft.block.BlockPlanks$EnumType> S;

private static final long U;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

public ee() {
super();
    (this).a__Void((((this.M).a__fE()).a__fE(moom.ee.S, net.minecraft.block.BlockPlanks$EnumType.OAK)).a__fE(moom.ee.R, net.minecraft.block.BlockLog$EnumAxis.Y));
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(3759522735309317986L)), ((long)(4612390053440488200L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(86123586238679L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ee.U ^ 70635045956618L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill829_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill829_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill829_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill829_14 = new byte[8];
    (__sourceSpill829_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill829_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation829_16 = __sourceSpill829_14;
    ((javax.crypto.Cipher)(__sourceSpill829_11)).init(((int)(__sourceSpill829_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill829_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation829_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ô0»ºW§æÝ9Üä\034¯\036¿Ø¤ßÞú]G"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill829_25 = local6_life21;
        int __sourceSpill829_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill829_25)).substring(((int)(__sourceSpill829_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill829_30 = local8_life19;
        int __sourceSpill829_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill829_33 = new byte[8];
        (__sourceSpill829_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill829_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill829_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill829_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill829_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill829_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill829_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill829_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill829_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill829_34)).doFinal(((byte[])(__sourceSpill829_33)));
        (__sourceSpill829_30)[__sourceSpill829_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[3]));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockPlanks$EnumType.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite829_40())))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7533_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ee"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26237;
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
            throw new RuntimeException("moom/ee", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ee.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
int[] spill359_0;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_15;
    int[] life4_16;
    forward_join_53: {
    forward_join_48: {
    forward_join_41: {
    forward_join_34: {
    forward_join_32: {
    forward_join_27: {
    life2_3 = (moom.ee.U ^ 42378123626762L);
    spill359_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_15 = ((net.minecraft.block.state.IBlockState)(((moom.ee)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(((p0 & 3) % 4)))))));
    life4_16 = spill359_0;
    if (!((life4_16 != null))) {
        break forward_join_32;
    }
    switch ((p0 & __sourceIntrinsic_819466f05fee_invokedynamic359_6(25033, (2819080386699979897L ^ life2_3)))) {
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
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.Y)));
    }
    if (!((life4_16 == null))) {
        break forward_join_53;
    }
    }
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.X)));
    if (!((life4_16 == null))) {
        break forward_join_53;
    }
    }
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.Z)));
    if (!((life4_16 == null))) {
        break forward_join_53;
    }
    }
    life5_15 = ((net.minecraft.block.state.IBlockState)(life5_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.R)), ((java.lang.Comparable)(net.minecraft.block.BlockLog$EnumAxis.NONE)));
    }
    return life5_15;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forestValue834_51_0;
    int[] spill834_0;
    int spill834_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_15;
    forest_join_51: {
    forest_join_50: {
    forest_join_42: {
    forest_join_32: {
    forest_join_26: {
    life2_3 = (moom.ee.U ^ 46449203687936L);
    spill834_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill834_0;
    life5_15 = (life5_6 | ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ee.S))))))).a());
    spill834_1 = (moom.e1.b)[((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ee.R))))))).ordinal()];
    if (!((life4_7 != null))) {
        forestValue834_51_0 = spill834_1;
        break forest_join_51;
    }
    switch (spill834_1) {
case 1:
{
        break forest_join_26;
    }
case 2:
{
        break forest_join_32;
    }
case 3:
{
        break forest_join_42;
    }
default:
{
        break forest_join_50;
    }
}
    }
    life5_15 = (life5_15 | 4);
    if (!((life4_7 == null))) {
        break forest_join_50;
    }
    }
    life5_15 = (life5_15 | __sourceIntrinsic_8db5871551d4_invokedynamic834_11(20705, (7254718325988959834L ^ life2_3)));
    if (!((life4_7 == null))) {
        break forest_join_50;
    }
    }
    life5_15 = (life5_15 | __sourceIntrinsic_8db5871551d4_invokedynamic834_12(23167, (6049541196161363142L ^ life2_3)));
    }
    forestValue834_51_0 = life5_15;
    }
    return forestValue834_51_0;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ee.S))))))).a();
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
int forwardValue358_25_0;
    int[] spill358_0;
    int spill358_1;
    long life2_3;
    net.minecraft.block.BlockPlanks$EnumType life5_9;
    int[] life4_10;
    forward_join_34: {
    forward_join_32: {
    forward_join_29: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    life2_3 = (moom.ee.U ^ 120236993210127L);
    spill358_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ee.S)))));
    life4_10 = spill358_0;
    spill358_1 = (moom.e1.b)[((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.BlockLog$EnumAxis)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ee.R))))))).ordinal()];
    if (!((life4_10 != null))) {
        forwardValue358_25_0 = spill358_1;
        break forward_join_25;
    }
    switch (spill358_1) {
case 1:
case 2:
case 3:
default:
{
        break forward_join_21;
    }
case 4:
{
        break forward_join_34;
    }
}
    }
    forwardValue358_25_0 = (moom.e1.a)[((net.minecraft.block.BlockPlanks$EnumType)(life5_9)).ordinal()];
    }
    switch (forwardValue358_25_0) {
case 1:
default:
{
        break forward_join_26;
    }
case 2:
{
        break forward_join_29;
    }
case 3:
{
        break forward_join_32;
    }
}
    }
    return ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a__fm();
    }
    return ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a__fm();
    }
    return moom.fm.p;
    }
    return ((net.minecraft.block.BlockPlanks$EnumType)(life5_9)).a__fm();
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
return new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ee.S))))))).a());
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ee.S, moom.ee.R});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a()))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a()))));
    return;
}


private static boolean lambda$static$0(net.minecraft.block.BlockPlanks$EnumType p0) {
int forwardValue3459_13_0;
    int forwardValue3459_15_0;
    int spill3459_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.ee.U ^ 30241757393577L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3459_0 = ((net.minecraft.block.BlockPlanks$EnumType)(p0)).a();
    if (!((life3_5 != null))) {
        forwardValue3459_13_0 = spill3459_0;
        break forward_join_13;
    }
    if (!((spill3459_0 < 4))) {
        break forward_join_14;
    }
    forwardValue3459_13_0 = 1;
    }
    forwardValue3459_15_0 = forwardValue3459_13_0;
    break forward_join_15;
    }
    forwardValue3459_15_0 = 0;
    }
    return ((forwardValue3459_15_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite829_40() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7533_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic834_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic834_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic359_6(int a0, long a1) throws E;
}
