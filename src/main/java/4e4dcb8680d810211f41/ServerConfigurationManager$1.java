package net.minecraft.server.management;


class ServerConfigurationManager$1 implements net.minecraft.world.border.IBorderListener {

net.minecraft.server.management.ServerConfigurationManager a;

ServerConfigurationManager$1(net.minecraft.server.management.ServerConfigurationManager p0) { super(); }

private static void __sourceConstructorBody_cc3d0e6cd1836444(net.minecraft.server.management.ServerConfigurationManager$1 receiver, net.minecraft.server.management.ServerConfigurationManager p0) throws Throwable {
((net.minecraft.server.management.ServerConfigurationManager$1)(receiver)).a = ((net.minecraft.server.management.ServerConfigurationManager)(p0));
    net.minecraft.server.management.ServerConfigurationManager$1.__sourceConstructorInit_cc3d0e6cd1836444_0(((net.minecraft.server.management.ServerConfigurationManager$1)(receiver)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_cc3d0e6cd1836444_0(net.minecraft.server.management.ServerConfigurationManager$1 a0) throws E;

public void b(net.minecraft.world.border.WorldBorder p0, int p1) {
((net.minecraft.server.management.ServerConfigurationManager)(this.a)).a(((moom.yK)(new moom.AE(p0, net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_WARNING_BLOCKS))));
    return;
}


public void b(net.minecraft.world.border.WorldBorder p0, double p1) {
return;
}


public void c(net.minecraft.world.border.WorldBorder p0, double p1) {
return;
}


public void a(net.minecraft.world.border.WorldBorder p0, int p1) {
((net.minecraft.server.management.ServerConfigurationManager)(this.a)).a(((moom.yK)(new moom.AE(p0, net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_WARNING_TIME))));
    return;
}


public void a(net.minecraft.world.border.WorldBorder p0, double p1) {
((net.minecraft.server.management.ServerConfigurationManager)(this.a)).a(((moom.yK)(new moom.AE(p0, net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_SIZE))));
    return;
}


public void a(net.minecraft.world.border.WorldBorder p0, double p1, double p2, long p3) {
((net.minecraft.server.management.ServerConfigurationManager)(this.a)).a(((moom.yK)(new moom.AE(p0, net.minecraft.network.play.server.S44PacketWorldBorder$Action.LERP_SIZE))));
    return;
}


public void a(net.minecraft.world.border.WorldBorder p0, double p1, double p2) {
((net.minecraft.server.management.ServerConfigurationManager)(this.a)).a(((moom.yK)(new moom.AE(p0, net.minecraft.network.play.server.S44PacketWorldBorder$Action.SET_CENTER))));
    return;
}

}
