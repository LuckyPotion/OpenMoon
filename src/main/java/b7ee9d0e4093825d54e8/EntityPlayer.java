package net.minecraft.entity.player;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EntityPlayer extends net.minecraft.entity.EntityLivingBase {

public com.moon.gF bC;

public net.minecraft.entity.player.InventoryPlayer bD;

private moom.wv bE;

public moom.v8 bF;

public moom.v8 bG;

protected net.minecraft.util.FoodStats bH;

protected int bI;

public float bJ;

public float bK;

public int bL;

public double bM;

public double bN;

public double bO;

public double bP;

public double bQ;

public double bR;

protected boolean bS;

public moom.DT bT;

private int bU;

public float bV;

public float bW;

public float bX;

private moom.DT bY;

private boolean bZ;

private moom.DT b0;

public net.minecraft.entity.player.PlayerCapabilities b1;

public int b2;

public int b3;

public float b4;

private int b5;

private net.minecraft.item.ItemStack b6;

private int b7;

protected float b8;

protected float b9;

private int b_;

private com.mojang.authlib.GameProfile ca;

private boolean cb;

public net.minecraft.entity.projectile.EntityFishHook cc;

private static int cd;

private static long gb;

private static long[] ib;

private static java.lang.Integer[] jb;

private static java.util.Map kb;

public EntityPlayer(net.minecraft.world.World p0, com.mojang.authlib.GameProfile p1) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_3869c773480cb195(net.minecraft.entity.player.EntityPlayer receiver, net.minecraft.world.World p0, com.mojang.authlib.GameProfile p1) throws Throwable {
long life3_3;
    moom.DT life5_69;
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 46900506074352L);
    net.minecraft.entity.player.EntityPlayer.__sourceConstructorInit_3869c773480cb195_0(((net.minecraft.entity.player.EntityPlayer)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).bC = ((com.moon.gF)(new com.moon.gF()));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).bD = ((net.minecraft.entity.player.InventoryPlayer)(new net.minecraft.entity.player.InventoryPlayer(receiver)));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).bE = ((moom.wv)(new moom.wv()));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).bH = ((net.minecraft.util.FoodStats)(new net.minecraft.util.FoodStats()));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).b1 = ((net.minecraft.entity.player.PlayerCapabilities)(new net.minecraft.entity.player.PlayerCapabilities()));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).b8 = ((float)(0x1.99999ap-4f));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).b9 = ((float)(0x1.47ae14p-6f));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).cb = ((boolean)(false));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).ar = ((java.util.UUID)(net.minecraft.entity.player.EntityPlayer.a(((com.mojang.authlib.GameProfile)(p1)))));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).ca = ((com.mojang.authlib.GameProfile)(p1));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).bF = ((moom.v8)(new moom.wj(((net.minecraft.entity.player.EntityPlayer)(receiver)).bD, ((((!((net.minecraft.world.World)(p0)).G) ? 1 : 0)) != 0), receiver)));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).bG = ((moom.v8)(((net.minecraft.entity.player.EntityPlayer)(receiver)).bF));
    life5_69 = ((net.minecraft.world.World)(p0)).a__DT();
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).c(((double)((((double) ((moom.DT)(life5_69)).a()) + 0x1.0p-1d))), ((double)(((double) (((moom.DT)(life5_69)).b() + 1)))), ((double)((((double) ((moom.DT)(life5_69)).c()) + 0x1.0p-1d))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).be = ((float)(0x1.68p7f));
    ((net.minecraft.entity.player.EntityPlayer)(receiver)).T = ((int)(__sourceIntrinsic_3869c773480cb195_invokedynamic200030_25(4324, (5199907968563165726L ^ life3_3))));
    return;
}


static {
gb = ((long)(((moom._a)(moom._c.a(((long)(-6168075271757556921L)), ((long)(1199692645100754096L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215009573813612L)))));
    kb = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill1886_7 = 37;
    long local0_life8 = (net.minecraft.entity.player.EntityPlayer.gb ^ 6634291891638L);
    net.minecraft.entity.player.EntityPlayer.o(((int)(__sourceSpill1886_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1886_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1886_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1886_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1886_16 = new byte[8];
    (__sourceSpill1886_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1886_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1886_18 = __sourceSpill1886_16;
    ((javax.crypto.Cipher)(__sourceSpill1886_13)).init(((int)(__sourceSpill1886_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1886_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1886_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[34];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "i0ô#R»EÏW^ã\001\006o¿²ò´°y\026áæù²®¼Û±\003íÛ,ç÷ýJi+O¿wüJ\004uôÃ\031\f.Õç¸ªW\037µTvu²\031ßßß:t%\033\030¼èîfê\025|\030LCQdDgVàV¬}·þ¶÷Ù·x»ÆÏËE~Oô{q¦\024Ò4vÿ3\030TZ\004ùFUú³i>\027æCJ#ò`kg\036\t\025'b­OB\001\000û>¶I\017â}HíË(b>>\016ÁçÜ\004+ßN]pb÷Fm\027³Üb¼M_«?Î\\A1tÅwÈDãuÈö\036DmrRI k\022ºÂ@2ç1ªïØ©ª\036­\001°Ï\013±O"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1886_27 = local6_life23;
        int __sourceSpill1886_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1886_27)).substring(((int)(__sourceSpill1886_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1886_32 = local8_life21;
        int __sourceSpill1886_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1886_35 = new byte[8];
        (__sourceSpill1886_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1886_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1886_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1886_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1886_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1886_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1886_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1886_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1886_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1886_36)).doFinal(((byte[])(__sourceSpill1886_35)));
        (__sourceSpill1886_32)[__sourceSpill1886_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "öjÞ¼¸H^ê(ñF»ùôù"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1886_40 = local6_life23;
        int __sourceSpill1886_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1886_40)).substring(((int)(__sourceSpill1886_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1886_45 = local8_life21;
        int __sourceSpill1886_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1886_48 = new byte[8];
        (__sourceSpill1886_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1886_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1886_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1886_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1886_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1886_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1886_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1886_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1886_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1886_49)).doFinal(((byte[])(__sourceSpill1886_48)));
        (__sourceSpill1886_45)[__sourceSpill1886_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    ib = ((long[])(local8_life21));
    jb = ((java.lang.Integer[])(new java.lang.Integer[34]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3869c773480cb195_0(net.minecraft.entity.player.EntityPlayer a0, net.minecraft.world.World a1) throws E;

public boolean C__Boolean() {
return ((1) != 0);
}


public void D__sourceReturn_da8c82d5d4() {
net.minecraft.entity.player.EntityPlayer forwardValue5379_22_0;
    boolean spill5379_0;
    net.minecraft.entity.player.EntityPlayer spill5379_1;
    long life1_3;
    int life3_7;
    forward_join_24: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 64023926469281L);
    spill5379_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    super.D__sourceReturn_da8c82d5d4();
    life3_7 = ((spill5379_0) ? 1 : 0);
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.u)));
    spill5379_1 = this;
    if (!((life3_7 == 0))) {
        forwardValue5379_22_0 = spill5379_1;
        break forward_join_22;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill5379_1)).u__Boolean())) {
        break forward_join_21;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).h(((float)(0x1.99999ap-1f)));
    if (!((life3_7 != 0))) {
        break forward_join_24;
    }
    }
    forwardValue5379_22_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5379_22_0)).h(((float)(0x1.99999ap-3f)));
    }
    return;
}


protected boolean J__Boolean() {
int forwardValue5381_19_0;
    int forwardValue5381_21_0;
    int spill5381_0;
    boolean spill5381_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 14829198568422L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5381_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue5381_19_0 = spill5381_0;
        break forward_join_19;
    }
    if (!((spill5381_0 > 0))) {
        break forward_join_18;
    }
    spill5381_1 = ((net.minecraft.entity.player.EntityPlayer)(this)).K__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue5381_19_0 = ((spill5381_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill5381_1)) {
        break forward_join_20;
    }
    }
    forwardValue5381_19_0 = 1;
    }
    forwardValue5381_21_0 = forwardValue5381_19_0;
    break forward_join_21;
    }
    forwardValue5381_21_0 = 0;
    }
    return ((forwardValue5381_21_0) != 0);
}


public void S() {
return;
}


public boolean S__Boolean() {
int forwardValue5387_18_0;
    int forwardValue5387_22_0;
    int forwardValue5387_24_0;
    int spill5387_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 76385058207747L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5387_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue5387_18_0 = spill5387_0;
        break forward_join_18;
    }
    if (!((spill5387_0 > 0))) {
        break forward_join_23;
    }
    forwardValue5387_18_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.player.EntityPlayer)(this)).a())));
    }
    if (!((life3_5 == 0))) {
        forwardValue5387_22_0 = forwardValue5387_18_0;
        break forward_join_22;
    }
    if (!((forwardValue5387_18_0 < 0))) {
        break forward_join_23;
    }
    forwardValue5387_22_0 = 1;
    }
    forwardValue5387_24_0 = forwardValue5387_22_0;
    break forward_join_24;
    }
    forwardValue5387_24_0 = 0;
    }
    return ((forwardValue5387_24_0) != 0);
}


public boolean V() {
return ((((this.cb) ? 1 : 0)) != 0);
}


private void i(net.minecraft.entity.Entity p0) {
((net.minecraft.entity.Entity)(p0)).d(((net.minecraft.entity.player.EntityPlayer)(this)));
    return;
}


public float i__sourceReturn_bc607678b6() {
return ((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b());
}


public void i(boolean p0) {
this.cb = ((boolean)(p0));
    return;
}


public net.minecraft.item.ItemStack b__sourceReturn_7f6f0b7f03(int p0) {
return ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c(((int)(p0)));
}


public void b(net.minecraft.util.IChatComponent p0) {
return;
}


public moom.DT b__sourceReturn_f4db834595() {
return this.bY;
}


public net.minecraft.item.ItemStack b__xW() {
return this.b6;
}


public void b(moom.BY p0) {
return;
}


public float b(net.minecraft.block.Block p0, int p1, boolean p2) {
int forwardValue551_45_0;
    int forwardValue551_65_0;
    int forwardValue551_98_0;
    int forwardValue551_112_0;
    int forwardValue551_116_0;
    boolean spill551_0;
    int spill551_1;
    int spill551_2;
    boolean spill551_3;
    long life4_3;
    float life7_10;
    int life6_11;
    int life8_24;
    net.minecraft.item.ItemStack life9_29;
    float life8_84;
    forward_join_121: {
    forward_join_116: {
    forward_join_112: {
    forward_join_110: {
    forward_join_98: {
    forward_join_95: {
    forward_join_91: {
    forward_join_89: {
    forward_join_85: {
    forward_join_81: {
    forward_join_79: {
    forward_join_77: {
    forward_join_65: {
    forward_join_62: {
    forward_join_45: {
    forward_join_42: {
    life4_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 57024936390180L);
    spill551_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    life7_10 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a(((net.minecraft.block.Block)(p0)), ((int)(p1)));
    life6_11 = ((spill551_0) ? 1 : 0);
    spill551_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_10)), ((float)(0x1.0p0f)));
    if (!((life6_11 != 0))) {
        forwardValue551_45_0 = spill551_1;
        break forward_join_45;
    }
    if (!((spill551_1 > 0))) {
        break forward_join_42;
    }
    life8_24 = moom.rV.a(((net.minecraft.entity.EntityLivingBase)(this)), ((int)(p1)));
    life9_29 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW(((int)(p1)));
    spill551_2 = life8_24;
    if (!((life6_11 != 0))) {
        forwardValue551_45_0 = spill551_2;
        break forward_join_45;
    }
    if (!((spill551_2 > 0))) {
        break forward_join_42;
    }
    if (!((life9_29 != null))) {
        break forward_join_42;
    }
    life7_10 = (life7_10 + ((float) ((life8_24 * life8_24) + 1)));
    }
    forwardValue551_45_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f)))) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue551_65_0 = forwardValue551_45_0;
        break forward_join_65;
    }
    if (!((forwardValue551_45_0 != 0))) {
        break forward_join_62;
    }
    life7_10 = (life7_10 * (0x1.0p0f + (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f))))).c() + 1)) * 0x1.99999ap-3f)));
    }
    forwardValue551_65_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g)))) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue551_98_0 = forwardValue551_65_0;
        break forward_join_98;
    }
    if (!((forwardValue551_65_0 != 0))) {
        break forward_join_95;
    }
    life8_84 = 0x1.0p0f;
    if (!((life6_11 != 0))) {
        break forward_join_79;
    }
    switch (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g))))).c()) {
case 0:
{
        break forward_join_77;
    }
case 1:
{
        break forward_join_81;
    }
case 2:
{
        break forward_join_85;
    }
case 3:
default:
{
        break forward_join_89;
    }
}
    }
    life8_84 = 0x1.333334p-2f;
    }
    if (!((life6_11 == 0))) {
        break forward_join_91;
    }
    }
    life8_84 = 0x1.70a3d8p-4f;
    if (!((life6_11 == 0))) {
        break forward_join_91;
    }
    }
    life8_84 = 0x1.61e4f8p-9f;
    if (!((life6_11 == 0))) {
        break forward_join_91;
    }
    }
    life8_84 = 0x1.a8ac5cp-11f;
    }
    life7_10 = (life7_10 * life8_84);
    }
    forwardValue551_98_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.fn)(moom.fn.h)))) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue551_112_0 = forwardValue551_98_0;
        break forward_join_112;
    }
    if (!((forwardValue551_98_0 != 0))) {
        break forward_join_110;
    }
    spill551_3 = moom.rV.b__Boolean(((net.minecraft.entity.EntityLivingBase)(this)));
    if (!((life6_11 != 0))) {
        forwardValue551_112_0 = ((spill551_3) ? 1 : 0);
        break forward_join_112;
    }
    if (!((!spill551_3))) {
        break forward_join_110;
    }
    life7_10 = (life7_10 / 0x1.4p2f);
    }
    forwardValue551_112_0 = ((this.A) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue551_116_0 = forwardValue551_112_0;
        break forward_join_116;
    }
    if (!((forwardValue551_112_0 == 0))) {
        break forward_join_121;
    }
    forwardValue551_116_0 = ((p2) ? 1 : 0);
    }
    if (!((forwardValue551_116_0 == 0))) {
        break forward_join_121;
    }
    life7_10 = (life7_10 / 0x1.4p2f);
    }
    return life7_10;
}


public void b(int p0, net.minecraft.item.ItemStack p1) {
(((net.minecraft.entity.player.InventoryPlayer)(this.bD)).b)[p0] = p1;
    return;
}


public void b(net.minecraft.item.ItemStack p0, int p1) {
net.minecraft.entity.player.EntityPlayer forwardValue5413_25_0;
    net.minecraft.entity.player.EntityPlayer spill5413_0;
    long life3_3;
    int life5_5;
    forward_join_27: {
    forward_join_25: {
    forward_join_18: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 23339067897349L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    if (!((life5_5 != 0))) {
        break forward_join_18;
    }
    if (!((p0 != this.b6))) {
        break forward_join_27;
    }
    this.b6 = ((net.minecraft.item.ItemStack)(p0));
    this.b7 = ((int)(p1));
    }
    spill5413_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5413_25_0 = spill5413_0;
        break forward_join_25;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill5413_0)).i)).G))) {
        break forward_join_27;
    }
    forwardValue5413_25_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5413_25_0)).e(((boolean)(true)));
    }
    return;
}


public boolean b__Boolean(int p0, net.minecraft.item.ItemStack p1) {
int forwardValue5414_31_0;
    int forwardValue5414_31_1;
    int forwardValue5414_32_0;
    net.minecraft.item.Item forwardValue5414_60_0;
    int forwardValue5414_73_0;
    net.minecraft.item.Item forwardValue5414_85_0;
    int forwardValue5414_90_0;
    int forwardValue5414_102_0;
    int forwardValue5414_109_0;
    int forwardValue5414_109_1;
    int forwardValue5414_110_0;
    int forwardValue5414_130_0;
    int spill5414_0;
    int spill5414_1;
    int spill5414_2;
    int spill5414_3;
    int spill5414_4;
    int spill5414_5;
    net.minecraft.item.Item spill5414_6;
    int spill5414_7;
    int spill5414_8;
    net.minecraft.item.Item spill5414_9;
    int spill5414_10;
    int spill5414_11;
    int spill5414_12;
    long life3_3;
    int life5_5;
    int life6_43;
    int life7_68;
    int life7_168;
    forward_join_130: {
    forward_join_129: {
    forward_join_110: {
    forward_join_109: {
    forward_join_103: {
    forward_join_102: {
    forward_join_101: {
    forward_join_91: {
    forward_join_90: {
    forward_join_89: {
    forward_join_85: {
    forward_join_73: {
    forward_join_72: {
    forward_join_60: {
    forward_join_32: {
    forward_join_31: {
    forward_join_25: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 39009038202864L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5414_0 = p0;
    if (!((life5_5 != 0))) {
        forwardValue5414_32_0 = spill5414_0;
        break forward_join_32;
    }
    if (!((spill5414_0 >= 0))) {
        break forward_join_25;
    }
    spill5414_1 = p0;
    spill5414_2 = (((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a).length;
    if (!((life5_5 != 0))) {
        forwardValue5414_31_0 = spill5414_1;
        forwardValue5414_31_1 = spill5414_2;
        break forward_join_31;
    }
    if (!((spill5414_1 < spill5414_2))) {
        break forward_join_25;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__Void(((int)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    return ((1) != 0);
    }
    forwardValue5414_31_0 = p0;
    forwardValue5414_31_1 = __sourceIntrinsic_7722627b66bb_invokedynamic5414_8(21647, (8789479488736236901L ^ life3_3));
    }
    forwardValue5414_32_0 = (forwardValue5414_31_0 - forwardValue5414_31_1);
    }
    life6_43 = forwardValue5414_32_0;
    spill5414_3 = life6_43;
    if (!((life5_5 != 0))) {
        forwardValue5414_110_0 = spill5414_3;
        break forward_join_110;
    }
    if (!((spill5414_3 >= 0))) {
        break forward_join_103;
    }
    spill5414_4 = life6_43;
    spill5414_5 = (((net.minecraft.entity.player.InventoryPlayer)(this.bD)).b).length;
    if (!((life5_5 != 0))) {
        forwardValue5414_109_0 = spill5414_4;
        forwardValue5414_109_1 = spill5414_5;
        break forward_join_109;
    }
    if (!((spill5414_4 < spill5414_5))) {
        break forward_join_103;
    }
    life7_68 = (life6_43 + 1);
    if (!((life5_5 != 0))) {
        break forward_join_101;
    }
    if (!((p1 != null))) {
        break forward_join_91;
    }
    spill5414_6 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    if (!((life5_5 != 0))) {
        forwardValue5414_60_0 = spill5414_6;
        break forward_join_60;
    }
    if (!((spill5414_6 != null))) {
        break forward_join_91;
    }
    forwardValue5414_60_0 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    }
    spill5414_7 = ((forwardValue5414_60_0 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5414_73_0 = spill5414_7;
        break forward_join_73;
    }
    if (!((spill5414_7 != 0))) {
        break forward_join_72;
    }
    spill5414_8 = __sourceExactCall_f21b3836e04476(((net.minecraft.item.ItemStack)(p1)));
    if (!((life5_5 != 0))) {
        forwardValue5414_102_0 = spill5414_8;
        break forward_join_102;
    }
    if (!((spill5414_8 != life7_68))) {
        break forward_join_91;
    }
    return ((0) != 0);
    }
    forwardValue5414_73_0 = life7_68;
    }
    if (!((life5_5 != 0))) {
        forwardValue5414_90_0 = forwardValue5414_73_0;
        break forward_join_90;
    }
    if (!((forwardValue5414_73_0 == 4))) {
        break forward_join_89;
    }
    spill5414_9 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    if (!((life5_5 != 0))) {
        forwardValue5414_85_0 = spill5414_9;
        break forward_join_85;
    }
    if (!((spill5414_9 != net.minecraft.init.Items.bM))) {
        break forward_join_91;
    }
    forwardValue5414_85_0 = ((net.minecraft.item.ItemStack)(p1)).a__wQ();
    }
    spill5414_10 = ((forwardValue5414_85_0 instanceof moom.wU) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5414_102_0 = spill5414_10;
        break forward_join_102;
    }
    if (!((spill5414_10 == 0))) {
        break forward_join_91;
    }
    }
    forwardValue5414_90_0 = 0;
    }
    return ((forwardValue5414_90_0) != 0);
    }
    ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__Void(((int)((life6_43 + (((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a).length))), ((net.minecraft.item.ItemStack)(p1)));
    }
    forwardValue5414_102_0 = 1;
    }
    return ((forwardValue5414_102_0) != 0);
    }
    forwardValue5414_109_0 = p0;
    forwardValue5414_109_1 = __sourceIntrinsic_7722627b66bb_invokedynamic5414_26(611, (5980729922427929495L ^ life3_3));
    }
    forwardValue5414_110_0 = (forwardValue5414_109_0 - forwardValue5414_109_1);
    }
    life7_168 = forwardValue5414_110_0;
    spill5414_11 = life7_168;
    if (!((life5_5 != 0))) {
        forwardValue5414_130_0 = spill5414_11;
        break forward_join_130;
    }
    if (!((spill5414_11 >= 0))) {
        break forward_join_129;
    }
    spill5414_12 = life7_168;
    if (!((life5_5 != 0))) {
        forwardValue5414_130_0 = spill5414_12;
        break forward_join_130;
    }
    if (!((spill5414_12 < ((moom.wv)(this.bE)).b__Int()))) {
        break forward_join_129;
    }
    ((moom.wv)(this.bE)).a__Void(((int)(life7_168)), ((net.minecraft.item.ItemStack)(p1)));
    return ((1) != 0);
    }
    forwardValue5414_130_0 = 0;
    }
    return ((forwardValue5414_130_0) != 0);
}


public void e__Void() {
((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.ccccccp0f)));
    super.e__Void();
    ((net.minecraft.entity.player.EntityPlayer)(this)).d(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).a())));
    this.aR = ((int)(0));
    return;
}


protected void e(float p0) {
((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a(((float)(p0)));
    return;
}


public boolean e__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
int forwardValue5420_21_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5420_23_0;
    net.minecraft.item.ItemStack forwardValue5420_31_0;
    net.minecraft.item.ItemStack forwardValue5420_33_0;
    int forwardValue5420_58_0;
    int forwardValue5420_75_0;
    int forwardValue5420_77_0;
    net.minecraft.item.ItemStack forwardValue5420_83_0;
    net.minecraft.item.ItemStack forwardValue5420_89_0;
    int forwardValue5420_105_0;
    int forwardValue5420_121_0;
    net.minecraft.entity.player.EntityPlayer spill5420_0;
    int spill5420_1;
    net.minecraft.item.ItemStack spill5420_2;
    int spill5420_3;
    boolean spill5420_4;
    int spill5420_5;
    boolean spill5420_6;
    net.minecraft.item.ItemStack spill5420_7;
    int spill5420_8;
    boolean spill5420_9;
    boolean spill5420_10;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_36;
    net.minecraft.item.ItemStack life6_51;
    forward_join_121: {
    forward_join_120: {
    forward_join_105: {
    forward_join_103: {
    forward_join_89: {
    forward_join_83: {
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_58: {
    forward_join_53: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 101814923233815L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5420_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue5420_23_0 = spill5420_0;
        break forward_join_23;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill5420_0)).U__Boolean())) {
        break forward_join_22;
    }
    spill5420_1 = ((p0 instanceof net.minecraft.inventory.IInventory) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue5420_21_0 = spill5420_1;
        break forward_join_21;
    }
    if (!((spill5420_1 != 0))) {
        break forward_join_20;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.inventory.IInventory)(((net.minecraft.inventory.IInventory)(p0)))));
    }
    forwardValue5420_21_0 = 0;
    }
    return ((forwardValue5420_21_0) != 0);
    }
    forwardValue5420_23_0 = this;
    }
    life5_36 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue5420_23_0)).c__xW();
    spill5420_2 = life5_36;
    if (!((life4_5 == 0))) {
        forwardValue5420_31_0 = spill5420_2;
        break forward_join_31;
    }
    if (!((spill5420_2 != null))) {
        break forward_join_32;
    }
    forwardValue5420_31_0 = ((net.minecraft.item.ItemStack)(life5_36)).a__xW();
    }
    forwardValue5420_33_0 = forwardValue5420_31_0;
    break forward_join_33;
    }
    forwardValue5420_33_0 = null;
    }
    life6_51 = forwardValue5420_33_0;
    if (!((!((net.minecraft.entity.Entity)(p0)).b__Boolean(((net.minecraft.entity.player.EntityPlayer)(this)))))) {
        break forward_join_78;
    }
    if (!((life5_36 != null))) {
        break forward_join_76;
    }
    spill5420_3 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue5420_77_0 = spill5420_3;
        break forward_join_77;
    }
    if (!((spill5420_3 != 0))) {
        break forward_join_76;
    }
    spill5420_4 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).d;
    if (!((life4_5 == 0))) {
        forwardValue5420_58_0 = ((spill5420_4) ? 1 : 0);
        break forward_join_58;
    }
    if (!(spill5420_4)) {
        break forward_join_53;
    }
    life5_36 = life6_51;
    }
    forwardValue5420_58_0 = ((((net.minecraft.item.ItemStack)(life5_36)).a(((net.minecraft.entity.player.EntityPlayer)(this)), ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5420_77_0 = forwardValue5420_58_0;
        break forward_join_77;
    }
    if (!((forwardValue5420_58_0 != 0))) {
        break forward_join_76;
    }
    spill5420_5 = ((net.minecraft.item.ItemStack)(life5_36)).b;
    if (!((life4_5 == 0))) {
        forwardValue5420_75_0 = spill5420_5;
        break forward_join_75;
    }
    if (!((spill5420_5 <= 0))) {
        break forward_join_74;
    }
    spill5420_6 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).d;
    if (!((life4_5 == 0))) {
        forwardValue5420_75_0 = ((spill5420_6) ? 1 : 0);
        break forward_join_75;
    }
    if (!((!spill5420_6))) {
        break forward_join_74;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).R();
    }
    forwardValue5420_75_0 = 1;
    }
    return ((forwardValue5420_75_0) != 0);
    }
    forwardValue5420_77_0 = 0;
    }
    return ((forwardValue5420_77_0) != 0);
    }
    spill5420_7 = life5_36;
    if (!((life4_5 == 0))) {
        forwardValue5420_83_0 = spill5420_7;
        break forward_join_83;
    }
    if (!((spill5420_7 != null))) {
        break forward_join_120;
    }
    forwardValue5420_83_0 = life5_36;
    }
    if (!((life4_5 == 0))) {
        forwardValue5420_89_0 = forwardValue5420_83_0;
        break forward_join_89;
    }
    if (!((forwardValue5420_83_0 == ((net.minecraft.entity.player.EntityPlayer)(this)).c__xW()))) {
        break forward_join_120;
    }
    forwardValue5420_89_0 = life5_36;
    }
    spill5420_8 = ((net.minecraft.item.ItemStack)(forwardValue5420_89_0)).b;
    if (!((life4_5 == 0))) {
        forwardValue5420_105_0 = spill5420_8;
        break forward_join_105;
    }
    if (!((spill5420_8 <= 0))) {
        break forward_join_103;
    }
    spill5420_9 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).d;
    if (!((life4_5 == 0))) {
        forwardValue5420_105_0 = ((spill5420_9) ? 1 : 0);
        break forward_join_105;
    }
    if (!((!spill5420_9))) {
        break forward_join_103;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).R();
    if (!((life4_5 != 0))) {
        break forward_join_120;
    }
    }
    forwardValue5420_105_0 = ((net.minecraft.item.ItemStack)(life5_36)).b;
    }
    if (!((life4_5 == 0))) {
        forwardValue5420_121_0 = forwardValue5420_105_0;
        break forward_join_121;
    }
    if (!((forwardValue5420_105_0 < ((net.minecraft.item.ItemStack)(life6_51)).b))) {
        break forward_join_120;
    }
    spill5420_10 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).d;
    if (!((life4_5 == 0))) {
        forwardValue5420_121_0 = ((spill5420_10) ? 1 : 0);
        break forward_join_121;
    }
    if (!(spill5420_10)) {
        break forward_join_120;
    }
    ((net.minecraft.item.ItemStack)(life5_36)).b = ((int)(((net.minecraft.item.ItemStack)(life6_51)).b));
    }
    forwardValue5420_121_0 = 1;
    }
    return ((forwardValue5420_121_0) != 0);
}


