package com.moon;


public class bF extends sourcebuild.EnumConstructor<com.moon.bF> implements com.moon.l8 {

public static com.moon.bF CALCULATED;

public static com.moon.bF BRUTEFORCE;

public static com.moon.bF BACKWARDS;

public static com.moon.bF STATIC;

public static com.moon.bF ECONOMIC;

private java.lang.String a;

private static com.moon.bF[] b;

private static java.lang.String c;

private bF(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(8659663698768852172L)), ((long)(617225783214504344L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(75137147439401L))) ^ 135977838957698L);
    if ((com.moon.bF.b() == null)) {
        com.moon.bF.b(((java.lang.String)("ALKEQc")));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill37_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill37_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill37_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill37_13 = new byte[8];
    (__sourceSpill37_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill37_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation37_15 = __sourceSpill37_13;
    ((javax.crypto.Cipher)(__sourceSpill37_10)).init(((int)(__sourceSpill37_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill37_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation37_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[10];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "\177¦GL\021¾\020çWÂÔzJàðP\027`\021p\027\030Å`\020\000ÒwR\001¥>:ÔYQ\003Hr\025ý,s¼\020¢¤{?®çüO]1}ï­¾\016\020tHz\\kf\007øg~\031V­×Ï\b¦¤¼Â\007ýÍ\020£:(\001ÖvÙ\037ñ\r±îòò\020I4ß%>$¬ÝÄÔ\021ÉÓ"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill37_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill37_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill37_28)).doFinal(((byte[])(__sourceSpill37_27)));
        java.lang.String __sourceSpill37_33 = ((java.lang.String)(com.moon.bF.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill37_34 = local0_life18;
        int __sourceSpill37_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill37_34)[__sourceSpill37_35] = __sourceSpill37_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "¸×3}ô²K!\004a#æî¾õ\037\020kH\034ÆÉ.Á¤\017¡iÅÅrÏ"))).length();
    local4_life23 = 16;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill37_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill37_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill37_42)).doFinal(((byte[])(__sourceSpill37_41)));
        java.lang.String __sourceSpill37_47 = ((java.lang.String)(com.moon.bF.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill37_48 = local0_life18;
        int __sourceSpill37_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill37_48)[__sourceSpill37_49] = __sourceSpill37_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    CALCULATED = ((com.moon.bF)(new com.moon.bF((local0_life18)[6], 0, (local0_life18)[8])));
    BRUTEFORCE = ((com.moon.bF)(new com.moon.bF((local0_life18)[3], 1, (local0_life18)[1])));
    BACKWARDS = ((com.moon.bF)(new com.moon.bF((local0_life18)[4], 2, (local0_life18)[2])));
    STATIC = ((com.moon.bF)(new com.moon.bF((local0_life18)[5], 3, (local0_life18)[0])));
    ECONOMIC = ((com.moon.bF)(new com.moon.bF((local0_life18)[9], 4, (local0_life18)[7])));
    b = ((com.moon.bF[])(com.moon.bF.a__ArraybF()));
}


public static com.moon.bF[] values() {
return ((com.moon.bF[])(((com.moon.bF[])(com.moon.bF.b)).clone()));
}


public static com.moon.bF valueOf(java.lang.String p0) {
return ((com.moon.bF)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bF.class)), ((java.lang.String)(p0)))));
}


public static void b(java.lang.String p0) {
c = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return com.moon.bF.c;
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
        byte[] spill46_0 = p0;
        life4_9 += 1;
        life5_44 = (spill46_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill46_1 = p0;
        life4_9 += 1;
        life5_76 = (spill46_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill46_2 = p0;
        life4_9 += 1;
        life5_91 = (spill46_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bF[] a__ArraybF() {
return new com.moon.bF[] {com.moon.bF.CALCULATED, com.moon.bF.BRUTEFORCE, com.moon.bF.BACKWARDS, com.moon.bF.STATIC, com.moon.bF.ECONOMIC};
}


public java.lang.String a__String() {
return this.a;
}

}
