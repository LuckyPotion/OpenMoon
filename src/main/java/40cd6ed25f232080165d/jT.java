package moom;


class jT implements com.google.common.util.concurrent.FutureCallback<java.lang.Object> {

java.lang.String a;

net.minecraft.client.network.NetHandlerPlayClient b;

jT(net.minecraft.client.network.NetHandlerPlayClient p0, java.lang.String p1) { super(); }


private static void __sourceConstructorBody_389ec227b44f8546(moom.jT receiver, net.minecraft.client.network.NetHandlerPlayClient p0, java.lang.String p1) throws Throwable {

((moom.jT)(receiver)).b = ((net.minecraft.client.network.NetHandlerPlayClient)(p0));

    ((moom.jT)(receiver)).a = ((java.lang.String)(p1));

    moom.jT.__sourceConstructorInit_389ec227b44f8546_0(((moom.jT)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_389ec227b44f8546_0(moom.jT a0) throws E;

public void onSuccess(java.lang.Object p0) {
((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.b)).b)).a(((moom.yK)(new moom.zs(this.a, net.minecraft.network.play.client.C19PacketResourcePackStatus$Action.SUCCESSFULLY_LOADED))));
    return;
}


public void onFailure(java.lang.Throwable p0) {
((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.b)).b)).a(((moom.yK)(new moom.zs(this.a, net.minecraft.network.play.client.C19PacketResourcePackStatus$Action.FAILED_DOWNLOAD))));
    return;
}

}
