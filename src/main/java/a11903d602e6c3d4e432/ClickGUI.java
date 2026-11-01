package com.moon.module.impl;


public class ClickGUI extends com.moon.module.Module {

private com.moon.pj s;

private com.moon.pk t;

private com.v u;

private com.moon.setting.ModeSetting<com.moon.bO> v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.ModeSetting<com.moon.bQ> x;

private com.moon.setting.BooleanSetting y;

private com.moon.setting.ModeSetting<com.moon.bN> z;

private com.moon.setting.ModeSetting<com.moon.bP> A;

private com.moon.setting.BooleanSetting B;

private com.moon.setting.BooleanSetting C;

private com.moon.setting.FloatSetting D;

private com.moon.setting.ColorSetting E;

private static long F;

private static java.lang.String[] G;

private static java.lang.String[] H;

private static java.util.Map I;

public ClickGUI(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_ad36c297e746cdfd(com.moon.module.impl.ClickGUI receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.ClickGUI.F ^ 22518967722732L);

    com.moon.module.impl.ClickGUI.__sourceConstructorInit_ad36c297e746cdfd_0(((com.moon.module.impl.ClickGUI)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.ClickGUI)(receiver)).s = ((com.moon.pj)(null));

    ((com.moon.module.impl.ClickGUI)(receiver)).t = ((com.moon.pk)(null));

    ((com.moon.module.impl.ClickGUI)(receiver)).u = ((com.v)(__sourceExactCall_f61d11b8decb1d(((int)(-1)))));

    ((com.moon.module.impl.ClickGUI)(receiver)).v = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_9(666, (8831130646135383729L ^ local5_life2)))), ((java.lang.Class)(com.moon.bO.class))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_13(8408, (8136466903200597221L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bO.MODERN))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_19(1692, (3237895035295146669L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_22(30183, (7437990242356646367L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_24(receiver)))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).x = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_29(24339, (4958358591539641146L ^ local5_life2)))), ((java.lang.Class)(com.moon.bQ.class))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_33(3488, (582342419778349450L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bQ.LINEAR))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_36(receiver)))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_41(25705, (6752241750002974813L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_44(5213, (7547842174327763043L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_46(receiver)))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).z = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_51(13850, (343076727005254181L ^ local5_life2)))), ((java.lang.Class)(com.moon.bN.class))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_54(receiver)))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_57(8247, (197477522175689742L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bN.IN_BACK))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).A = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_63(1390, (2887197755028349276L ^ local5_life2)))), ((java.lang.Class)(com.moon.bP.class))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_66(receiver)))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_69(23162, (1306085785685196370L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bP.STACKED))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).B = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_75(12268, (234293152255216607L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_78(5517, (6567313048218218936L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_80(receiver)))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_85(14481, (372581638399761597L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_88(7434, (4527099274369579324L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_90(receiver)))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).D = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_95(32307, (4123546299612125700L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_98(16445, (1837152969194759181L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(1056964608)), ((float)(0x1.0p1f)), ((float)(1036831949))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_103(6544, (3342770869639069099L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_105(receiver)))))).a()));

    ((com.moon.module.impl.ClickGUI)(receiver)).E = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_110(13612, (1803558147949302032L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_113(19809, (4168366306555160923L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB()))))).a(((com.moon.kR)(__sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_117(receiver)))))).a()));

    return;

}



