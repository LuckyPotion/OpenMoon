package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockPistonBase extends net.minecraft.block.Block {

public static final moom.fx Q;

public static final moom.fv R;

private final boolean S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

public BlockPistonBase(boolean p0) {
super(moom.fn.H);
    (this).a__Void((((this.M).a__fE()).a__fE(net.minecraft.block.BlockPistonBase.Q, moom.bs.NORTH)).a__fE(net.minecraft.block.BlockPistonBase.R, java.lang.Boolean.FALSE));
    this.S = p0;
    (this).a(net.minecraft.block.BlockPistonBase.i);
    (this).c(0x1.0000000000000p-1f);
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(7953023305570023824L)), ((long)(6605588272736350484L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(192450634469573L)))));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.block.BlockPistonBase.T ^ 102044312984939L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1157_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1157_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1157_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1157_14 = new byte[8];
    (__sourceSpill1157_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1157_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1157_16 = __sourceSpill1157_14;
    ((javax.crypto.Cipher)(__sourceSpill1157_11)).init(((int)(__sourceSpill1157_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1157_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1157_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\034qc#ÂLÈÿ÷$¨\034).Æ\026q¿"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1157_25 = local6_life21;
        int __sourceSpill1157_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1157_25)).substring(((int)(__sourceSpill1157_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1157_30 = local8_life19;
        int __sourceSpill1157_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1157_33 = new byte[8];
        (__sourceSpill1157_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1157_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1157_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1157_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1157_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1157_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1157_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1157_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1157_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1157_34)).doFinal(((byte[])(__sourceSpill1157_33)));
        (__sourceSpill1157_30)[__sourceSpill1157_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[3]));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("extended")))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue4718_24_0;
    moom.fv forwardValue4718_24_1;
    int forwardValue4718_24_2;
    net.minecraft.block.state.IBlockState forwardValue4718_25_0;
    moom.fv forwardValue4718_25_1;
    net.minecraft.block.state.IBlockState forwardValue4718_26_0;
    moom.fv forwardValue4718_26_1;
    int forwardValue4718_26_2;
    net.minecraft.block.state.IBlockState spill4718_0;
    moom.fv spill4718_1;
    int spill4718_2;
    long life2_3;
    int[] life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (net.minecraft.block.BlockPistonBase.T ^ 37127477725636L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4718_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockPistonBase)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockPistonBase.a(((int)(p0))))));
    spill4718_1 = net.minecraft.block.BlockPistonBase.R;
    spill4718_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic4718_7(10868, (3607382503152262766L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue4718_24_0 = spill4718_0;
        forwardValue4718_24_1 = spill4718_1;
        forwardValue4718_24_2 = spill4718_2;
        break forward_join_24;
    }
    if (!((spill4718_2 > 0))) {
        forwardValue4718_25_0 = spill4718_0;
        forwardValue4718_25_1 = spill4718_1;
        break forward_join_25;
    }
    forwardValue4718_24_0 = spill4718_0;
    forwardValue4718_24_1 = spill4718_1;
    forwardValue4718_24_2 = 1;
    }
    forwardValue4718_26_0 = forwardValue4718_24_0;
    forwardValue4718_26_1 = forwardValue4718_24_1;
    forwardValue4718_26_2 = forwardValue4718_24_2;
    break forward_join_26;
    }
    forwardValue4718_26_0 = forwardValue4718_25_0;
    forwardValue4718_26_1 = forwardValue4718_25_1;
    forwardValue4718_26_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue4718_26_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4718_26_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4718_26_2)))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10023_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean b(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
int lexicalValue1468_37_0;
    int lexicalValue1468_49_0;
    int lexicalValue1468_82_0;
    int[] spill1468_0;
    boolean spill1468_1;
    boolean spill1468_2;
    boolean spill1468_3;
    long life4_3;
    moom.bs[] life7_5;
    int life8_9;
    int life9_11;
    int[] life6_12;
    moom.bs life10_19;
    moom.DT life7_67;
    moom.bs[] life8_69;
    int life9_72;
    int life10_74;
    moom.bs life11_81;
    lexical_join_86: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_41: {
    life4_3 = (net.minecraft.block.BlockPistonBase.T ^ 100696333992548L);
    life7_5 = moom.bs.values();
    spill1468_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = (life7_5).length;
    life9_11 = 0;
    life6_12 = spill1468_0;
    lexical_cycle_13: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life9_11 < life8_9))) {
        break lexical_join_41;
    }
    life10_19 = (life7_5)[life9_11];
    if (!((life6_12 != null))) {
        break lexical_join_50;
    }
    if (!((life6_12 != null))) {
        break lexical_join_39;
    }
    if (!((life10_19 != p2))) {
        break lexical_join_38;
    }
    spill1468_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life10_19))))), ((moom.bs)(life10_19)));
    if (!((life6_12 != null))) {
        lexicalValue1468_37_0 = ((spill1468_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!(spill1468_1)) {
        break lexical_join_38;
    }
    lexicalValue1468_37_0 = 1;
    }
    return ((lexicalValue1468_37_0) != 0);
    }
    life9_11 += 1;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    spill1468_2 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p1)), ((moom.bs)(moom.bs.DOWN)));
    if (!((life6_12 != null))) {
        lexicalValue1468_49_0 = ((spill1468_2) ? 1 : 0);
        break lexical_join_49;
    }
    if (!(spill1468_2)) {
        break lexical_join_50;
    }
    lexicalValue1468_49_0 = 1;
    }
    return ((lexicalValue1468_49_0) != 0);
    }
    life7_67 = ((moom.DT)(p1)).a__DT();
    life8_69 = moom.bs.values();
    life9_72 = (life8_69).length;
    life10_74 = 0;
    lexical_cycle_60: while (true) {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_82: {
    if (!((life10_74 < life9_72))) {
        break lexical_join_86;
    }
    life11_81 = (life8_69)[life10_74];
    if (!((life6_12 != null))) {
        break lexical_join_84;
    }
    if (!((life11_81 != moom.bs.DOWN))) {
        break lexical_join_83;
    }
    spill1468_3 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(life7_67)).a(((moom.bs)(life11_81))))), ((moom.bs)(life11_81)));
    if (!((life6_12 != null))) {
        lexicalValue1468_82_0 = ((spill1468_3) ? 1 : 0);
        break lexical_join_82;
    }
    if (!(spill1468_3)) {
        break lexical_join_83;
    }
    lexicalValue1468_82_0 = 1;
    }
    return ((lexicalValue1468_82_0) != 0);
    }
    life10_74 += 1;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    return ((0) != 0);
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue4715_33_0;
    int[] spill4715_0;
    boolean spill4715_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_15;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (net.minecraft.block.BlockPistonBase.T ^ 49960323609294L);
    spill4715_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill4715_0;
    life5_15 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q))))))).a());
    spill4715_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue4715_33_0 = ((spill4715_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill4715_1)) {
        break forward_join_32;
    }
    life5_15 = (life5_15 | __sourceIntrinsic_8db5871551d4_invokedynamic4715_11(3123, (1182590547770983200L ^ life2_3)));
    }
    forwardValue4715_33_0 = life5_15;
    }
    return forwardValue4715_33_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24535;
      if (V[var3] == null) {
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
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dX", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockPistonBase.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue4717_12_0;
    net.minecraft.world.World spill4717_0;
    long life4_3;
    int[] life6_5;
    forward_join_20: {
    forward_join_12: {
    life4_3 = (net.minecraft.block.BlockPistonBase.T ^ 3469581333714L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4717_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue4717_12_0 = spill4717_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill4717_0)).G))) {
        break forward_join_20;
    }
    forwardValue4717_12_0 = p0;
    }
    if (!((((net.minecraft.world.World)(forwardValue4717_12_0)).a__B9(((moom.DT)(p1))) == null))) {
        break forward_join_20;
    }
    ((net.minecraft.block.BlockPistonBase)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4719_48_0;
    int forwardValue4719_56_0;
    int forwardValue4719_67_0;
    int[] spill4719_0;
    int spill4719_1;
    boolean spill4719_2;
    long life4_3;
    moom.bs life7_9;
    int[] life6_10;
    int life8_16;
    forward_join_75: {
    forward_join_67: {
    forward_join_56: {
    forward_join_48: {
    forward_join_47: {
    life4_3 = (net.minecraft.block.BlockPistonBase.T ^ 7785386017000L);
    spill4719_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)))));
    life6_10 = spill4719_0;
    life8_16 = ((((net.minecraft.block.BlockPistonBase)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life7_9)))) ? 1 : 0);
    spill4719_1 = life8_16;
    if (!((life6_10 != null))) {
        forwardValue4719_48_0 = spill4719_1;
        break forward_join_48;
    }
    if (!((spill4719_1 != 0))) {
        break forward_join_47;
    }
    spill4719_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R))))))).booleanValue();
    if (!((life6_10 != null))) {
        forwardValue4719_48_0 = ((spill4719_2) ? 1 : 0);
        break forward_join_48;
    }
    if (!((!spill4719_2))) {
        break forward_join_47;
    }
    if (!(((moom.fz)(new moom.fz(p0, p1, life7_9, true))).a__Boolean())) {
        break forward_join_75;
    }
    ((net.minecraft.world.World)(p0)).c(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(0)), ((int)(((moom.bs)(life7_9)).a())));
    if (!((life6_10 == null))) {
        break forward_join_75;
    }
    }
    forwardValue4719_48_0 = life8_16;
    }
    if (!((life6_10 != null))) {
        forwardValue4719_56_0 = forwardValue4719_48_0;
        break forward_join_56;
    }
    if (!((forwardValue4719_48_0 == 0))) {
        break forward_join_75;
    }
    forwardValue4719_56_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life6_10 != null))) {
        forwardValue4719_67_0 = forwardValue4719_56_0;
        break forward_join_67;
    }
    if (!((forwardValue4719_56_0 != 0))) {
        break forward_join_75;
    }
    forwardValue4719_67_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4719_67_0);
    ((net.minecraft.world.World)(p0)).c(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(1)), ((int)(((moom.bs)(life7_9)).a())));
    }
    return;
}


