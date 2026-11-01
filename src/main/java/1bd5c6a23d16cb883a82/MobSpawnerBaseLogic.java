package net.minecraft.tileentity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class MobSpawnerBaseLogic {

private int a;

private java.lang.String b;

private java.util.List<moom.D4> c;

private moom.D4 d;

private double e;

private double f;

private int g;

private int h;

private int i;

private net.minecraft.entity.Entity j;

private int k;

private int l;

private int m;

private static java.lang.String[] n;

private static long p;

private static long[] r;

private static java.lang.Integer[] s;

private static java.util.Map t;

public MobSpawnerBaseLogic() { super(); }


private static void __sourceConstructorBody_b9c347ea5f2d8f74(net.minecraft.tileentity.MobSpawnerBaseLogic receiver) throws Throwable {

long local1 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 100917782393169L);

    net.minecraft.tileentity.MobSpawnerBaseLogic.__sourceConstructorInit_b9c347ea5f2d8f74_0(((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).a = ((int)(__sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_2(11766, (1974961379547402302L ^ local1))));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).b = ((java.lang.String)("Pig"));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).c = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).g = ((int)(__sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_7(10181, (9169506209207540227L ^ local1))));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).h = ((int)(__sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_9(1645, (5445137994748984232L ^ local1))));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).i = ((int)(__sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_11(8171, (7756550100845355560L ^ local1))));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).k = ((int)(__sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_13(29331, (7506320274083549023L ^ local1))));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).l = ((int)(__sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_15(243, (1221397375485246777L ^ local1))));

    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(receiver)).m = ((int)(__sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_17(19219, (4083202698739627742L ^ local1))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_b9c347ea5f2d8f74_0(net.minecraft.tileentity.MobSpawnerBaseLogic a0) throws E;

static {
p = ((long)(((moom._a)(moom._c.a(((long)(-4227854889199656475L)), ((long)(3849319409348023053L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44408696803027L)))));
    java.lang.String[] __sourceSpill1924_6 = new java.lang.String[2];
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 103901647465361L);
    net.minecraft.tileentity.MobSpawnerBaseLogic.b(((java.lang.String[])(__sourceSpill1924_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1924_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1924_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1924_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1924_16 = new byte[8];
    (__sourceSpill1924_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1924_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1924_18 = __sourceSpill1924_16;
    ((javax.crypto.Cipher)(__sourceSpill1924_13)).init(((int)(__sourceSpill1924_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1924_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1924_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[13];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "YÑÏ\025*Ïà.x\0217JÈö[\032´\035ëâ\031Ú¤g=fZòÔÀ\007CUÌÝ8\0047LÍñ´EDWù)y6¼²Ì\b\n7\r\b²4f1Ï\013ð9\0170ÌÆçÑ¯²T ?â\017b"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1924_27 = local6_life23;
        int __sourceSpill1924_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1924_27)).substring(((int)(__sourceSpill1924_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1924_32 = local8_life21;
        int __sourceSpill1924_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1924_35 = new byte[8];
        (__sourceSpill1924_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1924_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1924_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1924_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1924_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1924_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1924_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1924_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1924_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1924_36)).doFinal(((byte[])(__sourceSpill1924_35)));
        (__sourceSpill1924_32)[__sourceSpill1924_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ô¦Ìým&ú\032­\f\021iC¸û"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1924_40 = local6_life23;
        int __sourceSpill1924_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1924_40)).substring(((int)(__sourceSpill1924_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1924_45 = local8_life21;
        int __sourceSpill1924_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1924_48 = new byte[8];
        (__sourceSpill1924_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1924_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1924_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1924_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1924_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1924_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1924_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1924_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1924_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1924_49)).doFinal(((byte[])(__sourceSpill1924_48)));
        (__sourceSpill1924_45)[__sourceSpill1924_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    r = ((long[])(local8_life21));
    s = ((java.lang.Integer[])(new java.lang.Integer[13]));
}


private void b__Void() {
int forwardValue5638_23_0;
    int forwardValue5638_23_1;
    net.minecraft.tileentity.MobSpawnerBaseLogic forwardValue5638_51_0;
    int spill5638_0;
    int spill5638_1;
    net.minecraft.tileentity.MobSpawnerBaseLogic spill5638_2;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_33;
    forward_join_51: {
    forward_join_50: {
    forward_join_35: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 1891371977039L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5638_0 = this.h;
    spill5638_1 = this.g;
    if (!((life3_5 != null))) {
        forwardValue5638_23_0 = spill5638_0;
        forwardValue5638_23_1 = spill5638_1;
        break forward_join_23;
    }
    if (!((spill5638_0 <= spill5638_1))) {
        break forward_join_19;
    }
    this.a = ((int)(this.g));
    if (!((life3_5 == null))) {
        break forward_join_35;
    }
    }
    forwardValue5638_23_0 = this.h;
    forwardValue5638_23_1 = this.g;
    }
    life4_33 = (forwardValue5638_23_0 - forwardValue5638_23_1);
    this.a = ((int)((this.g + ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextInt(((int)(life4_33))))));
    }
    spill5638_2 = this;
    if (!((life3_5 != null))) {
        forwardValue5638_51_0 = spill5638_2;
        break forward_join_51;
    }
    if (!((((java.util.List)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(spill5638_2)).c)).size() > 0))) {
        break forward_join_50;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a(((moom.D4)(((moom.D4)(moom.D0.a(((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)), ((java.util.Collection)(this.c))))))));
    }
    forwardValue5638_51_0 = this;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(forwardValue5638_51_0)).a(((int)(1)));
    return;
}


public static java.lang.String[] b__ArrayString() {
return net.minecraft.tileentity.MobSpawnerBaseLogic.n;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
moom.D4 lexicalValue1687_76_0;
    net.minecraft.tileentity.MobSpawnerBaseLogic lexicalValue1687_78_0;
    java.util.List lexicalValue1687_93_0;
    java.lang.String[] spill1687_0;
    moom.D4 spill1687_1;
    net.minecraft.tileentity.MobSpawnerBaseLogic spill1687_2;
    java.util.List spill1687_3;
    long life2_3;
    java.lang.String life5_7;
    java.lang.String[] life4_8;
    net.minecraft.nbt.NBTTagList life6_99;
    java.util.Iterator life7_115;
    moom.D4 life8_122;
    lexical_join_121: {
    lexical_join_117: {
    lexical_join_112: {
    lexical_join_110: {
    lexical_join_93: {
    lexical_join_81: {
    lexical_join_78: {
    lexical_join_76: {
    lexical_join_72: {
    lexical_join_60: {
    life2_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 23613731013575L);
    spill1687_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life5_7 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__String();
    life4_8 = spill1687_0;
    if (!((life4_8 != null))) {
        break lexical_join_60;
    }
    if (!((!moom.DK.a__Boolean(((java.lang.String)(life5_7)))))) {
        break lexical_join_121;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("EntityId")), ((java.lang.String)(life5_7)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Delay")), ((short)(((short) this.a))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("MinSpawnDelay")), ((short)(((short) this.g))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("MaxSpawnDelay")), ((short)(((short) this.h))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SpawnCount")), ((short)(((short) this.i))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("MaxNearbyEntities")), ((short)(((short) this.k))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("RequiredPlayerRange")), ((short)(((short) this.l))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SpawnRange")), ((short)(((short) this.m))));
    }
    spill1687_1 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4();
    if (!((life4_8 != null))) {
        lexicalValue1687_76_0 = spill1687_1;
        break lexical_join_76;
    }
    if (!((spill1687_1 != null))) {
        break lexical_join_72;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SpawnData")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTTagCompound)(((moom.D4)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4())).c)).a__yn())));
    }
    spill1687_2 = this;
    if (!((life4_8 != null))) {
        lexicalValue1687_78_0 = spill1687_2;
        break lexical_join_78;
    }
    lexicalValue1687_76_0 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(spill1687_2)).a__D4();
    }
    if (!((lexicalValue1687_76_0 == null))) {
        break lexical_join_81;
    }
    lexicalValue1687_78_0 = this;
    }
    if (!((((java.util.List)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(lexicalValue1687_78_0)).c)).size() > 0))) {
        break lexical_join_121;
    }
    }
    life6_99 = new net.minecraft.nbt.NBTTagList();
    spill1687_3 = this.c;
    if (!((life4_8 != null))) {
        lexicalValue1687_93_0 = spill1687_3;
        break lexical_join_93;
    }
    if (!((((java.util.List)(spill1687_3)).size() > 0))) {
        break lexical_join_112;
    }
    lexicalValue1687_93_0 = this.c;
    }
    life7_115 = ((java.util.List)(lexicalValue1687_93_0)).iterator();
    lexical_cycle_95: while (true) {
    if (!(((java.util.Iterator)(life7_115)).hasNext())) {
        break lexical_join_110;
    }
    life8_122 = ((moom.D4)(((java.util.Iterator)(life7_115)).next()));
    ((net.minecraft.nbt.NBTTagList)(life6_99)).a(((net.minecraft.nbt.NBTBase)(((moom.D4)(life8_122)).a())));
    if (!((life4_8 != null))) {
        break lexical_join_117;
    }
    if (!((life4_8 == null))) { continue lexical_cycle_95; }
    break lexical_cycle_95;
    }
    }
    if (!((life4_8 == null))) {
        break lexical_join_117;
    }
    }
    ((net.minecraft.nbt.NBTTagList)(life6_99)).a(((net.minecraft.nbt.NBTBase)(((moom.D4)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4())).a())));
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SpawnPotentials")), ((net.minecraft.nbt.NBTBase)(life6_99)));
    }
    return;
}


public static void b(java.lang.String[] p0) {
n = ((java.lang.String[])(p0));
    return;
}


public double b() {
return this.f;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12229_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/B6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public double a() {
return this.e;
}


public abstract moom.DT a__DT();

public abstract net.minecraft.world.World a__Eu();

private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.tileentity.MobSpawnerBaseLogic.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22828;
      if (s[var3] == null) {
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
         long var5 = r[var3];
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
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/B6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         s[var3] = var15;
      }

      return s[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue1685_68_0;
    int lexicalValue1685_118_0;
    int lexicalValue1685_139_0;
    net.minecraft.tileentity.MobSpawnerBaseLogic lexicalValue1685_151_0;
    java.lang.String[] spill1685_0;
    boolean spill1685_1;
    boolean spill1685_2;
    net.minecraft.tileentity.MobSpawnerBaseLogic spill1685_3;
    long life2_3;
    java.lang.String[] life4_10;
    net.minecraft.nbt.NBTTagList life5_41;
    int life6_43;
    lexical_join_153: {
    lexical_join_151: {
    lexical_join_145: {
    lexical_join_139: {
    lexical_join_131: {
    lexical_join_118: {
    lexical_join_110: {
    lexical_join_84: {
    lexical_join_81: {
    lexical_join_68: {
    lexical_join_60: {
    life2_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 43641718509328L);
    spill1685_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    this.b = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("EntityId")))));
    life4_10 = spill1685_0;
    this.a = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Delay")))));
    ((java.util.List)(this.c)).clear();
    spill1685_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SpawnPotentials")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1685_8(12740, (6857737847999033922L ^ life2_3)))));
    if (!((life4_10 != null))) {
        lexicalValue1685_68_0 = ((spill1685_1) ? 1 : 0);
        break lexical_join_68;
    }
    if (!(spill1685_1)) {
        break lexical_join_60;
    }
    life5_41 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SpawnPotentials")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1685_11(3780, (587346090807414091L ^ life2_3)))));
    life6_43 = 0;
    lexical_cycle_41: while (true) {
    if (!((life6_43 < ((net.minecraft.nbt.NBTTagList)(life5_41)).a__Int()))) {
        break lexical_join_60;
    }
    ((java.util.List)(this.c)).add(((java.lang.Object)(new moom.D4(((net.minecraft.nbt.NBTTagList)(life5_41)).a__yw(((int)(life6_43)))))));
    life6_43 += 1;
    if (!((life4_10 != null))) {
        break lexical_join_81;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    lexicalValue1685_68_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SpawnData")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1685_17(3780, (587346090807414091L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue1685_68_0 != 0))) {
        break lexical_join_81;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a(((moom.D4)(new moom.D4(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("SpawnData"))), this.b))));
    if (!((life4_10 == null))) {
        break lexical_join_84;
    }
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a(((moom.D4)(null)));
    }
    spill1685_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("MinSpawnDelay")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1685_24(5555, (6694943654644504118L ^ life2_3)))));
    if (!((life4_10 != null))) {
        lexicalValue1685_118_0 = ((spill1685_2) ? 1 : 0);
        break lexical_join_118;
    }
    if (!(spill1685_2)) {
        break lexical_join_110;
    }
    this.g = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("MinSpawnDelay")))));
    this.h = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("MaxSpawnDelay")))));
    this.i = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("SpawnCount")))));
    }
    lexicalValue1685_118_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("MaxNearbyEntities")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1685_33(22347, (2127615845275866307L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_10 != null))) {
        lexicalValue1685_139_0 = lexicalValue1685_118_0;
        break lexical_join_139;
    }
    if (!((lexicalValue1685_118_0 != 0))) {
        break lexical_join_131;
    }
    this.k = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("MaxNearbyEntities")))));
    this.l = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("RequiredPlayerRange")))));
    }
    lexicalValue1685_139_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("SpawnRange")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1685_40(22347, (2127615845275866307L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue1685_139_0 != 0))) {
        break lexical_join_145;
    }
    this.m = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("SpawnRange")))));
    }
    spill1685_3 = this;
    if (!((life4_10 != null))) {
        lexicalValue1685_151_0 = spill1685_3;
        break lexical_join_151;
    }
    if (!((((net.minecraft.tileentity.MobSpawnerBaseLogic)(spill1685_3)).a__Eu() != null))) {
        break lexical_join_153;
    }
    lexicalValue1685_151_0 = this;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(lexicalValue1685_151_0)).j = ((net.minecraft.entity.Entity)(null));
    }
    return;
}


