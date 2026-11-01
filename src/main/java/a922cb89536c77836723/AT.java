package moom;


public class AT {

private final moom.AZ[] a;

private int b;

private int c;

private static final long d;

public AT(moom.AZ[] p0) {
super();
    this.a = p0;
    this.c = (p0).length;
}


static {
d = (moom._c.a(434975167758611696L, -882319349503301068L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(61154216450817L);
}


public int b() {
return this.b;
}


public void b(int p0) {
this.b = ((int)(p0));
    return;
}


public moom.DR a(net.minecraft.entity.Entity p0, int p1) {
double local3 = (((double) ((moom.AZ)((this.a)[p1])).a) + (((double) ((int) (((net.minecraft.entity.Entity)(p0)).G + 0x1.0p0f))) * 0x1.0p-1d));
    double local5 = ((double) ((moom.AZ)((this.a)[p1])).b);
    double local7 = (((double) ((moom.AZ)((this.a)[p1])).c) + (((double) ((int) (((net.minecraft.entity.Entity)(p0)).G + 0x1.0p0f))) * 0x1.0p-1d));
    return new moom.DR(local3, local5, local7);
}


public moom.DR a(net.minecraft.entity.Entity p0) {
return this.a(((net.minecraft.entity.Entity)(p0)), ((int)(this.b)));
}


public boolean a(moom.AT p0) {
moom.AT lexicalValue469_13_0;
    int lexicalValue469_24_0;
    int lexicalValue469_72_0;
    int lexicalValue469_77_0;
    moom.AT spill469_0;
    int spill469_1;
    int spill469_2;
    int spill469_3;
    int spill469_4;
    long life2_3;
    int[] life4_5;
    int life5_34;
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_24: {
    lexical_join_23: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (moom.AT.d ^ 43813030314436L);
    life4_5 = moom.AV.b__ArrayInt();
    spill469_0 = p0;
    if (!((life4_5 != null))) {
        lexicalValue469_13_0 = spill469_0;
        break lexical_join_13;
    }
    if (!((spill469_0 == null))) {
        break lexical_join_12;
    }
    return ((0) != 0);
    }
    lexicalValue469_13_0 = p0;
    }
    spill469_1 = (((moom.AT)(lexicalValue469_13_0)).a).length;
    if (!((life4_5 != null))) {
        lexicalValue469_24_0 = spill469_1;
        break lexical_join_24;
    }
    if (!((spill469_1 != (this.a).length))) {
        break lexical_join_23;
    }
    return ((0) != 0);
    }
    lexicalValue469_24_0 = 0;
    }
    life5_34 = lexicalValue469_24_0;
    lexical_cycle_25: while (true) {
    lexical_join_73: {
    lexical_join_72: {
    lexical_join_71: {
    if (!((life5_34 < (this.a).length))) {
        break lexical_join_76;
    }
    spill469_2 = ((moom.AZ)((this.a)[life5_34])).a;
    if (!((life4_5 != null))) {
        lexicalValue469_77_0 = spill469_2;
        break lexical_join_77;
    }
    if (!((life4_5 != null))) {
        lexicalValue469_72_0 = spill469_2;
        break lexical_join_72;
    }
    if (!((spill469_2 == ((moom.AZ)((((moom.AT)(p0)).a)[life5_34])).a))) {
        break lexical_join_71;
    }
    spill469_3 = ((moom.AZ)((this.a)[life5_34])).b;
    if (!((life4_5 != null))) {
        lexicalValue469_72_0 = spill469_3;
        break lexical_join_72;
    }
    if (!((spill469_3 == ((moom.AZ)((((moom.AT)(p0)).a)[life5_34])).b))) {
        break lexical_join_71;
    }
    spill469_4 = ((moom.AZ)((this.a)[life5_34])).c;
    if (!((life4_5 != null))) {
        lexicalValue469_72_0 = spill469_4;
        break lexical_join_72;
    }
    if (!((spill469_4 != ((moom.AZ)((((moom.AT)(p0)).a)[life5_34])).c))) {
        break lexical_join_73;
    }
    }
    lexicalValue469_72_0 = 0;
    }
    return ((lexicalValue469_72_0) != 0);
    }
    life5_34 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue469_77_0 = 1;
    }
    return ((lexicalValue469_77_0) != 0);
}


