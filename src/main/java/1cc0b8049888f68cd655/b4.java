package com.moon;


public class b4 extends sourcebuild.EnumConstructor<com.moon.b4> implements com.moon.l8 {

public static com.moon.b4 BABY;

public static com.moon.b4 RIDING;

public static com.moon.b4 HIDE_ARMOR;

private java.lang.String a;

private static com.moon.b4[] b;

private b4(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-6202780801919599755L)), ((long)(1266757763479956140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(242153580180946L))) ^ 116069880790907L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill26_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill26_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill26_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill26_11 = new byte[8];
    (__sourceSpill26_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill26_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation26_13 = __sourceSpill26_11;
    ((javax.crypto.Cipher)(__sourceSpill26_8)).init(((int)(__sourceSpill26_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill26_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation26_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "®¾\000àI§\020Ü¹7Í¿·W0`Gæ¿\006\020éôÂÎ]i\000;=½É*|Þ¿\b5/ü'é"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill26_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill26_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill26_26)).doFinal(((byte[])(__sourceSpill26_25)));
        java.lang.String __sourceSpill26_31 = ((java.lang.String)(com.moon.b4.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill26_32 = local0_life16;
        int __sourceSpill26_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill26_32)[__sourceSpill26_33] = __sourceSpill26_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "\007D Â\025Gt\bË§B(dø;"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill26_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill26_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill26_40)).doFinal(((byte[])(__sourceSpill26_39)));
        java.lang.String __sourceSpill26_45 = ((java.lang.String)(com.moon.b4.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill26_46 = local0_life16;
        int __sourceSpill26_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill26_46)[__sourceSpill26_47] = __sourceSpill26_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    BABY = ((com.moon.b4)(new com.moon.b4((local0_life16)[5], 0, (local0_life16)[3])));
    RIDING = ((com.moon.b4)(new com.moon.b4((local0_life16)[0], 1, (local0_life16)[4])));
    HIDE_ARMOR = ((com.moon.b4)(new com.moon.b4((local0_life16)[1], 2, (local0_life16)[2])));
    b = ((com.moon.b4[])(com.moon.b4.a__Arrayb4()));
}


public static com.moon.b4[] values() {
return ((com.moon.b4[])(((com.moon.b4[])(com.moon.b4.b)).clone()));
}


public static com.moon.b4 valueOf(java.lang.String p0) {
return ((com.moon.b4)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.b4.class)), ((java.lang.String)(p0)))));
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
        byte[] spill34_0 = p0;
        life4_9 += 1;
        life5_44 = (spill34_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill34_1 = p0;
        life4_9 += 1;
        life5_76 = (spill34_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill34_2 = p0;
        life4_9 += 1;
        life5_91 = (spill34_2)[life4_9];
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


private static com.moon.b4[] a__Arrayb4() {
return new com.moon.b4[] {com.moon.b4.BABY, com.moon.b4.RIDING, com.moon.b4.HIDE_ARMOR};
}

}
