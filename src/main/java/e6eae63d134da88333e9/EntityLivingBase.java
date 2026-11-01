package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EntityLivingBase extends net.minecraft.entity.Entity {

public static float aE;

public static java.util.UUID aF;

public static moom.vB aG;

private net.minecraft.entity.ai.attributes.BaseAttributeMap aH;

private net.minecraft.util.CombatTracker aI;

private java.util.Map<java.lang.Integer, net.minecraft.potion.PotionEffect> aJ;

private net.minecraft.item.ItemStack[] aK;

public boolean aL;

public int aM;

public int aN;

public int aO;

public int aP;

public float aQ;

public int aR;

public float aS;

public float aT;

public float aU;

public float aV;

public float aW;

public int aX;

public float aY;

public float aZ;

public float a0;

public float a1;

public float a2;

public float a3;

public float a4;

public float a5;

public float a6;

protected net.minecraft.entity.player.EntityPlayer a7;

protected int a8;

protected boolean a9;

protected int a_;

protected float ba;

protected float bb;

protected float bc;

protected float bd;

protected float be;

protected int bf;

protected float bg;

public boolean bh;

protected boolean bi;

public float bj;

public float bk;

protected float bl;

public int bm;

public double bn;

public double bo;

public double bp;

protected double bq;

protected double br;

private boolean bs;

private net.minecraft.entity.EntityLivingBase bt;

private int bu;

private net.minecraft.entity.EntityLivingBase bv;

private int bw;

private float bx;

public int by;

private float bz;

private com.moon.module.impl.Animations bA;

private static int[] bB;

private static long hb;

private static long[] ob;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public EntityLivingBase(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_9f4152785d621448(net.minecraft.entity.EntityLivingBase receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 129050856690075L);
    net.minecraft.entity.EntityLivingBase.__sourceConstructorInit_9f4152785d621448_0(((net.minecraft.entity.EntityLivingBase)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).aI = ((net.minecraft.util.CombatTracker)(new net.minecraft.util.CombatTracker(receiver)));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).aJ = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).aK = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[5]));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).aX = ((int)(__sourceIntrinsic_9f4152785d621448_originalDynamicSite3825_6(25734, (6725897623732161460L ^ local2))));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).a6 = ((float)(0x1.47ae14p-6f));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).bs = ((boolean)(true));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).a__Void();
    ((net.minecraft.entity.EntityLivingBase)(receiver)).d(((float)(((net.minecraft.entity.EntityLivingBase)(receiver)).a())));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).e = ((boolean)(true));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).a1 = ((float)(((float) ((java.lang.Math.random() + 0x1.0p0d) * 0x1.47ae14p-7d))));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).a__Void(((double)(((net.minecraft.entity.EntityLivingBase)(receiver)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(receiver)).o)), ((double)(((net.minecraft.entity.EntityLivingBase)(receiver)).p)));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).a0 = ((float)((((float) java.lang.Math.random()) * 0x1.837p13f)));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).w = ((float)(((float) ((java.lang.Math.random() * 0x1.921fb54442d18p1d) * 0x1.0p1d))));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).a4 = ((float)(((net.minecraft.entity.EntityLivingBase)(receiver)).w));
    ((net.minecraft.entity.EntityLivingBase)(receiver)).P = ((float)(0x1.333334p-1f));
    return;
}


static {
hb = ((long)(((moom._a)(moom._c.a(((long)(5545963365527739821L)), ((long)(-1725407644430679012L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(83142610338342L)))));
    java.lang.Object __sourceSpill1851_6 = null;
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.EntityLivingBase.b(((int[])(__sourceSpill1851_6)));
    long local0_life9 = (net.minecraft.entity.EntityLivingBase.hb ^ 83675211022824L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1851_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1851_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1851_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1851_16 = new byte[8];
    (__sourceSpill1851_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1851_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1851_18 = __sourceSpill1851_16;
    ((javax.crypto.Cipher)(__sourceSpill1851_13)).init(((int)(__sourceSpill1851_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1851_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1851_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[32];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "ä\000<Â\027×)ûÊW}\003X{Ün\025ßâÝnj\021Ä%>¦\002ÓcÆ\021g(ÇìA\027¸»\007\t\003EÚ¿¶XhwïÒÉµN¬ö`º\004î×¿¡\025\002k\031\001=Z¸r\021CáÑÐ¤A¿Z\036z8¶\023{mg\020¸/M\nYvJÌÈÜ¡tZHú+\024)öR¦P}«¨\002Çî¸ä\020\023ÿ·ËÀY^\030©¯6Ï ftË\tõ·NKÚ9'îæÕø\0022^^89Oï¤+7Äá\fï¿\t|õU´à,\b]ÛµúlÉãÞH/ñmF4NF2\021Ô²¤c\np\\%NDàY³\000"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1851_27 = local6_life23;
        int __sourceSpill1851_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1851_27)).substring(((int)(__sourceSpill1851_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1851_32 = local8_life21;
        int __sourceSpill1851_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1851_35 = new byte[8];
        (__sourceSpill1851_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1851_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1851_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1851_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1851_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1851_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1851_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1851_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1851_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1851_36)).doFinal(((byte[])(__sourceSpill1851_35)));
        (__sourceSpill1851_32)[__sourceSpill1851_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "O u°­ÅçÎiR\034\nÊ\022}ç"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1851_40 = local6_life23;
        int __sourceSpill1851_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1851_40)).substring(((int)(__sourceSpill1851_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1851_45 = local8_life21;
        int __sourceSpill1851_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1851_48 = new byte[8];
        (__sourceSpill1851_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1851_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1851_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1851_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1851_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1851_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1851_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1851_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1851_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1851_49)).doFinal(((byte[])(__sourceSpill1851_48)));
        (__sourceSpill1851_45)[__sourceSpill1851_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    ob = ((long[])(local8_life21));
    pb = ((java.lang.Integer[])(new java.lang.Integer[32]));
    aE = ((float)(0x1.0p0f));
    aF = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)("662A6B8D-DA3E-4C1C-8813-96EA6097278D")))));
    aG = ((moom.vB)(((moom.vB)(new moom.vB(net.minecraft.entity.EntityLivingBase.aF, "Sprinting speed boost", 0x1.333334p-2d, 2))).a(((boolean)(false)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_9f4152785d621448_0(net.minecraft.entity.EntityLivingBase a0, net.minecraft.world.World a1) throws E;

public void B__sourceReturn_da8c82d5d4() {
int forwardValue4931_36_0;
    net.minecraft.world.World forwardValue4931_39_0;
    boolean spill4931_0;
    int spill4931_1;
    int spill4931_2;
    net.minecraft.world.World spill4931_3;
    long life1_3;
    int life3_5;
    forward_join_48: {
    forward_join_39: {
    forward_join_36: {
    forward_join_25: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 10595059726941L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4931_0 = this.aL;
    if (!((life3_5 == 0))) {
        forwardValue4931_36_0 = ((spill4931_0) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill4931_0)) {
        break forward_join_25;
    }
    spill4931_1 = this.aM;
    if (!((life3_5 == 0))) {
        forwardValue4931_36_0 = spill4931_1;
        break forward_join_36;
    }
    if (!((spill4931_1 < (((net.minecraft.entity.EntityLivingBase)(this)).k() / 2)))) {
        break forward_join_25;
    }
    spill4931_2 = this.aM;
    if (!((life3_5 == 0))) {
        forwardValue4931_36_0 = spill4931_2;
        break forward_join_36;
    }
    if (!((spill4931_2 < 0))) {
        break forward_join_48;
    }
    }
    this.aM = ((int)(-1));
    this.aL = ((boolean)(true));
    spill4931_3 = this.i;
    if (!((life3_5 == 0))) {
        forwardValue4931_39_0 = spill4931_3;
        break forward_join_39;
    }
    forwardValue4931_36_0 = ((spill4931_3 instanceof net.minecraft.world.WorldServer) ? 1 : 0);
    }
    if (!((forwardValue4931_36_0 != 0))) {
        break forward_join_48;
    }
    forwardValue4931_39_0 = this.i;
    }
    ((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(forwardValue4931_39_0)))).a__t2())).a(((net.minecraft.entity.Entity)(this)), ((moom.yK)(new moom.zE(this, 0))));
    }
    return;
}


protected void C() {
net.minecraft.entity.EntityLivingBase forwardValue4932_35_0;
    net.minecraft.entity.EntityLivingBase forwardValue4932_38_0;
    int spill4932_0;
    net.minecraft.entity.EntityLivingBase spill4932_1;
    net.minecraft.entity.EntityLivingBase spill4932_2;
    long life1_3;
    int life4_7;
    int life3_8;
    forward_join_38: {
    forward_join_37: {
    forward_join_35: {
    forward_join_34: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 72809862363274L);
    spill4932_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life4_7 = ((net.minecraft.entity.EntityLivingBase)(this)).k();
    life3_8 = spill4932_0;
    spill4932_1 = this;
    if (!((life3_8 != 0))) {
        forwardValue4932_35_0 = spill4932_1;
        break forward_join_35;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill4932_1)).aL)) {
        break forward_join_34;
    }
    net.minecraft.entity.EntityLivingBase __stackOp4932_4_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4932_4_0)).aM = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp4932_4_0)).aM + 1)));
    spill4932_2 = this;
    if (!((life3_8 != 0))) {
        forwardValue4932_38_0 = spill4932_2;
        break forward_join_38;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill4932_2)).aM >= life4_7))) {
        break forward_join_37;
    }
    this.aM = ((int)(0));
    this.aL = ((boolean)(false));
    if (!((life3_8 == 0))) {
        break forward_join_37;
    }
    }
    forwardValue4932_35_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4932_35_0)).aM = ((int)(0));
    }
    forwardValue4932_38_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4932_38_0)).aT = ((float)((((float) this.aM) / ((float) life4_7))));
    return;
}


public boolean C__Boolean() {
return ((0) != 0);
}


protected void D__sourceReturn_da8c82d5d4() {
int forwardValue4933_36_0;
    int forwardValue4933_53_0;
    int forwardValue4933_57_0;
    int forwardValue4933_59_0;
    int forwardValue4933_71_0;
    int forwardValue4933_75_0;
    int forwardValue4933_77_0;
    int forwardValue4933_89_0;
    int forwardValue4933_93_0;
    int forwardValue4933_95_0;
    int forwardValue4933_107_0;
    int forwardValue4933_111_0;
    int forwardValue4933_113_0;
    int forwardValue4933_119_0;
    int forwardValue4933_129_0;
    int forwardValue4933_150_0;
    int forwardValue4933_152_0;
    int forwardValue4933_159_0;
    int forwardValue4933_173_0;
    int forwardValue4933_175_0;
    float forwardValue4933_178_0;
    net.minecraft.entity.EntityLivingBase forwardValue4933_217_0;
    int spill4933_0;
    boolean spill4933_1;
    net.minecraft.entity.EntityLivingBase spill4933_2;
    boolean spill4933_3;
    int spill4933_4;
    int spill4933_5;
    int spill4933_6;
    int spill4933_7;
    int spill4933_8;
    long life1_3;
    int life3_10;
    com.moon.module.impl.Sprint life4_51;
    int life5_77;
    int life6_104;
    int life7_131;
    int life8_158;
    float life9_253;
    com.moon.ew life10_261;
    float life11_270;
    forward_join_217: {
    forward_join_216: {
    forward_join_178: {
    forward_join_177: {
    forward_join_175: {
    forward_join_174: {
    forward_join_173: {
    forward_join_168: {
    forward_join_159: {
    forward_join_152: {
    forward_join_151: {
    forward_join_150: {
    forward_join_145: {
    forward_join_129: {
    forward_join_128: {
    forward_join_119: {
    forward_join_113: {
    forward_join_112: {
    forward_join_111: {
    forward_join_107: {
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    forward_join_89: {
    forward_join_77: {
    forward_join_76: {
    forward_join_75: {
    forward_join_71: {
    forward_join_59: {
    forward_join_58: {
    forward_join_57: {
    forward_join_53: {
    forward_join_36: {
    forward_join_32: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 114633437700006L);
    spill4933_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    this.u = ((double)(((double) ((net.minecraft.entity.EntityLivingBase)(this)).h__sourceReturn_bc607678b6())));
    life3_10 = spill4933_0;
    spill4933_1 = ((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k)));
    if (!((life3_10 != 0))) {
        forwardValue4933_36_0 = ((spill4933_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill4933_1)) {
        break forward_join_32;
    }
    net.minecraft.entity.EntityLivingBase __stackOp4933_7_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4933_7_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4933_7_0)).u + ((double) (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k))))).c() + 1)) * 0x1.99999ap-4f)))));
    }
    spill4933_2 = this;
    if (!((life3_10 != 0))) {
        forwardValue4933_217_0 = spill4933_2;
        break forward_join_217;
    }
    forwardValue4933_36_0 = ((((net.minecraft.entity.EntityLivingBase)(spill4933_2)).u__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4933_36_0 != 0))) {
        break forward_join_216;
    }
    life4_51 = ((com.moon.module.impl.Sprint)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Sprint.class)))));
    spill4933_3 = ((com.moon.module.impl.Sprint)(life4_51)).isEnabled();
    if (!((life3_10 != 0))) {
        forwardValue4933_53_0 = ((spill4933_3) ? 1 : 0);
        break forward_join_53;
    }
    if (!(spill4933_3)) {
        break forward_join_58;
    }
    forwardValue4933_53_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Sprint)(life4_51)).a())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_57_0 = forwardValue4933_53_0;
        break forward_join_57;
    }
    if (!((forwardValue4933_53_0 != 0))) {
        break forward_join_58;
    }
    forwardValue4933_57_0 = 1;
    }
    forwardValue4933_59_0 = forwardValue4933_57_0;
    break forward_join_59;
    }
    forwardValue4933_59_0 = 0;
    }
    life5_77 = forwardValue4933_59_0;
    spill4933_4 = recovery.source.CarrierOps.fcmpg(((float)(this.bk)), ((float)(0x0.0p0f)));
    if (!((life3_10 != 0))) {
        forwardValue4933_71_0 = spill4933_4;
        break forward_join_71;
    }
    if (!((spill4933_4 < 0))) {
        break forward_join_76;
    }
    forwardValue4933_71_0 = recovery.source.CarrierOps.fcmpl(((float)(this.bj)), ((float)(0x0.0p0f)));
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_75_0 = forwardValue4933_71_0;
        break forward_join_75;
    }
    if (!((forwardValue4933_71_0 == 0))) {
        break forward_join_76;
    }
    forwardValue4933_75_0 = 1;
    }
    forwardValue4933_77_0 = forwardValue4933_75_0;
    break forward_join_77;
    }
    forwardValue4933_77_0 = 0;
    }
    life6_104 = forwardValue4933_77_0;
    spill4933_5 = recovery.source.CarrierOps.fcmpl(((float)(this.bj)), ((float)(0x0.0p0f)));
    if (!((life3_10 != 0))) {
        forwardValue4933_89_0 = spill4933_5;
        break forward_join_89;
    }
    if (!((spill4933_5 != 0))) {
        break forward_join_94;
    }
    forwardValue4933_89_0 = recovery.source.CarrierOps.fcmpg(((float)(this.bk)), ((float)(0x0.0p0f)));
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_93_0 = forwardValue4933_89_0;
        break forward_join_93;
    }
    if (!((forwardValue4933_89_0 < 0))) {
        break forward_join_94;
    }
    forwardValue4933_93_0 = 1;
    }
    forwardValue4933_95_0 = forwardValue4933_93_0;
    break forward_join_95;
    }
    forwardValue4933_95_0 = 0;
    }
    life7_131 = forwardValue4933_95_0;
    spill4933_6 = recovery.source.CarrierOps.fcmpl(((float)(this.bj)), ((float)(0x0.0p0f)));
    if (!((life3_10 != 0))) {
        forwardValue4933_107_0 = spill4933_6;
        break forward_join_107;
    }
    if (!((spill4933_6 != 0))) {
        break forward_join_112;
    }
    forwardValue4933_107_0 = recovery.source.CarrierOps.fcmpl(((float)(this.bk)), ((float)(0x0.0p0f)));
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_111_0 = forwardValue4933_107_0;
        break forward_join_111;
    }
    if (!((forwardValue4933_107_0 == 0))) {
        break forward_join_112;
    }
    forwardValue4933_111_0 = 1;
    }
    forwardValue4933_113_0 = forwardValue4933_111_0;
    break forward_join_113;
    }
    forwardValue4933_113_0 = 0;
    }
    life8_158 = forwardValue4933_113_0;
    spill4933_7 = life5_77;
    if (!((life3_10 != 0))) {
        forwardValue4933_119_0 = spill4933_7;
        break forward_join_119;
    }
    if (!((spill4933_7 != 0))) {
        break forward_join_177;
    }
    forwardValue4933_119_0 = life6_104;
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_129_0 = forwardValue4933_119_0;
        break forward_join_129;
    }
    if (!((forwardValue4933_119_0 != 0))) {
        break forward_join_128;
    }
    forwardValue4933_175_0 = __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_39(31016, (4699813793117067323L ^ life1_3));
    break forward_join_175;
    }
    forwardValue4933_129_0 = life7_131;
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_152_0 = forwardValue4933_129_0;
        break forward_join_152;
    }
    if (!((forwardValue4933_129_0 != 0))) {
        break forward_join_151;
    }
    spill4933_8 = recovery.source.CarrierOps.fcmpg(((float)(this.bj)), ((float)(0x0.0p0f)));
    if (!((life3_10 != 0))) {
        forwardValue4933_150_0 = spill4933_8;
        break forward_join_150;
    }
    if (!((spill4933_8 < 0))) {
        break forward_join_145;
    }
    forwardValue4933_175_0 = __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_42(16958, (4684582625643848508L ^ life1_3));
    break forward_join_175;
    }
    forwardValue4933_150_0 = __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_43(29740, (9061783500405069113L ^ life1_3));
    }
    forwardValue4933_175_0 = forwardValue4933_150_0;
    break forward_join_175;
    }
    forwardValue4933_152_0 = life8_158;
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_159_0 = forwardValue4933_152_0;
        break forward_join_159;
    }
    if (!((forwardValue4933_152_0 != 0))) {
        break forward_join_174;
    }
    forwardValue4933_159_0 = recovery.source.CarrierOps.fcmpg(((float)(this.bj)), ((float)(0x0.0p0f)));
    }
    if (!((life3_10 != 0))) {
        forwardValue4933_173_0 = forwardValue4933_159_0;
        break forward_join_173;
    }
    if (!((forwardValue4933_159_0 < 0))) {
        break forward_join_168;
    }
    forwardValue4933_175_0 = __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_46(2561, (5350982508030634757L ^ life1_3));
    break forward_join_175;
    }
    forwardValue4933_173_0 = __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_47(32476, (3200763368411848668L ^ life1_3));
    }
    forwardValue4933_175_0 = forwardValue4933_173_0;
    break forward_join_175;
    }
    forwardValue4933_175_0 = 0;
    }
    forwardValue4933_178_0 = ((float) forwardValue4933_175_0);
    break forward_join_178;
    }
    forwardValue4933_178_0 = 0x0.0p0f;
    }
    life9_253 = forwardValue4933_178_0;
    life10_261 = new com.moon.ew((this.w - life9_253));
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life10_261)));
    life11_270 = (((com.moon.ew)(life10_261)).a() * 0x1.1df46ap-6f);
    net.minecraft.entity.EntityLivingBase __stackOp4933_53_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4933_53_0)).t = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4933_53_0)).t - ((double) (moom.Dr.a(((float)(life11_270))) * 0x1.99999ap-3f)))));
    net.minecraft.entity.EntityLivingBase __stackOp4933_57_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4933_57_0)).v = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4933_57_0)).v + ((double) (moom.Dr.b(((float)(life11_270))) * 0x1.99999ap-3f)))));
    }
    forwardValue4933_217_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4933_217_0)).ad = ((boolean)(true));
    return;
}


protected void F__sourceReturn_da8c82d5d4() {
this.u += 0x1.47ae14p-5d;
    return;
}


protected void I() {
java.util.List lexicalValue1534_26_0;
    int spill1534_0;
    java.util.List spill1534_1;
    long life1_3;
    java.util.List life4_18;
    int life3_19;
    java.util.Iterator life5_33;
    net.minecraft.entity.Entity life6_40;
    lexical_join_40: {
    lexical_join_26: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 108344485655541L);
    spill1534_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life4_18 = ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this)).b())).b(((double)(0x1.99999ap-3d)), ((double)(0x0.0p0d)), ((double)(0x1.99999ap-3d))))), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(moom.CY.d)), ((com.google.common.base.Predicate)(__sourceIntrinsic_82cb24cf4441_invokedynamic1534_6()))))));
    life3_19 = spill1534_0;
    spill1534_1 = life4_18;
    if (!((life3_19 == 0))) {
        lexicalValue1534_26_0 = spill1534_1;
        break lexical_join_26;
    }
    if (!((!((java.util.List)(spill1534_1)).isEmpty()))) {
        break lexical_join_40;
    }
    lexicalValue1534_26_0 = life4_18;
    }
    life5_33 = ((java.util.List)(lexicalValue1534_26_0)).iterator();
    lexical_cycle_28: while (true) {
    if (!(((java.util.Iterator)(life5_33)).hasNext())) {
        break lexical_join_40;
    }
    life6_40 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life5_33)).next()));
    ((net.minecraft.entity.EntityLivingBase)(this)).h(((net.minecraft.entity.Entity)(life6_40)));
    if (!((life3_19 != 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return;
}


public boolean I__Boolean() {
net.minecraft.block.Block forwardValue4936_37_0;
    net.minecraft.block.Block forwardValue4936_37_1;
    int forwardValue4936_50_0;
    int forwardValue4936_52_0;
    int spill4936_0;
    net.minecraft.block.Block spill4936_1;
    net.minecraft.block.Block spill4936_2;
    int spill4936_3;
    boolean spill4936_4;
    long life1_3;
    int life4_7;
    int life5_13;
    int life6_17;
    net.minecraft.block.Block life7_28;
    int life3_29;
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_38: {
    forward_join_37: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 57117431735089L);
    life4_7 = moom.Dr.b__Int(((double)(this.n)));
    spill4936_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life5_13 = moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this)).b())).c)));
    life6_17 = moom.Dr.b__Int(((double)(this.p)));
    life7_28 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(new moom.DT(life4_7, life5_13, life6_17)))))).a__ch();
    life3_29 = spill4936_0;
    spill4936_1 = life7_28;
    spill4936_2 = net.minecraft.init.Blocks.au;
    if (!((life3_29 != 0))) {
        forwardValue4936_37_0 = spill4936_1;
        forwardValue4936_37_1 = spill4936_2;
        break forward_join_37;
    }
    if (!((spill4936_1 != spill4936_2))) {
        break forward_join_38;
    }
    forwardValue4936_37_0 = life7_28;
    forwardValue4936_37_1 = net.minecraft.init.Blocks.bc;
    }
    if (!((forwardValue4936_37_0 == forwardValue4936_37_1))) {
        break forward_join_51;
    }
    }
    spill4936_3 = ((this instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_29 != 0))) {
        forwardValue4936_50_0 = spill4936_3;
        break forward_join_50;
    }
    if (!((spill4936_3 != 0))) {
        break forward_join_49;
    }
    spill4936_4 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(this)))).U__Boolean();
    if (!((life3_29 != 0))) {
        forwardValue4936_50_0 = ((spill4936_4) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill4936_4))) {
        break forward_join_51;
    }
    }
    forwardValue4936_50_0 = 1;
    }
    forwardValue4936_52_0 = forwardValue4936_50_0;
    break forward_join_52;
    }
    forwardValue4936_52_0 = 0;
    }
    return ((forwardValue4936_52_0) != 0);
}


protected boolean J__Boolean() {
int forwardValue4937_14_0;
    int forwardValue4937_16_0;
    int spill4937_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 104471441786593L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4937_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    if (!((life3_5 != 0))) {
        forwardValue4937_14_0 = spill4937_0;
        break forward_join_14;
    }
    if (!((spill4937_0 <= 0))) {
        break forward_join_15;
    }
    forwardValue4937_14_0 = 1;
    }
    forwardValue4937_16_0 = forwardValue4937_14_0;
    break forward_join_16;
    }
    forwardValue4937_16_0 = 0;
    }
    return ((forwardValue4937_16_0) != 0);
}


public void J() {
return;
}


public float i__sourceReturn_bc607678b6() {
return this.bx;
}


public final void i(int p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 92077048084680L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_4984c5be6222_originalDynamicSite1880_2(16734, (3504892081859954481L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) p0)))))));
    return;
}


