package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dT extends net.minecraft.block.Block {

private static final long Q;

private static final long[] R;

private static final java.lang.Integer[] S;

private static final java.util.Map T;

public dT() {
this((moom.fn.e).a__fm());
}


public dT(moom.fm p0) {
super(moom.fn.e, p0);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
Q = ((long)(((moom._a)(moom._c.a(((long)(474755373717019393L)), ((long)(6081207735032729192L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195630110076826L)))));
    T = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dT.Q ^ 75390560111840L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill809_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill809_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill809_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill809_14 = new byte[8];
    (__sourceSpill809_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill809_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation809_16 = __sourceSpill809_14;
    ((javax.crypto.Cipher)(__sourceSpill809_11)).init(((int)(__sourceSpill809_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill809_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation809_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ò(ëÀ(\003êïS\016ø=°a"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill809_25 = local6_life21;
        int __sourceSpill809_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill809_25)).substring(((int)(__sourceSpill809_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill809_30 = local8_life19;
        int __sourceSpill809_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill809_33 = new byte[8];
        (__sourceSpill809_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill809_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill809_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill809_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill809_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill809_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill809_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill809_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill809_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill809_34)).doFinal(((byte[])(__sourceSpill809_33)));
        (__sourceSpill809_30)[__sourceSpill809_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    R = ((long[])(local8_life19));
    S = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7323_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21555;
      if (S[var3] == null) {
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
         long var5 = R[var3];
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
         Object[] var9 = (Object[])T.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               T.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dT", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         S[var3] = var15;
      }

      return S[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dT.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int c(net.minecraft.block.state.IBlockState p0) {
long local2 = (moom.dT.Q ^ 76026104161751L);
    return ((this == net.minecraft.init.Blocks.x) ? ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b() : 0);
}


public int a(java.util.Random p0) {
long local2 = (moom.dT.Q ^ 35156920261082L);
    return ((this == net.minecraft.init.Blocks.x) ? (4 + ((java.util.Random)(p0)).nextInt(((int)(5)))) : 1);
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
moom.dT forwardValue3274_15_0;
    net.minecraft.block.Block forwardValue3274_15_1;
    moom.dT forwardValue3274_22_0;
    net.minecraft.block.Block forwardValue3274_22_1;
    moom.dT forwardValue3274_29_0;
    net.minecraft.block.Block forwardValue3274_29_1;
    moom.dT forwardValue3274_38_0;
    net.minecraft.block.Block forwardValue3274_38_1;
    moom.dT forwardValue3274_42_0;
    net.minecraft.item.Item forwardValue3274_43_0;
    moom.dT spill3274_0;
    net.minecraft.block.Block spill3274_1;
    moom.dT spill3274_2;
    long life4_3;
    int[] life6_5;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_38: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    forward_join_22: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    life4_3 = (moom.dT.Q ^ 56053998162462L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3274_0 = this;
    spill3274_1 = net.minecraft.init.Blocks.q;
    if (!((life6_5 != null))) {
        forwardValue3274_15_0 = spill3274_0;
        forwardValue3274_15_1 = spill3274_1;
        break forward_join_15;
    }
    if (!((spill3274_0 == spill3274_1))) {
        break forward_join_13;
    }
    forwardValue3274_43_0 = net.minecraft.init.Items.h;
    break forward_join_43;
    }
    forwardValue3274_15_0 = this;
    forwardValue3274_15_1 = net.minecraft.init.Blocks.ag;
    }
    if (!((life6_5 != null))) {
        forwardValue3274_22_0 = forwardValue3274_15_0;
        forwardValue3274_22_1 = forwardValue3274_15_1;
        break forward_join_22;
    }
    if (!((forwardValue3274_15_0 == forwardValue3274_15_1))) {
        break forward_join_20;
    }
    forwardValue3274_43_0 = net.minecraft.init.Items.i;
    break forward_join_43;
    }
    forwardValue3274_22_0 = this;
    forwardValue3274_22_1 = net.minecraft.init.Blocks.x;
    }
    if (!((life6_5 != null))) {
        forwardValue3274_29_0 = forwardValue3274_22_0;
        forwardValue3274_29_1 = forwardValue3274_22_1;
        break forward_join_29;
    }
    if (!((forwardValue3274_22_0 == forwardValue3274_22_1))) {
        break forward_join_27;
    }
    forwardValue3274_43_0 = net.minecraft.init.Items.aW;
    break forward_join_43;
    }
    forwardValue3274_29_0 = this;
    forwardValue3274_29_1 = net.minecraft.init.Blocks.bE;
    }
    if (!((life6_5 != null))) {
        forwardValue3274_38_0 = forwardValue3274_29_0;
        forwardValue3274_38_1 = forwardValue3274_29_1;
        break forward_join_38;
    }
    if (!((forwardValue3274_29_0 == forwardValue3274_29_1))) {
        break forward_join_34;
    }
    forwardValue3274_43_0 = net.minecraft.init.Items.bD;
    break forward_join_43;
    }
    spill3274_2 = this;
    if (!((life6_5 != null))) {
        forwardValue3274_42_0 = spill3274_2;
        break forward_join_42;
    }
    forwardValue3274_38_0 = spill3274_2;
    forwardValue3274_38_1 = net.minecraft.init.Blocks.b3;
    }
    if (!((forwardValue3274_38_0 == forwardValue3274_38_1))) {
        break forward_join_41;
    }
    forwardValue3274_43_0 = net.minecraft.init.Items.bV;
    break forward_join_43;
    }
    forwardValue3274_42_0 = this;
    }
    forwardValue3274_43_0 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(forwardValue3274_42_0)));
    }
    return forwardValue3274_43_0;
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(int p0, java.util.Random p1) {
int forwardValue3273_46_0;
    moom.dT forwardValue3273_48_0;
    int forwardValue3273_50_0;
    int spill3273_0;
    moom.dT spill3273_1;
    int spill3273_2;
    long life3_3;
    int[] life5_5;
    int life6_41;
    forward_join_50: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_39: {
    life3_3 = (moom.dT.Q ^ 134461953163707L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3273_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue3273_50_0 = spill3273_0;
        break forward_join_50;
    }
    if (!((spill3273_0 > 0))) {
        break forward_join_47;
    }
    spill3273_1 = this;
    if (!((life5_5 != null))) {
        forwardValue3273_48_0 = spill3273_1;
        break forward_join_48;
    }
    if (!((net.minecraft.item.Item.a(((net.minecraft.block.Block)(spill3273_1))) != ((moom.dT)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((com.google.common.collect.UnmodifiableIterator)(((com.google.common.collect.ImmutableList)(((moom.fA)(((moom.dT)(this)).b__fA())).a())).iterator())).next())))), ((java.util.Random)(p1)), ((int)(p0)))))) {
        break forward_join_47;
    }
    life6_41 = (((java.util.Random)(p1)).nextInt(((int)((p0 + 2)))) - 1);
    spill3273_2 = life6_41;
    if (!((life5_5 != null))) {
        forwardValue3273_46_0 = spill3273_2;
        break forward_join_46;
    }
    if (!((spill3273_2 < 0))) {
        break forward_join_39;
    }
    life6_41 = 0;
    }
    forwardValue3273_46_0 = (((moom.dT)(this)).a(((java.util.Random)(p1))) * (life6_41 + 1));
    }
    return forwardValue3273_46_0;
    }
    forwardValue3273_48_0 = this;
    }
    forwardValue3273_50_0 = ((moom.dT)(forwardValue3273_48_0)).a(((java.util.Random)(p1)));
    }
    return forwardValue3273_50_0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
