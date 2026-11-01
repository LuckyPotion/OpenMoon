package moom;


public class zG implements moom.yK<moom.y2> {

private int a;

private int b;

public zG() {
super();
}


public zG(int p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.b)));
    return;
}


public int b() {
return this.b;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zG)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zG)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}



}