public final float b__sourceReturn_bc607678b6() {
long local1 = (net.minecraft.entity.EntityLivingBase.hb ^ 88283308159997L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Float(((int)(__sourceIntrinsic_9a3137de8aff_originalDynamicSite1881_2(30009, (5765750024438511736L ^ local1)))));
}


protected void b(net.minecraft.potion.PotionEffect p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 134509980042075L);
    this.bs = ((boolean)(true));
    if ((((((net.minecraft.world.World)(this.i)).G) ? 1 : 0) == 0)) {
        ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(p0)).a()])).b(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())), ((int)(((net.minecraft.potion.PotionEffect)(p0)).c())));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11202_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected float b(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4959_16_0;
    int forwardValue4959_51_0;
    int forwardValue4959_60_0;
    int forwardValue4959_77_0;
    int forwardValue4959_81_0;
    int forwardValue4959_95_0;
    int forwardValue4959_95_1;
    boolean spill4959_0;
    int spill4959_1;
    int spill4959_2;
    long life3_3;
    int life5_5;
    int life6_41;
    int life7_49;
    float life8_54;
    int life6_76;
    int life7_124;
    float life8_129;
    forward_join_106: {
    forward_join_95: {
    forward_join_81: {
    forward_join_77: {
    forward_join_76: {
    forward_join_60: {
    forward_join_56: {
    forward_join_51: {
    forward_join_48: {
    forward_join_16: {
    forward_join_13: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 2359272403278L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4959_0 = ((net.minecraft.util.DamageSource)(p0)).e__Boolean();
    if (!((life5_5 != 0))) {
        forwardValue4959_16_0 = ((spill4959_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill4959_0)) {
        break forward_join_13;
    }
    return p1;
    }
    forwardValue4959_16_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n)))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue4959_51_0 = forwardValue4959_16_0;
        break forward_join_51;
    }
    if (!((forwardValue4959_16_0 != 0))) {
        break forward_join_48;
    }
    if (!((p0 != net.minecraft.util.DamageSource.j))) {
        break forward_join_48;
    }
    life6_41 = ((((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n))))).c() + 1) * 5);
    life7_49 = (__sourceIntrinsic_3b749fd852cb_invokedynamic4959_11(21299, (9185563944518507735L ^ life3_3)) - life6_41);
    life8_54 = (p1 * ((float) life7_49));
    p1 = (life8_54 / 0x1.9p4f);
    }
    forwardValue4959_51_0 = recovery.source.CarrierOps.fcmpg(((float)(p1)), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 != 0))) {
        forwardValue4959_60_0 = forwardValue4959_51_0;
        break forward_join_60;
    }
    if (!((forwardValue4959_51_0 <= 0))) {
        break forward_join_56;
    }
    return 0x0.0p0f;
    }
    forwardValue4959_60_0 = moom.rV.a(((net.minecraft.item.ItemStack[])(((net.minecraft.entity.EntityLivingBase)(this)).a__ArrayxW())), ((net.minecraft.util.DamageSource)(p0)));
    }
    life6_76 = forwardValue4959_60_0;
    spill4959_1 = life6_76;
    if (!((life5_5 != 0))) {
        forwardValue4959_77_0 = spill4959_1;
        break forward_join_77;
    }
    if (!((spill4959_1 > __sourceIntrinsic_3b749fd852cb_invokedynamic4959_15(31634, (1831470759147926641L ^ life3_3))))) {
        break forward_join_76;
    }
    life6_76 = __sourceIntrinsic_3b749fd852cb_invokedynamic4959_16(25734, (6725922888636722017L ^ life3_3));
    }
    forwardValue4959_77_0 = life6_76;
    }
    if (!((life5_5 != 0))) {
        forwardValue4959_81_0 = forwardValue4959_77_0;
        break forward_join_81;
    }
    if (!((forwardValue4959_77_0 > 0))) {
        break forward_join_106;
    }
    forwardValue4959_81_0 = life6_76;
    }
    spill4959_2 = __sourceIntrinsic_3b749fd852cb_invokedynamic4959_17(25734, (6725922888636722017L ^ life3_3));
    if (!((life5_5 != 0))) {
        forwardValue4959_95_0 = forwardValue4959_81_0;
        forwardValue4959_95_1 = spill4959_2;
        break forward_join_95;
    }
    if (!((forwardValue4959_81_0 <= spill4959_2))) {
        break forward_join_106;
    }
    forwardValue4959_95_0 = __sourceIntrinsic_3b749fd852cb_invokedynamic4959_18(26641, (1324932397731276788L ^ life3_3));
    forwardValue4959_95_1 = life6_76;
    }
    life7_124 = (forwardValue4959_95_0 - forwardValue4959_95_1);
    life8_129 = (p1 * ((float) life7_124));
    p1 = (life8_129 / 0x1.9p4f);
    }
    return p1;
}


public abstract net.minecraft.item.ItemStack b__sourceReturn_7f6f0b7f03(int p0);

public abstract void b(int p0, net.minecraft.item.ItemStack p1);

public boolean b__Boolean(int p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.aJ)).containsKey(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0)))))))) != 0);
}


public static void b(int[] p0) {
bB = ((int[])(p0));
    return;
}


protected void b__Void() {
int lexicalValue1537_25_0;
    int lexicalValue1537_40_0;
    int lexicalValue1537_88_0;
    int spill1537_0;
    int spill1537_1;
    int spill1537_2;
    boolean spill1537_3;
    boolean spill1537_4;
    long life1_3;
    int life3_11;
    int life4_88;
    int life5_93;
    int life4_124;
    double life5_137;
    double life7_143;
    double life9_149;
    lexical_join_168: {
    lexical_join_88: {
    lexical_join_87: {
    lexical_join_85: {
    lexical_join_40: {
    lexical_join_38: {
    lexical_join_25: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 87974251894023L);
    spill1537_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    net.minecraft.entity.EntityLivingBase __stackOp1537_2_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1537_2_0)).aR = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp1537_2_0)).aR + 1)));
    life3_11 = spill1537_0;
    spill1537_1 = this.aR;
    if (!((life3_11 != 0))) {
        lexicalValue1537_25_0 = spill1537_1;
        break lexical_join_25;
    }
    if (!((spill1537_1 == __sourceIntrinsic_9bf881b104f5_invokedynamic1537_6(25734, (6725867782904418088L ^ life1_3))))) {
        break lexical_join_168;
    }
    lexicalValue1537_25_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_11 != 0))) {
        lexicalValue1537_88_0 = lexicalValue1537_25_0;
        break lexical_join_88;
    }
    if (!((lexicalValue1537_25_0 == 0))) {
        break lexical_join_85;
    }
    spill1537_2 = this.a8;
    if (!((life3_11 != 0))) {
        lexicalValue1537_40_0 = spill1537_2;
        break lexical_join_40;
    }
    if (!((spill1537_2 <= 0))) {
        break lexical_join_38;
    }
    spill1537_3 = ((net.minecraft.entity.EntityLivingBase)(this)).G__Boolean();
    if (!((life3_11 != 0))) {
        lexicalValue1537_88_0 = ((spill1537_3) ? 1 : 0);
        break lexical_join_88;
    }
    if (!(spill1537_3)) {
        break lexical_join_85;
    }
    }
    lexicalValue1537_40_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).d__Boolean()) ? 1 : 0);
    }
    if (!((life3_11 != 0))) {
        lexicalValue1537_88_0 = lexicalValue1537_40_0;
        break lexical_join_88;
    }
    if (!((lexicalValue1537_40_0 != 0))) {
        break lexical_join_85;
    }
    spill1537_4 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("doMobLoot")));
    if (!((life3_11 != 0))) {
        lexicalValue1537_88_0 = ((spill1537_4) ? 1 : 0);
        break lexical_join_88;
    }
    if (!(spill1537_4)) {
        break lexical_join_85;
    }
    life4_88 = ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.entity.player.EntityPlayer)(this.a7)));
    lexical_cycle_56: while (true) {
    if (!((life4_88 > 0))) {
        break lexical_join_85;
    }
    life5_93 = __sourceExactCall_d69b06941ddd75(((int)(life4_88)));
    life4_88 = (life4_88 - life5_93);
    ((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(this.i, this.n, this.o, this.p, life5_93))));
    if (!((life3_11 != 0))) {
        break lexical_join_87;
    }
    if (!((life3_11 == 0))) { continue lexical_cycle_56; }
    break lexical_cycle_56;
    }
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).f__Void();
    }
    lexicalValue1537_88_0 = 0;
    }
    life4_124 = lexicalValue1537_88_0;
    lexical_cycle_89: while (true) {
    if (!((life4_124 < __sourceIntrinsic_9bf881b104f5_invokedynamic1537_29(25734, (6725867782904418088L ^ life1_3))))) {
        break lexical_join_168;
    }
    life5_137 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life7_143 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life9_149 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_NORMAL)), ((double)(((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)((this.o + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))))), ((double)(((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(life5_137)), ((double)(life7_143)), ((double)(life9_149)), ((int[])(new int[0])));
    life4_124 += 1;
    if (!((life3_11 == 0))) { continue lexical_cycle_89; }
    break lexical_cycle_89;
    }
    }
    return;
}


public void b__Void(float p0) {
this.a2 = ((float)(p0));
    return;
}


public float b__sourceReturn_f6c4892e39(float p0) {
float forwardValue4955_27_0;
    float forwardValue4955_27_1;
    int spill4955_0;
    float spill4955_1;
    float spill4955_2;
    long life2_3;
    float life5_10;
    int life4_11;
    forward_join_27: {
    forward_join_22: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 68699815050238L);
    spill4955_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_10 = (this.aT - this.aS);
    life4_11 = spill4955_0;
    spill4955_1 = life5_10;
    spill4955_2 = 0x0.0p0f;
    if (!((life4_11 == 0))) {
        forwardValue4955_27_0 = spill4955_1;
        forwardValue4955_27_1 = spill4955_2;
        break forward_join_27;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill4955_1)), ((float)(spill4955_2))) < 0))) {
        break forward_join_22;
    }
    life5_10 = (life5_10 + 0x1.0p0f);
    }
    forwardValue4955_27_0 = this.aS;
    forwardValue4955_27_1 = (life5_10 * p0);
    }
    return (forwardValue4955_27_0 + forwardValue4955_27_1);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_42a80aa502dd3d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5933;
      if (pb[var3] == null) {
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
         long var5 = ob[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sG", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


public void b(net.minecraft.item.ItemStack p0) {
int spill1536_0;
    long life2_3;
    int life4_17;
    int life5_19;
    moom.DR life6_40;
    moom.DR life6_50;
    moom.DR life6_60;
    double life7_70;
    moom.DR life9_84;
    moom.DR life9_94;
    moom.DR life9_104;
    moom.DR life9_117;
    lexical_join_147: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 17086792539546L);
    spill1536_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((java.lang.String)("random.break")), ((float)(0x1.99999ap-1f)), ((float)((0x1.99999ap-1f + (((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextFloat() * 0x1.99999ap-2f)))));
    life4_17 = spill1536_0;
    life5_19 = 0;
    lexical_cycle_20: while (true) {
    if (!((life5_19 < 5))) {
        break lexical_join_147;
    }
    life6_40 = new moom.DR(((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * 0x1.999999999999ap-4d), ((java.lang.Math.random() * 0x1.999999999999ap-4d) + 0x1.999999999999ap-4d), 0x0.0p0d);
    life6_50 = ((moom.DR)(life6_40)).a(((float)((((-this.x) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life6_60 = ((moom.DR)(life6_50)).b(((float)((((-this.w) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life7_70 = ((((double) (-((java.util.Random)(this.ah)).nextFloat())) * 0x1.3333333333333p-1d) - 0x1.3333333333333p-2d);
    life9_84 = new moom.DR(((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * 0x1.3333333333333p-2d), life7_70, 0x1.3333333333333p-1d);
    life9_94 = ((moom.DR)(life9_84)).a(((float)((((-this.x) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life9_104 = ((moom.DR)(life9_94)).b(((float)((((-this.w) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life9_117 = ((moom.DR)(life9_104)).b(((double)(this.n)), ((double)((this.o + ((double) ((net.minecraft.entity.EntityLivingBase)(this)).e__Float())))), ((double)(this.p)));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.ITEM_CRACK)), ((double)(((moom.DR)(life9_117)).a)), ((double)(((moom.DR)(life9_117)).b)), ((double)(((moom.DR)(life9_117)).c)), ((double)(((moom.DR)(life6_60)).a)), ((double)((((moom.DR)(life6_60)).b + 0x1.999999999999ap-5d))), ((double)(((moom.DR)(life6_60)).c)), ((int[])(new int[] {__sourceExactCall_7da118eea97d77(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))})));
    life5_19 += 1;
    if (!((life4_17 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return;
}


public boolean b__Boolean() {
return ((0) != 0);
}


public void b(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue4956_27_0;
    net.minecraft.entity.EntityLivingBase forwardValue4956_33_0;
    net.minecraft.entity.EntityLivingBase forwardValue4956_38_0;
    net.minecraft.entity.EntityLivingBase spill4956_0;
    net.minecraft.entity.EntityLivingBase spill4956_1;
    net.minecraft.entity.EntityLivingBase spill4956_2;
    long life2_3;
    int life4_5;
    forward_join_40: {
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    forward_join_32: {
    forward_join_27: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 81446783539022L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4956_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue4956_38_0 = spill4956_0;
        break forward_join_38;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill4956_0)).g != null))) {
        break forward_join_37;
    }
    if (!((p0 == null))) {
        break forward_join_37;
    }
    spill4956_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue4956_27_0 = spill4956_1;
        break forward_join_27;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill4956_1)).i)).G))) {
        break forward_join_23;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).g(((net.minecraft.entity.Entity)(this.g)));
    }
    spill4956_2 = this;
    if (!((life4_5 != 0))) {
        forwardValue4956_33_0 = spill4956_2;
        break forward_join_33;
    }
    forwardValue4956_27_0 = ((net.minecraft.entity.EntityLivingBase)(spill4956_2)).g;
    }
    if (!((forwardValue4956_27_0 != null))) {
        break forward_join_32;
    }
    ((net.minecraft.entity.Entity)(this.g)).f = ((net.minecraft.entity.Entity)(null));
    }
    forwardValue4956_33_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4956_33_0)).g = ((net.minecraft.entity.Entity)(null));
    if (!((life4_5 == 0))) {
        break forward_join_40;
    }
    }
    forwardValue4956_38_0 = this;
    }
    __sourceIntrinsic_89fd98101069_call4956_11(forwardValue4956_38_0, p0);
    }
    return;
}


public void b(net.minecraft.entity.EntityLivingBase p0) {
this.bt = ((net.minecraft.entity.EntityLivingBase)(p0));
    this.bu = ((int)(this.S));
    return;
}


public net.minecraft.entity.EntityLivingBase b__sG() {
return this.bv;
}


public int b__Int() {
return this.bw;
}


public moom.DR b__DR() {
return ((net.minecraft.entity.EntityLivingBase)(this)).a__DR(((float)(0x1.0p0f)));
}


protected void b(boolean p0, int p1) {
return;
}


public void b(net.minecraft.entity.Entity p0, int p1) {
int forwardValue4957_16_0;
    net.minecraft.world.World forwardValue4957_19_0;
    int forwardValue4957_39_0;
    int forwardValue4957_54_0;
    boolean spill4957_0;
    net.minecraft.world.World spill4957_1;
    int spill4957_2;
    long life3_3;
    int life5_5;
    net.minecraft.entity.EntityTracker life6_33;
    forward_join_65: {
    forward_join_54: {
    forward_join_52: {
    forward_join_39: {
    forward_join_37: {
    forward_join_19: {
    forward_join_16: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 95361297962336L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4957_0 = ((net.minecraft.entity.Entity)(p0)).F;
    if (!((life5_5 == 0))) {
        forwardValue4957_16_0 = ((spill4957_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4957_0))) {
        break forward_join_65;
    }
    spill4957_1 = this.i;
    if (!((life5_5 == 0))) {
        forwardValue4957_19_0 = spill4957_1;
        break forward_join_19;
    }
    forwardValue4957_16_0 = ((((net.minecraft.world.World)(spill4957_1)).G) ? 1 : 0);
    }
    if (!((forwardValue4957_16_0 == 0))) {
        break forward_join_65;
    }
    forwardValue4957_19_0 = this.i;
    }
    life6_33 = ((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(forwardValue4957_19_0)))).a__t2();
    spill4957_2 = ((p0 instanceof net.minecraft.entity.item.EntityItem) ? 1 : 0);
    if (!((life5_5 == 0))) {
        forwardValue4957_39_0 = spill4957_2;
        break forward_join_39;
    }
    if (!((spill4957_2 != 0))) {
        break forward_join_37;
    }
    ((net.minecraft.entity.EntityTracker)(life6_33)).a(((net.minecraft.entity.Entity)(p0)), ((moom.yK)(new moom.zG(__sourceExactCall_cf86b9d0f8200d(((net.minecraft.entity.Entity)(p0))), __sourceExactCall_62c9ac7d46f640(((net.minecraft.entity.EntityLivingBase)(this)))))));
    }
    forwardValue4957_39_0 = ((p0 instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4957_54_0 = forwardValue4957_39_0;
        break forward_join_54;
    }
    if (!((forwardValue4957_39_0 != 0))) {
        break forward_join_52;
    }
    ((net.minecraft.entity.EntityTracker)(life6_33)).a(((net.minecraft.entity.Entity)(p0)), ((moom.yK)(new moom.zG(__sourceExactCall_cf86b9d0f8200d(((net.minecraft.entity.Entity)(p0))), __sourceExactCall_62c9ac7d46f640(((net.minecraft.entity.EntityLivingBase)(this)))))));
    }
    forwardValue4957_54_0 = ((p0 instanceof moom.tL) ? 1 : 0);
    }
    if (!((forwardValue4957_54_0 != 0))) {
        break forward_join_65;
    }
    ((net.minecraft.entity.EntityTracker)(life6_33)).a(((net.minecraft.entity.Entity)(p0)), ((moom.yK)(new moom.zG(__sourceExactCall_cf86b9d0f8200d(((net.minecraft.entity.Entity)(p0))), __sourceExactCall_62c9ac7d46f640(((net.minecraft.entity.EntityLivingBase)(this)))))));
    }
    return;
}


protected void e(float p0) {
return;
}


public void e(float p0, float p1) {
int forestValue657_30_0;
    int forestValue657_37_0;
    net.minecraft.entity.EntityLivingBase forestValue657_53_0;
    net.minecraft.entity.EntityLivingBase forestValue657_96_0;
    int forestValue657_135_0;
    int forestValue657_175_0;
    int forestValue657_180_0;
    int forestValue657_184_0;
    int forestValue657_186_0;
    int forestValue657_211_0;
    int forestValue657_227_0;
    int forestValue657_267_0;
    net.minecraft.entity.EntityLivingBase forestValue657_274_0;
    net.minecraft.entity.EntityLivingBase forestValue657_279_0;
    net.minecraft.entity.EntityLivingBase forestValue657_307_0;
    int forestValue657_368_0;
    net.minecraft.entity.EntityLivingBase forestValue657_371_0;
    double forestValue657_371_1;
    net.minecraft.entity.EntityLivingBase forestValue657_375_0;
    int forestValue657_395_0;
    int forestValue657_405_0;
    int forestValue657_472_0;
    net.minecraft.entity.EntityLivingBase forestValue657_496_0;
    net.minecraft.entity.EntityLivingBase forestValue657_496_1;
    net.minecraft.entity.EntityLivingBase forestValue657_499_0;
    net.minecraft.entity.EntityLivingBase forestValue657_505_0;
    net.minecraft.entity.EntityLivingBase spill657_0;
    boolean spill657_1;
    net.minecraft.entity.EntityLivingBase spill657_2;
    net.minecraft.entity.player.EntityPlayer spill657_3;
    net.minecraft.entity.EntityLivingBase spill657_4;
    net.minecraft.entity.player.EntityPlayer spill657_5;
    net.minecraft.entity.EntityLivingBase spill657_6;
    net.minecraft.entity.EntityLivingBase spill657_7;
    boolean spill657_8;
    int spill657_9;
    int spill657_10;
    int spill657_11;
    boolean spill657_12;
    net.minecraft.entity.EntityLivingBase spill657_13;
    boolean spill657_14;
    net.minecraft.entity.EntityLivingBase spill657_15;
    net.minecraft.entity.EntityLivingBase spill657_16;
    boolean spill657_17;
    net.minecraft.entity.EntityLivingBase spill657_18;
    double spill657_19;
    int spill657_20;
    net.minecraft.entity.EntityLivingBase spill657_21;
    net.minecraft.entity.EntityLivingBase spill657_22;
    net.minecraft.entity.EntityLivingBase spill657_23;
    long life3_3;
    int life5_5;
    float life6_59;
    float life7_97;
    float life8_108;
    float life6_121;
    float life9_158;
    int life10_210;
    double life6_351;
    double life6_424;
    float life8_426;
    float life9_428;
    float life10_432;
    double life8_564;
    float life10_575;
    forest_join_547: {
    forest_join_529: {
    forest_join_505: {
    forest_join_499: {
    forest_join_496: {
    forest_join_494: {
    forest_join_472: {
    forest_join_429: {
    forest_join_405: {
    forest_join_402: {
    forest_join_395: {
    forest_join_393: {
    forest_join_375: {
    forest_join_374: {
    forest_join_372: {
    forest_join_371: {
    forest_join_368: {
    forest_join_307: {
    forest_join_306: {
    forest_join_284: {
    forest_join_279: {
    forest_join_278: {
    forest_join_274: {
    forest_join_273: {
    forest_join_267: {
    forest_join_261: {
    forest_join_227: {
    forest_join_222: {
    forest_join_211: {
    forest_join_201: {
    forest_join_186: {
    forest_join_185: {
    forest_join_184: {
    forest_join_180: {
    forest_join_175: {
    forest_join_173: {
    forest_join_135: {
    forest_join_133: {
    forest_join_98: {
    forest_join_96: {
    forest_join_95: {
    forest_join_75: {
    forest_join_53: {
    forest_join_45: {
    forest_join_37: {
    forest_join_30: {
    forest_join_28: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 19397131516952L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill657_0 = this;
    if (!((life5_5 != 0))) {
        forestValue657_499_0 = spill657_0;
        break forest_join_499;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill657_0)).L__Boolean())) {
        break forest_join_494;
    }
    spill657_1 = ((net.minecraft.entity.EntityLivingBase)(this)).j__Boolean();
    if (!((life5_5 != 0))) {
        forestValue657_30_0 = ((spill657_1) ? 1 : 0);
        break forest_join_30;
    }
    if (!(spill657_1)) {
        break forest_join_28;
    }
    spill657_2 = this;
    if (!((life5_5 != 0))) {
        forestValue657_375_0 = spill657_2;
        break forest_join_375;
    }
    if (!((((spill657_2 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forest_join_374;
    }
    spill657_3 = ((net.minecraft.entity.player.EntityPlayer)(this));
    if (!((life5_5 != 0))) {
        forestValue657_375_0 = spill657_3;
        break forest_join_375;
    }
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill657_3)).b1)).b)) {
        break forest_join_374;
    }
    }
    forestValue657_30_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).l__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue657_37_0 = forestValue657_30_0;
        break forest_join_37;
    }
    if (!((forestValue657_30_0 != 0))) {
        break forest_join_45;
    }
    spill657_4 = this;
    if (!((life5_5 != 0))) {
        forestValue657_307_0 = spill657_4;
        break forest_join_307;
    }
    forestValue657_37_0 = ((spill657_4 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((forestValue657_37_0 != 0))) {
        break forest_join_306;
    }
    spill657_5 = ((net.minecraft.entity.player.EntityPlayer)(this));
    if (!((life5_5 != 0))) {
        forestValue657_307_0 = spill657_5;
        break forest_join_307;
    }
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill657_5)).b1)).b)) {
        break forest_join_306;
    }
    }
    life6_59 = 0x1.d1eb86p-1f;
    spill657_6 = this;
    if (!((life5_5 != 0))) {
        forestValue657_53_0 = spill657_6;
        break forest_join_53;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill657_6)).A)) {
        break forest_join_75;
    }
    forestValue657_53_0 = this;
    }
    life6_59 = (((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(forestValue657_53_0)).i)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(this.n))), (moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this)).b())).c))) - 1), moom.Dr.b__Int(((double)(this.p))))))))).a__ch())).L * 0x1.d1eb86p-1f);
    }
    life7_97 = (0x1.4d5b12p-3f / ((life6_59 * life6_59) * life6_59));
    spill657_7 = this;
    if (!((life5_5 != 0))) {
        forestValue657_96_0 = spill657_7;
        break forest_join_96;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill657_7)).A)) {
        break forest_join_95;
    }
    life8_108 = (((net.minecraft.entity.EntityLivingBase)(this)).i__sourceReturn_bc607678b6() * life7_97);
    if (!((life5_5 == 0))) {
        break forest_join_98;
    }
    }
    forestValue657_96_0 = this;
    }
    life8_108 = ((net.minecraft.entity.EntityLivingBase)(forestValue657_96_0)).a6;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((float)(p0)), ((float)(p1)), ((float)(life8_108)));
    life6_121 = 0x1.d1eb86p-1f;
    spill657_8 = this.A;
    if (!((life5_5 != 0))) {
        forestValue657_135_0 = ((spill657_8) ? 1 : 0);
        break forest_join_135;
    }
    if (!(spill657_8)) {
        break forest_join_133;
    }
    life6_121 = (((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(new moom.DT(moom.Dr.b__Int(((double)(this.n))), (moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this)).b())).c))) - 1), moom.Dr.b__Int(((double)(this.p))))))))).a__ch())).L * 0x1.d1eb86p-1f);
    }
    forestValue657_135_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).I__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue657_211_0 = forestValue657_135_0;
        break forest_join_211;
    }
    if (!((forestValue657_135_0 != 0))) {
        break forest_join_201;
    }
    life9_158 = 0x1.333334p-3f;
    this.t = ((double)(moom.Dr.a(((double)(this.t)), ((double)(((double) (-life9_158)))), ((double)(((double) life9_158))))));
    this.v = ((double)(moom.Dr.a(((double)(this.v)), ((double)(((double) (-life9_158)))), ((double)(((double) life9_158))))));
    this.L = ((float)(0x0.0p0f));
    spill657_9 = recovery.source.CarrierOps.dcmpg(((double)(this.u)), ((double)(-0x1.3333333333333p-3d)));
    if (!((life5_5 != 0))) {
        forestValue657_175_0 = spill657_9;
        break forest_join_175;
    }
    if (!((spill657_9 < 0))) {
        break forest_join_173;
    }
    this.u = ((double)(-0x1.3333333333333p-3d));
    }
    forestValue657_175_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).t__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue657_180_0 = forestValue657_175_0;
        break forest_join_180;
    }
    if (!((forestValue657_175_0 != 0))) {
        break forest_join_185;
    }
    forestValue657_180_0 = ((this instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue657_184_0 = forestValue657_180_0;
        break forest_join_184;
    }
    if (!((forestValue657_180_0 != 0))) {
        break forest_join_185;
    }
    forestValue657_184_0 = 1;
    }
    forestValue657_186_0 = forestValue657_184_0;
    break forest_join_186;
    }
    forestValue657_186_0 = 0;
    }
    life10_210 = forestValue657_186_0;
    spill657_10 = life10_210;
    if (!((life5_5 != 0))) {
        forestValue657_211_0 = spill657_10;
        break forest_join_211;
    }
    if (!((spill657_10 != 0))) {
        break forest_join_201;
    }
    spill657_11 = recovery.source.CarrierOps.dcmpg(((double)(this.u)), ((double)(0x0.0p0d)));
    if (!((life5_5 != 0))) {
        forestValue657_211_0 = spill657_11;
        break forest_join_211;
    }
    if (!((spill657_11 < 0))) {
        break forest_join_201;
    }
    this.u = ((double)(0x0.0p0d));
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    forestValue657_211_0 = ((this.B) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue657_227_0 = forestValue657_211_0;
        break forest_join_227;
    }
    if (!((forestValue657_211_0 != 0))) {
        break forest_join_222;
    }
    spill657_12 = ((net.minecraft.entity.EntityLivingBase)(this)).I__Boolean();
    if (!((life5_5 != 0))) {
        forestValue657_227_0 = ((spill657_12) ? 1 : 0);
        break forest_join_227;
    }
    if (!(spill657_12)) {
        break forest_join_222;
    }
    this.u = ((double)(0x1.999999999999ap-3d));
    }
    spill657_13 = this;
    if (!((life5_5 != 0))) {
        forestValue657_279_0 = spill657_13;
        break forest_join_279;
    }
    forestValue657_227_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill657_13)).i)).G) ? 1 : 0);
    }
    if (!((forestValue657_227_0 != 0))) {
        break forest_join_278;
    }
    spill657_14 = ((net.minecraft.world.World)(this.i)).c__Boolean(((moom.DT)(new moom.DT(((int) this.n), 0, ((int) this.p)))));
    if (!((life5_5 != 0))) {
        forestValue657_267_0 = ((spill657_14) ? 1 : 0);
        break forest_join_267;
    }
    if (!(spill657_14)) {
        break forest_join_261;
    }
    spill657_15 = this;
    if (!((life5_5 != 0))) {
        forestValue657_279_0 = spill657_15;
        break forest_join_279;
    }
    if (!((!((net.minecraft.world.chunk.Chunk)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill657_15)).i)).a__Fk(((moom.DT)(new moom.DT(((int) this.n), 0, ((int) this.p))))))).c__Boolean()))) {
        break forest_join_278;
    }
    }
    spill657_16 = this;
    if (!((life5_5 != 0))) {
        forestValue657_274_0 = spill657_16;
        break forest_join_274;
    }
    forestValue657_267_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(spill657_16)).o)), ((double)(0x0.0p0d)));
    }
    if (!((forestValue657_267_0 > 0))) {
        break forest_join_273;
    }
    this.u = ((double)(-0x1.999999999999ap-4d));
    if (!((life5_5 == 0))) {
        break forest_join_284;
    }
    }
    forestValue657_274_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forestValue657_274_0)).u = ((double)(0x0.0p0d));
    if (!((life5_5 == 0))) {
        break forest_join_284;
    }
    }
    forestValue657_279_0 = this;
    }
    net.minecraft.entity.EntityLivingBase __stackOp657_88_0 = forestValue657_279_0;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_88_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_88_0)).u - 0x1.47ae147ae147bp-4d)));
    }
    net.minecraft.entity.EntityLivingBase __stackOp657_91_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_91_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_91_0)).u * 0x1.f5c29p-1d)));
    net.minecraft.entity.EntityLivingBase __stackOp657_94_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_94_0)).t = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_94_0)).t * ((double) life6_121))));
    net.minecraft.entity.EntityLivingBase __stackOp657_97_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_97_0)).v = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_97_0)).v * ((double) life6_121))));
    if (!((life5_5 == 0))) {
        break forest_join_494;
    }
    }
    forestValue657_307_0 = this;
    }
    life6_351 = ((net.minecraft.entity.EntityLivingBase)(forestValue657_307_0)).o;
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((float)(p0)), ((float)(p1)), ((float)(0x1.47ae14p-6f)));
    ((net.minecraft.entity.EntityLivingBase)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    net.minecraft.entity.EntityLivingBase __stackOp657_106_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_106_0)).t = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_106_0)).t * 0x1.0p-1d)));
    net.minecraft.entity.EntityLivingBase __stackOp657_109_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_109_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_109_0)).u * 0x1.0p-1d)));
    net.minecraft.entity.EntityLivingBase __stackOp657_112_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_112_0)).v = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_112_0)).v * 0x1.0p-1d)));
    net.minecraft.entity.EntityLivingBase __stackOp657_115_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_115_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_115_0)).u - 0x1.47ae147ae147bp-6d)));
    spill657_17 = this.B;
    if (!((life5_5 != 0))) {
        forestValue657_368_0 = ((spill657_17) ? 1 : 0);
        break forest_join_368;
    }
    if (!(spill657_17)) {
        break forest_join_372;
    }
    spill657_18 = this;
    spill657_19 = this.t;
    if (!((life5_5 != 0))) {
        forestValue657_371_0 = spill657_18;
        forestValue657_371_1 = spill657_19;
        break forest_join_371;
    }
    forestValue657_368_0 = ((((net.minecraft.entity.EntityLivingBase)(spill657_18)).a__Boolean(((double)(spill657_19)), ((double)((((this.u + 0x1.333334p-1d) - this.o) + life6_351))), ((double)(this.v)))) ? 1 : 0);
    }
    if (!((forestValue657_368_0 != 0))) {
        break forest_join_372;
    }
    forestValue657_371_0 = this;
    forestValue657_371_1 = 0x1.333334p-2d;
    }
    ((net.minecraft.entity.EntityLivingBase)(forestValue657_371_0)).u = ((double)(forestValue657_371_1));
    }
    if (!((life5_5 == 0))) {
        break forest_join_494;
    }
    }
    forestValue657_375_0 = this;
    }
    life6_424 = ((net.minecraft.entity.EntityLivingBase)(forestValue657_375_0)).o;
    life8_426 = 0x1.99999ap-1f;
    life9_428 = 0x1.47ae14p-6f;
    life10_432 = ((float) moom.rV.b(((net.minecraft.entity.Entity)(this))));
    spill657_20 = recovery.source.CarrierOps.fcmpl(((float)(life10_432)), ((float)(0x1.8p1f)));
    if (!((life5_5 != 0))) {
        forestValue657_395_0 = spill657_20;
        break forest_join_395;
    }
    if (!((spill657_20 > 0))) {
        break forest_join_393;
    }
    life10_432 = 0x1.8p1f;
    }
    forestValue657_395_0 = ((this.A) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue657_405_0 = forestValue657_395_0;
        break forest_join_405;
    }
    if (!((forestValue657_395_0 == 0))) {
        break forest_join_402;
    }
    life10_432 = (life10_432 * 0x1.0p-1f);
    }
    forestValue657_405_0 = recovery.source.CarrierOps.fcmpl(((float)(life10_432)), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 != 0))) {
        forestValue657_472_0 = forestValue657_405_0;
        break forest_join_472;
    }
    if (!((forestValue657_405_0 > 0))) {
        break forest_join_429;
    }
    life8_426 = (life8_426 + (((0x1.178d52p-1f - life8_426) * life10_432) / 0x1.8p1f));
    life9_428 = (life9_428 + (((((net.minecraft.entity.EntityLivingBase)(this)).i__sourceReturn_bc607678b6() - life9_428) * life10_432) / 0x1.8p1f));
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((float)(p0)), ((float)(p1)), ((float)(life9_428)));
    ((net.minecraft.entity.EntityLivingBase)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    net.minecraft.entity.EntityLivingBase __stackOp657_139_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_139_0)).t = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_139_0)).t * ((double) life8_426))));
    net.minecraft.entity.EntityLivingBase __stackOp657_142_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_142_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_142_0)).u * 0x1.99999ap-1d)));
    net.minecraft.entity.EntityLivingBase __stackOp657_145_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_145_0)).v = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_145_0)).v * ((double) life8_426))));
    net.minecraft.entity.EntityLivingBase __stackOp657_148_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_148_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_148_0)).u - 0x1.47ae147ae147bp-6d)));
    spill657_21 = this;
    if (!((life5_5 != 0))) {
        forestValue657_505_0 = spill657_21;
        break forest_join_505;
    }
    forestValue657_472_0 = ((((net.minecraft.entity.EntityLivingBase)(spill657_21)).B) ? 1 : 0);
    }
    if (!((forestValue657_472_0 != 0))) {
        break forest_join_494;
    }
    spill657_22 = this;
    spill657_23 = this;
    if (!((life5_5 != 0))) {
        forestValue657_496_0 = spill657_22;
        forestValue657_496_1 = spill657_23;
        break forest_join_496;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill657_22)).a__Boolean(((double)(((net.minecraft.entity.EntityLivingBase)(spill657_23)).t)), ((double)((((this.u + 0x1.333334p-1d) - this.o) + life6_424))), ((double)(this.v))))) {
        break forest_join_494;
    }
    this.u = ((double)(0x1.333334p-2d));
    }
    forestValue657_496_0 = this;
    forestValue657_496_1 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forestValue657_496_0)).aU = ((float)(((net.minecraft.entity.EntityLivingBase)(forestValue657_496_1)).aV));
    forestValue657_499_0 = this;
    }
    life6_424 = (((net.minecraft.entity.EntityLivingBase)(forestValue657_499_0)).n - this.k);
    forestValue657_505_0 = this;
    }
    life8_564 = (((net.minecraft.entity.EntityLivingBase)(forestValue657_505_0)).p - this.m);
    life10_575 = (moom.Dr.a__Float(((double)(((life6_424 * life6_424) + (life8_564 * life8_564))))) * 0x1.0p2f);
    if (!((life5_5 != 0))) {
        break forest_join_547;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life10_575)), ((float)(0x1.0p0f))) > 0))) {
        break forest_join_529;
    }
    life10_575 = 0x1.0p0f;
    }
    net.minecraft.entity.EntityLivingBase __stackOp657_167_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_167_0)).aV = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_167_0)).aV + ((life10_575 - this.aV) * 0x1.99999ap-2f))));
    net.minecraft.entity.EntityLivingBase __stackOp657_171_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp657_171_0)).aW = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp657_171_0)).aW + this.aV)));
    }
    return;
}


