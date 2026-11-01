package com.moon;


public class nB {

private java.util.List<com.moon.ny> a;

private com.moon.nX b;

private float c;

private float d;

private float e;

private float f;

private com.moon.ny g;

private int h;

private static long i;

public nB(float p0, float p1, float p2, float p3, java.lang.String p4, com.moon.ny[] p5) { super(); }


private static void __sourceConstructorBody_59ed7b7bba031bce(com.moon.nB receiver, float p0, float p1, float p2, float p3, java.lang.String p4, com.moon.ny[] p5) throws Throwable {

long local7_life1 = (com.moon.nB.i ^ 60475411706841L);

    com.moon.nB.__sourceConstructorInit_59ed7b7bba031bce_0(((com.moon.nB)(receiver)));

    ((com.moon.nB)(receiver)).a = ((java.util.List)(new java.util.ArrayList()));

    ((com.moon.nB)(receiver)).b = ((com.moon.nX)(new com.moon.nX()));

    ((com.moon.nB)(receiver)).c = ((float)(p0));

    ((com.moon.nB)(receiver)).d = ((float)(p1));

    ((com.moon.nB)(receiver)).e = ((float)(p2));

    net.minecraft.entity.Entity[] __sourceSpill229_10 = com.moon.ny.b__Arrayr3();

    ((com.moon.nB)(receiver)).f = ((float)(p3));

    ((com.moon.nB)(receiver)).g = ((com.moon.ny)(((com.moon.ny)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(java.util.Arrays.stream(((java.lang.Object[])(p5))))).filter(((java.util.function.Predicate)(__sourceIntrinsic_59ed7b7bba031bce_originalDynamicSite229_12(p4)))))).findFirst())).orElse(((java.lang.Object)((p5)[0])))))));

    ((com.moon.nB)(receiver)).h = ((int)(((com.moon.ny)(((com.moon.nB)(receiver)).g)).a__Int()));

    net.minecraft.entity.Entity[] local9_life21 = __sourceSpill229_10;

    ((java.util.List)(((com.moon.nB)(receiver)).a)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(p5))))));

    ((com.moon.nX)(((com.moon.nB)(receiver)).b)).a(((float)((((float) ((com.moon.nB)(receiver)).h) * p2))));

    if ((local9_life21 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));

    }

    return;

}



