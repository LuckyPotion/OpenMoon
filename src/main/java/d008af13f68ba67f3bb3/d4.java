package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class d4 extends moom.d2 {

public static final moom.fw<net.minecraft.block.BlockRailBase$EnumRailDirection> R;

public static final moom.fv S;

private static final long U;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

public d4() {
super(true);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.d4.S, java.lang.Boolean.FALSE)).a__fE(moom.d4.R, net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH));
    (this).a(true);
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(9110689734610161114L)), ((long)(-5444139680971687528L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277968507439241L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.d4.U ^ 112344499072060L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1144_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1144_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1144_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1144_14 = new byte[8];
    (__sourceSpill1144_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1144_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1144_16 = __sourceSpill1144_14;
    ((javax.crypto.Cipher)(__sourceSpill1144_11)).init(((int)(__sourceSpill1144_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1144_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1144_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "X,Ê&ô¡p¡)\017Ã#Ö²:a\027W úi5g×{ð\036¡8"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1144_25 = local6_life21;
        int __sourceSpill1144_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1144_25)).substring(((int)(__sourceSpill1144_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1144_30 = local8_life19;
        int __sourceSpill1144_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1144_33 = new byte[8];
        (__sourceSpill1144_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1144_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1144_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1144_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1144_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1144_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1144_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1144_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1144_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1144_34)).doFinal(((byte[])(__sourceSpill1144_33)));
        (__sourceSpill1144_30)[__sourceSpill1144_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\007\0215\027 <%ãæºÎXyÚ>"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1144_38 = local6_life21;
        int __sourceSpill1144_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1144_38)).substring(((int)(__sourceSpill1144_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1144_43 = local8_life19;
        int __sourceSpill1144_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1144_46 = new byte[8];
        (__sourceSpill1144_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1144_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1144_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1144_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1144_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1144_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1144_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1144_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1144_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1144_47)).doFinal(((byte[])(__sourceSpill1144_46)));
        (__sourceSpill1144_43)[__sourceSpill1144_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[6]));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("shape")), ((java.lang.Class)(net.minecraft.block.BlockRailBase$EnumRailDirection.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1144_53())))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3189_33_0;
    int[] spill3189_0;
    boolean spill3189_1;
    long life2_3;
    int life5_5;
    int life5_14;
    int[] life4_15;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (moom.d4.U ^ 72406535342649L);
    life5_5 = 0;
    spill3189_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_14 = (life5_5 | ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d4.R))))))).a());
    life4_15 = spill3189_0;
    spill3189_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d4.S))))))).booleanValue();
    if (!((life4_15 != null))) {
        forwardValue3189_33_0 = ((spill3189_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill3189_1)) {
        break forward_join_32;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3189_11(7123, (9205714450860022154L ^ life2_3)));
    }
    forwardValue3189_33_0 = life5_14;
    }
    return forwardValue3189_33_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3193_30_0;
    moom.fv forwardValue3193_30_1;
    int forwardValue3193_30_2;
    net.minecraft.block.state.IBlockState forwardValue3193_31_0;
    moom.fv forwardValue3193_31_1;
    net.minecraft.block.state.IBlockState forwardValue3193_32_0;
    moom.fv forwardValue3193_32_1;
    int forwardValue3193_32_2;
    net.minecraft.block.state.IBlockState spill3193_0;
    moom.fv spill3193_1;
    int spill3193_2;
    long life2_3;
    int[] life4_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (moom.d4.U ^ 85136261116211L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3193_0 = ((net.minecraft.block.state.IBlockState)(((moom.d4)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d4.R)), ((java.lang.Comparable)(net.minecraft.block.BlockRailBase$EnumRailDirection.a(((int)((p0 & __sourceIntrinsic_819466f05fee_invokedynamic3193_4(2950, (2273738570652086992L ^ life2_3)))))))));
    spill3193_1 = moom.d4.S;
    spill3193_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3193_8(7139, (9020101961797165745L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3193_30_0 = spill3193_0;
        forwardValue3193_30_1 = spill3193_1;
        forwardValue3193_30_2 = spill3193_2;
        break forward_join_30;
    }
    if (!((spill3193_2 > 0))) {
        forwardValue3193_31_0 = spill3193_0;
        forwardValue3193_31_1 = spill3193_1;
        break forward_join_31;
    }
    forwardValue3193_30_0 = spill3193_0;
    forwardValue3193_30_1 = spill3193_1;
    forwardValue3193_30_2 = 1;
    }
    forwardValue3193_32_0 = forwardValue3193_30_0;
    forwardValue3193_32_1 = forwardValue3193_30_1;
    forwardValue3193_32_2 = forwardValue3193_30_2;
    break forward_join_32;
    }
    forwardValue3193_32_0 = forwardValue3193_31_0;
    forwardValue3193_32_1 = forwardValue3193_31_1;
    forwardValue3193_32_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3193_32_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3193_32_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3193_32_2)))))));
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
java.util.List forwardValue3191_47_0;
    int forwardValue3191_60_0;
    boolean spill3191_0;
    java.util.List spill3191_1;
    boolean spill3191_2;
    long life3_3;
    int[] life5_5;
    java.util.List life6_26;
    java.util.List life7_55;
    forward_join_60: {
    forward_join_59: {
    forward_join_47: {
    forward_join_36: {
    life3_3 = (moom.d4.U ^ 64344798481860L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3191_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.d4.S))))))).booleanValue();
    if (!((life5_5 != null))) {
        forwardValue3191_60_0 = ((spill3191_0) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill3191_0)) {
        break forward_join_59;
    }
    life6_26 = ((moom.d4)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((java.lang.Class)(moom.tC.class)), ((com.google.common.base.Predicate[])(new com.google.common.base.Predicate[0])));
    spill3191_1 = life6_26;
    if (!((life5_5 != null))) {
        forwardValue3191_47_0 = spill3191_1;
        break forward_join_47;
    }
    if (!((!((java.util.List)(spill3191_1)).isEmpty()))) {
        break forward_join_36;
    }
    return ((moom.qV)(((moom.tC)(((moom.tC)(((java.util.List)(life6_26)).get(((int)(0))))))).a__qV())).a();
    }
    forwardValue3191_47_0 = ((moom.d4)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((java.lang.Class)(net.minecraft.entity.item.EntityMinecart.class)), ((com.google.common.base.Predicate[])(new com.google.common.base.Predicate[] {moom.CY.c})));
    }
    life7_55 = forwardValue3191_47_0;
    spill3191_2 = ((java.util.List)(life7_55)).isEmpty();
    if (!((life5_5 != null))) {
        forwardValue3191_60_0 = ((spill3191_2) ? 1 : 0);
        break forward_join_60;
    }
    if (!((!spill3191_2))) {
        break forward_join_59;
    }
    return moom.v8.a(((net.minecraft.inventory.IInventory)(((net.minecraft.inventory.IInventory)(((java.util.List)(life7_55)).get(((int)(0))))))));
    }
    forwardValue3191_60_0 = 0;
    }
    return forwardValue3191_60_0;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
