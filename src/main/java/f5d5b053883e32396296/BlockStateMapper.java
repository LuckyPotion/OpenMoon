package net.minecraft.client.renderer.block.statemap;


public class BlockStateMapper {

private final java.util.Map<net.minecraft.block.Block, net.minecraft.client.renderer.block.statemap.IStateMapper> a;

private final java.util.Set<net.minecraft.block.Block> b;

public BlockStateMapper() {
super();
    this.a = com.google.common.collect.Maps.newIdentityHashMap();
    this.b = com.google.common.collect.Sets.newIdentityHashSet();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.Map<net.minecraft.block.state.IBlockState, moom.DE> a() {
java.util.IdentityHashMap local1 = com.google.common.collect.Maps.newIdentityHashMap();
    java.util.Iterator local2 = ((moom.DC)(net.minecraft.block.Block.b)).iterator();
    while (((java.util.Iterator)(local2)).hasNext()) {
        net.minecraft.block.Block local3 = ((net.minecraft.block.Block)(((java.util.Iterator)(local2)).next()));
        if ((!((java.util.Set)(this.b)).contains(((java.lang.Object)(local3))))) {
        ((java.util.Map)(local1)).putAll(((java.util.Map)(((net.minecraft.client.renderer.block.statemap.IStateMapper)(((net.minecraft.client.renderer.block.statemap.IStateMapper)(com.google.common.base.MoreObjects.firstNonNull(((java.lang.Object)(((net.minecraft.client.renderer.block.statemap.IStateMapper)(((java.util.Map)(this.a)).get(((java.lang.Object)(local3))))))), ((java.lang.Object)(new moom.mf()))))))).a(((net.minecraft.block.Block)(local3))))));
    }
    }
    return local1;
}


public void a(net.minecraft.block.Block[] p0) {
java.util.Collections.addAll(((java.util.Collection)(this.b)), ((java.lang.Object[])(p0)));
    return;
}


public void a(net.minecraft.block.Block p0, net.minecraft.client.renderer.block.statemap.IStateMapper p1) {
((java.util.Map)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}

}
