package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class dm extends net.minecraft.block.BlockDirectional {

protected final boolean R;

private static final long V;

private static final long[] W;

private static final java.lang.Integer[] X;

private static final java.util.Map Y;

protected dm(boolean p0) {
super(moom.fn.q);
    this.R = p0;
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p-3f, 0x1.0000000000000p+0f);
}


static {
V = ((long)(((moom._a)(moom._c.a(((long)(5998490028680211924L)), ((long)(1827783348168248832L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269108597942836L)))));
    Y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dm.V ^ 63290630719316L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1166_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1166_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1166_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1166_14 = new byte[8];
    (__sourceSpill1166_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1166_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1166_16 = __sourceSpill1166_14;
    ((javax.crypto.Cipher)(__sourceSpill1166_11)).init(((int)(__sourceSpill1166_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1166_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1166_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ".{\022sÀuÁp?ÒJ¯^Vº"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1166_25 = local6_life21;
        int __sourceSpill1166_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1166_25)).substring(((int)(__sourceSpill1166_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1166_30 = local8_life19;
        int __sourceSpill1166_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1166_33 = new byte[8];
        (__sourceSpill1166_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1166_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1166_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1166_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1166_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1166_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1166_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1166_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1166_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1166_34)).doFinal(((byte[])(__sourceSpill1166_33)));
        (__sourceSpill1166_30)[__sourceSpill1166_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÑCøÔÂé\0330C0\177NàV"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1166_38 = local6_life21;
        int __sourceSpill1166_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1166_38)).substring(((int)(__sourceSpill1166_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1166_43 = local8_life19;
        int __sourceSpill1166_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1166_46 = new byte[8];
        (__sourceSpill1166_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1166_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1166_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1166_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1166_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1166_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1166_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1166_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1166_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1166_47)).doFinal(((byte[])(__sourceSpill1166_46)));
        (__sourceSpill1166_43)[__sourceSpill1166_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    W = ((long[])(local8_life19));
    X = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.block.state.IBlockState forwardValue3338_27_0;
    int forwardValue3338_34_0;
    int[] spill3338_0;
    net.minecraft.block.state.IBlockState spill3338_1;
    long life4_3;
    moom.bs life7_10;
    int[] life6_11;
    moom.DT life8_15;
    forward_join_34: {
    forward_join_33: {
    forward_join_27: {
    life4_3 = (moom.dm.V ^ 46465077436125L);
    spill3338_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dm.Q))))))).a__bs();
    life6_11 = spill3338_0;
    life8_15 = ((moom.DT)(p1)).a(((moom.bs)(life7_10)));
    spill3338_1 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_15)));
    if (!((life6_11 != null))) {
        forwardValue3338_27_0 = spill3338_1;
        break forward_join_27;
    }
    if (!(moom.dm.c(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill3338_1)).a__ch()))))) {
        break forward_join_33;
    }
    forwardValue3338_27_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_15)));
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3338_27_0)).a(((net.minecraft.block.properties.IProperty)(moom.dm.Q))) != life7_10))) {
        break forward_join_33;
    }
    forwardValue3338_34_0 = 1;
    break forward_join_34;
    }
    forwardValue3338_34_0 = 0;
    }
    return ((forwardValue3338_34_0) != 0);
}


protected int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long local4 = (moom.dm.V ^ 10601294767647L);
    return __sourceIntrinsic_36a294c29801_originalDynamicSite1411_1(27515, (7132227693709574275L ^ local4));
}


protected boolean b(net.minecraft.block.Block p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(p0)).l())) != 0);
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.dm)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7392_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dm.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3893;
      if (X[var3] == null) {
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
         long var5 = W[var3];
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
         Object[] var9 = (Object[])Y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         X[var3] = var15;
      }

      return X[var3];
}


protected abstract net.minecraft.block.state.IBlockState b__fE(net.minecraft.block.state.IBlockState p0);

