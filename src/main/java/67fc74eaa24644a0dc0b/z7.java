package moom;


public class z7 implements moom.yK<moom.y2> {

private int a;

private moom.DT b;

private int c;

public z7() {
super();
}


public z7(int p0, moom.DT p1, int p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.c)));
    return;
}


public int b() {
return this.c;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.z7)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public moom.DT a__DT() {
return this.b;
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.z7)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    return;
}



}
