package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class mU<T extends net.minecraft.entity.EntityLiving> extends moom.mS<T> {

private static int B;

private static final long M;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

public mU(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
}


static {
M = ((long)(((moom._a)(moom._c.a(((long)(6536640381769368018L)), ((long)(5996933052451527505L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121344850121196L)))));
    int __sourceSpill1406_6 = 0;
    W = ((java.util.Map)(new java.util.HashMap(13)));
    moom.mU.b(((int)(__sourceSpill1406_6)));
    long local0_life9 = (moom.mU.M ^ 7391920690284L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1406_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1406_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1406_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1406_16 = new byte[8];
    (__sourceSpill1406_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1406_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1406_18 = __sourceSpill1406_16;
    ((javax.crypto.Cipher)(__sourceSpill1406_13)).init(((int)(__sourceSpill1406_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1406_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1406_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "¦_;,F8_SG\\}"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1406_27 = local6_life23;
        int __sourceSpill1406_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1406_27)).substring(((int)(__sourceSpill1406_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1406_32 = local8_life21;
        int __sourceSpill1406_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1406_35 = new byte[8];
        (__sourceSpill1406_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1406_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1406_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1406_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1406_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1406_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1406_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1406_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1406_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1406_36)).doFinal(((byte[])(__sourceSpill1406_35)));
        (__sourceSpill1406_32)[__sourceSpill1406_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ÏYð*,½xØÖ\021±oÙ\002Î"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1406_40 = local6_life23;
        int __sourceSpill1406_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1406_40)).substring(((int)(__sourceSpill1406_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1406_45 = local8_life21;
        int __sourceSpill1406_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1406_48 = new byte[8];
        (__sourceSpill1406_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1406_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1406_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1406_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1406_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1406_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1406_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1406_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1406_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1406_49)).doFinal(((byte[])(__sourceSpill1406_48)));
        (__sourceSpill1406_45)[__sourceSpill1406_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    U = ((long[])(local8_life21));
    V = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public static int b__sourceReturn_8abf5c6871() {
int local0 = __sourceExactCall_06ee73944ae97f();
    if ((local0 == 0)) {
        return 92;
    }
    return 0;
}


protected void b(T p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    net.minecraft.entity.Entity life12_13;
    double life4_25;
    net.minecraft.client.renderer.Tessellator life13_27;
    moom.lw life14_30;
    double life15_45;
    double life17_60;
    double life19_63;
    double life21_66;
    double life23_69;
    double life25_81;
    double life27_100;
    double life29_127;
    double life31_146;
    double life33_161;
    double life19_170;
    double life21_179;
    double life35_190;
    double life37_199;
    double life39_210;
    double life2_214;
    double life6_218;
    double life41_224;
    double life43_230;
    double life45_236;
    int life47_251;
    double life48_253;
    int life50_259;
    float life51_268;
    float life52_270;
    float life53_272;
    float life54_293;
    int life50_393;
    float life51_402;
    float life52_404;
    float life53_406;
    float life54_427;
    lexical_join_524: {
    lexical_join_521: {
    lexical_join_516: {
    lexical_join_380: {
    lexical_join_240: {
    lexical_join_76: {
    lexical_join_8: {
    life10_3 = (moom.mU.M ^ 135601301724342L);
    if (!(moom.BU.ap())) {
        break lexical_join_8;
    }
    if (!((!moom.MP.s))) {
        break lexical_join_524;
    }
    }
    life12_13 = ((net.minecraft.entity.EntityLiving)(p0)).c__sourceReturn_09c029d8c3();
    if (!((life12_13 != null))) {
        break lexical_join_524;
    }
    life4_25 = (p2 - ((0x1.999999999999ap0d - ((double) ((net.minecraft.entity.EntityLiving)(p0)).H)) * 0x1.0p-1d));
    life13_27 = net.minecraft.client.renderer.Tessellator.a();
    life14_30 = ((net.minecraft.client.renderer.Tessellator)(life13_27)).a__lw();
    life15_45 = (((moom.mU)(this)).a(((double)(((double) ((net.minecraft.entity.Entity)(life12_13)).y))), ((double)(((double) ((net.minecraft.entity.Entity)(life12_13)).w))), ((double)(((double) (p5 * 0x1.0p-1f))))) * 0x1.1df46ap-6d);
    life17_60 = (((moom.mU)(this)).a(((double)(((double) ((net.minecraft.entity.Entity)(life12_13)).z))), ((double)(((double) ((net.minecraft.entity.Entity)(life12_13)).x))), ((double)(((double) (p5 * 0x1.0p-1f))))) * 0x1.1df46ap-6d);
    life19_63 = java.lang.Math.cos(((double)(life15_45)));
    life21_66 = java.lang.Math.sin(((double)(life15_45)));
    life23_69 = java.lang.Math.sin(((double)(life17_60)));
    if (!((((life12_13 instanceof net.minecraft.entity.EntityHanging) ? 1 : 0) != 0))) {
        break lexical_join_76;
    }
    life19_63 = 0x0.0p0d;
    life21_66 = 0x0.0p0d;
    life23_69 = -0x1.0p0d;
    }
    life25_81 = java.lang.Math.cos(((double)(life17_60)));
    life27_100 = ((((moom.mU)(this)).a(((double)(((net.minecraft.entity.Entity)(life12_13)).k)), ((double)(((net.minecraft.entity.Entity)(life12_13)).n)), ((double)(((double) p5)))) - (life19_63 * 0x1.6666666666666p-1d)) - ((life21_66 * 0x1.0p-1d) * life25_81));
    life29_127 = ((((moom.mU)(this)).a(((double)((((net.minecraft.entity.Entity)(life12_13)).l + (((double) ((net.minecraft.entity.Entity)(life12_13)).e__Float()) * 0x1.6666666666666p-1d)))), ((double)((((net.minecraft.entity.Entity)(life12_13)).o + (((double) ((net.minecraft.entity.Entity)(life12_13)).e__Float()) * 0x1.6666666666666p-1d)))), ((double)(((double) p5)))) - (life23_69 * 0x1.0p-1d)) - 0x1.0p-2d);
    life31_146 = ((((moom.mU)(this)).a(((double)(((net.minecraft.entity.Entity)(life12_13)).m)), ((double)(((net.minecraft.entity.Entity)(life12_13)).p)), ((double)(((double) p5)))) - (life21_66 * 0x1.6666666666666p-1d)) + ((life19_63 * 0x1.0p-1d) * life25_81));
    life33_161 = ((((moom.mU)(this)).a(((double)(((double) ((net.minecraft.entity.EntityLiving)(p0)).a3))), ((double)(((double) ((net.minecraft.entity.EntityLiving)(p0)).a2))), ((double)(((double) p5)))) * 0x1.1df46ap-6d) + 0x1.921fb54442d18p0d);
    life19_170 = ((java.lang.Math.cos(((double)(life33_161))) * ((double) ((net.minecraft.entity.EntityLiving)(p0)).G)) * 0x1.999999999999ap-2d);
    life21_179 = ((java.lang.Math.sin(((double)(life33_161))) * ((double) ((net.minecraft.entity.EntityLiving)(p0)).G)) * 0x1.999999999999ap-2d);
    life35_190 = (((moom.mU)(this)).a(((double)(((net.minecraft.entity.EntityLiving)(p0)).k)), ((double)(((net.minecraft.entity.EntityLiving)(p0)).n)), ((double)(((double) p5)))) + life19_170);
    life37_199 = ((moom.mU)(this)).a(((double)(((net.minecraft.entity.EntityLiving)(p0)).l)), ((double)(((net.minecraft.entity.EntityLiving)(p0)).o)), ((double)(((double) p5))));
    life39_210 = (((moom.mU)(this)).a(((double)(((net.minecraft.entity.EntityLiving)(p0)).m)), ((double)(((net.minecraft.entity.EntityLiving)(p0)).p)), ((double)(((double) p5)))) + life21_179);
    life2_214 = (p1 + life19_170);
    life6_218 = (p3 + life21_179);
    life41_224 = ((double) ((float) (life27_100 - life35_190)));
    life43_230 = ((double) ((float) (life29_127 - life37_199)));
    life45_236 = ((double) ((float) (life31_146 - life39_210)));
    moom.kZ.v();
    moom.kZ.f();
    moom.kZ.p();
    if (!(moom.BU.ap())) {
        break lexical_join_240;
    }
    moom.MP.aq();
    }
    life47_251 = __sourceIntrinsic_ab3c258b48ed_invokedynamic1250_50(18222, (9009919100336028046L ^ life10_3));
    life48_253 = 0x1.999999999999ap-6d;
    ((moom.lw)(life14_30)).a(((int)(5)), ((moom.oD)(moom.oB.h)));
    life50_259 = 0;
    lexical_cycle_254: while (true) {
    lexical_join_283: {
    if (!((life50_259 <= __sourceIntrinsic_ab3c258b48ed_invokedynamic1250_53(12405, (3483333848955965142L ^ life10_3))))) {
        break lexical_join_380;
    }
    life51_268 = 0x1.0p-1f;
    life52_270 = 0x1.99999ap-2f;
    life53_272 = 0x1.333334p-2f;
    if (!(((life50_259 % 2) == 0))) {
        break lexical_join_283;
    }
    life51_268 = (life51_268 * 0x1.666666p-1f);
    life52_270 = (life52_270 * 0x1.666666p-1f);
    life53_272 = (life53_272 * 0x1.666666p-1f);
    }
    life54_293 = (((float) life50_259) / 0x1.8p4f);
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_30)).a(((double)(((life2_214 + (life41_224 * ((double) life54_293))) + 0x0.0p0d))), ((double)(((life4_25 + ((life43_230 * ((double) ((life54_293 * life54_293) + life54_293))) * 0x1.0p-1d)) + ((double) (((0x1.8p4f - ((float) life50_259)) / 0x1.2p4f) + 0x1.0p-3f))))), ((double)((life6_218 + (life45_236 * ((double) life54_293)))))))).a(((float)(life51_268)), ((float)(life52_270)), ((float)(life53_272)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_30)).a(((double)(((life2_214 + (life41_224 * ((double) life54_293))) + 0x1.999999999999ap-6d))), ((double)((((life4_25 + ((life43_230 * ((double) ((life54_293 * life54_293) + life54_293))) * 0x1.0p-1d)) + ((double) (((0x1.8p4f - ((float) life50_259)) / 0x1.2p4f) + 0x1.0p-3f))) + 0x1.999999999999ap-6d))), ((double)((life6_218 + (life45_236 * ((double) life54_293)))))))).a(((float)(life51_268)), ((float)(life52_270)), ((float)(life53_272)), ((float)(0x1.0p0f))))).c__Void();
    life50_259 += 1;
    continue lexical_cycle_254;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(life13_27)).a__Void();
    ((moom.lw)(life14_30)).a(((int)(5)), ((moom.oD)(moom.oB.h)));
    life50_393 = 0;
    lexical_cycle_388: while (true) {
    lexical_join_417: {
    if (!((life50_393 <= __sourceIntrinsic_ab3c258b48ed_invokedynamic1250_63(12405, (3483333848955965142L ^ life10_3))))) {
        break lexical_join_516;
    }
    life51_402 = 0x1.0p-1f;
    life52_404 = 0x1.99999ap-2f;
    life53_406 = 0x1.333334p-2f;
    if (!(((life50_393 % 2) == 0))) {
        break lexical_join_417;
    }
    life51_402 = (life51_402 * 0x1.666666p-1f);
    life52_404 = (life52_404 * 0x1.666666p-1f);
    life53_406 = (life53_406 * 0x1.666666p-1f);
    }
    life54_427 = (((float) life50_393) / 0x1.8p4f);
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_30)).a(((double)(((life2_214 + (life41_224 * ((double) life54_427))) + 0x0.0p0d))), ((double)((((life4_25 + ((life43_230 * ((double) ((life54_427 * life54_427) + life54_427))) * 0x1.0p-1d)) + ((double) (((0x1.8p4f - ((float) life50_393)) / 0x1.2p4f) + 0x1.0p-3f))) + 0x1.999999999999ap-6d))), ((double)((life6_218 + (life45_236 * ((double) life54_427)))))))).a(((float)(life51_402)), ((float)(life52_404)), ((float)(life53_406)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life14_30)).a(((double)(((life2_214 + (life41_224 * ((double) life54_427))) + 0x1.999999999999ap-6d))), ((double)(((life4_25 + ((life43_230 * ((double) ((life54_427 * life54_427) + life54_427))) * 0x1.0p-1d)) + ((double) (((0x1.8p4f - ((float) life50_393)) / 0x1.2p4f) + 0x1.0p-3f))))), ((double)(((life6_218 + (life45_236 * ((double) life54_427))) + 0x1.999999999999ap-6d)))))).a(((float)(life51_402)), ((float)(life52_404)), ((float)(life53_406)), ((float)(0x1.0p0f))))).c__Void();
    life50_393 += 1;
    continue lexical_cycle_388;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(life13_27)).a__Void();
    if (!(moom.BU.ap())) {
        break lexical_join_521;
    }
    moom.MP.ar();
    }
    moom.kZ.e();
    moom.kZ.u();
    moom.kZ.o();
    }
    return;
}


