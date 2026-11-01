package moom;


public class Ob {

private static int b;

private static long a;

private static long c;

public Ob() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(9162011847651391409L)), ((long)(-8690905505030166515L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277050112200386L)))));
    int __sourceSpill747_6 = 0;
    long local0_life7 = (moom.Ob.a ^ 123486881180148L);
    moom.Ob.b(((int)(__sourceSpill747_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill747_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill747_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill747_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill747_15 = new byte[8];
    (__sourceSpill747_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill747_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation747_17 = __sourceSpill747_15;
    ((javax.crypto.Cipher)(__sourceSpill747_12)).init(((int)(__sourceSpill747_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill747_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation747_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 7126179595560059084L;
    byte[] __sourceSpill747_21 = new byte[8];
    (__sourceSpill747_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill747_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill747_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill747_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill747_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill747_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill747_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill747_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill747_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill747_22)).doFinal(((byte[])(__sourceSpill747_21)));
    c = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}

private static native <E extends Throwable> int __sourceHandlerCall_ea0d38bf480a0a0bde50(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_ea0d38bf480a0a0bde50 {

public static int f378(java.lang.String p0, int p1) throws Throwable {
    java.lang.String forwardValue378_13_0;
    java.lang.String spill378_0;
    long life2_3;
    int life4_5;
    forward_join_13: {
    forward_join_12: {
    life2_3 = (__fieldRead378_0() ^ 126046949058821L);
    life4_5 = __call378_1();
    spill378_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue378_13_0 = spill378_0;
        break forward_join_13;
    }
    if (!((spill378_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    forwardValue378_13_0 = p0;
    }
    return __call378_2(forwardValue378_13_0);
}
public static int h378_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2037800_0(p0);
}
public static int h378_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2037801_0(p0);
}
public static int h378_2(java.lang.NumberFormatException p0, int p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native long __fieldRead378_0() throws Throwable;
private static native int __call378_1() throws Throwable;
private static native int __call378_2(java.lang.String a0) throws Throwable;
private static native java.lang.NumberFormatException __call2037800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call2037801_0(java.lang.NumberFormatException a0) throws Throwable;

}


public static java.lang.String b(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2917_26_0;
    java.lang.String spill2917_0;
    java.lang.String spill2917_1;
    java.lang.String spill2917_2;
    long life2_3;
    int life4_5;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (moom.Ob.a ^ 88664867548424L);
    life4_5 = moom.Ob.c();
    spill2917_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2917_26_0 = spill2917_0;
        break forward_join_26;
    }
    if (!((spill2917_0 != null))) {
        break forward_join_25;
    }
    spill2917_1 = p1;
    if (!((life4_5 != 0))) {
        forwardValue2917_26_0 = spill2917_1;
        break forward_join_26;
    }
    if (!((spill2917_1 != null))) {
        break forward_join_25;
    }
    spill2917_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2917_26_0 = spill2917_2;
        break forward_join_26;
    }
    if (!(((java.lang.String)(spill2917_2)).startsWith(((java.lang.String)(p1))))) {
        break forward_join_25;
    }
    p0 = ((java.lang.String)(p0)).substring(((int)(((java.lang.String)(p1)).length())));
    }
    forwardValue2917_26_0 = p0;
    }
    return forwardValue2917_26_0;
}


public static boolean b__Boolean(java.lang.String p0, java.lang.String[] p1) {
java.lang.String[] lexicalValue1035_17_0;
    int lexicalValue1035_44_0;
    java.lang.String[] spill1035_0;
    boolean spill1035_1;
    long life2_3;
    int life4_5;
    java.lang.String[] life5_24;
    int life6_27;
    int life7_29;
    java.lang.String life8_36;
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_17: {
    lexical_join_16: {
    lexical_join_10: {
    life2_3 = (moom.Ob.a ^ 13165492373731L);
    life4_5 = moom.Ob.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return ((0) != 0);
    }
    spill1035_0 = p1;
    if (!((life4_5 == 0))) {
        lexicalValue1035_17_0 = spill1035_0;
        break lexical_join_17;
    }
    if (!((spill1035_0 == null))) {
        break lexical_join_16;
    }
    return ((0) != 0);
    }
    lexicalValue1035_17_0 = p1;
    }
    life5_24 = lexicalValue1035_17_0;
    life6_27 = (life5_24).length;
    life7_29 = 0;
    lexical_cycle_23: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!((life7_29 < life6_27))) {
        break lexical_join_43;
    }
    life8_36 = (life5_24)[life7_29];
    if (!((life4_5 == 0))) {
        break lexical_join_41;
    }
    spill1035_1 = ((java.lang.String)(p0)).endsWith(((java.lang.String)(life8_36)));
    if (!((life4_5 == 0))) {
        lexicalValue1035_44_0 = ((spill1035_1) ? 1 : 0);
        break lexical_join_44;
    }
    if (!(spill1035_1)) {
        break lexical_join_40;
    }
    return ((1) != 0);
    }
    life7_29 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue1035_44_0 = 0;
    }
    return ((lexicalValue1035_44_0) != 0);
}


public static java.lang.String b(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
java.lang.String forwardValue2919_23_0;
    java.lang.String forwardValue2919_36_0;
    java.lang.String forwardValue2919_38_0;
    java.lang.String spill2919_0;
    java.lang.String spill2919_1;
    java.lang.String spill2919_2;
    long life3_3;
    int life5_5;
    java.lang.String life0_52;
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_28: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (moom.Ob.a ^ 94933987603763L);
    life5_5 = moom.Ob.b();
    spill2919_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2919_38_0 = spill2919_0;
        break forward_join_38;
    }
    if (!((spill2919_0 != null))) {
        break forward_join_37;
    }
    spill2919_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue2919_38_0 = spill2919_1;
        break forward_join_38;
    }
    if (!((spill2919_1 != null))) {
        break forward_join_37;
    }
    spill2919_2 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2919_23_0 = spill2919_2;
        break forward_join_23;
    }
    if (!((!((java.lang.String)(spill2919_2)).startsWith(((java.lang.String)(p1)))))) {
        break forward_join_22;
    }
    return p0;
    }
    forwardValue2919_23_0 = p2;
    }
    if (!((life5_5 == 0))) {
        forwardValue2919_36_0 = forwardValue2919_23_0;
        break forward_join_36;
    }
    if (!((forwardValue2919_23_0 == null))) {
        break forward_join_28;
    }
    p2 = "";
    }
    life0_52 = ((java.lang.String)(p0)).substring(((int)(((java.lang.String)(p1)).length())));
    forwardValue2919_36_0 = __sourceIntrinsic_ae7e89080fc5_invokedynamic2919_5(p2, life0_52);
    }
    return forwardValue2919_36_0;
    }
    forwardValue2919_38_0 = p0;
    }
    return forwardValue2919_38_0;
}


public static java.lang.String b(java.lang.String p0, int p1, char p2) {
java.lang.String lexicalValue1032_13_0;
    java.lang.String lexicalValue1032_19_0;
    java.lang.StringBuilder lexicalValue1032_38_0;
    java.lang.String spill1032_0;
    java.lang.StringBuilder spill1032_1;
    long life3_3;
    int life5_5;
    java.lang.StringBuilder life6_33;
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_20: {
    lexical_join_19: {
    lexical_join_13: {
    lexical_join_12: {
    life3_3 = (moom.Ob.a ^ 115782355092294L);
    life5_5 = moom.Ob.c();
    spill1032_0 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1032_13_0 = spill1032_0;
        break lexical_join_13;
    }
    if (!((spill1032_0 == null))) {
        break lexical_join_12;
    }
    p0 = "";
    }
    lexicalValue1032_13_0 = p0;
    }
    if (!((life5_5 != 0))) {
        lexicalValue1032_19_0 = lexicalValue1032_13_0;
        break lexical_join_19;
    }
    if (!((((java.lang.String)(lexicalValue1032_13_0)).length() >= p1))) {
        break lexical_join_20;
    }
    lexicalValue1032_19_0 = p0;
    }
    return lexicalValue1032_19_0;
    }
    life6_33 = new java.lang.StringBuilder(p0);
    lexical_cycle_25: while (true) {
    if (!((((java.lang.StringBuilder)(life6_33)).length() < p1))) {
        break lexical_join_37;
    }
    spill1032_1 = ((java.lang.StringBuilder)(life6_33)).append(((char)(p2)));
    if (!((life5_5 != 0))) {
        lexicalValue1032_38_0 = spill1032_1;
        break lexical_join_38;
    }
    recovery.source.CarrierOps.discard(spill1032_1);
    if (!((life5_5 == 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue1032_38_0 = life6_33;
    }
    return ((java.lang.StringBuilder)(lexicalValue1032_38_0)).toString();
}


public static boolean b(java.lang.String p0) {
int forwardValue2915_12_0;
    int forwardValue2915_14_0;
    boolean spill2915_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.Ob.a ^ 22491782011516L);
    life3_5 = moom.Ob.c();
    spill2915_0 = moom.Ob.a__Boolean(((java.lang.String)(p0)));
    if (!((life3_5 != 0))) {
        forwardValue2915_12_0 = ((spill2915_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill2915_0))) {
        break forward_join_13;
    }
    forwardValue2915_12_0 = 1;
    }
    forwardValue2915_14_0 = forwardValue2915_12_0;
    break forward_join_14;
    }
    forwardValue2915_14_0 = 0;
    }
    return ((forwardValue2915_14_0) != 0);
}


