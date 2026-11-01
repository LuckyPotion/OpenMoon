package com.moon;


public class kB extends com.moon.kd<moom.zm> {

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public kB(java.lang.Class<moom.zm> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(793618288109238493L)), ((long)(4165762365309433144L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101830310117233L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.kB.c ^ 99224508664505L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill206_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill206_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill206_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill206_14 = new byte[8];
    (__sourceSpill206_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill206_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation206_16 = __sourceSpill206_14;
    ((javax.crypto.Cipher)(__sourceSpill206_11)).init(((int)(__sourceSpill206_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill206_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation206_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[12];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "þ+Ü;\025ë¹ó8¤Á¯\003z\0353[³Ñ%I\030\016E0CJ0ô èÔÜ#\0134I»7T9\t $\030*ex\022k\001\000dHÈ¬\023·\177\017IÇ>eáñÌÝ\004ºkl\020jQ$ø7Ó¢¤Ô:ÑË\bf\001 J0º!N0\036\037\013\022¨úë\n2§õÙ5Pê¬\006¿¢ð\031 Â\" \"VÛ«?|,\177O.àß\ré£»ø?¢`\017¨9.=b\020¹Ãyk]\034á\036¢K*¿1å=) !\024À}×ä5¹Ü«\030H3­ô\030eØ¢a\035l/¤+ 0Õµ\b\004Ï{.\007\004®¤\f@\rØrÛM«C,}#½¾< =\016a©é f^1¦kV\022øß\036ÁÆq%\030\037¤Çã¼}\nû"))).length();
    int local5_life24 = 24;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill206_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill206_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill206_29)).doFinal(((byte[])(__sourceSpill206_28)));
        java.lang.String __sourceSpill206_34 = ((java.lang.String)(com.moon.kB.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill206_35 = local9_life19;
        int __sourceSpill206_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill206_35)[__sourceSpill206_36] = __sourceSpill206_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "d\"\\;7û?ú#\027-¡Öþ\031;GAìâåÃi\003Ùà@<W&\030¦{fÛAp\f1¬Ôc»#Kn'­õºßß"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill206_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill206_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill206_42)).doFinal(((byte[])(__sourceSpill206_41)));
        java.lang.String __sourceSpill206_47 = ((java.lang.String)(com.moon.kB.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill206_48 = local9_life19;
        int __sourceSpill206_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill206_48)[__sourceSpill206_49] = __sourceSpill206_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[12]));
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
        byte[] spill616_0 = p0;
        life4_9 += 1;
        life5_44 = (spill616_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill616_1 = p0;
        life4_9 += 1;
        life5_76 = (spill616_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill616_2 = p0;
        life4_9 += 1;
        life5_91 = (spill616_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18623);
    if (((com.moon.kB.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.kB.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.kB.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kB", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.kB.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.kB.e)[life5_8] = com.moon.kB.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.kB.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.kB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2012_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.zm p1) {
long local3_life2 = (com.moon.kB.c ^ 113355167712718L);
    ((moom.zm)(p1)).a(((boolean)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_4(31978, (8671861008670824507L ^ local3_life2))))))).toboolean())));
    ((moom.zm)(p1)).b(((boolean)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_9(1486, (525694548308189464L ^ local3_life2))))))).toboolean())));
    ((moom.zm)(p1)).c(((boolean)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_14(5431, (862409982368903661L ^ local3_life2))))))).toboolean())));
    ((moom.zm)(p1)).d(((boolean)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_19(27416, (3870561478579720129L ^ local3_life2))))))).toboolean())));
    ((moom.zm)(p1)).a(((float)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_24(7178, (2207915311039576286L ^ local3_life2))))))).tofloat())));
    ((moom.zm)(p1)).b(((float)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_29(16824, (4095149856675505514L ^ local3_life2))))))).tofloat())));
    return;
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.kB)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.zm)(((moom.zm)(p1)))));
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.kB)(this)).a(((moom.zm)(((moom.zm)(p0)))));
}


public org.luaj.vm2.LuaTable a(moom.zm p0) {
long local2_life2 = (com.moon.kB.c ^ 65536241422097L);
    org.luaj.vm2.LuaTable local4_life3 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_5(18621, (6033577159960372922L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((moom.zm)(p0)).e()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_10(26151, (1187679369306769451L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((moom.zm)(p0)).f()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_15(8931, (6421988660808994027L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((moom.zm)(p0)).g()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_20(5679, (5782749704492513312L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)(((moom.zm)(p0)).h()))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_25(9037, (5035894085252664647L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.zm)(p0)).a())))))));
    ((org.luaj.vm2.LuaTable)(local4_life3)).set(((java.lang.String)(__sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_30(10215, (5346275491190458851L ^ local2_life2)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.zm)(p0)).b())))))));
    return local4_life3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2012_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6c819f9e8f73_originalDynamicSite82_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_13e0f0fcb105_originalDynamicSite83_29(int a0, long a1) throws E;


}
