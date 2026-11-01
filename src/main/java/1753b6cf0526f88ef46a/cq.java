package com.moon;


public class cq {

private static final com.google.gson.Gson a;

private static final org.tinylog.TaggedLogger b;

private com.moon.cx c;

private com.moon.aP d;

private static final long e;

private static final java.lang.String[] f;

private static final java.lang.String[] g;

private static final java.util.Map h;

public cq(com.moon.cx p0, com.moon.aP p1) {
super();
    this.c = p0;
    this.d = p1;
}


public cq() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-3360367263909628652L)), ((long)(6901669581626832321L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44209203621743L)))));

    long local9_life6 = (com.moon.cq.e ^ 55719432449268L);

    h = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill110_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill110_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill110_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill110_14 = new byte[8];

    (__sourceSpill110_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill110_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation110_16 = __sourceSpill110_14;

    ((javax.crypto.Cipher)(__sourceSpill110_11)).init(((int)(__sourceSpill110_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill110_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation110_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[7];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = ">£\0247 Ñ³Æ+\034m³Uí#½çjUÑ¡ãøH>OIkT\027S¬N'­©àwm3p¦%1\\;SIÜ£ÖØe$õZ3\032§s0Uru&ªÀº\"~Í7Y¦ø\002§±s\tÈ<á\020ªiÇ³1\n0\003ÁàÝ\027n(ß\031ø|Õ>\003PôvñµPÄ·@õ]ºkÞs\000Ð\bÁöòÕÇ\002ö !b@W(&â\027ÎUë\0173£¹ÛZÙ©lHÇ¡èä«{\004*PÐs!É\032bF\033ö\030öd¥2£É\001k#Nh$D\0228=­ìDÅ¿­\020Â%D¬\013W\031âãíUá\027\006¾"))).length();

    int local3_life24 = 88;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill110_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill110_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill110_29)).doFinal(((byte[])(__sourceSpill110_28)));

        java.lang.String __sourceSpill110_34 = ((java.lang.String)(com.moon.cq.a(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill110_35 = local7_life19;

        int __sourceSpill110_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill110_35)[__sourceSpill110_36] = __sourceSpill110_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "\020º¥\022¢TÉ¦\001^ñ½¯mt\020U(Ü\020ÂÑ÷!#âÊé"))).length();

    local3_life24 = 16;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill110_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill110_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill110_43)).doFinal(((byte[])(__sourceSpill110_42)));

        java.lang.String __sourceSpill110_48 = ((java.lang.String)(com.moon.cq.a(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill110_49 = local7_life19;

        int __sourceSpill110_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill110_49)[__sourceSpill110_50] = __sourceSpill110_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    f = ((java.lang.String[])(local7_life19));

    g = ((java.lang.String[])(new java.lang.String[7]));

    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));

    b = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite110_58(27884, (5298455134736438097L ^ local9_life6)))))));
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
        byte[] spill139_0 = p0;
        life4_9 += 1;
        life5_44 = (spill139_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill139_1 = p0;
        life4_9 += 1;
        life5_76 = (spill139_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill139_2 = p0;
        life4_9 += 1;
        life5_91 = (spill139_2)[life4_9];
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


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral866_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5691);
    if (((com.moon.cq.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.cq.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.cq.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/cq", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.cq.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.cq.g)[life5_8] = com.moon.cq.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.cq.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.cq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.aP a__aP() {
return this.d;
}


public com.moon.cx a__cx() {
return this.c;
}


public static com.moon.cq a(com.google.gson.JsonElement p0) {
com.google.gson.JsonObject forwardValue37_49_0;
    java.lang.String forwardValue37_49_1;
    com.google.gson.JsonObject spill37_0;
    java.lang.String spill37_1;
    long life1_3;
    int[] life3_5;
    com.google.gson.JsonObject life4_16;
    com.moon.aP life5_67;
    com.moon.cx life6_80;
    forward_join_79: {
    forward_join_72: {
    forward_join_49: {
    forward_join_43: {
    forward_join_41: {
    forward_join_34: {
    life1_3 = (com.moon.cq.e ^ 57373309945691L);
    life3_5 = com.moon.cs.b();
    if (!((life3_5 != null))) {
        break forward_join_79;
    }
    if (!(((com.google.gson.JsonElement)(p0)).isJsonObject())) {
        break forward_join_72;
    }
    life4_16 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    if (!((life3_5 != null))) {
        break forward_join_41;
    }
    if (!(((com.google.gson.JsonObject)(life4_16)).has(((java.lang.String)(__sourceIntrinsic_8a830aed593b_invokedynamic37_4(12048, (4364301900464405249L ^ life1_3))))))) {
        break forward_join_34;
    }
    spill37_0 = life4_16;
    spill37_1 = __sourceIntrinsic_8a830aed593b_invokedynamic37_6(9553, (2414236619348324677L ^ life1_3));
    if (!((life3_5 != null))) {
        forwardValue37_49_0 = spill37_0;
        forwardValue37_49_1 = spill37_1;
        break forward_join_49;
    }
    if (!((!((com.google.gson.JsonObject)(spill37_0)).has(((java.lang.String)(spill37_1)))))) {
        break forward_join_43;
    }
    }
    ((org.tinylog.TaggedLogger)(com.moon.cq.b)).error(((java.lang.Object)(__sourceIntrinsic_8a830aed593b_invokedynamic37_9(29098, (7054168799697102266L ^ life1_3)))));
    }
    return null;
    }
    forwardValue37_49_0 = life4_16;
    forwardValue37_49_1 = __sourceIntrinsic_8a830aed593b_invokedynamic37_11(32696, (2250848987138288557L ^ life1_3));
    }
    life5_67 = com.moon.aP.valueOf(((java.lang.String)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(forwardValue37_49_0)).get(((java.lang.String)(forwardValue37_49_1))))).getAsString())));
    life6_80 = ((com.moon.cx)(((com.google.gson.Gson)(com.moon.cq.a)).fromJson(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life4_16)).get(((java.lang.String)(__sourceIntrinsic_8a830aed593b_invokedynamic37_16(8597, (8627551006974457219L ^ life1_3))))))), ((java.lang.Class)(((com.moon.aP)(life5_67)).a__Class())))));
    return new com.moon.cq(life6_80, life5_67);
    }
    ((org.tinylog.TaggedLogger)(com.moon.cq.b)).error(((java.lang.Object)(__sourceIntrinsic_8a830aed593b_invokedynamic37_22(20386, (2354077260801760177L ^ life1_3)))));
    }
    return null;
}


