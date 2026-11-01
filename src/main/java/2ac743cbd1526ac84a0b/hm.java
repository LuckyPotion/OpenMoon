package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hm extends moom.hg {

private static final moom.DD Z;

private final net.minecraft.entity.player.InventoryPlayer aa;

public net.minecraft.inventory.IInventory ab;

private static final long cb;

private static final long[] fb;

private static final java.lang.Integer[] pb;

private static final java.util.Map qb;

public hm(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.inventory.IInventory p1) {
super(new moom.wb(p0, p1));
    this.aa = p0;
    this.ab = p1;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-3773113522577813146L)), ((long)(2698678900841634212L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(184110876105646L)))));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hm.cb ^ 113142261445210L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1262_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1262_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1262_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1262_14 = new byte[8];
    (__sourceSpill1262_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1262_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1262_16 = __sourceSpill1262_14;
    ((javax.crypto.Cipher)(__sourceSpill1262_11)).init(((int)(__sourceSpill1262_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1262_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1262_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[19];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ï\025\022#ßkqá_\004Ü\027«Ëcü?O¾.xZ=[v·ÁB¹ªÜ@ZS±ºÒ&\007G|\020ÙÄ eBÕ|ygÌ|\033\007cY¢¥\031°ãàNÜ\bþ1:p¯\021aekd\022WLw¼ï _\022\006°\022\177¾\f\023¶ÎdQ\026¥\024<ËY0Û$¶Ãã\037¥fáncïaþ|r"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1262_25 = local6_life21;
        int __sourceSpill1262_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1262_25)).substring(((int)(__sourceSpill1262_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1262_30 = local8_life19;
        int __sourceSpill1262_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1262_33 = new byte[8];
        (__sourceSpill1262_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1262_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1262_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1262_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1262_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1262_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1262_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1262_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1262_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1262_34)).doFinal(((byte[])(__sourceSpill1262_33)));
        (__sourceSpill1262_30)[__sourceSpill1262_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "(îÕG»ÀÚ\013|ÁVd\032¢ÿ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1262_38 = local6_life21;
        int __sourceSpill1262_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1262_38)).substring(((int)(__sourceSpill1262_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1262_43 = local8_life19;
        int __sourceSpill1262_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1262_46 = new byte[8];
        (__sourceSpill1262_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1262_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1262_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1262_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1262_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1262_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1262_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1262_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1262_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1262_47)).doFinal(((byte[])(__sourceSpill1262_46)));
        (__sourceSpill1262_43)[__sourceSpill1262_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    fb = ((long[])(local8_life19));
    pb = ((java.lang.Integer[])(new java.lang.Integer[19]));
    Z = ((moom.DD)(new moom.DD("textures/gui/container/brewing_stand.png")));
}


protected void b(int p0, int p1) {
long local3 = (moom.hm.cb ^ 41381781908689L);
    java.lang.String local5 = ((net.minecraft.util.IChatComponent)(((net.minecraft.inventory.IInventory)(this.ab)).a__C5())).b();
    ((net.minecraft.client.gui.FontRenderer)(((moom.hm)(this)).p)).b(((java.lang.String)(local5)), ((float)(((float) ((((moom.hm)(this)).x / 2) - (((net.minecraft.client.gui.FontRenderer)(((moom.hm)(this)).p)).a(((java.lang.String)(local5))) / 2))))), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1492_8(32072, (4690304887111048519L ^ local3)))));
    ((net.minecraft.client.gui.FontRenderer)(((moom.hm)(this)).p)).b(((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.entity.player.InventoryPlayer)(this.aa)).a__C5())).b())), ((float)(0x1.0p3f)), ((float)(((float) ((((moom.hm)(this)).y - __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1492_15(25657, (1403082575990768692L ^ local3))) + 2)))), ((int)(__sourceIntrinsic_45fde0f4e55e_originalDynamicSite1492_16(5693, (1631619748370789925L ^ local3)))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12743;
      if (pb[var3] == null) {
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
         long var5 = fb[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hm.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7921_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(float p0, int p1, int p2) {
long life4_3;
    int life6_21;
    int life7_29;
    int life8_44;
    int life9_56;
    int life10_97;
    forest_join_187: {
    forest_join_143: {
    forest_join_141: {
    forest_join_134: {
    forest_join_127: {
    forest_join_120: {
    forest_join_113: {
    forest_join_106: {
    forest_join_99: {
    forest_join_87: {
    life4_3 = (moom.hm.cb ^ 106150972850288L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(((moom.hm)(this)).i)).a__ok())).a__Void(((moom.DD)(moom.hm.Z)));
    life6_21 = ((((moom.hm)(this)).k - ((moom.hm)(this)).x) / 2);
    life7_29 = ((((moom.hm)(this)).l - ((moom.hm)(this)).y) / 2);
    __sourceExactCall_fc432f7d60a56f(((moom.hm)(this)), ((int)(life6_21)), ((int)(life7_29)), ((int)(0)), ((int)(0)), ((int)(((moom.hm)(this)).x)), ((int)(((moom.hm)(this)).y)));
    life8_44 = __sourceExactCall_cdf7df5ac5b665(((net.minecraft.inventory.IInventory)(this.ab)), ((int)(0)));
    if (!((life8_44 > 0))) {
        break forest_join_187;
    }
    life9_56 = ((int) (0x1.cp4f * (0x1.0p0f - (((float) life8_44) / 0x1.9p8f))));
    if (!((life9_56 > 0))) {
        break forest_join_87;
    }
    ((moom.hm)(this)).b(((int)((life6_21 + __sourceIntrinsic_3f29d380c6dd_invokedynamic859_15(9173, (5727307652671844192L ^ life4_3))))), ((int)((life7_29 + __sourceIntrinsic_3f29d380c6dd_invokedynamic859_16(27969, (2720299753053708786L ^ life4_3))))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic859_17(28823, (7638147480130255912L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic859_18(25575, (4813702252718124880L ^ life4_3)))), ((int)(life9_56)));
    }
    life10_97 = ((life8_44 / 2) % __sourceIntrinsic_3f29d380c6dd_invokedynamic859_20(25366, (8284831059398029228L ^ life4_3)));
    switch (life10_97) {
case 0:
{
        break forest_join_99;
    }
case 1:
{
        break forest_join_106;
    }
case 2:
{
        break forest_join_113;
    }
case 3:
{
        break forest_join_120;
    }
case 4:
{
        break forest_join_127;
    }
case 5:
{
        break forest_join_134;
    }
case 6:
{
        break forest_join_141;
    }
default:
{
        break forest_join_143;
    }
}
    }
    life9_56 = __sourceIntrinsic_3f29d380c6dd_invokedynamic859_21(5129, (4600981214514288831L ^ life4_3));
    break forest_join_143;
    }
    life9_56 = __sourceIntrinsic_3f29d380c6dd_invokedynamic859_22(9650, (4511172798381271310L ^ life4_3));
    break forest_join_143;
    }
    life9_56 = __sourceIntrinsic_3f29d380c6dd_invokedynamic859_23(24935, (7383700127587266006L ^ life4_3));
    break forest_join_143;
    }
    life9_56 = __sourceIntrinsic_3f29d380c6dd_invokedynamic859_24(13010, (2225133589167390313L ^ life4_3));
    break forest_join_143;
    }
    life9_56 = __sourceIntrinsic_3f29d380c6dd_invokedynamic859_25(7541, (2495710964993069528L ^ life4_3));
    break forest_join_143;
    }
    life9_56 = __sourceIntrinsic_3f29d380c6dd_invokedynamic859_26(20047, (7526925919017091835L ^ life4_3));
    break forest_join_143;
    }
    life9_56 = 0;
    }
    if (!((life9_56 > 0))) {
        break forest_join_187;
    }
    ((moom.hm)(this)).b(((int)((life6_21 + __sourceIntrinsic_3f29d380c6dd_invokedynamic859_27(28952, (7414045023551946154L ^ life4_3))))), ((int)((((life7_29 + __sourceIntrinsic_3f29d380c6dd_invokedynamic859_28(1122, (6499016491867375836L ^ life4_3))) + __sourceIntrinsic_3f29d380c6dd_invokedynamic859_29(17552, (2868085072699279392L ^ life4_3))) - life9_56))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic859_30(13266, (6386313589503803247L ^ life4_3)))), ((int)((__sourceIntrinsic_3f29d380c6dd_invokedynamic859_31(17552, (2868085072699279392L ^ life4_3)) - life9_56))), ((int)(__sourceIntrinsic_3f29d380c6dd_invokedynamic859_32(23423, (7141157059620493255L ^ life4_3)))), ((int)(life9_56)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3f29d380c6dd_invokedynamic859_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1492_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1492_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_45fde0f4e55e_originalDynamicSite1492_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7921_0() throws E;

private static native int __sourceExactCall_cdf7df5ac5b665(net.minecraft.inventory.IInventory p0, int p1);

private static native void __sourceExactCall_fc432f7d60a56f(moom.hm p0, int p1, int p2, int p3, int p4, int p5, int p6);
}
