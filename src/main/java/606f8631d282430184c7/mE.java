package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mE extends net.minecraft.client.renderer.entity.Render<net.minecraft.entity.item.EntityItem> {

private final net.minecraft.client.renderer.entity.RenderItem h;

private final java.util.Random i;

private static final long j;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

private static final long n;

public mE(net.minecraft.client.renderer.entity.RenderManager p0, net.minecraft.client.renderer.entity.RenderItem p1) {
super(p0);
    this.i = new java.util.Random();
    this.h = p1;
    this.c = 0x1.3333340000000p-3f;
    this.d = 0x1.8000000000000p-1f;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(3333451152257581409L)), ((long)(3720275992886974209L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(124380842363888L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.mE.j ^ 54416862227233L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill929_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill929_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill929_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill929_14 = new byte[8];
    (__sourceSpill929_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill929_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation929_16 = __sourceSpill929_14;
    ((javax.crypto.Cipher)(__sourceSpill929_11)).init(((int)(__sourceSpill929_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill929_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation929_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[3];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "=[ÅAÈ]\037¥·øÏ\0079Xå(ìtÃuÏ"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill929_25 = local11_life21;
        int __sourceSpill929_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill929_25)).substring(((int)(__sourceSpill929_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill929_30 = local13_life19;
        int __sourceSpill929_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill929_33 = new byte[8];
        (__sourceSpill929_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill929_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill929_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill929_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill929_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill929_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill929_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill929_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill929_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill929_34)).doFinal(((byte[])(__sourceSpill929_33)));
        (__sourceSpill929_30)[__sourceSpill929_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    k = ((long[])(local13_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[3]));
    javax.crypto.Cipher local0_life40;
    javax.crypto.Cipher __sourceSpill929_42 = (local0_life40 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill929_43 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill929_44 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill929_45 = new byte[8];
    (__sourceSpill929_45)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life46 = 1;
    while ((local1_life46 < 8)) {
        (__sourceSpill929_45)[local1_life46] = ((byte) ((int) ((local5_life7 << (local1_life46 * 8)) >>> 56)));
        local1_life46 += 1;
    }
    byte[] __sourcePreallocation929_47 = __sourceSpill929_45;
    ((javax.crypto.Cipher)(__sourceSpill929_42)).init(((int)(__sourceSpill929_43)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill929_44)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation929_47)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life50 = 944141281081864244L;
    byte[] __sourceSpill929_51 = new byte[8];
    (__sourceSpill929_51)[0] = ((byte) ((int) (local2_life50 >>> 56)));
    (__sourceSpill929_51)[1] = ((byte) ((int) (local2_life50 >>> 48)));
    (__sourceSpill929_51)[2] = ((byte) ((int) (local2_life50 >>> 40)));
    (__sourceSpill929_51)[3] = ((byte) ((int) (local2_life50 >>> 32)));
    (__sourceSpill929_51)[4] = ((byte) ((int) (local2_life50 >>> 24)));
    (__sourceSpill929_51)[5] = ((byte) ((int) (local2_life50 >>> 16)));
    (__sourceSpill929_51)[6] = ((byte) ((int) (local2_life50 >>> 8)));
    (__sourceSpill929_51)[7] = ((byte) ((int) local2_life50));
    javax.crypto.Cipher __sourceSpill929_52 = local0_life40;
    byte[] local4_life54 = ((javax.crypto.Cipher)(__sourceSpill929_52)).doFinal(((byte[])(__sourceSpill929_51)));
    n = ((long)((((((((((((long) (local4_life54)[0]) & 255L) << 56) | ((((long) (local4_life54)[1]) & 255L) << 48)) | ((((long) (local4_life54)[2]) & 255L) << 40)) | ((((long) (local4_life54)[3]) & 255L) << 32)) | ((((long) (local4_life54)[4]) & 255L) << 24)) | ((((long) (local4_life54)[5]) & 255L) << 16)) | ((((long) (local4_life54)[6]) & 255L) << 8)) | (((long) (local4_life54)[7]) & 255L))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8379_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1971;
        if (mE.l[n8] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = k[n8];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/mE", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mE.l[n8] = n10;
        }
        return mE.l[n8];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mE.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private int a(net.minecraft.item.ItemStack p0) {
int local2 = 1;
    return local2;
}


private int a(net.minecraft.entity.item.EntityItem p0, double p1, double p2, double p3, float p4, net.minecraft.client.resources.model.IBakedModel p5) {
net.minecraft.item.ItemStack life10_2;
    net.minecraft.item.Item life11_5;
    int life12_14;
    int life13_18;
    float life14_20;
    float life15_36;
    float life16_43;
    float life17_78;
    float life17_94;
    float life18_103;
    float life19_112;
    forward_join_112: {
    forward_join_79: {
    forward_join_61: {
    forward_join_10: {
    life10_2 = ((net.minecraft.entity.item.EntityItem)(p0)).a__xW();
    life11_5 = ((net.minecraft.item.ItemStack)(life10_2)).a__wQ();
    if (!((life11_5 == null))) { break forward_join_10; }
    return 0;
    }
    life12_14 = ((((net.minecraft.client.resources.model.IBakedModel)(p5)).b()) ? 1 : 0);
    life13_18 = ((moom.mE)(this)).a(((net.minecraft.item.ItemStack)(life10_2)));
    life14_20 = 0x1.0p-2f;
    life15_36 = ((moom.Dr.a(((float)((((((float) ((net.minecraft.entity.item.EntityItem)(p0)).a()) + p4) / 0x1.4p3f) + ((net.minecraft.entity.item.EntityItem)(p0)).aK)))) * 0x1.99999ap-4f) + 0x1.99999ap-4f);
    life16_43 = ((org.lwjgl.util.vector.Vector3f)(((moom.lV)(((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(p5)).a__lP())).a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GROUND))))).d)).y;
    moom.kZ.b(((float)(((float) p1))), ((float)(((((float) p2) + life15_36) + (0x1.0p-2f * life16_43)))), ((float)(((float) p3))));
    if (!((life12_14 == 0))) { break forward_join_61; }
    if (!((((net.minecraft.client.renderer.entity.RenderManager)(this.b)).i != null))) { break forward_join_79; }
    }
    life17_78 = ((((((float) ((net.minecraft.entity.item.EntityItem)(p0)).a()) + p4) / 0x1.4p4f) + ((net.minecraft.entity.item.EntityItem)(p0)).aK) * 0x1.ca5dcp5f);
    moom.kZ.b(((float)(life17_78)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    }
    if (!((life12_14 == 0))) { break forward_join_112; }
    life17_94 = ((-0x0.0p0f * ((float) (life13_18 - 1))) * 0x1.0p-1f);
    life18_103 = ((-0x0.0p0f * ((float) (life13_18 - 1))) * 0x1.0p-1f);
    life19_112 = ((-0x1.8p-5f * ((float) (life13_18 - 1))) * 0x1.0p-1f);
    moom.kZ.b(((float)(life17_94)), ((float)(life18_103)), ((float)(life19_112)));
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return life13_18;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mE)(this)).a(((net.minecraft.entity.item.EntityItem)(((net.minecraft.entity.item.EntityItem)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(net.minecraft.entity.item.EntityItem p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    net.minecraft.item.ItemStack life12_12;
    int life13_18;
    int life14_39;
    net.minecraft.client.resources.model.IBakedModel life15_73;
    int life16_82;
    int life17_84;
    float life18_109;
    float life19_119;
    float life20_129;
    float life18_165;
    float life19_171;
    float life20_177;
    life10_3 = (moom.mE.j ^ 116428048682420L);
    if (((net.minecraft.entity.item.EntityItem)(p0)).aC) {
        return;
    }
    life12_12 = ((net.minecraft.entity.item.EntityItem)(p0)).a__xW();
    ((java.util.Random)(this.i)).setSeed(((long)(moom.mE.n)));
    life13_18 = 0;
    if (__sourceExactCall_0bb08e89d4e22f(((moom.mE)(this)), ((net.minecraft.entity.Entity)(p0)))) {
        ((net.minecraft.client.renderer.texture.ITextureObject)(__sourceExactCall_ad9ab3c790ccb0(((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).c)), ((moom.DD)(__sourceExactCall_8f7edb11767562(((moom.mE)(this)), ((net.minecraft.entity.item.EntityItem)(p0)))))))).a(((boolean)(false)), ((boolean)(false)));
        life13_18 = 1;
    }
    moom.kZ.y();
    life14_39 = ((((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw())).c__Boolean()) ? 1 : 0);
    int spill3775_0 = __sourceIntrinsic_3fc79652007b_invokedynamic3775_17(32127, (4844186512139305138L ^ life10_3));
    __sourceExactCall_c835ee2c66e63a(((int)(spill3775_0)), ((float)(((life14_39 != 0) ? 0x1.fae148p-1f : 0x1.99999ap-4f))));
    int spill3775_1 = 7971;
    moom.kZ.l();
    __sourceExactCall_1fc4ef8e9bbe89(((int)(__sourceIntrinsic_3fc79652007b_invokedynamic3775_20(spill3775_1, (5743255558796485359L ^ life10_3)))), ((int)(__sourceIntrinsic_3fc79652007b_invokedynamic3775_21(31713, (6728402196037322287L ^ life10_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.B();
    life15_73 = ((moom.ll)(__sourceExactCall_5010e54ba3acc5(((net.minecraft.client.renderer.entity.RenderItem)(this.h))))).a__pp(((net.minecraft.item.ItemStack)(life12_12)));
    life16_82 = __sourceExactCall_2acee4ca83adda(((moom.mE)(this)), ((net.minecraft.entity.item.EntityItem)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p5)), ((net.minecraft.client.resources.model.IBakedModel)(life15_73)));
    life17_84 = 0;
    loop_region_81: while ((life17_84 < life16_82)) {
        if (__sourceExactCall_bdfc6a0d86d999(((net.minecraft.client.resources.model.IBakedModel)(life15_73)))) {
        moom.kZ.B();
        if ((life17_84 > 0)) {
        life18_109 = (((((java.util.Random)(this.i)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.333334p-3f);
        life19_119 = (((((java.util.Random)(this.i)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.333334p-3f);
        life20_129 = (((((java.util.Random)(this.i)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.333334p-3f);
        __sourceExactCall_f6b60eb6b2432b(((float)(life18_109)), ((float)(life19_119)), ((float)(life20_129)));
    }
        __sourceExactCall_c87cfdff997c62(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)));
        ((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(life15_73)).a__lP())).a__Void(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GROUND)));
        __sourceExactCall_f50244808e7dac(((net.minecraft.client.renderer.entity.RenderItem)(this.h)), ((net.minecraft.item.ItemStack)(life12_12)), ((net.minecraft.client.resources.model.IBakedModel)(life15_73)));
        moom.kZ.C();
    } else {
        moom.kZ.B();
        ((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(life15_73)).a__lP())).a__Void(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GROUND)));
        __sourceExactCall_f50244808e7dac(((net.minecraft.client.renderer.entity.RenderItem)(this.h)), ((net.minecraft.item.ItemStack)(life12_12)), ((net.minecraft.client.resources.model.IBakedModel)(life15_73)));
        moom.kZ.C();
        life18_165 = ((org.lwjgl.util.vector.Vector3f)(((moom.lV)(((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(life15_73)).a__lP())).o)).d)).x;
        life19_171 = ((org.lwjgl.util.vector.Vector3f)(((moom.lV)(((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(life15_73)).a__lP())).o)).d)).y;
        life20_177 = ((org.lwjgl.util.vector.Vector3f)(((moom.lV)(((moom.lP)(((net.minecraft.client.resources.model.IBakedModel)(life15_73)).a__lP())).o)).d)).z;
        __sourceExactCall_f6b60eb6b2432b(((float)((0x0.0p0f * life18_165))), ((float)((0x0.0p0f * life19_171))), ((float)((0x1.8p-5f * life20_177))));
    }
        life17_84 += 1;
    }
    moom.kZ.C();
    moom.kZ.z();
    moom.kZ.k();
    __sourceExactCall_0bb08e89d4e22f(((moom.mE)(this)), ((net.minecraft.entity.Entity)(p0)));
    if ((life13_18 != 0)) {
        ((net.minecraft.client.renderer.texture.ITextureObject)(__sourceExactCall_ad9ab3c790ccb0(((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).c)), ((moom.DD)(__sourceExactCall_8f7edb11767562(((moom.mE)(this)), ((net.minecraft.entity.item.EntityItem)(p0)))))))).a__Void();
    }
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(net.minecraft.entity.item.EntityItem p0) {
return net.minecraft.client.renderer.texture.TextureMap.k;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mE)(this)).a(((net.minecraft.entity.item.EntityItem)(((net.minecraft.entity.item.EntityItem)(p0)))));
}


private static native <E extends Throwable> int __sourceIntrinsic_3fc79652007b_invokedynamic3775_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fc79652007b_invokedynamic3775_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3fc79652007b_invokedynamic3775_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8379_0() throws E;



private static native boolean __sourceExactCall_0bb08e89d4e22f(moom.mE p0, net.minecraft.entity.Entity p1);
private static native net.minecraft.client.renderer.texture.ITextureObject __sourceExactCall_ad9ab3c790ccb0(net.minecraft.client.renderer.texture.TextureManager p0, moom.DD p1);
private static native moom.DD __sourceExactCall_8f7edb11767562(moom.mE p0, net.minecraft.entity.item.EntityItem p1);
private static native void __sourceExactCall_c835ee2c66e63a(int p0, float p1);
private static native void __sourceExactCall_1fc4ef8e9bbe89(int p0, int p1, int p2, int p3);
private static native moom.ll __sourceExactCall_5010e54ba3acc5(net.minecraft.client.renderer.entity.RenderItem p0);
private static native int __sourceExactCall_2acee4ca83adda(moom.mE p0, net.minecraft.entity.item.EntityItem p1, double p2, double p3, double p4, float p5, net.minecraft.client.resources.model.IBakedModel p6);
private static native boolean __sourceExactCall_bdfc6a0d86d999(net.minecraft.client.resources.model.IBakedModel p0);
private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native void __sourceExactCall_f50244808e7dac(net.minecraft.client.renderer.entity.RenderItem p0, net.minecraft.item.ItemStack p1, net.minecraft.client.resources.model.IBakedModel p2);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
