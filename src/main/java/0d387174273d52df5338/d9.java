package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;























import moom.DT;










import net.minecraft.block.BlockPlanks$EnumType;






import net.minecraft.world.World;



import net.minecraft.init.Blocks;
import java.util.Map;
public class d9 extends net.minecraft.block.Block {

public static final moom.fw<net.minecraft.block.BlockRedstoneWire$EnumAttachPosition> Q;

public static final moom.fw<net.minecraft.block.BlockRedstoneWire$EnumAttachPosition> R;

public static final moom.fw<net.minecraft.block.BlockRedstoneWire$EnumAttachPosition> S;

public static final moom.fw<net.minecraft.block.BlockRedstoneWire$EnumAttachPosition> T;

public static final moom.fy U;

private boolean V;

private final java.util.Set<moom.DT> W;

private static final long X;

private static final long[] Y;

private static final java.lang.Integer[] Z;

private static final java.util.Map bb;

public d9() {
super(moom.fn.q);
    this.V = true;
    this.W = com.google.common.collect.Sets.newHashSet();
    (this).a__Void(((((((this.M).a__fE()).a__fE(moom.d9.Q, net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.NONE)).a__fE(moom.d9.R, net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.NONE)).a__fE(moom.d9.S, net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.NONE)).a__fE(moom.d9.T, net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.NONE)).a__fE(moom.d9.U, java.lang.Integer.valueOf(0)));
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p-4f, 0x1.0000000000000p+0f);
}


static {
X = ((long)(((moom._a)(moom._c.a(((long)(-5490465436614340990L)), ((long)(5877638632893220253L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195685714989051L)))));
    long local11_life6 = (moom.d9.X ^ 12308977082412L);
    bb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1147_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1147_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1147_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1147_14 = new byte[8];
    (__sourceSpill1147_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1147_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1147_16 = __sourceSpill1147_14;
    ((javax.crypto.Cipher)(__sourceSpill1147_11)).init(((int)(__sourceSpill1147_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1147_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1147_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[6];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "®Á(\004¹VMPuÉíï*\036»$ TÍ\025OÂÁvP·éY"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1147_25 = local4_life21;
        int __sourceSpill1147_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1147_25)).substring(((int)(__sourceSpill1147_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1147_30 = local6_life19;
        int __sourceSpill1147_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1147_33 = new byte[8];
        (__sourceSpill1147_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1147_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1147_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1147_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1147_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1147_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1147_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1147_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1147_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1147_34)).doFinal(((byte[])(__sourceSpill1147_33)));
        (__sourceSpill1147_30)[__sourceSpill1147_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "RÂè4\nïZß\002©\"À¢{P"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1147_38 = local4_life21;
        int __sourceSpill1147_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1147_38)).substring(((int)(__sourceSpill1147_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1147_43 = local6_life19;
        int __sourceSpill1147_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1147_46 = new byte[8];
        (__sourceSpill1147_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1147_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1147_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1147_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1147_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1147_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1147_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1147_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1147_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1147_47)).doFinal(((byte[])(__sourceSpill1147_46)));
        (__sourceSpill1147_43)[__sourceSpill1147_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    Y = ((long[])(local6_life19));
    Z = ((java.lang.Integer[])(new java.lang.Integer[6]));
    Q = ((moom.fw)(moom.fw.a(((java.lang.String)("north")), ((java.lang.Class)(net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.class)))));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("east")), ((java.lang.Class)(net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.class)))));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("south")), ((java.lang.Class)(net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.class)))));
    T = ((moom.fw)(moom.fw.a(((java.lang.String)("west")), ((java.lang.Class)(net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.class)))));
    U = ((moom.fy)(moom.fy.a(((java.lang.String)("power")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1147_64(17956, (1721000335535244894L ^ local11_life6)))))));
}


protected static boolean b__sourceReturn_b38f36a0de(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((__sourceExactCall_55c3f860812e1e(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)))))))) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7245_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/d9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
moom.d9 forwardValue3216_14_0;
    int forwardValue3216_19_0;
    moom.d9 spill3216_0;
    long life5_3;
    int[] life7_5;
    forward_join_19: {
    forward_join_14: {
    forward_join_13: {
    life5_3 = (moom.d9.X ^ 36624410056262L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3216_0 = this;
    if (!((life7_5 != null))) {
        forwardValue3216_14_0 = spill3216_0;
        break forward_join_14;
    }
    if (!((!((moom.d9)(spill3216_0)).V))) {
        break forward_join_13;
    }
    forwardValue3216_19_0 = 0;
    break forward_join_19;
    }
    forwardValue3216_14_0 = this;
    }
    forwardValue3216_19_0 = ((moom.d9)(forwardValue3216_14_0)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.bs)(p3)));
    }
    return forwardValue3216_19_0;
}


