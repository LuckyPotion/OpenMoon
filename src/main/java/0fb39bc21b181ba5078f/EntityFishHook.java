package net.minecraft.entity.projectile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityFishHook extends net.minecraft.entity.Entity {

private static java.util.List<moom.D6> aE;

private static java.util.List<moom.D6> aF;

private static java.util.List<moom.D6> aG;

private int aH;

private int aI;

private int aJ;

private net.minecraft.block.Block aK;

private boolean aL;

public int aM;

public net.minecraft.entity.player.EntityPlayer aN;

private int aO;

private int aP;

private int aQ;

private int aR;

private int aS;

private float aT;

public net.minecraft.entity.Entity aU;

private int aV;

private double aW;

private double aX;

private double aY;

private double aZ;

private double a0;

private double a1;

private double a2;

private double a3;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public EntityFishHook(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.entity.player.EntityPlayer p4) {
this(p0);
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));
    this.ac = ((boolean)(true));
    this.aN = ((net.minecraft.entity.player.EntityPlayer)(p4));
    ((net.minecraft.entity.player.EntityPlayer)(p4)).cc = ((net.minecraft.entity.projectile.EntityFishHook)(this));
    return;
}


public EntityFishHook(net.minecraft.world.World p0) {
super(p0);
    this.aH = -1;
    this.aI = -1;
    this.aJ = -1;
    (this).a__Void(0x1.0000000000000p-2f, 0x1.0000000000000p-2f);
    this.ac = true;
}


public EntityFishHook(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_4676718c2dfd0cbc(net.minecraft.entity.projectile.EntityFishHook receiver, net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1) throws Throwable {
long local3_life1 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 138293936491632L);
    net.minecraft.entity.projectile.EntityFishHook.__sourceConstructorInit_4676718c2dfd0cbc_0(((net.minecraft.entity.projectile.EntityFishHook)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).aH = ((int)(-1));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).aI = ((int)(-1));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).aJ = ((int)(-1));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).ac = ((boolean)(true));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).aN = ((net.minecraft.entity.player.EntityPlayer)(p1));
    ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(receiver)).aN)).cc = ((net.minecraft.entity.projectile.EntityFishHook)(receiver));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).a__Void(((float)(0x1.0p-2f)), ((float)(0x1.0p-2f)));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).c(((double)(((net.minecraft.entity.player.EntityPlayer)(p1)).n)), ((double)((((net.minecraft.entity.player.EntityPlayer)(p1)).o + ((double) ((net.minecraft.entity.player.EntityPlayer)(p1)).e__Float())))), ((double)(((net.minecraft.entity.player.EntityPlayer)(p1)).p)), ((float)(((net.minecraft.entity.player.EntityPlayer)(p1)).w)), ((float)(((net.minecraft.entity.player.EntityPlayer)(p1)).x)));
    receiver.n -= ((double) (moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityFishHook)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f)))) * 0x1.47ae14p-3f));
    receiver.o -= 0x1.99999ap-4d;
    int[] __sourceSpill950_26 = moom.h1.a__ArrayInt();
    receiver.p -= ((double) (moom.Dr.a(((float)(((((net.minecraft.entity.projectile.EntityFishHook)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f)))) * 0x1.47ae14p-3f));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).a__Void(((double)(((net.minecraft.entity.projectile.EntityFishHook)(receiver)).n)), ((double)(((net.minecraft.entity.projectile.EntityFishHook)(receiver)).o)), ((double)(((net.minecraft.entity.projectile.EntityFishHook)(receiver)).p)));
    float local6_life31 = 0x1.99999ap-2f;
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).t = ((double)(((double) (((-moom.Dr.a(((float)(((((net.minecraft.entity.projectile.EntityFishHook)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f))))) * moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityFishHook)(receiver)).x / 0x1.68p7f) * 0x1.921fb6p1f))))) * local6_life31))));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).v = ((double)(((double) ((moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityFishHook)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f)))) * moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityFishHook)(receiver)).x / 0x1.68p7f) * 0x1.921fb6p1f))))) * local6_life31))));
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).u = ((double)(((double) ((-moom.Dr.a(((float)(((((net.minecraft.entity.projectile.EntityFishHook)(receiver)).x / 0x1.68p7f) * 0x1.921fb6p1f))))) * local6_life31))));
    int[] local5_life45 = __sourceSpill950_26;
    ((net.minecraft.entity.projectile.EntityFishHook)(receiver)).a(((double)(((net.minecraft.entity.projectile.EntityFishHook)(receiver)).t)), ((double)(((net.minecraft.entity.projectile.EntityFishHook)(receiver)).u)), ((double)(((net.minecraft.entity.projectile.EntityFishHook)(receiver)).v)), ((float)(0x1.8p0f)), ((float)(0x1.0p0f)));
    if ((local5_life45 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(6225536325437187906L)), ((long)(-6215895670024709172L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(133748903489320L)))));
    long local11_life6 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 37731598336164L);
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1893_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1893_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1893_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1893_14 = new byte[8];
    (__sourceSpill1893_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1893_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1893_16 = __sourceSpill1893_14;
    ((javax.crypto.Cipher)(__sourceSpill1893_11)).init(((int)(__sourceSpill1893_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1893_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1893_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[24];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\0063Í\006&R'Üà\000î¿}ËM¥â`ìO\022ã7\016\000@\025A£á6\017§îRE\024\003HÒYgJÏÎjëÌüvñâiý@\000Ó\rG)k2ÿT!\003Àí¸\nýÞ\fäRý$/\031gÄ£\"~\002\033ð«Ý\nòþyÅëÐþFnÁÆ\fV¯\b¡ø\037N\005\027Ñ40={È\037S#óöàN\036?Jý¿\bÏ9½¦xö&|î\\úü\t\002\005øå"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1893_25 = local4_life21;
        int __sourceSpill1893_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1893_25)).substring(((int)(__sourceSpill1893_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1893_30 = local6_life19;
        int __sourceSpill1893_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1893_33 = new byte[8];
        (__sourceSpill1893_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1893_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1893_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1893_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1893_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1893_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1893_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1893_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1893_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1893_34)).doFinal(((byte[])(__sourceSpill1893_33)));
        (__sourceSpill1893_30)[__sourceSpill1893_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Æ²a¶÷£ \"ZÅ\030\026s£ü\031"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1893_38 = local4_life21;
        int __sourceSpill1893_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1893_38)).substring(((int)(__sourceSpill1893_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1893_43 = local6_life19;
        int __sourceSpill1893_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1893_46 = new byte[8];
        (__sourceSpill1893_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1893_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1893_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1893_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1893_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1893_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1893_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1893_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1893_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1893_47)).doFinal(((byte[])(__sourceSpill1893_46)));
        (__sourceSpill1893_43)[__sourceSpill1893_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    cb = ((long[])(local6_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[24]));
    moom.D6[] __sourceSpill1893_56 = new moom.D6[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_52(1838, (1193607347164917369L ^ local11_life6))];
    (__sourceSpill1893_56)[0] = ((moom.D6)(new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.T), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_54(15136, (1420597058708902498L ^ local11_life6))))).a(((float)(0x1.ccccccp-1f)));
    (__sourceSpill1893_56)[1] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aF), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_58(24431, (8622374218703500844L ^ local11_life6)));
    (__sourceSpill1893_56)[2] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aX), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_60(24431, (8622374218703500844L ^ local11_life6)));
    (__sourceSpill1893_56)[3] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_62(24431, (8622374218703500844L ^ local11_life6)));
    (__sourceSpill1893_56)[4] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.F), 5);
    (__sourceSpill1893_56)[5] = ((moom.D6)(new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aR), 2))).a(((float)(0x1.ccccccp-1f)));
    (__sourceSpill1893_56)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_66(30917, (9053058509623021967L ^ local11_life6))] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.z), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_68(24431, (8622374218703500844L ^ local11_life6)));
    (__sourceSpill1893_56)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_69(3017, (5541259789585130113L ^ local11_life6))] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.y), 5);
    (__sourceSpill1893_56)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_71(10784, (6296402140711814000L ^ local11_life6))] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aW, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_73(24431, (8622374218703500844L ^ local11_life6)), ((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLACK)).b()), 1);
    (__sourceSpill1893_56)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_76(14811, (2053066770800775310L ^ local11_life6))] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bG), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_78(24431, (8622374218703500844L ^ local11_life6)));
    (__sourceSpill1893_56)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_79(24431, (8622374218703500844L ^ local11_life6))] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bi), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_81(24431, (8622374218703500844L ^ local11_life6)));
    aE = ((java.util.List)(java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1893_56)))));
    moom.D6[] __sourceSpill1893_86 = new moom.D6[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_84(2954, (3056640471476183754L ^ local11_life6))];
    (__sourceSpill1893_86)[0] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bm), 1);
    (__sourceSpill1893_86)[1] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.b3), 1);
    (__sourceSpill1893_86)[2] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aA), 1);
    (__sourceSpill1893_86)[3] = ((moom.D6)(((moom.D6)(new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.f), 1))).a(((float)(0x1.0p-2f))))).a();
    (__sourceSpill1893_86)[4] = ((moom.D6)(((moom.D6)(new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aR), 1))).a(((float)(0x1.0p-2f))))).a();
    (__sourceSpill1893_86)[5] = ((moom.D6)(new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aL), 1))).a();
    aF = ((java.util.List)(java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1893_86)))));
    moom.D6[] __sourceSpill1893_103 = new moom.D6[4];
    (__sourceSpill1893_103)[0] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aU, 1, ((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.COD)).a__Int()), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_102(16732, (195621234544404506L ^ local11_life6)));
    (__sourceSpill1893_103)[1] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aU, 1, ((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.SALMON)).a__Int()), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_107(19500, (1357021497793242465L ^ local11_life6)));
    (__sourceSpill1893_103)[2] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aU, 1, ((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.CLOWNFISH)).a__Int()), 2);
    (__sourceSpill1893_103)[3] = new moom.D6(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aU, 1, ((net.minecraft.item.ItemFishFood$FishType)(net.minecraft.item.ItemFishFood$FishType.PUFFERFISH)).a__Int()), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_114(22621, (6787542369095938315L ^ local11_life6)));
    aG = ((java.util.List)(java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1893_103)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_4676718c2dfd0cbc_0(net.minecraft.entity.projectile.EntityFishHook a0, net.minecraft.world.World a1) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 807;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tR", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.projectile.EntityFishHook.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11872_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.projectile.EntityFishHook forwardValue5458_50_0;
    int forwardValue5458_50_1;
    net.minecraft.entity.projectile.EntityFishHook forwardValue5458_72_0;
    int forwardValue5458_72_1;
    net.minecraft.entity.projectile.EntityFishHook forwardValue5458_73_0;
    net.minecraft.entity.projectile.EntityFishHook forwardValue5458_74_0;
    int forwardValue5458_74_1;
    int[] spill5458_0;
    net.minecraft.entity.projectile.EntityFishHook spill5458_1;
    short spill5458_2;
    net.minecraft.entity.projectile.EntityFishHook spill5458_3;
    byte spill5458_4;
    long life2_3;
    int[] life4_15;
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_52: {
    forward_join_50: {
    forward_join_40: {
    life2_3 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 11249133081690L);
    this.aH = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("xTile")))));
    spill5458_0 = moom.h1.a__ArrayInt();
    this.aI = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("yTile")))));
    life4_15 = spill5458_0;
    spill5458_1 = this;
    spill5458_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("zTile")));
    if (!((life4_15 != null))) {
        forwardValue5458_50_0 = spill5458_1;
        forwardValue5458_50_1 = ((int)(spill5458_2));
        break forward_join_50;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(spill5458_1)).aJ = ((int)(spill5458_2));
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("inTile")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5458_9(17364, (1027866688280837753L ^ life2_3))))))) {
        break forward_join_40;
    }
    this.aK = ((net.minecraft.block.Block)(net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("inTile"))))))));
    if (!((life4_15 == null))) {
        break forward_join_52;
    }
    }
    forwardValue5458_50_0 = this;
    forwardValue5458_50_1 = (((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("inTile"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5458_15(3994, (8305385334996496936L ^ life2_3)));
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(forwardValue5458_50_0)).aK = ((net.minecraft.block.Block)(net.minecraft.block.Block.a(((int)(forwardValue5458_50_1)))));
    }
    this.aM = ((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("shake"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5458_19(19643, (769612646716846336L ^ life2_3)))));
    spill5458_3 = this;
    spill5458_4 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("inGround")));
    if (!((life4_15 != null))) {
        forwardValue5458_72_0 = spill5458_3;
        forwardValue5458_72_1 = ((int)(spill5458_4));
        break forward_join_72;
    }
    if (!((spill5458_4 == 1))) {
        forwardValue5458_73_0 = spill5458_3;
        break forward_join_73;
    }
    forwardValue5458_72_0 = spill5458_3;
    forwardValue5458_72_1 = 1;
    }
    forwardValue5458_74_0 = forwardValue5458_72_0;
    forwardValue5458_74_1 = forwardValue5458_72_1;
    break forward_join_74;
    }
    forwardValue5458_74_0 = forwardValue5458_73_0;
    forwardValue5458_74_1 = 0;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(forwardValue5458_74_0)).aL = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5458_74_1)));
    return;
}


