package com.moon.module.impl;


public class GuiMove extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.BooleanSetting u;

private moom.pz[] v;

private static long w;

private static java.lang.String[] x;

private static java.lang.String[] y;

private static java.util.Map z;

private static long A;

public GuiMove(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_db8c7e810531c338(com.moon.module.impl.GuiMove receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.GuiMove.w ^ 139204623031778L);

    com.moon.module.impl.GuiMove.__sourceConstructorInit_db8c7e810531c338_0(((com.moon.module.impl.GuiMove)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.GuiMove)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_5(23840, (3714044206089710462L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_8(10628, (4368029816002633692L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.GuiMove __sourceSpill154_19 = receiver;

    com.moon.l_ __sourceSpill154_20 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_13(30006, (1971469817592644457L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_16(24056, (2800061487783586725L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp154_21_0 = ((com.moon.module.impl.GuiMove)(receiver)).s;

    com.moon.setting.BooleanSetting __sourceSpill154_23 = __stackOp154_21_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp154_21_0)));

    ((com.moon.module.impl.GuiMove)(__sourceSpill154_19)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill154_20)).a(((java.util.function.Supplier)(__sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_24(__sourceSpill154_23)))))).a()));

    ((com.moon.module.impl.GuiMove)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_29(1615, (4035932639855210515L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_32(4555, (2273207839010449298L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.GuiMove __sourceSpill154_37 = receiver;

    moom.pz[] __stackOp154_38_0 = new moom.pz[((int) com.moon.module.impl.GuiMove.A)];

    moom.pz[] __sourceSpill154_42 = __stackOp154_38_0;

    (__stackOp154_38_0)[0] = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).W)).al;

    moom.pz[] __stackOp154_43_0 = __sourceSpill154_42;

    moom.pz[] __sourceSpill154_47 = __stackOp154_43_0;

    (__stackOp154_43_0)[1] = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).W)).am;

    moom.pz[] __stackOp154_48_0 = __sourceSpill154_47;

    moom.pz[] __sourceSpill154_52 = __stackOp154_48_0;

    (__stackOp154_48_0)[2] = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).W)).al;

    moom.pz[] __stackOp154_53_0 = __sourceSpill154_52;

    moom.pz[] __sourceSpill154_57 = __stackOp154_53_0;

    (__stackOp154_53_0)[3] = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).W)).an;

    moom.pz[] __stackOp154_58_0 = __sourceSpill154_57;

    moom.pz[] __sourceSpill154_62 = __stackOp154_58_0;

    (__stackOp154_58_0)[4] = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).W)).ao;

    moom.pz[] __stackOp154_63_0 = __sourceSpill154_62;

    moom.pz[] __sourceSpill154_67 = __stackOp154_63_0;

    (__stackOp154_63_0)[5] = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).W)).ap;

    ((com.moon.module.impl.GuiMove)(__sourceSpill154_37)).v = ((moom.pz[])(__sourceSpill154_67));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_db8c7e810531c338_0(com.moon.module.impl.GuiMove a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
w = ((long)(((moom._a)(moom._c.a(((long)(-672207714137285799L)), ((long)(6646060204191067265L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(238226532391999L)))));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.module.impl.GuiMove.w ^ 50088702180818L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill276_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill276_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill276_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill276_14 = new byte[8];
    (__sourceSpill276_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill276_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation276_16 = __sourceSpill276_14;
    ((javax.crypto.Cipher)(__sourceSpill276_11)).init(((int)(__sourceSpill276_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill276_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation276_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[6];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "ËKûÍ~a' ÈðXá\026ÙÎ\005Výß#Ä&}=Dhz½OK\005!fh ê3\rdë»¢Âÿ³ó<\033ª¦~ÝûíY`¸z¦ xòåâ<¸p%s\022ÐöDù¬Rµ\0028^\n±@F!T©(¿ð÷@\032\r#çÌ]7ìÆPÌT²T9êBÊyøôò¦ÛöuPh\bxúø;"))).length();
    int local10_life24 = 40;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill276_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill276_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill276_29)).doFinal(((byte[])(__sourceSpill276_28)));
        java.lang.String __sourceSpill276_34 = ((java.lang.String)(com.moon.module.impl.GuiMove.c(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill276_35 = local14_life19;
        int __sourceSpill276_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill276_35)[__sourceSpill276_36] = __sourceSpill276_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "Ãó,,(N\004òËòOÖ\017Y\001Yl\032>\tþ«XJ£\"0A!HCOª*NïyÈÆX \177þ×Ó÷?ì\tõkM¾hÖ=BÅq\013¾ú´r½¹äßaíÃ"))).length();
    local10_life24 = 32;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill276_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill276_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill276_42)).doFinal(((byte[])(__sourceSpill276_41)));
        java.lang.String __sourceSpill276_47 = ((java.lang.String)(com.moon.module.impl.GuiMove.c(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill276_48 = local14_life19;
        int __sourceSpill276_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill276_48)[__sourceSpill276_49] = __sourceSpill276_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    x = ((java.lang.String[])(local14_life19));
    y = ((java.lang.String[])(new java.lang.String[6]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill276_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill276_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill276_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill276_59 = new byte[8];
    (__sourceSpill276_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill276_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation276_61 = __sourceSpill276_59;
    ((javax.crypto.Cipher)(__sourceSpill276_56)).init(((int)(__sourceSpill276_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill276_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation276_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = 6632633217053388330L;
    byte[] __sourceSpill276_65 = new byte[8];
    (__sourceSpill276_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill276_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill276_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill276_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill276_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill276_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill276_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill276_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill276_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill276_66)).doFinal(((byte[])(__sourceSpill276_65)));
    A = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
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
        byte[] spill1096_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1096_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1096_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1096_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1096_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1096_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21504);
    if (((com.moon.module.impl.GuiMove.y)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.GuiMove.z)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.GuiMove.z)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lF", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.GuiMove.x)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.GuiMove.y)[life5_8] = com.moon.module.impl.GuiMove.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.GuiMove.y)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.GuiMove.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2487_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void onDisable() {
((java.util.stream.Stream)(java.util.Arrays.stream(((java.lang.Object[])(this.v))))).forEach(((java.util.function.Consumer)(__sourceIntrinsic_e5d8624439f0_originalDynamicSite520_2())));
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue837_17_0;
    moom.yK forwardValue837_27_0;
    boolean spill837_0;
    moom.yK spill837_1;
    long life2_3;
    java.lang.String life4_5;
    moom.yK life6_23;
    moom.zp life5_37;
    forward_join_37: {
    forward_join_27: {
    forward_join_17: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.GuiMove.w ^ 58782709222694L);
    life4_5 = com.moon.bF.b();
    spill837_0 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_5 != null))) {
        forwardValue837_17_0 = ((spill837_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill837_0))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue837_17_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue837_17_0 != 0))) {
        break forward_join_37;
    }
    life6_23 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill837_1 = life6_23;
    if (!((life4_5 != null))) {
        forwardValue837_27_0 = spill837_1;
        break forward_join_27;
    }
    if (!((((spill837_1 instanceof moom.zp) ? 1 : 0) != 0))) {
        break forward_join_37;
    }
    forwardValue837_27_0 = life6_23;
    }
    life5_37 = ((moom.zp)(forwardValue837_27_0));
    if (!((((moom.zp)(life5_37)).a() == net.minecraft.network.play.client.C16PacketClientStatus$EnumState.OPEN_INVENTORY_ACHIEVEMENT))) {
        break forward_join_37;
    }
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue836_21_0;
    net.minecraft.client.gui.GuiScreen forwardValue836_30_0;
    java.lang.Object forwardValue836_41_0;
    int forwardValue836_51_0;
    net.minecraft.client.Minecraft forwardValue836_60_0;
    int spill836_0;
    net.minecraft.client.gui.GuiScreen spill836_1;
    boolean spill836_2;
    net.minecraft.client.Minecraft spill836_3;
    long life2_3;
    java.lang.String life4_5;
    forward_join_66: {
    forward_join_60: {
    forward_join_51: {
    forward_join_41: {
    forward_join_30: {
    forward_join_28: {
    forward_join_21: {
    life2_3 = (com.moon.module.impl.GuiMove.w ^ 86028464998553L);
    life4_5 = com.moon.bF.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.BEFORE))) {
        break forward_join_66;
    }
    spill836_0 = ((((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).P instanceof moom.gF) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue836_21_0 = spill836_0;
        break forward_join_21;
    }
    if (!((spill836_0 == 0))) {
        break forward_join_66;
    }
    spill836_1 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).P;
    if (!((life4_5 != null))) {
        forwardValue836_30_0 = spill836_1;
        break forward_join_30;
    }
    forwardValue836_21_0 = ((spill836_1 instanceof moom.hg) ? 1 : 0);
    }
    if (!((forwardValue836_21_0 != 0))) {
        break forward_join_28;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue())) {
        break forward_join_66;
    }
    }
    forwardValue836_30_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).P;
    }
    if (!((life4_5 != null))) {
        forwardValue836_41_0 = forwardValue836_30_0;
        break forward_join_41;
    }
    if (!((forwardValue836_30_0 != null))) {
        break forward_join_66;
    }
    ((java.util.stream.Stream)(java.util.Arrays.stream(((java.lang.Object[])(this.v))))).forEach(((java.util.function.Consumer)(__sourceIntrinsic_9f71572286bb_invokedynamic836_18())));
    forwardValue836_41_0 = ((com.moon.setting.BooleanSetting)(this.u)).getValue();
    }
    spill836_2 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue836_41_0)))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue836_51_0 = ((spill836_2) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill836_2)) {
        break forward_join_66;
    }
    spill836_3 = com.moon.module.impl.GuiMove.d;
    if (!((life4_5 != null))) {
        forwardValue836_60_0 = spill836_3;
        break forward_join_60;
    }
    forwardValue836_51_0 = ((((net.minecraft.client.Minecraft)(spill836_3)).P instanceof moom.hg) ? 1 : 0);
    }
    if (!((forwardValue836_51_0 != 0))) {
        break forward_join_66;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp836_30_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.GuiMove.d)).K;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp836_30_0)).t = ((double)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp836_30_0)).t * 0x1.199999999999ap-1d)));
    forwardValue836_60_0 = com.moon.module.impl.GuiMove.d;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp836_35_0 = ((net.minecraft.client.Minecraft)(forwardValue836_60_0)).K;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp836_35_0)).v = ((double)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp836_35_0)).v * 0x1.199999999999ap-1d)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static void lambda$disable$0(moom.pz p0) {
moom.pz.a(((int)(((moom.pz)(p0)).b())), ((boolean)(false)));
    return;
}


private static void lambda$receiveUpdate$1(moom.pz p0) {
moom.pz.a(((int)(((moom.pz)(p0)).b())), ((boolean)(org.lwjgl.input.Keyboard.isKeyDown(((int)(((moom.pz)(p0)).b()))))));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_24(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db8c7e810531c338_originalDynamicSite154_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2487_0() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_e5d8624439f0_originalDynamicSite520_2() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_9f71572286bb_invokedynamic836_18() throws E;
}
