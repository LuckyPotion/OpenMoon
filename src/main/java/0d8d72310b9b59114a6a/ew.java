package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ew extends net.minecraft.block.Block {

public static moom.fx Q;

public static moom.fw<moom.al> R;

public static moom.fw<net.minecraft.block.BlockStairs$EnumShape> S;

private static int[][] T;

private net.minecraft.block.Block U;

private net.minecraft.block.state.IBlockState V;

private boolean W;

private int X;

private static long Y;

private static long[] Z;

private static java.lang.Integer[] bb;

private static java.util.Map fb;

protected ew(net.minecraft.block.state.IBlockState p0) { super((moom.fn)null); }


private static void __sourceConstructorBody_5e7013c746e33552(moom.ew receiver, net.minecraft.block.state.IBlockState p0) throws Throwable {

long local2 = (moom.ew.Y ^ 36964743105448L);

    moom.ew.__sourceConstructorInit_5e7013c746e33552_0(((moom.ew)(receiver)), ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p0)).a__ch())).J)));

    ((moom.ew)(receiver)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.ew)(receiver)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.Q)), ((java.lang.Comparable)(moom.bs.NORTH))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.R)), ((java.lang.Comparable)(moom.al.BOTTOM))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.STRAIGHT))))));

    ((moom.ew)(receiver)).U = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(p0)).a__ch()));

    ((moom.ew)(receiver)).V = ((net.minecraft.block.state.IBlockState)(p0));

    ((moom.ew)(receiver)).c(((float)(((net.minecraft.block.Block)(((moom.ew)(receiver)).U)).w)));

    ((moom.ew)(receiver)).b(((float)((((net.minecraft.block.Block)(((moom.ew)(receiver)).U)).x / 0x1.8p1f))));

    ((moom.ew)(receiver)).a(((moom.eJ)(((net.minecraft.block.Block)(((moom.ew)(receiver)).U)).H)));

    ((moom.ew)(receiver)).b(((int)(__sourceIntrinsic_5e7013c746e33552_originalDynamicSite2705_28(19806, (3111241830847318591L ^ local2)))));

    ((moom.ew)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.b)));

    return;

}



static {
javax.crypto.Cipher forestValue458_36_0;
    int forestValue458_36_1;
    javax.crypto.SecretKeyFactory forestValue458_36_2;
    byte[] forestValue458_36_3;
    javax.crypto.Cipher forestValue458_53_0;
    int forestValue458_53_1;
    javax.crypto.SecretKeyFactory forestValue458_53_2;
    byte[] forestValue458_53_3;
    long[] forestValue458_157_0;
    int forestValue458_157_1;
    long forestValue458_157_2;
    int forestValue458_157_3;
    long[] forestValue458_300_0;
    int forestValue458_300_1;
    long forestValue458_300_2;
    long[] forestValue458_312_0;
    int forestValue458_312_1;
    long forestValue458_312_2;
    javax.crypto.Cipher spill458_0;
    int spill458_1;
    javax.crypto.SecretKeyFactory spill458_2;
    byte[] spill458_3;
    byte[] spill458_4;
    java.lang.String spill458_5;
    int spill458_6;
    int spill458_7;
    long spill458_8;
    byte[] spill458_9;
    byte[] spill458_10;
    byte[] spill458_11;
    byte[] spill458_12;
    byte[] spill458_13;
    byte[] spill458_14;
    byte[] spill458_15;
    byte[] spill458_16;
    long spill458_17;
    int spill458_18;
    java.lang.String spill458_19;
    int spill458_20;
    long[] spill458_21;
    int spill458_22;
    long spill458_23;
    int spill458_24;
    int[][] spill458_25;
    int[][] spill458_26;
    int spill458_27;
    int[] spill458_28;
    int[] spill458_29;
    int[][] spill458_30;
    int[][] spill458_31;
    int spill458_32;
    int[] spill458_33;
    int[] spill458_34;
    int[][] spill458_35;
    int[][] spill458_36;
    int spill458_37;
    int[] spill458_38;
    int[] spill458_39;
    int[][] spill458_40;
    int[][] spill458_41;
    int spill458_42;
    int[] spill458_43;
    int[] spill458_44;
    int[][] spill458_45;
    int[][] spill458_46;
    int spill458_47;
    int[] spill458_48;
    int[] spill458_49;
    int[][] spill458_50;
    int[][] spill458_51;
    int spill458_52;
    int[] spill458_53;
    int[] spill458_54;
    int[][] spill458_55;
    int[][] spill458_56;
    int spill458_57;
    int[] spill458_58;
    int[] spill458_59;
    int[][] spill458_60;
    int[][] spill458_61;
    int spill458_62;
    int[] spill458_63;
    int[] spill458_64;
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
    Y = ((long)(((moom._a)(moom._c.a(((long)(2368786111699632385L)), ((long)(-188767233485567108L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215551989430832L)))));
    life11_11 = (moom.ew.Y ^ 54606250034684L);
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    spill458_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill458_1 = 2;
    spill458_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp458_9_0 = new byte[8];
    spill458_3 = __stackOp458_9_0;
    (__stackOp458_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue458_36_0 = spill458_0;
    forestValue458_36_1 = spill458_1;
    forestValue458_36_2 = spill458_2;
    forestValue458_36_3 = spill458_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue458_53_0 = forestValue458_36_0;
        forestValue458_53_1 = forestValue458_36_1;
        forestValue458_53_2 = forestValue458_36_2;
        forestValue458_53_3 = forestValue458_36_3;
        break forest_join_53;
    }
    byte[] __stackOp458_10_0 = forestValue458_36_3;
    spill458_4 = __stackOp458_10_0;
    (__stackOp458_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue458_36_3 = spill458_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue458_53_0)).init(((int)(forestValue458_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue458_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue458_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[7];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "èúü\177ËI^'\006®²ã¯gt¾I\030óYfÆÚK«\020«@Ø\005¾Í\002E"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill458_5 = life4_71;
    spill458_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill458_5)).substring(((int)(spill458_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue458_157_0 = life6_66;
    forestValue458_157_1 = (life3_68++);
    forestValue458_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue458_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp458_16_0 = forestValue458_157_2;
    int __stackOp458_16_1 = forestValue458_157_3;
    spill458_7 = __stackOp458_16_1;
    spill458_8 = __stackOp458_16_0;
    recovery.source.CarrierOps.discard(__stackOp458_16_1);
    life8_160 = spill458_8;
    byte[] __stackOp458_18_0 = new byte[8];
    spill458_9 = __stackOp458_18_0;
    (__stackOp458_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp458_19_0 = spill458_9;
    spill458_10 = __stackOp458_19_0;
    (__stackOp458_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp458_20_0 = spill458_10;
    spill458_11 = __stackOp458_20_0;
    (__stackOp458_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp458_21_0 = spill458_11;
    spill458_12 = __stackOp458_21_0;
    (__stackOp458_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp458_22_0 = spill458_12;
    spill458_13 = __stackOp458_22_0;
    (__stackOp458_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp458_23_0 = spill458_13;
    spill458_14 = __stackOp458_23_0;
    (__stackOp458_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp458_24_0 = spill458_14;
    spill458_15 = __stackOp458_24_0;
    (__stackOp458_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp458_25_0 = spill458_15;
    spill458_16 = __stackOp458_25_0;
    (__stackOp458_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp458_26_0 = spill458_16;
    javax.crypto.Cipher __stackOp458_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp458_26_1)).doFinal(((byte[])(__stackOp458_26_0)));
    int __stackOp458_28_0 = spill458_7;
    long __stackOp458_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill458_17 = __stackOp458_28_1;
    spill458_18 = __stackOp458_28_0;
    recovery.source.CarrierOps.discard(__stackOp458_28_1);
    switch (spill458_18) {
default:
{
        forestValue458_300_0 = forestValue458_157_0;
        forestValue458_300_1 = forestValue458_157_1;
        forestValue458_300_2 = spill458_17;
        break forest_join_300;
    }
case 0:
{
        forestValue458_312_0 = forestValue458_157_0;
        forestValue458_312_1 = forestValue458_157_1;
        forestValue458_312_2 = spill458_17;
        break forest_join_312;
    }
}
    }
    (forestValue458_300_0)[forestValue458_300_1] = forestValue458_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "²£¨ùôfÛËW`ËGíW\033"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue458_312_0)[forestValue458_312_1] = forestValue458_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill458_19 = life4_71;
    spill458_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill458_19)).substring(((int)(spill458_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill458_21 = life6_66;
    spill458_22 = (life3_68++);
    spill458_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill458_24 = 0;
    forestValue458_157_0 = spill458_21;
    forestValue458_157_1 = spill458_22;
    forestValue458_157_2 = spill458_23;
    forestValue458_157_3 = spill458_24;
    continue forest_cycle_157;
    }
    }
    }
    Z = ((long[])(life6_66));
    bb = ((java.lang.Integer[])(new java.lang.Integer[7]));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("half")), ((java.lang.Class)(moom.al.class)))));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("shape")), ((java.lang.Class)(net.minecraft.block.BlockStairs$EnumShape.class)))));
    int[][] __stackOp458_45_0 = new int[__sourceIntrinsic_eb8803ad1f63_invokedynamic458_44(17750, (2440322071351561312L ^ life11_11))][];
    spill458_25 = __stackOp458_45_0;
    spill458_26 = __stackOp458_45_0;
    spill458_27 = 0;
    int[] __stackOp458_46_0 = new int[2];
    spill458_28 = __stackOp458_46_0;
    (__stackOp458_46_0)[0] = 4;
    int[] __stackOp458_47_0 = spill458_28;
    spill458_29 = __stackOp458_47_0;
    (__stackOp458_47_0)[1] = 5;
    (spill458_26)[spill458_27] = spill458_29;
    int[][] __stackOp458_48_0 = spill458_25;
    spill458_30 = __stackOp458_48_0;
    spill458_31 = __stackOp458_48_0;
    spill458_32 = 1;
    int[] __stackOp458_49_0 = new int[2];
    spill458_33 = __stackOp458_49_0;
    (__stackOp458_49_0)[0] = 5;
    int[] __stackOp458_50_0 = spill458_33;
    spill458_34 = __stackOp458_50_0;
    (__stackOp458_50_0)[1] = __sourceIntrinsic_eb8803ad1f63_invokedynamic458_51(32268, (8098555525160941371L ^ life11_11));
    (spill458_31)[spill458_32] = spill458_34;
    int[][] __stackOp458_52_0 = spill458_30;
    spill458_35 = __stackOp458_52_0;
    spill458_36 = __stackOp458_52_0;
    spill458_37 = 2;
    int[] __stackOp458_53_0 = new int[2];
    spill458_38 = __stackOp458_53_0;
    (__stackOp458_53_0)[0] = __sourceIntrinsic_eb8803ad1f63_invokedynamic458_54(15653, (8746770008250807316L ^ life11_11));
    int[] __stackOp458_55_0 = spill458_38;
    spill458_39 = __stackOp458_55_0;
    (__stackOp458_55_0)[1] = __sourceIntrinsic_eb8803ad1f63_invokedynamic458_56(21105, (4451055608335473475L ^ life11_11));
    (spill458_36)[spill458_37] = spill458_39;
    int[][] __stackOp458_57_0 = spill458_35;
    spill458_40 = __stackOp458_57_0;
    spill458_41 = __stackOp458_57_0;
    spill458_42 = 3;
    int[] __stackOp458_58_0 = new int[2];
    spill458_43 = __stackOp458_58_0;
    (__stackOp458_58_0)[0] = 4;
    int[] __stackOp458_59_0 = spill458_43;
    spill458_44 = __stackOp458_59_0;
    (__stackOp458_59_0)[1] = __sourceIntrinsic_eb8803ad1f63_invokedynamic458_60(12880, (8993783145835559776L ^ life11_11));
    (spill458_41)[spill458_42] = spill458_44;
    int[][] __stackOp458_61_0 = spill458_40;
    spill458_45 = __stackOp458_61_0;
    spill458_46 = __stackOp458_61_0;
    spill458_47 = 4;
    int[] __stackOp458_62_0 = new int[2];
    spill458_48 = __stackOp458_62_0;
    (__stackOp458_62_0)[0] = 0;
    int[] __stackOp458_63_0 = spill458_48;
    spill458_49 = __stackOp458_63_0;
    (__stackOp458_63_0)[1] = 1;
    (spill458_46)[spill458_47] = spill458_49;
    int[][] __stackOp458_64_0 = spill458_45;
    spill458_50 = __stackOp458_64_0;
    spill458_51 = __stackOp458_64_0;
    spill458_52 = 5;
    int[] __stackOp458_65_0 = new int[2];
    spill458_53 = __stackOp458_65_0;
    (__stackOp458_65_0)[0] = 1;
    int[] __stackOp458_66_0 = spill458_53;
    spill458_54 = __stackOp458_66_0;
    (__stackOp458_66_0)[1] = 3;
    (spill458_51)[spill458_52] = spill458_54;
    int[][] __stackOp458_67_0 = spill458_50;
    spill458_55 = __stackOp458_67_0;
    spill458_56 = __stackOp458_67_0;
    spill458_57 = __sourceIntrinsic_eb8803ad1f63_invokedynamic458_68(12880, (8993783145835559776L ^ life11_11));
    int[] __stackOp458_69_0 = new int[2];
    spill458_58 = __stackOp458_69_0;
    (__stackOp458_69_0)[0] = 2;
    int[] __stackOp458_70_0 = spill458_58;
    spill458_59 = __stackOp458_70_0;
    (__stackOp458_70_0)[1] = 3;
    (spill458_56)[spill458_57] = spill458_59;
    int[][] __stackOp458_71_0 = spill458_55;
    spill458_60 = __stackOp458_71_0;
    spill458_61 = __stackOp458_71_0;
    spill458_62 = __sourceIntrinsic_eb8803ad1f63_invokedynamic458_72(21105, (4451055608335473475L ^ life11_11));
    int[] __stackOp458_73_0 = new int[2];
    spill458_63 = __stackOp458_73_0;
    (__stackOp458_73_0)[0] = 0;
    int[] __stackOp458_74_0 = spill458_63;
    spill458_64 = __stackOp458_74_0;
    (__stackOp458_74_0)[1] = 2;
    (spill458_61)[spill458_62] = spill458_64;
    T = ((int[][])(spill458_60));
}

