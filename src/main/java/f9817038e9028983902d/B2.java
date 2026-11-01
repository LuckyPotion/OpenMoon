package moom;


public class B2 {

protected final java.util.Map<moom.BY, net.minecraft.util.TupleIntJsonSerializable> a;

private static final long h;

public B2() {
super();
    this.a = com.google.common.collect.Maps.newConcurrentMap();
}


static {
h = (moom._c.a(2378588962144387629L, -2887240564145315208L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(127809000510927L);
}


public void b(net.minecraft.entity.player.EntityPlayer p0, moom.BY p1, int p2) {
net.minecraft.util.TupleIntJsonSerializable forwardValue1484_27_0;
    boolean spill1484_0;
    net.minecraft.util.TupleIntJsonSerializable spill1484_1;
    long life4_3;
    net.minecraft.util.TupleIntJsonSerializable life7_10;
    int life6_11;
    forward_join_27: {
    forward_join_26: {
    life4_3 = (moom.B2.h ^ 88255405817721L);
    spill1484_0 = moom.BY.c();
    life7_10 = ((net.minecraft.util.TupleIntJsonSerializable)(((java.util.Map)(this.a)).get(((java.lang.Object)(p1)))));
    life6_11 = ((spill1484_0) ? 1 : 0);
    spill1484_1 = life7_10;
    if (!((life6_11 != 0))) {
        forwardValue1484_27_0 = spill1484_1;
        break forward_join_27;
    }
    if (!((spill1484_1 == null))) {
        break forward_join_26;
    }
    life7_10 = new net.minecraft.util.TupleIntJsonSerializable();
    ((java.util.Map)(this.a)).put(((java.lang.Object)(p1)), ((java.lang.Object)(life7_10)));
    }
    forwardValue1484_27_0 = life7_10;
    }
    ((net.minecraft.util.TupleIntJsonSerializable)(forwardValue1484_27_0)).a(((int)(p2)));
    return;
}


public boolean b(moom.BZ p0) {
int forwardValue1483_17_0;
    int forwardValue1483_19_0;
    boolean spill1483_0;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.B2.h ^ 115846601433443L);
    life4_5 = ((moom.BY.b__Boolean()) ? 1 : 0);
    if (!((((moom.BZ)(p0)).p != null))) {
        break forward_join_16;
    }
    spill1483_0 = ((moom.B2)(this)).a__Boolean(((moom.BZ)(((moom.BZ)(p0)).p)));
    if (!((life4_5 == 0))) {
        forwardValue1483_17_0 = ((spill1483_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill1483_0)) {
        break forward_join_18;
    }
    }
    forwardValue1483_17_0 = 1;
    }
    forwardValue1483_19_0 = forwardValue1483_17_0;
    break forward_join_19;
    }
    forwardValue1483_19_0 = 0;
    }
    return ((forwardValue1483_19_0) != 0);
}


public <T extends net.minecraft.util.IJsonSerializable> T a__C7(moom.BY p0) {
net.minecraft.util.TupleIntJsonSerializable forwardValue1482_17_0;
    net.minecraft.util.IJsonSerializable forwardValue1482_20_0;
    boolean spill1482_0;
    net.minecraft.util.TupleIntJsonSerializable spill1482_1;
    long life2_3;
    net.minecraft.util.TupleIntJsonSerializable life5_10;
    int life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (moom.B2.h ^ 105504630402331L);
    spill1482_0 = moom.BY.b__Boolean();
    life5_10 = ((net.minecraft.util.TupleIntJsonSerializable)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
    life4_11 = ((spill1482_0) ? 1 : 0);
    spill1482_1 = life5_10;
    if (!((life4_11 == 0))) {
        forwardValue1482_17_0 = spill1482_1;
        break forward_join_17;
    }
    if (!((spill1482_1 != null))) {
        break forward_join_19;
    }
    forwardValue1482_17_0 = life5_10;
    }
    forwardValue1482_20_0 = ((net.minecraft.util.TupleIntJsonSerializable)(forwardValue1482_17_0)).a__C7();
    break forward_join_20;
    }
    forwardValue1482_20_0 = null;
    }
    return ((T)(forwardValue1482_20_0));
}


public <T extends net.minecraft.util.IJsonSerializable> T a(moom.BY p0, T p1) {
net.minecraft.util.TupleIntJsonSerializable forwardValue1478_27_0;
    boolean spill1478_0;
    net.minecraft.util.TupleIntJsonSerializable spill1478_1;
    long life3_3;
    net.minecraft.util.TupleIntJsonSerializable life6_10;
    int life5_11;
    forward_join_27: {
    forward_join_26: {
    life3_3 = (moom.B2.h ^ 52462539650093L);
    spill1478_0 = moom.BY.b__Boolean();
    life6_10 = ((net.minecraft.util.TupleIntJsonSerializable)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
    life5_11 = ((spill1478_0) ? 1 : 0);
    spill1478_1 = life6_10;
    if (!((life5_11 == 0))) {
        forwardValue1478_27_0 = spill1478_1;
        break forward_join_27;
    }
    if (!((spill1478_1 == null))) {
        break forward_join_26;
    }
    life6_10 = new net.minecraft.util.TupleIntJsonSerializable();
    ((java.util.Map)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life6_10)));
    }
    forwardValue1478_27_0 = life6_10;
    }
    ((net.minecraft.util.TupleIntJsonSerializable)(forwardValue1478_27_0)).a(((net.minecraft.util.IJsonSerializable)(p1)));
    return p1;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(moom.BZ p0) {
int forwardValue1481_13_0;
    int forwardValue1481_15_0;
    int spill1481_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.B2.h ^ 37768770840286L);
    life4_5 = ((moom.BY.c()) ? 1 : 0);
    spill1481_0 = this.a(((moom.BY)(p0)));
    if (!((life4_5 != 0))) {
        forwardValue1481_13_0 = spill1481_0;
        break forward_join_13;
    }
    if (!((spill1481_0 > 0))) {
        break forward_join_14;
    }
    forwardValue1481_13_0 = 1;
    }
    forwardValue1481_15_0 = forwardValue1481_13_0;
    break forward_join_15;
    }
    forwardValue1481_15_0 = 0;
    }
    return ((forwardValue1481_15_0) != 0);
}


