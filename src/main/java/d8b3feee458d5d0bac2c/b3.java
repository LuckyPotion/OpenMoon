package moom;


public class b3 extends sourcebuild.EnumConstructor<moom.b3> {

public static moom.b3 TEXTURE_1D;

public static moom.b3 TEXTURE_2D;

public static moom.b3 TEXTURE_3D;

public static moom.b3 TEXTURE_RECTANGLE;

private int a;

private static moom.b3[] b;

private static java.lang.String[] c;

private b3(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local20_life4 = (((moom._a)(moom._c.a(((long)(-1191526624793202239L)), ((long)(1813206199474542816L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183539500396591L))) ^ 19792291725514L);
    if ((moom.b3.b() == null)) {
        moom.b3.b(((java.lang.String[])(new java.lang.String[2])));
    }
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill762_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill762_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill762_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill762_13 = new byte[8];
    (__sourceSpill762_13)[0] = ((byte) ((int) (local20_life4 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill762_13)[local13_life14] = ((byte) ((int) ((local20_life4 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation762_15 = __sourceSpill762_13;
    ((javax.crypto.Cipher)(__sourceSpill762_10)).init(((int)(__sourceSpill762_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill762_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation762_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[4];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "cÔøQénãKçª(¼eKþ5\020cÔøQénãKM«Ãþ\021q;"))).length();
    int local15_life23 = 16;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill762_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill762_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill762_28)).doFinal(((byte[])(__sourceSpill762_27)));
        java.lang.String __sourceSpill762_33 = ((java.lang.String)(moom.b3.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill762_34 = local11_life18;
        int __sourceSpill762_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill762_34)[__sourceSpill762_35] = __sourceSpill762_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "cÔøQénãK`g\032WÁ\026ük´p^Í`ï¸\020cÔøQénãK°Jaêmxå"))).length();
    local15_life23 = 24;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill762_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill762_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill762_41)).doFinal(((byte[])(__sourceSpill762_40)));
        java.lang.String __sourceSpill762_46 = ((java.lang.String)(moom.b3.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill762_47 = local11_life18;
        int __sourceSpill762_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill762_47)[__sourceSpill762_48] = __sourceSpill762_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    javax.crypto.Cipher local1_life51;
    javax.crypto.Cipher __sourceSpill762_53 = (local1_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill762_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill762_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill762_56 = new byte[8];
    (__sourceSpill762_56)[0] = ((byte) ((int) (local20_life4 >>> 56)));
    int local2_life57 = 1;
    while ((local2_life57 < 8)) {
        (__sourceSpill762_56)[local2_life57] = ((byte) ((int) ((local20_life4 << (local2_life57 * 8)) >>> 56)));
        local2_life57 += 1;
    }
    byte[] __sourcePreallocation762_58 = __sourceSpill762_56;
    ((javax.crypto.Cipher)(__sourceSpill762_53)).init(((int)(__sourceSpill762_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill762_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation762_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local0_life61 = new long[4];
    int local4_life62 = 0;
    java.lang.String local5_life63;
    int local6_life65 = ((java.lang.String)((local5_life63 = "9è<uÇ3æ¡}ÝAr"))).length();
    int local3_life66 = 0;
    do {
        java.lang.String __sourceSpill762_67 = local5_life63;
        int __sourceSpill762_68 = local3_life66;
        local3_life66 += 8;
        byte[] local7_life71 = ((java.lang.String)(((java.lang.String)(__sourceSpill762_67)).substring(((int)(__sourceSpill762_68)), ((int)(local3_life66))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill762_72 = local0_life61;
        int __sourceSpill762_73 = local4_life62;
        local4_life62 += 1;
        long local8_life74 = (((((((((((long) (local7_life71)[0]) & 255L) << 56) | ((((long) (local7_life71)[1]) & 255L) << 48)) | ((((long) (local7_life71)[2]) & 255L) << 40)) | ((((long) (local7_life71)[3]) & 255L) << 32)) | ((((long) (local7_life71)[4]) & 255L) << 24)) | ((((long) (local7_life71)[5]) & 255L) << 16)) | ((((long) (local7_life71)[6]) & 255L) << 8)) | (((long) (local7_life71)[7]) & 255L));
        byte[] __sourceSpill762_75 = new byte[8];
        (__sourceSpill762_75)[0] = ((byte) ((int) (local8_life74 >>> 56)));
        (__sourceSpill762_75)[1] = ((byte) ((int) (local8_life74 >>> 48)));
        (__sourceSpill762_75)[2] = ((byte) ((int) (local8_life74 >>> 40)));
        (__sourceSpill762_75)[3] = ((byte) ((int) (local8_life74 >>> 32)));
        (__sourceSpill762_75)[4] = ((byte) ((int) (local8_life74 >>> 24)));
        (__sourceSpill762_75)[5] = ((byte) ((int) (local8_life74 >>> 16)));
        (__sourceSpill762_75)[6] = ((byte) ((int) (local8_life74 >>> 8)));
        (__sourceSpill762_75)[7] = ((byte) ((int) local8_life74));
        javax.crypto.Cipher __sourceSpill762_76 = local1_life51;
        byte[] local10_life78 = ((javax.crypto.Cipher)(__sourceSpill762_76)).doFinal(((byte[])(__sourceSpill762_75)));
        (__sourceSpill762_72)[__sourceSpill762_73] = (((((((((((long) (local10_life78)[0]) & 255L) << 56) | ((((long) (local10_life78)[1]) & 255L) << 48)) | ((((long) (local10_life78)[2]) & 255L) << 40)) | ((((long) (local10_life78)[3]) & 255L) << 32)) | ((((long) (local10_life78)[4]) & 255L) << 24)) | ((((long) (local10_life78)[5]) & 255L) << 16)) | ((((long) (local10_life78)[6]) & 255L) << 8)) | (((long) (local10_life78)[7]) & 255L));
    } while ((!(local3_life66 >= local6_life65)));
    local6_life65 = ((java.lang.String)((local5_life63 = "&÷QÞ\024ÆÌ(4\016K©~\004"))).length();
    local3_life66 = 0;
    do {
        java.lang.String __sourceSpill762_80 = local5_life63;
        int __sourceSpill762_81 = local3_life66;
        local3_life66 += 8;
        byte[] local7_life84 = ((java.lang.String)(((java.lang.String)(__sourceSpill762_80)).substring(((int)(__sourceSpill762_81)), ((int)(local3_life66))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill762_85 = local0_life61;
        int __sourceSpill762_86 = local4_life62;
        local4_life62 += 1;
        long local8_life87 = (((((((((((long) (local7_life84)[0]) & 255L) << 56) | ((((long) (local7_life84)[1]) & 255L) << 48)) | ((((long) (local7_life84)[2]) & 255L) << 40)) | ((((long) (local7_life84)[3]) & 255L) << 32)) | ((((long) (local7_life84)[4]) & 255L) << 24)) | ((((long) (local7_life84)[5]) & 255L) << 16)) | ((((long) (local7_life84)[6]) & 255L) << 8)) | (((long) (local7_life84)[7]) & 255L));
        byte[] __sourceSpill762_88 = new byte[8];
        (__sourceSpill762_88)[0] = ((byte) ((int) (local8_life87 >>> 56)));
        (__sourceSpill762_88)[1] = ((byte) ((int) (local8_life87 >>> 48)));
        (__sourceSpill762_88)[2] = ((byte) ((int) (local8_life87 >>> 40)));
        (__sourceSpill762_88)[3] = ((byte) ((int) (local8_life87 >>> 32)));
        (__sourceSpill762_88)[4] = ((byte) ((int) (local8_life87 >>> 24)));
        (__sourceSpill762_88)[5] = ((byte) ((int) (local8_life87 >>> 16)));
        (__sourceSpill762_88)[6] = ((byte) ((int) (local8_life87 >>> 8)));
        (__sourceSpill762_88)[7] = ((byte) ((int) local8_life87));
        javax.crypto.Cipher __sourceSpill762_89 = local1_life51;
        byte[] local10_life91 = ((javax.crypto.Cipher)(__sourceSpill762_89)).doFinal(((byte[])(__sourceSpill762_88)));
        (__sourceSpill762_85)[__sourceSpill762_86] = (((((((((((long) (local10_life91)[0]) & 255L) << 56) | ((((long) (local10_life91)[1]) & 255L) << 48)) | ((((long) (local10_life91)[2]) & 255L) << 40)) | ((((long) (local10_life91)[3]) & 255L) << 32)) | ((((long) (local10_life91)[4]) & 255L) << 24)) | ((((long) (local10_life91)[5]) & 255L) << 16)) | ((((long) (local10_life91)[6]) & 255L) << 8)) | (((long) (local10_life91)[7]) & 255L));
    } while ((!(local3_life66 >= local6_life65)));
    TEXTURE_1D = ((moom.b3)(new moom.b3((local11_life18)[1], 0, ((int) (local0_life61)[1]))));
    TEXTURE_2D = ((moom.b3)(new moom.b3((local11_life18)[3], 1, ((int) (local0_life61)[3]))));
    TEXTURE_3D = ((moom.b3)(new moom.b3((local11_life18)[0], 2, ((int) (local0_life61)[2]))));
    TEXTURE_RECTANGLE = ((moom.b3)(new moom.b3((local11_life18)[2], 3, ((int) (local0_life61)[0]))));
    b = ((moom.b3[])(moom.b3.a__Arrayb3()));
}


public static moom.b3[] values() {
return ((moom.b3[])(((moom.b3[])(moom.b3.b)).clone()));
}


public static moom.b3 valueOf(java.lang.String p0) {
return ((moom.b3)(java.lang.Enum.valueOf(((java.lang.Class)(moom.b3.class)), ((java.lang.String)(p0)))));
}


public static java.lang.String[] b() {
return moom.b3.c;
}


public static void b(java.lang.String[] p0) {
c = ((java.lang.String[])(p0));
    return;
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
        byte[] spill3496_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3496_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3496_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3496_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3496_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3496_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.b3[] a__Arrayb3() {
return new moom.b3[] {moom.b3.TEXTURE_1D, moom.b3.TEXTURE_2D, moom.b3.TEXTURE_3D, moom.b3.TEXTURE_RECTANGLE};
}


public int a() {
return this.a;
}

}
