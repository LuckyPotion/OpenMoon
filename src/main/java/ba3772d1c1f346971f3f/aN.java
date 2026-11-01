package com.moon;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;


public class aN extends MessageToMessageEncoder<ByteBuf> {

private com.viaversion.viaversion.api.connection.UserConnection a;

private static long b;

public aN(com.viaversion.viaversion.api.connection.UserConnection p0) {
super();
    this.a = ((com.viaversion.viaversion.api.connection.UserConnection)(p0));
    return;
}


static {
com.moon.aN.b = (moom._c.a(8800438596588539173L, -3378493313989470335L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(201966826396990L);
}

private static native <E extends Throwable> void __sourceHandlerCall_e2b9ae3273a677956ddb(com.moon.aN a0, ChannelHandlerContext a1, ByteBuf a2, java.util.List a3) throws E;
private static final class __SourceHandler_e2b9ae3273a677956ddb {

public static void f9(com.moon.aN receiver, ChannelHandlerContext p0, ByteBuf p1, java.util.List p2) throws Throwable {
    int packetDecision;
    int discardedDecision;
    boolean packetAllowed;
    long classKeyMix;
    java.lang.String controlMarker;
    int discardedVarInt;
    ByteBuf resetInputBuffer;
    ByteBuf transformedBuffer;
    forest_join_58: {
    forest_join_30: {
    forest_join_27: {
    forest_join_18: {
    forest_join_15: {
    classKeyMix = (readClassKey() ^ 102403281517635L);
    controlMarker = readControlMarker();
    packetAllowed = checkOutgoingPacket(packetCheckConnection(receiver));
    if (!((controlMarker == null))) {
        packetDecision = preservePacketCheckBits(packetAllowed);
        break forest_join_18;
    }
    if (!((!packetAllowed))) {
        break forest_join_15;
    }
    throw cancelOutgoingPacket(null);
    }
    packetDecision = preserveTransformDecisionBits(shouldTransformPacket(transformCheckConnection(receiver)));
    }
    if (!((controlMarker == null))) {
        discardedDecision = packetDecision;
        break forest_join_30;
    }
    if (!((packetDecision == 0))) {
        break forest_join_27;
    }
    addInputToOutput(p2, retainInputBuffer(p1));
    return;
    }
    discardedDecision = readVarInt(varIntType(), p1);
    }
    discardedVarInt = discardedDecision;
    resetInputBuffer = resetReaderIndex(p1, 0);
    transformedBuffer = copyInputBytes(allocateBuffer(contextAllocator(p0)), resetInputBuffer);
    transformOutgoing(outgoingTransformConnection(receiver), transformedBuffer, outgoingCancelFactory());
    addTransformedToOutput(p2, retainTransformedBuffer(transformedBuffer));
    releaseTransformedBuffer(transformedBuffer);
    if (!((readEntityControlMarker() != null))) {
        break forest_join_58;
    }
    writeControlMarker("Qj8m0b");
    }
    return;
}
public static void h9_0(java.lang.Exception p0) throws Throwable {
    throw wrapPacketCheckFailure(p0);
}
public static void h9_1(java.lang.Exception p0) throws Throwable {
    throw wrapPacketCancellationFailure(p0);
}
public static void h9_2(java.lang.Exception p0) throws Throwable {
    throw wrapTransformDecisionFailure(p0);
}
public static void h9_3(java.lang.Exception p0) throws Throwable {
    throw wrapOutputFailure(p0);
}
public static void h9_4(java.lang.Throwable p0, ByteBuf p1) throws Throwable {
    java.lang.Throwable releaseFailure;
    releaseFailure = p0;
    releaseOnFailure(p1);
    throw releaseFailure;
}
public static void h9_5(java.lang.Exception p0) throws Throwable {
    throw wrapTailFailure(p0);
}
private static native long readClassKey() throws Throwable;
private static native java.lang.String readControlMarker() throws Throwable;
private static native com.viaversion.viaversion.api.connection.UserConnection packetCheckConnection(com.moon.aN a0) throws Throwable;
private static native boolean checkOutgoingPacket(com.viaversion.viaversion.api.connection.UserConnection a0) throws Throwable;
private static native int preservePacketCheckBits(boolean value) throws Throwable;
private static native com.viaversion.viaversion.exception.CancelEncoderException cancelOutgoingPacket(java.lang.Object a0) throws Throwable;
private static native com.viaversion.viaversion.api.connection.UserConnection transformCheckConnection(com.moon.aN a0) throws Throwable;
private static native boolean shouldTransformPacket(com.viaversion.viaversion.api.connection.UserConnection a0) throws Throwable;
private static native int preserveTransformDecisionBits(boolean value) throws Throwable;
private static native ByteBuf retainInputBuffer(ByteBuf a0) throws Throwable;
private static native boolean addInputToOutput(java.util.List a0, ByteBuf a1) throws Throwable;
private static native com.viaversion.viaversion.api.type.types.VarIntType varIntType() throws Throwable;
private static native int readVarInt(com.viaversion.viaversion.api.type.types.VarIntType a0, ByteBuf a1) throws Throwable;
private static native ByteBuf resetReaderIndex(ByteBuf a0, int a1) throws Throwable;
private static native ByteBufAllocator contextAllocator(ChannelHandlerContext a0) throws Throwable;
private static native ByteBuf allocateBuffer(ByteBufAllocator a0) throws Throwable;
private static native ByteBuf copyInputBytes(ByteBuf a0, ByteBuf a1) throws Throwable;
private static native com.viaversion.viaversion.api.connection.UserConnection outgoingTransformConnection(com.moon.aN a0) throws Throwable;
private static native java.util.function.Function outgoingCancelFactory() throws Throwable;
private static native void transformOutgoing(com.viaversion.viaversion.api.connection.UserConnection a0, ByteBuf a1, java.util.function.Function a2) throws Throwable;
private static native ByteBuf retainTransformedBuffer(ByteBuf a0) throws Throwable;
private static native boolean addTransformedToOutput(java.util.List a0, ByteBuf a1) throws Throwable;
private static native boolean releaseTransformedBuffer(ByteBuf a0) throws Throwable;
private static native java.lang.String[] readEntityControlMarker() throws Throwable;
private static native void writeControlMarker(java.lang.String a0) throws Throwable;
private static native java.lang.Exception wrapPacketCheckFailure(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception wrapPacketCancellationFailure(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception wrapTransformDecisionFailure(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception wrapOutputFailure(java.lang.Exception a0) throws Throwable;
private static native boolean releaseOnFailure(ByteBuf a0) throws Throwable;
private static native java.lang.Exception wrapTailFailure(java.lang.Exception a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


protected void a(ChannelHandlerContext p0, ByteBuf p1, java.util.List<java.lang.Object> p2) throws java.lang.Exception { __sourceHandlerCall_e2b9ae3273a677956ddb(this, p0, p1, p2); }


public boolean acceptOutboundMessage(java.lang.Object p0) throws java.lang.Exception {
return (__sourceIntrinsic_booleanComparison((super.acceptOutboundMessage(((java.lang.Object)(p0))))) != 0);
}


public void exceptionCaught(ChannelHandlerContext p0, java.lang.Throwable p1) throws java.lang.Exception {
long life3_3;
    java.lang.String life5_5;
    life3_3 = (com.moon.aN.b ^ 23465594547149L);
    life5_5 = com.moon.aL.e();
    if ((life5_5 == null)) {
        if (com.viaversion.viaversion.util.PipelineUtil.containsCause(((java.lang.Throwable)(p1)), ((java.lang.Class)(com.viaversion.viaversion.exception.CancelCodecException.class)))) {
        return;
    }
        super.exceptionCaught(((ChannelHandlerContext)(p0)), ((java.lang.Throwable)(p1)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

protected void encode__sourceBridge_a0c7cb2455(ChannelHandlerContext p0, java.lang.Object p1, java.util.List p2) throws java.lang.Exception {
((com.moon.aN)(this)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(((ByteBuf)(p1)))), ((java.util.List)(p2)));
}

public void encode(ChannelHandlerContext __bridgeParam0, ByteBuf __bridgeParam1, java.util.List<java.lang.Object> __bridgeParam2) throws java.lang.Exception { this.encode__sourceBridge_a0c7cb2455(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1)), ((java.util.List)(__bridgeParam2))); }
}
