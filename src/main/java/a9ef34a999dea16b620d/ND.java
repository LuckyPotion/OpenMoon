package moom;


public class ND {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

public ND() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-3857673873946956356L)), ((long)(-8949369918708540516L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(143007925452650L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ND.a ^ 72175882476358L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill866_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill866_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill866_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill866_14 = new byte[8];
    (__sourceSpill866_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill866_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation866_16 = __sourceSpill866_14;
    ((javax.crypto.Cipher)(__sourceSpill866_11)).init(((int)(__sourceSpill866_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill866_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation866_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[6];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\024ºNÜ\032dz~*«5ä\000\f\024ÛVOUNÝAsaN©»\033?üV>9Ø8\t~\006ü\"®^~\025\177>ÒðvÙ\003[1ÓÏ«{@9¬=Ð\004\tä\0353:lö2>Vëu¹²îd¸²ÌÝV®Ô\002g\020ªàb\t\032\013÷\0308<µY?õ|Cju\020(!¯\022D\013Êçè,¡Ï6+Ù1ÈöÖ\026ù£\036Ï¨Öµ>©\037´\001Âÿx]\037Îw\020ÍáxOÐª>oÂ\004ñ½0ëä\027(ßi£º@õ(ÌÝ>Îøu\020O:Ó¥\026©\005KÈ ø:Ñ+ïÖØI <-]J"))).length();
    int local5_life24 = 120;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill866_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill866_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill866_29)).doFinal(((byte[])(__sourceSpill866_28)));
        java.lang.String __sourceSpill866_34 = ((java.lang.String)(moom.ND.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill866_35 = local9_life19;
        int __sourceSpill866_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill866_35)[__sourceSpill866_36] = __sourceSpill866_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "bÚ\024þÓÿ\032¥qÕ\021ò³\007\020\027nÜ\020ø(ÈÅ´ünH\031³"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill866_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill866_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill866_43)).doFinal(((byte[])(__sourceSpill866_42)));
        java.lang.String __sourceSpill866_48 = ((java.lang.String)(moom.ND.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill866_49 = local9_life19;
        int __sourceSpill866_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill866_49)[__sourceSpill866_50] = __sourceSpill866_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    b = ((java.lang.String[])(local9_life19));
    c = ((java.lang.String[])(new java.lang.String[6]));
}

private static native <E extends Throwable> java.lang.Object[] __sourceHandlerCall_a620d05fdd688cd939a5(java.util.Collection a0, java.lang.Class a1) throws E;
private static final class __SourceHandler_a620d05fdd688cd939a5 {

public static java.lang.Object[] f38(java.util.Collection p0, java.lang.Class p1) throws Throwable {
    java.lang.Class forwardValue38_17_0;
    java.lang.Object forwardValue38_37_0;
    java.lang.Class spill38_0;
    long life2_3;
    int life4_5;
    java.lang.Object[] life5_50;
    forward_join_37: {
    forward_join_33: {
    forward_join_17: {
    forward_join_16: {
    forward_join_10: {
    life2_3 = (__fieldRead38_0() ^ 85169938557438L);
    life4_5 = __call38_1();
    if (!((p0 == null))) {
        break forward_join_10;
    }
    return null;
    }
    spill38_0 = p1;
    if (!((life4_5 == 0))) {
        forwardValue38_17_0 = spill38_0;
        break forward_join_17;
    }
    if (!((spill38_0 == null))) {
        break forward_join_16;
    }
    return null;
    }
    forwardValue38_17_0 = p1;
    }
    if (!((life4_5 == 0))) {
        forwardValue38_37_0 = forwardValue38_17_0;
        break forward_join_37;
    }
    if (!(__call38_2(forwardValue38_17_0))) {
        break forward_join_33;
    }
    java.lang.Object __inlineStack38_4Token;
    throw new java.lang.IllegalArgumentException(__invokedynamic38_5(__inlineStack38_4Output0((__inlineStack38_4Token = __inlineStack38_4Pack(p1, __invokedynamic38_3(15585, (945796328972991667L ^ life2_3))))), __inlineStack38_4Output1(__inlineStack38_4Token)));
    }
    forwardValue38_37_0 = __call38_7(p1, __call38_6(p0));
    }
    life5_50 = __cast38_8(forwardValue38_37_0);
    return __call38_9(p0, life5_50);
}
private static native long __fieldRead38_0() throws Throwable;
private static native int __call38_1() throws Throwable;
private static native boolean __call38_2(java.lang.Class a0) throws Throwable;
private static native java.lang.String __invokedynamic38_3(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack38_4Pack(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack38_4Output0(java.lang.Object token) throws Throwable;
private static native java.lang.Class __inlineStack38_4Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic38_5(java.lang.String a0, java.lang.Class a1) throws Throwable;
private static native int __call38_6(java.util.Collection a0) throws Throwable;
private static native java.lang.Object __call38_7(java.lang.Class a0, int a1) throws Throwable;
private static native java.lang.Object[] __cast38_8(java.lang.Object a0) throws Throwable;
private static native java.lang.Object[] __call38_9(java.util.Collection a0, java.lang.Object[] a1) throws Throwable;

}


public static java.lang.String b(int[] p0, java.lang.String p1) {
long life2_3;
    int life4_5;
    java.lang.StringBuilder life5_19;
    int life6_21;
    int life7_29;
    lexical_join_52: {
    lexical_join_10: {
    life2_3 = (moom.ND.a ^ 4105696285631L);
    life4_5 = moom.Ob.c();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return "";
    }
    life5_19 = new java.lang.StringBuilder(((p0).length * 5));
    life6_21 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_50: {
    lexical_join_36: {
    if (!((life6_21 < (p0).length))) {
        break lexical_join_52;
    }
    life7_29 = (p0)[life6_21];
    if (!((life4_5 != 0))) {
        break lexical_join_50;
    }
    if (!((life6_21 > 0))) {
        break lexical_join_36;
    }
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.String)(p1)));
    }
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.String)(__sourceIntrinsic_ec976f588292_invokedynamic990_3(16986, (8054819721284663373L ^ life2_3)))));
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.String)(java.lang.Integer.toHexString(((int)(life7_29))))));
    life6_21 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return ((java.lang.StringBuilder)(life5_19)).toString();
}


