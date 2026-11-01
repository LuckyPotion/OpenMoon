package com.moon;


public class h_ extends com.moon.h8 {

private static final long a;

public h_() {
super();
}


static {
a = (moom._c.a(-8114958456563075503L, 3555249161831405084L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(52887314012379L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private com.moon.it<?> a(java.lang.Class<?> p0, java.util.Map<java.lang.Class<?>, java.lang.Class<? extends com.moon.it<?>>> p1) throws java.lang.Exception {
java.lang.Object forwardValue341_24_0;
    boolean spill341_0;
    java.lang.Class spill341_1;
    long life3_3;
    java.lang.Class life6_9;
    int life5_10;
    forward_join_24: {
    forward_join_17: {
    life3_3 = (com.moon.h_.a ^ 79112352613425L);
    spill341_0 = __sourceExactCall_edefb84806eefb();
    life6_9 = ((java.lang.Class)(((java.util.Map)(p1)).get(((java.lang.Object)(p0)))));
    life5_10 = ((spill341_0) ? 1 : 0);
    spill341_1 = life6_9;
    if (!((life5_10 != 0))) {
        forwardValue341_24_0 = spill341_1;
        break forward_join_24;
    }
    if (!((spill341_1 == null))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue341_24_0 = ((java.lang.reflect.Constructor)(((java.lang.Class)(life6_9)).getDeclaredConstructor(((java.lang.Class[])(new java.lang.Class[0]))))).newInstance(((java.lang.Object[])(new java.lang.Object[0])));
    }
    return ((com.moon.it)(forwardValue341_24_0));
}


public <T> void a(T p0, com.moon.ie p1, java.lang.reflect.Field p2, java.lang.Class<?> p3, java.lang.Class<?> p4, java.util.Map<java.lang.Class<? extends com.moon.ie>, com.moon.h8> p5, java.util.Map<java.lang.Class<?>, java.lang.Class<? extends com.moon.it<?>>> p6, java.util.ArrayList p7) throws java.lang.Exception {
long local9 = (com.moon.h_.a ^ 115301978914470L);
    java.lang.Object local11 = ((com.moon.ps)(p1));
    java.lang.Object local12 = this.a(((java.lang.Class)(p4)), ((java.util.Map)(p6)));
    if ((local12 != null)) {
        ((java.util.ArrayList)(p7)).add(((java.lang.Object)(((com.moon.it)(local12)).a__Object(((java.lang.String)(((com.moon.ps)(local11)).i()))))));
    }
    return;
}


public <T> void a(T p0, com.moon.ie p1, java.lang.reflect.Field p2, java.lang.Class<?> p3, java.lang.Class<?> p4, java.util.Map<java.lang.Class<? extends com.moon.ie>, com.moon.h8> p5, java.util.Map<java.lang.Class<?>, java.lang.Class<? extends com.moon.it<?>>> p6) throws java.lang.Exception {
long local8 = (com.moon.h_.a ^ 93873764689673L);
    java.lang.Object local10 = ((com.moon.ps)(p1));
    java.lang.Object local11 = this.a(((java.lang.Class)(p3)), ((java.util.Map)(p6)));
    if ((local11 != null)) {
        ((java.lang.reflect.Field)(p2)).set(((java.lang.Object)(p0)), ((java.lang.Object)(((com.moon.it)(local11)).a__Object(((java.lang.String)(((com.moon.ps)(local10)).i()))))));
    }
    return;
}


private static native boolean __sourceExactCall_edefb84806eefb();
}
