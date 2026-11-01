package moom;


public class zD implements moom.yK<moom.y2> {

private int a;

private moom.DT b;

public zD() {
super();
}


public zD(net.minecraft.entity.player.EntityPlayer p0, moom.DT p1) {
super();
    this.a = (p0).e__Int();
    this.b = p1;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.b)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zD)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public moom.DT a() {
return this.b;
}


public net.minecraft.entity.player.EntityPlayer a(net.minecraft.world.World p0) {
return ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.world.World)(p0)).a(((int)(this.a)))));
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zD)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    return;
}



}