public static java.lang.Object[] b(java.lang.Object[] p0, java.lang.Object p1) {
java.util.ArrayList local2 = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.Object[])(p0))));
    ((java.util.List)(local2)).remove(((java.lang.Object)(p1)));
    return moom.ND.a(((java.util.Collection)(local2)), ((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getComponentType())));
}


public static boolean b(java.lang.Object p0, java.lang.Object[] p1) {
java.lang.Object[] lexicalValue989_11_0;
    java.lang.Object[] spill989_0;
    long life2_3;
    int life4_5;
    java.lang.Object[] life5_14;
    int life6_17;
    int life7_19;
    java.lang.Object life8_26;
    lexical_join_34: {
    lexical_join_11: {
    life2_3 = (moom.ND.a ^ 67193531900430L);
    life4_5 = moom.Ob.c();
    spill989_0 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue989_11_0 = spill989_0;
        break lexical_join_11;
    }
    if (!((spill989_0 != null))) {
        break lexical_join_34;
    }
    lexicalValue989_11_0 = p1;
    }
    life5_14 = lexicalValue989_11_0;
    life6_17 = (life5_14).length;
    life7_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life7_19 < life6_17))) {
        break lexical_join_34;
    }
    life8_26 = (life5_14)[life7_19];
    if (!((life4_5 != 0))) {
        break lexical_join_32;
    }
    if (!((p0 == life8_26))) {
        break lexical_join_31;
    }
    return ((1) != 0);
    }
    life7_19 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return ((0) != 0);
}


public static boolean a(java.lang.Object p0, java.lang.Object p1) {
return (__sourceIntrinsic_booleanComparison((java.util.Objects.equals(((java.lang.Object)(p0)), ((java.lang.Object)(p1))))) != 0);
}


