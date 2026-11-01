package moom;


public class Am implements moom.yK<moom.y2> {

private moom.DT a;

private int b;

private net.minecraft.nbt.NBTTagCompound c;

public Am() {
super();
}


public Am(moom.DT p0, int p1, net.minecraft.nbt.NBTTagCompound p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((byte) this.b))));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.nbt.NBTTagCompound)(this.c)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Am)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
return this.c;
}


public int a() {
return this.b;
}


public moom.DT a__DT() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Am)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    this.c = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.network.PacketBuffer)(p0)).a__yw()));
    return;
}



}