public void f__Void() {
net.minecraft.entity.player.EntityPlayer forwardValue5460_15_0;
    int[] spill5460_0;
    net.minecraft.entity.player.EntityPlayer spill5460_1;
    long life1_3;
    int[] life3_7;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 19943341621236L);
    spill5460_0 = moom.h1.a__ArrayInt();
    super.f__Void();
    life3_7 = spill5460_0;
    spill5460_1 = this.aN;
    if (!((life3_7 != null))) {
        forwardValue5460_15_0 = spill5460_1;
        break forward_join_15;
    }
    if (!((spill5460_1 != null))) {
        break forward_join_17;
    }
    forwardValue5460_15_0 = this.aN;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue5460_15_0)).cc = ((net.minecraft.entity.projectile.EntityFishHook)(null));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5459_38_0;
    java.lang.String forwardValue5459_38_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5459_39_0;
    java.lang.String forwardValue5459_39_1;
    moom.DD forwardValue5459_39_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5459_40_0;
    java.lang.String forwardValue5459_40_1;
    java.lang.String forwardValue5459_40_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5459_55_0;
    java.lang.String forwardValue5459_55_1;
    int forwardValue5459_55_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5459_56_0;
    java.lang.String forwardValue5459_56_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5459_57_0;
    java.lang.String forwardValue5459_57_1;
    int forwardValue5459_57_2;
    int[] spill5459_0;
    net.minecraft.nbt.NBTTagCompound spill5459_1;
    java.lang.String spill5459_2;
    moom.DD spill5459_3;
    net.minecraft.nbt.NBTTagCompound spill5459_4;
    java.lang.String spill5459_5;
    boolean spill5459_6;
    long life2_3;
    int[] life4_23;
    moom.DD life5_29;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    life2_3 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 60884835356497L);
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("xTile")), ((short)(((short) this.aH))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("yTile")), ((short)(((short) this.aI))));
    spill5459_0 = moom.h1.a__ArrayInt();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("zTile")), ((short)(((short) this.aJ))));
    life4_23 = spill5459_0;
    life5_29 = ((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(this.aK)))));
    spill5459_1 = p0;
    spill5459_2 = "inTile";
    spill5459_3 = life5_29;
    if (!((life4_23 != null))) {
        forwardValue5459_39_0 = spill5459_1;
        forwardValue5459_39_1 = spill5459_2;
        forwardValue5459_39_2 = spill5459_3;
        break forward_join_39;
    }
    if (!((spill5459_3 == null))) {
        forwardValue5459_38_0 = spill5459_1;
        forwardValue5459_38_1 = spill5459_2;
        break forward_join_38;
    }
    forwardValue5459_40_0 = spill5459_1;
    forwardValue5459_40_1 = spill5459_2;
    forwardValue5459_40_2 = "";
    break forward_join_40;
    }
    forwardValue5459_39_0 = forwardValue5459_38_0;
    forwardValue5459_39_1 = forwardValue5459_38_1;
    forwardValue5459_39_2 = life5_29;
    }
    forwardValue5459_40_0 = forwardValue5459_39_0;
    forwardValue5459_40_1 = forwardValue5459_39_1;
    forwardValue5459_40_2 = ((moom.DD)(forwardValue5459_39_2)).toString();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5459_40_0)).a(((java.lang.String)(forwardValue5459_40_1)), ((java.lang.String)(forwardValue5459_40_2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("shake")), ((byte)(((byte) this.aM))));
    spill5459_4 = p0;
    spill5459_5 = "inGround";
    spill5459_6 = this.aL;
    if (!((life4_23 != null))) {
        forwardValue5459_55_0 = spill5459_4;
        forwardValue5459_55_1 = spill5459_5;
        forwardValue5459_55_2 = ((spill5459_6) ? 1 : 0);
        break forward_join_55;
    }
    if (!(spill5459_6)) {
        forwardValue5459_56_0 = spill5459_4;
        forwardValue5459_56_1 = spill5459_5;
        break forward_join_56;
    }
    forwardValue5459_55_0 = spill5459_4;
    forwardValue5459_55_1 = spill5459_5;
    forwardValue5459_55_2 = 1;
    }
    forwardValue5459_57_0 = forwardValue5459_55_0;
    forwardValue5459_57_1 = forwardValue5459_55_1;
    forwardValue5459_57_2 = forwardValue5459_55_2;
    break forward_join_57;
    }
    forwardValue5459_57_0 = forwardValue5459_56_0;
    forwardValue5459_57_1 = forwardValue5459_56_1;
    forwardValue5459_57_2 = 0;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5459_57_0)).a(((java.lang.String)(forwardValue5459_57_1)), ((byte)(((byte) forwardValue5459_57_2))));
    return;
}


protected void d__Void() {
return;
}


