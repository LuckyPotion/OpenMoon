package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


















import moom.DT;









import net.minecraft.block.BlockPlanks$EnumType;







import net.minecraft.tileentity.TileEntity;


import net.minecraft.block.state.IBlockState;

import net.minecraft.world.IBlockAccess;
import java.util.Map;
import net.minecraft.tileentity.TileEntityComparator;
public class BlockRedstoneComparator extends moom.dm implements net.minecraft.block.ITileEntityProvider {

public static final moom.fv S;

public static final moom.fw<net.minecraft.block.BlockRedstoneComparator$Mode> T;

private static final long U;

private static final long[] Z;

private static final java.lang.Integer[] bb;

private static final java.util.Map fb;

public BlockRedstoneComparator(boolean p0) {
super(p0);
    (this).a__Void(((((this.M).a__fE()).a__fE(net.minecraft.block.BlockRedstoneComparator.Q, moom.bs.NORTH)).a__fE(net.minecraft.block.BlockRedstoneComparator.S, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockRedstoneComparator.T, net.minecraft.block.BlockRedstoneComparator$Mode.COMPARE));
    this.A = true;
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(-2981465062297901922L)), ((long)(-568675877425658260L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(180045613034604L)))));
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.block.BlockRedstoneComparator.U ^ 31061828407376L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1756_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1756_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1756_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1756_14 = new byte[8];
    (__sourceSpill1756_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1756_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1756_16 = __sourceSpill1756_14;
    ((javax.crypto.Cipher)(__sourceSpill1756_11)).init(((int)(__sourceSpill1756_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1756_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1756_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "åß»>n=lE1ß\n\025Â"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1756_25 = local6_life21;
        int __sourceSpill1756_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1756_25)).substring(((int)(__sourceSpill1756_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1756_30 = local8_life19;
        int __sourceSpill1756_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1756_33 = new byte[8];
        (__sourceSpill1756_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1756_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1756_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1756_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1756_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1756_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1756_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1756_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1756_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1756_34)).doFinal(((byte[])(__sourceSpill1756_33)));
        (__sourceSpill1756_30)[__sourceSpill1756_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¨µ*\b{p\bTÇWò;É±²\013"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1756_38 = local6_life21;
        int __sourceSpill1756_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1756_38)).substring(((int)(__sourceSpill1756_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1756_43 = local8_life19;
        int __sourceSpill1756_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1756_46 = new byte[8];
        (__sourceSpill1756_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1756_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1756_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1756_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1756_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1756_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1756_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1756_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1756_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1756_47)).doFinal(((byte[])(__sourceSpill1756_46)));
        (__sourceSpill1756_43)[__sourceSpill1756_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Z = ((long[])(local8_life19));
    bb = ((java.lang.Integer[])(new java.lang.Integer[4]));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
    T = ((moom.fw)(moom.fw.a(((java.lang.String)("mode")), ((java.lang.Class)(net.minecraft.block.BlockRedstoneComparator$Mode.class)))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue4732_24_0;
    moom.fv forwardValue4732_24_1;
    int forwardValue4732_24_2;
    net.minecraft.block.state.IBlockState forwardValue4732_25_0;
    moom.fv forwardValue4732_25_1;
    net.minecraft.block.state.IBlockState forwardValue4732_26_0;
    moom.fv forwardValue4732_26_1;
    int forwardValue4732_26_2;
    net.minecraft.block.state.IBlockState forwardValue4732_35_0;
    moom.fw forwardValue4732_35_1;
    net.minecraft.block.state.IBlockState forwardValue4732_36_0;
    moom.fw forwardValue4732_36_1;
    net.minecraft.block.BlockRedstoneComparator$Mode forwardValue4732_36_2;
    net.minecraft.block.state.IBlockState spill4732_0;
    moom.fv spill4732_1;
    int spill4732_2;
    net.minecraft.block.state.IBlockState spill4732_3;
    moom.fw spill4732_4;
    long life2_3;
    int[] life4_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 112507165746611L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4732_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneComparator)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q)), ((java.lang.Comparable)(moom.bs.b(((int)(p0))))));
    spill4732_1 = net.minecraft.block.BlockRedstoneComparator.S;
    spill4732_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic4732_7(11378, (3341070827153164722L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue4732_24_0 = spill4732_0;
        forwardValue4732_24_1 = spill4732_1;
        forwardValue4732_24_2 = spill4732_2;
        break forward_join_24;
    }
    if (!((spill4732_2 > 0))) {
        forwardValue4732_25_0 = spill4732_0;
        forwardValue4732_25_1 = spill4732_1;
        break forward_join_25;
    }
    forwardValue4732_24_0 = spill4732_0;
    forwardValue4732_24_1 = spill4732_1;
    forwardValue4732_24_2 = 1;
    }
    forwardValue4732_26_0 = forwardValue4732_24_0;
    forwardValue4732_26_1 = forwardValue4732_24_1;
    forwardValue4732_26_2 = forwardValue4732_24_2;
    break forward_join_26;
    }
    forwardValue4732_26_0 = forwardValue4732_25_0;
    forwardValue4732_26_1 = forwardValue4732_25_1;
    forwardValue4732_26_2 = 0;
    }
    spill4732_3 = ((net.minecraft.block.state.IBlockState)(forwardValue4732_26_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4732_26_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4732_26_2)))))));
    spill4732_4 = net.minecraft.block.BlockRedstoneComparator.T;
    if (!(((p0 & 4) > 0))) {
        forwardValue4732_35_0 = spill4732_3;
        forwardValue4732_35_1 = spill4732_4;
        break forward_join_35;
    }
    forwardValue4732_36_0 = spill4732_3;
    forwardValue4732_36_1 = spill4732_4;
    forwardValue4732_36_2 = net.minecraft.block.BlockRedstoneComparator$Mode.SUBTRACT;
    break forward_join_36;
    }
    forwardValue4732_36_0 = forwardValue4732_35_0;
    forwardValue4732_36_1 = forwardValue4732_35_1;
    forwardValue4732_36_2 = net.minecraft.block.BlockRedstoneComparator$Mode.COMPARE;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue4732_36_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4732_36_1)), ((java.lang.Comparable)(forwardValue4732_36_2)));
}


