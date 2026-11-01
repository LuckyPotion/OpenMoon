package moom;


public class jQ implements moom.yS {

private final moom.Bl a;

private final net.minecraft.network.NetworkManager b;

public jQ(moom.Bl p0, net.minecraft.network.NetworkManager p1) {
super();
    this.a = p0;
    this.b = p1;
}


public void a(moom.yT p0) {
((net.minecraft.network.NetworkManager)(this.b)).a(((net.minecraft.network.EnumConnectionState)(((moom.yT)(p0)).a__a7())));
    ((net.minecraft.network.NetworkManager)(this.b)).a(((moom.yE)(new net.minecraft.server.network.NetHandlerLoginServer(this.a, this.b))));
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
return;
}

}
