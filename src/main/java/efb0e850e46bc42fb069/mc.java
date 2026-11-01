package moom;


class mc extends moom.l8 {

net.minecraft.client.renderer.BlockModelShapes c;

mc(net.minecraft.client.renderer.BlockModelShapes p0) { super(); }


private static void __sourceConstructorBody_a01ac40414aaaf6e(moom.mc receiver, net.minecraft.client.renderer.BlockModelShapes p0) throws Throwable {

((moom.mc)(receiver)).c = ((net.minecraft.client.renderer.BlockModelShapes)(p0));

    moom.mc.__sourceConstructorInit_a01ac40414aaaf6e_0(((moom.mc)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a01ac40414aaaf6e_0(moom.mc a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected moom.DE a(net.minecraft.block.state.IBlockState p0) {
java.util.LinkedHashMap local2 = com.google.common.collect.Maps.newLinkedHashMap(((java.util.Map)(__sourceExactCall_4da07a95bf9046(((net.minecraft.block.state.IBlockState)(p0))))));
    java.lang.String local3 = ((moom.fw)(moom.dq.Q)).a(((java.lang.Enum)(((net.minecraft.block.BlockDirt$DirtType)(((java.util.Map)(local2)).remove(((java.lang.Object)(moom.dq.Q))))))));
    if ((net.minecraft.block.BlockDirt$DirtType.PODZOL != __sourceExactCall_1e5a41a82d34bd(((net.minecraft.block.state.IBlockState)(p0)), ((net.minecraft.block.properties.IProperty)(moom.dq.Q))))) {
        ((java.util.Map)(local2)).remove(((java.lang.Object)(moom.dq.R)));
    }
    return new moom.DE(local3, __sourceExactCall_f53b9b678b73e3(((moom.mc)(this)), ((java.util.Map)(local2))));
}


private static native com.google.common.collect.ImmutableMap __sourceExactCall_4da07a95bf9046(net.minecraft.block.state.IBlockState p0);
private static native java.lang.Comparable __sourceExactCall_1e5a41a82d34bd(net.minecraft.block.state.IBlockState p0, net.minecraft.block.properties.IProperty p1);
private static native java.lang.String __sourceExactCall_f53b9b678b73e3(moom.mc p0, java.util.Map p1);
}
