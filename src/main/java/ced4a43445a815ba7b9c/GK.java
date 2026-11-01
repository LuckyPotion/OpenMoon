package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GK extends moom.GD {

private final moom.bI f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public GK(long p0, moom.GD p1, moom.bI p2) {
super(p0);
    this.b = p1;
    this.f = p2;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(7176523161796074009L)), ((long)(-8141296518660933348L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(197688085190239L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.GK.g ^ 54178693102323L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill776_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill776_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill776_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill776_14 = new byte[8];
    (__sourceSpill776_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill776_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation776_16 = __sourceSpill776_14;
    ((javax.crypto.Cipher)(__sourceSpill776_11)).init(((int)(__sourceSpill776_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill776_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation776_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\0322a\tqh\006ìjTö5\022²-b"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill776_25 = local6_life21;
        int __sourceSpill776_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill776_25)).substring(((int)(__sourceSpill776_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill776_30 = local8_life19;
        int __sourceSpill776_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill776_33 = new byte[8];
        (__sourceSpill776_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill776_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill776_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill776_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill776_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill776_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill776_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill776_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill776_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill776_34)).doFinal(((byte[])(__sourceSpill776_33)));
        (__sourceSpill776_30)[__sourceSpill776_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "üPÂ3+Ô¼þÐÎåH\\ý8"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill776_38 = local6_life21;
        int __sourceSpill776_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill776_38)).substring(((int)(__sourceSpill776_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill776_43 = local8_life19;
        int __sourceSpill776_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill776_46 = new byte[8];
        (__sourceSpill776_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill776_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill776_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill776_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill776_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill776_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill776_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill776_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill776_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill776_47)).doFinal(((byte[])(__sourceSpill776_46)));
        (__sourceSpill776_43)[__sourceSpill776_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GK.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22124;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/GK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4636_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private int[] b(int p0, int p1, int p2, int p3) {
int forestValue644_43_0;
    int forestValue644_43_1;
    int forestValue644_155_0;
    int forestValue644_157_0;
    int forestValue644_179_0;
    int forestValue644_181_0;
    int forestValue644_191_0;
    net.minecraft.entity.Entity[] spill644_0;
    int spill644_1;
    int spill644_2;
    int spill644_3;
    int spill644_4;
    int spill644_5;
    int spill644_6;
    int spill644_7;
    int spill644_8;
    int spill644_9;
    int spill644_10;
    int spill644_11;
    int spill644_12;
    long life5_3;
    int life8_8;
    int life9_12;
    int life10_18;
    int life11_24;
    int[] life12_32;
    int[] life13_37;
    int life14_39;
    net.minecraft.entity.Entity[] life7_40;
    int life15_45;
    int life16_70;
    int life17_92;
    int life18_106;
    int life19_120;
    int life20_134;
    int life21_166;
    int life22_198;
    forest_join_206: {
    life5_3 = (moom.GK.g ^ 80453803172263L);
    spill644_0 = moom.GD.b();
    life8_8 = (p0 - 1);
    life9_12 = (p1 - 1);
    life10_18 = ((1 + p2) + 1);
    life11_24 = ((1 + p3) + 1);
    life12_32 = ((moom.GD)(((moom.GK)(this)).b)).a__ArrayInt(((int)(life8_8)), ((int)(life9_12)), ((int)(life10_18)), ((int)(life11_24)));
    life13_37 = moom.GY.a(((int)((p2 * p3))));
    life14_39 = 0;
    life7_40 = spill644_0;
    forest_cycle_41: while (true) {
    forest_join_203: {
    forestValue644_43_0 = life14_39;
    forestValue644_43_1 = p3;
    forest_cycle_43: while (true) {
    if (!((forestValue644_43_0 < forestValue644_43_1))) {
        break forest_join_206;
    }
    life15_45 = 0;
    forest_cycle_46: while (true) {
    forest_join_201: {
    forest_join_192: {
    forest_join_191: {
    forest_join_190: {
    forest_join_181: {
    forest_join_180: {
    forest_join_179: {
    forest_join_178: {
    forest_join_157: {
    forest_join_156: {
    forest_join_155: {
    forest_join_154: {
    if (!((life15_45 < p2))) {
        break forest_join_203;
    }
    ((moom.GK)(this)).a(((long)(((long) (life15_45 + p0)))), ((long)(((long) (life14_39 + p1)))));
    life16_70 = (life12_32)[((life15_45 + 1) + ((life14_39 + 1) * life10_18))];
    if (!((life7_40 != null))) {
        break forest_join_201;
    }
    spill644_1 = life16_70;
    spill644_2 = 1;
    if (!((life7_40 != null))) {
        forestValue644_43_0 = spill644_1;
        forestValue644_43_1 = spill644_2;
        continue forest_cycle_43;
    }
    if (!((spill644_1 == spill644_2))) {
        break forest_join_192;
    }
    life17_92 = (life12_32)[((life15_45 + 1) + (((life14_39 + 1) - 1) * life10_18))];
    life18_106 = (life12_32)[(((life15_45 + 1) + 1) + ((life14_39 + 1) * life10_18))];
    life19_120 = (life12_32)[(((life15_45 + 1) - 1) + ((life14_39 + 1) * life10_18))];
    life20_134 = (life12_32)[((life15_45 + 1) + (((life14_39 + 1) + 1) * life10_18))];
    spill644_3 = life17_92;
    if (!((life7_40 != null))) {
        forestValue644_155_0 = spill644_3;
        break forest_join_155;
    }
    if (!((spill644_3 != 3))) {
        break forest_join_154;
    }
    spill644_4 = life18_106;
    if (!((life7_40 != null))) {
        forestValue644_155_0 = spill644_4;
        break forest_join_155;
    }
    if (!((spill644_4 != 3))) {
        break forest_join_154;
    }
    spill644_5 = life19_120;
    if (!((life7_40 != null))) {
        forestValue644_155_0 = spill644_5;
        break forest_join_155;
    }
    if (!((spill644_5 != 3))) {
        break forest_join_154;
    }
    spill644_6 = life20_134;
    if (!((life7_40 != null))) {
        forestValue644_155_0 = spill644_6;
        break forest_join_155;
    }
    if (!((spill644_6 == 3))) {
        break forest_join_156;
    }
    }
    forestValue644_155_0 = 1;
    }
    forestValue644_157_0 = forestValue644_155_0;
    break forest_join_157;
    }
    forestValue644_157_0 = 0;
    }
    life21_166 = forestValue644_157_0;
    spill644_7 = life17_92;
    if (!((life7_40 != null))) {
        forestValue644_179_0 = spill644_7;
        break forest_join_179;
    }
    if (!((spill644_7 != 4))) {
        break forest_join_178;
    }
    spill644_8 = life18_106;
    if (!((life7_40 != null))) {
        forestValue644_179_0 = spill644_8;
        break forest_join_179;
    }
    if (!((spill644_8 != 4))) {
        break forest_join_178;
    }
    spill644_9 = life19_120;
    if (!((life7_40 != null))) {
        forestValue644_179_0 = spill644_9;
        break forest_join_179;
    }
    if (!((spill644_9 != 4))) {
        break forest_join_178;
    }
    spill644_10 = life20_134;
    if (!((life7_40 != null))) {
        forestValue644_179_0 = spill644_10;
        break forest_join_179;
    }
    if (!((spill644_10 == 4))) {
        break forest_join_180;
    }
    }
    forestValue644_179_0 = 1;
    }
    forestValue644_181_0 = forestValue644_179_0;
    break forest_join_181;
    }
    forestValue644_181_0 = 0;
    }
    life22_198 = forestValue644_181_0;
    spill644_11 = life21_166;
    if (!((life7_40 != null))) {
        forestValue644_191_0 = spill644_11;
        break forest_join_191;
    }
    if (!((spill644_11 == 0))) {
        break forest_join_190;
    }
    spill644_12 = life22_198;
    if (!((life7_40 != null))) {
        forestValue644_191_0 = spill644_12;
        break forest_join_191;
    }
    if (!((spill644_12 != 0))) {
        break forest_join_192;
    }
    }
    forestValue644_191_0 = 2;
    }
    life16_70 = forestValue644_191_0;
    }
    (life13_37)[(life15_45 + (life14_39 * p2))] = life16_70;
    life15_45 += 1;
    }
    if (!((life7_40 == null))) {
        continue forest_cycle_46;
    }
    break forest_cycle_46;
    }
    break forest_cycle_43;
    }
    }
    life14_39 += 1;
    if (!((life7_40 == null))) {
        continue forest_cycle_41;
    }
    break forest_cycle_41;
    }
    }
    return life13_37;
}


private int[] c(int p0, int p1, int p2, int p3) {
int forestValue645_43_0;
    int forestValue645_43_1;
    int forestValue645_145_0;
    int forestValue645_147_0;
    int forestValue645_169_0;
    int forestValue645_171_0;
    int forestValue645_181_0;
    net.minecraft.entity.Entity[] spill645_0;
    int spill645_1;
    int spill645_2;
    int spill645_3;
    int spill645_4;
    int spill645_5;
    int spill645_6;
    int spill645_7;
    int spill645_8;
    int spill645_9;
    int spill645_10;
    int spill645_11;
    int spill645_12;
    long life5_3;
    int life8_7;
    int life9_11;
    int life10_17;
    int life11_24;
    int[] life12_32;
    net.minecraft.entity.Entity[] life7_33;
    int[] life13_38;
    int life14_40;
    int life15_45;
    int life16_60;
    int life17_82;
    int life18_96;
    int life19_110;
    int life20_124;
    int life21_156;
    int life22_188;
    forest_join_196: {
    life5_3 = (moom.GK.g ^ 93300229850563L);
    life8_7 = (p0 - 1);
    life9_11 = (p1 - 1);
    life10_17 = ((1 + p2) + 1);
    spill645_0 = moom.GD.b();
    life11_24 = ((1 + p3) + 1);
    life12_32 = ((moom.GD)(((moom.GK)(this)).b)).a__ArrayInt(((int)(life8_7)), ((int)(life9_11)), ((int)(life10_17)), ((int)(life11_24)));
    life7_33 = spill645_0;
    life13_38 = moom.GY.a(((int)((p2 * p3))));
    life14_40 = 0;
    forest_cycle_41: while (true) {
    forest_join_193: {
    forestValue645_43_0 = life14_40;
    forestValue645_43_1 = p3;
    forest_cycle_43: while (true) {
    if (!((forestValue645_43_0 < forestValue645_43_1))) {
        break forest_join_196;
    }
    life15_45 = 0;
    forest_cycle_46: while (true) {
    forest_join_191: {
    forest_join_182: {
    forest_join_181: {
    forest_join_180: {
    forest_join_171: {
    forest_join_170: {
    forest_join_169: {
    forest_join_168: {
    forest_join_147: {
    forest_join_146: {
    forest_join_145: {
    forest_join_144: {
    if (!((life15_45 < p2))) {
        break forest_join_193;
    }
    life16_60 = (life12_32)[((life15_45 + 1) + ((life14_40 + 1) * life10_17))];
    if (!((life7_33 != null))) {
        break forest_join_191;
    }
    spill645_1 = life16_60;
    spill645_2 = 4;
    if (!((life7_33 != null))) {
        forestValue645_43_0 = spill645_1;
        forestValue645_43_1 = spill645_2;
        continue forest_cycle_43;
    }
    if (!((spill645_1 == spill645_2))) {
        break forest_join_182;
    }
    life17_82 = (life12_32)[((life15_45 + 1) + (((life14_40 + 1) - 1) * life10_17))];
    life18_96 = (life12_32)[(((life15_45 + 1) + 1) + ((life14_40 + 1) * life10_17))];
    life19_110 = (life12_32)[(((life15_45 + 1) - 1) + ((life14_40 + 1) * life10_17))];
    life20_124 = (life12_32)[((life15_45 + 1) + (((life14_40 + 1) + 1) * life10_17))];
    spill645_3 = life17_82;
    if (!((life7_33 != null))) {
        forestValue645_145_0 = spill645_3;
        break forest_join_145;
    }
    if (!((spill645_3 != 2))) {
        break forest_join_144;
    }
    spill645_4 = life18_96;
    if (!((life7_33 != null))) {
        forestValue645_145_0 = spill645_4;
        break forest_join_145;
    }
    if (!((spill645_4 != 2))) {
        break forest_join_144;
    }
    spill645_5 = life19_110;
    if (!((life7_33 != null))) {
        forestValue645_145_0 = spill645_5;
        break forest_join_145;
    }
    if (!((spill645_5 != 2))) {
        break forest_join_144;
    }
    spill645_6 = life20_124;
    if (!((life7_33 != null))) {
        forestValue645_145_0 = spill645_6;
        break forest_join_145;
    }
    if (!((spill645_6 == 2))) {
        break forest_join_146;
    }
    }
    forestValue645_145_0 = 1;
    }
    forestValue645_147_0 = forestValue645_145_0;
    break forest_join_147;
    }
    forestValue645_147_0 = 0;
    }
    life21_156 = forestValue645_147_0;
    spill645_7 = life17_82;
    if (!((life7_33 != null))) {
        forestValue645_169_0 = spill645_7;
        break forest_join_169;
    }
    if (!((spill645_7 != 1))) {
        break forest_join_168;
    }
    spill645_8 = life18_96;
    if (!((life7_33 != null))) {
        forestValue645_169_0 = spill645_8;
        break forest_join_169;
    }
    if (!((spill645_8 != 1))) {
        break forest_join_168;
    }
    spill645_9 = life19_110;
    if (!((life7_33 != null))) {
        forestValue645_169_0 = spill645_9;
        break forest_join_169;
    }
    if (!((spill645_9 != 1))) {
        break forest_join_168;
    }
    spill645_10 = life20_124;
    if (!((life7_33 != null))) {
        forestValue645_169_0 = spill645_10;
        break forest_join_169;
    }
    if (!((spill645_10 == 1))) {
        break forest_join_170;
    }
    }
    forestValue645_169_0 = 1;
    }
    forestValue645_171_0 = forestValue645_169_0;
    break forest_join_171;
    }
    forestValue645_171_0 = 0;
    }
    life22_188 = forestValue645_171_0;
    spill645_11 = life22_188;
    if (!((life7_33 != null))) {
        forestValue645_181_0 = spill645_11;
        break forest_join_181;
    }
    if (!((spill645_11 == 0))) {
        break forest_join_180;
    }
    spill645_12 = life21_156;
    if (!((life7_33 != null))) {
        forestValue645_181_0 = spill645_12;
        break forest_join_181;
    }
    if (!((spill645_12 != 0))) {
        break forest_join_182;
    }
    }
    forestValue645_181_0 = 3;
    }
    life16_60 = forestValue645_181_0;
    }
    (life13_38)[(life15_45 + (life14_40 * p2))] = life16_60;
    life15_45 += 1;
    }
    if (!((life7_33 == null))) {
        continue forest_cycle_46;
    }
    break forest_cycle_46;
    }
    break forest_cycle_43;
    }
    }
    life14_40 += 1;
    if (!((life7_33 == null))) {
        continue forest_cycle_41;
    }
    break forest_cycle_41;
    }
    }
    return life13_38;
}


private int[] d(int p0, int p1, int p2, int p3) {
int forestValue646_22_0;
    int forestValue646_86_0;
    net.minecraft.entity.Entity[] spill646_0;
    int spill646_1;
    int spill646_2;
    long life5_3;
    int[] life8_12;
    net.minecraft.entity.Entity[] life7_13;
    int[] life9_18;
    int life10_20;
    int life11_25;
    int life12_46;
    forest_join_101: {
    life5_3 = (moom.GK.g ^ 66030099809669L);
    spill646_0 = moom.GD.b();
    life8_12 = ((moom.GD)(((moom.GK)(this)).b)).a__ArrayInt(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    life7_13 = spill646_0;
    life9_18 = moom.GY.a(((int)((p2 * p3))));
    life10_20 = 0;
    forest_cycle_21: while (true) {
    forest_join_98: {
    forestValue646_22_0 = life10_20;
    forest_cycle_22: while (true) {
    if (!((forestValue646_22_0 < p3))) {
        break forest_join_101;
    }
    life11_25 = 0;
    forest_cycle_26: while (true) {
    forest_join_96: {
    forest_join_87: {
    forest_join_86: {
    if (!((life11_25 < p2))) {
        break forest_join_98;
    }
    ((moom.GK)(this)).a(((long)(((long) (life11_25 + p0)))), ((long)(((long) (life10_20 + p1)))));
    life12_46 = (life8_12)[(life11_25 + (life10_20 * p2))];
    if (!((life7_13 != null))) {
        break forest_join_96;
    }
    spill646_1 = life12_46;
    if (!((life7_13 != null))) {
        forestValue646_22_0 = spill646_1;
        continue forest_cycle_22;
    }
    if (!((spill646_1 != 0))) {
        break forest_join_87;
    }
    spill646_2 = ((moom.GK)(this)).a(((int)(__sourceIntrinsic_23376739f277_invokedynamic646_6(23663, (5909623011327115818L ^ life5_3)))));
    if (!((life7_13 != null))) {
        forestValue646_86_0 = spill646_2;
        break forest_join_86;
    }
    if (!((spill646_2 == 0))) {
        break forest_join_87;
    }
    forestValue646_86_0 = (life12_46 | (((1 + ((moom.GK)(this)).a(((int)(__sourceIntrinsic_23376739f277_invokedynamic646_8(405, (4641040615144710097L ^ life5_3)))))) << __sourceIntrinsic_23376739f277_invokedynamic646_10(209, (36866987657682582L ^ life5_3))) & __sourceIntrinsic_23376739f277_invokedynamic646_11(30578, (3251774752391375156L ^ life5_3))));
    }
    life12_46 = forestValue646_86_0;
    }
    (life9_18)[(life11_25 + (life10_20 * p2))] = life12_46;
    life11_25 += 1;
    }
    if (!((life7_13 == null))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    break forest_cycle_22;
    }
    }
    life10_20 += 1;
    if (!((life7_13 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    }
    return life9_18;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int[] forwardValue203_34_0;
    int[] spill203_0;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    forward_join_34: {
    forward_join_28: {
    forward_join_21: {
    forward_join_14: {
    life5_3 = (moom.GK.g ^ 28293329885658L);
    life7_5 = moom.GD.b();
    spill203_0 = moom.GX.a;
    if (!((life7_5 != null))) {
        forwardValue203_34_0 = spill203_0;
        break forward_join_34;
    }
    switch ((spill203_0)[((moom.bI)(this.f)).ordinal()]) {
case 1:
default:
{
        break forward_join_14;
    }
case 2:
{
        break forward_join_21;
    }
case 3:
{
        break forward_join_28;
    }
}
    }
    return ((moom.GK)(this)).b(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    return ((moom.GK)(this)).c(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    forwardValue203_34_0 = ((moom.GK)(this)).d(((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    return forwardValue203_34_0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4636_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23376739f277_invokedynamic646_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23376739f277_invokedynamic646_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23376739f277_invokedynamic646_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_23376739f277_invokedynamic646_11(int a0, long a1) throws E;
}
