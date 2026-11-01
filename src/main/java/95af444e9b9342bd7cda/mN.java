package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mN extends net.minecraft.client.renderer.entity.Render<moom.sF> {

private static final moom.DD h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public mN(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(6893971547254068606L)), ((long)(9161709549816023296L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135038009816136L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.mN.i ^ 57974237140856L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1403_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1403_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1403_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1403_14 = new byte[8];
    (__sourceSpill1403_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1403_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1403_16 = __sourceSpill1403_14;
    ((javax.crypto.Cipher)(__sourceSpill1403_11)).init(((int)(__sourceSpill1403_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1403_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1403_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ß(mlÕrâ-è¼åÝ\"ÉúÎ\013Ë]\005\036ð"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1403_25 = local6_life21;
        int __sourceSpill1403_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1403_25)).substring(((int)(__sourceSpill1403_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1403_30 = local8_life19;
        int __sourceSpill1403_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1403_33 = new byte[8];
        (__sourceSpill1403_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1403_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1403_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1403_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1403_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1403_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1403_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1403_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1403_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1403_34)).doFinal(((byte[])(__sourceSpill1403_33)));
        (__sourceSpill1403_30)[__sourceSpill1403_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "(f¤Áóä0ð6´Õ\fÏ°\024°"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1403_38 = local6_life21;
        int __sourceSpill1403_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1403_38)).substring(((int)(__sourceSpill1403_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1403_43 = local8_life19;
        int __sourceSpill1403_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1403_46 = new byte[8];
        (__sourceSpill1403_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1403_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1403_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1403_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1403_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1403_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1403_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1403_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1403_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1403_47)).doFinal(((byte[])(__sourceSpill1403_46)));
        (__sourceSpill1403_43)[__sourceSpill1403_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[5]));
    h = ((moom.DD)(new moom.DD("textures/painting/paintings_kristoffer_zetterstrand.png")));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8393_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13094;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mN)(this)).a(((moom.sF)(((moom.sF)(p0)))));
}


public void a(moom.sF p0, double p1, double p2, double p3, float p4, float p5) {
moom.kZ.B();
    __sourceExactCall_6e6dcebc99701b(((double)(p1)), ((double)(p2)), ((double)(p3)));
    __sourceExactCall_1335870edf69d2(((float)((0x1.68p7f - p4))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.y();
    __sourceExactCall_a1b93cecb1ee37(((moom.mN)(this)), ((net.minecraft.entity.Entity)(p0)));
    java.lang.Object local10 = ((moom.sF)(p0)).aH;
    float local11 = 0x1.0p-4f;
    __sourceExactCall_c87cfdff997c62(((float)(local11)), ((float)(local11)), ((float)(local11)));
    __sourceExactCall_4ecb6e81de1d2e(((moom.mN)(this)), ((moom.sF)(p0)), ((int)(((moom.aU)(local10)).sizeX)), ((int)(((moom.aU)(local10)).sizeY)), ((int)(((moom.aU)(local10)).offsetX)), ((int)(((moom.aU)(local10)).offsetY)));
    moom.kZ.z();
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(moom.sF p0) {
return moom.mN.h;
}


private void a(moom.sF p0, int p1, int p2, int p3, int p4) {
long local6 = (moom.mN.i ^ 86386303828993L);
    float local8 = (((float) (-p1)) / 0x1.0p1f);
    float local9 = (((float) (-p2)) / 0x1.0p1f);
    float local10 = 0x1.0p-1f;
    float local11 = 0x1.8p-1f;
    float local12 = 0x1.ap-1f;
    float local13 = 0x0.0p0f;
    float local14 = 0x1.0p-4f;
    float local15 = 0x1.8p-1f;
    float local16 = 0x1.ap-1f;
    float local17 = 0x1.0p-9f;
    float local18 = 0x1.0p-9f;
    float local19 = 0x1.81p-1f;
    float local20 = 0x1.81p-1f;
    float local21 = 0x0.0p0f;
    float local22 = 0x1.0p-4f;
    int local23 = 0;
    while ((local23 < (p1 / __sourceIntrinsic_e729675b390a_invokedynamic7002_1(23596, (6727907974290184321L ^ local6))))) {
        int local24 = 0;
        while ((local24 < (p2 / __sourceIntrinsic_e729675b390a_invokedynamic7002_2(25724, (7657916380196380882L ^ local6))))) {
        float local25 = (local8 + ((float) ((local23 + 1) * __sourceIntrinsic_e729675b390a_invokedynamic7002_3(25724, (7657916380196380882L ^ local6)))));
        float local26 = (local8 + ((float) (local23 * __sourceIntrinsic_e729675b390a_invokedynamic7002_4(25724, (7657916380196380882L ^ local6)))));
        float local27 = (local9 + ((float) ((local24 + 1) * __sourceIntrinsic_e729675b390a_invokedynamic7002_5(25724, (7657916380196380882L ^ local6)))));
        float local28 = (local9 + ((float) (local24 * __sourceIntrinsic_e729675b390a_invokedynamic7002_6(25724, (7657916380196380882L ^ local6)))));
        ((moom.mN)(this)).a(((moom.sF)(p0)), ((float)(((local25 + local26) / 0x1.0p1f))), ((float)(((local27 + local28) / 0x1.0p1f))));
        float local29 = (((float) ((p3 + p1) - (local23 * __sourceIntrinsic_e729675b390a_invokedynamic7002_8(25724, (7657916380196380882L ^ local6))))) / 0x1.0p8f);
        float local30 = (((float) ((p3 + p1) - ((local23 + 1) * __sourceIntrinsic_e729675b390a_invokedynamic7002_9(25724, (7657916380196380882L ^ local6))))) / 0x1.0p8f);
        float local31 = (((float) ((p4 + p2) - (local24 * __sourceIntrinsic_e729675b390a_invokedynamic7002_10(25724, (7657916380196380882L ^ local6))))) / 0x1.0p8f);
        float local32 = (((float) ((p4 + p2) - ((local24 + 1) * __sourceIntrinsic_e729675b390a_invokedynamic7002_11(25724, (7657916380196380882L ^ local6))))) / 0x1.0p8f);
        net.minecraft.client.renderer.Tessellator local33 = net.minecraft.client.renderer.Tessellator.a();
        moom.lw local34 = ((net.minecraft.client.renderer.Tessellator)(local33)).a__lw();
        ((moom.lw)(local34)).a(((int)(__sourceIntrinsic_e729675b390a_invokedynamic7002_14(27539, (2018264067974573884L ^ local6)))), ((moom.oD)(moom.oB.l)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local28))), ((double)(((double) (-local10))))))).a(((double)(((double) local30))), ((double)(((double) local31)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local28))), ((double)(((double) (-local10))))))).a(((double)(((double) local29))), ((double)(((double) local31)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local27))), ((double)(((double) (-local10))))))).a(((double)(((double) local29))), ((double)(((double) local32)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local27))), ((double)(((double) (-local10))))))).a(((double)(((double) local30))), ((double)(((double) local32)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local27))), ((double)(((double) local10)))))).a(((double)(((double) local11))), ((double)(((double) local13)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local27))), ((double)(((double) local10)))))).a(((double)(((double) local12))), ((double)(((double) local13)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local28))), ((double)(((double) local10)))))).a(((double)(((double) local12))), ((double)(((double) local14)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local28))), ((double)(((double) local10)))))).a(((double)(((double) local11))), ((double)(((double) local14)))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local27))), ((double)(((double) (-local10))))))).a(((double)(((double) local15))), ((double)(((double) local17)))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local27))), ((double)(((double) (-local10))))))).a(((double)(((double) local16))), ((double)(((double) local17)))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local27))), ((double)(((double) local10)))))).a(((double)(((double) local16))), ((double)(((double) local18)))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local27))), ((double)(((double) local10)))))).a(((double)(((double) local15))), ((double)(((double) local18)))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local28))), ((double)(((double) local10)))))).a(((double)(((double) local15))), ((double)(((double) local17)))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local28))), ((double)(((double) local10)))))).a(((double)(((double) local16))), ((double)(((double) local17)))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local28))), ((double)(((double) (-local10))))))).a(((double)(((double) local16))), ((double)(((double) local18)))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local28))), ((double)(((double) (-local10))))))).a(((double)(((double) local15))), ((double)(((double) local18)))))).a(((float)(0x0.0p0f)), ((float)(-0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local27))), ((double)(((double) local10)))))).a(((double)(((double) local20))), ((double)(((double) local21)))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local28))), ((double)(((double) local10)))))).a(((double)(((double) local20))), ((double)(((double) local22)))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local28))), ((double)(((double) (-local10))))))).a(((double)(((double) local19))), ((double)(((double) local22)))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local25))), ((double)(((double) local27))), ((double)(((double) (-local10))))))).a(((double)(((double) local19))), ((double)(((double) local21)))))).a(((float)(-0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local27))), ((double)(((double) (-local10))))))).a(((double)(((double) local20))), ((double)(((double) local21)))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local28))), ((double)(((double) (-local10))))))).a(((double)(((double) local20))), ((double)(((double) local22)))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local28))), ((double)(((double) local10)))))).a(((double)(((double) local19))), ((double)(((double) local22)))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local34)).a(((double)(((double) local26))), ((double)(((double) local27))), ((double)(((double) local10)))))).a(((double)(((double) local19))), ((double)(((double) local21)))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(local33)).a__Void();
        local24 += 1;
    }
        local23 += 1;
    }
    return;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mN)(this)).a(((moom.sF)(((moom.sF)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private void a(moom.sF p0, float p1, float p2) {
long local4 = (moom.mN.i ^ 52140739163832L);
    int local6 = moom.Dr.b__Int(((double)(((moom.sF)(p0)).n)));
    int local7 = moom.Dr.b__Int(((double)((((moom.sF)(p0)).o + ((double) (p2 / 0x1.0p4f))))));
    int local8 = moom.Dr.b__Int(((double)(((moom.sF)(p0)).p)));
    moom.bs local9 = ((moom.sF)(p0)).aG;
    if ((local9 == moom.bs.NORTH)) {
        local6 = moom.Dr.b__Int(((double)((((moom.sF)(p0)).n + ((double) (p1 / 0x1.0p4f))))));
    }
    if ((local9 == moom.bs.WEST)) {
        local8 = moom.Dr.b__Int(((double)((((moom.sF)(p0)).p - ((double) (p1 / 0x1.0p4f))))));
    }
    if ((local9 == moom.bs.SOUTH)) {
        local6 = moom.Dr.b__Int(((double)((((moom.sF)(p0)).n - ((double) (p1 / 0x1.0p4f))))));
    }
    if ((local9 == moom.bs.EAST)) {
        local8 = moom.Dr.b__Int(((double)((((moom.sF)(p0)).p + ((double) (p1 / 0x1.0p4f))))));
    }
    int local10 = ((net.minecraft.world.World)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).d)).a(((moom.DT)(new moom.DT(local6, local7, local8))), ((int)(0)));
    int local11 = (local10 % __sourceIntrinsic_b2d9731d8273_invokedynamic8395_23(29174, (7968072654695942118L ^ local4)));
    int local12 = (local10 / __sourceIntrinsic_b2d9731d8273_invokedynamic8395_24(29568, (4752832066537244053L ^ local4)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) local11))), ((float)(((float) local12))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8393_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e729675b390a_invokedynamic7002_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b2d9731d8273_invokedynamic8395_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b2d9731d8273_invokedynamic8395_24(int a0, long a1) throws E;



private static native void __sourceExactCall_6e6dcebc99701b(double p0, double p1, double p2);
private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
private static native boolean __sourceExactCall_a1b93cecb1ee37(moom.mN p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native void __sourceExactCall_4ecb6e81de1d2e(moom.mN p0, moom.sF p1, int p2, int p3, int p4, int p5);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