protected int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long l = net.minecraft.block.BlockRedstoneComparator.U ^ 0x7C4B7E90EAB2L;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        TileEntity tileEntity = p0.a__B9(p1);
        int n = (tileEntity instanceof TileEntityComparator ? 1 : 0);
        if (nArray != null) {
            n = n != 0 ? ((TileEntityComparator)tileEntity).a__sourceReturn_8abf5c6871() : 0;
        }
        return n;
}


private int b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long local4 = (net.minecraft.block.BlockRedstoneComparator.U ^ 49556469171625L);
    return ((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T))) == net.minecraft.block.BlockRedstoneComparator$Mode.SUBTRACT) ? java.lang.Math.max(((int)((((net.minecraft.block.BlockRedstoneComparator)(this)).a__sourceReturn_7bedc3115a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2))) - ((net.minecraft.block.BlockRedstoneComparator)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))))), ((int)(0))) : ((net.minecraft.block.BlockRedstoneComparator)(this)).a__sourceReturn_7bedc3115a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2))));
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
super.b__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.tileentity.TileEntity)(((net.minecraft.block.BlockRedstoneComparator)(this)).a(((net.minecraft.world.World)(p0)), ((int)(0))))));
    return;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
net.minecraft.block.BlockRedstoneComparator forwardValue4731_23_0;
    net.minecraft.block.BlockRedstoneComparator spill4731_0;
    long life5_3;
    int[] life7_5;
    forward_join_23: {
    forward_join_22: {
    life5_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 79864150968164L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4731_0 = this;
    if (!((life7_5 != null))) {
        forwardValue4731_23_0 = spill4731_0;
        break forward_join_23;
    }
    if (!(((net.minecraft.block.BlockRedstoneComparator)(spill4731_0)).R)) {
        break forward_join_22;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneComparator)(this)).c__sourceReturn_22c3f88038(((net.minecraft.block.state.IBlockState)(p2))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(4)));
    }
    forwardValue4731_23_0 = this;
    }
    ((net.minecraft.block.BlockRedstoneComparator)(forwardValue4731_23_0)).f(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected net.minecraft.block.state.IBlockState b__fE(net.minecraft.block.state.IBlockState p0) {
java.lang.Object local2 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)))));
    java.lang.Object local3 = ((net.minecraft.block.BlockRedstoneComparator$Mode)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T)))));
    java.lang.Object local4 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q)))));
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneComparator)(net.minecraft.init.Blocks.bZ)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q)), ((java.lang.Comparable)(local4))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)), ((java.lang.Comparable)(local2))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T)), ((java.lang.Comparable)(local3)));
}


