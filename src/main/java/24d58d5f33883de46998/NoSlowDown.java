package com.moon.module.impl;


public class NoSlowDown extends com.moon.module.Module {

public com.moon.setting.MultiSelectSetting<com.moon.NoSlowDownOption> s;

public com.moon.setting.EnumSetting<com.moon.bu> t;

public com.moon.setting.BooleanSetting u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

public NoSlowDown(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_a1ed6f5ad89bf23c(com.moon.module.impl.NoSlowDown receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.NoSlowDown.v ^ 99434043942307L);

    com.moon.module.impl.NoSlowDown.__sourceConstructorInit_a1ed6f5ad89bf23c_0(((com.moon.module.impl.NoSlowDown)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.NoSlowDown)(receiver)).s = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_2(937, (4448462454072764954L ^ local5)))), ((java.lang.Class)(com.moon.NoSlowDownOption.class))))).a(((java.lang.String)(__sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_5(13286, (3428785208214149712L ^ local5)))), ((java.lang.Enum[])(new com.moon.NoSlowDownOption[] {com.moon.NoSlowDownOption.SNEAKING, com.moon.NoSlowDownOption.SWORDS, com.moon.NoSlowDownOption.CONSUMABLE, com.moon.NoSlowDownOption.SPRINTING, com.moon.NoSlowDownOption.BLOCKS}))))).a()));

    ((com.moon.module.impl.NoSlowDown)(receiver)).t = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_14(12998, (3285359584865180534L ^ local5)))), ((java.lang.Class)(com.moon.bu.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_17(3440, (101385510248735943L ^ local5)))), ((java.lang.Enum)(com.moon.bu.VANILLA))))).a()));

    ((com.moon.module.impl.NoSlowDown)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_22(7424, (5473372118427923633L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_24(624, (1289775873045359554L ^ local5)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_26(receiver)))))).a()));

    return;

}