public static boolean a(java.lang.Object p0, java.lang.Object[] p1) {
java.lang.Object[] lexicalValue981_11_0;
    int lexicalValue981_38_0;
    java.lang.Object[] spill981_0;
    boolean spill981_1;
    long life2_3;
    int life4_5;
    java.lang.Object[] life5_14;
    int life6_17;
    int life7_19;
    java.lang.Object life8_26;
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_11: {
    life2_3 = (moom.ND.a ^ 87444210424705L);
    life4_5 = moom.Ob.c();
    spill981_0 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue981_11_0 = spill981_0;
        break lexical_join_11;
    }
    if (!((spill981_0 != null))) {
        break lexical_join_37;
    }
    lexicalValue981_11_0 = p1;
    }
    life5_14 = lexicalValue981_11_0;
    life6_17 = (life5_14).length;
    life7_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    if (!((life7_19 < life6_17))) {
        break lexical_join_37;
    }
    life8_26 = (life5_14)[life7_19];
    if (!((life4_5 != 0))) {
        break lexical_join_35;
    }
    spill981_1 = moom.ND.a(((java.lang.Object)(p0)), ((java.lang.Object)(life8_26)));
    if (!((life4_5 != 0))) {
        lexicalValue981_38_0 = ((spill981_1) ? 1 : 0);
        break lexical_join_38;
    }
    if (!(spill981_1)) {
        break lexical_join_34;
    }
    return ((1) != 0);
    }
    life7_19 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue981_38_0 = 0;
    }
    return ((lexicalValue981_38_0) != 0);
}


public static boolean a(int p0, int[] p1) {
int lexicalValue980_33_0;
    int spill980_0;
    int spill980_1;
    long life2_3;
    int[] life5_5;
    int life6_9;
    int life4_10;
    int life7_12;
    int life8_19;
    lexical_join_33: {
    lexical_join_32: {
    life2_3 = (moom.ND.a ^ 12667389142537L);
    life5_5 = p1;
    spill980_0 = moom.Ob.b();
    life6_9 = (life5_5).length;
    life4_10 = spill980_0;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life7_12 < life6_9))) {
        break lexical_join_32;
    }
    life8_19 = (life5_5)[life7_12];
    if (!((life4_10 == 0))) {
        break lexical_join_30;
    }
    spill980_1 = life8_19;
    if (!((life4_10 == 0))) {
        lexicalValue980_33_0 = spill980_1;
        break lexical_join_33;
    }
    if (!((spill980_1 == p0))) {
        break lexical_join_29;
    }
    return ((1) != 0);
    }
    life7_12 += 1;
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue980_33_0 = 0;
    }
    return ((lexicalValue980_33_0) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6541_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ND"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.Object[] a(java.util.Collection p0, java.lang.Class p1) { return __sourceHandlerCall_a620d05fdd688cd939a5(p0, p1); }


public static java.lang.String a(java.lang.Object[] p0, java.lang.String p1) {
long life2_3;
    int life4_5;
    java.lang.StringBuilder life5_19;
    int life6_21;
    java.lang.Object life7_29;
    lexical_join_43: {
    lexical_join_10: {
    life2_3 = (moom.ND.a ^ 131095910179800L);
    life4_5 = moom.Ob.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return "";
    }
    life5_19 = new java.lang.StringBuilder(((p0).length * 5));
    life6_21 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_41: {
    lexical_join_36: {
    if (!((life6_21 < (p0).length))) {
        break lexical_join_43;
    }
    life7_29 = (p0)[life6_21];
    if (!((life4_5 == 0))) {
        break lexical_join_41;
    }
    if (!((life6_21 > 0))) {
        break lexical_join_36;
    }
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.String)(p1)));
    }
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.Object)(life7_29)));
    life6_21 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return ((java.lang.StringBuilder)(life5_19)).toString();
}


