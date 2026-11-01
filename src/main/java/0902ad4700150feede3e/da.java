package com.moon;


public class da extends com.moon.c0 {

private static final long g;

private static final java.lang.String[] h;

private static final java.lang.String[] i;

private static final java.util.Map k;

public da(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) {
super(p0, p1, p2);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-3444191684644938497L)), ((long)(2336711204368220729L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200905326109741L)))));

    k = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.da.g ^ 35777703306592L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill119_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill119_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill119_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill119_14 = new byte[8];

    (__sourceSpill119_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill119_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation119_16 = __sourceSpill119_14;

    ((javax.crypto.Cipher)(__sourceSpill119_11)).init(((int)(__sourceSpill119_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill119_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation119_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "Æ.\033zµúvðó*ª\033qÊ\027ºÅÍhýú`ìã\037Í¾Ìoº~È}\017zh\006|æ¥ªLö\001Z×¸xèÒ-gÆ\026´×Æ9\007Ã¿9\017¦¶6\0001üÂ\036\\\034\002¾Ðlw:&B,j4×þúñW'Y\034­$»²z®ü$\r[\017\n\031=«®\000."))).length();

    int local5_life24 = 24;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill119_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill119_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill119_29)).doFinal(((byte[])(__sourceSpill119_28)));

        java.lang.String __sourceSpill119_34 = ((java.lang.String)(com.moon.da.b(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill119_35 = local9_life19;

        int __sourceSpill119_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill119_35)[__sourceSpill119_36] = __sourceSpill119_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "9ò_Øn¹ùT6qü\f\027{¿xÂáÛ¬ÐèðvñX5Ú]þÉÃ«6ZèidiÏ#ï)¶ciÓpÂ\035Ê:0\013'\nû\034\024°3¼,¨9Q­Ò-:ø\030eÛ¤¿=\035Þ\017\001\013íßv¦ðò§\177gÅÈm=(ÎF®0ã0|\004àDoNÚ\031n4lvºbY\007Rõ¿z\"­  \023XAÁÄï"))).length();

    local5_life24 = 112;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill119_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill119_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill119_43)).doFinal(((byte[])(__sourceSpill119_42)));

        java.lang.String __sourceSpill119_48 = ((java.lang.String)(com.moon.da.b(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill119_49 = local9_life19;

        int __sourceSpill119_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill119_49)[__sourceSpill119_50] = __sourceSpill119_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[4]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral911_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/da"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.da.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21798);
    if (((com.moon.da.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.da.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.da.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/da", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.da.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.da.i)[life5_8] = com.moon.da.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.da.i)[life5_8];
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
        byte[] spill158_0 = p0;
        life4_9 += 1;
        life5_44 = (spill158_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill158_1 = p0;
        life4_9 += 1;
        life5_76 = (spill158_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill158_2 = p0;
        life4_9 += 1;
        life5_91 = (spill158_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.dc a() {
int spill11_0;
    java.lang.String spill11_1;
    java.lang.Object[] spill11_2;
    java.lang.Object[] spill11_3;
    java.lang.Object[] spill11_4;
    java.lang.Object[] spill11_5;
    java.lang.String spill11_6;
    int spill11_7;
    java.lang.String spill11_8;
    long life1_3;
    com.moon.od life4_7;
    int life3_8;
    int life5_12;
    java.lang.StringBuilder life6_18;
    java.util.Map life7_23;
    java.util.Iterator life8_27;
    com.moon.ad life9_34;
    java.lang.String life10_63;
    lexical_join_100: {
    lexical_join_94: {
    lexical_join_92: {
    lexical_join_72: {
    life1_3 = (com.moon.da.g ^ 68438564128435L);
    spill11_0 = com.moon.aW.b();
    life4_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od();
    life3_8 = spill11_0;
    life5_12 = ((((com.moon.pE)(((com.moon.od)(life4_7)).a__pE())).isOpen()) ? 1 : 0);
    if (!((life5_12 != 0))) {
        break lexical_join_94;
    }
    life6_18 = new java.lang.StringBuilder();
    life7_23 = ((com.moon.oj)(((com.moon.og)(((com.moon.od)(life4_7)).a__og())).a__oj())).a();
    life8_27 = ((java.util.Collection)(((java.util.Map)(life7_23)).values())).iterator();
    lexical_cycle_28: while (true) {
    if (!(((java.util.Iterator)(life8_27)).hasNext())) {
        break lexical_join_72;
    }
    life9_34 = ((com.moon.ad)(((java.util.Iterator)(life8_27)).next()));
    spill11_1 = __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_15(24283, (1390851154696918090L ^ life1_3));
    java.lang.Object[] __stackOp11_16_0 = new java.lang.Object[4];
    spill11_2 = __stackOp11_16_0;
    (__stackOp11_16_0)[0] = ((com.moon.ad)(life9_34)).d__String();
    java.lang.Object[] __stackOp11_18_0 = spill11_2;
    spill11_3 = __stackOp11_18_0;
    (__stackOp11_18_0)[1] = ((com.moon.ad)(life9_34)).a__String();
    java.lang.Object[] __stackOp11_20_0 = spill11_3;
    spill11_4 = __stackOp11_20_0;
    (__stackOp11_20_0)[2] = ((com.moon.ad)(life9_34)).d__String();
    java.lang.Object[] __stackOp11_22_0 = spill11_4;
    spill11_5 = __stackOp11_22_0;
    (__stackOp11_22_0)[3] = ((com.moon.ad)(life9_34)).c__String();
    life10_63 = java.lang.String.format(((java.lang.String)(spill11_1)), ((java.lang.Object[])(spill11_5)));
    ((java.lang.StringBuilder)(life6_18)).append(((java.lang.String)(life10_63)));
    if (!((life3_8 == 0))) {
        break lexical_join_92;
    }
    if (!((life3_8 != 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    int __stackOp11_30_0 = ((java.util.Map)(life7_23)).size();
    java.lang.String __stackOp11_30_1 = ((java.lang.String)(((java.lang.StringBuilder)(life6_18)).toString())).trim();
    java.lang.String __stackOp11_30_2 = __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_29(2057, (3515529232926540441L ^ life1_3));
    spill11_6 = __stackOp11_30_2;
    spill11_7 = __stackOp11_30_0;
    spill11_8 = __stackOp11_30_1;
    recovery.source.CarrierOps.discard(__stackOp11_30_2);
    java.lang.String __stackOp11_33_0 = spill11_8;
    java.lang.String __stackOp11_33_1 = __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_32(26380, (4467391145607359903L ^ life1_3));
    com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_34(spill11_6, spill11_7, __stackOp11_33_1, __stackOp11_33_0))));
    }
    if (!((life3_8 != 0))) {
        break lexical_join_100;
    }
    }
    com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_36(4343, (3166165087643736677L ^ life1_3)))));
    }
    return ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral911_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_34(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic11_36(int a0, long a1) throws E;
}
