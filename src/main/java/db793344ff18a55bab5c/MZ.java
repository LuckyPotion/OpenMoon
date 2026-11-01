package moom;


public class MZ extends moom.MY {

public static final java.lang.String[] g;

public static final java.lang.String[] h;

private static final long j;

private static final java.lang.String[] n;

private static final java.lang.String[] o;

private static final java.util.Map p;

public MZ(java.lang.String p0, java.lang.String p1, int p2) {
super(p0, moom.MZ.g, p1, moom.MZ.h, p2);
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(1084045480502894184L)), ((long)(-2077499413066056739L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(2232179222549L)))));

    long local9_life6 = (moom.MZ.j ^ 96487347486732L);

    p = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill842_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill842_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill842_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill842_14 = new byte[8];

    (__sourceSpill842_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill842_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation842_16 = __sourceSpill842_14;

    ((javax.crypto.Cipher)(__sourceSpill842_11)).init(((int)(__sourceSpill842_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill842_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation842_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[10];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "ÎÂÉãæ2®ãVh\fÜûù\020\003ñ´ÈçÁ-\t÷_$¾Ç\020AÆpõlYª:Þ3Å@RFA\020õ\032oÍ°ç\fºuRô?t\020Tø\031ÊÌÆ s\0166*#Ú\020JºwÝ\r\f\022×©\"ÞÎ°\"\020}\020ZÃAJ;\004>q\002¯'w\0022À\0202&Ïßß~%ul5'êÝ÷"))).length();

    int local3_life24 = 16;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill842_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill842_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill842_29)).doFinal(((byte[])(__sourceSpill842_28)));

        java.lang.String __sourceSpill842_34 = ((java.lang.String)(moom.MZ.b(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill842_35 = local7_life19;

        int __sourceSpill842_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill842_35)[__sourceSpill842_36] = __sourceSpill842_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "#ÄN\024&_íð¡¥o)2\020DëUCJe£\004jqUtk\035uy"))).length();

    local3_life24 = 16;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill842_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill842_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill842_43)).doFinal(((byte[])(__sourceSpill842_42)));

        java.lang.String __sourceSpill842_48 = ((java.lang.String)(moom.MZ.b(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill842_49 = local7_life19;

        int __sourceSpill842_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill842_49)[__sourceSpill842_50] = __sourceSpill842_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    n = ((java.lang.String[])(local7_life19));

    o = ((java.lang.String[])(new java.lang.String[10]));

    java.lang.String[] __sourceSpill842_56 = new java.lang.String[4];

    (__sourceSpill842_56)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_55(9474, (9079223069622410203L ^ local9_life6));

    (__sourceSpill842_56)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_57(31342, (1200126072451187897L ^ local9_life6));

    (__sourceSpill842_56)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_58(26994, (4127327355520604064L ^ local9_life6));

    (__sourceSpill842_56)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_59(26108, (8770996603684346671L ^ local9_life6));

    g = ((java.lang.String[])(__sourceSpill842_56));

    java.lang.String[] __sourceSpill842_62 = new java.lang.String[4];

    (__sourceSpill842_62)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_61(29832, (2425937798976326232L ^ local9_life6));

    (__sourceSpill842_62)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_63(28349, (1344940602720145512L ^ local9_life6));

    (__sourceSpill842_62)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_64(10702, (728224015861192472L ^ local9_life6));

    (__sourceSpill842_62)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_65(24913, (8690919001428909961L ^ local9_life6));

    h = ((java.lang.String[])(__sourceSpill842_62));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6362_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill3190_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3190_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3190_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3190_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3190_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3190_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13713);
    if (((moom.MZ.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.MZ.p)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.MZ.p)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/MZ", life9_51);
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
        life9_116 = ((java.lang.String)((moom.MZ.n)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.MZ.o)[life5_8] = moom.MZ.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.MZ.o)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.MZ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__sourceReturn_aae029aa0a() {
int forwardValue2702_13_0;
    int forwardValue2702_15_0;
    int spill2702_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.MZ.j ^ 37030016752146L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2702_0 = __sourceIntrinsic_booleanToInteger(__sourceIntrinsic_integerToBoolean(((moom.MZ)(this)).a()));
    if (!((life3_5 == null))) {
        forwardValue2702_13_0 = spill2702_0;
        break forward_join_13;
    }
    if (!((spill2702_0 == 1))) {
        break forward_join_14;
    }
    forwardValue2702_13_0 = 1;
    }
    forwardValue2702_15_0 = forwardValue2702_13_0;
    break forward_join_15;
    }
    forwardValue2702_15_0 = 0;
    }
    return ((forwardValue2702_15_0) != 0);
}


