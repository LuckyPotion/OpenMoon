package com.moon.module.impl;


public class TargetHud extends com.moon.module.Module {

private com.moon.setting.ModeSetting<com.moon.b7> s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.ColorSetting u;

private com.moon.setting.FloatSetting v;

private com.moon.setting.FloatSetting w;

private com.moon.module.impl.Effects x;

private float y;

private float z;

private boolean A;

private boolean B;

private static long C;

private static java.lang.String[] D;

private static java.lang.String[] E;

private static java.util.Map F;

public TargetHud(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_b51da7efcaa9e0e9(com.moon.module.impl.TargetHud receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.TargetHud.C ^ 140650697572211L);

    com.moon.module.impl.TargetHud.__sourceConstructorInit_b51da7efcaa9e0e9_0(((com.moon.module.impl.TargetHud)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.TargetHud)(receiver)).s = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_2(15397, (7270098912692370547L ^ local5)))), ((java.lang.Class)(com.moon.b7.class))))).a(((java.lang.String)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_5(8700, (6760686917389672875L ^ local5)))), ((java.lang.Enum)(com.moon.b7.MOON))))).a()));

    ((com.moon.module.impl.TargetHud)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_10(13031, (3381882401145615028L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_12(19998, (1735140623070858828L ^ local5)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_14(receiver)))))).a()));

    ((com.moon.module.impl.TargetHud)(receiver)).u = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_18(27702, (4512463749361151079L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_20(6423, (8151686860237003079L ^ local5)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB()))))).a(((java.util.function.Supplier)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_24(receiver)))))).a()));

    ((com.moon.module.impl.TargetHud)(receiver)).v = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)("x"))))).a(((java.lang.String)("X")), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.86ap16f)), ((float)(0x1.0p0f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_30()))))).a()));

    ((com.moon.module.impl.TargetHud)(receiver)).w = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)("y"))))).a(((java.lang.String)("Y")), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.86ap16f)), ((float)(0x1.0p0f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_36()))))).a()));

    return;

}