private static java.lang.NullPointerException a(java.lang.NullPointerException p0) {
return p0;
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
        byte[] spill3289_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3289_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3289_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3289_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3289_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3289_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static int[] a(java.lang.Integer[] p0) {
java.lang.Integer[] lexicalValue985_13_0;
    int lexicalValue985_22_0;
    int[] lexicalValue985_43_0;
    java.lang.Integer[] spill985_0;
    int spill985_1;
    int[] spill985_2;
    long life1_3;
    int life3_5;
    int[] life4_33;
    int life5_35;
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_22: {
    lexical_join_20: {
    lexical_join_13: {
    lexical_join_12: {
    life1_3 = (moom.ND.a ^ 54065443921872L);
    life3_5 = moom.Ob.b();
    spill985_0 = p0;
    if (!((life3_5 == 0))) {
        lexicalValue985_13_0 = spill985_0;
        break lexical_join_13;
    }
    if (!((spill985_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    lexicalValue985_13_0 = p0;
    }
    spill985_1 = (lexicalValue985_13_0).length;
    if (!((life3_5 == 0))) {
        lexicalValue985_22_0 = spill985_1;
        break lexical_join_22;
    }
    if (!((spill985_1 == 0))) {
        break lexical_join_20;
    }
    return new int[0];
    }
    lexicalValue985_22_0 = (p0).length;
    }
    life4_33 = new int[lexicalValue985_22_0];
    life5_35 = 0;
    lexical_cycle_26: while (true) {
    if (!((life5_35 < (life4_33).length))) {
        break lexical_join_42;
    }
    spill985_2 = life4_33;
    if (!((life3_5 == 0))) {
        lexicalValue985_43_0 = spill985_2;
        break lexical_join_43;
    }
    (spill985_2)[life5_35] = ((java.lang.Integer)((p0)[life5_35])).intValue();
    life5_35 += 1;
    if (!((life3_5 != 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    lexicalValue985_43_0 = life4_33;
    }
    return lexicalValue985_43_0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11214);
    if (((moom.ND.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.ND.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.ND.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/ND", life9_51);
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
        life9_116 = ((java.lang.String)((moom.ND.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.ND.c)[life5_8] = moom.ND.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.ND.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.ND.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static java.lang.Object[] a(java.lang.Object[] p0, java.lang.Object[] p1) {
java.lang.Object[] forwardValue2786_20_0;
    int forwardValue2786_28_0;
    java.lang.Object[] spill2786_0;
    int spill2786_1;
    long life2_3;
    int life4_5;
    int life5_38;
    int life6_43;
    java.lang.Object[] life7_50;
    forward_join_28: {
    forward_join_26: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.ND.a ^ 15887011560373L);
    life4_5 = moom.Ob.c();
    spill2786_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2786_20_0 = spill2786_0;
        break forward_join_20;
    }
    if (!((spill2786_0 == null))) {
        break forward_join_19;
    }
    throw new java.lang.NullPointerException(__sourceIntrinsic_a76548a3e42f_invokedynamic2786_2(23655, (4727550513420406397L ^ life2_3)));
    }
    forwardValue2786_20_0 = p1;
    }
    spill2786_1 = (forwardValue2786_20_0).length;
    if (!((life4_5 != 0))) {
        forwardValue2786_28_0 = spill2786_1;
        break forward_join_28;
    }
    if (!((spill2786_1 == 0))) {
        break forward_join_26;
    }
    return p0;
    }
    forwardValue2786_28_0 = (p0).length;
    }
    life5_38 = forwardValue2786_28_0;
    life6_43 = (life5_38 + (p1).length);
    life7_50 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getComponentType())), ((int)(life6_43)))));
    java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)(0)), ((java.lang.Object)(life7_50)), ((int)(0)), ((int)(life5_38)));
    java.lang.System.arraycopy(((java.lang.Object)(p1)), ((int)(0)), ((java.lang.Object)(life7_50)), ((int)(life5_38)), ((int)((p1).length)));
    return life7_50;
}


public static java.lang.Object[] a__ArrayObject(java.lang.Object[] p0, java.lang.Object p1) {
java.lang.Object[] forwardValue2788_20_0;
    java.lang.Object[] spill2788_0;
    long life2_3;
    int life4_5;
    int life5_26;
    int life6_30;
    java.lang.Object[] life7_37;
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.ND.a ^ 70444675464965L);
    life4_5 = moom.Ob.b();
    spill2788_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2788_20_0 = spill2788_0;
        break forward_join_20;
    }
    if (!((spill2788_0 == null))) {
        break forward_join_19;
    }
    throw new java.lang.NullPointerException(__sourceIntrinsic_a74fbd08bf1f_invokedynamic2788_2(23655, (4727632026299452109L ^ life2_3)));
    }
    forwardValue2788_20_0 = p0;
    }
    life5_26 = (forwardValue2788_20_0).length;
    life6_30 = (life5_26 + 1);
    life7_37 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getComponentType())), ((int)(life6_30)))));
    java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)(0)), ((java.lang.Object)(life7_37)), ((int)(0)), ((int)(life5_26)));
    (life7_37)[life5_26] = p1;
    return life7_37;
}


public static java.lang.Object[] a(java.lang.Object[] p0, java.lang.Object p1, int p2) {
java.util.ArrayList local3 = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.Object[])(p0))));
    ((java.util.List)(local3)).add(((int)(p2)), ((java.lang.Object)(p1)));
    java.lang.Object[] local4 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p0)).getClass())).getComponentType())), ((int)(((java.util.List)(local3)).size())))));
    return ((java.util.List)(local3)).toArray(((java.lang.Object[])(local4)));
}