private static native <E extends Throwable> void __sourceConstructorInit_5e7013c746e33552_0(moom.ew a0, moom.fn a1) throws E;

public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
((net.minecraft.block.Block)(this.U)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.ew)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(this.V)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)));
    ((net.minecraft.block.Block)(this.U)).b__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(this.V)));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7581_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ew"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(this.U)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1))))) != 0);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ew.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10146;
      if (bb[var3] == null) {
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
         long var5 = Z[var3];
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
         Object[] var9 = (Object[])fb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               fb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ew", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         bb[var3] = var15;
      }

      return bb[var3];
}


public int b(net.minecraft.block.state.IBlockState p0) {
long life2_3;
    int life5_6;
    int[] life4_7;
    life2_3 = (moom.ew.Y ^ 45459045170092L);
    int[] spill6335_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill6335_0;
    if ((life4_7 != null)) {
        if ((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R))) == moom.al.TOP)) {
        life5_6 = (life5_6 | 4);
    }
        life5_6 = (life5_6 | (5 - ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q))))))).a()));
    }
    return life5_6;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.ew.Y ^ 41697211138214L);
    net.minecraft.block.state.IBlockState local4 = ((net.minecraft.block.state.IBlockState)(((moom.ew)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.R)), ((java.lang.Comparable)((((p0 & 4) > 0) ? moom.al.TOP : moom.al.BOTTOM))));
    local4 = ((net.minecraft.block.state.IBlockState)(local4)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.Q)), ((java.lang.Comparable)(moom.bs.a(((int)((5 - (p0 & 3))))))));
    return local4;
}


public void b__sourceReturn_4182cef048(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
long life3_3;
    int[] life5_5;
    forward_join_33: {
    forward_join_25: {
    forward_join_23: {
    life3_3 = (moom.ew.Y ^ 33942393800440L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((life5_5 != null))) { break forward_join_23; }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.ew.R))) == moom.al.TOP))) { break forward_join_25; }
    ((moom.ew)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    if (!((life5_5 == null))) { break forward_join_33; }
    }
    ((moom.ew)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    }
    return;
}


public static boolean b(net.minecraft.block.Block p0) {
return ((((p0 instanceof moom.ew) ? 1 : 0)) != 0);
}


