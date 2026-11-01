package com.moon;


public class jQ extends com.moon.jN {

private com.moon.jZ c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public jQ() { super((java.lang.String)null); }

private static void __sourceConstructorBody_0f06112c9c6e2d11(com.moon.jQ receiver) throws Throwable {
long local1 = (com.moon.jQ.d ^ 41289688834683L);
    com.moon.jQ.__sourceConstructorInit_0f06112c9c6e2d11_0(((com.moon.jQ)(receiver)), ((java.lang.String)(__sourceIntrinsic_0f06112c9c6e2d11_originalDynamicSite1086_1(17536, (7923609648019292222L ^ local1)))));
    ((com.moon.jQ)(receiver)).c = ((com.moon.jZ)(new com.moon.jZ()));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-8162555036389525948L)), ((long)(-9139503712356984115L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(124571834631459L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jQ.d ^ 54148786986053L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill187_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill187_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill187_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill187_14 = new byte[8];
    (__sourceSpill187_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill187_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation187_16 = __sourceSpill187_14;
    ((javax.crypto.Cipher)(__sourceSpill187_11)).init(((int)(__sourceSpill187_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill187_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation187_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[5];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "Û©[Ñçå¬¤¯\002L2!©4¹j ¨\030.ÔY\031¥.¹\020?Çw\007ü¹¢6¯~µÀê\020Àô¢å®;d¨/\007\034K\r'N"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill187_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill187_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill187_29)).doFinal(((byte[])(__sourceSpill187_28)));
        java.lang.String __sourceSpill187_34 = ((java.lang.String)(com.moon.jQ.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill187_35 = local9_life19;
        int __sourceSpill187_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill187_35)[__sourceSpill187_36] = __sourceSpill187_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "j·$º\036\037£ÖÙÚSÝi\013¨/÷\000¿{:\007ÃGÛøi\020=ÇnaÊ4{\027\020\026Ú÷tsdR'Rp\0262"))).length();
    local5_life24 = 40;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill187_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill187_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill187_42)).doFinal(((byte[])(__sourceSpill187_41)));
        java.lang.String __sourceSpill187_47 = ((java.lang.String)(com.moon.jQ.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill187_48 = local9_life19;
        int __sourceSpill187_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill187_48)[__sourceSpill187_49] = __sourceSpill187_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0f06112c9c6e2d11_0(com.moon.jQ a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_f4c2fa4d0072b0e9ba15(com.moon.jQ a0, org.luaj.vm2.LuaTable a1) throws E;
private static final class __SourceHandler_f4c2fa4d0072b0e9ba15 {

public static void f95(com.moon.jQ receiver, org.luaj.vm2.LuaTable p0) throws Throwable {
    org.luaj.vm2.LuaTable spill95_0;
    java.lang.String spill95_1;
    com.moon.pM spill95_2;
    org.luaj.vm2.LuaTable spill95_3;
    java.lang.String spill95_4;
    com.moon.rA spill95_5;
    org.luaj.vm2.LuaTable spill95_6;
    java.lang.String spill95_7;
    com.moon.qI spill95_8;
    org.luaj.vm2.LuaTable spill95_9;
    java.lang.String spill95_10;
    com.moon.qJ spill95_11;
    long life2_3;
    life2_3 = (__fieldRead95_0() ^ 60962741571693L);
    spill95_0 = p0;
    spill95_1 = __invokedynamic95_1(22544, (5495273111019089593L ^ life2_3));
    com.moon.pM __stackOp95_3_0 = __sourceUninitializedNEW95_2();
    spill95_2 = __stackOp95_3_0;
    __explicitNewInit95_4(__stackOp95_3_0, receiver);
    __call95_5(spill95_0, spill95_1, spill95_2);
    spill95_3 = p0;
    spill95_4 = __invokedynamic95_6(11089, (3968848283812273659L ^ life2_3));
    com.moon.rA __stackOp95_8_0 = __sourceUninitializedNEW95_7();
    spill95_5 = __stackOp95_8_0;
    __explicitNewInit95_9(__stackOp95_8_0, receiver);
    __call95_10(spill95_3, spill95_4, spill95_5);
    spill95_6 = p0;
    spill95_7 = __invokedynamic95_11(1724, (1247984412822482967L ^ life2_3));
    com.moon.qI __stackOp95_13_0 = __sourceUninitializedNEW95_12();
    spill95_8 = __stackOp95_13_0;
    __explicitNewInit95_14(__stackOp95_13_0, receiver);
    __call95_15(spill95_6, spill95_7, spill95_8);
    spill95_9 = p0;
    spill95_10 = __invokedynamic95_16(17201, (8847175068338386332L ^ life2_3));
    com.moon.qJ __stackOp95_18_0 = __sourceUninitializedNEW95_17();
    spill95_11 = __stackOp95_18_0;
    __explicitNewInit95_19(__stackOp95_18_0, receiver);
    __call95_20(spill95_9, spill95_10, spill95_11);
    return;
}
private static native long __fieldRead95_0() throws Throwable;
private static native java.lang.String __invokedynamic95_1(int a0, long a1) throws Throwable;
private static native com.moon.pM __sourceUninitializedNEW95_2() throws Throwable;
private static native void __explicitNewInit95_4(com.moon.pM a0, com.moon.jQ a1) throws Throwable;
private static native void __call95_5(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pM a2) throws Throwable;
private static native java.lang.String __invokedynamic95_6(int a0, long a1) throws Throwable;
private static native com.moon.rA __sourceUninitializedNEW95_7() throws Throwable;
private static native void __explicitNewInit95_9(com.moon.rA a0, com.moon.jQ a1) throws Throwable;
private static native void __call95_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rA a2) throws Throwable;
private static native java.lang.String __invokedynamic95_11(int a0, long a1) throws Throwable;
private static native com.moon.qI __sourceUninitializedNEW95_12() throws Throwable;
private static native void __explicitNewInit95_14(com.moon.qI a0, com.moon.jQ a1) throws Throwable;
private static native void __call95_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qI a2) throws Throwable;
private static native java.lang.String __invokedynamic95_16(int a0, long a1) throws Throwable;
private static native com.moon.qJ __sourceUninitializedNEW95_17() throws Throwable;
private static native void __explicitNewInit95_19(com.moon.qJ a0, com.moon.jQ a1) throws Throwable;
private static native void __call95_20(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qJ a2) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1914_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jQ.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2574);
    if (((com.moon.jQ.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jQ.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jQ.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jQ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jQ.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jQ.f)[life5_8] = com.moon.jQ.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jQ.f)[life5_8];
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
        byte[] spill579_0 = p0;
        life4_9 += 1;
        life5_44 = (spill579_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill579_1 = p0;
        life4_9 += 1;
        life5_76 = (spill579_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill579_2 = p0;
        life4_9 += 1;
        life5_91 = (spill579_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) { __sourceHandlerCall_f4c2fa4d0072b0e9ba15(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0f06112c9c6e2d11_originalDynamicSite1086_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1914_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic95_1(int a0, long a1) throws E;
}