public com.google.gson.JsonObject a() {
long life1_3;
    com.google.gson.JsonObject life4_8;
    int[] life3_9;
    life1_3 = (com.moon.cq.e ^ 110534853607578L);
    int[] spill6_0 = com.moon.cs.b();
    life4_8 = new com.google.gson.JsonObject();
    life3_9 = spill6_0;
    ((com.google.gson.JsonObject)(life4_8)).addProperty(((java.lang.String)(__sourceIntrinsic_41388ed6dc39_invokedynamic6_2(32696, (2250902147602443372L ^ life1_3)))), ((java.lang.String)(((com.moon.aP)(this.d)).name())));
    ((com.google.gson.JsonObject)(life4_8)).add(((java.lang.String)(__sourceIntrinsic_41388ed6dc39_invokedynamic6_6(8597, (8627603068905304642L ^ life1_3)))), ((com.google.gson.JsonElement)(((com.google.gson.Gson)(com.moon.cq.a)).toJsonTree(((java.lang.Object)(this.c))))));
    com.google.gson.JsonObject spill6_1 = life4_8;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.cs.b(((int[])(new int[5])));
    }
    return spill6_1;
}


public com.moon.cq a(com.moon.cx p0) {
this.c = ((com.moon.cx)(p0));
    return this;
}


public com.moon.cq a(com.moon.aP p0) {
this.d = ((com.moon.aP)(p0));
    return this;
}


public void a__Void() {
java.lang.Object local1 = ((com.moon.aP)(this.d)).a();
    ((com.moon.cu)(local1)).a(((com.moon.cq)(this)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite110_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41388ed6dc39_invokedynamic6_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41388ed6dc39_invokedynamic6_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a830aed593b_invokedynamic37_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a830aed593b_invokedynamic37_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a830aed593b_invokedynamic37_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a830aed593b_invokedynamic37_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a830aed593b_invokedynamic37_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8a830aed593b_invokedynamic37_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral866_0() throws E;
}
