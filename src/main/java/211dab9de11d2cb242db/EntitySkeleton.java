package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntitySkeleton extends moom.sZ implements net.minecraft.entity.IRangedAttackMob {

private moom.ud b5;

private moom.ue b6;

private static long cb;

private static long[] db;

private static java.lang.Integer[] jb;

private static java.util.Map xb;

public EntitySkeleton(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_1523363785a73b65(net.minecraft.entity.monster.EntitySkeleton receiver, net.minecraft.world.World p0) throws Throwable {
net.minecraft.world.World __initValue841_144_0;
    long local2_life2;
    net.minecraft.entity.Entity[] local4_life21;
    init_join_153: {
    init_join_148: {
    init_join_144: {
    local2_life2 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 47407106626198L);
    net.minecraft.entity.monster.EntitySkeleton.__sourceConstructorInit_1523363785a73b65_0(((net.minecraft.entity.monster.EntitySkeleton)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntitySkeleton)(receiver)).b5 = ((moom.ud)(new moom.ud(((net.minecraft.entity.IRangedAttackMob) receiver), 0x1.0p0d, __sourceIntrinsic_1523363785a73b65_originalDynamicSite841_5(5547, (8504428018405961552L ^ local2_life2)), __sourceIntrinsic_1523363785a73b65_originalDynamicSite841_7(3819, (4929499631907337241L ^ local2_life2)), 0x1.e000000000000p+3F)));
    ((net.minecraft.entity.monster.EntitySkeleton)(receiver)).b6 = ((moom.ue)(new moom.ue(((moom.sI) receiver), net.minecraft.entity.player.EntityPlayer.class, 0x1.3333333333333p+0D, false)));
    net.minecraft.entity.Entity[] __sourceSpill841_16 = moom.vN.b();
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(((net.minecraft.entity.EntityLiving) receiver)))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.uN(((moom.sI) receiver)))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.us(((moom.sI) receiver), 0x1.0p0d))));
    local4_life21 = __sourceSpill841_16;
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uh(((moom.sI) receiver), net.minecraft.entity.passive.EntityWolf.class, 0x1.8000000000000p+2F, 0x1.0p0d, 0x1.3333333333333p+0D))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.u6(((moom.sI) receiver), 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bJ)).a(((int)(__sourceIntrinsic_1523363785a73b65_originalDynamicSite841_31(1602, (4725789568516586675L ^ local2_life2)))), ((moom.uc)(new moom.u8(((net.minecraft.entity.EntityLiving) receiver), net.minecraft.entity.player.EntityPlayer.class, 0x1.0000000000000p+3F))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bJ)).a(((int)(__sourceIntrinsic_1523363785a73b65_originalDynamicSite841_37(8613, (3586513901273635670L ^ local2_life2)))), ((moom.uc)(new moom.uy(((net.minecraft.entity.EntityLiving) receiver)))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uT(((moom.sI) receiver), false, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uV(((moom.sI) receiver), net.minecraft.entity.player.EntityPlayer.class, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntitySkeleton)(receiver)).bK)).a(((int)(3)), ((moom.uc)(new moom.uV(((moom.sI) receiver), net.minecraft.entity.monster.EntityIronGolem.class, true))));
    net.minecraft.world.World __sourceSpill841_47 = p0;
    if (!((local4_life21 == null))) {
        __initValue841_144_0 = __sourceSpill841_47;
        break init_join_144;
    }
    if (!((__sourceSpill841_47 != null))) {
        break init_join_148;
    }
    __initValue841_144_0 = p0;
    }
    if (!((!((net.minecraft.world.World)(__initValue841_144_0)).G))) {
        break init_join_148;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(receiver)).X();
    }
    if (!((local4_life21 != null))) {
        break init_join_153;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-3093745781488889110L)), ((long)(-1858614233801926623L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(185054465526547L)))));
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 6551091854667L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1874_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1874_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1874_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1874_14 = new byte[8];
    (__sourceSpill1874_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1874_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1874_16 = __sourceSpill1874_14;
    ((javax.crypto.Cipher)(__sourceSpill1874_11)).init(((int)(__sourceSpill1874_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1874_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1874_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "}vgâù½vKýS\034§<Îª\021^ïÉ\017p&wRª&ÂCá²ÞõÓ\001oÁ\033 óH÷'_oH)ò×]p£IÊÉ\023J£y¦¬à¢!\177£\023vlp\030E=W¼\021"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1874_25 = local6_life21;
        int __sourceSpill1874_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1874_25)).substring(((int)(__sourceSpill1874_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1874_30 = local8_life19;
        int __sourceSpill1874_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1874_33 = new byte[8];
        (__sourceSpill1874_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1874_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1874_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1874_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1874_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1874_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1874_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1874_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1874_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1874_34)).doFinal(((byte[])(__sourceSpill1874_33)));
        (__sourceSpill1874_30)[__sourceSpill1874_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\002\033{1\027qÒ;\007\016³Ãý\r\017"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1874_38 = local6_life21;
        int __sourceSpill1874_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1874_38)).substring(((int)(__sourceSpill1874_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1874_43 = local8_life19;
        int __sourceSpill1874_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1874_46 = new byte[8];
        (__sourceSpill1874_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1874_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1874_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1874_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1874_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1874_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1874_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1874_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1874_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1874_47)).doFinal(((byte[])(__sourceSpill1874_46)));
        (__sourceSpill1874_43)[__sourceSpill1874_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    jb = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_1523363785a73b65_0(net.minecraft.entity.monster.EntitySkeleton a0, net.minecraft.world.World a1) throws E;
private static native <E extends Throwable> net.minecraft.entity.IEntityLivingData __sourceHandlerCall_20e81a7a9b24a04f5a31(net.minecraft.entity.monster.EntitySkeleton a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws E;
private static final class __SourceHandler_20e81a7a9b24a04f5a31 {

public static net.minecraft.entity.IEntityLivingData f300133(net.minecraft.entity.monster.EntitySkeleton receiver, moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) throws Throwable {
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_58_0;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_73_0;
    int forwardValue300133_73_1;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_74_0;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_75_0;
    int forwardValue300133_75_1;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_83_0;
    int forwardValue300133_109_0;
    int forwardValue300133_109_1;
    int forwardValue300133_117_0;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_119_0;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_130_0;
    int forwardValue300133_130_1;
    net.minecraft.item.ItemStack forwardValue300133_130_2;
    net.minecraft.item.ItemStack forwardValue300133_130_3;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300133_131_0;
    int forwardValue300133_131_1;
    net.minecraft.item.ItemStack forwardValue300133_131_2;
    net.minecraft.item.ItemStack forwardValue300133_131_3;
    net.minecraft.block.Block forwardValue300133_131_4;
    net.minecraft.entity.Entity[] spill300133_0;
    net.minecraft.entity.monster.EntitySkeleton spill300133_1;
    net.minecraft.entity.monster.EntitySkeleton spill300133_2;
    net.minecraft.entity.monster.EntitySkeleton spill300133_3;
    int spill300133_4;
    net.minecraft.item.ItemStack spill300133_5;
    net.minecraft.entity.monster.EntitySkeleton spill300133_6;
    int spill300133_7;
    net.minecraft.entity.monster.EntitySkeleton spill300133_8;
    int spill300133_9;
    int spill300133_10;
    int spill300133_11;
    net.minecraft.entity.monster.EntitySkeleton spill300133_12;
    int spill300133_13;
    net.minecraft.item.ItemStack spill300133_14;
    net.minecraft.item.ItemStack spill300133_15;
    long life3_3;
    net.minecraft.entity.IEntityLivingData life2_9;
    net.minecraft.entity.Entity[] life5_10;
    java.util.Calendar life6_109;
    forward_join_138: {
    forward_join_131: {
    forward_join_130: {
    forward_join_119: {
    forward_join_117: {
    forward_join_109: {
    forward_join_83: {
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    forward_join_60: {
    forward_join_58: {
    forward_join_48: {
    life3_3 = (__fieldRead300133_0() ^ 48866309705365L);
    spill300133_0 = __call300133_1();
    life2_9 = __call300133_2(receiver, p0, p1);
    life5_10 = spill300133_0;
    spill300133_1 = receiver;
    if (!((life5_10 == null))) {
        forwardValue300133_58_0 = spill300133_1;
        break forward_join_58;
    }
    if (!((__instanceOf300133_5(__fieldRead300133_4(__fieldRead300133_3(spill300133_1))) != 0))) {
        break forward_join_48;
    }
    spill300133_2 = receiver;
    if (!((life5_10 == null))) {
        forwardValue300133_58_0 = spill300133_2;
        break forward_join_58;
    }
    if (!((__call300133_7(__call300133_6(spill300133_2), 5) > 0))) {
        break forward_join_48;
    }
    __call300133_10(__fieldRead300133_8(receiver), 4, __fieldRead300133_9(receiver));
    __call300133_11(receiver, 1);
    spill300133_3 = receiver;
    spill300133_4 = 0;
    net.minecraft.item.ItemStack __stackOp300133_13_0 = __sourceUninitializedNEW300133_12();
    spill300133_5 = __stackOp300133_13_0;
    __explicitNewInit300133_15(__stackOp300133_13_0, __fieldRead300133_14());
    __call300133_16(spill300133_3, spill300133_4, spill300133_5);
    __call300133_19(__call300133_18(receiver, __fieldRead300133_17()), 0x1.0p2d);
    if (!((life5_10 != null))) {
        break forward_join_60;
    }
    }
    __call300133_22(__fieldRead300133_20(receiver), 4, __fieldRead300133_21(receiver));
    __call300133_23(receiver, p0);
    forwardValue300133_58_0 = receiver;
    }
    __call300133_24(forwardValue300133_58_0, p0);
    }
    spill300133_6 = receiver;
    spill300133_7 = __numericCompare300133_28(__call300133_26(__fieldRead300133_25(receiver)), (0x1.19999ap-1f * __call300133_27(p0)));
    if (!((life5_10 == null))) {
        forwardValue300133_73_0 = spill300133_6;
        forwardValue300133_73_1 = spill300133_7;
        break forward_join_73;
    }
    if (!((spill300133_7 < 0))) {
        forwardValue300133_74_0 = spill300133_6;
        break forward_join_74;
    }
    forwardValue300133_73_0 = spill300133_6;
    forwardValue300133_73_1 = 1;
    }
    forwardValue300133_75_0 = forwardValue300133_73_0;
    forwardValue300133_75_1 = forwardValue300133_73_1;
    break forward_join_75;
    }
    forwardValue300133_75_0 = forwardValue300133_74_0;
    forwardValue300133_75_1 = 0;
    }
    __call300133_29(forwardValue300133_75_0, forwardValue300133_75_1);
    spill300133_8 = receiver;
    if (!((life5_10 == null))) {
        forwardValue300133_83_0 = spill300133_8;
        break forward_join_83;
    }
    if (!((__call300133_30(spill300133_8, 4) == null))) {
        break forward_join_138;
    }
    forwardValue300133_83_0 = receiver;
    }
    life6_109 = __call300133_32(__fieldRead300133_31(forwardValue300133_83_0));
    spill300133_9 = (__call300133_33(life6_109, 2) + 1);
    spill300133_10 = __invokedynamic300133_34(20684, (1158944909568652856L ^ life3_3));
    if (!((life5_10 == null))) {
        forwardValue300133_109_0 = spill300133_9;
        forwardValue300133_109_1 = spill300133_10;
        break forward_join_109;
    }
    if (!((spill300133_9 == spill300133_10))) {
        break forward_join_138;
    }
    spill300133_11 = __call300133_35(life6_109, 5);
    if (!((life5_10 == null))) {
        forwardValue300133_117_0 = spill300133_11;
        break forward_join_117;
    }
    forwardValue300133_109_0 = spill300133_11;
    forwardValue300133_109_1 = __invokedynamic300133_36(2071, (7482601370254372589L ^ life3_3));
    }
    if (!((forwardValue300133_109_0 == forwardValue300133_109_1))) {
        break forward_join_138;
    }
    spill300133_12 = receiver;
    if (!((life5_10 == null))) {
        forwardValue300133_119_0 = spill300133_12;
        break forward_join_119;
    }
    forwardValue300133_117_0 = __numericCompare300133_39(__call300133_38(__fieldRead300133_37(spill300133_12)), 0x1.0p-2f);
    }
    if (!((forwardValue300133_117_0 < 0))) {
        break forward_join_138;
    }
    forwardValue300133_119_0 = receiver;
    }
    spill300133_13 = 4;
    net.minecraft.item.ItemStack __stackOp300133_41_0 = __sourceUninitializedNEW300133_40();
    spill300133_14 = __stackOp300133_41_0;
    spill300133_15 = __stackOp300133_41_0;
    if (!((__numericCompare300133_44(__call300133_43(__fieldRead300133_42(receiver)), 0x1.99999ap-4f) < 0))) {
        forwardValue300133_130_0 = forwardValue300133_119_0;
        forwardValue300133_130_1 = spill300133_13;
        forwardValue300133_130_2 = spill300133_14;
        forwardValue300133_130_3 = spill300133_15;
        break forward_join_130;
    }
    forwardValue300133_131_0 = forwardValue300133_119_0;
    forwardValue300133_131_1 = spill300133_13;
    forwardValue300133_131_2 = spill300133_14;
    forwardValue300133_131_3 = spill300133_15;
    forwardValue300133_131_4 = __fieldRead300133_45();
    break forward_join_131;
    }
    forwardValue300133_131_0 = forwardValue300133_130_0;
    forwardValue300133_131_1 = forwardValue300133_130_1;
    forwardValue300133_131_2 = forwardValue300133_130_2;
    forwardValue300133_131_3 = forwardValue300133_130_3;
    forwardValue300133_131_4 = __fieldRead300133_46();
    }
    __explicitNewInit300133_47(forwardValue300133_131_3, forwardValue300133_131_4);
    __call300133_48(forwardValue300133_131_0, forwardValue300133_131_1, forwardValue300133_131_2);
    (__fieldRead300133_49(receiver))[4] = 0x0.0p0f;
    }
    return life2_9;
}
private static native long __fieldRead300133_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call300133_1() throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call300133_2(net.minecraft.entity.monster.EntitySkeleton a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws Throwable;
private static native net.minecraft.world.World __fieldRead300133_3(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native moom.EA __fieldRead300133_4(net.minecraft.world.World a0) throws Throwable;
private static native int __instanceOf300133_5(moom.EA a0) throws Throwable;
private static native java.util.Random __call300133_6(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native int __call300133_7(java.util.Random a0, int a1) throws Throwable;
private static native net.minecraft.entity.ai.EntityAITasks __fieldRead300133_8(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native moom.ue __fieldRead300133_9(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native void __call300133_10(net.minecraft.entity.ai.EntityAITasks a0, int a1, moom.ue a2) throws Throwable;
private static native void __call300133_11(net.minecraft.entity.monster.EntitySkeleton a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW300133_12() throws Throwable;
private static native net.minecraft.item.Item __fieldRead300133_14() throws Throwable;
private static native void __explicitNewInit300133_15(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1) throws Throwable;
private static native void __call300133_16(net.minecraft.entity.monster.EntitySkeleton a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttribute __fieldRead300133_17() throws Throwable;
private static native net.minecraft.entity.ai.attributes.IAttributeInstance __call300133_18(net.minecraft.entity.monster.EntitySkeleton a0, net.minecraft.entity.ai.attributes.IAttribute a1) throws Throwable;
private static native void __call300133_19(net.minecraft.entity.ai.attributes.IAttributeInstance a0, double a1) throws Throwable;
private static native net.minecraft.entity.ai.EntityAITasks __fieldRead300133_20(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native moom.ud __fieldRead300133_21(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native void __call300133_22(net.minecraft.entity.ai.EntityAITasks a0, int a1, moom.ud a2) throws Throwable;
private static native void __call300133_23(net.minecraft.entity.monster.EntitySkeleton a0, moom.Eh a1) throws Throwable;
private static native void __call300133_24(net.minecraft.entity.monster.EntitySkeleton a0, moom.Eh a1) throws Throwable;
private static native java.util.Random __fieldRead300133_25(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native float __call300133_26(java.util.Random a0) throws Throwable;
private static native float __call300133_27(moom.Eh a0) throws Throwable;
private static native int __numericCompare300133_28(float a0, float a1) throws Throwable;
private static native void __call300133_29(net.minecraft.entity.monster.EntitySkeleton a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call300133_30(net.minecraft.entity.monster.EntitySkeleton a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead300133_31(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native java.util.Calendar __call300133_32(net.minecraft.world.World a0) throws Throwable;
private static native int __call300133_33(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic300133_34(int a0, long a1) throws Throwable;
private static native int __call300133_35(java.util.Calendar a0, int a1) throws Throwable;
private static native int __invokedynamic300133_36(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead300133_37(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native float __call300133_38(java.util.Random a0) throws Throwable;
private static native int __numericCompare300133_39(float a0, float a1) throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW300133_40() throws Throwable;
private static native java.util.Random __fieldRead300133_42(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native float __call300133_43(java.util.Random a0) throws Throwable;
private static native int __numericCompare300133_44(float a0, float a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead300133_45() throws Throwable;
private static native net.minecraft.block.Block __fieldRead300133_46() throws Throwable;
private static native void __explicitNewInit300133_47(net.minecraft.item.ItemStack a0, net.minecraft.block.Block a1) throws Throwable;
private static native void __call300133_48(net.minecraft.entity.monster.EntitySkeleton a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native float[] __fieldRead300133_49(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a9a560753513ad816b4d(net.minecraft.entity.monster.EntitySkeleton a0, net.minecraft.util.DamageSource a1) throws E;
private static final class __SourceHandler_a9a560753513ad816b4d {

public static void f300134(net.minecraft.entity.monster.EntitySkeleton receiver, net.minecraft.util.DamageSource p0) throws Throwable {
    int forwardValue300134_56_0;
    int forwardValue300134_63_0;
    int forwardValue300134_72_0;
    net.minecraft.entity.monster.EntityCreeper forwardValue300134_76_0;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300134_88_0;
    net.minecraft.item.ItemStack forwardValue300134_88_1;
    net.minecraft.item.ItemStack forwardValue300134_88_2;
    net.minecraft.item.Item forwardValue300134_88_3;
    int forwardValue300134_88_4;
    net.minecraft.entity.monster.EntitySkeleton forwardValue300134_89_0;
    net.minecraft.item.ItemStack forwardValue300134_89_1;
    net.minecraft.item.ItemStack forwardValue300134_89_2;
    net.minecraft.item.Item forwardValue300134_89_3;
    int forwardValue300134_89_4;
    int forwardValue300134_89_5;
    net.minecraft.entity.Entity[] spill300134_0;
    int spill300134_1;
    int spill300134_2;
    net.minecraft.entity.monster.EntityCreeper spill300134_3;
    net.minecraft.entity.monster.EntitySkeleton spill300134_4;
    net.minecraft.item.ItemStack spill300134_5;
    net.minecraft.item.ItemStack spill300134_6;
    net.minecraft.item.Item spill300134_7;
    int spill300134_8;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.entity.Entity life6_20;
    net.minecraft.entity.player.EntityPlayer life5_31;
    double life6_37;
    double life8_43;
    forward_join_93: {
    forward_join_89: {
    forward_join_88: {
    forward_join_76: {
    forward_join_72: {
    forward_join_63: {
    forward_join_56: {
    forward_join_53: {
    forward_join_51: {
    life2_3 = (__fieldRead300134_0() ^ 43319211427809L);
    spill300134_0 = __call300134_1();
    __call300134_2(receiver, p0);
    life4_8 = spill300134_0;
    spill300134_1 = __instanceOf300134_4(__call300134_3(p0));
    if (!((life4_8 == null))) {
        forwardValue300134_56_0 = spill300134_1;
        break forward_join_56;
    }
    if (!((spill300134_1 != 0))) {
        break forward_join_53;
    }
    life6_20 = __call300134_5(p0);
    spill300134_2 = __instanceOf300134_6(life6_20);
    if (!((life4_8 == null))) {
        forwardValue300134_56_0 = spill300134_2;
        break forward_join_56;
    }
    if (!((spill300134_2 != 0))) {
        break forward_join_53;
    }
    life5_31 = __cast300134_7(life6_20);
    life6_37 = (__fieldRead300134_8(life5_31) - __fieldRead300134_9(receiver));
    life8_43 = (__fieldRead300134_10(life5_31) - __fieldRead300134_11(receiver));
    if (!((__numericCompare300134_12(((life6_37 * life6_37) + (life8_43 * life8_43)), 0x1.388p11d) >= 0))) {
        break forward_join_51;
    }
    __call300134_14(life5_31, __fieldRead300134_13());
    }
    if (!((life4_8 != null))) {
        break forward_join_93;
    }
    }
    forwardValue300134_56_0 = __instanceOf300134_16(__call300134_15(p0));
    }
    if (!((life4_8 == null))) {
        forwardValue300134_63_0 = forwardValue300134_56_0;
        break forward_join_63;
    }
    if (!((forwardValue300134_56_0 != 0))) {
        break forward_join_93;
    }
    forwardValue300134_63_0 = __integerCategory300134_20(__call300134_19(__cast300134_18(__call300134_17(p0))));
    }
    if (!((life4_8 == null))) {
        forwardValue300134_72_0 = forwardValue300134_63_0;
        break forward_join_72;
    }
    if (!((forwardValue300134_63_0 != 0))) {
        break forward_join_93;
    }
    spill300134_3 = __cast300134_22(__call300134_21(p0));
    if (!((life4_8 == null))) {
        forwardValue300134_76_0 = spill300134_3;
        break forward_join_76;
    }
    forwardValue300134_72_0 = __integerCategory300134_24(__call300134_23(spill300134_3));
    }
    if (!((forwardValue300134_72_0 != 0))) {
        break forward_join_93;
    }
    forwardValue300134_76_0 = __cast300134_26(__call300134_25(p0));
    }
    __call300134_27(forwardValue300134_76_0);
    spill300134_4 = receiver;
    net.minecraft.item.ItemStack __stackOp300134_29_0 = __sourceUninitializedNEW300134_28();
    spill300134_5 = __stackOp300134_29_0;
    spill300134_6 = __stackOp300134_29_0;
    spill300134_7 = __fieldRead300134_30();
    spill300134_8 = 1;
    if (!((__call300134_31(receiver) == 1))) {
        forwardValue300134_88_0 = spill300134_4;
        forwardValue300134_88_1 = spill300134_5;
        forwardValue300134_88_2 = spill300134_6;
        forwardValue300134_88_3 = spill300134_7;
        forwardValue300134_88_4 = spill300134_8;
        break forward_join_88;
    }
    forwardValue300134_89_0 = spill300134_4;
    forwardValue300134_89_1 = spill300134_5;
    forwardValue300134_89_2 = spill300134_6;
    forwardValue300134_89_3 = spill300134_7;
    forwardValue300134_89_4 = spill300134_8;
    forwardValue300134_89_5 = 1;
    break forward_join_89;
    }
    forwardValue300134_89_0 = forwardValue300134_88_0;
    forwardValue300134_89_1 = forwardValue300134_88_1;
    forwardValue300134_89_2 = forwardValue300134_88_2;
    forwardValue300134_89_3 = forwardValue300134_88_3;
    forwardValue300134_89_4 = forwardValue300134_88_4;
    forwardValue300134_89_5 = 0;
    }
    __explicitNewInit300134_32(forwardValue300134_89_2, forwardValue300134_89_3, forwardValue300134_89_4, forwardValue300134_89_5);
    __call300134_33(forwardValue300134_89_0, forwardValue300134_89_1, 0x0.0p0f);
    }
    return;
}
private static native long __fieldRead300134_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call300134_1() throws Throwable;
private static native void __call300134_2(net.minecraft.entity.monster.EntitySkeleton a0, net.minecraft.util.DamageSource a1) throws Throwable;
private static native net.minecraft.entity.Entity __call300134_3(net.minecraft.util.DamageSource a0) throws Throwable;
private static native int __instanceOf300134_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __call300134_5(net.minecraft.util.DamageSource a0) throws Throwable;
private static native int __instanceOf300134_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast300134_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead300134_8(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead300134_9(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native double __fieldRead300134_10(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native double __fieldRead300134_11(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native int __numericCompare300134_12(double a0, double a1) throws Throwable;
private static native moom.BZ __fieldRead300134_13() throws Throwable;
private static native void __call300134_14(net.minecraft.entity.player.EntityPlayer a0, moom.BZ a1) throws Throwable;
private static native net.minecraft.entity.Entity __call300134_15(net.minecraft.util.DamageSource a0) throws Throwable;
private static native int __instanceOf300134_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __call300134_17(net.minecraft.util.DamageSource a0) throws Throwable;
private static native net.minecraft.entity.monster.EntityCreeper __cast300134_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call300134_19(net.minecraft.entity.monster.EntityCreeper a0) throws Throwable;
private static native int __integerCategory300134_20(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __call300134_21(net.minecraft.util.DamageSource a0) throws Throwable;
private static native net.minecraft.entity.monster.EntityCreeper __cast300134_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call300134_23(net.minecraft.entity.monster.EntityCreeper a0) throws Throwable;
private static native int __integerCategory300134_24(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __call300134_25(net.minecraft.util.DamageSource a0) throws Throwable;
private static native net.minecraft.entity.monster.EntityCreeper __cast300134_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call300134_27(net.minecraft.entity.monster.EntityCreeper a0) throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW300134_28() throws Throwable;
private static native net.minecraft.item.Item __fieldRead300134_30() throws Throwable;
private static native int __call300134_31(net.minecraft.entity.monster.EntitySkeleton a0) throws Throwable;
private static native void __explicitNewInit300134_32(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1, int a2, int a3) throws Throwable;
private static native net.minecraft.entity.item.EntityItem __call300134_33(net.minecraft.entity.monster.EntitySkeleton a0, net.minecraft.item.ItemStack a1, float a2) throws Throwable;

}


protected java.lang.String i__String() {
return "mob.skeleton.say";
}


public void b(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5178_17_0;
    net.minecraft.entity.Entity[] spill5178_0;
    boolean spill5178_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_20: {
    forward_join_17: {
    life3_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 83113416901992L);
    spill5178_0 = moom.vN.b();
    super.b(((int)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    life5_9 = spill5178_0;
    spill5178_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_9 == null))) {
        forwardValue5178_17_0 = ((spill5178_1) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill5178_1))) {
        break forward_join_20;
    }
    forwardValue5178_17_0 = p0;
    }
    if (!((forwardValue5178_17_0 == 0))) {
        break forward_join_20;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).X__sourceReturn_da8c82d5d4();
    }
    return;
}


protected void b(boolean p0, int p1) {
int lexicalValue1590_44_0;
    int spill1590_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_23;
    int life7_25;
    int life7_55;
    int life7_80;
    lexical_join_80: {
    lexical_join_67: {
    lexical_join_60: {
    lexical_join_44: {
    lexical_join_38: {
    lexical_join_36: {
    life3_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 54619800256144L);
    life5_5 = moom.vN.b();
    spill1590_0 = ((net.minecraft.entity.monster.EntitySkeleton)(this)).s();
    if (!((life5_5 == null))) {
        lexicalValue1590_44_0 = spill1590_0;
        break lexical_join_44;
    }
    if (!((spill1590_0 == 1))) {
        break lexical_join_38;
    }
    life6_23 = (((java.util.Random)(this.ah)).nextInt(((int)((3 + p1)))) - 1);
    life7_25 = 0;
    lexical_cycle_23: while (true) {
    if (!((life7_25 < life6_23))) {
        break lexical_join_36;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.h)), ((int)(1)));
    life7_25 += 1;
    if (!((life5_5 == null))) {
        break lexical_join_67;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    if (!((life5_5 != null))) {
        break lexical_join_60;
    }
    }
    lexicalValue1590_44_0 = ((java.util.Random)(this.ah)).nextInt(((int)((3 + p1))));
    }
    life6_23 = lexicalValue1590_44_0;
    life7_55 = 0;
    lexical_cycle_47: while (true) {
    if (!((life7_55 < life6_23))) {
        break lexical_join_60;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.g)), ((int)(1)));
    life7_55 += 1;
    if (!((life5_5 == null))) {
        break lexical_join_67;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    life6_23 = ((java.util.Random)(this.ah)).nextInt(((int)((3 + p1))));
    }
    life7_80 = 0;
    lexical_cycle_69: while (true) {
    if (!((life7_80 < life6_23))) {
        break lexical_join_80;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aX)), ((int)(1)));
    life7_80 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_69; }
    break lexical_cycle_69;
    }
    }
    return;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11488_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28778;
      if (jb[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])xb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               xb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/s8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


public float e__Float() {
net.minecraft.entity.monster.EntitySkeleton forwardValue5181_13_0;
    float forwardValue5181_16_0;
    net.minecraft.entity.monster.EntitySkeleton spill5181_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 139479855625492L);
    life3_5 = moom.vN.b();
    spill5181_0 = this;
    if (!((life3_5 == null))) {
        forwardValue5181_13_0 = spill5181_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.entity.monster.EntitySkeleton)(spill5181_0)).s() == 1))) {
        break forward_join_15;
    }
    forwardValue5181_13_0 = this;
    }
    forwardValue5181_16_0 = __sourceIntrinsic_0dc4920a9eb6_call5181_3(forwardValue5181_13_0);
    break forward_join_16;
    }
    forwardValue5181_16_0 = 0x1.bd70a4p0f;
    }
    return forwardValue5181_16_0;
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntitySkeleton.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int s() {
long local1 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 72678487705237L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_421c707d57eb_originalDynamicSite1949_2(26984, (8996481031771899795L ^ local1)))));
}


public void s__Void() {
net.minecraft.entity.Entity forwardValue5183_17_0;
    net.minecraft.entity.Entity[] spill5183_0;
    net.minecraft.entity.Entity spill5183_1;
    long life1_3;
    net.minecraft.entity.Entity life5_9;
    net.minecraft.entity.Entity[] life3_10;
    moom.sI life4_24;
    forward_join_23: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 51315521435576L);
    super.s__Void();
    spill5183_0 = moom.vN.b();
    life5_9 = this.g;
    life3_10 = spill5183_0;
    spill5183_1 = life5_9;
    if (!((life3_10 == null))) {
        forwardValue5183_17_0 = spill5183_1;
        break forward_join_17;
    }
    if (!((((spill5183_1 instanceof moom.sI) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue5183_17_0 = life5_9;
    }
    life4_24 = ((moom.sI)(forwardValue5183_17_0));
    this.a2 = ((float)(((moom.sI)(life4_24)).a2));
    }
    return;
}


protected java.lang.String c__String() {
return "mob.skeleton.hurt";
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    int life5_26;
    life2_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 253656884890L);
    net.minecraft.entity.Entity[] spill9437_0 = moom.vN.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill9437_0;
    if ((life4_8 == null)) {
        if (((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SkeletonType")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic9437_3(11802, (4857153066020413676L ^ life2_3)))))) {
        life5_26 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("SkeletonType")));
        ((net.minecraft.entity.monster.EntitySkeleton)(this)).l(((int)(life5_26)));
    }
        ((net.minecraft.entity.monster.EntitySkeleton)(this)).X__sourceReturn_da8c82d5d4();
    }
    return;
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
int forwardValue5180_37_0;
    int forwardValue5180_39_0;
    boolean spill5180_0;
    int spill5180_1;
    int spill5180_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    life2_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 89288731198193L);
    life4_5 = moom.vN.b();
    spill5180_0 = super.c__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_5 == null))) {
        forwardValue5180_39_0 = ((spill5180_0) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill5180_0)) {
        break forward_join_38;
    }
    spill5180_1 = ((net.minecraft.entity.monster.EntitySkeleton)(this)).s();
    if (!((life4_5 == null))) {
        forwardValue5180_37_0 = spill5180_1;
        break forward_join_37;
    }
    if (!((spill5180_1 == 1))) {
        break forward_join_36;
    }
    spill5180_2 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue5180_37_0 = spill5180_2;
        break forward_join_37;
    }
    if (!((spill5180_2 != 0))) {
        break forward_join_36;
    }
    ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.w)).I, __sourceIntrinsic_e42ce9941c53_invokedynamic5180_9(13980, (7194875297260133387L ^ life2_3))))));
    }
    forwardValue5180_37_0 = 1;
    }
    return ((forwardValue5180_37_0) != 0);
    }
    forwardValue5180_39_0 = 0;
    }
    return ((forwardValue5180_39_0) != 0);
}


protected java.lang.String h__String() {
return "mob.skeleton.death";
}


public void l(int p0) {
net.minecraft.entity.monster.EntitySkeleton forwardValue5182_24_0;
    int forwardValue5182_24_1;
    net.minecraft.entity.monster.EntitySkeleton forwardValue5182_25_0;
    net.minecraft.entity.monster.EntitySkeleton forwardValue5182_26_0;
    int forwardValue5182_26_1;
    net.minecraft.entity.Entity[] spill5182_0;
    net.minecraft.entity.monster.EntitySkeleton spill5182_1;
    int spill5182_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_16;
    forward_join_42: {
    forward_join_38: {
    forward_join_36: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 21517693750005L);
    spill5182_0 = moom.vN.b();
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_3c5642f51658_invokedynamic5182_3(14481, (1241580737965971981L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) p0)))))));
    life4_16 = spill5182_0;
    spill5182_1 = this;
    spill5182_2 = p0;
    if (!((life4_16 == null))) {
        forwardValue5182_24_0 = spill5182_1;
        forwardValue5182_24_1 = spill5182_2;
        break forward_join_24;
    }
    if (!((spill5182_2 == 1))) {
        forwardValue5182_25_0 = spill5182_1;
        break forward_join_25;
    }
    forwardValue5182_24_0 = spill5182_1;
    forwardValue5182_24_1 = 1;
    }
    forwardValue5182_26_0 = forwardValue5182_24_0;
    forwardValue5182_26_1 = forwardValue5182_24_1;
    break forward_join_26;
    }
    forwardValue5182_26_0 = forwardValue5182_25_0;
    forwardValue5182_26_1 = 0;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(forwardValue5182_26_0)).ak = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5182_26_1)));
    if (!((life4_16 == null))) {
        break forward_join_36;
    }
    if (!((p0 == 1))) {
        break forward_join_38;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).a__Void(((float)(0x1.70a3d8p-1f)), ((float)(0x1.447ae2p1f)));
    }
    if (!((life4_16 != null))) {
        break forward_join_42;
    }
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.f33334p0f)));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SkeletonType")), ((byte)(((byte) ((net.minecraft.entity.monster.EntitySkeleton)(this)).s()))));
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 127753493224137L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1950_3(14481, (1241476975500380721L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public double d__sourceReturn_fedcb3e4d3() {
long local1 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 113165472374675L);
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntitySkeleton)(this)).c__Boolean()) != 0) ? 0x0.0p0d : -0x1.6666666666666p-2d);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntitySkeleton)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    return;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.monster.EntitySkeleton)(this)).a(((java.lang.String)("mob.skeleton.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


public net.minecraft.entity.EnumCreatureAttribute a__aR() {
return net.minecraft.entity.EnumCreatureAttribute.UNDEAD;
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.g;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) { return __sourceHandlerCall_20e81a7a9b24a04f5a31(this, p0, p1); }


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) { __sourceHandlerCall_a9a560753513ad816b4d(this, p0); }


public void a(net.minecraft.entity.EntityLivingBase p0, float p1) {
int forwardValue5176_77_0;
    int forwardValue5176_88_0;
    int forwardValue5176_93_0;
    int forwardValue5176_121_0;
    net.minecraft.entity.Entity[] spill5176_0;
    int spill5176_1;
    long life3_3;
    net.minecraft.entity.projectile.EntityArrow life6_26;
    int life7_32;
    net.minecraft.entity.Entity[] life5_33;
    int life8_39;
    forward_join_121: {
    forward_join_104: {
    forward_join_97: {
    forward_join_93: {
    forward_join_88: {
    forward_join_83: {
    forward_join_77: {
    forward_join_76: {
    life3_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 39008655512718L);
    spill5176_0 = moom.vN.b();
    life6_26 = new net.minecraft.entity.projectile.EntityArrow(this.i, this, p0, 0x1.99999ap0f, ((float) (__sourceIntrinsic_4b9f98ea96d2_invokedynamic5176_3(17158, (8355512812886704099L ^ life3_3)) - (((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.World)(this.i)).a__bB())).a() * 4))));
    life7_32 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.w)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.monster.EntitySkeleton)(this)).a__xW())));
    life5_33 = spill5176_0;
    life8_39 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.x)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.monster.EntitySkeleton)(this)).a__xW())));
    ((net.minecraft.entity.projectile.EntityArrow)(life6_26)).a__sourceReturn_2c20cf5948(((double)(((((double) (p1 * 0x1.0p1f)) + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.0p-2d)) + ((double) (((float) ((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.World)(this.i)).a__bB())).a()) * 0x1.c28f5cp-4f))))));
    spill5176_1 = life7_32;
    if (!((life5_33 == null))) {
        forwardValue5176_77_0 = spill5176_1;
        break forward_join_77;
    }
    if (!((spill5176_1 > 0))) {
        break forward_join_76;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life6_26)).a__sourceReturn_2c20cf5948(((double)(((((net.minecraft.entity.projectile.EntityArrow)(life6_26)).a() + (((double) life7_32) * 0x1.0p-1d)) + 0x1.0p-1d))));
    }
    forwardValue5176_77_0 = life8_39;
    }
    if (!((life5_33 == null))) {
        forwardValue5176_88_0 = forwardValue5176_77_0;
        break forward_join_88;
    }
    if (!((forwardValue5176_77_0 > 0))) {
        break forward_join_83;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life6_26)).g(((int)(life8_39)));
    }
    forwardValue5176_88_0 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.y)).C)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.monster.EntitySkeleton)(this)).a__xW())));
    }
    if (!((life5_33 == null))) {
        forwardValue5176_93_0 = forwardValue5176_88_0;
        break forward_join_93;
    }
    if (!((forwardValue5176_88_0 <= 0))) {
        break forward_join_97;
    }
    forwardValue5176_93_0 = ((net.minecraft.entity.monster.EntitySkeleton)(this)).s();
    }
    if (!((life5_33 == null))) {
        forwardValue5176_121_0 = forwardValue5176_93_0;
        break forward_join_121;
    }
    if (!((forwardValue5176_93_0 == 1))) {
        break forward_join_104;
    }
    }
    ((net.minecraft.entity.projectile.EntityArrow)(life6_26)).b(((int)(__sourceIntrinsic_4b9f98ea96d2_invokedynamic5176_29(25389, (5449941159352410059L ^ life3_3)))));
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).a(((java.lang.String)("random.bow")), ((float)(0x1.0p0f)), ((float)((0x1.0p0f / ((((java.util.Random)(((net.minecraft.entity.monster.EntitySkeleton)(this)).a__Random())).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    forwardValue5176_121_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life6_26)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5176_121_0);
    return;
}


protected void a(moom.Eh p0) {
super.a(((moom.Eh)(p0)));
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).b(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.f))));
    return;
}


