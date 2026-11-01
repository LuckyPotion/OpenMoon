package com.moon;


public class nV {

private static float a;

private static long b;

private final java.util.List<java.lang.Float> c;

private static final long d;

public nV() {
super();
    this.c = new java.util.ArrayList();
}


static {
d = (moom._c.a(4023382739873669481L, -6901003658439077140L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(150867842498175L);
    a = 0x0.0p+0f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static float a() {
return com.moon.nV.a;
}


public void a(com.moon.event.PacketEvent p0) {
int lexicalValue299_65_0;
    int spill299_0;
    long life2_3;
    int life4_5;
    float life5_11;
    java.util.Iterator life6_15;
    java.lang.Float life7_22;
    float life5_41;
    lexical_join_68: {
    lexical_join_65: {
    lexical_join_55: {
    lexical_join_45: {
    lexical_join_32: {
    life2_3 = (com.moon.nV.d ^ 100250920092474L);
    life4_5 = ((com.moon.aO.c()) ? 1 : 0);
    if (!((((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zw) ? 1 : 0) != 0))) {
        break lexical_join_68;
    }
    life5_11 = 0x0.0p0f;
    life6_15 = ((java.util.List)(this.c)).iterator();
    lexical_cycle_16: while (true) {
    if (!(((java.util.Iterator)(life6_15)).hasNext())) {
        break lexical_join_32;
    }
    life7_22 = ((java.lang.Float)(((java.util.Iterator)(life6_15)).next()));
    life5_11 = (life5_11 + ((java.lang.Float)(life7_22)).floatValue());
    if (!((life4_5 != 0))) {
        break lexical_join_45;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    life5_41 = (life5_11 / ((float) ((java.util.List)(this.c)).size()));
    com.moon.nV.a = ((float)(((float) com.moon.nI.a(((double)(((double) life5_41))), ((int)(2))))));
    }
    spill299_0 = ((java.util.List)(this.c)).size();
    if (!((life4_5 != 0))) {
        lexicalValue299_65_0 = spill299_0;
        break lexical_join_65;
    }
    if (!((spill299_0 >= 5))) {
        break lexical_join_55;
    }
    ((java.util.List)(this.c)).clear();
    }
    lexicalValue299_65_0 = ((((java.util.List)(this.c)).add(((java.lang.Object)(java.lang.Float.valueOf(((float)((((float) (java.lang.System.currentTimeMillis() - com.moon.nV.b)) / 0x1.9p5f)))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue299_65_0);
    com.moon.nV.b = ((long)(java.lang.System.currentTimeMillis()));
    }
    return;
}

}
