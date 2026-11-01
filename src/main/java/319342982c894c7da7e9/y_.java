package moom;


public class y_ extends moom.y7 {

public y_() {
super();
    this.g = true;
    this.h = true;
}


public y_(double p0, double p1, double p2, float p3, float p4, boolean p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.h = true;
    this.g = true;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.e)));
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
    this.d = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.e = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    super.a(((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


public void a(moom.y3 __bridgeParam0) { this.a__sourceBridge_691ab4d076(((moom.yE)(__bridgeParam0))); }
}