private void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.world.World lexicalValue1098_16_0;
    moom.DT lexicalValue1098_16_1;
    net.minecraft.world.World spill1098_0;
    moom.DT spill1098_1;
    long life3_3;
    int[] life5_5;
    moom.bs[] life6_25;
    int life7_28;
    int life8_30;
    moom.bs life9_37;
    lexical_join_41: {
    lexical_join_16: {
    life3_3 = (moom.d9.X ^ 13085043677858L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1098_0 = p0;
    spill1098_1 = p1;
    if (!((life5_5 != null))) {
        lexicalValue1098_16_0 = spill1098_0;
        lexicalValue1098_16_1 = spill1098_1;
        break lexical_join_16;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1098_0)).a__fE(((moom.DT)(spill1098_1))))).a__ch() == this))) {
        break lexical_join_41;
    }
    lexicalValue1098_16_0 = p0;
    lexicalValue1098_16_1 = p1;
    }
    ((net.minecraft.world.World)(lexicalValue1098_16_0)).b(((moom.DT)(lexicalValue1098_16_1)), ((net.minecraft.block.Block)(this)));
    life6_25 = moom.bs.values();
    life7_28 = (life6_25).length;
    life8_30 = 0;
    lexical_cycle_25: while (true) {
    if (!((life8_30 < life7_28))) {
        break lexical_join_41;
    }
    life9_37 = (life6_25)[life8_30];
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_37))))), ((net.minecraft.block.Block)(this)));
    life8_30 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    int[] life6_5;
    java.util.Iterator life7_25;
    moom.bs life8_32;
    moom.bs life8_55;
    moom.bs life8_78;
    moom.DT life9_82;
    lexical_join_93: {
    lexical_join_60: {
    lexical_join_57: {
    lexical_join_40: {
    lexical_join_37: {
    lexical_join_17: {
    life4_3 = (moom.d9.X ^ 72376377876285L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((life6_5 != null))) {
        break lexical_join_17;
    }
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break lexical_join_93;
    }
    ((moom.d9)(this)).a__fE(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    life7_25 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.VERTICAL)).iterator();
    lexical_cycle_20: while (true) {
    if (!(((java.util.Iterator)(life7_25)).hasNext())) {
        break lexical_join_37;
    }
    life8_32 = ((moom.bs)(((java.util.Iterator)(life7_25)).next()));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_32))))), ((net.minecraft.block.Block)(this)));
    if (!((life6_5 != null))) {
        break lexical_join_40;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    life7_25 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    }
    lexical_cycle_40: while (true) {
    if (!(((java.util.Iterator)(life7_25)).hasNext())) {
        break lexical_join_57;
    }
    life8_55 = ((moom.bs)(((java.util.Iterator)(life7_25)).next()));
    ((moom.d9)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_55))))));
    if (!((life6_5 != null))) {
        break lexical_join_60;
    }
    if (!((life6_5 == null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    life7_25 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    }
    lexical_cycle_60: while (true) {
    lexical_join_91: {
    lexical_join_86: {
    lexical_join_84: {
    if (!(((java.util.Iterator)(life7_25)).hasNext())) {
        break lexical_join_93;
    }
    life8_78 = ((moom.bs)(((java.util.Iterator)(life7_25)).next()));
    life9_82 = ((moom.DT)(p1)).a(((moom.bs)(life8_78)));
    if (!((life6_5 != null))) {
        break lexical_join_84;
    }
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_82))))).a__ch())).e__Boolean())) {
        break lexical_join_86;
    }
    ((moom.d9)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life9_82)).a__DT())));
    }
    if (!((life6_5 == null))) {
        break lexical_join_91;
    }
    }
    ((moom.d9)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life9_82)).b__DT())));
    }
    if (!((life6_5 == null))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_a835b1434d3870(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27056;
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
            throw new RuntimeException("moom/d9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Z[var3] = var15;
      }

      return Z[var3];
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.d9)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d9.U)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
long l = moom.d9.X ^ 0x6EDCB8A13B09L;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = World.a(p0, p1.b__DT());
        if (nArray != null) {
            bl = bl || p0.a__fE(p1.b__DT()).a__ch() == Blocks.aX;
        }
        return bl;
}