public static java.lang.String a(boolean[] p0, java.lang.String p1) {
long life2_3;
    int life4_5;
    java.lang.StringBuilder life5_19;
    int life6_21;
    int life7_29;
    lexical_join_43: {
    lexical_join_10: {
    life2_3 = (moom.ND.a ^ 28754856673779L);
    life4_5 = moom.Ob.c();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return "";
    }
    life5_19 = new java.lang.StringBuilder(((p0).length * 5));
    life6_21 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_41: {
    lexical_join_36: {
    if (!((life6_21 < (p0).length))) {
        break lexical_join_43;
    }
    life7_29 = (((p0)[life6_21]) ? 1 : 0);
    if (!((life4_5 != 0))) {
        break lexical_join_41;
    }
    if (!((life6_21 > 0))) {
        break lexical_join_36;
    }
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.String)(p1)));
    }
    ((java.lang.StringBuilder)(life5_19)).append(((boolean)__sourceIntrinsic_integerToBoolean((life7_29))));
    life6_21 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return ((java.lang.StringBuilder)(life5_19)).toString();
}


public static int[] a(int[] p0, int p1) {
return moom.ND.a(((int[])(p0)), ((int[])(new int[] {p1})));
}


public static int[] a(int[] p0, int[] p1) {
int[] forwardValue2782_11_0;
    int[] forwardValue2782_15_0;
    int[] spill2782_0;
    long life2_3;
    int life4_5;
    int life5_22;
    int life6_27;
    int[] life7_30;
    forward_join_40: {
    forward_join_15: {
    forward_join_11: {
    life2_3 = (moom.ND.a ^ 125557440121230L);
    life4_5 = moom.Ob.b();
    spill2782_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2782_11_0 = spill2782_0;
        break forward_join_11;
    }
    if (!((spill2782_0 != null))) {
        break forward_join_40;
    }
    forwardValue2782_11_0 = p1;
    }
    if (!((life4_5 == 0))) {
        forwardValue2782_15_0 = forwardValue2782_11_0;
        break forward_join_15;
    }
    if (!((forwardValue2782_11_0 != null))) {
        break forward_join_40;
    }
    forwardValue2782_15_0 = p0;
    }
    life5_22 = (forwardValue2782_15_0).length;
    life6_27 = (life5_22 + (p1).length);
    life7_30 = new int[life6_27];
    java.lang.System.arraycopy(((java.lang.Object)(p0)), ((int)(0)), ((java.lang.Object)(life7_30)), ((int)(0)), ((int)(life5_22)));
    java.lang.System.arraycopy(((java.lang.Object)(p1)), ((int)(0)), ((java.lang.Object)(life7_30)), ((int)(life5_22)), ((int)((p1).length)));
    return life7_30;
    }
    throw new java.lang.NullPointerException(__sourceIntrinsic_ae693163f535_invokedynamic2782_4(11316, (3358306559957715991L ^ life2_3)));
}


public static boolean a(java.lang.Object[] p0, java.lang.Object p1) {
java.lang.Object[] lexicalValue986_11_0;
    java.lang.Object[] spill986_0;
    long life2_3;
    int life4_5;
    java.lang.Object[] life5_14;
    int life6_17;
    int life7_19;
    java.lang.Object life8_26;
    lexical_join_34: {
    lexical_join_11: {
    life2_3 = (moom.ND.a ^ 20662417826738L);
    life4_5 = moom.Ob.c();
    spill986_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue986_11_0 = spill986_0;
        break lexical_join_11;
    }
    if (!((spill986_0 != null))) {
        break lexical_join_34;
    }
    lexicalValue986_11_0 = p0;
    }
    life5_14 = lexicalValue986_11_0;
    life6_17 = (life5_14).length;
    life7_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life7_19 < life6_17))) {
        break lexical_join_34;
    }
    life8_26 = (life5_14)[life7_19];
    if (!((life4_5 != 0))) {
        break lexical_join_32;
    }
    if (!((life8_26 == p1))) {
        break lexical_join_31;
    }
    return ((1) != 0);
    }
    life7_19 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return ((0) != 0);
}


public static java.lang.String a(java.lang.Object[] p0) {
long local1 = (moom.ND.a ^ 99786299745956L);
    return moom.ND.a(((java.lang.Object[])(p0)), ((java.lang.String)(__sourceIntrinsic_9e68356128fa_originalDynamicSite1339_1(31566, (9132989330085721156L ^ local1)))));
}


