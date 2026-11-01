package moom;

import io.netty.channel.nio.NioEventLoopGroup;


class Dl extends moom.Dh {

Dl() {
super();
}


protected java.lang.Object b() {
return ((moom.Dl)(this)).a();
}


protected NioEventLoopGroup a() {
return new NioEventLoopGroup(0, ((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setNameFormat(((java.lang.String)("Netty Server IO #%d"))))).setDaemon(((boolean)(true))))).build());
}

}
