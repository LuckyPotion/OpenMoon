package com.moon;


public class jS extends com.moon.jN {

private com.moon.j1 c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public jS() { super((java.lang.String)null); }

private static void __sourceConstructorBody_197c71b37711b878(com.moon.jS receiver) throws Throwable {
long local1 = (com.moon.jS.d ^ 42187301220000L);
    com.moon.jS.__sourceConstructorInit_197c71b37711b878_0(((com.moon.jS)(receiver)), ((java.lang.String)(__sourceIntrinsic_197c71b37711b878_originalDynamicSite1090_1(31911, (4352082808712314909L ^ local1)))));
    ((com.moon.jS)(receiver)).c = ((com.moon.j1)(new com.moon.j1()));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-5504890756795127496L)), ((long)(-8782582949375639663L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(258714417090918L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jS.d ^ 32469302270361L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill189_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill189_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill189_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill189_14 = new byte[8];
    (__sourceSpill189_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill189_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation189_16 = __sourceSpill189_14;
    ((javax.crypto.Cipher)(__sourceSpill189_11)).init(((int)(__sourceSpill189_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill189_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation189_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[14];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "$¾£½ðW$Ë;k\f¿)Q\025H1U:Þ_iöäÑVI0´0° õ \017F\n®>ú)¨\020Ä¥¶\025e,ð¢#\017~Ì\024=ö(E\004uÇv\\I8\027¥é\017[Ëç?Wÿ\"l èA|Q° r Üë°\020?\020jAErZ_!¯TPÞKe\\*(\rÁg)%\000oACGiá\r!yéAìï°èc#zS\003ôÛ\b\017gGJ¾(w\027u\tÀ2õ\004\035Ì.rì]\035ÚbMvH­\020WÓ}\"í -ÖW2ÌmÈ(\tÕë ïÅ\021§n\005ÚIR¼ä\030_ô¿/Mlè¨ï¸½õì^Ó(û\005éÑË¤9r]ä°Bõó(©v;_&ømJ]UÕ^9|¡·&Õ â\002âª@-y\002÷x*\020\0312Ý\025ÕëÂÚ|p4cRâäL\020îØs\0011rÅ%Í6d\006:\013(ö¬É¡êûæ~7\022y}È$¢\021ÕÅ¤VPkZw\002Ü>*k;0!«ãdoGi1nR\022ÕôþZAg¶Ê3ÄÜÜ\022¶¾ZÑd\026Bp¨Z±ØÝ\034¥\007?\000\005äU!\003¾"))).length();
    int local5_life24 = 48;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill189_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill189_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill189_29)).doFinal(((byte[])(__sourceSpill189_28)));
        java.lang.String __sourceSpill189_34 = ((java.lang.String)(com.moon.jS.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill189_35 = local9_life19;
        int __sourceSpill189_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill189_35)[__sourceSpill189_36] = __sourceSpill189_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "¶F¼çÑ_èú{¥¨ðãÄÑ9:úQ ä´Eí\002\030Þé\034Q\006«éMÎïÔË_[\027ØÂÎ§Îé"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill189_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill189_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill189_42)).doFinal(((byte[])(__sourceSpill189_41)));
        java.lang.String __sourceSpill189_47 = ((java.lang.String)(com.moon.jS.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill189_48 = local9_life19;
        int __sourceSpill189_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill189_48)[__sourceSpill189_49] = __sourceSpill189_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[14]));
}

