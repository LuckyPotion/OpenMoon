package com.moon;


public class bD extends sourcebuild.EnumConstructor<com.moon.bD> implements com.moon.l8, com.moon.kS<com.moon.module.impl.NoFall> {

public static com.moon.bD VANILLA;

public static com.moon.bD FLAG;

public static com.moon.bD VERUS;

public static com.moon.bD BLINK;

public static com.moon.bD COLLISION;

public static com.moon.bD WATCHDOG;

java.lang.String a;

com.moon.e2<com.moon.module.impl.NoFall> b;

private static com.moon.bD[] c;

private static long d;

private static long e;

private bD(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.NoFall> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(4540644916183839829L)), ((long)(2399130397097179360L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(12257310817989L)))));
    long local14_life6 = (com.moon.bD.d ^ 98612888257293L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill18_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill18_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill18_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill18_13 = new byte[8];
    (__sourceSpill18_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill18_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation18_15 = __sourceSpill18_13;
    ((javax.crypto.Cipher)(__sourceSpill18_10)).init(((int)(__sourceSpill18_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill18_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation18_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[12];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "Z¯\016÷\030\037Üp²Û9ðð\020tjÅ¹Ó±ûÒwÌ»%þ\bÅì\037>Ä)=\b2§\031¥Aé&\037\b\n\020ÙÎºO\020î_[i_zi\004¨·öaÍ\brÚ\rP~W½4\020N²Ú­+\"\021%-ÿ\03494-¹b\b÷=?¢\037\034Ã\bÚ_H©gé;"))).length();
    int local9_life23 = 16;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill18_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill18_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill18_28)).doFinal(((byte[])(__sourceSpill18_27)));
        java.lang.String __sourceSpill18_33 = ((java.lang.String)(com.moon.bD.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill18_34 = local5_life18;
        int __sourceSpill18_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill18_34)[__sourceSpill18_35] = __sourceSpill18_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "ì\001kj¾Ö\007\b:\fvu«k-\n"))).length();
    local9_life23 = 8;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill18_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill18_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill18_41)).doFinal(((byte[])(__sourceSpill18_40)));
        java.lang.String __sourceSpill18_46 = ((java.lang.String)(com.moon.bD.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill18_47 = local5_life18;
        int __sourceSpill18_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill18_47)[__sourceSpill18_48] = __sourceSpill18_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill18_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill18_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill18_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill18_56 = new byte[8];
    (__sourceSpill18_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill18_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation18_58 = __sourceSpill18_56;
    ((javax.crypto.Cipher)(__sourceSpill18_53)).init(((int)(__sourceSpill18_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill18_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation18_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = -7181575786703762034L;
    byte[] __sourceSpill18_62 = new byte[8];
    (__sourceSpill18_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill18_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill18_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill18_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill18_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill18_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill18_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill18_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill18_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill18_63)).doFinal(((byte[])(__sourceSpill18_62)));
    e = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    VANILLA = ((com.moon.bD)(new com.moon.bD((local5_life18)[2], 0, (local5_life18)[11], new com.moon.fP())));
    FLAG = ((com.moon.bD)(new com.moon.bD((local5_life18)[10], 1, (local5_life18)[4], new com.moon.fO())));
    VERUS = ((com.moon.bD)(new com.moon.bD((local5_life18)[9], 2, (local5_life18)[6], new com.moon.fQ())));
    BLINK = ((com.moon.bD)(new com.moon.bD((local5_life18)[8], 3, (local5_life18)[3], new com.moon.fM())));
    COLLISION = ((com.moon.bD)(new com.moon.bD((local5_life18)[7], 4, (local5_life18)[0], new com.moon.fN())));
    WATCHDOG = ((com.moon.bD)(new com.moon.bD((local5_life18)[1], 5, (local5_life18)[5], new com.moon.fR())));
    c = ((com.moon.bD[])(com.moon.bD.a__ArraybD()));
}


public static com.moon.bD[] values() {
return ((com.moon.bD[])(((com.moon.bD[])(com.moon.bD.c)).clone()));
}


public static com.moon.bD valueOf(java.lang.String p0) {
return ((com.moon.bD)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bD.class)), ((java.lang.String)(p0)))));
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
        byte[] spill44_0 = p0;
        life4_9 += 1;
        life5_44 = (spill44_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill44_1 = p0;
        life4_9 += 1;
        life5_76 = (spill44_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill44_2 = p0;
        life4_9 += 1;
        life5_91 = (spill44_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bD[] a__ArraybD() {
long local0_life1 = (com.moon.bD.d ^ 49614964418082L);
    com.moon.bD[] __sourceSharedArray14_4 = new com.moon.bD[((int) com.moon.bD.e)];
    __sourceSharedArray14_4[0] = com.moon.bD.VANILLA;
    __sourceSharedArray14_4[1] = com.moon.bD.FLAG;
    __sourceSharedArray14_4[2] = com.moon.bD.VERUS;
    __sourceSharedArray14_4[3] = com.moon.bD.BLINK;
    __sourceSharedArray14_4[4] = com.moon.bD.COLLISION;
    __sourceSharedArray14_4[5] = com.moon.bD.WATCHDOG;
    return __sourceSharedArray14_4;
}


public com.moon.e2<com.moon.module.impl.NoFall> a() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}

}
