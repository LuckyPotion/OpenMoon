package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityZombie extends moom.sZ {

protected static net.minecraft.entity.ai.attributes.IAttribute b5;

private static java.util.UUID b6;

private static moom.vB b7;

private moom.un b8;

private int b9;

private boolean b_;

private float ca;

private float cb;

private static long jb;

private static long[] xb;

private static java.lang.Integer[] yb;

private static java.util.Map zb;

public EntityZombie(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_2f7af9999976638f(net.minecraft.entity.monster.EntityZombie receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.monster.EntityZombie.jb ^ 87153187297200L);
    net.minecraft.entity.monster.EntityZombie.__sourceConstructorInit_2f7af9999976638f_0(((net.minecraft.entity.monster.EntityZombie)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntityZombie)(receiver)).b8 = ((moom.un)(new moom.un(receiver)));
    ((net.minecraft.entity.monster.EntityZombie)(receiver)).b_ = ((boolean)(false));
    ((net.minecraft.entity.monster.EntityZombie)(receiver)).ca = ((float)(-0x1.0p0f));
    ((moom.AW)(((moom.AW)(__sourceExactCall_30cfc1c52e6e80(((net.minecraft.entity.monster.EntityZombie)(receiver))))))).b(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityZombie)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityZombie)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.ue(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p0d, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityZombie)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.uG(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityZombie)(receiver)).bJ)).a(((int)(__sourceIntrinsic_2f7af9999976638f_originalDynamicSite3377_16(29711, (3975178248800584953L ^ local2)))), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityZombie)(receiver)).bJ)).a(((int)(__sourceIntrinsic_2f7af9999976638f_originalDynamicSite3377_19(28164, (8026783703672676074L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityZombie)(receiver)).bJ)), ((int)(__sourceIntrinsic_2f7af9999976638f_originalDynamicSite3377_23(26886, (6458997993083722238L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    __sourceExactCall_44328695cdef6e(((net.minecraft.entity.monster.EntityZombie)(receiver)));
    __sourceExactCall_f34e52575c37d0(((net.minecraft.entity.monster.EntityZombie)(receiver)), ((float)(0x1.333334p-1f)), ((float)(0x1.f33334p0f)));
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(-5086454489365652197L)), ((long)(1096391396942268065L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27973141500616L)))));
    zb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityZombie.jb ^ 54078495378831L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1876_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1876_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1876_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1876_14 = new byte[8];
    (__sourceSpill1876_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1876_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1876_16 = __sourceSpill1876_14;
    ((javax.crypto.Cipher)(__sourceSpill1876_11)).init(((int)(__sourceSpill1876_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1876_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1876_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[28];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "/\177?\nFà¹@xjÍ*ãù+\001Ç ä\031kx\026OñÖ'>\004'2!\b\030|T\006<f)áLpHb/ßL\003\017({ì\020¨Ì}\"Áý\030îa\005î+2a9\b<¥D¿²$\034Vâ!Ç\025w°\035\fî/Vj¬öêÕÓ\b6DU&xÇÖñ¨&[¦»\003#©\027a<`1diG{)>ís£ÃÊ\002û|ÂNîÜg&ÿùf\0276Wð _GJÓäèmôám×´Oè+Öè\035a\\ZÊ4G\001ÆP\034zô×Rm×\nu\022¥\034ÊM "))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1876_25 = local6_life21;
        int __sourceSpill1876_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1876_25)).substring(((int)(__sourceSpill1876_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1876_30 = local8_life19;
        int __sourceSpill1876_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1876_33 = new byte[8];
        (__sourceSpill1876_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1876_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1876_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1876_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1876_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1876_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1876_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1876_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1876_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1876_34)).doFinal(((byte[])(__sourceSpill1876_33)));
        (__sourceSpill1876_30)[__sourceSpill1876_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "s.JC^¢7+s°Âò"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1876_38 = local6_life21;
        int __sourceSpill1876_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1876_38)).substring(((int)(__sourceSpill1876_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1876_43 = local8_life19;
        int __sourceSpill1876_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1876_46 = new byte[8];
        (__sourceSpill1876_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1876_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1876_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1876_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1876_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1876_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1876_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1876_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1876_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1876_47)).doFinal(((byte[])(__sourceSpill1876_46)));
        (__sourceSpill1876_43)[__sourceSpill1876_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    xb = ((long[])(local8_life19));
    yb = ((java.lang.Integer[])(new java.lang.Integer[28]));
    b5 = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(new net.minecraft.entity.ai.attributes.RangedAttribute(null, "zombie.spawnReinforcements", 0x0.0p0d, 0x0.0p0d, 0x1.0p0d))).a(((java.lang.String)("Spawn Reinforcements Chance")))));
    b6 = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)("B9766B59-9566-4402-BC1F-2EE2A276D836")))));
    b7 = ((moom.vB)(new moom.vB(net.minecraft.entity.monster.EntityZombie.b6, "Baby speed boost", 0x1.0p-1d, 1)));
}

