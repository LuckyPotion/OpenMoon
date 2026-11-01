package moom;


class wJ extends moom.wB {

net.minecraft.entity.passive.EntityHorse f;

moom.wh g;

private static long h;

wJ(moom.wh p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4, net.minecraft.entity.passive.EntityHorse p5) { super((net.minecraft.inventory.IInventory)null, 0, 0, 0); }


private static void __sourceConstructorBody_2ebee2042f20c497(moom.wJ receiver, moom.wh p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4, net.minecraft.entity.passive.EntityHorse p5) throws Throwable {

((moom.wJ)(receiver)).g = ((moom.wh)(p0));

    ((moom.wJ)(receiver)).f = ((net.minecraft.entity.passive.EntityHorse)(p5));

    moom.wJ.__sourceConstructorInit_2ebee2042f20c497_0(((moom.wJ)(receiver)), ((net.minecraft.inventory.IInventory)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));

    return;

}



static {
moom.wJ.h = (moom._c.a(-115984727325538013L, -4081988880119018560L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(255491303088400L);
}

private static native <E extends Throwable> void __sourceConstructorInit_2ebee2042f20c497_0(moom.wJ a0, net.minecraft.inventory.IInventory a1, int a2, int a3, int a4) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.passive.EntityHorse)(this.f)).ar())) != 0);
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue4362_15_0;
    int forwardValue4362_21_0;
    int forwardValue4362_25_0;
    int forwardValue4362_27_0;
    boolean spill4362_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    forward_join_15: {
    life2_3 = (moom.wJ.h ^ 40928047592582L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4362_0 = super.a__Boolean(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4362_15_0 = ((spill4362_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill4362_0)) {
        break forward_join_26;
    }
    forwardValue4362_15_0 = ((((net.minecraft.entity.passive.EntityHorse)(this.f)).ar()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4362_21_0 = forwardValue4362_15_0;
        break forward_join_21;
    }
    if (!((forwardValue4362_15_0 != 0))) {
        break forward_join_26;
    }
    forwardValue4362_21_0 = ((net.minecraft.entity.passive.EntityHorse.a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4362_25_0 = forwardValue4362_21_0;
        break forward_join_25;
    }
    if (!((forwardValue4362_21_0 != 0))) {
        break forward_join_26;
    }
    forwardValue4362_25_0 = 1;
    }
    forwardValue4362_27_0 = forwardValue4362_25_0;
    break forward_join_27;
    }
    forwardValue4362_27_0 = 0;
    }
    return ((forwardValue4362_27_0) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