static {
F = ((long)(((moom._a)(moom._c.a(((long)(-4055995721224293397L)), ((long)(-3002438780959071496L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(73709528193561L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.module.impl.ClickGUI.F ^ 57444515360497L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill266_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill266_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill266_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill266_14 = new byte[8];
    (__sourceSpill266_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill266_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation266_16 = __sourceSpill266_14;
    ((javax.crypto.Cipher)(__sourceSpill266_11)).init(((int)(__sourceSpill266_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill266_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation266_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[21];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "gå×P\023\021ï§ <­u×\013¸uT\002\t\rìþ;¹\023\fÕÎH¸YÚß¬\03085p ÂÛü X Ñ½£«ß+È\020f63Ê9eïÀõ¶Íî8J\036@;á\033f`ôí 4\n\177Ò1¹û­±T>ü~ÃQYE\020º®õ\006\"²{6ø\023·/»¬h¨\nÍoÓ2¿\003\024»Nuïu\025äí3\007\020G¡i»s°\026£ÜPª9ðL\020ÿÅ1dH©jõ/>\t(¾XS\0170!ý?rK\025Eh4Ïùwãê-ÿL¢Ñwä\021®\032É­d¯Øg0èÀc¨UôQl2y°yõ+dÛÖ}äâvÈ-îM`ì#Ã£#ÛOEð. \031\177hÚ\020$e ´ô>dIè ýZKÝ T\tÊô8Ó\032zöÔ¯1¤¿x\032£uÐWsçüöÿebÂ\033(õF(\027àJ\nÈÂI íYV¤á,lk×ç,ÈÌåëô\tìÙ\003[ØíG»OÈ\020ãÊSÁÏ\rÙSÐ\036Dw\001Æ /-¨wp<e´¬ÄKÅÆâA5\025\021TÖ<±¤rEB\020ó\007\020>\fd}\006\032\"Þ¦\036PB\023\007Å\030ShúZ\030(\026E\037_#ôH\006þ©°#\"<h_]~\020\004Ãö g30.ß4ívø>\f\003\030\013ÁA}H~·Òù%ÓãAîæ\017]tY;\024L(^\021?W¶\031wo µ½ÄJ¬0\007¥#r¦vÞ]P½©ü (àrÇ\021À\030E£°8 ì:ÙÐâê£ÿZÁ36ÏlÄDð0eèof®\tÉå\020/"))).length();
    int local5_life24 = 40;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill266_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill266_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill266_29)).doFinal(((byte[])(__sourceSpill266_28)));
        java.lang.String __sourceSpill266_34 = ((java.lang.String)(com.moon.module.impl.ClickGUI.c(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill266_35 = local9_life19;
        int __sourceSpill266_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill266_35)[__sourceSpill266_36] = __sourceSpill266_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "\1778j+\\\025ÞxnK£Y\023¤ ÁbGË\025Á\013à¿b\036Sú}Þ«\f\017\bÝ*,tkèh"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill266_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill266_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill266_42)).doFinal(((byte[])(__sourceSpill266_41)));
        java.lang.String __sourceSpill266_47 = ((java.lang.String)(com.moon.module.impl.ClickGUI.c(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill266_48 = local9_life19;
        int __sourceSpill266_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill266_48)[__sourceSpill266_49] = __sourceSpill266_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    G = ((java.lang.String[])(local9_life19));
    H = ((java.lang.String[])(new java.lang.String[21]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ad36c297e746cdfd_0(com.moon.module.impl.ClickGUI a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public com.moon.setting.BooleanSetting b() {
return this.y;
}


public com.moon.setting.ModeSetting<com.moon.bQ> b__kY() {
return this.x;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2428_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.ClickGUI.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.ModeSetting<com.moon.bN> c__kY() {
return this.z;
}


public com.moon.setting.BooleanSetting c() {
return this.B;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20122);
    if (((com.moon.module.impl.ClickGUI.H)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.ClickGUI.I)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.ClickGUI.I)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lS", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.ClickGUI.G)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.ClickGUI.H)[life5_8] = com.moon.module.impl.ClickGUI.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.ClickGUI.H)[life5_8];
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
        byte[] spill812_0 = p0;
        life4_9 += 1;
        life5_44 = (spill812_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill812_1 = p0;
        life4_9 += 1;
        life5_76 = (spill812_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill812_2 = p0;
        life4_9 += 1;
        life5_91 = (spill812_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void c__Void() {
com.moon.pk forestValue190_28_0;
    com.moon.pj forestValue190_48_0;
    com.moon.pk spill190_0;
    com.moon.pj spill190_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forest_join_55: {
    forest_join_53: {
    forest_join_49: {
    forest_join_48: {
    forest_join_35: {
    forest_join_29: {
    forest_join_28: {
    forest_join_16: {
    life1_3 = (com.moon.module.impl.ClickGUI.F ^ 90522478602903L);
    life3_5 = com.moon.bY.b();
    if (!((life3_5 == null))) {
        break forest_join_55;
    }
    switch ((com.moon.gS.a)[((com.moon.bO)(((com.moon.bO)(((com.moon.setting.ModeSetting)(this.v)).getValue())))).ordinal()]) {
case 1:
{
        break forest_join_16;
    }
case 2:
{
        break forest_join_35;
    }
default:
{
        break forest_join_53;
    }
}
    }
    spill190_0 = this.t;
    if (!((life3_5 == null))) {
        forestValue190_28_0 = spill190_0;
        break forest_join_28;
    }
    if (!((spill190_0 == null))) {
        break forest_join_29;
    }
    this.t = ((com.moon.pk)(new com.moon.pk()));
    forestValue190_28_0 = this.t;
    }
    ((com.moon.pk)(forestValue190_28_0)).a__Void();
    }
    ((net.minecraft.client.Minecraft)(com.moon.module.impl.ClickGUI.d)).a(((net.minecraft.client.gui.GuiScreen)(this.t)));
    if (!((life3_5 != null))) {
        break forest_join_53;
    }
    }
    spill190_1 = this.s;
    if (!((life3_5 == null))) {
        forestValue190_48_0 = spill190_1;
        break forest_join_48;
    }
    if (!((spill190_1 == null))) {
        break forest_join_49;
    }
    this.s = ((com.moon.pj)(new com.moon.pj(this)));
    forestValue190_48_0 = this.s;
    }
    ((com.moon.pj)(forestValue190_48_0)).a__Void();
    }
    ((net.minecraft.client.Minecraft)(com.moon.module.impl.ClickGUI.d)).a(((net.minecraft.client.gui.GuiScreen)(this.s)));
    }
    ((com.moon.module.impl.ClickGUI)(this)).toggle();
    }
    return;
}


public com.moon.setting.ModeSetting<com.moon.bP> d__kY() {
return this.A;
}


public com.moon.setting.BooleanSetting d() {
return this.C;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.D;
}


public com.moon.module.impl.ClickGUI a(com.v p0) {
this.u = ((com.v)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.module.impl.ClickGUI a(com.moon.pk p0) {
this.t = ((com.moon.pk)(p0));
    return this;
}


public com.moon.module.impl.ClickGUI a(com.moon.pj p0) {
this.s = ((com.moon.pj)(p0));
    return this;
}


public com.v a__v() {
return this.u;
}


public com.moon.pj a__pj() {
return this.s;
}


public com.moon.setting.ColorSetting a__kX() {
return this.E;
}


public com.moon.pk a__pk() {
return this.t;
}


public com.moon.setting.BooleanSetting a() {
return this.w;
}


public com.moon.setting.ModeSetting<com.moon.bO> a__kY() {
return this.v;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.ClickGUI.F ^ 127703198070673L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.v)).getValue() == com.moon.bO.DEFAULT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
java.lang.Object forwardValue814_16_0;
    int forwardValue814_24_0;
    int forwardValue814_28_0;
    int forwardValue814_30_0;
    java.lang.Object spill814_0;
    boolean spill814_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.ClickGUI.F ^ 71140131863862L);
    life3_5 = com.moon.bY.b();
    spill814_0 = ((com.moon.setting.ModeSetting)(this.v)).getValue();
    if (!((life3_5 == null))) {
        forwardValue814_16_0 = spill814_0;
        break forward_join_16;
    }
    if (!((spill814_0 == com.moon.bO.DEFAULT))) {
        break forward_join_29;
    }
    forwardValue814_16_0 = ((com.moon.setting.BooleanSetting)(this.w)).getValue();
    }
    spill814_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue814_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue814_24_0 = ((spill814_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill814_1)) {
        break forward_join_29;
    }
    forwardValue814_24_0 = ((((com.moon.setting.BooleanSetting)(this.w)).isAvailable()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue814_28_0 = forwardValue814_24_0;
        break forward_join_28;
    }
    if (!((forwardValue814_24_0 != 0))) {
        break forward_join_29;
    }
    forwardValue814_28_0 = 1;
    }
    forwardValue814_30_0 = forwardValue814_28_0;
    break forward_join_30;
    }
    forwardValue814_30_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue814_30_0))));
}


private java.lang.Boolean lambda$new$3() {
java.lang.Object forwardValue815_16_0;
    int forwardValue815_24_0;
    int forwardValue815_28_0;
    int forwardValue815_30_0;
    java.lang.Object spill815_0;
    boolean spill815_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.ClickGUI.F ^ 113756423445934L);
    life3_5 = com.moon.bY.b();
    spill815_0 = ((com.moon.setting.ModeSetting)(this.v)).getValue();
    if (!((life3_5 == null))) {
        forwardValue815_16_0 = spill815_0;
        break forward_join_16;
    }
    if (!((spill815_0 == com.moon.bO.DEFAULT))) {
        break forward_join_29;
    }
    forwardValue815_16_0 = ((com.moon.setting.BooleanSetting)(this.y)).getValue();
    }
    spill815_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue815_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue815_24_0 = ((spill815_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill815_1)) {
        break forward_join_29;
    }
    forwardValue815_24_0 = ((((com.moon.setting.BooleanSetting)(this.y)).isAvailable()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue815_28_0 = forwardValue815_24_0;
        break forward_join_28;
    }
    if (!((forwardValue815_24_0 != 0))) {
        break forward_join_29;
    }
    forwardValue815_28_0 = 1;
    }
    forwardValue815_30_0 = forwardValue815_28_0;
    break forward_join_30;
    }
    forwardValue815_30_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue815_30_0))));
}


private java.lang.Boolean lambda$new$2() {
long local1 = (com.moon.module.impl.ClickGUI.F ^ 2994706431642L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.v)).getValue() == com.moon.bO.DEFAULT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$4() {
long local1 = (com.moon.module.impl.ClickGUI.F ^ 40547931659611L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.v)).getValue() == com.moon.bO.DEFAULT) ? 1 : 0)))));
}


