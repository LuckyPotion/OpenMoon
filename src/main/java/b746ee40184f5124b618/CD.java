package moom;


class CD implements java.lang.Iterable<moom.DU> {

moom.DT a;

moom.DT b;

CD(moom.DT p0, moom.DT p1) { super(); }


private static void __sourceConstructorBody_7aae40afce215fd2(moom.CD receiver, moom.DT p0, moom.DT p1) throws Throwable {

((moom.CD)(receiver)).a = ((moom.DT)(p0));

    ((moom.CD)(receiver)).b = ((moom.DT)(p1));

    moom.CD.__sourceConstructorInit_7aae40afce215fd2_0(((moom.CD)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_7aae40afce215fd2_0(moom.CD a0) throws E;

public java.util.Iterator<moom.DU> iterator() {
return new moom.d(this);
}

}
