package moom;


public class Dy<K, V> implements net.minecraft.util.IRegistry<K, V> {

private static final org.apache.logging.log4j.Logger a;

protected final java.util.Map<K, V> b;

private static final long h;

public Dy() {
super();
    this.b = (this).a();
}


static {
h = (moom._c.a(3680369972313331120L, -8883202539940931259L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(269953462676774L);
    a = org.apache.logging.log4j.LogManager.getLogger();
}


public java.util.Iterator<V> iterator() {
return ((java.util.Collection)(((java.util.Map)(this.b)).values())).iterator();
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public java.util.Set<K> a__Set() {
return java.util.Collections.unmodifiableSet(((java.util.Set)(((java.util.Map)(this.b)).keySet())));
}


protected java.util.Map<K, V> a() {
return com.google.common.collect.Maps.newHashMap();
}


public V a__Object(K p0) {
return ((V)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0)))));
}


public boolean a__Boolean(K p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.b)).containsKey(((java.lang.Object)(p0))))) != 0);
}


public void a(K p0, V p1) {
java.util.Map forwardValue1775_26_0;
    java.lang.Object forwardValue1775_26_1;
    boolean spill1775_0;
    java.util.Map spill1775_1;
    java.lang.Object spill1775_2;
    long life3_3;
    int life5_8;
    forward_join_26: {
    forward_join_23: {
    life3_3 = (moom.Dy.h ^ 84877546868258L);
    spill1775_0 = moom.DS.c__Boolean();
    org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(p0)));
    life5_8 = ((spill1775_0) ? 1 : 0);
    org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(p1)));
    spill1775_1 = this.b;
    spill1775_2 = p0;
    if (!((life5_8 != 0))) {
        forwardValue1775_26_0 = spill1775_1;
        forwardValue1775_26_1 = spill1775_2;
        break forward_join_26;
    }
    if (!(((java.util.Map)(spill1775_1)).containsKey(((java.lang.Object)(spill1775_2))))) {
        break forward_join_23;
    }
    ((org.apache.logging.log4j.Logger)(moom.Dy.a)).debug(((java.lang.String)(__sourceIntrinsic_ba67eabf55c9_invokedynamic1775_8(p0))));
    }
    forwardValue1775_26_0 = this.b;
    forwardValue1775_26_1 = p0;
    }
    ((java.util.Map)(forwardValue1775_26_0)).put(((java.lang.Object)(forwardValue1775_26_1)), ((java.lang.Object)(p1)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ba67eabf55c9_invokedynamic1775_8(java.lang.Object a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
