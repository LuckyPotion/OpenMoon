package moom;


public class Dq {

private static final long a;

public Dq() {
super();
}


static {
a = (moom._c.a(-5609322205798968559L, 7876988176824780649L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(110342744906002L);
}


private static java.util.NoSuchElementException a(java.util.NoSuchElementException p0) {
return p0;
}


public static <K, V> java.util.Map<K, V> a(java.lang.Iterable<K> p0, java.lang.Iterable<V> p1, java.util.Map<K, V> p2) {
boolean spill567_0;
    long life3_3;
    java.util.Iterator life6_7;
    int life5_8;
    java.util.Iterator life7_11;
    java.lang.Object life8_17;
    lexical_join_35: {
    lexical_join_28: {
    life3_3 = (moom.Dq.a ^ 111707551436796L);
    spill567_0 = moom.DS.b__Boolean();
    life6_7 = ((java.lang.Iterable)(p1)).iterator();
    life5_8 = ((spill567_0) ? 1 : 0);
    life7_11 = ((java.lang.Iterable)(p0)).iterator();
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life7_11)).hasNext())) {
        break lexical_join_28;
    }
    life8_17 = ((java.util.Iterator)(life7_11)).next();
    ((java.util.Map)(p2)).put(((java.lang.Object)(life8_17)), ((java.lang.Object)(((java.util.Iterator)(life6_7)).next())));
    if (!((life5_8 == 0))) {
        break lexical_join_35;
    }
    if (!((life5_8 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    if (!(((java.util.Iterator)(life6_7)).hasNext())) {
        break lexical_join_35;
    }
    throw new java.util.NoSuchElementException();
    }
    return p2;
}


public static <K, V> java.util.Map<K, V> a(java.lang.Iterable<K> p0, java.lang.Iterable<V> p1) {
return moom.Dq.a(((java.lang.Iterable)(p0)), ((java.lang.Iterable)(p1)), ((java.util.Map)(com.google.common.collect.Maps.newLinkedHashMap())));
}

}
