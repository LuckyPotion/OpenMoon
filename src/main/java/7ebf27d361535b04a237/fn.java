package com.moon;


public class fn extends com.moon.e2<com.moon.module.impl.Flight> {

private static final long e;

public fn() {
super(com.moon.module.impl.Flight.class);
}


static {
e = (moom._c.a(2347952060939922876L, -3061895621769692104L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(218734955901267L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
int lexicalValue34_32_0;
    double lexicalValue34_36_0;
    com.moon.event.MovePhase lexicalValue34_71_0;
    com.moon.event.MovePhase lexicalValue34_71_1;
    com.moon.event.MovePhase spill34_0;
    com.moon.event.MovePhase spill34_1;
    boolean spill34_2;
    long life2_3;
    java.lang.String[] life4_5;
    double life5_21;
    double life7_46;
    double life9_52;
    int life5_86;
    lexical_join_109: {
    lexical_join_105: {
    lexical_join_71: {
    lexical_join_68: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_32: {
    lexical_join_28: {
    life2_3 = (com.moon.fn.e ^ 44486217208024L);
    life4_5 = moom.Dr.b();
    spill34_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    spill34_1 = com.moon.event.MovePhase.POST;
    if (!((life4_5 != null))) {
        lexicalValue34_71_0 = spill34_0;
        lexicalValue34_71_1 = spill34_1;
        break lexical_join_71;
    }
    if (!((spill34_0 == spill34_1))) {
        break lexical_join_68;
    }
    life5_21 = ((-java.lang.Math.sin(((double)(((double) com.moon.nJ.a__Float()))))) * 0x1.8p4d);
    spill34_2 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).W)).aq)).a__Boolean();
    if (!((life4_5 != null))) {
        lexicalValue34_32_0 = ((spill34_2) ? 1 : 0);
        break lexical_join_32;
    }
    if (!(spill34_2)) {
        break lexical_join_28;
    }
    lexicalValue34_36_0 = -0x1.0p2d;
    break lexical_join_36;
    }
    lexicalValue34_32_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).W)).ap)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue34_32_0 != 0))) {
        break lexical_join_35;
    }
    lexicalValue34_36_0 = 0x1.0p2d;
    break lexical_join_36;
    }
    lexicalValue34_36_0 = 0x0.0p0d;
    }
    life7_46 = lexicalValue34_36_0;
    life9_52 = (java.lang.Math.cos(((double)(((double) com.moon.nJ.a__Float())))) * 0x1.8p4d);
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).cm)).b(((moom.yK)(new moom.y8((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).n + life5_21), (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).o + life7_46), (((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).p + life9_52), false))));
    if (!((life4_5 == null))) {
        break lexical_join_109;
    }
    }
    lexicalValue34_71_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    lexicalValue34_71_1 = com.moon.event.MovePhase.PRE;
    }
    if (!((lexicalValue34_71_0 == lexicalValue34_71_1))) {
        break lexical_join_109;
    }
    life5_86 = 0;
    lexical_cycle_74: while (true) {
    if (!((life5_86 < 3))) {
        break lexical_join_105;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).cm)).b(((moom.yK)(new moom.y_(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).n, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).o, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).p, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).w, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).x, false))));
    life5_86 += 1;
    if (!((life4_5 != null))) {
        break lexical_join_109;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_74; }
    break lexical_cycle_74;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fn.a)).K)).u = ((double)(0x0.0p0d));
    }
    return;
}


public void a(com.moon.event.MotionEvent p0) {
((com.moon.event.MotionEvent)(p0)).applyMotionSpeed(((double)(0x0.0p0d)));
    return;
}

}
