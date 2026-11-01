package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityGuardian extends moom.sZ {

private float b5;

private float b6;

private float b7;

private float b8;

private float b9;

private net.minecraft.entity.EntityLivingBase b_;

private int ca;

private boolean cb;

private moom.u6 cc;

private static long db;

private static long[] jb;

private static java.lang.Integer[] xb;

private static java.util.Map yb;

public EntityGuardian(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_e92c567edc85285d(net.minecraft.entity.monster.EntityGuardian receiver, net.minecraft.world.World p0) throws Throwable {
long local2_life2 = (net.minecraft.entity.monster.EntityGuardian.db ^ 111522487040262L);
    net.minecraft.entity.monster.EntityGuardian.__sourceConstructorInit_e92c567edc85285d_0(((net.minecraft.entity.monster.EntityGuardian)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntityGuardian)(receiver)).bD = ((int)(__sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_5(28115, (4722636638961558449L ^ local2_life2))));
    ((net.minecraft.entity.monster.EntityGuardian)(receiver)).a__Void(((float)(0x1.b333340000000p-1F)), ((float)(0x1.b333340000000p-1F)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.vh(receiver))));
    moom.uG local4_life13;
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).bJ)).a(((int)(5)), ((moom.uc)((local4_life13 = new moom.uG(((moom.sI) receiver), 0x1.0p0d)))));
    net.minecraft.entity.ai.EntityAITasks __sourceSpill482_20 = ((net.minecraft.entity.monster.EntityGuardian)(receiver)).bJ;
    int __sourceSpill482_21 = __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_17(19982, (8169490782207426678L ^ local2_life2));
    net.minecraft.entity.monster.EntityGuardian __stackOp482_22_0 = receiver;
    moom.u6 __stackOp482_22_1 = new moom.u6(((moom.sI) receiver), 0x1.0p0d, __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_19(27356, (8989663553098081466L ^ local2_life2)));
    moom.u6 __sourceSpill482_24 = __stackOp482_22_1;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp482_22_0)).cc = ((moom.u6)(__stackOp482_22_1));
    ((net.minecraft.entity.ai.EntityAITasks)(__sourceSpill482_20)).a(((int)(__sourceSpill482_21)), ((moom.uc)(__sourceSpill482_24)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_28(26593, (1363656455977593239L ^ local2_life2)))), ((moom.uc)(new moom.u8(((net.minecraft.entity.EntityLiving) receiver), net.minecraft.entity.player.EntityPlayer.class, 0x1.0000000000000p+3F))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_34(25313, (3693674276713000091L ^ local2_life2)))), ((moom.uc)(new moom.u8(((net.minecraft.entity.EntityLiving) receiver), net.minecraft.entity.monster.EntityGuardian.class, 0x1.8000000000000p+3F, 0x1.47ae140000000p-7F))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_41(17756, (6326999320216062761L ^ local2_life2)))), ((moom.uc)(new moom.uy(((net.minecraft.entity.EntityLiving) receiver)))));
    ((moom.u6)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).cc)).a(((int)(3)));
    ((moom.uG)(local4_life13)).a(((int)(3)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uV(((moom.sI) receiver), net.minecraft.entity.EntityLivingBase.class, __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_49(30804, (3576643466580981280L ^ local2_life2)), true, false, ((com.google.common.base.Predicate) new moom.vM(receiver))))));
    ((net.minecraft.entity.monster.EntityGuardian)(receiver)).bF = ((net.minecraft.entity.ai.EntityMoveHelper)(new moom.vw(receiver)));
    net.minecraft.entity.monster.EntityGuardian __sourceSpill482_54 = receiver;
    net.minecraft.entity.monster.EntityGuardian __stackOp482_55_0 = receiver;
    float __stackOp482_55_1 = ((java.util.Random)(((net.minecraft.entity.monster.EntityGuardian)(receiver)).ah)).nextFloat();
    float __sourceSpill482_57 = __stackOp482_55_1;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp482_55_0)).b5 = ((float)(__stackOp482_55_1));
    ((net.minecraft.entity.monster.EntityGuardian)(__sourceSpill482_54)).b6 = ((float)(__sourceSpill482_57));
    return;
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(3778765539388029058L)), ((long)(8025787343691601932L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(181149853099704L)))));
    yb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityGuardian.db ^ 14168431087362L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1871_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1871_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1871_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1871_14 = new byte[8];
    (__sourceSpill1871_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1871_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1871_16 = __sourceSpill1871_14;
    ((javax.crypto.Cipher)(__sourceSpill1871_11)).init(((int)(__sourceSpill1871_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1871_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1871_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[22];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "®F´J\035uÖý\030[Ðè½\027ª9'amÀöt ³Îe¨{C½BÚ&=%g\nN\021S\021)~\177ºæü\024\"7[}\033ÍL\021X)¤ÔÒÜ¡\\õ Ý\034\013gú\f¤ý9\027v©7\f¸$zÐ`ûotª±jS^+\007·I2Ir&7 H\002\020Â9kÞÄ½B@·kTÀ\"TMCøNlpm&¬pUçöRn"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1871_25 = local6_life21;
        int __sourceSpill1871_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1871_25)).substring(((int)(__sourceSpill1871_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1871_30 = local8_life19;
        int __sourceSpill1871_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1871_33 = new byte[8];
        (__sourceSpill1871_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1871_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1871_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1871_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1871_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1871_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1871_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1871_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1871_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1871_34)).doFinal(((byte[])(__sourceSpill1871_33)));
        (__sourceSpill1871_30)[__sourceSpill1871_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "`\007\004ÓQ)ËÞxëF\túÂ~É"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1871_38 = local6_life21;
        int __sourceSpill1871_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1871_38)).substring(((int)(__sourceSpill1871_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1871_43 = local8_life19;
        int __sourceSpill1871_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1871_46 = new byte[8];
        (__sourceSpill1871_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1871_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1871_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1871_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1871_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1871_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1871_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1871_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1871_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1871_47)).doFinal(((byte[])(__sourceSpill1871_46)));
        (__sourceSpill1871_43)[__sourceSpill1871_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    jb = ((long[])(local8_life19));
    xb = ((java.lang.Integer[])(new java.lang.Integer[22]));
}

private static native <E extends Throwable> void __sourceConstructorInit_e92c567edc85285d_0(net.minecraft.entity.monster.EntityGuardian a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
int forwardValue5151_15_0;
    java.lang.String forwardValue5151_19_0;
    boolean spill5151_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 24368074767656L);
    life3_5 = moom.vN.b();
    spill5151_0 = ((net.minecraft.entity.monster.EntityGuardian)(this)).j__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5151_15_0 = ((spill5151_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill5151_0))) {
        break forward_join_13;
    }
    forwardValue5151_19_0 = "mob.guardian.land.idle";
    break forward_join_19;
    }
    forwardValue5151_15_0 = ((((net.minecraft.entity.monster.EntityGuardian)(this)).ad()) ? 1 : 0);
    }
    if (!((forwardValue5151_15_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5151_19_0 = "mob.guardian.elder.idle";
    break forward_join_19;
    }
    forwardValue5151_19_0 = "mob.guardian.idle";
    }
    return forwardValue5151_19_0;
}


private void b(int p0, boolean p1) {
long life3_3;
    int life6_13;
    net.minecraft.entity.Entity[] life5_14;
    forward_join_47: {
    forward_join_33: {
    forward_join_31: {
    life3_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 96359743758645L);
    net.minecraft.entity.Entity[] spill5786_0 = moom.vN.b();
    life6_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_7cf220b54d33_invokedynamic5786_3(18063, (5499729811068195021L ^ life3_3)))));
    life5_14 = spill5786_0;
    if (!((life5_14 == null))) { break forward_join_31; }
    if (!(p1)) { break forward_join_33; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_7cf220b54d33_invokedynamic5786_6(17032, (5789832870358062274L ^ life3_3)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)((life6_13 | p0)))))));
    }
    if (!((life5_14 != null))) { break forward_join_47; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_7cf220b54d33_invokedynamic5786_10(17032, (5789832870358062274L ^ life3_3)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)((life6_13 & (p0 ^ -1))))))));
    }
    return;
}


