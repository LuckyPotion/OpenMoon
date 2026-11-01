package net.minecraft.entity.ai.attributes;


public abstract class BaseAttributeMap {

protected final java.util.Map<net.minecraft.entity.ai.attributes.IAttribute, net.minecraft.entity.ai.attributes.IAttributeInstance> a;

protected final java.util.Map<java.lang.String, net.minecraft.entity.ai.attributes.IAttributeInstance> b;

protected final com.google.common.collect.Multimap<net.minecraft.entity.ai.attributes.IAttribute, net.minecraft.entity.ai.attributes.IAttribute> c;

private static final long f;

public BaseAttributeMap() {
super();
    this.a = com.google.common.collect.Maps.newHashMap();
    this.b = new moom.Bq();
    this.c = com.google.common.collect.HashMultimap.create();
}


static {
f = (moom._c.a(6978243362992215988L, 4307963316545046457L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(257362731425673L);
}


public void b(com.google.common.collect.Multimap<java.lang.String, moom.vB> p0) {
net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1555_33_0;
    int spill1555_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1555_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    java.util.Map.Entry life6_16;
    net.minecraft.entity.ai.attributes.IAttributeInstance life7_22;
    lexical_join_39: {
    life2_3 = (net.minecraft.entity.ai.attributes.BaseAttributeMap.f ^ 134106476602772L);
    spill1555_0 = moom.vB.c();
    life5_8 = ((java.util.Collection)(((com.google.common.collect.Multimap)(p0)).entries())).iterator();
    life4_9 = spill1555_0;
    lexical_cycle_10: while (true) {
    lexical_join_37: {
    lexical_join_33: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_39;
    }
    life6_16 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_8)).next()));
    life7_22 = this.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life6_16)).getKey())))));
    spill1555_1 = life7_22;
    if (!((life4_9 == 0))) {
        lexicalValue1555_33_0 = spill1555_1;
        break lexical_join_33;
    }
    if (!((spill1555_1 != null))) {
        break lexical_join_37;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life7_22)).b(((moom.vB)(((moom.vB)(((java.util.Map.Entry)(life6_16)).getValue())))));
    lexicalValue1555_33_0 = life7_22;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(lexicalValue1555_33_0)).a(((moom.vB)(((moom.vB)(((java.util.Map.Entry)(life6_16)).getValue())))));
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public net.minecraft.entity.ai.attributes.IAttributeInstance b(net.minecraft.entity.ai.attributes.IAttribute p0) {
net.minecraft.entity.ai.attributes.BaseAttributeMap lexicalValue1556_20_0;
    net.minecraft.entity.ai.attributes.BaseAttributeMap spill1556_0;
    long life2_3;
    int life4_5;
    net.minecraft.entity.ai.attributes.IAttributeInstance life5_27;
    net.minecraft.entity.ai.attributes.IAttribute life6_43;
    lexical_join_52: {
    lexical_join_20: {
    lexical_join_19: {
    life2_3 = (net.minecraft.entity.ai.attributes.BaseAttributeMap.f ^ 113158945588264L);
    life4_5 = moom.vB.c();
    spill1556_0 = this;
    if (!((life4_5 == 0))) {
        lexicalValue1556_20_0 = spill1556_0;
        break lexical_join_20;
    }
    if (!(((java.util.Map)(((net.minecraft.entity.ai.attributes.BaseAttributeMap)(spill1556_0)).b)).containsKey(((java.lang.Object)(((net.minecraft.entity.ai.attributes.IAttribute)(p0)).a__String()))))) {
        break lexical_join_19;
    }
    throw new java.lang.IllegalArgumentException("Attribute is already registered!");
    }
    lexicalValue1556_20_0 = this;
    }
    life5_27 = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(lexicalValue1556_20_0)).c(((net.minecraft.entity.ai.attributes.IAttribute)(p0)));
    ((java.util.Map)(this.b)).put(((java.lang.Object)(((net.minecraft.entity.ai.attributes.IAttribute)(p0)).a__String())), ((java.lang.Object)(life5_27)));
    ((java.util.Map)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life5_27)));
    life6_43 = ((net.minecraft.entity.ai.attributes.IAttribute)(p0)).a__vG();
    lexical_cycle_39: while (true) {
    if (!((life6_43 != null))) {
        break lexical_join_52;
    }
    ((com.google.common.collect.Multimap)(this.c)).put(((java.lang.Object)(life6_43)), ((java.lang.Object)(p0)));
    life6_43 = ((net.minecraft.entity.ai.attributes.IAttribute)(life6_43)).a__vG();
    if (!((life4_5 != 0))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    return life5_27;
}


protected abstract net.minecraft.entity.ai.attributes.IAttributeInstance c(net.minecraft.entity.ai.attributes.IAttribute p0);

private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public void a(com.google.common.collect.Multimap<java.lang.String, moom.vB> p0) {
net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1554_28_0;
    int spill1554_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1554_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    java.util.Map.Entry life6_16;
    net.minecraft.entity.ai.attributes.IAttributeInstance life7_22;
    lexical_join_34: {
    life2_3 = (net.minecraft.entity.ai.attributes.BaseAttributeMap.f ^ 40562014989082L);
    spill1554_0 = moom.vB.c();
    life5_8 = ((java.util.Collection)(((com.google.common.collect.Multimap)(p0)).entries())).iterator();
    life4_9 = spill1554_0;
    lexical_cycle_10: while (true) {
    lexical_join_32: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_34;
    }
    life6_16 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_8)).next()));
    life7_22 = this.a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life6_16)).getKey())))));
    spill1554_1 = life7_22;
    if (!((life4_9 == 0))) {
        lexicalValue1554_28_0 = spill1554_1;
        break lexical_join_28;
    }
    if (!((spill1554_1 != null))) {
        break lexical_join_32;
    }
    lexicalValue1554_28_0 = life7_22;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(lexicalValue1554_28_0)).b(((moom.vB)(((moom.vB)(((java.util.Map.Entry)(life6_16)).getValue())))));
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public net.minecraft.entity.ai.attributes.IAttributeInstance a(net.minecraft.entity.ai.attributes.IAttribute p0) {
return ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
}


public net.minecraft.entity.ai.attributes.IAttributeInstance a(java.lang.String p0) {
return ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0)))));
}


public java.util.Collection<net.minecraft.entity.ai.attributes.IAttributeInstance> a() {
return ((java.util.Map)(this.b)).values();
}


public void a(net.minecraft.entity.ai.attributes.IAttributeInstance p0) {
return;
}

}
