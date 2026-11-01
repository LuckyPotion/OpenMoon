package com.moon;


public class a_ extends sourcebuild.EnumConstructor<com.moon.a_> implements com.moon.l8 {

public static com.moon.a_ HURT_TIME;

public static com.moon.a_ ATTACK_SYNC;

public static com.moon.a_ OPTIMIZED;

public static com.moon.a_ FAKE;

public static com.moon.a_ HOLD;

private java.lang.String a;

private com.moon.f0 b;

private static com.moon.a_[] c;

private a_(java.lang.String p0, int p1, java.lang.String p2, com.moon.f0 p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-6007715201408417368L)), ((long)(1965961150392544828L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(153016605721817L))) ^ 85039811474797L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill18_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill18_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill18_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill18_11 = new byte[8];
    (__sourceSpill18_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill18_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation18_13 = __sourceSpill18_11;
    ((javax.crypto.Cipher)(__sourceSpill18_8)).init(((int)(__sourceSpill18_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill18_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation18_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[10];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "Uk|ÊøLÿ­ç[V?\020Í\020ùê%ìæp\017\b¹1\byF§,Ã\t\b~\036S³\024T¢\035\020Iß8jZbGÄnÆ\022ó>P\020ß\007\fü^Ì¹?¡¾ê\177LRC\020(Yu3oÏ4ýi½\001\rñ\032w\020p\007!j\033 §.Ü¯mØr.^t"))).length();
    int local4_life21 = 16;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill18_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill18_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill18_26)).doFinal(((byte[])(__sourceSpill18_25)));
        java.lang.String __sourceSpill18_31 = ((java.lang.String)(com.moon.a_.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill18_32 = local0_life16;
        int __sourceSpill18_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill18_32)[__sourceSpill18_33] = __sourceSpill18_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "¤\030lÏæîX\bvP\005\002©d["))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill18_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill18_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill18_40)).doFinal(((byte[])(__sourceSpill18_39)));
        java.lang.String __sourceSpill18_45 = ((java.lang.String)(com.moon.a_.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill18_46 = local0_life16;
        int __sourceSpill18_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill18_46)[__sourceSpill18_47] = __sourceSpill18_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    HURT_TIME = ((com.moon.a_)(new com.moon.a_((local0_life16)[5], 0, (local0_life16)[1], new com.moon.f4())));
    ATTACK_SYNC = ((com.moon.a_)(new com.moon.a_((local0_life16)[6], 1, (local0_life16)[0], new com.moon.f1())));
    OPTIMIZED = ((com.moon.a_)(new com.moon.a_((local0_life16)[7], 2, (local0_life16)[4], new com.moon.f6())));
    FAKE = ((com.moon.a_)(new com.moon.a_((local0_life16)[8], 3, (local0_life16)[3], new com.moon.f2())));
    HOLD = ((com.moon.a_)(new com.moon.a_((local0_life16)[9], 4, (local0_life16)[2], new com.moon.f3())));
    c = ((com.moon.a_[])(com.moon.a_.a__Arraya_()));
}


public static com.moon.a_[] values() {
return ((com.moon.a_[])(((com.moon.a_[])(com.moon.a_.c)).clone()));
}


public static com.moon.a_ valueOf(java.lang.String p0) {
return ((com.moon.a_)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.a_.class)), ((java.lang.String)(p0)))));
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
        byte[] spill29_0 = p0;
        life4_9 += 1;
        life5_44 = (spill29_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill29_1 = p0;
        life4_9 += 1;
        life5_76 = (spill29_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill29_2 = p0;
        life4_9 += 1;
        life5_91 = (spill29_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.a_[] a__Arraya_() {
return new com.moon.a_[] {com.moon.a_.HURT_TIME, com.moon.a_.ATTACK_SYNC, com.moon.a_.OPTIMIZED, com.moon.a_.FAKE, com.moon.a_.HOLD};
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.f0 a() {
return this.b;
}

}
