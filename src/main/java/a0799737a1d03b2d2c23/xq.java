package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xq extends moom.xp {

private static final long w;

private static final long[] x;

private static final java.lang.Integer[] A;

private static final java.util.Map H;

public xq(int p0, float p1, boolean p2) {
super(p0, p1, p2);
    (this).a(true);
}


static {
w = ((long)(((moom._a)(moom._c.a(((long)(-6658356791167415889L)), ((long)(-6096600334173413643L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114482115962795L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xq.w ^ 77204396009031L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1695_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1695_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1695_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1695_14 = new byte[8];
    (__sourceSpill1695_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1695_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1695_16 = __sourceSpill1695_14;
    ((javax.crypto.Cipher)(__sourceSpill1695_11)).init(((int)(__sourceSpill1695_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1695_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1695_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\020öeÜ+»\0134]wééý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1695_25 = local6_life21;
        int __sourceSpill1695_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1695_25)).substring(((int)(__sourceSpill1695_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1695_30 = local8_life19;
        int __sourceSpill1695_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1695_33 = new byte[8];
        (__sourceSpill1695_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1695_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1695_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1695_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1695_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1695_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1695_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1695_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1695_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1695_34)).doFinal(((byte[])(__sourceSpill1695_33)));
        (__sourceSpill1695_30)[__sourceSpill1695_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = " ø3îü¼Ûs/\0071èYë"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1695_38 = local6_life21;
        int __sourceSpill1695_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1695_38)).substring(((int)(__sourceSpill1695_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1695_43 = local8_life19;
        int __sourceSpill1695_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1695_46 = new byte[8];
        (__sourceSpill1695_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1695_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1695_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1695_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1695_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1695_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1695_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1695_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1695_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1695_47)).doFinal(((byte[])(__sourceSpill1695_46)));
        (__sourceSpill1695_43)[__sourceSpill1695_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    x = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue4535_12_0;
    int forwardValue4535_14_0;
    int spill4535_0;
    long life2_3;
    int life4_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.xq.w ^ 81802382256864L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4535_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    if (!((life4_5 != 0))) {
        forwardValue4535_12_0 = spill4535_0;
        break forward_join_12;
    }
    if (!((spill4535_0 > 0))) {
        break forward_join_13;
    }
    forwardValue4535_12_0 = 1;
    }
    forwardValue4535_14_0 = forwardValue4535_12_0;
    break forward_join_14;
    }
    forwardValue4535_14_0 = 0;
    }
    return ((forwardValue4535_14_0) != 0);
}


protected void b__Void(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4536_26_0;
    int forwardValue4536_31_0;
    boolean spill4536_0;
    long life4_3;
    int life6_5;
    forward_join_78: {
    forward_join_73: {
    forward_join_31: {
    forward_join_26: {
    forward_join_24: {
    life4_3 = (moom.xq.w ^ 110595205959275L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4536_0 = ((net.minecraft.world.World)(p1)).G;
    if (!((life6_5 != 0))) {
        forwardValue4536_26_0 = ((spill4536_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill4536_0))) {
        break forward_join_24;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.y)).I, __sourceIntrinsic_07c62d08f495_invokedynamic4536_7(22687, (4254425175849056815L ^ life4_3)), 0))));
    }
    forwardValue4536_26_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    }
    if (!((life6_5 != 0))) {
        forwardValue4536_31_0 = forwardValue4536_26_0;
        break forward_join_31;
    }
    if (!((forwardValue4536_26_0 > 0))) {
        break forward_join_73;
    }
    forwardValue4536_31_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((forwardValue4536_31_0 == 0))) {
        break forward_join_78;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).I, __sourceIntrinsic_07c62d08f495_invokedynamic4536_14(22769, (7120845832055536195L ^ life4_3)), 4))));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n)).I, __sourceIntrinsic_07c62d08f495_invokedynamic4536_18(30967, (347650051093043780L ^ life4_3)), 0))));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.o)).I, __sourceIntrinsic_07c62d08f495_invokedynamic4536_22(6717, (7545978118590724236L ^ life4_3)), 0))));
    if (!((life6_5 == 0))) {
        break forward_join_78;
    }
    }
    super.b__Void(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12596;
      if (A[var3] == null) {
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
         long var5 = x[var3];
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
         Object[] var9 = (Object[])H.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               H.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xq.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9757_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 0))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 1))));
    return;
}


public net.minecraft.item.EnumRarity a__a3(net.minecraft.item.ItemStack p0) {
long local2 = (moom.xq.w ^ 127654769850691L);
    return ((((net.minecraft.item.ItemStack)(p0)).c() == 0) ? net.minecraft.item.EnumRarity.RARE : net.minecraft.item.EnumRarity.EPIC);
}


private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic4536_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic4536_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic4536_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07c62d08f495_invokedynamic4536_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9757_0() throws E;
}
