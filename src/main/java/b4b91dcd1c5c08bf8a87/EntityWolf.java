package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityWolf extends moom.sS {

private float ce;

private float cf;

private boolean cg;

private boolean ch;

private float ci;

private float cj;

private static long jb;

private static long[] Db;

private static java.lang.Integer[] Eb;

private static java.util.Map Fb;

public EntityWolf(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_b806da53f2751c5b(net.minecraft.entity.passive.EntityWolf receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.passive.EntityWolf.jb ^ 39650611098205L);
    net.minecraft.entity.passive.EntityWolf.__sourceConstructorInit_b806da53f2751c5b_0(((net.minecraft.entity.passive.EntityWolf)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.passive.EntityWolf)(receiver)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.99999ap-1f)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_431bbcca965e47(((net.minecraft.entity.passive.EntityWolf)(receiver))))))).a(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(((net.minecraft.entity.passive.EntityWolf)(receiver)).cd)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uw(receiver, 0x1.99999ap-2f))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)), ((int)(4)), ((moom.uc)(new moom.ue(receiver, 0x1.0p0d, true))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)), ((int)(5)), ((moom.uc)(new moom.uu(receiver, 0x1.0p0d, 0x1.4p3f, 0x1.0p1f))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)), ((int)(__sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_18(26407, (8915472232635855836L ^ local2)))), ((moom.uc)(new moom.uz(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)).a(((int)(__sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_21(8404, (5454009256268215359L ^ local2)))), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)).a(((int)(__sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_24(54, (8937600401283421394L ^ local2)))), ((moom.uc)(new moom.uj(receiver, 0x1.0p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)).a(((int)(__sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_27(31783, (7384578680115947712L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bJ)).a(((int)(__sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_31(13543, (5493566348295413762L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.u1(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.u2(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bK)).a(((int)(3)), ((moom.uc)(new moom.uT(receiver, true, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bK)).a(((int)(4)), ((moom.uc)(new moom.uW(receiver, moom.sK.class, false, __sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_41()))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityWolf)(receiver)).bK)).a(((int)(5)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.monster.EntitySkeleton.class, false))));
    ((net.minecraft.entity.passive.EntityWolf)(receiver)).o(((boolean)(false)));
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(7223913182750033517L)), ((long)(-8202059945263131295L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(144654354710764L)))));
    Fb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.passive.EntityWolf.jb ^ 71145271613760L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1885_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1885_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1885_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1885_14 = new byte[8];
    (__sourceSpill1885_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1885_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1885_16 = __sourceSpill1885_14;
    ((javax.crypto.Cipher)(__sourceSpill1885_11)).init(((int)(__sourceSpill1885_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1885_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1885_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[21];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ó¦j\177^²V\036Ac¯w«pê\035G\037]Bµ1<Ç¹\025Ñø9\000ó¶MG£·â\003gÆgöÝàä\032ïé>üA\037å¥/\003\016ßKßÍ~÷I²Áy¿\004û\021\001îãû}ÞÕ÷\025yhxîµlY/[@ê5»ãÐðyÔ(çN:yÓ\025é1»Uô \031 Vb\r¾íªP=ãJìCä¢¨!³üÊ\033Ã0{ÀÐ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1885_25 = local6_life21;
        int __sourceSpill1885_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1885_25)).substring(((int)(__sourceSpill1885_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1885_30 = local8_life19;
        int __sourceSpill1885_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1885_33 = new byte[8];
        (__sourceSpill1885_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1885_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1885_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1885_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1885_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1885_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1885_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1885_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1885_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1885_34)).doFinal(((byte[])(__sourceSpill1885_33)));
        (__sourceSpill1885_30)[__sourceSpill1885_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Åusa\006¡Mß\030ïnF¨f"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1885_38 = local6_life21;
        int __sourceSpill1885_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1885_38)).substring(((int)(__sourceSpill1885_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1885_43 = local8_life19;
        int __sourceSpill1885_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1885_46 = new byte[8];
        (__sourceSpill1885_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1885_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1885_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1885_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1885_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1885_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1885_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1885_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1885_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1885_47)).doFinal(((byte[])(__sourceSpill1885_46)));
        (__sourceSpill1885_43)[__sourceSpill1885_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Db = ((long[])(local8_life19));
    Eb = ((java.lang.Integer[])(new java.lang.Integer[21]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b806da53f2751c5b_0(net.minecraft.entity.passive.EntityWolf a0, net.minecraft.world.World a1) throws E;

public boolean S__Boolean() {
int forwardValue5358_13_0;
    int forwardValue5358_17_0;
    int forwardValue5358_19_0;
    boolean spill5358_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 54850835128220L);
    life3_5 = moom.vR.c();
    spill5358_0 = ((net.minecraft.entity.passive.EntityWolf)(this)).ah();
    if (!((life3_5 == 0))) {
        forwardValue5358_13_0 = ((spill5358_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5358_0))) {
        break forward_join_18;
    }
    forwardValue5358_13_0 = ((super.S__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5358_17_0 = forwardValue5358_13_0;
        break forward_join_17;
    }
    if (!((forwardValue5358_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5358_17_0 = 1;
    }
    forwardValue5358_19_0 = forwardValue5358_17_0;
    break forward_join_19;
    }
    forwardValue5358_19_0 = 0;
    }
    return ((forwardValue5358_19_0) != 0);
}


protected java.lang.String i__String() {
int forwardValue5373_17_0;
    int forwardValue5373_22_0;
    int forwardValue5373_35_0;
    java.lang.String forwardValue5373_41_0;
    boolean spill5373_0;
    long life1_3;
    int life3_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_38: {
    forward_join_35: {
    forward_join_22: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 114947578712320L);
    life3_5 = moom.vR.c();
    spill5373_0 = ((net.minecraft.entity.passive.EntityWolf)(this)).ah();
    if (!((life3_5 == 0))) {
        forwardValue5373_17_0 = ((spill5373_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill5373_0)) {
        break forward_join_13;
    }
    forwardValue5373_41_0 = "mob.wolf.growl";
    break forward_join_41;
    }
    forwardValue5373_17_0 = ((java.util.Random)(this.ah)).nextInt(((int)(3)));
    }
    if (!((life3_5 == 0))) {
        forwardValue5373_22_0 = forwardValue5373_17_0;
        break forward_join_22;
    }
    if (!((forwardValue5373_17_0 == 0))) {
        break forward_join_40;
    }
    forwardValue5373_22_0 = ((((net.minecraft.entity.passive.EntityWolf)(this)).ae()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5373_35_0 = forwardValue5373_22_0;
        break forward_join_35;
    }
    if (!((forwardValue5373_22_0 != 0))) {
        break forward_join_38;
    }
    forwardValue5373_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.DataWatcher)(this.al)).a__Float(((int)(__sourceIntrinsic_fc475de8b950_invokedynamic5373_9(13295, (2127625531834008652L ^ life1_3))))))), ((float)(0x1.4p3f)));
    }
    if (!((forwardValue5373_35_0 < 0))) {
        break forward_join_38;
    }
    forwardValue5373_41_0 = "mob.wolf.whine";
    break forward_join_41;
    }
    forwardValue5373_41_0 = "mob.wolf.panting";
    break forward_join_41;
    }
    forwardValue5373_41_0 = "mob.wolf.bark";
    }
    return forwardValue5373_41_0;
}


public float b__sourceReturn_e70c882bc6(float p0, float p1) {
int forwardValue5367_36_0;
    float forwardValue5367_53_0;
    float forwardValue5367_53_1;
    int spill5367_0;
    int spill5367_1;
    float spill5367_2;
    float spill5367_3;
    long life3_3;
    float life6_19;
    int life5_20;
    forward_join_53: {
    forward_join_39: {
    forward_join_36: {
    forward_join_31: {
    life3_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 22035060833563L);
    spill5367_0 = moom.vR.b();
    life6_19 = (((this.cj + ((this.ci - this.cj) * p0)) + p1) / 0x1.ccccccp0f);
    life5_20 = spill5367_0;
    spill5367_1 = recovery.source.CarrierOps.fcmpg(((float)(life6_19)), ((float)(0x0.0p0f)));
    if (!((life5_20 != 0))) {
        forwardValue5367_36_0 = spill5367_1;
        break forward_join_36;
    }
    if (!((spill5367_1 < 0))) {
        break forward_join_31;
    }
    life6_19 = 0x0.0p0f;
    if (!((life5_20 == 0))) {
        break forward_join_39;
    }
    }
    spill5367_2 = life6_19;
    spill5367_3 = 0x1.0p0f;
    if (!((life5_20 != 0))) {
        forwardValue5367_53_0 = spill5367_2;
        forwardValue5367_53_1 = spill5367_3;
        break forward_join_53;
    }
    forwardValue5367_36_0 = recovery.source.CarrierOps.fcmpl(((float)(spill5367_2)), ((float)(spill5367_3)));
    }
    if (!((forwardValue5367_36_0 > 0))) {
        break forward_join_39;
    }
    life6_19 = 0x1.0p0f;
    }
    forwardValue5367_53_0 = ((moom.Dr.a(((float)((life6_19 * 0x1.921fb6p1f)))) * moom.Dr.a(((float)(((life6_19 * 0x1.921fb6p1f) * 0x1.6p3f))))) * 0x1.333334p-3f);
    forwardValue5367_53_1 = 0x1.921fb6p1f;
    }
    return (forwardValue5367_53_0 * forwardValue5367_53_1);
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5368_11_0;
    int forwardValue5368_20_0;
    int forwardValue5368_24_0;
    int forwardValue5368_26_0;
    net.minecraft.item.ItemStack spill5368_0;
    int spill5368_1;
    long life2_3;
    int life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    forward_join_11: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 117502732364484L);
    life4_5 = moom.vR.c();
    spill5368_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5368_11_0 = spill5368_0;
        break forward_join_11;
    }
    if (!((spill5368_0 != null))) {
        break forward_join_25;
    }
    forwardValue5368_11_0 = p0;
    }
    spill5368_1 = ((((net.minecraft.item.ItemStack)(forwardValue5368_11_0)).a__wQ() instanceof moom.xp) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue5368_20_0 = spill5368_1;
        break forward_join_20;
    }
    if (!((spill5368_1 != 0))) {
        break forward_join_25;
    }
    forwardValue5368_20_0 = ((((moom.xp)(((moom.xp)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))).i()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5368_24_0 = forwardValue5368_20_0;
        break forward_join_24;
    }
    if (!((forwardValue5368_20_0 != 0))) {
        break forward_join_25;
    }
    forwardValue5368_24_0 = 1;
    }
    forwardValue5368_26_0 = forwardValue5368_24_0;
    break forward_join_26;
    }
    forwardValue5368_26_0 = 0;
    }
    return ((forwardValue5368_26_0) != 0);
}


