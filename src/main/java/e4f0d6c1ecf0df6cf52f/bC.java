package com.moon;


public class bC extends sourcebuild.EnumConstructor<com.moon.bC> implements com.moon.l8 {

public static com.moon.bC AUTO_CLEAN;

public static com.moon.bC AUTO_ARMOR;

public static com.moon.bC AUTO_SWORD;

public static com.moon.bC AUTO_SOUP;

public static com.moon.bC AUTO_POTION;

public static com.moon.bC MOVE_BLOCKS;

private java.lang.String a;

private static com.moon.bC[] b;

private static long c;

private static long d;

private bC(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(-936406457615442663L)), ((long)(-7193331246053281240L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101922174327925L)))));
    long local14_life6 = (com.moon.bC.c ^ 96024421500333L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill17_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill17_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill17_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill17_13 = new byte[8];
    (__sourceSpill17_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill17_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation17_15 = __sourceSpill17_13;
    ((javax.crypto.Cipher)(__sourceSpill17_10)).init(((int)(__sourceSpill17_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill17_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation17_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[12];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "\027\0350xÐëwX|±\001{\"ûÚ\020ÆÌèJCÕ)\177,P|1c\020í33PDMìh\r°¨s\"ÇL\020ÔÓNS¬6\027òF&õR\021\021Bã\020\034~ÿãá\fT\035+·rDµ¡D\020\025\007<îîp\t0Ìù²v(ó\020F6\024[\013|ûòXù òÈ\013ù\020èÉvþ+A¯_Mc(\03420Â\020¹ªø0Âp@vÃ #xß2\020_ Kb×9\002ÜóHL\026yp"))).length();
    int local9_life23 = 16;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill17_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill17_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill17_28)).doFinal(((byte[])(__sourceSpill17_27)));
        java.lang.String __sourceSpill17_33 = ((java.lang.String)(com.moon.bC.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill17_34 = local5_life18;
        int __sourceSpill17_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill17_34)[__sourceSpill17_35] = __sourceSpill17_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "$ðS£\025©Ñ\037>4ÏNü°\0203LT,NÛ 0¶ÏÄºcvÿ"))).length();
    local9_life23 = 16;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill17_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill17_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill17_41)).doFinal(((byte[])(__sourceSpill17_40)));
        java.lang.String __sourceSpill17_46 = ((java.lang.String)(com.moon.bC.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill17_47 = local5_life18;
        int __sourceSpill17_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill17_47)[__sourceSpill17_48] = __sourceSpill17_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill17_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill17_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill17_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill17_56 = new byte[8];
    (__sourceSpill17_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill17_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation17_58 = __sourceSpill17_56;
    ((javax.crypto.Cipher)(__sourceSpill17_53)).init(((int)(__sourceSpill17_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill17_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation17_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = 3799888143030462712L;
    byte[] __sourceSpill17_62 = new byte[8];
    (__sourceSpill17_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill17_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill17_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill17_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill17_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill17_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill17_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill17_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill17_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill17_63)).doFinal(((byte[])(__sourceSpill17_62)));
    d = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    AUTO_CLEAN = ((com.moon.bC)(new com.moon.bC((local5_life18)[7], 0, (local5_life18)[9])));
    AUTO_ARMOR = ((com.moon.bC)(new com.moon.bC((local5_life18)[11], 1, (local5_life18)[1])));
    AUTO_SWORD = ((com.moon.bC)(new com.moon.bC((local5_life18)[10], 2, (local5_life18)[5])));
    AUTO_SOUP = ((com.moon.bC)(new com.moon.bC((local5_life18)[0], 3, (local5_life18)[8])));
    AUTO_POTION = ((com.moon.bC)(new com.moon.bC((local5_life18)[6], 4, (local5_life18)[3])));
    MOVE_BLOCKS = ((com.moon.bC)(new com.moon.bC((local5_life18)[4], 5, (local5_life18)[2])));
    b = ((com.moon.bC[])(com.moon.bC.a__ArraybC()));
}


public static com.moon.bC[] values() {
return ((com.moon.bC[])(((com.moon.bC[])(com.moon.bC.b)).clone()));
}


public static com.moon.bC valueOf(java.lang.String p0) {
return ((com.moon.bC)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bC.class)), ((java.lang.String)(p0)))));
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
        byte[] spill43_0 = p0;
        life4_9 += 1;
        life5_44 = (spill43_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill43_1 = p0;
        life4_9 += 1;
        life5_76 = (spill43_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill43_2 = p0;
        life4_9 += 1;
        life5_91 = (spill43_2)[life4_9];
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


private static com.moon.bC[] a__ArraybC() {
long local0_life1 = (com.moon.bC.c ^ 20427255845314L);
    com.moon.bC[] __sourceSharedArray13_4 = new com.moon.bC[((int) com.moon.bC.d)];
    __sourceSharedArray13_4[0] = com.moon.bC.AUTO_CLEAN;
    __sourceSharedArray13_4[1] = com.moon.bC.AUTO_ARMOR;
    __sourceSharedArray13_4[2] = com.moon.bC.AUTO_SWORD;
    __sourceSharedArray13_4[3] = com.moon.bC.AUTO_SOUP;
    __sourceSharedArray13_4[4] = com.moon.bC.AUTO_POTION;
    __sourceSharedArray13_4[5] = com.moon.bC.MOVE_BLOCKS;
    return __sourceSharedArray13_4;
}

}
