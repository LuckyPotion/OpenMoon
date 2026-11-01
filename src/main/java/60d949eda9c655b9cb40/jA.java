package com.moon;


public abstract class jA {

public com.moon.jD a;

private static net.minecraft.entity.Entity[] b;

public jA() {
super();
}


static {
if ((com.moon.jA.b() == null)) {
        com.moon.jA.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[2])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.jA.b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.jA.b;
}


public com.moon.jA a(com.moon.jD p0) {
this.a = ((com.moon.jD)(p0));
    return this;
}


public abstract void a__Void();

public abstract void a(float p0, float p1);
}