private static native <E extends Throwable> void __sourceConstructorInit_2f7af9999976638f_0(net.minecraft.entity.monster.EntityZombie a0, net.minecraft.world.World a1) throws E;
private static native <E extends Throwable> net.minecraft.entity.IEntityLivingData __sourceHandlerCall_69fd08559e327e59ee7a(net.minecraft.entity.monster.EntityZombie a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws E;
private static final class __SourceHandler_69fd08559e327e59ee7a {

public static net.minecraft.entity.IEntityLivingData f666(net.minecraft.entity.monster.EntityZombie receiver, moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) throws Throwable {
    net.minecraft.entity.monster.EntityZombie forestValue666_26_0;
    int forestValue666_26_1;
    net.minecraft.entity.monster.EntityZombie forestValue666_27_0;
    net.minecraft.entity.monster.EntityZombie forestValue666_28_0;
    int forestValue666_28_1;
    moom.vO forestValue666_44_0;
    moom.vO forestValue666_44_1;
    moom.vO forestValue666_45_0;
    moom.vO forestValue666_45_1;
    int forestValue666_45_2;
    moom.vO forestValue666_54_0;
    moom.vO forestValue666_54_1;
    int forestValue666_54_2;
    moom.vO forestValue666_55_0;
    moom.vO forestValue666_55_1;
    int forestValue666_55_2;
    int forestValue666_55_3;
    net.minecraft.entity.IEntityLivingData forestValue666_58_0;
    net.minecraft.entity.IEntityLivingData forestValue666_63_0;
    int forestValue666_75_0;
    int forestValue666_88_0;
    java.lang.Object forestValue666_111_0;
    int forestValue666_130_0;
    net.minecraft.entity.monster.EntityZombie forestValue666_165_0;
    net.minecraft.entity.monster.EntityZombie forestValue666_176_0;
    int forestValue666_176_1;
    net.minecraft.entity.monster.EntityZombie forestValue666_177_0;
    net.minecraft.entity.monster.EntityZombie forestValue666_178_0;
    int forestValue666_178_1;
    int forestValue666_226_0;
    net.minecraft.entity.monster.EntityZombie forestValue666_239_0;
    int forestValue666_239_1;
    net.minecraft.item.ItemStack forestValue666_239_2;
    net.minecraft.item.ItemStack forestValue666_239_3;
    net.minecraft.entity.monster.EntityZombie forestValue666_240_0;
    int forestValue666_240_1;
    net.minecraft.item.ItemStack forestValue666_240_2;
    net.minecraft.item.ItemStack forestValue666_240_3;
    net.minecraft.block.Block forestValue666_240_4;
    net.minecraft.entity.monster.EntityZombie forestValue666_262_0;
    java.util.Random forestValue666_263_0;
    int forestValue666_295_0;
    net.minecraft.entity.monster.EntityZombie forestValue666_329_0;
    net.minecraft.entity.Entity[] spill666_0;
    net.minecraft.entity.monster.EntityZombie spill666_1;
    int spill666_2;
    net.minecraft.entity.IEntityLivingData spill666_3;
    moom.vO spill666_4;
    moom.vO spill666_5;
    boolean spill666_6;
    java.util.List spill666_7;
    net.minecraft.entity.monster.EntityZombie spill666_8;
    net.minecraft.entity.passive.EntityChicken spill666_9;
    int spill666_10;
    net.minecraft.entity.monster.EntityZombie spill666_11;
    int spill666_12;
    java.util.Random spill666_13;
    net.minecraft.entity.monster.EntityZombie spill666_14;
    int spill666_15;
    net.minecraft.item.ItemStack spill666_16;
    net.minecraft.item.ItemStack spill666_17;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill666_18;
    moom.vB spill666_19;
    int spill666_20;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill666_21;
    moom.vB spill666_22;
    net.minecraft.entity.monster.EntityZombie spill666_23;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill666_24;
    moom.vB spill666_25;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill666_26;
    moom.vB spill666_27;
    long life3_3;
    net.minecraft.entity.IEntityLivingData life2_9;
    net.minecraft.entity.Entity[] life5_10;
    float life6_13;
    moom.vO life7_69;
    java.util.List life8_112;
    net.minecraft.entity.passive.EntityChicken life9_124;
    net.minecraft.entity.passive.EntityChicken life8_150;
    java.util.Calendar life7_210;
    double life7_291;
    forest_join_331: {
    forest_join_329: {
    forest_join_295: {
    forest_join_286: {
    forest_join_263: {
    forest_join_262: {
    forest_join_261: {
    forest_join_247: {
    forest_join_240: {
    forest_join_239: {
    forest_join_226: {
    forest_join_178: {
    forest_join_177: {
    forest_join_176: {
    forest_join_165: {
    forest_join_164: {
    forest_join_130: {
    forest_join_121: {
    forest_join_119: {
    forest_join_111: {
    forest_join_88: {
    forest_join_75: {
    forest_join_73: {
    forest_join_63: {
    forest_join_58: {
    forest_join_57: {
    forest_join_55: {
    forest_join_54: {
    forest_join_45: {
    forest_join_44: {
    forest_join_28: {
    forest_join_27: {
    forest_join_26: {
    life3_3 = (__fieldRead666_0() ^ 93583874885887L);
    spill666_0 = __call666_1();
    life2_9 = __call666_2(receiver, p0, p1);
    life5_10 = spill666_0;
    life6_13 = __call666_3(p0);
    spill666_1 = receiver;
    spill666_2 = __numericCompare666_6(__call666_5(__fieldRead666_4(receiver)), (0x1.19999ap-1f * life6_13));
    if (!((life5_10 == null))) {
        forestValue666_26_0 = spill666_1;
        forestValue666_26_1 = spill666_2;
        break forest_join_26;
    }
    if (!((spill666_2 < 0))) {
        forestValue666_27_0 = spill666_1;
        break forest_join_27;
    }
    forestValue666_26_0 = spill666_1;
    forestValue666_26_1 = 1;
    }
    forestValue666_28_0 = forestValue666_26_0;
    forestValue666_28_1 = forestValue666_26_1;
    break forest_join_28;
    }
    forestValue666_28_0 = forestValue666_27_0;
    forestValue666_28_1 = 0;
    }
    __call666_7(forestValue666_28_0, forestValue666_28_1);
    spill666_3 = life2_9;
    if (!((life5_10 == null))) {
        forestValue666_58_0 = spill666_3;
        break forest_join_58;
    }
    if (!((spill666_3 == null))) {
        break forest_join_57;
    }
    moom.vO __stackOp666_9_0 = __sourceUninitializedNEW666_8();
    spill666_4 = __stackOp666_9_0;
    spill666_5 = __stackOp666_9_0;
    if (!((__numericCompare666_13(__call666_12(__fieldRead666_11(__fieldRead666_10(receiver))), 0x1.99999ap-5f) < 0))) {
        forestValue666_44_0 = spill666_4;
        forestValue666_44_1 = spill666_5;
        break forest_join_44;
    }
    forestValue666_45_0 = spill666_4;
    forestValue666_45_1 = spill666_5;
    forestValue666_45_2 = 1;
    break forest_join_45;
    }
    forestValue666_45_0 = forestValue666_44_0;
    forestValue666_45_1 = forestValue666_44_1;
    forestValue666_45_2 = 0;
    }
    if (!((__numericCompare666_17(__call666_16(__fieldRead666_15(__fieldRead666_14(receiver))), 0x1.99999ap-5f) < 0))) {
        forestValue666_54_0 = forestValue666_45_0;
        forestValue666_54_1 = forestValue666_45_1;
        forestValue666_54_2 = forestValue666_45_2;
        break forest_join_54;
    }
    forestValue666_55_0 = forestValue666_45_0;
    forestValue666_55_1 = forestValue666_45_1;
    forestValue666_55_2 = forestValue666_45_2;
    forestValue666_55_3 = 1;
    break forest_join_55;
    }
    forestValue666_55_0 = forestValue666_54_0;
    forestValue666_55_1 = forestValue666_54_1;
    forestValue666_55_2 = forestValue666_54_2;
    forestValue666_55_3 = 0;
    }
    __explicitNewInit666_18(forestValue666_55_1, __integerCategory666_19(forestValue666_55_2), __integerCategory666_20(forestValue666_55_3));
    life2_9 = forestValue666_55_0;
    }
    forestValue666_58_0 = life2_9;
    }
    if (!((life5_10 == null))) {
        forestValue666_63_0 = forestValue666_58_0;
        break forest_join_63;
    }
    if (!((__instanceOf666_21(forestValue666_58_0) != 0))) {
        break forest_join_164;
    }
    forestValue666_63_0 = life2_9;
    }
    life7_69 = __cast666_22(forestValue666_63_0);
    spill666_6 = __fieldRead666_23(life7_69);
    if (!((life5_10 == null))) {
        forestValue666_75_0 = __integerCategory666_24(spill666_6);
        break forest_join_75;
    }
    if (!(spill666_6)) {
        break forest_join_73;
    }
    __call666_25(receiver, 1);
    }
    forestValue666_75_0 = __integerCategory666_27(__fieldRead666_26(life7_69));
    }
    if (!((life5_10 == null))) {
        forestValue666_88_0 = forestValue666_75_0;
        break forest_join_88;
    }
    if (!((forestValue666_75_0 != 0))) {
        break forest_join_164;
    }
    __call666_28(receiver, 1);
    forestValue666_88_0 = __numericCompare666_32(((double) __call666_31(__fieldRead666_30(__fieldRead666_29(receiver)))), 0x1.999999999999ap-5d);
    }
    if (!((life5_10 == null))) {
        forestValue666_130_0 = forestValue666_88_0;
        break forest_join_130;
    }
    if (!((forestValue666_88_0 < 0))) {
        break forest_join_121;
    }
    life8_112 = __call666_38(__fieldRead666_33(receiver), __classLiteral666_34(), __call666_36(__call666_35(receiver), 0x1.4p2d, 0x1.8p1d, 0x1.4p2d), __fieldRead666_37());
    spill666_7 = life8_112;
    if (!((life5_10 == null))) {
        forestValue666_111_0 = spill666_7;
        break forest_join_111;
    }
    if (!((!__call666_39(spill666_7)))) {
        break forest_join_119;
    }
    forestValue666_111_0 = __call666_40(life8_112, 0);
    }
    life9_124 = __cast666_41(forestValue666_111_0);
    __call666_42(life9_124, 1);
    __call666_43(receiver, life9_124);
    }
    if (!((life5_10 != null))) {
        break forest_join_164;
    }
    }
    spill666_8 = receiver;
    if (!((life5_10 == null))) {
        forestValue666_165_0 = spill666_8;
        break forest_join_165;
    }
    forestValue666_130_0 = __numericCompare666_47(((double) __call666_46(__fieldRead666_45(__fieldRead666_44(spill666_8)))), 0x1.999999999999ap-5d);
    }
    if (!((forestValue666_130_0 < 0))) {
        break forest_join_164;
    }
    net.minecraft.entity.passive.EntityChicken __stackOp666_49_0 = __sourceUninitializedNEW666_48();
    spill666_9 = __stackOp666_49_0;
    __explicitNewInit666_51(__stackOp666_49_0, __fieldRead666_50(receiver));
    life8_150 = spill666_9;
    __call666_56(life8_150, __fieldRead666_52(receiver), __fieldRead666_53(receiver), __fieldRead666_54(receiver), __fieldRead666_55(receiver), 0x0.0p0f);
    __call666_57(life8_150, p0, null);
    __call666_58(life8_150, 1);
    __call666_60(__fieldRead666_59(receiver), life8_150);
    __call666_61(receiver, life8_150);
    }
    forestValue666_165_0 = receiver;
    }
    spill666_10 = __numericCompare666_64(__call666_63(__fieldRead666_62(receiver)), (life6_13 * 0x1.99999ap-4f));
    if (!((life5_10 == null))) {
        forestValue666_176_0 = forestValue666_165_0;
        forestValue666_176_1 = spill666_10;
        break forest_join_176;
    }
    if (!((spill666_10 < 0))) {
        forestValue666_177_0 = forestValue666_165_0;
        break forest_join_177;
    }
    forestValue666_176_0 = forestValue666_165_0;
    forestValue666_176_1 = 1;
    }
    forestValue666_178_0 = forestValue666_176_0;
    forestValue666_178_1 = forestValue666_176_1;
    break forest_join_178;
    }
    forestValue666_178_0 = forestValue666_177_0;
    forestValue666_178_1 = 0;
    }
    __call666_65(forestValue666_178_0, forestValue666_178_1);
    __call666_66(receiver, p0);
    __call666_67(receiver, p0);
    spill666_11 = receiver;
    if (!((life5_10 == null))) {
        forestValue666_262_0 = spill666_11;
        break forest_join_262;
    }
    if (!((__call666_68(spill666_11, 4) == null))) {
        break forest_join_247;
    }
    life7_210 = __call666_70(__fieldRead666_69(receiver));
    if (!((life5_10 == null))) {
        break forest_join_261;
    }
    if (!(((__call666_71(life7_210, 2) + 1) == __invokedynamic666_72(24763, (9132616504282304276L ^ life3_3))))) {
        break forest_join_247;
    }
    spill666_12 = __call666_73(life7_210, 5);
    if (!((life5_10 == null))) {
        forestValue666_226_0 = spill666_12;
        break forest_join_226;
    }
    if (!((spill666_12 == __invokedynamic666_74(24336, (6156931203996577971L ^ life3_3))))) {
        break forest_join_247;
    }
    spill666_13 = __fieldRead666_75(receiver);
    if (!((life5_10 == null))) {
        forestValue666_263_0 = spill666_13;
        break forest_join_263;
    }
    forestValue666_226_0 = __numericCompare666_77(__call666_76(spill666_13), 0x1.0p-2f);
    }
    if (!((forestValue666_226_0 < 0))) {
        break forest_join_247;
    }
    spill666_14 = receiver;
    spill666_15 = 4;
    net.minecraft.item.ItemStack __stackOp666_79_0 = __sourceUninitializedNEW666_78();
    spill666_16 = __stackOp666_79_0;
    spill666_17 = __stackOp666_79_0;
    if (!((__numericCompare666_82(__call666_81(__fieldRead666_80(receiver)), 0x1.99999ap-4f) < 0))) {
        forestValue666_239_0 = spill666_14;
        forestValue666_239_1 = spill666_15;
        forestValue666_239_2 = spill666_16;
        forestValue666_239_3 = spill666_17;
        break forest_join_239;
    }
    forestValue666_240_0 = spill666_14;
    forestValue666_240_1 = spill666_15;
    forestValue666_240_2 = spill666_16;
    forestValue666_240_3 = spill666_17;
    forestValue666_240_4 = __fieldRead666_83();
    break forest_join_240;
    }
    forestValue666_240_0 = forestValue666_239_0;
    forestValue666_240_1 = forestValue666_239_1;
    forestValue666_240_2 = forestValue666_239_2;
    forestValue666_240_3 = forestValue666_239_3;
    forestValue666_240_4 = __fieldRead666_84();
    }
    __explicitNewInit666_85(forestValue666_240_3, forestValue666_240_4);
    __call666_86(forestValue666_240_0, forestValue666_240_1, forestValue666_240_2);
    (__fieldRead666_87(receiver))[4] = 0x0.0p0f;
    }
    spill666_18 = __call666_89(receiver, __fieldRead666_88());
    moom.vB __stackOp666_91_0 = __sourceUninitializedNEW666_90();
    spill666_19 = __stackOp666_91_0;
    __explicitNewInit666_94(__stackOp666_91_0, "Random spawn bonus", (__call666_93(__fieldRead666_92(receiver)) * 0x1.99999ap-5d), 0);
    __call666_95(spill666_18, spill666_19);
    }
    forestValue666_262_0 = receiver;
    }
    forestValue666_263_0 = __fieldRead666_96(forestValue666_262_0);
    }
    life7_291 = ((__call666_97(forestValue666_263_0) * 0x1.8p0d) * ((double) life6_13));
    spill666_20 = __numericCompare666_98(life7_291, 0x1.0p0d);
    if (!((life5_10 == null))) {
        forestValue666_295_0 = spill666_20;
        break forest_join_295;
    }
    if (!((spill666_20 > 0))) {
        break forest_join_286;
    }
    spill666_21 = __call666_100(receiver, __fieldRead666_99());
    moom.vB __stackOp666_102_0 = __sourceUninitializedNEW666_101();
    spill666_22 = __stackOp666_102_0;
    __explicitNewInit666_103(__stackOp666_102_0, "Random zombie-spawn bonus", life7_291, 2);
    __call666_104(spill666_21, spill666_22);
    }
    spill666_23 = receiver;
    if (!((life5_10 == null))) {
        forestValue666_329_0 = spill666_23;
        break forest_join_329;
    }
    forestValue666_295_0 = __numericCompare666_107(__call666_106(__fieldRead666_105(spill666_23)), (life6_13 * 0x1.99999ap-5f));
    }
    if (!((forestValue666_295_0 < 0))) {
        break forest_join_331;
    }
    spill666_24 = __call666_109(receiver, __fieldRead666_108());
    moom.vB __stackOp666_111_0 = __sourceUninitializedNEW666_110();
    spill666_25 = __stackOp666_111_0;
    __explicitNewInit666_114(__stackOp666_111_0, "Leader zombie bonus", ((__call666_113(__fieldRead666_112(receiver)) * 0x1.0p-2d) + 0x1.0p-1d), 0);
    __call666_115(spill666_24, spill666_25);
    spill666_26 = __call666_117(receiver, __fieldRead666_116());
    moom.vB __stackOp666_119_0 = __sourceUninitializedNEW666_118();
    spill666_27 = __stackOp666_119_0;
    __explicitNewInit666_122(__stackOp666_119_0, "Leader zombie bonus", ((__call666_121(__fieldRead666_120(receiver)) * 0x1.8p1d) + 0x1.0p0d), 2);
    __call666_123(spill666_26, spill666_27);
    forestValue666_329_0 = receiver;
    }
    __call666_124(forestValue666_329_0, 1);
    }
    return life2_9;
}
private static native long __fieldRead666_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call666_1() throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call666_2(net.minecraft.entity.monster.EntityZombie a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws Throwable;
private static native float __call666_3(moom.Eh a0) throws Throwable;
private static native java.util.Random __fieldRead666_4(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native float __call666_5(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_6(float a0, float a1) throws Throwable;
private static native void __call666_7(net.minecraft.entity.monster.EntityZombie a0, int a1) throws Throwable;
private static native moom.vO __sourceUninitializedNEW666_8() throws Throwable;
private static native net.minecraft.world.World __fieldRead666_10(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native java.util.Random __fieldRead666_11(net.minecraft.world.World a0) throws Throwable;
private static native float __call666_12(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_13(float a0, float a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead666_14(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native java.util.Random __fieldRead666_15(net.minecraft.world.World a0) throws Throwable;
private static native float __call666_16(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_17(float a0, float a1) throws Throwable;
private static native boolean __integerCategory666_19(int value) throws Throwable;
private static native boolean __integerCategory666_20(int value) throws Throwable;
private static native void __explicitNewInit666_18(moom.vO a0, boolean a1, boolean a2) throws Throwable;
private static native int __instanceOf666_21(net.minecraft.entity.IEntityLivingData a0) throws Throwable;
private static native moom.vO __cast666_22(net.minecraft.entity.IEntityLivingData a0) throws Throwable;
private static native boolean __fieldRead666_23(moom.vO a0) throws Throwable;
private static native int __integerCategory666_24(boolean value) throws Throwable;
private static native void __call666_25(net.minecraft.entity.monster.EntityZombie a0, int a1) throws Throwable;
private static native boolean __fieldRead666_26(moom.vO a0) throws Throwable;
private static native int __integerCategory666_27(boolean value) throws Throwable;
private static native void __call666_28(net.minecraft.entity.monster.EntityZombie a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead666_29(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native java.util.Random __fieldRead666_30(net.minecraft.world.World a0) throws Throwable;
private static native float __call666_31(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_32(double a0, double a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead666_33(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native java.lang.Class __classLiteral666_34() throws Throwable;
private static native moom.CA __call666_35(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native moom.CA __call666_36(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead666_37() throws Throwable;
private static native java.util.List __call666_38(net.minecraft.world.World a0, java.lang.Class a1, moom.CA a2, com.google.common.base.Predicate a3) throws Throwable;
private static native boolean __call666_39(java.util.List a0) throws Throwable;
private static native java.lang.Object __call666_40(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.passive.EntityChicken __cast666_41(java.lang.Object a0) throws Throwable;
private static native void __call666_42(net.minecraft.entity.passive.EntityChicken a0, int a1) throws Throwable;
private static native void __call666_43(net.minecraft.entity.monster.EntityZombie a0, net.minecraft.entity.passive.EntityChicken a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead666_44(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native java.util.Random __fieldRead666_45(net.minecraft.world.World a0) throws Throwable;
private static native float __call666_46(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_47(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.passive.EntityChicken __sourceUninitializedNEW666_48() throws Throwable;
private static native net.minecraft.world.World __fieldRead666_50(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native void __explicitNewInit666_51(net.minecraft.entity.passive.EntityChicken a0, net.minecraft.world.World a1) throws Throwable;
private static native double __fieldRead666_52(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native double __fieldRead666_53(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native double __fieldRead666_54(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native float __fieldRead666_55(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native void __call666_56(net.minecraft.entity.passive.EntityChicken a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call666_57(net.minecraft.entity.passive.EntityChicken a0, moom.Eh a1, java.lang.Object a2) throws Throwable;
private static native void __call666_58(net.minecraft.entity.passive.EntityChicken a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead666_59(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native boolean __call666_60(net.minecraft.world.World a0, net.minecraft.entity.passive.EntityChicken a1) throws Throwable;
private static native void __call666_61(net.minecraft.entity.monster.EntityZombie a0, net.minecraft.entity.passive.EntityChicken a1) throws Throwable;
private static native java.util.Random __fieldRead666_62(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native float __call666_63(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_64(float a0, float a1) throws Throwable;
private static native void __call666_65(net.minecraft.entity.monster.EntityZombie a0, int a1) throws Throwable;
private static native void __call666_66(net.minecraft.entity.monster.EntityZombie a0, moom.Eh a1) throws Throwable;
private static native void __call666_67(net.minecraft.entity.monster.EntityZombie a0, moom.Eh a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call666_68(net.minecraft.entity.monster.EntityZombie a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead666_69(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native java.util.Calendar __call666_70(net.minecraft.world.World a0) throws Throwable;
private static native int __call666_71(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic666_72(int a0, long a1) throws Throwable;
private static native int __call666_73(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic666_74(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead666_75(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native float __call666_76(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_77(float a0, float a1) throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW666_78() throws Throwable;
private static native java.util.Random __fieldRead666_80(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native float __call666_81(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_82(float a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead666_83() throws Throwable;
private static native net.minecraft.block.Block __fieldRead666_84() throws Throwable;
private static native void __explicitNewInit666_85(net.minecraft.item.ItemStack a0, net.minecraft.block.Block a1) throws Throwable;
private static native void __call666_86(net.minecraft.entity.monster.EntityZombie a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native float[] __fieldRead666_87(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttribute __fieldRead666_88() throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call666_89(net.minecraft.entity.monster.EntityZombie a0, net.minecraft.entity.ai.attributes.IAttribute a1) throws Throwable;
private static native moom.vB __sourceUninitializedNEW666_90() throws Throwable;
private static native java.util.Random __fieldRead666_92(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native double __call666_93(java.util.Random a0) throws Throwable;
private static native void __explicitNewInit666_94(moom.vB a0, java.lang.String a1, double a2, int a3) throws Throwable;
private static native void __call666_95(net.minecraft.entity.ai.attributes.IAttributeInstance a0, moom.vB a1) throws Throwable;
private static native java.util.Random __fieldRead666_96(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native double __call666_97(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_98(double a0, double a1) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttribute __fieldRead666_99() throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call666_100(net.minecraft.entity.monster.EntityZombie a0, net.minecraft.entity.ai.attributes.IAttribute a1) throws Throwable;
private static native moom.vB __sourceUninitializedNEW666_101() throws Throwable;
private static native void __explicitNewInit666_103(moom.vB a0, java.lang.String a1, double a2, int a3) throws Throwable;
private static native void __call666_104(net.minecraft.entity.ai.attributes.IAttributeInstance a0, moom.vB a1) throws Throwable;
private static native java.util.Random __fieldRead666_105(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native float __call666_106(java.util.Random a0) throws Throwable;
private static native int __numericCompare666_107(float a0, float a1) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttribute __fieldRead666_108() throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call666_109(net.minecraft.entity.monster.EntityZombie a0, net.minecraft.entity.ai.attributes.IAttribute a1) throws Throwable;
private static native moom.vB __sourceUninitializedNEW666_110() throws Throwable;
private static native java.util.Random __fieldRead666_112(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native double __call666_113(java.util.Random a0) throws Throwable;
private static native void __explicitNewInit666_114(moom.vB a0, java.lang.String a1, double a2, int a3) throws Throwable;
private static native void __call666_115(net.minecraft.entity.ai.attributes.IAttributeInstance a0, moom.vB a1) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttribute __fieldRead666_116() throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call666_117(net.minecraft.entity.monster.EntityZombie a0, net.minecraft.entity.ai.attributes.IAttribute a1) throws Throwable;
private static native moom.vB __sourceUninitializedNEW666_118() throws Throwable;
private static native java.util.Random __fieldRead666_120(net.minecraft.entity.monster.EntityZombie a0) throws Throwable;
private static native double __call666_121(java.util.Random a0) throws Throwable;
private static native void __explicitNewInit666_122(moom.vB a0, java.lang.String a1, double a2, int a3) throws Throwable;
private static native void __call666_123(net.minecraft.entity.ai.attributes.IAttributeInstance a0, moom.vB a1) throws Throwable;
private static native void __call666_124(net.minecraft.entity.monster.EntityZombie a0, int a1) throws Throwable;

}


protected java.lang.String i__String() {
return "mob.zombie.say";
}


public boolean ad() {
int forwardValue5209_19_0;
    int forwardValue5209_21_0;
    byte spill5209_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 72644841053296L);
    life3_5 = moom.vN.b();
    spill5209_0 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.monster.EntityZombie)(this)).a__r1())).a(((int)(__sourceIntrinsic_e0a402d4f733_invokedynamic5209_3(1323, (6330258384202513946L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5209_19_0 = ((int)(spill5209_0));
        break forward_join_19;
    }
    if (!((spill5209_0 == 1))) {
        break forward_join_20;
    }
    forwardValue5209_19_0 = 1;
    }
    forwardValue5209_21_0 = forwardValue5209_19_0;
    break forward_join_21;
    }
    forwardValue5209_21_0 = 0;
    }
    return ((forwardValue5209_21_0) != 0);
}


public float e__Float() {
long local1 = (net.minecraft.entity.monster.EntityZombie.jb ^ 8484937134974L);
    float local3 = 0x1.bd70a4p0f;
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityZombie)(this)).c__Boolean()) != 0)) {
        local3 = ((float) (((double) local3) - 0x1.9eb851eb851ecp-1d));
    }
    return local3;
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_1d07b9dbc014ec(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11517_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14633;
      if (yb[var3] == null) {
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
         long var5 = xb[var3];
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
         Object[] var9 = (Object[])zb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               zb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         yb[var3] = var15;
      }

      return yb[var3];
}


public boolean ae() {
int forwardValue5210_19_0;
    int forwardValue5210_21_0;
    byte spill5210_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 128102668369935L);
    life3_5 = moom.vN.b();
    spill5210_0 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.monster.EntityZombie)(this)).a__r1())).a(((int)(__sourceIntrinsic_a627c59d8423_invokedynamic5210_3(562, (2716767930154853738L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5210_19_0 = ((int)(spill5210_0));
        break forward_join_19;
    }
    if (!((spill5210_0 == 1))) {
        break forward_join_20;
    }
    forwardValue5210_19_0 = 1;
    }
    forwardValue5210_21_0 = forwardValue5210_19_0;
    break forward_join_21;
    }
    forwardValue5210_21_0 = 0;
    }
    return ((forwardValue5210_21_0) != 0);
}


protected int s() {
int forestValue1114_34_0;
    int forestValue1114_34_1;
    int forestValue1114_58_0;
    int forestValue1114_58_1;
    int forestValue1114_74_0;
    int forestValue1114_74_1;
    net.minecraft.block.Block forestValue1114_109_0;
    net.minecraft.block.Block forestValue1114_109_1;
    int forestValue1114_128_0;
    net.minecraft.entity.Entity[] spill1114_0;
    int spill1114_1;
    int spill1114_2;
    int spill1114_3;
    int spill1114_4;
    int spill1114_5;
    int spill1114_6;
    net.minecraft.block.Block spill1114_7;
    net.minecraft.block.Block spill1114_8;
    long life1_3;
    int life4_6;
    net.minecraft.entity.Entity[] life3_7;
    int life5_18;
    moom.DU life6_22;
    int life7_28;
    int life8_54;
    int life9_80;
    net.minecraft.block.Block life10_106;
    forest_join_128: {
    forest_join_127: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 57243395958454L);
    spill1114_0 = moom.vN.b();
    life4_6 = 1;
    life3_7 = spill1114_0;
    spill1114_1 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.47ae14p-7f)));
    if (!((life3_7 == null))) {
        forestValue1114_128_0 = spill1114_1;
        break forest_join_128;
    }
    if (!((spill1114_1 < 0))) {
        break forest_join_127;
    }
    life5_18 = 0;
    life6_22 = new moom.DU();
    life7_28 = (((int) this.n) - 4);
    forest_cycle_28: while (true) {
    forest_join_124: {
    forestValue1114_34_0 = life7_28;
    forestValue1114_34_1 = (((int) this.n) + 4);
    forest_cycle_34: while (true) {
    if (!((forestValue1114_34_0 < forestValue1114_34_1))) {
        break forest_join_127;
    }
    spill1114_2 = life5_18;
    if (!((life3_7 == null))) {
        forestValue1114_128_0 = spill1114_2;
        break forest_join_128;
    }
    if (!((life3_7 == null))) {
        forestValue1114_128_0 = spill1114_2;
        break forest_join_128;
    }
    if (!((spill1114_2 < __sourceIntrinsic_421c707d57eb_invokedynamic1114_7(17767, (7032346233744245888L ^ life1_3))))) {
        break forest_join_127;
    }
    life8_54 = (((int) this.o) - 4);
    forest_cycle_52: while (true) {
    forest_join_121: {
    forestValue1114_58_0 = life8_54;
    forestValue1114_58_1 = (((int) this.o) + 4);
    forest_cycle_58: while (true) {
    forest_join_74: {
    if (!((forestValue1114_58_0 < forestValue1114_58_1))) {
        break forest_join_124;
    }
    spill1114_3 = life5_18;
    spill1114_4 = __sourceIntrinsic_421c707d57eb_invokedynamic1114_10(17767, (7032346233744245888L ^ life1_3));
    if (!((life3_7 == null))) {
        forestValue1114_34_0 = spill1114_3;
        forestValue1114_34_1 = spill1114_4;
        continue forest_cycle_34;
    }
    if (!((life3_7 == null))) {
        forestValue1114_74_0 = spill1114_3;
        forestValue1114_74_1 = spill1114_4;
        break forest_join_74;
    }
    if (!((spill1114_3 < spill1114_4))) {
        break forest_join_124;
    }
    forestValue1114_74_0 = ((int) this.p);
    forestValue1114_74_1 = 4;
    }
    life9_80 = (forestValue1114_74_0 - forestValue1114_74_1);
    forest_cycle_76: while (true) {
    forest_join_118: {
    forest_join_117: {
    forest_join_110: {
    forest_join_109: {
    if (!((life9_80 < (((int) this.p) + 4)))) {
        break forest_join_121;
    }
    spill1114_5 = life5_18;
    spill1114_6 = __sourceIntrinsic_421c707d57eb_invokedynamic1114_13(17767, (7032346233744245888L ^ life1_3));
    if (!((life3_7 == null))) {
        forestValue1114_58_0 = spill1114_5;
        forestValue1114_58_1 = spill1114_6;
        continue forest_cycle_58;
    }
    if (!((spill1114_5 < spill1114_6))) {
        break forest_join_121;
    }
    life10_106 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(((moom.DU)(life6_22)).a(((int)(life7_28)), ((int)(life8_54)), ((int)(life9_80)))))))).a__ch();
    spill1114_7 = life10_106;
    spill1114_8 = net.minecraft.init.Blocks.a8;
    if (!((life3_7 == null))) {
        forestValue1114_109_0 = spill1114_7;
        forestValue1114_109_1 = spill1114_8;
        break forest_join_109;
    }
    if (!((spill1114_7 != spill1114_8))) {
        break forest_join_110;
    }
    forestValue1114_109_0 = life10_106;
    forestValue1114_109_1 = net.minecraft.init.Blocks.C;
    }
    if (!((forestValue1114_109_0 == forestValue1114_109_1))) {
        break forest_join_118;
    }
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.333334p-2f))) < 0))) {
        break forest_join_117;
    }
    life4_6 += 1;
    }
    life5_18 += 1;
    }
    life9_80 += 1;
    if (!((life3_7 != null))) {
        continue forest_cycle_76;
    }
    break forest_cycle_76;
    }
    break forest_cycle_58;
    }
    }
    life8_54 += 1;
    if (!((life3_7 != null))) {
        continue forest_cycle_52;
    }
    break forest_cycle_52;
    }
    break forest_cycle_34;
    }
    }
    life7_28 += 1;
    if (!((life3_7 != null))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    }
    forestValue1114_128_0 = life4_6;
    }
    return forestValue1114_128_0;
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
int forwardValue5211_46_0;
    net.minecraft.entity.Entity[] spill5211_0;
    int spill5211_1;
    int spill5211_2;
    boolean spill5211_3;
    int spill5211_4;
    long life2_3;
    int life5_8;
    net.minecraft.entity.Entity[] life4_9;
    int life6_26;
    forward_join_46: {
    forward_join_45: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 44364957844635L);
    spill5211_0 = moom.vN.b();
    life5_8 = ((super.c__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(p0)))) ? 1 : 0);
    life4_9 = spill5211_0;
    spill5211_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue5211_46_0 = spill5211_1;
        break forward_join_46;
    }
    if (!((spill5211_1 != 0))) {
        break forward_join_45;
    }
    spill5211_2 = ((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.World)(this.i)).a__bB())).a();
    if (!((life4_9 == null))) {
        forwardValue5211_46_0 = spill5211_2;
        break forward_join_46;
    }
    life6_26 = spill5211_2;
    if (!((((net.minecraft.entity.monster.EntityZombie)(this)).a__xW() == null))) {
        break forward_join_45;
    }
    spill5211_3 = ((net.minecraft.entity.monster.EntityZombie)(this)).r__Boolean();
    if (!((life4_9 == null))) {
        forwardValue5211_46_0 = ((spill5211_3) ? 1 : 0);
        break forward_join_46;
    }
    if (!(spill5211_3)) {
        break forward_join_45;
    }
    spill5211_4 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)((((float) life6_26) * 0x1.333334p-2f))));
    if (!((life4_9 == null))) {
        forwardValue5211_46_0 = spill5211_4;
        break forward_join_46;
    }
    if (!((spill5211_4 < 0))) {
        break forward_join_45;
    }
    ((net.minecraft.entity.Entity)(p0)).b(((int)((2 * life6_26))));
    }
    forwardValue5211_46_0 = life5_8;
    }
    return ((forwardValue5211_46_0) != 0);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5212_21_0;
    int forwardValue5212_35_0;
    int forwardValue5212_41_0;
    net.minecraft.entity.Entity[] spill5212_0;
    boolean spill5212_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_48: {
    forward_join_41: {
    forward_join_35: {
    forward_join_27: {
    forward_join_21: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 133417483526384L);
    spill5212_0 = moom.vN.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5212_0;
    spill5212_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("IsBaby")));
    if (!((life4_8 == null))) {
        forwardValue5212_21_0 = ((spill5212_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill5212_1)) {
        break forward_join_18;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).m(((boolean)(true)));
    }
    forwardValue5212_21_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("IsVillager")))) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue5212_35_0 = forwardValue5212_21_0;
        break forward_join_35;
    }
    if (!((forwardValue5212_21_0 != 0))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).n(((boolean)(true)));
    }
    forwardValue5212_35_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ConversionTime")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5212_9(31520, (4722869784478792862L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue5212_41_0 = forwardValue5212_35_0;
        break forward_join_41;
    }
    if (!((forwardValue5212_35_0 != 0))) {
        break forward_join_48;
    }
    forwardValue5212_41_0 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("ConversionTime")));
    }
    if (!((forwardValue5212_41_0 > -1))) {
        break forward_join_48;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).l(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("ConversionTime"))))));
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).l(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("CanBreakDoors"))))));
    return;
}


