package net.minecraft.enchantment;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EnchantmentDamage extends net.minecraft.enchantment.Enchantment {

private static final java.lang.String[] G;

private static final int[] H;

private static final int[] I;

private static final int[] J;

public final int K;

private static final long M;

private static final long[] Q;

private static final java.lang.Integer[] R;

private static final java.util.Map S;

public EnchantmentDamage(int p0, moom.DD p1, int p2, int p3) {
super(p0, p1, p2, net.minecraft.enchantment.EnumEnchantmentType.WEAPON);
    this.K = p3;
}


static {
M = ((long)(((moom._a)(moom._c.a(((long)(5940198496826271977L)), ((long)(-8628619115664927335L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(244430671051501L)))));
    long local11_life6 = (net.minecraft.enchantment.EnchantmentDamage.M ^ 70674679320605L);
    S = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1844_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1844_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1844_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1844_14 = new byte[8];
    (__sourceSpill1844_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1844_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1844_16 = __sourceSpill1844_14;
    ((javax.crypto.Cipher)(__sourceSpill1844_11)).init(((int)(__sourceSpill1844_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1844_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1844_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[6];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\bÉ´BP¡M¦ûRdDk®¿4kÝ($5Å8\t9ü. "))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1844_25 = local4_life21;
        int __sourceSpill1844_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1844_25)).substring(((int)(__sourceSpill1844_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1844_30 = local6_life19;
        int __sourceSpill1844_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1844_33 = new byte[8];
        (__sourceSpill1844_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1844_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1844_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1844_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1844_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1844_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1844_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1844_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1844_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1844_34)).doFinal(((byte[])(__sourceSpill1844_33)));
        (__sourceSpill1844_30)[__sourceSpill1844_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "\035\027M«úÖk\004R?m°Ö?"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1844_38 = local4_life21;
        int __sourceSpill1844_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1844_38)).substring(((int)(__sourceSpill1844_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1844_43 = local6_life19;
        int __sourceSpill1844_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1844_46 = new byte[8];
        (__sourceSpill1844_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1844_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1844_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1844_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1844_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1844_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1844_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1844_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1844_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1844_47)).doFinal(((byte[])(__sourceSpill1844_46)));
        (__sourceSpill1844_43)[__sourceSpill1844_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    Q = ((long[])(local6_life19));
    R = ((java.lang.Integer[])(new java.lang.Integer[6]));
    java.lang.String[] __sourceSpill1844_52 = new java.lang.String[3];
    (__sourceSpill1844_52)[0] = "all";
    (__sourceSpill1844_52)[1] = "undead";
    (__sourceSpill1844_52)[2] = "arthropods";
    G = ((java.lang.String[])(__sourceSpill1844_52));
    int[] __sourceSpill1844_54 = new int[3];
    (__sourceSpill1844_54)[0] = 1;
    (__sourceSpill1844_54)[1] = 5;
    (__sourceSpill1844_54)[2] = 5;
    H = ((int[])(__sourceSpill1844_54));
    int[] __sourceSpill1844_57 = new int[3];
    (__sourceSpill1844_57)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_56(2916, (1427250715559530854L ^ local11_life6));
    (__sourceSpill1844_57)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_58(12099, (2398168637982192960L ^ local11_life6));
    (__sourceSpill1844_57)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_59(27353, (1610254082194600156L ^ local11_life6));
    I = ((int[])(__sourceSpill1844_57));
    int[] __sourceSpill1844_62 = new int[3];
    (__sourceSpill1844_62)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_61(28259, (6950505197112620131L ^ local11_life6));
    (__sourceSpill1844_62)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_63(31354, (5746045012185768062L ^ local11_life6));
    (__sourceSpill1844_62)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_64(31354, (5746045012185768062L ^ local11_life6));
    J = ((int[])(__sourceSpill1844_62));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11060_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26139;
      if (R[var3] == null) {
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
         long var5 = Q[var3];
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
         Object[] var9 = (Object[])S.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               S.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/rI", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         R[var3] = var15;
      }

      return R[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.enchantment.EnchantmentDamage.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b(int p0) {
return (((net.minecraft.enchantment.EnchantmentDamage)(this)).a(((int)(p0))) + (net.minecraft.enchantment.EnchantmentDamage.J)[this.K]);
}


public int c() {
return 5;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(int p0) {
return ((net.minecraft.enchantment.EnchantmentDamage.H)[this.K] + ((p0 - 1) * (net.minecraft.enchantment.EnchantmentDamage.I)[this.K]));
}


public boolean a(net.minecraft.item.ItemStack p0) {
int forwardValue4888_19_0;
    int forwardValue4888_21_0;
    int spill4888_0;
    boolean spill4888_1;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.enchantment.EnchantmentDamage.M ^ 43787295457871L);
    life4_5 = ((moom.rV.c()) ? 1 : 0);
    spill4888_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof moom.xR) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4888_19_0 = spill4888_0;
        break forward_join_19;
    }
    if (!((spill4888_0 == 0))) {
        break forward_join_18;
    }
    spill4888_1 = super.a(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue4888_19_0 = ((spill4888_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4888_1)) {
        break forward_join_20;
    }
    }
    forwardValue4888_19_0 = 1;
    }
    forwardValue4888_21_0 = forwardValue4888_19_0;
    break forward_join_21;
    }
    forwardValue4888_21_0 = 0;
    }
    return ((forwardValue4888_21_0) != 0);
}


public boolean a(net.minecraft.enchantment.Enchantment p0) {
int forwardValue4886_12_0;
    int forwardValue4886_14_0;
    int spill4886_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (net.minecraft.enchantment.EnchantmentDamage.M ^ 74233637412444L);
    life4_5 = ((moom.rV.b()) ? 1 : 0);
    spill4886_0 = ((p0 instanceof net.minecraft.enchantment.EnchantmentDamage) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue4886_12_0 = spill4886_0;
        break forward_join_12;
    }
    if (!((spill4886_0 == 0))) {
        break forward_join_13;
    }
    forwardValue4886_12_0 = 1;
    }
    forwardValue4886_14_0 = forwardValue4886_12_0;
    break forward_join_14;
    }
    forwardValue4886_14_0 = 0;
    }
    return ((forwardValue4886_14_0) != 0);
}


public float a(int p0, net.minecraft.entity.EnumCreatureAttribute p1) {
int forwardValue4885_18_0;
    int forwardValue4885_33_0;
    int forwardValue4885_33_1;
    float forwardValue4885_43_0;
    int spill4885_0;
    int spill4885_1;
    long life3_3;
    int life5_5;
    forward_join_43: {
    forward_join_42: {
    forward_join_33: {
    forward_join_30: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (net.minecraft.enchantment.EnchantmentDamage.M ^ 136000185344808L);
    life5_5 = ((moom.rV.c()) ? 1 : 0);
    spill4885_0 = this.K;
    if (!((life5_5 == 0))) {
        forwardValue4885_18_0 = spill4885_0;
        break forward_join_18;
    }
    if (!((spill4885_0 == 0))) {
        break forward_join_16;
    }
    forwardValue4885_43_0 = (((float) p0) * 0x1.4p0f);
    break forward_join_43;
    }
    forwardValue4885_18_0 = this.K;
    }
    spill4885_1 = 1;
    if (!((life5_5 == 0))) {
        forwardValue4885_33_0 = forwardValue4885_18_0;
        forwardValue4885_33_1 = spill4885_1;
        break forward_join_33;
    }
    if (!((forwardValue4885_18_0 == spill4885_1))) {
        break forward_join_30;
    }
    if (!((p1 == net.minecraft.entity.EnumCreatureAttribute.UNDEAD))) {
        break forward_join_30;
    }
    forwardValue4885_43_0 = (((float) p0) * 0x1.4p1f);
    break forward_join_43;
    }
    forwardValue4885_33_0 = this.K;
    forwardValue4885_33_1 = 2;
    }
    if (!((forwardValue4885_33_0 == forwardValue4885_33_1))) {
        break forward_join_42;
    }
    if (!((p1 == net.minecraft.entity.EnumCreatureAttribute.ARTHROPOD))) {
        break forward_join_42;
    }
    forwardValue4885_43_0 = (((float) p0) * 0x1.4p1f);
    break forward_join_43;
    }
    forwardValue4885_43_0 = 0x0.0p0f;
    }
    return forwardValue4885_43_0;
}


public void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1, int p2) {
net.minecraft.entity.Entity forwardValue4887_12_0;
    net.minecraft.entity.Entity spill4887_0;
    long life4_3;
    int life6_5;
    net.minecraft.entity.EntityLivingBase life7_19;
    int life8_47;
    forward_join_48: {
    forward_join_12: {
    life4_3 = (net.minecraft.enchantment.EnchantmentDamage.M ^ 42042699426453L);
    life6_5 = ((moom.rV.c()) ? 1 : 0);
    spill4887_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue4887_12_0 = spill4887_0;
        break forward_join_12;
    }
    if (!((((spill4887_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_48;
    }
    forwardValue4887_12_0 = p1;
    }
    life7_19 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4887_12_0));
    if (!((this.K == 2))) {
        break forward_join_48;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(life7_19)).a__aR() == net.minecraft.entity.EnumCreatureAttribute.ARTHROPOD))) {
        break forward_join_48;
    }
    life8_47 = (__sourceIntrinsic_383604b3105b_invokedynamic4887_8(31354, (5746147845026683638L ^ life4_3)) + ((java.util.Random)(((net.minecraft.entity.EntityLivingBase)(p0)).a__Random())).nextInt(((int)((__sourceIntrinsic_383604b3105b_invokedynamic4887_10(1543, (2197420269209872014L ^ life4_3)) * p2)))));
    ((net.minecraft.entity.EntityLivingBase)(life7_19)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.e)).I, life8_47, 3))));
    }
    return;
}


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite1865_2((net.minecraft.enchantment.EnchantmentDamage.G)[this.K]);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1844_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11060_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_383604b3105b_invokedynamic4887_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_383604b3105b_invokedynamic4887_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1865_2(java.lang.String a0) throws E;
}