protected boolean b__sourceBridge_55fa5355bc(net.minecraft.entity.EntityLivingBase p0) {
return ((moom.mU)(this)).a__sourceReturn_880eedc176(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0)))));
}


public static void b(int p0) {
B = ((int)(p0));
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8412_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mU.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int n8 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2654;
        if (V[n8] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = U[n8];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])W.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    W.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/mU", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mU.V[n8] = n10;
        }
        return V[n8];
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void a__sourceReturn_cba3585c6d(T p0, float p1) {
long local3 = (moom.mU.M ^ 128048018419378L);
    int local5 = ((net.minecraft.entity.EntityLiving)(p0)).a__Int(((float)(p1)));
    int local6 = (local5 % __sourceIntrinsic_9270d4fc073c_originalDynamicSite1555_2(11513, (6049755287416053855L ^ local3)));
    int local7 = (local5 / __sourceIntrinsic_9270d4fc073c_originalDynamicSite1555_3(14050, (2250083348039907911L ^ local3)));
    __sourceExactCall_9d3d96a90a216c(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) local6))), ((float)(((float) local7))));
    return;
}


public void a(T p0, double p1, double p2, double p3, float p4, float p5) {
__sourceExactCall_b35d2442d1a9b1(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    ((moom.mU)(this)).b(((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


public boolean a(T p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) {
if ((__sourceIntrinsic_booleanComparison(__sourceExactCall_e3e995c5009b28(this, ((net.minecraft.entity.Entity)(p0)), ((net.minecraft.client.renderer.culling.ICamera)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)))) != 0)) {
        return ((1) != 0);
    }
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.EntityLiving)(p0)).T__Boolean()) != 0)) {
        if ((((net.minecraft.entity.EntityLiving)(p0)).c__sourceReturn_09c029d8c3() != null)) {
        java.lang.Object local9 = ((net.minecraft.entity.EntityLiving)(p0)).c__sourceReturn_09c029d8c3();
        return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.renderer.culling.ICamera)(p1)).a(((moom.CA)(((net.minecraft.entity.Entity)(local9)).b()))))) != 0);
    }
    }
    return ((0) != 0);
}


