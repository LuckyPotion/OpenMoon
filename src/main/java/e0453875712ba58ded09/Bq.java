package moom;


public class Bq<V> implements java.util.Map<java.lang.String, V> {

private final java.util.Map<java.lang.String, V> a;

private static final long b;

public Bq() {
super();
    this.a = com.google.common.collect.Maps.newLinkedHashMap();
}


static {
moom.Bq.b = (moom._c.a(-3529386413208289976L, -6735198249730137020L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(24769873227571L);
}


public V remove(java.lang.Object p0) {
return ((V)(((java.util.Map)(this.a)).remove(((java.lang.Object)(((java.lang.String)(((java.lang.Object)(p0)).toString())).toLowerCase())))));
}


public V get(java.lang.Object p0) {
return ((V)(((java.util.Map)(this.a)).get(((java.lang.Object)(((java.lang.String)(((java.lang.Object)(p0)).toString())).toLowerCase())))));
}


public java.lang.Object put__sourceBridge_8bb061a9be(java.lang.Object p0, java.lang.Object p1) {
return ((moom.Bq)(this)).a(((java.lang.String)(((java.lang.String)(p0)))), ((java.lang.Object)(p1)));
}


public java.util.Collection<V> values() {
return ((java.util.Map)(this.a)).values();
}


public void clear() {
((java.util.Map)(this.a)).clear();
    return;
}


public boolean isEmpty() {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.a)).isEmpty())) != 0);
}


public int size() {
return ((java.util.Map)(this.a)).size();
}


public V a(java.lang.String p0, V p1) {
return ((V)(((java.util.Map)(this.a)).put(((java.lang.Object)(((java.lang.String)(p0)).toLowerCase())), ((java.lang.Object)(p1)))));
}


public java.util.Set<java.util.Map.Entry<java.lang.String, V>> entrySet() {
return ((java.util.Map)(this.a)).entrySet();
}


public void putAll(java.util.Map<? extends java.lang.String, ? extends V> p0) {
boolean spill509_0;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    java.util.Map.Entry life6_16;
    lexical_join_27: {
    life2_3 = (moom.Bq.b ^ 14401411064815L);
    spill509_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life5_8 = ((java.util.Set)(((java.util.Map)(p0)).entrySet())).iterator();
    life4_9 = ((spill509_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_27;
    }
    life6_16 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_8)).next()));
    ((moom.Bq)(this)).a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life6_16)).getKey())))), ((java.lang.Object)(((java.util.Map.Entry)(life6_16)).getValue())));
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public boolean containsKey(java.lang.Object p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.a)).containsKey(((java.lang.Object)(((java.lang.String)(((java.lang.Object)(p0)).toString())).toLowerCase()))))) != 0);
}


public java.util.Set<java.lang.String> keySet() {
return ((java.util.Map)(this.a)).keySet();
}


public boolean containsValue(java.lang.Object p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.a)).containsKey(((java.lang.Object)(p0))))) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

public V put(java.lang.String __bridgeParam0, V __bridgeParam1) { return ((V)(this.put__sourceBridge_8bb061a9be(((java.lang.Object)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))))); }
}