protected void b(boolean p0, int p1) {
int forwardValue5144_38_0;
    int forwardValue5144_64_0;
    int forwardValue5144_64_1;
    int forwardValue5144_76_0;
    int forwardValue5144_83_0;
    net.minecraft.entity.monster.EntityGuardian forwardValue5144_85_0;
    net.minecraft.entity.Entity[] spill5144_0;
    int spill5144_1;
    int spill5144_2;
    int spill5144_3;
    net.minecraft.entity.monster.EntityGuardian spill5144_4;
    long life3_3;
    int life6_16;
    net.minecraft.entity.Entity[] life5_17;
    forward_join_94: {
    forward_join_85: {
    forward_join_83: {
    forward_join_76: {
    forward_join_75: {
    forward_join_64: {
    forward_join_55: {
    forward_join_38: {
    forward_join_32: {
    life3_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 40881107500035L);
    spill5144_0 = moom.vN.b();
    life6_16 = (((java.util.Random)(this.ah)).nextInt(((int)(3))) + ((java.util.Random)(this.ah)).nextInt(((int)((p1 + 1)))));
    life5_17 = spill5144_0;
    spill5144_1 = life6_16;
    if (!((life5_17 == null))) {
        forwardValue5144_38_0 = spill5144_1;
        break forward_join_38;
    }
    if (!((spill5144_1 > 0))) {
        break forward_join_32;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.cg, life6_16, 0))), ((float)(0x1.0p0f)));
    }
    forwardValue5144_38_0 = ((java.util.Random)(this.ah)).nextInt(((int)((3 + p1))));
    }
    spill5144_2 = 1;
    if (!((life5_17 == null))) {
        forwardValue5144_64_0 = forwardValue5144_38_0;
        forwardValue5144_64_1 = spill5144_2;
        break forward_join_64;
    }
    if (!((forwardValue5144_38_0 > spill5144_2))) {
        break forward_join_55;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aU, 1, ((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.COD)).a__Int()))), ((float)(0x1.0p0f)));
    if (!((life5_17 != null))) {
        break forward_join_75;
    }
    }
    spill5144_3 = ((java.util.Random)(this.ah)).nextInt(((int)((3 + p1))));
    if (!((life5_17 == null))) {
        forwardValue5144_76_0 = spill5144_3;
        break forward_join_76;
    }
    forwardValue5144_64_0 = spill5144_3;
    forwardValue5144_64_1 = 1;
    }
    if (!((forwardValue5144_64_0 > forwardValue5144_64_1))) {
        break forward_join_75;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.ch, 1, 0))), ((float)(0x1.0p0f)));
    }
    forwardValue5144_76_0 = ((p0) ? 1 : 0);
    }
    if (!((life5_17 == null))) {
        forwardValue5144_83_0 = forwardValue5144_76_0;
        break forward_join_83;
    }
    if (!((forwardValue5144_76_0 != 0))) {
        break forward_join_94;
    }
    spill5144_4 = this;
    if (!((life5_17 == null))) {
        forwardValue5144_85_0 = spill5144_4;
        break forward_join_85;
    }
    forwardValue5144_83_0 = ((((net.minecraft.entity.monster.EntityGuardian)(spill5144_4)).ad()) ? 1 : 0);
    }
    if (!((forwardValue5144_83_0 != 0))) {
        break forward_join_94;
    }
    forwardValue5144_85_0 = this;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(forwardValue5144_85_0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.v, 1, 1))), ((float)(0x1.0p0f)));
    }
    return;
}


public boolean ad() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.monster.EntityGuardian)(this)).c__sourceReturn_9a6ad9dfe5(((int)(4))))) != 0);
}


public float e__Float() {
return (this.H * 0x1.0p-1f);
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11447_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.entity.EntityLivingBase e__sG() {
int forwardValue5148_18_0;
    net.minecraft.entity.Entity forwardValue5148_38_0;
    net.minecraft.entity.EntityLivingBase forwardValue5148_55_0;
    boolean spill5148_0;
    net.minecraft.entity.monster.EntityGuardian spill5148_1;
    net.minecraft.entity.EntityLivingBase spill5148_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.Entity life4_54;
    forward_join_55: {
    forward_join_53: {
    forward_join_51: {
    forward_join_48: {
    forward_join_38: {
    forward_join_27: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 86169052067762L);
    life3_5 = moom.vN.b();
    spill5148_0 = ((net.minecraft.entity.monster.EntityGuardian)(this)).ae();
    if (!((life3_5 == null))) {
        forwardValue5148_18_0 = ((spill5148_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill5148_0))) {
        break forward_join_13;
    }
    return null;
    }
    spill5148_1 = this;
    if (!((life3_5 == null))) {
        forwardValue5148_55_0 = spill5148_1;
        break forward_join_55;
    }
    forwardValue5148_18_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityGuardian)(spill5148_1)).i)).G) ? 1 : 0);
    }
    if (!((forwardValue5148_18_0 != 0))) {
        break forward_join_53;
    }
    spill5148_2 = this.b_;
    if (!((life3_5 == null))) {
        forwardValue5148_38_0 = spill5148_2;
        break forward_join_38;
    }
    if (!((spill5148_2 != null))) {
        break forward_join_27;
    }
    return this.b_;
    }
    forwardValue5148_38_0 = ((net.minecraft.world.World)(this.i)).a(((int)(((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_4f9c34777763_invokedynamic5148_11(24939, (8347844658773893562L ^ life1_3))))))));
    }
    life4_54 = forwardValue5148_38_0;
    if (!((life3_5 == null))) {
        break forward_join_48;
    }
    if (!((((life4_54 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_51;
    }
    this.b_ = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life4_54))));
    }
    return this.b_;
    }
    return null;
    }
    forwardValue5148_55_0 = ((net.minecraft.entity.monster.EntityGuardian)(this)).d__sourceReturn_d30556f370();
    }
    return forwardValue5148_55_0;
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntityGuardian.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11748;
      if (xb[var3] == null) {
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
         Object[] var9 = (Object[])yb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               yb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/s6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         xb[var3] = var15;
      }

      return xb[var3];
}


