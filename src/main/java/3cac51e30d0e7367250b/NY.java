package moom;


public class NY<T> {

private final T a;

private moom.NY<T> b;

private moom.NY<T> c;

private moom.NW<T> d;

public NY(T p0) {
super();
    this.a = p0;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1345_1(this.a);
}


private void b(moom.NY<T> p0) {
this.c = ((moom.NY)(p0));
    return;
}


public moom.NY<T> b() {
return this.c;
}


private void a(moom.NW<T> p0) {
this.d = ((moom.NW)(p0));
    return;
}


private void a(moom.NY<T> p0) {
this.b = ((moom.NY)(p0));
    return;
}


public moom.NY<T> a__NY() {
return this.b;
}


public T a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1345_1(java.lang.Object a0) throws E;
}
