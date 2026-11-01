package moom;


public class mg extends moom.l8 {

private final net.minecraft.block.properties.IProperty<?> c;

private final java.lang.String d;

private final java.util.List<net.minecraft.block.properties.IProperty<?>> e;

private mg(net.minecraft.block.properties.IProperty<?> p0, java.lang.String p1, java.util.List<net.minecraft.block.properties.IProperty<?>> p2) {
super();
    this.c = p0;
    this.d = p1;
    this.e = p2;
}


protected moom.DE a(net.minecraft.block.state.IBlockState p0) {
java.util.LinkedHashMap life2_3;
    java.lang.String life3_13;
    java.util.Iterator life4_35;
    net.minecraft.block.properties.IProperty life5_42;
    life2_3 = com.google.common.collect.Maps.newLinkedHashMap(((java.util.Map)(__sourceExactCall_4da07a95bf9046(((net.minecraft.block.state.IBlockState)(p0))))));
    if ((this.c == null)) {
        life3_13 = ((moom.DD)(((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(p0)).a__ch()))))))).toString();
    } else {
        life3_13 = __sourceExactCall_aac5e9decccf8f(((net.minecraft.block.properties.IProperty)(this.c)), ((java.lang.Comparable)(((java.lang.Comparable)(((java.util.Map)(life2_3)).remove(((java.lang.Object)(this.c))))))));
    }
    if ((this.d != null)) {
        life3_13 = __sourceIntrinsic_ebcd5f62e0f4_invokedynamic6869_15(life3_13, this.d);
    }
    life4_35 = ((java.util.List)(this.e)).iterator();
    while (((java.util.Iterator)(life4_35)).hasNext()) {
        life5_42 = ((net.minecraft.block.properties.IProperty)(((java.util.Iterator)(life4_35)).next()));
        ((java.util.Map)(life2_3)).remove(((java.lang.Object)(life5_42)));
    }
    return new moom.DE(life3_13, __sourceExactCall_6aa67820813a0e(((moom.mg)(this)), ((java.util.Map)(life2_3))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ebcd5f62e0f4_invokedynamic6869_15(java.lang.String a0, java.lang.String a1) throws E;

private static native com.google.common.collect.ImmutableMap __sourceExactCall_4da07a95bf9046(net.minecraft.block.state.IBlockState p0);
private static native java.lang.String __sourceExactCall_aac5e9decccf8f(net.minecraft.block.properties.IProperty p0, java.lang.Comparable p1);
private static native java.lang.String __sourceExactCall_6aa67820813a0e(moom.mg p0, java.util.Map p1);
}
