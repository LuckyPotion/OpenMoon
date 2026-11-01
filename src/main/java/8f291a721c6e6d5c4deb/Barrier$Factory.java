package net.minecraft.client.particle;


public class Barrier$Factory implements net.minecraft.client.particle.IParticleFactory {

public Barrier$Factory() {
super();
}


public net.minecraft.client.particle.EntityFX a(int p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
return new moom.r5(p1, p2, p3, p4, net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b_))));
}

}
