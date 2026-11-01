package com.moon;


public class px extends java.lang.RuntimeException {

private static net.minecraft.entity.Entity[] b;

public px(java.lang.String p0) {
super(p0);
}


static {
if ((com.moon.px.b() != null)) {
        com.moon.px.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.px.b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.px.b;
}

}