public boolean b__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue391_26_0;
    java.lang.Comparable forwardValue391_79_0;
    int forwardValue391_97_0;
    moom.bs forwardValue391_102_0;
    moom.bs forwardValue391_102_1;
    int forwardValue391_114_0;
    moom.bs forwardValue391_119_0;
    moom.bs forwardValue391_119_1;
    java.lang.Comparable forwardValue391_147_0;
    int forwardValue391_165_0;
    moom.bs forwardValue391_170_0;
    moom.bs forwardValue391_170_1;
    int forwardValue391_182_0;
    moom.bs forwardValue391_187_0;
    moom.bs forwardValue391_187_1;
    java.lang.Comparable forwardValue391_215_0;
    int forwardValue391_233_0;
    moom.bs forwardValue391_238_0;
    moom.bs forwardValue391_238_1;
    int forwardValue391_250_0;
    moom.bs forwardValue391_255_0;
    moom.bs forwardValue391_255_1;
    java.lang.Comparable forwardValue391_279_0;
    int forwardValue391_297_0;
    moom.bs forwardValue391_302_0;
    moom.bs forwardValue391_302_1;
    int forwardValue391_324_0;
    int[] spill391_0;
    moom.bs spill391_1;
    moom.bs spill391_2;
    moom.al spill391_3;
    moom.bs spill391_4;
    moom.bs spill391_5;
    boolean spill391_6;
    boolean spill391_7;
    moom.al spill391_8;
    moom.bs spill391_9;
    moom.bs spill391_10;
    boolean spill391_11;
    boolean spill391_12;
    moom.al spill391_13;
    moom.bs spill391_14;
    moom.bs spill391_15;
    boolean spill391_16;
    boolean spill391_17;
    boolean spill391_18;
    moom.al spill391_19;
    moom.bs spill391_20;
    moom.bs spill391_21;
    boolean spill391_22;
    boolean spill391_23;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    moom.bs life7_14;
    moom.al life8_19;
    int life9_28;
    float life10_30;
    float life11_32;
    float life12_45;
    float life13_47;
    float life14_49;
    float life15_51;
    int life16_53;
    net.minecraft.block.state.IBlockState life17_70;
    net.minecraft.block.Block life18_73;
    moom.bs life19_97;
    net.minecraft.block.state.IBlockState life17_171;
    net.minecraft.block.Block life18_174;
    moom.bs life19_198;
    net.minecraft.block.state.IBlockState life17_272;
    net.minecraft.block.Block life18_275;
    moom.bs life19_299;
    net.minecraft.block.state.IBlockState life17_364;
    net.minecraft.block.Block life18_367;
    moom.bs life19_396;
    forward_join_324: {
    forward_join_315: {
    forward_join_302: {
    forward_join_300: {
    forward_join_297: {
    forward_join_279: {
    forward_join_255: {
    forward_join_253: {
    forward_join_251: {
    forward_join_250: {
    forward_join_238: {
    forward_join_236: {
    forward_join_233: {
    forward_join_215: {
    forward_join_187: {
    forward_join_185: {
    forward_join_183: {
    forward_join_182: {
    forward_join_170: {
    forward_join_168: {
    forward_join_165: {
    forward_join_147: {
    forward_join_119: {
    forward_join_117: {
    forward_join_115: {
    forward_join_114: {
    forward_join_102: {
    forward_join_100: {
    forward_join_97: {
    forward_join_79: {
    forward_join_39: {
    forward_join_37: {
    forward_join_26: {
    forward_join_25: {
    life3_3 = (moom.ew.Y ^ 18767718880988L);
    spill391_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill391_0;
    life7_14 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)))));
    life8_19 = ((moom.al)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))));
    if (!((life8_19 == moom.al.TOP))) {
        break forward_join_25;
    }
    forwardValue391_26_0 = 1;
    break forward_join_26;
    }
    forwardValue391_26_0 = 0;
    }
    life9_28 = forwardValue391_26_0;
    life10_30 = 0x1.0p-1f;
    life11_32 = 0x1.0p0f;
    if (!((life5_9 != null))) {
        break forward_join_37;
    }
    if (!((life9_28 != 0))) {
        break forward_join_39;
    }
    life10_30 = 0x0.0p0f;
    }
    life11_32 = 0x1.0p-1f;
    }
    life12_45 = 0x0.0p0f;
    life13_47 = 0x1.0p0f;
    life14_49 = 0x0.0p0f;
    life15_51 = 0x1.0p-1f;
    life16_53 = 1;
    spill391_1 = life7_14;
    spill391_2 = moom.bs.EAST;
    if (!((life5_9 != null))) {
        forwardValue391_119_0 = spill391_1;
        forwardValue391_119_1 = spill391_2;
        break forward_join_119;
    }
    if (!((spill391_1 == spill391_2))) {
        break forward_join_117;
    }
    life12_45 = 0x1.0p-1f;
    life15_51 = 0x1.0p0f;
    life17_70 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f())));
    life18_73 = ((net.minecraft.block.state.IBlockState)(life17_70)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life18_73))))) {
        break forward_join_115;
    }
    spill391_3 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue391_79_0 = spill391_3;
        break forward_join_79;
    }
    if (!((spill391_3 == ((net.minecraft.block.state.IBlockState)(life17_70)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_115;
    }
    forwardValue391_79_0 = ((net.minecraft.block.state.IBlockState)(life17_70)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_97 = ((moom.bs)(forwardValue391_79_0));
    spill391_4 = life19_97;
    spill391_5 = moom.bs.NORTH;
    if (!((life5_9 != null))) {
        forwardValue391_102_0 = spill391_4;
        forwardValue391_102_1 = spill391_5;
        break forward_join_102;
    }
    if (!((spill391_4 == spill391_5))) {
        break forward_join_100;
    }
    spill391_6 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_97_0 = ((spill391_6) ? 1 : 0);
        break forward_join_97;
    }
    if (!((!spill391_6))) {
        break forward_join_100;
    }
    life15_51 = 0x1.0p-1f;
    forwardValue391_97_0 = 0;
    }
    life16_53 = forwardValue391_97_0;
    if (!((life5_9 == null))) {
        break forward_join_115;
    }
    }
    forwardValue391_102_0 = life19_97;
    forwardValue391_102_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue391_102_0 == forwardValue391_102_1))) {
        break forward_join_115;
    }
    spill391_7 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_114_0 = ((spill391_7) ? 1 : 0);
        break forward_join_114;
    }
    if (!((!spill391_7))) {
        break forward_join_115;
    }
    life14_49 = 0x1.0p-1f;
    forwardValue391_114_0 = 0;
    }
    life16_53 = forwardValue391_114_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_315;
    }
    }
    forwardValue391_119_0 = life7_14;
    forwardValue391_119_1 = moom.bs.WEST;
    }
    if (!((life5_9 != null))) {
        forwardValue391_187_0 = forwardValue391_119_0;
        forwardValue391_187_1 = forwardValue391_119_1;
        break forward_join_187;
    }
    if (!((forwardValue391_119_0 == forwardValue391_119_1))) {
        break forward_join_185;
    }
    life13_47 = 0x1.0p-1f;
    life15_51 = 0x1.0p0f;
    life17_171 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e())));
    life18_174 = ((net.minecraft.block.state.IBlockState)(life17_171)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life18_174))))) {
        break forward_join_183;
    }
    spill391_8 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue391_147_0 = spill391_8;
        break forward_join_147;
    }
    if (!((spill391_8 == ((net.minecraft.block.state.IBlockState)(life17_171)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_183;
    }
    forwardValue391_147_0 = ((net.minecraft.block.state.IBlockState)(life17_171)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_198 = ((moom.bs)(forwardValue391_147_0));
    spill391_9 = life19_198;
    spill391_10 = moom.bs.NORTH;
    if (!((life5_9 != null))) {
        forwardValue391_170_0 = spill391_9;
        forwardValue391_170_1 = spill391_10;
        break forward_join_170;
    }
    if (!((spill391_9 == spill391_10))) {
        break forward_join_168;
    }
    spill391_11 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_165_0 = ((spill391_11) ? 1 : 0);
        break forward_join_165;
    }
    if (!((!spill391_11))) {
        break forward_join_168;
    }
    life15_51 = 0x1.0p-1f;
    forwardValue391_165_0 = 0;
    }
    life16_53 = forwardValue391_165_0;
    if (!((life5_9 == null))) {
        break forward_join_183;
    }
    }
    forwardValue391_170_0 = life19_198;
    forwardValue391_170_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue391_170_0 == forwardValue391_170_1))) {
        break forward_join_183;
    }
    spill391_12 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_182_0 = ((spill391_12) ? 1 : 0);
        break forward_join_182;
    }
    if (!((!spill391_12))) {
        break forward_join_183;
    }
    life14_49 = 0x1.0p-1f;
    forwardValue391_182_0 = 0;
    }
    life16_53 = forwardValue391_182_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_315;
    }
    }
    forwardValue391_187_0 = life7_14;
    forwardValue391_187_1 = moom.bs.SOUTH;
    }
    if (!((life5_9 != null))) {
        forwardValue391_255_0 = forwardValue391_187_0;
        forwardValue391_255_1 = forwardValue391_187_1;
        break forward_join_255;
    }
    if (!((forwardValue391_187_0 == forwardValue391_187_1))) {
        break forward_join_253;
    }
    life14_49 = 0x1.0p-1f;
    life15_51 = 0x1.0p0f;
    life17_272 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT())));
    life18_275 = ((net.minecraft.block.state.IBlockState)(life17_272)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life18_275))))) {
        break forward_join_251;
    }
    spill391_13 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue391_215_0 = spill391_13;
        break forward_join_215;
    }
    if (!((spill391_13 == ((net.minecraft.block.state.IBlockState)(life17_272)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_251;
    }
    forwardValue391_215_0 = ((net.minecraft.block.state.IBlockState)(life17_272)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_299 = ((moom.bs)(forwardValue391_215_0));
    spill391_14 = life19_299;
    spill391_15 = moom.bs.WEST;
    if (!((life5_9 != null))) {
        forwardValue391_238_0 = spill391_14;
        forwardValue391_238_1 = spill391_15;
        break forward_join_238;
    }
    if (!((spill391_14 == spill391_15))) {
        break forward_join_236;
    }
    spill391_16 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_233_0 = ((spill391_16) ? 1 : 0);
        break forward_join_233;
    }
    if (!((!spill391_16))) {
        break forward_join_236;
    }
    life13_47 = 0x1.0p-1f;
    forwardValue391_233_0 = 0;
    }
    life16_53 = forwardValue391_233_0;
    if (!((life5_9 == null))) {
        break forward_join_251;
    }
    }
    forwardValue391_238_0 = life19_299;
    forwardValue391_238_1 = moom.bs.EAST;
    }
    if (!((forwardValue391_238_0 == forwardValue391_238_1))) {
        break forward_join_251;
    }
    spill391_17 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_250_0 = ((spill391_17) ? 1 : 0);
        break forward_join_250;
    }
    if (!((!spill391_17))) {
        break forward_join_251;
    }
    life12_45 = 0x1.0p-1f;
    forwardValue391_250_0 = 0;
    }
    life16_53 = forwardValue391_250_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_315;
    }
    }
    forwardValue391_255_0 = life7_14;
    forwardValue391_255_1 = moom.bs.NORTH;
    }
    if (!((forwardValue391_255_0 == forwardValue391_255_1))) {
        break forward_join_315;
    }
    life17_364 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT())));
    life18_367 = ((net.minecraft.block.state.IBlockState)(life17_364)).a__ch();
    spill391_18 = moom.ew.b(((net.minecraft.block.Block)(life18_367)));
    if (!((life5_9 != null))) {
        forwardValue391_324_0 = ((spill391_18) ? 1 : 0);
        break forward_join_324;
    }
    if (!(spill391_18)) {
        break forward_join_315;
    }
    spill391_19 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue391_279_0 = spill391_19;
        break forward_join_279;
    }
    if (!((spill391_19 == ((net.minecraft.block.state.IBlockState)(life17_364)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_315;
    }
    forwardValue391_279_0 = ((net.minecraft.block.state.IBlockState)(life17_364)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_396 = ((moom.bs)(forwardValue391_279_0));
    spill391_20 = life19_396;
    spill391_21 = moom.bs.WEST;
    if (!((life5_9 != null))) {
        forwardValue391_302_0 = spill391_20;
        forwardValue391_302_1 = spill391_21;
        break forward_join_302;
    }
    if (!((spill391_20 == spill391_21))) {
        break forward_join_300;
    }
    spill391_22 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_297_0 = ((spill391_22) ? 1 : 0);
        break forward_join_297;
    }
    if (!((!spill391_22))) {
        break forward_join_300;
    }
    life13_47 = 0x1.0p-1f;
    forwardValue391_297_0 = 0;
    }
    life16_53 = forwardValue391_297_0;
    if (!((life5_9 == null))) {
        break forward_join_315;
    }
    }
    forwardValue391_302_0 = life19_396;
    forwardValue391_302_1 = moom.bs.EAST;
    }
    if (!((forwardValue391_302_0 == forwardValue391_302_1))) {
        break forward_join_315;
    }
    spill391_23 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue391_324_0 = ((spill391_23) ? 1 : 0);
        break forward_join_324;
    }
    if (!((!spill391_23))) {
        break forward_join_315;
    }
    life12_45 = 0x1.0p-1f;
    life16_53 = 0;
    }
    ((moom.ew)(this)).a(((float)(life12_45)), ((float)(life10_30)), ((float)(life14_49)), ((float)(life13_47)), ((float)(life11_32)), ((float)(life15_51)));
    forwardValue391_324_0 = life16_53;
    }
    return ((forwardValue391_324_0) != 0);
}


