package moom;


class me extends moom.l8 {

net.minecraft.client.renderer.BlockModelShapes c;

me(net.minecraft.client.renderer.BlockModelShapes p0) { super(); }


private static void __sourceConstructorBody_3b837785e82f71b6(moom.me receiver, net.minecraft.client.renderer.BlockModelShapes p0) throws Throwable {

((moom.me)(receiver)).c = ((net.minecraft.client.renderer.BlockModelShapes)(p0));

    moom.me.__sourceConstructorInit_3b837785e82f71b6_0(((moom.me)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3b837785e82f71b6_0(moom.me a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected moom.DE a(net.minecraft.block.state.IBlockState p0) {
java.util.LinkedHashMap local2 = com.google.common.collect.Maps.newLinkedHashMap(((java.util.Map)(__sourceExactCall_4da07a95bf9046(((net.minecraft.block.state.IBlockState)(p0))))));
    java.lang.String local3 = __sourceExactCall_f3affb5d11e99c(((moom.fw)(moom.em.S)), ((java.lang.Enum)(((moom.aq)(((java.util.Map)(local2)).remove(((java.lang.Object)(moom.em.S))))))));
    ((java.util.Map)(local2)).remove(((java.lang.Object)(moom.ej.R)));
    java.lang.String local4 = (((java.lang.Boolean)(((java.lang.Boolean)(__sourceExactCall_1e5a41a82d34bd(((net.minecraft.block.state.IBlockState)(p0)), ((net.minecraft.block.properties.IProperty)(moom.em.R))))))).booleanValue() ? "all" : "normal");
    return new moom.DE(__sourceIntrinsic_ebcd5f62e0f4_invokedynamic6939_13(local3), local4);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ebcd5f62e0f4_invokedynamic6939_13(java.lang.String a0) throws E;

private static native com.google.common.collect.ImmutableMap __sourceExactCall_4da07a95bf9046(net.minecraft.block.state.IBlockState p0);
private static native java.lang.String __sourceExactCall_f3affb5d11e99c(moom.fw p0, java.lang.Enum p1);
private static native java.lang.Comparable __sourceExactCall_1e5a41a82d34bd(net.minecraft.block.state.IBlockState p0, net.minecraft.block.properties.IProperty p1);
}
