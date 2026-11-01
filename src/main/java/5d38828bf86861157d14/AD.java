package moom;


public class AD implements moom.yK<moom.y2> {

public int a;

public AD() {
super();
}


public AD(net.minecraft.entity.Entity p0) {
super();
    this.a = (p0).e__Int();
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.AD)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public net.minecraft.entity.Entity a(net.minecraft.world.World p0) {
return ((net.minecraft.world.World)(p0)).a(((int)(this.a)));
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AD)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    return;
}



}
