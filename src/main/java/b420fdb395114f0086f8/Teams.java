package com.moon.module.impl;


public class Teams extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.BooleanSetting u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

public Teams(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_0d99fb105dc033b0(com.moon.module.impl.Teams receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Teams.v ^ 19497228917712L);

    com.moon.module.impl.Teams.__sourceConstructorInit_0d99fb105dc033b0_0(((com.moon.module.impl.Teams)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Teams)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_2(28727, (2608155721627951980L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_4(11878, (1659117585041472827L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Teams)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_8(19947, (1415559566250335922L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_10(5083, (716917272701993089L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Teams)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_14(3546, (2152305553583971970L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_16(13847, (1386852649827738955L ^ local5)))), ((boolean)(true))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0d99fb105dc033b0_0(com.moon.module.impl.Teams a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
v = ((long)(((moom._a)(moom._c.a(((long)(-7271392077897797442L)), ((long)(-4820443994486746231L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106387212379345L)))));

    y = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.Teams.v ^ 21499811367765L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill395_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill395_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill395_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill395_14 = new byte[8];

    (__sourceSpill395_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill395_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation395_16 = __sourceSpill395_14;

    ((javax.crypto.Cipher)(__sourceSpill395_11)).init(((int)(__sourceSpill395_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill395_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation395_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "\035\020³0YfdÙº\036\b«¿\020O,G[woá\f\033<ùVjö« Ü¨ÿw¾èwî\006¬0oòX5u\rçÜ\fùÎ\013µ\nBvfLÙµ\020llB\000RÊíýe\\º\034¡Èo"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill395_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill395_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill395_29)).doFinal(((byte[])(__sourceSpill395_28)));

        java.lang.String __sourceSpill395_34 = ((java.lang.String)(com.moon.module.impl.Teams.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill395_35 = local9_life19;

        int __sourceSpill395_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill395_35)[__sourceSpill395_36] = __sourceSpill395_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "ëÄy µ\005\003\034±üáÿ_ó×\t&ÝamNä±ÚÕF¢]À\020\177øÑ2\táåÞÕäÒpã«©"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill395_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill395_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill395_43)).doFinal(((byte[])(__sourceSpill395_42)));

        java.lang.String __sourceSpill395_48 = ((java.lang.String)(com.moon.module.impl.Teams.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill395_49 = local9_life19;

        int __sourceSpill395_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill395_49)[__sourceSpill395_50] = __sourceSpill395_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    w = ((java.lang.String[])(local9_life19));

    x = ((java.lang.String[])(new java.lang.String[6]));
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
        byte[] spill1242_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1242_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1242_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1242_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1242_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1242_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32185);
    if (((com.moon.module.impl.Teams.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Teams.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Teams.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ld", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Teams.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Teams.x)[life5_8] = com.moon.module.impl.Teams.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Teams.x)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Teams.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2718_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ld"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.util.EnumChatFormatting forwardValue957_20_0;
    java.lang.Object forwardValue957_27_0;
    int forwardValue957_33_0;
    int forwardValue957_52_0;
    int forwardValue957_56_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue957_59_0;
    java.lang.Object forwardValue957_71_0;
    int forwardValue957_91_0;
    int forwardValue957_95_0;
    int forwardValue957_97_0;
    int forwardValue957_99_0;
    boolean spill957_0;
    net.minecraft.util.EnumChatFormatting spill957_1;
    boolean spill957_2;
    net.minecraft.client.entity.EntityPlayerSP spill957_3;
    boolean spill957_4;
    net.minecraft.item.ItemStack spill957_5;
    boolean spill957_6;
    int spill957_7;
    long life2_3;
    net.minecraft.util.EnumChatFormatting life5_9;
    net.minecraft.util.EnumChatFormatting life6_13;
    int life4_14;
    net.minecraft.item.ItemStack life7_90;
    net.minecraft.item.Item life8_114;
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_95: {
    forward_join_91: {
    forward_join_71: {
    forward_join_59: {
    forward_join_57: {
    forward_join_56: {
    forward_join_52: {
    forward_join_34: {
    forward_join_33: {
    forward_join_27: {
    forward_join_20: {
    life2_3 = (com.moon.module.impl.Teams.v ^ 85004910153438L);
    spill957_0 = com.moon.bg.b();
    life5_9 = ((com.moon.module.impl.Teams)(this)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Teams.d)).K)));
    life6_13 = ((com.moon.module.impl.Teams)(this)).a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    life4_14 = ((spill957_0) ? 1 : 0);
    spill957_1 = life5_9;
    if (!((life4_14 == 0))) {
        forwardValue957_20_0 = spill957_1;
        break forward_join_20;
    }
    if (!((spill957_1 != null))) {
        break forward_join_34;
    }
    forwardValue957_20_0 = life5_9;
    }
    if (!((life4_14 == 0))) {
        forwardValue957_27_0 = forwardValue957_20_0;
        break forward_join_27;
    }
    if (!((forwardValue957_20_0 == life6_13))) {
        break forward_join_34;
    }
    forwardValue957_27_0 = ((com.moon.setting.BooleanSetting)(this.s)).getValue();
    }
    spill957_2 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue957_27_0)))).booleanValue();
    if (!((life4_14 == 0))) {
        forwardValue957_33_0 = ((spill957_2) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill957_2)) {
        break forward_join_34;
    }
    forwardValue957_33_0 = 1;
    }
    return ((forwardValue957_33_0) != 0);
    }
    spill957_3 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Teams.d)).K;
    if (!((life4_14 == 0))) {
        forwardValue957_59_0 = spill957_3;
        break forward_join_59;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill957_3)).a__Bj() != null))) {
        break forward_join_57;
    }
    spill957_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue();
    if (!((life4_14 == 0))) {
        forwardValue957_52_0 = ((spill957_4) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill957_4)) {
        break forward_join_57;
    }
    forwardValue957_52_0 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).a__sourceReturn_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Teams.d)).K)))) ? 1 : 0);
    }
    if (!((life4_14 == 0))) {
        forwardValue957_56_0 = forwardValue957_52_0;
        break forward_join_56;
    }
    if (!((forwardValue957_52_0 != 0))) {
        break forward_join_57;
    }
    forwardValue957_56_0 = 1;
    }
    return ((forwardValue957_56_0) != 0);
    }
    forwardValue957_59_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Teams.d)).K;
    }
    life7_90 = (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue957_59_0)).bD)).b)[3];
    spill957_5 = life7_90;
    if (!((life4_14 == 0))) {
        forwardValue957_71_0 = spill957_5;
        break forward_join_71;
    }
    if (!((spill957_5 != null))) {
        break forward_join_98;
    }
    forwardValue957_71_0 = ((com.moon.setting.BooleanSetting)(this.u)).getValue();
    }
    spill957_6 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue957_71_0)))).booleanValue();
    if (!((life4_14 == 0))) {
        forwardValue957_99_0 = ((spill957_6) ? 1 : 0);
        break forward_join_99;
    }
    if (!(spill957_6)) {
        break forward_join_98;
    }
    life8_114 = ((net.minecraft.item.ItemStack)(life7_90)).a__wQ();
    spill957_7 = ((life8_114 instanceof moom.wU) ? 1 : 0);
    if (!((life4_14 == 0))) {
        forwardValue957_91_0 = spill957_7;
        break forward_join_91;
    }
    if (!((spill957_7 != 0))) {
        break forward_join_96;
    }
    forwardValue957_91_0 = ((net.minecraft.item.ItemStack.b(((net.minecraft.item.ItemStack)(life7_90)), ((net.minecraft.item.ItemStack)((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).b)[3])))) ? 1 : 0);
    }
    if (!((life4_14 == 0))) {
        forwardValue957_95_0 = forwardValue957_91_0;
        break forward_join_95;
    }
    if (!((forwardValue957_91_0 != 0))) {
        break forward_join_96;
    }
    forwardValue957_95_0 = 1;
    }
    forwardValue957_97_0 = forwardValue957_95_0;
    break forward_join_97;
    }
    forwardValue957_97_0 = 0;
    }
    return ((forwardValue957_97_0) != 0);
    }
    forwardValue957_99_0 = 0;
    }
    return ((forwardValue957_99_0) != 0);
}


