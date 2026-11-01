package com.moon;


public class jR extends com.moon.jN {

private com.moon.j0 c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public jR() { super((java.lang.String)null); }

private static void __sourceConstructorBody_aa81f78d92062b12(com.moon.jR receiver) throws Throwable {
long local1 = (com.moon.jR.d ^ 57900534522330L);
    com.moon.jR.__sourceConstructorInit_aa81f78d92062b12_0(((com.moon.jR)(receiver)), ((java.lang.String)(__sourceIntrinsic_aa81f78d92062b12_originalDynamicSite1088_1(19668, (3906508971631018270L ^ local1)))));
    ((com.moon.jR)(receiver)).c = ((com.moon.j0)(new com.moon.j0()));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(8845135676720014497L)), ((long)(-8288520578717785804L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225515487193111L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jR.d ^ 121143344736090L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill188_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill188_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill188_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill188_14 = new byte[8];
    (__sourceSpill188_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill188_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation188_16 = __sourceSpill188_14;
    ((javax.crypto.Cipher)(__sourceSpill188_11)).init(((int)(__sourceSpill188_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill188_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation188_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[8];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\024E¥')ÚÁÔÁ°í@\n\020448Î«Õ¡!Ùþ$øJ ÅØpä\tÙI`lçÂ\000x³ªkÑSÃ³ªsçb4´J\030(ª\003ß\020\034u;\n3\017\036MÕ®ú\013E\b«×Ù¸/WF9¤ÿÉß\003\000Ë; ~¡ÚJ'ÓW\003\007ïMÛ\024ÖI¦ì¨%ÔÍdBy² (Ø~Î¯ 6Y1«È~£òÛÿ2Í»RK\033]\bA7\007\025B\b¶'Ê\006"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill188_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill188_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill188_29)).doFinal(((byte[])(__sourceSpill188_28)));
        java.lang.String __sourceSpill188_34 = ((java.lang.String)(com.moon.jR.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill188_35 = local9_life19;
        int __sourceSpill188_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill188_35)[__sourceSpill188_36] = __sourceSpill188_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "¯ú×nµ1\016U\033æ¤¤*\tïø5È9wÆY8\023õd&º¡ ã\0256éNr[\007\034ZU\002\016Ò\005@HÆ~¦½=<Ræw0"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill188_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill188_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill188_42)).doFinal(((byte[])(__sourceSpill188_41)));
        java.lang.String __sourceSpill188_47 = ((java.lang.String)(com.moon.jR.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill188_48 = local9_life19;
        int __sourceSpill188_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill188_48)[__sourceSpill188_49] = __sourceSpill188_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_aa81f78d92062b12_0(com.moon.jR a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_1d0ef6ef3292f1a91fc9(com.moon.jR a0, org.luaj.vm2.LuaTable a1) throws E;
private static final class __SourceHandler_1d0ef6ef3292f1a91fc9 {

public static void f96(com.moon.jR receiver, org.luaj.vm2.LuaTable p0) throws Throwable {
    org.luaj.vm2.LuaTable spill96_0;
    java.lang.String spill96_1;
    com.moon.q8 spill96_2;
    org.luaj.vm2.LuaTable spill96_3;
    java.lang.String spill96_4;
    com.moon.q9 spill96_5;
    org.luaj.vm2.LuaTable spill96_6;
    java.lang.String spill96_7;
    com.moon.q_ spill96_8;
    org.luaj.vm2.LuaTable spill96_9;
    java.lang.String spill96_10;
    com.moon.ra spill96_11;
    org.luaj.vm2.LuaTable spill96_12;
    java.lang.String spill96_13;
    com.moon.rb spill96_14;
    org.luaj.vm2.LuaTable spill96_15;
    java.lang.String spill96_16;
    com.moon.rc spill96_17;
    org.luaj.vm2.LuaTable spill96_18;
    java.lang.String spill96_19;
    com.moon.rd spill96_20;
    long life2_3;
    life2_3 = (__fieldRead96_0() ^ 17209888550458L);
    spill96_0 = p0;
    spill96_1 = __invokedynamic96_1(14419, (8111407407102573181L ^ life2_3));
    com.moon.q8 __stackOp96_3_0 = __sourceUninitializedNEW96_2();
    spill96_2 = __stackOp96_3_0;
    __explicitNewInit96_4(__stackOp96_3_0, receiver);
    __call96_5(spill96_0, spill96_1, spill96_2);
    spill96_3 = p0;
    spill96_4 = __invokedynamic96_6(23338, (513221794059180291L ^ life2_3));
    com.moon.q9 __stackOp96_8_0 = __sourceUninitializedNEW96_7();
    spill96_5 = __stackOp96_8_0;
    __explicitNewInit96_9(__stackOp96_8_0, receiver);
    __call96_10(spill96_3, spill96_4, spill96_5);
    spill96_6 = p0;
    spill96_7 = __invokedynamic96_11(5635, (19226707337417771L ^ life2_3));
    com.moon.q_ __stackOp96_13_0 = __sourceUninitializedNEW96_12();
    spill96_8 = __stackOp96_13_0;
    __explicitNewInit96_14(__stackOp96_13_0, receiver);
    __call96_15(spill96_6, spill96_7, spill96_8);
    spill96_9 = p0;
    spill96_10 = __invokedynamic96_16(30217, (7321226934735270949L ^ life2_3));
    com.moon.ra __stackOp96_18_0 = __sourceUninitializedNEW96_17();
    spill96_11 = __stackOp96_18_0;
    __explicitNewInit96_19(__stackOp96_18_0, receiver);
    __call96_20(spill96_9, spill96_10, spill96_11);
    spill96_12 = p0;
    spill96_13 = __invokedynamic96_21(21309, (6468961796244853008L ^ life2_3));
    com.moon.rb __stackOp96_23_0 = __sourceUninitializedNEW96_22();
    spill96_14 = __stackOp96_23_0;
    __explicitNewInit96_24(__stackOp96_23_0, receiver);
    __call96_25(spill96_12, spill96_13, spill96_14);
    spill96_15 = p0;
    spill96_16 = __invokedynamic96_26(9847, (9029268094304330844L ^ life2_3));
    com.moon.rc __stackOp96_28_0 = __sourceUninitializedNEW96_27();
    spill96_17 = __stackOp96_28_0;
    __explicitNewInit96_29(__stackOp96_28_0, receiver);
    __call96_30(spill96_15, spill96_16, spill96_17);
    spill96_18 = p0;
    spill96_19 = __invokedynamic96_31(6892, (6193583783737596099L ^ life2_3));
    com.moon.rd __stackOp96_33_0 = __sourceUninitializedNEW96_32();
    spill96_20 = __stackOp96_33_0;
    __explicitNewInit96_34(__stackOp96_33_0, receiver);
    __call96_35(spill96_18, spill96_19, spill96_20);
    return;
}
private static native long __fieldRead96_0() throws Throwable;
private static native java.lang.String __invokedynamic96_1(int a0, long a1) throws Throwable;
private static native com.moon.q8 __sourceUninitializedNEW96_2() throws Throwable;
private static native void __explicitNewInit96_4(com.moon.q8 a0, com.moon.jR a1) throws Throwable;
private static native void __call96_5(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q8 a2) throws Throwable;
private static native java.lang.String __invokedynamic96_6(int a0, long a1) throws Throwable;
private static native com.moon.q9 __sourceUninitializedNEW96_7() throws Throwable;
private static native void __explicitNewInit96_9(com.moon.q9 a0, com.moon.jR a1) throws Throwable;
private static native void __call96_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q9 a2) throws Throwable;
private static native java.lang.String __invokedynamic96_11(int a0, long a1) throws Throwable;
private static native com.moon.q_ __sourceUninitializedNEW96_12() throws Throwable;
private static native void __explicitNewInit96_14(com.moon.q_ a0, com.moon.jR a1) throws Throwable;
private static native void __call96_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q_ a2) throws Throwable;
private static native java.lang.String __invokedynamic96_16(int a0, long a1) throws Throwable;
private static native com.moon.ra __sourceUninitializedNEW96_17() throws Throwable;
private static native void __explicitNewInit96_19(com.moon.ra a0, com.moon.jR a1) throws Throwable;
private static native void __call96_20(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.ra a2) throws Throwable;
private static native java.lang.String __invokedynamic96_21(int a0, long a1) throws Throwable;
private static native com.moon.rb __sourceUninitializedNEW96_22() throws Throwable;
private static native void __explicitNewInit96_24(com.moon.rb a0, com.moon.jR a1) throws Throwable;
private static native void __call96_25(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rb a2) throws Throwable;
private static native java.lang.String __invokedynamic96_26(int a0, long a1) throws Throwable;
private static native com.moon.rc __sourceUninitializedNEW96_27() throws Throwable;
private static native void __explicitNewInit96_29(com.moon.rc a0, com.moon.jR a1) throws Throwable;
private static native void __call96_30(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rc a2) throws Throwable;
private static native java.lang.String __invokedynamic96_31(int a0, long a1) throws Throwable;
private static native com.moon.rd __sourceUninitializedNEW96_32() throws Throwable;
private static native void __explicitNewInit96_34(com.moon.rd a0, com.moon.jR a1) throws Throwable;
private static native void __call96_35(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.rd a2) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1917_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jR.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16008);
    if (((com.moon.jR.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jR.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jR.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jR", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jR.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jR.f)[life5_8] = com.moon.jR.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jR.f)[life5_8];
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
        byte[] spill580_0 = p0;
        life4_9 += 1;
        life5_44 = (spill580_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill580_1 = p0;
        life4_9 += 1;
        life5_76 = (spill580_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill580_2 = p0;
        life4_9 += 1;
        life5_91 = (spill580_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) { __sourceHandlerCall_1d0ef6ef3292f1a91fc9(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aa81f78d92062b12_originalDynamicSite1088_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1917_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic96_1(int a0, long a1) throws E;
}
