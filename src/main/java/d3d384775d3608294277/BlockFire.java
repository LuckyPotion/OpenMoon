package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


















import moom.DT;











import net.minecraft.block.BlockPlanks$EnumType;










import net.minecraft.block.Block;







import net.minecraft.world.World;





import net.minecraft.world.World;

import net.minecraft.block.state.IBlockState;
import java.util.Map;
import net.minecraft.block.BlockPlanks$EnumType;
public class BlockFire extends net.minecraft.block.Block {

public static final moom.fy Q;

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

public static final moom.fv U;

public static final moom.fv V;

public static final moom.fv W;

public static final moom.fy X;

private final java.util.Map<net.minecraft.block.Block, java.lang.Integer> Y;

private final java.util.Map<net.minecraft.block.Block, java.lang.Integer> Z;

private static final long bb;

private static final long[] fb;

private static final java.lang.Integer[] gb;

private static final java.util.Map hb;

protected BlockFire() {
super(moom.fn.o);
    this.Y = com.google.common.collect.Maps.newIdentityHashMap();
    this.Z = com.google.common.collect.Maps.newIdentityHashMap();
    (this).a__Void((((((((((this.M).a__fE()).a__fE(net.minecraft.block.BlockFire.Q, java.lang.Integer.valueOf(0))).a__fE(net.minecraft.block.BlockFire.R, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockFire.S, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockFire.T, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockFire.U, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockFire.V, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockFire.W, java.lang.Boolean.FALSE)).a__fE(net.minecraft.block.BlockFire.X, java.lang.Integer.valueOf(0)));
    (this).a(true);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-6520939655718621389L)), ((long)(-7524409383024005704L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(154956000529087L)))));
    long local11_life6 = (net.minecraft.block.BlockFire.bb ^ 82386166393699L);
    hb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1745_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1745_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1745_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1745_14 = new byte[8];
    (__sourceSpill1745_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1745_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1745_16 = __sourceSpill1745_14;
    ((javax.crypto.Cipher)(__sourceSpill1745_11)).init(((int)(__sourceSpill1745_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1745_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1745_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[23];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "YÔ·wåJÝ#õåÆ×ÅþÛÏw¶Ô«kùQËQ\036\001Ú ¥£VèºLÛbÐµ-øØk¸4ÓÀªhÅÛTÜ|'ò%Ð¥0ØDÁ\002LÌy\033¨àÂKA7G9b¡Wß\034½\0207\037óÒ\004x@Ïâï¹vÖÛ\001¡Ýæý¢X°R\000ÝþÄ\n\177JÙaGR¡å\"N»!ögÇÇõ×ao\013BLø3ñ\032"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1745_25 = local4_life21;
        int __sourceSpill1745_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1745_25)).substring(((int)(__sourceSpill1745_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1745_30 = local6_life19;
        int __sourceSpill1745_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1745_33 = new byte[8];
        (__sourceSpill1745_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1745_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1745_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1745_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1745_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1745_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1745_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1745_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1745_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1745_34)).doFinal(((byte[])(__sourceSpill1745_33)));
        (__sourceSpill1745_30)[__sourceSpill1745_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "\034Ý\035§êéL-nwQµ\177"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1745_38 = local4_life21;
        int __sourceSpill1745_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1745_38)).substring(((int)(__sourceSpill1745_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1745_43 = local6_life19;
        int __sourceSpill1745_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1745_46 = new byte[8];
        (__sourceSpill1745_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1745_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1745_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1745_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1745_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1745_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1745_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1745_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1745_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1745_47)).doFinal(((byte[])(__sourceSpill1745_46)));
        (__sourceSpill1745_43)[__sourceSpill1745_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    fb = ((long[])(local6_life19));
    gb = ((java.lang.Integer[])(new java.lang.Integer[23]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("age")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1745_52(7878, (48226563097099194L ^ local11_life6)))))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("flip")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("alt")))));
    T = ((moom.fv)(moom.fv.a(((java.lang.String)("north")))));
    U = ((moom.fv)(moom.fv.a(((java.lang.String)("east")))));
    V = ((moom.fv)(moom.fv.a(((java.lang.String)("south")))));
    W = ((moom.fv)(moom.fv.a(((java.lang.String)("west")))));
    X = ((moom.fy)(moom.fy.a(((java.lang.String)("upper")), ((int)(0)), ((int)(2)))));
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int forwardValue4672_25_0;
    int forwardValue4672_36_0;
    net.minecraft.world.World forwardValue4672_41_0;
    moom.DT forwardValue4672_41_1;
    int spill4672_0;
    boolean spill4672_1;
    net.minecraft.world.World spill4672_2;
    moom.DT spill4672_3;
    boolean spill4672_4;
    long life4_3;
    int[] life6_5;
    forward_join_55: {
    forward_join_41: {
    forward_join_39: {
    forward_join_36: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (net.minecraft.block.BlockFire.bb ^ 98437233598543L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4672_0 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).b();
    if (!((life6_5 != null))) {
        forwardValue4672_25_0 = spill4672_0;
        break forward_join_25;
    }
    if (!((spill4672_0 <= 0))) {
        break forward_join_19;
    }
    spill4672_1 = ((moom.cr)(net.minecraft.init.Blocks.aY)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue4672_25_0 = ((spill4672_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill4672_1))) {
        break forward_join_55;
    }
    }
    spill4672_2 = p0;
    spill4672_3 = ((moom.DT)(p1)).b__DT();
    if (!((life6_5 != null))) {
        forwardValue4672_41_0 = spill4672_2;
        forwardValue4672_41_1 = spill4672_3;
        break forward_join_41;
    }
    forwardValue4672_25_0 = ((net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(spill4672_2)), ((moom.DT)(spill4672_3)))) ? 1 : 0);
    }
    if (!((forwardValue4672_25_0 == 0))) {
        break forward_join_39;
    }
    spill4672_4 = ((net.minecraft.block.BlockFire)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life6_5 != null))) {
        forwardValue4672_36_0 = ((spill4672_4) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill4672_4))) {
        break forward_join_39;
    }
    forwardValue4672_36_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4672_36_0);
    if (!((life6_5 == null))) {
        break forward_join_55;
    }
    }
    forwardValue4672_41_0 = p0;
    forwardValue4672_41_1 = p1;
    }
    ((net.minecraft.world.World)(forwardValue4672_41_0)).a(((moom.DT)(forwardValue4672_41_1)), ((net.minecraft.block.Block)(this)), ((int)((((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0))) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_af6763de0cbb_invokedynamic4672_17(20667, (9220015930114801403L ^ life4_3)))))))));
    }
    return;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forestValue531_19_0;
    net.minecraft.block.Block forestValue531_29_0;
    int forestValue531_36_0;
    int forestValue531_49_0;
    int forestValue531_75_0;
    int forestValue531_119_0;
    int forestValue531_144_0;
    int forestValue531_151_0;
    int forestValue531_177_0;
    int forestValue531_275_0;
    int forestValue531_277_0;
    int forestValue531_282_0;
    int forestValue531_310_0;
    int forestValue531_326_0;
    int forestValue531_326_1;
    int forestValue531_378_0;
    int forestValue531_384_0;
    int forestValue531_390_0;
    int forestValue531_407_0;
    int forestValue531_432_0;
    boolean spill531_0;
    net.minecraft.block.BlockFire spill531_1;
    int spill531_2;
    boolean spill531_3;
    boolean spill531_4;
    int spill531_5;
    boolean spill531_6;
    boolean spill531_7;
    int spill531_8;
    int spill531_9;
    int spill531_10;
    int spill531_11;
    int spill531_12;
    int spill531_13;
    int spill531_14;
    int spill531_15;
    int spill531_16;
    int spill531_17;
    int spill531_18;
    boolean spill531_19;
    int spill531_20;
    long life5_3;
    int[] life7_5;
    net.minecraft.block.Block life8_33;
    int life9_40;
    int life10_88;
    int life11_204;
    int life12_206;
    int life13_303;
    int life14_308;
    int life15_315;
    int life16_343;
    moom.DT life17_368;
    int life18_373;
    int life19_404;
    int life20_452;
    forest_join_442: {
    forest_join_275: {
    forest_join_190: {
    forest_join_177: {
    forest_join_174: {
    forest_join_151: {
    forest_join_146: {
    forest_join_145: {
    forest_join_144: {
    forest_join_141: {
    forest_join_119: {
    forest_join_103: {
    forest_join_75: {
    forest_join_70: {
    forest_join_49: {
    forest_join_48: {
    forest_join_36: {
    forest_join_35: {
    forest_join_29: {
    forest_join_24: {
    forest_join_19: {
    life5_3 = (net.minecraft.block.BlockFire.bb ^ 94099556188046L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill531_0 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(p0)).a__Ej())).a__Boolean(((java.lang.String)("doFireTick")));
    if (!((life7_5 != null))) {
        forestValue531_19_0 = ((spill531_0) ? 1 : 0);
        break forest_join_19;
    }
    if (!(spill531_0)) {
        break forest_join_442;
    }
    spill531_1 = this;
    if (!((life7_5 != null))) {
        forestValue531_29_0 = spill531_1;
        break forest_join_29;
    }
    forestValue531_19_0 = ((((net.minecraft.block.BlockFire)(spill531_1)).b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((forestValue531_19_0 == 0))) {
        break forest_join_24;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    }
    forestValue531_29_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch();
    }
    life8_33 = forestValue531_29_0;
    if (!((life8_33 == net.minecraft.init.Blocks.aV))) {
        break forest_join_35;
    }
    forestValue531_36_0 = 1;
    break forest_join_36;
    }
    forestValue531_36_0 = 0;
    }
    life9_40 = forestValue531_36_0;
    spill531_2 = ((((net.minecraft.world.World)(p0)).v instanceof moom.EB) ? 1 : 0);
    if (!((life7_5 != null))) {
        forestValue531_49_0 = spill531_2;
        break forest_join_49;
    }
    if (!((spill531_2 != 0))) {
        break forest_join_48;
    }
    if (!((life8_33 == net.minecraft.init.Blocks.h))) {
        break forest_join_48;
    }
    life9_40 = 1;
    }
    forestValue531_49_0 = life9_40;
    }
    if (!((life7_5 != null))) {
        forestValue531_75_0 = forestValue531_49_0;
        break forest_join_75;
    }
    if (!((forestValue531_49_0 == 0))) {
        break forest_join_70;
    }
    spill531_3 = ((net.minecraft.world.World)(p0)).g__Boolean();
    if (!((life7_5 != null))) {
        forestValue531_75_0 = ((spill531_3) ? 1 : 0);
        break forest_join_75;
    }
    if (!(spill531_3)) {
        break forest_join_70;
    }
    spill531_4 = ((net.minecraft.block.BlockFire)(this)).c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forestValue531_75_0 = ((spill531_4) ? 1 : 0);
        break forest_join_75;
    }
    if (!(spill531_4)) {
        break forest_join_70;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    if (!((life7_5 == null))) {
        break forest_join_442;
    }
    }
    forestValue531_75_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.Q))))))).intValue();
    }
    life10_88 = forestValue531_75_0;
    spill531_5 = life10_88;
    if (!((life7_5 != null))) {
        forestValue531_119_0 = spill531_5;
        break forest_join_119;
    }
    if (!((spill531_5 < __sourceIntrinsic_b4b54c999db9_invokedynamic531_24(8429, (5502510585193779562L ^ life5_3))))) {
        break forest_join_103;
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life10_88 + (((java.util.Random)(p3)).nextInt(((int)(3))) / 2))))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)));
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)((((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0))) + ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic531_31(17548, (957561364797568266L ^ life5_3)))))))));
    forestValue531_119_0 = life9_40;
    }
    if (!((life7_5 != null))) {
        forestValue531_177_0 = forestValue531_119_0;
        break forest_join_177;
    }
    if (!((forestValue531_119_0 == 0))) {
        break forest_join_174;
    }
    spill531_6 = ((net.minecraft.block.BlockFire)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forestValue531_151_0 = ((spill531_6) ? 1 : 0);
        break forest_join_151;
    }
    if (!((!spill531_6))) {
        break forest_join_146;
    }
    spill531_7 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life7_5 != null))) {
        forestValue531_144_0 = ((spill531_7) ? 1 : 0);
        break forest_join_144;
    }
    if (!(spill531_7)) {
        break forest_join_141;
    }
    spill531_8 = life10_88;
    if (!((life7_5 != null))) {
        forestValue531_144_0 = spill531_8;
        break forest_join_144;
    }
    if (!((spill531_8 > 3))) {
        break forest_join_145;
    }
    }
    forestValue531_144_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue531_144_0);
    }
    return;
    }
    forestValue531_151_0 = ((((net.minecraft.block.BlockFire)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue531_177_0 = forestValue531_151_0;
        break forest_join_177;
    }
    if (!((forestValue531_151_0 == 0))) {
        break forest_join_174;
    }
    spill531_9 = life10_88;
    if (!((life7_5 != null))) {
        forestValue531_177_0 = spill531_9;
        break forest_join_177;
    }
    if (!((spill531_9 == __sourceIntrinsic_b4b54c999db9_invokedynamic531_45(7878, (48214370833133399L ^ life5_3))))) {
        break forest_join_174;
    }
    spill531_10 = ((java.util.Random)(p3)).nextInt(((int)(4)));
    if (!((life7_5 != null))) {
        forestValue531_177_0 = spill531_10;
        break forest_join_177;
    }
    if (!((spill531_10 == 0))) {
        break forest_join_174;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    return;
    }
    forestValue531_177_0 = ((((net.minecraft.world.World)(p0)).n(((moom.DT)(p1)))) ? 1 : 0);
    }
    life11_204 = forestValue531_177_0;
    life12_206 = 0;
    spill531_11 = life11_204;
    if (!((life7_5 != null))) {
        forestValue531_275_0 = spill531_11;
        break forest_join_275;
    }
    if (!((spill531_11 != 0))) {
        break forest_join_190;
    }
    life12_206 = __sourceIntrinsic_b4b54c999db9_invokedynamic531_50(8590, (2883906121948024851L ^ life5_3));
    }
    ((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).f())), ((int)((__sourceIntrinsic_b4b54c999db9_invokedynamic531_52(16954, (2200097100253934504L ^ life5_3)) + life12_206))), ((java.util.Random)(p3)), ((int)(life10_88)));
    ((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).e())), ((int)((__sourceIntrinsic_b4b54c999db9_invokedynamic531_55(1047, (9129872327539750287L ^ life5_3)) + life12_206))), ((java.util.Random)(p3)), ((int)(life10_88)));
    ((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())), ((int)((__sourceIntrinsic_b4b54c999db9_invokedynamic531_58(14118, (5070123136346310325L ^ life5_3)) + life12_206))), ((java.util.Random)(p3)), ((int)(life10_88)));
    ((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a__DT())), ((int)((__sourceIntrinsic_b4b54c999db9_invokedynamic531_61(23011, (3309980018867415142L ^ life5_3)) + life12_206))), ((java.util.Random)(p3)), ((int)(life10_88)));
    ((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())), ((int)((__sourceIntrinsic_b4b54c999db9_invokedynamic531_64(1047, (9129872327539750287L ^ life5_3)) + life12_206))), ((java.util.Random)(p3)), ((int)(life10_88)));
    ((net.minecraft.block.BlockFire)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())), ((int)((__sourceIntrinsic_b4b54c999db9_invokedynamic531_67(1047, (9129872327539750287L ^ life5_3)) + life12_206))), ((java.util.Random)(p3)), ((int)(life10_88)));
    forestValue531_275_0 = -1;
    }
    life13_303 = forestValue531_275_0;
    forest_cycle_276: while (true) {
    forest_join_439: {
    forestValue531_277_0 = life13_303;
    forest_cycle_277: while (true) {
    if (!((forestValue531_277_0 <= 1))) {
        break forest_join_442;
    }
    life14_308 = -1;
    forest_cycle_281: while (true) {
    forest_join_436: {
    forestValue531_282_0 = life14_308;
    forest_cycle_282: while (true) {
    if (!((forestValue531_282_0 <= 1))) {
        break forest_join_439;
    }
    spill531_12 = -1;
    if (!((life7_5 != null))) {
        forestValue531_277_0 = spill531_12;
        continue forest_cycle_277;
    }
    life15_315 = spill531_12;
    forest_cycle_288: while (true) {
    forest_join_434: {
    forest_join_433: {
    forest_join_432: {
    forest_join_423: {
    forest_join_407: {
    forest_join_400: {
    forest_join_390: {
    forest_join_384: {
    forest_join_378: {
    forest_join_377: {
    forest_join_328: {
    forest_join_326: {
    forest_join_310: {
    forest_join_305: {
    if (!((life15_315 <= 4))) {
        break forest_join_436;
    }
    spill531_13 = life13_303;
    if (!((life7_5 != null))) {
        forestValue531_282_0 = spill531_13;
        continue forest_cycle_282;
    }
    if (!((life7_5 != null))) {
        forestValue531_310_0 = spill531_13;
        break forest_join_310;
    }
    if (!((spill531_13 == 0))) {
        break forest_join_305;
    }
    spill531_14 = life15_315;
    if (!((life7_5 != null))) {
        forestValue531_310_0 = spill531_14;
        break forest_join_310;
    }
    if (!((spill531_14 == 0))) {
        break forest_join_305;
    }
    spill531_15 = life14_308;
    if (!((life7_5 != null))) {
        forestValue531_310_0 = spill531_15;
        break forest_join_310;
    }
    if (!((spill531_15 != 0))) {
        break forest_join_433;
    }
    }
    forestValue531_310_0 = __sourceIntrinsic_b4b54c999db9_invokedynamic531_69(18433, (8807707653034391957L ^ life5_3));
    }
    life16_343 = forestValue531_310_0;
    spill531_16 = life15_315;
    spill531_17 = 1;
    if (!((life7_5 != null))) {
        forestValue531_326_0 = spill531_16;
        forestValue531_326_1 = spill531_17;
        break forest_join_326;
    }
    if (!((spill531_16 > spill531_17))) {
        break forest_join_328;
    }
    forestValue531_326_0 = life16_343;
    forestValue531_326_1 = ((life15_315 - 1) * __sourceIntrinsic_b4b54c999db9_invokedynamic531_70(22383, (3937107255884228339L ^ life5_3)));
    }
    life16_343 = (forestValue531_326_0 + forestValue531_326_1);
    }
    life17_368 = ((moom.DT)(p1)).a(((int)(life13_303)), ((int)(life15_315)), ((int)(life14_308)));
    life18_373 = ((net.minecraft.block.BlockFire)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(life17_368)));
    if (!((life7_5 != null))) {
        break forest_join_434;
    }
    if (!((life18_373 > 0))) {
        break forest_join_433;
    }
    life19_404 = (((life18_373 + __sourceIntrinsic_b4b54c999db9_invokedynamic531_73(13133, (4245060366411285210L ^ life5_3))) + (((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.World)(p0)).a__bB())).a() * __sourceIntrinsic_b4b54c999db9_invokedynamic531_76(29725, (8596643823319188877L ^ life5_3)))) / (life10_88 + __sourceIntrinsic_b4b54c999db9_invokedynamic531_77(12314, (7400660882385191326L ^ life5_3))));
    spill531_18 = life11_204;
    if (!((life7_5 != null))) {
        forestValue531_378_0 = spill531_18;
        break forest_join_378;
    }
    if (!((spill531_18 != 0))) {
        break forest_join_377;
    }
    life19_404 = (life19_404 / 2);
    }
    forestValue531_378_0 = life19_404;
    }
    if (!((life7_5 != null))) {
        forestValue531_384_0 = forestValue531_378_0;
        break forest_join_384;
    }
    if (!((forestValue531_378_0 > 0))) {
        break forest_join_433;
    }
    forestValue531_384_0 = ((java.util.Random)(p3)).nextInt(((int)(life16_343)));
    }
    if (!((life7_5 != null))) {
        forestValue531_390_0 = forestValue531_384_0;
        break forest_join_390;
    }
    if (!((forestValue531_384_0 <= life19_404))) {
        break forest_join_433;
    }
    forestValue531_390_0 = ((((net.minecraft.world.World)(p0)).g__Boolean()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue531_407_0 = forestValue531_390_0;
        break forest_join_407;
    }
    if (!((forestValue531_390_0 != 0))) {
        break forest_join_400;
    }
    spill531_19 = ((net.minecraft.block.BlockFire)(this)).c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life17_368)));
    if (!((life7_5 != null))) {
        forestValue531_407_0 = ((spill531_19) ? 1 : 0);
        break forest_join_407;
    }
    if (!((!spill531_19))) {
        break forest_join_433;
    }
    }
    forestValue531_407_0 = (life10_88 + (((java.util.Random)(p3)).nextInt(((int)(5))) / 4));
    }
    life20_452 = forestValue531_407_0;
    spill531_20 = life20_452;
    if (!((life7_5 != null))) {
        forestValue531_432_0 = spill531_20;
        break forest_join_432;
    }
    if (!((spill531_20 > __sourceIntrinsic_b4b54c999db9_invokedynamic531_84(7878, (48214370833133399L ^ life5_3))))) {
        break forest_join_423;
    }
    life20_452 = __sourceIntrinsic_b4b54c999db9_invokedynamic531_85(7878, (48214370833133399L ^ life5_3));
    }
    forestValue531_432_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life17_368)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life20_452)))))))), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue531_432_0);
    }
    life15_315 += 1;
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_288;
    }
    break forest_cycle_288;
    }
    break forest_cycle_282;
    }
    }
    life14_308 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_281;
    }
    break forest_cycle_281;
    }
    break forest_cycle_277;
    }
    }
    life13_303 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_276;
    }
    break forest_cycle_276;
    }
    }
    return;
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
long l = net.minecraft.block.BlockFire.bb ^ 0x7688FCBD447BL;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = World.a(p0, p1.b__DT());
        if (nArray == null) return bl;
        if (bl) return true;
        bl = this.d(p0, p1);
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
}


