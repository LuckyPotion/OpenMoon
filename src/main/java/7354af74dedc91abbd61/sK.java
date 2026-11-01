package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class sK extends moom.sJ implements net.minecraft.entity.passive.IAnimals {

protected net.minecraft.block.Block b_;

private int ca;

private net.minecraft.entity.player.EntityPlayer cb;

private static int cc;

private static final long ib;

private static final long[] xb;

private static final java.lang.Integer[] yb;

private static final java.util.Map zb;

public sK(net.minecraft.world.World p0) {
super(p0);
    this.b_ = net.minecraft.init.Blocks.c;
}


static {
ib = ((long)(((moom._a)(moom._c.a(((long)(-711032170241296152L)), ((long)(-4512814674134500248L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(22572755934164L)))));
    int __sourceSpill1521_6 = 95;
    zb = ((java.util.Map)(new java.util.HashMap(13)));
    moom.sK.m(((int)(__sourceSpill1521_6)));
    long local0_life9 = (moom.sK.ib ^ 107181391024644L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1521_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1521_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1521_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1521_16 = new byte[8];
    (__sourceSpill1521_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1521_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1521_18 = __sourceSpill1521_16;
    ((javax.crypto.Cipher)(__sourceSpill1521_13)).init(((int)(__sourceSpill1521_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1521_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1521_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[8];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "Ýf¨rS9ã©¨>ÁHx²\026\032gMÇ\027ZoÙÓòt\000À­6mõe\177ê2Qô\b\r"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1521_27 = local6_life23;
        int __sourceSpill1521_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1521_27)).substring(((int)(__sourceSpill1521_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1521_32 = local8_life21;
        int __sourceSpill1521_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1521_35 = new byte[8];
        (__sourceSpill1521_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1521_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1521_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1521_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1521_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1521_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1521_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1521_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1521_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1521_36)).doFinal(((byte[])(__sourceSpill1521_35)));
        (__sourceSpill1521_32)[__sourceSpill1521_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "n2ØÍ±þL\013Bqç»\004æ="))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1521_40 = local6_life23;
        int __sourceSpill1521_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1521_40)).substring(((int)(__sourceSpill1521_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1521_45 = local8_life21;
        int __sourceSpill1521_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1521_48 = new byte[8];
        (__sourceSpill1521_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1521_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1521_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1521_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1521_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1521_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1521_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1521_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1521_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1521_49)).doFinal(((byte[])(__sourceSpill1521_48)));
        (__sourceSpill1521_45)[__sourceSpill1521_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    xb = ((long[])(local8_life21));
    yb = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue3971_11_0;
    int forwardValue3971_17_0;
    net.minecraft.item.ItemStack spill3971_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (moom.sK.ib ^ 103494725085252L);
    life4_5 = moom.vR.b();
    spill3971_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue3971_11_0 = spill3971_0;
        break forward_join_11;
    }
    if (!((spill3971_0 != null))) {
        break forward_join_16;
    }
    forwardValue3971_11_0 = p0;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3971_11_0)).a__wQ() == net.minecraft.init.Items.O))) {
        break forward_join_16;
    }
    forwardValue3971_17_0 = 1;
    break forward_join_17;
    }
    forwardValue3971_17_0 = 0;
    }
    return ((forwardValue3971_17_0) != 0);
}


public boolean ad() {
int forwardValue3970_12_0;
    int forwardValue3970_14_0;
    int spill3970_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.sK.ib ^ 51915150980768L);
    life3_5 = moom.vR.b();
    spill3970_0 = this.ca;
    if (!((life3_5 != 0))) {
        forwardValue3970_12_0 = spill3970_0;
        break forward_join_12;
    }
    if (!((spill3970_0 > 0))) {
        break forward_join_13;
    }
    forwardValue3970_12_0 = 1;
    }
    forwardValue3970_14_0 = forwardValue3970_12_0;
    break forward_join_14;
    }
    forwardValue3970_14_0 = 0;
    }
    return ((forwardValue3970_14_0) != 0);
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_b907c045594055(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral9012_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11249;
      if (yb[var3] == null) {
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
         long var5 = xb[var3];
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
         Object[] var9 = (Object[])zb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               zb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         yb[var3] = var15;
      }

      return yb[var3];
}


