package com.moon;


public class ck extends sourcebuild.EnumConstructor<com.moon.ck> implements com.google.protobuf.ProtocolMessageEnum {

public static com.moon.ck CONFIG;

public static com.moon.ck SCRIPT;

public static com.moon.ck UNRECOGNIZED;

public static int CONFIG_VALUE = 0;

public static int SCRIPT_VALUE = 1;

private static com.google.protobuf.Internal.EnumLiteMap<com.moon.ck> a;

private static com.moon.ck[] b;

private int c;

private static com.moon.ck[] d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

private ck(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.c = p2;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-7185954857246416915L)), ((long)(-4229234773703669816L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(164243279488328L)))));
    long local9_life6 = (com.moon.ck.e ^ 126895881297538L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill108_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill108_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill108_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill108_14 = new byte[8];
    (__sourceSpill108_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill108_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation108_16 = __sourceSpill108_14;
    ((javax.crypto.Cipher)(__sourceSpill108_11)).init(((int)(__sourceSpill108_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill108_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation108_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local7_life19 = new java.lang.String[6];
    int local5_life20 = 0;
    java.lang.String local4_life21;
    int local6_life23 = ((java.lang.String)((local4_life21 = "ÿ\002éæìH~\003 \0207+áo. ôóÅ@¹Pq¬Ä¼9Áþ«1ð\017U\032!®y0Î4®î¸-9ÂZtN\023a[¿\báÈATQ¿2N\032F½Ã~PvýÁh\004øÓ½ý\037h,}L(\t{#«dmJñ\\ÊÆ¼T\004ÃÎÓùÀ½XQtî%9*BÕeOxH\031o°ÅgÆ\024ëûup¶Qû\017C½¿H<ùD Dd®\017ÉèÅ)o$&t@G\002Yà[Ôþr\027þf­Ý\020\004=\034®Ã'Ç){ÔÒÆ"))).length();
    int local3_life24 = 80;
    int local2_life25 = -1;
    while (true) {
        local2_life25 += 1;
        byte[] __sourceSpill108_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill108_29 = local0_life9;
        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill108_29)).doFinal(((byte[])(__sourceSpill108_28)));
        java.lang.String __sourceSpill108_34 = ((java.lang.String)(com.moon.ck.a(((byte[])(local8_life31))))).intern();
        java.lang.String[] __sourceSpill108_35 = local7_life19;
        int __sourceSpill108_36 = local5_life20;
        local5_life20 += 1;
        (__sourceSpill108_35)[__sourceSpill108_36] = __sourceSpill108_34;
        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }
        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));
    }
    local6_life23 = ((java.lang.String)((local4_life21 = "Ç&jü<5¦õcá2PÂ¥·0rÙ²üØs\034\0317ã\035[ñWÖ ÈÁË(ÎgóüØßõnýþ¨>}Ê<n¬.BHN'A´3·,ñ\001 Æ\024­c·§­Í´8G6D"))).length();
    local3_life24 = 16;
    local2_life25 = -1;
    while (true) {
        local2_life25 += 1;
        byte[] __sourceSpill108_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill108_43 = local0_life9;
        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill108_43)).doFinal(((byte[])(__sourceSpill108_42)));
        java.lang.String __sourceSpill108_48 = ((java.lang.String)(com.moon.ck.a(((byte[])(local8_life45))))).intern();
        java.lang.String[] __sourceSpill108_49 = local7_life19;
        int __sourceSpill108_50 = local5_life20;
        local5_life20 += 1;
        (__sourceSpill108_49)[__sourceSpill108_50] = __sourceSpill108_48;
        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }
        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));
    }
    f = ((java.lang.String[])(local7_life19));
    g = ((java.lang.String[])(new java.lang.String[6]));
    CONFIG = ((com.moon.ck)(new com.moon.ck(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite108_55(7065, (5254394882466717905L ^ local9_life6)), 0, 0)));
    SCRIPT = ((com.moon.ck)(new com.moon.ck(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite108_57(29462, (691190954301179993L ^ local9_life6)), 1, 1)));
    UNRECOGNIZED = ((com.moon.ck)(new com.moon.ck(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite108_59(24925, (8618237486381455891L ^ local9_life6)), 2, -1)));
    d = ((com.moon.ck[])(com.moon.ck.a__Arrayck()));
    a = ((com.google.protobuf.Internal.EnumLiteMap)(new com.moon.oI()));
    b = ((com.moon.ck[])(com.moon.ck.values()));
}


public static com.moon.ck[] values() {
return ((com.moon.ck[])(((com.moon.ck[])(com.moon.ck.d)).clone()));
}


public static com.moon.ck valueOf(java.lang.String p0) {
return ((com.moon.ck)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.ck.class)), ((java.lang.String)(p0)))));
}


