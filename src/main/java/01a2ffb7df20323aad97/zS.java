package moom;


public class zS implements moom.yK<moom.y2> {

private int a;

private byte b;

public zS() {
super();
}


public zS(net.minecraft.entity.Entity p0, byte p1) {
super();
    this.a = (p0).e__Int();
    this.b = p1;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    return;
}


public byte b() {
return this.b;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zS)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public int a__Int() {
return this.a;
}


public byte a() {
return this.b;
}


public net.minecraft.entity.Entity a(net.minecraft.world.World p0) {
return ((net.minecraft.world.World)(p0)).a(((int)(this.a)));
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zS)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    return;
}



}