public boolean c__Boolean() {
int forwardValue5213_19_0;
    int forwardValue5213_21_0;
    byte spill5213_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 51989183668267L);
    life3_5 = moom.vN.b();
    spill5213_0 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.monster.EntityZombie)(this)).a__r1())).a(((int)(__sourceIntrinsic_4c21d9cede27_invokedynamic5213_3(2193, (3517392456600752119L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5213_19_0 = ((int)(spill5213_0));
        break forward_join_19;
    }
    if (!((spill5213_0 == 1))) {
        break forward_join_20;
    }
    forwardValue5213_19_0 = 1;
    }
    forwardValue5213_21_0 = forwardValue5213_19_0;
    break forward_join_21;
    }
    forwardValue5213_21_0 = 0;
    }
    return ((forwardValue5213_21_0) != 0);
}


protected java.lang.String c__String() {
return "mob.zombie.hurt";
}


public void n(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue5219_18_0;
    int forwardValue5219_18_1;
    int forwardValue5219_18_2;
    net.minecraft.entity.DataWatcher forwardValue5219_19_0;
    int forwardValue5219_19_1;
    net.minecraft.entity.DataWatcher forwardValue5219_20_0;
    int forwardValue5219_20_1;
    int forwardValue5219_20_2;
    net.minecraft.entity.DataWatcher spill5219_0;
    int spill5219_1;
    boolean spill5219_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 10788134329656L);
    life4_5 = moom.vN.b();
    spill5219_0 = ((net.minecraft.entity.monster.EntityZombie)(this)).a__r1();
    spill5219_1 = __sourceIntrinsic_1b79f0ed2644_invokedynamic5219_3(26593, (4533900786881584530L ^ life2_3));
    spill5219_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue5219_18_0 = spill5219_0;
        forwardValue5219_18_1 = spill5219_1;
        forwardValue5219_18_2 = ((spill5219_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5219_2)) {
        forwardValue5219_19_0 = spill5219_0;
        forwardValue5219_19_1 = spill5219_1;
        break forward_join_19;
    }
    forwardValue5219_18_0 = spill5219_0;
    forwardValue5219_18_1 = spill5219_1;
    forwardValue5219_18_2 = 1;
    }
    forwardValue5219_20_0 = forwardValue5219_18_0;
    forwardValue5219_20_1 = forwardValue5219_18_1;
    forwardValue5219_20_2 = forwardValue5219_18_2;
    break forward_join_20;
    }
    forwardValue5219_20_0 = forwardValue5219_19_0;
    forwardValue5219_20_1 = forwardValue5219_19_1;
    forwardValue5219_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue5219_20_0)).b(((int)(forwardValue5219_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue5219_20_2)))))));
    return;
}


