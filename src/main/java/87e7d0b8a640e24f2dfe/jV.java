package moom;


class jV implements com.google.common.util.concurrent.FutureCallback<java.lang.Object> {

java.lang.String a;

net.minecraft.client.network.NetHandlerPlayClient b;

jV(net.minecraft.client.network.NetHandlerPlayClient p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_c07b7fb863a7f48b(moom.jV receiver, net.minecraft.client.network.NetHandlerPlayClient p0, java.lang.String p1) throws Throwable {

((moom.jV)(receiver)).b = ((net.minecraft.client.network.NetHandlerPlayClient)(p0));

    ((moom.jV)(receiver)).a = ((java.lang.String)(p1));

    moom.jV.__sourceConstructorInit_c07b7fb863a7f48b_0(((moom.jV)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c07b7fb863a7f48b_0(moom.jV a0) throws E;

public void onSuccess(java.lang.Object p0) {
((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.b)).b)).a(((moom.yK)(new moom.zs(this.a, net.minecraft.network.play.client.C19PacketResourcePackStatus$Action.SUCCESSFULLY_LOADED))));
    return;
}


public void onFailure(java.lang.Throwable p0) {
((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.b)).b)).a(((moom.yK)(new moom.zs(this.a, net.minecraft.network.play.client.C19PacketResourcePackStatus$Action.FAILED_DOWNLOAD))));
    return;
}

}
