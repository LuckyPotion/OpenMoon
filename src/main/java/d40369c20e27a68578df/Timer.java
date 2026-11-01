package com.moon.module.impl;


public class Timer extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.bK> s;

private com.moon.setting.FloatSetting t;

private com.moon.setting.FloatSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.FloatSetting w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.BooleanSetting y;

private static long z;

private static java.lang.String[] A;

private static java.lang.String[] B;

private static java.util.Map C;

public Timer(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_3b3c4b66a715d52d(com.moon.module.impl.Timer receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.Timer.z ^ 47944940590876L);

    com.moon.module.impl.Timer.__sourceConstructorInit_3b3c4b66a715d52d_0(((com.moon.module.impl.Timer)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Timer)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_5(14014, (7583347584440617924L ^ local5_life2)))), ((java.lang.Class)(com.moon.bK.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_9(11912, (5349511155645240311L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bK.NORMAL))))).a()));

    ((com.moon.module.impl.Timer)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_15(2994, (564264782081554126L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_18(28774, (6291213108283608339L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(1036831949)), ((float)(1092616192)), ((float)(1028443341))))).a()));

    ((com.moon.module.impl.Timer)(receiver)).u = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_26(14475, (2892269500374926844L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_29(25768, (4669543143202265557L ^ local5_life2)))), ((float)(1050253722)), ((float)(1036831949)), ((float)(1063675494)), ((float)(1028443341))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_35(receiver)))))).a()));

    ((com.moon.module.impl.Timer)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_40(2383, (2805418574210528316L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_43(10861, (5678584050494691099L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.Timer __sourceSpill8_55 = receiver;

    com.moon.md __sourceSpill8_56 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_48(12646, (1370448533322353686L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_51(11836, (482681855479272269L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(1109393408)), ((float)(0x1.0p0f)));

    com.moon.setting.BooleanSetting __sourceEffectfulDup8_57 = ((com.moon.module.impl.Timer)(receiver)).v;

    com.moon.setting.BooleanSetting __sourceSpill8_59 = __sourceEffectfulDup8_57;

    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup8_57)));

    ((com.moon.module.impl.Timer)(__sourceSpill8_55)).w = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(__sourceSpill8_56)).a(((java.util.function.Supplier)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_60(__sourceSpill8_59)))))).a()));

    ((com.moon.module.impl.Timer)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_65(27895, (2991115394960822665L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_68(22240, (5194077675294108571L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_70(receiver)))))).a()));

    ((com.moon.module.impl.Timer)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_75(22379, (1163189262222830111L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_78(10494, (7892690101720012172L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_80(receiver)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3b3c4b66a715d52d_0(com.moon.module.impl.Timer a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
z = ((long)(((moom._a)(moom._c.a(((long)(-257100646011780876L)), ((long)(-1097639163151330736L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27043601097645L)))));

    C = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.Timer.z ^ 122229748410452L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill399_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill399_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill399_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill399_14 = new byte[8];

    (__sourceSpill399_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill399_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation399_16 = __sourceSpill399_14;

    ((javax.crypto.Cipher)(__sourceSpill399_11)).init(((int)(__sourceSpill399_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill399_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation399_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[14];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "Ý\n¹»·.\022fï\020\004\003\b`Lï3²\0060~Ö+Ó\030LxOÛÿiN,q[n\007èÀE¯£p(ªª&sú\026R#)&TL>Z_QÜ<÷8å|õ¦ëòßZ´]].Âo\001ÿûÙ\t\020\033ü\033ë«dkÐ½Ü§\020¥æ(Ýqí\030¡ÓÈþU\026ÁËAn\026É~ó@ª\004×ðÍÝK5W3\030.PàÎ 3^l\027¶Zíd¨¤Þi+FZì·aÛy/\005º§½/¯á\020cBdJ í¬ÙÏ)Þ\031xVh\020Å].²²\021Am\001FpßSï\030o¨!HµLa\026-\031z37\035ÖÝz\016\020êo^=ÛÏ\ru\027ç¥¼U5\020Zø]æò\023üLrKåÞ³\007ñ ¹r\032MµWË\030uÃÎB<<Óè\b7\nKkµ'0é"))).length();

    int local5_life24 = 24;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill399_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill399_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill399_29)).doFinal(((byte[])(__sourceSpill399_28)));

        java.lang.String __sourceSpill399_34 = ((java.lang.String)(com.moon.module.impl.Timer.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill399_35 = local9_life19;

        int __sourceSpill399_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill399_35)[__sourceSpill399_36] = __sourceSpill399_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "[_,â@Ï<ë'àß\023L0¥+\003\000\001+\020eûB%å°º\006ÐØô«<ëe"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill399_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill399_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill399_43)).doFinal(((byte[])(__sourceSpill399_42)));

        java.lang.String __sourceSpill399_48 = ((java.lang.String)(com.moon.module.impl.Timer.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill399_49 = local9_life19;

        int __sourceSpill399_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill399_49)[__sourceSpill399_50] = __sourceSpill399_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    A = ((java.lang.String[])(local9_life19));

    B = ((java.lang.String[])(new java.lang.String[14]));
}


public com.moon.setting.FloatSetting b__kZ() {
return this.u;
}


public com.moon.setting.BooleanSetting b() {
return this.x;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2737_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill1250_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1250_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1250_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1250_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1250_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1250_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18326);
    if (((com.moon.module.impl.Timer.B)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Timer.C)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Timer.C)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lO", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Timer.A)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Timer.B)[life5_8] = com.moon.module.impl.Timer.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Timer.B)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Timer.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.BooleanSetting c() {
return this.y;
}


public com.moon.setting.FloatSetting c__kZ() {
return this.w;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.v;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.t;
}


public com.moon.setting.EnumSetting<com.moon.bK> a() {
return this.s;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.Timer.z ^ 12739838569713L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bK.BALANCE) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.Timer.z ^ 63817408186622L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bK.BALANCE) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$2() {
java.lang.Object forwardValue962_16_0;
    int forwardValue962_22_0;
    int forwardValue962_24_0;
    java.lang.Object spill962_0;
    boolean spill962_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.Timer.z ^ 53927868185694L);
    life3_5 = com.moon.bF.b();
    spill962_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 != null))) {
        forwardValue962_16_0 = spill962_0;
        break forward_join_16;
    }
    if (!((spill962_0 == com.moon.bK.BALANCE))) {
        break forward_join_23;
    }
    forwardValue962_16_0 = ((com.moon.setting.BooleanSetting)(this.x)).getValue();
    }
    spill962_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue962_16_0)))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue962_22_0 = ((spill962_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill962_1)) {
        break forward_join_23;
    }
    forwardValue962_22_0 = 1;
    }
    forwardValue962_24_0 = forwardValue962_22_0;
    break forward_join_24;
    }
    forwardValue962_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue962_24_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_35(com.moon.module.impl.Timer a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_60(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_70(com.moon.module.impl.Timer a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_75(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3b3c4b66a715d52d_originalDynamicSite8_80(com.moon.module.impl.Timer a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2737_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
