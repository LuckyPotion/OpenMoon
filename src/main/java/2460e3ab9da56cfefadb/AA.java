package moom;


public class AA implements moom.yK<moom.y2> {

private net.minecraft.world.EnumDifficulty a;

private boolean b;

public AA() {
super();
}


public AA(net.minecraft.world.EnumDifficulty p0, boolean p1) {
super();
    this.a = p0;
    this.b = p1;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((net.minecraft.world.EnumDifficulty)(this.a)).a())));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.AA)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public net.minecraft.world.EnumDifficulty a() {
return this.a;
}


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AA)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((net.minecraft.world.EnumDifficulty)(net.minecraft.world.EnumDifficulty.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte())))));
    return;
}



}
