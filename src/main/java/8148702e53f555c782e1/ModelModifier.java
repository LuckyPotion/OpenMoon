package com.moon.module.impl;


public class ModelModifier extends com.moon.module.Module {

public com.moon.setting.MultiSelectSetting<com.moon.b4> s;

public com.moon.setting.MultiSelectSetting<com.moon.b4> t;

private static long u;

private static java.lang.String[] v;

private static java.lang.String[] w;

private static java.util.Map x;

public ModelModifier(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_bda335c4b66aa2e5(com.moon.module.impl.ModelModifier receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.ModelModifier.u ^ 130994413197321L);

    com.moon.module.impl.ModelModifier.__sourceConstructorInit_bda335c4b66aa2e5_0(((com.moon.module.impl.ModelModifier)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.ModelModifier)(receiver)).s = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_2(25427, (336574883356843596L ^ local5)))), ((java.lang.Class)(com.moon.b4.class))))).a(((java.lang.String)(__sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_5(1861, (7922390520659769947L ^ local5)))), ((java.lang.Enum[])(new com.moon.b4[] {com.moon.b4.BABY}))))).a()));

    ((com.moon.module.impl.ModelModifier)(receiver)).t = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_10(10807, (665223143170299691L ^ local5)))), ((java.lang.Class)(com.moon.b4.class))))).a(((java.lang.String)(__sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_13(25339, (5355467231522889702L ^ local5)))), ((java.lang.Enum[])(new com.moon.b4[] {com.moon.b4.BABY}))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_bda335c4b66aa2e5_0(com.moon.module.impl.ModelModifier a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
u = ((long)(((moom._a)(moom._c.a(((long)(5810121013456161980L)), ((long)(4457146267272156252L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(109529286820544L)))));

    x = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.ModelModifier.u ^ 615080319807L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill375_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill375_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill375_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill375_14 = new byte[8];

    (__sourceSpill375_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill375_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation375_16 = __sourceSpill375_14;

    ((javax.crypto.Cipher)(__sourceSpill375_11)).init(((int)(__sourceSpill375_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill375_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation375_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "ñB±û~6\020\035Ò»ñ\ty\024X\"ý6stð\030\026¡»&\027No:d\024\rævê.ní¾ý\027­\r]"))).length();

    int local5_life24 = 24;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill375_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill375_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill375_29)).doFinal(((byte[])(__sourceSpill375_28)));

        java.lang.String __sourceSpill375_34 = ((java.lang.String)(com.moon.module.impl.ModelModifier.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill375_35 = local9_life19;

        int __sourceSpill375_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill375_35)[__sourceSpill375_36] = __sourceSpill375_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "×\"\031ª7ÿç_N¦60b;©3\177g\007SõPÔM'ÛÒº 3B@7ms®e]RRíÓ%dAYÀ\rþÔ·V<üH"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill375_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill375_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill375_43)).doFinal(((byte[])(__sourceSpill375_42)));

        java.lang.String __sourceSpill375_48 = ((java.lang.String)(com.moon.module.impl.ModelModifier.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill375_49 = local9_life19;

        int __sourceSpill375_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill375_49)[__sourceSpill375_50] = __sourceSpill375_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    v = ((java.lang.String[])(local9_life19));

    w = ((java.lang.String[])(new java.lang.String[4]));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7596);
    if (((com.moon.module.impl.ModelModifier.w)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.ModelModifier.x)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.ModelModifier.x)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lZ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.ModelModifier.v)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.ModelModifier.w)[life5_8] = com.moon.module.impl.ModelModifier.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.ModelModifier.w)[life5_8];
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
        byte[] spill1151_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1151_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1151_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1151_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1151_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1151_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.ModelModifier.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2561_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void onDisable() {
return;
}


public void a(com.moon.event.MoveEvent p0) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.ec p0) {
int forwardValue885_18_0;
    com.moon.ec forwardValue885_51_0;
    int spill885_0;
    com.moon.ec spill885_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_52: {
    forward_join_51: {
    forward_join_38: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (com.moon.module.impl.ModelModifier.u ^ 94811272502294L);
    life4_5 = com.moon.bY.b();
    spill885_0 = ((((com.moon.ec)(p0)).a__sourceReturn_09c029d8c3() instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue885_18_0 = spill885_0;
        break forward_join_18;
    }
    if (!((spill885_0 == 0))) {
        break forward_join_13;
    }
    return;
    }
    spill885_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue885_51_0 = spill885_1;
        break forward_join_51;
    }
    forwardValue885_18_0 = __sourceExactCall_cf86b9d0f8200d(((net.minecraft.entity.Entity)(((com.moon.ec)(spill885_1)).a__sourceReturn_09c029d8c3())));
    }
    if (!((forwardValue885_18_0 == __sourceExactCall_453eb74c1efc22(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ModelModifier.d)).K)))))) {
        break forward_join_38;
    }
    ((com.moon.ec)(p0)).b(((boolean)(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b4.BABY))))));
    ((com.moon.ec)(p0)).a(((boolean)(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b4.RIDING))))));
    if (!((life4_5 != null))) {
        break forward_join_52;
    }
    }
    ((com.moon.ec)(p0)).b(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.b4.BABY))))));
    forwardValue885_51_0 = ((com.moon.ec)(p0)).a(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.b4.RIDING))))));
    }
    recovery.source.CarrierOps.discard(forwardValue885_51_0);
    }
    return;
}


public void a(com.moon.d6 p0) {
int forwardValue884_18_0;
    com.moon.event.CancellableEvent forwardValue884_37_0;
    int spill884_0;
    com.moon.d6 spill884_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_31: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (com.moon.module.impl.ModelModifier.u ^ 9927895148405L);
    life4_5 = __sourceExactCall_b13159324639bd();
    spill884_0 = ((__sourceExactCall_9ec3d1e649ba03(((com.moon.d6)(p0))) instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue884_18_0 = spill884_0;
        break forward_join_18;
    }
    if (!((spill884_0 == 0))) {
        break forward_join_13;
    }
    return;
    }
    spill884_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue884_37_0 = spill884_1;
        break forward_join_37;
    }
    forwardValue884_18_0 = __sourceExactCall_62c9ac7d46f640(((net.minecraft.entity.EntityLivingBase)(__sourceExactCall_9ec3d1e649ba03(((com.moon.d6)(spill884_1))))));
    }
    if (!((forwardValue884_18_0 == __sourceExactCall_453eb74c1efc22(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ModelModifier.d)).K)))))) {
        break forward_join_31;
    }
    ((com.moon.d6)(p0)).setCancelled(((boolean)(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b4.HIDE_ARMOR))))));
    if (!((life4_5 != null))) {
        break forward_join_38;
    }
    }
    forwardValue884_37_0 = ((com.moon.d6)(p0)).setCancelled(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.b4.HIDE_ARMOR))))));
    }
    recovery.source.CarrierOps.discard(forwardValue884_37_0);
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bda335c4b66aa2e5_originalDynamicSite1266_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2561_0() throws E;

private static native int __sourceExactCall_453eb74c1efc22(net.minecraft.client.entity.EntityPlayerSP p0);
private static native int __sourceExactCall_62c9ac7d46f640(net.minecraft.entity.EntityLivingBase p0);

private static native int __sourceExactCall_cf86b9d0f8200d(net.minecraft.entity.Entity p0);

private static native net.minecraft.entity.Entity[] __sourceExactCall_b13159324639bd();
private static native net.minecraft.entity.EntityLivingBase __sourceExactCall_9ec3d1e649ba03(com.moon.d6 p0);
}
