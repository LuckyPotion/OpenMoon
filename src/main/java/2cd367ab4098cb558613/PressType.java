package com.moon.module;

/** Unaccepted same-owner source composition; fixed enum lowering required. */

public final class PressType extends sourcebuild.EnumConstructor<com.moon.module.PressType> {

public static com.moon.module.PressType PRESS;

public static com.moon.module.PressType HOLD;

private static com.moon.module.PressType[] a;

private PressType(java.lang.String p0, int p1) {
    super(p0, p1);

}

private static void initialize() throws Throwable {
    long local9_life4 = ((moom._c.a(-4129356841489002275L, -5694197064769127171L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(246979949144994L) ^ 92894457069002L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill253_8 = (local1_life6 = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding"));
    int __sourceSpill253_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill253_10 = javax.crypto.SecretKeyFactory.getInstance("DES");
    byte[] __sourceSpill253_11 = new byte[8];
    (__sourceSpill253_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill253_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation253_13 = __sourceSpill253_11;
    (__sourceSpill253_8).init(__sourceSpill253_9, (__sourceSpill253_10).generateSecret(new javax.crypto.spec.DESKeySpec(__sourcePreallocation253_13)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    java.lang.String[] local0_life16 = new java.lang.String[2];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((local5_life18 = "hLÞNE\020#\bOÅàzíþ;")).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill253_25 = ((local5_life18).substring(local3_life22, (local3_life22 + local4_life21))).getBytes("ISO-8859-1");
        javax.crypto.Cipher __sourceSpill253_26 = local1_life6;
        byte[] local8_life28 = (__sourceSpill253_26).doFinal(__sourceSpill253_25);
        java.lang.String __sourceSpill253_31 = (com.moon.module.PressType.a(local8_life28)).intern();
        java.lang.String[] __sourceSpill253_32 = local0_life16;
        int __sourceSpill253_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill253_32)[__sourceSpill253_33] = __sourceSpill253_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = (local5_life18).charAt(local3_life22);
    }
    com.moon.module.PressType.PRESS = new com.moon.module.PressType((local0_life16)[1], 0);
    com.moon.module.PressType.HOLD = new com.moon.module.PressType((local0_life16)[0], 1);
    com.moon.module.PressType.a = com.moon.module.PressType.a();
    return;
}

public static com.moon.module.PressType[] values() {
    return ((com.moon.module.PressType[])(Object)((com.moon.module.PressType.a).clone()));
}

public static com.moon.module.PressType valueOf(java.lang.String p0) {
    return ((com.moon.module.PressType)(Object)(java.lang.Enum.valueOf((java.lang.Class)(com.moon.module.PressType.class), p0)));
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
        byte[] spill1008_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1008_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1008_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1008_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1008_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1008_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}

private static com.moon.module.PressType[] a() {
    return new com.moon.module.PressType[] {com.moon.module.PressType.PRESS, com.moon.module.PressType.HOLD};
}

}
