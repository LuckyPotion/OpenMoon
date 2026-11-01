package com.moon;


public class a3 extends sourcebuild.EnumConstructor<com.moon.a3> {

public static com.moon.a3 FRAGMENT;

public static com.moon.a3 VERTEX;

private static com.moon.a3[] a;

private static java.lang.String b;

private a3(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-8554258081275052516L)), ((long)(4911943847992891693L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(259890761661207L))) ^ 115375036705360L);
    if ((com.moon.a3.b() == null)) {
        com.moon.a3.b(((java.lang.String)("p8AKvc")));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill3_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill3_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill3_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill3_13 = new byte[8];
    (__sourceSpill3_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill3_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation3_15 = __sourceSpill3_13;
    ((javax.crypto.Cipher)(__sourceSpill3_10)).init(((int)(__sourceSpill3_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill3_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation3_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[2];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "Ø\006êi\020¿\035bÜ:Ð½âN5?\033\1777þ"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill3_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill3_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill3_28)).doFinal(((byte[])(__sourceSpill3_27)));
        java.lang.String __sourceSpill3_33 = ((java.lang.String)(com.moon.a3.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill3_34 = local0_life18;
        int __sourceSpill3_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill3_34)[__sourceSpill3_35] = __sourceSpill3_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    FRAGMENT = ((com.moon.a3)(new com.moon.a3((local0_life18)[1], 0)));
    VERTEX = ((com.moon.a3)(new com.moon.a3((local0_life18)[0], 1)));
    a = ((com.moon.a3[])(com.moon.a3.a()));
}


public static com.moon.a3[] values() {
return ((com.moon.a3[])(((com.moon.a3[])(com.moon.a3.a)).clone()));
}


public static com.moon.a3 valueOf(java.lang.String p0) {
return ((com.moon.a3)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.a3.class)), ((java.lang.String)(p0)))));
}


public static java.lang.String b() {
return com.moon.a3.b;
}


public static void b(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
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
        byte[] spill6_0 = p0;
        life4_9 += 1;
        life5_44 = (spill6_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill6_1 = p0;
        life4_9 += 1;
        life5_76 = (spill6_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill6_2 = p0;
        life4_9 += 1;
        life5_91 = (spill6_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.a3[] a() {
return new com.moon.a3[] {com.moon.a3.FRAGMENT, com.moon.a3.VERTEX};
}

}
