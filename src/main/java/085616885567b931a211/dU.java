package com.moon;


public class dU extends com.moon.event.CancellableEvent {

private final net.minecraft.entity.Entity c;

private float e;

private boolean f;

public dU(net.minecraft.entity.Entity p0, float p1, boolean p2) {
super();
    this.c = p0;
    this.e = p1;
    this.f = p2;
}


public boolean b__sourceReturn_aae029aa0a() {
return ((((this.f) ? 1 : 0)) != 0);
}


public net.minecraft.entity.Entity a__r3() {
return this.c;
}


public com.moon.dU a(boolean p0) {
this.f = ((boolean)(p0));
    return this;
}


public com.moon.dU a(float p0) {
this.e = ((float)(p0));
    return this;
}


public float a__sourceReturn_bc607678b6() {
return this.e;
}

}
