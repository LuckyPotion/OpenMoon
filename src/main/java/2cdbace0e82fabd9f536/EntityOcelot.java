package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityOcelot extends moom.sS {

private moom.uh<net.minecraft.entity.player.EntityPlayer> ce;

private moom.u3 cf;

private static long jb;

private static long[] Db;

private static java.lang.Integer[] Eb;

private static java.util.Map Fb;

public EntityOcelot(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_e6c85fe4a7fdf51b(net.minecraft.entity.passive.EntityOcelot receiver, net.minecraft.world.World p0) throws Throwable {
net.minecraft.entity.ai.EntityAITasks spill561_0;
    int spill561_1;
    moom.u3 spill561_2;
    long life2_3;
    life2_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 21722163548634L);
    net.minecraft.entity.passive.EntityOcelot.__sourceConstructorInit_e6c85fe4a7fdf51b_0(((net.minecraft.entity.passive.EntityOcelot)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.passive.EntityOcelot)(receiver)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.666666p-1f)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_d8aba1f18872df(((net.minecraft.entity.passive.EntityOcelot)(receiver))))))).a(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).cd)));
    spill561_0 = ((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ;
    spill561_1 = 3;
    net.minecraft.entity.passive.EntityOcelot __stackOp561_13_0 = receiver;
    moom.u3 __stackOp561_13_1 = new moom.u3(receiver, 0x1.3333333333333p-1d, net.minecraft.init.Items.aU, true);
    spill561_2 = __stackOp561_13_1;
    ((net.minecraft.entity.passive.EntityOcelot)(__stackOp561_13_0)).cf = ((moom.u3)(__stackOp561_13_1));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(spill561_0)), ((int)(spill561_1)), ((moom.uc)(spill561_2)));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)), ((int)(5)), ((moom.uc)(new moom.uu(receiver, 0x1.0p0d, 0x1.4p3f, 0x1.4p2f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_19(32358, (3252653068417850192L ^ life2_3)))), ((moom.uc)(new moom.uE(receiver, 0x1.999999999999ap-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_22(2264, (3926088390792654305L ^ life2_3)))), ((moom.uc)(new moom.uw(receiver, 0x1.333334p-2f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_25(8405, (4766836616630371808L ^ life2_3)))), ((moom.uc)(new moom.uI(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_28(28955, (8192617201243247654L ^ life2_3)))), ((moom.uc)(new moom.uz(receiver, 0x1.999999999999ap-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_31(16661, (4100149832304616482L ^ life2_3)))), ((moom.uc)(new moom.u6(receiver, 0x1.999999999999ap-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_34(15193, (7747447771053399655L ^ life2_3)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.4p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uW(receiver, net.minecraft.entity.passive.EntityChicken.class, false, null))));
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(-5137441064461242587L)), ((long)(2624000768359833421L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(136224791220752L)))));
    Fb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 48980299428334L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1880_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1880_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1880_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1880_14 = new byte[8];
    (__sourceSpill1880_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1880_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1880_16 = __sourceSpill1880_14;
    ((javax.crypto.Cipher)(__sourceSpill1880_11)).init(((int)(__sourceSpill1880_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1880_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1880_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¨H§Vû\"]¸\002M\\]µ,Ü?\030êµÎ>âF!w7ïHý\030S\030Lgðº6HÔ\020g©_\021»\020ø^§ÉgÒ\006aLA5:ÙS¶\036ë¦\"ånÇÏSaS"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1880_25 = local6_life21;
        int __sourceSpill1880_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1880_25)).substring(((int)(__sourceSpill1880_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1880_30 = local8_life19;
        int __sourceSpill1880_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1880_33 = new byte[8];
        (__sourceSpill1880_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1880_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1880_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1880_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1880_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1880_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1880_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1880_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1880_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1880_34)).doFinal(((byte[])(__sourceSpill1880_33)));
        (__sourceSpill1880_30)[__sourceSpill1880_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ù·ÔúÜ°<.«:ß\022\037"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1880_38 = local6_life21;
        int __sourceSpill1880_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1880_38)).substring(((int)(__sourceSpill1880_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1880_43 = local8_life19;
        int __sourceSpill1880_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1880_46 = new byte[8];
        (__sourceSpill1880_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1880_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1880_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1880_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1880_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1880_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1880_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1880_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1880_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1880_47)).doFinal(((byte[])(__sourceSpill1880_46)));
        (__sourceSpill1880_43)[__sourceSpill1880_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Db = ((long[])(local8_life19));
    Eb = ((java.lang.Integer[])(new java.lang.Integer[12]));
}

private static native <E extends Throwable> void __sourceConstructorInit_e6c85fe4a7fdf51b_0(net.minecraft.entity.passive.EntityOcelot a0, net.minecraft.world.World a1) throws E;

protected void Z__sourceReturn_da8c82d5d4() {
net.minecraft.entity.passive.EntityOcelot forwardValue5292_27_0;
    net.minecraft.entity.passive.EntityOcelot forwardValue5292_32_0;
    net.minecraft.entity.passive.EntityOcelot spill5292_0;
    long life1_3;
    int life3_5;
    forward_join_37: {
    forward_join_32: {
    forward_join_27: {
    forward_join_21: {
    life1_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 13019881111715L);
    life3_5 = moom.vR.b();
    spill5292_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5292_27_0 = spill5292_0;
        break forward_join_27;
    }
    if (!((((net.minecraft.entity.passive.EntityOcelot)(spill5292_0)).ce == null))) {
        break forward_join_21;
    }
    this.ce = ((moom.uh)(new moom.uh(this, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p4f, 0x1.999999999999ap-1d, 0x1.547ae147ae148p0d)));
    }
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((moom.uc)(this.ce)));
    forwardValue5292_27_0 = this;
    }
    if (!((life3_5 != 0))) {
        forwardValue5292_32_0 = forwardValue5292_27_0;
        break forward_join_32;
    }
    if (!((!((net.minecraft.entity.passive.EntityOcelot)(forwardValue5292_27_0)).ae()))) {
        break forward_join_37;
    }
    forwardValue5292_32_0 = this;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityOcelot)(forwardValue5292_32_0)).bJ)).a(((int)(4)), ((moom.uc)(this.ce)));
    }
    return;
}


protected java.lang.String i__String() {
int forwardValue5300_13_0;
    int forwardValue5300_22_0;
    java.lang.String forwardValue5300_28_0;
    boolean spill5300_0;
    long life1_3;
    int life3_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_25: {
    forward_join_22: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 38577849427210L);
    life3_5 = moom.vR.b();
    spill5300_0 = ((net.minecraft.entity.passive.EntityOcelot)(this)).ae();
    if (!((life3_5 != 0))) {
        forwardValue5300_13_0 = ((spill5300_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill5300_0)) {
        break forward_join_27;
    }
    forwardValue5300_13_0 = ((((net.minecraft.entity.passive.EntityOcelot)(this)).ad()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue5300_22_0 = forwardValue5300_13_0;
        break forward_join_22;
    }
    if (!((forwardValue5300_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5300_28_0 = "mob.cat.purr";
    break forward_join_28;
    }
    forwardValue5300_22_0 = ((java.util.Random)(this.ah)).nextInt(((int)(4)));
    }
    if (!((forwardValue5300_22_0 == 0))) {
        break forward_join_25;
    }
    forwardValue5300_28_0 = "mob.cat.purreow";
    break forward_join_28;
    }
    forwardValue5300_28_0 = "mob.cat.meow";
    break forward_join_28;
    }
    forwardValue5300_28_0 = "";
    }
    return forwardValue5300_28_0;
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5299_11_0;
    int forwardValue5299_17_0;
    net.minecraft.item.ItemStack spill5299_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 36573626588878L);
    life4_5 = moom.vR.c();
    spill5299_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5299_11_0 = spill5299_0;
        break forward_join_11;
    }
    if (!((spill5299_0 != null))) {
        break forward_join_16;
    }
    forwardValue5299_11_0 = p0;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5299_11_0)).a__wQ() == net.minecraft.init.Items.aU))) {
        break forward_join_16;
    }
    forwardValue5299_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5299_17_0 = 0;
    }
    return ((forwardValue5299_17_0) != 0);
}


