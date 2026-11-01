package moom;


public class y1 implements moom.yK<moom.yU> {

private int a;

public y1() {
super();
}


public y1(int p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.y1)(this)).a(((moom.yU)(((moom.yU)(p0)))));
}


public int a() {
return this.a;
}


public void a(moom.yU p0) {
((moom.yU)(p0)).a(((moom.y1)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}



}
