package moom;


class CC implements java.lang.Iterable<moom.DT> {

moom.DT a;

moom.DT b;

CC(moom.DT p0, moom.DT p1) { super(); }


private static void __sourceConstructorBody_de8ffa8a7c00002c(moom.CC receiver, moom.DT p0, moom.DT p1) throws Throwable {

((moom.CC)(receiver)).a = ((moom.DT)(p0));

    ((moom.CC)(receiver)).b = ((moom.DT)(p1));

    moom.CC.__sourceConstructorInit_de8ffa8a7c00002c_0(((moom.CC)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_de8ffa8a7c00002c_0(moom.CC a0) throws E;

public java.util.Iterator<moom.DT> iterator() {
return new moom.c(this);
}

}
