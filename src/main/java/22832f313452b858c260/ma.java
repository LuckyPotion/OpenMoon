package moom;


class ma extends moom.l8 {

net.minecraft.client.renderer.BlockModelShapes c;

ma(net.minecraft.client.renderer.BlockModelShapes p0) { super(); }


private static void __sourceConstructorBody_38027a821d132a04(moom.ma receiver, net.minecraft.client.renderer.BlockModelShapes p0) throws Throwable {

((moom.ma)(receiver)).c = ((net.minecraft.client.renderer.BlockModelShapes)(p0));

    moom.ma.__sourceConstructorInit_38027a821d132a04_0(((moom.ma)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_38027a821d132a04_0(moom.ma a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected moom.DE a(net.minecraft.block.state.IBlockState p0) {
java.util.LinkedHashMap local2 = com.google.common.collect.Maps.newLinkedHashMap(((java.util.Map)(__sourceExactCall_4da07a95bf9046(((net.minecraft.block.state.IBlockState)(p0))))));
    if ((__sourceExactCall_1e5a41a82d34bd(((net.minecraft.block.state.IBlockState)(p0)), ((net.minecraft.block.properties.IProperty)(moom.cH.S))) != moom.bs.UP)) {
        ((java.util.Map)(local2)).remove(((java.lang.Object)(moom.cH.R)));
    }
    return new moom.DE(((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(p0)).a__ch()))))), __sourceExactCall_bbff54a1b3ba16(((moom.ma)(this)), ((java.util.Map)(local2))));
}


private static native com.google.common.collect.ImmutableMap __sourceExactCall_4da07a95bf9046(net.minecraft.block.state.IBlockState p0);
private static native java.lang.Comparable __sourceExactCall_1e5a41a82d34bd(net.minecraft.block.state.IBlockState p0, net.minecraft.block.properties.IProperty p1);
private static native java.lang.String __sourceExactCall_bbff54a1b3ba16(moom.ma p0, java.util.Map p1);
}
