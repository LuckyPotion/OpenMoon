package com.moon;

import me.xdrop.fuzzywuzzy.FuzzySearch;


public class dg extends com.moon.df<java.lang.String> {

private static final long f;

private static final java.lang.String g;

public dg() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(6286162539786971272L)), ((long)(-8406820080321701980L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94743542392630L)))));
    long local0_life6 = (com.moon.dg.f ^ 130983867837045L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill69_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill69_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill69_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill69_13 = new byte[8];
    (__sourceSpill69_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill69_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation69_15 = __sourceSpill69_13;
    ((javax.crypto.Cipher)(__sourceSpill69_10)).init(((int)(__sourceSpill69_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill69_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation69_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill69_19 = ((java.lang.String)("´³ÖTç\000ÐLb\n\tf")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill69_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill69_20)).doFinal(((byte[])(__sourceSpill69_19)));
    g = ((java.lang.String)(((java.lang.String)(com.moon.dg.a(((byte[])(local4_life22))))).intern()));
}


public boolean a__Boolean() {
return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
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
        byte[] spill161_0 = p0;
        life4_9 += 1;
        life5_44 = (spill161_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill161_1 = p0;
        life4_9 += 1;
        life5_76 = (spill161_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill161_2 = p0;
        life4_9 += 1;
        life5_91 = (spill161_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static com.moon.dp a__dp() {
return new com.moon.dp();
}


public boolean a__Boolean(java.lang.String p0) {
((com.moon.dg)(this)).e = ((p0));
    return ((1) != 0);
}


public java.lang.String a__String(java.lang.String p0) {
java.lang.Object forwardValue48_29_0;
    java.lang.String[] spill48_0;
    moom.DN spill48_1;
    long life2_3;
    java.util.Collection life5_8;
    moom.DN life6_21;
    java.lang.String[] life4_22;
    forward_join_32: {
    forward_join_29: {
    life2_3 = (com.moon.dg.f ^ 90529770036968L);
    life5_8 = ((java.util.Map)(((com.moon.dE)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__dE())).a__Map())).values();
    spill48_0 = __sourceExactCall_7424377b618ea5();
    life6_21 = ((moom.DN)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(life5_8)).stream())).map(((java.util.function.Function)(__sourceIntrinsic_7d31a37a36f2_invokedynamic48_7(p0)))))).max(((java.util.Comparator)(java.util.Comparator.comparing(((java.util.function.Function)(__sourceIntrinsic_7d31a37a36f2_invokedynamic48_9())))))))).orElse(((java.lang.Object)(null)))));
    life4_22 = spill48_0;
    spill48_1 = life6_21;
    if (!((life4_22 == null))) {
        forwardValue48_29_0 = spill48_1;
        break forward_join_29;
    }
    if (!((spill48_1 != null))) {
        break forward_join_32;
    }
    forwardValue48_29_0 = ((moom.DN)(life6_21)).a();
    }
    return ((com.moon.dD)(((com.moon.dD)(forwardValue48_29_0)))).a__String();
    }
    return com.moon.dg.g;
}


public com.moon.aS a() {
return com.moon.aS.ALWAYS;
}


private static moom.DN lambda$suggest$0(java.lang.String p0, com.moon.dD p1) {
return new moom.DN(p1, java.lang.Integer.valueOf(((int)(FuzzySearch.ratio(((java.lang.String)(p0)), ((java.lang.String)(((com.moon.dD)(p1)).a__String())))))));
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_7d31a37a36f2_invokedynamic48_7(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_7d31a37a36f2_invokedynamic48_9() throws E;

private static native java.lang.String[] __sourceExactCall_7424377b618ea5();
}
