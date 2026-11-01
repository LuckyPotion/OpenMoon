package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityIronGolem extends moom.sW {

private int b4;

net.minecraft.village.Village b5;

private int b6;

private int b7;

private static long db;

private static long[] jb;

private static java.lang.Integer[] kb;

private static java.util.Map ub;

public EntityIronGolem(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_5f6097cd03de1f50(net.minecraft.entity.monster.EntityIronGolem receiver, net.minecraft.world.World p0) throws Throwable {
long local2_life1 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 42492709992138L);
    net.minecraft.entity.Entity[] __sourceSpill937_3 = moom.vN.b();
    net.minecraft.entity.monster.EntityIronGolem.__sourceConstructorInit_5f6097cd03de1f50_0(((net.minecraft.entity.monster.EntityIronGolem)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntityIronGolem)(receiver)).a__Void(((float)(0x1.666666p0f)), ((float)(0x1.733334p1f)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_b8c3fd0b844011(((net.minecraft.entity.monster.EntityIronGolem)(receiver))))))).a(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.ue(receiver, 0x1.0p0d, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.uH(receiver, 0x1.ccccccccccccdp-1d, 0x1.0p5f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uB(receiver, 0x1.3333333333333p-1d, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uG(receiver, 0x1.0p0d))));
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)), ((int)(5)), ((moom.uc)(new moom.ux(receiver))));
    net.minecraft.entity.Entity[] local4_life19 = __sourceSpill937_3;
    __sourceExactCall_ae34dbea601cc3(((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)), ((int)(__sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_21(3960, (6503453902026264778L ^ local2_life1)))), ((moom.uc)(new moom.u6(receiver, 0x1.3333333333333p-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)).a(((int)(__sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_24(7731, (2753297058197881228L ^ local2_life1)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.8p2f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bJ)).a(((int)(__sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_28(12902, (6282771409092963800L ^ local2_life1)))), ((moom.uc)(new moom.uy(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uS(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uT(receiver, false, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityIronGolem)(receiver)).bK)).a(((int)(3)), ((moom.uc)(new moom.uY(receiver, net.minecraft.entity.EntityLiving.class, __sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_36(3236, (8841743301415621405L ^ local2_life1)), false, true, moom.vP.b))));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.vN.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
    return;
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(-1874161621689714408L)), ((long)(-1880742168895524175L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74360036885740L)))));
    ub = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 81604119735520L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1872_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1872_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1872_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1872_14 = new byte[8];
    (__sourceSpill1872_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1872_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1872_16 = __sourceSpill1872_14;
    ((javax.crypto.Cipher)(__sourceSpill1872_11)).init(((int)(__sourceSpill1872_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1872_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1872_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "?\0138¿O[¸zyr:ÿgHp\"V·Û\024åÌü{»¢\020Ý\030hS\002\"¬Ê{ÝÖ\034'Wç>nX5 ÷µ£*}¤eb\030]\032â9Þ9aÂr/§dK@0'ZA® xßJ9V\"Mùû\000NF!x\b¢³\fjÑ¥ÂF\"Øb\f|lMJ\0267oG§'_ÄÇ9-«\025"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1872_25 = local6_life21;
        int __sourceSpill1872_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1872_25)).substring(((int)(__sourceSpill1872_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1872_30 = local8_life19;
        int __sourceSpill1872_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1872_33 = new byte[8];
        (__sourceSpill1872_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1872_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1872_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1872_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1872_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1872_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1872_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1872_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1872_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1872_34)).doFinal(((byte[])(__sourceSpill1872_33)));
        (__sourceSpill1872_30)[__sourceSpill1872_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ð¯EØÇ\177E¡(\016íð;$"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1872_38 = local6_life21;
        int __sourceSpill1872_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1872_38)).substring(((int)(__sourceSpill1872_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1872_43 = local8_life19;
        int __sourceSpill1872_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1872_46 = new byte[8];
        (__sourceSpill1872_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1872_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1872_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1872_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1872_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1872_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1872_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1872_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1872_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1872_47)).doFinal(((byte[])(__sourceSpill1872_46)));
        (__sourceSpill1872_43)[__sourceSpill1872_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    jb = ((long[])(local8_life19));
    kb = ((java.lang.Integer[])(new java.lang.Integer[19]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5f6097cd03de1f50_0(net.minecraft.entity.monster.EntityIronGolem a0, net.minecraft.world.World a1) throws E;

protected void b(boolean p0, int p1) {
net.minecraft.entity.Entity[] spill1588_0;
    long life3_3;
    int life6_9;
    net.minecraft.entity.Entity[] life5_10;
    int life7_12;
    int life8_41;
    lexical_join_50: {
    lexical_join_37: {
    lexical_join_30: {
    life3_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 31631291264014L);
    spill1588_0 = moom.vN.b();
    life6_9 = ((java.util.Random)(this.ah)).nextInt(((int)(3)));
    life5_10 = spill1588_0;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life7_12 < life6_9))) {
        break lexical_join_30;
    }
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((net.minecraft.item.Item)(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(net.minecraft.init.Blocks.O))))), ((int)(1)), ((float)(((float) ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.POPPY)).a()))));
    life7_12 += 1;
    if (!((life5_10 == null))) {
        break lexical_join_37;
    }
    if (!((life5_10 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    life7_12 = (3 + ((java.util.Random)(this.ah)).nextInt(((int)(3))));
    }
    life8_41 = 0;
    lexical_cycle_39: while (true) {
    if (!((life8_41 < life7_12))) {
        break lexical_join_50;
    }
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.j)), ((int)(1)));
    life8_41 += 1;
    if (!((life5_10 != null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    return;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).m(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("PlayerCreated"))))));
    return;
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
int forwardValue5161_58_0;
    net.minecraft.entity.Entity[] spill5161_0;
    int spill5161_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_12;
    int life5_37;
    forward_join_58: {
    forward_join_52: {
    life2_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 136737618694255L);
    spill5161_0 = moom.vN.b();
    this.b6 = ((int)(__sourceIntrinsic_e42ce9941c53_invokedynamic5161_2(15840, (55694055877870828L ^ life2_3))));
    life4_12 = spill5161_0;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(4)));
    life5_37 = ((((net.minecraft.entity.Entity)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a__CU(((net.minecraft.entity.EntityLivingBase)(this))))), ((float)(((float) (__sourceIntrinsic_e42ce9941c53_invokedynamic5161_7(14202, (2649388591718829666L ^ life2_3)) + ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_e42ce9941c53_invokedynamic5161_9(28102, (3698808045808506068L ^ life2_3))))))))))) ? 1 : 0);
    spill5161_1 = life5_37;
    if (!((life4_12 == null))) {
        forwardValue5161_58_0 = spill5161_1;
        break forward_join_58;
    }
    if (!((spill5161_1 != 0))) {
        break forward_join_52;
    }
    net.minecraft.entity.Entity __stackOp5161_13_0 = p0;
    ((net.minecraft.entity.Entity)(__stackOp5161_13_0)).u = ((double)((((net.minecraft.entity.Entity)(__stackOp5161_13_0)).u + 0x1.99999ap-2d)));
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.Entity)(p0)));
    }
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((java.lang.String)("mob.irongolem.throw")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    forwardValue5161_58_0 = life5_37;
    }
    return ((forwardValue5161_58_0) != 0);
}


