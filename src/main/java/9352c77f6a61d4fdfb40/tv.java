package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tv extends net.minecraft.entity.Entity {

private boolean aE;

private double aF;

private int aG;

private double aH;

private double aI;

private double aJ;

private double aK;

private double aL;

private double aM;

private double aN;

private double aO;

private static final long bb;

private static final long[] cb;

private static final java.lang.Integer[] db;

private static final java.util.Map eb;

public tv(net.minecraft.world.World p0, double p1, double p2, double p3) {
this(p0);
    (this).a__Void(p1, p2, p3);
    this.t = 0x0.0p+0d;
    this.u = 0x0.0p+0d;
    this.v = 0x0.0p+0d;
    this.k = p1;
    this.l = p2;
    this.m = p3;
}


public tv(net.minecraft.world.World p0) {
super(p0);
    this.aE = true;
    this.aF = 0x1.1eb851eb851ecp-4d;
    this.e = true;
    (this).a__Void(0x1.8000000000000p+0f, 0x1.3333340000000p-1f);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-5903555475653218715L)), ((long)(1938445750271008597L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101303811295610L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tv.bb ^ 101627849612187L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1571_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1571_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1571_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1571_14 = new byte[8];
    (__sourceSpill1571_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1571_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1571_16 = __sourceSpill1571_14;
    ((javax.crypto.Cipher)(__sourceSpill1571_11)).init(((int)(__sourceSpill1571_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1571_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1571_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[9];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "oË·\026¡Þ\001v¦­\016-ºPÅ¾'\0177\b¡ÄúÔ\033è¯¿½qÎônFñ=_\001óCèm£\016ÎmÌÞÆ\032×¨"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1571_25 = local6_life21;
        int __sourceSpill1571_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1571_25)).substring(((int)(__sourceSpill1571_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1571_30 = local8_life19;
        int __sourceSpill1571_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1571_33 = new byte[8];
        (__sourceSpill1571_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1571_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1571_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1571_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1571_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1571_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1571_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1571_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1571_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1571_34)).doFinal(((byte[])(__sourceSpill1571_33)));
        (__sourceSpill1571_30)[__sourceSpill1571_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÚY²\034ù\005*P8Mó6[ ]"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1571_38 = local6_life21;
        int __sourceSpill1571_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1571_38)).substring(((int)(__sourceSpill1571_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1571_43 = local8_life19;
        int __sourceSpill1571_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1571_46 = new byte[8];
        (__sourceSpill1571_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1571_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1571_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1571_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1571_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1571_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1571_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1571_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1571_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1571_47)).doFinal(((byte[])(__sourceSpill1571_46)));
        (__sourceSpill1571_43)[__sourceSpill1571_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[9]));
}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
moom.tv forwardValue4104_24_0;
    int forwardValue4104_26_0;
    int forwardValue4104_33_0;
    moom.tv spill4104_0;
    int spill4104_1;
    moom.tv spill4104_2;
    long life2_3;
    int life4_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_26: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (moom.tv.bb ^ 73103844659453L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4104_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue4104_24_0 = spill4104_0;
        break forward_join_24;
    }
    if (!((((moom.tv)(spill4104_0)).f != null))) {
        break forward_join_23;
    }
    spill4104_1 = ((((moom.tv)(this)).f instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4104_26_0 = spill4104_1;
        break forward_join_26;
    }
    if (!((spill4104_1 != 0))) {
        break forward_join_23;
    }
    spill4104_2 = this;
    if (!((life4_5 == 0))) {
        forwardValue4104_24_0 = spill4104_2;
        break forward_join_24;
    }
    if (!((((moom.tv)(spill4104_2)).f == p0))) {
        break forward_join_32;
    }
    }
    forwardValue4104_24_0 = this;
    }
    forwardValue4104_26_0 = ((((net.minecraft.world.World)(((moom.tv)(forwardValue4104_24_0)).i)).G) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue4104_33_0 = forwardValue4104_26_0;
        break forward_join_33;
    }
    if (!((forwardValue4104_26_0 == 0))) {
        break forward_join_32;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).b(((net.minecraft.entity.Entity)(this)));
    }
    forwardValue4104_33_0 = 1;
    }
    return ((forwardValue4104_33_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9227_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b__sourceReturn_8abf5c6871() {
long local1 = (moom.tv.bb ^ 74951416394488L);
    return ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).a__Int(((int)(__sourceIntrinsic_e1958f95391c_originalDynamicSite1657_2(10015, (75109636780139341L ^ local1)))));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20662;
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
            throw new RuntimeException("moom/tv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tv.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public double e() {
return -0x1.3333333333333p-2d;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


public void c(float p0) {
long local2 = (moom.tv.bb ^ 107829254194709L);
    ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).b(((int)(__sourceIntrinsic_c0891f2beaed_originalDynamicSite1658_2(18101, (5547273686631708171L ^ local2)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(p0))))));
    return;
}


public boolean n__Boolean() {
return ((1) != 0);
}


public void h(int p0) {
long local2 = (moom.tv.bb ^ 85597222319300L);
    ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).b(((int)(__sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1659_2(29889, (2701141063201027755L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


public void h(boolean p0) {
this.aE = ((boolean)(p0));
    return;
}


protected void d__Void() {
long local1 = (moom.tv.bb ^ 77246855603414L);
    ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1660_2(20731, (6964616334307230347L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1660_6(29889, (2701151406671636153L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(1))))));
    ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1660_10(31483, (2510095194728578L ^ local1)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(0x0.0p0f))))));
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


public void d(double p0, double p1, double p2) {
moom.tv __sourceSpill742_0 = this;
    moom.tv __stackOp742_1_0 = this;
    double __stackOp742_1_1 = p0;
    double __sourceSpill742_3 = __stackOp742_1_1;
    ((moom.tv)(__stackOp742_1_0)).t = ((double)(__stackOp742_1_1));
    ((moom.tv)(__sourceSpill742_0)).aM = ((double)(__sourceSpill742_3));
    moom.tv __sourceSpill742_5 = this;
    moom.tv __stackOp742_6_0 = this;
    double __stackOp742_6_1 = p1;
    double __sourceSpill742_8 = __stackOp742_6_1;
    ((moom.tv)(__stackOp742_6_0)).u = ((double)(__stackOp742_6_1));
    ((moom.tv)(__sourceSpill742_5)).aN = ((double)(__sourceSpill742_8));
    moom.tv __sourceSpill742_10 = this;
    moom.tv __stackOp742_11_0 = this;
    double __stackOp742_11_1 = p2;
    double __sourceSpill742_13 = __stackOp742_11_1;
    ((moom.tv)(__stackOp742_11_0)).v = ((double)(__stackOp742_11_1));
    ((moom.tv)(__sourceSpill742_10)).aO = ((double)(__sourceSpill742_13));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4103_17_0;
    net.minecraft.entity.Entity forwardValue4103_68_0;
    int forwardValue4103_69_0;
    int forwardValue4103_77_0;
    int forwardValue4103_81_0;
    int forwardValue4103_83_0;
    int forwardValue4103_92_0;
    net.minecraft.entity.Entity forwardValue4103_102_0;
    int forwardValue4103_115_0;
    moom.tv forwardValue4103_123_0;
    int forwardValue4103_125_0;
    int forwardValue4103_127_0;
    boolean spill4103_0;
    boolean spill4103_1;
    net.minecraft.entity.Entity spill4103_2;
    net.minecraft.entity.Entity spill4103_3;
    int spill4103_4;
    int spill4103_5;
    net.minecraft.entity.Entity spill4103_6;
    int spill4103_7;
    moom.tv spill4103_8;
    long life3_3;
    int life5_5;
    int life6_126;
    forward_join_127: {
    forward_join_126: {
    forward_join_125: {
    forward_join_124: {
    forward_join_123: {
    forward_join_122: {
    forward_join_115: {
    forward_join_104: {
    forward_join_102: {
    forward_join_95: {
    forward_join_92: {
    forward_join_83: {
    forward_join_82: {
    forward_join_81: {
    forward_join_77: {
    forward_join_69: {
    forward_join_68: {
    forward_join_44: {
    forward_join_17: {
    forward_join_14: {
    life3_3 = (moom.tv.bb ^ 94020907046919L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4103_0 = ((moom.tv)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue4103_17_0 = ((spill4103_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill4103_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4103_17_0 = ((((net.minecraft.world.World)(((moom.tv)(this)).i)).G) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4103_127_0 = forwardValue4103_17_0;
        break forward_join_127;
    }
    if (!((forwardValue4103_17_0 == 0))) {
        break forward_join_126;
    }
    spill4103_1 = ((moom.tv)(this)).F;
    if (!((life5_5 == 0))) {
        forwardValue4103_127_0 = ((spill4103_1) ? 1 : 0);
        break forward_join_127;
    }
    if (!((!spill4103_1))) {
        break forward_join_126;
    }
    spill4103_2 = ((moom.tv)(this)).f;
    if (!((life5_5 == 0))) {
        forwardValue4103_68_0 = spill4103_2;
        break forward_join_68;
    }
    if (!((spill4103_2 != null))) {
        break forward_join_44;
    }
    spill4103_3 = ((moom.tv)(this)).f;
    if (!((life5_5 == 0))) {
        forwardValue4103_68_0 = spill4103_3;
        break forward_join_68;
    }
    if (!((spill4103_3 == ((net.minecraft.util.DamageSource)(p0)).b__r3()))) {
        break forward_join_44;
    }
    spill4103_4 = ((p0 instanceof moom.CW) ? 1 : 0);
    if (!((life5_5 == 0))) {
        forwardValue4103_69_0 = spill4103_4;
        break forward_join_69;
    }
    if (!((spill4103_4 != 0))) {
        break forward_join_44;
    }
    return ((0) != 0);
    }
    ((moom.tv)(this)).h(((int)((-((moom.tv)(this)).b__sourceReturn_8abf5c6871()))));
    ((moom.tv)(this)).g(((int)(__sourceIntrinsic_153a193fc182_invokedynamic4103_17(21485, (2196674078266293571L ^ life3_3)))));
    ((moom.tv)(this)).c(((float)((((moom.tv)(this)).a() + (p1 * 0x1.4p3f)))));
    ((moom.tv)(this)).q();
    forwardValue4103_68_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    forwardValue4103_69_0 = ((forwardValue4103_68_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4103_77_0 = forwardValue4103_69_0;
        break forward_join_77;
    }
    if (!((forwardValue4103_69_0 != 0))) {
        break forward_join_82;
    }
    forwardValue4103_77_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.util.DamageSource)(p0)).b__r3())))).b1)).d) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4103_81_0 = forwardValue4103_77_0;
        break forward_join_81;
    }
    if (!((forwardValue4103_77_0 != 0))) {
        break forward_join_82;
    }
    forwardValue4103_81_0 = 1;
    }
    forwardValue4103_83_0 = forwardValue4103_81_0;
    break forward_join_83;
    }
    forwardValue4103_83_0 = 0;
    }
    life6_126 = forwardValue4103_83_0;
    spill4103_5 = life6_126;
    if (!((life5_5 == 0))) {
        forwardValue4103_92_0 = spill4103_5;
        break forward_join_92;
    }
    if (!((spill4103_5 == 0))) {
        break forward_join_95;
    }
    forwardValue4103_92_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.tv)(this)).a())), ((float)(0x1.4p5f)));
    }
    if (!((life5_5 == 0))) {
        forwardValue4103_125_0 = forwardValue4103_92_0;
        break forward_join_125;
    }
    if (!((forwardValue4103_92_0 > 0))) {
        break forward_join_124;
    }
    }
    spill4103_6 = ((moom.tv)(this)).f;
    if (!((life5_5 == 0))) {
        forwardValue4103_102_0 = spill4103_6;
        break forward_join_102;
    }
    if (!((spill4103_6 != null))) {
        break forward_join_104;
    }
    forwardValue4103_102_0 = ((moom.tv)(this)).f;
    }
    ((net.minecraft.entity.Entity)(forwardValue4103_102_0)).b(((net.minecraft.entity.Entity)(this)));
    }
    spill4103_7 = life6_126;
    if (!((life5_5 == 0))) {
        forwardValue4103_115_0 = spill4103_7;
        break forward_join_115;
    }
    if (!((spill4103_7 == 0))) {
        break forward_join_122;
    }
    spill4103_8 = this;
    if (!((life5_5 == 0))) {
        forwardValue4103_123_0 = spill4103_8;
        break forward_join_123;
    }
    forwardValue4103_115_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.tv)(spill4103_8)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops")))) ? 1 : 0);
    }
    if (!((forwardValue4103_115_0 != 0))) {
        break forward_join_122;
    }
    ((moom.tv)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aE)), ((int)(1)), ((float)(0x0.0p0f)));
    }
    forwardValue4103_123_0 = this;
    }
    ((moom.tv)(forwardValue4103_123_0)).f__Void();
    }
    forwardValue4103_125_0 = 1;
    }
    return ((forwardValue4103_125_0) != 0);
    }
    forwardValue4103_127_0 = 1;
    }
    return ((forwardValue4103_127_0) != 0);
}


