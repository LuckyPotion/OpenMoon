package net.minecraft.util;


public class MovingObjectPosition {

private moom.DT a;

public net.minecraft.util.MovingObjectPosition$MovingObjectType b;

public moom.bs c;

public moom.DR d;

public net.minecraft.entity.Entity e;

public MovingObjectPosition(net.minecraft.entity.Entity p0, moom.DR p1) {
super();
    this.b = net.minecraft.util.MovingObjectPosition$MovingObjectType.ENTITY;
    this.e = p0;
    this.d = p1;
}


public MovingObjectPosition(net.minecraft.util.MovingObjectPosition$MovingObjectType p0, moom.DR p1, moom.bs p2, moom.DT p3) {
super();
    this.b = p0;
    this.a = p3;
    this.c = p2;
    this.d = new moom.DR(p1.a, p1.b, p1.c);
}


public MovingObjectPosition(net.minecraft.entity.Entity p0) {
this(p0, new moom.DR(p0.n, p0.o, p0.p));
}


public MovingObjectPosition(moom.DR p0, moom.bs p1) {
this(net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK, p0, p1, moom.DT.f);
}


public MovingObjectPosition(moom.DR p0, moom.bs p1, moom.DT p2) {
this(net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK, p0, p1, p2);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite2055_5(this.b, this.a, this.c, this.d, this.e);
}


public moom.DT a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite2055_5(net.minecraft.util.MovingObjectPosition$MovingObjectType a0, moom.DT a1, moom.bs a2, moom.DR a3, net.minecraft.entity.Entity a4) throws E;
}
