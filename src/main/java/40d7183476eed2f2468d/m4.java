package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class m4 extends com.moon.m3 implements com.moon.nh {

private com.moon.nY g;

private com.moon.nY h;

private java.util.List<com.moon.m5> i;

private com.moon.ns j;

private com.moon.module.Module k;

private boolean l;

private boolean m;

private boolean n;

private boolean o;

private com.moon.nu p;

private static long q;

private static java.lang.String[] r;

private static java.lang.String[] s;

private static java.util.Map t;

private static long[] u;

private static java.lang.Integer[] v;

private static java.util.Map w;

private static long[] x;

private static java.lang.Long[] y;

private static java.util.Map z;

public m4(com.moon.ns p0, com.moon.module.Module p1, float p2, float p3, float p4, float p5) { super(0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_2578883dc9ab7e2d(com.moon.m4 receiver, com.moon.ns p0, com.moon.module.Module p1, float p2, float p3, float p4, float p5) throws Throwable {
long local7 = (com.moon.m4.q ^ 108471155812585L);
    com.moon.m4.__sourceConstructorInit_2578883dc9ab7e2d_0(((com.moon.m4)(receiver)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)));
    ((com.moon.m4)(receiver)).g = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_2578883dc9ab7e2d_originalDynamicSite1159_2(351, (8696796060424156571L ^ local7)), com.moon.cj.EASE_IN_OUT_CUBIC)));
    ((com.moon.m4)(receiver)).h = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_2578883dc9ab7e2d_originalDynamicSite1159_5(6365, (8528994449471187992L ^ local7)), com.moon.cj.EASE_IN_SINE_OUT)));
    ((com.moon.m4)(receiver)).i = ((java.util.List)(new java.util.ArrayList()));
    ((com.moon.m4)(receiver)).j = ((com.moon.ns)(p0));
    ((com.moon.m4)(receiver)).k = ((com.moon.module.Module)(p1));
    ((com.moon.nY)(((com.moon.m4)(receiver)).g)).b__Void();
    ((com.moon.nY)(((com.moon.m4)(receiver)).h)).b__Void();
    return;
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(-2393967585591804742L)), ((long)(-4303554209739524707L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193463201627316L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.m4.q ^ 50878324910829L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill235_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill235_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill235_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill235_14 = new byte[8];
    (__sourceSpill235_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill235_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation235_16 = __sourceSpill235_14;
    ((javax.crypto.Cipher)(__sourceSpill235_11)).init(((int)(__sourceSpill235_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill235_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation235_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[4];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "ê>vá,.®t'\035ýë\r&äÙæÐ+B¥\027ÍªR\bÐ\020:¬árÌn{®p¥\020\r"))).length();
    int local27_life24 = 32;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill235_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill235_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill235_29)).doFinal(((byte[])(__sourceSpill235_28)));
        java.lang.String __sourceSpill235_34 = ((java.lang.String)(com.moon.m4.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill235_35 = local31_life19;
        int __sourceSpill235_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill235_35)[__sourceSpill235_36] = __sourceSpill235_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "µ0ÛFq\t¥´Í\004®\177\177cC3{\"Ã·\030-qJoß\rëïÿQÎó®x2x\rÛÔ"))).length();
    local27_life24 = 24;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill235_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill235_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill235_42)).doFinal(((byte[])(__sourceSpill235_41)));
        java.lang.String __sourceSpill235_47 = ((java.lang.String)(com.moon.m4.a(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill235_48 = local31_life19;
        int __sourceSpill235_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill235_48)[__sourceSpill235_49] = __sourceSpill235_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    r = ((java.lang.String[])(local31_life19));
    s = ((java.lang.String[])(new java.lang.String[4]));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill235_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill235_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill235_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill235_60 = new byte[8];
    (__sourceSpill235_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill235_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation235_62 = __sourceSpill235_60;
    ((javax.crypto.Cipher)(__sourceSpill235_57)).init(((int)(__sourceSpill235_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill235_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation235_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[7];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "Ø\033#\020Ô\017Ê#å\023£41)´\004Uðw,m3d6o\001BI¤ó\005´ùqîú"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill235_71 = local15_life67;
        int __sourceSpill235_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill235_71)).substring(((int)(__sourceSpill235_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill235_76 = local17_life65;
        int __sourceSpill235_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill235_79 = new byte[8];
        (__sourceSpill235_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill235_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill235_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill235_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill235_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill235_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill235_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill235_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill235_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill235_80)).doFinal(((byte[])(__sourceSpill235_79)));
        (__sourceSpill235_76)[__sourceSpill235_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "&È¨e(h·h\024\035Ëy"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill235_84 = local15_life67;
        int __sourceSpill235_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill235_84)).substring(((int)(__sourceSpill235_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill235_89 = local17_life65;
        int __sourceSpill235_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill235_92 = new byte[8];
        (__sourceSpill235_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill235_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill235_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill235_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill235_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill235_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill235_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill235_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill235_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill235_93)).doFinal(((byte[])(__sourceSpill235_92)));
        (__sourceSpill235_89)[__sourceSpill235_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    u = ((long[])(local17_life65));
    v = ((java.lang.Integer[])(new java.lang.Integer[7]));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill235_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill235_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill235_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill235_105 = new byte[8];
    (__sourceSpill235_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill235_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation235_107 = __sourceSpill235_105;
    ((javax.crypto.Cipher)(__sourceSpill235_102)).init(((int)(__sourceSpill235_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill235_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation235_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[2];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "GY'VÍiÛX8ýó\006D9"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill235_116 = local4_life112;
        int __sourceSpill235_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill235_116)).substring(((int)(__sourceSpill235_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill235_121 = local6_life110;
        int __sourceSpill235_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill235_124 = new byte[8];
        (__sourceSpill235_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill235_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill235_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill235_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill235_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill235_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill235_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill235_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill235_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill235_125)).doFinal(((byte[])(__sourceSpill235_124)));
        (__sourceSpill235_121)[__sourceSpill235_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    x = ((long[])(local6_life110));
    y = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_2578883dc9ab7e2d_0(com.moon.m4 a0, float a1, float a2, float a3, float a4) throws E;

public void b(int p0, int p1, int p2) {
com.moon.m5 lexicalValue168_32_0;
    com.moon.m4 lexicalValue168_39_0;
    com.moon.m4 spill168_0;
    com.moon.m5 spill168_1;
    long life4_3;
    int life6_5;
    java.util.Iterator life7_17;
    com.moon.m5 life8_24;
    lexical_join_43: {
    lexical_join_39: {
    lexical_join_38: {
    life4_3 = (com.moon.m4.q ^ 4802864188564L);
    life6_5 = moom.n2.c();
    spill168_0 = this;
    if (!((life6_5 != 0))) {
        lexicalValue168_39_0 = spill168_0;
        break lexical_join_39;
    }
    if (!(((com.moon.m4)(spill168_0)).m)) {
        break lexical_join_38;
    }
    life7_17 = ((java.util.List)(this.i)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life7_17)).hasNext())) {
        break lexical_join_38;
    }
    life8_24 = ((com.moon.m5)(((java.util.Iterator)(life7_17)).next()));
    if (!((life6_5 != 0))) {
        break lexical_join_43;
    }
    spill168_1 = life8_24;
    if (!((life6_5 != 0))) {
        lexicalValue168_32_0 = spill168_1;
        break lexical_join_32;
    }
    if (!((!((com.moon.m5)(spill168_1)).c__Boolean()))) {
        break lexical_join_31;
    }
    if (!((life6_5 == 0))) { continue lexical_cycle_15; }
    }
    lexicalValue168_32_0 = life8_24;
    }
    ((com.moon.m5)(lexicalValue168_32_0)).b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_5 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue168_39_0 = this;
    }
    __sourceIntrinsic_d5f89f155b18_call168_10(lexicalValue168_39_0, p0, p1, p2);
    }
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.m4.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2610;
      if (v[var3] == null) {
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
         long var5 = u[var3];
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
         Object[] var9 = (Object[])w.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               w.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/m4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         v[var3] = var15;
      }

      return v[var3];
}


public com.moon.nY b__sourceReturn_aadc0e76ea() {
return this.h;
}


public void b(int p0, int p1) {
float lexicalValue167_47_0;
    int lexicalValue167_88_0;
    com.moon.m5 lexicalValue167_97_0;
    com.moon.m3 lexicalValue167_106_0;
    int spill167_0;
    com.moon.m5 spill167_1;
    float spill167_2;
    com.moon.m5 spill167_3;
    com.moon.m5 spill167_4;
    boolean spill167_5;
    long life3_3;
    moom.ir life6_5;
    float life7_10;
    int life5_13;
    java.util.Iterator life8_17;
    com.moon.m5 life9_24;
    float life10_68;
    float life11_80;
    lexical_join_106: {
    lexical_join_100: {
    life3_3 = (com.moon.m4.q ^ 90100633140855L);
    life6_5 = com.moon.nS.a();
    spill167_0 = moom.n2.c();
    life7_10 = ((float) ((moom.ir)(life6_5)).b__Int());
    ((com.moon.m4)(this)).c__sourceReturn_da8c82d5d4();
    life5_13 = spill167_0;
    life8_17 = ((java.util.List)(this.i)).iterator();
    lexical_cycle_18: while (true) {
    lexical_join_98: {
    lexical_join_97: {
    lexical_join_96: {
    lexical_join_88: {
    lexical_join_80: {
    lexical_join_47: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life8_17)).hasNext())) {
        break lexical_join_100;
    }
    life9_24 = ((com.moon.m5)(((java.util.Iterator)(life8_17)).next()));
    spill167_1 = life9_24;
    if (!((life5_13 != 0))) {
        lexicalValue167_106_0 = spill167_1;
        break lexical_join_106;
    }
    spill167_2 = ((com.moon.m5)(spill167_1)).e();
    if (!((life5_13 != 0))) {
        lexicalValue167_47_0 = spill167_2;
        break lexical_join_47;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill167_2)), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_46;
    }
    spill167_3 = life9_24;
    if (!((life5_13 != 0))) {
        lexicalValue167_97_0 = spill167_3;
        break lexical_join_97;
    }
    if (!(((com.moon.m5)(spill167_3)).c__Boolean())) {
        break lexical_join_96;
    }
    spill167_4 = life9_24;
    if (!((life5_13 != 0))) {
        lexicalValue167_97_0 = spill167_4;
        break lexical_join_97;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.m5)(spill167_4)).e())), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_96;
    }
    }
    lexicalValue167_47_0 = com.moon.m1.b;
    }
    life10_68 = lexicalValue167_47_0;
    life11_80 = ((((com.moon.m5)(life9_24)).b() / life7_10) * (life10_68 - (((com.moon.m5)(life9_24)).e() * life10_68)));
    spill167_5 = ((com.moon.m4)(this)).b__Boolean();
    if (!((life5_13 != 0))) {
        lexicalValue167_88_0 = ((spill167_5) ? 1 : 0);
        break lexical_join_88;
    }
    if (!((!spill167_5))) {
        break lexical_join_80;
    }
    com.moon.hU.a(((float)(((com.moon.m5)(life9_24)).e())));
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life10_68)), ((float)((((com.moon.m5)(life9_24)).e() * life10_68))), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(0x0.0p0f)), ((float)(life11_80)), ((float)(0x0.0p0f)));
    }
    ((com.moon.m5)(life9_24)).b(((int)(p0)), ((int)(p1)));
    if (!((life5_13 != 0))) {
        break lexical_join_98;
    }
    lexicalValue167_88_0 = ((((com.moon.m4)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue167_88_0 == 0))) {
        break lexical_join_96;
    }
    com.moon.hU.d__Void();
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life10_68)), ((float)(life10_68)), ((float)(0x1.0p0f)));
    com.moon.hU.b__Void();
    }
    lexicalValue167_97_0 = life9_24;
    }
    ((com.moon.m5)(lexicalValue167_97_0)).c__sourceReturn_da8c82d5d4();
    }
    if (!((life5_13 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue167_106_0 = ((com.moon.m4)(this)).d(((float)((0x1.7p4f + ((com.moon.m4)(this)).e()))));
    }
    recovery.source.CarrierOps.discard(lexicalValue167_106_0);
    super.b(((int)(p0)), ((int)(p1)));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2117_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean e__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


private float e() {
float lexicalValue171_35_0;
    int spill171_0;
    float spill171_1;
    long life1_3;
    float life4_5;
    java.util.Iterator life5_10;
    int life3_11;
    com.moon.m5 life6_18;
    lexical_join_35: {
    lexical_join_28: {
    life1_3 = (com.moon.m4.q ^ 137540712274338L);
    life4_5 = 0x0.0p0f;
    spill171_0 = moom.n2.c();
    life5_10 = ((java.util.List)(this.i)).iterator();
    life3_11 = spill171_0;
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_28;
    }
    life6_18 = ((com.moon.m5)(((java.util.Iterator)(life5_10)).next()));
    spill171_1 = (life4_5 + ((com.moon.m5)(life6_18)).d());
    if (!((life3_11 != 0))) {
        lexicalValue171_35_0 = spill171_1;
        break lexical_join_35;
    }
    life4_5 = spill171_1;
    if (!((life3_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue171_35_0 = (life4_5 + (0x1.4p2f * ((com.moon.nY)(this.h)).c()));
    }
    return lexicalValue171_35_0;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2119_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean c__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.m4.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1747);
    if (((com.moon.m4.y)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.m4.x)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.m4.z)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.m4.z)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/m4", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.m4.y)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.m4.y)[life3_8])).longValue();
}


public void c(int p0, int p1) {
com.moon.module.Module lexicalValue170_23_0;
    com.moon.module.Module lexicalValue170_42_0;
    java.lang.String lexicalValue170_52_0;
    int lexicalValue170_116_0;
    int lexicalValue170_120_0;
    int lexicalValue170_122_0;
    int lexicalValue170_256_0;
    int lexicalValue170_391_0;
    java.lang.String lexicalValue170_418_0;
    float lexicalValue170_427_0;
    float lexicalValue170_439_0;
    int lexicalValue170_650_0;
    com.moon.nY lexicalValue170_660_0;
    com.moon.nY lexicalValue170_661_0;
    float lexicalValue170_661_1;
    com.moon.m4 lexicalValue170_668_0;
    int lexicalValue170_713_0;
    float lexicalValue170_715_0;
    int lexicalValue170_756_0;
    int lexicalValue170_771_0;
    int lexicalValue170_777_0;
    int lexicalValue170_777_1;
    int lexicalValue170_781_0;
    int lexicalValue170_781_1;
    int lexicalValue170_782_0;
    int lexicalValue170_783_0;
    int lexicalValue170_783_1;
    com.moon.nY lexicalValue170_792_0;
    int lexicalValue170_792_1;
    com.moon.nY lexicalValue170_795_0;
    com.moon.nY lexicalValue170_796_0;
    float lexicalValue170_796_1;
    com.moon.m4 lexicalValue170_804_0;
    int lexicalValue170_804_1;
    com.moon.m4 lexicalValue170_808_0;
    int lexicalValue170_808_1;
    com.moon.m4 lexicalValue170_809_0;
    com.moon.m4 lexicalValue170_810_0;
    int lexicalValue170_810_1;
    com.moon.nY lexicalValue170_821_0;
    float lexicalValue170_821_1;
    float lexicalValue170_821_2;
    int lexicalValue170_821_3;
    com.moon.nY lexicalValue170_825_0;
    float lexicalValue170_825_1;
    float lexicalValue170_825_2;
    int lexicalValue170_825_3;
    com.moon.nY lexicalValue170_826_0;
    float lexicalValue170_826_1;
    float lexicalValue170_826_2;
    com.moon.nY lexicalValue170_827_0;
    float lexicalValue170_827_1;
    float lexicalValue170_827_2;
    int lexicalValue170_827_3;
    int spill170_0;
    com.moon.module.Module spill170_1;
    boolean spill170_2;
    int spill170_3;
    int spill170_4;
    int spill170_5;
    long spill170_6;
    int spill170_7;
    boolean spill170_8;
    com.moon.m4 spill170_9;
    com.moon.nY spill170_10;
    float spill170_11;
    int spill170_12;
    boolean spill170_13;
    float spill170_14;
    boolean spill170_15;
    boolean spill170_16;
    com.moon.nY spill170_17;
    boolean spill170_18;
    com.moon.m4 spill170_19;
    boolean spill170_20;
    com.moon.nY spill170_21;
    float spill170_22;
    float spill170_23;
    boolean spill170_24;
    long life3_3;
    java.lang.String life6_8;
    int life5_9;
    java.lang.String life7_63;
    com.moon.jm life8_68;
    com.moon.jm life9_73;
    float life10_77;
    com.moon.hW life11_82;
    com.moon.hW life12_89;
    com.moon.hW life13_96;
    int life14_142;
    float life15_144;
    int life16_282;
    float life17_291;
    float life18_298;
    com.moon.hW life19_306;
    org.lwjgl.util.vector.Vector2f life20_323;
    org.lwjgl.util.vector.Vector2f life21_339;
    org.lwjgl.util.vector.Vector2f life22_355;
    org.lwjgl.util.vector.Vector2f life23_367;
    org.lwjgl.util.vector.Vector2f life24_375;
    org.lwjgl.util.vector.Vector2f life25_383;
    org.lwjgl.util.vector.Vector2f life26_391;
    java.lang.String life17_447;
    java.lang.String life18_458;
    float life19_469;
    int life20_475;
    float life21_483;
    float life22_485;
    com.moon.hW life23_604;
    float life24_629;
    float life25_645;
    float life26_662;
    float life27_669;
    moom.ir life17_727;
    float life18_731;
    java.util.Iterator life19_737;
    com.moon.m5 life20_744;
    float life21_785;
    float life22_797;
    lexical_join_827: {
    lexical_join_826: {
    lexical_join_825: {
    lexical_join_821: {
    lexical_join_811: {
    lexical_join_810: {
    lexical_join_809: {
    lexical_join_808: {
    lexical_join_804: {
    lexical_join_796: {
    lexical_join_795: {
    lexical_join_792: {
    lexical_join_783: {
    lexical_join_782: {
    lexical_join_781: {
    lexical_join_777: {
    lexical_join_771: {
    lexical_join_769: {
    lexical_join_668: {
    lexical_join_667: {
    lexical_join_661: {
    lexical_join_660: {
    lexical_join_650: {
    lexical_join_641: {
    lexical_join_439: {
    lexical_join_438: {
    lexical_join_427: {
    lexical_join_426: {
    lexical_join_418: {
    lexical_join_417: {
    lexical_join_391: {
    lexical_join_389: {
    lexical_join_256: {
    lexical_join_249: {
    lexical_join_122: {
    lexical_join_121: {
    lexical_join_120: {
    lexical_join_116: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_42: {
    lexical_join_40: {
    lexical_join_23: {
    life3_3 = (com.moon.m4.q ^ 118220108712938L);
    spill170_0 = moom.n2.b();
    life6_8 = ((com.moon.module.Module)(this.k)).getDisplayText();
    life5_9 = spill170_0;
    spill170_1 = this.k;
    if (!((life5_9 == 0))) {
        lexicalValue170_23_0 = spill170_1;
        break lexical_join_23;
    }
    if (!((((com.moon.module.Module)(spill170_1)).getKeyCode() != __sourceIntrinsic_505b8c2844d4_invokedynamic170_6(12545, (6726143568544115239L ^ life3_3))))) {
        break lexical_join_51;
    }
    lexicalValue170_23_0 = this.k;
    }
    if (!((life5_9 == 0))) {
        lexicalValue170_42_0 = lexicalValue170_23_0;
        break lexical_join_42;
    }
    if (!((((com.moon.module.Module)(lexicalValue170_23_0)).getInputSource() == com.moon.module.InputSource.KEYBOARD))) {
        break lexical_join_40;
    }
    java.lang.String __stackOp170_14_0 = org.lwjgl.input.Keyboard.getKeyName(((int)(((com.moon.module.Module)(this.k)).getKeyCode())));
    java.lang.String __stackOp170_14_1 = __sourceIntrinsic_505b8c2844d4_invokedynamic170_13(1503, (8842950581253568687L ^ life3_3));
    lexicalValue170_52_0 = __sourceIntrinsic_505b8c2844d4_invokedynamic170_15(__stackOp170_14_1, __stackOp170_14_0);
    break lexical_join_52;
    }
    lexicalValue170_42_0 = this.k;
    }
    int __stackOp170_19_0 = ((com.moon.module.Module)(lexicalValue170_42_0)).getKeyCode();
    java.lang.String __stackOp170_19_1 = __sourceIntrinsic_505b8c2844d4_invokedynamic170_18(11542, (2480344705959120997L ^ life3_3));
    lexicalValue170_52_0 = __sourceIntrinsic_505b8c2844d4_invokedynamic170_20(__stackOp170_19_1, __stackOp170_19_0);
    break lexical_join_52;
    }
    lexicalValue170_52_0 = "";
    }
    life7_63 = lexicalValue170_52_0;
    life8_68 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life9_73 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life10_77 = ((com.moon.nY)(this.g)).c();
    life11_82 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a();
    life12_89 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life8_68))))).a();
    life13_96 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life9_73))))).a();
    spill170_2 = ((com.moon.m4)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((com.moon.m4)(this)).a())), ((float)(((com.moon.m4)(this)).b())), ((float)(((com.moon.m4)(this)).c())), ((float)(0x1.7p4f)));
    if (!((life5_9 == 0))) {
        lexicalValue170_116_0 = ((spill170_2) ? 1 : 0);
        break lexical_join_116;
    }
    if (!(spill170_2)) {
        break lexical_join_121;
    }
    lexicalValue170_116_0 = ((((com.moon.m4)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((com.moon.ns)(this.j)).a())), ((float)(((com.moon.ns)(this.j)).b())), ((float)(((com.moon.ns)(this.j)).c())), ((float)(((com.moon.ns)(this.j)).d())))) ? 1 : 0);
    }
    if (!((life5_9 == 0))) {
        lexicalValue170_120_0 = lexicalValue170_116_0;
        break lexical_join_120;
    }
    if (!((lexicalValue170_116_0 != 0))) {
        break lexical_join_121;
    }
    lexicalValue170_120_0 = 1;
    }
    lexicalValue170_122_0 = lexicalValue170_120_0;
    break lexical_join_122;
    }
    lexicalValue170_122_0 = 0;
    }
    life14_142 = lexicalValue170_122_0;
    life15_144 = 0x1.7p4f;
    ((com.moon.hW)(life11_82)).a(((com.moon.iX)(com.moon.i2.a(((float)(((com.moon.m4)(this)).a())), ((float)(((com.moon.m4)(this)).b())), ((float)(((com.moon.m4)(this)).c())), ((float)(life15_144)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic170_63(32459, (486433230758438382L ^ life3_3))))))));
    ((com.moon.hW)(life11_82)).a(((com.moon.iX)(com.moon.i2.a(((float)(((com.moon.m4)(this)).a())), ((float)(((com.moon.m4)(this)).b())), ((float)(((com.moon.m4)(this)).c())), ((float)(life15_144)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m4)(this)).a__lS())).a__kX())).getValue())))).intValue()))).a(((float)(life10_77))))).getRGB()))))));
    ((com.moon.jm)(life8_68)).b(((com.moon.hW)(life12_89)), ((java.lang.String)(life6_8)), ((float)(0x1.08p3f)), ((float)((((com.moon.m4)(this)).a() + 0x1.0p3f))), ((float)((((((com.moon.m4)(this)).b() + (life15_144 / 0x1.0p1f)) - (((com.moon.jm)(life8_68)).b(((java.lang.String)(life6_8)), ((float)(0x1.08p3f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_505b8c2844d4_invokedynamic170_81(2004, (3110392851533372661L ^ life3_3))))).a(((float)((0x1.0p0f - life10_77)))))).getRGB())));
    ((com.moon.jm)(life8_68)).b(((com.moon.hW)(life12_89)), ((java.lang.String)(life6_8)), ((float)(0x1.08p3f)), ((float)((((com.moon.m4)(this)).a() + 0x1.0p3f))), ((float)((((((com.moon.m4)(this)).b() + (life15_144 / 0x1.0p1f)) - (((com.moon.jm)(life8_68)).b(((java.lang.String)(life6_8)), ((float)(0x1.08p3f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(-1))).a(((float)(life10_77))))).getRGB())));
    this.o = ((boolean)__sourceIntrinsic_integerToBoolean((life14_142)));
    spill170_3 = life14_142;
    if (!((life5_9 == 0))) {
        lexicalValue170_256_0 = spill170_3;
        break lexical_join_256;
    }
    if (!((spill170_3 != 0))) {
        break lexical_join_249;
    }
    ((com.moon.pk)(((com.moon.module.impl.ClickGUI)(((com.moon.m4)(this)).a__lS())).a__pk())).a(((com.moon.nw)(new com.moon.nw(this.p, p0, p1))));
    }
    ((com.moon.hW)(life11_82)).b();
    lexicalValue170_256_0 = ((((java.util.stream.Stream)(((java.util.List)(this.i)).stream())).anyMatch(((java.util.function.Predicate)(__sourceIntrinsic_505b8c2844d4_invokedynamic170_99())))) ? 1 : 0);
    }
    life16_282 = lexicalValue170_256_0;
    spill170_4 = life16_282;
    if (!((life5_9 == 0))) {
        lexicalValue170_391_0 = spill170_4;
        break lexical_join_391;
    }
    if (!((spill170_4 != 0))) {
        break lexical_join_389;
    }
    life17_291 = 0x1.4p2f;
    spill170_5 = 3685;
    life18_298 = (-0x1.68p6f * ((com.moon.nY)(this.h)).c());
    spill170_6 = (3343472110434620742L ^ life3_3);
    life19_306 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    life20_323 = new org.lwjgl.util.vector.Vector2f(((((com.moon.m4)(this)).a() + ((com.moon.m4)(this)).c()) - 0x1.5p3f), (((com.moon.m4)(this)).b() + (life15_144 / 0x1.0p1f)));
    life21_339 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life20_323)).x + (life17_291 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life20_323)).y + (life17_291 / 0x1.0p1f)));
    life22_355 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life20_323)).x - (life17_291 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life20_323)).y + (life17_291 / 0x1.0p1f)));
    life23_367 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(life20_323)).x, (((org.lwjgl.util.vector.Vector2f)(life20_323)).y - (life17_291 / 0x1.0p1f)));
    life24_375 = ((com.moon.m4)(this)).a(((org.lwjgl.util.vector.Vector2f)(life20_323)), ((org.lwjgl.util.vector.Vector2f)(life23_367)), ((float)((0x1.68p7f + life18_298))));
    life25_383 = ((com.moon.m4)(this)).a(((org.lwjgl.util.vector.Vector2f)(life20_323)), ((org.lwjgl.util.vector.Vector2f)(life22_355)), ((float)((0x1.68p7f + life18_298))));
    life26_391 = ((com.moon.m4)(this)).a(((org.lwjgl.util.vector.Vector2f)(life20_323)), ((org.lwjgl.util.vector.Vector2f)(life21_339)), ((float)((0x1.68p7f + life18_298))));
    ((com.moon.hW)(life19_306)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(life24_375)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life24_375)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life25_383)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life25_383)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life26_391)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life26_391)).y)), ((int)(-1))))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic170_128(spill170_5, spill170_6))));
    spill170_7 = 26904;
    ((com.moon.hW)(life19_306)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic170_131(spill170_7, (1089869743953080895L ^ life3_3)))));
    }
    lexicalValue170_391_0 = ((((java.lang.String)(life7_63)).isEmpty()) ? 1 : 0);
    }
    if (!((life5_9 == 0))) {
        lexicalValue170_650_0 = lexicalValue170_391_0;
        break lexical_join_650;
    }
    if (!((lexicalValue170_391_0 == 0))) {
        break lexical_join_641;
    }
    spill170_8 = ((java.lang.String)(life7_63)).contains(((java.lang.CharSequence)(__sourceIntrinsic_505b8c2844d4_invokedynamic170_135(1765, (1626952998640319383L ^ life3_3)))));
    if (!((life5_9 == 0))) {
        lexicalValue170_650_0 = ((spill170_8) ? 1 : 0);
        break lexical_join_650;
    }
    if (!((!spill170_8))) {
        break lexical_join_641;
    }
    life17_447 = __sourceIntrinsic_505b8c2844d4_invokedynamic170_138(13901, (2712786908359347004L ^ life3_3));
    if (!((((com.moon.module.Module)(this.k)).getInputSource() == com.moon.module.InputSource.KEYBOARD))) {
        break lexical_join_417;
    }
    lexicalValue170_418_0 = "";
    break lexical_join_418;
    }
    lexicalValue170_418_0 = "";
    }
    life18_458 = lexicalValue170_418_0;
    if (!((((com.moon.module.Module)(this.k)).getInputSource() == com.moon.module.InputSource.KEYBOARD))) {
        break lexical_join_426;
    }
    lexicalValue170_427_0 = 0x1.8p0f;
    break lexical_join_427;
    }
    lexicalValue170_427_0 = 0x1.4p1f;
    }
    life19_469 = lexicalValue170_427_0;
    life20_475 = __sourceIntrinsic_505b8c2844d4_invokedynamic170_145(20146, (1472309545480541584L ^ life3_3));
    if (!((life16_282 != 0))) {
        break lexical_join_438;
    }
    lexicalValue170_439_0 = 0x1.3p4f;
    break lexical_join_439;
    }
    lexicalValue170_439_0 = 0x1.6p3f;
    }
    life21_483 = lexicalValue170_439_0;
    life22_485 = 0x1.6p2f;
    ((com.moon.jm)(life8_68)).b(((com.moon.hW)(life12_89)), ((java.lang.String)(life7_63)), ((float)(life22_485)), ((float)((((((((com.moon.m4)(this)).a() + ((com.moon.m4)(this)).c()) - life21_483) - ((com.moon.jm)(life8_68)).a(((java.lang.String)(life7_63)), ((float)(life22_485)))) - ((com.moon.jm)(life8_68)).a(((java.lang.String)(life17_447)), ((float)(0x1.0p2f)))) - ((com.moon.jm)(life9_73)).a(((java.lang.String)(life18_458)), ((float)(life22_485)))))), ((float)((((((com.moon.m4)(this)).b() + (life15_144 / 0x1.0p1f)) - (((com.moon.jm)(life8_68)).b(((java.lang.String)(life7_63)), ((float)(life22_485))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(life20_475)));
    ((com.moon.jm)(life8_68)).b(((com.moon.hW)(life12_89)), ((java.lang.String)(life17_447)), ((float)(0x1.0p2f)), ((float)(((((((com.moon.m4)(this)).a() + ((com.moon.m4)(this)).c()) - life21_483) - ((com.moon.jm)(life8_68)).a(((java.lang.String)(life17_447)), ((float)(0x1.0p2f)))) - ((com.moon.jm)(life9_73)).a(((java.lang.String)(life18_458)), ((float)(life22_485)))))), ((float)((((((com.moon.m4)(this)).b() + (life15_144 / 0x1.0p1f)) - (((com.moon.jm)(life8_68)).b(((java.lang.String)(life17_447)), ((float)(0x1.0p2f))) / 0x1.0p1f)) + 0x1.4p0f))), ((int)(life20_475)));
    ((com.moon.jm)(life9_73)).b(((com.moon.hW)(life13_96)), ((java.lang.String)(life18_458)), ((float)(life22_485)), ((float)((((((com.moon.m4)(this)).a() + ((com.moon.m4)(this)).c()) - life21_483) - ((com.moon.jm)(life9_73)).a(((java.lang.String)(life18_458)), ((float)(life22_485)))))), ((float)((((((com.moon.m4)(this)).b() + (life15_144 / 0x1.0p1f)) - (((com.moon.jm)(life9_73)).b(((java.lang.String)(life18_458)), ((float)(life22_485))) / 0x1.0p1f)) + life19_469))), ((int)(life20_475)));
    life23_604 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life24_629 = ((((((((com.moon.m4)(this)).a() + ((com.moon.m4)(this)).c()) - life21_483) - ((com.moon.jm)(life8_68)).a(((java.lang.String)(life7_63)), ((float)(life22_485)))) - ((com.moon.jm)(life8_68)).a(((java.lang.String)(life17_447)), ((float)(0x1.0p2f)))) - ((com.moon.jm)(life9_73)).a(((java.lang.String)(life18_458)), ((float)(life22_485)))) - 0x1.cp1f);
    life25_645 = (((((com.moon.m4)(this)).b() + (life15_144 / 0x1.0p1f)) - (((com.moon.jm)(life8_68)).b(((java.lang.String)(life7_63)), ((float)(life22_485))) / 0x1.0p1f)) - 0x1.8p1f);
    life26_662 = (((((com.moon.jm)(life8_68)).a(((java.lang.String)(life7_63)), ((float)(life22_485))) + ((com.moon.jm)(life8_68)).a(((java.lang.String)(life17_447)), ((float)(0x1.0p2f)))) + ((com.moon.jm)(life9_73)).a(((java.lang.String)(life18_458)), ((float)(life22_485)))) + 0x1.cp2f);
    life27_669 = (((com.moon.jm)(life8_68)).b(((java.lang.String)(life7_63)), ((float)(life22_485))) + 0x1.8p2f);
    ((com.moon.hW)(life23_604)).a(((com.moon.iX)(com.moon.i3.a(((float)(life24_629)), ((float)(life25_645)), ((float)(life26_662)), ((float)(life27_669)), ((float)(0x1.4p2f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic170_182(13088, (1856351278471555076L ^ life3_3))))))));
    ((com.moon.hW)(life23_604)).b();
    }
    ((com.moon.hW)(life12_89)).b();
    ((com.moon.hW)(life13_96)).b();
    spill170_9 = this;
    if (!((life5_9 == 0))) {
        lexicalValue170_668_0 = spill170_9;
        break lexical_join_668;
    }
    lexicalValue170_650_0 = ((((com.moon.module.Module)(((com.moon.m4)(spill170_9)).k)).isEnabled()) ? 1 : 0);
    }
    if (!((lexicalValue170_650_0 != ((this.l) ? 1 : 0)))) {
        break lexical_join_667;
    }
    spill170_10 = this.g;
    if (!(this.l)) {
        lexicalValue170_660_0 = spill170_10;
        break lexical_join_660;
    }
    lexicalValue170_661_0 = spill170_10;
    lexicalValue170_661_1 = 0x1.0p0f;
    break lexical_join_661;
    }
    lexicalValue170_661_0 = lexicalValue170_660_0;
    lexicalValue170_661_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(lexicalValue170_661_0)).a(((float)(lexicalValue170_661_1)));
    this.l = ((boolean)(((com.moon.module.Module)(this.k)).isEnabled()));
    }
    lexicalValue170_668_0 = this;
    }
    ((com.moon.nY)(((com.moon.m4)(lexicalValue170_668_0)).g)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.l)));
    life17_727 = com.moon.nS.a();
    life18_731 = ((float) ((moom.ir)(life17_727)).b__Int());
    ((com.moon.m4)(this)).c__sourceReturn_da8c82d5d4();
    life19_737 = ((java.util.List)(this.i)).iterator();
    lexical_cycle_686: while (true) {
    lexical_join_764: {
    lexical_join_763: {
    lexical_join_756: {
    lexical_join_748: {
    lexical_join_715: {
    lexical_join_714: {
    lexical_join_713: {
    if (!(((java.util.Iterator)(life19_737)).hasNext())) {
        break lexical_join_769;
    }
    life20_744 = ((com.moon.m5)(((java.util.Iterator)(life19_737)).next()));
    spill170_11 = ((com.moon.m5)(life20_744)).e();
    if (!((life5_9 == 0))) {
        lexicalValue170_715_0 = spill170_11;
        break lexical_join_715;
    }
    spill170_12 = recovery.source.CarrierOps.fcmpl(((float)(spill170_11)), ((float)(0x0.0p0f)));
    if (!((life5_9 == 0))) {
        lexicalValue170_771_0 = spill170_12;
        break lexical_join_771;
    }
    if (!((spill170_12 <= 0))) {
        break lexical_join_714;
    }
    spill170_13 = ((com.moon.m5)(life20_744)).c__Boolean();
    if (!((life5_9 == 0))) {
        lexicalValue170_713_0 = ((spill170_13) ? 1 : 0);
        break lexical_join_713;
    }
    if (!(spill170_13)) {
        break lexical_join_764;
    }
    spill170_14 = ((com.moon.m5)(life20_744)).e();
    if (!((life5_9 == 0))) {
        lexicalValue170_715_0 = spill170_14;
        break lexical_join_715;
    }
    lexicalValue170_713_0 = recovery.source.CarrierOps.fcmpl(((float)(spill170_14)), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue170_713_0 > 0))) {
        break lexical_join_764;
    }
    }
    lexicalValue170_715_0 = com.moon.m1.b;
    }
    life21_785 = lexicalValue170_715_0;
    life22_797 = ((((com.moon.m5)(life20_744)).b() / life18_731) * (life21_785 - (((com.moon.m5)(life20_744)).e() * life21_785)));
    spill170_15 = ((com.moon.m4)(this)).b__Boolean();
    if (!((life5_9 == 0))) {
        lexicalValue170_756_0 = ((spill170_15) ? 1 : 0);
        break lexical_join_756;
    }
    if (!((!spill170_15))) {
        break lexical_join_748;
    }
    com.moon.hU.a(((float)(((com.moon.m5)(life20_744)).e())));
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life21_785)), ((float)((((com.moon.m5)(life20_744)).e() * life21_785))), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(0x0.0p0f)), ((float)(life22_797)), ((float)(0x0.0p0f)));
    }
    ((com.moon.m5)(life20_744)).c(((int)(p0)), ((int)(p1)));
    if (!((life5_9 == 0))) {
        break lexical_join_763;
    }
    lexicalValue170_756_0 = ((((com.moon.m4)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue170_756_0 == 0))) {
        break lexical_join_764;
    }
    com.moon.hU.d__Void();
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life21_785)), ((float)(life21_785)), ((float)(0x1.0p0f)));
    }
    com.moon.hU.b__Void();
    }
    if (!((life5_9 != 0))) { continue lexical_cycle_686; }
    break lexical_cycle_686;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    lexicalValue170_771_0 = ((this.n) ? 1 : 0);
    }
    spill170_16 = this.m;
    if (!((life5_9 == 0))) {
        lexicalValue170_777_0 = lexicalValue170_771_0;
        lexicalValue170_777_1 = ((spill170_16) ? 1 : 0);
        break lexical_join_777;
    }
    if (!(spill170_16)) {
        lexicalValue170_782_0 = lexicalValue170_771_0;
        break lexical_join_782;
    }
    lexicalValue170_777_0 = lexicalValue170_771_0;
    lexicalValue170_777_1 = life16_282;
    }
    if (!((life5_9 == 0))) {
        lexicalValue170_781_0 = lexicalValue170_777_0;
        lexicalValue170_781_1 = lexicalValue170_777_1;
        break lexical_join_781;
    }
    if (!((lexicalValue170_777_1 != 0))) {
        lexicalValue170_782_0 = lexicalValue170_777_0;
        break lexical_join_782;
    }
    lexicalValue170_781_0 = lexicalValue170_777_0;
    lexicalValue170_781_1 = 1;
    }
    lexicalValue170_783_0 = lexicalValue170_781_0;
    lexicalValue170_783_1 = lexicalValue170_781_1;
    break lexical_join_783;
    }
    lexicalValue170_783_0 = lexicalValue170_782_0;
    lexicalValue170_783_1 = 0;
    }
    if (!((lexicalValue170_783_0 != lexicalValue170_783_1))) {
        break lexical_join_811;
    }
    spill170_17 = this.h;
    spill170_18 = this.m;
    if (!((life5_9 == 0))) {
        lexicalValue170_792_0 = spill170_17;
        lexicalValue170_792_1 = ((spill170_18) ? 1 : 0);
        break lexical_join_792;
    }
    if (!(spill170_18)) {
        lexicalValue170_795_0 = spill170_17;
        break lexical_join_795;
    }
    lexicalValue170_792_0 = spill170_17;
    lexicalValue170_792_1 = life16_282;
    }
    if (!((lexicalValue170_792_1 != 0))) {
        lexicalValue170_795_0 = lexicalValue170_792_0;
        break lexical_join_795;
    }
    lexicalValue170_796_0 = lexicalValue170_792_0;
    lexicalValue170_796_1 = 0x1.0p0f;
    break lexical_join_796;
    }
    lexicalValue170_796_0 = lexicalValue170_795_0;
    lexicalValue170_796_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(lexicalValue170_796_0)).a(((float)(lexicalValue170_796_1)));
    spill170_19 = this;
    spill170_20 = this.m;
    if (!((life5_9 == 0))) {
        lexicalValue170_804_0 = spill170_19;
        lexicalValue170_804_1 = ((spill170_20) ? 1 : 0);
        break lexical_join_804;
    }
    if (!(spill170_20)) {
        lexicalValue170_809_0 = spill170_19;
        break lexical_join_809;
    }
    lexicalValue170_804_0 = spill170_19;
    lexicalValue170_804_1 = life16_282;
    }
    if (!((life5_9 == 0))) {
        lexicalValue170_808_0 = lexicalValue170_804_0;
        lexicalValue170_808_1 = lexicalValue170_804_1;
        break lexical_join_808;
    }
    if (!((lexicalValue170_804_1 != 0))) {
        lexicalValue170_809_0 = lexicalValue170_804_0;
        break lexical_join_809;
    }
    lexicalValue170_808_0 = lexicalValue170_804_0;
    lexicalValue170_808_1 = 1;
    }
    lexicalValue170_810_0 = lexicalValue170_808_0;
    lexicalValue170_810_1 = lexicalValue170_808_1;
    break lexical_join_810;
    }
    lexicalValue170_810_0 = lexicalValue170_809_0;
    lexicalValue170_810_1 = 0;
    }
    ((com.moon.m4)(lexicalValue170_810_0)).n = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue170_810_1)));
    }
    spill170_21 = this.h;
    spill170_22 = 0x0.0p0f;
    spill170_23 = 0x1.0p0f;
    spill170_24 = this.m;
    if (!((life5_9 == 0))) {
        lexicalValue170_821_0 = spill170_21;
        lexicalValue170_821_1 = spill170_22;
        lexicalValue170_821_2 = spill170_23;
        lexicalValue170_821_3 = ((spill170_24) ? 1 : 0);
        break lexical_join_821;
    }
    if (!(spill170_24)) {
        lexicalValue170_826_0 = spill170_21;
        lexicalValue170_826_1 = spill170_22;
        lexicalValue170_826_2 = spill170_23;
        break lexical_join_826;
    }
    lexicalValue170_821_0 = spill170_21;
    lexicalValue170_821_1 = spill170_22;
    lexicalValue170_821_2 = spill170_23;
    lexicalValue170_821_3 = life16_282;
    }
    if (!((life5_9 == 0))) {
        lexicalValue170_825_0 = lexicalValue170_821_0;
        lexicalValue170_825_1 = lexicalValue170_821_1;
        lexicalValue170_825_2 = lexicalValue170_821_2;
        lexicalValue170_825_3 = lexicalValue170_821_3;
        break lexical_join_825;
    }
    if (!((lexicalValue170_821_3 != 0))) {
        lexicalValue170_826_0 = lexicalValue170_821_0;
        lexicalValue170_826_1 = lexicalValue170_821_1;
        lexicalValue170_826_2 = lexicalValue170_821_2;
        break lexical_join_826;
    }
    lexicalValue170_825_0 = lexicalValue170_821_0;
    lexicalValue170_825_1 = lexicalValue170_821_1;
    lexicalValue170_825_2 = lexicalValue170_821_2;
    lexicalValue170_825_3 = 1;
    }
    lexicalValue170_827_0 = lexicalValue170_825_0;
    lexicalValue170_827_1 = lexicalValue170_825_1;
    lexicalValue170_827_2 = lexicalValue170_825_2;
    lexicalValue170_827_3 = lexicalValue170_825_3;
    break lexical_join_827;
    }
    lexicalValue170_827_0 = lexicalValue170_826_0;
    lexicalValue170_827_1 = lexicalValue170_826_1;
    lexicalValue170_827_2 = lexicalValue170_826_2;
    lexicalValue170_827_3 = 0;
    }
    ((com.moon.nY)(lexicalValue170_827_0)).a(((float)(lexicalValue170_827_1)), ((float)(lexicalValue170_827_2)), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue170_827_3))));
    super.c(((int)(p0)), ((int)(p1)));
    return;
}


