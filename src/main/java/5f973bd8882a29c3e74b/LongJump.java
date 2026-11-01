package com.moon.module.impl;


public class LongJump extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.LongJumpMode> s;

private com.moon.setting.FloatSetting t;

private com.moon.setting.FloatSetting u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

public LongJump(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_20986bc5b6a8d6a1(com.moon.module.impl.LongJump receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.LongJump.v ^ 49400168569933L);

    com.moon.module.impl.LongJump.__sourceConstructorInit_20986bc5b6a8d6a1_0(((com.moon.module.impl.LongJump)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.LongJump)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_2(19705, (7582957079876504990L ^ local5)))), ((java.lang.Class)(com.moon.LongJumpMode.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_5(19995, (4088517870808076152L ^ local5)))), ((java.lang.Enum)(com.moon.LongJumpMode.VULCAN))))).a()));

    ((com.moon.module.impl.LongJump)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_10(3108, (2912167098663456068L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_12(105, (9133393053903405320L ^ local5)))), ((float)(0x1.ae147ap-2f)), ((float)(0x1.99999ap-4f)), ((float)(0x1.4p2f)), ((float)(0x1.47ae14p-7f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_14(receiver)))))).a()));

    ((com.moon.module.impl.LongJump)(receiver)).u = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_18(9948, (6774658672269617086L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_20(29864, (5464131357551769038L ^ local5)))), ((float)(0x1.0p0f)), ((float)(0x1.99999ap-4f)), ((float)(0x1.4p3f)), ((float)(0x1.99999ap-4f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_22(receiver)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_20986bc5b6a8d6a1_0(com.moon.module.impl.LongJump a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
v = ((long)(((moom._a)(moom._c.a(((long)(8049332861106077962L)), ((long)(629621422027136688L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(187985873990125L)))));

    y = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.LongJump.v ^ 119693506829760L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill373_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill373_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill373_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill373_14 = new byte[8];

    (__sourceSpill373_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill373_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation373_16 = __sourceSpill373_14;

    ((javax.crypto.Cipher)(__sourceSpill373_11)).init(((int)(__sourceSpill373_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill373_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation373_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "3¸)WºõÄBâ®9f\0327 ~ï£\007VÝ\013\024áø\f·O¢½\007\002HôÕ\007T§*¾õQ%Ê¹Ó\020 ½4L¤æÙu÷\027\023´5 Ý¨8&\024W;µ\027¾Z\rdùéût\177²4\b\026¹þ·:±Ñ4/ü\033"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill373_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill373_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill373_29)).doFinal(((byte[])(__sourceSpill373_28)));

        java.lang.String __sourceSpill373_34 = ((java.lang.String)(com.moon.module.impl.LongJump.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill373_35 = local9_life19;

        int __sourceSpill373_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill373_35)[__sourceSpill373_36] = __sourceSpill373_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "ó<\032µ]L¨N_²%pü¡Ü<\020Ð6M\003Ë-@îÃÄæª/_\037"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill373_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill373_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill373_43)).doFinal(((byte[])(__sourceSpill373_42)));

        java.lang.String __sourceSpill373_48 = ((java.lang.String)(com.moon.module.impl.LongJump.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill373_49 = local9_life19;

        int __sourceSpill373_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill373_49)[__sourceSpill373_50] = __sourceSpill373_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    w = ((java.lang.String[])(local9_life19));

    x = ((java.lang.String[])(new java.lang.String[6]));
}


public com.moon.setting.FloatSetting b() {
return this.u;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2552_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lo"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill1146_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1146_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1146_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1146_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1146_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1146_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26097);
    if (((com.moon.module.impl.LongJump.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.LongJump.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.LongJump.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lo", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.LongJump.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.LongJump.x)[life5_8] = com.moon.module.impl.LongJump.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.LongJump.x)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.LongJump.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(com.moon.event.TickEvent p0) {
((com.moon.module.impl.LongJump)(this)).setSuffix(((java.lang.String)(((com.moon.LongJumpMode)(((com.moon.LongJumpMode)(((com.moon.setting.EnumSetting)(this.s)).getValue())))).a__String())));
    return;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.t;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.EnumSetting<com.moon.LongJumpMode> a() {
return this.s;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.LongJump.v ^ 122037461379039L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.LongJumpMode.VANILLA) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.LongJump.v ^ 61360274105074L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.LongJumpMode.VANILLA) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_14(com.moon.module.impl.LongJump a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_20986bc5b6a8d6a1_originalDynamicSite1263_22(com.moon.module.impl.LongJump a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2552_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
