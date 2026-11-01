package moom;


public class bS extends sourcebuild.EnumConstructor<moom.bS> {

public static moom.bS FLOAT;

public static moom.bS FLOAT_ARRAY;

public static moom.bS BOOL;

private static moom.bS[] a;

private static java.lang.String[] b;

private bS(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(7943267775956616465L)), ((long)(6039516347751702732L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(123557314512398L))) ^ 13774463365194L);
    if ((moom.bS.b() == null)) {
        moom.bS.b(((java.lang.String[])(new java.lang.String[2])));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill771_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill771_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill771_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill771_13 = new byte[8];
    (__sourceSpill771_13)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill771_13)[local2_life14] = ((byte) ((int) ((local9_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation771_15 = __sourceSpill771_13;
    ((javax.crypto.Cipher)(__sourceSpill771_10)).init(((int)(__sourceSpill771_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill771_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation771_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[3];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "\034\001Áúx1@ ã^íÎ,\b\033\006§\000\b\035\016,\021\004$<´"))).length();
    int local4_life23 = 16;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill771_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill771_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill771_28)).doFinal(((byte[])(__sourceSpill771_27)));
        java.lang.String __sourceSpill771_33 = ((java.lang.String)(moom.bS.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill771_34 = local0_life18;
        int __sourceSpill771_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill771_34)[__sourceSpill771_35] = __sourceSpill771_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    FLOAT = ((moom.bS)(new moom.bS((local0_life18)[2], 0)));
    FLOAT_ARRAY = ((moom.bS)(new moom.bS((local0_life18)[0], 1)));
    BOOL = ((moom.bS)(new moom.bS((local0_life18)[1], 2)));
    a = ((moom.bS[])(moom.bS.a()));
}


public static moom.bS[] values() {
return ((moom.bS[])(((moom.bS[])(moom.bS.a)).clone()));
}


public static moom.bS valueOf(java.lang.String p0) {
return ((moom.bS)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bS.class)), ((java.lang.String)(p0)))));
}


public static java.lang.String[] b() {
return moom.bS.b;
}


public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
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
        byte[] spill3515_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3515_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3515_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3515_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3515_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3515_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.bS[] a() {
return new moom.bS[] {moom.bS.FLOAT, moom.bS.FLOAT_ARRAY, moom.bS.BOOL};
}

}
