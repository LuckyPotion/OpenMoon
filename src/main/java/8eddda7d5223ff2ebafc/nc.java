package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nc extends com.moon.m5 {

private com.moon.nY n;

private java.util.Map<java.lang.Integer, com.moon.nY> o;

private com.moon.nX p;

private com.moon.nX q;

private com.moon.setting.ModeSetting<?> r;

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

public nc(com.moon.nh p0, com.moon.setting.ModeSetting<?> p1, float p2, float p3, float p4, float p5) { super((com.moon.nh)null, 0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_5d7634c74b162fda(com.moon.nc receiver, com.moon.nh p0, com.moon.setting.ModeSetting p1, float p2, float p3, float p4, float p5) throws Throwable {
init_join_78: {
    init_join_75: {
    long local7_life2 = (com.moon.nc.v ^ 136067983423277L);
    com.moon.nc.__sourceConstructorInit_5d7634c74b162fda_0(((com.moon.nc)(receiver)), ((com.moon.nh)(p0)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)));
    java.lang.String[] __sourceSpill194_9 = com.moon.j3.b();
    ((com.moon.nc)(receiver)).n = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_5d7634c74b162fda_originalDynamicSite194_6(18895, (6573435392770665869L ^ local7_life2)), com.moon.cj.EASE_IN_OUT_CUBIC)));
    java.lang.String[] local9_life10 = __sourceSpill194_9;
    ((com.moon.nc)(receiver)).o = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.nc)(receiver)).p = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.nc)(receiver)).q = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.nc)(receiver)).s = ((int)(-1));
    ((com.moon.nc)(receiver)).t = ((int)(-1));
    ((com.moon.nc)(receiver)).r = ((com.moon.setting.ModeSetting)(p1));
    int local10_life17 = 0;
    init_cycle_50: while (true) {
    if (!((local10_life17 < (((com.moon.setting.ModeSetting)(p1)).getValues()).length))) {
        break init_join_75;
    }
    ((java.util.Map)(((com.moon.nc)(receiver)).o)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(local10_life17))))), ((java.lang.Object)(new com.moon.nY(__sourceIntrinsic_5d7634c74b162fda_originalDynamicSite194_22(20578, (8769826887158363169L ^ local7_life2)), com.moon.cj.EASE_IN_OUT_CUBIC))));
    local10_life17 += 1;
    if (!((local9_life10 == null))) {
        break init_join_78;
    }
    if (!((local9_life10 != null))) { continue init_cycle_50; }
    break init_cycle_50;
    }
    }
    ((com.moon.nY)(((com.moon.nc)(receiver)).n)).b__Void();
    }
    return;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(-6585233101047387728L)), ((long)(-8869469035979217448L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(143459372324486L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.nc.v ^ 84457031484527L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill311_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill311_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill311_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill311_14 = new byte[8];
    (__sourceSpill311_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill311_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation311_16 = __sourceSpill311_14;
    ((javax.crypto.Cipher)(__sourceSpill311_11)).init(((int)(__sourceSpill311_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill311_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation311_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[5];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "¢±A*+);îÉë=Õ2¸]Ôª8~~6Ãþ"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill311_25 = local17_life21;
        int __sourceSpill311_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill311_25)).substring(((int)(__sourceSpill311_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill311_30 = local19_life19;
        int __sourceSpill311_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill311_33 = new byte[8];
        (__sourceSpill311_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill311_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill311_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill311_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill311_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill311_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill311_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill311_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill311_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill311_34)).doFinal(((byte[])(__sourceSpill311_33)));
        (__sourceSpill311_30)[__sourceSpill311_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "-ÁVôWØ-­\023²RJù¹ý"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill311_38 = local17_life21;
        int __sourceSpill311_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill311_38)).substring(((int)(__sourceSpill311_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill311_43 = local19_life19;
        int __sourceSpill311_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill311_46 = new byte[8];
        (__sourceSpill311_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill311_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill311_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill311_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill311_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill311_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill311_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill311_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill311_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill311_47)).doFinal(((byte[])(__sourceSpill311_46)));
        (__sourceSpill311_43)[__sourceSpill311_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    w = ((long[])(local19_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[5]));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill311_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill311_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill311_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill311_59 = new byte[8];
    (__sourceSpill311_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill311_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation311_61 = __sourceSpill311_59;
    ((javax.crypto.Cipher)(__sourceSpill311_56)).init(((int)(__sourceSpill311_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill311_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation311_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "|lV÷Ê«=&¡n\023Ì\f.c*"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill311_70 = local4_life66;
        int __sourceSpill311_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill311_70)).substring(((int)(__sourceSpill311_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill311_75 = local6_life64;
        int __sourceSpill311_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill311_78 = new byte[8];
        (__sourceSpill311_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill311_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill311_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill311_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill311_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill311_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill311_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill311_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill311_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill311_79)).doFinal(((byte[])(__sourceSpill311_78)));
        (__sourceSpill311_75)[__sourceSpill311_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    z = ((long[])(local6_life64));
    A = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5d7634c74b162fda_0(com.moon.nc a0, com.moon.nh a1, float a2, float a3, float a4, float a5) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2976_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29325);
    if (((com.moon.nc.A)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.nc.z)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.nc.B)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.nc.B)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/nc", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.nc.A)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.nc.A)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.nc.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(int p0, int p1) {
super.b(((int)(p0)), ((int)(p1)));
    return;
}


public void c(int p0, int p1) {
long life3_3;
    float life6_8;
    float life7_14;
    float life8_19;
    com.moon.jm life9_24;
    com.moon.hW life10_29;
    com.moon.hW life11_34;
    com.moon.hW life12_41;
    com.moon.i3 life13_101;
    float life14_118;
    float life15_124;
    java.lang.String[] life5_125;
    org.lwjgl.util.vector.Vector2f life16_143;
    org.lwjgl.util.vector.Vector2f life17_159;
    org.lwjgl.util.vector.Vector2f life18_175;
    org.lwjgl.util.vector.Vector2f life19_187;
    org.lwjgl.util.vector.Vector2f life20_195;
    org.lwjgl.util.vector.Vector2f life21_203;
    org.lwjgl.util.vector.Vector2f life22_211;
    float life23_304;
    life3_3 = (com.moon.nc.v ^ 90191146250487L);
    life6_8 = (((com.moon.nc)(this)).a() + 0x1.0p3f);
    java.lang.String[] spill1098_0 = com.moon.j3.b();
    life7_14 = (((com.moon.nc)(this)).b() + 0x1.2p2f);
    life8_19 = (((com.moon.nc)(this)).c() - 0x1.0p4f);
    life9_24 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life10_29 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life11_34 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    life12_41 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life9_24))))).a();
    ((com.moon.hW)(life10_29)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)(((life7_14 + 0x1.0p0f) + ((com.moon.jm)(life9_24)).a(((float)(0x1.cp2f)))))), ((float)((life8_19 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic1098_23(26151, (7000494934464046543L ^ life3_3))))))));
    ((com.moon.nc)(this)).a(((float)((((life6_8 + life8_19) - 0x1.1p4f) - 0x1.6p3f))), ((float)((life7_14 + 0x1.ep3f))), ((int)(p0)), ((int)(p1)));
    life13_101 = com.moon.i3.a(((float)(((life6_8 + life8_19) - 0x1.1p4f))), ((float)(((life7_14 + 0x1.0p0f) + ((com.moon.jm)(life9_24)).a(((float)(0x1.cp2f)))))), ((float)(0x1.1p4f)), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.nc)(this)).a__lS())).a__kX())).getValue())))).intValue())));
    ((com.moon.i3)(life13_101)).a(((boolean)(false)));
    ((com.moon.i3)(life13_101)).c(((boolean)(false)));
    ((com.moon.i3)(life13_101)).e(((boolean)(false)));
    ((com.moon.hW)(life10_29)).a(((com.moon.iX)(life13_101)));
    life14_118 = 0x1.4p2f;
    life15_124 = (-0x1.68p6f * ((com.moon.nY)(this.n)).c());
    life5_125 = spill1098_0;
    life16_143 = new org.lwjgl.util.vector.Vector2f(((life6_8 + life8_19) - 0x1.1p3f), (((life7_14 + 0x1.0p0f) + ((com.moon.jm)(life9_24)).a(((float)(0x1.cp2f)))) + 0x1.1p3f));
    life17_159 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life16_143)).x + (life14_118 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life16_143)).y + (life14_118 / 0x1.0p1f)));
    life18_175 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life16_143)).x - (life14_118 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life16_143)).y + (life14_118 / 0x1.0p1f)));
    life19_187 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(life16_143)).x, (((org.lwjgl.util.vector.Vector2f)(life16_143)).y - (life14_118 / 0x1.0p1f)));
    life20_195 = ((com.moon.nc)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_143)), ((org.lwjgl.util.vector.Vector2f)(life19_187)), ((float)((0x1.68p7f + life15_124))));
    life21_203 = ((com.moon.nc)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_143)), ((org.lwjgl.util.vector.Vector2f)(life18_175)), ((float)((0x1.68p7f + life15_124))));
    life22_211 = ((com.moon.nc)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_143)), ((org.lwjgl.util.vector.Vector2f)(life17_159)), ((float)((0x1.68p7f + life15_124))));
    ((com.moon.hW)(life11_34)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(life20_195)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life20_195)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life21_203)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life21_203)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life22_211)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life22_211)).y)), ((int)(-1))))));
    ((com.moon.jm)(life9_24)).b(((com.moon.hW)(life12_41)), ((java.lang.String)(((com.moon.setting.ModeSetting)(this.r)).getDisplayName())), ((float)(0x1.cp2f)), ((float)(life6_8)), ((float)(life7_14)), ((int)(-1)));
    ((com.moon.jm)(life9_24)).b(((com.moon.hW)(life12_41)), ((java.lang.String)(((com.moon.l8)(((com.moon.l8)(((java.lang.Enum)(((com.moon.setting.ModeSetting)(this.r)).getValue())))))).a__String())), ((float)(0x1.cp2f)), ((float)((life6_8 + 0x1.0p2f))), ((float)(((((life7_14 + 0x1.8p0f) + ((com.moon.jm)(life9_24)).a(((float)(0x1.cp2f)))) + 0x1.1p3f) - (((com.moon.jm)(life9_24)).b(((java.lang.String)(((com.moon.l8)(((com.moon.l8)(((java.lang.Enum)(((com.moon.setting.ModeSetting)(this.r)).getValue())))))).a__String())), ((float)(0x1.cp2f))) / 0x1.0p1f)))), ((int)(-1)));
    ((com.moon.hW)(life10_29)).b();
    ((com.moon.hW)(life12_41)).b();
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic1098_76(30583, (5191235178080154777L ^ life3_3)))));
    ((com.moon.hW)(life11_34)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic1098_79(23359, (4516811401805928659L ^ life3_3)))));
    ((com.moon.nc)(this)).d(((int)(p0)), ((int)(p1)));
    life23_304 = (0x1.4p1f + (((float) (((com.moon.setting.ModeSetting)(this.r)).getValues()).length) * 0x1.1p4f));
    this.k = ((float)((0x1.f8p4f + (life23_304 * ((com.moon.nY)(this.n)).c()))));
    ((com.moon.nY)(this.n)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.u)));
    super.c(((int)(p0)), ((int)(p1)));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.j3.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.ModeSetting)(this.r)).isAvailable())) != 0);
}


