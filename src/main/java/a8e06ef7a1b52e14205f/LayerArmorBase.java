package net.minecraft.client.renderer.entity.layers;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class LayerArmorBase<T extends moom.iQ> implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.EntityLivingBase> {

protected static final moom.DD a;

protected T b;

protected T c;

private final moom.mS<?> d;

private final float e;

private final float f;

private final float g;

private final float h;

private boolean i;

private static final java.util.Map<java.lang.String, moom.DD> j;

private com.moon.module.impl.Glint k;

private static net.minecraft.entity.Entity[] l;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public LayerArmorBase(moom.mS<?> p0) {
super();
    this.e = 0x1.0000000000000p+0f;
    this.f = 0x1.0000000000000p+0f;
    this.g = 0x1.0000000000000p+0f;
    this.h = 0x1.0000000000000p+0f;
    this.d = p0;
    (this).a();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(5273471846198618253L)), ((long)(2690465211623955837L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(7699583060713L)))));
    java.lang.Object __sourceSpill1820_6 = null;
    q = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.client.renderer.entity.layers.LayerArmorBase.b(((net.minecraft.entity.Entity[])(__sourceSpill1820_6)));
    long local0_life9 = (net.minecraft.client.renderer.entity.layers.LayerArmorBase.n ^ 133485753623418L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1820_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1820_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1820_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1820_16 = new byte[8];
    (__sourceSpill1820_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1820_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1820_18 = __sourceSpill1820_16;
    ((javax.crypto.Cipher)(__sourceSpill1820_13)).init(((int)(__sourceSpill1820_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1820_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1820_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[14];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "äÿÐZì°jRÌ`0[uà[m­½'Æ¤q\002íê\\CQÂÜÅë\013i\022#\020q\031ÉL8üZ0õ\016ëÀñe¹¸\006­ÜÁàyF!ºëqoj\007%¿7²Ï\034x\027§å2Ú(øH,"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1820_27 = local6_life23;
        int __sourceSpill1820_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1820_27)).substring(((int)(__sourceSpill1820_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1820_32 = local8_life21;
        int __sourceSpill1820_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1820_35 = new byte[8];
        (__sourceSpill1820_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1820_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1820_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1820_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1820_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1820_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1820_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1820_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1820_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1820_36)).doFinal(((byte[])(__sourceSpill1820_35)));
        (__sourceSpill1820_32)[__sourceSpill1820_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "~\f-ÙÈ=Þt£ªßðp\023 "))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1820_40 = local6_life23;
        int __sourceSpill1820_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1820_40)).substring(((int)(__sourceSpill1820_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1820_45 = local8_life21;
        int __sourceSpill1820_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1820_48 = new byte[8];
        (__sourceSpill1820_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1820_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1820_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1820_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1820_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1820_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1820_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1820_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1820_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1820_49)).doFinal(((byte[])(__sourceSpill1820_48)));
        (__sourceSpill1820_45)[__sourceSpill1820_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    o = ((long[])(local8_life21));
    p = ((java.lang.Integer[])(new java.lang.Integer[14]));
    a = ((moom.DD)(new moom.DD("textures/misc/enchanted_item_glint.png")));
    j = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
}


public static net.minecraft.entity.Entity[] b() {
return net.minecraft.client.renderer.entity.layers.LayerArmorBase.l;
}


public static void b(net.minecraft.entity.Entity[] p0) {
net.minecraft.client.renderer.entity.layers.LayerArmorBase.l = ((net.minecraft.entity.Entity[])(p0));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10800_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ny"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.DD a(net.minecraft.entity.Entity p0, net.minecraft.item.ItemStack p1, int p2, java.lang.String p3) {
java.lang.String forwardValue4834_55_0;
    java.lang.Object[] forwardValue4834_55_1;
    java.lang.Object[] forwardValue4834_55_2;
    int forwardValue4834_55_3;
    java.lang.String forwardValue4834_56_0;
    java.lang.Object[] forwardValue4834_56_1;
    java.lang.Object[] forwardValue4834_56_2;
    int forwardValue4834_56_3;
    int forwardValue4834_56_4;
    java.lang.String forwardValue4834_64_0;
    java.lang.Object[] forwardValue4834_64_1;
    java.lang.Object[] forwardValue4834_64_2;
    int forwardValue4834_64_3;
    java.lang.String forwardValue4834_72_0;
    java.lang.Object[] forwardValue4834_72_1;
    java.lang.Object[] forwardValue4834_72_2;
    int forwardValue4834_72_3;
    java.lang.String forwardValue4834_72_4;
    java.lang.String spill4834_0;
    java.lang.Object[] spill4834_1;
    java.lang.Object[] spill4834_2;
    java.lang.Object[] spill4834_3;
    java.lang.Object[] spill4834_4;
    int spill4834_5;
    java.lang.Object[] spill4834_6;
    java.lang.Object[] spill4834_7;
    int spill4834_8;
    java.lang.String spill4834_9;
    java.lang.Object[] spill4834_10;
    long life5_3;
    net.minecraft.item.ItemArmor life7_7;
    java.lang.String life8_11;
    java.lang.String life9_13;
    int life10_21;
    java.lang.String life11_78;
    moom.DD life12_83;
    forward_join_92: {
    forward_join_72: {
    forward_join_64: {
    forward_join_56: {
    forward_join_55: {
    forward_join_36: {
    life5_3 = (net.minecraft.client.renderer.entity.layers.LayerArmorBase.n ^ 67391908560631L);
    life7_7 = ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(p1)).a__wQ()));
    life8_11 = ((net.minecraft.item.ItemArmor$ArmorMaterial)(((net.minecraft.item.ItemArmor)(life7_7)).a__sourceReturn_2ce8a48aa6())).a__String();
    life9_13 = "minecraft";
    life10_21 = ((java.lang.String)(life8_11)).indexOf(((int)(__sourceIntrinsic_f2c07d5914c6_invokedynamic4834_5(28216, (5049816537418415378L ^ life5_3)))));
    if (!((life10_21 != -1))) {
        break forward_join_36;
    }
    life9_13 = ((java.lang.String)(life8_11)).substring(((int)(0)), ((int)(life10_21)));
    life8_11 = ((java.lang.String)(life8_11)).substring(((int)((life10_21 + 1))));
    }
    spill4834_0 = "%s:textures/models/armor/%s_layer_%d%s.png";
    java.lang.Object[] __stackOp4834_9_0 = new java.lang.Object[4];
    spill4834_1 = __stackOp4834_9_0;
    (__stackOp4834_9_0)[0] = life9_13;
    java.lang.Object[] __stackOp4834_10_0 = spill4834_1;
    spill4834_2 = __stackOp4834_10_0;
    (__stackOp4834_10_0)[1] = life8_11;
    java.lang.Object[] __stackOp4834_11_0 = spill4834_2;
    spill4834_3 = __stackOp4834_11_0;
    spill4834_4 = __stackOp4834_11_0;
    spill4834_5 = 2;
    if (!(((net.minecraft.client.renderer.entity.layers.LayerArmorBase)(this)).a__Boolean(((int)(p2))))) {
        forwardValue4834_55_0 = spill4834_0;
        forwardValue4834_55_1 = spill4834_3;
        forwardValue4834_55_2 = spill4834_4;
        forwardValue4834_55_3 = spill4834_5;
        break forward_join_55;
    }
    forwardValue4834_56_0 = spill4834_0;
    forwardValue4834_56_1 = spill4834_3;
    forwardValue4834_56_2 = spill4834_4;
    forwardValue4834_56_3 = spill4834_5;
    forwardValue4834_56_4 = 2;
    break forward_join_56;
    }
    forwardValue4834_56_0 = forwardValue4834_55_0;
    forwardValue4834_56_1 = forwardValue4834_55_1;
    forwardValue4834_56_2 = forwardValue4834_55_2;
    forwardValue4834_56_3 = forwardValue4834_55_3;
    forwardValue4834_56_4 = 1;
    }
    (forwardValue4834_56_2)[forwardValue4834_56_3] = java.lang.Integer.valueOf(((int)(forwardValue4834_56_4)));
    java.lang.Object[] __stackOp4834_14_0 = forwardValue4834_56_1;
    spill4834_6 = __stackOp4834_14_0;
    spill4834_7 = __stackOp4834_14_0;
    spill4834_8 = 3;
    if (!((p3 == null))) {
        forwardValue4834_64_0 = forwardValue4834_56_0;
        forwardValue4834_64_1 = spill4834_6;
        forwardValue4834_64_2 = spill4834_7;
        forwardValue4834_64_3 = spill4834_8;
        break forward_join_64;
    }
    forwardValue4834_72_0 = forwardValue4834_56_0;
    forwardValue4834_72_1 = spill4834_6;
    forwardValue4834_72_2 = spill4834_7;
    forwardValue4834_72_3 = spill4834_8;
    forwardValue4834_72_4 = "";
    break forward_join_72;
    }
    spill4834_9 = "_%s";
    java.lang.Object[] __stackOp4834_15_0 = new java.lang.Object[1];
    spill4834_10 = __stackOp4834_15_0;
    (__stackOp4834_15_0)[0] = p3;
    forwardValue4834_72_0 = forwardValue4834_64_0;
    forwardValue4834_72_1 = forwardValue4834_64_1;
    forwardValue4834_72_2 = forwardValue4834_64_2;
    forwardValue4834_72_3 = forwardValue4834_64_3;
    forwardValue4834_72_4 = java.lang.String.format(((java.lang.String)(spill4834_9)), ((java.lang.Object[])(spill4834_10)));
    }
    (forwardValue4834_72_2)[forwardValue4834_72_3] = forwardValue4834_72_4;
    life11_78 = java.lang.String.format(((java.lang.String)(forwardValue4834_72_0)), ((java.lang.Object[])(forwardValue4834_72_1)));
    life12_83 = ((moom.DD)(((java.util.Map)(net.minecraft.client.renderer.entity.layers.LayerArmorBase.j)).get(((java.lang.Object)(life11_78)))));
    if (!((life12_83 == null))) {
        break forward_join_92;
    }
    life12_83 = new moom.DD(life11_78);
    ((java.util.Map)(net.minecraft.client.renderer.entity.layers.LayerArmorBase.j)).put(((java.lang.Object)(life11_78)), ((java.lang.Object)(life12_83)));
    }
    return life12_83;
}


protected T a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.item.ItemStack p1, int p2, T p3) {
return p3;
}


