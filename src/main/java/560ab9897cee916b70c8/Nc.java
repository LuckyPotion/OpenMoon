package moom;


public class Nc extends moom.M7 {

private static java.util.regex.Pattern j;

private static long n;

private static java.lang.String[] s;

private static java.lang.String[] t;

private static java.util.Map u;

public Nc(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (java.lang.String[])null, (java.lang.String)null, (java.lang.String)null); }


private static void __sourceConstructorBody_fec250fca0b5acc1(moom.Nc receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) throws Throwable {

moom.Nc __initValue603_23_0;

    int __initValue603_23_1;

    moom.Nc __initValue603_24_0;

    moom.Nc __initValue603_25_0;

    int __initValue603_25_1;

    init_join_25: {

    init_join_24: {

    init_join_23: {

    long local6_life2 = (moom.Nc.n ^ 85897915370675L);

    int[] __sourceSpill603_4 = moom.M7.b__ArrayInt();

    moom.Nc.__sourceConstructorInit_fec250fca0b5acc1_0(((moom.Nc)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((java.lang.String[])(p3)), ((java.lang.String)(p2)), ((java.lang.String)(p4)));

    int[] local8_life6 = __sourceSpill603_4;

    moom.Nc __sourceSpill603_8 = receiver;

    int __sourceSpill603_9 = (((moom.Nc)(receiver)).b__ArrayString()).length;

    if (!((local8_life6 == null))) {

        __initValue603_23_0 = __sourceSpill603_8;

        __initValue603_23_1 = __sourceSpill603_9;

        break init_join_23;

    }

    if (!((__sourceSpill603_9 > 1))) {

        __initValue603_24_0 = __sourceSpill603_8;

        break init_join_24;

    }

    __initValue603_23_0 = __sourceSpill603_8;

    __initValue603_23_1 = 1;

    }

    __initValue603_25_0 = __initValue603_23_0;

    __initValue603_25_1 = __initValue603_23_1;

    break init_join_25;

    }

    __initValue603_25_0 = __initValue603_24_0;

    __initValue603_25_1 = 0;

    }

    ((moom.Nc)(__initValue603_25_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((__initValue603_25_1))));

    return;

}



static {
n = ((long)(((moom._a)(moom._c.a(((long)(1410334049046506129L)), ((long)(713178625515828064L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(245954868104636L)))));

    long local9_life6 = (moom.Nc.n ^ 138364789001840L);

    u = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life9;

    javax.crypto.Cipher __sourceSpill883_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill883_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill883_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill883_14 = new byte[8];

    (__sourceSpill883_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));

    int local1_life15 = 1;

    while ((local1_life15 < 8)) {

        (__sourceSpill883_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));

        local1_life15 += 1;

    }

    byte[] __sourcePreallocation883_16 = __sourceSpill883_14;

    ((javax.crypto.Cipher)(__sourceSpill883_11)).init(((int)(__sourceSpill883_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill883_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation883_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local7_life19 = new java.lang.String[10];

    int local5_life20 = 0;

    java.lang.String local4_life21;

    int local6_life23 = ((java.lang.String)((local4_life21 = "ïOWzEMÖsÞ\"\005\tÅ \004­H#[}¬\r|Û+îË}ú´ù\013\000µX~ßï\001/X+Ür\020ç©-á÷Îu\017\024\024\031\fêDÓXÖÓW-eâÐHÝ^õ7Â)ò\007S2\023> \004e´új$ÃÁâTP¨WpG\"ÁÆÀx¸¬rM\004Fá=\001ølÛýö§?úü5|ÓàT9+|®Ó|îÍé1ØþL\020\020RjÍLØñok´olVJá x-ÚOB]\035\n\022\177Ã1\021é\f\021V½>AKÛ¥¨À+(·¸¡m\001Í~³Ã \031\027[«½)¾NÏÚX{ð[¦=ü¥\033}ºåÐ\027\034Ò\020wö(ý9Ë76þ±C¤kh"))).length();

    int local3_life24 = 16;

    int local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill883_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill883_29 = local0_life9;

        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill883_29)).doFinal(((byte[])(__sourceSpill883_28)));

        java.lang.String __sourceSpill883_34 = ((java.lang.String)(moom.Nc.b(((byte[])(local8_life31))))).intern();

        java.lang.String[] __sourceSpill883_35 = local7_life19;

        int __sourceSpill883_36 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill883_35)[__sourceSpill883_36] = __sourceSpill883_34;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    local6_life23 = ((java.lang.String)((local4_life21 = "Ùww1Ñh5Û\013(ÁQ\0202Ì®fÚ\003ÛïÍE\b_©Ø"))).length();

    local3_life24 = 16;

    local2_life25 = -1;

    while (true) {

        local2_life25 += 1;

        byte[] __sourceSpill883_42 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill883_43 = local0_life9;

        byte[] local8_life45 = ((javax.crypto.Cipher)(__sourceSpill883_43)).doFinal(((byte[])(__sourceSpill883_42)));

        java.lang.String __sourceSpill883_48 = ((java.lang.String)(moom.Nc.b(((byte[])(local8_life45))))).intern();

        java.lang.String[] __sourceSpill883_49 = local7_life19;

        int __sourceSpill883_50 = local5_life20;

        local5_life20 += 1;

        (__sourceSpill883_49)[__sourceSpill883_50] = __sourceSpill883_48;

        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }

        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));

    }

    s = ((java.lang.String[])(local7_life19));

    t = ((java.lang.String[])(new java.lang.String[10]));

    j = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite883_55(5231, (5155858162091846339L ^ local9_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_fec250fca0b5acc1_0(moom.Nc a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String[] a4, java.lang.String a5, java.lang.String a6) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6668_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill3369_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3369_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3369_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3369_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3369_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3369_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9270);
    if (((moom.Nc.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Nc.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Nc.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Nc", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Nc.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Nc.t)[life5_8] = moom.Nc.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Nc.t)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Nc.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String b(java.lang.String p0) {
int forwardValue2846_28_0;
    java.lang.String forwardValue2846_34_0;
    java.lang.String forwardValue2846_40_0;
    int[] spill2846_0;
    boolean spill2846_1;
    java.lang.String spill2846_2;
    long life2_3;
    java.lang.String life5_7;
    int[] life4_8;
    forward_join_40: {
    forward_join_35: {
    forward_join_34: {
    forward_join_28: {
    life2_3 = (moom.Nc.n ^ 49190081875934L);
    spill2846_0 = moom.M7.b__ArrayInt();
    life5_7 = ((java.lang.String)(p0)).toLowerCase();
    life4_8 = spill2846_0;
    spill2846_1 = ((java.lang.String)(life5_7)).equals(((java.lang.Object)(__sourceIntrinsic_73d8ac8b7602_invokedynamic2846_3(9636, (1901642044559399596L ^ life2_3)))));
    if (!((life4_8 == null))) {
        forwardValue2846_28_0 = ((spill2846_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill2846_1))) {
        break forward_join_35;
    }
    spill2846_2 = life5_7;
    if (!((life4_8 == null))) {
        forwardValue2846_34_0 = spill2846_2;
        break forward_join_34;
    }
    forwardValue2846_28_0 = ((((java.lang.String)(spill2846_2)).equals(((java.lang.Object)(__sourceIntrinsic_73d8ac8b7602_invokedynamic2846_6(27883, (810801865832518638L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2846_28_0 == 0))) {
        break forward_join_35;
    }
    forwardValue2846_34_0 = __sourceIntrinsic_73d8ac8b7602_invokedynamic2846_9(23747, (7171182314881573834L ^ life2_3));
    }
    forwardValue2846_40_0 = forwardValue2846_34_0;
    break forward_join_40;
    }
    forwardValue2846_40_0 = __sourceIntrinsic_73d8ac8b7602_invokedynamic2846_10(11600, (3974649815575433809L ^ life2_3));
    }
    return forwardValue2846_40_0;
}


public boolean c(java.lang.String p0) {
java.util.regex.Matcher forwardValue2847_18_0;
    int[] spill2847_0;
    java.util.regex.Matcher spill2847_1;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Nc.n ^ 974909672819L);
    spill2847_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Nc.j)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2847_0;
    spill2847_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2847_18_0 = spill2847_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2847_1)).matches()))) {
        break forward_join_17;
    }
    return ((0) != 0);
    }
    forwardValue2847_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2847_18_0)).group(((int)(1)));
    return ((java.lang.String)(life6_25)).matches(((java.lang.String)(((moom.Nc)(this)).a__String())));
}


