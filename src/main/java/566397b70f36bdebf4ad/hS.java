package com.moon;


public class hS extends com.moon.hR {

private final int a;

private final int c;

private static final long d;

public hS(int p0, int p1) {
super();
    this.a = p0;
    this.c = p1;
}


static {
d = (moom._c.a(4516812693436712393L, -3970436318892938548L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(99867133333424L);
}


public int b__sourceReturn_8abf5c6871() {
return this.c;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (com.moon.hS.d ^ 108345745604803L);
    java.lang.String spill1218_0 = com.moon.hR.b();
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    java.lang.String local4 = spill1218_0;
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    if ((local4 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
return;
}


public int a() {
return this.a;
}


public void a(moom.yE p0) {
return;
}

}