public static int b() {
return moom.Ob.b;
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static java.lang.String b(java.lang.String p0, java.lang.String[] p1) {
java.lang.String lexicalValue1033_47_0;
    java.lang.String spill1033_0;
    java.lang.String spill1033_1;
    long life2_3;
    int life4_5;
    int life5_20;
    java.lang.String[] life6_22;
    int life7_25;
    int life8_27;
    java.lang.String life9_34;
    lexical_join_47: {
    lexical_join_46: {
    life2_3 = (moom.Ob.a ^ 117333135119965L);
    life4_5 = moom.Ob.c();
    spill1033_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue1033_47_0 = spill1033_0;
        break lexical_join_47;
    }
    if (!((spill1033_0 != null))) {
        break lexical_join_46;
    }
    if (!((p1 != null))) {
        break lexical_join_46;
    }
    life5_20 = ((java.lang.String)(p0)).length();
    life6_22 = p1;
    life7_25 = (life6_22).length;
    life8_27 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    if (!((life8_27 < life7_25))) {
        break lexical_join_46;
    }
    life9_34 = (life6_22)[life8_27];
    p0 = moom.Ob.b(((java.lang.String)(p0)), ((java.lang.String)(life9_34)));
    if (!((life4_5 != 0))) {
        break lexical_join_44;
    }
    spill1033_1 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue1033_47_0 = spill1033_1;
        break lexical_join_47;
    }
    if (!((((java.lang.String)(spill1033_1)).length() != life5_20))) {
        break lexical_join_43;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_46;
    }
    }
    life8_27 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue1033_47_0 = p0;
    }
    return lexicalValue1033_47_0;
}


public static int b(java.lang.String[] p0, java.lang.String p1) {
int lexicalValue1034_34_0;
    boolean spill1034_0;
    long life2_3;
    int life4_5;
    int life5_14;
    java.lang.String life6_22;
    lexical_join_34: {
    lexical_join_33: {
    life2_3 = (moom.Ob.a ^ 43646206997211L);
    life4_5 = moom.Ob.c();
    if (!((p0 != null))) {
        break lexical_join_33;
    }
    if (!((p1 != null))) {
        break lexical_join_33;
    }
    life5_14 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life5_14 < (p0).length))) {
        break lexical_join_33;
    }
    life6_22 = (p0)[life5_14];
    if (!((life4_5 != 0))) {
        break lexical_join_31;
    }
    spill1034_0 = ((java.lang.String)(life6_22)).endsWith(((java.lang.String)(p1)));
    if (!((life4_5 != 0))) {
        lexicalValue1034_34_0 = ((spill1034_0) ? 1 : 0);
        break lexical_join_34;
    }
    if (!(spill1034_0)) {
        break lexical_join_30;
    }
    return life5_14;
    }
    life5_14 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1034_34_0 = -1;
    }
    return lexicalValue1034_34_0;
}


private static boolean b(java.lang.String p0, java.lang.String p1, char p2) {
java.lang.String forwardValue2918_30_0;
    java.lang.String forwardValue2918_37_0;
    int forwardValue2918_42_0;
    java.lang.String spill2918_0;
    java.lang.String spill2918_1;
    java.lang.String spill2918_2;
    long life3_3;
    int life5_5;
    java.lang.String life6_47;
    forward_join_42: {
    forward_join_41: {
    forward_join_37: {
    forward_join_36: {
    forward_join_30: {
    forward_join_23: {
    life3_3 = (moom.Ob.a ^ 116650473167682L);
    life5_5 = moom.Ob.b();
    spill2918_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2918_37_0 = spill2918_0;
        break forward_join_37;
    }
    if (!((spill2918_0 != null))) {
        break forward_join_36;
    }
    spill2918_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue2918_37_0 = spill2918_1;
        break forward_join_37;
    }
    if (!((spill2918_1 != null))) {
        break forward_join_36;
    }
    spill2918_2 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2918_30_0 = spill2918_2;
        break forward_join_30;
    }
    if (!((((java.lang.String)(spill2918_2)).length() < ((java.lang.String)(p1)).length()))) {
        break forward_join_23;
    }
    return ((0) != 0);
    }
    forwardValue2918_30_0 = ((java.lang.String)(p0)).substring(((int)((((java.lang.String)(p0)).length() - ((java.lang.String)(p1)).length()))));
    }
    life6_47 = forwardValue2918_30_0;
    return moom.Ob.a(((java.lang.String)(life6_47)), ((java.lang.String)(p1)), ((char)(p2)));
    }
    forwardValue2918_37_0 = p0;
    }
    if (!((forwardValue2918_37_0 == p1))) {
        break forward_join_41;
    }
    forwardValue2918_42_0 = 1;
    break forward_join_42;
    }
    forwardValue2918_42_0 = 0;
    }
    return ((forwardValue2918_42_0) != 0);
}


public static java.lang.String e(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2928_11_0;
    java.lang.String forwardValue2928_15_0;
    java.lang.String forwardValue2928_24_0;
    java.lang.String forwardValue2928_24_1;
    java.lang.String forwardValue2928_27_0;
    java.lang.String spill2928_0;
    java.lang.String spill2928_1;
    long life2_3;
    int life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    forward_join_22: {
    forward_join_15: {
    forward_join_11: {
    life2_3 = (moom.Ob.a ^ 38287944056843L);
    life4_5 = moom.Ob.b();
    spill2928_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2928_11_0 = spill2928_0;
        break forward_join_11;
    }
    if (!((spill2928_0 != null))) {
        break forward_join_26;
    }
    forwardValue2928_11_0 = p1;
    }
    if (!((life4_5 == 0))) {
        forwardValue2928_15_0 = forwardValue2928_11_0;
        break forward_join_15;
    }
    if (!((forwardValue2928_11_0 != null))) {
        break forward_join_26;
    }
    forwardValue2928_15_0 = p0;
    }
    spill2928_1 = p1;
    if (!((life4_5 == 0))) {
        forwardValue2928_24_0 = forwardValue2928_15_0;
        forwardValue2928_24_1 = spill2928_1;
        break forward_join_24;
    }
    if (!(((java.lang.String)(forwardValue2928_15_0)).endsWith(((java.lang.String)(spill2928_1))))) {
        break forward_join_22;
    }
    forwardValue2928_27_0 = p0;
    break forward_join_27;
    }
    forwardValue2928_24_0 = p1;
    forwardValue2928_24_1 = p0;
    }
    forwardValue2928_27_0 = __sourceIntrinsic_bd2e92aaa49b_invokedynamic2928_3(forwardValue2928_24_0, forwardValue2928_24_1);
    break forward_join_27;
    }
    forwardValue2928_27_0 = p0;
    }
    return forwardValue2928_27_0;
}


public static java.lang.String c(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
return moom.Ob.a(((java.lang.String)(p0)), ((java.lang.String[])(new java.lang.String[] {p1})), ((java.lang.String[])(new java.lang.String[] {p2})));
}


private static boolean c(java.lang.String p0, java.lang.String p1, char p2) {
java.lang.String forwardValue2924_28_0;
    java.lang.String forwardValue2924_35_0;
    int forwardValue2924_40_0;
    java.lang.String spill2924_0;
    java.lang.String spill2924_1;
    java.lang.String spill2924_2;
    long life3_3;
    int life5_5;
    java.lang.String life6_45;
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_34: {
    forward_join_28: {
    forward_join_23: {
    life3_3 = (moom.Ob.a ^ 58413016355572L);
    life5_5 = moom.Ob.c();
    spill2924_0 = p0;
    if (!((life5_5 != 0))) {
        forwardValue2924_35_0 = spill2924_0;
        break forward_join_35;
    }
    if (!((spill2924_0 != null))) {
        break forward_join_34;
    }
    spill2924_1 = p1;
    if (!((life5_5 != 0))) {
        forwardValue2924_35_0 = spill2924_1;
        break forward_join_35;
    }
    if (!((spill2924_1 != null))) {
        break forward_join_34;
    }
    spill2924_2 = p0;
    if (!((life5_5 != 0))) {
        forwardValue2924_28_0 = spill2924_2;
        break forward_join_28;
    }
    if (!((((java.lang.String)(spill2924_2)).length() < ((java.lang.String)(p1)).length()))) {
        break forward_join_23;
    }
    return ((0) != 0);
    }
    forwardValue2924_28_0 = ((java.lang.String)(p0)).substring(((int)(0)), ((int)(((java.lang.String)(p1)).length())));
    }
    life6_45 = forwardValue2924_28_0;
    return moom.Ob.a(((java.lang.String)(life6_45)), ((java.lang.String)(p1)), ((char)(p2)));
    }
    forwardValue2924_35_0 = p0;
    }
    if (!((forwardValue2924_35_0 == p1))) {
        break forward_join_39;
    }
    forwardValue2924_40_0 = 1;
    break forward_join_40;
    }
    forwardValue2924_40_0 = 0;
    }
    return ((forwardValue2924_40_0) != 0);
}


public static int c() {
int local0 = moom.Ob.b();
    if ((local0 == 0)) {
        return 81;
    }
    return 0;
}


public static java.lang.String c(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2923_30_0;
    java.lang.String spill2923_0;
    java.lang.String spill2923_1;
    java.lang.String spill2923_2;
    long life2_3;
    int life4_5;
    forward_join_30: {
    forward_join_29: {
    life2_3 = (moom.Ob.a ^ 11639180452488L);
    life4_5 = moom.Ob.c();
    spill2923_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2923_30_0 = spill2923_0;
        break forward_join_30;
    }
    if (!((spill2923_0 != null))) {
        break forward_join_29;
    }
    spill2923_1 = p1;
    if (!((life4_5 != 0))) {
        forwardValue2923_30_0 = spill2923_1;
        break forward_join_30;
    }
    if (!((spill2923_1 != null))) {
        break forward_join_29;
    }
    spill2923_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2923_30_0 = spill2923_2;
        break forward_join_30;
    }
    if (!(((java.lang.String)(spill2923_2)).endsWith(((java.lang.String)(p1))))) {
        break forward_join_29;
    }
    p0 = ((java.lang.String)(p0)).substring(((int)(0)), ((int)((((java.lang.String)(p0)).length() - ((java.lang.String)(p1)).length()))));
    }
    forwardValue2923_30_0 = p0;
    }
    return forwardValue2923_30_0;
}


