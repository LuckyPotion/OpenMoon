package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mJ extends net.minecraft.client.renderer.entity.Render<moom.tu> {

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public mJ(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(7310738413722032910L)), ((long)(-4714946066935074452L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(209419678198969L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.mJ.h ^ 63271449496136L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1400_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1400_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1400_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1400_14 = new byte[8];
    (__sourceSpill1400_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1400_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1400_16 = __sourceSpill1400_14;
    ((javax.crypto.Cipher)(__sourceSpill1400_11)).init(((int)(__sourceSpill1400_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1400_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1400_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\020D9%M\037Q_\"âÅÑ\022Õ\0338ù±ß6¯^çe\177uò\022Y3QP¡\017\"\024ÒÇ\016s!¸\000[×dOÈåM§8[\001²imÝ\004\002àÄâýµ³vtÝ 2°/ô\n3"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1400_25 = local6_life21;
        int __sourceSpill1400_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1400_25)).substring(((int)(__sourceSpill1400_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1400_30 = local8_life19;
        int __sourceSpill1400_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1400_33 = new byte[8];
        (__sourceSpill1400_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1400_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1400_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1400_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1400_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1400_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1400_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1400_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1400_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1400_34)).doFinal(((byte[])(__sourceSpill1400_33)));
        (__sourceSpill1400_30)[__sourceSpill1400_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\031×>£¬a+´\000ÒÜ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1400_38 = local6_life21;
        int __sourceSpill1400_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1400_38)).substring(((int)(__sourceSpill1400_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1400_43 = local8_life19;
        int __sourceSpill1400_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1400_46 = new byte[8];
        (__sourceSpill1400_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1400_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1400_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1400_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1400_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1400_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1400_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1400_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1400_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1400_47)).doFinal(((byte[])(__sourceSpill1400_46)));
        (__sourceSpill1400_43)[__sourceSpill1400_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[13]));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16562;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mJ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8385_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected moom.DD a(moom.tu p0) {
return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.tu p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    net.minecraft.client.renderer.Tessellator life12_5;
    moom.lw life13_8;
    double[] life14_25;
    double[] life15_32;
    double life16_34;
    double life18_36;
    java.util.Random life20_42;
    int life21_48;
    int life21_88;
    java.util.Random life22_97;
    int life23_99;
    int life24_108;
    int life25_110;
    double life26_132;
    double life28_138;
    int life30_140;
    double life31_145;
    double life33_147;
    float life35_216;
    float life36_218;
    float life37_220;
    float life38_222;
    double life39_229;
    double life41_247;
    int life43_262;
    double life44_271;
    double life46_277;
    double life48_313;
    double life50_319;
    lexical_join_398: {
    lexical_join_87: {
    life10_3 = (moom.mJ.h ^ 32855138953204L);
    life12_5 = net.minecraft.client.renderer.Tessellator.a();
    life13_8 = ((net.minecraft.client.renderer.Tessellator)(life12_5)).a__lw();
    moom.kZ.v();
    moom.kZ.f();
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_6(21564, (1783195402879426827L ^ life10_3)))), ((int)(1)));
    life14_25 = new double[__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_8(19148, (4494650851652173811L ^ life10_3))];
    life15_32 = new double[__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_9(10520, (4192590295009008685L ^ life10_3))];
    life16_34 = 0x0.0p0d;
    life18_36 = 0x0.0p0d;
    life20_42 = new java.util.Random(((moom.tu)(p0)).aF);
    life21_48 = __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_11(26284, (1134714451422335902L ^ life10_3));
    lexical_cycle_49: while (true) {
    if (!((life21_48 >= 0))) {
        break lexical_join_87;
    }
    (life14_25)[life21_48] = life16_34;
    (life15_32)[life21_48] = life18_36;
    life16_34 = (life16_34 + ((double) (((java.util.Random)(life20_42)).nextInt(((int)(__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_12(18044, (4786662756302648128L ^ life10_3))))) - 5)));
    life18_36 = (life18_36 + ((double) (((java.util.Random)(life20_42)).nextInt(((int)(__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_14(32411, (4907937910854536106L ^ life10_3))))) - 5)));
    life21_48 += -1;
    continue lexical_cycle_49;
    }
    }
    life21_88 = 0;
    lexical_cycle_89: while (true) {
    lexical_join_396: {
    if (!((life21_88 < 4))) {
        break lexical_join_398;
    }
    life22_97 = new java.util.Random(((moom.tu)(p0)).aF);
    life23_99 = 0;
    lexical_cycle_100: while (true) {
    lexical_join_394: {
    lexical_join_127: {
    lexical_join_121: {
    if (!((life23_99 < 3))) {
        break lexical_join_396;
    }
    life24_108 = __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_17(30481, (2875325521530208801L ^ life10_3));
    life25_110 = 0;
    if (!((life23_99 > 0))) {
        break lexical_join_121;
    }
    life24_108 = (__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_18(30481, (2875325521530208801L ^ life10_3)) - life23_99);
    }
    if (!((life23_99 > 0))) {
        break lexical_join_127;
    }
    life25_110 = (life24_108 - 2);
    }
    life26_132 = ((life14_25)[life24_108] - life16_34);
    life28_138 = ((life15_32)[life24_108] - life18_36);
    life30_140 = life24_108;
    lexical_cycle_141: while (true) {
    lexical_join_390: {
    lexical_join_261: {
    lexical_join_241: {
    lexical_join_211: {
    lexical_join_177: {
    if (!((life30_140 >= life25_110))) {
        break lexical_join_394;
    }
    life31_145 = life26_132;
    life33_147 = life28_138;
    if (!((life23_99 == 0))) {
        break lexical_join_177;
    }
    life26_132 = (life26_132 + ((double) (((java.util.Random)(life22_97)).nextInt(((int)(__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_19(32411, (4907937910854536106L ^ life10_3))))) - 5)));
    life28_138 = (life28_138 + ((double) (((java.util.Random)(life22_97)).nextInt(((int)(__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_21(32411, (4907937910854536106L ^ life10_3))))) - 5)));
    break lexical_join_211;
    }
    life26_132 = (life26_132 + ((double) (((java.util.Random)(life22_97)).nextInt(((int)(__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_23(816, (4424098716459808259L ^ life10_3))))) - __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_25(371, (7044828833403548744L ^ life10_3)))));
    life28_138 = (life28_138 + ((double) (((java.util.Random)(life22_97)).nextInt(((int)(__sourceIntrinsic_5adb686b9a7e_invokedynamic1249_26(11113, (1581573886017085021L ^ life10_3))))) - __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_28(24657, (6933271771375195500L ^ life10_3)))));
    }
    ((moom.lw)(life13_8)).a(((int)(5)), ((moom.oD)(moom.oB.h)));
    life35_216 = 0x1.0p-1f;
    life36_218 = 0x1.ccccccp-2f;
    life37_220 = 0x1.ccccccp-2f;
    life38_222 = 0x1.0p-1f;
    life39_229 = (0x1.999999999999ap-4d + (((double) life21_88) * 0x1.999999999999ap-3d));
    if (!((life23_99 == 0))) {
        break lexical_join_241;
    }
    life39_229 = (life39_229 * ((((double) life30_140) * 0x1.999999999999ap-4d) + 0x1.0p0d));
    }
    life41_247 = (0x1.999999999999ap-4d + (((double) life21_88) * 0x1.999999999999ap-3d));
    if (!((life23_99 == 0))) {
        break lexical_join_261;
    }
    life41_247 = (life41_247 * ((((double) (life30_140 - 1)) * 0x1.999999999999ap-4d) + 0x1.0p0d));
    }
    life43_262 = 0;
    lexical_cycle_263: while (true) {
    lexical_join_338: {
    lexical_join_332: {
    lexical_join_326: {
    lexical_join_320: {
    lexical_join_302: {
    lexical_join_296: {
    lexical_join_290: {
    lexical_join_284: {
    if (!((life43_262 < 5))) {
        break lexical_join_390;
    }
    life44_271 = ((p1 + 0x1.0p-1d) - life39_229);
    life46_277 = ((p3 + 0x1.0p-1d) - life39_229);
    if (!((life43_262 != 1))) {
        break lexical_join_284;
    }
    if (!((life43_262 == 2))) {
        break lexical_join_290;
    }
    }
    life44_271 = (life44_271 + (life39_229 * 0x1.0p1d));
    }
    if (!((life43_262 != 2))) {
        break lexical_join_296;
    }
    if (!((life43_262 == 3))) {
        break lexical_join_302;
    }
    }
    life46_277 = (life46_277 + (life39_229 * 0x1.0p1d));
    }
    life48_313 = ((p1 + 0x1.0p-1d) - life41_247);
    life50_319 = ((p3 + 0x1.0p-1d) - life41_247);
    if (!((life43_262 != 1))) {
        break lexical_join_320;
    }
    if (!((life43_262 == 2))) {
        break lexical_join_326;
    }
    }
    life48_313 = (life48_313 + (life41_247 * 0x1.0p1d));
    }
    if (!((life43_262 != 2))) {
        break lexical_join_332;
    }
    if (!((life43_262 == 3))) {
        break lexical_join_338;
    }
    }
    life50_319 = (life50_319 + (life41_247 * 0x1.0p1d));
    }
    ((moom.lw)(((moom.lw)(((moom.lw)(life13_8)).a(((double)((life48_313 + life26_132))), ((double)((p2 + ((double) (life30_140 * __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_31(23661, (4221683813325826395L ^ life10_3))))))), ((double)((life50_319 + life28_138)))))).a(((float)(0x1.ccccccp-2f)), ((float)(0x1.ccccccp-2f)), ((float)(0x1.0p-1f)), ((float)(0x1.333334p-2f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life13_8)).a(((double)((life44_271 + life31_145))), ((double)((p2 + ((double) ((life30_140 + 1) * __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_35(8934, (9158393170023192536L ^ life10_3))))))), ((double)((life46_277 + life33_147)))))).a(((float)(0x1.ccccccp-2f)), ((float)(0x1.ccccccp-2f)), ((float)(0x1.0p-1f)), ((float)(0x1.333334p-2f))))).c__Void();
    life43_262 += 1;
    continue lexical_cycle_263;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(life12_5)).a__Void();
    life30_140 += -1;
    continue lexical_cycle_141;
    }
    }
    life23_99 += 1;
    continue lexical_cycle_100;
    }
    }
    life21_88 += 1;
    continue lexical_cycle_89;
    }
    }
    moom.kZ.k();
    moom.kZ.e();
    moom.kZ.u();
    return;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mJ)(this)).a(((moom.tu)(((moom.tu)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mJ)(this)).a(((moom.tu)(((moom.tu)(p0)))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8385_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5adb686b9a7e_invokedynamic1249_35(int a0, long a1) throws E;


}
