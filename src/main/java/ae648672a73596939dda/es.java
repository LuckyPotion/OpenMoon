package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class es extends net.minecraft.block.Block {

public static final moom.fy Q;

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected es() {
super(moom.fn.y);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.es.Q, java.lang.Integer.valueOf(1)));
    (this).a(0x0.0p+0f, 0x0.0p+0f, 0x0.0p+0f, 0x1.0000000000000p+0f, 0x1.0000000000000p-3f, 0x1.0000000000000p+0f);
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
    (this).a__Void();
}


static {
javax.crypto.Cipher forestValue457_36_0;
    int forestValue457_36_1;
    javax.crypto.SecretKeyFactory forestValue457_36_2;
    byte[] forestValue457_36_3;
    javax.crypto.Cipher forestValue457_53_0;
    int forestValue457_53_1;
    javax.crypto.SecretKeyFactory forestValue457_53_2;
    byte[] forestValue457_53_3;
    long[] forestValue457_157_0;
    int forestValue457_157_1;
    long forestValue457_157_2;
    int forestValue457_157_3;
    long[] forestValue457_300_0;
    int forestValue457_300_1;
    long forestValue457_300_2;
    long[] forestValue457_312_0;
    int forestValue457_312_1;
    long forestValue457_312_2;
    javax.crypto.Cipher spill457_0;
    int spill457_1;
    javax.crypto.SecretKeyFactory spill457_2;
    byte[] spill457_3;
    byte[] spill457_4;
    java.lang.String spill457_5;
    int spill457_6;
    int spill457_7;
    long spill457_8;
    byte[] spill457_9;
    byte[] spill457_10;
    byte[] spill457_11;
    byte[] spill457_12;
    byte[] spill457_13;
    byte[] spill457_14;
    byte[] spill457_15;
    byte[] spill457_16;
    long spill457_17;
    int spill457_18;
    java.lang.String spill457_19;
    int spill457_20;
    long[] spill457_21;
    int spill457_22;
    long spill457_23;
    int spill457_24;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    forest_join_399: {
    forest_join_53: {
    R = ((long)(((moom._a)(moom._c.a(((long)(9089528175445222006L)), ((long)(6615714670611766180L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(90550119406712L)))));
    life11_11 = (moom.es.R ^ 45924645837891L);
    U = ((java.util.Map)(new java.util.HashMap(13)));
    spill457_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill457_1 = 2;
    spill457_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp457_9_0 = new byte[8];
    spill457_3 = __stackOp457_9_0;
    (__stackOp457_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue457_36_0 = spill457_0;
    forestValue457_36_1 = spill457_1;
    forestValue457_36_2 = spill457_2;
    forestValue457_36_3 = spill457_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue457_53_0 = forestValue457_36_0;
        forestValue457_53_1 = forestValue457_36_1;
        forestValue457_53_2 = forestValue457_36_2;
        forestValue457_53_3 = forestValue457_36_3;
        break forest_join_53;
    }
    byte[] __stackOp457_10_0 = forestValue457_36_3;
    spill457_4 = __stackOp457_10_0;
    (__stackOp457_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue457_36_3 = spill457_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue457_53_0)).init(((int)(forestValue457_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue457_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue457_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[4];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "úX°12\003C\020Ù\035h="))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill457_5 = life4_71;
    spill457_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill457_5)).substring(((int)(spill457_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue457_157_0 = life6_66;
    forestValue457_157_1 = (life3_68++);
    forestValue457_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue457_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp457_16_0 = forestValue457_157_2;
    int __stackOp457_16_1 = forestValue457_157_3;
    spill457_7 = __stackOp457_16_1;
    spill457_8 = __stackOp457_16_0;
    recovery.source.CarrierOps.discard(__stackOp457_16_1);
    life8_160 = spill457_8;
    byte[] __stackOp457_18_0 = new byte[8];
    spill457_9 = __stackOp457_18_0;
    (__stackOp457_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp457_19_0 = spill457_9;
    spill457_10 = __stackOp457_19_0;
    (__stackOp457_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp457_20_0 = spill457_10;
    spill457_11 = __stackOp457_20_0;
    (__stackOp457_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp457_21_0 = spill457_11;
    spill457_12 = __stackOp457_21_0;
    (__stackOp457_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp457_22_0 = spill457_12;
    spill457_13 = __stackOp457_22_0;
    (__stackOp457_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp457_23_0 = spill457_13;
    spill457_14 = __stackOp457_23_0;
    (__stackOp457_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp457_24_0 = spill457_14;
    spill457_15 = __stackOp457_24_0;
    (__stackOp457_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp457_25_0 = spill457_15;
    spill457_16 = __stackOp457_25_0;
    (__stackOp457_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp457_26_0 = spill457_16;
    javax.crypto.Cipher __stackOp457_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp457_26_1)).doFinal(((byte[])(__stackOp457_26_0)));
    int __stackOp457_28_0 = spill457_7;
    long __stackOp457_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill457_17 = __stackOp457_28_1;
    spill457_18 = __stackOp457_28_0;
    recovery.source.CarrierOps.discard(__stackOp457_28_1);
    switch (spill457_18) {
default:
{
        forestValue457_300_0 = forestValue457_157_0;
        forestValue457_300_1 = forestValue457_157_1;
        forestValue457_300_2 = spill457_17;
        break forest_join_300;
    }
case 0:
{
        forestValue457_312_0 = forestValue457_157_0;
        forestValue457_312_1 = forestValue457_157_1;
        forestValue457_312_2 = spill457_17;
        break forest_join_312;
    }
}
    }
    (forestValue457_300_0)[forestValue457_300_1] = forestValue457_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "!R­7'O;\005ô\000\034\036@Úó"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue457_312_0)[forestValue457_312_1] = forestValue457_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill457_19 = life4_71;
    spill457_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill457_19)).substring(((int)(spill457_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill457_21 = life6_66;
    spill457_22 = (life3_68++);
    spill457_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill457_24 = 0;
    forestValue457_157_0 = spill457_21;
    forestValue457_157_1 = spill457_22;
    forestValue457_157_2 = spill457_23;
    forestValue457_157_3 = spill457_24;
    continue forest_cycle_157;
    }
    }
    }
    S = ((long[])(life6_66));
    T = ((java.lang.Integer[])(new java.lang.Integer[4]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("layers")), ((int)(1)), ((int)(__sourceIntrinsic_eb8803ad1f63_invokedynamic457_35(9142, (6852687017721680641L ^ life11_11)))))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.es.R ^ 12464775208169L);
    return ((net.minecraft.block.state.IBlockState)(((moom.es)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.es.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(((p0 & __sourceIntrinsic_819466f05fee_originalDynamicSite1430_3(10333, (6749072768577067073L ^ local2))) + 1)))))));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3482_29_0;
    int spill3482_0;
    long life5_3;
    int[] life7_5;
    forward_join_30: {
    forward_join_29: {
    life5_3 = (moom.es.R ^ 41402973093438L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3482_0 = ((net.minecraft.world.World)(p0)).b(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.BLOCK)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3482_29_0 = spill3482_0;
        break forward_join_29;
    }
    if (!((spill3482_0 > __sourceIntrinsic_b4b54c999db9_invokedynamic3482_4(18121, (1241732647295865857L ^ life5_3))))) {
        break forward_join_30;
    }
    ((moom.es)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))), ((int)(0)));
    forwardValue3482_29_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3482_29_0);
    }
    return;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.block.Block forwardValue356_23_0;
    net.minecraft.block.Block forwardValue356_23_1;
    net.minecraft.block.Block forwardValue356_25_0;
    net.minecraft.block.Block forwardValue356_31_0;
    net.minecraft.block.Block forwardValue356_49_0;
    int forwardValue356_56_0;
    int forwardValue356_60_0;
    int forwardValue356_62_0;
    int[] spill356_0;
    net.minecraft.block.Block spill356_1;
    net.minecraft.block.Block spill356_2;
    net.minecraft.block.Block spill356_3;
    int spill356_4;
    boolean spill356_5;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_9;
    int[] life5_10;
    net.minecraft.block.Block life7_13;
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_56: {
    forward_join_49: {
    forward_join_48: {
    forward_join_31: {
    forward_join_25: {
    forward_join_23: {
    life3_3 = (moom.es.R ^ 7397538203083L);
    spill356_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_9 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    life5_10 = spill356_0;
    life7_13 = ((net.minecraft.block.state.IBlockState)(life6_9)).a__ch();
    spill356_1 = life7_13;
    spill356_2 = net.minecraft.init.Blocks.aI;
    if (!((life5_10 != null))) {
        forwardValue356_23_0 = spill356_1;
        forwardValue356_23_1 = spill356_2;
        break forward_join_23;
    }
    if (!((spill356_1 != spill356_2))) {
        break forward_join_61;
    }
    spill356_3 = life7_13;
    if (!((life5_10 != null))) {
        forwardValue356_25_0 = spill356_3;
        break forward_join_25;
    }
    forwardValue356_23_0 = spill356_3;
    forwardValue356_23_1 = net.minecraft.init.Blocks.cf;
    }
    if (!((forwardValue356_23_0 != forwardValue356_23_1))) {
        break forward_join_61;
    }
    forwardValue356_25_0 = life7_13;
    }
    if (!((life5_10 != null))) {
        forwardValue356_31_0 = forwardValue356_25_0;
        break forward_join_31;
    }
    if (!((((net.minecraft.block.Block)(forwardValue356_25_0)).a__fn() != moom.fn.j))) {
        break forward_join_59;
    }
    forwardValue356_31_0 = life7_13;
    }
    if (!((life5_10 != null))) {
        forwardValue356_49_0 = forwardValue356_31_0;
        break forward_join_49;
    }
    if (!((forwardValue356_31_0 == this))) {
        break forward_join_48;
    }
    spill356_4 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life6_9)).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue();
    if (!((life5_10 != null))) {
        forwardValue356_60_0 = spill356_4;
        break forward_join_60;
    }
    if (!((spill356_4 < __sourceIntrinsic_b5eaa787bfb8_invokedynamic356_13(5782, (572089817271959466L ^ life3_3))))) {
        break forward_join_59;
    }
    }
    forwardValue356_49_0 = life7_13;
    }
    spill356_5 = ((net.minecraft.block.Block)(forwardValue356_49_0)).j();
    if (!((life5_10 != null))) {
        forwardValue356_56_0 = ((spill356_5) ? 1 : 0);
        break forward_join_56;
    }
    if (!(spill356_5)) {
        break forward_join_61;
    }
    forwardValue356_56_0 = ((((moom.fn)(((net.minecraft.block.Block)(life7_13)).J)).d__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 != null))) {
        forwardValue356_60_0 = forwardValue356_56_0;
        break forward_join_60;
    }
    if (!((forwardValue356_56_0 != 0))) {
        break forward_join_61;
    }
    }
    forwardValue356_60_0 = 1;
    }
    forwardValue356_62_0 = forwardValue356_60_0;
    break forward_join_62;
    }
    forwardValue356_62_0 = 0;
    }
    return ((forwardValue356_62_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7567_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/es"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue() - 1);
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7122;
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
            throw new RuntimeException("moom/es", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.es.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.es.Q});
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue354_18_0;
    int forwardValue354_20_0;
    int spill354_0;
    long life3_3;
    int[] life5_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (moom.es.R ^ 69285344228690L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill354_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue();
    if (!((life5_5 != null))) {
        forwardValue354_18_0 = spill354_0;
        break forward_join_18;
    }
    if (!((spill354_0 == 1))) {
        break forward_join_19;
    }
    forwardValue354_18_0 = 1;
    }
    forwardValue354_20_0 = forwardValue354_18_0;
    break forward_join_20;
    }
    forwardValue354_20_0 = 0;
    }
    return ((forwardValue354_20_0) != 0);
}


