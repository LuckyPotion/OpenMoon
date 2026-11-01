package net.minecraft.world.biome;


public class BiomeGenEnd extends net.minecraft.world.biome.BiomeGenBase {

public BiomeGenEnd(int p0) {
super(((int)(p0)));
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenEnd)(this)).av)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenEnd)(this)).aw)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenEnd)(this)).ax)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenEnd)(this)).ay)).clear();
    ((java.util.List)(((net.minecraft.world.biome.BiomeGenEnd)(this)).av)).add(((java.lang.Object)(new moom.D7(net.minecraft.entity.monster.EntityEnderman.class, 10, 4, 4))));
    ((net.minecraft.world.biome.BiomeGenEnd)(this)).am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE()));
    ((net.minecraft.world.biome.BiomeGenEnd)(this)).an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE()));
    ((net.minecraft.world.biome.BiomeGenEnd)(this)).au = ((moom.EQ)(new moom.ER()));
    return;
}


static {
((moom._a)(moom._c.a(((long)(5966227485362804233L)), ((long)(-7464779488483702680L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(165602497769742L)));
}


public int a(float p0) {
return 0;
}

}
