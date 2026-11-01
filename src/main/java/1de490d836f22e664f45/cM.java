package com.moon;


public abstract class cM {

private static net.minecraft.entity.Entity[] b;

public cM() {
super();
}


static {
if ((com.moon.cM.b() == null)) {
        com.moon.cM.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));
    }
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.cM.b;
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.cM.b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public abstract java.lang.String a();
}
