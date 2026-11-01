package moom;


public class al extends sourcebuild.EnumConstructor<moom.al> implements net.minecraft.util.IStringSerializable {

public static moom.al TOP;

public static moom.al BOTTOM;

private java.lang.String a;

private static moom.al[] b;

private al(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
TOP = ((moom.al)(new moom.al("TOP", 0, "top")));
    BOTTOM = ((moom.al)(new moom.al("BOTTOM", 1, "bottom")));
    b = ((moom.al[])(moom.al.a__Arrayal()));
}


public java.lang.String toString() {
return this.a;
}


public static moom.al[] values() {
return ((moom.al[])(((moom.al[])(moom.al.b)).clone()));
}


public static moom.al valueOf(java.lang.String p0) {
return ((moom.al)(java.lang.Enum.valueOf(((java.lang.Class)(moom.al.class)), ((java.lang.String)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


private static moom.al[] a__Arrayal() {
return new moom.al[] {moom.al.TOP, moom.al.BOTTOM};
}

}
