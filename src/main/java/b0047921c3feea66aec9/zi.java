package moom;


public class zi implements moom.yK<moom.y3> {

private int a;

private short b;

private boolean c;

private static final long d;

public zi() {
super();
}


public zi(int p0, short p1, boolean p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


static {
moom.zi.d = (moom._c.a(-5355574025730007128L, -5708139651964755787L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(131781845928912L);
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
net.minecraft.network.PacketBuffer forwardValue4604_23_0;
    int forwardValue4604_23_1;
    net.minecraft.network.PacketBuffer forwardValue4604_24_0;
    net.minecraft.network.PacketBuffer forwardValue4604_25_0;
    int forwardValue4604_25_1;
    boolean spill4604_0;
    net.minecraft.network.PacketBuffer spill4604_1;
    boolean spill4604_2;
    long life2_3;
    int life4_15;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (moom.zi.d ^ 3095189754448L);
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    spill4604_0 = moom.y7.j();
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.b)));
    life4_15 = ((spill4604_0) ? 1 : 0);
    spill4604_1 = p0;
    spill4604_2 = this.c;
    if (!((life4_15 == 0))) {
        forwardValue4604_23_0 = spill4604_1;
        forwardValue4604_23_1 = ((spill4604_2) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill4604_2)) {
        forwardValue4604_24_0 = spill4604_1;
        break forward_join_24;
    }
    forwardValue4604_23_0 = spill4604_1;
    forwardValue4604_23_1 = 1;
    }
    forwardValue4604_25_0 = forwardValue4604_23_0;
    forwardValue4604_25_1 = forwardValue4604_23_1;
    break forward_join_25;
    }
    forwardValue4604_25_0 = forwardValue4604_24_0;
    forwardValue4604_25_1 = 0;
    }
    ((net.minecraft.network.PacketBuffer)(forwardValue4604_25_0)).writeByte(((int)(forwardValue4604_25_1)));
    return;
}


public moom.zi a(short p0) {
this.b = ((short)(p0));
    return this;
}


public moom.zi a(boolean p0) {
this.c = ((boolean)(p0));
    return this;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zi)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zi)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.zi forwardValue4603_21_0;
    int forwardValue4603_21_1;
    moom.zi forwardValue4603_22_0;
    moom.zi forwardValue4603_23_0;
    int forwardValue4603_23_1;
    boolean spill4603_0;
    moom.zi spill4603_1;
    byte spill4603_2;
    long life2_3;
    int life4_13;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.zi.d ^ 127566266417625L);
    spill4603_0 = moom.y7.j();
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.b = ((short)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    life4_13 = ((spill4603_0) ? 1 : 0);
    spill4603_1 = this;
    spill4603_2 = ((net.minecraft.network.PacketBuffer)(p0)).readByte();
    if (!((life4_13 == 0))) {
        forwardValue4603_21_0 = spill4603_1;
        forwardValue4603_21_1 = ((int)(spill4603_2));
        break forward_join_21;
    }
    if (!((spill4603_2 != 0))) {
        forwardValue4603_22_0 = spill4603_1;
        break forward_join_22;
    }
    forwardValue4603_21_0 = spill4603_1;
    forwardValue4603_21_1 = 1;
    }
    forwardValue4603_23_0 = forwardValue4603_21_0;
    forwardValue4603_23_1 = forwardValue4603_21_1;
    break forward_join_23;
    }
    forwardValue4603_23_0 = forwardValue4603_22_0;
    forwardValue4603_23_1 = 0;
    }
    ((moom.zi)(forwardValue4603_23_0)).c = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4603_23_1)));
    return;
}


public int a() {
return this.a;
}


public short a__Short() {
return this.b;
}


public moom.zi a(int p0) {
this.a = ((int)(p0));
    return this;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
