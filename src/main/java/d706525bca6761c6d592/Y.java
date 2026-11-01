package moom;


public class Y extends sourcebuild.EnumConstructor<moom.Y> implements net.minecraft.util.IStringSerializable {

public static moom.Y DEFAULT;

public static moom.Y CHISELED;

public static moom.Y SMOOTH;

private static moom.Y[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static moom.Y[] e;

private static long f;

private Y(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(-4659877903707864192L)), ((long)(3385122023754043849L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(111303572301388L)))));
    DEFAULT = ((moom.Y)(new moom.Y("DEFAULT", 0, 0, "red_sandstone", "default")));
    CHISELED = ((moom.Y)(new moom.Y("CHISELED", 1, 1, "chiseled_red_sandstone", "chiseled")));
    SMOOTH = ((moom.Y)(new moom.Y("SMOOTH", 2, 2, "smooth_red_sandstone", "smooth")));
    e = ((moom.Y[])(moom.Y.a__ArrayY()));
    a = ((moom.Y[])(new moom.Y[(moom.Y.values()).length]));
    moom.Y[] local0_life13 = moom.Y.values();
    int local1_life14 = (local0_life13).length;
    int local2_life15 = 0;
    while ((local2_life15 < local1_life14)) {
        moom.Y local3_life16 = (local0_life13)[local2_life15];
        (moom.Y.a)[((moom.Y)(local3_life16)).a()] = local3_life16;
        local2_life15 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static moom.Y[] values() {
return ((moom.Y[])(((moom.Y[])(moom.Y.e)).clone()));
}


public static moom.Y valueOf(java.lang.String p0) {
return ((moom.Y)(java.lang.Enum.valueOf(((java.lang.Class)(moom.Y.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.Y[] a__ArrayY() {
return new moom.Y[] {moom.Y.DEFAULT, moom.Y.CHISELED, moom.Y.SMOOTH};
}


public java.lang.String a__String() {
return this.c;
}


public static moom.Y a(int p0) {
int forwardValue2950_17_0;
    int spill2950_0;
    int spill2950_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.Y.f ^ 68062554531082L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill2950_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2950_17_0 = spill2950_0;
        break forward_join_17;
    }
    if (!((spill2950_0 >= 0))) {
        break forward_join_16;
    }
    spill2950_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2950_17_0 = spill2950_1;
        break forward_join_17;
    }
    if (!((spill2950_1 >= (moom.Y.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue2950_17_0 = 0;
    }
    p0 = forwardValue2950_17_0;
    }
    return (moom.Y.a)[p0];
}


public int a() {
return this.b;
}

}