public float e__Float() {
int forwardValue5421_17_0;
    boolean spill5421_0;
    boolean spill5421_1;
    long life1_3;
    float life4_6;
    int life3_7;
    forward_join_22: {
    forward_join_17: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 15756867479945L);
    spill5421_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    life4_6 = 0x1.9eb852p0f;
    life3_7 = ((spill5421_0) ? 1 : 0);
    spill5421_1 = ((net.minecraft.entity.player.EntityPlayer)(this)).K__Boolean();
    if (!((life3_7 != 0))) {
        forwardValue5421_17_0 = ((spill5421_1) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill5421_1)) {
        break forward_join_15;
    }
    life4_6 = 0x1.99999ap-3f;
    }
    forwardValue5421_17_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).t__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5421_17_0 != 0))) {
        break forward_join_22;
    }
    life4_6 = (life4_6 - 0x1.47ae14p-4f);
    }
    return life4_6;
}


protected java.lang.String e__String() {
return "game.player.swim.splash";
}


public void e(float p0, float p1) {
net.minecraft.entity.player.EntityPlayer forwardValue5419_42_0;
    float forwardValue5419_42_1;
    int forwardValue5419_42_2;
    net.minecraft.entity.player.EntityPlayer forwardValue5419_43_0;
    float forwardValue5419_43_1;
    net.minecraft.entity.player.EntityPlayer forwardValue5419_44_0;
    float forwardValue5419_44_1;
    int forwardValue5419_44_2;
    net.minecraft.entity.player.EntityPlayer forwardValue5419_62_0;
    boolean spill5419_0;
    net.minecraft.entity.player.EntityPlayer spill5419_1;
    net.minecraft.entity.player.EntityPlayer spill5419_2;
    net.minecraft.entity.player.EntityPlayer spill5419_3;
    float spill5419_4;
    boolean spill5419_5;
    long life3_3;
    double life6_7;
    double life8_10;
    int life5_11;
    double life10_14;
    double life12_37;
    float life14_40;
    forward_join_65: {
    forward_join_62: {
    forward_join_61: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 74615008497951L);
    spill5419_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    life6_7 = this.n;
    life8_10 = this.o;
    life5_11 = ((spill5419_0) ? 1 : 0);
    life10_14 = this.p;
    spill5419_1 = this;
    if (!((life5_11 == 0))) {
        forwardValue5419_62_0 = spill5419_1;
        break forward_join_62;
    }
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill5419_1)).b1)).b)) {
        break forward_join_61;
    }
    spill5419_2 = this;
    if (!((life5_11 == 0))) {
        forwardValue5419_62_0 = spill5419_2;
        break forward_join_62;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5419_2)).g == null))) {
        break forward_join_61;
    }
    life12_37 = this.u;
    life14_40 = this.a6;
    spill5419_3 = this;
    spill5419_4 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a();
    spill5419_5 = ((net.minecraft.entity.player.EntityPlayer)(this)).u__Boolean();
    if (!((life5_11 == 0))) {
        forwardValue5419_42_0 = spill5419_3;
        forwardValue5419_42_1 = spill5419_4;
        forwardValue5419_42_2 = ((spill5419_5) ? 1 : 0);
        break forward_join_42;
    }
    if (!(spill5419_5)) {
        forwardValue5419_43_0 = spill5419_3;
        forwardValue5419_43_1 = spill5419_4;
        break forward_join_43;
    }
    forwardValue5419_42_0 = spill5419_3;
    forwardValue5419_42_1 = spill5419_4;
    forwardValue5419_42_2 = 2;
    }
    forwardValue5419_44_0 = forwardValue5419_42_0;
    forwardValue5419_44_1 = forwardValue5419_42_1;
    forwardValue5419_44_2 = forwardValue5419_42_2;
    break forward_join_44;
    }
    forwardValue5419_44_0 = forwardValue5419_43_0;
    forwardValue5419_44_1 = forwardValue5419_43_1;
    forwardValue5419_44_2 = 1;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5419_44_0)).a6 = ((float)((forwardValue5419_44_1 * ((float) forwardValue5419_44_2))));
    super.e(((float)(p0)), ((float)(p1)));
    this.u = ((double)((life12_37 * 0x1.3333333333333p-1d)));
    this.a6 = ((float)(life14_40));
    if (!((life5_11 != 0))) {
        break forward_join_65;
    }
    }
    forwardValue5419_62_0 = this;
    }
    __sourceIntrinsic_c23f50d43b1e_call5419_19(forwardValue5419_62_0, p0, p1);
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).f(((double)((this.n - life6_7))), ((double)((this.o - life8_10))), ((double)((this.p - life10_14))));
    return;
}


public void s__Void() {
net.minecraft.entity.player.EntityPlayer forwardValue5439_26_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5439_76_0;
    net.minecraft.entity.player.EntityPlayer spill5439_0;
    net.minecraft.entity.player.EntityPlayer spill5439_1;
    net.minecraft.entity.player.EntityPlayer spill5439_2;
    long life1_3;
    int life3_5;
    double life4_42;
    double life6_45;
    double life8_48;
    float life10_51;
    float life11_54;
    forward_join_81: {
    forward_join_76: {
    forward_join_26: {
    forward_join_25: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 103510090672933L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5439_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5439_26_0 = spill5439_0;
        break forward_join_26;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill5439_0)).i)).G))) {
        break forward_join_25;
    }
    spill5439_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue5439_26_0 = spill5439_1;
        break forward_join_26;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill5439_1)).t__Boolean())) {
        break forward_join_25;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).b(((net.minecraft.entity.Entity)(null)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).b(((boolean)(false)));
    if (!((life3_5 != 0))) {
        break forward_join_81;
    }
    }
    forwardValue5439_26_0 = this;
    }
    life4_42 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue5439_26_0)).n;
    life6_45 = this.o;
    life8_48 = this.p;
    life10_51 = this.w;
    life11_54 = this.x;
    super.s__Void();
    this.bJ = ((float)(this.bK));
    this.bK = ((float)(0x0.0p0f));
    ((net.minecraft.entity.player.EntityPlayer)(this)).g(((double)((this.n - life4_42))), ((double)((this.o - life6_45))), ((double)((this.p - life8_48))));
    spill5439_2 = this;
    if (!((life3_5 == 0))) {
        forwardValue5439_76_0 = spill5439_2;
        break forward_join_76;
    }
    if (!((((((net.minecraft.entity.player.EntityPlayer)(spill5439_2)).g instanceof net.minecraft.entity.passive.EntityPig) ? 1 : 0) != 0))) {
        break forward_join_81;
    }
    this.x = ((float)(life11_54));
    this.w = ((float)(life10_51));
    forwardValue5439_76_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5439_76_0)).a2 = ((float)(((net.minecraft.entity.passive.EntityPig)(((net.minecraft.entity.passive.EntityPig)(this.g)))).a2));
    }
    return;
}


public static int s() {
int local0 = __sourceExactCall_2ecfe7306c4872();
    if ((local0 == 0)) {
        return 65;
    }
    return 0;
}


public boolean c(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5415_17_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5415_21_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5415_30_0;
    moom.Bj forwardValue5415_36_0;
    int forwardValue5415_41_0;
    int forwardValue5415_43_0;
    boolean spill5415_0;
    net.minecraft.entity.player.EntityPlayer spill5415_1;
    net.minecraft.entity.player.EntityPlayer spill5415_2;
    moom.Bj spill5415_3;
    boolean spill5415_4;
    long life2_3;
    int life4_5;
    moom.Bj life5_32;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_30: {
    forward_join_21: {
    forward_join_20: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 122226930504606L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5415_0 = ((net.minecraft.entity.player.EntityPlayer)(this)).v__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue5415_17_0 = ((spill5415_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill5415_0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    spill5415_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5415_21_0 = spill5415_1;
        break forward_join_21;
    }
    forwardValue5415_17_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill5415_1)).U__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5415_17_0 != 0))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue5415_21_0 = this;
    }
    life5_32 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue5415_21_0)).a__Bj();
    if (!((life5_32 != null))) {
        break forward_join_40;
    }
    spill5415_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5415_30_0 = spill5415_2;
        break forward_join_30;
    }
    if (!((spill5415_2 != null))) {
        break forward_join_40;
    }
    forwardValue5415_30_0 = p0;
    }
    spill5415_3 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue5415_30_0)).a__Bj();
    if (!((life4_5 != 0))) {
        forwardValue5415_36_0 = spill5415_3;
        break forward_join_36;
    }
    if (!((spill5415_3 == life5_32))) {
        break forward_join_40;
    }
    forwardValue5415_36_0 = life5_32;
    }
    spill5415_4 = ((moom.Bj)(forwardValue5415_36_0)).a__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue5415_41_0 = ((spill5415_4) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill5415_4))) {
        break forward_join_42;
    }
    }
    forwardValue5415_41_0 = 1;
    }
    forwardValue5415_43_0 = forwardValue5415_41_0;
    break forward_join_43;
    }
    forwardValue5415_43_0 = 0;
    }
    return ((forwardValue5415_43_0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5416_80_0;
    int forwardValue5416_102_0;
    int forwardValue5416_164_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5416_172_0;
    java.lang.String forwardValue5416_172_1;
    int forwardValue5416_172_2;
    boolean spill5416_0;
    int spill5416_1;
    boolean spill5416_2;
    boolean spill5416_3;
    net.minecraft.nbt.NBTTagCompound spill5416_4;
    java.lang.String spill5416_5;
    int spill5416_6;
    long life2_3;
    int life4_13;
    net.minecraft.nbt.NBTTagList life5_22;
    net.minecraft.nbt.NBTTagList life6_209;
    forward_join_178: {
    forward_join_172: {
    forward_join_164: {
    forward_join_146: {
    forward_join_102: {
    forward_join_94: {
    forward_join_80: {
    forward_join_73: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 123920785259015L);
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    spill5416_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    this.ar = ((java.util.UUID)(__sourceExactCall_db997ad1931512(((com.mojang.authlib.GameProfile)(this.ca)))));
    life4_13 = ((spill5416_0) ? 1 : 0);
    life5_22 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Inventory")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5416_7(30377, (5028363727036349114L ^ life2_3)))));
    ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__Void(((net.minecraft.nbt.NBTTagList)(life5_22)));
    ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("SelectedItemSlot")))));
    this.bS = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Sleeping")))));
    this.bU = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("SleepTimer")))));
    this.b4 = ((float)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Float(((java.lang.String)("XpP")))));
    this.b2 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("XpLevel")))));
    this.b3 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("XpTotal")))));
    this.b5 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("XpSeed")))));
    spill5416_1 = this.b5;
    if (!((life4_13 == 0))) {
        forwardValue5416_80_0 = spill5416_1;
        break forward_join_80;
    }
    if (!((spill5416_1 == 0))) {
        break forward_join_73;
    }
    this.b5 = ((int)(((java.util.Random)(this.ah)).nextInt()));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).j(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Score"))))));
    forwardValue5416_80_0 = ((this.bS) ? 1 : 0);
    }
    if (!((life4_13 == 0))) {
        forwardValue5416_102_0 = forwardValue5416_80_0;
        break forward_join_102;
    }
    if (!((forwardValue5416_80_0 != 0))) {
        break forward_join_94;
    }
    this.bT = ((moom.DT)(new moom.DT(this)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((boolean)(true)), ((boolean)(true)), ((boolean)(false)));
    }
    forwardValue5416_102_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SpawnX")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5416_36(14115, (4626617955584162615L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_13 == 0))) {
        forwardValue5416_164_0 = forwardValue5416_102_0;
        break forward_join_164;
    }
    if (!((forwardValue5416_102_0 != 0))) {
        break forward_join_146;
    }
    spill5416_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SpawnY")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5416_39(22883, (3029967326524822899L ^ life2_3)))));
    if (!((life4_13 == 0))) {
        forwardValue5416_164_0 = ((spill5416_2) ? 1 : 0);
        break forward_join_164;
    }
    if (!(spill5416_2)) {
        break forward_join_146;
    }
    spill5416_3 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SpawnZ")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5416_42(22883, (3029967326524822899L ^ life2_3)))));
    if (!((life4_13 == 0))) {
        forwardValue5416_164_0 = ((spill5416_3) ? 1 : 0);
        break forward_join_164;
    }
    if (!(spill5416_3)) {
        break forward_join_146;
    }
    this.bY = ((moom.DT)(new moom.DT(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("SpawnX"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("SpawnY"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("SpawnZ"))))));
    this.bZ = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("SpawnForced")))));
    }
    ((net.minecraft.util.FoodStats)(this.bH)).a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    spill5416_4 = p0;
    spill5416_5 = "EnderItems";
    spill5416_6 = __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_55(7261, (7374048375708553297L ^ life2_3));
    if (!((life4_13 == 0))) {
        forwardValue5416_172_0 = spill5416_4;
        forwardValue5416_172_1 = spill5416_5;
        forwardValue5416_172_2 = spill5416_6;
        break forward_join_172;
    }
    forwardValue5416_164_0 = ((((net.minecraft.nbt.NBTTagCompound)(spill5416_4)).a__Boolean(((java.lang.String)(spill5416_5)), ((int)(spill5416_6)))) ? 1 : 0);
    }
    if (!((forwardValue5416_164_0 != 0))) {
        break forward_join_178;
    }
    forwardValue5416_172_0 = p0;
    forwardValue5416_172_1 = "EnderItems";
    forwardValue5416_172_2 = __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_58(30377, (5028363727036349114L ^ life2_3));
    }
    life6_209 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5416_172_0)).a(((java.lang.String)(forwardValue5416_172_1)), ((int)(forwardValue5416_172_2)));
    ((moom.wv)(this.bE)).a(((net.minecraft.nbt.NBTTagList)(life6_209)));
    }
    return;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29316;
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
         long var5 = ib[var3];
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
         Object[] var9 = (Object[])kb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               kb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral11733_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_89db7187fc3c9f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.item.ItemStack c__xW() {
return ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW();
}


protected java.lang.String c__String() {
return "game.player.hurt";
}


public int n() {
long local1 = (net.minecraft.entity.player.EntityPlayer.gb ^ 60572585030615L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_5c3f99722dec_originalDynamicSite2000_2(25515, (8594956834259314286L ^ local1)))));
}


public void n(int p0) {
int forwardValue5435_27_0;
    int forwardValue5435_34_0;
    int forwardValue5435_46_0;
    int forwardValue5435_51_0;
    int forwardValue5435_63_0;
    float forwardValue5435_66_0;
    boolean spill5435_0;
    int spill5435_1;
    long life2_3;
    int life4_11;
    float life5_95;
    forward_join_80: {
    forward_join_66: {
    forward_join_63: {
    forward_join_61: {
    forward_join_51: {
    forward_join_46: {
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 125677515831307L);
    spill5435_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    net.minecraft.entity.player.EntityPlayer __stackOp5435_2_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5435_2_0)).b2 = ((int)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5435_2_0)).b2 + p0)));
    life4_11 = ((spill5435_0) ? 1 : 0);
    spill5435_1 = this.b2;
    if (!((life4_11 == 0))) {
        forwardValue5435_27_0 = spill5435_1;
        break forward_join_27;
    }
    if (!((spill5435_1 < 0))) {
        break forward_join_26;
    }
    this.b2 = ((int)(0));
    this.b4 = ((float)(0x0.0p0f));
    this.b3 = ((int)(0));
    }
    forwardValue5435_27_0 = p0;
    }
    if (!((life4_11 == 0))) {
        forwardValue5435_34_0 = forwardValue5435_27_0;
        break forward_join_34;
    }
    if (!((forwardValue5435_27_0 > 0))) {
        break forward_join_80;
    }
    forwardValue5435_34_0 = (this.b2 % 5);
    }
    if (!((life4_11 == 0))) {
        forwardValue5435_46_0 = forwardValue5435_34_0;
        break forward_join_46;
    }
    if (!((forwardValue5435_34_0 == 0))) {
        break forward_join_80;
    }
    forwardValue5435_46_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) this.b_))), ((float)((((float) this.S) - 0x1.9p6f))));
    }
    if (!((life4_11 == 0))) {
        forwardValue5435_51_0 = forwardValue5435_46_0;
        break forward_join_51;
    }
    if (!((forwardValue5435_46_0 < 0))) {
        break forward_join_80;
    }
    forwardValue5435_51_0 = this.b2;
    }
    if (!((life4_11 == 0))) {
        forwardValue5435_63_0 = forwardValue5435_51_0;
        break forward_join_63;
    }
    if (!((forwardValue5435_51_0 > __sourceIntrinsic_e3ce5c7e7d84_invokedynamic5435_15(3040, (7548587725346817523L ^ life2_3))))) {
        break forward_join_61;
    }
    forwardValue5435_66_0 = 0x1.0p0f;
    break forward_join_66;
    }
    forwardValue5435_63_0 = this.b2;
    }
    forwardValue5435_66_0 = (((float) forwardValue5435_63_0) / 0x1.ep4f);
    }
    life5_95 = forwardValue5435_66_0;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((java.lang.String)("random.levelup")), ((float)((life5_95 * 0x1.8p-1f))), ((float)(0x1.0p0f)));
    this.b_ = ((int)(this.S));
    }
    return;
}


protected void n__Void() {
net.minecraft.entity.player.EntityPlayer forwardValue5436_12_0;
    net.minecraft.entity.player.EntityPlayer spill5436_0;
    long life1_3;
    int life3_5;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 27381948222327L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5436_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5436_12_0 = spill5436_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.entity.player.EntityPlayer)(spill5436_0)).U__Boolean()))) {
        break forward_join_13;
    }
    forwardValue5436_12_0 = this;
    }
    __sourceIntrinsic_7db5f979ba34_call5436_4(forwardValue5436_12_0);
    }
    return;
}


public void h(float p0) {
int forwardValue5428_17_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5428_19_0;
    boolean spill5428_0;
    net.minecraft.entity.player.EntityPlayer spill5428_1;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 34321752229389L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5428_0 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a;
    if (!((life4_5 == 0))) {
        forwardValue5428_17_0 = ((spill5428_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill5428_0))) {
        break forward_join_22;
    }
    spill5428_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue5428_19_0 = spill5428_1;
        break forward_join_19;
    }
    forwardValue5428_17_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill5428_1)).i)).G) ? 1 : 0);
    }
    if (!((forwardValue5428_17_0 == 0))) {
        break forward_join_22;
    }
    forwardValue5428_19_0 = this;
    }
    ((net.minecraft.util.FoodStats)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5428_19_0)).bH)).a(((float)(p0)));
    }
    return;
}


protected java.lang.String h__String() {
return "game.player.die";
}


public int f__sourceReturn_8abf5c6871() {
int forwardValue5422_13_0;
    int forwardValue5422_19_0;
    boolean spill5422_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 1486442787161L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5422_0 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a;
    if (!((life3_5 != 0))) {
        forwardValue5422_13_0 = ((spill5422_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill5422_0)) {
        break forward_join_14;
    }
    forwardValue5422_13_0 = 0;
    }
    forwardValue5422_19_0 = forwardValue5422_13_0;
    break forward_join_19;
    }
    forwardValue5422_19_0 = __sourceIntrinsic_d5f736cb4191_invokedynamic5422_6(4349, (6330242998872496033L ^ life1_3));
    }
    return forwardValue5422_19_0;
}


public void f__Void() {
moom.v8 forwardValue5424_19_0;
    boolean spill5424_0;
    moom.v8 spill5424_1;
    long life1_3;
    int life3_7;
    forward_join_21: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 115091185635753L);
    spill5424_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    super.f__Void();
    life3_7 = ((spill5424_0) ? 1 : 0);
    ((moom.v8)(this.bF)).a(((net.minecraft.entity.player.EntityPlayer)(this)));
    spill5424_1 = this.bG;
    if (!((life3_7 != 0))) {
        forwardValue5424_19_0 = spill5424_1;
        break forward_join_19;
    }
    if (!((spill5424_1 != null))) {
        break forward_join_21;
    }
    forwardValue5424_19_0 = this.bG;
    }
    ((moom.v8)(forwardValue5424_19_0)).a(((net.minecraft.entity.player.EntityPlayer)(this)));
    }
    return;
}


public void f(double p0, double p1, double p2) {
net.minecraft.entity.player.EntityPlayer forwardValue5423_12_0;
    int forwardValue5423_53_0;
    int forwardValue5423_88_0;
    int forwardValue5423_107_0;
    int forwardValue5423_132_0;
    int forwardValue5423_153_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5423_159_0;
    int forwardValue5423_179_0;
    net.minecraft.entity.player.EntityPlayer spill5423_0;
    boolean spill5423_1;
    int spill5423_2;
    net.minecraft.entity.player.EntityPlayer spill5423_3;
    long life7_3;
    int life9_5;
    int life10_41;
    int life10_88;
    int life10_166;
    int life10_248;
    forward_join_191: {
    forward_join_179: {
    forward_join_168: {
    forward_join_166: {
    forward_join_159: {
    forward_join_158: {
    forward_join_153: {
    forward_join_149: {
    forward_join_132: {
    forward_join_107: {
    forward_join_105: {
    forward_join_88: {
    forward_join_86: {
    forward_join_84: {
    forward_join_76: {
    forward_join_53: {
    forward_join_51: {
    forward_join_49: {
    forward_join_41: {
    forward_join_12: {
    life7_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 107221476300512L);
    life9_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5423_0 = this;
    if (!((life9_5 == 0))) {
        forwardValue5423_12_0 = spill5423_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5423_0)).g == null))) {
        break forward_join_191;
    }
    forwardValue5423_12_0 = this;
    }
    spill5423_1 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue5423_12_0)).a(((moom.fn)(moom.fn.h)));
    if (!((life9_5 == 0))) {
        forwardValue5423_53_0 = ((spill5423_1) ? 1 : 0);
        break forward_join_53;
    }
    if (!(spill5423_1)) {
        break forward_join_51;
    }
    life10_41 = java.lang.Math.round(((float)((moom.Dr.a__Float(((double)((((p0 * p0) + (p1 * p1)) + (p2 * p2))))) * 0x1.9p6f))));
    if (!((life9_5 == 0))) {
        break forward_join_41;
    }
    if (!((life10_41 > 0))) {
        break forward_join_49;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.p)), ((int)(life10_41)));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).h(((float)(((0x1.eb851ep-7f * ((float) life10_41)) * 0x1.47ae14p-7f))));
    }
    if (!((life9_5 != 0))) {
        break forward_join_191;
    }
    }
    forwardValue5423_53_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).j__Boolean()) ? 1 : 0);
    }
    if (!((life9_5 == 0))) {
        forwardValue5423_88_0 = forwardValue5423_53_0;
        break forward_join_88;
    }
    if (!((forwardValue5423_53_0 != 0))) {
        break forward_join_86;
    }
    life10_88 = java.lang.Math.round(((float)((moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2))))) * 0x1.9p6f))));
    if (!((life9_5 == 0))) {
        break forward_join_76;
    }
    if (!((life10_88 > 0))) {
        break forward_join_84;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.l)), ((int)(life10_88)));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).h(((float)(((0x1.eb851ep-7f * ((float) life10_88)) * 0x1.47ae14p-7f))));
    }
    if (!((life9_5 != 0))) {
        break forward_join_191;
    }
    }
    forwardValue5423_88_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).I__Boolean()) ? 1 : 0);
    }
    if (!((life9_5 == 0))) {
        forwardValue5423_107_0 = forwardValue5423_88_0;
        break forward_join_107;
    }
    if (!((forwardValue5423_88_0 != 0))) {
        break forward_join_105;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p1)), ((double)(0x0.0p0d))) > 0))) {
        break forward_join_191;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.n)), ((int)(((int) java.lang.Math.round(((double)((p1 * 0x1.9p6d))))))));
    if (!((life9_5 != 0))) {
        break forward_join_191;
    }
    }
    forwardValue5423_107_0 = ((this.A) ? 1 : 0);
    }
    if (!((life9_5 == 0))) {
        forwardValue5423_179_0 = forwardValue5423_107_0;
        break forward_join_179;
    }
    if (!((forwardValue5423_107_0 != 0))) {
        break forward_join_168;
    }
    life10_166 = java.lang.Math.round(((float)((moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2))))) * 0x1.9p6f))));
    spill5423_2 = life10_166;
    if (!((life9_5 == 0))) {
        forwardValue5423_132_0 = spill5423_2;
        break forward_join_132;
    }
    if (!((spill5423_2 > 0))) {
        break forward_join_166;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.i)), ((int)(life10_166)));
    forwardValue5423_132_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).u__Boolean()) ? 1 : 0);
    }
    if (!((life9_5 == 0))) {
        forwardValue5423_153_0 = forwardValue5423_132_0;
        break forward_join_153;
    }
    if (!((forwardValue5423_132_0 != 0))) {
        break forward_join_149;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.k)), ((int)(life10_166)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).h(((float)(((0x1.999998p-4f * ((float) life10_166)) * 0x1.47ae14p-7f))));
    if (!((life9_5 != 0))) {
        break forward_join_166;
    }
    }
    spill5423_3 = this;
    if (!((life9_5 == 0))) {
        forwardValue5423_159_0 = spill5423_3;
        break forward_join_159;
    }
    forwardValue5423_153_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill5423_3)).t__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5423_153_0 != 0))) {
        break forward_join_158;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.j)), ((int)(life10_166)));
    }
    forwardValue5423_159_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5423_159_0)).h(((float)(((0x1.47ae14p-7f * ((float) life10_166)) * 0x1.47ae14p-7f))));
    }
    if (!((life9_5 != 0))) {
        break forward_join_191;
    }
    }
    forwardValue5423_179_0 = java.lang.Math.round(((float)((moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2))))) * 0x1.9p6f))));
    }
    life10_248 = forwardValue5423_179_0;
    if (!((life10_248 > __sourceIntrinsic_adcc04842c60_invokedynamic5423_43(29501, (8258688703828726722L ^ life7_3))))) {
        break forward_join_191;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.o)), ((int)(life10_248)));
    }
    return;
}


