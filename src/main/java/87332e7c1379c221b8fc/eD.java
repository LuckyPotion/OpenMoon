package com.moon;


public class eD extends com.moon.event.Event {

private double a;

private net.minecraft.entity.Entity c;

public eD(double p0, net.minecraft.entity.Entity p1) {
super();
    this.a = p0;
    this.c = p1;
}


public double a() {
return this.a;
}


public com.moon.eD a(net.minecraft.entity.Entity p0) {
this.c = ((net.minecraft.entity.Entity)(p0));
    return this;
}


public com.moon.eD a(double p0) {
this.a = ((double)(p0));
    return this;
}


public net.minecraft.entity.Entity a__r3() {
return this.c;
}

}