static {
C = ((long)(((moom._a)(moom._c.a(((long)(-7325403726725303014L)), ((long)(-4173693406751039820L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96136916696201L)))));

    F = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.module.impl.TargetHud.C ^ 24867787740385L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill393_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill393_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill393_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill393_14 = new byte[8];

    (__sourceSpill393_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill393_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation393_16 = __sourceSpill393_14;

    ((javax.crypto.Cipher)(__sourceSpill393_11)).init(((int)(__sourceSpill393_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill393_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation393_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[6];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "èax6õ|Ã½3¿ïxDto\025\033 (¢\000«÷<®\030¯q3ë\005u4ý åyf(ZÑ\026xSÖ¸IÃÅHJN\037Ö\003ig6I31X¾\030Ê?H£ÕiÝ&¿§\022Ë} ¬4xç1z¡-\023F5k.j/Ý7\004ö2üÂãôß\020W|¢fS\030Èb3È¦Ò\r³"))).length();

    int local5_life24 = 40;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill393_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill393_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill393_29)).doFinal(((byte[])(__sourceSpill393_28)));

        java.lang.String __sourceSpill393_34 = ((java.lang.String)(com.moon.module.impl.TargetHud.c(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill393_35 = local9_life19;

        int __sourceSpill393_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill393_35)[__sourceSpill393_36] = __sourceSpill393_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "ÆÌëÛòÎ~\r9\017B³¦\020AT\000$þ tCâlêãÌòÞ"))).length();

    local5_life24 = 16;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill393_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill393_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill393_43)).doFinal(((byte[])(__sourceSpill393_42)));

        java.lang.String __sourceSpill393_48 = ((java.lang.String)(com.moon.module.impl.TargetHud.c(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill393_49 = local9_life19;

        int __sourceSpill393_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill393_49)[__sourceSpill393_50] = __sourceSpill393_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    D = ((java.lang.String[])(local9_life19));

    E = ((java.lang.String[])(new java.lang.String[6]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b51da7efcaa9e0e9_0(com.moon.module.impl.TargetHud a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public com.moon.setting.FloatSetting b() {
return this.w;
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
        byte[] spill1227_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1227_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1227_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1227_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1227_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1227_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public float c() {
return this.y;
}


public boolean c__Boolean() {
return ((((this.A) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2697_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.TargetHud.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16916);
    if (((com.moon.module.impl.TargetHud.E)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.TargetHud.F)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.TargetHud.F)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/l4", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.TargetHud.D)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.TargetHud.E)[life5_8] = com.moon.module.impl.TargetHud.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.TargetHud.E)[life5_8];
}


private void f() {
this.x = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    return;
}


public float d() {
return this.z;
}


public boolean d__Boolean() {
return ((((this.B) ? 1 : 0)) != 0);
}


public void a(com.moon.ej p0) {
((com.moon.hx)(((com.moon.module.impl.TargetHud)(this)).a())).a(((boolean)(((com.moon.ej)(p0)).a())));
    return;
}


public void a(com.moon.event.Render2DEvent p0) {
int forwardValue944_60_0;
    int forwardValue944_70_0;
    int forwardValue944_76_0;
    int forwardValue944_83_0;
    com.moon.module.impl.TargetHud forwardValue944_126_0;
    boolean spill944_0;
    boolean spill944_1;
    com.moon.module.impl.TargetHud spill944_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.moon.hx life5_22;
    moom.DN life6_25;
    int life7_30;
    int life8_35;
    forward_join_131: {
    forward_join_129: {
    forward_join_126: {
    forward_join_107: {
    forward_join_83: {
    forward_join_76: {
    forward_join_70: {
    forward_join_68: {
    forward_join_60: {
    forward_join_58: {
    forward_join_14: {
    life2_3 = (com.moon.module.impl.TargetHud.C ^ 140393757169141L);
    life4_5 = com.moon.bY.b();
    if (!((life4_5 == null))) {
        break forward_join_14;
    }
    if (!((((com.moon.event.Render2DEvent)(p0)).getPhase() == com.moon.event.RenderPhase.POST))) {
        break forward_join_131;
    }
    ((com.moon.module.impl.TargetHud)(this)).f();
    }
    life5_22 = ((com.moon.module.impl.TargetHud)(this)).a();
    life6_25 = ((com.moon.module.impl.TargetHud)(this)).a__DN();
    life7_30 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life6_25)).a())))).intValue();
    life8_35 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life6_25)).b())))).intValue();
    this.A = ((boolean)(((com.moon.module.impl.TargetHud)(this)).a(((int)(life7_30)), ((int)(life8_35)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.v)).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.w)).getValue())))).floatValue())), ((float)(((com.moon.hx)(life5_22)).c())), ((float)(((com.moon.hx)(life5_22)).d())))));
    spill944_0 = org.lwjgl.input.Mouse.isButtonDown(((int)(0)));
    if (!((life4_5 == null))) {
        forwardValue944_60_0 = ((spill944_0) ? 1 : 0);
        break forward_join_60;
    }
    if (!((!spill944_0))) {
        break forward_join_58;
    }
    this.B = ((boolean)(false));
    }
    forwardValue944_60_0 = ((this.A) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue944_70_0 = forwardValue944_60_0;
        break forward_join_70;
    }
    if (!((forwardValue944_60_0 == 0))) {
        break forward_join_68;
    }
    spill944_1 = this.B;
    if (!((life4_5 == null))) {
        forwardValue944_70_0 = ((spill944_1) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill944_1)) {
        break forward_join_129;
    }
    }
    forwardValue944_70_0 = ((org.lwjgl.input.Mouse.isButtonDown(((int)(0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue944_76_0 = forwardValue944_70_0;
        break forward_join_76;
    }
    if (!((forwardValue944_70_0 != 0))) {
        break forward_join_129;
    }
    forwardValue944_76_0 = ((((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetHud.d)).P instanceof moom.gF) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue944_83_0 = forwardValue944_76_0;
        break forward_join_83;
    }
    if (!((forwardValue944_76_0 != 0))) {
        break forward_join_129;
    }
    spill944_2 = this;
    if (!((life4_5 == null))) {
        forwardValue944_126_0 = spill944_2;
        break forward_join_126;
    }
    forwardValue944_83_0 = ((((com.moon.module.impl.TargetHud)(spill944_2)).B) ? 1 : 0);
    }
    if (!((forwardValue944_83_0 == 0))) {
        break forward_join_107;
    }
    this.y = ((float)((((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.v)).getValue())))).floatValue() - ((float) life7_30))));
    this.z = ((float)((((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.w)).getValue())))).floatValue() - ((float) life8_35))));
    this.B = ((boolean)(true));
    }
    ((com.moon.setting.FloatSetting)(this.v)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)((((float) life7_30) + this.y)))))));
    ((com.moon.setting.FloatSetting)(this.w)).setValue(((java.lang.Float)(java.lang.Float.valueOf(((float)((((float) life8_35) + this.z)))))));
    forwardValue944_126_0 = this;
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(((com.moon.module.impl.TargetHud)(forwardValue944_126_0)).x)).a__gW())).c();
    }
    ((com.moon.hx)(life5_22)).a__Void();
    }
    return;
}


