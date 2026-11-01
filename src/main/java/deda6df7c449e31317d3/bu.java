package com.moon;


class bu extends sourcebuild.EnumConstructor<com.moon.bu> implements com.moon.l8, com.moon.kS<com.moon.module.impl.NoSlowDown> {

public static com.moon.bu VANILLA;

public static com.moon.bu NCP;

public static com.moon.bu UPDATED_NCP;

public static com.moon.bu WATCHDOG;

public static com.moon.bu SPOOF;

public static com.moon.bu INVALID;

private java.lang.String a;

private com.moon.e2<com.moon.module.impl.NoSlowDown> b;

private static com.moon.bu[] c;

private static long d;

private static long e;

private bu(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.NoSlowDown> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-4496310211228014687L)), ((long)(6141315141029307841L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(180326089004390L)))));
    long local14_life6 = (com.moon.bu.d ^ 82200642608063L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill28_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill28_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill28_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill28_13 = new byte[8];
    (__sourceSpill28_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill28_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation28_15 = __sourceSpill28_13;
    ((javax.crypto.Cipher)(__sourceSpill28_10)).init(((int)(__sourceSpill28_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill28_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation28_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[12];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "À¡©³NPi\b~»?ÿ_(û\bGÌXñÄ}\020Ú´ù\017í\027¾Z\001v*+§\020¥¾i/×Ï{#\017P\fþ6\023eÈ\b¦ôê\031d\006h1\0203\004{«¦·{û9\025¬!gIr\b)[¶\0137\b N=ÇÛ@Ü\020A«:É\033é·Þ\000Ø)Q"))).length();
    int local9_life23 = 8;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill28_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill28_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill28_28)).doFinal(((byte[])(__sourceSpill28_27)));
        java.lang.String __sourceSpill28_33 = ((java.lang.String)(com.moon.bu.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill28_34 = local5_life18;
        int __sourceSpill28_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill28_34)[__sourceSpill28_35] = __sourceSpill28_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "!Üæ}HC0ä\b)[¶\0137"))).length();
    local9_life23 = 8;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill28_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill28_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill28_41)).doFinal(((byte[])(__sourceSpill28_40)));
        java.lang.String __sourceSpill28_46 = ((java.lang.String)(com.moon.bu.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill28_47 = local5_life18;
        int __sourceSpill28_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill28_47)[__sourceSpill28_48] = __sourceSpill28_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill28_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill28_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill28_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill28_56 = new byte[8];
    (__sourceSpill28_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill28_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation28_58 = __sourceSpill28_56;
    ((javax.crypto.Cipher)(__sourceSpill28_53)).init(((int)(__sourceSpill28_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill28_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation28_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = 6748020433017708050L;
    byte[] __sourceSpill28_62 = new byte[8];
    (__sourceSpill28_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill28_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill28_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill28_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill28_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill28_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill28_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill28_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill28_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill28_63)).doFinal(((byte[])(__sourceSpill28_62)));
    e = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    VANILLA = ((com.moon.bu)(new com.moon.bu((local5_life18)[10], 0, (local5_life18)[0], new com.moon.fA())));
    NCP = ((com.moon.bu)(new com.moon.bu((local5_life18)[11], 1, (local5_life18)[7], new com.moon.fx())));
    UPDATED_NCP = ((com.moon.bu)(new com.moon.bu((local5_life18)[3], 2, (local5_life18)[6], new com.moon.fz())));
    WATCHDOG = ((com.moon.bu)(new com.moon.bu((local5_life18)[9], 3, (local5_life18)[4], new com.moon.fB())));
    SPOOF = ((com.moon.bu)(new com.moon.bu((local5_life18)[5], 4, (local5_life18)[2], new com.moon.fy())));
    INVALID = ((com.moon.bu)(new com.moon.bu((local5_life18)[1], 5, (local5_life18)[8], new com.moon.fw())));
    c = ((com.moon.bu[])(com.moon.bu.a__Arraybu()));
}


public static com.moon.bu[] values() {
return ((com.moon.bu[])(((com.moon.bu[])(com.moon.bu.c)).clone()));
}


public static com.moon.bu valueOf(java.lang.String p0) {
return ((com.moon.bu)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bu.class)), ((java.lang.String)(p0)))));
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
        byte[] spill89_0 = p0;
        life4_9 += 1;
        life5_44 = (spill89_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill89_1 = p0;
        life4_9 += 1;
        life5_76 = (spill89_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill89_2 = p0;
        life4_9 += 1;
        life5_91 = (spill89_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bu[] a__Arraybu() {
long local0_life1 = (com.moon.bu.d ^ 101644983325017L);
    com.moon.bu[] __sourceSharedArray21_4 = new com.moon.bu[((int) com.moon.bu.e)];
    __sourceSharedArray21_4[0] = com.moon.bu.VANILLA;
    __sourceSharedArray21_4[1] = com.moon.bu.NCP;
    __sourceSharedArray21_4[2] = com.moon.bu.UPDATED_NCP;
    __sourceSharedArray21_4[3] = com.moon.bu.WATCHDOG;
    __sourceSharedArray21_4[4] = com.moon.bu.SPOOF;
    __sourceSharedArray21_4[5] = com.moon.bu.INVALID;
    return __sourceSharedArray21_4;
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.e2<com.moon.module.impl.NoSlowDown> a() {
return this.b;
}

}
