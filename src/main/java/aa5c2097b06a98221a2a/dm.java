package com.moon;


public class dm extends com.moon.df<java.lang.String> {

private static final long f;

private static final java.lang.String g;

public dm() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3520010766909488793L)), ((long)(4558855500772417872L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(275816032668156L)))));
    long local0_life6 = (com.moon.dm.f ^ 101175538424615L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill74_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill74_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill74_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill74_13 = new byte[8];
    (__sourceSpill74_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill74_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation74_15 = __sourceSpill74_13;
    ((javax.crypto.Cipher)(__sourceSpill74_10)).init(((int)(__sourceSpill74_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill74_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation74_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill74_19 = ((java.lang.String)("ð\025)¶\031Éª`I¶n:®")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill74_20 = local2_life8;
    byte[] local4_life22 = ((javax.crypto.Cipher)(__sourceSpill74_20)).doFinal(((byte[])(__sourceSpill74_19)));
    g = ((java.lang.String)(((java.lang.String)(com.moon.dm.a(((byte[])(local4_life22))))).intern()));
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
        byte[] spill171_0 = p0;
        life4_9 += 1;
        life5_44 = (spill171_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill171_1 = p0;
        life4_9 += 1;
        life5_76 = (spill171_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill171_2 = p0;
        life4_9 += 1;
        life5_91 = (spill171_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean a__Boolean() {
return ((0) != 0);
}


public com.moon.aS a() {
return com.moon.aS.SPACE;
}


public java.lang.String a__String(java.lang.String p0) {
long local2 = (com.moon.dm.f ^ 75112842523382L);
    return com.moon.dm.g;
}


public boolean a__Boolean(java.lang.String p0) {
((com.moon.dm)(this)).e = ((p0));
    return ((1) != 0);
}


public static com.moon.dv a__dv() {
return new com.moon.dv();
}

}
