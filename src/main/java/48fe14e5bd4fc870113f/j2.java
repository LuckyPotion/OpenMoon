package com.moon;


public class j2 implements com.moon.scripting.api.functions.ModulesFunctions {

private static boolean b;

private static final long a;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public j2() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(7156335035940350857L)), ((long)(-2323277688652571951L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37767591904788L)))));
    int __sourceSpill176_6 = 1;
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.j2.a ^ 68850611909366L);
    com.moon.j2.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill176_6))));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill176_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill176_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill176_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill176_16 = new byte[8];
    (__sourceSpill176_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill176_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation176_18 = __sourceSpill176_16;
    ((javax.crypto.Cipher)(__sourceSpill176_13)).init(((int)(__sourceSpill176_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill176_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation176_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[4];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "QÓä~%â\004ñqiù\032FD¹Øv­|\024<à×·ì}¾Ó.]å³\"È3×p_\036ºt,$ù\007ãÀEÍ\000ZÃ!yyªÜæÞ(T8À¹¿5¨Ku@D\r\034©yûòGdíùZÖFU«Ì5v×ÜI­\033²ók"))).length();
    int local5_life26 = 72;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill176_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill176_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill176_31)).doFinal(((byte[])(__sourceSpill176_30)));
        java.lang.String __sourceSpill176_36 = ((java.lang.String)(com.moon.j2.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill176_37 = local9_life21;
        int __sourceSpill176_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill176_37)[__sourceSpill176_38] = __sourceSpill176_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    local8_life25 = ((java.lang.String)((local6_life23 = "°@PHu»°RÛDc\017\036)\013¨#Íú´ðû`ÃÄü\030bæà\f@0¥`%@5!s\003_üµ0³ã\004Áº¸.HE\\yëÖæÇÖ)³FÉ¢ºp£Pº \\±Î\031ïÇ\027mj´\031â\026>Õ\001Ó»r©"))).length();
    local5_life26 = 32;
    local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill176_43 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill176_44 = local2_life11;
        byte[] local10_life46 = ((javax.crypto.Cipher)(__sourceSpill176_44)).doFinal(((byte[])(__sourceSpill176_43)));
        java.lang.String __sourceSpill176_49 = ((java.lang.String)(com.moon.j2.a(((byte[])(local10_life46))))).intern();
        java.lang.String[] __sourceSpill176_50 = local9_life21;
        int __sourceSpill176_51 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill176_50)[__sourceSpill176_51] = __sourceSpill176_49;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    c = ((java.lang.String[])(local9_life21));
    d = ((java.lang.String[])(new java.lang.String[4]));
}


