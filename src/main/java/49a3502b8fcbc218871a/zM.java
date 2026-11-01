package moom;


public class zM implements moom.yK<moom.y2> {

private int[] a;

private static final long b;

public zM() {
super();
}


public zM(int[] p0) {
super();
    this.a = p0;
}


static {
moom.zM.b = (moom._c.a(-3769327766637614515L, 2642636550829183877L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(194408839779341L);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill1446_0;
    long life2_3;
    int[] life4_10;
    int[] life5_13;
    int life6_16;
    int life7_18;
    int life8_25;
    lexical_join_32: {
    life2_3 = (moom.zM.b ^ 30620545793768L);
    spill1446_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)((this.a).length)));
    life4_10 = spill1446_0;
    life5_13 = this.a;
    life6_16 = (life5_13).length;
    life7_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life7_18 < life6_16))) {
        break lexical_join_32;
    }
    life8_25 = (life5_13)[life7_18];
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(life8_25)));
    life7_18 += 1;
    if (!((life4_10 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zM)(this)));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zM)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public int[] a() {
return this.a;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill1445_0;
    long life2_3;
    int[] life4_10;
    int life5_12;
    lexical_join_27: {
    life2_3 = (moom.zM.b ^ 119900799528289L);
    spill1445_0 = moom.zN.b__ArrayInt();
    this.a = ((int[])(new int[((net.minecraft.network.PacketBuffer)(p0)).a()]));
    life4_10 = spill1445_0;
    life5_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life5_12 < (this.a).length))) {
        break lexical_join_27;
    }
    (this.a)[life5_12] = ((net.minecraft.network.PacketBuffer)(p0)).a();
    life5_12 += 1;
    if (!((life4_10 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}



}