public int a__Int() {
long local1 = (moom.tv.bb ^ 119873373626673L);
    return ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).a__Int(((int)(__sourceIntrinsic_0bbed5b41c99_originalDynamicSite1662_2(13224, (1146733884490638389L ^ local1)))));
}


public moom.CA a__CA() {
return ((moom.tv)(this)).b();
}


public moom.CA a__CA(net.minecraft.entity.Entity p0) {
return ((net.minecraft.entity.Entity)(p0)).b();
}


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) {
moom.tv forwardValue4101_68_0;
    int forwardValue4101_71_0;
    moom.tv forwardValue4101_73_0;
    boolean spill4101_0;
    moom.tv spill4101_1;
    moom.tv spill4101_2;
    double spill4101_3;
    moom.tv spill4101_4;
    double spill4101_5;
    moom.tv spill4101_6;
    double spill4101_7;
    moom.tv spill4101_8;
    double spill4101_9;
    moom.tv spill4101_10;
    double spill4101_11;
    moom.tv spill4101_12;
    double spill4101_13;
    long life11_3;
    int life13_5;
    double life14_101;
    double life16_106;
    double life18_111;
    double life20_123;
    forward_join_147: {
    forward_join_118: {
    forward_join_111: {
    forward_join_79: {
    forward_join_73: {
    forward_join_71: {
    forward_join_68: {
    forward_join_67: {
    life11_3 = (moom.tv.bb ^ 65385184377439L);
    life13_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4101_0 = p6;
    if (!((life13_5 != 0))) {
        forwardValue4101_71_0 = ((spill4101_0) ? 1 : 0);
        break forward_join_71;
    }
    if (!(spill4101_0)) {
        break forward_join_67;
    }
    spill4101_1 = this;
    if (!((life13_5 != 0))) {
        forwardValue4101_68_0 = spill4101_1;
        break forward_join_68;
    }
    if (!((((moom.tv)(spill4101_1)).f != null))) {
        break forward_join_67;
    }
    spill4101_2 = this;
    moom.tv __stackOp4101_4_0 = this;
    double __stackOp4101_4_1 = p0;
    spill4101_3 = __stackOp4101_4_1;
    ((moom.tv)(__stackOp4101_4_0)).n = ((double)(__stackOp4101_4_1));
    ((moom.tv)(spill4101_2)).k = ((double)(spill4101_3));
    spill4101_4 = this;
    moom.tv __stackOp4101_7_0 = this;
    double __stackOp4101_7_1 = p1;
    spill4101_5 = __stackOp4101_7_1;
    ((moom.tv)(__stackOp4101_7_0)).o = ((double)(__stackOp4101_7_1));
    ((moom.tv)(spill4101_4)).l = ((double)(spill4101_5));
    spill4101_6 = this;
    moom.tv __stackOp4101_10_0 = this;
    double __stackOp4101_10_1 = p2;
    spill4101_7 = __stackOp4101_10_1;
    ((moom.tv)(__stackOp4101_10_0)).p = ((double)(__stackOp4101_10_1));
    ((moom.tv)(spill4101_6)).m = ((double)(spill4101_7));
    ((moom.tv)(this)).w = ((float)(p3));
    ((moom.tv)(this)).x = ((float)(p4));
    this.aG = ((int)(0));
    ((moom.tv)(this)).a__Void(((double)(p0)), ((double)(p1)), ((double)(p2)));
    spill4101_8 = this;
    moom.tv __stackOp4101_17_0 = this;
    double __stackOp4101_17_1 = 0x0.0p0d;
    spill4101_9 = __stackOp4101_17_1;
    ((moom.tv)(__stackOp4101_17_0)).aM = ((double)(__stackOp4101_17_1));
    ((moom.tv)(spill4101_8)).t = ((double)(spill4101_9));
    spill4101_10 = this;
    moom.tv __stackOp4101_20_0 = this;
    double __stackOp4101_20_1 = 0x0.0p0d;
    spill4101_11 = __stackOp4101_20_1;
    ((moom.tv)(__stackOp4101_20_0)).aN = ((double)(__stackOp4101_20_1));
    ((moom.tv)(spill4101_10)).u = ((double)(spill4101_11));
    spill4101_12 = this;
    moom.tv __stackOp4101_23_0 = this;
    double __stackOp4101_23_1 = 0x0.0p0d;
    spill4101_13 = __stackOp4101_23_1;
    ((moom.tv)(__stackOp4101_23_0)).aO = ((double)(__stackOp4101_23_1));
    ((moom.tv)(spill4101_12)).v = ((double)(spill4101_13));
    if (!((life13_5 == 0))) {
        break forward_join_147;
    }
    }
    forwardValue4101_68_0 = this;
    }
    if (!((life13_5 != 0))) {
        forwardValue4101_73_0 = forwardValue4101_68_0;
        break forward_join_73;
    }
    forwardValue4101_71_0 = ((((moom.tv)(forwardValue4101_68_0)).aE) ? 1 : 0);
    }
    if (!((forwardValue4101_71_0 != 0))) {
        break forward_join_79;
    }
    forwardValue4101_73_0 = this;
    }
    ((moom.tv)(forwardValue4101_73_0)).aG = ((int)((p5 + 5)));
    if (!((life13_5 == 0))) {
        break forward_join_118;
    }
    }
    life14_101 = (p0 - ((moom.tv)(this)).n);
    life16_106 = (p1 - ((moom.tv)(this)).o);
    life18_111 = (p2 - ((moom.tv)(this)).p);
    life20_123 = (((life14_101 * life14_101) + (life16_106 * life16_106)) + (life18_111 * life18_111));
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life20_123)), ((double)(0x1.0p0d))) <= 0))) {
        break forward_join_111;
    }
    return;
    }
    this.aG = ((int)(__sourceIntrinsic_09f962f6db15_invokedynamic4101_33(21275, (8275510133423857644L ^ life11_3))));
    }
    this.aH = ((double)(p0));
    this.aI = ((double)(p1));
    this.aJ = ((double)(p2));
    this.aK = ((double)(((double) p3)));
    this.aL = ((double)(((double) p4)));
    ((moom.tv)(this)).t = ((double)(this.aM));
    ((moom.tv)(this)).u = ((double)(this.aN));
    ((moom.tv)(this)).v = ((double)(this.aO));
    }
    return;
}


