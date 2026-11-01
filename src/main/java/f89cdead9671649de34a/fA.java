package moom;


public class fA {

private static com.google.common.base.Joiner a;

private static com.google.common.base.Function<net.minecraft.block.properties.IProperty, java.lang.String> b;

private net.minecraft.block.Block c;

private com.google.common.collect.ImmutableList<net.minecraft.block.properties.IProperty> d;

private com.google.common.collect.ImmutableList<net.minecraft.block.state.IBlockState> e;

private static net.minecraft.entity.Entity[] f;

private static long g;

public fA(net.minecraft.block.Block p0, net.minecraft.block.properties.IProperty[] p1) { super(); }


private static void __sourceConstructorBody_423aec77864dca44(moom.fA receiver, net.minecraft.block.Block p0, net.minecraft.block.properties.IProperty[] p1) throws Throwable {

long local3_life2;

    net.minecraft.entity.Entity[] local5_life10;

    java.util.LinkedHashMap local6_life14;

    java.util.ArrayList local7_life16;

    java.util.Iterator local8_life20;

    java.util.List local9_life24;

    java.util.Map local10_life27;

    moom.fC local11_life29;

    moom.fC local9_life37;

    init_join_84: {

    init_join_80: {

    init_join_66: {

    init_join_63: {

    local3_life2 = (moom.fA.g ^ 81190657247928L);

    moom.fA.__sourceConstructorInit_423aec77864dca44_0(((moom.fA)(receiver)));

    ((moom.fA)(receiver)).c = ((net.minecraft.block.Block)(p0));

    net.minecraft.entity.Entity[] __sourceSpill646_9 = moom.fA.b();

    java.util.Arrays.sort(((java.lang.Object[])(p1)), ((java.util.Comparator)(java.util.Comparator.comparing(((java.util.function.Function)(__sourceIntrinsic_423aec77864dca44_originalDynamicSite646_6()))))));

    local5_life10 = __sourceSpill646_9;

    ((moom.fA)(receiver)).d = ((com.google.common.collect.ImmutableList)(com.google.common.collect.ImmutableList.copyOf(((java.lang.Object[])(p1)))));

    local6_life14 = com.google.common.collect.Maps.newLinkedHashMap();

    local7_life16 = com.google.common.collect.Lists.newArrayList();

    local8_life20 = ((java.lang.Iterable)(moom.CE.a(((java.lang.Iterable)(((moom.fA)(receiver)).a__List()))))).iterator();

    init_cycle_28: while (true) {

    if (!(((java.util.Iterator)(local8_life20)).hasNext())) {

        break init_join_63;

    }

    local9_life24 = ((java.util.List)(((java.util.Iterator)(local8_life20)).next()));

    local10_life27 = moom.Dq.a(((java.lang.Iterable)(((moom.fA)(receiver)).d)), ((java.lang.Iterable)(local9_life24)));

    local11_life29 = new moom.fC(p0, com.google.common.collect.ImmutableMap.copyOf(((java.util.Map)(local10_life27))));

    ((java.util.Map)(local6_life14)).put(((java.lang.Object)(local10_life27)), ((java.lang.Object)(local11_life29)));

    ((java.util.List)(local7_life16)).add(((java.lang.Object)(local11_life29)));

    if (!((local5_life10 == null))) {

        break init_join_66;

    }

    if (!((local5_life10 != null))) { continue init_cycle_28; }

    break init_cycle_28;

    }

    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));

    }

    local8_life20 = ((java.util.List)(local7_life16)).iterator();

    }

    init_cycle_66: while (true) {

    if (!(((java.util.Iterator)(local8_life20)).hasNext())) {

        break init_join_80;

    }

    local9_life37 = ((moom.fC)(((java.util.Iterator)(local8_life20)).next()));

    ((moom.fC)(local9_life37)).a(((java.util.Map)(local6_life14)));

    if (!((local5_life10 == null))) {

        break init_join_84;

    }

    if (!((local5_life10 != null))) { continue init_cycle_66; }

    break init_cycle_66;

    }

    }

    ((moom.fA)(receiver)).e = ((com.google.common.collect.ImmutableList)(com.google.common.collect.ImmutableList.copyOf(((java.util.Collection)(local7_life16)))));

    }

    return;

}



