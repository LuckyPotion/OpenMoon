package moom;


public class qG extends net.minecraft.command.CommandBase {

private static long c;

private static long d;

public qG() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_42d4ade5c586e9c92725(moom.qG a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_42d4ade5c586e9c92725 {

public static java.util.List f184(moom.qG receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue184_47_0;
    int forwardValue184_47_1;
    int forwardValue184_53_0;
    int forwardValue184_69_0;
    java.lang.String[] forwardValue184_71_0;
    int spill184_0;
    int spill184_1;
    java.lang.String[] spill184_2;
    java.lang.String[] spill184_3;
    java.lang.String[] spill184_4;
    java.lang.String[] spill184_5;
    java.lang.String[] spill184_6;
    java.lang.String[] spill184_7;
    java.lang.String[] spill184_8;
    int spill184_9;
    java.lang.String[] spill184_10;
    long life4_3;
    int life6_5;
    forward_join_76: {
    forward_join_71: {
    forward_join_69: {
    forward_join_62: {
    forward_join_53: {
    forward_join_47: {
    forward_join_42: {
    life4_3 = (__fieldRead184_0() ^ 114987809265509L);
    life6_5 = __call184_1();
    spill184_0 = (p1).length;
    spill184_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue184_47_0 = spill184_0;
        forwardValue184_47_1 = spill184_1;
        break forward_join_47;
    }
    if (!((spill184_0 == spill184_1))) {
        break forward_join_42;
    }
    spill184_2 = p1;
    java.lang.String[] __stackOp184_3_0 = new java.lang.String[((int) __fieldRead184_2())];
    spill184_3 = __stackOp184_3_0;
    (__stackOp184_3_0)[0] = "on";
    java.lang.String[] __stackOp184_4_0 = spill184_3;
    spill184_4 = __stackOp184_4_0;
    (__stackOp184_4_0)[1] = "off";
    java.lang.String[] __stackOp184_5_0 = spill184_4;
    spill184_5 = __stackOp184_5_0;
    (__stackOp184_5_0)[2] = "list";
    java.lang.String[] __stackOp184_6_0 = spill184_5;
    spill184_6 = __stackOp184_6_0;
    (__stackOp184_6_0)[3] = "add";
    java.lang.String[] __stackOp184_7_0 = spill184_6;
    spill184_7 = __stackOp184_7_0;
    (__stackOp184_7_0)[4] = "remove";
    java.lang.String[] __stackOp184_8_0 = spill184_7;
    spill184_8 = __stackOp184_8_0;
    (__stackOp184_8_0)[5] = "reload";
    return __call184_9(spill184_2, spill184_8);
    }
    spill184_9 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue184_53_0 = spill184_9;
        break forward_join_53;
    }
    forwardValue184_47_0 = spill184_9;
    forwardValue184_47_1 = 2;
    }
    if (!((forwardValue184_47_0 == forwardValue184_47_1))) {
        break forward_join_76;
    }
    forwardValue184_53_0 = __integerCategory184_11(__call184_10((p1)[0], "remove"));
    }
    if (!((life6_5 == 0))) {
        forwardValue184_69_0 = forwardValue184_53_0;
        break forward_join_69;
    }
    if (!((forwardValue184_53_0 != 0))) {
        break forward_join_62;
    }
    return __call184_15(p1, __call184_14(__call184_13(__call184_12())));
    }
    spill184_10 = p1;
    if (!((life6_5 == 0))) {
        forwardValue184_71_0 = spill184_10;
        break forward_join_71;
    }
    forwardValue184_69_0 = __integerCategory184_17(__call184_16((spill184_10)[0], "add"));
    }
    if (!((forwardValue184_69_0 != 0))) {
        break forward_join_76;
    }
    forwardValue184_71_0 = p1;
    }
    return __call184_21(forwardValue184_71_0, __call184_20(__call184_19(__call184_18())));
    }
    return null;
}
public static void h184_0(moom.Oo p0) throws Throwable {
    throw __call1018400_0(p0);
}
public static void h184_1(moom.Oo p0) throws Throwable {
    throw __call1018401_0(p0);
}
public static void h184_2(moom.Oo p0) throws Throwable {
    throw __call1018402_0(p0);
}
public static void h184_3(moom.Oo p0) throws Throwable {
    throw __call1018403_0(p0);
}
public static void h184_4(moom.Oo p0) throws Throwable {
    throw __call1018404_0(p0);
}
public static void h184_5(moom.Oo p0) throws Throwable {
    throw __call1018405_0(p0);
}
public static void h184_6(moom.Oo p0) throws Throwable {
    throw __call1018406_0(p0);
}
private static native long __fieldRead184_0() throws Throwable;
private static native int __call184_1() throws Throwable;
private static native long __fieldRead184_2() throws Throwable;
private static native java.util.List __call184_9(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call184_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory184_11(boolean value) throws Throwable;
private static native moom.Bl __call184_12() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call184_13(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call184_14(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.util.List __call184_15(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call184_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory184_17(boolean value) throws Throwable;
private static native moom.Bl __call184_18() throws Throwable;
private static native moom.Bt __call184_19(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call184_20(moom.Bt a0) throws Throwable;
private static native java.util.List __call184_21(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1018400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018406_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_886d860dea0cd5c76295(moom.qG a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_886d860dea0cd5c76295 {

public static void f1148(moom.qG receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1148_44_0;
    int forwardValue1148_64_0;
    int forwardValue1148_109_0;
    int forwardValue1148_170_0;
    int forwardValue1148_232_0;
    boolean spill1148_0;
    long life3_3;
    int life5_5;
    moom.Bl life6_20;
    java.lang.String[] life7_117;
    com.mojang.authlib.GameProfile life7_163;
    com.mojang.authlib.GameProfile life7_241;
    forward_join_242: {
    forward_join_232: {
    forward_join_227: {
    forward_join_225: {
    forward_join_209: {
    forward_join_184: {
    forward_join_170: {
    forward_join_165: {
    forward_join_163: {
    forward_join_147: {
    forward_join_123: {
    forward_join_109: {
    forward_join_104: {
    forward_join_64: {
    forward_join_59: {
    forward_join_44: {
    forward_join_39: {
    forward_join_17: {
    life3_3 = (__fieldRead1148_0() ^ 52349152839398L);
    life5_5 = __call1148_1();
    if (!(((p1).length < 1))) {
        break forward_join_17;
    }
    throw new moom.cc("commands.whitelist.usage", new java.lang.Object[0]);
    }
    life6_20 = __call1148_2();
    spill1148_0 = __call1148_3((p1)[0], "on");
    if (!((life5_5 == 0))) {
        forwardValue1148_44_0 = __integerCategory1148_4(spill1148_0);
        break forward_join_44;
    }
    if (!(spill1148_0)) {
        break forward_join_39;
    }
    __call1148_6(__call1148_5(life6_20), 1);
    __call1148_7(p0, receiver, "commands.whitelist.enabled", new java.lang.Object[0]);
    if (!((life5_5 != 0))) {
        break forward_join_242;
    }
    }
    forwardValue1148_44_0 = __integerCategory1148_9(__call1148_8((p1)[0], "off"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1148_64_0 = forwardValue1148_44_0;
        break forward_join_64;
    }
    if (!((forwardValue1148_44_0 != 0))) {
        break forward_join_59;
    }
    __call1148_11(__call1148_10(life6_20), 0);
    __call1148_12(p0, receiver, "commands.whitelist.disabled", new java.lang.Object[0]);
    if (!((life5_5 != 0))) {
        break forward_join_242;
    }
    }
    forwardValue1148_64_0 = __integerCategory1148_14(__call1148_13((p1)[0], "list"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1148_109_0 = forwardValue1148_64_0;
        break forward_join_109;
    }
    if (!((forwardValue1148_64_0 != 0))) {
        break forward_join_104;
    }
    __call1148_21(p0, new moom.CN("commands.whitelist.list", new java.lang.Object[] {__call1148_17((__call1148_16(__call1148_15(life6_20))).length), __call1148_20((__call1148_19(__call1148_18(life6_20))).length)}));
    life7_117 = __call1148_23(__call1148_22(life6_20));
    __call1148_25(p0, new moom.CM(__call1148_24(life7_117)));
    if (!((life5_5 != 0))) {
        break forward_join_242;
    }
    }
    forwardValue1148_109_0 = __integerCategory1148_27(__call1148_26((p1)[0], "add"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1148_170_0 = forwardValue1148_109_0;
        break forward_join_170;
    }
    if (!((forwardValue1148_109_0 != 0))) {
        break forward_join_165;
    }
    if (!(((p1).length < 2))) {
        break forward_join_123;
    }
    throw new moom.cc("commands.whitelist.add.usage", new java.lang.Object[0]);
    }
    life7_163 = __call1148_29(__call1148_28(life6_20), (p1)[1]);
    if (!((life5_5 == 0))) {
        break forward_join_163;
    }
    if (!((life7_163 == null))) {
        break forward_join_147;
    }
    throw new moom.b7("commands.whitelist.add.failed", new java.lang.Object[] {(p1)[1]});
    }
    __call1148_31(__call1148_30(life6_20), life7_163);
    __call1148_32(p0, receiver, "commands.whitelist.add.success", new java.lang.Object[] {(p1)[1]});
    }
    if (!((life5_5 != 0))) {
        break forward_join_242;
    }
    }
    forwardValue1148_170_0 = __integerCategory1148_34(__call1148_33((p1)[0], "remove"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1148_232_0 = forwardValue1148_170_0;
        break forward_join_232;
    }
    if (!((forwardValue1148_170_0 != 0))) {
        break forward_join_227;
    }
    if (!(((p1).length < 2))) {
        break forward_join_184;
    }
    throw new moom.cc("commands.whitelist.remove.usage", new java.lang.Object[0]);
    }
    life7_241 = __call1148_37(__call1148_36(__call1148_35(life6_20)), (p1)[1]);
    if (!((life5_5 == 0))) {
        break forward_join_225;
    }
    if (!((life7_241 == null))) {
        break forward_join_209;
    }
    throw new moom.b7("commands.whitelist.remove.failed", new java.lang.Object[] {(p1)[1]});
    }
    __call1148_39(__call1148_38(life6_20), life7_241);
    __call1148_40(p0, receiver, "commands.whitelist.remove.success", new java.lang.Object[] {(p1)[1]});
    }
    if (!((life5_5 != 0))) {
        break forward_join_242;
    }
    }
    forwardValue1148_232_0 = __integerCategory1148_42(__call1148_41((p1)[0], "reload"));
    }
    if (!((forwardValue1148_232_0 != 0))) {
        break forward_join_242;
    }
    __call1148_44(__call1148_43(life6_20));
    __call1148_45(p0, receiver, "commands.whitelist.reloaded", new java.lang.Object[0]);
    }
    return;
}
public static void h1148_0(moom.b7 p0) throws Throwable {
    throw __call1114800_0(p0);
}
public static void h1148_1(moom.b7 p0) throws Throwable {
    throw __call1114801_0(p0);
}
public static void h1148_2(moom.b7 p0) throws Throwable {
    throw __call1114802_0(p0);
}
public static void h1148_3(moom.b7 p0) throws Throwable {
    throw __call1114803_0(p0);
}
public static void h1148_4(moom.b7 p0) throws Throwable {
    throw __call1114804_0(p0);
}
public static void h1148_5(moom.b7 p0) throws Throwable {
    throw __call1114805_0(p0);
}
public static void h1148_6(moom.b7 p0) throws Throwable {
    throw __call1114806_0(p0);
}
public static void h1148_7(moom.b7 p0) throws Throwable {
    throw __call1114807_0(p0);
}
public static void h1148_8(moom.b7 p0) throws Throwable {
    throw __call1114808_0(p0);
}
public static void h1148_9(moom.b7 p0) throws Throwable {
    throw __call1114809_0(p0);
}
public static void h1148_10(moom.b7 p0) throws Throwable {
    throw __call1114810_0(p0);
}
public static void h1148_11(moom.b7 p0) throws Throwable {
    throw __call1114811_0(p0);
}
public static void h1148_12(moom.b7 p0) throws Throwable {
    throw __call1114812_0(p0);
}
public static void h1148_13(moom.b7 p0) throws Throwable {
    throw __call1114813_0(p0);
}
public static void h1148_14(moom.b7 p0) throws Throwable {
    throw __call1114814_0(p0);
}
public static void h1148_15(moom.b7 p0) throws Throwable {
    throw __call1114815_0(p0);
}
public static void h1148_16(moom.b7 p0) throws Throwable {
    throw __call1114816_0(p0);
}
public static void h1148_17(moom.b7 p0) throws Throwable {
    throw __call1114817_0(p0);
}
public static void h1148_18(moom.b7 p0) throws Throwable {
    throw __call1114818_0(p0);
}
public static void h1148_19(moom.b7 p0) throws Throwable {
    throw __call1114819_0(p0);
}
public static void h1148_20(moom.b7 p0) throws Throwable {
    throw __call1114820_0(p0);
}
public static void h1148_21(moom.b7 p0) throws Throwable {
    throw __call1114821_0(p0);
}
private static native long __fieldRead1148_0() throws Throwable;
private static native int __call1148_1() throws Throwable;
private static native moom.Bl __call1148_2() throws Throwable;
private static native boolean __call1148_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1148_4(boolean value) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_5(moom.Bl a0) throws Throwable;
private static native void __call1148_6(net.minecraft.server.management.ServerConfigurationManager a0, int a1) throws Throwable;
private static native void __call1148_7(net.minecraft.command.ICommandSender a0, moom.qG a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1148_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1148_9(boolean value) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_10(moom.Bl a0) throws Throwable;
private static native void __call1148_11(net.minecraft.server.management.ServerConfigurationManager a0, int a1) throws Throwable;
private static native void __call1148_12(net.minecraft.command.ICommandSender a0, moom.qG a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1148_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1148_14(boolean value) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_15(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call1148_16(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.Integer __call1148_17(int a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_18(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call1148_19(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.Integer __call1148_20(int a0) throws Throwable;
private static native void __call1148_21(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_22(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call1148_23(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.String __call1148_24(java.lang.String[] a0) throws Throwable;
private static native void __call1148_25(net.minecraft.command.ICommandSender a0, moom.CM a1) throws Throwable;
private static native boolean __call1148_26(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1148_27(boolean value) throws Throwable;
private static native moom.Bt __call1148_28(moom.Bl a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1148_29(moom.Bt a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_30(moom.Bl a0) throws Throwable;
private static native void __call1148_31(net.minecraft.server.management.ServerConfigurationManager a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __call1148_32(net.minecraft.command.ICommandSender a0, moom.qG a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1148_33(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1148_34(boolean value) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_35(moom.Bl a0) throws Throwable;
private static native moom.BH __call1148_36(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1148_37(moom.BH a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_38(moom.Bl a0) throws Throwable;
private static native void __call1148_39(net.minecraft.server.management.ServerConfigurationManager a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __call1148_40(net.minecraft.command.ICommandSender a0, moom.qG a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1148_41(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1148_42(boolean value) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1148_43(moom.Bl a0) throws Throwable;
private static native void __call1148_44(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call1148_45(net.minecraft.command.ICommandSender a0, moom.qG a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1114800_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114801_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114802_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114803_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114804_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114805_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114806_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114807_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114808_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114809_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114810_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114811_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114812_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114813_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114814_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114815_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114816_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114817_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114818_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114819_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114820_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114821_0(moom.b7 a0) throws Throwable;

}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(234334916713823451L)), ((long)(-8041009887073067315L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(278285630556006L)))));
    long local0_life6 = (moom.qG.c ^ 13668386529210L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill971_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill971_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill971_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill971_13 = new byte[8];
    (__sourceSpill971_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill971_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation971_15 = __sourceSpill971_13;
    ((javax.crypto.Cipher)(__sourceSpill971_10)).init(((int)(__sourceSpill971_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill971_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation971_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5221474893662968359L;
    byte[] __sourceSpill971_19 = new byte[8];
    (__sourceSpill971_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill971_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill971_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill971_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill971_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill971_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill971_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill971_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill971_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill971_20)).doFinal(((byte[])(__sourceSpill971_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_42d4ade5c586e9c92725(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_886d860dea0cd5c76295(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.whitelist.usage";
}


public int a() {
return 3;
}


public java.lang.String a__String() {
return "whitelist";
}

}
