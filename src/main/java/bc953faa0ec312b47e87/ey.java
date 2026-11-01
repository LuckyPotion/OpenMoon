package com.moon;


public class ey extends com.moon.event.Event {

private com.mojang.authlib.GameProfile a;

private long c;

public ey(com.mojang.authlib.GameProfile p0, long p1) {
super();
    this.a = p0;
    this.c = p1;
}


public long a() {
return this.c;
}


public com.mojang.authlib.GameProfile a__GameProfile() {
return this.a;
}

}