public float e__Float() {
return (this.H * 0x1.99999ap-1f);
}


protected java.lang.String c__String() {
return "mob.wolf.hurt";
}


public float c__sourceReturn_f6c4892e39(float p0) {
return (0x1.8p-1f + (((this.cj + ((this.ci - this.cj) * p0)) / 0x1.0p1f) * 0x1.0p-2f));
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
int forwardValue5369_26_0;
    int spill5369_0;
    int spill5369_1;
    long life2_3;
    int life5_15;
    int life4_16;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 64959817591882L);
    spill5369_0 = moom.vR.c();
    life5_15 = ((((net.minecraft.entity.Entity)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(((float) ((int) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).b())))))) ? 1 : 0);
    life4_16 = spill5369_0;
    spill5369_1 = life5_15;
    if (!((life4_16 == 0))) {
        forwardValue5369_26_0 = spill5369_1;
        break forward_join_26;
    }
    if (!((spill5369_1 != 0))) {
        break forward_join_25;
    }
    ((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.Entity)(p0)));
    }
    forwardValue5369_26_0 = life5_15;
    }
    return ((forwardValue5369_26_0) != 0);
}


public void c(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.passive.EntityWolf forwardValue5370_19_0;
    net.minecraft.entity.passive.EntityWolf forwardValue5370_24_0;
    net.minecraft.entity.passive.EntityWolf spill5370_0;
    long life2_3;
    int life4_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 26597297465678L);
    life4_5 = moom.vR.b();
    spill5370_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5370_19_0 = spill5370_0;
        break forward_join_19;
    }
    __sourceIntrinsic_4b482c9fdcb0_call5370_2(spill5370_0, p0);
    if (!((p0 == null))) {
        break forward_join_18;
    }
    ((net.minecraft.entity.passive.EntityWolf)(this)).q(((boolean)(false)));
    if (!((life4_5 == 0))) {
        break forward_join_26;
    }
    }
    forwardValue5370_19_0 = this;
    }
    if (!((life4_5 != 0))) {
        forwardValue5370_24_0 = forwardValue5370_19_0;
        break forward_join_24;
    }
    if (!((!((net.minecraft.entity.passive.EntityWolf)(forwardValue5370_19_0)).ae()))) {
        break forward_join_26;
    }
    forwardValue5370_24_0 = this;
    }
    ((net.minecraft.entity.passive.EntityWolf)(forwardValue5370_24_0)).q(((boolean)(true)));
    }
    return;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.passive.EntityWolf forwardValue5371_29_0;
    int forwardValue5371_29_1;
    int spill5371_0;
    net.minecraft.entity.passive.EntityWolf spill5371_1;
    boolean spill5371_2;
    long life2_3;
    int life4_8;
    forward_join_31: {
    forward_join_29: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 116662231746593L);
    spill5371_0 = moom.vR.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5371_0;
    spill5371_1 = this;
    spill5371_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Angry")));
    if (!((life4_8 != 0))) {
        forwardValue5371_29_0 = spill5371_1;
        forwardValue5371_29_1 = ((spill5371_2) ? 1 : 0);
        break forward_join_29;
    }
    ((net.minecraft.entity.passive.EntityWolf)(spill5371_1)).q(((boolean)(spill5371_2)));
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CollarColor")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5371_6(27430, (3621385366520939942L ^ life2_3))))))) {
        break forward_join_31;
    }
    forwardValue5371_29_0 = this;
    forwardValue5371_29_1 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("CollarColor")))));
    }
    ((net.minecraft.entity.passive.EntityWolf)(forwardValue5371_29_0)).a(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.a(((int)(forwardValue5371_29_1))))));
    }
    return;
}


public int n__Int() {
long local1 = (net.minecraft.entity.passive.EntityWolf.jb ^ 132709161947613L);
    return __sourceIntrinsic_11645c1a30d8_originalDynamicSite1995_1(54, (8937640348189013842L ^ local1));
}


protected java.lang.String h__String() {
return "mob.wolf.death";
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.99999ap-2f;
}


public float d__sourceReturn_f6c4892e39(float p0) {
return (((this.cf + ((this.ce - this.cf) * p0)) * 0x1.333334p-3f) * 0x1.921fb6p1f);
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntityWolf.jb ^ 33060113626226L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1996_3(25561, (8595970346609553688L ^ local1)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(((net.minecraft.entity.passive.EntityWolf)(this)).b__sourceReturn_bc607678b6()))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1996_8(29261, (8855869627215388801L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1996_12(23102, (6510153602683341051L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.RED)).a())))))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Angry")), ((boolean)(((net.minecraft.entity.passive.EntityWolf)(this)).ah())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CollarColor")), ((byte)(((byte) ((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntityWolf)(this)).a__sourceReturn_d841ada59b())).b()))));
    return;
}


