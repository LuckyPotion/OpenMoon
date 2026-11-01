package moom;


public class fd implements moom.ry {

private final net.minecraft.world.World a;

private final moom.DT b;

public fd(net.minecraft.world.World p0, moom.DT p1) {
super();
    this.a = p0;
    this.b = p1;
}


public double b() {
return (((double) ((moom.DT)(this.b)).b()) + 0x1.0p-1d);
}


public double c() {
return (((double) ((moom.DT)(this.b)).c()) + 0x1.0p-1d);
}


public <T extends net.minecraft.tileentity.TileEntity> T a__B9() {
return ((T)(((net.minecraft.world.World)(this.a)).a__B9(((moom.DT)(this.b)))));
}


public int a__Int() {
java.lang.Object local1 = ((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(this.b)));
    return ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local1)).a__ch())).b(((net.minecraft.block.state.IBlockState)(local1)));
}


public moom.DT a__DT() {
return this.b;
}


public net.minecraft.world.World a__Eu() {
return this.a;
}


public double a() {
return (((double) ((moom.DT)(this.b)).a()) + 0x1.0p-1d);
}

}
