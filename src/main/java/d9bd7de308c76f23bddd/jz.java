package com.moon;


public class jz {

private static final org.tinylog.TaggedLogger a;

private static final java.util.Random b;

private final java.util.Map<java.lang.Integer, com.moon.jr> c;

private final com.moon.jy d;

private final java.lang.String e;

private int[][] f;

private static int g;

private static final long h;

private static final java.lang.String[] i;

private static final java.lang.String[] j;

private static final java.util.Map k;

private static final long l;

public jz(com.moon.jy p0, java.lang.String p1) {
super();
    this.c = new java.util.HashMap();
    this.d = p0;
    this.e = p1;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-2208337381187388707L)), ((long)(-6939656669633091095L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(73897064761799L)))));
    long local14_life6 = (com.moon.jz.h ^ 41708929618161L);
    int __sourceSpill203_8 = 0;
    k = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.jz.b(((int)(__sourceSpill203_8)));
    javax.crypto.Cipher local5_life11;
    javax.crypto.Cipher __sourceSpill203_13 = (local5_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill203_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill203_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill203_16 = new byte[8];
    (__sourceSpill203_16)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local6_life17 = 1;
    while ((local6_life17 < 8)) {
        (__sourceSpill203_16)[local6_life17] = ((byte) ((int) ((local14_life6 << (local6_life17 * 8)) >>> 56)));
        local6_life17 += 1;
    }
    byte[] __sourcePreallocation203_18 = __sourceSpill203_16;
    ((javax.crypto.Cipher)(__sourceSpill203_13)).init(((int)(__sourceSpill203_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill203_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation203_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local12_life21 = new java.lang.String[2];
    int local10_life22 = 0;
    java.lang.String local9_life23;
    int local11_life25 = ((java.lang.String)((local9_life23 = "(ªÄË¨IeU\026¬Û^(Q\026D#güC\022î=!]¦U«[T\003[\003ÿ@bÕõ÷JÛùÁØ\004Xö*|ðóüwþ\0014V\nü¡¸°m õîï\"\027®²\001\035EL³\024^\f ú;¥\021k­Ú­Ø~-ä\024\023\023nG\023ÜlÛ¼\032+J-gÜ[ªUtz+¯=&~"))).length();
    int local8_life26 = 56;
    int local7_life27 = -1;
    while (true) {
        local7_life27 += 1;
        byte[] __sourceSpill203_30 = ((java.lang.String)(((java.lang.String)(local9_life23)).substring(((int)(local7_life27)), ((int)((local7_life27 + local8_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill203_31 = local5_life11;
        byte[] local13_life33 = ((javax.crypto.Cipher)(__sourceSpill203_31)).doFinal(((byte[])(__sourceSpill203_30)));
        java.lang.String __sourceSpill203_36 = ((java.lang.String)(com.moon.jz.a(((byte[])(local13_life33))))).intern();
        java.lang.String[] __sourceSpill203_37 = local12_life21;
        int __sourceSpill203_38 = local10_life22;
        local10_life22 += 1;
        (__sourceSpill203_37)[__sourceSpill203_38] = __sourceSpill203_36;
        if (!(((local7_life27 = (local7_life27 + local8_life26)) < local11_life25))) { break; }
        local8_life26 = ((java.lang.String)(local9_life23)).charAt(((int)(local7_life27)));
    }
    i = ((java.lang.String[])(local12_life21));
    j = ((java.lang.String[])(new java.lang.String[2]));
    javax.crypto.Cipher local0_life43;
    javax.crypto.Cipher __sourceSpill203_45 = (local0_life43 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill203_46 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill203_47 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill203_48 = new byte[8];
    (__sourceSpill203_48)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life49 = 1;
    while ((local1_life49 < 8)) {
        (__sourceSpill203_48)[local1_life49] = ((byte) ((int) ((local14_life6 << (local1_life49 * 8)) >>> 56)));
        local1_life49 += 1;
    }
    byte[] __sourcePreallocation203_50 = __sourceSpill203_48;
    ((javax.crypto.Cipher)(__sourceSpill203_45)).init(((int)(__sourceSpill203_46)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill203_47)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation203_50)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life53 = 46138758013749955L;
    byte[] __sourceSpill203_54 = new byte[8];
    (__sourceSpill203_54)[0] = ((byte) ((int) (local2_life53 >>> 56)));
    (__sourceSpill203_54)[1] = ((byte) ((int) (local2_life53 >>> 48)));
    (__sourceSpill203_54)[2] = ((byte) ((int) (local2_life53 >>> 40)));
    (__sourceSpill203_54)[3] = ((byte) ((int) (local2_life53 >>> 32)));
    (__sourceSpill203_54)[4] = ((byte) ((int) (local2_life53 >>> 24)));
    (__sourceSpill203_54)[5] = ((byte) ((int) (local2_life53 >>> 16)));
    (__sourceSpill203_54)[6] = ((byte) ((int) (local2_life53 >>> 8)));
    (__sourceSpill203_54)[7] = ((byte) ((int) local2_life53));
    javax.crypto.Cipher __sourceSpill203_55 = local0_life43;
    byte[] local4_life57 = ((javax.crypto.Cipher)(__sourceSpill203_55)).doFinal(((byte[])(__sourceSpill203_54)));
    l = ((long)((((((((((((long) (local4_life57)[0]) & 255L) << 56) | ((((long) (local4_life57)[1]) & 255L) << 48)) | ((((long) (local4_life57)[2]) & 255L) << 40)) | ((((long) (local4_life57)[3]) & 255L) << 32)) | ((((long) (local4_life57)[4]) & 255L) << 24)) | ((((long) (local4_life57)[5]) & 255L) << 16)) | ((((long) (local4_life57)[6]) & 255L) << 8)) | (((long) (local4_life57)[7]) & 255L))));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite203_59(10417, (4475178979014423359L ^ local14_life6)))))));
    b = ((java.util.Random)(new java.util.Random()));
}


public static int b() {
return com.moon.jz.g;
}


public static void b(int p0) {
com.moon.jz.g = ((int)(p0));
    return;
}


public static int c() {
int local0 = com.moon.jz.b();
    if ((local0 == 0)) {
        return 35;
    }
    return 0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8425);
    if (((com.moon.jz.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jz.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jz.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jz", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jz.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jz.j)[life5_8] = com.moon.jz.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jz.j)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1996_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill834_0 = p0;
        life4_9 += 1;
        life5_44 = (spill834_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill834_1 = p0;
        life4_9 += 1;
        life5_76 = (spill834_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill834_2 = p0;
        life4_9 += 1;
        life5_91 = (spill834_2)[life4_9];
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


public com.moon.jr a(char p0) {
return ((com.moon.jr)(((java.util.Map)(this.c)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
}


public float a(char p0, char p1) {
java.lang.Object forwardValue611_41_0;
    int spill611_0;
    java.util.Map spill611_1;
    long life3_3;
    com.moon.ju life6_8;
    com.moon.jr life7_15;
    int life5_16;
    com.moon.jw life8_47;
    float life9_50;
    forward_join_41: {
    forward_join_29: {
    life3_3 = (com.moon.jz.h ^ 135218122134462L);
    spill611_0 = com.moon.jz.c();
    life6_8 = ((com.moon.jy)(this.d)).a();
    life7_15 = ((com.moon.jr)(((java.util.Map)(this.c)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))))));
    life5_16 = spill611_0;
    spill611_1 = ((com.moon.jr)(life7_15)).a__Map();
    if (!((life5_16 != 0))) {
        forwardValue611_41_0 = spill611_1;
        break forward_join_41;
    }
    if (!(((java.util.Map)(spill611_1)).containsKey(((java.lang.Object)(java.lang.Character.valueOf(((char)(p0)))))))) {
        break forward_join_29;
    }
    return ((com.moon.jr)(life7_15)).a(((char)(p0)));
    }
    forwardValue611_41_0 = ((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(((com.moon.ju)(life6_8)).b())).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_8ee61cc60893_invokedynamic611_14(p0, p1)))))).findFirst())).orElse(((java.lang.Object)(new com.moon.jw())));
    }
    life8_47 = ((com.moon.jw)(forwardValue611_41_0));
    life9_50 = ((com.moon.jw)(life8_47)).a();
    ((com.moon.jr)(life7_15)).a(((char)(p0)), ((float)(life9_50)));
    return life9_50;
}


public com.moon.jr a(com.moon.jr p0) {
long local2 = (com.moon.jz.h ^ 107603365803178L);
    int[] local4 = (this.f)[((int) (((com.moon.jr)(p0)).g() * 0x1.9p6f))];
    return (((local4).length == 0) ? p0 : this.a(((char)(((char) (local4)[((java.util.Random)(com.moon.jz.b)).nextInt(((int)((local4).length)))])))));
}


private void a(float p0) {
int lexicalValue129_47_0;
    int lexicalValue129_62_0;
    int lexicalValue129_69_0;
    int lexicalValue129_82_0;
    int spill129_0;
    int spill129_1;
    int spill129_2;
    long life2_3;
    int life5_6;
    int life4_12;
    int life6_14;
    java.util.ArrayList life7_21;
    java.util.Iterator life8_26;
    java.util.Map.Entry life9_33;
    com.moon.jr life10_37;
    int life11_49;
    int life12_80;
    int[] life8_105;
    int life9_107;
    lexical_join_116: {
    life2_3 = (com.moon.jz.h ^ 13618463369447L);
    life5_6 = moom.Dr.b__Int(((float)(p0)));
    spill129_0 = com.moon.jz.c();
    this.f = ((int[][])(new int[life5_6][]));
    life4_12 = spill129_0;
    life6_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_114: {
    lexical_join_108: {
    lexical_join_85: {
    if (!((life6_14 < life5_6))) {
        break lexical_join_116;
    }
    life7_21 = new java.util.ArrayList();
    life8_26 = ((java.util.Set)(((java.util.Map)(this.c)).entrySet())).iterator();
    lexical_cycle_27: while (true) {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_78: {
    lexical_join_69: {
    lexical_join_62: {
    lexical_join_47: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life8_26)).hasNext())) {
        break lexical_join_85;
    }
    life9_33 = ((java.util.Map.Entry)(((java.util.Iterator)(life8_26)).next()));
    life10_37 = ((com.moon.jr)(((java.util.Map.Entry)(life9_33)).getValue()));
    if (!((life4_12 != 0))) { continue lexical_cycle_15; }
    if (!((((com.moon.jv)(((com.moon.jr)(life10_37)).a__jv())).a__jt() == null))) {
        break lexical_join_46;
    }
    lexicalValue129_47_0 = 1;
    break lexical_join_47;
    }
    lexicalValue129_47_0 = 0;
    }
    life11_49 = lexicalValue129_47_0;
    spill129_1 = recovery.source.CarrierOps.fcmpg(((float)(java.lang.Math.abs(((float)(((((com.moon.jr)(life10_37)).g() * 0x1.9p6f) - ((float) life6_14))))))), ((float)(0x1.0p-1f)));
    if (!((life4_12 != 0))) {
        lexicalValue129_62_0 = spill129_1;
        break lexical_join_62;
    }
    if (!((spill129_1 <= 0))) {
        break lexical_join_83;
    }
    lexicalValue129_62_0 = life11_49;
    }
    if (!((life4_12 != 0))) {
        lexicalValue129_69_0 = lexicalValue129_62_0;
        break lexical_join_69;
    }
    if (!((lexicalValue129_62_0 == 0))) {
        break lexical_join_83;
    }
    lexicalValue129_69_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map.Entry)(life9_33)).getKey())))).intValue();
    }
    life12_80 = lexicalValue129_69_0;
    spill129_2 = life12_80;
    if (!((life4_12 != 0))) {
        lexicalValue129_82_0 = spill129_2;
        break lexical_join_82;
    }
    if (!((spill129_2 == ((int) com.moon.jz.l)))) {
        break lexical_join_78;
    }
    if (!((life4_12 == 0))) { continue lexical_cycle_27; }
    }
    lexicalValue129_82_0 = ((((java.util.List)(life7_21)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life12_80))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue129_82_0);
    }
    if (!((life4_12 == 0))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    life8_105 = new int[((java.util.List)(life7_21)).size()];
    life9_107 = 0;
    lexical_cycle_91: while (true) {
    if (!((life9_107 < ((java.util.List)(life7_21)).size()))) {
        break lexical_join_108;
    }
    (life8_105)[life9_107] = ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(life7_21)).get(((int)(life9_107))))))).intValue();
    life9_107 += 1;
    if (!((life4_12 != 0))) {
        break lexical_join_114;
    }
    if (!((life4_12 == 0))) { continue lexical_cycle_91; }
    break lexical_cycle_91;
    }
    }
    (this.f)[life6_14] = life8_105;
    life6_14 += 1;
    }
    if (!((life4_12 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


public void a__Void() {
int spill130_0;
    org.tinylog.TaggedLogger spill130_1;
    long life1_3;
    com.moon.ju life4_8;
    int life3_9;
    float life5_11;
    java.util.Iterator life6_15;
    com.moon.jv life7_22;
    com.moon.jr life8_31;
    float life9_34;
    lexical_join_74: {
    lexical_join_58: {
    life1_3 = (com.moon.jz.h ^ 20877729611984L);
    spill130_0 = com.moon.jz.c();
    life4_8 = ((com.moon.jy)(this.d)).a();
    life3_9 = spill130_0;
    life5_11 = 0x0.0p0f;
    life6_15 = ((java.util.List)(((com.moon.ju)(life4_8)).a__List())).iterator();
    lexical_cycle_16: while (true) {
    lexical_join_53: {
    lexical_join_45: {
    if (!(((java.util.Iterator)(life6_15)).hasNext())) {
        break lexical_join_58;
    }
    life7_22 = ((com.moon.jv)(((java.util.Iterator)(life6_15)).next()));
    life8_31 = new com.moon.jr(life7_22, ((com.moon.ju)(life4_8)).a(), ((com.moon.ju)(life4_8)).a__jx());
    life9_34 = ((com.moon.jr)(life8_31)).g();
    if (!((life3_9 != 0))) {
        break lexical_join_74;
    }
    if (!((life3_9 != 0))) {
        break lexical_join_53;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life9_34)), ((float)(life5_11))) > 0))) {
        break lexical_join_45;
    }
    life5_11 = life9_34;
    }
    ((java.util.Map)(this.c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((com.moon.jv)(life7_22)).a__Int()))))), ((java.lang.Object)(life8_31)));
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    this.a(((float)((life5_11 * 0x1.9p6f))));
    spill130_1 = com.moon.jz.a;
    java.lang.String __stackOp130_22_0 = this.e;
    java.lang.String __stackOp130_22_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic130_21(14838, (4536506180861456984L ^ life1_3));
    ((org.tinylog.TaggedLogger)(spill130_1)).info(((java.lang.Object)(__sourceIntrinsic_b82a5b29b709_invokedynamic130_23(__stackOp130_22_1, __stackOp130_22_0))));
    }
    return;
}