protected void a__Void() {
net.minecraft.entity.passive.EntityWolf forwardValue5363_26_0;
    int spill5363_0;
    net.minecraft.entity.passive.EntityWolf spill5363_1;
    long life1_3;
    int life3_7;
    forward_join_30: {
    forward_join_26: {
    forward_join_25: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 113968281129233L);
    spill5363_0 = moom.vR.b();
    super.a__Void();
    life3_7 = spill5363_0;
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.333334p-2d)));
    spill5363_1 = this;
    if (!((life3_7 != 0))) {
        forwardValue5363_26_0 = spill5363_1;
        break forward_join_26;
    }
    if (!(((net.minecraft.entity.passive.EntityWolf)(spill5363_1)).ae())) {
        break forward_join_25;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p4d)));
    if (!((life3_7 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue5363_26_0 = this;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(forwardValue5363_26_0)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p3d)));
    }
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.passive.EntityWolf)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.0p1d)));
    return;
}


public void a(net.minecraft.item.EnumDyeColor p0) {
long local2 = (net.minecraft.entity.passive.EntityWolf.jb ^ 94512441156245L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_ad257e093cd9_originalDynamicSite1997_2(709, (2365572109639681765L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (((net.minecraft.item.EnumDyeColor)(p0)).b() & __sourceIntrinsic_ad257e093cd9_originalDynamicSite1997_4(103, (7679372432715908178L ^ local2))))))))));
    return;
}


public void a(byte p0) {
long life2_3;
    int life4_5;
    forward_join_29: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 132255077194864L);
    life4_5 = moom.vR.b();
    if (!((life4_5 != 0))) { break forward_join_24; }
    if (!((p0 == __sourceIntrinsic_6121ff5511c4_invokedynamic6012_2(54, (8937640235623299839L ^ life2_3))))) { break forward_join_26; }
    this.ch = ((boolean)(true));
    this.ci = ((float)(0x0.0p0f));
    this.cj = ((float)(0x0.0p0f));
    }
    if (!((life4_5 == 0))) { break forward_join_29; }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue5361_18_0;
    int forwardValue5361_66_0;
    int forwardValue5361_77_0;
    net.minecraft.item.Item forwardValue5361_82_0;
    net.minecraft.item.ItemStack forwardValue5361_85_0;
    int forwardValue5361_121_0;
    int forwardValue5361_125_0;
    moom.uP forwardValue5361_148_0;
    int forwardValue5361_148_1;
    moom.uP forwardValue5361_149_0;
    moom.uP forwardValue5361_150_0;
    int forwardValue5361_150_1;
    net.minecraft.item.ItemStack forwardValue5361_167_0;
    int forwardValue5361_189_0;
    int forwardValue5361_202_0;
    net.minecraft.entity.passive.EntityWolf forwardValue5361_251_0;
    int forwardValue5361_260_0;
    int forwardValue5361_264_0;
    int spill5361_0;
    net.minecraft.item.ItemStack spill5361_1;
    net.minecraft.item.Item spill5361_2;
    boolean spill5361_3;
    int spill5361_4;
    boolean spill5361_5;
    net.minecraft.item.ItemStack spill5361_6;
    int spill5361_7;
    boolean spill5361_8;
    int spill5361_9;
    boolean spill5361_10;
    boolean spill5361_11;
    moom.uP spill5361_12;
    boolean spill5361_13;
    net.minecraft.item.ItemStack spill5361_14;
    boolean spill5361_15;
    boolean spill5361_16;
    net.minecraft.entity.passive.EntityWolf spill5361_17;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    net.minecraft.item.Item life7_25;
    moom.xp life6_36;
    net.minecraft.item.EnumDyeColor life7_128;
    forward_join_264: {
    forward_join_261: {
    forward_join_260: {
    forward_join_259: {
    forward_join_251: {
    forward_join_247: {
    forward_join_202: {
    forward_join_199: {
    forward_join_189: {
    forward_join_187: {
    forward_join_167: {
    forward_join_162: {
    forward_join_150: {
    forward_join_149: {
    forward_join_148: {
    forward_join_125: {
    forward_join_122: {
    forward_join_121: {
    forward_join_120: {
    forward_join_85: {
    forward_join_82: {
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_66: {
    forward_join_58: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 81225674098329L);
    spill5361_0 = moom.vR.b();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill5361_0;
    if (!(((net.minecraft.entity.passive.EntityWolf)(this)).ae())) {
        break forward_join_162;
    }
    spill5361_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue5361_18_0 = spill5361_1;
        break forward_join_18;
    }
    if (!((spill5361_1 != null))) {
        break forward_join_122;
    }
    forwardValue5361_18_0 = life5_8;
    }
    life7_25 = ((net.minecraft.item.ItemStack)(forwardValue5361_18_0)).a__wQ();
    spill5361_2 = life7_25;
    if (!((life4_9 != 0))) {
        forwardValue5361_82_0 = spill5361_2;
        break forward_join_82;
    }
    if (!((((spill5361_2 instanceof moom.xp) ? 1 : 0) != 0))) {
        break forward_join_78;
    }
    life6_36 = ((moom.xp)(life7_25));
    spill5361_3 = ((moom.xp)(life6_36)).i();
    if (!((life4_9 != 0))) {
        forwardValue5361_125_0 = ((spill5361_3) ? 1 : 0);
        break forward_join_125;
    }
    if (!(spill5361_3)) {
        break forward_join_122;
    }
    spill5361_4 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.DataWatcher)(this.al)).a__Float(((int)(__sourceIntrinsic_d6a7991b4c91_invokedynamic5361_11(13295, (2127662144331699157L ^ life2_3))))))), ((float)(0x1.4p4f)));
    if (!((life4_9 != 0))) {
        forwardValue5361_125_0 = spill5361_4;
        break forward_join_125;
    }
    if (!((spill5361_4 < 0))) {
        break forward_join_122;
    }
    spill5361_5 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_9 != 0))) {
        forwardValue5361_66_0 = ((spill5361_5) ? 1 : 0);
        break forward_join_66;
    }
    if (!((!spill5361_5))) {
        break forward_join_58;
    }
    net.minecraft.item.ItemStack __stackOp5361_17_0 = life5_8;
    ((net.minecraft.item.ItemStack)(__stackOp5361_17_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5361_17_0)).b - 1)));
    }
    ((net.minecraft.entity.passive.EntityWolf)(this)).c(((float)(((float) ((moom.xp)(life6_36)).b(((net.minecraft.item.ItemStack)(life5_8)))))));
    forwardValue5361_66_0 = ((net.minecraft.item.ItemStack)(life5_8)).b;
    }
    if (!((life4_9 != 0))) {
        forwardValue5361_77_0 = forwardValue5361_66_0;
        break forward_join_77;
    }
    if (!((forwardValue5361_66_0 <= 0))) {
        break forward_join_76;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5361_77_0 = 1;
    }
    return ((forwardValue5361_77_0) != 0);
    }
    spill5361_6 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue5361_85_0 = spill5361_6;
        break forward_join_85;
    }
    forwardValue5361_82_0 = ((net.minecraft.item.ItemStack)(spill5361_6)).a__wQ();
    }
    if (!((forwardValue5361_82_0 == net.minecraft.init.Items.aW))) {
        break forward_join_122;
    }
    forwardValue5361_85_0 = life5_8;
    }
    spill5361_7 = ((net.minecraft.item.ItemStack)(forwardValue5361_85_0)).c();
    if (!((life4_9 != 0))) {
        forwardValue5361_125_0 = spill5361_7;
        break forward_join_125;
    }
    life7_128 = net.minecraft.item.EnumDyeColor.a(((int)(spill5361_7)));
    if (!((life7_128 != ((net.minecraft.entity.passive.EntityWolf)(this)).a__sourceReturn_d841ada59b()))) {
        break forward_join_122;
    }
    ((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.item.EnumDyeColor)(life7_128)));
    spill5361_8 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_9 != 0))) {
        forwardValue5361_121_0 = ((spill5361_8) ? 1 : 0);
        break forward_join_121;
    }
    if (!((!spill5361_8))) {
        break forward_join_120;
    }
    net.minecraft.item.ItemStack __stackOp5361_37_0 = life5_8;
    net.minecraft.item.ItemStack __stackOp5361_39_0 = __stackOp5361_37_0;
    int __stackOp5361_39_1 = (((net.minecraft.item.ItemStack)(__stackOp5361_37_0)).b - 1);
    spill5361_9 = __stackOp5361_39_1;
    ((net.minecraft.item.ItemStack)(__stackOp5361_39_0)).b = ((int)(__stackOp5361_39_1));
    if (!((life4_9 != 0))) {
        forwardValue5361_121_0 = spill5361_9;
        break forward_join_121;
    }
    if (!((spill5361_9 <= 0))) {
        break forward_join_120;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5361_121_0 = 1;
    }
    return ((forwardValue5361_121_0) != 0);
    }
    forwardValue5361_125_0 = ((((net.minecraft.entity.passive.EntityWolf)(this)).b__sourceReturn_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(p0)))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue5361_264_0 = forwardValue5361_125_0;
        break forward_join_264;
    }
    if (!((forwardValue5361_125_0 != 0))) {
        break forward_join_261;
    }
    spill5361_10 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_9 != 0))) {
        forwardValue5361_264_0 = ((spill5361_10) ? 1 : 0);
        break forward_join_264;
    }
    if (!((!spill5361_10))) {
        break forward_join_261;
    }
    spill5361_11 = ((net.minecraft.entity.passive.EntityWolf)(this)).b__Boolean(((net.minecraft.item.ItemStack)(life5_8)));
    if (!((life4_9 != 0))) {
        forwardValue5361_264_0 = ((spill5361_11) ? 1 : 0);
        break forward_join_264;
    }
    if (!((!spill5361_11))) {
        break forward_join_261;
    }
    spill5361_12 = this.cd;
    spill5361_13 = ((net.minecraft.entity.passive.EntityWolf)(this)).af();
    if (!((life4_9 != 0))) {
        forwardValue5361_148_0 = spill5361_12;
        forwardValue5361_148_1 = ((spill5361_13) ? 1 : 0);
        break forward_join_148;
    }
    if (!((!spill5361_13))) {
        forwardValue5361_149_0 = spill5361_12;
        break forward_join_149;
    }
    forwardValue5361_148_0 = spill5361_12;
    forwardValue5361_148_1 = 1;
    }
    forwardValue5361_150_0 = forwardValue5361_148_0;
    forwardValue5361_150_1 = forwardValue5361_148_1;
    break forward_join_150;
    }
    forwardValue5361_150_0 = forwardValue5361_149_0;
    forwardValue5361_150_1 = 0;
    }
    ((moom.uP)(forwardValue5361_150_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5361_150_1))));
    this.bi = ((boolean)(false));
    ((moom.AV)(this.bI)).c();
    ((net.minecraft.entity.passive.EntityWolf)(this)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    if (!((life4_9 == 0))) {
        break forward_join_261;
    }
    }
    spill5361_14 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue5361_167_0 = spill5361_14;
        break forward_join_167;
    }
    if (!((spill5361_14 != null))) {
        break forward_join_261;
    }
    forwardValue5361_167_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5361_167_0)).a__wQ() == net.minecraft.init.Items.aX))) {
        break forward_join_261;
    }
    spill5361_15 = ((net.minecraft.entity.passive.EntityWolf)(this)).ah();
    if (!((life4_9 != 0))) {
        forwardValue5361_264_0 = ((spill5361_15) ? 1 : 0);
        break forward_join_264;
    }
    if (!((!spill5361_15))) {
        break forward_join_261;
    }
    spill5361_16 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_9 != 0))) {
        forwardValue5361_189_0 = ((spill5361_16) ? 1 : 0);
        break forward_join_189;
    }
    if (!((!spill5361_16))) {
        break forward_join_187;
    }
    net.minecraft.item.ItemStack __stackOp5361_68_0 = life5_8;
    ((net.minecraft.item.ItemStack)(__stackOp5361_68_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5361_68_0)).b - 1)));
    }
    forwardValue5361_189_0 = ((net.minecraft.item.ItemStack)(life5_8)).b;
    }
    if (!((life4_9 != 0))) {
        forwardValue5361_202_0 = forwardValue5361_189_0;
        break forward_join_202;
    }
    if (!((forwardValue5361_189_0 <= 0))) {
        break forward_join_199;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5361_202_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue5361_260_0 = forwardValue5361_202_0;
        break forward_join_260;
    }
    if (!((forwardValue5361_202_0 == 0))) {
        break forward_join_259;
    }
    spill5361_17 = this;
    if (!((life4_9 != 0))) {
        forwardValue5361_251_0 = spill5361_17;
        break forward_join_251;
    }
    if (!((((java.util.Random)(((net.minecraft.entity.passive.EntityWolf)(spill5361_17)).ah)).nextInt(((int)(3))) == 0))) {
        break forward_join_247;
    }
    ((net.minecraft.entity.passive.EntityWolf)(this)).o(((boolean)(true)));
    ((moom.AV)(this.bI)).c();
    ((net.minecraft.entity.passive.EntityWolf)(this)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    ((moom.uP)(this.cd)).a(((boolean)(true)));
    ((net.minecraft.entity.passive.EntityWolf)(this)).d(((float)(0x1.4p4f)));
    ((net.minecraft.entity.passive.EntityWolf)(this)).b(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__UUID())).toString())));
    ((net.minecraft.entity.passive.EntityWolf)(this)).n(((boolean)(true)));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_d6a7991b4c91_invokedynamic5361_93(23350, (2261051888711482125L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        break forward_join_259;
    }
    }
    ((net.minecraft.entity.passive.EntityWolf)(this)).n(((boolean)(false)));
    forwardValue5361_251_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityWolf)(forwardValue5361_251_0)).i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_d6a7991b4c91_invokedynamic5361_97(1055, (905241971613066298L ^ life2_3)))));
    }
    forwardValue5361_260_0 = 1;
    }
    return ((forwardValue5361_260_0) != 0);
    }
    forwardValue5361_264_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((forwardValue5361_264_0) != 0);
}


