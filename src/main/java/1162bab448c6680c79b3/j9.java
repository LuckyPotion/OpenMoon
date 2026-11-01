package com.moon;


public class j9 extends com.moon.j7<com.moon.scripting.api.types.Item> {

private static final long a;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public j9() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(934840333392075581L)), ((long)(116651932333779181L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(31457511071748L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.j9.a ^ 103299218792870L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill179_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill179_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill179_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill179_14 = new byte[8];
    (__sourceSpill179_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill179_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation179_16 = __sourceSpill179_14;
    ((javax.crypto.Cipher)(__sourceSpill179_11)).init(((int)(__sourceSpill179_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill179_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation179_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[7];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "k=\\Q·ÕW¸DkªgL,¦¹P^gEP3\030.¶\034«B5ÆÁ¸6}\004ìDy*±æïC ¸\026Äh+\bÜ÷e\003H\037/\002ºÜð«=,yOT?¿æ¼Kï\020´ºxÓ®öÀA(Ü³Ï½\030Xüò¬&\017'\034ÿn\000µöÈ8\tP-"))).length();
    int local5_life24 = 24;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill179_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill179_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill179_29)).doFinal(((byte[])(__sourceSpill179_28)));
        java.lang.String __sourceSpill179_34 = ((java.lang.String)(com.moon.j9.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill179_35 = local9_life19;
        int __sourceSpill179_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill179_35)[__sourceSpill179_36] = __sourceSpill179_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "<äël<¯\036¾;S¼á2\034(Í*\013)ôÊ¡Vi\030,¦9\\sò\020$ÿX§\027k\023Gý\" ¢ ¬ß"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill179_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill179_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill179_42)).doFinal(((byte[])(__sourceSpill179_41)));
        java.lang.String __sourceSpill179_47 = ((java.lang.String)(com.moon.j9.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill179_48 = local9_life19;
        int __sourceSpill179_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill179_48)[__sourceSpill179_49] = __sourceSpill179_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[7]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1864_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/j9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.j9.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25082);
    if (((com.moon.j9.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.j9.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.j9.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/j9", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.j9.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.j9.d)[life5_8] = com.moon.j9.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.j9.d)[life5_8];
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
        byte[] spill568_0 = p0;
        life4_9 += 1;
        life5_44 = (spill568_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill568_1 = p0;
        life4_9 += 1;
        life5_76 = (spill568_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill568_2 = p0;
        life4_9 += 1;
        life5_91 = (spill568_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public org.luaj.vm2.LuaValue a(com.moon.scripting.api.types.Item p0) {
long life2_3;
    java.lang.String[] life4_5;
    org.luaj.vm2.LuaTable life5_13;
    java.util.ArrayList life6_71;
    com.moon.scripting.api.types.Enchantment[] life7_80;
    int life8_83;
    int life9_85;
    com.moon.scripting.api.types.Enchantment life10_92;
    org.luaj.vm2.LuaValue life11_95;
    forest_join_117: {
    forest_join_104: {
    forest_join_10: {
    life2_3 = (com.moon.j9.a ^ 89396651434042L);
    life4_5 = com.moon.ka.a();
    if (!((p0 == null))) {
        break forest_join_10;
    }
    return org.luaj.vm2.LuaValue.NIL;
    }
    life5_13 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life5_13)).set(((java.lang.String)(__sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_3(12884, (2066090195789064104L ^ life2_3)))), ((java.lang.String)(((com.moon.scripting.api.types.Item)(p0)).name)));
    ((org.luaj.vm2.LuaTable)(life5_13)).set(((java.lang.String)(__sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_6(16012, (1784524524373912434L ^ life2_3)))), ((java.lang.String)(((com.moon.scripting.api.types.Item)(p0)).display_name)));
    ((org.luaj.vm2.LuaTable)(life5_13)).set(((java.lang.String)(__sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_9(18729, (1286420297830587601L ^ life2_3)))), ((int)(((com.moon.scripting.api.types.Item)(p0)).max_stack_size)));
    ((org.luaj.vm2.LuaTable)(life5_13)).set(((java.lang.String)(__sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_12(16689, (3434943067899385035L ^ life2_3)))), ((int)(((com.moon.scripting.api.types.Item)(p0)).stack_size)));
    ((org.luaj.vm2.LuaTable)(life5_13)).set(((java.lang.String)(__sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_15(25493, (5751533157588072046L ^ life2_3)))), ((int)(((com.moon.scripting.api.types.Item)(p0)).max_damage)));
    ((org.luaj.vm2.LuaTable)(life5_13)).set(((java.lang.String)(__sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_18(27909, (2059027383746984188L ^ life2_3)))), ((int)(((com.moon.scripting.api.types.Item)(p0)).damage)));
    life6_71 = new java.util.ArrayList();
    if (!((life4_5 == null))) {
        break forest_join_117;
    }
    if (!((((com.moon.scripting.api.types.Item)(p0)).enchantments != null))) {
        break forest_join_104;
    }
    life7_80 = ((com.moon.scripting.api.types.Item)(p0)).enchantments;
    life8_83 = (life7_80).length;
    life9_85 = 0;
    forest_cycle_85: while (true) {
    if (!((life9_85 < life8_83))) {
        break forest_join_104;
    }
    life10_92 = (life7_80)[life9_85];
    life11_95 = com.moon.j6.a__LuaValue(((java.lang.Object)(life10_92)));
    ((java.util.List)(life6_71)).add(((java.lang.Object)(life11_95)));
    life9_85 += 1;
    if (!((life4_5 == null))) {
        break forest_join_117;
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_85;
    }
    break forest_cycle_85;
    }
    }
    ((org.luaj.vm2.LuaTable)(life5_13)).set(((java.lang.String)(__sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_25(9805, (7049378279251129266L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaTable.listOf(((org.luaj.vm2.LuaValue[])(((org.luaj.vm2.LuaValue[])(((java.util.List)(life6_71)).toArray(((java.lang.Object[])(new org.luaj.vm2.LuaValue[0])))))))))));
    }
    return life5_13;
}


public org.luaj.vm2.LuaValue a__sourceBridge_5a7079cf45(java.lang.Object p0) {
return ((com.moon.j9)(this)).a(((com.moon.scripting.api.types.Item)(((com.moon.scripting.api.types.Item)(p0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16c0ecd67bbb_invokedynamic100005_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1864_0() throws E;


}
