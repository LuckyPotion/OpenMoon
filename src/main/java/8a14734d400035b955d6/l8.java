package moom;


public abstract class l8 implements net.minecraft.client.renderer.block.statemap.IStateMapper {

protected java.util.Map<net.minecraft.block.state.IBlockState, moom.DE> a;

private static java.lang.String[] b;

public l8() {
super();
    this.a = com.google.common.collect.Maps.newLinkedHashMap();
}


static {
if ((moom.l8.b() != null)) {
        moom.l8.b(((java.lang.String[])(new java.lang.String[4])));
    }
}


public static void b(java.lang.String[] p0) {
b = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return moom.l8.b;
}


public java.util.Map<net.minecraft.block.state.IBlockState, moom.DE> a(net.minecraft.block.Block p0) {
com.google.common.collect.UnmodifiableIterator life2_4;
    net.minecraft.block.state.IBlockState life3_11;
    life2_4 = ((com.google.common.collect.ImmutableList)(((moom.fA)(((net.minecraft.block.Block)(p0)).b__fA())).a())).iterator();
    while (((java.util.Iterator)(life2_4)).hasNext()) {
        life3_11 = ((net.minecraft.block.state.IBlockState)(((java.util.Iterator)(life2_4)).next()));
        ((java.util.Map)(this.a)).put(((java.lang.Object)(life3_11)), ((java.lang.Object)(((moom.l8)(this)).a(((net.minecraft.block.state.IBlockState)(life3_11))))));
    }
    return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected abstract moom.DE a(net.minecraft.block.state.IBlockState p0);

public java.lang.String a(java.util.Map<net.minecraft.block.properties.IProperty, java.lang.Comparable> p0) {
java.lang.StringBuilder local2 = new java.lang.StringBuilder();
    java.util.Iterator local3 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();
    while (((java.util.Iterator)(local3)).hasNext()) {
        java.util.Map.Entry local4 = ((java.util.Map.Entry)(((java.util.Iterator)(local3)).next()));
        if ((((java.lang.StringBuilder)(local2)).length() != 0)) {
        ((java.lang.StringBuilder)(local2)).append(((java.lang.String)(",")));
    }
        net.minecraft.block.properties.IProperty local5 = ((net.minecraft.block.properties.IProperty)(((java.util.Map.Entry)(local4)).getKey()));
        java.lang.Comparable local6 = ((java.lang.Comparable)(((java.util.Map.Entry)(local4)).getValue()));
        ((java.lang.StringBuilder)(local2)).append(((java.lang.String)(((net.minecraft.block.properties.IProperty)(local5)).a__String())));
        ((java.lang.StringBuilder)(local2)).append(((java.lang.String)("=")));
        ((java.lang.StringBuilder)(local2)).append(((java.lang.String)(((net.minecraft.block.properties.IProperty)(local5)).a(((java.lang.Comparable)(local6))))));
    }
    if ((((java.lang.StringBuilder)(local2)).length() == 0)) {
        ((java.lang.StringBuilder)(local2)).append(((java.lang.String)("normal")));
    }
    return ((java.lang.StringBuilder)(local2)).toString();
}

}