public void e(float p0, float p1) {
net.minecraft.entity.EntityLivingBase forwardValue5147_56_0;
    net.minecraft.entity.monster.EntityGuardian forwardValue5147_58_0;
    net.minecraft.entity.monster.EntityGuardian forwardValue5147_66_0;
    net.minecraft.entity.monster.EntityGuardian forwardValue5147_72_0;
    net.minecraft.entity.monster.EntityGuardian spill5147_0;
    net.minecraft.entity.monster.EntityGuardian spill5147_1;
    net.minecraft.entity.monster.EntityGuardian spill5147_2;
    net.minecraft.entity.monster.EntityGuardian spill5147_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_75: {
    forward_join_72: {
    forward_join_71: {
    forward_join_66: {
    forward_join_65: {
    forward_join_58: {
    forward_join_56: {
    life3_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 43775891640081L);
    life5_5 = moom.vN.b();
    spill5147_0 = this;
    if (!((life5_5 == null))) {
        forwardValue5147_72_0 = spill5147_0;
        break forward_join_72;
    }
    if (!(((net.minecraft.entity.monster.EntityGuardian)(spill5147_0)).L__Boolean())) {
        break forward_join_71;
    }
    spill5147_1 = this;
    if (!((life5_5 == null))) {
        forwardValue5147_66_0 = spill5147_1;
        break forward_join_66;
    }
    if (!(((net.minecraft.entity.monster.EntityGuardian)(spill5147_1)).j__Boolean())) {
        break forward_join_65;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(this)).a(((float)(p0)), ((float)(p1)), ((float)(0x1.99999ap-4f)));
    ((net.minecraft.entity.monster.EntityGuardian)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    net.minecraft.entity.monster.EntityGuardian __stackOp5147_9_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_9_0)).t = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_9_0)).t * 0x1.ccccccp-1d)));
    net.minecraft.entity.monster.EntityGuardian __stackOp5147_12_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_12_0)).u = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_12_0)).u * 0x1.ccccccp-1d)));
    net.minecraft.entity.monster.EntityGuardian __stackOp5147_15_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_15_0)).v = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_15_0)).v * 0x1.ccccccp-1d)));
    spill5147_2 = this;
    if (!((life5_5 == null))) {
        forwardValue5147_56_0 = spill5147_2;
        break forward_join_56;
    }
    if (!((!((net.minecraft.entity.monster.EntityGuardian)(spill5147_2)).ac()))) {
        break forward_join_75;
    }
    spill5147_3 = this;
    if (!((life5_5 == null))) {
        forwardValue5147_58_0 = spill5147_3;
        break forward_join_58;
    }
    forwardValue5147_56_0 = ((net.minecraft.entity.monster.EntityGuardian)(spill5147_3)).d__sourceReturn_d30556f370();
    }
    if (!((forwardValue5147_56_0 == null))) {
        break forward_join_75;
    }
    forwardValue5147_58_0 = this;
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp5147_20_0 = forwardValue5147_58_0;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_20_0)).u = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp5147_20_0)).u - 0x1.47ae147ae147bp-8d)));
    if (!((life5_5 != null))) {
        break forward_join_75;
    }
    }
    forwardValue5147_66_0 = this;
    }
    __sourceIntrinsic_c23f50d43b1e_call5147_23(forwardValue5147_66_0, p0, p1);
    if (!((life5_5 != null))) {
        break forward_join_75;
    }
    }
    forwardValue5147_72_0 = this;
    }
    __sourceIntrinsic_c23f50d43b1e_call5147_24(forwardValue5147_72_0, p0, p1);
    }
    return;
}


public float e__sourceReturn_f6c4892e39(float p0) {
return ((((float) this.ca) + p0) / ((float) ((net.minecraft.entity.monster.EntityGuardian)(this)).s()));
}


public boolean ae() {
int forwardValue5143_18_0;
    int forwardValue5143_20_0;
    int spill5143_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 85160474518690L);
    life3_5 = moom.vN.b();
    spill5143_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_a627c59d8423_invokedynamic5143_3(24939, (8347847764905046698L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5143_18_0 = spill5143_0;
        break forward_join_18;
    }
    if (!((spill5143_0 != 0))) {
        break forward_join_19;
    }
    forwardValue5143_18_0 = 1;
    }
    forwardValue5143_20_0 = forwardValue5143_18_0;
    break forward_join_20;
    }
    forwardValue5143_20_0 = 0;
    }
    return ((forwardValue5143_20_0) != 0);
}


public int s() {
int forwardValue5153_16_0;
    int forwardValue5153_22_0;
    boolean spill5153_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 54444055485579L);
    life3_5 = moom.vN.b();
    spill5153_0 = ((net.minecraft.entity.monster.EntityGuardian)(this)).ad();
    if (!((life3_5 == null))) {
        forwardValue5153_16_0 = ((spill5153_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5153_0)) {
        break forward_join_17;
    }
    forwardValue5153_16_0 = __sourceIntrinsic_421c707d57eb_invokedynamic5153_4(6517, (3576181704549872283L ^ life1_3));
    }
    forwardValue5153_22_0 = forwardValue5153_16_0;
    break forward_join_22;
    }
    forwardValue5153_22_0 = __sourceIntrinsic_421c707d57eb_invokedynamic5153_5(5831, (40926075843263800L ^ life1_3));
    }
    return forwardValue5153_22_0;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.monster.EntityGuardian)(this)).m(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Elder"))))));
    return;
}


protected java.lang.String c__String() {
int forwardValue5146_15_0;
    java.lang.String forwardValue5146_19_0;
    boolean spill5146_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 63832341457626L);
    life3_5 = moom.vN.b();
    spill5146_0 = ((net.minecraft.entity.monster.EntityGuardian)(this)).j__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5146_15_0 = ((spill5146_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill5146_0))) {
        break forward_join_13;
    }
    forwardValue5146_19_0 = "mob.guardian.land.hit";
    break forward_join_19;
    }
    forwardValue5146_15_0 = ((((net.minecraft.entity.monster.EntityGuardian)(this)).ad()) ? 1 : 0);
    }
    if (!((forwardValue5146_15_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5146_19_0 = "mob.guardian.elder.hit";
    break forward_join_19;
    }
    forwardValue5146_19_0 = "mob.guardian.hit";
    }
    return forwardValue5146_19_0;
}


private boolean c__sourceReturn_9a6ad9dfe5(int p0) {
int forwardValue5145_20_0;
    int forwardValue5145_22_0;
    int spill5145_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 102309017739541L);
    life4_5 = moom.vN.b();
    spill5145_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_63673aced462_invokedynamic5145_3(17032, (5789822618739037410L ^ life2_3))))) & p0);
    if (!((life4_5 == null))) {
        forwardValue5145_20_0 = spill5145_0;
        break forward_join_20;
    }
    if (!((spill5145_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5145_20_0 = 1;
    }
    forwardValue5145_22_0 = forwardValue5145_20_0;
    break forward_join_22;
    }
    forwardValue5145_22_0 = 0;
    }
    return ((forwardValue5145_22_0) != 0);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public float c__sourceReturn_f6c4892e39(float p0) {
return (this.b6 + ((this.b5 - this.b6) * p0));
}


