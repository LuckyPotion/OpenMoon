package net.minecraft.world.biome;


public class BiomeGenHell extends net.minecraft.world.biome.BiomeGenBase {

public BiomeGenHell(int p0) {
super(((int)(p0)));
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenHell)(this)).av)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenHell)(this)).aw)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenHell)(this)).ax)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenHell)(this)).ay)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenHell)(this)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityGhast.class, 50, 4, 4))));
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenHell)(this)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityPigZombie.class, 100, 4, 4))));
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenHell)(this)).av)).add(((java.lang.Object)(new moom.D7(moom.th.class, 1, 4, 4))));
    return;
}


static {
((moom._a)(moom._c.a(((long)(-8347042712668706335L)), ((long)(849204214019793317L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44577901092973L)));
}

}
