package moom;


public class za implements moom.yK<moom.y3> {

private moom.DT a;

private moom.bs b;

private net.minecraft.network.play.client.C07PacketPlayerDigging$Action c;

public za() {
super();
}


public za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action p0, moom.DT p1, moom.bs p2) {
super();
    this.c = p0;
    this.a = p1;
    this.b = p2;
}


public net.minecraft.network.play.client.C07PacketPlayerDigging$Action b__bd() {
return this.c;
}


public moom.bs b__bs() {
return this.b;
}


public moom.DT b() {
return this.a;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Enum)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((moom.bs)(this.b)).a())));
    return;
}


public moom.za a(moom.bs p0) {
this.b = ((moom.bs)(p0));
    return this;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.za)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public moom.za a(net.minecraft.network.play.client.C07PacketPlayerDigging$Action p0) {
this.c = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(p0));
    return this;
}


public moom.za a(moom.DT p0) {
this.a = ((moom.DT)(p0));
    return this;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.c = ((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(((net.minecraft.network.play.client.C07PacketPlayerDigging$Action)(((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Class)(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.class)))))));
    this.a = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.b = ((moom.bs)(moom.bs.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte())))));
    return;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.za)(this)));
    return;
}


public moom.DT a() {
return this.a;
}


public moom.bs a__bs() {
return this.b;
}


public net.minecraft.network.play.client.C07PacketPlayerDigging$Action a__bd() {
return this.c;
}



}
