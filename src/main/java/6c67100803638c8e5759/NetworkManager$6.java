package net.minecraft.network;


class NetworkManager$6 extends io.netty.channel.ChannelInitializer<io.netty.channel.Channel> {

net.minecraft.network.NetworkManager a;

NetworkManager$6(net.minecraft.network.NetworkManager p0) { super(); }

private static void __sourceConstructorBody_b8b1ae65bd7032b4(net.minecraft.network.NetworkManager$6 receiver, net.minecraft.network.NetworkManager p0) throws Throwable {
((net.minecraft.network.NetworkManager$6)(receiver)).a = ((net.minecraft.network.NetworkManager)(p0));
    net.minecraft.network.NetworkManager$6.__sourceConstructorInit_b8b1ae65bd7032b4_0(((net.minecraft.network.NetworkManager$6)(receiver)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_b8b1ae65bd7032b4_0(net.minecraft.network.NetworkManager$6 a0) throws E;

protected void initChannel(io.netty.channel.Channel p0) throws java.lang.Exception {
((io.netty.channel.ChannelPipeline)(((io.netty.channel.Channel)(p0)).pipeline())).addLast(((java.lang.String)("packet_handler")), ((io.netty.channel.ChannelHandler)(this.a)));
    return;
}

}
