package com.moon;


public class cc extends sourcebuild.EnumConstructor<com.moon.cc> {

public static com.moon.cc BITMAP;

private static com.moon.cc[] a;

private cc(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local4_life4 = (((moom._a)(moom._c.a(((long)(1619611745728371361L)), ((long)(3402834917756961504L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219061454265835L))) ^ 134772146930834L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill52_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill52_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill52_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill52_11 = new byte[8];
    (__sourceSpill52_11)[0] = ((byte) ((int) (local4_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill52_11)[local2_life12] = ((byte) ((int) ((local4_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation52_13 = __sourceSpill52_11;
    ((javax.crypto.Cipher)(__sourceSpill52_8)).init(((int)(__sourceSpill52_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill52_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation52_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill52_17 = ((java.lang.String)("7'òrEc9")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill52_18 = local1_life6;
    byte[] local3_life20 = ((javax.crypto.Cipher)(__sourceSpill52_18)).doFinal(((byte[])(__sourceSpill52_17)));
    java.lang.String local0_life23 = ((java.lang.String)(com.moon.cc.a(((byte[])(local3_life20))))).intern();
    BITMAP = ((com.moon.cc)(new com.moon.cc(local0_life23, 0)));
    a = ((com.moon.cc[])(com.moon.cc.a()));
}


public static com.moon.cc[] values() {
return ((com.moon.cc[])(((com.moon.cc[])(com.moon.cc.a)).clone()));
}


public static com.moon.cc valueOf(java.lang.String p0) {
return ((com.moon.cc)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.cc.class)), ((java.lang.String)(p0)))));
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
        byte[] spill122_0 = p0;
        life4_9 += 1;
        life5_44 = (spill122_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill122_1 = p0;
        life4_9 += 1;
        life5_76 = (spill122_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill122_2 = p0;
        life4_9 += 1;
        life5_91 = (spill122_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.cc[] a() {
return new com.moon.cc[] {com.moon.cc.BITMAP};
}

}