public int b(net.minecraft.block.state.IBlockState p0) {
java.lang.Comparable forwardValue4730_35_0;
    int[] spill4730_0;
    java.lang.Boolean spill4730_1;
    long life2_3;
    int life5_6;
    int life5_14;
    int[] life4_15;
    forward_join_41: {
    forward_join_35: {
    forward_join_32: {
    life2_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 117541392244409L);
    spill4730_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life5_14 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q))))))).b());
    life4_15 = spill4730_0;
    spill4730_1 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)))));
    if (!((life4_15 != null))) {
        forwardValue4730_35_0 = spill4730_1;
        break forward_join_35;
    }
    if (!(((java.lang.Boolean)(spill4730_1)).booleanValue())) {
        break forward_join_32;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic4730_10(3612, (1307224967551570133L ^ life2_3)));
    }
    forwardValue4730_35_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T)));
    }
    if (!((forwardValue4730_35_0 == net.minecraft.block.BlockRedstoneComparator$Mode.SUBTRACT))) {
        break forward_join_41;
    }
    life5_14 = (life5_14 | 4);
    }
    return life5_14;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral10043_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_430890308eae28(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19982;
      if (bb[var3] == null) {
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
         long var5 = Z[var3];
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
         Object[] var9 = (Object[])fb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               fb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         bb[var3] = var15;
      }

      return bb[var3];
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    ((net.minecraft.world.World)(p0)).c__Void(((moom.DT)(p1)));
    ((net.minecraft.block.BlockRedstoneComparator)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


protected net.minecraft.block.state.IBlockState c__sourceReturn_22c3f88038(net.minecraft.block.state.IBlockState p0) {
java.lang.Object local2 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)))));
    java.lang.Object local3 = ((net.minecraft.block.BlockRedstoneComparator$Mode)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T)))));
    java.lang.Object local4 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q)))));
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneComparator)(net.minecraft.init.Blocks.bY)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q)), ((java.lang.Comparable)(local4))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)), ((java.lang.Comparable)(local2))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T)), ((java.lang.Comparable)(local3)));
}


protected int f(net.minecraft.block.state.IBlockState p0) {
return 2;
}


