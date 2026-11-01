package moom;


public class fv extends moom.fu<java.lang.Boolean> {

private final com.google.common.collect.ImmutableSet<java.lang.Boolean> d;

protected fv(java.lang.String p0) {
super(p0, java.lang.Boolean.class);
    this.d = com.google.common.collect.ImmutableSet.of(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
}


public java.lang.String a__sourceBridge_fef3acc9f7(java.lang.Comparable p0) {
return ((moom.fv)(this)).a(((java.lang.Boolean)(((java.lang.Boolean)(p0)))));
}


public java.lang.String a(java.lang.Boolean p0) {
return ((java.lang.Boolean)(p0)).toString();
}


public static moom.fv a(java.lang.String p0) {
return new moom.fv(p0);
}


public java.util.Collection<java.lang.Boolean> a__Collection() {
return this.d;
}

}
