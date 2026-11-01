package com.moon;

import me.xdrop.fuzzywuzzy.FuzzySearch;


public class dl extends com.moon.df<com.moon.module.Module> {

private static final long f;

public dl() {
super();
}


static {
f = (moom._c.a(-2972036073703879672L, 7468078393624909657L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(245909263582546L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public com.moon.aS a() {
return com.moon.aS.ALWAYS;
}


public static com.moon.du a__du() {
return new com.moon.du();
}


public boolean a__Boolean(java.lang.String p0) {
long life2_3;
    com.moon.module.Module life5_10;
    java.lang.String[] life4_11;
    life2_3 = (com.moon.dl.f ^ 32927649023170L);
    java.lang.String[] spill835_0 = __sourceExactCall_7424377b618ea5();
    life5_10 = ((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.String)(((java.lang.String)(p0)).toLowerCase())));
    life4_11 = spill835_0;
    if ((life4_11 == null)) {
        if ((life5_10 == null)) {
        return false;
    }
        ((com.moon.dl)(this)).e = ((life5_10));
    }
    return true;
}


public java.lang.String a__String(java.lang.String p0) {
java.lang.Object forwardValue52_33_0;

    java.lang.String forwardValue52_43_0;

    java.lang.String[] spill52_0;

    moom.DN spill52_1;

    java.lang.String spill52_2;

    long life2_3;

    java.util.Collection life5_9;

    java.lang.String life6_13;

    moom.DN life7_25;

    java.lang.String[] life4_26;

    forward_join_43: {

    forward_join_37: {

    forward_join_33: {

    life2_3 = (com.moon.dl.f ^ 42430448317022L);

    life5_9 = ((java.util.Map)(((com.moon.fV)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a__fV())).a__Map())).values();

    spill52_0 = __sourceExactCall_7424377b618ea5();

    life6_13 = ((java.lang.String)(p0)).toLowerCase();

    life7_25 = ((moom.DN)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(life5_9)).stream())).map(((java.util.function.Function)(__sourceIntrinsic_7d31a37a36f2_invokedynamic52_9(life6_13)))))).max(((java.util.Comparator)(java.util.Comparator.comparing(((java.util.function.Function)(__sourceIntrinsic_7d31a37a36f2_invokedynamic52_11())))))))).orElse(((java.lang.Object)(null)))));

    life4_26 = spill52_0;

    spill52_1 = life7_25;

    if (!((life4_26 == null))) {

        forwardValue52_33_0 = spill52_1;

        break forward_join_33;

    }

    if (!((spill52_1 != null))) {

        break forward_join_37;

    }

    forwardValue52_33_0 = ((moom.DN)(life7_25)).a();

    }

    return ((java.lang.String)(((com.moon.module.Module)(((com.moon.module.Module)(forwardValue52_33_0)))).getName())).toLowerCase();

    }

    spill52_2 = null;

    if (!((life4_26 != null))) {

        forwardValue52_43_0 = spill52_2;

        break forward_join_43;

    }

    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[1])));

    forwardValue52_43_0 = spill52_2;

    }

    return forwardValue52_43_0;
}


private static moom.DN lambda$suggest$0(java.lang.String p0, com.moon.module.Module p1) {
return new moom.DN(p1, java.lang.Integer.valueOf(((int)(FuzzySearch.ratio(((java.lang.String)(p0)), ((java.lang.String)(((java.lang.String)(((com.moon.module.Module)(p1)).getName())).toLowerCase())))))));
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_7d31a37a36f2_invokedynamic52_9(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_7d31a37a36f2_invokedynamic52_11() throws E;

private static native java.lang.String[] __sourceExactCall_7424377b618ea5();
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
}
