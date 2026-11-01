package com.moon;


public class hw {

private java.util.List<com.moon.hi> a;

private com.moon.module.impl.HUD b;

private com.moon.module.impl.Effects c;

private com.moon.hi d;

private float e;

private float f;

private static java.lang.String[] g;

private static long h;

public hw(java.util.List<com.moon.hi> p0, com.moon.module.impl.HUD p1) { super(); }


private static void __sourceConstructorBody_891d5ec055773674(com.moon.hw receiver, java.util.List p0, com.moon.module.impl.HUD p1) throws Throwable {

long local3_life1 = (com.moon.hw.h ^ 15890304257060L);

    com.moon.hw.__sourceConstructorInit_891d5ec055773674_0(((com.moon.hw)(receiver)));

    ((com.moon.hw)(receiver)).d = ((com.moon.hi)(null));

    java.lang.String[] __sourceSpill81_6 = com.moon.hw.b__ArrayString();

    ((com.moon.hw)(receiver)).a = ((java.util.List)(p0));

    java.lang.String[] local5_life7 = __sourceSpill81_6;

    ((com.moon.hw)(receiver)).b = ((com.moon.module.impl.HUD)(p1));

    if ((local5_life7 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));

    }

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(-1466439502601566980L)), ((long)(-570134683055623423L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(69705335089599L)))));
    if ((com.moon.hw.b__ArrayString() != null)) {
        com.moon.hw.b(((java.lang.String[])(new java.lang.String[2])));
    }
}

private static native <E extends Throwable> void __sourceConstructorInit_891d5ec055773674_0(com.moon.hw a0) throws E;

public static void b(java.lang.String[] p0) {
g = ((java.lang.String[])(p0));
    return;
}


public float b() {
return this.f;
}


public static java.lang.String[] b__ArrayString() {
return com.moon.hw.g;
}


public com.moon.hi a__hi() {
return this.d;
}


public float a() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean a(int p0, int p1, float p2, float p3, float p4, float p5) {
int forwardValue394_19_0;
    int forwardValue394_26_0;
    int forwardValue394_35_0;
    int forwardValue394_39_0;
    int forwardValue394_41_0;
    int spill394_0;
    long life7_3;
    java.lang.String[] life9_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (com.moon.hw.h ^ 34082778408298L);
    life9_5 = com.moon.hw.b__ArrayString();
    spill394_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p0))), ((float)(p2)));
    if (!((life9_5 == null))) {
        forwardValue394_19_0 = spill394_0;
        break forward_join_19;
    }
    if (!((spill394_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue394_19_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p0))), ((float)((p2 + p4))));
    }
    if (!((life9_5 == null))) {
        forwardValue394_26_0 = forwardValue394_19_0;
        break forward_join_26;
    }
    if (!((forwardValue394_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue394_26_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) p1))), ((float)(p3)));
    }
    if (!((life9_5 == null))) {
        forwardValue394_35_0 = forwardValue394_26_0;
        break forward_join_35;
    }
    if (!((forwardValue394_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue394_35_0 = recovery.source.CarrierOps.fcmpg(((float)(((float) p1))), ((float)((p3 + p5))));
    }
    if (!((life9_5 == null))) {
        forwardValue394_39_0 = forwardValue394_35_0;
        break forward_join_39;
    }
    if (!((forwardValue394_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue394_39_0 = 1;
    }
    forwardValue394_41_0 = forwardValue394_39_0;
    break forward_join_41;
    }
    forwardValue394_41_0 = 0;
    }
    return ((forwardValue394_41_0) != 0);
}


private moom.DN<java.lang.Integer, java.lang.Integer> a__DN() {
int local1 = org.lwjgl.input.Mouse.getX();
    int local2 = (org.lwjgl.opengl.Display.getHeight() - org.lwjgl.input.Mouse.getY());
    float local3 = ((float) ((moom.ir)(com.moon.nS.a())).c());
    local3 = (local3 * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.b)).e__kZ())).getValue())))).floatValue());
    local1 = ((int) (((float) local1) / local3));
    local2 = ((int) (((float) local2) / local3));
    return new moom.DN(java.lang.Integer.valueOf(((int)(local1))), java.lang.Integer.valueOf(((int)(local2))));
}


private void a__Void() {
com.moon.hw forwardValue396_12_0;
    com.moon.hw spill396_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.hw.h ^ 129204477458393L);
    life3_5 = com.moon.hw.b__ArrayString();
    spill396_0 = this;
    if (!((life3_5 == null))) {
        forwardValue396_12_0 = spill396_0;
        break forward_join_12;
    }
    if (!((((com.moon.hw)(spill396_0)).c == null))) {
        break forward_join_18;
    }
    forwardValue396_12_0 = this;
    }
    ((com.moon.hw)(forwardValue396_12_0)).c = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    return;
}


