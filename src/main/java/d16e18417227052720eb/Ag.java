package moom;


public class Ag implements moom.yK<moom.y2> {

private int a;

private int b;

private net.minecraft.item.ItemStack c;

private static long d;

public Ag() {
super();
}


public Ag(int p0, int p1, net.minecraft.item.ItemStack p2) { super(); }


private static void __sourceConstructorBody_45abf73024daf687(moom.Ag receiver, int p0, int p1, net.minecraft.item.ItemStack p2) throws Throwable {

moom.Ag forwardValue375_21_0;

    moom.Ag forwardValue375_22_0;

    net.minecraft.item.ItemStack forwardValue375_22_1;

    moom.Ag forwardValue375_23_0;

    net.minecraft.item.ItemStack forwardValue375_23_1;

    int[] spill375_0;

    moom.Ag spill375_1;

    net.minecraft.item.ItemStack spill375_2;

    long life4_3;

    int[] life6_10;

    forward_join_23: {

    forward_join_22: {

    forward_join_21: {

    life4_3 = (moom.Ag.d ^ 3024920065371L);

    moom.Ag.__sourceConstructorInit_45abf73024daf687_0(((moom.Ag)(receiver)));

    spill375_0 = moom.zN.b__ArrayInt();

    ((moom.Ag)(receiver)).a = ((int)(p0));

    life6_10 = spill375_0;

    ((moom.Ag)(receiver)).b = ((int)(p1));

    spill375_1 = receiver;

    spill375_2 = p2;

    if (!((life6_10 == null))) {

        forwardValue375_22_0 = spill375_1;

        forwardValue375_22_1 = spill375_2;

        break forward_join_22;

    }

    if (!((spill375_2 == null))) {

        forwardValue375_21_0 = spill375_1;

        break forward_join_21;

    }

    forwardValue375_23_0 = spill375_1;

    forwardValue375_23_1 = null;

    break forward_join_23;

    }

    forwardValue375_22_0 = forwardValue375_21_0;

    forwardValue375_22_1 = p2;

    }

    forwardValue375_23_0 = forwardValue375_22_0;

    forwardValue375_23_1 = ((net.minecraft.item.ItemStack)(forwardValue375_22_1)).a__xW();

    }

    ((moom.Ag)(forwardValue375_23_0)).c = ((net.minecraft.item.ItemStack)(forwardValue375_23_1));

    return;

}



static {
moom.Ag.d = (moom._c.a(-9141477010211704307L, -770819356845103487L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(217036534391640L);
}

private static native <E extends Throwable> void __sourceConstructorInit_45abf73024daf687_0(moom.Ag a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.item.ItemStack)(this.c)));
    return;
}


public int b() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a__xW() {
return this.c;
}


public int a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.c = ((net.minecraft.item.ItemStack)(((net.minecraft.network.PacketBuffer)(p0)).a__xW()));
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ag)(this)));
    return;
}

}
