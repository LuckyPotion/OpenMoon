package com.moon;


public class gh implements com.moon.gf {

private static final long b;

public gh() {
super();
}


static {
b = (moom._c.a(1933269158349013201L, 108948090501144453L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(59103382581239L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private double a(net.minecraft.entity.EntityLivingBase p0) {
double forwardValue284_53_0;
    double forwardValue284_53_1;
    double forwardValue284_56_0;
    net.minecraft.entity.Entity[] spill284_0;
    double spill284_1;
    double spill284_2;
    long life2_3;
    moom.DR life5_25;
    double life6_43;
    net.minecraft.entity.Entity[] life4_44;
    forward_join_56: {
    forward_join_55: {
    forward_join_53: {
    life2_3 = (com.moon.gh.b ^ 2274666716578L);
    life5_25 = ((moom.DR)(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(p0)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) (((net.minecraft.entity.EntityLivingBase)(p0)).e__Float() / 0x1.0p1f)))), ((double)(0x0.0p0d))))).c__DR(((moom.DR)(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gh.a)).K)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gh.a)).K)).e__Float()))), ((double)(0x0.0p0d))))));
    spill284_0 = com.moon.gi.b();
    life6_43 = (java.lang.Math.abs(((double)((((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.gh.a)).K)).w) - (java.lang.Math.toDegrees(((double)(java.lang.Math.atan2(((double)(((moom.DR)(life5_25)).c)), ((double)(((moom.DR)(life5_25)).a)))))) - 0x1.68p6d))))) % 0x1.68p8d);
    life4_44 = spill284_0;
    spill284_1 = life6_43;
    spill284_2 = 0x1.68p7d;
    if (!((life4_44 == null))) {
        forwardValue284_53_0 = spill284_1;
        forwardValue284_53_1 = spill284_2;
        break forward_join_53;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill284_1)), ((double)(spill284_2))) > 0))) {
        break forward_join_55;
    }
    forwardValue284_53_0 = 0x1.68p8d;
    forwardValue284_53_1 = life6_43;
    }
    forwardValue284_56_0 = (forwardValue284_53_0 - forwardValue284_53_1);
    break forward_join_56;
    }
    forwardValue284_56_0 = life6_43;
    }
    return forwardValue284_56_0;
}


public java.util.Comparator<net.minecraft.entity.Entity> a() {
return java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction)(__sourceIntrinsic_7226b1c76b43_originalDynamicSite382_0(this))));
}


private double lambda$createComparator$0(net.minecraft.entity.Entity p0) {
return ((com.moon.gh)(this)).a(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))));
}


private static native <E extends Throwable> java.util.function.ToDoubleFunction __sourceIntrinsic_7226b1c76b43_originalDynamicSite382_0(com.moon.gh a0) throws E;
}
