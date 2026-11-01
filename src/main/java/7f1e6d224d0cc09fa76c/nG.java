package com.moon;


public class nG {

private static final net.minecraft.client.renderer.culling.Frustum a;

private static final long b;

public nG() {
super();
}


static {
b = (moom._c.a(-6947494600573926612L, 6615117190514531480L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(44389008646900L);
    a = new net.minecraft.client.renderer.culling.Frustum();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static boolean a(moom.CA p0) {
java.lang.Object local1 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__r3();
    ((net.minecraft.client.renderer.culling.Frustum)(com.moon.nG.a)).a(((double)(((net.minecraft.entity.Entity)(local1)).n)), ((double)(((net.minecraft.entity.Entity)(local1)).o)), ((double)(((net.minecraft.entity.Entity)(local1)).p)));
    return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.renderer.culling.Frustum)(com.moon.nG.a)).a(((moom.CA)(p0))))) != 0);
}


public static boolean a(net.minecraft.entity.Entity p0) {
int forwardValue1029_18_0;
    int forwardValue1029_20_0;
    boolean spill1029_0;
    boolean spill1029_1;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.nG.b ^ 108209351752865L);
    life3_5 = ((com.moon.aO.c()) ? 1 : 0);
    spill1029_0 = com.moon.nG.a(((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())));
    if (!((life3_5 != 0))) {
        forwardValue1029_18_0 = ((spill1029_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill1029_0))) {
        break forward_join_17;
    }
    spill1029_1 = ((net.minecraft.entity.Entity)(p0)).ac;
    if (!((life3_5 != 0))) {
        forwardValue1029_18_0 = ((spill1029_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill1029_1)) {
        break forward_join_19;
    }
    }
    forwardValue1029_18_0 = 1;
    }
    forwardValue1029_20_0 = forwardValue1029_18_0;
    break forward_join_20;
    }
    forwardValue1029_20_0 = 0;
    }
    return ((forwardValue1029_20_0) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