protected java.lang.String h__String() {
int forwardValue5150_15_0;
    java.lang.String forwardValue5150_19_0;
    boolean spill5150_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 85559714040239L);
    life3_5 = moom.vN.b();
    spill5150_0 = ((net.minecraft.entity.monster.EntityGuardian)(this)).j__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5150_15_0 = ((spill5150_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill5150_0))) {
        break forward_join_13;
    }
    forwardValue5150_19_0 = "mob.guardian.land.death";
    break forward_join_19;
    }
    forwardValue5150_15_0 = ((((net.minecraft.entity.monster.EntityGuardian)(this)).ad()) ? 1 : 0);
    }
    if (!((forwardValue5150_15_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5150_19_0 = "mob.guardian.elder.death";
    break forward_join_19;
    }
    forwardValue5150_19_0 = "mob.guardian.death";
    }
    return forwardValue5150_19_0;
}


public void f(int p0) {
int forwardValue5149_29_0;
    net.minecraft.entity.monster.EntityGuardian forwardValue5149_31_0;
    int forwardValue5149_42_0;
    int forwardValue5149_42_1;
    net.minecraft.entity.Entity[] spill5149_0;
    int spill5149_1;
    int spill5149_2;
    boolean spill5149_3;
    net.minecraft.entity.monster.EntityGuardian spill5149_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_49: {
    forward_join_42: {
    forward_join_36: {
    forward_join_31: {
    forward_join_29: {
    life2_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 47426857168329L);
    spill5149_0 = moom.vN.b();
    super.f(((int)(p0)));
    life4_8 = spill5149_0;
    spill5149_1 = p0;
    spill5149_2 = __sourceIntrinsic_aefe61b07874_invokedynamic5149_3(17032, (5789908179851139134L ^ life2_3));
    if (!((life4_8 == null))) {
        forwardValue5149_42_0 = spill5149_1;
        forwardValue5149_42_1 = spill5149_2;
        break forward_join_42;
    }
    if (!((spill5149_1 == spill5149_2))) {
        break forward_join_36;
    }
    spill5149_3 = ((net.minecraft.entity.monster.EntityGuardian)(this)).ad();
    if (!((life4_8 == null))) {
        forwardValue5149_29_0 = ((spill5149_3) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill5149_3)) {
        break forward_join_49;
    }
    spill5149_4 = this;
    if (!((life4_8 == null))) {
        forwardValue5149_31_0 = spill5149_4;
        break forward_join_31;
    }
    forwardValue5149_29_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.monster.EntityGuardian)(spill5149_4)).G)), ((float)(0x1.0p0f)));
    }
    if (!((forwardValue5149_29_0 < 0))) {
        break forward_join_49;
    }
    forwardValue5149_31_0 = this;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(forwardValue5149_31_0)).a__Void(((float)(0x1.ff5c28p0f)), ((float)(0x1.ff5c28p0f)));
    if (!((life4_8 != null))) {
        break forward_join_49;
    }
    }
    forwardValue5149_42_0 = p0;
    forwardValue5149_42_1 = __sourceIntrinsic_aefe61b07874_invokedynamic5149_9(24939, (8347955179468389313L ^ life2_3));
    }
    if (!((forwardValue5149_42_0 == forwardValue5149_42_1))) {
        break forward_join_49;
    }
    this.ca = ((int)(0));
    this.b_ = ((net.minecraft.entity.EntityLivingBase)(null));
    }
    return;
}


private void l(int p0) {
long local2 = (net.minecraft.entity.monster.EntityGuardian.db ^ 83766964669997L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_3c5642f51658_originalDynamicSite1943_2(32558, (5439377739916002934L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


public int l__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.monster.EntityGuardian.db ^ 96552418012353L);
    return __sourceIntrinsic_d0e131a72963_originalDynamicSite1944_1(395, (6437910524728252987L ^ local1));
}


private void l(boolean p0) {
((net.minecraft.entity.monster.EntityGuardian)(this)).b(((int)(2)), ((boolean)(p0)));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Elder")), ((boolean)(((net.minecraft.entity.monster.EntityGuardian)(this)).ad())));
    return;
}


public float d__sourceReturn_f6c4892e39(float p0) {
return (this.b9 + ((this.b8 - this.b9) * p0));
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntityGuardian.db ^ 106324528224346L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1945_3(17032, (5789844895843937709L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1945_7(24939, (8347895319255404114L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    return;
}


protected moom.AV a__sourceReturn_8101e02423(net.minecraft.world.World p0) {
return new moom.AY(this, p0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5142_50_0;
    boolean spill5142_0;
    boolean spill5142_1;
    int spill5142_2;
    boolean spill5142_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.Entity life7_27;
    net.minecraft.entity.EntityLivingBase life6_38;
    forward_join_50: {
    forward_join_43: {
    life3_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 126924975973515L);
    life5_5 = moom.vN.b();
    spill5142_0 = ((net.minecraft.entity.monster.EntityGuardian)(this)).ac();
    if (!((life5_5 == null))) {
        forwardValue5142_50_0 = ((spill5142_0) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill5142_0))) {
        break forward_join_43;
    }
    spill5142_1 = ((net.minecraft.util.DamageSource)(p0)).h__Boolean();
    if (!((life5_5 == null))) {
        forwardValue5142_50_0 = ((spill5142_1) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill5142_1))) {
        break forward_join_43;
    }
    life7_27 = ((net.minecraft.util.DamageSource)(p0)).a__r3();
    spill5142_2 = ((life7_27 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life5_5 == null))) {
        forwardValue5142_50_0 = spill5142_2;
        break forward_join_50;
    }
    if (!((spill5142_2 != 0))) {
        break forward_join_43;
    }
    life6_38 = ((net.minecraft.entity.EntityLivingBase)(life7_27));
    spill5142_3 = ((net.minecraft.util.DamageSource)(p0)).b__Boolean();
    if (!((life5_5 == null))) {
        forwardValue5142_50_0 = ((spill5142_3) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill5142_3))) {
        break forward_join_43;
    }
    ((net.minecraft.entity.EntityLivingBase)(life6_38)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.Entity)(this))))), ((float)(0x1.0p1f)));
    ((net.minecraft.entity.EntityLivingBase)(life6_38)).a(((java.lang.String)("damage.thorns")), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    }
    ((moom.u6)(this.cc)).d__sourceReturn_da8c82d5d4();
    forwardValue5142_50_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forwardValue5142_50_0) != 0);
}


public float a__sourceReturn_8d24afb582(moom.DT p0) {
net.minecraft.entity.monster.EntityGuardian forwardValue5141_26_0;
    float forwardValue5141_28_0;
    net.minecraft.entity.monster.EntityGuardian spill5141_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_28: {
    forward_join_26: {
    forward_join_25: {
    life2_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 19308157837031L);
    life4_5 = moom.vN.b();
    spill5141_0 = this;
    if (!((life4_5 == null))) {
        forwardValue5141_26_0 = spill5141_0;
        break forward_join_26;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityGuardian)(spill5141_0)).i)).a__fE(((moom.DT)(p0))))).a__ch())).a__fn() == moom.fn.h))) {
        break forward_join_25;
    }
    forwardValue5141_28_0 = ((0x1.4p3f + ((net.minecraft.world.World)(this.i)).a(((moom.DT)(p0)))) - 0x1.0p-1f);
    break forward_join_28;
    }
    forwardValue5141_26_0 = this;
    }
    forwardValue5141_28_0 = __sourceIntrinsic_b4b223bdccad_call5141_9(forwardValue5141_26_0, p0);
    }
    return forwardValue5141_28_0;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.8p2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-1d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((double)(0x1.0p4d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.ep4d)));
    return;
}