public void a__Void() {
((moom.es)(this)).a__sourceReturn_d00df7729d(((int)(0)));
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int local4 = (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue() - 1);
    float local5 = 0x1.0p-3f;
    return new moom.CA((((double) ((moom.DT)(p1)).a()) + this.B), (((double) ((moom.DT)(p1)).b()) + this.C), (((double) ((moom.DT)(p1)).c()) + this.D), (((double) ((moom.DT)(p1)).a()) + this.E), ((double) (((float) ((moom.DT)(p1)).b()) + (((float) local4) * local5))), (((double) ((moom.DT)(p1)).c()) + this.G));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue352_18_0;
    int forwardValue352_20_0;
    int spill352_0;
    long life3_3;
    int[] life5_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (moom.es.R ^ 119970268706673L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill352_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue();
    if (!((life5_5 != null))) {
        forwardValue352_18_0 = spill352_0;
        break forward_join_18;
    }
    if (!((spill352_0 < 5))) {
        break forward_join_19;
    }
    forwardValue352_18_0 = 1;
    }
    forwardValue352_20_0 = forwardValue352_18_0;
    break forward_join_20;
    }
    forwardValue352_20_0 = 0;
    }
    return ((forwardValue352_20_0) != 0);
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.aD;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((moom.es)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


protected void a__sourceReturn_d00df7729d(int p0) {
((moom.es)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)((((float) p0) / 0x1.0p3f))), ((float)(0x1.0p0f)));
    return;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
