package com.moon;


public class bU extends sourcebuild.EnumConstructor<com.moon.bU> implements com.moon.l8 {

public static com.moon.bU BLOCK;

public static com.moon.bU SNEAK;

public static com.moon.bU LOW_HP;

private java.lang.String a;

private static com.moon.bU[] b;

private bU(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-901672461077835592L)), ((long)(5753083717558160685L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91643565863382L))) ^ 100230126769637L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill50_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill50_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill50_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill50_11 = new byte[8];
    (__sourceSpill50_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill50_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation50_13 = __sourceSpill50_11;
    ((javax.crypto.Cipher)(__sourceSpill50_8)).init(((int)(__sourceSpill50_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill50_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation50_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "O }åÌº\bx\1776ÀÆë@\023\b\023CÙ\033ë\t\b×5#QêVUe"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill50_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill50_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill50_26)).doFinal(((byte[])(__sourceSpill50_25)));
        java.lang.String __sourceSpill50_31 = ((java.lang.String)(com.moon.bU.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill50_32 = local0_life16;
        int __sourceSpill50_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill50_32)[__sourceSpill50_33] = __sourceSpill50_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "íê²\034ó/+ë\bª1\023å¶ºIi"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill50_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill50_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill50_40)).doFinal(((byte[])(__sourceSpill50_39)));
        java.lang.String __sourceSpill50_45 = ((java.lang.String)(com.moon.bU.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill50_46 = local0_life16;
        int __sourceSpill50_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill50_46)[__sourceSpill50_47] = __sourceSpill50_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    BLOCK = ((com.moon.bU)(new com.moon.bU((local0_life16)[1], 0, (local0_life16)[0])));
    SNEAK = ((com.moon.bU)(new com.moon.bU((local0_life16)[3], 1, (local0_life16)[4])));
    LOW_HP = ((com.moon.bU)(new com.moon.bU((local0_life16)[2], 2, (local0_life16)[5])));
    b = ((com.moon.bU[])(com.moon.bU.a__ArraybU()));
}


public static com.moon.bU[] values() {
return ((com.moon.bU[])(((com.moon.bU[])(com.moon.bU.b)).clone()));
}


public static com.moon.bU valueOf(java.lang.String p0) {
return ((com.moon.bU)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bU.class)), ((java.lang.String)(p0)))));
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
        byte[] spill63_0 = p0;
        life4_9 += 1;
        life5_44 = (spill63_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill63_1 = p0;
        life4_9 += 1;
        life5_76 = (spill63_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill63_2 = p0;
        life4_9 += 1;
        life5_91 = (spill63_2)[life4_9];
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


private static com.moon.bU[] a__ArraybU() {
return new com.moon.bU[] {com.moon.bU.BLOCK, com.moon.bU.SNEAK, com.moon.bU.LOW_HP};
}

}
