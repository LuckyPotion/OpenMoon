package moom;
/** Recovered exception source. All methods are bound to saved component recipes. */
public class b7 extends java.lang.Exception {
    private final java.lang.Object[] a;
    private static boolean b;

    public b7(java.lang.String p0, java.lang.Object... p1) {
    super(p0);
    this.a = p1;
    }
    static {
        if (!c()) {
            b(true);
        }
    }
    public static boolean b() { return b; }
    public static void b(boolean p0) { b = p0; return; }
    public static boolean c() {
        boolean local0 = b();
        if (local0 == false) { return true; }
        return false;
    }
    public java.lang.Object[] a() { return a; }
    private static moom.Oo a(moom.Oo p0) { return p0; }
}
