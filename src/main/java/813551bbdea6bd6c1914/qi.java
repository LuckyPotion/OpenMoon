package moom;


public class qi extends net.minecraft.command.CommandBase {

public static java.util.regex.Pattern c;

private static long d;

public qi() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_1eb440b331b77295846c(moom.qi a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_1eb440b331b77295846c {

public static void f1183(moom.qi receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1183_17_0;
    int forwardValue1183_17_1;
    int forwardValue1183_23_0;
    int forwardValue1183_23_1;
    net.minecraft.util.IChatComponent forwardValue1183_30_0;
    moom.qi forwardValue1183_51_0;
    net.minecraft.command.ICommandSender forwardValue1183_51_1;
    java.lang.String forwardValue1183_51_2;
    moom.qi forwardValue1183_52_0;
    net.minecraft.command.ICommandSender forwardValue1183_52_1;
    java.lang.String forwardValue1183_52_2;
    net.minecraft.util.IChatComponent forwardValue1183_52_3;
    moom.qi forwardValue1183_53_0;
    net.minecraft.command.ICommandSender forwardValue1183_53_1;
    java.lang.String forwardValue1183_53_2;
    java.lang.String forwardValue1183_53_3;
    moom.qi forwardValue1183_82_0;
    net.minecraft.command.ICommandSender forwardValue1183_82_1;
    java.lang.String forwardValue1183_82_2;
    moom.qi forwardValue1183_83_0;
    net.minecraft.command.ICommandSender forwardValue1183_83_1;
    java.lang.String forwardValue1183_83_2;
    net.minecraft.util.IChatComponent forwardValue1183_83_3;
    moom.qi forwardValue1183_84_0;
    net.minecraft.command.ICommandSender forwardValue1183_84_1;
    java.lang.String forwardValue1183_84_2;
    java.lang.String forwardValue1183_84_3;
    int spill1183_0;
    int spill1183_1;
    moom.qi spill1183_2;
    net.minecraft.command.ICommandSender spill1183_3;
    java.lang.String spill1183_4;
    net.minecraft.util.IChatComponent spill1183_5;
    moom.qi spill1183_6;
    net.minecraft.command.ICommandSender spill1183_7;
    java.lang.String spill1183_8;
    net.minecraft.util.IChatComponent spill1183_9;
    long life3_3;
    int life5_5;
    net.minecraft.util.IChatComponent life6_44;
    java.util.regex.Matcher life7_50;
    net.minecraft.entity.player.EntityPlayerMP life8_84;
    forward_join_94: {
    forward_join_87: {
    forward_join_85: {
    forward_join_84: {
    forward_join_83: {
    forward_join_82: {
    forward_join_72: {
    forward_join_56: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_30: {
    forward_join_29: {
    forward_join_23: {
    forward_join_17: {
    life3_3 = (__fieldRead1183_0() ^ 40736870476651L);
    life5_5 = __call1183_1();
    spill1183_0 = (p1).length;
    spill1183_1 = 1;
    if (!((life5_5 != 0))) {
        forwardValue1183_17_0 = spill1183_0;
        forwardValue1183_17_1 = spill1183_1;
        break forward_join_17;
    }
    if (!((spill1183_0 >= spill1183_1))) {
        break forward_join_87;
    }
    forwardValue1183_17_0 = __call1183_2((p1)[0]);
    forwardValue1183_17_1 = 1;
    }
    if (!((life5_5 != 0))) {
        forwardValue1183_23_0 = forwardValue1183_17_0;
        forwardValue1183_23_1 = forwardValue1183_17_1;
        break forward_join_23;
    }
    if (!((forwardValue1183_17_0 > forwardValue1183_17_1))) {
        break forward_join_87;
    }
    forwardValue1183_23_0 = (p1).length;
    forwardValue1183_23_1 = 2;
    }
    if (!((forwardValue1183_23_0 >= forwardValue1183_23_1))) {
        break forward_join_29;
    }
    forwardValue1183_30_0 = __call1183_3(p0, p1, 1);
    break forward_join_30;
    }
    forwardValue1183_30_0 = null;
    }
    life6_44 = forwardValue1183_30_0;
    life7_50 = __call1183_5(__fieldRead1183_4(), (p1)[0]);
    if (!(__call1183_6(life7_50))) {
        break forward_join_56;
    }
    spill1183_2 = receiver;
    spill1183_3 = p0;
    spill1183_4 = (p1)[0];
    spill1183_5 = life6_44;
    if (!((life5_5 != 0))) {
        forwardValue1183_52_0 = spill1183_2;
        forwardValue1183_52_1 = spill1183_3;
        forwardValue1183_52_2 = spill1183_4;
        forwardValue1183_52_3 = spill1183_5;
        break forward_join_52;
    }
    if (!((spill1183_5 == null))) {
        forwardValue1183_51_0 = spill1183_2;
        forwardValue1183_51_1 = spill1183_3;
        forwardValue1183_51_2 = spill1183_4;
        break forward_join_51;
    }
    forwardValue1183_53_0 = spill1183_2;
    forwardValue1183_53_1 = spill1183_3;
    forwardValue1183_53_2 = spill1183_4;
    forwardValue1183_53_3 = null;
    break forward_join_53;
    }
    forwardValue1183_52_0 = forwardValue1183_51_0;
    forwardValue1183_52_1 = forwardValue1183_51_1;
    forwardValue1183_52_2 = forwardValue1183_51_2;
    forwardValue1183_52_3 = life6_44;
    }
    forwardValue1183_53_0 = forwardValue1183_52_0;
    forwardValue1183_53_1 = forwardValue1183_52_1;
    forwardValue1183_53_2 = forwardValue1183_52_2;
    forwardValue1183_53_3 = __call1183_7(forwardValue1183_52_3);
    }
    __call1183_8(forwardValue1183_53_0, forwardValue1183_53_1, forwardValue1183_53_2, forwardValue1183_53_3);
    if (!((life5_5 == 0))) {
        break forward_join_85;
    }
    }
    life8_84 = __call1183_11(__call1183_10(__call1183_9()), (p1)[0]);
    if (!((life8_84 == null))) {
        break forward_join_72;
    }
    throw new moom.ca("commands.banip.invalid", new java.lang.Object[0]);
    }
    spill1183_6 = receiver;
    spill1183_7 = p0;
    spill1183_8 = __call1183_12(life8_84);
    spill1183_9 = life6_44;
    if (!((life5_5 != 0))) {
        forwardValue1183_83_0 = spill1183_6;
        forwardValue1183_83_1 = spill1183_7;
        forwardValue1183_83_2 = spill1183_8;
        forwardValue1183_83_3 = spill1183_9;
        break forward_join_83;
    }
    if (!((spill1183_9 == null))) {
        forwardValue1183_82_0 = spill1183_6;
        forwardValue1183_82_1 = spill1183_7;
        forwardValue1183_82_2 = spill1183_8;
        break forward_join_82;
    }
    forwardValue1183_84_0 = spill1183_6;
    forwardValue1183_84_1 = spill1183_7;
    forwardValue1183_84_2 = spill1183_8;
    forwardValue1183_84_3 = null;
    break forward_join_84;
    }
    forwardValue1183_83_0 = forwardValue1183_82_0;
    forwardValue1183_83_1 = forwardValue1183_82_1;
    forwardValue1183_83_2 = forwardValue1183_82_2;
    forwardValue1183_83_3 = life6_44;
    }
    forwardValue1183_84_0 = forwardValue1183_83_0;
    forwardValue1183_84_1 = forwardValue1183_83_1;
    forwardValue1183_84_2 = forwardValue1183_83_2;
    forwardValue1183_84_3 = __call1183_13(forwardValue1183_83_3);
    }
    __call1183_14(forwardValue1183_84_0, forwardValue1183_84_1, forwardValue1183_84_2, forwardValue1183_84_3);
    }
    if (!((life5_5 == 0))) {
        break forward_join_94;
    }
    }
    throw new moom.cc("commands.banip.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1183_0(moom.b7 p0) throws Throwable {
    throw __call1118300_0(p0);
}
public static void h1183_1(moom.b7 p0) throws Throwable {
    throw __call1118301_0(p0);
}
public static void h1183_2(moom.b7 p0) throws Throwable {
    throw __call1118302_0(p0);
}
public static void h1183_3(moom.b7 p0) throws Throwable {
    throw __call1118303_0(p0);
}
public static void h1183_4(moom.b7 p0) throws Throwable {
    throw __call1118304_0(p0);
}
public static void h1183_5(moom.b7 p0) throws Throwable {
    throw __call1118305_0(p0);
}
public static void h1183_6(moom.b7 p0) throws Throwable {
    throw __call1118306_0(p0);
}
public static void h1183_7(moom.b7 p0) throws Throwable {
    throw __call1118307_0(p0);
}
public static void h1183_8(moom.b7 p0) throws Throwable {
    throw __call1118308_0(p0);
}
public static void h1183_9(moom.b7 p0) throws Throwable {
    throw __call1118309_0(p0);
}
public static void h1183_10(moom.b7 p0) throws Throwable {
    throw __call1118310_0(p0);
}
public static void h1183_11(moom.b7 p0) throws Throwable {
    throw __call1118311_0(p0);
}
private static native long __fieldRead1183_0() throws Throwable;
private static native int __call1183_1() throws Throwable;
private static native int __call1183_2(java.lang.String a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1183_3(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.util.regex.Pattern __fieldRead1183_4() throws Throwable;
private static native java.util.regex.Matcher __call1183_5(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call1183_6(java.util.regex.Matcher a0) throws Throwable;
private static native java.lang.String __call1183_7(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __call1183_8(moom.qi a0, net.minecraft.command.ICommandSender a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native moom.Bl __call1183_9() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1183_10(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1183_11(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1183_12(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __call1183_13(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __call1183_14(moom.qi a0, net.minecraft.command.ICommandSender a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.Exception __call1118300_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118301_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118302_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118303_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118304_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118305_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118306_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118307_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118308_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118309_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118310_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118311_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_3725894f405a5609d047(moom.qi a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_3725894f405a5609d047 {

public static java.util.List f1184(moom.qi receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1184_13_0;
    java.util.List forwardValue1184_18_0;
    java.lang.String[] spill1184_0;
    long life4_3;
    int life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life4_3 = (__fieldRead1184_0() ^ 107769749256936L);
    life6_5 = __call1184_1();
    spill1184_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1184_13_0 = spill1184_0;
        break forward_join_13;
    }
    if (!(((spill1184_0).length == 1))) {
        break forward_join_17;
    }
    forwardValue1184_13_0 = p1;
    }
    forwardValue1184_18_0 = __call1184_4(forwardValue1184_13_0, __call1184_3(__call1184_2()));
    break forward_join_18;
    }
    forwardValue1184_18_0 = null;
    }
    return forwardValue1184_18_0;
}
public static void h1184_0(moom.Oo p0) throws Throwable {
    throw __call1118400_0(p0);
}
public static void h1184_1(moom.Oo p0) throws Throwable {
    throw __call1118401_0(p0);
}
private static native long __fieldRead1184_0() throws Throwable;
private static native int __call1184_1() throws Throwable;
private static native moom.Bl __call1184_2() throws Throwable;
private static native java.lang.String[] __call1184_3(moom.Bl a0) throws Throwable;
private static native java.util.List __call1184_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1118400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ee7040478b3f927e3d1a(moom.qi a0, net.minecraft.command.ICommandSender a1, java.lang.String a2, java.lang.String a3) throws E;
private static final class __SourceHandler_ee7040478b3f927e3d1a {

public static void f1182(moom.qi receiver, net.minecraft.command.ICommandSender p0, java.lang.String p1, java.lang.String p2) throws Throwable {
    int spill1182_0;
    long life4_3;
    moom.BM life7_13;
    java.util.List life8_24;
    java.lang.String[] life9_28;
    int life6_29;
    int life10_31;
    java.util.Iterator life11_34;
    net.minecraft.entity.player.EntityPlayerMP life12_41;
    lexical_join_86: {
    lexical_join_71: {
    lexical_join_56: {
    life4_3 = (__fieldRead1182_0() ^ 26970980929883L);
    life7_13 = new moom.BM(p1, null, __call1182_1(p0), null, p2);
    spill1182_0 = __call1182_2();
    __call1182_6(__call1182_5(__call1182_4(__call1182_3())), life7_13);
    life8_24 = __call1182_9(__call1182_8(__call1182_7()), p1);
    life9_28 = new java.lang.String[__call1182_10(life8_24)];
    life6_29 = spill1182_0;
    life10_31 = 0;
    life11_34 = __call1182_11(life8_24);
    lexical_cycle_35: while (true) {
    if (!(__call1182_12(life11_34))) {
        break lexical_join_56;
    }
    life12_41 = __cast1182_14(__call1182_13(life11_34));
    __call1182_16(__fieldRead1182_15(life12_41), "You have been IP banned.");
    (life9_28)[(life10_31++)] = __call1182_17(life12_41);
    if (!((life6_29 == 0))) {
        break lexical_join_71;
    }
    if (!((life6_29 != 0))) { continue lexical_cycle_35; }
    break lexical_cycle_35;
    }
    }
    if (!(__call1182_18(life8_24))) {
        break lexical_join_71;
    }
    __call1182_19(p0, receiver, "commands.banip.success", new java.lang.Object[] {p1});
    if (!((life6_29 != 0))) {
        break lexical_join_86;
    }
    }
    __call1182_21(p0, receiver, "commands.banip.success.players", new java.lang.Object[] {p1, __call1182_20(life9_28)});
    }
    return;
}
public static void h1182_0(moom.Oo p0) throws Throwable {
    throw __call1118200_0(p0);
}
public static void h1182_1(moom.Oo p0) throws Throwable {
    throw __call1118201_0(p0);
}
private static native long __fieldRead1182_0() throws Throwable;
private static native java.lang.String __call1182_1(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native int __call1182_2() throws Throwable;
private static native moom.Bl __call1182_3() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1182_4(moom.Bl a0) throws Throwable;
private static native moom.BE __call1182_5(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call1182_6(moom.BE a0, moom.BM a1) throws Throwable;
private static native moom.Bl __call1182_7() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1182_8(moom.Bl a0) throws Throwable;
private static native java.util.List __call1182_9(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native int __call1182_10(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call1182_11(java.util.List a0) throws Throwable;
private static native boolean __call1182_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1182_13(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __cast1182_14(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1182_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1182_16(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1182_17(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __call1182_18(java.util.List a0) throws Throwable;
private static native void __call1182_19(net.minecraft.command.ICommandSender a0, moom.qi a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.String __call1182_20(java.lang.String[] a0) throws Throwable;
private static native void __call1182_21(net.minecraft.command.ICommandSender a0, moom.qi a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1118200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_43183a903a28b6ce0f87(moom.qi a0, net.minecraft.command.ICommandSender a1) throws E;
private static final class __SourceHandler_43183a903a28b6ce0f87 {

public static boolean f1185(moom.qi receiver, net.minecraft.command.ICommandSender p0) throws Throwable {
    int forwardValue1185_16_0;
    int forwardValue1185_20_0;
    int forwardValue1185_22_0;
    boolean spill1185_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (__fieldRead1185_0() ^ 96510378223710L);
    life4_5 = __call1185_1();
    spill1185_0 = __call1185_5(__call1185_4(__call1185_3(__call1185_2())));
    if (!((life4_5 != 0))) {
        forwardValue1185_16_0 = __integerCategory1185_6(spill1185_0);
        break forward_join_16;
    }
    if (!(spill1185_0)) {
        break forward_join_21;
    }
    forwardValue1185_16_0 = __integerCategory1185_8(__call1185_7(receiver, p0));
    }
    if (!((life4_5 != 0))) {
        forwardValue1185_20_0 = forwardValue1185_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1185_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1185_20_0 = 1;
    }
    forwardValue1185_22_0 = forwardValue1185_20_0;
    break forward_join_22;
    }
    forwardValue1185_22_0 = 0;
    }
    return __integerCategory1185_9(forwardValue1185_22_0);
}
public static void h1185_0(moom.Oo p0) throws Throwable {
    throw __call1118500_0(p0);
}
public static void h1185_1(moom.Oo p0) throws Throwable {
    throw __call1118501_0(p0);
}
public static void h1185_2(moom.Oo p0) throws Throwable {
    throw __call1118502_0(p0);
}
private static native long __fieldRead1185_0() throws Throwable;
private static native int __call1185_1() throws Throwable;
private static native moom.Bl __call1185_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1185_3(moom.Bl a0) throws Throwable;
private static native moom.BE __call1185_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native boolean __call1185_5(moom.BE a0) throws Throwable;
private static native int __integerCategory1185_6(boolean value) throws Throwable;
private static native boolean __call1185_7(moom.qi a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __integerCategory1185_8(boolean value) throws Throwable;
private static native boolean __integerCategory1185_9(int value) throws Throwable;
private static native java.lang.Exception __call1118500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118502_0(moom.Oo a0) throws Throwable;

}


static {
moom.qi.d = (moom._c.a(4348607737493744962L, -2917570892125723927L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(217033176489221L);
    moom.qi.c = java.util.regex.Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_1eb440b331b77295846c(this, p0, p1); }


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_3725894f405a5609d047(this, p0, p1, p2); }


protected void a(net.minecraft.command.ICommandSender p0, java.lang.String p1, java.lang.String p2) { __sourceHandlerCall_ee7040478b3f927e3d1a(this, p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__String() {
return "ban-ip";
}


public int a() {
return 3;
}


public boolean a__Boolean(net.minecraft.command.ICommandSender p0) { return __sourceHandlerCall_43183a903a28b6ce0f87(this, p0); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.banip.usage";
}

}