public boolean c__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue393_26_0;
    java.lang.Comparable forwardValue393_75_0;
    int forwardValue393_95_0;
    moom.bs forwardValue393_100_0;
    moom.bs forwardValue393_100_1;
    int forwardValue393_114_0;
    moom.bs forwardValue393_119_0;
    moom.bs forwardValue393_119_1;
    java.lang.Comparable forwardValue393_147_0;
    int forwardValue393_167_0;
    moom.bs forwardValue393_172_0;
    moom.bs forwardValue393_172_1;
    int forwardValue393_186_0;
    moom.bs forwardValue393_191_0;
    moom.bs forwardValue393_191_1;
    java.lang.Comparable forwardValue393_219_0;
    int forwardValue393_235_0;
    moom.bs forwardValue393_240_0;
    moom.bs forwardValue393_240_1;
    int forwardValue393_254_0;
    moom.bs forwardValue393_259_0;
    moom.bs forwardValue393_259_1;
    java.lang.Comparable forwardValue393_283_0;
    int forwardValue393_299_0;
    moom.bs forwardValue393_304_0;
    moom.bs forwardValue393_304_1;
    int forwardValue393_320_0;
    int forwardValue393_332_0;
    int[] spill393_0;
    moom.bs spill393_1;
    moom.bs spill393_2;
    moom.al spill393_3;
    moom.bs spill393_4;
    moom.bs spill393_5;
    boolean spill393_6;
    boolean spill393_7;
    moom.al spill393_8;
    moom.bs spill393_9;
    moom.bs spill393_10;
    boolean spill393_11;
    boolean spill393_12;
    moom.al spill393_13;
    moom.bs spill393_14;
    moom.bs spill393_15;
    boolean spill393_16;
    boolean spill393_17;
    boolean spill393_18;
    moom.al spill393_19;
    moom.bs spill393_20;
    moom.bs spill393_21;
    boolean spill393_22;
    boolean spill393_23;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    moom.bs life7_14;
    moom.al life8_19;
    int life9_28;
    float life10_30;
    float life11_32;
    float life12_45;
    float life13_47;
    float life14_49;
    float life15_51;
    int life16_53;
    net.minecraft.block.state.IBlockState life17_66;
    net.minecraft.block.Block life18_69;
    moom.bs life19_93;
    net.minecraft.block.state.IBlockState life17_167;
    net.minecraft.block.Block life18_170;
    moom.bs life19_195;
    net.minecraft.block.state.IBlockState life17_269;
    net.minecraft.block.Block life18_272;
    moom.bs life19_297;
    net.minecraft.block.state.IBlockState life17_362;
    net.minecraft.block.Block life18_365;
    moom.bs life19_394;
    forward_join_332: {
    forward_join_331: {
    forward_join_320: {
    forward_join_319: {
    forward_join_304: {
    forward_join_302: {
    forward_join_299: {
    forward_join_283: {
    forward_join_259: {
    forward_join_257: {
    forward_join_255: {
    forward_join_254: {
    forward_join_240: {
    forward_join_238: {
    forward_join_235: {
    forward_join_219: {
    forward_join_191: {
    forward_join_189: {
    forward_join_187: {
    forward_join_186: {
    forward_join_172: {
    forward_join_170: {
    forward_join_167: {
    forward_join_147: {
    forward_join_119: {
    forward_join_117: {
    forward_join_115: {
    forward_join_114: {
    forward_join_100: {
    forward_join_98: {
    forward_join_95: {
    forward_join_75: {
    forward_join_39: {
    forward_join_37: {
    forward_join_26: {
    forward_join_25: {
    life3_3 = (moom.ew.Y ^ 73422202395326L);
    spill393_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill393_0;
    life7_14 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)))));
    life8_19 = ((moom.al)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))));
    if (!((life8_19 == moom.al.TOP))) {
        break forward_join_25;
    }
    forwardValue393_26_0 = 1;
    break forward_join_26;
    }
    forwardValue393_26_0 = 0;
    }
    life9_28 = forwardValue393_26_0;
    life10_30 = 0x1.0p-1f;
    life11_32 = 0x1.0p0f;
    if (!((life5_9 != null))) {
        break forward_join_37;
    }
    if (!((life9_28 != 0))) {
        break forward_join_39;
    }
    life10_30 = 0x0.0p0f;
    }
    life11_32 = 0x1.0p-1f;
    }
    life12_45 = 0x0.0p0f;
    life13_47 = 0x1.0p-1f;
    life14_49 = 0x1.0p-1f;
    life15_51 = 0x1.0p0f;
    life16_53 = 0;
    spill393_1 = life7_14;
    spill393_2 = moom.bs.EAST;
    if (!((life5_9 != null))) {
        forwardValue393_119_0 = spill393_1;
        forwardValue393_119_1 = spill393_2;
        break forward_join_119;
    }
    if (!((spill393_1 == spill393_2))) {
        break forward_join_117;
    }
    life17_66 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e())));
    life18_69 = ((net.minecraft.block.state.IBlockState)(life17_66)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life18_69))))) {
        break forward_join_115;
    }
    spill393_3 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue393_75_0 = spill393_3;
        break forward_join_75;
    }
    if (!((spill393_3 == ((net.minecraft.block.state.IBlockState)(life17_66)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_115;
    }
    forwardValue393_75_0 = ((net.minecraft.block.state.IBlockState)(life17_66)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_93 = ((moom.bs)(forwardValue393_75_0));
    spill393_4 = life19_93;
    spill393_5 = moom.bs.NORTH;
    if (!((life5_9 != null))) {
        forwardValue393_100_0 = spill393_4;
        forwardValue393_100_1 = spill393_5;
        break forward_join_100;
    }
    if (!((spill393_4 == spill393_5))) {
        break forward_join_98;
    }
    spill393_6 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_95_0 = ((spill393_6) ? 1 : 0);
        break forward_join_95;
    }
    if (!((!spill393_6))) {
        break forward_join_98;
    }
    life14_49 = 0x0.0p0f;
    life15_51 = 0x1.0p-1f;
    forwardValue393_95_0 = 1;
    }
    life16_53 = forwardValue393_95_0;
    if (!((life5_9 == null))) {
        break forward_join_115;
    }
    }
    forwardValue393_100_0 = life19_93;
    forwardValue393_100_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue393_100_0 == forwardValue393_100_1))) {
        break forward_join_115;
    }
    spill393_7 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_114_0 = ((spill393_7) ? 1 : 0);
        break forward_join_114;
    }
    if (!((!spill393_7))) {
        break forward_join_115;
    }
    life14_49 = 0x1.0p-1f;
    life15_51 = 0x1.0p0f;
    forwardValue393_114_0 = 1;
    }
    life16_53 = forwardValue393_114_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_319;
    }
    }
    forwardValue393_119_0 = life7_14;
    forwardValue393_119_1 = moom.bs.WEST;
    }
    if (!((life5_9 != null))) {
        forwardValue393_191_0 = forwardValue393_119_0;
        forwardValue393_191_1 = forwardValue393_119_1;
        break forward_join_191;
    }
    if (!((forwardValue393_119_0 == forwardValue393_119_1))) {
        break forward_join_189;
    }
    life17_167 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f())));
    life18_170 = ((net.minecraft.block.state.IBlockState)(life17_167)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life18_170))))) {
        break forward_join_187;
    }
    spill393_8 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue393_147_0 = spill393_8;
        break forward_join_147;
    }
    if (!((spill393_8 == ((net.minecraft.block.state.IBlockState)(life17_167)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_187;
    }
    life12_45 = 0x1.0p-1f;
    life13_47 = 0x1.0p0f;
    forwardValue393_147_0 = ((net.minecraft.block.state.IBlockState)(life17_167)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_195 = ((moom.bs)(forwardValue393_147_0));
    spill393_9 = life19_195;
    spill393_10 = moom.bs.NORTH;
    if (!((life5_9 != null))) {
        forwardValue393_172_0 = spill393_9;
        forwardValue393_172_1 = spill393_10;
        break forward_join_172;
    }
    if (!((spill393_9 == spill393_10))) {
        break forward_join_170;
    }
    spill393_11 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_167_0 = ((spill393_11) ? 1 : 0);
        break forward_join_167;
    }
    if (!((!spill393_11))) {
        break forward_join_170;
    }
    life14_49 = 0x0.0p0f;
    life15_51 = 0x1.0p-1f;
    forwardValue393_167_0 = 1;
    }
    life16_53 = forwardValue393_167_0;
    if (!((life5_9 == null))) {
        break forward_join_187;
    }
    }
    forwardValue393_172_0 = life19_195;
    forwardValue393_172_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue393_172_0 == forwardValue393_172_1))) {
        break forward_join_187;
    }
    spill393_12 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_186_0 = ((spill393_12) ? 1 : 0);
        break forward_join_186;
    }
    if (!((!spill393_12))) {
        break forward_join_187;
    }
    life14_49 = 0x1.0p-1f;
    life15_51 = 0x1.0p0f;
    forwardValue393_186_0 = 1;
    }
    life16_53 = forwardValue393_186_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_319;
    }
    }
    forwardValue393_191_0 = life7_14;
    forwardValue393_191_1 = moom.bs.SOUTH;
    }
    if (!((life5_9 != null))) {
        forwardValue393_259_0 = forwardValue393_191_0;
        forwardValue393_259_1 = forwardValue393_191_1;
        break forward_join_259;
    }
    if (!((forwardValue393_191_0 == forwardValue393_191_1))) {
        break forward_join_257;
    }
    life17_269 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT())));
    life18_272 = ((net.minecraft.block.state.IBlockState)(life17_269)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life18_272))))) {
        break forward_join_255;
    }
    spill393_13 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue393_219_0 = spill393_13;
        break forward_join_219;
    }
    if (!((spill393_13 == ((net.minecraft.block.state.IBlockState)(life17_269)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_255;
    }
    life14_49 = 0x0.0p0f;
    life15_51 = 0x1.0p-1f;
    forwardValue393_219_0 = ((net.minecraft.block.state.IBlockState)(life17_269)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_297 = ((moom.bs)(forwardValue393_219_0));
    spill393_14 = life19_297;
    spill393_15 = moom.bs.WEST;
    if (!((life5_9 != null))) {
        forwardValue393_240_0 = spill393_14;
        forwardValue393_240_1 = spill393_15;
        break forward_join_240;
    }
    if (!((spill393_14 == spill393_15))) {
        break forward_join_238;
    }
    spill393_16 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_235_0 = ((spill393_16) ? 1 : 0);
        break forward_join_235;
    }
    if (!((!spill393_16))) {
        break forward_join_238;
    }
    forwardValue393_235_0 = 1;
    }
    life16_53 = forwardValue393_235_0;
    if (!((life5_9 == null))) {
        break forward_join_255;
    }
    }
    forwardValue393_240_0 = life19_297;
    forwardValue393_240_1 = moom.bs.EAST;
    }
    if (!((forwardValue393_240_0 == forwardValue393_240_1))) {
        break forward_join_255;
    }
    spill393_17 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_254_0 = ((spill393_17) ? 1 : 0);
        break forward_join_254;
    }
    if (!((!spill393_17))) {
        break forward_join_255;
    }
    life12_45 = 0x1.0p-1f;
    life13_47 = 0x1.0p0f;
    forwardValue393_254_0 = 1;
    }
    life16_53 = forwardValue393_254_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_319;
    }
    }
    forwardValue393_259_0 = life7_14;
    forwardValue393_259_1 = moom.bs.NORTH;
    }
    if (!((forwardValue393_259_0 == forwardValue393_259_1))) {
        break forward_join_319;
    }
    life17_362 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT())));
    life18_365 = ((net.minecraft.block.state.IBlockState)(life17_362)).a__ch();
    spill393_18 = moom.ew.b(((net.minecraft.block.Block)(life18_365)));
    if (!((life5_9 != null))) {
        forwardValue393_320_0 = ((spill393_18) ? 1 : 0);
        break forward_join_320;
    }
    if (!(spill393_18)) {
        break forward_join_319;
    }
    spill393_19 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue393_283_0 = spill393_19;
        break forward_join_283;
    }
    if (!((spill393_19 == ((net.minecraft.block.state.IBlockState)(life17_362)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_319;
    }
    forwardValue393_283_0 = ((net.minecraft.block.state.IBlockState)(life17_362)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life19_394 = ((moom.bs)(forwardValue393_283_0));
    spill393_20 = life19_394;
    spill393_21 = moom.bs.WEST;
    if (!((life5_9 != null))) {
        forwardValue393_304_0 = spill393_20;
        forwardValue393_304_1 = spill393_21;
        break forward_join_304;
    }
    if (!((spill393_20 == spill393_21))) {
        break forward_join_302;
    }
    spill393_22 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_299_0 = ((spill393_22) ? 1 : 0);
        break forward_join_299;
    }
    if (!((!spill393_22))) {
        break forward_join_302;
    }
    forwardValue393_299_0 = 1;
    }
    life16_53 = forwardValue393_299_0;
    if (!((life5_9 == null))) {
        break forward_join_319;
    }
    }
    forwardValue393_304_0 = life19_394;
    forwardValue393_304_1 = moom.bs.EAST;
    }
    if (!((forwardValue393_304_0 == forwardValue393_304_1))) {
        break forward_join_319;
    }
    spill393_23 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue393_320_0 = ((spill393_23) ? 1 : 0);
        break forward_join_320;
    }
    if (!((!spill393_23))) {
        break forward_join_319;
    }
    life12_45 = 0x1.0p-1f;
    life13_47 = 0x1.0p0f;
    life16_53 = 1;
    }
    forwardValue393_320_0 = life16_53;
    }
    if (!((life5_9 != null))) {
        forwardValue393_332_0 = forwardValue393_320_0;
        break forward_join_332;
    }
    if (!((forwardValue393_320_0 != 0))) {
        break forward_join_331;
    }
    ((moom.ew)(this)).a(((float)(life12_45)), ((float)(life10_30)), ((float)(life14_49)), ((float)(life13_47)), ((float)(life11_32)), ((float)(life15_51)));
    }
    forwardValue393_332_0 = life16_53;
    }
    return ((forwardValue393_332_0) != 0);
}


