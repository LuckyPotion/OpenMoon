package moom;


public class zv implements moom.yK<moom.y2> {

private net.minecraft.util.IChatComponent a;

private byte b;

private static final long c;

public zv(net.minecraft.util.IChatComponent p0, byte p1) {
super();
    this.a = p0;
    this.b = p1;
}


public zv(net.minecraft.util.IChatComponent p0) {
this(p0, ((byte) 1));
    return;
}


public zv() {
super();
}


static {
moom.zv.c = (moom._c.a(1472475481918791105L, -4434758340388808491L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(123360843349924L);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((net.minecraft.util.IChatComponent)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zv)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public byte a() {
return this.b;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((net.minecraft.util.IChatComponent)(((net.minecraft.network.PacketBuffer)(p0)).a__C5()));
    this.b = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    return;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zv)(this)));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
return this.a;
}


public boolean a__Boolean() {
int forwardValue4612_19_0;
    int forwardValue4612_21_0;
    byte spill4612_0;
    byte spill4612_1;
    long life1_3;
    int[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.zv.c ^ 102442473537358L);
    life3_5 = moom.zN.b__ArrayInt();
    spill4612_0 = this.b;
    if (!((life3_5 == null))) {
        forwardValue4612_19_0 = ((int)(spill4612_0));
        break forward_join_19;
    }
    if (!((spill4612_0 != 1))) {
        break forward_join_18;
    }
    spill4612_1 = this.b;
    if (!((life3_5 == null))) {
        forwardValue4612_19_0 = ((int)(spill4612_1));
        break forward_join_19;
    }
    if (!((spill4612_1 == 2))) {
        break forward_join_20;
    }
    }
    forwardValue4612_19_0 = 1;
    }
    forwardValue4612_21_0 = forwardValue4612_19_0;
    break forward_join_21;
    }
    forwardValue4612_21_0 = 0;
    }
    return ((forwardValue4612_21_0) != 0);
}



}