private void c__sourceReturn_da8c82d5d4() {
int spill169_0;
    long life1_3;
    float life4_9;
    int life3_10;
    java.util.Iterator life5_14;
    com.moon.m5 life6_21;
    lexical_join_38: {
    life1_3 = (com.moon.m4.q ^ 139425350803812L);
    spill169_0 = moom.n2.c();
    life4_9 = (((com.moon.m4)(this)).b() + 0x1.7p4f);
    life3_10 = spill169_0;
    life5_14 = ((java.util.List)(this.i)).iterator();
    lexical_cycle_15: while (true) {
    if (!(((java.util.Iterator)(life5_14)).hasNext())) {
        break lexical_join_38;
    }
    life6_21 = ((com.moon.m5)(((java.util.Iterator)(life5_14)).next()));
    ((com.moon.m5)(life6_21)).a(((float)(((com.moon.m4)(this)).a())));
    ((com.moon.m5)(life6_21)).b(((float)(life4_9)));
    life4_9 = (life4_9 + ((com.moon.m5)(life6_21)).d());
    if (!((life3_10 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


public boolean d__sourceReturn_aae029aa0a() {
return ((((this.n) ? 1 : 0)) != 0);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27750);
    if (((com.moon.m4.s)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.m4.t)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.m4.t)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/m4", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.m4.r)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.m4.s)[life5_8] = com.moon.m4.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.m4.s)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2124_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.m4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void() {
int spill31_0;
    long life1_3;
    float life4_9;
    int life3_10;
    java.util.List life5_14;
    java.util.Iterator life6_17;
    com.moon.setting.Setting life7_26;
    com.moon.m5 life8_40;
    forest_join_244: {
    forest_join_233: {
    life1_3 = (com.moon.m4.q ^ 55155891542650L);
    spill31_0 = moom.n2.c();
    life4_9 = (((com.moon.m4)(this)).b() + 0x1.7p4f);
    life3_10 = spill31_0;
    life5_14 = ((com.moon.module.Module)(((com.moon.m4)(this)).a__sourceReturn_f255dfbd31())).getSettings();
    life6_17 = ((java.util.List)(life5_14)).iterator();
    forest_cycle_18: while (true) {
    forest_join_231: {
    forest_join_219: {
    forest_join_207: {
    forest_join_194: {
    forest_join_180: {
    forest_join_166: {
    forest_join_152: {
    forest_join_138: {
    forest_join_124: {
    forest_join_110: {
    forest_join_96: {
    forest_join_82: {
    forest_join_68: {
    forest_join_54: {
    forest_join_40: {
    forest_join_32: {
    if (!(((java.util.Iterator)(life6_17)).hasNext())) {
        break forest_join_233;
    }
    life7_26 = ((com.moon.setting.Setting)(((java.util.Iterator)(life6_17)).next()));
    if (!((life3_10 != 0))) {
        break forest_join_244;
    }
    if (!(((com.moon.setting.Setting)(life7_26)).isGrouped())) {
        break forest_join_32;
    }
    if (!((life3_10 == 0))) {
        continue forest_cycle_18;
    }
    }
    life8_40 = null;
    switch ((com.moon.ni.a)[((com.moon.cf)(((com.moon.setting.Setting)(life7_26)).getType())).ordinal()]) {
case 1:
{
        break forest_join_40;
    }
case 2:
{
        break forest_join_54;
    }
case 3:
{
        break forest_join_68;
    }
case 4:
{
        break forest_join_82;
    }
case 5:
{
        break forest_join_96;
    }
case 6:
{
        break forest_join_110;
    }
case 7:
{
        break forest_join_124;
    }
case 8:
{
        break forest_join_138;
    }
case 9:
{
        break forest_join_152;
    }
case 10:
{
        break forest_join_166;
    }
case 11:
{
        break forest_join_180;
    }
case 12:
{
        break forest_join_194;
    }
default:
{
        break forest_join_207;
    }
}
    }
    life8_40 = new com.moon.m7(this, ((com.moon.setting.BooleanSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.28p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.ng(this, ((com.moon.setting.IntegerSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.6p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.nf(this, ((com.moon.setting.FloatSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.6p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.nd(this, ((com.moon.setting.EnumSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.3p5f);
    break forest_join_207;
    }
    life8_40 = new com.moon.nc(this, ((com.moon.setting.ModeSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.3p5f);
    break forest_join_207;
    }
    life8_40 = new com.moon.nb(this, ((com.moon.setting.SettingGroup)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.78p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.ne(this, ((com.moon.setting.MultiSelectSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.9p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.m9(this, ((com.moon.setting.ColorSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.6p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.na(this, ((com.moon.k5)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.f8p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.m8(this, ((com.moon.setting.ButtonSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.6p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.m6(this, ((com.moon.setting.BezierSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.6p4f);
    break forest_join_207;
    }
    life8_40 = new com.moon.m_(this, ((com.moon.setting.StringListSetting)(life7_26)), ((com.moon.m4)(this)).a(), life4_9, ((com.moon.m4)(this)).c(), 0x1.3p5f);
    }
    if (!((life8_40 != null))) {
        break forest_join_231;
    }
    if (!((((com.moon.setting.Setting)(life7_26)).getDescription() != null))) {
        break forest_join_219;
    }
    ((com.moon.m5)(life8_40)).a(((com.moon.nv)(new com.moon.nv(life8_40))));
    }
    ((com.moon.m5)(life8_40)).a__Void();
    ((java.util.List)(this.i)).add(((java.lang.Object)(life8_40)));
    life4_9 = (life4_9 + ((com.moon.m5)(life8_40)).f());
    }
    if (!((life3_10 == 0))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    this.p = ((com.moon.nu)(new com.moon.nu(this)));
    ((com.moon.nY)(this.g)).b__Void();
    super.a__Void();
    }
    return;
}


public void a(int p0, int p1) {
int lexicalValue163_238_0;
    float lexicalValue163_240_0;
    int lexicalValue163_281_0;
    int spill163_0;
    int spill163_1;
    long spill163_2;
    int spill163_3;
    float spill163_4;
    boolean spill163_5;
    float spill163_6;
    boolean spill163_7;
    long life3_3;
    float life6_7;
    java.lang.String life7_12;
    com.moon.jm life8_17;
    com.moon.hW life9_24;
    int life5_25;
    int life10_65;
    float life11_69;
    float life12_76;
    com.moon.hW life13_84;
    org.lwjgl.util.vector.Vector2f life14_99;
    org.lwjgl.util.vector.Vector2f life15_115;
    org.lwjgl.util.vector.Vector2f life16_131;
    org.lwjgl.util.vector.Vector2f life17_143;
    org.lwjgl.util.vector.Vector2f life18_151;
    org.lwjgl.util.vector.Vector2f life19_159;
    org.lwjgl.util.vector.Vector2f life20_167;
    moom.ir life11_202;
    float life12_206;
    java.util.Iterator life13_210;
    com.moon.m5 life14_217;
    float life15_258;
    float life16_270;
    lexical_join_300: {
    lexical_join_295: {
    lexical_join_291: {
    lexical_join_201: {
    life3_3 = (com.moon.m4.q ^ 66811733364208L);
    life6_7 = ((com.moon.nY)(this.g)).c();
    spill163_0 = moom.n2.c();
    life7_12 = ((com.moon.module.Module)(this.k)).getDisplayText();
    life8_17 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life9_24 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life8_17))))).a();
    life5_25 = spill163_0;
    ((com.moon.jm)(life8_17)).b(((com.moon.hW)(life9_24)), ((java.lang.String)(life7_12)), ((float)(0x1.08p3f)), ((float)((((com.moon.m4)(this)).a() + 0x1.0p3f))), ((float)((((((com.moon.m4)(this)).b() + 0x1.7p3f) - (((com.moon.jm)(life8_17)).b(((java.lang.String)(life7_12)), ((float)(0x1.08p3f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))).a(((float)((life6_7 * 0x1.666666p-1f)))))).getRGB())));
    ((com.moon.hW)(life9_24)).b();
    life10_65 = ((((java.util.stream.Stream)(((java.util.List)(this.i)).stream())).anyMatch(((java.util.function.Predicate)(__sourceIntrinsic_fd0ba049c90e_invokedynamic163_26())))) ? 1 : 0);
    if (!((life10_65 != 0))) {
        break lexical_join_201;
    }
    life11_69 = 0x1.4p2f;
    spill163_1 = 26904;
    life12_76 = (-0x1.68p6f * ((com.moon.nY)(this.h)).c());
    spill163_2 = (1089776033910191141L ^ life3_3);
    life13_84 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    life14_99 = new org.lwjgl.util.vector.Vector2f(((((com.moon.m4)(this)).a() + ((com.moon.m4)(this)).c()) - 0x1.5p3f), (((com.moon.m4)(this)).b() + 0x1.7p3f));
    life15_115 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life14_99)).x + (life11_69 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life14_99)).y + (life11_69 / 0x1.0p1f)));
    life16_131 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life14_99)).x - (life11_69 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life14_99)).y + (life11_69 / 0x1.0p1f)));
    life17_143 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(life14_99)).x, (((org.lwjgl.util.vector.Vector2f)(life14_99)).y - (life11_69 / 0x1.0p1f)));
    life18_151 = ((com.moon.m4)(this)).a(((org.lwjgl.util.vector.Vector2f)(life14_99)), ((org.lwjgl.util.vector.Vector2f)(life17_143)), ((float)((0x1.68p7f + life12_76))));
    life19_159 = ((com.moon.m4)(this)).a(((org.lwjgl.util.vector.Vector2f)(life14_99)), ((org.lwjgl.util.vector.Vector2f)(life16_131)), ((float)((0x1.68p7f + life12_76))));
    life20_167 = ((com.moon.m4)(this)).a(((org.lwjgl.util.vector.Vector2f)(life14_99)), ((org.lwjgl.util.vector.Vector2f)(life15_115)), ((float)((0x1.68p7f + life12_76))));
    ((com.moon.hW)(life13_84)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(life18_151)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life18_151)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life19_159)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life19_159)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life20_167)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life20_167)).y)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))).a(((float)(life6_7))))).getRGB()))))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic163_59(spill163_1, spill163_2))));
    spill163_3 = 26904;
    ((com.moon.hW)(life13_84)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic163_62(spill163_3, (1089776033910191141L ^ life3_3)))));
    }
    life11_202 = com.moon.nS.a();
    life12_206 = ((float) ((moom.ir)(life11_202)).b__Int());
    life13_210 = ((java.util.List)(this.i)).iterator();
    lexical_cycle_211: while (true) {
    lexical_join_289: {
    lexical_join_288: {
    lexical_join_281: {
    lexical_join_273: {
    lexical_join_240: {
    lexical_join_239: {
    lexical_join_238: {
    if (!(((java.util.Iterator)(life13_210)).hasNext())) {
        break lexical_join_291;
    }
    life14_217 = ((com.moon.m5)(((java.util.Iterator)(life13_210)).next()));
    if (!((life5_25 != 0))) {
        break lexical_join_295;
    }
    spill163_4 = ((com.moon.m5)(life14_217)).e();
    if (!((life5_25 != 0))) {
        lexicalValue163_240_0 = spill163_4;
        break lexical_join_240;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill163_4)), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_239;
    }
    spill163_5 = ((com.moon.m5)(life14_217)).c__Boolean();
    if (!((life5_25 != 0))) {
        lexicalValue163_238_0 = ((spill163_5) ? 1 : 0);
        break lexical_join_238;
    }
    if (!(spill163_5)) {
        break lexical_join_289;
    }
    spill163_6 = ((com.moon.m5)(life14_217)).e();
    if (!((life5_25 != 0))) {
        lexicalValue163_240_0 = spill163_6;
        break lexical_join_240;
    }
    lexicalValue163_238_0 = recovery.source.CarrierOps.fcmpl(((float)(spill163_6)), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue163_238_0 > 0))) {
        break lexical_join_289;
    }
    }
    lexicalValue163_240_0 = com.moon.m1.b;
    }
    life15_258 = lexicalValue163_240_0;
    life16_270 = ((((com.moon.m5)(life14_217)).b() / life12_206) * (life15_258 - (((com.moon.m5)(life14_217)).e() * life15_258)));
    spill163_7 = ((com.moon.m4)(this)).b__Boolean();
    if (!((life5_25 != 0))) {
        lexicalValue163_281_0 = ((spill163_7) ? 1 : 0);
        break lexical_join_281;
    }
    if (!((!spill163_7))) {
        break lexical_join_273;
    }
    com.moon.hU.a(((float)(((com.moon.m5)(life14_217)).e())));
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life15_258)), ((float)((((com.moon.m5)(life14_217)).e() * life15_258))), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(0x0.0p0f)), ((float)(life16_270)), ((float)(0x0.0p0f)));
    }
    ((com.moon.m5)(life14_217)).a(((int)(p0)), ((int)(p1)));
    if (!((life5_25 != 0))) {
        break lexical_join_288;
    }
    lexicalValue163_281_0 = ((((com.moon.m4)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue163_281_0 == 0))) {
        break lexical_join_289;
    }
    com.moon.hU.d__Void();
    com.moon.hU.a__Void();
    com.moon.hU.a(((float)(life15_258)), ((float)(life15_258)), ((float)(0x1.0p0f)));
    }
    com.moon.hU.b__Void();
    }
    if (!((life5_25 == 0))) { continue lexical_cycle_211; }
    break lexical_cycle_211;
    }
    }
    super.a(((int)(p0)), ((int)(p1)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_300;
    }
    life5_25 += 1;
    moom.n2.b(((int)(life5_25)));
    }
    return;
}


public void a(int p0, int p1, int p2) {
com.moon.module.Module lexicalValue164_34_0;
    int lexicalValue164_38_0;
    com.moon.m4 lexicalValue164_49_0;
    int lexicalValue164_49_1;
    com.moon.m4 lexicalValue164_50_0;
    com.moon.m4 lexicalValue164_51_0;
    int lexicalValue164_51_1;
    int lexicalValue164_56_0;
    com.moon.m5 lexicalValue164_78_0;
    com.moon.m4 lexicalValue164_85_0;
    boolean spill164_0;
    int spill164_1;
    com.moon.module.Module spill164_2;
    com.moon.m4 spill164_3;
    boolean spill164_4;
    com.moon.m4 spill164_5;
    com.moon.m5 spill164_6;
    long life4_3;
    int life6_5;
    java.util.Iterator life7_92;
    com.moon.m5 life8_99;
    lexical_join_89: {
    lexical_join_85: {
    lexical_join_84: {
    lexical_join_56: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_34: {
    lexical_join_32: {
    life4_3 = (com.moon.m4.q ^ 71234218230708L);
    life6_5 = moom.n2.b();
    spill164_0 = ((com.moon.m4)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((com.moon.m4)(this)).a())), ((float)(((com.moon.m4)(this)).b())), ((float)(((com.moon.m4)(this)).c())), ((float)(0x1.7p4f)));
    if (!((life6_5 == 0))) {
        lexicalValue164_56_0 = ((spill164_0) ? 1 : 0);
        break lexical_join_56;
    }
    if (!(spill164_0)) {
        break lexical_join_52;
    }
    spill164_1 = p2;
    if (!((life6_5 == 0))) {
        lexicalValue164_38_0 = spill164_1;
        break lexical_join_38;
    }
    if (!((spill164_1 == 0))) {
        break lexical_join_37;
    }
    spill164_2 = this.k;
    if (!((life6_5 == 0))) {
        lexicalValue164_34_0 = spill164_2;
        break lexical_join_34;
    }
    if (!((((java.lang.Object)(spill164_2)).getClass() == com.moon.module.impl.ClickGUI.class))) {
        break lexical_join_32;
    }
    return;
    }
    lexicalValue164_34_0 = this.k;
    }
    ((com.moon.module.Module)(lexicalValue164_34_0)).toggle();
    if (!((life6_5 != 0))) {
        break lexical_join_52;
    }
    }
    lexicalValue164_38_0 = p2;
    }
    if (!((life6_5 == 0))) {
        lexicalValue164_56_0 = lexicalValue164_38_0;
        break lexical_join_56;
    }
    if (!((lexicalValue164_38_0 == 1))) {
        break lexical_join_52;
    }
    spill164_3 = this;
    spill164_4 = this.m;
    if (!((life6_5 == 0))) {
        lexicalValue164_49_0 = spill164_3;
        lexicalValue164_49_1 = ((spill164_4) ? 1 : 0);
        break lexical_join_49;
    }
    if (!((!spill164_4))) {
        lexicalValue164_50_0 = spill164_3;
        break lexical_join_50;
    }
    lexicalValue164_49_0 = spill164_3;
    lexicalValue164_49_1 = 1;
    }
    lexicalValue164_51_0 = lexicalValue164_49_0;
    lexicalValue164_51_1 = lexicalValue164_49_1;
    break lexical_join_51;
    }
    lexicalValue164_51_0 = lexicalValue164_50_0;
    lexicalValue164_51_1 = 0;
    }
    ((com.moon.m4)(lexicalValue164_51_0)).m = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue164_51_1)));
    }
    spill164_5 = this;
    if (!((life6_5 == 0))) {
        lexicalValue164_85_0 = spill164_5;
        break lexical_join_85;
    }
    lexicalValue164_56_0 = ((((com.moon.m4)(spill164_5)).m) ? 1 : 0);
    }
    if (!((lexicalValue164_56_0 != 0))) {
        break lexical_join_84;
    }
    life7_92 = ((java.util.List)(this.i)).iterator();
    lexical_cycle_61: while (true) {
    lexical_join_78: {
    lexical_join_77: {
    if (!(((java.util.Iterator)(life7_92)).hasNext())) {
        break lexical_join_84;
    }
    life8_99 = ((com.moon.m5)(((java.util.Iterator)(life7_92)).next()));
    if (!((life6_5 == 0))) {
        break lexical_join_89;
    }
    spill164_6 = life8_99;
    if (!((life6_5 == 0))) {
        lexicalValue164_78_0 = spill164_6;
        break lexical_join_78;
    }
    if (!((!((com.moon.m5)(spill164_6)).c__Boolean()))) {
        break lexical_join_77;
    }
    if (!((life6_5 != 0))) { continue lexical_cycle_61; }
    }
    lexicalValue164_78_0 = life8_99;
    }
    ((com.moon.m5)(lexicalValue164_78_0)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_5 != 0))) { continue lexical_cycle_61; }
    break lexical_cycle_61;
    }
    }
    lexicalValue164_85_0 = this;
    }
    __sourceIntrinsic_e4d4f5a69301_call164_24(lexicalValue164_85_0, p0, p1, p2);
    }
    return;
}


