package net.minecraft.enchantment;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class Enchantment {

private static net.minecraft.enchantment.Enchantment[] a;

public static net.minecraft.enchantment.Enchantment[] b;

private static java.util.Map<moom.DD, net.minecraft.enchantment.Enchantment> c;

public static net.minecraft.enchantment.Enchantment d;

public static net.minecraft.enchantment.Enchantment e;

public static net.minecraft.enchantment.Enchantment f;

public static net.minecraft.enchantment.Enchantment g;

public static net.minecraft.enchantment.Enchantment h;

public static net.minecraft.enchantment.Enchantment i;

public static net.minecraft.enchantment.Enchantment j;

public static net.minecraft.enchantment.Enchantment k;

public static net.minecraft.enchantment.Enchantment l;

public static net.minecraft.enchantment.Enchantment m;

public static net.minecraft.enchantment.Enchantment n;

public static net.minecraft.enchantment.Enchantment o;

public static net.minecraft.enchantment.Enchantment p;

public static net.minecraft.enchantment.Enchantment q;

public static net.minecraft.enchantment.Enchantment r;

public static net.minecraft.enchantment.Enchantment s;

public static net.minecraft.enchantment.Enchantment t;

public static net.minecraft.enchantment.Enchantment u;

public static net.minecraft.enchantment.Enchantment v;

public static net.minecraft.enchantment.Enchantment w;

public static net.minecraft.enchantment.Enchantment x;

public static net.minecraft.enchantment.Enchantment y;

public static net.minecraft.enchantment.Enchantment z;

public static net.minecraft.enchantment.Enchantment A;

public static net.minecraft.enchantment.Enchantment B;

public int C;

private int D;

public net.minecraft.enchantment.EnumEnchantmentType E;

protected java.lang.String F;

private static long L;

private static long[] N;

private static java.lang.Integer[] O;

private static java.util.Map P;

protected Enchantment(int p0, moom.DD p1, int p2, net.minecraft.enchantment.EnumEnchantmentType p3) { super(); }


private static void __sourceConstructorBody_45e6f6cd1e88e4d1(net.minecraft.enchantment.Enchantment receiver, int p0, moom.DD p1, int p2, net.minecraft.enchantment.EnumEnchantmentType p3) throws Throwable {

long local5 = (net.minecraft.enchantment.Enchantment.L ^ 59824065391021L);

    net.minecraft.enchantment.Enchantment.__sourceConstructorInit_45e6f6cd1e88e4d1_0(((net.minecraft.enchantment.Enchantment)(receiver)));

    ((net.minecraft.enchantment.Enchantment)(receiver)).C = ((int)(p0));

    ((net.minecraft.enchantment.Enchantment)(receiver)).D = ((int)(p2));

    ((net.minecraft.enchantment.Enchantment)(receiver)).E = ((net.minecraft.enchantment.EnumEnchantmentType)(p3));

    if (((net.minecraft.enchantment.Enchantment.a)[p0] != null)) {

        throw new java.lang.IllegalArgumentException("Duplicate enchantment id!");

    }

    (net.minecraft.enchantment.Enchantment.a)[p0] = receiver;

    ((java.util.Map)(net.minecraft.enchantment.Enchantment.c)).put(((java.lang.Object)(p1)), ((java.lang.Object)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_45e6f6cd1e88e4d1_0(net.minecraft.enchantment.Enchantment a0) throws E;

static {
L = ((long)(((moom._a)(moom._c.a(((long)(-2381393858732816480L)), ((long)(-7196743926555762151L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(28612357652280L)))));
    long local11_life6 = (net.minecraft.enchantment.Enchantment.L ^ 46181808720368L);
    P = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1843_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1843_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1843_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1843_14 = new byte[8];
    (__sourceSpill1843_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1843_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1843_16 = __sourceSpill1843_14;
    ((javax.crypto.Cipher)(__sourceSpill1843_11)).init(((int)(__sourceSpill1843_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1843_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1843_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[22];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "û\034ÉlÓ\0255ì´{8\021\017_øÜe\032l$-«WØ+n\t0%q}1\tÊ¬\"\r\016aÛ\rÁÞõ\006<·[_pÐ:{\000Ë@4Áa&\få¡\016çË¹3T,xfH¦1±}Î´v\nx1\013Ü«\\\004ì}\036S E\034·$U@\017z*\031¾\bô¬Ù8R\022U¿È(ÿ8çØ$\007:_×¢\037\033\037Z\032ùÙ8_[ç ã\022do"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1843_25 = local4_life21;
        int __sourceSpill1843_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1843_25)).substring(((int)(__sourceSpill1843_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1843_30 = local6_life19;
        int __sourceSpill1843_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1843_33 = new byte[8];
        (__sourceSpill1843_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1843_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1843_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1843_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1843_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1843_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1843_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1843_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1843_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1843_34)).doFinal(((byte[])(__sourceSpill1843_33)));
        (__sourceSpill1843_30)[__sourceSpill1843_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "ÅÆ?E\026\003Æhü\030\034\013\026"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1843_38 = local4_life21;
        int __sourceSpill1843_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1843_38)).substring(((int)(__sourceSpill1843_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1843_43 = local6_life19;
        int __sourceSpill1843_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1843_46 = new byte[8];
        (__sourceSpill1843_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1843_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1843_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1843_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1843_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1843_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1843_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1843_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1843_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1843_47)).doFinal(((byte[])(__sourceSpill1843_46)));
        (__sourceSpill1843_43)[__sourceSpill1843_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    N = ((long[])(local6_life19));
    O = ((java.lang.Integer[])(new java.lang.Integer[22]));
    a = ((net.minecraft.enchantment.Enchantment[])(new net.minecraft.enchantment.Enchantment[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_52(32003, (8810440531747483009L ^ local11_life6))]));
    c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    d = ((net.minecraft.enchantment.Enchantment)(new moom.rQ(0, new moom.DD("protection"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_56(16937, (157138751246996129L ^ local11_life6)), 0)));
    e = ((net.minecraft.enchantment.Enchantment)(new moom.rQ(1, new moom.DD("fire_protection"), 5, 1)));
    f = ((net.minecraft.enchantment.Enchantment)(new moom.rQ(2, new moom.DD("feather_falling"), 5, 2)));
    g = ((net.minecraft.enchantment.Enchantment)(new moom.rQ(3, new moom.DD("blast_protection"), 2, 3)));
    h = ((net.minecraft.enchantment.Enchantment)(new moom.rQ(4, new moom.DD("projectile_protection"), 5, 4)));
    i = ((net.minecraft.enchantment.Enchantment)(new moom.rP(5, new moom.DD("respiration"), 2)));
    j = ((net.minecraft.enchantment.Enchantment)(new moom.rU(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_63(22479, (1545372025029789504L ^ local11_life6)), new moom.DD("aqua_affinity"), 2)));
    k = ((net.minecraft.enchantment.Enchantment)(new moom.rR(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_65(32487, (5381571023476010601L ^ local11_life6)), new moom.DD("thorns"), 1)));
    l = ((net.minecraft.enchantment.Enchantment)(new moom.rT(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_67(9408, (4406134753234777164L ^ local11_life6)), new moom.DD("depth_strider"), 2)));
    m = ((net.minecraft.enchantment.Enchantment)(new net.minecraft.enchantment.EnchantmentDamage(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_69(923, (416546626038584074L ^ local11_life6)), new moom.DD("sharpness"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_70(29306, (3936492449627382527L ^ local11_life6)), 0)));
    n = ((net.minecraft.enchantment.Enchantment)(new net.minecraft.enchantment.EnchantmentDamage(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_72(4315, (7676483274625073233L ^ local11_life6)), new moom.DD("smite"), 5, 1)));
    o = ((net.minecraft.enchantment.Enchantment)(new net.minecraft.enchantment.EnchantmentDamage(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_74(29719, (6106928381579928726L ^ local11_life6)), new moom.DD("bane_of_arthropods"), 5, 2)));
    p = ((net.minecraft.enchantment.Enchantment)(new moom.rN(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_76(9606, (2497586287897933062L ^ local11_life6)), new moom.DD("knockback"), 5)));
    q = ((net.minecraft.enchantment.Enchantment)(new moom.rL(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_78(30954, (3724366169079785597L ^ local11_life6)), new moom.DD("fire_aspect"), 2)));
    r = ((net.minecraft.enchantment.Enchantment)(new moom.rO(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_80(11202, (8635518053718129473L ^ local11_life6)), new moom.DD("looting"), 2, net.minecraft.enchantment.EnumEnchantmentType.WEAPON)));
    s = ((net.minecraft.enchantment.Enchantment)(new moom.rJ(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_83(15694, (1273170717896863195L ^ local11_life6)), new moom.DD("efficiency"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_84(29306, (3936492449627382527L ^ local11_life6)))));
    t = ((net.minecraft.enchantment.Enchantment)(new moom.rS(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_86(8878, (3859706876462723619L ^ local11_life6)), new moom.DD("silk_touch"), 1)));
    u = ((net.minecraft.enchantment.Enchantment)(new moom.rK(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_88(30135, (1789333317827437873L ^ local11_life6)), new moom.DD("unbreaking"), 5)));
    v = ((net.minecraft.enchantment.Enchantment)(new moom.rO(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_90(15971, (916554289494781683L ^ local11_life6)), new moom.DD("fortune"), 2, net.minecraft.enchantment.EnumEnchantmentType.DIGGER)));
    w = ((net.minecraft.enchantment.Enchantment)(new moom.rE(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_93(12691, (4883285756171149592L ^ local11_life6)), new moom.DD("power"), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_94(29306, (3936492449627382527L ^ local11_life6)))));
    x = ((net.minecraft.enchantment.Enchantment)(new moom.rH(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_96(2422, (8105257465931258338L ^ local11_life6)), new moom.DD("punch"), 2)));
    y = ((net.minecraft.enchantment.Enchantment)(new moom.rF(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_98(6863, (8402477274116082248L ^ local11_life6)), new moom.DD("flame"), 2)));
    z = ((net.minecraft.enchantment.Enchantment)(new moom.rG(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_100(14540, (2617132713435883610L ^ local11_life6)), new moom.DD("infinity"), 1)));
    A = ((net.minecraft.enchantment.Enchantment)(new moom.rO(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_102(12859, (8449344338366227122L ^ local11_life6)), new moom.DD("luck_of_the_sea"), 2, net.minecraft.enchantment.EnumEnchantmentType.FISHING_ROD)));
    B = ((net.minecraft.enchantment.Enchantment)(new moom.rM(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_105(31279, (7321095584488204971L ^ local11_life6)), new moom.DD("lure"), 2, net.minecraft.enchantment.EnumEnchantmentType.FISHING_ROD)));
    java.util.ArrayList local13_life109 = com.google.common.collect.Lists.newArrayList();
    net.minecraft.enchantment.Enchantment[] local14_life111 = net.minecraft.enchantment.Enchantment.a;
    int local15_life112 = (local14_life111).length;
    int local16_life113 = 0;
    while ((local16_life113 < local15_life112)) {
        net.minecraft.enchantment.Enchantment local17_life114 = (local14_life111)[local16_life113];
        if ((local17_life114 != null)) {
        ((java.util.List)(local13_life109)).add(((java.lang.Object)(local17_life114)));
    }
        local16_life113 += 1;
    }
    b = ((net.minecraft.enchantment.Enchantment[])(((net.minecraft.enchantment.Enchantment[])(((java.util.List)(local13_life109)).toArray(((java.lang.Object[])(new net.minecraft.enchantment.Enchantment[0])))))));
}


public int b(int p0) {
return (((net.minecraft.enchantment.Enchantment)(this)).a(((int)(p0))) + 5);
}


public int b() {
return 1;
}


public void b(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1, int p2) {
return;
}


public net.minecraft.enchantment.Enchantment b(java.lang.String p0) {
this.F = ((java.lang.String)(p0));
    return this;
}


public int c() {
return 1;
}


public java.lang.String a__String(int p0) {
java.lang.String local2 = net.minecraft.util.StatCollector.a(((java.lang.String)(((net.minecraft.enchantment.Enchantment)(this)).a__String())));
    return __sourceIntrinsic_74db62329af0_originalDynamicSite1862_4(local2, net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_74db62329af0_originalDynamicSite1862_2(p0)))));
}


public void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.Entity p1, int p2) {
return;
}


public boolean a(net.minecraft.item.ItemStack p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.enchantment.EnumEnchantmentType)(this.E)).a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p0)).a__wQ()))))) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.enchantment.Enchantment.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24282;
      if (O[var3] == null) {
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
         long var5 = N[var3];
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
         Object[] var9 = (Object[])P.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               P.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/rD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         O[var3] = var15;
      }

      return O[var3];
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11058_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a(int p0) {
long local2 = (net.minecraft.enchantment.Enchantment.L ^ 132523449255513L);
    return (1 + (p0 * __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1863_1(29306, (3936543555398397270L ^ local2))));
}


public int a() {
return this.D;
}


public static java.util.Set<moom.DD> a__Set() {
return ((java.util.Map)(net.minecraft.enchantment.Enchantment.c)).keySet();
}


public static net.minecraft.enchantment.Enchantment a(java.lang.String p0) {
return ((net.minecraft.enchantment.Enchantment)(((java.util.Map)(net.minecraft.enchantment.Enchantment.c)).get(((java.lang.Object)(new moom.DD(p0))))));
}


public static net.minecraft.enchantment.Enchantment a__rD(int p0) {
int forwardValue4884_11_0;
    net.minecraft.enchantment.Enchantment forwardValue4884_19_0;
    int spill4884_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_11: {
    life1_3 = (net.minecraft.enchantment.Enchantment.L ^ 129905119747782L);
    life3_5 = ((moom.rV.b()) ? 1 : 0);
    spill4884_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue4884_11_0 = spill4884_0;
        break forward_join_11;
    }
    if (!((spill4884_0 >= 0))) {
        break forward_join_18;
    }
    forwardValue4884_11_0 = p0;
    }
    if (!((forwardValue4884_11_0 < (net.minecraft.enchantment.Enchantment.a).length))) {
        break forward_join_18;
    }
    forwardValue4884_19_0 = (net.minecraft.enchantment.Enchantment.a)[p0];
    break forward_join_19;
    }
    forwardValue4884_19_0 = null;
    }
    return forwardValue4884_19_0;
}


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite1864_1(this.F);
}


public boolean a(net.minecraft.enchantment.Enchantment p0) {
long local2 = (net.minecraft.enchantment.Enchantment.L ^ 32186927871476L);
    return ((((this != p0) ? 1 : 0)) != 0);
}


public float a(int p0, net.minecraft.entity.EnumCreatureAttribute p1) {
return 0x0.0p0f;
}


public int a(int p0, net.minecraft.util.DamageSource p1) {
return 0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1843_105(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_74db62329af0_originalDynamicSite1862_2(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_74db62329af0_originalDynamicSite1862_4(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11058_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1863_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1864_1(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
