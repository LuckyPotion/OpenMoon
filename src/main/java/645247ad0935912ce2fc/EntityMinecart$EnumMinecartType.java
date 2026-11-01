package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityMinecart$EnumMinecartType extends sourcebuild.EnumConstructor<net.minecraft.entity.item.EntityMinecart$EnumMinecartType> {

public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType RIDEABLE;

public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType CHEST;

public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType FURNACE;

public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType TNT;

public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType SPAWNER;

public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType HOPPER;

public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType COMMAND_BLOCK;

private static java.util.Map<java.lang.Integer, net.minecraft.entity.item.EntityMinecart$EnumMinecartType> a;

private int b;

private java.lang.String c;

private static net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] d;

private static int e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private EntityMinecart$EnumMinecartType(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(-1988374964340709971L)), ((long)(8411185106900504080L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49095361724579L)))));
    long local11_life6 = (net.minecraft.entity.item.EntityMinecart$EnumMinecartType.f ^ 47192368390197L);
    int __sourceSpill1193_8 = 49;
    i = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b(((int)(__sourceSpill1193_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill1193_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1193_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1193_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1193_16 = new byte[8];
    (__sourceSpill1193_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill1193_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation1193_18 = __sourceSpill1193_16;
    ((javax.crypto.Cipher)(__sourceSpill1193_13)).init(((int)(__sourceSpill1193_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1193_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1193_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[3];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "(¾\021ü·T\0315üºd4¾¾\004\t9écI\024u"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill1193_27 = local4_life23;
        int __sourceSpill1193_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1193_27)).substring(((int)(__sourceSpill1193_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1193_32 = local6_life21;
        int __sourceSpill1193_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill1193_35 = new byte[8];
        (__sourceSpill1193_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill1193_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill1193_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill1193_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill1193_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill1193_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill1193_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill1193_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill1193_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill1193_36)).doFinal(((byte[])(__sourceSpill1193_35)));
        (__sourceSpill1193_32)[__sourceSpill1193_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    g = ((long[])(local6_life21));
    h = ((java.lang.Integer[])(new java.lang.Integer[3]));
    RIDEABLE = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(new net.minecraft.entity.item.EntityMinecart$EnumMinecartType("RIDEABLE", 0, 0, "MinecartRideable")));
    CHEST = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(new net.minecraft.entity.item.EntityMinecart$EnumMinecartType("CHEST", 1, 1, "MinecartChest")));
    FURNACE = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(new net.minecraft.entity.item.EntityMinecart$EnumMinecartType("FURNACE", 2, 2, "MinecartFurnace")));
    TNT = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(new net.minecraft.entity.item.EntityMinecart$EnumMinecartType("TNT", 3, 3, "MinecartTNT")));
    SPAWNER = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(new net.minecraft.entity.item.EntityMinecart$EnumMinecartType("SPAWNER", 4, 4, "MinecartSpawner")));
    HOPPER = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(new net.minecraft.entity.item.EntityMinecart$EnumMinecartType("HOPPER", 5, 5, "MinecartHopper")));
    COMMAND_BLOCK = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(new net.minecraft.entity.item.EntityMinecart$EnumMinecartType("COMMAND_BLOCK", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1193_47(24870, (8218187211206019596L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1193_48(24870, (8218187211206019596L ^ local11_life6)), "MinecartCommandBlock")));
    d = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType[])(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.a__ArrayaT()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] local13_life55 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.values();
    int local14_life56 = (local13_life55).length;
    int local15_life57 = 0;
    while ((local15_life57 < local14_life56)) {
        net.minecraft.entity.item.EntityMinecart$EnumMinecartType local16_life58 = (local13_life55)[local15_life57];
        ((java.util.Map)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.a)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(local16_life58)).a()))))), ((java.lang.Object)(local16_life58)));
        local15_life57 += 1;
    }
}


public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] values() {
return ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType[])(((net.minecraft.entity.item.EntityMinecart$EnumMinecartType[])(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.d)).clone()));
}


public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType valueOf(java.lang.String p0) {
return ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.class)), ((java.lang.String)(p0)))));
}


public static void b(int p0) {
e = ((int)(p0));
    return;
}


public static int b() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.e;
}


public static int c() {
int local0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    if ((local0 == 0)) {
        return 84;
    }
    return 0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23732;
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
            throw new RuntimeException("moom/aT", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11375_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
return this.c;
}


public static net.minecraft.entity.item.EntityMinecart$EnumMinecartType a(int p0) {
net.minecraft.entity.item.EntityMinecart$EnumMinecartType forwardValue5098_17_0;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType forwardValue5098_19_0;
    int spill5098_0;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType spill5098_1;
    long life1_3;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType life4_10;
    int life3_11;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart$EnumMinecartType.f ^ 1238618982656L);
    spill5098_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life4_10 = ((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(((java.util.Map)(net.minecraft.entity.item.EntityMinecart$EnumMinecartType.a)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    life3_11 = spill5098_0;
    spill5098_1 = life4_10;
    if (!((life3_11 != 0))) {
        forwardValue5098_17_0 = spill5098_1;
        break forward_join_17;
    }
    if (!((spill5098_1 == null))) {
        break forward_join_18;
    }
    forwardValue5098_17_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.RIDEABLE;
    }
    forwardValue5098_19_0 = forwardValue5098_17_0;
    break forward_join_19;
    }
    forwardValue5098_19_0 = life4_10;
    }
    return forwardValue5098_19_0;
}


private static net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] a__ArrayaT() {
long local0_life1 = (net.minecraft.entity.item.EntityMinecart$EnumMinecartType.f ^ 56925203907344L);
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] __sourceSharedArray1111_4 = new net.minecraft.entity.item.EntityMinecart$EnumMinecartType[__sourceIntrinsic_507ec58c11e6_originalDynamicSite1111_2(22410, (1872644830627700612L ^ local0_life1))];
    __sourceSharedArray1111_4[0] = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.RIDEABLE;
    __sourceSharedArray1111_4[1] = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.CHEST;
    __sourceSharedArray1111_4[2] = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.FURNACE;
    __sourceSharedArray1111_4[3] = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.TNT;
    __sourceSharedArray1111_4[4] = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.SPAWNER;
    __sourceSharedArray1111_4[5] = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.HOPPER;
    __sourceSharedArray1111_4[__sourceIntrinsic_507ec58c11e6_originalDynamicSite1111_10(6574, (1313462757143302563L ^ local0_life1))] = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.COMMAND_BLOCK;
    return __sourceSharedArray1111_4;
}


public int a() {
return this.b;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1193_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1193_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11375_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_507ec58c11e6_originalDynamicSite1111_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_507ec58c11e6_originalDynamicSite1111_10(int a0, long a1) throws E;
}
