package moom;


class fC extends moom.fB {

private final net.minecraft.block.Block g;

private final com.google.common.collect.ImmutableMap<net.minecraft.block.properties.IProperty, java.lang.Comparable> h;

private com.google.common.collect.ImmutableTable<net.minecraft.block.properties.IProperty, java.lang.Comparable, net.minecraft.block.state.IBlockState> i;

private static final long j;

private fC(net.minecraft.block.Block p0, com.google.common.collect.ImmutableMap<net.minecraft.block.properties.IProperty, java.lang.Comparable> p1) {
super();
    this.g = p0;
    this.h = p1;
}


static {
j = (moom._c.a(8850342355694044692L, -6269460134574125527L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(236117535868875L);
}


public boolean equals(java.lang.Object p0) {
long local2 = (moom.fC.j ^ 21237997104962L);
    return ((((this == p0) ? 1 : 0)) != 0);
}


public int hashCode() {
return ((com.google.common.collect.ImmutableMap)(this.h)).hashCode();
}


public void a(java.util.Map<java.util.Map<net.minecraft.block.properties.IProperty, java.lang.Comparable>, moom.fC> p0) {
java.lang.Object forestValue429_25_0;
    java.lang.Object forestValue429_61_0;
    java.lang.Comparable spill429_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.google.common.collect.HashBasedTable life5_14;
    com.google.common.collect.UnmodifiableIterator life6_19;
    net.minecraft.block.properties.IProperty life7_26;
    java.util.Iterator life8_32;
    java.lang.Comparable life9_39;
    forest_join_70: {
    forest_join_66: {
    forest_join_13: {
    life2_3 = (moom.fC.j ^ 41608236872215L);
    life4_5 = moom.fA.b();
    if (!((this.i != null))) {
        break forest_join_13;
    }
    throw new java.lang.IllegalStateException();
    }
    life5_14 = com.google.common.collect.HashBasedTable.create();
    life6_19 = ((com.google.common.collect.ImmutableSet)(((com.google.common.collect.ImmutableMap)(this.h)).keySet())).iterator();
    forest_cycle_20: while (true) {
    forest_join_64: {
    if (!(((java.util.Iterator)(life6_19)).hasNext())) {
        break forest_join_66;
    }
    forestValue429_25_0 = ((java.util.Iterator)(life6_19)).next();
    forest_cycle_25: while (true) {
    life7_26 = ((net.minecraft.block.properties.IProperty)(forestValue429_25_0));
    if (!((life4_5 == null))) {
        break forest_join_70;
    }
    life8_32 = ((java.util.Collection)(((net.minecraft.block.properties.IProperty)(life7_26)).a__Collection())).iterator();
    forest_cycle_33: while (true) {
    forest_join_62: {
    forest_join_61: {
    if (!(((java.util.Iterator)(life8_32)).hasNext())) {
        break forest_join_64;
    }
    life9_39 = ((java.lang.Comparable)(((java.util.Iterator)(life8_32)).next()));
    spill429_0 = life9_39;
    if (!((life4_5 == null))) {
        forestValue429_25_0 = spill429_0;
        continue forest_cycle_25;
    }
    if (!((life4_5 == null))) {
        forestValue429_61_0 = spill429_0;
        break forest_join_61;
    }
    if (!((spill429_0 != ((com.google.common.collect.ImmutableMap)(this.h)).get(((java.lang.Object)(life7_26)))))) {
        break forest_join_62;
    }
    forestValue429_61_0 = ((com.google.common.collect.Table)(life5_14)).put(((java.lang.Object)(life7_26)), ((java.lang.Object)(life9_39)), ((java.lang.Object)(((net.minecraft.block.state.IBlockState)(((java.util.Map)(p0)).get(((java.lang.Object)(((moom.fC)(this)).a(((net.minecraft.block.properties.IProperty)(life7_26)), ((java.lang.Comparable)(life9_39)))))))))));
    }
    recovery.source.CarrierOps.discard(forestValue429_61_0);
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    break forest_cycle_25;
    }
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    }
    this.i = ((com.google.common.collect.ImmutableTable)(com.google.common.collect.ImmutableTable.copyOf(((com.google.common.collect.Table)(life5_14)))));
    }
    return;
}


private java.util.Map<net.minecraft.block.properties.IProperty, java.lang.Comparable> a(net.minecraft.block.properties.IProperty p0, java.lang.Comparable p1) {
java.lang.Object local3 = com.google.common.collect.Maps.newHashMap(((java.util.Map)(this.h)));
    ((java.util.Map)(local3)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return ((java.util.Map<net.minecraft.block.properties.IProperty,java.lang.Comparable>)(local3));
}


public java.util.Collection<net.minecraft.block.properties.IProperty> a__Collection() {
return java.util.Collections.unmodifiableCollection(((java.util.Collection)(((com.google.common.collect.ImmutableMap)(this.h)).keySet())));
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public com.google.common.collect.ImmutableMap<net.minecraft.block.properties.IProperty, java.lang.Comparable> a__sourceReturn_400899bdd3() {
return this.h;
}


public net.minecraft.block.Block a__ch() {
return this.g;
}


public <T extends java.lang.Comparable<T>> T a(net.minecraft.block.properties.IProperty<T> p0) {
java.lang.Object forwardValue3525_29_0;
    com.google.common.collect.ImmutableMap spill3525_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_22: {
    life2_3 = (moom.fC.j ^ 62255290402347L);
    life4_5 = moom.fA.b();
    spill3525_0 = this.h;
    if (!((life4_5 == null))) {
        forwardValue3525_29_0 = spill3525_0;
        break forward_join_29;
    }
    if (!((!((com.google.common.collect.ImmutableMap)(spill3525_0)).containsKey(((java.lang.Object)(p0)))))) {
        break forward_join_22;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_c44df851af2e_invokedynamic3525_6(p0, ((net.minecraft.block.Block)(this.g)).b__fA()));
    }
    forwardValue3525_29_0 = ((java.lang.Class)(((net.minecraft.block.properties.IProperty)(p0)).a())).cast(((java.lang.Object)(((com.google.common.collect.ImmutableMap)(this.h)).get(((java.lang.Object)(p0))))));
    }
    return (((T)((java.lang.Comparable)(forwardValue3525_29_0))));
}


public <T extends java.lang.Comparable<T>, V extends T> net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.properties.IProperty<T> p0, V p1) {
int forwardValue3526_28_0;
    java.lang.Object forwardValue3526_47_0;
    java.lang.Comparable forwardValue3526_47_1;
    java.lang.Object forwardValue3526_55_0;
    net.minecraft.block.state.IBlockState forwardValue3526_56_0;
    boolean spill3526_0;
    java.util.Collection spill3526_1;
    java.lang.Comparable spill3526_2;
    java.lang.Object spill3526_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_56: {
    forward_join_55: {
    forward_join_50: {
    forward_join_47: {
    forward_join_40: {
    forward_join_28: {
    forward_join_22: {
    life3_3 = (moom.fC.j ^ 39213419629697L);
    life5_5 = moom.fA.b();
    spill3526_0 = ((com.google.common.collect.ImmutableMap)(this.h)).containsKey(((java.lang.Object)(p0)));
    if (!((life5_5 == null))) {
        forwardValue3526_28_0 = ((spill3526_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3526_0))) {
        break forward_join_22;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_1040e3ae1847_invokedynamic3526_7(p0, ((net.minecraft.block.Block)(this.g)).b__fA()));
    }
    spill3526_1 = ((net.minecraft.block.properties.IProperty)(p0)).a__Collection();
    spill3526_2 = p1;
    if (!((life5_5 == null))) {
        forwardValue3526_47_0 = spill3526_1;
        forwardValue3526_47_1 = spill3526_2;
        break forward_join_47;
    }
    forwardValue3526_28_0 = ((((java.util.Collection)(spill3526_1)).contains(((java.lang.Object)(spill3526_2)))) ? 1 : 0);
    }
    if (!((forwardValue3526_28_0 == 0))) {
        break forward_join_40;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_1040e3ae1847_invokedynamic3526_14(p0, p1, ((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(this.g)))));
    }
    spill3526_3 = ((com.google.common.collect.ImmutableMap)(this.h)).get(((java.lang.Object)(p0)));
    if (!((life5_5 == null))) {
        forwardValue3526_55_0 = spill3526_3;
        break forward_join_55;
    }
    forwardValue3526_47_0 = spill3526_3;
    forwardValue3526_47_1 = p1;
    }
    if (!((forwardValue3526_47_0 == forwardValue3526_47_1))) {
        break forward_join_50;
    }
    forwardValue3526_56_0 = this;
    break forward_join_56;
    }
    forwardValue3526_55_0 = ((com.google.common.collect.ImmutableTable)(this.i)).get(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    }
    forwardValue3526_56_0 = ((net.minecraft.block.state.IBlockState)(forwardValue3526_55_0));
    }
    return forwardValue3526_56_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c44df851af2e_invokedynamic3525_6(net.minecraft.block.properties.IProperty a0, moom.fA a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1040e3ae1847_invokedynamic3526_7(net.minecraft.block.properties.IProperty a0, moom.fA a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1040e3ae1847_invokedynamic3526_14(net.minecraft.block.properties.IProperty a0, java.lang.Comparable a1, java.lang.Object a2) throws E;
}
