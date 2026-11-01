package moom;


class CF<T> implements com.google.common.base.Function<java.lang.Object[], java.util.List<T>> {

private CF() {
super();
}


public java.lang.Object apply__sourceBridge_262c527aaf(java.lang.Object p0) {
return ((moom.CF)(this)).a(((java.lang.Object[])(((java.lang.Object[])(p0)))));
}


public java.util.List<T> a(java.lang.Object[] p0) {
return java.util.Arrays.asList(((T[])(p0)));
}


public java.util.List<T> apply(java.lang.Object[] __bridgeParam0) { return ((java.util.List<T>)(this.apply__sourceBridge_262c527aaf(((java.lang.Object)(__bridgeParam0))))); }
}
