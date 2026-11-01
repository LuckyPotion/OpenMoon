package net.minecraft.tileentity;


public class TileEntityCommandBlock extends net.minecraft.tileentity.TileEntity {

private final moom.qV l;

public TileEntityCommandBlock() {
super();
    this.l = new moom.qX(this);
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((moom.qV)(this.l)).a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


public moom.qV a__qV() {
return this.l;
}


public moom.qN a__sourceReturn_37f0d120e7() {
return ((moom.qV)(this.l)).a__qN();
}


public moom.yK a__yK() {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.tileentity.TileEntityCommandBlock)(this)).b(((net.minecraft.nbt.NBTTagCompound)(local1)));
    return new moom.Am(((net.minecraft.tileentity.TileEntityCommandBlock)(this)).e, 2, local1);
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((moom.qV)(this.l)).b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    return;
}


public boolean g__Boolean() {
return ((1) != 0);
}

}
