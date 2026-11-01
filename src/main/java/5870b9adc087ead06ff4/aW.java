package com.moon;


public class aW extends sourcebuild.EnumConstructor<com.moon.aW> {

public static com.moon.aW ADD;

public static com.moon.aW REMOVE;

public static com.moon.aW CLEAR;

public static com.moon.aW LIST;

private static com.moon.aW[] a;

private static int b;

private aW(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(7834636745820521837L)), ((long)(-8571513649091314795L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272166040381349L))) ^ 139826204218544L);
    if ((com.moon.aW.b() != 0)) {
        com.moon.aW.b(((int)(32)));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill17_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill17_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill17_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill17_13 = new byte[8];
    (__sourceSpill17_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill17_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation17_15 = __sourceSpill17_13;
    ((javax.crypto.Cipher)(__sourceSpill17_10)).init(((int)(__sourceSpill17_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill17_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation17_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[4];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "ÿcw\000Ü\n÷Ç\b\\)$F¤{xV"))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill17_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill17_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill17_28)).doFinal(((byte[])(__sourceSpill17_27)));
        java.lang.String __sourceSpill17_33 = ((java.lang.String)(com.moon.aW.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill17_34 = local0_life18;
        int __sourceSpill17_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill17_34)[__sourceSpill17_35] = __sourceSpill17_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "\034QmÖ¥-â\b^¸6rÀ\023\fc"))).length();
    local4_life23 = 8;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill17_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill17_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill17_42)).doFinal(((byte[])(__sourceSpill17_41)));
        java.lang.String __sourceSpill17_47 = ((java.lang.String)(com.moon.aW.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill17_48 = local0_life18;
        int __sourceSpill17_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill17_48)[__sourceSpill17_49] = __sourceSpill17_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    ADD = ((com.moon.aW)(new com.moon.aW((local0_life18)[0], 0)));
    REMOVE = ((com.moon.aW)(new com.moon.aW((local0_life18)[1], 1)));
    CLEAR = ((com.moon.aW)(new com.moon.aW((local0_life18)[3], 2)));
    LIST = ((com.moon.aW)(new com.moon.aW((local0_life18)[2], 3)));
    a = ((com.moon.aW[])(com.moon.aW.a()));
}


public static com.moon.aW[] values() {
return ((com.moon.aW[])(((com.moon.aW[])(com.moon.aW.a)).clone()));
}


public static com.moon.aW valueOf(java.lang.String p0) {
return ((com.moon.aW)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.aW.class)), ((java.lang.String)(p0)))));
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static int b() {
return com.moon.aW.b;
}


public static int c() {
int local0 = com.moon.aW.b();
    if ((local0 == 0)) {
        return 20;
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
        byte[] spill28_0 = p0;
        life4_9 += 1;
        life5_44 = (spill28_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill28_1 = p0;
        life4_9 += 1;
        life5_76 = (spill28_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill28_2 = p0;
        life4_9 += 1;
        life5_91 = (spill28_2)[life4_9];
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


private static com.moon.aW[] a() {
return new com.moon.aW[] {com.moon.aW.ADD, com.moon.aW.REMOVE, com.moon.aW.CLEAR, com.moon.aW.LIST};
}

}