public boolean b__sourceReturn_b38f36a0de(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue4670_16_0;
    int forwardValue4670_18_0;
    int spill4670_0;
    long life3_3;
    int[] life5_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (net.minecraft.block.BlockFire.bb ^ 75568919461326L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4670_0 = ((net.minecraft.block.BlockFire)(this)).c(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a__ch())));
    if (!((life5_5 != null))) {
        forwardValue4670_16_0 = spill4670_0;
        break forward_join_16;
    }
    if (!((spill4670_0 > 0))) {
        break forward_join_17;
    }
    forwardValue4670_16_0 = 1;
    }
    forwardValue4670_18_0 = forwardValue4670_16_0;
    break forward_join_18;
    }
    forwardValue4670_18_0 = 0;
    }
    return ((forwardValue4670_18_0) != 0);
}


private int b(net.minecraft.block.Block p0) {
java.lang.Integer forwardValue4669_19_0;
    int forwardValue4669_20_0;
    int[] spill4669_0;
    java.lang.Integer spill4669_1;
    long life2_3;
    java.lang.Integer life5_10;
    int[] life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.block.BlockFire.bb ^ 33957058018312L);
    spill4669_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_10 = ((java.lang.Integer)(((java.util.Map)(this.Z)).get(((java.lang.Object)(p0)))));
    life4_11 = spill4669_0;
    spill4669_1 = life5_10;
    if (!((life4_11 != null))) {
        forwardValue4669_19_0 = spill4669_1;
        break forward_join_19;
    }
    if (!((spill4669_1 == null))) {
        break forward_join_18;
    }
    forwardValue4669_20_0 = 0;
    break forward_join_20;
    }
    forwardValue4669_19_0 = life5_10;
    }
    forwardValue4669_20_0 = ((java.lang.Integer)(forwardValue4669_19_0)).intValue();
    }
    return forwardValue4669_20_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockFire.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9973_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.Q))))))).intValue();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30860;
      if (gb[var3] == null) {
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
         long var5 = fb[var3];
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
         Object[] var9 = (Object[])hb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               hb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         gb[var3] = var15;
      }

      return gb[var3];
}


