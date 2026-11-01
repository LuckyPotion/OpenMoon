package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class ej extends moom.ei {

public static moom.fv R;

public static moom.fw<net.minecraft.block.BlockStoneSlab$EnumType> S;

private static long U;

private static long[] Y;

private static java.lang.Integer[] Z;

private static java.util.Map bb;

public ej() { super((moom.fn)null); }


private static void __sourceConstructorBody_91c4c7d88aeb2a79(moom.ej receiver) throws Throwable {

long local1_life2;

    net.minecraft.block.state.IBlockState local4_life9;

    int[] local3_life10;

    forward_join_30: {

    forward_join_25: {

    forward_join_23: {

    local1_life2 = (moom.ej.U ^ 28166752029237L);

    int[] __sourceSpill418_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();

    moom.ej.__sourceConstructorInit_91c4c7d88aeb2a79_0(((moom.ej)(receiver)), ((moom.fn)(moom.fn.e)));

    local4_life9 = ((moom.fA)(((moom.ej)(receiver)).M)).a__fE();

    local3_life10 = __sourceSpill418_5;

    if (!((local3_life10 != null))) { break forward_join_23; }

    if (!(((moom.ej)(receiver)).s())) { break forward_join_25; }

    local4_life9 = ((net.minecraft.block.state.IBlockState)(local4_life9)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ej.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));

    }

    if (!((local3_life10 == null))) { break forward_join_30; }

    }

    local4_life9 = ((net.minecraft.block.state.IBlockState)(local4_life9)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ej.Q)), ((java.lang.Comparable)(moom.ak.BOTTOM)));

    }

    ((moom.ej)(receiver)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(local4_life9)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ej.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStoneSlab$EnumType.STONE))))));

    ((moom.ej)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.b)));

    return;

}



