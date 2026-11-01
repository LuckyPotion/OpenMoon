package com.moon;


public class kC extends com.moon.kd<moom.zn> {

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

public kC(java.lang.Class<moom.zn> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3863316788768606143L)), ((long)(-2021134502748206135L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(242238978557540L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.kC.c ^ 102026680451651L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill207_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill207_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill207_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill207_14 = new byte[8];
    (__sourceSpill207_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill207_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation207_16 = __sourceSpill207_14;
    ((javax.crypto.Cipher)(__sourceSpill207_11)).init(((int)(__sourceSpill207_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill207_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation207_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\001-\004º±\177ê\032«\006¨ÉÃÅ(Ô\020\036\fÏ3ÌUsÑ{cöFS»"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill207_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill207_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill207_29)).doFinal(((byte[])(__sourceSpill207_28)));
        java.lang.String __sourceSpill207_34 = ((java.lang.String)(com.moon.kC.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill207_35 = local9_life19;
        int __sourceSpill207_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill207_35)[__sourceSpill207_36] = __sourceSpill207_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> org.luaj.vm2.LuaTable __sourceHandlerCall_4be97d1236a929160786(com.moon.kC a0, moom.zn a1) throws E;
private static final class __SourceHandler_4be97d1236a929160786 {

public static org.luaj.vm2.LuaTable f103(com.moon.kC receiver, moom.zn p0) throws Throwable {
    int spill103_0;
    org.luaj.vm2.LuaTable spill103_1;
    long life2_3;
    org.luaj.vm2.LuaTable life5_8;
    int life4_9;
    moom.DT life6_22;
    forest_join_45: {
    forest_join_39: {
    life2_3 = (__fieldRead103_0() ^ 28406422335453L);
    spill103_0 = __call103_1();
    org.luaj.vm2.LuaTable __stackOp103_3_0 = __sourceUninitializedNEW103_2();
    spill103_1 = __stackOp103_3_0;
    __explicitNewInit103_4(__stackOp103_3_0);
    life5_8 = spill103_1;
    life4_9 = spill103_0;
    __call103_8(life5_8, __invokedynamic103_5(1781, (5610145250925349075L ^ life2_3)), __call103_7(__call103_6(p0)));
    life6_22 = __call103_9(p0);
    if (!((life4_9 != 0))) {
        break forest_join_39;
    }
    if (!((life6_22 != null))) {
        break forest_join_45;
    }
    __call103_12(life5_8, "x", __call103_11(__call103_10(life6_22)));
    __call103_15(life5_8, "y", __call103_14(__call103_13(life6_22)));
    }
    __call103_18(life5_8, "z", __call103_17(__call103_16(life6_22)));
    }
    return life5_8;
}
private static native long __fieldRead103_0() throws Throwable;
private static native int __call103_1() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW103_2() throws Throwable;
private static native void __explicitNewInit103_4(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic103_5(int a0, long a1) throws Throwable;
private static native java.lang.String __call103_6(moom.zn a0) throws Throwable;
private static native org.luaj.vm2.LuaString __call103_7(java.lang.String a0) throws Throwable;
private static native void __call103_8(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaString a2) throws Throwable;
private static native moom.DT __call103_9(moom.zn a0) throws Throwable;
private static native int __call103_10(moom.DT a0) throws Throwable;
private static native org.luaj.vm2.LuaInteger __call103_11(int a0) throws Throwable;
private static native void __call103_12(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaInteger a2) throws Throwable;
private static native int __call103_13(moom.DT a0) throws Throwable;
private static native org.luaj.vm2.LuaInteger __call103_14(int a0) throws Throwable;
private static native void __call103_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaInteger a2) throws Throwable;
private static native int __call103_16(moom.DT a0) throws Throwable;
private static native org.luaj.vm2.LuaInteger __call103_17(int a0) throws Throwable;
private static native void __call103_18(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaInteger a2) throws Throwable;

}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill619_0 = p0;
        life4_9 += 1;
        life5_44 = (spill619_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill619_1 = p0;
        life4_9 += 1;
        life5_76 = (spill619_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill619_2 = p0;
        life4_9 += 1;
        life5_91 = (spill619_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27555);
    if (((com.moon.kC.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kC.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kC.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kC", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kC.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kC.e)[life5_8] = __sourceExactCall_dbd1f65275e75b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kC.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_f726dbf91603ec(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2015_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.zn p1) {
int forwardValue618_28_0;
    int spill618_0;
    boolean spill618_1;
    long life3_3;
    int life5_16;
    int life6_34;
    int life7_39;
    int life8_44;
    forward_join_48: {
    forward_join_28: {
    life3_3 = (com.moon.kC.c ^ 116301291765065L);
    spill618_0 = __sourceExactCall_0183a4f0b8e474();
    ((moom.zn)(p1)).a(((java.lang.String)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_9f2f52ce930b_invokedynamic618_2(20792, (4529000621119245707L ^ life3_3))))))).tojstring())));
    life5_16 = spill618_0;
    spill618_1 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("x"))))).isnil();
    if (!((life5_16 != 0))) {
        forwardValue618_28_0 = ((spill618_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill618_1))) {
        break forward_join_48;
    }
    forwardValue618_28_0 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("x"))))).toint();
    }
    life6_34 = forwardValue618_28_0;
    life7_39 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("y"))))).toint();
    life8_44 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("z"))))).toint();
    ((moom.zn)(p1)).a(((moom.DT)(new moom.DT(life6_34, life7_39, life8_44))));
    }
    return;
}


public org.luaj.vm2.LuaTable a(moom.zn p0) { return __sourceHandlerCall_4be97d1236a929160786(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2015_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9f2f52ce930b_invokedynamic618_2(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_dbd1f65275e75b(byte[] p0);
private static native java.lang.String __sourceExactCall_f726dbf91603ec(int p0, long p1);
private static native int __sourceExactCall_0183a4f0b8e474();
}
