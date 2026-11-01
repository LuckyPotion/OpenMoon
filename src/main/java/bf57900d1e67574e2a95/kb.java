package com.moon;


public class kb extends com.moon.j7<com.moon.scripting.api.types.render.RenderBatch> {

private static java.lang.String[] a;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public kb() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3891401475866556053L)), ((long)(5127118636719437908L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(276315625769768L)))));
    java.lang.Object __sourceSpill211_6 = null;
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.kb.c ^ 83019491772523L);
    com.moon.kb.b(((java.lang.String[])(__sourceSpill211_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill211_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill211_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill211_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill211_16 = new byte[8];
    (__sourceSpill211_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill211_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation211_18 = __sourceSpill211_16;
    ((javax.crypto.Cipher)(__sourceSpill211_13)).init(((int)(__sourceSpill211_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill211_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation211_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[2];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "0óçö¢déz¯¦¿,õ_u\020uÆÓP\036©OÝE\"}k½ë"))).length();
    int local5_life26 = 16;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill211_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill211_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill211_31)).doFinal(((byte[])(__sourceSpill211_30)));
        java.lang.String __sourceSpill211_36 = ((java.lang.String)(com.moon.kb.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill211_37 = local9_life21;
        int __sourceSpill211_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill211_37)[__sourceSpill211_38] = __sourceSpill211_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    d = ((java.lang.String[])(local9_life21));
    e = ((java.lang.String[])(new java.lang.String[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(java.lang.String[] p0) {
a = ((java.lang.String[])(p0));
    return;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18602);
    if (((com.moon.kb.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kb.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kb.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kb", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kb.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kb.e)[life5_8] = com.moon.kb.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kb.e)[life5_8];
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
        byte[] spill627_0 = p0;
        life4_9 += 1;
        life5_44 = (spill627_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill627_1 = p0;
        life4_9 += 1;
        life5_76 = (spill627_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill627_2 = p0;
        life4_9 += 1;
        life5_91 = (spill627_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.kb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2037_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public org.luaj.vm2.LuaValue a__sourceBridge_5a7079cf45(java.lang.Object p0) {
return ((com.moon.kb)(this)).a(((com.moon.scripting.api.types.render.RenderBatch)(((com.moon.scripting.api.types.render.RenderBatch)(p0)))));
}


public org.luaj.vm2.LuaValue a(com.moon.scripting.api.types.render.RenderBatch p0) {
org.luaj.vm2.LuaTable forestValue100021_40_0;
    java.lang.String[] spill100021_0;
    org.luaj.vm2.LuaTable spill100021_1;
    long life2_3;
    org.luaj.vm2.LuaTable life5_7;
    java.lang.String[] life4_21;
    forest_join_40: {
    life2_3 = (com.moon.kb.c ^ 126245564210040L);
    life5_7 = new org.luaj.vm2.LuaTable();
    spill100021_0 = com.moon.kb.a();
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)(__sourceIntrinsic_f9348484aeff_invokedynamic100021_2(32130, (5294372299161921386L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qH(this, p0))));
    life4_21 = spill100021_0;
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)(__sourceIntrinsic_f9348484aeff_invokedynamic100021_4(7464, (2450048170867754945L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sB(this, p0))));
    spill100021_1 = life5_7;
    if (!((life4_21 != null))) {
        forestValue100021_40_0 = spill100021_1;
        break forest_join_40;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    forestValue100021_40_0 = spill100021_1;
    }
    return forestValue100021_40_0;
}


public static java.lang.String[] a() {
return com.moon.kb.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f9348484aeff_invokedynamic100021_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f9348484aeff_invokedynamic100021_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2037_0() throws E;


}
