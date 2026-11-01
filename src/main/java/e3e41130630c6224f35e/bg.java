package com.moon;


public class bg extends sourcebuild.EnumConstructor<com.moon.bg> implements com.moon.l8 {

public static com.moon.bg HURT_TIME;

public static com.moon.bg PAST_ATTACK;

private java.lang.String a;

private static com.moon.bg[] b;

private static boolean c;

private bg(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(4068645039756509360L)), ((long)(4463029717060218548L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145089413479911L))) ^ 103600551511058L);
    if (com.moon.bg.b()) {
        com.moon.bg.b(((boolean)(true)));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill62_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill62_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill62_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill62_13 = new byte[8];
    (__sourceSpill62_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill62_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation62_15 = __sourceSpill62_13;
    ((javax.crypto.Cipher)(__sourceSpill62_10)).init(((int)(__sourceSpill62_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill62_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation62_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[4];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "\f6W!_ñ>/\031ð0Il\020[%\nß8j:Ú¬\021%Uâ"))).length();
    int local4_life23 = 16;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill62_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill62_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill62_28)).doFinal(((byte[])(__sourceSpill62_27)));
        java.lang.String __sourceSpill62_33 = ((java.lang.String)(com.moon.bg.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill62_34 = local0_life18;
        int __sourceSpill62_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill62_34)[__sourceSpill62_35] = __sourceSpill62_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    local7_life22 = ((java.lang.String)((local5_life20 = "}ÚÊ\024Ûy³@´~øÑ®Å´®\020½¹ Yå\013Î¢t\002ôc®K"))).length();
    local4_life23 = 16;
    local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill62_41 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill62_42 = local1_life8;
        byte[] local8_life44 = ((javax.crypto.Cipher)(__sourceSpill62_42)).doFinal(((byte[])(__sourceSpill62_41)));
        java.lang.String __sourceSpill62_47 = ((java.lang.String)(com.moon.bg.a(((byte[])(local8_life44))))).intern();
        java.lang.String[] __sourceSpill62_48 = local0_life18;
        int __sourceSpill62_49 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill62_48)[__sourceSpill62_49] = __sourceSpill62_47;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    HURT_TIME = ((com.moon.bg)(new com.moon.bg((local0_life18)[2], 0, (local0_life18)[3])));
    PAST_ATTACK = ((com.moon.bg)(new com.moon.bg((local0_life18)[1], 1, (local0_life18)[0])));
    b = ((com.moon.bg[])(com.moon.bg.a__Arraybg()));
}


public static com.moon.bg[] values() {
return ((com.moon.bg[])(((com.moon.bg[])(com.moon.bg.b)).clone()));
}


public static com.moon.bg valueOf(java.lang.String p0) {
return ((com.moon.bg)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bg.class)), ((java.lang.String)(p0)))));
}


public static void b(boolean p0) {
c = ((boolean)(p0));
    return;
}


public static boolean b() {
return ((((com.moon.bg.c) ? 1 : 0)) != 0);
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.bg.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
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
        byte[] spill77_0 = p0;
        life4_9 += 1;
        life5_44 = (spill77_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill77_1 = p0;
        life4_9 += 1;
        life5_76 = (spill77_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill77_2 = p0;
        life4_9 += 1;
        life5_91 = (spill77_2)[life4_9];
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


private static com.moon.bg[] a__Arraybg() {
return new com.moon.bg[] {com.moon.bg.HURT_TIME, com.moon.bg.PAST_ATTACK};
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
