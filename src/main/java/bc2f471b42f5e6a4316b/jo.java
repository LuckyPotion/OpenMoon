package com.moon;


public class jo {

private final java.util.Map<com.moon.ce, com.moon.jm> a;

private static final long b;

public jo() {
super();
    this.a = new java.util.HashMap();
}


static {
b = (moom._c.a(509873241673471324L, -7168039609238309616L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(5321569458442L);
}


public void a() {
((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(((java.util.Map)(this.a)).values())).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite451_3()))))).forEach(((java.util.function.Consumer)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite451_5())));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(com.moon.ce p0) {
((java.util.Map)(this.a)).computeIfAbsent(((java.lang.Object)(p0)), ((java.util.function.Function)(__sourceIntrinsic_8a39540102e9_originalDynamicSite452_1(p0))));
    return;
}


public com.moon.jm a(com.moon.ce p0) {
((com.moon.jo)(this)).a__Void(((com.moon.ce)(p0)));
    return ((com.moon.jm)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
}


private static boolean lambda$refreshTextureStates$1(com.moon.jm p0) {
return ((((p0 instanceof com.moon.jn) ? 1 : 0)) != 0);
}


private static void lambda$refreshTextureStates$2(com.moon.jm p0) {
java.lang.Object local1 = ((com.moon.jn)(p0));
    ((com.moon.jn)(local1)).g = ((boolean)(true));
    return;
}


private static com.moon.jm lambda$checkAbsenceAndInit$0(com.moon.ce p0, com.moon.ce p1) {
com.moon.jn forwardValue59_27_0;
    long life2_3;
    forward_join_27: {
    forward_join_26: {
    forward_join_14: {
    forward_join_10: {
    life2_3 = (com.moon.jo.b ^ 117834218538912L);
    switch ((com.moon.jp.a)[((com.moon.cd)(((com.moon.ce)(p0)).a__cd())).ordinal()]) {
default:
{
        break forward_join_10;
    }
case 1:
{
        break forward_join_14;
    }
case 2:
{
        break forward_join_26;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forwardValue59_27_0 = new com.moon.jn(((com.moon.ce)(p0)).a__String(), ((com.moon.ce)(p0)).a(), ((com.moon.ce)(p0)).b(), ((com.moon.ce)(p0)).c());
    break forward_join_27;
    }
    forwardValue59_27_0 = null;
    }
    return forwardValue59_27_0;
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_2c8ae721fed4_originalDynamicSite451_3() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_2c8ae721fed4_originalDynamicSite451_5() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_8a39540102e9_originalDynamicSite452_1(com.moon.ce a0) throws E;
}
