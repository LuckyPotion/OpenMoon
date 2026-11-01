package moom;


public class bV extends sourcebuild.EnumConstructor<moom.bV> {

public static moom.bV NONE;

public static moom.bV SHADOW;

public static moom.bV GBUFFERS;

public static moom.bV DEFERRED;

public static moom.bV COMPOSITE;

private java.lang.String a;

private static moom.bV[] b;

private bV(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(5820282344533875109L)), ((long)(5092948168529517973L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(273006194251853L))) ^ 13744594860605L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill929_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill929_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill929_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill929_11 = new byte[8];
    (__sourceSpill929_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill929_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation929_13 = __sourceSpill929_11;
    ((javax.crypto.Cipher)(__sourceSpill929_8)).init(((int)(__sourceSpill929_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill929_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation929_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[9];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "Ó\r\020DWó\020î^\\c\r\0203²{À}\tSÊ\bY\020+\006Éáa{\020Î5!->C4©iA¼\020¢¡\006£®Õ \023Óo\rß$\fhx\b¶Åù¹°à\020\025ku\025öô\003éëÃ\032R\006ùî "))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill929_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill929_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill929_26)).doFinal(((byte[])(__sourceSpill929_25)));
        java.lang.String __sourceSpill929_31 = ((java.lang.String)(moom.bV.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill929_32 = local0_life16;
        int __sourceSpill929_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill929_32)[__sourceSpill929_33] = __sourceSpill929_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    local7_life20 = ((java.lang.String)((local5_life18 = "Ã6P\031Ö«ÙÍëyò)2}y2\020\177\036K\031ûU­\f ÖÙO#"))).length();
    local4_life21 = 16;
    local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill929_39 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill929_40 = local1_life6;
        byte[] local8_life42 = ((javax.crypto.Cipher)(__sourceSpill929_40)).doFinal(((byte[])(__sourceSpill929_39)));
        java.lang.String __sourceSpill929_45 = ((java.lang.String)(moom.bV.a(((byte[])(local8_life42))))).intern();
        java.lang.String[] __sourceSpill929_46 = local0_life16;
        int __sourceSpill929_47 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill929_46)[__sourceSpill929_47] = __sourceSpill929_45;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    NONE = ((moom.bV)(new moom.bV((local0_life16)[2], 0, "")));
    SHADOW = ((moom.bV)(new moom.bV((local0_life16)[0], 1, (local0_life16)[5])));
    GBUFFERS = ((moom.bV)(new moom.bV((local0_life16)[3], 2, (local0_life16)[8])));
    DEFERRED = ((moom.bV)(new moom.bV((local0_life16)[4], 3, (local0_life16)[6])));
    COMPOSITE = ((moom.bV)(new moom.bV((local0_life16)[7], 4, (local0_life16)[1])));
    b = ((moom.bV[])(moom.bV.a__ArraybV()));
}


public static moom.bV[] values() {
return ((moom.bV[])(((moom.bV[])(moom.bV.b)).clone()));
}


public static moom.bV valueOf(java.lang.String p0) {
return ((moom.bV)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bV.class)), ((java.lang.String)(p0)))));
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
        byte[] spill3526_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3526_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3526_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3526_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3526_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3526_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.bV[] a__ArraybV() {
return new moom.bV[] {moom.bV.NONE, moom.bV.SHADOW, moom.bV.GBUFFERS, moom.bV.DEFERRED, moom.bV.COMPOSITE};
}


public java.lang.String a() {
return this.a;
}

}
