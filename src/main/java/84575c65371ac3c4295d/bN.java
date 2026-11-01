package com.moon;


public class bN extends sourcebuild.EnumConstructor<com.moon.bN> implements com.moon.l8 {

public static com.moon.bN LINEAR;

public static com.moon.bN IN_BACK;

private java.lang.String a;

private com.moon.cj b;

private static com.moon.bN[] c;

private bN(java.lang.String p0, int p1, java.lang.String p2, com.moon.cj p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(1223956757587467665L)), ((long)(8900946666044804088L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(22394934031428L))) ^ 135732836064186L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill45_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill45_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill45_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill45_11 = new byte[8];
    (__sourceSpill45_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill45_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation45_13 = __sourceSpill45_11;
    ((javax.crypto.Cipher)(__sourceSpill45_8)).init(((int)(__sourceSpill45_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill45_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation45_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[4];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "×L»¡,\000`M\bÉN_%|L!ç"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill45_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill45_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill45_26)).doFinal(((byte[])(__sourceSpill45_25)));
        java.lang.String __sourceSpill45_31 = ((java.lang.String)(com.moon.bN.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill45_32 = local0_life16;
        int __sourceSpill45_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill45_32)[__sourceSpill45_33] = __sourceSpill45_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "ç.Õöñ2\b÷íe×Gäø"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill45_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill45_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill45_40)).doFinal(((byte[])(__sourceSpill45_39)));
        java.lang.String __sourceSpill45_45 = ((java.lang.String)(com.moon.bN.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill45_46 = local0_life16;
        int __sourceSpill45_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill45_46)[__sourceSpill45_47] = __sourceSpill45_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    LINEAR = ((com.moon.bN)(new com.moon.bN((local0_life16)[3], 0, (local0_life16)[0], com.moon.cj.LINEAR)));
    IN_BACK = ((com.moon.bN)(new com.moon.bN((local0_life16)[2], 1, (local0_life16)[1], com.moon.cj.EASE_IN_BACK)));
    c = ((com.moon.bN[])(com.moon.bN.a__ArraybN()));
}


public static com.moon.bN[] values() {
return ((com.moon.bN[])(((com.moon.bN[])(com.moon.bN.c)).clone()));
}


public static com.moon.bN valueOf(java.lang.String p0) {
return ((com.moon.bN)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bN.class)), ((java.lang.String)(p0)))));
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
        byte[] spill58_0 = p0;
        life4_9 += 1;
        life5_44 = (spill58_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill58_1 = p0;
        life4_9 += 1;
        life5_76 = (spill58_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill58_2 = p0;
        life4_9 += 1;
        life5_91 = (spill58_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bN[] a__ArraybN() {
return new com.moon.bN[] {com.moon.bN.LINEAR, com.moon.bN.IN_BACK};
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.cj a() {
return this.b;
}

}