public static java.lang.String h(java.lang.String p0, java.lang.String p1) {
int lexicalValue1038_41_0;
    java.lang.String lexicalValue1038_49_0;
    java.lang.String lexicalValue1038_51_0;
    java.lang.String spill1038_0;
    java.lang.String spill1038_1;
    int spill1038_2;
    long life2_3;
    int life4_5;
    int life5_25;
    int life6_27;
    int life7_35;
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_45: {
    lexical_join_41: {
    lexical_join_40: {
    life2_3 = (moom.Ob.a ^ 25388192060785L);
    life4_5 = moom.Ob.c();
    spill1038_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue1038_51_0 = spill1038_0;
        break lexical_join_51;
    }
    if (!((spill1038_0 != null))) {
        break lexical_join_50;
    }
    spill1038_1 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue1038_51_0 = spill1038_1;
        break lexical_join_51;
    }
    if (!((spill1038_1 != null))) {
        break lexical_join_50;
    }
    life5_25 = ((java.lang.String)(p0)).length();
    life6_27 = life5_25;
    lexical_cycle_19: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_27 > 0))) {
        break lexical_join_40;
    }
    life7_35 = ((int)(((java.lang.String)(p0)).charAt(((int)((life6_27 - 1))))));
    if (!((life4_5 != 0))) {
        break lexical_join_38;
    }
    spill1038_2 = ((java.lang.String)(p1)).indexOf(((int)(life7_35)));
    if (!((life4_5 != 0))) {
        lexicalValue1038_41_0 = spill1038_2;
        break lexical_join_41;
    }
    if (!((spill1038_2 < 0))) {
        break lexical_join_37;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_40;
    }
    }
    life6_27 += -1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1038_41_0 = life6_27;
    }
    if (!((lexicalValue1038_41_0 == life5_25))) {
        break lexical_join_45;
    }
    lexicalValue1038_49_0 = p0;
    break lexical_join_49;
    }
    lexicalValue1038_49_0 = ((java.lang.String)(p0)).substring(((int)(0)), ((int)(life6_27)));
    }
    return lexicalValue1038_49_0;
    }
    lexicalValue1038_51_0 = p0;
    }
    return lexicalValue1038_51_0;
}


public static java.lang.String f(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2929_23_0;
    java.lang.String spill2929_0;
    java.lang.String spill2929_1;
    long life2_3;
    int life4_5;
    java.lang.String life0_26;
    forward_join_23: {
    forward_join_22: {
    life2_3 = (moom.Ob.a ^ 12081534125079L);
    life4_5 = moom.Ob.c();
    spill2929_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2929_23_0 = spill2929_0;
        break forward_join_23;
    }
    if (!((spill2929_0 != null))) {
        break forward_join_22;
    }
    spill2929_1 = p1;
    if (!((life4_5 != 0))) {
        forwardValue2929_23_0 = spill2929_1;
        break forward_join_23;
    }
    if (!((spill2929_1 != null))) {
        break forward_join_22;
    }
    life0_26 = moom.Ob.g(((java.lang.String)(p0)), ((java.lang.String)(p1)));
    p0 = moom.Ob.h(((java.lang.String)(life0_26)), ((java.lang.String)(p1)));
    }
    forwardValue2929_23_0 = p0;
    }
    return forwardValue2929_23_0;
}


public static java.lang.String d(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2925_11_0;
    java.lang.String forwardValue2925_15_0;
    java.lang.String forwardValue2925_24_0;
    java.lang.String forwardValue2925_24_1;
    java.lang.String forwardValue2925_27_0;
    java.lang.String spill2925_0;
    java.lang.String spill2925_1;
    long life2_3;
    int life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    forward_join_22: {
    forward_join_15: {
    forward_join_11: {
    life2_3 = (moom.Ob.a ^ 57930874163521L);
    life4_5 = moom.Ob.c();
    spill2925_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2925_11_0 = spill2925_0;
        break forward_join_11;
    }
    if (!((spill2925_0 != null))) {
        break forward_join_26;
    }
    forwardValue2925_11_0 = p1;
    }
    if (!((life4_5 != 0))) {
        forwardValue2925_15_0 = forwardValue2925_11_0;
        break forward_join_15;
    }
    if (!((forwardValue2925_11_0 != null))) {
        break forward_join_26;
    }
    forwardValue2925_15_0 = p0;
    }
    spill2925_1 = p1;
    if (!((life4_5 != 0))) {
        forwardValue2925_24_0 = forwardValue2925_15_0;
        forwardValue2925_24_1 = spill2925_1;
        break forward_join_24;
    }
    if (!(((java.lang.String)(forwardValue2925_15_0)).endsWith(((java.lang.String)(spill2925_1))))) {
        break forward_join_22;
    }
    forwardValue2925_27_0 = p0;
    break forward_join_27;
    }
    forwardValue2925_24_0 = p0;
    forwardValue2925_24_1 = p1;
    }
    forwardValue2925_27_0 = __sourceIntrinsic_731c68104822_invokedynamic2925_3(forwardValue2925_24_0, forwardValue2925_24_1);
    break forward_join_27;
    }
    forwardValue2925_27_0 = p0;
    }
    return forwardValue2925_27_0;
}


public static boolean d(java.lang.String p0, java.lang.String p1, char p2) {
int lexicalValue1036_23_0;
    int lexicalValue1036_40_0;
    java.lang.String lexicalValue1036_73_0;
    java.lang.String lexicalValue1036_89_0;
    int lexicalValue1036_99_0;
    int lexicalValue1036_133_0;
    int lexicalValue1036_138_0;
    java.lang.String lexicalValue1036_140_0;
    int lexicalValue1036_145_0;
    java.lang.String spill1036_0;
    java.lang.String spill1036_1;
    int spill1036_2;
    boolean spill1036_3;
    java.lang.String spill1036_4;
    java.lang.String spill1036_5;
    boolean spill1036_6;
    int spill1036_7;
    int spill1036_8;
    long life3_3;
    int life5_5;
    java.util.ArrayList life6_45;
    java.lang.String life7_48;
    java.util.StringTokenizer life8_70;
    java.lang.String life9_106;
    java.lang.String life10_127;
    int life11_142;
    int life12_144;
    java.lang.String life13_153;
    int life14_171;
    lexical_join_145: {
    lexical_join_144: {
    lexical_join_140: {
    lexical_join_139: {
    lexical_join_138: {
    lexical_join_137: {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_89: {
    lexical_join_82: {
    lexical_join_73: {
    lexical_join_69: {
    lexical_join_59: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_24: {
    lexical_join_23: {
    life3_3 = (moom.Ob.a ^ 29925583743588L);
    life5_5 = moom.Ob.c();
    spill1036_0 = p1;
    if (!((life5_5 != 0))) {
        lexicalValue1036_140_0 = spill1036_0;
        break lexical_join_140;
    }
    if (!((spill1036_0 != null))) {
        break lexical_join_139;
    }
    spill1036_1 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1036_140_0 = spill1036_1;
        break lexical_join_140;
    }
    if (!((spill1036_1 != null))) {
        break lexical_join_139;
    }
    spill1036_2 = ((java.lang.String)(p1)).indexOf(((int)(p2)));
    if (!((life5_5 != 0))) {
        lexicalValue1036_23_0 = spill1036_2;
        break lexical_join_23;
    }
    if (!((spill1036_2 < 0))) {
        break lexical_join_24;
    }
    lexicalValue1036_23_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    return ((lexicalValue1036_23_0) != 0);
    }
    life6_45 = new java.util.ArrayList();
    life7_48 = __sourceIntrinsic_e8c03475287c_invokedynamic1036_6(p2);
    spill1036_3 = ((java.lang.String)(p1)).startsWith(((java.lang.String)(life7_48)));
    if (!((life5_5 != 0))) {
        lexicalValue1036_40_0 = ((spill1036_3) ? 1 : 0);
        break lexical_join_40;
    }
    if (!(spill1036_3)) {
        break lexical_join_41;
    }
    lexicalValue1036_40_0 = ((((java.util.List)(life6_45)).add(((java.lang.Object)("")))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1036_40_0);
    }
    life8_70 = new java.util.StringTokenizer(p1, life7_48);
    lexical_cycle_47: while (true) {
    if (!(((java.util.StringTokenizer)(life8_70)).hasMoreElements())) {
        break lexical_join_59;
    }
    ((java.util.List)(life6_45)).add(((java.lang.Object)(((java.util.StringTokenizer)(life8_70)).nextToken())));
    if (!((life5_5 != 0))) {
        break lexical_join_69;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    spill1036_4 = p1;
    if (!((life5_5 != 0))) {
        lexicalValue1036_73_0 = spill1036_4;
        break lexical_join_73;
    }
    if (!(((java.lang.String)(spill1036_4)).endsWith(((java.lang.String)(life7_48))))) {
        break lexical_join_69;
    }
    ((java.util.List)(life6_45)).add(((java.lang.Object)("")));
    }
    lexicalValue1036_73_0 = ((java.lang.String)(((java.util.List)(life6_45)).get(((int)(0)))));
    }
    life9_106 = lexicalValue1036_73_0;
    spill1036_5 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1036_89_0 = spill1036_5;
        break lexical_join_89;
    }
    if (!((!((java.lang.String)(spill1036_5)).startsWith(((java.lang.String)(life9_106)))))) {
        break lexical_join_82;
    }
    return ((0) != 0);
    }
    lexicalValue1036_89_0 = ((java.lang.String)(((java.util.List)(life6_45)).get(((int)((((java.util.List)(life6_45)).size() - 1))))));
    }
    life10_127 = lexicalValue1036_89_0;
    spill1036_6 = ((java.lang.String)(p0)).endsWith(((java.lang.String)(life10_127)));
    if (!((life5_5 != 0))) {
        lexicalValue1036_99_0 = ((spill1036_6) ? 1 : 0);
        break lexical_join_99;
    }
    if (!((!spill1036_6))) {
        break lexical_join_98;
    }
    return ((0) != 0);
    }
    lexicalValue1036_99_0 = 0;
    }
    life11_142 = lexicalValue1036_99_0;
    life12_144 = 0;
    lexical_cycle_102: while (true) {
    lexical_join_135: {
    lexical_join_134: {
    lexical_join_133: {
    lexical_join_129: {
    if (!((life12_144 < ((java.util.List)(life6_45)).size()))) {
        break lexical_join_137;
    }
    life13_153 = ((java.lang.String)(((java.util.List)(life6_45)).get(((int)(life12_144)))));
    if (!((life5_5 != 0))) {
        break lexical_join_135;
    }
    spill1036_7 = ((java.lang.String)(life13_153)).length();
    if (!((life5_5 != 0))) {
        lexicalValue1036_138_0 = spill1036_7;
        break lexical_join_138;
    }
    if (!((spill1036_7 > 0))) {
        break lexical_join_134;
    }
    life14_171 = ((java.lang.String)(p0)).indexOf(((java.lang.String)(life13_153)), ((int)(life11_142)));
    spill1036_8 = life14_171;
    if (!((life5_5 != 0))) {
        lexicalValue1036_133_0 = spill1036_8;
        break lexical_join_133;
    }
    if (!((spill1036_8 < 0))) {
        break lexical_join_129;
    }
    return ((0) != 0);
    }
    lexicalValue1036_133_0 = (life14_171 + ((java.lang.String)(life13_153)).length());
    }
    life11_142 = lexicalValue1036_133_0;
    }
    life12_144 += 1;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_102; }
    break lexical_cycle_102;
    }
    }
    lexicalValue1036_138_0 = 1;
    }
    return ((lexicalValue1036_138_0) != 0);
    }
    lexicalValue1036_140_0 = p1;
    }
    if (!((lexicalValue1036_140_0 == p0))) {
        break lexical_join_144;
    }
    lexicalValue1036_145_0 = 1;
    break lexical_join_145;
    }
    lexicalValue1036_145_0 = 0;
    }
    return ((lexicalValue1036_145_0) != 0);
}