public static boolean b() {
return ((((com.moon.j2.b) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
com.moon.j2.b = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.j2.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private void a() {
com.moon.fU local1 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    com.moon.module.impl.ClickGUI local2 = ((com.moon.module.impl.ClickGUI)(((com.moon.fU)(local1)).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))));
    ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a(((java.lang.Runnable)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite414_6(local2, local1))));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1727_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/j2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.j2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1831);
    if (((com.moon.j2.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.j2.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.j2.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/j2", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.j2.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.j2.d)[life5_8] = __sourceExactCall_de3a246cb89d2b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.j2.d)[life5_8];
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
        byte[] spill446_0 = p0;
        life4_9 += 1;
        life5_44 = (spill446_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill446_1 = p0;
        life4_9 += 1;
        life5_76 = (spill446_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill446_2 = p0;
        life4_9 += 1;
        life5_91 = (spill446_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private <T> T a(java.lang.Object p0) {
try {
        return ((T)(p0));
    } catch (java.lang.Exception caught2) {
        ((java.lang.Exception)(caught2)).printStackTrace();
        return null;
    }
}


public void register(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.luaj.vm2.LuaTable p3) {
long life5_3;
    com.moon.fU life8_7;
    com.moon.module.impl.HUD life9_12;
    int life7_13;
    com.moon.module.impl.Script life10_48;
    java.util.List life11_52;
    com.moon.setting.ColorSetting life12_78;
    forward_join_35: {
    forward_join_34: {
    life5_3 = (com.moon.j2.a ^ 27475457902577L);
    boolean spill455_0 = com.moon.j2.c();
    life8_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life9_12 = ((com.moon.module.impl.HUD)(((com.moon.fU)(life8_7)).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))));
    life7_13 = ((spill455_0) ? 1 : 0);
    if (!((life7_13 == 0))) { break forward_join_34; }
    if (!((((com.moon.fU)(life8_7)).a(((java.lang.String)(p0))) != null))) { break forward_join_35; }
    java.lang.String __stackOp455_10_0 = p0;
    java.lang.String __stackOp455_10_1 = __sourceIntrinsic_44a2f59a0b7e_invokedynamic455_9(25109, (7528911127120462870L ^ life5_3));
    com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_44a2f59a0b7e_invokedynamic455_12(__stackOp455_10_1, __stackOp455_10_0, __sourceIntrinsic_44a2f59a0b7e_invokedynamic455_11(1403, (8535461525188027259L ^ life5_3))))));
    }
    return;
    }
    life10_48 = new com.moon.module.impl.Script(p0, p1, p2, p3);
    int spill455_1 = 4411;
    life11_52 = ((com.moon.module.impl.Script)(life10_48)).getSettings();
    life12_78 = ((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_44a2f59a0b7e_invokedynamic455_15(spill455_1, (5604812894388795194L ^ life5_3))))))).a(((java.lang.String)(__sourceIntrinsic_44a2f59a0b7e_invokedynamic455_17(30734, (257524671347580428L ^ life5_3)))), ((int)(-1))))).a(((java.util.function.Supplier)(new com.moon.gR(life9_12)))))).a(((com.moon.kR)(new com.moon.gQ(life9_12, ((com.moon.module.impl.HUD)(life9_12)).a__hq())))))).a();
    ((java.util.List)(life11_52)).add(((java.lang.Object)(life12_78)));
    ((com.moon.cX)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cX())).a(((com.moon.cZ)(life10_48)));
    ((com.moon.fU)(life8_7)).a(((com.moon.module.Module)(life10_48)));
    this.a();
    return;
}


public void create_boolean_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) {
com.moon.module.Module forwardValue447_19_0;
    boolean spill447_0;
    com.moon.module.Module spill447_1;
    long life5_3;
    com.moon.fU life8_7;
    int life7_8;
    com.moon.module.Module life9_12;
    com.moon.module.impl.Script life10_26;
    com.moon.setting.BooleanSetting life11_38;
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life5_3 = (com.moon.j2.a ^ 34718380942278L);
    spill447_0 = com.moon.j2.c();
    life8_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life7_8 = ((spill447_0) ? 1 : 0);
    life9_12 = ((com.moon.fU)(life8_7)).a(((java.lang.String)(p0)));
    spill447_1 = life9_12;
    if (!((life7_8 == 0))) {
        forwardValue447_19_0 = spill447_1;
        break forward_join_19;
    }
    if (!((((spill447_1 instanceof com.moon.module.impl.Script) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue447_19_0 = life9_12;
    }
    life10_26 = ((com.moon.module.impl.Script)(forwardValue447_19_0));
    if (!((life7_8 != 0))) {
        break forward_join_24;
    }
    }
    return;
    }
    life11_38 = ((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(p1))))).a(((java.lang.String)(p2)), ((boolean)(p3))))).a();
    ((java.util.List)(((com.moon.module.impl.Script)(life10_26)).getSettings())).add(((java.lang.Object)(life11_38)));
    this.a();
    return;
}


public void create_float_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, float p3, float p4, float p5, float p6) {
com.moon.module.Module forwardValue449_19_0;
    boolean spill449_0;
    com.moon.module.Module spill449_1;
    long life8_3;
    com.moon.fU life11_7;
    int life10_8;
    com.moon.module.Module life12_12;
    com.moon.module.impl.Script life13_26;
    com.moon.setting.FloatSetting life14_41;
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life8_3 = (com.moon.j2.a ^ 97839104596700L);
    spill449_0 = com.moon.j2.c();
    life11_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life10_8 = ((spill449_0) ? 1 : 0);
    life12_12 = ((com.moon.fU)(life11_7)).a(((java.lang.String)(p0)));
    spill449_1 = life12_12;
    if (!((life10_8 == 0))) {
        forwardValue449_19_0 = spill449_1;
        break forward_join_19;
    }
    if (!((((spill449_1 instanceof com.moon.module.impl.Script) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue449_19_0 = life12_12;
    }
    life13_26 = ((com.moon.module.impl.Script)(forwardValue449_19_0));
    if (!((life10_8 != 0))) {
        break forward_join_24;
    }
    }
    return;
    }
    life14_41 = ((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(p1))))).a(((java.lang.String)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6))))).a();
    ((java.util.List)(((com.moon.module.impl.Script)(life13_26)).getSettings())).add(((java.lang.Object)(life14_41)));
    this.a();
    return;
}


