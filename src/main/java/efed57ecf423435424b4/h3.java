package com.moon;


public class h3 {

private static final org.tinylog.TaggedLogger a;

private final java.lang.String b;

private final com.moon.jD c;

private final java.util.List<com.moon.hZ> d;

private final java.lang.String e;

private static final long f;

private static final java.lang.String[] g;

private static final java.lang.String[] h;

private static final java.util.Map i;

h3(java.lang.String p0, com.moon.jD p1, java.lang.String p2) {
super();
    this.d = new java.util.ArrayList();
    this.b = p0;
    this.c = p1;
    this.e = p2;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(1715523672476649876L)), ((long)(-432303822300046863L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116105244083152L)))));

    long local9_life6 = (com.moon.h3.f ^ 9604005538130L);

    i = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill184_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill184_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill184_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill184_14 = new byte[8];

    (__sourceSpill184_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill184_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation184_16 = __sourceSpill184_14;

    ((javax.crypto.Cipher)(__sourceSpill184_11)).init(((int)(__sourceSpill184_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill184_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation184_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[5];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "QÍcj¢V(Bd[¡èÏ;DÛÇlJ­\016ëfÚ\033é`ñ¸âÖ ª2{FCkF©61\023®Þ \000¨Í(ï{¸ÛvO²@ô_¥\037g@ÙÔ\032ûpõ¶~dè\007!TÞ!þé\f\rA@¸OéF~_~Á]Nù±î}\037ÍCä®ÕþæÐã]\\æ\037Û"))).length();

    int local3_life24 = 40;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill184_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill184_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill184_29)).doFinal(((byte[])(__sourceSpill184_28)));

        java.lang.String __sourceSpill184_34 = ((java.lang.String)(com.moon.h3.a(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill184_35 = local7_life19;

        int __sourceSpill184_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill184_35)[__sourceSpill184_36] = __sourceSpill184_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "çL©/ùõÊ»êÏsË\bB&íQs²ü±2=Ô\032ô×°Å­r»E@üúÖ\025e¦©ç~F®áépð´io\013¬í<]áa+ôÉ£4ôk\003E+\027\"â$x_-©æ\020\030/·4\000ÚÈGS9óÖP"))).length();

    local3_life24 = 88;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill184_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill184_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill184_43)).doFinal(((byte[])(__sourceSpill184_42)));

        java.lang.String __sourceSpill184_48 = ((java.lang.String)(com.moon.h3.a(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill184_49 = local7_life19;

        int __sourceSpill184_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill184_49)[__sourceSpill184_50] = __sourceSpill184_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    g = ((java.lang.String[])(local7_life19));

    h = ((java.lang.String[])(new java.lang.String[5]));

    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite184_55(6735, (4001074136898090068L ^ local9_life6)))))));
}


public java.lang.String b() {
return this.e;
}