private void lambda$new$8(java.lang.Integer p0, java.lang.Integer p1) {
com.moon.module.impl.ClickGUI forwardValue816_15_0;
    com.moon.module.impl.ClickGUI spill816_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_15: {
    forward_join_14: {
    life3_3 = (com.moon.module.impl.ClickGUI.F ^ 36088358212962L);
    life5_5 = __sourceExactCall_b13159324639bd();
    spill816_0 = this;
    if (!((life5_5 == null))) {
        forwardValue816_15_0 = spill816_0;
        break forward_join_15;
    }
    if (!((((com.moon.module.impl.ClickGUI)(spill816_0)).s != null))) {
        break forward_join_14;
    }
    ((com.moon.pj)(this.s)).b__Void();
    }
    forwardValue816_15_0 = this;
    }
    ((com.moon.module.impl.ClickGUI)(forwardValue816_15_0)).u = ((com.v)(__sourceExactCall_f61d11b8decb1d(((int)(__sourceExactCall_bbcfab3d5132fe(((java.lang.Integer)(p1))))))));
    __sourceExactCall_859a1d03d23e8d(((com.moon.cs)(__sourceExactCall_1456344bb00aba(((com.moon.runtime.ClientContext)(__sourceExactCall_e298c1d02b9134()))))), ((int)(__sourceExactCall_bbcfab3d5132fe(((java.lang.Integer)(p1))))));
    return;
}


