package moom;


public class zY implements moom.yK<moom.y2> {

private float a;

private int b;

private int c;

public zY() {
super();
}


public zY(float p0, int p1, int p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.b)));
    return;
}


public int b() {
return this.c;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zY)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public int a__Int() {
return this.b;
}


public float a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zY)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((float)(((net.minecraft.network.PacketBuffer)(p0)).readFloat()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}



}
