package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ev extends net.minecraft.block.Block {

public static final moom.fv Q;

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected ev() {
super(moom.fn.m);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.ev.Q, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(4056209020031382032L)), ((long)(7719673238932277449L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(19443923137452L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ev.R ^ 90049166801945L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill833_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill833_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill833_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill833_14 = new byte[8];
    (__sourceSpill833_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill833_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation833_16 = __sourceSpill833_14;
    ((javax.crypto.Cipher)(__sourceSpill833_11)).init(((int)(__sourceSpill833_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill833_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation833_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\027r0;Âi¾N\r\030i\nÚ¢ùeFCUBú="))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill833_25 = local6_life21;
        int __sourceSpill833_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill833_25)).substring(((int)(__sourceSpill833_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill833_30 = local8_life19;
        int __sourceSpill833_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill833_33 = new byte[8];
        (__sourceSpill833_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill833_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill833_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill833_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill833_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill833_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill833_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill833_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill833_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill833_34)).doFinal(((byte[])(__sourceSpill833_33)));
        (__sourceSpill833_30)[__sourceSpill833_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[3]));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("wet")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3487_17_0;
    moom.fv forwardValue3487_17_1;
    int forwardValue3487_17_2;
    net.minecraft.block.state.IBlockState forwardValue3487_18_0;
    moom.fv forwardValue3487_18_1;
    net.minecraft.block.state.IBlockState forwardValue3487_19_0;
    moom.fv forwardValue3487_19_1;
    int forwardValue3487_19_2;
    net.minecraft.block.state.IBlockState spill3487_0;
    moom.fv spill3487_1;
    int spill3487_2;
    long life2_3;
    int[] life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.ev.R ^ 82168516813899L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3487_0 = ((moom.ev)(this)).a__fE();
    spill3487_1 = moom.ev.Q;
    spill3487_2 = (p0 & 1);
    if (!((life4_5 != null))) {
        forwardValue3487_17_0 = spill3487_0;
        forwardValue3487_17_1 = spill3487_1;
        forwardValue3487_17_2 = spill3487_2;
        break forward_join_17;
    }
    if (!((spill3487_2 == 1))) {
        forwardValue3487_18_0 = spill3487_0;
        forwardValue3487_18_1 = spill3487_1;
        break forward_join_18;
    }
    forwardValue3487_17_0 = spill3487_0;
    forwardValue3487_17_1 = spill3487_1;
    forwardValue3487_17_2 = 1;
    }
    forwardValue3487_19_0 = forwardValue3487_17_0;
    forwardValue3487_19_1 = forwardValue3487_17_1;
    forwardValue3487_19_2 = forwardValue3487_17_2;
    break forward_join_19;
    }
    forwardValue3487_19_0 = forwardValue3487_18_0;
    forwardValue3487_19_1 = forwardValue3487_18_1;
    forwardValue3487_19_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3487_19_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3487_19_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3487_19_2)))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3486_15_0;
    int forwardValue3486_17_0;
    boolean spill3486_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.ev.R ^ 77032252366657L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3486_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ev.Q))))))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue3486_15_0 = ((spill3486_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill3486_0)) {
        break forward_join_16;
    }
    forwardValue3486_15_0 = 1;
    }
    forwardValue3486_17_0 = forwardValue3486_15_0;
    break forward_join_17;
    }
    forwardValue3486_17_0 = 0;
    }
    return forwardValue3486_17_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29353;
      if (T[var3] == null) {
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
         long var5 = S[var3];
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
         Object[] var9 = (Object[])U.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               U.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ev", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ev.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7576_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ev"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.ev)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3490_28_0;
    moom.bs forwardValue3490_67_0;
    moom.bs forwardValue3490_102_0;
    double forwardValue3490_113_0;
    boolean spill3490_0;
    moom.bs spill3490_1;
    double spill3490_2;
    long life5_3;
    int[] life7_5;
    moom.bs life8_14;
    double life9_38;
    double life11_42;
    double life13_46;
    forward_join_125: {
    forward_join_114: {
    forward_join_113: {
    forward_join_110: {
    forward_join_102: {
    forward_join_94: {
    forward_join_92: {
    forward_join_88: {
    forward_join_67: {
    forward_join_59: {
    forward_join_28: {
    life5_3 = (moom.ev.R ^ 49678726803708L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.ev.Q))))))).booleanValue())) {
        break forward_join_125;
    }
    life8_14 = moom.bs.a(((java.util.Random)(p3)));
    if (!((life8_14 != moom.bs.UP))) {
        break forward_join_125;
    }
    spill3490_0 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_14))))));
    if (!((life7_5 != null))) {
        forwardValue3490_28_0 = ((spill3490_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3490_0))) {
        break forward_join_125;
    }
    forwardValue3490_28_0 = ((moom.DT)(p1)).a();
    }
    life9_38 = ((double) forwardValue3490_28_0);
    life11_42 = ((double) ((moom.DT)(p1)).b());
    life13_46 = ((double) ((moom.DT)(p1)).c());
    spill3490_1 = life8_14;
    if (!((life7_5 != null))) {
        forwardValue3490_67_0 = spill3490_1;
        break forward_join_67;
    }
    if (!((spill3490_1 == moom.bs.DOWN))) {
        break forward_join_59;
    }
    life11_42 = (life11_42 - 0x1.999999999999ap-5d);
    life9_38 = (life9_38 + ((java.util.Random)(p3)).nextDouble());
    life13_46 = (life13_46 + ((java.util.Random)(p3)).nextDouble());
    if (!((life7_5 == null))) {
        break forward_join_114;
    }
    }
    life11_42 = (life11_42 + (((java.util.Random)(p3)).nextDouble() * 0x1.999999999999ap-1d));
    forwardValue3490_67_0 = life8_14;
    }
    if (!((life7_5 != null))) {
        forwardValue3490_102_0 = forwardValue3490_67_0;
        break forward_join_102;
    }
    if (!((((moom.bs)(forwardValue3490_67_0)).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) {
        break forward_join_94;
    }
    life13_46 = (life13_46 + ((java.util.Random)(p3)).nextDouble());
    if (!((life7_5 != null))) {
        break forward_join_92;
    }
    if (!((life8_14 == moom.bs.EAST))) {
        break forward_join_88;
    }
    life9_38 = (life9_38 + 0x1.0p0d);
    if (!((life7_5 == null))) {
        break forward_join_114;
    }
    }
    life9_38 = (life9_38 + 0x1.999999999999ap-5d);
    }
    if (!((life7_5 == null))) {
        break forward_join_114;
    }
    }
    spill3490_2 = (life9_38 + ((java.util.Random)(p3)).nextDouble());
    if (!((life7_5 != null))) {
        forwardValue3490_113_0 = spill3490_2;
        break forward_join_113;
    }
    life9_38 = spill3490_2;
    forwardValue3490_102_0 = life8_14;
    }
    if (!((forwardValue3490_102_0 == moom.bs.SOUTH))) {
        break forward_join_110;
    }
    life13_46 = (life13_46 + 0x1.0p0d);
    if (!((life7_5 == null))) {
        break forward_join_114;
    }
    }
    forwardValue3490_113_0 = (life13_46 + 0x1.999999999999ap-5d);
    }
    life13_46 = forwardValue3490_113_0;
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.DRIP_WATER)), ((double)(life9_38)), ((double)(life11_42)), ((double)(life13_46)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


public int c(net.minecraft.block.state.IBlockState p0) {
int forwardValue3488_15_0;
    int forwardValue3488_17_0;
    boolean spill3488_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.ev.R ^ 120959411621401L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3488_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ev.Q))))))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue3488_15_0 = ((spill3488_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill3488_0)) {
        break forward_join_16;
    }
    forwardValue3488_15_0 = 1;
    }
    forwardValue3488_17_0 = forwardValue3488_15_0;
    break forward_join_17;
    }
    forwardValue3488_17_0 = 0;
    }
    return forwardValue3488_17_0;
}