super.b__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    ((moom.d4)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.d4.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4763;
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
            throw new RuntimeException("moom/d4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7223_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/d4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3190_15_0;
    int forwardValue3190_26_0;
    boolean spill3190_0;
    long life5_3;
    int[] life7_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_16: {
    forward_join_15: {
    life5_3 = (moom.d4.U ^ 16569263965534L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3190_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d4.S))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3190_15_0 = ((spill3190_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill3190_0))) {
        break forward_join_16;
    }
    forwardValue3190_15_0 = 0;
    }
    forwardValue3190_26_0 = forwardValue3190_15_0;
    break forward_join_26;
    }
    if (!((p3 == moom.bs.UP))) {
        break forward_join_25;
    }
    forwardValue3190_26_0 = __sourceIntrinsic_b0b3991ff8d9_invokedynamic3190_8(15644, (5458136998810546212L ^ life5_3));
    break forward_join_26;
    }
    forwardValue3190_26_0 = 0;
    }
    return forwardValue3190_26_0;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3192_16_0;
    boolean spill3192_0;
    long life5_3;
    int[] life7_5;
    forward_join_22: {
    forward_join_16: {
    life5_3 = (moom.d4.U ^ 109537158140900L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3192_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3192_16_0 = ((spill3192_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3192_0))) {
        break forward_join_22;
    }
    forwardValue3192_16_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d4.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue3192_16_0 != 0))) {
        break forward_join_22;
    }
    ((moom.d4)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public boolean l() {
return ((1) != 0);
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue3194_30_0;
    int forwardValue3194_60_0;
    int forwardValue3194_90_0;
    int[] spill3194_0;
    boolean spill3194_1;
    int spill3194_2;
    int spill3194_3;
    long life4_3;
    int life7_10;
    int[] life6_11;
    int life8_13;
    java.util.List life9_21;
    forward_join_98: {
    forward_join_90: {
    forward_join_89: {
    forward_join_60: {
    forward_join_59: {
    forward_join_30: {
    forward_join_29: {
    life4_3 = (moom.d4.U ^ 91616649899512L);
    spill3194_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d4.S))))))).booleanValue()) ? 1 : 0);
    life6_11 = spill3194_0;
    life8_13 = 0;
    life9_21 = ((moom.d4)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((java.lang.Class)(net.minecraft.entity.item.EntityMinecart.class)), ((com.google.common.base.Predicate[])(new com.google.common.base.Predicate[0])));
    spill3194_1 = ((java.util.List)(life9_21)).isEmpty();
    if (!((life6_11 != null))) {
        forwardValue3194_30_0 = ((spill3194_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!((!spill3194_1))) {
        break forward_join_29;
    }
    life8_13 = 1;
    }
    forwardValue3194_30_0 = life8_13;
    }
    if (!((life6_11 != null))) {
        forwardValue3194_60_0 = forwardValue3194_30_0;
        break forward_join_60;
    }
    if (!((forwardValue3194_30_0 != 0))) {
        break forward_join_59;
    }
    spill3194_2 = life7_10;
    if (!((life6_11 != null))) {
        forwardValue3194_60_0 = spill3194_2;
        break forward_join_60;
    }
    if (!((spill3194_2 == 0))) {
        break forward_join_59;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d4.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(3)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).b__DT())), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    }
    forwardValue3194_60_0 = life8_13;
    }
    if (!((life6_11 != null))) {
        forwardValue3194_90_0 = forwardValue3194_60_0;
        break forward_join_90;
    }
    if (!((forwardValue3194_60_0 == 0))) {
        break forward_join_89;
    }
    spill3194_3 = life7_10;
    if (!((life6_11 != null))) {
        forwardValue3194_90_0 = spill3194_3;
        break forward_join_90;
    }
    if (!((spill3194_3 != 0))) {
        break forward_join_89;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d4.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(3)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).b__DT())), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    }
    forwardValue3194_90_0 = life8_13;
    }
    if (!((forwardValue3194_90_0 != 0))) {
        break forward_join_98;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.d4)(this)).a(((net.minecraft.world.World)(p0))))));
    }
    ((net.minecraft.world.World)(p0)).d(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d4.R, moom.d4.S});
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
int forwardValue3188_16_0;
    boolean spill3188_0;
    long life5_3;
    int[] life7_5;
    forward_join_22: {
    forward_join_16: {
    life5_3 = (moom.d4.U ^ 22410968967442L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3188_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3188_16_0 = ((spill3188_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3188_0))) {
        break forward_join_22;
    }
    forwardValue3188_16_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d4.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue3188_16_0 == 0))) {
        break forward_join_22;
    }
    ((moom.d4)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public int a(net.minecraft.world.World p0) {
long local2 = (moom.d4.U ^ 111000708115914L);
    return __sourceIntrinsic_a3a6e3090437_originalDynamicSite1406_1(23142, (4778678755703635912L ^ local2));
}


public net.minecraft.block.properties.IProperty<net.minecraft.block.BlockRailBase$EnumRailDirection> a__ft() {
return moom.d4.R;
}


private moom.CA a(moom.DT p0) {
float local2 = 0x1.99999ap-3f;
    return new moom.CA(((double) (((float) ((moom.DT)(p0)).a()) + 0x1.99999ap-3f)), ((double) ((moom.DT)(p0)).b()), ((double) (((float) ((moom.DT)(p0)).c()) + 0x1.99999ap-3f)), ((double) (((float) (((moom.DT)(p0)).a() + 1)) - 0x1.99999ap-3f)), ((double) (((float) (((moom.DT)(p0)).b() + 1)) - 0x1.99999ap-3f)), ((double) (((float) (((moom.DT)(p0)).c() + 1)) - 0x1.99999ap-3f)));
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
int forwardValue3187_19_0;
    int forwardValue3187_21_0;
    boolean spill3187_0;
    long life5_3;
    int[] life7_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (moom.d4.U ^ 29076213774699L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3187_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d4.S))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3187_19_0 = ((spill3187_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill3187_0)) {
        break forward_join_20;
    }
    forwardValue3187_19_0 = __sourceIntrinsic_0beb55581d70_invokedynamic3187_7(1985, (1544361989522241229L ^ life5_3));
    }
    forwardValue3187_21_0 = forwardValue3187_19_0;
    break forward_join_21;
    }
    forwardValue3187_21_0 = 0;
    }
    return forwardValue3187_21_0;
}


