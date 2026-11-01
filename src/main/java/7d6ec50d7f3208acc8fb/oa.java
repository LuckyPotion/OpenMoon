package com.moon;


public class oa {

private long a;

private com.moon.oc b;

private com.moon.oc c;

private com.moon.ob d;

private com.moon.ob e;

private boolean f;

private int g;

private static final long h;

private static final java.lang.String[] i;

private static final java.lang.String[] j;

private static final java.util.Map k;

oa() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-1656475732823382391L)), ((long)(7277951481178893052L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(180381660062682L)))));

    k = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.oa.h ^ 34743738222281L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill435_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill435_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill435_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill435_14 = new byte[8];

    (__sourceSpill435_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill435_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation435_16 = __sourceSpill435_14;

    ((javax.crypto.Cipher)(__sourceSpill435_11)).init(((int)(__sourceSpill435_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill435_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation435_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[7];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "B±t¬\035\r7²ãSQM\022¥h\020&öy­\001\004áÊµÑà ÿO¥B`Ðø\fw7\035`Ka®×i£\fe\"¦\031)gVÍß mq;øJD©Õå+:iòãç®\022\033\020ÐÏ­\022--\004_mWq\030«:+6HHg @4o«_Ï\000wA\020¶EY(ÞFzó°ñz©ÌÇÌ=\013è×>lÓ½J@¹8\035Z18ZN\t"))).length();

    int local5_life24 = 32;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill435_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill435_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill435_29)).doFinal(((byte[])(__sourceSpill435_28)));

        java.lang.String __sourceSpill435_34 = ((java.lang.String)(com.moon.oa.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill435_35 = local9_life19;

        int __sourceSpill435_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill435_35)[__sourceSpill435_36] = __sourceSpill435_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "B®,hC}Ï\0241ÈÍ´K 9|âbfÓ;y¯ù\005Uþ\013XÃWéOúiØìÐÒ\022îã[ÂXÍ¿¥ÍÛ1.L|®äþFø\000ß\026ï\006\024zu\036Iò¿\003\016½÷ç\177ç|\036åhº{\rÙÓúWW\0016è\177\020Mm\031\ryGg4¿\025"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill435_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill435_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill435_43)).doFinal(((byte[])(__sourceSpill435_42)));

        java.lang.String __sourceSpill435_48 = ((java.lang.String)(com.moon.oa.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill435_49 = local9_life19;

        int __sourceSpill435_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill435_49)[__sourceSpill435_50] = __sourceSpill435_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    i = ((java.lang.String[])(local9_life19));

    j = ((java.lang.String[])(new java.lang.String[7]));
}


public java.lang.String toString() {
long local1 = (com.moon.oa.h ^ 23891312862635L);
    long __sourceSpill926_8 = this.a;
    com.moon.oc __sourceSpill926_9 = this.b;
    com.moon.oc __sourceSpill926_10 = this.c;
    com.moon.ob __sourceSpill926_11 = this.d;
    com.moon.ob __sourceSpill926_12 = this.e;
    boolean __sourceSpill926_13 = this.f;
    int local3 = this.g;
    boolean local4 = __sourceSpill926_13;
    com.moon.ob local5 = __sourceSpill926_12;
    com.moon.ob local6 = __sourceSpill926_11;
    com.moon.oc local7 = __sourceSpill926_10;
    com.moon.oc local8 = __sourceSpill926_9;
    long local9 = __sourceSpill926_8;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_21(__sourceIntrinsic_a86c261fcdee_originalDynamicSite926_14(10382, (8954225655298672146L ^ local1)), local9, __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_15(25247, (7013802371293252612L ^ local1)), local8, __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_16(29470, (812418203214028167L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_17(18861, (7788636110156113714L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_18(18579, (8374940146312553995L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_19(6696, (4997974253716239538L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_20(16751, (2383977397610688497L ^ local1)), local3, ")");
}


public com.moon.oa b(com.moon.ob p0) {
this.e = ((com.moon.ob)(p0));
    return this;
}


public com.moon.oa b(com.moon.oc p0) {
this.c = ((com.moon.oc)(p0));
    return this;
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
        byte[] spill1453_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1453_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1453_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1453_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1453_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1453_2)[life4_9];
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
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3071_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/oa"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.oa.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 755);
    if (((com.moon.oa.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.oa.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.oa.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/oa", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.oa.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.oa.j)[life5_8] = com.moon.oa.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.oa.j)[life5_8];
}


public com.moon.oa a(long p0) {
this.a = ((long)(p0));
    return this;
}


public com.moon.oa a(com.moon.oc p0) {
this.b = ((com.moon.oc)(p0));
    return this;
}


public com.moon.oa a(com.moon.ob p0) {
this.d = ((com.moon.ob)(p0));
    return this;
}


public com.moon.oa a(boolean p0) {
this.f = ((boolean)(p0));
    return this;
}


public com.moon.oa a(int p0) {
this.g = ((int)(p0));
    return this;
}


public com.moon.n_ a() {
long life1_3;
    int life3_5;
    life1_3 = (com.moon.oa.h ^ 97323313341766L);
    life3_5 = com.moon.n_.c();
    com.moon.n_ spill87_0 = new com.moon.n_(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        life3_5 += 1;
        com.moon.n_.b(((int)(life3_5)));
    }
    return spill87_0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3071_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite926_21(java.lang.String a0, long a1, java.lang.String a2, com.moon.oc a3, java.lang.String a4, com.moon.oc a5, java.lang.String a6, com.moon.ob a7, java.lang.String a8, com.moon.ob a9, java.lang.String a10, boolean a11, java.lang.String a12, int a13, java.lang.String a14) throws E;
}
