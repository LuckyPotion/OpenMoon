package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ThePit extends com.moon.module.Module {

private com.moon.setting.MultiSelectSetting<com.moon.bL> s;

private com.moon.nW t;

private com.moon.gF u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

private static long C;

public ThePit(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_dfd96f675524f8db(com.moon.module.impl.ThePit receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.ThePit.v ^ 129855665894178L);

    com.moon.module.impl.ThePit.__sourceConstructorInit_dfd96f675524f8db_0(((com.moon.module.impl.ThePit)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.ThePit)(receiver)).s = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_dfd96f675524f8db_originalDynamicSite1308_2(28451, (4444748851758877461L ^ local5)))), ((java.lang.Class)(com.moon.bL.class))))).a(((java.lang.String)(__sourceIntrinsic_dfd96f675524f8db_originalDynamicSite1308_5(18828, (4902784185662762424L ^ local5)))), ((java.lang.Enum[])(new com.moon.bL[] {com.moon.bL.GOLDEN_HEAD, com.moon.bL.AAA_RATED_STEAK, com.moon.bL.FRACTURED_SOUL, com.moon.bL.RAGE_POTATO}))))).a()));

    ((com.moon.module.impl.ThePit)(receiver)).t = ((com.moon.nW)(new com.moon.nW()));

    ((com.moon.module.impl.ThePit)(receiver)).u = ((com.moon.gF)(new com.moon.gF()));

    return;

}



