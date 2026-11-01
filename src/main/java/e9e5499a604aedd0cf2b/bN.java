package moom;


class bN extends sourcebuild.EnumConstructor<moom.bN> {

public static moom.bN HORSE;

public static moom.bN DONKEY;

public static moom.bN MULE;

public static moom.bN LLAMA;

public static moom.bN DISPENSER;

public static moom.bN DROPPER;

private static moom.bN[] a;

private static long b;

private static long c;

private bN(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(5773844432178958688L)), ((long)(8767335201133497168L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(56472283932196L)))));
    long local14_life6 = (moom.bN.b ^ 113619948178380L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill766_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill766_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill766_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill766_13 = new byte[8];
    (__sourceSpill766_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill766_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation766_15 = __sourceSpill766_13;
    ((javax.crypto.Cipher)(__sourceSpill766_10)).init(((int)(__sourceSpill766_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill766_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation766_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[6];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "uÈ\001Ö$KûÍ\bôã\034yý\bg\021>Æùá`\020\030²ÚVD`º\020!2!Z«wVW"))).length();
    int local9_life23 = 8;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill766_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill766_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill766_28)).doFinal(((byte[])(__sourceSpill766_27)));
        java.lang.String __sourceSpill766_33 = ((java.lang.String)(moom.bN.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill766_34 = local5_life18;
        int __sourceSpill766_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill766_34)[__sourceSpill766_35] = __sourceSpill766_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "ÛGum·³\034¿\býÀæO¡Ö"))).length();
    local9_life23 = 8;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill766_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill766_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill766_41)).doFinal(((byte[])(__sourceSpill766_40)));
        java.lang.String __sourceSpill766_46 = ((java.lang.String)(moom.bN.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill766_47 = local5_life18;
        int __sourceSpill766_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill766_47)[__sourceSpill766_48] = __sourceSpill766_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill766_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill766_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill766_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill766_56 = new byte[8];
    (__sourceSpill766_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill766_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation766_58 = __sourceSpill766_56;
    ((javax.crypto.Cipher)(__sourceSpill766_53)).init(((int)(__sourceSpill766_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill766_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation766_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = -3050612727953795469L;
    byte[] __sourceSpill766_62 = new byte[8];
    (__sourceSpill766_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill766_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill766_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill766_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill766_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill766_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill766_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill766_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill766_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill766_63)).doFinal(((byte[])(__sourceSpill766_62)));
    c = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    HORSE = ((moom.bN)(new moom.bN((local5_life18)[4], 0)));
    DONKEY = ((moom.bN)(new moom.bN((local5_life18)[1], 1)));
    MULE = ((moom.bN)(new moom.bN((local5_life18)[5], 2)));
    LLAMA = ((moom.bN)(new moom.bN((local5_life18)[0], 3)));
    DISPENSER = ((moom.bN)(new moom.bN((local5_life18)[3], 4)));
    DROPPER = ((moom.bN)(new moom.bN((local5_life18)[2], 5)));
    a = ((moom.bN[])(moom.bN.a()));
}


public static moom.bN[] values() {
return ((moom.bN[])(((moom.bN[])(moom.bN.a)).clone()));
}


public static moom.bN valueOf(java.lang.String p0) {
return ((moom.bN)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bN.class)), ((java.lang.String)(p0)))));
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
        byte[] spill3502_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3502_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3502_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3502_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3502_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3502_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.bN[] a() {
long local0_life1 = (moom.bN.b ^ 61084960055654L);
    moom.bN[] __sourceSharedArray756_4 = new moom.bN[((int) moom.bN.c)];
    __sourceSharedArray756_4[0] = moom.bN.HORSE;
    __sourceSharedArray756_4[1] = moom.bN.DONKEY;
    __sourceSharedArray756_4[2] = moom.bN.MULE;
    __sourceSharedArray756_4[3] = moom.bN.LLAMA;
    __sourceSharedArray756_4[4] = moom.bN.DISPENSER;
    __sourceSharedArray756_4[5] = moom.bN.DROPPER;
    return __sourceSharedArray756_4;
}

}