public void m(boolean p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_43: {
    forward_join_35: {
    life2_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 75978849752132L);
    net.minecraft.entity.Entity[] spill5796_0 = moom.vN.b();
    ((net.minecraft.entity.monster.EntityGuardian)(this)).b(((int)(4)), ((boolean)(p0)));
    life4_9 = spill5796_0;
    if (!((life4_9 == null))) { break forward_join_35; }
    if (!(p0)) { break forward_join_43; }
    ((net.minecraft.entity.monster.EntityGuardian)(this)).a__Void(((float)(0x1.ff5c28p0f)), ((float)(0x1.ff5c28p0f)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.333334p-2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.0p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p6d)));
    ((net.minecraft.entity.monster.EntityGuardian)(this)).S();
    }
    ((moom.u6)(this.cc)).b(((int)(__sourceIntrinsic_65541a581e64_invokedynamic5796_15(29861, (2915531063602976643L ^ life2_3)))));
    }
    return;
}


public int m__Int() {
long local1 = (net.minecraft.entity.monster.EntityGuardian.db ^ 75493444768729L);
    return __sourceIntrinsic_a55dda021a68_originalDynamicSite1946_1(19272, (4842017972708929516L ^ local1));
}


protected boolean g__Boolean() {
return ((0) != 0);
}


protected void A__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = ((moom.D6)(((moom.D6)(moom.D0.a(((java.util.Random)(this.ah)), ((java.util.Collection)(net.minecraft.entity.projectile.EntityFishHook.a__List()))))))).a(((java.util.Random)(this.ah)));
    ((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.item.ItemStack)(local1)), ((float)(0x1.0p0f)));
    return;
}


public boolean N__Boolean() {
int forwardValue5138_29_0;
    int forwardValue5138_33_0;
    int forwardValue5138_35_0;
    int spill5138_0;
    boolean spill5138_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_27: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 100898733014007L);
    life3_5 = moom.vN.b();
    spill5138_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_a97bfb6c3ddd_invokedynamic5138_3(1455, (402206861060655393L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5138_29_0 = spill5138_0;
        break forward_join_29;
    }
    if (!((spill5138_0 != 0))) {
        break forward_join_27;
    }
    spill5138_1 = ((net.minecraft.world.World)(this.i)).f(((moom.DT)(new moom.DT(this))));
    if (!((life3_5 == null))) {
        forwardValue5138_29_0 = ((spill5138_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill5138_1))) {
        break forward_join_34;
    }
    }
    forwardValue5138_29_0 = ((super.N__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue5138_33_0 = forwardValue5138_29_0;
        break forward_join_33;
    }
    if (!((forwardValue5138_29_0 != 0))) {
        break forward_join_34;
    }
    forwardValue5138_33_0 = 1;
    }
    forwardValue5138_35_0 = forwardValue5138_33_0;
    break forward_join_35;
    }
    forwardValue5138_35_0 = 0;
    }
    return ((forwardValue5138_35_0) != 0);
}


public boolean ac() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.monster.EntityGuardian)(this)).c__sourceReturn_9a6ad9dfe5(((int)(2))))) != 0);
}


public void X__sourceReturn_da8c82d5d4() {
((net.minecraft.entity.monster.EntityGuardian)(this)).m(((boolean)(true)));
    net.minecraft.entity.monster.EntityGuardian __sourceSpill840_1 = this;
    net.minecraft.entity.monster.EntityGuardian __stackOp840_2_0 = this;
    float __stackOp840_2_1 = 0x1.0p0f;
    float __sourceSpill840_4 = __stackOp840_2_1;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp840_2_0)).b8 = ((float)(__stackOp840_2_1));
    ((net.minecraft.entity.monster.EntityGuardian)(__sourceSpill840_1)).b9 = ((float)(__sourceSpill840_4));
    return;
}


protected void R() {
int lexicalValue1587_18_0;
    net.minecraft.entity.player.EntityPlayerMP lexicalValue1587_105_0;
    int lexicalValue1587_123_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1587_125_0;
    net.minecraft.entity.Entity[] spill1587_0;
    boolean spill1587_1;
    int spill1587_2;
    net.minecraft.entity.player.EntityPlayerMP spill1587_3;
    boolean spill1587_4;
    net.minecraft.entity.player.EntityPlayerMP spill1587_5;
    net.minecraft.entity.player.EntityPlayerMP spill1587_6;
    net.minecraft.entity.monster.EntityGuardian spill1587_7;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    int life4_21;
    int life5_27;
    int life6_33;
    int life7_35;
    net.minecraft.potion.Potion life8_54;
    java.util.Iterator life9_62;
    net.minecraft.entity.player.EntityPlayerMP life10_69;
    lexical_join_135: {
    lexical_join_125: {
    lexical_join_123: {
    lexical_join_119: {
    lexical_join_18: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 75798054763435L);
    spill1587_0 = moom.vN.b();
    super.R();
    life3_7 = spill1587_0;
    spill1587_1 = ((net.minecraft.entity.monster.EntityGuardian)(this)).ad();
    if (!((life3_7 == null))) {
        lexicalValue1587_18_0 = ((spill1587_1) ? 1 : 0);
        break lexical_join_18;
    }
    if (!(spill1587_1)) {
        break lexical_join_135;
    }
    lexicalValue1587_18_0 = __sourceIntrinsic_ebf98100c39e_invokedynamic1587_5(11546, (5755772521075253705L ^ life1_3));
    }
    life4_21 = lexicalValue1587_18_0;
    life5_27 = __sourceIntrinsic_ebf98100c39e_invokedynamic1587_6(18052, (984782751124310613L ^ life1_3));
    life6_33 = __sourceIntrinsic_ebf98100c39e_invokedynamic1587_7(31642, (4970784983227725648L ^ life1_3));
    life7_35 = 2;
    spill1587_2 = ((this.S + ((net.minecraft.entity.monster.EntityGuardian)(this)).e__Int()) % __sourceIntrinsic_ebf98100c39e_invokedynamic1587_10(18052, (984782751124310613L ^ life1_3)));
    if (!((life3_7 == null))) {
        lexicalValue1587_123_0 = spill1587_2;
        break lexical_join_123;
    }
    if (!((spill1587_2 == 0))) {
        break lexical_join_119;
    }
    life8_54 = net.minecraft.potion.Potion.g;
    life9_62 = ((java.util.List)(((net.minecraft.world.World)(this.i)).b(((java.lang.Class)(net.minecraft.entity.player.EntityPlayerMP.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_ebf98100c39e_invokedynamic1587_14(this)))))).iterator();
    lexical_cycle_57: while (true) {
    lexical_join_117: {
    lexical_join_105: {
    lexical_join_92: {
    if (!(((java.util.Iterator)(life9_62)).hasNext())) {
        break lexical_join_119;
    }
    life10_69 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life9_62)).next()));
    spill1587_3 = life10_69;
    if (!((life3_7 == null))) {
        lexicalValue1587_105_0 = spill1587_3;
        break lexical_join_105;
    }
    spill1587_4 = ((net.minecraft.entity.player.EntityPlayerMP)(spill1587_3)).a__Boolean(((net.minecraft.potion.Potion)(life8_54)));
    if (!((life3_7 == null))) {
        lexicalValue1587_123_0 = ((spill1587_4) ? 1 : 0);
        break lexical_join_123;
    }
    if (!(spill1587_4)) {
        break lexical_join_92;
    }
    spill1587_5 = life10_69;
    if (!((life3_7 == null))) {
        lexicalValue1587_105_0 = spill1587_5;
        break lexical_join_105;
    }
    if (!((((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayerMP)(spill1587_5)).a(((net.minecraft.potion.Potion)(life8_54))))).c() >= 2))) {
        break lexical_join_92;
    }
    spill1587_6 = life10_69;
    if (!((life3_7 == null))) {
        lexicalValue1587_105_0 = spill1587_6;
        break lexical_join_105;
    }
    if (!((((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayerMP)(spill1587_6)).a(((net.minecraft.potion.Potion)(life8_54))))).b() < __sourceIntrinsic_ebf98100c39e_invokedynamic1587_26(18052, (984782751124310613L ^ life1_3))))) {
        break lexical_join_117;
    }
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life10_69)).cg)).a(((moom.yK)(new moom.Ac(__sourceIntrinsic_ebf98100c39e_invokedynamic1587_28(30804, (3576680357230965901L ^ life1_3)), 0x0.0p0f))));
    lexicalValue1587_105_0 = life10_69;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(lexicalValue1587_105_0)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(life8_54)).I, __sourceIntrinsic_ebf98100c39e_invokedynamic1587_31(31296, (6309720816478582429L ^ life1_3)), 2))));
    }
    if (!((life3_7 != null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    spill1587_7 = this;
    if (!((life3_7 == null))) {
        lexicalValue1587_125_0 = spill1587_7;
        break lexical_join_125;
    }
    lexicalValue1587_123_0 = ((((net.minecraft.entity.monster.EntityGuardian)(spill1587_7)).aa()) ? 1 : 0);
    }
    if (!((lexicalValue1587_123_0 == 0))) {
        break lexical_join_135;
    }
    lexicalValue1587_125_0 = this;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(lexicalValue1587_125_0)).a(((moom.DT)(new moom.DT(this))), ((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic1587_35(17032, (5789813836882005596L ^ life1_3)))));
    }
    return;
}


