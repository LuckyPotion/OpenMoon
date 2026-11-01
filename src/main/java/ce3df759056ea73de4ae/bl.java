package com.moon;


public class bl extends sourcebuild.EnumConstructor<com.moon.bl> implements com.moon.l8 {

public static com.moon.bl ATTACK_DAMAGE;

public static com.moon.bl RIGHT_CLICK;

public static com.moon.bl DIGGING;

public static com.moon.bl EXIT_TARGET_RANGE;

private java.lang.String a;

private static com.moon.bl[] b;

private bl(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(347193646672642341L)), ((long)(-5029951452503859232L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(231528502000998L))) ^ 36710255607334L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill67_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill67_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill67_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill67_11 = new byte[8];
    (__sourceSpill67_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill67_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation67_13 = __sourceSpill67_11;
    ((javax.crypto.Cipher)(__sourceSpill67_8)).init(((int)(__sourceSpill67_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill67_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation67_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[8];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "6EÑ¡\016\033-\003]&z\"ðö9\b­VÔ¢\004\003O\020ß9+\007áôÄíÿ¼¤áÛ»\020Ç#½\"bM\020_\013Y0ý¹C \020ÃKD\nè>r9¿©wÏ÷¼\002\030å³î\032 âq\031é)#\\E#¤È'"))).length();
    int local4_life21 = 16;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill67_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill67_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill67_26)).doFinal(((byte[])(__sourceSpill67_25)));
        java.lang.String __sourceSpill67_31 = ((java.lang.String)(com.moon.bl.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill67_32 = local0_life16;
        int __sourceSpill67_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill67_32)[__sourceSpill67_33] = __sourceSpill67_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "³Ô\tÉ¼]ÔÞ\031\007\0371\030qûÿ=lÜ%\001\b,$°Ç²åôA"))).length();
    local4_life21 = 24;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill67_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill67_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill67_40)).doFinal(((byte[])(__sourceSpill67_39)));
        java.lang.String __sourceSpill67_45 = ((java.lang.String)(com.moon.bl.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill67_46 = local0_life16;
        int __sourceSpill67_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill67_46)[__sourceSpill67_47] = __sourceSpill67_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    ATTACK_DAMAGE = ((com.moon.bl)(new com.moon.bl((local0_life16)[3], 0, (local0_life16)[2])));
    RIGHT_CLICK = ((com.moon.bl)(new com.moon.bl((local0_life16)[0], 1, (local0_life16)[4])));
    DIGGING = ((com.moon.bl)(new com.moon.bl((local0_life16)[7], 2, (local0_life16)[1])));
    EXIT_TARGET_RANGE = ((com.moon.bl)(new com.moon.bl((local0_life16)[6], 3, (local0_life16)[5])));
    b = ((com.moon.bl[])(com.moon.bl.a__Arraybl()));
}


public static com.moon.bl[] values() {
return ((com.moon.bl[])(((com.moon.bl[])(com.moon.bl.b)).clone()));
}


public static com.moon.bl valueOf(java.lang.String p0) {
return ((com.moon.bl)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bl.class)), ((java.lang.String)(p0)))));
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
        byte[] spill82_0 = p0;
        life4_9 += 1;
        life5_44 = (spill82_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill82_1 = p0;
        life4_9 += 1;
        life5_76 = (spill82_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill82_2 = p0;
        life4_9 += 1;
        life5_91 = (spill82_2)[life4_9];
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


private static com.moon.bl[] a__Arraybl() {
return new com.moon.bl[] {com.moon.bl.ATTACK_DAMAGE, com.moon.bl.RIGHT_CLICK, com.moon.bl.DIGGING, com.moon.bl.EXIT_TARGET_RANGE};
}

}
