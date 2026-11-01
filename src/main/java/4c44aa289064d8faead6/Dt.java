package moom;


public class Dt {

public int a;

public int b;

private static final long c;

public Dt() {
super();
}


static {
c = (moom._c.a(-1163273451387790719L, 4481941122537939600L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(180233717834088L);
}


public void b() {
org.lwjgl.input.Mouse.setGrabbed(((boolean)(false)));
    org.lwjgl.input.Mouse.setCursorPosition(((int)((org.lwjgl.opengl.Display.getWidth() / 2))), ((int)((org.lwjgl.opengl.Display.getHeight() / 2))));
    return;
}


public void c() {
int forwardValue1771_21_0;
    int forwardValue1771_29_0;
    boolean spill1771_0;
    boolean spill1771_1;
    int spill1771_2;
    long life1_3;
    int life4_6;
    int life5_8;
    int life3_9;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (moom.Dt.c ^ 95604172077502L);
    spill1771_0 = moom.DS.c__Boolean();
    life4_6 = org.lwjgl.input.Mouse.getDX();
    life5_8 = org.lwjgl.input.Mouse.getDY();
    life3_9 = ((spill1771_0) ? 1 : 0);
    spill1771_1 = org.lwjgl.input.Mouse.isIgnoreNextMove();
    if (!((life3_9 != 0))) {
        forwardValue1771_21_0 = ((spill1771_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill1771_1))) {
        break forward_join_20;
    }
    this.a = ((int)(life4_6));
    this.b = ((int)(life5_8));
    }
    forwardValue1771_21_0 = life4_6;
    }
    if (!((life3_9 != 0))) {
        forwardValue1771_29_0 = forwardValue1771_21_0;
        break forward_join_29;
    }
    if (!((forwardValue1771_21_0 == 0))) {
        break forward_join_28;
    }
    spill1771_2 = life5_8;
    if (!((life3_9 != 0))) {
        forwardValue1771_29_0 = spill1771_2;
        break forward_join_29;
    }
    if (!((spill1771_2 != 0))) {
        break forward_join_30;
    }
    }
    forwardValue1771_29_0 = 0;
    }
    org.lwjgl.input.Mouse.setIgnoreNextMove(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue1771_29_0))));
    }
    return;
}


public void a() {
org.lwjgl.input.Mouse.setGrabbed(((boolean)(true)));
    this.a = ((int)(0));
    this.b = ((int)(0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
