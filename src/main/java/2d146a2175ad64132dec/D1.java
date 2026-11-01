package moom;


public class D1 {

protected int a;

private static java.lang.String[] b;

public D1(int p0) {
super();
    this.a = p0;
}


static {
if ((moom.D1.b() == null)) {
        moom.D1.b(((java.lang.String[])(new java.lang.String[1])));
    }
}


public static void b(java.lang.String[] p0) {
moom.D1.b = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b() {
return moom.D1.b;
}

}
