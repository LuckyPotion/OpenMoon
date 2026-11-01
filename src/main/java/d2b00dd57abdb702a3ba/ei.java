package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class ei extends net.minecraft.block.Block {

public static moom.fw<moom.ak> Q;

private static long T;

private static long[] V;

private static java.lang.Integer[] W;

private static java.util.Map X;

public ei(moom.fn p0) { super((moom.fn)null); }


private static void __sourceConstructorBody_3bbdad1cc3826d29(moom.ei receiver, moom.fn p0) throws Throwable {

moom.ei __initValue642_20_0;

    long local2_life2;

    int[] local4_life6;

    init_join_27: {

    init_join_20: {

    init_join_19: {

    local2_life2 = (moom.ei.T ^ 89530869558953L);

    int[] __sourceSpill642_4 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();

    moom.ei.__sourceConstructorInit_3bbdad1cc3826d29_0(((moom.ei)(receiver)), ((moom.fn)(p0)));

    local4_life6 = __sourceSpill642_4;

    moom.ei __sourceSpill642_7 = receiver;

    if (!((local4_life6 != null))) {

        __initValue642_20_0 = __sourceSpill642_7;

        break init_join_20;

    }

    if (!(((moom.ei)(__sourceSpill642_7)).s())) {

        break init_join_19;

    }

    ((moom.ei)(receiver)).r = ((boolean)(true));

    if (!((local4_life6 == null))) {

        break init_join_27;

    }

    }

    __initValue642_20_0 = receiver;

    }

    ((moom.ei)(__initValue642_20_0)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(1056964608)), ((float)(0x1.0p0f)));

    }

    ((moom.ei)(receiver)).b(((int)(__sourceIntrinsic_3bbdad1cc3826d29_originalDynamicSite642_13(17120, (6801381581731944675L ^ local2_life2)))));

    return;

}



