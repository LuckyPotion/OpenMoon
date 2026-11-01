package moom;


public class NM {

private static final java.util.Map<java.lang.Class, java.lang.Integer> a;

private static final java.util.Map<java.lang.String, java.lang.Integer> b;

private static final java.util.Map<java.lang.String, java.lang.Class> c;

private static final long d;

public NM() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(2069057544787906125L)), ((long)(4993443500670004732L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(182984509932408L)))));
    long local15_life6 = (moom.NM.d ^ 14269480077160L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill725_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill725_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill725_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill725_13 = new byte[8];
    (__sourceSpill725_13)[0] = ((byte) ((int) (local15_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill725_13)[local8_life14] = ((byte) ((int) ((local15_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation725_15 = __sourceSpill725_13;
    ((javax.crypto.Cipher)(__sourceSpill725_10)).init(((int)(__sourceSpill725_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill725_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation725_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local6_life18 = new java.lang.String[9];
    int local12_life19 = 0;
    java.lang.String local11_life20;
    int local13_life22 = ((java.lang.String)((local11_life20 = "ªYïN\020aÅB\bªYïN\020aÅB\030Þí²kâ\000Ë5n\f¡6öÌdùõö}Õ=¹n\020p£ô«CL\034]:\001\026\b3\0330¥÷Y\024F\020Rþ\177óº¨PÙ\"IV?¬\023e\030Þí²kâ\000Ë5n\f¡6öÌdùõö}Õ=¹n"))).length();
    int local10_life23 = 8;
    int local9_life24 = -1;
    while (true) {
        local9_life24 += 1;
        byte[] __sourceSpill725_27 = ((java.lang.String)(((java.lang.String)(local11_life20)).substring(((int)(local9_life24)), ((int)((local9_life24 + local10_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill725_28 = local7_life8;
        byte[] local14_life30 = ((javax.crypto.Cipher)(__sourceSpill725_28)).doFinal(((byte[])(__sourceSpill725_27)));
        java.lang.String __sourceSpill725_33 = ((java.lang.String)(moom.NM.a(((byte[])(local14_life30))))).intern();
        java.lang.String[] __sourceSpill725_34 = local6_life18;
        int __sourceSpill725_35 = local12_life19;
        local12_life19 += 1;
        (__sourceSpill725_34)[__sourceSpill725_35] = __sourceSpill725_33;
        if (!(((local9_life24 = (local9_life24 + local10_life23)) < local13_life22))) { break; }
        local10_life23 = ((java.lang.String)(local11_life20)).charAt(((int)(local9_life24)));
    }
    local13_life22 = ((java.lang.String)((local11_life20 = "3\0330¥÷Y\024F Þí²kâ\000Ë5n\f¡6öÌd'Bõg¾0Ø²©aëçñß]"))).length();
    local10_life23 = 8;
    local9_life24 = -1;
    while (true) {
        local9_life24 += 1;
        byte[] __sourceSpill725_40 = ((java.lang.String)(((java.lang.String)(local11_life20)).substring(((int)(local9_life24)), ((int)((local9_life24 + local10_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill725_41 = local7_life8;
        byte[] local14_life43 = ((javax.crypto.Cipher)(__sourceSpill725_41)).doFinal(((byte[])(__sourceSpill725_40)));
        java.lang.String __sourceSpill725_46 = ((java.lang.String)(moom.NM.a(((byte[])(local14_life43))))).intern();
        java.lang.String[] __sourceSpill725_47 = local6_life18;
        int __sourceSpill725_48 = local12_life19;
        local12_life19 += 1;
        (__sourceSpill725_47)[__sourceSpill725_48] = __sourceSpill725_46;
        if (!(((local9_life24 = (local9_life24 + local10_life23)) < local13_life22))) { break; }
        local10_life23 = ((java.lang.String)(local11_life20)).charAt(((int)(local9_life24)));
    }
    javax.crypto.Cipher local1_life51;
    javax.crypto.Cipher __sourceSpill725_53 = (local1_life51 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill725_54 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill725_55 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill725_56 = new byte[8];
    (__sourceSpill725_56)[0] = ((byte) ((int) (local15_life6 >>> 56)));
    int local2_life57 = 1;
    while ((local2_life57 < 8)) {
        (__sourceSpill725_56)[local2_life57] = ((byte) ((int) ((local15_life6 << (local2_life57 * 8)) >>> 56)));
        local2_life57 += 1;
    }
    byte[] __sourcePreallocation725_58 = __sourceSpill725_56;
    ((javax.crypto.Cipher)(__sourceSpill725_53)).init(((int)(__sourceSpill725_54)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill725_55)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation725_58)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life61 = -8618241174083411042L;
    byte[] __sourceSpill725_62 = new byte[8];
    (__sourceSpill725_62)[0] = ((byte) ((int) (local3_life61 >>> 56)));
    (__sourceSpill725_62)[1] = ((byte) ((int) (local3_life61 >>> 48)));
    (__sourceSpill725_62)[2] = ((byte) ((int) (local3_life61 >>> 40)));
    (__sourceSpill725_62)[3] = ((byte) ((int) (local3_life61 >>> 32)));
    (__sourceSpill725_62)[4] = ((byte) ((int) (local3_life61 >>> 24)));
    (__sourceSpill725_62)[5] = ((byte) ((int) (local3_life61 >>> 16)));
    (__sourceSpill725_62)[6] = ((byte) ((int) (local3_life61 >>> 8)));
    (__sourceSpill725_62)[7] = ((byte) ((int) local3_life61));
    javax.crypto.Cipher __sourceSpill725_63 = local1_life51;
    byte[] local5_life65 = ((javax.crypto.Cipher)(__sourceSpill725_63)).doFinal(((byte[])(__sourceSpill725_62)));
    long local0_life66 = (((((((((((long) (local5_life65)[0]) & 255L) << 56) | ((((long) (local5_life65)[1]) & 255L) << 48)) | ((((long) (local5_life65)[2]) & 255L) << 40)) | ((((long) (local5_life65)[3]) & 255L) << 32)) | ((((long) (local5_life65)[4]) & 255L) << 24)) | ((((long) (local5_life65)[5]) & 255L) << 16)) | ((((long) (local5_life65)[6]) & 255L) << 8)) | (((long) (local5_life65)[7]) & 255L));
    a = ((java.util.Map)(new java.util.HashMap()));
    b = ((java.util.Map)(new java.util.HashMap()));
    c = ((java.util.Map)(new java.util.HashMap()));
    int local17_life70 = 0;
    while ((local17_life70 < ((int) local0_life66))) {
        java.lang.Class local18_life72 = net.minecraft.entity.EntityList.a(((int)(local17_life70)));
        if ((local18_life72 != null)) {
        java.lang.String local19_life74 = net.minecraft.entity.EntityList.a__String(((int)(local17_life70)));
        if ((local19_life74 != null)) {
        if (((java.util.Map)(moom.NM.a)).containsKey(((java.lang.Object)(local18_life72)))) {
        java.lang.Class __sourceSpill725_79 = local18_life72;
        java.lang.Object __sourceSpill725_80 = ((java.util.Map)(moom.NM.a)).get(((java.lang.Object)(local18_life72)));
        int local20_life81 = local17_life70;
        java.lang.Object local21_life82 = __sourceSpill725_80;
        java.lang.Class local22_life83 = __sourceSpill725_79;
        moom.BU.c(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite725_84((local6_life18)[8], local22_life83, (local6_life18)[7], local21_life82, (local6_life18)[0], local20_life81))));
    }
        if (((java.util.Map)(moom.NM.b)).containsKey(((java.lang.Object)(local19_life74)))) {
        java.lang.String __sourceSpill725_90 = local19_life74;
        java.lang.Object __sourceSpill725_91 = ((java.util.Map)(moom.NM.b)).get(((java.lang.Object)(local19_life74)));
        int local23_life92 = local17_life70;
        java.lang.Object local24_life93 = __sourceSpill725_91;
        java.lang.String local25_life94 = __sourceSpill725_90;
        moom.BU.c(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite725_95((local6_life18)[2], local25_life94, (local6_life18)[4], local24_life93, (local6_life18)[1], local23_life92))));
    }
        if (((java.util.Map)(moom.NM.c)).containsKey(((java.lang.Object)(local19_life74)))) {
        java.lang.String __sourceSpill725_101 = local19_life74;
        java.lang.Object __sourceSpill725_102 = ((java.util.Map)(moom.NM.c)).get(((java.lang.Object)(local19_life74)));
        java.lang.Class local26_life103 = local18_life72;
        java.lang.Object local27_life104 = __sourceSpill725_102;
        java.lang.String local28_life105 = __sourceSpill725_101;
        moom.BU.c(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite725_106((local6_life18)[6], local28_life105, (local6_life18)[3], local27_life104, (local6_life18)[5], local26_life103))));
    }
        ((java.util.Map)(moom.NM.a)).put(((java.lang.Object)(local18_life72)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local17_life70))))));
        ((java.util.Map)(moom.NM.b)).put(((java.lang.Object)(local19_life74)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local17_life70))))));
        ((java.util.Map)(moom.NM.c)).put(((java.lang.Object)(local19_life74)), ((java.lang.Object)(local18_life72)));
    }
    }
        local17_life70 += 1;
    }
}


public static java.lang.Class a__Class(java.lang.String p0) {
return ((java.lang.Class)(((java.util.Map)(moom.NM.c)).get(((java.lang.Object)(p0)))));
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
        byte[] spill3323_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3323_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3323_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3323_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3323_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3323_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static int a(java.lang.String p0) {
java.lang.Integer forwardValue2809_18_0;
    int forwardValue2809_19_0;
    int spill2809_0;
    java.lang.Integer spill2809_1;
    long life1_3;
    java.lang.Integer life4_9;
    int life3_10;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.NM.d ^ 2016855970041L);
    spill2809_0 = moom.Ob.b();
    life4_9 = ((java.lang.Integer)(((java.util.Map)(moom.NM.b)).get(((java.lang.Object)(p0)))));
    life3_10 = spill2809_0;
    spill2809_1 = life4_9;
    if (!((life3_10 == 0))) {
        forwardValue2809_18_0 = spill2809_1;
        break forward_join_18;
    }
    if (!((spill2809_1 == null))) {
        break forward_join_17;
    }
    forwardValue2809_19_0 = -1;
    break forward_join_19;
    }
    forwardValue2809_18_0 = life4_9;
    }
    forwardValue2809_19_0 = ((java.lang.Integer)(forwardValue2809_18_0)).intValue();
    }
    return forwardValue2809_19_0;
}


public static int a(java.lang.Class p0) {
java.lang.Integer forwardValue2808_18_0;
    int forwardValue2808_19_0;
    int spill2808_0;
    java.lang.Integer spill2808_1;
    long life1_3;
    java.lang.Integer life4_9;
    int life3_10;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.NM.d ^ 93031034769764L);
    spill2808_0 = moom.Ob.c();
    life4_9 = ((java.lang.Integer)(((java.util.Map)(moom.NM.a)).get(((java.lang.Object)(p0)))));
    life3_10 = spill2808_0;
    spill2808_1 = life4_9;
    if (!((life3_10 != 0))) {
        forwardValue2808_18_0 = spill2808_1;
        break forward_join_18;
    }
    if (!((spill2808_1 == null))) {
        break forward_join_17;
    }
    forwardValue2808_19_0 = -1;
    break forward_join_19;
    }
    forwardValue2808_18_0 = life4_9;
    }
    forwardValue2808_19_0 = ((java.lang.Integer)(forwardValue2808_18_0)).intValue();
    }
    return forwardValue2808_19_0;
}


public static int a(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue2810_13_0;
    int forwardValue2810_15_0;
    net.minecraft.entity.Entity spill2810_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.NM.d ^ 72680094706557L);
    life3_5 = moom.Ob.c();
    spill2810_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue2810_13_0 = spill2810_0;
        break forward_join_13;
    }
    if (!((spill2810_0 == null))) {
        break forward_join_12;
    }
    forwardValue2810_15_0 = -1;
    break forward_join_15;
    }
    forwardValue2810_13_0 = p0;
    }
    forwardValue2810_15_0 = moom.NM.a(((java.lang.Class)(((java.lang.Object)(forwardValue2810_13_0)).getClass())));
    }
    return forwardValue2810_15_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite725_84(java.lang.String a0, java.lang.Class a1, java.lang.String a2, java.lang.Object a3, java.lang.String a4, int a5) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite725_95(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.Object a3, java.lang.String a4, int a5) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite725_106(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.Object a3, java.lang.String a4, java.lang.Class a5) throws E;
}
