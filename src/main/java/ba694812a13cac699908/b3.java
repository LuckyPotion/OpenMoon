package com.moon;


public class b3 extends sourcebuild.EnumConstructor<com.moon.b3> implements com.moon.l8 {

public static com.moon.b3 TEXT;

public static com.moon.b3 LOGO;

public static com.moon.b3 INFORMATIVE;

private java.lang.String a;

private static com.moon.b3[] b;

private b3(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(8748115360080346324L)), ((long)(6621962245842746432L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(82466739094557L))) ^ 117447130664547L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill25_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill25_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill25_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill25_11 = new byte[8];
    (__sourceSpill25_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill25_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation25_13 = __sourceSpill25_11;
    ((javax.crypto.Cipher)(__sourceSpill25_8)).init(((int)(__sourceSpill25_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill25_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation25_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "iÍ§8½Øõ\020\b2úµÝÖlÃ9\020´Xm\tyÕdÏ@°*¸ÎF\bæ}³B'P%æ"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill25_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill25_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill25_26)).doFinal(((byte[])(__sourceSpill25_25)));
        java.lang.String __sourceSpill25_31 = ((java.lang.String)(com.moon.b3.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill25_32 = local0_life16;
        int __sourceSpill25_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill25_32)[__sourceSpill25_33] = __sourceSpill25_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "\002\024ê\034¦±BÌàègÙó\b¹ñ\177¨Ý\006"))).length();
    local4_life21 = 16;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill25_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill25_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill25_40)).doFinal(((byte[])(__sourceSpill25_39)));
        java.lang.String __sourceSpill25_45 = ((java.lang.String)(com.moon.b3.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill25_46 = local0_life16;
        int __sourceSpill25_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill25_46)[__sourceSpill25_47] = __sourceSpill25_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    TEXT = ((com.moon.b3)(new com.moon.b3((local0_life16)[0], 0, (local0_life16)[1])));
    LOGO = ((com.moon.b3)(new com.moon.b3((local0_life16)[3], 1, (local0_life16)[5])));
    INFORMATIVE = ((com.moon.b3)(new com.moon.b3((local0_life16)[2], 2, (local0_life16)[4])));
    b = ((com.moon.b3[])(com.moon.b3.a__Arrayb3()));
}


public static com.moon.b3[] values() {
return ((com.moon.b3[])(((com.moon.b3[])(com.moon.b3.b)).clone()));
}


public static com.moon.b3 valueOf(java.lang.String p0) {
return ((com.moon.b3)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.b3.class)), ((java.lang.String)(p0)))));
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
        byte[] spill33_0 = p0;
        life4_9 += 1;
        life5_44 = (spill33_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill33_1 = p0;
        life4_9 += 1;
        life5_76 = (spill33_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill33_2 = p0;
        life4_9 += 1;
        life5_91 = (spill33_2)[life4_9];
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


private static com.moon.b3[] a__Arrayb3() {
return new com.moon.b3[] {com.moon.b3.TEXT, com.moon.b3.LOGO, com.moon.b3.INFORMATIVE};
}

}
