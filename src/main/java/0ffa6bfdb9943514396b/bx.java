package com.moon;


public class bx extends sourcebuild.EnumConstructor<com.moon.bx> implements com.moon.l8 {

public static com.moon.bx GROUND;

public static com.moon.bx HOP;

private java.lang.String a;

private static com.moon.bx[] b;

private static int[] c;

private bx(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(3861020071144646736L)), ((long)(-2575418694647366751L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(76540316718033L))) ^ 5829199060313L);
    if ((com.moon.bx.b() != null)) {
        com.moon.bx.b(((int[])(new int[5])));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill76_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill76_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill76_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill76_13 = new byte[8];
    (__sourceSpill76_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill76_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation76_15 = __sourceSpill76_13;
    ((javax.crypto.Cipher)(__sourceSpill76_10)).init(((int)(__sourceSpill76_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill76_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation76_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[4];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "\031\tJD\037=ÃS\bò¦v*!,"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill76_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill76_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill76_28)).doFinal(((byte[])(__sourceSpill76_27)));
        java.lang.String __sourceSpill76_33 = ((java.lang.String)(com.moon.bx.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill76_34 = local0_life18;
        int __sourceSpill76_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill76_34)[__sourceSpill76_35] = __sourceSpill76_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "Óm\f\0004ÂC\b\027?8øUP\n"))).length();
    local4_life23 = 8;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill76_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill76_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill76_42)).doFinal(((byte[])(__sourceSpill76_41)));
        java.lang.String __sourceSpill76_47 = ((java.lang.String)(com.moon.bx.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill76_48 = local0_life18;
        int __sourceSpill76_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill76_48)[__sourceSpill76_49] = __sourceSpill76_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    GROUND = ((com.moon.bx)(new com.moon.bx((local0_life18)[0], 0, (local0_life18)[3])));
    HOP = ((com.moon.bx)(new com.moon.bx((local0_life18)[2], 1, (local0_life18)[1])));
    b = ((com.moon.bx[])(com.moon.bx.a__Arraybx()));
}


public static com.moon.bx[] values() {
return ((com.moon.bx[])(((com.moon.bx[])(com.moon.bx.b)).clone()));
}


public static com.moon.bx valueOf(java.lang.String p0) {
return ((com.moon.bx)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bx.class)), ((java.lang.String)(p0)))));
}


public static void b(int[] p0) {
c = ((int[])(p0));
    return;
}


public static int[] b() {
return com.moon.bx.c;
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
        byte[] spill91_0 = p0;
        life4_9 += 1;
        life5_44 = (spill91_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill91_1 = p0;
        life4_9 += 1;
        life5_76 = (spill91_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill91_2 = p0;
        life4_9 += 1;
        life5_91 = (spill91_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bx[] a__Arraybx() {
return new com.moon.bx[] {com.moon.bx.GROUND, com.moon.bx.HOP};
}


public java.lang.String a__String() {
return this.a;
}

}