protected void A__sourceReturn_da8c82d5d4() {
net.minecraft.entity.monster.EntitySkeleton forwardValue5172_13_0;
    net.minecraft.entity.monster.EntitySkeleton spill5172_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 88806365483649L);
    life3_5 = moom.vN.b();
    spill5172_0 = this;
    if (!((life3_5 == null))) {
        forwardValue5172_13_0 = spill5172_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.entity.monster.EntitySkeleton)(spill5172_0)).s() == 1))) {
        break forward_join_22;
    }
    forwardValue5172_13_0 = this;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(forwardValue5172_13_0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bM, 1, 1))), ((float)(0x0.0p0f)));
    }
    return;
}


public void X__sourceReturn_da8c82d5d4() {
net.minecraft.item.ItemStack forwardValue5174_24_0;
    net.minecraft.entity.Entity[] spill5174_0;
    net.minecraft.item.ItemStack spill5174_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_10;
    net.minecraft.item.ItemStack life4_18;
    forward_join_41: {
    forward_join_35: {
    forward_join_24: {
    life1_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 96925996954282L);
    spill5174_0 = moom.vN.b();
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((moom.uc)(this.b6)));
    life3_10 = spill5174_0;
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((moom.uc)(this.b5)));
    life4_18 = ((net.minecraft.entity.monster.EntitySkeleton)(this)).a__xW();
    spill5174_1 = life4_18;
    if (!((life3_10 == null))) {
        forwardValue5174_24_0 = spill5174_1;
        break forward_join_24;
    }
    if (!((spill5174_1 != null))) {
        break forward_join_35;
    }
    forwardValue5174_24_0 = life4_18;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5174_24_0)).a__wQ() == net.minecraft.init.Items.f))) {
        break forward_join_35;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(4)), ((moom.uc)(this.b5)));
    if (!((life3_10 != null))) {
        break forward_join_41;
    }
    }
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(4)), ((moom.uc)(this.b6)));
    }
    return;
}


