package com.moon;


public class m6 extends com.moon.m5 {

private final com.moon.nX n;

private final com.moon.setting.BezierSetting o;

private static final long p;

private static final java.lang.String[] q;

private static final java.lang.String[] r;

private static final java.util.Map s;

public m6(com.moon.nh p0, com.moon.setting.BezierSetting p1, float p2, float p3, float p4, float p5) {
super(p0, p2, p3, p4, p5);
    this.n = new com.moon.nX();
    this.o = p1;
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(1922258788091947075L)), ((long)(1189068479060412753L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57702896189012L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.m6.p ^ 96181348499104L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill323_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill323_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill323_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill323_14 = new byte[8];
    (__sourceSpill323_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill323_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation323_16 = __sourceSpill323_14;
    ((javax.crypto.Cipher)(__sourceSpill323_11)).init(((int)(__sourceSpill323_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill323_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation323_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[4];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "à<Êô.å\013±¥S;ò\030Bÿ\024\004@ ©çÂ(\020\037ñÝÀqG@\003°Mò"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill323_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill323_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill323_29)).doFinal(((byte[])(__sourceSpill323_28)));
        java.lang.String __sourceSpill323_34 = ((java.lang.String)(com.moon.m6.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill323_35 = local9_life19;
        int __sourceSpill323_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill323_35)[__sourceSpill323_36] = __sourceSpill323_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "«\036±ãçÎã6mð2\035c\003h\035)ôQÀ<0oB5m°s\026+ÈtÂù\000ÓtÅlÔ@\0310\n²ùsF(*\025\002\034Èý,áÂ±\001^\027\177Øþ\031[¸-\r\024Ó@ÁÞ\020Î#£NH\003QõÍÐé\020c\005C"))).length();
    local5_life24 = 80;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill323_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill323_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill323_43)).doFinal(((byte[])(__sourceSpill323_42)));
        java.lang.String __sourceSpill323_48 = ((java.lang.String)(com.moon.m6.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill323_49 = local9_life19;
        int __sourceSpill323_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill323_49)[__sourceSpill323_50] = __sourceSpill323_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    q = ((java.lang.String[])(local9_life19));
    r = ((java.lang.String[])(new java.lang.String[4]));
}


public void c(int p0, int p1) {
long life3_3;
    float life5_8;
    float life6_13;
    float life7_18;
    com.moon.jm life8_23;
    com.moon.hW life9_28;
    com.moon.hW life10_35;
    life3_3 = (com.moon.m6.p ^ 36420500442793L);
    life5_8 = (((com.moon.m6)(this)).a() + 0x1.0p3f);
    life6_13 = (((com.moon.m6)(this)).b() + 0x1.2p2f);
    life7_18 = (((com.moon.m6)(this)).c() - 0x1.0p4f);
    life8_23 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life9_28 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life10_35 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life8_23))))).a();
    ((com.moon.hW)(life9_28)).a(((com.moon.iX)(com.moon.i3.a(((float)(life5_8)), ((float)(life6_13)), ((float)(life7_18)), ((float)(0x1.5p4f)), ((float)(0x1.8p2f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m6)(this)).a__lS())).a__kX())).getValue())))).intValue()))))));
    ((com.moon.hW)(life9_28)).a(((com.moon.iX)(com.moon.i3.a(((float)(life5_8)), ((float)(life6_13)), ((float)(life7_18)), ((float)(0x1.5p4f)), ((float)(0x1.8p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m6)(this)).a__lS())).a__kX())).getValue())))).intValue()))).b())).a(((float)(((com.moon.nX)(this.n)).b()))))).getRGB()))))));
    com.moon.jm spill671_0 = life8_23;
    com.moon.hW spill671_1 = life10_35;
    java.lang.String __stackOp671_39_0 = ((com.moon.setting.BezierSetting)(this.o)).getDisplayName();
    java.lang.String __stackOp671_39_1 = __sourceIntrinsic_505b8c2844d4_invokedynamic671_38(3025, (2626609920661407473L ^ life3_3));
    java.lang.String spill671_2 = __sourceIntrinsic_505b8c2844d4_invokedynamic671_40(__stackOp671_39_1, __stackOp671_39_0);
    float spill671_3 = 0x1.ep2f;
    float spill671_4 = (life5_8 + (life7_18 / 0x1.0p1f));
    com.moon.jm spill671_5 = life8_23;
    java.lang.String __stackOp671_44_0 = ((com.moon.setting.BezierSetting)(this.o)).getDisplayName();
    java.lang.String __stackOp671_44_1 = __sourceIntrinsic_505b8c2844d4_invokedynamic671_43(576, (2499579829834207075L ^ life3_3));
    ((com.moon.jm)(spill671_0)).b(((com.moon.hW)(spill671_1)), ((java.lang.String)(spill671_2)), ((float)(spill671_3)), ((float)((spill671_4 - (((com.moon.jm)(spill671_5)).a(((java.lang.String)(__sourceIntrinsic_505b8c2844d4_invokedynamic671_45(__stackOp671_44_1, __stackOp671_44_0))), ((float)(0x1.ep2f))) / 0x1.0p1f)))), ((float)((((life6_13 + 0x1.5p3f) - (((com.moon.jm)(life8_23)).a(((float)(0x1.ep2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    ((com.moon.hW)(life9_28)).b();
    ((com.moon.hW)(life10_35)).b();
    com.moon.nX spill671_6 = this.n;
    ((com.moon.nX)(spill671_6)).a(((float)((((com.moon.m6)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life5_8)), ((float)(life6_13)), ((float)(life7_18)), ((float)(0x1.5p4f))) ? 0x1.0p0f : 0x0.0p0f))), ((double)(0x1.333334p-2d)));
    this.k = ((float)(0x1.98p4f));
    super.c(((int)(p0)), ((int)(p1)));
    return;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.BezierSetting)(this.o)).isAvailable())) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23606);
    if (((com.moon.m6.r)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.m6.s)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.m6.s)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/m6", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.m6.q)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.m6.r)[life5_8] = com.moon.m6.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.m6.r)[life5_8];
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
        byte[] spill894_0 = p0;
        life4_9 += 1;
        life5_44 = (spill894_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill894_1 = p0;
        life4_9 += 1;
        life5_76 = (spill894_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill894_2 = p0;
        life4_9 += 1;
        life5_91 = (spill894_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.m6.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, int p2) {
com.moon.m6 forwardValue670_77_0;
    int forwardValue670_77_1;
    int forwardValue670_77_2;
    net.minecraft.entity.Entity[] spill670_0;
    com.moon.m6 spill670_1;
    int spill670_2;
    int spill670_3;
    long life4_3;
    float life7_9;
    float life8_14;
    net.minecraft.entity.Entity[] life6_15;
    float life9_20;
    forward_join_77: {
    forward_join_74: {
    life4_3 = (com.moon.m6.p ^ 11351853238007L);
    spill670_0 = moom.lw.b__Arrayr3();
    life7_9 = (((com.moon.m6)(this)).a() + 0x1.0p3f);
    life8_14 = (((com.moon.m6)(this)).b() + 0x1.2p2f);
    life6_15 = spill670_0;
    life9_20 = (((com.moon.m6)(this)).c() - 0x1.0p4f);
    spill670_1 = this;
    spill670_2 = p0;
    spill670_3 = p1;
    if (!((life6_15 == null))) {
        forwardValue670_77_0 = spill670_1;
        forwardValue670_77_1 = spill670_2;
        forwardValue670_77_2 = spill670_3;
        break forward_join_77;
    }
    if (!(((com.moon.m6)(spill670_1)).a(((int)(spill670_2)), ((int)(spill670_3)), ((float)(life7_9)), ((float)(life8_14)), ((float)(life9_20)), ((float)(0x1.5p4f))))) {
        break forward_join_74;
    }
    if (!((p2 == 0))) {
        break forward_join_74;
    }
    ((com.moon.pk)(((com.moon.module.impl.ClickGUI)(((com.moon.m6)(this)).a__lS())).a__pk())).a(((com.moon.nk)(new com.moon.nk(((com.moon.nm)(((com.moon.nm)(((com.moon.nm)(((com.moon.nm)(((com.moon.nm)(((com.moon.nm)(((com.moon.nm)(((com.moon.nm)(com.moon.nl.a())).a(((java.lang.String)(__sourceIntrinsic_e4d4f5a69301_invokedynamic670_9(2491, (8913650902532492487L ^ life4_3))))))).b(((java.lang.String)(__sourceIntrinsic_e4d4f5a69301_invokedynamic670_11(11304, (8722687648258468183L ^ life4_3))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_e4d4f5a69301_invokedynamic670_13(this)))))).b(((java.util.function.Supplier)(__sourceIntrinsic_e4d4f5a69301_invokedynamic670_15(this)))))).a(((com.moon.pk)(((com.moon.module.impl.ClickGUI)(((com.moon.m6)(this)).a__lS())).a__pk()))))).a(((com.moon.nn)(new com.moon.no(this.o)))))).a(((java.util.List)(java.util.List.of(((java.lang.Object)(com.moon.np.a)))))))).a()))));
    }
    forwardValue670_77_0 = this;
    forwardValue670_77_1 = p0;
    forwardValue670_77_2 = p1;
    }
    __sourceIntrinsic_e4d4f5a69301_call670_27(forwardValue670_77_0, forwardValue670_77_1, forwardValue670_77_2, p2);
    return;
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.o;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2137_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private java.lang.Float lambda$mouseClicked$1() {
return java.lang.Float.valueOf(((float)(((((com.moon.m6)(this)).b() + ((com.moon.m6)(this)).d()) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m6)(this)).a__lS())).a__kZ())).getValue())))).floatValue()))));
}


private java.lang.Float lambda$mouseClicked$0() {
return java.lang.Float.valueOf(((float)(((((com.moon.m6)(this)).a() + (((com.moon.m6)(this)).c() / 0x1.0p1f)) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m6)(this)).a__lS())).a__kZ())).getValue())))).floatValue()))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic671_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic671_40(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic671_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_505b8c2844d4_invokedynamic671_45(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e4d4f5a69301_invokedynamic670_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e4d4f5a69301_invokedynamic670_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_e4d4f5a69301_invokedynamic670_13(com.moon.m6 a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_e4d4f5a69301_invokedynamic670_15(com.moon.m6 a0) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call670_27(com.moon.m6 a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2137_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