protected abstract void a(T p0, int p1);

private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_4070366fe7ea11(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8942;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ny", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public T a(int p0) {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.renderer.entity.layers.LayerArmorBase)(this)).a__Boolean(((int)(p0)))) != 0) ? this.b : this.c);
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.EntityLivingBase p0, int p1) {
return ((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_7f6f0b7f03(((int)((p1 - 1))));
}


private void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8) {
net.minecraft.item.ItemStack forwardValue493_50_0;
    net.minecraft.item.ItemStack forwardValue493_51_0;
    int forwardValue493_51_1;
    net.minecraft.item.ItemStack forwardValue493_155_0;
    net.minecraft.item.ItemStack forwardValue493_156_0;
    int forwardValue493_156_1;
    net.minecraft.item.ItemStack spill493_0;
    float spill493_1;
    float spill493_2;
    float spill493_3;
    net.minecraft.item.ItemStack spill493_4;
    float spill493_5;
    float spill493_6;
    float spill493_7;
    long life10_3;
    net.minecraft.item.ItemStack life12_8;
    net.minecraft.item.Item life14_13;
    net.minecraft.item.ItemArmor life13_19;
    moom.iQ life14_23;
    int life15_42;
    int life16_78;
    float life17_95;
    float life18_112;
    float life19_123;
    forward_join_224: {
    forward_join_213: {
    forward_join_193: {
    forward_join_167: {
    forward_join_159: {
    forward_join_156: {
    forward_join_155: {
    forward_join_67: {
    forward_join_61: {
    forward_join_54: {
    forward_join_51: {
    forward_join_50: {
    life10_3 = (net.minecraft.client.renderer.entity.layers.LayerArmorBase.n ^ 109168266972335L);
    life12_8 = __sourceExactCall_d3dca5225f76b8(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((int)(p8)));
    if (!((life12_8 != null))) {
        break forward_join_224;
    }
    life14_13 = ((net.minecraft.item.ItemStack)(life12_8)).a__wQ();
    if (!((((life14_13 instanceof net.minecraft.item.ItemArmor) ? 1 : 0) != 0))) {
        break forward_join_224;
    }
    life13_19 = ((net.minecraft.item.ItemArmor)(life14_13));
    life14_23 = __sourceExactCall_919df85eaf484c(this, ((int)(p8)));
    __sourceExactCall_bda1d346b55160(((moom.iQ)(life14_23)), ((moom.iQ)(((moom.mS)(this.d)).a__iQ())));
    __sourceExactCall_075207f4b71439(((moom.iQ)(life14_23)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    __sourceExactCall_8468acab987f9d(this, ((moom.iQ)(life14_23)), ((int)(p8)));
    life15_42 = ((__sourceExactCall_35f5b9f2a6d35e(((net.minecraft.client.renderer.entity.layers.LayerArmorBase)(this)), ((int)(p8)))) ? 1 : 0);
    if (!(moom.BU.av())) {
        break forward_join_54;
    }
    spill493_0 = life12_8;
    if (!((life15_42 != 0))) {
        forwardValue493_50_0 = spill493_0;
        break forward_join_50;
    }
    forwardValue493_51_0 = spill493_0;
    forwardValue493_51_1 = 2;
    break forward_join_51;
    }
    forwardValue493_51_0 = forwardValue493_50_0;
    forwardValue493_51_1 = 1;
    }
    if (!((!moom.Jw.a__Boolean(((net.minecraft.item.ItemStack)(forwardValue493_51_0)), ((int)(forwardValue493_51_1)), ((java.lang.String)(null)))))) {
        break forward_join_61;
    }
    }
    ((moom.mS)(this.d)).b(((moom.DD)(this.a(((net.minecraft.item.ItemArmor)(life13_19)), ((boolean)__sourceIntrinsic_integerToBoolean((life15_42)))))));
    }
    switch ((moom.nG.a)[((net.minecraft.item.ItemArmor$ArmorMaterial)(((net.minecraft.item.ItemArmor)(life13_19)).a__sourceReturn_2ce8a48aa6())).ordinal()]) {
case 1:
{
        break forward_join_67;
    }
case 2:
case 3:
case 4:
case 5:
{
        break forward_join_167;
    }
default:
{
        break forward_join_193;
    }
}
    }
    life16_78 = ((net.minecraft.item.ItemArmor)(life13_19)).b(((net.minecraft.item.ItemStack)(life12_8)));
    life17_95 = (((float) ((life16_78 >> __sourceIntrinsic_857796e4df47_invokedynamic493_22(29108, (8498065500409237700L ^ life10_3))) & __sourceIntrinsic_857796e4df47_invokedynamic493_23(17446, (264121606662399325L ^ life10_3)))) / 0x1.fep7f);
    life18_112 = (((float) ((life16_78 >> __sourceIntrinsic_857796e4df47_invokedynamic493_24(26913, (2584752799174821970L ^ life10_3))) & __sourceIntrinsic_857796e4df47_invokedynamic493_25(18316, (4546207767944799985L ^ life10_3)))) / 0x1.fep7f);
    life19_123 = (((float) (life16_78 & __sourceIntrinsic_857796e4df47_invokedynamic493_26(18316, (4546207767944799985L ^ life10_3)))) / 0x1.fep7f);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    spill493_1 = (0x1.0p0f * life17_95);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    spill493_2 = (0x1.0p0f * life18_112);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    spill493_3 = (0x1.0p0f * life19_123);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    moom.kZ.c(((float)(spill493_1)), ((float)(spill493_2)), ((float)(spill493_3)), ((float)(0x1.0p0f)));
    __sourceExactCall_f8da34d2aa6235(((moom.iQ)(life14_23)), ((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    if (!(moom.BU.av())) {
        break forward_join_159;
    }
    spill493_4 = life12_8;
    if (!((life15_42 != 0))) {
        forwardValue493_155_0 = spill493_4;
        break forward_join_155;
    }
    forwardValue493_156_0 = spill493_4;
    forwardValue493_156_1 = 2;
    break forward_join_156;
    }
    forwardValue493_156_0 = forwardValue493_155_0;
    forwardValue493_156_1 = 1;
    }
    if (!((!moom.Jw.a__Boolean(((net.minecraft.item.ItemStack)(forwardValue493_156_0)), ((int)(forwardValue493_156_1)), ((java.lang.String)("overlay")))))) {
        break forward_join_167;
    }
    }
    ((moom.mS)(this.d)).b(((moom.DD)(this.a(((net.minecraft.item.ItemArmor)(life13_19)), ((boolean)__sourceIntrinsic_integerToBoolean((life15_42))), ((java.lang.String)("overlay"))))));
    }
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    spill493_5 = 0x1.0p0f;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    spill493_6 = 0x1.0p0f;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    spill493_7 = 0x1.0p0f;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    moom.kZ.c(((float)(spill493_5)), ((float)(spill493_6)), ((float)(spill493_7)), ((float)(0x1.0p0f)));
    __sourceExactCall_f8da34d2aa6235(((moom.iQ)(life14_23)), ((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    }
    if (!((!this.i))) {
        break forward_join_224;
    }
    if (!(((net.minecraft.item.ItemStack)(life12_8)).i())) {
        break forward_join_224;
    }
    if (!(moom.BU.av())) {
        break forward_join_213;
    }
    if (!((!__sourceExactCall_52f66c6d831d50(((net.minecraft.entity.EntityLivingBase)(p0)), ((net.minecraft.item.ItemStack)(life12_8)), ((moom.iQ)(life14_23)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)))))) {
        break forward_join_224;
    }
    }
    __sourceExactCall_f7b7cdc31a9c9b(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((moom.iQ)(life14_23)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    }
    return;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
com.moon.d6 local9 = new com.moon.d6(p0);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(local9)));
    if (((com.moon.d6)(local9)).isCancelled()) {
        return;
    }
    this.a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((int)(4)));
    this.a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((int)(3)));
    this.a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((int)(2)));
    this.a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((int)(1)));
    return;
}


protected abstract void a();

private moom.DD a(net.minecraft.item.ItemArmor p0, boolean p1, java.lang.String p2) {
java.lang.String forwardValue4837_15_0;
    java.lang.Object[] forwardValue4837_15_1;
    java.lang.Object[] forwardValue4837_15_2;
    int forwardValue4837_15_3;
    java.lang.String forwardValue4837_16_0;
    java.lang.Object[] forwardValue4837_16_1;
    java.lang.Object[] forwardValue4837_16_2;
    int forwardValue4837_16_3;
    int forwardValue4837_16_4;
    java.lang.String forwardValue4837_24_0;
    java.lang.Object[] forwardValue4837_24_1;
    java.lang.Object[] forwardValue4837_24_2;
    int forwardValue4837_24_3;
    java.lang.String forwardValue4837_32_0;
    java.lang.Object[] forwardValue4837_32_1;
    java.lang.Object[] forwardValue4837_32_2;
    int forwardValue4837_32_3;
    java.lang.String forwardValue4837_32_4;
    java.lang.String spill4837_0;
    java.lang.Object[] spill4837_1;
    java.lang.Object[] spill4837_2;
    java.lang.Object[] spill4837_3;
    int spill4837_4;
    java.lang.Object[] spill4837_5;
    java.lang.Object[] spill4837_6;
    int spill4837_7;
    java.lang.String spill4837_8;
    java.lang.Object[] spill4837_9;
    java.lang.String life4_38;
    moom.DD life5_43;
    forward_join_52: {
    forward_join_32: {
    forward_join_24: {
    forward_join_16: {
    forward_join_15: {
    spill4837_0 = "textures/models/armor/%s_layer_%d%s.png";
    java.lang.Object[] __stackOp4837_0_0 = new java.lang.Object[3];
    spill4837_1 = __stackOp4837_0_0;
    (__stackOp4837_0_0)[0] = ((net.minecraft.item.ItemArmor$ArmorMaterial)(((net.minecraft.item.ItemArmor)(p0)).a__sourceReturn_2ce8a48aa6())).a__String();
    java.lang.Object[] __stackOp4837_3_0 = spill4837_1;
    spill4837_2 = __stackOp4837_3_0;
    spill4837_3 = __stackOp4837_3_0;
    spill4837_4 = 1;
    if (!(p1)) {
        forwardValue4837_15_0 = spill4837_0;
        forwardValue4837_15_1 = spill4837_2;
        forwardValue4837_15_2 = spill4837_3;
        forwardValue4837_15_3 = spill4837_4;
        break forward_join_15;
    }
    forwardValue4837_16_0 = spill4837_0;
    forwardValue4837_16_1 = spill4837_2;
    forwardValue4837_16_2 = spill4837_3;
    forwardValue4837_16_3 = spill4837_4;
    forwardValue4837_16_4 = 2;
    break forward_join_16;
    }
    forwardValue4837_16_0 = forwardValue4837_15_0;
    forwardValue4837_16_1 = forwardValue4837_15_1;
    forwardValue4837_16_2 = forwardValue4837_15_2;
    forwardValue4837_16_3 = forwardValue4837_15_3;
    forwardValue4837_16_4 = 1;
    }
    (forwardValue4837_16_2)[forwardValue4837_16_3] = java.lang.Integer.valueOf(((int)(forwardValue4837_16_4)));
    java.lang.Object[] __stackOp4837_5_0 = forwardValue4837_16_1;
    spill4837_5 = __stackOp4837_5_0;
    spill4837_6 = __stackOp4837_5_0;
    spill4837_7 = 2;
    if (!((p2 == null))) {
        forwardValue4837_24_0 = forwardValue4837_16_0;
        forwardValue4837_24_1 = spill4837_5;
        forwardValue4837_24_2 = spill4837_6;
        forwardValue4837_24_3 = spill4837_7;
        break forward_join_24;
    }
    forwardValue4837_32_0 = forwardValue4837_16_0;
    forwardValue4837_32_1 = spill4837_5;
    forwardValue4837_32_2 = spill4837_6;
    forwardValue4837_32_3 = spill4837_7;
    forwardValue4837_32_4 = "";
    break forward_join_32;
    }
    spill4837_8 = "_%s";
    java.lang.Object[] __stackOp4837_6_0 = new java.lang.Object[1];
    spill4837_9 = __stackOp4837_6_0;
    (__stackOp4837_6_0)[0] = p2;
    forwardValue4837_32_0 = forwardValue4837_24_0;
    forwardValue4837_32_1 = forwardValue4837_24_1;
    forwardValue4837_32_2 = forwardValue4837_24_2;
    forwardValue4837_32_3 = forwardValue4837_24_3;
    forwardValue4837_32_4 = java.lang.String.format(((java.lang.String)(spill4837_8)), ((java.lang.Object[])(spill4837_9)));
    }
    (forwardValue4837_32_2)[forwardValue4837_32_3] = forwardValue4837_32_4;
    life4_38 = java.lang.String.format(((java.lang.String)(forwardValue4837_32_0)), ((java.lang.Object[])(forwardValue4837_32_1)));
    life5_43 = ((moom.DD)(((java.util.Map)(net.minecraft.client.renderer.entity.layers.LayerArmorBase.j)).get(((java.lang.Object)(life4_38)))));
    if (!((life5_43 == null))) {
        break forward_join_52;
    }
    life5_43 = new moom.DD(life4_38);
    ((java.util.Map)(net.minecraft.client.renderer.entity.layers.LayerArmorBase.j)).put(((java.lang.Object)(life4_38)), ((java.lang.Object)(life5_43)));
    }
    return life5_43;
}


private moom.DD a(net.minecraft.item.ItemArmor p0, boolean p1) {
return this.a(((net.minecraft.item.ItemArmor)(p0)), ((boolean)(p1)), ((java.lang.String)(null)));
}


private void a(net.minecraft.entity.EntityLivingBase p0, T p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8) {
int spill1498_0;
    long spill1498_1;
    int spill1498_2;
    int spill1498_3;
    long spill1498_4;
    long life10_3;
    float life12_23;
    float life13_44;
    int life14_64;
    int life15_89;
    float life16_106;
    float life17_123;
    float life18_134;
    float life15_147;
    float life15_171;
    lexical_join_224: {
    lexical_join_198: {
    lexical_join_52: {
    lexical_join_26: {
    lexical_join_13: {
    lexical_join_9: {
    life10_3 = (net.minecraft.client.renderer.entity.layers.LayerArmorBase.n ^ 11135735993677L);
    if (!((!((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw())).d()))) {
        break lexical_join_9;
    }
    return;
    }
    if (!(moom.BU.ap())) {
        break lexical_join_13;
    }
    if (!((!moom.MP.s))) {
        break lexical_join_224;
    }
    }
    life12_23 = (((float) ((net.minecraft.entity.EntityLivingBase)(p0)).S) + p4);
    ((moom.mS)(this.d)).b(((moom.DD)(net.minecraft.client.renderer.entity.layers.LayerArmorBase.a)));
    if (!(moom.BU.ap())) {
        break lexical_join_26;
    }
    moom.MR.o();
    }
    moom.kZ.l();
    moom.kZ.c(((int)(__sourceIntrinsic_8d7b019fb297_invokedynamic1498_13(1656, (1976857650585239269L ^ life10_3)))));
    moom.kZ.a(((boolean)(false)));
    life13_44 = 0x1.0p-1f;
    moom.kZ.c(((float)(life13_44)), ((float)(life13_44)), ((float)(life13_44)), ((float)(0x1.0p0f)));
    if (!((this.k == null))) {
        break lexical_join_52;
    }
    this.k = ((com.moon.module.impl.Glint)(((com.moon.module.impl.Glint)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Glint.class)))))));
    }
    life14_64 = 0;
    lexical_cycle_54: while (true) {
    lexical_join_145: {
    lexical_join_132: {
    if (!((life14_64 < 2))) {
        break lexical_join_198;
    }
    moom.kZ.f();
    moom.kZ.b(((int)(__sourceIntrinsic_8d7b019fb297_invokedynamic1498_25(24355, (8982919719450683323L ^ life10_3)))), ((int)(1)));
    if (!(((com.moon.module.impl.Glint)(this.k)).isEnabled())) {
        break lexical_join_132;
    }
    life15_89 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.Glint)(this.k)).s)).getValue())))).intValue();
    life16_106 = (((float) ((life15_89 >> __sourceIntrinsic_8d7b019fb297_invokedynamic1498_34(19143, (8541296044616397396L ^ life10_3))) & __sourceIntrinsic_8d7b019fb297_invokedynamic1498_35(18316, (4546162314132864787L ^ life10_3)))) / 0x1.fep7f);
    life17_123 = (((float) ((life15_89 >> __sourceIntrinsic_8d7b019fb297_invokedynamic1498_36(2961, (4216301674436752134L ^ life10_3))) & __sourceIntrinsic_8d7b019fb297_invokedynamic1498_37(18316, (4546162314132864787L ^ life10_3)))) / 0x1.fep7f);
    life18_134 = (((float) (life15_89 & __sourceIntrinsic_8d7b019fb297_invokedynamic1498_38(18316, (4546162314132864787L ^ life10_3)))) / 0x1.fep7f);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.c(((float)(life16_106)), ((float)(life17_123)), ((float)(life18_134)), ((float)(0x1.0p0f)));
    break lexical_join_145;
    }
    life15_147 = 0x1.851eb8p-1f;
    moom.kZ.c(((float)((0x1.0p-1f * life15_147))), ((float)((0x1.0p-2f * life15_147))), ((float)((0x1.99999ap-1f * life15_147))), ((float)(0x1.0p0f)));
    }
    moom.kZ.l(((int)(__sourceIntrinsic_8d7b019fb297_invokedynamic1498_42(7929, (1525049747937093221L ^ life10_3)))));
    spill1498_0 = 11707;
    moom.kZ.A();
    spill1498_1 = (5196319183438468384L ^ life10_3);
    life15_171 = 0x1.555556p-2f;
    moom.kZ.a(((float)(life15_171)), ((float)(life15_171)), ((float)(life15_171)));
    moom.kZ.b(((float)((0x1.ep4f - (((float) life14_64) * 0x1.ep5f)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(((life12_23 * (0x1.0624dep-10f + (((float) life14_64) * 0x1.89374cp-9f))) * 0x1.4p4f))), ((float)(0x0.0p0f)));
    moom.kZ.l(((int)(__sourceIntrinsic_8d7b019fb297_invokedynamic1498_48(spill1498_0, spill1498_1))));
    ((moom.iQ)(p1)).a(((net.minecraft.entity.Entity)(p0)), ((float)(p2)), ((float)(p3)), ((float)(p5)), ((float)(p6)), ((float)(p7)), ((float)(p8)));
    life14_64 += 1;
    continue lexical_cycle_54;
    }
    }
    moom.kZ.l(((int)(__sourceIntrinsic_8d7b019fb297_invokedynamic1498_51(8419, (4783881517856675965L ^ life10_3)))));
    spill1498_2 = 3130;
    moom.kZ.A();
    moom.kZ.l(((int)(__sourceIntrinsic_8d7b019fb297_invokedynamic1498_54(spill1498_2, (2044429506483057836L ^ life10_3)))));
    spill1498_3 = 12331;
    moom.kZ.e();
    spill1498_4 = (2786079884404803761L ^ life10_3);
    moom.kZ.a(((boolean)(true)));
    moom.kZ.c(((int)(__sourceIntrinsic_8d7b019fb297_invokedynamic1498_58(spill1498_3, spill1498_4))));
    moom.kZ.k();
    if (!(moom.BU.ap())) {
        break lexical_join_224;
    }
    moom.MR.p();
    }
    return;
}


