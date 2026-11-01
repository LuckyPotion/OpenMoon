package com.moon;


public class gt {

private net.minecraft.entity.player.EntityPlayer a;

private static net.minecraft.entity.Entity[] b;

public gt() {
super();
}


static {
if ((com.moon.gt.b() != null)) {
        com.moon.gt.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.gt.b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.gt.b;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
this.a = ((net.minecraft.entity.player.EntityPlayer)(p0));
    return;
}


public net.minecraft.entity.player.EntityPlayer a() {
return this.a;
}


public void a__Void() {
this.a = ((net.minecraft.entity.player.EntityPlayer)(null));
    return;
}

}
