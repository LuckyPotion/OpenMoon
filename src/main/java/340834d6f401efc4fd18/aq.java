package moom;


public class aq extends sourcebuild.EnumConstructor<moom.aq> implements net.minecraft.util.IStringSerializable {

public static moom.aq RED_SANDSTONE;

private static moom.aq[] a;

private int b;

private java.lang.String c;

private moom.fm d;

private static moom.aq[] e;

private static long f;

private aq(java.lang.String p0, int p1, int p2, java.lang.String p3, moom.fm p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(5799795505042781976L)), ((long)(-7445844579271441808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277941438874576L)))));
    RED_SANDSTONE = ((moom.aq)(new moom.aq("RED_SANDSTONE", 0, 0, "red_sandstone", ((moom.ab)(moom.ab.RED_SAND)).a__fm())));
    e = ((moom.aq[])(moom.aq.a__Arrayaq()));
    a = ((moom.aq[])(new moom.aq[(moom.aq.values()).length]));
    moom.aq[] local0_life13 = moom.aq.values();
    int local1_life14 = (local0_life13).length;
    int local2_life15 = 0;
    while ((local2_life15 < local1_life14)) {
        moom.aq local3_life16 = (local0_life13)[local2_life15];
        (moom.aq.a)[((moom.aq)(local3_life16)).a()] = local3_life16;
        local2_life15 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static moom.aq[] values() {
return ((moom.aq[])(((moom.aq[])(moom.aq.e)).clone()));
}


public static moom.aq valueOf(java.lang.String p0) {
return ((moom.aq)(java.lang.Enum.valueOf(((java.lang.Class)(moom.aq.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static moom.aq[] a__Arrayaq() {
return new moom.aq[] {moom.aq.RED_SANDSTONE};
}


public int a() {
return this.b;
}


public moom.fm a__fm() {
return this.d;
}


public static moom.aq a(int p0) {
int forwardValue2954_17_0;
    int spill2954_0;
    int spill2954_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.aq.f ^ 33513138504376L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill2954_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2954_17_0 = spill2954_0;
        break forward_join_17;
    }
    if (!((spill2954_0 >= 0))) {
        break forward_join_16;
    }
    spill2954_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue2954_17_0 = spill2954_1;
        break forward_join_17;
    }
    if (!((spill2954_1 >= (moom.aq.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue2954_17_0 = 0;
    }
    p0 = forwardValue2954_17_0;
    }
    return (moom.aq.a)[p0];
}


public java.lang.String a__String() {
return this.c;
}

}
