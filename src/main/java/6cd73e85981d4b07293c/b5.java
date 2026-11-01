package com.moon;


public class b5 extends sourcebuild.EnumConstructor<com.moon.b5> implements com.moon.l8 {

public static com.moon.b5 PLAYER;

public static com.moon.b5 ANIMAL;

public static com.moon.b5 MOB;

public static com.moon.b5 INVISIBLE;

private java.lang.String a;

private static com.moon.b5[] b;

private b5(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(7167584799785044500L)), ((long)(-8347827665555156020L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(85286968736029L))) ^ 111881269700551L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill27_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill27_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill27_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill27_11 = new byte[8];
    (__sourceSpill27_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill27_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation27_13 = __sourceSpill27_11;
    ((javax.crypto.Cipher)(__sourceSpill27_8)).init(((int)(__sourceSpill27_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill27_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation27_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[8];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "-HaxoOø(Ùù\005»z:6$\bïR¾)è\003g\020\031Ê\037\032hFÁð/âfB!\bËò0ÓKq^\b\032'Á%³Se^\b\000#¸\035¾Ê"))).length();
    int local4_life21 = 16;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill27_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill27_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill27_26)).doFinal(((byte[])(__sourceSpill27_25)));
        java.lang.String __sourceSpill27_31 = ((java.lang.String)(com.moon.b5.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill27_32 = local0_life16;
        int __sourceSpill27_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill27_32)[__sourceSpill27_33] = __sourceSpill27_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "«cï;2SÒ\007\bF\177\037yqIT"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill27_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill27_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill27_40)).doFinal(((byte[])(__sourceSpill27_39)));
        java.lang.String __sourceSpill27_45 = ((java.lang.String)(com.moon.b5.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill27_46 = local0_life16;
        int __sourceSpill27_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill27_46)[__sourceSpill27_47] = __sourceSpill27_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    PLAYER = ((com.moon.b5)(new com.moon.b5((local0_life16)[5], 0, (local0_life16)[4])));
    ANIMAL = ((com.moon.b5)(new com.moon.b5((local0_life16)[7], 1, (local0_life16)[3])));
    MOB = ((com.moon.b5)(new com.moon.b5((local0_life16)[6], 2, (local0_life16)[1])));
    INVISIBLE = ((com.moon.b5)(new com.moon.b5((local0_life16)[0], 3, (local0_life16)[2])));
    b = ((com.moon.b5[])(com.moon.b5.a__Arrayb5()));
}


public static com.moon.b5[] values() {
return ((com.moon.b5[])(((com.moon.b5[])(com.moon.b5.b)).clone()));
}


public static com.moon.b5 valueOf(java.lang.String p0) {
return ((com.moon.b5)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.b5.class)), ((java.lang.String)(p0)))));
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
        byte[] spill35_0 = p0;
        life4_9 += 1;
        life5_44 = (spill35_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill35_1 = p0;
        life4_9 += 1;
        life5_76 = (spill35_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill35_2 = p0;
        life4_9 += 1;
        life5_91 = (spill35_2)[life4_9];
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


private static com.moon.b5[] a__Arrayb5() {
return new com.moon.b5[] {com.moon.b5.PLAYER, com.moon.b5.ANIMAL, com.moon.b5.MOB, com.moon.b5.INVISIBLE};
}

}