public void d(double p0, double p1, double p2) {
net.minecraft.entity.projectile.EntityFishHook __sourceSpill851_0 = this;
    net.minecraft.entity.projectile.EntityFishHook __stackOp851_1_0 = this;
    double __stackOp851_1_1 = p0;
    double __sourceSpill851_3 = __stackOp851_1_1;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp851_1_0)).t = ((double)(__stackOp851_1_1));
    ((net.minecraft.entity.projectile.EntityFishHook)(__sourceSpill851_0)).a1 = ((double)(__sourceSpill851_3));
    net.minecraft.entity.projectile.EntityFishHook __sourceSpill851_5 = this;
    net.minecraft.entity.projectile.EntityFishHook __stackOp851_6_0 = this;
    double __stackOp851_6_1 = p1;
    double __sourceSpill851_8 = __stackOp851_6_1;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp851_6_0)).u = ((double)(__stackOp851_6_1));
    ((net.minecraft.entity.projectile.EntityFishHook)(__sourceSpill851_5)).a2 = ((double)(__sourceSpill851_8));
    net.minecraft.entity.projectile.EntityFishHook __sourceSpill851_10 = this;
    net.minecraft.entity.projectile.EntityFishHook __stackOp851_11_0 = this;
    double __stackOp851_11_1 = p2;
    double __sourceSpill851_13 = __stackOp851_11_1;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp851_11_0)).v = ((double)(__stackOp851_11_1));
    ((net.minecraft.entity.projectile.EntityFishHook)(__sourceSpill851_10)).a3 = ((double)(__sourceSpill851_13));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.util.List<moom.D6> a__List() {
return net.minecraft.entity.projectile.EntityFishHook.aG;
}


public boolean a(double p0) {
int forwardValue5456_28_0;
    int forwardValue5456_32_0;
    int forwardValue5456_34_0;
    int[] spill5456_0;
    boolean spill5456_1;
    long life3_3;
    double life6_10;
    int[] life5_11;
    double life6_25;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    life3_3 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 100186028073079L);
    spill5456_0 = moom.h1.a__ArrayInt();
    life6_10 = (((moom.CA)(((net.minecraft.entity.projectile.EntityFishHook)(this)).b())).a() * 0x1.0p2d);
    life5_11 = spill5456_0;
    spill5456_1 = java.lang.Double.isNaN(((double)(life6_10)));
    if (!((life5_11 != null))) {
        forwardValue5456_28_0 = ((spill5456_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill5456_1)) {
        break forward_join_19;
    }
    life6_10 = 0x1.0p2d;
    }
    life6_25 = (life6_10 * 0x1.0p6d);
    forwardValue5456_28_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)((life6_25 * life6_25))));
    }
    if (!((life5_11 != null))) {
        forwardValue5456_32_0 = forwardValue5456_28_0;
        break forward_join_32;
    }
    if (!((forwardValue5456_28_0 < 0))) {
        break forward_join_33;
    }
    forwardValue5456_32_0 = 1;
    }
    forwardValue5456_34_0 = forwardValue5456_32_0;
    break forward_join_34;
    }
    forwardValue5456_34_0 = 0;
    }
    return ((forwardValue5456_34_0) != 0);
}


public void a(double p0, double p1, double p2, float p3, float p4) {
float local9_life1 = moom.Dr.a__Float(((double)((((p0 * p0) + (p1 * p1)) + (p2 * p2)))));
    p0 = (p0 / ((double) local9_life1));
    p1 = (p1 / ((double) local9_life1));
    p2 = (p2 / ((double) local9_life1));
    p0 = (p0 + ((((java.util.Random)(this.ah)).nextGaussian() * 0x1.eb851e0000000p-8D) * ((double) p4)));
    p1 = (p1 + ((((java.util.Random)(this.ah)).nextGaussian() * 0x1.eb851e0000000p-8D) * ((double) p4)));
    p2 = (p2 + ((((java.util.Random)(this.ah)).nextGaussian() * 0x1.eb851e0000000p-8D) * ((double) p4)));
    p0 = (p0 * ((double) p3));
    p1 = (p1 * ((double) p3));
    p2 = (p2 * ((double) p3));
    this.t = ((double)(p0));
    this.u = ((double)(p1));
    this.v = ((double)(p2));
    float local10_life15 = moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2)))));
    net.minecraft.entity.projectile.EntityFishHook __sourceSpill850_19 = this;
    net.minecraft.entity.projectile.EntityFishHook __stackOp850_20_0 = this;
    float __stackOp850_20_1 = ((float) ((moom.Dr.b(((double)(p0)), ((double)(p2))) * 0x1.6800000000000p+7D) / 0x1.921fb54442d18p+1D));
    float __sourceSpill850_22 = __stackOp850_20_1;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp850_20_0)).w = ((float)(__stackOp850_20_1));
    ((net.minecraft.entity.projectile.EntityFishHook)(__sourceSpill850_19)).y = ((float)(__sourceSpill850_22));
    net.minecraft.entity.projectile.EntityFishHook __sourceSpill850_27 = this;
    net.minecraft.entity.projectile.EntityFishHook __stackOp850_28_0 = this;
    float __stackOp850_28_1 = ((float) ((moom.Dr.b(((double)(p1)), ((double)(((double) local10_life15)))) * 0x1.6800000000000p+7D) / 0x1.921fb54442d18p+1D));
    float __sourceSpill850_30 = __stackOp850_28_1;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp850_28_0)).x = ((float)(__stackOp850_28_1));
    ((net.minecraft.entity.projectile.EntityFishHook)(__sourceSpill850_27)).z = ((float)(__sourceSpill850_30));
    this.aO = ((int)(0));
    return;
}


public int a() {
int forwardValue5455_15_0;
    net.minecraft.entity.projectile.EntityFishHook forwardValue5455_96_0;
    int forwardValue5455_215_0;
    int forwardValue5455_227_0;
    boolean spill5455_0;
    net.minecraft.entity.projectile.EntityFishHook spill5455_1;
    int spill5455_2;
    long life1_3;
    int[] life3_5;
    int life4_20;
    double life5_35;
    double life7_42;
    double life9_49;
    double life11_63;
    double life13_65;
    net.minecraft.entity.item.EntityItem life5_127;
    double life6_134;
    double life8_141;
    double life10_148;
    double life12_162;
    double life14_164;
    forward_join_227: {
    forward_join_220: {
    forward_join_215: {
    forward_join_213: {
    forward_join_96: {
    forward_join_95: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 2654970081382L);
    life3_5 = moom.h1.a__ArrayInt();
    spill5455_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 != null))) {
        forwardValue5455_15_0 = ((spill5455_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill5455_0)) {
        break forward_join_14;
    }
    return 0;
    }
    forwardValue5455_15_0 = 0;
    }
    life4_20 = forwardValue5455_15_0;
    spill5455_1 = this;
    if (!((life3_5 != null))) {
        forwardValue5455_96_0 = spill5455_1;
        break forward_join_96;
    }
    if (!((((net.minecraft.entity.projectile.EntityFishHook)(spill5455_1)).aU != null))) {
        break forward_join_95;
    }
    life5_35 = (((net.minecraft.entity.player.EntityPlayer)(this.aN)).n - this.n);
    life7_42 = (((net.minecraft.entity.player.EntityPlayer)(this.aN)).o - this.o);
    life9_49 = (((net.minecraft.entity.player.EntityPlayer)(this.aN)).p - this.p);
    life11_63 = ((double) moom.Dr.a__Float(((double)((((life5_35 * life5_35) + (life7_42 * life7_42)) + (life9_49 * life9_49))))));
    life13_65 = 0x1.999999999999ap-4d;
    net.minecraft.entity.Entity __stackOp5455_17_0 = this.aU;
    ((net.minecraft.entity.Entity)(__stackOp5455_17_0)).t = ((double)((((net.minecraft.entity.Entity)(__stackOp5455_17_0)).t + (life5_35 * life13_65))));
    net.minecraft.entity.Entity __stackOp5455_21_0 = this.aU;
    ((net.minecraft.entity.Entity)(__stackOp5455_21_0)).u = ((double)((((net.minecraft.entity.Entity)(__stackOp5455_21_0)).u + ((life7_42 * life13_65) + (((double) moom.Dr.a__Float(((double)(life11_63)))) * 0x1.47ae147ae147bp-4d)))));
    net.minecraft.entity.Entity __stackOp5455_26_0 = this.aU;
    ((net.minecraft.entity.Entity)(__stackOp5455_26_0)).v = ((double)((((net.minecraft.entity.Entity)(__stackOp5455_26_0)).v + (life9_49 * life13_65))));
    life4_20 = 3;
    if (!((life3_5 == null))) {
        break forward_join_213;
    }
    }
    forwardValue5455_96_0 = this;
    }
    spill5455_2 = ((net.minecraft.entity.projectile.EntityFishHook)(forwardValue5455_96_0)).aQ;
    if (!((life3_5 != null))) {
        forwardValue5455_215_0 = spill5455_2;
        break forward_join_215;
    }
    if (!((spill5455_2 > 0))) {
        break forward_join_213;
    }
    life5_127 = new net.minecraft.entity.item.EntityItem(this.i, this.n, this.o, this.p, ((net.minecraft.entity.projectile.EntityFishHook)(this)).a__xW());
    life6_134 = (((net.minecraft.entity.player.EntityPlayer)(this.aN)).n - this.n);
    life8_141 = (((net.minecraft.entity.player.EntityPlayer)(this.aN)).o - this.o);
    life10_148 = (((net.minecraft.entity.player.EntityPlayer)(this.aN)).p - this.p);
    life12_162 = ((double) moom.Dr.a__Float(((double)((((life6_134 * life6_134) + (life8_141 * life8_141)) + (life10_148 * life10_148))))));
    life14_164 = 0x1.999999999999ap-4d;
    ((net.minecraft.entity.item.EntityItem)(life5_127)).t = ((double)((life6_134 * life14_164)));
    ((net.minecraft.entity.item.EntityItem)(life5_127)).u = ((double)(((life8_141 * life14_164) + (((double) moom.Dr.a__Float(((double)(life12_162)))) * 0x1.47ae147ae147bp-4d))));
    ((net.minecraft.entity.item.EntityItem)(life5_127)).v = ((double)((life10_148 * life14_164)));
    ((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life5_127)));
    ((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(this.aN)).i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(((net.minecraft.entity.player.EntityPlayer)(this.aN)).i, ((net.minecraft.entity.player.EntityPlayer)(this.aN)).n, (((net.minecraft.entity.player.EntityPlayer)(this.aN)).o + 0x1.0p-1d), (((net.minecraft.entity.player.EntityPlayer)(this.aN)).p + 0x1.0p-1d), (((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_8aebf151eadb_invokedynamic5455_62(2954, (3056675771711214088L ^ life1_3))))) + 1)))));
    life4_20 = 1;
    }
    forwardValue5455_215_0 = ((this.aL) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue5455_227_0 = forwardValue5455_215_0;
        break forward_join_227;
    }
    if (!((forwardValue5455_215_0 != 0))) {
        break forward_join_220;
    }
    life4_20 = 2;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).f__Void();
    ((net.minecraft.entity.player.EntityPlayer)(this.aN)).cc = ((net.minecraft.entity.projectile.EntityFishHook)(null));
    forwardValue5455_227_0 = life4_20;
    }
    return forwardValue5455_227_0;
}


