package moom;


public class Ai implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

public Ai() {
super();
}


public Ai(int p0, int p1, int p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.c)));
    return;
}


public int b() {
return this.b;
}


public int c() {
return this.c;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Ai)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ai)(this)));
    return;
}


public int a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    return;
}



}