protected java.lang.String h__String() {
return "mob.zombie.death";
}


protected void l(int p0) {
long local2 = (net.minecraft.entity.monster.EntityZombie.jb ^ 64770669433833L);
    this.b9 = ((int)(p0));
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.monster.EntityZombie)(this)).a__r1())).b(((int)(__sourceIntrinsic_3c5642f51658_originalDynamicSite1956_3(17767, (7032343722852856287L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(1))))));
    ((net.minecraft.entity.monster.EntityZombie)(this)).h(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.u)).I)));
    ((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.h)).I, p0, java.lang.Math.min(((int)((((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.World)(this.i)).a__bB())).a() - 1))), ((int)(0)))))));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_3c5642f51658_originalDynamicSite1956_17(14677, (4267673161427144181L ^ local2)))));
    return;
}


public void l(boolean p0) {
int forwardValue5217_18_0;
    net.minecraft.entity.monster.EntityZombie forwardValue5217_28_0;
    boolean spill5217_0;
    net.minecraft.entity.monster.EntityZombie spill5217_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_32: {
    forward_join_28: {
    forward_join_27: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 119269651578308L);
    life4_5 = moom.vN.b();
    spill5217_0 = this.b_;
    if (!((life4_5 == null))) {
        forwardValue5217_18_0 = ((spill5217_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((spill5217_0 != p0))) {
        break forward_join_32;
    }
    spill5217_1 = this;
    if (!((life4_5 == null))) {
        forwardValue5217_28_0 = spill5217_1;
        break forward_join_28;
    }
    ((net.minecraft.entity.monster.EntityZombie)(spill5217_1)).b_ = ((boolean)(p0));
    forwardValue5217_18_0 = ((p0) ? 1 : 0);
    }
    if (!((forwardValue5217_18_0 != 0))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(1)), ((moom.uc)(this.b8)));
    if (!((life4_5 != null))) {
        break forward_join_32;
    }
    }
    forwardValue5217_28_0 = this;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityZombie)(forwardValue5217_28_0)).bJ)).a(((moom.uc)(this.b8)));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5214_20_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5214_34_0;
    java.lang.String forwardValue5214_34_1;
    int forwardValue5214_34_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5214_35_0;
    java.lang.String forwardValue5214_35_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5214_36_0;
    java.lang.String forwardValue5214_36_1;
    int forwardValue5214_36_2;
    net.minecraft.entity.Entity[] spill5214_0;
    boolean spill5214_1;
    net.minecraft.nbt.NBTTagCompound spill5214_2;
    java.lang.String spill5214_3;
    boolean spill5214_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 74987240782843L);
    spill5214_0 = moom.vN.b();
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5214_0;
    spill5214_1 = ((net.minecraft.entity.monster.EntityZombie)(this)).c__Boolean();
    if (!((life4_8 == null))) {
        forwardValue5214_20_0 = ((spill5214_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill5214_1)) {
        break forward_join_18;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("IsBaby")), ((boolean)(true)));
    }
    forwardValue5214_20_0 = ((((net.minecraft.entity.monster.EntityZombie)(this)).ad()) ? 1 : 0);
    }
    if (!((forwardValue5214_20_0 != 0))) {
        break forward_join_25;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("IsVillager")), ((boolean)(true)));
    }
    spill5214_2 = p0;
    spill5214_3 = "ConversionTime";
    spill5214_4 = ((net.minecraft.entity.monster.EntityZombie)(this)).ae();
    if (!((life4_8 == null))) {
        forwardValue5214_34_0 = spill5214_2;
        forwardValue5214_34_1 = spill5214_3;
        forwardValue5214_34_2 = ((spill5214_4) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill5214_4)) {
        forwardValue5214_35_0 = spill5214_2;
        forwardValue5214_35_1 = spill5214_3;
        break forward_join_35;
    }
    forwardValue5214_34_0 = spill5214_2;
    forwardValue5214_34_1 = spill5214_3;
    forwardValue5214_34_2 = this.b9;
    }
    forwardValue5214_36_0 = forwardValue5214_34_0;
    forwardValue5214_36_1 = forwardValue5214_34_1;
    forwardValue5214_36_2 = forwardValue5214_34_2;
    break forward_join_36;
    }
    forwardValue5214_36_0 = forwardValue5214_35_0;
    forwardValue5214_36_1 = forwardValue5214_35_1;
    forwardValue5214_36_2 = -1;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5214_36_0)).a__Void(((java.lang.String)(forwardValue5214_36_1)), ((int)(forwardValue5214_36_2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CanBreakDoors")), ((boolean)(((net.minecraft.entity.monster.EntityZombie)(this)).ac())));
    return;
}


public double d__sourceReturn_fedcb3e4d3() {
long local1 = (net.minecraft.entity.monster.EntityZombie.jb ^ 34637860477433L);
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityZombie)(this)).c__Boolean()) != 0) ? 0x0.0p0d : -0x1.6666666666666p-2d);
}