public static java.lang.String a(int[] p0, java.lang.String p1) {
long life2_3;
    int life4_5;
    java.lang.StringBuilder life5_19;
    int life6_21;
    int life7_29;
    lexical_join_43: {
    lexical_join_10: {
    life2_3 = (moom.ND.a ^ 125693440648157L);
    life4_5 = moom.Ob.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return "";
    }
    life5_19 = new java.lang.StringBuilder(((p0).length * 5));
    life6_21 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_41: {
    lexical_join_36: {
    if (!((life6_21 < (p0).length))) {
        break lexical_join_43;
    }
    life7_29 = (p0)[life6_21];
    if (!((life4_5 == 0))) {
        break lexical_join_41;
    }
    if (!((life6_21 > 0))) {
        break lexical_join_36;
    }
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.String)(p1)));
    }
    ((java.lang.StringBuilder)(life5_19)).append(((int)(life7_29)));
    life6_21 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return ((java.lang.StringBuilder)(life5_19)).toString();
}


public static java.lang.String a(int[] p0) {
long local1 = (moom.ND.a ^ 96137532666148L);
    return moom.ND.a(((int[])(p0)), ((java.lang.String)(__sourceIntrinsic_4bccab181edf_originalDynamicSite1340_1(8662, (4943915634968869211L ^ local1)))));
}


public static java.lang.String a(float[] p0, java.lang.String p1, java.lang.String p2) {
long life3_3;
    int life5_5;
    java.lang.StringBuilder life6_19;
    int life7_21;
    float life8_29;
    lexical_join_51: {
    lexical_join_10: {
    life3_3 = (moom.ND.a ^ 67824762550446L);
    life5_5 = moom.Ob.c();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return "";
    }
    life6_19 = new java.lang.StringBuilder(((p0).length * 5));
    life7_21 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_49: {
    lexical_join_36: {
    if (!((life7_21 < (p0).length))) {
        break lexical_join_51;
    }
    life8_29 = (p0)[life7_21];
    if (!((life5_5 != 0))) {
        break lexical_join_49;
    }
    if (!((life7_21 > 0))) {
        break lexical_join_36;
    }
    ((java.lang.StringBuilder)(life6_19)).append(((java.lang.String)(p1)));
    }
    ((java.lang.StringBuilder)(life6_19)).append(((java.lang.String)(java.lang.String.format(((java.lang.String)(p2)), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Float.valueOf(((float)(life8_29)))}))))));
    life7_21 += 1;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return ((java.lang.StringBuilder)(life6_19)).toString();
}


public static java.lang.String a(float[] p0, java.lang.String p1) {
long life2_3;
    int life4_5;
    java.lang.StringBuilder life5_19;
    int life6_21;
    float life7_29;
    lexical_join_43: {
    lexical_join_10: {
    life2_3 = (moom.ND.a ^ 109318070225332L);
    life4_5 = moom.Ob.c();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return "";
    }
    life5_19 = new java.lang.StringBuilder(((p0).length * 5));
    life6_21 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_41: {
    lexical_join_36: {
    if (!((life6_21 < (p0).length))) {
        break lexical_join_43;
    }
    life7_29 = (p0)[life6_21];
    if (!((life4_5 != 0))) {
        break lexical_join_41;
    }
    if (!((life6_21 > 0))) {
        break lexical_join_36;
    }
    ((java.lang.StringBuilder)(life5_19)).append(((java.lang.String)(p1)));
    }
    ((java.lang.StringBuilder)(life5_19)).append(((float)(life7_29)));
    life6_21 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return ((java.lang.StringBuilder)(life5_19)).toString();
}


public static java.lang.String a(float[] p0) {
long local1 = (moom.ND.a ^ 105102498998278L);
    return moom.ND.a(((float[])(p0)), ((java.lang.String)(__sourceIntrinsic_4cae4e011e4a_originalDynamicSite1341_1(31566, (9132983653106465510L ^ local1)))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6541_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_549f873b5bdb_invokedynamic38_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4cae4e011e4a_originalDynamicSite1341_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4bccab181edf_originalDynamicSite1340_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ae693163f535_invokedynamic2782_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9e68356128fa_originalDynamicSite1339_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a76548a3e42f_invokedynamic2786_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a74fbd08bf1f_invokedynamic2788_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec976f588292_invokedynamic990_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
