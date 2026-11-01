package com.moon.module.impl;


public class Reach extends com.moon.module.Module {

private com.moon.setting.FloatSetting s;

private com.moon.setting.FloatSetting t;

public com.moon.setting.BooleanSetting u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

private static long z;

public Reach(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_76261d0a24b9de82(com.moon.module.impl.Reach receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Reach.v ^ 107797467784439L);

    com.moon.module.impl.Reach.__sourceConstructorInit_76261d0a24b9de82_0(((com.moon.module.impl.Reach)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Reach)(receiver)).s = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_2(1886, (2661095371929428694L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_4(24611, (8091058858448668074L ^ local5)))), ((float)(0x1.8p1f)), ((float)(0x1.8p1f)), ((float)(0x1.8p2f)), ((float)(0x1.99999ap-5f))))).a()));

    ((com.moon.module.impl.Reach)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_8(5051, (6861097155134567984L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_10(9427, (8474657221310021982L ^ local5)))), ((float)(0x1.8p1f)), ((float)(0x1.8p1f)), ((float)(0x1.8p2f)), ((float)(0x1.99999ap-5f))))).a(((com.moon.kR)(__sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_12(receiver)))))).a()));

    ((com.moon.module.impl.Reach)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_16(13773, (5078763091830476865L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_18(15165, (4198180575009513143L ^ local5)))), ((boolean)(false))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_76261d0a24b9de82_0(com.moon.module.impl.Reach a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
v = ((long)(((moom._a)(moom._c.a(((long)(191419098667534064L)), ((long)(7372464118030543548L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(33936220336353L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.module.impl.Reach.v ^ 107000801725466L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill284_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill284_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill284_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill284_14 = new byte[8];
    (__sourceSpill284_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill284_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation284_16 = __sourceSpill284_14;
    ((javax.crypto.Cipher)(__sourceSpill284_11)).init(((int)(__sourceSpill284_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill284_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation284_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[6];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "uO?\032Ø+Ð\f\016Y\tFJìPVh\034ÿ¯Ðæ¶3âjll\030®µ\\\"±ºÐ\"2å·Ø&ºêÉ\037Ë4¢\022(RåëÐ\007Çµ\034¡½\003{ñ|ÄR®ä°0\fmû\025cû[\036\r*¿°ì N\r6â\027Ýób%¹)\002\037Æ3I\007Z coi×Á\027Ô¡\017Bã"))).length();
    int local10_life24 = 32;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill284_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill284_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill284_29)).doFinal(((byte[])(__sourceSpill284_28)));
        java.lang.String __sourceSpill284_34 = ((java.lang.String)(com.moon.module.impl.Reach.c(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill284_35 = local14_life19;
        int __sourceSpill284_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill284_35)[__sourceSpill284_36] = __sourceSpill284_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = ";°­2¦o\0077±/çsþ/óvT©÷Ù£å¢2]Ge\002\035åé\003íñ\002 `ÞÈhê>¶!n­÷Ç¾Ï»<øs£ZïÇß\027µ\032¢KÑ?"))).length();
    local10_life24 = 40;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill284_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill284_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill284_42)).doFinal(((byte[])(__sourceSpill284_41)));
        java.lang.String __sourceSpill284_47 = ((java.lang.String)(com.moon.module.impl.Reach.c(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill284_48 = local14_life19;
        int __sourceSpill284_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill284_48)[__sourceSpill284_49] = __sourceSpill284_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    w = ((java.lang.String[])(local14_life19));
    x = ((java.lang.String[])(new java.lang.String[6]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill284_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill284_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill284_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill284_59 = new byte[8];
    (__sourceSpill284_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill284_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation284_61 = __sourceSpill284_59;
    ((javax.crypto.Cipher)(__sourceSpill284_56)).init(((int)(__sourceSpill284_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill284_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation284_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 2727430211190248829L;
    byte[] __sourceSpill284_65 = new byte[8];
    (__sourceSpill284_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill284_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill284_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill284_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill284_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill284_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill284_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill284_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill284_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill284_66)).doFinal(((byte[])(__sourceSpill284_65)));
    z = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2603_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1177_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1177_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1177_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1177_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1177_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1177_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19769);
    if (((com.moon.module.impl.Reach.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Reach.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Reach.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lc", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Reach.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Reach.x)[life5_8] = com.moon.module.impl.Reach.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Reach.x)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Reach.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.eD p0) {
com.moon.eD forwardValue905_42_0;
    com.moon.eD spill905_0;
    com.moon.eD spill905_1;
    long life2_3;
    int life4_5;
    forward_join_43: {
    forward_join_42: {
    forward_join_28: {
    life2_3 = (com.moon.module.impl.Reach.v ^ 71782179761749L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    if (!((life4_5 != 0))) {
        break forward_join_43;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue())) {
        break forward_join_28;
    }
    spill905_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue905_42_0 = spill905_0;
        break forward_join_42;
    }
    if (!((((com.moon.eD)(spill905_0)).a__r3() != null))) {
        break forward_join_28;
    }
    spill905_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue905_42_0 = spill905_1;
        break forward_join_42;
    }
    if (!((((net.minecraft.entity.Entity)(((com.moon.eD)(spill905_1)).a__r3())).U >= ((int) com.moon.module.impl.Reach.z)))) {
        break forward_join_28;
    }
    return;
    }
    forwardValue905_42_0 = ((com.moon.eD)(p0)).a(((double)(((double) com.moon.nI.a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.t)).getValue())))).floatValue())))))));
    }
    recovery.source.CarrierOps.discard(forwardValue905_42_0);
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
((com.moon.setting.FloatSetting)(this.t)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)(java.lang.Math.max(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.t)).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())))))))));
    return;
}


private void lambda$new$0(java.lang.Float p0, java.lang.Float p1) {
long local3 = (com.moon.module.impl.Reach.v ^ 135779450943891L);
    if ((((java.lang.Float)(p1)).floatValue() < ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())) {
        ((com.moon.setting.FloatSetting)(this.s)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)((((java.lang.Float)(p1)).floatValue() - ((com.moon.setting.FloatSetting)(this.s)).getStep())))))));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_10(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_12(com.moon.module.impl.Reach a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_76261d0a24b9de82_originalDynamicSite1280_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2603_0() throws E;
}
