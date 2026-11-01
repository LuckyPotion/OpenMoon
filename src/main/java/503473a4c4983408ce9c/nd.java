package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nd extends com.moon.m5 {

private com.moon.nY n;

private java.util.Map<java.lang.Integer, com.moon.nY> o;

private com.moon.nX p;

private com.moon.nX q;

private com.moon.setting.EnumSetting<?> r;

private int s;

private int t;

private boolean u;

private static long v;

private static long[] w;

private static java.lang.Integer[] x;

private static java.util.Map y;

private static long[] z;

private static java.lang.Long[] A;

private static java.util.Map B;

public nd(com.moon.nh p0, com.moon.setting.EnumSetting<?> p1, float p2, float p3, float p4, float p5) { super((com.moon.nh)null, 0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_150300f6fd26f33b(com.moon.nd receiver, com.moon.nh p0, com.moon.setting.EnumSetting p1, float p2, float p3, float p4, float p5) throws Throwable {
init_join_78: {
    init_join_75: {
    long local7_life2 = (com.moon.nd.v ^ 22437341276403L);
    com.moon.nd.__sourceConstructorInit_150300f6fd26f33b_0(((com.moon.nd)(receiver)), ((com.moon.nh)(p0)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)));
    java.lang.String[] __sourceSpill197_9 = com.moon.j3.b();
    ((com.moon.nd)(receiver)).n = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_150300f6fd26f33b_originalDynamicSite197_6(7458, (2106683645209542626L ^ local7_life2)), com.moon.cj.EASE_IN_OUT_CUBIC)));
    ((com.moon.nd)(receiver)).o = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.nd)(receiver)).p = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.nd)(receiver)).q = ((com.moon.nX)(new com.moon.nX()));
    java.lang.String[] local9_life13 = __sourceSpill197_9;
    ((com.moon.nd)(receiver)).s = ((int)(-1));
    ((com.moon.nd)(receiver)).t = ((int)(-1));
    ((com.moon.nd)(receiver)).r = ((com.moon.setting.EnumSetting)(p1));
    int local10_life17 = 0;
    init_cycle_50: while (true) {
    if (!((local10_life17 < (((com.moon.setting.EnumSetting)(p1)).getValues()).length))) {
        break init_join_75;
    }
    ((java.util.Map)(((com.moon.nd)(receiver)).o)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(local10_life17))))), ((java.lang.Object)(new com.moon.nY(__sourceIntrinsic_150300f6fd26f33b_originalDynamicSite197_22(25093, (1646862180475437252L ^ local7_life2)), com.moon.cj.EASE_IN_OUT_CUBIC))));
    local10_life17 += 1;
    if (!((local9_life13 == null))) {
        break init_join_78;
    }
    if (!((local9_life13 != null))) { continue init_cycle_50; }
    break init_cycle_50;
    }
    }
    ((com.moon.nY)(((com.moon.nd)(receiver)).n)).b__Void();
    }
    return;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(-3833990872666698576L)), ((long)(-3072668338308631479L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(151780288528978L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.nd.v ^ 72249074161567L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill312_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill312_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill312_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill312_14 = new byte[8];
    (__sourceSpill312_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill312_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation312_16 = __sourceSpill312_14;
    ((javax.crypto.Cipher)(__sourceSpill312_11)).init(((int)(__sourceSpill312_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill312_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation312_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[5];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "NMÑ\016\027Ý\023\033þMANP/\021êjÖ¤"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill312_25 = local17_life21;
        int __sourceSpill312_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill312_25)).substring(((int)(__sourceSpill312_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill312_30 = local19_life19;
        int __sourceSpill312_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill312_33 = new byte[8];
        (__sourceSpill312_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill312_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill312_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill312_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill312_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill312_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill312_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill312_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill312_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill312_34)).doFinal(((byte[])(__sourceSpill312_33)));
        (__sourceSpill312_30)[__sourceSpill312_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "iùÔa¡B;ar\024xpÜ\t1\""))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill312_38 = local17_life21;
        int __sourceSpill312_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill312_38)).substring(((int)(__sourceSpill312_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill312_43 = local19_life19;
        int __sourceSpill312_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill312_46 = new byte[8];
        (__sourceSpill312_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill312_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill312_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill312_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill312_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill312_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill312_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill312_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill312_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill312_47)).doFinal(((byte[])(__sourceSpill312_46)));
        (__sourceSpill312_43)[__sourceSpill312_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    w = ((long[])(local19_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[5]));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill312_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill312_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill312_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill312_59 = new byte[8];
    (__sourceSpill312_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill312_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation312_61 = __sourceSpill312_59;
    ((javax.crypto.Cipher)(__sourceSpill312_56)).init(((int)(__sourceSpill312_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill312_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation312_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "BÑ2Mÿd FÖ¶}\037[X"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill312_70 = local4_life66;
        int __sourceSpill312_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill312_70)).substring(((int)(__sourceSpill312_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill312_75 = local6_life64;
        int __sourceSpill312_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill312_78 = new byte[8];
        (__sourceSpill312_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill312_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill312_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill312_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill312_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill312_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill312_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill312_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill312_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill312_79)).doFinal(((byte[])(__sourceSpill312_78)));
        (__sourceSpill312_75)[__sourceSpill312_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    z = ((long[])(local6_life64));
    A = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_150300f6fd26f33b_0(com.moon.nd a0, com.moon.nh a1, float a2, float a3, float a4, float a5) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2982_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28243);
    if (((com.moon.nd.A)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.nd.z)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.nd.B)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.nd.B)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/nd", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.nd.A)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.nd.A)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.nd.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(int p0, int p1) {
super.b(((int)(p0)), ((int)(p1)));
    return;
}


public void c(int p0, int p1) {
long local3_life2 = (com.moon.nd.v ^ 82698295817589L);
    float local5_life5 = (((com.moon.nd)(this)).a() + 0x1.0000000000000p+3F);
    float local6_life8 = (((com.moon.nd)(this)).b() + 0x1.2000000000000p+2F);
    float local7_life11 = (((com.moon.nd)(this)).c() - 0x1.0000000000000p+4F);
    com.moon.jm local8_life16 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    com.moon.hW local9_life21 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    com.moon.hW local10_life26 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    com.moon.hW local11_life32 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(local8_life16))))).a();
    ((com.moon.hW)(local9_life21)).a(((com.moon.iX)(com.moon.i3.a(((float)((local5_life5 - 0x1.0000000000000p-1F))), ((float)(((local6_life8 + 0x1.0p0f) + ((com.moon.jm)(local8_life16)).a(((float)(0x1.c000000000000p+2F)))))), ((float)((local7_life11 + 0x1.0p0f))), ((float)(0x1.1000000000000p+4F)), ((float)(0x1.8000000000000p+1F)), ((int)(__sourceIntrinsic_505b8c2844d4_originalDynamicSite200_39(3565, (2921517996273581486L ^ local3_life2))))))));
    ((com.moon.nd)(this)).a(((float)((((local5_life5 + local7_life11) - 0x1.1000000000000p+4F) - 0x1.6000000000000p+3F))), ((float)((local6_life8 + 0x1.6000000000000p+2F))), ((int)(p0)), ((int)(p1)));
    com.moon.i3 local12_life58 = com.moon.i3.a(((float)(((local5_life5 + local7_life11) - 0x1.1000000000000p+4F))), ((float)(((local6_life8 + 0x1.0p0f) + ((com.moon.jm)(local8_life16)).a(((float)(0x1.c000000000000p+2F)))))), ((float)(0x1.1000000000000p+4F)), ((float)(0x1.1000000000000p+4F)), ((float)(0x1.8000000000000p+1F)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.nd)(this)).a__lS())).a__kX())).getValue())))).intValue())));
    ((com.moon.i3)(local12_life58)).a(((boolean)(false)));
    ((com.moon.i3)(local12_life58)).c(((boolean)(false)));
    ((com.moon.i3)(local12_life58)).e(((boolean)(false)));
    ((com.moon.hW)(local9_life21)).a(((com.moon.iX)(local12_life58)));
    float local13_life64 = 0x1.4000000000000p+2F;
    float local14_life68 = (-0x1.6800000000000p+6F * ((com.moon.nY)(this.n)).c());
    org.lwjgl.util.vector.Vector2f local15_life73 = new org.lwjgl.util.vector.Vector2f(((local5_life5 + local7_life11) - 0x1.1000000000000p+3F), (((local6_life8 + 0x1.0p0f) + ((com.moon.jm)(local8_life16)).a(((float)(0x1.c000000000000p+2F)))) + 0x1.1000000000000p+3F));
    org.lwjgl.util.vector.Vector2f local16_life76 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local15_life73)).x + (local13_life64 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local15_life73)).y + (local13_life64 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local17_life79 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local15_life73)).x - (local13_life64 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local15_life73)).y + (local13_life64 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local18_life82 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(local15_life73)).x, (((org.lwjgl.util.vector.Vector2f)(local15_life73)).y - (local13_life64 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local19_life85 = ((com.moon.nd)(this)).a(((org.lwjgl.util.vector.Vector2f)(local15_life73)), ((org.lwjgl.util.vector.Vector2f)(local18_life82)), ((float)((0x1.6800000000000p+7F + local14_life68))));
    org.lwjgl.util.vector.Vector2f local20_life88 = ((com.moon.nd)(this)).a(((org.lwjgl.util.vector.Vector2f)(local15_life73)), ((org.lwjgl.util.vector.Vector2f)(local17_life79)), ((float)((0x1.6800000000000p+7F + local14_life68))));
    org.lwjgl.util.vector.Vector2f local21_life91 = ((com.moon.nd)(this)).a(((org.lwjgl.util.vector.Vector2f)(local15_life73)), ((org.lwjgl.util.vector.Vector2f)(local16_life76)), ((float)((0x1.6800000000000p+7F + local14_life68))));
    ((com.moon.hW)(local10_life26)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(local19_life85)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local19_life85)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local20_life88)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local20_life88)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local21_life91)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local21_life91)).y)), ((int)(-1))))));
    ((com.moon.jm)(local8_life16)).b(((com.moon.hW)(local11_life32)), ((java.lang.String)(((com.moon.setting.EnumSetting)(this.r)).getDisplayName())), ((float)(0x1.c000000000000p+2F)), ((float)(local5_life5)), ((float)(local6_life8)), ((int)(-1)));
    ((com.moon.jm)(local8_life16)).b(((com.moon.hW)(local11_life32)), ((java.lang.String)(((com.moon.l8)(((com.moon.l8)(((java.lang.Enum)(((com.moon.setting.EnumSetting)(this.r)).getValue())))))).a__String())), ((float)(0x1.c000000000000p+2F)), ((float)((local5_life5 + 0x1.0000000000000p+2F))), ((float)(((((local6_life8 + 0x1.8000000000000p+0F) + ((com.moon.jm)(local8_life16)).a(((float)(0x1.c000000000000p+2F)))) + 0x1.1000000000000p+3F) - (((com.moon.jm)(local8_life16)).b(((java.lang.String)(((com.moon.l8)(((com.moon.l8)(((java.lang.Enum)(((com.moon.setting.EnumSetting)(this.r)).getValue())))))).a__String())), ((float)(0x1.c000000000000p+2F))) / 0x1.0p1f)))), ((int)(-1)));
    ((com.moon.hW)(local9_life21)).b();
    ((com.moon.hW)(local11_life32)).b();
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_505b8c2844d4_originalDynamicSite200_126(4088, (249077383047561146L ^ local3_life2)))));
    ((com.moon.hW)(local10_life26)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_505b8c2844d4_originalDynamicSite200_130(19196, (1832319711206963901L ^ local3_life2)))));
    ((com.moon.nd)(this)).d(((int)(p0)), ((int)(p1)));
    ((com.moon.nY)(this.n)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.u)));
    float local22_life140 = (0x1.4000000000000p+1F + (((float) (((com.moon.setting.EnumSetting)(this.r)).getValues()).length) * 0x1.1000000000000p+4F));
    this.k = ((float)((0x1.f800000000000p+4F + (local22_life140 * ((com.moon.nY)(this.n)).c()))));
    super.c(((int)(p0)), ((int)(p1)));
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.EnumSetting)(this.r)).isAvailable())) != 0);
}


