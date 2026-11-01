package moom;

import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;


class l extends ChannelInitializer<Channel> {

moom.jK a;

moom.jL b;

moom.jZ c;

l(moom.jZ p0, moom.jK p1, moom.jL p2) { super(); }


private static void __sourceConstructorBody_183cc69d2e22a115(moom.l receiver, moom.jZ p0, moom.jK p1, moom.jL p2) throws Throwable {

((moom.l)(receiver)).c = ((moom.jZ)(p0));

    ((moom.l)(receiver)).a = ((moom.jK)(p1));

    ((moom.l)(receiver)).b = ((moom.jL)(p2));

    moom.l.__sourceConstructorInit_183cc69d2e22a115_0(((moom.l)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_183cc69d2e22a115_0(moom.l a0) throws E;

protected void initChannel(Channel p0) throws java.lang.Exception {
try {
        ((ChannelConfig)(((Channel)(p0)).config())).setOption(((ChannelOption)(ChannelOption.TCP_NODELAY)), ((java.lang.Object)(java.lang.Boolean.TRUE)));
    } catch (ChannelException caught2) {
        
    }
    ((ChannelPipeline)(((Channel)(p0)).pipeline())).addLast(((ChannelHandler[])(new ChannelHandler[] {new moom.q(this)})));
    return;
}

}
