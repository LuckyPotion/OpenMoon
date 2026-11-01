package com.moon;


public class c1 extends com.moon.c0 {

private com.moon.dl g;

private com.moon.dm h;

private com.moon.dh<com.moon.module.PressType> i;

private static long k;

private static java.lang.String[] o;

private static java.lang.String[] p;

private static java.util.Map q;

private static long r;

public c1(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String[])null); }


private static void __sourceConstructorBody_27cae9fe452a9894(com.moon.c1 receiver, java.lang.String p0, java.lang.String p1, java.lang.String[] p2) throws Throwable {

long local4_life1 = (com.moon.c1.k ^ 134405344372173L);

    int __sourceSpill12_3 = com.moon.aW.c();

    com.moon.c1.__sourceConstructorInit_27cae9fe452a9894_0(((com.moon.c1)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String[])(p2)));

    ((com.moon.c1)(receiver)).g = ((com.moon.dl)(((com.moon.dl)(((com.moon.dn)(((com.moon.dn)(((com.moon.dn)(((com.moon.du)(com.moon.dl.a__du())).a(((java.lang.String)(__sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_6(30893, (2909140356351147389L ^ local4_life1))))))).b(((java.lang.String)(__sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_8(13931, (8081125719507530682L ^ local4_life1))))))).a__dn())).a()))));

    ((com.moon.c1)(receiver)).h = ((com.moon.dm)(((com.moon.dm)(((com.moon.dn)(((com.moon.dn)(((com.moon.dn)(((com.moon.dv)(com.moon.dm.a__dv())).a(((java.lang.String)(__sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_15(6960, (5032616592787496676L ^ local4_life1))))))).b(((java.lang.String)(__sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_17(26319, (7144330701093315354L ^ local4_life1))))))).a__dn())).a()))));

    int local6_life23 = __sourceSpill12_3;

    ((com.moon.c1)(receiver)).i = ((com.moon.dh)(((com.moon.dh)(((com.moon.dn)(((com.moon.dn)(((com.moon.dq)(com.moon.dh.a__sourceStatic_4981646cb3(((java.lang.Class)(com.moon.module.PressType.class))))).a(((java.lang.String)(__sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_26(8772, (4339924294570698646L ^ local4_life1))))))).b(((java.lang.String)(__sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_28(6720, (775314218768326551L ^ local4_life1))))))).a()))));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        local6_life23 += 1;

        com.moon.aW.b(((int)(local6_life23)));

    }

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(4681805277532345234L)), ((long)(-1605218719021750532L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(56173688140682L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.c1.k ^ 92056906868201L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill33_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill33_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill33_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill33_14 = new byte[8];
    (__sourceSpill33_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill33_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation33_16 = __sourceSpill33_14;
    ((javax.crypto.Cipher)(__sourceSpill33_11)).init(((int)(__sourceSpill33_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill33_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation33_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[9];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "\035¨û\024H-ãòßcL0\f\024¨æàÎPÄ'WUð6¨ÃåÞ¹_@ìÇcu1é;%p«E oÚ\021çJÄ7OHM¤Ó\017}\b¯\003CS!\bÙw\021Z ÷¯v9ÑfDÆÖ$\t×Ù÷Í\006\"j\022çÕ÷#@~à¯$çÌÕz2Ng0\004´Ñt\"\032R²¿»Kõ4´±òþªP¦þ\036¶LÎÒÀxÔò&\020;qGpa»\rÍ\034ã®tíHÖ<x8&G¬/V6ý\tÄ|\000Á\017W\027\025¾<G®ºN\"\027èxgqaÉJA:±ðõyÃ/\017¯¾¥\020Btjd\022ô\0309h±&\030\020ä\"Ø2\"\022\000&Ç=T\025\031ð\020Y^\025@\023IøýåãW\020Ùûd\020ÉnÕö\177×Tù´º\feú=°"))).length();
    int local10_life24 = 48;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill33_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill33_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill33_29)).doFinal(((byte[])(__sourceSpill33_28)));
        java.lang.String __sourceSpill33_34 = ((java.lang.String)(com.moon.c1.b(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill33_35 = local14_life19;
        int __sourceSpill33_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill33_35)[__sourceSpill33_36] = __sourceSpill33_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "¯raýÍ¯S&¹×?A;'\ry\024Ï<¡3Z¾x]\033zþ~r\f\026Ö\005Ò¥øÌWù¡Ìí7fsÂ6V\020\"óxI\025Ú$ÐVU+É"))).length();
    local10_life24 = 56;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill33_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill33_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill33_42)).doFinal(((byte[])(__sourceSpill33_41)));
        java.lang.String __sourceSpill33_47 = ((java.lang.String)(com.moon.c1.b(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill33_48 = local14_life19;
        int __sourceSpill33_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill33_48)[__sourceSpill33_49] = __sourceSpill33_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    o = ((java.lang.String[])(local14_life19));
    p = ((java.lang.String[])(new java.lang.String[9]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill33_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill33_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill33_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill33_59 = new byte[8];
    (__sourceSpill33_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill33_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation33_61 = __sourceSpill33_59;
    ((javax.crypto.Cipher)(__sourceSpill33_56)).init(((int)(__sourceSpill33_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill33_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation33_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -7754276790859194516L;
    byte[] __sourceSpill33_65 = new byte[8];
    (__sourceSpill33_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill33_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill33_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill33_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill33_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill33_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill33_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill33_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill33_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill33_66)).doFinal(((byte[])(__sourceSpill33_65)));
    r = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_27cae9fe452a9894_0(com.moon.c1 a0, java.lang.String a1, java.lang.String a2, java.lang.String[] a3) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral729_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.c1.b(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13105);
    if (((com.moon.c1.p)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.c1.q)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c1.q)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/c1", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.c1.o)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.c1.p)[life5_8] = com.moon.c1.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.c1.p)[life5_8];
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
        byte[] spill96_0 = p0;
        life4_9 += 1;
        life5_44 = (spill96_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill96_1 = p0;
        life4_9 += 1;
        life5_76 = (spill96_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill96_2 = p0;
        life4_9 += 1;
        life5_91 = (spill96_2)[life4_9];
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
com.moon.module.Module forwardValue22_33_0;
    int forwardValue22_33_1;
    com.moon.module.Module forwardValue22_34_0;
    com.moon.module.Module forwardValue22_37_0;
    int forwardValue22_37_1;
    com.moon.module.Module forwardValue22_44_0;
    com.moon.module.Module forwardValue22_45_0;
    com.moon.module.InputSource forwardValue22_45_1;
    com.moon.dc forwardValue22_95_0;
    int spill22_0;
    com.moon.module.Module spill22_1;
    int spill22_2;
    com.moon.module.Module spill22_3;
    com.moon.hD spill22_4;
    com.moon.hB spill22_5;
    com.moon.dc spill22_6;
    long life1_3;
    com.moon.module.Module life4_9;
    int life3_10;
    java.lang.String life5_15;
    int life6_23;
    forward_join_95: {
    forward_join_86: {
    forward_join_60: {
    forward_join_45: {
    forward_join_44: {
    forward_join_37: {
    forward_join_34: {
    forward_join_33: {
    life1_3 = (com.moon.c1.k ^ 9827613576351L);
    spill22_0 = com.moon.aW.c();
    life4_9 = ((com.moon.module.Module)(((com.moon.dl)(this.g)).a__Object()));
    life3_10 = spill22_0;
    life5_15 = ((java.lang.String)(((com.moon.dm)(this.h)).a__Object()));
    life6_23 = ((((java.lang.String)(life5_15)).startsWith(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_8(23370, (7920413279177357254L ^ life1_3)))))) ? 1 : 0);
    spill22_1 = life4_9;
    spill22_2 = life6_23;
    if (!((life3_10 != 0))) {
        forwardValue22_33_0 = spill22_1;
        forwardValue22_33_1 = spill22_2;
        break forward_join_33;
    }
    if (!((spill22_2 != 0))) {
        forwardValue22_34_0 = spill22_1;
        break forward_join_34;
    }
    forwardValue22_33_0 = spill22_1;
    forwardValue22_33_1 = java.lang.Integer.parseInt(((java.lang.String)(((java.lang.String)(life5_15)).substring(((int)(5))))));
    }
    forwardValue22_37_0 = forwardValue22_33_0;
    forwardValue22_37_1 = forwardValue22_33_1;
    break forward_join_37;
    }
    forwardValue22_37_0 = forwardValue22_34_0;
    forwardValue22_37_1 = org.lwjgl.input.Keyboard.getKeyIndex(((java.lang.String)(((java.lang.String)(life5_15)).toUpperCase())));
    }
    ((com.moon.module.Module)(forwardValue22_37_0)).setKeyCode(((int)(forwardValue22_37_1)));
    spill22_3 = life4_9;
    if (!((life6_23 != 0))) {
        forwardValue22_44_0 = spill22_3;
        break forward_join_44;
    }
    forwardValue22_45_0 = spill22_3;
    forwardValue22_45_1 = com.moon.module.InputSource.MOUSE;
    break forward_join_45;
    }
    forwardValue22_45_0 = forwardValue22_44_0;
    forwardValue22_45_1 = com.moon.module.InputSource.KEYBOARD;
    }
    ((com.moon.module.Module)(forwardValue22_45_0)).setInputSource(((com.moon.module.InputSource)(forwardValue22_45_1)));
    if (!((life3_10 != 0))) {
        break forward_join_86;
    }
    if (!((((com.moon.dh)(this.i)).a__Object() != null))) {
        break forward_join_60;
    }
    ((com.moon.module.Module)(life4_9)).setPressType(((com.moon.module.PressType)(((com.moon.module.PressType)(((com.moon.dh)(this.i)).a__Object())))));
    }
    spill22_4 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD();
    spill22_5 = ((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_28(25568, (4864196535801450337L ^ life1_3)))));
    java.lang.String __stackOp22_32_0 = ((com.moon.module.Module)(life4_9)).getName();
    java.lang.String __stackOp22_32_1 = __sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_31(2254, (4144505135206360138L ^ life1_3));
    ((com.moon.hD)(spill22_4)).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(spill22_5)).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_33(__stackOp22_32_1, __stackOp22_32_0, "!")))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(com.moon.c1.r))))).a())));
    }
    spill22_6 = ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
    if (!((life3_10 == 0))) {
        forwardValue22_95_0 = spill22_6;
        break forward_join_95;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    forwardValue22_95_0 = spill22_6;
    }
    return forwardValue22_95_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_27cae9fe452a9894_originalDynamicSite12_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic22_33(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral729_0() throws E;
}
