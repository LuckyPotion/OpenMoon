package com.moon;


public class aV extends sourcebuild.EnumConstructor<com.moon.aV> {

public static com.moon.aV LOAD;

public static com.moon.aV UNLOAD;

public static com.moon.aV RELOAD;

public static com.moon.aV DELETE;

public static com.moon.aV LIST;

public static com.moon.aV FOLDER;

private static com.moon.aV[] a;

private static long b;

private static long c;

private aV(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-2941572425908181628L)), ((long)(-5079784557430103236L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202742828096291L)))));
    long local14_life6 = (com.moon.aV.b ^ 86489327204415L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill11_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill11_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill11_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill11_13 = new byte[8];
    (__sourceSpill11_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill11_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation11_15 = __sourceSpill11_13;
    ((javax.crypto.Cipher)(__sourceSpill11_10)).init(((int)(__sourceSpill11_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill11_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation11_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[6];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "K\rR¦J¶d;\b\017hæþºÅW\bÊ6õf\007´»Â\bÊ\005¶É¬Â:"))).length();
    int local9_life23 = 8;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill11_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill11_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill11_28)).doFinal(((byte[])(__sourceSpill11_27)));
        java.lang.String __sourceSpill11_33 = ((java.lang.String)(com.moon.aV.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill11_34 = local5_life18;
        int __sourceSpill11_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill11_34)[__sourceSpill11_35] = __sourceSpill11_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "ë\004ôv¼\031ø\b´ØÚ\000É"))).length();
    local9_life23 = 8;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill11_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill11_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill11_41)).doFinal(((byte[])(__sourceSpill11_40)));
        java.lang.String __sourceSpill11_46 = ((java.lang.String)(com.moon.aV.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill11_47 = local5_life18;
        int __sourceSpill11_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill11_47)[__sourceSpill11_48] = __sourceSpill11_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill11_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill11_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill11_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill11_56 = new byte[8];
    (__sourceSpill11_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill11_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation11_58 = __sourceSpill11_56;
    ((javax.crypto.Cipher)(__sourceSpill11_53)).init(((int)(__sourceSpill11_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill11_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation11_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = 8997691985522766503L;
    byte[] __sourceSpill11_62 = new byte[8];
    (__sourceSpill11_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill11_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill11_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill11_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill11_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill11_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill11_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill11_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill11_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill11_63)).doFinal(((byte[])(__sourceSpill11_62)));
    c = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    LOAD = ((com.moon.aV)(new com.moon.aV((local5_life18)[4], 0)));
    UNLOAD = ((com.moon.aV)(new com.moon.aV((local5_life18)[0], 1)));
    RELOAD = ((com.moon.aV)(new com.moon.aV((local5_life18)[1], 2)));
    DELETE = ((com.moon.aV)(new com.moon.aV((local5_life18)[2], 3)));
    LIST = ((com.moon.aV)(new com.moon.aV((local5_life18)[5], 4)));
    FOLDER = ((com.moon.aV)(new com.moon.aV((local5_life18)[3], 5)));
    a = ((com.moon.aV[])(com.moon.aV.a()));
}


public static com.moon.aV[] values() {
return ((com.moon.aV[])(((com.moon.aV[])(com.moon.aV.a)).clone()));
}


public static com.moon.aV valueOf(java.lang.String p0) {
return ((com.moon.aV)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.aV.class)), ((java.lang.String)(p0)))));
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
        byte[] spill27_0 = p0;
        life4_9 += 1;
        life5_44 = (spill27_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill27_1 = p0;
        life4_9 += 1;
        life5_76 = (spill27_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill27_2 = p0;
        life4_9 += 1;
        life5_91 = (spill27_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.aV[] a() {
long local0_life1 = (com.moon.aV.b ^ 18200230245230L);
    com.moon.aV[] __sourceSharedArray12_4 = new com.moon.aV[((int) com.moon.aV.c)];
    __sourceSharedArray12_4[0] = com.moon.aV.LOAD;
    __sourceSharedArray12_4[1] = com.moon.aV.UNLOAD;
    __sourceSharedArray12_4[2] = com.moon.aV.RELOAD;
    __sourceSharedArray12_4[3] = com.moon.aV.DELETE;
    __sourceSharedArray12_4[4] = com.moon.aV.LIST;
    __sourceSharedArray12_4[5] = com.moon.aV.FOLDER;
    return __sourceSharedArray12_4;
}

}