private boolean c(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue3219_45_0;
    int forwardValue3219_64_0;
    int forwardValue3219_68_0;
    int forwardValue3219_70_0;
    int[] spill3219_0;
    int spill3219_1;
    int spill3219_2;
    boolean spill3219_3;
    int spill3219_4;
    long life4_3;
    moom.DT life7_7;
    net.minecraft.block.state.IBlockState life8_12;
    net.minecraft.block.Block life9_15;
    int[] life6_16;
    int life10_19;
    int life11_26;
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_64: {
    forward_join_56: {
    forward_join_45: {
    forward_join_42: {
    life4_3 = (moom.d9.X ^ 62809610466912L);
    life7_7 = ((moom.DT)(p1)).a(((moom.bs)(p2)));
    spill3219_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_12 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life7_7)));
    life9_15 = ((net.minecraft.block.state.IBlockState)(life8_12)).a__ch();
    life6_16 = spill3219_0;
    life10_19 = ((((net.minecraft.block.Block)(life9_15)).e__Boolean()) ? 1 : 0);
    life11_26 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).e__Boolean()) ? 1 : 0);
    spill3219_1 = life11_26;
    if (!((life6_16 != null))) {
        forwardValue3219_45_0 = spill3219_1;
        break forward_join_45;
    }
    if (!((spill3219_1 == 0))) {
        break forward_join_42;
    }
    spill3219_2 = life10_19;
    if (!((life6_16 != null))) {
        forwardValue3219_45_0 = spill3219_2;
        break forward_join_45;
    }
    if (!((spill3219_2 != 0))) {
        break forward_join_42;
    }
    spill3219_3 = __sourceExactCall_ce2daf07b18f03(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life7_7)).a__DT())));
    if (!((life6_16 != null))) {
        forwardValue3219_68_0 = ((spill3219_3) ? 1 : 0);
        break forward_join_68;
    }
    if (!((!spill3219_3))) {
        break forward_join_67;
    }
    }
    forwardValue3219_45_0 = ((__sourceExactCall_203d22c83986b5(((net.minecraft.block.state.IBlockState)(life8_12)), ((moom.bs)(p2)))) ? 1 : 0);
    }
    if (!((life6_16 != null))) {
        forwardValue3219_68_0 = forwardValue3219_45_0;
        break forward_join_68;
    }
    if (!((forwardValue3219_45_0 == 0))) {
        break forward_join_67;
    }
    if (!((life9_15 == net.minecraft.init.Blocks.a2))) {
        break forward_join_56;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life8_12)).a(((net.minecraft.block.properties.IProperty)(moom.dm.Q))) != p2))) {
        break forward_join_67;
    }
    }
    spill3219_4 = life10_19;
    if (!((life6_16 != null))) {
        forwardValue3219_64_0 = spill3219_4;
        break forward_join_64;
    }
    if (!((spill3219_4 == 0))) {
        break forward_join_69;
    }
    forwardValue3219_64_0 = ((__sourceExactCall_ce2daf07b18f03(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(life7_7)).b__DT())))) ? 1 : 0);
    }
    if (!((life6_16 != null))) {
        forwardValue3219_68_0 = forwardValue3219_64_0;
        break forward_join_68;
    }
    if (!((forwardValue3219_64_0 != 0))) {
        break forward_join_69;
    }
    }
    forwardValue3219_68_0 = 1;
    }
    forwardValue3219_70_0 = forwardValue3219_68_0;
    break forward_join_70;
    }
    forwardValue3219_70_0 = 0;
    }
    return ((forwardValue3219_70_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3221_18_0;
    int[] spill3221_0;
    int spill3221_1;
    long life5_3;
    int life8_10;
    int[] life7_11;
    double life9_35;
    double life11_42;
    double life13_56;
    float life15_61;
    float life16_67;
    float life17_77;
    float life18_87;
    forward_join_96: {
    forward_join_18: {
    life5_3 = (moom.d9.X ^ 5107435517596L);
    spill3221_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue();
    life7_11 = spill3221_0;
    spill3221_1 = life8_10;
    if (!((life7_11 != null))) {
        forwardValue3221_18_0 = spill3221_1;
        break forward_join_18;
    }
    if (!((spill3221_1 != 0))) {
        break forward_join_96;
    }
    forwardValue3221_18_0 = ((moom.DT)(p1)).a();
    }
    life9_35 = ((((double) forwardValue3221_18_0) + 0x1.0p-1d) + ((((double) ((java.util.Random)(p3)).nextFloat()) - 0x1.0p-1d) * 0x1.999999999999ap-3d));
    life11_42 = ((double) (((float) ((moom.DT)(p1)).b()) + 0x1.0p-4f));
    life13_56 = ((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d) + ((((double) ((java.util.Random)(p3)).nextFloat()) - 0x1.0p-1d) * 0x1.999999999999ap-3d));
    life15_61 = (((float) life8_10) / 0x1.ep3f);
    life16_67 = ((life15_61 * 0x1.333334p-1f) + 0x1.99999ap-2f);
    life17_77 = java.lang.Math.max(((float)(0x0.0p0f)), ((float)((((life15_61 * life15_61) * 0x1.666666p-1f) - 0x1.0p-1f))));
    life18_87 = java.lang.Math.max(((float)(0x0.0p0f)), ((float)((((life15_61 * life15_61) * 0x1.333334p-1f) - 0x1.666666p-1f))));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.REDSTONE)), ((double)(life9_35)), ((double)(life11_42)), ((double)(life13_56)), ((double)(((double) life16_67))), ((double)(((double) life17_77))), ((double)(((double) life18_87))), ((int[])(new int[0])));
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int[] spill1100_0;
    long life4_3;
    int[] life6_10;
    moom.bs[] life7_15;
    int life8_18;
    int life9_20;
    moom.bs life10_27;
    java.util.Iterator life7_50;
    moom.bs life8_57;
    moom.bs life8_80;
    moom.DT life9_84;
    lexical_join_101: {
    lexical_join_68: {
    lexical_join_65: {
    lexical_join_45: {
    lexical_join_39: {
    life4_3 = (moom.d9.X ^ 41552828487327L);
    spill1100_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life6_10 = spill1100_0;
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break lexical_join_101;
    }
    life7_15 = moom.bs.values();
    life8_18 = (life7_15).length;
    life9_20 = 0;
    lexical_cycle_21: while (true) {
    if (!((life9_20 < life8_18))) {
        break lexical_join_39;
    }
    life10_27 = (life7_15)[life9_20];
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life10_27))))), ((net.minecraft.block.Block)(this)));
    life9_20 += 1;
    if (!((life6_10 != null))) {
        break lexical_join_45;
    }
    if (!((life6_10 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    ((moom.d9)(this)).a__fE(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    life7_50 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_48: while (true) {
    if (!(((java.util.Iterator)(life7_50)).hasNext())) {
        break lexical_join_65;
    }
    life8_57 = ((moom.bs)(((java.util.Iterator)(life7_50)).next()));
    ((moom.d9)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life8_57))))));
    if (!((life6_10 != null))) {
        break lexical_join_68;
    }
    if (!((life6_10 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    life7_50 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    }
    lexical_cycle_68: while (true) {
    lexical_join_99: {
    lexical_join_94: {
    lexical_join_92: {
    if (!(((java.util.Iterator)(life7_50)).hasNext())) {
        break lexical_join_101;
    }
    life8_80 = ((moom.bs)(((java.util.Iterator)(life7_50)).next()));
    life9_84 = ((moom.DT)(p1)).a(((moom.bs)(life8_80)));
    if (!((life6_10 != null))) {
        break lexical_join_92;
    }
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_84))))).a__ch())).e__Boolean())) {
        break lexical_join_94;
    }
    ((moom.d9)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life9_84)).a__DT())));
    }
    if (!((life6_10 == null))) {
        break lexical_join_99;
    }
    }
    ((moom.d9)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life9_84)).b__DT())));
    }
    if (!((life6_10 == null))) { continue lexical_cycle_68; }
    break lexical_cycle_68;
    }
    }
    return;
}


