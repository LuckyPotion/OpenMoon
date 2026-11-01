package com.moon.event;


public class MovePhase extends sourcebuild.EnumConstructor<com.moon.event.MovePhase> {

public static com.moon.event.MovePhase PRE;

public static com.moon.event.MovePhase POST;

public static com.moon.event.MovePhase BEFORE;

private static com.moon.event.MovePhase[] a;

private MovePhase(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
long local9_life4 = (((moom._a)(moom._c.a(((long)(-7689516016649626643L)), ((long)(-8469607877938755635L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(118960534323340L))) ^ 34198465411840L);
    javax.crypto.Cipher local1_life6;
    javax.crypto.Cipher __sourceSpill84_8 = (local1_life6 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill84_9 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill84_10 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill84_11 = new byte[8];
    (__sourceSpill84_11)[0] = ((byte) ((int) (local9_life4 >>> 56)));
    int local2_life12 = 1;
    while ((local2_life12 < 8)) {
        (__sourceSpill84_11)[local2_life12] = ((byte) ((int) ((local9_life4 << (local2_life12 * 8)) >>> 56)));
        local2_life12 += 1;
    }
    byte[] __sourcePreallocation84_13 = __sourceSpill84_11;
    ((javax.crypto.Cipher)(__sourceSpill84_8)).init(((int)(__sourceSpill84_9)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill84_10)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation84_13)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life16 = new java.lang.String[3];
    int local6_life17 = 0;
    java.lang.String local5_life18;
    int local7_life20 = ((java.lang.String)((local5_life18 = "Y=@\024ËZ¸]\b\0132\017QwÀ\bí!zþE\006·)"))).length();
    int local4_life21 = 8;
    int local3_life22 = -1;
    while (true) {
        local3_life22 += 1;
        byte[] __sourceSpill84_25 = ((java.lang.String)(((java.lang.String)(local5_life18)).substring(((int)(local3_life22)), ((int)((local3_life22 + local4_life21)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill84_26 = local1_life6;
        byte[] local8_life28 = ((javax.crypto.Cipher)(__sourceSpill84_26)).doFinal(((byte[])(__sourceSpill84_25)));
        java.lang.String __sourceSpill84_31 = ((java.lang.String)(com.moon.event.MovePhase.a(((byte[])(local8_life28))))).intern();
        java.lang.String[] __sourceSpill84_32 = local0_life16;
        int __sourceSpill84_33 = local6_life17;
        local6_life17 += 1;
        (__sourceSpill84_32)[__sourceSpill84_33] = __sourceSpill84_31;
        if (!(((local3_life22 = (local3_life22 + local4_life21)) < local7_life20))) { break; }
        local4_life21 = ((java.lang.String)(local5_life18)).charAt(((int)(local3_life22)));
    }
    PRE = ((com.moon.event.MovePhase)(new com.moon.event.MovePhase((local0_life16)[0], 0)));
    POST = ((com.moon.event.MovePhase)(new com.moon.event.MovePhase((local0_life16)[2], 1)));
    BEFORE = ((com.moon.event.MovePhase)(new com.moon.event.MovePhase((local0_life16)[1], 2)));
    a = ((com.moon.event.MovePhase[])(com.moon.event.MovePhase.a()));
}


public static com.moon.event.MovePhase[] values() {
return ((com.moon.event.MovePhase[])(((com.moon.event.MovePhase[])(com.moon.event.MovePhase.a)).clone()));
}


public static com.moon.event.MovePhase valueOf(java.lang.String p0) {
return ((com.moon.event.MovePhase)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.event.MovePhase.class)), ((java.lang.String)(p0)))));
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
        byte[] spill205_0 = p0;
        life4_9 += 1;
        life5_44 = (spill205_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill205_1 = p0;
        life4_9 += 1;
        life5_76 = (spill205_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill205_2 = p0;
        life4_9 += 1;
        life5_91 = (spill205_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.event.MovePhase[] a() {
return new com.moon.event.MovePhase[] {com.moon.event.MovePhase.PRE, com.moon.event.MovePhase.POST, com.moon.event.MovePhase.BEFORE};
}

}
