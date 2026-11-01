package moom;


public class ar extends sourcebuild.EnumConstructor<moom.ar> implements net.minecraft.util.IStringSerializable {

public static moom.ar DEAD_BUSH;

public static moom.ar GRASS;

public static moom.ar FERN;

private static moom.ar[] a;

private int b;

private java.lang.String c;

private static moom.ar[] d;

private static long e;

private ar(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-8952117882681108587L)), ((long)(-7266383049508602320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(208310351994469L)))));
    DEAD_BUSH = ((moom.ar)(new moom.ar("DEAD_BUSH", 0, 0, "dead_bush")));
    GRASS = ((moom.ar)(new moom.ar("GRASS", 1, 1, "tall_grass")));
    FERN = ((moom.ar)(new moom.ar("FERN", 2, 2, "fern")));
    d = ((moom.ar[])(moom.ar.a__Arrayar()));
    a = ((moom.ar[])(new moom.ar[(moom.ar.values()).length]));
    moom.ar[] local0_life13 = moom.ar.values();
    int local1_life14 = (local0_life13).length;
    int local2_life15 = 0;
    while ((local2_life15 < local1_life14)) {
        moom.ar local3_life16 = (local0_life13)[local2_life15];
        (moom.ar.a)[((moom.ar)(local3_life16)).a()] = local3_life16;
        local2_life15 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static moom.ar[] values() {
return ((moom.ar[])(((moom.ar[])(moom.ar.d)).clone()));
}


public static moom.ar valueOf(java.lang.String p0) {
return ((moom.ar)(java.lang.Enum.valueOf(((java.lang.Class)(moom.ar.class)), ((java.lang.String)(p0)))));
}


private static moom.ar[] a__Arrayar() {
return new moom.ar[] {moom.ar.DEAD_BUSH, moom.ar.GRASS, moom.ar.FERN};
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.c;
}


public static moom.ar a(int p0) {
int forwardValue2955_17_0;
    int spill2955_0;
    int spill2955_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.ar.e ^ 34449384008139L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill2955_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2955_17_0 = spill2955_0;
        break forward_join_17;
    }
    if (!((spill2955_0 >= 0))) {
        break forward_join_16;
    }
    spill2955_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2955_17_0 = spill2955_1;
        break forward_join_17;
    }
    if (!((spill2955_1 >= (moom.ar.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue2955_17_0 = 0;
    }
    p0 = forwardValue2955_17_0;
    }
    return (moom.ar.a)[p0];
}


public int a() {
return this.b;
}

}
