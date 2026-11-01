package com.moon.scripting.api.types;


public class Potion {

public int id;

public java.lang.String name;

public int duration;

public int amplifier;

public boolean bad_effect;

public int color;

public Potion() {
super();
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite634_6(this.id, this.name, this.duration, this.amplifier, this.bad_effect, this.color);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite634_6(int a0, java.lang.String a1, int a2, int a3, boolean a4, int a5) throws E;
}
