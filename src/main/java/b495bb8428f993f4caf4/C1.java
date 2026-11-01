package moom;


public class C1 implements com.google.gson.TypeAdapterFactory {

private static final long a;

public C1() {
super();
}


static {
a = (moom._c.a(6793760709737069672L, 5743531456967100909L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(146480950317937L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private java.lang.String a(java.lang.Object p0) {
java.lang.Object forwardValue1562_18_0;
    java.lang.String forwardValue1562_21_0;
    java.lang.Object spill1562_0;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (moom.C1.a ^ 37774452783231L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1562_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1562_18_0 = spill1562_0;
        break forward_join_18;
    }
    if (!((((spill1562_0 instanceof java.lang.Enum) ? 1 : 0) != 0))) {
        break forward_join_17;
    }
    forwardValue1562_21_0 = ((java.lang.String)(((java.lang.Enum)(((java.lang.Enum)(p0)))).name())).toLowerCase(((java.util.Locale)(java.util.Locale.US)));
    break forward_join_21;
    }
    forwardValue1562_18_0 = p0;
    }
    forwardValue1562_21_0 = ((java.lang.String)(((java.lang.Object)(forwardValue1562_18_0)).toString())).toLowerCase(((java.util.Locale)(java.util.Locale.US)));
    }
    return forwardValue1562_21_0;
}


public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson p0, com.google.gson.reflect.TypeToken<T> p1) {
boolean spill521_0;
    long life3_3;
    java.lang.Class life6_7;
    int life5_8;
    java.util.HashMap life7_17;
    java.lang.Object[] life8_20;
    int life9_23;
    int life10_25;
    java.lang.Object life11_32;
    lexical_join_41: {
    lexical_join_14: {
    life3_3 = (moom.C1.a ^ 115685624651809L);
    spill521_0 = moom.DS.b__Boolean();
    life6_7 = ((com.google.gson.reflect.TypeToken)(p1)).getRawType();
    life5_8 = ((spill521_0) ? 1 : 0);
    if (!((!((java.lang.Class)(life6_7)).isEnum()))) {
        break lexical_join_14;
    }
    return null;
    }
    life7_17 = com.google.common.collect.Maps.newHashMap();
    life8_20 = ((java.lang.Class)(life6_7)).getEnumConstants();
    life9_23 = (life8_20).length;
    life10_25 = 0;
    lexical_cycle_24: while (true) {
    if (!((life10_25 < life9_23))) {
        break lexical_join_41;
    }
    life11_32 = (life8_20)[life10_25];
    ((java.util.Map)(life7_17)).put(((java.lang.Object)(this.a(((java.lang.Object)(life11_32))))), ((java.lang.Object)(life11_32)));
    life10_25 += 1;
    if (!((life5_8 != 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    return new moom.h(this, life7_17);
}

}
