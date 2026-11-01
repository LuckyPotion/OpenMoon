package moom;


public class Na extends moom.M7 {

private static java.util.regex.Pattern j;

private static java.util.regex.Pattern k;

private static long n;

private static java.lang.String[] s;

private static java.lang.String[] t;

private static java.util.Map u;

public Na(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (java.lang.String[])null, (java.lang.String)null, (java.lang.String)null); }


private static void __sourceConstructorBody_2702a02ce899ccf3(moom.Na receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws Throwable {

long local5 = (moom.Na.n ^ 95026533355328L);

    moom.Na.__sourceConstructorInit_2702a02ce899ccf3_0(((moom.Na)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((java.lang.String[])(new java.lang.String[] {__sourceIntrinsic_2702a02ce899ccf3_originalDynamicSite2497_1(16877, (8934265249192949118L ^ local5)), __sourceIntrinsic_2702a02ce899ccf3_originalDynamicSite2497_2(4314, (4858670143620277325L ^ local5))})), ((java.lang.String)(p2)), ((java.lang.String)(p3)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_2702a02ce899ccf3_0(moom.Na a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String[] a4, java.lang.String a5, java.lang.String a6) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(-709754686497128370L)), ((long)(7120838461658985760L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(166592099440236L)))));

    long local9_life6 = (moom.Na.n ^ 95843134218041L);

    u = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill881_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill881_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill881_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill881_14 = new byte[8];

    (__sourceSpill881_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill881_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation881_16 = __sourceSpill881_14;

    ((javax.crypto.Cipher)(__sourceSpill881_11)).init(((int)(__sourceSpill881_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill881_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation881_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[12];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "Å¢LÏt\\T«OQRpÝ³R(ù.C´.µ3n´<òï\021iUá\033¶XÈOôâ\nÛàV·½9÷I{î%\026\020ªïV'cÁÊÌ$×@\016Ø°(îñg2Ww°_FLS\032k4øs¥\026g\002\007.L\f\007(\001_¿zß³r\005Xm¤\004\177³Ï×ô\f\031\022ÎëâB\fÆ\026ÙíÅ¡r¬\0337ãð÷\\=jl\035¼Ç\017&bz\013\037ÅúLOÔ´\032áíý\021\036Ý:%0\003ò@ÏáÅã\002£·¼¡aºO\003\033?±\003Yá\030Ö²oê%ÇÌ\004\006&jFÚñb\b~h6\020â1Ës{w^¡væ\027k+\020\013Z[ëÆq¶SØ©?¸\023`}\020Î¨À¥\027;\1774C­Ô+ û9¤l¶£0z\024µ\02535#\037\025oo¼h_ßt4/\005"))).length();

    int local3_life24 = 16;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill881_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill881_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill881_29)).doFinal(((byte[])(__sourceSpill881_28)));

        java.lang.String __sourceSpill881_34 = ((java.lang.String)(moom.Na.b(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill881_35 = local7_life19;

        int __sourceSpill881_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill881_35)[__sourceSpill881_36] = __sourceSpill881_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "\\_Ä{AdÎ\"ïvõJÐ·V?\025Í´÷5¤¬\037ÉçÈáá²\024 ú2E¶bÿms\005Y|6ò¿Ï÷­ïR]Ëø%\"\002/SpG89\030Íª÷\000¾\t§5\034¡\013[»\024³¥»\004\\|ËÒ"))).length();

    local3_life24 = 72;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill881_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill881_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill881_43)).doFinal(((byte[])(__sourceSpill881_42)));

        java.lang.String __sourceSpill881_48 = ((java.lang.String)(moom.Na.b(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill881_49 = local7_life19;

        int __sourceSpill881_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill881_49)[__sourceSpill881_50] = __sourceSpill881_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    s = ((java.lang.String[])(local7_life19));

    t = ((java.lang.String[])(new java.lang.String[12]));

    j = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite881_55(6612, (952916712266284348L ^ local9_life6)))))));

    k = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite881_58(21293, (8625535443505543115L ^ local9_life6)))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6654_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Na"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill3359_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3359_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3359_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3359_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3359_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3359_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24904);
    if (((moom.Na.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Na.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Na.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Na", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Na.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Na.t)[life5_8] = moom.Na.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Na.t)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Na.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String b(java.lang.String p0) {
java.lang.String forwardValue2838_16_0;
    java.lang.String forwardValue2838_22_0;
    java.lang.String spill2838_0;
    long life2_3;
    int[] life4_5;
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.Na.n ^ 15909818417578L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2838_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue2838_16_0 = spill2838_0;
        break forward_join_16;
    }
    if (!(moom.Na.e(((java.lang.String)(spill2838_0))))) {
        break forward_join_17;
    }
    forwardValue2838_16_0 = __sourceIntrinsic_73d8ac8b7602_invokedynamic2838_3(12003, (567009430926054555L ^ life2_3));
    }
    forwardValue2838_22_0 = forwardValue2838_16_0;
    break forward_join_22;
    }
    forwardValue2838_22_0 = __sourceIntrinsic_73d8ac8b7602_invokedynamic2838_4(9201, (8256699090570828166L ^ life2_3));
    }
    return forwardValue2838_22_0;
}