public static java.lang.String d(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
java.lang.String forwardValue2927_11_0;
    java.lang.String forwardValue2927_15_0;
    java.lang.String forwardValue2927_19_0;
    int forwardValue2927_32_0;
    java.lang.String forwardValue2927_44_0;
    java.lang.String spill2927_0;
    int spill2927_1;
    long life3_3;
    int life5_5;
    int life6_30;
    int life7_46;
    forward_join_45: {
    forward_join_44: {
    forward_join_37: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    forward_join_15: {
    forward_join_11: {
    life3_3 = (moom.Ob.a ^ 85104795055737L);
    life5_5 = moom.Ob.c();
    spill2927_0 = p0;
    if (!((life5_5 != 0))) {
        forwardValue2927_11_0 = spill2927_0;
        break forward_join_11;
    }
    if (!((spill2927_0 != null))) {
        break forward_join_45;
    }
    forwardValue2927_11_0 = p1;
    }
    if (!((life5_5 != 0))) {
        forwardValue2927_15_0 = forwardValue2927_11_0;
        break forward_join_15;
    }
    if (!((forwardValue2927_11_0 != null))) {
        break forward_join_45;
    }
    forwardValue2927_15_0 = p2;
    }
    if (!((life5_5 != 0))) {
        forwardValue2927_19_0 = forwardValue2927_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2927_15_0 != null))) {
        break forward_join_45;
    }
    forwardValue2927_19_0 = p0;
    }
    life6_30 = ((java.lang.String)(forwardValue2927_19_0)).indexOf(((java.lang.String)(p1)));
    spill2927_1 = life6_30;
    if (!((life5_5 != 0))) {
        forwardValue2927_32_0 = spill2927_1;
        break forward_join_32;
    }
    if (!((spill2927_1 < 0))) {
        break forward_join_28;
    }
    return null;
    }
    forwardValue2927_32_0 = ((java.lang.String)(p0)).indexOf(((java.lang.String)(p2)), ((int)(life6_30)));
    }
    life7_46 = forwardValue2927_32_0;
    if (!((life7_46 < 0))) {
        break forward_join_37;
    }
    forwardValue2927_44_0 = null;
    break forward_join_44;
    }
    forwardValue2927_44_0 = ((java.lang.String)(p0)).substring(((int)(life6_30)), ((int)((life7_46 + ((java.lang.String)(p2)).length()))));
    }
    return forwardValue2927_44_0;
    }
    return null;
}


public static java.lang.String a(java.lang.String p0, java.lang.String[] p1) {
java.lang.String lexicalValue1026_47_0;
    java.lang.String spill1026_0;
    java.lang.String spill1026_1;
    long life2_3;
    int life4_5;
    int life5_20;
    java.lang.String[] life6_22;
    int life7_25;
    int life8_27;
    java.lang.String life9_34;
    lexical_join_47: {
    lexical_join_46: {
    life2_3 = (moom.Ob.a ^ 23153690326005L);
    life4_5 = moom.Ob.b();
    spill1026_0 = p0;
    if (!((life4_5 == 0))) {
        lexicalValue1026_47_0 = spill1026_0;
        break lexical_join_47;
    }
    if (!((spill1026_0 != null))) {
        break lexical_join_46;
    }
    if (!((p1 != null))) {
        break lexical_join_46;
    }
    life5_20 = ((java.lang.String)(p0)).length();
    life6_22 = p1;
    life7_25 = (life6_22).length;
    life8_27 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    if (!((life8_27 < life7_25))) {
        break lexical_join_46;
    }
    life9_34 = (life6_22)[life8_27];
    p0 = moom.Ob.c(((java.lang.String)(p0)), ((java.lang.String)(life9_34)));
    if (!((life4_5 == 0))) {
        break lexical_join_44;
    }
    spill1026_1 = p0;
    if (!((life4_5 == 0))) {
        lexicalValue1026_47_0 = spill1026_1;
        break lexical_join_47;
    }
    if (!((((java.lang.String)(spill1026_1)).length() != life5_20))) {
        break lexical_join_43;
    }
    if (!((life4_5 != 0))) {
        break lexical_join_46;
    }
    }
    life8_27 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue1026_47_0 = p0;
    }
    return lexicalValue1026_47_0;
}


public static java.lang.String a(java.lang.String p0, java.lang.String[] p1, java.lang.String[] p2) {
p0 = moom.Ob.b(((java.lang.String)(p0)), ((java.lang.String[])(p1)));
    p0 = moom.Ob.a(((java.lang.String)(p0)), ((java.lang.String[])(p2)));
    return p0;
}


