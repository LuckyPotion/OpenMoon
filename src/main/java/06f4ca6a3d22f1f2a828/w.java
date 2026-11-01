package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;


public class w extends MessageToByteEncoder<ByteBuf> {

private final moom.yH a;

public w(javax.crypto.Cipher p0) {
super();
    this.a = new moom.yH(p0);
}


protected void encode__sourceBridge_21e6cb8471(ChannelHandlerContext p0, java.lang.Object p1, ByteBuf p2) throws java.lang.Exception {
((moom.w)(this)).a(((ChannelHandlerContext)(p0)), ((ByteBuf)(((ByteBuf)(p1)))), ((ByteBuf)(p2)));
}


protected void a(ChannelHandlerContext p0, ByteBuf p1, ByteBuf p2) throws java.lang.Exception {
((moom.yH)(this.a)).a(((ByteBuf)(p1)), ((ByteBuf)(p2)));
    return;
}


public void encode(ChannelHandlerContext __bridgeParam0, ByteBuf __bridgeParam1, ByteBuf __bridgeParam2) { this.encode__sourceBridge_21e6cb8471(((ChannelHandlerContext)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1)), ((ByteBuf)(__bridgeParam2))); }
}
