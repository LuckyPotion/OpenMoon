package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


















import moom.DT;










import net.minecraft.block.BlockPlanks$EnumType;








import net.minecraft.world.IBlockAccess;
import java.util.Map;
import moom.I;
import net.minecraft.block.state.IBlockState;
public class BlockDoor extends net.minecraft.block.Block {

public static final moom.fx Q;

public static final moom.fv R;

public static final moom.fw<moom.J> S;

public static final moom.fv T;

public static final moom.fw<moom.I> U;

private static final long V;

private static final long[] W;

private static final java.lang.Integer[] X;

private static final java.util.Map Y;

protected BlockDoor(moom.fn p0) {
super(p0);
    (this).a__Void(((((((this.M).a__fE()).a__fE(net.minecraft.block.BlockDoor.Q, moom.bs.NORTH)).a__fE(net.minecraft.block.BlockDoor.R, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockDoor.S, moom.J.LEFT)).a__fE(net.minecraft.block.BlockDoor.T, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockDoor.U, moom.I.LOWER));
}


static {
V = ((long)(((moom._a)(moom._c.a(((long)(-9071213195791981813L)), ((long)(-1712305189606440891L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(61404596432240L)))));
    Y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.block.BlockDoor.V ^ 57301986246834L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1743_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1743_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1743_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1743_14 = new byte[8];
    (__sourceSpill1743_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1743_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1743_16 = __sourceSpill1743_14;
    ((javax.crypto.Cipher)(__sourceSpill1743_11)).init(((int)(__sourceSpill1743_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1743_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1743_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "q\0037ðWÃ#dõwù1 nteTå]Ø\000¤ØM\t=¼B\026­ñ1/'p!\005úè\033æ\030WDTaúæÍ¹\016¨ªïû¯+/lA\177ÖB:·j"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1743_25 = local6_life21;
        int __sourceSpill1743_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1743_25)).substring(((int)(__sourceSpill1743_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1743_30 = local8_life19;
        int __sourceSpill1743_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1743_33 = new byte[8];
        (__sourceSpill1743_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1743_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1743_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1743_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1743_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1743_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1743_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1743_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1743_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1743_34)).doFinal(((byte[])(__sourceSpill1743_33)));
        (__sourceSpill1743_30)[__sourceSpill1743_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ü\f¡Û\\ÝLö\tìÆ5;÷P"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1743_38 = local6_life21;
        int __sourceSpill1743_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1743_38)).substring(((int)(__sourceSpill1743_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1743_43 = local8_life19;
        int __sourceSpill1743_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1743_46 = new byte[8];
        (__sourceSpill1743_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1743_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1743_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1743_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1743_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1743_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1743_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1743_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1743_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1743_47)).doFinal(((byte[])(__sourceSpill1743_46)));
        (__sourceSpill1743_43)[__sourceSpill1743_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    W = ((long[])(local8_life19));
    X = ((java.lang.Integer[])(new java.lang.Integer[11]));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("open")))));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("hinge")), ((java.lang.Class)(moom.J.class)))));
    T = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
    U = ((moom.fw)(moom.fw.a(((java.lang.String)("half")), ((java.lang.Class)(moom.I.class)))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
java.lang.Comparable forwardValue4660_37_0;
    java.lang.Comparable forwardValue4660_60_0;
    int forwardValue4660_70_0;
    int[] spill4660_0;
    java.lang.Comparable spill4660_1;
    java.lang.Comparable spill4660_2;
    boolean spill4660_3;
    boolean spill4660_4;
    long life2_3;
    int life5_6;
    int[] life4_7;
    forward_join_70: {
    forward_join_69: {
    forward_join_60: {
    forward_join_48: {
    forward_join_37: {
    forward_join_34: {
    life2_3 = (net.minecraft.block.BlockDoor.V ^ 67801603942950L);
    spill4660_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill4660_0;
    spill4660_1 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U)));
    if (!((life4_7 != null))) {
        forwardValue4660_60_0 = spill4660_1;
        break forward_join_60;
    }
    if (!((spill4660_1 == moom.I.UPPER))) {
        break forward_join_48;
    }
    life5_6 = (life5_6 | __sourceIntrinsic_8db5871551d4_invokedynamic4660_5(19356, (4937766092421609669L ^ life2_3)));
    spill4660_2 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.S)));
    if (!((life4_7 != null))) {
        forwardValue4660_37_0 = spill4660_2;
        break forward_join_37;
    }
    if (!((spill4660_2 == moom.J.RIGHT))) {
        break forward_join_34;
    }
    life5_6 = (life5_6 | 1);
    }
    forwardValue4660_37_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.T)));
    }
    spill4660_3 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue4660_37_0)))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue4660_70_0 = ((spill4660_3) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill4660_3)) {
        break forward_join_69;
    }
    life5_6 = (life5_6 | 2);
    if (!((life4_7 == null))) {
        break forward_join_69;
    }
    }
    life5_6 = (life5_6 | ((moom.bs)(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.Q))))))).b__bs())).b());
    forwardValue4660_60_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.R)));
    }
    spill4660_4 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue4660_60_0)))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue4660_70_0 = ((spill4660_4) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill4660_4)) {
        break forward_join_69;
    }
    life5_6 = (life5_6 | 4);
    }
    forwardValue4660_70_0 = life5_6;
    }
    return forwardValue4660_70_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue4663_26_0;
    moom.fw forwardValue4663_26_1;
    net.minecraft.block.state.IBlockState forwardValue4663_27_0;
    moom.fw forwardValue4663_27_1;
    moom.J forwardValue4663_27_2;
    net.minecraft.block.state.IBlockState forwardValue4663_36_0;
    moom.fv forwardValue4663_36_1;
    int forwardValue4663_36_2;
    net.minecraft.block.state.IBlockState forwardValue4663_37_0;
    moom.fv forwardValue4663_37_1;
    net.minecraft.block.state.IBlockState forwardValue4663_38_0;
    moom.fv forwardValue4663_38_1;
    int forwardValue4663_38_2;
    net.minecraft.block.state.IBlockState forwardValue4663_61_0;
    moom.fv forwardValue4663_61_1;
    int forwardValue4663_61_2;
    net.minecraft.block.state.IBlockState forwardValue4663_62_0;
    moom.fv forwardValue4663_62_1;
    net.minecraft.block.state.IBlockState forwardValue4663_63_0;
    moom.fv forwardValue4663_63_1;
    int forwardValue4663_63_2;
    net.minecraft.block.state.IBlockState forwardValue4663_65_0;
    net.minecraft.block.state.IBlockState spill4663_0;
    moom.fw spill4663_1;
    net.minecraft.block.state.IBlockState spill4663_2;
    moom.fv spill4663_3;
    int spill4663_4;
    net.minecraft.block.state.IBlockState spill4663_5;
    moom.fv spill4663_6;
    int spill4663_7;
    long life2_3;
    int[] life4_5;
    forward_join_65: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_41: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (net.minecraft.block.BlockDoor.V ^ 54006727364908L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!(((p0 & __sourceIntrinsic_819466f05fee_invokedynamic4663_2(12366, (5514506766357739538L ^ life2_3))) > 0))) {
        break forward_join_41;
    }
    spill4663_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockDoor)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U)), ((java.lang.Comparable)(moom.I.UPPER)));
    spill4663_1 = net.minecraft.block.BlockDoor.S;
    if (!(((p0 & 1) > 0))) {
        forwardValue4663_26_0 = spill4663_0;
        forwardValue4663_26_1 = spill4663_1;
        break forward_join_26;
    }
    forwardValue4663_27_0 = spill4663_0;
    forwardValue4663_27_1 = spill4663_1;
    forwardValue4663_27_2 = moom.J.RIGHT;
    break forward_join_27;
    }
    forwardValue4663_27_0 = forwardValue4663_26_0;
    forwardValue4663_27_1 = forwardValue4663_26_1;
    forwardValue4663_27_2 = moom.J.LEFT;
    }
    spill4663_2 = ((net.minecraft.block.state.IBlockState)(forwardValue4663_27_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4663_27_1)), ((java.lang.Comparable)(forwardValue4663_27_2)));
    spill4663_3 = net.minecraft.block.BlockDoor.T;
    spill4663_4 = (p0 & 2);
    if (!((life4_5 != null))) {
        forwardValue4663_36_0 = spill4663_2;
        forwardValue4663_36_1 = spill4663_3;
        forwardValue4663_36_2 = spill4663_4;
        break forward_join_36;
    }
    if (!((spill4663_4 > 0))) {
        forwardValue4663_37_0 = spill4663_2;
        forwardValue4663_37_1 = spill4663_3;
        break forward_join_37;
    }
    forwardValue4663_36_0 = spill4663_2;
    forwardValue4663_36_1 = spill4663_3;
    forwardValue4663_36_2 = 1;
    }
    forwardValue4663_38_0 = forwardValue4663_36_0;
    forwardValue4663_38_1 = forwardValue4663_36_1;
    forwardValue4663_38_2 = forwardValue4663_36_2;
    break forward_join_38;
    }
    forwardValue4663_38_0 = forwardValue4663_37_0;
    forwardValue4663_38_1 = forwardValue4663_37_1;
    forwardValue4663_38_2 = 0;
    }
    forwardValue4663_65_0 = ((net.minecraft.block.state.IBlockState)(forwardValue4663_38_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4663_38_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4663_38_2)))))));
    break forward_join_65;
    }
    spill4663_5 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockDoor)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U)), ((java.lang.Comparable)(moom.I.LOWER))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.Q)), ((java.lang.Comparable)(((moom.bs)(moom.bs.b(((int)((p0 & 3)))))).e__bs())));
    spill4663_6 = net.minecraft.block.BlockDoor.R;
    spill4663_7 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue4663_61_0 = spill4663_5;
        forwardValue4663_61_1 = spill4663_6;
        forwardValue4663_61_2 = spill4663_7;
        break forward_join_61;
    }
    if (!((spill4663_7 > 0))) {
        forwardValue4663_62_0 = spill4663_5;
        forwardValue4663_62_1 = spill4663_6;
        break forward_join_62;
    }
    forwardValue4663_61_0 = spill4663_5;
    forwardValue4663_61_1 = spill4663_6;
    forwardValue4663_61_2 = 1;
    }
    forwardValue4663_63_0 = forwardValue4663_61_0;
    forwardValue4663_63_1 = forwardValue4663_61_1;
    forwardValue4663_63_2 = forwardValue4663_61_2;
    break forward_join_63;
    }
    forwardValue4663_63_0 = forwardValue4663_62_0;
    forwardValue4663_63_1 = forwardValue4663_62_1;
    forwardValue4663_63_2 = 0;
    }
    forwardValue4663_65_0 = ((net.minecraft.block.state.IBlockState)(forwardValue4663_63_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4663_63_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4663_63_2)))))));
    }
    return forwardValue4663_65_0;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue4662_20_0;
    int forwardValue4662_27_0;
    int forwardValue4662_35_0;
    int forwardValue4662_39_0;
    int forwardValue4662_41_0;
    int spill4662_0;
    long life3_3;
    int[] life5_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_27: {
    forward_join_20: {
    life3_3 = (net.minecraft.block.BlockDoor.V ^ 67010517026830L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4662_0 = ((moom.DT)(p1)).b();
    if (!((life5_5 != null))) {
        forwardValue4662_20_0 = spill4662_0;
        break forward_join_20;
    }
    if (!((spill4662_0 < __sourceIntrinsic_b5eaa787bfb8_invokedynamic4662_3(11614, (1047289658394000428L ^ life3_3))))) {
        break forward_join_40;
    }
    forwardValue4662_20_0 = ((__sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue4662_27_0 = forwardValue4662_20_0;
        break forward_join_27;
    }
    if (!((forwardValue4662_20_0 != 0))) {
        break forward_join_40;
    }
    forwardValue4662_27_0 = ((super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue4662_35_0 = forwardValue4662_27_0;
        break forward_join_35;
    }
    if (!((forwardValue4662_27_0 != 0))) {
        break forward_join_40;
    }
    forwardValue4662_35_0 = ((super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a__DT())))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue4662_39_0 = forwardValue4662_35_0;
        break forward_join_39;
    }
    if (!((forwardValue4662_35_0 != 0))) {
        break forward_join_40;
    }
    forwardValue4662_39_0 = 1;
    }
    forwardValue4662_41_0 = forwardValue4662_39_0;
    break forward_join_41;
    }
    forwardValue4662_41_0 = 0;
    }
    return ((forwardValue4662_41_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9957_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_ea1a987036ae8c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25496;
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
            throw new RuntimeException("moom/dr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         X[var3] = var15;
      }

      return X[var3];
}


protected static boolean b__Boolean(int p0) {
int forwardValue4661_17_0;
    int forwardValue4661_19_0;
    int spill4661_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.block.BlockDoor.V ^ 6369410451253L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4661_0 = (p0 & __sourceIntrinsic_194cfabefc03_invokedynamic4661_2(19356, (4937704930802931158L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue4661_17_0 = spill4661_0;
        break forward_join_17;
    }
    if (!((spill4661_0 != 0))) {
        break forward_join_18;
    }
    forwardValue4661_17_0 = 1;
    }
    forwardValue4661_19_0 = forwardValue4661_17_0;
    break forward_join_19;
    }
    forwardValue4661_19_0 = 0;
    }
    return ((forwardValue4661_19_0) != 0);
}