public java.lang.String a(java.lang.String p0) {
long local2_life2 = (moom.Nc.n ^ 101455645400578L);
    java.lang.String __stackOp604_6_0 = ((moom.Nc)(this)).a__String();
    java.lang.String __stackOp604_6_1 = __sourceIntrinsic_c43bc540f167_originalDynamicSite604_5(28200, (5054800248402690290L ^ local2_life2));
    java.lang.String local4_life9 = moom.MP.a(((java.lang.String)(__sourceIntrinsic_c43bc540f167_originalDynamicSite604_7(__stackOp604_6_1, __stackOp604_6_0))), ((java.lang.String)("")));
    java.lang.String local5_life11 = super.a(((java.lang.String)(p0)));
    java.lang.String __stackOp604_15_0 = ((moom.Nc)(this)).a__String();
    java.lang.String __stackOp604_15_1 = __sourceIntrinsic_c43bc540f167_originalDynamicSite604_14(18374, (2070525680364579097L ^ local2_life2));
    java.lang.String local6_life18 = moom.MP.a(((java.lang.String)(__sourceIntrinsic_c43bc540f167_originalDynamicSite604_16(__stackOp604_15_1, __stackOp604_15_0))), ((java.lang.String)("")));
    return __sourceIntrinsic_c43bc540f167_originalDynamicSite604_19(local4_life9, local5_life11, local6_life18);
}


