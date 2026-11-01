package net.minecraft.client.particle;


public class EntityBlockDustFX$Factory implements net.minecraft.client.particle.IParticleFactory {

public EntityBlockDustFX$Factory() {
super();
}


public net.minecraft.client.particle.EntityFX a(int p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
net.minecraft.block.state.IBlockState local16 = net.minecraft.block.Block.a__fE(((int)((p8)[0])));
    return ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local16)).a__ch())).c__Int() == -1) ? null : ((moom.sb)(new moom.sb(p1, p2, p3, p4, p5, p6, p7, local16))).a__sa());
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
