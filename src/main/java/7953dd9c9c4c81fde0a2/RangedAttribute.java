package net.minecraft.entity.ai.attributes;


public class RangedAttribute extends net.minecraft.entity.ai.attributes.BaseAttribute {

private double e;

private double f;

private java.lang.String g;

private static long i;

public RangedAttribute(net.minecraft.entity.ai.attributes.IAttribute p0, java.lang.String p1, double p2, double p3, double p4) { super((net.minecraft.entity.ai.attributes.IAttribute)null, (java.lang.String)null, 0.0D); __sourceHandlerCall_b2ba80fa8964a6386439(this, p0, p1, p2, p3, p4); }

private static native <E extends Throwable> void __sourceHandlerCall_b2ba80fa8964a6386439(net.minecraft.entity.ai.attributes.RangedAttribute a0, net.minecraft.entity.ai.attributes.IAttribute a1, java.lang.String a2, double a3, double a4, double a5) throws E;
private static final class __SourceHandler_b2ba80fa8964a6386439 {

public static void f930(net.minecraft.entity.ai.attributes.RangedAttribute receiver, net.minecraft.entity.ai.attributes.IAttribute p0, java.lang.String p1, double p2, double p3, double p4) throws Throwable {
    long local9_life1 = (__fieldRead930_0() ^ 33604481899303L);
    __directSuperInit930_2(receiver, p0, p1, p2);
    __fieldWrite930_3(receiver, p3);
    __fieldWrite930_4(receiver, p4);
    if ((p3 > p4)) {
        throw new java.lang.IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
    }
    if ((p2 < p3)) {
        throw new java.lang.IllegalArgumentException("Default value cannot be lower than minimum value!");
    }
    if ((p2 > p4)) {
        throw new java.lang.IllegalArgumentException("Default value cannot be bigger than maximum value!");
    }
    return;
}
private static native long __fieldRead930_0();
private static native void __directSuperInit930_2(net.minecraft.entity.ai.attributes.RangedAttribute a0, net.minecraft.entity.ai.attributes.IAttribute a1, java.lang.String a2, double a3);
private static native void __fieldWrite930_3(net.minecraft.entity.ai.attributes.RangedAttribute a0, double a1);
private static native void __fieldWrite930_4(net.minecraft.entity.ai.attributes.RangedAttribute a0, double a1);

}


static {
net.minecraft.entity.ai.attributes.RangedAttribute.i = (moom._c.a(-7179624885421682462L, 7330938444166157964L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(96539169752656L);
}


private static java.lang.IllegalArgumentException b(java.lang.IllegalArgumentException p0) {
return p0;
}


public java.lang.String b() {
return this.g;
}


public net.minecraft.entity.ai.attributes.RangedAttribute a(java.lang.String p0) {
this.g = ((java.lang.String)(p0));
    return this;
}


public double a(double p0) {
p0 = moom.Dr.a(((double)(p0)), ((double)(this.e)), ((double)(this.f)));
    return p0;
}

}
