package net.minecraft.block;


public class BlockPistonExtension$EnumPistonType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockPistonExtension$EnumPistonType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockPistonExtension$EnumPistonType DEFAULT;

public static net.minecraft.block.BlockPistonExtension$EnumPistonType STICKY;

private java.lang.String a;

private static net.minecraft.block.BlockPistonExtension$EnumPistonType[] b;

private BlockPistonExtension$EnumPistonType(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
DEFAULT = ((net.minecraft.block.BlockPistonExtension$EnumPistonType)(new net.minecraft.block.BlockPistonExtension$EnumPistonType("DEFAULT", 0, "normal")));
    STICKY = ((net.minecraft.block.BlockPistonExtension$EnumPistonType)(new net.minecraft.block.BlockPistonExtension$EnumPistonType("STICKY", 1, "sticky")));
    b = ((net.minecraft.block.BlockPistonExtension$EnumPistonType[])(net.minecraft.block.BlockPistonExtension$EnumPistonType.a__ArrayS()));
}


public java.lang.String toString() {
return this.a;
}


public static net.minecraft.block.BlockPistonExtension$EnumPistonType[] values() {
return ((net.minecraft.block.BlockPistonExtension$EnumPistonType[])(((net.minecraft.block.BlockPistonExtension$EnumPistonType[])(net.minecraft.block.BlockPistonExtension$EnumPistonType.b)).clone()));
}


public static net.minecraft.block.BlockPistonExtension$EnumPistonType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockPistonExtension$EnumPistonType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockPistonExtension$EnumPistonType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static net.minecraft.block.BlockPistonExtension$EnumPistonType[] a__ArrayS() {
return new net.minecraft.block.BlockPistonExtension$EnumPistonType[] {net.minecraft.block.BlockPistonExtension$EnumPistonType.DEFAULT, net.minecraft.block.BlockPistonExtension$EnumPistonType.STICKY};
}

}
