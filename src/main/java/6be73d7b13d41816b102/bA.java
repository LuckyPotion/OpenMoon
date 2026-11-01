package com.moon;


public class bA extends sourcebuild.EnumConstructor<com.moon.bA> implements com.moon.l8 {

public static com.moon.bA INSTANT_HEAL;

public static com.moon.bA RESISTANCE;

public static com.moon.bA REGENERATION;

public static com.moon.bA SPEED;

private java.lang.String a;

private static com.moon.bA[] b;

private bA(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-4872563863031519500L)), ((long)(-9060539645247368275L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(194688494745657L))) ^ 4294593542786L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill32_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill32_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill32_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill32_11 = new byte[8];
    (__sourceSpill32_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill32_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation32_13 = __sourceSpill32_11;
    ((javax.crypto.Cipher)(__sourceSpill32_8)).init(((int)(__sourceSpill32_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill32_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation32_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[8];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "Ô´ñª·¼÷\020\177R©µú×­\007\râ%ãª´\020\024V¸ü\025ì\004ù\013ýçQÈY\020$\026ør³ãzAÜÃ\032¡ªú©\020hàÄ\t\024O\f\007ÜûÝaè\b§dZL\032\000?"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill32_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill32_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill32_26)).doFinal(((byte[])(__sourceSpill32_25)));
        java.lang.String __sourceSpill32_31 = ((java.lang.String)(com.moon.bA.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill32_32 = local0_life16;
        int __sourceSpill32_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill32_32)[__sourceSpill32_33] = __sourceSpill32_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = ")\023³>\016>Õßxuã<\004\fó\020\b5*sÔ\004¬O1&¯\004"))).length();
    local4_life21 = 16;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill32_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill32_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill32_40)).doFinal(((byte[])(__sourceSpill32_39)));
        java.lang.String __sourceSpill32_45 = ((java.lang.String)(com.moon.bA.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill32_46 = local0_life16;
        int __sourceSpill32_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill32_46)[__sourceSpill32_47] = __sourceSpill32_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    INSTANT_HEAL = ((com.moon.bA)(new com.moon.bA((local0_life16)[6], 0, (local0_life16)[3])));
    RESISTANCE = ((com.moon.bA)(new com.moon.bA((local0_life16)[7], 1, (local0_life16)[2])));
    REGENERATION = ((com.moon.bA)(new com.moon.bA((local0_life16)[4], 2, (local0_life16)[1])));
    SPEED = ((com.moon.bA)(new com.moon.bA((local0_life16)[5], 3, (local0_life16)[0])));
    b = ((com.moon.bA[])(com.moon.bA.a__ArraybA()));
}


public static com.moon.bA[] values() {
return ((com.moon.bA[])(((com.moon.bA[])(com.moon.bA.b)).clone()));
}


public static com.moon.bA valueOf(java.lang.String p0) {
return ((com.moon.bA)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bA.class)), ((java.lang.String)(p0)))));
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
        byte[] spill41_0 = p0;
        life4_9 += 1;
        life5_44 = (spill41_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill41_1 = p0;
        life4_9 += 1;
        life5_76 = (spill41_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill41_2 = p0;
        life4_9 += 1;
        life5_91 = (spill41_2)[life4_9];
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


private static com.moon.bA[] a__ArraybA() {
return new com.moon.bA[] {com.moon.bA.INSTANT_HEAL, com.moon.bA.RESISTANCE, com.moon.bA.REGENERATION, com.moon.bA.SPEED};
}

}
