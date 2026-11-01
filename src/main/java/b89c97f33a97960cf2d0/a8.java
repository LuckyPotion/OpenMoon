package com.moon;


public class a8 extends sourcebuild.EnumConstructor<com.moon.a8> implements com.moon.l8, com.moon.kS<com.moon.module.impl.Criticals> {

public static com.moon.a8 VULCAN;

public static com.moon.a8 VERUS;

private java.lang.String a;

private com.moon.e2<com.moon.module.impl.Criticals> b;

private static com.moon.a8[] c;

private a8(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.Criticals> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(1583752477098541764L)), ((long)(1413090726599670000L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(245506866967345L))) ^ 81301268835787L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill7_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill7_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill7_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill7_11 = new byte[8];
    (__sourceSpill7_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill7_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation7_13 = __sourceSpill7_11;
    ((javax.crypto.Cipher)(__sourceSpill7_8)).init(((int)(__sourceSpill7_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill7_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation7_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[4];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "Q#ïHóöñ\002\b¼\030C[\032I"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill7_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill7_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill7_26)).doFinal(((byte[])(__sourceSpill7_25)));
        java.lang.String __sourceSpill7_31 = ((java.lang.String)(com.moon.a8.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill7_32 = local0_life16;
        int __sourceSpill7_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill7_32)[__sourceSpill7_33] = __sourceSpill7_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "ø\005Gár¡òæ\b±~~Gã\026"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill7_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill7_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill7_40)).doFinal(((byte[])(__sourceSpill7_39)));
        java.lang.String __sourceSpill7_45 = ((java.lang.String)(com.moon.a8.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill7_46 = local0_life16;
        int __sourceSpill7_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill7_46)[__sourceSpill7_47] = __sourceSpill7_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    VULCAN = ((com.moon.a8)(new com.moon.a8((local0_life16)[0], 0, (local0_life16)[2], new com.moon.e4())));
    VERUS = ((com.moon.a8)(new com.moon.a8((local0_life16)[1], 1, (local0_life16)[3], new com.moon.e3())));
    c = ((com.moon.a8[])(com.moon.a8.a__Arraya8()));
}


public static com.moon.a8[] values() {
return ((com.moon.a8[])(((com.moon.a8[])(com.moon.a8.c)).clone()));
}


public static com.moon.a8 valueOf(java.lang.String p0) {
return ((com.moon.a8)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.a8.class)), ((java.lang.String)(p0)))));
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
        byte[] spill10_0 = p0;
        life4_9 += 1;
        life5_44 = (spill10_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill10_1 = p0;
        life4_9 += 1;
        life5_76 = (spill10_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill10_2 = p0;
        life4_9 += 1;
        life5_91 = (spill10_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.a8[] a__Arraya8() {
return new com.moon.a8[] {com.moon.a8.VULCAN, com.moon.a8.VERUS};
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.e2<com.moon.module.impl.Criticals> a() {
return this.b;
}

}
