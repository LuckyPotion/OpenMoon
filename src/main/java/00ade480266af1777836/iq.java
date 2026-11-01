package com.moon;


public class iq implements com.moon.it {

private final java.lang.Class<? extends java.lang.Enum<?>> a;

private static final long b;

public iq(java.lang.Class<? extends java.lang.Enum<?>> p0) {
super();
    this.a = p0;
}


static {
b = (moom._c.a(8777241439478281377L, -9060572867985123471L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(87149256308L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.Object a__Object(java.lang.String p0) {
return this.a(((java.lang.String)(p0)));
}


public java.lang.Enum<?> a(java.lang.String p0) {
boolean spill92_0;
    long life2_3;
    java.lang.String life5_9;
    java.lang.Enum[] life6_15;
    int life7_18;
    int life4_19;
    int life8_21;
    java.lang.Enum life9_28;
    lexical_join_44: {
    life2_3 = (com.moon.iq.b ^ 113069050615863L);
    life5_9 = ((java.lang.String)(((java.lang.String)(p0)).trim())).replace(((java.lang.CharSequence)(" ")), ((java.lang.CharSequence)("")));
    spill92_0 = com.moon.is.b();
    life6_15 = ((java.lang.Enum[])(((java.lang.Class)(this.a)).getEnumConstants()));
    life7_18 = (life6_15).length;
    life4_19 = ((spill92_0) ? 1 : 0);
    life8_21 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life8_21 < life7_18))) {
        break lexical_join_44;
    }
    life9_28 = (life6_15)[life8_21];
    if (!((life4_19 == 0))) {
        break lexical_join_39;
    }
    if (!(((java.lang.String)(((java.lang.Enum)(life9_28)).name())).equals(((java.lang.Object)(life5_9))))) {
        break lexical_join_38;
    }
    return life9_28;
    }
    life8_21 += 1;
    }
    if (!((life4_19 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return null;
}

}
