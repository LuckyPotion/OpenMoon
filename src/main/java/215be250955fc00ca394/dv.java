package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dv extends moom.du {

public static final moom.fx R;

public static final moom.fy S;

private static final long T;

private static final long[] W;

private static final java.lang.Integer[] X;

private static final java.util.Map Y;

protected dv() {
super(moom.fn.g);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.dv.R, moom.bs.NORTH)).a__fE(moom.dv.S, java.lang.Integer.valueOf(0)));
    (this).b(0);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
javax.crypto.Cipher forestValue444_36_0;
    int forestValue444_36_1;
    javax.crypto.SecretKeyFactory forestValue444_36_2;
    byte[] forestValue444_36_3;
    javax.crypto.Cipher forestValue444_53_0;
    int forestValue444_53_1;
    javax.crypto.SecretKeyFactory forestValue444_53_2;
    byte[] forestValue444_53_3;
    javax.crypto.Cipher spill444_0;
    int spill444_1;
    javax.crypto.SecretKeyFactory spill444_2;
    byte[] spill444_3;
    byte[] spill444_4;
    java.lang.String spill444_5;
    int spill444_6;
    long[] spill444_7;
    int spill444_8;
    int spill444_9;
    long spill444_10;
    byte[] spill444_11;
    byte[] spill444_12;
    byte[] spill444_13;
    byte[] spill444_14;
    byte[] spill444_15;
    byte[] spill444_16;
    byte[] spill444_17;
    byte[] spill444_18;
    long spill444_19;
    int spill444_20;
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
    forest_join_53: {
    T = ((long)(((moom._a)(moom._c.a(((long)(-4855243284918039365L)), ((long)(-2533630581689963708L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(266928535738919L)))));
    Y = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.dv.T ^ 89087259823931L);
    spill444_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill444_1 = 2;
    spill444_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp444_9_0 = new byte[8];
    spill444_3 = __stackOp444_9_0;
    (__stackOp444_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue444_36_0 = spill444_0;
    forestValue444_36_1 = spill444_1;
    forestValue444_36_2 = spill444_2;
    forestValue444_36_3 = spill444_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue444_53_0 = forestValue444_36_0;
        forestValue444_53_1 = forestValue444_36_1;
        forestValue444_53_2 = forestValue444_36_2;
        forestValue444_53_3 = forestValue444_36_3;
        break forest_join_53;
    }
    byte[] __stackOp444_10_0 = forestValue444_36_3;
    spill444_4 = __stackOp444_10_0;
    (__stackOp444_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue444_36_3 = spill444_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue444_53_0)).init(((int)(forestValue444_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue444_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue444_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[2];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "¬ÇJó\"\017\013R*¯yÊANW{"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill444_5 = life6_71;
    spill444_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill444_5)).substring(((int)(spill444_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill444_7 = life8_66;
    spill444_8 = (life5_68++);
    long __stackOp444_16_0 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    int __stackOp444_16_1 = -1;
    spill444_9 = __stackOp444_16_1;
    spill444_10 = __stackOp444_16_0;
    recovery.source.CarrierOps.discard(__stackOp444_16_1);
    life10_160 = spill444_10;
    byte[] __stackOp444_18_0 = new byte[8];
    spill444_11 = __stackOp444_18_0;
    (__stackOp444_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp444_19_0 = spill444_11;
    spill444_12 = __stackOp444_19_0;
    (__stackOp444_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp444_20_0 = spill444_12;
    spill444_13 = __stackOp444_20_0;
    (__stackOp444_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp444_21_0 = spill444_13;
    spill444_14 = __stackOp444_21_0;
    (__stackOp444_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp444_22_0 = spill444_14;
    spill444_15 = __stackOp444_22_0;
    (__stackOp444_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp444_23_0 = spill444_15;
    spill444_16 = __stackOp444_23_0;
    (__stackOp444_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp444_24_0 = spill444_16;
    spill444_17 = __stackOp444_24_0;
    (__stackOp444_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp444_25_0 = spill444_17;
    spill444_18 = __stackOp444_25_0;
    (__stackOp444_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp444_26_0 = spill444_18;
    javax.crypto.Cipher __stackOp444_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp444_26_1)).doFinal(((byte[])(__stackOp444_26_0)));
    int __stackOp444_28_0 = spill444_9;
    long __stackOp444_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill444_19 = __stackOp444_28_1;
    spill444_20 = __stackOp444_28_0;
    recovery.source.CarrierOps.discard(__stackOp444_28_1);
    recovery.source.CarrierOps.discard(spill444_20);
    (spill444_7)[spill444_8] = spill444_19;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    break forest_cycle_76;
    }
    W = ((long[])(life8_66));
    X = ((java.lang.Integer[])(new java.lang.Integer[2]));
    R = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
    S = ((moom.fy)(moom.fy.a(((java.lang.String)("damage")), ((int)(0)), ((int)(2)))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7416_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.dv.T ^ 35169712614425L);
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dv)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dv.R)), ((java.lang.Comparable)(moom.bs.b(((int)((p0 & 3))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dv.S)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(((p0 & __sourceIntrinsic_819466f05fee_originalDynamicSite1412_6(18532, (6621830643694120476L ^ local2))) >> 2)))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int local2 = 0;
    local2 = (local2 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dv.R))))))).b());
    local2 = (local2 | (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dv.S))))))).intValue() << 2));
    return local2;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dv.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3509;
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
            throw new RuntimeException("moom/dv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         X[var3] = var15;
      }

      return X[var3];
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dv.S))))))).intValue();
}