private static moom.Oo e(moom.Oo p0) {
return p0;
}


protected void x() {
int forwardValue4979_23_0;
    net.minecraft.entity.DataWatcher forwardValue4979_39_0;
    int forwardValue4979_39_1;
    int forwardValue4979_39_2;
    net.minecraft.entity.DataWatcher forwardValue4979_40_0;
    int forwardValue4979_40_1;
    net.minecraft.entity.DataWatcher forwardValue4979_41_0;
    int forwardValue4979_41_1;
    int forwardValue4979_41_2;
    boolean spill4979_0;
    net.minecraft.entity.DataWatcher spill4979_1;
    int spill4979_2;
    boolean spill4979_3;
    long life1_3;
    int life3_5;
    int life4_32;
    forward_join_60: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 41445917881974L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4979_0 = ((java.util.Map)(this.aJ)).isEmpty();
    if (!((life3_5 != 0))) {
        forwardValue4979_23_0 = ((spill4979_0) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill4979_0)) {
        break forward_join_19;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).y__sourceReturn_da8c82d5d4();
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((boolean)(false)));
    if (!((life3_5 == 0))) {
        break forward_join_60;
    }
    }
    forwardValue4979_23_0 = moom.A6.a(((java.util.Collection)(((java.util.Map)(this.aJ)).values())));
    }
    life4_32 = forwardValue4979_23_0;
    spill4979_1 = this.al;
    spill4979_2 = __sourceIntrinsic_1ae1eecf7172_invokedynamic4979_11(12458, (1883327262942673003L ^ life1_3));
    spill4979_3 = moom.A6.a__Boolean(((java.util.Collection)(((java.util.Map)(this.aJ)).values())));
    if (!((life3_5 != 0))) {
        forwardValue4979_39_0 = spill4979_1;
        forwardValue4979_39_1 = spill4979_2;
        forwardValue4979_39_2 = ((spill4979_3) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill4979_3)) {
        forwardValue4979_40_0 = spill4979_1;
        forwardValue4979_40_1 = spill4979_2;
        break forward_join_40;
    }
    forwardValue4979_39_0 = spill4979_1;
    forwardValue4979_39_1 = spill4979_2;
    forwardValue4979_39_2 = 1;
    }
    forwardValue4979_41_0 = forwardValue4979_39_0;
    forwardValue4979_41_1 = forwardValue4979_39_1;
    forwardValue4979_41_2 = forwardValue4979_39_2;
    break forward_join_41;
    }
    forwardValue4979_41_0 = forwardValue4979_40_0;
    forwardValue4979_41_1 = forwardValue4979_40_1;
    forwardValue4979_41_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue4979_41_0)).b(((int)(forwardValue4979_41_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue4979_41_2)))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_1ae1eecf7172_invokedynamic4979_19(28428, (3454833174581372878L ^ life1_3)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life4_32))))));
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((boolean)(((net.minecraft.entity.EntityLivingBase)(this)).b__Boolean(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.q)).I))))));
    }
    return;
}


public void s__Void() {
super.s__Void();
    this.ba = ((float)(this.bb));
    this.bb = ((float)(0x0.0p0f));
    this.L = ((float)(0x0.0p0f));
    return;
}


protected java.lang.String c__String() {
return "game.neutral.hurt";
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.EntityLivingBase)(this)).f(((net.minecraft.entity.Entity)(p0)));
    return ((0) != 0);
}


public void c__Void() {
((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.j)), ((float)(0x1.fffffep127f)));
    return;
}


public void c(boolean p0) {
net.minecraft.entity.ai.attributes.IAttributeInstance forwardValue4962_20_0;
    int spill4962_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill4962_1;
    long life2_3;
    net.minecraft.entity.ai.attributes.IAttributeInstance life5_11;
    int life4_12;
    forward_join_27: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 30141072096158L);
    spill4962_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    super.c(((boolean)(p0)));
    life5_11 = ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    life4_12 = spill4962_0;
    spill4962_1 = life5_11;
    if (!((life4_12 == 0))) {
        forwardValue4962_20_0 = spill4962_1;
        break forward_join_20;
    }
    if (!((((net.minecraft.entity.ai.attributes.IAttributeInstance)(spill4962_1)).a(((java.util.UUID)(net.minecraft.entity.EntityLivingBase.aF))) != null))) {
        break forward_join_22;
    }
    forwardValue4962_20_0 = life5_11;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(forwardValue4962_20_0)).b(((moom.vB)(net.minecraft.entity.EntityLivingBase.aG)));
    }
    if (!(p0)) {
        break forward_join_27;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life5_11)).a(((moom.vB)(net.minecraft.entity.EntityLivingBase.aG)));
    }
    return;
}


public net.minecraft.entity.EntityLivingBase c__sG() {
net.minecraft.entity.EntityLivingBase forwardValue4963_17_0;
    net.minecraft.entity.EntityLivingBase forwardValue4963_26_0;
    net.minecraft.entity.EntityLivingBase forwardValue4963_31_0;
    net.minecraft.entity.EntityLivingBase forwardValue4963_33_0;
    net.minecraft.entity.EntityLivingBase spill4963_0;
    net.minecraft.entity.player.EntityPlayer spill4963_1;
    long life1_3;
    int life3_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_26: {
    forward_join_24: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 65184388691757L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4963_0 = ((net.minecraft.util.CombatTracker)(this.aI)).a__sG();
    if (!((life3_5 != 0))) {
        forwardValue4963_17_0 = spill4963_0;
        break forward_join_17;
    }
    if (!((spill4963_0 != null))) {
        break forward_join_16;
    }
    forwardValue4963_33_0 = ((net.minecraft.util.CombatTracker)(this.aI)).a__sG();
    break forward_join_33;
    }
    forwardValue4963_17_0 = this;
    }
    spill4963_1 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4963_17_0)).a7;
    if (!((life3_5 != 0))) {
        forwardValue4963_26_0 = spill4963_1;
        break forward_join_26;
    }
    if (!((spill4963_1 != null))) {
        break forward_join_24;
    }
    forwardValue4963_33_0 = this.a7;
    break forward_join_33;
    }
    forwardValue4963_26_0 = this.bt;
    }
    if (!((life3_5 != 0))) {
        forwardValue4963_31_0 = forwardValue4963_26_0;
        break forward_join_31;
    }
    if (!((forwardValue4963_26_0 != null))) {
        break forward_join_32;
    }
    forwardValue4963_31_0 = this.bt;
    }
    forwardValue4963_33_0 = forwardValue4963_31_0;
    break forward_join_33;
    }
    forwardValue4963_33_0 = null;
    }
    return forwardValue4963_33_0;
}


public void c(float p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 11018469362459L);
    float local4 = ((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6();
    if ((local4 > 0x0.0p0f)) {
        ((net.minecraft.entity.EntityLivingBase)(this)).d(((float)((local4 + p0))));
    }
    return;
}


protected void c(net.minecraft.potion.PotionEffect p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 111267050517378L);
    this.bs = ((boolean)(true));
    if ((((((net.minecraft.world.World)(this.i)).G) ? 1 : 0) == 0)) {
        ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(p0)).a()])).a(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())), ((int)(((net.minecraft.potion.PotionEffect)(p0)).c())));
    }
    return;
}


public boolean c__Boolean() {
return ((0) != 0);
}


public int c__sourceReturn_8abf5c6871() {
return this.a_;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.world.World forestValue25_29_0;
    int forestValue25_52_0;
    int forestValue25_104_0;
    net.minecraft.nbt.NBTTagCompound forestValue25_114_0;
    java.lang.String forestValue25_114_1;
    net.minecraft.nbt.NBTBase forestValue25_127_0;
    int forestValue25_142_0;
    int forestValue25_142_1;
    int spill25_0;
    boolean spill25_1;
    net.minecraft.world.World spill25_2;
    boolean spill25_3;
    net.minecraft.nbt.NBTTagCompound spill25_4;
    java.lang.String spill25_5;
    net.minecraft.nbt.NBTBase spill25_6;
    byte spill25_7;
    int spill25_8;
    long life2_3;
    int life4_10;
    net.minecraft.nbt.NBTBase life5_79;
    int life6_81;
    net.minecraft.nbt.NBTTagCompound life7_91;
    net.minecraft.potion.PotionEffect life8_94;
    forest_join_149: {
    forest_join_142: {
    forest_join_139: {
    forest_join_127: {
    forest_join_126: {
    forest_join_116: {
    forest_join_114: {
    forest_join_112: {
    forest_join_104: {
    forest_join_94: {
    forest_join_52: {
    forest_join_44: {
    forest_join_29: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 38259976771328L);
    spill25_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    ((net.minecraft.entity.EntityLivingBase)(this)).g(((float)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("AbsorptionAmount"))))));
    life4_10 = spill25_0;
    spill25_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Attributes")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic25_4(16734, (3504805142014372089L ^ life2_3)))));
    if (!((life4_10 != 0))) {
        forestValue25_52_0 = ((spill25_1) ? 1 : 0);
        break forest_join_52;
    }
    if (!(spill25_1)) {
        break forest_join_44;
    }
    spill25_2 = this.i;
    if (!((life4_10 != 0))) {
        forestValue25_29_0 = spill25_2;
        break forest_join_29;
    }
    if (!((spill25_2 != null))) {
        break forest_join_44;
    }
    forestValue25_29_0 = this.i;
    }
    spill25_3 = ((net.minecraft.world.World)(forestValue25_29_0)).G;
    if (!((life4_10 != 0))) {
        forestValue25_52_0 = ((spill25_3) ? 1 : 0);
        break forest_join_52;
    }
    if (!((!spill25_3))) {
        break forest_join_44;
    }
    net.minecraft.entity.SharedMonsterAttributes.a(((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())), ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Attributes")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic25_12(5103, (4710278759016036950L ^ life2_3))))))));
    }
    forestValue25_52_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ActiveEffects")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic25_15(16734, (3504805142014372089L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_10 != 0))) {
        forestValue25_104_0 = forestValue25_52_0;
        break forest_join_104;
    }
    if (!((forestValue25_52_0 != 0))) {
        break forest_join_94;
    }
    life5_79 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ActiveEffects")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic25_18(5103, (4710278759016036950L ^ life2_3)))));
    life6_81 = 0;
    forest_cycle_66: while (true) {
    forest_join_92: {
    forest_join_91: {
    if (!((life6_81 < ((net.minecraft.nbt.NBTTagList)(life5_79)).a__Int()))) {
        break forest_join_94;
    }
    life7_91 = ((net.minecraft.nbt.NBTTagList)(life5_79)).a__yw(((int)(life6_81)));
    life8_94 = __sourceExactCall_803aa5ff879b12(((net.minecraft.nbt.NBTTagCompound)(life7_91)));
    if (!((life4_10 != 0))) {
        break forest_join_116;
    }
    if (!((life4_10 != 0))) {
        break forest_join_92;
    }
    if (!((life8_94 != null))) {
        break forest_join_91;
    }
    ((java.util.Map)(this.aJ)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.PotionEffect)(life8_94)).a()))))), ((java.lang.Object)(life8_94)));
    }
    life6_81 += 1;
    }
    if (!((life4_10 == 0))) {
        continue forest_cycle_66;
    }
    break forest_cycle_66;
    }
    }
    spill25_4 = p0;
    spill25_5 = "HealF";
    if (!((life4_10 != 0))) {
        forestValue25_114_0 = spill25_4;
        forestValue25_114_1 = spill25_5;
        break forest_join_114;
    }
    forestValue25_104_0 = ((((net.minecraft.nbt.NBTTagCompound)(spill25_4)).a__Boolean(((java.lang.String)(spill25_5)), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic25_27(29156, (6769664993610274906L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forestValue25_104_0 != 0))) {
        break forest_join_112;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((float)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("HealF"))))));
    if (!((life4_10 == 0))) {
        break forest_join_149;
    }
    }
    forestValue25_114_0 = p0;
    forestValue25_114_1 = "Health";
    }
    life5_79 = ((net.minecraft.nbt.NBTTagCompound)(forestValue25_114_0)).a__yn(((java.lang.String)(forestValue25_114_1)));
    }
    spill25_6 = life5_79;
    if (!((life4_10 != 0))) {
        forestValue25_127_0 = spill25_6;
        break forest_join_127;
    }
    if (!((spill25_6 == null))) {
        break forest_join_126;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((float)(((net.minecraft.entity.EntityLivingBase)(this)).a())));
    if (!((life4_10 == 0))) {
        break forest_join_149;
    }
    }
    forestValue25_127_0 = life5_79;
    }
    spill25_7 = ((net.minecraft.nbt.NBTBase)(forestValue25_127_0)).a();
    spill25_8 = 5;
    if (!((life4_10 != 0))) {
        forestValue25_142_0 = ((int)(spill25_7));
        forestValue25_142_1 = spill25_8;
        break forest_join_142;
    }
    if (!((spill25_7 == spill25_8))) {
        break forest_join_139;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((float)(((moom.yr)(((moom.yr)(life5_79)))).a__Float())));
    if (!((life4_10 == 0))) {
        break forest_join_149;
    }
    }
    forestValue25_142_0 = ((int)(((net.minecraft.nbt.NBTBase)(life5_79)).a()));
    forestValue25_142_1 = 2;
    }
    if (!((forestValue25_142_0 == forestValue25_142_1))) {
        break forest_join_149;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((float)(((float) ((moom.yu)(((moom.yu)(life5_79)))).a__Short()))));
    }
    this.aO = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("HurtTime")))));
    this.aR = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("DeathTime")))));
    this.bu = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("HurtByTimestamp")))));
    return;
}


public boolean n__Boolean() {
int forwardValue4975_12_0;
    int forwardValue4975_14_0;
    boolean spill4975_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 132304282782831L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4975_0 = this.F;
    if (!((life3_5 != 0))) {
        forwardValue4975_12_0 = ((spill4975_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill4975_0))) {
        break forward_join_13;
    }
    forwardValue4975_12_0 = 1;
    }
    forwardValue4975_14_0 = forwardValue4975_12_0;
    break forward_join_14;
    }
    forwardValue4975_14_0 = 0;
    }
    return ((forwardValue4975_14_0) != 0);
}


protected void h(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.Entity)(p0)).a__Void(((net.minecraft.entity.Entity)(this)));
    return;
}


protected float h__sourceReturn_bc607678b6() {
return net.minecraft.entity.EntityLivingBase.aE;
}


public void h(int p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 66063472778211L);
    java.lang.Object local4 = ((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.aJ)).remove(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    if ((local4 != null)) {
        ((net.minecraft.entity.EntityLivingBase)(this)).c(((net.minecraft.potion.PotionEffect)(local4)));
    }
    return;
}


public void h(boolean p0) {
this.bi = ((boolean)(p0));
    return;
}


