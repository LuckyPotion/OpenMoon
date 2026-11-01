package com.moon;


public class aT extends sourcebuild.EnumConstructor<com.moon.aT> {

public static com.moon.aT LOAD;

public static com.moon.aT SAVE;

public static com.moon.aT DELETE;

public static com.moon.aT LIST;

public static com.moon.aT FOLDER;

private static com.moon.aT[] a;

private aT(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(2583771713095867260L)), ((long)(3351603430868784796L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74984199327699L))) ^ 26393488659360L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill14_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill14_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill14_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill14_11 = new byte[8];
    (__sourceSpill14_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill14_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation14_13 = __sourceSpill14_11;
    ((javax.crypto.Cipher)(__sourceSpill14_8)).init(((int)(__sourceSpill14_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill14_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation14_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[5];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "\026³¾°êg\024\brPd&\034p<v\byô÷R(\035\034ü"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill14_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill14_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill14_26)).doFinal(((byte[])(__sourceSpill14_25)));
        java.lang.String __sourceSpill14_31 = ((java.lang.String)(com.moon.aT.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill14_32 = local0_life16;
        int __sourceSpill14_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill14_32)[__sourceSpill14_33] = __sourceSpill14_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "]Í©©ø T\b^Û3=\\å6"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill14_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill14_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill14_40)).doFinal(((byte[])(__sourceSpill14_39)));
        java.lang.String __sourceSpill14_45 = ((java.lang.String)(com.moon.aT.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill14_46 = local0_life16;
        int __sourceSpill14_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill14_46)[__sourceSpill14_47] = __sourceSpill14_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    LOAD = ((com.moon.aT)(new com.moon.aT((local0_life16)[1], 0)));
    SAVE = ((com.moon.aT)(new com.moon.aT((local0_life16)[4], 1)));
    DELETE = ((com.moon.aT)(new com.moon.aT((local0_life16)[0], 2)));
    LIST = ((com.moon.aT)(new com.moon.aT((local0_life16)[3], 3)));
    FOLDER = ((com.moon.aT)(new com.moon.aT((local0_life16)[2], 4)));
    a = ((com.moon.aT[])(com.moon.aT.a()));
}


public static com.moon.aT[] values() {
return ((com.moon.aT[])(((com.moon.aT[])(com.moon.aT.a)).clone()));
}


public static com.moon.aT valueOf(java.lang.String p0) {
return ((com.moon.aT)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.aT.class)), ((java.lang.String)(p0)))));
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
        byte[] spill25_0 = p0;
        life4_9 += 1;
        life5_44 = (spill25_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill25_1 = p0;
        life4_9 += 1;
        life5_76 = (spill25_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill25_2 = p0;
        life4_9 += 1;
        life5_91 = (spill25_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.aT[] a() {
return new com.moon.aT[] {com.moon.aT.LOAD, com.moon.aT.SAVE, com.moon.aT.DELETE, com.moon.aT.LIST, com.moon.aT.FOLDER};
}

}
