package moom;


public class Ne implements moom.Lz {

private java.util.Map<java.lang.String, moom.MU> a;

private static long b;

public Ne(moom.M7[] p0) { super(); }


private static void __sourceConstructorBody_7d4a083155e914a2(moom.Ne receiver, moom.M7[] p0) throws Throwable {

init_join_50: {

    long local2_life2 = (moom.Ne.b ^ 18541429527191L);

    moom.Ne.__sourceConstructorInit_7d4a083155e914a2_0(((moom.Ne)(receiver)));

    ((moom.Ne)(receiver)).a = ((java.util.Map)(new java.util.HashMap()));

    moom.M7[] local5_life5 = p0;

    int[] __sourceSpill605_7 = moom.M7.b__ArrayInt();

    int local6_life8 = (local5_life5).length;

    int[] local4_life9 = __sourceSpill605_7;

    int local7_life10 = 0;

    init_cycle_20: while (true) {

    init_join_48: {

    init_join_47: {

    if (!((local7_life10 < local6_life8))) {

        break init_join_50;

    }

    moom.M7 local8_life11 = (local5_life5)[local7_life10];

    if (!((local4_life9 == null))) {

        break init_join_48;

    }

    if (!((((local8_life11 instanceof moom.Na) ? 1 : 0) != 0))) {

        break init_join_47;

    }

    moom.Na local9_life14 = ((moom.Na)(local8_life11));

    moom.MU local10_life15 = new moom.MU(local9_life14);

    ((java.util.Map)(((moom.Ne)(receiver)).a)).put(((java.lang.Object)(((moom.M7)(local8_life11)).a__String())), ((java.lang.Object)(local10_life15)));

    }

    local7_life10 += 1;

    }

    if (!((local4_life9 != null))) { continue init_cycle_20; }

    break init_cycle_20;

    }

    }

    return;

}



static {
moom.Ne.b = (moom._c.a(-3090392544465110963L, -300223733054388956L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(70836989933937L);
}

private static native <E extends Throwable> void __sourceConstructorInit_7d4a083155e914a2_0(moom.Ne a0) throws E;

public moom.Lu a__Lu(java.lang.String p0) {
return ((moom.Lu)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
