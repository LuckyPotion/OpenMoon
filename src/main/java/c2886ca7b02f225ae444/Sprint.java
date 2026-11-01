package com.moon.module.impl;


public class Sprint extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.moon.setting.BooleanSetting t;

private static long u;

private static java.lang.String[] v;

private static java.lang.String[] w;

private static java.util.Map x;

public Sprint(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_9809b124dec0f61c(com.moon.module.impl.Sprint receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Sprint.u ^ 35331273296278L);

    com.moon.module.impl.Sprint.__sourceConstructorInit_9809b124dec0f61c_0(((com.moon.module.impl.Sprint)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Sprint)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_2(16651, (4600424905413057621L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_4(23012, (5808081733185356985L ^ local5)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Sprint)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_8(11962, (3130234191970907110L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_10(6257, (4324793136882812206L ^ local5)))), ((boolean)(false))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_9809b124dec0f61c_0(com.moon.module.impl.Sprint a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
u = ((long)(((moom._a)(moom._c.a(((long)(7785406939967100936L)), ((long)(-1379044400293288436L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(191237032149162L)))));

    x = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.Sprint.u ^ 107233292153539L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill390_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill390_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill390_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill390_14 = new byte[8];

    (__sourceSpill390_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill390_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation390_16 = __sourceSpill390_14;

    ((javax.crypto.Cipher)(__sourceSpill390_11)).init(((int)(__sourceSpill390_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill390_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation390_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "Û\002ØNU¬¼£ü¥YYnsnM¯tm;@Ä9§b'ëY9D%pÌ\031^¿U]Sh(ê\030Q1q|î¹à\bÔÖP¸³¨H@Z5Ësò"))).length();

    int local5_life24 = 48;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill390_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill390_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill390_29)).doFinal(((byte[])(__sourceSpill390_28)));

        java.lang.String __sourceSpill390_34 = ((java.lang.String)(com.moon.module.impl.Sprint.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill390_35 = local9_life19;

        int __sourceSpill390_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill390_35)[__sourceSpill390_36] = __sourceSpill390_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "äDø:Ø\032N\\b¥JÑ\004È¨\004Ýÿ\021\020s½V&òò¼\031,Æ¹~Ì\033"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill390_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill390_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill390_43)).doFinal(((byte[])(__sourceSpill390_42)));

        java.lang.String __sourceSpill390_48 = ((java.lang.String)(com.moon.module.impl.Sprint.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill390_49 = local9_life19;

        int __sourceSpill390_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill390_49)[__sourceSpill390_50] = __sourceSpill390_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    v = ((java.lang.String[])(local9_life19));

    w = ((java.lang.String[])(new java.lang.String[4]));
}


public com.moon.setting.BooleanSetting b() {
return this.t;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2682_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22864);
    if (((com.moon.module.impl.Sprint.w)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Sprint.x)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Sprint.x)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lu", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Sprint.v)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Sprint.w)[life5_8] = com.moon.module.impl.Sprint.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Sprint.w)[life5_8];
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
        byte[] spill1220_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1220_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1220_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1220_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1220_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1220_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Sprint.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void onDisable() {
moom.pz.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Sprint.d)).W)).ar)).b())), ((boolean)(false)));
    return;
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.Minecraft forwardValue940_12_0;
    net.minecraft.client.Minecraft spill940_0;
    long life2_3;
    int[] life4_5;
    forward_join_25: {
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.Sprint.u ^ 122114434707589L);
    life4_5 = com.moon.bx.b();
    spill940_0 = com.moon.module.impl.Sprint.d;
    if (!((life4_5 == null))) {
        forwardValue940_12_0 = spill940_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.client.Minecraft)(spill940_0)).I != null))) {
        break forward_join_14;
    }
    forwardValue940_12_0 = com.moon.module.impl.Sprint.d;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue940_12_0)).K == null))) {
        break forward_join_15;
    }
    }
    return;
    }
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forward_join_25;
    }
    moom.pz.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Sprint.d)).W)).ar)).b())), ((boolean)(true)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.BooleanSetting a() {
return this.s;
}


public void a(com.moon.event.PacketEvent p0) {
moom.yK forwardValue939_15_0;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action forwardValue939_32_0;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action forwardValue939_32_1;
    int[] spill939_0;
    moom.yK spill939_1;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action spill939_2;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action spill939_3;
    long life2_3;
    moom.yK life6_7;
    int[] life4_8;
    moom.ze life5_22;
    forward_join_37: {
    forward_join_33: {
    forward_join_32: {
    forward_join_15: {
    life2_3 = (com.moon.module.impl.Sprint.u ^ 37953585316553L);
    spill939_0 = com.moon.bx.b();
    life6_7 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    life4_8 = spill939_0;
    spill939_1 = life6_7;
    if (!((life4_8 == null))) {
        forwardValue939_15_0 = spill939_1;
        break forward_join_15;
    }
    if (!((((spill939_1 instanceof moom.ze) ? 1 : 0) != 0))) {
        break forward_join_37;
    }
    forwardValue939_15_0 = life6_7;
    }
    life5_22 = ((moom.ze)(forwardValue939_15_0));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue())) {
        break forward_join_37;
    }
    spill939_2 = ((moom.ze)(life5_22)).a__be();
    spill939_3 = net.minecraft.network.play.client.C0BPacketEntityAction$Action.START_SPRINTING;
    if (!((life4_8 == null))) {
        forwardValue939_32_0 = spill939_2;
        forwardValue939_32_1 = spill939_3;
        break forward_join_32;
    }
    if (!((spill939_2 != spill939_3))) {
        break forward_join_33;
    }
    forwardValue939_32_0 = ((moom.ze)(life5_22)).a__be();
    forwardValue939_32_1 = net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SPRINTING;
    }
    if (!((forwardValue939_32_0 == forwardValue939_32_1))) {
        break forward_join_37;
    }
    }
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9809b124dec0f61c_originalDynamicSite1296_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2682_0() throws E;
}