public void create_integer_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, int p4, int p5, int p6) {
com.moon.module.Module forwardValue450_19_0;
    boolean spill450_0;
    com.moon.module.Module spill450_1;
    long life8_3;
    com.moon.fU life11_7;
    int life10_8;
    com.moon.module.Module life12_12;
    com.moon.module.impl.Script life13_26;
    com.moon.setting.IntegerSetting life14_41;
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life8_3 = (com.moon.j2.a ^ 54214217216209L);
    spill450_0 = com.moon.j2.c();
    life11_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life10_8 = ((spill450_0) ? 1 : 0);
    life12_12 = ((com.moon.fU)(life11_7)).a(((java.lang.String)(p0)));
    spill450_1 = life12_12;
    if (!((life10_8 == 0))) {
        forwardValue450_19_0 = spill450_1;
        break forward_join_19;
    }
    if (!((((spill450_1 instanceof com.moon.module.impl.Script) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue450_19_0 = life12_12;
    }
    life13_26 = ((com.moon.module.impl.Script)(forwardValue450_19_0));
    if (!((life10_8 != 0))) {
        break forward_join_24;
    }
    }
    return;
    }
    life14_41 = ((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(p1))))).a(((java.lang.String)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6))))).a();
    ((java.util.List)(((com.moon.module.impl.Script)(life13_26)).getSettings())).add(((java.lang.Object)(life14_41)));
    this.a();
    return;
}


public void create_color_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {
com.moon.module.Module forwardValue448_19_0;
    boolean spill448_0;
    com.moon.module.Module spill448_1;
    long life5_3;
    com.moon.fU life8_6;
    com.moon.module.Module life9_11;
    int life7_12;
    com.moon.module.impl.Script life10_26;
    com.moon.setting.ColorSetting life11_38;
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life5_3 = (com.moon.j2.a ^ 87951837525554L);
    life8_6 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    spill448_0 = com.moon.j2.c();
    life9_11 = ((com.moon.fU)(life8_6)).a(((java.lang.String)(p0)));
    life7_12 = ((spill448_0) ? 1 : 0);
    spill448_1 = life9_11;
    if (!((life7_12 == 0))) {
        forwardValue448_19_0 = spill448_1;
        break forward_join_19;
    }
    if (!((((spill448_1 instanceof com.moon.module.impl.Script) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue448_19_0 = life9_11;
    }
    life10_26 = ((com.moon.module.impl.Script)(forwardValue448_19_0));
    if (!((life7_12 != 0))) {
        break forward_join_24;
    }
    }
    return;
    }
    life11_38 = ((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(p1))))).a(((java.lang.String)(p2)), ((int)(p3))))).a();
    ((java.util.List)(((com.moon.module.impl.Script)(life10_26)).getSettings())).add(((java.lang.Object)(life11_38)));
    this.a();
    return;
}


