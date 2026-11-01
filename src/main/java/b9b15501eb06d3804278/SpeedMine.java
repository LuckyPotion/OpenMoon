package com.moon.module.impl;


public class SpeedMine extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.moon.setting.FloatSetting t;

private com.moon.setting.FloatSetting u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

public SpeedMine(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_a8311c5029409a1a(com.moon.module.impl.SpeedMine receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.SpeedMine.v ^ 100723038621017L);

    com.moon.module.impl.SpeedMine.__sourceConstructorInit_a8311c5029409a1a_0(((com.moon.module.impl.SpeedMine)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.SpeedMine)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_5(20052, (1383099065722796030L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_8(21900, (654550347507919909L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.SpeedMine)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_13(11680, (1903752647521833996L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_16(4931, (1454222813247744747L ^ local5_life2)))), ((float)(1045220557)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(1028443341))))).a(((java.util.function.Supplier)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_20(receiver)))))).a()));

    com.moon.module.impl.SpeedMine __sourceSpill7_33 = receiver;

    com.moon.md __sourceSpill7_34 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_25(19465, (5580560196066244002L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_28(5456, (5255509192262921469L ^ local5_life2)))), ((float)(1112014848)), ((float)(0x0.0p0f)), ((float)(1120403456)), ((float)(0x1.0p0f)));

    com.moon.setting.BooleanSetting __sourceEffectfulDup7_35 = ((com.moon.module.impl.SpeedMine)(receiver)).s;

    com.moon.setting.BooleanSetting __sourceSpill7_37 = __sourceEffectfulDup7_35;

    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup7_35)));

    ((com.moon.module.impl.SpeedMine)(__sourceSpill7_33)).u = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(__sourceSpill7_34)).a(((java.util.function.Supplier)(__sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_38(__sourceSpill7_37)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a8311c5029409a1a_0(com.moon.module.impl.SpeedMine a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
v = ((long)(((moom._a)(moom._c.a(((long)(-6177691060694663035L)), ((long)(-3455109440998130679L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(176655527818419L)))));

    y = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.SpeedMine.v ^ 63140470641694L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill388_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill388_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill388_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill388_14 = new byte[8];

    (__sourceSpill388_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill388_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation388_16 = __sourceSpill388_14;

    ((javax.crypto.Cipher)(__sourceSpill388_11)).init(((int)(__sourceSpill388_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill388_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation388_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "²ãúÞftÔ&KUÞâh\0306UÈ!&{ö°Ä'í\"µ¶¯ÈÍ4]N\030!\030\007ü`PãÁ\006¸àpAöá>c\013\ttÃv\\(y\020\004hR6ï!f\rëFè²5×­b?5Ð±\032û\025H]#µF\020º°_X>"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill388_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill388_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill388_29)).doFinal(((byte[])(__sourceSpill388_28)));

        java.lang.String __sourceSpill388_34 = ((java.lang.String)(com.moon.module.impl.SpeedMine.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill388_35 = local9_life19;

        int __sourceSpill388_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill388_35)[__sourceSpill388_36] = __sourceSpill388_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "}8´í\025\016ï,[£\032qwÒ×ßLÂ±5\020·µÿè4$lÇPLÛ¨\033¢'"))).length();

    local5_life24 = 24;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill388_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill388_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill388_43)).doFinal(((byte[])(__sourceSpill388_42)));

        java.lang.String __sourceSpill388_48 = ((java.lang.String)(com.moon.module.impl.SpeedMine.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill388_49 = local9_life19;

        int __sourceSpill388_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill388_49)[__sourceSpill388_50] = __sourceSpill388_48;

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
        byte[] spill1215_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1215_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1215_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1215_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1215_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1215_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2707);
    if (((com.moon.module.impl.SpeedMine.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.SpeedMine.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.SpeedMine.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lM", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.SpeedMine.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.SpeedMine.x)[life5_8] = com.moon.module.impl.SpeedMine.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.SpeedMine.x)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.SpeedMine.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2676_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
com.moon.module.impl.BedBreaker forwardValue937_29_0;
    java.lang.Object forwardValue937_51_0;
    net.minecraft.block.Block forwardValue937_67_0;
    com.moon.module.impl.BedBreaker forwardValue937_103_0;
    java.lang.Object forwardValue937_109_0;
    int forwardValue937_113_0;
    java.lang.Object forwardValue937_117_0;
    net.minecraft.client.Minecraft forwardValue937_173_0;
    moom.jI forwardValue937_184_0;
    com.moon.module.impl.BedBreaker spill937_0;
    moom.DT spill937_1;
    boolean spill937_2;
    java.lang.Boolean spill937_3;
    net.minecraft.block.Block spill937_4;
    com.moon.module.impl.BedBreaker spill937_5;
    java.lang.Boolean spill937_6;
    net.minecraft.client.Minecraft spill937_7;
    net.minecraft.client.Minecraft spill937_8;
    net.minecraft.client.Minecraft spill937_9;
    moom.jI spill937_10;
    long life2_3;
    java.lang.String life4_5;
    float life5_23;
    com.moon.module.impl.BedBreaker life6_29;
    moom.DT life7_39;
    net.minecraft.block.Block life8_88;
    float life9_103;
    moom.DT life8_194;
    net.minecraft.block.Block life9_202;
    float life10_212;
    forward_join_186: {
    forward_join_184: {
    forward_join_173: {
    forward_join_172: {
    forward_join_122: {
    forward_join_117: {
    forward_join_113: {
    forward_join_109: {
    forward_join_106: {
    forward_join_103: {
    forward_join_90: {
    forward_join_67: {
    forward_join_56: {
    forward_join_51: {
    forward_join_29: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.SpeedMine.v ^ 65493884979374L);
    life4_5 = com.moon.bF.b();
    if (!((life4_5 != null))) {
        break forward_join_16;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_186;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).F)).i = ((int)(0));
    }
    life5_23 = 0x0.0p0f;
    life6_29 = ((com.moon.module.impl.BedBreaker)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.BedBreaker.class)))));
    spill937_0 = life6_29;
    if (!((life4_5 != null))) {
        forwardValue937_29_0 = spill937_0;
        break forward_join_29;
    }
    if (!((spill937_0 != null))) {
        break forward_join_186;
    }
    forwardValue937_29_0 = life6_29;
    }
    life7_39 = ((com.moon.module.impl.BedBreaker)(forwardValue937_29_0)).a__DT();
    spill937_1 = life7_39;
    if (!((life4_5 != null))) {
        forwardValue937_109_0 = spill937_1;
        break forward_join_109;
    }
    if (!((spill937_1 != null))) {
        break forward_join_106;
    }
    spill937_2 = ((com.moon.module.impl.BedBreaker)(life6_29)).isEnabled();
    if (!((life4_5 != null))) {
        forwardValue937_113_0 = ((spill937_2) ? 1 : 0);
        break forward_join_113;
    }
    if (!(spill937_2)) {
        break forward_join_106;
    }
    spill937_3 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue()));
    if (!((life4_5 != null))) {
        forwardValue937_51_0 = spill937_3;
        break forward_join_51;
    }
    if (!((!((java.lang.Boolean)(spill937_3)).booleanValue()))) {
        break forward_join_56;
    }
    forwardValue937_51_0 = ((com.moon.setting.FloatSetting)(this.t)).getValue();
    }
    life5_23 = ((java.lang.Float)(((java.lang.Float)(forwardValue937_51_0)))).floatValue();
    if (!((life4_5 == null))) {
        break forward_join_90;
    }
    }
    life8_88 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).I)).a__fE(((moom.DT)(life7_39))))).a__ch();
    spill937_4 = life8_88;
    if (!((life4_5 != null))) {
        forwardValue937_67_0 = spill937_4;
        break forward_join_67;
    }
    if (!((spill937_4 != null))) {
        break forward_join_90;
    }
    forwardValue937_67_0 = life8_88;
    }
    life9_103 = ((net.minecraft.block.Block)(forwardValue937_67_0)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).I)), ((moom.DT)(life7_39)));
    life5_23 = ((life9_103 * (0x1.0p0f - (((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.u)).getValue())))).floatValue() / 0x1.9p6f))) * (0x1.0p0f / life9_103));
    }
    spill937_5 = life6_29;
    if (!((life4_5 != null))) {
        forwardValue937_103_0 = spill937_5;
        break forward_join_103;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((com.moon.module.impl.BedBreaker)(spill937_5)).a())), ((double)(((double) (0x1.0p0f - life5_23))))) > 0))) {
        break forward_join_186;
    }
    forwardValue937_103_0 = ((com.moon.module.impl.BedBreaker)(life6_29)).a(((double)(0x1.0p0d)));
    }
    recovery.source.CarrierOps.discard(forwardValue937_103_0);
    if (!((life4_5 == null))) {
        break forward_join_186;
    }
    }
    forwardValue937_109_0 = ((com.moon.setting.BooleanSetting)(this.s)).getValue();
    }
    spill937_6 = ((java.lang.Boolean)(forwardValue937_109_0));
    if (!((life4_5 != null))) {
        forwardValue937_117_0 = spill937_6;
        break forward_join_117;
    }
    forwardValue937_113_0 = ((((java.lang.Boolean)(spill937_6)).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue937_113_0 == 0))) {
        break forward_join_122;
    }
    forwardValue937_117_0 = ((com.moon.setting.FloatSetting)(this.t)).getValue();
    }
    life5_23 = ((java.lang.Float)(((java.lang.Float)(forwardValue937_117_0)))).floatValue();
    if (!((life4_5 == null))) {
        break forward_join_172;
    }
    }
    spill937_7 = com.moon.module.impl.SpeedMine.d;
    if (!((life4_5 != null))) {
        forwardValue937_173_0 = spill937_7;
        break forward_join_173;
    }
    if (!((((net.minecraft.client.Minecraft)(spill937_7)).V != null))) {
        break forward_join_172;
    }
    spill937_8 = com.moon.module.impl.SpeedMine.d;
    if (!((life4_5 != null))) {
        forwardValue937_173_0 = spill937_8;
        break forward_join_173;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(spill937_8)).V)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_172;
    }
    life8_194 = ((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).V)).a();
    spill937_9 = com.moon.module.impl.SpeedMine.d;
    if (!((life4_5 != null))) {
        forwardValue937_173_0 = spill937_9;
        break forward_join_173;
    }
    life9_202 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(spill937_9)).I)).a__fE(((moom.DT)(life8_194))))).a__ch();
    if (!((life9_202 != null))) {
        break forward_join_172;
    }
    life10_212 = ((net.minecraft.block.Block)(life9_202)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).I)), ((moom.DT)(life8_194)));
    life5_23 = ((life10_212 * (0x1.0p0f - (((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.u)).getValue())))).floatValue() / 0x1.9p6f))) * (0x1.0p0f / life10_212));
    }
    forwardValue937_173_0 = com.moon.module.impl.SpeedMine.d;
    }
    spill937_10 = ((net.minecraft.client.Minecraft)(forwardValue937_173_0)).F;
    if (!((life4_5 != null))) {
        forwardValue937_184_0 = spill937_10;
        break forward_join_184;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((moom.jI)(spill937_10)).g)), ((float)((0x1.0p0f - life5_23)))) > 0))) {
        break forward_join_186;
    }
    forwardValue937_184_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.SpeedMine.d)).F;
    }
    ((moom.jI)(forwardValue937_184_0)).g = ((float)(0x1.0p0f));
    }
    return;
}


private java.lang.Boolean lambda$new$0() {
int forwardValue938_15_0;
    int forwardValue938_17_0;
    boolean spill938_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (com.moon.module.impl.SpeedMine.v ^ 85964041216239L);
    life3_5 = com.moon.bF.b();
    spill938_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue938_15_0 = ((spill938_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill938_0))) {
        break forward_join_16;
    }
    forwardValue938_15_0 = 1;
    }
    forwardValue938_17_0 = forwardValue938_15_0;
    break forward_join_17;
    }
    forwardValue938_17_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue938_17_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_20(com.moon.module.impl.SpeedMine a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_a8311c5029409a1a_originalDynamicSite7_38(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2676_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