static {
U = ((long)(((moom._a)(moom._c.a(((long)(1145137478880939068L)), ((long)(-8474771271124292224L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(151764768796358L)))));
    bb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ej.U ^ 140065137797228L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1184_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1184_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1184_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1184_14 = new byte[8];
    (__sourceSpill1184_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1184_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1184_16 = __sourceSpill1184_14;
    ((javax.crypto.Cipher)(__sourceSpill1184_11)).init(((int)(__sourceSpill1184_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1184_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1184_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "mpº)+4®JÝ²è\016'"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1184_25 = local6_life21;
        int __sourceSpill1184_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1184_25)).substring(((int)(__sourceSpill1184_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1184_30 = local8_life19;
        int __sourceSpill1184_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1184_33 = new byte[8];
        (__sourceSpill1184_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1184_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1184_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1184_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1184_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1184_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1184_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1184_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1184_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1184_34)).doFinal(((byte[])(__sourceSpill1184_33)));
        (__sourceSpill1184_30)[__sourceSpill1184_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ú½PO\034\007vpñý½£ãH"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1184_38 = local6_life21;
        int __sourceSpill1184_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1184_38)).substring(((int)(__sourceSpill1184_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1184_43 = local8_life19;
        int __sourceSpill1184_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1184_46 = new byte[8];
        (__sourceSpill1184_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1184_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1184_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1184_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1184_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1184_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1184_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1184_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1184_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1184_47)).doFinal(((byte[])(__sourceSpill1184_46)));
        (__sourceSpill1184_43)[__sourceSpill1184_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Y = ((long[])(local8_life19));
    Z = ((java.lang.Integer[])(new java.lang.Integer[4]));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("seamless")))));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockStoneSlab$EnumType.class)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_91c4c7d88aeb2a79_0(moom.ej a0, moom.fn a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3471_26_0;
    int forwardValue3471_53_0;
    int[] spill3471_0;
    boolean spill3471_1;
    long life2_3;
    int life5_5;
    int life5_14;
    int[] life4_15;
    forward_join_53: {
    forward_join_52: {
    forward_join_39: {
    forward_join_26: {
    life2_3 = (moom.ej.U ^ 125031511555755L);
    life5_5 = 0;
    spill3471_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_14 = (life5_5 | ((net.minecraft.block.BlockStoneSlab$EnumType)(((net.minecraft.block.BlockStoneSlab$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ej.S))))))).a());
    life4_15 = spill3471_0;
    spill3471_1 = ((moom.ej)(this)).s();
    if (!((life4_15 != null))) {
        forwardValue3471_26_0 = ((spill3471_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill3471_1)) {
        break forward_join_39;
    }
    forwardValue3471_26_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ej.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_15 != null))) {
        forwardValue3471_53_0 = forwardValue3471_26_0;
        break forward_join_53;
    }
    if (!((forwardValue3471_26_0 != 0))) {
        break forward_join_52;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3471_13(29435, (1730613527302391264L ^ life2_3)));
    if (!((life4_15 == null))) {
        break forward_join_52;
    }
    }
    if (!((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ej.Q))) == moom.ak.TOP))) {
        break forward_join_52;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3471_17(29435, (1730613527302391264L ^ life2_3)));
    }
    forwardValue3471_53_0 = life5_14;
    }
    return forwardValue3471_53_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3472_35_0;
    moom.fv forwardValue3472_35_1;
    int forwardValue3472_35_2;
    net.minecraft.block.state.IBlockState forwardValue3472_36_0;
    moom.fv forwardValue3472_36_1;
    net.minecraft.block.state.IBlockState forwardValue3472_37_0;
    moom.fv forwardValue3472_37_1;
    int forwardValue3472_37_2;
    net.minecraft.block.state.IBlockState forwardValue3472_54_0;
    moom.fw forwardValue3472_54_1;
    net.minecraft.block.state.IBlockState forwardValue3472_55_0;
    moom.fw forwardValue3472_55_1;
    moom.ak forwardValue3472_55_2;
    int[] spill3472_0;
    net.minecraft.block.state.IBlockState spill3472_1;
    moom.fv spill3472_2;
    int spill3472_3;
    net.minecraft.block.state.IBlockState spill3472_4;
    moom.fw spill3472_5;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_17;
    int[] life4_18;
    forward_join_57: {
    forward_join_55: {
    forward_join_54: {
    forward_join_42: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    life2_3 = (moom.ej.U ^ 137452033181089L);
    spill3472_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_17 = ((net.minecraft.block.state.IBlockState)(((moom.ej)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ej.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStoneSlab$EnumType.a(((int)((p0 & __sourceIntrinsic_819466f05fee_invokedynamic3472_4(30905, (1322163987948221609L ^ life2_3)))))))));
    life4_18 = spill3472_0;
    if (!(((moom.ej)(this)).s())) {
        break forward_join_42;
    }
    spill3472_1 = life5_17;
    spill3472_2 = moom.ej.R;
    spill3472_3 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3472_9(17626, (2778441419962124488L ^ life2_3)));
    if (!((life4_18 != null))) {
        forwardValue3472_35_0 = spill3472_1;
        forwardValue3472_35_1 = spill3472_2;
        forwardValue3472_35_2 = spill3472_3;
        break forward_join_35;
    }
    if (!((spill3472_3 != 0))) {
        forwardValue3472_36_0 = spill3472_1;
        forwardValue3472_36_1 = spill3472_2;
        break forward_join_36;
    }
    forwardValue3472_35_0 = spill3472_1;
    forwardValue3472_35_1 = spill3472_2;
    forwardValue3472_35_2 = 1;
    }
    forwardValue3472_37_0 = forwardValue3472_35_0;
    forwardValue3472_37_1 = forwardValue3472_35_1;
    forwardValue3472_37_2 = forwardValue3472_35_2;
    break forward_join_37;
    }
    forwardValue3472_37_0 = forwardValue3472_36_0;
    forwardValue3472_37_1 = forwardValue3472_36_1;
    forwardValue3472_37_2 = 0;
    }
    life5_17 = ((net.minecraft.block.state.IBlockState)(forwardValue3472_37_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3472_37_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3472_37_2)))))));
    if (!((life4_18 == null))) {
        break forward_join_57;
    }
    }
    spill3472_4 = life5_17;
    spill3472_5 = moom.ej.Q;
    if (!(((p0 & __sourceIntrinsic_819466f05fee_invokedynamic3472_13(29435, (1730599834421837546L ^ life2_3))) == 0))) {
        forwardValue3472_54_0 = spill3472_4;
        forwardValue3472_54_1 = spill3472_5;
        break forward_join_54;
    }
    forwardValue3472_55_0 = spill3472_4;
    forwardValue3472_55_1 = spill3472_5;
    forwardValue3472_55_2 = moom.ak.BOTTOM;
    break forward_join_55;
    }
    forwardValue3472_55_0 = forwardValue3472_54_0;
    forwardValue3472_55_1 = forwardValue3472_54_1;
    forwardValue3472_55_2 = moom.ak.TOP;
    }
    life5_17 = ((net.minecraft.block.state.IBlockState)(forwardValue3472_55_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3472_55_1)), ((java.lang.Comparable)(forwardValue3472_55_2)));
    }
    return life5_17;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockStoneSlab$EnumType)(((net.minecraft.block.BlockStoneSlab$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ej.S))))))).a();
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10205;
      if (Z[var3] == null) {
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
         long var5 = Y[var3];
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
         Object[] var9 = (Object[])bb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               bb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ej", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Z[var3] = var15;
      }

      return Z[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ej.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7552_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ej"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)));
}


