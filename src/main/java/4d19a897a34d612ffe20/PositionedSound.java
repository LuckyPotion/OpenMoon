package net.minecraft.client.audio;


public abstract class PositionedSound implements net.minecraft.client.audio.ISound {

protected final moom.DD a;

protected float b;

protected float c;

protected float d;

protected float e;

protected float f;

protected boolean g;

protected int h;

protected net.minecraft.client.audio.ISound$AttenuationType i;

protected PositionedSound(moom.DD p0) {
super();
    this.b = 0x1.0000000000000p+0f;
    this.c = 0x1.0000000000000p+0f;
    this.g = false;
    this.h = 0;
    this.i = net.minecraft.client.audio.ISound$AttenuationType.LINEAR;
    this.a = p0;
}


public float b() {
return this.c;
}


public float e() {
return this.f;
}


public float c() {
return this.d;
}


public float d() {
return this.e;
}


public net.minecraft.client.audio.ISound$AttenuationType a__au() {
return this.i;
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public moom.DD a__DD() {
return this.a;
}


public float a() {
return this.b;
}


public int a__Int() {
return this.h;
}

}
