package moom;

import io.netty.channel.local.LocalEventLoopGroup;


class Dn extends moom.Dh {

Dn() {
super();
}


protected java.lang.Object b() {
return ((moom.Dn)(this)).a();
}


protected LocalEventLoopGroup a() {
return new LocalEventLoopGroup(0, ((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setNameFormat(((java.lang.String)("Netty Local Server IO #%d"))))).setDaemon(((boolean)(true))))).build());
}

}
