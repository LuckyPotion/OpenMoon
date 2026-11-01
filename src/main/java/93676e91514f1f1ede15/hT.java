package moom;


public class hT extends moom.hS {

private final com.google.common.base.Predicate<java.lang.String> d;

public hT(int p0, java.lang.String p1, boolean p2, com.google.common.base.Predicate<java.lang.String> p3) {
super(p0, p1, p2);
    this.d = ((com.google.common.base.Predicate) (com.google.common.base.MoreObjects.firstNonNull(p3, com.google.common.base.Predicates.alwaysTrue())));
}


public com.google.common.base.Predicate<java.lang.String> a__sourceReturn_d92b96d973() {
return this.d;
}

}