public int d__Int() {
int forwardValue5215_27_0;
    net.minecraft.entity.Entity[] spill5215_0;
    int spill5215_1;
    long life1_3;
    int life4_9;
    net.minecraft.entity.Entity[] life3_10;
    forward_join_27: {
    forward_join_26: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 122597009594729L);
    spill5215_0 = moom.vN.b();
    life4_9 = (super.d__Int() + 2);
    life3_10 = spill5215_0;
    spill5215_1 = life4_9;
    if (!((life3_10 == null))) {
        forwardValue5215_27_0 = spill5215_1;
        break forward_join_27;
    }
    if (!((spill5215_1 > __sourceIntrinsic_c8a36ae237a7_invokedynamic5215_3(15823, (3944001511925253089L ^ life1_3))))) {
        break forward_join_26;
    }
    life4_9 = __sourceIntrinsic_c8a36ae237a7_invokedynamic5215_4(7421, (360152312240546513L ^ life1_3));
    }
    forwardValue5215_27_0 = life4_9;
    }
    return forwardValue5215_27_0;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntityZombie.jb ^ 14690113789091L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.monster.EntityZombie)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1957_3(7870, (6079474356600939854L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.monster.EntityZombie)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1957_7(1323, (6330327402470031049L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.monster.EntityZombie)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1957_11(17767, (7032319071109152405L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue5205_14_0;
    net.minecraft.item.ItemStack forwardValue5205_20_0;
    int forwardValue5205_49_0;
    int forwardValue5205_62_0;
    int forwardValue5205_82_0;
    int forwardValue5205_84_0;
    net.minecraft.entity.Entity[] spill5205_0;
    net.minecraft.item.ItemStack spill5205_1;
    int spill5205_2;
    boolean spill5205_3;
    boolean spill5205_4;
    boolean spill5205_5;
    long life2_3;
    net.minecraft.item.ItemStack life5_7;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_84: {
    forward_join_83: {
    forward_join_82: {
    forward_join_81: {
    forward_join_62: {
    forward_join_59: {
    forward_join_49: {
    forward_join_47: {
    forward_join_20: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 99587207736904L);
    spill5205_0 = moom.vN.b();
    life5_7 = ((net.minecraft.entity.player.EntityPlayer)(p0)).c__xW();
    life4_8 = spill5205_0;
    spill5205_1 = life5_7;
    if (!((life4_8 == null))) {
        forwardValue5205_14_0 = spill5205_1;
        break forward_join_14;
    }
    if (!((spill5205_1 != null))) {
        break forward_join_83;
    }
    forwardValue5205_14_0 = life5_7;
    }
    if (!((life4_8 == null))) {
        forwardValue5205_20_0 = forwardValue5205_14_0;
        break forward_join_20;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5205_14_0)).a__wQ() == net.minecraft.init.Items.ao))) {
        break forward_join_83;
    }
    forwardValue5205_20_0 = life5_7;
    }
    spill5205_2 = ((net.minecraft.item.ItemStack)(forwardValue5205_20_0)).c();
    if (!((life4_8 == null))) {
        forwardValue5205_84_0 = spill5205_2;
        break forward_join_84;
    }
    if (!((spill5205_2 == 0))) {
        break forward_join_83;
    }
    spill5205_3 = ((net.minecraft.entity.monster.EntityZombie)(this)).ad();
    if (!((life4_8 == null))) {
        forwardValue5205_84_0 = ((spill5205_3) ? 1 : 0);
        break forward_join_84;
    }
    if (!(spill5205_3)) {
        break forward_join_83;
    }
    spill5205_4 = ((net.minecraft.entity.monster.EntityZombie)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.u)));
    if (!((life4_8 == null))) {
        forwardValue5205_84_0 = ((spill5205_4) ? 1 : 0);
        break forward_join_84;
    }
    if (!(spill5205_4)) {
        break forward_join_83;
    }
    spill5205_5 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_8 == null))) {
        forwardValue5205_49_0 = ((spill5205_5) ? 1 : 0);
        break forward_join_49;
    }
    if (!((!spill5205_5))) {
        break forward_join_47;
    }
    net.minecraft.item.ItemStack __stackOp5205_14_0 = life5_7;
    ((net.minecraft.item.ItemStack)(__stackOp5205_14_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5205_14_0)).b - 1)));
    }
    forwardValue5205_49_0 = ((net.minecraft.item.ItemStack)(life5_7)).b;
    }
    if (!((life4_8 == null))) {
        forwardValue5205_62_0 = forwardValue5205_49_0;
        break forward_join_62;
    }
    if (!((forwardValue5205_49_0 <= 0))) {
        break forward_join_59;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5205_62_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue5205_82_0 = forwardValue5205_62_0;
        break forward_join_82;
    }
    if (!((forwardValue5205_62_0 == 0))) {
        break forward_join_81;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).l(((int)((((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_d6a7991b4c91_invokedynamic5205_26(30573, (1286432124184395386L ^ life2_3))))) + __sourceIntrinsic_d6a7991b4c91_invokedynamic5205_28(18862, (3962216678088327333L ^ life2_3))))));
    }
    forwardValue5205_82_0 = 1;
    }
    return ((forwardValue5205_82_0) != 0);
    }
    forwardValue5205_84_0 = 0;
    }
    return ((forwardValue5205_84_0) != 0);
}


public void a(byte p0) {
int forwardValue5199_19_0;
    net.minecraft.entity.monster.EntityZombie forwardValue5199_21_0;
    byte spill5199_0;
    net.minecraft.entity.monster.EntityZombie spill5199_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_54: {
    forward_join_51: {
    forward_join_21: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 117665724298401L);
    life4_5 = moom.vN.b();
    spill5199_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue5199_19_0 = ((int)(spill5199_0));
        break forward_join_19;
    }
    if (!((spill5199_0 == __sourceIntrinsic_6121ff5511c4_invokedynamic5199_3(9066, (1659116821685858457L ^ life2_3))))) {
        break forward_join_51;
    }
    spill5199_1 = this;
    if (!((life4_5 == null))) {
        forwardValue5199_21_0 = spill5199_1;
        break forward_join_21;
    }
    forwardValue5199_19_0 = ((((net.minecraft.entity.monster.EntityZombie)(spill5199_1)).f__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5199_19_0 == 0))) {
        break forward_join_54;
    }
    forwardValue5199_21_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityZombie)(forwardValue5199_21_0)).i)).a(((double)((this.n + 0x1.0p-1d))), ((double)((this.o + 0x1.0p-1d))), ((double)((this.p + 0x1.0p-1d))), ((java.lang.String)("mob.zombie.remedy")), ((float)((0x1.0p0f + ((java.util.Random)(this.ah)).nextFloat()))), ((float)(((((java.util.Random)(this.ah)).nextFloat() * 0x1.666666p-1f) + 0x1.333334p-2f))), ((boolean)(false)));
    if (!((life4_5 != null))) {
        break forward_join_54;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) { return __sourceHandlerCall_69fd08559e327e59ee7a(this, p0, p1); }


protected void a(moom.Eh p0) {
float forwardValue5200_19_0;
    float forwardValue5200_20_0;
    float forwardValue5200_20_1;
    int forwardValue5200_28_0;
    net.minecraft.entity.Entity[] spill5200_0;
    float spill5200_1;
    int spill5200_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    int life5_36;
    forward_join_49: {
    forward_join_42: {
    forward_join_40: {
    forward_join_28: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 119398906153575L);
    spill5200_0 = moom.vN.b();
    super.a(((moom.Eh)(p0)));
    life4_8 = spill5200_0;
    spill5200_1 = ((java.util.Random)(this.ah)).nextFloat();
    if (!((((net.minecraft.world.World)(this.i)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {
        forwardValue5200_19_0 = spill5200_1;
        break forward_join_19;
    }
    forwardValue5200_20_0 = spill5200_1;
    forwardValue5200_20_1 = 0x1.99999ap-5f;
    break forward_join_20;
    }
    forwardValue5200_20_0 = forwardValue5200_19_0;
    forwardValue5200_20_1 = 0x1.47ae14p-7f;
    }
    spill5200_2 = recovery.source.CarrierOps.fcmpg(((float)(forwardValue5200_20_0)), ((float)(forwardValue5200_20_1)));
    if (!((life4_8 == null))) {
        forwardValue5200_28_0 = spill5200_2;
        break forward_join_28;
    }
    if (!((spill5200_2 < 0))) {
        break forward_join_49;
    }
    forwardValue5200_28_0 = ((java.util.Random)(this.ah)).nextInt(((int)(3)));
    }
    life5_36 = forwardValue5200_28_0;
    if (!((life4_8 == null))) {
        break forward_join_40;
    }
    if (!((life5_36 == 0))) {
        break forward_join_42;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).b(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.l))));
    }
    if (!((life4_8 != null))) {
        break forward_join_49;
    }
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).b(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.a))));
    }
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((double)(0x1.18p5d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.d70a3ep-3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.8p1d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.monster.EntityZombie)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.monster.EntityZombie.b5))))).a(((double)((((java.util.Random)(this.ah)).nextDouble() * 0x1.99999ap-4d))));
    return;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
int forwardValue5204_17_0;
    int forwardValue5204_24_0;
    int forwardValue5204_33_0;
    net.minecraft.entity.monster.EntityCreeper forwardValue5204_37_0;
    net.minecraft.entity.Entity[] spill5204_0;
    int spill5204_1;
    net.minecraft.entity.monster.EntityCreeper spill5204_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_48: {
    forward_join_37: {
    forward_join_33: {
    forward_join_24: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 103399871938955L);
    spill5204_0 = moom.vN.b();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill5204_0;
    spill5204_1 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.monster.EntityCreeper) ? 1 : 0);
    if (!((life4_8 == null))) {
        forwardValue5204_17_0 = spill5204_1;
        break forward_join_17;
    }
    if (!((spill5204_1 != 0))) {
        break forward_join_48;
    }
    forwardValue5204_17_0 = ((this instanceof net.minecraft.entity.monster.EntityPigZombie) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue5204_24_0 = forwardValue5204_17_0;
        break forward_join_24;
    }
    if (!((forwardValue5204_17_0 == 0))) {
        break forward_join_48;
    }
    forwardValue5204_24_0 = ((((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.util.DamageSource)(p0)).b__r3())))).ac()) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue5204_33_0 = forwardValue5204_24_0;
        break forward_join_33;
    }
    if (!((forwardValue5204_24_0 != 0))) {
        break forward_join_48;
    }
    spill5204_2 = ((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.util.DamageSource)(p0)).b__r3()));
    if (!((life4_8 == null))) {
        forwardValue5204_37_0 = spill5204_2;
        break forward_join_37;
    }
    forwardValue5204_33_0 = ((((net.minecraft.entity.monster.EntityCreeper)(spill5204_2)).ae()) ? 1 : 0);
    }
    if (!((forwardValue5204_33_0 != 0))) {
        break forward_join_48;
    }
    forwardValue5204_37_0 = ((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.util.DamageSource)(p0)).b__r3()));
    }
    ((net.minecraft.entity.monster.EntityCreeper)(forwardValue5204_37_0)).Z__sourceReturn_da8c82d5d4();
    ((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bM, 1, 2))), ((float)(0x0.0p0f)));
    }
    return;
}


