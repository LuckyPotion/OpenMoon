package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GL extends moom.GD {

private static final org.apache.logging.log4j.Logger f;

private final moom.GD g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map l;

public GL(long p0, moom.GD p1, moom.GD p2) {
super(p0);
    this.b = p1;
    this.g = p2;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-470457543238132862L)), ((long)(3694562123416280700L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272656035725415L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.GL.h ^ 75140167134524L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill777_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill777_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill777_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill777_14 = new byte[8];
    (__sourceSpill777_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill777_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation777_16 = __sourceSpill777_14;
    ((javax.crypto.Cipher)(__sourceSpill777_11)).init(((int)(__sourceSpill777_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill777_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation777_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÎxÅå®foÉo­$\030·Ö9Ò*Z¾²~°h"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill777_25 = local6_life21;
        int __sourceSpill777_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill777_25)).substring(((int)(__sourceSpill777_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill777_30 = local8_life19;
        int __sourceSpill777_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill777_33 = new byte[8];
        (__sourceSpill777_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill777_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill777_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill777_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill777_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill777_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill777_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill777_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill777_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill777_34)).doFinal(((byte[])(__sourceSpill777_33)));
        (__sourceSpill777_30)[__sourceSpill777_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "hï[#44á¯­\032@Éïû³"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill777_38 = local6_life21;
        int __sourceSpill777_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill777_38)).substring(((int)(__sourceSpill777_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill777_43 = local8_life19;
        int __sourceSpill777_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill777_46 = new byte[8];
        (__sourceSpill777_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill777_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill777_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill777_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill777_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill777_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill777_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill777_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill777_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill777_47)).doFinal(((byte[])(__sourceSpill777_46)));
        (__sourceSpill777_43)[__sourceSpill777_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[5]));
    f = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GL.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11702;
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
            throw new RuntimeException("moom/GL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4641_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int forestValue647_46_0;
    int forestValue647_106_0;
    int forestValue647_108_0;
    int forestValue647_123_0;
    int forestValue647_191_0;
    int forestValue647_209_0;
    int forestValue647_224_0;
    int forestValue647_224_1;
    int forestValue647_235_0;
    int forestValue647_235_1;
    int forestValue647_246_0;
    int forestValue647_246_1;
    int forestValue647_257_0;
    int forestValue647_257_1;
    int forestValue647_268_0;
    int forestValue647_268_1;
    int forestValue647_279_0;
    int forestValue647_279_1;
    int forestValue647_290_0;
    int forestValue647_290_1;
    int forestValue647_306_0;
    int forestValue647_312_0;
    int forestValue647_312_1;
    int forestValue647_323_0;
    int forestValue647_323_1;
    int forestValue647_334_0;
    int forestValue647_334_1;
    int forestValue647_345_0;
    int forestValue647_345_1;
    int forestValue647_356_0;
    int forestValue647_356_1;
    int forestValue647_367_0;
    int forestValue647_367_1;
    int forestValue647_377_0;
    int forestValue647_403_0;
    int forestValue647_405_0;
    int forestValue647_428_0;
    int forestValue647_430_0;
    int forestValue647_433_0;
    int forestValue647_433_1;
    int forestValue647_459_0;
    int forestValue647_520_0;
    int forestValue647_527_0;
    int forestValue647_534_0;
    int forestValue647_539_0;
    net.minecraft.entity.Entity[] spill647_0;
    int spill647_1;
    int spill647_2;
    int spill647_3;
    int spill647_4;
    int spill647_5;
    int spill647_6;
    int spill647_7;
    int spill647_8;
    int spill647_9;
    boolean spill647_10;
    int spill647_11;
    int spill647_12;
    int spill647_13;
    int spill647_14;
    int spill647_15;
    boolean spill647_16;
    long life5_3;
    int[] life8_20;
    int[] life9_36;
    int[] life10_41;
    net.minecraft.entity.Entity[] life7_42;
    int life11_44;
    int life12_49;
    int life13_76;
    int life14_90;
    int life15_109;
    int life16_228;
    int life17_444;
    int life17_524;
    int life18_540;
    int life19_556;
    int life20_572;
    int life21_574;
    forest_join_565: {
    life5_3 = (moom.GL.h ^ 10799330163555L);
    spill647_0 = moom.GD.b();
    life8_20 = ((moom.GD)(((moom.GL)(this)).b)).a__ArrayInt(((int)((p0 - 1))), ((int)((p1 - 1))), ((int)((p2 + 2))), ((int)((p3 + 2))));
    life9_36 = ((moom.GD)(this.g)).a__ArrayInt(((int)((p0 - 1))), ((int)((p1 - 1))), ((int)((p2 + 2))), ((int)((p3 + 2))));
    life10_41 = moom.GY.a(((int)((p2 * p3))));
    life7_42 = spill647_0;
    life11_44 = 0;
    forest_cycle_45: while (true) {
    forest_join_562: {
    forestValue647_46_0 = life11_44;
    forest_cycle_46: while (true) {
    if (!((forestValue647_46_0 < p3))) {
        break forest_join_565;
    }
    life12_49 = 0;
    forest_cycle_50: while (true) {
    forest_join_559: {
    forest_join_551: {
    forest_join_539: {
    forest_join_538: {
    forest_join_534: {
    forest_join_531: {
    forest_join_527: {
    forest_join_524: {
    forest_join_520: {
    forest_join_517: {
    forest_join_459: {
    forest_join_444: {
    forest_join_433: {
    forest_join_430: {
    forest_join_429: {
    forest_join_428: {
    forest_join_427: {
    forest_join_405: {
    forest_join_404: {
    forest_join_403: {
    forest_join_401: {
    forest_join_377: {
    forest_join_376: {
    forest_join_367: {
    forest_join_364: {
    forest_join_356: {
    forest_join_353: {
    forest_join_345: {
    forest_join_342: {
    forest_join_334: {
    forest_join_331: {
    forest_join_323: {
    forest_join_320: {
    forest_join_312: {
    forest_join_309: {
    forest_join_306: {
    forest_join_304: {
    forest_join_290: {
    forest_join_287: {
    forest_join_279: {
    forest_join_276: {
    forest_join_268: {
    forest_join_265: {
    forest_join_257: {
    forest_join_254: {
    forest_join_246: {
    forest_join_243: {
    forest_join_235: {
    forest_join_232: {
    forest_join_224: {
    forest_join_221: {
    forest_join_209: {
    forest_join_208: {
    forest_join_191: {
    forest_join_188: {
    forest_join_178: {
    forest_join_123: {
    forest_join_122: {
    forest_join_108: {
    forest_join_107: {
    forest_join_106: {
    if (!((life12_49 < p2))) {
        break forest_join_562;
    }
    ((moom.GL)(this)).a(((long)(((long) (life12_49 + p0)))), ((long)(((long) (life11_44 + p1)))));
    life13_76 = (life8_20)[((life12_49 + 1) + ((life11_44 + 1) * (p2 + 2)))];
    life14_90 = (life9_36)[((life12_49 + 1) + ((life11_44 + 1) * (p2 + 2)))];
    spill647_1 = ((life14_90 - 2) % __sourceIntrinsic_7c530025ef13_invokedynamic647_8(8939, (7449492193731205930L ^ life5_3)));
    if (!((life7_42 != null))) {
        forestValue647_46_0 = spill647_1;
        continue forest_cycle_46;
    }
    if (!((life7_42 != null))) {
        forestValue647_106_0 = spill647_1;
        break forest_join_106;
    }
    if (!((spill647_1 == 0))) {
        break forest_join_107;
    }
    forestValue647_106_0 = 1;
    }
    forestValue647_108_0 = forestValue647_106_0;
    break forest_join_108;
    }
    forestValue647_108_0 = 0;
    }
    life15_109 = forestValue647_108_0;
    spill647_2 = life13_76;
    if (!((life7_42 != null))) {
        forestValue647_123_0 = spill647_2;
        break forest_join_123;
    }
    if (!((spill647_2 > __sourceIntrinsic_7c530025ef13_invokedynamic647_9(26785, (5105799155487347045L ^ life5_3))))) {
        break forest_join_122;
    }
    ((org.apache.logging.log4j.Logger)(moom.GL.f)).debug(((java.lang.String)(__sourceIntrinsic_7c530025ef13_invokedynamic647_11(life13_76))));
    }
    forestValue647_123_0 = life13_76;
    }
    if (!((life7_42 != null))) {
        forestValue647_191_0 = forestValue647_123_0;
        break forest_join_191;
    }
    if (!((forestValue647_123_0 != 0))) {
        break forest_join_188;
    }
    spill647_3 = life14_90;
    if (!((life7_42 != null))) {
        forestValue647_191_0 = spill647_3;
        break forest_join_191;
    }
    if (!((spill647_3 >= 2))) {
        break forest_join_188;
    }
    spill647_4 = ((life14_90 - 2) % __sourceIntrinsic_7c530025ef13_invokedynamic647_13(30479, (3706263623907675853L ^ life5_3)));
    if (!((life7_42 != null))) {
        forestValue647_191_0 = spill647_4;
        break forest_join_191;
    }
    if (!((spill647_4 == 1))) {
        break forest_join_188;
    }
    spill647_5 = life13_76;
    if (!((life7_42 != null))) {
        forestValue647_191_0 = spill647_5;
        break forest_join_191;
    }
    if (!((spill647_5 < __sourceIntrinsic_7c530025ef13_invokedynamic647_14(7378, (7825453800479089937L ^ life5_3))))) {
        break forest_join_188;
    }
    if (!((net.minecraft.world.biome.BiomeGenBase.e(((int)((life13_76 + __sourceIntrinsic_7c530025ef13_invokedynamic647_15(31756, (7754677624493114828L ^ life5_3)))))) != null))) {
        break forest_join_178;
    }
    (life10_41)[(life12_49 + (life11_44 * p2))] = (life13_76 + __sourceIntrinsic_7c530025ef13_invokedynamic647_17(31756, (7754677624493114828L ^ life5_3)));
    if (!((life7_42 == null))) {
        break forest_join_559;
    }
    }
    (life10_41)[(life12_49 + (life11_44 * p2))] = life13_76;
    if (!((life7_42 == null))) {
        break forest_join_559;
    }
    }
    forestValue647_191_0 = ((moom.GL)(this)).a(((int)(3)));
    }
    if (!((life7_42 != null))) {
        forestValue647_209_0 = forestValue647_191_0;
        break forest_join_209;
    }
    if (!((forestValue647_191_0 != 0))) {
        break forest_join_208;
    }
    spill647_6 = life15_109;
    if (!((life7_42 != null))) {
        forestValue647_209_0 = spill647_6;
        break forest_join_209;
    }
    if (!((spill647_6 == 0))) {
        break forest_join_208;
    }
    (life10_41)[(life12_49 + (life11_44 * p2))] = life13_76;
    if (!((life7_42 == null))) {
        break forest_join_559;
    }
    }
    forestValue647_209_0 = life13_76;
    }
    life16_228 = forestValue647_209_0;
    spill647_7 = life13_76;
    spill647_8 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.t)).aB;
    if (!((life7_42 != null))) {
        forestValue647_224_0 = spill647_7;
        forestValue647_224_1 = spill647_8;
        break forest_join_224;
    }
    if (!((spill647_7 == spill647_8))) {
        break forest_join_221;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.I)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_224_0 = life13_76;
    forestValue647_224_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.v)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_235_0 = forestValue647_224_0;
        forestValue647_235_1 = forestValue647_224_1;
        break forest_join_235;
    }
    if (!((forestValue647_224_0 == forestValue647_224_1))) {
        break forest_join_232;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.J)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_235_0 = life13_76;
    forestValue647_235_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.S)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_246_0 = forestValue647_235_0;
        forestValue647_246_1 = forestValue647_235_1;
        break forest_join_246;
    }
    if (!((forestValue647_235_0 == forestValue647_235_1))) {
        break forest_join_243;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.T)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_246_0 = life13_76;
    forestValue647_246_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.U)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_257_0 = forestValue647_246_0;
        forestValue647_257_1 = forestValue647_246_1;
        break forest_join_257;
    }
    if (!((forestValue647_246_0 == forestValue647_246_1))) {
        break forest_join_254;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_257_0 = life13_76;
    forestValue647_257_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.w)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_268_0 = forestValue647_257_0;
        forestValue647_268_1 = forestValue647_257_1;
        break forest_join_268;
    }
    if (!((forestValue647_257_0 == forestValue647_257_1))) {
        break forest_join_265;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.K)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_268_0 = life13_76;
    forestValue647_268_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.X)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_279_0 = forestValue647_268_0;
        forestValue647_279_1 = forestValue647_268_1;
        break forest_join_279;
    }
    if (!((forestValue647_268_0 == forestValue647_268_1))) {
        break forest_join_276;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.Y)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_279_0 = life13_76;
    forestValue647_279_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.V)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_290_0 = forestValue647_279_0;
        forestValue647_290_1 = forestValue647_279_1;
        break forest_join_290;
    }
    if (!((forestValue647_279_0 == forestValue647_279_1))) {
        break forest_join_287;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.W)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_290_0 = life13_76;
    forestValue647_290_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_312_0 = forestValue647_290_0;
        forestValue647_312_1 = forestValue647_290_1;
        break forest_join_312;
    }
    if (!((forestValue647_290_0 == forestValue647_290_1))) {
        break forest_join_309;
    }
    spill647_9 = ((moom.GL)(this)).a(((int)(3)));
    if (!((life7_42 != null))) {
        forestValue647_306_0 = spill647_9;
        break forest_join_306;
    }
    if (!((spill647_9 == 0))) {
        break forest_join_304;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.J)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_306_0 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.v)).aB;
    }
    life16_228 = forestValue647_306_0;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_312_0 = life13_76;
    forestValue647_312_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.D)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_323_0 = forestValue647_312_0;
        forestValue647_323_1 = forestValue647_312_1;
        break forest_join_323;
    }
    if (!((forestValue647_312_0 == forestValue647_312_1))) {
        break forest_join_320;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.E)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_323_0 = life13_76;
    forestValue647_323_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.M)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_334_0 = forestValue647_323_0;
        forestValue647_334_1 = forestValue647_323_1;
        break forest_join_334;
    }
    if (!((forestValue647_323_0 == forestValue647_323_1))) {
        break forest_join_331;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.N)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_334_0 = life13_76;
    forestValue647_334_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.r)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_345_0 = forestValue647_334_0;
        forestValue647_345_1 = forestValue647_334_1;
        break forest_join_345;
    }
    if (!((forestValue647_334_0 == forestValue647_334_1))) {
        break forest_join_342;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.P)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_345_0 = life13_76;
    forestValue647_345_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.u)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_356_0 = forestValue647_345_0;
        forestValue647_356_1 = forestValue647_345_1;
        break forest_join_356;
    }
    if (!((forestValue647_345_0 == forestValue647_345_1))) {
        break forest_join_353;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.Z)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_356_0 = life13_76;
    forestValue647_356_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.aa)).aB;
    }
    if (!((life7_42 != null))) {
        forestValue647_367_0 = forestValue647_356_0;
        forestValue647_367_1 = forestValue647_356_1;
        break forest_join_367;
    }
    if (!((forestValue647_356_0 == forestValue647_356_1))) {
        break forest_join_364;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ab)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_367_0 = life13_76;
    forestValue647_367_1 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ad)).aB;
    }
    spill647_10 = moom.GL.a(((int)(forestValue647_367_0)), ((int)(forestValue647_367_1)));
    if (!((life7_42 != null))) {
        forestValue647_377_0 = ((spill647_10) ? 1 : 0);
        break forest_join_377;
    }
    if (!(spill647_10)) {
        break forest_join_376;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.ac)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_377_0 = life13_76;
    }
    if (!((life7_42 != null))) {
        forestValue647_405_0 = forestValue647_377_0;
        break forest_join_405;
    }
    if (!((forestValue647_377_0 == ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.P)).aB))) {
        break forest_join_404;
    }
    spill647_11 = ((moom.GL)(this)).a(((int)(3)));
    if (!((life7_42 != null))) {
        forestValue647_405_0 = spill647_11;
        break forest_join_405;
    }
    if (!((spill647_11 == 0))) {
        break forest_join_404;
    }
    life17_444 = ((moom.GL)(this)).a(((int)(2)));
    spill647_12 = life17_444;
    if (!((life7_42 != null))) {
        forestValue647_403_0 = spill647_12;
        break forest_join_403;
    }
    if (!((spill647_12 == 0))) {
        break forest_join_401;
    }
    life16_228 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.s)).aB;
    if (!((life7_42 == null))) {
        break forest_join_404;
    }
    }
    forestValue647_403_0 = ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.v)).aB;
    }
    life16_228 = forestValue647_403_0;
    }
    forestValue647_405_0 = life15_109;
    }
    if (!((life7_42 != null))) {
        forestValue647_430_0 = forestValue647_405_0;
        break forest_join_430;
    }
    if (!((forestValue647_405_0 != 0))) {
        break forest_join_429;
    }
    spill647_13 = life16_228;
    spill647_14 = life13_76;
    if (!((life7_42 != null))) {
        forestValue647_433_0 = spill647_13;
        forestValue647_433_1 = spill647_14;
        break forest_join_433;
    }
    if (!((spill647_13 != spill647_14))) {
        break forest_join_429;
    }
    spill647_15 = (life16_228 + __sourceIntrinsic_7c530025ef13_invokedynamic647_88(31756, (7754677624493114828L ^ life5_3)));
    if (!((life7_42 != null))) {
        forestValue647_428_0 = spill647_15;
        break forest_join_428;
    }
    if (!((net.minecraft.world.biome.BiomeGenBase.e(((int)(spill647_15))) != null))) {
        break forest_join_427;
    }
    life16_228 += 128;
    if (!((life7_42 == null))) {
        break forest_join_429;
    }
    }
    forestValue647_428_0 = life13_76;
    }
    life16_228 = forestValue647_428_0;
    }
    forestValue647_430_0 = life16_228;
    }
    if (!((life7_42 != null))) {
        forestValue647_459_0 = forestValue647_430_0;
        break forest_join_459;
    }
    forestValue647_433_0 = forestValue647_430_0;
    forestValue647_433_1 = life13_76;
    }
    if (!((forestValue647_433_0 == forestValue647_433_1))) {
        break forest_join_444;
    }
    (life10_41)[(life12_49 + (life11_44 * p2))] = life13_76;
    if (!((life7_42 == null))) {
        break forest_join_559;
    }
    }
    forestValue647_459_0 = (life8_20)[((life12_49 + 1) + (((life11_44 + 1) - 1) * (p2 + 2)))];
    }
    life17_524 = forestValue647_459_0;
    life18_540 = (life8_20)[(((life12_49 + 1) + 1) + ((life11_44 + 1) * (p2 + 2)))];
    life19_556 = (life8_20)[(((life12_49 + 1) - 1) + ((life11_44 + 1) * (p2 + 2)))];
    life20_572 = (life8_20)[((life12_49 + 1) + (((life11_44 + 1) + 1) * (p2 + 2)))];
    life21_574 = 0;
    spill647_16 = moom.GL.a(((int)(life17_524)), ((int)(life13_76)));
    if (!((life7_42 != null))) {
        forestValue647_520_0 = ((spill647_16) ? 1 : 0);
        break forest_join_520;
    }
    if (!(spill647_16)) {
        break forest_join_517;
    }
    life21_574 += 1;
    }
    forestValue647_520_0 = ((moom.GL.a(((int)(life18_540)), ((int)(life13_76)))) ? 1 : 0);
    }
    if (!((life7_42 != null))) {
        forestValue647_527_0 = forestValue647_520_0;
        break forest_join_527;
    }
    if (!((forestValue647_520_0 != 0))) {
        break forest_join_524;
    }
    life21_574 += 1;
    }
    forestValue647_527_0 = ((moom.GL.a(((int)(life19_556)), ((int)(life13_76)))) ? 1 : 0);
    }
    if (!((life7_42 != null))) {
        forestValue647_534_0 = forestValue647_527_0;
        break forest_join_534;
    }
    if (!((forestValue647_527_0 != 0))) {
        break forest_join_531;
    }
    life21_574 += 1;
    }
    forestValue647_534_0 = ((moom.GL.a(((int)(life20_572)), ((int)(life13_76)))) ? 1 : 0);
    }
    if (!((life7_42 != null))) {
        forestValue647_539_0 = forestValue647_534_0;
        break forest_join_539;
    }
    if (!((forestValue647_534_0 != 0))) {
        break forest_join_538;
    }
    life21_574 += 1;
    }
    forestValue647_539_0 = life21_574;
    }
    if (!((forestValue647_539_0 >= 3))) {
        break forest_join_551;
    }
    (life10_41)[(life12_49 + (life11_44 * p2))] = life16_228;
    if (!((life7_42 == null))) {
        break forest_join_559;
    }
    }
    (life10_41)[(life12_49 + (life11_44 * p2))] = life13_76;
    }
    life12_49 += 1;
    if (!((life7_42 == null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    break forest_cycle_46;
    }
    }
    life11_44 += 1;
    if (!((life7_42 == null))) {
        continue forest_cycle_45;
    }
    break forest_cycle_45;
    }
    }
    return life10_41;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic647_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic647_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7c530025ef13_invokedynamic647_11(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic647_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic647_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic647_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic647_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c530025ef13_invokedynamic647_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4641_0() throws E;
}
