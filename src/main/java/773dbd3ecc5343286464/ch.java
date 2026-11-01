package com.moon;


public class ch extends sourcebuild.EnumConstructor<com.moon.ch> {

public static com.moon.ch SUCCESS;

public static com.moon.ch ERROR;

public static com.moon.ch DEFAULT;

private static com.moon.ch[] a;

private static java.lang.String b;

private ch(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-9145860077855751799L)), ((long)(905396545412820409L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212234459914765L))) ^ 34608902892542L);
    if ((com.moon.ch.b() != null)) {
        com.moon.ch.b(((java.lang.String)("dBzQR")));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill57_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill57_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill57_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill57_13 = new byte[8];
    (__sourceSpill57_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill57_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation57_15 = __sourceSpill57_13;
    ((javax.crypto.Cipher)(__sourceSpill57_10)).init(((int)(__sourceSpill57_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill57_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation57_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[3];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "\001þëg\177t\031\b²Ð\bJ\007\"Ç\005\b·_xìþîP"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill57_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill57_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill57_28)).doFinal(((byte[])(__sourceSpill57_27)));
        java.lang.String __sourceSpill57_33 = ((java.lang.String)(com.moon.ch.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill57_34 = local0_life18;
        int __sourceSpill57_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill57_34)[__sourceSpill57_35] = __sourceSpill57_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    SUCCESS = ((com.moon.ch)(new com.moon.ch((local0_life18)[2], 0)));
    ERROR = ((com.moon.ch)(new com.moon.ch((local0_life18)[1], 1)));
    DEFAULT = ((com.moon.ch)(new com.moon.ch((local0_life18)[0], 2)));
    a = ((com.moon.ch[])(com.moon.ch.a()));
}


public static com.moon.ch[] values() {
return ((com.moon.ch[])(((com.moon.ch[])(com.moon.ch.a)).clone()));
}


public static com.moon.ch valueOf(java.lang.String p0) {
return ((com.moon.ch)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.ch.class)), ((java.lang.String)(p0)))));
}


public static java.lang.String b() {
return com.moon.ch.b;
}


public static void b(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
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
        byte[] spill127_0 = p0;
        life4_9 += 1;
        life5_44 = (spill127_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill127_1 = p0;
        life4_9 += 1;
        life5_76 = (spill127_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill127_2 = p0;
        life4_9 += 1;
        life5_91 = (spill127_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.ch[] a() {
return new com.moon.ch[] {com.moon.ch.SUCCESS, com.moon.ch.ERROR, com.moon.ch.DEFAULT};
}

}