public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
return ((moom.dm)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.bs)(p3)));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3336_19_0;
    int forwardValue3336_41_0;
    int forwardValue3336_55_0;
    net.minecraft.world.World forwardValue3336_61_0;
    moom.DT forwardValue3336_61_1;
    net.minecraft.block.state.IBlockState forwardValue3336_61_2;
    boolean spill3336_0;
    boolean spill3336_1;
    int spill3336_2;
    net.minecraft.world.World spill3336_3;
    moom.DT spill3336_4;
    net.minecraft.block.state.IBlockState spill3336_5;
    long life5_3;
    int[] life7_5;
    int life8_25;
    forward_join_67: {
    forward_join_61: {
    forward_join_55: {
    forward_join_41: {
    forward_join_39: {
    forward_join_19: {
    life5_3 = (moom.dm.V ^ 67404723981257L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3336_0 = ((moom.dm)(this)).a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        forwardValue3336_19_0 = ((spill3336_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill3336_0))) {
        break forward_join_67;
    }
    forwardValue3336_19_0 = ((((moom.dm)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0);
    }
    life8_25 = forwardValue3336_19_0;
    spill3336_1 = this.R;
    if (!((life7_5 != null))) {
        forwardValue3336_41_0 = ((spill3336_1) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill3336_1)) {
        break forward_join_39;
    }
    spill3336_2 = life8_25;
    if (!((life7_5 != null))) {
        forwardValue3336_41_0 = spill3336_2;
        break forward_join_41;
    }
    if (!((spill3336_2 == 0))) {
        break forward_join_39;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((moom.dm)(this)).c__sourceReturn_22c3f88038(((net.minecraft.block.state.IBlockState)(p2))))), ((int)(2)));
    if (!((life7_5 == null))) {
        break forward_join_67;
    }
    }
    forwardValue3336_41_0 = ((this.R) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3336_55_0 = forwardValue3336_41_0;
        break forward_join_55;
    }
    if (!((forwardValue3336_41_0 == 0))) {
        break forward_join_67;
    }
    spill3336_3 = p0;
    spill3336_4 = p1;
    spill3336_5 = ((moom.dm)(this)).b__fE(((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        forwardValue3336_61_0 = spill3336_3;
        forwardValue3336_61_1 = spill3336_4;
        forwardValue3336_61_2 = spill3336_5;
        break forward_join_61;
    }
    ((net.minecraft.world.World)(spill3336_3)).a(((moom.DT)(spill3336_4)), ((net.minecraft.block.state.IBlockState)(spill3336_5)), ((int)(2)));
    forwardValue3336_55_0 = life8_25;
    }
    if (!((forwardValue3336_55_0 == 0))) {
        break forward_join_67;
    }
    forwardValue3336_61_0 = p0;
    forwardValue3336_61_1 = p1;
    forwardValue3336_61_2 = ((moom.dm)(this)).b__fE(((net.minecraft.block.state.IBlockState)(p2)));
    }
    ((net.minecraft.world.World)(forwardValue3336_61_0)).a(((moom.DT)(forwardValue3336_61_1)), ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(forwardValue3336_61_2)).a__ch())), ((int)(((moom.dm)(this)).e(((net.minecraft.block.state.IBlockState)(p2))))), ((int)(-1)));
    }
    return;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3337_17_0;
    int forwardValue3337_21_0;
    int forwardValue3337_23_0;
    boolean spill3337_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.dm.V ^ 33330498302012L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3337_0 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life5_5 != null))) {
        forwardValue3337_17_0 = ((spill3337_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill3337_0)) {
        break forward_join_22;
    }
    forwardValue3337_17_0 = ((super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3337_21_0 = forwardValue3337_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3337_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue3337_21_0 = 1;
    }
    forwardValue3337_23_0 = forwardValue3337_21_0;
    break forward_join_23;
    }
    forwardValue3337_23_0 = 0;
    }
    return ((forwardValue3337_23_0) != 0);
}


protected void e(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
java.lang.Object local4 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dm.Q)))));
    java.lang.Object local5 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(local4)).a__bs())));
    ((net.minecraft.world.World)(p0)).c(((moom.DT)(local5)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(local5)), ((net.minecraft.block.Block)(this)), ((moom.bs)(local4)));
    return;
}