public static boolean b__sourceReturn_b38f36a0de(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((__sourceExactCall_15b2f78bff3c45(((int)(net.minecraft.block.BlockDoor.c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)))))))) != 0);
}


public int e__Int() {
return 1;
}


public static int c(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue4665_33_0;
    int forwardValue4665_35_0;
    int forwardValue4665_51_0;
    int forwardValue4665_53_0;
    int forwardValue4665_61_0;
    int forwardValue4665_63_0;
    int forwardValue4665_71_0;
    int forwardValue4665_73_0;
    int forwardValue4665_85_0;
    int forwardValue4665_85_1;
    int forwardValue4665_86_0;
    int forwardValue4665_87_0;
    int forwardValue4665_87_1;
    int forwardValue4665_97_0;
    int forwardValue4665_97_1;
    int forwardValue4665_98_0;
    int forwardValue4665_99_0;
    int forwardValue4665_99_1;
    int forwardValue4665_109_0;
    int forwardValue4665_109_1;
    int forwardValue4665_110_0;
    int forwardValue4665_111_0;
    int forwardValue4665_111_1;
    int[] spill4665_0;
    int spill4665_1;
    int spill4665_2;
    int spill4665_3;
    int spill4665_4;
    int spill4665_5;
    int spill4665_6;
    int spill4665_7;
    int spill4665_8;
    int spill4665_9;
    int spill4665_10;
    long life2_3;
    net.minecraft.block.state.IBlockState life5_8;
    int life6_13;
    int life7_16;
    int[] life4_17;
    net.minecraft.block.state.IBlockState life8_22;
    int life9_27;
    int life10_38;
    net.minecraft.block.state.IBlockState life11_43;
    int life12_48;
    int life13_59;
    int life14_72;
    int life15_85;
    forward_join_111: {
    forward_join_110: {
    forward_join_109: {
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_73: {
    forward_join_72: {
    forward_join_71: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    life2_3 = (net.minecraft.block.BlockDoor.V ^ 2877417770175L);
    spill4665_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life6_13 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_8)).a__ch())).b(((net.minecraft.block.state.IBlockState)(life5_8)));
    life7_16 = ((net.minecraft.block.BlockDoor.b__Boolean(((int)(life6_13)))) ? 1 : 0);
    life4_17 = spill4665_0;
    life8_22 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT())));
    life9_27 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life8_22)).a__ch())).b(((net.minecraft.block.state.IBlockState)(life8_22)));
    spill4665_1 = life7_16;
    if (!((life4_17 != null))) {
        forwardValue4665_33_0 = spill4665_1;
        break forward_join_33;
    }
    if (!((spill4665_1 != 0))) {
        break forward_join_34;
    }
    forwardValue4665_33_0 = life9_27;
    }
    forwardValue4665_35_0 = forwardValue4665_33_0;
    break forward_join_35;
    }
    forwardValue4665_35_0 = life6_13;
    }
    life10_38 = forwardValue4665_35_0;
    life11_43 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT())));
    life12_48 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life11_43)).a__ch())).b(((net.minecraft.block.state.IBlockState)(life11_43)));
    spill4665_2 = life7_16;
    if (!((life4_17 != null))) {
        forwardValue4665_51_0 = spill4665_2;
        break forward_join_51;
    }
    if (!((spill4665_2 != 0))) {
        break forward_join_52;
    }
    forwardValue4665_51_0 = life6_13;
    }
    forwardValue4665_53_0 = forwardValue4665_51_0;
    break forward_join_53;
    }
    forwardValue4665_53_0 = life12_48;
    }
    life13_59 = forwardValue4665_53_0;
    spill4665_3 = (life13_59 & 1);
    if (!((life4_17 != null))) {
        forwardValue4665_61_0 = spill4665_3;
        break forward_join_61;
    }
    if (!((spill4665_3 != 0))) {
        break forward_join_62;
    }
    forwardValue4665_61_0 = 1;
    }
    forwardValue4665_63_0 = forwardValue4665_61_0;
    break forward_join_63;
    }
    forwardValue4665_63_0 = 0;
    }
    life14_72 = forwardValue4665_63_0;
    spill4665_4 = (life13_59 & 2);
    if (!((life4_17 != null))) {
        forwardValue4665_71_0 = spill4665_4;
        break forward_join_71;
    }
    if (!((spill4665_4 != 0))) {
        break forward_join_72;
    }
    forwardValue4665_71_0 = 1;
    }
    forwardValue4665_73_0 = forwardValue4665_71_0;
    break forward_join_73;
    }
    forwardValue4665_73_0 = 0;
    }
    life15_85 = forwardValue4665_73_0;
    spill4665_5 = __sourceExactCall_c965fac3cb006c(((int)(life10_38)));
    spill4665_6 = life7_16;
    if (!((life4_17 != null))) {
        forwardValue4665_85_0 = spill4665_5;
        forwardValue4665_85_1 = spill4665_6;
        break forward_join_85;
    }
    if (!((spill4665_6 != 0))) {
        forwardValue4665_86_0 = spill4665_5;
        break forward_join_86;
    }
    forwardValue4665_85_0 = spill4665_5;
    forwardValue4665_85_1 = __sourceIntrinsic_cbf18562f888_invokedynamic4665_16(19356, (4937712305345420892L ^ life2_3));
    }
    forwardValue4665_87_0 = forwardValue4665_85_0;
    forwardValue4665_87_1 = forwardValue4665_85_1;
    break forward_join_87;
    }
    forwardValue4665_87_0 = forwardValue4665_86_0;
    forwardValue4665_87_1 = 0;
    }
    spill4665_7 = (forwardValue4665_87_0 | forwardValue4665_87_1);
    spill4665_8 = life14_72;
    if (!((life4_17 != null))) {
        forwardValue4665_97_0 = spill4665_7;
        forwardValue4665_97_1 = spill4665_8;
        break forward_join_97;
    }
    if (!((spill4665_8 != 0))) {
        forwardValue4665_98_0 = spill4665_7;
        break forward_join_98;
    }
    forwardValue4665_97_0 = spill4665_7;
    forwardValue4665_97_1 = __sourceIntrinsic_cbf18562f888_invokedynamic4665_17(9718, (3637351408848973883L ^ life2_3));
    }
    forwardValue4665_99_0 = forwardValue4665_97_0;
    forwardValue4665_99_1 = forwardValue4665_97_1;
    break forward_join_99;
    }
    forwardValue4665_99_0 = forwardValue4665_98_0;
    forwardValue4665_99_1 = 0;
    }
    spill4665_9 = (forwardValue4665_99_0 | forwardValue4665_99_1);
    spill4665_10 = life15_85;
    if (!((life4_17 != null))) {
        forwardValue4665_109_0 = spill4665_9;
        forwardValue4665_109_1 = spill4665_10;
        break forward_join_109;
    }
    if (!((spill4665_10 != 0))) {
        forwardValue4665_110_0 = spill4665_9;
        break forward_join_110;
    }
    forwardValue4665_109_0 = spill4665_9;
    forwardValue4665_109_1 = __sourceIntrinsic_cbf18562f888_invokedynamic4665_18(11485, (1740128145457625363L ^ life2_3));
    }
    forwardValue4665_111_0 = forwardValue4665_109_0;
    forwardValue4665_111_1 = forwardValue4665_109_1;
    break forward_join_111;
    }
    forwardValue4665_111_0 = forwardValue4665_110_0;
    forwardValue4665_111_1 = 0;
    }
    return (forwardValue4665_111_0 | forwardValue4665_111_1);
}