public void a(char p0, int p1) {
com.moon.m5 lexicalValue162_32_0;
    com.moon.m4 lexicalValue162_38_0;
    com.moon.m4 spill162_0;
    com.moon.m5 spill162_1;
    long life3_3;
    int life5_5;
    java.util.Iterator life6_17;
    com.moon.m5 life7_24;
    lexical_join_41: {
    lexical_join_38: {
    lexical_join_37: {
    life3_3 = (com.moon.m4.q ^ 48183572286860L);
    life5_5 = moom.n2.c();
    spill162_0 = this;
    if (!((life5_5 != 0))) {
        lexicalValue162_38_0 = spill162_0;
        break lexical_join_38;
    }
    if (!(((com.moon.m4)(spill162_0)).m)) {
        break lexical_join_37;
    }
    life6_17 = ((java.util.List)(this.i)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life6_17)).hasNext())) {
        break lexical_join_37;
    }
    life7_24 = ((com.moon.m5)(((java.util.Iterator)(life6_17)).next()));
    if (!((life5_5 != 0))) {
        break lexical_join_41;
    }
    spill162_1 = life7_24;
    if (!((life5_5 != 0))) {
        lexicalValue162_32_0 = spill162_1;
        break lexical_join_32;
    }
    if (!((!((com.moon.m5)(spill162_1)).c__Boolean()))) {
        break lexical_join_31;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_15; }
    }
    lexicalValue162_32_0 = life7_24;
    }
    ((com.moon.m5)(lexicalValue162_32_0)).a(((char)(p0)), ((int)(p1)));
    if (!((life5_5 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue162_38_0 = this;
    }
    __sourceIntrinsic_f7d59ba1def0_call162_10(lexicalValue162_38_0, p0, p1);
    }
    return;
}