public static boolean a(java.lang.String p0, java.lang.String p1, char p2, char p3) {
int lexicalValue1024_25_0;
    java.lang.String lexicalValue1024_31_0;
    int lexicalValue1024_34_0;
    int lexicalValue1024_51_0;
    java.lang.String lexicalValue1024_84_0;
    java.lang.String lexicalValue1024_101_0;
    int lexicalValue1024_112_0;
    int lexicalValue1024_147_0;
    int lexicalValue1024_152_0;
    java.lang.String lexicalValue1024_154_0;
    int lexicalValue1024_159_0;
    java.lang.String spill1024_0;
    java.lang.String spill1024_1;
    int spill1024_2;
    java.lang.String spill1024_3;
    boolean spill1024_4;
    java.lang.String spill1024_5;
    java.lang.String spill1024_6;
    boolean spill1024_7;
    int spill1024_8;
    int spill1024_9;
    long life4_3;
    int life6_5;
    java.util.ArrayList life7_61;
    java.lang.String life8_64;
    java.util.StringTokenizer life9_86;
    java.lang.String life10_122;
    java.lang.String life11_144;
    int life12_160;
    int life13_162;
    java.lang.String life14_171;
    int life15_190;
    lexical_join_159: {
    lexical_join_158: {
    lexical_join_154: {
    lexical_join_153: {
    lexical_join_152: {
    lexical_join_151: {
    lexical_join_112: {
    lexical_join_111: {
    lexical_join_101: {
    lexical_join_94: {
    lexical_join_84: {
    lexical_join_80: {
    lexical_join_70: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_25: {
    life4_3 = (moom.Ob.a ^ 57811518307902L);
    life6_5 = moom.Ob.b();
    spill1024_0 = p1;
    if (!((life6_5 == 0))) {
        lexicalValue1024_154_0 = spill1024_0;
        break lexical_join_154;
    }
    if (!((spill1024_0 != null))) {
        break lexical_join_153;
    }
    spill1024_1 = p0;
    if (!((life6_5 == 0))) {
        lexicalValue1024_154_0 = spill1024_1;
        break lexical_join_154;
    }
    if (!((spill1024_1 != null))) {
        break lexical_join_153;
    }
    spill1024_2 = ((java.lang.String)(p1)).indexOf(((int)(p2)));
    if (!((life6_5 == 0))) {
        lexicalValue1024_25_0 = spill1024_2;
        break lexical_join_25;
    }
    if (!((spill1024_2 < 0))) {
        break lexical_join_35;
    }
    spill1024_3 = p1;
    if (!((life6_5 == 0))) {
        lexicalValue1024_31_0 = spill1024_3;
        break lexical_join_31;
    }
    lexicalValue1024_25_0 = ((java.lang.String)(spill1024_3)).indexOf(((int)(p3)));
    }
    if (!((lexicalValue1024_25_0 < 0))) {
        break lexical_join_30;
    }
    lexicalValue1024_34_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(p0)))) ? 1 : 0);
    break lexical_join_34;
    }
    lexicalValue1024_31_0 = p0;
    }
    lexicalValue1024_34_0 = ((moom.Ob.a(((java.lang.String)(lexicalValue1024_31_0)), ((java.lang.String)(p1)), ((char)(p3)))) ? 1 : 0);
    }
    return ((lexicalValue1024_34_0) != 0);
    }
    life7_61 = new java.util.ArrayList();
    life8_64 = __sourceIntrinsic_09171ee69e94_invokedynamic1024_9(p2);
    spill1024_4 = ((java.lang.String)(p1)).startsWith(((java.lang.String)(life8_64)));
    if (!((life6_5 == 0))) {
        lexicalValue1024_51_0 = ((spill1024_4) ? 1 : 0);
        break lexical_join_51;
    }
    if (!(spill1024_4)) {
        break lexical_join_52;
    }
    lexicalValue1024_51_0 = ((((java.util.List)(life7_61)).add(((java.lang.Object)("")))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1024_51_0);
    }
    life9_86 = new java.util.StringTokenizer(p1, life8_64);
    lexical_cycle_58: while (true) {
    if (!(((java.util.StringTokenizer)(life9_86)).hasMoreElements())) {
        break lexical_join_70;
    }
    ((java.util.List)(life7_61)).add(((java.lang.Object)(((java.util.StringTokenizer)(life9_86)).nextToken())));
    if (!((life6_5 == 0))) {
        break lexical_join_80;
    }
    if (!((life6_5 != 0))) { continue lexical_cycle_58; }
    break lexical_cycle_58;
    }
    }
    spill1024_5 = p1;
    if (!((life6_5 == 0))) {
        lexicalValue1024_84_0 = spill1024_5;
        break lexical_join_84;
    }
    if (!(((java.lang.String)(spill1024_5)).endsWith(((java.lang.String)(life8_64))))) {
        break lexical_join_80;
    }
    ((java.util.List)(life7_61)).add(((java.lang.Object)("")));
    }
    lexicalValue1024_84_0 = ((java.lang.String)(((java.util.List)(life7_61)).get(((int)(0)))));
    }
    life10_122 = lexicalValue1024_84_0;
    spill1024_6 = p0;
    if (!((life6_5 == 0))) {
        lexicalValue1024_101_0 = spill1024_6;
        break lexical_join_101;
    }
    if (!((!moom.Ob.c(((java.lang.String)(spill1024_6)), ((java.lang.String)(life10_122)), ((char)(p3)))))) {
        break lexical_join_94;
    }
    return ((0) != 0);
    }
    lexicalValue1024_101_0 = ((java.lang.String)(((java.util.List)(life7_61)).get(((int)((((java.util.List)(life7_61)).size() - 1))))));
    }
    life11_144 = lexicalValue1024_101_0;
    spill1024_7 = moom.Ob.b(((java.lang.String)(p0)), ((java.lang.String)(life11_144)), ((char)(p3)));
    if (!((life6_5 == 0))) {
        lexicalValue1024_112_0 = ((spill1024_7) ? 1 : 0);
        break lexical_join_112;
    }
    if (!((!spill1024_7))) {
        break lexical_join_111;
    }
    return ((0) != 0);
    }
    lexicalValue1024_112_0 = 0;
    }
    life12_160 = lexicalValue1024_112_0;
    life13_162 = 0;
    lexical_cycle_115: while (true) {
    lexical_join_149: {
    lexical_join_148: {
    lexical_join_147: {
    lexical_join_143: {
    if (!((life13_162 < ((java.util.List)(life7_61)).size()))) {
        break lexical_join_151;
    }
    life14_171 = ((java.lang.String)(((java.util.List)(life7_61)).get(((int)(life13_162)))));
    if (!((life6_5 == 0))) {
        break lexical_join_149;
    }
    spill1024_8 = ((java.lang.String)(life14_171)).length();
    if (!((life6_5 == 0))) {
        lexicalValue1024_152_0 = spill1024_8;
        break lexical_join_152;
    }
    if (!((spill1024_8 > 0))) {
        break lexical_join_148;
    }
    life15_190 = moom.Ob.a(((java.lang.String)(p0)), ((java.lang.String)(life14_171)), ((int)(life12_160)), ((char)(p3)));
    spill1024_9 = life15_190;
    if (!((life6_5 == 0))) {
        lexicalValue1024_147_0 = spill1024_9;
        break lexical_join_147;
    }
    if (!((spill1024_9 < 0))) {
        break lexical_join_143;
    }
    return ((0) != 0);
    }
    lexicalValue1024_147_0 = (life15_190 + ((java.lang.String)(life14_171)).length());
    }
    life12_160 = lexicalValue1024_147_0;
    }
    life13_162 += 1;
    }
    if (!((life6_5 != 0))) { continue lexical_cycle_115; }
    break lexical_cycle_115;
    }
    }
    lexicalValue1024_152_0 = 1;
    }
    return ((lexicalValue1024_152_0) != 0);
    }
    lexicalValue1024_154_0 = p1;
    }
    if (!((lexicalValue1024_154_0 == p0))) {
        break lexical_join_158;
    }
    lexicalValue1024_159_0 = 1;
    break lexical_join_159;
    }
    lexicalValue1024_159_0 = 0;
    }
    return ((lexicalValue1024_159_0) != 0);
}


private static boolean a(java.lang.String p0, java.lang.String p1, char p2) {
int lexicalValue1023_24_0;
    int lexicalValue1023_48_0;
    int lexicalValue1023_53_0;
    java.lang.String lexicalValue1023_55_0;
    int lexicalValue1023_60_0;
    java.lang.String spill1023_0;
    java.lang.String spill1023_1;
    int spill1023_2;
    int spill1023_3;
    char spill1023_4;
    long life3_3;
    int life5_5;
    int life6_41;
    int life7_49;
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_55: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_24: {
    lexical_join_23: {
    life3_3 = (moom.Ob.a ^ 70696398121128L);
    life5_5 = moom.Ob.b();
    spill1023_0 = p0;
    if (!((life5_5 == 0))) {
        lexicalValue1023_55_0 = spill1023_0;
        break lexical_join_55;
    }
    if (!((spill1023_0 != null))) {
        break lexical_join_54;
    }
    spill1023_1 = p1;
    if (!((life5_5 == 0))) {
        lexicalValue1023_55_0 = spill1023_1;
        break lexical_join_55;
    }
    if (!((spill1023_1 != null))) {
        break lexical_join_54;
    }
    spill1023_2 = ((java.lang.String)(p0)).length();
    if (!((life5_5 == 0))) {
        lexicalValue1023_24_0 = spill1023_2;
        break lexical_join_24;
    }
    if (!((spill1023_2 != ((java.lang.String)(p1)).length()))) {
        break lexical_join_23;
    }
    return ((0) != 0);
    }
    lexicalValue1023_24_0 = 0;
    }
    life6_41 = lexicalValue1023_24_0;
    lexical_cycle_25: while (true) {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_48: {
    if (!((life6_41 < ((java.lang.String)(p1)).length()))) {
        break lexical_join_52;
    }
    life7_49 = ((int)(((java.lang.String)(p1)).charAt(((int)(life6_41)))));
    if (!((life5_5 == 0))) {
        break lexical_join_50;
    }
    spill1023_3 = life7_49;
    if (!((life5_5 == 0))) {
        lexicalValue1023_53_0 = spill1023_3;
        break lexical_join_53;
    }
    if (!((spill1023_3 != p2))) {
        break lexical_join_49;
    }
    spill1023_4 = ((java.lang.String)(p0)).charAt(((int)(life6_41)));
    if (!((life5_5 == 0))) {
        lexicalValue1023_48_0 = ((int)(spill1023_4));
        break lexical_join_48;
    }
    if (!((spill1023_4 != life7_49))) {
        break lexical_join_49;
    }
    lexicalValue1023_48_0 = 0;
    }
    return ((lexicalValue1023_48_0) != 0);
    }
    life6_41 += 1;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue1023_53_0 = 1;
    }
    return ((lexicalValue1023_53_0) != 0);
    }
    lexicalValue1023_55_0 = p0;
    }
    if (!((lexicalValue1023_55_0 == p1))) {
        break lexical_join_59;
    }
    lexicalValue1023_60_0 = 1;
    break lexical_join_60;
    }
    lexicalValue1023_60_0 = 0;
    }
    return ((lexicalValue1023_60_0) != 0);
}