moom.es.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aD, (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p3)).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue() + 1), 0))));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p2)));
    ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[net.minecraft.block.Block.a(((net.minecraft.block.Block)(this)))])));
    return;
}


private boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue355_26_0;
    boolean spill355_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_25: {
    life4_3 = (moom.es.R ^ 31287373239987L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill355_0 = ((moom.es)(this)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue355_26_0 = ((spill355_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill355_0))) {
        break forward_join_25;
    }
    ((moom.es)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    return ((0) != 0);
    }
    forwardValue355_26_0 = 1;
    }
    return ((forwardValue355_26_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
int forwardValue353_18_0;
    int forwardValue353_20_0;
    boolean spill353_0;
    long life4_3;
    int[] life6_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life4_3 = (moom.es.R ^ 69904873551690L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((p2 != moom.bs.UP))) {
        break forward_join_17;
    }
    spill353_0 = super.a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)));
    if (!((life6_5 != null))) {
        forwardValue353_18_0 = ((spill353_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill353_0)) {
        break forward_join_19;
    }
    }
    forwardValue353_18_0 = 1;
    }
    forwardValue353_20_0 = forwardValue353_18_0;
    break forward_join_20;
    }
    forwardValue353_20_0 = 0;
    }
    return ((forwardValue353_20_0) != 0);
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
java.lang.Object local3 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    ((moom.es)(this)).a__sourceReturn_d00df7729d(((int)(((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(local3)).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue())));
    return;
}


public int a(java.util.Random p0) {
return 0;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic457_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7567_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic3482_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5eaa787bfb8_invokedynamic356_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_originalDynamicSite1430_3(int a0, long a1) throws E;
}