private boolean a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, boolean p3) {
int lexicalValue1467_15_0;
    int lexicalValue1467_42_0;
    moom.bs lexicalValue1467_52_0;
    moom.DT lexicalValue1467_154_0;
    net.minecraft.block.BlockPistonExtension$EnumPistonType lexicalValue1467_165_0;
    net.minecraft.block.state.IBlockState lexicalValue1467_186_0;
    moom.fw lexicalValue1467_186_1;
    net.minecraft.block.state.IBlockState lexicalValue1467_187_0;
    moom.fw lexicalValue1467_187_1;
    net.minecraft.block.BlockPistonExtension$EnumPistonType lexicalValue1467_187_2;
    int lexicalValue1467_207_0;
    int lexicalValue1467_260_0;
    boolean spill1467_0;
    boolean spill1467_1;
    moom.DT spill1467_2;
    boolean spill1467_3;
    net.minecraft.block.state.IBlockState spill1467_4;
    moom.fw spill1467_5;
    boolean spill1467_6;
    long life5_3;
    int[] life7_5;
    moom.fz life8_29;
    java.util.List life9_32;
    java.util.List life10_35;
    int life11_53;
    net.minecraft.block.Block[] life12_56;
    moom.bs life13_65;
    int life14_70;
    moom.DT life15_77;
    net.minecraft.block.Block life16_82;
    moom.DT life15_119;
    net.minecraft.block.state.IBlockState life16_123;
    net.minecraft.block.Block life17_126;
    moom.DT life15_140;
    moom.DT life14_170;
    net.minecraft.block.BlockPistonExtension$EnumPistonType life15_189;
    net.minecraft.block.state.IBlockState life16_198;
    net.minecraft.block.state.IBlockState life17_214;
    int life15_233;
    lexical_join_260: {
    lexical_join_259: {
    lexical_join_247: {
    lexical_join_230: {
    lexical_join_225: {
    lexical_join_207: {
    lexical_join_203: {
    lexical_join_187: {
    lexical_join_186: {
    lexical_join_165: {
    lexical_join_164: {
    lexical_join_154: {
    lexical_join_151: {
    lexical_join_97: {
    lexical_join_92: {
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_42: {
    lexical_join_37: {
    lexical_join_16: {
    lexical_join_15: {
    life5_3 = (net.minecraft.block.BlockPistonBase.T ^ 70056630721656L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1467_0 = p3;
    if (!((life7_5 != null))) {
        lexicalValue1467_15_0 = ((spill1467_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!((!spill1467_0))) {
        break lexical_join_16;
    }
    lexicalValue1467_15_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(p2))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1467_15_0);
    }
    life8_29 = new moom.fz(p0, p1, p2, p3);
    life9_32 = ((moom.fz)(life8_29)).a();
    life10_35 = ((moom.fz)(life8_29)).b();
    spill1467_1 = ((moom.fz)(life8_29)).a__Boolean();
    if (!((life7_5 != null))) {
        lexicalValue1467_42_0 = ((spill1467_1) ? 1 : 0);
        break lexical_join_42;
    }
    if (!((!spill1467_1))) {
        break lexical_join_37;
    }
    return ((0) != 0);
    }
    lexicalValue1467_42_0 = (((java.util.List)(life9_32)).size() + ((java.util.List)(life10_35)).size());
    }
    life11_53 = lexicalValue1467_42_0;
    life12_56 = new net.minecraft.block.Block[life11_53];
    if (!(p3)) {
        break lexical_join_50;
    }
    lexicalValue1467_52_0 = p2;
    break lexical_join_52;
    }
    lexicalValue1467_52_0 = ((moom.bs)(p2)).a__bs();
    }
    life13_65 = lexicalValue1467_52_0;
    life14_70 = (((java.util.List)(life10_35)).size() - 1);
    lexical_cycle_58: while (true) {
    if (!((life14_70 >= 0))) {
        break lexical_join_92;
    }
    life15_77 = ((moom.DT)(((java.util.List)(life10_35)).get(((int)(life14_70)))));
    life16_82 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life15_77))))).a__ch();
    ((net.minecraft.block.Block)(life16_82)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life15_77)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life15_77))))), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life15_77)));
    life11_53 += -1;
    (life12_56)[life11_53] = life16_82;
    life14_70 += -1;
    if (!((life7_5 != null))) {
        break lexical_join_97;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_58; }
    break lexical_cycle_58;
    }
    }
    life14_70 = (((java.util.List)(life9_32)).size() - 1);
    }
    lexical_cycle_97: while (true) {
    if (!((life14_70 >= 0))) {
        break lexical_join_151;
    }
    life15_119 = ((moom.DT)(((java.util.List)(life9_32)).get(((int)(life14_70)))));
    life16_123 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life15_119)));
    life17_126 = ((net.minecraft.block.state.IBlockState)(life16_123)).a__ch();
    ((net.minecraft.block.Block)(life17_126)).b(((net.minecraft.block.state.IBlockState)(life16_123)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life15_119)));
    spill1467_2 = ((moom.DT)(life15_119)).a(((moom.bs)(life13_65)));
    if (!((life7_5 != null))) {
        lexicalValue1467_154_0 = spill1467_2;
        break lexical_join_154;
    }
    life15_140 = spill1467_2;
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life15_140)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dc)(net.minecraft.init.Blocks.M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)), ((java.lang.Comparable)(p2))))), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life15_140)), ((net.minecraft.tileentity.TileEntity)(moom.dc.a(((net.minecraft.block.state.IBlockState)(life16_123)), ((moom.bs)(p2)), ((boolean)(p3)), ((boolean)(false))))));
    life11_53 += -1;
    (life12_56)[life11_53] = life17_126;
    life14_70 += -1;
    if (!((life7_5 == null))) { continue lexical_cycle_97; }
    break lexical_cycle_97;
    }
    }
    lexicalValue1467_154_0 = ((moom.DT)(p1)).a(((moom.bs)(p2)));
    }
    life14_170 = lexicalValue1467_154_0;
    spill1467_3 = p3;
    if (!((life7_5 != null))) {
        lexicalValue1467_207_0 = ((spill1467_3) ? 1 : 0);
        break lexical_join_207;
    }
    if (!(spill1467_3)) {
        break lexical_join_203;
    }
    if (!(this.S)) {
        break lexical_join_164;
    }
    lexicalValue1467_165_0 = net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY;
    break lexical_join_165;
    }
    lexicalValue1467_165_0 = net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT;
    }
    life15_189 = lexicalValue1467_165_0;
    life16_198 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dY)(net.minecraft.init.Blocks.K)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dY.Q)), ((java.lang.Comparable)(p2))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dY.R)), ((java.lang.Comparable)(life15_189)));
    spill1467_4 = ((net.minecraft.block.state.IBlockState)(((moom.dc)(net.minecraft.init.Blocks.M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dc.R)), ((java.lang.Comparable)(p2)));
    spill1467_5 = moom.dc.S;
    if (!(this.S)) {
        lexicalValue1467_186_0 = spill1467_4;
        lexicalValue1467_186_1 = spill1467_5;
        break lexical_join_186;
    }
    lexicalValue1467_187_0 = spill1467_4;
    lexicalValue1467_187_1 = spill1467_5;
    lexicalValue1467_187_2 = net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY;
    break lexical_join_187;
    }
    lexicalValue1467_187_0 = lexicalValue1467_186_0;
    lexicalValue1467_187_1 = lexicalValue1467_186_1;
    lexicalValue1467_187_2 = net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT;
    }
    life17_214 = ((net.minecraft.block.state.IBlockState)(lexicalValue1467_187_0)).a__fE(((net.minecraft.block.properties.IProperty)(lexicalValue1467_187_1)), ((java.lang.Comparable)(lexicalValue1467_187_2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life14_170)), ((net.minecraft.block.state.IBlockState)(life17_214)), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life14_170)), ((net.minecraft.tileentity.TileEntity)(moom.dc.a(((net.minecraft.block.state.IBlockState)(life16_198)), ((moom.bs)(p2)), ((boolean)(true)), ((boolean)(false))))));
    }
    lexicalValue1467_207_0 = (((java.util.List)(life10_35)).size() - 1);
    }
    life15_233 = lexicalValue1467_207_0;
    lexical_cycle_208: while (true) {
    if (!((life15_233 >= 0))) {
        break lexical_join_225;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(((java.util.List)(life10_35)).get(((int)(life15_233))))))), ((net.minecraft.block.Block)((life12_56)[(life11_53++)])));
    life15_233 += -1;
    if (!((life7_5 != null))) {
        break lexical_join_230;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_208; }
    break lexical_cycle_208;
    }
    }
    life15_233 = (((java.util.List)(life9_32)).size() - 1);
    }
    lexical_cycle_230: while (true) {
    if (!((life15_233 >= 0))) {
        break lexical_join_247;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(((java.util.List)(life9_32)).get(((int)(life15_233))))))), ((net.minecraft.block.Block)((life12_56)[(life11_53++)])));
    life15_233 += -1;
    if (!((life7_5 != null))) {
        break lexical_join_259;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_230; }
    break lexical_cycle_230;
    }
    }
    spill1467_6 = p3;
    if (!((life7_5 != null))) {
        lexicalValue1467_260_0 = ((spill1467_6) ? 1 : 0);
        break lexical_join_260;
    }
    if (!(spill1467_6)) {
        break lexical_join_259;
    }
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(life14_170)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.K)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    }
    lexicalValue1467_260_0 = 1;
    }
    return ((lexicalValue1467_260_0) != 0);
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockPistonBase)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockPistonBase.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.EntityLivingBase)(p7)))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
}