public void h__Void() {
int lexicalValue1543_38_0;
    int lexicalValue1543_86_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1543_94_0;
    int lexicalValue1543_96_0;
    int lexicalValue1543_103_0;
    int lexicalValue1543_107_0;
    int lexicalValue1543_109_0;
    int lexicalValue1543_229_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1543_249_0;
    int lexicalValue1543_257_0;
    int lexicalValue1543_273_0;
    int lexicalValue1543_284_0;
    int lexicalValue1543_302_0;
    int lexicalValue1543_311_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1543_321_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1543_339_0;
    int lexicalValue1543_360_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1543_392_0;
    int spill1543_0;
    boolean spill1543_1;
    boolean spill1543_2;
    boolean spill1543_3;
    int spill1543_4;
    net.minecraft.entity.EntityLivingBase spill1543_5;
    boolean spill1543_6;
    boolean spill1543_7;
    net.minecraft.entity.EntityLivingBase spill1543_8;
    boolean spill1543_9;
    boolean spill1543_10;
    int spill1543_11;
    int spill1543_12;
    boolean spill1543_13;
    int spill1543_14;
    boolean spill1543_15;
    int spill1543_16;
    net.minecraft.entity.EntityLivingBase spill1543_17;
    net.minecraft.entity.EntityLivingBase spill1543_18;
    net.minecraft.entity.EntityLivingBase spill1543_19;
    boolean spill1543_20;
    net.minecraft.entity.EntityLivingBase spill1543_21;
    long life1_3;
    int life3_16;
    int life4_19;
    double life5_84;
    int life5_157;
    int life6_238;
    float life7_253;
    float life8_261;
    float life9_269;
    lexical_join_392: {
    lexical_join_369: {
    lexical_join_360: {
    lexical_join_353: {
    lexical_join_339: {
    lexical_join_337: {
    lexical_join_323: {
    lexical_join_321: {
    lexical_join_320: {
    lexical_join_311: {
    lexical_join_307: {
    lexical_join_302: {
    lexical_join_298: {
    lexical_join_284: {
    lexical_join_282: {
    lexical_join_273: {
    lexical_join_267: {
    lexical_join_257: {
    lexical_join_255: {
    lexical_join_249: {
    lexical_join_248: {
    lexical_join_229: {
    lexical_join_226: {
    lexical_join_221: {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_103: {
    lexical_join_96: {
    lexical_join_95: {
    lexical_join_94: {
    lexical_join_93: {
    lexical_join_86: {
    lexical_join_82: {
    lexical_join_38: {
    lexical_join_37: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 23048803081458L);
    this.aS = ((float)(this.aT));
    super.h__Void();
    spill1543_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("livingEntityBaseTick")));
    life3_16 = spill1543_0;
    life4_19 = ((this instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    spill1543_1 = ((net.minecraft.entity.EntityLivingBase)(this)).p__Boolean();
    if (!((life3_16 != 0))) {
        lexicalValue1543_86_0 = ((spill1543_1) ? 1 : 0);
        break lexical_join_86;
    }
    if (!(spill1543_1)) {
        break lexical_join_82;
    }
    spill1543_2 = ((net.minecraft.entity.EntityLivingBase)(this)).q__Boolean();
    if (!((life3_16 != 0))) {
        lexicalValue1543_38_0 = ((spill1543_2) ? 1 : 0);
        break lexical_join_38;
    }
    if (!(spill1543_2)) {
        break lexical_join_37;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.e)), ((float)(0x1.0p0f)));
    if (!((life3_16 == 0))) {
        break lexical_join_82;
    }
    }
    lexicalValue1543_38_0 = life4_19;
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_86_0 = lexicalValue1543_38_0;
        break lexical_join_86;
    }
    if (!((lexicalValue1543_38_0 != 0))) {
        break lexical_join_82;
    }
    spill1543_3 = ((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.World)(this.i)).a__Fi())).a(((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this)).b())));
    if (!((life3_16 != 0))) {
        lexicalValue1543_86_0 = ((spill1543_3) ? 1 : 0);
        break lexical_join_86;
    }
    if (!((!spill1543_3))) {
        break lexical_join_82;
    }
    life5_84 = (((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.World)(this.i)).a__Fi())).a(((net.minecraft.entity.Entity)(this))) + ((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.World)(this.i)).a__Fi())).i());
    spill1543_4 = recovery.source.CarrierOps.dcmpg(((double)(life5_84)), ((double)(0x0.0p0d)));
    if (!((life3_16 != 0))) {
        lexicalValue1543_86_0 = spill1543_4;
        break lexical_join_86;
    }
    if (!((spill1543_4 < 0))) {
        break lexical_join_82;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.e)), ((float)(((float) java.lang.Math.max(((int)(1)), ((int)(moom.Dr.b__Int(((double)(((-life5_84) * ((net.minecraft.world.border.WorldBorder)(((net.minecraft.world.World)(this.i)).a__Fi())).j())))))))))));
    }
    spill1543_5 = this;
    if (!((life3_16 != 0))) {
        lexicalValue1543_94_0 = spill1543_5;
        break lexical_join_94;
    }
    lexicalValue1543_86_0 = ((((net.minecraft.entity.EntityLivingBase)(spill1543_5)).h__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1543_86_0 == 0))) {
        break lexical_join_93;
    }
    spill1543_6 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_16 != 0))) {
        lexicalValue1543_96_0 = ((spill1543_6) ? 1 : 0);
        break lexical_join_96;
    }
    if (!(spill1543_6)) {
        break lexical_join_95;
    }
    }
    lexicalValue1543_94_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1543_94_0)).j();
    }
    lexicalValue1543_96_0 = life4_19;
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_103_0 = lexicalValue1543_96_0;
        break lexical_join_103;
    }
    if (!((lexicalValue1543_96_0 != 0))) {
        break lexical_join_108;
    }
    lexicalValue1543_103_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(this)))).b1)).a) ? 1 : 0);
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_107_0 = lexicalValue1543_103_0;
        break lexical_join_107;
    }
    if (!((lexicalValue1543_103_0 != 0))) {
        break lexical_join_108;
    }
    lexicalValue1543_107_0 = 1;
    }
    lexicalValue1543_109_0 = lexicalValue1543_107_0;
    break lexical_join_109;
    }
    lexicalValue1543_109_0 = 0;
    }
    life5_157 = lexicalValue1543_109_0;
    spill1543_7 = ((net.minecraft.entity.EntityLivingBase)(this)).p__Boolean();
    if (!((life3_16 != 0))) {
        lexicalValue1543_257_0 = ((spill1543_7) ? 1 : 0);
        break lexical_join_257;
    }
    if (!(spill1543_7)) {
        break lexical_join_255;
    }
    spill1543_8 = this;
    if (!((life3_16 != 0))) {
        lexicalValue1543_249_0 = spill1543_8;
        break lexical_join_249;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill1543_8)).a(((moom.fn)(moom.fn.h))))) {
        break lexical_join_248;
    }
    spill1543_9 = ((net.minecraft.entity.EntityLivingBase)(this)).b__Boolean();
    if (!((life3_16 != 0))) {
        lexicalValue1543_229_0 = ((spill1543_9) ? 1 : 0);
        break lexical_join_229;
    }
    if (!((!spill1543_9))) {
        break lexical_join_226;
    }
    spill1543_10 = ((net.minecraft.entity.EntityLivingBase)(this)).b__Boolean(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.p)).I)));
    if (!((life3_16 != 0))) {
        lexicalValue1543_229_0 = ((spill1543_10) ? 1 : 0);
        break lexical_join_229;
    }
    if (!((!spill1543_10))) {
        break lexical_join_226;
    }
    spill1543_11 = life5_157;
    if (!((life3_16 != 0))) {
        lexicalValue1543_229_0 = spill1543_11;
        break lexical_join_229;
    }
    if (!((spill1543_11 == 0))) {
        break lexical_join_226;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((int)(((net.minecraft.entity.EntityLivingBase)(this)).a__sourceReturn_0f7a48eca2(((int)(((net.minecraft.entity.EntityLivingBase)(this)).h()))))));
    spill1543_12 = ((net.minecraft.entity.EntityLivingBase)(this)).h();
    if (!((life3_16 != 0))) {
        lexicalValue1543_229_0 = spill1543_12;
        break lexical_join_229;
    }
    if (!((spill1543_12 == __sourceIntrinsic_455b93f512d4_invokedynamic1543_58(27363, (1107985397086603433L ^ life1_3))))) {
        break lexical_join_226;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((int)(0)));
    life6_238 = 0;
    lexical_cycle_158: while (true) {
    if (!((life6_238 < __sourceIntrinsic_455b93f512d4_invokedynamic1543_60(12458, (1883311055507002095L ^ life1_3))))) {
        break lexical_join_221;
    }
    life7_253 = (((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat());
    life8_261 = (((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat());
    life9_269 = (((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat());
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)((this.n + ((double) life7_253)))), ((double)((this.o + ((double) life8_261)))), ((double)((this.p + ((double) life9_269)))), ((double)(this.t)), ((double)(this.u)), ((double)(this.v)), ((int[])(new int[0])));
    life6_238 += 1;
    if (!((life3_16 != 0))) {
        break lexical_join_226;
    }
    if (!((life3_16 == 0))) { continue lexical_cycle_158; }
    break lexical_cycle_158;
    }
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.f)), ((float)(0x1.0p1f)));
    }
    lexicalValue1543_229_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_257_0 = lexicalValue1543_229_0;
        break lexical_join_257;
    }
    if (!((lexicalValue1543_229_0 == 0))) {
        break lexical_join_255;
    }
    spill1543_13 = ((net.minecraft.entity.EntityLivingBase)(this)).s__Boolean();
    if (!((life3_16 != 0))) {
        lexicalValue1543_257_0 = ((spill1543_13) ? 1 : 0);
        break lexical_join_257;
    }
    if (!(spill1543_13)) {
        break lexical_join_255;
    }
    spill1543_14 = ((this.g instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life3_16 != 0))) {
        lexicalValue1543_257_0 = spill1543_14;
        break lexical_join_257;
    }
    if (!((spill1543_14 != 0))) {
        break lexical_join_255;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).b(((net.minecraft.entity.Entity)(null)));
    if (!((life3_16 == 0))) {
        break lexical_join_255;
    }
    }
    lexicalValue1543_249_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1543_249_0)).d(((int)(__sourceIntrinsic_455b93f512d4_invokedynamic1543_92(11147, (1226986873550866902L ^ life1_3)))));
    }
    lexicalValue1543_257_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).p__Boolean()) ? 1 : 0);
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_273_0 = lexicalValue1543_257_0;
        break lexical_join_273;
    }
    if (!((lexicalValue1543_257_0 != 0))) {
        break lexical_join_267;
    }
    spill1543_15 = ((net.minecraft.entity.EntityLivingBase)(this)).i__Boolean();
    if (!((life3_16 != 0))) {
        lexicalValue1543_273_0 = ((spill1543_15) ? 1 : 0);
        break lexical_join_273;
    }
    if (!(spill1543_15)) {
        break lexical_join_267;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).j();
    }
    this.aY = ((float)(this.aZ));
    lexicalValue1543_273_0 = this.aO;
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_284_0 = lexicalValue1543_273_0;
        break lexical_join_284;
    }
    if (!((lexicalValue1543_273_0 > 0))) {
        break lexical_join_282;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1543_102_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1543_102_0)).aO = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp1543_102_0)).aO - 1)));
    }
    lexicalValue1543_284_0 = this.U;
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_302_0 = lexicalValue1543_284_0;
        break lexical_join_302;
    }
    if (!((lexicalValue1543_284_0 > 0))) {
        break lexical_join_298;
    }
    spill1543_16 = ((this instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    if (!((life3_16 != 0))) {
        lexicalValue1543_302_0 = spill1543_16;
        break lexical_join_302;
    }
    if (!((spill1543_16 == 0))) {
        break lexical_join_298;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1543_107_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1543_107_0)).U = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp1543_107_0)).U - 1)));
    }
    lexicalValue1543_302_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_311_0 = lexicalValue1543_302_0;
        break lexical_join_311;
    }
    if (!((lexicalValue1543_302_0 <= 0))) {
        break lexical_join_307;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).b__Void();
    }
    spill1543_17 = this;
    if (!((life3_16 != 0))) {
        lexicalValue1543_321_0 = spill1543_17;
        break lexical_join_321;
    }
    lexicalValue1543_311_0 = ((net.minecraft.entity.EntityLivingBase)(spill1543_17)).a8;
    }
    if (!((lexicalValue1543_311_0 > 0))) {
        break lexical_join_320;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1543_114_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1543_114_0)).a8 = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp1543_114_0)).a8 - 1)));
    if (!((life3_16 == 0))) {
        break lexical_join_323;
    }
    }
    lexicalValue1543_321_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1543_321_0)).a7 = ((net.minecraft.entity.player.EntityPlayer)(null));
    }
    spill1543_18 = this.bv;
    if (!((life3_16 != 0))) {
        lexicalValue1543_339_0 = spill1543_18;
        break lexical_join_339;
    }
    if (!((spill1543_18 != null))) {
        break lexical_join_337;
    }
    spill1543_19 = this.bv;
    if (!((life3_16 != 0))) {
        lexicalValue1543_339_0 = spill1543_19;
        break lexical_join_339;
    }
    if (!((!((net.minecraft.entity.EntityLivingBase)(spill1543_19)).p__Boolean()))) {
        break lexical_join_337;
    }
    this.bv = ((net.minecraft.entity.EntityLivingBase)(null));
    }
    lexicalValue1543_339_0 = this.bt;
    }
    if (!((life3_16 != 0))) {
        lexicalValue1543_392_0 = lexicalValue1543_339_0;
        break lexical_join_392;
    }
    if (!((lexicalValue1543_339_0 != null))) {
        break lexical_join_369;
    }
    spill1543_20 = ((net.minecraft.entity.EntityLivingBase)(this.bt)).p__Boolean();
    if (!((life3_16 != 0))) {
        lexicalValue1543_360_0 = ((spill1543_20) ? 1 : 0);
        break lexical_join_360;
    }
    if (!((!spill1543_20))) {
        break lexical_join_353;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).b(((net.minecraft.entity.EntityLivingBase)(null)));
    if (!((life3_16 == 0))) {
        break lexical_join_369;
    }
    }
    spill1543_21 = this;
    if (!((life3_16 != 0))) {
        lexicalValue1543_392_0 = spill1543_21;
        break lexical_join_392;
    }
    lexicalValue1543_360_0 = (((net.minecraft.entity.EntityLivingBase)(spill1543_21)).S - this.bu);
    }
    if (!((lexicalValue1543_360_0 > __sourceIntrinsic_455b93f512d4_invokedynamic1543_129(22502, (8871082946142401980L ^ life1_3))))) {
        break lexical_join_369;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).b(((net.minecraft.entity.EntityLivingBase)(null)));
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).w__sourceReturn_da8c82d5d4();
    this.bd = ((float)(this.bc));
    this.a3 = ((float)(this.a2));
    this.a5 = ((float)(this.a4));
    this.y = ((float)(this.w));
    this.z = ((float)(this.x));
    lexicalValue1543_392_0 = this;
    }
    ((moom.A9)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(lexicalValue1543_392_0)).i)).D)).b();
    return;
}


protected java.lang.String h__String() {
return "game.neutral.die";
}


public void f(net.minecraft.entity.Entity p0) {
long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_17: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 14807438224755L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    if (!((life4_5 == 0))) { break forward_join_15; }
    if (!((((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) { break forward_join_17; }
    this.bv = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0))));
    }
    if (!((life4_5 != 0))) { break forward_join_20; }
    }
    this.bv = ((net.minecraft.entity.EntityLivingBase)(null));
    }
    this.bw = ((int)(this.S));
    return;
}


public void f(float p0) {
this.bx = ((float)(p0));
    return;
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.0p0f;
}


public void d(float p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 107297447342108L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_2b75f634baf5_originalDynamicSite1882_2(30188, (1540371767605787469L ^ local2)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(moom.Dr.a(((float)(p0)), ((float)(0x0.0p0f)), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).a())))))))));
    return;
}


public float d__Float() {
return this.a4;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.EntityLivingBase.hb ^ 95416907918163L);
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_2(28428, (3454959112045525739L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_6(12458, (1883242815107966286L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_10(16734, (3504897543426233514L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_14(30188, (1540310957995319298L ^ local1)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(0x1.0p0f))))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.item.ItemStack forestValue656_107_0;
    int spill656_0;
    net.minecraft.item.ItemStack spill656_1;
    net.minecraft.item.ItemStack spill656_2;
    long life2_3;
    int life4_10;
    net.minecraft.item.ItemStack[] life5_44;
    int life6_47;
    int life7_49;
    net.minecraft.item.ItemStack life8_58;
    net.minecraft.item.ItemStack[] life5_89;
    int life6_92;
    int life7_94;
    net.minecraft.item.ItemStack life8_103;
    net.minecraft.nbt.NBTTagList life5_165;
    java.util.Iterator life6_170;
    net.minecraft.potion.PotionEffect life7_179;
    forest_join_165: {
    forest_join_161: {
    forest_join_130: {
    forest_join_107: {
    forest_join_71: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 34810277661707L);
    spill656_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("HealF")), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6())));
    life4_10 = spill656_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Health")), ((short)(((short) ((int) java.lang.Math.ceil(((double)(((double) ((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6())))))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("HurtTime")), ((short)(((short) this.aO))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("HurtByTimestamp")), ((int)(this.bu)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("DeathTime")), ((short)(((short) this.aR))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("AbsorptionAmount")), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).j__sourceReturn_bc607678b6())));
    life5_44 = ((net.minecraft.entity.EntityLivingBase)(this)).a__ArrayxW();
    life6_47 = (life5_44).length;
    life7_49 = 0;
    forest_cycle_50: while (true) {
    forest_join_69: {
    forest_join_68: {
    if (!((life7_49 < life6_47))) {
        break forest_join_71;
    }
    life8_58 = (life5_44)[life7_49];
    if (!((life4_10 == 0))) {
        break forest_join_69;
    }
    spill656_1 = life8_58;
    if (!((life4_10 == 0))) {
        forestValue656_107_0 = spill656_1;
        break forest_join_107;
    }
    if (!((spill656_1 != null))) {
        break forest_join_68;
    }
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(this.aH)).a(((com.google.common.collect.Multimap)(((net.minecraft.item.ItemStack)(life8_58)).a__Multimap())));
    }
    life7_49 += 1;
    }
    if (!((life4_10 != 0))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Attributes")), ((net.minecraft.nbt.NBTBase)(net.minecraft.entity.SharedMonsterAttributes.a(((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE()))))));
    life5_89 = ((net.minecraft.entity.EntityLivingBase)(this)).a__ArrayxW();
    life6_92 = (life5_89).length;
    life7_94 = 0;
    forest_cycle_85: while (true) {
    forest_join_104: {
    forest_join_103: {
    if (!((life7_94 < life6_92))) {
        break forest_join_130;
    }
    life8_103 = (life5_89)[life7_94];
    if (!((life4_10 == 0))) {
        break forest_join_165;
    }
    if (!((life4_10 == 0))) {
        break forest_join_104;
    }
    if (!((life8_103 != null))) {
        break forest_join_103;
    }
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(this.aH)).b(((com.google.common.collect.Multimap)(((net.minecraft.item.ItemStack)(life8_103)).a__Multimap())));
    }
    life7_94 += 1;
    }
    if (!((life4_10 != 0))) {
        continue forest_cycle_85;
    }
    break forest_cycle_85;
    }
    break forest_join_130;
    }
    forest_cycle_107: while (true) {
    forest_join_113: {
    if (!((forestValue656_107_0 != null))) {
        break forest_join_113;
    }
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(this.aH)).b(((com.google.common.collect.Multimap)(((net.minecraft.item.ItemStack)(life8_58)).a__Multimap())));
    }
    life7_49 += 1;
    forest_cycle_114: while (true) {
    forest_join_117: {
    if (!((life4_10 != 0))) {
        break forest_join_117;
    }
    break forest_join_130;
    }
    if (!((life7_49 < life6_47))) {
        break forest_join_130;
    }
    life8_58 = (life5_44)[life7_49];
    if (!((life4_10 == 0))) {
        break forest_join_165;
    }
    if (!((life4_10 == 0))) {
        continue forest_cycle_114;
    }
    break forest_cycle_114;
    }
    spill656_2 = life8_58;
    forestValue656_107_0 = spill656_2;
    continue forest_cycle_107;
    }
    }
    if (!((!((java.util.Map)(this.aJ)).isEmpty()))) {
        break forest_join_165;
    }
    life5_165 = new net.minecraft.nbt.NBTTagList();
    life6_170 = ((java.util.Collection)(((java.util.Map)(this.aJ)).values())).iterator();
    forest_cycle_143: while (true) {
    if (!(((java.util.Iterator)(life6_170)).hasNext())) {
        break forest_join_161;
    }
    life7_179 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life6_170)).next()));
    ((net.minecraft.nbt.NBTTagList)(life5_165)).a(((net.minecraft.nbt.NBTBase)(((net.minecraft.potion.PotionEffect)(life7_179)).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    if (!((life4_10 == 0))) {
        break forest_join_165;
    }
    if (!((life4_10 != 0))) {
        continue forest_cycle_143;
    }
    break forest_cycle_143;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ActiveEffects")), ((net.minecraft.nbt.NBTBase)(life5_165)));
    }
    return;
}


public void d(float p0, float p1) {
net.minecraft.potion.PotionEffect forwardValue4964_19_0;
    float forwardValue4964_25_0;
    int forwardValue4964_55_0;
    net.minecraft.block.Block forwardValue4964_84_0;
    int spill4964_0;
    net.minecraft.potion.PotionEffect spill4964_1;
    int spill4964_2;
    net.minecraft.block.Block spill4964_3;
    long life3_3;
    net.minecraft.potion.PotionEffect life6_12;
    int life5_13;
    float life7_28;
    int life8_37;
    int life9_64;
    int life10_70;
    int life11_74;
    net.minecraft.block.Block life12_85;
    moom.eJ life13_100;
    forward_join_98: {
    forward_join_84: {
    forward_join_55: {
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 135289676479480L);
    spill4964_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    super.d(((float)(p0)), ((float)(p1)));
    life6_12 = ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.k)));
    life5_13 = spill4964_0;
    spill4964_1 = life6_12;
    if (!((life5_13 == 0))) {
        forwardValue4964_19_0 = spill4964_1;
        break forward_join_19;
    }
    if (!((spill4964_1 != null))) {
        break forward_join_24;
    }
    forwardValue4964_19_0 = life6_12;
    }
    forwardValue4964_25_0 = ((float) (((net.minecraft.potion.PotionEffect)(forwardValue4964_19_0)).c() + 1));
    break forward_join_25;
    }
    forwardValue4964_25_0 = 0x0.0p0f;
    }
    life7_28 = forwardValue4964_25_0;
    life8_37 = moom.Dr.b__Int(((float)((((p0 - 0x1.8p1f) - life7_28) * p1))));
    spill4964_2 = life8_37;
    if (!((life5_13 == 0))) {
        forwardValue4964_55_0 = spill4964_2;
        break forward_join_55;
    }
    if (!((spill4964_2 > 0))) {
        break forward_join_98;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((java.lang.String)(((net.minecraft.entity.EntityLivingBase)(this)).a__String(((int)(life8_37))))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.i)), ((float)(((float) life8_37))));
    forwardValue4964_55_0 = moom.Dr.b__Int(((double)(this.n)));
    }
    life9_64 = forwardValue4964_55_0;
    life10_70 = moom.Dr.b__Int(((double)((this.o - 0x1.99999ap-3d))));
    life11_74 = moom.Dr.b__Int(((double)(this.p)));
    life12_85 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(new moom.DT(life9_64, life10_70, life11_74)))))).a__ch();
    spill4964_3 = life12_85;
    if (!((life5_13 == 0))) {
        forwardValue4964_84_0 = spill4964_3;
        break forward_join_84;
    }
    if (!((((net.minecraft.block.Block)(spill4964_3)).a__fn() != moom.fn.a))) {
        break forward_join_98;
    }
    forwardValue4964_84_0 = life12_85;
    }
    life13_100 = ((net.minecraft.block.Block)(forwardValue4964_84_0)).H;
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((java.lang.String)(((moom.eJ)(life13_100)).b__String())), ((float)((((moom.eJ)(life13_100)).a() * 0x1.0p-1f))), ((float)((((moom.eJ)(life13_100)).b() * 0x1.8p-1f))));
    }
    return;
}


protected boolean d__Boolean() {
int forwardValue4966_12_0;
    int forwardValue4966_14_0;
    boolean spill4966_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 112161750053632L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4966_0 = ((net.minecraft.entity.EntityLivingBase)(this)).c__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4966_12_0 = ((spill4966_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill4966_0))) {
        break forward_join_13;
    }
    forwardValue4966_12_0 = 1;
    }
    forwardValue4966_14_0 = forwardValue4966_12_0;
    break forward_join_14;
    }
    forwardValue4966_14_0 = 0;
    }
    return ((forwardValue4966_14_0) != 0);
}


public boolean d__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 69559928547450L);
    return ((((net.minecraft.world.World)(this.i)).a(((moom.DR)(new moom.DR(this.n, (this.o + ((double) __sourceExactCall_f4e7fff2f8c1c1(((net.minecraft.entity.EntityLivingBase)(this))))), this.p))), ((moom.DR)(new moom.DR(((net.minecraft.entity.Entity)(p0)).n, (((net.minecraft.entity.Entity)(p0)).o + ((double) __sourceExactCall_31a95b45a80da5(((net.minecraft.entity.Entity)(p0))))), ((net.minecraft.entity.Entity)(p0)).p)))) == null) ? true : false);
}


public int d__Int() {
int lexicalValue1540_37_0;
    int spill1540_0;
    int spill1540_1;
    long life1_3;
    int life4_6;
    net.minecraft.item.ItemStack[] life5_9;
    int life6_12;
    int life3_13;
    int life7_15;
    net.minecraft.item.ItemStack life8_22;
    int life9_49;
    lexical_join_45: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 57294374071961L);
    spill1540_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life4_6 = 0;
    life5_9 = ((net.minecraft.entity.EntityLivingBase)(this)).a__ArrayxW();
    life6_12 = (life5_9).length;
    life3_13 = spill1540_0;
    life7_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_37: {
    if (!((life7_15 < life6_12))) {
        break lexical_join_45;
    }
    life8_22 = (life5_9)[life7_15];
    if (!((life3_13 != 0))) {
        break lexical_join_43;
    }
    if (!((life8_22 != null))) {
        break lexical_join_42;
    }
    spill1540_1 = ((((net.minecraft.item.ItemStack)(life8_22)).a__wQ() instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life3_13 != 0))) {
        lexicalValue1540_37_0 = spill1540_1;
        break lexical_join_37;
    }
    if (!((spill1540_1 != 0))) {
        break lexical_join_42;
    }
    lexicalValue1540_37_0 = ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(life8_22)).a__wQ())))).r;
    }
    life9_49 = lexicalValue1540_37_0;
    life4_6 = (life4_6 + life9_49);
    }
    life7_15 += 1;
    }
    if (!((life3_13 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return life4_6;
}


public net.minecraft.entity.EntityLivingBase a__sG() {
return this.bt;
}


public boolean a(moom.Bj p0) {
moom.Bj forwardValue4944_13_0;
    int forwardValue4944_19_0;
    int forwardValue4944_21_0;
    moom.Bj spill4944_0;
    boolean spill4944_1;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 32875785678451L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4944_0 = ((net.minecraft.entity.EntityLivingBase)(this)).a__Bj();
    if (!((life4_5 == 0))) {
        forwardValue4944_13_0 = spill4944_0;
        break forward_join_13;
    }
    if (!((spill4944_0 != null))) {
        break forward_join_20;
    }
    forwardValue4944_13_0 = ((net.minecraft.entity.EntityLivingBase)(this)).a__Bj();
    }
    spill4944_1 = ((moom.Bj)(forwardValue4944_13_0)).a(((moom.Bj)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue4944_19_0 = ((spill4944_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4944_1)) {
        break forward_join_20;
    }
    forwardValue4944_19_0 = 1;
    }
    forwardValue4944_21_0 = forwardValue4944_19_0;
    break forward_join_21;
    }
    forwardValue4944_21_0 = 0;
    }
    return ((forwardValue4944_21_0) != 0);
}