private boolean lambda$updateAITasks$0(net.minecraft.entity.player.EntityPlayerMP p0) {
int forwardValue5152_17_0;
    int forwardValue5152_21_0;
    int forwardValue5152_23_0;
    int spill5152_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 16245836867362L);
    life4_5 = moom.vN.b();
    spill5152_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.monster.EntityGuardian)(this)).a(((net.minecraft.entity.Entity)(p0))))), ((double)(0x1.388p11d)));
    if (!((life4_5 == null))) {
        forwardValue5152_17_0 = spill5152_0;
        break forward_join_17;
    }
    if (!((spill5152_0 < 0))) {
        break forward_join_22;
    }
    forwardValue5152_17_0 = ((((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).ci)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue5152_21_0 = forwardValue5152_17_0;
        break forward_join_21;
    }
    if (!((forwardValue5152_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue5152_21_0 = 1;
    }
    forwardValue5152_23_0 = forwardValue5152_21_0;
    break forward_join_23;
    }
    forwardValue5152_23_0 = 0;
    }
    return ((forwardValue5152_23_0) != 0);
}


protected boolean ab() {
return ((1) != 0);
}


public boolean O__Boolean() {
int forwardValue5139_22_0;
    int forwardValue5139_26_0;
    int forwardValue5139_28_0;
    boolean spill5139_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 69376872514306L);
    life3_5 = moom.vN.b();
    spill5139_0 = ((net.minecraft.world.World)(this.i)).a(((moom.CA)(((net.minecraft.entity.monster.EntityGuardian)(this)).b())), ((net.minecraft.entity.Entity)(this)));
    if (!((life3_5 == null))) {
        forwardValue5139_22_0 = ((spill5139_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5139_0)) {
        break forward_join_27;
    }
    forwardValue5139_22_0 = ((((java.util.List)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.monster.EntityGuardian)(this)).b()))))).isEmpty()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue5139_26_0 = forwardValue5139_22_0;
        break forward_join_26;
    }
    if (!((forwardValue5139_22_0 != 0))) {
        break forward_join_27;
    }
    forwardValue5139_26_0 = 1;
    }
    forwardValue5139_28_0 = forwardValue5139_26_0;
    break forward_join_28;
    }
    forwardValue5139_28_0 = 0;
    }
    return ((forwardValue5139_28_0) != 0);
}