public float a() {
long local1 = (moom.tv.bb ^ 37175101216760L);
    return ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).a__Float(((int)(__sourceIntrinsic_76940a5779a0_originalDynamicSite1663_2(31483, (2407268968537004L ^ local1)))));
}


protected void a(double p0, boolean p1, net.minecraft.block.Block p2, moom.DT p3) {
int lexicalValue1325_14_0;
    int lexicalValue1325_27_0;
    moom.tv lexicalValue1325_77_0;
    boolean spill1325_0;
    moom.tv spill1325_1;
    moom.tv spill1325_2;
    moom.tv spill1325_3;
    long life6_3;
    int life8_5;
    int life9_71;
    lexical_join_105: {
    lexical_join_81: {
    lexical_join_79: {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_62: {
    lexical_join_60: {
    lexical_join_27: {
    lexical_join_14: {
    life6_3 = (moom.tv.bb ^ 117641433972195L);
    life8_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill1325_0 = p1;
    if (!((life8_5 == 0))) {
        lexicalValue1325_14_0 = ((spill1325_0) ? 1 : 0);
        break lexical_join_14;
    }
    if (!(spill1325_0)) {
        break lexical_join_81;
    }
    lexicalValue1325_14_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.tv)(this)).L)), ((float)(0x1.8p1f)));
    }
    if (!((life8_5 == 0))) {
        lexicalValue1325_27_0 = lexicalValue1325_14_0;
        break lexical_join_27;
    }
    if (!((lexicalValue1325_14_0 > 0))) {
        break lexical_join_105;
    }
    ((moom.tv)(this)).d(((float)(((moom.tv)(this)).L)), ((float)(0x1.0p0f)));
    spill1325_1 = this;
    if (!((life8_5 == 0))) {
        lexicalValue1325_77_0 = spill1325_1;
        break lexical_join_77;
    }
    lexicalValue1325_27_0 = ((((net.minecraft.world.World)(((moom.tv)(spill1325_1)).i)).G) ? 1 : 0);
    }
    if (!((lexicalValue1325_27_0 == 0))) {
        break lexical_join_76;
    }
    spill1325_2 = this;
    if (!((life8_5 == 0))) {
        lexicalValue1325_77_0 = spill1325_2;
        break lexical_join_77;
    }
    if (!((!((moom.tv)(spill1325_2)).F))) {
        break lexical_join_76;
    }
    ((moom.tv)(this)).f__Void();
    spill1325_3 = this;
    if (!((life8_5 == 0))) {
        lexicalValue1325_77_0 = spill1325_3;
        break lexical_join_77;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.tv)(spill1325_3)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break lexical_join_76;
    }
    life9_71 = 0;
    lexical_cycle_45: while (true) {
    if (!((life9_71 < 3))) {
        break lexical_join_60;
    }
    ((moom.tv)(this)).a(((net.minecraft.item.Item)(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((int)(1)), ((float)(0x0.0p0f)));
    life9_71 += 1;
    if (!((life8_5 == 0))) {
        break lexical_join_62;
    }
    if (!((life8_5 != 0))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    life9_71 = 0;
    }
    lexical_cycle_62: while (true) {
    if (!((life9_71 < 2))) {
        break lexical_join_76;
    }
    ((moom.tv)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.y)), ((int)(1)), ((float)(0x0.0p0f)));
    life9_71 += 1;
    if (!((life8_5 == 0))) {
        break lexical_join_79;
    }
    if (!((life8_5 != 0))) { continue lexical_cycle_62; }
    break lexical_cycle_62;
    }
    }
    lexicalValue1325_77_0 = this;
    }
    ((moom.tv)(lexicalValue1325_77_0)).L = ((float)(0x0.0p0f));
    }
    if (!((life8_5 != 0))) {
        break lexical_join_105;
    }
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.tv)(this)).i)).a__fE(((moom.DT)(((moom.DT)(new moom.DT(this))).b__DT()))))).a__ch())).a__fn() != moom.fn.h))) {
        break lexical_join_105;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(0x0.0p0d))) < 0))) {
        break lexical_join_105;
    }
    ((moom.tv)(this)).L = ((float)(((float) (((double) ((moom.tv)(this)).L) - p0))));
    }
    return;
}


