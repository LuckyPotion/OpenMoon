package com.moon;


public class hc extends com.moon.g9 {

private final java.util.List<com.moon.g8> h;

private static final long i;

public hc(com.moon.module.impl.ESP p0) {
super(p0);
    this.h = java.util.List.of(new com.moon.hf(this), new com.moon.hg(this), new com.moon.hh(this));
}


static {
i = (moom._c.a(-2607951088994010099L, 3623005471266628637L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(86598364755448L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
return (__sourceIntrinsic_booleanComparison((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(((com.moon.hc)(this)).a__lV())).n())).getValue())))).booleanValue())) != 0);
}


public void a(net.minecraft.entity.Entity p0) {
com.moon.g8 lexicalValue71_68_0;
    net.minecraft.entity.Entity lexicalValue71_68_1;
    java.lang.String[] spill71_0;
    com.moon.g8 spill71_1;
    net.minecraft.entity.Entity spill71_2;
    long life2_3;
    com.moon.jb life5_8;
    org.lwjgl.util.vector.Vector4f life6_11;
    float life7_14;
    float life8_17;
    java.lang.String[] life4_18;
    float life9_21;
    float life10_24;
    float life11_28;
    float life12_32;
    float life13_41;
    float life14_46;
    float life15_48;
    java.util.Iterator life16_52;
    com.moon.g8 life17_59;
    java.lang.String life18_75;
    lexical_join_90: {
    life2_3 = (com.moon.hc.i ^ 53568266641946L);
    spill71_0 = moom.mS.a__ArrayString();
    life5_8 = ((com.moon.je)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__je())).a();
    life6_11 = ((net.minecraft.entity.Entity)(p0)).a__Vector4f();
    life7_14 = ((org.lwjgl.util.vector.Vector4f)(life6_11)).x;
    life8_17 = ((org.lwjgl.util.vector.Vector4f)(life6_11)).y;
    life4_18 = spill71_0;
    life9_21 = ((org.lwjgl.util.vector.Vector4f)(life6_11)).z;
    life10_24 = ((org.lwjgl.util.vector.Vector4f)(life6_11)).w;
    life11_28 = (life9_21 - life7_14);
    life12_32 = (life10_24 - life8_17);
    life13_41 = ((life7_14 + life11_28) + (((com.moon.hc)(this)).g * 0x1.0p1f));
    life14_46 = (life8_17 + ((com.moon.hc)(this)).g);
    life15_48 = 0x0.0p0f;
    life16_52 = ((java.util.List)(this.h)).iterator();
    lexical_cycle_53: while (true) {
    lexical_join_88: {
    lexical_join_68: {
    if (!(((java.util.Iterator)(life16_52)).hasNext())) {
        break lexical_join_90;
    }
    life17_59 = ((com.moon.g8)(((java.util.Iterator)(life16_52)).next()));
    spill71_1 = life17_59;
    spill71_2 = p0;
    if (!((life4_18 == null))) {
        lexicalValue71_68_0 = spill71_1;
        lexicalValue71_68_1 = spill71_2;
        break lexical_join_68;
    }
    if (!(((com.moon.g8)(spill71_1)).a__Boolean(((net.minecraft.entity.Entity)(spill71_2))))) {
        break lexical_join_88;
    }
    lexicalValue71_68_0 = life17_59;
    lexicalValue71_68_1 = p0;
    }
    life18_75 = ((com.moon.g8)(lexicalValue71_68_0)).a(((net.minecraft.entity.Entity)(lexicalValue71_68_1)));
    ((com.moon.jb)(life5_8)).a(((com.moon.hW)(((com.moon.hc)(this)).f)), ((java.lang.String)(life18_75)), ((float)(life13_41)), ((float)((life14_46 + life15_48))), ((float)(0x1.0p0f)), ((int)(-1)));
    life15_48 = (life15_48 + (((com.moon.jb)(life5_8)).a() + 0x1.0p1f));
    }
    if (!((life4_18 != null))) { continue lexical_cycle_53; }
    break lexical_cycle_53;
    }
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