public static int s() {
int local0 = __sourceExactCall_6acc809fc8fdc0();
    if ((local0 == 0)) {
        return 3;
    }
    return 0;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.ca = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("InLove")))));
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public int l__sourceReturn_8abf5c6871() {
long local1 = (moom.sK.ib ^ 32487899644521L);
    return __sourceIntrinsic_d0e131a72963_originalDynamicSite1634_1(8703, (7925420604073557080L ^ local1));
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("InLove")), ((int)(this.ca)));
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue3969_21_0;
    boolean spill3969_0;
    long life3_3;
    int life5_5;
    forward_join_21: {
    forward_join_14: {
    life3_3 = (moom.sK.ib ^ 62863141964323L);
    life5_5 = moom.vR.b();
    spill3969_0 = ((moom.sK)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 != 0))) {
        forwardValue3969_21_0 = ((spill3969_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill3969_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    this.ca = ((int)(0));
    forwardValue3969_21_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forwardValue3969_21_0) != 0);
}


public float a__sourceReturn_8d24afb582(moom.DT p0) {
net.minecraft.world.World forwardValue3965_21_0;
    moom.DT forwardValue3965_21_1;
    float forwardValue3965_24_0;
    net.minecraft.world.World spill3965_0;
    moom.DT spill3965_1;
    long life2_3;
    int life4_5;
    forward_join_24: {
    forward_join_21: {
    forward_join_18: {
    life2_3 = (moom.sK.ib ^ 100965936509007L);
    life4_5 = moom.vR.c();
    spill3965_0 = this.i;
    spill3965_1 = ((moom.DT)(p0)).b__DT();
    if (!((life4_5 == 0))) {
        forwardValue3965_21_0 = spill3965_0;
        forwardValue3965_21_1 = spill3965_1;
        break forward_join_21;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill3965_0)).a__fE(((moom.DT)(spill3965_1))))).a__ch() == net.minecraft.init.Blocks.c))) {
        break forward_join_18;
    }
    forwardValue3965_24_0 = 0x1.4p3f;
    break forward_join_24;
    }
    forwardValue3965_21_0 = this.i;
    forwardValue3965_21_1 = p0;
    }
    forwardValue3965_24_0 = (((net.minecraft.world.World)(forwardValue3965_21_0)).a(((moom.DT)(forwardValue3965_21_1))) - 0x1.0p-1f);
    }
    return forwardValue3965_24_0;
}


public boolean a(moom.sK p0) {
moom.sK forwardValue3966_12_0;
    moom.sK forwardValue3966_19_0;
    int forwardValue3966_25_0;
    int forwardValue3966_29_0;
    int forwardValue3966_31_0;
    moom.sK spill3966_0;
    boolean spill3966_1;
    long life2_3;
    int life4_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    forward_join_12: {
    life2_3 = (moom.sK.ib ^ 97181035761589L);
    life4_5 = moom.vR.b();
    spill3966_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue3966_12_0 = spill3966_0;
        break forward_join_12;
    }
    if (!((spill3966_0 != this))) {
        break forward_join_30;
    }
    forwardValue3966_12_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue3966_19_0 = forwardValue3966_12_0;
        break forward_join_19;
    }
    if (!((((java.lang.Object)(forwardValue3966_12_0)).getClass() == ((java.lang.Object)(this)).getClass()))) {
        break forward_join_30;
    }
    forwardValue3966_19_0 = this;
    }
    spill3966_1 = ((moom.sK)(forwardValue3966_19_0)).ad();
    if (!((life4_5 != 0))) {
        forwardValue3966_25_0 = ((spill3966_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill3966_1)) {
        break forward_join_30;
    }
    forwardValue3966_25_0 = ((((moom.sK)(p0)).ad()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue3966_29_0 = forwardValue3966_25_0;
        break forward_join_29;
    }
    if (!((forwardValue3966_25_0 != 0))) {
        break forward_join_30;
    }
    forwardValue3966_29_0 = 1;
    }
    forwardValue3966_31_0 = forwardValue3966_29_0;
    break forward_join_31;
    }
    forwardValue3966_31_0 = 0;
    }
    return ((forwardValue3966_31_0) != 0);
}


