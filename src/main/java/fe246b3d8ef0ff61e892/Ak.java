package moom;


public class Ak implements moom.yK<moom.y2> {

private net.minecraft.world.World a;

private moom.DT b;

private net.minecraft.util.IChatComponent[] c;

private static final long d;

public Ak() {
super();
}


public Ak(net.minecraft.world.World p0, moom.DT p1, net.minecraft.util.IChatComponent[] p2) {
super();
    this.a = ((net.minecraft.world.World)(p0));
    this.b = ((moom.DT)(p1));
    this.c = ((net.minecraft.util.IChatComponent[])(new net.minecraft.util.IChatComponent[] {(p2)[0], (p2)[1], (p2)[2], (p2)[3]}));
    return;
}


static {
moom.Ak.d = (moom._c.a(-9031073767420182616L, 4300559707479572788L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(142834449756452L);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill485_0;
    long life2_3;
    int[] life4_9;
    int life5_11;
    lexical_join_24: {
    life2_3 = (moom.Ak.d ^ 10186989893946L);
    spill485_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).a(((moom.DT)(this.b)));
    life4_9 = spill485_0;
    life5_11 = 0;
    lexical_cycle_12: while (true) {
    if (!((life5_11 < 4))) {
        break lexical_join_24;
    }
    ((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.util.IChatComponent)((this.c)[life5_11])));
    life5_11 += 1;
    if (!((life4_9 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}


public net.minecraft.util.IChatComponent[] a__ArrayC5() {
return this.c;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Ak)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ak)(this)));
    return;
}


public moom.DT a() {
return this.b;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill484_0;
    long life2_3;
    int life5_14;
    int[] life4_15;
    lexical_join_28: {
    life2_3 = (moom.Ak.d ^ 140282854681267L);
    spill484_0 = moom.zN.b__ArrayInt();
    this.b = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.c = ((net.minecraft.util.IChatComponent[])(new net.minecraft.util.IChatComponent[4]));
    life5_14 = 0;
    life4_15 = spill484_0;
    lexical_cycle_16: while (true) {
    if (!((life5_14 < 4))) {
        break lexical_join_28;
    }
    (this.c)[life5_14] = ((net.minecraft.network.PacketBuffer)(p0)).a__C5();
    life5_14 += 1;
    if (!((life4_15 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}



}
