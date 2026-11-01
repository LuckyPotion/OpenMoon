package com.moon;


public class ik extends com.moon.ig {

private static final long c;

private static final java.lang.String e;

public ik() {
super(com.moon.ca.CLOSING_BRACKET);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5807108565029613205L)), ((long)(3009999633268734197L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155774203812545L)))));
    long local0_life6 = (com.moon.ik.c ^ 132718429289066L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill173_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill173_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill173_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill173_13 = new byte[8];
    (__sourceSpill173_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill173_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation173_15 = __sourceSpill173_13;
    ((javax.crypto.Cipher)(__sourceSpill173_10)).init(((int)(__sourceSpill173_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill173_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation173_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill173_19 = ((java.lang.String)("!«8\013t\004#ÎQu\017Ë\005\nÃ\005cn'C\"8\017\177\025Ë\017\177ã]")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill173_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill173_20)).doFinal(((byte[])(__sourceSpill173_19)));
    e = ((java.lang.String)(((java.lang.String)(com.moon.ik.a(((byte[])(local4_life22))))).intern()));
}


public void a(com.moon.id p0, char p1) {
com.moon.id forwardValue426_12_0;
    int forwardValue426_43_0;
    com.moon.id spill426_0;
    boolean spill426_1;
    long life3_3;
    java.lang.String[] life5_5;
    java.util.List life6_39;
    forward_join_55: {
    forward_join_43: {
    forward_join_37: {
    forward_join_19: {
    forward_join_14: {
    forward_join_12: {
    life3_3 = (com.moon.ik.c ^ 45402895165984L);
    life5_5 = __sourceExactCall_64103dcf174879();
    spill426_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue426_12_0 = spill426_0;
        break forward_join_12;
    }
    if (!(((com.moon.id)(spill426_0)).b)) {
        break forward_join_14;
    }
    forwardValue426_12_0 = p0;
    }
    if (!((((com.moon.id)(forwardValue426_12_0)).h == null))) {
        break forward_join_19;
    }
    }
    throw new com.moon.px(com.moon.ik.e);
    }
    spill426_1 = ((com.moon.ik)(this)).a(((com.moon.id)(p0)));
    if (!((life5_5 == null))) {
        forwardValue426_43_0 = ((spill426_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill426_1)) {
        break forward_join_37;
    }
    life6_39 = ((com.moon.pr)(((com.moon.id)(p0)).i)).h();
    ((java.util.List)(life6_39)).add(((java.lang.Object)(new com.moon.ps(((com.moon.id)(p0)).k))));
    }
    forwardValue426_43_0 = ((((java.util.List)(__sourceExactCall_f71ce93307c51b(((com.moon.pq)(((com.moon.id)(p0)).h))))).add(((java.lang.Object)(((com.moon.id)(p0)).i)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue426_43_0);
    ((com.moon.id)(p0)).c = ((boolean)(false));
    ((com.moon.id)(p0)).i = ((com.moon.pr)(null));
    if (!((life5_5 != null))) {
        break forward_join_55;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
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
        byte[] spill627_0 = p0;
        life4_9 += 1;
        life5_44 = (spill627_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill627_1 = p0;
        life4_9 += 1;
        life5_76 = (spill627_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill627_2 = p0;
        life4_9 += 1;
        life5_91 = (spill627_2)[life4_9];
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
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native java.util.List __sourceExactCall_f71ce93307c51b(com.moon.pq p0);
}