protected final void a__Void(float p0, float p1) {
int forwardValue5208_17_0;
    int forwardValue5208_21_0;
    int forwardValue5208_23_0;
    net.minecraft.entity.monster.EntityZombie forwardValue5208_36_0;
    float forwardValue5208_36_1;
    int spill5208_0;
    net.minecraft.entity.monster.EntityZombie spill5208_1;
    float spill5208_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_32;
    forward_join_37: {
    forward_join_36: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 29630090154234L);
    life5_5 = moom.vN.b();
    spill5208_0 = recovery.source.CarrierOps.fcmpl(((float)(this.ca)), ((float)(0x0.0p0f)));
    if (!((life5_5 == null))) {
        forwardValue5208_17_0 = spill5208_0;
        break forward_join_17;
    }
    if (!((spill5208_0 > 0))) {
        break forward_join_22;
    }
    forwardValue5208_17_0 = recovery.source.CarrierOps.fcmpl(((float)(this.cb)), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 == null))) {
        forwardValue5208_21_0 = forwardValue5208_17_0;
        break forward_join_21;
    }
    if (!((forwardValue5208_17_0 > 0))) {
        break forward_join_22;
    }
    forwardValue5208_21_0 = 1;
    }
    forwardValue5208_23_0 = forwardValue5208_21_0;
    break forward_join_23;
    }
    forwardValue5208_23_0 = 0;
    }
    life6_32 = forwardValue5208_23_0;
    this.ca = ((float)(p0));
    spill5208_1 = this;
    spill5208_2 = p1;
    if (!((life5_5 == null))) {
        forwardValue5208_36_0 = spill5208_1;
        forwardValue5208_36_1 = spill5208_2;
        break forward_join_36;
    }
    ((net.minecraft.entity.monster.EntityZombie)(spill5208_1)).cb = ((float)(spill5208_2));
    if (!((life6_32 == 0))) {
        break forward_join_37;
    }
    forwardValue5208_36_0 = this;
    forwardValue5208_36_1 = 0x1.0p0f;
    }
    ((net.minecraft.entity.monster.EntityZombie)(forwardValue5208_36_0)).j(((float)(forwardValue5208_36_1)));
    }
    return;
}


public net.minecraft.entity.EnumCreatureAttribute a__aR() {
return net.minecraft.entity.EnumCreatureAttribute.UNDEAD;
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.bi;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.monster.EntityZombie)(this)).a(((java.lang.String)("mob.zombie.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.Entity lexicalValue1593_28_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1593_31_0;
    net.minecraft.entity.monster.EntityZombie lexicalValue1593_40_0;
    int lexicalValue1593_197_0;
    int lexicalValue1593_214_0;
    int lexicalValue1593_222_0;
    int lexicalValue1593_229_0;
    int lexicalValue1593_270_0;
    int lexicalValue1593_272_0;
    boolean spill1593_0;
    net.minecraft.entity.EntityLivingBase spill1593_1;
    net.minecraft.entity.Entity spill1593_2;
    net.minecraft.entity.monster.EntityZombie spill1593_3;
    int spill1593_4;
    boolean spill1593_5;
    int spill1593_6;
    boolean spill1593_7;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.EntityLivingBase life6_18;
    int life7_81;
    int life8_85;
    int life9_89;
    net.minecraft.entity.monster.EntityZombie life10_95;
    int life11_97;
    int life12_126;
    int life13_148;
    int life14_170;
    lexical_join_272: {
    lexical_join_271: {
    lexical_join_270: {
    lexical_join_269: {
    lexical_join_40: {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_28: {
    life3_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 33671782654066L);
    life5_5 = moom.vN.b();
    spill1593_0 = super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
    if (!((life5_5 == null))) {
        lexicalValue1593_272_0 = ((spill1593_0) ? 1 : 0);
        break lexical_join_272;
    }
    if (!(spill1593_0)) {
        break lexical_join_271;
    }
    life6_18 = ((net.minecraft.entity.monster.EntityZombie)(this)).d__sourceReturn_d30556f370();
    spill1593_1 = life6_18;
    if (!((life5_5 == null))) {
        lexicalValue1593_31_0 = spill1593_1;
        break lexical_join_31;
    }
    if (!((spill1593_1 == null))) {
        break lexical_join_30;
    }
    spill1593_2 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    if (!((life5_5 == null))) {
        lexicalValue1593_28_0 = spill1593_2;
        break lexical_join_28;
    }
    if (!((((spill1593_2 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break lexical_join_30;
    }
    lexicalValue1593_28_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    life6_18 = ((net.minecraft.entity.EntityLivingBase)(lexicalValue1593_28_0));
    }
    lexicalValue1593_31_0 = life6_18;
    }
    if (!((lexicalValue1593_31_0 != null))) {
        break lexical_join_269;
    }
    spill1593_3 = this;
    if (!((life5_5 == null))) {
        lexicalValue1593_40_0 = spill1593_3;
        break lexical_join_40;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityZombie)(spill1593_3)).i)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {
        break lexical_join_269;
    }
    lexicalValue1593_40_0 = this;
    }
    spill1593_4 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((java.util.Random)(((net.minecraft.entity.monster.EntityZombie)(lexicalValue1593_40_0)).ah)).nextFloat()))), ((double)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.monster.EntityZombie.b5))))).b())));
    if (!((life5_5 == null))) {
        lexicalValue1593_270_0 = spill1593_4;
        break lexical_join_270;
    }
    if (!((spill1593_4 < 0))) {
        break lexical_join_269;
    }
    life7_81 = moom.Dr.b__Int(((double)(this.n)));
    life8_85 = moom.Dr.b__Int(((double)(this.o)));
    life9_89 = moom.Dr.b__Int(((double)(this.p)));
    life10_95 = new net.minecraft.entity.monster.EntityZombie(this.i);
    life11_97 = 0;
    lexical_cycle_71: while (true) {
    lexical_join_267: {
    lexical_join_266: {
    lexical_join_229: {
    lexical_join_222: {
    lexical_join_214: {
    lexical_join_197: {
    if (!((life11_97 < __sourceIntrinsic_153a193fc182_invokedynamic1593_25(6119, (5492929884705607895L ^ life3_3))))) {
        break lexical_join_269;
    }
    life12_126 = (life7_81 + (moom.Dr.a(((java.util.Random)(this.ah)), ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1593_27(29805, (2265651451855057737L ^ life3_3)))), ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1593_28(26617, (9181663612714328260L ^ life3_3))))) * moom.Dr.a(((java.util.Random)(this.ah)), ((int)(-1)), ((int)(1)))));
    life13_148 = (life8_85 + (moom.Dr.a(((java.util.Random)(this.ah)), ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1593_33(29805, (2265651451855057737L ^ life3_3)))), ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1593_34(17034, (6761747144492156332L ^ life3_3))))) * moom.Dr.a(((java.util.Random)(this.ah)), ((int)(-1)), ((int)(1)))));
    life14_170 = (life9_89 + (moom.Dr.a(((java.util.Random)(this.ah)), ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1593_39(29805, (2265651451855057737L ^ life3_3)))), ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1593_40(17034, (6761747144492156332L ^ life3_3))))) * moom.Dr.a(((java.util.Random)(this.ah)), ((int)(-1)), ((int)(1)))));
    if (!((life5_5 == null))) {
        break lexical_join_267;
    }
    spill1593_5 = __sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(this.i)), ((moom.DT)(new moom.DT(life12_126, (life13_148 - 1), life14_170))));
    if (!((life5_5 == null))) {
        lexicalValue1593_270_0 = ((spill1593_5) ? 1 : 0);
        break lexical_join_270;
    }
    if (!(spill1593_5)) {
        break lexical_join_266;
    }
    spill1593_6 = ((net.minecraft.world.World)(this.i)).b(((moom.DT)(new moom.DT(life12_126, life13_148, life14_170))));
    if (!((life5_5 == null))) {
        lexicalValue1593_197_0 = spill1593_6;
        break lexical_join_197;
    }
    if (!((spill1593_6 < __sourceIntrinsic_153a193fc182_invokedynamic1593_49(6370, (6980397910661980109L ^ life3_3))))) {
        break lexical_join_266;
    }
    ((net.minecraft.entity.monster.EntityZombie)(life10_95)).a__Void(((double)(((double) life12_126))), ((double)(((double) life13_148))), ((double)(((double) life14_170))));
    if (!((life5_5 == null))) {
        break lexical_join_267;
    }
    lexicalValue1593_197_0 = ((((net.minecraft.world.World)(this.i)).a__Boolean(((double)(((double) life12_126))), ((double)(((double) life13_148))), ((double)(((double) life14_170))), ((double)(0x1.cp2d)))) ? 1 : 0);
    }
    if (!((lexicalValue1593_197_0 == 0))) {
        break lexical_join_266;
    }
    spill1593_7 = ((net.minecraft.world.World)(this.i)).a(((moom.CA)(((net.minecraft.entity.monster.EntityZombie)(life10_95)).b())), ((net.minecraft.entity.Entity)(life10_95)));
    if (!((life5_5 == null))) {
        lexicalValue1593_214_0 = ((spill1593_7) ? 1 : 0);
        break lexical_join_214;
    }
    if (!(spill1593_7)) {
        break lexical_join_266;
    }
    lexicalValue1593_214_0 = ((((java.util.List)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(life10_95)), ((moom.CA)(((net.minecraft.entity.monster.EntityZombie)(life10_95)).b()))))).isEmpty()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        lexicalValue1593_222_0 = lexicalValue1593_214_0;
        break lexical_join_222;
    }
    if (!((lexicalValue1593_214_0 != 0))) {
        break lexical_join_266;
    }
    lexicalValue1593_222_0 = ((((net.minecraft.world.World)(this.i)).c(((moom.CA)(((net.minecraft.entity.monster.EntityZombie)(life10_95)).b())))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        lexicalValue1593_229_0 = lexicalValue1593_222_0;
        break lexical_join_229;
    }
    if (!((lexicalValue1593_222_0 == 0))) {
        break lexical_join_266;
    }
    lexicalValue1593_229_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life10_95)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1593_229_0);
    ((net.minecraft.entity.monster.EntityZombie)(life10_95)).c(((net.minecraft.entity.EntityLivingBase)(life6_18)));
    ((net.minecraft.entity.monster.EntityZombie)(life10_95)).a(((moom.Eh)(((net.minecraft.world.World)(this.i)).a__Eh(((moom.DT)(new moom.DT(life10_95)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.monster.EntityZombie.b5))))).a(((moom.vB)(new moom.vB("Zombie reinforcement caller charge", -0x1.99999ap-5d, 0))));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityZombie)(life10_95)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.monster.EntityZombie.b5))))).a(((moom.vB)(new moom.vB("Zombie reinforcement callee charge", -0x1.99999ap-5d, 0))));
    if (!((life5_5 != null))) {
        break lexical_join_269;
    }
    }
    life11_97 += 1;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_71; }
    break lexical_cycle_71;
    }
    }
    lexicalValue1593_270_0 = 1;
    }
    return ((lexicalValue1593_270_0) != 0);
    }
    lexicalValue1593_272_0 = 0;
    }
    return ((lexicalValue1593_272_0) != 0);
}


protected int a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5203_22_0;
    boolean spill5203_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 127267582389486L);
    life4_5 = moom.vN.b();
    spill5203_0 = ((net.minecraft.entity.monster.EntityZombie)(this)).c__Boolean();
    if (!((life4_5 == null))) {
        forwardValue5203_22_0 = ((spill5203_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5203_0)) {
        break forward_join_19;
    }
    this.bD = ((int)(((int) (((float) this.bD) * 0x1.4p1f))));
    }
    forwardValue5203_22_0 = super.a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    }
    return forwardValue5203_22_0;
}


