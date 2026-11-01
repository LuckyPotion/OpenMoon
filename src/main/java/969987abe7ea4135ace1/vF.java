package moom;


public class vF extends net.minecraft.entity.ai.attributes.BaseAttributeMap {

private final java.util.Set<net.minecraft.entity.ai.attributes.IAttributeInstance> d;

protected final java.util.Map<java.lang.String, net.minecraft.entity.ai.attributes.IAttributeInstance> e;

private static final long g;

public vF() {
super();
    this.d = com.google.common.collect.Sets.newHashSet();
    this.e = new moom.Bq();
}


static {
g = (moom._c.a(-372778415603752779L, -605212537667422223L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(173035860625221L);
}


public java.util.Collection<net.minecraft.entity.ai.attributes.IAttributeInstance> b() {
int lexicalValue1352_28_0;
    int spill1352_0;
    boolean spill1352_1;
    long life1_3;
    java.util.HashSet life4_6;
    int life3_7;
    java.util.Iterator life5_11;
    net.minecraft.entity.ai.attributes.IAttributeInstance life6_18;
    lexical_join_31: {
    life1_3 = (moom.vF.g ^ 41705235040324L);
    spill1352_0 = moom.vB.c();
    life4_6 = com.google.common.collect.Sets.newHashSet();
    life3_7 = spill1352_0;
    life5_11 = ((java.util.Collection)(((moom.vF)(this)).a())).iterator();
    lexical_cycle_12: while (true) {
    lexical_join_29: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_31;
    }
    life6_18 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((java.util.Iterator)(life5_11)).next()));
    spill1352_1 = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(life6_18)).a__vG())).a__Boolean();
    if (!((life3_7 == 0))) {
        lexicalValue1352_28_0 = ((spill1352_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!(spill1352_1)) {
        break lexical_join_29;
    }
    lexicalValue1352_28_0 = ((((java.util.Set)(life4_6)).add(((java.lang.Object)(life6_18)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1352_28_0);
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life4_6;
}


public net.minecraft.entity.ai.attributes.IAttributeInstance b(net.minecraft.entity.ai.attributes.IAttribute p0) {
net.minecraft.entity.ai.attributes.IAttribute forwardValue4289_16_0;
    java.lang.Object forwardValue4289_28_0;
    int spill4289_0;
    net.minecraft.entity.ai.attributes.IAttribute spill4289_1;
    java.lang.String spill4289_2;
    long life2_3;
    net.minecraft.entity.ai.attributes.IAttributeInstance life5_8;
    int life4_9;
    forward_join_29: {
    forward_join_28: {
    forward_join_16: {
    life2_3 = (moom.vF.g ^ 129411312766976L);
    spill4289_0 = moom.vB.c();
    life5_8 = super.b(((net.minecraft.entity.ai.attributes.IAttribute)(p0)));
    life4_9 = spill4289_0;
    spill4289_1 = p0;
    if (!((life4_9 == 0))) {
        forwardValue4289_16_0 = spill4289_1;
        break forward_join_16;
    }
    if (!((((spill4289_1 instanceof net.minecraft.entity.ai.attributes.RangedAttribute) ? 1 : 0) != 0))) {
        break forward_join_29;
    }
    forwardValue4289_16_0 = p0;
    }
    spill4289_2 = ((net.minecraft.entity.ai.attributes.RangedAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(forwardValue4289_16_0)))).b();
    if (!((life4_9 == 0))) {
        forwardValue4289_28_0 = spill4289_2;
        break forward_join_28;
    }
    if (!((spill4289_2 != null))) {
        break forward_join_29;
    }
    forwardValue4289_28_0 = ((java.util.Map)(this.e)).put(((java.lang.Object)(((net.minecraft.entity.ai.attributes.RangedAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(p0)))).b())), ((java.lang.Object)(life5_8)));
    }
    recovery.source.CarrierOps.discard(forwardValue4289_28_0);
    }
    return life5_8;
}


protected net.minecraft.entity.ai.attributes.IAttributeInstance c(net.minecraft.entity.ai.attributes.IAttribute p0) {
return new moom.vI(this, p0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.ai.attributes.IAttributeInstance a(java.lang.String p0) {
return ((moom.vF)(this)).a__vI(((java.lang.String)(p0)));
}


public net.minecraft.entity.ai.attributes.IAttributeInstance a(net.minecraft.entity.ai.attributes.IAttribute p0) {
return ((moom.vF)(this)).a__vI(((net.minecraft.entity.ai.attributes.IAttribute)(p0)));
}


public moom.vI a__vI(net.minecraft.entity.ai.attributes.IAttribute p0) {
return ((moom.vI)(super.a(((net.minecraft.entity.ai.attributes.IAttribute)(p0)))));
}


public moom.vI a__vI(java.lang.String p0) {
net.minecraft.entity.ai.attributes.IAttributeInstance forwardValue4287_21_0;
    int spill4287_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill4287_1;
    long life2_3;
    net.minecraft.entity.ai.attributes.IAttributeInstance life5_8;
    int life4_9;
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.vF.g ^ 133587793996494L);
    spill4287_0 = moom.vB.b();
    life5_8 = super.a(((java.lang.String)(p0)));
    life4_9 = spill4287_0;
    spill4287_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue4287_21_0 = spill4287_1;
        break forward_join_21;
    }
    if (!((spill4287_1 == null))) {
        break forward_join_20;
    }
    life5_8 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((java.util.Map)(this.e)).get(((java.lang.Object)(p0)))));
    }
    forwardValue4287_21_0 = life5_8;
    }
    return ((moom.vI)(forwardValue4287_21_0));
}


