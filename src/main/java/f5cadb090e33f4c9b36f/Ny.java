package moom;


public class Ny extends moom.Nq {

private boolean e;

private java.nio.FloatBuffer f;

private static final long h;

public Ny(java.lang.String p0) {
super(p0);
}


static {
h = (moom._c.a(-7105578893847556024L, -1773214399773508296L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(90742883847611L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0) {
return;
}


protected void d() {
this.f = ((java.nio.FloatBuffer)(null));
    return;
}


public float a(int p0, int p1) {
moom.Ny forwardValue2884_14_0;
    int forwardValue2884_27_0;
    int forwardValue2884_29_0;
    moom.Ny spill2884_0;
    boolean spill2884_1;
    long life3_3;
    java.lang.String life5_5;
    int life6_39;
    forward_join_29: {
    forward_join_27: {
    forward_join_24: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (moom.Ny.h ^ 36120372182324L);
    life5_5 = moom.Nq.b__String();
    spill2884_0 = this;
    if (!((life5_5 != null))) {
        forwardValue2884_14_0 = spill2884_0;
        break forward_join_14;
    }
    if (!((((moom.Ny)(spill2884_0)).f == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue2884_14_0 = this;
    }
    spill2884_1 = ((moom.Ny)(forwardValue2884_14_0)).e;
    if (!((life5_5 != null))) {
        forwardValue2884_27_0 = ((spill2884_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill2884_1)) {
        break forward_join_24;
    }
    forwardValue2884_29_0 = ((p1 * 4) + p0);
    break forward_join_29;
    }
    forwardValue2884_27_0 = (p0 * 4);
    }
    forwardValue2884_29_0 = (forwardValue2884_27_0 + p1);
    }
    life6_39 = forwardValue2884_29_0;
    return ((java.nio.FloatBuffer)(this.f)).get(((int)(life6_39)));
}


public void a(boolean p0, java.nio.FloatBuffer p1) {
int forwardValue2885_20_0;
    java.lang.String spill2885_0;
    int spill2885_1;
    long life3_3;
    java.lang.String life5_11;
    int life6_14;
    forward_join_25: {
    forward_join_20: {
    life3_3 = (moom.Ny.h ^ 130477292350815L);
    this.e = ((boolean)(p0));
    spill2885_0 = moom.Nq.b__String();
    this.f = ((java.nio.FloatBuffer)(p1));
    life5_11 = spill2885_0;
    life6_14 = ((moom.Ny)(this)).b();
    spill2885_1 = life6_14;
    if (!((life5_11 != null))) {
        forwardValue2885_20_0 = spill2885_1;
        break forward_join_20;
    }
    if (!((spill2885_1 >= 0))) {
        break forward_join_25;
    }
    forwardValue2885_20_0 = life6_14;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniformMatrix4ARB(((int)(forwardValue2885_20_0)), ((boolean)(p0)), ((java.nio.FloatBuffer)(p1)));
    this.e();
    }
    return;
}

}
