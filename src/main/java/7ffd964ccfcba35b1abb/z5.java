package moom;


public class z5 implements moom.yK<moom.y2> {

private moom.DT a;

private net.minecraft.block.state.IBlockState b;

public z5() {
super();
}


public z5(net.minecraft.world.World p0, moom.DT p1) {
super();
    this.a = p1;
    this.b = (p0).a__fE(p1);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((moom.Dx)(net.minecraft.block.Block.c)).a(((java.lang.Object)(this.b))))));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.z5)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public moom.DT a() {
return this.a;
}


public net.minecraft.block.state.IBlockState a__fE() {
return this.b;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.z5)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.b = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.Dx)(net.minecraft.block.Block.c)).a(((int)(((net.minecraft.network.PacketBuffer)(p0)).a())))))));
    return;
}



}