private boolean c(net.minecraft.world.World p0, moom.DT p1) {
java.lang.Object forestValue427_34_0;
    int forestValue427_135_0;
    int forestValue427_137_0;
    int[] spill427_0;
    moom.fn spill427_1;
    int spill427_2;
    long life3_3;
    java.util.LinkedList life6_6;
    int[] life5_7;
    java.util.ArrayList life7_9;
    int life8_20;
    moom.DN life9_27;
    moom.DT life10_31;
    int life11_36;
    moom.bs[] life12_38;
    int life13_41;
    int life14_43;
    moom.bs life15_50;
    moom.DT life16_54;
    java.util.Iterator life9_120;
    moom.DT life10_127;
    forest_join_137: {
    forest_join_136: {
    forest_join_135: {
    forest_join_130: {
    forest_join_112: {
    life3_3 = (moom.ev.R ^ 22294581335433L);
    spill427_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = com.google.common.collect.Lists.newLinkedList();
    life5_7 = spill427_0;
    life7_9 = com.google.common.collect.Lists.newArrayList();
    ((java.util.Queue)(life6_6)).add(((java.lang.Object)(new moom.DN(p1, java.lang.Integer.valueOf(((int)(0)))))));
    life8_20 = 0;
    forest_cycle_21: while (true) {
    forest_join_110: {
    forest_join_101: {
    if (!((!((java.util.Queue)(life6_6)).isEmpty()))) {
        break forest_join_112;
    }
    life9_27 = ((moom.DN)(((java.util.Queue)(life6_6)).poll()));
    life10_31 = ((moom.DT)(((moom.DN)(life9_27)).a()));
    forestValue427_34_0 = ((moom.DN)(life9_27)).b();
    forest_cycle_34: while (true) {
    life11_36 = ((java.lang.Integer)(((java.lang.Integer)(forestValue427_34_0)))).intValue();
    life12_38 = moom.bs.values();
    life13_41 = (life12_38).length;
    life14_43 = 0;
    forest_cycle_44: while (true) {
    forest_join_99: {
    forest_join_98: {
    if (!((life14_43 < life13_41))) {
        break forest_join_101;
    }
    life15_50 = (life12_38)[life14_43];
    life16_54 = ((moom.DT)(life10_31)).a(((moom.bs)(life15_50)));
    if (!((life5_7 != null))) {
        break forest_join_99;
    }
    spill427_1 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life16_54))))).a__ch())).a__fn();
    if (!((life5_7 != null))) {
        forestValue427_34_0 = spill427_1;
        continue forest_cycle_34;
    }
    if (!((spill427_1 == moom.fn.h))) {
        break forest_join_98;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life16_54)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(2)));
    ((java.util.ArrayList)(life7_9)).add(((java.lang.Object)(life16_54)));
    life8_20 += 1;
    if (!((life5_7 != null))) {
        break forest_join_99;
    }
    if (!((life11_36 < __sourceIntrinsic_a9cb278011d1_invokedynamic427_24(21878, (712949837523795411L ^ life3_3))))) {
        break forest_join_98;
    }
    ((java.util.Queue)(life6_6)).add(((java.lang.Object)(new moom.DN(life16_54, java.lang.Integer.valueOf(((int)((life11_36 + 1))))))));
    }
    life14_43 += 1;
    }
    if (!((life5_7 == null))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_cycle_34;
    }
    }
    if (!((life8_20 > __sourceIntrinsic_a9cb278011d1_invokedynamic427_27(12240, (8261433793943324535L ^ life3_3))))) {
        break forest_join_110;
    }
    if (!((life5_7 == null))) {
        break forest_join_112;
    }
    }
    if (!((life5_7 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    }
    life9_120 = ((java.util.ArrayList)(life7_9)).iterator();
    forest_cycle_115: while (true) {
    if (!(((java.util.Iterator)(life9_120)).hasNext())) {
        break forest_join_130;
    }
    life10_127 = ((moom.DT)(((java.util.Iterator)(life9_120)).next()));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(life10_127)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)));
    if (!((life5_7 != null))) {
        break forest_join_136;
    }
    if (!((life5_7 == null))) {
        continue forest_cycle_115;
    }
    break forest_cycle_115;
    }
    }
    spill427_2 = life8_20;
    if (!((life5_7 != null))) {
        forestValue427_135_0 = spill427_2;
        break forest_join_135;
    }
    if (!((spill427_2 > 0))) {
        break forest_join_136;
    }
    forestValue427_135_0 = 1;
    }
    forestValue427_137_0 = forestValue427_135_0;
    break forest_join_137;
    }
    forestValue427_137_0 = 0;
    }
    return ((forestValue427_137_0) != 0);
}


