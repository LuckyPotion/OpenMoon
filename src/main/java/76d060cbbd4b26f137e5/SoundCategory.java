package net.minecraft.client.audio;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class SoundCategory extends sourcebuild.EnumConstructor<net.minecraft.client.audio.SoundCategory> {

public static net.minecraft.client.audio.SoundCategory MASTER;

public static net.minecraft.client.audio.SoundCategory MUSIC;

public static net.minecraft.client.audio.SoundCategory RECORDS;

public static net.minecraft.client.audio.SoundCategory WEATHER;

public static net.minecraft.client.audio.SoundCategory BLOCKS;

public static net.minecraft.client.audio.SoundCategory MOBS;

public static net.minecraft.client.audio.SoundCategory ANIMALS;

public static net.minecraft.client.audio.SoundCategory PLAYERS;

public static net.minecraft.client.audio.SoundCategory AMBIENT;

private static java.util.Map<java.lang.String, net.minecraft.client.audio.SoundCategory> a;

private static java.util.Map<java.lang.Integer, net.minecraft.client.audio.SoundCategory> b;

private java.lang.String c;

private int d;

private static net.minecraft.client.audio.SoundCategory[] e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private SoundCategory(java.lang.String p0, int p1, java.lang.String p2, int p3) {
super(p0, p1);
    this.c = p2;
    this.d = p3;
}


private static void initialize() {
javax.crypto.Cipher forestValue527_36_0;
    int forestValue527_36_1;
    javax.crypto.SecretKeyFactory forestValue527_36_2;
    byte[] forestValue527_36_3;
    javax.crypto.Cipher forestValue527_53_0;
    int forestValue527_53_1;
    javax.crypto.SecretKeyFactory forestValue527_53_2;
    byte[] forestValue527_53_3;
    long[] forestValue527_157_0;
    int forestValue527_157_1;
    long forestValue527_157_2;
    int forestValue527_157_3;
    long[] forestValue527_300_0;
    int forestValue527_300_1;
    long forestValue527_300_2;
    long[] forestValue527_312_0;
    int forestValue527_312_1;
    long forestValue527_312_2;
    javax.crypto.Cipher spill527_0;
    int spill527_1;
    javax.crypto.SecretKeyFactory spill527_2;
    byte[] spill527_3;
    byte[] spill527_4;
    java.lang.String spill527_5;
    int spill527_6;
    int spill527_7;
    long spill527_8;
    byte[] spill527_9;
    byte[] spill527_10;
    byte[] spill527_11;
    byte[] spill527_12;
    byte[] spill527_13;
    byte[] spill527_14;
    byte[] spill527_15;
    byte[] spill527_16;
    long spill527_17;
    int spill527_18;
    java.lang.String spill527_19;
    int spill527_20;
    long[] spill527_21;
    int spill527_22;
    long spill527_23;
    int spill527_24;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    net.minecraft.client.audio.SoundCategory[] life13_509;
    int life14_512;
    int life15_514;
    net.minecraft.client.audio.SoundCategory life16_521;
    forest_join_553: {
    forest_join_547: {
    forest_join_399: {
    forest_join_53: {
    f = ((long)(((moom._a)(moom._c.a(((long)(8963695778394103901L)), ((long)(-7973522788987376720L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12516320171876L)))));
    life11_11 = (net.minecraft.client.audio.SoundCategory.f ^ 77499762096260L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    spill527_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill527_1 = 2;
    spill527_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp527_9_0 = new byte[8];
    spill527_3 = __stackOp527_9_0;
    (__stackOp527_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue527_36_0 = spill527_0;
    forestValue527_36_1 = spill527_1;
    forestValue527_36_2 = spill527_2;
    forestValue527_36_3 = spill527_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue527_53_0 = forestValue527_36_0;
        forestValue527_53_1 = forestValue527_36_1;
        forestValue527_53_2 = forestValue527_36_2;
        forestValue527_53_3 = forestValue527_36_3;
        break forest_join_53;
    }
    byte[] __stackOp527_10_0 = forestValue527_36_3;
    spill527_4 = __stackOp527_10_0;
    (__stackOp527_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue527_36_3 = spill527_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue527_53_0)).init(((int)(forestValue527_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue527_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue527_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[7];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "SKI\027Ní¹\034²\ri0\n4¦]1an]«l)¼J\033,\033\005¼ãVÍÀ0"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill527_5 = life4_71;
    spill527_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill527_5)).substring(((int)(spill527_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue527_157_0 = life6_66;
    forestValue527_157_1 = (life3_68++);
    forestValue527_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue527_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp527_16_0 = forestValue527_157_2;
    int __stackOp527_16_1 = forestValue527_157_3;
    spill527_7 = __stackOp527_16_1;
    spill527_8 = __stackOp527_16_0;
    recovery.source.CarrierOps.discard(__stackOp527_16_1);
    life8_160 = spill527_8;
    byte[] __stackOp527_18_0 = new byte[8];
    spill527_9 = __stackOp527_18_0;
    (__stackOp527_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp527_19_0 = spill527_9;
    spill527_10 = __stackOp527_19_0;
    (__stackOp527_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp527_20_0 = spill527_10;
    spill527_11 = __stackOp527_20_0;
    (__stackOp527_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp527_21_0 = spill527_11;
    spill527_12 = __stackOp527_21_0;
    (__stackOp527_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp527_22_0 = spill527_12;
    spill527_13 = __stackOp527_22_0;
    (__stackOp527_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp527_23_0 = spill527_13;
    spill527_14 = __stackOp527_23_0;
    (__stackOp527_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp527_24_0 = spill527_14;
    spill527_15 = __stackOp527_24_0;
    (__stackOp527_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp527_25_0 = spill527_15;
    spill527_16 = __stackOp527_25_0;
    (__stackOp527_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp527_26_0 = spill527_16;
    javax.crypto.Cipher __stackOp527_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp527_26_1)).doFinal(((byte[])(__stackOp527_26_0)));
    int __stackOp527_28_0 = spill527_7;
    long __stackOp527_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill527_17 = __stackOp527_28_1;
    spill527_18 = __stackOp527_28_0;
    recovery.source.CarrierOps.discard(__stackOp527_28_1);
    switch (spill527_18) {
default:
{
        forestValue527_300_0 = forestValue527_157_0;
        forestValue527_300_1 = forestValue527_157_1;
        forestValue527_300_2 = spill527_17;
        break forest_join_300;
    }
case 0:
{
        forestValue527_312_0 = forestValue527_157_0;
        forestValue527_312_1 = forestValue527_157_1;
        forestValue527_312_2 = spill527_17;
        break forest_join_312;
    }
}
    }
    (forestValue527_300_0)[forestValue527_300_1] = forestValue527_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "¦ö\n\004:­j 7Þã¿å)¨Ö"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue527_312_0)[forestValue527_312_1] = forestValue527_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill527_19 = life4_71;
    spill527_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill527_19)).substring(((int)(spill527_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill527_21 = life6_66;
    spill527_22 = (life3_68++);
    spill527_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill527_24 = 0;
    forestValue527_157_0 = spill527_21;
    forestValue527_157_1 = spill527_22;
    forestValue527_157_2 = spill527_23;
    forestValue527_157_3 = spill527_24;
    continue forest_cycle_157;
    }
    }
    }
    g = ((long[])(life6_66));
    h = ((java.lang.Integer[])(new java.lang.Integer[7]));
    MASTER = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("MASTER", 0, "master", 0)));
    MUSIC = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("MUSIC", 1, "music", 1)));
    RECORDS = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("RECORDS", 2, "record", 2)));
    WEATHER = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("WEATHER", 3, "weather", 3)));
    BLOCKS = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("BLOCKS", 4, "block", 4)));
    MOBS = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("MOBS", 5, "hostile", 5)));
    ANIMALS = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("ANIMALS", __sourceIntrinsic_eb8803ad1f63_invokedynamic527_41(5684, (5944905124246574535L ^ life11_11)), "neutral", __sourceIntrinsic_eb8803ad1f63_invokedynamic527_42(12013, (2402936500055207195L ^ life11_11)))));
    PLAYERS = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("PLAYERS", __sourceIntrinsic_eb8803ad1f63_invokedynamic527_44(1053, (8274224810085959663L ^ life11_11)), "player", __sourceIntrinsic_eb8803ad1f63_invokedynamic527_45(32186, (8021065906978405966L ^ life11_11)))));
    AMBIENT = ((net.minecraft.client.audio.SoundCategory)(new net.minecraft.client.audio.SoundCategory("AMBIENT", __sourceIntrinsic_eb8803ad1f63_invokedynamic527_47(21988, (8126610125642143251L ^ life11_11)), "ambient", __sourceIntrinsic_eb8803ad1f63_invokedynamic527_48(2530, (3185134736736700951L ^ life11_11)))));
    e = ((net.minecraft.client.audio.SoundCategory[])(net.minecraft.client.audio.SoundCategory.a__Arrayaw()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    life13_509 = net.minecraft.client.audio.SoundCategory.values();
    life14_512 = (life13_509).length;
    life15_514 = 0;
    forest_cycle_513: while (true) {
    forest_join_532: {
    if (!((life15_514 < life14_512))) {
        break forest_join_553;
    }
    life16_521 = (life13_509)[life15_514];
    if (!((!((java.util.Map)(net.minecraft.client.audio.SoundCategory.a)).containsKey(((java.lang.Object)(((net.minecraft.client.audio.SoundCategory)(life16_521)).a__String())))))) {
        break forest_join_547;
    }
    if (!(((java.util.Map)(net.minecraft.client.audio.SoundCategory.b)).containsKey(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.audio.SoundCategory)(life16_521)).a())))))))) {
        break forest_join_532;
    }
    break forest_join_547;
    }
    ((java.util.Map)(net.minecraft.client.audio.SoundCategory.a)).put(((java.lang.Object)(((net.minecraft.client.audio.SoundCategory)(life16_521)).a__String())), ((java.lang.Object)(life16_521)));
    ((java.util.Map)(net.minecraft.client.audio.SoundCategory.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.client.audio.SoundCategory)(life16_521)).a()))))), ((java.lang.Object)(life16_521)));
    life15_514 += 1;
    continue forest_cycle_513;
    }
    }
    throw new java.lang.Error(__sourceIntrinsic_eb8803ad1f63_invokedynamic527_71(life16_521));
    }
}


