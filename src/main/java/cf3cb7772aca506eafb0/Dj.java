package moom;

import io.netty.channel.epoll.EpollEventLoopGroup;


class Dj extends moom.Dh {

Dj() {
super();
}


protected java.lang.Object b() {
return ((moom.Dj)(this)).a();
}


protected EpollEventLoopGroup a() {
return new EpollEventLoopGroup(0, ((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setNameFormat(((java.lang.String)("Netty Epoll Client IO #%d"))))).setDaemon(((boolean)(true))))).build());
}

}
