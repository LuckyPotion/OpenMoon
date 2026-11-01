package net.minecraft.world.gen.structure;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class StructureStrongholdPieces$Crossing extends moom.HF {

private boolean f;

private boolean g;

private boolean h;

private boolean i;

private static long j;

private static long[] k;

private static java.lang.Integer[] p;

private static java.util.Map q;

public StructureStrongholdPieces$Crossing() {
super();
}


public StructureStrongholdPieces$Crossing(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }

private static void __sourceConstructorBody_30add53c2c1fbe9c(net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {
net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing forwardValue586_40_0;
    int forwardValue586_40_1;
    net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing forwardValue586_41_0;
    net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing forwardValue586_42_0;
    int forwardValue586_42_1;
    net.minecraft.entity.Entity[] spill586_0;
    net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing spill586_1;
    int spill586_2;
    long life5_3;
    net.minecraft.entity.Entity[] life7_19;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life5_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.j ^ 100788472819675L);
    net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.__sourceConstructorInit_30add53c2c1fbe9c_0(((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)), ((int)(p0)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)).b = ((moom.bs)(p3));
    spill586_0 = moom.G4.b();
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)).e = ((moom.bJ)(((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)).a(((java.util.Random)(p1)))));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)).a = ((moom.G2)(p2));
    life7_19 = spill586_0;
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)).f = ((boolean)(((java.util.Random)(p1)).nextBoolean()));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)).g = ((boolean)(((java.util.Random)(p1)).nextBoolean()));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(receiver)).h = ((boolean)(((java.util.Random)(p1)).nextBoolean()));
    spill586_1 = receiver;
    spill586_2 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    if (!((life7_19 != null))) {
        forwardValue586_40_0 = spill586_1;
        forwardValue586_40_1 = spill586_2;
        break forward_join_40;
    }
    if (!((spill586_2 > 0))) {
        forwardValue586_41_0 = spill586_1;
        break forward_join_41;
    }
    forwardValue586_40_0 = spill586_1;
    forwardValue586_40_1 = 1;
    }
    forwardValue586_42_0 = forwardValue586_40_0;
    forwardValue586_42_1 = forwardValue586_40_1;
    break forward_join_42;
    }
    forwardValue586_42_0 = forwardValue586_41_0;
    forwardValue586_42_1 = 0;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(forwardValue586_42_0)).i = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue586_42_1)));
    return;
}