protected static boolean c(int p0) {
int forwardValue4664_17_0;
    int forwardValue4664_19_0;
    int spill4664_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.block.BlockDoor.V ^ 14132537657334L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4664_0 = (p0 & __sourceIntrinsic_63673aced462_invokedynamic4664_2(11589, (8758537874359776200L ^ life1_3)));
    if (!((life3_5 != null))) {
        forwardValue4664_17_0 = spill4664_0;
        break forward_join_17;
    }
    if (!((spill4664_0 != 0))) {
        break forward_join_18;
    }
    forwardValue4664_17_0 = 1;
    }
    forwardValue4664_19_0 = forwardValue4664_17_0;
    break forward_join_19;
    }
    forwardValue4664_19_0 = 0;
    }
    return ((forwardValue4664_19_0) != 0);
}


protected static boolean a__Boolean(int p0) {
int forwardValue4657_13_0;
    int forwardValue4657_15_0;
    int spill4657_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.block.BlockDoor.V ^ 131358595557066L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4657_0 = (p0 & 4);
    if (!((life3_5 != null))) {
        forwardValue4657_13_0 = spill4657_0;
        break forward_join_13;
    }
    if (!((spill4657_0 != 0))) {
        break forward_join_14;
    }
    forwardValue4657_13_0 = 1;
    }
    forwardValue4657_15_0 = forwardValue4657_13_0;
    break forward_join_15;
    }
    forwardValue4657_15_0 = 0;
    }
    return ((forwardValue4657_15_0) != 0);
}