private static int a(java.lang.String p0, java.lang.String p1, int p2, char p3) {
java.lang.String lexicalValue1025_11_0;
    int lexicalValue1025_63_0;
    java.lang.String spill1025_0;
    int spill1025_1;
    int spill1025_2;
    int spill1025_3;
    boolean spill1025_4;
    long life4_3;
    int life6_5;
    int life7_53;
    java.lang.String life8_68;
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_11: {
    life4_3 = (moom.Ob.a ^ 80773511056505L);
    life6_5 = moom.Ob.c();
    spill1025_0 = p0;
    if (!((life6_5 != 0))) {
        lexicalValue1025_11_0 = spill1025_0;
        break lexical_join_11;
    }
    if (!((spill1025_0 != null))) {
        break lexical_join_64;
    }
    lexicalValue1025_11_0 = p1;
    }
    if (!((lexicalValue1025_11_0 != null))) {
        break lexical_join_64;
    }
    spill1025_1 = p2;
    if (!((life6_5 != 0))) {
        lexicalValue1025_63_0 = spill1025_1;
        break lexical_join_63;
    }
    if (!((spill1025_1 >= 0))) {
        break lexical_join_62;
    }
    spill1025_2 = p2;
    if (!((life6_5 != 0))) {
        lexicalValue1025_63_0 = spill1025_2;
        break lexical_join_63;
    }
    if (!((spill1025_2 <= ((java.lang.String)(p0)).length()))) {
        break lexical_join_62;
    }
    spill1025_3 = ((java.lang.String)(p0)).length();
    if (!((life6_5 != 0))) {
        lexicalValue1025_63_0 = spill1025_3;
        break lexical_join_63;
    }
    if (!((spill1025_3 >= (p2 + ((java.lang.String)(p1)).length())))) {
        break lexical_join_62;
    }
    life7_53 = p2;
    lexical_cycle_33: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    if (!(((life7_53 + ((java.lang.String)(p1)).length()) <= ((java.lang.String)(p0)).length()))) {
        break lexical_join_62;
    }
    life8_68 = ((java.lang.String)(p0)).substring(((int)(life7_53)), ((int)((life7_53 + ((java.lang.String)(p1)).length()))));
    if (!((life6_5 != 0))) {
        break lexical_join_60;
    }
    spill1025_4 = moom.Ob.a(((java.lang.String)(life8_68)), ((java.lang.String)(p1)), ((char)(p3)));
    if (!((life6_5 != 0))) {
        lexicalValue1025_63_0 = ((spill1025_4) ? 1 : 0);
        break lexical_join_63;
    }
    if (!(spill1025_4)) {
        break lexical_join_59;
    }
    return life7_53;
    }
    life7_53 += 1;
    }
    if (!((life6_5 == 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    lexicalValue1025_63_0 = -1;
    }
    return lexicalValue1025_63_0;
    }
    return -1;
}


private static java.lang.NumberFormatException a(java.lang.NumberFormatException p0) {
return p0;
}


public static boolean a__Boolean(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2913_14_0;
    java.lang.String forwardValue2913_21_0;
    java.lang.String spill2913_0;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.Ob.a ^ 132314637137002L);
    life4_5 = moom.Ob.b();
    spill2913_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2913_14_0 = spill2913_0;
        break forward_join_14;
    }
    if (!((spill2913_0 != null))) {
        break forward_join_13;
    }
    p0 = ((java.lang.String)(p0)).trim();
    }
    forwardValue2913_14_0 = p1;
    }
    if (!((life4_5 == 0))) {
        forwardValue2913_21_0 = forwardValue2913_14_0;
        break forward_join_21;
    }
    if (!((forwardValue2913_14_0 != null))) {
        break forward_join_20;
    }
    p1 = ((java.lang.String)(p1)).trim();
    }
    forwardValue2913_21_0 = p0;
    }
    return moom.Ob.a(((java.lang.Object)(forwardValue2913_21_0)), ((java.lang.Object)(p1)));
}


public static java.lang.String a(java.lang.String p0, java.lang.String p1) {
java.lang.StringBuilder lexicalValue1022_33_0;
    java.lang.String lexicalValue1022_41_0;
    int spill1022_0;
    java.lang.StringBuilder spill1022_1;
    java.lang.String spill1022_2;
    long life2_3;
    java.lang.StringBuilder life5_9;
    int life6_11;
    int life4_12;
    java.lang.String life0_48;
    lexical_join_41: {
    lexical_join_37: {
    life2_3 = (moom.Ob.a ^ 130961110603860L);
    spill1022_0 = moom.Ob.c();
    life5_9 = new java.lang.StringBuilder(p0);
    life6_11 = 0;
    life4_12 = spill1022_0;
    lexical_cycle_13: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life6_11 < ((java.lang.String)(p1)).length()))) {
        break lexical_join_37;
    }
    spill1022_1 = life5_9;
    if (!((life4_12 != 0))) {
        lexicalValue1022_33_0 = spill1022_1;
        break lexical_join_33;
    }
    spill1022_2 = ((java.lang.StringBuilder)(spill1022_1)).toString();
    if (!((life4_12 != 0))) {
        lexicalValue1022_41_0 = spill1022_2;
        break lexical_join_41;
    }
    if (!((((java.lang.String)(spill1022_2)).indexOf(((int)(((java.lang.String)(p1)).charAt(((int)(life6_11)))))) < 0))) {
        break lexical_join_34;
    }
    lexicalValue1022_33_0 = ((java.lang.StringBuilder)(life5_9)).append(((char)(((java.lang.String)(p1)).charAt(((int)(life6_11))))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1022_33_0);
    }
    life6_11 += 1;
    if (!((life4_12 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    life0_48 = ((java.lang.StringBuilder)(life5_9)).toString();
    lexicalValue1022_41_0 = life0_48;
    }
    return lexicalValue1022_41_0;
}


public static java.lang.String a(java.lang.String p0, int p1, char p2) {
java.lang.String lexicalValue1021_13_0;
    java.lang.String lexicalValue1021_19_0;
    java.lang.StringBuilder lexicalValue1021_42_0;
    java.lang.String spill1021_0;
    java.lang.StringBuilder spill1021_1;
    long life3_3;
    int life5_5;
    java.lang.StringBuilder life6_32;
    int life7_37;
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_20: {
    lexical_join_19: {
    lexical_join_13: {
    lexical_join_12: {
    life3_3 = (moom.Ob.a ^ 60352058840071L);
    life5_5 = moom.Ob.c();
    spill1021_0 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1021_13_0 = spill1021_0;
        break lexical_join_13;
    }
    if (!((spill1021_0 == null))) {
        break lexical_join_12;
    }
    p0 = "";
    }
    lexicalValue1021_13_0 = p0;
    }
    if (!((life5_5 != 0))) {
        lexicalValue1021_19_0 = lexicalValue1021_13_0;
        break lexical_join_19;
    }
    if (!((((java.lang.String)(lexicalValue1021_13_0)).length() >= p1))) {
        break lexical_join_20;
    }
    lexicalValue1021_19_0 = p0;
    }
    return lexicalValue1021_19_0;
    }
    life6_32 = new java.lang.StringBuilder();
    life7_37 = (p1 - ((java.lang.String)(p0)).length());
    lexical_cycle_29: while (true) {
    if (!((((java.lang.StringBuilder)(life6_32)).length() < life7_37))) {
        break lexical_join_41;
    }
    spill1021_1 = ((java.lang.StringBuilder)(life6_32)).append(((char)(p2)));
    if (!((life5_5 != 0))) {
        lexicalValue1021_42_0 = spill1021_1;
        break lexical_join_42;
    }
    recovery.source.CarrierOps.discard(spill1021_1);
    if (!((life5_5 == 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    lexicalValue1021_42_0 = life6_32;
    }
    return __sourceIntrinsic_78c8e654a72f_invokedynamic1021_7(lexicalValue1021_42_0, p0);
}


private static boolean a(char p0, java.lang.String p1) {
int lexicalValue1020_22_0;
    int lexicalValue1020_27_0;
    int spill1020_0;
    char spill1020_1;
    long life2_3;
    int life5_6;
    int life4_7;
    lexical_join_27: {
    lexical_join_26: {
    life2_3 = (moom.Ob.a ^ 121354554945738L);
    spill1020_0 = moom.Ob.c();
    life5_6 = 0;
    life4_7 = spill1020_0;
    lexical_cycle_8: while (true) {
    lexical_join_23: {
    lexical_join_22: {
    if (!((life5_6 < ((java.lang.String)(p1)).length()))) {
        break lexical_join_26;
    }
    spill1020_1 = ((java.lang.String)(p1)).charAt(((int)(life5_6)));
    if (!((life4_7 != 0))) {
        lexicalValue1020_27_0 = ((int)(spill1020_1));
        break lexical_join_27;
    }
    if (!((life4_7 != 0))) {
        lexicalValue1020_22_0 = ((int)(spill1020_1));
        break lexical_join_22;
    }
    if (!((spill1020_1 == p0))) {
        break lexical_join_23;
    }
    lexicalValue1020_22_0 = 1;
    }
    return ((lexicalValue1020_22_0) != 0);
    }
    life5_6 += 1;
    if (!((life4_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue1020_27_0 = 0;
    }
    return ((lexicalValue1020_27_0) != 0);
}


public static int a(java.lang.String p0, int p1) { return __sourceHandlerCall_ea0d38bf480a0a0bde50(p0, p1); }


public static java.lang.String a(java.lang.String p0) {
int forwardValue2900_19_0;
    int forwardValue2900_31_0;
    java.lang.String forwardValue2900_37_0;
    int spill2900_0;
    int spill2900_1;
    int spill2900_2;
    long life1_3;
    int life4_8;
    int life3_9;
    java.lang.String life5_25;
    forward_join_37: {
    forward_join_31: {
    forward_join_30: {
    forward_join_19: {
    forward_join_17: {
    life1_3 = (moom.Ob.a ^ 50071398742021L);
    spill2900_0 = moom.Ob.c();
    life4_8 = moom.Ob.a(((java.lang.String)(p0)), ((int)(-1)));
    life3_9 = spill2900_0;
    spill2900_1 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue2900_19_0 = spill2900_1;
        break forward_join_19;
    }
    if (!((spill2900_1 == -1))) {
        break forward_join_17;
    }
    return "";
    }
    life4_8 += 1;
    forwardValue2900_19_0 = life4_8;
    }
    life5_25 = __sourceIntrinsic_c43bc540f167_invokedynamic2900_3(forwardValue2900_19_0);
    spill2900_2 = ((java.lang.String)(life5_25)).length();
    if (!((life3_9 != 0))) {
        forwardValue2900_31_0 = spill2900_2;
        break forward_join_31;
    }
    if (!((spill2900_2 > ((java.lang.String)(p0)).length()))) {
        break forward_join_30;
    }
    forwardValue2900_37_0 = "";
    break forward_join_37;
    }
    forwardValue2900_31_0 = life4_8;
    }
    forwardValue2900_37_0 = moom.Ob.a(((java.lang.String)(__sourceIntrinsic_c43bc540f167_invokedynamic2900_6(forwardValue2900_31_0))), ((int)(((java.lang.String)(p0)).length())), ((char)(((int) moom.Ob.c))));
    }
    return forwardValue2900_37_0;
}


public static boolean a__Boolean(java.lang.String p0) {
java.lang.String forwardValue2912_12_0;
    int forwardValue2912_17_0;
    int forwardValue2912_19_0;
    java.lang.String spill2912_0;
    int spill2912_1;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (moom.Ob.a ^ 114176569935336L);
    life3_5 = moom.Ob.c();
    spill2912_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue2912_12_0 = spill2912_0;
        break forward_join_12;
    }
    if (!((spill2912_0 != null))) {
        break forward_join_16;
    }
    forwardValue2912_12_0 = ((java.lang.String)(p0)).trim();
    }
    spill2912_1 = ((java.lang.String)(forwardValue2912_12_0)).length();
    if (!((life3_5 != 0))) {
        forwardValue2912_17_0 = spill2912_1;
        break forward_join_17;
    }
    if (!((spill2912_1 == 0))) {
        break forward_join_18;
    }
    }
    forwardValue2912_17_0 = 1;
    }
    forwardValue2912_19_0 = forwardValue2912_17_0;
    break forward_join_19;
    }
    forwardValue2912_19_0 = 0;
    }
    return ((forwardValue2912_19_0) != 0);
}


public static java.lang.String a(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
java.lang.String forwardValue2906_23_0;
    java.lang.String forwardValue2906_40_0;
    java.lang.String forwardValue2906_42_0;
    java.lang.String spill2906_0;
    java.lang.String spill2906_1;
    java.lang.String spill2906_2;
    long life3_3;
    int life5_5;
    java.lang.String life0_56;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_28: {
    forward_join_23: {
    forward_join_22: {
    life3_3 = (moom.Ob.a ^ 33897952550745L);
    life5_5 = moom.Ob.b();
    spill2906_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2906_42_0 = spill2906_0;
        break forward_join_42;
    }
    if (!((spill2906_0 != null))) {
        break forward_join_41;
    }
    spill2906_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue2906_42_0 = spill2906_1;
        break forward_join_42;
    }
    if (!((spill2906_1 != null))) {
        break forward_join_41;
    }
    spill2906_2 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2906_23_0 = spill2906_2;
        break forward_join_23;
    }
    if (!((!((java.lang.String)(spill2906_2)).endsWith(((java.lang.String)(p1)))))) {
        break forward_join_22;
    }
    return p0;
    }
    forwardValue2906_23_0 = p2;
    }
    if (!((life5_5 == 0))) {
        forwardValue2906_40_0 = forwardValue2906_23_0;
        break forward_join_40;
    }
    if (!((forwardValue2906_23_0 == null))) {
        break forward_join_28;
    }
    p2 = "";
    }
    life0_56 = ((java.lang.String)(p0)).substring(((int)(0)), ((int)((((java.lang.String)(p0)).length() - ((java.lang.String)(p1)).length()))));
    forwardValue2906_40_0 = __sourceIntrinsic_b45982630ac3_invokedynamic2906_6(life0_56, p2);
    }
    return forwardValue2906_40_0;
    }
    forwardValue2906_42_0 = p0;
    }
    return forwardValue2906_42_0;
}


