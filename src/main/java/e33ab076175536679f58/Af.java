package moom;


public class Af implements moom.yK<moom.y2> {

private int a;

public Af() {
super();
}


public Af(int p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Af)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Af)(this)));
    return;
}



}
