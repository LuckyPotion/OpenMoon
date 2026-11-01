package net.minecraft.client.particle;


public class EntityBreakingFX$Factory implements net.minecraft.client.particle.IParticleFactory {

public EntityBreakingFX$Factory() {
super();
}


public net.minecraft.client.particle.EntityFX a(int p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
int local16 = (((p8).length > 1) ? (p8)[1] : 0);
    return new moom.r7(p1, p2, p3, p4, p5, p6, p7, net.minecraft.item.Item.a__wQ(((int)((p8)[0]))), local16);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
