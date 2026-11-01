package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cl extends moom.ck {

public static final moom.fv Q;

private final net.minecraft.block.BlockPressurePlate$Sensitivity R;

private static final long T;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

protected cl(moom.fn p0, net.minecraft.block.BlockPressurePlate$Sensitivity p1) {
super(p0);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cl.Q, java.lang.Boolean.FALSE));
    this.R = p1;
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(-8673810828394132682L)), ((long)(5718133096604466177L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239691919023999L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cl.T ^ 92339724993538L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill795_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill795_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill795_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill795_14 = new byte[8];
    (__sourceSpill795_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill795_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation795_16 = __sourceSpill795_14;
    ((javax.crypto.Cipher)(__sourceSpill795_11)).init(((int)(__sourceSpill795_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill795_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation795_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ö|ß\022<\fn´\n«"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill795_25 = local6_life21;
        int __sourceSpill795_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill795_25)).substring(((int)(__sourceSpill795_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill795_30 = local8_life19;
        int __sourceSpill795_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill795_33 = new byte[8];
        (__sourceSpill795_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill795_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill795_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill795_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill795_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill795_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill795_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill795_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill795_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill795_34)).doFinal(((byte[])(__sourceSpill795_33)));
        (__sourceSpill795_30)[__sourceSpill795_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[2]));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7151_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12958;
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
            throw new RuntimeException("moom/cl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cl.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b__sourceReturn_0a30135bee(net.minecraft.block.state.IBlockState p0) {
int forwardValue3129_15_0;
    int forwardValue3129_17_0;
    boolean spill3129_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.cl.T ^ 109586949784834L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3129_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cl.Q))))))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue3129_15_0 = ((spill3129_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill3129_0)) {
        break forward_join_16;
    }
    forwardValue3129_15_0 = 1;
    }
    forwardValue3129_17_0 = forwardValue3129_15_0;
    break forward_join_17;
    }
    forwardValue3129_17_0 = 0;
    }
    return forwardValue3129_17_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3130_15_0;
    moom.fv forwardValue3130_15_1;
    int forwardValue3130_15_2;
    net.minecraft.block.state.IBlockState forwardValue3130_16_0;
    moom.fv forwardValue3130_16_1;
    net.minecraft.block.state.IBlockState forwardValue3130_17_0;
    moom.fv forwardValue3130_17_1;
    int forwardValue3130_17_2;
    net.minecraft.block.state.IBlockState spill3130_0;
    moom.fv spill3130_1;
    int spill3130_2;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.cl.T ^ 122179244965384L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3130_0 = ((moom.cl)(this)).a__fE();
    spill3130_1 = moom.cl.Q;
    spill3130_2 = p0;
    if (!((life4_5 != null))) {
        forwardValue3130_15_0 = spill3130_0;
        forwardValue3130_15_1 = spill3130_1;
        forwardValue3130_15_2 = spill3130_2;
        break forward_join_15;
    }
    if (!((spill3130_2 == 1))) {
        forwardValue3130_16_0 = spill3130_0;
        forwardValue3130_16_1 = spill3130_1;
        break forward_join_16;
    }
    forwardValue3130_15_0 = spill3130_0;
    forwardValue3130_15_1 = spill3130_1;
    forwardValue3130_15_2 = 1;
    }
    forwardValue3130_17_0 = forwardValue3130_15_0;
    forwardValue3130_17_1 = forwardValue3130_15_1;
    forwardValue3130_17_2 = forwardValue3130_15_2;
    break forward_join_17;
    }
    forwardValue3130_17_0 = forwardValue3130_16_0;
    forwardValue3130_17_1 = forwardValue3130_16_1;
    forwardValue3130_17_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3130_17_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3130_17_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3130_17_2)))))));
}


protected int e(net.minecraft.block.state.IBlockState p0) {
int forwardValue3132_19_0;
    int forwardValue3132_21_0;
    boolean spill3132_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.cl.T ^ 84228164192905L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3132_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cl.Q))))))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue3132_19_0 = ((spill3132_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3132_0)) {
        break forward_join_20;
    }
    forwardValue3132_19_0 = __sourceIntrinsic_5ac91b912065_invokedynamic3132_7(15772, (1072681357409177679L ^ life2_3));
    }
    forwardValue3132_21_0 = forwardValue3132_19_0;
    break forward_join_21;
    }
    forwardValue3132_21_0 = 0;
    }
    return forwardValue3132_21_0;
}


