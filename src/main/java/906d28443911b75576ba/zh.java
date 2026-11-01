package moom;


public class zh implements moom.yK<moom.y3> {

private int a;

private int b;

private int c;

private short d;

private net.minecraft.item.ItemStack e;

private int f;

private static long g;

public zh() {
super();
}


public zh(int p0, int p1, int p2, int p3, net.minecraft.item.ItemStack p4, short p5) { super(); }


private static void __sourceConstructorBody_93414c496621eaec(moom.zh receiver, int p0, int p1, int p2, int p3, net.minecraft.item.ItemStack p4, short p5) throws Throwable {

moom.zh forwardValue520_24_0;

    net.minecraft.item.ItemStack forwardValue520_24_1;

    moom.zh forwardValue520_25_0;

    moom.zh forwardValue520_26_0;

    net.minecraft.item.ItemStack forwardValue520_26_1;

    boolean spill520_0;

    moom.zh spill520_1;

    net.minecraft.item.ItemStack spill520_2;

    long life7_3;

    int life9_7;

    forward_join_26: {

    forward_join_25: {

    forward_join_24: {

    life7_3 = (moom.zh.g ^ 75286334640034L);

    spill520_0 = moom.y7.j();

    moom.zh.__sourceConstructorInit_93414c496621eaec_0(((moom.zh)(receiver)));

    life9_7 = ((spill520_0) ? 1 : 0);

    ((moom.zh)(receiver)).a = ((int)(p0));

    ((moom.zh)(receiver)).b = ((int)(p1));

    ((moom.zh)(receiver)).c = ((int)(p2));

    spill520_1 = receiver;

    spill520_2 = p4;

    if (!((life9_7 == 0))) {

        forwardValue520_24_0 = spill520_1;

        forwardValue520_24_1 = spill520_2;

        break forward_join_24;

    }

    if (!((spill520_2 != null))) {

        forwardValue520_25_0 = spill520_1;

        break forward_join_25;

    }

    forwardValue520_24_0 = spill520_1;

    forwardValue520_24_1 = ((net.minecraft.item.ItemStack)(p4)).a__xW();

    }

    forwardValue520_26_0 = forwardValue520_24_0;

    forwardValue520_26_1 = forwardValue520_24_1;

    break forward_join_26;

    }

    forwardValue520_26_0 = forwardValue520_25_0;

    forwardValue520_26_1 = null;

    }

    ((moom.zh)(forwardValue520_26_0)).e = ((net.minecraft.item.ItemStack)(forwardValue520_26_1));

    ((moom.zh)(receiver)).d = ((short)(p5));

    ((moom.zh)(receiver)).f = ((int)(p3));

    return;

}



static {
moom.zh.g = (moom._c.a(-6093850866793334515L, -6419290676503398940L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(162989549664540L);
}

private static native <E extends Throwable> void __sourceConstructorInit_93414c496621eaec_0(moom.zh a0) throws E;

public int b() {
return this.b;
}


public moom.zh b(int p0) {
this.b = ((int)(p0));
    return this;
}


public short b__Short() {
return this.d;
}


public net.minecraft.item.ItemStack b__xW() {
return this.e;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.f)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.item.ItemStack)(this.e)));
    return;
}


public int e() {
return this.a;
}


public moom.zh c(int p0) {
this.c = ((int)(p0));
    return this;
}


public int c() {
return this.c;
}


public int h() {
return this.f;
}


public int f() {
return this.b;
}


public int d() {
return this.f;
}


public moom.zh d(int p0) {
this.f = ((int)(p0));
    return this;
}


public moom.zh a(net.minecraft.item.ItemStack p0) {
this.e = ((net.minecraft.item.ItemStack)(p0));
    return this;
}


public moom.zh a(short p0) {
this.d = ((short)(p0));
    return this;
}


public short a__Short() {
return this.d;
}


public int a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.d = ((short)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.f = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.e = ((net.minecraft.item.ItemStack)(((net.minecraft.network.PacketBuffer)(p0)).a__xW()));
    return;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zh)(this)));
    return;
}


public moom.zh a(int p0) {
this.a = ((int)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a__xW() {
return this.e;
}


public int g() {
return this.c;
}

}
