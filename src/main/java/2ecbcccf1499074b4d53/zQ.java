package moom;


public class zQ extends moom.zN {

public zQ() {
super();
    this.h = true;
}


public zQ(int p0, byte p1, byte p2, byte p3, byte p4, byte p5, boolean p6) {
super(p0);
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.g = p6;
    this.h = true;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
super.b(((net.minecraft.network.PacketBuffer)(p0)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.f)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    return;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
super.a(((moom.y2)(((moom.y2)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
super.a(((net.minecraft.network.PacketBuffer)(p0)));
    this.b = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.c = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.d = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.e = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.f = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.g = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

public void a(moom.y2 __bridgeParam0) { this.a__sourceBridge_691ab4d076(((moom.yE)(__bridgeParam0))); }
}
