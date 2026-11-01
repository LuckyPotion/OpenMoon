package moom;


public class vI implements net.minecraft.entity.ai.attributes.IAttributeInstance {

private net.minecraft.entity.ai.attributes.BaseAttributeMap a;

private net.minecraft.entity.ai.attributes.IAttribute b;

private java.util.Map<java.lang.Integer, java.util.Set<moom.vB>> c;

private java.util.Map<java.lang.String, java.util.Set<moom.vB>> d;

private java.util.Map<java.util.UUID, moom.vB> e;

private double f;

private boolean g;

private boolean h;

private double i;

private double j;

private com.moon.module.impl.Camera k;

private static long l;

public vI(net.minecraft.entity.ai.attributes.BaseAttributeMap p0, net.minecraft.entity.ai.attributes.IAttribute p1) { super(); }


private static void __sourceConstructorBody_54acbd1876d28e1f(moom.vI receiver, net.minecraft.entity.ai.attributes.BaseAttributeMap p0, net.minecraft.entity.ai.attributes.IAttribute p1) throws Throwable {

long local3_life2;

    int local5_life12;

    int local6_life19;

    init_join_53: {

    init_join_48: {

    local3_life2 = (moom.vI.l ^ 136918863577791L);

    moom.vI.__sourceConstructorInit_54acbd1876d28e1f_0(((moom.vI)(receiver)));

    int __sourceSpill744_7 = moom.vB.c();

    ((moom.vI)(receiver)).c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((moom.vI)(receiver)).d = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((moom.vI)(receiver)).e = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    local5_life12 = __sourceSpill744_7;

    ((moom.vI)(receiver)).g = ((boolean)(true));

    ((moom.vI)(receiver)).h = ((boolean)(true));

    ((moom.vI)(receiver)).a = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(p0));

    ((moom.vI)(receiver)).b = ((net.minecraft.entity.ai.attributes.IAttribute)(p1));

    ((moom.vI)(receiver)).f = ((double)(((net.minecraft.entity.ai.attributes.IAttribute)(p1)).a()));

    local6_life19 = 0;

    init_cycle_35: while (true) {

    if (!((local6_life19 < 3))) {

        break init_join_48;

    }

    ((java.util.Map)(((moom.vI)(receiver)).c)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(local6_life19))))), ((java.lang.Object)(com.google.common.collect.Sets.newHashSet())));

    local6_life19 += 1;

    if (!((local5_life12 != 0))) { continue init_cycle_35; }

    break init_cycle_35;

    }

    }

    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {

        break init_join_53;

    }

    local5_life12 += 1;

    moom.vB.b(((int)(local5_life12)));

    }

    return;

}



static {
moom.vI.l = (moom._c.a(-9203537814680648675L, 9003753870908476472L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(278833909041852L);
}

private static native <E extends Throwable> void __sourceConstructorInit_54acbd1876d28e1f_0(moom.vI a0) throws E;

public double b() {
moom.vI forwardValue4297_20_0;
    moom.vI spill4297_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.vI.l ^ 68596910365838L);
    life3_5 = moom.vB.b();
    spill4297_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4297_20_0 = spill4297_0;
        break forward_join_20;
    }
    if (!(((moom.vI)(spill4297_0)).g)) {
        break forward_join_19;
    }
    this.i = ((double)(((moom.vI)(this)).a(((boolean)(false)))));
    this.g = ((boolean)(false));
    }
    forwardValue4297_20_0 = this;
    }
    return ((moom.vI)(forwardValue4297_20_0)).i;
}