public int c(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue392_26_0;
    java.lang.Comparable forwardValue392_53_0;
    int forwardValue392_69_0;
    int forwardValue392_73_0;
    int forwardValue392_75_0;
    moom.bs forwardValue392_78_0;
    moom.bs forwardValue392_78_1;
    int forwardValue392_88_0;
    int forwardValue392_92_0;
    int forwardValue392_94_0;
    moom.bs forwardValue392_99_0;
    moom.bs forwardValue392_99_1;
    java.lang.Comparable forwardValue392_123_0;
    int forwardValue392_139_0;
    int forwardValue392_143_0;
    int forwardValue392_145_0;
    moom.bs forwardValue392_148_0;
    moom.bs forwardValue392_148_1;
    int forwardValue392_158_0;
    int forwardValue392_162_0;
    int forwardValue392_164_0;
    moom.bs forwardValue392_169_0;
    moom.bs forwardValue392_169_1;
    java.lang.Comparable forwardValue392_193_0;
    int forwardValue392_209_0;
    int forwardValue392_213_0;
    int forwardValue392_215_0;
    moom.bs forwardValue392_218_0;
    moom.bs forwardValue392_218_1;
    int forwardValue392_228_0;
    int forwardValue392_232_0;
    int forwardValue392_234_0;
    moom.bs forwardValue392_239_0;
    moom.bs forwardValue392_239_1;
    java.lang.Comparable forwardValue392_263_0;
    int forwardValue392_279_0;
    int forwardValue392_283_0;
    int forwardValue392_285_0;
    moom.bs forwardValue392_288_0;
    moom.bs forwardValue392_288_1;
    int forwardValue392_302_0;
    int forwardValue392_304_0;
    int forwardValue392_306_0;
    int[] spill392_0;
    moom.bs spill392_1;
    moom.bs spill392_2;
    moom.al spill392_3;
    moom.bs spill392_4;
    moom.bs spill392_5;
    boolean spill392_6;
    boolean spill392_7;
    moom.al spill392_8;
    moom.bs spill392_9;
    moom.bs spill392_10;
    boolean spill392_11;
    boolean spill392_12;
    moom.al spill392_13;
    moom.bs spill392_14;
    moom.bs spill392_15;
    boolean spill392_16;
    boolean spill392_17;
    boolean spill392_18;
    moom.al spill392_19;
    moom.bs spill392_20;
    moom.bs spill392_21;
    boolean spill392_22;
    boolean spill392_23;
    int spill392_24;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    moom.bs life7_14;
    moom.al life8_19;
    int life9_28;
    net.minecraft.block.state.IBlockState life10_41;
    net.minecraft.block.Block life11_44;
    moom.bs life12_68;
    net.minecraft.block.state.IBlockState life10_147;
    net.minecraft.block.Block life11_150;
    moom.bs life12_174;
    net.minecraft.block.state.IBlockState life10_253;
    net.minecraft.block.Block life11_256;
    moom.bs life12_280;
    net.minecraft.block.state.IBlockState life10_354;
    net.minecraft.block.Block life11_357;
    moom.bs life12_386;
    forward_join_306: {
    forward_join_305: {
    forward_join_304: {
    forward_join_303: {
    forward_join_302: {
    forward_join_288: {
    forward_join_286: {
    forward_join_285: {
    forward_join_284: {
    forward_join_283: {
    forward_join_279: {
    forward_join_263: {
    forward_join_239: {
    forward_join_237: {
    forward_join_235: {
    forward_join_234: {
    forward_join_233: {
    forward_join_232: {
    forward_join_228: {
    forward_join_218: {
    forward_join_216: {
    forward_join_215: {
    forward_join_214: {
    forward_join_213: {
    forward_join_209: {
    forward_join_193: {
    forward_join_169: {
    forward_join_167: {
    forward_join_165: {
    forward_join_164: {
    forward_join_163: {
    forward_join_162: {
    forward_join_158: {
    forward_join_148: {
    forward_join_146: {
    forward_join_145: {
    forward_join_144: {
    forward_join_143: {
    forward_join_139: {
    forward_join_123: {
    forward_join_99: {
    forward_join_97: {
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    forward_join_92: {
    forward_join_88: {
    forward_join_78: {
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    forward_join_69: {
    forward_join_53: {
    forward_join_26: {
    forward_join_25: {
    life3_3 = (moom.ew.Y ^ 96165107746718L);
    spill392_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill392_0;
    life7_14 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)))));
    life8_19 = ((moom.al)(((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))));
    if (!((life8_19 == moom.al.TOP))) {
        break forward_join_25;
    }
    forwardValue392_26_0 = 1;
    break forward_join_26;
    }
    forwardValue392_26_0 = 0;
    }
    life9_28 = forwardValue392_26_0;
    spill392_1 = life7_14;
    spill392_2 = moom.bs.EAST;
    if (!((life5_9 != null))) {
        forwardValue392_99_0 = spill392_1;
        forwardValue392_99_1 = spill392_2;
        break forward_join_99;
    }
    if (!((spill392_1 == spill392_2))) {
        break forward_join_97;
    }
    life10_41 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f())));
    life11_44 = ((net.minecraft.block.state.IBlockState)(life10_41)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life11_44))))) {
        break forward_join_95;
    }
    spill392_3 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue392_53_0 = spill392_3;
        break forward_join_53;
    }
    if (!((spill392_3 == ((net.minecraft.block.state.IBlockState)(life10_41)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_95;
    }
    forwardValue392_53_0 = ((net.minecraft.block.state.IBlockState)(life10_41)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_68 = ((moom.bs)(forwardValue392_53_0));
    spill392_4 = life12_68;
    spill392_5 = moom.bs.NORTH;
    if (!((life5_9 != null))) {
        forwardValue392_78_0 = spill392_4;
        forwardValue392_78_1 = spill392_5;
        break forward_join_78;
    }
    if (!((spill392_4 == spill392_5))) {
        break forward_join_76;
    }
    spill392_6 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_69_0 = ((spill392_6) ? 1 : 0);
        break forward_join_69;
    }
    if (!((!spill392_6))) {
        break forward_join_76;
    }
    forwardValue392_69_0 = life9_28;
    }
    if (!((life5_9 != null))) {
        forwardValue392_73_0 = forwardValue392_69_0;
        break forward_join_73;
    }
    if (!((forwardValue392_69_0 != 0))) {
        break forward_join_74;
    }
    forwardValue392_73_0 = 1;
    }
    forwardValue392_75_0 = forwardValue392_73_0;
    break forward_join_75;
    }
    forwardValue392_75_0 = 2;
    }
    return forwardValue392_75_0;
    }
    forwardValue392_78_0 = life12_68;
    forwardValue392_78_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue392_78_0 == forwardValue392_78_1))) {
        break forward_join_95;
    }
    spill392_7 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_88_0 = ((spill392_7) ? 1 : 0);
        break forward_join_88;
    }
    if (!((!spill392_7))) {
        break forward_join_95;
    }
    forwardValue392_88_0 = life9_28;
    }
    if (!((life5_9 != null))) {
        forwardValue392_92_0 = forwardValue392_88_0;
        break forward_join_92;
    }
    if (!((forwardValue392_88_0 != 0))) {
        break forward_join_93;
    }
    forwardValue392_92_0 = 2;
    }
    forwardValue392_94_0 = forwardValue392_92_0;
    break forward_join_94;
    }
    forwardValue392_94_0 = 1;
    }
    return forwardValue392_94_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_305;
    }
    }
    forwardValue392_99_0 = life7_14;
    forwardValue392_99_1 = moom.bs.WEST;
    }
    if (!((life5_9 != null))) {
        forwardValue392_169_0 = forwardValue392_99_0;
        forwardValue392_169_1 = forwardValue392_99_1;
        break forward_join_169;
    }
    if (!((forwardValue392_99_0 == forwardValue392_99_1))) {
        break forward_join_167;
    }
    life10_147 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e())));
    life11_150 = ((net.minecraft.block.state.IBlockState)(life10_147)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life11_150))))) {
        break forward_join_165;
    }
    spill392_8 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue392_123_0 = spill392_8;
        break forward_join_123;
    }
    if (!((spill392_8 == ((net.minecraft.block.state.IBlockState)(life10_147)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_165;
    }
    forwardValue392_123_0 = ((net.minecraft.block.state.IBlockState)(life10_147)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_174 = ((moom.bs)(forwardValue392_123_0));
    spill392_9 = life12_174;
    spill392_10 = moom.bs.NORTH;
    if (!((life5_9 != null))) {
        forwardValue392_148_0 = spill392_9;
        forwardValue392_148_1 = spill392_10;
        break forward_join_148;
    }
    if (!((spill392_9 == spill392_10))) {
        break forward_join_146;
    }
    spill392_11 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_139_0 = ((spill392_11) ? 1 : 0);
        break forward_join_139;
    }
    if (!((!spill392_11))) {
        break forward_join_146;
    }
    forwardValue392_139_0 = life9_28;
    }
    if (!((life5_9 != null))) {
        forwardValue392_143_0 = forwardValue392_139_0;
        break forward_join_143;
    }
    if (!((forwardValue392_139_0 != 0))) {
        break forward_join_144;
    }
    forwardValue392_143_0 = 2;
    }
    forwardValue392_145_0 = forwardValue392_143_0;
    break forward_join_145;
    }
    forwardValue392_145_0 = 1;
    }
    return forwardValue392_145_0;
    }
    forwardValue392_148_0 = life12_174;
    forwardValue392_148_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue392_148_0 == forwardValue392_148_1))) {
        break forward_join_165;
    }
    spill392_12 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_158_0 = ((spill392_12) ? 1 : 0);
        break forward_join_158;
    }
    if (!((!spill392_12))) {
        break forward_join_165;
    }
    forwardValue392_158_0 = life9_28;
    }
    if (!((life5_9 != null))) {
        forwardValue392_162_0 = forwardValue392_158_0;
        break forward_join_162;
    }
    if (!((forwardValue392_158_0 != 0))) {
        break forward_join_163;
    }
    forwardValue392_162_0 = 1;
    }
    forwardValue392_164_0 = forwardValue392_162_0;
    break forward_join_164;
    }
    forwardValue392_164_0 = 2;
    }
    return forwardValue392_164_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_305;
    }
    }
    forwardValue392_169_0 = life7_14;
    forwardValue392_169_1 = moom.bs.SOUTH;
    }
    if (!((life5_9 != null))) {
        forwardValue392_239_0 = forwardValue392_169_0;
        forwardValue392_239_1 = forwardValue392_169_1;
        break forward_join_239;
    }
    if (!((forwardValue392_169_0 == forwardValue392_169_1))) {
        break forward_join_237;
    }
    life10_253 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT())));
    life11_256 = ((net.minecraft.block.state.IBlockState)(life10_253)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life11_256))))) {
        break forward_join_235;
    }
    spill392_13 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue392_193_0 = spill392_13;
        break forward_join_193;
    }
    if (!((spill392_13 == ((net.minecraft.block.state.IBlockState)(life10_253)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_235;
    }
    forwardValue392_193_0 = ((net.minecraft.block.state.IBlockState)(life10_253)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_280 = ((moom.bs)(forwardValue392_193_0));
    spill392_14 = life12_280;
    spill392_15 = moom.bs.WEST;
    if (!((life5_9 != null))) {
        forwardValue392_218_0 = spill392_14;
        forwardValue392_218_1 = spill392_15;
        break forward_join_218;
    }
    if (!((spill392_14 == spill392_15))) {
        break forward_join_216;
    }
    spill392_16 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_209_0 = ((spill392_16) ? 1 : 0);
        break forward_join_209;
    }
    if (!((!spill392_16))) {
        break forward_join_216;
    }
    forwardValue392_209_0 = life9_28;
    }
    if (!((life5_9 != null))) {
        forwardValue392_213_0 = forwardValue392_209_0;
        break forward_join_213;
    }
    if (!((forwardValue392_209_0 != 0))) {
        break forward_join_214;
    }
    forwardValue392_213_0 = 2;
    }
    forwardValue392_215_0 = forwardValue392_213_0;
    break forward_join_215;
    }
    forwardValue392_215_0 = 1;
    }
    return forwardValue392_215_0;
    }
    forwardValue392_218_0 = life12_280;
    forwardValue392_218_1 = moom.bs.EAST;
    }
    if (!((forwardValue392_218_0 == forwardValue392_218_1))) {
        break forward_join_235;
    }
    spill392_17 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_228_0 = ((spill392_17) ? 1 : 0);
        break forward_join_228;
    }
    if (!((!spill392_17))) {
        break forward_join_235;
    }
    forwardValue392_228_0 = life9_28;
    }
    if (!((life5_9 != null))) {
        forwardValue392_232_0 = forwardValue392_228_0;
        break forward_join_232;
    }
    if (!((forwardValue392_228_0 != 0))) {
        break forward_join_233;
    }
    forwardValue392_232_0 = 1;
    }
    forwardValue392_234_0 = forwardValue392_232_0;
    break forward_join_234;
    }
    forwardValue392_234_0 = 2;
    }
    return forwardValue392_234_0;
    }
    if (!((life5_9 == null))) {
        break forward_join_305;
    }
    }
    forwardValue392_239_0 = life7_14;
    forwardValue392_239_1 = moom.bs.NORTH;
    }
    if (!((forwardValue392_239_0 == forwardValue392_239_1))) {
        break forward_join_305;
    }
    life10_354 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT())));
    life11_357 = ((net.minecraft.block.state.IBlockState)(life10_354)).a__ch();
    spill392_18 = moom.ew.b(((net.minecraft.block.Block)(life11_357)));
    if (!((life5_9 != null))) {
        forwardValue392_306_0 = ((spill392_18) ? 1 : 0);
        break forward_join_306;
    }
    if (!(spill392_18)) {
        break forward_join_305;
    }
    spill392_19 = life8_19;
    if (!((life5_9 != null))) {
        forwardValue392_263_0 = spill392_19;
        break forward_join_263;
    }
    if (!((spill392_19 == ((net.minecraft.block.state.IBlockState)(life10_354)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_305;
    }
    forwardValue392_263_0 = ((net.minecraft.block.state.IBlockState)(life10_354)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_386 = ((moom.bs)(forwardValue392_263_0));
    spill392_20 = life12_386;
    spill392_21 = moom.bs.WEST;
    if (!((life5_9 != null))) {
        forwardValue392_288_0 = spill392_20;
        forwardValue392_288_1 = spill392_21;
        break forward_join_288;
    }
    if (!((spill392_20 == spill392_21))) {
        break forward_join_286;
    }
    spill392_22 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_279_0 = ((spill392_22) ? 1 : 0);
        break forward_join_279;
    }
    if (!((!spill392_22))) {
        break forward_join_286;
    }
    forwardValue392_279_0 = life9_28;
    }
    if (!((life5_9 != null))) {
        forwardValue392_283_0 = forwardValue392_279_0;
        break forward_join_283;
    }
    if (!((forwardValue392_279_0 != 0))) {
        break forward_join_284;
    }
    forwardValue392_283_0 = 1;
    }
    forwardValue392_285_0 = forwardValue392_283_0;
    break forward_join_285;
    }
    forwardValue392_285_0 = 2;
    }
    return forwardValue392_285_0;
    }
    forwardValue392_288_0 = life12_386;
    forwardValue392_288_1 = moom.bs.EAST;
    }
    if (!((forwardValue392_288_0 == forwardValue392_288_1))) {
        break forward_join_305;
    }
    spill392_23 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_8)));
    if (!((life5_9 != null))) {
        forwardValue392_306_0 = ((spill392_23) ? 1 : 0);
        break forward_join_306;
    }
    if (!((!spill392_23))) {
        break forward_join_305;
    }
    spill392_24 = life9_28;
    if (!((life5_9 != null))) {
        forwardValue392_302_0 = spill392_24;
        break forward_join_302;
    }
    if (!((spill392_24 != 0))) {
        break forward_join_303;
    }
    forwardValue392_302_0 = 2;
    }
    forwardValue392_304_0 = forwardValue392_302_0;
    break forward_join_304;
    }
    forwardValue392_304_0 = 1;
    }
    return forwardValue392_304_0;
    }
    forwardValue392_306_0 = 0;
    }
    return forwardValue392_306_0;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.block.Block)(this.U)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(this.V)));
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
((net.minecraft.block.Block)(this.U)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    return;
}