protected java.lang.String c__String() {
return "mob.irongolem.hit";
}


protected java.lang.String h__String() {
return "mob.irongolem.death";
}


protected void h(net.minecraft.entity.Entity p0) {
int forwardValue5162_26_0;
    net.minecraft.entity.monster.EntityIronGolem forwardValue5162_32_0;
    int spill5162_0;
    net.minecraft.entity.monster.EntityIronGolem spill5162_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 40782750240730L);
    life4_5 = moom.vN.b();
    if (!((life4_5 == null))) {
        break forward_join_34;
    }
    if (!((((p0 instanceof moom.vP) ? 1 : 0) != 0))) {
        break forward_join_31;
    }
    spill5162_0 = ((p0 instanceof net.minecraft.entity.monster.EntityCreeper) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue5162_26_0 = spill5162_0;
        break forward_join_26;
    }
    if (!((spill5162_0 == 0))) {
        break forward_join_31;
    }
    spill5162_1 = this;
    if (!((life4_5 == null))) {
        forwardValue5162_32_0 = spill5162_1;
        break forward_join_32;
    }
    forwardValue5162_26_0 = ((java.util.Random)(((net.minecraft.entity.monster.EntityIronGolem)(spill5162_1)).a__Random())).nextInt(((int)(__sourceIntrinsic_c524aa797f6f_invokedynamic5162_5(3448, (3281311269378845652L ^ life2_3)))));
    }
    if (!((forwardValue5162_26_0 == 0))) {
        break forward_join_31;
    }
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).c(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))));
    }
    forwardValue5162_32_0 = this;
    }
    __sourceIntrinsic_c524aa797f6f_call5162_9(forwardValue5162_32_0, p0);
    }
    return;
}


