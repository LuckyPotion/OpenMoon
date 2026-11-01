package net.minecraft.util;


public class ClassInheritanceMultiMap<T> extends java.util.AbstractSet<T> {

private static java.util.Set<java.lang.Class<?>> a;

private java.util.Map<java.lang.Class<?>, java.util.List<T>> b;

private java.util.Set<java.lang.Class<?>> c;

private java.lang.Class<T> d;

private java.util.List<T> e;

private static long f;

public ClassInheritanceMultiMap(java.lang.Class<T> p0) { super(); }


private static void __sourceConstructorBody_677226c5ea1127d4(net.minecraft.util.ClassInheritanceMultiMap receiver, java.lang.Class p0) throws Throwable {

init_join_47: {

    long local2_life2 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 75235885588926L);

    net.minecraft.util.ClassInheritanceMultiMap.__sourceConstructorInit_677226c5ea1127d4_0(((net.minecraft.util.ClassInheritanceMultiMap)(receiver)));

    ((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).c = ((java.util.Set)(com.google.common.collect.Sets.newIdentityHashSet()));

    ((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    boolean __sourceSpill867_12 = moom.DS.b__Boolean();

    ((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).d = ((java.lang.Class)(p0));

    boolean local4_life13 = __sourceSpill867_12;

    ((java.util.Set)(((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).c)).add(((java.lang.Object)(p0)));

    ((java.util.Map)(((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).b)).put(((java.lang.Object)(p0)), ((java.lang.Object)(((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).e)));

    java.util.Iterator local5_life21 = ((java.util.Set)(net.minecraft.util.ClassInheritanceMultiMap.a)).iterator();

    init_cycle_35: while (true) {

    if (!(((java.util.Iterator)(local5_life21)).hasNext())) {

        break init_join_47;

    }

    java.lang.Class local6_life25 = ((java.lang.Class)(((java.util.Iterator)(local5_life21)).next()));

    ((net.minecraft.util.ClassInheritanceMultiMap)(receiver)).a__Void(((java.lang.Class)(local6_life25)));

    if (!(local4_life13)) { continue init_cycle_35; }

    break init_cycle_35;

    }

    }

    return;

}



static {
net.minecraft.util.ClassInheritanceMultiMap.f = (moom._c.a(-5660940833605440344L, -4392487610023642744L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(198459515627665L);
    net.minecraft.util.ClassInheritanceMultiMap.a = com.google.common.collect.Sets.newHashSet();
}

private static native <E extends Throwable> void __sourceConstructorInit_677226c5ea1127d4_0(net.minecraft.util.ClassInheritanceMultiMap a0) throws E;

public boolean add(T p0) {
int lexicalValue1703_31_0;
    boolean spill1703_0;
    boolean spill1703_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    java.lang.Class life6_16;
    lexical_join_31: {
    lexical_join_30: {
    life2_3 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 108340649517222L);
    spill1703_0 = moom.DS.c__Boolean();
    life5_8 = ((java.util.Set)(this.c)).iterator();
    life4_9 = ((spill1703_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_30;
    }
    life6_16 = ((java.lang.Class)(((java.util.Iterator)(life5_8)).next()));
    spill1703_1 = ((java.lang.Class)(life6_16)).isAssignableFrom(((java.lang.Class)(((java.lang.Object)(p0)).getClass())));
    if (!((life4_9 != 0))) {
        lexicalValue1703_31_0 = ((spill1703_1) ? 1 : 0);
        break lexical_join_31;
    }
    if (!(spill1703_1)) {
        break lexical_join_28;
    }
    ((net.minecraft.util.ClassInheritanceMultiMap)(this)).a(((java.lang.Object)(p0)), ((java.lang.Class)(life6_16)));
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1703_31_0 = 1;
    }
    return ((lexicalValue1703_31_0) != 0);
}


public boolean remove(java.lang.Object p0) {
java.lang.Object lexicalValue1704_34_0;
    java.util.List lexicalValue1704_41_0;
    int lexicalValue1704_47_0;
    int lexicalValue1704_51_0;
    boolean spill1704_0;
    java.lang.Class spill1704_1;
    boolean spill1704_2;
    java.util.List spill1704_3;
    boolean spill1704_4;
    long life2_3;
    java.lang.Object life5_5;
    int life6_7;
    java.util.Iterator life7_12;
    int life4_13;
    java.lang.Class life8_20;
    java.util.List life9_44;
    lexical_join_51: {
    lexical_join_50: {
    life2_3 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 79454433578942L);
    life5_5 = p0;
    life6_7 = 0;
    spill1704_0 = moom.DS.c__Boolean();
    life7_12 = ((java.util.Set)(this.c)).iterator();
    life4_13 = ((spill1704_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_41: {
    lexical_join_34: {
    if (!(((java.util.Iterator)(life7_12)).hasNext())) {
        break lexical_join_50;
    }
    life8_20 = ((java.lang.Class)(((java.util.Iterator)(life7_12)).next()));
    spill1704_1 = life8_20;
    if (!((life4_13 != 0))) {
        lexicalValue1704_34_0 = spill1704_1;
        break lexical_join_34;
    }
    spill1704_2 = ((java.lang.Class)(spill1704_1)).isAssignableFrom(((java.lang.Class)(((java.lang.Object)(life5_5)).getClass())));
    if (!((life4_13 != 0))) {
        lexicalValue1704_51_0 = ((spill1704_2) ? 1 : 0);
        break lexical_join_51;
    }
    if (!(spill1704_2)) {
        break lexical_join_48;
    }
    lexicalValue1704_34_0 = ((java.util.Map)(this.b)).get(((java.lang.Object)(life8_20)));
    }
    life9_44 = ((java.util.List)(lexicalValue1704_34_0));
    spill1704_3 = life9_44;
    if (!((life4_13 != 0))) {
        lexicalValue1704_41_0 = spill1704_3;
        break lexical_join_41;
    }
    if (!((spill1704_3 != null))) {
        break lexical_join_48;
    }
    lexicalValue1704_41_0 = life9_44;
    }
    spill1704_4 = ((java.util.List)(lexicalValue1704_41_0)).remove(((java.lang.Object)(life5_5)));
    if (!((life4_13 != 0))) {
        lexicalValue1704_47_0 = ((spill1704_4) ? 1 : 0);
        break lexical_join_47;
    }
    if (!(spill1704_4)) {
        break lexical_join_48;
    }
    lexicalValue1704_47_0 = 1;
    }
    life6_7 = lexicalValue1704_47_0;
    }
    if (!((life4_13 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1704_51_0 = life6_7;
    }
    return ((lexicalValue1704_51_0) != 0);
}


public int size() {
return ((java.util.List)(this.e)).size();
}


public java.util.Iterator<T> iterator() {
java.util.List forwardValue5720_16_0;
    java.util.Iterator forwardValue5720_18_0;
    java.util.List spill5720_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 57261217764538L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill5720_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue5720_16_0 = spill5720_0;
        break forward_join_16;
    }
    if (!(((java.util.List)(spill5720_0)).isEmpty())) {
        break forward_join_14;
    }
    forwardValue5720_18_0 = java.util.Collections.emptyIterator();
    break forward_join_18;
    }
    forwardValue5720_16_0 = this.e;
    }
    forwardValue5720_18_0 = com.google.common.collect.Iterators.unmodifiableIterator(((java.util.Iterator)(((java.util.List)(forwardValue5720_16_0)).iterator())));
    }
    return forwardValue5720_18_0;
}


public boolean contains(java.lang.Object p0) {
return (__sourceIntrinsic_booleanComparison((com.google.common.collect.Iterators.contains(((java.util.Iterator)(((java.lang.Iterable)(((net.minecraft.util.ClassInheritanceMultiMap)(this)).a__Iterable(((java.lang.Class)(((java.lang.Object)(p0)).getClass()))))).iterator())), ((java.lang.Object)(p0))))) != 0);
}


protected void a__Void(java.lang.Class<?> p0) {
int lexicalValue1702_37_0;
    boolean spill1702_0;
    boolean spill1702_1;
    long life2_3;
    java.util.Iterator life5_12;
    int life4_13;
    java.lang.Object life6_19;
    lexical_join_37: {
    lexical_join_33: {
    life2_3 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 124353632750096L);
    ((java.util.Set)(net.minecraft.util.ClassInheritanceMultiMap.a)).add(((java.lang.Object)(p0)));
    spill1702_0 = moom.DS.c__Boolean();
    life5_12 = ((java.util.List)(this.e)).iterator();
    life4_13 = ((spill1702_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_31: {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_33;
    }
    life6_19 = ((java.util.Iterator)(life5_12)).next();
    spill1702_1 = ((java.lang.Class)(p0)).isAssignableFrom(((java.lang.Class)(((java.lang.Object)(life6_19)).getClass())));
    if (!((life4_13 != 0))) {
        lexicalValue1702_37_0 = ((spill1702_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!(spill1702_1)) {
        break lexical_join_31;
    }
    ((net.minecraft.util.ClassInheritanceMultiMap)(this)).a(((java.lang.Object)(life6_19)), ((java.lang.Class)(p0)));
    }
    if (!((life4_13 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1702_37_0 = ((((java.util.Set)(this.c)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1702_37_0);
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


protected java.lang.Class<?> a(java.lang.Class<?> p0) {
int forwardValue5716_19_0;
    net.minecraft.util.ClassInheritanceMultiMap forwardValue5716_21_0;
    boolean spill5716_0;
    net.minecraft.util.ClassInheritanceMultiMap spill5716_1;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_21: {
    forward_join_19: {
    life2_3 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 124958030365506L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5716_0 = ((java.lang.Class)(this.d)).isAssignableFrom(((java.lang.Class)(p0)));
    if (!((life4_5 != 0))) {
        forwardValue5716_19_0 = ((spill5716_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill5716_0)) {
        break forward_join_25;
    }
    spill5716_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue5716_21_0 = spill5716_1;
        break forward_join_21;
    }
    forwardValue5716_19_0 = ((((java.util.Set)(((net.minecraft.util.ClassInheritanceMultiMap)(spill5716_1)).c)).contains(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((forwardValue5716_19_0 == 0))) {
        break forward_join_23;
    }
    forwardValue5716_21_0 = this;
    }
    ((net.minecraft.util.ClassInheritanceMultiMap)(forwardValue5716_21_0)).a__Void(((java.lang.Class)(p0)));
    }
    return p0;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_2326cdeafedf_invokedynamic5716_10(p0));
}


private void a(T p0, java.lang.Class<?> p1) {
java.util.List forwardValue5717_31_0;
    boolean spill5717_0;
    java.util.List spill5717_1;
    long life3_3;
    java.util.List life6_10;
    int life5_11;
    forward_join_34: {
    forward_join_31: {
    forward_join_30: {
    life3_3 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 121942506714314L);
    spill5717_0 = moom.DS.b__Boolean();
    life6_10 = ((java.util.List)(((java.util.Map)(this.b)).get(((java.lang.Object)(p1)))));
    life5_11 = ((spill5717_0) ? 1 : 0);
    spill5717_1 = life6_10;
    if (!((life5_11 == 0))) {
        forwardValue5717_31_0 = spill5717_1;
        break forward_join_31;
    }
    if (!((spill5717_1 == null))) {
        break forward_join_30;
    }
    ((java.util.Map)(this.b)).put(((java.lang.Object)(p1)), ((java.lang.Object)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(new java.lang.Object[] {p0}))))));
    if (!((life5_11 != 0))) {
        break forward_join_34;
    }
    }
    forwardValue5717_31_0 = life6_10;
    }
    ((java.util.List)(forwardValue5717_31_0)).add(((java.lang.Object)(p0)));
    }
    return;
}


public <S> java.lang.Iterable<S> a__Iterable(java.lang.Class<S> p0) {
return __sourceIntrinsic_64e8fec5b180_originalDynamicSite2050_0(this, p0);
}


private java.util.Iterator lambda$getByClass$0(java.lang.Class p0) {
java.util.List forwardValue5721_21_0;
    boolean spill5721_0;
    java.util.List spill5721_1;
    long life2_3;
    java.util.List life5_12;
    int life4_13;
    java.util.Iterator life6_27;
    forward_join_21: {
    forward_join_20: {
    life2_3 = (net.minecraft.util.ClassInheritanceMultiMap.f ^ 27637097864621L);
    spill5721_0 = moom.DS.b__Boolean();
    life5_12 = ((java.util.List)(((java.util.Map)(this.b)).get(((java.lang.Object)(((net.minecraft.util.ClassInheritanceMultiMap)(this)).a(((java.lang.Class)(p0))))))));
    life4_13 = ((spill5721_0) ? 1 : 0);
    spill5721_1 = life5_12;
    if (!((life4_13 == 0))) {
        forwardValue5721_21_0 = spill5721_1;
        break forward_join_21;
    }
    if (!((spill5721_1 == null))) {
        break forward_join_20;
    }
    return java.util.Collections.emptyIterator();
    }
    forwardValue5721_21_0 = life5_12;
    }
    life6_27 = ((java.util.List)(forwardValue5721_21_0)).iterator();
    return com.google.common.collect.Iterators.filter(((java.util.Iterator)(life6_27)), ((java.lang.Class)(p0)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2326cdeafedf_invokedynamic5716_10(java.lang.Class a0) throws E;

private static native <E extends Throwable> java.lang.Iterable __sourceIntrinsic_64e8fec5b180_originalDynamicSite2050_0(net.minecraft.util.ClassInheritanceMultiMap a0, java.lang.Class a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
