package com.moon;


public class hl {

private final boolean a;

private boolean b;

private final java.lang.String c;

private static net.minecraft.entity.Entity[] d;

hl(boolean p0, boolean p1, java.lang.String p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


static {
if ((com.moon.hl.b__Arrayr3() != null)) {
        com.moon.hl.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.hl.d = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public boolean b() {
return ((((this.b) ? 1 : 0)) != 0);
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return com.moon.hl.d;
}


public java.lang.String a__String() {
return this.c;
}


public com.moon.hl a(boolean p0) {
this.b = ((boolean)(p0));
    return this;
}


public static com.moon.hm a() {
return new com.moon.hm();
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}

}
