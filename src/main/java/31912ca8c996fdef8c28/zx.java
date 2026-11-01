package moom;


public class zx implements moom.yK<moom.y2> {

private int a;

private int b;

private net.minecraft.item.ItemStack c;

private static long d;

public zx() {
super();
}


public zx(int p0, int p1, net.minecraft.item.ItemStack p2) { super(); }


private static void __sourceConstructorBody_266ca1852866a3b7(moom.zx receiver, int p0, int p1, net.minecraft.item.ItemStack p2) throws Throwable {

moom.zx forwardValue523_21_0;

    moom.zx forwardValue523_22_0;

    net.minecraft.item.ItemStack forwardValue523_22_1;

    moom.zx forwardValue523_23_0;

    net.minecraft.item.ItemStack forwardValue523_23_1;

    int[] spill523_0;

    moom.zx spill523_1;

    net.minecraft.item.ItemStack spill523_2;

    long life4_3;

    int[] life6_7;

    forward_join_23: {

    forward_join_22: {

    forward_join_21: {

    life4_3 = (moom.zx.d ^ 64633078934475L);

    spill523_0 = moom.zN.b__ArrayInt();

    moom.zx.__sourceConstructorInit_266ca1852866a3b7_0(((moom.zx)(receiver)));

    life6_7 = spill523_0;

    ((moom.zx)(receiver)).a = ((int)(p0));

    ((moom.zx)(receiver)).b = ((int)(p1));

    spill523_1 = receiver;

    spill523_2 = p2;

    if (!((life6_7 == null))) {

        forwardValue523_22_0 = spill523_1;

        forwardValue523_22_1 = spill523_2;

        break forward_join_22;

    }

    if (!((spill523_2 == null))) {

        forwardValue523_21_0 = spill523_1;

        break forward_join_21;

    }

    forwardValue523_23_0 = spill523_1;

    forwardValue523_23_1 = null;

    break forward_join_23;

    }

    forwardValue523_22_0 = forwardValue523_21_0;

    forwardValue523_22_1 = p2;

    }

    forwardValue523_23_0 = forwardValue523_22_0;

    forwardValue523_23_1 = ((net.minecraft.item.ItemStack)(forwardValue523_22_1)).a__xW();

    }

    ((moom.zx)(forwardValue523_23_0)).c = ((net.minecraft.item.ItemStack)(forwardValue523_23_1));

    return;

}



static {
moom.zx.d = (moom._c.a(3147677173767612864L, 4331675106721469140L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(82157162564045L);
}

private static native <E extends Throwable> void __sourceConstructorInit_266ca1852866a3b7_0(moom.zx a0) throws E;

public int b() {
return this.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.item.ItemStack)(this.c)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.c = ((net.minecraft.item.ItemStack)(((net.minecraft.network.PacketBuffer)(p0)).a__xW()));
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zx)(this)));
    return;
}


public net.minecraft.item.ItemStack a__xW() {
return this.c;
}


public int a() {
return this.a;
}

}
