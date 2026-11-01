package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dk extends net.minecraft.block.BlockDirectional {

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

private static final long U;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

public dk(net.minecraft.block.BlockPlanks$EnumType p0) {
super(moom.fn.d, (p0).a__fm());
    (this).a__Void(((((this.M).a__fE()).a__fE(moom.dk.R, java.lang.Boolean.FALSE)).a__fE(moom.dk.S, java.lang.Boolean.FALSE)).a__fE(moom.dk.T, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(-3942626851699755868L)), ((long)(-1545747286658347752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46259095002869L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.dk.U ^ 116436583191527L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1164_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1164_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1164_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1164_14 = new byte[8];
    (__sourceSpill1164_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1164_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1164_16 = __sourceSpill1164_14;
    ((javax.crypto.Cipher)(__sourceSpill1164_11)).init(((int)(__sourceSpill1164_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1164_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1164_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "yÝxþÈ°ý\025ð\róÐ6íìkVG¬idVqïF'½nÖ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1164_25 = local6_life21;
        int __sourceSpill1164_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1164_25)).substring(((int)(__sourceSpill1164_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1164_30 = local8_life19;
        int __sourceSpill1164_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1164_33 = new byte[8];
        (__sourceSpill1164_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1164_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1164_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1164_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1164_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1164_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1164_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1164_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1164_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1164_34)).doFinal(((byte[])(__sourceSpill1164_33)));
        (__sourceSpill1164_30)[__sourceSpill1164_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ëlÃvL Ó|IXìÝÃO"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1164_38 = local6_life21;
        int __sourceSpill1164_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1164_38)).substring(((int)(__sourceSpill1164_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1164_43 = local8_life19;
        int __sourceSpill1164_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1164_46 = new byte[8];
        (__sourceSpill1164_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1164_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1164_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1164_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1164_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1164_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1164_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1164_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1164_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1164_47)).doFinal(((byte[])(__sourceSpill1164_46)));
        (__sourceSpill1164_43)[__sourceSpill1164_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[6]));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("open")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
    T = ((moom.fv)(moom.fv.a(((java.lang.String)("in_wall")))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7374_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3322_20_0;
    moom.fv forwardValue3322_20_1;
    int forwardValue3322_20_2;
    net.minecraft.block.state.IBlockState forwardValue3322_21_0;
    moom.fv forwardValue3322_21_1;
    net.minecraft.block.state.IBlockState forwardValue3322_22_0;
    moom.fv forwardValue3322_22_1;
    int forwardValue3322_22_2;
    net.minecraft.block.state.IBlockState forwardValue3322_36_0;
    moom.fv forwardValue3322_36_1;
    int forwardValue3322_36_2;
    net.minecraft.block.state.IBlockState forwardValue3322_37_0;
    moom.fv forwardValue3322_37_1;
    net.minecraft.block.state.IBlockState forwardValue3322_38_0;
    moom.fv forwardValue3322_38_1;
    int forwardValue3322_38_2;
    net.minecraft.block.state.IBlockState spill3322_0;
    moom.fv spill3322_1;
    int spill3322_2;
    net.minecraft.block.state.IBlockState spill3322_3;
    moom.fv spill3322_4;
    int spill3322_5;
    long life2_3;
    int[] life4_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.dk.U ^ 56985498983443L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3322_0 = ((net.minecraft.block.state.IBlockState)(((moom.dk)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.Q)), ((java.lang.Comparable)(moom.bs.b(((int)(p0))))));
    spill3322_1 = moom.dk.R;
    spill3322_2 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue3322_20_0 = spill3322_0;
        forwardValue3322_20_1 = spill3322_1;
        forwardValue3322_20_2 = spill3322_2;
        break forward_join_20;
    }
    if (!((spill3322_2 != 0))) {
        forwardValue3322_21_0 = spill3322_0;
        forwardValue3322_21_1 = spill3322_1;
        break forward_join_21;
    }
    forwardValue3322_20_0 = spill3322_0;
    forwardValue3322_20_1 = spill3322_1;
    forwardValue3322_20_2 = 1;
    }
    forwardValue3322_22_0 = forwardValue3322_20_0;
    forwardValue3322_22_1 = forwardValue3322_20_1;
    forwardValue3322_22_2 = forwardValue3322_20_2;
    break forward_join_22;
    }
    forwardValue3322_22_0 = forwardValue3322_21_0;
    forwardValue3322_22_1 = forwardValue3322_21_1;
    forwardValue3322_22_2 = 0;
    }
    spill3322_3 = ((net.minecraft.block.state.IBlockState)(forwardValue3322_22_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3322_22_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3322_22_2)))))));
    spill3322_4 = moom.dk.S;
    spill3322_5 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3322_10(1452, (1758969192592133011L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3322_36_0 = spill3322_3;
        forwardValue3322_36_1 = spill3322_4;
        forwardValue3322_36_2 = spill3322_5;
        break forward_join_36;
    }
    if (!((spill3322_5 != 0))) {
        forwardValue3322_37_0 = spill3322_3;
        forwardValue3322_37_1 = spill3322_4;
        break forward_join_37;
    }
    forwardValue3322_36_0 = spill3322_3;
    forwardValue3322_36_1 = spill3322_4;
    forwardValue3322_36_2 = 1;
    }
    forwardValue3322_38_0 = forwardValue3322_36_0;
    forwardValue3322_38_1 = forwardValue3322_36_1;
    forwardValue3322_38_2 = forwardValue3322_36_2;
    break forward_join_38;
    }
    forwardValue3322_38_0 = forwardValue3322_37_0;
    forwardValue3322_38_1 = forwardValue3322_37_1;
    forwardValue3322_38_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3322_38_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3322_38_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3322_38_2)))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3320_37_0;
    int forwardValue3320_45_0;
    int[] spill3320_0;
    boolean spill3320_1;
    long life2_3;
    int life5_6;
    int life5_14;
    int[] life4_15;
    forward_join_45: {
    forward_join_44: {
    forward_join_37: {
    forward_join_32: {
    life2_3 = (moom.dk.U ^ 69715257255705L);
    spill3320_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life5_14 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dk.Q))))))).b());
    life4_15 = spill3320_0;
    spill3320_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dk.S))))))).booleanValue();
    if (!((life4_15 != null))) {
        forwardValue3320_37_0 = ((spill3320_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill3320_1)) {
        break forward_join_32;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic3320_11(16755, (7498525313645081669L ^ life2_3)));
    }
    forwardValue3320_37_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dk.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_15 != null))) {
        forwardValue3320_45_0 = forwardValue3320_37_0;
        break forward_join_45;
    }
    if (!((forwardValue3320_37_0 != 0))) {
        break forward_join_44;
    }
    life5_14 = (life5_14 | 4);
    }
    forwardValue3320_45_0 = life5_14;
    }
    return forwardValue3320_45_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dk.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9715;
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
            throw new RuntimeException("moom/dk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3321_20_0;
    int forwardValue3321_24_0;
    int forwardValue3321_26_0;
    boolean spill3321_0;
    long life3_3;
    int[] life5_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life3_3 = (moom.dk.U ^ 68442613876017L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3321_0 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch())).a__fn())).b__Boolean();
    if (!((life5_5 != null))) {
        forwardValue3321_20_0 = ((spill3321_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill3321_0)) {
        break forward_join_25;
    }
    forwardValue3321_20_0 = ((super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3321_24_0 = forwardValue3321_20_0;
        break forward_join_24;
    }
    if (!((forwardValue3321_20_0 != 0))) {
        break forward_join_25;
    }
    forwardValue3321_24_0 = 1;
    }
    forwardValue3321_26_0 = forwardValue3321_24_0;
    break forward_join_26;
    }
    forwardValue3321_26_0 = 0;
    }
    return ((forwardValue3321_26_0) != 0);
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
java.lang.Comparable forwardValue3317_19_0;
    moom.CA forwardValue3317_90_0;
    java.lang.Boolean spill3317_0;
    long life4_3;
    int[] life6_5;
    net.minecraft.util.EnumFacing$Axis life7_26;
    forward_join_90: {
    forward_join_58: {
    forward_join_19: {
    forward_join_16: {
    life4_3 = (moom.dk.U ^ 26558782694669L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3317_0 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.R)))));
    if (!((life6_5 != null))) {
        forwardValue3317_19_0 = spill3317_0;
        break forward_join_19;
    }
    if (!(((java.lang.Boolean)(spill3317_0)).booleanValue())) {
        break forward_join_16;
    }
    return null;
    }
    forwardValue3317_19_0 = ((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.Q)));
    }
    life7_26 = ((moom.bs)(((moom.bs)(forwardValue3317_19_0)))).a__bt();
    if (!((life7_26 == net.minecraft.util.EnumFacing$Axis.Z))) {
        break forward_join_58;
    }
    forwardValue3317_90_0 = new moom.CA(((double) ((moom.DT)(p1)).a()), ((double) ((moom.DT)(p1)).b()), ((double) (((float) ((moom.DT)(p1)).c()) + 0x1.8p-2f)), ((double) (((moom.DT)(p1)).a() + 1)), ((double) (((float) ((moom.DT)(p1)).b()) + 0x1.8p0f)), ((double) (((float) ((moom.DT)(p1)).c()) + 0x1.4p-1f)));
    break forward_join_90;
    }
    forwardValue3317_90_0 = new moom.CA(((double) (((float) ((moom.DT)(p1)).a()) + 0x1.8p-2f)), ((double) ((moom.DT)(p1)).b()), ((double) ((moom.DT)(p1)).c()), ((double) (((float) ((moom.DT)(p1)).a()) + 0x1.4p-1f)), ((double) (((float) ((moom.DT)(p1)).b()) + 0x1.8p0f)), ((double) (((moom.DT)(p1)).c() + 1)));
    }
    return forwardValue3317_90_0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
