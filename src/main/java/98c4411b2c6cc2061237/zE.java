package moom;


public class zE implements moom.yK<moom.y2> {

private int a;

private int b;

public zE() {
super();
}


public zE(net.minecraft.entity.Entity p0, int p1) {
super();
    this.a = (p0).e__Int();
    this.b = p1;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    return;
}


public int b() {
return this.b;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zE)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zE)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    return;
}



}
