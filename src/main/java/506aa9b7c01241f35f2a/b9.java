package com.moon;


class b9 extends sourcebuild.EnumConstructor<com.moon.b9> {

public static com.moon.b9 INSIDE;

public static com.moon.b9 POSITIVE;

public static com.moon.b9 NEGATIVE;

private static com.moon.b9[] a;

private static long b;

private b9(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-1536758573044118884L)), ((long)(-4927740421316085063L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78805878706452L)))));
    long local9_life6 = (com.moon.b9.b ^ 61094888803733L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill16_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill16_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill16_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill16_13 = new byte[8];
    (__sourceSpill16_13)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill16_13)[local2_life14] = ((byte) ((int) ((local9_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation16_15 = __sourceSpill16_13;
    ((javax.crypto.Cipher)(__sourceSpill16_10)).init(((int)(__sourceSpill16_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill16_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation16_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[3];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "XDI\t´|³%Æq!\025\017%\177\020@øTÇ»ËÕz±ÌÚKÄ\t\b[8AÄy\026¸f"))).length();
    int local4_life23 = 16;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill16_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill16_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill16_28)).doFinal(((byte[])(__sourceSpill16_27)));
        java.lang.String __sourceSpill16_33 = ((java.lang.String)(com.moon.b9.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill16_34 = local0_life18;
        int __sourceSpill16_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill16_34)[__sourceSpill16_35] = __sourceSpill16_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    INSIDE = ((com.moon.b9)(new com.moon.b9((local0_life18)[2], 0)));
    POSITIVE = ((com.moon.b9)(new com.moon.b9((local0_life18)[1], 1)));
    NEGATIVE = ((com.moon.b9)(new com.moon.b9((local0_life18)[0], 2)));
    a = ((com.moon.b9[])(com.moon.b9.a()));
}


public static com.moon.b9[] values() {
return ((com.moon.b9[])(((com.moon.b9[])(com.moon.b9.a)).clone()));
}


public static com.moon.b9 valueOf(java.lang.String p0) {
return ((com.moon.b9)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.b9.class)), ((java.lang.String)(p0)))));
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
        byte[] spill40_0 = p0;
        life4_9 += 1;
        life5_44 = (spill40_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill40_1 = p0;
        life4_9 += 1;
        life5_76 = (spill40_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill40_2 = p0;
        life4_9 += 1;
        life5_91 = (spill40_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.b9[] a() {
return new com.moon.b9[] {com.moon.b9.INSIDE, com.moon.b9.POSITIVE, com.moon.b9.NEGATIVE};
}


public static com.moon.b9 a(int p0, int p1, int p2) {
int forwardValue15_20_0;
    int forwardValue15_20_1;
    int forwardValue15_25_0;
    int forwardValue15_25_1;
    int spill15_0;
    int spill15_1;
    int spill15_2;
    int spill15_3;
    long life3_3;
    int life5_5;
    forward_join_28: {
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    life3_3 = (com.moon.b9.b ^ 109966980138266L);
    life5_5 = ((com.moon.hE.b()) ? 1 : 0);
    spill15_0 = p1;
    spill15_1 = p2;
    if (!((life5_5 != 0))) {
        forwardValue15_20_0 = spill15_0;
        forwardValue15_20_1 = spill15_1;
        break forward_join_20;
    }
    if (!((spill15_0 > spill15_1))) {
        break forward_join_18;
    }
    spill15_2 = p0;
    spill15_3 = p2;
    if (!((life5_5 != 0))) {
        forwardValue15_20_0 = spill15_2;
        forwardValue15_20_1 = spill15_3;
        break forward_join_20;
    }
    if (!((spill15_2 > spill15_3))) {
        break forward_join_18;
    }
    return com.moon.b9.POSITIVE;
    }
    forwardValue15_20_0 = p0;
    forwardValue15_20_1 = p2;
    }
    if (!((life5_5 != 0))) {
        forwardValue15_25_0 = forwardValue15_20_0;
        forwardValue15_25_1 = forwardValue15_20_1;
        break forward_join_25;
    }
    if (!((forwardValue15_20_0 < forwardValue15_20_1))) {
        break forward_join_28;
    }
    forwardValue15_25_0 = p1;
    forwardValue15_25_1 = p2;
    }
    if (!((forwardValue15_25_0 < forwardValue15_25_1))) {
        break forward_join_28;
    }
    return com.moon.b9.NEGATIVE;
    }
    return com.moon.b9.INSIDE;
}

}