private int c(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1460_15_0;
    int lexicalValue1460_47_0;
    boolean spill1460_0;
    int spill1460_1;
    long life3_3;
    int[] life5_5;
    int life6_20;
    moom.bs[] life7_22;
    int life8_25;
    int life9_27;
    moom.bs life10_34;
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_15: {
    lexical_join_14: {
    life3_3 = (net.minecraft.block.BlockFire.bb ^ 135834978279111L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1460_0 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        lexicalValue1460_15_0 = ((spill1460_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!((!spill1460_0))) {
        break lexical_join_14;
    }
    return 0;
    }
    lexicalValue1460_15_0 = 0;
    }
    life6_20 = lexicalValue1460_15_0;
    life7_22 = moom.bs.values();
    life8_25 = (life7_22).length;
    life9_27 = 0;
    lexical_cycle_23: while (true) {
    if (!((life9_27 < life8_25))) {
        break lexical_join_46;
    }
    life10_34 = (life7_22)[life9_27];
    spill1460_1 = java.lang.Math.max(((int)(((net.minecraft.block.BlockFire)(this)).c(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life10_34)))))))).a__ch()))))), ((int)(life6_20)));
    if (!((life5_5 != null))) {
        lexicalValue1460_47_0 = spill1460_1;
        break lexical_join_47;
    }
    life6_20 = spill1460_1;
    life9_27 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue1460_47_0 = life6_20;
    }
    return lexicalValue1460_47_0;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1461_52_0;
    int lexicalValue1461_120_0;
    int lexicalValue1461_174_0;
    int lexicalValue1461_226_0;
    int lexicalValue1461_280_0;
    int lexicalValue1461_284_0;
    int lexicalValue1461_332_0;
    int spill1461_0;
    boolean spill1461_1;
    boolean spill1461_2;
    long life5_3;
    int[] life7_5;
    int life8_93;
    double life9_105;
    double life11_112;
    double life13_119;
    int life8_151;
    double life9_165;
    double life11_172;
    double life13_179;
    int life8_211;
    double life9_221;
    double life11_228;
    double life13_237;
    int life8_269;
    double life9_279;
    double life11_286;
    double life13_297;
    int life8_329;
    double life9_339;
    double life11_350;
    double life13_357;
    int life8_383;
    double life9_393;
    double life11_404;
    double life13_411;
    lexical_join_375: {
    lexical_join_332: {
    lexical_join_331: {
    lexical_join_329: {
    lexical_join_284: {
    lexical_join_280: {
    lexical_join_275: {
    lexical_join_226: {
    lexical_join_221: {
    lexical_join_174: {
    lexical_join_169: {
    lexical_join_120: {
    lexical_join_115: {
    lexical_join_52: {
    lexical_join_48: {
    life5_3 = (net.minecraft.block.BlockFire.bb ^ 31823274789358L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1461_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic1461_2(13167, (5281075261359109265L ^ life5_3)))));
    if (!((life7_5 != null))) {
        lexicalValue1461_52_0 = spill1461_0;
        break lexical_join_52;
    }
    if (!((spill1461_0 == 0))) {
        break lexical_join_48;
    }
    ((net.minecraft.world.World)(p0)).a(((double)(((double) (((float) ((moom.DT)(p1)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p1)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p1)).c()) + 0x1.0p-1f)))), ((java.lang.String)("fire.fire")), ((float)((0x1.0p0f + ((java.util.Random)(p3)).nextFloat()))), ((float)(((((java.util.Random)(p3)).nextFloat() * 0x1.666666p-1f) + 0x1.333334p-2f))), ((boolean)(false)));
    }
    lexicalValue1461_52_0 = ((net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1461_332_0 = lexicalValue1461_52_0;
        break lexical_join_332;
    }
    if (!((lexicalValue1461_52_0 == 0))) {
        break lexical_join_331;
    }
    spill1461_1 = ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life7_5 != null))) {
        lexicalValue1461_332_0 = ((spill1461_1) ? 1 : 0);
        break lexical_join_332;
    }
    if (!((!spill1461_1))) {
        break lexical_join_331;
    }
    spill1461_2 = ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).e())));
    if (!((life7_5 != null))) {
        lexicalValue1461_120_0 = ((spill1461_2) ? 1 : 0);
        break lexical_join_120;
    }
    if (!(spill1461_2)) {
        break lexical_join_115;
    }
    life8_93 = 0;
    lexical_cycle_73: while (true) {
    if (!((life8_93 < 2))) {
        break lexical_join_115;
    }
    life9_105 = (((double) ((moom.DT)(p1)).a()) + (((java.util.Random)(p3)).nextDouble() * 0x1.99999ap-4d));
    life11_112 = (((double) ((moom.DT)(p1)).b()) + ((java.util.Random)(p3)).nextDouble());
    life13_119 = (((double) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextDouble());
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)(life9_105)), ((double)(life11_112)), ((double)(life13_119)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life8_93 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_169;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_73; }
    break lexical_cycle_73;
    }
    }
    lexicalValue1461_120_0 = ((((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).f())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1461_174_0 = lexicalValue1461_120_0;
        break lexical_join_174;
    }
    if (!((lexicalValue1461_120_0 != 0))) {
        break lexical_join_169;
    }
    life8_151 = 0;
    lexical_cycle_125: while (true) {
    if (!((life8_151 < 2))) {
        break lexical_join_169;
    }
    life9_165 = (((double) (((moom.DT)(p1)).a() + 1)) - (((java.util.Random)(p3)).nextDouble() * 0x1.99999ap-4d));
    life11_172 = (((double) ((moom.DT)(p1)).b()) + ((java.util.Random)(p3)).nextDouble());
    life13_179 = (((double) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextDouble());
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)(life9_165)), ((double)(life11_172)), ((double)(life13_179)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life8_151 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_221;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_125; }
    break lexical_cycle_125;
    }
    }
    lexicalValue1461_174_0 = ((((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).c__DT())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1461_226_0 = lexicalValue1461_174_0;
        break lexical_join_226;
    }
    if (!((lexicalValue1461_174_0 != 0))) {
        break lexical_join_221;
    }
    life8_211 = 0;
    lexical_cycle_179: while (true) {
    if (!((life8_211 < 2))) {
        break lexical_join_221;
    }
    life9_221 = (((double) ((moom.DT)(p1)).a()) + ((java.util.Random)(p3)).nextDouble());
    life11_228 = (((double) ((moom.DT)(p1)).b()) + ((java.util.Random)(p3)).nextDouble());
    life13_237 = (((double) ((moom.DT)(p1)).c()) + (((java.util.Random)(p3)).nextDouble() * 0x1.99999ap-4d));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)(life9_221)), ((double)(life11_228)), ((double)(life13_237)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life8_211 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_275;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_179; }
    break lexical_cycle_179;
    }
    }
    lexicalValue1461_226_0 = ((((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).d__DT())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1461_280_0 = lexicalValue1461_226_0;
        break lexical_join_280;
    }
    if (!((lexicalValue1461_226_0 != 0))) {
        break lexical_join_275;
    }
    life8_269 = 0;
    lexical_cycle_231: while (true) {
    if (!((life8_269 < 2))) {
        break lexical_join_275;
    }
    life9_279 = (((double) ((moom.DT)(p1)).a()) + ((java.util.Random)(p3)).nextDouble());
    life11_286 = (((double) ((moom.DT)(p1)).b()) + ((java.util.Random)(p3)).nextDouble());
    life13_297 = (((double) (((moom.DT)(p1)).c() + 1)) - (((java.util.Random)(p3)).nextDouble() * 0x1.99999ap-4d));
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)(life9_279)), ((double)(life11_286)), ((double)(life13_297)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life8_269 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_375;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_231; }
    break lexical_cycle_231;
    }
    }
    lexicalValue1461_280_0 = ((((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).a__DT())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        lexicalValue1461_284_0 = lexicalValue1461_280_0;
        break lexical_join_284;
    }
    if (!((lexicalValue1461_280_0 != 0))) {
        break lexical_join_375;
    }
    lexicalValue1461_284_0 = 0;
    }
    life8_329 = lexicalValue1461_284_0;
    lexical_cycle_285: while (true) {
    if (!((life8_329 < 2))) {
        break lexical_join_329;
    }
    life9_339 = (((double) ((moom.DT)(p1)).a()) + ((java.util.Random)(p3)).nextDouble());
    life11_350 = (((double) (((moom.DT)(p1)).b() + 1)) - (((java.util.Random)(p3)).nextDouble() * 0x1.99999ap-4d));
    life13_357 = (((double) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextDouble());
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)(life9_339)), ((double)(life11_350)), ((double)(life13_357)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life8_329 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_375;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_285; }
    break lexical_cycle_285;
    }
    }
    if (!((life7_5 == null))) {
        break lexical_join_375;
    }
    }
    lexicalValue1461_332_0 = 0;
    }
    life8_383 = lexicalValue1461_332_0;
    lexical_cycle_333: while (true) {
    if (!((life8_383 < 3))) {
        break lexical_join_375;
    }
    life9_393 = (((double) ((moom.DT)(p1)).a()) + ((java.util.Random)(p3)).nextDouble());
    life11_404 = ((((double) ((moom.DT)(p1)).b()) + (((java.util.Random)(p3)).nextDouble() * 0x1.0p-1d)) + 0x1.0p-1d);
    life13_411 = (((double) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextDouble());
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)(life9_393)), ((double)(life11_404)), ((double)(life13_411)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life8_383 += 1;
    if (!((life7_5 == null))) { continue lexical_cycle_333; }
    break lexical_cycle_333;
    }
    }
    return;
}


