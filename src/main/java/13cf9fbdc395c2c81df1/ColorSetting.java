package com.moon.setting;


public class ColorSetting extends com.moon.setting.Setting<java.lang.Integer> {

private static final long k;

private static final java.lang.String[] l;

private static final java.lang.String[] m;

private static final java.util.Map n;

private ColorSetting(java.lang.String p0) {
super(p0, com.moon.cf.COLOR);
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-148339767129877058L)), ((long)(-8684775828736307272L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251185525499322L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.setting.ColorSetting.k ^ 65148356637741L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill459_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill459_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill459_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill459_14 = new byte[8];
    (__sourceSpill459_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill459_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation459_16 = __sourceSpill459_14;
    ((javax.crypto.Cipher)(__sourceSpill459_11)).init(((int)(__sourceSpill459_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill459_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation459_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "ir)F´1y;\n2êY\035¸ò\020tE9\t\003e±­\032Ñ\177qoç+¦\020\0206¥}[[`NÉÝ\001ËÊ\036Ý"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill459_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill459_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill459_29)).doFinal(((byte[])(__sourceSpill459_28)));
        java.lang.String __sourceSpill459_34 = ((java.lang.String)(com.moon.setting.ColorSetting.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill459_35 = local9_life19;
        int __sourceSpill459_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill459_35)[__sourceSpill459_36] = __sourceSpill459_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    l = ((java.lang.String[])(local9_life19));
    m = ((java.lang.String[])(new java.lang.String[3]));
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
        byte[] spill1728_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1728_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1728_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1728_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1728_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1728_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 553);
    if (((com.moon.setting.ColorSetting.m)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.ColorSetting.n)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.ColorSetting.n)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kX", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.setting.ColorSetting.l)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.ColorSetting.m)[life5_8] = com.moon.setting.ColorSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.ColorSetting.m)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.setting.ColorSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3591_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static com.moon.mb builder(java.lang.String p0) {
return new com.moon.mb(p0);
}


public com.google.gson.JsonObject toJson() {
long local1 = (com.moon.setting.ColorSetting.k ^ 45992794813500L);
    com.google.gson.JsonObject local3 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1041_1(20236, (7737452168250730604L ^ local1)))), ((java.lang.String)(((com.moon.setting.ColorSetting)(this)).getId())));
    ((com.google.gson.JsonObject)(local3)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_originalDynamicSite1041_4(19192, (6214983388328209818L ^ local1)))), ((java.lang.Number)(((java.lang.Number)(((com.moon.setting.ColorSetting)(this)).getValue())))));
    return local3;
}


public void fromJson(com.google.gson.JsonObject p0) {
long local2 = (com.moon.setting.ColorSetting.k ^ 5727303465912L);
    if (((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic3592_1(16953, (6126058344434903772L ^ local2)))))) {
        ((com.moon.setting.ColorSetting)(this)).setValue(((java.lang.Integer.valueOf(((int)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic3592_3(19192, (6215005519578440222L ^ local2))))))).getAsInt()))))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3591_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1041_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_originalDynamicSite1041_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic3592_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic3592_3(int a0, long a1) throws E;
}