public int d(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue394_26_0;
    java.lang.Comparable forwardValue394_53_0;
    int forwardValue394_69_0;
    int forwardValue394_73_0;
    int forwardValue394_75_0;
    moom.bs forwardValue394_78_0;
    moom.bs forwardValue394_78_1;
    int forwardValue394_88_0;
    int forwardValue394_92_0;
    int forwardValue394_94_0;
    moom.bs forwardValue394_99_0;
    moom.bs forwardValue394_99_1;
    java.lang.Comparable forwardValue394_123_0;
    int forwardValue394_139_0;
    int forwardValue394_143_0;
    int forwardValue394_145_0;
    moom.bs forwardValue394_148_0;
    moom.bs forwardValue394_148_1;
    int forwardValue394_158_0;
    int forwardValue394_162_0;
    int forwardValue394_164_0;
    moom.bs forwardValue394_169_0;
    moom.bs forwardValue394_169_1;
    java.lang.Comparable forwardValue394_193_0;
    int forwardValue394_209_0;
    int forwardValue394_213_0;
    int forwardValue394_215_0;
    moom.bs forwardValue394_218_0;
    moom.bs forwardValue394_218_1;
    int forwardValue394_228_0;
    int forwardValue394_232_0;
    int forwardValue394_234_0;
    moom.bs forwardValue394_239_0;
    moom.bs forwardValue394_239_1;
    java.lang.Comparable forwardValue394_263_0;
    int forwardValue394_279_0;
    int forwardValue394_283_0;
    int forwardValue394_285_0;
    moom.bs forwardValue394_288_0;
    moom.bs forwardValue394_288_1;
    int forwardValue394_302_0;
    int forwardValue394_304_0;
    int forwardValue394_306_0;
    int[] spill394_0;
    moom.bs spill394_1;
    moom.bs spill394_2;
    moom.al spill394_3;
    moom.bs spill394_4;
    moom.bs spill394_5;
    boolean spill394_6;
    boolean spill394_7;
    moom.al spill394_8;
    moom.bs spill394_9;
    moom.bs spill394_10;
    boolean spill394_11;
    boolean spill394_12;
    moom.al spill394_13;
    moom.bs spill394_14;
    moom.bs spill394_15;
    boolean spill394_16;
    boolean spill394_17;
    boolean spill394_18;
    moom.al spill394_19;
    moom.bs spill394_20;
    moom.bs spill394_21;
    boolean spill394_22;
    boolean spill394_23;
    int spill394_24;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_7;
    moom.bs life7_13;
    moom.al life8_18;
    int[] life5_19;
    int life9_28;
    net.minecraft.block.state.IBlockState life10_41;
    net.minecraft.block.Block life11_44;
    moom.bs life12_68;
    net.minecraft.block.state.IBlockState life10_147;
    net.minecraft.block.Block life11_150;
    moom.bs life12_174;
    net.minecraft.block.state.IBlockState life10_253;
    net.minecraft.block.Block life11_256;
    moom.bs life12_280;
    net.minecraft.block.state.IBlockState life10_354;
    net.minecraft.block.Block life11_357;
    moom.bs life12_386;
    forward_join_306: {
    forward_join_305: {
    forward_join_304: {
    forward_join_303: {
    forward_join_302: {
    forward_join_288: {
    forward_join_286: {
    forward_join_285: {
    forward_join_284: {
    forward_join_283: {
    forward_join_279: {
    forward_join_263: {
    forward_join_239: {
    forward_join_237: {
    forward_join_235: {
    forward_join_234: {
    forward_join_233: {
    forward_join_232: {
    forward_join_228: {
    forward_join_218: {
    forward_join_216: {
    forward_join_215: {
    forward_join_214: {
    forward_join_213: {
    forward_join_209: {
    forward_join_193: {
    forward_join_169: {
    forward_join_167: {
    forward_join_165: {
    forward_join_164: {
    forward_join_163: {
    forward_join_162: {
    forward_join_158: {
    forward_join_148: {
    forward_join_146: {
    forward_join_145: {
    forward_join_144: {
    forward_join_143: {
    forward_join_139: {
    forward_join_123: {
    forward_join_99: {
    forward_join_97: {
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    forward_join_92: {
    forward_join_88: {
    forward_join_78: {
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    forward_join_69: {
    forward_join_53: {
    forward_join_26: {
    forward_join_25: {
    life3_3 = (moom.ew.Y ^ 90134312039900L);
    life6_7 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    spill394_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_13 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)))));
    life8_18 = ((moom.al)(((net.minecraft.block.state.IBlockState)(life6_7)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))));
    life5_19 = spill394_0;
    if (!((life8_18 == moom.al.TOP))) {
        break forward_join_25;
    }
    forwardValue394_26_0 = 1;
    break forward_join_26;
    }
    forwardValue394_26_0 = 0;
    }
    life9_28 = forwardValue394_26_0;
    spill394_1 = life7_13;
    spill394_2 = moom.bs.EAST;
    if (!((life5_19 != null))) {
        forwardValue394_99_0 = spill394_1;
        forwardValue394_99_1 = spill394_2;
        break forward_join_99;
    }
    if (!((spill394_1 == spill394_2))) {
        break forward_join_97;
    }
    life10_41 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e())));
    life11_44 = ((net.minecraft.block.state.IBlockState)(life10_41)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life11_44))))) {
        break forward_join_95;
    }
    spill394_3 = life8_18;
    if (!((life5_19 != null))) {
        forwardValue394_53_0 = spill394_3;
        break forward_join_53;
    }
    if (!((spill394_3 == ((net.minecraft.block.state.IBlockState)(life10_41)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_95;
    }
    forwardValue394_53_0 = ((net.minecraft.block.state.IBlockState)(life10_41)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_68 = ((moom.bs)(forwardValue394_53_0));
    spill394_4 = life12_68;
    spill394_5 = moom.bs.NORTH;
    if (!((life5_19 != null))) {
        forwardValue394_78_0 = spill394_4;
        forwardValue394_78_1 = spill394_5;
        break forward_join_78;
    }
    if (!((spill394_4 == spill394_5))) {
        break forward_join_76;
    }
    spill394_6 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_69_0 = ((spill394_6) ? 1 : 0);
        break forward_join_69;
    }
    if (!((!spill394_6))) {
        break forward_join_76;
    }
    forwardValue394_69_0 = life9_28;
    }
    if (!((life5_19 != null))) {
        forwardValue394_73_0 = forwardValue394_69_0;
        break forward_join_73;
    }
    if (!((forwardValue394_69_0 != 0))) {
        break forward_join_74;
    }
    forwardValue394_73_0 = 1;
    }
    forwardValue394_75_0 = forwardValue394_73_0;
    break forward_join_75;
    }
    forwardValue394_75_0 = 2;
    }
    return forwardValue394_75_0;
    }
    forwardValue394_78_0 = life12_68;
    forwardValue394_78_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue394_78_0 == forwardValue394_78_1))) {
        break forward_join_95;
    }
    spill394_7 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_88_0 = ((spill394_7) ? 1 : 0);
        break forward_join_88;
    }
    if (!((!spill394_7))) {
        break forward_join_95;
    }
    forwardValue394_88_0 = life9_28;
    }
    if (!((life5_19 != null))) {
        forwardValue394_92_0 = forwardValue394_88_0;
        break forward_join_92;
    }
    if (!((forwardValue394_88_0 != 0))) {
        break forward_join_93;
    }
    forwardValue394_92_0 = 2;
    }
    forwardValue394_94_0 = forwardValue394_92_0;
    break forward_join_94;
    }
    forwardValue394_94_0 = 1;
    }
    return forwardValue394_94_0;
    }
    if (!((life5_19 == null))) {
        break forward_join_305;
    }
    }
    forwardValue394_99_0 = life7_13;
    forwardValue394_99_1 = moom.bs.WEST;
    }
    if (!((life5_19 != null))) {
        forwardValue394_169_0 = forwardValue394_99_0;
        forwardValue394_169_1 = forwardValue394_99_1;
        break forward_join_169;
    }
    if (!((forwardValue394_99_0 == forwardValue394_99_1))) {
        break forward_join_167;
    }
    life10_147 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f())));
    life11_150 = ((net.minecraft.block.state.IBlockState)(life10_147)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life11_150))))) {
        break forward_join_165;
    }
    spill394_8 = life8_18;
    if (!((life5_19 != null))) {
        forwardValue394_123_0 = spill394_8;
        break forward_join_123;
    }
    if (!((spill394_8 == ((net.minecraft.block.state.IBlockState)(life10_147)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_165;
    }
    forwardValue394_123_0 = ((net.minecraft.block.state.IBlockState)(life10_147)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_174 = ((moom.bs)(forwardValue394_123_0));
    spill394_9 = life12_174;
    spill394_10 = moom.bs.NORTH;
    if (!((life5_19 != null))) {
        forwardValue394_148_0 = spill394_9;
        forwardValue394_148_1 = spill394_10;
        break forward_join_148;
    }
    if (!((spill394_9 == spill394_10))) {
        break forward_join_146;
    }
    spill394_11 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_139_0 = ((spill394_11) ? 1 : 0);
        break forward_join_139;
    }
    if (!((!spill394_11))) {
        break forward_join_146;
    }
    forwardValue394_139_0 = life9_28;
    }
    if (!((life5_19 != null))) {
        forwardValue394_143_0 = forwardValue394_139_0;
        break forward_join_143;
    }
    if (!((forwardValue394_139_0 != 0))) {
        break forward_join_144;
    }
    forwardValue394_143_0 = 2;
    }
    forwardValue394_145_0 = forwardValue394_143_0;
    break forward_join_145;
    }
    forwardValue394_145_0 = 1;
    }
    return forwardValue394_145_0;
    }
    forwardValue394_148_0 = life12_174;
    forwardValue394_148_1 = moom.bs.SOUTH;
    }
    if (!((forwardValue394_148_0 == forwardValue394_148_1))) {
        break forward_join_165;
    }
    spill394_12 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_158_0 = ((spill394_12) ? 1 : 0);
        break forward_join_158;
    }
    if (!((!spill394_12))) {
        break forward_join_165;
    }
    forwardValue394_158_0 = life9_28;
    }
    if (!((life5_19 != null))) {
        forwardValue394_162_0 = forwardValue394_158_0;
        break forward_join_162;
    }
    if (!((forwardValue394_158_0 != 0))) {
        break forward_join_163;
    }
    forwardValue394_162_0 = 1;
    }
    forwardValue394_164_0 = forwardValue394_162_0;
    break forward_join_164;
    }
    forwardValue394_164_0 = 2;
    }
    return forwardValue394_164_0;
    }
    if (!((life5_19 == null))) {
        break forward_join_305;
    }
    }
    forwardValue394_169_0 = life7_13;
    forwardValue394_169_1 = moom.bs.SOUTH;
    }
    if (!((life5_19 != null))) {
        forwardValue394_239_0 = forwardValue394_169_0;
        forwardValue394_239_1 = forwardValue394_169_1;
        break forward_join_239;
    }
    if (!((forwardValue394_169_0 == forwardValue394_169_1))) {
        break forward_join_237;
    }
    life10_253 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT())));
    life11_256 = ((net.minecraft.block.state.IBlockState)(life10_253)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life11_256))))) {
        break forward_join_235;
    }
    spill394_13 = life8_18;
    if (!((life5_19 != null))) {
        forwardValue394_193_0 = spill394_13;
        break forward_join_193;
    }
    if (!((spill394_13 == ((net.minecraft.block.state.IBlockState)(life10_253)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_235;
    }
    forwardValue394_193_0 = ((net.minecraft.block.state.IBlockState)(life10_253)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_280 = ((moom.bs)(forwardValue394_193_0));
    spill394_14 = life12_280;
    spill394_15 = moom.bs.WEST;
    if (!((life5_19 != null))) {
        forwardValue394_218_0 = spill394_14;
        forwardValue394_218_1 = spill394_15;
        break forward_join_218;
    }
    if (!((spill394_14 == spill394_15))) {
        break forward_join_216;
    }
    spill394_16 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_209_0 = ((spill394_16) ? 1 : 0);
        break forward_join_209;
    }
    if (!((!spill394_16))) {
        break forward_join_216;
    }
    forwardValue394_209_0 = life9_28;
    }
    if (!((life5_19 != null))) {
        forwardValue394_213_0 = forwardValue394_209_0;
        break forward_join_213;
    }
    if (!((forwardValue394_209_0 != 0))) {
        break forward_join_214;
    }
    forwardValue394_213_0 = 2;
    }
    forwardValue394_215_0 = forwardValue394_213_0;
    break forward_join_215;
    }
    forwardValue394_215_0 = 1;
    }
    return forwardValue394_215_0;
    }
    forwardValue394_218_0 = life12_280;
    forwardValue394_218_1 = moom.bs.EAST;
    }
    if (!((forwardValue394_218_0 == forwardValue394_218_1))) {
        break forward_join_235;
    }
    spill394_17 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_228_0 = ((spill394_17) ? 1 : 0);
        break forward_join_228;
    }
    if (!((!spill394_17))) {
        break forward_join_235;
    }
    forwardValue394_228_0 = life9_28;
    }
    if (!((life5_19 != null))) {
        forwardValue394_232_0 = forwardValue394_228_0;
        break forward_join_232;
    }
    if (!((forwardValue394_228_0 != 0))) {
        break forward_join_233;
    }
    forwardValue394_232_0 = 1;
    }
    forwardValue394_234_0 = forwardValue394_232_0;
    break forward_join_234;
    }
    forwardValue394_234_0 = 2;
    }
    return forwardValue394_234_0;
    }
    if (!((life5_19 == null))) {
        break forward_join_305;
    }
    }
    forwardValue394_239_0 = life7_13;
    forwardValue394_239_1 = moom.bs.NORTH;
    }
    if (!((forwardValue394_239_0 == forwardValue394_239_1))) {
        break forward_join_305;
    }
    life10_354 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT())));
    life11_357 = ((net.minecraft.block.state.IBlockState)(life10_354)).a__ch();
    spill394_18 = moom.ew.b(((net.minecraft.block.Block)(life11_357)));
    if (!((life5_19 != null))) {
        forwardValue394_306_0 = ((spill394_18) ? 1 : 0);
        break forward_join_306;
    }
    if (!(spill394_18)) {
        break forward_join_305;
    }
    spill394_19 = life8_18;
    if (!((life5_19 != null))) {
        forwardValue394_263_0 = spill394_19;
        break forward_join_263;
    }
    if (!((spill394_19 == ((net.minecraft.block.state.IBlockState)(life10_354)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)))))) {
        break forward_join_305;
    }
    forwardValue394_263_0 = ((net.minecraft.block.state.IBlockState)(life10_354)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    life12_386 = ((moom.bs)(forwardValue394_263_0));
    spill394_20 = life12_386;
    spill394_21 = moom.bs.WEST;
    if (!((life5_19 != null))) {
        forwardValue394_288_0 = spill394_20;
        forwardValue394_288_1 = spill394_21;
        break forward_join_288;
    }
    if (!((spill394_20 == spill394_21))) {
        break forward_join_286;
    }
    spill394_22 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_279_0 = ((spill394_22) ? 1 : 0);
        break forward_join_279;
    }
    if (!((!spill394_22))) {
        break forward_join_286;
    }
    forwardValue394_279_0 = life9_28;
    }
    if (!((life5_19 != null))) {
        forwardValue394_283_0 = forwardValue394_279_0;
        break forward_join_283;
    }
    if (!((forwardValue394_279_0 != 0))) {
        break forward_join_284;
    }
    forwardValue394_283_0 = 1;
    }
    forwardValue394_285_0 = forwardValue394_283_0;
    break forward_join_285;
    }
    forwardValue394_285_0 = 2;
    }
    return forwardValue394_285_0;
    }
    forwardValue394_288_0 = life12_386;
    forwardValue394_288_1 = moom.bs.EAST;
    }
    if (!((forwardValue394_288_0 == forwardValue394_288_1))) {
        break forward_join_305;
    }
    spill394_23 = moom.ew.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((net.minecraft.block.state.IBlockState)(life6_7)));
    if (!((life5_19 != null))) {
        forwardValue394_306_0 = ((spill394_23) ? 1 : 0);
        break forward_join_306;
    }
    if (!((!spill394_23))) {
        break forward_join_305;
    }
    spill394_24 = life9_28;
    if (!((life5_19 != null))) {
        forwardValue394_302_0 = spill394_24;
        break forward_join_302;
    }
    if (!((spill394_24 != 0))) {
        break forward_join_303;
    }
    forwardValue394_302_0 = 2;
    }
    forwardValue394_304_0 = forwardValue394_302_0;
    break forward_join_304;
    }
    forwardValue394_304_0 = 1;
    }
    return forwardValue394_304_0;
    }
    forwardValue394_306_0 = 0;
    }
    return forwardValue394_306_0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(this.U)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(this.V)), ((net.minecraft.entity.player.EntityPlayer)(p3)), ((moom.bs)(moom.bs.DOWN)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, moom.Ei p2) {
((net.minecraft.block.Block)(this.U)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.Ei)(p2)));
    return;
}


