package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mB extends net.minecraft.client.renderer.entity.Render<net.minecraft.entity.projectile.EntityArrow> {

private static final moom.DD h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public mB(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(1463122350868805453L)), ((long)(-1425942308758877655L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78109277715397L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.mB.i ^ 139625869723513L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1395_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1395_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1395_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1395_14 = new byte[8];
    (__sourceSpill1395_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1395_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1395_16 = __sourceSpill1395_14;
    ((javax.crypto.Cipher)(__sourceSpill1395_11)).init(((int)(__sourceSpill1395_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1395_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1395_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "s?(L¤\033Ú¥\025þ|d^Ç"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1395_25 = local6_life21;
        int __sourceSpill1395_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1395_25)).substring(((int)(__sourceSpill1395_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1395_30 = local8_life19;
        int __sourceSpill1395_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1395_33 = new byte[8];
        (__sourceSpill1395_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1395_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1395_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1395_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1395_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1395_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1395_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1395_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1395_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1395_34)).doFinal(((byte[])(__sourceSpill1395_33)));
        (__sourceSpill1395_30)[__sourceSpill1395_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "êeï \013\031fXd7äpä"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1395_38 = local6_life21;
        int __sourceSpill1395_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1395_38)).substring(((int)(__sourceSpill1395_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1395_43 = local8_life19;
        int __sourceSpill1395_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1395_46 = new byte[8];
        (__sourceSpill1395_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1395_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1395_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1395_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1395_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1395_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1395_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1395_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1395_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1395_47)).doFinal(((byte[])(__sourceSpill1395_46)));
        (__sourceSpill1395_43)[__sourceSpill1395_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
    h = ((moom.DD)(new moom.DD("textures/entity/arrow.png")));
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x607C;
        if (k[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l5 = j[n4];
            byte[] byArray3 = new byte[]{(byte)(l5 >>> 56), (byte)(l5 >>> 48), (byte)(l5 >>> 40), (byte)(l5 >>> 32), (byte)(l5 >>> 24), (byte)(l5 >>> 16), (byte)(l5 >>> 8), (byte)l5};
            Long l6 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])l.get(l6);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    l.put(l6, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/mB", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mB.k[n4] = n6;
        }
        return k[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mB.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8376_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected moom.DD a(net.minecraft.entity.projectile.EntityArrow p0) {
return moom.mB.h;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.projectile.EntityArrow p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    net.minecraft.client.renderer.Tessellator life12_52;
    moom.lw life13_55;
    int life14_57;
    float life15_59;
    float life16_61;
    float life17_72;
    float life18_85;
    float life19_87;
    float life20_89;
    float life21_102;
    float life22_119;
    float life23_121;
    float life24_128;
    float life25_140;
    int life25_277;
    life10_3 = (moom.mB.i ^ 92869821250783L);
    __sourceExactCall_32bdf8e4c74bc9(((moom.mB)(this)), ((net.minecraft.entity.Entity)(p0)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.B();
    __sourceExactCall_f6b60eb6b2432b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    __sourceExactCall_1335870edf69d2(((float)(((((net.minecraft.entity.projectile.EntityArrow)(p0)).y + ((((net.minecraft.entity.projectile.EntityArrow)(p0)).w - ((net.minecraft.entity.projectile.EntityArrow)(p0)).y) * p5)) - 0x1.68p6f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_1335870edf69d2(((float)((((net.minecraft.entity.projectile.EntityArrow)(p0)).z + ((((net.minecraft.entity.projectile.EntityArrow)(p0)).x - ((net.minecraft.entity.projectile.EntityArrow)(p0)).z) * p5)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life12_52 = __sourceExactCall_607dff73cf88f9();
    life13_55 = ((net.minecraft.client.renderer.Tessellator)(life12_52)).a__lw();
    life14_57 = 0;
    life15_59 = 0x0.0p0f;
    life16_61 = 0x1.0p-1f;
    life17_72 = (((float) (life14_57 * __sourceIntrinsic_25fff80d3717_invokedynamic3774_15(19964, (571584130143980720L ^ life10_3)))) / 0x1.0p5f);
    life18_85 = (((float) (5 + (life14_57 * __sourceIntrinsic_25fff80d3717_invokedynamic3774_16(17702, (8116306095530017897L ^ life10_3))))) / 0x1.0p5f);
    life19_87 = 0x0.0p0f;
    life20_89 = 0x1.4p-3f;
    life21_102 = (((float) (5 + (life14_57 * __sourceIntrinsic_25fff80d3717_invokedynamic3774_17(17702, (8116306095530017897L ^ life10_3))))) / 0x1.0p5f);
    life22_119 = (((float) (__sourceIntrinsic_25fff80d3717_invokedynamic3774_18(17702, (8116306095530017897L ^ life10_3)) + (life14_57 * __sourceIntrinsic_25fff80d3717_invokedynamic3774_19(17702, (8116306095530017897L ^ life10_3))))) / 0x1.0p5f);
    life23_121 = 0x1.ccccccp-5f;
    moom.kZ.y();
    life24_128 = (((float) ((net.minecraft.entity.projectile.EntityArrow)(p0)).aL) - p5);
    if ((recovery.source.CarrierOps.fcmpl(((float)(life24_128)), ((float)(0x0.0p0f))) > 0)) {
        life25_140 = ((-__sourceExactCall_91a54ea3c9ba57(((float)((life24_128 * 0x1.8p1f))))) * life24_128);
        __sourceExactCall_1335870edf69d2(((float)(life25_140)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    }
    __sourceExactCall_1335870edf69d2(((float)(0x1.68p5f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_c87cfdff997c62(((float)(life23_121)), ((float)(life23_121)), ((float)(life23_121)));
    __sourceExactCall_f6b60eb6b2432b(((float)(-0x1.0p2f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    org.lwjgl.opengl.GL11.glNormal3f(((float)(life23_121)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life13_55)), ((int)(__sourceIntrinsic_25fff80d3717_invokedynamic3774_29(20996, (7571874174425404233L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(-0x1.0p1d)), ((double)(-0x1.0p1d))))), ((double)(((double) life19_87))), ((double)(((double) life21_102)))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(-0x1.0p1d)), ((double)(0x1.0p1d))))), ((double)(((double) life20_89))), ((double)(((double) life21_102)))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(0x1.0p1d)), ((double)(0x1.0p1d))))), ((double)(((double) life20_89))), ((double)(((double) life22_119)))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(0x1.0p1d)), ((double)(-0x1.0p1d))))), ((double)(((double) life19_87))), ((double)(((double) life22_119)))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life12_52)).a__Void();
    org.lwjgl.opengl.GL11.glNormal3f(((float)((-life23_121))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life13_55)), ((int)(__sourceIntrinsic_25fff80d3717_invokedynamic3774_46(8745, (8134501116412191591L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(0x1.0p1d)), ((double)(-0x1.0p1d))))), ((double)(((double) life19_87))), ((double)(((double) life21_102)))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(0x1.0p1d)), ((double)(0x1.0p1d))))), ((double)(((double) life20_89))), ((double)(((double) life21_102)))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(-0x1.0p1d)), ((double)(0x1.0p1d))))), ((double)(((double) life20_89))), ((double)(((double) life22_119)))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.cp2d)), ((double)(-0x1.0p1d)), ((double)(-0x1.0p1d))))), ((double)(((double) life19_87))), ((double)(((double) life22_119)))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life12_52)).a__Void();
    life25_277 = 0;
    loop_region_278: while ((life25_277 < 4)) {
        __sourceExactCall_1335870edf69d2(((float)(0x1.68p6f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        org.lwjgl.opengl.GL11.glNormal3f(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(life23_121)));
        __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life13_55)), ((int)(__sourceIntrinsic_25fff80d3717_invokedynamic3774_64(8745, (8134501116412191591L ^ life10_3)))), ((moom.oD)(moom.oB.i)));
        ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.0p3d)), ((double)(-0x1.0p1d)), ((double)(0x0.0p0d))))), ((double)(((double) life15_59))), ((double)(((double) life17_72)))))).c__Void();
        ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(0x1.0p3d)), ((double)(-0x1.0p1d)), ((double)(0x0.0p0d))))), ((double)(((double) life16_61))), ((double)(((double) life17_72)))))).c__Void();
        ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(0x1.0p3d)), ((double)(0x1.0p1d)), ((double)(0x0.0p0d))))), ((double)(((double) life16_61))), ((double)(((double) life18_85)))))).c__Void();
        ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_55)), ((double)(-0x1.0p3d)), ((double)(0x1.0p1d)), ((double)(0x0.0p0d))))), ((double)(((double) life15_59))), ((double)(((double) life18_85)))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life12_52)).a__Void();
        life25_277 += 1;
    }
    moom.kZ.z();
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mB)(this)).a(((net.minecraft.entity.projectile.EntityArrow)(((net.minecraft.entity.projectile.EntityArrow)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mB)(this)).a(((net.minecraft.entity.projectile.EntityArrow)(((net.minecraft.entity.projectile.EntityArrow)(p0)))));
}


private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25fff80d3717_invokedynamic3774_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8376_0() throws E;



private static native boolean __sourceExactCall_32bdf8e4c74bc9(moom.mB p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native float __sourceExactCall_91a54ea3c9ba57(float p0);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native moom.lw __sourceExactCall_7c0370b7b41901(moom.lw p0, double p1, double p2);
private static native moom.lw __sourceExactCall_217a742e4be448(moom.lw p0, double p1, double p2, double p3);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
