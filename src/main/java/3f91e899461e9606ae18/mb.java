package moom;


class mb extends moom.l8 {

net.minecraft.client.renderer.BlockModelShapes c;

mb(net.minecraft.client.renderer.BlockModelShapes p0) { super(); }


private static void __sourceConstructorBody_c6d5a286433632b4(moom.mb receiver, net.minecraft.client.renderer.BlockModelShapes p0) throws Throwable {

((moom.mb)(receiver)).c = ((net.minecraft.client.renderer.BlockModelShapes)(p0));

    moom.mb.__sourceConstructorInit_c6d5a286433632b4_0(((moom.mb)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c6d5a286433632b4_0(moom.mb a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected moom.DE a(net.minecraft.block.state.IBlockState p0) {
java.util.LinkedHashMap local2 = com.google.common.collect.Maps.newLinkedHashMap(((java.util.Map)(__sourceExactCall_4da07a95bf9046(((net.minecraft.block.state.IBlockState)(p0))))));
    if ((__sourceExactCall_1e5a41a82d34bd(((net.minecraft.block.state.IBlockState)(p0)), ((net.minecraft.block.properties.IProperty)(moom.cH.S))) != moom.bs.UP)) {
        ((java.util.Map)(local2)).remove(((java.lang.Object)(moom.cH.R)));
    }
    return new moom.DE(((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(p0)).a__ch()))))), __sourceExactCall_b454d1b8eaec7d(((moom.mb)(this)), ((java.util.Map)(local2))));
}


private static native com.google.common.collect.ImmutableMap __sourceExactCall_4da07a95bf9046(net.minecraft.block.state.IBlockState p0);
private static native java.lang.Comparable __sourceExactCall_1e5a41a82d34bd(net.minecraft.block.state.IBlockState p0, net.minecraft.block.properties.IProperty p1);
private static native java.lang.String __sourceExactCall_b454d1b8eaec7d(moom.mb p0, java.util.Map p1);
}
