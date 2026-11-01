package net.minecraft.entity.projectile;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityArrow extends net.minecraft.entity.Entity implements net.minecraft.entity.IProjectile {

private int aE;

private int aF;

private int aG;

private net.minecraft.block.Block aH;

private int aI;

private boolean aJ;

public int aK;

public int aL;

public net.minecraft.entity.Entity aM;

private int aN;

private int aO;

private double aP;

private int aQ;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public EntityArrow(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, float p2) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_b0ee90451a200d46(net.minecraft.entity.projectile.EntityArrow receiver, net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, float p2) throws Throwable {
long local4_life1 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 36097288736733L);
    net.minecraft.entity.projectile.EntityArrow.__sourceConstructorInit_b0ee90451a200d46_0(((net.minecraft.entity.projectile.EntityArrow)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aE = ((int)(-1));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aF = ((int)(-1));
    int[] __sourceSpill947_7 = moom.h1.a__ArrayInt();
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aG = ((int)(-1));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aP = ((double)(0x1.0p1d));
    int[] local6_life9 = __sourceSpill947_7;
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).d = ((double)(0x1.4p3d));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aM = ((net.minecraft.entity.Entity)(p1));
    if ((local6_life9 != null)) {
        if ((((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0)) {
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aK = ((int)(1));
    }
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).a__Void(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)));
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).c(((double)(((net.minecraft.entity.EntityLivingBase)(p1)).n)), ((double)((((net.minecraft.entity.EntityLivingBase)(p1)).o + ((double) ((net.minecraft.entity.EntityLivingBase)(p1)).e__Float())))), ((double)(((net.minecraft.entity.EntityLivingBase)(p1)).p)), ((float)(((net.minecraft.entity.EntityLivingBase)(p1)).w)), ((float)(((net.minecraft.entity.EntityLivingBase)(p1)).x)));
        receiver.n -= ((double) (moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityArrow)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f)))) * 0x1.47ae14p-3f));
        receiver.o -= 0x1.99999ap-4d;
        receiver.p -= ((double) (moom.Dr.a(((float)(((((net.minecraft.entity.projectile.EntityArrow)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f)))) * 0x1.47ae14p-3f));
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).a__Void(((double)(((net.minecraft.entity.projectile.EntityArrow)(receiver)).n)), ((double)(((net.minecraft.entity.projectile.EntityArrow)(receiver)).o)), ((double)(((net.minecraft.entity.projectile.EntityArrow)(receiver)).p)));
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).t = ((double)(((double) ((-moom.Dr.a(((float)(((((net.minecraft.entity.projectile.EntityArrow)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f))))) * moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityArrow)(receiver)).x / 0x1.68p7f) * 0x1.921fb6p1f))))))));
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).v = ((double)(((double) (moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityArrow)(receiver)).w / 0x1.68p7f) * 0x1.921fb6p1f)))) * moom.Dr.b(((float)(((((net.minecraft.entity.projectile.EntityArrow)(receiver)).x / 0x1.68p7f) * 0x1.921fb6p1f))))))));
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).u = ((double)(((double) (-moom.Dr.a(((float)(((((net.minecraft.entity.projectile.EntityArrow)(receiver)).x / 0x1.68p7f) * 0x1.921fb6p1f))))))));
        ((net.minecraft.entity.projectile.EntityArrow)(receiver)).a(((double)(((net.minecraft.entity.projectile.EntityArrow)(receiver)).t)), ((double)(((net.minecraft.entity.projectile.EntityArrow)(receiver)).u)), ((double)(((net.minecraft.entity.projectile.EntityArrow)(receiver)).v)), ((float)((p2 * 0x1.8p0f))), ((float)(0x1.0p0f)));
    }
    return;
}


public EntityArrow(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.entity.EntityLivingBase p2, float p3, float p4) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_527277e1046b9327(net.minecraft.entity.projectile.EntityArrow receiver, net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.entity.EntityLivingBase p2, float p3, float p4) throws Throwable {
net.minecraft.entity.EntityLivingBase __initValue848_46_0;
    double __initValue848_92_0;
    double __initValue848_92_1;
    long local6_life2;
    int[] local8_life9;
    double local9_life24;
    double local11_life30;
    double local13_life33;
    double local15_life35;
    float local17_life44;
    float local18_life48;
    double local19_life49;
    double local21_life50;
    float local23_life56;
    init_join_144: {
    init_join_92: {
    init_join_46: {
    init_join_35: {
    local6_life2 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 89152001849969L);
    net.minecraft.entity.projectile.EntityArrow.__sourceConstructorInit_527277e1046b9327_0(((net.minecraft.entity.projectile.EntityArrow)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aE = ((int)(-1));
    int[] __sourceSpill848_7 = moom.h1.a__ArrayInt();
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aF = ((int)(-1));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aG = ((int)(-1));
    local8_life9 = __sourceSpill848_7;
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aP = ((double)(0x1.0000000000000p+1D));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).d = ((double)(0x1.4000000000000p+3D));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aM = ((net.minecraft.entity.Entity)(p1));
    net.minecraft.entity.EntityLivingBase __sourceSpill848_15 = p1;
    if (!((local8_life9 != null))) {
        __initValue848_46_0 = __sourceSpill848_15;
        break init_join_46;
    }
    if (!((((__sourceSpill848_15 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break init_join_35;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).aK = ((int)(1));
    }
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).o = ((double)(((((net.minecraft.entity.EntityLivingBase)(p1)).o + ((double) ((net.minecraft.entity.EntityLivingBase)(p1)).e__Float())) - 0x1.99999a0000000p-4D)));
    __initValue848_46_0 = p2;
    }
    local9_life24 = (((net.minecraft.entity.EntityLivingBase)(__initValue848_46_0)).n - ((net.minecraft.entity.EntityLivingBase)(p1)).n);
    local11_life30 = ((((moom.CA)(((net.minecraft.entity.EntityLivingBase)(p2)).b())).c + ((double) (((net.minecraft.entity.EntityLivingBase)(p2)).H / 0x1.8000000000000p+1F))) - ((net.minecraft.entity.projectile.EntityArrow)(receiver)).o);
    local13_life33 = (((net.minecraft.entity.EntityLivingBase)(p2)).p - ((net.minecraft.entity.EntityLivingBase)(p1)).p);
    local15_life35 = ((double) moom.Dr.a__Float(((double)(((local9_life24 * local9_life24) + (local13_life33 * local13_life33))))));
    double __sourceSpill848_37 = local15_life35;
    double __sourceSpill848_38 = 0x1.ad7f29abcaf48p-24D;
    if (!((local8_life9 != null))) {
        __initValue848_92_0 = __sourceSpill848_37;
        __initValue848_92_1 = __sourceSpill848_38;
        break init_join_92;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(__sourceSpill848_37)), ((double)(__sourceSpill848_38))) >= 0))) {
        break init_join_144;
    }
    __initValue848_92_0 = (moom.Dr.b(((double)(local13_life33)), ((double)(local9_life24))) * 0x1.6800000000000p+7D);
    __initValue848_92_1 = 0x1.921fb54442d18p+1D;
    }
    local17_life44 = (((float) (__initValue848_92_0 / __initValue848_92_1)) - 0x1.6800000000000p+6F);
    local18_life48 = ((float) (-((moom.Dr.b(((double)(local11_life30)), ((double)(local15_life35))) * 0x1.6800000000000p+7D) / 0x1.921fb54442d18p+1D)));
    local19_life49 = (local9_life24 / local15_life35);
    local21_life50 = (local13_life33 / local15_life35);
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).c(((double)((((net.minecraft.entity.EntityLivingBase)(p1)).n + local19_life49))), ((double)(((net.minecraft.entity.projectile.EntityArrow)(receiver)).o)), ((double)((((net.minecraft.entity.EntityLivingBase)(p1)).p + local21_life50))), ((float)(local17_life44)), ((float)(local18_life48)));
    local23_life56 = ((float) (local15_life35 * 0x1.99999a0000000p-3D));
    ((net.minecraft.entity.projectile.EntityArrow)(receiver)).a(((double)(local9_life24)), ((double)((local11_life30 + ((double) local23_life56)))), ((double)(local13_life33)), ((float)(p3)), ((float)(p4)));
    }
    return;
}


public EntityArrow(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0);
    this.aE = -1;
    this.aF = -1;
    this.aG = -1;
    this.aP = 0x1.0000000000000p+1d;
    this.d = 0x1.4000000000000p+3d;
    (this).a__Void(0x1.0000000000000p-1f, 0x1.0000000000000p-1f);
    (this).a__Void(p1, p2, p3);
}