public net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockPistonBase)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)), ((java.lang.Comparable)(moom.bs.UP)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
long local5 = (net.minecraft.block.BlockPistonBase.T ^ 28869109389202L);
    if ((((((net.minecraft.world.World)(p0)).G) ? 1 : 0) == 0)) {
        ((net.minecraft.block.BlockPistonBase)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockPistonBase.Q, net.minecraft.block.BlockPistonBase.R});
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
long local6 = (net.minecraft.block.BlockPistonBase.T ^ 129695769847639L);
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockPistonBase.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.EntityLivingBase)(p3)))))))), ((int)(2)));
    if ((((((net.minecraft.world.World)(p0)).G) ? 1 : 0) == 0)) {
        ((net.minecraft.block.BlockPistonBase)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    return;
}


public void a__Void() {
((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.block.state.IBlockState forwardValue437_17_0;
    int[] spill437_0;
    net.minecraft.block.state.IBlockState spill437_1;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    float life7_29;
    moom.bs life8_34;
    forward_join_104: {
    forward_join_96: {
    forward_join_94: {
    forward_join_86: {
    forward_join_76: {
    forward_join_66: {
    forward_join_56: {
    forward_join_46: {
    forward_join_36: {
    forward_join_17: {
    life3_3 = (net.minecraft.block.BlockPistonBase.T ^ 45425196728651L);
    spill437_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill437_0;
    spill437_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue437_17_0 = spill437_1;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill437_1)).a__ch() == this))) {
        break forward_join_96;
    }
    forwardValue437_17_0 = life6_8;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(forwardValue437_17_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R))))))).booleanValue())) {
        break forward_join_96;
    }
    life7_29 = 0x1.0p-2f;
    life8_34 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)))));
    if (!((life8_34 != null))) {
        break forward_join_94;
    }
    switch ((moom.e2.a)[((moom.bs)(life8_34)).ordinal()]) {
case 1:
{
        break forward_join_36;
    }
case 2:
{
        break forward_join_46;
    }
case 3:
{
        break forward_join_56;
    }
case 4:
{
        break forward_join_66;
    }
case 5:
{
        break forward_join_76;
    }
case 6:
{
        break forward_join_86;
    }
default:
{
        break forward_join_94;
    }
}
    }
    ((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.0p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life5_9 == null))) {
        break forward_join_94;
    }
    }
    ((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.8p-1f)), ((float)(0x1.0p0f)));
    if (!((life5_9 == null))) {
        break forward_join_94;
    }
    }
    ((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-2f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life5_9 == null))) {
        break forward_join_94;
    }
    }
    ((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.8p-1f)));
    if (!((life5_9 == null))) {
        break forward_join_94;
    }
    }
    ((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x1.0p-2f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life5_9 == null))) {
        break forward_join_94;
    }
    }
    ((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    if (!((life5_9 == null))) {
        break forward_join_104;
    }
    }
    ((net.minecraft.block.BlockPistonBase)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3, int p4) {
int forwardValue4712_43_0;
    int forwardValue4712_53_0;
    int forwardValue4712_75_0;
    int forwardValue4712_105_0;
    net.minecraft.tileentity.TileEntity forwardValue4712_121_0;
    net.minecraft.world.World forwardValue4712_136_0;
    moom.DT forwardValue4712_136_1;
    net.minecraft.block.state.IBlockState forwardValue4712_136_2;
    moom.fw forwardValue4712_136_3;
    net.minecraft.world.World forwardValue4712_137_0;
    moom.DT forwardValue4712_137_1;
    net.minecraft.block.state.IBlockState forwardValue4712_137_2;
    moom.fw forwardValue4712_137_3;
    net.minecraft.block.BlockPistonExtension$EnumPistonType forwardValue4712_137_4;
    net.minecraft.tileentity.TileEntityPiston forwardValue4712_200_0;
    int forwardValue4712_209_0;
    net.minecraft.block.Block forwardValue4712_217_0;
    int forwardValue4712_228_0;
    net.minecraft.block.Block forwardValue4712_238_0;
    net.minecraft.block.BlockPistonBase forwardValue4712_238_1;
    int forwardValue4712_245_0;
    int forwardValue4712_253_0;
    int forwardValue4712_281_0;
    int[] spill4712_0;
    boolean spill4712_1;
    int spill4712_2;
    int spill4712_3;
    int spill4712_4;
    boolean spill4712_5;
    net.minecraft.tileentity.TileEntity spill4712_6;
    net.minecraft.world.World spill4712_7;
    moom.DT spill4712_8;
    net.minecraft.block.state.IBlockState spill4712_9;
    moom.fw spill4712_10;
    boolean spill4712_11;
    int spill4712_12;
    net.minecraft.tileentity.TileEntityPiston spill4712_13;
    boolean spill4712_14;
    net.minecraft.block.Block spill4712_15;
    boolean spill4712_16;
    net.minecraft.block.Block spill4712_17;
    net.minecraft.block.BlockPistonBase spill4712_18;
    long life6_3;
    moom.bs life9_9;
    int[] life8_10;
    int life10_24;
    net.minecraft.tileentity.TileEntity life10_156;
    moom.DT life11_223;
    net.minecraft.block.Block life12_228;
    int life13_230;
    net.minecraft.tileentity.TileEntity life14_237;
    net.minecraft.tileentity.TileEntityPiston life15_248;
    forward_join_281: {
    forward_join_280: {
    forward_join_254: {
    forward_join_253: {
    forward_join_248: {
    forward_join_246: {
    forward_join_245: {
    forward_join_239: {
    forward_join_238: {
    forward_join_228: {
    forward_join_217: {
    forward_join_209: {
    forward_join_208: {
    forward_join_200: {
    forward_join_137: {
    forward_join_136: {
    forward_join_123: {
    forward_join_121: {
    forward_join_105: {
    forward_join_104: {
    forward_join_75: {
    forward_join_67: {
    forward_join_53: {
    forward_join_52: {
    forward_join_43: {
    forward_join_42: {
    life6_3 = (net.minecraft.block.BlockPistonBase.T ^ 15014872711963L);
    spill4712_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.Q)))));
    life8_10 = spill4712_0;
    spill4712_1 = ((net.minecraft.world.World)(p0)).G;
    if (!((life8_10 != null))) {
        forwardValue4712_53_0 = ((spill4712_1) ? 1 : 0);
        break forward_join_53;
    }
    if (!((!spill4712_1))) {
        break forward_join_52;
    }
    life10_24 = ((((net.minecraft.block.BlockPistonBase)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life9_9)))) ? 1 : 0);
    spill4712_2 = life10_24;
    if (!((life8_10 != null))) {
        forwardValue4712_43_0 = spill4712_2;
        break forward_join_43;
    }
    if (!((spill4712_2 != 0))) {
        break forward_join_42;
    }
    spill4712_3 = p3;
    if (!((life8_10 != null))) {
        forwardValue4712_43_0 = spill4712_3;
        break forward_join_43;
    }
    if (!((spill4712_3 == 1))) {
        break forward_join_42;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    return ((0) != 0);
    }
    forwardValue4712_43_0 = life10_24;
    }
    if (!((life8_10 != null))) {
        forwardValue4712_53_0 = forwardValue4712_43_0;
        break forward_join_53;
    }
    if (!((forwardValue4712_43_0 == 0))) {
        break forward_join_52;
    }
    spill4712_4 = p3;
    if (!((life8_10 != null))) {
        forwardValue4712_53_0 = spill4712_4;
        break forward_join_53;
    }
    if (!((spill4712_4 == 0))) {
        break forward_join_52;
    }
    return ((0) != 0);
    }
    forwardValue4712_53_0 = p3;
    }
    if (!((life8_10 != null))) {
        forwardValue4712_105_0 = forwardValue4712_53_0;
        break forward_join_105;
    }
    if (!((forwardValue4712_53_0 == 0))) {
        break forward_join_104;
    }
    spill4712_5 = ((net.minecraft.block.BlockPistonBase)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life9_9)), ((boolean)(true)));
    if (!((life8_10 != null))) {
        forwardValue4712_75_0 = ((spill4712_5) ? 1 : 0);
        break forward_join_75;
    }
    if (!((!spill4712_5))) {
        break forward_join_67;
    }
    return ((0) != 0);
    }
    forwardValue4712_75_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4712_75_0);
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("tile.piston.out")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * 0x1.0p-2f) + 0x1.333334p-1f))));
    if (!((life8_10 == null))) {
        break forward_join_280;
    }
    }
    forwardValue4712_105_0 = p3;
    }
    if (!((life8_10 != null))) {
        forwardValue4712_281_0 = forwardValue4712_105_0;
        break forward_join_281;
    }
    if (!((forwardValue4712_105_0 == 1))) {
        break forward_join_280;
    }
    life10_156 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_9))))));
    spill4712_6 = life10_156;
    if (!((life8_10 != null))) {
        forwardValue4712_121_0 = spill4712_6;
        break forward_join_121;
    }
    if (!((((spill4712_6 instanceof net.minecraft.tileentity.TileEntityPiston) ? 1 : 0) != 0))) {
        break forward_join_123;
    }
    forwardValue4712_121_0 = life10_156;
    }
    ((net.minecraft.tileentity.TileEntityPiston)(((net.minecraft.tileentity.TileEntityPiston)(forwardValue4712_121_0)))).b();
    }
    spill4712_7 = p0;
    spill4712_8 = p1;
    spill4712_9 = ((net.minecraft.block.state.IBlockState)(((moom.dc)(net.minecraft.init.Blocks.M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dc.R)), ((java.lang.Comparable)(life9_9)));
    spill4712_10 = moom.dc.S;
    if (!(this.S)) {
        forwardValue4712_136_0 = spill4712_7;
        forwardValue4712_136_1 = spill4712_8;
        forwardValue4712_136_2 = spill4712_9;
        forwardValue4712_136_3 = spill4712_10;
        break forward_join_136;
    }
    forwardValue4712_137_0 = spill4712_7;
    forwardValue4712_137_1 = spill4712_8;
    forwardValue4712_137_2 = spill4712_9;
    forwardValue4712_137_3 = spill4712_10;
    forwardValue4712_137_4 = net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY;
    break forward_join_137;
    }
    forwardValue4712_137_0 = forwardValue4712_136_0;
    forwardValue4712_137_1 = forwardValue4712_136_1;
    forwardValue4712_137_2 = forwardValue4712_136_2;
    forwardValue4712_137_3 = forwardValue4712_136_3;
    forwardValue4712_137_4 = net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT;
    }
    ((net.minecraft.world.World)(forwardValue4712_137_0)).a(((moom.DT)(forwardValue4712_137_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forwardValue4712_137_2)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4712_137_3)), ((java.lang.Comparable)(forwardValue4712_137_4))))), ((int)(3)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.tileentity.TileEntity)(moom.dc.a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockPistonBase)(this)).b__fE(((int)(p4))))), ((moom.bs)(life9_9)), ((boolean)(false)), ((boolean)(true))))));
    spill4712_11 = this.S;
    if (!((life8_10 != null))) {
        forwardValue4712_253_0 = ((spill4712_11) ? 1 : 0);
        break forward_join_253;
    }
    if (!(spill4712_11)) {
        break forward_join_248;
    }
    life11_223 = ((moom.DT)(p1)).a(((int)((((moom.bs)(life9_9)).c() * 2))), ((int)((((moom.bs)(life9_9)).d() * 2))), ((int)((((moom.bs)(life9_9)).e() * 2))));
    life12_228 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life11_223))))).a__ch();
    life13_230 = 0;
    if (!((life12_228 == net.minecraft.init.Blocks.M))) {
        break forward_join_208;
    }
    life14_237 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life11_223)));
    spill4712_12 = ((life14_237 instanceof net.minecraft.tileentity.TileEntityPiston) ? 1 : 0);
    if (!((life8_10 != null))) {
        forwardValue4712_209_0 = spill4712_12;
        break forward_join_209;
    }
    if (!((spill4712_12 != 0))) {
        break forward_join_208;
    }
    life15_248 = ((net.minecraft.tileentity.TileEntityPiston)(life14_237));
    spill4712_13 = life15_248;
    if (!((life8_10 != null))) {
        forwardValue4712_200_0 = spill4712_13;
        break forward_join_200;
    }
    if (!((((net.minecraft.tileentity.TileEntityPiston)(spill4712_13)).a__sourceReturn_7c12d77acb() == life9_9))) {
        break forward_join_208;
    }
    forwardValue4712_200_0 = life15_248;
    }
    spill4712_14 = ((net.minecraft.tileentity.TileEntityPiston)(forwardValue4712_200_0)).b__Boolean();
    if (!((life8_10 != null))) {
        forwardValue4712_209_0 = ((spill4712_14) ? 1 : 0);
        break forward_join_209;
    }
    if (!(spill4712_14)) {
        break forward_join_208;
    }
    ((net.minecraft.tileentity.TileEntityPiston)(life15_248)).b();
    life13_230 = 1;
    }
    forwardValue4712_209_0 = life13_230;
    }
    if (!((forwardValue4712_209_0 == 0))) {
        break forward_join_246;
    }
    spill4712_15 = life12_228;
    if (!((life8_10 != null))) {
        forwardValue4712_217_0 = spill4712_15;
        break forward_join_217;
    }
    if (!((((net.minecraft.block.Block)(spill4712_15)).a__fn() != moom.fn.a))) {
        break forward_join_246;
    }
    forwardValue4712_217_0 = life12_228;
    }
    spill4712_16 = net.minecraft.block.BlockPistonBase.a(((net.minecraft.block.Block)(forwardValue4712_217_0)), ((net.minecraft.world.World)(p0)), ((moom.DT)(life11_223)), ((moom.bs)(((moom.bs)(life9_9)).a__bs())), ((boolean)(false)));
    if (!((life8_10 != null))) {
        forwardValue4712_228_0 = ((spill4712_16) ? 1 : 0);
        break forward_join_228;
    }
    if (!(spill4712_16)) {
        break forward_join_246;
    }
    forwardValue4712_228_0 = ((net.minecraft.block.Block)(life12_228)).e__Int();
    }
    if (!((life8_10 != null))) {
        forwardValue4712_245_0 = forwardValue4712_228_0;
        break forward_join_245;
    }
    if (!((forwardValue4712_228_0 != 0))) {
        break forward_join_239;
    }
    spill4712_17 = life12_228;
    spill4712_18 = net.minecraft.init.Blocks.J;
    if (!((life8_10 != null))) {
        forwardValue4712_238_0 = spill4712_17;
        forwardValue4712_238_1 = spill4712_18;
        break forward_join_238;
    }
    if (!((spill4712_17 != spill4712_18))) {
        break forward_join_239;
    }
    forwardValue4712_238_0 = life12_228;
    forwardValue4712_238_1 = net.minecraft.init.Blocks.F;
    }
    if (!((forwardValue4712_238_0 == forwardValue4712_238_1))) {
        break forward_join_246;
    }
    }
    forwardValue4712_245_0 = ((((net.minecraft.block.BlockPistonBase)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(life9_9)), ((boolean)(false)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4712_245_0);
    }
    if (!((life8_10 == null))) {
        break forward_join_254;
    }
    }
    forwardValue4712_253_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_9))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4712_253_0);
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("tile.piston.in")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * 0x1.333334p-3f) + 0x1.333334p-1f))));
    }
    forwardValue4712_281_0 = 1;
    }
    return ((forwardValue4712_281_0) != 0);
}


