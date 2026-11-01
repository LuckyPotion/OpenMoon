package com.moon;


public class kw extends com.moon.kd<moom.zf> {

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public kw(java.lang.Class<moom.zf> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(570659692884757800L)), ((long)(5141749152598923604L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(229865911353325L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.kw.c ^ 3672900421347L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill231_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill231_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill231_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill231_14 = new byte[8];
    (__sourceSpill231_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill231_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation231_16 = __sourceSpill231_14;
    ((javax.crypto.Cipher)(__sourceSpill231_11)).init(((int)(__sourceSpill231_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill231_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation231_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[8];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "gO~®Û1¯Ê\"Ç)\036ÌÍ3#ê-úÊI\020Bë£qÝÅ¡´èIø²Èî\034\020\007%5n\037}\006fpõ¹Q{\020Â^\t?ò#Y%¡`æ\022Î¡!\020X\006£yTµ\002è+Á£\024K<\025\020å¦«â|ÑEæôêø }\006 b"))).length();
    int local5_life24 = 24;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill231_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill231_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill231_29)).doFinal(((byte[])(__sourceSpill231_28)));
        java.lang.String __sourceSpill231_34 = ((java.lang.String)(com.moon.kw.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill231_35 = local9_life19;
        int __sourceSpill231_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill231_35)[__sourceSpill231_36] = __sourceSpill231_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "-fË\033©q\007ôÞw/.@X/ú E+-M7+A¶74ie\023¬ÖZ\020õaD¤\017â~\023ÔÂ5R"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill231_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill231_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill231_42)).doFinal(((byte[])(__sourceSpill231_41)));
        java.lang.String __sourceSpill231_47 = ((java.lang.String)(com.moon.kw.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill231_48 = local9_life19;
        int __sourceSpill231_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill231_48)[__sourceSpill231_49] = __sourceSpill231_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[8]));
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
        byte[] spill653_0 = p0;
        life4_9 += 1;
        life5_44 = (spill653_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill653_1 = p0;
        life4_9 += 1;
        life5_76 = (spill653_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill653_2 = p0;
        life4_9 += 1;
        life5_91 = (spill653_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10983);
    if (((com.moon.kw.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kw.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kw.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kw", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kw.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kw.e)[life5_8] = com.moon.kw.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kw.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.kw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2101_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.zf p1) {
long local3_life2 = (com.moon.kw.c ^ 68837405308156L);
    ((moom.zf)(p1)).a(((float)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_4(26419, (5026800354160014469L ^ local3_life2))))))).tofloat())));
    ((moom.zf)(p1)).b(((float)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_9(20048, (42914472281759207L ^ local3_life2))))))).tofloat())));
    ((moom.zf)(p1)).a(((boolean)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_14(19837, (4236878593633771213L ^ local3_life2))))))).toboolean())));
    ((moom.zf)(p1)).b(((boolean)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_19(20833, (7179942397581312724L ^ local3_life2))))))).toboolean())));
    return;
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.kw)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.zf)(((moom.zf)(p1)))));
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.kw)(this)).a(((moom.zf)(((moom.zf)(p0)))));
}


public org.luaj.vm2.LuaTable a(moom.zf p0) {
long local2_life2 = (com.moon.kw.c ^ 98475805390805L);
    org.luaj.vm2.LuaTable local4_life3 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_5(26929, (7578687608883476908L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.zf)(p0)).c())))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_10(2878, (491471148581460900L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.zf)(p0)).d())))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_15(21277, (4124391996562686853L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((moom.zf)(p0)).c__Boolean()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_20(1421, (3056359945862419734L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((moom.zf)(p0)).d__Boolean()))))));
    return local4_life3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2101_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0548ddb8ddc_originalDynamicSite119_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_37b2ad66d0b7_originalDynamicSite120_19(int a0, long a1) throws E;


}