public void a(byte p0) {
int lexicalValue1298_16_0;
    byte spill1298_0;
    long life2_3;
    int life4_5;
    int life5_22;
    double life6_35;
    double life8_41;
    double life10_47;
    lexical_join_105: {
    lexical_join_102: {
    lexical_join_100: {
    lexical_join_16: {
    life2_3 = (moom.sK.ib ^ 84351180676848L);
    life4_5 = moom.vR.b();
    spill1298_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue1298_16_0 = ((int)(spill1298_0));
        break lexical_join_16;
    }
    if (!((spill1298_0 == __sourceIntrinsic_6121ff5511c4_invokedynamic1298_3(29030, (7029164540257218651L ^ life2_3))))) {
        break lexical_join_102;
    }
    lexicalValue1298_16_0 = 0;
    }
    life5_22 = lexicalValue1298_16_0;
    lexical_cycle_17: while (true) {
    if (!((life5_22 < __sourceIntrinsic_6121ff5511c4_invokedynamic1298_4(25905, (3842710407070295049L ^ life2_3))))) {
        break lexical_join_100;
    }
    life6_35 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life8_41 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life10_47 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.HEART)), ((double)(((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(((this.o + 0x1.0p-1d) + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))))), ((double)(((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(life6_35)), ((double)(life8_41)), ((double)(life10_47)), ((int[])(new int[0])));
    life5_22 += 1;
    if (!((life4_5 != 0))) {
        break lexical_join_105;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    if (!((life4_5 == 0))) {
        break lexical_join_105;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public void a__Void(net.minecraft.entity.player.EntityPlayer p0) {
long local2 = (moom.sK.ib ^ 75306840409657L);
    this.ca = ((int)(__sourceIntrinsic_8d1b3a33c40f_originalDynamicSite1635_1(11362, (8103857833919100308L ^ local2))));
    this.cb = ((net.minecraft.entity.player.EntityPlayer)(p0));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_8d1b3a33c40f_originalDynamicSite1635_5(29006, (1703942223954438331L ^ local2)))));
    return;
}


protected int a(net.minecraft.entity.player.EntityPlayer p0) {
return (1 + ((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextInt(((int)(3))));
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue3968_39_0;
    int forwardValue3968_73_0;
    int spill3968_0;
    boolean spill3968_1;
    int spill3968_2;
    int spill3968_3;
    boolean spill3968_4;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    forward_join_73: {
    forward_join_70: {
    forward_join_39: {
    forward_join_37: {
    life2_3 = (moom.sK.ib ^ 137582058914841L);
    spill3968_0 = moom.vR.c();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill3968_0;
    if (!((life5_8 != null))) {
        break forward_join_70;
    }
    spill3968_1 = ((moom.sK)(this)).b__Boolean(((net.minecraft.item.ItemStack)(life5_8)));
    if (!((life4_9 == 0))) {
        forwardValue3968_39_0 = ((spill3968_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill3968_1)) {
        break forward_join_37;
    }
    spill3968_2 = ((moom.sK)(this)).q__sourceReturn_8abf5c6871();
    if (!((life4_9 == 0))) {
        forwardValue3968_39_0 = spill3968_2;
        break forward_join_39;
    }
    if (!((spill3968_2 == 0))) {
        break forward_join_37;
    }
    spill3968_3 = this.ca;
    if (!((life4_9 == 0))) {
        forwardValue3968_39_0 = spill3968_3;
        break forward_join_39;
    }
    if (!((spill3968_3 <= 0))) {
        break forward_join_37;
    }
    ((moom.sK)(this)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life5_8)));
    ((moom.sK)(this)).a__Void(((net.minecraft.entity.player.EntityPlayer)(p0)));
    return ((1) != 0);
    }
    forwardValue3968_39_0 = ((((moom.sK)(this)).c__Boolean()) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue3968_73_0 = forwardValue3968_39_0;
        break forward_join_73;
    }
    if (!((forwardValue3968_39_0 != 0))) {
        break forward_join_70;
    }
    spill3968_4 = ((moom.sK)(this)).b__Boolean(((net.minecraft.item.ItemStack)(life5_8)));
    if (!((life4_9 == 0))) {
        forwardValue3968_73_0 = ((spill3968_4) ? 1 : 0);
        break forward_join_73;
    }
    if (!(spill3968_4)) {
        break forward_join_70;
    }
    ((moom.sK)(this)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(life5_8)));
    ((moom.sK)(this)).b(((int)(((int) (((float) ((-((moom.sK)(this)).q__sourceReturn_8abf5c6871()) / __sourceIntrinsic_d6a7991b4c91_invokedynamic3968_17(7212, (7806834932705036284L ^ life2_3)))) * 0x1.99999ap-4f)))), ((boolean)(true)));
    return ((1) != 0);
    }
    forwardValue3968_73_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((forwardValue3968_73_0) != 0);
}


protected void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1) {
int forwardValue3967_20_0;
    boolean spill3967_0;
    long life3_3;
    int life5_5;
    forward_join_28: {
    forward_join_20: {
    life3_3 = (moom.sK.ib ^ 106964141240463L);
    life5_5 = moom.vR.b();
    spill3967_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life5_5 != 0))) {
        forwardValue3967_20_0 = ((spill3967_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill3967_0))) {
        break forward_join_28;
    }
    net.minecraft.item.ItemStack __stackOp3967_5_0 = p1;
    ((net.minecraft.item.ItemStack)(__stackOp3967_5_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp3967_5_0)).b - 1)));
    forwardValue3967_20_0 = ((net.minecraft.item.ItemStack)(p1)).b;
    }
    if (!((forwardValue3967_20_0 <= 0))) {
        break forward_join_28;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    return;
}


public net.minecraft.entity.player.EntityPlayer a__sourceReturn_5ebddff30c() {
return this.cb;
}


public static void m(int p0) {
cc = ((int)(p0));
    return;
}


public static int r__sourceReturn_8abf5c6871() {
return moom.sK.cc;
}


public boolean N__Boolean() {
net.minecraft.world.World forwardValue3962_40_0;
    moom.DT forwardValue3962_40_1;
    int forwardValue3962_51_0;
    int forwardValue3962_55_0;
    int forwardValue3962_57_0;
    int spill3962_0;
    net.minecraft.world.World spill3962_1;
    moom.DT spill3962_2;
    int spill3962_3;
    long life1_3;
    int life4_8;
    int life3_9;
    int life5_14;
    int life6_18;
    moom.DT life7_25;
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_40: {
    life1_3 = (moom.sK.ib ^ 19345070069087L);
    spill3962_0 = moom.vR.c();
    life4_8 = moom.Dr.b__Int(((double)(this.n)));
    life3_9 = spill3962_0;
    life5_14 = moom.Dr.b__Int(((double)(((moom.CA)(((moom.sK)(this)).b())).c)));
    life6_18 = moom.Dr.b__Int(((double)(this.p)));
    life7_25 = new moom.DT(life4_8, life5_14, life6_18);
    spill3962_1 = this.i;
    spill3962_2 = ((moom.DT)(life7_25)).b__DT();
    if (!((life3_9 == 0))) {
        forwardValue3962_40_0 = spill3962_1;
        forwardValue3962_40_1 = spill3962_2;
        break forward_join_40;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill3962_1)).a__fE(((moom.DT)(spill3962_2))))).a__ch() == this.b_))) {
        break forward_join_56;
    }
    forwardValue3962_40_0 = this.i;
    forwardValue3962_40_1 = life7_25;
    }
    spill3962_3 = ((net.minecraft.world.World)(forwardValue3962_40_0)).a__Int(((moom.DT)(forwardValue3962_40_1)));
    if (!((life3_9 == 0))) {
        forwardValue3962_51_0 = spill3962_3;
        break forward_join_51;
    }
    if (!((spill3962_3 > __sourceIntrinsic_a97bfb6c3ddd_invokedynamic3962_16(896, (9219405612643404053L ^ life1_3))))) {
        break forward_join_56;
    }
    forwardValue3962_51_0 = ((super.N__Boolean()) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue3962_55_0 = forwardValue3962_51_0;
        break forward_join_55;
    }
    if (!((forwardValue3962_51_0 != 0))) {
        break forward_join_56;
    }
    forwardValue3962_55_0 = 1;
    }
    forwardValue3962_57_0 = forwardValue3962_55_0;
    break forward_join_57;
    }
    forwardValue3962_57_0 = 0;
    }
    return ((forwardValue3962_57_0) != 0);
}


