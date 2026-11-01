package com.moon;


public class gG {

private net.minecraft.item.ItemStack a;

private int b;

private static final long c;

public gG() {
super();
}


static {
c = (moom._c.a(6207411457318928649L, 6680041202600983604L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(47348479615452L);
}


public int b() {
net.minecraft.item.ItemStack forwardValue247_13_0;
    int forwardValue247_16_0;
    net.minecraft.item.ItemStack spill247_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.gG.c ^ 73314711220489L);
    life3_5 = com.moon.gF.b__ArrayString();
    spill247_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue247_13_0 = spill247_0;
        break forward_join_13;
    }
    if (!((spill247_0 != null))) {
        break forward_join_15;
    }
    forwardValue247_13_0 = this.a;
    }
    forwardValue247_16_0 = ((net.minecraft.item.ItemStack)(forwardValue247_13_0)).b;
    break forward_join_16;
    }
    forwardValue247_16_0 = 0;
    }
    return forwardValue247_16_0;
}


public boolean a__Boolean() {
long local1 = (com.moon.gG.c ^ 89200403576146L);
    return ((((this.a != null) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a__xW() {
return this.a;
}


public void a(net.minecraft.item.ItemStack p0) {
this.a = ((net.minecraft.item.ItemStack)(p0));
    return;
}


public int a() {
return this.b;
}


public void a(int p0) {
this.b = ((int)(p0));
    return;
}

}
