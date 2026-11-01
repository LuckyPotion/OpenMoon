package net.minecraft.block;


public class BlockDirt$DirtType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockDirt$DirtType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockDirt$DirtType DIRT;

public static net.minecraft.block.BlockDirt$DirtType COARSE_DIRT;

public static net.minecraft.block.BlockDirt$DirtType PODZOL;

private static net.minecraft.block.BlockDirt$DirtType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private moom.fm e;

private static net.minecraft.block.BlockDirt$DirtType[] f;

private static long g;

private BlockDirt$DirtType(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4, moom.fm p5) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
    this.e = p5;
}


private BlockDirt$DirtType(java.lang.String p0, int p1, int p2, java.lang.String p3, moom.fm p4) {
this(p0, p1, p2, p3, p3, p4);
    return;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(301527950955933905L)), ((long)(-3444108297863275423L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57414743539477L)))));
    DIRT = ((net.minecraft.block.BlockDirt$DirtType)(new net.minecraft.block.BlockDirt$DirtType("DIRT", 0, 0, "dirt", "default", moom.fm.l)));
    COARSE_DIRT = ((net.minecraft.block.BlockDirt$DirtType)(new net.minecraft.block.BlockDirt$DirtType("COARSE_DIRT", 1, 1, "coarse_dirt", "coarse", moom.fm.l)));
    PODZOL = ((net.minecraft.block.BlockDirt$DirtType)(new net.minecraft.block.BlockDirt$DirtType("PODZOL", 2, 2, "podzol", moom.fm.J)));
    f = ((net.minecraft.block.BlockDirt$DirtType[])(net.minecraft.block.BlockDirt$DirtType.a__ArrayH()));
    a = ((net.minecraft.block.BlockDirt$DirtType[])(new net.minecraft.block.BlockDirt$DirtType[(net.minecraft.block.BlockDirt$DirtType.values()).length]));
    net.minecraft.block.BlockDirt$DirtType[] local0_life16 = net.minecraft.block.BlockDirt$DirtType.values();
    int local1_life17 = (local0_life16).length;
    int local2_life18 = 0;
    while ((local2_life18 < local1_life17)) {
        net.minecraft.block.BlockDirt$DirtType local3_life19 = (local0_life16)[local2_life18];
        (net.minecraft.block.BlockDirt$DirtType.a)[((net.minecraft.block.BlockDirt$DirtType)(local3_life19)).a()] = local3_life19;
        local2_life18 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockDirt$DirtType[] values() {
return ((net.minecraft.block.BlockDirt$DirtType[])(((net.minecraft.block.BlockDirt$DirtType[])(net.minecraft.block.BlockDirt$DirtType.f)).clone()));
}


public static net.minecraft.block.BlockDirt$DirtType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockDirt$DirtType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockDirt$DirtType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


public java.lang.String a__String() {
return this.c;
}


private static net.minecraft.block.BlockDirt$DirtType[] a__ArrayH() {
return new net.minecraft.block.BlockDirt$DirtType[] {net.minecraft.block.BlockDirt$DirtType.DIRT, net.minecraft.block.BlockDirt$DirtType.COARSE_DIRT, net.minecraft.block.BlockDirt$DirtType.PODZOL};
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static net.minecraft.block.BlockDirt$DirtType a(int p0) {
int forwardValue4652_17_0;
    int spill4652_0;
    int spill4652_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockDirt$DirtType.g ^ 116198353660416L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4652_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4652_17_0 = spill4652_0;
        break forward_join_17;
    }
    if (!((spill4652_0 >= 0))) {
        break forward_join_16;
    }
    spill4652_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4652_17_0 = spill4652_1;
        break forward_join_17;
    }
    if (!((spill4652_1 >= (net.minecraft.block.BlockDirt$DirtType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4652_17_0 = 0;
    }
    p0 = forwardValue4652_17_0;
    }
    return (net.minecraft.block.BlockDirt$DirtType.a)[p0];
}


public moom.fm a__fm() {
return this.e;
}


public int a() {
return this.b;
}

}
