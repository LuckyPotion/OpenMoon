package moom;


public class Oy extends java.lang.Thread {

private final java.lang.String a;

private final java.util.Map b;

private final byte[] c;

private final moom.LW d;

public Oy(java.lang.String p0, java.util.Map p1, byte[] p2, moom.LW p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


public void run() {
try {
        moom.LU.a(((java.lang.String)(this.a)), ((java.util.Map)(this.b)), ((byte[])(this.c)));
        ((moom.LW)(this.d)).a(((java.lang.String)(this.a)), ((byte[])(this.c)), ((java.lang.Throwable)(null)));
    } catch (java.lang.Exception caught1) {
        ((moom.LW)(this.d)).a(((java.lang.String)(this.a)), ((byte[])(this.c)), ((java.lang.Throwable)(caught1)));
    }
    return;
}


public byte[] a__ArrayByte() {
return this.c;
}


public moom.LW a__LW() {
return this.d;
}


public java.lang.String a() {
return this.a;
}

}
