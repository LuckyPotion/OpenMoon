package moom;


class I_ implements java.lang.Iterable {

moom.DT a;

moom.DT b;

I_(moom.DT p0, moom.DT p1) { super(); }


private static void __sourceConstructorBody_d1802278f06c284e(moom.I_ receiver, moom.DT p0, moom.DT p1) throws Throwable {

((moom.I_)(receiver)).a = ((moom.DT)(p0));

    ((moom.I_)(receiver)).b = ((moom.DT)(p1));

    moom.I_.__sourceConstructorInit_d1802278f06c284e_0(((moom.I_)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d1802278f06c284e_0(moom.I_ a0) throws E;

public java.util.Iterator iterator() {
return new moom.e(this);
}

}