private void f(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4734_33_0;
    int forwardValue4734_47_0;
    int forwardValue4734_72_0;
    int forwardValue4734_76_0;
    int forwardValue4734_87_0;
    int[] spill4734_0;
    int spill4734_1;
    int spill4734_2;
    int spill4734_3;
    long life4_3;
    int life7_10;
    int[] life6_11;
    net.minecraft.tileentity.TileEntity life8_15;
    int life9_17;
    net.minecraft.tileentity.TileEntityComparator life10_28;
    int life10_59;
    int life11_63;
    forward_join_93: {
    forward_join_88: {
    forward_join_87: {
    forward_join_76: {
    forward_join_72: {
    forward_join_71: {
    forward_join_47: {
    forward_join_42: {
    forward_join_33: {
    forward_join_32: {
    life4_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 55236765663967L);
    spill4734_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((net.minecraft.block.BlockRedstoneComparator)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life6_11 = spill4734_0;
    life8_15 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life9_17 = 0;
    spill4734_1 = ((life8_15 instanceof net.minecraft.tileentity.TileEntityComparator) ? 1 : 0);
    if (!((life6_11 != null))) {
        forwardValue4734_33_0 = spill4734_1;
        break forward_join_33;
    }
    if (!((spill4734_1 != 0))) {
        break forward_join_32;
    }
    life10_28 = ((net.minecraft.tileentity.TileEntityComparator)(life8_15));
    life9_17 = ((net.minecraft.tileentity.TileEntityComparator)(life10_28)).a__sourceReturn_8abf5c6871();
    ((net.minecraft.tileentity.TileEntityComparator)(life10_28)).a(((int)(life7_10)));
    }
    forwardValue4734_33_0 = life9_17;
    }
    if (!((life6_11 != null))) {
        forwardValue4734_47_0 = forwardValue4734_33_0;
        break forward_join_47;
    }
    if (!((forwardValue4734_33_0 == life7_10))) {
        break forward_join_42;
    }
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T))) == net.minecraft.block.BlockRedstoneComparator$Mode.COMPARE))) {
        break forward_join_93;
    }
    }
    forwardValue4734_47_0 = ((((net.minecraft.block.BlockRedstoneComparator)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0);
    }
    life10_59 = forwardValue4734_47_0;
    life11_63 = ((((net.minecraft.block.BlockRedstoneComparator)(this)).a__sourceReturn_ca116c2731(((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0);
    spill4734_2 = life11_63;
    if (!((life6_11 != null))) {
        forwardValue4734_72_0 = spill4734_2;
        break forward_join_72;
    }
    if (!((spill4734_2 != 0))) {
        break forward_join_71;
    }
    spill4734_3 = life10_59;
    if (!((life6_11 != null))) {
        forwardValue4734_72_0 = spill4734_3;
        break forward_join_72;
    }
    if (!((spill4734_3 == 0))) {
        break forward_join_71;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(2)));
    if (!((life6_11 == null))) {
        break forward_join_88;
    }
    }
    forwardValue4734_72_0 = life11_63;
    }
    if (!((life6_11 != null))) {
        forwardValue4734_76_0 = forwardValue4734_72_0;
        break forward_join_76;
    }
    if (!((forwardValue4734_72_0 == 0))) {
        break forward_join_88;
    }
    forwardValue4734_76_0 = life10_59;
    }
    if (!((life6_11 != null))) {
        forwardValue4734_87_0 = forwardValue4734_76_0;
        break forward_join_87;
    }
    if (!((forwardValue4734_76_0 != 0))) {
        break forward_join_88;
    }
    forwardValue4734_87_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4734_87_0);
    }
    ((net.minecraft.block.BlockRedstoneComparator)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


protected void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4733_18_0;
    int forwardValue4733_31_0;
    int forwardValue4733_33_0;
    int forwardValue4733_55_0;
    boolean spill4733_0;
    int spill4733_1;
    int spill4733_2;
    boolean spill4733_3;
    long life4_3;
    int[] life6_5;
    int life7_24;
    net.minecraft.tileentity.TileEntity life8_28;
    int life9_45;
    forward_join_70: {
    forward_join_64: {
    forward_join_55: {
    forward_join_50: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_18: {
    life4_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 133253212687451L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4733_0 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    if (!((life6_5 != null))) {
        forwardValue4733_18_0 = ((spill4733_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill4733_0))) {
        break forward_join_70;
    }
    forwardValue4733_18_0 = ((net.minecraft.block.BlockRedstoneComparator)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    life7_24 = forwardValue4733_18_0;
    life8_28 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    spill4733_1 = ((life8_28 instanceof net.minecraft.tileentity.TileEntityComparator) ? 1 : 0);
    if (!((life6_5 != null))) {
        forwardValue4733_31_0 = spill4733_1;
        break forward_join_31;
    }
    if (!((spill4733_1 != 0))) {
        break forward_join_32;
    }
    forwardValue4733_31_0 = ((net.minecraft.tileentity.TileEntityComparator)(((net.minecraft.tileentity.TileEntityComparator)(life8_28)))).a__sourceReturn_8abf5c6871();
    }
    forwardValue4733_33_0 = forwardValue4733_31_0;
    break forward_join_33;
    }
    forwardValue4733_33_0 = 0;
    }
    life9_45 = forwardValue4733_33_0;
    spill4733_2 = life7_24;
    if (!((life6_5 != null))) {
        forwardValue4733_55_0 = spill4733_2;
        break forward_join_55;
    }
    if (!((spill4733_2 == life9_45))) {
        break forward_join_50;
    }
    spill4733_3 = ((net.minecraft.block.BlockRedstoneComparator)(this)).a__sourceReturn_ca116c2731(((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_5 != null))) {
        forwardValue4733_55_0 = ((spill4733_3) ? 1 : 0);
        break forward_join_55;
    }
    if (!((spill4733_3 != ((net.minecraft.block.BlockRedstoneComparator)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))))) {
        break forward_join_70;
    }
    }
    forwardValue4733_55_0 = ((((net.minecraft.block.BlockRedstoneComparator)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0);
    }
    if (!((forwardValue4733_55_0 != 0))) {
        break forward_join_64;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(2)), ((int)(-1)));
    if (!((life6_5 == null))) {
        break forward_join_70;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(2)), ((int)(0)));
    }
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.bT;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
long local9 = (net.minecraft.block.BlockRedstoneComparator.U ^ 44438730899187L);
    int[] local11 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if ((local11 != null)) {
        if ((!((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).e)) {
        return false;
    }
        p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T)));
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.333334p-2f)), ((float)(((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T))) == net.minecraft.block.BlockRedstoneComparator$Mode.SUBTRACT) ? 0x1.19999ap-1f : 0x1.0p-1f))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)));
    ((net.minecraft.block.BlockRedstoneComparator)(this)).f(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return true;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockRedstoneComparator)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())).a__bs()))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.T)), ((java.lang.Comparable)(net.minecraft.block.BlockRedstoneComparator$Mode.COMPARE)));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.bT;
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)("item.comparator.name")));
}