public static boolean a(java.lang.String p0, java.lang.String[] p1, char p2) {
int lexicalValue1027_35_0;
    int spill1027_0;
    boolean spill1027_1;
    long life3_3;
    java.lang.String[] life6_6;
    int life5_7;
    int life7_10;
    int life8_12;
    java.lang.String life9_19;
    lexical_join_35: {
    lexical_join_34: {
    life3_3 = (moom.Ob.a ^ 68948112100597L);
    spill1027_0 = moom.Ob.c();
    life6_6 = p1;
    life5_7 = spill1027_0;
    life7_10 = (life6_6).length;
    life8_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_32: {
    lexical_join_31: {
    if (!((life8_12 < life7_10))) {
        break lexical_join_34;
    }
    life9_19 = (life6_6)[life8_12];
    if (!((life5_7 != 0))) {
        break lexical_join_32;
    }
    spill1027_1 = moom.Ob.d(((java.lang.String)(p0)), ((java.lang.String)(life9_19)), ((char)(p2)));
    if (!((life5_7 != 0))) {
        lexicalValue1027_35_0 = ((spill1027_1) ? 1 : 0);
        break lexical_join_35;
    }
    if (!(spill1027_1)) {
        break lexical_join_31;
    }
    return ((1) != 0);
    }
    life8_12 += 1;
    }
    if (!((life5_7 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue1027_35_0 = 0;
    }
    return ((lexicalValue1027_35_0) != 0);
}


public static int a(java.lang.String[] p0, java.lang.String p1) {
int lexicalValue1029_34_0;
    boolean spill1029_0;
    long life2_3;
    int life4_5;
    int life5_14;
    java.lang.String life6_22;
    lexical_join_34: {
    lexical_join_33: {
    life2_3 = (moom.Ob.a ^ 71539928532876L);
    life4_5 = moom.Ob.b();
    if (!((p0 != null))) {
        break lexical_join_33;
    }
    if (!((p1 != null))) {
        break lexical_join_33;
    }
    life5_14 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life5_14 < (p0).length))) {
        break lexical_join_33;
    }
    life6_22 = (p0)[life5_14];
    if (!((life4_5 == 0))) {
        break lexical_join_31;
    }
    spill1029_0 = ((java.lang.String)(life6_22)).startsWith(((java.lang.String)(p1)));
    if (!((life4_5 == 0))) {
        lexicalValue1029_34_0 = ((spill1029_0) ? 1 : 0);
        break lexical_join_34;
    }
    if (!(spill1029_0)) {
        break lexical_join_30;
    }
    return life5_14;
    }
    life5_14 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1029_34_0 = -1;
    }
    return lexicalValue1029_34_0;
}


public static java.lang.String[] a(java.lang.String[] p0, int p1, int p2) {
java.lang.String[] lexicalValue1028_11_0;
    int lexicalValue1028_17_0;
    int lexicalValue1028_24_0;
    int lexicalValue1028_24_1;
    int lexicalValue1028_58_0;
    java.lang.String[] lexicalValue1028_67_0;
    java.lang.String[] spill1028_0;
    int spill1028_1;
    int spill1028_2;
    java.lang.String[] spill1028_3;
    int spill1028_4;
    int spill1028_5;
    long life3_3;
    int life5_5;
    java.util.ArrayList life6_46;
    int life7_48;
    java.lang.String life8_58;
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_62: {
    lexical_join_27: {
    lexical_join_24: {
    lexical_join_17: {
    lexical_join_12: {
    lexical_join_11: {
    life3_3 = (moom.Ob.a ^ 7395098814035L);
    life5_5 = moom.Ob.c();
    spill1028_0 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1028_11_0 = spill1028_0;
        break lexical_join_11;
    }
    if (!((spill1028_0 == null))) {
        break lexical_join_12;
    }
    lexicalValue1028_11_0 = p0;
    }
    return lexicalValue1028_11_0;
    }
    spill1028_1 = p2;
    if (!((life5_5 != 0))) {
        lexicalValue1028_17_0 = spill1028_1;
        break lexical_join_17;
    }
    if (!((spill1028_1 > 0))) {
        break lexical_join_68;
    }
    lexicalValue1028_17_0 = p1;
    }
    spill1028_2 = (p0).length;
    if (!((life5_5 != 0))) {
        lexicalValue1028_24_0 = lexicalValue1028_17_0;
        lexicalValue1028_24_1 = spill1028_2;
        break lexical_join_24;
    }
    if (!((lexicalValue1028_17_0 < spill1028_2))) {
        break lexical_join_68;
    }
    lexicalValue1028_24_0 = p1;
    lexicalValue1028_24_1 = p2;
    }
    if (!((lexicalValue1028_24_0 >= lexicalValue1028_24_1))) {
        break lexical_join_27;
    }
    return p0;
    }
    life6_46 = new java.util.ArrayList((p0).length);
    life7_48 = 0;
    lexical_cycle_35: while (true) {
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_55: {
    if (!((life7_48 < (p0).length))) {
        break lexical_join_62;
    }
    spill1028_3 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1028_67_0 = spill1028_3;
        break lexical_join_67;
    }
    life8_58 = (spill1028_3)[life7_48];
    spill1028_4 = life7_48;
    if (!((life5_5 != 0))) {
        lexicalValue1028_58_0 = spill1028_4;
        break lexical_join_58;
    }
    if (!((spill1028_4 >= p1))) {
        break lexical_join_55;
    }
    spill1028_5 = life7_48;
    if (!((life5_5 != 0))) {
        lexicalValue1028_58_0 = spill1028_5;
        break lexical_join_58;
    }
    if (!((spill1028_5 >= p2))) {
        break lexical_join_59;
    }
    }
    lexicalValue1028_58_0 = ((((java.util.List)(life6_46)).add(((java.lang.Object)(life8_58)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1028_58_0);
    }
    life7_48 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_35; }
    break lexical_cycle_35;
    }
    }
    lexicalValue1028_67_0 = ((java.lang.String[])(((java.util.List)(life6_46)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
    }
    return lexicalValue1028_67_0;
    }
    return p0;
}


public static boolean a(java.lang.Object p0, java.lang.Object p1) {
java.lang.Object forwardValue2899_12_0;
    java.lang.Object forwardValue2899_22_0;
    java.lang.Object forwardValue2899_26_0;
    int forwardValue2899_32_0;
    int forwardValue2899_34_0;
    java.lang.Object spill2899_0;
    boolean spill2899_1;
    boolean spill2899_2;
    long life2_3;
    int life4_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_26: {
    forward_join_22: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (moom.Ob.a ^ 52940586571131L);
    life4_5 = moom.Ob.c();
    spill2899_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2899_12_0 = spill2899_0;
        break forward_join_12;
    }
    if (!((spill2899_0 != p1))) {
        break forward_join_31;
    }
    forwardValue2899_12_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue2899_22_0 = forwardValue2899_12_0;
        break forward_join_22;
    }
    if (!((forwardValue2899_12_0 != null))) {
        break forward_join_21;
    }
    spill2899_1 = ((java.lang.Object)(p0)).equals(((java.lang.Object)(p1)));
    if (!((life4_5 != 0))) {
        forwardValue2899_32_0 = ((spill2899_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill2899_1))) {
        break forward_join_31;
    }
    }
    forwardValue2899_22_0 = p1;
    }
    if (!((life4_5 != 0))) {
        forwardValue2899_26_0 = forwardValue2899_22_0;
        break forward_join_26;
    }
    if (!((forwardValue2899_22_0 != null))) {
        break forward_join_33;
    }
    forwardValue2899_26_0 = p1;
    }
    spill2899_2 = ((java.lang.Object)(forwardValue2899_26_0)).equals(((java.lang.Object)(p0)));
    if (!((life4_5 != 0))) {
        forwardValue2899_32_0 = ((spill2899_2) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill2899_2)) {
        break forward_join_33;
    }
    }
    forwardValue2899_32_0 = 1;
    }
    forwardValue2899_34_0 = forwardValue2899_32_0;
    break forward_join_34;
    }
    forwardValue2899_34_0 = 0;
    }
    return ((forwardValue2899_34_0) != 0);
}