protected void b(boolean p0, int p1) {
return;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.passive.EntityOcelot)(this)).n(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CatType"))))));
    return;
}


protected java.lang.String c__String() {
return "mob.cat.hitt";
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.Entity)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(0x1.8p1f))))) != 0);
}


public void n(int p0) {
long local2 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 264446074562L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_e3ce5c7e7d84_originalDynamicSite1982_2(28827, (8902290749944863415L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) p0)))))));
    return;
}


protected java.lang.String h__String() {
return "mob.cat.hitt";
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.99999ap-2f;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 94060367708280L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1983_3(22836, (554526754956733870L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void d(float p0, float p1) {
return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CatType")), ((int)(((net.minecraft.entity.passive.EntityOcelot)(this)).t())));
    return;
}


public boolean a(moom.sK p0) {
int forwardValue5294_20_0;
    int forwardValue5294_29_0;
    int forwardValue5294_37_0;
    int forwardValue5294_42_0;
    int forwardValue5294_46_0;
    int forwardValue5294_48_0;
    boolean spill5294_0;
    boolean spill5294_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.passive.EntityOcelot life5_35;
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_42: {
    forward_join_37: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_20: {
    forward_join_18: {
    forward_join_11: {
    life2_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 42887149254975L);
    life4_5 = moom.vR.c();
    if (!((p0 == this))) {
        break forward_join_11;
    }
    return ((0) != 0);
    }
    spill5294_0 = ((net.minecraft.entity.passive.EntityOcelot)(this)).ae();
    if (!((life4_5 == 0))) {
        forwardValue5294_20_0 = ((spill5294_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill5294_0))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue5294_20_0 = ((p0 instanceof net.minecraft.entity.passive.EntityOcelot) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5294_29_0 = forwardValue5294_20_0;
        break forward_join_29;
    }
    if (!((forwardValue5294_20_0 != 0))) {
        break forward_join_28;
    }
    life5_35 = ((net.minecraft.entity.passive.EntityOcelot)(p0));
    if (!((life4_5 != 0))) {
        break forward_join_30;
    }
    }
    forwardValue5294_29_0 = 0;
    }
    return ((forwardValue5294_29_0) != 0);
    }
    spill5294_1 = ((net.minecraft.entity.passive.EntityOcelot)(life5_35)).ae();
    if (!((life4_5 == 0))) {
        forwardValue5294_37_0 = ((spill5294_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill5294_1)) {
        break forward_join_47;
    }
    forwardValue5294_37_0 = ((((net.minecraft.entity.passive.EntityOcelot)(this)).ad()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5294_42_0 = forwardValue5294_37_0;
        break forward_join_42;
    }
    if (!((forwardValue5294_37_0 != 0))) {
        break forward_join_47;
    }
    forwardValue5294_42_0 = ((((net.minecraft.entity.passive.EntityOcelot)(life5_35)).ad()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5294_46_0 = forwardValue5294_42_0;
        break forward_join_46;
    }
    if (!((forwardValue5294_42_0 != 0))) {
        break forward_join_47;
    }
    forwardValue5294_46_0 = 1;
    }
    forwardValue5294_48_0 = forwardValue5294_46_0;
    break forward_join_48;
    }
    forwardValue5294_48_0 = 0;
    }
    return ((forwardValue5294_48_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
int forwardValue5297_18_0;
    net.minecraft.entity.passive.EntityOcelot forwardValue5297_23_0;
    java.lang.String forwardValue5297_24_0;
    boolean spill5297_0;
    net.minecraft.entity.passive.EntityOcelot spill5297_1;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 7272690240460L);
    life3_5 = moom.vR.b();
    spill5297_0 = ((net.minecraft.entity.passive.EntityOcelot)(this)).e__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue5297_18_0 = ((spill5297_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5297_0)) {
        break forward_join_14;
    }
    forwardValue5297_24_0 = ((net.minecraft.entity.passive.EntityOcelot)(this)).g__String();
    break forward_join_24;
    }
    spill5297_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue5297_23_0 = spill5297_1;
        break forward_join_23;
    }
    forwardValue5297_18_0 = ((((net.minecraft.entity.passive.EntityOcelot)(spill5297_1)).ae()) ? 1 : 0);
    }
    if (!((forwardValue5297_18_0 != 0))) {
        break forward_join_22;
    }
    forwardValue5297_24_0 = net.minecraft.util.StatCollector.a(((java.lang.String)("entity.Cat.name")));
    break forward_join_24;
    }
    forwardValue5297_23_0 = this;
    }
    forwardValue5297_24_0 = __sourceIntrinsic_64ccfb84e285_call5297_8(forwardValue5297_23_0);
    }
    return forwardValue5297_24_0;
}


