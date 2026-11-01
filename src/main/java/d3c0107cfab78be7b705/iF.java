package moom;


public class iF {

private final moom.iz a;

private final java.util.List<moom.ix> b;

private final int c;

public iF(moom.iz p0, java.util.List<moom.ix> p1, int p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.c;
}


public moom.ix a(int p0) {
moom.ix forwardValue3624_17_0;
    forward_join_17: {
    forward_join_16: {
    if (!((p0 >= 0))) {
        break forward_join_16;
    }
    if (!((p0 < ((java.util.List)(this.b)).size()))) {
        break forward_join_16;
    }
    forwardValue3624_17_0 = ((moom.ix)(com.google.common.base.MoreObjects.firstNonNull(((java.lang.Object)(((moom.ix)(((java.util.List)(this.b)).get(((int)(p0))))))), ((java.lang.Object)(moom.iB.e)))));
    break forward_join_17;
    }
    forwardValue3624_17_0 = moom.iB.e;
    }
    return forwardValue3624_17_0;
}

}
