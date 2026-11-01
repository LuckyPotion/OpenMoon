package moom;


public class CE {

private static final long a;

public CE() {
super();
}


static {
a = (moom._c.a(-1245708593957315688L, 4584759763942287844L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(90860519836460L);
}


private static <T> java.lang.Iterable<java.util.List<T>> b(java.lang.Iterable<java.lang.Object[]> p0) {
return com.google.common.collect.Iterables.transform(((java.lang.Iterable)(p0)), ((com.google.common.base.Function)(new moom.CF())));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static <T> T[] a(java.lang.Class<? super T> p0, int p1) {
return (((T[])((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(p0)), ((int)(p1)))))));
}


private static <T> T[] a__ArrayObject(java.lang.Class<? super T> p0, java.lang.Iterable<? extends T> p1) {
java.util.ArrayList lexicalValue522_26_0;
    boolean spill522_0;
    java.util.ArrayList spill522_1;
    long life2_3;
    java.util.ArrayList life5_5;
    java.util.Iterator life6_9;
    int life4_10;
    java.lang.Object life7_16;
    lexical_join_26: {
    lexical_join_25: {
    life2_3 = (moom.CE.a ^ 40406304740775L);
    life5_5 = com.google.common.collect.Lists.newArrayList();
    spill522_0 = moom.DS.b__Boolean();
    life6_9 = ((java.lang.Iterable)(p1)).iterator();
    life4_10 = ((spill522_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life6_9)).hasNext())) {
        break lexical_join_25;
    }
    life7_16 = ((java.util.Iterator)(life6_9)).next();
    spill522_1 = life5_5;
    if (!((life4_10 == 0))) {
        lexicalValue522_26_0 = spill522_1;
        break lexical_join_26;
    }
    ((java.util.List)(spill522_1)).add(((java.lang.Object)(life7_16)));
    if (!((life4_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue522_26_0 = life5_5;
    }
    return ((T[])(((java.util.List)(lexicalValue522_26_0)).toArray(((java.lang.Object[])(moom.CE.a(((java.lang.Class)(p0)), ((int)(((java.util.List)(life5_5)).size()))))))));
}


public static <T> java.lang.Iterable<java.util.List<T>> a(java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p0) {
return moom.CE.b(((java.lang.Iterable)(moom.CE.a(((java.lang.Class)(java.lang.Object.class)), ((java.lang.Iterable)(p0))))));
}


public static <T> java.lang.Iterable<T[]> a(java.lang.Class<T> p0, java.lang.Iterable<? extends java.lang.Iterable<? extends T>> p1) {
return new moom.CG(p0, ((java.lang.Iterable[])(moom.CE.a__ArrayObject(((java.lang.Class)(java.lang.Iterable.class)), ((java.lang.Iterable)(p1))))));
}

}