public boolean c__sourceReturn_aae029aa0a() {
int forwardValue2703_13_0;
    int forwardValue2703_15_0;
    int spill2703_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.MZ.j ^ 123927206017304L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2703_0 = __sourceIntrinsic_booleanToInteger(__sourceIntrinsic_integerToBoolean(((moom.MZ)(this)).a()));
    if (!((life3_5 == null))) {
        forwardValue2703_13_0 = spill2703_0;
        break forward_join_13;
    }
    if (!((spill2703_0 == 2))) {
        break forward_join_14;
    }
    forwardValue2703_13_0 = 1;
    }
    forwardValue2703_15_0 = forwardValue2703_13_0;
    break forward_join_15;
    }
    forwardValue2703_15_0 = 0;
    }
    return ((forwardValue2703_15_0) != 0);
}


public boolean d__sourceReturn_aae029aa0a() {
int forwardValue2704_13_0;
    int forwardValue2704_15_0;
    int spill2704_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.MZ.j ^ 84624286395926L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2704_0 = __sourceIntrinsic_booleanToInteger(__sourceIntrinsic_integerToBoolean(((moom.MZ)(this)).a()));
    if (!((life3_5 == null))) {
        forwardValue2704_13_0 = spill2704_0;
        break forward_join_13;
    }
    if (!((spill2704_0 == 3))) {
        break forward_join_14;
    }
    forwardValue2704_13_0 = 1;
    }
    forwardValue2704_15_0 = forwardValue2704_13_0;
    break forward_join_15;
    }
    forwardValue2704_15_0 = 0;
    }
    return ((forwardValue2704_15_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__sourceReturn_aae029aa0a() {
int forwardValue2700_12_0;
    int forwardValue2700_14_0;
    int spill2700_0;
    long life1_3;
    int[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.MZ.j ^ 68310966736524L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2700_0 = __sourceIntrinsic_booleanToInteger(__sourceIntrinsic_integerToBoolean(((moom.MZ)(this)).a()));
    if (!((life3_5 == null))) {
        forwardValue2700_12_0 = spill2700_0;
        break forward_join_12;
    }
    if (!((spill2700_0 == 0))) {
        break forward_join_13;
    }
    forwardValue2700_12_0 = 1;
    }
    forwardValue2700_14_0 = forwardValue2700_12_0;
    break forward_join_14;
    }
    forwardValue2700_14_0 = 0;
    }
    return ((forwardValue2700_14_0) != 0);
}


public boolean a(java.lang.String p0) {
int forwardValue2701_25_0;
    boolean spill2701_0;
    long life2_3;
    int[] life4_5;
    forward_join_25: {
    forward_join_22: {
    life2_3 = (moom.MZ.j ^ 86907284630283L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2701_0 = moom.BU.a(((java.lang.Object)(p0)), ((java.lang.Object)(__sourceIntrinsic_4b5a4712eca9_invokedynamic2701_2(27318, (2319023868230041445L ^ life2_3)))));
    if (!((life4_5 == null))) {
        forwardValue2701_25_0 = ((spill2701_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill2701_0)) {
        break forward_join_22;
    }
    p0 = __sourceIntrinsic_4b5a4712eca9_invokedynamic2701_5(26174, (4992129789440783336L ^ life2_3));
    }
    forwardValue2701_25_0 = ((super.a(((java.lang.String)(p0)))) ? 1 : 0);
    }
    return ((forwardValue2701_25_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite842_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6362_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic2701_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b5a4712eca9_invokedynamic2701_5(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
