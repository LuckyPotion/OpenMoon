package com.moon;


public class ot {

private java.util.Map<java.lang.Byte, com.moon.ol> a;

private static long b;

public ot() { super(); }


private static void __sourceConstructorBody_cf81994f0093a79a(com.moon.ot receiver) throws Throwable {

long local1_life1 = (com.moon.ot.b ^ 82315141049211L);

    int[] __sourceSpill276_3 = com.moon.ol.b();

    com.moon.ot.__sourceConstructorInit_cf81994f0093a79a_0(((com.moon.ot)(receiver)));

    int[] local3_life5 = __sourceSpill276_3;

    ((com.moon.ot)(receiver)).a = ((java.util.Map)(new java.util.HashMap()));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.ol.b(((int[])(new int[4])));

    }

    return;

}



static {
com.moon.ot.b = (moom._c.a(5299792768011941109L, 7363472315770097660L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(16610932774804L);
}

private static native <E extends Throwable> void __sourceConstructorInit_cf81994f0093a79a_0(com.moon.ot a0) throws E;

private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.ol a(byte p0) {
return ((com.moon.ol)(((java.util.Map)(this.a)).get(((java.lang.Object)(java.lang.Byte.valueOf(((byte)(p0))))))));
}


public void a(com.moon.ol p0) {
long local2 = (com.moon.ot.b ^ 741567291948L);
    int[] spill2598_0 = com.moon.ol.b();
    ((java.util.Map)(this.a)).put(((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((com.moon.ol)(p0)).a()))))), ((java.lang.Object)(p0)));
    int[] local4 = spill2598_0;
    if ((local4 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}

}