public void l(int p0) {
boolean spill1621_0;
    long life2_3;
    int life4_8;
    int life5_17;
    lexical_join_70: {
    lexical_join_36: {
    lexical_join_25: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 103788179483201L);
    spill1621_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    ((net.minecraft.entity.player.EntityPlayer)(this)).k(((int)(p0)));
    life4_8 = ((spill1621_0) ? 1 : 0);
    life5_17 = (__sourceIntrinsic_3c5642f51658_invokedynamic1621_4(22564, (163894972700165224L ^ life2_3)) - this.b3);
    if (!((life4_8 != 0))) {
        break lexical_join_36;
    }
    if (!((p0 > life5_17))) {
        break lexical_join_25;
    }
    p0 = life5_17;
    }
    net.minecraft.entity.player.EntityPlayer __stackOp1621_6_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp1621_6_0)).b4 = ((float)((((net.minecraft.entity.player.EntityPlayer)(__stackOp1621_6_0)).b4 + (((float) p0) / ((float) ((net.minecraft.entity.player.EntityPlayer)(this)).q__sourceReturn_8abf5c6871())))));
    }
    net.minecraft.entity.player.EntityPlayer __stackOp1621_10_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp1621_10_0)).b3 = ((int)((((net.minecraft.entity.player.EntityPlayer)(__stackOp1621_10_0)).b3 + p0)));
    lexical_cycle_42: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(this.b4)), ((float)(0x1.0p0f))) >= 0))) {
        break lexical_join_70;
    }
    this.b4 = ((float)(((this.b4 - 0x1.0p0f) * ((float) ((net.minecraft.entity.player.EntityPlayer)(this)).q__sourceReturn_8abf5c6871()))));
    ((net.minecraft.entity.player.EntityPlayer)(this)).n(((int)(1)));
    net.minecraft.entity.player.EntityPlayer __stackOp1621_19_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp1621_19_0)).b4 = ((float)((((net.minecraft.entity.player.EntityPlayer)(__stackOp1621_19_0)).b4 / ((float) ((net.minecraft.entity.player.EntityPlayer)(this)).q__sourceReturn_8abf5c6871()))));
    if (!((life4_8 == 0))) { continue lexical_cycle_42; }
    break lexical_cycle_42;
    }
    }
    return;
}


public float l() {
java.lang.Comparable forwardValue552_18_0;
    moom.DT spill552_0;
    long life1_3;
    int life3_5;
    moom.bs life4_25;
    forward_join_33: {
    forward_join_31: {
    forward_join_29: {
    forward_join_27: {
    forward_join_25: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 115278143950361L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill552_0 = this.bT;
    if (!((life3_5 != 0))) {
        forwardValue552_18_0 = spill552_0;
        break forward_join_18;
    }
    if (!((spill552_0 != null))) {
        break forward_join_33;
    }
    forwardValue552_18_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(this.bT))))).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDirectional.Q)));
    }
    life4_25 = ((moom.bs)(forwardValue552_18_0));
    switch ((moom.vZ.a)[((moom.bs)(life4_25)).ordinal()]) {
case 1:
{
        break forward_join_25;
    }
case 2:
{
        break forward_join_27;
    }
case 3:
{
        break forward_join_29;
    }
case 4:
{
        break forward_join_31;
    }
default:
{
        break forward_join_33;
    }
}
    }
    return 0x1.68p6f;
    }
    return 0x1.0ep8f;
    }
    return 0x0.0p0f;
    }
    return 0x1.68p7f;
    }
    return 0x0.0p0f;
}


public void l(net.minecraft.entity.Entity p0) {
return;
}


public int l__Int() {
return this.b7;
}


protected java.lang.String d__String() {
return "game.player.swim";
}


public void d(float p0, float p1) {
int forwardValue5417_15_0;
    boolean spill5417_0;
    long life3_3;
    int life5_5;
    forward_join_29: {
    forward_join_25: {
    forward_join_15: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 45573951067903L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5417_0 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).c;
    if (!((life5_5 == 0))) {
        forwardValue5417_15_0 = ((spill5417_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill5417_0))) {
        break forward_join_29;
    }
    forwardValue5417_15_0 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(0x1.0p1f)));
    }
    if (!((forwardValue5417_15_0 >= 0))) {
        break forward_join_25;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.m)), ((int)(((int) java.lang.Math.round(((double)((((double) p0) * 0x1.9p6d))))))));
    }
    super.d(((float)(p0)), ((float)(p1)));
    }
    return;
}


public double d() {
return -0x1.6666666666666p-2d;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.player.EntityPlayer forwardValue5418_103_0;
    net.minecraft.item.ItemStack forwardValue5418_111_0;
    boolean spill5418_0;
    net.minecraft.entity.player.EntityPlayer spill5418_1;
    net.minecraft.item.ItemStack spill5418_2;
    long life2_3;
    int life4_59;
    net.minecraft.item.ItemStack life5_111;
    forward_join_121: {
    forward_join_111: {
    forward_join_103: {
    forward_join_88: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 85557628477708L);
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Inventory")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a(((net.minecraft.nbt.NBTTagList)(new net.minecraft.nbt.NBTTagList()))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("SelectedItemSlot")), ((int)(((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Sleeping")), ((boolean)(this.bS)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SleepTimer")), ((short)(((short) this.bU))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("XpP")), ((float)(this.b4)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("XpLevel")), ((int)(this.b2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("XpTotal")), ((int)(this.b3)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("XpSeed")), ((int)(this.b5)));
    spill5418_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Score")), ((int)(((net.minecraft.entity.player.EntityPlayer)(this)).n())));
    life4_59 = ((spill5418_0) ? 1 : 0);
    spill5418_1 = this;
    if (!((life4_59 != 0))) {
        forwardValue5418_103_0 = spill5418_1;
        break forward_join_103;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5418_1)).bY != null))) {
        break forward_join_88;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("SpawnX")), ((int)(((moom.DT)(this.bY)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("SpawnY")), ((int)(((moom.DT)(this.bY)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("SpawnZ")), ((int)(((moom.DT)(this.bY)).c())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SpawnForced")), ((boolean)(this.bZ)));
    }
    ((net.minecraft.util.FoodStats)(this.bH)).b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("EnderItems")), ((net.minecraft.nbt.NBTBase)(((moom.wv)(this.bE)).a())));
    forwardValue5418_103_0 = this;
    }
    life5_111 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5418_103_0)).bD)).a__xW();
    spill5418_2 = life5_111;
    if (!((life4_59 != 0))) {
        forwardValue5418_111_0 = spill5418_2;
        break forward_join_111;
    }
    if (!((spill5418_2 != null))) {
        break forward_join_121;
    }
    forwardValue5418_111_0 = life5_111;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5418_111_0)).a__wQ() != null))) {
        break forward_join_121;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SelectedItem")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(life5_111)).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
    return;
}


public int d__Int() {
return ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).g();
}


protected void d__Void() {
long local1 = (net.minecraft.entity.player.EntityPlayer.gb ^ 5220211312212L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_3(29246, (1829154049291223652L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_7(16527, (4739477015151816925L ^ local1)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(0x0.0p0f))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_11(13621, (1035602311663043935L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_15(15985, (4853245575570640418L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void a(moom.BY p0, int p1) {
return;
}


public void a(java.lang.String p0, float p1, float p2) {
((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.player.EntityPlayer)(this)), ((java.lang.String)(p0)), ((float)(p1)), ((float)(p2)));
    return;
}


public void a(moom.BY p0) {
((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(p0)), ((int)(1)));
    return;
}


public boolean a(moom.DT p0, moom.bs p1, net.minecraft.item.ItemStack p2) {
int forwardValue5391_13_0;
    int forwardValue5391_41_0;
    int forwardValue5391_43_0;
    boolean spill5391_0;
    boolean spill5391_1;
    boolean spill5391_2;
    long life4_3;
    int life6_5;
    moom.DT life7_27;
    net.minecraft.block.Block life8_33;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_18: {
    forward_join_14: {
    forward_join_13: {
    life4_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 122005899163441L);
    life6_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5391_0 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).e;
    if (!((life6_5 != 0))) {
        forwardValue5391_13_0 = ((spill5391_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill5391_0)) {
        break forward_join_14;
    }
    forwardValue5391_13_0 = 1;
    }
    return ((forwardValue5391_13_0) != 0);
    }
    if (!((p2 == null))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    life7_27 = ((moom.DT)(p0)).a(((moom.bs)(((moom.bs)(p1)).a__bs())));
    life8_33 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life7_27))))).a__ch();
    spill5391_1 = ((net.minecraft.item.ItemStack)(p2)).c(((net.minecraft.block.Block)(life8_33)));
    if (!((life6_5 != 0))) {
        forwardValue5391_41_0 = ((spill5391_1) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill5391_1))) {
        break forward_join_40;
    }
    spill5391_2 = ((net.minecraft.item.ItemStack)(p2)).j();
    if (!((life6_5 != 0))) {
        forwardValue5391_41_0 = ((spill5391_2) ? 1 : 0);
        break forward_join_41;
    }
    if (!(spill5391_2)) {
        break forward_join_42;
    }
    }
    forwardValue5391_41_0 = 1;
    }
    forwardValue5391_43_0 = forwardValue5391_41_0;
    break forward_join_43;
    }
    forwardValue5391_43_0 = 0;
    }
    return ((forwardValue5391_43_0) != 0);
}


public void a__sourceReturn_969697899e(net.minecraft.entity.EntityLivingBase p0) {
java.lang.Object forwardValue5398_19_0;
    net.minecraft.entity.EntityLivingBase spill5398_0;
    long life2_3;
    int life4_5;
    net.minecraft.entity.EntityList$EntityEggInfo life5_26;
    forward_join_27: {
    forward_join_19: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 23982638542255L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5398_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5398_19_0 = spill5398_0;
        break forward_join_19;
    }
    if (!((((spill5398_0 instanceof moom.vP) ? 1 : 0) != 0))) {
        break forward_join_14;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.AchievementList.s)));
    }
    forwardValue5398_19_0 = ((java.util.Map)(net.minecraft.entity.EntityList.g)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(net.minecraft.entity.EntityList.a(((net.minecraft.entity.Entity)(p0)))))))));
    }
    life5_26 = ((net.minecraft.entity.EntityList$EntityEggInfo)(forwardValue5398_19_0));
    if (!((life5_26 != null))) {
        break forward_join_27;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(((net.minecraft.entity.EntityList$EntityEggInfo)(life5_26)).d)));
    }
    return;
}


protected void a(net.minecraft.item.ItemStack p0, int p1) {
moom.a1 lexicalValue1619_27_0;
    moom.a1 lexicalValue1619_27_1;
    moom.a1 spill1619_0;
    moom.a1 spill1619_1;
    long life3_3;
    int life5_5;
    int life6_35;
    moom.DR life7_56;
    moom.DR life7_66;
    moom.DR life7_76;
    double life8_86;
    moom.DR life10_100;
    moom.DR life10_110;
    moom.DR life10_120;
    moom.DR life10_133;
    lexical_join_220: {
    lexical_join_197: {
    lexical_join_27: {
    lexical_join_24: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 75669850972538L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill1619_0 = ((net.minecraft.item.ItemStack)(p0)).a__a1();
    spill1619_1 = moom.a1.DRINK;
    if (!((life5_5 != 0))) {
        lexicalValue1619_27_0 = spill1619_0;
        lexicalValue1619_27_1 = spill1619_1;
        break lexical_join_27;
    }
    if (!((spill1619_0 == spill1619_1))) {
        break lexical_join_24;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((java.lang.String)("random.drink")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextFloat() * 0x1.99999ap-4f) + 0x1.ccccccp-1f))));
    }
    lexicalValue1619_27_0 = ((net.minecraft.item.ItemStack)(p0)).a__a1();
    lexicalValue1619_27_1 = moom.a1.EAT;
    }
    if (!((lexicalValue1619_27_0 == lexicalValue1619_27_1))) {
        break lexical_join_220;
    }
    life6_35 = 0;
    lexical_cycle_30: while (true) {
    lexical_join_194: {
    lexical_join_168: {
    lexical_join_166: {
    if (!((life6_35 < p1))) {
        break lexical_join_197;
    }
    life7_56 = new moom.DR(((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * 0x1.999999999999ap-4d), ((java.lang.Math.random() * 0x1.999999999999ap-4d) + 0x1.999999999999ap-4d), 0x0.0p0d);
    life7_66 = ((moom.DR)(life7_56)).a(((float)((((-this.x) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life7_76 = ((moom.DR)(life7_66)).b(((float)((((-this.w) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life8_86 = ((((double) (-((java.util.Random)(this.ah)).nextFloat())) * 0x1.3333333333333p-1d) - 0x1.3333333333333p-2d);
    life10_100 = new moom.DR(((((double) ((java.util.Random)(this.ah)).nextFloat()) - 0x1.0p-1d) * 0x1.3333333333333p-2d), life8_86, 0x1.3333333333333p-1d);
    life10_110 = ((moom.DR)(life10_100)).a(((float)((((-this.x) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life10_120 = ((moom.DR)(life10_110)).b(((float)((((-this.w) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life10_133 = ((moom.DR)(life10_120)).b(((double)(this.n)), ((double)((this.o + ((double) ((net.minecraft.entity.player.EntityPlayer)(this)).e__Float())))), ((double)(this.p)));
    if (!((life5_5 != 0))) {
        break lexical_join_220;
    }
    if (!((life5_5 != 0))) {
        break lexical_join_166;
    }
    if (!(((net.minecraft.item.ItemStack)(p0)).c__Boolean())) {
        break lexical_join_168;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.ITEM_CRACK)), ((double)(((moom.DR)(life10_133)).a)), ((double)(((moom.DR)(life10_133)).b)), ((double)(((moom.DR)(life10_133)).c)), ((double)(((moom.DR)(life7_76)).a)), ((double)((((moom.DR)(life7_76)).b + 0x1.999999999999ap-5d))), ((double)(((moom.DR)(life7_76)).c)), ((int[])(new int[] {__sourceExactCall_7da118eea97d77(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p0)).a__wQ()))), ((net.minecraft.item.ItemStack)(p0)).c()})));
    }
    if (!((life5_5 == 0))) {
        break lexical_join_194;
    }
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.ITEM_CRACK)), ((double)(((moom.DR)(life10_133)).a)), ((double)(((moom.DR)(life10_133)).b)), ((double)(((moom.DR)(life10_133)).c)), ((double)(((moom.DR)(life7_76)).a)), ((double)((((moom.DR)(life7_76)).b + 0x1.999999999999ap-5d))), ((double)(((moom.DR)(life7_76)).c)), ((int[])(new int[] {__sourceExactCall_7da118eea97d77(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))})));
    }
    life6_35 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((java.lang.String)("random.eat")), ((float)((0x1.0p-1f + (0x1.0p-1f * ((float) ((java.util.Random)(this.ah)).nextInt(((int)(2)))))))), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    }
    return;
}


protected java.lang.String a__String(int p0) {
long local2 = (net.minecraft.entity.player.EntityPlayer.gb ^ 77018132815881L);
    return ((p0 > 4) ? "game.player.hurt.fall.big" : "game.player.hurt.fall.small");
}


public net.minecraft.entity.item.EntityItem a(boolean p0) {
net.minecraft.entity.player.EntityPlayer forwardValue5406_23_0;
    net.minecraft.entity.player.InventoryPlayer forwardValue5406_23_1;
    int forwardValue5406_23_2;
    net.minecraft.item.ItemStack forwardValue5406_23_3;
    net.minecraft.entity.player.EntityPlayer forwardValue5406_25_0;
    net.minecraft.entity.player.InventoryPlayer forwardValue5406_25_1;
    int forwardValue5406_25_2;
    net.minecraft.entity.player.EntityPlayer forwardValue5406_26_0;
    net.minecraft.entity.player.InventoryPlayer forwardValue5406_26_1;
    int forwardValue5406_26_2;
    int forwardValue5406_26_3;
    net.minecraft.entity.player.EntityPlayer spill5406_0;
    net.minecraft.entity.player.InventoryPlayer spill5406_1;
    int spill5406_2;
    net.minecraft.item.ItemStack spill5406_3;
    long life2_3;
    int life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 22740131569503L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5406_0 = this;
    spill5406_1 = this.bD;
    spill5406_2 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c;
    if (!(p0)) {
        forwardValue5406_25_0 = spill5406_0;
        forwardValue5406_25_1 = spill5406_1;
        forwardValue5406_25_2 = spill5406_2;
        break forward_join_25;
    }
    spill5406_3 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW();
    if (!((life4_5 != 0))) {
        forwardValue5406_23_0 = spill5406_0;
        forwardValue5406_23_1 = spill5406_1;
        forwardValue5406_23_2 = spill5406_2;
        forwardValue5406_23_3 = spill5406_3;
        break forward_join_23;
    }
    if (!((spill5406_3 != null))) {
        forwardValue5406_25_0 = spill5406_0;
        forwardValue5406_25_1 = spill5406_1;
        forwardValue5406_25_2 = spill5406_2;
        break forward_join_25;
    }
    forwardValue5406_23_0 = spill5406_0;
    forwardValue5406_23_1 = spill5406_1;
    forwardValue5406_23_2 = spill5406_2;
    forwardValue5406_23_3 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW();
    }
    forwardValue5406_26_0 = forwardValue5406_23_0;
    forwardValue5406_26_1 = forwardValue5406_23_1;
    forwardValue5406_26_2 = forwardValue5406_23_2;
    forwardValue5406_26_3 = ((net.minecraft.item.ItemStack)(forwardValue5406_23_3)).b;
    break forward_join_26;
    }
    forwardValue5406_26_0 = forwardValue5406_25_0;
    forwardValue5406_26_1 = forwardValue5406_25_1;
    forwardValue5406_26_2 = forwardValue5406_25_2;
    forwardValue5406_26_3 = 1;
    }
    return ((net.minecraft.entity.player.EntityPlayer)(forwardValue5406_26_0)).a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(forwardValue5406_26_1)).a(((int)(forwardValue5406_26_2)), ((int)(forwardValue5406_26_3))))), ((boolean)(false)), ((boolean)(true)));
}


public net.minecraft.util.FoodStats a__C2() {
return this.bH;
}


public boolean a__Boolean(boolean p0) {
int forwardValue5410_19_0;
    int forwardValue5410_23_0;
    int forwardValue5410_25_0;
    boolean spill5410_0;
    boolean spill5410_1;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 113722655357522L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5410_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5410_19_0 = ((spill5410_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill5410_0))) {
        break forward_join_16;
    }
    spill5410_1 = ((net.minecraft.util.FoodStats)(this.bH)).a__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue5410_19_0 = ((spill5410_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill5410_1)) {
        break forward_join_24;
    }
    }
    forwardValue5410_19_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5410_23_0 = forwardValue5410_19_0;
        break forward_join_23;
    }
    if (!((forwardValue5410_19_0 == 0))) {
        break forward_join_24;
    }
    forwardValue5410_23_0 = 1;
    }
    forwardValue5410_25_0 = forwardValue5410_23_0;
    break forward_join_25;
    }
    forwardValue5410_25_0 = 0;
    }
    return ((forwardValue5410_25_0) != 0);
}


public void a(byte p0) {
int forestValue1116_25_0;
    int forestValue1116_25_1;
    int forestValue1116_39_0;
    int forestValue1116_39_1;
    byte spill1116_0;
    int spill1116_1;
    long life2_3;
    int life4_5;
    forest_join_48: {
    forest_join_45: {
    forest_join_39: {
    forest_join_33: {
    forest_join_25: {
    forest_join_19: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 108744484990550L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill1116_0 = p0;
    spill1116_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic1116_3(32162, (3011180262409299453L ^ life2_3));
    if (!((life4_5 == 0))) {
        forestValue1116_25_0 = ((int)(spill1116_0));
        forestValue1116_25_1 = spill1116_1;
        break forest_join_25;
    }
    if (!((spill1116_0 == spill1116_1))) {
        break forest_join_19;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).P();
    if (!((life4_5 != 0))) {
        break forest_join_48;
    }
    }
    forestValue1116_25_0 = ((int)(p0));
    forestValue1116_25_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic1116_6(16636, (1542952439360608433L ^ life2_3));
    }
    if (!((life4_5 == 0))) {
        forestValue1116_39_0 = forestValue1116_25_0;
        forestValue1116_39_1 = forestValue1116_25_1;
        break forest_join_39;
    }
    if (!((forestValue1116_25_0 == forestValue1116_25_1))) {
        break forest_join_33;
    }
    this.cb = ((boolean)(false));
    if (!((life4_5 != 0))) {
        break forest_join_48;
    }
    }
    forestValue1116_39_0 = ((int)(p0));
    forestValue1116_39_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic1116_9(18507, (4620011544570023939L ^ life2_3));
    }
    if (!((forestValue1116_39_0 == forestValue1116_39_1))) {
        break forest_join_45;
    }
    this.cb = ((boolean)(true));
    if (!((life4_5 != 0))) {
        break forest_join_48;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public boolean a(moom.Eq p0) {
int forwardValue5392_12_0;
    net.minecraft.item.ItemStack forwardValue5392_21_0;
    int forwardValue5392_30_0;
    int forwardValue5392_34_0;
    int forwardValue5392_36_0;
    boolean spill5392_0;
    net.minecraft.item.ItemStack spill5392_1;
    boolean spill5392_2;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_18;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_21: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 124387298612796L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5392_0 = ((moom.Eq)(p0)).a__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5392_12_0 = ((spill5392_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill5392_0)) {
        break forward_join_13;
    }
    forwardValue5392_12_0 = 1;
    }
    return ((forwardValue5392_12_0) != 0);
    }
    life5_18 = ((net.minecraft.entity.player.EntityPlayer)(this)).c__xW();
    spill5392_1 = life5_18;
    if (!((life4_5 == 0))) {
        forwardValue5392_21_0 = spill5392_1;
        break forward_join_21;
    }
    if (!((spill5392_1 != null))) {
        break forward_join_35;
    }
    forwardValue5392_21_0 = life5_18;
    }
    spill5392_2 = ((net.minecraft.item.ItemStack)(forwardValue5392_21_0)).f__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5392_30_0 = ((spill5392_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill5392_2)) {
        break forward_join_35;
    }
    forwardValue5392_30_0 = ((((java.lang.String)(((net.minecraft.item.ItemStack)(life5_18)).b__String())).equals(((java.lang.Object)(((moom.Eq)(p0)).a())))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5392_34_0 = forwardValue5392_30_0;
        break forward_join_34;
    }
    if (!((forwardValue5392_30_0 != 0))) {
        break forward_join_35;
    }
    forwardValue5392_34_0 = 1;
    }
    forwardValue5392_36_0 = forwardValue5392_34_0;
    break forward_join_36;
    }
    forwardValue5392_36_0 = 0;
    }
    return ((forwardValue5392_36_0) != 0);
}


public static java.util.UUID a__sourceReturn_984c41f0e8(java.lang.String p0) {
return java.util.UUID.nameUUIDFromBytes(((byte[])(((java.lang.String)(__sourceIntrinsic_2a36a7fdae99_originalDynamicSite2002_0(p0))).getBytes(((java.nio.charset.Charset)(com.google.common.base.Charsets.UTF_8))))));
}