public void create_text_setting(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
com.moon.module.Module forwardValue451_19_0;
    boolean spill451_0;
    com.moon.module.Module spill451_1;
    long life5_3;
    com.moon.fU life8_6;
    com.moon.module.Module life9_11;
    int life7_12;
    com.moon.module.impl.Script life10_26;
    com.moon.k5 life11_38;
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life5_3 = (com.moon.j2.a ^ 77918554847115L);
    life8_6 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    spill451_0 = com.moon.j2.c();
    life9_11 = ((com.moon.fU)(life8_6)).a(((java.lang.String)(p0)));
    life7_12 = ((spill451_0) ? 1 : 0);
    spill451_1 = life9_11;
    if (!((life7_12 == 0))) {
        forwardValue451_19_0 = spill451_1;
        break forward_join_19;
    }
    if (!((((spill451_1 instanceof com.moon.module.impl.Script) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue451_19_0 = life9_11;
    }
    life10_26 = ((com.moon.module.impl.Script)(forwardValue451_19_0));
    if (!((life7_12 != 0))) {
        break forward_join_24;
    }
    }
    return;
    }
    life11_38 = ((com.moon.mj)(((com.moon.mj)(com.moon.k5.a(((java.lang.String)(p1))))).a(((java.lang.String)(p2)), ((java.lang.String)(p3))))).a();
    ((java.util.List)(((com.moon.module.impl.Script)(life10_26)).getSettings())).add(((java.lang.Object)(life11_38)));
    this.a();
    return;
}


public void set_setting(java.lang.String p0, java.lang.String p1, java.lang.Object p2) {
com.moon.module.Module forwardValue456_19_0;
    java.lang.Object forwardValue456_33_0;
    int forwardValue456_41_0;
    java.lang.Object forwardValue456_49_0;
    int forwardValue456_62_0;
    java.lang.Object forwardValue456_69_0;
    java.lang.Object forwardValue456_73_0;
    int forwardValue456_84_0;
    int forwardValue456_112_0;
    int forwardValue456_142_0;
    com.moon.setting.Setting forwardValue456_144_0;
    boolean spill456_0;
    com.moon.module.Module spill456_1;
    com.moon.setting.Setting spill456_2;
    int spill456_3;
    java.lang.Object spill456_4;
    com.moon.setting.Setting spill456_5;
    int spill456_6;
    com.moon.setting.Setting spill456_7;
    long life4_3;
    com.moon.fU life7_7;
    int life6_8;
    com.moon.module.Module life8_12;
    com.moon.setting.Setting life9_24;
    java.lang.Number life13_77;
    java.lang.Number life13_116;
    com.moon.setting.EnumSetting life10_137;
    java.lang.Enum life13_144;
    java.lang.Object life14_148;
    com.moon.setting.ModeSetting life11_174;
    java.lang.Enum life13_181;
    java.lang.Object life14_185;
    com.moon.setting.MultiSelectSetting life12_211;
    java.lang.Enum life13_218;
    java.lang.Object life14_222;
    forward_join_165: {
    forward_join_144: {
    forward_join_142: {
    forward_join_138: {
    forward_join_136: {
    forward_join_112: {
    forward_join_110: {
    forward_join_108: {
    forward_join_84: {
    forward_join_82: {
    forward_join_73: {
    forward_join_69: {
    forward_join_68: {
    forward_join_62: {
    forward_join_58: {
    forward_join_49: {
    forward_join_41: {
    forward_join_39: {
    forward_join_33: {
    forward_join_32: {
    forward_join_19: {
    forward_join_18: {
    life4_3 = (com.moon.j2.a ^ 135403024553283L);
    spill456_0 = com.moon.j2.b();
    life7_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life6_8 = ((spill456_0) ? 1 : 0);
    life8_12 = ((com.moon.fU)(life7_7)).a(((java.lang.String)(p0)));
    spill456_1 = life8_12;
    if (!((life6_8 != 0))) {
        forwardValue456_19_0 = spill456_1;
        break forward_join_19;
    }
    if (!((spill456_1 == null))) {
        break forward_join_18;
    }
    return;
    }
    forwardValue456_19_0 = life8_12;
    }
    life9_24 = ((com.moon.module.Module)(forwardValue456_19_0)).getSetting(((java.lang.String)(p1)));
    spill456_2 = life9_24;
    if (!((life6_8 != 0))) {
        forwardValue456_33_0 = spill456_2;
        break forward_join_33;
    }
    if (!((((spill456_2 instanceof com.moon.setting.BooleanSetting) ? 1 : 0) == 0))) {
        break forward_join_32;
    }
    spill456_3 = ((life9_24 instanceof com.moon.k5) ? 1 : 0);
    if (!((life6_8 != 0))) {
        forwardValue456_41_0 = spill456_3;
        break forward_join_41;
    }
    if (!((spill456_3 != 0))) {
        break forward_join_39;
    }
    }
    forwardValue456_33_0 = p2;
    }
    if (!((forwardValue456_33_0 != null))) {
        break forward_join_165;
    }
    ((com.moon.setting.Setting)(life9_24)).setValue(((java.lang.Object)(p2)));
    if (!((life6_8 == 0))) {
        break forward_join_165;
    }
    }
    forwardValue456_41_0 = ((life9_24 instanceof com.moon.setting.FloatSetting) ? 1 : 0);
    }
    if (!((life6_8 != 0))) {
        forwardValue456_62_0 = forwardValue456_41_0;
        break forward_join_62;
    }
    if (!((forwardValue456_41_0 != 0))) {
        break forward_join_58;
    }
    spill456_4 = p2;
    if (!((life6_8 != 0))) {
        forwardValue456_49_0 = spill456_4;
        break forward_join_49;
    }
    if (!((spill456_4 != null))) {
        break forward_join_165;
    }
    forwardValue456_49_0 = p2;
    }
    life13_77 = ((java.lang.Number)(forwardValue456_49_0));
    ((com.moon.setting.Setting)(life9_24)).setValue(((java.lang.Object)(java.lang.Float.valueOf(((float)(((java.lang.Number)(life13_77)).floatValue()))))));
    if (!((life6_8 == 0))) {
        break forward_join_165;
    }
    }
    spill456_5 = life9_24;
    if (!((life6_8 != 0))) {
        forwardValue456_69_0 = spill456_5;
        break forward_join_69;
    }
    forwardValue456_62_0 = ((spill456_5 instanceof com.moon.setting.IntegerSetting) ? 1 : 0);
    }
    if (!((forwardValue456_62_0 == 0))) {
        break forward_join_68;
    }
    spill456_6 = ((life9_24 instanceof com.moon.setting.ColorSetting) ? 1 : 0);
    if (!((life6_8 != 0))) {
        forwardValue456_84_0 = spill456_6;
        break forward_join_84;
    }
    if (!((spill456_6 != 0))) {
        break forward_join_82;
    }
    }
    forwardValue456_69_0 = p2;
    }
    if (!((life6_8 != 0))) {
        forwardValue456_73_0 = forwardValue456_69_0;
        break forward_join_73;
    }
    if (!((forwardValue456_69_0 != null))) {
        break forward_join_165;
    }
    forwardValue456_73_0 = p2;
    }
    life13_116 = ((java.lang.Number)(forwardValue456_73_0));
    ((com.moon.setting.Setting)(life9_24)).setValue(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((java.lang.Number)(life13_116)).intValue()))))));
    if (!((life6_8 == 0))) {
        break forward_join_165;
    }
    }
    forwardValue456_84_0 = ((life9_24 instanceof com.moon.setting.EnumSetting) ? 1 : 0);
    }
    if (!((life6_8 != 0))) {
        forwardValue456_112_0 = forwardValue456_84_0;
        break forward_join_112;
    }
    if (!((forwardValue456_84_0 != 0))) {
        break forward_join_110;
    }
    life10_137 = ((com.moon.setting.EnumSetting)(life9_24));
    life13_144 = (((com.moon.setting.EnumSetting)(life10_137)).getValues())[((java.lang.Integer)(((java.lang.Integer)(p2)))).intValue()];
    life14_148 = this.a(((java.lang.Object)(life13_144)));
    if (!((life14_148 != null))) {
        break forward_join_108;
    }
    ((com.moon.setting.Setting)(life9_24)).setValue(((java.lang.Object)(this.a(((java.lang.Object)(life13_144))))));
    }
    if (!((life6_8 == 0))) {
        break forward_join_165;
    }
    }
    forwardValue456_112_0 = ((life9_24 instanceof com.moon.setting.ModeSetting) ? 1 : 0);
    }
    if (!((life6_8 != 0))) {
        forwardValue456_142_0 = forwardValue456_112_0;
        break forward_join_142;
    }
    if (!((forwardValue456_112_0 != 0))) {
        break forward_join_138;
    }
    life11_174 = ((com.moon.setting.ModeSetting)(life9_24));
    life13_181 = (((com.moon.setting.ModeSetting)(life11_174)).getValues())[((java.lang.Integer)(((java.lang.Integer)(p2)))).intValue()];
    life14_185 = this.a(((java.lang.Object)(life13_181)));
    if (!((life14_185 != null))) {
        break forward_join_136;
    }
    ((com.moon.setting.Setting)(life9_24)).setValue(((java.lang.Object)(this.a(((java.lang.Object)(life13_181))))));
    }
    if (!((life6_8 == 0))) {
        break forward_join_165;
    }
    }
    spill456_7 = life9_24;
    if (!((life6_8 != 0))) {
        forwardValue456_144_0 = spill456_7;
        break forward_join_144;
    }
    forwardValue456_142_0 = ((spill456_7 instanceof com.moon.setting.MultiSelectSetting) ? 1 : 0);
    }
    if (!((forwardValue456_142_0 != 0))) {
        break forward_join_165;
    }
    forwardValue456_144_0 = life9_24;
    }
    life12_211 = ((com.moon.setting.MultiSelectSetting)(forwardValue456_144_0));
    life13_218 = (((com.moon.setting.MultiSelectSetting)(life12_211)).getValues())[((java.lang.Integer)(((java.lang.Integer)(p2)))).intValue()];
    life14_222 = this.a(((java.lang.Object)(life13_218)));
    if (!((life14_222 != null))) {
        break forward_join_165;
    }
    ((com.moon.setting.MultiSelectSetting)(life12_211)).toggle(((java.lang.Enum)(((java.lang.Enum)(this.a(((java.lang.Object)(life13_218))))))));
    }
    return;
}


