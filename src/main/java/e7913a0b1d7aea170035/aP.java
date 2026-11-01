package com.moon;


public class aP extends sourcebuild.EnumConstructor<com.moon.aP> {

public static com.moon.aP MICROSOFT;

public static com.moon.aP CRACKED;

private java.lang.Class<? extends com.moon.cx> a;

private com.moon.cu b;

private static com.moon.aP[] c;

private aP(java.lang.String p0, int p1, java.lang.Class<? extends com.moon.cx> p2, com.moon.cu p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-474241422762964480L)), ((long)(-1795828631568710972L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(59893053125199L))) ^ 39789539301682L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill9_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill9_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill9_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill9_11 = new byte[8];
    (__sourceSpill9_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill9_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation9_13 = __sourceSpill9_11;
    ((javax.crypto.Cipher)(__sourceSpill9_8)).init(((int)(__sourceSpill9_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill9_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation9_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[2];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "p3\034x\017[4,\020bØ¹¢â$®\033\\ð\000±\001\032Ã"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill9_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill9_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill9_26)).doFinal(((byte[])(__sourceSpill9_25)));
        java.lang.String __sourceSpill9_31 = ((java.lang.String)(com.moon.aP.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill9_32 = local0_life16;
        int __sourceSpill9_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill9_32)[__sourceSpill9_33] = __sourceSpill9_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    MICROSOFT = ((com.moon.aP)(new com.moon.aP((local0_life16)[1], 0, com.moon.cy.class, new com.moon.cw())));
    CRACKED = ((com.moon.aP)(new com.moon.aP((local0_life16)[0], 1, com.moon.cx.class, new com.moon.cv())));
    c = ((com.moon.aP[])(com.moon.aP.a__ArrayaP()));
}


public static com.moon.aP[] values() {
return ((com.moon.aP[])(((com.moon.aP[])(com.moon.aP.c)).clone()));
}


public static com.moon.aP valueOf(java.lang.String p0) {
return ((com.moon.aP)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.aP.class)), ((java.lang.String)(p0)))));
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
        byte[] spill23_0 = p0;
        life4_9 += 1;
        life5_44 = (spill23_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill23_1 = p0;
        life4_9 += 1;
        life5_76 = (spill23_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill23_2 = p0;
        life4_9 += 1;
        life5_91 = (spill23_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.aP[] a__ArrayaP() {
return new com.moon.aP[] {com.moon.aP.MICROSOFT, com.moon.aP.CRACKED};
}


public java.lang.Class<? extends com.moon.cx> a__Class() {
return this.a;
}


public com.moon.cu a() {
return this.b;
}

}
