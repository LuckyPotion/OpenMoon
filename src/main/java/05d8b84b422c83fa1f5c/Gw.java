package moom;


public class Gw extends moom.FY {

private static final long c;

private static final long d;

public Gw() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(478371067019909841L)), ((long)(-6791968862078477807L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274040132115842L)))));
    long local0_life6 = (moom.Gw.c ^ 48085227948267L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill565_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill565_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill565_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill565_13 = new byte[8];
    (__sourceSpill565_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill565_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation565_15 = __sourceSpill565_13;
    ((javax.crypto.Cipher)(__sourceSpill565_10)).init(((int)(__sourceSpill565_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill565_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation565_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7966238746366807959L;
    byte[] __sourceSpill565_19 = new byte[8];
    (__sourceSpill565_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill565_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill565_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill565_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill565_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill565_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill565_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill565_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill565_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill565_20)).doFinal(((byte[])(__sourceSpill565_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue663_9_0;
    moom.fn forestValue663_58_0;
    moom.fn forestValue663_58_1;
    moom.fn forestValue663_68_0;
    moom.fn forestValue663_68_1;
    moom.fn forestValue663_78_0;
    moom.fn forestValue663_78_1;
    int forestValue663_111_0;
    int forestValue663_119_0;
    int[] spill663_0;
    boolean spill663_1;
    moom.fn spill663_2;
    moom.fn spill663_3;
    boolean spill663_4;
    long life4_3;
    int life7_6;
    int[] life6_7;
    moom.DT life8_29;
    moom.DT life9_42;
    int life10_96;
    int life11_98;
    forest_join_119: {
    forest_join_118: {
    life4_3 = (moom.Gw.c ^ 59966862310325L);
    spill663_0 = moom.FY.b();
    life7_6 = 0;
    life6_7 = spill663_0;
    forest_cycle_8: while (true) {
    forest_join_116: {
    forest_join_115: {
    forestValue663_9_0 = life7_6;
    forest_cycle_9: while (true) {
    forest_join_79: {
    forest_join_78: {
    forest_join_68: {
    forest_join_58: {
    if (!((forestValue663_9_0 < ((int) moom.Gw.d)))) {
        break forest_join_118;
    }
    life8_29 = ((moom.DT)(p2)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))), ((int)(0)), ((int)((((java.util.Random)(p1)).nextInt(((int)(4))) - ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    if (!((life6_7 != null))) {
        break forest_join_116;
    }
    spill663_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life8_29)));
    if (!((life6_7 != null))) {
        forestValue663_119_0 = ((spill663_1) ? 1 : 0);
        break forest_join_119;
    }
    if (!(spill663_1)) {
        break forest_join_115;
    }
    life9_42 = ((moom.DT)(life8_29)).b__DT();
    spill663_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life9_42)).e()))))).a__ch())).a__fn();
    spill663_3 = moom.fn.h;
    if (!((life6_7 != null))) {
        forestValue663_58_0 = spill663_2;
        forestValue663_58_1 = spill663_3;
        break forest_join_58;
    }
    if (!((spill663_2 != spill663_3))) {
        break forest_join_79;
    }
    forestValue663_58_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life9_42)).f()))))).a__ch())).a__fn();
    forestValue663_58_1 = moom.fn.h;
    }
    if (!((life6_7 != null))) {
        forestValue663_68_0 = forestValue663_58_0;
        forestValue663_68_1 = forestValue663_58_1;
        break forest_join_68;
    }
    if (!((forestValue663_58_0 != forestValue663_58_1))) {
        break forest_join_79;
    }
    forestValue663_68_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life9_42)).c__DT()))))).a__ch())).a__fn();
    forestValue663_68_1 = moom.fn.h;
    }
    if (!((life6_7 != null))) {
        forestValue663_78_0 = forestValue663_68_0;
        forestValue663_78_1 = forestValue663_68_1;
        break forest_join_78;
    }
    if (!((forestValue663_68_0 != forestValue663_68_1))) {
        break forest_join_79;
    }
    forestValue663_78_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life9_42)).d__DT()))))).a__ch())).a__fn();
    forestValue663_78_1 = moom.fn.h;
    }
    if (!((forestValue663_78_0 == forestValue663_78_1))) {
        break forest_join_115;
    }
    }
    life10_96 = (2 + ((java.util.Random)(p1)).nextInt(((int)((((java.util.Random)(p1)).nextInt(((int)(3))) + 1)))));
    life11_98 = 0;
    forest_cycle_91: while (true) {
    forest_join_112: {
    forest_join_111: {
    if (!((life11_98 < life10_96))) {
        break forest_join_115;
    }
    spill663_4 = ((moom.d_)(net.minecraft.init.Blocks.aM)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(life8_29)));
    if (!((life6_7 != null))) {
        forestValue663_9_0 = ((spill663_4) ? 1 : 0);
        continue forest_cycle_9;
    }
    if (!((life6_7 != null))) {
        forestValue663_111_0 = ((spill663_4) ? 1 : 0);
        break forest_join_111;
    }
    if (!(spill663_4)) {
        break forest_join_112;
    }
    forestValue663_111_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(life8_29)).a(((int)(life11_98))))), ((net.minecraft.block.state.IBlockState)(((moom.d_)(net.minecraft.init.Blocks.aM)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue663_111_0);
    }
    life11_98 += 1;
    if (!((life6_7 == null))) {
        continue forest_cycle_91;
    }
    break forest_cycle_91;
    }
    break forest_cycle_9;
    }
    }
    life7_6 += 1;
    }
    if (!((life6_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    forestValue663_119_0 = 1;
    }
    return ((forestValue663_119_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
