package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;


public class x extends MessageToByteEncoder<moom.yK> {

private static org.apache.logging.log4j.Logger a;

private static org.apache.logging.log4j.Marker b;

private net.minecraft.network.EnumPacketDirection c;

private static long d;

public x(net.minecraft.network.EnumPacketDirection p0) {
super();
    this.c = p0;
}


static {
moom.x.d = (moom._c.a(7285499896142692173L, 2485318243753333777L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(258344184622697L);
    moom.x.a = org.apache.logging.log4j.LogManager.getLogger();
    moom.x.b = org.apache.logging.log4j.MarkerManager.getMarker("PACKET_SENT", net.minecraft.network.NetworkManager.b);
}

private static native <E extends Throwable> void __sourceHandlerCall_1694c124d9a5c981da36(moom.x a0, ChannelHandlerContext a1, moom.yK a2, ByteBuf a3) throws E;
private static final class __SourceHandler_1694c124d9a5c981da36 {

public static void f900199(moom.x receiver, ChannelHandlerContext p0, moom.yK p1, ByteBuf p2) throws Throwable {
    int forestValue900199_15_0;
    java.lang.Object forestValue900199_38_0;
    org.apache.logging.log4j.Logger forestValue900199_50_0;
    int spill900199_0;
    moom.yK spill900199_1;
    org.apache.logging.log4j.Logger spill900199_2;
    org.apache.logging.log4j.Marker spill900199_3;
    java.lang.String spill900199_4;
    java.lang.Object[] spill900199_5;
    java.lang.Object[] spill900199_6;
    java.lang.Object[] spill900199_7;
    long life4_3;
    int life6_5;
    net.minecraft.network.PacketBuffer life7_27;
    java.lang.Integer life7_52;
    net.minecraft.network.PacketBuffer life8_99;
    forest_join_80: {
    forest_join_73: {
    forest_join_50: {
    forest_join_38: {
    forest_join_33: {
    forest_join_16: {
    forest_join_15: {
    life4_3 = (__fieldRead900199_0() ^ 41134307705844L);
    life6_5 = __integerCategory900199_2(__call900199_1());
    spill900199_0 = __instanceOf900199_3(p1);
    if (!((life6_5 == 0))) {
        forestValue900199_15_0 = spill900199_0;
        break forest_join_15;
    }
    if (!((spill900199_0 == 0))) {
        break forest_join_16;
    }
    spill900199_1 = p1;
    if (!((life6_5 == 0))) {
        forestValue900199_38_0 = spill900199_1;
        break forest_join_38;
    }
    forestValue900199_15_0 = __instanceOf900199_4(spill900199_1);
    }
    if (!((forestValue900199_15_0 != 0))) {
        break forest_join_33;
    }
    }
    life7_27 = new net.minecraft.network.PacketBuffer(__call900199_5());
    __call900199_6(p1, life7_27);
    __call900199_11(__call900199_10(__call900199_8(__call900199_7(p0)), __classLiteral900199_9()), life7_27);
    return;
    }
    forestValue900199_38_0 = __call900199_15(__call900199_14(__call900199_12(p0), __fieldRead900199_13()));
    }
    life7_52 = __call900199_18(__cast900199_16(forestValue900199_38_0), __fieldRead900199_17(receiver), p1);
    spill900199_2 = __fieldRead900199_19();
    if (!((life6_5 == 0))) {
        forestValue900199_50_0 = spill900199_2;
        break forest_join_50;
    }
    if (!(__call900199_20(spill900199_2))) {
        break forest_join_73;
    }
    forestValue900199_50_0 = __fieldRead900199_21();
    }
    spill900199_3 = __fieldRead900199_22();
    spill900199_4 = "OUT: [{}:{}] {}";
    java.lang.Object[] __stackOp900199_23_0 = new java.lang.Object[3];
    spill900199_5 = __stackOp900199_23_0;
    (__stackOp900199_23_0)[0] = __call900199_27(__call900199_26(__call900199_24(p0), __fieldRead900199_25()));
    java.lang.Object[] __stackOp900199_28_0 = spill900199_5;
    spill900199_6 = __stackOp900199_28_0;
    (__stackOp900199_28_0)[1] = life7_52;
    java.lang.Object[] __stackOp900199_29_0 = spill900199_6;
    spill900199_7 = __stackOp900199_29_0;
    (__stackOp900199_29_0)[2] = __call900199_31(__call900199_30(p1));
    __call900199_32(forestValue900199_50_0, spill900199_3, spill900199_4, spill900199_7);
    }
    if (!((life7_52 == null))) {
        break forest_join_80;
    }
    throw new java.io.IOException("Can't serialize unregistered packet");
    }
    life8_99 = new net.minecraft.network.PacketBuffer(p2);
    __call900199_34(life8_99, __call900199_33(life7_52));
    __call900199_35(p1, life8_99);
    return;
}
public static void h900199_0(java.lang.Throwable p0) throws Throwable {
    throw __call93019900_0(p0);
}
public static void h900199_1(java.lang.Throwable p0) throws Throwable {
    throw __call93019901_0(p0);
}
public static void h900199_2(java.lang.Throwable p0) throws Throwable {
    throw __call93019902_0(p0);
}
public static void h900199_3(java.lang.Throwable p0, ChannelHandlerContext p1, net.minecraft.network.PacketBuffer p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call93019903_1(__fieldRead93019903_0(), life3_2);
    __call93019903_6(__call93019903_5(__call93019903_3(__call93019903_2(p1)), __classLiteral93019903_4()), p2);
    return;
}
public static void h900199_4(java.lang.Throwable p0) throws Throwable {
    throw __call93019904_0(p0);
}
public static void h900199_5(java.lang.Throwable p0) throws Throwable {
    throw __call93019905_0(p0);
}
public static void h900199_6(java.lang.Throwable p0) throws Throwable {
    throw __call93019906_0(p0);
}
public static void h900199_7(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    __call93019907_1(__fieldRead93019907_0(), life1_2);
    return;
}
private static native long __fieldRead900199_0() throws Throwable;
private static native boolean __call900199_1() throws Throwable;
private static native int __integerCategory900199_2(boolean value) throws Throwable;
private static native int __instanceOf900199_3(moom.yK a0) throws Throwable;
private static native int __instanceOf900199_4(moom.yK a0) throws Throwable;
private static native ByteBuf __call900199_5() throws Throwable;
private static native void __call900199_6(moom.yK a0, net.minecraft.network.PacketBuffer a1) throws Throwable;
private static native Channel __call900199_7(ChannelHandlerContext a0) throws Throwable;
private static native ChannelPipeline __call900199_8(Channel a0) throws Throwable;
private static native java.lang.Class __classLiteral900199_9() throws Throwable;
private static native ChannelHandlerContext __call900199_10(ChannelPipeline a0, java.lang.Class a1) throws Throwable;
private static native ChannelFuture __call900199_11(ChannelHandlerContext a0, net.minecraft.network.PacketBuffer a1) throws Throwable;
private static native Channel __call900199_12(ChannelHandlerContext a0) throws Throwable;
private static native AttributeKey __fieldRead900199_13() throws Throwable;
private static native Attribute __call900199_14(Channel a0, AttributeKey a1) throws Throwable;
private static native java.lang.Object __call900199_15(Attribute a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __cast900199_16(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.EnumPacketDirection __fieldRead900199_17(moom.x a0) throws Throwable;
private static native java.lang.Integer __call900199_18(net.minecraft.network.EnumConnectionState a0, net.minecraft.network.EnumPacketDirection a1, moom.yK a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead900199_19() throws Throwable;
private static native boolean __call900199_20(org.apache.logging.log4j.Logger a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead900199_21() throws Throwable;
private static native org.apache.logging.log4j.Marker __fieldRead900199_22() throws Throwable;
private static native Channel __call900199_24(ChannelHandlerContext a0) throws Throwable;
private static native AttributeKey __fieldRead900199_25() throws Throwable;
private static native Attribute __call900199_26(Channel a0, AttributeKey a1) throws Throwable;
private static native java.lang.Object __call900199_27(Attribute a0) throws Throwable;
private static native java.lang.Class __call900199_30(moom.yK a0) throws Throwable;
private static native java.lang.String __call900199_31(java.lang.Class a0) throws Throwable;
private static native void __call900199_32(org.apache.logging.log4j.Logger a0, org.apache.logging.log4j.Marker a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native int __call900199_33(java.lang.Integer a0) throws Throwable;
private static native void __call900199_34(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __call900199_35(moom.yK a0, net.minecraft.network.PacketBuffer a1) throws Throwable;
private static native java.lang.Throwable __call93019900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93019901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93019902_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead93019903_0() throws Throwable;
private static native void __call93019903_1(org.apache.logging.log4j.Logger a0, java.lang.Throwable a1) throws Throwable;
private static native Channel __call93019903_2(ChannelHandlerContext a0) throws Throwable;
private static native ChannelPipeline __call93019903_3(Channel a0) throws Throwable;
private static native java.lang.Class __classLiteral93019903_4() throws Throwable;
private static native ChannelHandlerContext __call93019903_5(ChannelPipeline a0, java.lang.Class a1) throws Throwable;
private static native ChannelFuture __call93019903_6(ChannelHandlerContext a0, net.minecraft.network.PacketBuffer a1) throws Throwable;
private static native java.lang.Throwable __call93019904_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93019905_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call93019906_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead93019907_0() throws Throwable;
private static native void __call93019907_1(org.apache.logging.log4j.Logger a0, java.lang.Throwable a1) throws Throwable;

}


protected void a(ChannelHandlerContext p0, moom.yK p1, ByteBuf p2) throws java.lang.Exception { __sourceHandlerCall_1694c124d9a5c981da36(this, p0, p1, p2); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


protected void encode__sourceBridge_21e6cb8471(ChannelHandlerContext p0, java.lang.Object p1, ByteBuf p2) throws java.lang.Exception {
((moom.x)(this)).a(((ChannelHandlerContext)(p0)), ((moom.yK)(((moom.yK)(p1)))), ((ByteBuf)(p2)));
}

public void encode(ChannelHandlerContext __bridgeParam0, moom.yK __bridgeParam1, ByteBuf __bridgeParam2) throws java.lang.Exception { this.encode__sourceBridge_21e6cb8471(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1)), ((ByteBuf)(__bridgeParam2))); }
}
