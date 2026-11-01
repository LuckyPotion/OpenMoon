package moom;


public class ab extends sourcebuild.EnumConstructor<moom.ab> implements net.minecraft.util.IStringSerializable {

public static moom.ab SAND;

public static moom.ab RED_SAND;

private static moom.ab[] a;

private int b;

private java.lang.String c;

private moom.fm d;

private java.lang.String e;

private static moom.ab[] f;

private static long g;

private ab(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4, moom.fm p5) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p5;
    this.e = p4;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(2425689543421562837L)), ((long)(156785826942622932L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(62419484647446L)))));
    SAND = ((moom.ab)(new moom.ab("SAND", 0, 0, "sand", "default", moom.fm.d)));
    RED_SAND = ((moom.ab)(new moom.ab("RED_SAND", 1, 1, "red_sand", "red", moom.fm.q)));
    f = ((moom.ab[])(moom.ab.a__Arrayab()));
    a = ((moom.ab[])(new moom.ab[(moom.ab.values()).length]));
    moom.ab[] local0_life14 = moom.ab.values();
    int local1_life15 = (local0_life14).length;
    int local2_life16 = 0;
    while ((local2_life16 < local1_life15)) {
        moom.ab local3_life17 = (local0_life14)[local2_life16];
        (moom.ab.a)[((moom.ab)(local3_life17)).a()] = local3_life17;
        local2_life16 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static moom.ab[] values() {
return ((moom.ab[])(((moom.ab[])(moom.ab.f)).clone()));
}


public static moom.ab valueOf(java.lang.String p0) {
return ((moom.ab)(java.lang.Enum.valueOf(((java.lang.Class)(moom.ab.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.ab[] a__Arrayab() {
return new moom.ab[] {moom.ab.SAND, moom.ab.RED_SAND};
}


public int a() {
return this.b;
}


public moom.fm a__fm() {
return this.d;
}


public static moom.ab a(int p0) {
int forwardValue2952_17_0;
    int spill2952_0;
    int spill2952_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.ab.g ^ 8611757061396L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill2952_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2952_17_0 = spill2952_0;
        break forward_join_17;
    }
    if (!((spill2952_0 >= 0))) {
        break forward_join_16;
    }
    spill2952_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2952_17_0 = spill2952_1;
        break forward_join_17;
    }
    if (!((spill2952_1 >= (moom.ab.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue2952_17_0 = 0;
    }
    p0 = forwardValue2952_17_0;
    }
    return (moom.ab.a)[p0];
}


public java.lang.String a__String() {
return this.c;
}

}
