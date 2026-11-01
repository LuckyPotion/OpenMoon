package com.moon;


public class dW extends com.moon.event.CancellableEvent {

private com.moon.n5 c;

private boolean e;

private boolean f;

private boolean g;

public dW(com.moon.n5 p0, boolean p1, boolean p2, boolean p3) {
super();
    this.c = p0;
    this.e = p1;
    this.f = p2;
    this.g = p3;
}


public com.moon.dW b(boolean p0) {
this.g = ((boolean)(p0));
    return this;
}


public boolean b__sourceReturn_aae029aa0a() {
return ((((this.e) ? 1 : 0)) != 0);
}


public boolean c() {
return ((((this.f) ? 1 : 0)) != 0);
}


public boolean d() {
return ((((this.g) ? 1 : 0)) != 0);
}


public com.moon.dW a(boolean p0) {
this.f = ((boolean)(p0));
    return this;
}


public com.moon.n5 a__sourceReturn_821aa26535() {
return this.c;
}

}
