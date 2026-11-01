package moom;


public class ac extends sourcebuild.EnumConstructor<moom.ac> implements net.minecraft.util.IStringSerializable {

public static moom.ac DEFAULT;

public static moom.ac CHISELED;

public static moom.ac SMOOTH;

private static moom.ac[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static moom.ac[] e;

private static long f;

private ac(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(8058176727720996905L)), ((long)(57823330269112968L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(133037997856282L)))));
    DEFAULT = ((moom.ac)(new moom.ac("DEFAULT", 0, 0, "sandstone", "default")));
    CHISELED = ((moom.ac)(new moom.ac("CHISELED", 1, 1, "chiseled_sandstone", "chiseled")));
    SMOOTH = ((moom.ac)(new moom.ac("SMOOTH", 2, 2, "smooth_sandstone", "smooth")));
    e = ((moom.ac[])(moom.ac.a__Arrayac()));
    a = ((moom.ac[])(new moom.ac[(moom.ac.values()).length]));
    moom.ac[] local0_life13 = moom.ac.values();
    int local1_life14 = (local0_life13).length;
    int local2_life15 = 0;
    while ((local2_life15 < local1_life14)) {
        moom.ac local3_life16 = (local0_life13)[local2_life15];
        (moom.ac.a)[((moom.ac)(local3_life16)).a()] = local3_life16;
        local2_life15 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static moom.ac[] values() {
return ((moom.ac[])(((moom.ac[])(moom.ac.e)).clone()));
}


public static moom.ac valueOf(java.lang.String p0) {
return ((moom.ac)(java.lang.Enum.valueOf(((java.lang.Class)(moom.ac.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.ac[] a__Arrayac() {
return new moom.ac[] {moom.ac.DEFAULT, moom.ac.CHISELED, moom.ac.SMOOTH};
}


public java.lang.String a__String() {
return this.c;
}


public static moom.ac a(int p0) {
int forwardValue2953_17_0;
    int spill2953_0;
    int spill2953_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.ac.f ^ 40010407956114L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill2953_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2953_17_0 = spill2953_0;
        break forward_join_17;
    }
    if (!((spill2953_0 >= 0))) {
        break forward_join_16;
    }
    spill2953_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2953_17_0 = spill2953_1;
        break forward_join_17;
    }
    if (!((spill2953_1 >= (moom.ac.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue2953_17_0 = 0;
    }
    p0 = forwardValue2953_17_0;
    }
    return (moom.ac.a)[p0];
}


public int a() {
return this.b;
}

}
