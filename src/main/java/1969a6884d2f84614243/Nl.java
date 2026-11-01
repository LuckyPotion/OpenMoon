package moom;


public class Nl {

private moom.Nk[] a;

private moom.Lw[] b;

private static long c;

public Nl(moom.Nk[] p0, java.util.Map<java.lang.String, moom.Lu> p1) { super(); }


private static void __sourceConstructorBody_a1285a22d1cb655a(moom.Nl receiver, moom.Nk[] p0, java.util.Map p1) throws Throwable {

moom.Lu __initValue608_39_0;

    long local3_life2;

    java.lang.String local5_life6;

    java.util.ArrayList local6_life8;

    java.util.Iterator local7_life11;

    java.lang.String local8_life15;

    moom.Lu local9_life18;

    moom.Lw local10_life22;

    init_join_54: {

    init_join_47: {

    local3_life2 = (moom.Nl.c ^ 3548245462496L);

    java.lang.String __sourceSpill608_4 = moom.Nq.b__String();

    moom.Nl.__sourceConstructorInit_a1285a22d1cb655a_0(((moom.Nl)(receiver)));

    local5_life6 = __sourceSpill608_4;

    ((moom.Nl)(receiver)).a = ((moom.Nk[])(p0));

    local6_life8 = new java.util.ArrayList();

    local7_life11 = ((java.util.Set)(((java.util.Map)(p1)).keySet())).iterator();

    init_cycle_19: while (true) {

    init_join_45: {

    init_join_39: {

    if (!(((java.util.Iterator)(local7_life11)).hasNext())) {

        break init_join_47;

    }

    local8_life15 = ((java.lang.String)(((java.util.Iterator)(local7_life11)).next()));

    local9_life18 = ((moom.Lu)(((java.util.Map)(p1)).get(((java.lang.Object)(local8_life15)))));

    if (!((local5_life6 != null))) {

        break init_join_54;

    }

    moom.Lu __sourceSpill608_19 = local9_life18;

    if (!((local5_life6 != null))) {

        __initValue608_39_0 = __sourceSpill608_19;

        break init_join_39;

    }

    if (!((((__sourceSpill608_19 instanceof moom.Lw) ? 1 : 0) != 0))) {

        break init_join_45;

    }

    __initValue608_39_0 = local9_life18;

    }

    local10_life22 = ((moom.Lw)(__initValue608_39_0));

    ((java.util.List)(local6_life8)).add(((java.lang.Object)(local10_life22)));

    }

    if (!((local5_life6 == null))) { continue init_cycle_19; }

    break init_cycle_19;

    }

    }

    ((moom.Nl)(receiver)).b = ((moom.Lw[])(((moom.Lw[])(((java.util.List)(local6_life8)).toArray(((java.lang.Object[])(new moom.Lw[0])))))));

    }

    return;

}



static {
moom.Nl.c = (moom._c.a(-5364028308894721795L, 9062837029164335105L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(111170754374273L);
}

private static native <E extends Throwable> void __sourceConstructorInit_a1285a22d1cb655a_0(moom.Nl a0) throws E;

private void b() {
java.lang.String spill1011_0;
    long life1_3;
    moom.Lw[] life4_7;
    int life5_10;
    java.lang.String life3_11;
    int life6_13;
    moom.Lw life7_20;
    lexical_join_26: {
    life1_3 = (moom.Nl.c ^ 115861161032881L);
    spill1011_0 = moom.Nq.b__String();
    life4_7 = this.b;
    life5_10 = (life4_7).length;
    life3_11 = spill1011_0;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    if (!((life6_13 < life5_10))) {
        break lexical_join_26;
    }
    life7_20 = (life4_7)[life6_13];
    ((moom.Lw)(life7_20)).a__Void();
    life6_13 += 1;
    if (!((life3_11 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


public void c() {
java.lang.String spill1012_0;
    long life1_3;
    moom.Nk[] life4_7;
    int life5_10;
    java.lang.String life3_11;
    int life6_13;
    moom.Nk life7_20;
    lexical_join_26: {
    life1_3 = (moom.Nl.c ^ 133554920752766L);
    spill1012_0 = moom.Nq.b__String();
    life4_7 = this.a;
    life5_10 = (life4_7).length;
    life3_11 = spill1012_0;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    if (!((life6_13 < life5_10))) {
        break lexical_join_26;
    }
    life7_20 = (life4_7)[life6_13];
    ((moom.Nk)(life7_20)).b();
    life6_13 += 1;
    if (!((life3_11 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0) {
java.lang.String spill1010_0;
    long life2_3;
    moom.Nk[] life5_7;
    java.lang.String life4_8;
    int life6_11;
    int life7_13;
    moom.Nk life8_20;
    lexical_join_27: {
    life2_3 = (moom.Nl.c ^ 42723982461862L);
    spill1010_0 = moom.Nq.b__String();
    life5_7 = this.a;
    life4_8 = spill1010_0;
    life6_11 = (life5_7).length;
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    if (!((life7_13 < life6_11))) {
        break lexical_join_27;
    }
    life8_20 = (life5_7)[life7_13];
    ((moom.Nk)(life8_20)).a(((int)(p0)));
    life7_13 += 1;
    if (!((life4_8 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


public void a() {
java.lang.String spill1009_0;
    long life1_3;
    moom.Nk[] life4_9;
    java.lang.String life3_10;
    int life5_13;
    int life6_15;
    moom.Nk life7_22;
    lexical_join_28: {
    life1_3 = (moom.Nl.c ^ 139618626981202L);
    spill1009_0 = moom.Nq.b__String();
    ((moom.Nl)(this)).b();
    life4_9 = this.a;
    life3_10 = spill1009_0;
    life5_13 = (life4_9).length;
    life6_15 = 0;
    lexical_cycle_16: while (true) {
    if (!((life6_15 < life5_13))) {
        break lexical_join_28;
    }
    life7_22 = (life4_9)[life6_15];
    ((moom.Nk)(life7_22)).a__Void();
    life6_15 += 1;
    if (!((life3_10 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}

}
