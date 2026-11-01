package net.minecraft.network;


public class NetworkManager extends io.netty.channel.SimpleChannelInboundHandler<moom.yK> {

public static org.apache.logging.log4j.Marker a;

public static org.apache.logging.log4j.Marker b;

public static io.netty.util.AttributeKey<net.minecraft.network.EnumConnectionState> c;

public static moom.Dh<io.netty.channel.nio.NioEventLoopGroup> d;

public static moom.Dh<io.netty.channel.epoll.EpollEventLoopGroup> e;

public static moom.Dh<io.netty.channel.local.LocalEventLoopGroup> f;

private static org.apache.logging.log4j.Logger g;

private net.minecraft.network.EnumPacketDirection h;

private java.util.Queue<moom.yI> i;

private java.util.concurrent.locks.ReentrantReadWriteLock j;

public io.netty.channel.Channel k;

private java.net.SocketAddress l;

private moom.yE m;

private net.minecraft.util.IChatComponent n;

private boolean o;

private boolean p;

private static long q;

public NetworkManager(net.minecraft.network.EnumPacketDirection p0) {
super();
    this.i = com.google.common.collect.Queues.newConcurrentLinkedQueue();
    this.j = new java.util.concurrent.locks.ReentrantReadWriteLock();
    this.h = p0;
}


static {
net.minecraft.network.NetworkManager.q = (moom._c.a(3297550614506164045L, 7769985135027772913L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(166280642171307L);
    net.minecraft.network.NetworkManager.a = org.apache.logging.log4j.MarkerManager.getMarker("NETWORK");
    net.minecraft.network.NetworkManager.b = org.apache.logging.log4j.MarkerManager.getMarker("NETWORK_PACKETS", net.minecraft.network.NetworkManager.a);
    net.minecraft.network.NetworkManager.c = io.netty.util.AttributeKey.valueOf("protocol");
    net.minecraft.network.NetworkManager.d = new moom.Di();
    net.minecraft.network.NetworkManager.e = new moom.Dj();
    net.minecraft.network.NetworkManager.f = new moom.Dk();
    net.minecraft.network.NetworkManager.g = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> void __sourceHandlerCall_93c099eb5e7b94bed876(net.minecraft.network.NetworkManager a0, int a1) throws E;
private static final class __SourceHandler_93c099eb5e7b94bed876 {

public static void f272(net.minecraft.network.NetworkManager receiver, int p0) throws Throwable {
    io.netty.channel.ChannelPipeline forwardValue272_33_0;
    java.lang.String forwardValue272_33_1;
    io.netty.channel.ChannelPipeline forwardValue272_63_0;
    java.lang.String forwardValue272_63_1;
    int forwardValue272_78_0;
    int forwardValue272_95_0;
    io.netty.channel.ChannelPipeline forwardValue272_109_0;
    int spill272_0;
    io.netty.channel.ChannelPipeline spill272_1;
    java.lang.String spill272_2;
    io.netty.channel.ChannelPipeline spill272_3;
    java.lang.String spill272_4;
    io.netty.channel.ChannelPipeline spill272_5;
    long life2_3;
    java.lang.String life4_5;
    forward_join_109: {
    forward_join_102: {
    forward_join_95: {
    forward_join_87: {
    forward_join_78: {
    forward_join_72: {
    forward_join_63: {
    forward_join_59: {
    forward_join_40: {
    forward_join_33: {
    forward_join_29: {
    life2_3 = (__fieldRead272_0() ^ 10324147397947L);
    life4_5 = __call272_1();
    spill272_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue272_78_0 = spill272_0;
        break forward_join_78;
    }
    if (!((spill272_0 >= 0))) {
        break forward_join_72;
    }
    spill272_1 = __call272_3(__fieldRead272_2(receiver));
    spill272_2 = "decompress";
    if (!((life4_5 == null))) {
        forwardValue272_33_0 = spill272_1;
        forwardValue272_33_1 = spill272_2;
        break forward_join_33;
    }
    if (!((__instanceOf272_5(__call272_4(spill272_1, spill272_2)) != 0))) {
        break forward_join_29;
    }
    __call272_10(__cast272_9(__call272_8(__call272_7(__fieldRead272_6(receiver)), "decompress")), p0);
    if (!((life4_5 != null))) {
        break forward_join_40;
    }
    }
    forwardValue272_33_0 = __call272_12(__fieldRead272_11(receiver));
    forwardValue272_33_1 = "decoder";
    }
    __call272_13(forwardValue272_33_0, forwardValue272_33_1, "decompress", new moom.s(p0));
    }
    spill272_3 = __call272_15(__fieldRead272_14(receiver));
    spill272_4 = "compress";
    if (!((life4_5 == null))) {
        forwardValue272_63_0 = spill272_3;
        forwardValue272_63_1 = spill272_4;
        break forward_join_63;
    }
    if (!((__instanceOf272_17(__call272_16(spill272_3, spill272_4)) != 0))) {
        break forward_join_59;
    }
    __call272_22(__cast272_21(__call272_20(__call272_19(__fieldRead272_18(receiver)), "decompress")), p0);
    if (!((life4_5 != null))) {
        break forward_join_102;
    }
    }
    forwardValue272_63_0 = __call272_24(__fieldRead272_23(receiver));
    forwardValue272_63_1 = "encoder";
    }
    __call272_25(forwardValue272_63_0, forwardValue272_63_1, "compress", new moom.v(p0));
    if (!((life4_5 != null))) {
        break forward_join_102;
    }
    }
    forwardValue272_78_0 = __instanceOf272_29(__call272_28(__call272_27(__fieldRead272_26(receiver)), "decompress"));
    }
    if (!((life4_5 == null))) {
        forwardValue272_95_0 = forwardValue272_78_0;
        break forward_join_95;
    }
    if (!((forwardValue272_78_0 != 0))) {
        break forward_join_87;
    }
    __call272_32(__call272_31(__fieldRead272_30(receiver)), "decompress");
    }
    spill272_5 = __call272_34(__fieldRead272_33(receiver));
    if (!((life4_5 == null))) {
        forwardValue272_109_0 = spill272_5;
        break forward_join_109;
    }
    forwardValue272_95_0 = __instanceOf272_36(__call272_35(spill272_5, "compress"));
    }
    if (!((forwardValue272_95_0 != 0))) {
        break forward_join_102;
    }
    __call272_39(__call272_38(__fieldRead272_37(receiver)), "compress");
    }
    forwardValue272_109_0 = __call272_42(__call272_41(__fieldRead272_40(receiver)), new com.moon.hQ());
    }
    __discardScalar272_43(forwardValue272_109_0);
    return;
}
public static void h272_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027200_0(p0);
}
public static void h272_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027201_0(p0);
}
public static void h272_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027202_0(p0);
}
public static void h272_3(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027203_0(p0);
}
public static void h272_4(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027204_0(p0);
}
public static void h272_5(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027205_0(p0);
}
public static void h272_6(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027206_0(p0);
}
public static void h272_7(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027207_0(p0);
}
public static void h272_8(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027208_0(p0);
}
public static void h272_9(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027209_0(p0);
}
public static void h272_10(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027210_0(p0);
}
public static void h272_11(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027211_0(p0);
}
public static void h272_12(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1027212_0(p0);
}
private static native long __fieldRead272_0() throws Throwable;
private static native java.lang.String __call272_1() throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_3(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_4(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf272_5(io.netty.channel.ChannelHandler a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_6(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_7(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_8(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native moom.s __cast272_9(io.netty.channel.ChannelHandler a0) throws Throwable;
private static native void __call272_10(moom.s a0, int a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_11(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_12(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_13(io.netty.channel.ChannelPipeline a0, java.lang.String a1, java.lang.String a2, moom.s a3) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_14(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_15(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_16(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf272_17(io.netty.channel.ChannelHandler a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_18(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_19(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_20(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native moom.v __cast272_21(io.netty.channel.ChannelHandler a0) throws Throwable;
private static native void __call272_22(moom.v a0, int a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_23(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_24(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_25(io.netty.channel.ChannelPipeline a0, java.lang.String a1, java.lang.String a2, moom.v a3) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_26(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_27(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_28(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf272_29(io.netty.channel.ChannelHandler a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_30(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_31(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_32(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_33(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_34(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_35(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf272_36(io.netty.channel.ChannelHandler a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_37(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_38(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelHandler __call272_39(io.netty.channel.ChannelPipeline a0, java.lang.String a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead272_40(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_41(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelPipeline __call272_42(io.netty.channel.ChannelPipeline a0, com.moon.hQ a1) throws Throwable;
private static native void __discardScalar272_43(io.netty.channel.ChannelPipeline a0) throws Throwable;
private static native java.lang.RuntimeException __call1027200_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027201_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027202_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027203_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027204_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027205_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027206_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027207_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027208_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027209_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027210_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027211_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1027212_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f59c43a307f078b884f9(net.minecraft.network.NetworkManager a0, io.netty.channel.ChannelHandlerContext a1, moom.yK a2) throws E;
private static final class __SourceHandler_f59c43a307f078b884f9 {

public static void f256(net.minecraft.network.NetworkManager receiver, io.netty.channel.ChannelHandlerContext p0, moom.yK p1) throws Throwable {
    int forwardValue256_24_0;
    java.lang.String spill256_0;
    boolean spill256_1;
    long life3_3;
    com.moon.event.PacketEvent life6_10;
    java.lang.String life5_15;
    forward_join_29: {
    forward_join_24: {
    life3_3 = (__fieldRead256_0() ^ 47380385930770L);
    spill256_0 = __call256_1();
    life6_10 = new com.moon.event.PacketEvent(false, p1);
    __call256_4(__call256_3(__call256_2()), life6_10);
    life5_15 = spill256_0;
    spill256_1 = __call256_5(life6_10);
    if (!((life5_15 == null))) {
        forwardValue256_24_0 = __integerCategory256_6(spill256_1);
        break forward_join_24;
    }
    if (!((!spill256_1))) {
        break forward_join_29;
    }
    forwardValue256_24_0 = __integerCategory256_9(__call256_8(__fieldRead256_7(receiver)));
    }
    if (!((forwardValue256_24_0 != 0))) {
        break forward_join_29;
    }
    __call256_11(p1, __fieldRead256_10(receiver));
    }
    return;
}
public static void h256_0(moom.On p0) throws Throwable {
    throw __call2025600_0(p0);
}
public static void h256_1(moom.On p0) throws Throwable {
    throw __call2025601_0(p0);
}
public static void h256_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2025602_0(p0);
}
public static void h256_3(moom.On p0) throws Throwable {
    moom.On local1 = p0;
    return;
}
private static native long __fieldRead256_0() throws Throwable;
private static native java.lang.String __call256_1() throws Throwable;
private static native com.moon.runtime.ClientContext __call256_2() throws Throwable;
private static native com.moon.events.EventBus __call256_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call256_4(com.moon.events.EventBus a0, com.moon.event.PacketEvent a1) throws Throwable;
private static native boolean __call256_5(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __integerCategory256_6(boolean value) throws Throwable;
private static native io.netty.channel.Channel __fieldRead256_7(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call256_8(io.netty.channel.Channel a0) throws Throwable;
private static native int __integerCategory256_9(boolean value) throws Throwable;
private static native moom.yE __fieldRead256_10(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call256_11(moom.yK a0, moom.yE a1) throws Throwable;
private static native java.lang.RuntimeException __call2025600_0(moom.On a0) throws Throwable;
private static native java.lang.RuntimeException __call2025601_0(moom.On a0) throws Throwable;
private static native java.lang.RuntimeException __call2025602_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.network.NetworkManager __sourceHandlerCall_2080377fba3b91084767(java.net.InetAddress a0, int a1, boolean a2) throws E;
private static final class __SourceHandler_2080377fba3b91084767 {

public static net.minecraft.network.NetworkManager f670004(java.net.InetAddress p0, int p1, boolean p2) throws Throwable {
    int forwardValue670004_16_0;
    java.lang.String spill670004_0;
    boolean spill670004_1;
    long life3_3;
    net.minecraft.network.NetworkManager life6_9;
    java.lang.String life5_10;
    java.lang.Class life7_21;
    moom.Dh life8_23;
    forward_join_27: {
    forward_join_23: {
    forward_join_16: {
    life3_3 = (__fieldRead670004_0() ^ 69168935594118L);
    spill670004_0 = __call670004_1();
    life6_9 = new net.minecraft.network.NetworkManager(__fieldRead670004_2());
    life5_10 = spill670004_0;
    spill670004_1 = __call670004_3();
    if (!((life5_10 == null))) {
        forwardValue670004_16_0 = __integerCategory670004_4(spill670004_1);
        break forward_join_16;
    }
    if (!(spill670004_1)) {
        break forward_join_23;
    }
    forwardValue670004_16_0 = __integerCategory670004_5(p2);
    }
    if (!((forwardValue670004_16_0 != 0))) {
        break forward_join_23;
    }
    life7_21 = __classLiteral670004_6();
    life8_23 = __fieldRead670004_7();
    if (!((life5_10 != null))) {
        break forward_join_27;
    }
    }
    life7_21 = __classLiteral670004_8();
    life8_23 = __fieldRead670004_9();
    }
    __call670004_19(__call670004_18(__cast670004_17(__call670004_16(__cast670004_15(__call670004_14(__cast670004_13(__call670004_12(new io.netty.bootstrap.Bootstrap(), __cast670004_11(__call670004_10(life8_23)))), new moom.m(life6_9))), life7_21)), p0, p1));
    return life6_9;
}
public static net.minecraft.network.NetworkManager h670004_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call69000400_0(p0);
}
private static native long __fieldRead670004_0() throws Throwable;
private static native java.lang.String __call670004_1() throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead670004_2() throws Throwable;
private static native boolean __call670004_3() throws Throwable;
private static native int __integerCategory670004_4(boolean value) throws Throwable;
private static native int __integerCategory670004_5(boolean value) throws Throwable;
private static native java.lang.Class __classLiteral670004_6() throws Throwable;
private static native moom.Dh __fieldRead670004_7() throws Throwable;
private static native java.lang.Class __classLiteral670004_8() throws Throwable;
private static native moom.Dh __fieldRead670004_9() throws Throwable;
private static native java.lang.Object __call670004_10(moom.Dh a0) throws Throwable;
private static native io.netty.channel.EventLoopGroup __cast670004_11(java.lang.Object a0) throws Throwable;
private static native io.netty.bootstrap.AbstractBootstrap __call670004_12(io.netty.bootstrap.Bootstrap a0, io.netty.channel.EventLoopGroup a1) throws Throwable;
private static native io.netty.bootstrap.Bootstrap __cast670004_13(io.netty.bootstrap.AbstractBootstrap a0) throws Throwable;
private static native io.netty.bootstrap.AbstractBootstrap __call670004_14(io.netty.bootstrap.Bootstrap a0, moom.m a1) throws Throwable;
private static native io.netty.bootstrap.Bootstrap __cast670004_15(io.netty.bootstrap.AbstractBootstrap a0) throws Throwable;
private static native io.netty.bootstrap.AbstractBootstrap __call670004_16(io.netty.bootstrap.Bootstrap a0, java.lang.Class a1) throws Throwable;
private static native io.netty.bootstrap.Bootstrap __cast670004_17(io.netty.bootstrap.AbstractBootstrap a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call670004_18(io.netty.bootstrap.Bootstrap a0, java.net.InetAddress a1, int a2) throws Throwable;
private static native io.netty.channel.ChannelFuture __call670004_19(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native java.lang.RuntimeException __call69000400_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_68d4b179ef8705d449fa(net.minecraft.network.NetworkManager a0, moom.yK a1) throws E;
private static final class __SourceHandler_68d4b179ef8705d449fa {

public static void f606(net.minecraft.network.NetworkManager receiver, moom.yK p0) throws Throwable {
    int forwardValue606_32_0;
    boolean spill606_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_37: {
    forward_join_32: {
    forward_join_19: {
    life2_3 = (__fieldRead606_0() ^ 131731141258752L);
    life4_5 = __call606_1();
    spill606_0 = __call606_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue606_32_0 = __integerCategory606_3(spill606_0);
        break forward_join_32;
    }
    if (!(spill606_0)) {
        break forward_join_19;
    }
    __call606_4(receiver);
    __call606_5(receiver, p0, null);
    if (!((life4_5 != null))) {
        break forward_join_37;
    }
    }
    __call606_8(__call606_7(__fieldRead606_6(receiver)));
    forwardValue606_32_0 = __integerCategory606_12(__call606_11(__fieldRead606_9(receiver), new moom.yI(p0, __cast606_10(null))));
    }
    __discardScalar606_13(forwardValue606_32_0);
    __call606_16(__call606_15(__fieldRead606_14(receiver)));
    }
    return;
}
public static void h606_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060600_0(p0);
}
public static void h606_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060601_0(p0);
}
public static void h606_2(java.lang.Throwable p0, net.minecraft.network.NetworkManager p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2060602_2(__call2060602_1(__fieldRead2060602_0(p1)));
    throw local2;
}
private static native long __fieldRead606_0() throws Throwable;
private static native java.lang.String __call606_1() throws Throwable;
private static native boolean __call606_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __integerCategory606_3(boolean value) throws Throwable;
private static native void __call606_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call606_5(net.minecraft.network.NetworkManager a0, moom.yK a1, java.lang.Object a2) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead606_6(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock __call606_7(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call606_8(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock a0) throws Throwable;
private static native java.util.Queue __fieldRead606_9(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.util.concurrent.GenericFutureListener[] __cast606_10(java.lang.Object a0) throws Throwable;
private static native boolean __call606_11(java.util.Queue a0, moom.yI a1) throws Throwable;
private static native int __integerCategory606_12(boolean value) throws Throwable;
private static native void __discardScalar606_13(int a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead606_14(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock __call606_15(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call606_16(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock a0) throws Throwable;
private static native java.lang.RuntimeException __call2060600_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call2060601_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead2060602_0(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock __call2060602_1(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call2060602_2(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e7c15f12a031c7556695(net.minecraft.network.NetworkManager a0, moom.yK a1, io.netty.util.concurrent.GenericFutureListener a2, io.netty.util.concurrent.GenericFutureListener[] a3) throws E;
private static final class __SourceHandler_e7c15f12a031c7556695 {

public static void f607(net.minecraft.network.NetworkManager receiver, moom.yK p0, io.netty.util.concurrent.GenericFutureListener p1, io.netty.util.concurrent.GenericFutureListener[] p2) throws Throwable {
    int forwardValue607_39_0;
    boolean spill607_0;
    long life4_3;
    java.lang.String life6_5;
    forward_join_44: {
    forward_join_39: {
    forward_join_23: {
    life4_3 = (__fieldRead607_0() ^ 11214532329230L);
    life6_5 = __call607_1();
    spill607_0 = __call607_2(receiver);
    if (!((life6_5 == null))) {
        forwardValue607_39_0 = __integerCategory607_3(spill607_0);
        break forward_join_39;
    }
    if (!(spill607_0)) {
        break forward_join_23;
    }
    __call607_4(receiver);
    __call607_7(receiver, p0, __cast607_6(__call607_5(p2, 0, p1)));
    if (!((life6_5 != null))) {
        break forward_join_44;
    }
    }
    __call607_10(__call607_9(__fieldRead607_8(receiver)));
    forwardValue607_39_0 = __integerCategory607_15(__call607_14(__fieldRead607_11(receiver), new moom.yI(p0, __cast607_13(__call607_12(p2, 0, p1)))));
    }
    __discardScalar607_16(forwardValue607_39_0);
    __call607_19(__call607_18(__fieldRead607_17(receiver)));
    }
    return;
}
public static void h607_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060700_0(p0);
}
public static void h607_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060701_0(p0);
}
public static void h607_2(java.lang.Throwable p0, net.minecraft.network.NetworkManager p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2060702_2(__call2060702_1(__fieldRead2060702_0(p1)));
    throw local2;
}
private static native long __fieldRead607_0() throws Throwable;
private static native java.lang.String __call607_1() throws Throwable;
private static native boolean __call607_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __integerCategory607_3(boolean value) throws Throwable;
private static native void __call607_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.lang.Object[] __call607_5(io.netty.util.concurrent.GenericFutureListener[] a0, int a1, io.netty.util.concurrent.GenericFutureListener a2) throws Throwable;
private static native io.netty.util.concurrent.GenericFutureListener[] __cast607_6(java.lang.Object[] a0) throws Throwable;
private static native void __call607_7(net.minecraft.network.NetworkManager a0, moom.yK a1, io.netty.util.concurrent.GenericFutureListener[] a2) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead607_8(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock __call607_9(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call607_10(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock a0) throws Throwable;
private static native java.util.Queue __fieldRead607_11(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.lang.Object[] __call607_12(io.netty.util.concurrent.GenericFutureListener[] a0, int a1, io.netty.util.concurrent.GenericFutureListener a2) throws Throwable;
private static native io.netty.util.concurrent.GenericFutureListener[] __cast607_13(java.lang.Object[] a0) throws Throwable;
private static native boolean __call607_14(java.util.Queue a0, moom.yI a1) throws Throwable;
private static native int __integerCategory607_15(boolean value) throws Throwable;
private static native void __discardScalar607_16(int a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead607_17(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock __call607_18(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call607_19(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock a0) throws Throwable;
private static native java.lang.RuntimeException __call2060700_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call2060701_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead2060702_0(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock __call2060702_1(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call2060702_2(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a9c6c6f34dca270fde63(net.minecraft.network.NetworkManager a0, moom.yK a1, io.netty.util.concurrent.GenericFutureListener[] a2) throws E;
private static final class __SourceHandler_a9c6c6f34dca270fde63 {

public static void f1645(net.minecraft.network.NetworkManager receiver, moom.yK p0, io.netty.util.concurrent.GenericFutureListener[] p1) throws Throwable {
    io.netty.channel.EventLoop forwardValue1645_65_0;
    java.lang.String spill1645_0;
    io.netty.channel.EventLoop spill1645_1;
    long life3_3;
    net.minecraft.network.EnumConnectionState life6_7;
    net.minecraft.network.EnumConnectionState life7_14;
    java.lang.String life5_15;
    io.netty.channel.ChannelFuture life8_62;
    forward_join_72: {
    forward_join_65: {
    forward_join_62: {
    forward_join_60: {
    forward_join_56: {
    forward_join_43: {
    forward_join_30: {
    forward_join_24: {
    life3_3 = (__fieldRead1645_0() ^ 38700766124229L);
    spill1645_0 = __call1645_1();
    life6_7 = __call1645_2(p0);
    life7_14 = __cast1645_7(__call1645_6(__call1645_5(__fieldRead1645_3(receiver), __fieldRead1645_4())));
    life5_15 = spill1645_0;
    if (!((life5_15 == null))) {
        break forward_join_24;
    }
    if (!((life7_14 != life6_7))) {
        break forward_join_30;
    }
    __call1645_9(__fieldRead1645_8(), "Disabled auto read");
    }
    __call1645_12(__call1645_11(__fieldRead1645_10(receiver)), 0);
    }
    spill1645_1 = __call1645_14(__fieldRead1645_13(receiver));
    if (!((life5_15 == null))) {
        forwardValue1645_65_0 = spill1645_1;
        break forward_join_65;
    }
    if (!(__call1645_15(spill1645_1))) {
        break forward_join_62;
    }
    if (!((life6_7 != life7_14))) {
        break forward_join_43;
    }
    __call1645_16(receiver, life6_7);
    }
    life8_62 = __call1645_18(__fieldRead1645_17(receiver), p0);
    if (!((life5_15 == null))) {
        break forward_join_60;
    }
    if (!((p1 != null))) {
        break forward_join_56;
    }
    __call1645_19(life8_62, p1);
    }
    __call1645_21(life8_62, __fieldRead1645_20());
    }
    if (!((life5_15 != null))) {
        break forward_join_72;
    }
    }
    forwardValue1645_65_0 = __call1645_23(__fieldRead1645_22(receiver));
    }
    __call1645_25(forwardValue1645_65_0, __invokedynamic1645_24(receiver, life6_7, life7_14, p0, p1));
    }
    return;
}
public static void h1645_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164500_0(p0);
}
public static void h1645_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164501_0(p0);
}
public static void h1645_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164502_0(p0);
}
public static void h1645_3(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164503_0(p0);
}
public static void h1645_4(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164504_0(p0);
}
public static void h1645_5(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164505_0(p0);
}
public static void h1645_6(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164506_0(p0);
}
public static void h1645_7(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164507_0(p0);
}
private static native long __fieldRead1645_0() throws Throwable;
private static native java.lang.String __call1645_1() throws Throwable;
private static native net.minecraft.network.EnumConnectionState __call1645_2(moom.yK a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1645_3(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.util.AttributeKey __fieldRead1645_4() throws Throwable;
private static native io.netty.util.Attribute __call1645_5(io.netty.channel.Channel a0, io.netty.util.AttributeKey a1) throws Throwable;
private static native java.lang.Object __call1645_6(io.netty.util.Attribute a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __cast1645_7(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1645_8() throws Throwable;
private static native void __call1645_9(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1645_10(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelConfig __call1645_11(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelConfig __call1645_12(io.netty.channel.ChannelConfig a0, int a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1645_13(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.EventLoop __call1645_14(io.netty.channel.Channel a0) throws Throwable;
private static native boolean __call1645_15(io.netty.channel.EventLoop a0) throws Throwable;
private static native void __call1645_16(net.minecraft.network.NetworkManager a0, net.minecraft.network.EnumConnectionState a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1645_17(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call1645_18(io.netty.channel.Channel a0, moom.yK a1) throws Throwable;
private static native io.netty.channel.ChannelFuture __call1645_19(io.netty.channel.ChannelFuture a0, io.netty.util.concurrent.GenericFutureListener[] a1) throws Throwable;
private static native io.netty.channel.ChannelFutureListener __fieldRead1645_20() throws Throwable;
private static native io.netty.channel.ChannelFuture __call1645_21(io.netty.channel.ChannelFuture a0, io.netty.channel.ChannelFutureListener a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1645_22(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.EventLoop __call1645_23(io.netty.channel.Channel a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic1645_24(net.minecraft.network.NetworkManager a0, net.minecraft.network.EnumConnectionState a1, net.minecraft.network.EnumConnectionState a2, moom.yK a3, io.netty.util.concurrent.GenericFutureListener[] a4) throws Throwable;
private static native void __call1645_25(io.netty.channel.EventLoop a0, java.lang.Runnable a1) throws Throwable;
private static native java.lang.RuntimeException __call1164500_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164501_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164502_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164503_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164504_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164505_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164506_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164507_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c26096d8d9c3e4106d3e(net.minecraft.network.NetworkManager a0, net.minecraft.util.IChatComponent a1) throws E;
private static final class __SourceHandler_c26096d8d9c3e4106d3e {

public static void f1646(net.minecraft.network.NetworkManager receiver, net.minecraft.util.IChatComponent p0) throws Throwable {
    io.netty.channel.Channel forwardValue1646_14_0;
    io.netty.channel.Channel spill1646_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_20: {
    forward_join_14: {
    life2_3 = (__fieldRead1646_0() ^ 23854985443905L);
    life4_5 = __call1646_1();
    spill1646_0 = __fieldRead1646_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue1646_14_0 = spill1646_0;
        break forward_join_14;
    }
    if (!(__call1646_3(spill1646_0))) {
        break forward_join_20;
    }
    forwardValue1646_14_0 = __fieldRead1646_4(receiver);
    }
    __call1646_6(__call1646_5(forwardValue1646_14_0));
    __fieldWrite1646_7(receiver, p0);
    }
    return;
}
public static void h1646_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164600_0(p0);
}
public static void h1646_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164601_0(p0);
}
private static native long __fieldRead1646_0() throws Throwable;
private static native java.lang.String __call1646_1() throws Throwable;
private static native io.netty.channel.Channel __fieldRead1646_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call1646_3(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1646_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call1646_5(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call1646_6(io.netty.channel.ChannelFuture a0) throws Throwable;
private static native void __fieldWrite1646_7(net.minecraft.network.NetworkManager a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native java.lang.RuntimeException __call1164600_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164601_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_7f80c1f20570612e6ba0(net.minecraft.network.NetworkManager a0) throws E;
private static final class __SourceHandler_7f80c1f20570612e6ba0 {

public static boolean f1647(net.minecraft.network.NetworkManager receiver) throws Throwable {
    int forwardValue1647_19_0;
    int forwardValue1647_21_0;
    int spill1647_0;
    int spill1647_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead1647_0() ^ 67596960138556L);
    life3_5 = __call1647_1();
    spill1647_0 = __instanceOf1647_3(__fieldRead1647_2(receiver));
    if (!((life3_5 == null))) {
        forwardValue1647_19_0 = spill1647_0;
        break forward_join_19;
    }
    if (!((spill1647_0 == 0))) {
        break forward_join_18;
    }
    spill1647_1 = __instanceOf1647_5(__fieldRead1647_4(receiver));
    if (!((life3_5 == null))) {
        forwardValue1647_19_0 = spill1647_1;
        break forward_join_19;
    }
    if (!((spill1647_1 != 0))) {
        break forward_join_20;
    }
    }
    forwardValue1647_19_0 = 1;
    }
    forwardValue1647_21_0 = forwardValue1647_19_0;
    break forward_join_21;
    }
    forwardValue1647_21_0 = 0;
    }
    return __integerCategory1647_6(forwardValue1647_21_0);
}
public static void h1647_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164700_0(p0);
}
public static void h1647_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164701_0(p0);
}
public static void h1647_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164702_0(p0);
}
private static native long __fieldRead1647_0() throws Throwable;
private static native java.lang.String __call1647_1() throws Throwable;
private static native io.netty.channel.Channel __fieldRead1647_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __instanceOf1647_3(io.netty.channel.Channel a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1647_4(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __instanceOf1647_5(io.netty.channel.Channel a0) throws Throwable;
private static native boolean __integerCategory1647_6(int value) throws Throwable;
private static native java.lang.RuntimeException __call1164700_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164701_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164702_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f904380beb40c14bde95(net.minecraft.network.NetworkManager a0) throws E;
private static final class __SourceHandler_f904380beb40c14bde95 {

public static void f608(net.minecraft.network.NetworkManager receiver) throws Throwable {
    io.netty.channel.Channel lexicalValue608_15_0;
    net.minecraft.network.NetworkManager lexicalValue608_18_0;
    io.netty.channel.Channel spill608_0;
    net.minecraft.network.NetworkManager spill608_1;
    long life1_3;
    java.lang.String life3_5;
    moom.yI life4_41;
    lexical_join_44: {
    lexical_join_40: {
    lexical_join_18: {
    lexical_join_15: {
    life1_3 = (__fieldRead608_0() ^ 1590145115903L);
    life3_5 = __call608_1();
    spill608_0 = __fieldRead608_2(receiver);
    if (!((life3_5 == null))) {
        lexicalValue608_15_0 = spill608_0;
        break lexical_join_15;
    }
    if (!((spill608_0 != null))) {
        break lexical_join_44;
    }
    spill608_1 = receiver;
    if (!((life3_5 == null))) {
        lexicalValue608_18_0 = spill608_1;
        break lexical_join_18;
    }
    lexicalValue608_15_0 = __fieldRead608_3(spill608_1);
    }
    if (!(__call608_4(lexicalValue608_15_0))) {
        break lexical_join_44;
    }
    lexicalValue608_18_0 = receiver;
    }
    __call608_7(__call608_6(__fieldRead608_5(lexicalValue608_18_0)));
    lexical_cycle_21: while (true) {
    if (!((!__call608_9(__fieldRead608_8(receiver))))) {
        break lexical_join_40;
    }
    life4_41 = __cast608_12(__call608_11(__fieldRead608_10(receiver)));
    __call608_15(receiver, __fieldRead608_13(life4_41), __fieldRead608_14(life4_41));
    if (!((life3_5 == null))) {
        break lexical_join_44;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    __call608_18(__call608_17(__fieldRead608_16(receiver)));
    }
    return;
}
public static void h608_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060800_0(p0);
}
public static void h608_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060801_0(p0);
}
public static void h608_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060802_0(p0);
}
public static void h608_3(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060803_0(p0);
}
public static void h608_4(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call2060804_0(p0);
}
public static void h608_5(java.lang.Throwable p0, net.minecraft.network.NetworkManager p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2060805_2(__call2060805_1(__fieldRead2060805_0(p1)));
    throw local2;
}
private static native long __fieldRead608_0() throws Throwable;
private static native java.lang.String __call608_1() throws Throwable;
private static native io.netty.channel.Channel __fieldRead608_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead608_3(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call608_4(io.netty.channel.Channel a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead608_5(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock __call608_6(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call608_7(java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock a0) throws Throwable;
private static native java.util.Queue __fieldRead608_8(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call608_9(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead608_10(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.lang.Object __call608_11(java.util.Queue a0) throws Throwable;
private static native moom.yI __cast608_12(java.lang.Object a0) throws Throwable;
private static native moom.yK __fieldRead608_13(moom.yI a0) throws Throwable;
private static native io.netty.util.concurrent.GenericFutureListener[] __fieldRead608_14(moom.yI a0) throws Throwable;
private static native void __call608_15(net.minecraft.network.NetworkManager a0, moom.yK a1, io.netty.util.concurrent.GenericFutureListener[] a2) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead608_16(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock __call608_17(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call608_18(java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock a0) throws Throwable;
private static native java.lang.RuntimeException __call2060800_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call2060801_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call2060802_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call2060803_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call2060804_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock __fieldRead2060805_0(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock __call2060805_1(java.util.concurrent.locks.ReentrantReadWriteLock a0) throws Throwable;
private static native void __call2060805_2(java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e71ae44fb732c13349ef(net.minecraft.network.NetworkManager a0) throws E;
private static final class __SourceHandler_e71ae44fb732c13349ef {

public static void f1648(net.minecraft.network.NetworkManager receiver) throws Throwable {
    net.minecraft.network.NetworkManager forwardValue1648_19_0;
    java.lang.String spill1648_0;
    net.minecraft.network.NetworkManager spill1648_1;
    long life1_3;
    java.lang.String life3_7;
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead1648_0() ^ 52163915132882L);
    spill1648_0 = __call1648_1();
    __call1648_2(receiver);
    life3_7 = spill1648_0;
    spill1648_1 = receiver;
    if (!((life3_7 == null))) {
        forwardValue1648_19_0 = spill1648_1;
        break forward_join_19;
    }
    if (!((__instanceOf1648_4(__fieldRead1648_3(spill1648_1)) != 0))) {
        break forward_join_18;
    }
    __call1648_7(__cast1648_6(__fieldRead1648_5(receiver)));
    }
    forwardValue1648_19_0 = receiver;
    }
    __call1648_9(__fieldRead1648_8(forwardValue1648_19_0));
    return;
}
public static void h1648_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164800_0(p0);
}
public static void h1648_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164801_0(p0);
}
private static native long __fieldRead1648_0() throws Throwable;
private static native java.lang.String __call1648_1() throws Throwable;
private static native void __call1648_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native moom.yE __fieldRead1648_3(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __instanceOf1648_4(moom.yE a0) throws Throwable;
private static native moom.yE __fieldRead1648_5(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native net.minecraft.util.ITickable __cast1648_6(moom.yE a0) throws Throwable;
private static native void __call1648_7(net.minecraft.util.ITickable a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1648_8(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.Channel __call1648_9(io.netty.channel.Channel a0) throws Throwable;
private static native java.lang.RuntimeException __call1164800_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164801_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0af579dc7dc869a3a3b1(net.minecraft.network.NetworkManager a0) throws E;
private static final class __SourceHandler_0af579dc7dc869a3a3b1 {

public static boolean f1649(net.minecraft.network.NetworkManager receiver) throws Throwable {
    io.netty.channel.Channel forwardValue1649_13_0;
    int forwardValue1649_18_0;
    int forwardValue1649_20_0;
    io.netty.channel.Channel spill1649_0;
    boolean spill1649_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (__fieldRead1649_0() ^ 26038668436967L);
    life3_5 = __call1649_1();
    spill1649_0 = __fieldRead1649_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue1649_13_0 = spill1649_0;
        break forward_join_13;
    }
    if (!((spill1649_0 != null))) {
        break forward_join_19;
    }
    forwardValue1649_13_0 = __fieldRead1649_3(receiver);
    }
    spill1649_1 = __call1649_4(forwardValue1649_13_0);
    if (!((life3_5 == null))) {
        forwardValue1649_18_0 = __integerCategory1649_5(spill1649_1);
        break forward_join_18;
    }
    if (!(spill1649_1)) {
        break forward_join_19;
    }
    forwardValue1649_18_0 = 1;
    }
    forwardValue1649_20_0 = forwardValue1649_18_0;
    break forward_join_20;
    }
    forwardValue1649_20_0 = 0;
    }
    return __integerCategory1649_6(forwardValue1649_20_0);
}
public static void h1649_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164900_0(p0);
}
public static void h1649_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164901_0(p0);
}
public static void h1649_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1164902_0(p0);
}
private static native long __fieldRead1649_0() throws Throwable;
private static native java.lang.String __call1649_1() throws Throwable;
private static native io.netty.channel.Channel __fieldRead1649_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1649_3(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call1649_4(io.netty.channel.Channel a0) throws Throwable;
private static native int __integerCategory1649_5(boolean value) throws Throwable;
private static native boolean __integerCategory1649_6(int value) throws Throwable;
private static native java.lang.RuntimeException __call1164900_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164901_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1164902_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dab7ba4b299eec4c709d(net.minecraft.network.NetworkManager a0) throws E;
private static final class __SourceHandler_dab7ba4b299eec4c709d {

public static void f1650(net.minecraft.network.NetworkManager receiver) throws Throwable {
    io.netty.channel.Channel forwardValue1650_13_0;
    int forwardValue1650_21_0;
    net.minecraft.network.NetworkManager forwardValue1650_26_0;
    net.minecraft.network.NetworkManager forwardValue1650_38_0;
    moom.yE forwardValue1650_44_0;
    io.netty.channel.Channel spill1650_0;
    boolean spill1650_1;
    net.minecraft.network.NetworkManager spill1650_2;
    moom.yE spill1650_3;
    long life1_3;
    java.lang.String life3_5;
    forward_join_54: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_37: {
    forward_join_26: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (__fieldRead1650_0() ^ 48535991842386L);
    life3_5 = __call1650_1();
    spill1650_0 = __fieldRead1650_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue1650_13_0 = spill1650_0;
        break forward_join_13;
    }
    if (!((spill1650_0 != null))) {
        break forward_join_54;
    }
    forwardValue1650_13_0 = __fieldRead1650_3(receiver);
    }
    spill1650_1 = __call1650_4(forwardValue1650_13_0);
    if (!((life3_5 == null))) {
        forwardValue1650_21_0 = __integerCategory1650_5(spill1650_1);
        break forward_join_21;
    }
    if (!((!spill1650_1))) {
        break forward_join_54;
    }
    spill1650_2 = receiver;
    if (!((life3_5 == null))) {
        forwardValue1650_26_0 = spill1650_2;
        break forward_join_26;
    }
    forwardValue1650_21_0 = __integerCategory1650_7(__fieldRead1650_6(spill1650_2));
    }
    if (!((forwardValue1650_21_0 == 0))) {
        break forward_join_51;
    }
    __fieldWrite1650_8(receiver, 1);
    forwardValue1650_26_0 = receiver;
    }
    if (!((life3_5 == null))) {
        forwardValue1650_38_0 = forwardValue1650_26_0;
        break forward_join_38;
    }
    if (!((__call1650_9(forwardValue1650_26_0) != null))) {
        break forward_join_37;
    }
    __call1650_12(__call1650_10(receiver), __call1650_11(receiver));
    if (!((life3_5 != null))) {
        break forward_join_54;
    }
    }
    forwardValue1650_38_0 = receiver;
    }
    spill1650_3 = __call1650_13(forwardValue1650_38_0);
    if (!((life3_5 == null))) {
        forwardValue1650_44_0 = spill1650_3;
        break forward_join_44;
    }
    if (!((spill1650_3 != null))) {
        break forward_join_54;
    }
    forwardValue1650_44_0 = __call1650_14(receiver);
    }
    __call1650_15(forwardValue1650_44_0, new moom.CM("Disconnected"));
    if (!((life3_5 != null))) {
        break forward_join_54;
    }
    }
    __call1650_17(__fieldRead1650_16(), "handleDisconnection() called twice");
    }
    return;
}
public static void h1650_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165000_0(p0);
}
public static void h1650_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165001_0(p0);
}
public static void h1650_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165002_0(p0);
}
public static void h1650_3(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165003_0(p0);
}
public static void h1650_4(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165004_0(p0);
}
public static void h1650_5(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165005_0(p0);
}
public static void h1650_6(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165006_0(p0);
}
public static void h1650_7(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165007_0(p0);
}
public static void h1650_8(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165008_0(p0);
}
public static void h1650_9(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165009_0(p0);
}
public static void h1650_10(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165010_0(p0);
}
public static void h1650_11(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1165011_0(p0);
}
private static native long __fieldRead1650_0() throws Throwable;
private static native java.lang.String __call1650_1() throws Throwable;
private static native io.netty.channel.Channel __fieldRead1650_2(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.Channel __fieldRead1650_3(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native boolean __call1650_4(io.netty.channel.Channel a0) throws Throwable;
private static native int __integerCategory1650_5(boolean value) throws Throwable;
private static native boolean __fieldRead1650_6(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native int __integerCategory1650_7(boolean value) throws Throwable;
private static native void __fieldWrite1650_8(net.minecraft.network.NetworkManager a0, int a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1650_9(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native moom.yE __call1650_10(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1650_11(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call1650_12(moom.yE a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native moom.yE __call1650_13(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native moom.yE __call1650_14(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native void __call1650_15(moom.yE a0, moom.CM a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1650_16() throws Throwable;
private static native void __call1650_17(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.RuntimeException __call1165000_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165001_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165002_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165003_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165004_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165005_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165006_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165007_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165008_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165009_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165010_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1165011_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9470590ec5fc199de240(net.minecraft.network.NetworkManager a0) throws E;
private static final class __SourceHandler_9470590ec5fc199de240 {

public static boolean f2953(net.minecraft.network.NetworkManager receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead2953_0() ^ 117607180670620L);
    return ((__fieldRead2953_1(receiver) == null) ? true : false);
}
public static void h2953_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1295300_0(p0);
}
private static native long __fieldRead2953_0() throws Throwable;
private static native io.netty.channel.Channel __fieldRead2953_1(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native java.lang.RuntimeException __call1295300_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bbc5882b78bb4c3262ad(net.minecraft.network.NetworkManager a0, net.minecraft.network.EnumConnectionState a1, net.minecraft.network.EnumConnectionState a2, moom.yK a3, io.netty.util.concurrent.GenericFutureListener[] a4) throws E;
private static final class __SourceHandler_bbc5882b78bb4c3262ad {

public static void f2954(net.minecraft.network.NetworkManager receiver, net.minecraft.network.EnumConnectionState p0, net.minecraft.network.EnumConnectionState p1, moom.yK p2, io.netty.util.concurrent.GenericFutureListener[] p3) throws Throwable {
    long life5_3;
    java.lang.String life7_5;
    io.netty.channel.ChannelFuture life8_19;
    life5_3 = (__fieldRead2954_0() ^ 25438757102713L);
    life7_5 = __call2954_1();
    if ((p0 != p1)) {
        __call2954_2(receiver, p0);
    }
    life8_19 = __call2954_4(__fieldRead2954_3(receiver), p2);
    if ((life7_5 == null)) {
        if ((p3 != null)) {
        __call2954_5(life8_19, p3);
    }
        __call2954_7(life8_19, __fieldRead2954_6());
    }
    return;
}
public static void h2954_0(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1295400_0(p0);
}
public static void h2954_1(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1295401_0(p0);
}
public static void h2954_2(io.netty.handler.timeout.TimeoutException p0) throws Throwable {
    throw __call1295402_0(p0);
}
private static native long __fieldRead2954_0() throws Throwable;
private static native java.lang.String __call2954_1() throws Throwable;
private static native void __call2954_2(net.minecraft.network.NetworkManager a0, net.minecraft.network.EnumConnectionState a1) throws Throwable;
private static native io.netty.channel.Channel __fieldRead2954_3(net.minecraft.network.NetworkManager a0) throws Throwable;
private static native io.netty.channel.ChannelFuture __call2954_4(io.netty.channel.Channel a0, moom.yK a1) throws Throwable;
private static native io.netty.channel.ChannelFuture __call2954_5(io.netty.channel.ChannelFuture a0, io.netty.util.concurrent.GenericFutureListener[] a1) throws Throwable;
private static native io.netty.channel.ChannelFutureListener __fieldRead2954_6() throws Throwable;
private static native io.netty.channel.ChannelFuture __call2954_7(io.netty.channel.ChannelFuture a0, io.netty.channel.ChannelFutureListener a1) throws Throwable;
private static native java.lang.RuntimeException __call1295400_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1295401_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;
private static native java.lang.RuntimeException __call1295402_0(io.netty.handler.timeout.TimeoutException a0) throws Throwable;

}


public void b() { __sourceHandlerCall_e71ae44fb732c13349ef(this); }


public boolean b__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


public boolean c__Boolean() { return __sourceHandlerCall_0af579dc7dc869a3a3b1(this); }


public void c() {
((io.netty.channel.ChannelConfig)(((io.netty.channel.Channel)(this.k)).config())).setAutoRead(((boolean)(false)));
    return;
}


public boolean d__Boolean() { return __sourceHandlerCall_9470590ec5fc199de240(this); }


public void d() { __sourceHandlerCall_dab7ba4b299eec4c709d(this); }


public void a(javax.crypto.SecretKey p0) {
this.o = ((boolean)(true));
    ((io.netty.channel.ChannelPipeline)(((io.netty.channel.Channel)(this.k)).pipeline())).addBefore(((java.lang.String)("splitter")), ((java.lang.String)("decrypt")), ((io.netty.channel.ChannelHandler)(new moom.z(net.minecraft.util.CryptManager.a(((int)(2)), ((java.security.Key)(p0)))))));
    ((io.netty.channel.ChannelPipeline)(((io.netty.channel.Channel)(this.k)).pipeline())).addBefore(((java.lang.String)("prepender")), ((java.lang.String)("encrypt")), ((io.netty.channel.ChannelHandler)(new moom.w(net.minecraft.util.CryptManager.a(((int)(1)), ((java.security.Key)(p0)))))));
    return;
}


public boolean a__Boolean() { return __sourceHandlerCall_7f80c1f20570612e6ba0(this); }


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public io.netty.channel.Channel a() {
return this.k;
}


public void a(int p0) { __sourceHandlerCall_93c099eb5e7b94bed876(this, p0); }


public net.minecraft.util.IChatComponent a__C5() {
return this.n;
}


public void a(moom.yE p0) {
org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(p0)), ((java.lang.String)("packetListener")), ((java.lang.Object[])(new java.lang.Object[0])));
    ((org.apache.logging.log4j.Logger)(net.minecraft.network.NetworkManager.g)).debug(((java.lang.String)("Set listener of {} to {}")), ((java.lang.Object[])(new java.lang.Object[] {this, p0})));
    this.m = ((moom.yE)(p0));
    return;
}


public moom.yE a__yE() {
return this.m;
}


public void a(moom.yK<?> p0) { __sourceHandlerCall_68d4b179ef8705d449fa(this, p0); }


protected void a(io.netty.channel.ChannelHandlerContext p0, moom.yK p1) throws java.lang.Exception { __sourceHandlerCall_f59c43a307f078b884f9(this, p0, p1); }


public static net.minecraft.network.NetworkManager a(java.net.InetAddress p0, int p1, boolean p2) { return __sourceHandlerCall_2080377fba3b91084767(p0, p1, p2); }


public void a(net.minecraft.network.EnumConnectionState p0) {
((io.netty.util.Attribute)(((io.netty.channel.Channel)(this.k)).attr(((io.netty.util.AttributeKey)(net.minecraft.network.NetworkManager.c))))).set(((java.lang.Object)(p0)));
    ((io.netty.channel.ChannelConfig)(((io.netty.channel.Channel)(this.k)).config())).setAutoRead(((boolean)(true)));
    ((org.apache.logging.log4j.Logger)(net.minecraft.network.NetworkManager.g)).debug(((java.lang.String)("Enabled auto read")));
    return;
}


public static net.minecraft.network.NetworkManager a(java.net.SocketAddress p0) {
net.minecraft.network.NetworkManager local1 = new net.minecraft.network.NetworkManager(net.minecraft.network.EnumPacketDirection.CLIENTBOUND);
    ((io.netty.channel.ChannelFuture)(((io.netty.bootstrap.Bootstrap)(((io.netty.bootstrap.Bootstrap)(((io.netty.bootstrap.Bootstrap)(((io.netty.bootstrap.Bootstrap)(((io.netty.bootstrap.Bootstrap)(((io.netty.bootstrap.Bootstrap)(((io.netty.bootstrap.Bootstrap)(new io.netty.bootstrap.Bootstrap())).group(((io.netty.channel.EventLoopGroup)(((io.netty.channel.EventLoopGroup)(((moom.Dh)(net.minecraft.network.NetworkManager.f)).a()))))))))).handler(((io.netty.channel.ChannelHandler)(new net.minecraft.network.NetworkManager$6(local1)))))))).channel(((java.lang.Class)(io.netty.channel.local.LocalChannel.class))))))).connect(((java.net.SocketAddress)(p0))))).syncUninterruptibly();
    return local1;
}


public java.net.SocketAddress a__SocketAddress() {
return this.l;
}


public void a(net.minecraft.util.IChatComponent p0) { __sourceHandlerCall_c26096d8d9c3e4106d3e(this, p0); }


private void a__Void() { __sourceHandlerCall_f904380beb40c14bde95(this); }


private void a(moom.yK p0, io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>[] p1) { __sourceHandlerCall_a9c6c6f34dca270fde63(this, p0, p1); }


public void a(moom.yK<?> p0, io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>> p1, io.netty.util.concurrent.GenericFutureListener<? extends io.netty.util.concurrent.Future<? super java.lang.Void>>[] p2) { __sourceHandlerCall_e7c15f12a031c7556695(this, p0, p1, p2); }


private void lambda$dispatchPacket$0(net.minecraft.network.EnumConnectionState p0, net.minecraft.network.EnumConnectionState p1, moom.yK p2, io.netty.util.concurrent.GenericFutureListener[] p3) { __sourceHandlerCall_bbc5882b78bb4c3262ad(this, p0, p1, p2, p3); }


public void exceptionCaught(io.netty.channel.ChannelHandlerContext p0, java.lang.Throwable p1) throws java.lang.Exception {
long life3_3;
    java.lang.String life5_5;
    moom.CN life6_15;
    forward_join_30: {
    forward_join_18: {
    life3_3 = (net.minecraft.network.NetworkManager.q ^ 134246592153752L);
    life5_5 = net.minecraft.network.PacketBuffer.b();
    if (!((((p1 instanceof io.netty.handler.timeout.TimeoutException) ? 1 : 0) != 0))) { break forward_join_18; }
    life6_15 = new moom.CN("disconnect.timeout", new java.lang.Object[0]);
    if (!((life5_5 != null))) { break forward_join_30; }
    }
    life6_15 = new moom.CN("disconnect.genericReason", new java.lang.Object[] {__sourceIntrinsic_857127f67766_invokedynamic6194_3(p1)});
    }
    ((net.minecraft.network.NetworkManager)(this)).a(((net.minecraft.util.IChatComponent)(life6_15)));
    return;
}


public void channelInactive(io.netty.channel.ChannelHandlerContext p0) throws java.lang.Exception {
((net.minecraft.network.NetworkManager)(this)).a(((net.minecraft.util.IChatComponent)(new moom.CN("disconnect.endOfStream", new java.lang.Object[0]))));
    return;
}


public void channelActive(io.netty.channel.ChannelHandlerContext p0) throws java.lang.Exception {
super.channelActive(((io.netty.channel.ChannelHandlerContext)(p0)));
    this.k = ((io.netty.channel.Channel)(((io.netty.channel.ChannelHandlerContext)(p0)).channel()));
    this.l = ((java.net.SocketAddress)(((io.netty.channel.Channel)(this.k)).remoteAddress()));
    try {
        ((net.minecraft.network.NetworkManager)(this)).a(((net.minecraft.network.EnumConnectionState)(net.minecraft.network.EnumConnectionState.HANDSHAKING)));
    } catch (java.lang.Throwable caught2) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.network.NetworkManager.g)).fatal(((java.lang.Object)(caught2)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_857127f67766_invokedynamic6194_3(java.lang.Throwable a0) throws E;

protected void channelRead0__sourceBridge_4d0fe34909(io.netty.channel.ChannelHandlerContext p0, java.lang.Object p1) throws java.lang.Exception {
((net.minecraft.network.NetworkManager)(this)).a(((io.netty.channel.ChannelHandlerContext)(p0)), ((moom.yK)(((moom.yK)(p1)))));
}

public void channelRead0(io.netty.channel.ChannelHandlerContext __bridgeParam0, moom.yK __bridgeParam1) throws java.lang.Exception { this.channelRead0__sourceBridge_4d0fe34909(((io.netty.channel.ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))); }
}
