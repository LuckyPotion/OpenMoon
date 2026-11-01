package net.minecraft.block;


public class BlockStairs$EnumShape extends sourcebuild.EnumConstructor<net.minecraft.block.BlockStairs$EnumShape> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockStairs$EnumShape STRAIGHT;

public static net.minecraft.block.BlockStairs$EnumShape INNER_LEFT;

public static net.minecraft.block.BlockStairs$EnumShape INNER_RIGHT;

public static net.minecraft.block.BlockStairs$EnumShape OUTER_LEFT;

public static net.minecraft.block.BlockStairs$EnumShape OUTER_RIGHT;

private java.lang.String a;

private static net.minecraft.block.BlockStairs$EnumShape[] b;

private BlockStairs$EnumShape(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
STRAIGHT = ((net.minecraft.block.BlockStairs$EnumShape)(new net.minecraft.block.BlockStairs$EnumShape("STRAIGHT", 0, "straight")));
    INNER_LEFT = ((net.minecraft.block.BlockStairs$EnumShape)(new net.minecraft.block.BlockStairs$EnumShape("INNER_LEFT", 1, "inner_left")));
    INNER_RIGHT = ((net.minecraft.block.BlockStairs$EnumShape)(new net.minecraft.block.BlockStairs$EnumShape("INNER_RIGHT", 2, "inner_right")));
    OUTER_LEFT = ((net.minecraft.block.BlockStairs$EnumShape)(new net.minecraft.block.BlockStairs$EnumShape("OUTER_LEFT", 3, "outer_left")));
    OUTER_RIGHT = ((net.minecraft.block.BlockStairs$EnumShape)(new net.minecraft.block.BlockStairs$EnumShape("OUTER_RIGHT", 4, "outer_right")));
    b = ((net.minecraft.block.BlockStairs$EnumShape[])(net.minecraft.block.BlockStairs$EnumShape.a__Arrayam()));
}


public java.lang.String toString() {
return this.a;
}


public static net.minecraft.block.BlockStairs$EnumShape[] values() {
return ((net.minecraft.block.BlockStairs$EnumShape[])(((net.minecraft.block.BlockStairs$EnumShape[])(net.minecraft.block.BlockStairs$EnumShape.b)).clone()));
}


public static net.minecraft.block.BlockStairs$EnumShape valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockStairs$EnumShape)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockStairs$EnumShape.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static net.minecraft.block.BlockStairs$EnumShape[] a__Arrayam() {
return new net.minecraft.block.BlockStairs$EnumShape[] {net.minecraft.block.BlockStairs$EnumShape.STRAIGHT, net.minecraft.block.BlockStairs$EnumShape.INNER_LEFT, net.minecraft.block.BlockStairs$EnumShape.INNER_RIGHT, net.minecraft.block.BlockStairs$EnumShape.OUTER_LEFT, net.minecraft.block.BlockStairs$EnumShape.OUTER_RIGHT};
}

}
