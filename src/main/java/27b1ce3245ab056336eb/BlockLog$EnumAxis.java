package net.minecraft.block;


public class BlockLog$EnumAxis extends sourcebuild.EnumConstructor<net.minecraft.block.BlockLog$EnumAxis> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockLog$EnumAxis X;

public static net.minecraft.block.BlockLog$EnumAxis Y;

public static net.minecraft.block.BlockLog$EnumAxis Z;

public static net.minecraft.block.BlockLog$EnumAxis NONE;

private java.lang.String a;

private static net.minecraft.block.BlockLog$EnumAxis[] b;

private static long c;

private BlockLog$EnumAxis(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(1899094163174549816L)), ((long)(-2871774605232104583L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(224818243170741L)))));
    X = ((net.minecraft.block.BlockLog$EnumAxis)(new net.minecraft.block.BlockLog$EnumAxis("X", 0, "x")));
    Y = ((net.minecraft.block.BlockLog$EnumAxis)(new net.minecraft.block.BlockLog$EnumAxis("Y", 1, "y")));
    Z = ((net.minecraft.block.BlockLog$EnumAxis)(new net.minecraft.block.BlockLog$EnumAxis("Z", 2, "z")));
    NONE = ((net.minecraft.block.BlockLog$EnumAxis)(new net.minecraft.block.BlockLog$EnumAxis("NONE", 3, "none")));
    b = ((net.minecraft.block.BlockLog$EnumAxis[])(net.minecraft.block.BlockLog$EnumAxis.a__ArrayR()));
}


public java.lang.String toString() {
return this.a;
}


public static net.minecraft.block.BlockLog$EnumAxis[] values() {
return ((net.minecraft.block.BlockLog$EnumAxis[])(((net.minecraft.block.BlockLog$EnumAxis[])(net.minecraft.block.BlockLog$EnumAxis.b)).clone()));
}


public static net.minecraft.block.BlockLog$EnumAxis valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockLog$EnumAxis)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockLog$EnumAxis.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.block.BlockLog$EnumAxis[] a__ArrayR() {
return new net.minecraft.block.BlockLog$EnumAxis[] {net.minecraft.block.BlockLog$EnumAxis.X, net.minecraft.block.BlockLog$EnumAxis.Y, net.minecraft.block.BlockLog$EnumAxis.Z, net.minecraft.block.BlockLog$EnumAxis.NONE};
}


public java.lang.String a__String() {
return this.a;
}


public static net.minecraft.block.BlockLog$EnumAxis a(net.minecraft.util.EnumFacing$Axis p0) {
long local1 = (net.minecraft.block.BlockLog$EnumAxis.c ^ 100524089868703L);
    switch ((moom.eZ.a)[((net.minecraft.util.EnumFacing$Axis)(p0)).ordinal()]) {
case 1:
{
        return net.minecraft.block.BlockLog$EnumAxis.X;
    }
case 2:
{
        return net.minecraft.block.BlockLog$EnumAxis.Y;
    }
case 3:
{
        return net.minecraft.block.BlockLog$EnumAxis.Z;
    }
default:
{
        return net.minecraft.block.BlockLog$EnumAxis.NONE;
    }
}
}

}
