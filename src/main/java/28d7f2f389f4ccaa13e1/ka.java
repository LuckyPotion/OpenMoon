package com.moon;


public class ka extends com.moon.j7<com.moon.scripting.api.types.RayCastResult> {

private static java.lang.String[] a;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

public ka() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4888704862013734420L)), ((long)(4163245905660054765L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(60432761091560L)))));
    java.lang.Object __sourceSpill210_6 = null;
    f = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.ka.b(((java.lang.String[])(__sourceSpill210_6)));
    long local0_life9 = (com.moon.ka.c ^ 49758580938134L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill210_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill210_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill210_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill210_16 = new byte[8];
    (__sourceSpill210_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill210_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation210_18 = __sourceSpill210_16;
    ((javax.crypto.Cipher)(__sourceSpill210_13)).init(((int)(__sourceSpill210_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill210_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation210_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[5];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "!\\\177£æ1\0137\033Kâî÷æï\027ß2\020û9>²H­¹\\è{.ß©VÂ\030ÿà÷]\030ÉÀUJ×~\000BØçJ«ôüµù»"))).length();
    int local5_life26 = 24;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill210_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill210_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill210_31)).doFinal(((byte[])(__sourceSpill210_30)));
        java.lang.String __sourceSpill210_36 = ((java.lang.String)(com.moon.ka.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill210_37 = local9_life21;
        int __sourceSpill210_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill210_37)[__sourceSpill210_38] = __sourceSpill210_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "OÐÚåËOÇòù%rÏ^-\035d¼ÒûY\0201]PÚ×\033Ã\024 _@\001Üð"))).length();
    local5_life26 = 24;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill210_43 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill210_44 = local2_life11;
        byte[] local10_life46 = ((javax.crypto.Cipher)(__sourceSpill210_44)).doFinal(((byte[])(__sourceSpill210_43)));
        java.lang.String __sourceSpill210_49 = ((java.lang.String)(com.moon.ka.a(((byte[])(local10_life46))))).intern();
        java.lang.String[] __sourceSpill210_50 = local9_life21;
        int __sourceSpill210_51 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill210_50)[__sourceSpill210_51] = __sourceSpill210_49;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    d = ((java.lang.String[])(local9_life21));
    e = ((java.lang.String[])(new java.lang.String[5]));
}

private static native <E extends Throwable> org.luaj.vm2.LuaValue __sourceHandlerCall_526a9b5982b129790949(com.moon.ka a0, com.moon.scripting.api.types.RayCastResult a1) throws E;
private static final class __SourceHandler_526a9b5982b129790949 {

public static org.luaj.vm2.LuaValue f104(com.moon.ka receiver, com.moon.scripting.api.types.RayCastResult p0) throws Throwable {
    org.luaj.vm2.LuaTable spill104_0;
    long life2_3;
    org.luaj.vm2.LuaTable life4_11;
    forest_join_8: {
    life2_3 = (__fieldRead104_0() ^ 76815246828510L);
    if (!((p0 == null))) {
        break forest_join_8;
    }
    return __fieldRead104_1();
    }
    org.luaj.vm2.LuaTable __stackOp104_3_0 = __sourceUninitializedNEW104_2();
    spill104_0 = __stackOp104_3_0;
    __explicitNewInit104_4(__stackOp104_3_0);
    life4_11 = spill104_0;
    __call104_8(life4_11, __invokedynamic104_5(5087, (1841527336237093204L ^ life2_3)), __call104_7(__fieldRead104_6(p0)));
    __call104_12(life4_11, __invokedynamic104_9(1750, (7758902933120173151L ^ life2_3)), __call104_11(__fieldRead104_10(p0)));
    __call104_16(life4_11, __invokedynamic104_13(27102, (5153944464579701588L ^ life2_3)), __call104_15(__fieldRead104_14(p0)));
    __call104_20(life4_11, __invokedynamic104_17(14808, (1655891682795453271L ^ life2_3)), __call104_19(__fieldRead104_18(p0)));
    __call104_23(life4_11, __invokedynamic104_21(19103, (6136113350015682583L ^ life2_3)), __fieldRead104_22(p0));
    return life4_11;
}
private static native long __fieldRead104_0() throws Throwable;
private static native org.luaj.vm2.LuaValue __fieldRead104_1() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW104_2() throws Throwable;
private static native void __explicitNewInit104_4(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic104_5(int a0, long a1) throws Throwable;
private static native com.moon.scripting.api.enums.HitType __fieldRead104_6(com.moon.scripting.api.types.RayCastResult a0) throws Throwable;
private static native org.luaj.vm2.LuaValue __call104_7(com.moon.scripting.api.enums.HitType a0) throws Throwable;
private static native void __call104_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaValue a2) throws Throwable;
private static native java.lang.String __invokedynamic104_9(int a0, long a1) throws Throwable;
private static native com.moon.scripting.api.enums.Facing __fieldRead104_10(com.moon.scripting.api.types.RayCastResult a0) throws Throwable;
private static native org.luaj.vm2.LuaValue __call104_11(com.moon.scripting.api.enums.Facing a0) throws Throwable;
private static native void __call104_12(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaValue a2) throws Throwable;
private static native java.lang.String __invokedynamic104_13(int a0, long a1) throws Throwable;
private static native com.moon.scripting.api.types.Vec3i __fieldRead104_14(com.moon.scripting.api.types.RayCastResult a0) throws Throwable;
private static native org.luaj.vm2.LuaValue __call104_15(com.moon.scripting.api.types.Vec3i a0) throws Throwable;
private static native void __call104_16(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaValue a2) throws Throwable;
private static native java.lang.String __invokedynamic104_17(int a0, long a1) throws Throwable;
private static native com.moon.scripting.api.types.Vec3d __fieldRead104_18(com.moon.scripting.api.types.RayCastResult a0) throws Throwable;
private static native org.luaj.vm2.LuaValue __call104_19(com.moon.scripting.api.types.Vec3d a0) throws Throwable;
private static native void __call104_20(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaValue a2) throws Throwable;
private static native java.lang.String __invokedynamic104_21(int a0, long a1) throws Throwable;
private static native int __fieldRead104_22(com.moon.scripting.api.types.RayCastResult a0) throws Throwable;
private static native void __call104_23(org.luaj.vm2.LuaTable a0, java.lang.String a1, int a2) throws Throwable;

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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15193);
    if (((com.moon.ka.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ka.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ka.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ka", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ka.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ka.e)[life5_8] = com.moon.ka.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ka.e)[life5_8];
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
        byte[] spill625_0 = p0;
        life4_9 += 1;
        life5_44 = (spill625_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill625_1 = p0;
        life4_9 += 1;
        life5_76 = (spill625_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill625_2 = p0;
        life4_9 += 1;
        life5_91 = (spill625_2)[life4_9];
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
    java.lang.String local7 = com.moon.ka.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2033_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ka"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public org.luaj.vm2.LuaValue a(com.moon.scripting.api.types.RayCastResult p0) { return __sourceHandlerCall_526a9b5982b129790949(this, p0); }


public static java.lang.String[] a() {
return com.moon.ka.a;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2033_0() throws E;
}
