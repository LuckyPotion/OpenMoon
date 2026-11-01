package moom;


public class Nd extends moom.Nc {

private java.lang.String k;

private static final java.util.regex.Pattern l;

private static final long o;

private static final java.lang.String[] v;

private static final java.lang.String[] w;

private static final java.util.Map x;

public Nd(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String[] p4, java.lang.String p5) {
super(p0, p2, p3, p4, p5);
    this.k = null;
    this.k = p1;
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-2906028803191538923L)), ((long)(5078897329460753484L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(62441133138204L)))));

    long local9_life6 = (moom.Nd.o ^ 88436092179698L);

    x = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill884_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill884_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill884_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill884_14 = new byte[8];

    (__sourceSpill884_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill884_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation884_16 = __sourceSpill884_14;

    ((javax.crypto.Cipher)(__sourceSpill884_11)).init(((int)(__sourceSpill884_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill884_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation884_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[5];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "y×âË*ÄgÅ0¡L)Ä³KÚs\021)â­ÿñâ\\\000å(ûZóÕã\013\bà]\"\022k»Só\002\020ðÿÄÅ©\002ñ~XÒ.\031>\006{ç7L*\025á\021½mû[ÝÇD\027\002,ï`Ð\026Èg¹ºà\037Ûþ>Ða÷íëïËps\027°\027t´ôÇ-{$\035\025ªÂRÉù\021\b\0056´ÿ7É\002î_]®Õ\023i>¨ÇïÝmù\"bÞ­DÖ\177 iîäòx²\031\005VÞVJ\023ñÄx4UC¨¡ÈËá¼ç(Õ"))).length();

    int local3_life24 = 32;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill884_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill884_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill884_29)).doFinal(((byte[])(__sourceSpill884_28)));

        java.lang.String __sourceSpill884_34 = ((java.lang.String)(moom.Nd.c(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill884_35 = local7_life19;

        int __sourceSpill884_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill884_35)[__sourceSpill884_36] = __sourceSpill884_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "BÆ'Øp÷Â\030N£0æn\031á\020ü#Ç\025\002Q.¼y\034+»#"))).length();

    local3_life24 = 16;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill884_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill884_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill884_43)).doFinal(((byte[])(__sourceSpill884_42)));

        java.lang.String __sourceSpill884_48 = ((java.lang.String)(moom.Nd.c(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill884_49 = local7_life19;

        int __sourceSpill884_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill884_49)[__sourceSpill884_50] = __sourceSpill884_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    v = ((java.lang.String[])(local7_life19));

    w = ((java.lang.String[])(new java.lang.String[5]));

    l = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite884_55(12879, (3489961362309117418L ^ local9_life6)))))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static moom.M7 b(java.lang.String p0, java.lang.String p1) {
java.util.regex.Matcher forwardValue2848_18_0;
    java.lang.String forwardValue2848_54_0;
    java.lang.String forwardValue2848_62_0;
    java.lang.String forwardValue2848_73_0;
    int[] spill2848_0;
    java.util.regex.Matcher spill2848_1;
    java.lang.String spill2848_2;
    java.lang.String spill2848_3;
    java.lang.String spill2848_4;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    java.lang.String life7_29;
    java.lang.String life8_33;
    java.lang.String life9_37;
    java.lang.String life10_42;
    java.lang.String[] life11_70;
    java.lang.String life1_96;
    forward_join_84: {
    forward_join_73: {
    forward_join_62: {
    forward_join_54: {
    forward_join_53: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Nd.o ^ 18810721341388L);
    spill2848_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Nd.l)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2848_0;
    spill2848_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2848_18_0 = spill2848_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2848_1)).matches()))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue2848_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2848_18_0)).group(((int)(1)));
    life7_29 = ((java.util.regex.Matcher)(life5_8)).group(((int)(2)));
    life8_33 = ((java.util.regex.Matcher)(life5_8)).group(((int)(3)));
    life9_37 = ((java.util.regex.Matcher)(life5_8)).group(((int)(4)));
    life10_42 = moom.Ob.d(((java.lang.String)(life9_37)), ((java.lang.String)("[")), ((java.lang.String)("]")));
    spill2848_2 = life10_42;
    if (!((life4_9 == null))) {
        forwardValue2848_54_0 = spill2848_2;
        break forward_join_54;
    }
    if (!((spill2848_2 != null))) {
        break forward_join_53;
    }
    spill2848_3 = life10_42;
    if (!((life4_9 == null))) {
        forwardValue2848_54_0 = spill2848_3;
        break forward_join_54;
    }
    if (!((((java.lang.String)(spill2848_3)).length() > 0))) {
        break forward_join_53;
    }
    life9_37 = ((java.lang.String)(((java.lang.String)(life9_37)).replace(((java.lang.CharSequence)(life10_42)), ((java.lang.CharSequence)(""))))).trim();
    }
    forwardValue2848_54_0 = life8_33;
    }
    life11_70 = moom.Nd.a__ArrayString(((java.lang.String)(forwardValue2848_54_0)), ((java.lang.String)(life10_42)));
    spill2848_4 = life7_29;
    if (!((life4_9 == null))) {
        forwardValue2848_62_0 = spill2848_4;
        break forward_join_62;
    }
    if (!((spill2848_4 != null))) {
        break forward_join_84;
    }
    forwardValue2848_62_0 = life7_29;
    }
    if (!((life4_9 == null))) {
        forwardValue2848_73_0 = forwardValue2848_62_0;
        break forward_join_73;
    }
    if (!((((java.lang.String)(forwardValue2848_62_0)).length() > 0))) {
        break forward_join_84;
    }
    forwardValue2848_73_0 = moom.Ob.b(((java.lang.String)(p1)), ((java.lang.String)(__sourceIntrinsic_c6e426a1f159_invokedynamic2848_15(21655, (8061018526994040846L ^ life2_3)))));
    }
    life1_96 = forwardValue2848_73_0;
    return new moom.Nd(life7_29, life6_25, life9_37, life8_33, life11_70, life1_96);
    }
    return null;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral6676_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Nd.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18146);
    if (((moom.Nd.w)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Nd.x)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Nd.x)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Nd", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Nd.v)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Nd.w)[life5_8] = moom.Nd.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Nd.w)[life5_8];
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill3373_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3373_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3373_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3373_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3373_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3373_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean c(java.lang.String p0) {
java.util.regex.Matcher forwardValue2849_18_0;
    int[] spill2849_0;
    java.util.regex.Matcher spill2849_1;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Nd.o ^ 112736303008813L);
    spill2849_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Nd.l)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2849_0;
    spill2849_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2849_18_0 = spill2849_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2849_1)).matches()))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    forwardValue2849_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2849_18_0)).group(((int)(2)));
    return ((java.lang.String)(life6_25)).matches(((java.lang.String)(((moom.Nd)(this)).a__String())));
}


public java.lang.String g() {
long local1 = (moom.Nd.o ^ 50092877625074L);
    java.lang.String __sourceSpill2017_5 = this.k;
    java.lang.String __sourceSpill2017_6 = ((moom.Nd)(this)).a__String();
    java.lang.String __sourceSpill2017_7 = ((moom.Nd)(this)).d();
    java.lang.String local3 = ((moom.Nd)(this)).d();
    java.lang.String local4 = __sourceSpill2017_7;
    java.lang.String local5 = __sourceSpill2017_6;
    java.lang.String local6 = __sourceSpill2017_5;
    return __sourceIntrinsic_dca690bc6996_originalDynamicSite2017_11(__sourceIntrinsic_dca690bc6996_originalDynamicSite2017_8(30163, (6563137058943340656L ^ local1)), local6, " ", local5, __sourceIntrinsic_dca690bc6996_originalDynamicSite2017_9(30171, (7800477447214010495L ^ local1)), local4, __sourceIntrinsic_dca690bc6996_originalDynamicSite2017_10(13166, (6948417068178593480L ^ local1)), local3);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite884_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c6e426a1f159_invokedynamic2848_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral6676_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2017_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2017_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2017_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2017_11(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7) throws E;
}