public static boolean e(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((java.lang.Boolean.parseBoolean(((java.lang.String)(p0))))) != 0);
}


public boolean c(java.lang.String p0) {
java.util.regex.Matcher forwardValue2839_18_0;
    int[] spill2839_0;
    java.util.regex.Matcher spill2839_1;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Na.n ^ 37547735319303L);
    spill2839_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Na.j)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2839_0;
    spill2839_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2839_18_0 = spill2839_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2839_1)).matches()))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    forwardValue2839_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2839_18_0)).group(((int)(2)));
    return ((java.lang.String)(life6_25)).matches(((java.lang.String)(((moom.Na)(this)).a__String())));
}


public boolean d(java.lang.String p0) {
int forwardValue2840_25_0;
    int[] spill2840_0;
    boolean spill2840_1;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_21;
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.Na.n ^ 51187172705945L);
    spill2840_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Na.k)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2840_0;
    spill2840_1 = ((java.util.regex.Matcher)(life5_8)).matches();
    if (!((life4_9 == null))) {
        forwardValue2840_25_0 = ((spill2840_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill2840_1)) {
        break forward_join_24;
    }
    life6_21 = ((java.util.regex.Matcher)(life5_8)).group(((int)(2)));
    return ((java.lang.String)(life6_21)).equals(((java.lang.Object)(((moom.Na)(this)).a__String())));
    }
    forwardValue2840_25_0 = 0;
    }
    return ((forwardValue2840_25_0) != 0);
}


public boolean d__Boolean() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a(java.lang.String p0) {
java.lang.String forwardValue2836_18_0;
    java.lang.String forwardValue2836_23_0;
    java.lang.String forwardValue2836_25_0;
    int[] spill2836_0;
    java.lang.String spill2836_1;
    long life2_3;
    java.lang.String life5_8;
    int[] life4_9;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Na.n ^ 139093690044534L);
    spill2836_0 = moom.M7.b__ArrayInt();
    life5_8 = super.a(((java.lang.String)(p0)));
    life4_9 = spill2836_0;
    spill2836_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2836_18_0 = spill2836_1;
        break forward_join_18;
    }
    if (!((spill2836_1 != p0))) {
        break forward_join_17;
    }
    forwardValue2836_25_0 = life5_8;
    break forward_join_25;
    }
    forwardValue2836_18_0 = p0;
    }
    if (!((life4_9 == null))) {
        forwardValue2836_23_0 = forwardValue2836_18_0;
        break forward_join_23;
    }
    if (!(moom.Na.e(((java.lang.String)(forwardValue2836_18_0))))) {
        break forward_join_24;
    }
    forwardValue2836_23_0 = moom.JM.a();
    }
    forwardValue2836_25_0 = forwardValue2836_23_0;
    break forward_join_25;
    }
    forwardValue2836_25_0 = moom.JM.b();
    }
    return forwardValue2836_25_0;
}


