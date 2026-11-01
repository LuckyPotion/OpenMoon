package com.moon.event;


public class MotionEvent extends com.moon.event.Event {

private static final net.minecraft.client.Minecraft a;

private double motionX;

private double motionY;

private double motionZ;

private float f;

private float g;

private float h;

private static final long i;

public MotionEvent(double p0, double p1, double p2, float p3, float p4, float p5) {
super();
    this.motionX = p0;
    this.motionY = p1;
    this.motionZ = p2;
    this.f = p3;
    this.g = p4;
    this.h = p5;
}


static {
i = (moom._c.a(6696475002908995929L, 3871872069009406897L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(142143547756685L);
    a = net.minecraft.client.Minecraft.a__fM();
}


public com.moon.event.MotionEvent b(float p0) {
this.g = ((float)(p0));
    return this;
}


public float b__sourceReturn_bc607678b6() {
return this.g;
}


public com.moon.event.MotionEvent setMotionY(double p0) {
this.motionY = ((double)(p0));
    return this;
}


public double getMotionY() {
return this.motionY;
}


public com.moon.event.MotionEvent c(float p0) {
this.h = ((float)(p0));
    return this;
}


public com.moon.event.MotionEvent setMotionZ(double p0) {
this.motionZ = ((double)(p0));
    return this;
}


public double getMotionZ() {
return this.motionZ;
}


public float c() {
return this.h;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public double getMotionX() {
return this.motionX;
}


public float a() {
return this.f;
}


public com.moon.event.MotionEvent setMotionX(double p0) {
this.motionX = ((double)(p0));
    return this;
}


public void applyMotionSpeed(double p0) {
long local3 = (com.moon.event.MotionEvent.i ^ 37340366966926L);
    boolean spill886_0 = com.moon.event.MoveEvent.c();
    this.motionX = ((double)((((double) (-moom.Dr.a(((float)(com.moon.nJ.a(((float)(this.h)), ((float)(this.f)), ((float)(this.g)))))))) * p0)));
    this.motionZ = ((double)((((double) moom.Dr.b(((float)(com.moon.nJ.a(((float)(this.h)), ((float)(this.f)), ((float)(this.g))))))) * p0)));
    boolean local5 = spill886_0;
    if ((!local5)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public com.moon.event.MotionEvent a(float p0) {
this.f = ((float)(p0));
    return this;
}

}