public static java.util.UUID a(com.mojang.authlib.GameProfile p0) {
java.util.UUID forwardValue5389_18_0;
    boolean spill5389_0;
    java.util.UUID spill5389_1;
    long life1_3;
    java.util.UUID life4_7;
    int life3_8;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 120910423528757L);
    spill5389_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    life4_7 = ((com.mojang.authlib.GameProfile)(p0)).getId();
    life3_8 = ((spill5389_0) ? 1 : 0);
    spill5389_1 = life4_7;
    if (!((life3_8 == 0))) {
        forwardValue5389_18_0 = spill5389_1;
        break forward_join_18;
    }
    if (!((spill5389_1 == null))) {
        break forward_join_17;
    }
    life4_7 = __sourceExactCall_f0619aac10bdc2(((java.lang.String)(((com.mojang.authlib.GameProfile)(p0)).getName())));
    }
    forwardValue5389_18_0 = life4_7;
    }
    return forwardValue5389_18_0;
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CM local1 = new moom.CM(moom.Bk.a(((moom.Bj)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bj())), ((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this)).a__String()))));
    ((moom.CO)(((net.minecraft.util.IChatComponent)(local1)).a__CO())).a(((moom.v2)(new moom.v2(net.minecraft.event.ClickEvent$Action.SUGGEST_COMMAND, __sourceIntrinsic_6e581d8d1b3b_originalDynamicSite2003_6(((net.minecraft.entity.player.EntityPlayer)(this)).a__String())))));
    ((moom.CO)(((net.minecraft.util.IChatComponent)(local1)).a__CO())).a(((moom.v3)(((net.minecraft.entity.player.EntityPlayer)(this)).a__v3())));
    ((moom.CO)(((net.minecraft.util.IChatComponent)(local1)).a__CO())).a(((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this)).a__String())));
    return local1;
}


public moom.Bj a__Bj() {
return ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh())).c(((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this)).a__String())));
}


public static moom.DT a(net.minecraft.world.World p0, moom.DT p1, boolean p2) {
int forwardValue5405_22_0;
    int forwardValue5405_35_0;
    moom.DT forwardValue5405_39_0;
    boolean spill5405_0;
    boolean spill5405_1;
    int spill5405_2;
    long life3_3;
    net.minecraft.block.Block life6_9;
    int life5_10;
    int life7_30;
    int life8_37;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_35: {
    forward_join_22: {
    forward_join_20: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 12006715890456L);
    spill5405_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    life6_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life5_10 = ((spill5405_0) ? 1 : 0);
    if (!((life6_9 != net.minecraft.init.Blocks.C))) {
        break forward_join_40;
    }
    spill5405_1 = p2;
    if (!((life5_10 != 0))) {
        forwardValue5405_22_0 = ((spill5405_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill5405_1))) {
        break forward_join_20;
    }
    return null;
    }
    forwardValue5405_22_0 = ((((net.minecraft.block.Block)(life6_9)).n()) ? 1 : 0);
    }
    life7_30 = forwardValue5405_22_0;
    life8_37 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).n()) ? 1 : 0);
    spill5405_2 = life7_30;
    if (!((life5_10 != 0))) {
        forwardValue5405_35_0 = spill5405_2;
        break forward_join_35;
    }
    if (!((spill5405_2 != 0))) {
        break forward_join_38;
    }
    forwardValue5405_35_0 = life8_37;
    }
    if (!((forwardValue5405_35_0 != 0))) {
        break forward_join_38;
    }
    forwardValue5405_39_0 = p1;
    break forward_join_39;
    }
    forwardValue5405_39_0 = null;
    }
    return forwardValue5405_39_0;
    }
    return __sourceExactCall_cff869ea9f2b7f(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((int)(0)));
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.ai.attributes.BaseAttributeMap)(((net.minecraft.entity.player.EntityPlayer)(this)).a__vE())).b(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.0p0d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.99999ap-4d)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.GameRules)(((net.minecraft.world.WorldServer)((((moom.Bl)(moom.Bl.a__Bl())).n)[0])).a__Ej())).a__Boolean(((java.lang.String)("sendCommandFeedback"))))) != 0);
}


public boolean a(net.minecraft.entity.player.EnumPlayerModelParts p0) {
int forwardValue5401_23_0;
    int forwardValue5401_25_0;
    int spill5401_0;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 34200926866058L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5401_0 = (((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.player.EntityPlayer)(this)).a__r1())).a(((int)(__sourceIntrinsic_108cbe15f863_invokedynamic5401_4(30377, (5028332225726220855L ^ life2_3))))) & ((net.minecraft.entity.player.EnumPlayerModelParts)(p0)).a());
    if (!((life4_5 == 0))) {
        forwardValue5401_23_0 = spill5401_0;
        break forward_join_23;
    }
    if (!((spill5401_0 == ((net.minecraft.entity.player.EnumPlayerModelParts)(p0)).a()))) {
        break forward_join_24;
    }
    forwardValue5401_23_0 = 1;
    }
    forwardValue5401_25_0 = forwardValue5401_23_0;
    break forward_join_25;
    }
    forwardValue5401_25_0 = 0;
    }
    return ((forwardValue5401_25_0) != 0);
}


public moom.wv a__wv() {
return this.bE;
}


public java.lang.String a__String() {
return ((com.mojang.authlib.GameProfile)(this.ca)).getName();
}


public void a(net.minecraft.world.WorldSettings$GameType p0) {
return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, boolean p1) {
int forwardValue5400_60_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5400_91_0;
    boolean spill5400_0;
    net.minecraft.entity.player.EntityPlayer spill5400_1;
    long life3_3;
    int life5_5;
    forward_join_91: {
    forward_join_82: {
    forward_join_60: {
    forward_join_53: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 86506500757457L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5400_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue5400_60_0 = ((spill5400_0) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill5400_0)) {
        break forward_join_53;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).d(((float)(((net.minecraft.entity.player.EntityPlayer)(p0)).b__sourceReturn_bc607678b6())));
    this.bH = ((net.minecraft.util.FoodStats)(((net.minecraft.entity.player.EntityPlayer)(p0)).bH));
    this.b2 = ((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).b2));
    this.b3 = ((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).b3));
    this.b4 = ((float)(((net.minecraft.entity.player.EntityPlayer)(p0)).b4));
    ((net.minecraft.entity.player.EntityPlayer)(this)).j(((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).n())));
    this.ao = ((moom.DT)(((net.minecraft.entity.player.EntityPlayer)(p0)).ao));
    this.ap = ((moom.DR)(((net.minecraft.entity.player.EntityPlayer)(p0)).ap));
    this.aq = ((moom.bs)(((net.minecraft.entity.player.EntityPlayer)(p0)).aq));
    if (!((life5_5 != 0))) {
        break forward_join_82;
    }
    }
    spill5400_1 = this;
    if (!((life5_5 == 0))) {
        forwardValue5400_91_0 = spill5400_1;
        break forward_join_91;
    }
    forwardValue5400_60_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill5400_1)).i)).a__Ej())).a__Boolean(((java.lang.String)("keepInventory")))) ? 1 : 0);
    }
    if (!((forwardValue5400_60_0 != 0))) {
        break forward_join_82;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)));
    this.b2 = ((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).b2));
    this.b3 = ((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).b3));
    this.b4 = ((float)(((net.minecraft.entity.player.EntityPlayer)(p0)).b4));
    ((net.minecraft.entity.player.EntityPlayer)(this)).j(((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).n())));
    }
    this.b5 = ((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).b5));
    this.bE = ((moom.wv)(((net.minecraft.entity.player.EntityPlayer)(p0)).bE));
    forwardValue5400_91_0 = this;
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5400_91_0)).a__r1())).b(((int)(__sourceIntrinsic_e9aa692f4537_invokedynamic5400_45(30377, (5028383551207823212L ^ life3_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__r1())).a(((int)(__sourceIntrinsic_e9aa692f4537_invokedynamic5400_47(30377, (5028383551207823212L ^ life3_3)))))))))));
    return;
}


protected int a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5399_24_0;
    boolean spill5399_0;
    long life2_3;
    int life4_5;
    int life5_29;
    forward_join_24: {
    forward_join_16: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 134539462506009L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5399_0 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("keepInventory")));
    if (!((life4_5 == 0))) {
        forwardValue5399_24_0 = ((spill5399_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill5399_0)) {
        break forward_join_16;
    }
    return 0;
    }
    forwardValue5399_24_0 = (this.b2 * __sourceIntrinsic_635fc168609b_invokedynamic5399_8(23003, (9163560601962781138L ^ life2_3)));
    }
    life5_29 = forwardValue5399_24_0;
    return java.lang.Math.min(((int)(life5_29)), ((int)(__sourceIntrinsic_635fc168609b_invokedynamic5399_9(30953, (492389789403363561L ^ life2_3)))));
}


public net.minecraft.scoreboard.Scoreboard a__Bh() {
return ((net.minecraft.world.World)(this.i)).a__Bh();
}


public net.minecraft.item.ItemStack[] a__ArrayxW() {
return ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).b;
}


public net.minecraft.item.ItemStack a__xW() {
return ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW();
}


public net.minecraft.item.ItemStack a__xW(int p0) {
long local2 = (net.minecraft.entity.player.EntityPlayer.gb ^ 45076224331386L);
    return ((p0 == 0) ? ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW() : (((net.minecraft.entity.player.InventoryPlayer)(this.bD)).b)[(p0 - 1)]);
}


public void a(net.minecraft.inventory.IInventory p0) {
return;
}


public void a(net.minecraft.entity.IMerchant p0) {
return;
}


public void a(moom.qV p0) {
return;
}


public void a(moom.Ct p0) {
return;
}


protected void a__Void(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5411_14_0;
    int forwardValue5411_21_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5411_40_0;
    float forwardValue5411_45_0;
    float forwardValue5411_73_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5411_93_0;
    boolean spill5411_0;
    net.minecraft.entity.player.EntityPlayer spill5411_1;
    float spill5411_2;
    float spill5411_3;
    net.minecraft.entity.player.EntityPlayer spill5411_4;
    long life3_3;
    int life5_5;
    float life6_66;
    float life2_73;
    float life7_100;
    forward_join_99: {
    forward_join_93: {
    forward_join_73: {
    forward_join_45: {
    forward_join_40: {
    forward_join_34: {
    forward_join_21: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 105792977635356L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5411_0 = ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue5411_14_0 = ((spill5411_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill5411_0))) {
        break forward_join_99;
    }
    forwardValue5411_14_0 = ((((net.minecraft.util.DamageSource)(p0)).c__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue5411_21_0 = forwardValue5411_14_0;
        break forward_join_21;
    }
    if (!((forwardValue5411_14_0 == 0))) {
        break forward_join_34;
    }
    spill5411_1 = this;
    if (!((life5_5 == 0))) {
        forwardValue5411_40_0 = spill5411_1;
        break forward_join_40;
    }
    forwardValue5411_21_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill5411_1)).N__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5411_21_0 != 0))) {
        break forward_join_34;
    }
    spill5411_2 = p1;
    if (!((life5_5 == 0))) {
        forwardValue5411_45_0 = spill5411_2;
        break forward_join_45;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill5411_2)), ((float)(0x0.0p0f))) > 0))) {
        break forward_join_34;
    }
    p1 = ((0x1.0p0f + p1) * 0x1.0p-1f);
    }
    p1 = ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
    forwardValue5411_40_0 = this;
    }
    p1 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue5411_40_0)).b(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
    forwardValue5411_45_0 = p1;
    }
    life6_66 = forwardValue5411_45_0;
    life2_73 = java.lang.Math.max(((float)((p1 - ((net.minecraft.entity.player.EntityPlayer)(this)).j__sourceReturn_bc607678b6()))), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).g(((float)((((net.minecraft.entity.player.EntityPlayer)(this)).j__sourceReturn_bc607678b6() - (life6_66 - life2_73)))));
    spill5411_3 = life2_73;
    if (!((life5_5 == 0))) {
        forwardValue5411_73_0 = spill5411_3;
        break forward_join_73;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill5411_3)), ((float)(0x0.0p0f))) != 0))) {
        break forward_join_99;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).h(((float)(((net.minecraft.util.DamageSource)(p0)).a())));
    forwardValue5411_73_0 = ((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6();
    }
    life7_100 = forwardValue5411_73_0;
    ((net.minecraft.entity.player.EntityPlayer)(this)).d(((float)((((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6() - life2_73))));
    spill5411_4 = this;
    if (!((life5_5 == 0))) {
        forwardValue5411_93_0 = spill5411_4;
        break forward_join_93;
    }
    ((net.minecraft.util.CombatTracker)(((net.minecraft.entity.player.EntityPlayer)(spill5411_4)).a__CS())).a(((net.minecraft.util.DamageSource)(p0)), ((float)(life7_100)), ((float)(life2_73)));
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life2_73)), ((float)(0x1.999998p124f))) < 0))) {
        break forward_join_99;
    }
    forwardValue5411_93_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5411_93_0)).a(((moom.BY)(net.minecraft.stats.StatList.x)), ((int)(java.lang.Math.round(((float)((life2_73 * 0x1.4p3f)))))));
    }
    return;
}


public com.mojang.authlib.GameProfile a__sourceReturn_cd99b948a0() {
return this.ca;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
int forwardValue5404_48_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5404_50_0;
    boolean spill5404_0;
    boolean spill5404_1;
    net.minecraft.entity.player.EntityPlayer spill5404_2;
    net.minecraft.entity.player.EntityPlayer spill5404_3;
    double spill5404_4;
    long life2_3;
    int life4_23;
    forward_join_94: {
    forward_join_88: {
    forward_join_52: {
    forward_join_50: {
    forward_join_48: {
    forward_join_41: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 96660578884476L);
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((float)(0x1.99999ap-3f)), ((float)(0x1.99999ap-3f)));
    spill5404_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    ((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    this.u = ((double)(0x1.99999ap-4d));
    life4_23 = ((spill5404_0) ? 1 : 0);
    spill5404_1 = ((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this)).a__String())).equals(((java.lang.Object)("Notch")));
    if (!((life4_23 != 0))) {
        forwardValue5404_48_0 = ((spill5404_1) ? 1 : 0);
        break forward_join_48;
    }
    if (!(spill5404_1)) {
        break forward_join_41;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.e, 1))), ((boolean)(true)), ((boolean)(false)));
    }
    spill5404_2 = this;
    if (!((life4_23 != 0))) {
        forwardValue5404_50_0 = spill5404_2;
        break forward_join_50;
    }
    forwardValue5404_48_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill5404_2)).i)).a__Ej())).a__Boolean(((java.lang.String)("keepInventory")))) ? 1 : 0);
    }
    if (!((forwardValue5404_48_0 == 0))) {
        break forward_join_52;
    }
    forwardValue5404_50_0 = this;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5404_50_0)).bD)).d__Void();
    }
    if (!((p0 != null))) {
        break forward_join_88;
    }
    this.t = ((double)(((double) ((-moom.Dr.b(((float)((((this.aQ + this.w) * 0x1.921fb6p1f) / 0x1.68p7f))))) * 0x1.99999ap-4f))));
    this.v = ((double)(((double) ((-moom.Dr.a(((float)((((this.aQ + this.w) * 0x1.921fb6p1f) / 0x1.68p7f))))) * 0x1.99999ap-4f))));
    if (!((life4_23 == 0))) {
        break forward_join_94;
    }
    }
    spill5404_3 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5404_29_0 = this;
    double __stackOp5404_29_1 = 0x0.0p0d;
    spill5404_4 = __stackOp5404_29_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5404_29_0)).v = ((double)(__stackOp5404_29_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill5404_3)).t = ((double)(spill5404_4));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.y)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).b(((moom.BY)(net.minecraft.stats.StatList.h)));
    return;
}


public void a(net.minecraft.item.ItemStack p0) {
return;
}


public void a(net.minecraft.world.IInteractionObject p0) {
return;
}


public void a(net.minecraft.entity.passive.EntityHorse p0, net.minecraft.inventory.IInventory p1) {
return;
}


public float a(net.minecraft.block.Block p0, int p1, boolean p2) {
int forwardValue549_44_0;
    int forwardValue549_64_0;
    int forwardValue549_97_0;
    int forwardValue549_111_0;
    int forwardValue549_115_0;
    boolean spill549_0;
    int spill549_1;
    int spill549_2;
    boolean spill549_3;
    long life4_3;
    float life7_10;
    int life6_11;
    int life8_23;
    net.minecraft.item.ItemStack life9_28;
    float life8_83;
    forward_join_120: {
    forward_join_115: {
    forward_join_111: {
    forward_join_109: {
    forward_join_97: {
    forward_join_94: {
    forward_join_90: {
    forward_join_88: {
    forward_join_84: {
    forward_join_80: {
    forward_join_78: {
    forward_join_76: {
    forward_join_64: {
    forward_join_61: {
    forward_join_44: {
    forward_join_41: {
    life4_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 110437085951311L);
    spill549_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    life7_10 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a(((net.minecraft.block.Block)(p0)), ((int)(p1)));
    life6_11 = ((spill549_0) ? 1 : 0);
    spill549_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_10)), ((float)(0x1.0p0f)));
    if (!((life6_11 != 0))) {
        forwardValue549_44_0 = spill549_1;
        break forward_join_44;
    }
    if (!((spill549_1 > 0))) {
        break forward_join_41;
    }
    life8_23 = moom.rV.c(((net.minecraft.entity.EntityLivingBase)(this)));
    life9_28 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW(((int)(p1)));
    spill549_2 = life8_23;
    if (!((life6_11 != 0))) {
        forwardValue549_44_0 = spill549_2;
        break forward_join_44;
    }
    if (!((spill549_2 > 0))) {
        break forward_join_41;
    }
    if (!((life9_28 != null))) {
        break forward_join_41;
    }
    life7_10 = (life7_10 + ((float) ((life8_23 * life8_23) + 1)));
    }
    forwardValue549_44_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f)))) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue549_64_0 = forwardValue549_44_0;
        break forward_join_64;
    }
    if (!((forwardValue549_44_0 != 0))) {
        break forward_join_61;
    }
    life7_10 = (life7_10 * (0x1.0p0f + (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f))))).c() + 1)) * 0x1.99999ap-3f)));
    }
    forwardValue549_64_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g)))) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue549_97_0 = forwardValue549_64_0;
        break forward_join_97;
    }
    if (!((forwardValue549_64_0 != 0))) {
        break forward_join_94;
    }
    life8_83 = 0x1.0p0f;
    if (!((life6_11 != 0))) {
        break forward_join_78;
    }
    switch (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g))))).c()) {
case 0:
{
        break forward_join_76;
    }
case 1:
{
        break forward_join_80;
    }
case 2:
{
        break forward_join_84;
    }
case 3:
default:
{
        break forward_join_88;
    }
}
    }
    life8_83 = 0x1.333334p-2f;
    }
    if (!((life6_11 == 0))) {
        break forward_join_90;
    }
    }
    life8_83 = 0x1.70a3d8p-4f;
    if (!((life6_11 == 0))) {
        break forward_join_90;
    }
    }
    life8_83 = 0x1.61e4f8p-9f;
    if (!((life6_11 == 0))) {
        break forward_join_90;
    }
    }
    life8_83 = 0x1.a8ac5cp-11f;
    }
    life7_10 = (life7_10 * life8_83);
    }
    forwardValue549_97_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.fn)(moom.fn.h)))) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue549_111_0 = forwardValue549_97_0;
        break forward_join_111;
    }
    if (!((forwardValue549_97_0 != 0))) {
        break forward_join_109;
    }
    spill549_3 = moom.rV.b__Boolean(((net.minecraft.entity.EntityLivingBase)(this)));
    if (!((life6_11 != 0))) {
        forwardValue549_111_0 = ((spill549_3) ? 1 : 0);
        break forward_join_111;
    }
    if (!((!spill549_3))) {
        break forward_join_109;
    }
    life7_10 = (life7_10 / 0x1.4p2f);
    }
    forwardValue549_111_0 = ((this.A) ? 1 : 0);
    }
    if (!((life6_11 != 0))) {
        forwardValue549_115_0 = forwardValue549_111_0;
        break forward_join_115;
    }
    if (!((forwardValue549_111_0 == 0))) {
        break forward_join_120;
    }
    forwardValue549_115_0 = ((p2) ? 1 : 0);
    }
    if (!((forwardValue549_115_0 == 0))) {
        break forward_join_120;
    }
    life7_10 = (life7_10 / 0x1.4p2f);
    }
    return life7_10;
}


public float a(net.minecraft.block.Block p0, int p1) {
int forwardValue548_43_0;
    int forwardValue548_63_0;
    int forwardValue548_96_0;
    int forwardValue548_110_0;
    boolean spill548_0;
    int spill548_1;
    int spill548_2;
    boolean spill548_3;
    long life3_3;
    float life6_10;
    int life5_11;
    int life7_23;
    net.minecraft.item.ItemStack life8_27;
    float life7_82;
    forward_join_115: {
    forward_join_110: {
    forward_join_108: {
    forward_join_96: {
    forward_join_93: {
    forward_join_89: {
    forward_join_87: {
    forward_join_83: {
    forward_join_79: {
    forward_join_77: {
    forward_join_75: {
    forward_join_63: {
    forward_join_60: {
    forward_join_43: {
    forward_join_40: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 77541676597421L);
    spill548_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    life6_10 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a(((net.minecraft.block.Block)(p0)), ((int)(p1)));
    life5_11 = ((spill548_0) ? 1 : 0);
    spill548_1 = recovery.source.CarrierOps.fcmpl(((float)(life6_10)), ((float)(0x1.0p0f)));
    if (!((life5_11 != 0))) {
        forwardValue548_43_0 = spill548_1;
        break forward_join_43;
    }
    if (!((spill548_1 > 0))) {
        break forward_join_40;
    }
    life7_23 = moom.rV.c(((net.minecraft.entity.EntityLivingBase)(this)));
    life8_27 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW();
    spill548_2 = life7_23;
    if (!((life5_11 != 0))) {
        forwardValue548_43_0 = spill548_2;
        break forward_join_43;
    }
    if (!((spill548_2 > 0))) {
        break forward_join_40;
    }
    if (!((life8_27 != null))) {
        break forward_join_40;
    }
    life6_10 = (life6_10 + ((float) ((life7_23 * life7_23) + 1)));
    }
    forwardValue548_43_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f)))) ? 1 : 0);
    }
    if (!((life5_11 != 0))) {
        forwardValue548_63_0 = forwardValue548_43_0;
        break forward_join_63;
    }
    if (!((forwardValue548_43_0 != 0))) {
        break forward_join_60;
    }
    life6_10 = (life6_10 * (0x1.0p0f + (((float) (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.f))))).c() + 1)) * 0x1.99999ap-3f)));
    }
    forwardValue548_63_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g)))) ? 1 : 0);
    }
    if (!((life5_11 != 0))) {
        forwardValue548_96_0 = forwardValue548_63_0;
        break forward_join_96;
    }
    if (!((forwardValue548_63_0 != 0))) {
        break forward_join_93;
    }
    life7_82 = 0x1.0p0f;
    if (!((life5_11 != 0))) {
        break forward_join_77;
    }
    switch (((net.minecraft.potion.PotionEffect)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.g))))).c()) {
case 0:
{
        break forward_join_75;
    }
case 1:
{
        break forward_join_79;
    }
case 2:
{
        break forward_join_83;
    }
case 3:
default:
{
        break forward_join_87;
    }
}
    }
    life7_82 = 0x1.333334p-2f;
    }
    if (!((life5_11 == 0))) {
        break forward_join_89;
    }
    }
    life7_82 = 0x1.70a3d8p-4f;
    if (!((life5_11 == 0))) {
        break forward_join_89;
    }
    }
    life7_82 = 0x1.61e4f8p-9f;
    if (!((life5_11 == 0))) {
        break forward_join_89;
    }
    }
    life7_82 = 0x1.a8ac5cp-11f;
    }
    life6_10 = (life6_10 * life7_82);
    }
    forwardValue548_96_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.fn)(moom.fn.h)))) ? 1 : 0);
    }
    if (!((life5_11 != 0))) {
        forwardValue548_110_0 = forwardValue548_96_0;
        break forward_join_110;
    }
    if (!((forwardValue548_96_0 != 0))) {
        break forward_join_108;
    }
    spill548_3 = moom.rV.b__Boolean(((net.minecraft.entity.EntityLivingBase)(this)));
    if (!((life5_11 != 0))) {
        forwardValue548_110_0 = ((spill548_3) ? 1 : 0);
        break forward_join_110;
    }
    if (!((!spill548_3))) {
        break forward_join_108;
    }
    life6_10 = (life6_10 / 0x1.4p2f);
    }
    forwardValue548_110_0 = ((this.A) ? 1 : 0);
    }
    if (!((forwardValue548_110_0 == 0))) {
        break forward_join_115;
    }
    life6_10 = (life6_10 / 0x1.4p2f);
    }
    return life6_10;
}


protected void a(net.minecraft.entity.item.EntityItem p0) {
((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(p0)));
    return;
}