public static net.minecraft.client.audio.SoundCategory[] values() {
return ((net.minecraft.client.audio.SoundCategory[])(((net.minecraft.client.audio.SoundCategory[])(net.minecraft.client.audio.SoundCategory.e)).clone()));
}


public static net.minecraft.client.audio.SoundCategory valueOf(java.lang.String p0) {
return ((net.minecraft.client.audio.SoundCategory)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.audio.SoundCategory.class)), ((java.lang.String)(p0)))));
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.audio.SoundCategory.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20949;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/aw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10137_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String() {
return this.c;
}


public int a() {
return this.d;
}


public static net.minecraft.client.audio.SoundCategory a(java.lang.String p0) {
return ((net.minecraft.client.audio.SoundCategory)(((java.util.Map)(net.minecraft.client.audio.SoundCategory.a)).get(((java.lang.Object)(p0)))));
}


private static net.minecraft.client.audio.SoundCategory[] a__Arrayaw() {
long local0_life1 = (net.minecraft.client.audio.SoundCategory.f ^ 25308744845580L);
    net.minecraft.client.audio.SoundCategory[] __sourceSharedArray1033_4 = new net.minecraft.client.audio.SoundCategory[__sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_2(16114, (7585845305551867019L ^ local0_life1))];
    __sourceSharedArray1033_4[0] = net.minecraft.client.audio.SoundCategory.MASTER;
    __sourceSharedArray1033_4[1] = net.minecraft.client.audio.SoundCategory.MUSIC;
    __sourceSharedArray1033_4[2] = net.minecraft.client.audio.SoundCategory.RECORDS;
    __sourceSharedArray1033_4[3] = net.minecraft.client.audio.SoundCategory.WEATHER;
    __sourceSharedArray1033_4[4] = net.minecraft.client.audio.SoundCategory.BLOCKS;
    __sourceSharedArray1033_4[5] = net.minecraft.client.audio.SoundCategory.MOBS;
    __sourceSharedArray1033_4[__sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_10(12013, (2402850149893758099L ^ local0_life1))] = net.minecraft.client.audio.SoundCategory.ANIMALS;
    __sourceSharedArray1033_4[__sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_12(32186, (8021154517330726854L ^ local0_life1))] = net.minecraft.client.audio.SoundCategory.PLAYERS;
    __sourceSharedArray1033_4[__sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_14(2530, (3185045844714322847L ^ local0_life1))] = net.minecraft.client.audio.SoundCategory.AMBIENT;
    return __sourceSharedArray1033_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic527_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic527_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic527_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic527_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic527_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic527_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_invokedynamic527_71(net.minecraft.client.audio.SoundCategory a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10137_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23a28ccb0dbd_originalDynamicSite1033_14(int a0, long a1) throws E;
}