protected int e(net.minecraft.block.state.IBlockState p0) {
return ((moom.dm)(this)).f(((net.minecraft.block.state.IBlockState)(p0)));
}


public static boolean c(net.minecraft.block.Block p0) {
int forwardValue3339_19_0;
    int forwardValue3339_21_0;
    boolean spill3339_0;
    boolean spill3339_1;
    long life1_3;
    int[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.dm.V ^ 61210724023517L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3339_0 = ((net.minecraft.block.BlockRedstoneRepeater)(net.minecraft.init.Blocks.a1)).d(((net.minecraft.block.Block)(p0)));
    if (!((life3_5 != null))) {
        forwardValue3339_19_0 = ((spill3339_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill3339_0))) {
        break forward_join_18;
    }
    spill3339_1 = ((net.minecraft.block.BlockRedstoneComparator)(net.minecraft.init.Blocks.bY)).d(((net.minecraft.block.Block)(p0)));
    if (!((life3_5 != null))) {
        forwardValue3339_19_0 = ((spill3339_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3339_1)) {
        break forward_join_20;
    }
    }
    forwardValue3339_19_0 = 1;
    }
    forwardValue3339_21_0 = forwardValue3339_19_0;
    break forward_join_21;
    }
    forwardValue3339_21_0 = 0;
    }
    return ((forwardValue3339_21_0) != 0);
}


protected abstract net.minecraft.block.state.IBlockState c__sourceReturn_22c3f88038(net.minecraft.block.state.IBlockState p0);

public boolean c(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT()))))) != 0);
}


protected abstract int f(net.minecraft.block.state.IBlockState p0);

public boolean l() {
return ((1) != 0);
}


public boolean d(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue3340_21_0;
    net.minecraft.block.Block forwardValue3340_21_1;
    int forwardValue3340_25_0;
    net.minecraft.block.Block spill3340_0;
    net.minecraft.block.Block spill3340_1;
    long life2_3;
    int[] life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.dm.V ^ 100796900880203L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3340_0 = p0;
    spill3340_1 = ((net.minecraft.block.state.IBlockState)(((moom.dm)(this)).b__fE(((net.minecraft.block.state.IBlockState)(((moom.dm)(this)).a__fE()))))).a__ch();
    if (!((life4_5 != null))) {
        forwardValue3340_21_0 = spill3340_0;
        forwardValue3340_21_1 = spill3340_1;
        break forward_join_21;
    }
    if (!((spill3340_0 != spill3340_1))) {
        break forward_join_22;
    }
    forwardValue3340_21_0 = p0;
    forwardValue3340_21_1 = ((net.minecraft.block.state.IBlockState)(((moom.dm)(this)).c__sourceReturn_22c3f88038(((net.minecraft.block.state.IBlockState)(((moom.dm)(this)).a__fE()))))).a__ch();
    }
    if (!((forwardValue3340_21_0 == forwardValue3340_21_1))) {
        break forward_join_24;
    }
    }
    forwardValue3340_25_0 = 1;
    break forward_join_25;
    }
    forwardValue3340_25_0 = 0;
    }
    return ((forwardValue3340_25_0) != 0);
}