public com.moon.nu a__nu() {
return this.p;
}


public boolean a__Boolean() {
return ((((this.m) ? 1 : 0)) != 0);
}


public java.util.List<com.moon.m5> a__List() {
return this.i;
}


public com.moon.module.Module a__sourceReturn_f255dfbd31() {
return this.k;
}


public com.moon.ns a__ns() {
return this.j;
}


private static java.lang.String a(byte[] p0) {
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
        byte[] spill662_0 = p0;
        life4_9 += 1;
        life5_44 = (spill662_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill662_1 = p0;
        life4_9 += 1;
        life5_76 = (spill662_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill662_2 = p0;
        life4_9 += 1;
        life5_91 = (spill662_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private org.lwjgl.util.vector.Vector2f a(org.lwjgl.util.vector.Vector2f p0, org.lwjgl.util.vector.Vector2f p1, float p2) {
double local4_life1 = java.lang.Math.toRadians(((double)(((double) p2))));
    float local6_life3 = ((float) java.lang.Math.cos(((double)(local4_life1))));
    float local7_life5 = ((float) java.lang.Math.sin(((double)(local4_life1))));
    return new org.lwjgl.util.vector.Vector2f(((((org.lwjgl.util.vector.Vector2f)(p0)).x + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local6_life3)) - ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local7_life5)), ((((org.lwjgl.util.vector.Vector2f)(p0)).y + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local7_life5)) + ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local6_life3)));
}


public com.moon.nY a__nY() {
return this.g;
}


private static native <E extends Throwable> long __sourceIntrinsic_2578883dc9ab7e2d_originalDynamicSite1159_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2578883dc9ab7e2d_originalDynamicSite1159_5(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_f7d59ba1def0_call162_10(com.moon.m4 a0, char a1, int a2) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_fd0ba049c90e_invokedynamic163_26() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic163_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic163_62(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call164_24(com.moon.m4 a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2124_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_d5f89f155b18_call168_10(com.moon.m4 a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2117_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic170_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic170_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic170_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic170_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic170_20(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic170_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic170_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_505b8c2844d4_invokedynamic170_99() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic170_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic170_131(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic170_135(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic170_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic170_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic170_182(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2119_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