private boolean a__Boolean(int p0) {
return ((((p0 == 2) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10800_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f2c07d5914c6_invokedynamic4834_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_857796e4df47_invokedynamic493_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_857796e4df47_invokedynamic493_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_857796e4df47_invokedynamic493_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_857796e4df47_invokedynamic493_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_857796e4df47_invokedynamic493_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8d7b019fb297_invokedynamic1498_58(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_4070366fe7ea11(int p0, long p1);

private static native void __sourceExactCall_bda1d346b55160(moom.iQ p0, moom.iQ p1);
private static native void __sourceExactCall_075207f4b71439(moom.iQ p0, net.minecraft.entity.EntityLivingBase p1, float p2, float p3, float p4);
private static native void __sourceExactCall_f8da34d2aa6235(moom.iQ p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7);
private static native boolean __sourceExactCall_52f66c6d831d50(net.minecraft.entity.EntityLivingBase p0, net.minecraft.item.ItemStack p1, moom.iQ p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9);

private static native boolean __sourceExactCall_35f5b9f2a6d35e(net.minecraft.client.renderer.entity.layers.LayerArmorBase p0, int p1);

private static native net.minecraft.item.ItemStack __sourceExactCall_d3dca5225f76b8(net.minecraft.client.renderer.entity.layers.LayerArmorBase p0, net.minecraft.entity.EntityLivingBase p1, int p2);
private static native moom.iQ __sourceExactCall_919df85eaf484c(net.minecraft.client.renderer.entity.layers.LayerArmorBase p0, int p1);
private static native void __sourceExactCall_8468acab987f9d(net.minecraft.client.renderer.entity.layers.LayerArmorBase p0, moom.iQ p1, int p2);
private static native void __sourceExactCall_f7b7cdc31a9c9b(net.minecraft.client.renderer.entity.layers.LayerArmorBase p0, net.minecraft.entity.EntityLivingBase p1, moom.iQ p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9);
}
