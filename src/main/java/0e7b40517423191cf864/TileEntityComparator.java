package net.minecraft.tileentity;


public class TileEntityComparator extends net.minecraft.tileentity.TileEntity {

private int l;

public TileEntityComparator() {
super();
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("OutputSignal")), ((int)(this.l)));
    return;
}


public int a__sourceReturn_8abf5c6871() {
return this.l;
}


public void a(int p0) {
this.l = ((int)(p0));
    return;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.l = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("OutputSignal")))));
    return;
}

}
