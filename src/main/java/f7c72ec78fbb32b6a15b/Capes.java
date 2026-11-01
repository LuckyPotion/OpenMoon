package com.moon.module.impl;


public class Capes extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.google.common.cache.Cache<net.minecraft.entity.player.EntityPlayer, java.lang.Boolean> t;

private static long u;

private static java.lang.String[] v;

private static java.lang.String[] w;

private static java.util.Map x;

private static long y;

public Capes(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_d5bc6d6180bc25be(com.moon.module.impl.Capes receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Capes.u ^ 135980101270351L);

    com.moon.module.impl.Capes.__sourceConstructorInit_d5bc6d6180bc25be_0(((com.moon.module.impl.Capes)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Capes)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_d5bc6d6180bc25be_originalDynamicSite1230_2(4245, (6399378308381539430L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_d5bc6d6180bc25be_originalDynamicSite1230_4(4134, (6934612753697373396L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Capes)(receiver)).t = ((com.google.common.cache.Cache)(((com.google.common.cache.CacheBuilder)(((com.google.common.cache.CacheBuilder)(com.google.common.cache.CacheBuilder.newBuilder())).expireAfterWrite(((long)(com.moon.module.impl.Capes.y)), ((java.util.concurrent.TimeUnit)(java.util.concurrent.TimeUnit.SECONDS))))).build()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d5bc6d6180bc25be_0(com.moon.module.impl.Capes a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
u = ((long)(((moom._a)(moom._c.a(((long)(319884583695095903L)), ((long)(2799453085295808672L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9958300161856L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.module.impl.Capes.u ^ 36382457687387L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill264_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill264_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill264_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill264_14 = new byte[8];
    (__sourceSpill264_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill264_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation264_16 = __sourceSpill264_14;
    ((javax.crypto.Cipher)(__sourceSpill264_11)).init(((int)(__sourceSpill264_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill264_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation264_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[2];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "3­ÌàBó s0D|\034º\177ÀwYbRF¾ûÁi©\030\027Ù ¸ä\022¶\003Û\002 û\b)\023à7×²!ùÏwOÁÅJñB:Di¥Ø>ô\\ê1)"))).length();
    int local10_life24 = 40;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill264_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill264_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill264_29)).doFinal(((byte[])(__sourceSpill264_28)));
        java.lang.String __sourceSpill264_34 = ((java.lang.String)(com.moon.module.impl.Capes.c(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill264_35 = local14_life19;
        int __sourceSpill264_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill264_35)[__sourceSpill264_36] = __sourceSpill264_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    v = ((java.lang.String[])(local14_life19));
    w = ((java.lang.String[])(new java.lang.String[2]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill264_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill264_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill264_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill264_46 = new byte[8];
    (__sourceSpill264_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill264_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation264_48 = __sourceSpill264_46;
    ((javax.crypto.Cipher)(__sourceSpill264_43)).init(((int)(__sourceSpill264_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill264_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation264_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = -4968789578967032730L;
    byte[] __sourceSpill264_52 = new byte[8];
    (__sourceSpill264_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill264_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill264_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill264_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill264_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill264_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill264_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill264_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill264_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill264_53)).doFinal(((byte[])(__sourceSpill264_52)));
    y = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2419_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Capes.c(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31015);
    if (((com.moon.module.impl.Capes.w)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Capes.x)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Capes.x)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lR", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Capes.v)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Capes.w)[life5_8] = com.moon.module.impl.Capes.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Capes.w)[life5_8];
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
        byte[] spill1059_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1059_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1059_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1059_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1059_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1059_2)[life4_9];
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


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
java.lang.Object forwardValue810_17_0;
    java.lang.Boolean forwardValue810_39_0;
    int forwardValue810_55_0;
    net.minecraft.entity.player.EntityPlayer spill810_0;
    boolean spill810_1;
    java.lang.Boolean spill810_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.Map life5_35;
    java.lang.Boolean life6_41;
    int life7_56;
    forward_join_55: {
    forward_join_54: {
    forward_join_41: {
    forward_join_39: {
    forward_join_17: {
    forward_join_14: {
    life2_3 = (com.moon.module.impl.Capes.u ^ 51045534344516L);
    life4_5 = com.moon.bY.b();
    spill810_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue810_17_0 = spill810_0;
        break forward_join_17;
    }
    if (!((spill810_0 == ((net.minecraft.client.Minecraft)(com.moon.module.impl.Capes.d)).K))) {
        break forward_join_14;
    }
    return ((1) != 0);
    }
    forwardValue810_17_0 = ((com.moon.setting.BooleanSetting)(this.s)).getValue();
    }
    spill810_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue810_17_0)))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue810_55_0 = ((spill810_1) ? 1 : 0);
        break forward_join_55;
    }
    if (!(spill810_1)) {
        break forward_join_54;
    }
    life5_35 = ((com.moon.oj)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__oj())).a();
    life6_41 = ((java.lang.Boolean)(((com.google.common.cache.Cache)(this.t)).getIfPresent(((java.lang.Object)(p0)))));
    spill810_2 = life6_41;
    if (!((life4_5 == null))) {
        forwardValue810_39_0 = spill810_2;
        break forward_join_39;
    }
    if (!((spill810_2 != null))) {
        break forward_join_41;
    }
    forwardValue810_39_0 = life6_41;
    }
    return ((java.lang.Boolean)(forwardValue810_39_0)).booleanValue();
    }
    life7_56 = ((((java.util.Map)(life5_35)).containsKey(((java.lang.Object)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__String())))) ? 1 : 0);
    ((com.google.common.cache.Cache)(this.t)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life7_56)))))));
    return ((life7_56) != 0);
    }
    forwardValue810_55_0 = 0;
    }
    return ((forwardValue810_55_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d5bc6d6180bc25be_originalDynamicSite1230_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d5bc6d6180bc25be_originalDynamicSite1230_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2419_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
