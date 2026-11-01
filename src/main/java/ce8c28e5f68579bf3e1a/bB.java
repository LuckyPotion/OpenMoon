package com.moon;


public class bB extends sourcebuild.EnumConstructor<com.moon.bB> implements com.moon.l8 {

public static com.moon.bB NONE;

public static com.moon.bB OPEN;

public static com.moon.bB SPOOF;

private java.lang.String a;

private static com.moon.bB[] b;

private bB(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(2232876448692986084L)), ((long)(-2415339263563248036L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(218042956459164L))) ^ 15527588574648L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill33_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill33_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill33_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill33_11 = new byte[8];
    (__sourceSpill33_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill33_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation33_13 = __sourceSpill33_11;
    ((javax.crypto.Cipher)(__sourceSpill33_8)).init(((int)(__sourceSpill33_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill33_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation33_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "ÝãZñþ\013/\bnÐÿ\021Xæk\b\024Qø\021&\r\020\n\007h\033Þ¼ë¶&aKÍÔì"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill33_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill33_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill33_26)).doFinal(((byte[])(__sourceSpill33_25)));
        java.lang.String __sourceSpill33_31 = ((java.lang.String)(com.moon.bB.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill33_32 = local0_life16;
        int __sourceSpill33_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill33_32)[__sourceSpill33_33] = __sourceSpill33_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "µ¼o \001{é\brêHÚ["))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill33_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill33_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill33_40)).doFinal(((byte[])(__sourceSpill33_39)));
        java.lang.String __sourceSpill33_45 = ((java.lang.String)(com.moon.bB.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill33_46 = local0_life16;
        int __sourceSpill33_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill33_46)[__sourceSpill33_47] = __sourceSpill33_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    NONE = ((com.moon.bB)(new com.moon.bB((local0_life16)[5], 0, (local0_life16)[0])));
    OPEN = ((com.moon.bB)(new com.moon.bB((local0_life16)[2], 1, (local0_life16)[3])));
    SPOOF = ((com.moon.bB)(new com.moon.bB((local0_life16)[4], 2, (local0_life16)[1])));
    b = ((com.moon.bB[])(com.moon.bB.a__ArraybB()));
}


public static com.moon.bB[] values() {
return ((com.moon.bB[])(((com.moon.bB[])(com.moon.bB.b)).clone()));
}


public static com.moon.bB valueOf(java.lang.String p0) {
return ((com.moon.bB)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bB.class)), ((java.lang.String)(p0)))));
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
        byte[] spill42_0 = p0;
        life4_9 += 1;
        life5_44 = (spill42_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill42_1 = p0;
        life4_9 += 1;
        life5_76 = (spill42_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill42_2 = p0;
        life4_9 += 1;
        life5_91 = (spill42_2)[life4_9];
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


private static com.moon.bB[] a__ArraybB() {
return new com.moon.bB[] {com.moon.bB.NONE, com.moon.bB.OPEN, com.moon.bB.SPOOF};
}

}
