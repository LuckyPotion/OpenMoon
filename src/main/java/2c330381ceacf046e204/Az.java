package moom;


public class Az implements moom.yK<moom.y2> {

private net.minecraft.util.IChatComponent a;

public Az() {
super();
}


public Az(net.minecraft.util.IChatComponent p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.util.IChatComponent)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Az)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public net.minecraft.util.IChatComponent a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Az)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((net.minecraft.util.IChatComponent)(((net.minecraft.network.PacketBuffer)(p0)).a__C5()));
    return;
}



}
