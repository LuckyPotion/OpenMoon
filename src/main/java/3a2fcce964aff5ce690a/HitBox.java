package com.moon.module.impl;


public class HitBox extends com.moon.module.Module {

private com.moon.setting.FloatSetting s;

public com.moon.setting.BooleanSetting t;

private static long u;

private static java.lang.String[] v;

private static java.lang.String[] w;

private static java.util.Map x;

public HitBox(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_f58dfab4a15f7d4a(com.moon.module.impl.HitBox receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.HitBox.u ^ 100642550560370L);

    com.moon.module.impl.HitBox.__sourceConstructorInit_f58dfab4a15f7d4a_0(((com.moon.module.impl.HitBox)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.HitBox)(receiver)).s = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_2(7779, (3054246920497973L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_4(26689, (5523594461623901462L ^ local5)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.47ae14p-7f))))).a()));

    ((com.moon.module.impl.HitBox)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_8(2933, (4995861737007889953L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_10(31430, (4966210713813176211L ^ local5)))), ((boolean)(true))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_f58dfab4a15f7d4a_0(com.moon.module.impl.HitBox a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
u = ((long)(((moom._a)(moom._c.a(((long)(3475794812803786059L)), ((long)(184773923165302593L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(43445430567656L)))));

    x = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.HitBox.u ^ 28345857596277L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill370_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill370_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill370_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill370_14 = new byte[8];

    (__sourceSpill370_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill370_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation370_16 = __sourceSpill370_14;

    ((javax.crypto.Cipher)(__sourceSpill370_11)).init(((int)(__sourceSpill370_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill370_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation370_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "zD3gxÄ_3sÀÍãNÔx¾£êã¨É¿\024\0062;pLa!Ú\fAF\n©\030áiñÅ÷;XÇ^ÁcéÓ÷Çv\025¢éð²3ë\""))).length();

    int local5_life24 = 40;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill370_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill370_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill370_29)).doFinal(((byte[])(__sourceSpill370_28)));

        java.lang.String __sourceSpill370_34 = ((java.lang.String)(com.moon.module.impl.HitBox.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill370_35 = local9_life19;

        int __sourceSpill370_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill370_35)[__sourceSpill370_36] = __sourceSpill370_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "º&r¸\022­¿ ¼Ì?ýÔ={¨<Á¾Pq\006\025Ò\026I\030L·\031¦á;m$On8\rnô»d«Q\033Øô% "))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill370_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill370_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill370_43)).doFinal(((byte[])(__sourceSpill370_42)));

        java.lang.String __sourceSpill370_48 = ((java.lang.String)(com.moon.module.impl.HitBox.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill370_49 = local9_life19;

        int __sourceSpill370_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill370_49)[__sourceSpill370_50] = __sourceSpill370_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    v = ((java.lang.String[])(local9_life19));

    w = ((java.lang.String[])(new java.lang.String[4]));
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
        byte[] spill1120_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1120_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1120_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1120_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1120_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1120_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26898);
    if (((com.moon.module.impl.HitBox.w)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.HitBox.x)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.HitBox.x)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/la", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.HitBox.v)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.HitBox.w)[life5_8] = com.moon.module.impl.HitBox.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.HitBox.w)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.HitBox.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2517_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/la"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.es p0) {
((com.moon.es)(p0)).a(((float)((((com.moon.es)(p0)).a() + ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue()))));
    return;
}


public void a(com.moon.event.PacketEvent p0) {
com.moon.event.PacketEvent forwardValue859_12_0;
    moom.yK forwardValue859_20_0;
    moom.y6 forwardValue859_54_0;
    com.moon.event.PacketEvent spill859_0;
    moom.yK spill859_1;
    moom.y6 spill859_2;
    long life2_3;
    int life4_5;
    moom.yK life6_19;
    moom.y6 life5_33;
    forward_join_62: {
    forward_join_54: {
    forward_join_35: {
    forward_join_34: {
    forward_join_20: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.HitBox.u ^ 130885832974802L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill859_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue859_12_0 = spill859_0;
        break forward_join_12;
    }
    if (!(((com.moon.event.PacketEvent)(spill859_0)).b__sourceReturn_aae029aa0a())) {
        break forward_join_62;
    }
    forwardValue859_12_0 = p0;
    }
    life6_19 = ((com.moon.event.PacketEvent)(forwardValue859_12_0)).getPacket();
    spill859_1 = life6_19;
    if (!((life4_5 != 0))) {
        forwardValue859_20_0 = spill859_1;
        break forward_join_20;
    }
    if (!((((spill859_1 instanceof moom.y6) ? 1 : 0) != 0))) {
        break forward_join_62;
    }
    forwardValue859_20_0 = life6_19;
    }
    life5_33 = ((moom.y6)(forwardValue859_20_0));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue())) {
        break forward_join_34;
    }
    spill859_2 = life5_33;
    if (!((life4_5 != 0))) {
        forwardValue859_54_0 = spill859_2;
        break forward_join_54;
    }
    if (!((((moom.y6)(spill859_2)).b__bc() != net.minecraft.network.play.client.C02PacketUseEntity$Action.INTERACT_AT))) {
        break forward_join_35;
    }
    }
    return;
    }
    ((moom.DR)(((moom.y6)(life5_33)).a__DR())).a = ((double)(moom.Dr.a(((double)(((moom.DR)(((moom.y6)(life5_33)).a__DR())).a)), ((double)(-0x1.99999ap-2d)), ((double)(0x1.99999ap-2d)))));
    ((moom.DR)(((moom.y6)(life5_33)).a__DR())).b = ((double)(moom.Dr.a(((double)(((moom.DR)(((moom.y6)(life5_33)).a__DR())).b)), ((double)(0x1.47ae14p-7d)), ((double)(0x1.e66666p0d)))));
    forwardValue859_54_0 = life5_33;
    }
    ((moom.DR)(((moom.y6)(forwardValue859_54_0)).a__DR())).c = ((double)(moom.Dr.a(((double)(((moom.DR)(((moom.y6)(life5_33)).a__DR())).c)), ((double)(-0x1.99999ap-2d)), ((double)(0x1.99999ap-2d)))));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f58dfab4a15f7d4a_originalDynamicSite1257_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2517_0() throws E;
}
