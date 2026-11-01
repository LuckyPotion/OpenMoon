package moom;


public class y6 implements moom.yK<moom.y3> {

private int a;

private net.minecraft.network.play.client.C02PacketUseEntity$Action b;

private moom.DR c;

private static final long d;

public y6(net.minecraft.entity.Entity p0, moom.DR p1) {
this(p0, net.minecraft.network.play.client.C02PacketUseEntity$Action.INTERACT_AT);
    this.c = p1;
}


public y6(int p0, moom.DR p1) {
this(p0, net.minecraft.network.play.client.C02PacketUseEntity$Action.INTERACT_AT);
    this.c = p1;
}


public y6(int p0, net.minecraft.network.play.client.C02PacketUseEntity$Action p1) {
super();
    this.a = p0;
    this.b = p1;
    this.c = new moom.DR(0x0.0p+0d, 0x0.0p+0d, 0x0.0p+0d);
}


public y6(net.minecraft.entity.Entity p0, net.minecraft.network.play.client.C02PacketUseEntity$Action p1) {
super();
    this.a = (p0).e__Int();
    this.b = p1;
    this.c = new moom.DR(0x0.0p+0d, 0x0.0p+0d, 0x0.0p+0d);
}


public y6() {
super();
}


static {
moom.y6.d = (moom._c.a(-2997060716889628940L, -5209454383184701488L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(57913986121562L);
}


public net.minecraft.network.play.client.C02PacketUseEntity$Action b__bc() {
return this.b;
}


public moom.DR b() {
return this.c;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long life2_3;
    int life4_9;
    forward_join_41: {
    forward_join_34: {
    life2_3 = (moom.y6.d ^ 127545065102807L);
    boolean spill5178_0 = moom.y7.j();
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    life4_9 = ((spill5178_0) ? 1 : 0);
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Enum)(this.b)));
    if (!((life4_9 == 0))) { break forward_join_34; }
    if (!((this.b == net.minecraft.network.play.client.C02PacketUseEntity$Action.INTERACT_AT))) { break forward_join_41; }
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(((float) ((moom.DR)(this.c)).a))));
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(((float) ((moom.DR)(this.c)).b))));
    }
    ((net.minecraft.network.PacketBuffer)(p0)).writeFloat(((float)(((float) ((moom.DR)(this.c)).c))));
    }
    return;
}


public moom.y6 a(moom.DR p0) {
this.c = ((moom.DR)(p0));
    return this;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public int a() {
return this.a;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.y6)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public net.minecraft.network.play.client.C02PacketUseEntity$Action a__bc() {
return this.b;
}


public net.minecraft.entity.Entity a(net.minecraft.world.World p0) {
return ((net.minecraft.world.World)(p0)).a(((int)(this.a)));
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.y6)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.y6 forwardValue4551_23_0;
    boolean spill4551_0;
    moom.y6 spill4551_1;
    long life2_3;
    int life4_15;
    forward_join_36: {
    forward_join_23: {
    life2_3 = (moom.y6.d ^ 3116336221790L);
    spill4551_0 = moom.y7.i();
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((net.minecraft.network.play.client.C02PacketUseEntity$Action)(((net.minecraft.network.play.client.C02PacketUseEntity$Action)(((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.Class)(net.minecraft.network.play.client.C02PacketUseEntity$Action.class)))))));
    life4_15 = ((spill4551_0) ? 1 : 0);
    spill4551_1 = this;
    if (!((life4_15 != 0))) {
        forwardValue4551_23_0 = spill4551_1;
        break forward_join_23;
    }
    if (!((((moom.y6)(spill4551_1)).b == net.minecraft.network.play.client.C02PacketUseEntity$Action.INTERACT_AT))) {
        break forward_join_36;
    }
    forwardValue4551_23_0 = this;
    }
    ((moom.y6)(forwardValue4551_23_0)).c = ((moom.DR)(new moom.DR(((double) ((net.minecraft.network.PacketBuffer)(p0)).readFloat()), ((double) ((net.minecraft.network.PacketBuffer)(p0)).readFloat()), ((double) ((net.minecraft.network.PacketBuffer)(p0)).readFloat()))));
    }
    return;
}


public moom.DR a__DR() {
return this.c;
}


public moom.y6 a(int p0) {
this.a = ((int)(p0));
    return this;
}


public moom.y6 a(net.minecraft.network.play.client.C02PacketUseEntity$Action p0) {
this.b = ((net.minecraft.network.play.client.C02PacketUseEntity$Action)(p0));
    return this;
}



}
