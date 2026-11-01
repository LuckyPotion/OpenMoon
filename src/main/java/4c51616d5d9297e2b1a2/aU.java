package com.moon;


public class aU extends sourcebuild.EnumConstructor<com.moon.aU> {

public static com.moon.aU ADD;

public static com.moon.aU REMOVE;

public static com.moon.aU CLEAR;

public static com.moon.aU LIST;

private static com.moon.aU[] a;

private aU(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(4583887146391530652L)), ((long)(-5536195618746257992L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48100497680084L))) ^ 98178449808595L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill15_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill15_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill15_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill15_11 = new byte[8];
    (__sourceSpill15_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill15_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation15_13 = __sourceSpill15_11;
    ((javax.crypto.Cipher)(__sourceSpill15_8)).init(((int)(__sourceSpill15_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill15_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation15_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[4];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "N°÷\000N\025+\b%\0051Ò#(D"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill15_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill15_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill15_26)).doFinal(((byte[])(__sourceSpill15_25)));
        java.lang.String __sourceSpill15_31 = ((java.lang.String)(com.moon.aU.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill15_32 = local0_life16;
        int __sourceSpill15_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill15_32)[__sourceSpill15_33] = __sourceSpill15_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "Í-×½Ç 3%\b¨+êÇê="))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill15_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill15_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill15_40)).doFinal(((byte[])(__sourceSpill15_39)));
        java.lang.String __sourceSpill15_45 = ((java.lang.String)(com.moon.aU.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill15_46 = local0_life16;
        int __sourceSpill15_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill15_46)[__sourceSpill15_47] = __sourceSpill15_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    ADD = ((com.moon.aU)(new com.moon.aU((local0_life16)[1], 0)));
    REMOVE = ((com.moon.aU)(new com.moon.aU((local0_life16)[2], 1)));
    CLEAR = ((com.moon.aU)(new com.moon.aU((local0_life16)[3], 2)));
    LIST = ((com.moon.aU)(new com.moon.aU((local0_life16)[0], 3)));
    a = ((com.moon.aU[])(com.moon.aU.a()));
}


public static com.moon.aU[] values() {
return ((com.moon.aU[])(((com.moon.aU[])(com.moon.aU.a)).clone()));
}


public static com.moon.aU valueOf(java.lang.String p0) {
return ((com.moon.aU)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.aU.class)), ((java.lang.String)(p0)))));
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
        byte[] spill26_0 = p0;
        life4_9 += 1;
        life5_44 = (spill26_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill26_1 = p0;
        life4_9 += 1;
        life5_76 = (spill26_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill26_2 = p0;
        life4_9 += 1;
        life5_91 = (spill26_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.aU[] a() {
return new com.moon.aU[] {com.moon.aU.ADD, com.moon.aU.REMOVE, com.moon.aU.CLEAR, com.moon.aU.LIST};
}

}