protected int c(net.minecraft.world.World p0, moom.DT p1) {
int forestValue827_33_0;
    int forestValue827_65_0;
    int forestValue827_67_0;
    int[] spill827_0;
    int spill827_1;
    boolean spill827_2;
    boolean spill827_3;
    long life3_3;
    moom.CA life6_8;
    int[] life5_9;
    java.util.List life7_22;
    java.util.Iterator life8_43;
    net.minecraft.entity.Entity life9_50;
    forest_join_67: {
    forest_join_66: {
    forest_join_65: {
    forest_join_60: {
    forest_join_34: {
    forest_join_33: {
    forest_join_32: {
    forest_join_25: {
    forest_join_18: {
    life3_3 = (moom.cl.T ^ 92415984364692L);
    spill827_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((moom.cl)(this)).a(((moom.DT)(p1)));
    life5_9 = spill827_0;
    spill827_1 = (net.minecraft.block.BlockPressurePlate$1.a)[((net.minecraft.block.BlockPressurePlate$Sensitivity)(this.R)).ordinal()];
    if (!((life5_9 != null))) {
        forestValue827_33_0 = spill827_1;
        break forest_join_33;
    }
    switch (spill827_1) {
case 1:
{
        break forest_join_18;
    }
case 2:
{
        break forest_join_25;
    }
default:
{
        break forest_join_32;
    }
}
    }
    life7_22 = ((net.minecraft.world.World)(p0)).b(((net.minecraft.entity.Entity)(null)), ((moom.CA)(life6_8)));
    if (!((life5_9 == null))) {
        break forest_join_34;
    }
    }
    life7_22 = ((net.minecraft.world.World)(p0)).a(((java.lang.Class)(net.minecraft.entity.EntityLivingBase.class)), ((moom.CA)(life6_8)));
    if (!((life5_9 == null))) {
        break forest_join_34;
    }
    }
    forestValue827_33_0 = 0;
    }
    return forestValue827_33_0;
    }
    spill827_2 = ((java.util.List)(life7_22)).isEmpty();
    if (!((life5_9 != null))) {
        forestValue827_67_0 = ((spill827_2) ? 1 : 0);
        break forest_join_67;
    }
    if (!((!spill827_2))) {
        break forest_join_66;
    }
    life8_43 = ((java.util.List)(life7_22)).iterator();
    forest_cycle_42: while (true) {
    forest_join_57: {
    if (!(((java.util.Iterator)(life8_43)).hasNext())) {
        break forest_join_66;
    }
    life9_50 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life8_43)).next()));
    spill827_3 = ((net.minecraft.entity.Entity)(life9_50)).y();
    if (!((life5_9 != null))) {
        forestValue827_67_0 = ((spill827_3) ? 1 : 0);
        break forest_join_67;
    }
    if (!((life5_9 != null))) {
        forestValue827_65_0 = ((spill827_3) ? 1 : 0);
        break forest_join_65;
    }
    if (!((!spill827_3))) {
        break forest_join_57;
    }
    break forest_join_60;
    }
    if (!((life5_9 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_join_66;
    }
    forestValue827_65_0 = __sourceIntrinsic_f2cc43e752e9_invokedynamic827_18(15766, (6352695690346477145L ^ life3_3));
    }
    return forestValue827_65_0;
    }
    forestValue827_67_0 = 0;
    }
    return forestValue827_67_0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cl.Q});
}


protected net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, int p1) {
net.minecraft.block.state.IBlockState forwardValue3128_13_0;
    moom.fv forwardValue3128_13_1;
    int forwardValue3128_13_2;
    net.minecraft.block.state.IBlockState forwardValue3128_14_0;
    moom.fv forwardValue3128_14_1;
    net.minecraft.block.state.IBlockState forwardValue3128_15_0;
    moom.fv forwardValue3128_15_1;
    int forwardValue3128_15_2;
    net.minecraft.block.state.IBlockState spill3128_0;
    moom.fv spill3128_1;
    int spill3128_2;
    long life3_3;
    int[] life5_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (moom.cl.T ^ 55558929534170L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3128_0 = p0;
    spill3128_1 = moom.cl.Q;
    spill3128_2 = p1;
    if (!((life5_5 != null))) {
        forwardValue3128_13_0 = spill3128_0;
        forwardValue3128_13_1 = spill3128_1;
        forwardValue3128_13_2 = spill3128_2;
        break forward_join_13;
    }
    if (!((spill3128_2 > 0))) {
        forwardValue3128_14_0 = spill3128_0;
        forwardValue3128_14_1 = spill3128_1;
        break forward_join_14;
    }
    forwardValue3128_13_0 = spill3128_0;
    forwardValue3128_13_1 = spill3128_1;
    forwardValue3128_13_2 = 1;
    }
    forwardValue3128_15_0 = forwardValue3128_13_0;
    forwardValue3128_15_1 = forwardValue3128_13_1;
    forwardValue3128_15_2 = forwardValue3128_13_2;
    break forward_join_15;
    }
    forwardValue3128_15_0 = forwardValue3128_14_0;
    forwardValue3128_15_1 = forwardValue3128_14_1;
    forwardValue3128_15_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3128_15_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3128_15_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3128_15_2)))))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7151_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f2cc43e752e9_invokedynamic827_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac91b912065_invokedynamic3132_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