public int a__Int() {
return this.bu;
}


public java.util.Map<java.lang.Integer, net.minecraft.potion.PotionEffect> a__Map() {
return this.aJ;
}


protected void a(boolean p0, int p1) {
return;
}


protected void a__Void() {
((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b)));
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.d)));
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    return;
}


protected float a__sourceReturn_e70c882bc6(float p0, float p1) {
net.minecraft.entity.EntityLivingBase forwardValue4942_31_0;
    int forwardValue4942_55_0;
    int forwardValue4942_57_0;
    int forwardValue4942_69_0;
    int forwardValue4942_84_0;
    int forwardValue4942_96_0;
    int spill4942_0;
    net.minecraft.entity.EntityLivingBase spill4942_1;
    int spill4942_2;
    int spill4942_3;
    int spill4942_4;
    long life3_3;
    float life6_9;
    float life7_21;
    int life5_22;
    net.minecraft.entity.EntityLivingBase life9_24;
    net.minecraft.client.entity.EntityPlayerSP life8_38;
    float life8_47;
    int life9_72;
    forward_join_101: {
    forward_join_96: {
    forward_join_95: {
    forward_join_84: {
    forward_join_74: {
    forward_join_69: {
    forward_join_66: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_36: {
    forward_join_31: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 118730600679930L);
    life6_9 = moom.Dr.e(((float)((p0 - this.a2))));
    spill4942_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    net.minecraft.entity.EntityLivingBase __stackOp4942_4_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4942_4_0)).a2 = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp4942_4_0)).a2 + (life6_9 * 0x1.333334p-2f))));
    life7_21 = this.w;
    life5_22 = spill4942_0;
    life9_24 = this;
    spill4942_1 = life9_24;
    if (!((life5_22 == 0))) {
        forwardValue4942_31_0 = spill4942_1;
        break forward_join_31;
    }
    if (!((((spill4942_1 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0) != 0))) {
        break forward_join_36;
    }
    forwardValue4942_31_0 = life9_24;
    }
    life8_38 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4942_31_0));
    life7_21 = ((net.minecraft.client.entity.EntityPlayerSP)(life8_38)).cM;
    }
    life8_47 = moom.Dr.e(((float)((life7_21 - this.a2))));
    spill4942_2 = recovery.source.CarrierOps.fcmpg(((float)(life8_47)), ((float)(-0x1.68p6f)));
    if (!((life5_22 == 0))) {
        forwardValue4942_55_0 = spill4942_2;
        break forward_join_55;
    }
    if (!((spill4942_2 >= 0))) {
        break forward_join_54;
    }
    spill4942_3 = recovery.source.CarrierOps.fcmpl(((float)(life8_47)), ((float)(0x1.68p6f)));
    if (!((life5_22 == 0))) {
        forwardValue4942_55_0 = spill4942_3;
        break forward_join_55;
    }
    if (!((spill4942_3 >= 0))) {
        break forward_join_56;
    }
    }
    forwardValue4942_55_0 = 1;
    }
    forwardValue4942_57_0 = forwardValue4942_55_0;
    break forward_join_57;
    }
    forwardValue4942_57_0 = 0;
    }
    life9_72 = forwardValue4942_57_0;
    spill4942_4 = recovery.source.CarrierOps.fcmpg(((float)(life8_47)), ((float)(-0x1.2cp6f)));
    if (!((life5_22 == 0))) {
        forwardValue4942_69_0 = spill4942_4;
        break forward_join_69;
    }
    if (!((spill4942_4 < 0))) {
        break forward_join_66;
    }
    life8_47 = -0x1.2cp6f;
    }
    forwardValue4942_69_0 = recovery.source.CarrierOps.fcmpl(((float)(life8_47)), ((float)(0x1.2cp6f)));
    }
    if (!((life5_22 == 0))) {
        forwardValue4942_84_0 = forwardValue4942_69_0;
        break forward_join_84;
    }
    if (!((forwardValue4942_69_0 >= 0))) {
        break forward_join_74;
    }
    life8_47 = 0x1.2cp6f;
    }
    this.a2 = ((float)((life7_21 - life8_47)));
    forwardValue4942_84_0 = recovery.source.CarrierOps.fcmpl(((float)((life8_47 * life8_47))), ((float)(0x1.388p11f)));
    }
    if (!((life5_22 == 0))) {
        forwardValue4942_96_0 = forwardValue4942_84_0;
        break forward_join_96;
    }
    if (!((forwardValue4942_84_0 > 0))) {
        break forward_join_95;
    }
    net.minecraft.entity.EntityLivingBase __stackOp4942_19_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4942_19_0)).a2 = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp4942_19_0)).a2 + (life8_47 * 0x1.99999ap-3f))));
    }
    forwardValue4942_96_0 = life9_72;
    }
    if (!((forwardValue4942_96_0 != 0))) {
        break forward_join_101;
    }
    p1 = (p1 * -0x1.0p0f);
    }
    return p1;
}


protected int a(net.minecraft.entity.player.EntityPlayer p0) {
return 0;
}


public static int[] a__ArrayInt() {
return net.minecraft.entity.EntityLivingBase.bB;
}


public moom.Bj a__Bj() {
return ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.world.World)(this.i)).a__Bh())).c(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.EntityLivingBase)(this)).a__UUID())).toString())));
}


protected int a__sourceReturn_0f7a48eca2(int p0) {
int forwardValue4943_25_0;
    int forwardValue4943_27_0;
    int spill4943_0;
    int spill4943_1;
    int spill4943_2;
    long life2_3;
    int life5_7;
    int life4_8;
    forward_join_27: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 99854333891669L);
    spill4943_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_7 = moom.rV.a(((net.minecraft.entity.Entity)(this)));
    life4_8 = spill4943_0;
    spill4943_1 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue4943_25_0 = spill4943_1;
        break forward_join_25;
    }
    if (!((spill4943_1 > 0))) {
        break forward_join_24;
    }
    spill4943_2 = ((java.util.Random)(this.ah)).nextInt(((int)((life5_7 + 1))));
    if (!((life4_8 == 0))) {
        forwardValue4943_25_0 = spill4943_2;
        break forward_join_25;
    }
    if (!((spill4943_2 > 0))) {
        break forward_join_24;
    }
    forwardValue4943_27_0 = p0;
    break forward_join_27;
    }
    forwardValue4943_25_0 = p0;
    }
    forwardValue4943_27_0 = (forwardValue4943_25_0 - 1);
    }
    return forwardValue4943_27_0;
}


public void a__Void(float p0) {
this.a4 = ((float)(p0));
    return;
}


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) {
this.bn = ((double)(p0));
    this.bo = ((double)(p1));
    this.bp = ((double)(p2));
    this.bq = ((double)(((double) p3)));
    this.br = ((double)(((double) p4)));
    this.bm = ((int)(p5));
    return;
}


protected void a(double p0, boolean p1, net.minecraft.block.Block p2, moom.DT p3) {
int forwardValue4941_19_0;
    int forwardValue4941_71_0;
    net.minecraft.entity.EntityLivingBase forwardValue4941_96_0;
    boolean spill4941_0;
    net.minecraft.entity.EntityLivingBase spill4941_1;
    net.minecraft.entity.EntityLivingBase spill4941_2;
    int spill4941_3;
    long life6_3;
    int life8_5;
    net.minecraft.block.state.IBlockState life9_51;
    net.minecraft.block.Block life10_54;
    float life11_61;
    double life12_79;
    int life14_95;
    forward_join_101: {
    forward_join_96: {
    forward_join_95: {
    forward_join_71: {
    forward_join_67: {
    forward_join_19: {
    forward_join_14: {
    life6_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 134656123236966L);
    life8_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4941_0 = ((net.minecraft.entity.EntityLivingBase)(this)).j__Boolean();
    if (!((life8_5 != 0))) {
        forwardValue4941_19_0 = ((spill4941_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4941_0))) {
        break forward_join_14;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).k__Boolean();
    }
    spill4941_1 = this;
    if (!((life8_5 != 0))) {
        forwardValue4941_96_0 = spill4941_1;
        break forward_join_96;
    }
    forwardValue4941_19_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill4941_1)).i)).G) ? 1 : 0);
    }
    if (!((forwardValue4941_19_0 == 0))) {
        break forward_join_95;
    }
    spill4941_2 = this;
    if (!((life8_5 != 0))) {
        forwardValue4941_96_0 = spill4941_2;
        break forward_join_96;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.EntityLivingBase)(spill4941_2)).L)), ((float)(0x1.8p1f))) > 0))) {
        break forward_join_95;
    }
    if (!(p1)) {
        break forward_join_95;
    }
    life9_51 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(p3)));
    life10_54 = ((net.minecraft.block.state.IBlockState)(life9_51)).a__ch();
    life11_61 = ((float) moom.Dr.b__Int(((float)((this.L - 0x1.8p1f)))));
    if (!((life8_5 != 0))) {
        break forward_join_101;
    }
    if (!((((net.minecraft.block.Block)(life10_54)).a__fn() != moom.fn.a))) {
        break forward_join_95;
    }
    life12_79 = ((double) java.lang.Math.min(((float)((0x1.99999ap-3f + (life11_61 / 0x1.ep3f)))), ((float)(0x1.4p3f))));
    spill4941_3 = recovery.source.CarrierOps.dcmpl(((double)(life12_79)), ((double)(0x1.4p1d)));
    if (!((life8_5 != 0))) {
        forwardValue4941_71_0 = spill4941_3;
        break forward_join_71;
    }
    if (!((spill4941_3 > 0))) {
        break forward_join_67;
    }
    life12_79 = 0x1.4p1d;
    }
    forwardValue4941_71_0 = ((int) (0x1.2cp7d * life12_79));
    }
    life14_95 = forwardValue4941_71_0;
    ((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(this.i)))).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.BLOCK_DUST)), ((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((int)(life14_95)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x1.333334p-3d)), ((int[])(new int[] {__sourceExactCall_042b2eb2353c3d(((net.minecraft.block.state.IBlockState)(life9_51)))})));
    }
    forwardValue4941_96_0 = this;
    }
    __sourceIntrinsic_27cbe04c37b0_call4941_27(forwardValue4941_96_0, p0, p1, p2, p3);
    }
    return;
}


public java.util.Random a__Random() {
return this.ah;
}


public boolean a__sourceReturn_55fa5355bc(net.minecraft.entity.EntityLivingBase p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.EntityLivingBase)(this)).a(((moom.Bj)(((net.minecraft.entity.EntityLivingBase)(p0)).a__Bj()))))) != 0);
}


public moom.DR a__DR(float p0) {
float forwardValue4952_28_0;
    float forwardValue4952_28_1;
    float spill4952_0;
    float spill4952_1;
    long life2_3;
    int life4_5;
    float life5_34;
    float life6_45;
    forward_join_28: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 83347712788970L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4952_0 = p0;
    spill4952_1 = 0x1.0p0f;
    if (!((life4_5 == 0))) {
        forwardValue4952_28_0 = spill4952_0;
        forwardValue4952_28_1 = spill4952_1;
        break forward_join_28;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill4952_0)), ((float)(spill4952_1))) == 0))) {
        break forward_join_19;
    }
    return ((net.minecraft.entity.EntityLivingBase)(this)).a(((float)(this.x)), ((float)(this.a4)));
    }
    forwardValue4952_28_0 = this.z;
    forwardValue4952_28_1 = ((this.x - this.z) * p0);
    }
    life5_34 = (forwardValue4952_28_0 + forwardValue4952_28_1);
    life6_45 = (this.a5 + ((this.a4 - this.a5) * p0));
    return ((net.minecraft.entity.EntityLivingBase)(this)).a(((float)(life5_34)), ((float)(life6_45)));
}


public net.minecraft.util.CombatTracker a__CS() {
return this.aI;
}


public abstract net.minecraft.item.ItemStack a__xW(int p0);

public void a(net.minecraft.potion.PotionEffect p0) {
int forwardValue4946_24_0;
    int forwardValue4946_35_0;
    java.util.Map forwardValue4946_62_0;
    java.lang.Integer forwardValue4946_62_1;
    int spill4946_0;
    java.util.Map spill4946_1;
    java.lang.Integer spill4946_2;
    long life2_3;
    int life4_5;
    forward_join_68: {
    forward_join_62: {
    forward_join_57: {
    forward_join_35: {
    forward_join_24: {
    forward_join_21: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 16329225650691L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4946_0 = ((net.minecraft.potion.PotionEffect)(p0)).a();
    if (!((life4_5 != 0))) {
        forwardValue4946_24_0 = spill4946_0;
        break forward_join_24;
    }
    if (!((spill4946_0 < 0))) {
        break forward_join_21;
    }
    ((java.io.PrintStream)(java.lang.System.out)).println(((java.lang.String)(__sourceIntrinsic_6cec1e8f58c8_invokedynamic4946_7(((net.minecraft.potion.PotionEffect)(p0)).a__String(), ((net.minecraft.potion.PotionEffect)(p0)).a(), ((net.minecraft.potion.PotionEffect)(p0)).c()))));
    return;
    }
    forwardValue4946_24_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.potion.PotionEffect)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4946_35_0 = forwardValue4946_24_0;
        break forward_join_35;
    }
    if (!((forwardValue4946_24_0 != 0))) {
        break forward_join_68;
    }
    spill4946_1 = this.aJ;
    spill4946_2 = java.lang.Integer.valueOf(((int)(((net.minecraft.potion.PotionEffect)(p0)).a())));
    if (!((life4_5 != 0))) {
        forwardValue4946_62_0 = spill4946_1;
        forwardValue4946_62_1 = spill4946_2;
        break forward_join_62;
    }
    forwardValue4946_35_0 = ((((java.util.Map)(spill4946_1)).containsKey(((java.lang.Object)(spill4946_2)))) ? 1 : 0);
    }
    if (!((forwardValue4946_35_0 != 0))) {
        break forward_join_57;
    }
    ((net.minecraft.potion.PotionEffect)(((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.aJ)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.PotionEffect)(p0)).a())))))))))).a(((net.minecraft.potion.PotionEffect)(p0)));
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.PotionEffect)(((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.aJ)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.PotionEffect)(p0)).a())))))))))), ((boolean)(true)));
    if (!((life4_5 == 0))) {
        break forward_join_68;
    }
    }
    forwardValue4946_62_0 = this.aJ;
    forwardValue4946_62_1 = java.lang.Integer.valueOf(((int)(((net.minecraft.potion.PotionEffect)(p0)).a())));
    }
    ((java.util.Map)(forwardValue4946_62_0)).put(((java.lang.Object)(forwardValue4946_62_1)), ((java.lang.Object)(p0)));
    ((net.minecraft.entity.EntityLivingBase)(this)).b(((net.minecraft.potion.PotionEffect)(p0)));
    }
    return;
}


public net.minecraft.potion.PotionEffect a(net.minecraft.potion.Potion p0) {
return ((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.aJ)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(p0)).I))))))));
}


protected float a(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4949_19_0;
    boolean spill4949_0;
    long life3_3;
    int life5_5;
    int life6_25;
    float life7_30;
    forward_join_32: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 128648270679311L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4949_0 = ((net.minecraft.util.DamageSource)(p0)).c__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue4949_19_0 = ((spill4949_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4949_0))) {
        break forward_join_32;
    }
    forwardValue4949_19_0 = (__sourceIntrinsic_3a8300cf5bdc_invokedynamic4949_4(26641, (1325023502671256501L ^ life3_3)) - ((net.minecraft.entity.EntityLivingBase)(this)).d__Int());
    }
    life6_25 = forwardValue4949_19_0;
    life7_30 = (p1 * ((float) life6_25));
    ((net.minecraft.entity.EntityLivingBase)(this)).e(((float)(p1)));
    p1 = (life7_30 / 0x1.9p4f);
    }
    return p1;
}


protected java.lang.String a__String(int p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 22491540163854L);
    return ((p0 > 4) ? "game.neutral.hurt.fall.big" : "game.neutral.hurt.fall.small");
}


public void a(byte p0) {
int forestValue655_64_0;
    int forestValue655_64_1;
    byte spill655_0;
    int spill655_1;
    net.minecraft.entity.EntityLivingBase spill655_2;
    int spill655_3;
    long life2_3;
    int life4_5;
    java.lang.String life5_34;
    java.lang.String life5_71;
    forest_join_100: {
    forest_join_97: {
    forest_join_95: {
    forest_join_89: {
    forest_join_64: {
    forest_join_62: {
    forest_join_60: {
    forest_join_55: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 53462047359825L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill655_0 = p0;
    spill655_1 = 2;
    if (!((life4_5 == 0))) {
        forestValue655_64_0 = ((int)(spill655_0));
        forestValue655_64_1 = spill655_1;
        break forest_join_64;
    }
    if (!((spill655_0 == spill655_1))) {
        break forest_join_62;
    }
    this.aV = ((float)(0x1.8p0f));
    this.U = ((int)(this.aX));
    spill655_2 = this;
    net.minecraft.entity.EntityLivingBase __stackOp655_7_0 = this;
    int __stackOp655_7_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic655_6(5103, (4710298745679605255L ^ life2_3));
    spill655_3 = __stackOp655_7_1;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp655_7_0)).aP = ((int)(__stackOp655_7_1));
    ((net.minecraft.entity.EntityLivingBase)(spill655_2)).aO = ((int)(spill655_3));
    this.aQ = ((float)(0x0.0p0f));
    life5_34 = ((net.minecraft.entity.EntityLivingBase)(this)).c__String();
    if (!((life4_5 == 0))) {
        break forest_join_60;
    }
    if (!((life5_34 != null))) {
        break forest_join_55;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((java.lang.String)(((net.minecraft.entity.EntityLivingBase)(this)).c__String())), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).f__sourceReturn_bc607678b6())), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.k)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != 0))) {
        break forest_join_100;
    }
    }
    forestValue655_64_0 = ((int)(p0));
    forestValue655_64_1 = 3;
    }
    if (!((forestValue655_64_0 == forestValue655_64_1))) {
        break forest_join_97;
    }
    life5_71 = ((net.minecraft.entity.EntityLivingBase)(this)).h__String();
    if (!((life4_5 == 0))) {
        break forest_join_95;
    }
    if (!((life5_71 != null))) {
        break forest_join_89;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((java.lang.String)(((net.minecraft.entity.EntityLivingBase)(this)).h__String())), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).f__sourceReturn_bc607678b6())), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((float)(0x0.0p0f)));
    ((net.minecraft.entity.EntityLivingBase)(this)).a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.k)));
    }
    if (!((life4_5 != 0))) {
        break forest_join_100;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


protected void a__Void(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.EntityLivingBase forwardValue4953_19_0;
    net.minecraft.util.DamageSource forwardValue4953_19_1;
    float forwardValue4953_47_0;
    net.minecraft.entity.EntityLivingBase spill4953_0;
    net.minecraft.util.DamageSource spill4953_1;
    float spill4953_2;
    long life3_3;
    int life5_5;
    float life2_24;
    float life6_26;
    float life2_33;
    float life7_56;
    forward_join_65: {
    forward_join_47: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 55316207871259L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4953_0 = this;
    spill4953_1 = p0;
    if (!((life5_5 != 0))) {
        forwardValue4953_19_0 = spill4953_0;
        forwardValue4953_19_1 = spill4953_1;
        break forward_join_19;
    }
    if (!((!((net.minecraft.entity.EntityLivingBase)(spill4953_0)).a(((net.minecraft.util.DamageSource)(spill4953_1)))))) {
        break forward_join_65;
    }
    p1 = ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
    forwardValue4953_19_0 = this;
    forwardValue4953_19_1 = p0;
    }
    life2_24 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4953_19_0)).b(((net.minecraft.util.DamageSource)(forwardValue4953_19_1)), ((float)(p1)));
    life6_26 = life2_24;
    life2_33 = java.lang.Math.max(((float)((life2_24 - ((net.minecraft.entity.EntityLivingBase)(this)).j__sourceReturn_bc607678b6()))), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.EntityLivingBase)(this)).g(((float)((((net.minecraft.entity.EntityLivingBase)(this)).j__sourceReturn_bc607678b6() - (life6_26 - life2_33)))));
    spill4953_2 = life2_33;
    if (!((life5_5 != 0))) {
        forwardValue4953_47_0 = spill4953_2;
        break forward_join_47;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill4953_2)), ((float)(0x0.0p0f))) != 0))) {
        break forward_join_65;
    }
    forwardValue4953_47_0 = ((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6();
    }
    life7_56 = forwardValue4953_47_0;
    ((net.minecraft.entity.EntityLivingBase)(this)).d(((float)((life7_56 - life2_33))));
    ((net.minecraft.util.CombatTracker)(((net.minecraft.entity.EntityLivingBase)(this)).a__CS())).a(((net.minecraft.util.DamageSource)(p0)), ((float)(life7_56)), ((float)(life2_33)));
    ((net.minecraft.entity.EntityLivingBase)(this)).g(((float)((((net.minecraft.entity.EntityLivingBase)(this)).j__sourceReturn_bc607678b6() - life2_33))));
    }
    return;
}


public boolean a__Boolean(net.minecraft.potion.PotionEffect p0) {
int forwardValue4950_24_0;
    int forwardValue4950_24_1;
    int forwardValue4950_26_0;
    int forwardValue4950_28_0;
    int spill4950_0;
    int spill4950_1;
    int spill4950_2;
    long life2_3;
    int life4_5;
    int life5_12;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 50421361260375L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    if (!((((net.minecraft.entity.EntityLivingBase)(this)).a__aR() == net.minecraft.entity.EnumCreatureAttribute.UNDEAD))) {
        break forward_join_29;
    }
    life5_12 = ((net.minecraft.potion.PotionEffect)(p0)).a();
    spill4950_0 = life5_12;
    spill4950_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).I;
    if (!((life4_5 == 0))) {
        forwardValue4950_24_0 = spill4950_0;
        forwardValue4950_24_1 = spill4950_1;
        break forward_join_24;
    }
    if (!((spill4950_0 != spill4950_1))) {
        break forward_join_27;
    }
    spill4950_2 = life5_12;
    if (!((life4_5 == 0))) {
        forwardValue4950_26_0 = spill4950_2;
        break forward_join_26;
    }
    forwardValue4950_24_0 = spill4950_2;
    forwardValue4950_24_1 = ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).I;
    }
    if (!((forwardValue4950_24_0 != forwardValue4950_24_1))) {
        break forward_join_27;
    }
    forwardValue4950_26_0 = 1;
    }
    forwardValue4950_28_0 = forwardValue4950_26_0;
    break forward_join_28;
    }
    forwardValue4950_28_0 = 0;
    }
    return ((forwardValue4950_28_0) != 0);
    }
    return ((1) != 0);
}


public net.minecraft.entity.ai.attributes.IAttributeInstance a(net.minecraft.entity.ai.attributes.IAttribute p0) {
return ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())).a(((net.minecraft.entity.ai.attributes.IAttribute)(p0)));
}


public net.minecraft.entity.ai.attributes.BaseAttributeMap a__vE() {
net.minecraft.entity.ai.attributes.BaseAttributeMap forwardValue4954_18_0;
    net.minecraft.entity.ai.attributes.BaseAttributeMap spill4954_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 56073465336597L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4954_0 = this.aH;
    if (!((life3_5 != 0))) {
        forwardValue4954_18_0 = spill4954_0;
        break forward_join_18;
    }
    if (!((spill4954_0 == null))) {
        break forward_join_16;
    }
    this.aH = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(new moom.vF()));
    }
    forwardValue4954_18_0 = this.aH;
    }
    return forwardValue4954_18_0;
}


public net.minecraft.entity.EnumCreatureAttribute a__aR() {
return net.minecraft.entity.EnumCreatureAttribute.UNDEFINED;
}


public java.util.Collection<net.minecraft.potion.PotionEffect> a__Collection() {
return ((java.util.Map)(this.aJ)).values();
}


