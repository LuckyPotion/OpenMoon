package moom;


public final class EK {

private final long a;

private final net.minecraft.world.WorldSettings$GameType b;

private final boolean c;

private final boolean d;

private final net.minecraft.world.WorldType e;

private boolean f;

private boolean g;

private java.lang.String h;

public EK(long p0, net.minecraft.world.WorldSettings$GameType p1, boolean p2, boolean p3, net.minecraft.world.WorldType p4) {
super();
    this.h = "";
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
}


public EK(net.minecraft.world.storage.WorldInfo p0) {
this((p0).a__Long(), (p0).a__bE(), (p0).c__Boolean(), (p0).d__Boolean(), (p0).a__EL());
}


public moom.EK b() {
this.f = ((boolean)(true));
    return this;
}


public boolean b__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public boolean c() {
return ((((this.c) ? 1 : 0)) != 0);
}


public boolean d() {
return ((((this.f) ? 1 : 0)) != 0);
}


public static net.minecraft.world.WorldSettings$GameType a(int p0) {
return net.minecraft.world.WorldSettings$GameType.a(((int)(p0)));
}


public net.minecraft.world.WorldType a__EL() {
return this.e;
}


public java.lang.String a__String() {
return this.h;
}


public moom.EK a__EK() {
this.g = ((boolean)(true));
    return this;
}


public moom.EK a(java.lang.String p0) {
this.h = ((java.lang.String)(p0));
    return this;
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


public long a() {
return this.a;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.b;
}

}
