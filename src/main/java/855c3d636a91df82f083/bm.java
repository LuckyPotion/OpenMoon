package com.moon;


public class bm extends sourcebuild.EnumConstructor<com.moon.bm> implements com.moon.l8, com.moon.kS<com.moon.module.impl.Disabler> {

public static com.moon.bm SENTINEL;

public static com.moon.bm TELEPORT;

public static com.moon.bm VULCAN;

public static com.moon.bm UNIVERSO_CRAFT;

public static com.moon.bm DEV;

java.lang.String a;

com.moon.e2<com.moon.module.impl.Disabler> b;

private static com.moon.bm[] c;

private bm(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.Disabler> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-7011707402171063091L)), ((long)(737494679756882088L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48349688117282L))) ^ 35663679964328L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill68_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill68_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill68_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill68_11 = new byte[8];
    (__sourceSpill68_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill68_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation68_13 = __sourceSpill68_11;
    ((javax.crypto.Cipher)(__sourceSpill68_8)).init(((int)(__sourceSpill68_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill68_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation68_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[10];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "Þx8\025YVüù88\013à\002­\bÀ£Cèl<\b=G3§ø\026D\020\002ª\001\177|¶»¤ÞJ¦\020éÍ\020\n~li\007÷YR\020¦ìÓ*z\023I\bÆÇÜëâKs¨\020ãô\016hèþÓó$GZNf2-\020³ñòm\000xrû\034¯è'Á"))).length();
    int local4_life21 = 16;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill68_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill68_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill68_26)).doFinal(((byte[])(__sourceSpill68_25)));
        java.lang.String __sourceSpill68_31 = ((java.lang.String)(com.moon.bm.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill68_32 = local0_life16;
        int __sourceSpill68_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill68_32)[__sourceSpill68_33] = __sourceSpill68_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "(yWÑÑ ÇÄÎ*@¶\020h\b%If\016?R5"))).length();
    local4_life21 = 16;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill68_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill68_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill68_40)).doFinal(((byte[])(__sourceSpill68_39)));
        java.lang.String __sourceSpill68_45 = ((java.lang.String)(com.moon.bm.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill68_46 = local0_life16;
        int __sourceSpill68_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill68_46)[__sourceSpill68_47] = __sourceSpill68_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    SENTINEL = ((com.moon.bm)(new com.moon.bm((local0_life16)[6], 0, (local0_life16)[4], new com.moon.fc())));
    TELEPORT = ((com.moon.bm)(new com.moon.bm((local0_life16)[3], 1, (local0_life16)[8], new com.moon.fd())));
    VULCAN = ((com.moon.bm)(new com.moon.bm((local0_life16)[9], 2, (local0_life16)[2], new com.moon.ff())));
    UNIVERSO_CRAFT = ((com.moon.bm)(new com.moon.bm((local0_life16)[7], 3, (local0_life16)[0], new com.moon.fe())));
    DEV = ((com.moon.bm)(new com.moon.bm((local0_life16)[5], 4, (local0_life16)[1], new com.moon.fb())));
    c = ((com.moon.bm[])(com.moon.bm.a__Arraybm()));
}


public static com.moon.bm[] values() {
return ((com.moon.bm[])(((com.moon.bm[])(com.moon.bm.c)).clone()));
}


public static com.moon.bm valueOf(java.lang.String p0) {
return ((com.moon.bm)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bm.class)), ((java.lang.String)(p0)))));
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
        byte[] spill83_0 = p0;
        life4_9 += 1;
        life5_44 = (spill83_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill83_1 = p0;
        life4_9 += 1;
        life5_76 = (spill83_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill83_2 = p0;
        life4_9 += 1;
        life5_91 = (spill83_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.bm[] a__Arraybm() {
return new com.moon.bm[] {com.moon.bm.SENTINEL, com.moon.bm.TELEPORT, com.moon.bm.VULCAN, com.moon.bm.UNIVERSO_CRAFT, com.moon.bm.DEV};
}


public com.moon.e2<com.moon.module.impl.Disabler> a() {
return this.b;
}


public java.lang.String a__String() {
return this.a;
}

}
