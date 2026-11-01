package moom;


public class y8 extends moom.y7 {

public y8() {
super();
    this.g = true;
}


public y8(double p0, double p1, double p2, boolean p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.f = p3;
    this.g = true;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.c)));
    super.b(((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
super.a(((moom.y3)(((moom.y3)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((double)(((net.minecraft.network.PacketBuffer)(p0)).readDouble()));
    this.b = ((double)(((net.minecraft.network.PacketBuffer)(p0)).readDouble()));
    this.c = ((double)(((net.minecraft.network.PacketBuffer)(p0)).readDouble()));
    super.a(((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


public void a(moom.y3 __bridgeParam0) { this.a__sourceBridge_691ab4d076(((moom.yE)(__bridgeParam0))); }
}
