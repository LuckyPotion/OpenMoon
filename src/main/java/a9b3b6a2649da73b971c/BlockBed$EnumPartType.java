package net.minecraft.block;


public class BlockBed$EnumPartType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockBed$EnumPartType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockBed$EnumPartType HEAD;

public static net.minecraft.block.BlockBed$EnumPartType FOOT;

private java.lang.String a;

private static net.minecraft.block.BlockBed$EnumPartType[] b;

private BlockBed$EnumPartType(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
HEAD = ((net.minecraft.block.BlockBed$EnumPartType)(new net.minecraft.block.BlockBed$EnumPartType("HEAD", 0, "head")));
    FOOT = ((net.minecraft.block.BlockBed$EnumPartType)(new net.minecraft.block.BlockBed$EnumPartType("FOOT", 1, "foot")));
    b = ((net.minecraft.block.BlockBed$EnumPartType[])(net.minecraft.block.BlockBed$EnumPartType.a__ArrayG()));
}


public java.lang.String toString() {
return this.a;
}


public static net.minecraft.block.BlockBed$EnumPartType[] values() {
return ((net.minecraft.block.BlockBed$EnumPartType[])(((net.minecraft.block.BlockBed$EnumPartType[])(net.minecraft.block.BlockBed$EnumPartType.b)).clone()));
}


public static net.minecraft.block.BlockBed$EnumPartType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockBed$EnumPartType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockBed$EnumPartType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static net.minecraft.block.BlockBed$EnumPartType[] a__ArrayG() {
return new net.minecraft.block.BlockBed$EnumPartType[] {net.minecraft.block.BlockBed$EnumPartType.HEAD, net.minecraft.block.BlockBed$EnumPartType.FOOT};
}

}
