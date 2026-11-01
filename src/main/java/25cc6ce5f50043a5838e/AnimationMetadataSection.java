package net.minecraft.client.resources.data;


public class AnimationMetadataSection implements net.minecraft.client.resources.data.IMetadataSection {

private final java.util.List<moom.o9> a;

private final int b;

private final int c;

private final int d;

private final boolean e;

private static final long f;

public AnimationMetadataSection(java.util.List<moom.o9> p0, int p1, int p2, int p3, boolean p4) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
}


static {
f = (moom._c.a(7849921762763754909L, 2623369354954239541L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(189810630592807L);
}


public int b(int p0) {
return ((moom.o9)(((moom.o9)(((java.util.List)(this.a)).get(((int)(p0))))))).b();
}


public int b() {
return this.b;
}


public int c() {
return ((java.util.List)(this.a)).size();
}


public int d() {
return this.d;
}


public boolean a__Boolean(int p0) {
int forwardValue4848_16_0;
    int forwardValue4848_18_0;
    boolean spill4848_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.client.resources.data.AnimationMetadataSection.f ^ 55125282157998L);
    life4_5 = moom.pa.b();
    spill4848_0 = ((moom.o9)(((moom.o9)(((java.util.List)(this.a)).get(((int)(p0))))))).a__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue4848_16_0 = ((spill4848_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4848_0))) {
        break forward_join_17;
    }
    forwardValue4848_16_0 = 1;
    }
    forwardValue4848_18_0 = forwardValue4848_16_0;
    break forward_join_18;
    }
    forwardValue4848_18_0 = 0;
    }
    return ((forwardValue4848_18_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.Set<java.lang.Integer> a__Set() {
java.util.HashSet lexicalValue1503_30_0;
    int spill1503_0;
    java.util.HashSet spill1503_1;
    long life1_3;
    java.util.HashSet life4_5;
    java.util.Iterator life5_10;
    int life3_11;
    moom.o9 life6_18;
    lexical_join_30: {
    lexical_join_29: {
    life1_3 = (net.minecraft.client.resources.data.AnimationMetadataSection.f ^ 64378397800037L);
    life4_5 = com.google.common.collect.Sets.newHashSet();
    spill1503_0 = moom.pa.c();
    life5_10 = ((java.util.List)(this.a)).iterator();
    life3_11 = spill1503_0;
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life5_10)).hasNext())) {
        break lexical_join_29;
    }
    life6_18 = ((moom.o9)(((java.util.Iterator)(life5_10)).next()));
    spill1503_1 = life4_5;
    if (!((life3_11 != 0))) {
        lexicalValue1503_30_0 = spill1503_1;
        break lexical_join_30;
    }
    ((java.util.Set)(spill1503_1)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((moom.o9)(life6_18)).b()))))));
    if (!((life3_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1503_30_0 = life4_5;
    }
    return lexicalValue1503_30_0;
}


public int a() {
return this.c;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


private moom.o9 a__o9(int p0) {
return ((moom.o9)(((java.util.List)(this.a)).get(((int)(p0)))));
}


public int a(int p0) {
moom.o9 forwardValue4847_19_0;
    int forwardValue4847_20_0;
    int spill4847_0;
    moom.o9 spill4847_1;
    long life2_3;
    moom.o9 life5_8;
    int life4_9;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.client.resources.data.AnimationMetadataSection.f ^ 54099673078324L);
    spill4847_0 = moom.pa.c();
    life5_8 = ((net.minecraft.client.resources.data.AnimationMetadataSection)(this)).a__o9(((int)(p0)));
    life4_9 = spill4847_0;
    spill4847_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue4847_19_0 = spill4847_1;
        break forward_join_19;
    }
    if (!(((moom.o9)(spill4847_1)).a__Boolean())) {
        break forward_join_18;
    }
    forwardValue4847_20_0 = this.d;
    break forward_join_20;
    }
    forwardValue4847_19_0 = life5_8;
    }
    forwardValue4847_20_0 = ((moom.o9)(forwardValue4847_19_0)).a();
    }
    return forwardValue4847_20_0;
}

}
