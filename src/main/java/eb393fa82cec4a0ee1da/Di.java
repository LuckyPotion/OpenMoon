package moom;

import io.netty.channel.nio.NioEventLoopGroup;


class Di extends moom.Dh {

Di() {
super();
}


protected java.lang.Object b() {
return ((moom.Di)(this)).a();
}


protected NioEventLoopGroup a() {
return new NioEventLoopGroup(0, ((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setNameFormat(((java.lang.String)("Netty Client IO #%d"))))).setDaemon(((boolean)(true))))).build());
}

}
