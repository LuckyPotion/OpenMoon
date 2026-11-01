package moom;


class b4 extends sourcebuild.EnumConstructor<moom.b4> {

public static moom.b4 SIN;

public static moom.b4 COS;

public static moom.b4 ASIN;

public static moom.b4 ACOS;

private static moom.b4[] a;

private b4(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(8486520356402225084L)), ((long)(-4613161809986656807L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167147966818465L))) ^ 25245145837886L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill918_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill918_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill918_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill918_11 = new byte[8];
    (__sourceSpill918_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill918_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation918_13 = __sourceSpill918_11;
    ((javax.crypto.Cipher)(__sourceSpill918_8)).init(((int)(__sourceSpill918_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill918_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation918_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[4];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "]Ùs0ÇÐ|\b±3|ùäÖãÛ"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill918_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill918_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill918_26)).doFinal(((byte[])(__sourceSpill918_25)));
        java.lang.String __sourceSpill918_31 = ((java.lang.String)(moom.b4.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill918_32 = local0_life16;
        int __sourceSpill918_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill918_32)[__sourceSpill918_33] = __sourceSpill918_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "Ô2ÒÞ)7å\b\006¼K×*"))).length();
    local4_life21 = 8;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill918_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill918_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill918_40)).doFinal(((byte[])(__sourceSpill918_39)));
        java.lang.String __sourceSpill918_45 = ((java.lang.String)(moom.b4.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill918_46 = local0_life16;
        int __sourceSpill918_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill918_46)[__sourceSpill918_47] = __sourceSpill918_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    SIN = ((moom.b4)(new moom.b4((local0_life16)[3], 0)));
    COS = ((moom.b4)(new moom.b4((local0_life16)[1], 1)));
    ASIN = ((moom.b4)(new moom.b4((local0_life16)[2], 2)));
    ACOS = ((moom.b4)(new moom.b4((local0_life16)[0], 3)));
    a = ((moom.b4[])(moom.b4.a()));
}


public static moom.b4[] values() {
return ((moom.b4[])(((moom.b4[])(moom.b4.a)).clone()));
}


public static moom.b4 valueOf(java.lang.String p0) {
return ((moom.b4)(java.lang.Enum.valueOf(((java.lang.Class)(moom.b4.class)), ((java.lang.String)(p0)))));
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
        byte[] spill3497_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3497_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3497_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3497_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3497_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3497_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.b4[] a() {
return new moom.b4[] {moom.b4.SIN, moom.b4.COS, moom.b4.ASIN, moom.b4.ACOS};
}

}
