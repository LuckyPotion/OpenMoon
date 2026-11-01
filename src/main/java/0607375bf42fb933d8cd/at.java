package moom;


public class at extends sourcebuild.EnumConstructor<moom.at> implements net.minecraft.util.IStringSerializable {

public static moom.at NORMAL;

public static moom.at MOSSY;

private static moom.at[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static moom.at[] e;

private static long f;

private at(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(3140111270685848753L)), ((long)(4673981036301835484L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(218130421255694L)))));
    NORMAL = ((moom.at)(new moom.at("NORMAL", 0, 0, "cobblestone", "normal")));
    MOSSY = ((moom.at)(new moom.at("MOSSY", 1, 1, "mossy_cobblestone", "mossy")));
    e = ((moom.at[])(moom.at.a__Arrayat()));
    a = ((moom.at[])(new moom.at[(moom.at.values()).length]));
    moom.at[] local0_life12 = moom.at.values();
    int local1_life13 = (local0_life12).length;
    int local2_life14 = 0;
    while ((local2_life14 < local1_life13)) {
        moom.at local3_life15 = (local0_life12)[local2_life14];
        (moom.at.a)[((moom.at)(local3_life15)).a()] = local3_life15;
        local2_life14 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static moom.at[] values() {
return ((moom.at[])(((moom.at[])(moom.at.e)).clone()));
}


public static moom.at valueOf(java.lang.String p0) {
return ((moom.at)(java.lang.Enum.valueOf(((java.lang.Class)(moom.at.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.at[] a__Arrayat() {
return new moom.at[] {moom.at.NORMAL, moom.at.MOSSY};
}


public java.lang.String a__String() {
return this.c;
}


public static moom.at a(int p0) {
int forwardValue2956_17_0;
    int spill2956_0;
    int spill2956_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.at.f ^ 31402553761985L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill2956_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2956_17_0 = spill2956_0;
        break forward_join_17;
    }
    if (!((spill2956_0 >= 0))) {
        break forward_join_16;
    }
    spill2956_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2956_17_0 = spill2956_1;
        break forward_join_17;
    }
    if (!((spill2956_1 >= (moom.at.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue2956_17_0 = 0;
    }
    p0 = forwardValue2956_17_0;
    }
    return (moom.at.a)[p0];
}


public int a() {
return this.b;
}

}