protected int a__sourceReturn_7bedc3115a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4726_39_0;
    net.minecraft.block.Block forwardValue4726_74_0;
    net.minecraft.entity.item.EntityItemFrame forwardValue4726_88_0;
    int forwardValue4726_91_0;
    int[] spill4726_0;
    boolean spill4726_1;
    boolean spill4726_2;
    net.minecraft.block.Block spill4726_3;
    net.minecraft.entity.item.EntityItemFrame spill4726_4;
    long life4_3;
    int life7_9;
    moom.bs life8_14;
    moom.DT life9_19;
    int[] life6_20;
    net.minecraft.block.Block life10_25;
    moom.DT life9_70;
    net.minecraft.block.Block life10_75;
    net.minecraft.entity.item.EntityItemFrame life11_103;
    forward_join_91: {
    forward_join_90: {
    forward_join_88: {
    forward_join_74: {
    forward_join_73: {
    forward_join_39: {
    forward_join_38: {
    life4_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 7516156140236L);
    life7_9 = super.a__sourceReturn_7bedc3115a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life8_14 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.Q)))));
    spill4726_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_19 = ((moom.DT)(p1)).a(((moom.bs)(life8_14)));
    life6_20 = spill4726_0;
    life10_25 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_19))))).a__ch();
    spill4726_1 = ((net.minecraft.block.Block)(life10_25)).r();
    if (!((life6_20 != null))) {
        forwardValue4726_39_0 = ((spill4726_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill4726_1)) {
        break forward_join_38;
    }
    life7_9 = ((net.minecraft.block.Block)(life10_25)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_19)));
    if (!((life6_20 == null))) {
        break forward_join_90;
    }
    }
    forwardValue4726_39_0 = life7_9;
    }
    if (!((life6_20 != null))) {
        forwardValue4726_91_0 = forwardValue4726_39_0;
        break forward_join_91;
    }
    if (!((forwardValue4726_39_0 < __sourceIntrinsic_eea8e820d1ab_invokedynamic4726_12(6053, (555539742500457755L ^ life4_3))))) {
        break forward_join_90;
    }
    spill4726_2 = ((net.minecraft.block.Block)(life10_25)).e__Boolean();
    if (!((life6_20 != null))) {
        forwardValue4726_91_0 = ((spill4726_2) ? 1 : 0);
        break forward_join_91;
    }
    if (!(spill4726_2)) {
        break forward_join_90;
    }
    life9_70 = ((moom.DT)(life9_19)).a(((moom.bs)(life8_14)));
    life10_75 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_70))))).a__ch();
    spill4726_3 = life10_75;
    if (!((life6_20 != null))) {
        forwardValue4726_74_0 = spill4726_3;
        break forward_join_74;
    }
    if (!(((net.minecraft.block.Block)(spill4726_3)).r())) {
        break forward_join_73;
    }
    life7_9 = ((net.minecraft.block.Block)(life10_75)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life9_70)));
    if (!((life6_20 == null))) {
        break forward_join_90;
    }
    }
    forwardValue4726_74_0 = life10_75;
    }
    if (!((((net.minecraft.block.Block)(forwardValue4726_74_0)).a__fn() == moom.fn.a))) {
        break forward_join_90;
    }
    life11_103 = ((net.minecraft.block.BlockRedstoneComparator)(this)).a(((net.minecraft.world.World)(p0)), ((moom.bs)(life8_14)), ((moom.DT)(life9_70)));
    spill4726_4 = life11_103;
    if (!((life6_20 != null))) {
        forwardValue4726_88_0 = spill4726_4;
        break forward_join_88;
    }
    if (!((spill4726_4 != null))) {
        break forward_join_90;
    }
    forwardValue4726_88_0 = life11_103;
    }
    life7_9 = ((net.minecraft.entity.item.EntityItemFrame)(forwardValue4726_88_0)).d__sourceReturn_8abf5c6871();
    }
    forwardValue4726_91_0 = life7_9;
    }
    return forwardValue4726_91_0;
}