private java.util.Collection<moom.vB> b(int p0) {
int spill1358_0;
    long life2_3;
    java.util.HashSet life5_8;
    net.minecraft.entity.ai.attributes.IAttribute life6_13;
    int life4_14;
    net.minecraft.entity.ai.attributes.IAttributeInstance life7_21;
    lexical_join_37: {
    life2_3 = (moom.vI.l ^ 105452740981692L);
    life5_8 = com.google.common.collect.Sets.newHashSet(((java.lang.Iterable)(((moom.vI)(this)).a(((int)(p0))))));
    spill1358_0 = moom.vB.b();
    life6_13 = ((net.minecraft.entity.ai.attributes.IAttribute)(this.b)).a__vG();
    life4_14 = spill1358_0;
    lexical_cycle_15: while (true) {
    lexical_join_35: {
    lexical_join_32: {
    if (!((life6_13 != null))) {
        break lexical_join_37;
    }
    life7_21 = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(this.a)).a(((net.minecraft.entity.ai.attributes.IAttribute)(life6_13)));
    if (!((life4_14 != 0))) {
        break lexical_join_35;
    }
    if (!((life7_21 != null))) {
        break lexical_join_32;
    }
    ((java.util.Set)(life5_8)).addAll(((java.util.Collection)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(life7_21)).a(((int)(p0))))));
    }
    life6_13 = ((net.minecraft.entity.ai.attributes.IAttribute)(life6_13)).a__vG();
    }
    if (!((life4_14 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life5_8;
}


protected void b__Void() {
this.g = ((boolean)(true));
    this.h = ((boolean)(true));
    ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(this.a)).a(((net.minecraft.entity.ai.attributes.IAttributeInstance)(this)));
    return;
}


public void b(moom.vB p0) {
java.util.Set lexicalValue1359_33_0;
    java.lang.Object lexicalValue1359_58_0;
    int spill1359_0;
    java.util.Set spill1359_1;
    java.util.Set spill1359_2;
    java.util.Set spill1359_3;
    long life2_3;
    int life5_6;
    int life4_7;
    java.util.Set life6_17;
    java.util.Set life5_36;
    lexical_join_58: {
    lexical_join_53: {
    lexical_join_33: {
    lexical_join_27: {
    life2_3 = (moom.vI.l ^ 133120250174785L);
    spill1359_0 = moom.vB.c();
    life5_6 = 0;
    life4_7 = spill1359_0;
    lexical_cycle_8: while (true) {
    if (!((life5_6 < 3))) {
        break lexical_join_27;
    }
    life6_17 = ((java.util.Set)(((java.util.Map)(this.c)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life5_6))))))));
    spill1359_1 = life6_17;
    if (!((life4_7 == 0))) {
        lexicalValue1359_33_0 = spill1359_1;
        break lexical_join_33;
    }
    ((java.util.Set)(spill1359_1)).remove(((java.lang.Object)(p0)));
    life5_6 += 1;
    if (!((life4_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue1359_33_0 = ((java.util.Set)(((java.util.Map)(this.d)).get(((java.lang.Object)(((moom.vB)(p0)).a__String())))));
    }
    life5_36 = lexicalValue1359_33_0;
    spill1359_2 = life5_36;
    if (!((life4_7 == 0))) {
        lexicalValue1359_58_0 = spill1359_2;
        break lexical_join_58;
    }
    if (!((spill1359_2 != null))) {
        break lexical_join_53;
    }
    ((java.util.Set)(life5_36)).remove(((java.lang.Object)(p0)));
    spill1359_3 = life5_36;
    if (!((life4_7 == 0))) {
        lexicalValue1359_58_0 = spill1359_3;
        break lexical_join_58;
    }
    if (!(((java.util.Set)(spill1359_3)).isEmpty())) {
        break lexical_join_53;
    }
    ((java.util.Map)(this.d)).remove(((java.lang.Object)(((moom.vB)(p0)).a__String())));
    }
    lexicalValue1359_58_0 = ((java.util.Map)(this.e)).remove(((java.lang.Object)(((moom.vB)(p0)).a__UUID())));
    }
    recovery.source.CarrierOps.discard(lexicalValue1359_58_0);
    ((moom.vI)(this)).b__Void();
    return;
}


public double c() {
moom.vI forwardValue4300_20_0;
    moom.vI spill4300_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.vI.l ^ 86125008512469L);
    life3_5 = moom.vB.c();
    spill4300_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4300_20_0 = spill4300_0;
        break forward_join_20;
    }
    if (!(((moom.vI)(spill4300_0)).h)) {
        break forward_join_19;
    }
    this.j = ((double)(((moom.vI)(this)).a(((boolean)(true)))));
    this.h = ((boolean)(false));
    }
    forwardValue4300_20_0 = this;
    }
    return ((moom.vI)(forwardValue4300_20_0)).j;
}


