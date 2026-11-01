package com.moon;


public class a4 extends sourcebuild.EnumConstructor<com.moon.a4> {

public static com.moon.a4 NVIDIA;

public static com.moon.a4 AMD;

public static com.moon.a4 APPLE;

public static com.moon.a4 FALLBACK;

private static com.moon.a4[] a;

private static java.lang.String[] b;

private a4(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-460156472070048836L)), ((long)(-1816541349001995599L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9948357005625L))) ^ 99374328942089L);
    if ((com.moon.a4.b() == null)) {
        com.moon.a4.b(((java.lang.String[])(new java.lang.String[1])));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill4_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill4_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill4_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill4_13 = new byte[8];
    (__sourceSpill4_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill4_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation4_15 = __sourceSpill4_13;
    ((javax.crypto.Cipher)(__sourceSpill4_10)).init(((int)(__sourceSpill4_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill4_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation4_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[4];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "X5Jë2Â\bv\\8Ê\b§\n"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill4_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill4_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill4_28)).doFinal(((byte[])(__sourceSpill4_27)));
        java.lang.String __sourceSpill4_33 = ((java.lang.String)(com.moon.a4.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill4_34 = local0_life18;
        int __sourceSpill4_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill4_34)[__sourceSpill4_35] = __sourceSpill4_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "\027-H½é\"un¹lmk¼\\\b'Ç°ä\006©À¾"))).length();
    local4_life23 = 16;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill4_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill4_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill4_42)).doFinal(((byte[])(__sourceSpill4_41)));
        java.lang.String __sourceSpill4_47 = ((java.lang.String)(com.moon.a4.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill4_48 = local0_life18;
        int __sourceSpill4_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill4_48)[__sourceSpill4_49] = __sourceSpill4_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    NVIDIA = ((com.moon.a4)(new com.moon.a4((local0_life18)[1], 0)));
    AMD = ((com.moon.a4)(new com.moon.a4((local0_life18)[0], 1)));
    APPLE = ((com.moon.a4)(new com.moon.a4((local0_life18)[3], 2)));
    FALLBACK = ((com.moon.a4)(new com.moon.a4((local0_life18)[2], 3)));
    a = ((com.moon.a4[])(com.moon.a4.a()));
}


public static com.moon.a4[] values() {
return ((com.moon.a4[])(((com.moon.a4[])(com.moon.a4.a)).clone()));
}


public static com.moon.a4 valueOf(java.lang.String p0) {
return ((com.moon.a4)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.a4.class)), ((java.lang.String)(p0)))));
}


public static java.lang.String[] b() {
return com.moon.a4.b;
}


public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
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
        byte[] spill7_0 = p0;
        life4_9 += 1;
        life5_44 = (spill7_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill7_1 = p0;
        life4_9 += 1;
        life5_76 = (spill7_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill7_2 = p0;
        life4_9 += 1;
        life5_91 = (spill7_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.a4[] a() {
return new com.moon.a4[] {com.moon.a4.NVIDIA, com.moon.a4.AMD, com.moon.a4.APPLE, com.moon.a4.FALLBACK};
}

}
