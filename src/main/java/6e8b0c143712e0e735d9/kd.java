package com.moon;


public abstract class kd<T extends moom.yK> {

protected static final net.minecraft.client.Minecraft a;

private final java.lang.Class<T> b;

public kd(java.lang.Class<T> p0) {
super();
    this.b = p0;
}


static {
com.moon.kd.a = net.minecraft.client.Minecraft.a__fM();
}


public abstract void a(org.luaj.vm2.LuaTable p0, T p1);

public abstract org.luaj.vm2.LuaTable a(T p0);
}
