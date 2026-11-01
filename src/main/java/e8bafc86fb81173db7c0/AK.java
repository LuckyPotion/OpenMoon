package moom;


public class AK implements moom.yK<moom.y2> {

private int a;

private net.minecraft.nbt.NBTTagCompound b;

public AK() {
super();
}


public AK(int p0, net.minecraft.nbt.NBTTagCompound p1) {
super();
    this.a = p0;
    this.b = p1;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.nbt.NBTTagCompound)(this.b)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.AK)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public net.minecraft.entity.Entity a(net.minecraft.world.World p0) {
return ((net.minecraft.world.World)(p0)).a(((int)(this.a)));
}


public net.minecraft.nbt.NBTTagCompound a() {
return this.b;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.AK)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.network.PacketBuffer)(p0)).a__yw()));
    return;
}



}
