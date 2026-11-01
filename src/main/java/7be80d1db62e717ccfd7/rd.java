package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class rd implements moom.rx {

private static java.lang.String b;

private static final long e;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public rd() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2942877568215047008L)), ((long)(8840029184418868105L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80914440202560L)))));
    java.lang.String __sourceSpill997_6 = "EoU1qb";
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (moom.rd.e ^ 131710970696351L);
    moom.rd.b(((java.lang.String)(__sourceSpill997_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill997_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill997_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill997_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill997_16 = new byte[8];
    (__sourceSpill997_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill997_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation997_18 = __sourceSpill997_16;
    ((javax.crypto.Cipher)(__sourceSpill997_13)).init(((int)(__sourceSpill997_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill997_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation997_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[3];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "$g\b9jÒXèûó¸Þ{ÝÒYÇv¥ª®\006D"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill997_27 = local6_life23;
        int __sourceSpill997_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill997_27)).substring(((int)(__sourceSpill997_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill997_32 = local8_life21;
        int __sourceSpill997_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill997_35 = new byte[8];
        (__sourceSpill997_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill997_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill997_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill997_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill997_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill997_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill997_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill997_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill997_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill997_36)).doFinal(((byte[])(__sourceSpill997_35)));
        (__sourceSpill997_32)[__sourceSpill997_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    g = ((long[])(local8_life21));
    h = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public static void b(java.lang.String p0) {
moom.rd.b = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return moom.rd.b;
}


protected net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
long local3 = (moom.rd.e ^ 87666374134649L);
    moom.bs local5 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    moom.rB local6 = __sourceExactCall_e9ee1d28afa18d(((moom.ry)(p0)));
    net.minecraft.item.ItemStack local7 = ((net.minecraft.item.ItemStack)(p1)).a(((int)(1)));
    moom.rd.a(((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())), ((net.minecraft.item.ItemStack)(local7)), ((int)(__sourceIntrinsic_defb6adcd4c8_originalDynamicSite1625_6(17359, (7739364137123863444L ^ local3)))), ((moom.bs)(local5)), ((moom.rB)(local6)));
    return p1;
}


public final net.minecraft.item.ItemStack a(moom.ry p0, net.minecraft.item.ItemStack p1) {
java.lang.Object local3 = this.b(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    ((moom.rd)(this)).a(((moom.ry)(p0)));
    ((moom.rd)(this)).a(((moom.ry)(p0)), ((moom.bs)(__sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int()))))));
    return ((net.minecraft.item.ItemStack)(local3));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28943;
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
            throw new RuntimeException("moom/rd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_059747998934f5(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8956_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(moom.ry p0) {
long local2 = (moom.rd.e ^ 74920421875815L);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_278d39e339b3_originalDynamicSite1626_2(10435, (8006392934226992005L ^ local2)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    return;
}


protected void a(moom.ry p0, moom.bs p1) {
long local3 = (moom.rd.e ^ 58489849633821L);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(__sourceIntrinsic_b5898c6c2c14_originalDynamicSite1627_2(22024, (9125610583138982198L ^ local3)))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(((moom.rd)(this)).a(((moom.bs)(p1))))));
    return;
}


private int a(moom.bs p0) {
return ((((moom.bs)(p0)).c() + 1) + ((((moom.bs)(p0)).e() + 1) * 3));
}


public static void a(net.minecraft.world.World p0, net.minecraft.item.ItemStack p1, int p2, moom.bs p3, moom.rB p4) {
long life5_3;
    double life8_7;
    double life10_10;
    java.lang.String life7_11;
    double life12_14;
    net.minecraft.entity.item.EntityItem life14_48;
    double life15_56;
    forward_join_34: {
    forward_join_30: {
    forward_join_25: {
    life5_3 = (moom.rd.e ^ 30337411614503L);
    java.lang.String spill3925_0 = moom.rd.b();
    life8_7 = ((moom.rB)(p4)).a();
    life10_10 = ((moom.rB)(p4)).b();
    life7_11 = spill3925_0;
    life12_14 = ((moom.rB)(p4)).c();
    if (!((life7_11 != null))) { break forward_join_25; }
    if (!((((moom.bs)(p3)).a__bt() == net.minecraft.util.EnumFacing$Axis.Y))) { break forward_join_30; }
    life10_10 = (life10_10 - 0x1.0p-3d);
    }
    if (!((life7_11 == null))) { break forward_join_34; }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[2])));
    }
    life10_10 = (life10_10 - 0x1.4p-3d);
    }
    life14_48 = new net.minecraft.entity.item.EntityItem(p0, life8_7, life10_10, life12_14, p1);
    life15_56 = ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble() * 0x1.999999999999ap-4d) + 0x1.999999999999ap-3d);
    ((net.minecraft.entity.item.EntityItem)(life14_48)).t = ((double)((((double) ((moom.bs)(p3)).c()) * life15_56)));
    ((net.minecraft.entity.item.EntityItem)(life14_48)).u = ((double)(0x1.99999ap-3d));
    ((net.minecraft.entity.item.EntityItem)(life14_48)).v = ((double)((((double) ((moom.bs)(p3)).e()) * life15_56)));
    net.minecraft.entity.item.EntityItem __stackOp3925_15_0 = life14_48;
    ((net.minecraft.entity.item.EntityItem)(__stackOp3925_15_0)).t = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp3925_15_0)).t + ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextGaussian() * 0x1.eb851ep-8d) * ((double) p2)))));
    net.minecraft.entity.item.EntityItem __stackOp3925_20_0 = life14_48;
    ((net.minecraft.entity.item.EntityItem)(__stackOp3925_20_0)).u = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp3925_20_0)).u + ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextGaussian() * 0x1.eb851ep-8d) * ((double) p2)))));
    net.minecraft.entity.item.EntityItem __stackOp3925_25_0 = life14_48;
    ((net.minecraft.entity.item.EntityItem)(__stackOp3925_25_0)).v = ((double)((((net.minecraft.entity.item.EntityItem)(__stackOp3925_25_0)).v + ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextGaussian() * 0x1.eb851ep-8d) * ((double) p2)))));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life14_48)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_defb6adcd4c8_originalDynamicSite1625_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8956_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_278d39e339b3_originalDynamicSite1626_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b5898c6c2c14_originalDynamicSite1627_2(int a0, long a1) throws E;

private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
private static native moom.rB __sourceExactCall_e9ee1d28afa18d(moom.ry p0);
private static native int __sourceExactCall_059747998934f5(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