public static boolean a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
java.lang.Comparable forwardValue386_31_0;
    java.lang.Comparable forwardValue386_31_1;
    int forwardValue386_35_0;
    int[] spill386_0;
    java.lang.Comparable spill386_1;
    java.lang.Comparable spill386_2;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    net.minecraft.block.Block life7_12;
    forward_join_35: {
    forward_join_34: {
    forward_join_31: {
    life3_3 = (moom.ew.Y ^ 10739244556302L);
    spill386_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill386_0;
    life7_12 = ((net.minecraft.block.state.IBlockState)(life6_8)).a__ch();
    if (!(moom.ew.b(((net.minecraft.block.Block)(life7_12))))) {
        break forward_join_34;
    }
    spill386_1 = ((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)));
    spill386_2 = ((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R)));
    if (!((life5_9 != null))) {
        forwardValue386_31_0 = spill386_1;
        forwardValue386_31_1 = spill386_2;
        break forward_join_31;
    }
    if (!((spill386_1 == spill386_2))) {
        break forward_join_34;
    }
    forwardValue386_31_0 = ((net.minecraft.block.state.IBlockState)(life6_8)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    forwardValue386_31_1 = ((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q)));
    }
    if (!((forwardValue386_31_0 == forwardValue386_31_1))) {
        break forward_join_34;
    }
    forwardValue386_35_0 = 1;
    break forward_join_35;
    }
    forwardValue386_35_0 = 0;
    }
    return ((forwardValue386_35_0) != 0);
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
int forestValue835_43_0;
    boolean spill835_0;
    long life4_3;
    int[] life6_5;
    forest_join_63: {
    forest_join_58: {
    forest_join_51: {
    forest_join_44: {
    forest_join_43: {
    forest_join_39: {
    forest_join_37: {
    forest_join_32: {
    forest_join_25: {
    forest_join_18: {
    life4_3 = (moom.ew.Y ^ 137561202195002L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill835_0 = ((moom.ew)(this)).b__Boolean(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
    if (!((life6_5 != null))) {
        forestValue835_43_0 = ((spill835_0) ? 1 : 0);
        break forest_join_43;
    }
    if (!(spill835_0)) {
        break forest_join_39;
    }
    switch (((moom.ew)(this)).d(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)))) {
case 0:
{
        break forest_join_18;
    }
case 1:
{
        break forest_join_25;
    }
case 2:
{
        break forest_join_32;
    }
default:
{
        break forest_join_37;
    }
}
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.STRAIGHT)));
    if (!((life6_5 == null))) {
        break forest_join_37;
    }
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.INNER_RIGHT)));
    if (!((life6_5 == null))) {
        break forest_join_37;
    }
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.INNER_LEFT)));
    }
    if (!((life6_5 == null))) {
        break forest_join_63;
    }
    }
    forestValue835_43_0 = ((moom.ew)(this)).c(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
    }
    switch (forestValue835_43_0) {
case 0:
{
        break forest_join_44;
    }
case 1:
{
        break forest_join_51;
    }
case 2:
{
        break forest_join_58;
    }
default:
{
        break forest_join_63;
    }
}
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.STRAIGHT)));
    if (!((life6_5 == null))) {
        break forest_join_63;
    }
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.OUTER_RIGHT)));
    if (!((life6_5 == null))) {
        break forest_join_63;
    }
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.OUTER_LEFT)));
    }
    return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.ew.Q, moom.ew.R, moom.ew.S});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