public net.minecraft.item.EnumDyeColor a__sourceReturn_d841ada59b() {
long local1 = (net.minecraft.entity.passive.EntityWolf.jb ^ 76189119422648L);
    return net.minecraft.item.EnumDyeColor.a(((int)((((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_fc36484f3d63_originalDynamicSite1998_2(709, (2365555229396059336L ^ local1))))) & __sourceIntrinsic_fc36484f3d63_originalDynamicSite1998_4(22549, (3603507895141047839L ^ local1))))));
}


public boolean a(moom.sK p0) {
int forwardValue5359_20_0;
    int forwardValue5359_29_0;
    int forwardValue5359_37_0;
    int forwardValue5359_42_0;
    int forwardValue5359_47_0;
    int forwardValue5359_51_0;
    int forwardValue5359_53_0;
    boolean spill5359_0;
    boolean spill5359_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.passive.EntityWolf life5_35;
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_47: {
    forward_join_42: {
    forward_join_37: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_20: {
    forward_join_18: {
    forward_join_11: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 119418274303285L);
    life4_5 = moom.vR.b();
    if (!((p0 == this))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    spill5359_0 = ((net.minecraft.entity.passive.EntityWolf)(this)).ae();
    if (!((life4_5 != 0))) {
        forwardValue5359_20_0 = ((spill5359_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill5359_0))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue5359_20_0 = ((p0 instanceof net.minecraft.entity.passive.EntityWolf) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5359_29_0 = forwardValue5359_20_0;
        break forward_join_29;
    }
    if (!((forwardValue5359_20_0 != 0))) {
        break forward_join_28;
    }
    life5_35 = ((net.minecraft.entity.passive.EntityWolf)(p0));
    if (!((life4_5 == 0))) {
        break forward_join_30;
    }
    }
    forwardValue5359_29_0 = 0;
    }
    return ((forwardValue5359_29_0) != 0);
    }
    spill5359_1 = ((net.minecraft.entity.passive.EntityWolf)(life5_35)).ae();
    if (!((life4_5 != 0))) {
        forwardValue5359_37_0 = ((spill5359_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill5359_1)) {
        break forward_join_52;
    }
    forwardValue5359_37_0 = ((((net.minecraft.entity.passive.EntityWolf)(life5_35)).af()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5359_42_0 = forwardValue5359_37_0;
        break forward_join_42;
    }
    if (!((forwardValue5359_37_0 == 0))) {
        break forward_join_52;
    }
    forwardValue5359_42_0 = ((((net.minecraft.entity.passive.EntityWolf)(this)).ad()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5359_47_0 = forwardValue5359_42_0;
        break forward_join_47;
    }
    if (!((forwardValue5359_42_0 != 0))) {
        break forward_join_52;
    }
    forwardValue5359_47_0 = ((((net.minecraft.entity.passive.EntityWolf)(life5_35)).ad()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5359_51_0 = forwardValue5359_47_0;
        break forward_join_51;
    }
    if (!((forwardValue5359_47_0 != 0))) {
        break forward_join_52;
    }
    forwardValue5359_51_0 = 1;
    }
    forwardValue5359_53_0 = forwardValue5359_51_0;
    break forward_join_53;
    }
    forwardValue5359_53_0 = 0;
    }
    return ((forwardValue5359_53_0) != 0);
}


public net.minecraft.entity.passive.EntityWolf a__sU(moom.sJ p0) {
java.lang.String forwardValue5364_21_0;
    int spill5364_0;
    java.lang.String spill5364_1;
    long life2_3;
    net.minecraft.entity.passive.EntityWolf life5_10;
    java.lang.String life6_13;
    int life4_14;
    forward_join_29: {
    forward_join_21: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 15557681370083L);
    spill5364_0 = moom.vR.c();
    life5_10 = new net.minecraft.entity.passive.EntityWolf(this.i);
    life6_13 = ((net.minecraft.entity.passive.EntityWolf)(this)).b__sourceReturn_0e30dfc966();
    life4_14 = spill5364_0;
    spill5364_1 = life6_13;
    if (!((life4_14 == 0))) {
        forwardValue5364_21_0 = spill5364_1;
        break forward_join_21;
    }
    if (!((spill5364_1 != null))) {
        break forward_join_29;
    }
    forwardValue5364_21_0 = ((java.lang.String)(life6_13)).trim();
    }
    if (!((((java.lang.String)(forwardValue5364_21_0)).length() > 0))) {
        break forward_join_29;
    }
    ((net.minecraft.entity.passive.EntityWolf)(life5_10)).b(((java.lang.String)(life6_13)));
    ((net.minecraft.entity.passive.EntityWolf)(life5_10)).o(((boolean)(true)));
    }
    return life5_10;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.passive.EntityWolf)(this)).a(((java.lang.String)("mob.wolf.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


public moom.sJ a(moom.sJ p0) {
return ((net.minecraft.entity.passive.EntityWolf)(this)).a__sU(((moom.sJ)(p0)));
}


protected net.minecraft.item.Item a__wQ() {
return __sourceExactCall_b9094f5c198ccd(((int)(-1)));
}


public boolean a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.EntityLivingBase p1) {
net.minecraft.entity.EntityLivingBase forwardValue5360_38_0;
    int forwardValue5360_39_0;
    int forwardValue5360_57_0;
    int forwardValue5360_67_0;
    int forwardValue5360_69_0;
    int forwardValue5360_71_0;
    int spill5360_0;
    int spill5360_1;
    int spill5360_2;
    boolean spill5360_3;
    net.minecraft.entity.EntityLivingBase spill5360_4;
    int spill5360_5;
    boolean spill5360_6;
    boolean spill5360_7;
    long life3_3;
    int life5_5;
    net.minecraft.entity.passive.EntityWolf life6_38;
    forward_join_71: {
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_57: {
    forward_join_55: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    life3_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 96012222417170L);
    life5_5 = moom.vR.b();
    spill5360_0 = ((p0 instanceof net.minecraft.entity.monster.EntityCreeper) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5360_71_0 = spill5360_0;
        break forward_join_71;
    }
    if (!((spill5360_0 == 0))) {
        break forward_join_70;
    }
    spill5360_1 = ((p0 instanceof net.minecraft.entity.monster.EntityGhast) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5360_71_0 = spill5360_1;
        break forward_join_71;
    }
    if (!((spill5360_1 == 0))) {
        break forward_join_70;
    }
    spill5360_2 = ((p0 instanceof net.minecraft.entity.passive.EntityWolf) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5360_39_0 = spill5360_2;
        break forward_join_39;
    }
    if (!((spill5360_2 != 0))) {
        break forward_join_37;
    }
    life6_38 = ((net.minecraft.entity.passive.EntityWolf)(p0));
    spill5360_3 = ((net.minecraft.entity.passive.EntityWolf)(life6_38)).ae();
    if (!((life5_5 != 0))) {
        forwardValue5360_39_0 = ((spill5360_3) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill5360_3)) {
        break forward_join_37;
    }
    spill5360_4 = ((net.minecraft.entity.passive.EntityWolf)(life6_38)).e__sourceReturn_d30556f370();
    if (!((life5_5 != 0))) {
        forwardValue5360_38_0 = spill5360_4;
        break forward_join_38;
    }
    if (!((spill5360_4 == p1))) {
        break forward_join_37;
    }
    return ((0) != 0);
    }
    forwardValue5360_38_0 = p0;
    }
    forwardValue5360_39_0 = ((forwardValue5360_38_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5360_57_0 = forwardValue5360_39_0;
        break forward_join_57;
    }
    if (!((forwardValue5360_39_0 != 0))) {
        break forward_join_55;
    }
    spill5360_5 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5360_57_0 = spill5360_5;
        break forward_join_57;
    }
    if (!((spill5360_5 != 0))) {
        break forward_join_55;
    }
    spill5360_6 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p1)))).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))));
    if (!((life5_5 != 0))) {
        forwardValue5360_57_0 = ((spill5360_6) ? 1 : 0);
        break forward_join_57;
    }
    if (!(spill5360_6)) {
        break forward_join_68;
    }
    }
    forwardValue5360_57_0 = ((p0 instanceof net.minecraft.entity.passive.EntityHorse) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5360_67_0 = forwardValue5360_57_0;
        break forward_join_67;
    }
    if (!((forwardValue5360_57_0 != 0))) {
        break forward_join_66;
    }
    spill5360_7 = ((net.minecraft.entity.passive.EntityHorse)(((net.minecraft.entity.passive.EntityHorse)(p0)))).af__Boolean();
    if (!((life5_5 != 0))) {
        forwardValue5360_67_0 = ((spill5360_7) ? 1 : 0);
        break forward_join_67;
    }
    if (!((!spill5360_7))) {
        break forward_join_68;
    }
    }
    forwardValue5360_67_0 = 1;
    }
    forwardValue5360_69_0 = forwardValue5360_67_0;
    break forward_join_69;
    }
    forwardValue5360_69_0 = 0;
    }
    return ((forwardValue5360_69_0) != 0);
    }
    forwardValue5360_71_0 = 0;
    }
    return ((forwardValue5360_71_0) != 0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.Entity forwardValue5362_16_0;
    net.minecraft.entity.passive.EntityWolf forwardValue5362_42_0;
    int forwardValue5362_45_0;
    net.minecraft.entity.passive.EntityWolf spill5362_0;
    net.minecraft.entity.passive.EntityWolf spill5362_1;
    int spill5362_2;
    int spill5362_3;
    long life3_3;
    int life5_5;
    net.minecraft.entity.Entity life6_21;
    forward_join_45: {
    forward_join_42: {
    forward_join_41: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 15199720655011L);
    life5_5 = moom.vR.b();
    spill5362_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5362_16_0 = spill5362_0;
        break forward_join_16;
    }
    if (!(((net.minecraft.entity.passive.EntityWolf)(spill5362_0)).a(((net.minecraft.util.DamageSource)(p0))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue5362_16_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    life6_21 = forwardValue5362_16_0;
    spill5362_1 = this;
    if (!((life5_5 != 0))) {
        forwardValue5362_42_0 = spill5362_1;
        break forward_join_42;
    }
    ((moom.uP)(((net.minecraft.entity.passive.EntityWolf)(spill5362_1)).cd)).a(((boolean)(false)));
    if (!((life6_21 != null))) {
        break forward_join_41;
    }
    spill5362_2 = ((life6_21 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5362_45_0 = spill5362_2;
        break forward_join_45;
    }
    if (!((spill5362_2 == 0))) {
        break forward_join_41;
    }
    spill5362_3 = ((life6_21 instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5362_45_0 = spill5362_3;
        break forward_join_45;
    }
    if (!((spill5362_3 == 0))) {
        break forward_join_41;
    }
    p1 = ((p1 + 0x1.0p0f) / 0x1.0p1f);
    }
    forwardValue5362_42_0 = this;
    }
    forwardValue5362_45_0 = ((__sourceIntrinsic_153a193fc182_call5362_9(forwardValue5362_42_0, p0, p1)) ? 1 : 0);
    }
    return ((forwardValue5362_45_0) != 0);
}


public int m__Int() {
net.minecraft.entity.passive.EntityWolf forwardValue5376_18_0;
    int forwardValue5376_19_0;
    net.minecraft.entity.passive.EntityWolf spill5376_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 63822611955697L);
    life3_5 = moom.vR.c();
    spill5376_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5376_18_0 = spill5376_0;
        break forward_join_18;
    }
    if (!(((net.minecraft.entity.passive.EntityWolf)(spill5376_0)).af())) {
        break forward_join_17;
    }
    forwardValue5376_19_0 = __sourceIntrinsic_a55dda021a68_invokedynamic5376_3(709, (2365617625423371137L ^ life1_3));
    break forward_join_19;
    }
    forwardValue5376_18_0 = this;
    }
    forwardValue5376_19_0 = __sourceIntrinsic_a55dda021a68_call5376_4(forwardValue5376_18_0);
    }
    return forwardValue5376_19_0;
}