public void b__Void() {
long local1 = (com.moon.h3.f ^ 28841868081452L);
    java.util.Iterator local3 = ((java.util.List)(this.d)).iterator();
    while (((java.util.Iterator)(local3)).hasNext()) {
        com.moon.hZ local4 = ((com.moon.hZ)(((java.util.Iterator)(local3)).next()));
        ((com.moon.hZ)(local4)).b__Void();
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1333_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill456_0 = p0;
        life4_9 += 1;
        life5_44 = (spill456_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill456_1 = p0;
        life4_9 += 1;
        life5_76 = (spill456_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill456_2 = p0;
        life4_9 += 1;
        life5_91 = (spill456_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8209);
    if (((com.moon.h3.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.h3.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.h3.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/h3", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.h3.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.h3.h)[life5_8] = com.moon.h3.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.h3.h)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.h3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void() {
long life1_3;
    java.lang.String life3_18;
    java.io.InputStream life4_23;
    com.moon.h1 life5_46;
    com.moon.h2[] life6_67;
    int life7_70;
    int life8_72;
    com.moon.h2 life9_79;
    int life6_99;
    int life7_101;
    java.util.Iterator life8_105;
    com.moon.hZ life9_112;
    life1_3 = (com.moon.h3.f ^ 25425096955506L);
    java.lang.String __stackOp58_3_0 = this.b;
    java.lang.String __stackOp58_3_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic58_2(17184, (1081639115036398106L ^ life1_3));
    life3_18 = __sourceIntrinsic_b82a5b29b709_invokedynamic58_5(__stackOp58_3_1, __stackOp58_3_0, __sourceIntrinsic_b82a5b29b709_invokedynamic58_4(24662, (4006701519880958312L ^ life1_3)));
    life4_23 = ((java.lang.Class)(((java.lang.Object)(this)).getClass())).getResourceAsStream(((java.lang.String)(life3_18)));
    if ((life4_23 == null)) {
        org.tinylog.TaggedLogger spill58_0 = com.moon.h3.a;
        java.lang.String spill58_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic58_9(26053, (834833953123022076L ^ life1_3));
        java.lang.Object[] __stackOp58_10_0 = new java.lang.Object[1];
        java.lang.Object[] spill58_2 = __stackOp58_10_0;
        (__stackOp58_10_0)[0] = life3_18;
        ((org.tinylog.TaggedLogger)(spill58_0)).error(((java.lang.String)(spill58_1)), ((java.lang.Object[])(spill58_2)));
        return;
    }
    life5_46 = ((com.moon.h1)(com.moon.h6.a(((java.io.InputStream)(life4_23)), ((java.lang.Class)(com.moon.h1.class)))));
    if ((life5_46 == null)) {
        org.tinylog.TaggedLogger spill58_3 = com.moon.h3.a;
        java.lang.String spill58_4 = __sourceIntrinsic_b82a5b29b709_invokedynamic58_16(23294, (6535894305613056966L ^ life1_3));
        java.lang.Object[] __stackOp58_17_0 = new java.lang.Object[1];
        java.lang.Object[] spill58_5 = __stackOp58_17_0;
        (__stackOp58_17_0)[0] = life3_18;
        ((org.tinylog.TaggedLogger)(spill58_3)).error(((java.lang.String)(spill58_4)), ((java.lang.Object[])(spill58_5)));
        return;
    }
    life6_67 = ((com.moon.h1)(life5_46)).a__Arrayh2();
    life7_70 = (life6_67).length;
    life8_72 = 0;
    loop_region_69: while ((life8_72 < life7_70)) {
        life9_79 = (life6_67)[life8_72];
        ((java.util.List)(this.d)).add(((java.lang.Object)(((com.moon.h0)(((com.moon.h0)(((com.moon.h0)(((com.moon.h0)(com.moon.hZ.a__h0())).a(((java.lang.String)(((com.moon.h2)(life9_79)).a__String()))))).a(((int)(((com.moon.h2)(life9_79)).a()))))).a(((com.moon.b_)(((com.moon.h2)(life9_79)).a__b_()))))).a())));
        life8_72 += 1;
    }
    life6_99 = this.a();
    life7_101 = 0;
    life8_105 = ((java.util.List)(this.d)).iterator();
    loop_region_102: while (((java.util.Iterator)(life8_105)).hasNext()) {
        life9_112 = ((com.moon.hZ)(((java.util.Iterator)(life8_105)).next()));
        ((com.moon.hZ)(life9_112)).a(((com.moon.h3)(this)));
        ((com.moon.hZ)(life9_112)).a(((java.lang.String)(((com.moon.hZ)(life9_112)).a__String())));
        ((com.moon.hZ)(life9_112)).a(((com.moon.jD)(this.c)));
        ((com.moon.hZ)(life9_112)).b(((int)(life6_99)));
        ((com.moon.hZ)(life9_112)).c(((int)(life7_101)));
        ((com.moon.hZ)(life9_112)).a__Void();
        life7_101 = (life7_101 + (((com.moon.hZ)(life9_112)).a() * ((com.moon.b_)(((com.moon.hZ)(life9_112)).a__b_())).b()));
    }
    return;
}


private int a() {
long local1 = (com.moon.h3.f ^ 111409011080078L);
    int local3 = 0;
    java.util.Iterator local4 = ((java.util.List)(this.d)).iterator();
    while (((java.util.Iterator)(local4)).hasNext()) {
        com.moon.hZ local5 = ((com.moon.hZ)(((java.util.Iterator)(local4)).next()));
        local3 = (local3 + (((com.moon.hZ)(local5)).a() * ((com.moon.b_)(((com.moon.hZ)(local5)).a__b_())).b()));
    }
    return local3;
}


public static com.moon.h4 a__h4() {
return new com.moon.h4();
}


public java.lang.String a__String() {
return this.b;
}


public com.moon.jD a__jD() {
return this.c;
}


public java.util.List<com.moon.hZ> a__List() {
return this.d;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite184_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1333_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic58_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic58_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic58_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic58_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic58_16(int a0, long a1) throws E;
}