public java.lang.Object a(net.minecraft.item.ItemStack p0) {
long local2 = (moom.ej.U ^ 63706794955049L);
    return net.minecraft.block.BlockStoneSlab$EnumType.a(((int)((((net.minecraft.item.ItemStack)(p0)).c() & __sourceIntrinsic_2fa48888bac4_originalDynamicSite1423_2(3086, (3842939911320163477L ^ local2))))));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.U)));
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
long life4_3;
    int[] life6_5;
    net.minecraft.block.BlockStoneSlab$EnumType[] life7_11;
    int life8_14;
    int life9_16;
    net.minecraft.block.BlockStoneSlab$EnumType life10_23;
    lexical_join_42: {
    life4_3 = (moom.ej.U ^ 137664439755772L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p0 != net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.T)))))) {
        break lexical_join_42;
    }
    life7_11 = net.minecraft.block.BlockStoneSlab$EnumType.values();
    life8_14 = (life7_11).length;
    life9_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    if (!((life9_16 < life8_14))) {
        break lexical_join_42;
    }
    life10_23 = (life7_11)[life9_16];
    if (!((life6_5 != null))) {
        break lexical_join_40;
    }
    if (!((life10_23 != net.minecraft.block.BlockStoneSlab$EnumType.WOOD))) {
        break lexical_join_39;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockStoneSlab$EnumType)(life10_23)).a()))));
    }
    life9_16 += 1;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public net.minecraft.block.properties.IProperty<?> a__ft() {
return moom.ej.S;
}


public java.lang.String a__sourceReturn_b52d34d971(int p0) {
return __sourceIntrinsic_008018dcd7e9_originalDynamicSite1424_3(super.b__String(), ((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.a(((int)(p0))))).b());
}


protected moom.fA a__fA() {
long local1 = (moom.ej.U ^ 70735756394361L);
    return (((moom.ej)(this)).s() ? new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ej.R, moom.ej.S}) : new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ej.Q, moom.ej.S}));
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockStoneSlab$EnumType)(((net.minecraft.block.BlockStoneSlab$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ej.S))))))).a__fm();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_008018dcd7e9_originalDynamicSite1424_3(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2fa48888bac4_originalDynamicSite1423_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3471_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3471_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3472_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3472_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3472_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7552_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