public void l(boolean p0) {
net.minecraft.entity.monster.EntityIronGolem forwardValue5163_16_0;
    int forwardValue5163_16_1;
    net.minecraft.entity.monster.EntityIronGolem forwardValue5163_17_0;
    net.minecraft.entity.monster.EntityIronGolem forwardValue5163_18_0;
    int forwardValue5163_18_1;
    net.minecraft.entity.monster.EntityIronGolem spill5163_0;
    boolean spill5163_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 55083618064274L);
    life4_5 = moom.vN.b();
    spill5163_0 = this;
    spill5163_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue5163_16_0 = spill5163_0;
        forwardValue5163_16_1 = ((spill5163_1) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5163_1)) {
        forwardValue5163_17_0 = spill5163_0;
        break forward_join_17;
    }
    forwardValue5163_16_0 = spill5163_0;
    forwardValue5163_16_1 = __sourceIntrinsic_93fe014f0768_invokedynamic5163_3(16503, (5487177509687869087L ^ life2_3));
    }
    forwardValue5163_18_0 = forwardValue5163_16_0;
    forwardValue5163_18_1 = forwardValue5163_16_1;
    break forward_join_18;
    }
    forwardValue5163_18_0 = forwardValue5163_17_0;
    forwardValue5163_18_1 = 0;
    }
    ((net.minecraft.entity.monster.EntityIronGolem)(forwardValue5163_18_0)).b7 = ((int)(forwardValue5163_18_1));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_93fe014f0768_invokedynamic5163_6(27899, (3582673502072836635L ^ life2_3)))));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11468_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 98240930154583L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1948_3(21120, (8347781457229214636L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9194;
      if (kb[var3] == null) {
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
         long var5 = jb[var3];
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
         Object[] var9 = (Object[])ub.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ub.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sX", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         kb[var3] = var15;
      }

      return kb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_07a482379bfb44(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("PlayerCreated")), ((boolean)(((net.minecraft.entity.monster.EntityIronGolem)(this)).ab())));
    return;
}


public net.minecraft.village.Village a__sourceReturn_0a84fc465b() {
return this.b5;
}