public EntityArrow(net.minecraft.world.World p0) {
super(p0);
    this.aE = -1;
    this.aF = -1;
    this.aG = -1;
    this.aP = 0x1.0000000000000p+1d;
    this.d = 0x1.4000000000000p+3d;
    (this).a__Void(0x1.0000000000000p-1f, 0x1.0000000000000p-1f);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-139035687336009967L)), ((long)(251892788830682841L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191979299686068L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 101512257739425L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1891_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1891_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1891_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1891_14 = new byte[8];
    (__sourceSpill1891_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1891_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1891_16 = __sourceSpill1891_14;
    ((javax.crypto.Cipher)(__sourceSpill1891_11)).init(((int)(__sourceSpill1891_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1891_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1891_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ã¥\026¦àk Ívè]°é|\fº6'b\021ù¯º\032\"é1(y·²àÆâ\013ìW\030\006\177ÃèVÍSM\bÔx\023û0Ê\036lÿéÓitV±7o1êç\017;"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1891_25 = local6_life21;
        int __sourceSpill1891_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1891_25)).substring(((int)(__sourceSpill1891_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1891_30 = local8_life19;
        int __sourceSpill1891_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1891_33 = new byte[8];
        (__sourceSpill1891_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1891_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1891_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1891_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1891_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1891_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1891_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1891_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1891_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1891_34)).doFinal(((byte[])(__sourceSpill1891_33)));
        (__sourceSpill1891_30)[__sourceSpill1891_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÝôhFÊsÅtµ%.\034/¥"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1891_38 = local6_life21;
        int __sourceSpill1891_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1891_38)).substring(((int)(__sourceSpill1891_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1891_43 = local8_life19;
        int __sourceSpill1891_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1891_46 = new byte[8];
        (__sourceSpill1891_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1891_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1891_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1891_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1891_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1891_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1891_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1891_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1891_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1891_47)).doFinal(((byte[])(__sourceSpill1891_46)));
        (__sourceSpill1891_43)[__sourceSpill1891_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b0ee90451a200d46_0(net.minecraft.entity.projectile.EntityArrow a0, net.minecraft.world.World a1) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_527277e1046b9327_0(net.minecraft.entity.projectile.EntityArrow a0, net.minecraft.world.World a1) throws E;

public boolean b__sourceReturn_aae029aa0a() {
int forwardValue5444_22_0;
    int forwardValue5444_24_0;
    int[] spill5444_0;
    int spill5444_1;
    long life1_3;
    int life4_13;
    int[] life3_14;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 660937675151L);
    spill5444_0 = moom.h1.a__ArrayInt();
    life4_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_5f5fadf1ff21_invokedynamic5444_3(30060, (6146492681551234844L ^ life1_3)))));
    life3_14 = spill5444_0;
    spill5444_1 = (life4_13 & 1);
    if (!((life3_14 != null))) {
        forwardValue5444_22_0 = spill5444_1;
        break forward_join_22;
    }
    if (!((spill5444_1 != 0))) {
        break forward_join_23;
    }
    forwardValue5444_22_0 = 1;
    }
    forwardValue5444_24_0 = forwardValue5444_22_0;
    break forward_join_24;
    }
    forwardValue5444_24_0 = 0;
    }
    return ((forwardValue5444_24_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11858_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23974;
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
            throw new RuntimeException("moom/tM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_9ceb00d3a5cff8(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public float e__Float() {
return 0x0.0p0f;
}


public boolean x__Boolean() {
return ((0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.projectile.EntityArrow forwardValue5445_55_0;
    int forwardValue5445_55_1;
    net.minecraft.entity.projectile.EntityArrow forwardValue5445_88_0;
    int forwardValue5445_88_1;
    net.minecraft.entity.projectile.EntityArrow forwardValue5445_89_0;
    net.minecraft.entity.projectile.EntityArrow forwardValue5445_90_0;
    int forwardValue5445_90_1;
    int forwardValue5445_115_0;
    int forwardValue5445_133_0;
    net.minecraft.entity.projectile.EntityArrow forwardValue5445_142_0;
    int forwardValue5445_142_1;
    net.minecraft.entity.projectile.EntityArrow forwardValue5445_143_0;
    net.minecraft.entity.projectile.EntityArrow forwardValue5445_144_0;
    int forwardValue5445_144_1;
    int[] spill5445_0;
    net.minecraft.entity.projectile.EntityArrow spill5445_1;
    short spill5445_2;
    net.minecraft.entity.projectile.EntityArrow spill5445_3;
    byte spill5445_4;
    boolean spill5445_5;
    net.minecraft.entity.projectile.EntityArrow spill5445_6;
    boolean spill5445_7;
    long life2_3;
    int[] life4_15;
    forward_join_145: {
    forward_join_144: {
    forward_join_143: {
    forward_join_142: {
    forward_join_133: {
    forward_join_125: {
    forward_join_115: {
    forward_join_107: {
    forward_join_90: {
    forward_join_89: {
    forward_join_88: {
    forward_join_57: {
    forward_join_55: {
    forward_join_45: {
    life2_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 15090508366017L);
    spill5445_0 = moom.h1.a__ArrayInt();
    this.aE = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("xTile")))));
    this.aF = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("yTile")))));
    life4_15 = spill5445_0;
    this.aG = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("zTile")))));
    spill5445_1 = this;
    spill5445_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("life")));
    if (!((life4_15 != null))) {
        forwardValue5445_55_0 = spill5445_1;
        forwardValue5445_55_1 = ((int)(spill5445_2));
        break forward_join_55;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(spill5445_1)).aN = ((int)(spill5445_2));
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("inTile")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5445_11(26280, (431954435041510804L ^ life2_3))))))) {
        break forward_join_45;
    }
    this.aH = ((net.minecraft.block.Block)(__sourceExactCall_85597be21a945e(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("inTile"))))))));
    if (!((life4_15 == null))) {
        break forward_join_57;
    }
    }
    forwardValue5445_55_0 = this;
    forwardValue5445_55_1 = (((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("inTile"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_17(27997, (7511242899483414118L ^ life2_3)));
    }
    ((net.minecraft.entity.projectile.EntityArrow)(forwardValue5445_55_0)).aH = ((net.minecraft.block.Block)(__sourceExactCall_c520ab7951a8e1(((int)(forwardValue5445_55_1)))));
    }
    this.aI = ((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("inData"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_21(13467, (1375253963187460003L ^ life2_3)))));
    this.aL = ((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("shake"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_24(13467, (1375253963187460003L ^ life2_3)))));
    spill5445_3 = this;
    spill5445_4 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("inGround")));
    if (!((life4_15 != null))) {
        forwardValue5445_88_0 = spill5445_3;
        forwardValue5445_88_1 = ((int)(spill5445_4));
        break forward_join_88;
    }
    if (!((spill5445_4 == 1))) {
        forwardValue5445_89_0 = spill5445_3;
        break forward_join_89;
    }
    forwardValue5445_88_0 = spill5445_3;
    forwardValue5445_88_1 = 1;
    }
    forwardValue5445_90_0 = forwardValue5445_88_0;
    forwardValue5445_90_1 = forwardValue5445_88_1;
    break forward_join_90;
    }
    forwardValue5445_90_0 = forwardValue5445_89_0;
    forwardValue5445_90_1 = 0;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(forwardValue5445_90_0)).aJ = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue5445_90_1)));
    spill5445_5 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("damage")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5445_29(10572, (7341077459946244726L ^ life2_3)))));
    if (!((life4_15 != null))) {
        forwardValue5445_115_0 = ((spill5445_5) ? 1 : 0);
        break forward_join_115;
    }
    if (!(spill5445_5)) {
        break forward_join_107;
    }
    this.aP = ((double)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Double(((java.lang.String)("damage")))));
    }
    forwardValue5445_115_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("pickup")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5445_34(2925, (9036378362161899615L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_15 != null))) {
        forwardValue5445_133_0 = forwardValue5445_115_0;
        break forward_join_133;
    }
    if (!((forwardValue5445_115_0 != 0))) {
        break forward_join_125;
    }
    this.aK = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("pickup")))));
    if (!((life4_15 == null))) {
        break forward_join_145;
    }
    }
    forwardValue5445_133_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("player")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5445_39(2925, (9036378362161899615L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5445_133_0 != 0))) {
        break forward_join_145;
    }
    spill5445_6 = this;
    spill5445_7 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("player")));
    if (!((life4_15 != null))) {
        forwardValue5445_142_0 = spill5445_6;
        forwardValue5445_142_1 = ((spill5445_7) ? 1 : 0);
        break forward_join_142;
    }
    if (!(spill5445_7)) {
        forwardValue5445_143_0 = spill5445_6;
        break forward_join_143;
    }
    forwardValue5445_142_0 = spill5445_6;
    forwardValue5445_142_1 = 1;
    }
    forwardValue5445_144_0 = forwardValue5445_142_0;
    forwardValue5445_144_1 = forwardValue5445_142_1;
    break forward_join_144;
    }
    forwardValue5445_144_0 = forwardValue5445_143_0;
    forwardValue5445_144_1 = 0;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(forwardValue5445_144_0)).aK = ((int)(forwardValue5445_144_1));
    }
    return;
}