private net.minecraft.entity.Entity a(net.minecraft.entity.Entity p0, boolean p1) {
int lexicalValue1684_61_0;
    net.minecraft.entity.Entity lexicalValue1684_63_0;
    int lexicalValue1684_150_0;
    net.minecraft.entity.Entity lexicalValue1684_152_0;
    net.minecraft.entity.Entity lexicalValue1684_155_0;
    int lexicalValue1684_178_0;
    int lexicalValue1684_197_0;
    net.minecraft.entity.Entity lexicalValue1684_199_0;
    net.minecraft.entity.Entity spill1684_0;
    boolean spill1684_1;
    net.minecraft.entity.Entity spill1684_2;
    net.minecraft.entity.Entity spill1684_3;
    boolean spill1684_4;
    net.minecraft.entity.Entity spill1684_5;
    net.minecraft.entity.Entity spill1684_6;
    boolean spill1684_7;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.nbt.NBTTagCompound life6_12;
    java.util.Iterator life7_22;
    java.lang.String life8_29;
    net.minecraft.nbt.NBTBase life9_35;
    net.minecraft.entity.Entity life8_78;
    net.minecraft.nbt.NBTTagCompound life7_91;
    net.minecraft.entity.Entity life9_98;
    net.minecraft.nbt.NBTTagCompound life10_114;
    java.util.Iterator life11_122;
    java.lang.String life12_129;
    net.minecraft.nbt.NBTBase life13_133;
    lexical_join_199: {
    lexical_join_198: {
    lexical_join_197: {
    lexical_join_193: {
    lexical_join_178: {
    lexical_join_162: {
    lexical_join_160: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_48: {
    lexical_join_45: {
    life3_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 113394574714946L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4() != null))) {
        break lexical_join_162;
    }
    life6_12 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.entity.Entity)(p0)).b__Boolean(((net.minecraft.nbt.NBTTagCompound)(life6_12)));
    life7_22 = ((java.util.Set)(((net.minecraft.nbt.NBTTagCompound)(((moom.D4)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4())).c)).a__Set())).iterator();
    lexical_cycle_23: while (true) {
    if (!(((java.util.Iterator)(life7_22)).hasNext())) {
        break lexical_join_45;
    }
    life8_29 = ((java.lang.String)(((java.util.Iterator)(life7_22)).next()));
    life9_35 = ((net.minecraft.nbt.NBTTagCompound)(((moom.D4)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4())).c)).a__yn(((java.lang.String)(life8_29)));
    ((net.minecraft.nbt.NBTTagCompound)(life6_12)).a(((java.lang.String)(life8_29)), ((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTBase)(life9_35)).a__yn())));
    if (!((life5_5 != null))) {
        break lexical_join_48;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    ((net.minecraft.entity.Entity)(p0)).b(((net.minecraft.nbt.NBTTagCompound)(life6_12)));
    }
    spill1684_0 = p0;
    if (!((life5_5 != null))) {
        lexicalValue1684_63_0 = spill1684_0;
        break lexical_join_63;
    }
    if (!((((net.minecraft.entity.Entity)(spill1684_0)).i != null))) {
        break lexical_join_62;
    }
    spill1684_1 = p1;
    if (!((life5_5 != null))) {
        lexicalValue1684_61_0 = ((spill1684_1) ? 1 : 0);
        break lexical_join_61;
    }
    if (!(spill1684_1)) {
        break lexical_join_62;
    }
    lexicalValue1684_61_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p0)).i)).b__Boolean(((net.minecraft.entity.Entity)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1684_61_0);
    }
    lexicalValue1684_63_0 = p0;
    }
    life8_78 = lexicalValue1684_63_0;
    lexical_cycle_64: while (true) {
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_152: {
    lexical_join_151: {
    lexical_join_150: {
    lexical_join_137: {
    lexical_join_122: {
    if (!(((net.minecraft.nbt.NBTTagCompound)(life6_12)).a__Boolean(((java.lang.String)("Riding")), ((int)(__sourceIntrinsic_2e01ee0908da_invokedynamic1684_23(13624, (731504586078949860L ^ life3_3))))))) {
        break lexical_join_160;
    }
    life7_91 = ((net.minecraft.nbt.NBTTagCompound)(life6_12)).a__yw(((java.lang.String)("Riding")));
    life9_98 = net.minecraft.entity.EntityList.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life7_91)).a__String(((java.lang.String)("id"))))), ((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p0)).i)));
    spill1684_2 = life9_98;
    if (!((life5_5 != null))) {
        lexicalValue1684_199_0 = spill1684_2;
        break lexical_join_199;
    }
    if (!((life5_5 != null))) {
        lexicalValue1684_155_0 = spill1684_2;
        break lexical_join_155;
    }
    if (!((spill1684_2 != null))) {
        break lexical_join_154;
    }
    life10_114 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.entity.Entity)(life9_98)).b__Boolean(((net.minecraft.nbt.NBTTagCompound)(life10_114)));
    life11_122 = ((java.util.Set)(((net.minecraft.nbt.NBTTagCompound)(life7_91)).a__Set())).iterator();
    lexical_cycle_102: while (true) {
    if (!(((java.util.Iterator)(life11_122)).hasNext())) {
        break lexical_join_122;
    }
    life12_129 = ((java.lang.String)(((java.util.Iterator)(life11_122)).next()));
    life13_133 = ((net.minecraft.nbt.NBTTagCompound)(life7_91)).a__yn(((java.lang.String)(life12_129)));
    ((net.minecraft.nbt.NBTTagCompound)(life10_114)).a(((java.lang.String)(life12_129)), ((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTBase)(life13_133)).a__yn())));
    if (!((life5_5 != null))) {
        break lexical_join_137;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_102; }
    break lexical_cycle_102;
    }
    }
    ((net.minecraft.entity.Entity)(life9_98)).b(((net.minecraft.nbt.NBTTagCompound)(life10_114)));
    ((net.minecraft.entity.Entity)(life9_98)).c(((double)(((net.minecraft.entity.Entity)(life8_78)).n)), ((double)(((net.minecraft.entity.Entity)(life8_78)).o)), ((double)(((net.minecraft.entity.Entity)(life8_78)).p)), ((float)(((net.minecraft.entity.Entity)(life8_78)).w)), ((float)(((net.minecraft.entity.Entity)(life8_78)).x)));
    }
    spill1684_3 = p0;
    if (!((life5_5 != null))) {
        lexicalValue1684_152_0 = spill1684_3;
        break lexical_join_152;
    }
    if (!((((net.minecraft.entity.Entity)(spill1684_3)).i != null))) {
        break lexical_join_151;
    }
    spill1684_4 = p1;
    if (!((life5_5 != null))) {
        lexicalValue1684_150_0 = ((spill1684_4) ? 1 : 0);
        break lexical_join_150;
    }
    if (!(spill1684_4)) {
        break lexical_join_151;
    }
    lexicalValue1684_150_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p0)).i)).b__Boolean(((net.minecraft.entity.Entity)(life9_98)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1684_150_0);
    }
    lexicalValue1684_152_0 = life8_78;
    }
    ((net.minecraft.entity.Entity)(lexicalValue1684_152_0)).b(((net.minecraft.entity.Entity)(life9_98)));
    }
    lexicalValue1684_155_0 = life9_98;
    }
    life8_78 = lexicalValue1684_155_0;
    life6_12 = life7_91;
    if (!((life5_5 == null))) { continue lexical_cycle_64; }
    break lexical_cycle_64;
    }
    }
    if (!((life5_5 == null))) {
        break lexical_join_198;
    }
    }
    spill1684_5 = p0;
    if (!((life5_5 != null))) {
        lexicalValue1684_199_0 = spill1684_5;
        break lexical_join_199;
    }
    if (!((((spill1684_5 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break lexical_join_198;
    }
    spill1684_6 = p0;
    if (!((life5_5 != null))) {
        lexicalValue1684_199_0 = spill1684_6;
        break lexical_join_199;
    }
    if (!((((net.minecraft.entity.Entity)(spill1684_6)).i != null))) {
        break lexical_join_198;
    }
    spill1684_7 = p1;
    if (!((life5_5 != null))) {
        lexicalValue1684_178_0 = ((spill1684_7) ? 1 : 0);
        break lexical_join_178;
    }
    if (!(spill1684_7)) {
        break lexical_join_198;
    }
    lexicalValue1684_178_0 = ((p0 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        lexicalValue1684_197_0 = lexicalValue1684_178_0;
        break lexical_join_197;
    }
    if (!((lexicalValue1684_178_0 != 0))) {
        break lexical_join_193;
    }
    ((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0)))).a(((moom.Eh)(((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p0)).i)).a__Eh(((moom.DT)(new moom.DT(p0)))))), ((net.minecraft.entity.IEntityLivingData)(null)));
    }
    lexicalValue1684_197_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p0)).i)).b__Boolean(((net.minecraft.entity.Entity)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1684_197_0);
    }
    lexicalValue1684_199_0 = p0;
    }
    return lexicalValue1684_199_0;
}


