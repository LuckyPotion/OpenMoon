package com.moon;


public class j_ extends com.moon.j7<com.moon.scripting.api.types.Potion> {

private static final long a;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public j_() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(2186725826420357892L)), ((long)(7674410740739420612L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(238188928354206L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.j_.a ^ 129142368819118L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill194_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill194_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill194_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill194_14 = new byte[8];
    (__sourceSpill194_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill194_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation194_16 = __sourceSpill194_14;
    ((javax.crypto.Cipher)(__sourceSpill194_11)).init(((int)(__sourceSpill194_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill194_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation194_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[6];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "Èqäv³þè Ö=Q­\\\032\032\001ÊÏÇ,÷´÷ÐÅZåã°ò\020fó=«ÁÅö\030à÷9§?úo &F\rN<1µüËÎ N·ÐÁî\020°n$Ó\004ÊïáÑFvB\0204¼\022\013cgí<lÒÓ ÂoÍ"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill194_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill194_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill194_29)).doFinal(((byte[])(__sourceSpill194_28)));
        java.lang.String __sourceSpill194_34 = ((java.lang.String)(com.moon.j_.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill194_35 = local9_life19;
        int __sourceSpill194_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill194_35)[__sourceSpill194_36] = __sourceSpill194_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "[t¹óÚ7ùÉ}¡·ç¶?®¬Wø\"uÚiU\032}$öxâ>Ä\020?ºÎ£ªF\\þ\031æMü¤"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill194_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill194_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill194_42)).doFinal(((byte[])(__sourceSpill194_41)));
        java.lang.String __sourceSpill194_47 = ((java.lang.String)(com.moon.j_.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill194_48 = local9_life19;
        int __sourceSpill194_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill194_48)[__sourceSpill194_49] = __sourceSpill194_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[6]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1943_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/j_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.j_.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7319);
    if (((com.moon.j_.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.j_.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.j_.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/j_", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.j_.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.j_.d)[life5_8] = com.moon.j_.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.j_.d)[life5_8];
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
        byte[] spill594_0 = p0;
        life4_9 += 1;
        life5_44 = (spill594_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill594_1 = p0;
        life4_9 += 1;
        life5_76 = (spill594_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill594_2 = p0;
        life4_9 += 1;
        life5_91 = (spill594_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public org.luaj.vm2.LuaValue a(com.moon.scripting.api.types.Potion p0) {
long life2_3;
    org.luaj.vm2.LuaTable life4_11;
    forest_join_8: {
    life2_3 = (com.moon.j_.a ^ 50518168123164L);
    if (!((p0 == null))) {
        break forest_join_8;
    }
    return org.luaj.vm2.LuaValue.NIL;
    }
    life4_11 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life4_11)).set(((java.lang.String)(__sourceIntrinsic_463bcfa022db_invokedynamic100018_2(10908, (924548912257607715L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.scripting.api.types.Potion)(p0)).id))))));
    ((org.luaj.vm2.LuaTable)(life4_11)).set(((java.lang.String)(__sourceIntrinsic_463bcfa022db_invokedynamic100018_6(26872, (2781394896420072001L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((java.lang.String)(((com.moon.scripting.api.types.Potion)(p0)).name))))));
    ((org.luaj.vm2.LuaTable)(life4_11)).set(((java.lang.String)(__sourceIntrinsic_463bcfa022db_invokedynamic100018_10(2996, (4204209155936225550L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.scripting.api.types.Potion)(p0)).duration))))));
    ((org.luaj.vm2.LuaTable)(life4_11)).set(((java.lang.String)(__sourceIntrinsic_463bcfa022db_invokedynamic100018_14(24516, (2262775668335041914L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.scripting.api.types.Potion)(p0)).amplifier))))));
    ((org.luaj.vm2.LuaTable)(life4_11)).set(((java.lang.String)(__sourceIntrinsic_463bcfa022db_invokedynamic100018_18(7672, (6063513032705744704L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.scripting.api.types.Potion)(p0)).bad_effect))))));
    ((org.luaj.vm2.LuaTable)(life4_11)).set(((java.lang.String)(__sourceIntrinsic_463bcfa022db_invokedynamic100018_22(28459, (6771711042317741456L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.scripting.api.types.Potion)(p0)).color))))));
    return life4_11;
}


public org.luaj.vm2.LuaValue a__sourceBridge_5a7079cf45(java.lang.Object p0) {
return ((com.moon.j_)(this)).a(((com.moon.scripting.api.types.Potion)(((com.moon.scripting.api.types.Potion)(p0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_463bcfa022db_invokedynamic100018_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_463bcfa022db_invokedynamic100018_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_463bcfa022db_invokedynamic100018_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_463bcfa022db_invokedynamic100018_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_463bcfa022db_invokedynamic100018_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_463bcfa022db_invokedynamic100018_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1943_0() throws E;


}