public static moom.M7 a(java.lang.String p0, java.lang.String p1) {
java.util.regex.Matcher forwardValue2837_18_0;
    java.lang.String forwardValue2837_34_0;
    int forwardValue2837_45_0;
    int forwardValue2837_51_0;
    int forwardValue2837_53_0;
    int[] spill2837_0;
    java.util.regex.Matcher spill2837_1;
    java.lang.String spill2837_2;
    int spill2837_3;
    int spill2837_4;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    java.lang.String life7_29;
    java.lang.String life8_33;
    int life9_59;
    int life10_70;
    java.lang.String life1_78;
    forward_join_71: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_45: {
    forward_join_34: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Na.n ^ 78683145079594L);
    spill2837_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Na.j)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2837_0;
    spill2837_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2837_18_0 = spill2837_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2837_1)).matches()))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue2837_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2837_18_0)).group(((int)(1)));
    life7_29 = ((java.util.regex.Matcher)(life5_8)).group(((int)(2)));
    life8_33 = ((java.util.regex.Matcher)(life5_8)).group(((int)(3)));
    spill2837_2 = life7_29;
    if (!((life4_9 == null))) {
        forwardValue2837_34_0 = spill2837_2;
        break forward_join_34;
    }
    if (!((spill2837_2 != null))) {
        break forward_join_71;
    }
    forwardValue2837_34_0 = life7_29;
    }
    spill2837_3 = ((java.lang.String)(forwardValue2837_34_0)).length();
    if (!((life4_9 == null))) {
        forwardValue2837_45_0 = spill2837_3;
        break forward_join_45;
    }
    if (!((spill2837_3 > 0))) {
        break forward_join_71;
    }
    forwardValue2837_45_0 = ((moom.BU.a(((java.lang.Object)(life6_25)), ((java.lang.Object)(__sourceIntrinsic_5fed00a22b65_invokedynamic2837_9(14604, (4052620234772810227L ^ life2_3)))))) ? 1 : 0);
    }
    life9_59 = forwardValue2837_45_0;
    spill2837_4 = life9_59;
    if (!((life4_9 == null))) {
        forwardValue2837_51_0 = spill2837_4;
        break forward_join_51;
    }
    if (!((spill2837_4 == 0))) {
        break forward_join_52;
    }
    forwardValue2837_51_0 = 1;
    }
    forwardValue2837_53_0 = forwardValue2837_51_0;
    break forward_join_53;
    }
    forwardValue2837_53_0 = 0;
    }
    life10_70 = forwardValue2837_53_0;
    life1_78 = moom.Ob.b(((java.lang.String)(p1)), ((java.lang.String)(__sourceIntrinsic_5fed00a22b65_invokedynamic2837_12(21947, (2467427391805842765L ^ life2_3)))));
    return new moom.Na(life7_29, life8_33, java.lang.String.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life10_70)))), life1_78);
    }
    return null;
}


public java.lang.String g() {
java.lang.String forwardValue2841_29_0;
    java.lang.String forwardValue2841_41_0;
    java.lang.String spill2841_0;
    long life1_3;
    int[] life3_5;
    forward_join_41: {
    forward_join_29: {
    forward_join_27: {
    life1_3 = (moom.Na.n ^ 115590925351384L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2841_0 = ((moom.Na)(this)).d();
    if (!((life3_5 == null))) {
        forwardValue2841_29_0 = spill2841_0;
        break forward_join_29;
    }
    if (!(moom.Na.e(((java.lang.String)(spill2841_0))))) {
        break forward_join_27;
    }
    java.lang.String __stackOp2841_6_0 = ((moom.Na)(this)).a__String();
    java.lang.String __stackOp2841_6_1 = __sourceIntrinsic_dca690bc6996_invokedynamic2841_5(16359, (1792777497524960751L ^ life1_3));
    forwardValue2841_41_0 = __sourceIntrinsic_dca690bc6996_invokedynamic2841_8(__stackOp2841_6_1, __stackOp2841_6_0, __sourceIntrinsic_dca690bc6996_invokedynamic2841_7(20614, (2454092975940571784L ^ life1_3)));
    break forward_join_41;
    }
    forwardValue2841_29_0 = ((moom.Na)(this)).a__String();
    }
    java.lang.String __stackOp2841_11_0 = forwardValue2841_29_0;
    java.lang.String __stackOp2841_11_1 = __sourceIntrinsic_dca690bc6996_invokedynamic2841_10(15360, (4361856623820144134L ^ life1_3));
    forwardValue2841_41_0 = __sourceIntrinsic_dca690bc6996_invokedynamic2841_13(__stackOp2841_11_1, __stackOp2841_11_0, __sourceIntrinsic_dca690bc6996_invokedynamic2841_12(7205, (3935906809070444073L ^ life1_3)));
    }
    return forwardValue2841_41_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2702a02ce899ccf3_originalDynamicSite2497_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2702a02ce899ccf3_originalDynamicSite2497_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite881_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite881_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6654_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2838_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2838_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5fed00a22b65_invokedynamic2837_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5fed00a22b65_invokedynamic2837_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_invokedynamic2841_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_invokedynamic2841_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_invokedynamic2841_8(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_invokedynamic2841_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_invokedynamic2841_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_invokedynamic2841_13(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
