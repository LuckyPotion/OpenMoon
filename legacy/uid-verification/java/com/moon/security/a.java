package com.moon.security;


public class a extends sourcebuild.EnumConstructor<com.moon.security.a> {

public static com.moon.security.a WINDOWS;

public static com.moon.security.a LINUX;

java.lang.String a;

com.moon.security.b b;

private static com.moon.security.a[] c;

private static long d;

private a(java.lang.String p0, int p1, java.lang.String p2, com.moon.security.b p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-1387455716753277035L)), ((long)(-4684315078497953076L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(163690374758324L)))));
    long local9_life6 = (com.moon.security.a.d ^ 104430731893850L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill566_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill566_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill566_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill566_13 = new byte[8];
    (__sourceSpill566_13)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill566_13)[local2_life14] = ((byte) ((int) ((local9_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation566_15 = __sourceSpill566_13;
    ((javax.crypto.Cipher)(__sourceSpill566_10)).init(((int)(__sourceSpill566_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill566_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation566_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[4];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "ß\0132BJWÃÜGÔÅºÄì\bÏTo?\037c*×\030ß\0132BJWÃÜ\002=öÈv-0Íÿ\005ÙQ\036"))).length();
    int local4_life23 = 24;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill566_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill566_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill566_28)).doFinal(((byte[])(__sourceSpill566_27)));
        java.lang.String __sourceSpill566_33 = ((java.lang.String)(com.moon.security.a.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill566_34 = local0_life18;
        int __sourceSpill566_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill566_34)[__sourceSpill566_35] = __sourceSpill566_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "òDñ:%\002Ö\b¤[f©ÉÐ\030"))).length();
    local4_life23 = 8;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill566_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill566_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill566_42)).doFinal(((byte[])(__sourceSpill566_41)));
        java.lang.String __sourceSpill566_47 = ((java.lang.String)(com.moon.security.a.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill566_48 = local0_life18;
        int __sourceSpill566_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill566_48)[__sourceSpill566_49] = __sourceSpill566_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    WINDOWS = ((com.moon.security.a)(new com.moon.security.a((local0_life18)[2], 0, (local0_life18)[1], com.moon.security.b.WINDOWS)));
    LINUX = ((com.moon.security.a)(new com.moon.security.a((local0_life18)[3], 1, (local0_life18)[0], com.moon.security.b.LINUX)));
    c = ((com.moon.security.a[])(com.moon.security.a.a__Arraya()));
}


public static com.moon.security.a[] values() {
return ((com.moon.security.a[])(((com.moon.security.a[])(com.moon.security.a.c)).clone()));
}


public static com.moon.security.a valueOf(java.lang.String p0) {
return ((com.moon.security.a)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.security.a.class)), ((java.lang.String)(p0)))));
}


private static com.moon.security.a[] a__Arraya() {
return new com.moon.security.a[] {com.moon.security.a.WINDOWS, com.moon.security.a.LINUX};
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill1718_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1718_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1718_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1718_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1718_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1718_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static com.moon.security.a a(com.moon.security.b p0) {
long local1 = (com.moon.security.a.d ^ 72614441055160L);
    com.moon.security.a[] local3 = com.moon.security.a.values();
    int local4 = (local3).length;
    int local5 = 0;
    while ((local5 < local4)) {
        com.moon.security.a local6 = (local3)[local5];
        if ((((com.moon.security.a)(local6)).a() == p0)) {
        return local6;
    }
        local5 += 1;
    }
    return null;
}


public com.moon.security.b a() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}

}