protected boolean a__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue5206_23_0;
    int forwardValue5206_27_0;
    int forwardValue5206_29_0;
    boolean spill5206_0;
    boolean spill5206_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_23: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 123863819740574L);
    life4_5 = moom.vN.b();
    if (!((((net.minecraft.item.ItemStack)(p0)).a__wQ() == net.minecraft.init.Items.aP))) {
        break forward_join_20;
    }
    spill5206_0 = ((net.minecraft.entity.monster.EntityZombie)(this)).c__Boolean();
    if (!((life4_5 == null))) {
        forwardValue5206_23_0 = ((spill5206_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill5206_0)) {
        break forward_join_20;
    }
    spill5206_1 = ((net.minecraft.entity.monster.EntityZombie)(this)).s__Boolean();
    if (!((life4_5 == null))) {
        forwardValue5206_23_0 = ((spill5206_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!((!spill5206_1))) {
        break forward_join_28;
    }
    }
    forwardValue5206_23_0 = ((super.a__Boolean(((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue5206_27_0 = forwardValue5206_23_0;
        break forward_join_27;
    }
    if (!((forwardValue5206_23_0 != 0))) {
        break forward_join_28;
    }
    forwardValue5206_27_0 = 1;
    }
    forwardValue5206_29_0 = forwardValue5206_27_0;
    break forward_join_29;
    }
    forwardValue5206_29_0 = 0;
    }
    return ((forwardValue5206_29_0) != 0);
}


public void a__sourceReturn_969697899e(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.EntityLivingBase forwardValue5202_24_0;
    net.minecraft.entity.EntityLiving forwardValue5202_42_0;
    int forwardValue5202_84_0;
    int forwardValue5202_99_0;
    net.minecraft.entity.Entity[] spill5202_0;
    net.minecraft.entity.monster.EntityZombie spill5202_1;
    net.minecraft.entity.monster.EntityZombie spill5202_2;
    net.minecraft.entity.monster.EntityZombie spill5202_3;
    net.minecraft.entity.monster.EntityZombie spill5202_4;
    boolean spill5202_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.entity.EntityLiving life5_68;
    net.minecraft.entity.monster.EntityZombie life6_74;
    forward_join_122: {
    forward_join_99: {
    forward_join_95: {
    forward_join_84: {
    forward_join_78: {
    forward_join_42: {
    forward_join_40: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 30978650306392L);
    spill5202_0 = moom.vN.b();
    super.a(((net.minecraft.entity.EntityLivingBase)(p0)));
    life4_8 = spill5202_0;
    spill5202_1 = this;
    if (!((life4_8 == null))) {
        forwardValue5202_24_0 = spill5202_1;
        break forward_join_24;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityZombie)(spill5202_1)).i)).a__bB() != net.minecraft.world.EnumDifficulty.NORMAL))) {
        break forward_join_23;
    }
    spill5202_2 = this;
    if (!((life4_8 == null))) {
        forwardValue5202_24_0 = spill5202_2;
        break forward_join_24;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityZombie)(spill5202_2)).i)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {
        break forward_join_122;
    }
    }
    forwardValue5202_24_0 = p0;
    }
    if (!((((forwardValue5202_24_0 instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0) != 0))) {
        break forward_join_122;
    }
    spill5202_3 = this;
    if (!((life4_8 == null))) {
        forwardValue5202_42_0 = spill5202_3;
        break forward_join_42;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityZombie)(spill5202_3)).i)).a__bB() != net.minecraft.world.EnumDifficulty.HARD))) {
        break forward_join_40;
    }
    spill5202_4 = this;
    if (!((life4_8 == null))) {
        forwardValue5202_42_0 = spill5202_4;
        break forward_join_42;
    }
    if (!(((java.util.Random)(((net.minecraft.entity.monster.EntityZombie)(spill5202_4)).ah)).nextBoolean())) {
        break forward_join_40;
    }
    return;
    }
    forwardValue5202_42_0 = ((net.minecraft.entity.EntityLiving)(p0));
    }
    life5_68 = forwardValue5202_42_0;
    life6_74 = new net.minecraft.entity.monster.EntityZombie(this.i);
    ((net.minecraft.entity.monster.EntityZombie)(life6_74)).c(((net.minecraft.entity.Entity)(p0)));
    ((net.minecraft.world.World)(this.i)).c(((net.minecraft.entity.Entity)(p0)));
    ((net.minecraft.entity.monster.EntityZombie)(life6_74)).a(((moom.Eh)(((net.minecraft.world.World)(this.i)).a__Eh(((moom.DT)(new moom.DT(life6_74)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.entity.monster.EntityZombie)(life6_74)).n(((boolean)(true)));
    spill5202_5 = ((net.minecraft.entity.EntityLivingBase)(p0)).c__Boolean();
    if (!((life4_8 == null))) {
        forwardValue5202_84_0 = ((spill5202_5) ? 1 : 0);
        break forward_join_84;
    }
    if (!(spill5202_5)) {
        break forward_join_78;
    }
    ((net.minecraft.entity.monster.EntityZombie)(life6_74)).m(((boolean)(true)));
    }
    ((net.minecraft.entity.monster.EntityZombie)(life6_74)).j(((boolean)(((net.minecraft.entity.EntityLiving)(life5_68)).U__Boolean())));
    forwardValue5202_84_0 = ((((net.minecraft.entity.EntityLiving)(life5_68)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue5202_99_0 = forwardValue5202_84_0;
        break forward_join_99;
    }
    if (!((forwardValue5202_84_0 != 0))) {
        break forward_join_95;
    }
    ((net.minecraft.entity.monster.EntityZombie)(life6_74)).a(((java.lang.String)(((net.minecraft.entity.EntityLiving)(life5_68)).g__String())));
    ((net.minecraft.entity.monster.EntityZombie)(life6_74)).f(((boolean)(((net.minecraft.entity.EntityLiving)(life5_68)).B())));
    }
    forwardValue5202_99_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life6_74)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5202_99_0);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_d7f7882d6cee_invokedynamic5202_40(8131, (1100643590114463697L ^ life2_3)))), ((moom.DT)(new moom.DT(((int) this.n), ((int) this.o), ((int) this.p)))), ((int)(0)));
    }
    return;
}


public void m(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue5218_18_0;
    int forwardValue5218_18_1;
    int forwardValue5218_18_2;
    net.minecraft.entity.DataWatcher forwardValue5218_19_0;
    int forwardValue5218_19_1;
    net.minecraft.entity.DataWatcher forwardValue5218_20_0;
    int forwardValue5218_20_1;
    int forwardValue5218_20_2;
    net.minecraft.entity.monster.EntityZombie forwardValue5218_49_0;
    net.minecraft.entity.DataWatcher spill5218_0;
    int spill5218_1;
    boolean spill5218_2;
    net.minecraft.entity.monster.EntityZombie spill5218_3;
    net.minecraft.entity.monster.EntityZombie spill5218_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.entity.ai.attributes.IAttributeInstance life5_49;
    forward_join_51: {
    forward_join_49: {
    forward_join_48: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 13805563535166L);
    life4_5 = moom.vN.b();
    spill5218_0 = ((net.minecraft.entity.monster.EntityZombie)(this)).a__r1();
    spill5218_1 = __sourceIntrinsic_65541a581e64_invokedynamic5218_3(2193, (3517427905799221474L ^ life2_3));
    spill5218_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue5218_18_0 = spill5218_0;
        forwardValue5218_18_1 = spill5218_1;
        forwardValue5218_18_2 = ((spill5218_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5218_2)) {
        forwardValue5218_19_0 = spill5218_0;
        forwardValue5218_19_1 = spill5218_1;
        break forward_join_19;
    }
    forwardValue5218_18_0 = spill5218_0;
    forwardValue5218_18_1 = spill5218_1;
    forwardValue5218_18_2 = 1;
    }
    forwardValue5218_20_0 = forwardValue5218_18_0;
    forwardValue5218_20_1 = forwardValue5218_18_1;
    forwardValue5218_20_2 = forwardValue5218_18_2;
    break forward_join_20;
    }
    forwardValue5218_20_0 = forwardValue5218_19_0;
    forwardValue5218_20_1 = forwardValue5218_19_1;
    forwardValue5218_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue5218_20_0)).b(((int)(forwardValue5218_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue5218_20_2)))))));
    spill5218_3 = this;
    if (!((life4_5 == null))) {
        forwardValue5218_49_0 = spill5218_3;
        break forward_join_49;
    }
    if (!((((net.minecraft.entity.monster.EntityZombie)(spill5218_3)).i != null))) {
        break forward_join_48;
    }
    spill5218_4 = this;
    if (!((life4_5 == null))) {
        forwardValue5218_49_0 = spill5218_4;
        break forward_join_49;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityZombie)(spill5218_4)).i)).G))) {
        break forward_join_48;
    }
    life5_49 = ((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life5_49)).b(((moom.vB)(net.minecraft.entity.monster.EntityZombie.b7)));
    if (!((life4_5 == null))) {
        break forward_join_51;
    }
    if (!(p0)) {
        break forward_join_48;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life5_49)).a(((moom.vB)(net.minecraft.entity.monster.EntityZombie.b7)));
    }
    forwardValue5218_49_0 = this;
    }
    ((net.minecraft.entity.monster.EntityZombie)(forwardValue5218_49_0)).o(((boolean)(p0)));
    }
    return;
}


public void o(boolean p0) {
long local2 = (net.minecraft.entity.monster.EntityZombie.jb ^ 25785824744813L);
    ((net.minecraft.entity.monster.EntityZombie)(this)).j(((float)((p0 ? 0x1.0p-1f : 0x1.0p0f))));
    return;
}


public void g__Void() {
net.minecraft.entity.monster.EntityZombie forwardValue5216_34_0;
    net.minecraft.entity.monster.EntityZombie spill5216_0;
    net.minecraft.entity.monster.EntityZombie spill5216_1;
    net.minecraft.entity.monster.EntityZombie spill5216_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_28;
    forward_join_34: {
    forward_join_33: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 85370736807812L);
    life3_5 = moom.vN.b();
    spill5216_0 = this;
    if (!((life3_5 == null))) {
        forwardValue5216_34_0 = spill5216_0;
        break forward_join_34;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityZombie)(spill5216_0)).i)).G))) {
        break forward_join_33;
    }
    spill5216_1 = this;
    if (!((life3_5 == null))) {
        forwardValue5216_34_0 = spill5216_1;
        break forward_join_34;
    }
    if (!(((net.minecraft.entity.monster.EntityZombie)(spill5216_1)).ae())) {
        break forward_join_33;
    }
    life4_28 = ((net.minecraft.entity.monster.EntityZombie)(this)).s();
    net.minecraft.entity.monster.EntityZombie __stackOp5216_6_0 = this;
    ((net.minecraft.entity.monster.EntityZombie)(__stackOp5216_6_0)).b9 = ((int)((((net.minecraft.entity.monster.EntityZombie)(__stackOp5216_6_0)).b9 - life4_28)));
    spill5216_2 = this;
    if (!((life3_5 == null))) {
        forwardValue5216_34_0 = spill5216_2;
        break forward_join_34;
    }
    if (!((((net.minecraft.entity.monster.EntityZombie)(spill5216_2)).b9 <= 0))) {
        break forward_join_33;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).Y__sourceReturn_da8c82d5d4();
    }
    forwardValue5216_34_0 = this;
    }
    __sourceIntrinsic_736a66cda11e_call5216_11(forwardValue5216_34_0);
    return;
}


protected final void j(float p0) {
super.a__Void(((float)((this.ca * p0))), ((float)((this.cb * p0))));
    return;
}


protected void A__sourceReturn_da8c82d5d4() {
net.minecraft.entity.monster.EntityZombie forwardValue537_14_0;
    net.minecraft.entity.monster.EntityZombie spill537_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_32: {
    forward_join_27: {
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 45803498951915L);
    life3_5 = moom.vN.b();
    spill537_0 = this;
    if (!((life3_5 == null))) {
        forwardValue537_14_0 = spill537_0;
        break forward_join_14;
    }
    switch (((java.util.Random)(((net.minecraft.entity.monster.EntityZombie)(spill537_0)).ah)).nextInt(((int)(3)))) {
case 0:
{
        break forward_join_13;
    }
case 1:
{
        break forward_join_20;
    }
case 2:
{
        break forward_join_27;
    }
default:
{
        break forward_join_32;
    }
}
    }
    forwardValue537_14_0 = this;
    }
    ((net.minecraft.entity.monster.EntityZombie)(forwardValue537_14_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.j)), ((int)(1)));
    if (!((life3_5 != null))) {
        break forward_join_32;
    }
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bG)), ((int)(1)));
    if (!((life3_5 != null))) {
        break forward_join_32;
    }
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bH)), ((int)(1)));
    }
    return;
}


protected boolean M() {
int forwardValue5197_12_0;
    int forwardValue5197_14_0;
    boolean spill5197_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 46018854786332L);
    life3_5 = moom.vN.b();
    spill5197_0 = ((net.minecraft.entity.monster.EntityZombie)(this)).ae();
    if (!((life3_5 == null))) {
        forwardValue5197_12_0 = ((spill5197_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill5197_0))) {
        break forward_join_13;
    }
    forwardValue5197_12_0 = 1;
    }
    forwardValue5197_14_0 = forwardValue5197_12_0;
    break forward_join_14;
    }
    forwardValue5197_14_0 = 0;
    }
    return ((forwardValue5197_14_0) != 0);
}


