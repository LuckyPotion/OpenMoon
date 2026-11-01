package moom;


public class Ms {

private final java.nio.IntBuffer a;

private final int b;

private final boolean[] c;

private final boolean[] d;

private static final long e;

public Ms(java.nio.IntBuffer p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
    this.c = new boolean[(p0).capacity()];
    this.d = new boolean[(p0).capacity()];
}


static {
e = (moom._c.a(-7965544952653005384L, 2593618329021830828L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(20088542149812L);
}


public int b(int p0) {
moom.Ms forwardValue2752_16_0;
    int forwardValue2752_16_1;
    int forwardValue2752_16_2;
    moom.Ms forwardValue2752_17_0;
    int forwardValue2752_17_1;
    moom.Ms forwardValue2752_18_0;
    int forwardValue2752_18_1;
    int forwardValue2752_18_2;
    moom.Ms spill2752_0;
    int spill2752_1;
    boolean spill2752_2;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.Ms.e ^ 65193344005537L);
    life4_5 = moom.MS.c();
    spill2752_0 = this;
    spill2752_1 = p0;
    spill2752_2 = (this.c)[p0];
    if (!((life4_5 != 0))) {
        forwardValue2752_16_0 = spill2752_0;
        forwardValue2752_16_1 = spill2752_1;
        forwardValue2752_16_2 = ((spill2752_2) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill2752_2))) {
        forwardValue2752_17_0 = spill2752_0;
        forwardValue2752_17_1 = spill2752_1;
        break forward_join_17;
    }
    forwardValue2752_16_0 = spill2752_0;
    forwardValue2752_16_1 = spill2752_1;
    forwardValue2752_16_2 = 1;
    }
    forwardValue2752_18_0 = forwardValue2752_16_0;
    forwardValue2752_18_1 = forwardValue2752_16_1;
    forwardValue2752_18_2 = forwardValue2752_16_2;
    break forward_join_18;
    }
    forwardValue2752_18_0 = forwardValue2752_17_0;
    forwardValue2752_18_1 = forwardValue2752_17_1;
    forwardValue2752_18_2 = 0;
    }
    return ((moom.Ms)(forwardValue2752_18_0)).a(((int)(forwardValue2752_18_1)), ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2752_18_2))));
}


public boolean a__Boolean(int p0) {
return (this.d)[p0];
}


public void a() {
java.util.Arrays.fill(((boolean[])(this.c)), ((boolean)(false)));
    java.util.Arrays.fill(((boolean[])(this.d)), ((boolean)(false)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(int p0) {
boolean[] forwardValue2751_17_0;
    int forwardValue2751_17_1;
    int forwardValue2751_17_2;
    boolean[] forwardValue2751_18_0;
    int forwardValue2751_18_1;
    boolean[] forwardValue2751_19_0;
    int forwardValue2751_19_1;
    int forwardValue2751_19_2;
    boolean[] spill2751_0;
    int spill2751_1;
    boolean spill2751_2;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.Ms.e ^ 82332377099581L);
    life4_5 = moom.MS.c();
    spill2751_0 = this.c;
    spill2751_1 = p0;
    spill2751_2 = (this.c)[p0];
    if (!((life4_5 != 0))) {
        forwardValue2751_17_0 = spill2751_0;
        forwardValue2751_17_1 = spill2751_1;
        forwardValue2751_17_2 = ((spill2751_2) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill2751_2))) {
        forwardValue2751_18_0 = spill2751_0;
        forwardValue2751_18_1 = spill2751_1;
        break forward_join_18;
    }
    forwardValue2751_17_0 = spill2751_0;
    forwardValue2751_17_1 = spill2751_1;
    forwardValue2751_17_2 = 1;
    }
    forwardValue2751_19_0 = forwardValue2751_17_0;
    forwardValue2751_19_1 = forwardValue2751_17_1;
    forwardValue2751_19_2 = forwardValue2751_17_2;
    break forward_join_19;
    }
    forwardValue2751_19_0 = forwardValue2751_18_0;
    forwardValue2751_19_1 = forwardValue2751_18_1;
    forwardValue2751_19_2 = 0;
    }
    (forwardValue2751_19_0)[forwardValue2751_19_1] = ((forwardValue2751_19_2) != 0);
    (this.d)[p0] = ((1) != 0);
    return;
}


private int a(int p0, boolean p1) {
int forwardValue2750_12_0;
    int forwardValue2750_14_0;
    boolean spill2750_0;
    long life3_3;
    int life5_5;
    int life6_20;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (moom.Ms.e ^ 118173267211402L);
    life5_5 = moom.MS.c();
    spill2750_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue2750_12_0 = ((spill2750_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill2750_0)) {
        break forward_join_13;
    }
    forwardValue2750_12_0 = this.b;
    }
    forwardValue2750_14_0 = forwardValue2750_12_0;
    break forward_join_14;
    }
    forwardValue2750_14_0 = 0;
    }
    life6_20 = forwardValue2750_14_0;
    return ((java.nio.IntBuffer)(this.a)).get(((int)((life6_20 + p0))));
}


public int a(int p0) {
return this.a(((int)(p0)), ((boolean)((this.c)[p0])));
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
