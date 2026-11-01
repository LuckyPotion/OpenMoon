package moom;


public class ze implements moom.yK<moom.y3> {

private int a;

private net.minecraft.network.play.client.C0BPacketEntityAction$Action b;

private int c;

public ze(int p0, net.minecraft.network.play.client.C0BPacketEntityAction$Action p1, int p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public ze(net.minecraft.entity.Entity p0, net.minecraft.network.play.client.C0BPacketEntityAction$Action p1, int p2) {
super();
    this.a = (p0).e__Int();
    this.b = p1;
    this.c = p2;
}


public ze(net.minecraft.entity.Entity p0, net.minecraft.network.play.client.C0BPacketEntityAction$Action p1) {
this(p0, p1, 0);
}


public ze() {
super();
}


public int b() {
return this.a;
}


public moom.ze b(int p0) {
this.c = ((int)(p0));
    return this;
}


public net.minecraft.network.play.client.C0BPacketEntityAction$Action b__be() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Enum)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.c)));
    return;
}


public int c() {
return this.a;
}


public int d() {
return this.c;
}


public moom.ze a(int p0) {
this.a = ((int)(p0));
    return this;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.ze)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public moom.ze a(net.minecraft.network.play.client.C0BPacketEntityAction$Action p0) {
this.b = ((net.minecraft.network.play.client.C0BPacketEntityAction$Action)(p0));
    return this;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((net.minecraft.network.play.client.C0BPacketEntityAction$Action)(((net.minecraft.network.play.client.C0BPacketEntityAction$Action)(((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Class)(net.minecraft.network.play.client.C0BPacketEntityAction$Action.class)))))));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.ze)(this)));
    return;
}


public net.minecraft.network.play.client.C0BPacketEntityAction$Action a__be() {
return this.b;
}


public int a() {
return this.c;
}



}