public boolean m__Boolean() {
int forwardValue4106_12_0;
    int forwardValue4106_14_0;
    boolean spill4106_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.tv.bb ^ 56323961966997L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4106_0 = ((moom.tv)(this)).F;
    if (!((life3_5 != 0))) {
        forwardValue4106_12_0 = ((spill4106_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill4106_0))) {
        break forward_join_13;
    }
    forwardValue4106_12_0 = 1;
    }
    forwardValue4106_14_0 = forwardValue4106_12_0;
    break forward_join_14;
    }
    forwardValue4106_14_0 = 0;
    }
    return ((forwardValue4106_14_0) != 0);
}


public void t__Void() {
moom.tv forwardValue4107_12_0;
    moom.tv spill4107_0;
    long life1_3;
    int life3_5;
    double life4_27;
    double life6_38;
    forward_join_53: {
    forward_join_12: {
    life1_3 = (moom.tv.bb ^ 68798613735323L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4107_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4107_12_0 = spill4107_0;
        break forward_join_12;
    }
    if (!((((moom.tv)(spill4107_0)).f != null))) {
        break forward_join_53;
    }
    forwardValue4107_12_0 = this;
    }
    life4_27 = (java.lang.Math.cos(((double)(((((double) ((moom.tv)(forwardValue4107_12_0)).w) * 0x1.921fb54442d18p1d) / 0x1.68p7d)))) * 0x1.999999999999ap-2d);
    life6_38 = (java.lang.Math.sin(((double)(((((double) ((moom.tv)(this)).w) * 0x1.921fb54442d18p1d) / 0x1.68p7d)))) * 0x1.999999999999ap-2d);
    ((net.minecraft.entity.Entity)(((moom.tv)(this)).f)).a__Void(((double)((((moom.tv)(this)).n + life4_27))), ((double)(((((moom.tv)(this)).o + ((moom.tv)(this)).e()) + ((net.minecraft.entity.Entity)(((moom.tv)(this)).f)).d()))), ((double)((((moom.tv)(this)).p + life6_38))));
    }
    return;
}


