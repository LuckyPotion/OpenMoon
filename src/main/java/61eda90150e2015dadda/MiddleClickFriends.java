package com.moon.module.impl;


public class MiddleClickFriends extends com.moon.module.Module {

private static final long s;

private static final java.lang.String[] t;

private static final java.lang.String[] u;

private static final java.util.Map v;

public MiddleClickFriends(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) {
super(p0, p1, p2, p3);
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-5933835763282082685L)), ((long)(2386146490655831260L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16600183640494L)))));

    v = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.MiddleClickFriends.s ^ 100092068268071L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill374_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill374_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill374_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill374_14 = new byte[8];

    (__sourceSpill374_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill374_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation374_16 = __sourceSpill374_14;

    ((javax.crypto.Cipher)(__sourceSpill374_11)).init(((int)(__sourceSpill374_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill374_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation374_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "p>ò\026Dâîók£Ä×bIûBí¸æ5\032 Î\tÂ\000Ç5oÞõÆÚ'\032éã\"\023ßý\036þ(Ôø<\024<4"))).length();

    int local5_life24 = 24;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill374_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill374_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill374_29)).doFinal(((byte[])(__sourceSpill374_28)));

        java.lang.String __sourceSpill374_34 = ((java.lang.String)(com.moon.module.impl.MiddleClickFriends.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill374_35 = local9_life19;

        int __sourceSpill374_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill374_35)[__sourceSpill374_36] = __sourceSpill374_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "ÄÎìÄ\024\017} \035Baì V£\026\032ª Qr,$=\031 ^W~êocõ¬¤¼Ú2ÏÉ±À\026Â\b"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill374_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill374_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill374_43)).doFinal(((byte[])(__sourceSpill374_42)));

        java.lang.String __sourceSpill374_48 = ((java.lang.String)(com.moon.module.impl.MiddleClickFriends.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill374_49 = local9_life19;

        int __sourceSpill374_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill374_49)[__sourceSpill374_50] = __sourceSpill374_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    t = ((java.lang.String[])(local9_life19));

    u = ((java.lang.String[])(new java.lang.String[4]));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2555_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.MiddleClickFriends.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23647);
    if (((com.moon.module.impl.MiddleClickFriends.u)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.MiddleClickFriends.v)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.MiddleClickFriends.v)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lH", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.MiddleClickFriends.t)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.MiddleClickFriends.u)[life5_8] = com.moon.module.impl.MiddleClickFriends.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.MiddleClickFriends.u)[life5_8];
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
        byte[] spill1148_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1148_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1148_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1148_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1148_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1148_2)[life4_9];
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


public void a(com.moon.eJ p0) {
int forwardValue883_14_0;
    net.minecraft.util.MovingObjectPosition forwardValue883_22_0;
    net.minecraft.entity.Entity forwardValue883_30_0;
    com.moon.eV forwardValue883_64_0;
    int spill883_0;
    net.minecraft.util.MovingObjectPosition spill883_1;
    net.minecraft.entity.Entity spill883_2;
    com.moon.eV spill883_3;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.entity.Entity life6_38;
    net.minecraft.entity.player.EntityPlayer life5_52;
    java.lang.String life6_55;
    com.moon.eV life7_58;
    forward_join_81: {
    forward_join_64: {
    forward_join_63: {
    forward_join_30: {
    forward_join_22: {
    forward_join_14: {
    life2_3 = (com.moon.module.impl.MiddleClickFriends.s ^ 11012884100005L);
    life4_5 = com.moon.bF.b();
    spill883_0 = ((com.moon.eJ)(p0)).a();
    if (!((life4_5 != null))) {
        forwardValue883_14_0 = spill883_0;
        break forward_join_14;
    }
    if (!((spill883_0 == 2))) {
        break forward_join_81;
    }
    forwardValue883_14_0 = ((((com.moon.eJ)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue883_14_0 != 0))) {
        break forward_join_81;
    }
    spill883_1 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.MiddleClickFriends.d)).V;
    if (!((life4_5 != null))) {
        forwardValue883_22_0 = spill883_1;
        break forward_join_22;
    }
    if (!((spill883_1 != null))) {
        break forward_join_81;
    }
    forwardValue883_22_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.MiddleClickFriends.d)).V;
    }
    life6_38 = ((net.minecraft.util.MovingObjectPosition)(forwardValue883_22_0)).e;
    spill883_2 = life6_38;
    if (!((life4_5 != null))) {
        forwardValue883_30_0 = spill883_2;
        break forward_join_30;
    }
    if (!((((spill883_2 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_81;
    }
    forwardValue883_30_0 = life6_38;
    }
    life5_52 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue883_30_0));
    life6_55 = ((net.minecraft.entity.player.EntityPlayer)(life5_52)).a__String();
    life7_58 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__eV();
    spill883_3 = life7_58;
    if (!((life4_5 != null))) {
        forwardValue883_64_0 = spill883_3;
        break forward_join_64;
    }
    if (!(((com.moon.eV)(spill883_3)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life5_52))))) {
        break forward_join_63;
    }
    ((com.moon.eV)(life7_58)).a(((java.lang.String)(life6_55)));
    java.lang.String __stackOp883_18_0 = life6_55;
    java.lang.String __stackOp883_18_1 = __sourceIntrinsic_a5321832e977_invokedynamic883_17(19172, (9137141880189476634L ^ life2_3));
    com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_a5321832e977_invokedynamic883_20(__stackOp883_18_1, __stackOp883_18_0, __sourceIntrinsic_a5321832e977_invokedynamic883_19(16523, (1592466608462484855L ^ life2_3))))));
    if (!((life4_5 == null))) {
        break forward_join_81;
    }
    }
    forwardValue883_64_0 = life7_58;
    }
    ((com.moon.eV)(forwardValue883_64_0)).a(((java.lang.String)(life6_55)), ((java.lang.String)("")));
    java.lang.String __stackOp883_24_0 = life6_55;
    java.lang.String __stackOp883_24_1 = __sourceIntrinsic_a5321832e977_invokedynamic883_23(8394, (6754368289740633399L ^ life2_3));
    com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_a5321832e977_invokedynamic883_26(__stackOp883_24_1, __stackOp883_24_0, __sourceIntrinsic_a5321832e977_invokedynamic883_25(17456, (7564361456004682191L ^ life2_3))))));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2555_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a5321832e977_invokedynamic883_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a5321832e977_invokedynamic883_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a5321832e977_invokedynamic883_20(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a5321832e977_invokedynamic883_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a5321832e977_invokedynamic883_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a5321832e977_invokedynamic883_26(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;
}