protected void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3341_19_0;
    int forwardValue3341_31_0;
    int forwardValue3341_35_0;
    int forwardValue3341_42_0;
    int forwardValue3341_46_0;
    int forwardValue3341_65_0;
    int forwardValue3341_73_0;
    boolean spill3341_0;
    boolean spill3341_1;
    int spill3341_2;
    boolean spill3341_3;
    long life4_3;
    int[] life6_5;
    int life7_25;
    int life8_76;
    forward_join_82: {
    forward_join_74: {
    forward_join_73: {
    forward_join_65: {
    forward_join_63: {
    forward_join_46: {
    forward_join_42: {
    forward_join_38: {
    forward_join_35: {
    forward_join_31: {
    forward_join_29: {
    forward_join_19: {
    life4_3 = (moom.dm.V ^ 14149208768758L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3341_0 = ((moom.dm)(this)).a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3341_19_0 = ((spill3341_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill3341_0))) {
        break forward_join_82;
    }
    forwardValue3341_19_0 = ((((moom.dm)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0);
    }
    life7_25 = forwardValue3341_19_0;
    spill3341_1 = this.R;
    if (!((life6_5 != null))) {
        forwardValue3341_31_0 = ((spill3341_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill3341_1)) {
        break forward_join_29;
    }
    spill3341_2 = life7_25;
    if (!((life6_5 != null))) {
        forwardValue3341_42_0 = spill3341_2;
        break forward_join_42;
    }
    if (!((spill3341_2 != 0))) {
        break forward_join_38;
    }
    }
    forwardValue3341_31_0 = ((this.R) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3341_35_0 = forwardValue3341_31_0;
        break forward_join_35;
    }
    if (!((forwardValue3341_31_0 == 0))) {
        break forward_join_82;
    }
    forwardValue3341_35_0 = life7_25;
    }
    if (!((life6_5 != null))) {
        forwardValue3341_42_0 = forwardValue3341_35_0;
        break forward_join_42;
    }
    if (!((forwardValue3341_35_0 != 0))) {
        break forward_join_82;
    }
    }
    forwardValue3341_42_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3341_46_0 = forwardValue3341_42_0;
        break forward_join_46;
    }
    if (!((forwardValue3341_42_0 == 0))) {
        break forward_join_82;
    }
    forwardValue3341_46_0 = -1;
    }
    life8_76 = forwardValue3341_46_0;
    spill3341_3 = ((moom.dm)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3341_65_0 = ((spill3341_3) ? 1 : 0);
        break forward_join_65;
    }
    if (!(spill3341_3)) {
        break forward_join_63;
    }
    life8_76 = __sourceIntrinsic_48609344e626_invokedynamic3341_14(12927, (1230670794939121517L ^ life4_3));
    if (!((life6_5 == null))) {
        break forward_join_74;
    }
    }
    forwardValue3341_65_0 = ((this.R) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue3341_73_0 = forwardValue3341_65_0;
        break forward_join_73;
    }
    if (!((forwardValue3341_65_0 != 0))) {
        break forward_join_74;
    }
    forwardValue3341_73_0 = __sourceIntrinsic_48609344e626_invokedynamic3341_17(11959, (3849518828390458279L ^ life4_3));
    }
    life8_76 = forwardValue3341_73_0;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.dm)(this)).f(((net.minecraft.block.state.IBlockState)(p2))))), ((int)(life8_76)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
return (__sourceIntrinsic_booleanComparison((((moom.dm)(this)).d(((net.minecraft.block.Block)(p0))))) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
long local4 = (moom.dm.V ^ 43404872778429L);
    return ((((((moom.bs)(p2)).a__bt() != net.minecraft.util.EnumFacing$Axis.Y) ? 1 : 0)) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


protected int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
net.minecraft.block.Block forwardValue3330_20_0;
    int forwardValue3330_34_0;
    int[] spill3330_0;
    moom.dm spill3330_1;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_8;
    net.minecraft.block.Block life8_11;
    int[] life6_12;
    forward_join_34: {
    forward_join_33: {
    forward_join_28: {
    forward_join_20: {
    life4_3 = (moom.dm.V ^ 84247571241826L);
    spill3330_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life8_11 = ((net.minecraft.block.state.IBlockState)(life7_8)).a__ch();
    life6_12 = spill3330_0;
    spill3330_1 = this;
    if (!((life6_12 != null))) {
        forwardValue3330_20_0 = spill3330_1;
        break forward_join_20;
    }
    if (!(((moom.dm)(spill3330_1)).b(((net.minecraft.block.Block)(life8_11))))) {
        break forward_join_33;
    }
    forwardValue3330_20_0 = life8_11;
    }
    if (!((forwardValue3330_20_0 == net.minecraft.init.Blocks.af))) {
        break forward_join_28;
    }
    forwardValue3330_34_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life7_8)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue();
    break forward_join_34;
    }
    forwardValue3330_34_0 = ((net.minecraft.world.IBlockAccess)(p0)).a(((moom.DT)(p1)), ((moom.bs)(p2)));
    break forward_join_34;
    }
    forwardValue3330_34_0 = 0;
    }
    return forwardValue3330_34_0;
}


protected int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
java.lang.Object local4 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dm.Q)))));
    java.lang.Object local5 = ((moom.bs)(local4)).b__bs();
    java.lang.Object local6 = ((moom.bs)(local4)).e__bs();
    return java.lang.Math.max(((int)(((moom.dm)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(local5))))), ((moom.bs)(local5))))), ((int)(((moom.dm)(this)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(local6))))), ((moom.bs)(local6))))));
}