static {
v = ((long)(((moom._a)(moom._c.a(((long)(3378148083990108824L)), ((long)(3869594658889165216L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27004348556568L)))));

    y = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.NoSlowDown.v ^ 92975043024149L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill378_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill378_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill378_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill378_14 = new byte[8];

    (__sourceSpill378_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill378_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation378_16 = __sourceSpill378_14;

    ((javax.crypto.Cipher)(__sourceSpill378_11)).init(((int)(__sourceSpill378_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill378_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation378_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "i\005ÚÁ9¶s»7±`áÆ\033\025\nS\032kn¢é`½?ZÆ³Öu \027»Ì ´öPàÄäÌa»\033¶ý`Ö³¬ÝÖýGüEûí\0303ûæ\021\n´¨'ÆêÒS.ÿ#\f6Û\031'Ù g{ä-ãº½þp\0366\023\025üzXp\002êî»21W4ÀáB"))).length();

    int local5_life24 = 32;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill378_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill378_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill378_29)).doFinal(((byte[])(__sourceSpill378_28)));

        java.lang.String __sourceSpill378_34 = ((java.lang.String)(com.moon.module.impl.NoSlowDown.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill378_35 = local9_life19;

        int __sourceSpill378_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill378_35)[__sourceSpill378_36] = __sourceSpill378_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "Õ\036ÙxÚ:×`\030õ\032T^PO_¬yKb ·çm\f6ñ,ºu+\031¾Ô±»äÚòð´\nì\013%»-$"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill378_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill378_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill378_43)).doFinal(((byte[])(__sourceSpill378_42)));

        java.lang.String __sourceSpill378_48 = ((java.lang.String)(com.moon.module.impl.NoSlowDown.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill378_49 = local9_life19;

        int __sourceSpill378_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill378_49)[__sourceSpill378_50] = __sourceSpill378_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    w = ((java.lang.String[])(local9_life19));

    x = ((java.lang.String[])(new java.lang.String[6]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a1ed6f5ad89bf23c_0(com.moon.module.impl.NoSlowDown a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2575_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill1159_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1159_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1159_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1159_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1159_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1159_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15431);
    if (((com.moon.module.impl.NoSlowDown.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.NoSlowDown.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.NoSlowDown.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lq", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.NoSlowDown.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.NoSlowDown.x)[life5_8] = com.moon.module.impl.NoSlowDown.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.NoSlowDown.x)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.NoSlowDown.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.ActionEvent p0) {
net.minecraft.item.ItemStack forestValue200_22_0;
    int forestValue200_40_0;
    int forestValue200_72_0;
    net.minecraft.client.entity.EntityPlayerSP forestValue200_75_0;
    net.minecraft.item.ItemStack spill200_0;
    int spill200_1;
    boolean spill200_2;
    net.minecraft.client.entity.EntityPlayerSP spill200_3;
    long life2_3;
    int[] life4_5;
    net.minecraft.item.Item life5_25;
    forest_join_110: {
    forest_join_101: {
    forest_join_90: {
    forest_join_79: {
    forest_join_77: {
    forest_join_75: {
    forest_join_72: {
    forest_join_57: {
    forest_join_50: {
    forest_join_40: {
    forest_join_38: {
    forest_join_22: {
    forest_join_19: {
    forest_join_12: {
    life2_3 = (com.moon.module.impl.NoSlowDown.v ^ 131461798736626L);
    life4_5 = com.moon.bx.b();
    switch ((com.moon.gu.a)[((com.moon.event.ActionType)(((com.moon.event.ActionEvent)(p0)).getType())).ordinal()]) {
case 1:
{
        break forest_join_12;
    }
case 2:
{
        break forest_join_79;
    }
case 3:
{
        break forest_join_90;
    }
case 4:
{
        break forest_join_101;
    }
default:
{
        break forest_join_110;
    }
}
    }
    spill200_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.NoSlowDown.d)).K)).a__xW();
    if (!((life4_5 == null))) {
        forestValue200_22_0 = spill200_0;
        break forest_join_22;
    }
    if (!((spill200_0 == null))) {
        break forest_join_19;
    }
    return;
    }
    forestValue200_22_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.NoSlowDown.d)).K)).a__xW();
    }
    life5_25 = ((net.minecraft.item.ItemStack)(forestValue200_22_0)).a__wQ();
    spill200_1 = ((life5_25 instanceof moom.xP) ? 1 : 0);
    if (!((life4_5 == null))) {
        forestValue200_40_0 = spill200_1;
        break forest_join_40;
    }
    if (!((spill200_1 != 0))) {
        break forest_join_38;
    }
    ((com.moon.event.ActionEvent)(p0)).setCancelled(((boolean)(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.SWORDS))))));
    if (!((life4_5 != null))) {
        break forest_join_57;
    }
    }
    forestValue200_40_0 = ((life5_25 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    }
    if (!((forestValue200_40_0 != 0))) {
        break forest_join_50;
    }
    ((com.moon.event.ActionEvent)(p0)).setCancelled(((boolean)(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.BOW))))));
    if (!((life4_5 != null))) {
        break forest_join_57;
    }
    }
    ((com.moon.event.ActionEvent)(p0)).setCancelled(((boolean)(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.CONSUMABLE))))));
    }
    spill200_2 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.NoSlowDown.d)).W)).ar)).a__Boolean();
    if (!((life4_5 == null))) {
        forestValue200_72_0 = ((spill200_2) ? 1 : 0);
        break forest_join_72;
    }
    if (!(spill200_2)) {
        break forest_join_77;
    }
    spill200_3 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.NoSlowDown.d)).K;
    if (!((life4_5 == null))) {
        forestValue200_75_0 = spill200_3;
        break forest_join_75;
    }
    forestValue200_72_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.MovementInput)(((net.minecraft.client.entity.EntityPlayerSP)(spill200_3)).co)).b)), ((float)(0x0.0p0f)));
    }
    if (!((forestValue200_72_0 > 0))) {
        break forest_join_77;
    }
    forestValue200_75_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.NoSlowDown.d)).K;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forestValue200_75_0)).c(((boolean)(true)));
    }
    if (!((life4_5 != null))) {
        break forest_join_110;
    }
    }
    if (!(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.SNEAKING))))) {
        break forest_join_110;
    }
    ((com.moon.event.ActionEvent)(p0)).setCancelled(((boolean)(true)));
    if (!((life4_5 != null))) {
        break forest_join_110;
    }
    }
    if (!(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.SPRINTING))))) {
        break forest_join_110;
    }
    ((com.moon.event.ActionEvent)(p0)).setCancelled(((boolean)(true)));
    if (!((life4_5 != null))) {
        break forest_join_110;
    }
    }
    if (!(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.NoSlowDownOption.BLOCKS))))) {
        break forest_join_110;
    }
    ((com.moon.event.ActionEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
long local2 = (com.moon.module.impl.NoSlowDown.v ^ 18688069476651L);
    if ((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.POST)) {
        ((com.moon.module.impl.NoSlowDown)(this)).setSuffix(((java.lang.String)(((com.moon.bu)(((com.moon.bu)(((com.moon.setting.EnumSetting)(this.t)).getValue())))).a__String())));
    }
    return;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.NoSlowDown.v ^ 31827654836678L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.t)).getValue() == com.moon.bu.SPOOF) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_a1ed6f5ad89bf23c_originalDynamicSite1272_26(com.moon.module.impl.NoSlowDown a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2575_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