public void h(boolean p0) {
long life2_3;
    int life5_13;
    int[] life4_14;
    forward_join_51: {
    forward_join_34: {
    forward_join_32: {
    life2_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 83417857890105L);
    int[] spill6107_0 = moom.h1.a__ArrayInt();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_8699ed5f13ef_invokedynamic6107_3(18569, (7965430849034583104L ^ life2_3)))));
    life4_14 = spill6107_0;
    if (!((life4_14 != null))) { break forward_join_32; }
    if (!(p0)) { break forward_join_34; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_8699ed5f13ef_invokedynamic6107_6(18569, (7965430849034583104L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 | 1))))))));
    }
    if (!((life4_14 == null))) { break forward_join_51; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_8699ed5f13ef_invokedynamic6107_10(18569, (7965430849034583104L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 & __sourceIntrinsic_8699ed5f13ef_invokedynamic6107_11(7863, (1282167219816180342L ^ life2_3))))))))));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5448_44_0;
    java.lang.String forwardValue5448_44_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5448_45_0;
    java.lang.String forwardValue5448_45_1;
    moom.DD forwardValue5448_45_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5448_46_0;
    java.lang.String forwardValue5448_46_1;
    java.lang.String forwardValue5448_46_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5448_67_0;
    java.lang.String forwardValue5448_67_1;
    int forwardValue5448_67_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5448_68_0;
    java.lang.String forwardValue5448_68_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5448_69_0;
    java.lang.String forwardValue5448_69_1;
    int forwardValue5448_69_2;
    int[] spill5448_0;
    net.minecraft.nbt.NBTTagCompound spill5448_1;
    java.lang.String spill5448_2;
    moom.DD spill5448_3;
    net.minecraft.nbt.NBTTagCompound spill5448_4;
    java.lang.String spill5448_5;
    boolean spill5448_6;
    long life2_3;
    int[] life4_11;
    moom.DD life5_35;
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    life2_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 53727726345162L);
    spill5448_0 = moom.h1.a__ArrayInt();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("xTile")), ((short)(((short) this.aE))));
    life4_11 = spill5448_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("yTile")), ((short)(((short) this.aF))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("zTile")), ((short)(((short) this.aG))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("life")), ((short)(((short) this.aN))));
    life5_35 = ((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(this.aH)))));
    spill5448_1 = p0;
    spill5448_2 = "inTile";
    spill5448_3 = life5_35;
    if (!((life4_11 != null))) {
        forwardValue5448_45_0 = spill5448_1;
        forwardValue5448_45_1 = spill5448_2;
        forwardValue5448_45_2 = spill5448_3;
        break forward_join_45;
    }
    if (!((spill5448_3 == null))) {
        forwardValue5448_44_0 = spill5448_1;
        forwardValue5448_44_1 = spill5448_2;
        break forward_join_44;
    }
    forwardValue5448_46_0 = spill5448_1;
    forwardValue5448_46_1 = spill5448_2;
    forwardValue5448_46_2 = "";
    break forward_join_46;
    }
    forwardValue5448_45_0 = forwardValue5448_44_0;
    forwardValue5448_45_1 = forwardValue5448_44_1;
    forwardValue5448_45_2 = life5_35;
    }
    forwardValue5448_46_0 = forwardValue5448_45_0;
    forwardValue5448_46_1 = forwardValue5448_45_1;
    forwardValue5448_46_2 = ((moom.DD)(forwardValue5448_45_2)).toString();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5448_46_0)).a(((java.lang.String)(forwardValue5448_46_1)), ((java.lang.String)(forwardValue5448_46_2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("inData")), ((byte)(((byte) this.aI))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("shake")), ((byte)(((byte) this.aL))));
    spill5448_4 = p0;
    spill5448_5 = "inGround";
    spill5448_6 = this.aJ;
    if (!((life4_11 != null))) {
        forwardValue5448_67_0 = spill5448_4;
        forwardValue5448_67_1 = spill5448_5;
        forwardValue5448_67_2 = ((spill5448_6) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill5448_6)) {
        forwardValue5448_68_0 = spill5448_4;
        forwardValue5448_68_1 = spill5448_5;
        break forward_join_68;
    }
    forwardValue5448_67_0 = spill5448_4;
    forwardValue5448_67_1 = spill5448_5;
    forwardValue5448_67_2 = 1;
    }
    forwardValue5448_69_0 = forwardValue5448_67_0;
    forwardValue5448_69_1 = forwardValue5448_67_1;
    forwardValue5448_69_2 = forwardValue5448_67_2;
    break forward_join_69;
    }
    forwardValue5448_69_0 = forwardValue5448_68_0;
    forwardValue5448_69_1 = forwardValue5448_68_1;
    forwardValue5448_69_2 = 0;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5448_69_0)).a(((java.lang.String)(forwardValue5448_69_1)), ((byte)(((byte) forwardValue5448_69_2))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("pickup")), ((byte)(((byte) this.aK))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("damage")), ((double)(this.aP)));
    return;
}