public final float a() {
return ((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).b());
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int lexicalValue1535_17_0;
    int lexicalValue1535_29_0;
    int lexicalValue1535_38_0;
    int lexicalValue1535_46_0;
    net.minecraft.util.DamageSource lexicalValue1535_48_0;
    net.minecraft.util.DamageSource lexicalValue1535_54_0;
    net.minecraft.util.DamageSource lexicalValue1535_54_1;
    net.minecraft.entity.EntityLivingBase lexicalValue1535_83_0;
    int lexicalValue1535_119_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1535_134_0;
    net.minecraft.entity.Entity lexicalValue1535_154_0;
    int lexicalValue1535_164_0;
    int lexicalValue1535_182_0;
    int lexicalValue1535_204_0;
    net.minecraft.entity.Entity lexicalValue1535_220_0;
    net.minecraft.entity.Entity lexicalValue1535_224_0;
    int lexicalValue1535_302_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1535_325_0;
    int lexicalValue1535_341_0;
    boolean spill1535_0;
    net.minecraft.util.DamageSource spill1535_1;
    boolean spill1535_2;
    net.minecraft.util.DamageSource spill1535_3;
    net.minecraft.entity.EntityLivingBase spill1535_4;
    net.minecraft.entity.EntityLivingBase spill1535_5;
    int spill1535_6;
    int spill1535_7;
    net.minecraft.entity.Entity spill1535_8;
    int spill1535_9;
    boolean spill1535_10;
    net.minecraft.entity.EntityLivingBase spill1535_11;
    net.minecraft.entity.EntityLivingBase spill1535_12;
    int spill1535_13;
    long life3_3;
    int life5_5;
    int life6_122;
    net.minecraft.entity.Entity life7_198;
    net.minecraft.entity.passive.EntityWolf life8_258;
    double life8_320;
    double life10_326;
    java.lang.String life8_406;
    java.lang.String life8_439;
    lexical_join_341: {
    lexical_join_340: {
    lexical_join_325: {
    lexical_join_324: {
    lexical_join_322: {
    lexical_join_319: {
    lexical_join_302: {
    lexical_join_296: {
    lexical_join_283: {
    lexical_join_281: {
    lexical_join_261: {
    lexical_join_224: {
    lexical_join_220: {
    lexical_join_219: {
    lexical_join_204: {
    lexical_join_203: {
    lexical_join_182: {
    lexical_join_180: {
    lexical_join_164: {
    lexical_join_162: {
    lexical_join_154: {
    lexical_join_143: {
    lexical_join_134: {
    lexical_join_122: {
    lexical_join_119: {
    lexical_join_108: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_46: {
    lexical_join_38: {
    lexical_join_34: {
    lexical_join_29: {
    lexical_join_22: {
    lexical_join_17: {
    lexical_join_14: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 75885214537602L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill1535_0 = ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        lexicalValue1535_17_0 = ((spill1535_0) ? 1 : 0);
        break lexical_join_17;
    }
    if (!(spill1535_0)) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    lexicalValue1535_17_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        lexicalValue1535_29_0 = lexicalValue1535_17_0;
        break lexical_join_29;
    }
    if (!((lexicalValue1535_17_0 != 0))) {
        break lexical_join_22;
    }
    return ((0) != 0);
    }
    this.a_ = ((int)(0));
    lexicalValue1535_29_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 == 0))) {
        lexicalValue1535_38_0 = lexicalValue1535_29_0;
        break lexical_join_38;
    }
    if (!((lexicalValue1535_29_0 <= 0))) {
        break lexical_join_34;
    }
    return ((0) != 0);
    }
    spill1535_1 = p0;
    if (!((life5_5 == 0))) {
        lexicalValue1535_48_0 = spill1535_1;
        break lexical_join_48;
    }
    lexicalValue1535_38_0 = ((((net.minecraft.util.DamageSource)(spill1535_1)).f__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1535_38_0 != 0))) {
        break lexical_join_47;
    }
    spill1535_2 = ((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.o)));
    if (!((life5_5 == 0))) {
        lexicalValue1535_46_0 = ((spill1535_2) ? 1 : 0);
        break lexical_join_46;
    }
    if (!(spill1535_2)) {
        break lexical_join_47;
    }
    lexicalValue1535_46_0 = 0;
    }
    return ((lexicalValue1535_46_0) != 0);
    }
    lexicalValue1535_48_0 = p0;
    }
    spill1535_3 = net.minecraft.util.DamageSource.n;
    if (!((life5_5 == 0))) {
        lexicalValue1535_54_0 = lexicalValue1535_48_0;
        lexicalValue1535_54_1 = spill1535_3;
        break lexical_join_54;
    }
    if (!((lexicalValue1535_48_0 != spill1535_3))) {
        break lexical_join_55;
    }
    lexicalValue1535_54_0 = p0;
    lexicalValue1535_54_1 = net.minecraft.util.DamageSource.o;
    }
    if (!((lexicalValue1535_54_0 == lexicalValue1535_54_1))) {
        break lexical_join_82;
    }
    }
    spill1535_4 = this;
    if (!((life5_5 == 0))) {
        lexicalValue1535_83_0 = spill1535_4;
        break lexical_join_83;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill1535_4)).a__xW(((int)(4))) != null))) {
        break lexical_join_82;
    }
    ((net.minecraft.item.ItemStack)(((net.minecraft.entity.EntityLivingBase)(this)).a__xW(((int)(4))))).a(((int)(((int) ((p1 * 0x1.0p2f) + ((((java.util.Random)(this.ah)).nextFloat() * p1) * 0x1.0p1f))))), ((net.minecraft.entity.EntityLivingBase)(this)));
    p1 = (p1 * 0x1.8p-1f);
    }
    lexicalValue1535_83_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1535_83_0)).aV = ((float)(0x1.8p0f));
    life6_122 = 1;
    spill1535_5 = this;
    if (!((life5_5 == 0))) {
        lexicalValue1535_134_0 = spill1535_5;
        break lexical_join_134;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((float) ((net.minecraft.entity.EntityLivingBase)(spill1535_5)).U))), ((float)((((float) this.aX) / 0x1.0p1f)))) > 0))) {
        break lexical_join_122;
    }
    spill1535_6 = recovery.source.CarrierOps.fcmpg(((float)(p1)), ((float)(this.bg)));
    if (!((life5_5 == 0))) {
        lexicalValue1535_119_0 = spill1535_6;
        break lexical_join_119;
    }
    if (!((spill1535_6 <= 0))) {
        break lexical_join_108;
    }
    return ((0) != 0);
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Void(((net.minecraft.util.DamageSource)(p0)), ((float)((p1 - this.bg))));
    this.bg = ((float)(p1));
    lexicalValue1535_119_0 = 0;
    }
    life6_122 = lexicalValue1535_119_0;
    if (!((life5_5 != 0))) {
        break lexical_join_143;
    }
    }
    this.bg = ((float)(p1));
    this.U = ((int)(this.aX));
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Void(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
    lexicalValue1535_134_0 = this;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1535_41_0 = this;
    int __stackOp1535_41_1 = __sourceIntrinsic_153a193fc182_invokedynamic1535_40(5103, (4710240035572906708L ^ life3_3));
    spill1535_7 = __stackOp1535_41_1;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1535_41_0)).aP = ((int)(__stackOp1535_41_1));
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1535_134_0)).aO = ((int)(spill1535_7));
    }
    this.aQ = ((float)(0x0.0p0f));
    life7_198 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    spill1535_8 = life7_198;
    if (!((life5_5 == 0))) {
        lexicalValue1535_154_0 = spill1535_8;
        break lexical_join_154;
    }
    if (!((spill1535_8 != null))) {
        break lexical_join_203;
    }
    lexicalValue1535_154_0 = life7_198;
    }
    spill1535_9 = ((lexicalValue1535_154_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life5_5 == 0))) {
        lexicalValue1535_164_0 = spill1535_9;
        break lexical_join_164;
    }
    if (!((spill1535_9 != 0))) {
        break lexical_join_162;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).b(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life7_198)))));
    }
    lexicalValue1535_164_0 = ((life7_198 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        lexicalValue1535_182_0 = lexicalValue1535_164_0;
        break lexical_join_182;
    }
    if (!((lexicalValue1535_164_0 != 0))) {
        break lexical_join_180;
    }
    this.a8 = ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1535_50(32651, (4828147077653567163L ^ life3_3))));
    this.a7 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life7_198))));
    if (!((life5_5 != 0))) {
        break lexical_join_203;
    }
    }
    lexicalValue1535_182_0 = ((life7_198 instanceof net.minecraft.entity.passive.EntityWolf) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        lexicalValue1535_204_0 = lexicalValue1535_182_0;
        break lexical_join_204;
    }
    if (!((lexicalValue1535_182_0 != 0))) {
        break lexical_join_203;
    }
    life8_258 = ((net.minecraft.entity.passive.EntityWolf)(life7_198));
    spill1535_10 = ((net.minecraft.entity.passive.EntityWolf)(life8_258)).ae();
    if (!((life5_5 == 0))) {
        lexicalValue1535_204_0 = ((spill1535_10) ? 1 : 0);
        break lexical_join_204;
    }
    if (!(spill1535_10)) {
        break lexical_join_203;
    }
    this.a8 = ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1535_58(22502, (8871030247150993100L ^ life3_3))));
    this.a7 = ((net.minecraft.entity.player.EntityPlayer)(null));
    }
    lexicalValue1535_204_0 = life6_122;
    }
    if (!((life5_5 == 0))) {
        lexicalValue1535_302_0 = lexicalValue1535_204_0;
        break lexical_join_302;
    }
    if (!((lexicalValue1535_204_0 != 0))) {
        break lexical_join_296;
    }
    spill1535_11 = this;
    if (!((life5_5 == 0))) {
        lexicalValue1535_220_0 = spill1535_11;
        break lexical_join_220;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill1535_11)).i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(2)));
    if (!((p0 != net.minecraft.util.DamageSource.f))) {
        break lexical_join_219;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).q();
    }
    lexicalValue1535_220_0 = life7_198;
    }
    if (!((life5_5 == 0))) {
        lexicalValue1535_224_0 = lexicalValue1535_220_0;
        break lexical_join_224;
    }
    if (!((lexicalValue1535_220_0 != null))) {
        break lexical_join_283;
    }
    lexicalValue1535_224_0 = life7_198;
    }
    life8_320 = (((net.minecraft.entity.Entity)(lexicalValue1535_224_0)).n - this.n);
    life10_326 = (((net.minecraft.entity.Entity)(life7_198)).p - this.p);
    lexical_cycle_235: while (true) {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((life8_320 * life8_320) + (life10_326 * life10_326)))), ((double)(0x1.a36e2eb1c432dp-14d))) < 0))) {
        break lexical_join_261;
    }
    life8_320 = ((java.lang.Math.random() - java.lang.Math.random()) * 0x1.47ae147ae147bp-7d);
    life10_326 = ((java.lang.Math.random() - java.lang.Math.random()) * 0x1.47ae147ae147bp-7d);
    if (!((life5_5 == 0))) {
        break lexical_join_281;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_235; }
    break lexical_cycle_235;
    }
    }
    this.aQ = ((float)(((float) (((moom.Dr.b(((double)(life10_326)), ((double)(life8_320))) * 0x1.68p7d) / 0x1.921fb54442d18p1d) - ((double) this.w)))));
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.entity.Entity)(life7_198)), ((float)(p1)), ((double)(life8_320)), ((double)(life10_326)));
    }
    if (!((life5_5 != 0))) {
        break lexical_join_296;
    }
    }
    this.aQ = ((float)(((float) (((int) (java.lang.Math.random() * 0x1.0p1d)) * __sourceIntrinsic_153a193fc182_invokedynamic1535_79(22573, (2899749089866264833L ^ life3_3))))));
    }
    spill1535_12 = this;
    if (!((life5_5 == 0))) {
        lexicalValue1535_325_0 = spill1535_12;
        break lexical_join_325;
    }
    lexicalValue1535_302_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.EntityLivingBase)(spill1535_12)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue1535_302_0 <= 0))) {
        break lexical_join_324;
    }
    life8_406 = ((net.minecraft.entity.EntityLivingBase)(this)).h__String();
    if (!((life5_5 == 0))) {
        break lexical_join_322;
    }
    if (!((life6_122 != 0))) {
        break lexical_join_319;
    }
    if (!((life8_406 != null))) {
        break lexical_join_319;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((java.lang.String)(life8_406)), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).f__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).g__sourceReturn_bc607678b6())));
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    }
    if (!((life5_5 != 0))) {
        break lexical_join_340;
    }
    }
    lexicalValue1535_325_0 = this;
    }
    life8_439 = ((net.minecraft.entity.EntityLivingBase)(lexicalValue1535_325_0)).c__String();
    spill1535_13 = life6_122;
    if (!((life5_5 == 0))) {
        lexicalValue1535_341_0 = spill1535_13;
        break lexical_join_341;
    }
    if (!((spill1535_13 != 0))) {
        break lexical_join_340;
    }
    if (!((life8_439 != null))) {
        break lexical_join_340;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((java.lang.String)(life8_439)), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).f__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLivingBase)(this)).g__sourceReturn_bc607678b6())));
    }
    lexicalValue1535_341_0 = 1;
    }
    return ((lexicalValue1535_341_0) != 0);
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
net.minecraft.entity.Entity forwardValue4948_27_0;
    net.minecraft.entity.Entity forwardValue4948_31_0;
    int forwardValue4948_60_0;
    net.minecraft.entity.EntityLivingBase forwardValue4948_76_0;
    int forwardValue4948_76_1;
    net.minecraft.entity.EntityLivingBase forwardValue4948_77_0;
    net.minecraft.entity.EntityLivingBase forwardValue4948_78_0;
    int forwardValue4948_78_1;
    net.minecraft.entity.EntityLivingBase forwardValue4948_87_0;
    int forwardValue4948_87_1;
    net.minecraft.entity.EntityLivingBase forwardValue4948_88_0;
    net.minecraft.entity.EntityLivingBase forwardValue4948_89_0;
    int forwardValue4948_89_1;
    net.minecraft.entity.EntityLivingBase forwardValue4948_112_0;
    net.minecraft.world.World forwardValue4948_113_0;
    int spill4948_0;
    net.minecraft.entity.EntityLivingBase spill4948_1;
    net.minecraft.entity.EntityLivingBase spill4948_2;
    net.minecraft.world.World spill4948_3;
    int spill4948_4;
    net.minecraft.entity.EntityLivingBase spill4948_5;
    net.minecraft.world.World spill4948_6;
    net.minecraft.entity.EntityLivingBase spill4948_7;
    int spill4948_8;
    net.minecraft.entity.EntityLivingBase spill4948_9;
    int spill4948_10;
    net.minecraft.entity.EntityLivingBase spill4948_11;
    net.minecraft.entity.EntityLivingBase spill4948_12;
    long life2_3;
    net.minecraft.entity.Entity life5_7;
    int life4_8;
    net.minecraft.entity.EntityLivingBase life6_11;
    int life7_64;
    forward_join_113: {
    forward_join_112: {
    forward_join_111: {
    forward_join_89: {
    forward_join_88: {
    forward_join_87: {
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_60: {
    forward_join_56: {
    forward_join_33: {
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 6120819553915L);
    spill4948_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_7 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    life4_8 = spill4948_0;
    life6_11 = ((net.minecraft.entity.EntityLivingBase)(this)).c__sG();
    spill4948_1 = this;
    if (!((life4_8 == 0))) {
        forwardValue4948_27_0 = spill4948_1;
        break forward_join_27;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill4948_1)).bf >= 0))) {
        break forward_join_26;
    }
    spill4948_2 = life6_11;
    if (!((life4_8 == 0))) {
        forwardValue4948_27_0 = spill4948_2;
        break forward_join_27;
    }
    if (!((spill4948_2 != null))) {
        break forward_join_26;
    }
    ((net.minecraft.entity.EntityLivingBase)(life6_11)).a(((net.minecraft.entity.Entity)(this)), ((int)(this.bf)));
    }
    forwardValue4948_27_0 = life5_7;
    }
    if (!((life4_8 == 0))) {
        forwardValue4948_31_0 = forwardValue4948_27_0;
        break forward_join_31;
    }
    if (!((forwardValue4948_27_0 != null))) {
        break forward_join_33;
    }
    forwardValue4948_31_0 = life5_7;
    }
    ((net.minecraft.entity.Entity)(forwardValue4948_31_0)).a(((net.minecraft.entity.EntityLivingBase)(this)));
    }
    this.a9 = ((boolean)(true));
    ((net.minecraft.util.CombatTracker)(((net.minecraft.entity.EntityLivingBase)(this)).a__CS())).c();
    spill4948_3 = this.i;
    if (!((life4_8 == 0))) {
        forwardValue4948_113_0 = spill4948_3;
        break forward_join_113;
    }
    if (!((!((net.minecraft.world.World)(spill4948_3)).G))) {
        break forward_join_111;
    }
    life7_64 = 0;
    spill4948_4 = ((life5_7 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_8 == 0))) {
        forwardValue4948_60_0 = spill4948_4;
        break forward_join_60;
    }
    if (!((spill4948_4 != 0))) {
        break forward_join_56;
    }
    life7_64 = moom.rV.g(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life5_7)))));
    }
    spill4948_5 = this;
    if (!((life4_8 == 0))) {
        forwardValue4948_112_0 = spill4948_5;
        break forward_join_112;
    }
    forwardValue4948_60_0 = ((((net.minecraft.entity.EntityLivingBase)(spill4948_5)).d__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4948_60_0 != 0))) {
        break forward_join_111;
    }
    spill4948_6 = this.i;
    if (!((life4_8 == 0))) {
        forwardValue4948_113_0 = spill4948_6;
        break forward_join_113;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(spill4948_6)).a__Ej())).a__Boolean(((java.lang.String)("doMobLoot"))))) {
        break forward_join_111;
    }
    spill4948_7 = this;
    spill4948_8 = this.a8;
    if (!((life4_8 == 0))) {
        forwardValue4948_76_0 = spill4948_7;
        forwardValue4948_76_1 = spill4948_8;
        break forward_join_76;
    }
    if (!((spill4948_8 > 0))) {
        forwardValue4948_77_0 = spill4948_7;
        break forward_join_77;
    }
    forwardValue4948_76_0 = spill4948_7;
    forwardValue4948_76_1 = 1;
    }
    forwardValue4948_78_0 = forwardValue4948_76_0;
    forwardValue4948_78_1 = forwardValue4948_76_1;
    break forward_join_78;
    }
    forwardValue4948_78_0 = forwardValue4948_77_0;
    forwardValue4948_78_1 = 0;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4948_78_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4948_78_1))), ((int)(life7_64)));
    spill4948_9 = this;
    spill4948_10 = this.a8;
    if (!((life4_8 == 0))) {
        forwardValue4948_87_0 = spill4948_9;
        forwardValue4948_87_1 = spill4948_10;
        break forward_join_87;
    }
    if (!((spill4948_10 > 0))) {
        forwardValue4948_88_0 = spill4948_9;
        break forward_join_88;
    }
    forwardValue4948_87_0 = spill4948_9;
    forwardValue4948_87_1 = 1;
    }
    forwardValue4948_89_0 = forwardValue4948_87_0;
    forwardValue4948_89_1 = forwardValue4948_87_1;
    break forward_join_89;
    }
    forwardValue4948_89_0 = forwardValue4948_88_0;
    forwardValue4948_89_1 = 0;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4948_89_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4948_89_1))), ((int)(life7_64)));
    spill4948_11 = this;
    if (!((life4_8 == 0))) {
        forwardValue4948_112_0 = spill4948_11;
        break forward_join_112;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill4948_11)).a8 > 0))) {
        break forward_join_111;
    }
    spill4948_12 = this;
    if (!((life4_8 == 0))) {
        forwardValue4948_112_0 = spill4948_12;
        break forward_join_112;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.entity.EntityLivingBase)(spill4948_12)).ah)).nextFloat())), ((float)((0x1.99999ap-6f + (((float) life7_64) * 0x1.47ae14p-7f))))) < 0))) {
        break forward_join_111;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).A__sourceReturn_da8c82d5d4();
    }
    forwardValue4948_112_0 = this;
    }
    forwardValue4948_113_0 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4948_112_0)).i;
    }
    ((net.minecraft.world.World)(forwardValue4948_113_0)).a(((net.minecraft.entity.Entity)(this)), ((byte)(3)));
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1, double p2, double p3) {
double forwardValue4945_26_0;
    double forwardValue4945_26_1;
    net.minecraft.entity.EntityLivingBase forwardValue4945_88_0;
    double spill4945_0;
    double spill4945_1;
    net.minecraft.entity.EntityLivingBase spill4945_2;
    long life7_3;
    int life9_5;
    float life10_34;
    float life11_36;
    forward_join_90: {
    forward_join_88: {
    forward_join_26: {
    life7_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 137725218406489L);
    life9_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4945_0 = ((java.util.Random)(this.ah)).nextDouble();
    spill4945_1 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.d))))).b();
    if (!((life9_5 != 0))) {
        forwardValue4945_26_0 = spill4945_0;
        forwardValue4945_26_1 = spill4945_1;
        break forward_join_26;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill4945_0)), ((double)(spill4945_1))) >= 0))) {
        break forward_join_90;
    }
    this.ad = ((boolean)(true));
    forwardValue4945_26_0 = (p2 * p2);
    forwardValue4945_26_1 = (p3 * p3);
    }
    life10_34 = moom.Dr.a__Float(((double)((forwardValue4945_26_0 + forwardValue4945_26_1))));
    life11_36 = 0x1.99999ap-2f;
    net.minecraft.entity.EntityLivingBase __stackOp4945_10_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4945_10_0)).t = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4945_10_0)).t / 0x1.0p1d)));
    net.minecraft.entity.EntityLivingBase __stackOp4945_13_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4945_13_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4945_13_0)).u / 0x1.0p1d)));
    net.minecraft.entity.EntityLivingBase __stackOp4945_16_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4945_16_0)).v = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4945_16_0)).v / 0x1.0p1d)));
    net.minecraft.entity.EntityLivingBase __stackOp4945_19_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4945_19_0)).t = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4945_19_0)).t - ((p2 / ((double) life10_34)) * ((double) life11_36)))));
    net.minecraft.entity.EntityLivingBase __stackOp4945_22_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4945_22_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4945_22_0)).u + ((double) life11_36))));
    net.minecraft.entity.EntityLivingBase __stackOp4945_25_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4945_25_0)).v = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4945_25_0)).v - ((p3 / ((double) life10_34)) * ((double) life11_36)))));
    spill4945_2 = this;
    if (!((life9_5 != 0))) {
        forwardValue4945_88_0 = spill4945_2;
        break forward_join_88;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(spill4945_2)).u)), ((double)(0x1.99999ap-2d))) > 0))) {
        break forward_join_90;
    }
    forwardValue4945_88_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4945_88_0)).u = ((double)(0x1.99999ap-2d));
    }
    return;
}


public abstract net.minecraft.item.ItemStack a__xW();

public boolean a__Boolean(net.minecraft.potion.Potion p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.aJ)).containsKey(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.potion.Potion)(p0)).I)))))))) != 0);
}


public abstract net.minecraft.item.ItemStack[] a__ArrayxW();

protected void a(net.minecraft.potion.PotionEffect p0, boolean p1) {
int forwardValue4947_16_0;
    int spill4947_0;
    boolean spill4947_1;
    long life3_3;
    int life5_8;
    forward_join_37: {
    forward_join_16: {
    life3_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 129966156393498L);
    spill4947_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    this.bs = ((boolean)(true));
    life5_8 = spill4947_0;
    spill4947_1 = p1;
    if (!((life5_8 == 0))) {
        forwardValue4947_16_0 = ((spill4947_1) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill4947_1)) {
        break forward_join_37;
    }
    forwardValue4947_16_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((forwardValue4947_16_0 == 0))) {
        break forward_join_37;
    }
    ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(p0)).a()])).a(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())), ((int)(((net.minecraft.potion.PotionEffect)(p0)).c())));
    ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(p0)).a()])).b(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.EntityLivingBase)(this)).a__vE())), ((int)(((net.minecraft.potion.PotionEffect)(p0)).c())));
    }
    return;
}


public boolean m__Boolean() {
int forwardValue4974_12_0;
    int forwardValue4974_14_0;
    boolean spill4974_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 39304927338000L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4974_0 = this.F;
    if (!((life3_5 != 0))) {
        forwardValue4974_12_0 = ((spill4974_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill4974_0))) {
        break forward_join_13;
    }
    forwardValue4974_12_0 = 1;
    }
    forwardValue4974_14_0 = forwardValue4974_12_0;
    break forward_join_14;
    }
    forwardValue4974_14_0 = 0;
    }
    return ((forwardValue4974_14_0) != 0);
}


public boolean p__Boolean() {
int forwardValue4976_15_0;
    int forwardValue4976_19_0;
    int forwardValue4976_21_0;
    boolean spill4976_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 71654849484281L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4976_0 = this.F;
    if (!((life3_5 == 0))) {
        forwardValue4976_15_0 = ((spill4976_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill4976_0))) {
        break forward_join_20;
    }
    forwardValue4976_15_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.EntityLivingBase)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 == 0))) {
        forwardValue4976_19_0 = forwardValue4976_15_0;
        break forward_join_19;
    }
    if (!((forwardValue4976_15_0 > 0))) {
        break forward_join_20;
    }
    forwardValue4976_19_0 = 1;
    }
    forwardValue4976_21_0 = forwardValue4976_19_0;
    break forward_join_21;
    }
    forwardValue4976_21_0 = 0;
    }
    return ((forwardValue4976_21_0) != 0);
}


protected void k__Void() {
((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.j)), ((float)(0x1.0p2f)));
    return;
}


private int k() {
int forwardValue4973_26_0;
    int forwardValue4973_45_0;
    int forwardValue4973_62_0;
    int forwardValue4973_68_0;
    net.minecraft.entity.EntityLivingBase forwardValue4973_70_0;
    net.minecraft.entity.EntityLivingBase forwardValue4973_89_0;
    int forwardValue4973_110_0;
    int forwardValue4973_127_0;
    int forwardValue4973_133_0;
    int spill4973_0;
    boolean spill4973_1;
    net.minecraft.entity.EntityLivingBase spill4973_2;
    boolean spill4973_3;
    long life1_3;
    int life3_7;
    forward_join_133: {
    forward_join_128: {
    forward_join_127: {
    forward_join_110: {
    forward_join_107: {
    forward_join_89: {
    forward_join_88: {
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_63: {
    forward_join_62: {
    forward_join_45: {
    forward_join_42: {
    forward_join_26: {
    forward_join_23: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 36575538833023L);
    spill4973_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    ((net.minecraft.entity.EntityLivingBase)(this)).M();
    life3_7 = spill4973_0;
    spill4973_1 = ((com.moon.module.impl.Animations)(this.bA)).isEnabled();
    if (!((life3_7 != 0))) {
        forwardValue4973_26_0 = ((spill4973_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill4973_1)) {
        break forward_join_23;
    }
    spill4973_2 = this;
    if (!((life3_7 != 0))) {
        forwardValue4973_70_0 = spill4973_2;
        break forward_join_70;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Animations)(((net.minecraft.entity.EntityLivingBase)(spill4973_2)).bA)).a__kV())).getValue())))).booleanValue()))) {
        break forward_join_69;
    }
    }
    forwardValue4973_26_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f)))) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        forwardValue4973_45_0 = forwardValue4973_26_0;
        break forward_join_45;
    }
    if (!((forwardValue4973_26_0 != 0))) {
        break forward_join_42;
    }
    forwardValue4973_68_0 = (__sourceIntrinsic_20cd551c5375_invokedynamic4973_14(30188, (1540300495806721326L ^ life1_3)) - (1 + ((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f))))).c()));
    break forward_join_68;
    }
    forwardValue4973_45_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g)))) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        forwardValue4973_62_0 = forwardValue4973_45_0;
        break forward_join_62;
    }
    if (!((forwardValue4973_45_0 != 0))) {
        break forward_join_63;
    }
    forwardValue4973_62_0 = (__sourceIntrinsic_20cd551c5375_invokedynamic4973_21(30188, (1540300495806721326L ^ life1_3)) + ((1 + ((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g))))).c()) * 2));
    }
    forwardValue4973_68_0 = forwardValue4973_62_0;
    break forward_join_68;
    }
    forwardValue4973_68_0 = __sourceIntrinsic_20cd551c5375_invokedynamic4973_25(30188, (1540300495806721326L ^ life1_3));
    }
    return forwardValue4973_68_0;
    }
    forwardValue4973_70_0 = this;
    }
    if (!((life3_7 != 0))) {
        forwardValue4973_89_0 = forwardValue4973_70_0;
        break forward_join_89;
    }
    if (!((forwardValue4973_70_0 == ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K))) {
        break forward_join_88;
    }
    return (__sourceIntrinsic_20cd551c5375_invokedynamic4973_28(5103, (4710279349563755305L ^ life1_3)) + ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Animations)(this.bA)).a())).getValue())))).intValue());
    }
    forwardValue4973_89_0 = this;
    }
    spill4973_3 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4973_89_0)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f)));
    if (!((life3_7 != 0))) {
        forwardValue4973_110_0 = ((spill4973_3) ? 1 : 0);
        break forward_join_110;
    }
    if (!(spill4973_3)) {
        break forward_join_107;
    }
    forwardValue4973_133_0 = (__sourceIntrinsic_20cd551c5375_invokedynamic4973_37(30188, (1540300495806721326L ^ life1_3)) - (1 + ((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f))))).c()));
    break forward_join_133;
    }
    forwardValue4973_110_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g)))) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        forwardValue4973_127_0 = forwardValue4973_110_0;
        break forward_join_127;
    }
    if (!((forwardValue4973_110_0 != 0))) {
        break forward_join_128;
    }
    forwardValue4973_127_0 = (__sourceIntrinsic_20cd551c5375_invokedynamic4973_44(30188, (1540300495806721326L ^ life1_3)) + ((1 + ((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g))))).c()) * 2));
    }
    forwardValue4973_133_0 = forwardValue4973_127_0;
    break forward_join_133;
    }
    forwardValue4973_133_0 = __sourceIntrinsic_20cd551c5375_invokedynamic4973_48(30188, (1540300495806721326L ^ life1_3));
    }
    return forwardValue4973_133_0;
}