static {
T = ((long)(((moom._a)(moom._c.a(((long)(-248858147311934471L)), ((long)(5430979468162025409L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134376862539270L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ei.T ^ 8556034394986L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill830_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill830_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill830_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill830_14 = new byte[8];
    (__sourceSpill830_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill830_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation830_16 = __sourceSpill830_14;
    ((javax.crypto.Cipher)(__sourceSpill830_11)).init(((int)(__sourceSpill830_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill830_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation830_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ãRmLÎÛ \022?×#b\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill830_25 = local6_life21;
        int __sourceSpill830_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill830_25)).substring(((int)(__sourceSpill830_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill830_30 = local8_life19;
        int __sourceSpill830_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill830_33 = new byte[8];
        (__sourceSpill830_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill830_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill830_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill830_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill830_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill830_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill830_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill830_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill830_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill830_34)).doFinal(((byte[])(__sourceSpill830_33)));
        (__sourceSpill830_30)[__sourceSpill830_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[2]));
    Q = ((moom.fw)(moom.fw.a(((java.lang.String)("half")), ((java.lang.Class)(moom.ak.class)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_3bbdad1cc3826d29_0(moom.ei a0, moom.fn a1) throws E;

protected static boolean b(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue3469_13_0;
    moom.ei forwardValue3469_13_1;
    net.minecraft.block.Block forwardValue3469_18_0;
    moom.ei forwardValue3469_18_1;
    int forwardValue3469_22_0;
    net.minecraft.block.Block spill3469_0;
    moom.ei spill3469_1;
    long life1_3;
    int[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.ei.T ^ 121450502892416L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3469_0 = p0;
    spill3469_1 = net.minecraft.init.Blocks.U;
    if (!((life3_5 != null))) {
        forwardValue3469_13_0 = spill3469_0;
        forwardValue3469_13_1 = spill3469_1;
        break forward_join_13;
    }
    if (!((spill3469_0 != spill3469_1))) {
        break forward_join_19;
    }
    forwardValue3469_13_0 = p0;
    forwardValue3469_13_1 = net.minecraft.init.Blocks.bB;
    }
    if (!((life3_5 != null))) {
        forwardValue3469_18_0 = forwardValue3469_13_0;
        forwardValue3469_18_1 = forwardValue3469_13_1;
        break forward_join_18;
    }
    if (!((forwardValue3469_13_0 != forwardValue3469_13_1))) {
        break forward_join_19;
    }
    forwardValue3469_18_0 = p0;
    forwardValue3469_18_1 = net.minecraft.init.Blocks.ct;
    }
    if (!((forwardValue3469_18_0 == forwardValue3469_18_1))) {
        break forward_join_21;
    }
    }
    forwardValue3469_22_0 = 1;
    break forward_join_22;
    }
    forwardValue3469_22_0 = 0;
    }
    return ((forwardValue3469_22_0) != 0);
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4207;
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
            throw new RuntimeException("moom/ei", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ei.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7544_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ei"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public abstract boolean s();

public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
((moom.ei)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    return;
}


public abstract java.lang.Object a(net.minecraft.item.ItemStack p0);

public abstract net.minecraft.block.properties.IProperty<?> a__ft();

public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
moom.bs forwardValue3465_32_0;
    moom.bs forwardValue3465_32_1;
    net.minecraft.block.state.IBlockState forwardValue3465_44_0;
    int[] spill3465_0;
    moom.bs spill3465_1;
    moom.bs spill3465_2;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_18;
    int[] life11_19;
    forward_join_44: {
    forward_join_40: {
    forward_join_38: {
    forward_join_32: {
    forward_join_25: {
    life9_3 = (moom.ei.T ^ 69300719301012L);
    spill3465_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_18 = ((net.minecraft.block.state.IBlockState)(super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6)), ((net.minecraft.entity.EntityLivingBase)(p7))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ei.Q)), ((java.lang.Comparable)(moom.ak.BOTTOM)));
    life11_19 = spill3465_0;
    if (!(((moom.ei)(this)).s())) {
        break forward_join_25;
    }
    forwardValue3465_44_0 = life12_18;
    break forward_join_44;
    }
    spill3465_1 = p2;
    spill3465_2 = moom.bs.DOWN;
    if (!((life11_19 != null))) {
        forwardValue3465_32_0 = spill3465_1;
        forwardValue3465_32_1 = spill3465_2;
        break forward_join_32;
    }
    if (!((spill3465_1 != spill3465_2))) {
        break forward_join_40;
    }
    forwardValue3465_32_0 = p2;
    forwardValue3465_32_1 = moom.bs.UP;
    }
    if (!((forwardValue3465_32_0 != forwardValue3465_32_1))) {
        break forward_join_38;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((double) p4))), ((double)(0x1.0p-1d))) <= 0))) {
        break forward_join_40;
    }
    }
    forwardValue3465_44_0 = life12_18;
    break forward_join_44;
    }
    forwardValue3465_44_0 = ((net.minecraft.block.state.IBlockState)(life12_18)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ei.Q)), ((java.lang.Comparable)(moom.ak.TOP)));
    }
    return forwardValue3465_44_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
moom.ei forwardValue3467_22_0;
    moom.ei spill3467_0;
    long life1_3;
    int[] life3_5;
    forward_join_29: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.ei.T ^ 137593702142502L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3467_0 = this;
    if (!((life3_5 != null))) {
        forwardValue3467_22_0 = spill3467_0;
        break forward_join_22;
    }
    if (!(((moom.ei)(spill3467_0)).s())) {
        break forward_join_21;
    }
    ((moom.ei)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life3_5 == null))) {
        break forward_join_29;
    }
    }
    forwardValue3467_22_0 = this;
    }
    ((moom.ei)(forwardValue3467_22_0)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    }
    return;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
moom.ei forwardValue3468_12_0;
    net.minecraft.block.state.IBlockState forwardValue3468_32_0;
    moom.ei spill3468_0;
    net.minecraft.block.state.IBlockState spill3468_1;
    long life3_3;
    int[] life5_5;
    net.minecraft.block.state.IBlockState life6_30;
    forward_join_54: {
    forward_join_46: {
    forward_join_32: {
    forward_join_21: {
    forward_join_12: {
    life3_3 = (moom.ei.T ^ 26220425856902L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3468_0 = this;
    if (!((life5_5 != null))) {
        forwardValue3468_12_0 = spill3468_0;
        break forward_join_12;
    }
    if (!(((moom.ei)(spill3468_0)).s())) {
        break forward_join_21;
    }
    forwardValue3468_12_0 = this;
    }
    ((moom.ei)(forwardValue3468_12_0)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        break forward_join_54;
    }
    }
    life6_30 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    spill3468_1 = life6_30;
    if (!((life5_5 != null))) {
        forwardValue3468_32_0 = spill3468_1;
        break forward_join_32;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3468_1)).a__ch() == this))) {
        break forward_join_54;
    }
    forwardValue3468_32_0 = life6_30;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3468_32_0)).a(((net.minecraft.block.properties.IProperty)(moom.ei.Q))) == moom.ak.TOP))) {
        break forward_join_46;
    }
    ((moom.ei)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        break forward_join_54;
    }
    }
    ((moom.ei)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    }
    return;
}


