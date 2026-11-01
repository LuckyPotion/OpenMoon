package com.moon;


public class e2<T extends com.moon.module.Module> {

protected static final net.minecraft.client.Minecraft a;

private T b;

private final java.lang.Class<? extends com.moon.module.Module> c;

private static int[] d;

private static final long p;

public e2(java.lang.Class<? extends com.moon.module.Module> p0) {
super();
    this.c = p0;
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(3308169068181002449L)), ((long)(-2187500886003439991L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(263699256619586L)))));
    int[] __sourceSpill304_7 = new int[1];
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    com.moon.e2.b(((int[])(__sourceSpill304_7)));
}


public static int[] b__ArrayInt() {
return com.moon.e2.d;
}


public void b() {
return;
}


public static void b(int[] p0) {
com.moon.e2.d = ((int[])(p0));
    return;
}


public void c() {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public T a() {
((com.moon.e2)(this)).a__Void();
    return this.b;
}


private void a__Void() {
com.moon.e2 forwardValue58_12_0;
    com.moon.e2 spill58_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.e2.p ^ 72769357100421L);
    life3_5 = com.moon.fU.b();
    spill58_0 = this;
    if (!((life3_5 != null))) {
        forwardValue58_12_0 = spill58_0;
        break forward_join_12;
    }
    if (!((((com.moon.e2)(spill58_0)).b == null))) {
        break forward_join_18;
    }
    forwardValue58_12_0 = this;
    }
    ((com.moon.e2)(forwardValue58_12_0)).b = ((com.moon.module.Module)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(this.c)))));
    }
    return;
}

}
