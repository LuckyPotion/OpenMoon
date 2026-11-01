package moom;


public class D extends java.io.IOException {

private java.util.List<moom.pJ> a;

private java.lang.String b;

private static int[] c;

private static long d;

public D(java.lang.String p0) {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
    (this.a).add(new moom.pJ());
    this.b = p0;
}

private static native <E extends Throwable> void __sourceConstructorInit_4882b44ee59205e5_0(moom.D a0, java.lang.Throwable a1) throws E;

public D(java.lang.String p0, java.lang.Throwable p1) { super((java.lang.Throwable)null); }


private static void __sourceConstructorBody_4882b44ee59205e5(moom.D receiver, java.lang.String p0, java.lang.Throwable p1) throws Throwable {

long local3_life1 = (moom.D.d ^ 40620648526504L);

    int[] __sourceSpill529_3 = moom.D.b();

    moom.D.__sourceConstructorInit_4882b44ee59205e5_0(((moom.D)(receiver)), ((java.lang.Throwable)(p1)));

    int[] local5_life5 = __sourceSpill529_3;

    ((moom.D)(receiver)).a = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((java.util.List)(((moom.D)(receiver)).a)).add(((java.lang.Object)(new moom.pJ())));

    ((moom.D)(receiver)).b = ((java.lang.String)(p0));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        moom.D.b(((int[])(new int[3])));

    }

    return;

}



static {
d = ((long)(((moom._a)(moom._c.a(((long)(-7591563308050871516L)), ((long)(2996142364269587249L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(104380505267972L)))));
    if ((moom.D.b() != null)) {
        moom.D.b(((int[])(new int[3])));
    }
}


public static int[] b() {
return moom.D.c;
}


public static void b(int[] p0) {
c = ((int[])(p0));
    return;
}


public void b(java.lang.String p0) {
((moom.pJ)(((moom.pJ)(((java.util.List)(this.a)).get(((int)(0))))))).a = ((java.lang.String)(p0));
    ((java.util.List)(this.a)).add(((int)(0)), ((java.lang.Object)(new moom.pJ())));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.D a(java.lang.Exception p0) {
java.lang.Exception forwardValue1679_15_0;
    java.lang.Exception spill1679_0;
    long life1_3;
    int[] life3_5;
    java.lang.String life4_21;
    forward_join_22: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.D.d ^ 137782880548636L);
    life3_5 = moom.D.b();
    spill1679_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue1679_15_0 = spill1679_0;
        break forward_join_15;
    }
    if (!((((spill1679_0 instanceof moom.D) ? 1 : 0) != 0))) {
        break forward_join_14;
    }
    return ((moom.D)(p0));
    }
    forwardValue1679_15_0 = p0;
    }
    life4_21 = ((java.lang.Exception)(forwardValue1679_15_0)).getMessage();
    if (!((((p0 instanceof java.io.FileNotFoundException) ? 1 : 0) != 0))) {
        break forward_join_22;
    }
    life4_21 = "File not found";
    }
    return new moom.D(life4_21, p0);
}


public void a(java.lang.String p0) {
__sourceExactCall_b657fba207de0e(((moom.pJ)(((moom.pJ)(((java.util.List)(this.a)).get(((int)(0))))))), ((java.lang.String)(p0)));
    return;
}


public java.lang.String getMessage() {
return __sourceIntrinsic_b70a89c5dfbf_originalDynamicSite1099_7(((moom.pJ)(((moom.pJ)(((java.util.List)(this.a)).get(((int)((((java.util.List)(this.a)).size() - 1)))))))).toString(), this.b);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b70a89c5dfbf_originalDynamicSite1099_7(java.lang.String a0, java.lang.String a1) throws E;

private static native void __sourceExactCall_b657fba207de0e(moom.pJ p0, java.lang.String p1);
}
