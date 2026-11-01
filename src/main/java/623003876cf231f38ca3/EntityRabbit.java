package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityRabbit extends moom.sK {

private moom.ui<net.minecraft.entity.passive.EntityWolf> cd;

private int ce;

private int cf;

private boolean cg;

private boolean ch;

private int ci;

private net.minecraft.entity.passive.EntityRabbit$EnumMoveType cj;

private int ck;

private net.minecraft.entity.player.EntityPlayer cl;

private static long jb;

private static long[] kb;

private static java.lang.Integer[] Ab;

private static java.util.Map Bb;

public EntityRabbit(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_3c008dcdcdd03f6b(net.minecraft.entity.passive.EntityRabbit receiver, net.minecraft.world.World p0) throws Throwable {
long local2_life1 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 53366328520939L);
    net.minecraft.entity.passive.EntityRabbit.__sourceConstructorInit_3c008dcdcdd03f6b_0(((net.minecraft.entity.passive.EntityRabbit)(receiver)), ((net.minecraft.world.World)(p0)));
    int __sourceSpill941_5 = moom.vR.c();
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).ce = ((int)(0));
    int local4_life6 = __sourceSpill941_5;
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).cf = ((int)(0));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).cg = ((boolean)(false));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).ch = ((boolean)(false));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).ci = ((int)(0));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).cj = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.HOP));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).ck = ((int)(0));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).cl = ((net.minecraft.entity.player.EntityPlayer)(null));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.666666p-1f)));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).bG = ((net.minecraft.entity.ai.EntityJumpHelper)(new moom.vs(receiver)));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).bF = ((net.minecraft.entity.ai.EntityMoveHelper)(new moom.vy(receiver)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_3488faaf561759(((net.minecraft.entity.passive.EntityRabbit)(receiver))))))).a(((boolean)(true)));
    ((moom.AV)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bI)).a(((float)(0x1.4p1f)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uK(receiver, 0x1.547ae147ae148p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.u3(receiver, 0x1.0p0d, net.minecraft.init.Items.bG, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.u3(receiver, 0x1.0p0d, net.minecraft.init.Items.bL, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.u3(receiver, 0x1.0p0d, net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.N))), false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uz(receiver, 0x1.999999999999ap-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.uF(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.u6(receiver, 0x1.3333333333333p-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(__sourceIntrinsic_3c008dcdcdd03f6b_originalDynamicSite941_44(9811, (8542165480486780008L ^ local2_life1)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.4p3f))));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).cd = ((moom.ui)(new moom.ui(receiver, net.minecraft.entity.passive.EntityWolf.class, 0x1.0p4f, 0x1.547ae147ae148p0d, 0x1.547ae147ae148p0d)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(((net.minecraft.entity.passive.EntityRabbit)(receiver)).cd)));
    ((net.minecraft.entity.passive.EntityRabbit)(receiver)).a(((double)(0x0.0p0d)));
    if ((local4_life6 != 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(-8752467419261384L)), ((long)(-3041163964712887180L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12712007531138L)))));
    Bb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 120443792897709L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1882_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1882_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1882_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1882_14 = new byte[8];
    (__sourceSpill1882_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1882_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1882_16 = __sourceSpill1882_14;
    ((javax.crypto.Cipher)(__sourceSpill1882_11)).init(((int)(__sourceSpill1882_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1882_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1882_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\004\177Ê²<^?Z­RZ\tg\032xkLÏ\016VÞê¥Uûu\f\013Ç\r(çKlÈ²K%háDô\037VE«IU_V\023`Ñ\005Ó\be1\032\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1882_25 = local6_life21;
        int __sourceSpill1882_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1882_25)).substring(((int)(__sourceSpill1882_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1882_30 = local8_life19;
        int __sourceSpill1882_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1882_33 = new byte[8];
        (__sourceSpill1882_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1882_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1882_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1882_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1882_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1882_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1882_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1882_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1882_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1882_34)).doFinal(((byte[])(__sourceSpill1882_33)));
        (__sourceSpill1882_30)[__sourceSpill1882_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "è¤¸®Àö<½\013­ï@z"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1882_38 = local6_life21;
        int __sourceSpill1882_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1882_38)).substring(((int)(__sourceSpill1882_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1882_43 = local8_life19;
        int __sourceSpill1882_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1882_46 = new byte[8];
        (__sourceSpill1882_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1882_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1882_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1882_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1882_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1882_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1882_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1882_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1882_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1882_47)).doFinal(((byte[])(__sourceSpill1882_46)));
        (__sourceSpill1882_43)[__sourceSpill1882_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    kb = ((long[])(local8_life19));
    Ab = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3c008dcdcdd03f6b_0(net.minecraft.entity.passive.EntityRabbit a0, net.minecraft.world.World a1) throws E;

private void Z__sourceReturn_da8c82d5d4() {
((moom.vs)(((moom.vs)(this.bG)))).a(((boolean)(true)));
    return;
}


protected java.lang.String i__String() {
return "mob.rabbit.idle";
}


protected java.lang.String b__sourceReturn_0e30dfc966() {
return "mob.rabbit.hop";
}


public void b(net.minecraft.entity.passive.EntityRabbit$EnumMoveType p0) {
((net.minecraft.entity.passive.EntityRabbit)(this)).a(((boolean)(true)), ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(p0)));
    this.cf = ((int)(((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(p0)).b__Int()));
    this.ce = ((int)(0));
    return;
}


protected void b(boolean p0, int p1) {
net.minecraft.entity.passive.EntityRabbit lexicalValue1604_56_0;
    int spill1604_0;
    net.minecraft.entity.passive.EntityRabbit spill1604_1;
    long life3_3;
    int life6_16;
    int life5_17;
    int life7_19;
    int life7_42;
    lexical_join_63: {
    lexical_join_38: {
    lexical_join_33: {
    life3_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 40050451582299L);
    spill1604_0 = moom.vR.b();
    life6_16 = (((java.util.Random)(this.ah)).nextInt(((int)(2))) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    life5_17 = spill1604_0;
    life7_19 = 0;
    lexical_cycle_20: while (true) {
    if (!((life7_19 < life6_16))) {
        break lexical_join_33;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bh)), ((int)(1)));
    life7_19 += 1;
    if (!((life5_17 != 0))) {
        break lexical_join_38;
    }
    if (!((life5_17 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    life6_16 = ((java.util.Random)(this.ah)).nextInt(((int)(2)));
    }
    life7_42 = 0;
    lexical_cycle_40: while (true) {
    lexical_join_60: {
    lexical_join_56: {
    lexical_join_55: {
    if (!((life7_42 < life6_16))) {
        break lexical_join_63;
    }
    spill1604_1 = this;
    if (!((life5_17 != 0))) {
        lexicalValue1604_56_0 = spill1604_1;
        break lexical_join_56;
    }
    if (!(((net.minecraft.entity.passive.EntityRabbit)(spill1604_1)).r__Boolean())) {
        break lexical_join_55;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.be)), ((int)(1)));
    if (!((life5_17 == 0))) {
        break lexical_join_60;
    }
    }
    lexicalValue1604_56_0 = this;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(lexicalValue1604_56_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bd)), ((int)(1)));
    }
    life7_42 += 1;
    if (!((life5_17 == 0))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    return;
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue5317_16_0;
    int forwardValue5317_18_0;
    boolean spill5317_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 23357783570356L);
    life4_5 = moom.vR.c();
    if (!((p0 != null))) {
        break forward_join_17;
    }
    spill5317_0 = ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p0)).a__wQ())));
    if (!((life4_5 == 0))) {
        forwardValue5317_16_0 = ((spill5317_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5317_0)) {
        break forward_join_17;
    }
    forwardValue5317_16_0 = 1;
    }
    forwardValue5317_18_0 = forwardValue5317_16_0;
    break forward_join_18;
    }
    forwardValue5317_18_0 = 0;
    }
    return ((forwardValue5317_18_0) != 0);
}


protected void ad__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 70984384136876L);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BLOCK_DUST)), ((double)(((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(((this.o + 0x1.0p-1d) + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))))), ((double)(((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[] {__sourceExactCall_042b2eb2353c3d(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bQ)).b__fE(((int)(__sourceIntrinsic_3d48373f5386_originalDynamicSite1986_18(4544, (460744281701006779L ^ local1))))))))})));
    this.ck = ((int)(__sourceIntrinsic_3d48373f5386_originalDynamicSite1986_22(15416, (7569813883983433794L ^ local1))));
    return;
}


public boolean ae() {
return ((((this.cg) ? 1 : 0)) != 0);
}


protected java.lang.String c__String() {
return "mob.rabbit.hurt";
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.passive.EntityRabbit)(this)).n(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("RabbitType"))))));
    this.ck = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("MoreCarrotTicks")))));
    return;
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
int forwardValue5319_42_0;
    int spill5319_0;
    long life2_3;
    int life4_5;
    forward_join_42: {
    forward_join_37: {
    life2_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 75818892079418L);
    life4_5 = moom.vR.b();
    spill5319_0 = ((net.minecraft.entity.passive.EntityRabbit)(this)).t();
    if (!((life4_5 != 0))) {
        forwardValue5319_42_0 = spill5319_0;
        break forward_join_42;
    }
    if (!((spill5319_0 == __sourceIntrinsic_e42ce9941c53_invokedynamic5319_3(5788, (7390434725542972797L ^ life2_3))))) {
        break forward_join_37;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((java.lang.String)("mob.attack")), ((float)(0x1.0p0f)), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    return ((net.minecraft.entity.Entity)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(0x1.0p3f)));
    }
    forwardValue5319_42_0 = ((((net.minecraft.entity.Entity)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(0x1.8p1f)))) ? 1 : 0);
    }
    return ((forwardValue5319_42_0) != 0);
}


public float c__sourceReturn_f6c4892e39(float p0) {
int forwardValue5318_15_0;
    float forwardValue5318_22_0;
    int spill5318_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 8973954163099L);
    life4_5 = moom.vR.b();
    spill5318_0 = this.cf;
    if (!((life4_5 != 0))) {
        forwardValue5318_15_0 = spill5318_0;
        break forward_join_15;
    }
    if (!((spill5318_0 == 0))) {
        break forward_join_13;
    }
    forwardValue5318_22_0 = 0x0.0p0f;
    break forward_join_22;
    }
    forwardValue5318_15_0 = this.ce;
    }
    forwardValue5318_22_0 = ((((float) forwardValue5318_15_0) + p0) / ((float) this.cf));
    }
    return forwardValue5318_22_0;
}


public void n(int p0) {
net.minecraft.entity.passive.EntityRabbit forwardValue5322_69_0;
    net.minecraft.entity.passive.EntityRabbit spill5322_0;
    long life2_3;
    int life4_5;
    forward_join_79: {
    forward_join_69: {
    forward_join_68: {
    life2_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 43852886717509L);
    life4_5 = moom.vR.b();
    if (!((life4_5 != 0))) {
        break forward_join_79;
    }
    if (!((p0 == __sourceIntrinsic_e3ce5c7e7d84_invokedynamic5322_2(14716, (8891621965737420779L ^ life2_3))))) {
        break forward_join_68;
    }
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((moom.uc)(this.cd)));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(4)), ((moom.uc)(new moom.ug(this))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(1)), ((moom.uc)(new moom.uT(this, false, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(2)), ((moom.uc)(new moom.uV(this, net.minecraft.entity.player.EntityPlayer.class, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(2)), ((moom.uc)(new moom.uV(this, net.minecraft.entity.passive.EntityWolf.class, true))));
    spill5322_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5322_69_0 = spill5322_0;
        break forward_join_69;
    }
    if (!((!((net.minecraft.entity.passive.EntityRabbit)(spill5322_0)).e__Boolean()))) {
        break forward_join_68;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)("entity.KillerBunny.name"))))));
    }
    forwardValue5322_69_0 = this;
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityRabbit)(forwardValue5322_69_0)).al)).b(((int)(__sourceIntrinsic_e3ce5c7e7d84_invokedynamic5322_20(28497, (5449933071511892429L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) p0)))))));
    }
    return;
}


protected java.lang.String h__String() {
return "mob.rabbit.death";
}


protected float h__sourceReturn_bc607678b6() {
net.minecraft.entity.passive.EntityRabbit forwardValue5321_26_0;
    float forwardValue5321_28_0;
    net.minecraft.entity.passive.EntityRabbit spill5321_0;
    net.minecraft.entity.passive.EntityRabbit spill5321_1;
    long life1_3;
    int life3_5;
    forward_join_28: {
    forward_join_26: {
    forward_join_25: {
    life1_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 54214707538077L);
    life3_5 = moom.vR.c();
    spill5321_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5321_26_0 = spill5321_0;
        break forward_join_26;
    }
    if (!(((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.passive.EntityRabbit)(spill5321_0)).bF)).a__Boolean())) {
        break forward_join_25;
    }
    spill5321_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue5321_26_0 = spill5321_1;
        break forward_join_26;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.passive.EntityRabbit)(spill5321_1)).bF)).c())), ((double)((this.o + 0x1.0p-1d)))) > 0))) {
        break forward_join_25;
    }
    forwardValue5321_28_0 = 0x1.0p-1f;
    break forward_join_28;
    }
    forwardValue5321_26_0 = this;
    }
    forwardValue5321_28_0 = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(((net.minecraft.entity.passive.EntityRabbit)(forwardValue5321_26_0)).cj)).b();
    }
    return forwardValue5321_28_0;
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral11647_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntityRabbit.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int f(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16669;
      if (Ab[var3] == null) {
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
         long var5 = kb[var3];
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
         Object[] var9 = (Object[])Bb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Bb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sQ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Ab[var3] = var15;
      }

      return Ab[var3];
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 107688733124866L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1987_3(28497, (5450001321577786506L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public int d__Int() {
net.minecraft.entity.passive.EntityRabbit forwardValue5320_23_0;
    int forwardValue5320_24_0;
    net.minecraft.entity.passive.EntityRabbit spill5320_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 3492422462664L);
    life3_5 = moom.vR.b();
    spill5320_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5320_23_0 = spill5320_0;
        break forward_join_23;
    }
    if (!((((net.minecraft.entity.passive.EntityRabbit)(spill5320_0)).t() == __sourceIntrinsic_c8a36ae237a7_invokedynamic5320_3(14716, (8891592058254622566L ^ life1_3))))) {
        break forward_join_22;
    }
    forwardValue5320_24_0 = __sourceIntrinsic_c8a36ae237a7_invokedynamic5320_4(32476, (475165650640517313L ^ life1_3));
    break forward_join_24;
    }
    forwardValue5320_23_0 = this;
    }
    forwardValue5320_24_0 = __sourceIntrinsic_c8a36ae237a7_call5320_5(forwardValue5320_23_0);
    }
    return forwardValue5320_24_0;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("RabbitType")), ((int)(((net.minecraft.entity.passive.EntityRabbit)(this)).t())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("MoreCarrotTicks")), ((int)(this.ck)));
    return;
}


public net.minecraft.entity.passive.EntityRabbit a__sQ(moom.sJ p0) {
net.minecraft.entity.passive.EntityRabbit forwardValue5314_25_0;
    net.minecraft.entity.passive.EntityRabbit forwardValue5314_27_0;
    net.minecraft.entity.passive.EntityRabbit forwardValue5314_27_1;
    net.minecraft.entity.passive.EntityRabbit forwardValue5314_28_0;
    int forwardValue5314_28_1;
    int spill5314_0;
    net.minecraft.entity.passive.EntityRabbit spill5314_1;
    net.minecraft.entity.passive.EntityRabbit spill5314_2;
    long life2_3;
    net.minecraft.entity.passive.EntityRabbit life5_10;
    int life4_11;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_25: {
    life2_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 71974882001666L);
    spill5314_0 = moom.vR.b();
    life5_10 = new net.minecraft.entity.passive.EntityRabbit(this.i);
    life4_11 = spill5314_0;
    if (!((((p0 instanceof net.minecraft.entity.passive.EntityRabbit) ? 1 : 0) != 0))) {
        break forward_join_29;
    }
    spill5314_1 = life5_10;
    spill5314_2 = this;
    if (!((life4_11 != 0))) {
        forwardValue5314_27_0 = spill5314_1;
        forwardValue5314_27_1 = spill5314_2;
        break forward_join_27;
    }
    if (!(((java.util.Random)(((net.minecraft.entity.passive.EntityRabbit)(spill5314_2)).ah)).nextBoolean())) {
        forwardValue5314_25_0 = spill5314_1;
        break forward_join_25;
    }
    forwardValue5314_28_0 = spill5314_1;
    forwardValue5314_28_1 = ((net.minecraft.entity.passive.EntityRabbit)(this)).t();
    break forward_join_28;
    }
    forwardValue5314_27_0 = forwardValue5314_25_0;
    forwardValue5314_27_1 = ((net.minecraft.entity.passive.EntityRabbit)(p0));
    }
    forwardValue5314_28_0 = forwardValue5314_27_0;
    forwardValue5314_28_1 = ((net.minecraft.entity.passive.EntityRabbit)(forwardValue5314_27_1)).t();
    }
    ((net.minecraft.entity.passive.EntityRabbit)(forwardValue5314_28_0)).n(((int)(forwardValue5314_28_1)));
    }
    return life5_10;
}


private boolean a(net.minecraft.item.Item p0) {
net.minecraft.item.Item forwardValue5311_13_0;
    net.minecraft.item.Item forwardValue5311_13_1;
    net.minecraft.item.Item forwardValue5311_19_0;
    net.minecraft.item.Item forwardValue5311_19_1;
    int forwardValue5311_23_0;
    net.minecraft.item.Item spill5311_0;
    net.minecraft.item.Item spill5311_1;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 89988265775189L);
    life4_5 = moom.vR.c();
    spill5311_0 = p0;
    spill5311_1 = net.minecraft.init.Items.bG;
    if (!((life4_5 == 0))) {
        forwardValue5311_13_0 = spill5311_0;
        forwardValue5311_13_1 = spill5311_1;
        break forward_join_13;
    }
    if (!((spill5311_0 != spill5311_1))) {
        break forward_join_20;
    }
    forwardValue5311_13_0 = p0;
    forwardValue5311_13_1 = net.minecraft.init.Items.bL;
    }
    if (!((life4_5 == 0))) {
        forwardValue5311_19_0 = forwardValue5311_13_0;
        forwardValue5311_19_1 = forwardValue5311_13_1;
        break forward_join_19;
    }
    if (!((forwardValue5311_13_0 != forwardValue5311_13_1))) {
        break forward_join_20;
    }
    forwardValue5311_19_0 = p0;
    forwardValue5311_19_1 = __sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.N)));
    }
    if (!((forwardValue5311_19_0 == forwardValue5311_19_1))) {
        break forward_join_22;
    }
    }
    forwardValue5311_23_0 = 1;
    break forward_join_23;
    }
    forwardValue5311_23_0 = 0;
    }
    return ((forwardValue5311_23_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.sJ a(moom.sJ p0) {
return ((net.minecraft.entity.passive.EntityRabbit)(this)).a__sQ(((moom.sJ)(p0)));
}


public void a(byte p0) {
long life2_3;
    int life4_5;
    forward_join_28: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 8423976354048L);
    life4_5 = moom.vR.c();
    if (!((life4_5 == 0))) { break forward_join_23; }
    if (!((p0 == 1))) { break forward_join_25; }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).p();
    this.cf = ((int)(__sourceIntrinsic_6121ff5511c4_invokedynamic5960_3(9540, (5917912593210412688L ^ life2_3))));
    this.ce = ((int)(0));
    }
    if (!((life4_5 != 0))) { break forward_join_28; }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public void a(net.minecraft.entity.passive.EntityRabbit$EnumMoveType p0) {
this.cj = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(p0));
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
int forestValue60_32_0;
    net.minecraft.entity.passive.EntityRabbit forestValue60_53_0;
    int forestValue60_53_1;
    int spill60_0;
    int spill60_1;
    net.minecraft.entity.passive.EntityRabbit spill60_2;
    int spill60_3;
    long life3_3;
    net.minecraft.entity.IEntityLivingData life2_9;
    int life5_10;
    int life6_19;
    int life7_21;
    forest_join_54: {
    forest_join_53: {
    forest_join_40: {
    forest_join_35: {
    forest_join_32: {
    life3_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 63429187616094L);
    spill60_0 = moom.vR.b();
    life2_9 = super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
    life5_10 = spill60_0;
    life6_19 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_07d6d39f9236_invokedynamic60_4(17333, (4642294737680897075L ^ life3_3)))));
    life7_21 = 0;
    spill60_1 = ((life2_9 instanceof moom.vR) ? 1 : 0);
    if (!((life5_10 != 0))) {
        forestValue60_32_0 = spill60_1;
        break forest_join_32;
    }
    if (!((spill60_1 != 0))) {
        break forest_join_35;
    }
    life6_19 = ((moom.vR)(((moom.vR)(life2_9)))).a;
    forestValue60_32_0 = 1;
    }
    life7_21 = forestValue60_32_0;
    if (!((life5_10 == 0))) {
        break forest_join_40;
    }
    }
    life2_9 = new moom.vR(life6_19);
    }
    spill60_2 = this;
    spill60_3 = life6_19;
    if (!((life5_10 != 0))) {
        forestValue60_53_0 = spill60_2;
        forestValue60_53_1 = spill60_3;
        break forest_join_53;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(spill60_2)).n(((int)(spill60_3)));
    if (!((life7_21 != 0))) {
        break forest_join_54;
    }
    forestValue60_53_0 = this;
    forestValue60_53_1 = __sourceIntrinsic_07d6d39f9236_invokedynamic60_10(6407, (3488518198071512714L ^ life3_3));
    }
    ((net.minecraft.entity.passive.EntityRabbit)(forestValue60_53_0)).l(((int)(forestValue60_53_1)));
    }
    return life2_9;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5313_16_0;
    int forwardValue5313_20_0;
    int forwardValue5313_22_0;
    boolean spill5313_0;
    long life3_3;
    int life5_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life3_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 125561775609299L);
    life5_5 = moom.vR.b();
    spill5313_0 = ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 != 0))) {
        forwardValue5313_16_0 = ((spill5313_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill5313_0))) {
        break forward_join_21;
    }
    forwardValue5313_16_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5313_20_0 = forwardValue5313_16_0;
        break forward_join_20;
    }
    if (!((forwardValue5313_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5313_20_0 = 1;
    }
    forwardValue5313_22_0 = forwardValue5313_20_0;
    break forward_join_22;
    }
    forwardValue5313_22_0 = 0;
    }
    return ((forwardValue5313_22_0) != 0);
}


public void a(boolean p0, net.minecraft.entity.passive.EntityRabbit$EnumMoveType p1) {
net.minecraft.entity.passive.EntityRabbit forwardValue5312_51_0;
    int spill5312_0;
    net.minecraft.entity.passive.EntityRabbit spill5312_1;
    long life3_3;
    int life5_8;
    forward_join_51: {
    forward_join_50: {
    forward_join_31: {
    forward_join_24: {
    life3_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 118587945140747L);
    spill5312_0 = moom.vR.c();
    super.h(((boolean)(p0)));
    life5_8 = spill5312_0;
    if (!((life5_8 == 0))) {
        break forward_join_31;
    }
    if (!((!p0))) {
        break forward_join_24;
    }
    spill5312_1 = this;
    if (!((life5_8 == 0))) {
        forwardValue5312_51_0 = spill5312_1;
        break forward_join_51;
    }
    if (!((((net.minecraft.entity.passive.EntityRabbit)(spill5312_1)).cj == net.minecraft.entity.passive.EntityRabbit$EnumMoveType.ATTACK))) {
        break forward_join_50;
    }
    this.cj = ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.HOP));
    if (!((life5_8 != 0))) {
        break forward_join_50;
    }
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a__sourceReturn_2c20cf5948(((double)((0x1.8p0d * ((double) ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(p1)).a())))));
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((java.lang.String)(((net.minecraft.entity.passive.EntityRabbit)(this)).b__sourceReturn_0e30dfc966())), ((float)(((net.minecraft.entity.passive.EntityRabbit)(this)).f__sourceReturn_bc607678b6())), ((float)(((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f) * 0x1.99999ap-1f))));
    }
    forwardValue5312_51_0 = this;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(forwardValue5312_51_0)).cg = ((boolean)(p0));
    return;
}


private void a(double p0, double p1) {
this.w = ((float)((((float) ((moom.Dr.b(((double)((p1 - this.p))), ((double)((p0 - this.n)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) - 0x1.68p6f)));
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.333334p-2d)));
    return;
}


public void a__sourceReturn_2c20cf5948(double p0) {
((moom.AV)(__sourceExactCall_3488faaf561759(((net.minecraft.entity.passive.EntityRabbit)(this))))).a(((double)(p0)));
    ((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).a(((double)(((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).b())), ((double)(((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).c())), ((double)(((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).d())), ((double)(p0)));
    return;
}


public void o__sourceReturn_da8c82d5d4() {
return;
}


public int t() {
long local1 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 112317622154130L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_cd276fc49293_originalDynamicSite1988_2(18196, (4052567480851127895L ^ local1)))));
}


protected int u__sourceReturn_8abf5c6871() {
return ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(this.cj)).a__Int();
}


protected void A__sourceReturn_da8c82d5d4() {
((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bg, 1))), ((float)(0x0.0p0f)));
    return;
}


private void ac__sourceReturn_da8c82d5d4() {
((net.minecraft.entity.passive.EntityRabbit)(this)).ab__sourceReturn_da8c82d5d4();
    ((net.minecraft.entity.passive.EntityRabbit)(this)).aa__sourceReturn_da8c82d5d4();
    return;
}


public void R() {
net.minecraft.entity.passive.EntityRabbit forwardValue5309_20_0;
    net.minecraft.entity.passive.EntityRabbit forwardValue5309_29_0;
    int forwardValue5309_41_0;
    int forwardValue5309_65_0;
    int forwardValue5309_81_0;
    net.minecraft.entity.passive.EntityRabbit forwardValue5309_132_0;
    moom.AT forwardValue5309_180_0;
    int forwardValue5309_197_0;
    net.minecraft.entity.passive.EntityRabbit forwardValue5309_201_0;
    net.minecraft.entity.passive.EntityRabbit spill5309_0;
    int spill5309_1;
    int spill5309_2;
    net.minecraft.entity.passive.EntityRabbit spill5309_3;
    boolean spill5309_4;
    net.minecraft.entity.passive.EntityRabbit spill5309_5;
    net.minecraft.entity.passive.EntityRabbit spill5309_6;
    net.minecraft.entity.passive.EntityRabbit spill5309_7;
    net.minecraft.entity.passive.EntityRabbit spill5309_8;
    boolean spill5309_9;
    net.minecraft.entity.passive.EntityRabbit spill5309_10;
    net.minecraft.entity.passive.EntityRabbit spill5309_11;
    moom.AT spill5309_12;
    long life1_3;
    int life3_5;
    net.minecraft.entity.EntityLivingBase life4_153;
    moom.vs life4_200;
    moom.AT life5_235;
    moom.DR life6_248;
    forward_join_201: {
    forward_join_200: {
    forward_join_197: {
    forward_join_195: {
    forward_join_193: {
    forward_join_183: {
    forward_join_180: {
    forward_join_132: {
    forward_join_131: {
    forward_join_81: {
    forward_join_77: {
    forward_join_65: {
    forward_join_61: {
    forward_join_41: {
    forward_join_39: {
    forward_join_29: {
    forward_join_28: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 76633947212531L);
    life3_5 = moom.vR.c();
    spill5309_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_20_0 = spill5309_0;
        break forward_join_20;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.passive.EntityRabbit)(spill5309_0)).bF)).a())), ((double)(0x1.999999999999ap-1d))) > 0))) {
        break forward_join_19;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.SPRINT)));
    if (!((life3_5 != 0))) {
        break forward_join_28;
    }
    }
    forwardValue5309_20_0 = this;
    }
    if (!((life3_5 == 0))) {
        forwardValue5309_29_0 = forwardValue5309_20_0;
        break forward_join_29;
    }
    if (!((((net.minecraft.entity.passive.EntityRabbit)(forwardValue5309_20_0)).cj != net.minecraft.entity.passive.EntityRabbit$EnumMoveType.ATTACK))) {
        break forward_join_28;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.HOP)));
    }
    forwardValue5309_29_0 = this;
    }
    spill5309_1 = ((net.minecraft.entity.passive.EntityRabbit)(forwardValue5309_29_0)).ci;
    if (!((life3_5 == 0))) {
        forwardValue5309_41_0 = spill5309_1;
        break forward_join_41;
    }
    if (!((spill5309_1 > 0))) {
        break forward_join_39;
    }
    net.minecraft.entity.passive.EntityRabbit __stackOp5309_12_0 = this;
    ((net.minecraft.entity.passive.EntityRabbit)(__stackOp5309_12_0)).ci = ((int)((((net.minecraft.entity.passive.EntityRabbit)(__stackOp5309_12_0)).ci - 1)));
    }
    forwardValue5309_41_0 = this.ck;
    }
    if (!((life3_5 == 0))) {
        forwardValue5309_65_0 = forwardValue5309_41_0;
        break forward_join_65;
    }
    if (!((forwardValue5309_41_0 > 0))) {
        break forward_join_61;
    }
    net.minecraft.entity.passive.EntityRabbit __stackOp5309_16_0 = this;
    ((net.minecraft.entity.passive.EntityRabbit)(__stackOp5309_16_0)).ck = ((int)((((net.minecraft.entity.passive.EntityRabbit)(__stackOp5309_16_0)).ck - ((java.util.Random)(this.ah)).nextInt(((int)(3))))));
    spill5309_2 = this.ck;
    if (!((life3_5 == 0))) {
        forwardValue5309_65_0 = spill5309_2;
        break forward_join_65;
    }
    if (!((spill5309_2 < 0))) {
        break forward_join_61;
    }
    this.ck = ((int)(0));
    }
    spill5309_3 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_201_0 = spill5309_3;
        break forward_join_201;
    }
    forwardValue5309_65_0 = ((((net.minecraft.entity.passive.EntityRabbit)(spill5309_3)).A) ? 1 : 0);
    }
    if (!((forwardValue5309_65_0 != 0))) {
        break forward_join_200;
    }
    spill5309_4 = this.ch;
    if (!((life3_5 == 0))) {
        forwardValue5309_81_0 = ((spill5309_4) ? 1 : 0);
        break forward_join_81;
    }
    if (!((!spill5309_4))) {
        break forward_join_77;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((boolean)(false)), ((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.NONE)));
    ((net.minecraft.entity.passive.EntityRabbit)(this)).ac__sourceReturn_da8c82d5d4();
    }
    spill5309_5 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_132_0 = spill5309_5;
        break forward_join_132;
    }
    forwardValue5309_81_0 = ((net.minecraft.entity.passive.EntityRabbit)(spill5309_5)).t();
    }
    if (!((forwardValue5309_81_0 == __sourceIntrinsic_ebf98100c39e_invokedynamic5309_31(14716, (8891514420553406813L ^ life1_3))))) {
        break forward_join_131;
    }
    spill5309_6 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_132_0 = spill5309_6;
        break forward_join_132;
    }
    if (!((((net.minecraft.entity.passive.EntityRabbit)(spill5309_6)).ci == 0))) {
        break forward_join_131;
    }
    spill5309_7 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_132_0 = spill5309_7;
        break forward_join_132;
    }
    life4_153 = ((net.minecraft.entity.passive.EntityRabbit)(spill5309_7)).d__sourceReturn_d30556f370();
    if (!((life4_153 != null))) {
        break forward_join_131;
    }
    spill5309_8 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_132_0 = spill5309_8;
        break forward_join_132;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.passive.EntityRabbit)(spill5309_8)).a(((net.minecraft.entity.Entity)(life4_153))))), ((double)(0x1.0p4d))) < 0))) {
        break forward_join_131;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((double)(((net.minecraft.entity.EntityLivingBase)(life4_153)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_153)).p)));
    ((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).a(((double)(((net.minecraft.entity.EntityLivingBase)(life4_153)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_153)).o)), ((double)(((net.minecraft.entity.EntityLivingBase)(life4_153)).p)), ((double)(((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).a())));
    ((net.minecraft.entity.passive.EntityRabbit)(this)).b(((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.ATTACK)));
    this.ch = ((boolean)(true));
    }
    forwardValue5309_132_0 = this;
    }
    life4_200 = ((moom.vs)(((net.minecraft.entity.passive.EntityRabbit)(forwardValue5309_132_0)).bG));
    spill5309_9 = ((moom.vs)(life4_200)).a__sourceReturn_aae029aa0a();
    if (!((life3_5 == 0))) {
        forwardValue5309_197_0 = ((spill5309_9) ? 1 : 0);
        break forward_join_197;
    }
    if (!((!spill5309_9))) {
        break forward_join_195;
    }
    spill5309_10 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_201_0 = spill5309_10;
        break forward_join_201;
    }
    if (!(((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.passive.EntityRabbit)(spill5309_10)).bF)).a__Boolean())) {
        break forward_join_200;
    }
    spill5309_11 = this;
    if (!((life3_5 == 0))) {
        forwardValue5309_201_0 = spill5309_11;
        break forward_join_201;
    }
    if (!((((net.minecraft.entity.passive.EntityRabbit)(spill5309_11)).ci == 0))) {
        break forward_join_200;
    }
    life5_235 = ((moom.AV)(this.bI)).a__AT();
    life6_248 = new moom.DR(((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).b(), ((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).c(), ((net.minecraft.entity.ai.EntityMoveHelper)(this.bF)).d());
    if (!((life3_5 == 0))) {
        break forward_join_193;
    }
    if (!((life5_235 != null))) {
        break forward_join_183;
    }
    spill5309_12 = life5_235;
    if (!((life3_5 == 0))) {
        forwardValue5309_180_0 = spill5309_12;
        break forward_join_180;
    }
    if (!((((moom.AT)(spill5309_12)).b() < ((moom.AT)(life5_235)).a()))) {
        break forward_join_183;
    }
    forwardValue5309_180_0 = life5_235;
    }
    life6_248 = ((moom.AT)(forwardValue5309_180_0)).a(((net.minecraft.entity.Entity)(this)));
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).a(((double)(((moom.DR)(life6_248)).a)), ((double)(((moom.DR)(life6_248)).c)));
    ((net.minecraft.entity.passive.EntityRabbit)(this)).b(((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(this.cj)));
    }
    if (!((life3_5 != 0))) {
        break forward_join_200;
    }
    }
    forwardValue5309_197_0 = ((((moom.vs)(life4_200)).b__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5309_197_0 == 0))) {
        break forward_join_200;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this)).Z__sourceReturn_da8c82d5d4();
    }
    forwardValue5309_201_0 = this;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(forwardValue5309_201_0)).ch = ((boolean)(this.A));
    return;
}


private void ab__sourceReturn_da8c82d5d4() {
this.ci = ((int)(((net.minecraft.entity.passive.EntityRabbit)(this)).u__sourceReturn_8abf5c6871()));
    return;
}


private void aa__sourceReturn_da8c82d5d4() {
((moom.vs)(((moom.vs)(this.bG)))).a(((boolean)(false)));
    return;
}


public void G() {
net.minecraft.entity.passive.EntityRabbit forwardValue5308_32_0;
    int forwardValue5308_43_0;
    net.minecraft.entity.passive.EntityRabbit forwardValue5308_48_0;
    int spill5308_0;
    int spill5308_1;
    net.minecraft.entity.passive.EntityRabbit spill5308_2;
    net.minecraft.entity.passive.EntityRabbit spill5308_3;
    net.minecraft.entity.passive.EntityRabbit spill5308_4;
    long life1_3;
    int life3_7;
    forward_join_50: {
    forward_join_48: {
    forward_join_43: {
    forward_join_39: {
    forward_join_32: {
    forward_join_31: {
    life1_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 117837086048089L);
    spill5308_0 = moom.vR.b();
    super.G();
    life3_7 = spill5308_0;
    spill5308_1 = this.ce;
    if (!((life3_7 != 0))) {
        forwardValue5308_43_0 = spill5308_1;
        break forward_join_43;
    }
    if (!((spill5308_1 != this.cf))) {
        break forward_join_39;
    }
    spill5308_2 = this;
    if (!((life3_7 != 0))) {
        forwardValue5308_32_0 = spill5308_2;
        break forward_join_32;
    }
    if (!((((net.minecraft.entity.passive.EntityRabbit)(spill5308_2)).ce == 0))) {
        break forward_join_31;
    }
    spill5308_3 = this;
    if (!((life3_7 != 0))) {
        forwardValue5308_32_0 = spill5308_3;
        break forward_join_32;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityRabbit)(spill5308_3)).i)).G))) {
        break forward_join_31;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(1)));
    }
    forwardValue5308_32_0 = this;
    }
    net.minecraft.entity.passive.EntityRabbit __stackOp5308_10_0 = forwardValue5308_32_0;
    ((net.minecraft.entity.passive.EntityRabbit)(__stackOp5308_10_0)).ce = ((int)((((net.minecraft.entity.passive.EntityRabbit)(__stackOp5308_10_0)).ce + 1)));
    if (!((life3_7 == 0))) {
        break forward_join_50;
    }
    }
    spill5308_4 = this;
    if (!((life3_7 != 0))) {
        forwardValue5308_48_0 = spill5308_4;
        break forward_join_48;
    }
    forwardValue5308_43_0 = ((net.minecraft.entity.passive.EntityRabbit)(spill5308_4)).cf;
    }
    if (!((forwardValue5308_43_0 != 0))) {
        break forward_join_50;
    }
    this.ce = ((int)(0));
    forwardValue5308_48_0 = this;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(forwardValue5308_48_0)).cf = ((int)(0));
    }
    return;
}


private boolean af() {
int forwardValue5315_12_0;
    int forwardValue5315_14_0;
    int spill5315_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.passive.EntityRabbit.jb ^ 34372373535822L);
    life3_5 = moom.vR.b();
    spill5315_0 = this.ck;
    if (!((life3_5 != 0))) {
        forwardValue5315_12_0 = spill5315_0;
        break forward_join_12;
    }
    if (!((spill5315_0 == 0))) {
        break forward_join_13;
    }
    forwardValue5315_12_0 = 1;
    }
    forwardValue5315_14_0 = forwardValue5315_12_0;
    break forward_join_14;
    }
    forwardValue5315_14_0 = 0;
    }
    return ((forwardValue5315_14_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_3c008dcdcdd03f6b_originalDynamicSite941_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5309_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic5960_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic60_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic60_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3d48373f5386_originalDynamicSite1986_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3d48373f5386_originalDynamicSite1986_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic5319_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8a36ae237a7_invokedynamic5320_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8a36ae237a7_invokedynamic5320_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8a36ae237a7_call5320_5(net.minecraft.entity.passive.EntityRabbit a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1987_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral11647_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e3ce5c7e7d84_invokedynamic5322_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e3ce5c7e7d84_invokedynamic5322_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd276fc49293_originalDynamicSite1988_2(int a0, long a1) throws E;

private static native int __sourceExactCall_042b2eb2353c3d(net.minecraft.block.state.IBlockState p0);
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native moom.AV __sourceExactCall_3488faaf561759(net.minecraft.entity.passive.EntityRabbit p0);
}
