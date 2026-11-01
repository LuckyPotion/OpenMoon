package moom;


public class LT {

private int a;

private java.lang.String b;

private java.util.Map<java.lang.String, java.lang.String> c;

private byte[] d;

private static net.minecraft.entity.Entity[] e;

public LT(int p0, java.lang.String p1, java.util.Map p2, byte[] p3) {
super();
    this.a = 0;
    this.b = null;
    this.c = new java.util.LinkedHashMap();
    this.d = null;
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
if ((moom.LT.b() == null)) {
        moom.LT.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
moom.LT.e = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return moom.LT.e;
}


public byte[] a__ArrayByte() {
return this.d;
}


public java.lang.String a(java.lang.String p0) {
return ((java.lang.String)(((java.util.Map)(this.c)).get(((java.lang.Object)(p0)))));
}


public int a() {
return this.a;
}


public java.util.Map a__Map() {
return this.c;
}


public java.lang.String a__String() {
return this.b;
}

}
