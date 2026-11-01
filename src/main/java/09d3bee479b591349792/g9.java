package com.moon;


public abstract class g9 {

protected static final net.minecraft.client.Minecraft a;

private final com.moon.module.impl.ESP b;

protected com.moon.hW c;

protected com.moon.hW d;

protected com.moon.hW e;

protected com.moon.hW f;

protected float g;

public g9(com.moon.module.impl.ESP p0) {
super();
    this.g = 0x1.0000000000000p-1f;
    this.b = p0;
}


static {
a = net.minecraft.client.Minecraft.a__fM();
}


public com.moon.hW b() {
return this.d;
}


public com.moon.g9 b(com.moon.hW p0) {
this.d = ((com.moon.hW)(p0));
    return this;
}


public com.moon.hW c() {
return this.e;
}


public com.moon.g9 c(com.moon.hW p0) {
this.e = ((com.moon.hW)(p0));
    return this;
}


public com.moon.g9 d(com.moon.hW p0) {
this.f = ((com.moon.hW)(p0));
    return this;
}


public com.moon.hW d() {
return this.f;
}


public float a() {
return this.g;
}


public abstract void a(net.minecraft.entity.Entity p0);

public abstract boolean a__Boolean(net.minecraft.entity.Entity p0);

public com.moon.g9 a(com.moon.hW p0) {
this.c = ((com.moon.hW)(p0));
    return this;
}


public com.moon.g9 a(float p0) {
this.g = ((float)(p0));
    return this;
}


public com.moon.module.impl.ESP a__lV() {
return this.b;
}


public com.moon.hW a__hW() {
return this.c;
}

}
