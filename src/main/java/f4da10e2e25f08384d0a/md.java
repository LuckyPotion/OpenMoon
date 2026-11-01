package moom;


class md extends moom.l8 {

net.minecraft.client.renderer.BlockModelShapes c;

md(net.minecraft.client.renderer.BlockModelShapes p0) { super(); }


private static void __sourceConstructorBody_648ff768c1a379b3(moom.md receiver, net.minecraft.client.renderer.BlockModelShapes p0) throws Throwable {

((moom.md)(receiver)).c = ((net.minecraft.client.renderer.BlockModelShapes)(p0));

    moom.md.__sourceConstructorInit_648ff768c1a379b3_0(((moom.md)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_648ff768c1a379b3_0(moom.md a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected moom.DE a(net.minecraft.block.state.IBlockState p0) {
java.util.LinkedHashMap local2 = com.google.common.collect.Maps.newLinkedHashMap(((java.util.Map)(__sourceExactCall_4da07a95bf9046(((net.minecraft.block.state.IBlockState)(p0))))));
    java.lang.String local3 = ((moom.fw)(moom.ej.S)).a(((java.lang.Enum)(((net.minecraft.block.BlockStoneSlab$EnumType)(((java.util.Map)(local2)).remove(((java.lang.Object)(moom.ej.S))))))));
    ((java.util.Map)(local2)).remove(((java.lang.Object)(moom.ej.R)));
    java.lang.String local4 = (((java.lang.Boolean)(((java.lang.Boolean)(__sourceExactCall_1e5a41a82d34bd(((net.minecraft.block.state.IBlockState)(p0)), ((net.minecraft.block.properties.IProperty)(moom.ej.R))))))).booleanValue() ? "all" : "normal");
    return new moom.DE(__sourceIntrinsic_ebcd5f62e0f4_invokedynamic6938_13(local3), local4);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ebcd5f62e0f4_invokedynamic6938_13(java.lang.String a0) throws E;

private static native com.google.common.collect.ImmutableMap __sourceExactCall_4da07a95bf9046(net.minecraft.block.state.IBlockState p0);
private static native java.lang.Comparable __sourceExactCall_1e5a41a82d34bd(net.minecraft.block.state.IBlockState p0, net.minecraft.block.properties.IProperty p1);
}
