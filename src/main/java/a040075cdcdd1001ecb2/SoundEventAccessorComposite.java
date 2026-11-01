package net.minecraft.client.audio;


public class SoundEventAccessorComposite implements net.minecraft.client.audio.ISoundEventAccessor<net.minecraft.client.audio.SoundPoolEntry> {

private final java.util.List<net.minecraft.client.audio.ISoundEventAccessor<net.minecraft.client.audio.SoundPoolEntry>> a;

private final java.util.Random b;

private final moom.DD c;

private final net.minecraft.client.audio.SoundCategory d;

private final double e;

private final double f;

private static final long g;

public SoundEventAccessorComposite(moom.DD p0, double p1, double p2, net.minecraft.client.audio.SoundCategory p3) {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
    this.b = new java.util.Random();
    this.c = p0;
    this.f = p2;
    this.e = p1;
    this.d = p3;
}


static {
g = (moom._c.a(1417545839990747425L, 2275429902072000833L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(132899919262631L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.audio.SoundPoolEntry a__Object() {
return ((net.minecraft.client.audio.SoundEventAccessorComposite)(this)).a__f9();
}


public net.minecraft.client.audio.SoundCategory a__aw() {
return this.d;
}


public int a() {
int lexicalValue1471_29_0;
    java.lang.String spill1471_0;
    int spill1471_1;
    long life1_3;
    int life4_6;
    java.lang.String life3_7;
    java.util.Iterator life5_11;
    net.minecraft.client.audio.ISoundEventAccessor life6_18;
    lexical_join_29: {
    lexical_join_28: {
    life1_3 = (net.minecraft.client.audio.SoundEventAccessorComposite.g ^ 41847035220104L);
    spill1471_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_6 = 0;
    life3_7 = spill1471_0;
    life5_11 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_28;
    }
    life6_18 = ((net.minecraft.client.audio.ISoundEventAccessor)(((java.util.Iterator)(life5_11)).next()));
    spill1471_1 = (life4_6 + ((net.minecraft.client.audio.ISoundEventAccessor)(life6_18)).a());
    if (!((life3_7 == null))) {
        lexicalValue1471_29_0 = spill1471_1;
        break lexical_join_29;
    }
    life4_6 = spill1471_1;
    if (!((life3_7 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1471_29_0 = life4_6;
    }
    return lexicalValue1471_29_0;
}


public net.minecraft.client.audio.SoundPoolEntry a__f9() {
int lexicalValue1472_16_0;
    int lexicalValue1472_23_0;
    java.lang.String spill1472_0;
    boolean spill1472_1;
    long life1_3;
    int life4_7;
    java.lang.String life3_8;
    int life5_32;
    java.util.Iterator life6_36;
    net.minecraft.client.audio.ISoundEventAccessor life7_43;
    net.minecraft.client.audio.SoundPoolEntry life8_54;
    lexical_join_64: {
    lexical_join_23: {
    lexical_join_16: {
    life1_3 = (net.minecraft.client.audio.SoundEventAccessorComposite.g ^ 34458535774682L);
    spill1472_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_7 = this.a();
    life3_8 = spill1472_0;
    spill1472_1 = ((java.util.List)(this.a)).isEmpty();
    if (!((life3_8 == null))) {
        lexicalValue1472_16_0 = ((spill1472_1) ? 1 : 0);
        break lexical_join_16;
    }
    if (!((!spill1472_1))) {
        break lexical_join_64;
    }
    lexicalValue1472_16_0 = life4_7;
    }
    if (!((life3_8 == null))) {
        lexicalValue1472_23_0 = lexicalValue1472_16_0;
        break lexical_join_23;
    }
    if (!((lexicalValue1472_16_0 != 0))) {
        break lexical_join_64;
    }
    lexicalValue1472_23_0 = ((java.util.Random)(this.b)).nextInt(((int)(life4_7)));
    }
    life5_32 = lexicalValue1472_23_0;
    life6_36 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_28: while (true) {
    lexical_join_62: {
    if (!(((java.util.Iterator)(life6_36)).hasNext())) {
        break lexical_join_64;
    }
    life7_43 = ((net.minecraft.client.audio.ISoundEventAccessor)(((java.util.Iterator)(life6_36)).next()));
    life5_32 = (life5_32 - ((net.minecraft.client.audio.ISoundEventAccessor)(life7_43)).a());
    if (!((life5_32 < 0))) {
        break lexical_join_62;
    }
    life8_54 = ((net.minecraft.client.audio.SoundPoolEntry)(((net.minecraft.client.audio.ISoundEventAccessor)(life7_43)).a__Object()));
    ((net.minecraft.client.audio.SoundPoolEntry)(life8_54)).a(((double)((((net.minecraft.client.audio.SoundPoolEntry)(life8_54)).a() * this.e))));
    ((net.minecraft.client.audio.SoundPoolEntry)(life8_54)).b(((double)((((net.minecraft.client.audio.SoundPoolEntry)(life8_54)).b() * this.f))));
    return life8_54;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return net.minecraft.client.audio.SoundHandler.d;
}


public void a(net.minecraft.client.audio.ISoundEventAccessor<net.minecraft.client.audio.SoundPoolEntry> p0) {
((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    return;
}


public moom.DD a__DD() {
return this.c;
}

}
