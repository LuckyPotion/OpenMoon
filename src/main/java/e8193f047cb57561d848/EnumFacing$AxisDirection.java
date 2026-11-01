package net.minecraft.util;


public class EnumFacing$AxisDirection extends sourcebuild.EnumConstructor<net.minecraft.util.EnumFacing$AxisDirection> {

public static net.minecraft.util.EnumFacing$AxisDirection POSITIVE;

public static net.minecraft.util.EnumFacing$AxisDirection NEGATIVE;

private int a;

private java.lang.String b;

private static net.minecraft.util.EnumFacing$AxisDirection[] c;

private EnumFacing$AxisDirection(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);

    this.a = p2;
    this.b = p3;
}


private static void initialize() {
POSITIVE = ((net.minecraft.util.EnumFacing$AxisDirection)(new net.minecraft.util.EnumFacing$AxisDirection("POSITIVE", 0, 1, "Towards positive")));
    NEGATIVE = ((net.minecraft.util.EnumFacing$AxisDirection)(new net.minecraft.util.EnumFacing$AxisDirection("NEGATIVE", 1, -1, "Towards negative")));
    c = ((net.minecraft.util.EnumFacing$AxisDirection[])(net.minecraft.util.EnumFacing$AxisDirection.a__Arraybu()));
}


public java.lang.String toString() {
return this.b;
}


public static net.minecraft.util.EnumFacing$AxisDirection[] values() {
return ((net.minecraft.util.EnumFacing$AxisDirection[])(((net.minecraft.util.EnumFacing$AxisDirection[])(net.minecraft.util.EnumFacing$AxisDirection.c)).clone()));
}


public static net.minecraft.util.EnumFacing$AxisDirection valueOf(java.lang.String p0) {
return ((net.minecraft.util.EnumFacing$AxisDirection)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.util.EnumFacing$AxisDirection.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.util.EnumFacing$AxisDirection[] a__Arraybu() {
return new net.minecraft.util.EnumFacing$AxisDirection[] {net.minecraft.util.EnumFacing$AxisDirection.POSITIVE, net.minecraft.util.EnumFacing$AxisDirection.NEGATIVE};
}


public int a() {
return this.a;
}

}
