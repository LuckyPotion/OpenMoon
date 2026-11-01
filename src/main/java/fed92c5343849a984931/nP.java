package com.moon;


public class nP {

private static final long a;

public nP() {
super();
}


static {
a = (moom._c.a(8998925294431343976L, 5223141871211244729L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(119421535977356L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.DR a(float p0, float p1, float p2) {
int forwardValue1064_13_0;
    float forwardValue1064_20_0;
    boolean spill1064_0;
    boolean spill1064_1;
    long life3_3;
    moom.ir life6_6;
    int life5_7;
    float life7_23;
    forward_join_62: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life3_3 = (com.moon.nP.a ^ 120683646480851L);
    spill1064_0 = com.moon.aO.c();
    life6_6 = com.moon.nS.a();
    life5_7 = ((spill1064_0) ? 1 : 0);
    spill1064_1 = moom.BU.ap();
    if (!((life5_7 != 0))) {
        forwardValue1064_13_0 = ((spill1064_1) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill1064_1)) {
        break forward_join_19;
    }
    forwardValue1064_13_0 = moom.MP.m;
    }
    forwardValue1064_20_0 = (((float) forwardValue1064_13_0) / ((float) ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).G));
    break forward_join_20;
    }
    forwardValue1064_20_0 = 0x1.0p0f;
    }
    life7_23 = forwardValue1064_20_0;
    if (!(org.lwjgl.util.glu.GLU.gluProject(((float)(p0)), ((float)(p1)), ((float)(p2)), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.b)), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.c)), ((java.nio.IntBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.a)), ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d))))) {
        break forward_join_62;
    }
    return new moom.DR(((double) ((((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d)).get(((int)(0))) / ((float) ((moom.ir)(life6_6)).c())) / life7_23)), ((double) (((float) ((moom.ir)(life6_6)).b__Int()) - ((((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d)).get(((int)(1))) / ((float) ((moom.ir)(life6_6)).c())) / life7_23))), ((double) ((java.nio.FloatBuffer)(net.minecraft.client.renderer.ActiveRenderInfo.d)).get(((int)(2)))));
    }
    return null;
}


public static org.lwjgl.util.vector.Vector4f a(moom.DR p0) {
moom.DR forwardValue1065_36_0;
    int forwardValue1065_46_0;
    boolean spill1065_0;
    moom.DR spill1065_1;
    int spill1065_2;
    long life1_3;
    net.minecraft.client.renderer.entity.RenderManager life4_7;
    org.lwjgl.util.vector.Vector4f life5_9;
    int life3_10;
    moom.DR life0_30;
    forward_join_99: {
    forward_join_46: {
    forward_join_36: {
    life1_3 = (com.moon.nP.a ^ 97827808865807L);
    spill1065_0 = com.moon.aO.b__Boolean();
    life4_7 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    life5_9 = null;
    life3_10 = ((spill1065_0) ? 1 : 0);
    life0_30 = com.moon.nP.a(((float)(((float) (((moom.DR)(p0)).a - ((net.minecraft.client.renderer.entity.RenderManager)(life4_7)).a())))), ((float)(((float) (((moom.DR)(p0)).b - ((net.minecraft.client.renderer.entity.RenderManager)(life4_7)).b())))), ((float)(((float) (((moom.DR)(p0)).c - ((net.minecraft.client.renderer.entity.RenderManager)(life4_7)).c())))));
    spill1065_1 = life0_30;
    if (!((life3_10 == 0))) {
        forwardValue1065_36_0 = spill1065_1;
        break forward_join_36;
    }
    if (!((spill1065_1 != null))) {
        break forward_join_99;
    }
    forwardValue1065_36_0 = life0_30;
    }
    spill1065_2 = recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(forwardValue1065_36_0)).c)), ((double)(0x0.0p0d)));
    if (!((life3_10 == 0))) {
        forwardValue1065_46_0 = spill1065_2;
        break forward_join_46;
    }
    if (!((spill1065_2 >= 0))) {
        break forward_join_99;
    }
    forwardValue1065_46_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DR)(life0_30)).c)), ((double)(0x1.0p0d)));
    }
    if (!((forwardValue1065_46_0 <= 0))) {
        break forward_join_99;
    }
    life5_9 = new org.lwjgl.util.vector.Vector4f(((float) ((moom.DR)(life0_30)).a), ((float) ((moom.DR)(life0_30)).b), ((float) ((moom.DR)(life0_30)).c), ((float) ((moom.DR)(life0_30)).b));
    ((org.lwjgl.util.vector.Vector4f)(life5_9)).x = ((float)(((float) java.lang.Math.min(((double)(((moom.DR)(life0_30)).a)), ((double)(((double) ((org.lwjgl.util.vector.Vector4f)(life5_9)).x)))))));
    ((org.lwjgl.util.vector.Vector4f)(life5_9)).y = ((float)(((float) java.lang.Math.min(((double)(((moom.DR)(life0_30)).b)), ((double)(((double) ((org.lwjgl.util.vector.Vector4f)(life5_9)).y)))))));
    ((org.lwjgl.util.vector.Vector4f)(life5_9)).z = ((float)(((float) java.lang.Math.max(((double)(((moom.DR)(life0_30)).a)), ((double)(((double) ((org.lwjgl.util.vector.Vector4f)(life5_9)).z)))))));
    ((org.lwjgl.util.vector.Vector4f)(life5_9)).w = ((float)(((float) java.lang.Math.max(((double)(((moom.DR)(life0_30)).b)), ((double)(((double) ((org.lwjgl.util.vector.Vector4f)(life5_9)).w)))))));
    }
    return life5_9;
}

}
