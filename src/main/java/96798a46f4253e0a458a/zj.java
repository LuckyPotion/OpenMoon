package moom;


public class zj implements moom.yK<moom.y3> {

private int a;

private net.minecraft.item.ItemStack b;

private static long c;

public zj() {
super();
}


public zj(int p0, net.minecraft.item.ItemStack p1) { super(); }


private static void __sourceConstructorBody_7181fa4dc6f9d6d0(moom.zj receiver, int p0, net.minecraft.item.ItemStack p1) throws Throwable {

moom.zj forwardValue521_18_0;

    net.minecraft.item.ItemStack forwardValue521_18_1;

    moom.zj forwardValue521_19_0;

    moom.zj forwardValue521_20_0;

    net.minecraft.item.ItemStack forwardValue521_20_1;

    boolean spill521_0;

    moom.zj spill521_1;

    net.minecraft.item.ItemStack spill521_2;

    long life3_3;

    int life5_7;

    forward_join_20: {

    forward_join_19: {

    forward_join_18: {

    life3_3 = (moom.zj.c ^ 47345210931337L);

    spill521_0 = moom.y7.j();

    moom.zj.__sourceConstructorInit_7181fa4dc6f9d6d0_0(((moom.zj)(receiver)));

    life5_7 = ((spill521_0) ? 1 : 0);

    ((moom.zj)(receiver)).a = ((int)(p0));

    spill521_1 = receiver;

    spill521_2 = p1;

    if (!((life5_7 == 0))) {

        forwardValue521_18_0 = spill521_1;

        forwardValue521_18_1 = spill521_2;

        break forward_join_18;

    }

    if (!((spill521_2 != null))) {

        forwardValue521_19_0 = spill521_1;

        break forward_join_19;

    }

    forwardValue521_18_0 = spill521_1;

    forwardValue521_18_1 = ((net.minecraft.item.ItemStack)(p1)).a__xW();

    }

    forwardValue521_20_0 = forwardValue521_18_0;

    forwardValue521_20_1 = forwardValue521_18_1;

    break forward_join_20;

    }

    forwardValue521_20_0 = forwardValue521_19_0;

    forwardValue521_20_1 = null;

    }

    ((moom.zj)(forwardValue521_20_0)).b = ((net.minecraft.item.ItemStack)(forwardValue521_20_1));

    return;

}



static {
moom.zj.c = (moom._c.a(1098799905516126921L, -3191829409863264056L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(127437069413472L);
}

private static native <E extends Throwable> void __sourceConstructorInit_7181fa4dc6f9d6d0_0(moom.zj a0) throws E;

public net.minecraft.item.ItemStack b__xW() {
return this.b;
}


public int b() {
return this.a;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.item.ItemStack)(this.b)));
    return;
}


public moom.zj a(net.minecraft.item.ItemStack p0) {
this.b = ((net.minecraft.item.ItemStack)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zj)(this)));
    return;
}


public int a() {
return this.a;
}


public net.minecraft.item.ItemStack a__xW() {
return this.b;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.b = ((net.minecraft.item.ItemStack)(((net.minecraft.network.PacketBuffer)(p0)).a__xW()));
    return;
}


public moom.zj a(int p0) {
this.a = ((int)(p0));
    return this;
}

}
