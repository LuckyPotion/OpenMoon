package com.moon;


public class bY extends sourcebuild.EnumConstructor<com.moon.bY> implements com.moon.l8 {

public static com.moon.bY STATIC;

public static com.moon.bY GRADIENT;

public static com.moon.bY PULSING;

public static com.moon.bY INDIVIDUAL;

public static com.moon.bY MOON;

public static com.moon.bY ASTOLFO;

private java.lang.String a;

private static com.moon.bY[] b;

private static net.minecraft.entity.Entity[] c;

private static long d;

private static long e;

private bY(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-4525163389493756867L)), ((long)(-2973019331961999300L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(71627498158641L)))));
    long local14_life6 = (com.moon.bY.d ^ 111327990708892L);
    if ((com.moon.bY.b() != null)) {
        com.moon.bY.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));
    }
    javax.crypto.Cipher local6_life10;
    javax.crypto.Cipher __sourceSpill22_12 = (local6_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill22_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill22_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill22_15 = new byte[8];
    (__sourceSpill22_15)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life16 = 1;
    while ((local7_life16 < 8)) {
        (__sourceSpill22_15)[local7_life16] = ((byte) ((int) ((local14_life6 << (local7_life16 * 8)) >>> 56)));
        local7_life16 += 1;
    }
    byte[] __sourcePreallocation22_17 = __sourceSpill22_15;
    ((javax.crypto.Cipher)(__sourceSpill22_12)).init(((int)(__sourceSpill22_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill22_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation22_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life20 = new java.lang.String[12];
    int local11_life21 = 0;
    java.lang.String local10_life22;
    int local12_life24 = ((java.lang.String)((local10_life22 = "rOÛô[\022\r\007\b@zc\tdcv\020©W\f*¯É°ucÔDÃ_~ÿ\020ÙOU-¦>ä;»ö=aAÐd\002\020~\n´XÆ¸Ï\016j+èmÊ\b/)\017¿g`\bz\007kþB\"¾É\020õ/\035\007ÿ\020\0348\006~\0041L\"\bÈ\031!à?ÈÌå\bèÜ`üÄòH"))).length();
    int local9_life25 = 8;
    int local8_life26 = -1;
    while (true) {
        local8_life26 += 1;
        byte[] __sourceSpill22_29 = ((java.lang.String)(((java.lang.String)(local10_life22)).substring(((int)(local8_life26)), ((int)((local8_life26 + local9_life25)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill22_30 = local6_life10;
        byte[] local13_life32 = ((javax.crypto.Cipher)(__sourceSpill22_30)).doFinal(((byte[])(__sourceSpill22_29)));
        java.lang.String __sourceSpill22_35 = ((java.lang.String)(com.moon.bY.a(((byte[])(local13_life32))))).intern();
        java.lang.String[] __sourceSpill22_36 = local5_life20;
        int __sourceSpill22_37 = local11_life21;
        local11_life21 += 1;
        (__sourceSpill22_36)[__sourceSpill22_37] = __sourceSpill22_35;
        if (!(((local8_life26 = (local8_life26 + local9_life25)) < local12_life24))) { break; }
        local9_life25 = ((java.lang.String)(local10_life22)).charAt(((int)(local8_life26)));
    }
    local12_life24 = ((java.lang.String)((local10_life22 = "\016ü¤\026É¾Ä5\bèæÁw\030\025"))).length();
    local9_life25 = 8;
    local8_life26 = -1;
    while (true) {
        local8_life26 += 1;
        byte[] __sourceSpill22_42 = ((java.lang.String)(((java.lang.String)(local10_life22)).substring(((int)(local8_life26)), ((int)((local8_life26 + local9_life25)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill22_43 = local6_life10;
        byte[] local13_life45 = ((javax.crypto.Cipher)(__sourceSpill22_43)).doFinal(((byte[])(__sourceSpill22_42)));
        java.lang.String __sourceSpill22_48 = ((java.lang.String)(com.moon.bY.a(((byte[])(local13_life45))))).intern();
        java.lang.String[] __sourceSpill22_49 = local5_life20;
        int __sourceSpill22_50 = local11_life21;
        local11_life21 += 1;
        (__sourceSpill22_49)[__sourceSpill22_50] = __sourceSpill22_48;
        if (!(((local8_life26 = (local8_life26 + local9_life25)) < local12_life24))) { break; }
        local9_life25 = ((java.lang.String)(local10_life22)).charAt(((int)(local8_life26)));
    }
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill22_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill22_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill22_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill22_58 = new byte[8];
    (__sourceSpill22_58)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill22_58)[local1_life59] = ((byte) ((int) ((local14_life6 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation22_60 = __sourceSpill22_58;
    ((javax.crypto.Cipher)(__sourceSpill22_55)).init(((int)(__sourceSpill22_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill22_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation22_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = 8741302170027802531L;
    byte[] __sourceSpill22_64 = new byte[8];
    (__sourceSpill22_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill22_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill22_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill22_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill22_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill22_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill22_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill22_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill22_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill22_65)).doFinal(((byte[])(__sourceSpill22_64)));
    e = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
    STATIC = ((com.moon.bY)(new com.moon.bY((local5_life20)[6], 0, (local5_life20)[10])));
    GRADIENT = ((com.moon.bY)(new com.moon.bY((local5_life20)[7], 1, (local5_life20)[4])));
    PULSING = ((com.moon.bY)(new com.moon.bY((local5_life20)[9], 2, (local5_life20)[0])));
    INDIVIDUAL = ((com.moon.bY)(new com.moon.bY((local5_life20)[3], 3, (local5_life20)[2])));
    MOON = ((com.moon.bY)(new com.moon.bY((local5_life20)[5], 4, (local5_life20)[1])));
    ASTOLFO = ((com.moon.bY)(new com.moon.bY((local5_life20)[11], 5, (local5_life20)[8])));
    b = ((com.moon.bY[])(com.moon.bY.a__ArraybY()));
}


public static com.moon.bY[] values() {
return ((com.moon.bY[])(((com.moon.bY[])(com.moon.bY.b)).clone()));
}


public static com.moon.bY valueOf(java.lang.String p0) {
return ((com.moon.bY)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bY.class)), ((java.lang.String)(p0)))));
}


public static void b(net.minecraft.entity.Entity[] p0) {
c = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.bY.c;
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
        byte[] spill66_0 = p0;
        life4_9 += 1;
        life5_44 = (spill66_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill66_1 = p0;
        life4_9 += 1;
        life5_76 = (spill66_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill66_2 = p0;
        life4_9 += 1;
        life5_91 = (spill66_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bY[] a__ArraybY() {
long local0_life1 = (com.moon.bY.d ^ 4841931721699L);
    com.moon.bY[] __sourceSharedArray16_4 = new com.moon.bY[((int) com.moon.bY.e)];
    __sourceSharedArray16_4[0] = com.moon.bY.STATIC;
    __sourceSharedArray16_4[1] = com.moon.bY.GRADIENT;
    __sourceSharedArray16_4[2] = com.moon.bY.PULSING;
    __sourceSharedArray16_4[3] = com.moon.bY.INDIVIDUAL;
    __sourceSharedArray16_4[4] = com.moon.bY.MOON;
    __sourceSharedArray16_4[5] = com.moon.bY.ASTOLFO;
    return __sourceSharedArray16_4;
}


public java.lang.String a__String() {
return this.a;
}

}
