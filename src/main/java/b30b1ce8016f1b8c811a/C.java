package moom;


class C extends java.io.InputStream {

private final java.io.InputStream a;

private final java.lang.String b;

private boolean c;

private static final long d;

public C(java.io.InputStream p0, moom.DD p1, java.lang.String p2) {
super();
    this.c = ((boolean)(false));
    this.a = ((java.io.InputStream)(p0));
    java.io.ByteArrayOutputStream local4 = new java.io.ByteArrayOutputStream();
    ((java.lang.Exception)(new java.lang.Exception())).printStackTrace(((java.io.PrintStream)(new java.io.PrintStream(local4))));
    this.b = ((java.lang.String)(__sourceIntrinsic_2cfe494e6efb_originalDynamicSite3416_3(p1, p2, local4)));
    return;
}


static {
moom.C.d = (moom._c.a(-1533534437371649700L, -8834309024749623815L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(63010446209966L);
}


protected void finalize() throws java.lang.Throwable {
moom.C forwardValue1561_16_0;
    moom.C spill1561_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.C.d ^ 138050446440676L);
    life3_5 = moom.oO.b();
    spill1561_0 = this;
    if (!((life3_5 != null))) {
        forwardValue1561_16_0 = spill1561_0;
        break forward_join_16;
    }
    if (!((!((moom.C)(spill1561_0)).c))) {
        break forward_join_15;
    }
    ((org.apache.logging.log4j.Logger)(moom.oL.a)).warn(((java.lang.String)(this.b)));
    }
    forwardValue1561_16_0 = this;
    }
    __sourceIntrinsic_706af74033e4_call1561_6(forwardValue1561_16_0);
    return;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public int read() throws java.io.IOException {
return ((java.io.InputStream)(this.a)).read();
}


public void close() throws java.io.IOException {
((java.io.InputStream)(this.a)).close();
    this.c = ((boolean)(true));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2cfe494e6efb_originalDynamicSite3416_3(moom.DD a0, java.lang.String a1, java.io.ByteArrayOutputStream a2) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_706af74033e4_call1561_6(moom.C a0) throws E;
}