public void toggle(java.lang.String p0) {
long life2_3;
    com.moon.fU life5_7;
    int life4_8;
    com.moon.module.Module life6_12;
    life2_3 = (com.moon.j2.a ^ 70574348910406L);
    boolean spill1473_0 = com.moon.j2.c();
    life5_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life4_8 = ((spill1473_0) ? 1 : 0);
    life6_12 = ((com.moon.fU)(life5_7)).a(((java.lang.String)(p0)));
    if ((life4_8 == 0)) {
        if ((life6_12 == null)) {
        return;
    }
        ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Void(((java.lang.Runnable)(__sourceIntrinsic_b2d77d765c6a_invokedynamic1473_7(life6_12))));
    }
    return;
}


public void set_state(java.lang.String p0, boolean p1) {
long life3_3;
    com.moon.fU life6_7;
    com.moon.module.Module life7_11;
    int life5_12;
    life3_3 = (com.moon.j2.a ^ 18480635849844L);
    boolean spill1474_0 = com.moon.j2.b();
    life6_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life7_11 = ((com.moon.fU)(life6_7)).a(((java.lang.String)(p0)));
    life5_12 = ((spill1474_0) ? 1 : 0);
    if ((life5_12 != 0)) {
        if ((life7_11 == null)) {
        return;
    }
        ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Void(((java.lang.Runnable)(__sourceIntrinsic_e284df5a5fbb_invokedynamic1474_7(life7_11, p1))));
    }
    return;
}