public static moom.bs a__bs(int p0) {
return ((moom.bs)(moom.bs.b(((int)((p0 & 3)))))).e__bs();
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.block.BlockDoor)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


protected static int a__sourceReturn_0f7a48eca2(int p0) {
long local1 = (net.minecraft.block.BlockDoor.V ^ 670746796330L);
    return (p0 & __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1747_1(28252, (3728447312449984014L ^ local1)));
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
((net.minecraft.block.BlockDoor)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a__CA(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
}


public static moom.bs a__sourceReturn_a453b71f1c(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return net.minecraft.block.BlockDoor.a__bs(((int)(net.minecraft.block.BlockDoor.c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1))))));
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite1748_1(((net.minecraft.block.BlockDoor)(this)).b__String()))).replaceAll(((java.lang.String)("tile")), ((java.lang.String)("item"))))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((__sourceExactCall_15b2f78bff3c45(((int)(net.minecraft.block.BlockDoor.c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)))))))) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockDoor.U, net.minecraft.block.BlockDoor.Q, net.minecraft.block.BlockDoor.R, net.minecraft.block.BlockDoor.S, net.minecraft.block.BlockDoor.T});
}


private net.minecraft.item.Item a__wQ() {
net.minecraft.block.BlockDoor forwardValue4659_15_0;
    net.minecraft.block.Block forwardValue4659_15_1;
    net.minecraft.block.BlockDoor forwardValue4659_22_0;
    net.minecraft.block.Block forwardValue4659_22_1;
    net.minecraft.block.BlockDoor forwardValue4659_29_0;
    net.minecraft.block.Block forwardValue4659_29_1;
    net.minecraft.block.BlockDoor forwardValue4659_36_0;
    net.minecraft.block.Block forwardValue4659_36_1;
    net.minecraft.block.BlockDoor forwardValue4659_43_0;
    net.minecraft.block.Block forwardValue4659_43_1;
    net.minecraft.item.Item forwardValue4659_47_0;
    net.minecraft.block.BlockDoor spill4659_0;
    net.minecraft.block.Block spill4659_1;
    long life1_3;
    int[] life3_5;
    forward_join_47: {
    forward_join_46: {
    forward_join_43: {
    forward_join_41: {
    forward_join_36: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    forward_join_22: {
    forward_join_20: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.block.BlockDoor.V ^ 117119269882884L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4659_0 = this;
    spill4659_1 = net.minecraft.init.Blocks.aA;
    if (!((life3_5 != null))) {
        forwardValue4659_15_0 = spill4659_0;
        forwardValue4659_15_1 = spill4659_1;
        break forward_join_15;
    }
    if (!((spill4659_0 == spill4659_1))) {
        break forward_join_13;
    }
    forwardValue4659_47_0 = net.minecraft.init.Items.aB;
    break forward_join_47;
    }
    forwardValue4659_15_0 = this;
    forwardValue4659_15_1 = net.minecraft.init.Blocks.ap;
    }
    if (!((life3_5 != null))) {
        forwardValue4659_22_0 = forwardValue4659_15_0;
        forwardValue4659_22_1 = forwardValue4659_15_1;
        break forward_join_22;
    }
    if (!((forwardValue4659_15_0 == forwardValue4659_15_1))) {
        break forward_join_20;
    }
    forwardValue4659_47_0 = net.minecraft.init.Items.ar;
    break forward_join_47;
    }
    forwardValue4659_22_0 = this;
    forwardValue4659_22_1 = net.minecraft.init.Blocks.aq;
    }
    if (!((life3_5 != null))) {
        forwardValue4659_29_0 = forwardValue4659_22_0;
        forwardValue4659_29_1 = forwardValue4659_22_1;
        break forward_join_29;
    }
    if (!((forwardValue4659_22_0 == forwardValue4659_22_1))) {
        break forward_join_27;
    }
    forwardValue4659_47_0 = net.minecraft.init.Items.as;
    break forward_join_47;
    }
    forwardValue4659_29_0 = this;
    forwardValue4659_29_1 = net.minecraft.init.Blocks.ar;
    }
    if (!((life3_5 != null))) {
        forwardValue4659_36_0 = forwardValue4659_29_0;
        forwardValue4659_36_1 = forwardValue4659_29_1;
        break forward_join_36;
    }
    if (!((forwardValue4659_29_0 == forwardValue4659_29_1))) {
        break forward_join_34;
    }
    forwardValue4659_47_0 = net.minecraft.init.Items.at;
    break forward_join_47;
    }
    forwardValue4659_36_0 = this;
    forwardValue4659_36_1 = net.minecraft.init.Blocks.as;
    }
    if (!((life3_5 != null))) {
        forwardValue4659_43_0 = forwardValue4659_36_0;
        forwardValue4659_43_1 = forwardValue4659_36_1;
        break forward_join_43;
    }
    if (!((forwardValue4659_36_0 == forwardValue4659_36_1))) {
        break forward_join_41;
    }
    forwardValue4659_47_0 = net.minecraft.init.Items.au;
    break forward_join_47;
    }
    forwardValue4659_43_0 = this;
    forwardValue4659_43_1 = net.minecraft.init.Blocks.at;
    }
    if (!((forwardValue4659_43_0 == forwardValue4659_43_1))) {
        break forward_join_46;
    }
    forwardValue4659_47_0 = net.minecraft.init.Items.av;
    break forward_join_47;
    }
    forwardValue4659_47_0 = net.minecraft.init.Items.aq;
    }
    return forwardValue4659_47_0;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return ((net.minecraft.block.BlockDoor)(this)).a__wQ();
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
moom.DT forwardValue4655_21_0;
    net.minecraft.block.state.IBlockState forwardValue4655_31_0;
    net.minecraft.block.state.IBlockState forwardValue4655_43_0;
    net.minecraft.world.World forwardValue4655_69_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4655_69_1;
    int forwardValue4655_69_2;
    net.minecraft.world.World forwardValue4655_70_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4655_70_1;
    net.minecraft.world.World forwardValue4655_75_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4655_75_1;
    int forwardValue4655_75_2;
    net.minecraft.block.state.IBlockState spill4655_0;
    net.minecraft.world.World spill4655_1;
    net.minecraft.entity.player.EntityPlayer spill4655_2;
    boolean spill4655_3;
    long life9_3;
    int[] life11_5;
    moom.DT life12_25;
    net.minecraft.block.state.IBlockState life13_37;
    net.minecraft.block.state.IBlockState life3_54;
    forward_join_75: {
    forward_join_70: {
    forward_join_69: {
    forward_join_43: {
    forward_join_40: {
    forward_join_31: {
    forward_join_28: {
    forward_join_21: {
    forward_join_19: {
    forward_join_12: {
    life9_3 = (net.minecraft.block.BlockDoor.V ^ 139808780192364L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((this.J == moom.fn.f))) {
        break forward_join_12;
    }
    return ((1) != 0);
    }
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U))) == moom.I.LOWER))) {
        break forward_join_19;
    }
    forwardValue4655_21_0 = p1;
    break forward_join_21;
    }
    forwardValue4655_21_0 = ((moom.DT)(p1)).b__DT();
    }
    life12_25 = forwardValue4655_21_0;
    if (!(((moom.DT)(p1)).equals(((java.lang.Object)(life12_25))))) {
        break forward_join_28;
    }
    forwardValue4655_31_0 = p2;
    break forward_join_31;
    }
    forwardValue4655_31_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_25)));
    }
    life13_37 = forwardValue4655_31_0;
    spill4655_0 = life13_37;
    if (!((life11_5 != null))) {
        forwardValue4655_43_0 = spill4655_0;
        break forward_join_43;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4655_0)).a__ch() != this))) {
        break forward_join_40;
    }
    return ((0) != 0);
    }
    forwardValue4655_43_0 = ((net.minecraft.block.state.IBlockState)(life13_37)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.R)));
    }
    life3_54 = forwardValue4655_43_0;
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_25)), ((net.minecraft.block.state.IBlockState)(life3_54)), ((int)(2)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_25)), ((moom.DT)(p1)));
    spill4655_1 = p0;
    spill4655_2 = p3;
    spill4655_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life3_54)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.R))))))).booleanValue();
    if (!((life11_5 != null))) {
        forwardValue4655_69_0 = spill4655_1;
        forwardValue4655_69_1 = spill4655_2;
        forwardValue4655_69_2 = ((spill4655_3) ? 1 : 0);
        break forward_join_69;
    }
    if (!(spill4655_3)) {
        forwardValue4655_70_0 = spill4655_1;
        forwardValue4655_70_1 = spill4655_2;
        break forward_join_70;
    }
    forwardValue4655_69_0 = spill4655_1;
    forwardValue4655_69_1 = spill4655_2;
    forwardValue4655_69_2 = __sourceIntrinsic_1ca9d0413800_invokedynamic4655_22(11859, (2969001367623499078L ^ life9_3));
    }
    forwardValue4655_75_0 = forwardValue4655_69_0;
    forwardValue4655_75_1 = forwardValue4655_69_1;
    forwardValue4655_75_2 = forwardValue4655_69_2;
    break forward_join_75;
    }
    forwardValue4655_75_0 = forwardValue4655_70_0;
    forwardValue4655_75_1 = forwardValue4655_70_1;
    forwardValue4655_75_2 = __sourceIntrinsic_1ca9d0413800_invokedynamic4655_23(11487, (7721457360057335753L ^ life9_3));
    }
    ((net.minecraft.world.World)(forwardValue4655_75_0)).a(((net.minecraft.entity.player.EntityPlayer)(forwardValue4655_75_1)), ((int)(forwardValue4655_75_2)), ((moom.DT)(p1)), ((int)(0)));
    return ((1) != 0);
}


