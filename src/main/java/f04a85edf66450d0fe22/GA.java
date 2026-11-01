package moom;


public class GA extends moom.FY {

private static final long c;

private static final long d;

public GA() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3650765303616120541L)), ((long)(3047883627381799588L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134555535743257L)))));
    long local0_life6 = (moom.GA.c ^ 52852133955369L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill546_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill546_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill546_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill546_13 = new byte[8];
    (__sourceSpill546_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill546_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation546_15 = __sourceSpill546_13;
    ((javax.crypto.Cipher)(__sourceSpill546_10)).init(((int)(__sourceSpill546_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill546_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation546_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7158740071449343979L;
    byte[] __sourceSpill546_19 = new byte[8];
    (__sourceSpill546_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill546_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill546_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill546_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill546_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill546_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill546_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill546_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill546_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill546_20)).doFinal(((byte[])(__sourceSpill546_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue638_8_0;
    net.minecraft.block.state.IBlockState forestValue638_50_0;
    moom.fv forestValue638_50_1;
    net.minecraft.block.state.IBlockState forestValue638_51_0;
    moom.fv forestValue638_51_1;
    int forestValue638_51_2;
    net.minecraft.block.state.IBlockState forestValue638_59_0;
    moom.fv forestValue638_59_1;
    net.minecraft.block.state.IBlockState forestValue638_60_0;
    moom.fv forestValue638_60_1;
    int forestValue638_60_2;
    net.minecraft.block.state.IBlockState forestValue638_68_0;
    moom.fv forestValue638_68_1;
    net.minecraft.block.state.IBlockState forestValue638_69_0;
    moom.fv forestValue638_69_1;
    int forestValue638_69_2;
    net.minecraft.block.state.IBlockState forestValue638_77_0;
    moom.fv forestValue638_77_1;
    net.minecraft.block.state.IBlockState forestValue638_78_0;
    moom.fv forestValue638_78_1;
    int forestValue638_78_2;
    int forestValue638_118_0;
    boolean spill638_0;
    boolean spill638_1;
    net.minecraft.block.state.IBlockState spill638_2;
    moom.fv spill638_3;
    net.minecraft.block.state.IBlockState spill638_4;
    moom.fv spill638_5;
    net.minecraft.block.state.IBlockState spill638_6;
    moom.fv spill638_7;
    net.minecraft.block.state.IBlockState spill638_8;
    moom.fv spill638_9;
    long life4_3;
    int[] life6_5;
    moom.bs[] life7_20;
    int life8_23;
    int life9_25;
    moom.bs life10_32;
    net.minecraft.block.state.IBlockState life11_83;
    forest_join_118: {
    forest_join_117: {
    life4_3 = (moom.GA.c ^ 130669767041251L);
    life6_5 = moom.FY.b();
    forest_cycle_6: while (true) {
    forest_join_112: {
    forest_join_94: {
    forest_join_92: {
    forestValue638_8_0 = ((moom.DT)(p2)).b();
    forest_cycle_8: while (true) {
    if (!((forestValue638_8_0 < ((int) moom.GA.d)))) {
        break forest_join_117;
    }
    spill638_0 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p2)));
    if (!((life6_5 != null))) {
        forestValue638_118_0 = ((spill638_0) ? 1 : 0);
        break forest_join_118;
    }
    if (!(spill638_0)) {
        break forest_join_94;
    }
    life7_20 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a();
    life8_23 = (life7_20).length;
    life9_25 = 0;
    forest_cycle_25: while (true) {
    forest_join_90: {
    forest_join_89: {
    forest_join_78: {
    forest_join_77: {
    forest_join_69: {
    forest_join_68: {
    forest_join_60: {
    forest_join_59: {
    forest_join_51: {
    forest_join_50: {
    if (!((life9_25 < life8_23))) {
        break forest_join_92;
    }
    life10_32 = (life7_20)[life9_25];
    if (!((life6_5 != null))) {
        break forest_join_90;
    }
    spill638_1 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((moom.bs)(life10_32)));
    if (!((life6_5 != null))) {
        forestValue638_8_0 = ((spill638_1) ? 1 : 0);
        continue forest_cycle_8;
    }
    if (!(spill638_1)) {
        break forest_join_89;
    }
    spill638_2 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).a__fE();
    spill638_3 = moom.eF.R;
    if (!((life10_32 == moom.bs.NORTH))) {
        forestValue638_50_0 = spill638_2;
        forestValue638_50_1 = spill638_3;
        break forest_join_50;
    }
    forestValue638_51_0 = spill638_2;
    forestValue638_51_1 = spill638_3;
    forestValue638_51_2 = 1;
    break forest_join_51;
    }
    forestValue638_51_0 = forestValue638_50_0;
    forestValue638_51_1 = forestValue638_50_1;
    forestValue638_51_2 = 0;
    }
    spill638_4 = ((net.minecraft.block.state.IBlockState)(forestValue638_51_0)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue638_51_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue638_51_2)))))));
    spill638_5 = moom.eF.S;
    if (!((life10_32 == moom.bs.EAST))) {
        forestValue638_59_0 = spill638_4;
        forestValue638_59_1 = spill638_5;
        break forest_join_59;
    }
    forestValue638_60_0 = spill638_4;
    forestValue638_60_1 = spill638_5;
    forestValue638_60_2 = 1;
    break forest_join_60;
    }
    forestValue638_60_0 = forestValue638_59_0;
    forestValue638_60_1 = forestValue638_59_1;
    forestValue638_60_2 = 0;
    }
    spill638_6 = ((net.minecraft.block.state.IBlockState)(forestValue638_60_0)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue638_60_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue638_60_2)))))));
    spill638_7 = moom.eF.T;
    if (!((life10_32 == moom.bs.SOUTH))) {
        forestValue638_68_0 = spill638_6;
        forestValue638_68_1 = spill638_7;
        break forest_join_68;
    }
    forestValue638_69_0 = spill638_6;
    forestValue638_69_1 = spill638_7;
    forestValue638_69_2 = 1;
    break forest_join_69;
    }
    forestValue638_69_0 = forestValue638_68_0;
    forestValue638_69_1 = forestValue638_68_1;
    forestValue638_69_2 = 0;
    }
    spill638_8 = ((net.minecraft.block.state.IBlockState)(forestValue638_69_0)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue638_69_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue638_69_2)))))));
    spill638_9 = moom.eF.U;
    if (!((life10_32 == moom.bs.WEST))) {
        forestValue638_77_0 = spill638_8;
        forestValue638_77_1 = spill638_9;
        break forest_join_77;
    }
    forestValue638_78_0 = spill638_8;
    forestValue638_78_1 = spill638_9;
    forestValue638_78_2 = 1;
    break forest_join_78;
    }
    forestValue638_78_0 = forestValue638_77_0;
    forestValue638_78_1 = forestValue638_77_1;
    forestValue638_78_2 = 0;
    }
    life11_83 = ((net.minecraft.block.state.IBlockState)(forestValue638_78_0)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue638_78_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue638_78_2)))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(life11_83)), ((int)(2)));
    if (!((life6_5 == null))) {
        break forest_join_92;
    }
    }
    life9_25 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    break forest_cycle_8;
    }
    }
    if (!((life6_5 == null))) {
        break forest_join_112;
    }
    }
    p2 = ((moom.DT)(p2)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)(0)), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    }
    p2 = ((moom.DT)(p2)).a__DT();
    if (!((life6_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    forestValue638_118_0 = 1;
    }
    return ((forestValue638_118_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
