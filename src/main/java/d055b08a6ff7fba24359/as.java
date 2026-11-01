package moom;


public class as extends sourcebuild.EnumConstructor<moom.as> implements net.minecraft.util.IStringSerializable {

public static moom.as TOP;

public static moom.as BOTTOM;

private java.lang.String a;

private static moom.as[] b;

private as(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
TOP = ((moom.as)(new moom.as("TOP", 0, "top")));
    BOTTOM = ((moom.as)(new moom.as("BOTTOM", 1, "bottom")));
    b = ((moom.as[])(moom.as.a__Arrayas()));
}


public java.lang.String toString() {
return this.a;
}


public static moom.as[] values() {
return ((moom.as[])(((moom.as[])(moom.as.b)).clone()));
}


public static moom.as valueOf(java.lang.String p0) {
return ((moom.as)(java.lang.Enum.valueOf(((java.lang.Class)(moom.as.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static moom.as[] a__Arrayas() {
return new moom.as[] {moom.as.TOP, moom.as.BOTTOM};
}

}
