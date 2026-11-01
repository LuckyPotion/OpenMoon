package com.moon;


public class on extends com.moon.ol<com.moon.D> {

private static final long d;

private static final java.lang.String e;

public on(com.moon.od p0) {
super(p0, ((byte) 3));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(3875118837517664421L)), ((long)(8883701679396741940L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(72394882673456L)))));
    long local0_life6 = (com.moon.on.d ^ 28629850741320L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill329_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill329_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill329_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill329_13 = new byte[8];
    (__sourceSpill329_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill329_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation329_15 = __sourceSpill329_13;
    ((javax.crypto.Cipher)(__sourceSpill329_10)).init(((int)(__sourceSpill329_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill329_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation329_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill329_19 = ((java.lang.String)("Á\0134;¶êñv\\vF<ÎKGI#×¨¯Äý®X\013ð\tÏ.SëÁ÷52")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill329_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill329_20)).doFinal(((byte[])(__sourceSpill329_19)));
    e = ((java.lang.String)(((java.lang.String)(com.moon.on.a(((byte[])(local4_life22))))).intern()));
}


public void a(java.nio.ByteBuffer p0) {
long life2_3;
    com.moon.D life5_9;
    java.lang.String life6_41;
    java.lang.String life4_42;
    life2_3 = (com.moon.on.d ^ 62475395942143L);
    life5_9 = ((com.moon.D)(((com.moon.on)(this)).a(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.GeneratedMessageV3)(com.moon.D.a__D())))));
    java.lang.String spill2559_0 = __sourceExactCall_f8bf02dc76e4b3();
    life6_41 = java.lang.String.format(((java.lang.String)(com.moon.on.e)), ((java.lang.Object[])(new java.lang.Object[] {((com.moon.D)(life5_9)).b__String(), ((com.moon.D)(life5_9)).a__String(), ((com.moon.D)(life5_9)).b__String(), java.lang.Long.valueOf(((long)(((com.moon.D)(life5_9)).a()))), ((com.moon.D)(life5_9)).c__String()})));
    life4_42 = spill2559_0;
    ((java.util.function.Consumer)(((com.moon.oe)(((com.moon.od)(((com.moon.on)(this)).a__od())).a())).a__Consumer())).accept(((java.lang.Object)(life6_41)));
    if ((life4_42 == null)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
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
        byte[] spill1459_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1459_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1459_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1459_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1459_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1459_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native java.lang.String __sourceExactCall_f8bf02dc76e4b3();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
