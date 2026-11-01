package com.moon;


public class b6 extends sourcebuild.EnumConstructor<com.moon.b6> implements com.moon.l8 {

public static com.moon.b6 PLAYER;

public static com.moon.b6 ANIMAL;

public static com.moon.b6 MOB;

public static com.moon.b6 INVISIBLE;

private java.lang.String a;

private static com.moon.b6[] b;

private b6(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-1687174872323056128L)), ((long)(4242672752840475764L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(105849893658646L))) ^ 16271631696085L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill28_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill28_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill28_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill28_11 = new byte[8];
    (__sourceSpill28_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill28_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation28_13 = __sourceSpill28_11;
    ((javax.crypto.Cipher)(__sourceSpill28_8)).init(((int)(__sourceSpill28_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill28_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation28_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[8];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "È=%(GæU\032\bö3O{l*\b#O\026ð\024ûòÑ\b\037S\023p©'~\bKÅ\016(hö\020µ®ÛÓXw²J#.´FYÎ"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill28_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill28_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill28_26)).doFinal(((byte[])(__sourceSpill28_25)));
        java.lang.String __sourceSpill28_31 = ((java.lang.String)(com.moon.b6.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill28_32 = local0_life16;
        int __sourceSpill28_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill28_32)[__sourceSpill28_33] = __sourceSpill28_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "N1ë3a\004,O»S¿µÔàG:\bI½¬N\001[`ü"))).length();
    local4_life21 = 16;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill28_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill28_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill28_40)).doFinal(((byte[])(__sourceSpill28_39)));
        java.lang.String __sourceSpill28_45 = ((java.lang.String)(com.moon.b6.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill28_46 = local0_life16;
        int __sourceSpill28_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill28_46)[__sourceSpill28_47] = __sourceSpill28_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    PLAYER = ((com.moon.b6)(new com.moon.b6((local0_life16)[2], 0, (local0_life16)[7])));
    ANIMAL = ((com.moon.b6)(new com.moon.b6((local0_life16)[3], 1, (local0_life16)[1])));
    MOB = ((com.moon.b6)(new com.moon.b6((local0_life16)[4], 2, (local0_life16)[0])));
    INVISIBLE = ((com.moon.b6)(new com.moon.b6((local0_life16)[5], 3, (local0_life16)[6])));
    b = ((com.moon.b6[])(com.moon.b6.a__Arrayb6()));
}


public static com.moon.b6[] values() {
return ((com.moon.b6[])(((com.moon.b6[])(com.moon.b6.b)).clone()));
}


public static com.moon.b6 valueOf(java.lang.String p0) {
return ((com.moon.b6)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.b6.class)), ((java.lang.String)(p0)))));
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
        byte[] spill36_0 = p0;
        life4_9 += 1;
        life5_44 = (spill36_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill36_1 = p0;
        life4_9 += 1;
        life5_76 = (spill36_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill36_2 = p0;
        life4_9 += 1;
        life5_91 = (spill36_2)[life4_9];
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


private static com.moon.b6[] a__Arrayb6() {
return new com.moon.b6[] {com.moon.b6.PLAYER, com.moon.b6.ANIMAL, com.moon.b6.MOB, com.moon.b6.INVISIBLE};
}

}