static {
com.moon.nB.i = (moom._c.a(6350267775926181405L, 2253836424140439193L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(176831415226730L);
}

private static native <E extends Throwable> void __sourceConstructorInit_59ed7b7bba031bce_0(com.moon.nB a0) throws E;

public float b() {
return this.d;
}


public float c() {
return this.e;
}


public float d() {
return this.f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.ny a__ny() {
return this.g;
}


public int a__Int() {
return this.h;
}


public void a(com.v p0, int p1, int p2) {
int lexicalValue274_121_0;
    com.moon.ny lexicalValue274_125_0;
    net.minecraft.entity.Entity[] spill274_0;
    int spill274_1;
    com.moon.ny spill274_2;
    long life4_3;
    float life7_12;
    net.minecraft.entity.Entity[] life6_13;
    float life8_25;
    java.util.Iterator life9_29;
    com.moon.ny life10_36;
    com.moon.ny life10_98;
    lexical_join_136: {
    lexical_join_131: {
    lexical_join_89: {
    lexical_join_85: {
    life4_3 = (com.moon.nB.i ^ 8158652950297L);
    spill274_0 = com.moon.ny.b__Arrayr3();
    life7_12 = (((float) (-this.h)) * this.e);
    life6_13 = spill274_0;
    ((com.moon.nX)(this.b)).a(((float)(life7_12)), ((double)(0x1.333334p-2d)));
    life8_25 = (this.c + ((com.moon.nX)(this.b)).b());
    life9_29 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_30: while (true) {
    if (!(((java.util.Iterator)(life9_29)).hasNext())) {
        break lexical_join_85;
    }
    life10_36 = ((com.moon.ny)(((java.util.Iterator)(life9_29)).next()));
    ((com.moon.ny)(life10_36)).a(((float)(life8_25)));
    ((com.moon.ny)(life10_36)).b(((float)(this.d)));
    ((com.moon.ny)(life10_36)).c(((float)(this.e)));
    ((com.moon.ny)(life10_36)).d(((float)(this.f)));
    ((com.moon.ny)(life10_36)).e(((float)(this.c)));
    ((com.moon.ny)(life10_36)).f(((float)(this.d)));
    ((com.moon.ny)(life10_36)).g(((float)(this.e)));
    ((com.moon.ny)(life10_36)).h(((float)(this.f)));
    life8_25 = (life8_25 + this.e);
    if (!((life6_13 == null))) {
        break lexical_join_89;
    }
    if (!((life6_13 != null))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    life9_29 = ((java.util.List)(this.a)).iterator();
    }
    lexical_cycle_89: while (true) {
    lexical_join_125: {
    lexical_join_124: {
    lexical_join_121: {
    if (!(((java.util.Iterator)(life9_29)).hasNext())) {
        break lexical_join_131;
    }
    life10_98 = ((com.moon.ny)(((java.util.Iterator)(life9_29)).next()));
    spill274_1 = recovery.source.CarrierOps.fcmpg(((float)(((((com.moon.ny)(life10_98)).a() + ((com.moon.ny)(life10_98)).c()) - 0x1.0p0f))), ((float)(this.c)));
    if (!((life6_13 == null))) {
        lexicalValue274_121_0 = spill274_1;
        break lexical_join_121;
    }
    if (!((spill274_1 >= 0))) { continue lexical_cycle_89; }
    spill274_2 = life10_98;
    if (!((life6_13 == null))) {
        lexicalValue274_125_0 = spill274_2;
        break lexical_join_125;
    }
    lexicalValue274_121_0 = recovery.source.CarrierOps.fcmpl(((float)((((com.moon.ny)(spill274_2)).a() + 0x1.0p0f))), ((float)((this.c + this.e))));
    }
    if (!((lexicalValue274_121_0 > 0))) {
        break lexical_join_124;
    }
    if (!((life6_13 != null))) { continue lexical_cycle_89; }
    }
    lexicalValue274_125_0 = life10_98;
    }
    ((com.moon.ny)(lexicalValue274_125_0)).a(((com.v)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_13 != null))) { continue lexical_cycle_89; }
    break lexical_cycle_89;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_136;
    }
    com.moon.ny.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));
    }
    return;
}


public com.moon.nX a__nX() {
return this.b;
}


public java.util.List<com.moon.ny> a__List() {
return this.a;
}


public float a() {
return this.c;
}


public void a(int p0, int p1, int p2) {
((com.moon.ny)(this.g)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a(java.lang.String p0) {
java.lang.Object forwardValue1014_24_0;
    java.lang.String spill1014_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.moon.ny life5_30;
    forward_join_39: {
    forward_join_31: {
    forward_join_24: {
    forward_join_15: {
    life2_3 = (com.moon.nB.i ^ 8292852604775L);
    life4_5 = com.moon.ny.b__Arrayr3();
    spill1014_0 = ((com.moon.ny)(this.g)).a__String();
    if (!((life4_5 == null))) {
        forwardValue1014_24_0 = spill1014_0;
        break forward_join_24;
    }
    if (!(((java.lang.String)(spill1014_0)).equals(((java.lang.Object)(p0))))) {
        break forward_join_15;
    }
    return;
    }
    forwardValue1014_24_0 = ((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(this.a)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_474b89cf9bbb_invokedynamic1014_7(p0)))))).findFirst())).orElse(((java.lang.Object)(null)));
    }
    life5_30 = ((com.moon.ny)(forwardValue1014_24_0));
    if (!((life4_5 == null))) {
        break forward_join_39;
    }
    if (!((life5_30 == null))) {
        break forward_join_31;
    }
    return;
    }
    this.g = ((com.moon.ny)(life5_30));
    this.h = ((int)(((com.moon.ny)(this.g)).a__Int()));
    }
    return;
}


private static boolean lambda$new$0(java.lang.String p0, com.moon.ny p1) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(((com.moon.ny)(p1)).a__String())).equalsIgnoreCase(((java.lang.String)(p0))))) != 0);
}


private static boolean lambda$updateTab$1(java.lang.String p0, com.moon.ny p1) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(((com.moon.ny)(p1)).a__String())).equalsIgnoreCase(((java.lang.String)(p0))))) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_59ed7b7bba031bce_originalDynamicSite229_12(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_474b89cf9bbb_invokedynamic1014_7(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
