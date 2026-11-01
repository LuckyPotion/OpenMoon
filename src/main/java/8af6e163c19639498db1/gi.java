package com.moon;


public class gi implements com.moon.gf {

private static net.minecraft.entity.Entity[] b;

public gi() {
super();
}


static {
if ((com.moon.gi.b() != null)) {
        com.moon.gi.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.gi.b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.gi.b;
}


public java.util.Comparator<net.minecraft.entity.Entity> a() {
return java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction)(__sourceIntrinsic_7226b1c76b43_originalDynamicSite383_0())));
}


private static double lambda$createComparator$0(net.minecraft.entity.Entity p0) {
return ((double) ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))).b__sourceReturn_bc607678b6());
}


private static native <E extends Throwable> java.util.function.ToDoubleFunction __sourceIntrinsic_7226b1c76b43_originalDynamicSite383_0() throws E;
}
