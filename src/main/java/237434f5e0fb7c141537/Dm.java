package moom;

import io.netty.channel.epoll.EpollEventLoopGroup;


class Dm extends moom.Dh {

Dm() {
super();
}


protected java.lang.Object b() {
return ((moom.Dm)(this)).a();
}


protected EpollEventLoopGroup a() {
return new EpollEventLoopGroup(0, ((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setNameFormat(((java.lang.String)("Netty Epoll Server IO #%d"))))).setDaemon(((boolean)(true))))).build());
}

}
