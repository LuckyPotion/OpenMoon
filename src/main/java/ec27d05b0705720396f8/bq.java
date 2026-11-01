package com.moon;


public class bq extends sourcebuild.EnumConstructor<com.moon.bq> implements com.moon.l8, com.moon.kS<com.moon.module.impl.Tickbase> {

public static com.moon.bq NORMAL;

public static com.moon.bq REVERSE;

public static com.moon.bq BLINK;

private java.lang.String a;

private com.moon.e2<com.moon.module.impl.Tickbase> b;

private static com.moon.bq[] c;

private bq(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.Tickbase> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-6579116757478067664L)), ((long)(-3022777875563508163L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(276429969906919L))) ^ 106277468879428L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill72_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill72_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill72_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill72_11 = new byte[8];
    (__sourceSpill72_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill72_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation72_13 = __sourceSpill72_11;
    ((javax.crypto.Cipher)(__sourceSpill72_8)).init(((int)(__sourceSpill72_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill72_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation72_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "Fc^\013:;¥ó\030wí(j\032²n|ê\r+ûÖºHú¢:±/Õ\b\f>$ºâVñ\bÉ°\017ÍÇÝ"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill72_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill72_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill72_26)).doFinal(((byte[])(__sourceSpill72_25)));
        java.lang.String __sourceSpill72_31 = ((java.lang.String)(com.moon.bq.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill72_32 = local0_life16;
        int __sourceSpill72_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill72_32)[__sourceSpill72_33] = __sourceSpill72_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "§e»·1Ò\r@\020>T2\"\b¬àQ]\bl\013vµ"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill72_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill72_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill72_40)).doFinal(((byte[])(__sourceSpill72_39)));
        java.lang.String __sourceSpill72_45 = ((java.lang.String)(com.moon.bq.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill72_46 = local0_life16;
        int __sourceSpill72_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill72_46)[__sourceSpill72_47] = __sourceSpill72_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    NORMAL = ((com.moon.bq)(new com.moon.bq((local0_life16)[2], 0, (local0_life16)[4], new com.moon.fh())));
    REVERSE = ((com.moon.bq)(new com.moon.bq((local0_life16)[0], 1, (local0_life16)[5], new com.moon.fi())));
    BLINK = ((com.moon.bq)(new com.moon.bq((local0_life16)[3], 2, (local0_life16)[1], new com.moon.fg())));
    c = ((com.moon.bq[])(com.moon.bq.a__Arraybq()));
}


public static com.moon.bq[] values() {
return ((com.moon.bq[])(((com.moon.bq[])(com.moon.bq.c)).clone()));
}


public static com.moon.bq valueOf(java.lang.String p0) {
return ((com.moon.bq)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bq.class)), ((java.lang.String)(p0)))));
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
        byte[] spill87_0 = p0;
        life4_9 += 1;
        life5_44 = (spill87_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill87_1 = p0;
        life4_9 += 1;
        life5_76 = (spill87_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill87_2 = p0;
        life4_9 += 1;
        life5_91 = (spill87_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bq[] a__Arraybq() {
return new com.moon.bq[] {com.moon.bq.NORMAL, com.moon.bq.REVERSE, com.moon.bq.BLINK};
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.e2<com.moon.module.impl.Tickbase> a() {
return this.b;
}

}
