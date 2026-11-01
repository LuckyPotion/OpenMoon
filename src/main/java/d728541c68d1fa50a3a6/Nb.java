package moom;


public class Nb extends moom.Na {

private static final java.util.regex.Pattern l;

private static final long o;

private static final java.lang.String[] v;

private static final java.lang.String[] w;

private static final java.util.Map x;

public Nb(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
super(p0, p1, p2, p3);
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(6123814749149578796L)), ((long)(8174003283853659273L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116204730924046L)))));

    long local9_life6 = (moom.Nb.o ^ 14488882991421L);

    x = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill882_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill882_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill882_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill882_14 = new byte[8];

    (__sourceSpill882_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill882_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation882_16 = __sourceSpill882_14;

    ((javax.crypto.Cipher)(__sourceSpill882_11)).init(((int)(__sourceSpill882_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill882_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation882_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[5];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "ßòNÁ(-ö\030ûr²GsC×#\021²ï\037 ÁbåD\t\020ÂsZ\030\004Xû\032\001÷w\036\000\030Ì,ºb´±ù/£IÑ\037ah@g\006ç~Ð«K"))).length();

    int local3_life24 = 32;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill882_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill882_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill882_29)).doFinal(((byte[])(__sourceSpill882_28)));

        java.lang.String __sourceSpill882_34 = ((java.lang.String)(moom.Nb.c(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill882_35 = local7_life19;

        int __sourceSpill882_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill882_35)[__sourceSpill882_36] = __sourceSpill882_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "*\0304îóõj\026\003\000à\033qØ#-¯rºv\024(ø-NGúÐïtÙYphýÇüÿ\003ÓªxTÙªCßeÉ9µ\032$u~fjÐ7£-4®ÞÂEé»«gðo\037ÞK\001CJ?°ãÅ:^xò\024zgÆs[/\006.M\026dÕ\030­»N\\ÛçíäM´\036@\032&ÌBÞÛ\001vdc\004üÎïÂ\017n×£ÏQ7\006Ø"))).length();

    local3_life24 = 40;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill882_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill882_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill882_43)).doFinal(((byte[])(__sourceSpill882_42)));

        java.lang.String __sourceSpill882_48 = ((java.lang.String)(moom.Nb.c(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill882_49 = local7_life19;

        int __sourceSpill882_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill882_49)[__sourceSpill882_50] = __sourceSpill882_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    v = ((java.lang.String[])(local7_life19));

    w = ((java.lang.String[])(new java.lang.String[5]));

    l = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite882_55(24713, (5307512766467881049L ^ local9_life6)))))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static moom.M7 b(java.lang.String p0, java.lang.String p1) {
java.util.regex.Matcher forwardValue2842_18_0;
    java.lang.String forwardValue2842_34_0;
    java.lang.String forwardValue2842_45_0;
    int[] spill2842_0;
    java.util.regex.Matcher spill2842_1;
    java.lang.String spill2842_2;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    java.lang.String life7_29;
    java.lang.String life8_33;
    java.lang.String life1_59;
    moom.Nb life9_67;
    forward_join_59: {
    forward_join_45: {
    forward_join_34: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Nb.o ^ 6496304335092L);
    spill2842_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Nb.l)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2842_0;
    spill2842_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2842_18_0 = spill2842_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2842_1)).matches()))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue2842_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2842_18_0)).group(((int)(1)));
    life7_29 = ((java.util.regex.Matcher)(life5_8)).group(((int)(2)));
    life8_33 = ((java.util.regex.Matcher)(life5_8)).group(((int)(3)));
    spill2842_2 = life6_25;
    if (!((life4_9 == null))) {
        forwardValue2842_34_0 = spill2842_2;
        break forward_join_34;
    }
    if (!((spill2842_2 != null))) {
        break forward_join_59;
    }
    forwardValue2842_34_0 = life6_25;
    }
    if (!((life4_9 == null))) {
        forwardValue2842_45_0 = forwardValue2842_34_0;
        break forward_join_45;
    }
    if (!((((java.lang.String)(forwardValue2842_34_0)).length() > 0))) {
        break forward_join_59;
    }
    forwardValue2842_45_0 = moom.Ob.b(((java.lang.String)(p1)), ((java.lang.String)(__sourceIntrinsic_c6e426a1f159_invokedynamic2842_9(20485, (2909604218372346136L ^ life2_3)))));
    }
    life1_59 = forwardValue2842_45_0;
    life9_67 = new moom.Nb(life6_25, life8_33, life7_29, life1_59);
    ((moom.M7)(life9_67)).b(((boolean)(false)));
    return life9_67;
    }
    return null;
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
        byte[] spill3365_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3365_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3365_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3365_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3365_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3365_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18100);
    if (((moom.Nb.w)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Nb.x)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Nb.x)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Nb", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Nb.v)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Nb.w)[life5_8] = moom.Nb.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Nb.w)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Nb.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral6666_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean c(java.lang.String p0) {
java.util.regex.Matcher forwardValue2843_18_0;
    int[] spill2843_0;
    java.util.regex.Matcher spill2843_1;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Nb.o ^ 25716475565767L);
    spill2843_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Nb.l)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2843_0;
    spill2843_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2843_18_0 = spill2843_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2843_1)).matches()))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    forwardValue2843_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2843_18_0)).group(((int)(1)));
    return ((java.lang.String)(life6_25)).matches(((java.lang.String)(((moom.Nb)(this)).a__String())));
}


public boolean d__Boolean() {
return ((0) != 0);
}


public java.lang.String g() {
long local1 = (moom.Nb.o ^ 101587955641368L);
    java.lang.String __sourceSpill2011_4 = ((moom.Nb)(this)).a__String();
    java.lang.String __sourceSpill2011_5 = ((moom.Nb)(this)).d();
    java.lang.String local3 = ((moom.Nb)(this)).d();
    java.lang.String local4 = __sourceSpill2011_5;
    java.lang.String local5 = __sourceSpill2011_4;
    return __sourceIntrinsic_dca690bc6996_originalDynamicSite2011_9(__sourceIntrinsic_dca690bc6996_originalDynamicSite2011_6(1988, (244427989936235063L ^ local1)), local5, __sourceIntrinsic_dca690bc6996_originalDynamicSite2011_7(21671, (5013993911772131671L ^ local1)), local4, __sourceIntrinsic_dca690bc6996_originalDynamicSite2011_8(321, (5474780222280656051L ^ local1)), local3);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite882_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c6e426a1f159_invokedynamic2842_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral6666_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2011_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2011_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2011_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2011_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws E;
}
