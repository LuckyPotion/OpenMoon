package net.minecraft.world.biome;


public class BiomeGenMutated extends net.minecraft.world.biome.BiomeGenBase {

protected net.minecraft.world.biome.BiomeGenBase aG;

public BiomeGenMutated(int p0, net.minecraft.world.biome.BiomeGenBase p1) {
super(p0);
    this.aG = ((net.minecraft.world.biome.BiomeGenBase)(p1));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).a(((int)(((net.minecraft.world.biome.BiomeGenBase)(p1)).ak)), ((boolean)(true)));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).aj = ((java.lang.String)(__sourceIntrinsic_9450d6f1eb13_originalDynamicSite5699_4(((net.minecraft.world.biome.BiomeGenBase)(p1)).aj)));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.biome.BiomeGenBase)(p1)).am));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.biome.BiomeGenBase)(p1)).an));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).ao = ((int)(((net.minecraft.world.biome.BiomeGenBase)(p1)).ao));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).ap = ((float)(((net.minecraft.world.biome.BiomeGenBase)(p1)).ap));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).aq = ((float)(((net.minecraft.world.biome.BiomeGenBase)(p1)).aq));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).ar = ((float)(((net.minecraft.world.biome.BiomeGenBase)(p1)).ar));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).as = ((float)(((net.minecraft.world.biome.BiomeGenBase)(p1)).as));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).at = ((int)(((net.minecraft.world.biome.BiomeGenBase)(p1)).at));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).az = ((boolean)(((net.minecraft.world.biome.BiomeGenBase)(p1)).az));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).aA = ((boolean)(((net.minecraft.world.biome.BiomeGenBase)(p1)).aA));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).aw = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.world.biome.BiomeGenBase)(p1)).aw)))));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).av = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.world.biome.BiomeGenBase)(p1)).av)))));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).ay = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.world.biome.BiomeGenBase)(p1)).ay)))));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).ax = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((net.minecraft.world.biome.BiomeGenBase)(p1)).ax)))));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).ar = ((float)(((net.minecraft.world.biome.BiomeGenBase)(p1)).ar));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).as = ((float)(((net.minecraft.world.biome.BiomeGenBase)(p1)).as));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).ap = ((float)((((net.minecraft.world.biome.BiomeGenBase)(p1)).ap + 0x1.99999ap-4f)));
    ((net.minecraft.world.biome.BiomeGenMutated)(this)).aq = ((float)((((net.minecraft.world.biome.BiomeGenBase)(p1)).aq + 0x1.99999ap-3f)));
    return;
}


public int b(moom.DT p0) {
return ((net.minecraft.world.biome.BiomeGenBase)(this.aG)).b(((moom.DT)(p0)));
}


public int a__Int(moom.DT p0) {
return ((net.minecraft.world.biome.BiomeGenBase)(this.aG)).a__Int(((moom.DT)(p0)));
}


public java.lang.Class<? extends net.minecraft.world.biome.BiomeGenBase> a__Class() {
return ((net.minecraft.world.biome.BiomeGenBase)(this.aG)).a__Class();
}


public boolean a(net.minecraft.world.biome.BiomeGenBase p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.biome.BiomeGenBase)(this.aG)).a(((net.minecraft.world.biome.BiomeGenBase)(p0))))) != 0);
}


public moom.bF a__bF() {
return ((net.minecraft.world.biome.BiomeGenBase)(this.aG)).a__bF();
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
((net.minecraft.world.biome.BiomeGenBase)(this.aG)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.Fm)(p2)), ((int)(p3)), ((int)(p4)), ((double)(p5)));
    return;
}


public float a() {
return ((net.minecraft.world.biome.BiomeGenBase)(this.aG)).a();
}


public moom.F0 a(java.util.Random p0) {
return ((net.minecraft.world.biome.BiomeGenBase)(this.aG)).a(((java.util.Random)(p0)));
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
((moom.EQ)(((net.minecraft.world.biome.BiomeGenBase)(this.aG)).au)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((net.minecraft.world.biome.BiomeGenBase)(this)), ((moom.DT)(p2)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9450d6f1eb13_originalDynamicSite5699_4(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