long life3_3;
    net.minecraft.util.EnumFacing$Axis life6_12;
    int[] life5_13;
    forward_join_37: {
    forward_join_29: {
    forward_join_27: {
    life3_3 = (moom.dk.U ^ 65180201686172L);
    int[] spill3879_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_12 = ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.dk.Q))))))).a__bt();
    life5_13 = spill3879_0;
    if (!((life5_13 != null))) { break forward_join_27; }
    if (!((life6_12 == net.minecraft.util.EnumFacing$Axis.Z))) { break forward_join_29; }
    ((moom.dk)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-2f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-1f)));
    }
    if (!((life5_13 == null))) { break forward_join_37; }
    }
    ((moom.dk)(this)).a(((float)(0x1.8p-2f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.4p-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dk.Q, moom.dk.R, moom.dk.S, moom.dk.T});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.util.EnumFacing$Axis forwardValue3316_37_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3316_37_1;
    net.minecraft.block.state.IBlockState forwardValue3316_60_0;
    net.minecraft.block.state.IBlockState forwardValue3316_62_0;
    int[] spill3316_0;
    net.minecraft.util.EnumFacing$Axis spill3316_1;
    net.minecraft.util.EnumFacing$Axis spill3316_2;
    net.minecraft.block.state.IBlockState spill3316_3;
    net.minecraft.block.state.IBlockState spill3316_4;
    net.minecraft.block.state.IBlockState spill3316_5;
    net.minecraft.block.state.IBlockState spill3316_6;
    long life4_3;
    net.minecraft.util.EnumFacing$Axis life7_10;
    int[] life6_11;
    forward_join_62: {
    forward_join_61: {
    forward_join_60: {
    forward_join_56: {
    forward_join_37: {
    forward_join_35: {
    life4_3 = (moom.dk.U ^ 117802053576335L);
    spill3316_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.dk.Q))))))).a__bt();
    life6_11 = spill3316_0;
    spill3316_1 = life7_10;
    spill3316_2 = net.minecraft.util.EnumFacing$Axis.Z;
    if (!((life6_11 != null))) {
        forwardValue3316_37_0 = spill3316_1;
        forwardValue3316_37_1 = spill3316_2;
        break forward_join_37;
    }
    if (!((spill3316_1 == spill3316_2))) {
        break forward_join_35;
    }
    spill3316_3 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).e())));
    if (!((life6_11 != null))) {
        forwardValue3316_60_0 = spill3316_3;
        break forward_join_60;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3316_3)).a__ch() != net.minecraft.init.Blocks.bO))) {
        break forward_join_56;
    }
    spill3316_4 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).f())));
    if (!((life6_11 != null))) {
        forwardValue3316_60_0 = spill3316_4;
        break forward_join_60;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3316_4)).a__ch() != net.minecraft.init.Blocks.bO))) {
        break forward_join_56;
    }
    }
    forwardValue3316_37_0 = life7_10;
    forwardValue3316_37_1 = net.minecraft.util.EnumFacing$Axis.X;
    }
    if (!((forwardValue3316_37_0 == forwardValue3316_37_1))) {
        break forward_join_61;
    }
    spill3316_5 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).c__DT())));
    if (!((life6_11 != null))) {
        forwardValue3316_60_0 = spill3316_5;
        break forward_join_60;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3316_5)).a__ch() != net.minecraft.init.Blocks.bO))) {
        break forward_join_56;
    }
    spill3316_6 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).d__DT())));
    if (!((life6_11 != null))) {
        forwardValue3316_62_0 = spill3316_6;
        break forward_join_62;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3316_6)).a__ch() == net.minecraft.init.Blocks.bO))) {
        break forward_join_61;
    }
    }
    forwardValue3316_60_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.T)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    }
    p0 = forwardValue3316_60_0;
    }
    forwardValue3316_62_0 = p0;
    }
    return forwardValue3316_62_0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3318_14_0;
    int forwardValue3318_25_0;
    int forwardValue3318_69_0;
    int forwardValue3318_113_0;
    int forwardValue3318_130_0;
    boolean spill3318_0;
    int spill3318_1;
    boolean spill3318_2;
    boolean spill3318_3;
    boolean spill3318_4;
    boolean spill3318_5;
    boolean spill3318_6;
    long life5_3;
    int[] life7_5;
    int life8_20;
    forward_join_131: {
    forward_join_130: {
    forward_join_113: {
    forward_join_112: {
    forward_join_69: {
    forward_join_68: {
    forward_join_25: {
    forward_join_24: {
    forward_join_14: {
    life5_3 = (moom.dk.U ^ 9165719274053L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3318_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3318_14_0 = ((spill3318_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill3318_0))) {
        break forward_join_131;
    }
    forwardValue3318_14_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    life8_20 = forwardValue3318_14_0;
    spill3318_1 = life8_20;
    if (!((life7_5 != null))) {
        forwardValue3318_25_0 = spill3318_1;
        break forward_join_25;
    }
    if (!((spill3318_1 == 0))) {
        break forward_join_24;
    }
    spill3318_2 = ((net.minecraft.block.Block)(p3)).l();
    if (!((life7_5 != null))) {
        forwardValue3318_25_0 = ((spill3318_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill3318_2)) {
        break forward_join_131;
    }
    }
    forwardValue3318_25_0 = life8_20;
    }
    if (!((life7_5 != null))) {
        forwardValue3318_69_0 = forwardValue3318_25_0;
        break forward_join_69;
    }
    if (!((forwardValue3318_25_0 != 0))) {
        break forward_join_68;
    }
    spill3318_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.R))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3318_69_0 = ((spill3318_3) ? 1 : 0);
        break forward_join_69;
    }
    if (!((!spill3318_3))) {
        break forward_join_68;
    }
    spill3318_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.S))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3318_69_0 = ((spill3318_4) ? 1 : 0);
        break forward_join_69;
    }
    if (!((!spill3318_4))) {
        break forward_join_68;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_ae5eabbf4271_invokedynamic3318_25(3521, (5421777669219179948L ^ life5_3)))), ((moom.DT)(p1)), ((int)(0)));
    if (!((life7_5 == null))) {
        break forward_join_131;
    }
    }
    forwardValue3318_69_0 = life8_20;
    }
    if (!((life7_5 != null))) {
        forwardValue3318_113_0 = forwardValue3318_69_0;
        break forward_join_113;
    }
    if (!((forwardValue3318_69_0 == 0))) {
        break forward_join_112;
    }
    spill3318_5 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.R))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3318_113_0 = ((spill3318_5) ? 1 : 0);
        break forward_join_113;
    }
    if (!(spill3318_5)) {
        break forward_join_112;
    }
    spill3318_6 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.S))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue3318_113_0 = ((spill3318_6) ? 1 : 0);
        break forward_join_113;
    }
    if (!(spill3318_6)) {
        break forward_join_112;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_ae5eabbf4271_invokedynamic3318_44(14378, (3576784281441527878L ^ life5_3)))), ((moom.DT)(p1)), ((int)(0)));
    if (!((life7_5 == null))) {
        break forward_join_131;
    }
    }
    forwardValue3318_113_0 = life8_20;
    }
    if (!((life7_5 != null))) {
        forwardValue3318_130_0 = forwardValue3318_113_0;
        break forward_join_130;
    }
    if (!((forwardValue3318_113_0 != ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.S))))))).booleanValue()) ? 1 : 0)))) {
        break forward_join_131;
    }
    forwardValue3318_130_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life8_20))))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3318_130_0);
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dk)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.Q)), ((java.lang.Comparable)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs()))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.T)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.dk.R))))))).booleanValue())) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3319_24_0;
    net.minecraft.block.state.IBlockState forwardValue3319_49_0;
    net.minecraft.world.World forwardValue3319_71_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3319_71_1;
    int forwardValue3319_71_2;
    net.minecraft.world.World forwardValue3319_72_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3319_72_1;
    net.minecraft.world.World forwardValue3319_77_0;
    net.minecraft.entity.player.EntityPlayer forwardValue3319_77_1;
    int forwardValue3319_77_2;
    boolean spill3319_0;
    net.minecraft.block.state.IBlockState spill3319_1;
    net.minecraft.world.World spill3319_2;
    net.minecraft.entity.player.EntityPlayer spill3319_3;
    boolean spill3319_4;
    long life9_3;
    int[] life11_5;
    moom.bs life12_34;
    forward_join_77: {
    forward_join_72: {
    forward_join_71: {
    forward_join_56: {
    forward_join_49: {
    forward_join_45: {
    forward_join_27: {
    forward_join_24: {
    life9_3 = (moom.dk.U ^ 138445436372819L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3319_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.R))))))).booleanValue();
    if (!((life11_5 != null))) {
        forwardValue3319_24_0 = ((spill3319_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill3319_0)) {
        break forward_join_27;
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    forwardValue3319_24_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3319_24_0);
    if (!((life11_5 == null))) {
        break forward_join_56;
    }
    }
    life12_34 = moom.bs.a(((double)(((double) ((net.minecraft.entity.player.EntityPlayer)(p3)).w))));
    spill3319_1 = p2;
    if (!((life11_5 != null))) {
        forwardValue3319_49_0 = spill3319_1;
        break forward_join_49;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3319_1)).a(((net.minecraft.block.properties.IProperty)(moom.dk.Q))) == ((moom.bs)(life12_34)).a__bs()))) {
        break forward_join_45;
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.Q)), ((java.lang.Comparable)(life12_34)));
    }
    forwardValue3319_49_0 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.dk.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    }
    p2 = forwardValue3319_49_0;
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)));
    }
    spill3319_2 = p0;
    spill3319_3 = p3;
    spill3319_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.dk.R))))))).booleanValue();
    if (!((life11_5 != null))) {
        forwardValue3319_71_0 = spill3319_2;
        forwardValue3319_71_1 = spill3319_3;
        forwardValue3319_71_2 = ((spill3319_4) ? 1 : 0);
        break forward_join_71;
    }
    if (!(spill3319_4)) {
        forwardValue3319_72_0 = spill3319_2;
        forwardValue3319_72_1 = spill3319_3;
        break forward_join_72;
    }
    forwardValue3319_71_0 = spill3319_2;
    forwardValue3319_71_1 = spill3319_3;
    forwardValue3319_71_2 = __sourceIntrinsic_1ca9d0413800_invokedynamic3319_29(12971, (2714395064728725462L ^ life9_3));
    }
    forwardValue3319_77_0 = forwardValue3319_71_0;
    forwardValue3319_77_1 = forwardValue3319_71_1;
    forwardValue3319_77_2 = forwardValue3319_71_2;
    break forward_join_77;
    }
    forwardValue3319_77_0 = forwardValue3319_72_0;
    forwardValue3319_77_1 = forwardValue3319_72_1;
    forwardValue3319_77_2 = __sourceIntrinsic_1ca9d0413800_invokedynamic3319_30(13672, (7282335762519433238L ^ life9_3));
    }
    ((net.minecraft.world.World)(forwardValue3319_77_0)).a(((net.minecraft.entity.player.EntityPlayer)(forwardValue3319_77_1)), ((int)(forwardValue3319_77_2)), ((moom.DT)(p1)), ((int)(0)));
    return ((1) != 0);
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_ae5eabbf4271_invokedynamic3318_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae5eabbf4271_invokedynamic3318_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ca9d0413800_invokedynamic3319_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ca9d0413800_invokedynamic3319_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7374_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3320_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3322_10(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
