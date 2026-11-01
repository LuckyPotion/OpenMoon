package com.moon;


public class ki extends com.moon.kd<moom.z9> {

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public ki(java.lang.Class<moom.z9> p0) {
super(p0);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-6047667761767310280L)), ((long)(-443327766175058423L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(206171537599415L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ki.c ^ 10768991649955L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill217_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill217_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill217_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill217_14 = new byte[8];
    (__sourceSpill217_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill217_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation217_16 = __sourceSpill217_14;
    ((javax.crypto.Cipher)(__sourceSpill217_11)).init(((int)(__sourceSpill217_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill217_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation217_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[8];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "^ÑÂhñùõrÀ Îè´¡dÛ÷<¶\034\004¥¹QÎÿöÈ²À 0wUüUÂd&¸o¾Õïù´Wª½çfÞëq\\ÃZ!Ö Ç·ÂÐ]öÏ\006!ÞÐMCÜ×/tÄ1wó<sÂØ\"\030 \033ü}\004Å\032\bw%\003¡±j,):~Y_Åñ\030/\002ð\007ª\030\0057ZÝSàï;kÓ¢A&åcí&´\023 \001PÄ<^\f:\007PËsùpì6\034¶QNàzòc¿Ts¿ü"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill217_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill217_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill217_29)).doFinal(((byte[])(__sourceSpill217_28)));
        java.lang.String __sourceSpill217_34 = ((java.lang.String)(com.moon.ki.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill217_35 = local9_life19;
        int __sourceSpill217_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill217_35)[__sourceSpill217_36] = __sourceSpill217_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "Íú$Ýõ?»\001åÓAc\016X\"æ÷²E\006C\024«Û âôYcA@¥öÁèÁ¿/\035>Ö~¼ Ú­T¢b=\036ÖÆÚ"))).length();
    local5_life24 = 32;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill217_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill217_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill217_42)).doFinal(((byte[])(__sourceSpill217_41)));
        java.lang.String __sourceSpill217_47 = ((java.lang.String)(com.moon.ki.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill217_48 = local9_life19;
        int __sourceSpill217_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill217_48)[__sourceSpill217_49] = __sourceSpill217_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[8]));
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
        byte[] spill636_0 = p0;
        life4_9 += 1;
        life5_44 = (spill636_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill636_1 = p0;
        life4_9 += 1;
        life5_76 = (spill636_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill636_2 = p0;
        life4_9 += 1;
        life5_91 = (spill636_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 951);
    if (((com.moon.ki.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ki.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ki.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ki", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.ki.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ki.e)[life5_8] = __sourceExactCall_583eba36c0c2c4(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ki.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_3b685060ea9596(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2053_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ki"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(org.luaj.vm2.LuaTable p0, moom.z9 p1) {
long life3_3;
    double life6_8;
    double life8_13;
    double life10_18;
    float life12_27;
    float life13_36;
    float life14_45;
    float life15_54;
    java.lang.String life5_71;
    life3_3 = (com.moon.ki.c ^ 120717724000521L);
    life6_8 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("x"))))).todouble();
    life8_13 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("y"))))).todouble();
    life10_18 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)("z"))))).todouble();
    life12_27 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_3c38612d37e6_invokedynamic635_7(5960, (8031546934530739809L ^ life3_3))))))).tofloat();
    life13_36 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_3c38612d37e6_invokedynamic635_10(17340, (7932652057593731735L ^ life3_3))))))).tofloat();
    life14_45 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_3c38612d37e6_invokedynamic635_13(24472, (619772694853404340L ^ life3_3))))))).tofloat();
    life15_54 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(p0)).get(((java.lang.String)(__sourceIntrinsic_3c38612d37e6_invokedynamic635_16(25086, (2210438626516433108L ^ life3_3))))))).tofloat();
    ((moom.z9)(p1)).a(((double)(life6_8)));
    ((moom.z9)(p1)).b(((double)(life8_13)));
    ((moom.z9)(p1)).c(((double)(life10_18)));
    java.lang.String spill635_0 = moom.cT.c__String();
    ((moom.z9)(p1)).a(((float)(life12_27)));
    ((moom.z9)(p1)).b(((float)(life13_36)));
    life5_71 = spill635_0;
    ((moom.z9)(p1)).c(((float)(life14_45)));
    ((moom.z9)(p1)).d(((float)(life15_54)));
    if ((life5_71 != null)) {
        __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public void a__sourceBridge_bab6a6134e(org.luaj.vm2.LuaTable p0, moom.yK p1) {
((com.moon.ki)(this)).a(((org.luaj.vm2.LuaTable)(p0)), ((moom.z9)(((moom.z9)(p1)))));
}


public org.luaj.vm2.LuaTable a__sourceBridge_39790ff3c2(moom.yK p0) {
return ((com.moon.ki)(this)).a(((moom.z9)(((moom.z9)(p0)))));
}


public org.luaj.vm2.LuaTable a(moom.z9 p0) {
org.luaj.vm2.LuaTable forestValue100022_77_0;
    java.lang.String spill100022_0;
    org.luaj.vm2.LuaTable spill100022_1;
    long life2_3;
    org.luaj.vm2.LuaTable life5_7;
    java.lang.String life4_27;
    forest_join_77: {
    life2_3 = (com.moon.ki.c ^ 106705902589402L);
    life5_7 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)("x")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.z9)(p0)).a()))))));
    spill100022_0 = moom.cT.c__String();
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)("y")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.z9)(p0)).b()))))));
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)("z")), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((moom.z9)(p0)).c()))))));
    life4_27 = spill100022_0;
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)(__sourceIntrinsic_e8622e9b3781_invokedynamic100022_11(23701, (8211964977512001899L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.z9)(p0)).d())))))));
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)(__sourceIntrinsic_e8622e9b3781_invokedynamic100022_15(13270, (577380298846527021L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.z9)(p0)).a__Float())))))));
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)(__sourceIntrinsic_e8622e9b3781_invokedynamic100022_19(18212, (4099337053083445977L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.z9)(p0)).b__Float())))))));
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)(__sourceIntrinsic_e8622e9b3781_invokedynamic100022_23(32652, (3244890039432122992L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.z9)(p0)).c__Float())))))));
    spill100022_1 = life5_7;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forestValue100022_77_0 = spill100022_1;
        break forest_join_77;
    }
    __sourceExactCall_bc9945e5814d8c(((java.lang.String)("EwAl6b")));
    forestValue100022_77_0 = spill100022_1;
    }
    return forestValue100022_77_0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2053_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e8622e9b3781_invokedynamic100022_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e8622e9b3781_invokedynamic100022_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e8622e9b3781_invokedynamic100022_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e8622e9b3781_invokedynamic100022_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3c38612d37e6_invokedynamic635_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3c38612d37e6_invokedynamic635_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3c38612d37e6_invokedynamic635_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3c38612d37e6_invokedynamic635_16(int a0, long a1) throws E;



private static native java.lang.String __sourceExactCall_583eba36c0c2c4(byte[] p0);
private static native java.lang.String __sourceExactCall_3b685060ea9596(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native void __sourceExactCall_bc9945e5814d8c(java.lang.String p0);
}
