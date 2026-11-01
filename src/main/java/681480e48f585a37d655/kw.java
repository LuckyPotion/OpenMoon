package moom;


public class kw implements net.minecraft.client.particle.IParticleFactory {

public kw() {
super();
}


public net.minecraft.client.particle.EntityFX a(int p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
return new moom.sw(p1, p2, p3, p4, p5, p6, p7);
}

}
