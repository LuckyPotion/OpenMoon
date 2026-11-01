package moom;


public class zk implements moom.yK<moom.y3> {

private int a;

private int b;

public zk() {
super();
}


public zk(int p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


public int b() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    return;
}


public moom.zk b(int p0) {
this.b = ((int)(p0));
    return this;
}


public int c() {
return this.a;
}


public int d() {
return this.b;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zk)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zk)(this)));
    return;
}


public moom.zk a(int p0) {
this.a = ((int)(p0));
    return this;
}


public int a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    return;
}



}