private net.minecraft.item.ItemStack a__xW() {
int forwardValue5457_81_0;
    float forwardValue5457_97_0;
    float forwardValue5457_97_1;
    int[] spill5457_0;
    int spill5457_1;
    float spill5457_2;
    float spill5457_3;
    long life1_3;
    float life4_8;
    int life5_13;
    int life6_17;
    float life7_29;
    float life8_41;
    float life7_46;
    int[] life3_47;
    float life8_52;
    float life9_108;
    forward_join_97: {
    forward_join_95: {
    forward_join_81: {
    forward_join_72: {
    life1_3 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 38815358224447L);
    life4_8 = ((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextFloat();
    spill5457_0 = moom.h1.a__ArrayInt();
    life5_13 = moom.rV.e(((net.minecraft.entity.EntityLivingBase)(this.aN)));
    life6_17 = moom.rV.f(((net.minecraft.entity.EntityLivingBase)(this.aN)));
    life7_29 = ((0x1.99999ap-4f - (((float) life5_13) * 0x1.99999ap-6f)) - (((float) life6_17) * 0x1.47ae14p-7f));
    life8_41 = ((0x1.99999ap-5f + (((float) life5_13) * 0x1.47ae14p-7f)) - (((float) life6_17) * 0x1.47ae14p-7f));
    life7_46 = moom.Dr.a(((float)(life7_29)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life3_47 = spill5457_0;
    life8_52 = moom.Dr.a(((float)(life8_41)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    spill5457_1 = recovery.source.CarrierOps.fcmpg(((float)(life4_8)), ((float)(life7_46)));
    if (!((life3_47 != null))) {
        forwardValue5457_81_0 = spill5457_1;
        break forward_join_81;
    }
    if (!((spill5457_1 < 0))) {
        break forward_join_72;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this.aN)).a(((moom.BY)(net.minecraft.stats.StatList.D)));
    return ((moom.D6)(((moom.D6)(moom.D0.a(((java.util.Random)(this.ah)), ((java.util.Collection)(net.minecraft.entity.projectile.EntityFishHook.aE))))))).a(((java.util.Random)(this.ah)));
    }
    life4_8 = (life4_8 - life7_46);
    spill5457_2 = life4_8;
    spill5457_3 = life8_52;
    if (!((life3_47 != null))) {
        forwardValue5457_97_0 = spill5457_2;
        forwardValue5457_97_1 = spill5457_3;
        break forward_join_97;
    }
    forwardValue5457_81_0 = recovery.source.CarrierOps.fcmpg(((float)(spill5457_2)), ((float)(spill5457_3)));
    }
    if (!((forwardValue5457_81_0 < 0))) {
        break forward_join_95;
    }
    ((net.minecraft.entity.player.EntityPlayer)(this.aN)).a(((moom.BY)(net.minecraft.stats.StatList.E)));
    return ((moom.D6)(((moom.D6)(moom.D0.a(((java.util.Random)(this.ah)), ((java.util.Collection)(net.minecraft.entity.projectile.EntityFishHook.aF))))))).a(((java.util.Random)(this.ah)));
    }
    forwardValue5457_97_0 = life4_8;
    forwardValue5457_97_1 = life8_52;
    }
    life9_108 = (forwardValue5457_97_0 - forwardValue5457_97_1);
    ((net.minecraft.entity.player.EntityPlayer)(this.aN)).a(((moom.BY)(net.minecraft.stats.StatList.C)));
    return ((moom.D6)(((moom.D6)(moom.D0.a(((java.util.Random)(this.ah)), ((java.util.Collection)(net.minecraft.entity.projectile.EntityFishHook.aG))))))).a(((java.util.Random)(this.ah)));
}


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) {
this.aW = ((double)(p0));
    this.aX = ((double)(p1));
    this.aY = ((double)(p2));
    this.aZ = ((double)(((double) p3)));
    this.a0 = ((double)(((double) p4)));
    this.aV = ((int)(p5));
    this.t = ((double)(this.a1));
    this.u = ((double)(this.a2));
    this.v = ((double)(this.a3));
    return;
}


public void g__Void() {
int lexicalValue1625_111_0;
    net.minecraft.item.ItemStack lexicalValue1625_135_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1625_151_0;
    net.minecraft.entity.Entity lexicalValue1625_158_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_192_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_195_0;
    int lexicalValue1625_196_0;
    int lexicalValue1625_209_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_245_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_287_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_292_0;
    moom.DR lexicalValue1625_377_0;
    net.minecraft.entity.Entity lexicalValue1625_418_0;
    double lexicalValue1625_464_0;
    net.minecraft.util.MovingObjectPosition lexicalValue1625_479_0;
    net.minecraft.entity.Entity lexicalValue1625_485_0;
    int lexicalValue1625_507_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_517_0;
    int lexicalValue1625_658_0;
    int lexicalValue1625_664_0;
    int lexicalValue1625_742_0;
    int lexicalValue1625_750_0;
    int lexicalValue1625_785_0;
    int lexicalValue1625_798_0;
    int lexicalValue1625_822_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_949_0;
    net.minecraft.block.Block lexicalValue1625_1013_0;
    float lexicalValue1625_1042_0;
    float lexicalValue1625_1042_1;
    int lexicalValue1625_1086_0;
    int lexicalValue1625_1130_0;
    int lexicalValue1625_1130_1;
    int lexicalValue1625_1160_0;
    int lexicalValue1625_1160_1;
    int lexicalValue1625_1182_0;
    net.minecraft.block.Block lexicalValue1625_1251_0;
    int lexicalValue1625_1275_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_1284_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_1316_0;
    int lexicalValue1625_1335_0;
    net.minecraft.entity.projectile.EntityFishHook lexicalValue1625_1337_0;
    double lexicalValue1625_1359_0;
    double lexicalValue1625_1359_1;
    int[] spill1625_0;
    int spill1625_1;
    net.minecraft.entity.player.EntityPlayer spill1625_2;
    net.minecraft.entity.player.EntityPlayer spill1625_3;
    net.minecraft.item.ItemStack spill1625_4;
    net.minecraft.entity.projectile.EntityFishHook spill1625_5;
    net.minecraft.entity.projectile.EntityFishHook spill1625_6;
    net.minecraft.entity.projectile.EntityFishHook spill1625_7;
    net.minecraft.entity.projectile.EntityFishHook spill1625_8;
    net.minecraft.entity.projectile.EntityFishHook spill1625_9;
    net.minecraft.entity.projectile.EntityFishHook spill1625_10;
    moom.DR spill1625_11;
    net.minecraft.entity.Entity spill1625_12;
    boolean spill1625_13;
    double spill1625_14;
    double spill1625_15;
    net.minecraft.util.MovingObjectPosition spill1625_16;
    net.minecraft.entity.Entity spill1625_17;
    boolean spill1625_18;
    net.minecraft.entity.projectile.EntityFishHook spill1625_19;
    boolean spill1625_20;
    boolean spill1625_21;
    double spill1625_22;
    double spill1625_23;
    int spill1625_24;
    boolean spill1625_25;
    boolean spill1625_26;
    int spill1625_27;
    net.minecraft.entity.projectile.EntityFishHook spill1625_28;
    net.minecraft.block.Block spill1625_29;
    float spill1625_30;
    float spill1625_31;
    net.minecraft.entity.projectile.EntityFishHook spill1625_32;
    int spill1625_33;
    int spill1625_34;
    int spill1625_35;
    net.minecraft.block.Block spill1625_36;
    net.minecraft.entity.projectile.EntityFishHook spill1625_37;
    net.minecraft.entity.projectile.EntityFishHook spill1625_38;
    long life1_3;
    int[] life3_7;
    double life4_28;
    double life6_41;
    double life8_54;
    double life10_62;
    net.minecraft.item.ItemStack life4_126;
    double life5_216;
    moom.DR life4_375;
    moom.DR life5_394;
    net.minecraft.util.MovingObjectPosition life6_400;
    moom.DR life4_410;
    moom.DR life5_431;
    net.minecraft.entity.Entity life7_451;
    java.util.List life8_469;
    double life9_471;
    java.util.Iterator life11_474;
    net.minecraft.entity.Entity life12_481;
    float life13_507;
    moom.CA life14_517;
    net.minecraft.util.MovingObjectPosition life15_522;
    double life16_529;
    float life11_642;
    float life12_782;
    int life13_805;
    double life14_807;
    int life16_809;
    moom.CA life17_815;
    double life18_821;
    double life20_832;
    double life22_845;
    moom.CA life24_859;
    net.minecraft.world.WorldServer life16_910;
    int life17_912;
    moom.DT life18_918;
    float life19_1060;
    float life19_1153;
    float life20_1156;
    float life21_1159;
    double life22_1171;
    double life24_1180;
    double life26_1192;
    net.minecraft.block.Block life28_1207;
    float life29_1259;
    float life30_1263;
    float life19_1316;
    float life20_1432;
    float life21_1438;
    double life22_1449;
    double life24_1458;
    double life26_1469;
    net.minecraft.block.Block life28_1484;
    double life16_1621;
    lexical_join_1416: {
    lexical_join_1408: {
    lexical_join_1387: {
    lexical_join_1359: {
    lexical_join_1355: {
    lexical_join_1337: {
    lexical_join_1335: {
    lexical_join_1331: {
    lexical_join_1316: {
    lexical_join_1300: {
    lexical_join_1298: {
    lexical_join_1284: {
    lexical_join_1275: {
    lexical_join_1271: {
    lexical_join_1253: {
    lexical_join_1251: {
    lexical_join_1182: {
    lexical_join_1177: {
    lexical_join_1160: {
    lexical_join_1151: {
    lexical_join_1130: {
    lexical_join_1123: {
    lexical_join_1086: {
    lexical_join_1082: {
    lexical_join_1080: {
    lexical_join_1042: {
    lexical_join_1040: {
    lexical_join_1015: {
    lexical_join_1013: {
    lexical_join_949: {
    lexical_join_936: {
    lexical_join_822: {
    lexical_join_820: {
    lexical_join_798: {
    lexical_join_796: {
    lexical_join_785: {
    lexical_join_780: {
    lexical_join_750: {
    lexical_join_742: {
    lexical_join_739: {
    lexical_join_664: {
    lexical_join_663: {
    lexical_join_661: {
    lexical_join_658: {
    lexical_join_649: {
    lexical_join_625: {
    lexical_join_607: {
    lexical_join_589: {
    lexical_join_571: {
    lexical_join_517: {
    lexical_join_507: {
    lexical_join_503: {
    lexical_join_500: {
    lexical_join_485: {
    lexical_join_479: {
    lexical_join_474: {
    lexical_join_467: {
    lexical_join_378: {
    lexical_join_377: {
    lexical_join_297: {
    lexical_join_292: {
    lexical_join_291: {
    lexical_join_287: {
    lexical_join_247: {
    lexical_join_246: {
    lexical_join_245: {
    lexical_join_209: {
    lexical_join_205: {
    lexical_join_196: {
    lexical_join_195: {
    lexical_join_194: {
    lexical_join_192: {
    lexical_join_191: {
    lexical_join_158: {
    lexical_join_154: {
    lexical_join_151: {
    lexical_join_147: {
    lexical_join_135: {
    lexical_join_111: {
    lexical_join_108: {
    life1_3 = (net.minecraft.entity.projectile.EntityFishHook.bb ^ 69030414367534L);
    spill1625_0 = moom.h1.a__ArrayInt();
    super.g__Void();
    life3_7 = spill1625_0;
    spill1625_1 = this.aV;
    if (!((life3_7 != null))) {
        lexicalValue1625_111_0 = spill1625_1;
        break lexical_join_111;
    }
    if (!((spill1625_1 > 0))) {
        break lexical_join_108;
    }
    life4_28 = (this.n + ((this.aW - this.n) / ((double) this.aV)));
    life6_41 = (this.o + ((this.aX - this.o) / ((double) this.aV)));
    life8_54 = (this.p + ((this.aY - this.p) / ((double) this.aV)));
    life10_62 = moom.Dr.a(((double)((this.aZ - ((double) this.w)))));
    this.w = ((float)(((float) (((double) this.w) + (life10_62 / ((double) this.aV))))));
    this.x = ((float)(((float) (((double) this.x) + ((this.a0 - ((double) this.x)) / ((double) this.aV))))));
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_27_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_27_0)).aV = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_27_0)).aV - 1)));
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).a__Void(((double)(life4_28)), ((double)(life6_41)), ((double)(life8_54)));
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).b(((float)(this.w)), ((float)(this.x)));
    if (!((life3_7 == null))) {
        break lexical_join_1416;
    }
    }
    lexicalValue1625_111_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_196_0 = lexicalValue1625_111_0;
        break lexical_join_196;
    }
    if (!((lexicalValue1625_111_0 == 0))) {
        break lexical_join_194;
    }
    life4_126 = ((net.minecraft.entity.player.EntityPlayer)(this.aN)).c__xW();
    spill1625_2 = this.aN;
    if (!((life3_7 != null))) {
        lexicalValue1625_151_0 = spill1625_2;
        break lexical_join_151;
    }
    if (!((!((net.minecraft.entity.player.EntityPlayer)(spill1625_2)).F))) {
        break lexical_join_147;
    }
    spill1625_3 = this.aN;
    if (!((life3_7 != null))) {
        lexicalValue1625_151_0 = spill1625_3;
        break lexical_join_151;
    }
    if (!(((net.minecraft.entity.player.EntityPlayer)(spill1625_3)).p__Boolean())) {
        break lexical_join_147;
    }
    spill1625_4 = life4_126;
    if (!((life3_7 != null))) {
        lexicalValue1625_135_0 = spill1625_4;
        break lexical_join_135;
    }
    if (!((spill1625_4 != null))) {
        break lexical_join_147;
    }
    lexicalValue1625_135_0 = life4_126;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1625_135_0)).a__wQ() == net.minecraft.init.Items.aR))) {
        break lexical_join_147;
    }
    spill1625_5 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_158_0 = spill1625_5;
        break lexical_join_158;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.projectile.EntityFishHook)(spill1625_5)).a(((net.minecraft.entity.Entity)(this.aN))))), ((double)(0x1.0p10d))) > 0))) {
        break lexical_join_154;
    }
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).f__Void();
    lexicalValue1625_151_0 = this.aN;
    }
    ((net.minecraft.entity.player.EntityPlayer)(lexicalValue1625_151_0)).cc = ((net.minecraft.entity.projectile.EntityFishHook)(null));
    return;
    }
    spill1625_6 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_195_0 = spill1625_6;
        break lexical_join_195;
    }
    lexicalValue1625_158_0 = ((net.minecraft.entity.projectile.EntityFishHook)(spill1625_6)).aU;
    }
    if (!((lexicalValue1625_158_0 != null))) {
        break lexical_join_194;
    }
    spill1625_7 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_192_0 = spill1625_7;
        break lexical_join_192;
    }
    if (!((!((net.minecraft.entity.Entity)(((net.minecraft.entity.projectile.EntityFishHook)(spill1625_7)).aU)).F))) {
        break lexical_join_191;
    }
    this.n = ((double)(((net.minecraft.entity.Entity)(this.aU)).n));
    life5_216 = ((double) ((net.minecraft.entity.Entity)(this.aU)).H);
    this.o = ((double)((((moom.CA)(((net.minecraft.entity.Entity)(this.aU)).b())).c + (life5_216 * 0x1.999999999999ap-1d))));
    this.p = ((double)(((net.minecraft.entity.Entity)(this.aU)).p));
    return;
    }
    lexicalValue1625_192_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(lexicalValue1625_192_0)).aU = ((net.minecraft.entity.Entity)(null));
    }
    lexicalValue1625_195_0 = this;
    }
    lexicalValue1625_196_0 = ((net.minecraft.entity.projectile.EntityFishHook)(lexicalValue1625_195_0)).aM;
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_209_0 = lexicalValue1625_196_0;
        break lexical_join_209;
    }
    if (!((lexicalValue1625_196_0 > 0))) {
        break lexical_join_205;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_68_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_68_0)).aM = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_68_0)).aM - 1)));
    }
    spill1625_8 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_292_0 = spill1625_8;
        break lexical_join_292;
    }
    lexicalValue1625_209_0 = ((((net.minecraft.entity.projectile.EntityFishHook)(spill1625_8)).aL) ? 1 : 0);
    }
    if (!((lexicalValue1625_209_0 != 0))) {
        break lexical_join_291;
    }
    spill1625_9 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_287_0 = spill1625_9;
        break lexical_join_287;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.projectile.EntityFishHook)(spill1625_9)).i)).a__fE(((moom.DT)(new moom.DT(this.aH, this.aI, this.aJ)))))).a__ch() == this.aK))) {
        break lexical_join_247;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_80_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_80_0)).aO = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_80_0)).aO + 1)));
    spill1625_10 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_245_0 = spill1625_10;
        break lexical_join_245;
    }
    if (!((((net.minecraft.entity.projectile.EntityFishHook)(spill1625_10)).aO == __sourceIntrinsic_736a66cda11e_invokedynamic1625_84(30983, (6467415769345059804L ^ life1_3))))) {
        break lexical_join_246;
    }
    lexicalValue1625_245_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(lexicalValue1625_245_0)).f__Void();
    }
    return;
    }
    this.aL = ((boolean)(false));
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_87_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_87_0)).t = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_87_0)).t * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_92_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_92_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_92_0)).u * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_97_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_97_0)).v = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_97_0)).v * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    this.aO = ((int)(0));
    lexicalValue1625_287_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(lexicalValue1625_287_0)).aP = ((int)(0));
    if (!((life3_7 == null))) {
        break lexical_join_297;
    }
    }
    lexicalValue1625_292_0 = this;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_104_0 = lexicalValue1625_292_0;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_104_0)).aP = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_104_0)).aP + 1)));
    }
    life4_375 = new moom.DR(this.n, this.o, this.p);
    life5_394 = new moom.DR((this.n + this.t), (this.o + this.u), (this.p + this.v));
    life6_400 = ((net.minecraft.world.World)(this.i)).a(((moom.DR)(life4_375)), ((moom.DR)(life5_394)));
    life4_410 = new moom.DR(this.n, this.o, this.p);
    spill1625_11 = new moom.DR((this.n + this.t), (this.o + this.u), (this.p + this.v));
    if (!((life3_7 != null))) {
        lexicalValue1625_377_0 = spill1625_11;
        break lexical_join_377;
    }
    life5_431 = spill1625_11;
    if (!((life6_400 != null))) {
        break lexical_join_378;
    }
    lexicalValue1625_377_0 = new moom.DR(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life6_400)).d)).a, ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life6_400)).d)).b, ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life6_400)).d)).c);
    }
    life5_431 = lexicalValue1625_377_0;
    }
    life7_451 = null;
    life8_469 = ((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((moom.CA)(((net.minecraft.entity.projectile.EntityFishHook)(this)).b())).a(((double)(this.t)), ((double)(this.u)), ((double)(this.v))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(0x1.0p0d))))));
    life9_471 = 0x0.0p0d;
    life11_474 = ((java.util.List)(life8_469)).iterator();
    lexical_cycle_403: while (true) {
    lexical_join_465: {
    lexical_join_464: {
    lexical_join_461: {
    lexical_join_425: {
    lexical_join_418: {
    if (!(((java.util.Iterator)(life11_474)).hasNext())) {
        break lexical_join_467;
    }
    life12_481 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life11_474)).next()));
    spill1625_12 = life12_481;
    if (!((life3_7 != null))) {
        lexicalValue1625_418_0 = spill1625_12;
        break lexical_join_418;
    }
    spill1625_13 = ((net.minecraft.entity.Entity)(spill1625_12)).m__Boolean();
    if (!((life3_7 != null))) {
        lexicalValue1625_507_0 = ((spill1625_13) ? 1 : 0);
        break lexical_join_507;
    }
    if (!(spill1625_13)) {
        break lexical_join_465;
    }
    lexicalValue1625_418_0 = life12_481;
    }
    if (!((lexicalValue1625_418_0 == this.aN))) {
        break lexical_join_425;
    }
    if (!((this.aP >= 5))) {
        break lexical_join_465;
    }
    }
    life13_507 = 0x1.333334p-2f;
    life14_517 = ((moom.CA)(((net.minecraft.entity.Entity)(life12_481)).b())).b(((double)(((double) life13_507))), ((double)(((double) life13_507))), ((double)(((double) life13_507))));
    life15_522 = ((moom.CA)(life14_517)).a(((moom.DR)(life4_410)), ((moom.DR)(life5_431)));
    if (!((life15_522 != null))) {
        break lexical_join_465;
    }
    life16_529 = ((moom.DR)(life4_410)).c(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life15_522)).d)));
    spill1625_14 = life16_529;
    if (!((life3_7 != null))) {
        lexicalValue1625_464_0 = spill1625_14;
        break lexical_join_464;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1625_14)), ((double)(life9_471))) >= 0))) {
        break lexical_join_461;
    }
    spill1625_15 = life9_471;
    if (!((life3_7 != null))) {
        lexicalValue1625_464_0 = spill1625_15;
        break lexical_join_464;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1625_15)), ((double)(0x0.0p0d))) == 0))) {
        break lexical_join_465;
    }
    }
    life7_451 = life12_481;
    lexicalValue1625_464_0 = life16_529;
    }
    life9_471 = lexicalValue1625_464_0;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_403; }
    break lexical_cycle_403;
    }
    }
    if (!((life7_451 != null))) {
        break lexical_join_474;
    }
    life6_400 = new net.minecraft.util.MovingObjectPosition(life7_451);
    }
    spill1625_16 = life6_400;
    if (!((life3_7 != null))) {
        lexicalValue1625_479_0 = spill1625_16;
        break lexical_join_479;
    }
    if (!((spill1625_16 != null))) {
        break lexical_join_503;
    }
    lexicalValue1625_479_0 = life6_400;
    }
    spill1625_17 = ((net.minecraft.util.MovingObjectPosition)(lexicalValue1625_479_0)).e;
    if (!((life3_7 != null))) {
        lexicalValue1625_485_0 = spill1625_17;
        break lexical_join_485;
    }
    if (!((spill1625_17 != null))) {
        break lexical_join_500;
    }
    lexicalValue1625_485_0 = ((net.minecraft.util.MovingObjectPosition)(life6_400)).e;
    }
    spill1625_18 = ((net.minecraft.entity.Entity)(lexicalValue1625_485_0)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.a(((net.minecraft.entity.Entity)(this)), ((net.minecraft.entity.Entity)(this.aN))))), ((float)(0x0.0p0f)));
    if (!((life3_7 != null))) {
        lexicalValue1625_507_0 = ((spill1625_18) ? 1 : 0);
        break lexical_join_507;
    }
    if (!(spill1625_18)) {
        break lexical_join_503;
    }
    this.aU = ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(life6_400)).e));
    if (!((life3_7 == null))) {
        break lexical_join_503;
    }
    }
    this.aL = ((boolean)(true));
    }
    spill1625_19 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_517_0 = spill1625_19;
        break lexical_join_517;
    }
    lexicalValue1625_507_0 = ((((net.minecraft.entity.projectile.EntityFishHook)(spill1625_19)).aL) ? 1 : 0);
    }
    if (!((lexicalValue1625_507_0 == 0))) {
        break lexical_join_1416;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    lexicalValue1625_517_0 = this;
    }
    life11_642 = moom.Dr.a__Float(((double)(((((net.minecraft.entity.projectile.EntityFishHook)(lexicalValue1625_517_0)).t * this.t) + (this.v * this.v)))));
    this.w = ((float)(((float) ((moom.Dr.b(((double)(this.t)), ((double)(this.v))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    this.x = ((float)(((float) ((moom.Dr.b(((double)(this.u)), ((double)(((double) life11_642)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    lexical_cycle_553: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.x - this.z))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_571;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_186_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_186_0)).z = ((float)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_186_0)).z - 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break lexical_join_589;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_553; }
    break lexical_cycle_553;
    }
    }
    lexical_cycle_571: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.x - this.z))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_589;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_192_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_192_0)).z = ((float)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_192_0)).z + 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break lexical_join_607;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_571; }
    break lexical_cycle_571;
    }
    }
    lexical_cycle_589: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.w - this.y))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_607;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_198_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_198_0)).y = ((float)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_198_0)).y - 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break lexical_join_649;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_589; }
    break lexical_cycle_589;
    }
    }
    lexical_cycle_607: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.w - this.y))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_625;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_204_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_204_0)).y = ((float)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_204_0)).y + 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break lexical_join_649;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_607; }
    break lexical_cycle_607;
    }
    }
    this.x = ((float)((this.z + ((this.x - this.z) * 0x1.99999ap-3f))));
    this.w = ((float)((this.y + ((this.w - this.y) * 0x1.99999ap-3f))));
    }
    life12_782 = 0x1.d70a3ep-1f;
    spill1625_20 = this.A;
    if (!((life3_7 != null))) {
        lexicalValue1625_658_0 = ((spill1625_20) ? 1 : 0);
        break lexical_join_658;
    }
    if (!((!spill1625_20))) {
        break lexical_join_661;
    }
    lexicalValue1625_658_0 = ((this.B) ? 1 : 0);
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_664_0 = lexicalValue1625_658_0;
        break lexical_join_664;
    }
    if (!((lexicalValue1625_658_0 != 0))) {
        break lexical_join_663;
    }
    }
    life12_782 = 0x1.0p-1f;
    }
    lexicalValue1625_664_0 = 5;
    }
    life13_805 = lexicalValue1625_664_0;
    life14_807 = 0x0.0p0d;
    life16_809 = 0;
    lexical_cycle_669: while (true) {
    lexical_join_737: {
    lexical_join_736: {
    if (!((life16_809 < life13_805))) {
        break lexical_join_739;
    }
    life17_815 = ((net.minecraft.entity.projectile.EntityFishHook)(this)).b();
    life18_821 = (((moom.CA)(life17_815)).f - ((moom.CA)(life17_815)).c);
    life20_832 = (((moom.CA)(life17_815)).c + ((life18_821 * ((double) life16_809)) / ((double) life13_805)));
    life22_845 = (((moom.CA)(life17_815)).c + ((life18_821 * ((double) (life16_809 + 1))) / ((double) life13_805)));
    life24_859 = new moom.CA(((moom.CA)(life17_815)).b, life20_832, ((moom.CA)(life17_815)).d, ((moom.CA)(life17_815)).e, life22_845, ((moom.CA)(life17_815)).g);
    if (!((life3_7 != null))) {
        break lexical_join_737;
    }
    spill1625_21 = ((net.minecraft.world.World)(this.i)).b(((moom.CA)(life24_859)), ((moom.fn)(moom.fn.h)));
    if (!((life3_7 != null))) {
        lexicalValue1625_742_0 = ((spill1625_21) ? 1 : 0);
        break lexical_join_742;
    }
    if (!(spill1625_21)) {
        break lexical_join_736;
    }
    life14_807 = (life14_807 + (0x1.0p0d / ((double) life13_805)));
    }
    life16_809 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_669; }
    break lexical_cycle_669;
    }
    }
    lexicalValue1625_742_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_750_0 = lexicalValue1625_742_0;
        break lexical_join_750;
    }
    if (!((lexicalValue1625_742_0 == 0))) {
        break lexical_join_1355;
    }
    spill1625_22 = life14_807;
    spill1625_23 = 0x0.0p0d;
    if (!((life3_7 != null))) {
        lexicalValue1625_1359_0 = spill1625_22;
        lexicalValue1625_1359_1 = spill1625_23;
        break lexical_join_1359;
    }
    lexicalValue1625_750_0 = recovery.source.CarrierOps.dcmpl(((double)(spill1625_22)), ((double)(spill1625_23)));
    }
    if (!((lexicalValue1625_750_0 > 0))) {
        break lexical_join_1355;
    }
    life16_910 = ((net.minecraft.world.WorldServer)(this.i));
    life17_912 = 1;
    life18_918 = ((moom.DT)(new moom.DT(this))).a__DT();
    spill1625_24 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.0p-2f)));
    if (!((life3_7 != null))) {
        lexicalValue1625_785_0 = spill1625_24;
        break lexical_join_785;
    }
    if (!((spill1625_24 < 0))) {
        break lexical_join_780;
    }
    spill1625_25 = ((net.minecraft.world.World)(this.i)).m(((moom.DT)(life18_918)));
    if (!((life3_7 != null))) {
        lexicalValue1625_785_0 = ((spill1625_25) ? 1 : 0);
        break lexical_join_785;
    }
    if (!(spill1625_25)) {
        break lexical_join_780;
    }
    life17_912 = 2;
    }
    lexicalValue1625_785_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.0p-1f)));
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_798_0 = lexicalValue1625_785_0;
        break lexical_join_798;
    }
    if (!((lexicalValue1625_785_0 < 0))) {
        break lexical_join_796;
    }
    spill1625_26 = ((net.minecraft.world.World)(this.i)).e(((moom.DT)(life18_918)));
    if (!((life3_7 != null))) {
        lexicalValue1625_798_0 = ((spill1625_26) ? 1 : 0);
        break lexical_join_798;
    }
    if (!((!spill1625_26))) {
        break lexical_join_796;
    }
    life17_912 += -1;
    }
    lexicalValue1625_798_0 = this.aQ;
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_822_0 = lexicalValue1625_798_0;
        break lexical_join_822;
    }
    if (!((lexicalValue1625_798_0 > 0))) {
        break lexical_join_820;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_252_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_252_0)).aQ = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_252_0)).aQ - 1)));
    spill1625_27 = this.aQ;
    if (!((life3_7 != null))) {
        lexicalValue1625_1335_0 = spill1625_27;
        break lexical_join_1335;
    }
    if (!((spill1625_27 <= 0))) {
        break lexical_join_1331;
    }
    this.aR = ((int)(0));
    this.aS = ((int)(0));
    if (!((life3_7 == null))) {
        break lexical_join_1331;
    }
    }
    lexicalValue1625_822_0 = this.aS;
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_1086_0 = lexicalValue1625_822_0;
        break lexical_join_1086;
    }
    if (!((lexicalValue1625_822_0 > 0))) {
        break lexical_join_1082;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_259_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_259_0)).aS = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_259_0)).aS - life17_912)));
    spill1625_28 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_949_0 = spill1625_28;
        break lexical_join_949;
    }
    if (!((((net.minecraft.entity.projectile.EntityFishHook)(spill1625_28)).aS <= 0))) {
        break lexical_join_936;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_263_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_263_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_263_0)).u - 0x1.99999ap-3d)));
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).a(((java.lang.String)("random.splash")), ((float)(0x1.0p-2f)), ((float)((0x1.0p0f + ((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-2f)))));
    life19_1060 = ((float) moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.projectile.EntityFishHook)(this)).b())).c))));
    ((net.minecraft.world.WorldServer)(life16_910)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)(this.n)), ((double)(((double) (life19_1060 + 0x1.0p0f)))), ((double)(this.p)), ((int)(((int) (0x1.0p0f + (this.G * 0x1.4p4f))))), ((double)(((double) this.G))), ((double)(0x0.0p0d)), ((double)(((double) this.G))), ((double)(0x1.99999ap-3d)), ((int[])(new int[0])));
    ((net.minecraft.world.WorldServer)(life16_910)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_WAKE)), ((double)(this.n)), ((double)(((double) (life19_1060 + 0x1.0p0f)))), ((double)(this.p)), ((int)(((int) (0x1.0p0f + (this.G * 0x1.4p4f))))), ((double)(((double) this.G))), ((double)(0x0.0p0d)), ((double)(((double) this.G))), ((double)(0x1.99999ap-3d)), ((int[])(new int[0])));
    this.aQ = ((int)(moom.Dr.a(((java.util.Random)(this.ah)), ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1625_289(24431, (8622369301826456998L ^ life1_3)))), ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1625_290(24604, (4392351165427053265L ^ life1_3)))))));
    if (!((life3_7 == null))) {
        break lexical_join_1331;
    }
    }
    this.aT = ((float)(((float) (((double) this.aT) + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.0p2d)))));
    lexicalValue1625_949_0 = this;
    }
    life19_1153 = (((net.minecraft.entity.projectile.EntityFishHook)(lexicalValue1625_949_0)).aT * 0x1.1df46ap-6f);
    life20_1156 = moom.Dr.a(((float)(life19_1153)));
    life21_1159 = moom.Dr.b(((float)(life19_1153)));
    life22_1171 = (this.n + ((double) ((life20_1156 * ((float) this.aS)) * 0x1.99999ap-4f)));
    life24_1180 = ((double) (((float) moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.projectile.EntityFishHook)(this)).b())).c)))) + 0x1.0p0f));
    life26_1192 = (this.p + ((double) ((life21_1159 * ((float) this.aS)) * 0x1.99999ap-4f)));
    life28_1207 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(life16_910)).a__fE(((moom.DT)(new moom.DT(((int) life22_1171), (((int) life24_1180) - 1), ((int) life26_1192))))))).a__ch();
    spill1625_29 = life28_1207;
    if (!((life3_7 != null))) {
        lexicalValue1625_1013_0 = spill1625_29;
        break lexical_join_1013;
    }
    if (!((spill1625_29 != net.minecraft.init.Blocks.j))) {
        break lexical_join_1015;
    }
    lexicalValue1625_1013_0 = life28_1207;
    }
    if (!((lexicalValue1625_1013_0 == net.minecraft.init.Blocks.i))) {
        break lexical_join_1080;
    }
    }
    spill1625_30 = ((java.util.Random)(this.ah)).nextFloat();
    spill1625_31 = 0x1.333334p-3f;
    if (!((life3_7 != null))) {
        lexicalValue1625_1042_0 = spill1625_30;
        lexicalValue1625_1042_1 = spill1625_31;
        break lexical_join_1042;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill1625_30)), ((float)(spill1625_31))) < 0))) {
        break lexical_join_1040;
    }
    ((net.minecraft.world.WorldServer)(life16_910)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)(life22_1171)), ((double)((life24_1180 - 0x1.99999ap-4d))), ((double)(life26_1192)), ((int)(1)), ((double)(((double) life20_1156))), ((double)(0x1.999999999999ap-4d)), ((double)(((double) life21_1159))), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    lexicalValue1625_1042_0 = life20_1156;
    lexicalValue1625_1042_1 = 0x1.47ae14p-5f;
    }
    life29_1259 = (lexicalValue1625_1042_0 * lexicalValue1625_1042_1);
    life30_1263 = (life21_1159 * 0x1.47ae14p-5f);
    ((net.minecraft.world.WorldServer)(life16_910)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_WAKE)), ((double)(life22_1171)), ((double)(life24_1180)), ((double)(life26_1192)), ((int)(0)), ((double)(((double) life30_1263))), ((double)(0x1.47ae147ae147bp-7d)), ((double)(((double) (-life29_1259)))), ((double)(0x1.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.WorldServer)(life16_910)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_WAKE)), ((double)(life22_1171)), ((double)(life24_1180)), ((double)(life26_1192)), ((int)(0)), ((double)(((double) (-life30_1263)))), ((double)(0x1.47ae147ae147bp-7d)), ((double)(((double) life29_1259))), ((double)(0x1.0p0d)), ((int[])(new int[0])));
    }
    if (!((life3_7 == null))) {
        break lexical_join_1331;
    }
    }
    spill1625_32 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_1316_0 = spill1625_32;
        break lexical_join_1316;
    }
    lexicalValue1625_1086_0 = ((net.minecraft.entity.projectile.EntityFishHook)(spill1625_32)).aR;
    }
    if (!((lexicalValue1625_1086_0 > 0))) {
        break lexical_join_1300;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_321_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_321_0)).aR = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_321_0)).aR - life17_912)));
    life19_1316 = 0x1.333334p-3f;
    spill1625_33 = this.aR;
    spill1625_34 = __sourceIntrinsic_736a66cda11e_invokedynamic1625_325(31518, (7767329968056330688L ^ life1_3));
    if (!((life3_7 != null))) {
        lexicalValue1625_1130_0 = spill1625_33;
        lexicalValue1625_1130_1 = spill1625_34;
        break lexical_join_1130;
    }
    if (!((spill1625_33 < spill1625_34))) {
        break lexical_join_1123;
    }
    life19_1316 = ((float) (((double) life19_1316) + (((double) (__sourceIntrinsic_736a66cda11e_invokedynamic1625_326(5354, (1749794352431629874L ^ life1_3)) - this.aR)) * 0x1.999999999999ap-5d)));
    if (!((life3_7 == null))) {
        break lexical_join_1177;
    }
    }
    lexicalValue1625_1130_0 = this.aR;
    lexicalValue1625_1130_1 = __sourceIntrinsic_736a66cda11e_invokedynamic1625_329(4171, (1308531392631997071L ^ life1_3));
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_1160_0 = lexicalValue1625_1130_0;
        lexicalValue1625_1160_1 = lexicalValue1625_1130_1;
        break lexical_join_1160;
    }
    if (!((lexicalValue1625_1130_0 < lexicalValue1625_1130_1))) {
        break lexical_join_1151;
    }
    life19_1316 = ((float) (((double) life19_1316) + (((double) (__sourceIntrinsic_736a66cda11e_invokedynamic1625_330(12292, (1576833914145415882L ^ life1_3)) - this.aR)) * 0x1.47ae147ae147bp-6d)));
    if (!((life3_7 == null))) {
        break lexical_join_1177;
    }
    }
    spill1625_35 = this.aR;
    if (!((life3_7 != null))) {
        lexicalValue1625_1182_0 = spill1625_35;
        break lexical_join_1182;
    }
    lexicalValue1625_1160_0 = spill1625_35;
    lexicalValue1625_1160_1 = __sourceIntrinsic_736a66cda11e_invokedynamic1625_333(753, (3664707553444270132L ^ life1_3));
    }
    if (!((lexicalValue1625_1160_0 < lexicalValue1625_1160_1))) {
        break lexical_join_1177;
    }
    life19_1316 = ((float) (((double) life19_1316) + (((double) (__sourceIntrinsic_736a66cda11e_invokedynamic1625_334(753, (3664707553444270132L ^ life1_3)) - this.aR)) * 0x1.47ae147ae147bp-7d)));
    }
    lexicalValue1625_1182_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(life19_1316)));
    }
    if (!((life3_7 != null))) {
        lexicalValue1625_1275_0 = lexicalValue1625_1182_0;
        break lexical_join_1275;
    }
    if (!((lexicalValue1625_1182_0 < 0))) {
        break lexical_join_1271;
    }
    life20_1432 = (moom.Dr.a(((java.util.Random)(this.ah)), ((float)(0x0.0p0f)), ((float)(0x1.68p8f))) * 0x1.1df46ap-6f);
    life21_1438 = moom.Dr.a(((java.util.Random)(this.ah)), ((float)(0x1.9p4f)), ((float)(0x1.ep5f)));
    life22_1449 = (this.n + ((double) ((moom.Dr.a(((float)(life20_1432))) * life21_1438) * 0x1.99999ap-4f)));
    life24_1458 = ((double) (((float) moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.projectile.EntityFishHook)(this)).b())).c)))) + 0x1.0p0f));
    life26_1469 = (this.p + ((double) ((moom.Dr.b(((float)(life20_1432))) * life21_1438) * 0x1.99999ap-4f)));
    life28_1484 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.WorldServer)(life16_910)).a__fE(((moom.DT)(new moom.DT(((int) life22_1449), (((int) life24_1458) - 1), ((int) life26_1469))))))).a__ch();
    spill1625_36 = life28_1484;
    if (!((life3_7 != null))) {
        lexicalValue1625_1251_0 = spill1625_36;
        break lexical_join_1251;
    }
    if (!((spill1625_36 != net.minecraft.init.Blocks.j))) {
        break lexical_join_1253;
    }
    lexicalValue1625_1251_0 = life28_1484;
    }
    if (!((lexicalValue1625_1251_0 == net.minecraft.init.Blocks.i))) {
        break lexical_join_1271;
    }
    }
    ((net.minecraft.world.WorldServer)(life16_910)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_SPLASH)), ((double)(life22_1449)), ((double)(life24_1458)), ((double)(life26_1469)), ((int)((2 + ((java.util.Random)(this.ah)).nextInt(((int)(2)))))), ((double)(0x1.99999ap-4d)), ((double)(0x0.0p0d)), ((double)(0x1.99999ap-4d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    spill1625_37 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_1284_0 = spill1625_37;
        break lexical_join_1284;
    }
    lexicalValue1625_1275_0 = ((net.minecraft.entity.projectile.EntityFishHook)(spill1625_37)).aR;
    }
    if (!((lexicalValue1625_1275_0 <= 0))) {
        break lexical_join_1298;
    }
    this.aT = ((float)(moom.Dr.a(((java.util.Random)(this.ah)), ((float)(0x0.0p0f)), ((float)(0x1.68p8f)))));
    lexicalValue1625_1284_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(lexicalValue1625_1284_0)).aS = ((int)(moom.Dr.a(((java.util.Random)(this.ah)), ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1625_363(5354, (1749794352431629874L ^ life1_3)))), ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1625_364(13324, (372800108108261071L ^ life1_3)))))));
    }
    if (!((life3_7 == null))) {
        break lexical_join_1331;
    }
    }
    this.aR = ((int)(moom.Dr.a(((java.util.Random)(this.ah)), ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1625_368(31193, (4797007361081076498L ^ life1_3)))), ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1625_369(28883, (6203509980888883730L ^ life1_3)))))));
    lexicalValue1625_1316_0 = this;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_372_0 = lexicalValue1625_1316_0;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_372_0)).aR = ((int)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_372_0)).aR - ((moom.rV.f(((net.minecraft.entity.EntityLivingBase)(this.aN))) * __sourceIntrinsic_736a66cda11e_invokedynamic1625_376(5354, (1749794352431629874L ^ life1_3))) * 5))));
    }
    spill1625_38 = this;
    if (!((life3_7 != null))) {
        lexicalValue1625_1337_0 = spill1625_38;
        break lexical_join_1337;
    }
    lexicalValue1625_1335_0 = ((net.minecraft.entity.projectile.EntityFishHook)(spill1625_38)).aQ;
    }
    if (!((lexicalValue1625_1335_0 > 0))) {
        break lexical_join_1355;
    }
    lexicalValue1625_1337_0 = this;
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_379_0 = lexicalValue1625_1337_0;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_379_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_379_0)).u - (((double) ((((java.util.Random)(this.ah)).nextFloat() * ((java.util.Random)(this.ah)).nextFloat()) * ((java.util.Random)(this.ah)).nextFloat())) * 0x1.999999999999ap-3d))));
    }
    lexicalValue1625_1359_0 = (life14_807 * 0x1.0p1d);
    lexicalValue1625_1359_1 = 0x1.0p0d;
    }
    life16_1621 = (lexicalValue1625_1359_0 - lexicalValue1625_1359_1);
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_388_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_388_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_388_0)).u + (0x1.47ae14p-5d * life16_1621))));
    if (!((life3_7 != null))) {
        break lexical_join_1408;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life14_807)), ((double)(0x0.0p0d))) > 0))) {
        break lexical_join_1387;
    }
    life12_782 = ((float) (((double) life12_782) * 0x1.ccccccccccccdp-1d));
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_392_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_392_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_392_0)).u * 0x1.999999999999ap-1d)));
    }
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_395_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_395_0)).t = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_395_0)).t * ((double) life12_782))));
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_398_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_398_0)).u = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_398_0)).u * ((double) life12_782))));
    net.minecraft.entity.projectile.EntityFishHook __stackOp1625_401_0 = this;
    ((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_401_0)).v = ((double)((((net.minecraft.entity.projectile.EntityFishHook)(__stackOp1625_401_0)).v * ((double) life12_782))));
    }
    ((net.minecraft.entity.projectile.EntityFishHook)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1893_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_invokedynamic5455_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11872_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5458_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5458_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5458_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_289(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_290(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_325(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_326(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_329(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_330(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_333(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_334(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_363(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_364(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_368(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_369(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1625_376(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