public void a__Void() {
net.minecraft.tileentity.MobSpawnerBaseLogic lexicalValue1686_12_0;
    net.minecraft.tileentity.MobSpawnerBaseLogic lexicalValue1686_90_0;
    int lexicalValue1686_108_0;
    int lexicalValue1686_116_0;
    int lexicalValue1686_127_0;
    int lexicalValue1686_200_0;
    net.minecraft.entity.Entity lexicalValue1686_256_0;
    net.minecraft.entity.EntityLiving lexicalValue1686_259_0;
    int lexicalValue1686_285_0;
    net.minecraft.entity.EntityLiving lexicalValue1686_302_0;
    net.minecraft.entity.EntityLiving lexicalValue1686_306_0;
    net.minecraft.tileentity.MobSpawnerBaseLogic spill1686_0;
    boolean spill1686_1;
    net.minecraft.tileentity.MobSpawnerBaseLogic spill1686_2;
    int spill1686_3;
    net.minecraft.entity.Entity spill1686_4;
    net.minecraft.entity.EntityLiving spill1686_5;
    boolean spill1686_6;
    net.minecraft.entity.EntityLiving spill1686_7;
    long life1_3;
    java.lang.String[] life3_5;
    moom.DT life4_19;
    double life5_38;
    double life7_48;
    double life9_58;
    int life5_156;
    int life6_158;
    net.minecraft.entity.Entity life7_168;
    int life8_222;
    double life9_256;
    double life11_268;
    double life13_288;
    net.minecraft.entity.EntityLiving life15_304;
    lexical_join_316: {
    lexical_join_312: {
    lexical_join_127: {
    lexical_join_126: {
    lexical_join_116: {
    lexical_join_114: {
    lexical_join_108: {
    lexical_join_106: {
    lexical_join_90: {
    lexical_join_85: {
    lexical_join_12: {
    life1_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 116488654546323L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1686_0 = this;
    if (!((life3_5 != null))) {
        lexicalValue1686_12_0 = spill1686_0;
        break lexical_join_12;
    }
    if (!(((net.minecraft.tileentity.MobSpawnerBaseLogic)(spill1686_0)).a__Boolean())) {
        break lexical_join_316;
    }
    lexicalValue1686_12_0 = this;
    }
    life4_19 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(lexicalValue1686_12_0)).a__DT();
    spill1686_1 = ((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).G;
    if (!((life3_5 != null))) {
        lexicalValue1686_108_0 = ((spill1686_1) ? 1 : 0);
        break lexical_join_108;
    }
    if (!(spill1686_1)) {
        break lexical_join_106;
    }
    life5_38 = ((double) (((float) ((moom.DT)(life4_19)).a()) + ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextFloat()));
    life7_48 = ((double) (((float) ((moom.DT)(life4_19)).b()) + ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextFloat()));
    life9_58 = ((double) (((float) ((moom.DT)(life4_19)).c()) + ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextFloat()));
    ((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(life5_38)), ((double)(life7_48)), ((double)(life9_58)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    ((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.FLAME)), ((double)(life5_38)), ((double)(life7_48)), ((double)(life9_58)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    spill1686_2 = this;
    if (!((life3_5 != null))) {
        lexicalValue1686_90_0 = spill1686_2;
        break lexical_join_90;
    }
    if (!((((net.minecraft.tileentity.MobSpawnerBaseLogic)(spill1686_2)).a > 0))) {
        break lexical_join_85;
    }
    net.minecraft.tileentity.MobSpawnerBaseLogic __stackOp1686_26_0 = this;
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(__stackOp1686_26_0)).a = ((int)((((net.minecraft.tileentity.MobSpawnerBaseLogic)(__stackOp1686_26_0)).a - 1)));
    }
    this.f = ((double)(this.e));
    lexicalValue1686_90_0 = this;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(lexicalValue1686_90_0)).e = ((double)(((this.e + ((double) (0x1.f4p9f / (((float) this.a) + 0x1.9p7f)))) % 0x1.68p8d)));
    if (!((life3_5 == null))) {
        break lexical_join_316;
    }
    }
    lexicalValue1686_108_0 = this.a;
    }
    if (!((life3_5 != null))) {
        lexicalValue1686_116_0 = lexicalValue1686_108_0;
        break lexical_join_116;
    }
    if (!((lexicalValue1686_108_0 == -1))) {
        break lexical_join_114;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).b__Void();
    }
    lexicalValue1686_116_0 = this.a;
    }
    if (!((life3_5 != null))) {
        lexicalValue1686_127_0 = lexicalValue1686_116_0;
        break lexical_join_127;
    }
    if (!((lexicalValue1686_116_0 > 0))) {
        break lexical_join_126;
    }
    net.minecraft.tileentity.MobSpawnerBaseLogic __stackOp1686_37_0 = this;
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(__stackOp1686_37_0)).a = ((int)((((net.minecraft.tileentity.MobSpawnerBaseLogic)(__stackOp1686_37_0)).a - 1)));
    return;
    }
    lexicalValue1686_127_0 = 0;
    }
    life5_156 = lexicalValue1686_127_0;
    life6_158 = 0;
    lexical_cycle_130: while (true) {
    lexical_join_309: {
    lexical_join_307: {
    lexical_join_306: {
    lexical_join_302: {
    lexical_join_286: {
    lexical_join_285: {
    lexical_join_259: {
    lexical_join_258: {
    lexical_join_256: {
    lexical_join_200: {
    lexical_join_198: {
    lexical_join_145: {
    if (!((life6_158 < this.i))) {
        break lexical_join_312;
    }
    life7_168 = net.minecraft.entity.EntityList.a(((java.lang.String)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__String())), ((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())));
    if (!((life3_5 != null))) {
        break lexical_join_316;
    }
    if (!((life7_168 == null))) {
        break lexical_join_145;
    }
    return;
    }
    life8_222 = ((java.util.List)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).a(((java.lang.Class)(((java.lang.Object)(life7_168)).getClass())), ((moom.CA)(((moom.CA)(new moom.CA(((double) ((moom.DT)(life4_19)).a()), ((double) ((moom.DT)(life4_19)).b()), ((double) ((moom.DT)(life4_19)).c()), ((double) (((moom.DT)(life4_19)).a() + 1)), ((double) (((moom.DT)(life4_19)).b() + 1)), ((double) (((moom.DT)(life4_19)).c() + 1))))).b(((double)(((double) this.m))), ((double)(((double) this.m))), ((double)(((double) this.m))))))))).size();
    spill1686_3 = life8_222;
    if (!((life3_5 != null))) {
        lexicalValue1686_200_0 = spill1686_3;
        break lexical_join_200;
    }
    if (!((spill1686_3 >= this.k))) {
        break lexical_join_198;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).b__Void();
    return;
    }
    lexicalValue1686_200_0 = ((moom.DT)(life4_19)).a();
    }
    life9_256 = ((((double) lexicalValue1686_200_0) + ((((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextDouble() - ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextDouble()) * ((double) this.m))) + 0x1.0p-1d);
    life11_268 = ((double) ((((moom.DT)(life4_19)).b() + ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextInt(((int)(3)))) - 1));
    life13_288 = ((((double) ((moom.DT)(life4_19)).c()) + ((((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextDouble() - ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextDouble()) * ((double) this.m))) + 0x1.0p-1d);
    spill1686_4 = life7_168;
    if (!((life3_5 != null))) {
        lexicalValue1686_256_0 = spill1686_4;
        break lexical_join_256;
    }
    if (!((((spill1686_4 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0) != 0))) {
        break lexical_join_258;
    }
    lexicalValue1686_256_0 = life7_168;
    }
    lexicalValue1686_259_0 = ((net.minecraft.entity.EntityLiving)(lexicalValue1686_256_0));
    break lexical_join_259;
    }
    lexicalValue1686_259_0 = null;
    }
    life15_304 = lexicalValue1686_259_0;
    ((net.minecraft.entity.Entity)(life7_168)).c(((double)(life9_256)), ((double)(life11_268)), ((double)(life13_288)), ((float)((((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).u)).nextFloat() * 0x1.68p8f))), ((float)(0x0.0p0f)));
    spill1686_5 = life15_304;
    if (!((life3_5 != null))) {
        lexicalValue1686_302_0 = spill1686_5;
        break lexical_join_302;
    }
    if (!((spill1686_5 != null))) {
        break lexical_join_286;
    }
    spill1686_6 = ((net.minecraft.entity.EntityLiving)(life15_304)).N__Boolean();
    if (!((life3_5 != null))) {
        lexicalValue1686_285_0 = ((spill1686_6) ? 1 : 0);
        break lexical_join_285;
    }
    if (!(spill1686_6)) {
        break lexical_join_309;
    }
    spill1686_7 = life15_304;
    if (!((life3_5 != null))) {
        lexicalValue1686_302_0 = spill1686_7;
        break lexical_join_302;
    }
    lexicalValue1686_285_0 = ((((net.minecraft.entity.EntityLiving)(spill1686_7)).O__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1686_285_0 != 0))) {
        break lexical_join_309;
    }
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a(((net.minecraft.entity.Entity)(life7_168)), ((boolean)(true)));
    ((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).b(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic1686_92(16429, (8514599904301246756L ^ life1_3)))), ((moom.DT)(life4_19)), ((int)(0)));
    lexicalValue1686_302_0 = life15_304;
    }
    if (!((life3_5 != null))) {
        lexicalValue1686_306_0 = lexicalValue1686_302_0;
        break lexical_join_306;
    }
    if (!((lexicalValue1686_302_0 != null))) {
        break lexical_join_307;
    }
    lexicalValue1686_306_0 = life15_304;
    }
    ((net.minecraft.entity.EntityLiving)(lexicalValue1686_306_0)).P();
    }
    life5_156 = 1;
    }
    life6_158 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_130; }
    break lexical_cycle_130;
    }
    }
    if (!((life5_156 != 0))) {
        break lexical_join_316;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).b__Void();
    }
    return;
}


private boolean a__Boolean() {
java.lang.Object local1 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__DT();
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).a__Boolean(((double)((((double) ((moom.DT)(local1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(local1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(local1)).c()) + 0x1.0p-1d))), ((double)(((double) this.l)))))) != 0);
}