public void g(int p0) {
long local2 = (moom.tv.bb ^ 111141725155749L);
    ((net.minecraft.entity.DataWatcher)(((moom.tv)(this)).al)).b(((int)(__sourceIntrinsic_a08a1913beb2_originalDynamicSite1664_2(20731, (6964652943734429688L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public void g__Void() {
int lexicalValue1326_23_0;
    int lexicalValue1326_45_0;
    moom.tv lexicalValue1326_134_0;
    moom.tv lexicalValue1326_257_0;
    int lexicalValue1326_302_0;
    moom.tv lexicalValue1326_411_0;
    moom.tv lexicalValue1326_469_0;
    int lexicalValue1326_479_0;
    int lexicalValue1326_504_0;
    moom.tv lexicalValue1326_512_0;
    moom.tv lexicalValue1326_582_0;
    int lexicalValue1326_621_0;
    int lexicalValue1326_669_0;
    int lexicalValue1326_676_0;
    net.minecraft.block.Block lexicalValue1326_751_0;
    net.minecraft.block.Block lexicalValue1326_751_1;
    int lexicalValue1326_769_0;
    int lexicalValue1326_802_0;
    int lexicalValue1326_814_0;
    moom.tv lexicalValue1326_878_0;
    moom.tv lexicalValue1326_887_0;
    double lexicalValue1326_928_0;
    double lexicalValue1326_928_1;
    int lexicalValue1326_942_0;
    int lexicalValue1326_966_0;
    net.minecraft.world.World lexicalValue1326_969_0;
    java.util.List lexicalValue1326_983_0;
    java.util.List lexicalValue1326_988_0;
    net.minecraft.entity.Entity lexicalValue1326_1006_0;
    int lexicalValue1326_1014_0;
    net.minecraft.entity.Entity lexicalValue1326_1016_0;
    net.minecraft.entity.Entity lexicalValue1326_1022_0;
    net.minecraft.entity.Entity lexicalValue1326_1029_0;
    moom.tv lexicalValue1326_1032_0;
    int spill1326_0;
    int spill1326_1;
    moom.tv spill1326_2;
    int spill1326_3;
    moom.tv spill1326_4;
    boolean spill1326_5;
    boolean spill1326_6;
    moom.tv spill1326_7;
    moom.tv spill1326_8;
    moom.tv spill1326_9;
    moom.tv spill1326_10;
    int spill1326_11;
    int spill1326_12;
    int spill1326_13;
    int spill1326_14;
    net.minecraft.block.Block spill1326_15;
    net.minecraft.block.Block spill1326_16;
    moom.tv spill1326_17;
    int spill1326_18;
    moom.tv spill1326_19;
    moom.tv spill1326_20;
    moom.tv spill1326_21;
    double spill1326_22;
    double spill1326_23;
    int spill1326_24;
    net.minecraft.world.World spill1326_25;
    java.util.List spill1326_26;
    net.minecraft.entity.Entity spill1326_27;
    boolean spill1326_28;
    net.minecraft.entity.Entity spill1326_29;
    moom.tv spill1326_30;
    long life1_3;
    int life3_7;
    int life4_57;
    double life5_59;
    int life7_61;
    double life8_84;
    double life10_106;
    moom.CA life12_124;
    double life7_163;
    double life9_181;
    double life11_190;
    int life13_192;
    double life14_210;
    double life16_222;
    double life18_249;
    double life20_262;
    double life18_296;
    double life20_307;
    double life9_372;
    double life11_385;
    double life13_398;
    double life15_406;
    double life9_463;
    double life11_469;
    double life13_475;
    double life9_547;
    net.minecraft.entity.Entity life10_590;
    net.minecraft.entity.EntityLivingBase life9_596;
    float life10_606;
    double life9_662;
    double life11_675;
    int life11_775;
    int life12_791;
    int life13_804;
    int life14_808;
    int life15_817;
    moom.DT life16_824;
    net.minecraft.block.Block life17_830;
    int life11_978;
    double life11_1048;
    double life13_1054;
    double life15_1060;
    double life17_1092;
    java.util.List life19_1151;
    java.util.Iterator life20_1172;
    net.minecraft.entity.Entity life21_1179;
    lexical_join_1034: {
    lexical_join_1032: {
    lexical_join_1029: {
    lexical_join_1022: {
    lexical_join_1020: {
    lexical_join_988: {
    lexical_join_983: {
    lexical_join_969: {
    lexical_join_966: {
    lexical_join_947: {
    lexical_join_942: {
    lexical_join_939: {
    lexical_join_928: {
    lexical_join_924: {
    lexical_join_887: {
    lexical_join_886: {
    lexical_join_883: {
    lexical_join_878: {
    lexical_join_865: {
    lexical_join_863: {
    lexical_join_849: {
    lexical_join_847: {
    lexical_join_814: {
    lexical_join_802: {
    lexical_join_790: {
    lexical_join_769: {
    lexical_join_767: {
    lexical_join_676: {
    lexical_join_675: {
    lexical_join_669: {
    lexical_join_654: {
    lexical_join_621: {
    lexical_join_618: {
    lexical_join_582: {
    lexical_join_581: {
    lexical_join_517: {
    lexical_join_512: {
    lexical_join_511: {
    lexical_join_504: {
    lexical_join_498: {
    lexical_join_479: {
    lexical_join_476: {
    lexical_join_469: {
    lexical_join_456: {
    lexical_join_411: {
    lexical_join_410: {
    lexical_join_302: {
    lexical_join_299: {
    lexical_join_134: {
    lexical_join_133: {
    lexical_join_45: {
    lexical_join_32: {
    lexical_join_23: {
    lexical_join_19: {
    life1_3 = (moom.tv.bb ^ 7395062446065L);
    spill1326_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.g__Void();
    life3_7 = spill1326_0;
    spill1326_1 = ((moom.tv)(this)).a__Int();
    if (!((life3_7 != 0))) {
        lexicalValue1326_23_0 = spill1326_1;
        break lexical_join_23;
    }
    if (!((spill1326_1 > 0))) {
        break lexical_join_19;
    }
    ((moom.tv)(this)).g(((int)((((moom.tv)(this)).a__Int() - 1))));
    }
    lexicalValue1326_23_0 = recovery.source.CarrierOps.fcmpl(((float)(((moom.tv)(this)).a())), ((float)(0x0.0p0f)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_45_0 = lexicalValue1326_23_0;
        break lexical_join_45;
    }
    if (!((lexicalValue1326_23_0 > 0))) {
        break lexical_join_32;
    }
    ((moom.tv)(this)).c(((float)((((moom.tv)(this)).a() - 0x1.0p0f))));
    }
    ((moom.tv)(this)).k = ((double)(((moom.tv)(this)).n));
    ((moom.tv)(this)).l = ((double)(((moom.tv)(this)).o));
    ((moom.tv)(this)).m = ((double)(((moom.tv)(this)).p));
    lexicalValue1326_45_0 = 5;
    }
    life4_57 = lexicalValue1326_45_0;
    life5_59 = 0x0.0p0d;
    life7_61 = 0;
    lexical_cycle_50: while (true) {
    lexical_join_131: {
    lexical_join_130: {
    if (!((life7_61 < life4_57))) {
        break lexical_join_133;
    }
    life8_84 = ((((moom.CA)(((moom.tv)(this)).b())).c + (((((moom.CA)(((moom.tv)(this)).b())).f - ((moom.CA)(((moom.tv)(this)).b())).c) * ((double) life7_61)) / ((double) life4_57))) - 0x1.0p-3d);
    life10_106 = ((((moom.CA)(((moom.tv)(this)).b())).c + (((((moom.CA)(((moom.tv)(this)).b())).f - ((moom.CA)(((moom.tv)(this)).b())).c) * ((double) (life7_61 + 1))) / ((double) life4_57))) - 0x1.0p-3d);
    life12_124 = new moom.CA(((moom.CA)(((moom.tv)(this)).b())).b, life8_84, ((moom.CA)(((moom.tv)(this)).b())).d, ((moom.CA)(((moom.tv)(this)).b())).e, life10_106, ((moom.CA)(((moom.tv)(this)).b())).g);
    if (!((life3_7 != 0))) {
        break lexical_join_131;
    }
    spill1326_2 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_134_0 = spill1326_2;
        break lexical_join_134;
    }
    if (!(((net.minecraft.world.World)(((moom.tv)(spill1326_2)).i)).b(((moom.CA)(life12_124)), ((moom.fn)(moom.fn.h))))) {
        break lexical_join_130;
    }
    life5_59 = (life5_59 + (0x1.0p0d / ((double) life4_57)));
    }
    life7_61 += 1;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    lexicalValue1326_134_0 = this;
    }
    life7_163 = java.lang.Math.sqrt(((double)(((((moom.tv)(lexicalValue1326_134_0)).t * ((moom.tv)(this)).t) + (((moom.tv)(this)).v * ((moom.tv)(this)).v)))));
    spill1326_3 = recovery.source.CarrierOps.dcmpl(((double)(life7_163)), ((double)(0x1.30a3d70a3d70ap-2d)));
    if (!((life3_7 != 0))) {
        lexicalValue1326_302_0 = spill1326_3;
        break lexical_join_302;
    }
    if (!((spill1326_3 > 0))) {
        break lexical_join_299;
    }
    life9_181 = java.lang.Math.cos(((double)(((((double) ((moom.tv)(this)).w) * 0x1.921fb54442d18p1d) / 0x1.68p7d))));
    life11_190 = java.lang.Math.sin(((double)(((((double) ((moom.tv)(this)).w) * 0x1.921fb54442d18p1d) / 0x1.68p7d))));
    life13_192 = 0;
    lexical_cycle_172: while (true) {
    lexical_join_296: {
    lexical_join_257: {
    lexical_join_256: {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((double) life13_192))), ((double)((0x1.0p0d + (life7_163 * 0x1.ep5d))))) < 0))) {
        break lexical_join_299;
    }
    life14_210 = ((double) ((((java.util.Random)(((moom.tv)(this)).ah)).nextFloat() * 0x1.0p1f) - 0x1.0p0f));
    life16_222 = (((double) ((((java.util.Random)(((moom.tv)(this)).ah)).nextInt(((int)(2))) * 2) - 1)) * 0x1.6666666666666p-1d);
    spill1326_4 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_257_0 = spill1326_4;
        break lexical_join_257;
    }
    spill1326_5 = ((java.util.Random)(((moom.tv)(spill1326_4)).ah)).nextBoolean();
    if (!((life3_7 != 0))) {
        lexicalValue1326_302_0 = ((spill1326_5) ? 1 : 0);
        break lexical_join_302;
    }
    if (!(spill1326_5)) {
        break lexical_join_256;
    }
    life18_249 = ((((moom.tv)(this)).n - ((life9_181 * life14_210) * 0x1.999999999999ap-1d)) + (life11_190 * life16_222));
    life20_262 = ((((moom.tv)(this)).p - ((life11_190 * life14_210) * 0x1.999999999999ap-1d)) - (life9_181 * life16_222));
    ((net.minecraft.world.World)(((moom.tv)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_SPLASH)), ((double)(life18_249)), ((double)((((moom.tv)(this)).o - 0x1.0p-3d))), ((double)(life20_262)), ((double)(((moom.tv)(this)).t)), ((double)(((moom.tv)(this)).u)), ((double)(((moom.tv)(this)).v)), ((int[])(new int[0])));
    if (!((life3_7 == 0))) {
        break lexical_join_296;
    }
    }
    lexicalValue1326_257_0 = this;
    }
    life18_296 = ((((moom.tv)(lexicalValue1326_257_0)).n + life9_181) + ((life11_190 * life14_210) * 0x1.6666666666666p-1d));
    life20_307 = ((((moom.tv)(this)).p + life11_190) - ((life9_181 * life14_210) * 0x1.6666666666666p-1d));
    ((net.minecraft.world.World)(((moom.tv)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_SPLASH)), ((double)(life18_296)), ((double)((((moom.tv)(this)).o - 0x1.0p-3d))), ((double)(life20_307)), ((double)(((moom.tv)(this)).t)), ((double)(((moom.tv)(this)).u)), ((double)(((moom.tv)(this)).v)), ((int[])(new int[0])));
    }
    life13_192 += 1;
    if (!((life3_7 == 0))) { continue lexical_cycle_172; }
    break lexical_cycle_172;
    }
    }
    lexicalValue1326_302_0 = ((((net.minecraft.world.World)(((moom.tv)(this)).i)).G) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_479_0 = lexicalValue1326_302_0;
        break lexical_join_479;
    }
    if (!((lexicalValue1326_302_0 != 0))) {
        break lexical_join_476;
    }
    spill1326_6 = this.aE;
    if (!((life3_7 != 0))) {
        lexicalValue1326_479_0 = ((spill1326_6) ? 1 : 0);
        break lexical_join_479;
    }
    if (!(spill1326_6)) {
        break lexical_join_476;
    }
    spill1326_7 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_411_0 = spill1326_7;
        break lexical_join_411;
    }
    if (!((((moom.tv)(spill1326_7)).aG > 0))) {
        break lexical_join_410;
    }
    life9_372 = (((moom.tv)(this)).n + ((this.aH - ((moom.tv)(this)).n) / ((double) this.aG)));
    life11_385 = (((moom.tv)(this)).o + ((this.aI - ((moom.tv)(this)).o) / ((double) this.aG)));
    life13_398 = (((moom.tv)(this)).p + ((this.aJ - ((moom.tv)(this)).p) / ((double) this.aG)));
    life15_406 = moom.Dr.a(((double)((this.aK - ((double) ((moom.tv)(this)).w)))));
    ((moom.tv)(this)).w = ((float)(((float) (((double) ((moom.tv)(this)).w) + (life15_406 / ((double) this.aG))))));
    ((moom.tv)(this)).x = ((float)(((float) (((double) ((moom.tv)(this)).x) + ((this.aL - ((double) ((moom.tv)(this)).x)) / ((double) this.aG))))));
    moom.tv __stackOp1326_104_0 = this;
    ((moom.tv)(__stackOp1326_104_0)).aG = ((int)((((moom.tv)(__stackOp1326_104_0)).aG - 1)));
    ((moom.tv)(this)).a__Void(((double)(life9_372)), ((double)(life11_385)), ((double)(life13_398)));
    ((moom.tv)(this)).b(((float)(((moom.tv)(this)).w)), ((float)(((moom.tv)(this)).x)));
    if (!((life3_7 == 0))) {
        break lexical_join_1034;
    }
    }
    lexicalValue1326_411_0 = this;
    }
    life9_463 = (((moom.tv)(lexicalValue1326_411_0)).n + ((moom.tv)(this)).t);
    life11_469 = (((moom.tv)(this)).o + ((moom.tv)(this)).u);
    life13_475 = (((moom.tv)(this)).p + ((moom.tv)(this)).v);
    ((moom.tv)(this)).a__Void(((double)(life9_463)), ((double)(life11_469)), ((double)(life13_475)));
    spill1326_8 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_469_0 = spill1326_8;
        break lexical_join_469;
    }
    if (!(((moom.tv)(spill1326_8)).A)) {
        break lexical_join_456;
    }
    moom.tv __stackOp1326_119_0 = this;
    ((moom.tv)(__stackOp1326_119_0)).t = ((double)((((moom.tv)(__stackOp1326_119_0)).t * 0x1.0p-1d)));
    moom.tv __stackOp1326_122_0 = this;
    ((moom.tv)(__stackOp1326_122_0)).u = ((double)((((moom.tv)(__stackOp1326_122_0)).u * 0x1.0p-1d)));
    moom.tv __stackOp1326_125_0 = this;
    ((moom.tv)(__stackOp1326_125_0)).v = ((double)((((moom.tv)(__stackOp1326_125_0)).v * 0x1.0p-1d)));
    }
    moom.tv __stackOp1326_128_0 = this;
    ((moom.tv)(__stackOp1326_128_0)).t = ((double)((((moom.tv)(__stackOp1326_128_0)).t * 0x1.fae148p-1d)));
    moom.tv __stackOp1326_131_0 = this;
    ((moom.tv)(__stackOp1326_131_0)).u = ((double)((((moom.tv)(__stackOp1326_131_0)).u * 0x1.e66666p-1d)));
    lexicalValue1326_469_0 = this;
    }
    moom.tv __stackOp1326_134_0 = lexicalValue1326_469_0;
    ((moom.tv)(__stackOp1326_134_0)).v = ((double)((((moom.tv)(__stackOp1326_134_0)).v * 0x1.fae148p-1d)));
    if (!((life3_7 == 0))) {
        break lexical_join_1034;
    }
    }
    lexicalValue1326_479_0 = recovery.source.CarrierOps.dcmpg(((double)(life5_59)), ((double)(0x1.0p0d)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_504_0 = lexicalValue1326_479_0;
        break lexical_join_504;
    }
    if (!((lexicalValue1326_479_0 < 0))) {
        break lexical_join_498;
    }
    life9_547 = ((life5_59 * 0x1.0p1d) - 0x1.0p0d);
    moom.tv __stackOp1326_138_0 = this;
    ((moom.tv)(__stackOp1326_138_0)).u = ((double)((((moom.tv)(__stackOp1326_138_0)).u + (0x1.47ae14p-5d * life9_547))));
    if (!((life3_7 == 0))) {
        break lexical_join_517;
    }
    }
    spill1326_9 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_512_0 = spill1326_9;
        break lexical_join_512;
    }
    lexicalValue1326_504_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.tv)(spill1326_9)).u)), ((double)(0x0.0p0d)));
    }
    if (!((lexicalValue1326_504_0 < 0))) {
        break lexical_join_511;
    }
    moom.tv __stackOp1326_143_0 = this;
    ((moom.tv)(__stackOp1326_143_0)).u = ((double)((((moom.tv)(__stackOp1326_143_0)).u / 0x1.0p1d)));
    }
    lexicalValue1326_512_0 = this;
    }
    moom.tv __stackOp1326_146_0 = lexicalValue1326_512_0;
    ((moom.tv)(__stackOp1326_146_0)).u = ((double)((((moom.tv)(__stackOp1326_146_0)).u + 0x1.cac084p-8d)));
    }
    spill1326_10 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_582_0 = spill1326_10;
        break lexical_join_582;
    }
    life10_590 = ((moom.tv)(spill1326_10)).f;
    if (!((((life10_590 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break lexical_join_581;
    }
    life9_596 = ((net.minecraft.entity.EntityLivingBase)(life10_590));
    life10_606 = (((net.minecraft.entity.Entity)(((moom.tv)(this)).f)).w + ((-((net.minecraft.entity.EntityLivingBase)(life9_596)).bj) * 0x1.68p6f));
    moom.tv __stackOp1326_155_0 = this;
    ((moom.tv)(__stackOp1326_155_0)).t = ((double)((((moom.tv)(__stackOp1326_155_0)).t + ((((-java.lang.Math.sin(((double)(((double) ((life10_606 * 0x1.921fb6p1f) / 0x1.68p7f)))))) * this.aF) * ((double) ((net.minecraft.entity.EntityLivingBase)(life9_596)).bk)) * 0x1.99999ap-5d))));
    moom.tv __stackOp1326_161_0 = this;
    ((moom.tv)(__stackOp1326_161_0)).v = ((double)((((moom.tv)(__stackOp1326_161_0)).v + (((java.lang.Math.cos(((double)(((double) ((life10_606 * 0x1.921fb6p1f) / 0x1.68p7f))))) * this.aF) * ((double) ((net.minecraft.entity.EntityLivingBase)(life9_596)).bk)) * 0x1.99999ap-5d))));
    }
    lexicalValue1326_582_0 = this;
    }
    life9_662 = java.lang.Math.sqrt(((double)(((((moom.tv)(lexicalValue1326_582_0)).t * ((moom.tv)(this)).t) + (((moom.tv)(this)).v * ((moom.tv)(this)).v)))));
    spill1326_11 = recovery.source.CarrierOps.dcmpl(((double)(life9_662)), ((double)(0x1.6666666666666p-2d)));
    if (!((life3_7 != 0))) {
        lexicalValue1326_621_0 = spill1326_11;
        break lexical_join_621;
    }
    if (!((spill1326_11 > 0))) {
        break lexical_join_618;
    }
    life11_675 = (0x1.6666666666666p-2d / life9_662);
    moom.tv __stackOp1326_173_0 = this;
    ((moom.tv)(__stackOp1326_173_0)).t = ((double)((((moom.tv)(__stackOp1326_173_0)).t * life11_675)));
    moom.tv __stackOp1326_176_0 = this;
    ((moom.tv)(__stackOp1326_176_0)).v = ((double)((((moom.tv)(__stackOp1326_176_0)).v * life11_675)));
    life9_662 = 0x1.6666666666666p-2d;
    }
    lexicalValue1326_621_0 = recovery.source.CarrierOps.dcmpl(((double)(life9_662)), ((double)(life7_163)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_669_0 = lexicalValue1326_621_0;
        break lexical_join_669;
    }
    if (!((lexicalValue1326_621_0 > 0))) {
        break lexical_join_654;
    }
    spill1326_12 = recovery.source.CarrierOps.dcmpg(((double)(this.aF)), ((double)(0x1.6666666666666p-2d)));
    if (!((life3_7 != 0))) {
        lexicalValue1326_669_0 = spill1326_12;
        break lexical_join_669;
    }
    if (!((spill1326_12 < 0))) {
        break lexical_join_654;
    }
    moom.tv __stackOp1326_182_0 = this;
    ((moom.tv)(__stackOp1326_182_0)).aF = ((double)((((moom.tv)(__stackOp1326_182_0)).aF + ((0x1.6666666666666p-2d - this.aF) / 0x1.18p5d))));
    spill1326_13 = recovery.source.CarrierOps.dcmpl(((double)(this.aF)), ((double)(0x1.6666666666666p-2d)));
    if (!((life3_7 != 0))) {
        lexicalValue1326_676_0 = spill1326_13;
        break lexical_join_676;
    }
    if (!((spill1326_13 > 0))) {
        break lexical_join_675;
    }
    this.aF = ((double)(0x1.6666666666666p-2d));
    if (!((life3_7 == 0))) {
        break lexical_join_675;
    }
    }
    moom.tv __stackOp1326_189_0 = this;
    ((moom.tv)(__stackOp1326_189_0)).aF = ((double)((((moom.tv)(__stackOp1326_189_0)).aF - ((this.aF - 0x1.1eb851eb851ecp-4d) / 0x1.18p5d))));
    lexicalValue1326_669_0 = recovery.source.CarrierOps.dcmpg(((double)(this.aF)), ((double)(0x1.1eb851eb851ecp-4d)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_676_0 = lexicalValue1326_669_0;
        break lexical_join_676;
    }
    if (!((lexicalValue1326_669_0 < 0))) {
        break lexical_join_675;
    }
    this.aF = ((double)(0x1.1eb851eb851ecp-4d));
    }
    lexicalValue1326_676_0 = 0;
    }
    life11_775 = lexicalValue1326_676_0;
    lexical_cycle_677: while (true) {
    lexical_join_765: {
    lexical_join_764: {
    if (!((life11_775 < 4))) {
        break lexical_join_767;
    }
    life12_791 = moom.Dr.b__Int(((double)((((moom.tv)(this)).n + ((((double) (life11_775 % 2)) - 0x1.0p-1d) * 0x1.999999999999ap-1d)))));
    life13_804 = moom.Dr.b__Int(((double)((((moom.tv)(this)).p + ((((double) (life11_775 / 2)) - 0x1.0p-1d) * 0x1.999999999999ap-1d)))));
    spill1326_14 = 0;
    if (!((life3_7 != 0))) {
        lexicalValue1326_769_0 = spill1326_14;
        break lexical_join_769;
    }
    life14_808 = spill1326_14;
    lexical_cycle_710: while (true) {
    lexical_join_761: {
    lexical_join_751: {
    lexical_join_749: {
    if (!((life14_808 < 2))) {
        break lexical_join_764;
    }
    life15_817 = (moom.Dr.b__Int(((double)(((moom.tv)(this)).o))) + life14_808);
    life16_824 = new moom.DT(life12_791, life15_817, life13_804);
    life17_830 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.tv)(this)).i)).a__fE(((moom.DT)(life16_824))))).a__ch();
    if (!((life3_7 != 0))) {
        break lexical_join_765;
    }
    spill1326_15 = life17_830;
    spill1326_16 = net.minecraft.init.Blocks.aH;
    if (!((life3_7 != 0))) {
        lexicalValue1326_751_0 = spill1326_15;
        lexicalValue1326_751_1 = spill1326_16;
        break lexical_join_751;
    }
    if (!((spill1326_15 == spill1326_16))) {
        break lexical_join_749;
    }
    ((net.minecraft.world.World)(((moom.tv)(this)).i)).d__Boolean(((moom.DT)(life16_824)));
    ((moom.tv)(this)).B = ((boolean)(false));
    if (!((life3_7 == 0))) {
        break lexical_join_761;
    }
    }
    lexicalValue1326_751_0 = life17_830;
    lexicalValue1326_751_1 = net.minecraft.init.Blocks.bm;
    }
    if (!((lexicalValue1326_751_0 == lexicalValue1326_751_1))) {
        break lexical_join_761;
    }
    ((net.minecraft.world.World)(((moom.tv)(this)).i)).b(((moom.DT)(life16_824)), ((boolean)(true)));
    ((moom.tv)(this)).B = ((boolean)(false));
    }
    life14_808 += 1;
    if (!((life3_7 == 0))) { continue lexical_cycle_710; }
    break lexical_cycle_710;
    }
    }
    life11_775 += 1;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_677; }
    break lexical_cycle_677;
    }
    }
    lexicalValue1326_769_0 = ((((moom.tv)(this)).A) ? 1 : 0);
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_802_0 = lexicalValue1326_769_0;
        break lexical_join_802;
    }
    if (!((lexicalValue1326_769_0 != 0))) {
        break lexical_join_790;
    }
    moom.tv __stackOp1326_215_0 = this;
    ((moom.tv)(__stackOp1326_215_0)).t = ((double)((((moom.tv)(__stackOp1326_215_0)).t * 0x1.0p-1d)));
    moom.tv __stackOp1326_218_0 = this;
    ((moom.tv)(__stackOp1326_218_0)).u = ((double)((((moom.tv)(__stackOp1326_218_0)).u * 0x1.0p-1d)));
    moom.tv __stackOp1326_221_0 = this;
    ((moom.tv)(__stackOp1326_221_0)).v = ((double)((((moom.tv)(__stackOp1326_221_0)).v * 0x1.0p-1d)));
    }
    ((moom.tv)(this)).b__Void(((double)(((moom.tv)(this)).t)), ((double)(((moom.tv)(this)).u)), ((double)(((moom.tv)(this)).v)));
    spill1326_17 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_878_0 = spill1326_17;
        break lexical_join_878;
    }
    lexicalValue1326_802_0 = ((((moom.tv)(spill1326_17)).B) ? 1 : 0);
    }
    if (!((lexicalValue1326_802_0 != 0))) {
        break lexical_join_865;
    }
    spill1326_18 = recovery.source.CarrierOps.dcmpl(((double)(life7_163)), ((double)(0x1.30a3d70a3d70ap-2d)));
    if (!((life3_7 != 0))) {
        lexicalValue1326_814_0 = spill1326_18;
        break lexical_join_814;
    }
    if (!((spill1326_18 > 0))) {
        break lexical_join_865;
    }
    spill1326_19 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_887_0 = spill1326_19;
        break lexical_join_887;
    }
    lexicalValue1326_814_0 = ((((net.minecraft.world.World)(((moom.tv)(spill1326_19)).i)).G) ? 1 : 0);
    }
    if (!((lexicalValue1326_814_0 == 0))) {
        break lexical_join_883;
    }
    spill1326_20 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_887_0 = spill1326_20;
        break lexical_join_887;
    }
    if (!((!((moom.tv)(spill1326_20)).F))) {
        break lexical_join_883;
    }
    ((moom.tv)(this)).f__Void();
    spill1326_21 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_887_0 = spill1326_21;
        break lexical_join_887;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.tv)(spill1326_21)).i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break lexical_join_883;
    }
    life11_978 = 0;
    lexical_cycle_832: while (true) {
    if (!((life11_978 < 3))) {
        break lexical_join_847;
    }
    ((moom.tv)(this)).a(((net.minecraft.item.Item)(net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f))))), ((int)(1)), ((float)(0x0.0p0f)));
    life11_978 += 1;
    if (!((life3_7 != 0))) {
        break lexical_join_849;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_832; }
    break lexical_cycle_832;
    }
    }
    life11_978 = 0;
    }
    lexical_cycle_849: while (true) {
    if (!((life11_978 < 2))) {
        break lexical_join_863;
    }
    ((moom.tv)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.y)), ((int)(1)), ((float)(0x0.0p0f)));
    life11_978 += 1;
    if (!((life3_7 != 0))) {
        break lexical_join_886;
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_849; }
    break lexical_cycle_849;
    }
    }
    if (!((life3_7 == 0))) {
        break lexical_join_883;
    }
    }
    moom.tv __stackOp1326_244_0 = this;
    ((moom.tv)(__stackOp1326_244_0)).t = ((double)((((moom.tv)(__stackOp1326_244_0)).t * 0x1.fae148p-1d)));
    moom.tv __stackOp1326_247_0 = this;
    ((moom.tv)(__stackOp1326_247_0)).u = ((double)((((moom.tv)(__stackOp1326_247_0)).u * 0x1.e66666p-1d)));
    lexicalValue1326_878_0 = this;
    }
    moom.tv __stackOp1326_250_0 = lexicalValue1326_878_0;
    ((moom.tv)(__stackOp1326_250_0)).v = ((double)((((moom.tv)(__stackOp1326_250_0)).v * 0x1.fae148p-1d)));
    }
    ((moom.tv)(this)).x = ((float)(0x0.0p0f));
    }
    lexicalValue1326_887_0 = this;
    }
    life11_1048 = ((double) ((moom.tv)(lexicalValue1326_887_0)).w);
    life13_1054 = (((moom.tv)(this)).k - ((moom.tv)(this)).n);
    life15_1060 = (((moom.tv)(this)).m - ((moom.tv)(this)).p);
    spill1326_22 = ((life13_1054 * life13_1054) + (life15_1060 * life15_1060));
    spill1326_23 = 0x1.0624dd2f1a9fcp-10d;
    if (!((life3_7 != 0))) {
        lexicalValue1326_928_0 = spill1326_22;
        lexicalValue1326_928_1 = spill1326_23;
        break lexical_join_928;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1326_22)), ((double)(spill1326_23))) > 0))) {
        break lexical_join_924;
    }
    life11_1048 = ((double) ((float) ((moom.Dr.b(((double)(life15_1060)), ((double)(life13_1054))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)));
    }
    lexicalValue1326_928_0 = life11_1048;
    lexicalValue1326_928_1 = ((double) ((moom.tv)(this)).w);
    }
    life17_1092 = moom.Dr.a(((double)((lexicalValue1326_928_0 - lexicalValue1326_928_1))));
    spill1326_24 = recovery.source.CarrierOps.dcmpl(((double)(life17_1092)), ((double)(0x1.4p4d)));
    if (!((life3_7 != 0))) {
        lexicalValue1326_942_0 = spill1326_24;
        break lexical_join_942;
    }
    if (!((spill1326_24 > 0))) {
        break lexical_join_939;
    }
    life17_1092 = 0x1.4p4d;
    }
    lexicalValue1326_942_0 = recovery.source.CarrierOps.dcmpg(((double)(life17_1092)), ((double)(-0x1.4p4d)));
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_966_0 = lexicalValue1326_942_0;
        break lexical_join_966;
    }
    if (!((lexicalValue1326_942_0 < 0))) {
        break lexical_join_947;
    }
    life17_1092 = -0x1.4p4d;
    }
    ((moom.tv)(this)).w = ((float)(((float) (((double) ((moom.tv)(this)).w) + life17_1092))));
    ((moom.tv)(this)).b(((float)(((moom.tv)(this)).w)), ((float)(((moom.tv)(this)).x)));
    spill1326_25 = ((moom.tv)(this)).i;
    if (!((life3_7 != 0))) {
        lexicalValue1326_969_0 = spill1326_25;
        break lexical_join_969;
    }
    lexicalValue1326_966_0 = ((((net.minecraft.world.World)(spill1326_25)).G) ? 1 : 0);
    }
    if (!((lexicalValue1326_966_0 == 0))) {
        break lexical_join_1034;
    }
    lexicalValue1326_969_0 = ((moom.tv)(this)).i;
    }
    life19_1151 = ((net.minecraft.world.World)(lexicalValue1326_969_0)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((moom.tv)(this)).b())).b(((double)(0x1.99999ap-3d)), ((double)(0x0.0p0d)), ((double)(0x1.99999ap-3d))))));
    spill1326_26 = life19_1151;
    if (!((life3_7 != 0))) {
        lexicalValue1326_983_0 = spill1326_26;
        break lexical_join_983;
    }
    if (!((spill1326_26 != null))) {
        break lexical_join_1020;
    }
    lexicalValue1326_983_0 = life19_1151;
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_988_0 = lexicalValue1326_983_0;
        break lexical_join_988;
    }
    if (!((!((java.util.List)(lexicalValue1326_983_0)).isEmpty()))) {
        break lexical_join_1020;
    }
    lexicalValue1326_988_0 = life19_1151;
    }
    life20_1172 = ((java.util.List)(lexicalValue1326_988_0)).iterator();
    lexical_cycle_990: while (true) {
    lexical_join_1018: {
    lexical_join_1016: {
    lexical_join_1014: {
    lexical_join_1006: {
    if (!(((java.util.Iterator)(life20_1172)).hasNext())) {
        break lexical_join_1020;
    }
    life21_1179 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life20_1172)).next()));
    spill1326_27 = life21_1179;
    if (!((life3_7 != 0))) {
        lexicalValue1326_1022_0 = spill1326_27;
        break lexical_join_1022;
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_1006_0 = spill1326_27;
        break lexical_join_1006;
    }
    if (!((spill1326_27 != ((moom.tv)(this)).f))) {
        break lexical_join_1018;
    }
    lexicalValue1326_1006_0 = life21_1179;
    }
    spill1326_28 = ((net.minecraft.entity.Entity)(lexicalValue1326_1006_0)).n__Boolean();
    if (!((life3_7 != 0))) {
        lexicalValue1326_1014_0 = ((spill1326_28) ? 1 : 0);
        break lexical_join_1014;
    }
    if (!(spill1326_28)) {
        break lexical_join_1018;
    }
    spill1326_29 = life21_1179;
    if (!((life3_7 != 0))) {
        lexicalValue1326_1016_0 = spill1326_29;
        break lexical_join_1016;
    }
    lexicalValue1326_1014_0 = ((spill1326_29 instanceof moom.tv) ? 1 : 0);
    }
    if (!((lexicalValue1326_1014_0 != 0))) {
        break lexical_join_1018;
    }
    lexicalValue1326_1016_0 = life21_1179;
    }
    ((net.minecraft.entity.Entity)(lexicalValue1326_1016_0)).a__Void(((net.minecraft.entity.Entity)(this)));
    }
    if (!((life3_7 == 0))) { continue lexical_cycle_990; }
    break lexical_cycle_990;
    }
    }
    lexicalValue1326_1022_0 = ((moom.tv)(this)).f;
    }
    if (!((life3_7 != 0))) {
        lexicalValue1326_1029_0 = lexicalValue1326_1022_0;
        break lexical_join_1029;
    }
    if (!((lexicalValue1326_1022_0 != null))) {
        break lexical_join_1034;
    }
    spill1326_30 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1326_1032_0 = spill1326_30;
        break lexical_join_1032;
    }
    lexicalValue1326_1029_0 = ((moom.tv)(spill1326_30)).f;
    }
    if (!(((net.minecraft.entity.Entity)(lexicalValue1326_1029_0)).F)) {
        break lexical_join_1034;
    }
    lexicalValue1326_1032_0 = this;
    }
    ((moom.tv)(lexicalValue1326_1032_0)).f = ((net.minecraft.entity.Entity)(null));
    }
    return;
}


public void u() {
long local1 = (moom.tv.bb ^ 124981067347749L);
    ((moom.tv)(this)).h(((int)((-((moom.tv)(this)).b__sourceReturn_8abf5c6871()))));
    ((moom.tv)(this)).g(((int)(__sourceIntrinsic_712129a63d20_originalDynamicSite1665_3(2305, (6452559165845784713L ^ local1)))));
    ((moom.tv)(this)).c(((float)((((moom.tv)(this)).a() * 0x1.6p3f))));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9227_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1657_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0891f2beaed_originalDynamicSite1658_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1659_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1660_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1660_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1660_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic4103_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bbed5b41c99_originalDynamicSite1662_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_09f962f6db15_invokedynamic4101_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76940a5779a0_originalDynamicSite1663_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a08a1913beb2_originalDynamicSite1664_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_712129a63d20_originalDynamicSite1665_3(int a0, long a1) throws E;
}
