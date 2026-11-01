package moom;


public class D5 extends moom.D1 {

private final net.minecraft.item.ItemStack c;

private final int d;

private final int e;

private static final long f;

public D5(net.minecraft.item.Item p0, int p1, int p2, int p3, int p4) {
super(p4);
    this.c = new net.minecraft.item.ItemStack(p0, 1, p1);
    this.d = p2;
    this.e = p3;
}


public D5(net.minecraft.item.ItemStack p0, int p1, int p2, int p3) {
super(p3);
    this.c = p0;
    this.d = p1;
    this.e = p2;
}


static {
f = (moom._c.a(9049616764044672984L, -8430022543232562567L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(219346945834919L);
}


public static java.util.List<moom.D5> a(java.util.List<moom.D5> p0, moom.D5[] p1) {
java.lang.Object local2 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(p0)));
    java.util.Collections.addAll(((java.util.Collection)(local2)), ((java.lang.Object[])(p1)));
    return ((java.util.List<moom.D5>)(local2));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static void a(java.util.Random p0, java.util.List<moom.D5> p1, moom.Cm p2, int p3) {
int lexicalValue552_53_0;
    boolean spill552_0;
    int spill552_1;
    long life4_3;
    int life7_6;
    int life6_7;
    moom.D5 life8_15;
    int life9_28;
    net.minecraft.item.ItemStack life10_42;
    int life10_59;
    net.minecraft.item.ItemStack life11_66;
    lexical_join_79: {
    life4_3 = (moom.D5.f ^ 132746610021140L);
    spill552_0 = moom.DS.c__Boolean();
    life7_6 = 0;
    life6_7 = ((spill552_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_53: {
    lexical_join_52: {
    if (!((life7_6 < p3))) {
        break lexical_join_79;
    }
    life8_15 = ((moom.D5)(moom.D0.a(((java.util.Random)(p0)), ((java.util.Collection)(p1)))));
    life9_28 = (((moom.D5)(life8_15)).d + ((java.util.Random)(p0)).nextInt(((int)(((((moom.D5)(life8_15)).e - ((moom.D5)(life8_15)).d) + 1)))));
    spill552_1 = ((net.minecraft.item.ItemStack)(((moom.D5)(life8_15)).c)).a();
    if (!((life6_7 != 0))) {
        lexicalValue552_53_0 = spill552_1;
        break lexical_join_53;
    }
    if (!((spill552_1 >= life9_28))) {
        break lexical_join_52;
    }
    life10_42 = ((net.minecraft.item.ItemStack)(((moom.D5)(life8_15)).c)).a__xW();
    ((net.minecraft.item.ItemStack)(life10_42)).b = ((int)(life9_28));
    ((moom.Cm)(p2)).a__Void(((int)(((java.util.Random)(p0)).nextInt(((int)(((moom.Cm)(p2)).b__Int()))))), ((net.minecraft.item.ItemStack)(life10_42)));
    if (!((life6_7 == 0))) {
        break lexical_join_76;
    }
    }
    lexicalValue552_53_0 = 0;
    }
    life10_59 = lexicalValue552_53_0;
    lexical_cycle_54: while (true) {
    if (!((life10_59 < life9_28))) {
        break lexical_join_76;
    }
    life11_66 = ((net.minecraft.item.ItemStack)(((moom.D5)(life8_15)).c)).a__xW();
    ((net.minecraft.item.ItemStack)(life11_66)).b = ((int)(1));
    ((moom.Cm)(p2)).a__Void(((int)(((java.util.Random)(p0)).nextInt(((int)(((moom.Cm)(p2)).b__Int()))))), ((net.minecraft.item.ItemStack)(life11_66)));
    life10_59 += 1;
    if (!((life6_7 != 0))) {
        break lexical_join_77;
    }
    if (!((life6_7 == 0))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    life7_6 += 1;
    }
    if (!((life6_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public static void a(java.util.Random p0, java.util.List<moom.D5> p1, net.minecraft.inventory.IInventory p2, int p3) {
int lexicalValue553_53_0;
    boolean spill553_0;
    int spill553_1;
    long life4_3;
    int life7_6;
    int life6_7;
    moom.D5 life8_15;
    int life9_28;
    net.minecraft.item.ItemStack life10_42;
    int life10_59;
    net.minecraft.item.ItemStack life11_66;
    lexical_join_79: {
    life4_3 = (moom.D5.f ^ 88758232091513L);
    spill553_0 = moom.DS.b__Boolean();
    life7_6 = 0;
    life6_7 = ((spill553_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_53: {
    lexical_join_52: {
    if (!((life7_6 < p3))) {
        break lexical_join_79;
    }
    life8_15 = ((moom.D5)(moom.D0.a(((java.util.Random)(p0)), ((java.util.Collection)(p1)))));
    life9_28 = (((moom.D5)(life8_15)).d + ((java.util.Random)(p0)).nextInt(((int)(((((moom.D5)(life8_15)).e - ((moom.D5)(life8_15)).d) + 1)))));
    spill553_1 = ((net.minecraft.item.ItemStack)(((moom.D5)(life8_15)).c)).a();
    if (!((life6_7 == 0))) {
        lexicalValue553_53_0 = spill553_1;
        break lexical_join_53;
    }
    if (!((spill553_1 >= life9_28))) {
        break lexical_join_52;
    }
    life10_42 = ((net.minecraft.item.ItemStack)(((moom.D5)(life8_15)).c)).a__xW();
    ((net.minecraft.item.ItemStack)(life10_42)).b = ((int)(life9_28));
    ((net.minecraft.inventory.IInventory)(p2)).a__Void(((int)(((java.util.Random)(p0)).nextInt(((int)(((net.minecraft.inventory.IInventory)(p2)).b__Int()))))), ((net.minecraft.item.ItemStack)(life10_42)));
    if (!((life6_7 != 0))) {
        break lexical_join_76;
    }
    }
    lexicalValue553_53_0 = 0;
    }
    life10_59 = lexicalValue553_53_0;
    lexical_cycle_54: while (true) {
    if (!((life10_59 < life9_28))) {
        break lexical_join_76;
    }
    life11_66 = ((net.minecraft.item.ItemStack)(((moom.D5)(life8_15)).c)).a__xW();
    ((net.minecraft.item.ItemStack)(life11_66)).b = ((int)(1));
    ((net.minecraft.inventory.IInventory)(p2)).a__Void(((int)(((java.util.Random)(p0)).nextInt(((int)(((net.minecraft.inventory.IInventory)(p2)).b__Int()))))), ((net.minecraft.item.ItemStack)(life11_66)));
    life10_59 += 1;
    if (!((life6_7 == 0))) {
        break lexical_join_77;
    }
    if (!((life6_7 != 0))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    life7_6 += 1;
    }
    if (!((life6_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}

}
