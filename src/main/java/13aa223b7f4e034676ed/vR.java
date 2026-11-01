package moom;


public class vR implements net.minecraft.entity.IEntityLivingData {

public int a;

private static int b;

public vR(int p0) {
super();
    this.a = p0;
}


static {
if ((moom.vR.b() == 0)) {
        moom.vR.b(((int)(46)));
    }
}


public static int b() {
return moom.vR.b;
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static int c() {
int local0 = moom.vR.b();
    if ((local0 == 0)) {
        return 33;
    }
    return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