protected boolean a__sourceReturn_880eedc176(T p0) {
int forwardValue3779_18_0;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    if (!(__sourceExactCall_8e6aee2a9f25e0(this, ((net.minecraft.entity.EntityLivingBase)(p0))))) {
        break forward_join_17;
    }
    if (!((!((net.minecraft.entity.EntityLiving)(p0)).C__Boolean()))) {
        break forward_join_15;
    }
    if (!(((net.minecraft.entity.EntityLiving)(p0)).e__Boolean())) {
        break forward_join_17;
    }
    if (!((p0 == ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).f))) {
        break forward_join_17;
    }
    }
    forwardValue3779_18_0 = 1;
    break forward_join_18;
    }
    forwardValue3779_18_0 = 0;
    }
    return ((forwardValue3779_18_0) != 0);
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mU)(this)).a(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected boolean a__Boolean__sourceBridge_13640a2b19(net.minecraft.entity.Entity p0) {
return ((moom.mU)(this)).a__sourceReturn_880eedc176(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0)))));
}


public boolean a__sourceBridge_1c85113431(net.minecraft.entity.Entity p0, net.minecraft.client.renderer.culling.ICamera p1, double p2, double p3, double p4) {
return ((moom.mU)(this)).a(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0)))), ((net.minecraft.client.renderer.culling.ICamera)(p1)), ((double)(p2)), ((double)(p3)), ((double)(p4)));
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mU)(this)).a(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public static int a__sourceReturn_8abf5c6871() {
return moom.mU.B;
}


private double a(double p0, double p1, double p2) {
return (p0 + ((p1 - p0) * p2));
}


private static native <E extends Throwable> int __sourceIntrinsic_ab3c258b48ed_invokedynamic1250_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab3c258b48ed_invokedynamic1250_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab3c258b48ed_invokedynamic1250_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8412_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9270d4fc073c_originalDynamicSite1555_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9270d4fc073c_originalDynamicSite1555_3(int a0, long a1) throws E;

public boolean b(T __bridgeParam0) { return this.b__sourceBridge_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0))); }
public boolean a__Boolean(T __bridgeParam0) { return this.a__Boolean__sourceBridge_13640a2b19(((net.minecraft.entity.Entity)(__bridgeParam0))); }

private static native int __sourceExactCall_06ee73944ae97f();

private static native void __sourceExactCall_9d3d96a90a216c(int p0, float p1, float p2);
private static native void __sourceExactCall_b35d2442d1a9b1(moom.mS p0, net.minecraft.entity.EntityLivingBase p1, double p2, double p3, double p4, float p5, float p6);
private static native boolean __sourceExactCall_e3e995c5009b28(moom.mS p0, net.minecraft.entity.Entity p1, net.minecraft.client.renderer.culling.ICamera p2, double p3, double p4, double p5);
private static native boolean __sourceExactCall_8e6aee2a9f25e0(moom.mS p0, net.minecraft.entity.EntityLivingBase p1);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