public float m__sourceReturn_bc607678b6() {
int forwardValue5375_15_0;
    float forwardValue5375_34_0;
    boolean spill5375_0;
    long life1_3;
    int life3_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 86257055129448L);
    life3_5 = moom.vR.b();
    spill5375_0 = ((net.minecraft.entity.passive.EntityWolf)(this)).ah();
    if (!((life3_5 != 0))) {
        forwardValue5375_15_0 = ((spill5375_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill5375_0)) {
        break forward_join_13;
    }
    forwardValue5375_34_0 = 0x1.8a14d6p0f;
    break forward_join_34;
    }
    forwardValue5375_15_0 = ((((net.minecraft.entity.passive.EntityWolf)(this)).ae()) ? 1 : 0);
    }
    if (!((forwardValue5375_15_0 != 0))) {
        break forward_join_33;
    }
    forwardValue5375_34_0 = ((0x1.19999ap-1f - ((0x1.4p4f - ((net.minecraft.entity.DataWatcher)(this.al)).a__Float(((int)(__sourceIntrinsic_3313449ea9be_invokedynamic5375_7(13295, (2127668103696157220L ^ life1_3)))))) * 0x1.47ae14p-6f)) * 0x1.921fb6p1f);
    break forward_join_34;
    }
    forwardValue5375_34_0 = 0x1.41b2f8p-1f;
    }
    return forwardValue5375_34_0;
}