public void a(byte p0) {
int forestValue664_31_0;
    int forestValue664_31_1;
    byte spill664_0;
    int spill664_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forest_join_44: {
    forest_join_41: {
    forest_join_31: {
    forest_join_25: {
    life2_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 69274048651349L);
    life4_5 = moom.vN.b();
    spill664_0 = p0;
    spill664_1 = 4;
    if (!((life4_5 == null))) {
        forestValue664_31_0 = ((int)(spill664_0));
        forestValue664_31_1 = spill664_1;
        break forest_join_31;
    }
    if (!((spill664_0 == spill664_1))) {
        break forest_join_25;
    }
    this.b6 = ((int)(__sourceIntrinsic_6121ff5511c4_invokedynamic664_3(3236, (8841752490463249794L ^ life2_3))));
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((java.lang.String)("mob.irongolem.throw")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((life4_5 != null))) {
        break forest_join_44;
    }
    }
    forestValue664_31_0 = ((int)(p0));
    forestValue664_31_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic664_6(27813, (8498508969036653952L ^ life2_3));
    }
    if (!((forestValue664_31_0 == forestValue664_31_1))) {
        break forest_join_41;
    }
    this.b7 = ((int)(__sourceIntrinsic_6121ff5511c4_invokedynamic664_8(30558, (3687989020104965751L ^ life2_3))));
    if (!((life4_5 != null))) {
        break forest_join_44;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public boolean a(java.lang.Class<? extends net.minecraft.entity.EntityLivingBase> p0) {
int forwardValue5157_16_0;
    java.lang.Class forwardValue5157_19_0;
    java.lang.Class forwardValue5157_19_1;
    int forwardValue5157_27_0;
    int forwardValue5157_29_0;
    boolean spill5157_0;
    java.lang.Class spill5157_1;
    java.lang.Class spill5157_2;
    boolean spill5157_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_19: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 103049373447982L);
    life4_5 = moom.vN.b();
    spill5157_0 = ((net.minecraft.entity.monster.EntityIronGolem)(this)).ab();
    if (!((life4_5 == null))) {
        forwardValue5157_16_0 = ((spill5157_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5157_0)) {
        break forward_join_17;
    }
    spill5157_1 = net.minecraft.entity.player.EntityPlayer.class;
    spill5157_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue5157_19_0 = spill5157_1;
        forwardValue5157_19_1 = spill5157_2;
        break forward_join_19;
    }
    forwardValue5157_16_0 = ((((java.lang.Class)(spill5157_1)).isAssignableFrom(((java.lang.Class)(spill5157_2)))) ? 1 : 0);
    }
    if (!((forwardValue5157_16_0 == 0))) {
        break forward_join_28;
    }
    }
    forwardValue5157_19_0 = p0;
    forwardValue5157_19_1 = net.minecraft.entity.monster.EntityCreeper.class;
    }
    if (!((forwardValue5157_19_0 != forwardValue5157_19_1))) {
        break forward_join_28;
    }
    spill5157_3 = super.a(((java.lang.Class)(p0)));
    if (!((life4_5 == null))) {
        forwardValue5157_27_0 = ((spill5157_3) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill5157_3)) {
        break forward_join_28;
    }
    forwardValue5157_27_0 = 1;
    }
    forwardValue5157_29_0 = forwardValue5157_27_0;
    break forward_join_29;
    }
    forwardValue5157_29_0 = 0;
    }
    return ((forwardValue5157_29_0) != 0);
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
net.minecraft.entity.monster.EntityIronGolem forwardValue5158_34_0;
    net.minecraft.entity.monster.EntityIronGolem spill5158_0;
    net.minecraft.entity.monster.EntityIronGolem spill5158_1;
    net.minecraft.entity.monster.EntityIronGolem spill5158_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_34: {
    forward_join_33: {
    life2_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 11062092895615L);
    life4_5 = moom.vN.b();
    spill5158_0 = this;
    if (!((life4_5 == null))) {
        forwardValue5158_34_0 = spill5158_0;
        break forward_join_34;
    }
    if (!((!((net.minecraft.entity.monster.EntityIronGolem)(spill5158_0)).ab()))) {
        break forward_join_33;
    }
    spill5158_1 = this;
    if (!((life4_5 == null))) {
        forwardValue5158_34_0 = spill5158_1;
        break forward_join_34;
    }
    if (!((((net.minecraft.entity.monster.EntityIronGolem)(spill5158_1)).a7 != null))) {
        break forward_join_33;
    }
    spill5158_2 = this;
    if (!((life4_5 == null))) {
        forwardValue5158_34_0 = spill5158_2;
        break forward_join_34;
    }
    if (!((((net.minecraft.entity.monster.EntityIronGolem)(spill5158_2)).b5 != null))) {
        break forward_join_33;
    }
    ((net.minecraft.village.Village)(this.b5)).a(((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this.a7)).a__String())), ((int)(__sourceIntrinsic_1cc68e538389_invokedynamic5158_8(8483, (4009479801488448830L ^ life2_3)))));
    }
    forwardValue5158_34_0 = this;
    }
    __sourceIntrinsic_1cc68e538389_call5158_10(forwardValue5158_34_0, p0);
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected int a__sourceReturn_0f7a48eca2(int p0) {
return p0;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.9p6d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    return;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((java.lang.String)("mob.irongolem.walk")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


public void m(boolean p0) {
long life2_3;
    int life5_13;
    net.minecraft.entity.Entity[] life4_14;
    forward_join_51: {
    forward_join_34: {
    forward_join_32: {
    life2_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 118345696909695L);
    net.minecraft.entity.Entity[] spill5808_0 = moom.vN.b();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_65541a581e64_invokedynamic5808_3(21120, (8347833101887103620L ^ life2_3)))));
    life4_14 = spill5808_0;
    if (!((life4_14 == null))) { break forward_join_32; }
    if (!(p0)) { break forward_join_34; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_65541a581e64_invokedynamic5808_6(21120, (8347833101887103620L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 | 1))))))));
    }
    if (!((life4_14 != null))) { break forward_join_51; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_65541a581e64_invokedynamic5808_10(21120, (8347833101887103620L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 & __sourceIntrinsic_65541a581e64_invokedynamic5808_11(9274, (2637113546405549114L ^ life2_3))))))))));
    }
    return;
}


