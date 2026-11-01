package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class eb extends net.minecraft.block.BlockRotatedPillar {

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

public eb() {
super(moom.fn.b, moom.fm.t);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.eb.Q, net.minecraft.util.EnumFacing$Axis.Y));
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-6832337787278493444L)), ((long)(7827871592146349741L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47696448841909L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.eb.R ^ 6689781649460L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill827_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill827_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill827_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill827_14 = new byte[8];
    (__sourceSpill827_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill827_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation827_16 = __sourceSpill827_14;
    ((javax.crypto.Cipher)(__sourceSpill827_11)).init(((int)(__sourceSpill827_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill827_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation827_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\005Aÿ\032\027bGõ\034JhÎ7Gä3O'¤ùý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill827_25 = local6_life21;
        int __sourceSpill827_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill827_25)).substring(((int)(__sourceSpill827_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill827_30 = local8_life19;
        int __sourceSpill827_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill827_33 = new byte[8];
        (__sourceSpill827_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill827_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill827_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill827_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill827_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill827_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill827_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill827_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill827_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill827_34)).doFinal(((byte[])(__sourceSpill827_33)));
        (__sourceSpill827_30)[__sourceSpill827_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7524_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/eb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6865;
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
            throw new RuntimeException("moom/eb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.eb.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
int forwardValue3450_31_0;
    int forwardValue3450_31_1;
    int[] spill3450_0;
    int spill3450_1;
    int spill3450_2;
    long life2_3;
    net.minecraft.util.EnumFacing$Axis life5_6;
    int[] life4_7;
    int life6_15;
    forward_join_34: {
    forward_join_31: {
    forward_join_25: {
    life2_3 = (moom.eb.R ^ 111378557115931L);
    spill3450_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = net.minecraft.util.EnumFacing$Axis.Y;
    life4_7 = spill3450_0;
    life6_15 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3450_3(28412, (2199544560393166817L ^ life2_3)));
    spill3450_1 = life6_15;
    spill3450_2 = 4;
    if (!((life4_7 != null))) {
        forwardValue3450_31_0 = spill3450_1;
        forwardValue3450_31_1 = spill3450_2;
        break forward_join_31;
    }
    if (!((spill3450_1 == spill3450_2))) {
        break forward_join_25;
    }
    life5_6 = net.minecraft.util.EnumFacing$Axis.X;
    if (!((life4_7 == null))) {
        break forward_join_34;
    }
    }
    forwardValue3450_31_0 = life6_15;
    forwardValue3450_31_1 = __sourceIntrinsic_819466f05fee_invokedynamic3450_5(27305, (1684533727707438005L ^ life2_3));
    }
    if (!((forwardValue3450_31_0 == forwardValue3450_31_1))) {
        break forward_join_34;
    }
    life5_6 = net.minecraft.util.EnumFacing$Axis.Z;
    }
    return ((net.minecraft.block.state.IBlockState)(((moom.eb)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eb.Q)), ((java.lang.Comparable)(life5_6)));
}


public int b(net.minecraft.block.state.IBlockState p0) {
net.minecraft.util.EnumFacing$Axis forwardValue3449_26_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3449_26_1;
    int[] spill3449_0;
    net.minecraft.util.EnumFacing$Axis spill3449_1;
    net.minecraft.util.EnumFacing$Axis spill3449_2;
    long life2_3;
    int life5_6;
    int[] life4_7;
    net.minecraft.util.EnumFacing$Axis life6_12;
    forward_join_35: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (moom.eb.R ^ 116515854443793L);
    spill3449_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3449_0;
    life6_12 = ((net.minecraft.util.EnumFacing$Axis)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eb.Q)))));
    spill3449_1 = life6_12;
    spill3449_2 = net.minecraft.util.EnumFacing$Axis.X;
    if (!((life4_7 != null))) {
        forwardValue3449_26_0 = spill3449_1;
        forwardValue3449_26_1 = spill3449_2;
        break forward_join_26;
    }
    if (!((spill3449_1 == spill3449_2))) {
        break forward_join_24;
    }
    life5_6 = (life5_6 | 4);
    if (!((life4_7 == null))) {
        break forward_join_35;
    }
    }
    forwardValue3449_26_0 = life6_12;
    forwardValue3449_26_1 = net.minecraft.util.EnumFacing$Axis.Z;
    }
    if (!((forwardValue3449_26_0 == forwardValue3449_26_1))) {
        break forward_join_35;
    }
    life5_6 = (life5_6 | __sourceIntrinsic_8db5871551d4_invokedynamic3449_7(22099, (5820804077002742854L ^ life2_3)));
    }
    return life5_6;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6)), ((net.minecraft.entity.EntityLivingBase)(p7))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eb.Q)), ((java.lang.Comparable)(((moom.bs)(p2)).a__bt())));
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
return new net.minecraft.item.ItemStack(net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))), 1, 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.eb.Q});
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7524_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3450_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3450_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3449_7(int a0, long a1) throws E;
}