public boolean l() {
return ((((this.V) ? 1 : 0)) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d9.Q, moom.d9.R, moom.d9.S, moom.d9.T, moom.d9.U});
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.aC;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int lexicalValue1095_18_0;
    int lexicalValue1095_24_0;
    int lexicalValue1095_56_0;
    int lexicalValue1095_62_0;
    int lexicalValue1095_75_0;
    int lexicalValue1095_95_0;
    boolean spill1095_0;
    int spill1095_1;
    boolean spill1095_2;
    boolean spill1095_3;
    boolean spill1095_4;
    boolean spill1095_5;
    long life5_3;
    int[] life7_5;
    int life8_23;
    java.util.EnumSet life9_42;
    java.util.Iterator life10_45;
    moom.bs life11_52;
    lexical_join_95: {
    lexical_join_94: {
    lexical_join_75: {
    lexical_join_72: {
    lexical_join_62: {
    lexical_join_59: {
    lexical_join_30: {
    lexical_join_25: {
    lexical_join_24: {
    lexical_join_18: {
    lexical_join_13: {
    life5_3 = (moom.d9.X ^ 57377684515443L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1095_0 = this.V;
    if (!((life7_5 != null))) {
        lexicalValue1095_18_0 = ((spill1095_0) ? 1 : 0);
        break lexical_join_18;
    }
    if (!((!spill1095_0))) {
        break lexical_join_13;
    }
    return 0;
    }
    lexicalValue1095_18_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue();
    }
    life8_23 = lexicalValue1095_18_0;
    spill1095_1 = life8_23;
    if (!((life7_5 != null))) {
        lexicalValue1095_24_0 = spill1095_1;
        break lexical_join_24;
    }
    if (!((spill1095_1 == 0))) {
        break lexical_join_25;
    }
    lexicalValue1095_24_0 = 0;
    }
    return lexicalValue1095_24_0;
    }
    if (!((p3 == moom.bs.UP))) {
        break lexical_join_30;
    }
    return life8_23;
    }
    life9_42 = java.util.EnumSet.noneOf(((java.lang.Class)(moom.bs.class)));
    life10_45 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_36: while (true) {
    lexical_join_57: {
    lexical_join_56: {
    if (!(((java.util.Iterator)(life10_45)).hasNext())) {
        break lexical_join_59;
    }
    life11_52 = ((moom.bs)(((java.util.Iterator)(life10_45)).next()));
    spill1095_2 = ((moom.d9)(this)).c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(life11_52)));
    if (!((life7_5 != null))) {
        lexicalValue1095_62_0 = ((spill1095_2) ? 1 : 0);
        break lexical_join_62;
    }
    if (!((life7_5 != null))) {
        lexicalValue1095_56_0 = ((spill1095_2) ? 1 : 0);
        break lexical_join_56;
    }
    if (!(spill1095_2)) {
        break lexical_join_57;
    }
    lexicalValue1095_56_0 = ((((java.util.EnumSet)(life9_42)).add(((java.lang.Object)(life11_52)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1095_56_0);
    }
    if (!((life7_5 == null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    lexicalValue1095_62_0 = ((((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p3)).a__bt())).b__Boolean()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1095_75_0 = lexicalValue1095_62_0;
        break lexical_join_75;
    }
    if (!((lexicalValue1095_62_0 != 0))) {
        break lexical_join_72;
    }
    spill1095_3 = ((java.util.EnumSet)(life9_42)).isEmpty();
    if (!((life7_5 != null))) {
        lexicalValue1095_75_0 = ((spill1095_3) ? 1 : 0);
        break lexical_join_75;
    }
    if (!(spill1095_3)) {
        break lexical_join_72;
    }
    return life8_23;
    }
    lexicalValue1095_75_0 = ((((java.util.EnumSet)(life9_42)).contains(((java.lang.Object)(p3)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1095_95_0 = lexicalValue1095_75_0;
        break lexical_join_95;
    }
    if (!((lexicalValue1095_75_0 != 0))) {
        break lexical_join_94;
    }
    spill1095_4 = ((java.util.EnumSet)(life9_42)).contains(((java.lang.Object)(((moom.bs)(p3)).e__bs())));
    if (!((life7_5 != null))) {
        lexicalValue1095_95_0 = ((spill1095_4) ? 1 : 0);
        break lexical_join_95;
    }
    if (!((!spill1095_4))) {
        break lexical_join_94;
    }
    spill1095_5 = ((java.util.EnumSet)(life9_42)).contains(((java.lang.Object)(((moom.bs)(p3)).b__bs())));
    if (!((life7_5 != null))) {
        lexicalValue1095_95_0 = ((spill1095_5) ? 1 : 0);
        break lexical_join_95;
    }
    if (!((!spill1095_5))) {
        break lexical_join_94;
    }
    return life8_23;
    }
    lexicalValue1095_95_0 = 0;
    }
    return lexicalValue1095_95_0;
}


private net.minecraft.block.BlockRedstoneWire$EnumAttachPosition a(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue3210_29_0;
    net.minecraft.block.state.IBlockState forwardValue3210_42_0;
    net.minecraft.block.Block forwardValue3210_43_0;
    int forwardValue3210_51_0;
    int forwardValue3210_59_0;
    net.minecraft.block.BlockRedstoneWire$EnumAttachPosition forwardValue3210_63_0;
    int[] spill3210_0;
    boolean spill3210_1;
    net.minecraft.block.Block spill3210_2;
    net.minecraft.block.state.IBlockState spill3210_3;
    boolean spill3210_4;
    long life4_3;
    moom.DT life7_8;
    int[] life6_9;
    net.minecraft.block.Block life8_16;
    net.minecraft.block.Block life9_61;
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_59: {
    forward_join_51: {
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_29: {
    life4_3 = (moom.d9.X ^ 95246702383462L);
    spill3210_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((moom.DT)(p1)).a(((moom.bs)(p2)));
    life6_9 = spill3210_0;
    life8_16 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(p2)))))))).a__ch();
    spill3210_1 = __sourceExactCall_203d22c83986b5(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life7_8))))), ((moom.bs)(p2)));
    if (!((life6_9 != null))) {
        forwardValue3210_29_0 = ((spill3210_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill3210_1))) {
        break forward_join_64;
    }
    spill3210_2 = life8_16;
    if (!((life6_9 != null))) {
        forwardValue3210_43_0 = spill3210_2;
        break forward_join_43;
    }
    forwardValue3210_29_0 = ((((net.minecraft.block.Block)(spill3210_2)).d__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3210_29_0 == 0))) {
        break forward_join_38;
    }
    spill3210_3 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(life7_8)).b__DT())));
    if (!((life6_9 != null))) {
        forwardValue3210_42_0 = spill3210_3;
        break forward_join_42;
    }
    if (!((!__sourceExactCall_55c3f860812e1e(((net.minecraft.block.state.IBlockState)(spill3210_3)))))) {
        break forward_join_64;
    }
    }
    forwardValue3210_42_0 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT())));
    }
    forwardValue3210_43_0 = ((net.minecraft.block.state.IBlockState)(forwardValue3210_42_0)).a__ch();
    }
    life9_61 = forwardValue3210_43_0;
    spill3210_4 = ((net.minecraft.block.Block)(life9_61)).d__Boolean();
    if (!((life6_9 != null))) {
        forwardValue3210_51_0 = ((spill3210_4) ? 1 : 0);
        break forward_join_51;
    }
    if (!((!spill3210_4))) {
        break forward_join_62;
    }
    forwardValue3210_51_0 = ((((net.minecraft.block.Block)(life8_16)).d__Boolean()) ? 1 : 0);
    }
    if (!((life6_9 != null))) {
        forwardValue3210_59_0 = forwardValue3210_51_0;
        break forward_join_59;
    }
    if (!((forwardValue3210_51_0 != 0))) {
        break forward_join_62;
    }
    forwardValue3210_59_0 = ((__sourceExactCall_55c3f860812e1e(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(life7_8)).a__DT()))))))) ? 1 : 0);
    }
    if (!((forwardValue3210_59_0 != 0))) {
        break forward_join_62;
    }
    forwardValue3210_63_0 = net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.UP;
    break forward_join_63;
    }
    forwardValue3210_63_0 = net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.NONE;
    }
    return forwardValue3210_63_0;
    }
    return net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.SIDE;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d9.T)), ((java.lang.Comparable)(((moom.d9)(this)).a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((moom.bs)(moom.bs.WEST))))));
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d9.R)), ((java.lang.Comparable)(((moom.d9)(this)).a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((moom.bs)(moom.bs.EAST))))));
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d9.Q)), ((java.lang.Comparable)(((moom.d9)(this)).a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((moom.bs)(moom.bs.NORTH))))));
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d9.S)), ((java.lang.Comparable)(((moom.d9)(this)).a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)), ((moom.bs)(moom.bs.SOUTH))))));
    return p0;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