private void d(int p0, int p1) {
int lexicalValue312_114_0;
    java.lang.Object lexicalValue312_243_0;
    int lexicalValue312_250_0;
    int lexicalValue312_284_0;
    int lexicalValue312_289_0;
    int lexicalValue312_302_0;
    int lexicalValue312_307_0;
    int lexicalValue312_315_0;
    int lexicalValue312_355_0;
    com.moon.nd lexicalValue312_365_0;
    com.moon.nX lexicalValue312_372_0;
    com.moon.nX lexicalValue312_373_0;
    float lexicalValue312_373_1;
    com.moon.nY lexicalValue312_422_0;
    float lexicalValue312_422_1;
    float lexicalValue312_422_2;
    int lexicalValue312_422_3;
    com.moon.nY lexicalValue312_423_0;
    float lexicalValue312_423_1;
    float lexicalValue312_423_2;
    com.moon.nY lexicalValue312_424_0;
    float lexicalValue312_424_1;
    float lexicalValue312_424_2;
    int lexicalValue312_424_3;
    java.lang.String[] spill312_0;
    boolean spill312_1;
    int spill312_2;
    int spill312_3;
    com.moon.nd spill312_4;
    int spill312_5;
    int spill312_6;
    com.moon.nd spill312_7;
    com.moon.nX spill312_8;
    com.moon.nY spill312_9;
    float spill312_10;
    float spill312_11;
    int spill312_12;
    long life3_3;
    float life6_8;
    float life7_13;
    float life8_18;
    float life9_28;
    float life10_34;
    com.moon.jm life11_39;
    com.moon.jm life12_44;
    com.moon.jC life13_51;
    com.moon.hW life14_56;
    com.moon.hW life15_64;
    com.moon.hW life16_71;
    float life17_96;
    java.lang.String[] life5_97;
    int life18_99;
    int life19_123;
    com.moon.nY life20_136;
    com.moon.l8 life21_143;
    java.lang.String life22_146;
    com.moon.nY life23_255;
    com.moon.nY life23_268;
    java.util.Iterator life19_468;
    java.lang.Integer life20_475;
    com.moon.nY life21_481;
    lexical_join_427: {
    lexical_join_373: {
    lexical_join_372: {
    lexical_join_365: {
    lexical_join_364: {
    lexical_join_355: {
    lexical_join_351: {
    lexical_join_315: {
    lexical_join_313: {
    lexical_join_307: {
    lexical_join_306: {
    lexical_join_114: {
    lexical_join_113: {
    life3_3 = (com.moon.nd.v ^ 128756954342671L);
    life6_8 = (((com.moon.nd)(this)).a() + 0x1.0p3f);
    life7_13 = (((com.moon.nd)(this)).b() + 0x1.2p2f);
    life8_18 = (((com.moon.nd)(this)).c() - 0x1.0p4f);
    life9_28 = (0x1.8p1f + (((float) (((com.moon.setting.EnumSetting)(this.r)).getValues()).length) * 0x1.1p4f));
    life10_34 = (life9_28 * ((com.moon.nY)(this.n)).c());
    life11_39 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life12_44 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life13_51 = com.moon.jC.a(((float)(life6_8)), ((float)(life7_13)), ((float)(life8_18)), ((float)(this.k)));
    life14_56 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill312_0 = com.moon.j3.b();
    life15_64 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life11_39))))).a();
    life16_71 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life12_44))))).a();
    ((com.moon.hW)(life14_56)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)((life7_13 + 0x1.dp4f))), ((float)((life8_18 + 0x1.0p0f))), ((float)((life10_34 - 0x1.8p1f))), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_84bf6114351d_invokedynamic312_33(16590, (4911981985347920116L ^ life3_3))))))));
    life17_96 = (life7_13 + 0x1.dp4f);
    life5_97 = spill312_0;
    life18_99 = 0;
    spill312_1 = this.u;
    if (!((life5_97 == null))) {
        lexicalValue312_114_0 = ((spill312_1) ? 1 : 0);
        break lexical_join_114;
    }
    if (!((!spill312_1))) {
        break lexical_join_113;
    }
    spill312_2 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.nY)(this.n)).c())), ((float)(0x0.0p0f)));
    if (!((life5_97 == null))) {
        lexicalValue312_307_0 = spill312_2;
        break lexical_join_307;
    }
    if (!((spill312_2 > 0))) {
        break lexical_join_306;
    }
    }
    lexicalValue312_114_0 = 0;
    }
    life19_123 = lexicalValue312_114_0;
    lexical_cycle_115: while (true) {
    lexical_join_303: {
    lexical_join_302: {
    lexical_join_298: {
    lexical_join_289: {
    lexical_join_284: {
    lexical_join_269: {
    lexical_join_250: {
    lexical_join_248: {
    lexical_join_243: {
    lexical_join_235: {
    if (!((life19_123 < (((com.moon.setting.EnumSetting)(this.r)).getValues()).length))) {
        break lexical_join_306;
    }
    life20_136 = ((com.moon.nY)(((java.util.Map)(this.o)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life19_123))))))));
    life21_143 = ((com.moon.l8)((((com.moon.setting.EnumSetting)(this.r)).getValues())[life19_123]));
    life22_146 = ((com.moon.l8)(life21_143)).a__String();
    ((com.moon.jm)(life11_39)).b(((com.moon.hW)(life15_64)), ((java.lang.String)(life22_146)), ((float)(0x1.cp2f)), ((float)((life6_8 + 0x1.0p2f))), ((float)(((((life17_96 + (((float) life19_123) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life11_39)).b(((java.lang.String)(life22_146)), ((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    ((com.moon.jm)(life12_44)).b(((com.moon.hW)(life16_71)), ((java.lang.String)("")), ((float)(0x1.cp2f)), ((float)((((life6_8 + life8_18) - 0x1.1p3f) - 0x1.0p2f))), ((float)(((((life17_96 + (((float) life19_123) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life12_44)).a(((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.nd)(this)).a__lS())).a__kX())).getValue())))).intValue()))).a(((float)(((com.moon.nY)(life20_136)).c()))))).getRGB())));
    if (!((life5_97 == null))) {
        break lexical_join_313;
    }
    if (!((life21_143 == ((com.moon.setting.EnumSetting)(this.r)).getValue()))) {
        break lexical_join_248;
    }
    spill312_3 = this.s;
    if (!((life5_97 == null))) {
        lexicalValue312_250_0 = spill312_3;
        break lexical_join_250;
    }
    if (!((spill312_3 != life19_123))) {
        break lexical_join_248;
    }
    spill312_4 = this;
    if (!((life5_97 == null))) {
        lexicalValue312_243_0 = spill312_4;
        break lexical_join_243;
    }
    if (!((((com.moon.nd)(spill312_4)).s != -1))) {
        break lexical_join_235;
    }
    life23_255 = ((com.moon.nY)(((java.util.Map)(this.o)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.s))))))));
    ((com.moon.nY)(life23_255)).a(((float)(0x1.0p0f)));
    }
    this.s = ((int)(life19_123));
    lexicalValue312_243_0 = ((java.util.Map)(this.o)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life19_123))))));
    }
    life23_268 = ((com.moon.nY)(lexicalValue312_243_0));
    ((com.moon.nY)(life23_268)).a(((float)(0x0.0p0f)));
    }
    lexicalValue312_250_0 = ((((com.moon.nY)(life20_136)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_97 == null))) {
        lexicalValue312_284_0 = lexicalValue312_250_0;
        break lexical_join_284;
    }
    if (!((lexicalValue312_250_0 != 0))) {
        break lexical_join_269;
    }
    spill312_5 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.nY)(life20_136)).c())), ((float)(0x1.0p0f)));
    if (!((life5_97 == null))) {
        lexicalValue312_284_0 = spill312_5;
        break lexical_join_284;
    }
    if (!((spill312_5 == 0))) {
        break lexical_join_269;
    }
    spill312_6 = this.s;
    if (!((life5_97 == null))) {
        lexicalValue312_284_0 = spill312_6;
        break lexical_join_284;
    }
    if (!((spill312_6 != life19_123))) {
        break lexical_join_269;
    }
    ((com.moon.nY)(life20_136)).a(((float)(0x1.0p0f)));
    }
    lexicalValue312_284_0 = ((((com.moon.nd)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life6_8)), ((float)(((life17_96 + (((float) life19_123) * 0x1.1p4f)) - 0x1.0p-1f))), ((float)(life8_18)), ((float)(0x1.2p4f)))) ? 1 : 0);
    }
    if (!((life5_97 == null))) {
        lexicalValue312_289_0 = lexicalValue312_284_0;
        break lexical_join_289;
    }
    if (!((lexicalValue312_284_0 != 0))) {
        break lexical_join_303;
    }
    lexicalValue312_289_0 = this.t;
    }
    if (!((life5_97 == null))) {
        lexicalValue312_302_0 = lexicalValue312_289_0;
        break lexical_join_302;
    }
    if (!((lexicalValue312_289_0 == -1))) {
        break lexical_join_298;
    }
    ((com.moon.nX)(this.p)).a(((float)(((float) life19_123))));
    }
    this.t = ((int)(life19_123));
    lexicalValue312_302_0 = 1;
    }
    life18_99 = lexicalValue312_302_0;
    }
    life19_123 += 1;
    if (!((life5_97 != null))) { continue lexical_cycle_115; }
    break lexical_cycle_115;
    }
    }
    lexicalValue312_307_0 = life18_99;
    }
    if (!((life5_97 == null))) {
        lexicalValue312_315_0 = lexicalValue312_307_0;
        break lexical_join_315;
    }
    if (!((lexicalValue312_307_0 == 0))) {
        break lexical_join_313;
    }
    this.t = ((int)(-1));
    }
    lexicalValue312_315_0 = ((this.u) ? 1 : 0);
    }
    if (!((life5_97 == null))) {
        lexicalValue312_355_0 = lexicalValue312_315_0;
        break lexical_join_355;
    }
    if (!((lexicalValue312_315_0 != 0))) {
        break lexical_join_351;
    }
    ((com.moon.hW)(life14_56)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)((life17_96 + (((com.moon.nX)(this.p)).b() * 0x1.1p4f)))), ((float)((life8_18 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_84bf6114351d_invokedynamic312_96(8598, (8892305431928504747L ^ life3_3))))).a(((float)((((com.moon.nX)(this.q)).b() * 0x1.0p-2f)))))).getRGB()))))));
    }
    spill312_7 = this;
    if (!((life5_97 == null))) {
        lexicalValue312_365_0 = spill312_7;
        break lexical_join_365;
    }
    lexicalValue312_355_0 = ((com.moon.nd)(spill312_7)).t;
    }
    if (!((lexicalValue312_355_0 != -1))) {
        break lexical_join_364;
    }
    ((com.moon.nX)(this.p)).a(((float)(((float) this.t))), ((double)(0x1.99999ap-2d)));
    }
    lexicalValue312_365_0 = this;
    }
    spill312_8 = ((com.moon.nd)(lexicalValue312_365_0)).q;
    if (!((this.t != -1))) {
        lexicalValue312_372_0 = spill312_8;
        break lexical_join_372;
    }
    lexicalValue312_373_0 = spill312_8;
    lexicalValue312_373_1 = 0x1.0p0f;
    break lexical_join_373;
    }
    lexicalValue312_373_0 = lexicalValue312_372_0;
    lexicalValue312_373_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue312_373_0)).a(((float)(lexicalValue312_373_1)), ((double)(0x1.99999ap-2d)));
    ((com.moon.hW)(life14_56)).a(((com.moon.jA)(life13_51)));
    ((com.moon.hW)(life15_64)).a(((com.moon.jA)(life13_51)));
    ((com.moon.hW)(life16_71)).a(((com.moon.jA)(life13_51)));
    ((com.moon.hW)(life14_56)).b();
    ((com.moon.hW)(life15_64)).b();
    ((com.moon.hW)(life16_71)).b();
    life19_468 = ((java.util.Set)(((java.util.Map)(this.o)).keySet())).iterator();
    lexical_cycle_395: while (true) {
    lexical_join_424: {
    lexical_join_423: {
    lexical_join_422: {
    if (!(((java.util.Iterator)(life19_468)).hasNext())) {
        break lexical_join_427;
    }
    life20_475 = ((java.lang.Integer)(((java.util.Iterator)(life19_468)).next()));
    life21_481 = ((com.moon.nY)(((java.util.Map)(this.o)).get(((java.lang.Object)(life20_475)))));
    spill312_9 = life21_481;
    spill312_10 = 0x0.0p0f;
    spill312_11 = 0x1.0p0f;
    spill312_12 = ((java.lang.Enum)(((java.lang.Enum)(((com.moon.setting.EnumSetting)(this.r)).getValue())))).ordinal();
    if (!((life5_97 == null))) {
        lexicalValue312_422_0 = spill312_9;
        lexicalValue312_422_1 = spill312_10;
        lexicalValue312_422_2 = spill312_11;
        lexicalValue312_422_3 = spill312_12;
        break lexical_join_422;
    }
    if (!((spill312_12 == ((java.lang.Integer)(life20_475)).intValue()))) {
        lexicalValue312_423_0 = spill312_9;
        lexicalValue312_423_1 = spill312_10;
        lexicalValue312_423_2 = spill312_11;
        break lexical_join_423;
    }
    lexicalValue312_422_0 = spill312_9;
    lexicalValue312_422_1 = spill312_10;
    lexicalValue312_422_2 = spill312_11;
    lexicalValue312_422_3 = 1;
    }
    lexicalValue312_424_0 = lexicalValue312_422_0;
    lexicalValue312_424_1 = lexicalValue312_422_1;
    lexicalValue312_424_2 = lexicalValue312_422_2;
    lexicalValue312_424_3 = lexicalValue312_422_3;
    break lexical_join_424;
    }
    lexicalValue312_424_0 = lexicalValue312_423_0;
    lexicalValue312_424_1 = lexicalValue312_423_1;
    lexicalValue312_424_2 = lexicalValue312_423_2;
    lexicalValue312_424_3 = 0;
    }
    ((com.moon.nY)(lexicalValue312_424_0)).a(((float)(lexicalValue312_424_1)), ((float)(lexicalValue312_424_2)), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue312_424_3))));
    if (!((life5_97 != null))) { continue lexical_cycle_395; }
    break lexical_cycle_395;
    }
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2985_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
long local3_life2 = (com.moon.nd.v ^ 31267911119727L);
    float local5_life5 = (((com.moon.nd)(this)).a() + 0x1.0000000000000p+3F);
    float local6_life8 = (((com.moon.nd)(this)).b() + 0x1.2000000000000p+2F);
    float local7_life11 = (((com.moon.nd)(this)).c() - 0x1.0000000000000p+4F);
    com.moon.jm local8_life16 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    com.moon.hW local9_life21 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    float local10_life23 = 0x1.4000000000000p+2F;
    float local11_life27 = (-0x1.6800000000000p+6F * ((com.moon.nY)(this.n)).c());
    org.lwjgl.util.vector.Vector2f local12_life32 = new org.lwjgl.util.vector.Vector2f(((local5_life5 + local7_life11) - 0x1.1000000000000p+3F), (((local6_life8 + 0x1.0p0f) + ((com.moon.jm)(local8_life16)).a(((float)(0x1.c000000000000p+2F)))) + 0x1.1000000000000p+3F));
    org.lwjgl.util.vector.Vector2f local13_life35 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local12_life32)).x + (local10_life23 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local12_life32)).y + (local10_life23 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local14_life38 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local12_life32)).x - (local10_life23 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local12_life32)).y + (local10_life23 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local15_life41 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(local12_life32)).x, (((org.lwjgl.util.vector.Vector2f)(local12_life32)).y - (local10_life23 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local16_life44 = ((com.moon.nd)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life32)), ((org.lwjgl.util.vector.Vector2f)(local15_life41)), ((float)((0x1.6800000000000p+7F + local11_life27))));
    org.lwjgl.util.vector.Vector2f local17_life47 = ((com.moon.nd)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life32)), ((org.lwjgl.util.vector.Vector2f)(local14_life38)), ((float)((0x1.6800000000000p+7F + local11_life27))));
    org.lwjgl.util.vector.Vector2f local18_life50 = ((com.moon.nd)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life32)), ((org.lwjgl.util.vector.Vector2f)(local13_life35)), ((float)((0x1.6800000000000p+7F + local11_life27))));
    ((com.moon.hW)(local9_life21)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(local16_life44)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local16_life44)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local17_life47)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local17_life47)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local18_life50)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local18_life50)).y)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite198_62(19196, (1832369487494020263L ^ local3_life2)))));
    ((com.moon.hW)(local9_life21)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite198_66(19196, (1832369487494020263L ^ local3_life2)))));
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


