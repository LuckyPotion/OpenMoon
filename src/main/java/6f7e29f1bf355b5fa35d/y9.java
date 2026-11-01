package moom;


public class y9 extends moom.y7 {

public y9() {
super();
    this.h = true;
}


public y9(float p0, float p1, boolean p2) {
super();
    this.d = p0;
    this.e = p1;
    this.f = p2;
    this.h = true;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.e)));
    super.b(((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
super.a(((moom.y3)(((moom.y3)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.d = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.e = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    super.a(((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


public void a(moom.y3 __bridgeParam0) { this.a__sourceBridge_691ab4d076(((moom.yE)(__bridgeParam0))); }
}