public void g(net.minecraft.entity.Entity p0) {
int forestValue1106_26_0;
    int forestValue1106_52_0;
    int forestValue1106_107_0;
    net.minecraft.entity.EntityLivingBase forestValue1106_139_0;
    int spill1106_0;
    int spill1106_1;
    int spill1106_2;
    boolean spill1106_3;
    net.minecraft.entity.EntityLivingBase spill1106_4;
    net.minecraft.entity.EntityLivingBase spill1106_5;
    long life2_3;
    double life5_6;
    double life7_15;
    int life4_16;
    double life9_19;
    int life11_21;
    int life12_24;
    int life13_32;
    int life14_56;
    int life15_63;
    moom.CA life16_72;
    forest_join_173: {
    forest_join_168: {
    forest_join_151: {
    life2_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 83147748221607L);
    life5_6 = ((net.minecraft.entity.Entity)(p0)).n;
    spill1106_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life7_15 = (((moom.CA)(__sourceExactCall_5f0a1ab2f67043(((net.minecraft.entity.Entity)(p0))))).c + ((double) ((net.minecraft.entity.Entity)(p0)).H));
    life4_16 = spill1106_0;
    life9_19 = ((net.minecraft.entity.Entity)(p0)).p;
    life11_21 = 1;
    life12_24 = (-life11_21);
    forest_cycle_25: while (true) {
    forest_join_147: {
    forestValue1106_26_0 = life12_24;
    forest_cycle_26: while (true) {
    if (!((forestValue1106_26_0 <= life11_21))) {
        break forest_join_168;
    }
    if (!((life4_16 != 0))) {
        break forest_join_173;
    }
    life13_32 = (-life11_21);
    forest_cycle_33: while (true) {
    forest_join_145: {
    forest_join_144: {
    forest_join_139: {
    forest_join_127: {
    forest_join_107: {
    forest_join_92: {
    forest_join_52: {
    forest_join_46: {
    if (!((life13_32 < life11_21))) {
        break forest_join_147;
    }
    spill1106_1 = life12_24;
    if (!((life4_16 != 0))) {
        forestValue1106_26_0 = spill1106_1;
        continue forest_cycle_26;
    }
    if (!((life4_16 != 0))) {
        forestValue1106_52_0 = spill1106_1;
        break forest_join_52;
    }
    if (!((spill1106_1 == 0))) {
        break forest_join_46;
    }
    spill1106_2 = life13_32;
    if (!((life4_16 != 0))) {
        forestValue1106_52_0 = spill1106_2;
        break forest_join_52;
    }
    if (!((spill1106_2 != 0))) {
        break forest_join_144;
    }
    }
    forestValue1106_52_0 = ((int) (this.n + ((double) life12_24)));
    }
    life14_56 = forestValue1106_52_0;
    life15_63 = ((int) (this.p + ((double) life13_32)));
    life16_72 = ((moom.CA)(__sourceExactCall_e4ba113737a0ef(((net.minecraft.entity.EntityLivingBase)(this))))).c(((double)(((double) life12_24))), ((double)(0x1.0p0d)), ((double)(((double) life13_32))));
    if (!((life4_16 != 0))) {
        break forest_join_145;
    }
    if (!(((java.util.List)(((net.minecraft.world.World)(this.i)).a(((moom.CA)(life16_72))))).isEmpty())) {
        break forest_join_144;
    }
    spill1106_3 = __sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(this.i)), ((moom.DT)(new moom.DT(life14_56, ((int) this.o), life15_63))));
    if (!((life4_16 != 0))) {
        forestValue1106_107_0 = ((spill1106_3) ? 1 : 0);
        break forest_join_107;
    }
    if (!(spill1106_3)) {
        break forest_join_92;
    }
    break forest_join_151;
    }
    spill1106_4 = this;
    if (!((life4_16 != 0))) {
        forestValue1106_139_0 = spill1106_4;
        break forest_join_139;
    }
    forestValue1106_107_0 = ((__sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(((net.minecraft.entity.EntityLivingBase)(spill1106_4)).i)), ((moom.DT)(new moom.DT(life14_56, (((int) this.o) - 1), life15_63))))) ? 1 : 0);
    }
    if (!((forestValue1106_107_0 == 0))) {
        break forest_join_127;
    }
    spill1106_5 = this;
    if (!((life4_16 != 0))) {
        forestValue1106_139_0 = spill1106_5;
        break forest_join_139;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill1106_5)).i)).a__fE(((moom.DT)(new moom.DT(life14_56, (((int) this.o) - 1), life15_63)))))).a__ch())).a__fn() == moom.fn.h))) {
        break forest_join_144;
    }
    }
    life5_6 = (this.n + ((double) life12_24));
    life7_15 = (this.o + 0x1.0p0d);
    forestValue1106_139_0 = this;
    }
    life9_19 = (((net.minecraft.entity.EntityLivingBase)(forestValue1106_139_0)).p + ((double) life13_32));
    }
    life13_32 += 1;
    }
    if (!((life4_16 == 0))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    break forest_cycle_26;
    }
    }
    life12_24 += 1;
    if (!((life4_16 == 0))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    break forest_join_168;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).e(((double)((this.n + ((double) life12_24)))), ((double)((this.o + 0x1.0p0d))), ((double)((this.p + ((double) life13_32)))));
    return;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).e(((double)(life5_6)), ((double)(life7_15)), ((double)(life9_19)));
    }
    return;
}


public void g(int p0) {
((java.util.Map)(this.aJ)).remove(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


public void g(float p0) {
long local2 = (net.minecraft.entity.EntityLivingBase.hb ^ 87500101677026L);
    int local4 = net.minecraft.entity.SharedMonsterAttributes.b();
    if ((local4 == 0)) {
        if ((p0 < 0x0.0p0f)) {
        p0 = 0x0.0p0f;
    }
        this.bz = ((float)(p0));
    }
    return;
}


public void g__Void() {
int lexicalValue1542_49_0;
    int lexicalValue1542_58_0;
    net.minecraft.item.ItemStack lexicalValue1542_102_0;
    net.minecraft.item.ItemStack[] lexicalValue1542_117_0;
    int lexicalValue1542_117_1;
    net.minecraft.item.ItemStack[] lexicalValue1542_118_0;
    int lexicalValue1542_118_1;
    net.minecraft.item.ItemStack lexicalValue1542_118_2;
    net.minecraft.item.ItemStack[] lexicalValue1542_119_0;
    int lexicalValue1542_119_1;
    net.minecraft.item.ItemStack lexicalValue1542_119_2;
    int lexicalValue1542_133_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1542_140_0;
    int lexicalValue1542_201_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1542_220_0;
    int lexicalValue1542_226_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1542_255_0;
    int spill1542_0;
    net.minecraft.entity.EntityLivingBase spill1542_1;
    int spill1542_2;
    int spill1542_3;
    boolean spill1542_4;
    net.minecraft.item.ItemStack spill1542_5;
    net.minecraft.item.ItemStack[] spill1542_6;
    int spill1542_7;
    net.minecraft.item.ItemStack spill1542_8;
    net.minecraft.entity.EntityLivingBase spill1542_9;
    int spill1542_10;
    net.minecraft.entity.EntityLivingBase spill1542_11;
    net.minecraft.entity.EntityLivingBase spill1542_12;
    long life1_3;
    int life3_7;
    int life4_19;
    int life5_79;
    net.minecraft.item.ItemStack life6_87;
    net.minecraft.item.ItemStack life7_91;
    double life4_194;
    double life6_200;
    float life8_209;
    float life9_212;
    float life10_214;
    float life11_220;
    net.minecraft.entity.EntityLivingBase life13_261;
    net.minecraft.client.entity.EntityPlayerSP life12_272;
    lexical_join_418: {
    lexical_join_413: {
    lexical_join_403: {
    lexical_join_385: {
    lexical_join_367: {
    lexical_join_349: {
    lexical_join_331: {
    lexical_join_313: {
    lexical_join_295: {
    lexical_join_277: {
    lexical_join_255: {
    lexical_join_229: {
    lexical_join_226: {
    lexical_join_222: {
    lexical_join_220: {
    lexical_join_219: {
    lexical_join_201: {
    lexical_join_197: {
    lexical_join_140: {
    lexical_join_137: {
    lexical_join_133: {
    lexical_join_123: {
    lexical_join_58: {
    lexical_join_57: {
    lexical_join_49: {
    lexical_join_41: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 24461341653108L);
    spill1542_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    super.g__Void();
    life3_7 = spill1542_0;
    spill1542_1 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1542_140_0 = spill1542_1;
        break lexical_join_140;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill1542_1)).i)).G))) {
        break lexical_join_137;
    }
    life4_19 = ((net.minecraft.entity.EntityLivingBase)(this)).j__Int();
    spill1542_2 = life4_19;
    if (!((life3_7 != 0))) {
        lexicalValue1542_58_0 = spill1542_2;
        break lexical_join_58;
    }
    if (!((spill1542_2 > 0))) {
        break lexical_join_57;
    }
    spill1542_3 = this.aN;
    if (!((life3_7 != 0))) {
        lexicalValue1542_49_0 = spill1542_3;
        break lexical_join_49;
    }
    if (!((spill1542_3 <= 0))) {
        break lexical_join_41;
    }
    this.aN = ((int)((__sourceIntrinsic_736a66cda11e_invokedynamic1542_7(25734, (6725935970872451675L ^ life1_3)) * (__sourceIntrinsic_736a66cda11e_invokedynamic1542_8(12268, (1114532431343659298L ^ life1_3)) - life4_19))));
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_10_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_10_0)).aN = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_10_0)).aN - 1)));
    lexicalValue1542_49_0 = this.aN;
    }
    if (!((life3_7 != 0))) {
        lexicalValue1542_58_0 = lexicalValue1542_49_0;
        break lexical_join_58;
    }
    if (!((lexicalValue1542_49_0 <= 0))) {
        break lexical_join_57;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).i(((int)((life4_19 - 1))));
    }
    lexicalValue1542_58_0 = 0;
    }
    life5_79 = lexicalValue1542_58_0;
    lexical_cycle_59: while (true) {
    lexical_join_121: {
    lexical_join_120: {
    lexical_join_119: {
    lexical_join_118: {
    lexical_join_117: {
    lexical_join_108: {
    lexical_join_102: {
    lexical_join_101: {
    if (!((life5_79 < 5))) {
        break lexical_join_123;
    }
    life6_87 = (this.aK)[life5_79];
    life7_91 = ((net.minecraft.entity.EntityLivingBase)(this)).a__xW(((int)(life5_79)));
    if (!((life3_7 != 0))) {
        break lexical_join_121;
    }
    spill1542_4 = __sourceExactCall_fac9e73638a8b5(((net.minecraft.item.ItemStack)(life7_91)), ((net.minecraft.item.ItemStack)(life6_87)));
    if (!((life3_7 != 0))) {
        lexicalValue1542_133_0 = ((spill1542_4) ? 1 : 0);
        break lexical_join_133;
    }
    if (!((!spill1542_4))) {
        break lexical_join_120;
    }
    ((net.minecraft.entity.EntityTracker)(((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(this.i)))).a__t2())).a(((net.minecraft.entity.Entity)(this)), ((moom.yK)(new moom.zx(((net.minecraft.entity.EntityLivingBase)(this)).e__Int(), life5_79, life7_91))));
    spill1542_5 = life6_87;
    if (!((life3_7 != 0))) {
        lexicalValue1542_102_0 = spill1542_5;
        break lexical_join_102;
    }
    if (!((spill1542_5 != null))) {
        break lexical_join_101;
    }
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(this.aH)).a(((com.google.common.collect.Multimap)(((net.minecraft.item.ItemStack)(life6_87)).a__Multimap())));
    }
    lexicalValue1542_102_0 = life7_91;
    }
    if (!((lexicalValue1542_102_0 != null))) {
        break lexical_join_108;
    }
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(this.aH)).b(((com.google.common.collect.Multimap)(((net.minecraft.item.ItemStack)(life7_91)).a__Multimap())));
    }
    spill1542_6 = this.aK;
    spill1542_7 = life5_79;
    spill1542_8 = life7_91;
    if (!((life3_7 != 0))) {
        lexicalValue1542_118_0 = spill1542_6;
        lexicalValue1542_118_1 = spill1542_7;
        lexicalValue1542_118_2 = spill1542_8;
        break lexical_join_118;
    }
    if (!((spill1542_8 == null))) {
        lexicalValue1542_117_0 = spill1542_6;
        lexicalValue1542_117_1 = spill1542_7;
        break lexical_join_117;
    }
    lexicalValue1542_119_0 = spill1542_6;
    lexicalValue1542_119_1 = spill1542_7;
    lexicalValue1542_119_2 = null;
    break lexical_join_119;
    }
    lexicalValue1542_118_0 = lexicalValue1542_117_0;
    lexicalValue1542_118_1 = lexicalValue1542_117_1;
    lexicalValue1542_118_2 = life7_91;
    }
    lexicalValue1542_119_0 = lexicalValue1542_118_0;
    lexicalValue1542_119_1 = lexicalValue1542_118_1;
    lexicalValue1542_119_2 = ((net.minecraft.item.ItemStack)(lexicalValue1542_118_2)).a__xW();
    }
    (lexicalValue1542_119_0)[lexicalValue1542_119_1] = lexicalValue1542_119_2;
    }
    life5_79 += 1;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_59; }
    break lexical_cycle_59;
    }
    }
    spill1542_9 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1542_140_0 = spill1542_9;
        break lexical_join_140;
    }
    lexicalValue1542_133_0 = (((net.minecraft.entity.EntityLivingBase)(spill1542_9)).S % __sourceIntrinsic_736a66cda11e_invokedynamic1542_33(25734, (6725935970872451675L ^ life1_3)));
    }
    if (!((lexicalValue1542_133_0 == 0))) {
        break lexical_join_137;
    }
    ((net.minecraft.util.CombatTracker)(((net.minecraft.entity.EntityLivingBase)(this)).a__CS())).c();
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).G();
    lexicalValue1542_140_0 = this;
    }
    life4_194 = (((net.minecraft.entity.EntityLivingBase)(lexicalValue1542_140_0)).n - this.k);
    life6_200 = (this.p - this.m);
    life8_209 = ((float) ((life4_194 * life4_194) + (life6_200 * life6_200)));
    life9_212 = this.a2;
    life10_214 = 0x0.0p0f;
    this.ba = ((float)(this.bb));
    life11_220 = 0x0.0p0f;
    spill1542_10 = recovery.source.CarrierOps.fcmpl(((float)(life8_209)), ((float)(0x1.47ae16p-9f)));
    if (!((life3_7 != 0))) {
        lexicalValue1542_201_0 = spill1542_10;
        break lexical_join_201;
    }
    if (!((spill1542_10 > 0))) {
        break lexical_join_197;
    }
    life11_220 = 0x1.0p0f;
    life10_214 = (((float) java.lang.Math.sqrt(((double)(((double) life8_209))))) * 0x1.8p1f);
    life9_212 = (((((float) moom.Dr.b(((double)(life6_200)), ((double)(life4_194)))) * 0x1.68p7f) / 0x1.921fb6p1f) - 0x1.68p6f);
    }
    lexicalValue1542_201_0 = recovery.source.CarrierOps.fcmpl(((float)(this.aT)), ((float)(0x0.0p0f)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1542_226_0 = lexicalValue1542_201_0;
        break lexical_join_226;
    }
    if (!((lexicalValue1542_201_0 > 0))) {
        break lexical_join_222;
    }
    life13_261 = this;
    spill1542_11 = life13_261;
    if (!((life3_7 != 0))) {
        lexicalValue1542_220_0 = spill1542_11;
        break lexical_join_220;
    }
    if (!((((spill1542_11 instanceof net.minecraft.client.entity.EntityPlayerSP) ? 1 : 0) != 0))) {
        break lexical_join_219;
    }
    life12_272 = ((net.minecraft.client.entity.EntityPlayerSP)(life13_261));
    life9_212 = ((net.minecraft.client.entity.EntityPlayerSP)(life12_272)).cM;
    if (!((life3_7 == 0))) {
        break lexical_join_222;
    }
    }
    lexicalValue1542_220_0 = this;
    }
    life9_212 = ((net.minecraft.entity.EntityLivingBase)(lexicalValue1542_220_0)).w;
    }
    spill1542_12 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1542_255_0 = spill1542_12;
        break lexical_join_255;
    }
    lexicalValue1542_226_0 = ((((net.minecraft.entity.EntityLivingBase)(spill1542_12)).A) ? 1 : 0);
    }
    if (!((lexicalValue1542_226_0 == 0))) {
        break lexical_join_229;
    }
    life11_220 = 0x0.0p0f;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_55_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_55_0)).bb = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_55_0)).bb + ((life11_220 - this.bb) * 0x1.333334p-2f))));
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("headTurn")));
    life10_214 = ((net.minecraft.entity.EntityLivingBase)(this)).a__sourceReturn_e70c882bc6(((float)(life9_212)), ((float)(life10_214)));
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    lexicalValue1542_255_0 = this;
    }
    ((moom.A9)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(lexicalValue1542_255_0)).i)).D)).a__Void(((java.lang.String)("rangeChecks")));
    lexical_cycle_259: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.w - this.y))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_277;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_72_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_72_0)).y = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_72_0)).y - 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_295;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_259; }
    break lexical_cycle_259;
    }
    }
    lexical_cycle_277: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.w - this.y))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_295;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_78_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_78_0)).y = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_78_0)).y + 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_313;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_277; }
    break lexical_cycle_277;
    }
    }
    lexical_cycle_295: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.a2 - this.a3))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_313;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_84_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_84_0)).a3 = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_84_0)).a3 - 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_331;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_295; }
    break lexical_cycle_295;
    }
    }
    lexical_cycle_313: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.a2 - this.a3))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_331;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_90_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_90_0)).a3 = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_90_0)).a3 + 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_349;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_313; }
    break lexical_cycle_313;
    }
    }
    lexical_cycle_331: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.x - this.z))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_349;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_96_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_96_0)).z = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_96_0)).z - 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_367;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_331; }
    break lexical_cycle_331;
    }
    }
    lexical_cycle_349: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.x - this.z))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_367;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_102_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_102_0)).z = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_102_0)).z + 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_385;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_349; }
    break lexical_cycle_349;
    }
    }
    lexical_cycle_367: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.a4 - this.a5))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_385;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_108_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_108_0)).a5 = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_108_0)).a5 - 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_413;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_367; }
    break lexical_cycle_367;
    }
    }
    lexical_cycle_385: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.a4 - this.a5))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_403;
    }
    net.minecraft.entity.EntityLivingBase __stackOp1542_114_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_114_0)).a5 = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_114_0)).a5 + 0x1.68p8f)));
    if (!((life3_7 != 0))) {
        break lexical_join_413;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_385; }
    break lexical_cycle_385;
    }
    }
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    net.minecraft.entity.EntityLivingBase __stackOp1542_120_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp1542_120_0)).bc = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp1542_120_0)).bc + life10_214)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_418;
    }
    life3_7 += 1;
    net.minecraft.entity.SharedMonsterAttributes.b(((int)(life3_7)));
    }
    return;
}


protected float g__sourceReturn_bc607678b6() {
net.minecraft.entity.EntityLivingBase forwardValue4969_24_0;
    float forwardValue4969_34_0;
    net.minecraft.entity.EntityLivingBase spill4969_0;
    long life1_3;
    int life3_5;
    forward_join_34: {
    forward_join_24: {
    forward_join_23: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 108988267594289L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4969_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4969_24_0 = spill4969_0;
        break forward_join_24;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill4969_0)).c__Boolean())) {
        break forward_join_23;
    }
    forwardValue4969_34_0 = (((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.8p0f);
    break forward_join_34;
    }
    forwardValue4969_24_0 = this;
    }
    forwardValue4969_34_0 = (((((java.util.Random)(((net.minecraft.entity.EntityLivingBase)(forwardValue4969_24_0)).ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f);
    }
    return forwardValue4969_34_0;
}


public float j__sourceReturn_bc607678b6() {
return this.bz;
}


public final int j__Int() {
long local1 = (net.minecraft.entity.EntityLivingBase.hb ^ 97961638958930L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_e9516f9781f1_originalDynamicSite1884_2(23122, (7310418317555872694L ^ local1)))));
}


protected void q() {
net.minecraft.entity.EntityLivingBase forwardValue4977_19_0;
    int forwardValue4977_19_1;
    net.minecraft.entity.EntityLivingBase forwardValue4977_20_0;
    net.minecraft.entity.EntityLivingBase forwardValue4977_21_0;
    int forwardValue4977_21_1;
    net.minecraft.entity.EntityLivingBase spill4977_0;
    int spill4977_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 119610447764543L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4977_0 = this;
    spill4977_1 = recovery.source.CarrierOps.dcmpl(((double)(((java.util.Random)(this.ah)).nextDouble())), ((double)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.d))))).b())));
    if (!((life3_5 == 0))) {
        forwardValue4977_19_0 = spill4977_0;
        forwardValue4977_19_1 = spill4977_1;
        break forward_join_19;
    }
    if (!((spill4977_1 >= 0))) {
        forwardValue4977_20_0 = spill4977_0;
        break forward_join_20;
    }
    forwardValue4977_19_0 = spill4977_0;
    forwardValue4977_19_1 = 1;
    }
    forwardValue4977_21_0 = forwardValue4977_19_0;
    forwardValue4977_21_1 = forwardValue4977_19_1;
    break forward_join_21;
    }
    forwardValue4977_21_0 = forwardValue4977_20_0;
    forwardValue4977_21_1 = 0;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4977_21_0)).E = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4977_21_1)));
    return;
}