long local4 = (moom.d9.X ^ 48920436235445L);
    java.lang.Object local6 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    return ((((net.minecraft.block.state.IBlockState)(local6)).a__ch() != this) ? super.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((int)(p2))) : ((moom.d9)(this)).a__sourceReturn_0f7a48eca2(((int)(((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(local6)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue()))));
}


private net.minecraft.block.state.IBlockState a__fE(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int[] spill1097_0;
    long life4_3;
    net.minecraft.block.state.IBlockState life3_11;
    int[] life6_12;
    java.util.ArrayList life7_16;
    java.util.Iterator life8_22;
    moom.DT life9_29;
    lexical_join_36: {
    life4_3 = (moom.d9.X ^ 135094599962871L);
    spill1097_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life3_11 = ((moom.d9)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life6_12 = spill1097_0;
    life7_16 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(this.W)));
    ((java.util.Set)(this.W)).clear();
    life8_22 = ((java.util.List)(life7_16)).iterator();
    lexical_cycle_23: while (true) {
    if (!(((java.util.Iterator)(life8_22)).hasNext())) {
        break lexical_join_36;
    }
    life9_29 = ((moom.DT)(((java.util.Iterator)(life8_22)).next()));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(life9_29)), ((net.minecraft.block.Block)(this)));
    if (!((life6_12 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return life3_11;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.aC;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3214_15_0;
    int forwardValue3214_35_0;
    boolean spill3214_0;
    long life5_3;
    int[] life7_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_26: {
    forward_join_15: {
    life5_3 = (moom.d9.X ^ 97535458819197L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3214_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3214_15_0 = ((spill3214_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill3214_0))) {
        break forward_join_36;
    }
    forwardValue3214_15_0 = ((((moom.d9)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3214_35_0 = forwardValue3214_15_0;
        break forward_join_35;
    }
    if (!((forwardValue3214_15_0 != 0))) {
        break forward_join_26;
    }
    ((moom.d9)(this)).a__fE(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if (!((life7_5 == null))) {
        break forward_join_36;
    }
    }
    ((moom.d9)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3214_35_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3214_35_0);
    }
    return;
}


private int a__sourceReturn_4a3edb3151(net.minecraft.world.World p0, moom.DT p1, int p2) {
net.minecraft.block.state.IBlockState forwardValue3212_19_0;
    net.minecraft.block.state.IBlockState spill3212_0;
    long life4_3;
    int[] life6_5;
    int life7_28;
    forward_join_19: {
    forward_join_16: {
    life4_3 = (moom.d9.X ^ 136025610247724L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3212_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue3212_19_0 = spill3212_0;
        break forward_join_19;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3212_0)).a__ch() != this))) {
        break forward_join_16;
    }
    return p2;
    }
    forwardValue3212_19_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    }
    life7_28 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(forwardValue3212_19_0)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue();
    return java.lang.Math.max(((int)(life7_28)), ((int)(p2)));
}


private net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
int lexicalValue1096_46_0;
    int lexicalValue1096_78_0;
    int lexicalValue1096_80_0;
    int lexicalValue1096_96_0;
    int lexicalValue1096_114_0;
    int lexicalValue1096_125_0;
    int lexicalValue1096_133_0;
    int lexicalValue1096_137_0;
    int lexicalValue1096_142_0;
    int lexicalValue1096_153_0;
    int lexicalValue1096_160_0;
    int lexicalValue1096_160_1;
    int lexicalValue1096_168_0;
    int lexicalValue1096_175_0;
    int lexicalValue1096_187_0;
    int lexicalValue1096_187_1;
    int[] spill1096_0;
    int spill1096_1;
    int spill1096_2;
    int spill1096_3;
    int spill1096_4;
    int spill1096_5;
    int spill1096_6;
    boolean spill1096_7;
    int spill1096_8;
    int spill1096_9;
    int spill1096_10;
    int spill1096_11;
    long life5_3;
    net.minecraft.block.state.IBlockState life8_6;
    int life9_12;
    int[] life7_13;
    int life10_15;
    int life10_21;
    int life11_28;
    int life12_55;
    java.util.Iterator life13_58;
    moom.bs life14_65;
    moom.DT life15_69;
    int life16_104;
    moom.bs[] life13_306;
    int life14_309;
    int life15_311;
    moom.bs life16_318;
    lexical_join_236: {
    lexical_join_212: {
    lexical_join_207: {
    lexical_join_187: {
    lexical_join_185: {
    lexical_join_176: {
    lexical_join_175: {
    lexical_join_174: {
    lexical_join_168: {
    lexical_join_167: {
    lexical_join_160: {
    lexical_join_156: {
    lexical_join_46: {
    lexical_join_45: {
    life5_3 = (moom.d9.X ^ 139191924430421L);
    spill1096_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_6 = p3;
    life9_12 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.d9.U))))))).intValue();
    life7_13 = spill1096_0;
    life10_15 = 0;
    life10_21 = ((moom.d9)(this)).a__sourceReturn_4a3edb3151(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((int)(life10_15)));
    this.V = ((boolean)(false));
    life11_28 = ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)));
    this.V = ((boolean)(true));
    spill1096_1 = life11_28;
    if (!((life7_13 != null))) {
        lexicalValue1096_46_0 = spill1096_1;
        break lexical_join_46;
    }
    if (!((spill1096_1 > 0))) {
        break lexical_join_45;
    }
    spill1096_2 = life11_28;
    if (!((life7_13 != null))) {
        lexicalValue1096_46_0 = spill1096_2;
        break lexical_join_46;
    }
    if (!((spill1096_2 > (life10_21 - 1)))) {
        break lexical_join_45;
    }
    life10_21 = life11_28;
    }
    lexicalValue1096_46_0 = 0;
    }
    life12_55 = lexicalValue1096_46_0;
    life13_58 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_50: while (true) {
    lexical_join_154: {
    lexical_join_153: {
    lexical_join_142: {
    lexical_join_137: {
    lexical_join_133: {
    lexical_join_128: {
    lexical_join_125: {
    lexical_join_114: {
    lexical_join_96: {
    lexical_join_91: {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_77: {
    if (!(((java.util.Iterator)(life13_58)).hasNext())) {
        break lexical_join_156;
    }
    life14_65 = ((moom.bs)(((java.util.Iterator)(life13_58)).next()));
    life15_69 = ((moom.DT)(p1)).a(((moom.bs)(life14_65)));
    spill1096_3 = ((moom.DT)(life15_69)).a();
    if (!((life7_13 != null))) {
        lexicalValue1096_78_0 = spill1096_3;
        break lexical_join_78;
    }
    spill1096_4 = ((moom.DT)(p2)).a();
    if (!((life7_13 != null))) {
        lexicalValue1096_160_0 = spill1096_3;
        lexicalValue1096_160_1 = spill1096_4;
        break lexical_join_160;
    }
    if (!((spill1096_3 == spill1096_4))) {
        break lexical_join_77;
    }
    spill1096_5 = ((moom.DT)(life15_69)).c();
    if (!((life7_13 != null))) {
        lexicalValue1096_78_0 = spill1096_5;
        break lexical_join_78;
    }
    if (!((spill1096_5 != ((moom.DT)(p2)).c()))) {
        break lexical_join_79;
    }
    }
    lexicalValue1096_78_0 = 1;
    }
    lexicalValue1096_80_0 = lexicalValue1096_78_0;
    break lexical_join_80;
    }
    lexicalValue1096_80_0 = 0;
    }
    life16_104 = lexicalValue1096_80_0;
    spill1096_6 = life16_104;
    if (!((life7_13 != null))) {
        lexicalValue1096_96_0 = spill1096_6;
        break lexical_join_96;
    }
    if (!((spill1096_6 != 0))) {
        break lexical_join_91;
    }
    life12_55 = ((moom.d9)(this)).a__sourceReturn_4a3edb3151(((net.minecraft.world.World)(p0)), ((moom.DT)(life15_69)), ((int)(life12_55)));
    }
    lexicalValue1096_96_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life15_69))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((life7_13 != null))) {
        lexicalValue1096_133_0 = lexicalValue1096_96_0;
        break lexical_join_133;
    }
    if (!((lexicalValue1096_96_0 != 0))) {
        break lexical_join_128;
    }
    spill1096_7 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).e__Boolean();
    if (!((life7_13 != null))) {
        lexicalValue1096_133_0 = ((spill1096_7) ? 1 : 0);
        break lexical_join_133;
    }
    if (!((!spill1096_7))) {
        break lexical_join_128;
    }
    spill1096_8 = life16_104;
    if (!((life7_13 != null))) {
        lexicalValue1096_114_0 = spill1096_8;
        break lexical_join_114;
    }
    if (!((spill1096_8 != 0))) {
        break lexical_join_154;
    }
    lexicalValue1096_114_0 = __sourceExactCall_83272ff1cb0754(((moom.DT)(p1)));
    }
    if (!((life7_13 != null))) {
        lexicalValue1096_125_0 = lexicalValue1096_114_0;
        break lexical_join_125;
    }
    if (!((lexicalValue1096_114_0 >= __sourceExactCall_83272ff1cb0754(((moom.DT)(p2)))))) {
        break lexical_join_154;
    }
    lexicalValue1096_125_0 = ((moom.d9)(this)).a__sourceReturn_4a3edb3151(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life15_69)).a__DT())), ((int)(life12_55)));
    }
    life12_55 = lexicalValue1096_125_0;
    if (!((life7_13 == null))) {
        break lexical_join_154;
    }
    }
    lexicalValue1096_133_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life15_69))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((life7_13 != null))) {
        lexicalValue1096_137_0 = lexicalValue1096_133_0;
        break lexical_join_137;
    }
    if (!((lexicalValue1096_133_0 == 0))) {
        break lexical_join_154;
    }
    lexicalValue1096_137_0 = life16_104;
    }
    if (!((life7_13 != null))) {
        lexicalValue1096_142_0 = lexicalValue1096_137_0;
        break lexical_join_142;
    }
    if (!((lexicalValue1096_137_0 != 0))) {
        break lexical_join_154;
    }
    lexicalValue1096_142_0 = __sourceExactCall_83272ff1cb0754(((moom.DT)(p1)));
    }
    if (!((life7_13 != null))) {
        lexicalValue1096_153_0 = lexicalValue1096_142_0;
        break lexical_join_153;
    }
    if (!((lexicalValue1096_142_0 <= __sourceExactCall_83272ff1cb0754(((moom.DT)(p2)))))) {
        break lexical_join_154;
    }
    lexicalValue1096_153_0 = ((moom.d9)(this)).a__sourceReturn_4a3edb3151(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life15_69)).b__DT())), ((int)(life12_55)));
    }
    life12_55 = lexicalValue1096_153_0;
    }
    if (!((life7_13 == null))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    spill1096_9 = life12_55;
    if (!((life7_13 != null))) {
        lexicalValue1096_168_0 = spill1096_9;
        break lexical_join_168;
    }
    lexicalValue1096_160_0 = spill1096_9;
    lexicalValue1096_160_1 = life10_21;
    }
    if (!((lexicalValue1096_160_0 > lexicalValue1096_160_1))) {
        break lexical_join_167;
    }
    life10_21 = (life12_55 - 1);
    if (!((life7_13 == null))) {
        break lexical_join_176;
    }
    }
    lexicalValue1096_168_0 = life10_21;
    }
    if (!((life7_13 != null))) {
        lexicalValue1096_175_0 = lexicalValue1096_168_0;
        break lexical_join_175;
    }
    if (!((lexicalValue1096_168_0 > 0))) {
        break lexical_join_174;
    }
    life10_21 += -1;
    if (!((life7_13 == null))) {
        break lexical_join_176;
    }
    }
    lexicalValue1096_175_0 = 0;
    }
    life10_21 = lexicalValue1096_175_0;
    }
    spill1096_10 = life11_28;
    spill1096_11 = (life10_21 - 1);
    if (!((life7_13 != null))) {
        lexicalValue1096_187_0 = spill1096_10;
        lexicalValue1096_187_1 = spill1096_11;
        break lexical_join_187;
    }
    if (!((spill1096_10 > spill1096_11))) {
        break lexical_join_185;
    }
    life10_21 = life11_28;
    }
    lexicalValue1096_187_0 = life9_12;
    lexicalValue1096_187_1 = life10_21;
    }
    if (!((lexicalValue1096_187_0 != lexicalValue1096_187_1))) {
        break lexical_join_236;
    }
    p3 = ((net.minecraft.block.state.IBlockState)(p3)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d9.U)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life10_21))))));
    if (!((life7_13 != null))) {
        break lexical_join_212;
    }
    if (!((((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))) == life8_6))) {
        break lexical_join_207;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p3)), ((int)(2)));
    }
    ((java.util.Set)(this.W)).add(((java.lang.Object)(p1)));
    }
    life13_306 = moom.bs.values();
    life14_309 = (life13_306).length;
    life15_311 = 0;
    lexical_cycle_219: while (true) {
    if (!((life15_311 < life14_309))) {
        break lexical_join_236;
    }
    life16_318 = (life13_306)[life15_311];
    ((java.util.Set)(this.W)).add(((java.lang.Object)(((moom.DT)(p1)).a(((moom.bs)(life16_318))))));
    life15_311 += 1;
    if (!((life7_13 == null))) { continue lexical_cycle_219; }
    break lexical_cycle_219;
    }
    }
    return p3;
}