public void c(net.minecraft.world.World p0, moom.DT p1) {
long local3 = (moom.dv.T ^ 45818942995146L);
    ((net.minecraft.world.World)(p0)).b(((int)(__sourceIntrinsic_375e50a0a601_originalDynamicSite1413_1(460, (6949282575288791398L ^ local3)))), ((moom.DT)(p1)), ((int)(0)));
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dv.R, moom.dv.S});
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
return ((1) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue331_19_0;
    boolean spill331_0;
    long life9_3;
    int[] life11_5;
    forward_join_19: {
    forward_join_18: {
    life9_3 = (moom.dv.T ^ 89907512538969L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill331_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue331_19_0 = ((spill331_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill331_0))) {
        break forward_join_18;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.world.IInteractionObject)(new moom.eO(p0, p1))));
    }
    forwardValue331_19_0 = 1;
    }
    return ((forwardValue331_19_0) != 0);
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
java.lang.Object local9 = ((moom.bs)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs())).b__bs();
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6)), ((net.minecraft.entity.EntityLivingBase)(p7))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dv.R)), ((java.lang.Comparable)(local9))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dv.S)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((p6 >> 2)))))));
}


protected void a(net.minecraft.entity.item.EntityFallingBlock p0) {
((net.minecraft.entity.item.EntityFallingBlock)(p0)).h(((boolean)(true)));
    return;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 0))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 1))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 2))));
    return;
}


public net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.dv)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dv.R)), ((java.lang.Comparable)(moom.bs.SOUTH)));
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
long life3_3;
    moom.bs life6_11;
    int[] life5_12;
    forward_join_37: {
    forward_join_29: {
    forward_join_27: {
    life3_3 = (moom.dv.T ^ 25738070860950L);
    int[] spill332_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_11 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.dv.R)))));
    life5_12 = spill332_0;
    if (!((life5_12 != null))) { break forward_join_27; }
    if (!((((moom.bs)(life6_11)).a__bt() == net.minecraft.util.EnumFacing$Axis.X))) { break forward_join_29; }
    ((moom.dv)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-3f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.cp-1f)));
    }
    if (!((life5_12 == null))) { break forward_join_37; }
    }
    ((moom.dv)(this)).a(((float)(0x1.0p-3f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.cp-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7416_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_originalDynamicSite1412_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_originalDynamicSite1413_1(int a0, long a1) throws E;
}
