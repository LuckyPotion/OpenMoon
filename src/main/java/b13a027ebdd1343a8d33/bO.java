package moom;


public class bO extends sourcebuild.EnumConstructor<moom.bO> {

public static moom.bO CLEAR;

public static moom.bO RAIN;

public static moom.bO THUNDER;

private static moom.bO[] a;

private static long b;

private bO(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-7646245286187921000L)), ((long)(8191314529125179145L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(98342696894895L)))));
    long local9_life6 = (moom.bO.b ^ 9359596549823L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill767_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill767_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill767_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill767_13 = new byte[8];
    (__sourceSpill767_13)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill767_13)[local2_life14] = ((byte) ((int) ((local9_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation767_15 = __sourceSpill767_13;
    ((javax.crypto.Cipher)(__sourceSpill767_10)).init(((int)(__sourceSpill767_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill767_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation767_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local0_life18 = new java.lang.String[3];
    int local6_life19 = 0;
    java.lang.String local5_life20;
    int local7_life22 = ((java.lang.String)((local5_life20 = "ÅÁT8ÄMn\bÎÀ\025\026ú´\r\bØ´$ì "))).length();
    int local4_life23 = 8;
    int local3_life24 = -1;
    while (true) {
        local3_life24 += 1;
        byte[] __sourceSpill767_27 = ((java.lang.String)(((java.lang.String)(local5_life20)).substring(((int)(local3_life24)), ((int)((local3_life24 + local4_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill767_28 = local1_life8;
        byte[] local8_life30 = ((javax.crypto.Cipher)(__sourceSpill767_28)).doFinal(((byte[])(__sourceSpill767_27)));
        java.lang.String __sourceSpill767_33 = ((java.lang.String)(moom.bO.a(((byte[])(local8_life30))))).intern();
        java.lang.String[] __sourceSpill767_34 = local0_life18;
        int __sourceSpill767_35 = local6_life19;
        local6_life19 += 1;
        (__sourceSpill767_34)[__sourceSpill767_35] = __sourceSpill767_33;
        if (!(((local3_life24 = (local3_life24 + local4_life23)) < local7_life22))) { break; }
        local4_life23 = ((java.lang.String)(local5_life20)).charAt(((int)(local3_life24)));
    }
    CLEAR = ((moom.bO)(new moom.bO((local0_life18)[2], 0)));
    RAIN = ((moom.bO)(new moom.bO((local0_life18)[0], 1)));
    THUNDER = ((moom.bO)(new moom.bO((local0_life18)[1], 2)));
    a = ((moom.bO[])(moom.bO.a()));
}


public static moom.bO[] values() {
return ((moom.bO[])(((moom.bO[])(moom.bO.a)).clone()));
}


public static moom.bO valueOf(java.lang.String p0) {
return ((moom.bO)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bO.class)), ((java.lang.String)(p0)))));
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
        byte[] spill3504_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3504_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3504_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3504_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3504_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3504_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.bO[] a() {
return new moom.bO[] {moom.bO.CLEAR, moom.bO.RAIN, moom.bO.THUNDER};
}


public static moom.bO a(net.minecraft.world.World p0, float p1) {
float forwardValue2958_21_0;
    moom.bO forwardValue2958_29_0;
    int spill2958_0;
    float spill2958_1;
    long life2_3;
    float life5_8;
    int life4_9;
    float life6_26;
    forward_join_29: {
    forward_join_28: {
    forward_join_21: {
    forward_join_18: {
    life2_3 = (moom.bO.b ^ 19341402034603L);
    spill2958_0 = moom.J_.c();
    life5_8 = ((net.minecraft.world.World)(p0)).e(((float)(p1)));
    life4_9 = spill2958_0;
    spill2958_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue2958_21_0 = spill2958_1;
        break forward_join_21;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill2958_1)), ((float)(0x1.0p-1f))) > 0))) {
        break forward_join_18;
    }
    return moom.bO.THUNDER;
    }
    forwardValue2958_21_0 = ((net.minecraft.world.World)(p0)).f(((float)(p1)));
    }
    life6_26 = forwardValue2958_21_0;
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life6_26)), ((float)(0x1.0p-1f))) > 0))) {
        break forward_join_28;
    }
    forwardValue2958_29_0 = moom.bO.RAIN;
    break forward_join_29;
    }
    forwardValue2958_29_0 = moom.bO.CLEAR;
    }
    return forwardValue2958_29_0;
}

}