public void o(boolean p0) {
net.minecraft.entity.passive.EntityWolf forwardValue5377_21_0;
    net.minecraft.entity.passive.EntityWolf spill5377_0;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 73617201138285L);
    life4_5 = moom.vR.c();
    spill5377_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue5377_21_0 = spill5377_0;
        break forward_join_21;
    }
    __sourceIntrinsic_e276b0aa449e_call5377_2(spill5377_0, p0);
    if (!(p0)) {
        break forward_join_20;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p4d)));
    if (!((life4_5 != 0))) {
        break forward_join_25;
    }
    }
    forwardValue5377_21_0 = this;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(forwardValue5377_21_0)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p3d)));
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityWolf)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.0p2d)));
    return;
}


private static int g(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntityWolf.g(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite g(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_52b5e237b1bd_methodHandleLiteral11712_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int g(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20494;
      if (Eb[var3] == null) {
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
         long var5 = Db[var3];
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
         Object[] var9 = (Object[])Fb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Fb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Eb[var3] = var15;
      }

      return Eb[var3];
}


public void g__Void() {
net.minecraft.entity.passive.EntityWolf lexicalValue1615_31_0;
    int lexicalValue1615_62_0;
    int lexicalValue1615_72_0;
    int lexicalValue1615_79_0;
    int lexicalValue1615_112_0;
    int lexicalValue1615_133_0;
    float lexicalValue1615_138_0;
    int spill1615_0;
    net.minecraft.entity.passive.EntityWolf spill1615_1;
    boolean spill1615_2;
    boolean spill1615_3;
    float spill1615_4;
    long life1_3;
    int life3_7;
    float life4_192;
    int life5_203;
    int life6_205;
    float life7_221;
    float life8_234;
    lexical_join_210: {
    lexical_join_138: {
    lexical_join_133: {
    lexical_join_127: {
    lexical_join_112: {
    lexical_join_98: {
    lexical_join_79: {
    lexical_join_72: {
    lexical_join_70: {
    lexical_join_62: {
    lexical_join_60: {
    lexical_join_41: {
    lexical_join_31: {
    lexical_join_30: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 104358228698965L);
    spill1615_0 = moom.vR.b();
    super.g__Void();
    life3_7 = spill1615_0;
    this.cf = ((float)(this.ce));
    spill1615_1 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1615_31_0 = spill1615_1;
        break lexical_join_31;
    }
    if (!(((net.minecraft.entity.passive.EntityWolf)(spill1615_1)).ai())) {
        break lexical_join_30;
    }
    net.minecraft.entity.passive.EntityWolf __stackOp1615_6_0 = this;
    ((net.minecraft.entity.passive.EntityWolf)(__stackOp1615_6_0)).ce = ((float)((((net.minecraft.entity.passive.EntityWolf)(__stackOp1615_6_0)).ce + ((0x1.0p0f - this.ce) * 0x1.99999ap-2f))));
    if (!((life3_7 == 0))) {
        break lexical_join_41;
    }
    }
    lexicalValue1615_31_0 = this;
    }
    net.minecraft.entity.passive.EntityWolf __stackOp1615_10_0 = lexicalValue1615_31_0;
    ((net.minecraft.entity.passive.EntityWolf)(__stackOp1615_10_0)).ce = ((float)((((net.minecraft.entity.passive.EntityWolf)(__stackOp1615_10_0)).ce + ((0x0.0p0f - this.ce) * 0x1.99999ap-2f))));
    }
    spill1615_2 = ((net.minecraft.entity.passive.EntityWolf)(this)).i__Boolean();
    if (!((life3_7 != 0))) {
        lexicalValue1615_62_0 = ((spill1615_2) ? 1 : 0);
        break lexical_join_62;
    }
    if (!(spill1615_2)) {
        break lexical_join_60;
    }
    this.cg = ((boolean)(true));
    this.ch = ((boolean)(false));
    this.ci = ((float)(0x0.0p0f));
    this.cj = ((float)(0x0.0p0f));
    if (!((life3_7 == 0))) {
        break lexical_join_210;
    }
    }
    lexicalValue1615_62_0 = ((this.cg) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        lexicalValue1615_72_0 = lexicalValue1615_62_0;
        break lexical_join_72;
    }
    if (!((lexicalValue1615_62_0 == 0))) {
        break lexical_join_70;
    }
    spill1615_3 = this.ch;
    if (!((life3_7 != 0))) {
        lexicalValue1615_72_0 = ((spill1615_3) ? 1 : 0);
        break lexical_join_72;
    }
    if (!(spill1615_3)) {
        break lexical_join_210;
    }
    }
    lexicalValue1615_72_0 = ((this.ch) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        lexicalValue1615_79_0 = lexicalValue1615_72_0;
        break lexical_join_79;
    }
    if (!((lexicalValue1615_72_0 != 0))) {
        break lexical_join_210;
    }
    lexicalValue1615_79_0 = recovery.source.CarrierOps.fcmpl(((float)(this.ci)), ((float)(0x0.0p0f)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1615_112_0 = lexicalValue1615_79_0;
        break lexical_join_112;
    }
    if (!((lexicalValue1615_79_0 == 0))) {
        break lexical_join_98;
    }
    ((net.minecraft.entity.passive.EntityWolf)(this)).a(((java.lang.String)("mob.wolf.shake")), ((float)(((net.minecraft.entity.passive.EntityWolf)(this)).f__sourceReturn_bc607678b6())), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    }
    this.cj = ((float)(this.ci));
    net.minecraft.entity.passive.EntityWolf __stackOp1615_36_0 = this;
    ((net.minecraft.entity.passive.EntityWolf)(__stackOp1615_36_0)).ci = ((float)((((net.minecraft.entity.passive.EntityWolf)(__stackOp1615_36_0)).ci + 0x1.99999ap-5f)));
    lexicalValue1615_112_0 = recovery.source.CarrierOps.fcmpl(((float)(this.cj)), ((float)(0x1.0p1f)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1615_133_0 = lexicalValue1615_112_0;
        break lexical_join_133;
    }
    if (!((lexicalValue1615_112_0 >= 0))) {
        break lexical_join_127;
    }
    this.cg = ((boolean)(false));
    this.ch = ((boolean)(false));
    this.cj = ((float)(0x0.0p0f));
    this.ci = ((float)(0x0.0p0f));
    }
    spill1615_4 = this.ci;
    if (!((life3_7 != 0))) {
        lexicalValue1615_138_0 = spill1615_4;
        break lexical_join_138;
    }
    lexicalValue1615_133_0 = recovery.source.CarrierOps.fcmpl(((float)(spill1615_4)), ((float)(0x1.99999ap-2f)));
    }
    if (!((lexicalValue1615_133_0 > 0))) {
        break lexical_join_210;
    }
    lexicalValue1615_138_0 = ((float) ((moom.CA)(((net.minecraft.entity.passive.EntityWolf)(this)).b())).c);
    }
    life4_192 = lexicalValue1615_138_0;
    life5_203 = ((int) (moom.Dr.a(((float)(((this.ci - 0x1.99999ap-2f) * 0x1.921fb6p1f)))) * 0x1.cp2f));
    life6_205 = 0;
    lexical_cycle_152: while (true) {
    if (!((life6_205 < life5_203))) {
        break lexical_join_210;
    }
    life7_221 = ((((((java.util.Random)(this.ah)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * this.G) * 0x1.0p-1f);
    life8_234 = ((((((java.util.Random)(this.ah)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * this.G) * 0x1.0p-1f);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_SPLASH)), ((double)((this.n + ((double) life7_221)))), ((double)(((double) (life4_192 + 0x1.99999ap-1f)))), ((double)((this.p + ((double) life8_234)))), ((double)(this.t)), ((double)(this.u)), ((double)(this.v)), ((int[])(new int[0])));
    life6_205 += 1;
    if (!((life3_7 == 0))) { continue lexical_cycle_152; }
    break lexical_cycle_152;
    }
    }
    return;
}


public void q(boolean p0) {
long life2_3;
    int life5_13;
    int life4_14;
    forward_join_51: {
    forward_join_34: {
    forward_join_32: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 60291196593771L);
    int spill6032_0 = moom.vR.c();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_f6925daff8ea_invokedynamic6032_3(2519, (5771497684126648583L ^ life2_3)))));
    life4_14 = spill6032_0;
    if (!((life4_14 == 0))) { break forward_join_32; }
    if (!(p0)) { break forward_join_34; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_f6925daff8ea_invokedynamic6032_6(2519, (5771497684126648583L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 | 2))))))));
    }
    if (!((life4_14 != 0))) { break forward_join_51; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_f6925daff8ea_invokedynamic6032_10(2519, (5771497684126648583L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 & __sourceIntrinsic_f6925daff8ea_invokedynamic6032_11(143, (4732372073644605529L ^ life2_3))))))))));
    }
    return;
}