public void a(net.minecraft.entity.ai.attributes.IAttributeInstance p0) {
int lexicalValue1351_16_0;
    moom.vI lexicalValue1351_40_0;
    boolean spill1351_0;
    moom.vI spill1351_1;
    long life2_3;
    int life4_5;
    java.util.Iterator life5_29;
    net.minecraft.entity.ai.attributes.IAttribute life6_36;
    moom.vI life7_40;
    lexical_join_43: {
    lexical_join_17: {
    lexical_join_16: {
    life2_3 = (moom.vF.g ^ 67381538250251L);
    life4_5 = moom.vB.b();
    spill1351_0 = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a__vG())).a__Boolean();
    if (!((life4_5 != 0))) {
        lexicalValue1351_16_0 = ((spill1351_0) ? 1 : 0);
        break lexical_join_16;
    }
    if (!(spill1351_0)) {
        break lexical_join_17;
    }
    lexicalValue1351_16_0 = ((((java.util.Set)(this.d)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1351_16_0);
    }
    life5_29 = ((java.util.Collection)(((com.google.common.collect.Multimap)(((moom.vF)(this)).c)).get(((java.lang.Object)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a__vG()))))).iterator();
    lexical_cycle_24: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!(((java.util.Iterator)(life5_29)).hasNext())) {
        break lexical_join_43;
    }
    life6_36 = ((net.minecraft.entity.ai.attributes.IAttribute)(((java.util.Iterator)(life5_29)).next()));
    life7_40 = ((moom.vF)(this)).a__vI(((net.minecraft.entity.ai.attributes.IAttribute)(life6_36)));
    spill1351_1 = life7_40;
    if (!((life4_5 != 0))) {
        lexicalValue1351_40_0 = spill1351_1;
        break lexical_join_40;
    }
    if (!((spill1351_1 != null))) {
        break lexical_join_41;
    }
    lexicalValue1351_40_0 = life7_40;
    }
    ((moom.vI)(lexicalValue1351_40_0)).b__Void();
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    return;
}


public java.util.Set<net.minecraft.entity.ai.attributes.IAttributeInstance> a() {
return this.d;
}

}
