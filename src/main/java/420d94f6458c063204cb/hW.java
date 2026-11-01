package com.moon;


public class hW {

private static final org.tinylog.TaggedLogger a;

private final com.moon.hY b;

private com.moon.iw c;

private boolean d;

private static int[] e;

private static final long f;

private static final java.lang.String[] g;

private static final java.lang.String[] h;

private static final java.util.Map i;

public hW() {
super();
    this.b = new com.moon.hY();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(4950949346778145625L)), ((long)(5759157203089695077L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(142771567817822L)))));

    long local9_life6 = (com.moon.hW.f ^ 45454650368558L);

    int[] __sourceSpill194_8 = new int[4];

    i = ((java.util.Map)(new java.util.HashMap(13)));

    com.moon.hW.b(((int[])(__sourceSpill194_8)));

    javax.crypto.Cipher local0_life11;

    javax.crypto.Cipher __sourceSpill194_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill194_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill194_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill194_16 = new byte[8];

    (__sourceSpill194_16)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life17 = 1;

    while ((local1_life17 < 8)) {

        (__sourceSpill194_16)[local1_life17] = ((byte) ((int) ((local9_life6 << (local1_life17 * 8)) >>> 56)));

        local1_life17 += 1;

    }

    byte[] __sourcePreallocation194_18 = __sourceSpill194_16;

    ((javax.crypto.Cipher)(__sourceSpill194_13)).init(((int)(__sourceSpill194_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill194_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation194_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life21 = new java.lang.String[4];

    int local5_life22 = 0;

    java.lang.String local4_life23;

    int local6_life25 = ((java.lang.String)((local4_life23 = "Í¦v!âÝóðsõæéNc¹5Vb\"«@\036\005Fg\004oXüì¬õ`ðããËB©\025v0\033-üZôÞ\021Ba÷H$\021\032¥90\003;¥2°E®mÁL6Ðë»7oî"))).length();

    int local3_life26 = 24;

    int local2_life27 = -1;

    while (true) {

        local2_life27 += 1;

        byte[] __sourceSpill194_30 = ((java.lang.String)(((java.lang.String)(local4_life23)).substring(((int)(local2_life27)), ((int)((local2_life27 + local3_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill194_31 = local0_life11;

        byte[] local8_life33 = ((javax.crypto.Cipher)(__sourceSpill194_31)).doFinal(((byte[])(__sourceSpill194_30)));

        java.lang.String __sourceSpill194_36 = ((java.lang.String)(com.moon.hW.a(((byte[])(local8_life33))))).intern();

        java.lang.String[] __sourceSpill194_37 = local7_life21;

        int __sourceSpill194_38 = local5_life22;

        local5_life22 += 1;

        (__sourceSpill194_37)[__sourceSpill194_38] = __sourceSpill194_36;

        if (!(((local2_life27 = (local2_life27 + local3_life26)) < local6_life25))) { break; }

        local3_life26 = ((java.lang.String)(local4_life23)).charAt(((int)(local2_life27)));

    }

    local6_life25 = ((java.lang.String)((local4_life23 = "c+TÈ&µM\023\nßL\021®ÒJ®·{÷\022\017^èT\t`_u\030|¥`%pvãëi êÍ\032=Ú¿ä\024|Ò\033æË=W¯ì`Ó\033\"öC\026wÔsPk½WBCù_¨åÍÚ¦D\"}Y\003#Ò¬6\000\tÎJx>ö¼VF4·aeªÞ\006ïÀ\027½¥£\033/cm<¨«å¶>+ÇãL&MÁ±\bkÁ¶\035ÓI"))).length();

    local3_life26 = 80;

    local2_life27 = -1;

    while (true) {

        local2_life27 += 1;

        byte[] __sourceSpill194_44 = ((java.lang.String)(((java.lang.String)(local4_life23)).substring(((int)(local2_life27)), ((int)((local2_life27 + local3_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill194_45 = local0_life11;

        byte[] local8_life47 = ((javax.crypto.Cipher)(__sourceSpill194_45)).doFinal(((byte[])(__sourceSpill194_44)));

        java.lang.String __sourceSpill194_50 = ((java.lang.String)(com.moon.hW.a(((byte[])(local8_life47))))).intern();

        java.lang.String[] __sourceSpill194_51 = local7_life21;

        int __sourceSpill194_52 = local5_life22;

        local5_life22 += 1;

        (__sourceSpill194_51)[__sourceSpill194_52] = __sourceSpill194_50;

        if (!(((local2_life27 = (local2_life27 + local3_life26)) < local6_life25))) { break; }

        local3_life26 = ((java.lang.String)(local4_life23)).charAt(((int)(local2_life27)));

    }

    g = ((java.lang.String[])(local7_life21));

    h = ((java.lang.String[])(new java.lang.String[4]));

    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite194_57(26639, (3199121595989865410L ^ local9_life6)))))));
}


public static int[] b__ArrayInt() {
return com.moon.hW.e;
}


public void b() {
com.moon.hW forwardValue329_20_0;
    com.moon.iw forwardValue329_37_0;
    com.moon.hW spill329_0;
    com.moon.iw spill329_1;
    long life1_3;
    int[] life3_5;
    forward_join_37: {
    forward_join_32: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (com.moon.hW.f ^ 90527078281699L);
    life3_5 = com.moon.hW.b__ArrayInt();
    spill329_0 = this;
    if (!((life3_5 != null))) {
        forwardValue329_20_0 = spill329_0;
        break forward_join_20;
    }
    if (!(((com.moon.hW)(spill329_0)).d)) {
        break forward_join_19;
    }
    ((org.tinylog.TaggedLogger)(com.moon.hW.a)).error(((java.lang.Object)(__sourceIntrinsic_938da207dded_invokedynamic329_4(21203, (4521212280449211090L ^ life1_3)))));
    return;
    }
    forwardValue329_20_0 = this;
    }
    spill329_1 = ((com.moon.hW)(forwardValue329_20_0)).c;
    if (!((life3_5 != null))) {
        forwardValue329_37_0 = spill329_1;
        break forward_join_37;
    }
    if (!((spill329_1 == null))) {
        break forward_join_32;
    }
    ((org.tinylog.TaggedLogger)(com.moon.hW.a)).error(((java.lang.Object)(__sourceIntrinsic_938da207dded_invokedynamic329_8(385, (3313618384884517250L ^ life1_3)))));
    return;
    }
    this.d = ((boolean)(true));
    forwardValue329_37_0 = this.c;
    }
    ((com.moon.iw)(forwardValue329_37_0)).a(((com.moon.hY)(this.b)));
    this.d = ((boolean)(false));
    return;
}


public static void b(int[] p0) {
com.moon.hW.e = ((int[])(p0));
    return;
}


public com.moon.hW a(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1399_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1845);
    if (((com.moon.hW.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hW.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hW.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hW", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hW.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hW.h)[life5_8] = com.moon.hW.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hW.h)[life5_8];
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
        byte[] spill488_0 = p0;
        life4_9 += 1;
        life5_44 = (spill488_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill488_1 = p0;
        life4_9 += 1;
        life5_76 = (spill488_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill488_2 = p0;
        life4_9 += 1;
        life5_91 = (spill488_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static com.moon.hX a() {
return new com.moon.hX();
}


public void a(com.moon.jA p0) {
((com.moon.hY)(this.b)).a(((com.moon.jA)(p0)));
    return;
}


public void a(com.moon.iX p0) {
((com.moon.hY)(this.b)).a(((com.moon.iX)(p0)));
    return;
}


public void a__Void() {
com.moon.iw forwardValue328_21_0;
    int forwardValue328_39_0;
    com.moon.hY forwardValue328_42_0;
    com.moon.iw spill328_0;
    int spill328_1;
    com.moon.hY spill328_2;
    long life1_3;
    int[] life3_5;
    forward_join_45: {
    forward_join_42: {
    forward_join_39: {
    forward_join_34: {
    forward_join_21: {
    forward_join_19: {
    life1_3 = (com.moon.hW.f ^ 59112910619498L);
    life3_5 = com.moon.hW.b__ArrayInt();
    spill328_0 = this.c;
    if (!((life3_5 != null))) {
        forwardValue328_21_0 = spill328_0;
        break forward_join_21;
    }
    if (!((spill328_0 == null))) {
        break forward_join_19;
    }
    ((org.tinylog.TaggedLogger)(com.moon.hW.a)).error(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic328_4(273, (7326974565005736858L ^ life1_3)))));
    return;
    }
    forwardValue328_21_0 = this.c;
    }
    spill328_1 = ((com.moon.iU)(((com.moon.iw)(forwardValue328_21_0)).a__iU())).a();
    if (!((life3_5 != null))) {
        forwardValue328_39_0 = spill328_1;
        break forward_join_39;
    }
    if (!((spill328_1 != 0))) {
        break forward_join_34;
    }
    ((com.moon.hY)(this.b)).c(((int)(((com.moon.iU)(((com.moon.iw)(this.c)).a__iU())).a())));
    }
    spill328_2 = this.b;
    if (!((life3_5 != null))) {
        forwardValue328_42_0 = spill328_2;
        break forward_join_42;
    }
    forwardValue328_39_0 = ((((com.moon.hY)(spill328_2)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue328_39_0 != 0))) {
        break forward_join_45;
    }
    forwardValue328_42_0 = this.b;
    }
    ((com.moon.hY)(forwardValue328_42_0)).a(((com.moon.iw)(this.c)));
    }
    return;
}


public com.moon.hW a(com.moon.iw p0) {
this.c = ((com.moon.iw)(p0));
    return this;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public com.moon.iw a__iw() {
return this.c;
}


public com.moon.hY a__hY() {
return this.b;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite194_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_938da207dded_invokedynamic329_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_938da207dded_invokedynamic329_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1399_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic328_4(int a0, long a1) throws E;
}