moom.ew forwardValue389_72_0;
    moom.ew spill389_0;
    long life3_3;
    int[] life5_5;
    forward_join_79: {
    forward_join_72: {
    forward_join_71: {
    life3_3 = (moom.ew.Y ^ 49995195435049L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill389_0 = this;
    if (!((life5_5 != null))) {
        forwardValue389_72_0 = spill389_0;
        break forward_join_72;
    }
    if (!(((moom.ew)(spill389_0)).W)) {
        break forward_join_71;
    }
    ((moom.ew)(this)).a(((float)((0x1.0p-1f * ((float) (this.X % 2))))), ((float)((0x1.0p-1f * ((float) ((this.X / 4) % 2))))), ((float)((0x1.0p-1f * ((float) ((this.X / 2) % 2))))), ((float)((0x1.0p-1f + (0x1.0p-1f * ((float) (this.X % 2)))))), ((float)((0x1.0p-1f + (0x1.0p-1f * ((float) ((this.X / 4) % 2)))))), ((float)((0x1.0p-1f + (0x1.0p-1f * ((float) ((this.X / 2) % 2)))))));
    if (!((life5_5 == null))) {
        break forward_join_79;
    }
    }
    forwardValue389_72_0 = this;
    }
    ((moom.ew)(forwardValue389_72_0)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, moom.DT p1, moom.DR p2, moom.DR p3) {
int lexicalValue1155_31_0;
    int[][] lexicalValue1155_39_0;
    int lexicalValue1155_39_1;
    int lexicalValue1155_39_2;
    int[][] lexicalValue1155_40_0;
    int lexicalValue1155_40_1;
    int[][] lexicalValue1155_41_0;
    int lexicalValue1155_41_1;
    int lexicalValue1155_41_2;
    int[] lexicalValue1155_80_0;
    net.minecraft.util.MovingObjectPosition lexicalValue1155_143_0;
    int[] spill1155_0;
    int[][] spill1155_1;
    int spill1155_2;
    int spill1155_3;
    int[] spill1155_4;
    net.minecraft.util.MovingObjectPosition spill1155_5;
    long life5_3;
    net.minecraft.util.MovingObjectPosition[] life8_11;
    int[] life7_12;
    net.minecraft.block.state.IBlockState life9_16;
    int life10_22;
    int life11_33;
    int[] life12_48;
    int life13_53;
    int[] life13_94;
    int life14_97;
    int life15_99;
    int life16_106;
    net.minecraft.util.MovingObjectPosition life13_115;
    double life14_117;
    net.minecraft.util.MovingObjectPosition[] life16_119;
    int life17_122;
    int life18_124;
    net.minecraft.util.MovingObjectPosition life19_131;
    double life20_148;
    lexical_join_143: {
    lexical_join_142: {
    lexical_join_100: {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_31: {
    lexical_join_30: {
    life5_3 = (moom.ew.Y ^ 135510795919014L);
    spill1155_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_11 = new net.minecraft.util.MovingObjectPosition[__sourceIntrinsic_a7c3076b8527_invokedynamic1155_2(1241, (6317282385517057719L ^ life5_3))];
    life7_12 = spill1155_0;
    life9_16 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life10_22 = ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(life9_16)).a(((net.minecraft.block.properties.IProperty)(moom.ew.Q))))))).b();
    if (!((((net.minecraft.block.state.IBlockState)(life9_16)).a(((net.minecraft.block.properties.IProperty)(moom.ew.R))) == moom.al.TOP))) {
        break lexical_join_30;
    }
    lexicalValue1155_31_0 = 1;
    break lexical_join_31;
    }
    lexicalValue1155_31_0 = 0;
    }
    life11_33 = lexicalValue1155_31_0;
    spill1155_1 = moom.ew.T;
    spill1155_2 = life10_22;
    spill1155_3 = life11_33;
    if (!((life7_12 != null))) {
        lexicalValue1155_39_0 = spill1155_1;
        lexicalValue1155_39_1 = spill1155_2;
        lexicalValue1155_39_2 = spill1155_3;
        break lexical_join_39;
    }
    if (!((spill1155_3 != 0))) {
        lexicalValue1155_40_0 = spill1155_1;
        lexicalValue1155_40_1 = spill1155_2;
        break lexical_join_40;
    }
    lexicalValue1155_39_0 = spill1155_1;
    lexicalValue1155_39_1 = spill1155_2;
    lexicalValue1155_39_2 = 4;
    }
    lexicalValue1155_41_0 = lexicalValue1155_39_0;
    lexicalValue1155_41_1 = lexicalValue1155_39_1;
    lexicalValue1155_41_2 = lexicalValue1155_39_2;
    break lexical_join_41;
    }
    lexicalValue1155_41_0 = lexicalValue1155_40_0;
    lexicalValue1155_41_1 = lexicalValue1155_40_1;
    lexicalValue1155_41_2 = 0;
    }
    life12_48 = (lexicalValue1155_41_0)[(lexicalValue1155_41_1 + lexicalValue1155_41_2)];
    this.W = ((boolean)(true));
    life13_53 = 0;
    lexical_cycle_49: while (true) {
    lexical_join_77: {
    lexical_join_76: {
    if (!((life13_53 < __sourceIntrinsic_a7c3076b8527_invokedynamic1155_13(17750, (2440257668083668794L ^ life5_3))))) {
        break lexical_join_79;
    }
    this.X = ((int)(life13_53));
    if (!((life7_12 != null))) {
        break lexical_join_77;
    }
    spill1155_4 = life12_48;
    if (!((life7_12 != null))) {
        lexicalValue1155_80_0 = spill1155_4;
        break lexical_join_80;
    }
    if (!((java.util.Arrays.binarySearch(((int[])(spill1155_4)), ((int)(life13_53))) < 0))) {
        break lexical_join_76;
    }
    (life8_11)[life13_53] = super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.DR)(p2)), ((moom.DR)(p3)));
    }
    life13_53 += 1;
    }
    if (!((life7_12 == null))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    lexicalValue1155_80_0 = life12_48;
    }
    life13_94 = lexicalValue1155_80_0;
    life14_97 = (life13_94).length;
    life15_99 = 0;
    lexical_cycle_86: while (true) {
    if (!((life15_99 < life14_97))) {
        break lexical_join_100;
    }
    life16_106 = (life13_94)[life15_99];
    (life8_11)[life16_106] = null;
    life15_99 += 1;
    if (!((life7_12 == null))) { continue lexical_cycle_86; }
    break lexical_cycle_86;
    }
    }
    life13_115 = null;
    life14_117 = 0x0.0p0d;
    life16_119 = life8_11;
    life17_122 = (life16_119).length;
    life18_124 = 0;
    lexical_cycle_111: while (true) {
    lexical_join_140: {
    lexical_join_139: {
    if (!((life18_124 < life17_122))) {
        break lexical_join_142;
    }
    life19_131 = (life16_119)[life18_124];
    if (!((life7_12 != null))) {
        break lexical_join_140;
    }
    spill1155_5 = life19_131;
    if (!((life7_12 != null))) {
        lexicalValue1155_143_0 = spill1155_5;
        break lexical_join_143;
    }
    if (!((spill1155_5 != null))) {
        break lexical_join_139;
    }
    life20_148 = ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life19_131)).d)).c(((moom.DR)(p3)));
    if (!((life7_12 != null))) {
        break lexical_join_140;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life20_148)), ((double)(life14_117))) > 0))) {
        break lexical_join_139;
    }
    life13_115 = life19_131;
    life14_117 = life20_148;
    }
    life18_124 += 1;
    }
    if (!((life7_12 == null))) { continue lexical_cycle_111; }
    break lexical_cycle_111;
    }
    }
    lexicalValue1155_143_0 = life13_115;
    }
    return lexicalValue1155_143_0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
net.minecraft.block.state.IBlockState forwardValue387_45_0;
    net.minecraft.block.state.IBlockState forwardValue387_48_0;
    int[] spill387_0;
    net.minecraft.block.state.IBlockState spill387_1;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_15;
    int[] life11_16;
    net.minecraft.block.state.IBlockState life12_27;
    forward_join_48: {
    forward_join_45: {
    forward_join_44: {
    forward_join_39: {
    life9_3 = (moom.ew.Y ^ 6218411654715L);
    spill387_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_15 = super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.bs)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((int)(p6)), ((net.minecraft.entity.EntityLivingBase)(p7)));
    life11_16 = spill387_0;
    spill387_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life12_15)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.Q)), ((java.lang.Comparable)(((net.minecraft.entity.EntityLivingBase)(p7)).b__bs()))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.S)), ((java.lang.Comparable)(net.minecraft.block.BlockStairs$EnumShape.STRAIGHT)));
    if (!((life11_16 != null))) {
        forwardValue387_45_0 = spill387_1;
        break forward_join_45;
    }
    life12_27 = spill387_1;
    if (!((p2 != moom.bs.DOWN))) {
        break forward_join_44;
    }
    if (!((p2 != moom.bs.UP))) {
        break forward_join_39;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((double) p4))), ((double)(0x1.0p-1d))) <= 0))) {
        break forward_join_44;
    }
    }
    forwardValue387_48_0 = ((net.minecraft.block.state.IBlockState)(life12_27)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.R)), ((java.lang.Comparable)(moom.al.BOTTOM)));
    break forward_join_48;
    }
    forwardValue387_45_0 = life12_27;
    }
    forwardValue387_48_0 = ((net.minecraft.block.state.IBlockState)(forwardValue387_45_0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ew.R)), ((java.lang.Comparable)(moom.al.TOP)));
    }
    return forwardValue387_48_0;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.Block)(this.U)).a__fm(((net.minecraft.block.state.IBlockState)(this.V)));
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return ((net.minecraft.block.Block)(this.U)).a__bx();
}


public float a(net.minecraft.entity.Entity p0) {
return ((net.minecraft.block.Block)(this.U)).a(((net.minecraft.entity.Entity)(p0)));
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return ((net.minecraft.block.Block)(this.U)).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
}


public void a__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.block.Block)(this.U)).a__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.player.EntityPlayer p2) {
((net.minecraft.block.Block)(this.U)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.CA p3, java.util.List<moom.CA> p4, net.minecraft.entity.Entity p5) {
moom.ew forwardValue388_51_0;
    int[] spill388_0;
    moom.ew spill388_1;
    long life7_3;
    int life10_21;
    int[] life9_22;
    forward_join_58: {
    forward_join_51: {
    forward_join_50: {
    life7_3 = (moom.ew.Y ^ 64815354152713L);
    spill388_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((moom.ew)(this)).b__sourceReturn_4182cef048(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    life10_21 = ((((moom.ew)(this)).b__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    life9_22 = spill388_0;
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    if (!((life9_22 != null))) {
        break forward_join_58;
    }
    if (!((life10_21 != 0))) {
        break forward_join_50;
    }
    spill388_1 = this;
    if (!((life9_22 != null))) {
        forwardValue388_51_0 = spill388_1;
        break forward_join_51;
    }
    if (!(((moom.ew)(spill388_1)).c__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1))))) {
        break forward_join_50;
    }
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((moom.CA)(p3)), ((java.util.List)(p4)), ((net.minecraft.entity.Entity)(p5)));
    }
    forwardValue388_51_0 = this;
    }
    ((moom.ew)(forwardValue388_51_0)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2) {
((net.minecraft.block.Block)(this.U)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.Entity)(p2)));
    return;
}


public boolean a(net.minecraft.block.state.IBlockState p0, boolean p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(this.U)).a(((net.minecraft.block.state.IBlockState)(p0)), ((boolean)(p1))))) != 0);
}


public moom.DR a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2, moom.DR p3) {
return ((net.minecraft.block.Block)(this.U)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.Entity)(p2)), ((moom.DR)(p3)));
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
return ((net.minecraft.block.Block)(this.U)).a__CA(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
}


public int a(net.minecraft.world.World p0) {
return ((net.minecraft.block.Block)(this.U)).a(((net.minecraft.world.World)(p0)));
}


public boolean k() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.block.Block)(this.U)).k())) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic458_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic458_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic458_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic458_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic458_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic458_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic458_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e7013c746e33552_originalDynamicSite2705_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7c3076b8527_invokedynamic1155_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a7c3076b8527_invokedynamic1155_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7581_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
