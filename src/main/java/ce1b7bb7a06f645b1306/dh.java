package com.moon;

import me.xdrop.fuzzywuzzy.FuzzySearch;


public class dh<T extends java.lang.Enum<?>> extends com.moon.df<T> {

private com.moon.dw f;

private static java.lang.String[] g;

private static long h;

private static java.lang.String i;

public dh() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-4862489799887646203L)), ((long)(-162840742219599075L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(177235773675168L)))));
    java.lang.Object __sourceSpill70_6 = null;
    long local0_life7 = (com.moon.dh.h ^ 28592369616572L);
    com.moon.dh.b(((java.lang.String[])(__sourceSpill70_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill70_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill70_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill70_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill70_15 = new byte[8];
    (__sourceSpill70_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill70_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation70_17 = __sourceSpill70_15;
    ((javax.crypto.Cipher)(__sourceSpill70_12)).init(((int)(__sourceSpill70_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill70_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation70_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill70_21 = ((java.lang.String)("àá)Hk \025j\005s<e\027¾R=ø¾ÅÚ\022øó®FS¨ø\034¬czÓ[Üÿê\"")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill70_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill70_22)).doFinal(((byte[])(__sourceSpill70_21)));
    i = ((java.lang.String)(((java.lang.String)(com.moon.dh.a(((byte[])(local4_life24))))).intern()));
}

private static native <E extends Throwable> void __sourceHandlerCall_3001140e9d118b04acfa(com.moon.dh a0) throws E;
private static final class __SourceHandler_3001140e9d118b04acfa {

public static void f86(com.moon.dh receiver) throws Throwable {
    com.moon.dh spill86_0;
    com.moon.dh joinValue86_0_0;
    long life1_3;
    java.lang.String[] life3_5;
    life1_3 = (__fieldRead86_0() ^ 4920250894853L);
    life3_5 = __call86_1();
    spill86_0 = receiver;
    if ((life3_5 == null)) {
        if ((!__call86_4(__call86_2(spill86_0), __classLiteral86_3()))) {
        java.lang.Object __inlineStack86_8Token;
        throw new java.lang.RuntimeException(__invokedynamic86_9(__inlineStack86_8Output0((__inlineStack86_8Token = __inlineStack86_8Pack(__call86_6(__call86_5(receiver)), __fieldRead86_7()))), __inlineStack86_8Output1(__inlineStack86_8Token)));
    }
        joinValue86_0_0 = receiver;
    } else {
        joinValue86_0_0 = spill86_0;
    }
    __fieldWrite86_14(joinValue86_0_0, __cast86_13(__call86_12(__call86_10(receiver), __classLiteral86_11())));
    return;
}
private static native long __fieldRead86_0() throws Throwable;
private static native java.lang.String[] __call86_1() throws Throwable;
private static native java.lang.Class __call86_2(com.moon.dh a0) throws Throwable;
private static native java.lang.Class __classLiteral86_3() throws Throwable;
private static native boolean __call86_4(java.lang.Class a0, java.lang.Class a1) throws Throwable;
private static native java.lang.Class __call86_5(com.moon.dh a0) throws Throwable;
private static native java.lang.String __call86_6(java.lang.Class a0) throws Throwable;
private static native java.lang.String __fieldRead86_7() throws Throwable;
private static native java.lang.Object __inlineStack86_8Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack86_8Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack86_8Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic86_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __call86_10(com.moon.dh a0) throws Throwable;
private static native java.lang.Class __classLiteral86_11() throws Throwable;
private static native java.lang.annotation.Annotation __call86_12(java.lang.Class a0, java.lang.Class a1) throws Throwable;
private static native com.moon.dw __cast86_13(java.lang.annotation.Annotation a0) throws Throwable;
private static native void __fieldWrite86_14(com.moon.dh a0, com.moon.dw a1) throws Throwable;

}


public static java.lang.String[] b__sourceStatic067() {
return com.moon.dh.g;
}


public static void b(java.lang.String[] p0) {
g = ((java.lang.String[])(p0));
    return;
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
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
        byte[] spill163_0 = p0;
        life4_9 += 1;
        life5_44 = (spill163_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill163_1 = p0;
        life4_9 += 1;
        life5_76 = (spill163_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill163_2 = p0;
        life4_9 += 1;
        life5_91 = (spill163_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean a__Boolean(java.lang.String p0) {
int lexicalValue12_45_0;
    java.lang.String[] spill12_0;
    boolean spill12_1;
    long life2_3;
    java.lang.String[] life5_8;
    java.lang.String life6_11;
    int life7_13;
    java.lang.String[] life4_14;
    java.lang.String life8_22;
    lexical_join_45: {
    lexical_join_44: {
    life2_3 = (com.moon.dh.h ^ 122230807389510L);
    spill12_0 = com.moon.dh.b__sourceStatic067();
    life5_8 = ((com.moon.dw)(this.f)).value();
    life6_11 = ((java.lang.String)(p0)).toLowerCase();
    life7_13 = 0;
    life4_14 = spill12_0;
    lexical_cycle_15: while (true) {
    lexical_join_42: {
    lexical_join_41: {
    if (!((life7_13 < (life5_8).length))) {
        break lexical_join_44;
    }
    life8_22 = (life5_8)[life7_13];
    if (!((life4_14 == null))) {
        break lexical_join_42;
    }
    spill12_1 = ((java.lang.String)(life8_22)).equalsIgnoreCase(((java.lang.String)(life6_11)));
    if (!((life4_14 == null))) {
        lexicalValue12_45_0 = ((spill12_1) ? 1 : 0);
        break lexical_join_45;
    }
    if (!(spill12_1)) {
        break lexical_join_41;
    }
    this.e = (((T)((java.lang.Object)((((java.lang.Enum[])(((java.lang.Class)(((com.moon.dh)(this)).a__Class())).getEnumConstants())))[life7_13]))));
    return ((1) != 0);
    }
    life7_13 += 1;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue12_45_0 = 0;
    }
    return ((lexicalValue12_45_0) != 0);
}


public static <T extends java.lang.Enum<?>> com.moon.dq<T> a__sourceStatic_4981646cb3(java.lang.Class<T> p0) {
return new com.moon.dq(p0);
}


public void a__Void() { __sourceHandlerCall_3001140e9d118b04acfa(this); }


public com.moon.aS a() {
return com.moon.aS.ALWAYS;
}


public java.lang.String a__String(java.lang.String p0) {
java.lang.Object forwardValue50_31_0;
    java.lang.String forwardValue50_39_0;
    java.lang.String[] spill50_0;
    moom.DN spill50_1;
    java.lang.String spill50_2;
    long life2_3;
    java.lang.String[] life5_8;
    java.lang.String life6_11;
    moom.DN life7_23;
    java.lang.String[] life4_24;
    forward_join_39: {
    forward_join_33: {
    forward_join_31: {
    life2_3 = (com.moon.dh.h ^ 92696547202010L);
    spill50_0 = com.moon.dh.b__sourceStatic067();
    life5_8 = ((com.moon.dw)(this.f)).value();
    life6_11 = ((java.lang.String)(p0)).toLowerCase();
    life7_23 = ((moom.DN)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(java.util.Arrays.stream(((java.lang.Object[])(life5_8))))).map(((java.util.function.Function)(__sourceIntrinsic_7d31a37a36f2_invokedynamic50_6(life6_11)))))).max(((java.util.Comparator)(java.util.Comparator.comparing(((java.util.function.Function)(__sourceIntrinsic_7d31a37a36f2_invokedynamic50_8())))))))).orElse(((java.lang.Object)(null)))));
    life4_24 = spill50_0;
    spill50_1 = life7_23;
    if (!((life4_24 == null))) {
        forwardValue50_31_0 = spill50_1;
        break forward_join_31;
    }
    if (!((spill50_1 != null))) {
        break forward_join_33;
    }
    forwardValue50_31_0 = ((moom.DN)(life7_23)).a();
    }
    return ((java.lang.String)(forwardValue50_31_0));
    }
    spill50_2 = "";
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue50_39_0 = spill50_2;
        break forward_join_39;
    }
    com.moon.dh.b(((java.lang.String[])(new java.lang.String[3])));
    forwardValue50_39_0 = spill50_2;
    }
    return forwardValue50_39_0;
}


private static moom.DN lambda$suggest$0(java.lang.String p0, java.lang.String p1) {
return new moom.DN(p1, java.lang.Integer.valueOf(((int)(FuzzySearch.ratio(((java.lang.String)(p0)), ((java.lang.String)(((java.lang.String)(p1)).toLowerCase())))))));
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_7d31a37a36f2_invokedynamic50_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_7d31a37a36f2_invokedynamic50_8() throws E;
}