moom.dT forwardValue3275_39_0;
    net.minecraft.block.Block forwardValue3275_39_1;
    moom.dT forwardValue3275_56_0;
    net.minecraft.block.Block forwardValue3275_56_1;
    moom.dT forwardValue3275_73_0;
    net.minecraft.block.Block forwardValue3275_73_1;
    moom.dT forwardValue3275_88_0;
    net.minecraft.block.Block forwardValue3275_88_1;
    moom.dT forwardValue3275_96_0;
    int[] spill3275_0;
    moom.dT spill3275_1;
    net.minecraft.block.Block spill3275_2;
    moom.dT spill3275_3;
    long life6_3;
    int[] life8_12;
    int life9_23;
    forward_join_100: {
    forward_join_96: {
    forward_join_95: {
    forward_join_88: {
    forward_join_84: {
    forward_join_73: {
    forward_join_71: {
    forward_join_56: {
    forward_join_54: {
    forward_join_39: {
    forward_join_37: {
    life6_3 = (moom.dT.Q ^ 74816503218294L);
    spill3275_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(p3)), ((int)(p4)));
    life8_12 = spill3275_0;
    if (!((((moom.dT)(this)).a(((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(p4))) != net.minecraft.item.Item.a(((net.minecraft.block.Block)(this)))))) {
        break forward_join_100;
    }
    life9_23 = 0;
    spill3275_1 = this;
    spill3275_2 = net.minecraft.init.Blocks.q;
    if (!((life8_12 != null))) {
        forwardValue3275_39_0 = spill3275_1;
        forwardValue3275_39_1 = spill3275_2;
        break forward_join_39;
    }
    if (!((spill3275_1 == spill3275_2))) {
        break forward_join_37;
    }
    life9_23 = moom.Dr.a(((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(0)), ((int)(2)));
    if (!((life8_12 == null))) {
        break forward_join_95;
    }
    }
    forwardValue3275_39_0 = this;
    forwardValue3275_39_1 = net.minecraft.init.Blocks.ag;
    }
    if (!((life8_12 != null))) {
        forwardValue3275_56_0 = forwardValue3275_39_0;
        forwardValue3275_56_1 = forwardValue3275_39_1;
        break forward_join_56;
    }
    if (!((forwardValue3275_39_0 == forwardValue3275_39_1))) {
        break forward_join_54;
    }
    life9_23 = moom.Dr.a(((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(3)), ((int)(__sourceIntrinsic_205edd9df212_invokedynamic3275_11(9249, (4143714080285955117L ^ life6_3)))));
    if (!((life8_12 == null))) {
        break forward_join_95;
    }
    }
    forwardValue3275_56_0 = this;
    forwardValue3275_56_1 = net.minecraft.init.Blocks.bE;
    }
    if (!((life8_12 != null))) {
        forwardValue3275_73_0 = forwardValue3275_56_0;
        forwardValue3275_73_1 = forwardValue3275_56_1;
        break forward_join_73;
    }
    if (!((forwardValue3275_56_0 == forwardValue3275_56_1))) {
        break forward_join_71;
    }
    life9_23 = moom.Dr.a(((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(3)), ((int)(__sourceIntrinsic_205edd9df212_invokedynamic3275_15(32464, (301998142729375453L ^ life6_3)))));
    if (!((life8_12 == null))) {
        break forward_join_95;
    }
    }
    forwardValue3275_73_0 = this;
    forwardValue3275_73_1 = net.minecraft.init.Blocks.x;
    }
    if (!((life8_12 != null))) {
        forwardValue3275_88_0 = forwardValue3275_73_0;
        forwardValue3275_88_1 = forwardValue3275_73_1;
        break forward_join_88;
    }
    if (!((forwardValue3275_73_0 == forwardValue3275_73_1))) {
        break forward_join_84;
    }
    life9_23 = moom.Dr.a(((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(2)), ((int)(5)));
    if (!((life8_12 == null))) {
        break forward_join_95;
    }
    }
    spill3275_3 = this;
    if (!((life8_12 != null))) {
        forwardValue3275_96_0 = spill3275_3;
        break forward_join_96;
    }
    forwardValue3275_88_0 = spill3275_3;
    forwardValue3275_88_1 = net.minecraft.init.Blocks.b3;
    }
    if (!((forwardValue3275_88_0 == forwardValue3275_88_1))) {
        break forward_join_95;
    }
    life9_23 = moom.Dr.a(((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(2)), ((int)(5)));
    }
    forwardValue3275_96_0 = this;
    }
    ((moom.dT)(forwardValue3275_96_0)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((int)(life9_23)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7323_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3275_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_invokedynamic3275_15(int a0, long a1) throws E;
}
