package com.moon;


public class bb extends sourcebuild.EnumConstructor<com.moon.bb> implements com.moon.l8 {

public static com.moon.bb NORMAL;

public static com.moon.bb ATTACK_POINT;

public static com.moon.bb CIRCULAR;

private java.lang.String a;

private static com.moon.bb[] b;

private bb(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-325480848290978504L)), ((long)(-1079229809863604491L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(148320801530818L))) ^ 87733606563705L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill57_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill57_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill57_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill57_11 = new byte[8];
    (__sourceSpill57_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill57_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation57_13 = __sourceSpill57_11;
    ((javax.crypto.Cipher)(__sourceSpill57_8)).init(((int)(__sourceSpill57_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill57_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation57_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[6];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "_XWðâ\\þU\005ÀH¡¬\025\020·\036°]à§ßZw»3Ö0N©\020\035lé]\002d%ry\016Ù\foxj\bÕS¢gÿ®Lì"))).length();
    int local4_life21 = 16;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill57_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill57_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill57_26)).doFinal(((byte[])(__sourceSpill57_25)));
        java.lang.String __sourceSpill57_31 = ((java.lang.String)(com.moon.bb.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill57_32 = local0_life16;
        int __sourceSpill57_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill57_32)[__sourceSpill57_33] = __sourceSpill57_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "òÔ+\fb\035J}âS]\"\b]\b\005ù§w3õ\\{"))).length();
    local4_life21 = 16;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill57_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill57_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill57_40)).doFinal(((byte[])(__sourceSpill57_39)));
        java.lang.String __sourceSpill57_45 = ((java.lang.String)(com.moon.bb.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill57_46 = local0_life16;
        int __sourceSpill57_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill57_46)[__sourceSpill57_47] = __sourceSpill57_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    NORMAL = ((com.moon.bb)(new com.moon.bb((local0_life16)[5], 0, (local0_life16)[3])));
    ATTACK_POINT = ((com.moon.bb)(new com.moon.bb((local0_life16)[4], 1, (local0_life16)[1])));
    CIRCULAR = ((com.moon.bb)(new com.moon.bb((local0_life16)[0], 2, (local0_life16)[2])));
    b = ((com.moon.bb[])(com.moon.bb.a__Arraybb()));
}


public static com.moon.bb[] values() {
return ((com.moon.bb[])(((com.moon.bb[])(com.moon.bb.b)).clone()));
}


public static com.moon.bb valueOf(java.lang.String p0) {
return ((com.moon.bb)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bb.class)), ((java.lang.String)(p0)))));
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
        byte[] spill70_0 = p0;
        life4_9 += 1;
        life5_44 = (spill70_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill70_1 = p0;
        life4_9 += 1;
        life5_76 = (spill70_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill70_2 = p0;
        life4_9 += 1;
        life5_91 = (spill70_2)[life4_9];
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


private static com.moon.bb[] a__Arraybb() {
return new com.moon.bb[] {com.moon.bb.NORMAL, com.moon.bb.ATTACK_POINT, com.moon.bb.CIRCULAR};
}

}
