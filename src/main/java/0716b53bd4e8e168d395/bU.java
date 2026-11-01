package moom;


public class bU extends sourcebuild.EnumConstructor<moom.bU> {

public static moom.bU IDENTIFIER;

public static moom.bU NUMBER;

public static moom.bU OPERATOR;

public static moom.bU COMMA;

public static moom.bU BRACKET_OPEN;

public static moom.bU BRACKET_CLOSE;

private java.lang.String a;

private java.lang.String b;

public static moom.bU[] VALUES;

private static moom.bU[] c;

private static long d;

private static long e;

private bU(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private bU(java.lang.String p0, int p1, java.lang.String p2) {
this(p0, p1, p2, "");
    return;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-8582388547510554328L)), ((long)(5961313844387987408L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(3917239907339L)))));
    long local14_life6 = (moom.bU.d ^ 1952674749611L);
    javax.crypto.Cipher local6_life8;
    javax.crypto.Cipher __sourceSpill772_10 = (local6_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill772_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill772_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill772_13 = new byte[8];
    (__sourceSpill772_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local7_life14 = 1;
    while ((local7_life14 < 8)) {
        (__sourceSpill772_13)[local7_life14] = ((byte) ((int) ((local14_life6 << (local7_life14 * 8)) >>> 56)));
        local7_life14 += 1;
    }
    byte[] __sourcePreallocation772_15 = __sourceSpill772_13;
    ((javax.crypto.Cipher)(__sourceSpill772_10)).init(((int)(__sourceSpill772_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill772_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation772_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local5_life18 = new java.lang.String[12];
    int local11_life19 = 0;
    java.lang.String local10_life20;
    int local12_life22 = ((java.lang.String)((local10_life20 = "\017\033'quüÉ\005\020X*[5\004Ü±ºÍØ¬¿\b8=\013\037KK\032\\\"´°0Óèëy\025¶VoæÒ\033SÞÈmÞ&Ñ}û2ÇàõLòØòmP\037°41Wê\020Á7\033QU¹±\t¢k\"\031¤Íµ\020X*[5\004Ü±º×¸\025í]\020\027wT®¯\024B]¥\017 rl\bÇìAü@ªH=\013\037KK\032\\\"´°0Óèëy\025¶VoæÒ\033SÞÈmÞ&Ñ}û2ÇàõLòØòmPöàÑ\025}ÃÄf\f1ÞrÇ­ýi¨\025\020ö\005w6\020\037ÖPÛ!Q \"±\013vÙ]\020n\026­Ä$`0\001rmPÝ\r¬O"))).length();
    int local9_life23 = 8;
    int local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill772_27 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill772_28 = local6_life8;
        byte[] local13_life30 = ((javax.crypto.Cipher)(__sourceSpill772_28)).doFinal(((byte[])(__sourceSpill772_27)));
        java.lang.String __sourceSpill772_33 = ((java.lang.String)(moom.bU.a(((byte[])(local13_life30))))).intern();
        java.lang.String[] __sourceSpill772_34 = local5_life18;
        int __sourceSpill772_35 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill772_34)[__sourceSpill772_35] = __sourceSpill772_33;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    local12_life22 = ((java.lang.String)((local10_life20 = "Á7\033QU¹±¦JÃj&3µ\b¡ôaQýPk"))).length();
    local9_life23 = 16;
    local8_life24 = -1;
    while (true) {
        local8_life24 += 1;
        byte[] __sourceSpill772_40 = ((java.lang.String)(((java.lang.String)(local10_life20)).substring(((int)(local8_life24)), ((int)((local8_life24 + local9_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill772_41 = local6_life8;
        byte[] local13_life43 = ((javax.crypto.Cipher)(__sourceSpill772_41)).doFinal(((byte[])(__sourceSpill772_40)));
        java.lang.String __sourceSpill772_46 = ((java.lang.String)(moom.bU.a(((byte[])(local13_life43))))).intern();
        java.lang.String[] __sourceSpill772_47 = local5_life18;
        int __sourceSpill772_48 = local11_life19;
        local11_life19 += 1;
        (__sourceSpill772_47)[__sourceSpill772_48] = __sourceSpill772_46;
        if (!(((local8_life24 = (local8_life24 + local9_life23)) < local12_life22))) { break; }
        local9_life23 = ((java.lang.String)(local10_life20)).charAt(((int)(local8_life24)));
    }
    javax.crypto.Cipher local0_life51;
    javax.crypto.Cipher __sourceSpill772_53 = (local0_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill772_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill772_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill772_56 = new byte[8];
    (__sourceSpill772_56)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life57 = 1;
    while ((local1_life57 < 8)) {
        (__sourceSpill772_56)[local1_life57] = ((byte) ((int) ((local14_life6 << (local1_life57 * 8)) >>> 56)));
        local1_life57 += 1;
    }
    byte[] __sourcePreallocation772_58 = __sourceSpill772_56;
    ((javax.crypto.Cipher)(__sourceSpill772_53)).init(((int)(__sourceSpill772_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill772_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation772_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life61 = 6880885907903547169L;
    byte[] __sourceSpill772_62 = new byte[8];
    (__sourceSpill772_62)[0] = ((byte) ((int) (local2_life61 >>> 56)));
    (__sourceSpill772_62)[1] = ((byte) ((int) (local2_life61 >>> 48)));
    (__sourceSpill772_62)[2] = ((byte) ((int) (local2_life61 >>> 40)));
    (__sourceSpill772_62)[3] = ((byte) ((int) (local2_life61 >>> 32)));
    (__sourceSpill772_62)[4] = ((byte) ((int) (local2_life61 >>> 24)));
    (__sourceSpill772_62)[5] = ((byte) ((int) (local2_life61 >>> 16)));
    (__sourceSpill772_62)[6] = ((byte) ((int) (local2_life61 >>> 8)));
    (__sourceSpill772_62)[7] = ((byte) ((int) local2_life61));
    javax.crypto.Cipher __sourceSpill772_63 = local0_life51;
    byte[] local4_life65 = ((javax.crypto.Cipher)(__sourceSpill772_63)).doFinal(((byte[])(__sourceSpill772_62)));
    e = ((long)((((((((((((long) (local4_life65)[0]) & 255L) << 56) | ((((long) (local4_life65)[1]) & 255L) << 48)) | ((((long) (local4_life65)[2]) & 255L) << 40)) | ((((long) (local4_life65)[3]) & 255L) << 32)) | ((((long) (local4_life65)[4]) & 255L) << 24)) | ((((long) (local4_life65)[5]) & 255L) << 16)) | ((((long) (local4_life65)[6]) & 255L) << 8)) | (((long) (local4_life65)[7]) & 255L))));
    IDENTIFIER = ((moom.bU)(new moom.bU((local5_life18)[8], 0, (local5_life18)[2], (local5_life18)[7])));
    NUMBER = ((moom.bU)(new moom.bU((local5_life18)[11], 1, (local5_life18)[3], (local5_life18)[10])));
    OPERATOR = ((moom.bU)(new moom.bU((local5_life18)[5], 2, (local5_life18)[9], (local5_life18)[0])));
    COMMA = ((moom.bU)(new moom.bU((local5_life18)[6], 3, ",")));
    BRACKET_OPEN = ((moom.bU)(new moom.bU((local5_life18)[1], 4, "(")));
    BRACKET_CLOSE = ((moom.bU)(new moom.bU((local5_life18)[4], 5, ")")));
    c = ((moom.bU[])(moom.bU.a__ArraybU()));
    VALUES = ((moom.bU[])(moom.bU.values()));
}


public static moom.bU[] values() {
return ((moom.bU[])(((moom.bU[])(moom.bU.c)).clone()));
}


public static moom.bU valueOf(java.lang.String p0) {
return ((moom.bU)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bU.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.b;
}


private static moom.bU[] a__ArraybU() {
long local0_life1 = (moom.bU.d ^ 39823863097053L);
    moom.bU[] __sourceSharedArray763_4 = new moom.bU[((int) moom.bU.e)];
    __sourceSharedArray763_4[0] = moom.bU.IDENTIFIER;
    __sourceSharedArray763_4[1] = moom.bU.NUMBER;
    __sourceSharedArray763_4[2] = moom.bU.OPERATOR;
    __sourceSharedArray763_4[3] = moom.bU.COMMA;
    __sourceSharedArray763_4[4] = moom.bU.BRACKET_OPEN;
    __sourceSharedArray763_4[5] = moom.bU.BRACKET_CLOSE;
    return __sourceSharedArray763_4;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill3524_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3524_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3524_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3524_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3524_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3524_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean a__Boolean(char p0) {
int forwardValue2973_14_0;
    int forwardValue2973_16_0;
    int spill2973_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.bU.d ^ 33200763045662L);
    life4_5 = moom.bS.b();
    spill2973_0 = ((java.lang.String)(this.b)).indexOf(((int)(p0)));
    if (!((life4_5 != null))) {
        forwardValue2973_14_0 = spill2973_0;
        break forward_join_14;
    }
    if (!((spill2973_0 >= 0))) {
        break forward_join_15;
    }
    forwardValue2973_14_0 = 1;
    }
    forwardValue2973_16_0 = forwardValue2973_14_0;
    break forward_join_16;
    }
    forwardValue2973_16_0 = 0;
    }
    return ((forwardValue2973_16_0) != 0);
}


public static moom.bU a(char p0) {
java.lang.String[] spill1057_0;
    long life1_3;
    moom.bU[] life4_6;
    java.lang.String[] life3_7;
    int life5_10;
    int life6_12;
    moom.bU life7_19;
    lexical_join_32: {
    life1_3 = (moom.bU.d ^ 79860201888588L);
    spill1057_0 = moom.bS.b();
    life4_6 = moom.bU.VALUES;
    life3_7 = spill1057_0;
    life5_10 = (life4_6).length;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life6_12 < life5_10))) {
        break lexical_join_32;
    }
    life7_19 = (life4_6)[life6_12];
    if (!((life3_7 != null))) {
        break lexical_join_30;
    }
    if (!((((java.lang.String)(((moom.bU)(life7_19)).a())).indexOf(((int)(p0))) >= 0))) {
        break lexical_join_29;
    }
    return life7_19;
    }
    life6_12 += 1;
    }
    if (!((life3_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}


public java.lang.String a() {
return this.a;
}

}
