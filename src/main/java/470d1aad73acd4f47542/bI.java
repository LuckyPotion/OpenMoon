package com.moon;


public class bI extends sourcebuild.EnumConstructor<com.moon.bI> implements com.moon.l8 {

public static com.moon.bI NORMAL;

public static com.moon.bI HYPIXEL;

private java.lang.String a;

private com.moon.gH b;

private static com.moon.bI[] c;

private bI(java.lang.String p0, int p1, java.lang.String p2, com.moon.gH p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-2094032579817864867L)), ((long)(8105348117555318864L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(41818712015773L))) ^ 64540035991557L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill40_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill40_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill40_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill40_11 = new byte[8];
    (__sourceSpill40_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill40_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation40_13 = __sourceSpill40_11;
    ((javax.crypto.Cipher)(__sourceSpill40_8)).init(((int)(__sourceSpill40_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill40_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation40_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[4];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "/Ý9\005±Ñ\023A\bi2ÉW%f1K"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill40_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill40_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill40_26)).doFinal(((byte[])(__sourceSpill40_25)));
        java.lang.String __sourceSpill40_31 = ((java.lang.String)(com.moon.bI.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill40_32 = local0_life16;
        int __sourceSpill40_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill40_32)[__sourceSpill40_33] = __sourceSpill40_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "rûMa\rõ.\006\bËë¼fm,\003"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill40_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill40_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill40_40)).doFinal(((byte[])(__sourceSpill40_39)));
        java.lang.String __sourceSpill40_45 = ((java.lang.String)(com.moon.bI.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill40_46 = local0_life16;
        int __sourceSpill40_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill40_46)[__sourceSpill40_47] = __sourceSpill40_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    NORMAL = ((com.moon.bI)(new com.moon.bI((local0_life16)[3], 0, (local0_life16)[0], new com.moon.gJ())));
    HYPIXEL = ((com.moon.bI)(new com.moon.bI((local0_life16)[1], 1, (local0_life16)[2], new com.moon.gI())));
    c = ((com.moon.bI[])(com.moon.bI.a__ArraybI()));
}


public static com.moon.bI[] values() {
return ((com.moon.bI[])(((com.moon.bI[])(com.moon.bI.c)).clone()));
}


public static com.moon.bI valueOf(java.lang.String p0) {
return ((com.moon.bI)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bI.class)), ((java.lang.String)(p0)))));
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
        byte[] spill49_0 = p0;
        life4_9 += 1;
        life5_44 = (spill49_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill49_1 = p0;
        life4_9 += 1;
        life5_76 = (spill49_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill49_2 = p0;
        life4_9 += 1;
        life5_91 = (spill49_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bI[] a__ArraybI() {
return new com.moon.bI[] {com.moon.bI.NORMAL, com.moon.bI.HYPIXEL};
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.gH a() {
return this.b;
}

}
