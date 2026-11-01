package com.moon.module;

/** Unaccepted same-owner source composition; fixed enum lowering required. */

public final class InputSource extends sourcebuild.EnumConstructor<com.moon.module.InputSource> {

public static com.moon.module.InputSource KEYBOARD;

public static com.moon.module.InputSource MOUSE;

private static com.moon.module.InputSource[] a;

private static java.lang.String b;

private InputSource(java.lang.String p0, int p1) {
    super(p0, p1);

}

private static void initialize() throws Throwable {
    long local9_life4 = ((moom._c.a(-1905542761450244311L, -1699912231408329872L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(174897898428655L) ^ 28637476467880L);
    if ((com.moon.module.InputSource.b() != null)) {
        com.moon.module.InputSource.b("gS2uD");
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill250_10 = (local1_life8 = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding"));
    int __sourceSpill250_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill250_12 = javax.crypto.SecretKeyFactory.getInstance("DES");
    byte[] __sourceSpill250_13 = new byte[8];
    (__sourceSpill250_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill250_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation250_15 = __sourceSpill250_13;
    (__sourceSpill250_10).init(__sourceSpill250_11, (__sourceSpill250_12).generateSecret(new javax.crypto.spec.DESKeySpec(__sourcePreallocation250_15)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    java.lang.String[] local0_life18 = new java.lang.String[2];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((local5_life20 = "xÆ©o¥O\025­OÒô>\016!\b$Ô ½%S(")).length();
    int local4_life23 = 16;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill250_27 = ((local5_life20).substring(local3_life24, (local3_life24 + local4_life23))).getBytes("ISO-8859-1");
        javax.crypto.Cipher __sourceSpill250_28 = local1_life8;
        byte[] local8_life30 = (__sourceSpill250_28).doFinal(__sourceSpill250_27);
        java.lang.String __sourceSpill250_33 = (com.moon.module.InputSource.a(local8_life30)).intern();
        java.lang.String[] __sourceSpill250_34 = local0_life18;
        int __sourceSpill250_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill250_34)[__sourceSpill250_35] = __sourceSpill250_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = (local5_life20).charAt(local3_life24);
    }
    com.moon.module.InputSource.KEYBOARD = new com.moon.module.InputSource((local0_life18)[0], 0);
    com.moon.module.InputSource.MOUSE = new com.moon.module.InputSource((local0_life18)[1], 1);
    com.moon.module.InputSource.a = com.moon.module.InputSource.a();
    return;
}

public static com.moon.module.InputSource[] values() {
    return ((com.moon.module.InputSource[])(Object)((com.moon.module.InputSource.a).clone()));
}

public static com.moon.module.InputSource valueOf(java.lang.String p0) {
    return ((com.moon.module.InputSource)(Object)(java.lang.Enum.valueOf((java.lang.Class)(com.moon.module.InputSource.class), p0)));
}

public static java.lang.String b() {
    return com.moon.module.InputSource.b;
}

public static void b(java.lang.String p0) {
    com.moon.module.InputSource.b = p0;
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
        byte[] spill1005_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1005_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1005_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1005_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1005_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1005_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}

private static com.moon.module.InputSource[] a() {
    return new com.moon.module.InputSource[] {com.moon.module.InputSource.KEYBOARD, com.moon.module.InputSource.MOUSE};
}

}