public int q__sourceReturn_8abf5c6871() {
return this.b6;
}


public int r__sourceReturn_8abf5c6871() {
return this.b7;
}


protected void R() {
net.minecraft.village.Village forwardValue5155_58_0;
    net.minecraft.entity.monster.EntityIronGolem forwardValue5155_71_0;
    net.minecraft.entity.monster.EntityIronGolem spill5155_0;
    int spill5155_1;
    net.minecraft.village.Village spill5155_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.DT life4_74;
    forward_join_71: {
    forward_join_70: {
    forward_join_58: {
    forward_join_56: {
    life1_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 137554785610662L);
    life3_5 = moom.vN.b();
    spill5155_0 = this;
    if (!((life3_5 == null))) {
        forwardValue5155_71_0 = spill5155_0;
        break forward_join_71;
    }
    net.minecraft.entity.monster.EntityIronGolem __stackOp5155_2_0 = spill5155_0;
    net.minecraft.entity.monster.EntityIronGolem __stackOp5155_4_0 = __stackOp5155_2_0;
    int __stackOp5155_4_1 = (((net.minecraft.entity.monster.EntityIronGolem)(__stackOp5155_2_0)).b4 - 1);
    spill5155_1 = __stackOp5155_4_1;
    ((net.minecraft.entity.monster.EntityIronGolem)(__stackOp5155_4_0)).b4 = ((int)(__stackOp5155_4_1));
    if (!((spill5155_1 <= 0))) {
        break forward_join_70;
    }
    this.b4 = ((int)((__sourceIntrinsic_ebf98100c39e_invokedynamic5155_6(28107, (1054160852809838348L ^ life1_3)) + ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5155_8(3060, (6493637773980010796L ^ life1_3))))))));
    this.b5 = ((net.minecraft.village.Village)(((moom.EG)(((net.minecraft.world.World)(this.i)).a__EG())).a(((moom.DT)(new moom.DT(this))), ((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5155_13(18235, (5721677144431805932L ^ life1_3)))))));
    spill5155_2 = this.b5;
    if (!((life3_5 == null))) {
        forwardValue5155_58_0 = spill5155_2;
        break forward_join_58;
    }
    if (!((spill5155_2 == null))) {
        break forward_join_56;
    }
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).W__sourceReturn_da8c82d5d4();
    if (!((life3_5 != null))) {
        break forward_join_70;
    }
    }
    forwardValue5155_58_0 = this.b5;
    }
    life4_74 = ((net.minecraft.village.Village)(forwardValue5155_58_0)).a__DT();
    ((net.minecraft.entity.monster.EntityIronGolem)(this)).a(((moom.DT)(life4_74)), ((int)(((int) (((float) ((net.minecraft.village.Village)(this.b5)).a()) * 0x1.333334p-1f)))));
    }
    forwardValue5155_71_0 = this;
    }
    __sourceIntrinsic_ebf98100c39e_call5155_23(forwardValue5155_71_0);
    return;
}


