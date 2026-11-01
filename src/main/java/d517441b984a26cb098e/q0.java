package moom;


class q0 {

private java.lang.String a;

private java.lang.String b;

private static long c;

public q0(java.lang.String p0, java.lang.Object p1) { super(); }


private static void __sourceConstructorBody_04e31e2a02d70f8d(moom.q0 receiver, java.lang.String p0, java.lang.Object p1) throws Throwable {

java.lang.Object __initValue717_21_0;

    java.lang.Object __initValue717_26_0;

    long local3_life2;

    java.lang.String[] local5_life7;

    java.lang.Throwable local6_life13;

    init_join_42: {

    init_join_38: {

    init_join_26: {

    init_join_21: {

    init_join_20: {

    local3_life2 = (moom.q0.c ^ 85136294961044L);

    moom.q0.__sourceConstructorInit_04e31e2a02d70f8d_0(((moom.q0)(receiver)));

    java.lang.String[] __sourceSpill717_6 = moom.qZ.b();

    ((moom.q0)(receiver)).a = ((java.lang.String)(p0));

    local5_life7 = __sourceSpill717_6;

    java.lang.Object __sourceSpill717_8 = p1;

    if (!((local5_life7 == null))) {

        __initValue717_21_0 = __sourceSpill717_8;

        break init_join_21;

    }

    if (!((__sourceSpill717_8 == null))) {

        break init_join_20;

    }

    ((moom.q0)(receiver)).b = ((java.lang.String)("~~NULL~~"));

    if (!((local5_life7 != null))) {

        break init_join_42;

    }

    }

    __initValue717_21_0 = p1;

    }

    java.lang.Object __sourceSpill717_10 = __initValue717_21_0;

    if (!((local5_life7 == null))) {

        __initValue717_26_0 = __sourceSpill717_10;

        break init_join_26;

    }

    if (!((((__sourceSpill717_10 instanceof java.lang.Throwable) ? 1 : 0) != 0))) {

        break init_join_38;

    }

    __initValue717_26_0 = p1;

    }

    local6_life13 = ((java.lang.Throwable)(__initValue717_26_0));

    ((moom.q0)(receiver)).b = ((java.lang.String)(__sourceIntrinsic_04e31e2a02d70f8d_originalDynamicSite717_17(((java.lang.Class)(((java.lang.Object)(local6_life13)).getClass())).getSimpleName(), ((java.lang.Throwable)(local6_life13)).getMessage())));

    if (!((local5_life7 != null))) {

        break init_join_42;

    }

    }

    ((moom.q0)(receiver)).b = ((java.lang.String)(((java.lang.Object)(p1)).toString()));

    }

    return;

}



static {
moom.q0.c = (moom._c.a(986807729701360041L, 8627125871769495916L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(75532176078585L);
}

private static native <E extends Throwable> void __sourceConstructorInit_04e31e2a02d70f8d_0(moom.q0 a0) throws E;

public java.lang.String b() {
return this.b;
}


public java.lang.String a() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_04e31e2a02d70f8d_originalDynamicSite717_17(java.lang.String a0, java.lang.String a1) throws E;
}
