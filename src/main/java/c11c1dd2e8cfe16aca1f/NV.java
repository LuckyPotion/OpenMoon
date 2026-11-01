package moom;


public class NV {

private static final long a;

public NV() {
super();
}


static {
a = (moom._c.a(1638552466149224620L, 6485421255552047661L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(242362092017813L);
}


public static void a(moom.pz[] p0, moom.pz[] p1) {
java.util.HashSet lexicalValue1004_40_0;
    int spill1004_0;
    java.util.HashSet spill1004_1;
    java.util.List spill1004_2;
    java.util.HashSet spill1004_3;
    long life2_3;
    java.util.HashSet life5_7;
    moom.pz[] life6_10;
    int life7_13;
    int life4_14;
    int life8_16;
    moom.pz life9_23;
    java.util.HashSet life6_43;
    java.util.Iterator life7_54;
    moom.pz life8_61;
    java.lang.Integer life9_65;
    lexical_join_72: {
    lexical_join_40: {
    lexical_join_35: {
    life2_3 = (moom.NV.a ^ 78367770426571L);
    life5_7 = new java.util.HashSet();
    spill1004_0 = moom.Ob.b();
    life6_10 = p1;
    life7_13 = (life6_10).length;
    life4_14 = spill1004_0;
    life8_16 = 0;
    lexical_cycle_17: while (true) {
    if (!((life8_16 < life7_13))) {
        break lexical_join_35;
    }
    life9_23 = (life6_10)[life8_16];
    spill1004_1 = life5_7;
    if (!((life4_14 == 0))) {
        lexicalValue1004_40_0 = spill1004_1;
        break lexical_join_40;
    }
    ((java.util.Set)(spill1004_1)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((moom.pz)(life9_23)).b()))))));
    life8_16 += 1;
    if (!((life4_14 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1004_40_0 = new java.util.HashSet(java.util.Arrays.asList(((java.lang.Object[])(p0))));
    }
    life6_43 = lexicalValue1004_40_0;
    spill1004_2 = java.util.Arrays.asList(((java.lang.Object[])(p1)));
    java.util.HashSet __stackOp1004_7_0 = life6_43;
    spill1004_3 = __stackOp1004_7_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp1004_7_0)));
    ((java.util.List)(spill1004_2)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_06239991ff97_invokedynamic1004_9(spill1004_3))));
    life7_54 = ((java.util.Set)(life6_43)).iterator();
    lexical_cycle_52: while (true) {
    lexical_join_70: {
    if (!(((java.util.Iterator)(life7_54)).hasNext())) {
        break lexical_join_72;
    }
    life8_61 = ((moom.pz)(((java.util.Iterator)(life7_54)).next()));
    life9_65 = java.lang.Integer.valueOf(((int)(((moom.pz)(life8_61)).b())));
    if (!(((java.util.Set)(life5_7)).contains(((java.lang.Object)(life9_65))))) {
        break lexical_join_70;
    }
    ((moom.pz)(life8_61)).b(((int)(0)));
    }
    if (!((life4_14 != 0))) { continue lexical_cycle_52; }
    break lexical_cycle_52;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_06239991ff97_invokedynamic1004_9(java.util.HashSet a0) throws E;
}
