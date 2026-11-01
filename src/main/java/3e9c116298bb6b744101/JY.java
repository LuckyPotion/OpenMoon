package moom;


public class JY {

private static boolean a;

private static final java.util.BitSet b;

private static final java.util.BitSet c;

private static final long d;

public JY() {
super();
}


static {
d = (moom._c.a(4880641466942255008L, -5188480670796565915L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(7960287495851L);
    b = new java.util.BitSet();
    c = new java.util.BitSet();
}


public static void b(int p0) {
long local1 = (moom.JY.d ^ 13578776298853L);
    if ((p0 >= 0)) {
        ((java.util.BitSet)(moom.JY.c)).set(((int)(p0)));
    }
    return;
}


public static void b() {
((java.util.BitSet)(moom.JY.b)).clear();
    return;
}


public static boolean b__Boolean(int p0) {
int forwardValue2328_13_0;
    int forwardValue2328_17_0;
    int forwardValue2328_19_0;
    int spill2328_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.JY.d ^ 120388583609509L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2328_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2328_13_0 = spill2328_0;
        break forward_join_13;
    }
    if (!((spill2328_0 >= 0))) {
        break forward_join_18;
    }
    forwardValue2328_13_0 = ((((java.util.BitSet)(moom.JY.c)).get(((int)(p0)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2328_17_0 = forwardValue2328_13_0;
        break forward_join_17;
    }
    if (!((forwardValue2328_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue2328_17_0 = 1;
    }
    forwardValue2328_19_0 = forwardValue2328_17_0;
    break forward_join_19;
    }
    forwardValue2328_19_0 = 0;
    }
    return ((forwardValue2328_19_0) != 0);
}


public static void c() {
((java.util.BitSet)(moom.JY.c)).clear();
    return;
}


public static void a() {
moom.JY.a = ((boolean)__sourceIntrinsic_integerToBoolean((((((net.minecraft.client.settings.GameSettings)(moom.BU.a__pw())).ba) ? 1 : 0))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static boolean a__Boolean() {
int forwardValue2326_11_0;
    long life0_3;
    forward_join_11: {
    forward_join_10: {
    life0_3 = (moom.JY.d ^ 81486581180591L);
    if (!(moom.JY.a)) {
        break forward_join_10;
    }
    if (!((!moom.MP.s))) {
        break forward_join_10;
    }
    forwardValue2326_11_0 = 1;
    break forward_join_11;
    }
    forwardValue2326_11_0 = 0;
    }
    return ((forwardValue2326_11_0) != 0);
}


public static void a(int p0) {
long local1 = (moom.JY.d ^ 126467573110285L);
    if ((p0 >= 0)) {
        ((java.util.BitSet)(moom.JY.b)).set(((int)(p0)));
    }
    return;
}


public static void a(java.util.BitSet p0) {
java.util.BitSet forwardValue2325_11_0;
    java.util.BitSet spill2325_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_13: {
    forward_join_11: {
    life1_3 = (moom.JY.d ^ 114593864321531L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2325_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2325_11_0 = spill2325_0;
        break forward_join_11;
    }
    if (!((spill2325_0 != null))) {
        break forward_join_13;
    }
    forwardValue2325_11_0 = moom.JY.b;
    }
    ((java.util.BitSet)(forwardValue2325_11_0)).or(((java.util.BitSet)(p0)));
    }
    return;
}


public static boolean a__Boolean(int p0) {
int forwardValue2327_13_0;
    int forwardValue2327_17_0;
    int forwardValue2327_19_0;
    int spill2327_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.JY.d ^ 133320889922175L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2327_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2327_13_0 = spill2327_0;
        break forward_join_13;
    }
    if (!((spill2327_0 >= 0))) {
        break forward_join_18;
    }
    forwardValue2327_13_0 = ((((java.util.BitSet)(moom.JY.b)).get(((int)(p0)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2327_17_0 = forwardValue2327_13_0;
        break forward_join_17;
    }
    if (!((forwardValue2327_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue2327_17_0 = 1;
    }
    forwardValue2327_19_0 = forwardValue2327_17_0;
    break forward_join_19;
    }
    forwardValue2327_19_0 = 0;
    }
    return ((forwardValue2327_19_0) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