public boolean ac() {
return ((((this.b_) ? 1 : 0)) != 0);
}


protected void X__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.monster.EntityZombie.jb ^ 85165061957833L);
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(4)), ((moom.uc)(new moom.ue(this, net.minecraft.entity.passive.EntityVillager.class, 0x1.0p0d, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(4)), ((moom.uc)(new moom.ue(this, net.minecraft.entity.monster.EntityIronGolem.class, 0x1.0p0d, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(__sourceIntrinsic_296ab52b3f54_originalDynamicSite3379_8(780, (6802192931194719361L ^ local1)))), ((moom.uc)(new moom.uB(this, 0x1.0p0d, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(1)), ((moom.uc)(new moom.uT(this, true, new java.lang.Class[] {net.minecraft.entity.monster.EntityPigZombie.class}))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(2)), ((moom.uc)(new moom.uV(this, net.minecraft.entity.player.EntityPlayer.class, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(2)), ((moom.uc)(new moom.uV(this, net.minecraft.entity.passive.EntityVillager.class, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(2)), ((moom.uc)(new moom.uV(this, net.minecraft.entity.monster.EntityIronGolem.class, true))));
    return;
}


protected void Y__sourceReturn_da8c82d5d4() {
int forwardValue5198_50_0;
    int forwardValue5198_65_0;
    net.minecraft.entity.Entity[] spill5198_0;
    boolean spill5198_1;
    long life1_3;
    net.minecraft.entity.passive.EntityVillager life4_10;
    net.minecraft.entity.Entity[] life3_14;
    forward_join_65: {
    forward_join_61: {
    forward_join_50: {
    forward_join_40: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 18425513165253L);
    spill5198_0 = moom.vN.b();
    life4_10 = new net.minecraft.entity.passive.EntityVillager(this.i);
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).c(((net.minecraft.entity.Entity)(this)));
    life3_14 = spill5198_0;
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).a(((moom.Eh)(((net.minecraft.world.World)(this.i)).a__Eh(((moom.DT)(new moom.DT(life4_10)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).aa__sourceReturn_da8c82d5d4();
    spill5198_1 = ((net.minecraft.entity.monster.EntityZombie)(this)).c__Boolean();
    if (!((life3_14 == null))) {
        forwardValue5198_50_0 = ((spill5198_1) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill5198_1)) {
        break forward_join_40;
    }
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).l(((int)(__sourceIntrinsic_5910df8f1d95_invokedynamic5198_10(14877, (6462112882472770712L ^ life1_3)))));
    }
    ((net.minecraft.world.World)(this.i)).c(((net.minecraft.entity.Entity)(this)));
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).j(((boolean)(((net.minecraft.entity.monster.EntityZombie)(this)).U__Boolean())));
    forwardValue5198_50_0 = ((((net.minecraft.entity.monster.EntityZombie)(this)).e__Boolean()) ? 1 : 0);
    }
    if (!((life3_14 == null))) {
        forwardValue5198_65_0 = forwardValue5198_50_0;
        break forward_join_65;
    }
    if (!((forwardValue5198_50_0 != 0))) {
        break forward_join_61;
    }
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).a(((java.lang.String)(((net.minecraft.entity.monster.EntityZombie)(this)).g__String())));
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).f(((boolean)(((net.minecraft.entity.monster.EntityZombie)(this)).B())));
    }
    forwardValue5198_65_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life4_10)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5198_65_0);
    ((net.minecraft.entity.passive.EntityVillager)(life4_10)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.l)).I, __sourceIntrinsic_5910df8f1d95_invokedynamic5198_28(26537, (7570149713481826592L ^ life1_3)), 0))));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_5910df8f1d95_invokedynamic5198_31(18851, (710564670062407475L ^ life1_3)))), ((moom.DT)(new moom.DT(((int) this.n), ((int) this.o), ((int) this.p)))), ((int)(0)));
    return;
}


public void G() {
net.minecraft.item.ItemStack forwardValue5196_77_0;
    int forwardValue5196_105_0;
    int forwardValue5196_121_0;
    net.minecraft.entity.monster.EntityZombie forwardValue5196_144_0;
    boolean spill5196_0;
    boolean spill5196_1;
    boolean spill5196_2;
    int spill5196_3;
    int spill5196_4;
    boolean spill5196_5;
    net.minecraft.item.ItemStack spill5196_6;
    boolean spill5196_7;
    int spill5196_8;
    int spill5196_9;
    net.minecraft.entity.monster.EntityZombie spill5196_10;
    net.minecraft.entity.monster.EntityZombie spill5196_11;
    net.minecraft.entity.monster.EntityZombie spill5196_12;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    float life4_41;
    moom.DT life5_53;
    int life6_97;
    net.minecraft.item.ItemStack life7_101;
    forward_join_144: {
    forward_join_143: {
    forward_join_121: {
    forward_join_117: {
    forward_join_106: {
    forward_join_105: {
    forward_join_104: {
    forward_join_77: {
    life1_3 = (net.minecraft.entity.monster.EntityZombie.jb ^ 8252344175352L);
    life3_5 = moom.vN.b();
    spill5196_0 = ((net.minecraft.world.World)(this.i)).e__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5196_121_0 = ((spill5196_0) ? 1 : 0);
        break forward_join_121;
    }
    if (!(spill5196_0)) {
        break forward_join_117;
    }
    spill5196_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == null))) {
        forwardValue5196_121_0 = ((spill5196_1) ? 1 : 0);
        break forward_join_121;
    }
    if (!((!spill5196_1))) {
        break forward_join_117;
    }
    spill5196_2 = ((net.minecraft.entity.monster.EntityZombie)(this)).c__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5196_121_0 = ((spill5196_2) ? 1 : 0);
        break forward_join_121;
    }
    if (!((!spill5196_2))) {
        break forward_join_117;
    }
    life4_41 = ((net.minecraft.entity.monster.EntityZombie)(this)).a(((float)(0x1.0p0f)));
    life5_53 = new moom.DT(this.n, ((double) java.lang.Math.round(((double)(this.o)))), this.p);
    spill5196_3 = recovery.source.CarrierOps.fcmpl(((float)(life4_41)), ((float)(0x1.0p-1f)));
    if (!((life3_5 == null))) {
        forwardValue5196_121_0 = spill5196_3;
        break forward_join_121;
    }
    if (!((spill5196_3 > 0))) {
        break forward_join_117;
    }
    spill5196_4 = recovery.source.CarrierOps.fcmpg(((float)((((java.util.Random)(this.ah)).nextFloat() * 0x1.ep4f))), ((float)(((life4_41 - 0x1.99999ap-2f) * 0x1.0p1f))));
    if (!((life3_5 == null))) {
        forwardValue5196_121_0 = spill5196_4;
        break forward_join_121;
    }
    if (!((spill5196_4 < 0))) {
        break forward_join_117;
    }
    spill5196_5 = ((net.minecraft.world.World)(this.i)).e(((moom.DT)(life5_53)));
    if (!((life3_5 == null))) {
        forwardValue5196_121_0 = ((spill5196_5) ? 1 : 0);
        break forward_join_121;
    }
    if (!(spill5196_5)) {
        break forward_join_117;
    }
    life6_97 = 1;
    life7_101 = ((net.minecraft.entity.monster.EntityZombie)(this)).a__xW(((int)(4)));
    spill5196_6 = life7_101;
    if (!((life3_5 == null))) {
        forwardValue5196_77_0 = spill5196_6;
        break forward_join_77;
    }
    if (!((spill5196_6 != null))) {
        break forward_join_106;
    }
    forwardValue5196_77_0 = life7_101;
    }
    spill5196_7 = ((net.minecraft.item.ItemStack)(forwardValue5196_77_0)).b__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5196_105_0 = ((spill5196_7) ? 1 : 0);
        break forward_join_105;
    }
    if (!(spill5196_7)) {
        break forward_join_104;
    }
    ((net.minecraft.item.ItemStack)(life7_101)).a__Void(((int)((((net.minecraft.item.ItemStack)(life7_101)).b() + ((java.util.Random)(this.ah)).nextInt(((int)(2)))))));
    spill5196_8 = ((net.minecraft.item.ItemStack)(life7_101)).b();
    if (!((life3_5 == null))) {
        forwardValue5196_105_0 = spill5196_8;
        break forward_join_105;
    }
    if (!((spill5196_8 >= ((net.minecraft.item.ItemStack)(life7_101)).d()))) {
        break forward_join_104;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).b(((net.minecraft.item.ItemStack)(life7_101)));
    ((net.minecraft.entity.monster.EntityZombie)(this)).b(((int)(4)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5196_105_0 = 0;
    }
    life6_97 = forwardValue5196_105_0;
    }
    spill5196_9 = life6_97;
    if (!((life3_5 == null))) {
        forwardValue5196_121_0 = spill5196_9;
        break forward_join_121;
    }
    if (!((spill5196_9 != 0))) {
        break forward_join_117;
    }
    ((net.minecraft.entity.monster.EntityZombie)(this)).b(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic5196_33(26886, (6458919113991996598L ^ life1_3)))));
    }
    spill5196_10 = this;
    if (!((life3_5 == null))) {
        forwardValue5196_144_0 = spill5196_10;
        break forward_join_144;
    }
    forwardValue5196_121_0 = ((((net.minecraft.entity.monster.EntityZombie)(spill5196_10)).s__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5196_121_0 != 0))) {
        break forward_join_143;
    }
    spill5196_11 = this;
    if (!((life3_5 == null))) {
        forwardValue5196_144_0 = spill5196_11;
        break forward_join_144;
    }
    if (!((((net.minecraft.entity.monster.EntityZombie)(spill5196_11)).d__sourceReturn_d30556f370() != null))) {
        break forward_join_143;
    }
    spill5196_12 = this;
    if (!((life3_5 == null))) {
        forwardValue5196_144_0 = spill5196_12;
        break forward_join_144;
    }
    if (!((((((net.minecraft.entity.monster.EntityZombie)(spill5196_12)).g instanceof net.minecraft.entity.passive.EntityChicken) ? 1 : 0) != 0))) {
        break forward_join_143;
    }
    ((moom.AV)(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(this.g)))).a__sourceReturn_407923443b())).a(((moom.AT)(((moom.AV)(((net.minecraft.entity.monster.EntityZombie)(this)).a__sourceReturn_407923443b())).a__AT())), ((double)(0x1.8p0d)));
    }
    forwardValue5196_144_0 = this;
    }
    __sourceIntrinsic_c7b45e3c376e_call5196_46(forwardValue5196_144_0);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_2f7af9999976638f_originalDynamicSite3377_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2f7af9999976638f_originalDynamicSite3377_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2f7af9999976638f_originalDynamicSite3377_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic5196_33(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c7b45e3c376e_call5196_46(net.minecraft.entity.monster.EntityZombie a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_296ab52b3f54_originalDynamicSite3379_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5910df8f1d95_invokedynamic5198_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5910df8f1d95_invokedynamic5198_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5910df8f1d95_invokedynamic5198_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic5199_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7f7882d6cee_invokedynamic5202_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5205_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5205_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1593_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0a402d4f733_invokedynamic5209_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a627c59d8423_invokedynamic5210_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5212_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4c21d9cede27_invokedynamic5213_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8a36ae237a7_invokedynamic5215_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8a36ae237a7_invokedynamic5215_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1957_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1957_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1957_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11517_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_736a66cda11e_call5216_11(net.minecraft.entity.monster.EntityZombie a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_originalDynamicSite1956_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_originalDynamicSite1956_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5218_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5219_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_invokedynamic1114_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_invokedynamic1114_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_invokedynamic1114_13(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_1d07b9dbc014ec(int p0, long p1);
private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);

private static native void __sourceExactCall_ae34dbea601cc3(net.minecraft.entity.ai.EntityAITasks p0, int p1, moom.uc p2);
private static native void __sourceExactCall_44328695cdef6e(net.minecraft.entity.monster.EntityZombie p0);
private static native void __sourceExactCall_f34e52575c37d0(net.minecraft.entity.monster.EntityZombie p0, float p1, float p2);

private static native moom.AV __sourceExactCall_30cfc1c52e6e80(net.minecraft.entity.monster.EntityZombie p0);
}
