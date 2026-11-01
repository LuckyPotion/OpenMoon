package net.minecraft.network;


public class NetworkSystem {

public static moom.Dh<io.netty.channel.nio.NioEventLoopGroup> a;

public static moom.Dh<io.netty.channel.epoll.EpollEventLoopGroup> b;

public static moom.Dh<io.netty.channel.local.LocalEventLoopGroup> c;

private static org.apache.logging.log4j.Logger d;

private moom.Bl e;

private java.util.List<io.netty.channel.ChannelFuture> f;

private java.util.List<net.minecraft.network.NetworkManager> g;

public volatile boolean h;

private static long i;

public NetworkSystem(moom.Bl p0) {
super();
    this.f = java.util.Collections.synchronizedList(com.google.common.collect.Lists.newArrayList());
    this.g = java.util.Collections.synchronizedList(com.google.common.collect.Lists.newArrayList());
    this.e = p0;
    this.h = true;
}


static {
net.minecraft.network.NetworkSystem.i = (moom._c.a(-6991041111644800539L, 2150337145315647252L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(166953996002557L);
    net.minecraft.network.NetworkSystem.a = new moom.Dl();
    net.minecraft.network.NetworkSystem.b = new moom.Dm();
    net.minecraft.network.NetworkSystem.c = new moom.Dn();
    net.minecraft.network.NetworkSystem.d = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> java.net.SocketAddress __sourceHandlerCall_5a3579824a6102d6087b(net.minecraft.network.NetworkSystem a0) throws E;
private static final class __SourceHandler_5a3579824a6102d6087b {

public static java.net.SocketAddress f693(net.minecraft.network.NetworkSystem receiver) throws Throwable {
    java.util.List life2_3;
    io.netty.channel.ChannelFuture life1_25;
    __monitorEnter693_1((life2_3 = __fieldRead693_0(receiver)));
    life1_25 = __call693_14(__call693_13(__cast693_12(__call693_11(__call693_9(__call693_5(__cast693_4(__call693_3(new io.netty.bootstrap.ServerBootstrap(), __classLiteral693_2())), new moom.p(receiver)), __cast693_8(__call693_7(__fieldRead693_6()))), __fieldRead693_10()))));
    __call693_16(__fieldRead693_15(receiver), life1_25);
    __monitorExit693_17(life2_3);
    return __call693_19(__call693_18(life1_25));
}
public static java.net.SocketAddress h693_0(java.lang.Throwable p0, java.util.List p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3069300_0(p1);
    throw life2_2;
}
private static native java.util.List __fieldRead693_0(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native void __monitorEnter693_1(java.util.List a0) throws Throwable;
private static native java.lang.Class __classLiteral693_2() throws Throwable;
private static native io.netty.bootstrap.AbstractBootstrap __call693_3(io.netty.bootstrap.ServerBootstrap a0, java.lang.Class a1) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __cast693_4(io.netty.bootstrap.AbstractBootstrap a0) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __call693_5(io.netty.bootstrap.ServerBootstrap a0, moom.p a1) throws Throwable;
private static native moom.Dh __fieldRead693_6() throws Throwable;
private static native java.lang.Object __call693_7(moom.Dh a0) throws Throwable;
private static native io.netty.channel.EventLoopGroup __cast693_8(java.lang.Object a0) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __call693_9(io.netty.bootstrap.ServerBootstrap a0, io.netty.channel.EventLoopGroup a1) throws Throwable;
private static native io.netty.channel.local.LocalAddress __fieldRead693_10() throws Throwable;
private static native io.netty.bootstrap.AbstractBootstrap __call693_11(io.netty.bootstrap.ServerBootstrap a0, io.netty.channel.local.LocalAddress a1) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __cast693_12(io.netty.bootstrap.AbstractBootstrap a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call693_13(io.netty.bootstrap.ServerBootstrap a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call693_14(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native java.util.List __fieldRead693_15(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native boolean __call693_16(java.util.List a0, io.netty.channel.ChannelFuture a1) throws Throwable;
private static native void __monitorExit693_17(java.util.List a0) throws Throwable;
private static native io.netty.channel.Channel __call693_18(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native java.net.SocketAddress __call693_19(io.netty.channel.Channel a0) throws Throwable;
private static native void __monitorExit3069300_0(java.util.List a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_cfb38f215f94e2115050(net.minecraft.network.NetworkSystem a0, java.net.InetAddress a1, int a2) throws E;
private static final class __SourceHandler_cfb38f215f94e2115050 {

public static void f694(net.minecraft.network.NetworkSystem receiver, java.net.InetAddress p0, int p1) throws Throwable {
    int forestValue694_18_0;
    java.lang.String spill694_0;
    boolean spill694_1;
    long life3_3;
    java.util.List life6_8;
    java.lang.String life5_10;
    java.lang.Class life7_22;
    moom.Dh life8_24;
    forest_join_35: {
    forest_join_28: {
    forest_join_18: {
    life3_3 = (__fieldRead694_0() ^ 20669982053957L);
    spill694_0 = __call694_1();
    __monitorEnter694_3((life6_8 = __fieldRead694_2(receiver)));
    life5_10 = spill694_0;
    spill694_1 = __call694_4();
    if (!((life5_10 == null))) {
        forestValue694_18_0 = __integerCategory694_5(spill694_1);
        break forest_join_18;
    }
    if (!(spill694_1)) {
        break forest_join_28;
    }
    forestValue694_18_0 = __integerCategory694_8(__call694_7(__fieldRead694_6(receiver)));
    }
    if (!((forestValue694_18_0 != 0))) {
        break forest_join_28;
    }
    life7_22 = __classLiteral694_9();
    life8_24 = __fieldRead694_10();
    __call694_12(__fieldRead694_11(), "Using epoll channel type");
    if (!((life5_10 != null))) {
        break forest_join_35;
    }
    }
    life7_22 = __classLiteral694_13();
    life8_24 = __fieldRead694_14();
    __call694_16(__fieldRead694_15(), "Using default channel type");
    }
    __call694_28(__fieldRead694_17(receiver), __call694_27(__call694_26(__cast694_25(__call694_24(__call694_23(__call694_20(__cast694_19(__call694_18(new io.netty.bootstrap.ServerBootstrap(), life7_22)), new moom.o(receiver)), __cast694_22(__call694_21(life8_24))), p0, p1)))));
    __monitorExit694_29(life6_8);
    return;
}
public static void h694_0(java.io.IOException p0) throws Throwable {
    throw __call3069400_0(p0);
}
public static void h694_1(java.io.IOException p0) throws Throwable {
    throw __call3069401_0(p0);
}
public static void h694_2(java.lang.Throwable p0, java.util.List p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3069402_0(p1);
    throw life2_2;
}
private static native long __fieldRead694_0() throws Throwable;
private static native java.lang.String __call694_1() throws Throwable;
private static native java.util.List __fieldRead694_2(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native void __monitorEnter694_3(java.util.List a0) throws Throwable;
private static native boolean __call694_4() throws Throwable;
private static native int __integerCategory694_5(boolean value) throws Throwable;
private static native moom.Bl __fieldRead694_6(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native boolean __call694_7(moom.Bl a0) throws Throwable;
private static native int __integerCategory694_8(boolean value) throws Throwable;
private static native java.lang.Class __classLiteral694_9() throws Throwable;
private static native moom.Dh __fieldRead694_10() throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead694_11() throws Throwable;
private static native void __call694_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __classLiteral694_13() throws Throwable;
private static native moom.Dh __fieldRead694_14() throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead694_15() throws Throwable;
private static native void __call694_16(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead694_17(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native io.netty.bootstrap.AbstractBootstrap __call694_18(io.netty.bootstrap.ServerBootstrap a0, java.lang.Class a1) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __cast694_19(io.netty.bootstrap.AbstractBootstrap a0) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __call694_20(io.netty.bootstrap.ServerBootstrap a0, moom.o a1) throws Throwable;
private static native java.lang.Object __call694_21(moom.Dh a0) throws Throwable;
private static native io.netty.channel.EventLoopGroup __cast694_22(java.lang.Object a0) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __call694_23(io.netty.bootstrap.ServerBootstrap a0, io.netty.channel.EventLoopGroup a1) throws Throwable;
private static native io.netty.bootstrap.AbstractBootstrap __call694_24(io.netty.bootstrap.ServerBootstrap a0, java.net.InetAddress a1, int a2) throws Throwable;
private static native io.netty.bootstrap.ServerBootstrap __cast694_25(io.netty.bootstrap.AbstractBootstrap a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call694_26(io.netty.bootstrap.ServerBootstrap a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call694_27(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native boolean __call694_28(java.util.List a0, io.netty.channel.ChannelFuture a1) throws Throwable;
private static native void __monitorExit694_29(java.util.List a0) throws Throwable;
private static native java.lang.Exception __call3069400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3069401_0(java.io.IOException a0) throws Throwable;
private static native void __monitorExit3069402_0(java.util.List a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_da10e09f89ef025c7a87(net.minecraft.network.NetworkSystem a0) throws E;
private static final class __SourceHandler_da10e09f89ef025c7a87 {

public static void f1133(net.minecraft.network.NetworkSystem receiver) throws Throwable {
    java.lang.String spill1133_0;
    long life1_3;
    java.lang.String life3_8;
    java.util.Iterator life4_12;
    io.netty.channel.ChannelFuture life5_19;
    forest_join_27: {
    life1_3 = (__fieldRead1133_0() ^ 129679281975191L);
    spill1133_0 = __call1133_1();
    __fieldWrite1133_2(receiver, 0);
    life3_8 = spill1133_0;
    life4_12 = __call1133_4(__fieldRead1133_3(receiver));
    forest_cycle_13: while (true) {
    if (!(__call1133_5(life4_12))) {
        break forest_join_27;
    }
    life5_19 = __cast1133_7(__call1133_6(life4_12));
    __call1133_10(__call1133_9(__call1133_8(life5_19)));
    if (!((life3_8 != null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    return;
}
public static void h1133_0(java.lang.InterruptedException p0, java.lang.String p1, java.util.Iterator p2, io.netty.channel.ChannelFuture p3) throws Throwable {
    java.lang.InterruptedException life4_2;
    io.netty.channel.ChannelFuture life3_15;
    forest_join_21: {
    life4_2 = p0;
    __call3113300_1(__fieldRead3113300_0(), "Interrupted whilst closing channel");
    forest_cycle_5: while (true) {
    forest_join_8: {
    if (!((p1 != null))) {
        break forest_join_8;
    }
    break forest_join_21;
    }
    if (!(__call3113300_2(p2))) {
        break forest_join_21;
    }
    life3_15 = __cast3113300_4(__call3113300_3(p2));
    __call3113300_7(__call3113300_6(__call3113300_5(life3_15)));
    continue forest_cycle_5;
    }
    }
    return;
}
private static native long __fieldRead1133_0() throws Throwable;
private static native java.lang.String __call1133_1() throws Throwable;
private static native void __fieldWrite1133_2(net.minecraft.network.NetworkSystem a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1133_3(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native java.util.Iterator __call1133_4(java.util.List a0) throws Throwable;
private static native boolean __call1133_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1133_6(java.util.Iterator a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __cast1133_7(java.lang.Object a0) throws Throwable;
private static native io.netty.channel.Channel __call1133_8(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call1133_9(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call1133_10(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3113300_0() throws Throwable;
private static native void __call3113300_1(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call3113300_2(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3113300_3(java.util.Iterator a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __cast3113300_4(java.lang.Object a0) throws Throwable;
private static native io.netty.channel.Channel __call3113300_5(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call3113300_6(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call3113300_7(io.netty.channel.ChannelFuture a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1878914bc252aa3312ba(net.minecraft.network.NetworkSystem a0) throws E;
private static final class __SourceHandler_1878914bc252aa3312ba {

public static void f695(net.minecraft.network.NetworkSystem receiver) throws Throwable {
    int forestValue695_33_0;
    net.minecraft.network.NetworkManager forestValue695_41_0;
    java.lang.String spill695_0;
    boolean spill695_1;
    net.minecraft.network.NetworkManager spill695_2;
    long life1_3;
    java.util.List life4_8;
    java.lang.String life3_10;
    java.util.Iterator life5_14;
    net.minecraft.network.NetworkManager life6_21;
    forest_join_46: {
    forest_join_44: {
    life1_3 = (__fieldRead695_0() ^ 65938674649630L);
    spill695_0 = __call695_1();
    __monitorEnter695_3((life4_8 = __fieldRead695_2(receiver)));
    life3_10 = spill695_0;
    life5_14 = __call695_5(__fieldRead695_4(receiver));
    forest_cycle_15: while (true) {
    forest_join_42: {
    forest_join_41: {
    forest_join_40: {
    forest_join_33: {
    if (!(__call695_6(life5_14))) {
        break forest_join_44;
    }
    life6_21 = __cast695_8(__call695_7(life5_14));
    if (!((life3_10 == null))) {
        break forest_join_46;
    }
    spill695_1 = __call695_9(life6_21);
    if (!((life3_10 == null))) {
        forestValue695_33_0 = __integerCategory695_10(spill695_1);
        break forest_join_33;
    }
    if (!((!spill695_1))) {
        break forest_join_42;
    }
    spill695_2 = life6_21;
    if (!((life3_10 == null))) {
        forestValue695_41_0 = spill695_2;
        break forest_join_41;
    }
    forestValue695_33_0 = __integerCategory695_12(__call695_11(spill695_2));
    }
    if (!((forestValue695_33_0 == 0))) {
        break forest_join_40;
    }
    __call695_13(life5_14);
    __call695_14(life6_21);
    if (!((life3_10 != null))) {
        break forest_join_42;
    }
    }
    forestValue695_41_0 = life6_21;
    }
    __call695_15(forestValue695_41_0);
    }
    if (!((life3_10 != null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    __monitorExit695_16(life4_8);
    }
    return;
}
public static void h695_0(java.lang.Exception p0) throws Throwable {
    throw __call3069500_0(p0);
}
public static void h695_1(java.lang.Exception p0) throws Throwable {
    throw __call3069501_0(p0);
}
public static void h695_2(java.lang.Exception p0) throws Throwable {
    throw __call3069502_0(p0);
}
public static void h695_3(java.lang.Exception p0) throws Throwable {
    throw __call3069503_0(p0);
}
public static void h695_4(java.lang.Exception p0) throws Throwable {
    throw __call3069504_0(p0);
}
public static void h695_5(java.lang.Exception p0, java.lang.String p1, java.util.List p2, java.util.Iterator p3, net.minecraft.network.NetworkManager p4) throws Throwable {
    int forestValue3069505_73_0;
    net.minecraft.network.NetworkManager forestValue3069505_81_0;
    moom.qZ spill3069505_0;
    java.lang.String spill3069505_1;
    net.minecraft.network.NetworkManager spill3069505_2;
    moom.Oo spill3069505_3;
    moom.CM spill3069505_4;
    net.minecraft.network.NetworkManager spill3069505_5;
    moom.Az spill3069505_6;
    boolean spill3069505_7;
    net.minecraft.network.NetworkManager spill3069505_8;
    java.lang.Exception life5_2;
    moom.qY life6_12;
    moom.qZ life7_16;
    moom.CM life6_40;
    net.minecraft.network.NetworkManager life4_63;
    forest_join_85: {
    forest_join_83: {
    forest_join_34: {
    forest_join_28: {
    life5_2 = p0;
    if (!((p1 == null))) {
        break forest_join_34;
    }
    if (!(__call3069505_0(p4))) {
        break forest_join_28;
    }
    life6_12 = __call3069505_1(life5_2, "Ticking memory connection");
    life7_16 = __call3069505_2(life6_12, "Ticking connection");
    spill3069505_0 = life7_16;
    spill3069505_1 = "Connection";
    net.minecraft.network.NetworkManager __stackOp3069505_3_0 = p4;
    spill3069505_2 = __stackOp3069505_3_0;
    __call3069505_4(__stackOp3069505_3_0);
    __call3069505_6(spill3069505_0, spill3069505_1, __invokedynamic3069505_5(spill3069505_2));
    moom.Oo __stackOp3069505_8_0 = __sourceUninitializedNEW3069505_7();
    spill3069505_3 = __stackOp3069505_8_0;
    __explicitNewInit3069505_9(__stackOp3069505_8_0, life6_12);
    throw spill3069505_3;
    }
    __call3069505_13(__fieldRead3069505_10(), __invokedynamic3069505_12(__call3069505_11(p4)), life5_2);
    }
    moom.CM __stackOp3069505_15_0 = __sourceUninitializedNEW3069505_14();
    spill3069505_4 = __stackOp3069505_15_0;
    __explicitNewInit3069505_16(__stackOp3069505_15_0, "Internal server error");
    life6_40 = spill3069505_4;
    spill3069505_5 = p4;
    moom.Az __stackOp3069505_18_0 = __sourceUninitializedNEW3069505_17();
    spill3069505_6 = __stackOp3069505_18_0;
    __explicitNewInit3069505_19(__stackOp3069505_18_0, life6_40);
    __call3069505_21(spill3069505_5, spill3069505_6, __invokedynamic3069505_20(p4, life6_40), new io.netty.util.concurrent.GenericFutureListener[0]);
    __call3069505_22(p4);
    forest_cycle_52: while (true) {
    forest_join_81: {
    forest_join_80: {
    forest_join_73: {
    forest_join_55: {
    if (!((p1 != null))) {
        break forest_join_55;
    }
    break forest_join_83;
    }
    if (!(__call3069505_23(p3))) {
        break forest_join_83;
    }
    life4_63 = __cast3069505_25(__call3069505_24(p3));
    if (!((p1 == null))) {
        break forest_join_85;
    }
    spill3069505_7 = __call3069505_26(life4_63);
    if (!((p1 == null))) {
        forestValue3069505_73_0 = __integerCategory3069505_27(spill3069505_7);
        break forest_join_73;
    }
    if (!((!spill3069505_7))) {
        continue forest_cycle_52;
    }
    spill3069505_8 = life4_63;
    if (!((p1 == null))) {
        forestValue3069505_81_0 = spill3069505_8;
        break forest_join_81;
    }
    forestValue3069505_73_0 = __integerCategory3069505_29(__call3069505_28(spill3069505_8));
    }
    if (!((forestValue3069505_73_0 == 0))) {
        break forest_join_80;
    }
    __call3069505_30(p3);
    __call3069505_31(life4_63);
    if (!((p1 != null))) {
        continue forest_cycle_52;
    }
    }
    forestValue3069505_81_0 = life4_63;
    }
    __call3069505_32(forestValue3069505_81_0);
    continue forest_cycle_52;
    }
    }
    __monitorExit3069505_33(p2);
    }
    return;
}
public static void h695_6(java.lang.Exception p0) throws Throwable {
    throw __call3069506_0(p0);
}
public static void h695_7(java.lang.Throwable p0, java.util.List p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3069507_0(p1);
    throw life2_2;
}
private static native long __fieldRead695_0() throws Throwable;
private static native java.lang.String __call695_1() throws Throwable;
private static native java.util.List __fieldRead695_2(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native void __monitorEnter695_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead695_4(net.minecraft.network.NetworkSystem a0) throws Throwable;
private static native java.util.Iterator __call695_5(java.util.List a0) throws Throwable;
private static native boolean __call695_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call695_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __cast695_8(java.lang.Object a0) throws Throwable;
private static native boolean __call695_9(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __integerCategory695_10(boolean value) throws Throwable;
private static native boolean __call695_11(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __integerCategory695_12(boolean value) throws Throwable;
private static native void __call695_13(java.util.Iterator a0) throws Throwable;
private static native void __call695_14(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call695_15(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __monitorExit695_16(java.util.List a0) throws Throwable;
private static native java.lang.Exception __call3069500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3069501_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3069502_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3069503_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3069504_0(java.lang.Exception a0) throws Throwable;
private static native boolean __call3069505_0(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native moom.qY __call3069505_1(java.lang.Exception a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call3069505_2(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call3069505_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic3069505_5(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call3069505_6(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native moom.Oo __sourceUninitializedNEW3069505_7() throws Throwable;
private static native void __explicitNewInit3069505_9(moom.Oo a0, moom.qY a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3069505_10() throws Throwable;
private static native java.net.SocketAddress __call3069505_11(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.lang.String __invokedynamic3069505_12(java.net.SocketAddress a0) throws Throwable;
private static native void __call3069505_13(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native moom.CM __sourceUninitializedNEW3069505_14() throws Throwable;
private static native void __explicitNewInit3069505_16(moom.CM a0, java.lang.String a1) throws Throwable;
private static native moom.Az __sourceUninitializedNEW3069505_17() throws Throwable;
private static native void __explicitNewInit3069505_19(moom.Az a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native io.netty.util.concurrent.GenericFutureListener __invokedynamic3069505_20(net.minecraft.network.NetworkManager a0, moom.CM a1) throws Throwable;
private static native void __call3069505_21(net.minecraft.network.NetworkManager a0, moom.Az a1, io.netty.util.concurrent.GenericFutureListener a2, io.netty.util.concurrent.GenericFutureListener[] a3) throws Throwable;
private static native void __call3069505_22(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call3069505_23(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3069505_24(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.network.NetworkManager __cast3069505_25(java.lang.Object a0) throws Throwable;
private static native boolean __call3069505_26(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __integerCategory3069505_27(boolean value) throws Throwable;
private static native boolean __call3069505_28(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __integerCategory3069505_29(boolean value) throws Throwable;
private static native void __call3069505_30(java.util.Iterator a0) throws Throwable;
private static native void __call3069505_31(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call3069505_32(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __monitorExit3069505_33(java.util.List a0) throws Throwable;
private static native java.lang.Exception __call3069506_0(java.lang.Exception a0) throws Throwable;
private static native void __monitorExit3069507_0(java.util.List a0) throws Throwable;

}


public void b() { __sourceHandlerCall_1878914bc252aa3312ba(this); }


public void a(java.net.InetAddress p0, int p1) throws java.io.IOException { __sourceHandlerCall_cfb38f215f94e2115050(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public moom.Bl a__Bl() {
return this.e;
}


public java.net.SocketAddress a() { return __sourceHandlerCall_5a3579824a6102d6087b(this); }


public void a__Void() { __sourceHandlerCall_da10e09f89ef025c7a87(this); }


private static void lambda$networkTick$0(net.minecraft.network.NetworkManager p0, moom.CM p1, io.netty.util.concurrent.Future p2) throws java.lang.Exception {
((net.minecraft.network.NetworkManager)(p0)).a(((net.minecraft.util.IChatComponent)(p1)));
    return;
}

}