public void a(com.moon.ei p0) {
((com.moon.hx)(((com.moon.module.impl.TargetHud)(this)).a())).b__Void();
    return;
}


private com.moon.hx a() {
java.lang.Object local1 = ((com.moon.b7)(((com.moon.b7)(((com.moon.setting.ModeSetting)(this.s)).getValue())))).a();
    ((com.moon.hx)(local1)).a(((com.moon.module.impl.TargetHud)(this)));
    return ((com.moon.hx)(local1));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean a(int p0, int p1, float p2, float p3, float p4, float p5) {
int forwardValue943_19_0;
    int forwardValue943_26_0;
    int forwardValue943_35_0;
    int forwardValue943_39_0;
    int forwardValue943_41_0;
    int spill943_0;
    long life7_3;
    net.minecraft.entity.Entity[] life9_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (com.moon.module.impl.TargetHud.C ^ 10849532640796L);
    life9_5 = com.moon.bY.b();
    spill943_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(p2)));
    if (!((life9_5 == null))) {
        forwardValue943_19_0 = spill943_0;
        break forward_join_19;
    }
    if (!((spill943_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue943_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((p2 + p4))));
    }
    if (!((life9_5 == null))) {
        forwardValue943_26_0 = forwardValue943_19_0;
        break forward_join_26;
    }
    if (!((forwardValue943_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue943_26_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(p3)));
    }
    if (!((life9_5 == null))) {
        forwardValue943_35_0 = forwardValue943_26_0;
        break forward_join_35;
    }
    if (!((forwardValue943_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue943_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((p3 + p5))));
    }
    if (!((life9_5 == null))) {
        forwardValue943_39_0 = forwardValue943_35_0;
        break forward_join_39;
    }
    if (!((forwardValue943_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue943_39_0 = 1;
    }
    forwardValue943_41_0 = forwardValue943_39_0;
    break forward_join_41;
    }
    forwardValue943_41_0 = 0;
    }
    return ((forwardValue943_41_0) != 0);
}


public com.moon.module.impl.Effects a__lU() {
return this.x;
}


public com.moon.setting.ModeSetting<com.moon.b7> a__kY() {
return this.s;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.v;
}


public com.moon.setting.ColorSetting a__kX() {
return this.u;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.t;
}


private moom.DN<java.lang.Integer, java.lang.Integer> a__DN() {
int local1 = org.lwjgl.input.Mouse.getX();
    int local2 = (org.lwjgl.opengl.Display.getHeight() - org.lwjgl.input.Mouse.getY());
    float local3 = ((float) ((moom.ir)(com.moon.nS.a())).c());
    local1 = ((int) (((float) local1) / local3));
    local2 = ((int) (((float) local2) / local3));
    return new moom.DN(java.lang.Integer.valueOf(((int)(local1))), java.lang.Integer.valueOf(((int)(local2))));
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.TargetHud.C ^ 35868138005795L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.s)).getValue() == com.moon.b7.MOON) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
java.lang.Object forwardValue945_16_0;
    int forwardValue945_22_0;
    int forwardValue945_24_0;
    java.lang.Object spill945_0;
    boolean spill945_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.TargetHud.C ^ 135736492477184L);
    life3_5 = com.moon.bY.b();
    spill945_0 = ((com.moon.setting.ModeSetting)(this.s)).getValue();
    if (!((life3_5 == null))) {
        forwardValue945_16_0 = spill945_0;
        break forward_join_16;
    }
    if (!((spill945_0 == com.moon.b7.MOON))) {
        break forward_join_23;
    }
    forwardValue945_16_0 = ((com.moon.setting.BooleanSetting)(this.t)).getValue();
    }
    spill945_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue945_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue945_22_0 = ((spill945_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill945_1))) {
        break forward_join_23;
    }
    forwardValue945_22_0 = 1;
    }
    forwardValue945_24_0 = forwardValue945_22_0;
    break forward_join_24;
    }
    forwardValue945_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue945_24_0))));
}


private static java.lang.Boolean lambda$new$3() {
return java.lang.Boolean.valueOf(((boolean)(false)));
}


private static java.lang.Boolean lambda$new$2() {
return java.lang.Boolean.valueOf(((boolean)(false)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_14(com.moon.module.impl.TargetHud a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_24(com.moon.module.impl.TargetHud a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_30() throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_b51da7efcaa9e0e9_originalDynamicSite1302_36() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2697_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