public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, moom.DT p1, moom.DR p2, moom.DR p3) {
((net.minecraft.block.BlockDoor)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.DR)(p2)), ((moom.DR)(p3)));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
long local4 = (net.minecraft.block.BlockDoor.V ^ 108268039359671L);
    return ((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U))) == moom.I.UPPER) ? null : ((net.minecraft.block.BlockDoor)(this)).a__wQ());
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
net.minecraft.block.Block forwardValue4653_32_0;
    net.minecraft.block.BlockDoor forwardValue4653_32_1;
    int forwardValue4653_86_0;
    int forwardValue4653_103_0;
    int forwardValue4653_113_0;
    int forwardValue4653_115_0;
    int forwardValue4653_124_0;
    net.minecraft.block.Block forwardValue4653_126_0;
    int forwardValue4653_155_0;
    int forwardValue4653_155_1;
    int forwardValue4653_165_0;
    net.minecraft.world.World forwardValue4653_181_0;
    java.lang.Object forwardValue4653_181_1;
    int forwardValue4653_181_2;
    net.minecraft.world.World forwardValue4653_182_0;
    java.lang.Object forwardValue4653_182_1;
    net.minecraft.world.World forwardValue4653_187_0;
    java.lang.Object forwardValue4653_187_1;
    int forwardValue4653_187_2;
    net.minecraft.block.Block spill4653_0;
    net.minecraft.block.BlockDoor spill4653_1;
    boolean spill4653_2;
    int spill4653_3;
    boolean spill4653_4;
    int spill4653_5;
    net.minecraft.block.Block spill4653_6;
    int spill4653_7;
    boolean spill4653_8;
    int spill4653_9;
    net.minecraft.world.World spill4653_10;
    java.lang.Object spill4653_11;
    int spill4653_12;
    long life5_3;
    int[] life7_5;
    moom.DT life8_13;
    net.minecraft.block.state.IBlockState life9_17;
    int life8_54;
    moom.DT life9_57;
    net.minecraft.block.state.IBlockState life10_61;
    int life11_163;
    forward_join_190: {
    forward_join_187: {
    forward_join_182: {
    forward_join_181: {
    forward_join_165: {
    forward_join_155: {
    forward_join_126: {
    forward_join_125: {
    forward_join_124: {
    forward_join_115: {
    forward_join_114: {
    forward_join_113: {
    forward_join_112: {
    forward_join_103: {
    forward_join_100: {
    forward_join_86: {
    forward_join_85: {
    forward_join_62: {
    forward_join_60: {
    forward_join_41: {
    forward_join_39: {
    forward_join_32: {
    forward_join_30: {
    life5_3 = (net.minecraft.block.BlockDoor.V ^ 11663467171706L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U))) == moom.I.UPPER))) {
        break forward_join_41;
    }
    life8_13 = ((moom.DT)(p1)).b__DT();
    life9_17 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_13)));
    spill4653_0 = ((net.minecraft.block.state.IBlockState)(life9_17)).a__ch();
    spill4653_1 = this;
    if (!((life7_5 != null))) {
        forwardValue4653_32_0 = spill4653_0;
        forwardValue4653_32_1 = spill4653_1;
        break forward_join_32;
    }
    if (!((spill4653_0 != spill4653_1))) {
        break forward_join_30;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    if (!((life7_5 == null))) {
        break forward_join_39;
    }
    }
    forwardValue4653_32_0 = p3;
    forwardValue4653_32_1 = this;
    }
    if (!((forwardValue4653_32_0 != forwardValue4653_32_1))) {
        break forward_join_39;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life8_13)), ((net.minecraft.block.state.IBlockState)(life9_17)), ((net.minecraft.block.Block)(p3)));
    }
    if (!((life7_5 == null))) {
        break forward_join_190;
    }
    }
    life8_54 = 0;
    life9_57 = ((moom.DT)(p1)).a__DT();
    life10_61 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_57)));
    if (!((life7_5 != null))) {
        break forward_join_60;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life10_61)).a__ch() != this))) {
        break forward_join_62;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    }
    life8_54 = 1;
    }
    spill4653_2 = __sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life7_5 != null))) {
        forwardValue4653_86_0 = ((spill4653_2) ? 1 : 0);
        break forward_join_86;
    }
    if (!((!spill4653_2))) {
        break forward_join_85;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    spill4653_3 = 1;
    if (!((life7_5 != null))) {
        forwardValue4653_86_0 = spill4653_3;
        break forward_join_86;
    }
    life8_54 = spill4653_3;
    if (!((((net.minecraft.block.state.IBlockState)(life10_61)).a__ch() == this))) {
        break forward_join_85;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life9_57)));
    }
    forwardValue4653_86_0 = life8_54;
    }
    if (!((life7_5 != null))) {
        forwardValue4653_103_0 = forwardValue4653_86_0;
        break forward_join_103;
    }
    if (!((forwardValue4653_86_0 != 0))) {
        break forward_join_100;
    }
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_190;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    if (!((life7_5 == null))) {
        break forward_join_190;
    }
    }
    forwardValue4653_103_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue4653_113_0 = forwardValue4653_103_0;
        break forward_join_113;
    }
    if (!((forwardValue4653_103_0 == 0))) {
        break forward_join_112;
    }
    spill4653_4 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(life9_57)));
    if (!((life7_5 != null))) {
        forwardValue4653_113_0 = ((spill4653_4) ? 1 : 0);
        break forward_join_113;
    }
    if (!(spill4653_4)) {
        break forward_join_114;
    }
    }
    forwardValue4653_113_0 = 1;
    }
    forwardValue4653_115_0 = forwardValue4653_113_0;
    break forward_join_115;
    }
    forwardValue4653_115_0 = 0;
    }
    life11_163 = forwardValue4653_115_0;
    spill4653_5 = life11_163;
    if (!((life7_5 != null))) {
        forwardValue4653_124_0 = spill4653_5;
        break forward_join_124;
    }
    if (!((spill4653_5 == 0))) {
        break forward_join_125;
    }
    spill4653_6 = p3;
    if (!((life7_5 != null))) {
        forwardValue4653_126_0 = spill4653_6;
        break forward_join_126;
    }
    forwardValue4653_124_0 = ((((net.minecraft.block.Block)(spill4653_6)).l()) ? 1 : 0);
    }
    if (!((forwardValue4653_124_0 != 0))) {
        break forward_join_190;
    }
    }
    forwardValue4653_126_0 = p3;
    }
    if (!((forwardValue4653_126_0 != this))) {
        break forward_join_190;
    }
    spill4653_7 = life11_163;
    spill4653_8 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life10_61)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.T))))))).booleanValue();
    if (!((life7_5 != null))) {
        forwardValue4653_155_0 = spill4653_7;
        forwardValue4653_155_1 = ((spill4653_8) ? 1 : 0);
        break forward_join_155;
    }
    if (!((spill4653_7 != ((spill4653_8) ? 1 : 0)))) {
        break forward_join_190;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_57)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life10_61)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.T)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life11_163))))))))), ((int)(2)));
    spill4653_9 = life11_163;
    if (!((life7_5 != null))) {
        forwardValue4653_165_0 = spill4653_9;
        break forward_join_165;
    }
    forwardValue4653_155_0 = spill4653_9;
    forwardValue4653_155_1 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue4653_155_0 != forwardValue4653_155_1))) {
        break forward_join_190;
    }
    forwardValue4653_165_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life11_163))))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4653_165_0);
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    spill4653_10 = p0;
    spill4653_11 = null;
    spill4653_12 = life11_163;
    if (!((life7_5 != null))) {
        forwardValue4653_181_0 = spill4653_10;
        forwardValue4653_181_1 = spill4653_11;
        forwardValue4653_181_2 = spill4653_12;
        break forward_join_181;
    }
    if (!((spill4653_12 != 0))) {
        forwardValue4653_182_0 = spill4653_10;
        forwardValue4653_182_1 = spill4653_11;
        break forward_join_182;
    }
    forwardValue4653_181_0 = spill4653_10;
    forwardValue4653_181_1 = spill4653_11;
    forwardValue4653_181_2 = __sourceIntrinsic_ae5eabbf4271_invokedynamic4653_49(28682, (3459296008089658893L ^ life5_3));
    }
    forwardValue4653_187_0 = forwardValue4653_181_0;
    forwardValue4653_187_1 = forwardValue4653_181_1;
    forwardValue4653_187_2 = forwardValue4653_181_2;
    break forward_join_187;
    }
    forwardValue4653_187_0 = forwardValue4653_182_0;
    forwardValue4653_187_1 = forwardValue4653_182_1;
    forwardValue4653_187_2 = __sourceIntrinsic_ae5eabbf4271_invokedynamic4653_50(22766, (2936295938387955434L ^ life5_3));
    }
    ((net.minecraft.world.World)(forwardValue4653_187_0)).a(((net.minecraft.entity.player.EntityPlayer)(forwardValue4653_187_1)), ((int)(forwardValue4653_187_2)), ((moom.DT)(p1)), ((int)(0)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, boolean p2) {
net.minecraft.block.state.IBlockState forwardValue4656_17_0;
    moom.DT forwardValue4656_25_0;
    net.minecraft.block.state.IBlockState forwardValue4656_34_0;
    net.minecraft.block.state.IBlockState forwardValue4656_42_0;
    int forwardValue4656_59_0;
    net.minecraft.world.World forwardValue4656_75_0;
    java.lang.Object forwardValue4656_75_1;
    int forwardValue4656_75_2;
    net.minecraft.world.World forwardValue4656_76_0;
    java.lang.Object forwardValue4656_76_1;
    net.minecraft.world.World forwardValue4656_81_0;
    java.lang.Object forwardValue4656_81_1;
    int forwardValue4656_81_2;
    int[] spill4656_0;
    net.minecraft.block.state.IBlockState spill4656_1;
    net.minecraft.block.state.IBlockState spill4656_2;
    boolean spill4656_3;
    net.minecraft.world.World spill4656_4;
    java.lang.Object spill4656_5;
    boolean spill4656_6;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_8;
    int[] life6_9;
    moom.DT life8_33;
    net.minecraft.block.state.IBlockState life9_44;
    forward_join_84: {
    forward_join_81: {
    forward_join_76: {
    forward_join_75: {
    forward_join_59: {
    forward_join_42: {
    forward_join_34: {
    forward_join_31: {
    forward_join_25: {
    forward_join_23: {
    forward_join_17: {
    life4_3 = (net.minecraft.block.BlockDoor.V ^ 127408483485108L);
    spill4656_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life6_9 = spill4656_0;
    spill4656_1 = life7_8;
    if (!((life6_9 != null))) {
        forwardValue4656_17_0 = spill4656_1;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4656_1)).a__ch() == this))) {
        break forward_join_84;
    }
    forwardValue4656_17_0 = life7_8;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue4656_17_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U))) == moom.I.LOWER))) {
        break forward_join_23;
    }
    forwardValue4656_25_0 = p1;
    break forward_join_25;
    }
    forwardValue4656_25_0 = ((moom.DT)(p1)).b__DT();
    }
    life8_33 = forwardValue4656_25_0;
    if (!((p1 == life8_33))) {
        break forward_join_31;
    }
    forwardValue4656_34_0 = life7_8;
    break forward_join_34;
    }
    forwardValue4656_34_0 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_33)));
    }
    life9_44 = forwardValue4656_34_0;
    spill4656_2 = life9_44;
    if (!((life6_9 != null))) {
        forwardValue4656_42_0 = spill4656_2;
        break forward_join_42;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4656_2)).a__ch() == this))) {
        break forward_join_84;
    }
    forwardValue4656_42_0 = life9_44;
    }
    spill4656_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(forwardValue4656_42_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.R))))))).booleanValue();
    if (!((life6_9 != null))) {
        forwardValue4656_59_0 = ((spill4656_3) ? 1 : 0);
        break forward_join_59;
    }
    if (!((spill4656_3 != p2))) {
        break forward_join_84;
    }
    forwardValue4656_59_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life8_33)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life9_44)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(p2)))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4656_59_0);
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life8_33)), ((moom.DT)(p1)));
    spill4656_4 = p0;
    spill4656_5 = null;
    spill4656_6 = p2;
    if (!((life6_9 != null))) {
        forwardValue4656_75_0 = spill4656_4;
        forwardValue4656_75_1 = spill4656_5;
        forwardValue4656_75_2 = ((spill4656_6) ? 1 : 0);
        break forward_join_75;
    }
    if (!(spill4656_6)) {
        forwardValue4656_76_0 = spill4656_4;
        forwardValue4656_76_1 = spill4656_5;
        break forward_join_76;
    }
    forwardValue4656_75_0 = spill4656_4;
    forwardValue4656_75_1 = spill4656_5;
    forwardValue4656_75_2 = __sourceIntrinsic_9a14a620798f_invokedynamic4656_23(11859, (2969015389688738462L ^ life4_3));
    }
    forwardValue4656_81_0 = forwardValue4656_75_0;
    forwardValue4656_81_1 = forwardValue4656_75_1;
    forwardValue4656_81_2 = forwardValue4656_75_2;
    break forward_join_81;
    }
    forwardValue4656_81_0 = forwardValue4656_76_0;
    forwardValue4656_81_1 = forwardValue4656_76_1;
    forwardValue4656_81_2 = __sourceIntrinsic_9a14a620798f_invokedynamic4656_24(11487, (7721470250138644497L ^ life4_3));
    }
    ((net.minecraft.world.World)(forwardValue4656_81_0)).a(((net.minecraft.entity.player.EntityPlayer)(forwardValue4656_81_1)), ((int)(forwardValue4656_81_2)), ((moom.DT)(p1)), ((int)(0)));
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
IBlockState iBlockState2;
        block8: {
            block7: {
                IBlockState iBlockState3;
                IBlockState iBlockState4;
                int[] nArray;
                block5: {
                    block6: {
                        long l = net.minecraft.block.BlockDoor.V ^ 0x69EE7E2EEBB0L;
                        nArray = BlockPlanks$EnumType.b__ArrayInt();
                        iBlockState4 = p0;
                        if (nArray == null) break block5;
                        if (iBlockState4.a(net.minecraft.block.BlockDoor.U) != moom.I.LOWER) break block6;
                        IBlockState iBlockState5 = iBlockState3 = p1.a__fE(p2.a__DT());
                        if (nArray != null && iBlockState5.a__ch() == this) {
                            iBlockState5 = p0 = p0.a__fE(net.minecraft.block.BlockDoor.S, iBlockState3.a(net.minecraft.block.BlockDoor.S)).a__fE(net.minecraft.block.BlockDoor.T, iBlockState3.a(net.minecraft.block.BlockDoor.T));
                        }
                        if (nArray != null) break block7;
                    }
                    iBlockState4 = p1.a__fE(p2.b__DT());
                }
                iBlockState2 = iBlockState3 = iBlockState4;
                if (nArray == null) break block8;
                if (iBlockState2.a__ch() == this) {
                    p0 = p0.a__fE(net.minecraft.block.BlockDoor.Q, iBlockState3.a(net.minecraft.block.BlockDoor.Q)).a__fE(net.minecraft.block.BlockDoor.R, iBlockState3.a(net.minecraft.block.BlockDoor.R));
                }
            }
            iBlockState2 = p0;
        }
        return iBlockState2;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((net.minecraft.block.BlockDoor)(this)).a__Void(((int)(net.minecraft.block.BlockDoor.c(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1))))));
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
net.minecraft.block.state.IBlockState forwardValue4654_25_0;
    net.minecraft.world.World forwardValue4654_30_0;
    moom.DT forwardValue4654_30_1;
    int[] spill4654_0;
    net.minecraft.block.state.IBlockState spill4654_1;
    net.minecraft.world.World spill4654_2;
    moom.DT spill4654_3;
    long life5_3;
    moom.DT life8_7;
    int[] life7_8;
    forward_join_32: {
    forward_join_30: {
    forward_join_25: {
    life5_3 = (net.minecraft.block.BlockDoor.V ^ 115324579600478L);
    spill4654_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_7 = ((moom.DT)(p1)).b__DT();
    life7_8 = spill4654_0;
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d)) {
        break forward_join_32;
    }
    spill4654_1 = p2;
    if (!((life7_8 != null))) {
        forwardValue4654_25_0 = spill4654_1;
        break forward_join_25;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4654_1)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDoor.U))) == moom.I.UPPER))) {
        break forward_join_32;
    }
    spill4654_2 = p0;
    spill4654_3 = life8_7;
    if (!((life7_8 != null))) {
        forwardValue4654_30_0 = spill4654_2;
        forwardValue4654_30_1 = spill4654_3;
        break forward_join_30;
    }
    forwardValue4654_25_0 = ((net.minecraft.world.World)(spill4654_2)).a__fE(((moom.DT)(spill4654_3)));
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue4654_25_0)).a__ch() == this))) {
        break forward_join_32;
    }
    forwardValue4654_30_0 = p0;
    forwardValue4654_30_1 = life8_7;
    }
    ((net.minecraft.world.World)(forwardValue4654_30_0)).d__Boolean(((moom.DT)(forwardValue4654_30_1)));
    }
    return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