public void z__sourceReturn_da8c82d5d4() {
net.minecraft.entity.EntityLivingBase lexicalValue1545_33_0;
    int spill1545_0;
    net.minecraft.entity.EntityLivingBase spill1545_1;
    long life1_3;
    java.util.Iterator life4_9;
    int life3_10;
    java.lang.Integer life5_17;
    net.minecraft.potion.PotionEffect life6_23;
    lexical_join_37: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 57358338289656L);
    spill1545_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life4_9 = ((java.util.Set)(((java.util.Map)(this.aJ)).keySet())).iterator();
    life3_10 = spill1545_0;
    lexical_cycle_11: while (true) {
    lexical_join_35: {
    lexical_join_33: {
    if (!(((java.util.Iterator)(life4_9)).hasNext())) {
        break lexical_join_37;
    }
    life5_17 = ((java.lang.Integer)(((java.util.Iterator)(life4_9)).next()));
    life6_23 = ((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.aJ)).get(((java.lang.Object)(life5_17)))));
    spill1545_1 = this;
    if (!((life3_10 != 0))) {
        lexicalValue1545_33_0 = spill1545_1;
        break lexical_join_33;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill1545_1)).i)).G))) {
        break lexical_join_35;
    }
    ((java.util.Iterator)(life4_9)).remove();
    lexicalValue1545_33_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1545_33_0)).c(((net.minecraft.potion.PotionEffect)(life6_23)));
    }
    if (!((life3_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


protected void w__sourceReturn_da8c82d5d4() {
net.minecraft.entity.EntityLivingBase lexicalValue1544_41_0;
    int lexicalValue1544_53_0;
    int lexicalValue1544_62_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1544_74_0;
    int lexicalValue1544_84_0;
    int lexicalValue1544_97_0;
    int lexicalValue1544_99_0;
    int lexicalValue1544_105_0;
    int lexicalValue1544_125_0;
    int lexicalValue1544_129_0;
    int lexicalValue1544_131_0;
    int lexicalValue1544_145_0;
    int lexicalValue1544_145_1;
    int lexicalValue1544_146_0;
    int lexicalValue1544_147_0;
    int lexicalValue1544_147_1;
    int lexicalValue1544_150_0;
    int lexicalValue1544_154_0;
    int lexicalValue1544_170_0;
    net.minecraft.world.World lexicalValue1544_208_0;
    net.minecraft.world.World lexicalValue1544_209_0;
    net.minecraft.util.EnumParticleTypes lexicalValue1544_209_1;
    int spill1544_0;
    boolean spill1544_1;
    net.minecraft.entity.EntityLivingBase spill1544_2;
    net.minecraft.entity.EntityLivingBase spill1544_3;
    byte spill1544_4;
    int spill1544_5;
    boolean spill1544_6;
    int spill1544_7;
    int spill1544_8;
    int spill1544_9;
    net.minecraft.world.World spill1544_10;
    long life1_3;
    java.util.Iterator life4_9;
    int life3_10;
    java.lang.Integer life5_17;
    net.minecraft.potion.PotionEffect life6_23;
    int life5_117;
    int life6_135;
    int life7_144;
    int life7_156;
    double life8_239;
    double life10_256;
    double life12_267;
    lexical_join_249: {
    lexical_join_209: {
    lexical_join_208: {
    lexical_join_170: {
    lexical_join_154: {
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_147: {
    lexical_join_146: {
    lexical_join_145: {
    lexical_join_132: {
    lexical_join_131: {
    lexical_join_130: {
    lexical_join_129: {
    lexical_join_125: {
    lexical_join_117: {
    lexical_join_105: {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_84: {
    lexical_join_76: {
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_62: {
    lexical_join_60: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 100880300579767L);
    spill1544_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life4_9 = ((java.util.Set)(((java.util.Map)(this.aJ)).keySet())).iterator();
    life3_10 = spill1544_0;
    lexical_cycle_11: while (true) {
    lexical_join_58: {
    lexical_join_53: {
    lexical_join_45: {
    lexical_join_41: {
    if (!(((java.util.Iterator)(life4_9)).hasNext())) {
        break lexical_join_60;
    }
    life5_17 = ((java.lang.Integer)(((java.util.Iterator)(life4_9)).next()));
    life6_23 = ((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.aJ)).get(((java.lang.Object)(life5_17)))));
    spill1544_1 = ((net.minecraft.potion.PotionEffect)(life6_23)).a__Boolean(((net.minecraft.entity.EntityLivingBase)(this)));
    if (!((life3_10 == 0))) {
        lexicalValue1544_62_0 = ((spill1544_1) ? 1 : 0);
        break lexical_join_62;
    }
    if (!((life3_10 == 0))) {
        lexicalValue1544_53_0 = ((spill1544_1) ? 1 : 0);
        break lexical_join_53;
    }
    if (!((!spill1544_1))) {
        break lexical_join_45;
    }
    spill1544_2 = this;
    if (!((life3_10 == 0))) {
        lexicalValue1544_41_0 = spill1544_2;
        break lexical_join_41;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill1544_2)).i)).G))) {
        break lexical_join_58;
    }
    ((java.util.Iterator)(life4_9)).remove();
    lexicalValue1544_41_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1544_41_0)).c(((net.minecraft.potion.PotionEffect)(life6_23)));
    if (!((life3_10 != 0))) {
        break lexical_join_58;
    }
    }
    lexicalValue1544_53_0 = (((net.minecraft.potion.PotionEffect)(life6_23)).b() % __sourceIntrinsic_d7016c0856b9_invokedynamic1544_19(4209, (8457338576538695037L ^ life1_3)));
    }
    if (!((lexicalValue1544_53_0 == 0))) {
        break lexical_join_58;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).a(((net.minecraft.potion.PotionEffect)(life6_23)), ((boolean)(false)));
    }
    if (!((life3_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue1544_62_0 = ((this.bs) ? 1 : 0);
    }
    if (!((life3_10 == 0))) {
        lexicalValue1544_84_0 = lexicalValue1544_62_0;
        break lexical_join_84;
    }
    if (!((lexicalValue1544_62_0 != 0))) {
        break lexical_join_76;
    }
    spill1544_3 = this;
    if (!((life3_10 == 0))) {
        lexicalValue1544_74_0 = spill1544_3;
        break lexical_join_74;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(spill1544_3)).i)).G))) {
        break lexical_join_73;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).x();
    }
    lexicalValue1544_74_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(lexicalValue1544_74_0)).bs = ((boolean)(false));
    }
    lexicalValue1544_84_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_d7016c0856b9_invokedynamic1544_28(11290, (3965204175484569868L ^ life1_3)))));
    }
    life5_117 = lexicalValue1544_84_0;
    spill1544_4 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_d7016c0856b9_invokedynamic1544_31(30123, (5740069521693839536L ^ life1_3)))));
    if (!((life3_10 == 0))) {
        lexicalValue1544_97_0 = ((int)(spill1544_4));
        break lexical_join_97;
    }
    if (!((spill1544_4 > 0))) {
        break lexical_join_98;
    }
    lexicalValue1544_97_0 = 1;
    }
    lexicalValue1544_99_0 = lexicalValue1544_97_0;
    break lexical_join_99;
    }
    lexicalValue1544_99_0 = 0;
    }
    life6_135 = lexicalValue1544_99_0;
    spill1544_5 = life5_117;
    if (!((life3_10 == 0))) {
        lexicalValue1544_105_0 = spill1544_5;
        break lexical_join_105;
    }
    if (!((spill1544_5 > 0))) {
        break lexical_join_249;
    }
    lexicalValue1544_105_0 = 0;
    }
    life7_144 = lexicalValue1544_105_0;
    spill1544_6 = ((net.minecraft.entity.EntityLivingBase)(this)).v__Boolean();
    if (!((life3_10 == 0))) {
        lexicalValue1544_125_0 = ((spill1544_6) ? 1 : 0);
        break lexical_join_125;
    }
    if (!((!spill1544_6))) {
        break lexical_join_117;
    }
    life7_156 = ((((java.util.Random)(this.ah)).nextBoolean()) ? 1 : 0);
    if (!((life3_10 != 0))) {
        break lexical_join_132;
    }
    }
    lexicalValue1544_125_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_d7016c0856b9_invokedynamic1544_40(5939, (7070926044998726177L ^ life1_3)))));
    }
    if (!((life3_10 == 0))) {
        lexicalValue1544_129_0 = lexicalValue1544_125_0;
        break lexical_join_129;
    }
    if (!((lexicalValue1544_125_0 == 0))) {
        break lexical_join_130;
    }
    lexicalValue1544_129_0 = 1;
    }
    lexicalValue1544_131_0 = lexicalValue1544_129_0;
    break lexical_join_131;
    }
    lexicalValue1544_131_0 = 0;
    }
    life7_156 = lexicalValue1544_131_0;
    }
    spill1544_7 = life6_135;
    if (!((life3_10 == 0))) {
        lexicalValue1544_150_0 = spill1544_7;
        break lexical_join_150;
    }
    if (!((spill1544_7 != 0))) {
        break lexical_join_149;
    }
    spill1544_8 = life7_156;
    spill1544_9 = ((java.util.Random)(this.ah)).nextInt(((int)(5)));
    if (!((life3_10 == 0))) {
        lexicalValue1544_145_0 = spill1544_8;
        lexicalValue1544_145_1 = spill1544_9;
        break lexical_join_145;
    }
    if (!((spill1544_9 == 0))) {
        lexicalValue1544_146_0 = spill1544_8;
        break lexical_join_146;
    }
    lexicalValue1544_145_0 = spill1544_8;
    lexicalValue1544_145_1 = 1;
    }
    lexicalValue1544_147_0 = lexicalValue1544_145_0;
    lexicalValue1544_147_1 = lexicalValue1544_145_1;
    break lexical_join_147;
    }
    lexicalValue1544_147_0 = lexicalValue1544_146_0;
    lexicalValue1544_147_1 = 0;
    }
    life7_156 = (lexicalValue1544_147_0 & lexicalValue1544_147_1);
    }
    lexicalValue1544_150_0 = life7_156;
    }
    if (!((life3_10 == 0))) {
        lexicalValue1544_154_0 = lexicalValue1544_150_0;
        break lexical_join_154;
    }
    if (!((lexicalValue1544_150_0 != 0))) {
        break lexical_join_249;
    }
    lexicalValue1544_154_0 = life5_117;
    }
    if (!((life3_10 == 0))) {
        lexicalValue1544_170_0 = lexicalValue1544_154_0;
        break lexical_join_170;
    }
    if (!((lexicalValue1544_154_0 > 0))) {
        break lexical_join_249;
    }
    lexicalValue1544_170_0 = ((life5_117 >> __sourceIntrinsic_d7016c0856b9_invokedynamic1544_44(11536, (3414186762616883207L ^ life1_3))) & __sourceIntrinsic_d7016c0856b9_invokedynamic1544_45(11635, (2503630399174756475L ^ life1_3)));
    }
    life8_239 = (((double) lexicalValue1544_170_0) / 0x1.fep7d);
    life10_256 = (((double) ((life5_117 >> __sourceIntrinsic_d7016c0856b9_invokedynamic1544_46(12458, (1883228514552698282L ^ life1_3))) & __sourceIntrinsic_d7016c0856b9_invokedynamic1544_47(16278, (1299664302065736322L ^ life1_3)))) / 0x1.fep7d);
    life12_267 = (((double) (life5_117 & __sourceIntrinsic_d7016c0856b9_invokedynamic1544_48(16278, (1299664302065736322L ^ life1_3)))) / 0x1.fep7d);
    spill1544_10 = this.i;
    if (!((life6_135 != 0))) {
        lexicalValue1544_208_0 = spill1544_10;
        break lexical_join_208;
    }
    lexicalValue1544_209_0 = spill1544_10;
    lexicalValue1544_209_1 = net.minecraft.util.EnumParticleTypes.SPELL_MOB_AMBIENT;
    break lexical_join_209;
    }
    lexicalValue1544_209_0 = lexicalValue1544_208_0;
    lexicalValue1544_209_1 = net.minecraft.util.EnumParticleTypes.SPELL_MOB;
    }
    ((net.minecraft.world.World)(lexicalValue1544_209_0)).a(((net.minecraft.util.EnumParticleTypes)(lexicalValue1544_209_1)), ((double)((this.n + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)((this.o + (((java.util.Random)(this.ah)).nextDouble() * ((double) this.H))))), ((double)((this.p + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)(life8_239)), ((double)(life10_256)), ((double)(life12_267)), ((int[])(new int[0])));
    }
    return;
}


public void u() {
long local1_life2 = (net.minecraft.entity.EntityLivingBase.hb ^ 106850089105568L);
    net.minecraft.entity.EntityLivingBase __sourceSpill835_5 = this;
    net.minecraft.entity.EntityLivingBase __stackOp835_6_0 = this;
    int __stackOp835_6_1 = __sourceIntrinsic_712129a63d20_originalDynamicSite835_4(12738, (3374020933225920467L ^ local1_life2));
    int __sourceSpill835_8 = __stackOp835_6_1;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp835_6_0)).aP = ((int)(__stackOp835_6_1));
    ((net.minecraft.entity.EntityLivingBase)(__sourceSpill835_5)).aO = ((int)(__sourceSpill835_8));
    this.aQ = ((float)(0x0.0p0f));
    return;
}


protected void y__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.EntityLivingBase.hb ^ 45732087230399L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_96328f2ab0ba_originalDynamicSite1886_2(12458, (1883313940136960418L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_96328f2ab0ba_originalDynamicSite1886_6(28428, (3454828614192627207L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    return;
}


protected void E__sourceReturn_da8c82d5d4() {
this.u += 0x1.47ae14p-5d;
    return;
}


protected void A__sourceReturn_da8c82d5d4() {
return;
}


public boolean K__Boolean() {
return ((0) != 0);
}


public void K() {
return;
}


protected void L() {
this.bs = ((boolean)(true));
    return;
}


public boolean L__Boolean() {
int forwardValue4938_13_0;
    int forwardValue4938_15_0;
    boolean spill4938_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 113484750778304L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4938_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == 0))) {
        forwardValue4938_13_0 = ((spill4938_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill4938_0))) {
        break forward_join_14;
    }
    forwardValue4938_13_0 = 1;
    }
    forwardValue4938_15_0 = forwardValue4938_13_0;
    break forward_join_15;
    }
    forwardValue4938_15_0 = 0;
    }
    return ((forwardValue4938_15_0) != 0);
}


private void M() {
net.minecraft.entity.EntityLivingBase forwardValue4939_12_0;
    net.minecraft.entity.EntityLivingBase spill4939_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 88026961017687L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4939_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4939_12_0 = spill4939_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill4939_0)).bA == null))) {
        break forward_join_18;
    }
    forwardValue4939_12_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4939_12_0)).bA = ((com.moon.module.impl.Animations)(((com.moon.module.impl.Animations)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Animations.class)))))));
    }
    return;
}


protected void H() {
return;
}


public boolean H__Boolean() {
long local1 = (net.minecraft.entity.EntityLivingBase.hb ^ 36659990734531L);
    return ((((((net.minecraft.entity.EntityLivingBase)(this)).a__aR() == net.minecraft.entity.EnumCreatureAttribute.UNDEAD) ? 1 : 0)) != 0);
}


protected boolean G__Boolean() {
return ((0) != 0);
}


public void G() {
int forwardValue4934_31_0;
    int forwardValue4934_131_0;
    int forwardValue4934_154_0;
    double forwardValue4934_163_0;
    int forwardValue4934_180_0;
    int forwardValue4934_191_0;
    int forwardValue4934_204_0;
    int forwardValue4934_223_0;
    int forwardValue4934_248_0;
    int forwardValue4934_258_0;
    int forwardValue4934_267_0;
    int forwardValue4934_278_0;
    net.minecraft.entity.EntityLivingBase forwardValue4934_307_0;
    net.minecraft.entity.EntityLivingBase forwardValue4934_312_0;
    net.minecraft.world.World forwardValue4934_366_0;
    int spill4934_0;
    int spill4934_1;
    int spill4934_2;
    net.minecraft.entity.EntityLivingBase spill4934_3;
    net.minecraft.entity.EntityLivingBase spill4934_4;
    net.minecraft.entity.EntityLivingBase spill4934_5;
    net.minecraft.world.World spill4934_6;
    long life1_3;
    int life3_13;
    double life4_55;
    double life6_68;
    double life8_81;
    double life10_89;
    double life4_183;
    com.moon.dQ life6_379;
    forward_join_366: {
    forward_join_364: {
    forward_join_314: {
    forward_join_312: {
    forward_join_311: {
    forward_join_309: {
    forward_join_307: {
    forward_join_306: {
    forward_join_278: {
    forward_join_274: {
    forward_join_267: {
    forward_join_265: {
    forward_join_258: {
    forward_join_256: {
    forward_join_248: {
    forward_join_237: {
    forward_join_223: {
    forward_join_221: {
    forward_join_204: {
    forward_join_197: {
    forward_join_191: {
    forward_join_186: {
    forward_join_180: {
    forward_join_175: {
    forward_join_163: {
    forward_join_162: {
    forward_join_154: {
    forward_join_152: {
    forward_join_131: {
    forward_join_129: {
    forward_join_31: {
    forward_join_29: {
    life1_3 = (net.minecraft.entity.EntityLivingBase.hb ^ 101270294527240L);
    this.q = ((double)(this.t));
    spill4934_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    this.r = ((double)(this.u));
    life3_13 = spill4934_0;
    this.s = ((double)(this.v));
    spill4934_1 = this.by;
    if (!((life3_13 != 0))) {
        forwardValue4934_31_0 = spill4934_1;
        break forward_join_31;
    }
    if (!((spill4934_1 > 0))) {
        break forward_join_29;
    }
    net.minecraft.entity.EntityLivingBase __stackOp4934_9_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_9_0)).by = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_9_0)).by - 1)));
    }
    forwardValue4934_31_0 = this.bm;
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_131_0 = forwardValue4934_31_0;
        break forward_join_131;
    }
    if (!((forwardValue4934_31_0 > 0))) {
        break forward_join_129;
    }
    life4_55 = (this.n + ((this.bn - this.n) / ((double) this.bm)));
    life6_68 = (this.o + ((this.bo - this.o) / ((double) this.bm)));
    life8_81 = (this.p + ((this.bp - this.p) / ((double) this.bm)));
    life10_89 = moom.Dr.a(((double)((this.bq - ((double) this.w)))));
    this.w = ((float)(((float) (((double) this.w) + (life10_89 / ((double) this.bm))))));
    this.x = ((float)(((float) (((double) this.x) + ((this.br - ((double) this.x)) / ((double) this.bm))))));
    net.minecraft.entity.EntityLivingBase __stackOp4934_36_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_36_0)).bm = ((int)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_36_0)).bm - 1)));
    ((net.minecraft.entity.EntityLivingBase)(this)).a__Void(((double)(life4_55)), ((double)(life6_68)), ((double)(life8_81)));
    ((net.minecraft.entity.EntityLivingBase)(this)).b(((float)(this.w)), ((float)(this.x)));
    if (!((life3_13 == 0))) {
        break forward_join_152;
    }
    }
    forwardValue4934_131_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).L__Boolean()) ? 1 : 0);
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_154_0 = forwardValue4934_131_0;
        break forward_join_154;
    }
    if (!((forwardValue4934_131_0 == 0))) {
        break forward_join_152;
    }
    net.minecraft.entity.EntityLivingBase __stackOp4934_45_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_45_0)).t = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_45_0)).t * 0x1.f5c28f5c28f5cp-1d)));
    net.minecraft.entity.EntityLivingBase __stackOp4934_48_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_48_0)).u = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_48_0)).u * 0x1.f5c28f5c28f5cp-1d)));
    net.minecraft.entity.EntityLivingBase __stackOp4934_51_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_51_0)).v = ((double)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_51_0)).v * 0x1.f5c28f5c28f5cp-1d)));
    }
    forwardValue4934_154_0 = ((com.moon.o4)(com.moon.o4.a__o4())).b();
    }
    if (!((forwardValue4934_154_0 <= __sourceIntrinsic_c7b45e3c376e_invokedynamic4934_56(29935, (2246385171210958679L ^ life1_3))))) {
        break forward_join_162;
    }
    forwardValue4934_163_0 = 0x1.47ae147ae147bp-8d;
    break forward_join_163;
    }
    forwardValue4934_163_0 = 0x1.89374bc6a7efap-9d;
    }
    life4_183 = forwardValue4934_163_0;
    spill4934_2 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)(this.t))))), ((double)(life4_183)));
    if (!((life3_13 != 0))) {
        forwardValue4934_180_0 = spill4934_2;
        break forward_join_180;
    }
    if (!((spill4934_2 < 0))) {
        break forward_join_175;
    }
    this.t = ((double)(0x0.0p0d));
    }
    forwardValue4934_180_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)(this.u))))), ((double)(life4_183)));
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_191_0 = forwardValue4934_180_0;
        break forward_join_191;
    }
    if (!((forwardValue4934_180_0 < 0))) {
        break forward_join_186;
    }
    this.u = ((double)(0x0.0p0d));
    }
    forwardValue4934_191_0 = recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)(this.v))))), ((double)(life4_183)));
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_204_0 = forwardValue4934_191_0;
        break forward_join_204;
    }
    if (!((forwardValue4934_191_0 < 0))) {
        break forward_join_197;
    }
    this.v = ((double)(0x0.0p0d));
    }
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("ai")));
    forwardValue4934_204_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).J__Boolean()) ? 1 : 0);
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_223_0 = forwardValue4934_204_0;
        break forward_join_223;
    }
    if (!((forwardValue4934_204_0 != 0))) {
        break forward_join_221;
    }
    this.bi = ((boolean)(false));
    this.bj = ((float)(0x0.0p0f));
    this.bk = ((float)(0x0.0p0f));
    this.bl = ((float)(0x0.0p0f));
    if (!((life3_13 == 0))) {
        break forward_join_237;
    }
    }
    forwardValue4934_223_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).L__Boolean()) ? 1 : 0);
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_248_0 = forwardValue4934_223_0;
        break forward_join_248;
    }
    if (!((forwardValue4934_223_0 != 0))) {
        break forward_join_237;
    }
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("newAi")));
    ((net.minecraft.entity.EntityLivingBase)(this)).H();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    }
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("jump")));
    forwardValue4934_248_0 = ((this.bi) ? 1 : 0);
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_258_0 = forwardValue4934_248_0;
        break forward_join_258;
    }
    if (!((forwardValue4934_248_0 == 0))) {
        break forward_join_256;
    }
    spill4934_3 = this;
    if (!((life3_13 != 0))) {
        forwardValue4934_312_0 = spill4934_3;
        break forward_join_312;
    }
    if (!(((net.minecraft.entity.EntityLivingBase)(spill4934_3)).bh)) {
        break forward_join_311;
    }
    }
    forwardValue4934_258_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).j__Boolean()) ? 1 : 0);
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_267_0 = forwardValue4934_258_0;
        break forward_join_267;
    }
    if (!((forwardValue4934_258_0 != 0))) {
        break forward_join_265;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).E__sourceReturn_da8c82d5d4();
    if (!((life3_13 == 0))) {
        break forward_join_306;
    }
    }
    forwardValue4934_267_0 = ((((net.minecraft.entity.EntityLivingBase)(this)).l__Boolean()) ? 1 : 0);
    }
    if (!((life3_13 != 0))) {
        forwardValue4934_278_0 = forwardValue4934_267_0;
        break forward_join_278;
    }
    if (!((forwardValue4934_267_0 != 0))) {
        break forward_join_274;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).F__sourceReturn_da8c82d5d4();
    if (!((life3_13 == 0))) {
        break forward_join_306;
    }
    }
    spill4934_4 = this;
    if (!((life3_13 != 0))) {
        forwardValue4934_307_0 = spill4934_4;
        break forward_join_307;
    }
    forwardValue4934_278_0 = ((((net.minecraft.entity.EntityLivingBase)(spill4934_4)).A) ? 1 : 0);
    }
    if (!((forwardValue4934_278_0 != 0))) {
        break forward_join_306;
    }
    spill4934_5 = this;
    if (!((life3_13 != 0))) {
        forwardValue4934_307_0 = spill4934_5;
        break forward_join_307;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill4934_5)).by == 0))) {
        break forward_join_306;
    }
    life6_379 = new com.moon.dQ();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life6_379)));
    if (!((life3_13 != 0))) {
        break forward_join_309;
    }
    if (!((!((com.moon.dQ)(life6_379)).isCancelled()))) {
        break forward_join_306;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).D__sourceReturn_da8c82d5d4();
    this.by = ((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic4934_110(5103, (4710267430156013662L ^ life1_3))));
    }
    forwardValue4934_307_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4934_307_0)).bh = ((boolean)(false));
    }
    if (!((life3_13 == 0))) {
        break forward_join_314;
    }
    }
    forwardValue4934_312_0 = this;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue4934_312_0)).by = ((int)(0));
    }
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("travel")));
    net.minecraft.entity.EntityLivingBase __stackOp4934_120_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_120_0)).bj = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_120_0)).bj * 0x1.f5c29p-1f)));
    net.minecraft.entity.EntityLivingBase __stackOp4934_123_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_123_0)).bk = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_123_0)).bk * 0x1.f5c29p-1f)));
    net.minecraft.entity.EntityLivingBase __stackOp4934_126_0 = this;
    ((net.minecraft.entity.EntityLivingBase)(__stackOp4934_126_0)).bl = ((float)((((net.minecraft.entity.EntityLivingBase)(__stackOp4934_126_0)).bl * 0x1.ccccccp-1f)));
    ((net.minecraft.entity.EntityLivingBase)(this)).e(((float)(this.bj)), ((float)(this.bk)));
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).b();
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("push")));
    spill4934_6 = this.i;
    if (!((life3_13 != 0))) {
        forwardValue4934_366_0 = spill4934_6;
        break forward_join_366;
    }
    if (!((!((net.minecraft.world.World)(spill4934_6)).G))) {
        break forward_join_364;
    }
    ((net.minecraft.entity.EntityLivingBase)(this)).I();
    }
    forwardValue4934_366_0 = this.i;
    }
    ((moom.A9)(((net.minecraft.world.World)(forwardValue4934_366_0)).D)).b();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_9f4152785d621448_originalDynamicSite3825_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90437eb4fb8a_invokedynamic4933_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4934_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4934_110(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_82cb24cf4441_invokedynamic1534_6() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic655_6(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_27cbe04c37b0_call4941_27(net.minecraft.entity.EntityLivingBase a0, double a1, boolean a2, net.minecraft.block.Block a3, moom.DT a4) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6cec1e8f58c8_invokedynamic4946_7(java.lang.String a0, int a1, int a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a8300cf5bdc_invokedynamic4949_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1535_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1535_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1535_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1535_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9a3137de8aff_originalDynamicSite1881_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11202_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_89fd98101069_call4956_11(net.minecraft.entity.EntityLivingBase a0, net.minecraft.entity.Entity a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3b749fd852cb_invokedynamic4959_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3b749fd852cb_invokedynamic4959_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3b749fd852cb_invokedynamic4959_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3b749fd852cb_invokedynamic4959_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3b749fd852cb_invokedynamic4959_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1537_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9bf881b104f5_invokedynamic1537_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic25_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic25_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic25_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic25_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic25_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b75f634baf5_originalDynamicSite1882_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1883_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1542_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1542_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1542_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_455b93f512d4_invokedynamic1543_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_455b93f512d4_invokedynamic1543_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_455b93f512d4_invokedynamic1543_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_455b93f512d4_invokedynamic1543_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_originalDynamicSite1880_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9516f9781f1_originalDynamicSite1884_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_invokedynamic4973_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_invokedynamic4973_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_invokedynamic4973_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_invokedynamic4973_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_invokedynamic4973_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_invokedynamic4973_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_invokedynamic4973_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_712129a63d20_originalDynamicSite835_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d7016c0856b9_invokedynamic1544_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae1eecf7172_invokedynamic4979_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ae1eecf7172_invokedynamic4979_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96328f2ab0ba_originalDynamicSite1886_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96328f2ab0ba_originalDynamicSite1886_6(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_d69b06941ddd75(int p0);
private static native int __sourceExactCall_42a80aa502dd3d(int p0, long p1);
private static native int __sourceExactCall_7da118eea97d77(net.minecraft.item.Item p0);
private static native net.minecraft.potion.PotionEffect __sourceExactCall_803aa5ff879b12(net.minecraft.nbt.NBTTagCompound p0);
private static native int __sourceExactCall_042b2eb2353c3d(net.minecraft.block.state.IBlockState p0);
private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native boolean __sourceExactCall_fac9e73638a8b5(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1);

private static native float __sourceExactCall_f4e7fff2f8c1c1(net.minecraft.entity.EntityLivingBase p0);
private static native float __sourceExactCall_31a95b45a80da5(net.minecraft.entity.Entity p0);
private static native moom.CA __sourceExactCall_5f0a1ab2f67043(net.minecraft.entity.Entity p0);
private static native moom.CA __sourceExactCall_e4ba113737a0ef(net.minecraft.entity.EntityLivingBase p0);

private static native int __sourceExactCall_cf86b9d0f8200d(net.minecraft.entity.Entity p0);
private static native int __sourceExactCall_62c9ac7d46f640(net.minecraft.entity.EntityLivingBase p0);
}