protected boolean a__sourceReturn_ca116c2731(net.minecraft.block.state.IBlockState p0) {
int forwardValue4725_20_0;
    int forwardValue4725_22_0;
    boolean spill4725_0;
    boolean spill4725_1;
    long life2_3;
    int[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 77196393403154L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4725_0 = this.R;
    if (!((life4_5 != null))) {
        forwardValue4725_20_0 = ((spill4725_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4725_0))) {
        break forward_join_19;
    }
    spill4725_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneComparator.S))))))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue4725_20_0 = ((spill4725_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4725_1)) {
        break forward_join_21;
    }
    }
    forwardValue4725_20_0 = 1;
    }
    forwardValue4725_22_0 = forwardValue4725_20_0;
    break forward_join_22;
    }
    forwardValue4725_22_0 = 0;
    }
    return ((forwardValue4725_22_0) != 0);
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new net.minecraft.tileentity.TileEntityComparator();
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3, int p4) {
net.minecraft.tileentity.TileEntity forwardValue4727_23_0;
    int forwardValue4727_30_0;
    int forwardValue4727_32_0;
    int[] spill4727_0;
    net.minecraft.tileentity.TileEntity spill4727_1;
    boolean spill4727_2;
    long life6_3;
    net.minecraft.tileentity.TileEntity life9_16;
    int[] life8_17;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_23: {
    life6_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 81572629753708L);
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(p3)), ((int)(p4)));
    spill4727_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_16 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life8_17 = spill4727_0;
    spill4727_1 = life9_16;
    if (!((life8_17 != null))) {
        forwardValue4727_23_0 = spill4727_1;
        break forward_join_23;
    }
    if (!((spill4727_1 != null))) {
        break forward_join_31;
    }
    forwardValue4727_23_0 = life9_16;
    }
    spill4727_2 = ((net.minecraft.tileentity.TileEntity)(forwardValue4727_23_0)).a__Boolean(((int)(p3)), ((int)(p4)));
    if (!((life8_17 != null))) {
        forwardValue4727_30_0 = ((spill4727_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill4727_2)) {
        break forward_join_31;
    }
    forwardValue4727_30_0 = 1;
    }
    forwardValue4727_32_0 = forwardValue4727_30_0;
    break forward_join_32;
    }
    forwardValue4727_32_0 = 0;
    }
    return ((forwardValue4727_32_0) != 0);
}


protected boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4729_24_0;
    int forwardValue4729_34_0;
    int forwardValue4729_45_0;
    int forwardValue4729_47_0;
    int[] spill4729_0;
    int spill4729_1;
    int spill4729_2;
    int spill4729_3;
    long life4_3;
    int life7_10;
    int[] life6_11;
    int life8_44;
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_34: {
    forward_join_29: {
    forward_join_24: {
    forward_join_23: {
    life4_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 140643474821220L);
    spill4729_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((net.minecraft.block.BlockRedstoneComparator)(this)).a__sourceReturn_7bedc3115a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life6_11 = spill4729_0;
    spill4729_1 = life7_10;
    if (!((life6_11 != null))) {
        forwardValue4729_24_0 = spill4729_1;
        break forward_join_24;
    }
    if (!((spill4729_1 >= __sourceIntrinsic_43cd2316f2c9_invokedynamic4729_3(14503, (3576154241444014258L ^ life4_3))))) {
        break forward_join_23;
    }
    return ((1) != 0);
    }
    forwardValue4729_24_0 = life7_10;
    }
    if (!((life6_11 != null))) {
        forwardValue4729_34_0 = forwardValue4729_24_0;
        break forward_join_34;
    }
    if (!((forwardValue4729_24_0 == 0))) {
        break forward_join_29;
    }
    return ((0) != 0);
    }
    forwardValue4729_34_0 = ((net.minecraft.block.BlockRedstoneComparator)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    life8_44 = forwardValue4729_34_0;
    spill4729_2 = life8_44;
    if (!((life6_11 != null))) {
        forwardValue4729_45_0 = spill4729_2;
        break forward_join_45;
    }
    if (!((spill4729_2 != 0))) {
        break forward_join_44;
    }
    spill4729_3 = life7_10;
    if (!((life6_11 != null))) {
        forwardValue4729_45_0 = spill4729_3;
        break forward_join_45;
    }
    if (!((spill4729_3 >= life8_44))) {
        break forward_join_46;
    }
    }
    forwardValue4729_45_0 = 1;
    }
    forwardValue4729_47_0 = forwardValue4729_45_0;
    break forward_join_47;
    }
    forwardValue4729_47_0 = 0;
    }
    return ((forwardValue4729_47_0) != 0);
}


