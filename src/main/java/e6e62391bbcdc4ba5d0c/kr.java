package com.moon;


public class kr extends com.moon.kd<moom.y_> {

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public kr(java.lang.Class<moom.y_> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7710326694356868848L)), ((long)(7210983528158641709L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(233272404273813L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.kr.c ^ 1071155187958L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill226_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill226_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill226_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill226_14 = new byte[8];
    (__sourceSpill226_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill226_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation226_16 = __sourceSpill226_14;
    ((javax.crypto.Cipher)(__sourceSpill226_11)).init(((int)(__sourceSpill226_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill226_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation226_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[6];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\036×!äcq:8Ù\026\031jLãYg3ÒÎ\"dºd\027ãè\020GÀEÁ\013GØ§d\017\007l¬7p\030á2[¦\025]/£ÜCºõw³[·@×ßF1\0037\020\017ôû7Ýº|µå¦¥Ù,"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill226_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill226_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill226_29)).doFinal(((byte[])(__sourceSpill226_28)));
        java.lang.String __sourceSpill226_34 = ((java.lang.String)(com.moon.kr.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill226_35 = local9_life19;
        int __sourceSpill226_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill226_35)[__sourceSpill226_36] = __sourceSpill226_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "xAþmkê!§ö(¦§Q\003s\020~8¯1\023¿C§õ)¶7\017"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill226_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill226_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill226_42)).doFinal(((byte[])(__sourceSpill226_41)));
        java.lang.String __sourceSpill226_47 = ((java.lang.String)(com.moon.kr.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill226_48 = local9_life19;
        int __sourceSpill226_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill226_48)[__sourceSpill226_49] = __sourceSpill226_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[6]));
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
        byte[] spill646_0 = p0;
        life4_9 += 1;
        life5_44 = (spill646_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill646_1 = p0;
        life4_9 += 1;
        life5_76 = (spill646_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill646_2 = p0;
        life4_9 += 1;
        life5_91 = (spill646_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27470);
    if (((com.moon.kr.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kr.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kr.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kr", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kr.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kr.e)[life5_8] = com.moon.kr.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kr.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.kr.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2084_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.y_ p1) {
long local3_life2 = (com.moon.kr.c ^ 31967004547232L);
    boolean local5_life7 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_b0dedc1f7f7e_originalDynamicSite112_4(1149, (3572611013329159296L ^ local3_life2))))))).toboolean();
    double local6_life10 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("x"))))).todouble();
    double local8_life13 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("y"))))).todouble();
    double local10_life16 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("z"))))).todouble();
    float local12_life21 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_b0dedc1f7f7e_originalDynamicSite112_18(1908, (975231653927847823L ^ local3_life2))))))).tofloat();
    float local13_life26 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_b0dedc1f7f7e_originalDynamicSite112_23(1111, (990364796974597293L ^ local3_life2))))))).tofloat();
    ((moom.y_)(p1)).a(((double)(local6_life10)));
    ((moom.y_)(p1)).b(((double)(local8_life13)));
    ((moom.y_)(p1)).c(((double)(local10_life16)));
    ((moom.y_)(p1)).a(((float)(local12_life21)));
    ((moom.y_)(p1)).b(((float)(local13_life26)));
    ((moom.y_)(p1)).a(((boolean)(local5_life7)));
    return;
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.kr)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.y_)(((moom.y_)(p1)))));
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.kr)(this)).a(((moom.y_)(((moom.y_)(p0)))));
}


public org.luaj.vm2.LuaTable a(moom.y_ p0) {
long local2_life2 = (com.moon.kr.c ^ 95116596084574L);
    org.luaj.vm2.LuaTable local4_life3 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_b97be2c21340_originalDynamicSite111_5(10182, (7550346395487568071L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((moom.y_)(p0)).a__Boolean()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("x")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.y_)(p0)).a()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("y")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.y_)(p0)).b()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)("z")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.y_)(p0)).c()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_b97be2c21340_originalDynamicSite111_19(14184, (4590786288209596522L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.y_)(p0)).a__Float())))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_b97be2c21340_originalDynamicSite111_24(13856, (1909871170966819104L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.y_)(p0)).b__Float())))))));
    return local4_life3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2084_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b97be2c21340_originalDynamicSite111_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b97be2c21340_originalDynamicSite111_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b97be2c21340_originalDynamicSite111_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0dedc1f7f7e_originalDynamicSite112_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0dedc1f7f7e_originalDynamicSite112_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b0dedc1f7f7e_originalDynamicSite112_23(int a0, long a1) throws E;


}