public net.minecraft.entity.item.EntityItem a(net.minecraft.item.ItemStack p0, boolean p1, boolean p2) {
net.minecraft.item.ItemStack forwardValue5403_13_0;
    int forwardValue5403_54_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5403_206_0;
    net.minecraft.item.ItemStack spill5403_0;
    boolean spill5403_1;
    net.minecraft.entity.player.EntityPlayer spill5403_2;
    long life4_3;
    int life6_5;
    double life7_32;
    net.minecraft.entity.item.EntityItem life9_44;
    float life10_73;
    float life11_81;
    float life10_103;
    float life11_167;
    float life10_173;
    forward_join_208: {
    forward_join_206: {
    forward_join_198: {
    forward_join_89: {
    forward_join_54: {
    forward_join_53: {
    forward_join_17: {
    forward_join_13: {
    forward_join_12: {
    life4_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 21991828227270L);
    life6_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5403_0 = p0;
    if (!((life6_5 != 0))) {
        forwardValue5403_13_0 = spill5403_0;
        break forward_join_13;
    }
    if (!((spill5403_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue5403_13_0 = p0;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5403_13_0)).b == 0))) {
        break forward_join_17;
    }
    return null;
    }
    life7_32 = ((this.o - 0x1.333334p-2d) + ((double) ((net.minecraft.entity.player.EntityPlayer)(this)).e__Float()));
    life9_44 = new net.minecraft.entity.item.EntityItem(this.i, this.n, life7_32, this.p, p0);
    ((net.minecraft.entity.item.EntityItem)(life9_44)).g(((int)(__sourceIntrinsic_e8c1e12cb8dd_invokedynamic5403_9(26698, (9221925226504313475L ^ life4_3)))));
    spill5403_1 = p2;
    if (!((life6_5 != 0))) {
        forwardValue5403_54_0 = ((spill5403_1) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill5403_1)) {
        break forward_join_53;
    }
    ((net.minecraft.entity.item.EntityItem)(life9_44)).c(((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this)).a__String())));
    }
    forwardValue5403_54_0 = ((p1) ? 1 : 0);
    }
    if (!((forwardValue5403_54_0 != 0))) {
        break forward_join_89;
    }
    life10_73 = (((java.util.Random)(this.ah)).nextFloat() * 0x1.0p-1f);
    life11_81 = ((((java.util.Random)(this.ah)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    ((net.minecraft.entity.item.EntityItem)(life9_44)).t = ((double)(((double) ((-moom.Dr.a(((float)(life11_81)))) * life10_73))));
    ((net.minecraft.entity.item.EntityItem)(life9_44)).v = ((double)(((double) (moom.Dr.b(((float)(life11_81))) * life10_73))));
    ((net.minecraft.entity.item.EntityItem)(life9_44)).u = ((double)(0x1.99999ap-3d));
    if (!((life6_5 == 0))) {
        break forward_join_198;
    }
    }
    life10_103 = 0x1.333334p-2f;
    ((net.minecraft.entity.item.EntityItem)(life9_44)).t = ((double)(((double) (((-moom.Dr.a(((float)(((this.w / 0x1.68p7f) * 0x1.921fb6p1f))))) * moom.Dr.b(((float)(((this.x / 0x1.68p7f) * 0x1.921fb6p1f))))) * life10_103))));
    ((net.minecraft.entity.item.EntityItem)(life9_44)).v = ((double)(((double) ((moom.Dr.b(((float)(((this.w / 0x1.68p7f) * 0x1.921fb6p1f)))) * moom.Dr.b(((float)(((this.x / 0x1.68p7f) * 0x1.921fb6p1f))))) * life10_103))));
    ((net.minecraft.entity.item.EntityItem)(life9_44)).u = ((double)(((double) (((-moom.Dr.a(((float)(((this.x / 0x1.68p7f) * 0x1.921fb6p1f))))) * life10_103) + 0x1.99999ap-4f))));
    life11_167 = ((((java.util.Random)(this.ah)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    life10_173 = (0x1.47ae14p-6f * ((java.util.Random)(this.ah)).nextFloat());
    net.minecraft.entity.item.EntityItem __stackOp5403_41_0 = life9_44;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5403_41_0)).t = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5403_41_0)).t + (java.lang.Math.cos(((double)(((double) life11_167)))) * ((double) life10_173)))));
    net.minecraft.entity.item.EntityItem __stackOp5403_45_0 = life9_44;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5403_45_0)).u = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5403_45_0)).u + ((double) ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-4f)))));
    net.minecraft.entity.item.EntityItem __stackOp5403_52_0 = life9_44;
    ((net.minecraft.entity.item.EntityItem)(__stackOp5403_52_0)).v = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp5403_52_0)).v + (java.lang.Math.sin(((double)(((double) life11_167)))) * ((double) life10_173)))));
    }
    spill5403_2 = this;
    if (!((life6_5 != 0))) {
        forwardValue5403_206_0 = spill5403_2;
        break forward_join_206;
    }
    ((net.minecraft.entity.player.EntityPlayer)(spill5403_2)).a(((net.minecraft.entity.item.EntityItem)(life9_44)));
    if (!(p2)) {
        break forward_join_208;
    }
    forwardValue5403_206_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5403_206_0)).a(((moom.BY)(net.minecraft.stats.StatList.v)));
    }
    return life9_44;
}


public net.minecraft.entity.item.EntityItem a(net.minecraft.item.ItemStack p0, boolean p1) {
return ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((boolean)(false)), ((boolean)(false)));
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
moom.Bj forwardValue5408_17_0;
    int forwardValue5408_28_0;
    int forwardValue5408_30_0;
    boolean spill5408_0;
    moom.Bj spill5408_1;
    boolean spill5408_2;
    boolean spill5408_3;
    long life2_3;
    moom.Bj life5_7;
    int life4_8;
    moom.Bj life6_11;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 133330079419234L);
    spill5408_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    life5_7 = ((net.minecraft.entity.player.EntityPlayer)(this)).a__Bj();
    life4_8 = ((spill5408_0) ? 1 : 0);
    life6_11 = ((net.minecraft.entity.player.EntityPlayer)(p0)).a__Bj();
    spill5408_1 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue5408_17_0 = spill5408_1;
        break forward_join_17;
    }
    if (!((spill5408_1 != null))) {
        break forward_join_27;
    }
    forwardValue5408_17_0 = life5_7;
    }
    spill5408_2 = ((moom.Bj)(forwardValue5408_17_0)).a(((moom.Bj)(life6_11)));
    if (!((life4_8 == 0))) {
        forwardValue5408_28_0 = ((spill5408_2) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill5408_2)) {
        break forward_join_27;
    }
    spill5408_3 = ((moom.Bj)(life5_7)).b__Boolean();
    if (!((life4_8 == 0))) {
        forwardValue5408_28_0 = ((spill5408_3) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill5408_3)) {
        break forward_join_29;
    }
    }
    forwardValue5408_28_0 = 1;
    }
    forwardValue5408_30_0 = forwardValue5408_28_0;
    break forward_join_30;
    }
    forwardValue5408_30_0 = 0;
    }
    return ((forwardValue5408_30_0) != 0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forestValue900230_17_0;
    int forestValue900230_34_0;
    int forestValue900230_41_0;
    int forestValue900230_57_0;
    net.minecraft.world.EnumDifficulty forestValue900230_73_0;
    net.minecraft.world.EnumDifficulty forestValue900230_73_1;
    net.minecraft.world.EnumDifficulty forestValue900230_86_0;
    net.minecraft.world.EnumDifficulty forestValue900230_86_1;
    int forestValue900230_96_0;
    int forestValue900230_100_0;
    net.minecraft.entity.Entity forestValue900230_118_0;
    int forestValue900230_123_0;
    boolean spill900230_0;
    boolean spill900230_1;
    boolean spill900230_2;
    net.minecraft.world.EnumDifficulty spill900230_3;
    net.minecraft.world.EnumDifficulty spill900230_4;
    int spill900230_5;
    net.minecraft.entity.Entity spill900230_6;
    long life3_3;
    int life5_5;
    net.minecraft.entity.Entity life6_149;
    net.minecraft.entity.Entity life6_172;
    forest_join_123: {
    forest_join_119: {
    forest_join_118: {
    forest_join_101: {
    forest_join_100: {
    forest_join_96: {
    forest_join_93: {
    forest_join_86: {
    forest_join_82: {
    forest_join_73: {
    forest_join_69: {
    forest_join_57: {
    forest_join_55: {
    forest_join_41: {
    forest_join_39: {
    forest_join_34: {
    forest_join_27: {
    forest_join_17: {
    forest_join_14: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 25825394047621L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill900230_0 = ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 != 0))) {
        forestValue900230_17_0 = ((spill900230_0) ? 1 : 0);
        break forest_join_17;
    }
    if (!(spill900230_0)) {
        break forest_join_14;
    }
    return ((0) != 0);
    }
    forestValue900230_17_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue900230_34_0 = forestValue900230_17_0;
        break forest_join_34;
    }
    if (!((forestValue900230_17_0 != 0))) {
        break forest_join_27;
    }
    spill900230_1 = ((net.minecraft.util.DamageSource)(p0)).d__Boolean();
    if (!((life5_5 != 0))) {
        forestValue900230_34_0 = ((spill900230_1) ? 1 : 0);
        break forest_join_34;
    }
    if (!((!spill900230_1))) {
        break forest_join_27;
    }
    return ((0) != 0);
    }
    this.a_ = ((int)(0));
    forestValue900230_34_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 != 0))) {
        forestValue900230_41_0 = forestValue900230_34_0;
        break forest_join_41;
    }
    if (!((forestValue900230_34_0 <= 0))) {
        break forest_join_39;
    }
    return ((0) != 0);
    }
    forestValue900230_41_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).K__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue900230_57_0 = forestValue900230_41_0;
        break forest_join_57;
    }
    if (!((forestValue900230_41_0 != 0))) {
        break forest_join_55;
    }
    spill900230_2 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 != 0))) {
        forestValue900230_57_0 = ((spill900230_2) ? 1 : 0);
        break forest_join_57;
    }
    if (!((!spill900230_2))) {
        break forest_join_55;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((boolean)(true)), ((boolean)(true)), ((boolean)(false)));
    }
    forestValue900230_57_0 = ((((net.minecraft.util.DamageSource)(p0)).g__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forestValue900230_96_0 = forestValue900230_57_0;
        break forest_join_96;
    }
    if (!((forestValue900230_57_0 != 0))) {
        break forest_join_93;
    }
    spill900230_3 = ((net.minecraft.world.World)(this.i)).a__bB();
    spill900230_4 = net.minecraft.world.EnumDifficulty.PEACEFUL;
    if (!((life5_5 != 0))) {
        forestValue900230_73_0 = spill900230_3;
        forestValue900230_73_1 = spill900230_4;
        break forest_join_73;
    }
    if (!((spill900230_3 == spill900230_4))) {
        break forest_join_69;
    }
    p1 = 0x0.0p0f;
    }
    forestValue900230_73_0 = ((net.minecraft.world.World)(this.i)).a__bB();
    forestValue900230_73_1 = net.minecraft.world.EnumDifficulty.EASY;
    }
    if (!((life5_5 != 0))) {
        forestValue900230_86_0 = forestValue900230_73_0;
        forestValue900230_86_1 = forestValue900230_73_1;
        break forest_join_86;
    }
    if (!((forestValue900230_73_0 == forestValue900230_73_1))) {
        break forest_join_82;
    }
    p1 = ((p1 / 0x1.0p1f) + 0x1.0p0f);
    }
    forestValue900230_86_0 = ((net.minecraft.world.World)(this.i)).a__bB();
    forestValue900230_86_1 = net.minecraft.world.EnumDifficulty.HARD;
    }
    if (!((forestValue900230_86_0 == forestValue900230_86_1))) {
        break forest_join_93;
    }
    p1 = ((p1 * 0x1.8p1f) / 0x1.0p1f);
    }
    forestValue900230_96_0 = recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 != 0))) {
        forestValue900230_100_0 = forestValue900230_96_0;
        break forest_join_100;
    }
    if (!((forestValue900230_96_0 == 0))) {
        break forest_join_101;
    }
    forestValue900230_100_0 = 0;
    }
    return ((forestValue900230_100_0) != 0);
    }
    life6_149 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    spill900230_5 = ((life6_149 instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forestValue900230_123_0 = spill900230_5;
        break forest_join_123;
    }
    if (!((spill900230_5 != 0))) {
        break forest_join_119;
    }
    spill900230_6 = ((net.minecraft.entity.projectile.EntityArrow)(((net.minecraft.entity.projectile.EntityArrow)(life6_149)))).aM;
    if (!((life5_5 != 0))) {
        forestValue900230_118_0 = spill900230_6;
        break forest_join_118;
    }
    if (!((spill900230_6 != null))) {
        break forest_join_119;
    }
    forestValue900230_118_0 = ((net.minecraft.entity.projectile.EntityArrow)(((net.minecraft.entity.projectile.EntityArrow)(life6_149)))).aM;
    }
    life6_172 = forestValue900230_118_0;
    life6_172 = life6_172;
    }
    forestValue900230_123_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forestValue900230_123_0) != 0);
}


public void a(net.minecraft.entity.Entity p0, int p1) {
int lexicalValue1618_34_0;
    boolean spill1618_0;
    int spill1618_1;
    long life3_3;
    int life5_8;
    java.util.Collection life6_13;
    java.util.Iterator life7_51;
    net.minecraft.scoreboard.ScoreObjective life8_58;
    net.minecraft.scoreboard.Score life9_65;
    lexical_join_61: {
    lexical_join_40: {
    lexical_join_37: {
    lexical_join_34: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 118746681969810L);
    spill1618_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    ((net.minecraft.entity.player.EntityPlayer)(this)).k(((int)(p1)));
    life5_8 = ((spill1618_0) ? 1 : 0);
    life6_13 = ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh())).a(((net.minecraft.scoreboard.IScoreObjectiveCriteria)(net.minecraft.scoreboard.IScoreObjectiveCriteria.f)));
    spill1618_1 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_8 == 0))) {
        lexicalValue1618_34_0 = spill1618_1;
        break lexical_join_34;
    }
    if (!((spill1618_1 != 0))) {
        break lexical_join_37;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.B)));
    ((java.util.Collection)(life6_13)).addAll(((java.util.Collection)(((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh())).a(((net.minecraft.scoreboard.IScoreObjectiveCriteria)(net.minecraft.scoreboard.IScoreObjectiveCriteria.e))))));
    lexicalValue1618_34_0 = ((((java.util.Collection)(life6_13)).addAll(((java.util.Collection)(((net.minecraft.entity.player.EntityPlayer)(this)).a__sourceReturn_e14b809245(((net.minecraft.entity.Entity)(p0))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1618_34_0);
    if (!((life5_8 != 0))) {
        break lexical_join_40;
    }
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.z)));
    }
    life7_51 = ((java.util.Collection)(life6_13)).iterator();
    lexical_cycle_43: while (true) {
    if (!(((java.util.Iterator)(life7_51)).hasNext())) {
        break lexical_join_61;
    }
    life8_58 = ((net.minecraft.scoreboard.ScoreObjective)(((java.util.Iterator)(life7_51)).next()));
    life9_65 = ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh())).a(((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this)).a__String())), ((net.minecraft.scoreboard.ScoreObjective)(life8_58)));
    ((net.minecraft.scoreboard.Score)(life9_65)).a__Void();
    if (!((life5_8 != 0))) { continue lexical_cycle_43; }
    break lexical_cycle_43;
    }
    }
    return;
}


public boolean a__Boolean(net.minecraft.block.Block p0, int p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__Boolean(((net.minecraft.block.Block)(p0)), ((int)(p1))))) != 0);
}


private java.util.Collection<net.minecraft.scoreboard.ScoreObjective> a__sourceReturn_e14b809245(net.minecraft.entity.Entity p0) {
net.minecraft.scoreboard.Scoreboard lexicalValue1617_60_0;
    java.lang.String lexicalValue1617_60_1;
    moom.Bk lexicalValue1617_61_0;
    moom.Bk lexicalValue1617_67_0;
    int lexicalValue1617_75_0;
    boolean spill1617_0;
    moom.Bk spill1617_1;
    moom.Bk spill1617_2;
    net.minecraft.scoreboard.Scoreboard spill1617_3;
    java.lang.String spill1617_4;
    moom.Bk spill1617_5;
    int spill1617_6;
    long life2_3;
    moom.Bk life5_10;
    int life4_11;
    int life6_27;
    java.util.Iterator life7_44;
    net.minecraft.scoreboard.ScoreObjective life8_51;
    net.minecraft.scoreboard.Score life9_60;
    moom.Bk life6_70;
    int life7_81;
    lexical_join_85: {
    lexical_join_75: {
    lexical_join_67: {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_56: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 126031425013431L);
    spill1617_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    life5_10 = ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh())).c(((java.lang.String)(__sourceExactCall_761729e13ff900(((net.minecraft.entity.player.EntityPlayer)(this))))));
    life4_11 = ((spill1617_0) ? 1 : 0);
    spill1617_1 = life5_10;
    if (!((life4_11 == 0))) {
        lexicalValue1617_61_0 = spill1617_1;
        break lexical_join_61;
    }
    if (!((spill1617_1 != null))) {
        break lexical_join_56;
    }
    spill1617_2 = life5_10;
    if (!((life4_11 == 0))) {
        lexicalValue1617_61_0 = spill1617_2;
        break lexical_join_61;
    }
    life6_27 = ((net.minecraft.util.EnumChatFormatting)(((moom.Bk)(spill1617_2)).a__br())).a();
    if (!((life6_27 >= 0))) {
        break lexical_join_56;
    }
    if (!((life6_27 < (net.minecraft.scoreboard.IScoreObjectiveCriteria.i).length))) {
        break lexical_join_56;
    }
    life7_44 = ((java.util.Collection)(((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh())).a(((net.minecraft.scoreboard.IScoreObjectiveCriteria)((net.minecraft.scoreboard.IScoreObjectiveCriteria.i)[life6_27]))))).iterator();
    lexical_cycle_36: while (true) {
    if (!(((java.util.Iterator)(life7_44)).hasNext())) {
        break lexical_join_56;
    }
    life8_51 = ((net.minecraft.scoreboard.ScoreObjective)(((java.util.Iterator)(life7_44)).next()));
    spill1617_3 = ((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh();
    spill1617_4 = __sourceExactCall_73e780db0476d5(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_11 == 0))) {
        lexicalValue1617_60_0 = spill1617_3;
        lexicalValue1617_60_1 = spill1617_4;
        break lexical_join_60;
    }
    life9_60 = ((net.minecraft.scoreboard.Scoreboard)(spill1617_3)).a(((java.lang.String)(spill1617_4)), ((net.minecraft.scoreboard.ScoreObjective)(life8_51)));
    ((net.minecraft.scoreboard.Score)(life9_60)).a__Void();
    if (!((life4_11 != 0))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    lexicalValue1617_60_0 = ((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh();
    lexicalValue1617_60_1 = __sourceExactCall_73e780db0476d5(((net.minecraft.entity.Entity)(p0)));
    }
    lexicalValue1617_61_0 = ((net.minecraft.scoreboard.Scoreboard)(lexicalValue1617_60_0)).c(((java.lang.String)(lexicalValue1617_60_1)));
    }
    life6_70 = lexicalValue1617_61_0;
    spill1617_5 = life6_70;
    if (!((life4_11 == 0))) {
        lexicalValue1617_67_0 = spill1617_5;
        break lexical_join_67;
    }
    if (!((spill1617_5 != null))) {
        break lexical_join_85;
    }
    lexicalValue1617_67_0 = life6_70;
    }
    life7_81 = ((net.minecraft.util.EnumChatFormatting)(((moom.Bk)(lexicalValue1617_67_0)).a__br())).a();
    spill1617_6 = life7_81;
    if (!((life4_11 == 0))) {
        lexicalValue1617_75_0 = spill1617_6;
        break lexical_join_75;
    }
    if (!((spill1617_6 >= 0))) {
        break lexical_join_85;
    }
    lexicalValue1617_75_0 = life7_81;
    }
    if (!((lexicalValue1617_75_0 < (net.minecraft.scoreboard.IScoreObjectiveCriteria.h).length))) {
        break lexical_join_85;
    }
    return ((net.minecraft.scoreboard.Scoreboard)(((net.minecraft.entity.player.EntityPlayer)(this)).a__Bh())).a(((net.minecraft.scoreboard.IScoreObjectiveCriteria)((net.minecraft.scoreboard.IScoreObjectiveCriteria.h)[life7_81])));
    }
    return com.google.common.collect.Lists.newArrayList();
}


private void a(moom.bs p0) {
boolean spill547_0;
    long life2_3;
    int life4_11;
    forward_join_37: {
    forward_join_34: {
    forward_join_29: {
    forward_join_24: {
    forward_join_22: {
    forward_join_19: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 106494130203411L);
    this.bV = ((float)(0x0.0p0f));
    spill547_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    this.bX = ((float)(0x0.0p0f));
    life4_11 = ((spill547_0) ? 1 : 0);
    if (!((life4_11 == 0))) {
        break forward_join_22;
    }
    switch ((moom.vZ.a)[((moom.bs)(p0)).ordinal()]) {
case 1:
{
        break forward_join_19;
    }
case 2:
{
        break forward_join_24;
    }
case 3:
{
        break forward_join_29;
    }
case 4:
{
        break forward_join_34;
    }
default:
{
        break forward_join_37;
    }
}
    }
    this.bX = ((float)(-0x1.ccccccp0f));
    }
    if (!((life4_11 != 0))) {
        break forward_join_37;
    }
    }
    this.bX = ((float)(0x1.ccccccp0f));
    if (!((life4_11 != 0))) {
        break forward_join_37;
    }
    }
    this.bV = ((float)(0x1.ccccccp0f));
    if (!((life4_11 != 0))) {
        break forward_join_37;
    }
    }
    this.bV = ((float)(-0x1.ccccccp0f));
    }
    return;
}


public moom.aX a__sourceReturn_47d2aadd8a(moom.DT p0) {
int forestValue674_19_0;
    int forestValue674_28_0;
    int forestValue674_36_0;
    int forestValue674_50_0;
    int forestValue674_62_0;
    int forestValue674_76_0;
    double forestValue674_80_0;
    int forestValue674_130_0;
    int forestValue674_146_0;
    net.minecraft.entity.player.EntityPlayer forestValue674_206_0;
    net.minecraft.world.World forestValue674_251_0;
    boolean spill674_0;
    boolean spill674_1;
    double spill674_2;
    boolean spill674_3;
    net.minecraft.entity.player.EntityPlayer spill674_4;
    net.minecraft.entity.player.EntityPlayer spill674_5;
    net.minecraft.entity.player.EntityPlayer spill674_6;
    double spill674_7;
    double spill674_8;
    net.minecraft.world.World spill674_9;
    long life2_3;
    int life4_5;
    double life5_92;
    double life7_94;
    java.util.List life9_132;
    moom.bs life5_170;
    float life6_172;
    float life7_174;
    forest_join_252: {
    forest_join_251: {
    forest_join_225: {
    forest_join_206: {
    forest_join_205: {
    forest_join_203: {
    forest_join_180: {
    forest_join_178: {
    forest_join_174: {
    forest_join_170: {
    forest_join_166: {
    forest_join_146: {
    forest_join_136: {
    forest_join_130: {
    forest_join_128: {
    forest_join_80: {
    forest_join_79: {
    forest_join_77: {
    forest_join_76: {
    forest_join_62: {
    forest_join_50: {
    forest_join_41: {
    forest_join_36: {
    forest_join_33: {
    forest_join_28: {
    forest_join_24: {
    forest_join_22: {
    forest_join_19: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 16963923622025L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill674_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 == 0))) {
        forestValue674_130_0 = ((spill674_0) ? 1 : 0);
        break forest_join_130;
    }
    if (!((!spill674_0))) {
        break forest_join_128;
    }
    spill674_1 = ((net.minecraft.entity.player.EntityPlayer)(this)).K__Boolean();
    if (!((life4_5 == 0))) {
        forestValue674_19_0 = ((spill674_1) ? 1 : 0);
        break forest_join_19;
    }
    if (!((!spill674_1))) {
        break forest_join_22;
    }
    forestValue674_19_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).p__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue674_28_0 = forestValue674_19_0;
        break forest_join_28;
    }
    if (!((forestValue674_19_0 == 0))) {
        break forest_join_24;
    }
    }
    return moom.aX.OTHER_PROBLEM;
    }
    forestValue674_28_0 = ((((moom.EA)(((net.minecraft.world.World)(this.i)).v)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue674_36_0 = forestValue674_28_0;
        break forest_join_36;
    }
    if (!((forestValue674_28_0 == 0))) {
        break forest_join_33;
    }
    return moom.aX.NOT_POSSIBLE_HERE;
    }
    forestValue674_36_0 = ((((net.minecraft.world.World)(this.i)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue674_50_0 = forestValue674_36_0;
        break forest_join_50;
    }
    if (!((forestValue674_36_0 != 0))) {
        break forest_join_41;
    }
    return moom.aX.NOT_POSSIBLE_NOW;
    }
    forestValue674_50_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)((this.n - ((double) ((moom.DT)(p0)).a()))))))), ((double)(0x1.8p1d)));
    }
    if (!((life4_5 == 0))) {
        forestValue674_62_0 = forestValue674_50_0;
        break forest_join_62;
    }
    if (!((forestValue674_50_0 <= 0))) {
        break forest_join_77;
    }
    forestValue674_62_0 = recovery.source.CarrierOps.dcmpl(((double)(java.lang.Math.abs(((double)((this.o - ((double) ((moom.DT)(p0)).b()))))))), ((double)(0x1.0p1d)));
    }
    if (!((life4_5 == 0))) {
        forestValue674_76_0 = forestValue674_62_0;
        break forest_join_76;
    }
    if (!((forestValue674_62_0 <= 0))) {
        break forest_join_77;
    }
    spill674_2 = java.lang.Math.abs(((double)((this.p - ((double) ((moom.DT)(p0)).c())))));
    if (!((life4_5 == 0))) {
        forestValue674_80_0 = spill674_2;
        break forest_join_80;
    }
    forestValue674_76_0 = recovery.source.CarrierOps.dcmpl(((double)(spill674_2)), ((double)(0x1.8p1d)));
    }
    if (!((forestValue674_76_0 > 0))) {
        break forest_join_79;
    }
    }
    return moom.aX.TOO_FAR_AWAY;
    }
    forestValue674_80_0 = 0x1.0p3d;
    }
    life5_92 = forestValue674_80_0;
    life7_94 = 0x1.4p2d;
    life9_132 = ((net.minecraft.world.World)(this.i)).a(((java.lang.Class)(moom.sZ.class)), ((moom.CA)(new moom.CA((((double) ((moom.DT)(p0)).a()) - life5_92), (((double) ((moom.DT)(p0)).b()) - life7_94), (((double) ((moom.DT)(p0)).c()) - life5_92), (((double) ((moom.DT)(p0)).a()) + life5_92), (((double) ((moom.DT)(p0)).b()) + life7_94), (((double) ((moom.DT)(p0)).c()) + life5_92)))));
    spill674_3 = ((java.util.List)(life9_132)).isEmpty();
    if (!((life4_5 == 0))) {
        forestValue674_130_0 = ((spill674_3) ? 1 : 0);
        break forest_join_130;
    }
    if (!((!spill674_3))) {
        break forest_join_128;
    }
    return moom.aX.NOT_SAFE;
    }
    forestValue674_130_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).s__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue674_146_0 = forestValue674_130_0;
        break forest_join_146;
    }
    if (!((forestValue674_130_0 != 0))) {
        break forest_join_136;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).b(((net.minecraft.entity.Entity)(null)));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((float)(0x1.99999ap-3f)), ((float)(0x1.99999ap-3f)));
    spill674_4 = this;
    if (!((life4_5 == 0))) {
        forestValue674_206_0 = spill674_4;
        break forest_join_206;
    }
    forestValue674_146_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill674_4)).i)).c__Boolean(((moom.DT)(p0)))) ? 1 : 0);
    }
    if (!((forestValue674_146_0 != 0))) {
        break forest_join_205;
    }
    life5_170 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(p0))))).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockDirectional.Q)))));
    life6_172 = 0x1.0p-1f;
    life7_174 = 0x1.0p-1f;
    if (!((life4_5 == 0))) {
        break forest_join_203;
    }
    switch ((moom.vZ.a)[((moom.bs)(life5_170)).ordinal()]) {
case 1:
{
        break forest_join_166;
    }
case 2:
{
        break forest_join_170;
    }
case 3:
{
        break forest_join_174;
    }
case 4:
{
        break forest_join_178;
    }
default:
{
        break forest_join_180;
    }
}
    }
    life7_174 = 0x1.ccccccp-1f;
    if (!((life4_5 != 0))) {
        break forest_join_180;
    }
    }
    life7_174 = 0x1.99999ap-4f;
    if (!((life4_5 != 0))) {
        break forest_join_180;
    }
    }
    life6_172 = 0x1.99999ap-4f;
    if (!((life4_5 != 0))) {
        break forest_join_180;
    }
    }
    life6_172 = 0x1.ccccccp-1f;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.bs)(life5_170)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((double)(((double) (((float) ((moom.DT)(p0)).a()) + life6_172)))), ((double)(((double) (((float) ((moom.DT)(p0)).b()) + 0x1.6p-1f)))), ((double)(((double) (((float) ((moom.DT)(p0)).c()) + life7_174)))));
    }
    if (!((life4_5 != 0))) {
        break forest_join_225;
    }
    }
    forestValue674_206_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forestValue674_206_0)).a__Void(((double)(((double) (((float) ((moom.DT)(p0)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(p0)).b()) + 0x1.6p-1f)))), ((double)(((double) (((float) ((moom.DT)(p0)).c()) + 0x1.0p-1f)))));
    }
    this.bS = ((boolean)(true));
    this.bU = ((int)(0));
    this.bT = ((moom.DT)(p0));
    spill674_5 = this;
    spill674_6 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp674_71_0 = this;
    double __stackOp674_71_1 = 0x0.0p0d;
    spill674_7 = __stackOp674_71_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp674_71_0)).u = ((double)(__stackOp674_71_1));
    net.minecraft.entity.player.EntityPlayer __stackOp674_73_0 = spill674_6;
    double __stackOp674_73_1 = spill674_7;
    spill674_8 = __stackOp674_73_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp674_73_0)).v = ((double)(__stackOp674_73_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill674_5)).t = ((double)(spill674_8));
    spill674_9 = this.i;
    if (!((life4_5 == 0))) {
        forestValue674_251_0 = spill674_9;
        break forest_join_251;
    }
    if (!((!((net.minecraft.world.World)(spill674_9)).G))) {
        break forest_join_252;
    }
    forestValue674_251_0 = this.i;
    }
    ((net.minecraft.world.World)(forestValue674_251_0)).k();
    }
    return moom.aX.OK;
}


