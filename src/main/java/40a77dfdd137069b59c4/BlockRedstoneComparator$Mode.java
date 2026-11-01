package net.minecraft.block;


public class BlockRedstoneComparator$Mode extends sourcebuild.EnumConstructor<net.minecraft.block.BlockRedstoneComparator$Mode> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockRedstoneComparator$Mode COMPARE;

public static net.minecraft.block.BlockRedstoneComparator$Mode SUBTRACT;

private java.lang.String a;

private static net.minecraft.block.BlockRedstoneComparator$Mode[] b;

private BlockRedstoneComparator$Mode(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
COMPARE = ((net.minecraft.block.BlockRedstoneComparator$Mode)(new net.minecraft.block.BlockRedstoneComparator$Mode("COMPARE", 0, "compare")));
    SUBTRACT = ((net.minecraft.block.BlockRedstoneComparator$Mode)(new net.minecraft.block.BlockRedstoneComparator$Mode("SUBTRACT", 1, "subtract")));
    b = ((net.minecraft.block.BlockRedstoneComparator$Mode[])(net.minecraft.block.BlockRedstoneComparator$Mode.a__ArrayZ()));
}


public java.lang.String toString() {
return this.a;
}


public static net.minecraft.block.BlockRedstoneComparator$Mode[] values() {
return ((net.minecraft.block.BlockRedstoneComparator$Mode[])(((net.minecraft.block.BlockRedstoneComparator$Mode[])(net.minecraft.block.BlockRedstoneComparator$Mode.b)).clone()));
}


public static net.minecraft.block.BlockRedstoneComparator$Mode valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockRedstoneComparator$Mode)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockRedstoneComparator$Mode.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static net.minecraft.block.BlockRedstoneComparator$Mode[] a__ArrayZ() {
return new net.minecraft.block.BlockRedstoneComparator$Mode[] {net.minecraft.block.BlockRedstoneComparator$Mode.COMPARE, net.minecraft.block.BlockRedstoneComparator$Mode.SUBTRACT};
}

}
