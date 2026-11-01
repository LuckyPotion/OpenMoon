package com.moon.module;

/** Unaccepted same-owner source composition; fixed enum lowering required. */

public final class ModuleCategory extends sourcebuild.EnumConstructor<com.moon.module.ModuleCategory> implements com.moon.l8 {

public static com.moon.module.ModuleCategory COMBAT;

public static com.moon.module.ModuleCategory MOVEMENT;

public static com.moon.module.ModuleCategory PLAYER;

public static com.moon.module.ModuleCategory EXPLOIT;

public static com.moon.module.ModuleCategory VISUAL;

public static com.moon.module.ModuleCategory SCRIPTS;

private final java.lang.String a;

private final java.lang.String b;

private static com.moon.module.ModuleCategory[] c;

private static long d;

private static long e;

private ModuleCategory(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {
    super(p0, p1);
    this.a = p2;
    this.b = p3;
}

private static void initialize() throws Throwable {
    com.moon.module.ModuleCategory.d = (moom._c.a(3781573466050780769L, 942195357101821908L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(128353242283236L);
    long local14_life6 = (com.moon.module.ModuleCategory.d ^ 42117530396569L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill252_10 = (local6_life8 = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding"));
    int __sourceSpill252_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill252_12 = javax.crypto.SecretKeyFactory.getInstance("DES");
    byte[] __sourceSpill252_13 = new byte[8];
    (__sourceSpill252_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill252_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation252_15 = __sourceSpill252_13;
    (__sourceSpill252_10).init(__sourceSpill252_11, (__sourceSpill252_12).generateSecret(new javax.crypto.spec.DESKeySpec(__sourcePreallocation252_15)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    java.lang.String[] local5_life18 = new java.lang.String[12];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((local10_life20 = "[|Qí\005ïb«\020¬x\035Ap§¾f>\035ø$nrm\b}Âö6ÿ}+\bUlÊæ^\b.ª\177,\017MÏ\bPÔÀ¶¹â\bcI\023\b5«\b-?>¥²\b¯mNq\001ªHÉ\b\025\022bÔé¤2")).length();
    int local9_life23 = 8;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill252_27 = ((local10_life20).substring(local8_life24, (local8_life24 + local9_life23))).getBytes("ISO-8859-1");
        javax.crypto.Cipher __sourceSpill252_28 = local6_life8;
        byte[] local13_life30 = (__sourceSpill252_28).doFinal(__sourceSpill252_27);
        java.lang.String __sourceSpill252_33 = (com.moon.module.ModuleCategory.a(local13_life30)).intern();
        java.lang.String[] __sourceSpill252_34 = local5_life18;
        int __sourceSpill252_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill252_34)[__sourceSpill252_35] = __sourceSpill252_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = (local10_life20).charAt(local8_life24);
    }
    local12_life22 = ((local10_life20 = "\034á\"¦G,'´Ôá\000¥°\b%U\016ñ¿")).length();
    local9_life23 = 16;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill252_40 = ((local10_life20).substring(local8_life24, (local8_life24 + local9_life23))).getBytes("ISO-8859-1");
        javax.crypto.Cipher __sourceSpill252_41 = local6_life8;
        byte[] local13_life43 = (__sourceSpill252_41).doFinal(__sourceSpill252_40);
        java.lang.String __sourceSpill252_46 = (com.moon.module.ModuleCategory.a(local13_life43)).intern();
        java.lang.String[] __sourceSpill252_47 = local5_life18;
        int __sourceSpill252_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill252_47)[__sourceSpill252_48] = __sourceSpill252_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = (local10_life20).charAt(local8_life24);
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill252_53 = (local0_life51 = javax.crypto.Cipher.getInstance("DES/CBC/NoPadding"));
    int __sourceSpill252_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill252_55 = javax.crypto.SecretKeyFactory.getInstance("DES");
    byte[] __sourceSpill252_56 = new byte[8];
    (__sourceSpill252_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill252_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation252_58 = __sourceSpill252_56;
    (__sourceSpill252_53).init(__sourceSpill252_54, (__sourceSpill252_55).generateSecret(new javax.crypto.spec.DESKeySpec(__sourcePreallocation252_58)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long local2_life61 = 7797061769482254781L;
    byte[] __sourceSpill252_62 = new byte[8];
    (__sourceSpill252_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill252_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill252_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill252_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill252_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill252_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill252_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill252_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill252_63 = local0_life51;
    byte[] local4_life65 = (__sourceSpill252_63).doFinal(__sourceSpill252_62);
    com.moon.module.ModuleCategory.e = (((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L));
    com.moon.module.ModuleCategory.COMBAT = new com.moon.module.ModuleCategory((local5_life18)[9], 0, (local5_life18)[2], "");
    com.moon.module.ModuleCategory.MOVEMENT = new com.moon.module.ModuleCategory((local5_life18)[1], 1, (local5_life18)[10], "");
    com.moon.module.ModuleCategory.PLAYER = new com.moon.module.ModuleCategory((local5_life18)[4], 2, (local5_life18)[3], "");
    com.moon.module.ModuleCategory.EXPLOIT = new com.moon.module.ModuleCategory((local5_life18)[8], 3, (local5_life18)[7], "");
    com.moon.module.ModuleCategory.VISUAL = new com.moon.module.ModuleCategory((local5_life18)[11], 4, (local5_life18)[0], "");
    com.moon.module.ModuleCategory.SCRIPTS = new com.moon.module.ModuleCategory((local5_life18)[5], 5, (local5_life18)[6], "");
    com.moon.module.ModuleCategory.c = com.moon.module.ModuleCategory.a__Arraya5();
    return;
}

public static com.moon.module.ModuleCategory[] values() {
    return ((com.moon.module.ModuleCategory[])(Object)((com.moon.module.ModuleCategory.c).clone()));
}

public static com.moon.module.ModuleCategory valueOf(java.lang.String p0) {
    return ((com.moon.module.ModuleCategory)(Object)(java.lang.Enum.valueOf((java.lang.Class)(com.moon.module.ModuleCategory.class), p0)));
}

public java.lang.String b() {
    return (this).a;
}

public java.lang.String c() {
    return (this).b;
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
        byte[] spill1007_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1007_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1007_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1007_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1007_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1007_2)[life4_9];
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
    return (this).a;
}

private static com.moon.module.ModuleCategory[] a__Arraya5() {
    long local0_life1 = (com.moon.module.ModuleCategory.d ^ 110047284663672L);
    com.moon.module.ModuleCategory[] __sourceSharedArray200_4 = new com.moon.module.ModuleCategory[((int) com.moon.module.ModuleCategory.e)];
    __sourceSharedArray200_4[0] = com.moon.module.ModuleCategory.COMBAT;
    __sourceSharedArray200_4[1] = com.moon.module.ModuleCategory.MOVEMENT;
    __sourceSharedArray200_4[2] = com.moon.module.ModuleCategory.PLAYER;
    __sourceSharedArray200_4[3] = com.moon.module.ModuleCategory.EXPLOIT;
    __sourceSharedArray200_4[4] = com.moon.module.ModuleCategory.VISUAL;
    __sourceSharedArray200_4[5] = com.moon.module.ModuleCategory.SCRIPTS;
    return __sourceSharedArray200_4;
}

}