protected int a__sourceReturn_7bedc3115a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3332_30_0;
    int forwardValue3332_43_0;
    net.minecraft.block.state.IBlockState forwardValue3332_43_1;
    int forwardValue3332_48_0;
    int forwardValue3332_49_0;
    int forwardValue3332_49_1;
    int[] spill3332_0;
    int spill3332_1;
    int spill3332_2;
    net.minecraft.block.state.IBlockState spill3332_3;
    long life4_3;
    moom.bs life7_8;
    moom.DT life8_13;
    int life9_18;
    int[] life6_19;
    net.minecraft.block.state.IBlockState life10_40;
    forward_join_49: {
    forward_join_48: {
    forward_join_43: {
    forward_join_31: {
    forward_join_30: {
    life4_3 = (moom.dm.V ^ 126696387335777L);
    life7_8 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dm.Q)))));
    spill3332_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_13 = ((moom.DT)(p1)).a(((moom.bs)(life7_8)));
    life9_18 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(life8_13)), ((moom.bs)(life7_8)));
    life6_19 = spill3332_0;
    spill3332_1 = life9_18;
    if (!((life6_19 != null))) {
        forwardValue3332_30_0 = spill3332_1;
        break forward_join_30;
    }
    if (!((spill3332_1 >= __sourceIntrinsic_eea8e820d1ab_invokedynamic3332_7(30901, (7865112463831114545L ^ life4_3))))) {
        break forward_join_31;
    }
    forwardValue3332_30_0 = life9_18;
    }
    return forwardValue3332_30_0;
    }
    life10_40 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_13)));
    spill3332_2 = life9_18;
    spill3332_3 = life10_40;
    if (!((life6_19 != null))) {
        forwardValue3332_43_0 = spill3332_2;
        forwardValue3332_43_1 = spill3332_3;
        break forward_join_43;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3332_3)).a__ch() == net.minecraft.init.Blocks.af))) {
        forwardValue3332_48_0 = spill3332_2;
        break forward_join_48;
    }
    forwardValue3332_43_0 = spill3332_2;
    forwardValue3332_43_1 = life10_40;
    }
    forwardValue3332_49_0 = forwardValue3332_43_0;
    forwardValue3332_49_1 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(forwardValue3332_43_1)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue();
    break forward_join_49;
    }
    forwardValue3332_49_0 = forwardValue3332_48_0;
    forwardValue3332_49_1 = 0;
    }
    return java.lang.Math.max(((int)(forwardValue3332_49_0)), ((int)(forwardValue3332_49_1)));
}


