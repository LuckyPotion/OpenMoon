package moom;


public class zr implements moom.yK<moom.y3> {

private java.util.UUID a;

public zr() {
super();
}


public zr(java.util.UUID p0) {
super();
    this.a = p0;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zr)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public moom.zr a(java.util.UUID p0) {
this.a = ((java.util.UUID)(p0));
    return this;
}


public java.util.UUID a() {
return this.a;
}


public net.minecraft.entity.Entity a(net.minecraft.world.WorldServer p0) {
return ((net.minecraft.world.WorldServer)(p0)).a__sourceReturn_8552167bb6(((java.util.UUID)(this.a)));
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zr)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((java.util.UUID)(((net.minecraft.network.PacketBuffer)(p0)).a__UUID()));
    return;
}



}
