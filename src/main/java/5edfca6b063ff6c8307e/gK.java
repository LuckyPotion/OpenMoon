package com.moon;


public abstract class gK {

protected static final net.minecraft.client.Minecraft a;

public gK() {
super();
}


static {
a = net.minecraft.client.Minecraft.a__fM();
}


public abstract void a();

protected boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.gK.a)).W)).ap)).a__Boolean())) != 0);
}


public abstract void a(com.moon.event.MoveEvent p0);

public abstract void a(com.moon.event.MotionEvent p0);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