public void G() {
net.minecraft.item.ItemStack forwardValue5173_72_0;
    int forwardValue5173_100_0;
    int forwardValue5173_117_0;
    net.minecraft.entity.monster.EntitySkeleton forwardValue5173_129_0;
    boolean spill5173_0;
    boolean spill5173_1;
    int spill5173_2;
    int spill5173_3;
    boolean spill5173_4;
    net.minecraft.item.ItemStack spill5173_5;
    boolean spill5173_6;
    int spill5173_7;
    int spill5173_8;
    net.minecraft.entity.monster.EntitySkeleton spill5173_9;
    net.minecraft.entity.monster.EntitySkeleton spill5173_10;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    float life4_30;
    moom.DT life5_42;
    int life6_86;
    net.minecraft.item.ItemStack life7_90;
    forward_join_129: {
    forward_join_128: {
    forward_join_117: {
    forward_join_112: {
    forward_join_101: {
    forward_join_100: {
    forward_join_99: {
    forward_join_72: {
    life1_3 = (net.minecraft.entity.monster.EntitySkeleton.cb ^ 139559671008402L);
    life3_5 = moom.vN.b();
    spill5173_0 = ((net.minecraft.world.World)(this.i)).e__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5173_117_0 = ((spill5173_0) ? 1 : 0);
        break forward_join_117;
    }
    if (!(spill5173_0)) {
        break forward_join_112;
    }
    spill5173_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == null))) {
        forwardValue5173_117_0 = ((spill5173_1) ? 1 : 0);
        break forward_join_117;
    }
    if (!((!spill5173_1))) {
        break forward_join_112;
    }
    life4_30 = ((net.minecraft.entity.monster.EntitySkeleton)(this)).a(((float)(0x1.0p0f)));
    life5_42 = new moom.DT(this.n, ((double) java.lang.Math.round(((double)(this.o)))), this.p);
    spill5173_2 = recovery.source.CarrierOps.fcmpl(((float)(life4_30)), ((float)(0x1.0p-1f)));
    if (!((life3_5 == null))) {
        forwardValue5173_117_0 = spill5173_2;
        break forward_join_117;
    }
    if (!((spill5173_2 > 0))) {
        break forward_join_112;
    }
    spill5173_3 = recovery.source.CarrierOps.fcmpg(((float)((((java.util.Random)(this.ah)).nextFloat() * 0x1.ep4f))), ((float)(((life4_30 - 0x1.99999ap-2f) * 0x1.0p1f))));
    if (!((life3_5 == null))) {
        forwardValue5173_117_0 = spill5173_3;
        break forward_join_117;
    }
    if (!((spill5173_3 < 0))) {
        break forward_join_112;
    }
    spill5173_4 = ((net.minecraft.world.World)(this.i)).e(((moom.DT)(life5_42)));
    if (!((life3_5 == null))) {
        forwardValue5173_117_0 = ((spill5173_4) ? 1 : 0);
        break forward_join_117;
    }
    if (!(spill5173_4)) {
        break forward_join_112;
    }
    life6_86 = 1;
    life7_90 = ((net.minecraft.entity.monster.EntitySkeleton)(this)).a__xW(((int)(4)));
    spill5173_5 = life7_90;
    if (!((life3_5 == null))) {
        forwardValue5173_72_0 = spill5173_5;
        break forward_join_72;
    }
    if (!((spill5173_5 != null))) {
        break forward_join_101;
    }
    forwardValue5173_72_0 = life7_90;
    }
    spill5173_6 = ((net.minecraft.item.ItemStack)(forwardValue5173_72_0)).b__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5173_100_0 = ((spill5173_6) ? 1 : 0);
        break forward_join_100;
    }
    if (!(spill5173_6)) {
        break forward_join_99;
    }
    ((net.minecraft.item.ItemStack)(life7_90)).a__Void(((int)((((net.minecraft.item.ItemStack)(life7_90)).b() + ((java.util.Random)(this.ah)).nextInt(((int)(2)))))));
    spill5173_7 = ((net.minecraft.item.ItemStack)(life7_90)).b();
    if (!((life3_5 == null))) {
        forwardValue5173_100_0 = spill5173_7;
        break forward_join_100;
    }
    if (!((spill5173_7 >= ((net.minecraft.item.ItemStack)(life7_90)).d()))) {
        break forward_join_99;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).b(((net.minecraft.item.ItemStack)(life7_90)));
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).b(((int)(4)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5173_100_0 = 0;
    }
    life6_86 = forwardValue5173_100_0;
    }
    spill5173_8 = life6_86;
    if (!((life3_5 == null))) {
        forwardValue5173_117_0 = spill5173_8;
        break forward_join_117;
    }
    if (!((spill5173_8 != 0))) {
        break forward_join_112;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).b(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic5173_31(5477, (3381096079554408861L ^ life1_3)))));
    }
    spill5173_9 = this;
    if (!((life3_5 == null))) {
        forwardValue5173_129_0 = spill5173_9;
        break forward_join_129;
    }
    forwardValue5173_117_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntitySkeleton)(spill5173_9)).i)).G) ? 1 : 0);
    }
    if (!((forwardValue5173_117_0 != 0))) {
        break forward_join_128;
    }
    spill5173_10 = this;
    if (!((life3_5 == null))) {
        forwardValue5173_129_0 = spill5173_10;
        break forward_join_129;
    }
    if (!((((net.minecraft.entity.monster.EntitySkeleton)(spill5173_10)).s() == 1))) {
        break forward_join_128;
    }
    ((net.minecraft.entity.monster.EntitySkeleton)(this)).a__Void(((float)(0x1.70a3d8p-1f)), ((float)(0x1.447ae2p1f)));
    }
    forwardValue5173_129_0 = this;
    }
    __sourceIntrinsic_c7b45e3c376e_call5173_38(forwardValue5173_129_0);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_1523363785a73b65_originalDynamicSite841_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1523363785a73b65_originalDynamicSite841_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1523363785a73b65_originalDynamicSite841_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1523363785a73b65_originalDynamicSite841_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic5173_31(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c7b45e3c376e_call5173_38(net.minecraft.entity.monster.EntitySkeleton a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b9f98ea96d2_invokedynamic5176_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b9f98ea96d2_invokedynamic5176_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic5180_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic9437_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1950_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11488_0() throws E;

private static native <E extends Throwable> float __sourceIntrinsic_0dc4920a9eb6_call5181_3(net.minecraft.entity.monster.EntitySkeleton a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_invokedynamic5182_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_originalDynamicSite1949_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