private org.lwjgl.util.vector.Vector2f a(org.lwjgl.util.vector.Vector2f p0, org.lwjgl.util.vector.Vector2f p1, float p2) {
double local4_life1 = java.lang.Math.toRadians(((double)(((double) p2))));
    float local6_life3 = ((float) java.lang.Math.cos(((double)(local4_life1))));
    float local7_life5 = ((float) java.lang.Math.sin(((double)(local4_life1))));
    return new org.lwjgl.util.vector.Vector2f(((((org.lwjgl.util.vector.Vector2f)(p0)).x + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local6_life3)) - ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local7_life5)), ((((org.lwjgl.util.vector.Vector2f)(p0)).y + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local7_life5)) + ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local6_life3)));
}


public void a(int p0, int p1, int p2) {
com.moon.nY lexicalValue311_54_0;
    com.moon.nY lexicalValue311_55_0;
    float lexicalValue311_55_1;
    com.moon.nd lexicalValue311_63_0;
    int lexicalValue311_63_1;
    com.moon.nd lexicalValue311_64_0;
    com.moon.nd lexicalValue311_65_0;
    int lexicalValue311_65_1;
    int lexicalValue311_70_0;
    com.moon.nd lexicalValue311_126_0;
    com.moon.nd lexicalValue311_128_0;
    int lexicalValue311_128_1;
    int lexicalValue311_128_2;
    java.lang.String[] spill311_0;
    boolean spill311_1;
    com.moon.nY spill311_2;
    com.moon.nd spill311_3;
    boolean spill311_4;
    com.moon.nd spill311_5;
    com.moon.nd spill311_6;
    int spill311_7;
    int spill311_8;
    long life4_3;
    float life7_8;
    float life8_13;
    float life9_19;
    com.moon.jm life10_24;
    java.lang.String[] life6_25;
    float life11_88;
    int life12_90;
    float life13_103;
    lexical_join_128: {
    lexical_join_126: {
    lexical_join_125: {
    lexical_join_70: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_55: {
    lexical_join_54: {
    life4_3 = (com.moon.nd.v ^ 106079037455659L);
    life7_8 = (((com.moon.nd)(this)).a() + 0x1.0p3f);
    life8_13 = (((com.moon.nd)(this)).b() + 0x1.2p2f);
    spill311_0 = com.moon.j3.b();
    life9_19 = (((com.moon.nd)(this)).c() - 0x1.0p4f);
    life10_24 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life6_25 = spill311_0;
    spill311_1 = ((com.moon.nd)(this)).a(((int)(p0)), ((int)(p1)), ((float)((life7_8 - 0x1.0p-1f))), ((float)(((life8_13 + 0x1.8p1f) + ((com.moon.jm)(life10_24)).a(((float)(0x1.cp2f)))))), ((float)((life9_19 + 0x1.0p0f))), ((float)(0x1.1p4f)));
    if (!((life6_25 == null))) {
        lexicalValue311_70_0 = ((spill311_1) ? 1 : 0);
        break lexical_join_70;
    }
    if (!(spill311_1)) {
        break lexical_join_66;
    }
    spill311_2 = this.n;
    if (!(this.u)) {
        lexicalValue311_54_0 = spill311_2;
        break lexical_join_54;
    }
    lexicalValue311_55_0 = spill311_2;
    lexicalValue311_55_1 = 0x1.0p0f;
    break lexical_join_55;
    }
    lexicalValue311_55_0 = lexicalValue311_54_0;
    lexicalValue311_55_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(lexicalValue311_55_0)).a(((float)(lexicalValue311_55_1)));
    spill311_3 = this;
    spill311_4 = this.u;
    if (!((life6_25 == null))) {
        lexicalValue311_63_0 = spill311_3;
        lexicalValue311_63_1 = ((spill311_4) ? 1 : 0);
        break lexical_join_63;
    }
    if (!((!spill311_4))) {
        lexicalValue311_64_0 = spill311_3;
        break lexical_join_64;
    }
    lexicalValue311_63_0 = spill311_3;
    lexicalValue311_63_1 = 1;
    }
    lexicalValue311_65_0 = lexicalValue311_63_0;
    lexicalValue311_65_1 = lexicalValue311_63_1;
    break lexical_join_65;
    }
    lexicalValue311_65_0 = lexicalValue311_64_0;
    lexicalValue311_65_1 = 0;
    }
    ((com.moon.nd)(lexicalValue311_65_0)).u = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue311_65_1)));
    }
    spill311_5 = this;
    if (!((life6_25 == null))) {
        lexicalValue311_126_0 = spill311_5;
        break lexical_join_126;
    }
    lexicalValue311_70_0 = ((((com.moon.nd)(spill311_5)).u) ? 1 : 0);
    }
    if (!((lexicalValue311_70_0 != 0))) {
        break lexical_join_125;
    }
    life11_88 = (life8_13 + 0x1.dp4f);
    life12_90 = 0;
    lexical_cycle_77: while (true) {
    lexical_join_123: {
    lexical_join_122: {
    if (!((life12_90 < (((com.moon.setting.EnumSetting)(this.r)).getValues()).length))) {
        break lexical_join_125;
    }
    life13_103 = (life11_88 + (((float) life12_90) * 0x1.1p4f));
    if (!((life6_25 == null))) {
        break lexical_join_123;
    }
    spill311_6 = this;
    spill311_7 = p0;
    spill311_8 = p1;
    if (!((life6_25 == null))) {
        lexicalValue311_128_0 = spill311_6;
        lexicalValue311_128_1 = spill311_7;
        lexicalValue311_128_2 = spill311_8;
        break lexical_join_128;
    }
    if (!(((com.moon.nd)(spill311_6)).a(((int)(spill311_7)), ((int)(spill311_8)), ((float)((life7_8 - 0x1.0p-1f))), ((float)(life13_103)), ((float)((life9_19 + 0x1.0p0f))), ((float)(0x1.1p4f))))) {
        break lexical_join_122;
    }
    if (!((p2 == 0))) {
        break lexical_join_122;
    }
    ((com.moon.setting.EnumSetting)(this.r)).setValue(((java.lang.Object)(((java.lang.Enum)(((com.moon.nd)(this)).a(((java.lang.Object)((((com.moon.setting.EnumSetting)(this.r)).getValues())[life12_90]))))))));
    if (!((life6_25 != null))) {
        break lexical_join_125;
    }
    }
    life12_90 += 1;
    }
    if (!((life6_25 != null))) { continue lexical_cycle_77; }
    break lexical_cycle_77;
    }
    }
    lexicalValue311_126_0 = this;
    }
    lexicalValue311_128_0 = lexicalValue311_126_0;
    lexicalValue311_128_1 = p0;
    lexicalValue311_128_2 = p1;
    }
    __sourceIntrinsic_e4d4f5a69301_call311_29(lexicalValue311_128_0, lexicalValue311_128_1, lexicalValue311_128_2, p2);
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.r;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8534;
      if (x[var3] == null) {
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
         long var5 = w[var3];
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
         Object[] var9 = (Object[])y.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               y.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/nd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         x[var3] = var15;
      }

      return x[var3];
}


private static native <E extends Throwable> long __sourceIntrinsic_150300f6fd26f33b_originalDynamicSite197_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_150300f6fd26f33b_originalDynamicSite197_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite198_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite198_66(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call311_29(com.moon.nd a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2985_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2982_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_originalDynamicSite200_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_originalDynamicSite200_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_originalDynamicSite200_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84bf6114351d_invokedynamic312_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84bf6114351d_invokedynamic312_96(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
