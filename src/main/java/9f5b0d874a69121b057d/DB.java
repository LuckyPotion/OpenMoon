package moom;


public class DB<K, V> extends moom.Dy<K, V> implements moom.C8<V> {

protected final moom.Dx<V> c;

protected final java.util.Map<V, K> d;

public DB() {
super();
    this.c = new moom.Dx();
    this.d = (((com.google.common.collect.BiMap) (this.b))).inverse();
}


public java.util.Iterator<V> iterator() {
return ((moom.Dx)(this.c)).iterator();
}


public K b(V p0) {
return ((K)(((java.util.Map)(this.d)).get(((java.lang.Object)(p0)))));
}


public int a(V p0) {
return ((moom.Dx)(this.c)).a(((java.lang.Object)(p0)));
}


public V a(int p0) {
return ((V)(((moom.Dx)(this.c)).a(((int)(p0)))));
}


protected java.util.Map<K, V> a() {
return com.google.common.collect.HashBiMap.create();
}


public boolean a__Boolean(K p0) {
return (__sourceIntrinsic_booleanComparison((super.a__Boolean((((K)((java.lang.Object)(p0))))))) != 0);
}


public void a(int p0, K p1, V p2) {
((moom.Dx)(this.c)).a(((java.lang.Object)(p2)), ((int)(p0)));
    ((moom.DB)(this)).a(((java.lang.Object)(p1)), ((java.lang.Object)(p2)));
    return;
}


public V a__Object(K p0) {
return super.a__Object((((K)((java.lang.Object)(p0)))));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
