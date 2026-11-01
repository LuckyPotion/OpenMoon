package moom;


public class fI implements com.google.common.base.Predicate<net.minecraft.block.state.IBlockState> {

private final moom.fA a;

private final java.util.Map<net.minecraft.block.properties.IProperty, com.google.common.base.Predicate> b;

private static final long c;

private fI(moom.fA p0) {
super();
    this.b = com.google.common.collect.Maps.newHashMap();
    this.a = p0;
}


static {
moom.fI.c = (moom._c.a(6780203333879038173L, -7474430127706973716L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(58882120950007L);
}


public boolean apply__sourceBridge_9ea2dcf14c(java.lang.Object p0) {
return ((moom.fI)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p0)))));
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public <V extends java.lang.Comparable<V>> moom.fI a(net.minecraft.block.properties.IProperty<V> p0, com.google.common.base.Predicate<? extends V> p1) {
long local3 = (moom.fI.c ^ 99542503586600L);
    if ((!((java.util.Collection)(((moom.fA)(this.a)).a__Collection())).contains(((java.lang.Object)(p0))))) {
        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_feb9eb934a00_invokedynamic7627_5(this.a, p0));
    }
    ((java.util.Map)(this.b)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return this;
}


public boolean a(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.state.IBlockState lexicalValue1166_11_0;
    int lexicalValue1166_48_0;
    int lexicalValue1166_52_0;
    int lexicalValue1166_54_0;
    net.minecraft.block.state.IBlockState spill1166_0;
    boolean spill1166_1;
    boolean spill1166_2;
    long life2_3;
    int[] life4_5;
    java.util.Iterator life5_29;
    java.util.Map.Entry life6_36;
    java.lang.Comparable life7_42;
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_11: {
    life2_3 = (moom.fI.c ^ 107935921622046L);
    life4_5 = moom.fG.b__ArrayInt();
    spill1166_0 = p0;
    if (!((life4_5 == null))) {
        lexicalValue1166_11_0 = spill1166_0;
        break lexical_join_11;
    }
    if (!((spill1166_0 != null))) {
        break lexical_join_53;
    }
    lexicalValue1166_11_0 = p0;
    }
    spill1166_1 = ((java.lang.Object)(((net.minecraft.block.state.IBlockState)(lexicalValue1166_11_0)).a__ch())).equals(((java.lang.Object)(((moom.fA)(this.a)).a__ch())));
    if (!((life4_5 == null))) {
        lexicalValue1166_54_0 = ((spill1166_1) ? 1 : 0);
        break lexical_join_54;
    }
    if (!(spill1166_1)) {
        break lexical_join_53;
    }
    life5_29 = ((java.util.Set)(((java.util.Map)(this.b)).entrySet())).iterator();
    lexical_cycle_24: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    if (!(((java.util.Iterator)(life5_29)).hasNext())) {
        break lexical_join_51;
    }
    life6_36 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_29)).next()));
    life7_42 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(((net.minecraft.block.properties.IProperty)(((java.util.Map.Entry)(life6_36)).getKey())))));
    spill1166_2 = ((com.google.common.base.Predicate)(((com.google.common.base.Predicate)(((java.util.Map.Entry)(life6_36)).getValue())))).apply(((java.lang.Object)(life7_42)));
    if (!((life4_5 == null))) {
        lexicalValue1166_52_0 = ((spill1166_2) ? 1 : 0);
        break lexical_join_52;
    }
    if (!((life4_5 == null))) {
        lexicalValue1166_48_0 = ((spill1166_2) ? 1 : 0);
        break lexical_join_48;
    }
    if (!((!spill1166_2))) {
        break lexical_join_49;
    }
    lexicalValue1166_48_0 = 0;
    }
    return ((lexicalValue1166_48_0) != 0);
    }
    if (!((life4_5 != null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue1166_52_0 = 1;
    }
    return ((lexicalValue1166_52_0) != 0);
    }
    lexicalValue1166_54_0 = 0;
    }
    return ((lexicalValue1166_54_0) != 0);
}


public static moom.fI a(net.minecraft.block.Block p0) {
return new moom.fI(((net.minecraft.block.Block)(p0)).b__fA());
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_feb9eb934a00_invokedynamic7627_5(moom.fA a0, net.minecraft.block.properties.IProperty a1) throws E;

public boolean apply(net.minecraft.block.state.IBlockState __bridgeParam0) { return this.apply__sourceBridge_9ea2dcf14c(((java.lang.Object)(__bridgeParam0))); }
}
