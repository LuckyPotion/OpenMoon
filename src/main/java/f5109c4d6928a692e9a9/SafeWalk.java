package com.moon.module.impl;


public class SafeWalk extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.moon.setting.BooleanSetting t;

private static long u;

private static java.lang.String[] v;

private static java.lang.String[] w;

private static java.util.Map x;

public SafeWalk(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_8d4a42c22cbb84fc(com.moon.module.impl.SafeWalk receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.SafeWalk.u ^ 7431538991409L);

    com.moon.module.impl.SafeWalk.__sourceConstructorInit_8d4a42c22cbb84fc_0(((com.moon.module.impl.SafeWalk)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.SafeWalk)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_2(15653, (4519084584612335919L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_4(1680, (3727300838131280536L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.SafeWalk)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_8(28546, (4404471958095348619L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_10(14141, (5205405168601275190L ^ local5)))), ((boolean)(true))))).a()));

    return;

}



static {
u = ((long)(((moom._a)(moom._c.a(((long)(392869697946390854L)), ((long)(8896366248648794160L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101073756924867L)))));

    x = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.SafeWalk.u ^ 13216691555841L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill383_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill383_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill383_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill383_14 = new byte[8];

    (__sourceSpill383_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill383_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation383_16 = __sourceSpill383_14;

    ((javax.crypto.Cipher)(__sourceSpill383_11)).init(((int)(__sourceSpill383_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill383_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation383_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "gKº|VÝ½1C]Þ$Ê\nÕ(\020OXã>ÃKô(W8¨\021´\000\"\007usögjè#\002rp4v}¯l]$"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill383_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill383_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill383_29)).doFinal(((byte[])(__sourceSpill383_28)));

        java.lang.String __sourceSpill383_34 = ((java.lang.String)(com.moon.module.impl.SafeWalk.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill383_35 = local9_life19;

        int __sourceSpill383_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill383_35)[__sourceSpill383_36] = __sourceSpill383_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "_ª\033æÞÁ\032>Ö ³&¿q( ¨Y?W\036qG}æÕ»ÞRÈúÒ\003º\001ÖHáDÀ¢Ô\002äÀ¶¹"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill383_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill383_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill383_43)).doFinal(((byte[])(__sourceSpill383_42)));

        java.lang.String __sourceSpill383_48 = ((java.lang.String)(com.moon.module.impl.SafeWalk.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill383_49 = local9_life19;

        int __sourceSpill383_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill383_49)[__sourceSpill383_50] = __sourceSpill383_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    v = ((java.lang.String[])(local9_life19));

    w = ((java.lang.String[])(new java.lang.String[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_8d4a42c22cbb84fc_0(com.moon.module.impl.SafeWalk a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

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
        byte[] spill1180_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1180_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1180_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1180_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1180_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1180_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12173);
    if (((com.moon.module.impl.SafeWalk.w)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.SafeWalk.x)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.SafeWalk.x)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lr", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.SafeWalk.v)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.SafeWalk.w)[life5_8] = com.moon.module.impl.SafeWalk.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.SafeWalk.w)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.SafeWalk.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2610_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.dR p0) {
int lexicalValue243_20_0;
    int lexicalValue243_33_0;
    int lexicalValue243_72_0;
    int lexicalValue243_78_0;
    boolean spill243_0;
    boolean spill243_1;
    long life2_3;
    int[] life4_5;
    int life5_45;
    int life6_47;
    moom.DT life7_66;
    lexical_join_83: {
    lexical_join_78: {
    lexical_join_72: {
    lexical_join_71: {
    lexical_join_33: {
    lexical_join_32: {
    lexical_join_31: {
    lexical_join_20: {
    lexical_join_15: {
    life2_3 = (com.moon.module.impl.SafeWalk.u ^ 64952346670867L);
    life4_5 = com.moon.bx.b();
    spill243_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        lexicalValue243_20_0 = ((spill243_0) ? 1 : 0);
        break lexical_join_20;
    }
    if (!(spill243_0)) {
        break lexical_join_15;
    }
    return;
    }
    lexicalValue243_20_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        lexicalValue243_33_0 = lexicalValue243_20_0;
        break lexical_join_33;
    }
    if (!((lexicalValue243_20_0 == 0))) {
        break lexical_join_32;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).A)) {
        break lexical_join_31;
    }
    ((com.moon.dR)(p0)).setCancelled(((boolean)(true)));
    }
    return;
    }
    lexicalValue243_33_0 = 0;
    }
    life5_45 = lexicalValue243_33_0;
    life6_47 = 0;
    lexical_cycle_36: while (true) {
    lexical_join_69: {
    lexical_join_68: {
    if (!((life6_47 <= 4))) {
        break lexical_join_71;
    }
    life7_66 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).o - ((double) life6_47)), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).p);
    if (!((life4_5 == null))) {
        break lexical_join_69;
    }
    spill243_1 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).I)).a__Boolean(((moom.DT)(life7_66)));
    if (!((life4_5 == null))) {
        lexicalValue243_72_0 = ((spill243_1) ? 1 : 0);
        break lexical_join_72;
    }
    if (!((!spill243_1))) {
        break lexical_join_68;
    }
    life5_45 = 1;
    if (!((life4_5 != null))) {
        break lexical_join_71;
    }
    }
    life6_47 += 1;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    lexicalValue243_72_0 = life5_45;
    }
    if (!((life4_5 == null))) {
        lexicalValue243_78_0 = lexicalValue243_72_0;
        break lexical_join_78;
    }
    if (!((lexicalValue243_72_0 == 0))) {
        break lexical_join_83;
    }
    lexicalValue243_78_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).A) ? 1 : 0);
    }
    if (!((lexicalValue243_78_0 != 0))) {
        break lexical_join_83;
    }
    ((com.moon.dR)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
java.lang.Object lexicalValue244_15_0;
    net.minecraft.client.Minecraft lexicalValue244_24_0;
    java.lang.Object lexicalValue244_31_0;
    int lexicalValue244_78_0;
    net.minecraft.client.Minecraft lexicalValue244_80_0;
    int lexicalValue244_83_0;
    int lexicalValue244_85_0;
    int lexicalValue244_91_0;
    int lexicalValue244_137_0;
    int lexicalValue244_153_0;
    net.minecraft.client.Minecraft lexicalValue244_155_0;
    int lexicalValue244_158_0;
    int lexicalValue244_160_0;
    com.moon.event.TickPhase spill244_0;
    net.minecraft.client.Minecraft spill244_1;
    net.minecraft.client.multiplayer.WorldClient spill244_2;
    boolean spill244_3;
    boolean spill244_4;
    boolean spill244_5;
    net.minecraft.client.Minecraft spill244_6;
    boolean spill244_7;
    boolean spill244_8;
    net.minecraft.client.Minecraft spill244_9;
    long life2_3;
    int[] life4_5;
    int life5_64;
    moom.DT life6_79;
    int life7_127;
    int life5_133;
    int life6_135;
    moom.DT life7_154;
    int life7_229;
    lexical_join_164: {
    lexical_join_160: {
    lexical_join_159: {
    lexical_join_158: {
    lexical_join_157: {
    lexical_join_155: {
    lexical_join_153: {
    lexical_join_146: {
    lexical_join_137: {
    lexical_join_129: {
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_85: {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_80: {
    lexical_join_78: {
    lexical_join_71: {
    lexical_join_31: {
    lexical_join_24: {
    lexical_join_15: {
    life2_3 = (com.moon.module.impl.SafeWalk.u ^ 116283349365806L);
    life4_5 = com.moon.bx.b();
    spill244_0 = ((com.moon.event.TickEvent)(p0)).getPhase();
    if (!((life4_5 == null))) {
        lexicalValue244_15_0 = spill244_0;
        break lexical_join_15;
    }
    if (!((spill244_0 == com.moon.event.TickPhase.PRE))) {
        break lexical_join_164;
    }
    lexicalValue244_15_0 = ((com.moon.setting.BooleanSetting)(this.t)).getValue();
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(lexicalValue244_15_0)))).booleanValue())) {
        break lexical_join_164;
    }
    spill244_1 = com.moon.module.impl.SafeWalk.d;
    if (!((life4_5 == null))) {
        lexicalValue244_24_0 = spill244_1;
        break lexical_join_24;
    }
    if (!((((net.minecraft.client.Minecraft)(spill244_1)).K != null))) {
        break lexical_join_164;
    }
    lexicalValue244_24_0 = com.moon.module.impl.SafeWalk.d;
    }
    spill244_2 = ((net.minecraft.client.Minecraft)(lexicalValue244_24_0)).I;
    if (!((life4_5 == null))) {
        lexicalValue244_31_0 = spill244_2;
        break lexical_join_31;
    }
    if (!((spill244_2 != null))) {
        break lexical_join_164;
    }
    lexicalValue244_31_0 = ((com.moon.setting.BooleanSetting)(this.s)).getValue();
    }
    spill244_3 = ((java.lang.Boolean)(((java.lang.Boolean)(lexicalValue244_31_0)))).booleanValue();
    if (!((life4_5 == null))) {
        lexicalValue244_91_0 = ((spill244_3) ? 1 : 0);
        break lexical_join_91;
    }
    if (!((!spill244_3))) {
        break lexical_join_90;
    }
    life5_64 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).W)).aq)).b();
    life6_79 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).o - 0x1.0p0d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).p);
    moom.pz.a(((int)(life5_64)));
    spill244_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).A;
    if (!((life4_5 == null))) {
        lexicalValue244_78_0 = ((spill244_4) ? 1 : 0);
        break lexical_join_78;
    }
    if (!(spill244_4)) {
        break lexical_join_71;
    }
    spill244_5 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).I)).a__Boolean(((moom.DT)(life6_79)));
    if (!((life4_5 == null))) {
        lexicalValue244_83_0 = ((spill244_5) ? 1 : 0);
        break lexical_join_83;
    }
    if (!((!spill244_5))) {
        break lexical_join_82;
    }
    }
    spill244_6 = com.moon.module.impl.SafeWalk.d;
    if (!((life4_5 == null))) {
        lexicalValue244_80_0 = spill244_6;
        break lexical_join_80;
    }
    lexicalValue244_78_0 = ((org.lwjgl.input.Keyboard.isKeyDown(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(spill244_6)).W)).aq)).b())))) ? 1 : 0);
    }
    if (!((lexicalValue244_78_0 != 0))) {
        break lexical_join_84;
    }
    lexicalValue244_80_0 = com.moon.module.impl.SafeWalk.d;
    }
    if (!((((net.minecraft.client.Minecraft)(lexicalValue244_80_0)).P == null))) {
        break lexical_join_84;
    }
    }
    lexicalValue244_83_0 = 1;
    }
    lexicalValue244_85_0 = lexicalValue244_83_0;
    break lexical_join_85;
    }
    lexicalValue244_85_0 = 0;
    }
    life7_127 = lexicalValue244_85_0;
    moom.pz.a(((int)(life5_64)), ((boolean)__sourceIntrinsic_integerToBoolean((life7_127))));
    return;
    }
    lexicalValue244_91_0 = 0;
    }
    life5_133 = lexicalValue244_91_0;
    life6_135 = 0;
    lexical_cycle_94: while (true) {
    lexical_join_127: {
    lexical_join_126: {
    if (!((life6_135 <= 4))) {
        break lexical_join_129;
    }
    life7_154 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).n, (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).o - ((double) life6_135)), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).p);
    if (!((life4_5 == null))) {
        break lexical_join_127;
    }
    spill244_7 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).I)).a__Boolean(((moom.DT)(life7_154)));
    if (!((life4_5 == null))) {
        lexicalValue244_137_0 = ((spill244_7) ? 1 : 0);
        break lexical_join_137;
    }
    if (!((!spill244_7))) {
        break lexical_join_126;
    }
    life5_133 = 1;
    if (!((life4_5 != null))) {
        break lexical_join_129;
    }
    }
    life6_135 += 1;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_94; }
    break lexical_cycle_94;
    }
    }
    life6_135 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).W)).aq)).b();
    moom.pz.a(((int)(life6_135)));
    lexicalValue244_137_0 = life5_133;
    }
    if (!((life4_5 == null))) {
        lexicalValue244_153_0 = lexicalValue244_137_0;
        break lexical_join_153;
    }
    if (!((lexicalValue244_137_0 == 0))) {
        break lexical_join_146;
    }
    spill244_8 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.SafeWalk.d)).K)).A;
    if (!((life4_5 == null))) {
        lexicalValue244_158_0 = ((spill244_8) ? 1 : 0);
        break lexical_join_158;
    }
    if (!((!spill244_8))) {
        break lexical_join_157;
    }
    }
    spill244_9 = com.moon.module.impl.SafeWalk.d;
    if (!((life4_5 == null))) {
        lexicalValue244_155_0 = spill244_9;
        break lexical_join_155;
    }
    lexicalValue244_153_0 = ((org.lwjgl.input.Keyboard.isKeyDown(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(spill244_9)).W)).aq)).b())))) ? 1 : 0);
    }
    if (!((lexicalValue244_153_0 != 0))) {
        break lexical_join_159;
    }
    lexicalValue244_155_0 = com.moon.module.impl.SafeWalk.d;
    }
    if (!((((net.minecraft.client.Minecraft)(lexicalValue244_155_0)).P == null))) {
        break lexical_join_159;
    }
    }
    lexicalValue244_158_0 = 1;
    }
    lexicalValue244_160_0 = lexicalValue244_158_0;
    break lexical_join_160;
    }
    lexicalValue244_160_0 = 0;
    }
    life7_229 = lexicalValue244_160_0;
    moom.pz.a(((int)(life6_135)), ((boolean)__sourceIntrinsic_integerToBoolean((life7_229))));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8d4a42c22cbb84fc_originalDynamicSite1282_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2610_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
