package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;


public class z extends MessageToMessageDecoder<ByteBuf> {

private final moom.yH a;

public z(javax.crypto.Cipher p0) {
super();
    this.a = new moom.yH(p0);
}


protected void decode__sourceBridge_a0c7cb2455(ChannelHandlerContext p0, java.lang.Object p1, java.util.List p2) throws java.lang.Exception {
((moom.z)(this)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(((ByteBuf)(p1)))), ((java.util.List)(p2)));
}


protected void a(ChannelHandlerContext p0, ByteBuf p1, java.util.List<java.lang.Object> p2) throws java.lang.Exception {
((java.util.List)(p2)).add(((java.lang.Object)(((moom.yH)(this.a)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(p1))))));
    return;
}


public void decode(ChannelHandlerContext __bridgeParam0, ByteBuf __bridgeParam1, java.util.List<java.lang.Object> __bridgeParam2) { this.decode__sourceBridge_a0c7cb2455(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1)), ((java.util.List)(__bridgeParam2))); }
}
