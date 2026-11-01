package net.minecraft.block;


public class BlockPrismarine$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockPrismarine$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockPrismarine$EnumType ROUGH;

public static net.minecraft.block.BlockPrismarine$EnumType BRICKS;

public static net.minecraft.block.BlockPrismarine$EnumType DARK;

private static net.minecraft.block.BlockPrismarine$EnumType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static net.minecraft.block.BlockPrismarine$EnumType[] e;

private static long f;

private BlockPrismarine$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(904879061155606012L)), ((long)(3778018565352017801L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(19021343911704L)))));
    ROUGH = ((net.minecraft.block.BlockPrismarine$EnumType)(new net.minecraft.block.BlockPrismarine$EnumType("ROUGH", 0, 0, "prismarine", "rough")));
    BRICKS = ((net.minecraft.block.BlockPrismarine$EnumType)(new net.minecraft.block.BlockPrismarine$EnumType("BRICKS", 1, 1, "prismarine_bricks", "bricks")));
    DARK = ((net.minecraft.block.BlockPrismarine$EnumType)(new net.minecraft.block.BlockPrismarine$EnumType("DARK", 2, 2, "dark_prismarine", "dark")));
    e = ((net.minecraft.block.BlockPrismarine$EnumType[])(net.minecraft.block.BlockPrismarine$EnumType.a__ArrayV()));
    a = ((net.minecraft.block.BlockPrismarine$EnumType[])(new net.minecraft.block.BlockPrismarine$EnumType[(net.minecraft.block.BlockPrismarine$EnumType.values()).length]));
    net.minecraft.block.BlockPrismarine$EnumType[] local0_life13 = net.minecraft.block.BlockPrismarine$EnumType.values();
    int local1_life14 = (local0_life13).length;
    int local2_life15 = 0;
    while ((local2_life15 < local1_life14)) {
        net.minecraft.block.BlockPrismarine$EnumType local3_life16 = (local0_life13)[local2_life15];
        (net.minecraft.block.BlockPrismarine$EnumType.a)[((net.minecraft.block.BlockPrismarine$EnumType)(local3_life16)).a()] = local3_life16;
        local2_life15 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockPrismarine$EnumType[] values() {
return ((net.minecraft.block.BlockPrismarine$EnumType[])(((net.minecraft.block.BlockPrismarine$EnumType[])(net.minecraft.block.BlockPrismarine$EnumType.e)).clone()));
}


public static net.minecraft.block.BlockPrismarine$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockPrismarine$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockPrismarine$EnumType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.block.BlockPrismarine$EnumType[] a__ArrayV() {
return new net.minecraft.block.BlockPrismarine$EnumType[] {net.minecraft.block.BlockPrismarine$EnumType.ROUGH, net.minecraft.block.BlockPrismarine$EnumType.BRICKS, net.minecraft.block.BlockPrismarine$EnumType.DARK};
}


public java.lang.String a__String() {
return this.c;
}


public static net.minecraft.block.BlockPrismarine$EnumType a(int p0) {
int forwardValue4721_17_0;
    int spill4721_0;
    int spill4721_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockPrismarine$EnumType.f ^ 74158363218317L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4721_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4721_17_0 = spill4721_0;
        break forward_join_17;
    }
    if (!((spill4721_0 >= 0))) {
        break forward_join_16;
    }
    spill4721_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4721_17_0 = spill4721_1;
        break forward_join_17;
    }
    if (!((spill4721_1 >= (net.minecraft.block.BlockPrismarine$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4721_17_0 = 0;
    }
    p0 = forwardValue4721_17_0;
    }
    return (net.minecraft.block.BlockPrismarine$EnumType.a)[p0];
}


public int a() {
return this.b;
}

}
