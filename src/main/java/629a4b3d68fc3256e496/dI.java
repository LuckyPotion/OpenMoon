package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dI extends moom.dH {

public static final moom.fw<net.minecraft.block.BlockPlanks$EnumType> W;

private static final long Z;

private static final long[] hb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public dI() {
super();
    (this).a__Void(((((this.M).a__fE()).a__fE(moom.dI.W, net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a__fE(moom.dI.S, java.lang.Boolean.TRUE)).a__fE(moom.dI.R, java.lang.Boolean.TRUE));
}


static {
Z = ((long)(((moom._a)(moom._c.a(((long)(3491238333015408953L)), ((long)(-1573711096223331448L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260826019920236L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dI.Z ^ 52754098194898L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill804_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill804_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill804_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill804_14 = new byte[8];
    (__sourceSpill804_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill804_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation804_16 = __sourceSpill804_14;
    ((javax.crypto.Cipher)(__sourceSpill804_11)).init(((int)(__sourceSpill804_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill804_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation804_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "øûè'Ù±×Æ¬rî¶Èò\005"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill804_25 = local6_life21;
        int __sourceSpill804_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill804_25)).substring(((int)(__sourceSpill804_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill804_30 = local8_life19;
        int __sourceSpill804_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill804_33 = new byte[8];
        (__sourceSpill804_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill804_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill804_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill804_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill804_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill804_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill804_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill804_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill804_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill804_34)).doFinal(((byte[])(__sourceSpill804_33)));
        (__sourceSpill804_30)[__sourceSpill804_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[2]));
    W = ((moom.fw)(moom.fw.a(((java.lang.String)("variant")), ((java.lang.Class)(net.minecraft.block.BlockPlanks$EnumType.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite804_40())))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3241_21_0;
    moom.fv forwardValue3241_21_1;
    int forwardValue3241_21_2;
    net.minecraft.block.state.IBlockState forwardValue3241_22_0;
    moom.fv forwardValue3241_22_1;
    net.minecraft.block.state.IBlockState forwardValue3241_23_0;
    moom.fv forwardValue3241_23_1;
    int forwardValue3241_23_2;
    net.minecraft.block.state.IBlockState forwardValue3241_37_0;
    moom.fv forwardValue3241_37_1;
    int forwardValue3241_37_2;
    net.minecraft.block.state.IBlockState forwardValue3241_38_0;
    moom.fv forwardValue3241_38_1;
    net.minecraft.block.state.IBlockState forwardValue3241_39_0;
    moom.fv forwardValue3241_39_1;
    int forwardValue3241_39_2;
    net.minecraft.block.state.IBlockState spill3241_0;
    moom.fv spill3241_1;
    int spill3241_2;
    net.minecraft.block.state.IBlockState spill3241_3;
    moom.fv spill3241_4;
    int spill3241_5;
    long life2_3;
    int[] life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.dI.Z ^ 126098740420366L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3241_0 = ((net.minecraft.block.state.IBlockState)(((moom.dI)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dI.W)), ((java.lang.Comparable)(((moom.dI)(this)).a__sourceReturn_71725fcced(((int)(p0))))));
    spill3241_1 = moom.dI.R;
    spill3241_2 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue3241_21_0 = spill3241_0;
        forwardValue3241_21_1 = spill3241_1;
        forwardValue3241_21_2 = spill3241_2;
        break forward_join_21;
    }
    if (!((spill3241_2 == 0))) {
        forwardValue3241_22_0 = spill3241_0;
        forwardValue3241_22_1 = spill3241_1;
        break forward_join_22;
    }
    forwardValue3241_21_0 = spill3241_0;
    forwardValue3241_21_1 = spill3241_1;
    forwardValue3241_21_2 = 1;
    }
    forwardValue3241_23_0 = forwardValue3241_21_0;
    forwardValue3241_23_1 = forwardValue3241_21_1;
    forwardValue3241_23_2 = forwardValue3241_21_2;
    break forward_join_23;
    }
    forwardValue3241_23_0 = forwardValue3241_22_0;
    forwardValue3241_23_1 = forwardValue3241_22_1;
    forwardValue3241_23_2 = 0;
    }
    spill3241_3 = ((net.minecraft.block.state.IBlockState)(forwardValue3241_23_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3241_23_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3241_23_2)))))));
    spill3241_4 = moom.dI.S;
    spill3241_5 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3241_10(15855, (2800123961194870997L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3241_37_0 = spill3241_3;
        forwardValue3241_37_1 = spill3241_4;
        forwardValue3241_37_2 = spill3241_5;
        break forward_join_37;
    }
    if (!((spill3241_5 > 0))) {
        forwardValue3241_38_0 = spill3241_3;
        forwardValue3241_38_1 = spill3241_4;
        break forward_join_38;
    }
    forwardValue3241_37_0 = spill3241_3;
    forwardValue3241_37_1 = spill3241_4;
    forwardValue3241_37_2 = 1;
    }
    forwardValue3241_39_0 = forwardValue3241_37_0;
    forwardValue3241_39_1 = forwardValue3241_37_1;
    forwardValue3241_39_2 = forwardValue3241_37_2;
    break forward_join_39;
    }
    forwardValue3241_39_0 = forwardValue3241_38_0;
    forwardValue3241_39_1 = forwardValue3241_38_1;
    forwardValue3241_39_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3241_39_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3241_39_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3241_39_2)))))));
}


