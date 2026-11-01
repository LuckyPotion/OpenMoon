package net.minecraft.block;


public class BlockQuartz$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockQuartz$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockQuartz$EnumType DEFAULT;

public static net.minecraft.block.BlockQuartz$EnumType CHISELED;

public static net.minecraft.block.BlockQuartz$EnumType LINES_Y;

public static net.minecraft.block.BlockQuartz$EnumType LINES_X;

public static net.minecraft.block.BlockQuartz$EnumType LINES_Z;

private static net.minecraft.block.BlockQuartz$EnumType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static net.minecraft.block.BlockQuartz$EnumType[] e;

private static long f;

private BlockQuartz$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(4115089196298167624L)), ((long)(-5657176323215934172L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81607386588762L)))));
    DEFAULT = ((net.minecraft.block.BlockQuartz$EnumType)(new net.minecraft.block.BlockQuartz$EnumType("DEFAULT", 0, 0, "default", "default")));
    CHISELED = ((net.minecraft.block.BlockQuartz$EnumType)(new net.minecraft.block.BlockQuartz$EnumType("CHISELED", 1, 1, "chiseled", "chiseled")));
    LINES_Y = ((net.minecraft.block.BlockQuartz$EnumType)(new net.minecraft.block.BlockQuartz$EnumType("LINES_Y", 2, 2, "lines_y", "lines")));
    LINES_X = ((net.minecraft.block.BlockQuartz$EnumType)(new net.minecraft.block.BlockQuartz$EnumType("LINES_X", 3, 3, "lines_x", "lines")));
    LINES_Z = ((net.minecraft.block.BlockQuartz$EnumType)(new net.minecraft.block.BlockQuartz$EnumType("LINES_Z", 4, 4, "lines_z", "lines")));
    e = ((net.minecraft.block.BlockQuartz$EnumType[])(net.minecraft.block.BlockQuartz$EnumType.a__ArrayW()));
    a = ((net.minecraft.block.BlockQuartz$EnumType[])(new net.minecraft.block.BlockQuartz$EnumType[(net.minecraft.block.BlockQuartz$EnumType.values()).length]));
    net.minecraft.block.BlockQuartz$EnumType[] local0_life15 = net.minecraft.block.BlockQuartz$EnumType.values();
    int local1_life16 = (local0_life15).length;
    int local2_life17 = 0;
    while ((local2_life17 < local1_life16)) {
        net.minecraft.block.BlockQuartz$EnumType local3_life18 = (local0_life15)[local2_life17];
        (net.minecraft.block.BlockQuartz$EnumType.a)[((net.minecraft.block.BlockQuartz$EnumType)(local3_life18)).a()] = local3_life18;
        local2_life17 += 1;
    }
}


public java.lang.String toString() {
return this.d;
}


public static net.minecraft.block.BlockQuartz$EnumType[] values() {
return ((net.minecraft.block.BlockQuartz$EnumType[])(((net.minecraft.block.BlockQuartz$EnumType[])(net.minecraft.block.BlockQuartz$EnumType.e)).clone()));
}


public static net.minecraft.block.BlockQuartz$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockQuartz$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockQuartz$EnumType.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.block.BlockQuartz$EnumType[] a__ArrayW() {
return new net.minecraft.block.BlockQuartz$EnumType[] {net.minecraft.block.BlockQuartz$EnumType.DEFAULT, net.minecraft.block.BlockQuartz$EnumType.CHISELED, net.minecraft.block.BlockQuartz$EnumType.LINES_Y, net.minecraft.block.BlockQuartz$EnumType.LINES_X, net.minecraft.block.BlockQuartz$EnumType.LINES_Z};
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.c;
}


public static net.minecraft.block.BlockQuartz$EnumType a(int p0) {
int forwardValue4722_17_0;
    int spill4722_0;
    int spill4722_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockQuartz$EnumType.f ^ 1787588478707L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4722_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4722_17_0 = spill4722_0;
        break forward_join_17;
    }
    if (!((spill4722_0 >= 0))) {
        break forward_join_16;
    }
    spill4722_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4722_17_0 = spill4722_1;
        break forward_join_17;
    }
    if (!((spill4722_1 >= (net.minecraft.block.BlockQuartz$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4722_17_0 = 0;
    }
    p0 = forwardValue4722_17_0;
    }
    return (net.minecraft.block.BlockQuartz$EnumType.a)[p0];
}


public int a() {
return this.b;
}

}
