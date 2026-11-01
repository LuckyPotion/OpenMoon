package moom;


public class ak extends sourcebuild.EnumConstructor<moom.ak> implements net.minecraft.util.IStringSerializable {

public static moom.ak TOP;

public static moom.ak BOTTOM;

private java.lang.String a;

private static moom.ak[] b;

private ak(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
TOP = ((moom.ak)(new moom.ak("TOP", 0, "top")));
    BOTTOM = ((moom.ak)(new moom.ak("BOTTOM", 1, "bottom")));
    b = ((moom.ak[])(moom.ak.a__Arrayak()));
}


public java.lang.String toString() {
return this.a;
}


public static moom.ak[] values() {
return ((moom.ak[])(((moom.ak[])(moom.ak.b)).clone()));
}


public static moom.ak valueOf(java.lang.String p0) {
return ((moom.ak)(java.lang.Enum.valueOf(((java.lang.Class)(moom.ak.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static moom.ak[] a__Arrayak() {
return new moom.ak[] {moom.ak.TOP, moom.ak.BOTTOM};
}

}
