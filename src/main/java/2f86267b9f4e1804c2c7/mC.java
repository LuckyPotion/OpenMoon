package com.moon;


public class mC extends com.moon.mA {

private final com.moon.setting.BezierSetting h;

private int s;

private static final long t;

private static final java.lang.String[] u;

private static final java.lang.String[] v;

private static final java.util.Map w;

public mC(com.moon.setting.BezierSetting p0, float p1, float p2, float p3, float p4) {
super();
    this.h = p0;
    this.e = p1;
    this.f = p2;
    this.g = p3;
    this.i = p4;
}


static {
t = ((long)(((moom._a)(moom._c.a(((long)(-799819313271776803L)), ((long)(-1781409778899723399L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(231529203300360L)))));

    w = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.mC.t ^ 126710038189142L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill326_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill326_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill326_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill326_14 = new byte[8];

    (__sourceSpill326_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill326_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation326_16 = __sourceSpill326_14;

    ((javax.crypto.Cipher)(__sourceSpill326_11)).init(((int)(__sourceSpill326_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill326_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation326_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = ";Å­¡¿\003­Áý¢i®LK\020?\035ðåJò\rg°N;rð"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill326_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill326_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill326_29)).doFinal(((byte[])(__sourceSpill326_28)));

        java.lang.String __sourceSpill326_34 = ((java.lang.String)(com.moon.mC.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill326_35 = local9_life19;

        int __sourceSpill326_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill326_35)[__sourceSpill326_36] = __sourceSpill326_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "MÊ/´¶;qXýrý!0-¿´Ù\016ãÉP\025\f÷O\f=¶\034ëd\036dª©çî¸,r±\032ªö}ÅDÀ\023ws ú½k÷/4ZhÃÀÙ,ñ:.£(îiÔr´\t¸ô\020nDç¢,G¹&¡õ±âd9<"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill326_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill326_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill326_43)).doFinal(((byte[])(__sourceSpill326_42)));

        java.lang.String __sourceSpill326_48 = ((java.lang.String)(com.moon.mC.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill326_49 = local9_life19;

        int __sourceSpill326_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill326_49)[__sourceSpill326_50] = __sourceSpill326_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    u = ((java.lang.String[])(local9_life19));

    v = ((java.lang.String[])(new java.lang.String[4]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void e__sourceReturn_da8c82d5d4() {
return;
}


private void d__sourceReturn_da8c82d5d4() {
return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_72835370e4f0f5(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill918_0 = p0;
        life4_9 += 1;
        life5_44 = (spill918_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill918_1 = p0;
        life4_9 += 1;
        life5_76 = (spill918_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill918_2 = p0;
        life4_9 += 1;
        life5_91 = (spill918_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26022);
    if (((com.moon.mC.v)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.mC.w)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.mC.w)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/mC", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.mC.u)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.mC.v)[life5_8] = __sourceExactCall_2514f030f35a4a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.mC.v)[life5_8];
}


public boolean a__Boolean(int p0, int p1, int p2) {
int forwardValue693_109_0;
    int forwardValue693_114_0;
    int forwardValue693_116_0;
    boolean spill693_0;
    boolean spill693_1;
    long life4_3;
    java.lang.String life7_9;
    float life8_27;
    float life9_34;
    int life6_35;
    float life10_47;
    float life11_55;
    forward_join_116: {
    forward_join_115: {
    forward_join_114: {
    forward_join_109: {
    forward_join_107: {
    life4_3 = (com.moon.mC.t ^ 65077633069370L);
    life7_9 = __sourceIntrinsic_7c2f014c093b_invokedynamic693_1(6329, (2751299729202654346L ^ life4_3));
    spill693_0 = com.moon.mN.d__Boolean();
    life8_27 = ((((((com.moon.mC)(this)).e + ((com.moon.mC)(this)).g) - ((com.moon.mC)(this)).k) - ((com.moon.jm)(((com.moon.mC)(this)).a)).a(((java.lang.String)(life7_9)), ((float)(0x1.ecccccp2f)))) - 0x1.8p2f);
    life9_34 = (((com.moon.jm)(((com.moon.mC)(this)).a)).a(((float)(0x1.ecccccp2f))) + 0x1.8p2f);
    life6_35 = ((spill693_0) ? 1 : 0);
    life10_47 = ((((com.moon.mC)(this)).f + (((com.moon.mC)(this)).i / 0x1.0p1f)) - (life9_34 / 0x1.0p1f));
    life11_55 = (((com.moon.jm)(((com.moon.mC)(this)).a)).a(((java.lang.String)(life7_9)), ((float)(0x1.ecccccp2f))) + 0x1.8p2f);
    spill693_1 = ((com.moon.mC)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life8_27)), ((float)(life10_47)), ((float)(life11_55)), ((float)(life9_34)));
    if (!((life6_35 == 0))) {
        forwardValue693_109_0 = ((spill693_1) ? 1 : 0);
        break forward_join_109;
    }
    if (!(spill693_1)) {
        break forward_join_107;
    }
    ((com.moon.pj)(((com.moon.module.impl.ClickGUI)(((com.moon.mC)(this)).b)).a__pj())).a(((com.moon.mQ)(new com.moon.mQ(((com.moon.mS)(((com.moon.mS)(((com.moon.mS)(((com.moon.mS)(((com.moon.mS)(((com.moon.mS)(((com.moon.mS)(((com.moon.mS)(com.moon.mR.a())).a(((java.lang.String)(__sourceIntrinsic_7c2f014c093b_invokedynamic693_20(30249, (8427639726260437528L ^ life4_3))))))).b(((java.lang.String)(__sourceIntrinsic_7c2f014c093b_invokedynamic693_22(9134, (6719163312821573534L ^ life4_3))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_7c2f014c093b_invokedynamic693_24(this)))))).b(((java.util.function.Supplier)(__sourceIntrinsic_7c2f014c093b_invokedynamic693_26(this)))))).a(((com.moon.pj)(((com.moon.module.impl.ClickGUI)(((com.moon.mC)(this)).b)).a__pj()))))).a(((com.moon.mT)(new com.moon.mU(this.h)))))).a(((java.util.List)(java.util.List.of(((java.lang.Object)(com.moon.mV.a)))))))).a()))));
    }
    forwardValue693_109_0 = this.s;
    }
    if (!((life6_35 == 0))) {
        forwardValue693_114_0 = forwardValue693_109_0;
        break forward_join_114;
    }
    if (!((forwardValue693_109_0 != -1))) {
        break forward_join_115;
    }
    forwardValue693_114_0 = 1;
    }
    forwardValue693_116_0 = forwardValue693_114_0;
    break forward_join_116;
    }
    forwardValue693_116_0 = 0;
    }
    return ((forwardValue693_116_0) != 0);
}


public void a(int p0, int p1) {
long life3_3;
    com.moon.jC life6_16;
    int life5_17;
    com.moon.hW life7_25;
    java.lang.String life8_65;
    float life9_82;
    float life10_89;
    float life11_101;
    float life12_109;
    com.moon.hW life13_114;
    life3_3 = (com.moon.mC.t ^ 31504265921543L);
    ((com.moon.mC)(this)).c__Void();
    boolean spill692_0 = com.moon.mN.d__Boolean();
    life6_16 = com.moon.jC.a(((float)(((com.moon.mC)(this)).l)), ((float)(((com.moon.mC)(this)).m)), ((float)(((com.moon.mC)(this)).n)), ((float)(((com.moon.mC)(this)).o)));
    life5_17 = ((spill692_0) ? 1 : 0);
    life7_25 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(((com.moon.mC)(this)).a))))).a();
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(((com.moon.mC)(this)).a)), ((com.moon.hW)(life7_25)), ((java.lang.String)(((com.moon.setting.BezierSetting)(this.h)).getDisplayName())), ((float)(0x1.0147acp3f)), ((float)(((__sourceExactCall_6f9f9c961f7cb6(((com.moon.mC)(this))) + ((com.moon.mC)(this)).k) + 0x1.0p0f))), ((float)((((((com.moon.mC)(this)).a() + (((com.moon.mC)(this)).i / 0x1.0p1f)) - (((com.moon.jm)(((com.moon.mC)(this)).a)).a(((float)(0x1.0147acp3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.v)(((com.moon.mC)(this)).p)).v())));
    life8_65 = __sourceIntrinsic_fd0ba049c90e_invokedynamic692_27(298, (5610382362464043045L ^ life3_3));
    life9_82 = ((((((com.moon.mC)(this)).e + ((com.moon.mC)(this)).g) - ((com.moon.mC)(this)).k) - ((com.moon.jm)(((com.moon.mC)(this)).a)).a(((java.lang.String)(life8_65)), ((float)(0x1.ecccccp2f)))) - 0x1.8p2f);
    life10_89 = (((com.moon.jm)(((com.moon.mC)(this)).a)).a(((float)(0x1.ecccccp2f))) + 0x1.8p2f);
    life11_101 = ((((com.moon.mC)(this)).f + (((com.moon.mC)(this)).i / 0x1.0p1f)) - (life10_89 / 0x1.0p1f));
    life12_109 = (((com.moon.jm)(((com.moon.mC)(this)).a)).a(((java.lang.String)(life8_65)), ((float)(0x1.ecccccp2f))) + 0x1.8p2f);
    life13_114 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    __sourceExactCall_644ec120141bcc(((com.moon.hW)(life13_114)), ((com.moon.iX)(__sourceExactCall_715fe8e25dfedc(((float)(life9_82)), ((float)(life11_101)), ((float)(life12_109)), ((float)(life10_89)), ((float)(0x1.0p2f)), ((int)(((com.v)(__sourceExactCall_ccd2e8b17ebd66(((com.moon.mC)(this))))).a()))))));
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(((com.moon.mC)(this)).a)), ((com.moon.hW)(life7_25)), ((java.lang.String)(life8_65)), ((float)(0x1.ecccccp2f)), ((float)((life9_82 + 0x1.8p1f))), ((float)((life11_101 + 0x1.cp1f))), ((int)(__sourceExactCall_66349b953a09b2(((com.v)(__sourceExactCall_ccd2e8b17ebd66(((com.moon.mC)(this)))))))));
    __sourceExactCall_7eb685242a436c(((com.moon.hW)(life13_114)), ((com.moon.jA)(life6_16)));
    ((com.moon.hW)(life7_25)).a(((com.moon.jA)(life6_16)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life13_114)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life7_25)));
    ((com.moon.mC)(this)).j = ((float)(0x1.cp3f));
    super.a(((int)(p0)), ((int)(p1)));
    if ((life5_17 != 0)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.BezierSetting)(this.h)).isAvailable())) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2171_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, int p2) {
this.s = ((int)(-1));
    return;
}


private java.lang.Float lambda$mouseClicked$1() {
return java.lang.Float.valueOf(((float)((((com.moon.mC)(this)).f + (((com.moon.mC)(this)).i / 0x1.0p1f)))));
}


private java.lang.Float lambda$mouseClicked$0() {
return java.lang.Float.valueOf(((float)((((com.moon.mC)(this)).e + (((com.moon.mC)(this)).g / 0x1.0p1f)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fd0ba049c90e_invokedynamic692_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2171_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7c2f014c093b_invokedynamic693_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7c2f014c093b_invokedynamic693_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7c2f014c093b_invokedynamic693_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_7c2f014c093b_invokedynamic693_24(com.moon.mC a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_7c2f014c093b_invokedynamic693_26(com.moon.mC a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native java.lang.String __sourceExactCall_72835370e4f0f5(int p0, long p1);
private static native java.lang.String __sourceExactCall_2514f030f35a4a(byte[] p0);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native float __sourceExactCall_6f9f9c961f7cb6(com.moon.mC p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);

private static native void __sourceExactCall_644ec120141bcc(com.moon.hW p0, com.moon.iX p1);
private static native com.moon.i3 __sourceExactCall_715fe8e25dfedc(float p0, float p1, float p2, float p3, float p4, int p5);
private static native com.v __sourceExactCall_ccd2e8b17ebd66(com.moon.mC p0);
private static native void __sourceExactCall_7eb685242a436c(com.moon.hW p0, com.moon.jA p1);

private static native void __sourceExactCall_1949570a13ee94(com.moon.jm p0, com.moon.hW p1, java.lang.String p2, float p3, float p4, float p5, int p6);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);
}
