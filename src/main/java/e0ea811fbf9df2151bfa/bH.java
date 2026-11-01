package com.moon;


public class bH extends sourcebuild.EnumConstructor<com.moon.bH> implements com.moon.l8 {

public static com.moon.bH EDGE;

public static com.moon.bH DISTANCE;

public static com.moon.bH DELAY;

private java.lang.String a;

private static com.moon.bH[] b;

private static com.moon.bH[] c;

private bH(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-6095467429244925900L)), ((long)(767307095956928589L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131591898695688L))) ^ 30620045119544L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill39_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill39_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill39_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill39_11 = new byte[8];
    (__sourceSpill39_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill39_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation39_13 = __sourceSpill39_11;
    ((javax.crypto.Cipher)(__sourceSpill39_8)).init(((int)(__sourceSpill39_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill39_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation39_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "F¾+\007ì8\020[Î%£\\\007×m\025i\rÈÅeÄ\030\013\006É\020ã²¶°©!s\005ÝÎÖWëZVA·\b ÷¸Øôr"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill39_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill39_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill39_26)).doFinal(((byte[])(__sourceSpill39_25)));
        java.lang.String __sourceSpill39_31 = ((java.lang.String)(com.moon.bH.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill39_32 = local0_life16;
        int __sourceSpill39_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill39_32)[__sourceSpill39_33] = __sourceSpill39_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = ":c\\9¯\031\b1³ÞPDÀ¢\035"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill39_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill39_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill39_40)).doFinal(((byte[])(__sourceSpill39_39)));
        java.lang.String __sourceSpill39_45 = ((java.lang.String)(com.moon.bH.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill39_46 = local0_life16;
        int __sourceSpill39_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill39_46)[__sourceSpill39_47] = __sourceSpill39_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    EDGE = ((com.moon.bH)(new com.moon.bH((local0_life16)[3], 0, (local0_life16)[0])));
    DISTANCE = ((com.moon.bH)(new com.moon.bH((local0_life16)[1], 1, (local0_life16)[2])));
    DELAY = ((com.moon.bH)(new com.moon.bH((local0_life16)[4], 2, (local0_life16)[5])));
    c = ((com.moon.bH[])(com.moon.bH.a__ArraybH()));
    b = ((com.moon.bH[])(com.moon.bH.values()));
}


public static com.moon.bH[] values() {
return ((com.moon.bH[])(((com.moon.bH[])(com.moon.bH.c)).clone()));
}


public static com.moon.bH valueOf(java.lang.String p0) {
return ((com.moon.bH)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bH.class)), ((java.lang.String)(p0)))));
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
        byte[] spill48_0 = p0;
        life4_9 += 1;
        life5_44 = (spill48_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill48_1 = p0;
        life4_9 += 1;
        life5_76 = (spill48_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill48_2 = p0;
        life4_9 += 1;
        life5_91 = (spill48_2)[life4_9];
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


private static com.moon.bH[] a__ArraybH() {
return new com.moon.bH[] {com.moon.bH.EDGE, com.moon.bH.DISTANCE, com.moon.bH.DELAY};
}

}
