package moom;


public class qj extends net.minecraft.command.CommandBase {

private static long c;

public qj() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_15537a81ac4db9e96779(moom.qj a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_15537a81ac4db9e96779 {

public static java.util.List f1187(moom.qj receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1187_13_0;
    java.util.List forwardValue1187_18_0;
    java.lang.String[] spill1187_0;
    long life4_3;
    int life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life4_3 = (__fieldRead1187_0() ^ 4575720606857L);
    life6_5 = __call1187_1();
    spill1187_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1187_13_0 = spill1187_0;
        break forward_join_13;
    }
    if (!(((spill1187_0).length >= 1))) {
        break forward_join_17;
    }
    forwardValue1187_13_0 = p1;
    }
    forwardValue1187_18_0 = __call1187_4(forwardValue1187_13_0, __call1187_3(__call1187_2()));
    break forward_join_18;
    }
    forwardValue1187_18_0 = null;
    }
    return forwardValue1187_18_0;
}
public static void h1187_0(moom.Oo p0) throws Throwable {
    throw __call1118700_0(p0);
}
public static void h1187_1(moom.Oo p0) throws Throwable {
    throw __call1118701_0(p0);
}
private static native long __fieldRead1187_0() throws Throwable;
private static native int __call1187_1() throws Throwable;
private static native moom.Bl __call1187_2() throws Throwable;
private static native java.lang.String[] __call1187_3(moom.Bl a0) throws Throwable;
private static native java.util.List __call1187_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1118700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e4d546f769b51a0bc534(moom.qj a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_e4d546f769b51a0bc534 {

public static void f1186(moom.qj receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1186_16_0;
    net.minecraft.command.ICommandSender forwardValue1186_84_0;
    int spill1186_0;
    net.minecraft.entity.player.EntityPlayerMP spill1186_1;
    long life3_3;
    int life5_5;
    moom.Bl life6_24;
    com.mojang.authlib.GameProfile life7_31;
    java.lang.String life8_50;
    moom.BN life9_70;
    net.minecraft.entity.player.EntityPlayerMP life10_82;
    forward_join_104: {
    forward_join_97: {
    forward_join_84: {
    forward_join_83: {
    forward_join_53: {
    forward_join_41: {
    forward_join_16: {
    life3_3 = (__fieldRead1186_0() ^ 73811380477194L);
    life5_5 = __call1186_1();
    spill1186_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1186_16_0 = spill1186_0;
        break forward_join_16;
    }
    if (!((spill1186_0 >= 1))) {
        break forward_join_97;
    }
    forwardValue1186_16_0 = __call1186_2((p1)[0]);
    }
    if (!((forwardValue1186_16_0 > 0))) {
        break forward_join_97;
    }
    life6_24 = __call1186_3();
    life7_31 = __call1186_5(__call1186_4(life6_24), (p1)[0]);
    if (!((life7_31 == null))) {
        break forward_join_41;
    }
    throw new moom.b7("commands.ban.failed", new java.lang.Object[] {(p1)[0]});
    }
    life8_50 = null;
    if (!(((p1).length >= 2))) {
        break forward_join_53;
    }
    life8_50 = __call1186_7(__call1186_6(p0, p1, 1));
    }
    life9_70 = new moom.BN(life7_31, null, __call1186_8(p0), null, life8_50);
    __call1186_11(__call1186_10(__call1186_9(life6_24)), life9_70);
    life10_82 = __call1186_13(__call1186_12(life6_24), (p1)[0]);
    spill1186_1 = life10_82;
    if (!((life5_5 != 0))) {
        forwardValue1186_84_0 = spill1186_1;
        break forward_join_84;
    }
    if (!((spill1186_1 != null))) {
        break forward_join_83;
    }
    __call1186_15(__fieldRead1186_14(life10_82), "You are banned from this server.");
    }
    forwardValue1186_84_0 = p0;
    }
    __call1186_16(forwardValue1186_84_0, receiver, "commands.ban.success", new java.lang.Object[] {(p1)[0]});
    if (!((life5_5 == 0))) {
        break forward_join_104;
    }
    }
    throw new moom.cc("commands.ban.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1186_0(moom.b7 p0) throws Throwable {
    throw __call1118600_0(p0);
}
public static void h1186_1(moom.b7 p0) throws Throwable {
    throw __call1118601_0(p0);
}
public static void h1186_2(moom.b7 p0) throws Throwable {
    throw __call1118602_0(p0);
}
public static void h1186_3(moom.b7 p0) throws Throwable {
    throw __call1118603_0(p0);
}
public static void h1186_4(moom.b7 p0) throws Throwable {
    throw __call1118604_0(p0);
}
public static void h1186_5(moom.b7 p0) throws Throwable {
    throw __call1118605_0(p0);
}
private static native long __fieldRead1186_0() throws Throwable;
private static native int __call1186_1() throws Throwable;
private static native int __call1186_2(java.lang.String a0) throws Throwable;
private static native moom.Bl __call1186_3() throws Throwable;
private static native moom.Bt __call1186_4(moom.Bl a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1186_5(moom.Bt a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1186_6(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call1186_7(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native java.lang.String __call1186_8(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1186_9(moom.Bl a0) throws Throwable;
private static native moom.BF __call1186_10(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call1186_11(moom.BF a0, moom.BN a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1186_12(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1186_13(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1186_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1186_15(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native void __call1186_16(net.minecraft.command.ICommandSender a0, moom.qj a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1118600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118601_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118602_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118603_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118604_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1118605_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a6a369ca510b4a8608e5(moom.qj a0, net.minecraft.command.ICommandSender a1) throws E;
private static final class __SourceHandler_a6a369ca510b4a8608e5 {

public static boolean f1188(moom.qj receiver, net.minecraft.command.ICommandSender p0) throws Throwable {
    int forwardValue1188_16_0;
    int forwardValue1188_20_0;
    int forwardValue1188_22_0;
    boolean spill1188_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (__fieldRead1188_0() ^ 54888967118399L);
    life4_5 = __call1188_1();
    spill1188_0 = __call1188_5(__call1188_4(__call1188_3(__call1188_2())));
    if (!((life4_5 == 0))) {
        forwardValue1188_16_0 = __integerCategory1188_6(spill1188_0);
        break forward_join_16;
    }
    if (!(spill1188_0)) {
        break forward_join_21;
    }
    forwardValue1188_16_0 = __integerCategory1188_8(__call1188_7(receiver, p0));
    }
    if (!((life4_5 == 0))) {
        forwardValue1188_20_0 = forwardValue1188_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1188_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1188_20_0 = 1;
    }
    forwardValue1188_22_0 = forwardValue1188_20_0;
    break forward_join_22;
    }
    forwardValue1188_22_0 = 0;
    }
    return __integerCategory1188_9(forwardValue1188_22_0);
}
public static void h1188_0(moom.Oo p0) throws Throwable {
    throw __call1118800_0(p0);
}
public static void h1188_1(moom.Oo p0) throws Throwable {
    throw __call1118801_0(p0);
}
public static void h1188_2(moom.Oo p0) throws Throwable {
    throw __call1118802_0(p0);
}
private static native long __fieldRead1188_0() throws Throwable;
private static native int __call1188_1() throws Throwable;
private static native moom.Bl __call1188_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1188_3(moom.Bl a0) throws Throwable;
private static native moom.BF __call1188_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native boolean __call1188_5(moom.BF a0) throws Throwable;
private static native int __integerCategory1188_6(boolean value) throws Throwable;
private static native boolean __call1188_7(moom.qj a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __integerCategory1188_8(boolean value) throws Throwable;
private static native boolean __integerCategory1188_9(int value) throws Throwable;
private static native java.lang.Exception __call1118800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1118802_0(moom.Oo a0) throws Throwable;

}


static {
moom.qj.c = (moom._c.a(8712199246433740541L, -6564512760440782608L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(155295116295891L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_15537a81ac4db9e96779(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_e4d546f769b51a0bc534(this, p0, p1); }


public java.lang.String a__String() {
return "ban";
}


public int a() {
return 3;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.ban.usage";
}


public boolean a__Boolean(net.minecraft.command.ICommandSender p0) { return __sourceHandlerCall_a6a369ca510b4a8608e5(this, p0); }

}
