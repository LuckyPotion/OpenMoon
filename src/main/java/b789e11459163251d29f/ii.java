package com.moon;


public class ii extends com.moon.ig {

private static final long c;

private static final java.lang.String e;

public ii() {
super(com.moon.ca.BRACKET);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5394006592645544824L)), ((long)(-3153908132721960012L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97008559797313L)))));
    long local0_life6 = (com.moon.ii.c ^ 68382036287909L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill172_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill172_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill172_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill172_13 = new byte[8];
    (__sourceSpill172_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill172_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation172_15 = __sourceSpill172_13;
    ((javax.crypto.Cipher)(__sourceSpill172_10)).init(((int)(__sourceSpill172_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill172_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation172_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill172_19 = ((java.lang.String)("xÿ0\026\t°ZÑ§ôªÄ­ú¯C}Á;sÍKëPé÷ o")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill172_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill172_20)).doFinal(((byte[])(__sourceSpill172_19)));
    e = ((java.lang.String)(((java.lang.String)(com.moon.ii.a(((byte[])(local4_life22))))).intern()));
}


public void a(com.moon.id p0, char p1) {
com.moon.id forwardValue424_20_0;
    com.moon.id spill424_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_20: {
    forward_join_16: {
    life3_3 = (com.moon.ii.c ^ 102933908191474L);
    life5_5 = __sourceExactCall_64103dcf174879();
    spill424_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue424_20_0 = spill424_0;
        break forward_join_20;
    }
    if (!((!((com.moon.id)(spill424_0)).b))) {
        break forward_join_16;
    }
    throw new com.moon.px(com.moon.ii.e);
    }
    ((com.moon.id)(p0)).c = ((boolean)(true));
    forwardValue424_20_0 = p0;
    }
    ((com.moon.id)(forwardValue424_20_0)).i = ((com.moon.pr)(new com.moon.pr(new java.util.ArrayList())));
    return;
}


private static com.moon.px a(com.moon.px p0) {
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
        byte[] spill624_0 = p0;
        life4_9 += 1;
        life5_44 = (spill624_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill624_1 = p0;
        life4_9 += 1;
        life5_76 = (spill624_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill624_2 = p0;
        life4_9 += 1;
        life5_91 = (spill624_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native java.lang.String[] __sourceExactCall_64103dcf174879();
}