public int[][] a__ArrayArrayInt() {
return this.f;
}


public java.lang.String a__String() {
return this.e;
}


public com.moon.jy a() {
return this.d;
}


public java.util.Map<java.lang.Integer, com.moon.jr> a__Map() {
return this.c;
}


private static boolean lambda$computeKerning$0(char p0, char p1, com.moon.jw p2) {
int forwardValue614_17_0;
    int forwardValue614_17_1;
    int forwardValue614_19_0;
    int forwardValue614_21_0;
    int spill614_0;
    char spill614_1;
    int spill614_2;
    long life3_3;
    int life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life3_3 = (com.moon.jz.h ^ 56724656959081L);
    life5_5 = com.moon.jz.b();
    spill614_0 = ((com.moon.jw)(p2)).a__Int();
    spill614_1 = p0;
    if (!((life5_5 == 0))) {
        forwardValue614_17_0 = spill614_0;
        forwardValue614_17_1 = ((int)(spill614_1));
        break forward_join_17;
    }
    if (!((spill614_0 == spill614_1))) {
        break forward_join_20;
    }
    spill614_2 = ((com.moon.jw)(p2)).b();
    if (!((life5_5 == 0))) {
        forwardValue614_19_0 = spill614_2;
        break forward_join_19;
    }
    forwardValue614_17_0 = spill614_2;
    forwardValue614_17_1 = ((int)(p1));
    }
    if (!((forwardValue614_17_0 == forwardValue614_17_1))) {
        break forward_join_20;
    }
    forwardValue614_19_0 = 1;
    }
    forwardValue614_21_0 = forwardValue614_19_0;
    break forward_join_21;
    }
    forwardValue614_21_0 = 0;
    }
    return ((forwardValue614_21_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite203_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1996_0() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_8ee61cc60893_invokedynamic611_14(char a0, char a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic130_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic130_23(java.lang.String a0, java.lang.String a1) throws E;
}