public moom.sJ a(moom.sJ p0) {
return ((net.minecraft.entity.passive.EntityOcelot)(this)).a__sT(((moom.sJ)(p0)));
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
net.minecraft.entity.IEntityLivingData lexicalValue1602_61_0;
    net.minecraft.entity.IEntityLivingData spill1602_0;
    long life3_3;
    int life5_5;
    net.minecraft.entity.IEntityLivingData life2_12;
    int life6_24;
    net.minecraft.entity.passive.EntityOcelot life7_33;
    lexical_join_61: {
    lexical_join_60: {
    life3_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 15175668405284L);
    life5_5 = moom.vR.b();
    spill1602_0 = super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
    if (!((life5_5 != 0))) {
        lexicalValue1602_61_0 = spill1602_0;
        break lexical_join_61;
    }
    life2_12 = spill1602_0;
    if (!((((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextInt(((int)(__sourceIntrinsic_07d6d39f9236_invokedynamic1602_5(2264, (3926112600558905375L ^ life3_3))))) == 0))) {
        break lexical_join_60;
    }
    life6_24 = 0;
    lexical_cycle_25: while (true) {
    if (!((life6_24 < 2))) {
        break lexical_join_60;
    }
    life7_33 = new net.minecraft.entity.passive.EntityOcelot(this.i);
    ((net.minecraft.entity.passive.EntityOcelot)(life7_33)).c(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(this.w)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.passive.EntityOcelot)(life7_33)).l(((int)(__sourceIntrinsic_07d6d39f9236_invokedynamic1602_13(4301, (6777384959378927631L ^ life3_3)))));
    ((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life7_33)));
    life6_24 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue1602_61_0 = life2_12;
    }
    return lexicalValue1602_61_0;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
moom.uP forwardValue5295_41_0;
    int forwardValue5295_41_1;
    moom.uP forwardValue5295_42_0;
    moom.uP forwardValue5295_43_0;
    int forwardValue5295_43_1;
    int forwardValue5295_49_0;
    net.minecraft.item.ItemStack forwardValue5295_57_0;
    int forwardValue5295_82_0;
    int forwardValue5295_95_0;
    net.minecraft.entity.passive.EntityOcelot forwardValue5295_144_0;
    int forwardValue5295_153_0;
    int forwardValue5295_157_0;
    int spill5295_0;
    boolean spill5295_1;
    boolean spill5295_2;
    boolean spill5295_3;
    boolean spill5295_4;
    moom.uP spill5295_5;
    boolean spill5295_6;
    net.minecraft.item.ItemStack spill5295_7;
    int spill5295_8;
    boolean spill5295_9;
    net.minecraft.entity.passive.EntityOcelot spill5295_10;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    forward_join_157: {
    forward_join_154: {
    forward_join_153: {
    forward_join_152: {
    forward_join_144: {
    forward_join_140: {
    forward_join_95: {
    forward_join_92: {
    forward_join_82: {
    forward_join_80: {
    forward_join_57: {
    forward_join_49: {
    forward_join_46: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    life2_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 2485073326739L);
    spill5295_0 = moom.vR.b();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill5295_0;
    spill5295_1 = ((net.minecraft.entity.passive.EntityOcelot)(this)).ae();
    if (!((life4_9 != 0))) {
        forwardValue5295_49_0 = ((spill5295_1) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill5295_1)) {
        break forward_join_46;
    }
    spill5295_2 = ((net.minecraft.entity.passive.EntityOcelot)(this)).b__sourceReturn_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(p0)));
    if (!((life4_9 != 0))) {
        forwardValue5295_157_0 = ((spill5295_2) ? 1 : 0);
        break forward_join_157;
    }
    if (!(spill5295_2)) {
        break forward_join_154;
    }
    spill5295_3 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_9 != 0))) {
        forwardValue5295_157_0 = ((spill5295_3) ? 1 : 0);
        break forward_join_157;
    }
    if (!((!spill5295_3))) {
        break forward_join_154;
    }
    spill5295_4 = ((net.minecraft.entity.passive.EntityOcelot)(this)).b__Boolean(((net.minecraft.item.ItemStack)(life5_8)));
    if (!((life4_9 != 0))) {
        forwardValue5295_157_0 = ((spill5295_4) ? 1 : 0);
        break forward_join_157;
    }
    if (!((!spill5295_4))) {
        break forward_join_154;
    }
    spill5295_5 = this.cd;
    spill5295_6 = ((net.minecraft.entity.passive.EntityOcelot)(this)).af();
    if (!((life4_9 != 0))) {
        forwardValue5295_41_0 = spill5295_5;
        forwardValue5295_41_1 = ((spill5295_6) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill5295_6))) {
        forwardValue5295_42_0 = spill5295_5;
        break forward_join_42;
    }
    forwardValue5295_41_0 = spill5295_5;
    forwardValue5295_41_1 = 1;
    }
    forwardValue5295_43_0 = forwardValue5295_41_0;
    forwardValue5295_43_1 = forwardValue5295_41_1;
    break forward_join_43;
    }
    forwardValue5295_43_0 = forwardValue5295_42_0;
    forwardValue5295_43_1 = 0;
    }
    ((moom.uP)(forwardValue5295_43_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5295_43_1))));
    if (!((life4_9 == 0))) {
        break forward_join_154;
    }
    }
    forwardValue5295_49_0 = ((((moom.u3)(this.cf)).f()) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue5295_157_0 = forwardValue5295_49_0;
        break forward_join_157;
    }
    if (!((forwardValue5295_49_0 != 0))) {
        break forward_join_154;
    }
    spill5295_7 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue5295_57_0 = spill5295_7;
        break forward_join_57;
    }
    if (!((spill5295_7 != null))) {
        break forward_join_154;
    }
    forwardValue5295_57_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5295_57_0)).a__wQ() == net.minecraft.init.Items.aU))) {
        break forward_join_154;
    }
    spill5295_8 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.entity.Entity)(this))))), ((double)(0x1.2p3d)));
    if (!((life4_9 != 0))) {
        forwardValue5295_157_0 = spill5295_8;
        break forward_join_157;
    }
    if (!((spill5295_8 < 0))) {
        break forward_join_154;
    }
    spill5295_9 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_9 != 0))) {
        forwardValue5295_82_0 = ((spill5295_9) ? 1 : 0);
        break forward_join_82;
    }
    if (!((!spill5295_9))) {
        break forward_join_80;
    }
    net.minecraft.item.ItemStack __stackOp5295_27_0 = life5_8;
    ((net.minecraft.item.ItemStack)(__stackOp5295_27_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5295_27_0)).b - 1)));
    }
    forwardValue5295_82_0 = ((net.minecraft.item.ItemStack)(life5_8)).b;
    }
    if (!((life4_9 != 0))) {
        forwardValue5295_95_0 = forwardValue5295_82_0;
        break forward_join_95;
    }
    if (!((forwardValue5295_82_0 <= 0))) {
        break forward_join_92;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue5295_95_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue5295_153_0 = forwardValue5295_95_0;
        break forward_join_153;
    }
    if (!((forwardValue5295_95_0 == 0))) {
        break forward_join_152;
    }
    spill5295_10 = this;
    if (!((life4_9 != 0))) {
        forwardValue5295_144_0 = spill5295_10;
        break forward_join_144;
    }
    if (!((((java.util.Random)(((net.minecraft.entity.passive.EntityOcelot)(spill5295_10)).ah)).nextInt(((int)(3))) == 0))) {
        break forward_join_140;
    }
    ((net.minecraft.entity.passive.EntityOcelot)(this)).o(((boolean)(true)));
    ((net.minecraft.entity.passive.EntityOcelot)(this)).n(((int)((1 + ((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextInt(((int)(3)))))));
    ((net.minecraft.entity.passive.EntityOcelot)(this)).b(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__UUID())).toString())));
    ((net.minecraft.entity.passive.EntityOcelot)(this)).n(((boolean)(true)));
    ((moom.uP)(this.cd)).a(((boolean)(true)));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_d6a7991b4c91_invokedynamic5295_52(15719, (7575472636561373973L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        break forward_join_152;
    }
    }
    ((net.minecraft.entity.passive.EntityOcelot)(this)).n(((boolean)(false)));
    forwardValue5295_144_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityOcelot)(forwardValue5295_144_0)).i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_d6a7991b4c91_invokedynamic5295_56(17006, (4914517585487840280L ^ life2_3)))));
    }
    forwardValue5295_153_0 = 1;
    }
    return ((forwardValue5295_153_0) != 0);
    }
    forwardValue5295_157_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((forwardValue5295_157_0) != 0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5296_22_0;
    boolean spill5296_0;
    long life3_3;
    int life5_5;
    forward_join_22: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 77308327722153L);
    life5_5 = moom.vR.c();
    spill5296_0 = ((net.minecraft.entity.passive.EntityOcelot)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue5296_22_0 = ((spill5296_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5296_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    ((moom.uP)(this.cd)).a(((boolean)(false)));
    forwardValue5296_22_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forwardValue5296_22_0) != 0);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityOcelot)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityOcelot)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.333334p-2d)));
    return;
}