public static boolean a(net.minecraft.block.Block p0, net.minecraft.world.World p1, moom.DT p2, moom.bs p3, boolean p4) {
int forwardValue4710_22_0;
    net.minecraft.block.Block forwardValue4710_63_0;
    net.minecraft.block.BlockPistonBase forwardValue4710_63_1;
    net.minecraft.block.Block forwardValue4710_65_0;
    int forwardValue4710_77_0;
    int forwardValue4710_88_0;
    int forwardValue4710_88_1;
    int forwardValue4710_105_0;
    int forwardValue4710_109_0;
    int forwardValue4710_111_0;
    int forwardValue4710_113_0;
    int forwardValue4710_115_0;
    boolean spill4710_0;
    int spill4710_1;
    int spill4710_2;
    int spill4710_3;
    net.minecraft.block.Block spill4710_4;
    net.minecraft.block.BlockPistonBase spill4710_5;
    net.minecraft.block.Block spill4710_6;
    int spill4710_7;
    int spill4710_8;
    int spill4710_9;
    boolean spill4710_10;
    long life5_3;
    int[] life7_5;
    forward_join_115: {
    forward_join_114: {
    forward_join_113: {
    forward_join_112: {
    forward_join_111: {
    forward_join_110: {
    forward_join_109: {
    forward_join_105: {
    forward_join_103: {
    forward_join_91: {
    forward_join_88: {
    forward_join_83: {
    forward_join_77: {
    forward_join_75: {
    forward_join_65: {
    forward_join_63: {
    forward_join_54: {
    forward_join_33: {
    forward_join_22: {
    forward_join_20: {
    forward_join_11: {
    life5_3 = (net.minecraft.block.BlockPistonBase.T ^ 84517517085475L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p0 == net.minecraft.init.Blocks.Z))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    spill4710_0 = ((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.World)(p1)).a__Fi())).a(((moom.DT)(p2)));
    if (!((life7_5 != null))) {
        forwardValue4710_22_0 = ((spill4710_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4710_0))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue4710_22_0 = ((moom.DT)(p2)).b();
    }
    if (!((life7_5 != null))) {
        forwardValue4710_115_0 = forwardValue4710_22_0;
        break forward_join_115;
    }
    if (!((forwardValue4710_22_0 >= 0))) {
        break forward_join_114;
    }
    if (!((p3 == moom.bs.DOWN))) {
        break forward_join_33;
    }
    spill4710_1 = ((moom.DT)(p2)).b();
    if (!((life7_5 != null))) {
        forwardValue4710_115_0 = spill4710_1;
        break forward_join_115;
    }
    if (!((spill4710_1 != 0))) {
        break forward_join_114;
    }
    }
    spill4710_2 = ((moom.DT)(p2)).b();
    if (!((life7_5 != null))) {
        forwardValue4710_113_0 = spill4710_2;
        break forward_join_113;
    }
    if (!((spill4710_2 <= (((net.minecraft.world.World)(p1)).d() - 1)))) {
        break forward_join_112;
    }
    if (!((p3 == moom.bs.UP))) {
        break forward_join_54;
    }
    spill4710_3 = ((moom.DT)(p2)).b();
    if (!((life7_5 != null))) {
        forwardValue4710_113_0 = spill4710_3;
        break forward_join_113;
    }
    if (!((spill4710_3 != (((net.minecraft.world.World)(p1)).d() - 1)))) {
        break forward_join_112;
    }
    }
    spill4710_4 = p0;
    spill4710_5 = net.minecraft.init.Blocks.J;
    if (!((life7_5 != null))) {
        forwardValue4710_63_0 = spill4710_4;
        forwardValue4710_63_1 = spill4710_5;
        break forward_join_63;
    }
    if (!((spill4710_4 != spill4710_5))) {
        break forward_join_91;
    }
    spill4710_6 = p0;
    if (!((life7_5 != null))) {
        forwardValue4710_65_0 = spill4710_6;
        break forward_join_65;
    }
    forwardValue4710_63_0 = spill4710_6;
    forwardValue4710_63_1 = net.minecraft.init.Blocks.F;
    }
    if (!((forwardValue4710_63_0 != forwardValue4710_63_1))) {
        break forward_join_91;
    }
    forwardValue4710_65_0 = p0;
    }
    spill4710_7 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.block.Block)(forwardValue4710_65_0)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p2))))), ((float)(-0x1.0p0f)));
    if (!((life7_5 != null))) {
        forwardValue4710_77_0 = spill4710_7;
        break forward_join_77;
    }
    if (!((spill4710_7 == 0))) {
        break forward_join_75;
    }
    return ((0) != 0);
    }
    forwardValue4710_77_0 = ((net.minecraft.block.Block)(p0)).e__Int();
    }
    spill4710_8 = 2;
    if (!((life7_5 != null))) {
        forwardValue4710_88_0 = forwardValue4710_77_0;
        forwardValue4710_88_1 = spill4710_8;
        break forward_join_88;
    }
    if (!((forwardValue4710_77_0 == spill4710_8))) {
        break forward_join_83;
    }
    return ((0) != 0);
    }
    spill4710_9 = ((net.minecraft.block.Block)(p0)).e__Int();
    if (!((life7_5 != null))) {
        forwardValue4710_105_0 = spill4710_9;
        break forward_join_105;
    }
    forwardValue4710_88_0 = spill4710_9;
    forwardValue4710_88_1 = 1;
    }
    if (!((forwardValue4710_88_0 == forwardValue4710_88_1))) {
        break forward_join_103;
    }
    return p4;
    }
    spill4710_10 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(p2))))).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockPistonBase.R))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue4710_105_0 = ((spill4710_10) ? 1 : 0);
        break forward_join_105;
    }
    if (!(spill4710_10)) {
        break forward_join_103;
    }
    return ((0) != 0);
    }
    forwardValue4710_105_0 = ((p0 instanceof net.minecraft.block.ITileEntityProvider) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue4710_109_0 = forwardValue4710_105_0;
        break forward_join_109;
    }
    if (!((forwardValue4710_105_0 == 0))) {
        break forward_join_110;
    }
    forwardValue4710_109_0 = 1;
    }
    forwardValue4710_111_0 = forwardValue4710_109_0;
    break forward_join_111;
    }
    forwardValue4710_111_0 = 0;
    }
    return ((forwardValue4710_111_0) != 0);
    }
    forwardValue4710_113_0 = 0;
    }
    return ((forwardValue4710_113_0) != 0);
    }
    forwardValue4710_115_0 = 0;
    }
    return ((forwardValue4710_115_0) != 0);
}