protected void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3491_18_0;
    int forwardValue3491_29_0;
    boolean spill3491_0;
    long life4_3;
    int[] life6_5;
    forward_join_40: {
    forward_join_29: {
    forward_join_18: {
    life4_3 = (moom.ev.R ^ 4256209533343L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3491_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.ev.Q))))))).booleanValue();
    if (!((life6_5 != null))) {
        forwardValue3491_18_0 = ((spill3491_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill3491_0))) {
        break forward_join_40;
    }
    forwardValue3491_18_0 = ((((moom.ev)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3491_29_0 = forwardValue3491_18_0;
        break forward_join_29;
    }
    if (!((forwardValue3491_18_0 != 0))) {
        break forward_join_40;
    }
    forwardValue3491_29_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ev.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3491_29_0);
    ((net.minecraft.world.World)(p0)).b(((int)(__sourceIntrinsic_48609344e626_invokedynamic3491_15(14724, (7285859392182222132L ^ life4_3)))), ((moom.DT)(p1)), ((int)(net.minecraft.block.Block.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.j))))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite1431_1(((moom.ev)(this)).b__String()))));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((moom.ev)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ev.Q});
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 0))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 1))));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1431_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7576_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9cb278011d1_invokedynamic427_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a9cb278011d1_invokedynamic427_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_48609344e626_invokedynamic3491_15(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