public void d(double p0, double p1, double p2) {
int forwardValue5446_28_0;
    float forwardValue5446_37_0;
    int[] spill5446_0;
    int spill5446_1;
    float spill5446_2;
    net.minecraft.entity.projectile.EntityArrow spill5446_3;
    float spill5446_4;
    net.minecraft.entity.projectile.EntityArrow spill5446_5;
    float spill5446_6;
    long life7_3;
    int[] life9_14;
    float life10_49;
    forward_join_88: {
    forward_join_37: {
    forward_join_28: {
    life7_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 53354133570931L);
    spill5446_0 = moom.h1.a__ArrayInt();
    this.t = ((double)(p0));
    this.u = ((double)(p1));
    this.v = ((double)(p2));
    life9_14 = spill5446_0;
    spill5446_1 = recovery.source.CarrierOps.fcmpl(((float)(this.z)), ((float)(0x0.0p0f)));
    if (!((life9_14 != null))) {
        forwardValue5446_28_0 = spill5446_1;
        break forward_join_28;
    }
    if (!((spill5446_1 == 0))) {
        break forward_join_88;
    }
    spill5446_2 = this.y;
    if (!((life9_14 != null))) {
        forwardValue5446_37_0 = spill5446_2;
        break forward_join_37;
    }
    forwardValue5446_28_0 = recovery.source.CarrierOps.fcmpl(((float)(spill5446_2)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue5446_28_0 == 0))) {
        break forward_join_88;
    }
    forwardValue5446_37_0 = moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2)))));
    }
    life10_49 = forwardValue5446_37_0;
    spill5446_3 = this;
    net.minecraft.entity.projectile.EntityArrow __stackOp5446_11_0 = this;
    float __stackOp5446_11_1 = ((float) ((moom.Dr.b(((double)(p0)), ((double)(p2))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill5446_4 = __stackOp5446_11_1;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp5446_11_0)).w = ((float)(__stackOp5446_11_1));
    ((net.minecraft.entity.projectile.EntityArrow)(spill5446_3)).y = ((float)(spill5446_4));
    spill5446_5 = this;
    net.minecraft.entity.projectile.EntityArrow __stackOp5446_15_0 = this;
    float __stackOp5446_15_1 = ((float) ((moom.Dr.b(((double)(p1)), ((double)(((double) life10_49)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill5446_6 = __stackOp5446_15_1;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp5446_15_0)).x = ((float)(__stackOp5446_15_1));
    ((net.minecraft.entity.projectile.EntityArrow)(spill5446_5)).z = ((float)(spill5446_6));
    this.z = ((float)(this.x));
    this.y = ((float)(this.w));
    ((net.minecraft.entity.projectile.EntityArrow)(this)).c(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(this.w)), ((float)(this.x)));
    this.aN = ((int)(0));
    }
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 133807203286162L);
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite2014_2(18569, (7965415611817564139L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void d(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5447_14_0;
    int forwardValue5447_19_0;
    int forwardValue5447_24_0;
    int forwardValue5447_37_0;
    int forwardValue5447_41_0;
    int forwardValue5447_43_0;
    int forwardValue5447_64_0;
    boolean spill5447_0;
    int spill5447_1;
    int spill5447_2;
    boolean spill5447_3;
    long life2_3;
    int[] life4_5;
    int life5_76;
    forward_join_88: {
    forward_join_64: {
    forward_join_63: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_37: {
    forward_join_24: {
    forward_join_19: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 131557030173735L);
    life4_5 = moom.h1.a__ArrayInt();
    spill5447_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 != null))) {
        forwardValue5447_14_0 = ((spill5447_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill5447_0))) {
        break forward_join_88;
    }
    forwardValue5447_14_0 = ((this.aJ) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue5447_19_0 = forwardValue5447_14_0;
        break forward_join_19;
    }
    if (!((forwardValue5447_14_0 != 0))) {
        break forward_join_88;
    }
    forwardValue5447_19_0 = this.aL;
    }
    if (!((life4_5 != null))) {
        forwardValue5447_24_0 = forwardValue5447_19_0;
        break forward_join_24;
    }
    if (!((forwardValue5447_19_0 <= 0))) {
        break forward_join_88;
    }
    forwardValue5447_24_0 = this.aK;
    }
    if (!((life4_5 != null))) {
        forwardValue5447_41_0 = forwardValue5447_24_0;
        break forward_join_41;
    }
    if (!((forwardValue5447_24_0 != 1))) {
        break forward_join_40;
    }
    spill5447_1 = this.aK;
    if (!((life4_5 != null))) {
        forwardValue5447_37_0 = spill5447_1;
        break forward_join_37;
    }
    if (!((spill5447_1 == 2))) {
        break forward_join_42;
    }
    forwardValue5447_37_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue5447_41_0 = forwardValue5447_37_0;
        break forward_join_41;
    }
    if (!((forwardValue5447_37_0 != 0))) {
        break forward_join_42;
    }
    }
    forwardValue5447_41_0 = 1;
    }
    forwardValue5447_43_0 = forwardValue5447_41_0;
    break forward_join_43;
    }
    forwardValue5447_43_0 = 0;
    }
    life5_76 = forwardValue5447_43_0;
    spill5447_2 = this.aK;
    if (!((life4_5 != null))) {
        forwardValue5447_64_0 = spill5447_2;
        break forward_join_64;
    }
    if (!((spill5447_2 == 1))) {
        break forward_join_63;
    }
    spill5447_3 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.g, 1))));
    if (!((life4_5 != null))) {
        forwardValue5447_64_0 = ((spill5447_3) ? 1 : 0);
        break forward_join_64;
    }
    if (!((!spill5447_3))) {
        break forward_join_63;
    }
    life5_76 = 0;
    }
    forwardValue5447_64_0 = life5_76;
    }
    if (!((forwardValue5447_64_0 != 0))) {
        break forward_join_88;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(this)).a(((java.lang.String)("random.pop")), ((float)(0x1.99999ap-3f)), ((float)(((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.666666p-1f) + 0x1.0p0f) * 0x1.0p1f))));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).b(((net.minecraft.entity.Entity)(this)), ((int)(1)));
    ((net.minecraft.entity.projectile.EntityArrow)(this)).f__Void();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(double p0, double p1, double p2, float p3, float p4) {
double forwardValue5443_45_0;
    double forwardValue5443_45_1;
    int forwardValue5443_45_2;
    double forwardValue5443_46_0;
    double forwardValue5443_46_1;
    double forwardValue5443_47_0;
    double forwardValue5443_47_1;
    int forwardValue5443_47_2;
    double forwardValue5443_67_0;
    double forwardValue5443_67_1;
    int forwardValue5443_67_2;
    double forwardValue5443_68_0;
    double forwardValue5443_68_1;
    double forwardValue5443_69_0;
    double forwardValue5443_69_1;
    int forwardValue5443_69_2;
    double forwardValue5443_89_0;
    double forwardValue5443_89_1;
    int forwardValue5443_89_2;
    double forwardValue5443_90_0;
    double forwardValue5443_90_1;
    double forwardValue5443_91_0;
    double forwardValue5443_91_1;
    int forwardValue5443_91_2;
    int[] spill5443_0;
    double spill5443_1;
    double spill5443_2;
    boolean spill5443_3;
    double spill5443_4;
    double spill5443_5;
    boolean spill5443_6;
    double spill5443_7;
    double spill5443_8;
    boolean spill5443_9;
    net.minecraft.entity.projectile.EntityArrow spill5443_10;
    float spill5443_11;
    net.minecraft.entity.projectile.EntityArrow spill5443_12;
    float spill5443_13;
    long life9_3;
    float life12_16;
    double life1_21;
    double life3_26;
    double life5_32;
    int[] life11_33;
    double life1_58;
    double life3_83;
    double life5_108;
    double life1_113;
    double life3_118;
    double life5_123;
    float life13_141;
    forward_join_91: {
    forward_join_90: {
    forward_join_89: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    life9_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 123030588013183L);
    life12_16 = moom.Dr.a__Float(((double)((((p0 * p0) + (p1 * p1)) + (p2 * p2)))));
    life1_21 = (p0 / ((double) life12_16));
    life3_26 = (p1 / ((double) life12_16));
    spill5443_0 = moom.h1.a__ArrayInt();
    life5_32 = (p2 / ((double) life12_16));
    life11_33 = spill5443_0;
    spill5443_1 = life1_21;
    spill5443_2 = ((java.util.Random)(this.ah)).nextGaussian();
    spill5443_3 = ((java.util.Random)(this.ah)).nextBoolean();
    if (!((life11_33 != null))) {
        forwardValue5443_45_0 = spill5443_1;
        forwardValue5443_45_1 = spill5443_2;
        forwardValue5443_45_2 = ((spill5443_3) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill5443_3)) {
        forwardValue5443_46_0 = spill5443_1;
        forwardValue5443_46_1 = spill5443_2;
        break forward_join_46;
    }
    forwardValue5443_45_0 = spill5443_1;
    forwardValue5443_45_1 = spill5443_2;
    forwardValue5443_45_2 = -1;
    }
    forwardValue5443_47_0 = forwardValue5443_45_0;
    forwardValue5443_47_1 = forwardValue5443_45_1;
    forwardValue5443_47_2 = forwardValue5443_45_2;
    break forward_join_47;
    }
    forwardValue5443_47_0 = forwardValue5443_46_0;
    forwardValue5443_47_1 = forwardValue5443_46_1;
    forwardValue5443_47_2 = 1;
    }
    life1_58 = (forwardValue5443_47_0 + (((forwardValue5443_47_1 * ((double) forwardValue5443_47_2)) * 0x1.eb851ep-8d) * ((double) p4)));
    spill5443_4 = life3_26;
    spill5443_5 = ((java.util.Random)(this.ah)).nextGaussian();
    spill5443_6 = ((java.util.Random)(this.ah)).nextBoolean();
    if (!((life11_33 != null))) {
        forwardValue5443_67_0 = spill5443_4;
        forwardValue5443_67_1 = spill5443_5;
        forwardValue5443_67_2 = ((spill5443_6) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill5443_6)) {
        forwardValue5443_68_0 = spill5443_4;
        forwardValue5443_68_1 = spill5443_5;
        break forward_join_68;
    }
    forwardValue5443_67_0 = spill5443_4;
    forwardValue5443_67_1 = spill5443_5;
    forwardValue5443_67_2 = -1;
    }
    forwardValue5443_69_0 = forwardValue5443_67_0;
    forwardValue5443_69_1 = forwardValue5443_67_1;
    forwardValue5443_69_2 = forwardValue5443_67_2;
    break forward_join_69;
    }
    forwardValue5443_69_0 = forwardValue5443_68_0;
    forwardValue5443_69_1 = forwardValue5443_68_1;
    forwardValue5443_69_2 = 1;
    }
    life3_83 = (forwardValue5443_69_0 + (((forwardValue5443_69_1 * ((double) forwardValue5443_69_2)) * 0x1.eb851ep-8d) * ((double) p4)));
    spill5443_7 = life5_32;
    spill5443_8 = ((java.util.Random)(this.ah)).nextGaussian();
    spill5443_9 = ((java.util.Random)(this.ah)).nextBoolean();
    if (!((life11_33 != null))) {
        forwardValue5443_89_0 = spill5443_7;
        forwardValue5443_89_1 = spill5443_8;
        forwardValue5443_89_2 = ((spill5443_9) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill5443_9)) {
        forwardValue5443_90_0 = spill5443_7;
        forwardValue5443_90_1 = spill5443_8;
        break forward_join_90;
    }
    forwardValue5443_89_0 = spill5443_7;
    forwardValue5443_89_1 = spill5443_8;
    forwardValue5443_89_2 = -1;
    }
    forwardValue5443_91_0 = forwardValue5443_89_0;
    forwardValue5443_91_1 = forwardValue5443_89_1;
    forwardValue5443_91_2 = forwardValue5443_89_2;
    break forward_join_91;
    }
    forwardValue5443_91_0 = forwardValue5443_90_0;
    forwardValue5443_91_1 = forwardValue5443_90_1;
    forwardValue5443_91_2 = 1;
    }
    life5_108 = (forwardValue5443_91_0 + (((forwardValue5443_91_1 * ((double) forwardValue5443_91_2)) * 0x1.eb851ep-8d) * ((double) p4)));
    life1_113 = (life1_58 * ((double) p3));
    life3_118 = (life3_83 * ((double) p3));
    life5_123 = (life5_108 * ((double) p3));
    this.t = ((double)(life1_113));
    this.u = ((double)(life3_118));
    this.v = ((double)(life5_123));
    life13_141 = moom.Dr.a__Float(((double)(((life1_113 * life1_113) + (life5_123 * life5_123)))));
    spill5443_10 = this;
    net.minecraft.entity.projectile.EntityArrow __stackOp5443_23_0 = this;
    float __stackOp5443_23_1 = ((float) ((moom.Dr.b(((double)(life1_113)), ((double)(life5_123))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill5443_11 = __stackOp5443_23_1;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp5443_23_0)).w = ((float)(__stackOp5443_23_1));
    ((net.minecraft.entity.projectile.EntityArrow)(spill5443_10)).y = ((float)(spill5443_11));
    spill5443_12 = this;
    net.minecraft.entity.projectile.EntityArrow __stackOp5443_27_0 = this;
    float __stackOp5443_27_1 = ((float) ((moom.Dr.b(((double)(life3_118)), ((double)(((double) life13_141)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill5443_13 = __stackOp5443_27_1;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp5443_27_0)).x = ((float)(__stackOp5443_27_1));
    ((net.minecraft.entity.projectile.EntityArrow)(spill5443_12)).z = ((float)(spill5443_13));
    this.aN = ((int)(0));
    return;
}


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) {
((net.minecraft.entity.projectile.EntityArrow)(this)).a__Void(((double)(p0)), ((double)(p1)), ((double)(p2)));
    ((net.minecraft.entity.projectile.EntityArrow)(this)).b(((float)(p3)), ((float)(p4)));
    return;
}


public double a() {
return this.aP;
}


public void a__sourceReturn_2c20cf5948(double p0) {
this.aP = ((double)(p0));
    return;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public void g(int p0) {
this.aQ = ((int)(p0));
    return;
}


public void g__Void() {
int forestValue1125_21_0;
    float forestValue1125_34_0;
    net.minecraft.block.Block forestValue1125_95_0;
    moom.CA forestValue1125_106_0;
    int forestValue1125_124_0;
    int forestValue1125_137_0;
    int forestValue1125_169_0;
    int forestValue1125_169_1;
    net.minecraft.entity.projectile.EntityArrow forestValue1125_171_0;
    net.minecraft.entity.projectile.EntityArrow forestValue1125_219_0;
    moom.DR forestValue1125_307_0;
    net.minecraft.entity.Entity forestValue1125_348_0;
    double forestValue1125_394_0;
    int forestValue1125_433_0;
    int forestValue1125_441_0;
    net.minecraft.util.MovingObjectPosition forestValue1125_445_0;
    net.minecraft.util.MovingObjectPosition forestValue1125_449_0;
    net.minecraft.entity.projectile.EntityArrow forestValue1125_496_0;
    int forestValue1125_526_0;
    net.minecraft.entity.Entity forestValue1125_529_0;
    int forestValue1125_552_0;
    int forestValue1125_605_0;
    net.minecraft.entity.Entity forestValue1125_617_0;
    net.minecraft.entity.Entity forestValue1125_670_0;
    int forestValue1125_671_0;
    net.minecraft.util.MovingObjectPosition forestValue1125_711_0;
    net.minecraft.entity.projectile.EntityArrow forestValue1125_867_0;
    int forestValue1125_870_0;
    net.minecraft.entity.projectile.EntityArrow forestValue1125_950_0;
    int forestValue1125_1145_0;
    net.minecraft.entity.projectile.EntityArrow forestValue1125_1185_0;
    int[] spill1125_0;
    int spill1125_1;
    float spill1125_2;
    net.minecraft.entity.projectile.EntityArrow spill1125_3;
    float spill1125_4;
    net.minecraft.entity.projectile.EntityArrow spill1125_5;
    float spill1125_6;
    net.minecraft.block.Block spill1125_7;
    moom.CA spill1125_8;
    boolean spill1125_9;
    net.minecraft.entity.projectile.EntityArrow spill1125_10;
    int spill1125_11;
    int spill1125_12;
    net.minecraft.entity.projectile.EntityArrow spill1125_13;
    moom.DR spill1125_14;
    net.minecraft.entity.Entity spill1125_15;
    boolean spill1125_16;
    double spill1125_17;
    double spill1125_18;
    net.minecraft.util.MovingObjectPosition spill1125_19;
    net.minecraft.util.MovingObjectPosition spill1125_20;
    net.minecraft.util.MovingObjectPosition spill1125_21;
    boolean spill1125_22;
    net.minecraft.entity.projectile.EntityArrow spill1125_23;
    boolean spill1125_24;
    int spill1125_25;
    net.minecraft.entity.Entity spill1125_26;
    int spill1125_27;
    boolean spill1125_28;
    int spill1125_29;
    net.minecraft.entity.Entity spill1125_30;
    net.minecraft.entity.Entity spill1125_31;
    int spill1125_32;
    int spill1125_33;
    net.minecraft.entity.projectile.EntityArrow spill1125_34;
    boolean spill1125_35;
    net.minecraft.entity.projectile.EntityArrow spill1125_36;
    long life1_3;
    int[] life3_7;
    float life4_38;
    moom.DT life4_78;
    net.minecraft.block.state.IBlockState life5_83;
    net.minecraft.block.Block life6_86;
    moom.CA life7_106;
    int life7_153;
    moom.DR life7_252;
    moom.DR life8_271;
    net.minecraft.util.MovingObjectPosition life9_280;
    moom.DR life7_290;
    moom.DR life8_311;
    net.minecraft.entity.Entity life10_329;
    java.util.List life11_347;
    double life12_349;
    java.util.Iterator life14_352;
    net.minecraft.entity.Entity life15_359;
    float life16_379;
    moom.CA life17_389;
    net.minecraft.util.MovingObjectPosition life18_394;
    double life19_401;
    net.minecraft.entity.Entity life15_447;
    net.minecraft.entity.player.EntityPlayer life14_453;
    float life14_507;
    int life15_514;
    net.minecraft.util.DamageSource life16_539;
    net.minecraft.entity.Entity life18_572;
    net.minecraft.entity.EntityLivingBase life17_581;
    float life18_614;
    moom.DT life14_774;
    net.minecraft.block.state.IBlockState life15_791;
    float life16_850;
    int life14_937;
    float life14_1027;
    float life15_1155;
    float life16_1157;
    int life17_1165;
    float life18_1170;
    forest_join_1186: {
    forest_join_1185: {
    forest_join_1148: {
    forest_join_1145: {
    forest_join_1141: {
    forest_join_1139: {
    forest_join_1082: {
    forest_join_1058: {
    forest_join_1040: {
    forest_join_1022: {
    forest_join_1004: {
    forest_join_950: {
    forest_join_949: {
    forest_join_928: {
    forest_join_870: {
    forest_join_867: {
    forest_join_866: {
    forest_join_711: {
    forest_join_710: {
    forest_join_709: {
    forest_join_676: {
    forest_join_674: {
    forest_join_671: {
    forest_join_670: {
    forest_join_653: {
    forest_join_617: {
    forest_join_615: {
    forest_join_605: {
    forest_join_600: {
    forest_join_552: {
    forest_join_550: {
    forest_join_529: {
    forest_join_526: {
    forest_join_518: {
    forest_join_496: {
    forest_join_495: {
    forest_join_449: {
    forest_join_445: {
    forest_join_444: {
    forest_join_442: {
    forest_join_441: {
    forest_join_433: {
    forest_join_404: {
    forest_join_397: {
    forest_join_308: {
    forest_join_307: {
    forest_join_219: {
    forest_join_218: {
    forest_join_216: {
    forest_join_213: {
    forest_join_174: {
    forest_join_171: {
    forest_join_169: {
    forest_join_137: {
    forest_join_133: {
    forest_join_124: {
    forest_join_122: {
    forest_join_106: {
    forest_join_95: {
    forest_join_65: {
    forest_join_34: {
    forest_join_21: {
    life1_3 = (net.minecraft.entity.projectile.EntityArrow.bb ^ 62993373294517L);
    spill1125_0 = moom.h1.a__ArrayInt();
    super.g__Void();
    life3_7 = spill1125_0;
    spill1125_1 = recovery.source.CarrierOps.fcmpl(((float)(this.z)), ((float)(0x0.0p0f)));
    if (!((life3_7 != null))) {
        forestValue1125_21_0 = spill1125_1;
        break forest_join_21;
    }
    if (!((spill1125_1 == 0))) {
        break forest_join_65;
    }
    spill1125_2 = this.y;
    if (!((life3_7 != null))) {
        forestValue1125_34_0 = spill1125_2;
        break forest_join_34;
    }
    forestValue1125_21_0 = recovery.source.CarrierOps.fcmpl(((float)(spill1125_2)), ((float)(0x0.0p0f)));
    }
    if (!((forestValue1125_21_0 == 0))) {
        break forest_join_65;
    }
    forestValue1125_34_0 = moom.Dr.a__Float(((double)(((this.t * this.t) + (this.v * this.v)))));
    }
    life4_38 = forestValue1125_34_0;
    spill1125_3 = this;
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_15_0 = this;
    float __stackOp1125_15_1 = ((float) ((moom.Dr.b(((double)(this.t)), ((double)(this.v))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill1125_4 = __stackOp1125_15_1;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_15_0)).w = ((float)(__stackOp1125_15_1));
    ((net.minecraft.entity.projectile.EntityArrow)(spill1125_3)).y = ((float)(spill1125_4));
    spill1125_5 = this;
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_20_0 = this;
    float __stackOp1125_20_1 = ((float) ((moom.Dr.b(((double)(this.u)), ((double)(((double) life4_38)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill1125_6 = __stackOp1125_20_1;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_20_0)).x = ((float)(__stackOp1125_20_1));
    ((net.minecraft.entity.projectile.EntityArrow)(spill1125_5)).z = ((float)(spill1125_6));
    }
    life4_78 = new moom.DT(this.aE, this.aF, this.aG);
    life5_83 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life4_78)));
    life6_86 = ((net.minecraft.block.state.IBlockState)(life5_83)).a__ch();
    spill1125_7 = life6_86;
    if (!((life3_7 != null))) {
        forestValue1125_95_0 = spill1125_7;
        break forest_join_95;
    }
    if (!((((net.minecraft.block.Block)(spill1125_7)).a__fn() != moom.fn.a))) {
        break forest_join_122;
    }
    ((net.minecraft.block.Block)(life6_86)).a__Void(((net.minecraft.world.IBlockAccess)(this.i)), ((moom.DT)(life4_78)));
    forestValue1125_95_0 = life6_86;
    }
    life7_106 = ((net.minecraft.block.Block)(forestValue1125_95_0)).a(((net.minecraft.world.World)(this.i)), ((moom.DT)(life4_78)), ((net.minecraft.block.state.IBlockState)(life5_83)));
    spill1125_8 = life7_106;
    if (!((life3_7 != null))) {
        forestValue1125_106_0 = spill1125_8;
        break forest_join_106;
    }
    if (!((spill1125_8 != null))) {
        break forest_join_122;
    }
    forestValue1125_106_0 = life7_106;
    }
    spill1125_9 = ((moom.CA)(forestValue1125_106_0)).a(((moom.DR)(new moom.DR(this.n, this.o, this.p))));
    if (!((life3_7 != null))) {
        forestValue1125_124_0 = ((spill1125_9) ? 1 : 0);
        break forest_join_124;
    }
    if (!(spill1125_9)) {
        break forest_join_122;
    }
    this.aJ = ((boolean)(true));
    }
    forestValue1125_124_0 = this.aL;
    }
    if (!((life3_7 != null))) {
        forestValue1125_137_0 = forestValue1125_124_0;
        break forest_join_137;
    }
    if (!((forestValue1125_124_0 > 0))) {
        break forest_join_133;
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_42_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_42_0)).aL = ((int)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_42_0)).aL - 1)));
    }
    spill1125_10 = this;
    if (!((life3_7 != null))) {
        forestValue1125_219_0 = spill1125_10;
        break forest_join_219;
    }
    forestValue1125_137_0 = ((((net.minecraft.entity.projectile.EntityArrow)(spill1125_10)).aJ) ? 1 : 0);
    }
    if (!((forestValue1125_137_0 != 0))) {
        break forest_join_218;
    }
    life7_153 = ((net.minecraft.block.Block)(life6_86)).b(((net.minecraft.block.state.IBlockState)(life5_83)));
    if (!((life3_7 != null))) {
        break forest_join_213;
    }
    if (!((life6_86 == this.aH))) {
        break forest_join_174;
    }
    spill1125_11 = life7_153;
    spill1125_12 = this.aI;
    if (!((life3_7 != null))) {
        forestValue1125_169_0 = spill1125_11;
        forestValue1125_169_1 = spill1125_12;
        break forest_join_169;
    }
    if (!((spill1125_11 == spill1125_12))) {
        break forest_join_174;
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_50_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_50_0)).aN = ((int)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_50_0)).aN + 1)));
    spill1125_13 = this;
    if (!((life3_7 != null))) {
        forestValue1125_171_0 = spill1125_13;
        break forest_join_171;
    }
    forestValue1125_169_0 = ((net.minecraft.entity.projectile.EntityArrow)(spill1125_13)).aN;
    forestValue1125_169_1 = __sourceIntrinsic_736a66cda11e_invokedynamic1125_54(18027, (7179800174395591212L ^ life1_3));
    }
    if (!((forestValue1125_169_0 >= forestValue1125_169_1))) {
        break forest_join_216;
    }
    forestValue1125_171_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(forestValue1125_171_0)).f__Void();
    if (!((life3_7 == null))) {
        break forest_join_216;
    }
    }
    this.aJ = ((boolean)(false));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_57_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_57_0)).t = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_57_0)).t * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_62_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_62_0)).u = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_62_0)).u * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_67_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_67_0)).v = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_67_0)).v * ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f)))));
    this.aN = ((int)(0));
    }
    this.aO = ((int)(0));
    }
    if (!((life3_7 == null))) {
        break forest_join_1186;
    }
    }
    forestValue1125_219_0 = this;
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_74_0 = forestValue1125_219_0;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_74_0)).aO = ((int)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_74_0)).aO + 1)));
    life7_252 = new moom.DR(this.n, this.o, this.p);
    life8_271 = new moom.DR((this.n + this.t), (this.o + this.u), (this.p + this.v));
    life9_280 = ((net.minecraft.world.World)(this.i)).a(((moom.DR)(life7_252)), ((moom.DR)(life8_271)), ((boolean)(false)), ((boolean)(true)), ((boolean)(false)));
    life7_290 = new moom.DR(this.n, this.o, this.p);
    spill1125_14 = new moom.DR((this.n + this.t), (this.o + this.u), (this.p + this.v));
    if (!((life3_7 != null))) {
        forestValue1125_307_0 = spill1125_14;
        break forest_join_307;
    }
    life8_311 = spill1125_14;
    if (!((life9_280 != null))) {
        break forest_join_308;
    }
    forestValue1125_307_0 = new moom.DR(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life9_280)).d)).a, ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life9_280)).d)).b, ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life9_280)).d)).c);
    }
    life8_311 = forestValue1125_307_0;
    }
    life10_329 = null;
    life11_347 = ((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((moom.CA)(__sourceExactCall_42aefc8ae4edef(((net.minecraft.entity.projectile.EntityArrow)(this))))).a(((double)(this.t)), ((double)(this.u)), ((double)(this.v))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(0x1.0p0d))))));
    life12_349 = 0x0.0p0d;
    life14_352 = ((java.util.List)(life11_347)).iterator();
    forest_cycle_333: while (true) {
    forest_join_395: {
    forest_join_394: {
    forest_join_391: {
    forest_join_355: {
    forest_join_348: {
    if (!(((java.util.Iterator)(life14_352)).hasNext())) {
        break forest_join_397;
    }
    life15_359 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life14_352)).next()));
    spill1125_15 = life15_359;
    if (!((life3_7 != null))) {
        forestValue1125_348_0 = spill1125_15;
        break forest_join_348;
    }
    spill1125_16 = ((net.minecraft.entity.Entity)(spill1125_15)).m__Boolean();
    if (!((life3_7 != null))) {
        forestValue1125_870_0 = ((spill1125_16) ? 1 : 0);
        break forest_join_870;
    }
    if (!(spill1125_16)) {
        break forest_join_395;
    }
    forestValue1125_348_0 = life15_359;
    }
    if (!((forestValue1125_348_0 == this.aM))) {
        break forest_join_355;
    }
    if (!((this.aO >= 5))) {
        break forest_join_395;
    }
    }
    life16_379 = 0x1.333334p-2f;
    life17_389 = ((moom.CA)(__sourceExactCall_5f0a1ab2f67043(((net.minecraft.entity.Entity)(life15_359))))).b(((double)(((double) life16_379))), ((double)(((double) life16_379))), ((double)(((double) life16_379))));
    life18_394 = ((moom.CA)(life17_389)).a(((moom.DR)(life7_290)), ((moom.DR)(life8_311)));
    if (!((life18_394 != null))) {
        break forest_join_395;
    }
    life19_401 = ((moom.DR)(life7_290)).c(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life18_394)).d)));
    spill1125_17 = life19_401;
    if (!((life3_7 != null))) {
        forestValue1125_394_0 = spill1125_17;
        break forest_join_394;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1125_17)), ((double)(life12_349))) >= 0))) {
        break forest_join_391;
    }
    spill1125_18 = life12_349;
    if (!((life3_7 != null))) {
        forestValue1125_394_0 = spill1125_18;
        break forest_join_394;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1125_18)), ((double)(0x0.0p0d))) == 0))) {
        break forest_join_395;
    }
    }
    life10_329 = life15_359;
    forestValue1125_394_0 = life19_401;
    }
    life12_349 = forestValue1125_394_0;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_333;
    }
    break forest_cycle_333;
    }
    }
    if (!((life10_329 != null))) {
        break forest_join_404;
    }
    life9_280 = new net.minecraft.util.MovingObjectPosition(life10_329);
    }
    spill1125_19 = life9_280;
    if (!((life3_7 != null))) {
        forestValue1125_445_0 = spill1125_19;
        break forest_join_445;
    }
    if (!((spill1125_19 != null))) {
        break forest_join_444;
    }
    spill1125_20 = life9_280;
    if (!((life3_7 != null))) {
        forestValue1125_445_0 = spill1125_20;
        break forest_join_445;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(spill1125_20)).e != null))) {
        break forest_join_444;
    }
    spill1125_21 = life9_280;
    if (!((life3_7 != null))) {
        forestValue1125_445_0 = spill1125_21;
        break forest_join_445;
    }
    life15_447 = ((net.minecraft.util.MovingObjectPosition)(spill1125_21)).e;
    if (!((((life15_447 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forest_join_444;
    }
    life14_453 = ((net.minecraft.entity.player.EntityPlayer)(life15_447));
    spill1125_22 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(life14_453)).b1)).a;
    if (!((life3_7 != null))) {
        forestValue1125_433_0 = ((spill1125_22) ? 1 : 0);
        break forest_join_433;
    }
    if (!((!spill1125_22))) {
        break forest_join_442;
    }
    forestValue1125_433_0 = ((this.aM instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life3_7 != null))) {
        forestValue1125_441_0 = forestValue1125_433_0;
        break forest_join_441;
    }
    if (!((forestValue1125_433_0 != 0))) {
        break forest_join_444;
    }
    forestValue1125_441_0 = ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(this.aM)))).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life14_453)))) ? 1 : 0);
    }
    if (!((forestValue1125_441_0 == 0))) {
        break forest_join_444;
    }
    }
    life9_280 = null;
    }
    forestValue1125_445_0 = life9_280;
    }
    if (!((life3_7 != null))) {
        forestValue1125_449_0 = forestValue1125_445_0;
        break forest_join_449;
    }
    if (!((forestValue1125_445_0 != null))) {
        break forest_join_866;
    }
    forestValue1125_449_0 = life9_280;
    }
    if (!((life3_7 != null))) {
        forestValue1125_711_0 = forestValue1125_449_0;
        break forest_join_711;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forestValue1125_449_0)).e != null))) {
        break forest_join_710;
    }
    life14_507 = moom.Dr.a__Float(((double)((((this.t * this.t) + (this.u * this.u)) + (this.v * this.v)))));
    life15_514 = moom.Dr.d(((double)((((double) life14_507) * this.aP))));
    spill1125_23 = this;
    if (!((life3_7 != null))) {
        forestValue1125_496_0 = spill1125_23;
        break forest_join_496;
    }
    if (!(__sourceExactCall_e34e9ed605638f(((net.minecraft.entity.projectile.EntityArrow)(spill1125_23))))) {
        break forest_join_495;
    }
    life15_514 = (life15_514 + ((java.util.Random)(this.ah)).nextInt(((int)(((life15_514 / 2) + 2)))));
    }
    forestValue1125_496_0 = this;
    }
    life16_539 = net.minecraft.util.DamageSource.a(((net.minecraft.entity.projectile.EntityArrow)(forestValue1125_496_0)), ((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(java.util.Objects.requireNonNullElse(((java.lang.Object)(this.aM)), ((java.lang.Object)(this))))))));
    spill1125_24 = ((net.minecraft.entity.projectile.EntityArrow)(this)).r__Boolean();
    if (!((life3_7 != null))) {
        forestValue1125_526_0 = ((spill1125_24) ? 1 : 0);
        break forest_join_526;
    }
    if (!(spill1125_24)) {
        break forest_join_518;
    }
    spill1125_25 = ((((net.minecraft.util.MovingObjectPosition)(life9_280)).e instanceof net.minecraft.entity.monster.EntityEnderman) ? 1 : 0);
    if (!((life3_7 != null))) {
        forestValue1125_526_0 = spill1125_25;
        break forest_join_526;
    }
    if (!((spill1125_25 == 0))) {
        break forest_join_518;
    }
    ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(life9_280)).e)).b(((int)(5)));
    }
    spill1125_26 = ((net.minecraft.util.MovingObjectPosition)(life9_280)).e;
    if (!((life3_7 != null))) {
        forestValue1125_529_0 = spill1125_26;
        break forest_join_529;
    }
    forestValue1125_526_0 = ((((net.minecraft.entity.Entity)(spill1125_26)).a__Boolean(((net.minecraft.util.DamageSource)(life16_539)), ((float)(((float) life15_514))))) ? 1 : 0);
    }
    if (!((forestValue1125_526_0 != 0))) {
        break forest_join_676;
    }
    forestValue1125_529_0 = ((net.minecraft.util.MovingObjectPosition)(life9_280)).e;
    }
    life18_572 = forestValue1125_529_0;
    spill1125_27 = ((life18_572 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life3_7 != null))) {
        forestValue1125_671_0 = spill1125_27;
        break forest_join_671;
    }
    if (!((spill1125_27 != 0))) {
        break forest_join_653;
    }
    life17_581 = ((net.minecraft.entity.EntityLivingBase)(life18_572));
    spill1125_28 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_7 != null))) {
        forestValue1125_552_0 = ((spill1125_28) ? 1 : 0);
        break forest_join_552;
    }
    if (!((!spill1125_28))) {
        break forest_join_550;
    }
    ((net.minecraft.entity.EntityLivingBase)(life17_581)).i(((int)((((net.minecraft.entity.EntityLivingBase)(life17_581)).j__Int() + 1))));
    }
    forestValue1125_552_0 = this.aQ;
    }
    if (!((life3_7 != null))) {
        forestValue1125_605_0 = forestValue1125_552_0;
        break forest_join_605;
    }
    if (!((forestValue1125_552_0 > 0))) {
        break forest_join_600;
    }
    life18_614 = moom.Dr.a__Float(((double)(((this.t * this.t) + (this.v * this.v)))));
    spill1125_29 = recovery.source.CarrierOps.fcmpl(((float)(life18_614)), ((float)(0x0.0p0f)));
    if (!((life3_7 != null))) {
        forestValue1125_605_0 = spill1125_29;
        break forest_join_605;
    }
    if (!((spill1125_29 > 0))) {
        break forest_join_600;
    }
    ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(life9_280)).e)).c(((double)((((this.t * ((double) this.aQ)) * 0x1.333334p-1d) / ((double) life18_614)))), ((double)(0x1.999999999999ap-4d)), ((double)((((this.v * ((double) this.aQ)) * 0x1.333334p-1d) / ((double) life18_614)))));
    }
    spill1125_30 = this.aM;
    if (!((life3_7 != null))) {
        forestValue1125_617_0 = spill1125_30;
        break forest_join_617;
    }
    forestValue1125_605_0 = ((spill1125_30 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((forestValue1125_605_0 != 0))) {
        break forest_join_615;
    }
    moom.rV.a(((net.minecraft.entity.EntityLivingBase)(life17_581)), ((net.minecraft.entity.Entity)(this.aM)));
    moom.rV.b(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(this.aM)))), ((net.minecraft.entity.Entity)(life17_581)));
    }
    forestValue1125_617_0 = this.aM;
    }
    if (!((life3_7 != null))) {
        forestValue1125_670_0 = forestValue1125_617_0;
        break forest_join_670;
    }
    if (!((forestValue1125_617_0 != null))) {
        break forest_join_653;
    }
    spill1125_31 = ((net.minecraft.util.MovingObjectPosition)(life9_280)).e;
    if (!((life3_7 != null))) {
        forestValue1125_670_0 = spill1125_31;
        break forest_join_670;
    }
    if (!((spill1125_31 != this.aM))) {
        break forest_join_653;
    }
    spill1125_32 = ((((net.minecraft.util.MovingObjectPosition)(life9_280)).e instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_7 != null))) {
        forestValue1125_671_0 = spill1125_32;
        break forest_join_671;
    }
    if (!((spill1125_32 != 0))) {
        break forest_join_653;
    }
    spill1125_33 = ((this.aM instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    if (!((life3_7 != null))) {
        forestValue1125_671_0 = spill1125_33;
        break forest_join_671;
    }
    if (!((spill1125_33 != 0))) {
        break forest_join_653;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(this.aM)))).cg)).a(((moom.yK)(new moom.Ac(__sourceIntrinsic_736a66cda11e_invokedynamic1125_203(25347, (526420023818563402L ^ life1_3)), 0x0.0p0f))));
    }
    ((net.minecraft.entity.projectile.EntityArrow)(this)).a(((java.lang.String)("random.bowhit")), ((float)(0x1.0p0f)), ((float)((0x1.333334p0f / ((((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f) + 0x1.ccccccp-1f)))));
    if (!((life3_7 != null))) {
        break forest_join_674;
    }
    forestValue1125_670_0 = ((net.minecraft.util.MovingObjectPosition)(life9_280)).e;
    }
    forestValue1125_671_0 = ((forestValue1125_670_0 instanceof net.minecraft.entity.monster.EntityEnderman) ? 1 : 0);
    }
    if (!((forestValue1125_671_0 == 0))) {
        break forest_join_709;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(this)).f__Void();
    }
    if (!((life3_7 == null))) {
        break forest_join_709;
    }
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_211_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_211_0)).t = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_211_0)).t * -0x1.99999ap-4d)));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_214_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_214_0)).u = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_214_0)).u * -0x1.99999ap-4d)));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_217_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_217_0)).v = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_217_0)).v * -0x1.99999ap-4d)));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_220_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_220_0)).w = ((float)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_220_0)).w + 0x1.68p7f)));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_223_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_223_0)).y = ((float)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_223_0)).y + 0x1.68p7f)));
    this.aO = ((int)(0));
    }
    break forest_join_866;
    }
    forestValue1125_711_0 = life9_280;
    }
    life14_774 = ((net.minecraft.util.MovingObjectPosition)(forestValue1125_711_0)).a();
    this.aE = ((int)(((moom.DT)(life14_774)).a()));
    this.aF = ((int)(__sourceExactCall_83272ff1cb0754(((moom.DT)(life14_774)))));
    this.aG = ((int)(((moom.DT)(life14_774)).c()));
    life15_791 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life14_774)));
    this.aH = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life15_791)).a__ch()));
    this.aI = ((int)(((net.minecraft.block.Block)(this.aH)).b(((net.minecraft.block.state.IBlockState)(life15_791)))));
    this.t = ((double)(((double) ((float) (((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life9_280)).d)).a - this.n)))));
    this.u = ((double)(((double) ((float) (((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life9_280)).d)).b - this.o)))));
    this.v = ((double)(((double) ((float) (((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life9_280)).d)).c - this.p)))));
    life16_850 = moom.Dr.a__Float(((double)((((this.t * this.t) + (this.u * this.u)) + (this.v * this.v)))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_260_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_260_0)).n = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_260_0)).n - ((this.t / ((double) life16_850)) * 0x1.99999ap-5d))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_264_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_264_0)).o = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_264_0)).o - ((this.u / ((double) life16_850)) * 0x1.99999ap-5d))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_268_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_268_0)).p = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_268_0)).p - ((this.v / ((double) life16_850)) * 0x1.99999ap-5d))));
    ((net.minecraft.entity.projectile.EntityArrow)(this)).a(((java.lang.String)("random.bowhit")), ((float)(0x1.0p0f)), ((float)((0x1.333334p0f / ((((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-3f) + 0x1.ccccccp-1f)))));
    this.aJ = ((boolean)(true));
    this.aL = ((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1125_276(14431, (251046356706423828L ^ life1_3))));
    ((net.minecraft.entity.projectile.EntityArrow)(this)).h(((boolean)(false)));
    spill1125_34 = this;
    if (!((life3_7 != null))) {
        forestValue1125_867_0 = spill1125_34;
        break forest_join_867;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.entity.projectile.EntityArrow)(spill1125_34)).aH)).a__fn() != moom.fn.a))) {
        break forest_join_866;
    }
    ((net.minecraft.block.Block)(this.aH)).a(((net.minecraft.world.World)(this.i)), ((moom.DT)(life14_774)), ((net.minecraft.block.state.IBlockState)(life15_791)), ((net.minecraft.entity.Entity)(this)));
    }
    forestValue1125_867_0 = this;
    }
    if (!((life3_7 != null))) {
        forestValue1125_950_0 = forestValue1125_867_0;
        break forest_join_950;
    }
    forestValue1125_870_0 = ((__sourceExactCall_e34e9ed605638f(((net.minecraft.entity.projectile.EntityArrow)(forestValue1125_867_0)))) ? 1 : 0);
    }
    if (!((forestValue1125_870_0 != 0))) {
        break forest_join_928;
    }
    life14_937 = 0;
    forest_cycle_873: while (true) {
    if (!((life14_937 < 4))) {
        break forest_join_928;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.CRIT)), ((double)((this.n + ((this.t * ((double) life14_937)) / 0x1.0p2d)))), ((double)((this.o + ((this.u * ((double) life14_937)) / 0x1.0p2d)))), ((double)((this.p + ((this.v * ((double) life14_937)) / 0x1.0p2d)))), ((double)((-this.t))), ((double)(((-this.u) + 0x1.999999999999ap-3d))), ((double)((-this.v))), ((int[])(new int[0])));
    life14_937 += 1;
    if (!((life3_7 != null))) {
        break forest_join_949;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_873;
    }
    break forest_cycle_873;
    }
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_299_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_299_0)).n = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_299_0)).n + this.t)));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_303_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_303_0)).o = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_303_0)).o + this.u)));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_307_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_307_0)).p = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_307_0)).p + this.v)));
    }
    forestValue1125_950_0 = this;
    }
    life14_1027 = moom.Dr.a__Float(((double)(((((net.minecraft.entity.projectile.EntityArrow)(forestValue1125_950_0)).t * this.t) + (this.v * this.v)))));
    this.w = ((float)(((float) ((moom.Dr.b(((double)(this.t)), ((double)(this.v))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    this.x = ((float)(((float) ((moom.Dr.b(((double)(this.u)), ((double)(((double) life14_1027)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    forest_cycle_986: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.x - this.z))), ((float)(-0x1.68p7f))) < 0))) {
        break forest_join_1004;
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_326_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_326_0)).z = ((float)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_326_0)).z - 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break forest_join_1022;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_986;
    }
    break forest_cycle_986;
    }
    }
    forest_cycle_1004: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.x - this.z))), ((float)(0x1.68p7f))) >= 0))) {
        break forest_join_1022;
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_332_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_332_0)).z = ((float)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_332_0)).z + 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break forest_join_1040;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_1004;
    }
    break forest_cycle_1004;
    }
    }
    forest_cycle_1022: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((this.w - this.y))), ((float)(-0x1.68p7f))) < 0))) {
        break forest_join_1040;
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_338_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_338_0)).y = ((float)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_338_0)).y - 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break forest_join_1082;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_1022;
    }
    break forest_cycle_1022;
    }
    }
    forest_cycle_1040: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((this.w - this.y))), ((float)(0x1.68p7f))) >= 0))) {
        break forest_join_1058;
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_344_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_344_0)).y = ((float)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_344_0)).y + 0x1.68p8f)));
    if (!((life3_7 != null))) {
        break forest_join_1082;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_1040;
    }
    break forest_cycle_1040;
    }
    }
    this.x = ((float)((this.z + ((this.x - this.z) * 0x1.99999ap-3f))));
    this.w = ((float)((this.y + ((this.w - this.y) * 0x1.99999ap-3f))));
    }
    life15_1155 = 0x1.fae148p-1f;
    life16_1157 = 0x1.99999ap-5f;
    spill1125_35 = ((net.minecraft.entity.projectile.EntityArrow)(this)).j__Boolean();
    if (!((life3_7 != null))) {
        forestValue1125_1145_0 = ((spill1125_35) ? 1 : 0);
        break forest_join_1145;
    }
    if (!(spill1125_35)) {
        break forest_join_1141;
    }
    life17_1165 = 0;
    forest_cycle_1093: while (true) {
    if (!((life17_1165 < 4))) {
        break forest_join_1139;
    }
    life18_1170 = 0x1.0p-2f;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)((this.n - (this.t * ((double) life18_1170))))), ((double)((this.o - (this.u * ((double) life18_1170))))), ((double)((this.p - (this.v * ((double) life18_1170))))), ((double)(this.t)), ((double)(this.u)), ((double)(this.v)), ((int[])(new int[0])));
    life17_1165 += 1;
    if (!((life3_7 != null))) {
        break forest_join_1141;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_1093;
    }
    break forest_cycle_1093;
    }
    }
    life15_1155 = 0x1.333334p-1f;
    }
    spill1125_36 = this;
    if (!((life3_7 != null))) {
        forestValue1125_1185_0 = spill1125_36;
        break forest_join_1185;
    }
    forestValue1125_1145_0 = ((((net.minecraft.entity.projectile.EntityArrow)(spill1125_36)).i__Boolean()) ? 1 : 0);
    }
    if (!((forestValue1125_1145_0 != 0))) {
        break forest_join_1148;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(this)).j();
    }
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_372_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_372_0)).t = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_372_0)).t * ((double) life15_1155))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_375_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_375_0)).u = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_375_0)).u * ((double) life15_1155))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_378_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_378_0)).v = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_378_0)).v * ((double) life15_1155))));
    net.minecraft.entity.projectile.EntityArrow __stackOp1125_381_0 = this;
    ((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_381_0)).u = ((double)((((net.minecraft.entity.projectile.EntityArrow)(__stackOp1125_381_0)).u - ((double) life16_1157))));
    ((net.minecraft.entity.projectile.EntityArrow)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    forestValue1125_1185_0 = this;
    }
    ((net.minecraft.entity.projectile.EntityArrow)(forestValue1125_1185_0)).m();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_5f5fadf1ff21_invokedynamic5444_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11858_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5445_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite2014_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1125_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1125_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1125_276(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8699ed5f13ef_invokedynamic6107_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8699ed5f13ef_invokedynamic6107_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8699ed5f13ef_invokedynamic6107_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8699ed5f13ef_invokedynamic6107_11(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_9ceb00d3a5cff8(int p0, long p1);
private static native net.minecraft.block.Block __sourceExactCall_85597be21a945e(java.lang.String p0);
private static native net.minecraft.block.Block __sourceExactCall_c520ab7951a8e1(int p0);

private static native moom.CA __sourceExactCall_42aefc8ae4edef(net.minecraft.entity.projectile.EntityArrow p0);
private static native moom.CA __sourceExactCall_5f0a1ab2f67043(net.minecraft.entity.Entity p0);
private static native boolean __sourceExactCall_e34e9ed605638f(net.minecraft.entity.projectile.EntityArrow p0);
private static native int __sourceExactCall_83272ff1cb0754(moom.DT p0);
}