public void a(boolean p0, boolean p1, boolean p2) {
moom.DT forwardValue5407_50_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5407_75_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5407_86_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5407_91_0;
    int forwardValue5407_91_1;
    net.minecraft.entity.player.EntityPlayer forwardValue5407_92_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5407_97_0;
    int forwardValue5407_97_1;
    boolean spill5407_0;
    net.minecraft.entity.player.EntityPlayer spill5407_1;
    moom.DT spill5407_2;
    boolean spill5407_3;
    long life4_3;
    int life6_9;
    net.minecraft.block.state.IBlockState life7_15;
    moom.DT life8_48;
    forward_join_105: {
    forward_join_97: {
    forward_join_92: {
    forward_join_91: {
    forward_join_86: {
    forward_join_85: {
    forward_join_75: {
    forward_join_71: {
    forward_join_51: {
    forward_join_50: {
    life4_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 92761672583244L);
    spill5407_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    ((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.ccccccp0f)));
    life6_9 = ((spill5407_0) ? 1 : 0);
    life7_15 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(this.bT)));
    spill5407_1 = this;
    if (!((life6_9 == 0))) {
        forwardValue5407_75_0 = spill5407_1;
        break forward_join_75;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5407_1)).bT != null))) {
        break forward_join_71;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life7_15)).a__ch() == net.minecraft.init.Blocks.C))) {
        break forward_join_71;
    }
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(this.bT)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life7_15)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))), ((int)(4)));
    life8_48 = __sourceExactCall_cff869ea9f2b7f(((net.minecraft.world.World)(this.i)), ((moom.DT)(this.bT)), ((int)(0)));
    spill5407_2 = life8_48;
    if (!((life6_9 == 0))) {
        forwardValue5407_50_0 = spill5407_2;
        break forward_join_50;
    }
    if (!((spill5407_2 == null))) {
        break forward_join_51;
    }
    forwardValue5407_50_0 = ((moom.DT)(this.bT)).a__DT();
    }
    life8_48 = forwardValue5407_50_0;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((double)(((double) (((float) ((moom.DT)(life8_48)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(life8_48)).b()) + 0x1.99999ap-4f)))), ((double)(((double) (((float) ((moom.DT)(life8_48)).c()) + 0x1.0p-1f)))));
    }
    this.bS = ((boolean)(false));
    forwardValue5407_75_0 = this;
    }
    if (!((life6_9 == 0))) {
        forwardValue5407_86_0 = forwardValue5407_75_0;
        break forward_join_86;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5407_75_0)).i)).G))) {
        break forward_join_85;
    }
    if (!(p1)) {
        break forward_join_85;
    }
    ((net.minecraft.world.World)(this.i)).k();
    }
    forwardValue5407_86_0 = this;
    }
    spill5407_3 = p0;
    if (!((life6_9 == 0))) {
        forwardValue5407_91_0 = forwardValue5407_86_0;
        forwardValue5407_91_1 = ((spill5407_3) ? 1 : 0);
        break forward_join_91;
    }
    if (!(spill5407_3)) {
        forwardValue5407_92_0 = forwardValue5407_86_0;
        break forward_join_92;
    }
    forwardValue5407_91_0 = forwardValue5407_86_0;
    forwardValue5407_91_1 = 0;
    }
    forwardValue5407_97_0 = forwardValue5407_91_0;
    forwardValue5407_97_1 = forwardValue5407_91_1;
    break forward_join_97;
    }
    forwardValue5407_97_0 = forwardValue5407_92_0;
    forwardValue5407_97_1 = __sourceIntrinsic_c2ba139c0e88_invokedynamic5407_31(30953, (492440363076634300L ^ life4_3));
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5407_97_0)).bU = ((int)(forwardValue5407_97_1));
    if (!(p2)) {
        break forward_join_105;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.DT)(this.bT)), ((boolean)(false)));
    }
    return;
}


public void a(moom.DT p0, boolean p1) {
long life3_3;
    int life5_5;
    forward_join_24: {
    forward_join_21: {
    forward_join_18: {
    life3_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 51402826382996L);
    life5_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    if (!((life5_5 == 0))) { break forward_join_21; }
    if (!((p0 != null))) { break forward_join_18; }
    this.bY = ((moom.DT)(p0));
    this.bZ = ((boolean)(p1));
    if (!((life5_5 != 0))) { break forward_join_24; }
    }
    this.bY = ((moom.DT)(null));
    }
    this.bZ = ((boolean)(false));
    }
    return;
}


public void m(int p0) {
net.minecraft.entity.player.EntityPlayer forwardValue5434_27_0;
    boolean spill5434_0;
    net.minecraft.entity.player.EntityPlayer spill5434_1;
    long life2_3;
    int life4_11;
    forward_join_27: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 8537053220758L);
    spill5434_0 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    net.minecraft.entity.player.EntityPlayer __stackOp5434_2_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5434_2_0)).b2 = ((int)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5434_2_0)).b2 - p0)));
    life4_11 = ((spill5434_0) ? 1 : 0);
    spill5434_1 = this;
    if (!((life4_11 == 0))) {
        forwardValue5434_27_0 = spill5434_1;
        break forward_join_27;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5434_1)).b2 < 0))) {
        break forward_join_26;
    }
    this.b2 = ((int)(0));
    this.b4 = ((float)(0x0.0p0f));
    this.b3 = ((int)(0));
    }
    forwardValue5434_27_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5434_27_0)).b5 = ((int)(((java.util.Random)(this.ah)).nextInt()));
    return;
}


public int m__sourceReturn_8abf5c6871() {
int forwardValue5433_17_0;
    int forwardValue5433_19_0;
    boolean spill5433_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 44204946731233L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5433_0 = ((net.minecraft.entity.player.EntityPlayer)(this)).M();
    if (!((life3_5 != 0))) {
        forwardValue5433_17_0 = ((spill5433_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill5433_0)) {
        break forward_join_18;
    }
    forwardValue5433_17_0 = (((net.minecraft.item.ItemStack)(this.b6)).e() - this.b7);
    }
    forwardValue5433_19_0 = forwardValue5433_17_0;
    break forward_join_19;
    }
    forwardValue5433_19_0 = 0;
    }
    return forwardValue5433_19_0;
}


public static void o(int p0) {
cd = ((int)(p0));
    return;
}


public int o__sourceReturn_8abf5c6871() {
return this.bU;
}


public int p__sourceReturn_8abf5c6871() {
return this.b5;
}


public float k() {
boolean spill1620_0;
    long life1_3;
    int life4_5;
    net.minecraft.item.ItemStack[] life5_9;
    int life6_13;
    int life3_14;
    int life7_16;
    net.minecraft.item.ItemStack life8_23;
    lexical_join_32: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 103289383805148L);
    life4_5 = 0;
    life5_9 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).b;
    spill1620_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    life6_13 = (life5_9).length;
    life3_14 = ((spill1620_0) ? 1 : 0);
    life7_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life7_16 < life6_13))) {
        break lexical_join_32;
    }
    life8_23 = (life5_9)[life7_16];
    if (!((life3_14 != 0))) {
        break lexical_join_30;
    }
    if (!((life8_23 != null))) {
        break lexical_join_29;
    }
    life4_5 += 1;
    }
    life7_16 += 1;
    }
    if (!((life3_14 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return (((float) life4_5) / ((float) (((net.minecraft.entity.player.InventoryPlayer)(this.bD)).b).length));
}


public void k(int p0) {
long local2 = (net.minecraft.entity.player.EntityPlayer.gb ^ 126003753879151L);
    int local4 = ((net.minecraft.entity.player.EntityPlayer)(this)).n();
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_86b23f1beed7_originalDynamicSite2004_3(25515, (8594889254633722838L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)((local4 + p0)))))));
    return;
}


public void k(net.minecraft.entity.Entity p0) {
return;
}


public void g__Void() {
net.minecraft.entity.player.EntityPlayer forwardValue5427_19_0;
    int forwardValue5427_59_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5427_78_0;
    int forwardValue5427_79_0;
    int forwardValue5427_90_0;
    int forwardValue5427_119_0;
    int forwardValue5427_137_0;
    int forwardValue5427_149_0;
    int forwardValue5427_176_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5427_198_0;
    int forwardValue5427_201_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5427_223_0;
    int forwardValue5427_258_0;
    int forwardValue5427_271_0;
    int forwardValue5427_285_0;
    int forwardValue5427_299_0;
    int forwardValue5427_313_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5427_354_0;
    int forwardValue5427_379_0;
    int forwardValue5427_403_0;
    boolean spill5427_0;
    net.minecraft.entity.player.EntityPlayer spill5427_1;
    int spill5427_2;
    int spill5427_3;
    int spill5427_4;
    boolean spill5427_5;
    int spill5427_6;
    boolean spill5427_7;
    int spill5427_8;
    net.minecraft.entity.player.EntityPlayer spill5427_9;
    boolean spill5427_10;
    net.minecraft.entity.player.EntityPlayer spill5427_11;
    int spill5427_12;
    net.minecraft.entity.player.EntityPlayer spill5427_13;
    double spill5427_14;
    net.minecraft.entity.player.EntityPlayer spill5427_15;
    double spill5427_16;
    net.minecraft.entity.player.EntityPlayer spill5427_17;
    double spill5427_18;
    net.minecraft.entity.player.EntityPlayer spill5427_19;
    double spill5427_20;
    net.minecraft.entity.player.EntityPlayer spill5427_21;
    double spill5427_22;
    net.minecraft.entity.player.EntityPlayer spill5427_23;
    double spill5427_24;
    net.minecraft.entity.player.EntityPlayer spill5427_25;
    boolean spill5427_26;
    boolean spill5427_27;
    int spill5427_28;
    long life1_3;
    int life3_9;
    net.minecraft.item.ItemStack life4_35;
    double life4_350;
    double life6_356;
    double life8_362;
    double life10_364;
    int life12_553;
    double life13_559;
    double life15_565;
    forward_join_410: {
    forward_join_404: {
    forward_join_403: {
    forward_join_379: {
    forward_join_374: {
    forward_join_354: {
    forward_join_353: {
    forward_join_321: {
    forward_join_313: {
    forward_join_309: {
    forward_join_299: {
    forward_join_295: {
    forward_join_285: {
    forward_join_281: {
    forward_join_271: {
    forward_join_268: {
    forward_join_258: {
    forward_join_255: {
    forward_join_223: {
    forward_join_210: {
    forward_join_201: {
    forward_join_198: {
    forward_join_197: {
    forward_join_176: {
    forward_join_171: {
    forward_join_149: {
    forward_join_147: {
    forward_join_137: {
    forward_join_134: {
    forward_join_119: {
    forward_join_116: {
    forward_join_90: {
    forward_join_88: {
    forward_join_79: {
    forward_join_78: {
    forward_join_77: {
    forward_join_75: {
    forward_join_59: {
    forward_join_52: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 75075217118579L);
    spill5427_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    this.Q = ((boolean)(((net.minecraft.entity.player.EntityPlayer)(this)).U__Boolean()));
    life3_9 = ((spill5427_0) ? 1 : 0);
    spill5427_1 = this;
    if (!((life3_9 != 0))) {
        forwardValue5427_19_0 = spill5427_1;
        break forward_join_19;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill5427_1)).U__Boolean())) {
        break forward_join_18;
    }
    this.A = ((boolean)(false));
    }
    forwardValue5427_19_0 = this;
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_78_0 = forwardValue5427_19_0;
        break forward_join_78;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(forwardValue5427_19_0)).b6 != null))) {
        break forward_join_77;
    }
    life4_35 = ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__xW();
    if (!((life4_35 == this.b6))) {
        break forward_join_75;
    }
    spill5427_2 = this.b7;
    if (!((life3_9 != 0))) {
        forwardValue5427_59_0 = spill5427_2;
        break forward_join_59;
    }
    if (!((spill5427_2 <= __sourceIntrinsic_736a66cda11e_invokedynamic5427_12(11082, (8423125892175251492L ^ life1_3))))) {
        break forward_join_52;
    }
    spill5427_3 = (this.b7 % 4);
    if (!((life3_9 != 0))) {
        forwardValue5427_59_0 = spill5427_3;
        break forward_join_59;
    }
    if (!((spill5427_3 == 0))) {
        break forward_join_52;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.item.ItemStack)(life4_35)), ((int)(5)));
    }
    net.minecraft.entity.player.EntityPlayer __stackOp5427_15_0 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5427_17_0 = __stackOp5427_15_0;
    int __stackOp5427_17_1 = (((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_15_0)).b7 - 1);
    spill5427_4 = __stackOp5427_17_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_17_0)).b7 = ((int)(__stackOp5427_17_1));
    forwardValue5427_59_0 = spill5427_4;
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_79_0 = forwardValue5427_59_0;
        break forward_join_79;
    }
    if (!((forwardValue5427_59_0 == 0))) {
        break forward_join_77;
    }
    spill5427_5 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_9 != 0))) {
        forwardValue5427_79_0 = ((spill5427_5) ? 1 : 0);
        break forward_join_79;
    }
    if (!((!spill5427_5))) {
        break forward_join_77;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).P();
    if (!((life3_9 == 0))) {
        break forward_join_77;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).O();
    }
    forwardValue5427_78_0 = this;
    }
    forwardValue5427_79_0 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue5427_78_0)).bL;
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_90_0 = forwardValue5427_79_0;
        break forward_join_90;
    }
    if (!((forwardValue5427_79_0 > 0))) {
        break forward_join_88;
    }
    net.minecraft.entity.player.EntityPlayer __stackOp5427_26_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_26_0)).bL = ((int)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_26_0)).bL - 1)));
    }
    forwardValue5427_90_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).K__Boolean()) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_149_0 = forwardValue5427_90_0;
        break forward_join_149;
    }
    if (!((forwardValue5427_90_0 != 0))) {
        break forward_join_147;
    }
    net.minecraft.entity.player.EntityPlayer __stackOp5427_31_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_31_0)).bU = ((int)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_31_0)).bU + 1)));
    spill5427_6 = this.bU;
    if (!((life3_9 != 0))) {
        forwardValue5427_119_0 = spill5427_6;
        break forward_join_119;
    }
    if (!((spill5427_6 > __sourceIntrinsic_736a66cda11e_invokedynamic5427_35(30953, (492422865594981251L ^ life1_3))))) {
        break forward_join_116;
    }
    this.bU = ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic5427_36(30953, (492422865594981251L ^ life1_3))));
    }
    forwardValue5427_119_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_176_0 = forwardValue5427_119_0;
        break forward_join_176;
    }
    if (!((forwardValue5427_119_0 == 0))) {
        break forward_join_171;
    }
    spill5427_7 = ((net.minecraft.entity.player.EntityPlayer)(this)).P__Boolean();
    if (!((life3_9 != 0))) {
        forwardValue5427_137_0 = ((spill5427_7) ? 1 : 0);
        break forward_join_137;
    }
    if (!((!spill5427_7))) {
        break forward_join_134;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((boolean)(true)), ((boolean)(true)), ((boolean)(false)));
    if (!((life3_9 == 0))) {
        break forward_join_171;
    }
    }
    forwardValue5427_137_0 = ((((net.minecraft.world.World)(this.i)).e__Boolean()) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_176_0 = forwardValue5427_137_0;
        break forward_join_176;
    }
    if (!((forwardValue5427_137_0 != 0))) {
        break forward_join_171;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((boolean)(false)), ((boolean)(true)), ((boolean)(true)));
    if (!((life3_9 == 0))) {
        break forward_join_171;
    }
    }
    forwardValue5427_149_0 = this.bU;
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_176_0 = forwardValue5427_149_0;
        break forward_join_176;
    }
    if (!((forwardValue5427_149_0 > 0))) {
        break forward_join_171;
    }
    net.minecraft.entity.player.EntityPlayer __stackOp5427_49_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_49_0)).bU = ((int)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_49_0)).bU + 1)));
    spill5427_8 = this.bU;
    if (!((life3_9 != 0))) {
        forwardValue5427_176_0 = spill5427_8;
        break forward_join_176;
    }
    if (!((spill5427_8 >= __sourceIntrinsic_736a66cda11e_invokedynamic5427_53(22707, (8518671819979242440L ^ life1_3))))) {
        break forward_join_171;
    }
    this.bU = ((int)(0));
    }
    super.g__Void();
    forwardValue5427_176_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_201_0 = forwardValue5427_176_0;
        break forward_join_201;
    }
    if (!((forwardValue5427_176_0 == 0))) {
        break forward_join_197;
    }
    spill5427_9 = this;
    if (!((life3_9 != 0))) {
        forwardValue5427_198_0 = spill5427_9;
        break forward_join_198;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5427_9)).bG != null))) {
        break forward_join_197;
    }
    spill5427_10 = ((moom.v8)(this.bG)).b(((net.minecraft.entity.player.EntityPlayer)(this)));
    if (!((life3_9 != 0))) {
        forwardValue5427_201_0 = ((spill5427_10) ? 1 : 0);
        break forward_join_201;
    }
    if (!((!spill5427_10))) {
        break forward_join_197;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).Q();
    this.bG = ((moom.v8)(this.bF));
    }
    forwardValue5427_198_0 = this;
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_223_0 = forwardValue5427_198_0;
        break forward_join_223;
    }
    forwardValue5427_201_0 = ((((net.minecraft.entity.player.EntityPlayer)(forwardValue5427_198_0)).r__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5427_201_0 != 0))) {
        break forward_join_210;
    }
    spill5427_11 = this;
    if (!((life3_9 != 0))) {
        forwardValue5427_223_0 = spill5427_11;
        break forward_join_223;
    }
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill5427_11)).b1)).a)) {
        break forward_join_210;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).j();
    }
    this.bM = ((double)(this.bP));
    this.bN = ((double)(this.bQ));
    this.bO = ((double)(this.bR));
    forwardValue5427_223_0 = this;
    }
    life4_350 = (((net.minecraft.entity.player.EntityPlayer)(forwardValue5427_223_0)).n - this.bP);
    life6_356 = (this.o - this.bQ);
    life8_362 = (this.p - this.bR);
    life10_364 = 0x1.4p3d;
    spill5427_12 = recovery.source.CarrierOps.dcmpl(((double)(life4_350)), ((double)(life10_364)));
    if (!((life3_9 != 0))) {
        forwardValue5427_258_0 = spill5427_12;
        break forward_join_258;
    }
    if (!((spill5427_12 > 0))) {
        break forward_join_255;
    }
    spill5427_13 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5427_85_0 = this;
    double __stackOp5427_85_1 = this.n;
    spill5427_14 = __stackOp5427_85_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_85_0)).bP = ((double)(__stackOp5427_85_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill5427_13)).bM = ((double)(spill5427_14));
    }
    forwardValue5427_258_0 = recovery.source.CarrierOps.dcmpl(((double)(life8_362)), ((double)(life10_364)));
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_271_0 = forwardValue5427_258_0;
        break forward_join_271;
    }
    if (!((forwardValue5427_258_0 > 0))) {
        break forward_join_268;
    }
    spill5427_15 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5427_90_0 = this;
    double __stackOp5427_90_1 = this.p;
    spill5427_16 = __stackOp5427_90_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_90_0)).bR = ((double)(__stackOp5427_90_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill5427_15)).bO = ((double)(spill5427_16));
    }
    forwardValue5427_271_0 = recovery.source.CarrierOps.dcmpl(((double)(life6_356)), ((double)(life10_364)));
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_285_0 = forwardValue5427_271_0;
        break forward_join_285;
    }
    if (!((forwardValue5427_271_0 > 0))) {
        break forward_join_281;
    }
    spill5427_17 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5427_95_0 = this;
    double __stackOp5427_95_1 = this.o;
    spill5427_18 = __stackOp5427_95_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_95_0)).bQ = ((double)(__stackOp5427_95_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill5427_17)).bN = ((double)(spill5427_18));
    }
    forwardValue5427_285_0 = recovery.source.CarrierOps.dcmpg(((double)(life4_350)), ((double)((-life10_364))));
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_299_0 = forwardValue5427_285_0;
        break forward_join_299;
    }
    if (!((forwardValue5427_285_0 < 0))) {
        break forward_join_295;
    }
    spill5427_19 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5427_100_0 = this;
    double __stackOp5427_100_1 = this.n;
    spill5427_20 = __stackOp5427_100_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_100_0)).bP = ((double)(__stackOp5427_100_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill5427_19)).bM = ((double)(spill5427_20));
    }
    forwardValue5427_299_0 = recovery.source.CarrierOps.dcmpg(((double)(life8_362)), ((double)((-life10_364))));
    }
    if (!((life3_9 != 0))) {
        forwardValue5427_313_0 = forwardValue5427_299_0;
        break forward_join_313;
    }
    if (!((forwardValue5427_299_0 < 0))) {
        break forward_join_309;
    }
    spill5427_21 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5427_105_0 = this;
    double __stackOp5427_105_1 = this.p;
    spill5427_22 = __stackOp5427_105_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_105_0)).bR = ((double)(__stackOp5427_105_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill5427_21)).bO = ((double)(spill5427_22));
    }
    forwardValue5427_313_0 = recovery.source.CarrierOps.dcmpg(((double)(life6_356)), ((double)((-life10_364))));
    }
    if (!((forwardValue5427_313_0 < 0))) {
        break forward_join_321;
    }
    spill5427_23 = this;
    net.minecraft.entity.player.EntityPlayer __stackOp5427_110_0 = this;
    double __stackOp5427_110_1 = this.o;
    spill5427_24 = __stackOp5427_110_1;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_110_0)).bQ = ((double)(__stackOp5427_110_1));
    ((net.minecraft.entity.player.EntityPlayer)(spill5427_23)).bN = ((double)(spill5427_24));
    }
    net.minecraft.entity.player.EntityPlayer __stackOp5427_113_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_113_0)).bP = ((double)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_113_0)).bP + (life4_350 * 0x1.0p-2d))));
    net.minecraft.entity.player.EntityPlayer __stackOp5427_116_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_116_0)).bR = ((double)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_116_0)).bR + (life8_362 * 0x1.0p-2d))));
    net.minecraft.entity.player.EntityPlayer __stackOp5427_119_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_119_0)).bQ = ((double)((((net.minecraft.entity.player.EntityPlayer)(__stackOp5427_119_0)).bQ + (life6_356 * 0x1.0p-2d))));
    spill5427_25 = this;
    if (!((life3_9 != 0))) {
        forwardValue5427_354_0 = spill5427_25;
        break forward_join_354;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5427_25)).g == null))) {
        break forward_join_353;
    }
    this.b0 = ((moom.DT)(null));
    }
    forwardValue5427_354_0 = this;
    }
    spill5427_26 = ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5427_354_0)).i)).G;
    if (!((life3_9 != 0))) {
        forwardValue5427_379_0 = ((spill5427_26) ? 1 : 0);
        break forward_join_379;
    }
    if (!((!spill5427_26))) {
        break forward_join_374;
    }
    ((net.minecraft.util.FoodStats)(this.bH)).a(((net.minecraft.entity.player.EntityPlayer)(this)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.g)));
    spill5427_27 = ((net.minecraft.entity.player.EntityPlayer)(this)).p__Boolean();
    if (!((life3_9 != 0))) {
        forwardValue5427_379_0 = ((spill5427_27) ? 1 : 0);
        break forward_join_379;
    }
    if (!(spill5427_27)) {
        break forward_join_374;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.h)));
    }
    forwardValue5427_379_0 = __sourceIntrinsic_736a66cda11e_invokedynamic5427_135(31756, (5539449306237148992L ^ life1_3));
    }
    life12_553 = forwardValue5427_379_0;
    life13_559 = moom.Dr.a(((double)(this.n)), ((double)(-0x1.c9c37fp24d)), ((double)(0x1.c9c37fp24d)));
    life15_565 = moom.Dr.a(((double)(this.p)), ((double)(-0x1.c9c37fp24d)), ((double)(0x1.c9c37fp24d)));
    spill5427_28 = recovery.source.CarrierOps.dcmpl(((double)(life13_559)), ((double)(this.n)));
    if (!((life3_9 != 0))) {
        forwardValue5427_403_0 = spill5427_28;
        break forward_join_403;
    }
    if (!((spill5427_28 == 0))) {
        break forward_join_404;
    }
    forwardValue5427_403_0 = recovery.source.CarrierOps.dcmpl(((double)(life15_565)), ((double)(this.p)));
    }
    if (!((forwardValue5427_403_0 != 0))) {
        break forward_join_410;
    }
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a__Void(((double)(life13_559)), ((double)(this.o)), ((double)(life15_565)));
    }
    return;
}


