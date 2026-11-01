package net.minecraft.util;


public class EnumWorldBlockLayer extends sourcebuild.EnumConstructor<net.minecraft.util.EnumWorldBlockLayer> {

public static net.minecraft.util.EnumWorldBlockLayer SOLID;

public static net.minecraft.util.EnumWorldBlockLayer CUTOUT_MIPPED;

public static net.minecraft.util.EnumWorldBlockLayer CUTOUT;

public static net.minecraft.util.EnumWorldBlockLayer TRANSLUCENT;

private java.lang.String a;

private static net.minecraft.util.EnumWorldBlockLayer[] b;

private static boolean c;

private EnumWorldBlockLayer(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
int __sourceSpill3501_1 = 1;
    SOLID = ((net.minecraft.util.EnumWorldBlockLayer)(new net.minecraft.util.EnumWorldBlockLayer("SOLID", 0, "Solid")));
    CUTOUT_MIPPED = ((net.minecraft.util.EnumWorldBlockLayer)(new net.minecraft.util.EnumWorldBlockLayer("CUTOUT_MIPPED", 1, "Mipped Cutout")));
    CUTOUT = ((net.minecraft.util.EnumWorldBlockLayer)(new net.minecraft.util.EnumWorldBlockLayer("CUTOUT", 2, "Cutout")));
    TRANSLUCENT = ((net.minecraft.util.EnumWorldBlockLayer)(new net.minecraft.util.EnumWorldBlockLayer("TRANSLUCENT", 3, "Translucent")));
    b = ((net.minecraft.util.EnumWorldBlockLayer[])(net.minecraft.util.EnumWorldBlockLayer.a()));
    net.minecraft.util.EnumWorldBlockLayer.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill3501_1))));
}


public java.lang.String toString() {
return this.a;
}


public static net.minecraft.util.EnumWorldBlockLayer[] values() {
return ((net.minecraft.util.EnumWorldBlockLayer[])(((net.minecraft.util.EnumWorldBlockLayer[])(net.minecraft.util.EnumWorldBlockLayer.b)).clone()));
}


public static net.minecraft.util.EnumWorldBlockLayer valueOf(java.lang.String p0) {
return ((net.minecraft.util.EnumWorldBlockLayer)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.util.EnumWorldBlockLayer.class)), ((java.lang.String)(p0)))));
}


public static void b(boolean p0) {
c = ((boolean)(p0));
    return;
}


public static boolean b() {
return ((((net.minecraft.util.EnumWorldBlockLayer.c) ? 1 : 0)) != 0);
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(net.minecraft.util.EnumWorldBlockLayer.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.util.EnumWorldBlockLayer[] a() {
return new net.minecraft.util.EnumWorldBlockLayer[] {net.minecraft.util.EnumWorldBlockLayer.SOLID, net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED, net.minecraft.util.EnumWorldBlockLayer.CUTOUT, net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT};
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