public static java.lang.String[] a__ArrayString(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2845_34_0;
    java.lang.String forwardValue2845_41_0;
    int forwardValue2845_57_0;
    java.lang.String[] forwardValue2845_65_0;
    int[] spill2845_0;
    java.lang.String spill2845_1;
    int spill2845_2;
    java.lang.String[] spill2845_3;
    long life2_3;
    java.lang.String[] life5_11;
    int[] life4_12;
    java.lang.String life1_26;
    java.lang.String life1_30;
    java.lang.String life1_34;
    java.lang.String[] life6_53;
    forward_join_65: {
    forward_join_64: {
    forward_join_57: {
    forward_join_51: {
    forward_join_41: {
    forward_join_40: {
    forward_join_34: {
    forward_join_19: {
    life2_3 = (moom.Nc.n ^ 22172550488338L);
    spill2845_0 = moom.M7.b__ArrayInt();
    life5_11 = new java.lang.String[] {p0};
    life4_12 = spill2845_0;
    spill2845_1 = p1;
    if (!((life4_12 == null))) {
        forwardValue2845_34_0 = spill2845_1;
        break forward_join_34;
    }
    if (!((spill2845_1 == null))) {
        break forward_join_19;
    }
    return life5_11;
    }
    life1_26 = ((java.lang.String)(p1)).trim();
    life1_30 = moom.Ob.b(((java.lang.String)(life1_26)), ((java.lang.String)("[")));
    life1_34 = moom.Ob.c(((java.lang.String)(life1_30)), ((java.lang.String)("]")));
    p1 = ((java.lang.String)(life1_34)).trim();
    forwardValue2845_34_0 = p1;
    }
    if (!((life4_12 == null))) {
        forwardValue2845_41_0 = forwardValue2845_34_0;
        break forward_join_41;
    }
    if (!((((java.lang.String)(forwardValue2845_34_0)).length() == 0))) {
        break forward_join_40;
    }
    return life5_11;
    }
    forwardValue2845_41_0 = p1;
    }
    life6_53 = moom.BU.a__ArrayString(((java.lang.String)(forwardValue2845_41_0)), ((java.lang.String)(" ")));
    spill2845_2 = (life6_53).length;
    if (!((life4_12 == null))) {
        forwardValue2845_57_0 = spill2845_2;
        break forward_join_57;
    }
    if (!((spill2845_2 == 0))) {
        break forward_join_51;
    }
    return life5_11;
    }
    spill2845_3 = life6_53;
    if (!((life4_12 == null))) {
        forwardValue2845_65_0 = spill2845_3;
        break forward_join_65;
    }
    forwardValue2845_57_0 = ((((java.util.List)(java.util.Arrays.asList(((java.lang.Object[])(spill2845_3))))).contains(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue2845_57_0 == 0))) {
        break forward_join_64;
    }
    life6_53 = ((java.lang.String[])(moom.BU.a(((java.lang.Object[])(life6_53)), ((java.lang.Object)(p0)), ((int)(0)))));
    }
    forwardValue2845_65_0 = life6_53;
    }
    return forwardValue2845_65_0;
}


public static moom.M7 a(java.lang.String p0, java.lang.String p1) {
java.util.regex.Matcher forwardValue2844_18_0;
    java.lang.String forwardValue2844_50_0;
    java.lang.String forwardValue2844_58_0;
    java.lang.String forwardValue2844_69_0;
    int[] spill2844_0;
    java.util.regex.Matcher spill2844_1;
    java.lang.String spill2844_2;
    java.lang.String spill2844_3;
    java.lang.String spill2844_4;
    long life2_3;
    java.util.regex.Matcher life5_8;
    int[] life4_9;
    java.lang.String life6_25;
    java.lang.String life7_29;
    java.lang.String life8_33;
    java.lang.String life9_38;
    java.lang.String[] life10_66;
    java.lang.String life1_92;
    forward_join_79: {
    forward_join_69: {
    forward_join_58: {
    forward_join_50: {
    forward_join_49: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Nc.n ^ 34433143687776L);
    spill2844_0 = moom.M7.b__ArrayInt();
    life5_8 = ((java.util.regex.Pattern)(moom.Nc.j)).matcher(((java.lang.CharSequence)(p0)));
    life4_9 = spill2844_0;
    spill2844_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue2844_18_0 = spill2844_1;
        break forward_join_18;
    }
    if (!((!((java.util.regex.Matcher)(spill2844_1)).matches()))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue2844_18_0 = life5_8;
    }
    life6_25 = ((java.util.regex.Matcher)(forwardValue2844_18_0)).group(((int)(1)));
    life7_29 = ((java.util.regex.Matcher)(life5_8)).group(((int)(2)));
    life8_33 = ((java.util.regex.Matcher)(life5_8)).group(((int)(3)));
    life9_38 = moom.Ob.d(((java.lang.String)(life8_33)), ((java.lang.String)("[")), ((java.lang.String)("]")));
    spill2844_2 = life9_38;
    if (!((life4_9 == null))) {
        forwardValue2844_50_0 = spill2844_2;
        break forward_join_50;
    }
    if (!((spill2844_2 != null))) {
        break forward_join_49;
    }
    spill2844_3 = life9_38;
    if (!((life4_9 == null))) {
        forwardValue2844_50_0 = spill2844_3;
        break forward_join_50;
    }
    if (!((((java.lang.String)(spill2844_3)).length() > 0))) {
        break forward_join_49;
    }
    life8_33 = ((java.lang.String)(((java.lang.String)(life8_33)).replace(((java.lang.CharSequence)(life9_38)), ((java.lang.CharSequence)(""))))).trim();
    }
    forwardValue2844_50_0 = life7_29;
    }
    life10_66 = moom.Nc.a__ArrayString(((java.lang.String)(forwardValue2844_50_0)), ((java.lang.String)(life9_38)));
    spill2844_4 = life6_25;
    if (!((life4_9 == null))) {
        forwardValue2844_58_0 = spill2844_4;
        break forward_join_58;
    }
    if (!((spill2844_4 != null))) {
        break forward_join_79;
    }
    forwardValue2844_58_0 = life6_25;
    }
    if (!((life4_9 == null))) {
        forwardValue2844_69_0 = forwardValue2844_58_0;
        break forward_join_69;
    }
    if (!((((java.lang.String)(forwardValue2844_58_0)).length() > 0))) {
        break forward_join_79;
    }
    forwardValue2844_69_0 = moom.Ob.b(((java.lang.String)(p1)), ((java.lang.String)(__sourceIntrinsic_5fed00a22b65_invokedynamic2844_14(19631, (5072195770610185749L ^ life2_3)))));
    }
    life1_92 = forwardValue2844_69_0;
    return new moom.Nc(life6_25, life8_33, life7_29, life10_66, life1_92);
    }
    return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String g() {
long local1 = (moom.Nc.n ^ 83449641924524L);
    java.lang.String __sourceSpill2015_4 = ((moom.Nc)(this)).a__String();
    java.lang.String __sourceSpill2015_5 = ((moom.Nc)(this)).d();
    java.lang.String local3 = ((moom.Nc)(this)).d();
    java.lang.String local4 = __sourceSpill2015_5;
    java.lang.String local5 = __sourceSpill2015_4;
    return __sourceIntrinsic_dca690bc6996_originalDynamicSite2015_8(__sourceIntrinsic_dca690bc6996_originalDynamicSite2015_6(25112, (7547080883123971434L ^ local1)), local5, " ", local4, __sourceIntrinsic_dca690bc6996_originalDynamicSite2015_7(5391, (7983579674631475834L ^ local1)), local3);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite883_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite604_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite604_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite604_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite604_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_originalDynamicSite604_19(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5fed00a22b65_invokedynamic2844_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2846_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2846_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2846_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_73d8ac8b7602_invokedynamic2846_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6668_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2015_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2015_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dca690bc6996_originalDynamicSite2015_8(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