private void g(double p0, double p1, double p2) {
int forwardValue5425_32_0;
    moom.DT forwardValue5425_56_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5425_73_0;
    int forwardValue5425_80_0;
    int forwardValue5425_92_0;
    int forwardValue5425_106_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5425_108_0;
    int spill5425_0;
    moom.DT spill5425_1;
    net.minecraft.entity.player.EntityPlayer spill5425_2;
    net.minecraft.entity.player.EntityPlayer spill5425_3;
    long life7_3;
    int life9_5;
    int life10_24;
    forward_join_111: {
    forward_join_108: {
    forward_join_106: {
    forward_join_101: {
    forward_join_92: {
    forward_join_89: {
    forward_join_80: {
    forward_join_77: {
    forward_join_73: {
    forward_join_56: {
    forward_join_52: {
    forward_join_32: {
    life7_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 119245088927140L);
    life9_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    if (!((this.g != null))) {
        break forward_join_111;
    }
    life10_24 = java.lang.Math.round(((float)((moom.Dr.a__Float(((double)((((p0 * p0) + (p1 * p1)) + (p2 * p2))))) * 0x1.9p6f))));
    spill5425_0 = life10_24;
    if (!((life9_5 != 0))) {
        forwardValue5425_32_0 = spill5425_0;
        break forward_join_32;
    }
    if (!((spill5425_0 > 0))) {
        break forward_join_111;
    }
    forwardValue5425_32_0 = ((this.g instanceof net.minecraft.entity.item.EntityMinecart) ? 1 : 0);
    }
    if (!((life9_5 != 0))) {
        forwardValue5425_80_0 = forwardValue5425_32_0;
        break forward_join_80;
    }
    if (!((forwardValue5425_32_0 != 0))) {
        break forward_join_77;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.q)), ((int)(life10_24)));
    spill5425_1 = this.b0;
    if (!((life9_5 != 0))) {
        forwardValue5425_56_0 = spill5425_1;
        break forward_join_56;
    }
    if (!((spill5425_1 == null))) {
        break forward_join_52;
    }
    this.b0 = ((moom.DT)(new moom.DT(this)));
    if (!((life9_5 == 0))) {
        break forward_join_111;
    }
    }
    spill5425_2 = this;
    if (!((life9_5 != 0))) {
        forwardValue5425_73_0 = spill5425_2;
        break forward_join_73;
    }
    forwardValue5425_56_0 = ((net.minecraft.entity.player.EntityPlayer)(spill5425_2)).b0;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DT)(forwardValue5425_56_0)).a(((double)(((double) moom.Dr.b__Int(((double)(this.n)))))), ((double)(((double) moom.Dr.b__Int(((double)(this.o)))))), ((double)(((double) moom.Dr.b__Int(((double)(this.p))))))))), ((double)(0x1.e848p19d))) >= 0))) {
        break forward_join_111;
    }
    forwardValue5425_73_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5425_73_0)).a(((moom.BY)(net.minecraft.stats.AchievementList.q)));
    if (!((life9_5 == 0))) {
        break forward_join_111;
    }
    }
    forwardValue5425_80_0 = ((this.g instanceof moom.tv) ? 1 : 0);
    }
    if (!((life9_5 != 0))) {
        forwardValue5425_92_0 = forwardValue5425_80_0;
        break forward_join_92;
    }
    if (!((forwardValue5425_80_0 != 0))) {
        break forward_join_89;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.r)), ((int)(life10_24)));
    if (!((life9_5 == 0))) {
        break forward_join_111;
    }
    }
    forwardValue5425_92_0 = ((this.g instanceof net.minecraft.entity.passive.EntityPig) ? 1 : 0);
    }
    if (!((life9_5 != 0))) {
        forwardValue5425_106_0 = forwardValue5425_92_0;
        break forward_join_106;
    }
    if (!((forwardValue5425_92_0 != 0))) {
        break forward_join_101;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.s)), ((int)(life10_24)));
    if (!((life9_5 == 0))) {
        break forward_join_111;
    }
    }
    spill5425_3 = this;
    if (!((life9_5 != 0))) {
        forwardValue5425_108_0 = spill5425_3;
        break forward_join_108;
    }
    forwardValue5425_106_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill5425_3)).g instanceof net.minecraft.entity.passive.EntityHorse) ? 1 : 0);
    }
    if (!((forwardValue5425_106_0 != 0))) {
        break forward_join_111;
    }
    forwardValue5425_108_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5425_108_0)).a(((moom.BY)(net.minecraft.stats.StatList.t)), ((int)(life10_24)));
    }
    return;
}


public int g__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.player.EntityPlayer.gb ^ 28007080155199L);
    return __sourceIntrinsic_80d806743da5_originalDynamicSite2005_1(30377, (5028339247225444482L ^ local1));
}


protected boolean g__Boolean() {
int forwardValue5426_13_0;
    int forwardValue5426_15_0;
    boolean spill5426_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 85782883805005L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5426_0 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b;
    if (!((life3_5 != 0))) {
        forwardValue5426_13_0 = ((spill5426_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5426_0))) {
        break forward_join_14;
    }
    forwardValue5426_13_0 = 1;
    }
    forwardValue5426_15_0 = forwardValue5426_13_0;
    break forward_join_15;
    }
    forwardValue5426_15_0 = 0;
    }
    return ((forwardValue5426_15_0) != 0);
}


public void g(float p0) {
long local2 = (net.minecraft.entity.player.EntityPlayer.gb ^ 32900024877797L);
    boolean local4 = net.minecraft.entity.player.InventoryPlayer.c__Boolean();
    if ((!local4)) {
        if ((p0 < 0x0.0p0f)) {
        p0 = 0x0.0p0f;
    }
        ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.player.EntityPlayer)(this)).a__r1())).b(((int)(__sourceIntrinsic_5fb4e31097d0_invokedynamic11775_3(11750, (2899542348568746261L ^ local2)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(p0))))));
    }
    return;
}


public void v() {
net.minecraft.entity.player.EntityPlayer forwardValue5440_13_0;
    net.minecraft.entity.player.EntityPlayer spill5440_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 121205944567579L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5440_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5440_13_0 = spill5440_0;
        break forward_join_13;
    }
    if (!((!((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill5440_0)).b1)).b))) {
        break forward_join_14;
    }
    forwardValue5440_13_0 = this;
    }
    __sourceIntrinsic_f4799d64ae03_call5440_5(forwardValue5440_13_0);
    }
    return;
}


public void j(int p0) {
long local2 = (net.minecraft.entity.player.EntityPlayer.gb ^ 112361217061393L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_29d5bbbacb40_originalDynamicSite2006_2(25515, (8594902829256386472L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


public float j__sourceReturn_bc607678b6() {
long local1 = (net.minecraft.entity.player.EntityPlayer.gb ^ 55660146576837L);
    return ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.player.EntityPlayer)(this)).a__r1())).a__Float(((int)(__sourceIntrinsic_4439aefd30a6_originalDynamicSite2007_2(11750, (2899492512973215285L ^ local1)))));
}


public void j(net.minecraft.entity.Entity p0) {
int forestValue27_14_0;
    int forestValue27_58_0;
    int forestValue27_71_0;
    int forestValue27_76_0;
    int forestValue27_81_0;
    int forestValue27_86_0;
    int forestValue27_94_0;
    net.minecraft.entity.Entity forestValue27_97_0;
    net.minecraft.entity.Entity forestValue27_101_0;
    int forestValue27_106_0;
    int forestValue27_108_0;
    int forestValue27_128_0;
    int forestValue27_145_0;
    net.minecraft.entity.Entity forestValue27_152_0;
    int forestValue27_235_0;
    int forestValue27_264_0;
    int forestValue27_273_0;
    int forestValue27_282_0;
    int forestValue27_295_0;
    net.minecraft.entity.Entity forestValue27_314_0;
    moom.t5 forestValue27_323_0;
    int forestValue27_346_0;
    int forestValue27_359_0;
    int forestValue27_371_0;
    boolean spill27_0;
    boolean spill27_1;
    int spill27_2;
    net.minecraft.entity.player.EntityPlayer spill27_3;
    int spill27_4;
    int spill27_5;
    int spill27_6;
    net.minecraft.entity.Entity spill27_7;
    int spill27_8;
    net.minecraft.entity.Entity spill27_9;
    int spill27_10;
    int spill27_11;
    boolean spill27_12;
    boolean spill27_13;
    net.minecraft.entity.Entity spill27_14;
    moom.t5 spill27_15;
    int spill27_16;
    int spill27_17;
    long life2_3;
    int life4_5;
    float life5_25;
    int life6_27;
    float life7_29;
    int life6_59;
    int life8_161;
    int life9_190;
    int life10_193;
    double life11_228;
    double life13_231;
    double life15_234;
    int life17_240;
    com.moon.event.ActionEvent life18_252;
    net.minecraft.item.ItemStack life19_420;
    net.minecraft.entity.Entity life20_422;
    moom.t5 life21_435;
    forest_join_374: {
    forest_join_371: {
    forest_join_370: {
    forest_join_368: {
    forest_join_365: {
    forest_join_359: {
    forest_join_346: {
    forest_join_344: {
    forest_join_325: {
    forest_join_323: {
    forest_join_314: {
    forest_join_303: {
    forest_join_300: {
    forest_join_295: {
    forest_join_288: {
    forest_join_282: {
    forest_join_279: {
    forest_join_273: {
    forest_join_270: {
    forest_join_264: {
    forest_join_263: {
    forest_join_235: {
    forest_join_233: {
    forest_join_152: {
    forest_join_151: {
    forest_join_145: {
    forest_join_128: {
    forest_join_123: {
    forest_join_108: {
    forest_join_107: {
    forest_join_106: {
    forest_join_101: {
    forest_join_97: {
    forest_join_94: {
    forest_join_86: {
    forest_join_81: {
    forest_join_76: {
    forest_join_71: {
    forest_join_67: {
    forest_join_58: {
    forest_join_55: {
    forest_join_44: {
    forest_join_39: {
    forest_join_37: {
    forest_join_14: {
    life2_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 136821918238207L);
    life4_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill27_0 = ((net.minecraft.entity.Entity)(p0)).x__Boolean();
    if (!((life4_5 != 0))) {
        forestValue27_14_0 = ((spill27_0) ? 1 : 0);
        break forest_join_14;
    }
    if (!(spill27_0)) {
        break forest_join_374;
    }
    forestValue27_14_0 = ((((net.minecraft.entity.Entity)(p0)).b__Boolean(((net.minecraft.entity.Entity)(this)))) ? 1 : 0);
    }
    if (!((forestValue27_14_0 == 0))) {
        break forest_join_374;
    }
    life5_25 = ((float) ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).b());
    life6_27 = 0;
    life7_29 = 0x0.0p0f;
    if (!((life4_5 != 0))) {
        break forest_join_37;
    }
    if (!((((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forest_join_39;
    }
    life7_29 = moom.rV.a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.EntityPlayer)(this)).a__xW())), ((net.minecraft.entity.EnumCreatureAttribute)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))).a__aR())));
    }
    if (!((life4_5 == 0))) {
        break forest_join_44;
    }
    }
    life7_29 = moom.rV.a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.EntityPlayer)(this)).a__xW())), ((net.minecraft.entity.EnumCreatureAttribute)(net.minecraft.entity.EnumCreatureAttribute.UNDEFINED)));
    }
    life6_59 = (life6_27 + moom.rV.a(((net.minecraft.entity.EntityLivingBase)(this))));
    spill27_1 = ((net.minecraft.entity.player.EntityPlayer)(this)).u__Boolean();
    if (!((life4_5 != 0))) {
        forestValue27_58_0 = ((spill27_1) ? 1 : 0);
        break forest_join_58;
    }
    if (!(spill27_1)) {
        break forest_join_55;
    }
    life6_59 += 1;
    }
    forestValue27_58_0 = recovery.source.CarrierOps.fcmpl(((float)(life5_25)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != 0))) {
        forestValue27_71_0 = forestValue27_58_0;
        break forest_join_71;
    }
    if (!((forestValue27_58_0 <= 0))) {
        break forest_join_67;
    }
    spill27_2 = recovery.source.CarrierOps.fcmpl(((float)(life7_29)), ((float)(0x0.0p0f)));
    if (!((life4_5 != 0))) {
        forestValue27_71_0 = spill27_2;
        break forest_join_71;
    }
    if (!((spill27_2 > 0))) {
        break forest_join_374;
    }
    }
    forestValue27_71_0 = recovery.source.CarrierOps.fcmpl(((float)(this.L)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != 0))) {
        forestValue27_76_0 = forestValue27_71_0;
        break forest_join_76;
    }
    if (!((forestValue27_71_0 > 0))) {
        break forest_join_107;
    }
    forestValue27_76_0 = ((this.A) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue27_81_0 = forestValue27_76_0;
        break forest_join_81;
    }
    if (!((forestValue27_76_0 == 0))) {
        break forest_join_107;
    }
    forestValue27_81_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).I__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue27_86_0 = forestValue27_81_0;
        break forest_join_86;
    }
    if (!((forestValue27_81_0 == 0))) {
        break forest_join_107;
    }
    forestValue27_86_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).j__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue27_94_0 = forestValue27_86_0;
        break forest_join_94;
    }
    if (!((forestValue27_86_0 == 0))) {
        break forest_join_107;
    }
    spill27_3 = this;
    if (!((life4_5 != 0))) {
        forestValue27_97_0 = spill27_3;
        break forest_join_97;
    }
    forestValue27_94_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill27_3)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.r)))) ? 1 : 0);
    }
    if (!((forestValue27_94_0 == 0))) {
        break forest_join_107;
    }
    forestValue27_97_0 = this.g;
    }
    if (!((life4_5 != 0))) {
        forestValue27_101_0 = forestValue27_97_0;
        break forest_join_101;
    }
    if (!((forestValue27_97_0 == null))) {
        break forest_join_107;
    }
    forestValue27_101_0 = p0;
    }
    spill27_4 = ((forestValue27_101_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forestValue27_106_0 = spill27_4;
        break forest_join_106;
    }
    if (!((spill27_4 != 0))) {
        break forest_join_107;
    }
    forestValue27_106_0 = 1;
    }
    forestValue27_108_0 = forestValue27_106_0;
    break forest_join_108;
    }
    forestValue27_108_0 = 0;
    }
    life8_161 = forestValue27_108_0;
    spill27_5 = life8_161;
    if (!((life4_5 != 0))) {
        forestValue27_128_0 = spill27_5;
        break forest_join_128;
    }
    if (!((spill27_5 != 0))) {
        break forest_join_123;
    }
    spill27_6 = recovery.source.CarrierOps.fcmpl(((float)(life5_25)), ((float)(0x0.0p0f)));
    if (!((life4_5 != 0))) {
        forestValue27_128_0 = spill27_6;
        break forest_join_128;
    }
    if (!((spill27_6 > 0))) {
        break forest_join_123;
    }
    life5_25 = (life5_25 * 0x1.8p0f);
    }
    life5_25 = (life5_25 + life7_29);
    forestValue27_128_0 = 0;
    }
    life9_190 = forestValue27_128_0;
    life10_193 = moom.rV.b(((net.minecraft.entity.EntityLivingBase)(this)));
    spill27_7 = p0;
    if (!((life4_5 != 0))) {
        forestValue27_152_0 = spill27_7;
        break forest_join_152;
    }
    if (!((((spill27_7 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forest_join_151;
    }
    spill27_8 = life10_193;
    if (!((life4_5 != 0))) {
        forestValue27_145_0 = spill27_8;
        break forest_join_145;
    }
    if (!((spill27_8 > 0))) {
        break forest_join_151;
    }
    spill27_9 = p0;
    if (!((life4_5 != 0))) {
        forestValue27_152_0 = spill27_9;
        break forest_join_152;
    }
    forestValue27_145_0 = ((((net.minecraft.entity.Entity)(spill27_9)).r__Boolean()) ? 1 : 0);
    }
    if (!((forestValue27_145_0 == 0))) {
        break forest_join_151;
    }
    life9_190 = 1;
    ((net.minecraft.entity.Entity)(p0)).b(((int)(1)));
    }
    forestValue27_152_0 = p0;
    }
    life11_228 = ((net.minecraft.entity.Entity)(forestValue27_152_0)).t;
    life13_231 = ((net.minecraft.entity.Entity)(p0)).u;
    life15_234 = ((net.minecraft.entity.Entity)(p0)).v;
    life17_240 = ((((net.minecraft.entity.Entity)(p0)).a__Boolean(((net.minecraft.util.DamageSource)(__sourceExactCall_10a743b01f087c(((net.minecraft.entity.player.EntityPlayer)(this))))), ((float)(life5_25)))) ? 1 : 0);
    spill27_10 = life17_240;
    if (!((life4_5 != 0))) {
        forestValue27_371_0 = spill27_10;
        break forest_join_371;
    }
    if (!((spill27_10 != 0))) {
        break forest_join_370;
    }
    life18_252 = new com.moon.event.ActionEvent(com.moon.event.ActionType.SPRINTING);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life18_252)));
    spill27_11 = life6_59;
    if (!((life4_5 != 0))) {
        forestValue27_235_0 = spill27_11;
        break forest_join_235;
    }
    if (!((spill27_11 > 0))) {
        break forest_join_233;
    }
    ((net.minecraft.entity.Entity)(p0)).c(((double)(((double) (((-moom.Dr.a(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f))))) * ((float) life6_59)) * 0x1.0p-1f)))), ((double)(0x1.999999999999ap-4d)), ((double)(((double) ((moom.Dr.b(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f)))) * ((float) life6_59)) * 0x1.0p-1f)))));
    spill27_12 = ((com.moon.event.ActionEvent)(life18_252)).isCancelled();
    if (!((life4_5 != 0))) {
        forestValue27_235_0 = ((spill27_12) ? 1 : 0);
        break forest_join_235;
    }
    if (!((!spill27_12))) {
        break forest_join_233;
    }
    net.minecraft.entity.player.EntityPlayer __stackOp27_59_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp27_59_0)).t = ((double)((((net.minecraft.entity.player.EntityPlayer)(__stackOp27_59_0)).t * 0x1.3333333333333p-1d)));
    net.minecraft.entity.player.EntityPlayer __stackOp27_62_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp27_62_0)).v = ((double)((((net.minecraft.entity.player.EntityPlayer)(__stackOp27_62_0)).v * 0x1.3333333333333p-1d)));
    ((net.minecraft.entity.player.EntityPlayer)(this)).c(((boolean)(false)));
    }
    forestValue27_235_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue27_264_0 = forestValue27_235_0;
        break forest_join_264;
    }
    if (!((forestValue27_235_0 != 0))) {
        break forest_join_263;
    }
    spill27_13 = ((net.minecraft.entity.Entity)(p0)).E;
    if (!((life4_5 != 0))) {
        forestValue27_264_0 = ((spill27_13) ? 1 : 0);
        break forest_join_264;
    }
    if (!(spill27_13)) {
        break forest_join_263;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(p0)))).cg)).a(((moom.yK)(new moom.zL(p0))));
    ((net.minecraft.entity.Entity)(p0)).E = ((boolean)(false));
    ((net.minecraft.entity.Entity)(p0)).t = ((double)(life11_228));
    ((net.minecraft.entity.Entity)(p0)).u = ((double)(life13_231));
    ((net.minecraft.entity.Entity)(p0)).v = ((double)(life15_234));
    }
    forestValue27_264_0 = life8_161;
    }
    if (!((life4_5 != 0))) {
        forestValue27_273_0 = forestValue27_264_0;
        break forest_join_273;
    }
    if (!((forestValue27_264_0 != 0))) {
        break forest_join_270;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).k(((net.minecraft.entity.Entity)(p0)));
    }
    forestValue27_273_0 = recovery.source.CarrierOps.fcmpl(((float)(life7_29)), ((float)(0x0.0p0f)));
    }
    if (!((life4_5 != 0))) {
        forestValue27_282_0 = forestValue27_273_0;
        break forest_join_282;
    }
    if (!((forestValue27_273_0 > 0))) {
        break forest_join_279;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).l(((net.minecraft.entity.Entity)(p0)));
    }
    forestValue27_282_0 = recovery.source.CarrierOps.fcmpl(((float)(life5_25)), ((float)(0x1.2p4f)));
    }
    if (!((life4_5 != 0))) {
        forestValue27_295_0 = forestValue27_282_0;
        break forest_join_295;
    }
    if (!((forestValue27_282_0 >= 0))) {
        break forest_join_288;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.AchievementList.F)));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).f(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_5 != 0))) {
        break forest_join_303;
    }
    forestValue27_295_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((forestValue27_295_0 != 0))) {
        break forest_join_300;
    }
    moom.rV.a(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))), ((net.minecraft.entity.Entity)(this)));
    }
    moom.rV.b(((net.minecraft.entity.EntityLivingBase)(this)), ((net.minecraft.entity.Entity)(p0)));
    }
    life19_420 = ((net.minecraft.entity.player.EntityPlayer)(this)).c__xW();
    life20_422 = p0;
    spill27_14 = p0;
    if (!((life4_5 != 0))) {
        forestValue27_314_0 = spill27_14;
        break forest_join_314;
    }
    if (!((((spill27_14 instanceof moom.ts) ? 1 : 0) != 0))) {
        break forest_join_325;
    }
    forestValue27_314_0 = p0;
    }
    life21_435 = ((moom.ts)(((moom.ts)(forestValue27_314_0)))).aE;
    spill27_15 = life21_435;
    if (!((life4_5 != 0))) {
        forestValue27_323_0 = spill27_15;
        break forest_join_323;
    }
    if (!((((spill27_15 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forest_join_325;
    }
    forestValue27_323_0 = life21_435;
    }
    life20_422 = ((net.minecraft.entity.EntityLivingBase)(forestValue27_323_0));
    }
    if (!((life19_420 != null))) {
        break forest_join_344;
    }
    spill27_16 = ((life20_422 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forestValue27_346_0 = spill27_16;
        break forest_join_346;
    }
    if (!((spill27_16 != 0))) {
        break forest_join_344;
    }
    ((net.minecraft.item.ItemStack)(life19_420)).a(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life20_422)))), ((net.minecraft.entity.player.EntityPlayer)(this)));
    spill27_17 = ((net.minecraft.item.ItemStack)(life19_420)).b;
    if (!((life4_5 != 0))) {
        forestValue27_346_0 = spill27_17;
        break forest_join_346;
    }
    if (!((spill27_17 <= 0))) {
        break forest_join_344;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).R();
    }
    forestValue27_346_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forestValue27_359_0 = forestValue27_346_0;
        break forest_join_359;
    }
    if (!((forestValue27_346_0 != 0))) {
        break forest_join_365;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((moom.BY)(net.minecraft.stats.StatList.w)), ((int)(java.lang.Math.round(((float)((life5_25 * 0x1.4p3f)))))));
    if (!((life4_5 != 0))) {
        break forest_join_368;
    }
    forestValue27_359_0 = life10_193;
    }
    if (!((forestValue27_359_0 > 0))) {
        break forest_join_365;
    }
    ((net.minecraft.entity.Entity)(p0)).b(((int)((life10_193 * 4))));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).h(((float)(0x1.333334p-2f)));
    }
    if (!((life4_5 == 0))) {
        break forest_join_374;
    }
    }
    forestValue27_371_0 = life9_190;
    }
    if (!((forestValue27_371_0 != 0))) {
        break forest_join_374;
    }
    ((net.minecraft.entity.Entity)(p0)).j();
    }
    return;
}


