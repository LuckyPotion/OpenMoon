package com.moon;


public class bk extends sourcebuild.EnumConstructor<com.moon.bk> implements com.moon.l8 {

public static com.moon.bk NORMAL;

public static com.moon.bk PULSE;

public static com.moon.bk DELAY;

private java.lang.String a;

private static com.moon.bk[] b;

private static int c;

private bk(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-5401046338237927812L)), ((long)(5591304178468890000L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(8113473333478L))) ^ 75743377777963L);
    if ((com.moon.bk.b() != 0)) {
        com.moon.bk.b(((int)(1)));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill66_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill66_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill66_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill66_13 = new byte[8];
    (__sourceSpill66_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill66_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation66_15 = __sourceSpill66_13;
    ((javax.crypto.Cipher)(__sourceSpill66_10)).init(((int)(__sourceSpill66_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill66_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation66_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[6];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "no\034vÎDÆ}\báj¥ÿ\031H4Ç\bV^.Ç9m\033Å\bg=ôß\f_\032"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill66_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill66_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill66_28)).doFinal(((byte[])(__sourceSpill66_27)));
        java.lang.String __sourceSpill66_33 = ((java.lang.String)(com.moon.bk.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill66_34 = local0_life18;
        int __sourceSpill66_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill66_34)[__sourceSpill66_35] = __sourceSpill66_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "­)Rá!fk\borCã±µÛg"))).length();
    local4_life23 = 8;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill66_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill66_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill66_42)).doFinal(((byte[])(__sourceSpill66_41)));
        java.lang.String __sourceSpill66_47 = ((java.lang.String)(com.moon.bk.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill66_48 = local0_life18;
        int __sourceSpill66_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill66_48)[__sourceSpill66_49] = __sourceSpill66_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    NORMAL = ((com.moon.bk)(new com.moon.bk((local0_life18)[5], 0, (local0_life18)[3])));
    PULSE = ((com.moon.bk)(new com.moon.bk((local0_life18)[4], 1, (local0_life18)[0])));
    DELAY = ((com.moon.bk)(new com.moon.bk((local0_life18)[1], 2, (local0_life18)[2])));
    b = ((com.moon.bk[])(com.moon.bk.a__Arraybk()));
}


public static com.moon.bk[] values() {
return ((com.moon.bk[])(((com.moon.bk[])(com.moon.bk.b)).clone()));
}


public static com.moon.bk valueOf(java.lang.String p0) {
return ((com.moon.bk)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bk.class)), ((java.lang.String)(p0)))));
}


public static void b(int p0) {
c = ((int)(p0));
    return;
}


public static int b() {
return com.moon.bk.c;
}


public static int c() {
int local0 = com.moon.bk.b();
    if ((local0 == 0)) {
        return 23;
    }
    return 0;
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
        byte[] spill81_0 = p0;
        life4_9 += 1;
        life5_44 = (spill81_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill81_1 = p0;
        life4_9 += 1;
        life5_76 = (spill81_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill81_2 = p0;
        life4_9 += 1;
        life5_91 = (spill81_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.a;
}


private static com.moon.bk[] a__Arraybk() {
return new com.moon.bk[] {com.moon.bk.NORMAL, com.moon.bk.PULSE, com.moon.bk.DELAY};
}

}
