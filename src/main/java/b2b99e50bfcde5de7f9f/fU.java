package com.moon;


public class fU {

private final com.moon.fV a;

private static int[] b;

private static final long c;

public fU() {
super();
    this.a = new com.moon.fV();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(8151388500864616384L)), ((long)(8694629972816717337L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(68708523353641L)))));
    if ((com.moon.fU.b() == null)) {
        com.moon.fU.b(((int[])(new int[2])));
    }
}


public static void b(int[] p0) {
b = ((int[])(p0));
    return;
}


public static int[] b() {
return com.moon.fU.b;
}


public void b(com.moon.module.Module p0) {
((com.moon.fV)(this.a)).a(((com.moon.module.Module)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.google.common.collect.ClassToInstanceMap<com.moon.module.Module> a() {
return ((com.moon.fV)(this.a)).a();
}


public void a(com.moon.module.Module p0) {
((com.moon.fV)(this.a)).a__Void(((com.moon.module.Module)(p0)));
    return;
}


public com.moon.module.Module a(java.lang.String p0) {
return ((com.moon.fV)(this.a)).a(((java.lang.String)(((java.lang.String)(p0)).toLowerCase())));
}


public <T extends com.moon.module.Module> T a(java.lang.Class<? extends com.moon.module.Module> p0) {
return ((T)(((com.moon.fV)(this.a)).a(((java.lang.Class)(p0)))));
}


public java.util.List<com.moon.module.Module> a(com.moon.module.ModuleCategory p0) {
return ((java.util.List)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(((com.moon.fV)(this.a)).a__Collection())).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_e80ed8baf2b6_originalDynamicSite371_3(p0)))))).collect(((java.util.stream.Collector)(java.util.stream.Collectors.toList())))));
}


public com.moon.fV a__fV() {
return this.a;
}


private static boolean lambda$modulesOf$0(com.moon.module.ModuleCategory p0, com.moon.module.Module p1) {
long local2 = (com.moon.fU.c ^ 3496917660674L);
    return ((((((com.moon.module.Module)(p1)).getCategory() == p0) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e80ed8baf2b6_originalDynamicSite371_3(com.moon.module.ModuleCategory a0) throws E;
}
