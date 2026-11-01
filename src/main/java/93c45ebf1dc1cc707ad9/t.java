package moom;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;


public class t extends ByteToMessageDecoder {

private static final org.apache.logging.log4j.Logger a;

private static final org.apache.logging.log4j.Marker b;

private final net.minecraft.network.EnumPacketDirection c;

private static final long d;

public t(net.minecraft.network.EnumPacketDirection p0) {
super();
    this.c = p0;
}


static {
d = (moom._c.a(-7380542445695541340L, -8335765903898138723L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(32219209281459L);
    a = org.apache.logging.log4j.LogManager.getLogger();
    b = org.apache.logging.log4j.MarkerManager.getMarker("PACKET_RECEIVED", net.minecraft.network.NetworkManager.b);
}


protected void decode(ChannelHandlerContext p0, ByteBuf p1, java.util.List<java.lang.Object> p2) throws java.lang.Exception {
moom.yK forwardValue4014_39_0;
    int forwardValue4014_73_0;
    org.apache.logging.log4j.Logger forwardValue4014_75_0;
    moom.yK spill4014_0;
    int spill4014_1;
    org.apache.logging.log4j.Logger spill4014_2;
    long life4_3;
    int life6_5;
    net.minecraft.network.PacketBuffer life7_13;
    int life8_16;
    moom.yK life9_27;
    forward_join_99: {
    forward_join_75: {
    forward_join_73: {
    forward_join_65: {
    forward_join_39: {
    forward_join_38: {
    life4_3 = (moom.t.d ^ 13065933574564L);
    life6_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    if (!((((ByteBuf)(p1)).readableBytes() != 0))) {
        break forward_join_99;
    }
    life7_13 = new net.minecraft.network.PacketBuffer(p1);
    life8_16 = ((net.minecraft.network.PacketBuffer)(life7_13)).a();
    life9_27 = ((net.minecraft.network.EnumConnectionState)(((net.minecraft.network.EnumConnectionState)(((Attribute)(((Channel)(((ChannelHandlerContext)(p0)).channel())).attr(((AttributeKey)(net.minecraft.network.NetworkManager.c))))).get())))).a(((net.minecraft.network.EnumPacketDirection)(this.c)), ((int)(life8_16)));
    spill4014_0 = life9_27;
    if (!((life6_5 != 0))) {
        forwardValue4014_39_0 = spill4014_0;
        break forward_join_39;
    }
    if (!((spill4014_0 == null))) {
        break forward_join_38;
    }
    throw new java.io.IOException(__sourceIntrinsic_aabdb495792f_invokedynamic4014_12(life8_16));
    }
    forwardValue4014_39_0 = life9_27;
    }
    ((moom.yK)(forwardValue4014_39_0)).a(((net.minecraft.network.PacketBuffer)(life7_13)));
    spill4014_1 = ((net.minecraft.network.PacketBuffer)(life7_13)).readableBytes();
    if (!((life6_5 != 0))) {
        forwardValue4014_73_0 = spill4014_1;
        break forward_join_73;
    }
    if (!((spill4014_1 > 0))) {
        break forward_join_65;
    }
    throw new java.io.IOException(__sourceIntrinsic_aabdb495792f_invokedynamic4014_24(((net.minecraft.network.EnumConnectionState)(((net.minecraft.network.EnumConnectionState)(((Attribute)(((Channel)(((ChannelHandlerContext)(p0)).channel())).attr(((AttributeKey)(net.minecraft.network.NetworkManager.c))))).get())))).a(), life8_16, ((java.lang.Class)(((java.lang.Object)(life9_27)).getClass())).getSimpleName(), ((net.minecraft.network.PacketBuffer)(life7_13)).readableBytes(), life8_16));
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(life9_27)));
    spill4014_2 = moom.t.a;
    if (!((life6_5 != 0))) {
        forwardValue4014_75_0 = spill4014_2;
        break forward_join_75;
    }
    forwardValue4014_73_0 = ((((org.apache.logging.log4j.Logger)(spill4014_2)).isDebugEnabled()) ? 1 : 0);
    }
    if (!((forwardValue4014_73_0 != 0))) {
        break forward_join_99;
    }
    forwardValue4014_75_0 = moom.t.a;
    }
    ((org.apache.logging.log4j.Logger)(forwardValue4014_75_0)).debug(((org.apache.logging.log4j.Marker)(moom.t.b)), ((java.lang.String)(" IN: [{}:{}] {}")), ((java.lang.Object[])(new java.lang.Object[] {((Attribute)(((Channel)(((ChannelHandlerContext)(p0)).channel())).attr(((AttributeKey)(net.minecraft.network.NetworkManager.c))))).get(), java.lang.Integer.valueOf(((int)(life8_16))), ((java.lang.Class)(((java.lang.Object)(life9_27)).getClass())).getName()})));
    }
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aabdb495792f_invokedynamic4014_12(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aabdb495792f_invokedynamic4014_24(int a0, int a1, java.lang.String a2, int a3, int a4) throws E;
}
