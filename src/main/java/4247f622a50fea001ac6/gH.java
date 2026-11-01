package com.moon;


public abstract class gH {

protected static final net.minecraft.client.Minecraft a;

protected com.moon.module.impl.ScaffoldWalk b;

public gH() {
super();
}


static {
a = net.minecraft.client.Minecraft.a__fM();
}


public abstract void b();

public abstract void c();

public abstract void a();

public com.moon.gH a(com.moon.module.impl.ScaffoldWalk p0) {
this.b = ((com.moon.module.impl.ScaffoldWalk)(p0));
    return this;
}


public abstract void a(com.moon.event.MotionEvent p0);

public abstract void a(com.moon.event.MoveEvent p0);

public abstract void a(com.moon.event.PacketEvent p0);
}