public boolean a(moom.DR p0) {
moom.AZ forwardValue1432_14_0;
    int forwardValue1432_28_0;
    int forwardValue1432_28_1;
    int forwardValue1432_30_0;
    int forwardValue1432_32_0;
    int[] spill1432_0;
    moom.AZ spill1432_1;
    int spill1432_2;
    int spill1432_3;
    int spill1432_4;
    long life2_3;
    moom.AZ life5_7;
    int[] life4_8;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    forward_join_14: {
    life2_3 = (moom.AT.d ^ 139132238388122L);
    spill1432_0 = moom.AV.b__ArrayInt();
    life5_7 = ((moom.AT)(this)).a__AZ();
    life4_8 = spill1432_0;
    spill1432_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue1432_14_0 = spill1432_1;
        break forward_join_14;
    }
    if (!((spill1432_1 != null))) {
        break forward_join_31;
    }
    forwardValue1432_14_0 = life5_7;
    }
    spill1432_2 = ((moom.AZ)(forwardValue1432_14_0)).a;
    spill1432_3 = ((int) ((moom.DR)(p0)).a);
    if (!((life4_8 != null))) {
        forwardValue1432_28_0 = spill1432_2;
        forwardValue1432_28_1 = spill1432_3;
        break forward_join_28;
    }
    if (!((spill1432_2 == spill1432_3))) {
        break forward_join_31;
    }
    spill1432_4 = ((moom.AZ)(life5_7)).c;
    if (!((life4_8 != null))) {
        forwardValue1432_30_0 = spill1432_4;
        break forward_join_30;
    }
    forwardValue1432_28_0 = spill1432_4;
    forwardValue1432_28_1 = ((int) ((moom.DR)(p0)).c);
    }
    if (!((forwardValue1432_28_0 == forwardValue1432_28_1))) {
        break forward_join_31;
    }
    forwardValue1432_30_0 = 1;
    }
    forwardValue1432_32_0 = forwardValue1432_30_0;
    break forward_join_32;
    }
    forwardValue1432_32_0 = 0;
    }
    return ((forwardValue1432_32_0) != 0);
}


public void a__Void() {
this.b += 1;
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.AZ a(int p0) {
return (this.a)[p0];
}


public int a() {
return this.c;
}


public void a__Void(int p0) {
this.c = ((int)(p0));
    return;
}


public moom.AZ a__AZ() {
moom.AT forwardValue1433_12_0;
    moom.AZ forwardValue1433_20_0;
    moom.AT spill1433_0;
    long life1_3;
    int[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_12: {
    life1_3 = (moom.AT.d ^ 39404473811158L);
    life3_5 = moom.AV.b__ArrayInt();
    spill1433_0 = this;
    if (!((life3_5 != null))) {
        forwardValue1433_12_0 = spill1433_0;
        break forward_join_12;
    }
    if (!((((moom.AT)(spill1433_0)).c > 0))) {
        break forward_join_19;
    }
    forwardValue1433_12_0 = this;
    }
    forwardValue1433_20_0 = (((moom.AT)(forwardValue1433_12_0)).a)[(this.c - 1)];
    break forward_join_20;
    }
    forwardValue1433_20_0 = null;
    }
    return forwardValue1433_20_0;
}


public boolean a__Boolean() {
int forwardValue1434_14_0;
    int forwardValue1434_16_0;
    int spill1434_0;
    long life1_3;
    int[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.AT.d ^ 85343785674601L);
    life3_5 = moom.AV.b__ArrayInt();
    spill1434_0 = this.b;
    if (!((life3_5 != null))) {
        forwardValue1434_14_0 = spill1434_0;
        break forward_join_14;
    }
    if (!((spill1434_0 >= this.c))) {
        break forward_join_15;
    }
    forwardValue1434_14_0 = 1;
    }
    forwardValue1434_16_0 = forwardValue1434_14_0;
    break forward_join_16;
    }
    forwardValue1434_16_0 = 0;
    }
    return ((forwardValue1434_16_0) != 0);
}

}
