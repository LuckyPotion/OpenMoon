package com.moon;


public class bh extends sourcebuild.EnumConstructor<com.moon.bh> implements com.moon.l8, com.moon.kS<com.moon.module.impl.WTap> {

public static com.moon.bh BLATANT;

public static com.moon.bh LEGIT;

private java.lang.String a;

private com.moon.e2<com.moon.module.impl.WTap> b;

private static com.moon.bh[] c;

private bh(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.WTap> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-6908448914516192300L)), ((long)(-2771680985297346967L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(181650127356919L))) ^ 108720790502033L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill63_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill63_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill63_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill63_11 = new byte[8];
    (__sourceSpill63_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill63_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation63_13 = __sourceSpill63_11;
    ((javax.crypto.Cipher)(__sourceSpill63_8)).init(((int)(__sourceSpill63_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill63_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation63_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[4];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "@\027\004\024W/6\bÉ·!h^M8+"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill63_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill63_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill63_26)).doFinal(((byte[])(__sourceSpill63_25)));
        java.lang.String __sourceSpill63_31 = ((java.lang.String)(com.moon.bh.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill63_32 = local0_life16;
        int __sourceSpill63_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill63_32)[__sourceSpill63_33] = __sourceSpill63_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "ë¢í°2`ÖW\b.âÔ­· \025¸"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill63_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill63_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill63_40)).doFinal(((byte[])(__sourceSpill63_39)));
        java.lang.String __sourceSpill63_45 = ((java.lang.String)(com.moon.bh.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill63_46 = local0_life16;
        int __sourceSpill63_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill63_46)[__sourceSpill63_47] = __sourceSpill63_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    BLATANT = ((com.moon.bh)(new com.moon.bh((local0_life16)[2], 0, (local0_life16)[1], new com.moon.e_())));
    LEGIT = ((com.moon.bh)(new com.moon.bh((local0_life16)[3], 1, (local0_life16)[0], new com.moon.fa())));
    c = ((com.moon.bh[])(com.moon.bh.a__Arraybh()));
}


public static com.moon.bh[] values() {
return ((com.moon.bh[])(((com.moon.bh[])(com.moon.bh.c)).clone()));
}


public static com.moon.bh valueOf(java.lang.String p0) {
return ((com.moon.bh)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bh.class)), ((java.lang.String)(p0)))));
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
        byte[] spill78_0 = p0;
        life4_9 += 1;
        life5_44 = (spill78_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill78_1 = p0;
        life4_9 += 1;
        life5_76 = (spill78_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill78_2 = p0;
        life4_9 += 1;
        life5_91 = (spill78_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bh[] a__Arraybh() {
return new com.moon.bh[] {com.moon.bh.BLATANT, com.moon.bh.LEGIT};
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.e2<com.moon.module.impl.WTap> a() {
return this.b;
}

}
