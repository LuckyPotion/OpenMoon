package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mR extends net.minecraft.client.renderer.entity.Render<moom.tL> {

private static final moom.DD h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public mR(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.c = 0x1.3333340000000p-3f;
    this.d = 0x1.8000000000000p-1f;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-7891187067297452641L)), ((long)(7342829055149439301L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49069270453717L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.mR.i ^ 63887884824458L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1405_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1405_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1405_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1405_14 = new byte[8];
    (__sourceSpill1405_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1405_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1405_16 = __sourceSpill1405_14;
    ((javax.crypto.Cipher)(__sourceSpill1405_11)).init(((int)(__sourceSpill1405_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1405_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1405_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¨$rúrµ5\033±¨¶àëýÑÅ2u\tB=ò9¼é\003\"\000<]Ë×@îÇ8ó3úÇ9ôë_¯KuQ)öa}\004Áåì"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1405_25 = local6_life21;
        int __sourceSpill1405_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1405_25)).substring(((int)(__sourceSpill1405_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1405_30 = local8_life19;
        int __sourceSpill1405_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1405_33 = new byte[8];
        (__sourceSpill1405_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1405_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1405_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1405_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1405_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1405_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1405_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1405_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1405_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1405_34)).doFinal(((byte[])(__sourceSpill1405_33)));
        (__sourceSpill1405_30)[__sourceSpill1405_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "²¥¼\t!ïÙ%}á7\b\027\n"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1405_38 = local6_life21;
        int __sourceSpill1405_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1405_38)).substring(((int)(__sourceSpill1405_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1405_43 = local8_life19;
        int __sourceSpill1405_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1405_46 = new byte[8];
        (__sourceSpill1405_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1405_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1405_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1405_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1405_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1405_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1405_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1405_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1405_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1405_47)).doFinal(((byte[])(__sourceSpill1405_46)));
        (__sourceSpill1405_43)[__sourceSpill1405_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[10]));
    h = ((moom.DD)(new moom.DD("textures/entity/experience_orb.png")));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8398_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x74F4;
        if (k[n8] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n8];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mR.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    mR.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/mR", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mR.k[n8] = n10;
        }
        return k[n8];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mR.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mR)(this)).a(((moom.tL)(((moom.tL)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(moom.tL p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    int life12_18;
    float life13_31;
    float life14_50;
    float life15_63;
    float life16_82;
    float life17_84;
    float life18_86;
    float life19_88;
    int life20_92;
    int life21_100;
    int life22_108;
    float life23_121;
    float life24_129;
    int life22_146;
    int life25_152;
    int life26_164;
    float life27_183;
    net.minecraft.client.renderer.Tessellator life28_189;
    moom.lw life29_192;
    int life30_203;
    int life31_208;
    int life32_210;
    int life33_215;
    life10_3 = (moom.mR.i ^ 52180763151384L);
    moom.kZ.B();
    __sourceExactCall_f6b60eb6b2432b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    __sourceExactCall_c4b554c066f47c(((moom.mR)(this)), ((net.minecraft.entity.Entity)(p0)));
    life12_18 = ((moom.tL)(p0)).b__sourceReturn_8abf5c6871();
    life13_31 = (((float) ((life12_18 % 4) * __sourceIntrinsic_d638e925e3e9_invokedynamic6857_5(14655, (5282965945164052896L ^ life10_3)))) / 0x1.0p6f);
    life14_50 = (((float) (((life12_18 % 4) * __sourceIntrinsic_d638e925e3e9_invokedynamic6857_6(2878, (684994709429554086L ^ life10_3))) + __sourceIntrinsic_d638e925e3e9_invokedynamic6857_7(2878, (684994709429554086L ^ life10_3)))) / 0x1.0p6f);
    life15_63 = (((float) ((life12_18 / 4) * __sourceIntrinsic_d638e925e3e9_invokedynamic6857_8(2878, (684994709429554086L ^ life10_3)))) / 0x1.0p6f);
    life16_82 = (((float) (((life12_18 / 4) * __sourceIntrinsic_d638e925e3e9_invokedynamic6857_9(2878, (684994709429554086L ^ life10_3))) + __sourceIntrinsic_d638e925e3e9_invokedynamic6857_10(2878, (684994709429554086L ^ life10_3)))) / 0x1.0p6f);
    life17_84 = 0x1.0p0f;
    life18_86 = 0x1.0p-1f;
    life19_88 = 0x1.0p-2f;
    life20_92 = ((moom.tL)(p0)).a__Int(((float)(p5)));
    life21_100 = (life20_92 % __sourceIntrinsic_d638e925e3e9_invokedynamic6857_12(30716, (1672920859726575456L ^ life10_3)));
    life22_108 = (life20_92 / __sourceIntrinsic_d638e925e3e9_invokedynamic6857_13(13006, (9106661386952880723L ^ life10_3)));
    __sourceExactCall_9d3d96a90a216c(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) life21_100))), ((float)(((float) life22_108))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    life23_121 = 0x1.fep7f;
    life24_129 = ((((float) ((moom.tL)(p0)).aE) + p5) / 0x1.0p1f);
    if (moom.BU.ag()) {
        life24_129 = __sourceExactCall_a043e80fb5877e(((float)(life24_129)));
    }
    life22_146 = ((int) (((__sourceExactCall_91a54ea3c9ba57(((float)((life24_129 + 0x0.0p0f)))) + 0x1.0p0f) * 0x1.0p-1f) * 0x1.fep7f));
    life25_152 = __sourceIntrinsic_d638e925e3e9_invokedynamic6857_21(27641, (2680608430827465575L ^ life10_3));
    life26_164 = ((int) (((__sourceExactCall_91a54ea3c9ba57(((float)((life24_129 + 0x1.0c1524p2f)))) + 0x1.0p0f) * 0x1.99999ap-4f) * 0x1.fep7f));
    __sourceExactCall_1335870edf69d2(((float)((0x1.68p7f - ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).g))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_1335870edf69d2(((float)((-((net.minecraft.client.renderer.entity.RenderManager)(this.b)).h))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    life27_183 = 0x1.333334p-2f;
    __sourceExactCall_c87cfdff997c62(((float)(0x1.333334p-2f)), ((float)(0x1.333334p-2f)), ((float)(0x1.333334p-2f)));
    life28_189 = __sourceExactCall_607dff73cf88f9();
    life29_192 = ((net.minecraft.client.renderer.Tessellator)(life28_189)).a__lw();
    __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life29_192)), ((int)(__sourceIntrinsic_d638e925e3e9_invokedynamic6857_32(23195, (1907010207909599755L ^ life10_3)))), ((moom.oD)(moom.oB.n)));
    int spill6857_0 = 24068;
    life30_203 = life22_146;
    life31_208 = __sourceIntrinsic_d638e925e3e9_invokedynamic6857_35(spill6857_0, (5457114793481658005L ^ life10_3));
    life32_210 = life26_164;
    if (moom.BU.ag()) {
        life33_215 = moom.Jl.a__Int(((float)(life24_129)));
        if ((life33_215 >= 0)) {
        life30_203 = ((life33_215 >> __sourceIntrinsic_d638e925e3e9_invokedynamic6857_38(2878, (684994709429554086L ^ life10_3))) & __sourceIntrinsic_d638e925e3e9_invokedynamic6857_39(24068, (5457114793481658005L ^ life10_3)));
        life31_208 = ((life33_215 >> __sourceIntrinsic_d638e925e3e9_invokedynamic6857_40(14407, (4592254627351869661L ^ life10_3))) & __sourceIntrinsic_d638e925e3e9_invokedynamic6857_41(24068, (5457114793481658005L ^ life10_3)));
        life32_210 = (life33_215 & __sourceIntrinsic_d638e925e3e9_invokedynamic6857_42(24068, (5457114793481658005L ^ life10_3)));
    }
    }
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life29_192)), ((double)(((double) (0x0.0p0f - life18_86)))), ((double)(((double) (0x0.0p0f - life19_88)))), ((double)(0x0.0p0d))))), ((double)(((double) life13_31))), ((double)(((double) life16_82)))))), ((int)(life30_203)), ((int)(life31_208)), ((int)(life32_210)), ((int)(__sourceIntrinsic_d638e925e3e9_invokedynamic6857_45(24077, (2830428064327196310L ^ life10_3))))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life29_192)), ((double)(((double) (life17_84 - life18_86)))), ((double)(((double) (0x0.0p0f - life19_88)))), ((double)(0x0.0p0d))))), ((double)(((double) life14_50))), ((double)(((double) life16_82)))))), ((int)(life30_203)), ((int)(life31_208)), ((int)(life32_210)), ((int)(__sourceIntrinsic_d638e925e3e9_invokedynamic6857_51(10063, (6220095797427840982L ^ life10_3))))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life29_192)), ((double)(((double) (life17_84 - life18_86)))), ((double)(((double) (0x1.0p0f - life19_88)))), ((double)(0x0.0p0d))))), ((double)(((double) life14_50))), ((double)(((double) life15_63)))))), ((int)(life30_203)), ((int)(life31_208)), ((int)(life32_210)), ((int)(__sourceIntrinsic_d638e925e3e9_invokedynamic6857_57(10063, (6220095797427840982L ^ life10_3))))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life29_192)), ((double)(((double) (0x0.0p0f - life18_86)))), ((double)(((double) (0x1.0p0f - life19_88)))), ((double)(0x0.0p0d))))), ((double)(((double) life13_31))), ((double)(((double) life15_63)))))), ((int)(life30_203)), ((int)(life31_208)), ((int)(life32_210)), ((int)(__sourceIntrinsic_d638e925e3e9_invokedynamic6857_63(10063, (6220095797427840982L ^ life10_3))))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life28_189)).a__Void();
    moom.kZ.k();
    moom.kZ.z();
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(moom.tL p0) {
return moom.mR.h;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mR)(this)).a(((moom.tL)(((moom.tL)(p0)))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8398_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d638e925e3e9_invokedynamic6857_63(int a0, long a1) throws E;



private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native boolean __sourceExactCall_c4b554c066f47c(moom.mR p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_9d3d96a90a216c(int p0, float p1, float p2);
private static native float __sourceExactCall_a043e80fb5877e(float p0);
private static native float __sourceExactCall_91a54ea3c9ba57(float p0);
private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native moom.lw __sourceExactCall_49921e0973e9e6(moom.lw p0, float p1, float p2, float p3);
private static native moom.lw __sourceExactCall_5d46cad12f6a1a(moom.lw p0, int p1, int p2, int p3, int p4);
private static native moom.lw __sourceExactCall_7c0370b7b41901(moom.lw p0, double p1, double p2);
private static native moom.lw __sourceExactCall_217a742e4be448(moom.lw p0, double p1, double p2, double p3);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