private net.minecraft.util.EnumChatFormatting a(net.minecraft.entity.player.EntityPlayer p0) {
long life2_3;
    int life4_5;
    net.minecraft.util.EnumChatFormatting[] life5_14;
    int life6_17;
    int life7_19;
    net.minecraft.util.EnumChatFormatting life8_26;
    lexical_join_45: {
    lexical_join_11: {
    life2_3 = (com.moon.module.impl.Teams.v ^ 117626508659390L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    if (!((((net.minecraft.entity.player.EntityPlayer)(p0)).a__C5() == null))) {
        break lexical_join_11;
    }
    return null;
    }
    life5_14 = net.minecraft.util.EnumChatFormatting.values();
    life6_17 = (life5_14).length;
    life7_19 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_42: {
    lexical_join_30: {
    if (!((life7_19 < life6_17))) {
        break lexical_join_45;
    }
    life8_26 = (life5_14)[life7_19];
    if (!((life8_26 == net.minecraft.util.EnumChatFormatting.RESET))) {
        break lexical_join_30;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_42;
    }
    }
    if (!(((java.lang.String)(((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__C5())).c())).substring(((int)(0)), ((int)(2))))).contains(((java.lang.CharSequence)(((net.minecraft.util.EnumChatFormatting)(life8_26)).toString()))))) {
        break lexical_join_42;
    }
    return life8_26;
    }
    life7_19 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return null;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d99fb105dc033b0_originalDynamicSite1306_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2718_0() throws E;
}