public static void c__sourceReturn_da8c82d5d4() {
long local0 = (net.minecraft.block.BlockFire.bb ^ 78980646543194L);
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_3(31818, (1012882362717515019L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bA)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_7(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bB)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_11(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bd)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_15(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.be)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_19(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bf)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_23(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bg)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_27(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bh)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_31(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bi)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_35(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_39(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aP)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_43(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aQ)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_47(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aR)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_51(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aS)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_55(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aT)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_59(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ad)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_63(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bK)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_67(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bJ)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_71(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bL)), ((int)(5)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_75(3726, (8531272198107160524L ^ local0)))));
    int[] spill8204_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)), ((int)(5)), ((int)(5)));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)), ((int)(5)), ((int)(5)));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.t)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_86(24450, (837973399782166220L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_87(6393, (301219010206910902L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.u)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_91(24450, (837973399782166220L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_92(31690, (8858955881947179676L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.X)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_96(24450, (837973399782166220L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_97(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_101(7878, (48230037310984067L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_102(22383, (3937122925347898919L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.H)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_106(31690, (8858955881947179676L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_107(22383, (3937122925347898919L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cj)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_111(31690, (8858955881947179676L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_112(22383, (3937122925347898919L ^ local0)))));
    int[] local2 = spill8204_0;
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.N)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_116(31690, (8858955881947179676L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_117(22383, (3937122925347898919L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_121(31690, (8858955881947179676L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_122(22383, (3937122925347898919L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.I)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_126(31690, (8858955881947179676L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_127(22383, (3937122925347898919L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.L)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_131(24450, (837973399782166220L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_132(31690, (8858955881947179676L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_136(7878, (48230037310984067L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_137(22383, (3937122925347898919L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ce)), ((int)(5)), ((int)(5)));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cb)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_144(31690, (8858955881947179676L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_145(3726, (8531272198107160524L ^ local0)))));
    ((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cc)), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_149(31690, (8858955881947179676L ^ local0)))), ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_150(3726, (8531272198107160524L ^ local0)))));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        net.minecraft.block.BlockPlanks$EnumType.b(((int[])(new int[2])));
    }
    return;
}


private int c(net.minecraft.block.Block p0) {
java.lang.Integer forwardValue4673_19_0;
    int forwardValue4673_20_0;
    int[] spill4673_0;
    java.lang.Integer spill4673_1;
    long life2_3;
    java.lang.Integer life5_10;
    int[] life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.block.BlockFire.bb ^ 99119706262974L);
    spill4673_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_10 = ((java.lang.Integer)(((java.util.Map)(this.Y)).get(((java.lang.Object)(p0)))));
    life4_11 = spill4673_0;
    spill4673_1 = life5_10;
    if (!((life4_11 != null))) {
        forwardValue4673_19_0 = spill4673_1;
        break forward_join_19;
    }
    if (!((spill4673_1 == null))) {
        break forward_join_18;
    }
    forwardValue4673_20_0 = 0;
    break forward_join_20;
    }
    forwardValue4673_19_0 = life5_10;
    }
    forwardValue4673_20_0 = ((java.lang.Integer)(forwardValue4673_19_0)).intValue();
    }
    return forwardValue4673_20_0;
}


protected boolean c__Boolean(net.minecraft.world.World p0, moom.DT p1) {
long l = net.minecraft.block.BlockFire.bb ^ 0x202182AF0840L;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = p0.m(p1);
        if (nArray == null) return bl;
        if (bl) return true;
        bl = p0.m(p1.e());
        if (nArray == null) return bl;
        if (bl) return true;
        bl = p0.m(p1.f());
        if (nArray == null) return bl;
        if (bl) return true;
        bl = p0.m(p1.c__DT());
        if (nArray == null) return bl;
        if (bl) return true;
        bl = p0.m(p1.d__DT());
        if (nArray == null) return bl;
        if (!bl) return false;
        return true;
}


private boolean d(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1462_37_0;
    int[] spill1462_0;
    boolean spill1462_1;
    long life3_3;
    moom.bs[] life6_5;
    int life7_9;
    int life8_11;
    int[] life5_12;
    moom.bs life9_19;
    lexical_join_37: {
    lexical_join_36: {
    life3_3 = (net.minecraft.block.BlockFire.bb ^ 83281649760488L);
    life6_5 = moom.bs.values();
    spill1462_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = (life6_5).length;
    life8_11 = 0;
    life5_12 = spill1462_0;
    lexical_cycle_13: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life8_11 < life7_9))) {
        break lexical_join_36;
    }
    life9_19 = (life6_5)[life8_11];
    if (!((life5_12 != null))) {
        break lexical_join_34;
    }
    spill1462_1 = ((net.minecraft.block.BlockFire)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_19))))));
    if (!((life5_12 != null))) {
        lexicalValue1462_37_0 = ((spill1462_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!(spill1462_1)) {
        break lexical_join_33;
    }
    return ((1) != 0);
    }
    life8_11 += 1;
    }
    if (!((life5_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1462_37_0 = 0;
    }
    return ((lexicalValue1462_37_0) != 0);
}


protected moom.fA a__fA() {
long life1_3;
    life1_3 = (net.minecraft.block.BlockFire.bb ^ 77184678799233L);
    return new moom.fA(this, recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(recovery.source.CarrierOps.store(new net.minecraft.block.properties.IProperty[__sourceIntrinsic_713a7e495fb6_invokedynamic400115_1(27749, (1838621407612339701L ^ life1_3))], 0, net.minecraft.block.BlockFire.Q), 1, net.minecraft.block.BlockFire.T), 2, net.minecraft.block.BlockFire.U), 3, net.minecraft.block.BlockFire.V), 4, net.minecraft.block.BlockFire.W), 5, net.minecraft.block.BlockFire.X), __sourceIntrinsic_713a7e495fb6_invokedynamic400115_14(27521, (6737497274748961293L ^ life1_3)), net.minecraft.block.BlockFire.R), __sourceIntrinsic_713a7e495fb6_invokedynamic400115_17(6623, (5663040818433421385L ^ life1_3)), net.minecraft.block.BlockFire.S));
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
int forwardValue4667_29_0;
    int forwardValue4667_42_0;
    int forwardValue4667_44_0;
    int forwardValue4667_63_0;
    int forwardValue4667_65_0;
    int forwardValue4667_77_0;
    int forwardValue4667_81_0;
    int forwardValue4667_83_0;
    net.minecraft.block.BlockFire forwardValue4667_131_0;
    int[] spill4667_0;
    boolean spill4667_1;
    net.minecraft.block.BlockFire spill4667_2;
    int spill4667_3;
    int spill4667_4;
    boolean spill4667_5;
    long life4_3;
    int life7_7;
    int life8_10;
    int[] life6_11;
    int life9_14;
    int life10_62;
    int life11_89;
    int life12_91;
    forward_join_131: {
    forward_join_130: {
    forward_join_84: {
    forward_join_83: {
    forward_join_82: {
    forward_join_81: {
    forward_join_77: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_29: {
    life4_3 = (net.minecraft.block.BlockFire.bb ^ 39121120913349L);
    spill4667_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_7 = ((moom.DT)(p2)).a();
    life8_10 = ((moom.DT)(p2)).b();
    life6_11 = spill4667_0;
    life9_14 = ((moom.DT)(p2)).c();
    spill4667_1 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    if (!((life6_11 != null))) {
        forwardValue4667_29_0 = ((spill4667_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill4667_1))) {
        break forward_join_130;
    }
    spill4667_2 = net.minecraft.init.Blocks.ab;
    if (!((life6_11 != null))) {
        forwardValue4667_131_0 = spill4667_2;
        break forward_join_131;
    }
    forwardValue4667_29_0 = ((((net.minecraft.block.BlockFire)(spill4667_2)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).b__DT())))) ? 1 : 0);
    }
    if (!((forwardValue4667_29_0 == 0))) {
        break forward_join_130;
    }
    spill4667_3 = (((life7_7 + life8_10) + life9_14) & 1);
    if (!((life6_11 != null))) {
        forwardValue4667_42_0 = spill4667_3;
        break forward_join_42;
    }
    if (!((spill4667_3 == 1))) {
        break forward_join_43;
    }
    forwardValue4667_42_0 = 1;
    }
    forwardValue4667_44_0 = forwardValue4667_42_0;
    break forward_join_44;
    }
    forwardValue4667_44_0 = 0;
    }
    life10_62 = forwardValue4667_44_0;
    spill4667_4 = ((((life7_7 / 2) + (life8_10 / 2)) + (life9_14 / 2)) & 1);
    if (!((life6_11 != null))) {
        forwardValue4667_63_0 = spill4667_4;
        break forward_join_63;
    }
    if (!((spill4667_4 == 1))) {
        break forward_join_64;
    }
    forwardValue4667_63_0 = 1;
    }
    forwardValue4667_65_0 = forwardValue4667_63_0;
    break forward_join_65;
    }
    forwardValue4667_65_0 = 0;
    }
    life11_89 = forwardValue4667_65_0;
    life12_91 = 0;
    spill4667_5 = ((net.minecraft.block.BlockFire)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).a__DT())));
    if (!((life6_11 != null))) {
        forwardValue4667_77_0 = ((spill4667_5) ? 1 : 0);
        break forward_join_77;
    }
    if (!(spill4667_5)) {
        break forward_join_84;
    }
    forwardValue4667_77_0 = life10_62;
    }
    if (!((life6_11 != null))) {
        forwardValue4667_81_0 = forwardValue4667_77_0;
        break forward_join_81;
    }
    if (!((forwardValue4667_77_0 != 0))) {
        break forward_join_82;
    }
    forwardValue4667_81_0 = 1;
    }
    forwardValue4667_83_0 = forwardValue4667_81_0;
    break forward_join_83;
    }
    forwardValue4667_83_0 = 2;
    }
    life12_91 = forwardValue4667_83_0;
    }
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.T)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((net.minecraft.block.BlockFire)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).c__DT()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.U)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((net.minecraft.block.BlockFire)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).f()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.V)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((net.minecraft.block.BlockFire)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).d__DT()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.W)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((net.minecraft.block.BlockFire)(this)).b__sourceReturn_b38f36a0de(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(((moom.DT)(p2)).e()))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.X)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life12_91)))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life11_89))))))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life10_62)))))));
    }
    forwardValue4667_131_0 = this;
    }
    return ((net.minecraft.block.BlockFire)(forwardValue4667_131_0)).a__fE();
}


