package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class ep extends moom.ei {

public static moom.fw<net.minecraft.block.BlockPlanks$EnumType> R;

private static long S;

private static long[] U;

private static java.lang.Integer[] Y;

private static java.util.Map Z;

public ep() { super((moom.fn)null); }


private static void __sourceConstructorBody_e1c1b24f0ae31c15(moom.ep receiver) throws Throwable {

net.minecraft.block.Block forwardValue456_32_0;

    int[] spill456_0;

    moom.ep spill456_1;

    long life1_3;

    int[] life3_8;

    net.minecraft.block.state.IBlockState life4_12;

    forward_join_32: {

    forward_join_23: {

    life1_3 = (moom.ep.S ^ 113554459574155L);

    spill456_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();

    moom.ep.__sourceConstructorInit_e1c1b24f0ae31c15_0(((moom.ep)(receiver)), ((moom.fn)(moom.fn.d)));

    life3_8 = spill456_0;

    life4_12 = ((moom.fA)(((moom.ep)(receiver)).M)).a__fE();

    spill456_1 = receiver;

    if (!((life3_8 != null))) {

        forwardValue456_32_0 = spill456_1;

        break forward_join_32;

    }

    if (!((!((moom.ep)(spill456_1)).s()))) {

        break forward_join_23;

    }

    life4_12 = ((net.minecraft.block.state.IBlockState)(life4_12)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ep.Q)), ((java.lang.Comparable)(moom.ak.BOTTOM)));

    }

    ((moom.ep)(receiver)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life4_12)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ep.R)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.OAK))))));

    forwardValue456_32_0 = ((moom.ep)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.b)));

    }

    recovery.source.CarrierOps.discard(forwardValue456_32_0);

    return;

}



static {
S = ((long)(((moom._a)(moom._c.a(((long)(796450650536385533L)), ((long)(2111301612198790213L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(250659470214509L)))));
    Z = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ep.S ^ 127917287733399L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1186_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1186_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1186_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1186_14 = new byte[8];
    (__sourceSpill1186_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1186_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1186_16 = __sourceSpill1186_14;
    ((javax.crypto.Cipher)(__sourceSpill1186_11)).init(((int)(__sourceSpill1186_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1186_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1186_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "v\f_\\\032*z\020\024Û³\035v"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1186_25 = local6_life21;
        int __sourceSpill1186_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1186_25)).substring(((int)(__sourceSpill1186_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1186_30 = local8_life19;
        int __sourceSpill1186_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1186_33 = new byte[8];
        (__sourceSpill1186_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1186_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1186_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1186_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1186_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1186_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1186_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1186_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1186_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1186_34)).doFinal(((byte[])(__sourceSpill1186_33)));
        (__sourceSpill1186_30)[__sourceSpill1186_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "îf<¾\016`\026¥«þ¾%¹"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1186_38 = local6_life21;
        int __sourceSpill1186_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1186_38)).substring(((int)(__sourceSpill1186_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1186_43 = local8_life19;
        int __sourceSpill1186_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1186_46 = new byte[8];
        (__sourceSpill1186_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1186_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1186_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1186_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1186_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1186_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1186_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1186_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1186_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1186_47)).doFinal(((byte[])(__sourceSpill1186_46)));
        (__sourceSpill1186_43)[__sourceSpill1186_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    Y = ((java.lang.Integer[])(new java.lang.Integer[4]));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockPlanks$EnumType.class)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_e1c1b24f0ae31c15_0(moom.ep a0, moom.fn a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3477_35_0;
    int[] spill3477_0;
    boolean spill3477_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_15;
    forward_join_35: {
    forward_join_34: {
    life2_3 = (moom.ep.S ^ 125214146808903L);
    spill3477_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3477_0;
    life5_15 = (life5_6 | ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ep.R))))))).a());
    spill3477_1 = ((moom.ep)(this)).s();
    if (!((life4_7 != null))) {
        forwardValue3477_35_0 = ((spill3477_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill3477_1))) {
        break forward_join_34;
    }
    if (!((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ep.Q))) == moom.ak.TOP))) {
        break forward_join_34;
    }
    life5_15 = (life5_15 | __sourceIntrinsic_8db5871551d4_invokedynamic3477_11(31506, (8862916202578727630L ^ life2_3)));
    }
    forwardValue3477_35_0 = life5_15;
    }
    return forwardValue3477_35_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.ep.S ^ 137806474491725L);
    net.minecraft.block.state.IBlockState local4 = ((net.minecraft.block.state.IBlockState)(((moom.ep)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ep.R)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.a(((int)((p0 & __sourceIntrinsic_819466f05fee_invokedynamic6432_3(10301, (4593741815461247720L ^ local2)))))))));
    if ((!((moom.ep)(this)).s())) {
        local4 = ((net.minecraft.block.state.IBlockState)(local4)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ep.Q)), ((java.lang.Comparable)((((p0 & __sourceIntrinsic_819466f05fee_invokedynamic6432_8(27255, (1329506291575830691L ^ local2))) == 0) ? moom.ak.BOTTOM : moom.ak.TOP))));
    }
    return local4;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ep.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14616;
      if (Y[var3] == null) {
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
         long var5 = U[var3];
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
         Object[] var9 = (Object[])Z.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Z.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ep", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Y[var3] = var15;
      }

      return Y[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7562_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ep"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ep.R))))))).a();
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)));
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ep.R))))))).a__fm();
}


public java.lang.Object a(net.minecraft.item.ItemStack p0) {
long local2 = (moom.ep.S ^ 63387250402245L);
    return net.minecraft.block.BlockPlanks$EnumType.a(((int)((((net.minecraft.item.ItemStack)(p0)).c() & __sourceIntrinsic_2fa48888bac4_originalDynamicSite1428_2(12176, (6455462556444682703L ^ local2))))));
}


public net.minecraft.block.properties.IProperty<?> a__ft() {
return moom.ep.R;
}


public java.lang.String a__sourceReturn_b52d34d971(int p0) {
return __sourceIntrinsic_008018dcd7e9_originalDynamicSite1429_3(super.b__String(), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(p0))))).b());
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)));
}


protected moom.fA a__fA() {
long local1 = (moom.ep.S ^ 70385551330709L);
    return (((moom.ep)(this)).s() ? new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ep.R}) : new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ep.Q, moom.ep.R}));
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
long life4_3;
    int[] life6_5;
    net.minecraft.block.BlockPlanks$EnumType[] life7_11;
    int life8_14;
    int life9_16;
    net.minecraft.block.BlockPlanks$EnumType life10_23;
    lexical_join_37: {
    life4_3 = (moom.ep.S ^ 137860303720720L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p0 != net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bA)))))) {
        break lexical_join_37;
    }
    life7_11 = net.minecraft.block.BlockPlanks$EnumType.values();
    life8_14 = (life7_11).length;
    life9_16 = 0;
    lexical_cycle_17: while (true) {
    if (!((life9_16 < life8_14))) {
        break lexical_join_37;
    }
    life10_23 = (life7_11)[life9_16];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(life10_23)).a()))));
    life9_16 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_008018dcd7e9_originalDynamicSite1429_3(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2fa48888bac4_originalDynamicSite1428_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3477_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic6432_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic6432_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7562_0() throws E;
}
