package moom;


public class BT implements moom.AN {

private static final net.minecraft.util.IChatComponent a;

private final moom.Bl b;

private final net.minecraft.network.NetworkManager c;

private boolean d;

private static final long e;

public BT(moom.Bl p0, net.minecraft.network.NetworkManager p1) {
super();
    this.b = p0;
    this.c = p1;
}


static {
e = (moom._c.a(-2885293059168235895L, 5849271594953823388L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(27606784054170L);
    a = new moom.CM("Status request has been handled.");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.AP p0) {
((net.minecraft.network.NetworkManager)(this.c)).a(((moom.yK)(new moom.AR(((moom.AP)(p0)).a()))));
    ((net.minecraft.network.NetworkManager)(this.c)).a(((net.minecraft.util.IChatComponent)(moom.BT.a)));
    return;
}


public void a(moom.AO p0) {
moom.BT forwardValue1500_21_0;
    moom.BT spill1500_0;
    long life2_3;
    int[] life4_5;
    forward_join_29: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (moom.BT.e ^ 37411590173991L);
    life4_5 = net.minecraft.server.network.NetHandlerLoginServer.b();
    spill1500_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1500_21_0 = spill1500_0;
        break forward_join_21;
    }
    if (!(((moom.BT)(spill1500_0)).d)) {
        break forward_join_17;
    }
    ((net.minecraft.network.NetworkManager)(this.c)).a(((net.minecraft.util.IChatComponent)(moom.BT.a)));
    if (!((life4_5 == null))) {
        break forward_join_29;
    }
    }
    this.d = ((boolean)(true));
    forwardValue1500_21_0 = this;
    }
    ((net.minecraft.network.NetworkManager)(((moom.BT)(forwardValue1500_21_0)).c)).a(((moom.yK)(new moom.AQ(((moom.Bl)(this.b)).a__yM()))));
    }
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
return;
}

}
