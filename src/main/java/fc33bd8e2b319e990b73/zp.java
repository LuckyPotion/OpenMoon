package moom;


public class zp implements moom.yK<moom.y3> {

private net.minecraft.network.play.client.C16PacketClientStatus$EnumState a;

public zp() {
super();
}


public zp(net.minecraft.network.play.client.C16PacketClientStatus$EnumState p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Enum)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zp)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public net.minecraft.network.play.client.C16PacketClientStatus$EnumState a() {
return this.a;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zp)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((net.minecraft.network.play.client.C16PacketClientStatus$EnumState)(((net.minecraft.network.play.client.C16PacketClientStatus$EnumState)(((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Class)(net.minecraft.network.play.client.C16PacketClientStatus$EnumState.class)))))));
    return;
}



}
