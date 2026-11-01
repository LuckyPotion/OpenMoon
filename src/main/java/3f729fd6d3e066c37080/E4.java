package moom;


class E4 extends net.minecraft.world.biome.BiomeGenMutated {

moom.EW aH;

private static long cb;

E4(moom.EW p0, int p1, net.minecraft.world.biome.BiomeGenBase p2) { super(0, (net.minecraft.world.biome.BiomeGenBase)null); }


private static void __sourceConstructorBody_0ca882b5ca767eab(moom.E4 receiver, moom.EW p0, int p1, net.minecraft.world.biome.BiomeGenBase p2) throws Throwable {

((moom.E4)(receiver)).aH = ((moom.EW)(p0));

    moom.E4.__sourceConstructorInit_0ca882b5ca767eab_0(((moom.E4)(receiver)), ((int)(p1)), ((net.minecraft.world.biome.BiomeGenBase)(p2)));

    return;

}



static {
moom.E4.cb = (moom._c.a(3896088719849245838L, 3444989209325753056L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(80435460669619L);
}

private static native <E extends Throwable> void __sourceConstructorInit_0ca882b5ca767eab_0(moom.E4 a0, int a1, net.minecraft.world.biome.BiomeGenBase a2) throws E;

public moom.F0 a(java.util.Random p0) {
long local2 = (moom.E4.cb ^ 118683740281819L);
    return ((__sourceIntrinsic_booleanComparison(((java.util.Random)(p0)).nextBoolean()) != 0) ? moom.EW.aH : moom.EW.aI);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