public int a(moom.BY p0) {
net.minecraft.util.TupleIntJsonSerializable forwardValue1477_19_0;
    int forwardValue1477_20_0;
    boolean spill1477_0;
    net.minecraft.util.TupleIntJsonSerializable spill1477_1;
    long life2_3;
    net.minecraft.util.TupleIntJsonSerializable life5_10;
    int life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.B2.h ^ 133647898713175L);
    spill1477_0 = moom.BY.c();
    life5_10 = ((net.minecraft.util.TupleIntJsonSerializable)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
    life4_11 = ((spill1477_0) ? 1 : 0);
    spill1477_1 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue1477_19_0 = spill1477_1;
        break forward_join_19;
    }
    if (!((spill1477_1 == null))) {
        break forward_join_18;
    }
    forwardValue1477_20_0 = 0;
    break forward_join_20;
    }
    forwardValue1477_19_0 = life5_10;
    }
    forwardValue1477_20_0 = ((net.minecraft.util.TupleIntJsonSerializable)(forwardValue1477_19_0)).a();
    }
    return forwardValue1477_20_0;
}


public void a(net.minecraft.entity.player.EntityPlayer p0, moom.BY p1, int p2) {
int forwardValue1480_17_0;
    moom.B2 forwardValue1480_19_0;
    boolean spill1480_0;
    moom.B2 spill1480_1;
    long life4_3;
    int life6_5;
    forward_join_27: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life4_3 = (moom.B2.h ^ 47871092430874L);
    life6_5 = ((moom.BY.b__Boolean()) ? 1 : 0);
    spill1480_0 = ((moom.BY)(p1)).a__Boolean();
    if (!((life6_5 == 0))) {
        forwardValue1480_17_0 = ((spill1480_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill1480_0)) {
        break forward_join_18;
    }
    spill1480_1 = this;
    if (!((life6_5 == 0))) {
        forwardValue1480_19_0 = spill1480_1;
        break forward_join_19;
    }
    forwardValue1480_17_0 = ((((moom.B2)(spill1480_1)).b(((moom.BZ)(((moom.BZ)(p1)))))) ? 1 : 0);
    }
    if (!((forwardValue1480_17_0 != 0))) {
        break forward_join_27;
    }
    }
    forwardValue1480_19_0 = this;
    }
    ((moom.B2)(forwardValue1480_19_0)).b(((net.minecraft.entity.player.EntityPlayer)(p0)), ((moom.BY)(p1)), ((int)((this.a(((moom.BY)(p1))) + p2))));
    }
    return;
}


public int a(moom.BZ p0) {
int lexicalValue492_15_0;
    int lexicalValue492_36_0;
    boolean spill492_0;
    boolean spill492_1;
    long life2_3;
    int life4_5;
    int life5_20;
    moom.BZ life6_23;
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_15: {
    lexical_join_14: {
    life2_3 = (moom.B2.h ^ 43732711151428L);
    life4_5 = ((moom.BY.b__Boolean()) ? 1 : 0);
    spill492_0 = ((moom.B2)(this)).a__Boolean(((moom.BZ)(p0)));
    if (!((life4_5 == 0))) {
        lexicalValue492_15_0 = ((spill492_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!(spill492_0)) {
        break lexical_join_14;
    }
    return 0;
    }
    lexicalValue492_15_0 = 0;
    }
    life5_20 = lexicalValue492_15_0;
    life6_23 = ((moom.BZ)(p0)).p;
    lexical_cycle_19: while (true) {
    if (!((life6_23 != null))) {
        break lexical_join_35;
    }
    spill492_1 = ((moom.B2)(this)).a__Boolean(((moom.BZ)(life6_23)));
    if (!((life4_5 == 0))) {
        lexicalValue492_36_0 = ((spill492_1) ? 1 : 0);
        break lexical_join_36;
    }
    if (!((life4_5 == 0))) {
        lexicalValue492_36_0 = ((spill492_1) ? 1 : 0);
        break lexical_join_36;
    }
    if (!((!spill492_1))) {
        break lexical_join_35;
    }
    life6_23 = ((moom.BZ)(life6_23)).p;
    life5_20 += 1;
    if (!((life4_5 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue492_36_0 = life5_20;
    }
    return lexicalValue492_36_0;
}

}
