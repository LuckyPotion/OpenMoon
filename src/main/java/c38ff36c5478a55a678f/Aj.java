package moom;


public class Aj implements moom.yK<moom.y2> {

private int a;

private short b;

private boolean c;

public Aj() {
super();
}


public Aj(int p0, short p1, boolean p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public boolean b__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public short b__Short() {
return this.b;
}


public int b() {
return this.a;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((((this.c) ? 1 : 0)))));
    return;
}


public moom.Aj a(short p0) {
this.b = ((short)(p0));
    return this;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.Aj)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


public moom.Aj a(boolean p0) {
this.c = ((boolean)(p0));
    return this;
}


public moom.Aj a(int p0) {
this.a = ((int)(p0));
    return this;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Aj)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    this.b = ((short)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.c = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    return;
}


public int a() {
return this.a;
}


public short a__Short() {
return this.b;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