private void d(int p0, int p1) {
int lexicalValue310_114_0;
    java.lang.Object lexicalValue310_243_0;
    int lexicalValue310_250_0;
    int lexicalValue310_284_0;
    int lexicalValue310_289_0;
    int lexicalValue310_302_0;
    int lexicalValue310_307_0;
    int lexicalValue310_315_0;
    int lexicalValue310_355_0;
    com.moon.nc lexicalValue310_365_0;
    com.moon.nX lexicalValue310_372_0;
    com.moon.nX lexicalValue310_373_0;
    float lexicalValue310_373_1;
    com.moon.nY lexicalValue310_422_0;
    float lexicalValue310_422_1;
    float lexicalValue310_422_2;
    int lexicalValue310_422_3;
    com.moon.nY lexicalValue310_423_0;
    float lexicalValue310_423_1;
    float lexicalValue310_423_2;
    com.moon.nY lexicalValue310_424_0;
    float lexicalValue310_424_1;
    float lexicalValue310_424_2;
    int lexicalValue310_424_3;
    java.lang.String[] spill310_0;
    boolean spill310_1;
    int spill310_2;
    int spill310_3;
    com.moon.nc spill310_4;
    int spill310_5;
    int spill310_6;
    com.moon.nc spill310_7;
    com.moon.nX spill310_8;
    com.moon.nY spill310_9;
    float spill310_10;
    float spill310_11;
    int spill310_12;
    long life3_3;
    float life6_8;
    float life7_13;
    float life8_18;
    float life9_28;
    float life10_35;
    java.lang.String[] life5_36;
    com.moon.jm life11_41;
    com.moon.jm life12_46;
    com.moon.jC life13_53;
    com.moon.hW life14_58;
    com.moon.hW life15_65;
    com.moon.hW life16_72;
    float life17_97;
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
    life3_3 = (com.moon.nc.v ^ 61474839422267L);
    life6_8 = (((com.moon.nc)(this)).a() + 0x1.0p3f);
    life7_13 = (((com.moon.nc)(this)).b() + 0x1.2p2f);
    life8_18 = (((com.moon.nc)(this)).c() - 0x1.0p4f);
    life9_28 = (0x1.8p1f + (((float) (((com.moon.setting.ModeSetting)(this.r)).getValues()).length) * 0x1.1p4f));
    spill310_0 = com.moon.j3.b();
    life10_35 = (life9_28 * ((com.moon.nY)(this.n)).c());
    life5_36 = spill310_0;
    life11_41 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life12_46 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life13_53 = com.moon.jC.a(((float)(life6_8)), ((float)(life7_13)), ((float)(life8_18)), ((float)(this.k)));
    life14_58 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life15_65 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life11_41))))).a();
    life16_72 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life12_46))))).a();
    ((com.moon.hW)(life14_58)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)((life7_13 + 0x1.dp4f))), ((float)((life8_18 + 0x1.0p0f))), ((float)((life10_35 - 0x1.8p1f))), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_84bf6114351d_invokedynamic310_33(5584, (1619893163626710001L ^ life3_3))))))));
    life17_97 = (life7_13 + 0x1.dp4f);
    life18_99 = 0;
    spill310_1 = this.u;
    if (!((life5_36 == null))) {
        lexicalValue310_114_0 = ((spill310_1) ? 1 : 0);
        break lexical_join_114;
    }
    if (!((!spill310_1))) {
        break lexical_join_113;
    }
    spill310_2 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.nY)(this.n)).c())), ((float)(0x0.0p0f)));
    if (!((life5_36 == null))) {
        lexicalValue310_307_0 = spill310_2;
        break lexical_join_307;
    }
    if (!((spill310_2 > 0))) {
        break lexical_join_306;
    }
    }
    lexicalValue310_114_0 = 0;
    }
    life19_123 = lexicalValue310_114_0;
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
    if (!((life19_123 < (((com.moon.setting.ModeSetting)(this.r)).getValues()).length))) {
        break lexical_join_306;
    }
    life20_136 = ((com.moon.nY)(((java.util.Map)(this.o)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life19_123))))))));
    life21_143 = ((com.moon.l8)((((com.moon.setting.ModeSetting)(this.r)).getValues())[life19_123]));
    life22_146 = ((com.moon.l8)(life21_143)).a__String();
    ((com.moon.jm)(life11_41)).b(((com.moon.hW)(life15_65)), ((java.lang.String)(life22_146)), ((float)(0x1.cp2f)), ((float)((life6_8 + 0x1.0p2f))), ((float)(((((life17_97 + (((float) life19_123) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life11_41)).b(((java.lang.String)(life22_146)), ((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    ((com.moon.jm)(life12_46)).b(((com.moon.hW)(life16_72)), ((java.lang.String)("")), ((float)(0x1.cp2f)), ((float)((((life6_8 + life8_18) - 0x1.1p3f) - 0x1.0p2f))), ((float)(((((life17_97 + (((float) life19_123) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life12_46)).a(((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.nc)(this)).a__lS())).a__kX())).getValue())))).intValue()))).a(((float)(((com.moon.nY)(life20_136)).c()))))).getRGB())));
    if (!((life5_36 == null))) {
        break lexical_join_313;
    }
    if (!((life21_143 == ((com.moon.setting.ModeSetting)(this.r)).getValue()))) {
        break lexical_join_248;
    }
    spill310_3 = this.s;
    if (!((life5_36 == null))) {
        lexicalValue310_250_0 = spill310_3;
        break lexical_join_250;
    }
    if (!((spill310_3 != life19_123))) {
        break lexical_join_248;
    }
    spill310_4 = this;
    if (!((life5_36 == null))) {
        lexicalValue310_243_0 = spill310_4;
        break lexical_join_243;
    }
    if (!((((com.moon.nc)(spill310_4)).s != -1))) {
        break lexical_join_235;
    }
    life23_255 = ((com.moon.nY)(((java.util.Map)(this.o)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.s))))))));
    ((com.moon.nY)(life23_255)).a(((float)(0x1.0p0f)));
    }
    this.s = ((int)(life19_123));
    lexicalValue310_243_0 = ((java.util.Map)(this.o)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life19_123))))));
    }
    life23_268 = ((com.moon.nY)(lexicalValue310_243_0));
    ((com.moon.nY)(life23_268)).a(((float)(0x0.0p0f)));
    }
    lexicalValue310_250_0 = ((((com.moon.nY)(life20_136)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_36 == null))) {
        lexicalValue310_284_0 = lexicalValue310_250_0;
        break lexical_join_284;
    }
    if (!((lexicalValue310_250_0 != 0))) {
        break lexical_join_269;
    }
    spill310_5 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.nY)(life20_136)).c())), ((float)(0x1.0p0f)));
    if (!((life5_36 == null))) {
        lexicalValue310_284_0 = spill310_5;
        break lexical_join_284;
    }
    if (!((spill310_5 == 0))) {
        break lexical_join_269;
    }
    spill310_6 = this.s;
    if (!((life5_36 == null))) {
        lexicalValue310_284_0 = spill310_6;
        break lexical_join_284;
    }
    if (!((spill310_6 != life19_123))) {
        break lexical_join_269;
    }
    ((com.moon.nY)(life20_136)).a(((float)(0x1.0p0f)));
    }
    lexicalValue310_284_0 = ((((com.moon.nc)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life6_8)), ((float)(((life17_97 + (((float) life19_123) * 0x1.1p4f)) - 0x1.0p-1f))), ((float)(life8_18)), ((float)(0x1.2p4f)))) ? 1 : 0);
    }
    if (!((life5_36 == null))) {
        lexicalValue310_289_0 = lexicalValue310_284_0;
        break lexical_join_289;
    }
    if (!((lexicalValue310_284_0 != 0))) {
        break lexical_join_303;
    }
    lexicalValue310_289_0 = this.t;
    }
    if (!((life5_36 == null))) {
        lexicalValue310_302_0 = lexicalValue310_289_0;
        break lexical_join_302;
    }
    if (!((lexicalValue310_289_0 == -1))) {
        break lexical_join_298;
    }
    ((com.moon.nX)(this.p)).a(((float)(((float) life19_123))));
    }
    this.t = ((int)(life19_123));
    lexicalValue310_302_0 = 1;
    }
    life18_99 = lexicalValue310_302_0;
    }
    life19_123 += 1;
    if (!((life5_36 != null))) { continue lexical_cycle_115; }
    break lexical_cycle_115;
    }
    }
    lexicalValue310_307_0 = life18_99;
    }
    if (!((life5_36 == null))) {
        lexicalValue310_315_0 = lexicalValue310_307_0;
        break lexical_join_315;
    }
    if (!((lexicalValue310_307_0 == 0))) {
        break lexical_join_313;
    }
    this.t = ((int)(-1));
    }
    lexicalValue310_315_0 = ((this.u) ? 1 : 0);
    }
    if (!((life5_36 == null))) {
        lexicalValue310_355_0 = lexicalValue310_315_0;
        break lexical_join_355;
    }
    if (!((lexicalValue310_315_0 != 0))) {
        break lexical_join_351;
    }
    ((com.moon.hW)(life14_58)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_8 - 0x1.0p-1f))), ((float)((life17_97 + (((com.moon.nX)(this.p)).b() * 0x1.1p4f)))), ((float)((life8_18 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_84bf6114351d_invokedynamic310_96(10226, (8127523767346590161L ^ life3_3))))).a(((float)((((com.moon.nX)(this.q)).b() * 0x1.0p-2f)))))).getRGB()))))));
    }
    spill310_7 = this;
    if (!((life5_36 == null))) {
        lexicalValue310_365_0 = spill310_7;
        break lexical_join_365;
    }
    lexicalValue310_355_0 = ((com.moon.nc)(spill310_7)).t;
    }
    if (!((lexicalValue310_355_0 != -1))) {
        break lexical_join_364;
    }
    ((com.moon.nX)(this.p)).a(((float)(((float) this.t))), ((double)(0x1.99999ap-2d)));
    }
    lexicalValue310_365_0 = this;
    }
    spill310_8 = ((com.moon.nc)(lexicalValue310_365_0)).q;
    if (!((this.t != -1))) {
        lexicalValue310_372_0 = spill310_8;
        break lexical_join_372;
    }
    lexicalValue310_373_0 = spill310_8;
    lexicalValue310_373_1 = 0x1.0p0f;
    break lexical_join_373;
    }
    lexicalValue310_373_0 = lexicalValue310_372_0;
    lexicalValue310_373_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue310_373_0)).a(((float)(lexicalValue310_373_1)), ((double)(0x1.99999ap-2d)));
    ((com.moon.hW)(life14_58)).a(((com.moon.jA)(life13_53)));
    ((com.moon.hW)(life15_65)).a(((com.moon.jA)(life13_53)));
    ((com.moon.hW)(life16_72)).a(((com.moon.jA)(life13_53)));
    ((com.moon.hW)(life14_58)).b();
    ((com.moon.hW)(life15_65)).b();
    ((com.moon.hW)(life16_72)).b();
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
    spill310_9 = life21_481;
    spill310_10 = 0x0.0p0f;
    spill310_11 = 0x1.0p0f;
    spill310_12 = ((java.lang.Enum)(((java.lang.Enum)(((com.moon.setting.ModeSetting)(this.r)).getValue())))).ordinal();
    if (!((life5_36 == null))) {
        lexicalValue310_422_0 = spill310_9;
        lexicalValue310_422_1 = spill310_10;
        lexicalValue310_422_2 = spill310_11;
        lexicalValue310_422_3 = spill310_12;
        break lexical_join_422;
    }
    if (!((spill310_12 == ((java.lang.Integer)(life20_475)).intValue()))) {
        lexicalValue310_423_0 = spill310_9;
        lexicalValue310_423_1 = spill310_10;
        lexicalValue310_423_2 = spill310_11;
        break lexical_join_423;
    }
    lexicalValue310_422_0 = spill310_9;
    lexicalValue310_422_1 = spill310_10;
    lexicalValue310_422_2 = spill310_11;
    lexicalValue310_422_3 = 1;
    }
    lexicalValue310_424_0 = lexicalValue310_422_0;
    lexicalValue310_424_1 = lexicalValue310_422_1;
    lexicalValue310_424_2 = lexicalValue310_422_2;
    lexicalValue310_424_3 = lexicalValue310_422_3;
    break lexical_join_424;
    }
    lexicalValue310_424_0 = lexicalValue310_423_0;
    lexicalValue310_424_1 = lexicalValue310_423_1;
    lexicalValue310_424_2 = lexicalValue310_423_2;
    lexicalValue310_424_3 = 0;
    }
    ((com.moon.nY)(lexicalValue310_424_0)).a(((float)(lexicalValue310_424_1)), ((float)(lexicalValue310_424_2)), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue310_424_3))));
    if (!((life5_36 != null))) { continue lexical_cycle_395; }
    break lexical_cycle_395;
    }
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2980_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
long local3_life2 = (com.moon.nc.v ^ 5780238268141L);
    float local5_life5 = (((com.moon.nc)(this)).a() + 0x1.0000000000000p+3F);
    float local6_life8 = (((com.moon.nc)(this)).b() + 0x1.2000000000000p+2F);
    float local7_life11 = (((com.moon.nc)(this)).c() - 0x1.0000000000000p+4F);
    com.moon.jm local8_life16 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    com.moon.hW local9_life21 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    float local10_life23 = 0x1.4000000000000p+2F;
    float local11_life27 = (-0x1.6800000000000p+6F * ((com.moon.nY)(this.n)).c());
    org.lwjgl.util.vector.Vector2f local12_life32 = new org.lwjgl.util.vector.Vector2f(((local5_life5 + local7_life11) - 0x1.1000000000000p+3F), (((local6_life8 + 0x1.0p0f) + ((com.moon.jm)(local8_life16)).a(((float)(0x1.c000000000000p+2F)))) + 0x1.1000000000000p+3F));
    org.lwjgl.util.vector.Vector2f local13_life35 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local12_life32)).x + (local10_life23 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local12_life32)).y + (local10_life23 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local14_life38 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local12_life32)).x - (local10_life23 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local12_life32)).y + (local10_life23 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local15_life41 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(local12_life32)).x, (((org.lwjgl.util.vector.Vector2f)(local12_life32)).y - (local10_life23 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local16_life44 = ((com.moon.nc)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life32)), ((org.lwjgl.util.vector.Vector2f)(local15_life41)), ((float)((0x1.6800000000000p+7F + local11_life27))));
    org.lwjgl.util.vector.Vector2f local17_life47 = ((com.moon.nc)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life32)), ((org.lwjgl.util.vector.Vector2f)(local14_life38)), ((float)((0x1.6800000000000p+7F + local11_life27))));
    org.lwjgl.util.vector.Vector2f local18_life50 = ((com.moon.nc)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life32)), ((org.lwjgl.util.vector.Vector2f)(local13_life35)), ((float)((0x1.6800000000000p+7F + local11_life27))));
    ((com.moon.hW)(local9_life21)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(local16_life44)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local16_life44)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local17_life47)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local17_life47)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local18_life50)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local18_life50)).y)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite195_62(23359, (4516731435656421065L ^ local3_life2)))));
    ((com.moon.hW)(local9_life21)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite195_66(23359, (4516731435656421065L ^ local3_life2)))));
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
com.moon.nY lexicalValue309_54_0;
    com.moon.nY lexicalValue309_55_0;
    float lexicalValue309_55_1;
    com.moon.nc lexicalValue309_63_0;
    int lexicalValue309_63_1;
    com.moon.nc lexicalValue309_64_0;
    com.moon.nc lexicalValue309_65_0;
    int lexicalValue309_65_1;
    int lexicalValue309_70_0;
    com.moon.nc lexicalValue309_126_0;
    com.moon.nc lexicalValue309_128_0;
    int lexicalValue309_128_1;
    int lexicalValue309_128_2;
    java.lang.String[] spill309_0;
    boolean spill309_1;
    com.moon.nY spill309_2;
    com.moon.nc spill309_3;
    boolean spill309_4;
    com.moon.nc spill309_5;
    com.moon.nc spill309_6;
    int spill309_7;
    int spill309_8;
    long life4_3;
    float life7_8;
    float life8_14;
    java.lang.String[] life6_15;
    float life9_20;
    com.moon.jm life10_25;
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
    life4_3 = (com.moon.nc.v ^ 133365225765033L);
    life7_8 = (((com.moon.nc)(this)).a() + 0x1.0p3f);
    spill309_0 = com.moon.j3.b();
    life8_14 = (((com.moon.nc)(this)).b() + 0x1.2p2f);
    life6_15 = spill309_0;
    life9_20 = (((com.moon.nc)(this)).c() - 0x1.0p4f);
    life10_25 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    spill309_1 = ((com.moon.nc)(this)).a(((int)(p0)), ((int)(p1)), ((float)((life7_8 - 0x1.0p-1f))), ((float)(((life8_14 + 0x1.8p1f) + ((com.moon.jm)(life10_25)).a(((float)(0x1.cp2f)))))), ((float)((life9_20 + 0x1.0p0f))), ((float)(0x1.1p4f)));
    if (!((life6_15 == null))) {
        lexicalValue309_70_0 = ((spill309_1) ? 1 : 0);
        break lexical_join_70;
    }
    if (!(spill309_1)) {
        break lexical_join_66;
    }
    spill309_2 = this.n;
    if (!(this.u)) {
        lexicalValue309_54_0 = spill309_2;
        break lexical_join_54;
    }
    lexicalValue309_55_0 = spill309_2;
    lexicalValue309_55_1 = 0x1.0p0f;
    break lexical_join_55;
    }
    lexicalValue309_55_0 = lexicalValue309_54_0;
    lexicalValue309_55_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(lexicalValue309_55_0)).a(((float)(lexicalValue309_55_1)));
    spill309_3 = this;
    spill309_4 = this.u;
    if (!((life6_15 == null))) {
        lexicalValue309_63_0 = spill309_3;
        lexicalValue309_63_1 = ((spill309_4) ? 1 : 0);
        break lexical_join_63;
    }
    if (!((!spill309_4))) {
        lexicalValue309_64_0 = spill309_3;
        break lexical_join_64;
    }
    lexicalValue309_63_0 = spill309_3;
    lexicalValue309_63_1 = 1;
    }
    lexicalValue309_65_0 = lexicalValue309_63_0;
    lexicalValue309_65_1 = lexicalValue309_63_1;
    break lexical_join_65;
    }
    lexicalValue309_65_0 = lexicalValue309_64_0;
    lexicalValue309_65_1 = 0;
    }
    ((com.moon.nc)(lexicalValue309_65_0)).u = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue309_65_1)));
    }
    spill309_5 = this;
    if (!((life6_15 == null))) {
        lexicalValue309_126_0 = spill309_5;
        break lexical_join_126;
    }
    lexicalValue309_70_0 = ((((com.moon.nc)(spill309_5)).u) ? 1 : 0);
    }
    if (!((lexicalValue309_70_0 != 0))) {
        break lexical_join_125;
    }
    life11_88 = (life8_14 + 0x1.dp4f);
    life12_90 = 0;
    lexical_cycle_77: while (true) {
    lexical_join_123: {
    lexical_join_122: {
    if (!((life12_90 < (((com.moon.setting.ModeSetting)(this.r)).getValues()).length))) {
        break lexical_join_125;
    }
    life13_103 = (life11_88 + (((float) life12_90) * 0x1.1p4f));
    if (!((life6_15 == null))) {
        break lexical_join_123;
    }
    spill309_6 = this;
    spill309_7 = p0;
    spill309_8 = p1;
    if (!((life6_15 == null))) {
        lexicalValue309_128_0 = spill309_6;
        lexicalValue309_128_1 = spill309_7;
        lexicalValue309_128_2 = spill309_8;
        break lexical_join_128;
    }
    if (!(((com.moon.nc)(spill309_6)).a(((int)(spill309_7)), ((int)(spill309_8)), ((float)((life7_8 - 0x1.0p-1f))), ((float)(life13_103)), ((float)((life9_20 + 0x1.0p0f))), ((float)(0x1.1p4f))))) {
        break lexical_join_122;
    }
    if (!((p2 == 0))) {
        break lexical_join_122;
    }
    ((com.moon.setting.ModeSetting)(this.r)).setValue(((java.lang.Object)(((java.lang.Enum)(((com.moon.nc)(this)).a(((java.lang.Object)((((com.moon.setting.ModeSetting)(this.r)).getValues())[life12_90]))))))));
    if (!((life6_15 != null))) {
        break lexical_join_125;
    }
    }
    life12_90 += 1;
    }
    if (!((life6_15 != null))) { continue lexical_cycle_77; }
    break lexical_cycle_77;
    }
    }
    lexicalValue309_126_0 = this;
    }
    lexicalValue309_128_0 = lexicalValue309_126_0;
    lexicalValue309_128_1 = p0;
    lexicalValue309_128_2 = p1;
    }
    __sourceIntrinsic_e4d4f5a69301_call309_29(lexicalValue309_128_0, lexicalValue309_128_1, lexicalValue309_128_2, p2);
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.r;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21241;
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
            throw new RuntimeException("com/moon/nc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         x[var3] = var15;
      }

      return x[var3];
}


private static native <E extends Throwable> long __sourceIntrinsic_5d7634c74b162fda_originalDynamicSite194_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_5d7634c74b162fda_originalDynamicSite194_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite195_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite195_66(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call309_29(com.moon.nc a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2980_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2976_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic1098_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic1098_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic1098_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84bf6114351d_invokedynamic310_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84bf6114351d_invokedynamic310_96(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
