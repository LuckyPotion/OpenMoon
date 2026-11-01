package moom;


public class JX implements moom.JJ {

private net.minecraft.tileentity.TileEntity a;

public JX() {
super();
}


public int b() {
return -1;
}


public int c() {
return -1;
}


public void a(net.minecraft.tileentity.TileEntity p0) {
this.a = ((net.minecraft.tileentity.TileEntity)(p0));
    return;
}


public net.minecraft.tileentity.TileEntity a__B9() {
return this.a;
}


public int a() {
return moom.BU.a(((moom.DT)(((net.minecraft.tileentity.TileEntity)(this.a)).a__DT())), ((int)(((net.minecraft.tileentity.TileEntity)(this.a)).e())));
}


public moom.DT a__DT() {
return ((net.minecraft.tileentity.TileEntity)(this.a)).a__DT();
}


public java.lang.String a__String() {
return moom.Oe.a(((net.minecraft.tileentity.TileEntity)(this.a)));
}


public net.minecraft.world.biome.BiomeGenBase a__ES() {
return ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntity)(this.a)).c__sourceInterfaceWorld())).a__ES(((moom.DT)(((net.minecraft.tileentity.TileEntity)(this.a)).a__DT())));
}

}
