package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class y extends MessageToByteEncoder<ByteBuf> {

private static final long a;

public y() {
super();
}


static {
moom.y.a = (moom._c.a(5810560632252267525L, 5208599811095965613L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(266678338838437L);
}


protected void encode__sourceBridge_21e6cb8471(ChannelHandlerContext p0, java.lang.Object p1, ByteBuf p2) throws java.lang.Exception {
((moom.y)(this)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(((ByteBuf)(p1)))), ((ByteBuf)(p2)));
}


protected void a(ChannelHandlerContext p0, ByteBuf p1, ByteBuf p2) throws java.lang.Exception {
long local4 = (moom.y.a ^ 133101501603576L);
    int local6 = ((ByteBuf)(p1)).readableBytes();
    int local7 = net.minecraft.network.PacketBuffer.a(((int)(local6)));
    if ((local7 > 3)) {
        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_c390b4d0d02b_invokedynamic9773_3(local6));
    }
    net.minecraft.network.PacketBuffer local8 = new net.minecraft.network.PacketBuffer(p2);
    ((net.minecraft.network.PacketBuffer)(local8)).ensureWritable(((int)((local7 + local6))));
    ((net.minecraft.network.PacketBuffer)(local8)).a__Void(((int)(local6)));
    ((net.minecraft.network.PacketBuffer)(local8)).writeBytes(((ByteBuf)(p1)), ((int)(((ByteBuf)(p1)).readerIndex())), ((int)(local6)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c390b4d0d02b_invokedynamic9773_3(int a0) throws E;

public void encode(ChannelHandlerContext __bridgeParam0, ByteBuf __bridgeParam1, ByteBuf __bridgeParam2) { this.encode__sourceBridge_21e6cb8471(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1)), ((ByteBuf)(__bridgeParam2))); }
}
