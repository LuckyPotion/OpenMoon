package com.moon;


class bj extends sourcebuild.EnumConstructor<com.moon.bj> implements com.moon.l8 {

public static com.moon.bj PULSE;

public static com.moon.bj CONSTANT;

public static com.moon.bj DEV;

private java.lang.String a;

private static com.moon.bj[] b;

private bj(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-8764535737673793492L)), ((long)(1126377620998743088L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(115180476102679L))) ^ 117733668977584L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill65_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill65_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill65_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill65_11 = new byte[8];
    (__sourceSpill65_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill65_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation65_13 = __sourceSpill65_11;
    ((javax.crypto.Cipher)(__sourceSpill65_8)).init(((int)(__sourceSpill65_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill65_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation65_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "²ð)S[ f~\bhq@Q\022õ\020D¢\036ùìÔÿ\031y'Ê¦³\b¼\033ÖzÉûÐ"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill65_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill65_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill65_26)).doFinal(((byte[])(__sourceSpill65_25)));
        java.lang.String __sourceSpill65_31 = ((java.lang.String)(com.moon.bj.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill65_32 = local0_life16;
        int __sourceSpill65_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill65_32)[__sourceSpill65_33] = __sourceSpill65_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "qÈ\033JKX|\020[)Ã\030À\tåÝ\024ª§xà"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill65_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill65_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill65_40)).doFinal(((byte[])(__sourceSpill65_39)));
        java.lang.String __sourceSpill65_45 = ((java.lang.String)(com.moon.bj.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill65_46 = local0_life16;
        int __sourceSpill65_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill65_46)[__sourceSpill65_47] = __sourceSpill65_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    PULSE = ((com.moon.bj)(new com.moon.bj((local0_life16)[0], 0, (local0_life16)[1])));
    CONSTANT = ((com.moon.bj)(new com.moon.bj((local0_life16)[5], 1, (local0_life16)[2])));
    DEV = ((com.moon.bj)(new com.moon.bj((local0_life16)[3], 2, (local0_life16)[4])));
    b = ((com.moon.bj[])(com.moon.bj.a__Arraybj()));
}


public static com.moon.bj[] values() {
return ((com.moon.bj[])(((com.moon.bj[])(com.moon.bj.b)).clone()));
}


public static com.moon.bj valueOf(java.lang.String p0) {
return ((com.moon.bj)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bj.class)), ((java.lang.String)(p0)))));
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
        byte[] spill80_0 = p0;
        life4_9 += 1;
        life5_44 = (spill80_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill80_1 = p0;
        life4_9 += 1;
        life5_76 = (spill80_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill80_2 = p0;
        life4_9 += 1;
        life5_91 = (spill80_2)[life4_9];
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


private static com.moon.bj[] a__Arraybj() {
return new com.moon.bj[] {com.moon.bj.PULSE, com.moon.bj.CONSTANT, com.moon.bj.DEV};
}

}