public static boolean a__Boolean(java.lang.String p0, java.lang.String[] p1) {
java.lang.String[] lexicalValue1031_17_0;
    int lexicalValue1031_44_0;
    java.lang.String[] spill1031_0;
    boolean spill1031_1;
    long life2_3;
    int life4_5;
    java.lang.String[] life5_24;
    int life6_27;
    int life7_29;
    java.lang.String life8_36;
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_17: {
    lexical_join_16: {
    lexical_join_10: {
    life2_3 = (moom.Ob.a ^ 104557448389095L);
    life4_5 = moom.Ob.c();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return ((0) != 0);
    }
    spill1031_0 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue1031_17_0 = spill1031_0;
        break lexical_join_17;
    }
    if (!((spill1031_0 == null))) {
        break lexical_join_16;
    }
    return ((0) != 0);
    }
    lexicalValue1031_17_0 = p1;
    }
    life5_24 = lexicalValue1031_17_0;
    life6_27 = (life5_24).length;
    life7_29 = 0;
    lexical_cycle_23: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!((life7_29 < life6_27))) {
        break lexical_join_43;
    }
    life8_36 = (life5_24)[life7_29];
    if (!((life4_5 != 0))) {
        break lexical_join_41;
    }
    spill1031_1 = ((java.lang.String)(p0)).startsWith(((java.lang.String)(life8_36)));
    if (!((life4_5 != 0))) {
        lexicalValue1031_44_0 = ((spill1031_1) ? 1 : 0);
        break lexical_join_44;
    }
    if (!(spill1031_1)) {
        break lexical_join_40;
    }
    return ((1) != 0);
    }
    life7_29 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue1031_44_0 = 0;
    }
    return ((lexicalValue1031_44_0) != 0);
}


public static java.lang.String[] a__ArrayString(java.lang.String p0, java.lang.String p1) {
java.lang.String lexicalValue1030_11_0;
    int lexicalValue1030_67_0;
    int lexicalValue1030_75_0;
    java.lang.String spill1030_0;
    int spill1030_1;
    boolean spill1030_2;
    long life2_3;
    int life4_5;
    java.util.ArrayList life5_38;
    int life6_40;
    int life7_42;
    int life8_50;
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_67: {
    lexical_join_62: {
    lexical_join_24: {
    lexical_join_11: {
    life2_3 = (moom.Ob.a ^ 87217234588753L);
    life4_5 = moom.Ob.c();
    spill1030_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue1030_11_0 = spill1030_0;
        break lexical_join_11;
    }
    if (!((spill1030_0 != null))) {
        break lexical_join_74;
    }
    lexicalValue1030_11_0 = p0;
    }
    spill1030_1 = ((java.lang.String)(lexicalValue1030_11_0)).length();
    if (!((life4_5 != 0))) {
        lexicalValue1030_75_0 = spill1030_1;
        break lexical_join_75;
    }
    if (!((spill1030_1 > 0))) {
        break lexical_join_74;
    }
    if (!((p1 == null))) {
        break lexical_join_24;
    }
    return new java.lang.String[] {p0};
    }
    life5_38 = new java.util.ArrayList();
    life6_40 = 0;
    life7_42 = 0;
    lexical_cycle_32: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    if (!((life7_42 < ((java.lang.String)(p0)).length()))) {
        break lexical_join_62;
    }
    life8_50 = ((int)(((java.lang.String)(p0)).charAt(((int)(life7_42)))));
    if (!((life4_5 != 0))) {
        break lexical_join_60;
    }
    spill1030_2 = moom.Ob.a(((char)(life8_50)), ((java.lang.String)(p1)));
    if (!((life4_5 != 0))) {
        lexicalValue1030_67_0 = ((spill1030_2) ? 1 : 0);
        break lexical_join_67;
    }
    if (!(spill1030_2)) {
        break lexical_join_59;
    }
    ((java.util.List)(life5_38)).add(((java.lang.Object)(((java.lang.String)(p0)).substring(((int)(life6_40)), ((int)(life7_42))))));
    life6_40 = (life7_42 + 1);
    }
    life7_42 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    lexicalValue1030_67_0 = ((((java.util.List)(life5_38)).add(((java.lang.Object)(((java.lang.String)(p0)).substring(((int)(life6_40))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1030_67_0);
    return ((java.lang.String[])(((java.util.List)(life5_38)).toArray(((java.lang.Object[])(new java.lang.String[0])))));
    }
    lexicalValue1030_75_0 = 0;
    }
    return new java.lang.String[lexicalValue1030_75_0];
}


public static java.lang.String g(java.lang.String p0, java.lang.String p1) {
java.lang.String lexicalValue1037_42_0;
    java.lang.String lexicalValue1037_44_0;
    java.lang.String spill1037_0;
    java.lang.String spill1037_1;
    java.lang.String spill1037_2;
    long life2_3;
    int life4_5;
    int life5_25;
    int life6_27;
    int life7_34;
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_41: {
    life2_3 = (moom.Ob.a ^ 14710579845879L);
    life4_5 = moom.Ob.b();
    spill1037_0 = p0;
    if (!((life4_5 == 0))) {
        lexicalValue1037_44_0 = spill1037_0;
        break lexical_join_44;
    }
    if (!((spill1037_0 != null))) {
        break lexical_join_43;
    }
    spill1037_1 = p1;
    if (!((life4_5 == 0))) {
        lexicalValue1037_44_0 = spill1037_1;
        break lexical_join_44;
    }
    if (!((spill1037_1 != null))) {
        break lexical_join_43;
    }
    life5_25 = ((java.lang.String)(p0)).length();
    life6_27 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life6_27 < life5_25))) {
        break lexical_join_41;
    }
    life7_34 = ((int)(((java.lang.String)(p0)).charAt(((int)(life6_27)))));
    if (!((life4_5 == 0))) {
        break lexical_join_39;
    }
    spill1037_2 = p1;
    if (!((life4_5 == 0))) {
        lexicalValue1037_42_0 = spill1037_2;
        break lexical_join_42;
    }
    if (!((((java.lang.String)(spill1037_2)).indexOf(((int)(life7_34))) < 0))) {
        break lexical_join_38;
    }
    return ((java.lang.String)(p0)).substring(((int)(life6_27)));
    }
    life6_27 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1037_42_0 = "";
    }
    return lexicalValue1037_42_0;
    }
    lexicalValue1037_44_0 = p0;
    }
    return lexicalValue1037_44_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic2900_3(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c43bc540f167_invokedynamic2900_6(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78c8e654a72f_invokedynamic1021_7(java.lang.StringBuilder a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_09171ee69e94_invokedynamic1024_9(char a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b45982630ac3_invokedynamic2906_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ae7e89080fc5_invokedynamic2919_5(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_731c68104822_invokedynamic2925_3(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e8c03475287c_invokedynamic1036_6(char a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bd2e92aaa49b_invokedynamic2928_3(java.lang.String a0, java.lang.String a1) throws E;
}
