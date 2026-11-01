package com.moon;


public class bc extends sourcebuild.EnumConstructor<com.moon.bc> implements com.moon.l8 {

public static com.moon.bc FOV;

public static com.moon.bc HEALTH;

public static com.moon.bc DISTANCE;

private java.lang.String a;

private com.moon.gf b;

private static com.moon.bc[] c;

private bc(java.lang.String p0, int p1, java.lang.String p2, com.moon.gf p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-8211983558771993279L)), ((long)(6340672040223398645L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249111565141252L))) ^ 68112629841023L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill58_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill58_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill58_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill58_11 = new byte[8];
    (__sourceSpill58_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill58_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation58_13 = __sourceSpill58_11;
    ((javax.crypto.Cipher)(__sourceSpill58_8)).init(((int)(__sourceSpill58_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill58_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation58_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "\036\035° «\006R°¥ñÓ¯<âk\bÂîDHGï§A\020ïÓ#N¶'yÁ0¶cÀ\020øF\035\bøá\025ö°³"))).length();
    int local4_life21 = 16;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill58_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill58_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill58_26)).doFinal(((byte[])(__sourceSpill58_25)));
        java.lang.String __sourceSpill58_31 = ((java.lang.String)(com.moon.bc.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill58_32 = local0_life16;
        int __sourceSpill58_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill58_32)[__sourceSpill58_33] = __sourceSpill58_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "¬ê#ÌXFt®Ý\004ÇÁmí\005\bs\026à\013F)=ç"))).length();
    local4_life21 = 16;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill58_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill58_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill58_40)).doFinal(((byte[])(__sourceSpill58_39)));
        java.lang.String __sourceSpill58_45 = ((java.lang.String)(com.moon.bc.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill58_46 = local0_life16;
        int __sourceSpill58_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill58_46)[__sourceSpill58_47] = __sourceSpill58_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    FOV = ((com.moon.bc)(new com.moon.bc((local0_life16)[5], 0, (local0_life16)[4], new com.moon.gh())));
    HEALTH = ((com.moon.bc)(new com.moon.bc((local0_life16)[3], 1, (local0_life16)[1], new com.moon.gi())));
    DISTANCE = ((com.moon.bc)(new com.moon.bc((local0_life16)[0], 2, (local0_life16)[2], new com.moon.gg())));
    c = ((com.moon.bc[])(com.moon.bc.a__Arraybc()));
}


public static com.moon.bc[] values() {
return ((com.moon.bc[])(((com.moon.bc[])(com.moon.bc.c)).clone()));
}


public static com.moon.bc valueOf(java.lang.String p0) {
return ((com.moon.bc)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bc.class)), ((java.lang.String)(p0)))));
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
        byte[] spill71_0 = p0;
        life4_9 += 1;
        life5_44 = (spill71_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill71_1 = p0;
        life4_9 += 1;
        life5_76 = (spill71_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill71_2 = p0;
        life4_9 += 1;
        life5_91 = (spill71_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bc[] a__Arraybc() {
return new com.moon.bc[] {com.moon.bc.FOV, com.moon.bc.HEALTH, com.moon.bc.DISTANCE};
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.gf a() {
return this.b;
}

}
