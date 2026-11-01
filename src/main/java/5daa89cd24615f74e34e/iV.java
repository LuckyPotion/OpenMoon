package com.moon;


public class iV {

private java.lang.Class<? extends com.moon.iX> a;

private java.lang.String b;

private java.lang.String c;

private java.lang.String d;

private int e;

private boolean f;

private static final long g;

private static final java.lang.String[] h;

private static final java.lang.String[] i;

private static final java.util.Map j;

iV() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-6146066346139706776L)), ((long)(4246531000160723701L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18613949877961L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.iV.g ^ 133836250429372L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill246_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill246_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill246_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill246_14 = new byte[8];

    (__sourceSpill246_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill246_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation246_16 = __sourceSpill246_14;

    ((javax.crypto.Cipher)(__sourceSpill246_11)).init(((int)(__sourceSpill246_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill246_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation246_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "UÊ÷¥¶L¨b\031®ðS5Ô!LM\177.cqÓ¡º\bjFã_|¶wµøps8^ì'Ê»¡£'¿Î\025¿¬\016Ü[§ý2g³\025\035¹l=¨#ã¿rêæÏñc3ÓºRüþ¯>¾\005æ\005rdL\027Þh¬í´@\002_\fjô­\024¼v]@\0217\030»å3Æ^\005k@8p\001½\017\t/Öb^ð[]/{\030Çó#ð©¢ÐÅLMý\\wy\005ìó\001>`z\020Y¾]h\013FK'U»¼ly\031"))).length();

    int local5_life24 = 40;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill246_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill246_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill246_29)).doFinal(((byte[])(__sourceSpill246_28)));

        java.lang.String __sourceSpill246_34 = ((java.lang.String)(com.moon.iV.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill246_35 = local9_life19;

        int __sourceSpill246_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill246_35)[__sourceSpill246_36] = __sourceSpill246_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "Æ\\$±,>¦\027Âæ¤-\r¤L8¤ùvúV\036\017*ÃxU+ \035yÝÈ\000näÜ¯^z¥\"4Ç\b|¤¨ÐZøÙHUñA"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill246_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill246_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill246_43)).doFinal(((byte[])(__sourceSpill246_42)));

        java.lang.String __sourceSpill246_48 = ((java.lang.String)(com.moon.iV.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill246_49 = local9_life19;

        int __sourceSpill246_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill246_49)[__sourceSpill246_50] = __sourceSpill246_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[6]));
}


public java.lang.String toString() {
long local1 = (com.moon.iV.g ^ 103872249622599L);
    int[] local3 = com.moon.iw.b__ArrayInt();
    java.lang.Class spill1409_0 = this.a;
    java.lang.String spill1409_1 = this.b;
    java.lang.String spill1409_2 = this.c;
    java.lang.String spill1409_3 = this.d;
    int spill1409_4 = this.e;
    boolean local4 = this.f;
    int local5 = spill1409_4;
    java.lang.String local6 = spill1409_3;
    java.lang.String local7 = spill1409_2;
    java.lang.String local8 = spill1409_1;
    java.lang.Class local9 = spill1409_0;
    java.lang.String spill1409_5 = __sourceIntrinsic_a86c261fcdee_invokedynamic1409_14(__sourceIntrinsic_a86c261fcdee_invokedynamic1409_8(23530, (8127931010917053883L ^ local1)), local9, __sourceIntrinsic_a86c261fcdee_invokedynamic1409_9(2731, (2926921974054970617L ^ local1)), local8, __sourceIntrinsic_a86c261fcdee_invokedynamic1409_10(16873, (7897417811432386493L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_invokedynamic1409_11(15361, (2602988084926468692L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_invokedynamic1409_12(32482, (3406737922990805169L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_invokedynamic1409_13(27491, (8738629465975293235L ^ local1)), local4, ")");
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.iw.b(((int[])(new int[3])));
    }
    return spill1409_5;
}


public com.moon.iV b(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
    return this;
}


public com.moon.iV c(java.lang.String p0) {
this.d = ((java.lang.String)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19631);
    if (((com.moon.iV.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iV.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iV.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iV", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iV.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iV.i)[life5_8] = com.moon.iV.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iV.i)[life5_8];
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
        byte[] spill611_0 = p0;
        life4_9 += 1;
        life5_44 = (spill611_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill611_1 = p0;
        life4_9 += 1;
        life5_76 = (spill611_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill611_2 = p0;
        life4_9 += 1;
        life5_91 = (spill611_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1642_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.iV a(java.lang.Class<? extends com.moon.iX> p0) {
this.a = ((java.lang.Class)(p0));
    return this;
}


public com.moon.iV a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public com.moon.iV a(int p0) {
this.e = ((int)(p0));
    return this;
}


public com.moon.iV a(boolean p0) {
this.f = ((boolean)(p0));
    return this;
}


public com.moon.iU a() {
return new com.moon.iU(this.a, this.b, this.c, this.d, this.e, this.f);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1642_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1409_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1409_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1409_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1409_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1409_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1409_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic1409_14(java.lang.String a0, java.lang.Class a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7, java.lang.String a8, int a9, java.lang.String a10, boolean a11, java.lang.String a12) throws E;
}
