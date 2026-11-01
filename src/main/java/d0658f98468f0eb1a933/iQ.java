package com.moon;


public class iQ extends com.moon.iw {

private com.moon.iU k;

protected com.moon.jE l;

private static long m;

private static java.lang.String[] n;

private static java.lang.String[] o;

private static java.util.Map p;

public iQ() { super(); }


private static void __sourceConstructorBody_2eb2ee1eecf83c88(com.moon.iQ receiver) throws Throwable {

long local1 = (com.moon.iQ.m ^ 135516900048406L);

    com.moon.iQ.__sourceConstructorInit_2eb2ee1eecf83c88_0(((com.moon.iQ)(receiver)));

    ((com.moon.iQ)(receiver)).k = ((com.moon.iU)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(com.moon.iU.a__iV())).a(((java.lang.Class)(com.moon.i6.class))))).a(((java.lang.String)(__sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_5(7503, (6631728828875309062L ^ local1))))))).c(((java.lang.String)(__sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_7(4653, (878071402340650855L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_9(4653, (878071402340650855L ^ local1))))))).a()));

    ((com.moon.iQ)(receiver)).l = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_14(22116, (731001291947789100L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_16(receiver)))))).a()));

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(-3135877583673216207L)), ((long)(-3771420850161248756L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99429941021597L)))));

    p = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.iQ.m ^ 50962775695924L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill242_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill242_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill242_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill242_14 = new byte[8];

    (__sourceSpill242_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill242_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation242_16 = __sourceSpill242_14;

    ((javax.crypto.Cipher)(__sourceSpill242_11)).init(((int)(__sourceSpill242_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill242_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation242_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "è¥L¶êxpb-÷2J\f\005K!\003·P\024ºþè\007EQîý\020Ð*gÈbÑ»\rûüw/"))).length();

    int local5_life24 = 32;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill242_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill242_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill242_29)).doFinal(((byte[])(__sourceSpill242_28)));

        java.lang.String __sourceSpill242_34 = ((java.lang.String)(com.moon.iQ.b(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill242_35 = local9_life19;

        int __sourceSpill242_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill242_35)[__sourceSpill242_36] = __sourceSpill242_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "éªÎ³;ß·K+&x<}]2Gð!Z \005Ùé$À¤óÁ¢=(¹£®\005[SSÁ(*ó9U½¹J"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill242_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill242_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill242_43)).doFinal(((byte[])(__sourceSpill242_42)));

        java.lang.String __sourceSpill242_48 = ((java.lang.String)(com.moon.iQ.b(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill242_49 = local9_life19;

        int __sourceSpill242_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill242_49)[__sourceSpill242_50] = __sourceSpill242_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    n = ((java.lang.String[])(local9_life19));

    o = ((java.lang.String[])(new java.lang.String[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_2eb2ee1eecf83c88_0(com.moon.iQ a0) throws E;

protected void b__Void() {
long life1_3;
    int life3_8;
    int life4_18;
    life1_3 = (com.moon.iQ.m ^ 65124763363292L);
    int spill412_0 = __sourceExactCall_07c875d17e3cdd();
    ((com.moon.jE)(this.l)).a__Void();
    life3_8 = spill412_0;
    life4_18 = org.lwjgl.opengl.GL20.glGetUniformLocation(((int)(((com.moon.jD)(this.g)).a())), ((java.lang.CharSequence)(__sourceIntrinsic_9bf881b104f5_invokedynamic412_6(25824, (7925037073944748129L ^ life1_3)))));
    org.lwjgl.opengl.GL20.glUniform1i(((int)(life4_18)), ((int)(0)));
    if ((life3_8 == 0)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1626_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill605_0 = p0;
        life4_9 += 1;
        life5_44 = (spill605_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill605_1 = p0;
        life4_9 += 1;
        life5_76 = (spill605_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill605_2 = p0;
        life4_9 += 1;
        life5_91 = (spill605_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String b(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25722);
    if (((com.moon.iQ.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iQ.p)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iQ.p)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iQ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iQ.n)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iQ.o)[life5_8] = com.moon.iQ.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iQ.o)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iQ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public com.moon.jE c() {
return this.l;
}


protected void c__Void() {
((com.moon.jE)(this.l)).a(((float)((0x1.666666p-1f / ((float) ((moom.ir)(com.moon.nS.a())).c())))));
    return;
}


public com.moon.iU a__iU() {
return this.k;
}


private com.moon.jD lambda$new$0() {
return this.g;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_2eb2ee1eecf83c88_originalDynamicSite1031_16(com.moon.iQ a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1626_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic412_6(int a0, long a1) throws E;

private static native int __sourceExactCall_07c875d17e3cdd();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