public void r(boolean p0) {
long life2_3;
    int life4_5;
    forward_join_32: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 121835787904051L);
    life4_5 = moom.vR.c();
    if (!((life4_5 == 0))) { break forward_join_20; }
    if (!(p0)) { break forward_join_22; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_c6ebbb4b0157_invokedynamic6033_3(14686, (2251599615154764764L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(1))))));
    }
    if (!((life4_5 != 0))) { break forward_join_32; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_c6ebbb4b0157_invokedynamic6033_7(14686, (2251599615154764764L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    }
    return;
}


private static boolean lambda$new$0(net.minecraft.entity.Entity p0) {
int forwardValue5374_17_0;
    int forwardValue5374_19_0;
    int spill5374_0;
    int spill5374_1;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 7745802751727L);
    life3_5 = moom.vR.b();
    spill5374_0 = ((p0 instanceof net.minecraft.entity.passive.EntitySheep) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue5374_17_0 = spill5374_0;
        break forward_join_17;
    }
    if (!((spill5374_0 == 0))) {
        break forward_join_16;
    }
    spill5374_1 = ((p0 instanceof net.minecraft.entity.passive.EntityRabbit) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue5374_17_0 = spill5374_1;
        break forward_join_17;
    }
    if (!((spill5374_1 != 0))) {
        break forward_join_18;
    }
    }
    forwardValue5374_17_0 = 1;
    }
    forwardValue5374_19_0 = forwardValue5374_17_0;
    break forward_join_19;
    }
    forwardValue5374_19_0 = 0;
    }
    return ((forwardValue5374_19_0) != 0);
}


protected boolean M() {
int forwardValue5357_13_0;
    int forwardValue5357_22_0;
    int forwardValue5357_24_0;
    boolean spill5357_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 64423404879309L);
    life3_5 = moom.vR.c();
    spill5357_0 = ((net.minecraft.entity.passive.EntityWolf)(this)).ae();
    if (!((life3_5 == 0))) {
        forwardValue5357_13_0 = ((spill5357_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5357_0))) {
        break forward_join_23;
    }
    forwardValue5357_13_0 = this.S;
    }
    if (!((life3_5 == 0))) {
        forwardValue5357_22_0 = forwardValue5357_13_0;
        break forward_join_22;
    }
    if (!((forwardValue5357_13_0 > __sourceIntrinsic_d3c1d2a43577_invokedynamic5357_5(248, (2157836826091772810L ^ life1_3))))) {
        break forward_join_23;
    }
    forwardValue5357_22_0 = 1;
    }
    forwardValue5357_24_0 = forwardValue5357_22_0;
    break forward_join_24;
    }
    forwardValue5357_24_0 = 0;
    }
    return ((forwardValue5357_24_0) != 0);
}


