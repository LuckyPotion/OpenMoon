package com.moon;


public class bf extends sourcebuild.EnumConstructor<com.moon.bf> implements com.moon.l8, com.moon.kS<com.moon.module.impl.Velocity> {

public static com.moon.bf NORMAL;

public static com.moon.bf DELAYED;

public static com.moon.bf JUMP;

public static com.moon.bf GRIM;

public static com.moon.bf WATCHDOG;

java.lang.String a;

com.moon.e2<com.moon.module.impl.Velocity> b;

private static com.moon.bf[] c;

private bf(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.Velocity> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(5290621310956880721L)), ((long)(-5682610229707074556L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(166608211262593L))) ^ 8409057528692L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill61_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill61_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill61_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill61_11 = new byte[8];
    (__sourceSpill61_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill61_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation61_13 = __sourceSpill61_11;
    ((javax.crypto.Cipher)(__sourceSpill61_8)).init(((int)(__sourceSpill61_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill61_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation61_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[10];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "qÎnD\026\006u\b'w wj¯\b;¨~|ñf+½\020²ÑúOp\030Ø\021h¡³|³\027­\020eaÙSOqê8^íÖÙU=Å\020!¥iPâ}ÜÀ.dºGGÈ\bÆOz¨\027T4\bÛ¯Ír\0271\004u"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill61_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill61_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill61_26)).doFinal(((byte[])(__sourceSpill61_25)));
        java.lang.String __sourceSpill61_31 = ((java.lang.String)(com.moon.bf.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill61_32 = local0_life16;
        int __sourceSpill61_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill61_32)[__sourceSpill61_33] = __sourceSpill61_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "ÎÏÿ\021/Ú\bM7U¿?IÊé"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill61_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill61_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill61_40)).doFinal(((byte[])(__sourceSpill61_39)));
        java.lang.String __sourceSpill61_45 = ((java.lang.String)(com.moon.bf.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill61_46 = local0_life16;
        int __sourceSpill61_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill61_46)[__sourceSpill61_47] = __sourceSpill61_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    NORMAL = ((com.moon.bf)(new com.moon.bf((local0_life16)[2], 0, (local0_life16)[1], new com.moon.e8())));
    DELAYED = ((com.moon.bf)(new com.moon.bf((local0_life16)[0], 1, (local0_life16)[6], new com.moon.e5())));
    JUMP = ((com.moon.bf)(new com.moon.bf((local0_life16)[7], 2, (local0_life16)[9], new com.moon.e7())));
    GRIM = ((com.moon.bf)(new com.moon.bf((local0_life16)[8], 3, (local0_life16)[3], new com.moon.e6())));
    WATCHDOG = ((com.moon.bf)(new com.moon.bf((local0_life16)[5], 4, (local0_life16)[4], new com.moon.e9())));
    c = ((com.moon.bf[])(com.moon.bf.a__Arraybf()));
}


public static com.moon.bf[] values() {
return ((com.moon.bf[])(((com.moon.bf[])(com.moon.bf.c)).clone()));
}


public static com.moon.bf valueOf(java.lang.String p0) {
return ((com.moon.bf)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bf.class)), ((java.lang.String)(p0)))));
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
        byte[] spill76_0 = p0;
        life4_9 += 1;
        life5_44 = (spill76_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill76_1 = p0;
        life4_9 += 1;
        life5_76 = (spill76_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill76_2 = p0;
        life4_9 += 1;
        life5_91 = (spill76_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bf[] a__Arraybf() {
return new com.moon.bf[] {com.moon.bf.NORMAL, com.moon.bf.DELAYED, com.moon.bf.JUMP, com.moon.bf.GRIM, com.moon.bf.WATCHDOG};
}


public com.moon.e2<com.moon.module.impl.Velocity> a() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}

}