static {
javax.crypto.Cipher forestValue585_36_0;
    int forestValue585_36_1;
    javax.crypto.SecretKeyFactory forestValue585_36_2;
    byte[] forestValue585_36_3;
    javax.crypto.Cipher forestValue585_53_0;
    int forestValue585_53_1;
    javax.crypto.SecretKeyFactory forestValue585_53_2;
    byte[] forestValue585_53_3;
    long[] forestValue585_157_0;
    int forestValue585_157_1;
    long forestValue585_157_2;
    int forestValue585_157_3;
    long[] forestValue585_300_0;
    int forestValue585_300_1;
    long forestValue585_300_2;
    long[] forestValue585_312_0;
    int forestValue585_312_1;
    long forestValue585_312_2;
    javax.crypto.Cipher spill585_0;
    int spill585_1;
    javax.crypto.SecretKeyFactory spill585_2;
    byte[] spill585_3;
    byte[] spill585_4;
    java.lang.String spill585_5;
    int spill585_6;
    int spill585_7;
    long spill585_8;
    byte[] spill585_9;
    byte[] spill585_10;
    byte[] spill585_11;
    byte[] spill585_12;
    byte[] spill585_13;
    byte[] spill585_14;
    byte[] spill585_15;
    byte[] spill585_16;
    long spill585_17;
    int spill585_18;
    java.lang.String spill585_19;
    int spill585_20;
    long[] spill585_21;
    int spill585_22;
    long spill585_23;
    int spill585_24;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    byte[] life9_325;
    forest_join_399: {
    forest_join_53: {
    j = ((long)(((moom._a)(moom._c.a(((long)(6735195270044223456L)), ((long)(-9017246800511997768L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200615623313617L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.j ^ 2530792048669L);
    spill585_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill585_1 = 2;
    spill585_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp585_9_0 = new byte[8];
    spill585_3 = __stackOp585_9_0;
    (__stackOp585_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue585_36_0 = spill585_0;
    forestValue585_36_1 = spill585_1;
    forestValue585_36_2 = spill585_2;
    forestValue585_36_3 = spill585_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue585_53_0 = forestValue585_36_0;
        forestValue585_53_1 = forestValue585_36_1;
        forestValue585_53_2 = forestValue585_36_2;
        forestValue585_53_3 = forestValue585_36_3;
        break forest_join_53;
    }
    byte[] __stackOp585_10_0 = forestValue585_36_3;
    spill585_4 = __stackOp585_10_0;
    (__stackOp585_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue585_36_3 = spill585_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue585_53_0)).init(((int)(forestValue585_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue585_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue585_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[13];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "Í§Bû\001ã3o.×h=eÉ¤% þ­\023@À+\033ûÇwS/\037î7Ùé¸¾)KMjdëø\004#\004©OcsÏ>¡\025Í~L.Ã×!`oósTBoF\031í#æ\026Ó6Â¿ö"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill585_5 = life6_71;
    spill585_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill585_5)).substring(((int)(spill585_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue585_157_0 = life8_66;
    forestValue585_157_1 = (life5_68++);
    forestValue585_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue585_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp585_16_0 = forestValue585_157_2;
    int __stackOp585_16_1 = forestValue585_157_3;
    spill585_7 = __stackOp585_16_1;
    spill585_8 = __stackOp585_16_0;
    recovery.source.CarrierOps.discard(__stackOp585_16_1);
    life10_160 = spill585_8;
    byte[] __stackOp585_18_0 = new byte[8];
    spill585_9 = __stackOp585_18_0;
    (__stackOp585_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp585_19_0 = spill585_9;
    spill585_10 = __stackOp585_19_0;
    (__stackOp585_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp585_20_0 = spill585_10;
    spill585_11 = __stackOp585_20_0;
    (__stackOp585_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp585_21_0 = spill585_11;
    spill585_12 = __stackOp585_21_0;
    (__stackOp585_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp585_22_0 = spill585_12;
    spill585_13 = __stackOp585_22_0;
    (__stackOp585_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp585_23_0 = spill585_13;
    spill585_14 = __stackOp585_23_0;
    (__stackOp585_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp585_24_0 = spill585_14;
    spill585_15 = __stackOp585_24_0;
    (__stackOp585_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp585_25_0 = spill585_15;
    spill585_16 = __stackOp585_25_0;
    (__stackOp585_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp585_26_0 = spill585_16;
    javax.crypto.Cipher __stackOp585_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp585_26_1)).doFinal(((byte[])(__stackOp585_26_0)));
    int __stackOp585_28_0 = spill585_7;
    long __stackOp585_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill585_17 = __stackOp585_28_1;
    spill585_18 = __stackOp585_28_0;
    recovery.source.CarrierOps.discard(__stackOp585_28_1);
    switch (spill585_18) {
default:
{
        forestValue585_300_0 = forestValue585_157_0;
        forestValue585_300_1 = forestValue585_157_1;
        forestValue585_300_2 = spill585_17;
        break forest_join_300;
    }
case 0:
{
        forestValue585_312_0 = forestValue585_157_0;
        forestValue585_312_1 = forestValue585_157_1;
        forestValue585_312_2 = spill585_17;
        break forest_join_312;
    }
}
    }
    (forestValue585_300_0)[forestValue585_300_1] = forestValue585_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "´½¹cwf\021M\023p\037.§ï°"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue585_312_0)[forestValue585_312_1] = forestValue585_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill585_19 = life6_71;
    spill585_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill585_19)).substring(((int)(spill585_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill585_21 = life8_66;
    spill585_22 = (life5_68++);
    spill585_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill585_24 = 0;
    forestValue585_157_0 = spill585_21;
    forestValue585_157_1 = spill585_22;
    forestValue585_157_2 = spill585_23;
    forestValue585_157_3 = spill585_24;
    continue forest_cycle_157;
    }
    }
    }
    k = ((long[])(life8_66));
    p = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_30add53c2c1fbe9c_0(net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing a0, int a1) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12729_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16152;
      if (p[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/HI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("leftLow")))));
    this.g = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("leftHigh")))));
    this.h = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("rightLow")))));
    this.i = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("rightHigh")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forwardValue647_52_0;
    int forwardValue647_72_0;
    int forwardValue647_100_0;
    int forwardValue647_132_0;
    int forwardValue647_514_0;
    boolean spill647_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_514: {
    forward_join_170: {
    forward_join_132: {
    forward_join_130: {
    forward_join_100: {
    forward_join_98: {
    forward_join_72: {
    forward_join_70: {
    forward_join_52: {
    forward_join_15: {
    life4_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.j ^ 8416138816496L);
    life6_5 = moom.G4.b();
    spill647_0 = ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        forwardValue647_52_0 = ((spill647_0) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill647_0)) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_5(28987, (8136161939603565839L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_6(32068, (7281000384471540086L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_7(27473, (2464678075943171937L ^ life4_3)))), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(this.e)), ((int)(4)), ((int)(3)), ((int)(0)));
    forwardValue647_52_0 = ((this.f) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue647_72_0 = forwardValue647_52_0;
        break forward_join_72;
    }
    if (!((forwardValue647_52_0 != 0))) {
        break forward_join_70;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    forwardValue647_72_0 = ((this.h) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue647_100_0 = forwardValue647_72_0;
        break forward_join_100;
    }
    if (!((forwardValue647_72_0 != 0))) {
        break forward_join_98;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_21(28987, (8136161939603565839L ^ life4_3)))), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_22(28987, (8136161939603565839L ^ life4_3)))), ((int)(5)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    forwardValue647_100_0 = ((this.g) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue647_132_0 = forwardValue647_100_0;
        break forward_join_132;
    }
    if (!((forwardValue647_100_0 != 0))) {
        break forward_join_130;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_30(8176, (6886071965885612998L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_31(11375, (5560828698519892052L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_32(28987, (8136161939603565839L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    forwardValue647_132_0 = ((this.i) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue647_514_0 = forwardValue647_132_0;
        break forward_join_514;
    }
    if (!((forwardValue647_132_0 != 0))) {
        break forward_join_170;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_40(28987, (8136161939603565839L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_41(11375, (5560828698519892052L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_42(28987, (8136161939603565839L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_43(11375, (5560828698519892052L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_44(28987, (8136161939603565839L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_50(27473, (2464678075943171937L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_51(11375, (5560828698519892052L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_52(27473, (2464678075943171937L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_58(12051, (7508563491142497056L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_59(9029, (4425897448695201660L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(5)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_62(28987, (8136161939603565839L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_65(12051, (7508563491142497056L ^ life4_3)))), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_66(12051, (7508563491142497056L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_67(28987, (8136161939603565839L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_70(11375, (5560828698519892052L ^ life4_3)))), ((int)(3)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_71(28987, (8136161939603565839L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(5)), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_74(3740, (524633717708149412L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(4)), ((int)(3)), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_82(3740, (524633717708149412L ^ life4_3)))), ((int)(3)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_83(3740, (524633717708149412L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_89(11375, (5560828698519892052L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_90(11375, (5560828698519892052L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_91(12051, (7508563491142497056L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_94(28987, (8136161939603565839L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_95(11375, (5560828698519892052L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_96(28987, (8136161939603565839L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_102(11375, (5560828698519892052L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_103(11375, (5560828698519892052L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_104(11375, (5560828698519892052L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_110(11375, (5560828698519892052L ^ life4_3)))), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_111(28987, (8136161939603565839L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_117(12051, (7508563491142497056L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_118(11375, (5560828698519892052L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_119(12051, (7508563491142497056L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_120(28987, (8136161939603565839L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_126(11375, (5560828698519892052L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_127(11375, (5560828698519892052L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_128(28987, (8136161939603565839L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.T)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.T)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_136(3740, (524633717708149412L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic647_137(3740, (524633717708149412L ^ life4_3)))), ((moom.G2)(p2)));
    forwardValue647_514_0 = 1;
    }
    return ((forwardValue647_514_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("leftLow")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("leftHigh")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("rightLow")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.h) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("rightHigh")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.i) ? 1 : 0)))));
    return;
}


public static net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing forwardValue5850_52_0;
    long life7_3;
    moom.G2 life9_35;
    forward_join_52: {
    forward_join_51: {
    life7_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.j ^ 14976329790984L);
    life9_35 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_fc93730d6565_invokedynamic5850_1(26357, (4186012889758394168L ^ life7_3)))), ((int)(__sourceIntrinsic_fc93730d6565_invokedynamic5850_2(24607, (5342686950453567960L ^ life7_3)))), ((int)(0)), ((int)(__sourceIntrinsic_fc93730d6565_invokedynamic5850_3(22828, (2184661883253807342L ^ life7_3)))), ((int)(__sourceIntrinsic_fc93730d6565_invokedynamic5850_4(1252, (4291318032727344429L ^ life7_3)))), ((int)(__sourceIntrinsic_fc93730d6565_invokedynamic5850_5(3875, (179045922247184108L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.a(((moom.G2)(life9_35))))) {
        break forward_join_51;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_35))) == null))) {
        break forward_join_51;
    }
    forwardValue5850_52_0 = new net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing(p6, p1, life9_35, p5);
    break forward_join_52;
    }
    forwardValue5850_52_0 = null;
    }
    return forwardValue5850_52_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing forwardValue5851_48_0;
    int forwardValue5851_63_0;
    int forwardValue5851_81_0;
    int forwardValue5851_97_0;
    moom.G4 forwardValue5851_110_0;
    net.minecraft.entity.Entity[] spill5851_0;
    net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing spill5851_1;
    boolean spill5851_2;
    net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing spill5851_3;
    long life4_3;
    int life7_5;
    int life8_8;
    net.minecraft.entity.Entity[] life6_9;
    forward_join_111: {
    forward_join_110: {
    forward_join_97: {
    forward_join_93: {
    forward_join_81: {
    forward_join_79: {
    forward_join_63: {
    forward_join_61: {
    forward_join_48: {
    forward_join_38: {
    forward_join_30: {
    forward_join_22: {
    life4_3 = (net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing.j ^ 129944335163702L);
    life7_5 = 3;
    spill5851_0 = moom.G4.b();
    life8_8 = 5;
    life6_9 = spill5851_0;
    if (!((life6_9 != null))) {
        break forward_join_30;
    }
    if (!((this.b != moom.bs.WEST))) {
        break forward_join_22;
    }
    spill5851_1 = this;
    if (!((life6_9 != null))) {
        forwardValue5851_48_0 = spill5851_1;
        break forward_join_48;
    }
    if (!((((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(spill5851_1)).b == moom.bs.NORTH))) {
        break forward_join_38;
    }
    }
    life7_5 = (__sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_6(12051, (7508546480706501094L ^ life4_3)) - life7_5);
    }
    life8_8 = (__sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_7(12051, (7508546480706501094L ^ life4_3)) - life8_8);
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).a(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(5)), ((int)(1)));
    forwardValue5851_48_0 = this;
    }
    spill5851_2 = ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(forwardValue5851_48_0)).f;
    if (!((life6_9 != null))) {
        forwardValue5851_63_0 = ((spill5851_2) ? 1 : 0);
        break forward_join_63;
    }
    if (!(spill5851_2)) {
        break forward_join_61;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).b(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(life7_5)), ((int)(1)));
    }
    forwardValue5851_63_0 = ((this.g) ? 1 : 0);
    }
    if (!((life6_9 != null))) {
        forwardValue5851_81_0 = forwardValue5851_63_0;
        break forward_join_81;
    }
    if (!((forwardValue5851_63_0 != 0))) {
        break forward_join_79;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).b(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(life8_8)), ((int)(__sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_17(11375, (5560953461095643794L ^ life4_3)))));
    }
    forwardValue5851_81_0 = ((this.h) ? 1 : 0);
    }
    if (!((life6_9 != null))) {
        forwardValue5851_97_0 = forwardValue5851_81_0;
        break forward_join_97;
    }
    if (!((forwardValue5851_81_0 != 0))) {
        break forward_join_93;
    }
    ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).c(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(life7_5)), ((int)(1)));
    }
    spill5851_3 = this;
    if (!((life6_9 != null))) {
        forwardValue5851_110_0 = spill5851_3;
        break forward_join_110;
    }
    forwardValue5851_97_0 = ((((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(spill5851_3)).i) ? 1 : 0);
    }
    if (!((forwardValue5851_97_0 != 0))) {
        break forward_join_111;
    }
    forwardValue5851_110_0 = ((net.minecraft.world.gen.structure.StructureStrongholdPieces$Crossing)(this)).c(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(life8_8)), ((int)(__sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_26(11375, (5560953461095643794L ^ life4_3)))));
    }
    recovery.source.CarrierOps.discard(forwardValue5851_110_0);
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_fc93730d6565_invokedynamic5850_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc93730d6565_invokedynamic5850_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc93730d6565_invokedynamic5850_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc93730d6565_invokedynamic5850_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc93730d6565_invokedynamic5850_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic5851_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic647_137(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12729_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
