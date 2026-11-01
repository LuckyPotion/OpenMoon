package com.moon;


public class a7 extends sourcebuild.EnumConstructor<com.moon.a7> implements com.moon.l8 {

public static com.moon.a7 PING;

public static com.moon.a7 SOUND;

public static com.moon.a7 SWING;

public static com.moon.a7 MOVEMENT;

public static com.moon.a7 TICKS_EXISTED;

public static com.moon.a7 ARMOR;

private java.lang.String a;

private static com.moon.a7[] b;

private static long c;

private static long d;

private a7(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(-6845678763101584972L)), ((long)(-5739308509740304299L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(108131497894085L)))));
    long local14_life6 = (com.moon.a7.c ^ 76972608765607L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill4_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill4_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill4_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill4_13 = new byte[8];
    (__sourceSpill4_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill4_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation4_15 = __sourceSpill4_13;
    ((javax.crypto.Cipher)(__sourceSpill4_10)).init(((int)(__sourceSpill4_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill4_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation4_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[12];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "¹ô\006§nì¹z\bNÒÓ(Ö·³¥\b@á\035àqy\020Ð(,\026Û\021ÂzÛý\004ö6b\b\\)ÝÄ\036èx\020\033É\025ÐØ¦Ð{ÕLJ\007\020W V¢ºUqó±ç}·¤MX§\020\037a¯nßÃºf=zh\007u;\bÙ\177¦£¾\020\02091?\024·à\007\037\\âöÐ"))).length();
    int local9_life23 = 8;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill4_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill4_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill4_28)).doFinal(((byte[])(__sourceSpill4_27)));
        java.lang.String __sourceSpill4_33 = ((java.lang.String)(com.moon.a7.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill4_34 = local5_life18;
        int __sourceSpill4_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill4_34)[__sourceSpill4_35] = __sourceSpill4_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "D\"]Î¹{\026BÐ\007Øì í\020üÙïér\0272p$Dª\0237n"))).length();
    local9_life23 = 16;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill4_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill4_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill4_41)).doFinal(((byte[])(__sourceSpill4_40)));
        java.lang.String __sourceSpill4_46 = ((java.lang.String)(com.moon.a7.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill4_47 = local5_life18;
        int __sourceSpill4_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill4_47)[__sourceSpill4_48] = __sourceSpill4_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill4_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill4_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill4_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill4_56 = new byte[8];
    (__sourceSpill4_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill4_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation4_58 = __sourceSpill4_56;
    ((javax.crypto.Cipher)(__sourceSpill4_53)).init(((int)(__sourceSpill4_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill4_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation4_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = 8948475125635247174L;
    byte[] __sourceSpill4_62 = new byte[8];
    (__sourceSpill4_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill4_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill4_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill4_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill4_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill4_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill4_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill4_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill4_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill4_63)).doFinal(((byte[])(__sourceSpill4_62)));
    d = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    PING = ((com.moon.a7)(new com.moon.a7((local5_life18)[0], 0, (local5_life18)[7])));
    SOUND = ((com.moon.a7)(new com.moon.a7((local5_life18)[8], 1, (local5_life18)[5])));
    SWING = ((com.moon.a7)(new com.moon.a7((local5_life18)[1], 2, (local5_life18)[11])));
    MOVEMENT = ((com.moon.a7)(new com.moon.a7((local5_life18)[6], 3, (local5_life18)[3])));
    TICKS_EXISTED = ((com.moon.a7)(new com.moon.a7((local5_life18)[10], 4, (local5_life18)[9])));
    ARMOR = ((com.moon.a7)(new com.moon.a7((local5_life18)[4], 5, (local5_life18)[2])));
    b = ((com.moon.a7[])(com.moon.a7.a__Arraya7()));
}


public static com.moon.a7[] values() {
return ((com.moon.a7[])(((com.moon.a7[])(com.moon.a7.b)).clone()));
}


public static com.moon.a7 valueOf(java.lang.String p0) {
return ((com.moon.a7)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.a7.class)), ((java.lang.String)(p0)))));
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
        byte[] spill9_0 = p0;
        life4_9 += 1;
        life5_44 = (spill9_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill9_1 = p0;
        life4_9 += 1;
        life5_76 = (spill9_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill9_2 = p0;
        life4_9 += 1;
        life5_91 = (spill9_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public java.lang.String a__String() {
return this.a;
}


private static com.moon.a7[] a__Arraya7() {
long local0_life1 = (com.moon.a7.c ^ 8349983171611L);
    com.moon.a7[] __sourceSharedArray0_4 = new com.moon.a7[((int) com.moon.a7.d)];
    __sourceSharedArray0_4[0] = com.moon.a7.PING;
    __sourceSharedArray0_4[1] = com.moon.a7.SOUND;
    __sourceSharedArray0_4[2] = com.moon.a7.SWING;
    __sourceSharedArray0_4[3] = com.moon.a7.MOVEMENT;
    __sourceSharedArray0_4[4] = com.moon.a7.TICKS_EXISTED;
    __sourceSharedArray0_4[5] = com.moon.a7.ARMOR;
    return __sourceSharedArray0_4;
}

}
