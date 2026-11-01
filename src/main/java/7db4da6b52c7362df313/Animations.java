package com.moon.module.impl;


public class Animations extends com.moon.module.Module {

private com.moon.setting.ModeSetting<com.moon.bM> s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.IntegerSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.FloatSetting w;

private com.moon.setting.FloatSetting x;

private com.moon.setting.FloatSetting y;

private static long z;

private static java.lang.String[] A;

private static java.lang.String[] B;

private static java.util.Map C;

private static long D;

public Animations(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_da5ac3ab2cd5ed2f(com.moon.module.impl.Animations receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.Animations.z ^ 16859923744702L);

    com.moon.module.impl.Animations.__sourceConstructorInit_da5ac3ab2cd5ed2f_0(((com.moon.module.impl.Animations)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Animations)(receiver)).s = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_5(17147, (7066443095853906213L ^ local5_life2)))), ((java.lang.Class)(com.moon.bM.class))))).a(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_9(7477, (2402617958738421474L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bM.V1_7))))).a()));

    ((com.moon.module.impl.Animations)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_15(30402, (1338847819707157777L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_18(14782, (1036709842082185825L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.Animations __sourceSpill0_30 = receiver;

    com.moon.mf __sourceSpill0_31 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_23(3088, (4137597498677131206L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_26(32682, (3495485201235903601L ^ local5_life2)))), ((int)(5)), ((int)(1)), ((int)(((int) com.moon.module.impl.Animations.D))), ((int)(1)));

    com.moon.setting.BooleanSetting __sourceEffectfulDup0_32 = ((com.moon.module.impl.Animations)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill0_34 = __sourceEffectfulDup0_32;

    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup0_32)));

    ((com.moon.module.impl.Animations)(__sourceSpill0_30)).u = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill0_31)).a(((java.util.function.Supplier)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_35(__sourceSpill0_34)))))).a()));

    ((com.moon.module.impl.Animations)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_40(20912, (6121409671182854753L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_43(19725, (6133709791791986388L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Animations)(receiver)).w = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_48(18746, (2751073379015340768L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_51(23554, (3118674632565139410L ^ local5_life2)))), ((float)(0x0.0p0f)), ((float)(-1077936128)), ((float)(0x1.0p0f)), ((float)(1020054733))))).a()));

    ((com.moon.module.impl.Animations)(receiver)).x = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_58(9686, (3855946492445777422L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_61(461, (2534124505180338704L ^ local5_life2)))), ((float)(0x0.0p0f)), ((float)(-1090519040)), ((float)(0x1.0p0f)), ((float)(1020054733))))).a()));

    ((com.moon.module.impl.Animations)(receiver)).y = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_68(25102, (5080649973211371986L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_71(29382, (597636526568835348L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(1036831949)), ((float)(1077936128)), ((float)(1020054733))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_da5ac3ab2cd5ed2f_0(com.moon.module.impl.Animations a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
z = ((long)(((moom._a)(moom._c.a(((long)(-8087448975784386952L)), ((long)(-6538710511876282916L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(214745066784930L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.module.impl.Animations.z ^ 83632891402412L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill255_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill255_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill255_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill255_14 = new byte[8];
    (__sourceSpill255_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill255_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation255_16 = __sourceSpill255_14;
    ((javax.crypto.Cipher)(__sourceSpill255_11)).init(((int)(__sourceSpill255_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill255_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation255_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[14];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "X|®¡zz,Bqg¨ç(Ó\"ÐÙÛ|4¹VÕ\020øÁÊ\035ÕuÚ~jÍP0êTt·<\"Òë\"Õ\036V\020e&=¬Û:#åæuQ8Ûº(´IlxYãôÄÀ®ÖÃ(æQÚ.Ø;YÛ\0074\0279{ÚN\t<{\177¼k\020ª\177ÏC@\021u@m\f.Xæ^(Ý{\032\026¬NQ#% ãëíÑDñy­Ièí*³\001ª3P}«\034{±¤<\031J,Q\020ïíñÄÞ¾Fdî.\\Uº{q Ò\033³E8©õ\035I2É \013®§ÿj\027º2Ó41W\020îz\020\rVóÊç\037Ì\006 ¹6jÇÕì(¦\013r®F\016îüí¤5ÜYº\021(!áñ#Ò/øeÿÁ¶i|ò¡ ýôãé&5\021Ñ\\ÐÕ\024âú]2Íº¡ÏýÌÿxýÅ´QZ(vH¦8\030\005G\002ö7Uõtãgîûá^ë(®TüìMµÑPG9s\025sº/\031\006"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill255_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill255_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill255_29)).doFinal(((byte[])(__sourceSpill255_28)));
        java.lang.String __sourceSpill255_34 = ((java.lang.String)(com.moon.module.impl.Animations.c(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill255_35 = local14_life19;
        int __sourceSpill255_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill255_35)[__sourceSpill255_36] = __sourceSpill255_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "\007pïF[ëFwí]âù~ÃíPNÖÃÜD\016Áê§\177ìÓ\030Mè\020\013ÿ`ãÈ31¡\034Àã¦\020"))).length();
    local10_life24 = 40;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill255_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill255_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill255_42)).doFinal(((byte[])(__sourceSpill255_41)));
        java.lang.String __sourceSpill255_47 = ((java.lang.String)(com.moon.module.impl.Animations.c(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill255_48 = local14_life19;
        int __sourceSpill255_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill255_48)[__sourceSpill255_49] = __sourceSpill255_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    A = ((java.lang.String[])(local14_life19));
    B = ((java.lang.String[])(new java.lang.String[14]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill255_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill255_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill255_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill255_59 = new byte[8];
    (__sourceSpill255_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill255_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation255_61 = __sourceSpill255_59;
    ((javax.crypto.Cipher)(__sourceSpill255_56)).init(((int)(__sourceSpill255_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill255_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation255_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -301547230237593568L;
    byte[] __sourceSpill255_65 = new byte[8];
    (__sourceSpill255_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill255_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill255_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill255_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill255_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill255_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill255_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill255_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill255_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill255_66)).doFinal(((byte[])(__sourceSpill255_65)));
    D = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


public com.moon.setting.BooleanSetting b() {
return this.v;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.x;
}


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
        byte[] spill1010_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1010_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1010_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1010_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1010_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1010_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25850);
    if (((com.moon.module.impl.Animations.B)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Animations.C)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Animations.C)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lP", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Animations.A)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Animations.B)[life5_8] = com.moon.module.impl.Animations.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Animations.B)[life5_8];
}


public com.moon.setting.FloatSetting c() {
return this.y;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Animations.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2322_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.IntegerSetting a() {
return this.u;
}


public com.moon.setting.ModeSetting<com.moon.bM> a__kY() {
return this.s;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.t;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.w;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_35(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da5ac3ab2cd5ed2f_originalDynamicSite0_71(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2322_0() throws E;
}
