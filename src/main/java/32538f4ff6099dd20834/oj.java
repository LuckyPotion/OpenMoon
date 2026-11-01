package com.moon;


public class oj {

private final java.util.Map<java.lang.String, com.moon.ad> a;

private static final net.kyori.adventure.text.minimessage.MiniMessage b;

private static final net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer c;

private final com.google.common.cache.Cache<java.lang.String, java.lang.String> d;

private final com.moon.od e;

private static final long f;

private static final java.lang.String[] g;

private static final java.lang.String[] h;

private static final java.util.Map i;

public oj(com.moon.od p0) {
super();
    this.a = new java.util.HashMap();
    this.d = ((com.google.common.cache.CacheBuilder.newBuilder()).expireAfterAccess(1L, java.util.concurrent.TimeUnit.MINUTES)).build();
    this.e = p0;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(6209675966378048693L)), ((long)(-8603002515036356468L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147285438845146L)))));
    long local15_life6 = (com.moon.oj.f ^ 82498785685677L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local6_life9;
    javax.crypto.Cipher __sourceSpill328_11 = (local6_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill328_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill328_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill328_14 = new byte[8];
    (__sourceSpill328_14)[0] = ((byte) ((int) (local15_life6 >>> 56)));
    int local7_life15 = 1;
    while ((local7_life15 < 8)) {
        (__sourceSpill328_14)[local7_life15] = ((byte) ((int) ((local15_life6 << (local7_life15 * 8)) >>> 56)));
        local7_life15 += 1;
    }
    byte[] __sourcePreallocation328_16 = __sourceSpill328_14;
    ((javax.crypto.Cipher)(__sourceSpill328_11)).init(((int)(__sourceSpill328_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill328_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation328_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local13_life19 = new java.lang.String[3];
    int local11_life20 = 0;
    java.lang.String local10_life21;
    int local12_life23 = ((java.lang.String)((local10_life21 = "ãïWÄÁÑ?`ÚZoÚA¿0ï¾ÚJÓ»Bp×\"T®Ïd,öz\034ò¦ûwE]\030\036àA_ßü¨\037ÞûÞNOQDÑ*Õ,m\0209í ê\025\\òíÑ×\t"))).length();
    int local9_life24 = 16;
    int local8_life25 = -1;
    while (true) {
        local8_life25 += 1;
        byte[] __sourceSpill328_28 = ((java.lang.String)(((java.lang.String)(local10_life21)).substring(((int)(local8_life25)), ((int)((local8_life25 + local9_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill328_29 = local6_life9;
        byte[] local14_life31 = ((javax.crypto.Cipher)(__sourceSpill328_29)).doFinal(((byte[])(__sourceSpill328_28)));
        java.lang.String __sourceSpill328_34 = ((java.lang.String)(com.moon.oj.a(((byte[])(local14_life31))))).intern();
        java.lang.String[] __sourceSpill328_35 = local13_life19;
        int __sourceSpill328_36 = local11_life20;
        local11_life20 += 1;
        (__sourceSpill328_35)[__sourceSpill328_36] = __sourceSpill328_34;
        if (!(((local8_life25 = (local8_life25 + local9_life24)) < local12_life23))) { break; }
        local9_life24 = ((java.lang.String)(local10_life21)).charAt(((int)(local8_life25)));
    }
    g = ((java.lang.String[])(local13_life19));
    h = ((java.lang.String[])(new java.lang.String[3]));
    javax.crypto.Cipher local1_life41;
    javax.crypto.Cipher __sourceSpill328_43 = (local1_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill328_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill328_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill328_46 = new byte[8];
    (__sourceSpill328_46)[0] = ((byte) ((int) (local15_life6 >>> 56)));
    int local2_life47 = 1;
    while ((local2_life47 < 8)) {
        (__sourceSpill328_46)[local2_life47] = ((byte) ((int) ((local15_life6 << (local2_life47 * 8)) >>> 56)));
        local2_life47 += 1;
    }
    byte[] __sourcePreallocation328_48 = __sourceSpill328_46;
    ((javax.crypto.Cipher)(__sourceSpill328_43)).init(((int)(__sourceSpill328_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill328_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation328_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life51 = 1366772164877339940L;
    byte[] __sourceSpill328_52 = new byte[8];
    (__sourceSpill328_52)[0] = ((byte) ((int) (local3_life51 >>> 56)));
    (__sourceSpill328_52)[1] = ((byte) ((int) (local3_life51 >>> 48)));
    (__sourceSpill328_52)[2] = ((byte) ((int) (local3_life51 >>> 40)));
    (__sourceSpill328_52)[3] = ((byte) ((int) (local3_life51 >>> 32)));
    (__sourceSpill328_52)[4] = ((byte) ((int) (local3_life51 >>> 24)));
    (__sourceSpill328_52)[5] = ((byte) ((int) (local3_life51 >>> 16)));
    (__sourceSpill328_52)[6] = ((byte) ((int) (local3_life51 >>> 8)));
    (__sourceSpill328_52)[7] = ((byte) ((int) local3_life51));
    javax.crypto.Cipher __sourceSpill328_53 = local1_life41;
    byte[] local5_life55 = ((javax.crypto.Cipher)(__sourceSpill328_53)).doFinal(((byte[])(__sourceSpill328_52)));
    long local0_life56 = (((((((((((long) (local5_life55)[0]) & 255L) << 56) | ((((long) (local5_life55)[1]) & 255L) << 48)) | ((((long) (local5_life55)[2]) & 255L) << 40)) | ((((long) (local5_life55)[3]) & 255L) << 32)) | ((((long) (local5_life55)[4]) & 255L) << 24)) | ((((long) (local5_life55)[5]) & 255L) << 16)) | ((((long) (local5_life55)[6]) & 255L) << 8)) | (((long) (local5_life55)[7]) & 255L));
    b = ((net.kyori.adventure.text.minimessage.MiniMessage)(net.kyori.adventure.text.minimessage.MiniMessage.miniMessage()));
    c = ((net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer)(net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer.legacy(((char)(((int) local0_life56))))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill1457_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1457_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1457_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1457_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1457_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1457_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28805);
    if (((com.moon.oj.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.oj.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.oj.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/oj", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.oj.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.oj.h)[life5_8] = __sourceExactCall_344de19d3ec84d(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.oj.h)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3086_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/oj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_4881047da81c56(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(java.util.List<com.moon.ad> p0) {
((java.util.Map)(this.a)).clear();
    ((java.util.List)(p0)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_80f4afb34920_originalDynamicSite605_2(this))));
    return;
}


public java.lang.String a(java.lang.String p0) {
int lexicalValue336_118_0;
    java.lang.String lexicalValue336_125_0;
    java.lang.String lexicalValue336_131_0;
    java.lang.String lexicalValue336_132_0;
    int lexicalValue336_132_1;
    java.lang.String lexicalValue336_133_0;
    boolean spill336_0;
    java.lang.String spill336_1;
    boolean spill336_2;
    long life2_3;
    java.lang.String[] life5_8;
    java.util.ArrayList life6_12;
    int life4_13;
    java.lang.String[] life7_15;
    int life8_18;
    int life9_20;
    java.lang.String life10_27;
    java.lang.String life11_45;
    com.moon.ad life12_61;
    java.lang.String life13_90;
    java.lang.String life14_96;
    lexical_join_133: {
    lexical_join_132: {
    lexical_join_131: {
    lexical_join_125: {
    lexical_join_122: {
    life2_3 = (com.moon.oj.f ^ 59322081146318L);
    spill336_0 = com.moon.og.b();
    life5_8 = ((java.lang.String)(p0)).split(((java.lang.String)(" ")));
    life6_12 = new java.util.ArrayList();
    life4_13 = ((spill336_0) ? 1 : 0);
    life7_15 = life5_8;
    life8_18 = (life7_15).length;
    life9_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_119: {
    lexical_join_118: {
    lexical_join_115: {
    lexical_join_113: {
    lexical_join_109: {
    if (!((life9_20 < life8_18))) {
        break lexical_join_122;
    }
    life10_27 = (life7_15)[life9_20];
    spill336_1 = ((java.lang.String)(((java.lang.String)(life10_27)).replaceAll(((java.lang.String)(__sourceIntrinsic_c43bc540f167_invokedynamic336_4(18780, (82096951677881835L ^ life2_3)))), ((java.lang.String)(""))))).replaceAll(((java.lang.String)(__sourceIntrinsic_c43bc540f167_invokedynamic336_6(12989, (40324534935418376L ^ life2_3)))), ((java.lang.String)("")));
    if (!((life4_13 != 0))) {
        lexicalValue336_125_0 = spill336_1;
        break lexical_join_125;
    }
    life11_45 = spill336_1;
    spill336_2 = ((java.util.Map)(this.a)).containsKey(((java.lang.Object)(life11_45)));
    if (!((life4_13 != 0))) {
        lexicalValue336_118_0 = ((spill336_2) ? 1 : 0);
        break lexical_join_118;
    }
    if (!(spill336_2)) {
        break lexical_join_115;
    }
    life12_61 = ((com.moon.ad)(((java.util.Map)(this.a)).get(((java.lang.Object)(life11_45)))));
    life13_90 = java.lang.String.format(((java.lang.String)(__sourceIntrinsic_c43bc540f167_invokedynamic336_14(8090, (2857608129779456814L ^ life2_3)))), ((java.lang.Object[])(new java.lang.Object[] {((com.moon.ad)(life12_61)).d__String(), ((com.moon.ad)(life12_61)).a__String(), ((com.moon.ad)(life12_61)).d__String(), ((com.moon.ad)(life12_61)).b__String()})));
    life14_96 = ((java.lang.String)(((com.google.common.cache.Cache)(this.d)).getIfPresent(((java.lang.Object)(life13_90)))));
    if (!((life4_13 != 0))) {
        break lexical_join_113;
    }
    if (!((life14_96 == null))) {
        break lexical_join_109;
    }
    life14_96 = __sourceExactCall_b4cec5e1595741(((net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer)(com.moon.oj.c)), ((net.kyori.adventure.text.Component)(__sourceExactCall_d4a0f4c0241b26(((net.kyori.adventure.text.minimessage.MiniMessage)(com.moon.oj.b)), ((java.lang.Object)(life13_90))))));
    __sourceExactCall_42ad4fc29e3e56(((com.google.common.cache.Cache)(this.d)), ((java.lang.Object)(life13_90)), ((java.lang.Object)(life14_96)));
    }
    ((java.util.List)(life6_12)).add(((java.lang.Object)(life14_96)));
    }
    if (!((life4_13 == 0))) {
        break lexical_join_119;
    }
    }
    lexicalValue336_118_0 = ((((java.util.List)(life6_12)).add(((java.lang.Object)(life10_27)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue336_118_0);
    }
    life9_20 += 1;
    if (!((life4_13 == 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue336_125_0 = java.lang.String.join(((java.lang.CharSequence)(" ")), ((java.lang.Iterable)(life6_12)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue336_133_0 = lexicalValue336_125_0;
        break lexical_join_133;
    }
    if (!((life4_13 != 0))) {
        lexicalValue336_131_0 = lexicalValue336_125_0;
        break lexical_join_131;
    }
    lexicalValue336_132_0 = lexicalValue336_125_0;
    lexicalValue336_132_1 = 0;
    break lexical_join_132;
    }
    lexicalValue336_132_0 = lexicalValue336_131_0;
    lexicalValue336_132_1 = 1;
    }
    com.moon.og.b(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue336_132_1))));
    lexicalValue336_133_0 = lexicalValue336_132_0;
    }
    return lexicalValue336_133_0;
}


public java.util.Map<java.lang.String, com.moon.ad> a() {
return this.a;
}


public void a(java.lang.String p0, java.lang.String p1) {
((com.moon.pE)(((com.moon.od)(this.e)).a__pE())).a(((com.google.protobuf.GeneratedMessageV3)(((com.moon.aE)(((com.moon.aE)(((com.moon.aE)(com.moon.ac.b__aE())).a(((java.lang.String)(p0))))).b(((java.lang.String)(p1))))).b__ac())));
    return;
}


private void lambda$updateSynchronizedUser$0(com.moon.ad p0) {
((java.util.Map)(this.a)).put(((java.lang.Object)(((com.moon.ad)(p0)).b__String())), ((java.lang.Object)(p0)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic336_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic336_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic336_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3086_0() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_80f4afb34920_originalDynamicSite605_2(com.moon.oj a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.lang.String __sourceExactCall_344de19d3ec84d(byte[] p0);
private static native java.lang.String __sourceExactCall_4881047da81c56(int p0, long p1);

private static native java.lang.String __sourceExactCall_b4cec5e1595741(net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer p0, net.kyori.adventure.text.Component p1);
private static native net.kyori.adventure.text.Component __sourceExactCall_d4a0f4c0241b26(net.kyori.adventure.text.minimessage.MiniMessage p0, java.lang.Object p1);
private static native void __sourceExactCall_42ad4fc29e3e56(com.google.common.cache.Cache p0, java.lang.Object p1, java.lang.Object p2);
}