public static com.moon.ck b(int p0) {
long local1 = (com.moon.ck.e ^ 124253089138480L);
    switch (p0) {
case 0:
{
        return com.moon.ck.CONFIG;
    }
case 1:
{
        return com.moon.ck.SCRIPT;
    }
default:
{
        return null;
    }
}
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static com.moon.ck[] a__Arrayck() {
return new com.moon.ck[] {com.moon.ck.CONFIG, com.moon.ck.SCRIPT, com.moon.ck.UNRECOGNIZED};
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30908);
    if (((com.moon.ck.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ck.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ck.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ck", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ck.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ck.g)[life5_8] = com.moon.ck.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ck.g)[life5_8];
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
        byte[] spill131_0 = p0;
        life4_9 += 1;
        life5_44 = (spill131_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill131_1 = p0;
        life4_9 += 1;
        life5_76 = (spill131_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill131_2 = p0;
        life4_9 += 1;
        life5_91 = (spill131_2)[life4_9];
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
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral852_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ck"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ck.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.google.protobuf.Internal.EnumLiteMap<com.moon.ck> a__InternalInnerEnumLiteMap() {
return com.moon.ck.a;
}


public static com.moon.ck a(int p0) {
return com.moon.ck.b(((int)(p0)));
}


public static final com.google.protobuf.Descriptors.EnumDescriptor a() {
return ((com.google.protobuf.Descriptors.EnumDescriptor)(((java.util.List)(((com.google.protobuf.Descriptors.FileDescriptor)(com.moon.oF.a())).getEnumTypes())).get(((int)(0)))));
}


public static com.moon.ck a(com.google.protobuf.Descriptors.EnumValueDescriptor p0) {
com.google.protobuf.Descriptors.EnumValueDescriptor forwardValue30_22_0;
    com.google.protobuf.Descriptors.EnumValueDescriptor spill30_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_27: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (com.moon.ck.e ^ 134137159334907L);
    life3_5 = com.moon.oF.b();
    spill30_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue30_22_0 = spill30_0;
        break forward_join_22;
    }
    if (!((((com.google.protobuf.Descriptors.EnumValueDescriptor)(spill30_0)).getType() != com.moon.ck.a()))) {
        break forward_join_21;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_b46419e975aa_invokedynamic30_4(7464, (1234941289099559708L ^ life1_3)));
    }
    forwardValue30_22_0 = p0;
    }
    if (!((((com.google.protobuf.Descriptors.EnumValueDescriptor)(forwardValue30_22_0)).getIndex() == -1))) {
        break forward_join_27;
    }
    return com.moon.ck.UNRECOGNIZED;
    }
    return (com.moon.ck.b)[((com.google.protobuf.Descriptors.EnumValueDescriptor)(p0)).getIndex()];
}


public final int getNumber() {
com.moon.ck forwardValue31_21_0;
    com.moon.ck spill31_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_21: {
    forward_join_20: {
    life1_3 = (com.moon.ck.e ^ 115467694377941L);
    life3_5 = com.moon.oF.b();
    spill31_0 = this;
    if (!((life3_5 == null))) {
        forwardValue31_21_0 = spill31_0;
        break forward_join_21;
    }
    if (!((spill31_0 == com.moon.ck.UNRECOGNIZED))) {
        break forward_join_20;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_b15453f02f3e_invokedynamic31_3(14278, (4621133929514244573L ^ life1_3)));
    }
    forwardValue31_21_0 = this;
    }
    return ((com.moon.ck)(forwardValue31_21_0)).c;
}


public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
java.lang.Object forwardValue32_25_0;
    com.moon.ck spill32_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_25: {
    forward_join_20: {
    life1_3 = (com.moon.ck.e ^ 34064565852079L);
    life3_5 = com.moon.oF.b();
    spill32_0 = this;
    if (!((life3_5 == null))) {
        forwardValue32_25_0 = spill32_0;
        break forward_join_25;
    }
    if (!((spill32_0 == com.moon.ck.UNRECOGNIZED))) {
        break forward_join_20;
    }
    throw new java.lang.IllegalStateException(__sourceIntrinsic_30dd6e3b67c9_invokedynamic32_3(12796, (4621522568798552984L ^ life1_3)));
    }
    forwardValue32_25_0 = ((java.util.List)(((com.google.protobuf.Descriptors.EnumDescriptor)(com.moon.ck.a())).getValues())).get(((int)(((com.moon.ck)(this)).ordinal())));
    }
    return ((com.google.protobuf.Descriptors.EnumValueDescriptor)(forwardValue32_25_0));
}


public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
return com.moon.ck.a();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite108_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite108_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite108_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b46419e975aa_invokedynamic30_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral852_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b15453f02f3e_invokedynamic31_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_30dd6e3b67c9_invokedynamic32_3(int a0, long a1) throws E;
}