protected static boolean a(net.minecraft.block.state.IBlockState p0, moom.bs p1) {
moom.bs forwardValue3209_33_0;
    moom.bs forwardValue3209_33_1;
    int forwardValue3209_37_0;
    int forwardValue3209_40_0;
    int forwardValue3209_46_0;
    int[] spill3209_0;
    boolean spill3209_1;
    moom.bs spill3209_2;
    moom.bs spill3209_3;
    long life2_3;
    net.minecraft.block.Block life5_7;
    int[] life4_8;
    moom.bs life6_29;
    forward_join_46: {
    forward_join_45: {
    forward_join_40: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_34: {
    forward_join_33: {
    forward_join_14: {
    life2_3 = (moom.d9.X ^ 139898165435459L);
    spill3209_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    life4_8 = spill3209_0;
    if (!((life5_7 == net.minecraft.init.Blocks.af))) {
        break forward_join_14;
    }
    return ((1) != 0);
    }
    spill3209_1 = ((net.minecraft.block.BlockRedstoneRepeater)(net.minecraft.init.Blocks.a1)).d(((net.minecraft.block.Block)(life5_7)));
    if (!((life4_8 != null))) {
        forwardValue3209_40_0 = ((spill3209_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill3209_1)) {
        break forward_join_38;
    }
    life6_29 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockRedstoneRepeater.Q)))));
    spill3209_2 = life6_29;
    spill3209_3 = p1;
    if (!((life4_8 != null))) {
        forwardValue3209_33_0 = spill3209_2;
        forwardValue3209_33_1 = spill3209_3;
        break forward_join_33;
    }
    if (!((spill3209_2 != spill3209_3))) {
        break forward_join_34;
    }
    forwardValue3209_33_0 = ((moom.bs)(life6_29)).a__bs();
    forwardValue3209_33_1 = p1;
    }
    if (!((forwardValue3209_33_0 == forwardValue3209_33_1))) {
        break forward_join_36;
    }
    }
    forwardValue3209_37_0 = 1;
    break forward_join_37;
    }
    forwardValue3209_37_0 = 0;
    }
    return ((forwardValue3209_37_0) != 0);
    }
    forwardValue3209_40_0 = ((((net.minecraft.block.Block)(life5_7)).l()) ? 1 : 0);
    }
    if (!((forwardValue3209_40_0 != 0))) {
        break forward_join_45;
    }
    if (!((p1 != null))) {
        break forward_join_45;
    }
    forwardValue3209_46_0 = 1;
    break forward_join_46;
    }
    forwardValue3209_46_0 = 0;
    }
    return ((forwardValue3209_46_0) != 0);
}