public int q__sourceReturn_8abf5c6871() {
int forwardValue5437_44_0;
    int forwardValue5437_44_1;
    int forwardValue5437_73_0;
    int forwardValue5437_73_1;
    int forwardValue5437_74_0;
    int spill5437_0;
    int spill5437_1;
    long life1_3;
    int life3_5;
    forward_join_74: {
    forward_join_73: {
    forward_join_64: {
    forward_join_44: {
    forward_join_37: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 6747651463381L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5437_0 = this.b2;
    spill5437_1 = __sourceIntrinsic_8eec3f92325c_invokedynamic5437_4(6041, (3972921457291196761L ^ life1_3));
    if (!((life3_5 == 0))) {
        forwardValue5437_44_0 = spill5437_0;
        forwardValue5437_44_1 = spill5437_1;
        break forward_join_44;
    }
    if (!((spill5437_0 >= spill5437_1))) {
        break forward_join_37;
    }
    forwardValue5437_74_0 = (__sourceIntrinsic_8eec3f92325c_invokedynamic5437_5(8921, (3047280863793794063L ^ life1_3)) + ((this.b2 - __sourceIntrinsic_8eec3f92325c_invokedynamic5437_7(6041, (3972921457291196761L ^ life1_3))) * __sourceIntrinsic_8eec3f92325c_invokedynamic5437_8(7261, (7373966515795358339L ^ life1_3))));
    break forward_join_74;
    }
    forwardValue5437_44_0 = this.b2;
    forwardValue5437_44_1 = __sourceIntrinsic_8eec3f92325c_invokedynamic5437_10(16970, (1571178560062827651L ^ life1_3));
    }
    if (!((life3_5 == 0))) {
        forwardValue5437_73_0 = forwardValue5437_44_0;
        forwardValue5437_73_1 = forwardValue5437_44_1;
        break forward_join_73;
    }
    if (!((forwardValue5437_44_0 >= forwardValue5437_44_1))) {
        break forward_join_64;
    }
    forwardValue5437_74_0 = (__sourceIntrinsic_8eec3f92325c_invokedynamic5437_11(28039, (5329079382385984350L ^ life1_3)) + ((this.b2 - __sourceIntrinsic_8eec3f92325c_invokedynamic5437_13(5784, (8904454068015069263L ^ life1_3))) * 5));
    break forward_join_74;
    }
    forwardValue5437_73_0 = __sourceIntrinsic_8eec3f92325c_invokedynamic5437_14(21606, (5786271349604334259L ^ life1_3));
    forwardValue5437_73_1 = (this.b2 * 2);
    }
    forwardValue5437_74_0 = (forwardValue5437_73_0 + forwardValue5437_73_1);
    }
    return forwardValue5437_74_0;
}


public boolean q__Boolean() {
int forwardValue5438_13_0;
    int forwardValue5438_17_0;
    int forwardValue5438_19_0;
    boolean spill5438_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 62444254724504L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5438_0 = this.bS;
    if (!((life3_5 != 0))) {
        forwardValue5438_13_0 = ((spill5438_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5438_0))) {
        break forward_join_18;
    }
    forwardValue5438_13_0 = ((super.q__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue5438_17_0 = forwardValue5438_13_0;
        break forward_join_17;
    }
    if (!((forwardValue5438_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5438_17_0 = 1;
    }
    forwardValue5438_19_0 = forwardValue5438_17_0;
    break forward_join_19;
    }
    forwardValue5438_19_0 = 0;
    }
    return ((forwardValue5438_19_0) != 0);
}


public abstract boolean U__Boolean();

public static int r__sourceReturn_8abf5c6871() {
return net.minecraft.entity.player.EntityPlayer.cd;
}


public boolean A__sourceReturn_aae029aa0a() {
int forwardValue5378_13_0;
    int forwardValue5378_15_0;
    boolean spill5378_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 103712016420782L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5378_0 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b;
    if (!((life3_5 == 0))) {
        forwardValue5378_13_0 = ((spill5378_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill5378_0))) {
        break forward_join_14;
    }
    forwardValue5378_13_0 = 1;
    }
    forwardValue5378_15_0 = forwardValue5378_13_0;
    break forward_join_15;
    }
    forwardValue5378_15_0 = 0;
    }
    return ((forwardValue5378_15_0) != 0);
}


public boolean K__Boolean() {
return ((((this.bS) ? 1 : 0)) != 0);
}


public void N() {
net.minecraft.entity.player.EntityPlayer forwardValue5382_20_0;
    net.minecraft.entity.player.EntityPlayer spill5382_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 127785037924679L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5382_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5382_20_0 = spill5382_0;
        break forward_join_20;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill5382_0)).b6 != null))) {
        break forward_join_19;
    }
    ((net.minecraft.item.ItemStack)(this.b6)).b(((net.minecraft.world.World)(this.i)), ((net.minecraft.entity.player.EntityPlayer)(this)), ((int)(this.b7)));
    }
    forwardValue5382_20_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5382_20_0)).O();
    return;
}


public boolean N__Boolean() {
net.minecraft.entity.player.EntityPlayer forwardValue5383_12_0;
    int forwardValue5383_22_0;
    net.minecraft.entity.player.EntityPlayer spill5383_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 33166328582148L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5383_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5383_12_0 = spill5383_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill5383_0)).M())) {
        break forward_join_21;
    }
    forwardValue5383_12_0 = this;
    }
    if (!((((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5383_12_0)).b6)).a__wQ())).a__a1(((net.minecraft.item.ItemStack)(this.b6))) == moom.a1.BLOCK))) {
        break forward_join_21;
    }
    forwardValue5383_22_0 = 1;
    break forward_join_22;
    }
    forwardValue5383_22_0 = 0;
    }
    return ((forwardValue5383_22_0) != 0);
}


public boolean M() {
long local1 = (net.minecraft.entity.player.EntityPlayer.gb ^ 86636227023038L);
    return ((((this.b6 != null) ? 1 : 0)) != 0);
}


protected void P() {
net.minecraft.item.ItemStack forwardValue5385_22_0;
    net.minecraft.item.ItemStack forwardValue5385_42_0;
    net.minecraft.item.ItemStack forwardValue5385_58_0;
    int forwardValue5385_59_0;
    net.minecraft.entity.player.EntityPlayer forwardValue5385_69_0;
    net.minecraft.item.ItemStack spill5385_0;
    net.minecraft.item.ItemStack spill5385_1;
    net.minecraft.item.ItemStack spill5385_2;
    int spill5385_3;
    net.minecraft.entity.player.EntityPlayer spill5385_4;
    long life1_3;
    int life3_5;
    int life4_29;
    net.minecraft.item.ItemStack life5_36;
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_59: {
    forward_join_58: {
    forward_join_47: {
    forward_join_42: {
    forward_join_22: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 42853081495641L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.b__Boolean()) ? 1 : 0);
    spill5385_0 = this.b6;
    if (!((life3_5 != 0))) {
        forwardValue5385_22_0 = spill5385_0;
        break forward_join_22;
    }
    if (!((spill5385_0 != null))) {
        break forward_join_70;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).a(((net.minecraft.item.ItemStack)(this.b6)), ((int)(__sourceIntrinsic_44bfa09b42f9_invokedynamic5385_5(29226, (1967566431428443234L ^ life1_3)))));
    forwardValue5385_22_0 = this.b6;
    }
    life4_29 = ((net.minecraft.item.ItemStack)(forwardValue5385_22_0)).b;
    life5_36 = ((net.minecraft.item.ItemStack)(this.b6)).b(((net.minecraft.world.World)(this.i)), ((net.minecraft.entity.player.EntityPlayer)(this)));
    spill5385_1 = life5_36;
    if (!((life3_5 != 0))) {
        forwardValue5385_58_0 = spill5385_1;
        break forward_join_58;
    }
    if (!((spill5385_1 == this.b6))) {
        break forward_join_47;
    }
    spill5385_2 = life5_36;
    if (!((life3_5 != 0))) {
        forwardValue5385_42_0 = spill5385_2;
        break forward_join_42;
    }
    if (!((spill5385_2 != null))) {
        break forward_join_68;
    }
    forwardValue5385_42_0 = life5_36;
    }
    spill5385_3 = ((net.minecraft.item.ItemStack)(forwardValue5385_42_0)).b;
    if (!((life3_5 != 0))) {
        forwardValue5385_59_0 = spill5385_3;
        break forward_join_59;
    }
    if (!((spill5385_3 != life4_29))) {
        break forward_join_68;
    }
    }
    spill5385_4 = this;
    if (!((life3_5 != 0))) {
        forwardValue5385_69_0 = spill5385_4;
        break forward_join_69;
    }
    (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(spill5385_4)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c] = life5_36;
    forwardValue5385_58_0 = life5_36;
    }
    forwardValue5385_59_0 = ((net.minecraft.item.ItemStack)(forwardValue5385_58_0)).b;
    }
    if (!((forwardValue5385_59_0 == 0))) {
        break forward_join_68;
    }
    (((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c] = null;
    }
    forwardValue5385_69_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5385_69_0)).O();
    }
    return;
}


private boolean P__Boolean() {
long local1 = (net.minecraft.entity.player.EntityPlayer.gb ^ 88600911217405L);
    return ((((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(this.bT))))).a__ch() == net.minecraft.init.Blocks.C) ? 1 : 0)) != 0);
}


public void T() {
return;
}


public boolean T__Boolean() {
return ((((((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).e) ? 1 : 0)) != 0);
}


protected void H() {
super.H();
    ((net.minecraft.entity.player.EntityPlayer)(this)).C();
    this.a4 = ((float)(this.w));
    return;
}


public void R() {
((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    return;
}


public boolean R__Boolean() {
return ((((this.bZ) ? 1 : 0)) != 0);
}


public boolean Q__Boolean() {
int forwardValue5386_13_0;
    int forwardValue5386_22_0;
    int forwardValue5386_24_0;
    boolean spill5386_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 76590108201887L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill5386_0 = this.bS;
    if (!((life3_5 == 0))) {
        forwardValue5386_13_0 = ((spill5386_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill5386_0)) {
        break forward_join_23;
    }
    forwardValue5386_13_0 = this.bU;
    }
    if (!((life3_5 == 0))) {
        forwardValue5386_22_0 = forwardValue5386_13_0;
        break forward_join_22;
    }
    if (!((forwardValue5386_13_0 >= __sourceIntrinsic_36485c8ca576_invokedynamic5386_6(30953, (492420766286290287L ^ life1_3))))) {
        break forward_join_23;
    }
    forwardValue5386_22_0 = 1;
    }
    forwardValue5386_24_0 = forwardValue5386_22_0;
    break forward_join_24;
    }
    forwardValue5386_24_0 = 0;
    }
    return ((forwardValue5386_24_0) != 0);
}


protected void Q() {
this.bG = ((moom.v8)(this.bF));
    return;
}


public boolean O__Boolean() {
return ((0) != 0);
}


public void O() {
net.minecraft.entity.player.EntityPlayer forwardValue5384_19_0;
    boolean spill5384_0;
    net.minecraft.entity.player.EntityPlayer spill5384_1;
    long life1_3;
    int life3_11;
    forward_join_21: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 107538925718720L);
    this.b6 = ((net.minecraft.item.ItemStack)(null));
    spill5384_0 = net.minecraft.entity.player.InventoryPlayer.b__Boolean();
    this.b7 = ((int)(0));
    life3_11 = ((spill5384_0) ? 1 : 0);
    spill5384_1 = this;
    if (!((life3_11 != 0))) {
        forwardValue5384_19_0 = spill5384_1;
        break forward_join_19;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill5384_1)).i)).G))) {
        break forward_join_21;
    }
    forwardValue5384_19_0 = this;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5384_19_0)).e(((boolean)(false)));
    }
    return;
}


public void G() {
net.minecraft.entity.player.EntityPlayer lexicalValue1616_18_0;
    int lexicalValue1616_59_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1616_89_0;
    int lexicalValue1616_112_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1616_131_0;
    int lexicalValue1616_163_0;
    int lexicalValue1616_170_0;
    int lexicalValue1616_177_0;
    int lexicalValue1616_184_0;
    int lexicalValue1616_215_0;
    int lexicalValue1616_220_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1616_247_0;
    int lexicalValue1616_284_0;
    net.minecraft.entity.player.EntityPlayer spill1616_0;
    net.minecraft.entity.player.EntityPlayer spill1616_1;
    int spill1616_2;
    int spill1616_3;
    net.minecraft.entity.player.EntityPlayer spill1616_4;
    net.minecraft.entity.player.EntityPlayer spill1616_5;
    boolean spill1616_6;
    net.minecraft.entity.player.EntityPlayer spill1616_7;
    int spill1616_8;
    net.minecraft.entity.player.EntityPlayer spill1616_9;
    net.minecraft.entity.player.EntityPlayer spill1616_10;
    long life1_3;
    int life3_5;
    net.minecraft.entity.ai.attributes.IAttributeInstance life4_133;
    float life5_196;
    float life6_206;
    java.lang.Object life7_303;
    moom.CA life7_334;
    java.util.List life8_348;
    java.util.Iterator life9_351;
    net.minecraft.entity.Entity life10_358;
    lexical_join_285: {
    lexical_join_284: {
    lexical_join_283: {
    lexical_join_277: {
    lexical_join_253: {
    lexical_join_247: {
    lexical_join_246: {
    lexical_join_220: {
    lexical_join_215: {
    lexical_join_189: {
    lexical_join_187: {
    lexical_join_184: {
    lexical_join_177: {
    lexical_join_175: {
    lexical_join_173: {
    lexical_join_170: {
    lexical_join_163: {
    lexical_join_161: {
    lexical_join_131: {
    lexical_join_125: {
    lexical_join_112: {
    lexical_join_104: {
    lexical_join_89: {
    lexical_join_79: {
    lexical_join_59: {
    lexical_join_54: {
    lexical_join_18: {
    lexical_join_17: {
    life1_3 = (net.minecraft.entity.player.EntityPlayer.gb ^ 15815241879567L);
    life3_5 = ((net.minecraft.entity.player.InventoryPlayer.c__Boolean()) ? 1 : 0);
    spill1616_0 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1616_18_0 = spill1616_0;
        break lexical_join_18;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill1616_0)).bI > 0))) {
        break lexical_join_17;
    }
    net.minecraft.entity.player.EntityPlayer __stackOp1616_4_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp1616_4_0)).bI = ((int)((((net.minecraft.entity.player.EntityPlayer)(__stackOp1616_4_0)).bI - 1)));
    }
    lexicalValue1616_18_0 = this;
    }
    if (!((life3_5 == 0))) {
        lexicalValue1616_89_0 = lexicalValue1616_18_0;
        break lexical_join_89;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(lexicalValue1616_18_0)).i)).a__bB() == net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break lexical_join_79;
    }
    spill1616_1 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1616_89_0 = spill1616_1;
        break lexical_join_89;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(spill1616_1)).i)).a__Ej())).a__Boolean(((java.lang.String)("naturalRegeneration"))))) {
        break lexical_join_79;
    }
    spill1616_2 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.player.EntityPlayer)(this)).a())));
    if (!((life3_5 == 0))) {
        lexicalValue1616_59_0 = spill1616_2;
        break lexical_join_59;
    }
    if (!((spill1616_2 < 0))) {
        break lexical_join_54;
    }
    spill1616_3 = (this.S % __sourceIntrinsic_c7b45e3c376e_invokedynamic1616_17(20667, (6479387574677878453L ^ life1_3)));
    if (!((life3_5 == 0))) {
        lexicalValue1616_59_0 = spill1616_3;
        break lexical_join_59;
    }
    if (!((spill1616_3 == 0))) {
        break lexical_join_54;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).c(((float)(0x1.0p0f)));
    }
    spill1616_4 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1616_89_0 = spill1616_4;
        break lexical_join_89;
    }
    lexicalValue1616_59_0 = ((((net.minecraft.util.FoodStats)(((net.minecraft.entity.player.EntityPlayer)(spill1616_4)).bH)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1616_59_0 != 0))) {
        break lexical_join_79;
    }
    spill1616_5 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1616_89_0 = spill1616_5;
        break lexical_join_89;
    }
    if (!(((((net.minecraft.entity.player.EntityPlayer)(spill1616_5)).S % __sourceIntrinsic_c7b45e3c376e_invokedynamic1616_23(30377, (5028314054755127474L ^ life1_3))) == 0))) {
        break lexical_join_79;
    }
    ((net.minecraft.util.FoodStats)(this.bH)).a(((int)((((net.minecraft.util.FoodStats)(this.bH)).a__Int() + 1))));
    }
    ((net.minecraft.entity.player.InventoryPlayer)(this.bD)).c__Void();
    this.bJ = ((float)(this.bK));
    super.G();
    lexicalValue1616_89_0 = this;
    }
    life4_133 = ((net.minecraft.entity.player.EntityPlayer)(lexicalValue1616_89_0)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    spill1616_6 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == 0))) {
        lexicalValue1616_112_0 = ((spill1616_6) ? 1 : 0);
        break lexical_join_112;
    }
    if (!((!spill1616_6))) {
        break lexical_join_104;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life4_133)).a(((double)(((double) __sourceExactCall_538d951939d3d7(((net.minecraft.entity.player.PlayerCapabilities)(this.b1)))))));
    }
    this.a6 = ((float)(this.b9));
    spill1616_7 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1616_131_0 = spill1616_7;
        break lexical_join_131;
    }
    lexicalValue1616_112_0 = ((((net.minecraft.entity.player.EntityPlayer)(spill1616_7)).u__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1616_112_0 != 0))) {
        break lexical_join_125;
    }
    this.a6 = ((float)(((float) (((double) this.a6) + (((double) this.b9) * 0x1.3333333333333p-2d)))));
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).f(((float)(((float) __sourceExactCall_dd090c64aab6a6(((net.minecraft.entity.ai.attributes.IAttributeInstance)(life4_133)))))));
    lexicalValue1616_131_0 = this;
    }
    life5_196 = moom.Dr.a__Float(((double)(((((net.minecraft.entity.player.EntityPlayer)(lexicalValue1616_131_0)).t * this.t) + (this.v * this.v)))));
    life6_206 = ((float) (java.lang.Math.atan(((double)(((-this.u) * 0x1.99999ap-3d)))) * 0x1.ep3d));
    spill1616_8 = recovery.source.CarrierOps.fcmpl(((float)(life5_196)), ((float)(0x1.99999ap-4f)));
    if (!((life3_5 == 0))) {
        lexicalValue1616_163_0 = spill1616_8;
        break lexical_join_163;
    }
    if (!((spill1616_8 > 0))) {
        break lexical_join_161;
    }
    life5_196 = 0x1.99999ap-4f;
    }
    lexicalValue1616_163_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        lexicalValue1616_170_0 = lexicalValue1616_163_0;
        break lexical_join_170;
    }
    if (!((lexicalValue1616_163_0 != 0))) {
        break lexical_join_173;
    }
    lexicalValue1616_170_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 == 0))) {
        lexicalValue1616_177_0 = lexicalValue1616_170_0;
        break lexical_join_177;
    }
    if (!((lexicalValue1616_170_0 <= 0))) {
        break lexical_join_175;
    }
    }
    life5_196 = 0x0.0p0f;
    }
    lexicalValue1616_177_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        lexicalValue1616_184_0 = lexicalValue1616_177_0;
        break lexical_join_184;
    }
    if (!((lexicalValue1616_177_0 == 0))) {
        break lexical_join_187;
    }
    lexicalValue1616_184_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 == 0))) {
        lexicalValue1616_215_0 = lexicalValue1616_184_0;
        break lexical_join_215;
    }
    if (!((lexicalValue1616_184_0 <= 0))) {
        break lexical_join_189;
    }
    }
    life6_206 = 0x0.0p0f;
    }
    net.minecraft.entity.player.EntityPlayer __stackOp1616_66_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp1616_66_0)).bK = ((float)((((net.minecraft.entity.player.EntityPlayer)(__stackOp1616_66_0)).bK + ((life5_196 - this.bK) * 0x1.99999ap-2f))));
    net.minecraft.entity.player.EntityPlayer __stackOp1616_70_0 = this;
    ((net.minecraft.entity.player.EntityPlayer)(__stackOp1616_70_0)).aZ = ((float)((((net.minecraft.entity.player.EntityPlayer)(__stackOp1616_70_0)).aZ + ((life6_206 - this.aZ) * 0x1.99999ap-1f))));
    lexicalValue1616_215_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.player.EntityPlayer)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 == 0))) {
        lexicalValue1616_220_0 = lexicalValue1616_215_0;
        break lexical_join_220;
    }
    if (!((lexicalValue1616_215_0 > 0))) {
        break lexical_join_277;
    }
    lexicalValue1616_220_0 = ((((net.minecraft.entity.player.EntityPlayer)(this)).U__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1616_220_0 == 0))) {
        break lexical_join_277;
    }
    life7_303 = null;
    spill1616_9 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1616_247_0 = spill1616_9;
        break lexical_join_247;
    }
    if (!((((net.minecraft.entity.player.EntityPlayer)(spill1616_9)).g != null))) {
        break lexical_join_246;
    }
    spill1616_10 = this;
    if (!((life3_5 == 0))) {
        lexicalValue1616_247_0 = spill1616_10;
        break lexical_join_247;
    }
    if (!((!((net.minecraft.entity.Entity)(((net.minecraft.entity.player.EntityPlayer)(spill1616_10)).g)).F))) {
        break lexical_join_246;
    }
    life7_334 = ((moom.CA)(((moom.CA)(((net.minecraft.entity.player.EntityPlayer)(this)).b())).a(((moom.CA)(__sourceExactCall_5f0a1ab2f67043(((net.minecraft.entity.Entity)(this.g)))))))).b(((double)(0x1.0p0d)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    break lexical_join_253;
    }
    lexicalValue1616_247_0 = this;
    }
    life7_334 = ((moom.CA)(__sourceExactCall_fd4d1ba454b3d4(((net.minecraft.entity.player.EntityPlayer)(lexicalValue1616_247_0))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p-1d)), ((double)(0x1.0p0d)));
    }
    life8_348 = ((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(life7_334)));
    life9_351 = ((java.util.List)(life8_348)).iterator();
    lexical_cycle_262: while (true) {
    lexical_join_275: {
    if (!(((java.util.Iterator)(life9_351)).hasNext())) {
        break lexical_join_277;
    }
    life10_358 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life9_351)).next()));
    if (!((!((net.minecraft.entity.Entity)(life10_358)).F))) {
        break lexical_join_275;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this)).i(((net.minecraft.entity.Entity)(life10_358)));
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_262; }
    break lexical_cycle_262;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_285;
    }
    if (!((life3_5 != 0))) {
        break lexical_join_283;
    }
    lexicalValue1616_284_0 = 0;
    break lexical_join_284;
    }
    lexicalValue1616_284_0 = 1;
    }
    __sourceExactCall_085f9b14bb1836(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1616_284_0))));
    }
    return;
}


protected boolean G__Boolean() {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_3869c773480cb195_invokedynamic200030_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1616_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1616_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_44bfa09b42f9_invokedynamic5385_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_36485c8ca576_invokedynamic5386_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1116_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1116_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1116_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a36a7fdae99_originalDynamicSite2002_0(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_635fc168609b_invokedynamic5399_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_635fc168609b_invokedynamic5399_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9aa692f4537_invokedynamic5400_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e9aa692f4537_invokedynamic5400_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_108cbe15f863_invokedynamic5401_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e8c1e12cb8dd_invokedynamic5403_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c2ba139c0e88_invokedynamic5407_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6e581d8d1b3b_originalDynamicSite2003_6(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5414_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7722627b66bb_invokedynamic5414_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral11733_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5416_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite2001_15(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c23f50d43b1e_call5419_19(net.minecraft.entity.player.EntityPlayer a0, float a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_invokedynamic5422_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_adcc04842c60_invokedynamic5423_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80d806743da5_originalDynamicSite2005_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5fb4e31097d0_invokedynamic11775_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5427_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5427_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5427_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5427_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic5427_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4439aefd30a6_originalDynamicSite2007_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_29d5bbbacb40_originalDynamicSite2006_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_86b23f1beed7_originalDynamicSite2004_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_invokedynamic1621_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c3f99722dec_originalDynamicSite2000_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e3ce5c7e7d84_invokedynamic5435_15(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_7db5f979ba34_call5436_4(net.minecraft.entity.player.EntityPlayer a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic5437_14(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_f4799d64ae03_call5440_5(net.minecraft.entity.player.EntityPlayer a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_f21b3836e04476(net.minecraft.item.ItemStack p0);
private static native int __sourceExactCall_2ecfe7306c4872();
private static native java.util.UUID __sourceExactCall_db997ad1931512(com.mojang.authlib.GameProfile p0);
private static native int __sourceExactCall_89db7187fc3c9f(int p0, long p1);
private static native int __sourceExactCall_7da118eea97d77(net.minecraft.item.Item p0);
private static native java.util.UUID __sourceExactCall_f0619aac10bdc2(java.lang.String p0);
private static native moom.DT __sourceExactCall_cff869ea9f2b7f(net.minecraft.world.World p0, moom.DT p1, int p2);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native net.minecraft.util.DamageSource __sourceExactCall_10a743b01f087c(net.minecraft.entity.player.EntityPlayer p0);
private static native void __sourceExactCall_085f9b14bb1836(boolean p0);

private static native java.lang.String __sourceExactCall_761729e13ff900(net.minecraft.entity.player.EntityPlayer p0);
private static native float __sourceExactCall_538d951939d3d7(net.minecraft.entity.player.PlayerCapabilities p0);
private static native double __sourceExactCall_dd090c64aab6a6(net.minecraft.entity.ai.attributes.IAttributeInstance p0);
private static native moom.CA __sourceExactCall_5f0a1ab2f67043(net.minecraft.entity.Entity p0);
private static native moom.CA __sourceExactCall_fd4d1ba454b3d4(net.minecraft.entity.player.EntityPlayer p0);

private static native java.lang.String __sourceExactCall_73e780db0476d5(net.minecraft.entity.Entity p0);
}