public void a(net.minecraft.block.Block p0, int p1, int p2) {
((java.util.Map)(this.Y)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))));
    ((java.util.Map)(this.Z)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p2))))));
    return;
}


public int a(java.util.Random p0) {
return 0;
}


public int a(net.minecraft.world.World p0) {
long local2 = (net.minecraft.block.BlockFire.bb ^ 91253093876128L);
    return __sourceIntrinsic_a3a6e3090437_originalDynamicSite1751_1(24450, (837952610112720950L ^ local2));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
block5: {
            boolean bl;
            int[] nArray;
            block4: {
                long l = net.minecraft.block.BlockFire.bb ^ 0x40E17A7C430FL;
                nArray = BlockPlanks$EnumType.b__ArrayInt();
                bl = World.a(p0, p1.b__DT());
                if (nArray == null) break block4;
                if (bl) break block5;
                bl = this.d(p0, p1);
            }
            if (nArray != null && !bl) {
                bl = p0.d__Boolean(p1);
            }
        }
}


private void a(net.minecraft.world.World p0, moom.DT p1, int p2, java.util.Random p3, int p4) {
int forwardValue4668_74_0;
    int forwardValue4668_80_0;
    net.minecraft.block.Block forwardValue4668_88_0;
    int[] spill4668_0;
    int spill4668_1;
    boolean spill4668_2;
    int spill4668_3;
    net.minecraft.block.Block spill4668_4;
    long life6_3;
    int life9_11;
    int[] life8_12;
    net.minecraft.block.state.IBlockState life10_21;
    int life11_57;
    forward_join_95: {
    forward_join_88: {
    forward_join_81: {
    forward_join_80: {
    forward_join_77: {
    forward_join_74: {
    forward_join_64: {
    life6_3 = (net.minecraft.block.BlockFire.bb ^ 26210258781058L);
    spill4668_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_11 = ((net.minecraft.block.BlockFire)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch())));
    life8_12 = spill4668_0;
    if (!((((java.util.Random)(p3)).nextInt(((int)(p2))) < life9_11))) {
        break forward_join_95;
    }
    life10_21 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    spill4668_1 = ((java.util.Random)(p3)).nextInt(((int)((p4 + __sourceIntrinsic_29c8f4ba5fd6_invokedynamic4668_7(20667, (9220097632046816566L ^ life6_3))))));
    if (!((life8_12 != null))) {
        forwardValue4668_80_0 = spill4668_1;
        break forward_join_80;
    }
    if (!((spill4668_1 < 5))) {
        break forward_join_77;
    }
    spill4668_2 = ((net.minecraft.world.World)(p0)).m(((moom.DT)(p1)));
    if (!((life8_12 != null))) {
        forwardValue4668_80_0 = ((spill4668_2) ? 1 : 0);
        break forward_join_80;
    }
    if (!((!spill4668_2))) {
        break forward_join_77;
    }
    life11_57 = (p4 + (((java.util.Random)(p3)).nextInt(((int)(5))) / 4));
    spill4668_3 = life11_57;
    if (!((life8_12 != null))) {
        forwardValue4668_74_0 = spill4668_3;
        break forward_join_74;
    }
    if (!((spill4668_3 > __sourceIntrinsic_29c8f4ba5fd6_invokedynamic4668_12(7878, (48142070202192731L ^ life6_3))))) {
        break forward_join_64;
    }
    life11_57 = __sourceIntrinsic_29c8f4ba5fd6_invokedynamic4668_13(7878, (48142070202192731L ^ life6_3));
    }
    forwardValue4668_74_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFire.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(life11_57)))))))), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4668_74_0);
    if (!((life8_12 == null))) {
        break forward_join_81;
    }
    }
    forwardValue4668_80_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4668_80_0);
    }
    spill4668_4 = ((net.minecraft.block.state.IBlockState)(life10_21)).a__ch();
    if (!((life8_12 != null))) {
        forwardValue4668_88_0 = spill4668_4;
        break forward_join_88;
    }
    if (!((spill4668_4 == net.minecraft.init.Blocks.W))) {
        break forward_join_95;
    }
    forwardValue4668_88_0 = net.minecraft.init.Blocks.W;
    }
    ((net.minecraft.block.Block)(forwardValue4668_88_0)).a__Void(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life10_21)).a__fE(((net.minecraft.block.properties.IProperty)(moom.ez.Q)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    }
    return;
}


public moom.fm a__fm(net.minecraft.block.state.IBlockState p0) {
return moom.fm.f;
}


public boolean k() {
return ((0) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


public boolean q() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1745_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_originalDynamicSite1751_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_29c8f4ba5fd6_invokedynamic4668_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_29c8f4ba5fd6_invokedynamic4668_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_29c8f4ba5fd6_invokedynamic4668_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_713a7e495fb6_invokedynamic400115_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_713a7e495fb6_invokedynamic400115_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_713a7e495fb6_invokedynamic400115_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9973_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic531_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_af6763de0cbb_invokedynamic4672_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic8204_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic1461_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
