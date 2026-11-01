package net.minecraft.block;


class BlockRedstoneWire$EnumAttachPosition extends sourcebuild.EnumConstructor<net.minecraft.block.BlockRedstoneWire$EnumAttachPosition> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockRedstoneWire$EnumAttachPosition UP;

public static net.minecraft.block.BlockRedstoneWire$EnumAttachPosition SIDE;

public static net.minecraft.block.BlockRedstoneWire$EnumAttachPosition NONE;

private java.lang.String a;

private static net.minecraft.block.BlockRedstoneWire$EnumAttachPosition[] b;

private BlockRedstoneWire$EnumAttachPosition(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
UP = ((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition)(new net.minecraft.block.BlockRedstoneWire$EnumAttachPosition("UP", 0, "up")));
    SIDE = ((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition)(new net.minecraft.block.BlockRedstoneWire$EnumAttachPosition("SIDE", 1, "side")));
    NONE = ((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition)(new net.minecraft.block.BlockRedstoneWire$EnumAttachPosition("NONE", 2, "none")));
    b = ((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition[])(net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.a__Arrayaa()));
}


public java.lang.String toString() {
return ((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition)(this)).a__String();
}


public static net.minecraft.block.BlockRedstoneWire$EnumAttachPosition[] values() {
return ((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition[])(((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition[])(net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.b)).clone()));
}


public static net.minecraft.block.BlockRedstoneWire$EnumAttachPosition valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockRedstoneWire$EnumAttachPosition)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static net.minecraft.block.BlockRedstoneWire$EnumAttachPosition[] a__Arrayaa() {
return new net.minecraft.block.BlockRedstoneWire$EnumAttachPosition[] {net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.UP, net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.SIDE, net.minecraft.block.BlockRedstoneWire$EnumAttachPosition.NONE};
}

}