public void a(com.moon.event.Render2DEvent p0) {
com.moon.hw lexicalValue83_84_0;
    int lexicalValue83_94_0;
    int lexicalValue83_108_0;
    java.lang.String[] spill83_0;
    boolean spill83_1;
    int spill83_2;
    com.moon.hw spill83_3;
    boolean spill83_4;
    com.moon.hw spill83_5;
    float spill83_6;
    long life2_3;
    java.lang.String[] life4_7;
    int life5_15;
    moom.DN life6_42;
    int life7_47;
    int life8_52;
    java.util.Iterator life9_56;
    com.moon.hi life10_63;
    moom.DN life6_144;
    int life7_149;
    int life8_154;
    lexical_join_160: {
    lexical_join_155: {
    lexical_join_140: {
    lexical_join_108: {
    lexical_join_104: {
    lexical_join_94: {
    lexical_join_92: {
    lexical_join_90: {
    life2_3 = (com.moon.hw.h ^ 66186328260611L);
    spill83_0 = com.moon.hw.b__ArrayString();
    ((com.moon.hw)(this)).a__Void();
    life4_7 = spill83_0;
    if (!((((com.moon.event.Render2DEvent)(p0)).getPhase() == com.moon.event.RenderPhase.PRE))) {
        break lexical_join_155;
    }
    life5_15 = ((((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).P instanceof moom.gF) ? 1 : 0);
    spill83_1 = org.lwjgl.input.Mouse.isButtonDown(((int)(0)));
    if (!((life4_7 == null))) {
        lexicalValue83_94_0 = ((spill83_1) ? 1 : 0);
        break lexical_join_94;
    }
    if (!(spill83_1)) {
        break lexical_join_92;
    }
    if (!((this.d == null))) {
        break lexical_join_92;
    }
    spill83_2 = life5_15;
    if (!((life4_7 == null))) {
        lexicalValue83_94_0 = spill83_2;
        break lexical_join_94;
    }
    if (!((spill83_2 != 0))) {
        break lexical_join_92;
    }
    life6_42 = ((com.moon.hw)(this)).a__DN();
    life7_47 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life6_42)).a())))).intValue();
    life8_52 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life6_42)).b())))).intValue();
    life9_56 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_45: while (true) {
    lexical_join_88: {
    lexical_join_84: {
    if (!(((java.util.Iterator)(life9_56)).hasNext())) {
        break lexical_join_90;
    }
    life10_63 = ((com.moon.hi)(((java.util.Iterator)(life9_56)).next()));
    spill83_3 = this;
    if (!((life4_7 == null))) {
        lexicalValue83_84_0 = spill83_3;
        break lexical_join_84;
    }
    spill83_4 = ((com.moon.hw)(spill83_3)).a(((int)(life7_47)), ((int)(life8_52)), ((float)(((com.moon.hi)(life10_63)).a())), ((float)(((com.moon.hi)(life10_63)).b())), ((float)(((com.moon.hi)(life10_63)).c())), ((float)(((com.moon.hi)(life10_63)).d())));
    if (!((life4_7 == null))) {
        lexicalValue83_108_0 = ((spill83_4) ? 1 : 0);
        break lexical_join_108;
    }
    if (!(spill83_4)) {
        break lexical_join_88;
    }
    this.e = ((float)((((com.moon.hi)(life10_63)).a() - ((float) life7_47))));
    this.f = ((float)((((com.moon.hi)(life10_63)).b() - ((float) life8_52))));
    lexicalValue83_84_0 = this;
    }
    ((com.moon.hw)(lexicalValue83_84_0)).d = ((com.moon.hi)(life10_63));
    if (!((life4_7 != null))) {
        break lexical_join_90;
    }
    }
    if (!((life4_7 != null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    if (!((life4_7 != null))) {
        break lexical_join_104;
    }
    }
    lexicalValue83_94_0 = ((org.lwjgl.input.Mouse.isButtonDown(((int)(0)))) ? 1 : 0);
    }
    if (!((lexicalValue83_94_0 == 0))) {
        break lexical_join_104;
    }
    this.d = ((com.moon.hi)(null));
    spill83_5 = this;
    com.moon.hw __stackOp83_37_0 = this;
    float __stackOp83_37_1 = 0x0.0p0f;
    spill83_6 = __stackOp83_37_1;
    ((com.moon.hw)(__stackOp83_37_0)).f = ((float)(__stackOp83_37_1));
    ((com.moon.hw)(spill83_5)).e = ((float)(spill83_6));
    }
    if (!((this.d != null))) {
        break lexical_join_155;
    }
    lexicalValue83_108_0 = life5_15;
    }
    if (!((lexicalValue83_108_0 != 0))) {
        break lexical_join_140;
    }
    life6_144 = ((com.moon.hw)(this)).a__DN();
    life7_149 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life6_144)).a())))).intValue();
    life8_154 = ((java.lang.Integer)(((java.lang.Integer)(((moom.DN)(life6_144)).b())))).intValue();
    ((com.moon.hi)(this.d)).a(((float)((((float) life7_149) + this.e))));
    ((com.moon.hi)(this.d)).b(((float)((((float) life8_154) + this.f))));
    }
    ((com.moon.module.impl.HUD)(this.b)).a(((boolean)(true)));
    ((com.moon.gV)(((com.moon.module.impl.Effects)(this.c)).a())).a(((boolean)(true)));
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.c)).a__gW())).c();
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_160;
    }
    com.moon.hw.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public java.util.List<com.moon.hi> a__List() {
return this.a;
}


public com.moon.module.impl.HUD a__lY() {
return this.b;
}


public com.moon.module.impl.Effects a__lU() {
return this.c;
}

}
