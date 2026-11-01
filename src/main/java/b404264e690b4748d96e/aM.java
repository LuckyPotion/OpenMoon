package com.moon;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;


public class aM extends MessageToMessageDecoder<ByteBuf> {

private com.viaversion.viaversion.api.connection.UserConnection a;

private static long b;

public aM(com.viaversion.viaversion.api.connection.UserConnection p0) {
super();
    this.a = ((com.viaversion.viaversion.api.connection.UserConnection)(p0));
    return;
}


static {
com.moon.aM.b = (moom._c.a(7468346008132501977L, 3611151779820548392L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(117730247032572L);
}

private static native <E extends Throwable> void __sourceHandlerCall_b783192f8b20286b5f7c(com.moon.aM a0, ChannelHandlerContext a1, ByteBuf a2, java.util.List a3) throws E;
private static final class __SourceHandler_b783192f8b20286b5f7c {

public static void f7(com.moon.aM receiver, ChannelHandlerContext p0, ByteBuf p1, java.util.List p2) throws Throwable {
    int packetDecision;
    int discardedDecision;
    boolean packetAllowed;
    long classKeyMix;
    java.lang.String controlMarker;
    ByteBuf transformedBuffer;
    forest_join_27: {
    forest_join_25: {
    forest_join_18: {
    forest_join_15: {
    classKeyMix = (readClassKey() ^ 74101690827390L);
    controlMarker = readControlMarker();
    packetAllowed = checkIncomingPacket(packetCheckConnection(receiver));
    if (!((controlMarker == null))) {
        packetDecision = preservePacketCheckBits(packetAllowed);
        break forest_join_18;
    }
    if (!((!packetAllowed))) {
        break forest_join_15;
    }
    throw cancelIncomingPacket(null);
    }
    packetDecision = preserveTransformDecisionBits(shouldTransformPacket(transformCheckConnection(receiver)));
    }
    if (!((controlMarker == null))) {
        discardedDecision = packetDecision;
        break forest_join_25;
    }
    if (!((packetDecision == 0))) {
        break forest_join_27;
    }
    discardedDecision = preserveOutputDecisionBits(addInputToOutput(p2, retainInputBuffer(p1)));
    }
    discardDecision(discardedDecision);
    return;
    }
    transformedBuffer = copyInputBytes(allocateBuffer(contextAllocator(p0)), p1);
    transformIncoming(incomingTransformConnection(receiver), transformedBuffer, incomingCancelFactory());
    addTransformedToOutput(p2, retainTransformedBuffer(transformedBuffer));
    releaseTransformedBuffer(transformedBuffer);
    return;
}
public static void h7_0(java.lang.Exception p0) throws Throwable {
    throw wrapPacketCheckFailure(p0);
}
public static void h7_1(java.lang.Exception p0) throws Throwable {
    throw wrapPacketCancellationFailure(p0);
}
public static void h7_2(java.lang.Exception p0) throws Throwable {
    throw wrapTransformDecisionFailure(p0);
}
public static void h7_3(java.lang.Exception p0) throws Throwable {
    throw wrapOutputFailure(p0);
}
public static void h7_4(java.lang.Throwable p0, ByteBuf p1) throws Throwable {
    java.lang.Throwable releaseFailure;
    releaseFailure = p0;
    releaseOnFailure(p1);
    throw releaseFailure;
}
private static native long readClassKey() throws Throwable;
private static native java.lang.String readControlMarker() throws Throwable;
private static native com.viaversion.viaversion.api.connection.UserConnection packetCheckConnection(com.moon.aM a0) throws Throwable;
private static native boolean checkIncomingPacket(com.viaversion.viaversion.api.connection.UserConnection a0) throws Throwable;
private static native int preservePacketCheckBits(boolean value) throws Throwable;
private static native com.viaversion.viaversion.exception.CancelDecoderException cancelIncomingPacket(java.lang.Object a0) throws Throwable;
private static native com.viaversion.viaversion.api.connection.UserConnection transformCheckConnection(com.moon.aM a0) throws Throwable;
private static native boolean shouldTransformPacket(com.viaversion.viaversion.api.connection.UserConnection a0) throws Throwable;
private static native int preserveTransformDecisionBits(boolean value) throws Throwable;
private static native ByteBuf retainInputBuffer(ByteBuf a0) throws Throwable;
private static native boolean addInputToOutput(java.util.List a0, ByteBuf a1) throws Throwable;
private static native int preserveOutputDecisionBits(boolean value) throws Throwable;
private static native void discardDecision(int a0) throws Throwable;
private static native ByteBufAllocator contextAllocator(ChannelHandlerContext a0) throws Throwable;
private static native ByteBuf allocateBuffer(ByteBufAllocator a0) throws Throwable;
private static native ByteBuf copyInputBytes(ByteBuf a0, ByteBuf a1) throws Throwable;
private static native com.viaversion.viaversion.api.connection.UserConnection incomingTransformConnection(com.moon.aM a0) throws Throwable;
private static native java.util.function.Function incomingCancelFactory() throws Throwable;
private static native void transformIncoming(com.viaversion.viaversion.api.connection.UserConnection a0, ByteBuf a1, java.util.function.Function a2) throws Throwable;
private static native ByteBuf retainTransformedBuffer(ByteBuf a0) throws Throwable;
private static native boolean addTransformedToOutput(java.util.List a0, ByteBuf a1) throws Throwable;
private static native boolean releaseTransformedBuffer(ByteBuf a0) throws Throwable;
private static native java.lang.Exception wrapPacketCheckFailure(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception wrapPacketCancellationFailure(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception wrapTransformDecisionFailure(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception wrapOutputFailure(java.lang.Exception a0) throws Throwable;
private static native boolean releaseOnFailure(ByteBuf a0) throws Throwable;

}


protected void a(ChannelHandlerContext p0, ByteBuf p1, java.util.List<java.lang.Object> p2) throws java.lang.Exception { __sourceHandlerCall_b783192f8b20286b5f7c(this, p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void exceptionCaught(ChannelHandlerContext p0, java.lang.Throwable p1) throws java.lang.Exception {
int forestValue8_16_0;
    boolean spill8_0;
    long life3_3;
    java.lang.String life5_5;
    forest_join_25: {
    forest_join_16: {
    forest_join_13: {
    life3_3 = (com.moon.aM.b ^ 115068653989904L);
    life5_5 = com.moon.aL.e();
    spill8_0 = com.viaversion.viaversion.util.PipelineUtil.containsCause(((java.lang.Throwable)(p1)), ((java.lang.Class)(com.viaversion.viaversion.exception.CancelCodecException.class)));
    if (!((life5_5 == null))) {
        forestValue8_16_0 = ((spill8_0) ? 1 : 0);
        break forest_join_16;
    }
    if (!(spill8_0)) {
        break forest_join_13;
    }
    return;
    }
    forestValue8_16_0 = ((com.viaversion.viaversion.util.PipelineUtil.containsCause(((java.lang.Throwable)(p1)), ((java.lang.Class)(com.viaversion.viaversion.exception.InformativeException.class)))) ? 1 : 0);
    }
    if (!((forestValue8_16_0 != 0))) {
        break forest_join_25;
    }
    if (!((((com.viaversion.viaversion.api.connection.ProtocolInfo)(((com.viaversion.viaversion.api.connection.UserConnection)(this.a)).getProtocolInfo())).getState() != com.viaversion.viaversion.api.protocol.packet.State.HANDSHAKE))) {
        break forest_join_25;
    }
    ((java.lang.Throwable)(p1)).printStackTrace();
    }
    return;
}


protected void decode__sourceBridge_a0c7cb2455(ChannelHandlerContext p0, java.lang.Object p1, java.util.List p2) throws java.lang.Exception {
((com.moon.aM)(this)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(((ByteBuf)(p1)))), ((java.util.List)(p2)));
}

public void decode(ChannelHandlerContext __bridgeParam0, ByteBuf __bridgeParam1, java.util.List<java.lang.Object> __bridgeParam2) throws java.lang.Exception { this.decode__sourceBridge_a0c7cb2455(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1)), ((java.util.List)(__bridgeParam2))); }
}