private static native <E extends Throwable> void __sourceConstructorInit_197c71b37711b878_0(com.moon.jS a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_2ad90673dff159d21a8d(com.moon.jS a0, org.luaj.vm2.LuaTable a1) throws E;
private static final class __SourceHandler_2ad90673dff159d21a8d {

public static void f97(com.moon.jS receiver, org.luaj.vm2.LuaTable p0) throws Throwable {
    org.luaj.vm2.LuaTable spill97_0;
    java.lang.String spill97_1;
    com.moon.qO spill97_2;
    org.luaj.vm2.LuaTable spill97_3;
    java.lang.String spill97_4;
    com.moon.pN spill97_5;
    org.luaj.vm2.LuaTable spill97_6;
    java.lang.String spill97_7;
    com.moon.qP spill97_8;
    org.luaj.vm2.LuaTable spill97_9;
    java.lang.String spill97_10;
    com.moon.re spill97_11;
    org.luaj.vm2.LuaTable spill97_12;
    java.lang.String spill97_13;
    com.moon.qQ spill97_14;
    org.luaj.vm2.LuaTable spill97_15;
    java.lang.String spill97_16;
    com.moon.pO spill97_17;
    org.luaj.vm2.LuaTable spill97_18;
    java.lang.String spill97_19;
    com.moon.pP spill97_20;
    org.luaj.vm2.LuaTable spill97_21;
    java.lang.String spill97_22;
    com.moon.pQ spill97_23;
    org.luaj.vm2.LuaTable spill97_24;
    java.lang.String spill97_25;
    com.moon.pR spill97_26;
    org.luaj.vm2.LuaTable spill97_27;
    java.lang.String spill97_28;
    com.moon.rB spill97_29;
    org.luaj.vm2.LuaTable spill97_30;
    java.lang.String spill97_31;
    com.moon.rC spill97_32;
    org.luaj.vm2.LuaTable spill97_33;
    java.lang.String spill97_34;
    com.moon.rD spill97_35;
    org.luaj.vm2.LuaTable spill97_36;
    java.lang.String spill97_37;
    com.moon.rE spill97_38;
    long life2_3;
    life2_3 = (__fieldRead97_0() ^ 89963001982890L);
    spill97_0 = p0;
    spill97_1 = __invokedynamic97_1(25766, (2007371186220177687L ^ life2_3));
    com.moon.qO __stackOp97_3_0 = __sourceUninitializedNEW97_2();
    spill97_2 = __stackOp97_3_0;
    __explicitNewInit97_4(__stackOp97_3_0, receiver);
    __call97_5(spill97_0, spill97_1, spill97_2);
    spill97_3 = p0;
    spill97_4 = __invokedynamic97_6(7566, (3269153188440399925L ^ life2_3));
    com.moon.pN __stackOp97_8_0 = __sourceUninitializedNEW97_7();
    spill97_5 = __stackOp97_8_0;
    __explicitNewInit97_9(__stackOp97_8_0, receiver);
    __call97_10(spill97_3, spill97_4, spill97_5);
    spill97_6 = p0;
    spill97_7 = __invokedynamic97_11(16329, (7511894458214826608L ^ life2_3));
    com.moon.qP __stackOp97_13_0 = __sourceUninitializedNEW97_12();
    spill97_8 = __stackOp97_13_0;
    __explicitNewInit97_14(__stackOp97_13_0, receiver);
    __call97_15(spill97_6, spill97_7, spill97_8);
    spill97_9 = p0;
    spill97_10 = __invokedynamic97_16(15711, (3775342455956029675L ^ life2_3));
    com.moon.re __stackOp97_18_0 = __sourceUninitializedNEW97_17();
    spill97_11 = __stackOp97_18_0;
    __explicitNewInit97_19(__stackOp97_18_0, receiver);
    __call97_20(spill97_9, spill97_10, spill97_11);
    spill97_12 = p0;
    spill97_13 = __invokedynamic97_21(10275, (8158580953134618013L ^ life2_3));
    com.moon.qQ __stackOp97_23_0 = __sourceUninitializedNEW97_22();
    spill97_14 = __stackOp97_23_0;
    __explicitNewInit97_24(__stackOp97_23_0, receiver);
    __call97_25(spill97_12, spill97_13, spill97_14);
    spill97_15 = p0;
    spill97_16 = __invokedynamic97_26(1488, (6077075436615792741L ^ life2_3));
    com.moon.pO __stackOp97_28_0 = __sourceUninitializedNEW97_27();
    spill97_17 = __stackOp97_28_0;
    __explicitNewInit97_29(__stackOp97_28_0, receiver);
    __call97_30(spill97_15, spill97_16, spill97_17);
    spill97_18 = p0;
    spill97_19 = __invokedynamic97_31(6258, (6752033875247982026L ^ life2_3));
    com.moon.pP __stackOp97_33_0 = __sourceUninitializedNEW97_32();
    spill97_20 = __stackOp97_33_0;
    __explicitNewInit97_34(__stackOp97_33_0, receiver);
    __call97_35(spill97_18, spill97_19, spill97_20);
    spill97_21 = p0;
    spill97_22 = __invokedynamic97_36(24615, (1883606089712770458L ^ life2_3));
    com.moon.pQ __stackOp97_38_0 = __sourceUninitializedNEW97_37();
    spill97_23 = __stackOp97_38_0;
    __explicitNewInit97_39(__stackOp97_38_0, receiver);
    __call97_40(spill97_21, spill97_22, spill97_23);
    spill97_24 = p0;
    spill97_25 = __invokedynamic97_41(10927, (8056791062339016467L ^ life2_3));
    com.moon.pR __stackOp97_43_0 = __sourceUninitializedNEW97_42();
    spill97_26 = __stackOp97_43_0;
    __explicitNewInit97_44(__stackOp97_43_0, receiver);
    __call97_45(spill97_24, spill97_25, spill97_26);
    spill97_27 = p0;
    spill97_28 = __invokedynamic97_46(24627, (5578974972179357068L ^ life2_3));
    com.moon.rB __stackOp97_48_0 = __sourceUninitializedNEW97_47();
    spill97_29 = __stackOp97_48_0;
    __explicitNewInit97_49(__stackOp97_48_0, receiver);
    __call97_50(spill97_27, spill97_28, spill97_29);
    spill97_30 = p0;
    spill97_31 = __invokedynamic97_51(25659, (3758251966506244481L ^ life2_3));
    com.moon.rC __stackOp97_53_0 = __sourceUninitializedNEW97_52();
    spill97_32 = __stackOp97_53_0;
    __explicitNewInit97_54(__stackOp97_53_0, receiver);
    __call97_55(spill97_30, spill97_31, spill97_32);
    spill97_33 = p0;
    spill97_34 = __invokedynamic97_56(31698, (8486928222748706401L ^ life2_3));
    com.moon.rD __stackOp97_58_0 = __sourceUninitializedNEW97_57();
    spill97_35 = __stackOp97_58_0;
    __explicitNewInit97_59(__stackOp97_58_0, receiver);
    __call97_60(spill97_33, spill97_34, spill97_35);
    spill97_36 = p0;
    spill97_37 = __invokedynamic97_61(12296, (6281898216069778874L ^ life2_3));
    com.moon.rE __stackOp97_63_0 = __sourceUninitializedNEW97_62();
    spill97_38 = __stackOp97_63_0;
    __explicitNewInit97_64(__stackOp97_63_0, receiver);
    __call97_65(spill97_36, spill97_37, spill97_38);
    return;
}
private static native long __fieldRead97_0() throws Throwable;
private static native java.lang.String __invokedynamic97_1(int a0, long a1) throws Throwable;
private static native com.moon.qO __sourceUninitializedNEW97_2() throws Throwable;
private static native void __explicitNewInit97_4(com.moon.qO a0, com.moon.jS a1) throws Throwable;
private static native void __call97_5(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qO a2) throws Throwable;
private static native java.lang.String __invokedynamic97_6(int a0, long a1) throws Throwable;
private static native com.moon.pN __sourceUninitializedNEW97_7() throws Throwable;
private static native void __explicitNewInit97_9(com.moon.pN a0, com.moon.jS a1) throws Throwable;
private static native void __call97_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pN a2) throws Throwable;
private static native java.lang.String __invokedynamic97_11(int a0, long a1) throws Throwable;
private static native com.moon.qP __sourceUninitializedNEW97_12() throws Throwable;
private static native void __explicitNewInit97_14(com.moon.qP a0, com.moon.jS a1) throws Throwable;
private static native void __call97_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qP a2) throws Throwable;
private static native java.lang.String __invokedynamic97_16(int a0, long a1) throws Throwable;
private static native com.moon.re __sourceUninitializedNEW97_17() throws Throwable;
private static native void __explicitNewInit97_19(com.moon.re a0, com.moon.jS a1) throws Throwable;
private static native void __call97_20(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.re a2) throws Throwable;
private static native java.lang.String __invokedynamic97_21(int a0, long a1) throws Throwable;
private static native com.moon.qQ __sourceUninitializedNEW97_22() throws Throwable;
private static native void __explicitNewInit97_24(com.moon.qQ a0, com.moon.jS a1) throws Throwable;
private static native void __call97_25(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qQ a2) throws Throwable;
private static native java.lang.String __invokedynamic97_26(int a0, long a1) throws Throwable;
private static native com.moon.pO __sourceUninitializedNEW97_27() throws Throwable;
private static native void __explicitNewInit97_29(com.moon.pO a0, com.moon.jS a1) throws Throwable;
private static native void __call97_30(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pO a2) throws Throwable;
private static native java.lang.String __invokedynamic97_31(int a0, long a1) throws Throwable;
private static native com.moon.pP __sourceUninitializedNEW97_32() throws Throwable;
private static native void __explicitNewInit97_34(com.moon.pP a0, com.moon.jS a1) throws Throwable;
private static native void __call97_35(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pP a2) throws Throwable;
private static native java.lang.String __invokedynamic97_36(int a0, long a1) throws Throwable;
private static native com.moon.pQ __sourceUninitializedNEW97_37() throws Throwable;
private static native void __explicitNewInit97_39(com.moon.pQ a0, com.moon.jS a1) throws Throwable;
private static native void __call97_40(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pQ a2) throws Throwable;
private static native java.lang.String __invokedynamic97_41(int a0, long a1) throws Throwable;
private static native com.moon.pR __sourceUninitializedNEW97_42() throws Throwable;
private static native void __explicitNewInit97_44(com.moon.pR a0, com.moon.jS a1) throws Throwable;
private static native void __call97_45(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.pR a2) throws Throwable;
private static native java.lang.String __invokedynamic97_46(int a0, long a1) throws Throwable;
private static native com.moon.rB __sourceUninitializedNEW97_47() throws Throwable;
private static native void __explicitNewInit97_49(com.moon.rB a0, com.moon.jS a1) throws Throwable;
private static native void __call97_50(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rB a2) throws Throwable;
private static native java.lang.String __invokedynamic97_51(int a0, long a1) throws Throwable;
private static native com.moon.rC __sourceUninitializedNEW97_52() throws Throwable;
private static native void __explicitNewInit97_54(com.moon.rC a0, com.moon.jS a1) throws Throwable;
private static native void __call97_55(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rC a2) throws Throwable;
private static native java.lang.String __invokedynamic97_56(int a0, long a1) throws Throwable;
private static native com.moon.rD __sourceUninitializedNEW97_57() throws Throwable;
private static native void __explicitNewInit97_59(com.moon.rD a0, com.moon.jS a1) throws Throwable;
private static native void __call97_60(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rD a2) throws Throwable;
private static native java.lang.String __invokedynamic97_61(int a0, long a1) throws Throwable;
private static native com.moon.rE __sourceUninitializedNEW97_62() throws Throwable;
private static native void __explicitNewInit97_64(com.moon.rE a0, com.moon.jS a1) throws Throwable;
private static native void __call97_65(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rE a2) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1920_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jS.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16671);
    if (((com.moon.jS.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jS.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jS.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jS", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jS.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jS.f)[life5_8] = com.moon.jS.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jS.f)[life5_8];
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
        byte[] spill581_0 = p0;
        life4_9 += 1;
        life5_44 = (spill581_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill581_1 = p0;
        life4_9 += 1;
        life5_76 = (spill581_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill581_2 = p0;
        life4_9 += 1;
        life5_91 = (spill581_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) { __sourceHandlerCall_2ad90673dff159d21a8d(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_197c71b37711b878_originalDynamicSite1090_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1920_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic97_1(int a0, long a1) throws E;
}