public void a(boolean p0, java.util.Collection<moom.vB> p1) {
java.util.Collection lexicalValue1355_14_0;
    int lexicalValue1355_39_0;
    moom.vI lexicalValue1355_43_0;
    int spill1355_0;
    java.util.Collection spill1355_1;
    boolean spill1355_2;
    moom.vI spill1355_3;
    long life3_3;
    java.util.Collection life6_7;
    int life5_8;
    java.util.Iterator life7_19;
    moom.vB life8_26;
    lexical_join_47: {
    lexical_join_14: {
    life3_3 = (moom.vI.l ^ 78040264746775L);
    spill1355_0 = moom.vB.b();
    life6_7 = ((moom.vI)(this)).a__Collection();
    life5_8 = spill1355_0;
    spill1355_1 = life6_7;
    if (!((life5_8 != 0))) {
        lexicalValue1355_14_0 = spill1355_1;
        break lexical_join_14;
    }
    if (!((spill1355_1 != null))) {
        break lexical_join_47;
    }
    lexicalValue1355_14_0 = life6_7;
    }
    life7_19 = ((java.util.ArrayList)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(lexicalValue1355_14_0))))).iterator();
    lexical_cycle_17: while (true) {
    lexical_join_45: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_39: {
    if (!(((java.util.Iterator)(life7_19)).hasNext())) {
        break lexical_join_47;
    }
    life8_26 = ((moom.vB)(((java.util.Iterator)(life7_19)).next()));
    if (!((life5_8 != 0))) {
        break lexical_join_45;
    }
    if (!((((moom.vB)(life8_26)).a__UUID() == net.minecraft.entity.EntityLivingBase.aF))) {
        break lexical_join_42;
    }
    spill1355_2 = p0;
    if (!((life5_8 != 0))) {
        lexicalValue1355_39_0 = ((spill1355_2) ? 1 : 0);
        break lexical_join_39;
    }
    if (!((!spill1355_2))) {
        break lexical_join_42;
    }
    spill1355_3 = this;
    if (!((life5_8 != 0))) {
        lexicalValue1355_43_0 = spill1355_3;
        break lexical_join_43;
    }
    lexicalValue1355_39_0 = ((((moom.vI)(spill1355_3)).a(((java.util.Collection)(p1)))) ? 1 : 0);
    }
    if (!((lexicalValue1355_39_0 == 0))) {
        break lexical_join_42;
    }
    if (!((life5_8 == 0))) { continue lexical_cycle_17; }
    }
    lexicalValue1355_43_0 = this;
    }
    ((moom.vI)(lexicalValue1355_43_0)).b(((moom.vB)(life8_26)));
    }
    if (!((life5_8 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private boolean a__Boolean() {
com.moon.module.impl.Camera forwardValue4294_20_0;
    int forwardValue4294_34_0;
    int forwardValue4294_36_0;
    com.moon.module.impl.Camera spill4294_0;
    boolean spill4294_1;
    boolean spill4294_2;
    long life1_3;
    int life3_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_20: {
    forward_join_18: {
    life1_3 = (moom.vI.l ^ 119821284835754L);
    life3_5 = moom.vB.c();
    spill4294_0 = this.k;
    if (!((life3_5 == 0))) {
        forwardValue4294_20_0 = spill4294_0;
        break forward_join_20;
    }
    if (!((spill4294_0 == null))) {
        break forward_join_18;
    }
    this.k = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    forwardValue4294_20_0 = this.k;
    }
    spill4294_1 = ((com.moon.module.impl.Camera)(forwardValue4294_20_0)).isEnabled();
    if (!((life3_5 == 0))) {
        forwardValue4294_34_0 = ((spill4294_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill4294_1)) {
        break forward_join_33;
    }
    spill4294_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(this.k)).I)).getValue())))).booleanValue();
    if (!((life3_5 == 0))) {
        forwardValue4294_34_0 = ((spill4294_2) ? 1 : 0);
        break forward_join_34;
    }
    if (!((!spill4294_2))) {
        break forward_join_35;
    }
    }
    forwardValue4294_34_0 = 1;
    }
    forwardValue4294_36_0 = forwardValue4294_34_0;
    break forward_join_36;
    }
    forwardValue4294_36_0 = 0;
    }
    return ((forwardValue4294_36_0) != 0);
}


