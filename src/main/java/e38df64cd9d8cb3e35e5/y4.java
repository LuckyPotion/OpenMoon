package moom;


public class y4 implements moom.yK<moom.y3> {

private int a;

public y4() {
super();
}


public y4(int p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.y4)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public moom.y4 a(int p0) {
this.a = ((int)(p0));
    return this;
}


public int a() {
return this.a;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.y4)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}



}
