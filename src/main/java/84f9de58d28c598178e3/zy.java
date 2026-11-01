package moom;


public class zy implements moom.yK<moom.y2> {

private moom.DT a;

public zy() {
super();
}


public zy(moom.DT p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zy)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public moom.DT a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zy)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    return;
}



}
