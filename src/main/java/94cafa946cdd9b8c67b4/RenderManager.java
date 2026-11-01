package net.minecraft.client.renderer.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class RenderManager {

private java.util.Map<java.lang.String, moom.nr> a;

private moom.nr b;

public net.minecraft.client.renderer.texture.TextureManager c;

public net.minecraft.world.World d;

public net.minecraft.entity.Entity e;

public net.minecraft.entity.Entity f;

public float g;

public float h;

public net.minecraft.client.settings.GameSettings i;

public double j;

public double k;

public double l;

public net.minecraft.client.renderer.entity.Render m;

private java.util.Map<java.lang.Class, net.minecraft.client.renderer.entity.Render> n;

private net.minecraft.client.gui.FontRenderer o;

private double p;

private double q;

private double r;

private boolean s;

private boolean t;

private boolean u;

private boolean v;

private boolean w;

private boolean x;

private boolean y;

private boolean z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public RenderManager(net.minecraft.client.renderer.texture.TextureManager p0, net.minecraft.client.renderer.entity.RenderItem p1) { super(); }

private static void __sourceConstructorBody_a321ace613246f04(net.minecraft.client.renderer.entity.RenderManager receiver, net.minecraft.client.renderer.texture.TextureManager p0, net.minecraft.client.renderer.entity.RenderItem p1) throws Throwable {
long local3 = (net.minecraft.client.renderer.entity.RenderManager.A ^ 129327578943575L);
    net.minecraft.client.renderer.entity.RenderManager.__sourceConstructorInit_a321ace613246f04_0(((net.minecraft.client.renderer.entity.RenderManager)(receiver)));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).m = ((net.minecraft.client.renderer.entity.Render)(null));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).s = ((boolean)(false));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).t = ((boolean)(true));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).u = ((boolean)(false));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).v = ((boolean)(false));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).w = ((boolean)(true));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).x = ((boolean)(true));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).y = ((boolean)(true));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).z = ((boolean)(false));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).c = ((net.minecraft.client.renderer.texture.TextureManager)(p0));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.s_.class)), ((java.lang.Object)(new moom.nl(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.s9.class)), ((java.lang.Object)(new moom.nk(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityPig.class)), ((java.lang.Object)(new moom.ne(receiver, new moom.jk(), 0x1.666666p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntitySheep.class)), ((java.lang.Object)(new moom.ng(receiver, new moom.jm(), 0x1.666666p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.sM.class)), ((java.lang.Object)(new moom.m2(receiver, new moom.jj(), 0x1.666666p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.sN.class)), ((java.lang.Object)(new moom.nc(receiver, new moom.jj(), 0x1.666666p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityWolf.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderWolf(receiver, new moom.jz(), 0x1.0p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityChicken.class)), ((java.lang.Object)(new moom.m1(receiver, new moom.i6(), 0x1.333334p-2f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityOcelot.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderOcelot(receiver, new net.minecraft.client.model.ModelOcelot(), 0x1.99999ap-2f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityRabbit.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderRabbit(receiver, new moom.jn(), 0x1.333334p-2f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.s7.class)), ((java.lang.Object)(new moom.nh(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityEndermite.class)), ((java.lang.Object)(new moom.m6(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityCreeper.class)), ((java.lang.Object)(new moom.m3(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityEnderman.class)), ((java.lang.Object)(new moom.m5(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.sY.class)), ((java.lang.Object)(new moom.nj(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntitySkeleton.class)), ((java.lang.Object)(new moom.mY(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.ta.class)), ((java.lang.Object)(new moom.no(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityBlaze.class)), ((java.lang.Object)(new moom.m0(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityPigZombie.class)), ((java.lang.Object)(new moom.mX(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityZombie.class)), ((java.lang.Object)(new moom.mZ(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntitySlime.class)), ((java.lang.Object)(new moom.ni(receiver, new moom.js(__sourceIntrinsic_a321ace613246f04_originalDynamicSite3766_78(6847, (4414423251011801593L ^ local3))), 0x1.0p-2f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.th.class)), ((java.lang.Object)(new moom.nb(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.s5.class)), ((java.lang.Object)(new moom.m8(receiver, new moom.iY(), 0x1.0p-1f, 0x1.8p2f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityGhast.class)), ((java.lang.Object)(new moom.m7(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tl.class)), ((java.lang.Object)(new moom.nm(receiver, new moom.jv(), 0x1.666666p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityVillager.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderVillager(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityIronGolem.class)), ((java.lang.Object)(new moom.na(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityBat.class)), ((java.lang.Object)(new moom.mV(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.monster.EntityGuardian.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderGuardian(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.boss.EntityDragon.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderDragon(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tw.class)), ((java.lang.Object)(new moom.ns(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.boss.EntityWither.class)), ((java.lang.Object)(new moom.np(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.Entity.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderEntity(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.sF.class)), ((java.lang.Object)(new moom.mN(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.item.EntityItemFrame.class)), ((java.lang.Object)(new moom.nt(receiver, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.sD.class)), ((java.lang.Object)(new moom.mI(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.projectile.EntityArrow.class)), ((java.lang.Object)(new moom.mB(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tX.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderSnowball(receiver, net.minecraft.init.Items.aD, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tT.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderSnowball(receiver, net.minecraft.init.Items.bj, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tx.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderSnowball(receiver, net.minecraft.init.Items.bw, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tV.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderSnowball(receiver, net.minecraft.init.Items.aP, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tW.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderPotion(receiver, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tU.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderSnowball(receiver, net.minecraft.init.Items.bz, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.item.EntityFireworkRocket.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderSnowball(receiver, net.minecraft.init.Items.bQ, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tO.class)), ((java.lang.Object)(new moom.mG(receiver, 0x1.0p1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tP.class)), ((java.lang.Object)(new moom.mG(receiver, 0x1.0p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tQ.class)), ((java.lang.Object)(new net.minecraft.client.renderer.tileentity.RenderWitherSkull(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.item.EntityItem.class)), ((java.lang.Object)(new moom.mE(receiver, p1))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tL.class)), ((java.lang.Object)(new moom.mR(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tK.class)), ((java.lang.Object)(new moom.mQ(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.item.EntityFallingBlock.class)), ((java.lang.Object)(new moom.mF(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.item.EntityArmorStand.class)), ((java.lang.Object)(new moom.mT(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tJ.class)), ((java.lang.Object)(new moom.mM(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.ai.EntityMinecartMobSpawner.class)), ((java.lang.Object)(new moom.mL(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.item.EntityMinecart.class)), ((java.lang.Object)(new moom.mK(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tv.class)), ((java.lang.Object)(new moom.mC(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.projectile.EntityFishHook.class)), ((java.lang.Object)(new moom.mH(receiver))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(net.minecraft.entity.passive.EntityHorse.class)), ((java.lang.Object)(new net.minecraft.client.renderer.entity.RenderHorse(receiver, new moom.jc(), 0x1.8p-1f))));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).n)).put(((java.lang.Object)(moom.tu.class)), ((java.lang.Object)(new moom.mJ(receiver))));
    ((net.minecraft.client.renderer.entity.RenderManager)(receiver)).b = ((moom.nr)(new moom.nr(receiver)));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).a)).put(((java.lang.Object)("default")), ((java.lang.Object)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).b)));
    ((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).a)).put(((java.lang.Object)("slim")), ((java.lang.Object)(new moom.nr(receiver, true))));
    moom.Mc.a(((java.util.Map)(((net.minecraft.client.renderer.entity.RenderManager)(receiver)).a)));
    return;
}


static {
A = ((long)(((moom._a)(moom._c.a(((long)(-691892365575017147L)), ((long)(5961624429909247480L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(144972268961746L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.renderer.entity.RenderManager.A ^ 15328544116582L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1819_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1819_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1819_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1819_14 = new byte[8];
    (__sourceSpill1819_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1819_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1819_16 = __sourceSpill1819_14;
    ((javax.crypto.Cipher)(__sourceSpill1819_11)).init(((int)(__sourceSpill1819_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1819_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1819_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "dÍd\002¼¥!]¶Ø5g\\'¨\026â\025y°/þÛò\034ÜuÔ»?|O«¹×T\000¢\026]Pmà"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1819_25 = local6_life21;
        int __sourceSpill1819_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1819_25)).substring(((int)(__sourceSpill1819_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1819_30 = local8_life19;
        int __sourceSpill1819_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1819_33 = new byte[8];
        (__sourceSpill1819_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1819_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1819_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1819_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1819_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1819_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1819_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1819_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1819_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1819_34)).doFinal(((byte[])(__sourceSpill1819_33)));
        (__sourceSpill1819_30)[__sourceSpill1819_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Å[ Í\tr4F\002ê"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1819_38 = local6_life21;
        int __sourceSpill1819_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1819_38)).substring(((int)(__sourceSpill1819_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1819_43 = local8_life19;
        int __sourceSpill1819_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1819_46 = new byte[8];
        (__sourceSpill1819_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1819_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1819_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1819_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1819_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1819_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1819_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1819_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1819_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1819_47)).doFinal(((byte[])(__sourceSpill1819_46)));
        (__sourceSpill1819_43)[__sourceSpill1819_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a321ace613246f04_0(net.minecraft.client.renderer.entity.RenderManager a0) throws E;
private static native <E extends Throwable> net.minecraft.client.renderer.entity.Render __sourceHandlerCall_0b7137b85e9a1f5acecc(net.minecraft.client.renderer.entity.RenderManager a0, java.lang.Class a1) throws E;
private static final class __SourceHandler_0b7137b85e9a1f5acecc {

public static net.minecraft.client.renderer.entity.Render f2570(net.minecraft.client.renderer.entity.RenderManager receiver, java.lang.Class p0) throws Throwable {
    net.minecraft.client.renderer.entity.Render life2_5;
    life2_5 = __cast2570_2(__call2570_1(__fieldRead2570_0(receiver), p0));
    if ((life2_5 == null)) {
        if ((p0 != __classLiteral2570_3())) {
        life2_5 = __call2570_5(receiver, __call2570_4(p0));
        __call2570_7(__fieldRead2570_6(receiver), p0, life2_5);
    }
    }
    return life2_5;
}
public static void h2570_0(moom.Oo p0) throws Throwable {
    throw __call1257000_0(p0);
}
private static native java.util.Map __fieldRead2570_0(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native java.lang.Object __call2570_1(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native net.minecraft.client.renderer.entity.Render __cast2570_2(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __classLiteral2570_3() throws Throwable;
private static native java.lang.Class __call2570_4(java.lang.Class a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.Render __call2570_5(net.minecraft.client.renderer.entity.RenderManager a0, java.lang.Class a1) throws Throwable;
private static native java.util.Map __fieldRead2570_6(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native java.lang.Object __call2570_7(java.util.Map a0, java.lang.Class a1, net.minecraft.client.renderer.entity.Render a2) throws Throwable;
private static native java.lang.Throwable __call1257000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.entity.Render __sourceHandlerCall_433289c196cb9989020f(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_433289c196cb9989020f {

public static net.minecraft.client.renderer.entity.Render f2571(net.minecraft.client.renderer.entity.RenderManager receiver, net.minecraft.entity.Entity p0) throws Throwable {
    java.lang.String life2_6;
    moom.nr life3_12;
    if ((__instanceOf2571_0(p0) != 0)) {
        life2_6 = __call2571_2(__cast2571_1(p0));
        life3_12 = __cast2571_5(__call2571_4(__fieldRead2571_3(receiver), life2_6));
        return ((life3_12 != null) ? life3_12 : __fieldRead2571_6(receiver));
    }
    return __call2571_8(receiver, __call2571_7(p0));
}
public static void h2571_0(moom.Oo p0) throws Throwable {
    throw __call1257100_0(p0);
}
private static native int __instanceOf2571_0(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.to __cast2571_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call2571_2(moom.to a0) throws Throwable;
private static native java.util.Map __fieldRead2571_3(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native java.lang.Object __call2571_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.nr __cast2571_5(java.lang.Object a0) throws Throwable;
private static native moom.nr __fieldRead2571_6(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native java.lang.Class __call2571_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.Render __call2571_8(net.minecraft.client.renderer.entity.RenderManager a0, java.lang.Class a1) throws Throwable;
private static native java.lang.Throwable __call1257100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_bced4020b9fb5be300c1(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, double a2, double a3, double a4, float a5, float a6, boolean a7) throws E;
private static final class __SourceHandler_bced4020b9fb5be300c1 {

public static boolean f612(net.minecraft.client.renderer.entity.RenderManager receiver, net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5, boolean p6) throws Throwable {
    int forestValue612_72_0;
    java.lang.Object life11_1;
    net.minecraft.client.renderer.entity.Render life11_5;
    forest_join_73: {
    forest_join_72: {
    forest_join_71: {
    forest_join_66: {
    forest_join_46: {
    forest_join_24: {
    forest_join_19: {
    life11_1 = null;
    life11_5 = __call612_0(receiver, p0);
    if (!((life11_5 != null))) {
        break forest_join_66;
    }
    if (!((__fieldRead612_1(receiver) != null))) {
        break forest_join_66;
    }
    if (!((__instanceOf612_2(life11_5) != 0))) {
        break forest_join_19;
    }
    __call612_5(__cast612_3(life11_5), __fieldRead612_4(receiver));
    }
    if (!(__call612_6())) {
        break forest_join_24;
    }
    __fieldWrite612_7(receiver, life11_5);
    }
    __call612_8(life11_5, p0, p1, p2, p3, p4, p5);
    if (!((!__fieldRead612_9(receiver)))) {
        break forest_join_46;
    }
    if (!(__fieldRead612_10(receiver))) {
        break forest_join_46;
    }
    __call612_11(life11_5, p0, p1, p2, p3, p4, p5);
    }
    if (!(__fieldRead612_12(receiver))) {
        break forest_join_73;
    }
    if (!((!__call612_13(p0)))) {
        break forest_join_73;
    }
    if (!((!p6))) {
        break forest_join_73;
    }
    if (!((!__fieldRead612_14(receiver)))) {
        break forest_join_73;
    }
    __call612_15(receiver, p0, p1, p2, p3, p4, p5);
    break forest_join_73;
    }
    if (!((__fieldRead612_16(receiver) == null))) {
        break forest_join_71;
    }
    forestValue612_72_0 = 1;
    break forest_join_72;
    }
    forestValue612_72_0 = 0;
    }
    return __integerCategory612_17(forestValue612_72_0);
    }
    return __integerCategory612_18(1);
}
public static boolean h612_0(java.lang.Throwable p0) throws Throwable {
    throw __call3061200_0(p0);
}
public static boolean h612_1(java.lang.Throwable p0) throws Throwable {
    throw __call3061201_0(p0);
}
public static boolean h612_2(java.lang.Throwable p0) throws Throwable {
    throw __call3061202_0(p0);
}
public static boolean h612_3(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    throw new moom.Oo(__call3061203_0(life1_2, "Rendering entity in world"));
}
public static boolean h612_4(java.lang.Throwable p0) throws Throwable {
    throw __call3061204_0(p0);
}
public static boolean h612_5(java.lang.Throwable p0) throws Throwable {
    throw __call3061205_0(p0);
}
public static boolean h612_6(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    throw new moom.Oo(__call3061206_0(life1_2, "Post-rendering entity in world"));
}
public static boolean h612_7(java.lang.Throwable p0) throws Throwable {
    throw __call3061207_0(p0);
}
public static boolean h612_8(java.lang.Throwable p0) throws Throwable {
    throw __call3061208_0(p0);
}
public static boolean h612_9(java.lang.Throwable p0) throws Throwable {
    throw __call3061209_0(p0);
}
public static boolean h612_10(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    throw new moom.Oo(__call3061210_0(life1_2, "Rendering entity hitbox in world"));
}
public static boolean h612_11(java.lang.Throwable p0) throws Throwable {
    throw __call3061211_0(p0);
}
public static boolean h612_12(java.lang.Throwable p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6, java.lang.Object p7) throws Throwable {
    java.lang.Throwable life11_2;
    moom.qY life12_6;
    moom.qZ life13_10;
    moom.qZ life14_17;
    life11_2 = p0;
    life12_6 = __call3061212_0(life11_2, "Rendering entity in world");
    life13_10 = __call3061212_1(life12_6, "Entity being rendered");
    __call3061212_2(p1, life13_10);
    life14_17 = __call3061212_3(life12_6, "Renderer details");
    __call3061212_4(life14_17, "Assigned renderer", p7);
    __call3061212_6(life14_17, "Location", __call3061212_5(p2, p3, p4));
    __call3061212_8(life14_17, "Rotation", __call3061212_7(p5));
    __call3061212_10(life14_17, "Delta", __call3061212_9(p6));
    throw new moom.Oo(life12_6);
}
private static native net.minecraft.client.renderer.entity.Render __call612_0(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead612_1(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native int __instanceOf612_2(net.minecraft.client.renderer.entity.Render a0) throws Throwable;
private static native moom.mS __cast612_3(net.minecraft.client.renderer.entity.Render a0) throws Throwable;
private static native boolean __fieldRead612_4(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native void __call612_5(moom.mS a0, boolean a1) throws Throwable;
private static native boolean __call612_6() throws Throwable;
private static native void __fieldWrite612_7(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.client.renderer.entity.Render a1) throws Throwable;
private static native void __call612_8(net.minecraft.client.renderer.entity.Render a0, net.minecraft.entity.Entity a1, double a2, double a3, double a4, float a5, float a6) throws Throwable;
private static native boolean __fieldRead612_9(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __fieldRead612_10(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native void __call612_11(net.minecraft.client.renderer.entity.Render a0, net.minecraft.entity.Entity a1, double a2, double a3, double a4, float a5, float a6) throws Throwable;
private static native boolean __fieldRead612_12(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call612_13(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __fieldRead612_14(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native void __call612_15(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, double a2, double a3, double a4, float a5, float a6) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead612_16(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __integerCategory612_17(int value) throws Throwable;
private static native boolean __integerCategory612_18(int value) throws Throwable;
private static native java.lang.Throwable __call3061200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3061201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3061202_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3061203_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3061204_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3061205_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3061206_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3061207_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3061208_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3061209_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3061210_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call3061211_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call3061212_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3061212_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3061212_2(net.minecraft.entity.Entity a0, moom.qZ a1) throws Throwable;
private static native moom.qZ __call3061212_3(moom.qY a0, java.lang.String a1) throws Throwable;
private static native void __call3061212_4(moom.qZ a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.lang.String __call3061212_5(double a0, double a1, double a2) throws Throwable;
private static native void __call3061212_6(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Float __call3061212_7(float a0) throws Throwable;
private static native void __call3061212_8(moom.qZ a0, java.lang.String a1, java.lang.Float a2) throws Throwable;
private static native java.lang.Float __call3061212_9(float a0) throws Throwable;
private static native void __call3061212_10(moom.qZ a0, java.lang.String a1, java.lang.Float a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7c49051df94f0739e6fc(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, float a2) throws E;
private static final class __SourceHandler_7c49051df94f0739e6fc {

public static void f2573(net.minecraft.client.renderer.entity.RenderManager receiver, net.minecraft.entity.Entity p0, float p1) throws Throwable {
    long life3_3;
    double life5_15;
    double life7_27;
    double life9_39;
    net.minecraft.client.renderer.entity.Render life11_43;
    int life12_55;
    int life13_63;
    int life14_71;
    life3_3 = (__fieldRead2573_0() ^ 16656914477543L);
    life5_15 = (__fieldRead2573_1(p0) + ((__fieldRead2573_2(p0) - __fieldRead2573_3(p0)) * ((double) p1)));
    life7_27 = (__fieldRead2573_4(p0) + ((__fieldRead2573_5(p0) - __fieldRead2573_6(p0)) * ((double) p1)));
    life9_39 = (__fieldRead2573_7(p0) + ((__fieldRead2573_8(p0) - __fieldRead2573_9(p0)) * ((double) p1)));
    life11_43 = __call2573_10(receiver, p0);
    if ((life11_43 != null)) {
        if ((__fieldRead2573_11(receiver) != null)) {
        life12_55 = __call2573_12(p0, p1);
        life13_63 = (life12_55 % __invokedynamic2573_13(1982, (3688101933816704332L ^ life3_3)));
        life14_71 = (life12_55 / __invokedynamic2573_14(1982, (3688101933816704332L ^ life3_3)));
        __call2573_16(__fieldRead2573_15(), ((float) life13_63), ((float) life14_71));
        __call2573_17(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
        __call2573_21(life11_43, p0, (life5_15 - __fieldRead2573_18(receiver)), (life7_27 - __fieldRead2573_19(receiver)), (life9_39 - __fieldRead2573_20(receiver)));
    }
    }
    return;
}
public static void h2573_0(moom.Oo p0) throws Throwable {
    throw __call1257300_0(p0);
}
private static native long __fieldRead2573_0() throws Throwable;
private static native double __fieldRead2573_1(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead2573_9(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.Render __call2573_10(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __fieldRead2573_11(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native int __call2573_12(net.minecraft.entity.Entity a0, float a1) throws Throwable;
private static native int __invokedynamic2573_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic2573_14(int a0, long a1) throws Throwable;
private static native int __fieldRead2573_15() throws Throwable;
private static native void __call2573_16(int a0, float a1, float a2) throws Throwable;
private static native void __call2573_17(float a0, float a1, float a2, float a3) throws Throwable;
private static native double __fieldRead2573_18(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead2573_19(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native double __fieldRead2573_20(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native void __call2573_21(net.minecraft.client.renderer.entity.Render a0, net.minecraft.entity.Entity a1, double a2, double a3, double a4) throws Throwable;
private static native java.lang.Throwable __call1257300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_cc9b302ccc1529a3fc67(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1, net.minecraft.client.renderer.culling.ICamera a2, double a3, double a4, double a5) throws E;
private static final class __SourceHandler_cc9b302ccc1529a3fc67 {

public static boolean f1415(net.minecraft.client.renderer.entity.RenderManager receiver, net.minecraft.entity.Entity p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) throws Throwable {
    int forwardValue1415_17_0;
    net.minecraft.client.renderer.entity.Render life9_3;
    forward_join_17: {
    forward_join_16: {
    life9_3 = __call1415_0(receiver, p0);
    if (!((life9_3 != null))) {
        break forward_join_16;
    }
    if (!(__call1415_1(life9_3, p0, p1, p2, p3, p4))) {
        break forward_join_16;
    }
    forwardValue1415_17_0 = 1;
    break forward_join_17;
    }
    forwardValue1415_17_0 = 0;
    }
    return __integerCategory1415_2(forwardValue1415_17_0);
}
public static void h1415_0(moom.Oo p0) throws Throwable {
    throw __call1141500_0(p0);
}
public static void h1415_1(moom.Oo p0) throws Throwable {
    throw __call1141501_0(p0);
}
private static native net.minecraft.client.renderer.entity.Render __call1415_0(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native boolean __call1415_1(net.minecraft.client.renderer.entity.Render a0, net.minecraft.entity.Entity a1, net.minecraft.client.renderer.culling.ICamera a2, double a3, double a4, double a5) throws Throwable;
private static native boolean __integerCategory1415_2(int value) throws Throwable;
private static native java.lang.Throwable __call1141500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1141501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bd35961501a7a248dc77(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.world.World a1, net.minecraft.client.gui.FontRenderer a2, net.minecraft.entity.Entity a3, net.minecraft.entity.Entity a4, net.minecraft.client.settings.GameSettings a5, float a6) throws E;
private static final class __SourceHandler_bd35961501a7a248dc77 {

public static void f613(net.minecraft.client.renderer.entity.RenderManager receiver, net.minecraft.world.World p0, net.minecraft.client.gui.FontRenderer p1, net.minecraft.entity.Entity p2, net.minecraft.entity.Entity p3, net.minecraft.client.settings.GameSettings p4, float p5) throws Throwable {
    long life7_3;
    net.minecraft.block.state.IBlockState life9_33;
    net.minecraft.block.Block life10_36;
    int life11_45;
    forest_join_99: {
    forest_join_89: {
    forest_join_65: {
    forest_join_64: {
    life7_3 = (__fieldRead613_0() ^ 25873485061497L);
    __fieldWrite613_1(receiver, p0);
    __fieldWrite613_2(receiver, p4);
    __fieldWrite613_3(receiver, p2);
    __fieldWrite613_4(receiver, p3);
    __fieldWrite613_5(receiver, p1);
    if (!((__instanceOf613_6(p2) != 0))) {
        break forest_join_65;
    }
    if (!(__call613_8(__cast613_7(p2)))) {
        break forest_join_65;
    }
    life9_33 = __call613_9(p0, new moom.DT(p2));
    life10_36 = __call613_10(life9_33);
    if (!((life10_36 == __fieldRead613_11()))) {
        break forest_join_64;
    }
    life11_45 = __call613_15(__cast613_14(__call613_13(life9_33, __fieldRead613_12())));
    __fieldWrite613_18(receiver, ((float) ((life11_45 * __invokedynamic613_16(1476, (4633752222740759466L ^ life7_3))) + __invokedynamic613_17(4609, (9164266465069061230L ^ life7_3)))));
    __fieldWrite613_19(receiver, 0x0.0p0f);
    }
    break forest_join_89;
    }
    __fieldWrite613_23(receiver, (__fieldRead613_20(p2) + ((__fieldRead613_21(p2) - __fieldRead613_22(p2)) * p5)));
    __fieldWrite613_27(receiver, (__fieldRead613_24(p2) + ((__fieldRead613_25(p2) - __fieldRead613_26(p2)) * p5)));
    }
    if (!((__fieldRead613_28(p4) == 2))) {
        break forest_join_99;
    }
    net.minecraft.client.renderer.entity.RenderManager __stackOp613_29_0 = receiver;
    __fieldWrite613_31(__stackOp613_29_0, (__fieldRead613_30(__stackOp613_29_0) + 0x1.68p7f));
    }
    __fieldWrite613_35(receiver, (__fieldRead613_32(p2) + ((__fieldRead613_33(p2) - __fieldRead613_34(p2)) * ((double) p5))));
    __fieldWrite613_39(receiver, (__fieldRead613_36(p2) + ((__fieldRead613_37(p2) - __fieldRead613_38(p2)) * ((double) p5))));
    __fieldWrite613_43(receiver, (__fieldRead613_40(p2) + ((__fieldRead613_41(p2) - __fieldRead613_42(p2)) * ((double) p5))));
    return;
}
public static void h613_0(moom.Oo p0) throws Throwable {
    throw __call3061300_0(p0);
}
public static void h613_1(moom.Oo p0) throws Throwable {
    throw __call3061301_0(p0);
}
private static native long __fieldRead613_0() throws Throwable;
private static native void __fieldWrite613_1(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.world.World a1) throws Throwable;
private static native void __fieldWrite613_2(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.client.settings.GameSettings a1) throws Throwable;
private static native void __fieldWrite613_3(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __fieldWrite613_4(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __fieldWrite613_5(net.minecraft.client.renderer.entity.RenderManager a0, net.minecraft.client.gui.FontRenderer a1) throws Throwable;
private static native int __instanceOf613_6(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast613_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call613_8(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call613_9(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call613_10(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead613_11() throws Throwable;
private static native moom.fx __fieldRead613_12() throws Throwable;
private static native java.lang.Comparable __call613_13(net.minecraft.block.state.IBlockState a0, moom.fx a1) throws Throwable;
private static native moom.bs __cast613_14(java.lang.Comparable a0) throws Throwable;
private static native int __call613_15(moom.bs a0) throws Throwable;
private static native int __invokedynamic613_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic613_17(int a0, long a1) throws Throwable;
private static native void __fieldWrite613_18(net.minecraft.client.renderer.entity.RenderManager a0, float a1) throws Throwable;
private static native void __fieldWrite613_19(net.minecraft.client.renderer.entity.RenderManager a0, float a1) throws Throwable;
private static native float __fieldRead613_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead613_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead613_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite613_23(net.minecraft.client.renderer.entity.RenderManager a0, float a1) throws Throwable;
private static native float __fieldRead613_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead613_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead613_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite613_27(net.minecraft.client.renderer.entity.RenderManager a0, float a1) throws Throwable;
private static native int __fieldRead613_28(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native float __fieldRead613_30(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native void __fieldWrite613_31(net.minecraft.client.renderer.entity.RenderManager a0, float a1) throws Throwable;
private static native double __fieldRead613_32(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead613_33(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead613_34(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite613_35(net.minecraft.client.renderer.entity.RenderManager a0, double a1) throws Throwable;
private static native double __fieldRead613_36(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead613_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead613_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite613_39(net.minecraft.client.renderer.entity.RenderManager a0, double a1) throws Throwable;
private static native double __fieldRead613_40(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead613_41(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead613_42(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite613_43(net.minecraft.client.renderer.entity.RenderManager a0, double a1) throws Throwable;
private static native java.lang.Throwable __call3061300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3061301_0(moom.Oo a0) throws Throwable;

}


public boolean b__Boolean() {
return ((((this.u) ? 1 : 0)) != 0);
}


public void b__Void(boolean p0) {
this.u = ((boolean)(p0));
    return;
}


public net.minecraft.client.renderer.entity.RenderManager b(boolean p0) {
this.w = ((boolean)(p0));
    return this;
}


public double b() {
return this.q;
}


public java.util.Map<java.lang.String, moom.nr> b__Map() {
return java.util.Collections.unmodifiableMap(((java.util.Map)(this.a)));
}


public boolean e() {
return ((((this.x) ? 1 : 0)) != 0);
}


public net.minecraft.client.renderer.entity.RenderManager e(boolean p0) {
this.z = ((boolean)(p0));
    return this;
}


public boolean c__Boolean() {
return ((((this.v) ? 1 : 0)) != 0);
}


public void c__Void(boolean p0) {
this.s = ((boolean)(p0));
    return;
}


public double c() {
return this.r;
}


public net.minecraft.client.renderer.entity.RenderManager c(boolean p0) {
this.x = ((boolean)(p0));
    return this;
}


public boolean f() {
return ((((this.y) ? 1 : 0)) != 0);
}


public boolean d() {
return ((((this.w) ? 1 : 0)) != 0);
}


public net.minecraft.client.renderer.entity.RenderManager d(boolean p0) {
this.y = ((boolean)(p0));
    return this;
}


public double a() {
return this.p;
}


public void a(java.util.Map p0) {
this.n = ((java.util.Map)(p0));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10787_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.client.renderer.entity.RenderManager a(boolean p0) {
this.v = ((boolean)(p0));
    return this;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2111;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/nw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.entity.RenderManager.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean() {
return ((((this.t) ? 1 : 0)) != 0);
}


public void a__Void(boolean p0) {
this.t = ((boolean)(p0));
    return;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0, float p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.renderer.entity.RenderManager)(this)).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((boolean)(false))))) != 0);
}


public boolean a(net.minecraft.entity.Entity p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) { return __sourceHandlerCall_cc9b302ccc1529a3fc67(this, p0, p1, p2, p3, p4); }


public boolean a(net.minecraft.entity.Entity p0, float p1, boolean p2) {
long life4_3;
    double life6_33;
    double life8_45;
    double life10_57;
    float life12_68;
    int life13_72;
    int life14_89;
    int life15_97;
    life4_3 = (net.minecraft.client.renderer.entity.RenderManager.A ^ 112477539563838L);
    try {
        if ((((net.minecraft.entity.Entity)(p0)).S == 0)) {
        ((net.minecraft.entity.Entity)(p0)).M = ((double)(((net.minecraft.entity.Entity)(p0)).n));
        ((net.minecraft.entity.Entity)(p0)).N = ((double)(((net.minecraft.entity.Entity)(p0)).o));
        ((net.minecraft.entity.Entity)(p0)).O = ((double)(((net.minecraft.entity.Entity)(p0)).p));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.renderer.entity.RenderManager.a(((java.lang.Throwable)(caught_rethrow_0)));
    }
    life6_33 = (((net.minecraft.entity.Entity)(p0)).M + ((((net.minecraft.entity.Entity)(p0)).n - ((net.minecraft.entity.Entity)(p0)).M) * ((double) p1)));
    life8_45 = (((net.minecraft.entity.Entity)(p0)).N + ((((net.minecraft.entity.Entity)(p0)).o - ((net.minecraft.entity.Entity)(p0)).N) * ((double) p1)));
    life10_57 = (((net.minecraft.entity.Entity)(p0)).O + ((((net.minecraft.entity.Entity)(p0)).p - ((net.minecraft.entity.Entity)(p0)).O) * ((double) p1)));
    life12_68 = (((net.minecraft.entity.Entity)(p0)).y + ((((net.minecraft.entity.Entity)(p0)).w - ((net.minecraft.entity.Entity)(p0)).y) * p1));
    life13_72 = ((net.minecraft.entity.Entity)(p0)).a__Int(((float)(p1)));
    if (((net.minecraft.entity.Entity)(p0)).r__Boolean()) {
        life13_72 = __sourceIntrinsic_6f4da32de3ff_invokedynamic2644_23(9287, (7431516740249405034L ^ life4_3));
    }
    life14_89 = (life13_72 % __sourceIntrinsic_6f4da32de3ff_invokedynamic2644_24(11833, (7105700280094280727L ^ life4_3)));
    life15_97 = (life13_72 / __sourceIntrinsic_6f4da32de3ff_invokedynamic2644_25(1982, (3688074540407154069L ^ life4_3)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) life14_89))), ((float)(((float) life15_97))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return ((net.minecraft.client.renderer.entity.RenderManager)(this)).a(((net.minecraft.entity.Entity)(p0)), ((double)((life6_33 - this.p))), ((double)((life8_45 - this.q))), ((double)((life10_57 - this.r))), ((float)(life12_68)), ((float)(p1)), ((boolean)(p2)));
}


public void a__Void(double p0, double p1, double p2) {
this.p = ((double)(p0));
    this.q = ((double)(p1));
    this.r = ((double)(p2));
    return;
}


public <T extends net.minecraft.entity.Entity> net.minecraft.client.renderer.entity.Render<T> a(java.lang.Class<? extends net.minecraft.entity.Entity> p0) { return __sourceHandlerCall_0b7137b85e9a1f5acecc(this, p0); }


public <T extends net.minecraft.entity.Entity> net.minecraft.client.renderer.entity.Render<T> a(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_433289c196cb9989020f(this, p0); }


public void a(net.minecraft.world.World p0, net.minecraft.client.gui.FontRenderer p1, net.minecraft.entity.Entity p2, net.minecraft.entity.Entity p3, net.minecraft.client.settings.GameSettings p4, float p5) { __sourceHandlerCall_bd35961501a7a248dc77(this, p0, p1, p2, p3, p4, p5); }


public void a(float p0) {
this.g = ((float)(p0));
    return;
}


public java.util.Map<java.lang.Class, net.minecraft.client.renderer.entity.Render> a__Map() {
return this.n;
}


public void a(net.minecraft.world.World p0) {
this.d = ((net.minecraft.world.World)(p0));
    return;
}


public double a(double p0, double p1, double p2) {
double local7 = (p0 - this.j);
    double local9 = (p1 - this.k);
    double local11 = (p2 - this.l);
    return (((local7 * local7) + (local9 * local9)) + (local11 * local11));
}


public net.minecraft.client.gui.FontRenderer a__ga() {
return this.o;
}


private void a(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    float life12_16;
    moom.CA life13_19;
    moom.CA life14_65;
    float life15_92;
    net.minecraft.client.renderer.Tessellator life15_140;
    moom.lw life16_143;
    moom.DR life17_147;
    life10_3 = (net.minecraft.client.renderer.entity.RenderManager.A ^ 70623495690294L);
    if ((!moom.MP.s)) {
        moom.kZ.a(((boolean)(false)));
        moom.kZ.v();
        moom.kZ.f();
        moom.kZ.p();
        moom.kZ.k();
        life12_16 = (((net.minecraft.entity.Entity)(p0)).G / 0x1.0p1f);
        life13_19 = ((net.minecraft.entity.Entity)(p0)).b();
        life14_65 = new moom.CA(((((moom.CA)(life13_19)).b - ((net.minecraft.entity.Entity)(p0)).n) + p1), ((((moom.CA)(life13_19)).c - ((net.minecraft.entity.Entity)(p0)).o) + p2), ((((moom.CA)(life13_19)).d - ((net.minecraft.entity.Entity)(p0)).p) + p3), ((((moom.CA)(life13_19)).e - ((net.minecraft.entity.Entity)(p0)).n) + p1), ((((moom.CA)(life13_19)).f - ((net.minecraft.entity.Entity)(p0)).o) + p2), ((((moom.CA)(life13_19)).g - ((net.minecraft.entity.Entity)(p0)).p) + p3));
        net.minecraft.client.renderer.RenderGlobal.a(((moom.CA)(life14_65)), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_21(1475, (4398397682893555431L ^ life10_3)))), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_22(26048, (607056689829209826L ^ life10_3)))), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_23(26048, (607056689829209826L ^ life10_3)))), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_24(26048, (607056689829209826L ^ life10_3)))));
        if ((((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0)) {
        life15_92 = 0x1.47ae14p-7f;
        net.minecraft.client.renderer.RenderGlobal.a(((moom.CA)(new moom.CA((p1 - ((double) life12_16)), ((p2 + ((double) ((net.minecraft.entity.Entity)(p0)).e__Float())) - 0x1.47ae14p-7d), (p3 - ((double) life12_16)), (p1 + ((double) life12_16)), ((p2 + ((double) ((net.minecraft.entity.Entity)(p0)).e__Float())) + 0x1.47ae14p-7d), (p3 + ((double) life12_16))))), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_29(26048, (607056689829209826L ^ life10_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_30(26048, (607056689829209826L ^ life10_3)))));
    }
        life15_140 = net.minecraft.client.renderer.Tessellator.a();
        life16_143 = ((net.minecraft.client.renderer.Tessellator)(life15_140)).a__lw();
        life17_147 = ((net.minecraft.entity.Entity)(p0)).a__DR(((float)(p5)));
        ((moom.lw)(life16_143)).a(((int)(3)), ((moom.oD)(moom.oB.h)));
        ((moom.lw)(((moom.lw)(((moom.lw)(life16_143)).a(((double)(p1)), ((double)((p2 + ((double) ((net.minecraft.entity.Entity)(p0)).e__Float())))), ((double)(p3))))).a(((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_39(26048, (607056689829209826L ^ life10_3)))), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_40(26048, (607056689829209826L ^ life10_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(life16_143)).a(((double)((p1 + (((moom.DR)(life17_147)).a * 0x1.0p1d)))), ((double)(((p2 + ((double) ((net.minecraft.entity.Entity)(p0)).e__Float())) + (((moom.DR)(life17_147)).b * 0x1.0p1d)))), ((double)((p3 + (((moom.DR)(life17_147)).c * 0x1.0p1d))))))).a(((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_48(26048, (607056689829209826L ^ life10_3)))), ((int)(__sourceIntrinsic_1624e7147de7_invokedynamic8823_49(26048, (607056689829209826L ^ life10_3))))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life15_140)).a__Void();
        moom.kZ.u();
        moom.kZ.e();
        moom.kZ.o();
        moom.kZ.k();
        moom.kZ.a(((boolean)(true)));
    }
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1) { __sourceHandlerCall_7c49051df94f0739e6fc(this, p0, p1); }


public boolean a__Boolean(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.renderer.entity.RenderManager)(this)).a(((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)), ((boolean)(false))))) != 0);
}


public boolean a(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5, boolean p6) { return __sourceHandlerCall_bced4020b9fb5be300c1(this, p0, p1, p2, p3, p4, p5, p6); }


public boolean g() {
return ((((this.z) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_a321ace613246f04_originalDynamicSite3766_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10787_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1624e7147de7_invokedynamic8823_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f4da32de3ff_invokedynamic2644_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f4da32de3ff_invokedynamic2644_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6f4da32de3ff_invokedynamic2644_25(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