public boolean ab() {
int forwardValue5159_20_0;
    int forwardValue5159_22_0;
    int spill5159_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 48498248788729L);
    life3_5 = moom.vN.b();
    spill5159_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_cbe0a5f620c8_invokedynamic5159_3(4455, (7051618833225978599L ^ life1_3))))) & 1);
    if (!((life3_5 == null))) {
        forwardValue5159_20_0 = spill5159_0;
        break forward_join_20;
    }
    if (!((spill5159_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5159_20_0 = 1;
    }
    forwardValue5159_22_0 = forwardValue5159_20_0;
    break forward_join_22;
    }
    forwardValue5159_22_0 = 0;
    }
    return ((forwardValue5159_22_0) != 0);
}


public void G() {
int forwardValue5154_21_0;
    int forwardValue5154_43_0;
    int forwardValue5154_50_0;
    int forwardValue5154_56_0;
    net.minecraft.entity.Entity[] spill5154_0;
    int spill5154_1;
    net.minecraft.world.World spill5154_2;
    net.minecraft.util.EnumParticleTypes spill5154_3;
    double spill5154_4;
    double spill5154_5;
    double spill5154_6;
    double spill5154_7;
    double spill5154_8;
    double spill5154_9;
    int[] spill5154_10;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    int life4_80;
    int life5_86;
    int life6_90;
    net.minecraft.block.state.IBlockState life7_100;
    net.minecraft.block.Block life8_103;
    forward_join_143: {
    forward_join_56: {
    forward_join_50: {
    forward_join_43: {
    forward_join_30: {
    forward_join_21: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.monster.EntityIronGolem.db ^ 91827855564300L);
    spill5154_0 = moom.vN.b();
    super.G();
    life3_7 = spill5154_0;
    spill5154_1 = this.b6;
    if (!((life3_7 == null))) {
        forwardValue5154_21_0 = spill5154_1;
        break forward_join_21;
    }
    if (!((spill5154_1 > 0))) {
        break forward_join_19;
    }
    net.minecraft.entity.monster.EntityIronGolem __stackOp5154_4_0 = this;
    ((net.minecraft.entity.monster.EntityIronGolem)(__stackOp5154_4_0)).b6 = ((int)((((net.minecraft.entity.monster.EntityIronGolem)(__stackOp5154_4_0)).b6 - 1)));
    }
    forwardValue5154_21_0 = this.b7;
    }
    if (!((life3_7 == null))) {
        forwardValue5154_43_0 = forwardValue5154_21_0;
        break forward_join_43;
    }
    if (!((forwardValue5154_21_0 > 0))) {
        break forward_join_30;
    }
    net.minecraft.entity.monster.EntityIronGolem __stackOp5154_8_0 = this;
    ((net.minecraft.entity.monster.EntityIronGolem)(__stackOp5154_8_0)).b7 = ((int)((((net.minecraft.entity.monster.EntityIronGolem)(__stackOp5154_8_0)).b7 - 1)));
    }
    forwardValue5154_43_0 = recovery.source.CarrierOps.dcmpl(((double)(((this.t * this.t) + (this.v * this.v)))), ((double)(0x1.0c6f7cp-22d)));
    }
    if (!((life3_7 == null))) {
        forwardValue5154_50_0 = forwardValue5154_43_0;
        break forward_join_50;
    }
    if (!((forwardValue5154_43_0 > 0))) {
        break forward_join_143;
    }
    forwardValue5154_50_0 = ((java.util.Random)(this.ah)).nextInt(((int)(5)));
    }
    if (!((life3_7 == null))) {
        forwardValue5154_56_0 = forwardValue5154_50_0;
        break forward_join_56;
    }
    if (!((forwardValue5154_50_0 == 0))) {
        break forward_join_143;
    }
    forwardValue5154_56_0 = moom.Dr.b__Int(((double)(this.n)));
    }
    life4_80 = forwardValue5154_56_0;
    life5_86 = moom.Dr.b__Int(((double)((this.o - 0x1.99999ap-3d))));
    life6_90 = moom.Dr.b__Int(((double)(this.p)));
    life7_100 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(new moom.DT(life4_80, life5_86, life6_90))));
    life8_103 = ((net.minecraft.block.state.IBlockState)(life7_100)).a__ch();
    if (!((((net.minecraft.block.Block)(life8_103)).a__fn() != moom.fn.a))) {
        break forward_join_143;
    }
    spill5154_2 = this.i;
    spill5154_3 = net.minecraft.util.EnumParticleTypes.BLOCK_CRACK;
    spill5154_4 = (this.n + ((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * ((double) this.G)));
    spill5154_5 = (((moom.CA)(((net.minecraft.entity.monster.EntityIronGolem)(this)).b())).c + 0x1.999999999999ap-4d);
    spill5154_6 = (this.p + ((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * ((double) this.G)));
    spill5154_7 = (0x1.0p2d * (((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d));
    spill5154_8 = 0x1.0p-1d;
    spill5154_9 = ((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * 0x1.0p2d);
    int[] __stackOp5154_45_0 = new int[1];
    spill5154_10 = __stackOp5154_45_0;
    (__stackOp5154_45_0)[0] = __sourceExactCall_042b2eb2353c3d(((net.minecraft.block.state.IBlockState)(life7_100)));
    ((net.minecraft.world.World)(spill5154_2)).a(((net.minecraft.util.EnumParticleTypes)(spill5154_3)), ((double)(spill5154_4)), ((double)(spill5154_5)), ((double)(spill5154_6)), ((double)(spill5154_7)), ((double)(spill5154_8)), ((double)(spill5154_9)), ((int[])(spill5154_10)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f6097cd03de1f50_originalDynamicSite937_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5155_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5155_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5155_13(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_ebf98100c39e_call5155_23(net.minecraft.entity.monster.EntityIronGolem a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic664_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic664_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic664_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1cc68e538389_invokedynamic5158_8(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_1cc68e538389_call5158_10(net.minecraft.entity.monster.EntityIronGolem a0, net.minecraft.util.DamageSource a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbe0a5f620c8_invokedynamic5159_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic5161_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic5161_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e42ce9941c53_invokedynamic5161_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11468_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1948_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c524aa797f6f_invokedynamic5162_5(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c524aa797f6f_call5162_9(net.minecraft.entity.monster.EntityIronGolem a0, net.minecraft.entity.Entity a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5163_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5163_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5808_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5808_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5808_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5808_11(int a0, long a1) throws E;

private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
private static native int __sourceExactCall_07a482379bfb44(int p0, long p1);
private static native int __sourceExactCall_042b2eb2353c3d(net.minecraft.block.state.IBlockState p0);

private static native void __sourceExactCall_ae34dbea601cc3(net.minecraft.entity.ai.EntityAITasks p0, int p1, moom.uc p2);

private static native moom.AV __sourceExactCall_b8c3fd0b844011(net.minecraft.entity.monster.EntityIronGolem p0);
}