protected boolean M() {
return ((0) != 0);
}


public void Y__sourceReturn_da8c82d5d4() {
this.ca = ((int)(0));
    return;
}


protected void R() {
moom.sK forwardValue3963_15_0;
    moom.sK spill3963_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.sK.ib ^ 16133726196995L);
    life3_5 = moom.vR.c();
    spill3963_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue3963_15_0 = spill3963_0;
        break forward_join_15;
    }
    if (!((((moom.sK)(spill3963_0)).q__sourceReturn_8abf5c6871() != 0))) {
        break forward_join_14;
    }
    this.ca = ((int)(0));
    }
    forwardValue3963_15_0 = this;
    }
    __sourceIntrinsic_ebf98100c39e_call3963_4(forwardValue3963_15_0);
    return;
}


public void G() {
int forwardValue3961_18_0;
    int forwardValue3961_37_0;
    moom.sK forwardValue3961_39_0;
    int spill3961_0;
    int spill3961_1;
    moom.sK spill3961_2;
    long life1_3;
    int life3_7;
    double life4_58;
    double life6_64;
    double life8_70;
    forward_join_109: {
    forward_join_39: {
    forward_join_37: {
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.sK.ib ^ 35402401505449L);
    spill3961_0 = moom.vR.c();
    super.G();
    life3_7 = spill3961_0;
    spill3961_1 = ((moom.sK)(this)).q__sourceReturn_8abf5c6871();
    if (!((life3_7 == 0))) {
        forwardValue3961_18_0 = spill3961_1;
        break forward_join_18;
    }
    if (!((spill3961_1 != 0))) {
        break forward_join_16;
    }
    this.ca = ((int)(0));
    }
    forwardValue3961_18_0 = this.ca;
    }
    if (!((life3_7 == 0))) {
        forwardValue3961_37_0 = forwardValue3961_18_0;
        break forward_join_37;
    }
    if (!((forwardValue3961_18_0 > 0))) {
        break forward_join_109;
    }
    moom.sK __stackOp3961_6_0 = this;
    ((moom.sK)(__stackOp3961_6_0)).ca = ((int)((((moom.sK)(__stackOp3961_6_0)).ca - 1)));
    spill3961_2 = this;
    if (!((life3_7 == 0))) {
        forwardValue3961_39_0 = spill3961_2;
        break forward_join_39;
    }
    forwardValue3961_37_0 = (((moom.sK)(spill3961_2)).ca % __sourceIntrinsic_c7b45e3c376e_invokedynamic3961_10(15569, (1511618037657043891L ^ life1_3)));
    }
    if (!((forwardValue3961_37_0 == 0))) {
        break forward_join_109;
    }
    forwardValue3961_39_0 = this;
    }
    life4_58 = (((java.util.Random)(((moom.sK)(forwardValue3961_39_0)).ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life6_64 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life8_70 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.HEART)), ((double)(((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(((this.o + 0x1.0p-1d) + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))))), ((double)(((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(life4_58)), ((double)(life6_64)), ((double)(life8_70)), ((int[])(new int[0])));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic3961_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic3962_16(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_ebf98100c39e_call3963_4(moom.sK a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1298_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1298_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic3968_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d1b3a33c40f_originalDynamicSite1635_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d1b3a33c40f_originalDynamicSite1635_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral9012_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d0e131a72963_originalDynamicSite1634_1(int a0, long a1) throws E;

private static native int __sourceExactCall_b907c045594055(int p0, long p1);
private static native int __sourceExactCall_6acc809fc8fdc0();
}
