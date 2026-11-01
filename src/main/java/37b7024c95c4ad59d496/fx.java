package moom;


public class fx extends moom.fw<moom.bs> {

protected fx(java.lang.String p0, java.util.Collection<moom.bs> p1) {
super(p0, moom.bs.class, p1);
}


public static moom.fx a(java.lang.String p0, java.util.Collection<moom.bs> p1) {
return new moom.fx(p0, p1);
}


public static moom.fx a(java.lang.String p0, com.google.common.base.Predicate<moom.bs> p1) {
return moom.fx.a(((java.lang.String)(p0)), ((java.util.Collection)(com.google.common.collect.Collections2.filter(((java.util.Collection)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(moom.bs.values()))))), ((com.google.common.base.Predicate)(p1))))));
}


public static moom.fx a(java.lang.String p0) {
return moom.fx.a(((java.lang.String)(p0)), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.alwaysTrue())));
}

}