protected void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3) {
net.minecraft.world.World forwardValue3240_19_0;
    net.minecraft.world.World spill3240_0;
    long life5_3;
    int[] life7_5;
    forward_join_27: {
    forward_join_19: {
    life5_3 = (moom.dI.Z ^ 84670283638900L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))) == net.minecraft.block.BlockPlanks$EnumType.DARK_OAK))) {
        break forward_join_27;
    }
    spill3240_0 = p0;
    if (!((life7_5 != null))) {
        forwardValue3240_19_0 = spill3240_0;
        break forward_join_19;
    }
    if (!((((java.util.Random)(((net.minecraft.world.World)(spill3240_0)).u)).nextInt(((int)(p3))) == 0))) {
        break forward_join_27;
    }
    forwardValue3240_19_0 = p0;
    }
    moom.dI.a(((net.minecraft.world.World)(forwardValue3240_19_0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.e, 1, 0))));
    }
    return;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3239_35_0;
    int forwardValue3239_47_0;
    int[] spill3239_0;
    boolean spill3239_1;
    long life2_3;
    int life5_5;
    int life5_16;
    int[] life4_17;
    forward_join_47: {
    forward_join_46: {
    forward_join_35: {
    forward_join_30: {
    life2_3 = (moom.dI.Z ^ 138656709436420L);
    life5_5 = 0;
    spill3239_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_16 = (life5_5 | (((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))))))).a() - 4));
    life4_17 = spill3239_0;
    spill3239_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dI.R))))))).booleanValue();
    if (!((life4_17 != null))) {
        forwardValue3239_35_0 = ((spill3239_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill3239_1))) {
        break forward_join_30;
    }
    life5_16 = (life5_16 | 4);
    }
    forwardValue3239_35_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dI.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_17 != null))) {
        forwardValue3239_47_0 = forwardValue3239_35_0;
        break forward_join_47;
    }
    if (!((forwardValue3239_35_0 != 0))) {
        break forward_join_46;
    }
    life5_16 = (life5_16 | __sourceIntrinsic_8db5871551d4_invokedynamic3239_16(11257, (7251010638932415944L ^ life2_3)));
    }
    forwardValue3239_47_0 = life5_16;
    }
    return forwardValue3239_47_0;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dI.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7283_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12023;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))))))).a();
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 0))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 1))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
java.lang.Object local3 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    return (((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local3)).a__ch())).b(((net.minecraft.block.state.IBlockState)(local3))) & 3);
}


public net.minecraft.block.BlockPlanks$EnumType a__sourceReturn_71725fcced(int p0) {
return net.minecraft.block.BlockPlanks$EnumType.a(((int)(((p0 & 3) + 4))));
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
return new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, (((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))))))).a() - 4));
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
net.minecraft.item.ItemStack forwardValue3238_18_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3238_22_0;
    net.minecraft.item.ItemStack spill3238_0;
    net.minecraft.entity.player.EntityPlayer spill3238_1;
    long life6_3;
    int[] life8_5;
    forward_join_52: {
    forward_join_45: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.dI.Z ^ 36538004946325L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_45;
    }
    spill3238_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).c__xW();
    if (!((life8_5 != null))) {
        forwardValue3238_18_0 = spill3238_0;
        break forward_join_18;
    }
    if (!((spill3238_0 != null))) {
        break forward_join_45;
    }
    spill3238_1 = p1;
    if (!((life8_5 != null))) {
        forwardValue3238_22_0 = spill3238_1;
        break forward_join_22;
    }
    forwardValue3238_18_0 = ((net.minecraft.entity.player.EntityPlayer)(spill3238_1)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3238_18_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_45;
    }
    forwardValue3238_22_0 = p1;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue3238_22_0)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[net.minecraft.block.Block.a(((net.minecraft.block.Block)(this)))])));
    moom.dI.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, (((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.dI.W))))))).a() - 4)))));
    if (!((life8_5 == null))) {
        break forward_join_52;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((net.minecraft.tileentity.TileEntity)(p4)));
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dI.W, moom.dI.S, moom.dI.R});
}


private static boolean lambda$static$0(net.minecraft.block.BlockPlanks$EnumType p0) {
int forwardValue3242_13_0;
    int forwardValue3242_15_0;
    int spill3242_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.dI.Z ^ 98230742225606L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3242_0 = ((net.minecraft.block.BlockPlanks$EnumType)(p0)).a();
    if (!((life3_5 != null))) {
        forwardValue3242_13_0 = spill3242_0;
        break forward_join_13;
    }
    if (!((spill3242_0 >= 4))) {
        break forward_join_14;
    }
    forwardValue3242_13_0 = 1;
    }
    forwardValue3242_15_0 = forwardValue3242_13_0;
    break forward_join_15;
    }
    forwardValue3242_15_0 = 0;
    }
    return ((forwardValue3242_15_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite804_40() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3241_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3239_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7283_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
