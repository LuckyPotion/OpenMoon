package com.moon;


public class a9 extends sourcebuild.EnumConstructor<com.moon.a9> implements com.moon.l8 {

public static com.moon.a9 PRE;

public static com.moon.a9 POST;

public static com.moon.a9 WATCHDOG;

public static com.moon.a9 FAKE;

public static com.moon.a9 SPOOF;

public static com.moon.a9 INVALID;

private java.lang.String a;

private com.moon.f0 b;

private static com.moon.a9[] c;

private static long d;

private static long e;

private a9(java.lang.String p0, int p1, java.lang.String p2, com.moon.f0 p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-1746585492668290100L)), ((long)(5047182248231934081L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(197331043311160L)))));
    long local14_life6 = (com.moon.a9.d ^ 124515016956240L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill5_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill5_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill5_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill5_13 = new byte[8];
    (__sourceSpill5_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill5_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation5_15 = __sourceSpill5_13;
    ((javax.crypto.Cipher)(__sourceSpill5_10)).init(((int)(__sourceSpill5_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill5_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation5_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[12];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "í+ó§\030\000\020íUËY¹1#~OÄ×p´Z\bd´À1[\b\020ÓQi7µ\032F\026\023_\007Añâá\bþ>\013ã\004\"Þ\br{-0àêê\b4\013g\031\035A-¾\b\025WO®ß©\b\036 â\017·ïâ\bàA£¸IÍµ"))).length();
    int local9_life23 = 8;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill5_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill5_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill5_28)).doFinal(((byte[])(__sourceSpill5_27)));
        java.lang.String __sourceSpill5_33 = ((java.lang.String)(com.moon.a9.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill5_34 = local5_life18;
        int __sourceSpill5_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill5_34)[__sourceSpill5_35] = __sourceSpill5_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "|gè\006Ö>R\bÆº\013VÛqÈ"))).length();
    local9_life23 = 8;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill5_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill5_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill5_41)).doFinal(((byte[])(__sourceSpill5_40)));
        java.lang.String __sourceSpill5_46 = ((java.lang.String)(com.moon.a9.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill5_47 = local5_life18;
        int __sourceSpill5_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill5_47)[__sourceSpill5_48] = __sourceSpill5_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill5_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill5_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill5_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill5_56 = new byte[8];
    (__sourceSpill5_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill5_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation5_58 = __sourceSpill5_56;
    ((javax.crypto.Cipher)(__sourceSpill5_53)).init(((int)(__sourceSpill5_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill5_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation5_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = 4550247713976938735L;
    byte[] __sourceSpill5_62 = new byte[8];
    (__sourceSpill5_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill5_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill5_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill5_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill5_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill5_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill5_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill5_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill5_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill5_63)).doFinal(((byte[])(__sourceSpill5_62)));
    e = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    PRE = ((com.moon.a9)(new com.moon.a9((local5_life18)[4], 0, (local5_life18)[5], new com.moon.f8())));
    POST = ((com.moon.a9)(new com.moon.a9((local5_life18)[10], 1, (local5_life18)[6], new com.moon.f7())));
    WATCHDOG = ((com.moon.a9)(new com.moon.a9((local5_life18)[1], 2, (local5_life18)[3], new com.moon.f_())));
    FAKE = ((com.moon.a9)(new com.moon.a9((local5_life18)[8], 3, (local5_life18)[2], new com.moon.f2())));
    SPOOF = ((com.moon.a9)(new com.moon.a9((local5_life18)[7], 4, (local5_life18)[9], new com.moon.f9())));
    INVALID = ((com.moon.a9)(new com.moon.a9((local5_life18)[0], 5, (local5_life18)[11], new com.moon.f5())));
    c = ((com.moon.a9[])(com.moon.a9.a__Arraya9()));
}


public static com.moon.a9[] values() {
return ((com.moon.a9[])(((com.moon.a9[])(com.moon.a9.c)).clone()));
}


public static com.moon.a9 valueOf(java.lang.String p0) {
return ((com.moon.a9)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.a9.class)), ((java.lang.String)(p0)))));
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
        byte[] spill11_0 = p0;
        life4_9 += 1;
        life5_44 = (spill11_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill11_1 = p0;
        life4_9 += 1;
        life5_76 = (spill11_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill11_2 = p0;
        life4_9 += 1;
        life5_91 = (spill11_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.a9[] a__Arraya9() {
long local0_life1 = (com.moon.a9.d ^ 111635309146220L);
    com.moon.a9[] __sourceSharedArray1_4 = new com.moon.a9[((int) com.moon.a9.e)];
    __sourceSharedArray1_4[0] = com.moon.a9.PRE;
    __sourceSharedArray1_4[1] = com.moon.a9.POST;
    __sourceSharedArray1_4[2] = com.moon.a9.WATCHDOG;
    __sourceSharedArray1_4[3] = com.moon.a9.FAKE;
    __sourceSharedArray1_4[4] = com.moon.a9.SPOOF;
    __sourceSharedArray1_4[5] = com.moon.a9.INVALID;
    return __sourceSharedArray1_4;
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.f0 a() {
return this.b;
}

}
