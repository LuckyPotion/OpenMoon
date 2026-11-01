package moom;


public class zt implements moom.yK<moom.y2> {

private int a;

public zt() {
super();
}


public zt(int p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    return;
}


public int b() {
return this.a;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zt)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public moom.zt a(int p0) {
this.a = ((int)(p0));
    return this;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zt)(this)));
    return;
}


public int a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}



}
