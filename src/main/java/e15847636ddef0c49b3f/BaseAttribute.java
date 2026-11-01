package net.minecraft.entity.ai.attributes;


public abstract class BaseAttribute implements net.minecraft.entity.ai.attributes.IAttribute {

private net.minecraft.entity.ai.attributes.IAttribute a;

private java.lang.String b;

private double c;

private boolean d;

private static long h;

protected BaseAttribute(net.minecraft.entity.ai.attributes.IAttribute p0, java.lang.String p1, double p2) { super(); }


private static void __sourceConstructorBody_a8a069fcd47b1c9f(net.minecraft.entity.ai.attributes.BaseAttribute receiver, net.minecraft.entity.ai.attributes.IAttribute p0, java.lang.String p1, double p2) throws Throwable {

long local5 = (net.minecraft.entity.ai.attributes.BaseAttribute.h ^ 35189554512187L);

    net.minecraft.entity.ai.attributes.BaseAttribute.__sourceConstructorInit_a8a069fcd47b1c9f_0(((net.minecraft.entity.ai.attributes.BaseAttribute)(receiver)));

    ((net.minecraft.entity.ai.attributes.BaseAttribute)(receiver)).a = ((net.minecraft.entity.ai.attributes.IAttribute)(p0));

    ((net.minecraft.entity.ai.attributes.BaseAttribute)(receiver)).b = ((java.lang.String)(p1));

    ((net.minecraft.entity.ai.attributes.BaseAttribute)(receiver)).c = ((double)(p2));

    if ((p1 == null)) {

        throw new java.lang.IllegalArgumentException("Name cannot be null!");

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a8a069fcd47b1c9f_0(net.minecraft.entity.ai.attributes.BaseAttribute a0) throws E;

static {
net.minecraft.entity.ai.attributes.BaseAttribute.h = (moom._c.a(866863921525787973L, 1673659509486156685L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(149934573145725L);
}


public boolean equals(java.lang.Object p0) {
int forwardValue4996_17_0;
    int forwardValue4996_21_0;
    int forwardValue4996_23_0;
    int spill4996_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.ai.attributes.BaseAttribute.h ^ 127114962292575L);
    life4_5 = moom.vB.b();
    spill4996_0 = ((p0 instanceof net.minecraft.entity.ai.attributes.IAttribute) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue4996_17_0 = spill4996_0;
        break forward_join_17;
    }
    if (!((spill4996_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4996_17_0 = ((((java.lang.String)(this.b)).equals(((java.lang.Object)(((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.IAttribute)(p0)))).a__String())))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4996_21_0 = forwardValue4996_17_0;
        break forward_join_21;
    }
    if (!((forwardValue4996_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4996_21_0 = 1;
    }
    forwardValue4996_23_0 = forwardValue4996_21_0;
    break forward_join_23;
    }
    forwardValue4996_23_0 = 0;
    }
    return ((forwardValue4996_23_0) != 0);
}


public int hashCode() {
return ((java.lang.String)(this.b)).hashCode();
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public net.minecraft.entity.ai.attributes.IAttribute a__vG() {
return this.a;
}


public java.lang.String a__String() {
return this.b;
}


public double a() {
return this.c;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public net.minecraft.entity.ai.attributes.BaseAttribute a(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}

}