public int a(java.util.Random p0) {
int forwardValue3464_12_0;
    int forwardValue3464_14_0;
    boolean spill3464_0;
    long life2_3;
    int[] life4_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.ei.T ^ 106824851331414L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3464_0 = ((moom.ei)(this)).s();
    if (!((life4_5 != null))) {
        forwardValue3464_12_0 = ((spill3464_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill3464_0)) {
        break forward_join_13;
    }
    forwardValue3464_12_0 = 2;
    }
    forwardValue3464_14_0 = forwardValue3464_12_0;
    break forward_join_14;
    }
    forwardValue3464_14_0 = 1;
    }
    return forwardValue3464_14_0;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue3466_16_0;
    moom.bs forwardValue3466_24_0;
    moom.bs forwardValue3466_24_1;
    int forwardValue3466_34_0;
    net.minecraft.block.state.IBlockState forwardValue3466_55_0;
    int forwardValue3466_62_0;
    net.minecraft.block.state.IBlockState forwardValue3466_70_0;
    int forwardValue3466_77_0;
    moom.bs forwardValue3466_87_0;
    moom.bs forwardValue3466_87_1;
    int forwardValue3466_107_0;
    int forwardValue3466_109_0;
    moom.bs forwardValue3466_117_0;
    moom.bs forwardValue3466_117_1;
    int forwardValue3466_137_0;
    int forwardValue3466_139_0;
    boolean spill3466_0;
    moom.bs spill3466_1;
    moom.bs spill3466_2;
    boolean spill3466_3;
    net.minecraft.block.state.IBlockState spill3466_4;
    net.minecraft.block.state.IBlockState spill3466_5;
    moom.bs spill3466_6;
    moom.bs spill3466_7;
    boolean spill3466_8;
    boolean spill3466_9;
    int spill3466_10;
    moom.bs spill3466_11;
    moom.bs spill3466_12;
    boolean spill3466_13;
    boolean spill3466_14;
    int spill3466_15;
    long life4_3;
    int[] life6_5;
    moom.DT life7_57;
    net.minecraft.block.state.IBlockState life8_61;
    net.minecraft.block.state.IBlockState life9_65;
    int life10_88;
    int life11_111;
    forward_join_139: {
    forward_join_138: {
    forward_join_137: {
    forward_join_136: {
    forward_join_126: {
    forward_join_117: {
    forward_join_110: {
    forward_join_109: {
    forward_join_108: {
    forward_join_107: {
    forward_join_106: {
    forward_join_96: {
    forward_join_87: {
    forward_join_77: {
    forward_join_76: {
    forward_join_70: {
    forward_join_62: {
    forward_join_61: {
    forward_join_55: {
    forward_join_35: {
    forward_join_34: {
    forward_join_24: {
    forward_join_17: {
    forward_join_16: {
    life4_3 = (moom.ei.T ^ 47868230182058L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3466_0 = ((moom.ei)(this)).s();
    if (!((life6_5 != null))) {
        forwardValue3466_16_0 = ((spill3466_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill3466_0)) {
        break forward_join_17;
    }
    forwardValue3466_16_0 = ((super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)))) ? 1 : 0);
    }
    return ((forwardValue3466_16_0) != 0);
    }
    spill3466_1 = p2;
    spill3466_2 = moom.bs.UP;
    if (!((life6_5 != null))) {
        forwardValue3466_24_0 = spill3466_1;
        forwardValue3466_24_1 = spill3466_2;
        break forward_join_24;
    }
    if (!((spill3466_1 != spill3466_2))) {
        break forward_join_35;
    }
    forwardValue3466_24_0 = p2;
    forwardValue3466_24_1 = moom.bs.DOWN;
    }
    if (!((forwardValue3466_24_0 != forwardValue3466_24_1))) {
        break forward_join_35;
    }
    spill3466_3 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3466_34_0 = ((spill3466_3) ? 1 : 0);
        break forward_join_34;
    }
    if (!((!spill3466_3))) {
        break forward_join_35;
    }
    forwardValue3466_34_0 = 0;
    }
    return ((forwardValue3466_34_0) != 0);
    }
    life7_57 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs())));
    life8_61 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life9_65 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(life7_57)));
    spill3466_4 = life8_61;
    if (!((life6_5 != null))) {
        forwardValue3466_55_0 = spill3466_4;
        break forward_join_55;
    }
    if (!(moom.ei.b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill3466_4)).a__ch()))))) {
        break forward_join_61;
    }
    forwardValue3466_55_0 = life8_61;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3466_55_0)).a(((net.minecraft.block.properties.IProperty)(moom.ei.Q))) == moom.ak.TOP))) {
        break forward_join_61;
    }
    forwardValue3466_62_0 = 1;
    break forward_join_62;
    }
    forwardValue3466_62_0 = 0;
    }
    life10_88 = forwardValue3466_62_0;
    spill3466_5 = life9_65;
    if (!((life6_5 != null))) {
        forwardValue3466_70_0 = spill3466_5;
        break forward_join_70;
    }
    if (!(moom.ei.b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill3466_5)).a__ch()))))) {
        break forward_join_76;
    }
    forwardValue3466_70_0 = life9_65;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3466_70_0)).a(((net.minecraft.block.properties.IProperty)(moom.ei.Q))) == moom.ak.TOP))) {
        break forward_join_76;
    }
    forwardValue3466_77_0 = 1;
    break forward_join_77;
    }
    forwardValue3466_77_0 = 0;
    }
    life11_111 = forwardValue3466_77_0;
    if (!((life11_111 != 0))) {
        break forward_join_110;
    }
    spill3466_6 = p2;
    spill3466_7 = moom.bs.DOWN;
    if (!((life6_5 != null))) {
        forwardValue3466_87_0 = spill3466_6;
        forwardValue3466_87_1 = spill3466_7;
        break forward_join_87;
    }
    if (!((spill3466_6 != spill3466_7))) {
        break forward_join_106;
    }
    forwardValue3466_87_0 = p2;
    forwardValue3466_87_1 = moom.bs.UP;
    }
    if (!((forwardValue3466_87_0 == forwardValue3466_87_1))) {
        break forward_join_96;
    }
    spill3466_8 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3466_107_0 = ((spill3466_8) ? 1 : 0);
        break forward_join_107;
    }
    if (!((!spill3466_8))) {
        break forward_join_106;
    }
    }
    spill3466_9 = moom.ei.b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life8_61)).a__ch())));
    if (!((life6_5 != null))) {
        forwardValue3466_107_0 = ((spill3466_9) ? 1 : 0);
        break forward_join_107;
    }
    if (!(spill3466_9)) {
        break forward_join_106;
    }
    spill3466_10 = life10_88;
    if (!((life6_5 != null))) {
        forwardValue3466_109_0 = spill3466_10;
        break forward_join_109;
    }
    if (!((spill3466_10 == 0))) {
        break forward_join_108;
    }
    }
    forwardValue3466_107_0 = 1;
    }
    forwardValue3466_139_0 = forwardValue3466_107_0;
    break forward_join_139;
    }
    forwardValue3466_109_0 = 0;
    }
    forwardValue3466_139_0 = forwardValue3466_109_0;
    break forward_join_139;
    }
    spill3466_11 = p2;
    spill3466_12 = moom.bs.UP;
    if (!((life6_5 != null))) {
        forwardValue3466_117_0 = spill3466_11;
        forwardValue3466_117_1 = spill3466_12;
        break forward_join_117;
    }
    if (!((spill3466_11 != spill3466_12))) {
        break forward_join_136;
    }
    forwardValue3466_117_0 = p2;
    forwardValue3466_117_1 = moom.bs.DOWN;
    }
    if (!((forwardValue3466_117_0 == forwardValue3466_117_1))) {
        break forward_join_126;
    }
    spill3466_13 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue3466_137_0 = ((spill3466_13) ? 1 : 0);
        break forward_join_137;
    }
    if (!((!spill3466_13))) {
        break forward_join_136;
    }
    }
    spill3466_14 = moom.ei.b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life8_61)).a__ch())));
    if (!((life6_5 != null))) {
        forwardValue3466_137_0 = ((spill3466_14) ? 1 : 0);
        break forward_join_137;
    }
    if (!(spill3466_14)) {
        break forward_join_136;
    }
    spill3466_15 = life10_88;
    if (!((life6_5 != null))) {
        forwardValue3466_137_0 = spill3466_15;
        break forward_join_137;
    }
    if (!((spill3466_15 != 0))) {
        break forward_join_138;
    }
    }
    forwardValue3466_137_0 = 1;
    }
    forwardValue3466_139_0 = forwardValue3466_137_0;
    break forward_join_139;
    }
    forwardValue3466_139_0 = 0;
    }
    return ((forwardValue3466_139_0) != 0);
}


public abstract java.lang.String a__sourceReturn_b52d34d971(int p0);

public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
long local3 = (moom.ei.T ^ 56051436712053L);
    return (super.a__Int(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))) & __sourceIntrinsic_9be19b6945e9_originalDynamicSite1422_2(31512, (1721503533821149126L ^ local3)));
}


protected boolean m() {
return ((0) != 0);
}


public boolean g() {
return (__sourceIntrinsic_booleanComparison((((moom.ei)(this)).s())) != 0);
}


public boolean j() {
return (__sourceIntrinsic_booleanComparison((((moom.ei)(this)).s())) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_3bbdad1cc3826d29_originalDynamicSite642_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9be19b6945e9_originalDynamicSite1422_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7544_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
