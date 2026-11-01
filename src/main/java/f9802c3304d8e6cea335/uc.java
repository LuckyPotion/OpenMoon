package moom;


public abstract class uc {

private int a;

private static boolean b;

public uc() {
super();
}


static {
if (moom.uc.e()) {
        moom.uc.b(((boolean)(true)));
    }
}


public boolean b__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.uc)(this)).a__Boolean())) != 0);
}


public static void b(boolean p0) {
b = ((boolean)(p0));
    return;
}


public void b__Void() {
return;
}


public static boolean e() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.uc.d());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public void c() {
return;
}


public boolean c__Boolean() {
return ((1) != 0);
}


public static boolean d() {
return ((((moom.uc.b) ? 1 : 0)) != 0);
}


private static moom.Oo d(moom.Oo p0) {
return p0;
}


public void a(int p0) {
this.a = ((int)(p0));
    return;
}


public int a() {
return this.a;
}


public abstract boolean a__Boolean();

public void a__Void() {
return;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