private boolean a(java.util.Collection<moom.vB> p0) {
int lexicalValue1353_26_0;
    int lexicalValue1353_30_0;
    int spill1353_0;
    boolean spill1353_1;
    long life2_3;
    java.util.Iterator life5_7;
    int life4_8;
    moom.vB life6_15;
    lexical_join_30: {
    lexical_join_29: {
    life2_3 = (moom.vI.l ^ 83219405560314L);
    spill1353_0 = moom.vB.c();
    life5_7 = ((java.util.Collection)(p0)).iterator();
    life4_8 = spill1353_0;
    lexical_cycle_9: while (true) {
    lexical_join_27: {
    lexical_join_26: {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_29;
    }
    life6_15 = ((moom.vB)(((java.util.Iterator)(life5_7)).next()));
    spill1353_1 = ((java.util.UUID)(((moom.vB)(life6_15)).a__UUID())).equals(((java.lang.Object)(net.minecraft.entity.EntityLivingBase.aF)));
    if (!((life4_8 == 0))) {
        lexicalValue1353_30_0 = ((spill1353_1) ? 1 : 0);
        break lexical_join_30;
    }
    if (!((life4_8 == 0))) {
        lexicalValue1353_26_0 = ((spill1353_1) ? 1 : 0);
        break lexical_join_26;
    }
    if (!(spill1353_1)) {
        break lexical_join_27;
    }
    lexicalValue1353_26_0 = 1;
    }
    return ((lexicalValue1353_26_0) != 0);
    }
    if (!((life4_8 != 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    lexicalValue1353_30_0 = 0;
    }
    return ((lexicalValue1353_30_0) != 0);
}


private double a(boolean p0) {
double lexicalValue1354_31_0;
    int lexicalValue1354_84_0;
    double lexicalValue1354_92_0;
    double lexicalValue1354_92_1;
    double lexicalValue1354_100_0;
    int spill1354_0;
    double spill1354_1;
    double spill1354_2;
    double spill1354_3;
    boolean spill1354_4;
    long life2_3;
    double life5_7;
    int life4_8;
    java.util.Iterator life7_13;
    moom.vB life8_20;
    double life7_31;
    java.util.Iterator life9_36;
    moom.vB life10_43;
    moom.vB life10_69;
    lexical_join_100: {
    lexical_join_96: {
    lexical_join_60: {
    lexical_join_55: {
    lexical_join_31: {
    lexical_join_30: {
    life2_3 = (moom.vI.l ^ 7033549768676L);
    spill1354_0 = moom.vB.b();
    life5_7 = ((moom.vI)(this)).a();
    life4_8 = spill1354_0;
    life7_13 = ((java.util.Collection)(((moom.vI)(this)).b(((int)(0))))).iterator();
    lexical_cycle_14: while (true) {
    if (!(((java.util.Iterator)(life7_13)).hasNext())) {
        break lexical_join_30;
    }
    life8_20 = ((moom.vB)(((java.util.Iterator)(life7_13)).next()));
    spill1354_1 = (life5_7 + ((moom.vB)(life8_20)).a());
    if (!((life4_8 != 0))) {
        lexicalValue1354_31_0 = spill1354_1;
        break lexical_join_31;
    }
    life5_7 = spill1354_1;
    if (!((life4_8 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1354_31_0 = life5_7;
    }
    life7_31 = lexicalValue1354_31_0;
    life9_36 = ((java.util.Collection)(((moom.vI)(this)).b(((int)(1))))).iterator();
    lexical_cycle_37: while (true) {
    if (!(((java.util.Iterator)(life9_36)).hasNext())) {
        break lexical_join_55;
    }
    life10_43 = ((moom.vB)(((java.util.Iterator)(life9_36)).next()));
    life7_31 = (life7_31 + (life5_7 * ((moom.vB)(life10_43)).a()));
    if (!((life4_8 != 0))) {
        break lexical_join_60;
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    life9_36 = ((java.util.Collection)(((moom.vI)(this)).b(((int)(2))))).iterator();
    }
    lexical_cycle_60: while (true) {
    lexical_join_92: {
    lexical_join_87: {
    lexical_join_84: {
    if (!(((java.util.Iterator)(life9_36)).hasNext())) {
        break lexical_join_96;
    }
    life10_69 = ((moom.vB)(((java.util.Iterator)(life9_36)).next()));
    spill1354_2 = (((moom.vB)(life10_69)).a() % 0x1.99999ap-3d);
    if (!((life4_8 != 0))) {
        lexicalValue1354_100_0 = spill1354_2;
        break lexical_join_100;
    }
    spill1354_3 = 0x0.0p0d;
    if (!((life4_8 != 0))) {
        lexicalValue1354_92_0 = spill1354_2;
        lexicalValue1354_92_1 = spill1354_3;
        break lexical_join_92;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1354_2)), ((double)(spill1354_3))) == 0))) {
        break lexical_join_87;
    }
    spill1354_4 = ((moom.vI)(this)).a__Boolean();
    if (!((life4_8 != 0))) {
        lexicalValue1354_84_0 = ((spill1354_4) ? 1 : 0);
        break lexical_join_84;
    }
    if (!((!spill1354_4))) {
        break lexical_join_87;
    }
    lexicalValue1354_84_0 = ((p0) ? 1 : 0);
    }
    if (!((lexicalValue1354_84_0 != 0))) {
        break lexical_join_87;
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_60; }
    }
    lexicalValue1354_92_0 = life7_31;
    lexicalValue1354_92_1 = (0x1.0p0d + ((moom.vB)(life10_69)).a());
    }
    life7_31 = (lexicalValue1354_92_0 * lexicalValue1354_92_1);
    if (!((life4_8 == 0))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    lexicalValue1354_100_0 = ((net.minecraft.entity.ai.attributes.IAttribute)(this.b)).a(((double)(life7_31)));
    }
    return lexicalValue1354_100_0;
}


public java.util.Collection<moom.vB> a__Collection() {
java.util.HashSet lexicalValue1356_25_0;
    int spill1356_0;
    java.util.HashSet spill1356_1;
    long life1_3;
    java.util.HashSet life4_5;
    int life5_8;
    int life3_9;
    lexical_join_25: {
    lexical_join_24: {
    life1_3 = (moom.vI.l ^ 5289307631948L);
    life4_5 = com.google.common.collect.Sets.newHashSet();
    spill1356_0 = moom.vB.b();
    life5_8 = 0;
    life3_9 = spill1356_0;
    lexical_cycle_10: while (true) {
    if (!((life5_8 < 3))) {
        break lexical_join_24;
    }
    spill1356_1 = life4_5;
    if (!((life3_9 != 0))) {
        lexicalValue1356_25_0 = spill1356_1;
        break lexical_join_25;
    }
    ((java.util.Set)(spill1356_1)).addAll(((java.util.Collection)(((moom.vI)(this)).a(((int)(life5_8))))));
    life5_8 += 1;
    if (!((life3_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1356_25_0 = life4_5;
    }
    return lexicalValue1356_25_0;
}


public java.util.Collection<moom.vB> a(int p0) {
return ((java.util.Collection)(((java.util.Map)(this.c)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
}


public void a(double p0) {
long life3_3;
    int life5_5;
    forward_join_18: {
    forward_join_16: {
    life3_3 = (moom.vI.l ^ 133298064457564L);
    life5_5 = moom.vB.b();
    if (!((life5_5 != 0))) { break forward_join_16; }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(((moom.vI)(this)).a()))) != 0))) { break forward_join_18; }
    this.f = ((double)(p0));
    }
    ((moom.vI)(this)).b__Void();
    }
    return;
}


public double a() {
return this.f;
}


public net.minecraft.entity.ai.attributes.IAttribute a__vG() {
return this.b;
}


public void a(moom.vB p0) {
java.lang.Object forwardValue4291_24_0;
    moom.vB spill4291_0;
    long life2_3;
    int life4_5;
    java.util.Set life5_30;
    forward_join_54: {
    forward_join_24: {
    forward_join_18: {
    life2_3 = (moom.vI.l ^ 19978362131803L);
    life4_5 = moom.vB.b();
    spill4291_0 = ((moom.vI)(this)).a(((java.util.UUID)(((moom.vB)(p0)).a__UUID())));
    if (!((life4_5 != 0))) {
        forwardValue4291_24_0 = spill4291_0;
        break forward_join_24;
    }
    if (!((spill4291_0 != null))) {
        break forward_join_18;
    }
    throw new java.lang.IllegalArgumentException("Modifier is already applied on this attribute!");
    }
    forwardValue4291_24_0 = ((java.util.Map)(this.d)).computeIfAbsent(((java.lang.Object)(((moom.vB)(p0)).a__String())), ((java.util.function.Function)(__sourceIntrinsic_6127af309c22_invokedynamic4291_6())));
    }
    life5_30 = ((java.util.Set)(forwardValue4291_24_0));
    ((java.util.Set)(((java.util.Set)(((java.util.Map)(this.c)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((moom.vB)(p0)).a__Int())))))))))).add(((java.lang.Object)(p0)));
    ((java.util.Set)(life5_30)).add(((java.lang.Object)(p0)));
    ((java.util.Map)(this.e)).put(((java.lang.Object)(((moom.vB)(p0)).a__UUID())), ((java.lang.Object)(p0)));
    ((moom.vI)(this)).b__Void();
    if (!((life4_5 == 0))) {
        break forward_join_54;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public void a__Void() {
java.util.Collection lexicalValue1357_14_0;
    int spill1357_0;
    java.util.Collection spill1357_1;
    long life1_3;
    java.util.Collection life4_7;
    int life3_8;
    java.util.Iterator life5_19;
    moom.vB life6_26;
    lexical_join_29: {
    lexical_join_14: {
    life1_3 = (moom.vI.l ^ 17304527072339L);
    spill1357_0 = moom.vB.b();
    life4_7 = ((moom.vI)(this)).a__Collection();
    life3_8 = spill1357_0;
    spill1357_1 = life4_7;
    if (!((life3_8 != 0))) {
        lexicalValue1357_14_0 = spill1357_1;
        break lexical_join_14;
    }
    if (!((spill1357_1 != null))) {
        break lexical_join_29;
    }
    lexicalValue1357_14_0 = life4_7;
    }
    life5_19 = ((java.util.ArrayList)(com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(lexicalValue1357_14_0))))).iterator();
    lexical_cycle_17: while (true) {
    if (!(((java.util.Iterator)(life5_19)).hasNext())) {
        break lexical_join_29;
    }
    life6_26 = ((moom.vB)(((java.util.Iterator)(life5_19)).next()));
    ((moom.vI)(this)).b(((moom.vB)(life6_26)));
    if (!((life3_8 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public boolean a__Boolean(moom.vB p0) {
long local2 = (moom.vI.l ^ 30289698907076L);
    return ((((((java.util.Map)(this.e)).get(((java.lang.Object)(((moom.vB)(p0)).a__UUID()))) != null) ? 1 : 0)) != 0);
}


public moom.vB a(java.util.UUID p0) {
return ((moom.vB)(((java.util.Map)(this.e)).get(((java.lang.Object)(p0)))));
}


private static java.util.Set lambda$applyModifier$0(java.lang.String p0) {
return com.google.common.collect.Sets.newHashSet();
}


private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_6127af309c22_invokedynamic4291_6() throws E;
}