private void a__Void(int p0) {
moom.bs forwardValue4658_58_0;
    moom.bs forwardValue4658_58_1;
    moom.bs forwardValue4658_87_0;
    moom.bs forwardValue4658_87_1;
    moom.bs forwardValue4658_116_0;
    moom.bs forwardValue4658_116_1;
    moom.bs forwardValue4658_158_0;
    moom.bs forwardValue4658_158_1;
    moom.bs forwardValue4658_173_0;
    moom.bs forwardValue4658_173_1;
    moom.bs forwardValue4658_190_0;
    moom.bs forwardValue4658_190_1;
    int[] spill4658_0;
    moom.bs spill4658_1;
    moom.bs spill4658_2;
    moom.bs spill4658_3;
    moom.bs spill4658_4;
    long life2_3;
    float life5_6;
    int[] life4_15;
    moom.bs life6_18;
    int life7_21;
    int life8_24;
    forward_join_201: {
    forward_join_190: {
    forward_join_188: {
    forward_join_173: {
    forward_join_171: {
    forward_join_158: {
    forward_join_156: {
    forward_join_141: {
    forward_join_129: {
    forward_join_116: {
    forward_join_114: {
    forward_join_104: {
    forward_join_87: {
    forward_join_85: {
    forward_join_75: {
    forward_join_58: {
    forward_join_56: {
    forward_join_44: {
    life2_3 = (net.minecraft.block.BlockDoor.V ^ 27129652398785L);
    spill4658_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0x1.8p-3f;
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p1f)), ((float)(0x1.0p0f)));
    life4_15 = spill4658_0;
    life6_18 = net.minecraft.block.BlockDoor.a__bs(((int)(p0)));
    life7_21 = ((__sourceExactCall_15b2f78bff3c45(((int)(p0)))) ? 1 : 0);
    life8_24 = ((__sourceExactCall_f6771c3f8841d1(((int)(p0)))) ? 1 : 0);
    if (!((life7_21 != 0))) {
        break forward_join_141;
    }
    spill4658_1 = life6_18;
    spill4658_2 = moom.bs.EAST;
    if (!((life4_15 != null))) {
        forwardValue4658_58_0 = spill4658_1;
        forwardValue4658_58_1 = spill4658_2;
        break forward_join_58;
    }
    if (!((spill4658_1 == spill4658_2))) {
        break forward_join_56;
    }
    if (!((life8_24 == 0))) {
        break forward_join_44;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life5_6)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((0x1.0p0f - life5_6))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    forwardValue4658_58_0 = life6_18;
    forwardValue4658_58_1 = moom.bs.SOUTH;
    }
    if (!((life4_15 != null))) {
        forwardValue4658_87_0 = forwardValue4658_58_0;
        forwardValue4658_87_1 = forwardValue4658_58_1;
        break forward_join_87;
    }
    if (!((forwardValue4658_58_0 == forwardValue4658_58_1))) {
        break forward_join_85;
    }
    if (!((life8_24 == 0))) {
        break forward_join_75;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)((0x1.0p0f - life5_6))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(life5_6)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    forwardValue4658_87_0 = life6_18;
    forwardValue4658_87_1 = moom.bs.WEST;
    }
    if (!((life4_15 != null))) {
        forwardValue4658_116_0 = forwardValue4658_87_0;
        forwardValue4658_116_1 = forwardValue4658_87_1;
        break forward_join_116;
    }
    if (!((forwardValue4658_87_0 == forwardValue4658_87_1))) {
        break forward_join_114;
    }
    if (!((life8_24 == 0))) {
        break forward_join_104;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((0x1.0p0f - life5_6))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life5_6)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    forwardValue4658_116_0 = life6_18;
    forwardValue4658_116_1 = moom.bs.NORTH;
    }
    if (!((forwardValue4658_116_0 == forwardValue4658_116_1))) {
        break forward_join_201;
    }
    if (!((life8_24 == 0))) {
        break forward_join_129;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(life5_6)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)((0x1.0p0f - life5_6))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    spill4658_3 = life6_18;
    spill4658_4 = moom.bs.EAST;
    if (!((life4_15 != null))) {
        forwardValue4658_158_0 = spill4658_3;
        forwardValue4658_158_1 = spill4658_4;
        break forward_join_158;
    }
    if (!((spill4658_3 == spill4658_4))) {
        break forward_join_156;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(life5_6)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    forwardValue4658_158_0 = life6_18;
    forwardValue4658_158_1 = moom.bs.SOUTH;
    }
    if (!((life4_15 != null))) {
        forwardValue4658_173_0 = forwardValue4658_158_0;
        forwardValue4658_173_1 = forwardValue4658_158_1;
        break forward_join_173;
    }
    if (!((forwardValue4658_158_0 == forwardValue4658_158_1))) {
        break forward_join_171;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(life5_6)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    forwardValue4658_173_0 = life6_18;
    forwardValue4658_173_1 = moom.bs.WEST;
    }
    if (!((life4_15 != null))) {
        forwardValue4658_190_0 = forwardValue4658_173_0;
        forwardValue4658_190_1 = forwardValue4658_173_1;
        break forward_join_190;
    }
    if (!((forwardValue4658_173_0 == forwardValue4658_173_1))) {
        break forward_join_188;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)((0x1.0p0f - life5_6))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_15 == null))) {
        break forward_join_201;
    }
    }
    forwardValue4658_190_0 = life6_18;
    forwardValue4658_190_1 = moom.bs.NORTH;
    }
    if (!((forwardValue4658_190_0 == forwardValue4658_190_1))) {
        break forward_join_201;
    }
    ((net.minecraft.block.BlockDoor)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)((0x1.0p0f - life5_6))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1747_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae5eabbf4271_invokedynamic4653_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae5eabbf4271_invokedynamic4653_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ca9d0413800_invokedynamic4655_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ca9d0413800_invokedynamic4655_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9a14a620798f_invokedynamic4656_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9a14a620798f_invokedynamic4656_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1748_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9957_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic4660_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_194cfabefc03_invokedynamic4661_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5eaa787bfb8_invokedynamic4662_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic4663_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63673aced462_invokedynamic4664_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbf18562f888_invokedynamic4665_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbf18562f888_invokedynamic4665_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbf18562f888_invokedynamic4665_18(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native int __sourceExactCall_ea1a987036ae8c(int p0, long p1);
private static native boolean __sourceExactCall_15b2f78bff3c45(int p0);
private static native int __sourceExactCall_c965fac3cb006c(int p0);
private static native boolean __sourceExactCall_f6771c3f8841d1(int p0);
}