public net.minecraft.entity.passive.EntityOcelot a__sT(moom.sJ p0) {
net.minecraft.entity.passive.EntityOcelot forwardValue5298_29_0;
    int spill5298_0;
    net.minecraft.entity.passive.EntityOcelot spill5298_1;
    long life2_3;
    net.minecraft.entity.passive.EntityOcelot life5_10;
    int life4_11;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 35618557630255L);
    spill5298_0 = moom.vR.c();
    life5_10 = new net.minecraft.entity.passive.EntityOcelot(this.i);
    life4_11 = spill5298_0;
    spill5298_1 = this;
    if (!((life4_11 == 0))) {
        forwardValue5298_29_0 = spill5298_1;
        break forward_join_29;
    }
    if (!(((net.minecraft.entity.passive.EntityOcelot)(spill5298_1)).ae())) {
        break forward_join_28;
    }
    ((net.minecraft.entity.passive.EntityOcelot)(life5_10)).b(((java.lang.String)(((net.minecraft.entity.passive.EntityOcelot)(this)).b__sourceReturn_0e30dfc966())));
    ((net.minecraft.entity.passive.EntityOcelot)(life5_10)).o(((boolean)(true)));
    ((net.minecraft.entity.passive.EntityOcelot)(life5_10)).n(((int)(((net.minecraft.entity.passive.EntityOcelot)(this)).t())));
    }
    forwardValue5298_29_0 = life5_10;
    }
    return forwardValue5298_29_0;
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.aF;
}