protected <T extends net.minecraft.entity.item.EntityMinecart> java.util.List<T> a(net.minecraft.world.World p0, moom.DT p1, java.lang.Class<T> p2, com.google.common.base.Predicate<net.minecraft.entity.Entity>[] p3) {
long local5 = (moom.d4.U ^ 94608634156955L);
    java.lang.Object local7 = ((moom.d4)(this)).a(((moom.DT)(p1)));
    return (((p3).length != 1) ? ((net.minecraft.world.World)(p0)).a(((java.lang.Class)(p2)), ((moom.CA)(local7))) : ((net.minecraft.world.World)(p0)).a(((java.lang.Class)(p2)), ((moom.CA)(local7)), ((com.google.common.base.Predicate)((p3)[0]))));
}


public boolean r() {
return ((1) != 0);
}


private static boolean lambda$static$0(net.minecraft.block.BlockRailBase$EnumRailDirection p0) {
net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3195_13_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3195_13_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3195_18_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3195_18_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3195_23_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3195_23_1;
    int forwardValue3195_27_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3195_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3195_1;
    long life1_3;
    int[] life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.d4.U ^ 139286658035292L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3195_0 = p0;
    spill3195_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_EAST;
    if (!((life3_5 != null))) {
        forwardValue3195_13_0 = spill3195_0;
        forwardValue3195_13_1 = spill3195_1;
        break forward_join_13;
    }
    if (!((spill3195_0 != spill3195_1))) {
        break forward_join_26;
    }
    forwardValue3195_13_0 = p0;
    forwardValue3195_13_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_WEST;
    }
    if (!((life3_5 != null))) {
        forwardValue3195_18_0 = forwardValue3195_13_0;
        forwardValue3195_18_1 = forwardValue3195_13_1;
        break forward_join_18;
    }
    if (!((forwardValue3195_13_0 != forwardValue3195_13_1))) {
        break forward_join_26;
    }
    forwardValue3195_18_0 = p0;
    forwardValue3195_18_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_EAST;
    }
    if (!((life3_5 != null))) {
        forwardValue3195_23_0 = forwardValue3195_18_0;
        forwardValue3195_23_1 = forwardValue3195_18_1;
        break forward_join_23;
    }
    if (!((forwardValue3195_18_0 != forwardValue3195_18_1))) {
        break forward_join_26;
    }
    forwardValue3195_23_0 = p0;
    forwardValue3195_23_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_WEST;
    }
    if (!((forwardValue3195_23_0 != forwardValue3195_23_1))) {
        break forward_join_26;
    }
    forwardValue3195_27_0 = 1;
    break forward_join_27;
    }
    forwardValue3195_27_0 = 0;
    }
    return ((forwardValue3195_27_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1144_53() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3189_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3193_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3193_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7223_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b0b3991ff8d9_invokedynamic3190_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_originalDynamicSite1406_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0beb55581d70_invokedynamic3187_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