private java.lang.Boolean lambda$new$6() {
long local1 = (com.moon.module.impl.ClickGUI.F ^ 83780870752609L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.v)).getValue() == com.moon.bO.MODERN) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$5() {
long local1 = (com.moon.module.impl.ClickGUI.F ^ 67144358744559L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.v)).getValue() == com.moon.bO.MODERN) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$7() {
long local1 = (com.moon.module.impl.ClickGUI.F ^ 107591726778763L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.v)).getValue() == com.moon.bO.MODERN) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_24(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_36(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_46(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_54(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_66(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_75(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_80(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_90(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_95(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_103(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_105(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_110(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_113(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_ad36c297e746cdfd_originalDynamicSite24_117(com.moon.module.impl.ClickGUI a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2428_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native net.minecraft.entity.Entity[] __sourceExactCall_b13159324639bd();

private static native void __sourceExactCall_859a1d03d23e8d(com.moon.cs p0, int p1);
private static native com.moon.cs __sourceExactCall_1456344bb00aba(com.moon.runtime.ClientContext p0);
private static native com.moon.runtime.ClientContext __sourceExactCall_e298c1d02b9134();

private static native int __sourceExactCall_bbcfab3d5132fe(java.lang.Integer p0);

private static native com.v __sourceExactCall_f61d11b8decb1d(int p0);
}