public void o(boolean p0) {
super.o(((boolean)(p0)));
    return;
}


public int t() {
long local1 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 140306405858222L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_cd276fc49293_originalDynamicSite1984_2(28827, (8902268339631972315L ^ local1)))));
}


private static int g(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntityOcelot.g(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int g(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13907;
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
            throw new RuntimeException("moom/sT", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Eb[var3] = var15;
      }

      return Eb[var3];
}


private static java.lang.invoke.CallSite g(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_52b5e237b1bd_methodHandleLiteral11627_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean N__Boolean() {
int forwardValue5289_15_0;
    int forwardValue5289_17_0;
    int spill5289_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 122028213527509L);
    life3_5 = moom.vR.b();
    spill5289_0 = ((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextInt(((int)(3)));
    if (!((life3_5 != 0))) {
        forwardValue5289_15_0 = spill5289_0;
        break forward_join_15;
    }
    if (!((spill5289_0 != 0))) {
        break forward_join_16;
    }
    forwardValue5289_15_0 = 1;
    }
    forwardValue5289_17_0 = forwardValue5289_15_0;
    break forward_join_17;
    }
    forwardValue5289_17_0 = 0;
    }
    return ((forwardValue5289_17_0) != 0);
}


protected boolean M() {
int forwardValue5288_13_0;
    int forwardValue5288_22_0;
    int forwardValue5288_24_0;
    boolean spill5288_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 124291869018567L);
    life3_5 = moom.vR.c();
    spill5288_0 = ((net.minecraft.entity.passive.EntityOcelot)(this)).ae();
    if (!((life3_5 == 0))) {
        forwardValue5288_13_0 = ((spill5288_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5288_0))) {
        break forward_join_23;
    }
    forwardValue5288_13_0 = this.S;
    }
    if (!((life3_5 == 0))) {
        forwardValue5288_22_0 = forwardValue5288_13_0;
        break forward_join_22;
    }
    if (!((forwardValue5288_13_0 > __sourceIntrinsic_d3c1d2a43577_invokedynamic5288_5(6244, (8218780717274309955L ^ life1_3))))) {
        break forward_join_23;
    }
    forwardValue5288_22_0 = 1;
    }
    forwardValue5288_24_0 = forwardValue5288_22_0;
    break forward_join_24;
    }
    forwardValue5288_24_0 = 0;
    }
    return ((forwardValue5288_24_0) != 0);
}