private net.minecraft.entity.item.EntityItemFrame a(net.minecraft.world.World p0, moom.bs p1, moom.DT p2) {
java.lang.Object forwardValue4728_48_0;
    net.minecraft.entity.item.EntityItemFrame forwardValue4728_51_0;
    int[] spill4728_0;
    java.util.List spill4728_1;
    long life4_3;
    java.util.List life7_37;
    int[] life6_38;
    forward_join_51: {
    forward_join_50: {
    forward_join_48: {
    life4_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 66326142243296L);
    spill4728_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_37 = ((net.minecraft.world.World)(p0)).a(((java.lang.Class)(net.minecraft.entity.item.EntityItemFrame.class)), ((moom.CA)(new moom.CA(((double) ((moom.DT)(p2)).a()), ((double) ((moom.DT)(p2)).b()), ((double) ((moom.DT)(p2)).c()), ((double) (((moom.DT)(p2)).a() + 1)), ((double) (((moom.DT)(p2)).b() + 1)), ((double) (((moom.DT)(p2)).c() + 1))))), ((com.google.common.base.Predicate)(__sourceIntrinsic_37d41fde1111_invokedynamic4728_9(p1))));
    life6_38 = spill4728_0;
    spill4728_1 = life7_37;
    if (!((life6_38 != null))) {
        forwardValue4728_48_0 = spill4728_1;
        break forward_join_48;
    }
    if (!((((java.util.List)(spill4728_1)).size() == 1))) {
        break forward_join_50;
    }
    forwardValue4728_48_0 = ((java.util.List)(life7_37)).get(((int)(0)));
    }
    forwardValue4728_51_0 = ((net.minecraft.entity.item.EntityItemFrame)(forwardValue4728_48_0));
    break forward_join_51;
    }
    forwardValue4728_51_0 = null;
    }
    return forwardValue4728_51_0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockRedstoneComparator.Q, net.minecraft.block.BlockRedstoneComparator.T, net.minecraft.block.BlockRedstoneComparator.S});
}


private static boolean lambda$findItemFrame$0(moom.bs p0, net.minecraft.entity.Entity p1) {
net.minecraft.entity.Entity forwardValue4735_11_0;
    int forwardValue4735_17_0;
    net.minecraft.entity.Entity spill4735_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (net.minecraft.block.BlockRedstoneComparator.U ^ 104395113426447L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4735_0 = p1;
    if (!((life4_5 != null))) {
        forwardValue4735_11_0 = spill4735_0;
        break forward_join_11;
    }
    if (!((spill4735_0 != null))) {
        break forward_join_16;
    }
    forwardValue4735_11_0 = p1;
    }
    if (!((((net.minecraft.entity.Entity)(forwardValue4735_11_0)).b__bs() == p0))) {
        break forward_join_16;
    }
    forwardValue4735_17_0 = 1;
    break forward_join_17;
    }
    forwardValue4735_17_0 = 0;
    }
    return ((forwardValue4735_17_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic4732_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic4730_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral10043_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eea8e820d1ab_invokedynamic4726_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43cd2316f2c9_invokedynamic4729_3(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_37d41fde1111_invokedynamic4728_9(moom.bs a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_430890308eae28(int p0, long p1);
}
