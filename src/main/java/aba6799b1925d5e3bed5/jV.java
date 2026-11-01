package com.moon;


public class jV extends com.moon.jN {

private com.moon.j4 c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public jV() { super((java.lang.String)null); }


private static void __sourceConstructorBody_20766ebefd2b5c63(com.moon.jV receiver) throws Throwable {

long local1 = (com.moon.jV.d ^ 17237532635214L);

    com.moon.jV.__sourceConstructorInit_20766ebefd2b5c63_0(((com.moon.jV)(receiver)), ((java.lang.String)(__sourceIntrinsic_20766ebefd2b5c63_originalDynamicSite1096_1(12856, (1890727434269549426L ^ local1)))));

    ((com.moon.jV)(receiver)).c = ((com.moon.j4)(new com.moon.j4()));

    return;

}



static {
d = ((long)(((moom._a)(moom._c.a(((long)(-5977599950472850764L)), ((long)(1589240479119240485L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221733232931063L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jV.d ^ 106537998131503L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill192_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill192_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill192_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill192_14 = new byte[8];
    (__sourceSpill192_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill192_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation192_16 = __sourceSpill192_14;
    ((javax.crypto.Cipher)(__sourceSpill192_11)).init(((int)(__sourceSpill192_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill192_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation192_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[7];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "QMy?\007VJâä\000\034AÁ×ð*X³õÄª+ÿ3\033ÿýÃ }\036Ðs[C/K%ìÇ\020ñ¥Jb­\020\033>g­|\020\"Öò -aá¢QN? 2#D>&!Ð §â|/R\037ð( ß\013l¼ñíî®à2ü\\¾+Ä?&örZ\177\020*Üs({Æ\030Õ~É\035#Y\023\037GE\036úILf7\006"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill192_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill192_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill192_29)).doFinal(((byte[])(__sourceSpill192_28)));
        java.lang.String __sourceSpill192_34 = ((java.lang.String)(com.moon.jV.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill192_35 = local9_life19;
        int __sourceSpill192_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill192_35)[__sourceSpill192_36] = __sourceSpill192_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "Ùí9Ù\022ÎyÉ<PFIÈt`çÍÌkÑª7\b¤õoó\013\017¡ñO\bD\030\005\005\017eÑ\005êx\t\037#]Ç\002aAøëÊã\025o"))).length();
    local5_life24 = 40;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill192_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill192_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill192_42)).doFinal(((byte[])(__sourceSpill192_41)));
        java.lang.String __sourceSpill192_47 = ((java.lang.String)(com.moon.jV.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill192_48 = local9_life19;
        int __sourceSpill192_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill192_48)[__sourceSpill192_49] = __sourceSpill192_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_20766ebefd2b5c63_0(com.moon.jV a0, java.lang.String a1) throws E;

private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1930_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jV.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14918);
    if (((com.moon.jV.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jV.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jV.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jV", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jV.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jV.f)[life5_8] = com.moon.jV.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jV.f)[life5_8];
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
        byte[] spill585_0 = p0;
        life4_9 += 1;
        life5_44 = (spill585_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill585_1 = p0;
        life4_9 += 1;
        life5_76 = (spill585_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill585_2 = p0;
        life4_9 += 1;
        life5_91 = (spill585_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) {
long life2_3;
    life2_3 = (com.moon.jV.d ^ 12205761275873L);
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100017_1(22607, (7455445904155696812L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.su(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100017_3(20456, (4926857314924415242L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sv(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100017_5(29340, (1670175077288998012L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sw(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100017_7(9192, (8462554865105249551L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.sx(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100017_9(24729, (6546141457562166904L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.qT(this))));
    ((org.luaj.vm2.LuaTable)(p0)).set(((java.lang.String)(__sourceIntrinsic_e842da2e92fc_invokedynamic100017_11(11279, (4810302777100020459L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(new com.moon.rp(this))));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20766ebefd2b5c63_originalDynamicSite1096_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1930_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100017_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100017_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100017_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100017_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100017_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic100017_11(int a0, long a1) throws E;
}
