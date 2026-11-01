package moom;


public class AH implements moom.yK<moom.y2> {

private int a;

public AH() {
super();
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.AH)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AH)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}



}
