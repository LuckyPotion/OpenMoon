package net.minecraft.block;


public class BlockStoneBrick$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockStoneBrick$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockStoneBrick$EnumType DEFAULT;

public static net.minecraft.block.BlockStoneBrick$EnumType MOSSY;

public static net.minecraft.block.BlockStoneBrick$EnumType CRACKED;

public static net.minecraft.block.BlockStoneBrick$EnumType CHISELED;

private static net.minecraft.block.BlockStoneBrick$EnumType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private static net.minecraft.block.BlockStoneBrick$EnumType[] e;

private static long f;

private BlockStoneBrick$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3, java.lang.String p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(975578179635265385L)), ((long)(3471781308547091933L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(98244967355724L)))));
    DEFAULT = ((net.minecraft.block.BlockStoneBrick$EnumType)(new net.minecraft.block.BlockStoneBrick$EnumType("DEFAULT", 0, 0, "stonebrick", "default")));
    MOSSY = ((net.minecraft.block.BlockStoneBrick$EnumType)(new net.minecraft.block.BlockStoneBrick$EnumType("MOSSY", 1, 1, "mossy_stonebrick", "mossy")));
    CRACKED = ((net.minecraft.block.BlockStoneBrick$EnumType)(new net.minecraft.block.BlockStoneBrick$EnumType("CRACKED", 2, 2, "cracked_stonebrick", "cracked")));
    CHISELED = ((net.minecraft.block.BlockStoneBrick$EnumType)(new net.minecraft.block.BlockStoneBrick$EnumType("CHISELED", 3, 3, "chiseled_stonebrick", "chiseled")));
    e = ((net.minecraft.block.BlockStoneBrick$EnumType[])(net.minecraft.block.BlockStoneBrick$EnumType.a__Arrayao()));
    a = ((net.minecraft.block.BlockStoneBrick$EnumType[])(new net.minecraft.block.BlockStoneBrick$EnumType[(net.minecraft.block.BlockStoneBrick$EnumType.values()).length]));
    net.minecraft.block.BlockStoneBrick$EnumType[] local0_life14 = net.minecraft.block.BlockStoneBrick$EnumType.values();
    int local1_life15 = (local0_life14).length;
    int local2_life16 = 0;
    while ((local2_life16 < local1_life15)) {
        net.minecraft.block.BlockStoneBrick$EnumType local3_life17 = (local0_life14)[local2_life16];
        (net.minecraft.block.BlockStoneBrick$EnumType.a)[((net.minecraft.block.BlockStoneBrick$EnumType)(local3_life17)).a()] = local3_life17;
        local2_life16 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockStoneBrick$EnumType[] values() {
return ((net.minecraft.block.BlockStoneBrick$EnumType[])(((net.minecraft.block.BlockStoneBrick$EnumType[])(net.minecraft.block.BlockStoneBrick$EnumType.e)).clone()));
}


public static net.minecraft.block.BlockStoneBrick$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockStoneBrick$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockStoneBrick$EnumType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.block.BlockStoneBrick$EnumType[] a__Arrayao() {
return new net.minecraft.block.BlockStoneBrick$EnumType[] {net.minecraft.block.BlockStoneBrick$EnumType.DEFAULT, net.minecraft.block.BlockStoneBrick$EnumType.MOSSY, net.minecraft.block.BlockStoneBrick$EnumType.CRACKED, net.minecraft.block.BlockStoneBrick$EnumType.CHISELED};
}


public java.lang.String a__String() {
return this.c;
}


public static net.minecraft.block.BlockStoneBrick$EnumType a(int p0) {
int forwardValue4750_17_0;
    int spill4750_0;
    int spill4750_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockStoneBrick$EnumType.f ^ 38986852965247L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4750_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4750_17_0 = spill4750_0;
        break forward_join_17;
    }
    if (!((spill4750_0 >= 0))) {
        break forward_join_16;
    }
    spill4750_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4750_17_0 = spill4750_1;
        break forward_join_17;
    }
    if (!((spill4750_1 >= (net.minecraft.block.BlockStoneBrick$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4750_17_0 = 0;
    }
    p0 = forwardValue4750_17_0;
    }
    return (net.minecraft.block.BlockStoneBrick$EnumType.a)[p0];
}


public int a() {
return this.b;
}

}
