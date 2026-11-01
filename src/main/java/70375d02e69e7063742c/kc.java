package com.moon;


public class kc extends com.moon.j7<com.moon.scripting.api.types.Block> {

private static int a;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

public kc() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(8673843101013967161L)), ((long)(2991136567984477077L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(273304373454105L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill212_7 = 0;
    long local0_life8 = (com.moon.kc.c ^ 104068638491933L);
    com.moon.kc.a(((int)(__sourceSpill212_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill212_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill212_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill212_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill212_16 = new byte[8];
    (__sourceSpill212_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill212_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation212_18 = __sourceSpill212_16;
    ((javax.crypto.Cipher)(__sourceSpill212_13)).init(((int)(__sourceSpill212_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill212_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation212_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[7];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "ÔõgV¸È fª´<qg#\\Js°'iØ\007<ní\024ã\n\030L>s`&ý3Ñ\023Úb*.&î²¥ó4(·\bUBº7\005Zßï7EjD@êEGò[z«¢òíX>ðÔ­{Õ\005Õ\020%åp×\007­tÓ¼¥o\b$(8\030ÓOM¸W,h\022ÑeÅzÍø3Àç¤È\032N"))).length();
    int local5_life26 = 32;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill212_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill212_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill212_31)).doFinal(((byte[])(__sourceSpill212_30)));
        java.lang.String __sourceSpill212_36 = ((java.lang.String)(com.moon.kc.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill212_37 = local9_life21;
        int __sourceSpill212_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill212_37)[__sourceSpill212_38] = __sourceSpill212_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "³­\0204¶;G{r\rt\177ï\020(Çè&VÎD\f¬eAþ< \007p\016±\026süö1\016|.'â\020\004ÏÉð\034OQ7Åº¬Àí"))).length();
    local5_life26 = 32;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill212_43 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill212_44 = local2_life11;
        byte[] local10_life46 = ((javax.crypto.Cipher)(__sourceSpill212_44)).doFinal(((byte[])(__sourceSpill212_43)));
        java.lang.String __sourceSpill212_49 = ((java.lang.String)(com.moon.kc.a(((byte[])(local10_life46))))).intern();
        java.lang.String[] __sourceSpill212_50 = local9_life21;
        int __sourceSpill212_51 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill212_50)[__sourceSpill212_51] = __sourceSpill212_49;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    d = ((java.lang.String[])(local9_life21));
    e = ((java.lang.String[])(new java.lang.String[7]));
}

private static native <E extends Throwable> org.luaj.vm2.LuaValue __sourceHandlerCall_17ccf9bec97e0c91be5f(com.moon.kc a0, com.moon.scripting.api.types.Block a1) throws E;
private static final class __SourceHandler_17ccf9bec97e0c91be5f {

public static org.luaj.vm2.LuaValue f105(com.moon.kc receiver, com.moon.scripting.api.types.Block p0) throws Throwable {
    org.luaj.vm2.LuaTable spill105_0;
    long life2_3;
    org.luaj.vm2.LuaTable life4_11;
    forest_join_8: {
    life2_3 = (__fieldRead105_0() ^ 75297727616813L);
    if (!((p0 == null))) {
        break forest_join_8;
    }
    return __fieldRead105_1();
    }
    org.luaj.vm2.LuaTable __stackOp105_3_0 = __sourceUninitializedNEW105_2();
    spill105_0 = __stackOp105_3_0;
    __explicitNewInit105_4(__stackOp105_3_0);
    life4_11 = spill105_0;
    __call105_8(life4_11, __invokedynamic105_5(6887, (6875313877942200828L ^ life2_3)), __call105_7(__fieldRead105_6(p0)));
    __call105_12(life4_11, __invokedynamic105_9(3623, (8280804885697527098L ^ life2_3)), __call105_11(__fieldRead105_10(p0)));
    __call105_16(life4_11, __invokedynamic105_13(247, (1914842854405403630L ^ life2_3)), __call105_15(__fieldRead105_14(p0)));
    __call105_20(life4_11, __invokedynamic105_17(16965, (1842129468485120347L ^ life2_3)), __call105_19(__fieldRead105_18(p0)));
    __call105_24(life4_11, __invokedynamic105_21(5289, (4998296061227591605L ^ life2_3)), __call105_23(((double) __fieldRead105_22(p0))));
    __call105_28(life4_11, __invokedynamic105_25(12682, (2931611852928598672L ^ life2_3)), __call105_27(((double) __fieldRead105_26(p0))));
    __call105_32(life4_11, __invokedynamic105_29(2905, (8567530604931741761L ^ life2_3)), __call105_31(((double) __fieldRead105_30(p0))));
    return life4_11;
}
private static native long __fieldRead105_0() throws Throwable;
private static native org.luaj.vm2.LuaValue __fieldRead105_1() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW105_2() throws Throwable;
private static native void __explicitNewInit105_4(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic105_5(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead105_6(com.moon.scripting.api.types.Block a0) throws Throwable;
private static native org.luaj.vm2.LuaString __call105_7(java.lang.String a0) throws Throwable;
private static native void __call105_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaString a2) throws Throwable;
private static native java.lang.String __invokedynamic105_9(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead105_10(com.moon.scripting.api.types.Block a0) throws Throwable;
private static native org.luaj.vm2.LuaString __call105_11(java.lang.String a0) throws Throwable;
private static native void __call105_12(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaString a2) throws Throwable;
private static native java.lang.String __invokedynamic105_13(int a0, long a1) throws Throwable;
private static native boolean __fieldRead105_14(com.moon.scripting.api.types.Block a0) throws Throwable;
private static native org.luaj.vm2.LuaBoolean __call105_15(boolean a0) throws Throwable;
private static native void __call105_16(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaBoolean a2) throws Throwable;
private static native java.lang.String __invokedynamic105_17(int a0, long a1) throws Throwable;
private static native boolean __fieldRead105_18(com.moon.scripting.api.types.Block a0) throws Throwable;
private static native org.luaj.vm2.LuaBoolean __call105_19(boolean a0) throws Throwable;
private static native void __call105_20(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaBoolean a2) throws Throwable;
private static native java.lang.String __invokedynamic105_21(int a0, long a1) throws Throwable;
private static native float __fieldRead105_22(com.moon.scripting.api.types.Block a0) throws Throwable;
private static native org.luaj.vm2.LuaNumber __call105_23(double a0) throws Throwable;
private static native void __call105_24(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaNumber a2) throws Throwable;
private static native java.lang.String __invokedynamic105_25(int a0, long a1) throws Throwable;
private static native float __fieldRead105_26(com.moon.scripting.api.types.Block a0) throws Throwable;
private static native org.luaj.vm2.LuaNumber __call105_27(double a0) throws Throwable;
private static native void __call105_28(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaNumber a2) throws Throwable;
private static native java.lang.String __invokedynamic105_29(int a0, long a1) throws Throwable;
private static native float __fieldRead105_30(com.moon.scripting.api.types.Block a0) throws Throwable;
private static native org.luaj.vm2.LuaNumber __call105_31(double a0) throws Throwable;
private static native void __call105_32(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaNumber a2) throws Throwable;

}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static int e() {
int local0 = com.moon.kc.a();
    if ((local0 == 0)) {
        return 52;
    }
    return 0;
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
        byte[] spill629_0 = p0;
        life4_9 += 1;
        life5_44 = (spill629_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill629_1 = p0;
        life4_9 += 1;
        life5_76 = (spill629_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill629_2 = p0;
        life4_9 += 1;
        life5_91 = (spill629_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16131);
    if (((com.moon.kc.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kc.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kc.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kc", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kc.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kc.e)[life5_8] = com.moon.kc.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kc.e)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2041_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.kc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static void a(int p0) {
a = ((int)(p0));
    return;
}


public static int a() {
return com.moon.kc.a;
}


public org.luaj.vm2.LuaValue a(com.moon.scripting.api.types.Block p0) { return __sourceHandlerCall_17ccf9bec97e0c91be5f(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2041_0() throws E;
}