public void a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return;
}


private java.lang.String a__String() {
java.lang.String forwardValue5635_28_0;
    moom.D4 forwardValue5635_31_0;
    moom.D4 spill5635_0;
    java.lang.String spill5635_1;
    java.lang.String spill5635_2;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_31: {
    forward_join_29: {
    forward_join_28: {
    forward_join_26: {
    life1_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 24820712157328L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5635_0 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4();
    if (!((life3_5 != null))) {
        forwardValue5635_31_0 = spill5635_0;
        break forward_join_31;
    }
    if (!((spill5635_0 == null))) {
        break forward_join_29;
    }
    spill5635_1 = this.b;
    if (!((life3_5 != null))) {
        forwardValue5635_28_0 = spill5635_1;
        break forward_join_28;
    }
    if (!((spill5635_1 != null))) {
        break forward_join_26;
    }
    spill5635_2 = this.b;
    if (!((life3_5 != null))) {
        forwardValue5635_28_0 = spill5635_2;
        break forward_join_28;
    }
    if (!(((java.lang.String)(spill5635_2)).equals(((java.lang.Object)("Minecart"))))) {
        break forward_join_26;
    }
    this.b = ((java.lang.String)("MinecartRideable"));
    }
    forwardValue5635_28_0 = this.b;
    }
    return forwardValue5635_28_0;
    }
    forwardValue5635_31_0 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__D4();
    }
    return ((moom.D4)(forwardValue5635_31_0)).d;
}