public void R() {
int forwardValue5291_33_0;
    net.minecraft.entity.passive.EntityOcelot forwardValue5291_54_0;
    net.minecraft.entity.passive.EntityOcelot spill5291_0;
    int spill5291_1;
    long life1_3;
    int life3_5;
    double life4_18;
    forward_join_56: {
    forward_join_54: {
    forward_join_50: {
    forward_join_48: {
    forward_join_42: {
    forward_join_33: {
    forward_join_30: {
    life1_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 125136645825417L);
    life3_5 = moom.vR.b();
    spill5291_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5291_54_0 = spill5291_0;
        break forward_join_54;
    }
    if (!(((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.passive.EntityOcelot)(spill5291_0)).a__vu())).a__Boolean())) {
        break forward_join_50;
    }
    life4_18 = ((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.passive.EntityOcelot)(this)).a__vu())).a();
    spill5291_1 = recovery.source.CarrierOps.dcmpl(((double)(life4_18)), ((double)(0x1.3333333333333p-1d)));
    if (!((life3_5 != 0))) {
        forwardValue5291_33_0 = spill5291_1;
        break forward_join_33;
    }
    if (!((spill5291_1 == 0))) {
        break forward_join_30;
    }
    ((net.minecraft.entity.passive.EntityOcelot)(this)).b(((boolean)(true)));
    ((net.minecraft.entity.passive.EntityOcelot)(this)).c(((boolean)(false)));
    if (!((life3_5 == 0))) {
        break forward_join_48;
    }
    }
    forwardValue5291_33_0 = recovery.source.CarrierOps.dcmpl(((double)(life4_18)), ((double)(0x1.547ae147ae148p0d)));
    }
    if (!((forwardValue5291_33_0 == 0))) {
        break forward_join_42;
    }
    ((net.minecraft.entity.passive.EntityOcelot)(this)).b(((boolean)(false)));
    ((net.minecraft.entity.passive.EntityOcelot)(this)).c(((boolean)(true)));
    if (!((life3_5 == 0))) {
        break forward_join_48;
    }
    }
    ((net.minecraft.entity.passive.EntityOcelot)(this)).b(((boolean)(false)));
    ((net.minecraft.entity.passive.EntityOcelot)(this)).c(((boolean)(false)));
    }
    if (!((life3_5 == 0))) {
        break forward_join_56;
    }
    }
    ((net.minecraft.entity.passive.EntityOcelot)(this)).b(((boolean)(false)));
    forwardValue5291_54_0 = this;
    }
    ((net.minecraft.entity.passive.EntityOcelot)(forwardValue5291_54_0)).c(((boolean)(false)));
    }
    return;
}


