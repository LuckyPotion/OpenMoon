package moom;


class jU implements com.google.common.util.concurrent.FutureCallback<java.lang.Object> {

java.lang.String a;

net.minecraft.client.network.NetHandlerPlayClient b;

jU(net.minecraft.client.network.NetHandlerPlayClient p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_cca35a0db6dc0948(moom.jU receiver, net.minecraft.client.network.NetHandlerPlayClient p0, java.lang.String p1) throws Throwable {

((moom.jU)(receiver)).b = ((net.minecraft.client.network.NetHandlerPlayClient)(p0));

    ((moom.jU)(receiver)).a = ((java.lang.String)(p1));

    moom.jU.__sourceConstructorInit_cca35a0db6dc0948_0(((moom.jU)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_cca35a0db6dc0948_0(moom.jU a0) throws E;

public void onSuccess(java.lang.Object p0) {
((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.b)).b)).a(((moom.yK)(new moom.zs(this.a, net.minecraft.network.play.client.C19PacketResourcePackStatus$Action.SUCCESSFULLY_LOADED))));
    return;
}


public void onFailure(java.lang.Throwable p0) {
((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.b)).b)).a(((moom.yK)(new moom.zs(this.a, net.minecraft.network.play.client.C19PacketResourcePackStatus$Action.FAILED_DOWNLOAD))));
    return;
}

}
