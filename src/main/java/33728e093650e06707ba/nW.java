package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nW implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.passive.EntitySheep> {

private static final moom.DD a;

private final moom.ng b;

public moom.jl c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public nW(moom.ng p0) {
super();
    this.c = new moom.jl();
    this.b = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-5312783598196673196L)), ((long)(3559051927314941420L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101660337258797L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.nW.d ^ 88383661018188L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill943_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill943_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill943_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill943_14 = new byte[8];
    (__sourceSpill943_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill943_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation943_16 = __sourceSpill943_14;
    ((javax.crypto.Cipher)(__sourceSpill943_11)).init(((int)(__sourceSpill943_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill943_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation943_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "8ãÃ{yô¾6Ó \030úÓãÔ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill943_25 = local6_life21;
        int __sourceSpill943_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill943_25)).substring(((int)(__sourceSpill943_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill943_30 = local8_life19;
        int __sourceSpill943_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill943_33 = new byte[8];
        (__sourceSpill943_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill943_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill943_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill943_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill943_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill943_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill943_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill943_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill943_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill943_34)).doFinal(((byte[])(__sourceSpill943_33)));
        (__sourceSpill943_30)[__sourceSpill943_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((moom.DD)(new moom.DD("textures/entity/sheep/sheep_fur.png")));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22096;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/nW", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.nW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8502_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/nW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.entity.passive.EntitySheep p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long life9_3;
    int life11_36;
    int life12_48;
    int life13_51;
    int life14_55;
    int life15_61;
    float life16_75;
    float[] life17_79;
    float[] life18_83;
    float[] life11_140;
    forward_join_172: {
    forward_join_149: {
    forward_join_139: {
    forward_join_128: {
    forward_join_87: {
    life9_3 = (moom.nW.d ^ 49727865552420L);
    if (!((!((net.minecraft.entity.passive.EntitySheep)(p0)).ae()))) { break forward_join_172; }
    if (!((!((net.minecraft.entity.passive.EntitySheep)(p0)).v__Boolean()))) { break forward_join_172; }
    ((moom.ng)(this.b)).b(((moom.DD)(moom.nW.a)));
    if (!(((net.minecraft.entity.passive.EntitySheep)(p0)).e__Boolean())) { break forward_join_128; }
    if (!(((java.lang.String)("jeb_")).equals(((java.lang.Object)(((net.minecraft.entity.passive.EntitySheep)(p0)).g__String()))))) { break forward_join_128; }
    life11_36 = __sourceIntrinsic_cf275e586c72_invokedynamic4388_9(24733, (2873910977646938155L ^ life9_3));
    life12_48 = ((((net.minecraft.entity.passive.EntitySheep)(p0)).S / __sourceIntrinsic_cf275e586c72_invokedynamic4388_11(8162, (6991927875975329621L ^ life9_3))) + ((net.minecraft.entity.passive.EntitySheep)(p0)).e__Int());
    life13_51 = (net.minecraft.item.EnumDyeColor.values()).length;
    life14_55 = (life12_48 % life13_51);
    life15_61 = ((life12_48 + 1) % life13_51);
    life16_75 = ((((float) (((net.minecraft.entity.passive.EntitySheep)(p0)).S % __sourceIntrinsic_cf275e586c72_invokedynamic4388_15(8162, (6991927875975329621L ^ life9_3)))) + p3) / 0x1.9p4f);
    life17_79 = net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.b(((int)(life14_55))))));
    life18_83 = net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.b(((int)(life15_61))))));
    if (!(moom.BU.ag())) { break forward_join_87; }
    life17_79 = moom.Jl.b(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.b(((int)(life14_55))))), ((float[])(life17_79)));
    life18_83 = moom.Jl.b(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.b(((int)(life15_61))))), ((float[])(life18_83)));
    }
    moom.kZ.c(((float)((((life17_79)[0] * (0x1.0p0f - life16_75)) + ((life18_83)[0] * life16_75)))), ((float)((((life17_79)[1] * (0x1.0p0f - life16_75)) + ((life18_83)[1] * life16_75)))), ((float)((((life17_79)[2] * (0x1.0p0f - life16_75)) + ((life18_83)[2] * life16_75)))));
    break forward_join_149;
    }
    life11_140 = net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(p0)).a__sourceReturn_d841ada59b())));
    if (!(moom.BU.ag())) { break forward_join_139; }
    life11_140 = moom.Jl.b(((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntitySheep)(p0)).a__sourceReturn_d841ada59b())), ((float[])(life11_140)));
    }
    moom.kZ.c(((float)((life11_140)[0])), ((float)((life11_140)[1])), ((float)((life11_140)[2])));
    }
    ((moom.jl)(this.c)).a(((moom.iQ)(((moom.ng)(this.b)).a__iQ())));
    ((moom.jl)(this.c)).a(((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    ((moom.jl)(this.c)).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    }
    return;
}


public void a__sourceBridge_a569c1ca8a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((moom.nW)(this)).a(((net.minecraft.entity.passive.EntitySheep)(((net.minecraft.entity.passive.EntitySheep)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public boolean a__Boolean() {
return ((1) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8502_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cf275e586c72_invokedynamic4388_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cf275e586c72_invokedynamic4388_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cf275e586c72_invokedynamic4388_15(int a0, long a1) throws E;


}
