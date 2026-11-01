package com.moon;


public class kn extends com.moon.kd<moom.y6> {

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public kn(java.lang.Class<moom.y6> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3138128920930942088L)), ((long)(-1690211954175420672L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10309153996027L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.kn.c ^ 7674907493845L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill222_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill222_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill222_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill222_14 = new byte[8];
    (__sourceSpill222_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill222_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation222_16 = __sourceSpill222_14;
    ((javax.crypto.Cipher)(__sourceSpill222_11)).init(((int)(__sourceSpill222_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill222_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation222_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[4];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "XªhL\031~9\021îä`\026èèµc=ÿ]\007\006ð­<Êã\036I  ¼ä[±è*qê\026Òè@\033öÂ#\020ÐrÛy\001Áèßx¼\032\f"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill222_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill222_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill222_29)).doFinal(((byte[])(__sourceSpill222_28)));
        java.lang.String __sourceSpill222_34 = ((java.lang.String)(com.moon.kn.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill222_35 = local9_life19;
        int __sourceSpill222_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill222_35)[__sourceSpill222_36] = __sourceSpill222_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "\\þ/\030¹\027óãImK\020¶\035b\031æ.µ\\²æë!àd"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill222_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill222_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill222_42)).doFinal(((byte[])(__sourceSpill222_41)));
        java.lang.String __sourceSpill222_47 = ((java.lang.String)(com.moon.kn.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill222_48 = local9_life19;
        int __sourceSpill222_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill222_48)[__sourceSpill222_49] = __sourceSpill222_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[4]));
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
        byte[] spill642_0 = p0;
        life4_9 += 1;
        life5_44 = (spill642_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill642_1 = p0;
        life4_9 += 1;
        life5_76 = (spill642_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill642_2 = p0;
        life4_9 += 1;
        life5_91 = (spill642_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26061);
    if (((com.moon.kn.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kn.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kn.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kn", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kn.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kn.e)[life5_8] = com.moon.kn.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kn.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.kn.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2072_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.y6 p1) {
long local3_life2 = (com.moon.kn.c ^ 1853245116279L);
    double local5_life5 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("x"))))).todouble();
    double local7_life8 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("y"))))).todouble();
    double local9_life11 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("z"))))).todouble();
    ((moom.y6)(p1)).a(((int)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_c202222b2170_originalDynamicSite104_13(651, (7193977609104135688L ^ local3_life2))))))).toint())));
    ((moom.y6)(p1)).a(((net.minecraft.network.play.client.C02PacketUseEntity$Action)((net.minecraft.network.play.client.C02PacketUseEntity$Action.values())[((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_c202222b2170_originalDynamicSite104_19(17517, (3321767700969214188L ^ local3_life2))))))).toint()])));
    ((moom.y6)(p1)).a(((moom.DR)(new moom.DR(local5_life5, local7_life8, local9_life11))));
    return;
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.kn)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.y6)(((moom.y6)(p1)))));
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.kn)(this)).a(((moom.y6)(((moom.y6)(p0)))));
}


public org.luaj.vm2.LuaTable a(moom.y6 p0) {
long local2_life2 = (com.moon.kn.c ^ 8568798258659L);
    org.luaj.vm2.LuaTable local4_life3 = new org.luaj.vm2.LuaTable();
    moom.DR local5_life5 = ((moom.y6)(p0)).a__DR();
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_d4031c66b15e_originalDynamicSite103_7(20446, (59196899947786696L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((moom.y6)(p0)).a()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_d4031c66b15e_originalDynamicSite103_12(9542, (5983879178337114962L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((int)(((net.minecraft.network.play.client.C02PacketUseEntity$Action)(((moom.y6)(p0)).a__bc())).ordinal()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("x")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.DR)(local5_life5)).a))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("y")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.DR)(local5_life5)).b))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("z")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.DR)(local5_life5)).c))))));
    return local4_life3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2072_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4031c66b15e_originalDynamicSite103_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d4031c66b15e_originalDynamicSite103_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c202222b2170_originalDynamicSite104_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c202222b2170_originalDynamicSite104_19(int a0, long a1) throws E;


}
