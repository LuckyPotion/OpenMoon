package moom;


public class fH {

private final moom.DT a;

private final moom.bs b;

private final moom.bs c;

private final com.google.common.cache.LoadingCache<moom.DT, moom.fD> d;

private final int e;

private final int f;

private final int g;

public fH(moom.DT p0, moom.bs p1, moom.bs p2, com.google.common.cache.LoadingCache<moom.DT, moom.fD> p3, int p4, int p5, int p6) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.g = p6;
}


public java.lang.String toString() {
return ((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(((com.google.common.base.MoreObjects.ToStringHelper)(com.google.common.base.MoreObjects.toStringHelper(((java.lang.Object)(this))))).add(((java.lang.String)("up")), ((java.lang.Object)(this.c))))).add(((java.lang.String)("forwards")), ((java.lang.Object)(this.b))))).add(((java.lang.String)("frontTopLeft")), ((java.lang.Object)(this.a))))).toString();
}


public int b() {
return this.f;
}


public moom.bs b__bs() {
return this.c;
}


public moom.fD a(int p0, int p1, int p2) {
return ((moom.fD)(((com.google.common.cache.LoadingCache)(this.d)).getUnchecked(((java.lang.Object)(moom.fG.a(((moom.DT)(this.a)), ((moom.bs)(((moom.fH)(this)).a__bs())), ((moom.bs)(((moom.fH)(this)).b__bs())), ((int)(p0)), ((int)(p1)), ((int)(p2))))))));
}


public int a() {
return this.e;
}


public moom.bs a__bs() {
return this.b;
}


public moom.DT a__DT() {
return this.a;
}

}
