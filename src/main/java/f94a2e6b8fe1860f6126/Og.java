package moom;


public class Og implements org.apache.logging.log4j.spi.CleanableThreadContextMap {

private static final org.tinylog.provider.ContextProvider a;

private static final org.apache.logging.log4j.util.StringMap b;

private static final long c;

public Og() {
super();
}


static {
c = (moom._c.a(-563276661503924075L, -6991237646132614535L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(44847063276550L);
    a = (org.tinylog.provider.ProviderRegistry.getLoggingProvider()).getContextProvider();
    b = new org.apache.logging.log4j.util.SortedArrayStringMap(1);
    (moom.Og.b).freeze();
}


public void remove(java.lang.String p0) {
((org.tinylog.provider.ContextProvider)(moom.Og.a)).remove(((java.lang.String)(p0)));
    return;
}


public java.lang.String get(java.lang.String p0) {
return ((org.tinylog.provider.ContextProvider)(moom.Og.a)).get(((java.lang.String)(p0)));
}


public void put(java.lang.String p0, java.lang.String p1) {
((org.tinylog.provider.ContextProvider)(moom.Og.a)).put(((java.lang.String)(p0)), ((java.lang.Object)(p1)));
    return;
}


public void clear() {
((org.tinylog.provider.ContextProvider)(moom.Og.a)).clear();
    return;
}


public boolean isEmpty() {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(((org.tinylog.provider.ContextProvider)(moom.Og.a)).getMapping())).isEmpty())) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void putAll(java.util.Map<java.lang.String, java.lang.String> p0) {
int[] spill1043_0;
    long life2_3;
    java.util.Iterator life5_8;
    int[] life4_9;
    java.util.Map.Entry life6_16;
    lexical_join_26: {
    life2_3 = (moom.Og.c ^ 125744943425092L);
    spill1043_0 = moom.OJ.b();
    life5_8 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();
    life4_9 = spill1043_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_26;
    }
    life6_16 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_8)).next()));
    ((org.tinylog.provider.ContextProvider)(moom.Og.a)).put(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life6_16)).getKey())))), ((java.lang.Object)(((java.util.Map.Entry)(life6_16)).getValue())));
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public boolean containsKey(java.lang.String p0) {
long local2 = (moom.Og.c ^ 80643745253682L);
    return ((((((org.tinylog.provider.ContextProvider)(moom.Og.a)).get(((java.lang.String)(p0))) != null) ? 1 : 0)) != 0);
}


public void removeAll(java.lang.Iterable<java.lang.String> p0) {
int[] spill1044_0;
    long life2_3;
    java.util.Iterator life5_7;
    int[] life4_8;
    java.lang.String life6_15;
    lexical_join_21: {
    life2_3 = (moom.Og.c ^ 74564164361781L);
    spill1044_0 = moom.OJ.b();
    life5_7 = ((java.lang.Iterable)(p0)).iterator();
    life4_8 = spill1044_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_21;
    }
    life6_15 = ((java.lang.String)(((java.util.Iterator)(life5_7)).next()));
    ((org.tinylog.provider.ContextProvider)(moom.Og.a)).remove(((java.lang.String)(life6_15)));
    if (!((life4_8 != null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


public org.apache.logging.log4j.util.StringMap getReadOnlyContextData() {
org.apache.logging.log4j.util.SortedArrayStringMap lexicalValue1042_41_0;
    int[] spill1042_0;
    org.apache.logging.log4j.util.SortedArrayStringMap spill1042_1;
    long life1_3;
    java.util.Map life4_7;
    int[] life3_8;
    org.apache.logging.log4j.util.SortedArrayStringMap life5_19;
    java.util.Iterator life6_23;
    java.util.Map.Entry life7_30;
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_14: {
    life1_3 = (moom.Og.c ^ 15109040769236L);
    spill1042_0 = moom.OJ.b();
    life4_7 = ((moom.Og)(this)).getCopy();
    life3_8 = spill1042_0;
    if (!(((java.util.Map)(life4_7)).isEmpty())) {
        break lexical_join_14;
    }
    return moom.Og.b;
    }
    life5_19 = new org.apache.logging.log4j.util.SortedArrayStringMap();
    life6_23 = ((java.util.Set)(((java.util.Map)(life4_7)).entrySet())).iterator();
    lexical_cycle_22: while (true) {
    if (!(((java.util.Iterator)(life6_23)).hasNext())) {
        break lexical_join_40;
    }
    life7_30 = ((java.util.Map.Entry)(((java.util.Iterator)(life6_23)).next()));
    spill1042_1 = life5_19;
    if (!((life3_8 == null))) {
        lexicalValue1042_41_0 = spill1042_1;
        break lexical_join_41;
    }
    ((org.apache.logging.log4j.util.StringMap)(spill1042_1)).putValue(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life7_30)).getKey())))), ((java.lang.Object)(((java.util.Map.Entry)(life7_30)).getValue())));
    if (!((life3_8 != null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue1042_41_0 = life5_19;
    }
    return lexicalValue1042_41_0;
}


public java.util.Map<java.lang.String, java.lang.String> getImmutableMapOrNull() {
long local1 = (moom.Og.c ^ 31419014856752L);
    java.util.Map local3 = ((org.tinylog.provider.ContextProvider)(moom.Og.a)).getMapping();
    return ((local3 == null) ? null : new java.util.HashMap(local3));
}


public java.util.Map<java.lang.String, java.lang.String> getCopy() {
long life1_3;
    java.util.Map life4_7;
    int[] life3_8;
    life1_3 = (moom.Og.c ^ 27327978303390L);
    int[] spill309_0 = moom.OJ.b();
    life4_7 = ((org.tinylog.provider.ContextProvider)(moom.Og.a)).getMapping();
    life3_8 = spill309_0;
    java.util.HashMap spill309_1 = ((life4_7 == null) ? new java.util.HashMap() : new java.util.HashMap(life4_7));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.OJ.b(((int[])(new int[1])));
    }
    return spill309_1;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
