package com.moon;


public class e0 implements java.util.function.Consumer<java.lang.Void> {

private static int b;

public e0() {
super();
}


static {
if ((com.moon.e0.c() == 0)) {
        com.moon.e0.b(((int)(46)));
    }
}


public static int b() {
return com.moon.e0.b;
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static int c() {
int local0 = com.moon.e0.b();
    if ((local0 == 0)) {
        return 11;
    }
    return 0;
}


public void a(java.lang.Void p0) {
((com.moon.eY)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__eY())).a();
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void accept__sourceBridge_f286d6bd4c(java.lang.Object p0) {
((com.moon.e0)(this)).a(((java.lang.Void)(((java.lang.Void)(p0)))));
}


public void accept(java.lang.Void __bridgeParam0) { this.accept__sourceBridge_f286d6bd4c(((java.lang.Object)(__bridgeParam0))); }
}
