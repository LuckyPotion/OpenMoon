package com.moon;


public class o6 implements com.viaversion.viaversion.api.platform.PlatformTask<java.util.concurrent.Future<?>> {

private java.util.concurrent.Future<?> a;

private static long b;

public o6(java.util.concurrent.Future<?> p0) { super(); }


private static void __sourceConstructorBody_54c7a50e18a192a6(com.moon.o6 receiver, java.util.concurrent.Future p0) throws Throwable {

java.lang.String spill210008_0;

    long life2_3;

    java.lang.String life4_10;

    life2_3 = (com.moon.o6.b ^ 107825342597656L);

    com.moon.o6.__sourceConstructorInit_54c7a50e18a192a6_0(((com.moon.o6)(receiver)));

    spill210008_0 = com.moon.aK.b();

    ((com.moon.o6)(receiver)).a = ((java.util.concurrent.Future)(p0));

    life4_10 = spill210008_0;

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.aK.b(((java.lang.String)("vtz2o")));

    } else {

        

    }

    return;

}



static {
com.moon.o6.b = (moom._c.a(-7058304108686644432L, -6476180445251053176L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(158995998742894L);
}

private static native <E extends Throwable> void __sourceConstructorInit_54c7a50e18a192a6_0(com.moon.o6 a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.concurrent.Future<?> a() {
return this.a;
}


public void cancel() {
((java.util.concurrent.Future)(this.a)).cancel(((boolean)(false)));
    return;
}


public java.lang.Object getObject__sourceBridge_0502b11602() {
return ((com.moon.o6)(this)).a();
}

public java.util.concurrent.Future<?> getObject() { return ((java.util.concurrent.Future<?>)(this.getObject__sourceBridge_0502b11602())); }
}