private int a__sourceReturn_0f7a48eca2(int p0) {
int forwardValue3208_48_0;
    int forwardValue3208_64_0;
    int[] spill3208_0;
    int spill3208_1;
    long life2_3;
    float life5_8;
    float life6_15;
    int[] life4_16;
    float life7_28;
    float life8_36;
    int life9_70;
    int life10_82;
    int life11_94;
    forward_join_64: {
    forward_join_53: {
    forward_join_48: {
    forward_join_45: {
    forward_join_21: {
    life2_3 = (moom.d9.X ^ 137057298072007L);
    life5_8 = (((float) p0) / 0x1.ep3f);
    spill3208_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_15 = ((life5_8 * 0x1.333334p-1f) + 0x1.99999ap-2f);
    life4_16 = spill3208_0;
    if (!((p0 == 0))) {
        break forward_join_21;
    }
    life6_15 = 0x1.333334p-2f;
    }
    life7_28 = (((life5_8 * life5_8) * 0x1.666666p-1f) - 0x1.0p-1f);
    life8_36 = (((life5_8 * life5_8) * 0x1.333334p-1f) - 0x1.666666p-1f);
    spill3208_1 = recovery.source.CarrierOps.fcmpg(((float)(life7_28)), ((float)(0x0.0p0f)));
    if (!((life4_16 != null))) {
        forwardValue3208_48_0 = spill3208_1;
        break forward_join_48;
    }
    if (!((spill3208_1 < 0))) {
        break forward_join_45;
    }
    life7_28 = 0x0.0p0f;
    }
    forwardValue3208_48_0 = recovery.source.CarrierOps.fcmpg(((float)(life8_36)), ((float)(0x0.0p0f)));
    }
    if (!((life4_16 != null))) {
        forwardValue3208_64_0 = forwardValue3208_48_0;
        break forward_join_64;
    }
    if (!((forwardValue3208_48_0 < 0))) {
        break forward_join_53;
    }
    life8_36 = 0x0.0p0f;
    }
    forwardValue3208_64_0 = moom.Dr.a(((int)(((int) (life6_15 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_5c51e7cdc795_invokedynamic3208_4(13766, (3671410753938609236L ^ life2_3)))));
    }
    life9_70 = forwardValue3208_64_0;
    life10_82 = moom.Dr.a(((int)(((int) (life7_28 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_5c51e7cdc795_invokedynamic3208_6(17785, (3959824547704579305L ^ life2_3)))));
    life11_94 = moom.Dr.a(((int)(((int) (life8_36 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_5c51e7cdc795_invokedynamic3208_8(17785, (3959824547704579305L ^ life2_3)))));
    return (((__sourceIntrinsic_5c51e7cdc795_invokedynamic3208_10(14579, (6088668411259705696L ^ life2_3)) | (life9_70 << __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_11(26964, (7482731650180745409L ^ life2_3)))) | (life10_82 << __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_12(7853, (1052684026427801401L ^ life2_3)))) | life11_94);
}


protected static boolean a__sourceReturn_ca116c2731(net.minecraft.block.state.IBlockState p0) {
return (__sourceIntrinsic_booleanComparison((__sourceExactCall_203d22c83986b5(((net.minecraft.block.state.IBlockState)(p0)), ((moom.bs)(null))))) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1147_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7245_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_invokedynamic3208_12(int a0, long a1) throws E;

private static native boolean __sourceExactCall_55c3f860812e1e(net.minecraft.block.state.IBlockState p0);
private static native int __sourceExactCall_a835b1434d3870(int p0, long p1);
private static native boolean __sourceExactCall_ce2daf07b18f03(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native boolean __sourceExactCall_203d22c83986b5(net.minecraft.block.state.IBlockState p0, moom.bs p1);

private static native int __sourceExactCall_83272ff1cb0754(moom.DT p0);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
