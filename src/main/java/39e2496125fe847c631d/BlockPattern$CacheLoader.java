package net.minecraft.block.state.pattern;


class BlockPattern$CacheLoader extends com.google.common.cache.CacheLoader<moom.DT, moom.fD> {

private final net.minecraft.world.World a;

private final boolean b;

public BlockPattern$CacheLoader(net.minecraft.world.World p0, boolean p1) {
super();
    this.a = p0;
    this.b = p1;
}


public java.lang.Object load__sourceBridge_262c527aaf(java.lang.Object p0) throws java.lang.Exception {
return ((net.minecraft.block.state.pattern.BlockPattern$CacheLoader)(this)).a(((moom.DT)(((moom.DT)(p0)))));
}


public moom.fD a(moom.DT p0) throws java.lang.Exception {
return new moom.fD(this.a, p0, this.b);
}


public moom.fD load(moom.DT __bridgeParam0) { return ((moom.fD)(this.load__sourceBridge_262c527aaf(((java.lang.Object)(__bridgeParam0))))); }
}