static {
v = ((long)(((moom._a)(moom._c.a(((long)(5261859600953702910L)), ((long)(5909460298341726833L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(150169539101266L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (com.moon.module.impl.ThePit.v ^ 107785190544188L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill292_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill292_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill292_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill292_14 = new byte[8];
    (__sourceSpill292_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill292_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation292_16 = __sourceSpill292_14;
    ((javax.crypto.Cipher)(__sourceSpill292_11)).init(((int)(__sourceSpill292_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill292_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation292_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[4];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "Í\036YG\013ÓHø3\016wÆrOñÞ(OL!\004Ìc\017Q\nKiåYó\016äïRB ¬l´ý¨jE\0012¼T% ³®Öq="))).length();
    int local21_life24 = 16;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill292_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill292_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill292_29)).doFinal(((byte[])(__sourceSpill292_28)));
        java.lang.String __sourceSpill292_34 = ((java.lang.String)(com.moon.module.impl.ThePit.c(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill292_35 = local25_life19;
        int __sourceSpill292_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill292_35)[__sourceSpill292_36] = __sourceSpill292_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    local24_life23 = ((java.lang.String)((local22_life21 = "+;@«!\0320¦Ù\007}9ëÝ ì\"ZH¼i3È8Íì\016)\b\177jR<À\006áí2f¡ÀÓ%)ëiÅÿÜ(Ùx\005JKv¥ëúÈÈûhY«w\\úÞuÌêByá)QÖÆñ§\004d¸5"))).length();
    local21_life24 = 56;
    local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill292_41 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill292_42 = local18_life9;
        byte[] local26_life44 = ((javax.crypto.Cipher)(__sourceSpill292_42)).doFinal(((byte[])(__sourceSpill292_41)));
        java.lang.String __sourceSpill292_47 = ((java.lang.String)(com.moon.module.impl.ThePit.c(((byte[])(local26_life44))))).intern();
        java.lang.String[] __sourceSpill292_48 = local25_life19;
        int __sourceSpill292_49 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill292_48)[__sourceSpill292_49] = __sourceSpill292_47;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    w = ((java.lang.String[])(local25_life19));
    x = ((java.lang.String[])(new java.lang.String[4]));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life55;
    javax.crypto.Cipher __sourceSpill292_57 = (local5_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill292_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill292_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill292_60 = new byte[8];
    (__sourceSpill292_60)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local6_life61 = 1;
    while ((local6_life61 < 8)) {
        (__sourceSpill292_60)[local6_life61] = ((byte) ((int) ((local16_life7 << (local6_life61 * 8)) >>> 56)));
        local6_life61 += 1;
    }
    byte[] __sourcePreallocation292_62 = __sourceSpill292_60;
    ((javax.crypto.Cipher)(__sourceSpill292_57)).init(((int)(__sourceSpill292_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill292_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation292_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life65 = new long[2];
    int local8_life66 = 0;
    java.lang.String local9_life67;
    int local10_life69 = ((java.lang.String)((local9_life67 = "\001xM8½¡|aÿq9}ý×"))).length();
    int local7_life70 = 0;
    do {
        java.lang.String __sourceSpill292_71 = local9_life67;
        int __sourceSpill292_72 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill292_71)).substring(((int)(__sourceSpill292_72)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill292_76 = local11_life65;
        int __sourceSpill292_77 = local8_life66;
        local8_life66 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill292_79 = new byte[8];
        (__sourceSpill292_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill292_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill292_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill292_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill292_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill292_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill292_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill292_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill292_80 = local5_life55;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill292_80)).doFinal(((byte[])(__sourceSpill292_79)));
        (__sourceSpill292_76)[__sourceSpill292_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    z = ((long[])(local11_life65));
    A = ((java.lang.Integer[])(new java.lang.Integer[2]));
    javax.crypto.Cipher local0_life86;
    javax.crypto.Cipher __sourceSpill292_88 = (local0_life86 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill292_89 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill292_90 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill292_91 = new byte[8];
    (__sourceSpill292_91)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life92 = 1;
    while ((local1_life92 < 8)) {
        (__sourceSpill292_91)[local1_life92] = ((byte) ((int) ((local16_life7 << (local1_life92 * 8)) >>> 56)));
        local1_life92 += 1;
    }
    byte[] __sourcePreallocation292_93 = __sourceSpill292_91;
    ((javax.crypto.Cipher)(__sourceSpill292_88)).init(((int)(__sourceSpill292_89)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill292_90)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation292_93)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life96 = -1822157839369382800L;
    byte[] __sourceSpill292_97 = new byte[8];
    (__sourceSpill292_97)[0] = ((byte) ((int) (local2_life96 >>> 56)));
    (__sourceSpill292_97)[1] = ((byte) ((int) (local2_life96 >>> 48)));
    (__sourceSpill292_97)[2] = ((byte) ((int) (local2_life96 >>> 40)));
    (__sourceSpill292_97)[3] = ((byte) ((int) (local2_life96 >>> 32)));
    (__sourceSpill292_97)[4] = ((byte) ((int) (local2_life96 >>> 24)));
    (__sourceSpill292_97)[5] = ((byte) ((int) (local2_life96 >>> 16)));
    (__sourceSpill292_97)[6] = ((byte) ((int) (local2_life96 >>> 8)));
    (__sourceSpill292_97)[7] = ((byte) ((int) local2_life96));
    javax.crypto.Cipher __sourceSpill292_98 = local0_life86;
    byte[] local4_life100 = ((javax.crypto.Cipher)(__sourceSpill292_98)).doFinal(((byte[])(__sourceSpill292_97)));
    C = ((long)((((((((((((long) (local4_life100)[0]) & 255L) << 56) | ((((long) (local4_life100)[1]) & 255L) << 48)) | ((((long) (local4_life100)[2]) & 255L) << 40)) | ((((long) (local4_life100)[3]) & 255L) << 32)) | ((((long) (local4_life100)[4]) & 255L) << 24)) | ((((long) (local4_life100)[5]) & 255L) << 16)) | ((((long) (local4_life100)[6]) & 255L) << 8)) | (((long) (local4_life100)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_dfd96f675524f8db_0(com.moon.module.impl.ThePit a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

private static java.lang.String c(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill1245_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1245_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1245_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1245_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1245_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1245_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31360);
    if (((com.moon.module.impl.ThePit.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.ThePit.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.ThePit.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lN", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.module.impl.ThePit.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.ThePit.x)[life5_8] = com.moon.module.impl.ThePit.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.ThePit.x)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.ThePit.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2723_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9132;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.ThePit.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2724_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.TickEvent p0) {
com.moon.module.impl.ThePit lexicalValue256_20_0;
    com.moon.module.impl.ThePit lexicalValue256_48_0;
    com.moon.module.impl.ThePit spill256_0;
    com.moon.module.impl.ThePit spill256_1;
    long life2_3;
    java.lang.String life4_5;
    java.util.Set life5_28;
    java.util.Iterator life6_31;
    com.moon.po life7_38;
    com.moon.bL life8_41;
    moom.wB life9_44;
    lexical_join_68: {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_20: {
    lexical_join_19: {
    lexical_join_11: {
    life2_3 = (com.moon.module.impl.ThePit.v ^ 6810713884942L);
    life4_5 = com.moon.bF.b();
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() != com.moon.event.TickPhase.POST))) {
        break lexical_join_11;
    }
    return;
    }
    spill256_0 = this;
    if (!((life4_5 != null))) {
        lexicalValue256_20_0 = spill256_0;
        break lexical_join_20;
    }
    if (!((!((com.moon.nW)(((com.moon.module.impl.ThePit)(spill256_0)).t)).b(((long)(com.moon.module.impl.ThePit.C)))))) {
        break lexical_join_19;
    }
    return;
    }
    lexicalValue256_20_0 = this;
    }
    life5_28 = ((com.moon.module.impl.ThePit)(lexicalValue256_20_0)).a();
    life6_31 = ((java.util.Set)(life5_28)).iterator();
    lexical_cycle_25: while (true) {
    if (!(((java.util.Iterator)(life6_31)).hasNext())) {
        break lexical_join_68;
    }
    life7_38 = ((com.moon.po)(((java.util.Iterator)(life6_31)).next()));
    life8_41 = ((com.moon.po)(life7_38)).a();
    life9_44 = ((com.moon.po)(life7_38)).b();
    spill256_1 = this;
    if (!((life4_5 != null))) {
        lexicalValue256_48_0 = spill256_1;
        break lexical_join_48;
    }
    if (!((!((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.ThePit)(spill256_1)).s)).isSelected(((java.lang.Enum)(life8_41)))))) {
        break lexical_join_47;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue256_48_0 = this;
    }
    ((com.moon.module.impl.ThePit)(lexicalValue256_48_0)).a(((int)(((moom.wB)(life9_44)).c)), ((net.minecraft.item.ItemStack)(((com.moon.po)(life7_38)).c())));
    java.lang.String __stackOp256_21_0 = ((com.moon.bL)(life8_41)).a__String();
    java.lang.String __stackOp256_21_1 = __sourceIntrinsic_be06bc302d53_invokedynamic256_20(13474, (5569236684121696953L ^ life2_3));
    com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_be06bc302d53_invokedynamic256_23(__stackOp256_21_1, __stackOp256_21_0, __sourceIntrinsic_be06bc302d53_invokedynamic256_22(27819, (3266432420941148850L ^ life2_3))))));
    }
    return;
}


private void a(int p0, net.minecraft.item.ItemStack p1) {
long local3 = (com.moon.module.impl.ThePit.v ^ 46562994190140L);
    ((com.moon.gF)(this.u)).a(((int)((p0 - __sourceIntrinsic_7a9ba99d270d_originalDynamicSite538_2(30354, (3467818551014690711L ^ local3))))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ThePit.d)).K)).cm)).a(((moom.yK)(new moom.zb(p1))));
    ((com.moon.gF)(this.u)).c();
    return;
}


private java.util.Set<com.moon.po> a() {
net.minecraft.client.entity.EntityPlayerSP forestValue130_17_0;
    int forestValue130_45_0;
    int forestValue130_45_1;
    int forestValue130_86_0;
    int forestValue130_88_0;
    int forestValue130_105_0;
    moom.wB forestValue130_110_0;
    int forestValue130_147_0;
    int forestValue130_149_0;
    int forestValue130_166_0;
    int forestValue130_171_0;
    int forestValue130_171_1;
    java.lang.String spill130_0;
    net.minecraft.client.entity.EntityPlayerSP spill130_1;
    moom.wB spill130_2;
    int spill130_3;
    int spill130_4;
    int spill130_5;
    int spill130_6;
    int spill130_7;
    int spill130_8;
    moom.wB spill130_9;
    long life1_3;
    java.util.HashSet life4_8;
    java.lang.String life3_9;
    com.moon.bL[] life5_27;
    java.util.Iterator life6_33;
    moom.wB life7_42;
    net.minecraft.item.ItemStack life8_62;
    com.moon.bL[] life9_71;
    int life10_74;
    int life11_76;
    com.moon.bL life12_85;
    int life13_91;
    int life14_111;
    net.minecraft.item.ItemStack life8_144;
    com.moon.bL[] life9_153;
    int life10_156;
    int life11_158;
    com.moon.bL life12_167;
    int life13_173;
    int life14_193;
    forest_join_178: {
    forest_join_21: {
    forest_join_19: {
    forest_join_17: {
    life1_3 = (com.moon.module.impl.ThePit.v ^ 16089794155963L);
    spill130_0 = com.moon.bF.b();
    life4_8 = new java.util.HashSet();
    life3_9 = spill130_0;
    spill130_1 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ThePit.d)).K;
    if (!((life3_9 != null))) {
        forestValue130_17_0 = spill130_1;
        break forest_join_17;
    }
    if (!((spill130_1 != null))) {
        break forest_join_19;
    }
    forestValue130_17_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ThePit.d)).K;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(forestValue130_17_0)).bF == null))) {
        break forest_join_21;
    }
    }
    return life4_8;
    }
    life5_27 = com.moon.bL.values();
    life6_33 = ((java.util.List)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ThePit.d)).K)).bF)).b)).iterator();
    forest_cycle_29: while (true) {
    forest_join_176: {
    forest_join_110: {
    if (!(((java.util.Iterator)(life6_33)).hasNext())) {
        break forest_join_178;
    }
    life7_42 = ((moom.wB)(((java.util.Iterator)(life6_33)).next()));
    spill130_2 = life7_42;
    if (!((life3_9 != null))) {
        forestValue130_110_0 = spill130_2;
        break forest_join_110;
    }
    forestValue130_45_0 = ((moom.wB)(spill130_2)).c;
    forestValue130_45_1 = __sourceIntrinsic_3494b3ee55c6_invokedynamic130_17(21927, (4752091415610510884L ^ life1_3));
    forest_cycle_45: while (true) {
    forest_join_55: {
    forest_join_48: {
    if (!((forestValue130_45_0 < forestValue130_45_1))) {
        break forest_join_48;
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_29;
    }
    }
    life8_62 = ((moom.wB)(life7_42)).a__xW();
    if (!((life8_62 == null))) {
        break forest_join_55;
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_29;
    }
    }
    life9_71 = life5_27;
    life10_74 = (life9_71).length;
    life11_76 = 0;
    forest_cycle_62: while (true) {
    forest_join_107: {
    forest_join_106: {
    forest_join_105: {
    forest_join_88: {
    forest_join_87: {
    forest_join_86: {
    if (!((life11_76 < life10_74))) {
        break forest_join_176;
    }
    life12_85 = (life9_71)[life11_76];
    life13_91 = ((((java.util.function.BiPredicate)(((com.moon.bL)(life12_85)).a__BiPredicate())).test(((java.lang.Object)(com.moon.module.impl.ThePit.d)), ((java.lang.Object)(life8_62)))) ? 1 : 0);
    spill130_3 = ((com.moon.bL)(life12_85)).a();
    if (!((life3_9 != null))) {
        forestValue130_86_0 = spill130_3;
        break forest_join_86;
    }
    spill130_4 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life8_62)).a__wQ())));
    if (!((life3_9 != null))) {
        forestValue130_45_0 = spill130_3;
        forestValue130_45_1 = spill130_4;
        continue forest_cycle_45;
    }
    if (!((spill130_3 == spill130_4))) {
        break forest_join_87;
    }
    forestValue130_86_0 = 1;
    }
    forestValue130_88_0 = forestValue130_86_0;
    break forest_join_88;
    }
    forestValue130_88_0 = 0;
    }
    life14_111 = forestValue130_88_0;
    if (!((life3_9 != null))) {
        break forest_join_107;
    }
    if (!((life13_91 != 0))) {
        break forest_join_106;
    }
    spill130_5 = life14_111;
    if (!((life3_9 != null))) {
        forestValue130_105_0 = spill130_5;
        break forest_join_105;
    }
    if (!((spill130_5 != 0))) {
        break forest_join_106;
    }
    forestValue130_105_0 = ((((java.util.Set)(life4_8)).add(((java.lang.Object)(new com.moon.po(life12_85, life7_42, life8_62))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue130_105_0);
    }
    life11_76 += 1;
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    break forest_cycle_45;
    }
    break forest_join_176;
    }
    forest_cycle_110: while (true) {
    forest_join_174: {
    forest_join_171: {
    forest_join_116: {
    life8_144 = ((moom.wB)(forestValue130_110_0)).a__xW();
    if (!((life8_144 == null))) {
        break forest_join_116;
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_29;
    }
    }
    life9_153 = life5_27;
    life10_156 = (life9_153).length;
    life11_158 = 0;
    forest_cycle_123: while (true) {
    forest_join_168: {
    forest_join_167: {
    forest_join_166: {
    forest_join_149: {
    forest_join_148: {
    forest_join_147: {
    if (!((life11_158 < life10_156))) {
        break forest_join_176;
    }
    life12_167 = (life9_153)[life11_158];
    life13_173 = ((((java.util.function.BiPredicate)(((com.moon.bL)(life12_167)).a__BiPredicate())).test(((java.lang.Object)(com.moon.module.impl.ThePit.d)), ((java.lang.Object)(life8_144)))) ? 1 : 0);
    spill130_6 = ((com.moon.bL)(life12_167)).a();
    if (!((life3_9 != null))) {
        forestValue130_147_0 = spill130_6;
        break forest_join_147;
    }
    spill130_7 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life8_144)).a__wQ())));
    if (!((life3_9 != null))) {
        forestValue130_171_0 = spill130_6;
        forestValue130_171_1 = spill130_7;
        break forest_join_171;
    }
    if (!((spill130_6 == spill130_7))) {
        break forest_join_148;
    }
    forestValue130_147_0 = 1;
    }
    forestValue130_149_0 = forestValue130_147_0;
    break forest_join_149;
    }
    forestValue130_149_0 = 0;
    }
    life14_193 = forestValue130_149_0;
    if (!((life3_9 != null))) {
        break forest_join_168;
    }
    if (!((life13_173 != 0))) {
        break forest_join_167;
    }
    spill130_8 = life14_193;
    if (!((life3_9 != null))) {
        forestValue130_166_0 = spill130_8;
        break forest_join_166;
    }
    if (!((spill130_8 != 0))) {
        break forest_join_167;
    }
    forestValue130_166_0 = ((((java.util.Set)(life4_8)).add(((java.lang.Object)(new com.moon.po(life12_167, life7_42, life8_144))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue130_166_0);
    }
    life11_158 += 1;
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_123;
    }
    break forest_cycle_123;
    }
    break forest_join_176;
    }
    if (!((forestValue130_171_0 < forestValue130_171_1))) {
        break forest_join_174;
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_29;
    }
    }
    spill130_9 = life7_42;
    forestValue130_110_0 = spill130_9;
    continue forest_cycle_110;
    }
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    return life4_8;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dfd96f675524f8db_originalDynamicSite1308_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dfd96f675524f8db_originalDynamicSite1308_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3494b3ee55c6_invokedynamic130_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a9ba99d270d_originalDynamicSite538_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be06bc302d53_invokedynamic256_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be06bc302d53_invokedynamic256_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be06bc302d53_invokedynamic256_23(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2723_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2724_0() throws E;
}
