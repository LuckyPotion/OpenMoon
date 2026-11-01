package com.moon;


public class hB {

private java.lang.String a;

private java.lang.String b;

private com.moon.b8 c;

private long d;

private com.moon.module.impl.ClickGUI e;

private float f;

private float g;

private float h;

private float i;

private float j;

private long k;

private boolean l;

private boolean m;

private static final long n;

private static final java.lang.String[] o;

private static final java.lang.String[] p;

private static final java.util.Map q;

hB() {
super();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(3398770171564084721L)), ((long)(8043763573998810833L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81988469563741L)))));

    q = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.hB.n ^ 78905799290479L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill190_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill190_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill190_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill190_14 = new byte[8];

    (__sourceSpill190_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill190_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation190_16 = __sourceSpill190_14;

    ((javax.crypto.Cipher)(__sourceSpill190_11)).init(((int)(__sourceSpill190_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill190_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation190_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[13];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "««âÉP¥2ÿ¦Æ9o\020­9ÈÕS1 >ç_\177ï.ìÇXÎ×¨V´\036 39\005´¾¤úû_\002\002\006Tè¨\007U»lÒF¹\n?}äÿ÷ RÕ´+q¬vwòm!ý85TCêø.@öZ\025\021õË¹{ø PÛ¨±­ÛRþz5KL\036Ñ[x*9=éÔ\177\004Ã(À~m5M\003£8\023T\036\013\"\021ã®Z\t\033éÛÕÖ\n\036UÙæö?\026«R¹@\022ÿ5¯³ibÿ®\036\034ØUgÞÜsù¦_)±Zª+zþ ?9½\034¡T©J}Y\033jÔê\005Z¤ï/À³x\006Ü\020ú\"UVèX¨\005biÑ»» vIpU\033ªJ m-Ç¦¶\nî(M¯;;\006M½ïÞ\020BÉlQX\016þÊÝZF\030\023ï©Ö\000`´²9ä?i¤cTÉ¼$Dì4øg \017ó\006:f¨Dv<OÐ¯ÓÉ?Uª÷\005|è\002V)Ç"))).length();

    int local5_life24 = 40;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill190_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill190_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill190_29)).doFinal(((byte[])(__sourceSpill190_28)));

        java.lang.String __sourceSpill190_34 = ((java.lang.String)(com.moon.hB.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill190_35 = local9_life19;

        int __sourceSpill190_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill190_35)[__sourceSpill190_36] = __sourceSpill190_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "\035ª¯[9¼\002\027,D3ÄÜ°G\037 }cïeÊÏËÇ Ñl\020H{w\023\023Áóç©\032é¶Ê$¸"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill190_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill190_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill190_43)).doFinal(((byte[])(__sourceSpill190_42)));

        java.lang.String __sourceSpill190_48 = ((java.lang.String)(com.moon.hB.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill190_49 = local9_life19;

        int __sourceSpill190_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill190_49)[__sourceSpill190_50] = __sourceSpill190_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    o = ((java.lang.String[])(local9_life19));

    p = ((java.lang.String[])(new java.lang.String[13]));
}


public java.lang.String toString() {
long local1 = (com.moon.hB.n ^ 35759113936718L);
    java.lang.String __sourceSpill423_14 = this.a;
    java.lang.String __sourceSpill423_15 = this.b;
    com.moon.b8 __sourceSpill423_16 = this.c;
    long __sourceSpill423_17 = this.d;
    com.moon.module.impl.ClickGUI __sourceSpill423_18 = this.e;
    float __sourceSpill423_19 = this.f;
    float __sourceSpill423_20 = this.g;
    float __sourceSpill423_21 = this.h;
    float __sourceSpill423_22 = this.i;
    float __sourceSpill423_23 = this.j;
    long __sourceSpill423_24 = this.k;
    boolean __sourceSpill423_25 = this.l;
    boolean local3 = this.m;
    boolean local4 = __sourceSpill423_25;
    long local5 = __sourceSpill423_24;
    float local7 = __sourceSpill423_23;
    float local8 = __sourceSpill423_22;
    float local9 = __sourceSpill423_21;
    float local10 = __sourceSpill423_20;
    float local11 = __sourceSpill423_19;
    com.moon.module.impl.ClickGUI local12 = __sourceSpill423_18;
    long local13 = __sourceSpill423_17;
    com.moon.b8 local15 = __sourceSpill423_16;
    java.lang.String local16 = __sourceSpill423_15;
    java.lang.String local17 = __sourceSpill423_14;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_39(__sourceIntrinsic_a86c261fcdee_originalDynamicSite423_26(16632, (2082804696434574344L ^ local1)), local17, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_27(17722, (4902090427250770372L ^ local1)), local16, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_28(543, (6354434003734218470L ^ local1)), local15, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_29(8680, (821600758188696862L ^ local1)), local13, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_30(26688, (1013473989822065845L ^ local1)), local12, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_31(21767, (2258999256921346554L ^ local1)), local11, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_32(14123, (1611448090706572248L ^ local1)), local10, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_33(24936, (4669513921700832671L ^ local1)), local9, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_34(11136, (8813745668368363388L ^ local1)), local8, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_35(27517, (3478334178511695753L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_36(1063, (642473449646342358L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_37(15467, (1398538814593792153L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_38(14982, (6501921329016602233L ^ local1)), local3, ")");
}


public com.moon.hB b(long p0) {
this.k = ((long)(p0));
    return this;
}


public com.moon.hB b(float p0) {
this.g = ((float)(p0));
    return this;
}


public com.moon.hB b(boolean p0) {
this.m = ((boolean)(p0));
    return this;
}


public com.moon.hB b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public com.moon.hB e(float p0) {
this.j = ((float)(p0));
    return this;
}


public com.moon.hB c(float p0) {
this.h = ((float)(p0));
    return this;
}


public com.moon.hB d(float p0) {
this.i = ((float)(p0));
    return this;
}


public com.moon.hB a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
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
        byte[] spill464_0 = p0;
        life4_9 += 1;
        life5_44 = (spill464_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill464_1 = p0;
        life4_9 += 1;
        life5_76 = (spill464_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill464_2 = p0;
        life4_9 += 1;
        life5_91 = (spill464_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.hB a(com.moon.b8 p0) {
this.c = ((com.moon.b8)(p0));
    return this;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5940);
    if (((com.moon.hB.p)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hB.q)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hB.q)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hB", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hB.o)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hB.p)[life5_8] = com.moon.hB.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hB.p)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1357_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.hB a(float p0) {
this.f = ((float)(p0));
    return this;
}


public com.moon.hB a(com.moon.module.impl.ClickGUI p0) {
this.e = ((com.moon.module.impl.ClickGUI)(p0));
    return this;
}


public com.moon.hB a(boolean p0) {
this.l = ((boolean)(p0));
    return this;
}


public com.moon.hB a(long p0) {
this.d = ((long)(p0));
    return this;
}


public com.moon.hA a() {
return new com.moon.hA(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1357_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite423_39(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, com.moon.b8 a5, java.lang.String a6, long a7, java.lang.String a8, com.moon.module.impl.ClickGUI a9, java.lang.String a10, float a11, java.lang.String a12, float a13, java.lang.String a14, float a15, java.lang.String a16, float a17, java.lang.String a18, float a19, java.lang.String a20, long a21, java.lang.String a22, boolean a23, java.lang.String a24, boolean a25, java.lang.String a26) throws E;
}