protected boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3334_15_0;
    int forwardValue3334_17_0;
    int spill3334_0;
    long life4_3;
    int[] life6_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life4_3 = (moom.dm.V ^ 11017340001481L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3334_0 = ((moom.dm)(this)).a__sourceReturn_7bedc3115a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3334_15_0 = spill3334_0;
        break forward_join_15;
    }
    if (!((spill3334_0 > 0))) {
        break forward_join_16;
    }
    forwardValue3334_15_0 = 1;
    }
    forwardValue3334_17_0 = forwardValue3334_15_0;
    break forward_join_17;
    }
    forwardValue3334_17_0 = 0;
    }
    return ((forwardValue3334_17_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return ((0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int lexicalValue1120_29_0;
    boolean spill1120_0;
    long life5_3;
    int[] life7_5;
    moom.bs[] life8_40;
    int life9_43;
    int life10_45;
    moom.bs life11_52;
    lexical_join_53: {
    lexical_join_29: {
    lexical_join_20: {
    life5_3 = (moom.dm.V ^ 44228940134216L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1120_0 = ((moom.dm)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        lexicalValue1120_29_0 = ((spill1120_0) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill1120_0)) {
        break lexical_join_20;
    }
    ((moom.dm)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 == null))) {
        break lexical_join_53;
    }
    }
    ((moom.dm)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    lexicalValue1120_29_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1120_29_0);
    life8_40 = moom.bs.values();
    life9_43 = (life8_40).length;
    life10_45 = 0;
    lexical_cycle_37: while (true) {
    if (!((life10_45 < life9_43))) {
        break lexical_join_53;
    }
    life11_52 = (life8_40)[life10_45];
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life11_52))))), ((net.minecraft.block.Block)(this)));
    life10_45 += 1;
    if (!((life7_5 == null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return;
}


protected boolean a__sourceReturn_ca116c2731(net.minecraft.block.state.IBlockState p0) {
return ((((this.R) ? 1 : 0)) != 0);
}


public void a__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
moom.dm lexicalValue1121_37_0;
    moom.dm spill1121_0;
    long life4_3;
    int[] life6_5;
    moom.bs[] life7_15;
    int life8_18;
    int life9_20;
    moom.bs life10_27;
    lexical_join_41: {
    lexical_join_37: {
    lexical_join_36: {
    life4_3 = (moom.dm.V ^ 6033443725345L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1121_0 = this;
    if (!((life6_5 != null))) {
        lexicalValue1121_37_0 = spill1121_0;
        break lexical_join_37;
    }
    if (!(((moom.dm)(spill1121_0)).R)) {
        break lexical_join_36;
    }
    life7_15 = moom.bs.values();
    life8_18 = (life7_15).length;
    life9_20 = 0;
    lexical_cycle_18: while (true) {
    if (!((life9_20 < life8_18))) {
        break lexical_join_36;
    }
    life10_27 = (life7_15)[life9_20];
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life10_27))))), ((net.minecraft.block.Block)(this)));
    life9_20 += 1;
    if (!((life6_5 != null))) {
        break lexical_join_41;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1121_37_0 = this;
    }
    __sourceIntrinsic_59457468f94b_call1121_6(lexicalValue1121_37_0, p0, p1, p2);
    }
    return;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3331_13_0;
    int forwardValue3331_26_0;
    boolean spill3331_0;
    long life5_3;
    int[] life7_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_14: {
    forward_join_13: {
    life5_3 = (moom.dm.V ^ 75469766730054L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3331_0 = ((moom.dm)(this)).a__sourceReturn_ca116c2731(((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 != null))) {
        forwardValue3331_13_0 = ((spill3331_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3331_0))) {
        break forward_join_14;
    }
    forwardValue3331_13_0 = 0;
    }
    forwardValue3331_26_0 = forwardValue3331_13_0;
    break forward_join_26;
    }
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dm.Q))) == p3))) {
        break forward_join_25;
    }
    forwardValue3331_26_0 = ((moom.dm)(this)).b(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    break forward_join_26;
    }
    forwardValue3331_26_0 = 0;
    }
    return forwardValue3331_26_0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((moom.dm)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dm.Q)), ((java.lang.Comparable)(((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())).a__bs())));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.EntityLivingBase p3, net.minecraft.item.ItemStack p4) {
long local6 = (moom.dm.V ^ 78672544073613L);
    if ((__sourceIntrinsic_booleanComparison(((moom.dm)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) != 0)) {
        ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(1)));
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_36a294c29801_originalDynamicSite1411_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7392_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_48609344e626_invokedynamic3341_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_48609344e626_invokedynamic3341_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eea8e820d1ab_invokedynamic3332_7(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_59457468f94b_call1121_6(moom.dm a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
