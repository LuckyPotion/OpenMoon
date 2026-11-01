package moom;


public class zg implements moom.yK<moom.y3> {

private int a;

public zg() {
super();
}


public zg(int p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zg)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public moom.zg a(int p0) {
this.a = ((int)(p0));
    return this;
}


public int a() {
return this.a;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zg)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    return;
}



}
