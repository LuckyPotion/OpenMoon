package com.moon;


public class fV {

private final java.util.Map<java.lang.String, com.moon.module.Module> a;

private final com.google.common.collect.ClassToInstanceMap<com.moon.module.Module> b;

private static final long c;

public fV() {
super();
    this.a = new java.util.HashMap();
    this.b = com.google.common.collect.MutableClassToInstanceMap.create();
}


static {
c = (moom._c.a(-4790443956015030772L, 7021045298523089465L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(33568699210920L);
}


public java.util.Collection<com.moon.module.Module> a__Collection() {
return ((java.util.Map)(this.a)).values();
}


public com.google.common.collect.ClassToInstanceMap<com.moon.module.Module> a() {
return this.b;
}


public java.util.Map<java.lang.String, com.moon.module.Module> a__Map() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(com.moon.module.Module p0) {
java.lang.Object forwardValue143_25_0;
    int[] spill143_0;
    com.moon.module.Module spill143_1;
    long life2_3;
    int[] life4_13;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (com.moon.fV.c ^ 19051705951673L);
    spill143_0 = com.moon.fU.b();
    ((java.util.Map)(this.a)).put(((java.lang.Object)(((java.lang.String)(((com.moon.module.Module)(p0)).getName())).toLowerCase())), ((java.lang.Object)(p0)));
    life4_13 = spill143_0;
    spill143_1 = p0;
    if (!((life4_13 != null))) {
        forwardValue143_25_0 = spill143_1;
        break forward_join_25;
    }
    if (!((((spill143_1 instanceof com.moon.module.impl.Script) ? 1 : 0) == 0))) {
        break forward_join_26;
    }
    forwardValue143_25_0 = ((com.google.common.collect.ClassToInstanceMap)(this.b)).put(((java.lang.Object)(((java.lang.Object)(p0)).getClass())), ((java.lang.Object)(p0)));
    }
    recovery.source.CarrierOps.discard(forwardValue143_25_0);
    }
    return;
}


public com.moon.module.Module a(java.lang.String p0) {
return ((com.moon.module.Module)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
}


public <T extends com.moon.module.Module> T a(java.lang.Class<? extends T> p0) {
return (((T)((com.moon.module.Module)(((com.google.common.collect.ClassToInstanceMap)(this.b)).get(((java.lang.Object)(p0)))))));
}


public com.moon.module.Module a(com.moon.module.Module p0) {
((java.util.Map)(this.a)).remove(((java.lang.Object)(((java.lang.String)(((com.moon.module.Module)(p0)).getName())).toLowerCase())));
    ((com.google.common.collect.ClassToInstanceMap)(this.b)).remove(((java.lang.Object)(((java.lang.Object)(p0)).getClass())));
    return p0;
}

}
