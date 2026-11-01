package moom;


public class JP {

private static final org.apache.logging.log4j.Logger a;

public static final boolean b;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public JP() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5035395597409394104L)), ((long)(-1852532169489048387L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(263633981323942L)))));

    long local9_life6 = (moom.JP.c ^ 77834876735853L);

    f = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill715_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill715_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill715_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill715_14 = new byte[8];

    (__sourceSpill715_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill715_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation715_16 = __sourceSpill715_14;

    ((javax.crypto.Cipher)(__sourceSpill715_11)).init(((int)(__sourceSpill715_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill715_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation715_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[5];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "±\fvâ®FàØ$:°:ïX\030Lbòü\032ìfÖ\004Ëæ[dÉBÓòÍ¹­y\030\031:ÇDæî\020Â4¦à8ëD\027!\\\034Z<*×\017"))).length();

    int local3_life24 = 16;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill715_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill715_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill715_29)).doFinal(((byte[])(__sourceSpill715_28)));

        java.lang.String __sourceSpill715_34 = ((java.lang.String)(moom.JP.a(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill715_35 = local7_life19;

        int __sourceSpill715_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill715_35)[__sourceSpill715_36] = __sourceSpill715_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "ÙW\025øk!²°Ü\"_\035 ×\\7[©îB çFÎ¿6\017IÕ\007TªÃAR),T`QÇ"))).length();

    local3_life24 = 16;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill715_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill715_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill715_43)).doFinal(((byte[])(__sourceSpill715_42)));

        java.lang.String __sourceSpill715_48 = ((java.lang.String)(moom.JP.a(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill715_49 = local7_life19;

        int __sourceSpill715_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill715_49)[__sourceSpill715_50] = __sourceSpill715_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    d = ((java.lang.String[])(local7_life19));

    e = ((java.lang.String[])(new java.lang.String[5]));

    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));

    b = ((boolean)(((java.lang.String)(java.lang.System.getProperty(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite715_57(19294, (3211644077363186442L ^ local9_life6)))), ((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite715_58(3556, (5175470938511773106L ^ local9_life6))))))).equals(((java.lang.Object)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite715_60(19532, (2377601845210303513L ^ local9_life6)))))));
}


public static void b(java.lang.String p0, java.lang.Throwable p1) {
long local2_life2 = (moom.JP.c ^ 104572918969651L);
    org.apache.logging.log4j.Logger __sourceSpill528_6 = moom.JP.a;
    java.lang.String __stackOp528_7_0 = p0;
    java.lang.String __stackOp528_7_1 = __sourceIntrinsic_92489de8a438_originalDynamicSite528_5(6884, (2583185261797408488L ^ local2_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill528_6)).error(((java.lang.String)(__sourceIntrinsic_92489de8a438_originalDynamicSite528_8(__stackOp528_7_1, __stackOp528_7_0))), ((java.lang.Throwable)(p1)));
    return;
}


public static void b(java.lang.String p0) {
long local1_life2 = (moom.JP.c ^ 91907808745350L);
    org.apache.logging.log4j.Logger __sourceSpill527_6 = moom.JP.a;
    java.lang.String __stackOp527_7_0 = p0;
    java.lang.String __stackOp527_7_1 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite527_5(6884, (2583198949574679645L ^ local1_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill527_6)).info(((java.lang.String)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite527_8(__stackOp527_7_1, __stackOp527_7_0))));
    return;
}


public static void e(java.lang.String p0) {
moom.JP.b(((java.lang.String)(p0)));
    return;
}


public static void c(java.lang.String p0) {
long local1_life2 = (moom.JP.c ^ 115302777856194L);
    org.apache.logging.log4j.Logger __sourceSpill529_6 = moom.JP.a;
    java.lang.String __stackOp529_7_0 = p0;
    java.lang.String __stackOp529_7_1 = __sourceIntrinsic_41b51cd99fcb_originalDynamicSite529_5(737, (8141093590762844953L ^ local1_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill529_6)).warn(((java.lang.String)(__sourceIntrinsic_41b51cd99fcb_originalDynamicSite529_8(__stackOp529_7_1, __stackOp529_7_0))));
    return;
}


public static void d(java.lang.String p0) {
long local1_life2 = (moom.JP.c ^ 71310415833900L);
    org.apache.logging.log4j.Logger __sourceSpill530_6 = moom.JP.a;
    java.lang.String __stackOp530_7_0 = p0;
    java.lang.String __stackOp530_7_1 = __sourceIntrinsic_acbc417da872_originalDynamicSite530_5(6884, (2583182240209199351L ^ local1_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill530_6)).error(((java.lang.String)(__sourceIntrinsic_acbc417da872_originalDynamicSite530_8(__stackOp530_7_1, __stackOp530_7_0))));
    return;
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
        byte[] spill2668_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2668_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2668_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2668_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2668_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2668_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5772);
    if (((moom.JP.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JP.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JP.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JP", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JP.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JP.e)[life5_8] = moom.JP.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JP.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JP.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5152_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(java.lang.String p0) {
long life1_3;
    life1_3 = (moom.JP.c ^ 1618135027786L);
    if (moom.JP.b) {
        org.apache.logging.log4j.Logger spill2302_0 = moom.JP.a;
        java.lang.String __stackOp2302_4_0 = p0;
        java.lang.String __stackOp2302_4_1 = __sourceIntrinsic_474b89cf9bbb_invokedynamic2302_3(6884, (2583112543624518545L ^ life1_3));
        ((org.apache.logging.log4j.Logger)(spill2302_0)).info(((java.lang.String)(__sourceIntrinsic_474b89cf9bbb_invokedynamic2302_5(__stackOp2302_4_1, __stackOp2302_4_0))));
    }
    return;
}


public static void a(java.lang.String p0, java.lang.Throwable p1) {
long local2_life2 = (moom.JP.c ^ 115994416894068L);
    org.apache.logging.log4j.Logger __sourceSpill526_6 = moom.JP.a;
    java.lang.String __stackOp526_7_0 = p0;
    java.lang.String __stackOp526_7_1 = __sourceIntrinsic_b7974476825d_originalDynamicSite526_5(6884, (2583209299543497647L ^ local2_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill526_6)).warn(((java.lang.String)(__sourceIntrinsic_b7974476825d_originalDynamicSite526_8(__stackOp526_7_1, __stackOp526_7_0))), ((java.lang.Throwable)(p1)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite715_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite715_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite715_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_92489de8a438_originalDynamicSite528_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_92489de8a438_originalDynamicSite528_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite527_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite527_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41b51cd99fcb_originalDynamicSite529_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41b51cd99fcb_originalDynamicSite529_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_acbc417da872_originalDynamicSite530_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_acbc417da872_originalDynamicSite530_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5152_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_invokedynamic2302_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_invokedynamic2302_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b7974476825d_originalDynamicSite526_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b7974476825d_originalDynamicSite526_8(java.lang.String a0, java.lang.String a1) throws E;
}