public abstract void a(int p0);

public void a(moom.D4 p0) {
this.d = ((moom.D4)(p0));
    return;
}


private moom.D4 a__D4() {
return this.d;
}


public boolean a__Boolean(int p0) {
int forwardValue5634_24_0;
    int spill5634_0;
    boolean spill5634_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 67993442401730L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5634_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue5634_24_0 = spill5634_0;
        break forward_join_24;
    }
    if (!((spill5634_0 == 1))) {
        break forward_join_23;
    }
    spill5634_1 = ((net.minecraft.world.World)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__Eu())).G;
    if (!((life4_5 != null))) {
        forwardValue5634_24_0 = ((spill5634_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill5634_1)) {
        break forward_join_23;
    }
    this.a = ((int)(this.g));
    return ((1) != 0);
    }
    forwardValue5634_24_0 = 0;
    }
    return ((forwardValue5634_24_0) != 0);
}


public net.minecraft.entity.Entity a(net.minecraft.world.World p0) {
net.minecraft.entity.Entity forwardValue5633_30_0;
    net.minecraft.entity.Entity spill5633_0;
    net.minecraft.entity.Entity spill5633_1;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.entity.Entity life5_18;
    net.minecraft.entity.Entity life5_30;
    forward_join_30: {
    forward_join_28: {
    life2_3 = (net.minecraft.tileentity.MobSpawnerBaseLogic.p ^ 124576247585380L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5633_0 = this.j;
    if (!((life4_5 != null))) {
        forwardValue5633_30_0 = spill5633_0;
        break forward_join_30;
    }
    if (!((spill5633_0 == null))) {
        break forward_join_28;
    }
    life5_18 = net.minecraft.entity.EntityList.a(((java.lang.String)(((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a__String())), ((net.minecraft.world.World)(p0)));
    spill5633_1 = life5_18;
    if (!((life4_5 != null))) {
        forwardValue5633_30_0 = spill5633_1;
        break forward_join_30;
    }
    if (!((spill5633_1 != null))) {
        break forward_join_28;
    }
    life5_30 = ((net.minecraft.tileentity.MobSpawnerBaseLogic)(this)).a(((net.minecraft.entity.Entity)(life5_18)), ((boolean)(false)));
    this.j = ((net.minecraft.entity.Entity)(life5_30));
    }
    forwardValue5633_30_0 = this.j;
    }
    return forwardValue5633_30_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9c347ea5f2d8f74_originalDynamicSite3967_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12229_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1685_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1685_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1685_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1685_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1685_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1685_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2e01ee0908da_invokedynamic1684_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic1686_92(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
