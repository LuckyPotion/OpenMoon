package moom;


public class Fg extends net.minecraft.world.biome.WorldChunkManager {

private final net.minecraft.world.biome.BiomeGenBase g;

private final float h;

private static final long j;

public Fg(net.minecraft.world.biome.BiomeGenBase p0, float p1) {
super();
    this.g = p0;
    this.h = p1;
}


static {
j = (moom._c.a(783698522699801007L, -460407813258546495L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(59757946637454L);
}


public net.minecraft.world.biome.BiomeGenBase[] b(net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4) {
net.minecraft.world.biome.BiomeGenBase[] forwardValue1941_22_0;
    net.minecraft.world.biome.BiomeGenBase[] forwardValue1941_32_0;
    net.minecraft.world.biome.BiomeGenBase[] spill1941_0;
    net.minecraft.world.biome.BiomeGenBase[] spill1941_1;
    long life6_3;
    java.lang.String life8_5;
    forward_join_32: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.Fg.j ^ 117213564288785L);
    life8_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1941_0 = p0;
    if (!((life8_5 == null))) {
        forwardValue1941_22_0 = spill1941_0;
        break forward_join_22;
    }
    if (!((spill1941_0 != null))) {
        break forward_join_18;
    }
    spill1941_1 = p0;
    if (!((life8_5 == null))) {
        forwardValue1941_32_0 = spill1941_1;
        break forward_join_32;
    }
    if (!(((spill1941_1).length < (p3 * p4)))) {
        break forward_join_23;
    }
    }
    forwardValue1941_22_0 = new net.minecraft.world.biome.BiomeGenBase[(p3 * p4)];
    }
    p0 = forwardValue1941_22_0;
    }
    java.util.Arrays.fill(((java.lang.Object[])(p0)), ((int)(0)), ((int)((p3 * p4))), ((java.lang.Object)(this.g)));
    forwardValue1941_32_0 = p0;
    }
    return forwardValue1941_32_0;
}


public moom.DT a(int p0, int p1, int p2, java.util.List<net.minecraft.world.biome.BiomeGenBase> p3, java.util.Random p4) {
long local6 = (moom.Fg.j ^ 133464364067426L);
    return (((java.util.List)(p3)).contains(((java.lang.Object)(this.g))) ? new moom.DT(((p0 - p2) + ((java.util.Random)(p4)).nextInt(((int)(((p2 * 2) + 1))))), 0, ((p1 - p2) + ((java.util.Random)(p4)).nextInt(((int)(((p2 * 2) + 1)))))) : null);
}


public boolean a(int p0, int p1, int p2, java.util.List<net.minecraft.world.biome.BiomeGenBase> p3) {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(p3)).contains(((java.lang.Object)(this.g))))) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.biome.BiomeGenBase a(moom.DT p0) {
return this.g;
}


public net.minecraft.world.biome.BiomeGenBase[] a(net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4) {
net.minecraft.world.biome.BiomeGenBase[] forwardValue1940_22_0;
    net.minecraft.world.biome.BiomeGenBase[] forwardValue1940_32_0;
    net.minecraft.world.biome.BiomeGenBase[] spill1940_0;
    net.minecraft.world.biome.BiomeGenBase[] spill1940_1;
    long life6_3;
    java.lang.String life8_5;
    forward_join_32: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.Fg.j ^ 68217167846744L);
    life8_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1940_0 = p0;
    if (!((life8_5 == null))) {
        forwardValue1940_22_0 = spill1940_0;
        break forward_join_22;
    }
    if (!((spill1940_0 != null))) {
        break forward_join_18;
    }
    spill1940_1 = p0;
    if (!((life8_5 == null))) {
        forwardValue1940_32_0 = spill1940_1;
        break forward_join_32;
    }
    if (!(((spill1940_1).length < (p3 * p4)))) {
        break forward_join_23;
    }
    }
    forwardValue1940_22_0 = new net.minecraft.world.biome.BiomeGenBase[(p3 * p4)];
    }
    p0 = forwardValue1940_22_0;
    }
    java.util.Arrays.fill(((java.lang.Object[])(p0)), ((int)(0)), ((int)((p3 * p4))), ((java.lang.Object)(this.g)));
    forwardValue1940_32_0 = p0;
    }
    return forwardValue1940_32_0;
}


public float[] a(float[] p0, int p1, int p2, int p3, int p4) {
float[] forwardValue1939_22_0;
    float[] forwardValue1939_32_0;
    float[] spill1939_0;
    float[] spill1939_1;
    long life6_3;
    java.lang.String life8_5;
    forward_join_32: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.Fg.j ^ 98385045534318L);
    life8_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1939_0 = p0;
    if (!((life8_5 == null))) {
        forwardValue1939_22_0 = spill1939_0;
        break forward_join_22;
    }
    if (!((spill1939_0 != null))) {
        break forward_join_18;
    }
    spill1939_1 = p0;
    if (!((life8_5 == null))) {
        forwardValue1939_32_0 = spill1939_1;
        break forward_join_32;
    }
    if (!(((spill1939_1).length < (p3 * p4)))) {
        break forward_join_23;
    }
    }
    forwardValue1939_22_0 = new float[(p3 * p4)];
    }
    p0 = forwardValue1939_22_0;
    }
    java.util.Arrays.fill(((float[])(p0)), ((int)(0)), ((int)((p3 * p4))), ((float)(this.h)));
    forwardValue1939_32_0 = p0;
    }
    return forwardValue1939_32_0;
}


public net.minecraft.world.biome.BiomeGenBase[] a(net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4, boolean p5) {
return ((moom.Fg)(this)).b(((net.minecraft.world.biome.BiomeGenBase[])(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
