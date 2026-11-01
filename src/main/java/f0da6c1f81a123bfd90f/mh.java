package com.moon;


public class mh {

private final com.moon.setting.StringListSetting a;

private static final long b;

public mh(java.lang.String p0) {
super();
    this.a = new com.moon.setting.StringListSetting(p0);
}


static {
b = (moom._c.a(-8341373815211904304L, -3548868913389496907L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(180612435623592L);
}


public com.moon.mh b(java.util.function.Consumer<java.lang.String> p0) {
((com.moon.setting.StringListSetting)(this.a)).l = ((java.util.function.Consumer)(p0));
    return this;
}


public com.moon.mh a(java.lang.String p0) {
((com.moon.setting.StringListSetting)(this.a)).setDescription(((java.lang.String)(p0)));
    return this;
}


public com.moon.setting.StringListSetting a() {
return this.a;
}


public com.moon.mh a(java.lang.String p0, java.lang.String p1) {
com.moon.setting.StringListSetting forwardValue769_27_0;
    net.minecraft.entity.Entity[] spill769_0;
    com.moon.setting.StringListSetting spill769_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_10;
    forward_join_27: {
    forward_join_25: {
    life3_3 = (com.moon.mh.b ^ 76398111627586L);
    spill769_0 = com.moon.setting.BooleanSetting.a();
    ((com.moon.setting.StringListSetting)(this.a)).setDisplayName(((java.lang.String)(p0)));
    life5_10 = spill769_0;
    spill769_1 = this.a;
    if (!((life5_10 != null))) {
        forwardValue769_27_0 = spill769_1;
        break forward_join_27;
    }
    if (!((!((java.util.List)(((com.moon.setting.StringListSetting)(spill769_1)).values)).contains(((java.lang.Object)(p1)))))) {
        break forward_join_25;
    }
    ((java.util.List)(((com.moon.setting.StringListSetting)(this.a)).values)).add(((java.lang.Object)(p1)));
    }
    forwardValue769_27_0 = this.a;
    }
    ((com.moon.setting.StringListSetting)(forwardValue769_27_0)).setValue(((p1)));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.mh a(com.moon.kR<java.lang.String> p0) {
((com.moon.setting.StringListSetting)(this.a)).setChangeListener(((com.moon.kR)(p0)));
    return this;
}


public com.moon.mh a(java.util.function.Consumer<java.lang.String> p0) {
((com.moon.setting.StringListSetting)(this.a)).changeConsumer = ((java.util.function.Consumer)(p0));
    return this;
}


public com.moon.mh a(java.util.List<java.lang.String> p0) {
int lexicalValue218_33_0;
    com.moon.mh lexicalValue218_37_0;
    net.minecraft.entity.Entity[] spill218_0;
    com.moon.mh spill218_1;
    boolean spill218_2;
    long life2_3;
    java.util.Iterator life5_9;
    net.minecraft.entity.Entity[] life4_10;
    java.lang.String life6_17;
    lexical_join_37: {
    lexical_join_36: {
    life2_3 = (com.moon.mh.b ^ 45531088967260L);
    spill218_0 = com.moon.setting.BooleanSetting.a();
    life5_9 = ((java.util.List)(((com.moon.setting.StringListSetting)(this.a)).values)).iterator();
    life4_10 = spill218_0;
    lexical_cycle_11: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!(((java.util.Iterator)(life5_9)).hasNext())) {
        break lexical_join_36;
    }
    life6_17 = ((java.lang.String)(((java.util.Iterator)(life5_9)).next()));
    spill218_1 = this;
    if (!((life4_10 != null))) {
        lexicalValue218_37_0 = spill218_1;
        break lexical_join_37;
    }
    spill218_2 = ((java.util.List)(((com.moon.setting.StringListSetting)(((com.moon.mh)(spill218_1)).a)).values)).contains(((java.lang.Object)(life6_17)));
    if (!((life4_10 != null))) {
        lexicalValue218_33_0 = ((spill218_2) ? 1 : 0);
        break lexical_join_33;
    }
    if (!((!spill218_2))) {
        break lexical_join_34;
    }
    lexicalValue218_33_0 = ((((java.util.List)(((com.moon.setting.StringListSetting)(this.a)).values)).add(((java.lang.Object)(life6_17)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue218_33_0);
    }
    if (!((life4_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue218_37_0 = this;
    }
    return lexicalValue218_37_0;
}


public com.moon.mh a(java.util.function.Supplier<java.lang.Boolean> p0) {
((com.moon.setting.StringListSetting)(this.a)).setAvailabilityPredicate(((java.util.function.Supplier)(p0)));
    return this;
}

}