private static void lambda$toggle$1(com.moon.module.Module p0) {
((com.moon.module.Module)(p0)).toggle();
    return;
}


private static void lambda$set_state$0(com.moon.module.Module p0, boolean p1) {
((com.moon.module.Module)(p0)).setEnabled(((boolean)(p1)));
    return;
}


private static void lambda$initGui$2(com.moon.module.impl.ClickGUI p0, com.moon.fU p1) {
com.moon.module.impl.ClickGUI forwardValue454_30_0;
    com.moon.pk forwardValue454_36_0;
    com.moon.module.impl.ClickGUI spill454_0;
    com.moon.pk spill454_1;
    long life2_3;
    int life4_5;
    java.util.List life5_17;
    com.moon.mZ life6_21;
    com.moon.ns life5_46;
    forward_join_40: {
    forward_join_36: {
    forward_join_30: {
    forward_join_29: {
    life2_3 = (com.moon.j2.a ^ 69919734147048L);
    life4_5 = ((com.moon.j2.b()) ? 1 : 0);
    spill454_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue454_30_0 = spill454_0;
        break forward_join_30;
    }
    if (!((((com.moon.module.impl.ClickGUI)(spill454_0)).a__pj() != null))) {
        break forward_join_29;
    }
    life5_17 = ((com.moon.fU)(p1)).a(((com.moon.module.ModuleCategory)(com.moon.module.ModuleCategory.SCRIPTS)));
    life6_21 = ((com.moon.pj)(((com.moon.module.impl.ClickGUI)(p0)).a__pj())).a__mZ();
    ((java.util.List)(((com.moon.mZ)(life6_21)).a__List())).clear();
    ((java.util.List)(((com.moon.mZ)(life6_21)).a__List())).addAll(((java.util.Collection)(life5_17)));
    ((com.moon.mZ)(life6_21)).a__Void();
    }
    forwardValue454_30_0 = p0;
    }
    spill454_1 = ((com.moon.module.impl.ClickGUI)(forwardValue454_30_0)).a__pk();
    if (!((life4_5 != 0))) {
        forwardValue454_36_0 = spill454_1;
        break forward_join_36;
    }
    if (!((spill454_1 != null))) {
        break forward_join_40;
    }
    forwardValue454_36_0 = ((com.moon.module.impl.ClickGUI)(p0)).a__pk();
    }
    life5_46 = ((com.moon.pk)(forwardValue454_36_0)).a__ns();
    ((com.moon.ns)(life5_46)).d__sourceReturn_da8c82d5d4();
    }
    return;
}


