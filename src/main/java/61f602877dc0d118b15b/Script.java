package com.moon.module.impl;


public class Script extends com.moon.module.Module {

private java.util.Map<java.lang.String, org.luaj.vm2.LuaValue> s;

private org.luaj.vm2.LuaTable t;

private com.moon.jI u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

public Script(java.lang.String p0, java.lang.String p1, java.lang.String p2, org.luaj.vm2.LuaTable p3) {
super(((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(com.moon.module.ModuleCategory.SCRIPTS)));
    this.s = ((java.util.Map)(new java.util.HashMap()));
    this.t = ((org.luaj.vm2.LuaTable)(p3));
    return;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(5175600597097080140L)), ((long)(-2287955522764128479L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(243555241904135L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.module.impl.Script.v ^ 47132297665009L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill286_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill286_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill286_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill286_14 = new byte[8];
    (__sourceSpill286_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill286_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation286_16 = __sourceSpill286_14;
    ((javax.crypto.Cipher)(__sourceSpill286_11)).init(((int)(__sourceSpill286_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill286_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation286_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[26];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "L\005Ärúa},Ýt\004ýß>aã\0243\tÈ?\\¢ÈPV\013ê q§¤3Þ\004×@ù\027ê¥3å\006Ì/¥®©jkÈIBi\020æ(iþ Ñ'ÂÐåßg1\031W\020 \021ÕÌÌUQ\005å´ÿÔ»©u(÷\b½~-éúÑ54!®\033\005=Ë¿úÎ·?þE)\rÐo2ê¼ F \\«wâÝ]0ªùTr9TI³\r·ã$½ê \002ýÀ\025$w\b1P}¹IFø÷\021d\026¿ê³£\035(\177¦u'\033\020XîTÕ¯bCèó|Ô¹\036è\nP\004Hi»¯Ny¬\tø¢»ÉÉ£P\024àY\017óúY²0m\017\035aQ}ÓuÈãK´6§\02015¶\001µ«%\r]%Ëó#æ\0203FÓÁ¥i?Õ\021Qj¨R òý¯0ðñm\n\027fpB¦£|Â¬¬CFÏì\"~G7½;_PtA/Ì\bµN\tÕJ\016&Å1þÙkþ\027%Çfö\033\000úÏÆ]ãlÊLêqoX¨Èn/q^.µ¸ªìªvKÏk¿½w\020Ef¼Þ9¤¤®+i`\004\020éGµä:8xÇþÌîùP\0204(Ã¬Í\036õQ¶G*%ó/¹Àà×¢ Ö³ð!\033þÄ]jpÃÒ\ruÜ\0200÷êÞu¢\030Ï*\002¹+êÇ\020_ü /{M¦U\\BË\0201§(*K\026À\"¼&(®Ô Ä\"\001ÿö\037Ñ\022ãî\037J³\r8½LØ)bQ\002Á\020/ègÖ\\-¥\r\033\004´\024öÑ;\020cà\026ßÎ_åpTåçTAË\020\f÷ny\007OÔ+ó\f¦ù«\030\003\030øÊ&\006ËïdáÝ¡,¥\030S±oÐ a\001Àä§Â\022êüÌ½\021ûHÏ8\004\004ëzÞ°%é%Ôâ K\035¦i¶\022ð9iÞö¬S]zø=nÊÏfV7ÿ[ô¼\032R 8åg:\"¹1:÷\0210üÐ´K\b7æ÷ÒÎ_Ð#\023h×·2\020ì\0025EL\031o¾Î¯ËÞ"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill286_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill286_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill286_29)).doFinal(((byte[])(__sourceSpill286_28)));
        java.lang.String __sourceSpill286_34 = ((java.lang.String)(com.moon.module.impl.Script.c(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill286_35 = local9_life19;
        int __sourceSpill286_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill286_35)[__sourceSpill286_36] = __sourceSpill286_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "vó08½º¼ÍnÈö\034\023[.\020éMWR^#1u\bX4EL\001f"))).length();
    local5_life24 = 16;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill286_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill286_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill286_42)).doFinal(((byte[])(__sourceSpill286_41)));
        java.lang.String __sourceSpill286_47 = ((java.lang.String)(com.moon.module.impl.Script.c(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill286_48 = local9_life19;
        int __sourceSpill286_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill286_48)[__sourceSpill286_49] = __sourceSpill286_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    w = ((java.lang.String[])(local9_life19));
    x = ((java.lang.String[])(new java.lang.String[26]));
}

private static native <E extends Throwable> void __sourceHandlerCall_edfdbeff2574caf0bc53(com.moon.module.impl.Script a0, com.moon.ej a1) throws E;
private static final class __SourceHandler_edfdbeff2574caf0bc53 {

public static void f125(com.moon.module.impl.Script receiver, com.moon.ej p0) throws Throwable {
    int forestValue125_13_0;
    int forestValue125_15_0;
    net.minecraft.entity.Entity[] spill125_0;
    boolean spill125_1;
    org.luaj.vm2.LuaTable spill125_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_6;
    int life5_16;
    org.luaj.vm2.LuaTable life6_20;
    forest_join_15: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (__fieldRead125_0() ^ 77423469659228L);
    spill125_0 = __call125_1();
    __call125_2();
    life4_6 = spill125_0;
    spill125_1 = __call125_3(p0);
    if (!((life4_6 == null))) {
        forestValue125_13_0 = __integerCategory125_4(spill125_1);
        break forest_join_13;
    }
    if (!((!spill125_1))) {
        break forest_join_14;
    }
    forestValue125_13_0 = 1;
    }
    forestValue125_15_0 = forestValue125_13_0;
    break forest_join_15;
    }
    forestValue125_15_0 = 0;
    }
    life5_16 = forestValue125_15_0;
    org.luaj.vm2.LuaTable __stackOp125_6_0 = __sourceUninitializedNEW125_5();
    spill125_2 = __stackOp125_6_0;
    __explicitNewInit125_7(__stackOp125_6_0);
    life6_20 = spill125_2;
    __call125_10(life6_20, __invokedynamic125_8(14879, (2732870320992217777L ^ life2_3)), __call125_9(life5_16));
    __call125_16(life6_20, __invokedynamic125_11(12230, (3329218437756026749L ^ life2_3)), __call125_15(((double) __fieldRead125_14(__fieldRead125_13(__fieldRead125_12())))));
    __call125_18(receiver, __invokedynamic125_17(13793, (6456215902213563715L ^ life2_3)), life6_20);
    return;
}
private static native long __fieldRead125_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call125_1() throws Throwable;
private static native void __call125_2() throws Throwable;
private static native boolean __call125_3(com.moon.ej a0) throws Throwable;
private static native int __integerCategory125_4(boolean value) throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW125_5() throws Throwable;
private static native void __explicitNewInit125_7(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic125_8(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaBoolean __call125_9(int a0) throws Throwable;
private static native void __call125_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaBoolean a2) throws Throwable;
private static native java.lang.String __invokedynamic125_11(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead125_12() throws Throwable;
private static native moom.DM __fieldRead125_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead125_14(moom.DM a0) throws Throwable;
private static native org.luaj.vm2.LuaNumber __call125_15(double a0) throws Throwable;
private static native void __call125_16(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaNumber a2) throws Throwable;
private static native java.lang.String __invokedynamic125_17(int a0, long a1) throws Throwable;
private static native void __call125_18(com.moon.module.impl.Script a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_af70781523cc2f59049e(com.moon.module.impl.Script a0, com.moon.event.MoveEvent a1) throws E;
private static final class __SourceHandler_af70781523cc2f59049e {

public static void f126(com.moon.module.impl.Script receiver, com.moon.event.MoveEvent p0) throws Throwable {
    org.luaj.vm2.LuaTable forestValue126_24_0;
    java.lang.String forestValue126_24_1;
    org.luaj.vm2.LuaTable forestValue126_25_0;
    java.lang.String forestValue126_25_1;
    int forestValue126_25_2;
    org.luaj.vm2.LuaTable spill126_0;
    org.luaj.vm2.LuaTable spill126_1;
    java.lang.String spill126_2;
    long life2_3;
    org.luaj.vm2.LuaTable life4_11;
    forest_join_134: {
    forest_join_25: {
    forest_join_24: {
    life2_3 = (__fieldRead126_0() ^ 10272469158625L);
    if (!((__call126_1(p0) != __fieldRead126_2()))) {
        break forest_join_134;
    }
    org.luaj.vm2.LuaTable __stackOp126_4_0 = __sourceUninitializedNEW126_3();
    spill126_0 = __stackOp126_4_0;
    __explicitNewInit126_5(__stackOp126_4_0);
    life4_11 = spill126_0;
    spill126_1 = life4_11;
    spill126_2 = __invokedynamic126_6(23063, (3758850130832065551L ^ life2_3));
    if (!((__call126_7(p0) == __fieldRead126_8()))) {
        forestValue126_24_0 = spill126_1;
        forestValue126_24_1 = spill126_2;
        break forest_join_24;
    }
    forestValue126_25_0 = spill126_1;
    forestValue126_25_1 = spill126_2;
    forestValue126_25_2 = 1;
    break forest_join_25;
    }
    forestValue126_25_0 = forestValue126_24_0;
    forestValue126_25_1 = forestValue126_24_1;
    forestValue126_25_2 = 0;
    }
    __call126_10(forestValue126_25_0, forestValue126_25_1, __call126_9(forestValue126_25_2));
    __call126_12(life4_11, "x", __call126_11(p0));
    __call126_14(life4_11, "y", __call126_13(p0));
    __call126_16(life4_11, "z", __call126_15(p0));
    __call126_19(life4_11, __invokedynamic126_17(25282, (5193594818814131402L ^ life2_3)), ((double) __call126_18(p0)));
    __call126_22(life4_11, __invokedynamic126_20(27745, (8011986488434864744L ^ life2_3)), ((double) __call126_21(p0)));
    __call126_26(life4_11, __invokedynamic126_23(27027, (8880523676565813124L ^ life2_3)), __call126_25(__call126_24(p0)));
    __call126_28(receiver, __invokedynamic126_27(30939, (2961972255816132312L ^ life2_3)), life4_11);
    __call126_31(p0, __call126_30(__call126_29(life4_11, "x")));
    __call126_34(p0, __call126_33(__call126_32(life4_11, "y")));
    __call126_37(p0, __call126_36(__call126_35(life4_11, "z")));
    __call126_41(p0, __call126_40(__call126_39(life4_11, __invokedynamic126_38(3452, (8405963019146875771L ^ life2_3)))));
    __call126_45(p0, __call126_44(__call126_43(life4_11, __invokedynamic126_42(24188, (8620237221475385454L ^ life2_3)))));
    __call126_49(p0, __call126_48(__call126_47(life4_11, __invokedynamic126_46(25167, (5794858515623885905L ^ life2_3)))));
    }
    return;
}
private static native long __fieldRead126_0() throws Throwable;
private static native com.moon.event.MovePhase __call126_1(com.moon.event.MoveEvent a0) throws Throwable;
private static native com.moon.event.MovePhase __fieldRead126_2() throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW126_3() throws Throwable;
private static native void __explicitNewInit126_5(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic126_6(int a0, long a1) throws Throwable;
private static native com.moon.event.MovePhase __call126_7(com.moon.event.MoveEvent a0) throws Throwable;
private static native com.moon.event.MovePhase __fieldRead126_8() throws Throwable;
private static native org.luaj.vm2.LuaBoolean __call126_9(int a0) throws Throwable;
private static native void __call126_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaBoolean a2) throws Throwable;
private static native double __call126_11(com.moon.event.MoveEvent a0) throws Throwable;
private static native void __call126_12(org.luaj.vm2.LuaTable a0, java.lang.String a1, double a2) throws Throwable;
private static native double __call126_13(com.moon.event.MoveEvent a0) throws Throwable;
private static native void __call126_14(org.luaj.vm2.LuaTable a0, java.lang.String a1, double a2) throws Throwable;
private static native double __call126_15(com.moon.event.MoveEvent a0) throws Throwable;
private static native void __call126_16(org.luaj.vm2.LuaTable a0, java.lang.String a1, double a2) throws Throwable;
private static native java.lang.String __invokedynamic126_17(int a0, long a1) throws Throwable;
private static native float __call126_18(com.moon.event.MoveEvent a0) throws Throwable;
private static native void __call126_19(org.luaj.vm2.LuaTable a0, java.lang.String a1, double a2) throws Throwable;
private static native java.lang.String __invokedynamic126_20(int a0, long a1) throws Throwable;
private static native float __call126_21(com.moon.event.MoveEvent a0) throws Throwable;
private static native void __call126_22(org.luaj.vm2.LuaTable a0, java.lang.String a1, double a2) throws Throwable;
private static native java.lang.String __invokedynamic126_23(int a0, long a1) throws Throwable;
private static native boolean __call126_24(com.moon.event.MoveEvent a0) throws Throwable;
private static native org.luaj.vm2.LuaBoolean __call126_25(boolean a0) throws Throwable;
private static native void __call126_26(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaBoolean a2) throws Throwable;
private static native java.lang.String __invokedynamic126_27(int a0, long a1) throws Throwable;
private static native void __call126_28(com.moon.module.impl.Script a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native org.luaj.vm2.LuaValue __call126_29(org.luaj.vm2.LuaTable a0, java.lang.String a1) throws Throwable;
private static native double __call126_30(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.event.MoveEvent __call126_31(com.moon.event.MoveEvent a0, double a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call126_32(org.luaj.vm2.LuaTable a0, java.lang.String a1) throws Throwable;
private static native double __call126_33(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.event.MoveEvent __call126_34(com.moon.event.MoveEvent a0, double a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call126_35(org.luaj.vm2.LuaTable a0, java.lang.String a1) throws Throwable;
private static native double __call126_36(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.event.MoveEvent __call126_37(com.moon.event.MoveEvent a0, double a1) throws Throwable;
private static native java.lang.String __invokedynamic126_38(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call126_39(org.luaj.vm2.LuaTable a0, java.lang.String a1) throws Throwable;
private static native float __call126_40(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.event.MoveEvent __call126_41(com.moon.event.MoveEvent a0, float a1) throws Throwable;
private static native java.lang.String __invokedynamic126_42(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call126_43(org.luaj.vm2.LuaTable a0, java.lang.String a1) throws Throwable;
private static native float __call126_44(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.event.MoveEvent __call126_45(com.moon.event.MoveEvent a0, float a1) throws Throwable;
private static native java.lang.String __invokedynamic126_46(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call126_47(org.luaj.vm2.LuaTable a0, java.lang.String a1) throws Throwable;
private static native boolean __call126_48(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.event.MoveEvent __call126_49(com.moon.event.MoveEvent a0, boolean a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5c4ae6727988ff3c3369(com.moon.module.impl.Script a0, com.moon.event.PacketEvent a1) throws E;
private static final class __SourceHandler_5c4ae6727988ff3c3369 {

public static void f127(com.moon.module.impl.Script receiver, com.moon.event.PacketEvent p0) throws Throwable {
    net.minecraft.network.EnumConnectionState forestValue127_23_0;
    net.minecraft.network.EnumConnectionState forestValue127_23_1;
    net.minecraft.network.EnumPacketDirection forestValue127_30_0;
    com.moon.kd forestValue127_44_0;
    org.luaj.vm2.LuaTable forestValue127_53_0;
    com.moon.module.impl.Script forestValue127_84_0;
    com.moon.module.impl.Script forestValue127_89_0;
    java.lang.String forestValue127_89_1;
    com.moon.kd forestValue127_96_0;
    net.minecraft.entity.Entity[] spill127_0;
    net.minecraft.network.EnumConnectionState spill127_1;
    net.minecraft.network.EnumConnectionState spill127_2;
    com.moon.kd spill127_3;
    org.luaj.vm2.LuaTable spill127_4;
    com.moon.module.impl.Script spill127_5;
    com.moon.kd spill127_6;
    long life2_3;
    moom.yK life5_6;
    com.moon.kd life6_11;
    net.minecraft.network.EnumConnectionState life7_14;
    net.minecraft.entity.Entity[] life4_15;
    net.minecraft.network.EnumPacketDirection life8_33;
    java.lang.Integer life9_38;
    org.luaj.vm2.LuaTable life10_57;
    forest_join_113: {
    forest_join_102: {
    forest_join_96: {
    forest_join_89: {
    forest_join_84: {
    forest_join_53: {
    forest_join_50: {
    forest_join_44: {
    forest_join_39: {
    forest_join_30: {
    forest_join_29: {
    forest_join_23: {
    life2_3 = (__fieldRead127_0() ^ 70285474327304L);
    life5_6 = __call127_1(p0);
    spill127_0 = __call127_2();
    life6_11 = __call127_4(__call127_3(life5_6));
    life7_14 = __call127_5(life5_6);
    life4_15 = spill127_0;
    spill127_1 = life7_14;
    spill127_2 = __fieldRead127_6();
    if (!((life4_15 == null))) {
        forestValue127_23_0 = spill127_1;
        forestValue127_23_1 = spill127_2;
        break forest_join_23;
    }
    if (!((spill127_1 != spill127_2))) {
        break forest_join_113;
    }
    forestValue127_23_0 = life7_14;
    forestValue127_23_1 = __fieldRead127_7();
    }
    if (!((forestValue127_23_0 != forestValue127_23_1))) {
        break forest_join_113;
    }
    if (!(__call127_8(p0))) {
        break forest_join_29;
    }
    forestValue127_30_0 = __fieldRead127_9();
    break forest_join_30;
    }
    forestValue127_30_0 = __fieldRead127_10();
    }
    life8_33 = forestValue127_30_0;
    life9_38 = __call127_11(life7_14, life8_33, life5_6);
    if (!((life9_38 == null))) {
        break forest_join_39;
    }
    return;
    }
    spill127_3 = life6_11;
    if (!((life4_15 == null))) {
        forestValue127_44_0 = spill127_3;
        break forest_join_44;
    }
    if (!((spill127_3 != null))) {
        break forest_join_50;
    }
    forestValue127_44_0 = life6_11;
    }
    forestValue127_53_0 = __call127_14(forestValue127_44_0, __cast127_13(__call127_12(receiver, life5_6)));
    break forest_join_53;
    }
    org.luaj.vm2.LuaTable __stackOp127_16_0 = __sourceUninitializedNEW127_15();
    spill127_4 = __stackOp127_16_0;
    __explicitNewInit127_17(__stackOp127_16_0);
    forestValue127_53_0 = spill127_4;
    }
    life10_57 = forestValue127_53_0;
    __call127_21(life10_57, __invokedynamic127_18(20068, (4095538915958649245L ^ life2_3)), __call127_20(__call127_19(life9_38)));
    __call127_25(life10_57, __invokedynamic127_22(22500, (6573878102628558863L ^ life2_3)), __call127_24(__call127_23(p0)));
    spill127_5 = receiver;
    if (!(__call127_26(p0))) {
        forestValue127_84_0 = spill127_5;
        break forest_join_84;
    }
    forestValue127_89_0 = spill127_5;
    forestValue127_89_1 = __invokedynamic127_27(29269, (8318267847240109477L ^ life2_3));
    break forest_join_89;
    }
    forestValue127_89_0 = forestValue127_84_0;
    forestValue127_89_1 = __invokedynamic127_28(13341, (5756237967815281640L ^ life2_3));
    }
    __call127_29(forestValue127_89_0, forestValue127_89_1, life10_57);
    spill127_6 = life6_11;
    if (!((life4_15 == null))) {
        forestValue127_96_0 = spill127_6;
        break forest_join_96;
    }
    if (!((spill127_6 != null))) {
        break forest_join_102;
    }
    forestValue127_96_0 = life6_11;
    }
    __call127_32(forestValue127_96_0, life10_57, __cast127_31(__call127_30(receiver, life5_6)));
    }
    __call127_36(p0, __call127_35(__call127_34(life10_57, __invokedynamic127_33(2354, (8909832983853217499L ^ life2_3)))));
    }
    return;
}
private static native long __fieldRead127_0() throws Throwable;
private static native moom.yK __call127_1(com.moon.event.PacketEvent a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call127_2() throws Throwable;
private static native java.lang.Class __call127_3(moom.yK a0) throws Throwable;
private static native com.moon.kd __call127_4(java.lang.Class a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __call127_5(moom.yK a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __fieldRead127_6() throws Throwable;
private static native net.minecraft.network.EnumConnectionState __fieldRead127_7() throws Throwable;
private static native boolean __call127_8(com.moon.event.PacketEvent a0) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead127_9() throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead127_10() throws Throwable;
private static native java.lang.Integer __call127_11(net.minecraft.network.EnumConnectionState a0, net.minecraft.network.EnumPacketDirection a1, moom.yK a2) throws Throwable;
private static native java.lang.Object __call127_12(com.moon.module.impl.Script a0, moom.yK a1) throws Throwable;
private static native moom.yK __cast127_13(java.lang.Object a0) throws Throwable;
private static native org.luaj.vm2.LuaTable __call127_14(com.moon.kd a0, moom.yK a1) throws Throwable;
private static native org.luaj.vm2.LuaTable __sourceUninitializedNEW127_15() throws Throwable;
private static native void __explicitNewInit127_17(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.String __invokedynamic127_18(int a0, long a1) throws Throwable;
private static native int __call127_19(java.lang.Integer a0) throws Throwable;
private static native org.luaj.vm2.LuaInteger __call127_20(int a0) throws Throwable;
private static native void __call127_21(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaInteger a2) throws Throwable;
private static native java.lang.String __invokedynamic127_22(int a0, long a1) throws Throwable;
private static native boolean __call127_23(com.moon.event.PacketEvent a0) throws Throwable;
private static native org.luaj.vm2.LuaBoolean __call127_24(boolean a0) throws Throwable;
private static native void __call127_25(org.luaj.vm2.LuaTable a0, java.lang.String a1, org.luaj.vm2.LuaBoolean a2) throws Throwable;
private static native boolean __call127_26(com.moon.event.PacketEvent a0) throws Throwable;
private static native java.lang.String __invokedynamic127_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic127_28(int a0, long a1) throws Throwable;
private static native void __call127_29(com.moon.module.impl.Script a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws Throwable;
private static native java.lang.Object __call127_30(com.moon.module.impl.Script a0, moom.yK a1) throws Throwable;
private static native moom.yK __cast127_31(java.lang.Object a0) throws Throwable;
private static native void __call127_32(com.moon.kd a0, org.luaj.vm2.LuaTable a1, moom.yK a2) throws Throwable;
private static native java.lang.String __invokedynamic127_33(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call127_34(org.luaj.vm2.LuaTable a0, java.lang.String a1) throws Throwable;
private static native boolean __call127_35(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native com.moon.event.CancellableEvent __call127_36(com.moon.event.PacketEvent a0, boolean a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f2f96fe1331c3ff6246(com.moon.module.impl.Script a0, java.lang.String a1, org.luaj.vm2.LuaTable a2) throws E;
private static final class __SourceHandler_5f2f96fe1331c3ff6246 {

public static void f128(com.moon.module.impl.Script receiver, java.lang.String p0, org.luaj.vm2.LuaTable p1) throws Throwable {
    org.luaj.vm2.Varargs forestValue128_26_0;
    java.util.Map spill128_0;
    java.lang.String spill128_1;
    org.luaj.vm2.LuaTable spill128_2;
    org.luaj.vm2.LuaValue spill128_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    org.luaj.vm2.LuaValue life6_17;
    forest_join_27: {
    forest_join_26: {
    life3_3 = (__fieldRead128_0() ^ 68035904288808L);
    life5_5 = __call128_1();
    spill128_0 = __fieldRead128_2(receiver);
    spill128_1 = p0;
    org.luaj.vm2.LuaTable __stackOp128_4_0 = __fieldRead128_3(receiver);
    spill128_2 = __stackOp128_4_0;
    __call128_5(__stackOp128_4_0);
    life6_17 = __cast128_8(__call128_7(spill128_0, spill128_1, __invokedynamic128_6(spill128_2)));
    spill128_3 = life6_17;
    if (!((life5_5 == null))) {
        forestValue128_26_0 = spill128_3;
        break forest_join_26;
    }
    if (!((!__call128_9(spill128_3)))) {
        break forest_join_27;
    }
    forestValue128_26_0 = __call128_10(life6_17, p1);
    }
    __discardScalar128_11(forestValue128_26_0);
    }
    return;
}
public static void h128_0(org.luaj.vm2.LuaError p0) throws Throwable {
    throw __call3012800_0(p0);
}
public static void h128_1(org.luaj.vm2.LuaError p0, com.moon.module.impl.Script p1, long p2) throws Throwable {
    java.lang.String spill3012801_0;
    java.lang.String spill3012801_1;
    java.lang.String spill3012801_2;
    org.luaj.vm2.LuaError life4_2;
    life4_2 = p0;
    java.lang.String __stackOp3012801_3_0 = __call3012801_0(p1);
    java.lang.String __stackOp3012801_3_1 = __call3012801_1(life4_2);
    java.lang.String __stackOp3012801_3_2 = __invokedynamic3012801_2(22035, (6708478432378108608L ^ p2));
    spill3012801_0 = __stackOp3012801_3_2;
    spill3012801_1 = __stackOp3012801_3_0;
    spill3012801_2 = __stackOp3012801_3_1;
    __discardScalar3012801_4(__stackOp3012801_3_2);
    java.lang.String __stackOp3012801_5_0 = spill3012801_2;
    java.lang.String __stackOp3012801_5_1 = " ";
    __call3012801_7(__invokedynamic3012801_6(spill3012801_0, spill3012801_1, __stackOp3012801_5_1, __stackOp3012801_5_0));
    return;
}
public static void h128_2(java.lang.Exception p0) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3012802_0(life1_2);
    return;
}
private static native long __fieldRead128_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call128_1() throws Throwable;
private static native java.util.Map __fieldRead128_2(com.moon.module.impl.Script a0) throws Throwable;
private static native org.luaj.vm2.LuaTable __fieldRead128_3(com.moon.module.impl.Script a0) throws Throwable;
private static native java.lang.Object __call128_5(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.util.function.Function __invokedynamic128_6(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.Object __call128_7(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native org.luaj.vm2.LuaValue __cast128_8(java.lang.Object a0) throws Throwable;
private static native boolean __call128_9(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native org.luaj.vm2.Varargs __call128_10(org.luaj.vm2.LuaValue a0, org.luaj.vm2.LuaTable a1) throws Throwable;
private static native void __discardScalar128_11(org.luaj.vm2.Varargs a0) throws Throwable;
private static native org.luaj.vm2.LuaError __call3012800_0(org.luaj.vm2.LuaError a0) throws Throwable;
private static native java.lang.String __call3012801_0(com.moon.module.impl.Script a0) throws Throwable;
private static native java.lang.String __call3012801_1(org.luaj.vm2.LuaError a0) throws Throwable;
private static native java.lang.String __invokedynamic3012801_2(int a0, long a1) throws Throwable;
private static native void __discardScalar3012801_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3012801_6(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call3012801_7(java.lang.String a0) throws Throwable;
private static native void __call3012802_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d2dcd0e6fd393d1a8c2e(com.moon.module.impl.Script a0, java.lang.String a1) throws E;
private static final class __SourceHandler_d2dcd0e6fd393d1a8c2e {

public static void f129(com.moon.module.impl.Script receiver, java.lang.String p0) throws Throwable {
    org.luaj.vm2.Varargs forestValue129_25_0;
    net.minecraft.entity.Entity[] spill129_0;
    java.util.Map spill129_1;
    java.lang.String spill129_2;
    org.luaj.vm2.LuaTable spill129_3;
    org.luaj.vm2.LuaValue spill129_4;
    long life2_3;
    org.luaj.vm2.LuaValue life5_16;
    net.minecraft.entity.Entity[] life4_17;
    forest_join_26: {
    forest_join_25: {
    life2_3 = (__fieldRead129_0() ^ 111016217227850L);
    spill129_0 = __call129_1();
    spill129_1 = __fieldRead129_2(receiver);
    spill129_2 = p0;
    org.luaj.vm2.LuaTable __stackOp129_4_0 = __fieldRead129_3(receiver);
    spill129_3 = __stackOp129_4_0;
    __call129_5(__stackOp129_4_0);
    life5_16 = __cast129_8(__call129_7(spill129_1, spill129_2, __invokedynamic129_6(spill129_3)));
    life4_17 = spill129_0;
    spill129_4 = life5_16;
    if (!((life4_17 == null))) {
        forestValue129_25_0 = spill129_4;
        break forest_join_25;
    }
    if (!((!__call129_9(spill129_4)))) {
        break forest_join_26;
    }
    forestValue129_25_0 = __call129_10(life5_16);
    }
    __discardScalar129_11(forestValue129_25_0);
    }
    return;
}
public static void h129_0(org.luaj.vm2.LuaError p0) throws Throwable {
    throw __call3012900_0(p0);
}
public static void h129_1(org.luaj.vm2.LuaError p0, com.moon.module.impl.Script p1, long p2) throws Throwable {
    java.lang.String spill3012901_0;
    java.lang.String spill3012901_1;
    java.lang.String spill3012901_2;
    org.luaj.vm2.LuaError life4_2;
    life4_2 = p0;
    java.lang.String __stackOp3012901_3_0 = __call3012901_0(p1);
    java.lang.String __stackOp3012901_3_1 = __call3012901_1(life4_2);
    java.lang.String __stackOp3012901_3_2 = __invokedynamic3012901_2(7901, (759974237737121888L ^ p2));
    spill3012901_0 = __stackOp3012901_3_2;
    spill3012901_1 = __stackOp3012901_3_0;
    spill3012901_2 = __stackOp3012901_3_1;
    __discardScalar3012901_4(__stackOp3012901_3_2);
    java.lang.String __stackOp3012901_5_0 = spill3012901_2;
    java.lang.String __stackOp3012901_5_1 = " ";
    __call3012901_7(__invokedynamic3012901_6(spill3012901_0, spill3012901_1, __stackOp3012901_5_1, __stackOp3012901_5_0));
    return;
}
private static native long __fieldRead129_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call129_1() throws Throwable;
private static native java.util.Map __fieldRead129_2(com.moon.module.impl.Script a0) throws Throwable;
private static native org.luaj.vm2.LuaTable __fieldRead129_3(com.moon.module.impl.Script a0) throws Throwable;
private static native java.lang.Object __call129_5(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.util.function.Function __invokedynamic129_6(org.luaj.vm2.LuaTable a0) throws Throwable;
private static native java.lang.Object __call129_7(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native org.luaj.vm2.LuaValue __cast129_8(java.lang.Object a0) throws Throwable;
private static native boolean __call129_9(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native org.luaj.vm2.Varargs __call129_10(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native void __discardScalar129_11(org.luaj.vm2.Varargs a0) throws Throwable;
private static native org.luaj.vm2.LuaError __call3012900_0(org.luaj.vm2.LuaError a0) throws Throwable;
private static native java.lang.String __call3012901_0(com.moon.module.impl.Script a0) throws Throwable;
private static native java.lang.String __call3012901_1(org.luaj.vm2.LuaError a0) throws Throwable;
private static native java.lang.String __invokedynamic3012901_2(int a0, long a1) throws Throwable;
private static native void __discardScalar3012901_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3012901_6(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call3012901_7(java.lang.String a0) throws Throwable;

}


private void b(java.lang.String p0) { __sourceHandlerCall_d2dcd0e6fd393d1a8c2e(this, p0); }


public void onEnable() {
long local1 = (com.moon.module.impl.Script.v ^ 21054974147582L);
    ((com.moon.module.impl.Script)(this)).b(((java.lang.String)(__sourceIntrinsic_20563a9c9945_originalDynamicSite531_1(4016, (8176086247919149246L ^ local1)))));
    super.onEnable();
    return;
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
        byte[] spill931_0 = p0;
        life4_9 += 1;
        life5_44 = (spill931_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill931_1 = p0;
        life4_9 += 1;
        life5_76 = (spill931_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill931_2 = p0;
        life4_9 += 1;
        life5_91 = (spill931_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3542);
    if (((com.moon.module.impl.Script.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Script.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Script.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/l7", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Script.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Script.x)[life5_8] = com.moon.module.impl.Script.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Script.x)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Script.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2637_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void onDisable() {
long local1 = (com.moon.module.impl.Script.v ^ 56898002431793L);
    ((com.moon.module.impl.Script)(this)).b(((java.lang.String)(__sourceIntrinsic_e5d8624439f0_originalDynamicSite532_1(12616, (2215983149670779549L ^ local1)))));
    super.onDisable();
    return;
}


public org.luaj.vm2.LuaTable a__LuaTable() {
return this.t;
}


public com.moon.jI a() {
return this.u;
}


public com.moon.module.impl.Script a(com.moon.jI p0) {
this.u = ((com.moon.jI)(p0));
    return this;
}


private static org.luaj.vm2.LuaError a(org.luaj.vm2.LuaError p0) {
return p0;
}


public void a(com.moon.event.TickEvent p0) {
long life2_3;
    life2_3 = (com.moon.module.impl.Script.v ^ 17555215432045L);
    if ((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE)) {
        ((com.moon.module.impl.Script)(this)).b(((java.lang.String)(__sourceIntrinsic_be06bc302d53_invokedynamic930_3(607, (1388231818961776590L ^ life2_3)))));
    }
    return;
}


public void a(com.moon.eT p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    org.luaj.vm2.LuaTable life5_18;
    forest_join_37: {
    forest_join_13: {
    life2_3 = (com.moon.module.impl.Script.v ^ 51968343030933L);
    life4_5 = __sourceExactCall_63b5bde98562ae();
    if (!((life4_5 == null))) {
        break forest_join_13;
    }
    if (!((((com.moon.eT)(p0)).a() == com.moon.a2.PRE))) {
        break forest_join_37;
    }
    moom.kZ.l();
    }
    life5_18 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life5_18)).set(((java.lang.String)(__sourceIntrinsic_0a8c3919b3f9_invokedynamic100034_5(456, (2859877279097547192L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Script.d)).l)).b)))))));
    ((com.moon.module.impl.Script)(this)).a(((java.lang.String)(__sourceIntrinsic_0a8c3919b3f9_invokedynamic100034_11(9536, (2505935131111968033L ^ life2_3)))), ((org.luaj.vm2.LuaTable)(life5_18)));
    }
    return;
}


public void a(com.moon.event.Render2DEvent p0) {
int forestValue100035_14_0;
    net.minecraft.entity.Entity[] spill100035_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_6;
    int life5_14;
    org.luaj.vm2.LuaTable life6_18;
    forest_join_53: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (com.moon.module.impl.Script.v ^ 35164059819436L);
    spill100035_0 = __sourceExactCall_63b5bde98562ae();
    moom.kZ.l();
    life4_6 = spill100035_0;
    if (!((((com.moon.event.Render2DEvent)(p0)).getPhase() == com.moon.event.RenderPhase.PRE))) {
        break forest_join_13;
    }
    forestValue100035_14_0 = 1;
    break forest_join_14;
    }
    forestValue100035_14_0 = 0;
    }
    life5_14 = forestValue100035_14_0;
    life6_18 = new org.luaj.vm2.LuaTable();
    ((org.luaj.vm2.LuaTable)(life6_18)).set(((java.lang.String)(__sourceIntrinsic_cd0609abcd78_invokedynamic100035_5(462, (2246593568549636226L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life5_14)))))));
    ((org.luaj.vm2.LuaTable)(life6_18)).set(((java.lang.String)(__sourceIntrinsic_cd0609abcd78_invokedynamic100035_8(12230, (3329175070244578957L ^ life2_3)))), ((org.luaj.vm2.LuaValue)(org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Script.d)).l)).b)))))));
    ((com.moon.module.impl.Script)(this)).a(((java.lang.String)(__sourceIntrinsic_cd0609abcd78_invokedynamic100035_14(404, (8201538656321898701L ^ life2_3)))), ((org.luaj.vm2.LuaTable)(life6_18)));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forest_join_53;
    }
    net.minecraft.client.particle.EntityFX.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) { __sourceHandlerCall_5c4ae6727988ff3c3369(this, p0); }


public void a(com.moon.event.MotionEvent p0) {
long life2_3;
    org.luaj.vm2.LuaTable life5_7;
    net.minecraft.entity.Entity[] life4_14;
    life2_3 = (com.moon.module.impl.Script.v ^ 87883273152143L);
    life5_7 = new org.luaj.vm2.LuaTable();
    net.minecraft.entity.Entity[] spill926_0 = __sourceExactCall_63b5bde98562ae();
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)("x")), ((double)(((com.moon.event.MotionEvent)(p0)).getMotionX())));
    life4_14 = spill926_0;
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)("y")), ((double)(((com.moon.event.MotionEvent)(p0)).getMotionY())));
    ((org.luaj.vm2.LuaTable)(life5_7)).set(((java.lang.String)("z")), ((double)(((com.moon.event.MotionEvent)(p0)).getMotionZ())));
    ((com.moon.module.impl.Script)(this)).a(((java.lang.String)(__sourceIntrinsic_ec6de7cefe2c_invokedynamic926_8(2057, (6300158631559264892L ^ life2_3)))), ((org.luaj.vm2.LuaTable)(life5_7)));
    ((com.moon.event.MotionEvent)(p0)).setMotionX(((double)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(life5_7)).get(((java.lang.String)("x"))))).todouble())));
    ((com.moon.event.MotionEvent)(p0)).setMotionY(((double)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(life5_7)).get(((java.lang.String)("y"))))).todouble())));
    ((com.moon.event.MotionEvent)(p0)).setMotionZ(((double)(((org.luaj.vm2.LuaValue)(((org.luaj.vm2.LuaTable)(life5_7)).get(((java.lang.String)("z"))))).todouble())));
    if ((life4_14 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) { __sourceHandlerCall_af70781523cc2f59049e(this, p0); }


public java.util.Map<java.lang.String, org.luaj.vm2.LuaValue> a__Map() {
return this.s;
}


private void a(java.lang.String p0, org.luaj.vm2.LuaTable p1) { __sourceHandlerCall_5f2f96fe1331c3ff6246(this, p0, p1); }


private <T> T a(java.lang.Object p0) {
try {
        return ((T)(p0));
    } catch (java.lang.Exception caught2) {
        ((java.lang.Exception)(caught2)).printStackTrace();
        return null;
    }
}


public void a(com.moon.ej p0) { __sourceHandlerCall_edfdbeff2574caf0bc53(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0a8c3919b3f9_invokedynamic100034_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0a8c3919b3f9_invokedynamic100034_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec6de7cefe2c_invokedynamic926_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cd0609abcd78_invokedynamic100035_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cd0609abcd78_invokedynamic100035_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cd0609abcd78_invokedynamic100035_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be06bc302d53_invokedynamic930_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2637_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e5d8624439f0_originalDynamicSite532_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20563a9c9945_originalDynamicSite531_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native net.minecraft.entity.Entity[] __sourceExactCall_63b5bde98562ae();
}