public static moom.bs a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.EntityLivingBase p2) {
int forwardValue4713_58_0;
    net.minecraft.entity.EntityLivingBase forwardValue4713_62_0;
    net.minecraft.entity.EntityLivingBase spill4713_0;
    net.minecraft.entity.EntityLivingBase spill4713_1;
    int spill4713_2;
    long life3_3;
    int[] life5_5;
    double life6_47;
    forward_join_62: {
    forward_join_61: {
    forward_join_58: {
    forward_join_51: {
    life3_3 = (net.minecraft.block.BlockPistonBase.T ^ 40225991148128L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4713_0 = p2;
    if (!((life5_5 != null))) {
        forwardValue4713_62_0 = spill4713_0;
        break forward_join_62;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(moom.Dr.d(((float)((((float) ((net.minecraft.entity.EntityLivingBase)(spill4713_0)).n) - ((float) ((moom.DT)(p1)).a()))))))), ((float)(0x1.0p1f))) < 0))) {
        break forward_join_61;
    }
    spill4713_1 = p2;
    if (!((life5_5 != null))) {
        forwardValue4713_62_0 = spill4713_1;
        break forward_join_62;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(moom.Dr.d(((float)((((float) ((net.minecraft.entity.EntityLivingBase)(spill4713_1)).p) - ((float) ((moom.DT)(p1)).c()))))))), ((float)(0x1.0p1f))) < 0))) {
        break forward_join_61;
    }
    life6_47 = (((net.minecraft.entity.EntityLivingBase)(p2)).o + ((double) ((net.minecraft.entity.EntityLivingBase)(p2)).e__Float()));
    spill4713_2 = recovery.source.CarrierOps.dcmpl(((double)((life6_47 - ((double) ((moom.DT)(p1)).b())))), ((double)(0x1.0p1d)));
    if (!((life5_5 != null))) {
        forwardValue4713_58_0 = spill4713_2;
        break forward_join_58;
    }
    if (!((spill4713_2 > 0))) {
        break forward_join_51;
    }
    return moom.bs.UP;
    }
    forwardValue4713_58_0 = recovery.source.CarrierOps.dcmpl(((double)((((double) ((moom.DT)(p1)).b()) - life6_47))), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue4713_58_0 > 0))) {
        break forward_join_61;
    }
    return moom.bs.DOWN;
    }
    forwardValue4713_62_0 = p2;
    }
    return ((moom.bs)(((net.minecraft.entity.EntityLivingBase)(forwardValue4713_62_0)).b__bs())).a__bs();
}


public static moom.bs a__sourceReturn_5c5084b5c8(int p0) {
int forwardValue4709_22_0;
    moom.bs forwardValue4709_23_0;
    int[] spill4709_0;
    int spill4709_1;
    long life1_3;
    int life4_12;
    int[] life3_13;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (net.minecraft.block.BlockPistonBase.T ^ 43791764613304L);
    spill4709_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_12 = (p0 & __sourceIntrinsic_4059fcd1c032_invokedynamic4709_2(5942, (2507945620726301265L ^ life1_3)));
    life3_13 = spill4709_0;
    spill4709_1 = life4_12;
    if (!((life3_13 != null))) {
        forwardValue4709_22_0 = spill4709_1;
        break forward_join_22;
    }
    if (!((spill4709_1 > 5))) {
        break forward_join_21;
    }
    forwardValue4709_23_0 = null;
    break forward_join_23;
    }
    forwardValue4709_22_0 = life4_12;
    }
    forwardValue4709_23_0 = moom.bs.a(((int)(forwardValue4709_22_0)));
    }
    return forwardValue4709_23_0;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.block.BlockPistonBase)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_4059fcd1c032_invokedynamic4709_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10023_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic4715_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic4718_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