public boolean O__Boolean() {
int forwardValue5290_53_0;
    net.minecraft.block.Block forwardValue5290_67_0;
    int forwardValue5290_73_0;
    int forwardValue5290_75_0;
    boolean spill5290_0;
    boolean spill5290_1;
    boolean spill5290_2;
    int spill5290_3;
    net.minecraft.block.Block spill5290_4;
    long life1_3;
    int life3_5;
    moom.DT life4_58;
    net.minecraft.block.Block life5_81;
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_70: {
    forward_join_67: {
    forward_join_54: {
    forward_join_53: {
    life1_3 = (net.minecraft.entity.passive.EntityOcelot.jb ^ 11161389357856L);
    life3_5 = moom.vR.b();
    spill5290_0 = ((net.minecraft.world.World)(this.i)).a(((moom.CA)(((net.minecraft.entity.passive.EntityOcelot)(this)).b())), ((net.minecraft.entity.Entity)(this)));
    if (!((life3_5 != 0))) {
        forwardValue5290_75_0 = ((spill5290_0) ? 1 : 0);
        break forward_join_75;
    }
    if (!(spill5290_0)) {
        break forward_join_74;
    }
    spill5290_1 = ((java.util.List)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.passive.EntityOcelot)(this)).b()))))).isEmpty();
    if (!((life3_5 != 0))) {
        forwardValue5290_75_0 = ((spill5290_1) ? 1 : 0);
        break forward_join_75;
    }
    if (!(spill5290_1)) {
        break forward_join_74;
    }
    spill5290_2 = ((net.minecraft.world.World)(this.i)).c(((moom.CA)(((net.minecraft.entity.passive.EntityOcelot)(this)).b())));
    if (!((life3_5 != 0))) {
        forwardValue5290_75_0 = ((spill5290_2) ? 1 : 0);
        break forward_join_75;
    }
    if (!((!spill5290_2))) {
        break forward_join_74;
    }
    life4_58 = new moom.DT(this.n, ((moom.CA)(((net.minecraft.entity.passive.EntityOcelot)(this)).b())).c, this.p);
    spill5290_3 = ((moom.DT)(life4_58)).b();
    if (!((life3_5 != 0))) {
        forwardValue5290_53_0 = spill5290_3;
        break forward_join_53;
    }
    if (!((spill5290_3 < ((net.minecraft.world.World)(this.i)).c()))) {
        break forward_join_54;
    }
    forwardValue5290_53_0 = 0;
    }
    return ((forwardValue5290_53_0) != 0);
    }
    life5_81 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(((moom.DT)(life4_58)).b__DT()))))).a__ch();
    spill5290_4 = life5_81;
    if (!((life3_5 != 0))) {
        forwardValue5290_67_0 = spill5290_4;
        break forward_join_67;
    }
    if (!((spill5290_4 != net.minecraft.init.Blocks.c))) {
        break forward_join_70;
    }
    forwardValue5290_67_0 = life5_81;
    }
    if (!((((net.minecraft.block.Block)(forwardValue5290_67_0)).a__fn() == moom.fn.j))) {
        break forward_join_72;
    }
    }
    forwardValue5290_73_0 = 1;
    break forward_join_73;
    }
    forwardValue5290_73_0 = 0;
    }
    return ((forwardValue5290_73_0) != 0);
    }
    forwardValue5290_75_0 = 0;
    }
    return ((forwardValue5290_75_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e6c85fe4a7fdf51b_invokedynamic561_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3c1d2a43577_invokedynamic5288_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic1602_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic1602_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5295_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic5295_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_call5297_8(net.minecraft.entity.passive.EntityOcelot a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1983_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_52b5e237b1bd_methodHandleLiteral11627_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e3ce5c7e7d84_originalDynamicSite1982_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd276fc49293_originalDynamicSite1984_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native void __sourceExactCall_ae34dbea601cc3(net.minecraft.entity.ai.EntityAITasks p0, int p1, moom.uc p2);

private static native moom.AV __sourceExactCall_d8aba1f18872df(net.minecraft.entity.passive.EntityOcelot p0);
}