static {
g = ((long)(((moom._a)(moom._c.a(((long)(-3681744618183899471L)), ((long)(-1595825355094802059L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(33890838046945L)))));
    java.lang.Object __sourceSpill2250_7 = null;
    a = ((com.google.common.base.Joiner)(com.google.common.base.Joiner.on(((java.lang.String)(", ")))));
    moom.fA.b(((net.minecraft.entity.Entity[])(__sourceSpill2250_7)));
    b = ((com.google.common.base.Function)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite2250_9()));
}

private static native <E extends Throwable> void __sourceConstructorInit_423aec77864dca44_0(moom.fA a0) throws E;

public java.lang.String toString() {
com.google.common.base.MoreObjects.ToStringHelper __sourceSpill10_8 = ((com.google.common.base.MoreObjects.ToStringHelper)(com.google.common.base.MoreObjects.toStringHelper(((java.lang.Object)(this))))).add(((java.lang.String)("block")), ((java.lang.Object)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(this.c))))));
    java.lang.String __sourceSpill10_9 = "properties";
    java.util.stream.Stream __sourceSpill10_10 = ((com.google.common.collect.ImmutableList)(this.d)).stream();
    com.google.common.base.Function __sourceEffectfulDup10_11 = moom.fA.b;
    com.google.common.base.Function __sourceSpill10_13 = __sourceEffectfulDup10_11;
    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup10_11)));
    return ((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(__sourceSpill10_8)).add(((java.lang.String)(__sourceSpill10_9)), ((java.lang.Object)(((java.util.stream.Stream)(((java.util.stream.Stream)(__sourceSpill10_10)).map(((java.util.function.Function)(__sourceIntrinsic_a86c261fcdee_originalDynamicSite10_14(__sourceSpill10_13)))))).collect(((java.util.stream.Collector)(java.util.stream.Collectors.toList())))))))).toString();
}


public static net.minecraft.entity.Entity[] b() {
return moom.fA.f;
}


public static void b(net.minecraft.entity.Entity[] p0) {
f = ((net.minecraft.entity.Entity[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.google.common.collect.ImmutableList<net.minecraft.block.state.IBlockState> a() {
return this.e;
}


public net.minecraft.block.state.IBlockState a__fE() {
return ((net.minecraft.block.state.IBlockState)(((com.google.common.collect.ImmutableList)(this.e)).get(((int)(0)))));
}


public net.minecraft.block.Block a__ch() {
return this.c;
}


public java.util.Collection<net.minecraft.block.properties.IProperty> a__Collection() {
return this.d;
}


private java.util.List<java.lang.Iterable<java.lang.Comparable>> a__List() {
java.util.ArrayList lexicalValue1161_30_0;
    net.minecraft.entity.Entity[] spill1161_0;
    java.util.ArrayList spill1161_1;
    long life1_3;
    java.util.ArrayList life4_5;
    int life5_8;
    net.minecraft.entity.Entity[] life3_9;
    lexical_join_30: {
    lexical_join_29: {
    life1_3 = (moom.fA.g ^ 83990058995449L);
    life4_5 = com.google.common.collect.Lists.newArrayList();
    spill1161_0 = moom.fA.b();
    life5_8 = 0;
    life3_9 = spill1161_0;
    lexical_cycle_10: while (true) {
    if (!((life5_8 < ((com.google.common.collect.ImmutableList)(this.d)).size()))) {
        break lexical_join_29;
    }
    spill1161_1 = life4_5;
    if (!((life3_9 == null))) {
        lexicalValue1161_30_0 = spill1161_1;
        break lexical_join_30;
    }
    ((java.util.List)(spill1161_1)).add(((java.lang.Object)(((net.minecraft.block.properties.IProperty)(((net.minecraft.block.properties.IProperty)(((com.google.common.collect.ImmutableList)(this.d)).get(((int)(life5_8))))))).a__Collection())));
    life5_8 += 1;
    if (!((life3_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1161_30_0 = life4_5;
    }
    return lexicalValue1161_30_0;
}


private static java.lang.String lambda$static$0(net.minecraft.block.properties.IProperty p0) {
net.minecraft.block.properties.IProperty forwardValue3516_13_0;
    java.lang.String forwardValue3516_14_0;
    net.minecraft.block.properties.IProperty spill3516_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.fA.g ^ 101424345752430L);
    life3_5 = moom.fA.b();
    spill3516_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue3516_13_0 = spill3516_0;
        break forward_join_13;
    }
    if (!((spill3516_0 == null))) {
        break forward_join_12;
    }
    forwardValue3516_14_0 = "<NULL>";
    break forward_join_14;
    }
    forwardValue3516_13_0 = p0;
    }
    forwardValue3516_14_0 = ((net.minecraft.block.properties.IProperty)(forwardValue3516_13_0)).a__String();
    }
    return forwardValue3516_14_0;
}


private static native <E extends Throwable> com.google.common.base.Function __sourceIntrinsic_eb8803ad1f63_originalDynamicSite2250_9() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_423aec77864dca44_originalDynamicSite646_6() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_a86c261fcdee_originalDynamicSite10_14(com.google.common.base.Function a0) throws E;
}
