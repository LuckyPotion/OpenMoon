package moom;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;


class p extends ChannelInitializer<Channel> {

net.minecraft.network.NetworkSystem a;

p(net.minecraft.network.NetworkSystem p0) { super(); }


private static void __sourceConstructorBody_d0006698bb7e9cfb(moom.p receiver, net.minecraft.network.NetworkSystem p0) throws Throwable {

((moom.p)(receiver)).a = ((net.minecraft.network.NetworkSystem)(p0));

    moom.p.__sourceConstructorInit_d0006698bb7e9cfb_0(((moom.p)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d0006698bb7e9cfb_0(moom.p a0) throws E;

protected void initChannel(Channel p0) throws java.lang.Exception {
net.minecraft.network.NetworkManager local2 = new net.minecraft.network.NetworkManager(net.minecraft.network.EnumPacketDirection.SERVERBOUND);
    ((net.minecraft.network.NetworkManager)(local2)).a(((moom.yE)(new moom.jQ(((net.minecraft.network.NetworkSystem)(this.a)).e, local2))));
    ((java.util.List)(((net.minecraft.network.NetworkSystem)(this.a)).g)).add(((java.lang.Object)(local2)));
    ((ChannelPipeline)(((Channel)(p0)).pipeline())).addLast(((java.lang.String)("packet_handler")), ((ChannelHandler)(local2)));
    return;
}

}