public void G() {
net.minecraft.entity.monster.EntityGuardian lexicalValue1586_55_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_71_0;
    int lexicalValue1586_71_1;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_75_0;
    int lexicalValue1586_75_1;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_76_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_77_0;
    int lexicalValue1586_77_1;
    int lexicalValue1586_84_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_98_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_111_0;
    int lexicalValue1586_148_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_163_0;
    int lexicalValue1586_257_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1586_277_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_405_0;
    int lexicalValue1586_406_0;
    int lexicalValue1586_420_0;
    int lexicalValue1586_476_0;
    net.minecraft.entity.monster.EntityGuardian lexicalValue1586_482_0;
    boolean spill1586_0;
    boolean spill1586_1;
    net.minecraft.entity.monster.EntityGuardian spill1586_2;
    net.minecraft.entity.monster.EntityGuardian spill1586_3;
    net.minecraft.entity.monster.EntityGuardian spill1586_4;
    int spill1586_5;
    net.minecraft.entity.monster.EntityGuardian spill1586_6;
    net.minecraft.entity.monster.EntityGuardian spill1586_7;
    boolean spill1586_8;
    net.minecraft.entity.monster.EntityGuardian spill1586_9;
    boolean spill1586_10;
    boolean spill1586_11;
    net.minecraft.entity.monster.EntityGuardian spill1586_12;
    net.minecraft.entity.monster.EntityGuardian spill1586_13;
    net.minecraft.entity.monster.EntityGuardian spill1586_14;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.DR life4_273;
    int life5_275;
    net.minecraft.entity.EntityLivingBase life4_382;
    double life5_398;
    double life7_404;
    double life9_420;
    double life11_426;
    double life13_439;
    double life7_443;
    double life9_447;
    double life11_451;
    double life15_455;
    lexical_join_482: {
    lexical_join_481: {
    lexical_join_476: {
    lexical_join_472: {
    lexical_join_420: {
    lexical_join_418: {
    lexical_join_406: {
    lexical_join_405: {
    lexical_join_404: {
    lexical_join_277: {
    lexical_join_273: {
    lexical_join_257: {
    lexical_join_255: {
    lexical_join_173: {
    lexical_join_163: {
    lexical_join_162: {
    lexical_join_148: {
    lexical_join_144: {
    lexical_join_121: {
    lexical_join_111: {
    lexical_join_110: {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_84: {
    lexical_join_80: {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_75: {
    lexical_join_71: {
    lexical_join_55: {
    lexical_join_54: {
    life1_3 = (net.minecraft.entity.monster.EntityGuardian.db ^ 117023677140481L);
    life3_5 = moom.vN.b();
    spill1586_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == null))) {
        lexicalValue1586_406_0 = ((spill1586_0) ? 1 : 0);
        break lexical_join_406;
    }
    if (!(spill1586_0)) {
        break lexical_join_404;
    }
    this.b6 = ((float)(this.b5));
    spill1586_1 = ((net.minecraft.entity.monster.EntityGuardian)(this)).j__Boolean();
    if (!((life3_5 == null))) {
        lexicalValue1586_84_0 = ((spill1586_1) ? 1 : 0);
        break lexical_join_84;
    }
    if (!((!spill1586_1))) {
        break lexical_join_80;
    }
    this.b7 = ((float)(0x1.0p1f));
    spill1586_2 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_55_0 = spill1586_2;
        break lexical_join_55;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.monster.EntityGuardian)(spill1586_2)).u)), ((double)(0x0.0p0d))) > 0))) {
        break lexical_join_54;
    }
    spill1586_3 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_55_0 = spill1586_3;
        break lexical_join_55;
    }
    if (!(((net.minecraft.entity.monster.EntityGuardian)(spill1586_3)).cb)) {
        break lexical_join_54;
    }
    spill1586_4 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_55_0 = spill1586_4;
        break lexical_join_55;
    }
    if (!((!((net.minecraft.entity.monster.EntityGuardian)(spill1586_4)).f__Boolean()))) {
        break lexical_join_54;
    }
    ((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((java.lang.String)("mob.guardian.flop")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((boolean)(false)));
    }
    lexicalValue1586_55_0 = this;
    }
    spill1586_5 = recovery.source.CarrierOps.dcmpg(((double)(this.u)), ((double)(0x0.0p0d)));
    if (!((life3_5 == null))) {
        lexicalValue1586_71_0 = lexicalValue1586_55_0;
        lexicalValue1586_71_1 = spill1586_5;
        break lexical_join_71;
    }
    if (!((spill1586_5 < 0))) {
        lexicalValue1586_76_0 = lexicalValue1586_55_0;
        break lexical_join_76;
    }
    lexicalValue1586_71_0 = lexicalValue1586_55_0;
    lexicalValue1586_71_1 = ((((net.minecraft.world.World)(this.i)).c(((moom.DT)(((moom.DT)(new moom.DT(this))).b__DT())), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        lexicalValue1586_75_0 = lexicalValue1586_71_0;
        lexicalValue1586_75_1 = lexicalValue1586_71_1;
        break lexical_join_75;
    }
    if (!((lexicalValue1586_71_1 != 0))) {
        lexicalValue1586_76_0 = lexicalValue1586_71_0;
        break lexical_join_76;
    }
    lexicalValue1586_75_0 = lexicalValue1586_71_0;
    lexicalValue1586_75_1 = 1;
    }
    lexicalValue1586_77_0 = lexicalValue1586_75_0;
    lexicalValue1586_77_1 = lexicalValue1586_75_1;
    break lexical_join_77;
    }
    lexicalValue1586_77_0 = lexicalValue1586_76_0;
    lexicalValue1586_77_1 = 0;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(lexicalValue1586_77_0)).cb = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1586_77_1)));
    if (!((life3_5 != null))) {
        break lexical_join_121;
    }
    }
    spill1586_6 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_111_0 = spill1586_6;
        break lexical_join_111;
    }
    lexicalValue1586_84_0 = ((((net.minecraft.entity.monster.EntityGuardian)(spill1586_6)).ac()) ? 1 : 0);
    }
    if (!((lexicalValue1586_84_0 != 0))) {
        break lexical_join_110;
    }
    spill1586_7 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_98_0 = spill1586_7;
        break lexical_join_98;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.monster.EntityGuardian)(spill1586_7)).b7)), ((float)(0x1.0p-1f))) < 0))) {
        break lexical_join_97;
    }
    this.b7 = ((float)(0x1.0p2f));
    if (!((life3_5 != null))) {
        break lexical_join_121;
    }
    }
    lexicalValue1586_98_0 = this;
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_31_0 = lexicalValue1586_98_0;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_31_0)).b7 = ((float)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_31_0)).b7 + ((0x1.0p-1f - this.b7) * 0x1.99999ap-4f))));
    if (!((life3_5 != null))) {
        break lexical_join_121;
    }
    }
    lexicalValue1586_111_0 = this;
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_35_0 = lexicalValue1586_111_0;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_35_0)).b7 = ((float)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_35_0)).b7 + ((0x1.0p-3f - this.b7) * 0x1.99999ap-3f))));
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_39_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_39_0)).b5 = ((float)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_39_0)).b5 + this.b7)));
    this.b9 = ((float)(this.b8));
    spill1586_8 = ((net.minecraft.entity.monster.EntityGuardian)(this)).j__Boolean();
    if (!((life3_5 == null))) {
        lexicalValue1586_148_0 = ((spill1586_8) ? 1 : 0);
        break lexical_join_148;
    }
    if (!((!spill1586_8))) {
        break lexical_join_144;
    }
    this.b8 = ((float)(((java.util.Random)(this.ah)).nextFloat()));
    if (!((life3_5 != null))) {
        break lexical_join_173;
    }
    }
    spill1586_9 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_163_0 = spill1586_9;
        break lexical_join_163;
    }
    lexicalValue1586_148_0 = ((((net.minecraft.entity.monster.EntityGuardian)(spill1586_9)).ac()) ? 1 : 0);
    }
    if (!((lexicalValue1586_148_0 != 0))) {
        break lexical_join_162;
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_52_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_52_0)).b8 = ((float)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_52_0)).b8 + ((0x0.0p0f - this.b8) * 0x1.0p-2f))));
    if (!((life3_5 != null))) {
        break lexical_join_173;
    }
    }
    lexicalValue1586_163_0 = this;
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_56_0 = lexicalValue1586_163_0;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_56_0)).b8 = ((float)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_56_0)).b8 + ((0x1.0p0f - this.b8) * 0x1.eb851ep-5f))));
    }
    spill1586_10 = ((net.minecraft.entity.monster.EntityGuardian)(this)).ac();
    if (!((life3_5 == null))) {
        lexicalValue1586_257_0 = ((spill1586_10) ? 1 : 0);
        break lexical_join_257;
    }
    if (!(spill1586_10)) {
        break lexical_join_255;
    }
    spill1586_11 = ((net.minecraft.entity.monster.EntityGuardian)(this)).j__Boolean();
    if (!((life3_5 == null))) {
        lexicalValue1586_257_0 = ((spill1586_11) ? 1 : 0);
        break lexical_join_257;
    }
    if (!(spill1586_11)) {
        break lexical_join_255;
    }
    life4_273 = ((net.minecraft.entity.monster.EntityGuardian)(this)).a__DR(((float)(0x0.0p0f)));
    life5_275 = 0;
    lexical_cycle_189: while (true) {
    if (!((life5_275 < 2))) {
        break lexical_join_255;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)(((this.n + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))) - (((moom.DR)(life4_273)).a * 0x1.8p0d)))), ((double)(((this.o + (((java.util.Random)(this.ah)).nextDouble() * ((double) this.H))) - (((moom.DR)(life4_273)).b * 0x1.8p0d)))), ((double)(((this.p + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))) - (((moom.DR)(life4_273)).c * 0x1.8p0d)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life5_275 += 1;
    if (!((life3_5 == null))) {
        break lexical_join_404;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_189; }
    break lexical_cycle_189;
    }
    }
    lexicalValue1586_257_0 = ((((net.minecraft.entity.monster.EntityGuardian)(this)).ae()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        lexicalValue1586_406_0 = lexicalValue1586_257_0;
        break lexical_join_406;
    }
    if (!((lexicalValue1586_257_0 != 0))) {
        break lexical_join_404;
    }
    spill1586_12 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_277_0 = spill1586_12;
        break lexical_join_277;
    }
    if (!((((net.minecraft.entity.monster.EntityGuardian)(spill1586_12)).ca < ((net.minecraft.entity.monster.EntityGuardian)(this)).s()))) {
        break lexical_join_273;
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_87_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_87_0)).ca = ((int)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_87_0)).ca + 1)));
    }
    spill1586_13 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_405_0 = spill1586_13;
        break lexical_join_405;
    }
    lexicalValue1586_277_0 = ((net.minecraft.entity.monster.EntityGuardian)(spill1586_13)).e__sG();
    }
    life4_382 = lexicalValue1586_277_0;
    if (!((life4_382 != null))) {
        break lexical_join_404;
    }
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.monster.EntityGuardian)(this)).a__vt())).a(((net.minecraft.entity.Entity)(life4_382)), ((float)(0x1.68p6f)), ((float)(0x1.68p6f)));
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.monster.EntityGuardian)(this)).a__vt())).a__Void();
    life5_398 = ((double) ((net.minecraft.entity.monster.EntityGuardian)(this)).e__sourceReturn_f6c4892e39(((float)(0x0.0p0f))));
    life7_404 = (((net.minecraft.entity.EntityLivingBase)(life4_382)).n - this.n);
    life9_420 = ((((net.minecraft.entity.EntityLivingBase)(life4_382)).o + ((double) (((net.minecraft.entity.EntityLivingBase)(life4_382)).H * 0x1.0p-1f))) - (this.o + ((double) ((net.minecraft.entity.monster.EntityGuardian)(this)).e__Float())));
    life11_426 = (((net.minecraft.entity.EntityLivingBase)(life4_382)).p - this.p);
    life13_439 = java.lang.Math.sqrt(((double)((((life7_404 * life7_404) + (life9_420 * life9_420)) + (life11_426 * life11_426)))));
    life7_443 = (life7_404 / life13_439);
    life9_447 = (life9_420 / life13_439);
    life11_451 = (life11_426 / life13_439);
    life15_455 = ((java.util.Random)(this.ah)).nextDouble();
    lexical_cycle_351: while (true) {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life15_455)), ((double)(life13_439))) < 0))) {
        break lexical_join_404;
    }
    life15_455 = (life15_455 + ((0x1.ccccccccccccdp0d - life5_398) + (((java.util.Random)(this.ah)).nextDouble() * (0x1.b333333333333p0d - life5_398))));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)((this.n + (life7_443 * life15_455)))), ((double)(((this.o + (life9_447 * life15_455)) + ((double) ((net.minecraft.entity.monster.EntityGuardian)(this)).e__Float())))), ((double)((this.p + (life11_451 * life15_455)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life3_5 == null))) {
        break lexical_join_418;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_351; }
    break lexical_cycle_351;
    }
    }
    lexicalValue1586_405_0 = this;
    }
    lexicalValue1586_406_0 = ((((net.minecraft.entity.monster.EntityGuardian)(lexicalValue1586_405_0)).ai) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        lexicalValue1586_420_0 = lexicalValue1586_406_0;
        break lexical_join_420;
    }
    if (!((lexicalValue1586_406_0 != 0))) {
        break lexical_join_418;
    }
    ((net.minecraft.entity.monster.EntityGuardian)(this)).d(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic1586_119(17610, (7438705041658346928L ^ life1_3)))));
    if (!((life3_5 != null))) {
        break lexical_join_472;
    }
    }
    lexicalValue1586_420_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        lexicalValue1586_476_0 = lexicalValue1586_420_0;
        break lexical_join_476;
    }
    if (!((lexicalValue1586_420_0 != 0))) {
        break lexical_join_472;
    }
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_123_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_123_0)).u = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_123_0)).u + 0x1.0p-1d)));
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_126_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_126_0)).t = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_126_0)).t + ((double) (((((java.util.Random)(this.ah)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.99999ap-2f)))));
    net.minecraft.entity.monster.EntityGuardian __stackOp1586_131_0 = this;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_131_0)).v = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp1586_131_0)).v + ((double) (((((java.util.Random)(this.ah)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.99999ap-2f)))));
    this.w = ((float)((((java.util.Random)(this.ah)).nextFloat() * 0x1.68p8f)));
    this.A = ((boolean)(false));
    this.ad = ((boolean)(true));
    }
    spill1586_14 = this;
    if (!((life3_5 == null))) {
        lexicalValue1586_482_0 = spill1586_14;
        break lexical_join_482;
    }
    lexicalValue1586_476_0 = ((((net.minecraft.entity.monster.EntityGuardian)(spill1586_14)).ae()) ? 1 : 0);
    }
    if (!((lexicalValue1586_476_0 != 0))) {
        break lexical_join_481;
    }
    this.w = ((float)(this.a4));
    }
    lexicalValue1586_482_0 = this;
    }
    __sourceIntrinsic_c7b45e3c376e_call1586_145(lexicalValue1586_482_0);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e92c567edc85285d_originalDynamicSite482_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1586_119(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c7b45e3c376e_call1586_145(net.minecraft.entity.monster.EntityGuardian a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5138_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_10(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_ebf98100c39e_invokedynamic1587_14(net.minecraft.entity.monster.EntityGuardian a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic1587_35(int a0, long a1) throws E;

private static native <E extends Throwable> float __sourceIntrinsic_b4b223bdccad_call5141_9(net.minecraft.entity.monster.EntityGuardian a0, moom.DT a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a627c59d8423_invokedynamic5143_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7cf220b54d33_invokedynamic5786_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7cf220b54d33_invokedynamic5786_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7cf220b54d33_invokedynamic5786_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_63673aced462_invokedynamic5145_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1945_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1945_7(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c23f50d43b1e_call5147_23(net.minecraft.entity.monster.EntityGuardian a0, float a1, float a2) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c23f50d43b1e_call5147_24(net.minecraft.entity.monster.EntityGuardian a0, float a1, float a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11447_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4f9c34777763_invokedynamic5148_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aefe61b07874_invokedynamic5149_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aefe61b07874_invokedynamic5149_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d0e131a72963_originalDynamicSite1944_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_originalDynamicSite1943_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_65541a581e64_invokedynamic5796_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55dda021a68_originalDynamicSite1946_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_invokedynamic5153_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_invokedynamic5153_5(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