protected void R() {
long local1 = (net.minecraft.entity.passive.EntityWolf.jb ^ 64127884629891L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_ebf98100c39e_originalDynamicSite1999_2(13295, (2127540704859439823L ^ local1)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(((net.minecraft.entity.passive.EntityWolf)(this)).b__sourceReturn_bc607678b6()))))));
    return;
}


public boolean ai() {
int forwardValue5366_19_0;
    int forwardValue5366_21_0;
    byte spill5366_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 140693555580988L);
    life3_5 = moom.vR.c();
    spill5366_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_1a2916507882_invokedynamic5366_3(14686, (2251615995427311571L ^ life1_3)))));
    if (!((life3_5 == 0))) {
        forwardValue5366_19_0 = ((int)(spill5366_0));
        break forward_join_19;
    }
    if (!((spill5366_0 == 1))) {
        break forward_join_20;
    }
    forwardValue5366_19_0 = 1;
    }
    forwardValue5366_21_0 = forwardValue5366_19_0;
    break forward_join_21;
    }
    forwardValue5366_21_0 = 0;
    }
    return ((forwardValue5366_21_0) != 0);
}


public boolean ag() {
return ((((this.cg) ? 1 : 0)) != 0);
}


public boolean ah() {
int forwardValue5365_20_0;
    int forwardValue5365_22_0;
    int spill5365_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 95167680599424L);
    life3_5 = moom.vR.c();
    spill5365_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a44dc8ae6321_invokedynamic5365_3(10903, (3940996851809589667L ^ life1_3))))) & 2);
    if (!((life3_5 == 0))) {
        forwardValue5365_20_0 = spill5365_0;
        break forward_join_20;
    }
    if (!((spill5365_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5365_20_0 = 1;
    }
    forwardValue5365_22_0 = forwardValue5365_20_0;
    break forward_join_22;
    }
    forwardValue5365_22_0 = 0;
    }
    return ((forwardValue5365_22_0) != 0);
}


public void G() {
int forwardValue5356_57_0;
    net.minecraft.entity.EntityLivingBase forwardValue5356_62_0;
    net.minecraft.entity.passive.EntityWolf forwardValue5356_64_0;
    net.minecraft.entity.passive.EntityWolf forwardValue5356_69_0;
    int spill5356_0;
    boolean spill5356_1;
    boolean spill5356_2;
    boolean spill5356_3;
    boolean spill5356_4;
    boolean spill5356_5;
    net.minecraft.entity.passive.EntityWolf spill5356_6;
    net.minecraft.entity.passive.EntityWolf spill5356_7;
    long life1_3;
    int life3_7;
    forward_join_71: {
    forward_join_69: {
    forward_join_64: {
    forward_join_62: {
    forward_join_57: {
    forward_join_52: {
    life1_3 = (net.minecraft.entity.passive.EntityWolf.jb ^ 22867502473769L);
    spill5356_0 = moom.vR.c();
    super.G();
    life3_7 = spill5356_0;
    spill5356_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_7 == 0))) {
        forwardValue5356_57_0 = ((spill5356_1) ? 1 : 0);
        break forward_join_57;
    }
    if (!((!spill5356_1))) {
        break forward_join_52;
    }
    spill5356_2 = this.cg;
    if (!((life3_7 == 0))) {
        forwardValue5356_57_0 = ((spill5356_2) ? 1 : 0);
        break forward_join_57;
    }
    if (!(spill5356_2)) {
        break forward_join_52;
    }
    spill5356_3 = this.ch;
    if (!((life3_7 == 0))) {
        forwardValue5356_57_0 = ((spill5356_3) ? 1 : 0);
        break forward_join_57;
    }
    if (!((!spill5356_3))) {
        break forward_join_52;
    }
    spill5356_4 = ((net.minecraft.entity.passive.EntityWolf)(this)).Y();
    if (!((life3_7 == 0))) {
        forwardValue5356_57_0 = ((spill5356_4) ? 1 : 0);
        break forward_join_57;
    }
    if (!((!spill5356_4))) {
        break forward_join_52;
    }
    spill5356_5 = this.A;
    if (!((life3_7 == 0))) {
        forwardValue5356_57_0 = ((spill5356_5) ? 1 : 0);
        break forward_join_57;
    }
    if (!(spill5356_5)) {
        break forward_join_52;
    }
    this.ch = ((boolean)(true));
    this.ci = ((float)(0x0.0p0f));
    this.cj = ((float)(0x0.0p0f));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_c7b45e3c376e_invokedynamic5356_18(12694, (1110250613057385743L ^ life1_3)))));
    }
    spill5356_6 = this;
    if (!((life3_7 == 0))) {
        forwardValue5356_62_0 = spill5356_6;
        break forward_join_62;
    }
    forwardValue5356_57_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityWolf)(spill5356_6)).i)).G) ? 1 : 0);
    }
    if (!((forwardValue5356_57_0 == 0))) {
        break forward_join_71;
    }
    spill5356_7 = this;
    if (!((life3_7 == 0))) {
        forwardValue5356_64_0 = spill5356_7;
        break forward_join_64;
    }
    forwardValue5356_62_0 = ((net.minecraft.entity.passive.EntityWolf)(spill5356_7)).d__sourceReturn_d30556f370();
    }
    if (!((forwardValue5356_62_0 == null))) {
        break forward_join_71;
    }
    forwardValue5356_64_0 = this;
    }
    if (!((life3_7 == 0))) {
        forwardValue5356_69_0 = forwardValue5356_64_0;
        break forward_join_69;
    }
    if (!(((net.minecraft.entity.passive.EntityWolf)(forwardValue5356_64_0)).ah())) {
        break forward_join_71;
    }
    forwardValue5356_69_0 = this;
    }
    ((net.minecraft.entity.passive.EntityWolf)(forwardValue5356_69_0)).q(((boolean)(false)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_31(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_b806da53f2751c5b_originalDynamicSite3397_41() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic5356_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3c1d2a43577_invokedynamic5357_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_originalDynamicSite1999_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc36484f3d63_originalDynamicSite1998_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc36484f3d63_originalDynamicSite1998_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic6012_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad257e093cd9_originalDynamicSite1997_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad257e093cd9_originalDynamicSite1997_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5361_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5361_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5361_97(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_153a193fc182_call5362_9(net.minecraft.entity.passive.EntityWolf a0, net.minecraft.util.DamageSource a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a44dc8ae6321_invokedynamic5365_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a2916507882_invokedynamic5366_3(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_4b482c9fdcb0_call5370_2(net.minecraft.entity.passive.EntityWolf a0, net.minecraft.entity.EntityLivingBase a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5371_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1996_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1996_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1996_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_52b5e237b1bd_methodHandleLiteral11712_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fc475de8b950_invokedynamic5373_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3313449ea9be_invokedynamic5375_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55dda021a68_invokedynamic5376_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55dda021a68_call5376_4(net.minecraft.entity.passive.EntityWolf a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_11645c1a30d8_originalDynamicSite1995_1(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e276b0aa449e_call5377_2(net.minecraft.entity.passive.EntityWolf a0, boolean a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f6925daff8ea_invokedynamic6032_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f6925daff8ea_invokedynamic6032_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f6925daff8ea_invokedynamic6032_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f6925daff8ea_invokedynamic6032_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6ebbb4b0157_invokedynamic6033_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6ebbb4b0157_invokedynamic6033_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native net.minecraft.item.Item __sourceExactCall_b9094f5c198ccd(int p0);

private static native void __sourceExactCall_ae34dbea601cc3(net.minecraft.entity.ai.EntityAITasks p0, int p1, moom.uc p2);

private static native moom.AV __sourceExactCall_431bbcca965e47(net.minecraft.entity.passive.EntityWolf p0);
}