public boolean is_enabled(java.lang.String p0) {
com.moon.module.Module forwardValue453_20_0;
    boolean spill453_0;
    com.moon.module.Module spill453_1;
    long life2_3;
    com.moon.fU life5_7;
    int life4_8;
    com.moon.module.Module life6_12;
    forward_join_20: {
    forward_join_19: {
    life2_3 = (com.moon.j2.a ^ 131433466408896L);
    spill453_0 = com.moon.j2.c();
    life5_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life4_8 = ((spill453_0) ? 1 : 0);
    life6_12 = ((com.moon.fU)(life5_7)).a(((java.lang.String)(p0)));
    spill453_1 = life6_12;
    if (!((life4_8 == 0))) {
        forwardValue453_20_0 = spill453_1;
        break forward_join_20;
    }
    if (!((spill453_1 == null))) {
        break forward_join_19;
    }
    return ((0) != 0);
    }
    forwardValue453_20_0 = life6_12;
    }
    return ((com.moon.module.Module)(forwardValue453_20_0)).isEnabled();
}


public java.lang.Object get_setting(java.lang.String p0, java.lang.String p1) {
com.moon.module.Module forwardValue452_20_0;
    boolean spill452_0;
    com.moon.module.Module spill452_1;
    long life3_3;
    com.moon.fU life6_7;
    com.moon.module.Module life7_11;
    int life5_12;
    com.moon.setting.Setting life8_27;
    forward_join_20: {
    forward_join_19: {
    life3_3 = (com.moon.j2.a ^ 4927054659047L);
    spill452_0 = com.moon.j2.c();
    life6_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life7_11 = ((com.moon.fU)(life6_7)).a(((java.lang.String)(p0)));
    life5_12 = ((spill452_0) ? 1 : 0);
    spill452_1 = life7_11;
    if (!((life5_12 == 0))) {
        forwardValue452_20_0 = spill452_1;
        break forward_join_20;
    }
    if (!((spill452_1 == null))) {
        break forward_join_19;
    }
    return null;
    }
    forwardValue452_20_0 = life7_11;
    }
    life8_27 = ((com.moon.module.Module)(forwardValue452_20_0)).getSetting(((java.lang.String)(p1)));
    return ((com.moon.setting.Setting)(life8_27)).getValue();
}


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_2c8ae721fed4_originalDynamicSite414_6(com.moon.module.impl.ClickGUI a0, com.moon.fU a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1727_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_44a2f59a0b7e_invokedynamic455_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_44a2f59a0b7e_invokedynamic455_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_44a2f59a0b7e_invokedynamic455_12(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_44a2f59a0b7e_invokedynamic455_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_44a2f59a0b7e_invokedynamic455_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_e284df5a5fbb_invokedynamic1474_7(com.moon.module.Module a0, boolean a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_b2d77d765c6a_invokedynamic1473_7(com.moon.module.Module a0) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.lang.String __sourceExactCall_de3a246cb89d2b(byte[] p0);
}
