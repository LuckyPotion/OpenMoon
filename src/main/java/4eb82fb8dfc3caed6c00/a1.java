package com.moon;


public class a1 extends sourcebuild.EnumConstructor<com.moon.a1> {

public static com.moon.a1 PRE;

public static com.moon.a1 POST;

private static com.moon.a1[] a;

private a1(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(8981062298135060009L)), ((long)(6307122578019920840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173533366575341L))) ^ 97592736015818L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill1_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill1_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1_11 = new byte[8];
    (__sourceSpill1_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill1_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation1_13 = __sourceSpill1_11;
    ((javax.crypto.Cipher)(__sourceSpill1_8)).init(((int)(__sourceSpill1_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[2];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "_H\005¯@Î\bt² m¦"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill1_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill1_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill1_26)).doFinal(((byte[])(__sourceSpill1_25)));
        java.lang.String __sourceSpill1_31 = ((java.lang.String)(com.moon.a1.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill1_32 = local0_life16;
        int __sourceSpill1_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill1_32)[__sourceSpill1_33] = __sourceSpill1_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    PRE = ((com.moon.a1)(new com.moon.a1((local0_life16)[1], 0)));
    POST = ((com.moon.a1)(new com.moon.a1((local0_life16)[0], 1)));
    a = ((com.moon.a1[])(com.moon.a1.a()));
}


public static com.moon.a1[] values() {
return ((com.moon.a1[])(((com.moon.a1[])(com.moon.a1.a)).clone()));
}


public static com.moon.a1 valueOf(java.lang.String p0) {
return ((com.moon.a1)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.a1.class)), ((java.lang.String)(p0)))));
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
        byte[] spill4_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.a1[] a() {
return new com.moon.a1[] {com.moon.a1.PRE, com.moon.a1.POST};
}

}
