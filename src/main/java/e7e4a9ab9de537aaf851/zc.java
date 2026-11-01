package moom;


public class zc implements moom.yK<moom.y3> {

private int a;

public zc() {
super();
}


public zc(int p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.a)));
    return;
}


public int b() {
return this.a;
}


public moom.zc a(int p0) {
this.a = ((int)(p0));
    return this;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zc)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public int a() {
return this.a;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zc)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    return;
}



}
