package moom;


public class Ah implements moom.yK<moom.y2> {

private int a;

private net.minecraft.item.ItemStack[] b;

private static long c;

public Ah() {
super();
}


public Ah(int p0, java.util.List<net.minecraft.item.ItemStack> p1) { super(); }


private static void __sourceConstructorBody_c6a6fe60e8de9244(moom.Ah receiver, int p0, java.util.List p1) throws Throwable {

net.minecraft.item.ItemStack[] forestValue376_37_0;

    int forestValue376_37_1;

    net.minecraft.item.ItemStack[] forestValue376_38_0;

    int forestValue376_38_1;

    net.minecraft.item.ItemStack forestValue376_38_2;

    net.minecraft.item.ItemStack[] forestValue376_39_0;

    int forestValue376_39_1;

    net.minecraft.item.ItemStack forestValue376_39_2;

    int[] spill376_0;

    net.minecraft.item.ItemStack[] spill376_1;

    int spill376_2;

    net.minecraft.item.ItemStack spill376_3;

    long life3_3;

    int life6_16;

    int[] life5_17;

    net.minecraft.item.ItemStack life7_27;

    forest_join_43: {

    life3_3 = (moom.Ah.c ^ 131445871610392L);

    moom.Ah.__sourceConstructorInit_c6a6fe60e8de9244_0(((moom.Ah)(receiver)));

    ((moom.Ah)(receiver)).a = ((int)(p0));

    spill376_0 = moom.zN.b__ArrayInt();

    ((moom.Ah)(receiver)).b = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[((java.util.List)(p1)).size()]));

    life6_16 = 0;

    life5_17 = spill376_0;

    forest_cycle_18: while (true) {

    forest_join_39: {

    forest_join_38: {

    forest_join_37: {

    if (!((life6_16 < (((moom.Ah)(receiver)).b).length))) {

        break forest_join_43;

    }

    life7_27 = ((net.minecraft.item.ItemStack)(((java.util.List)(p1)).get(((int)(life6_16)))));

    spill376_1 = ((moom.Ah)(receiver)).b;

    spill376_2 = life6_16;

    spill376_3 = life7_27;

    if (!((life5_17 == null))) {

        forestValue376_38_0 = spill376_1;

        forestValue376_38_1 = spill376_2;

        forestValue376_38_2 = spill376_3;

        break forest_join_38;

    }

    if (!((spill376_3 == null))) {

        forestValue376_37_0 = spill376_1;

        forestValue376_37_1 = spill376_2;

        break forest_join_37;

    }

    forestValue376_39_0 = spill376_1;

    forestValue376_39_1 = spill376_2;

    forestValue376_39_2 = null;

    break forest_join_39;

    }

    forestValue376_38_0 = forestValue376_37_0;

    forestValue376_38_1 = forestValue376_37_1;

    forestValue376_38_2 = life7_27;

    }

    forestValue376_39_0 = forestValue376_38_0;

    forestValue376_39_1 = forestValue376_38_1;

    forestValue376_39_2 = ((net.minecraft.item.ItemStack)(forestValue376_38_2)).a__xW();

    }

    (forestValue376_39_0)[forestValue376_39_1] = forestValue376_39_2;

    life6_16 += 1;

    if (!((life5_17 != null))) {

        continue forest_cycle_18;

    }

    break forest_cycle_18;

    }

    }

    return;

}



static {
moom.Ah.c = (moom._c.a(-7216881445610675356L, -2870584951637892519L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(47306021266262L);
}

private static native <E extends Throwable> void __sourceConstructorInit_c6a6fe60e8de9244_0(moom.Ah a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill483_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_17;
    int life6_21;
    int[] life4_22;
    int life7_24;
    net.minecraft.item.ItemStack life8_31;
    lexical_join_38: {
    life2_3 = (moom.Ah.c ^ 25356398723221L);
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)((this.b).length)));
    life5_17 = this.b;
    spill483_0 = moom.zN.b__ArrayInt();
    life6_21 = (life5_17).length;
    life4_22 = spill483_0;
    life7_24 = 0;
    lexical_cycle_25: while (true) {
    if (!((life7_24 < life6_21))) {
        break lexical_join_38;
    }
    life8_31 = (life5_17)[life7_24];
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.item.ItemStack)(life8_31)));
    life7_24 += 1;
    if (!((life4_22 != null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack[] a__ArrayxW() {
return this.b;
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ah)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill482_0;
    long life2_3;
    int[] life4_9;
    int life5_12;
    int life6_18;
    lexical_join_31: {
    life2_3 = (moom.Ah.c ^ 107590230135580L);
    spill482_0 = moom.zN.b__ArrayInt();
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    life4_9 = spill482_0;
    life5_12 = ((net.minecraft.network.PacketBuffer)(p0)).readShort();
    this.b = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[life5_12]));
    life6_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life6_18 < life5_12))) {
        break lexical_join_31;
    }
    (this.b)[life6_18] = ((net.minecraft.network.PacketBuffer)(p0)).a__xW();
    life6_18 += 1;
    if (!((life4_9 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}

}
