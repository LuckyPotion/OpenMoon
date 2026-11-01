package moom;


public class zT implements moom.yK<moom.y2> {

private int a;

private byte b;

public zT() {
super();
}


public zT(net.minecraft.entity.Entity p0, byte p1) {
super();
    this.a = (p0).e__Int();
    this.b = p1;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zT)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public byte a() {
return this.b;
}


public net.minecraft.entity.Entity a(net.minecraft.world.World p0) {
return ((net.minecraft.world.World)(p0)).a(((int)(this.a)));
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zT)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.b = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    return;
}



}
